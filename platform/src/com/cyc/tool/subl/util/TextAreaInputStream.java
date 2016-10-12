/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

//// Internal Imports

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class TextAreaInputStream extends InputStream implements KeyListener {

	//// Constructors

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	//// Public Area

	private JTextArea textArea;

	private volatile boolean charReady = false;

	private String command = null;

	int commandIndex = 0;

	/**
	 * Creates a new instance of TextAreaOutputStream which writes to the
	 * specified instance of javax.swing.JTextArea control.
	 *
	 * @param control
	 *            A reference to the javax.swing.JTextArea control to which the
	 *            output must be redirected to.
	 */
	public TextAreaInputStream(JTextArea textArea) {
		this.textArea = textArea;
		textArea.addKeyListener(this);
	}

	/*
	 * Returns the number of bytes that can be read(or skipped over) from this
	 * input stream without blocking by the next caller of a method for this
	 * input stream. The next caller might be the same thread or or another
	 * thread.
	 *
	 * <p> The <code>available</code> method for class <code>InputStream</code>
	 * always returns <code>0</code>.
	 *
	 * <p> This method should be overridden by subclasses.
	 *
	 * @return the number of bytes that can be read from this input stream
	 * without blocking.
	 *
	 * @exception IOException if an I/O error occurs.
	 */
	public synchronized int available() throws IOException {
		if (this.command == null)
			return 0;
		return this.command.length() - this.commandIndex;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == '\n') {
			if (this.command != null)
				Errors.error("Got bad key event: " + e);
			final TextAreaInputStream tais = this;
			Runnable runnable = new SafeRunnable() {
				public void safeRun() {
					String tempStr = TextAreaInputStream.this.textArea.getText();
					if (ReaderUtilities.shouldProcessSubLStatementNow(tempStr))
						synchronized (tais) {
							TextAreaInputStream.this.command = tempStr.endsWith("\n") ? tempStr : tempStr + "\n";
							TextAreaInputStream.this.commandIndex = 0;
							TextAreaInputStream.this.charReady = true;
							TextAreaInputStream.this.textArea.setText("");
							tais.notify();
						}
				}
			};
			SwingUtilities.invokeLater(runnable);
		}
	}

	/**
	 * Reads the next byte of data from the input stream. The value byte is
	 * returned as an <code>int</code> in the range <code>0</code> to
	 * <code>255</code>. If no byte is ava0ilable because the end of the stream
	 * has been reached, the value <code>-1</code> is returned. This method
	 * blocks until input data is available, the end of the stream is detected,
	 * or an exception is thrown.
	 *
	 * <p>
	 * A subclass must provide an implementation of this method.
	 *
	 * @return the next byte of data, or <code>-1</code> if the end of the
	 *         stream is reached.
	 * @exception IOException
	 *                if an I/O error occurs.
	 */
	public synchronized int read() throws IOException {
		if (!this.charReady)
			try {
				this.wait();
			} catch (Exception e) {
			}
		int theChar = this.command.charAt(this.commandIndex++);
		char theRealChar = (char) theChar;
		if (this.commandIndex >= this.command.length()) {
			this.command = null;
			this.commandIndex = 0;
			this.charReady = false;
		}
		return theChar;
	}

	//// Main

	/**
	 * Reads up to <code>len</code> bytes of data from the input stream into an
	 * array of bytes. An attempt is made to read as many as <code>len</code>
	 * bytes, but a smaller number may be read, possibly zero. The number of
	 * bytes actually read is returned as an integer.
	 *
	 * <p>
	 * This method blocks until input data is available, end of file is
	 * detected, or an exception is thrown.
	 *
	 * <p>
	 * If <code>b</code> is <code>null</code>, a
	 * <code>NullPointerException</code> is thrown.
	 *
	 * <p>
	 * If <code>off</code> is negative, or <code>len</code> is negative, or
	 * <code>off+len</code> is greater than the length of the array
	 * <code>b</code>, then an <code>IndexOutOfBoundsException</code> is thrown.
	 *
	 * <p>
	 * If <code>len</code> is zero, then no bytes are read and <code>0</code> is
	 * returned; otherwise, there is an attempt to read at least one byte. If no
	 * byte is available because the stream is at end of file, the value
	 * <code>-1</code> is returned; otherwise, at least one byte is read and
	 * stored into <code>b</code>.
	 *
	 * <p>
	 * The first byte read is stored into element <code>b[off]</code>, the next
	 * one into <code>b[off+1]</code>, and so on. The number of bytes read is,
	 * at most, equal to <code>len</code>. Let <i>k</i> be the number of bytes
	 * actually read; these bytes will be stored in elements <code>b[off]</code>
	 * through <code>b[off+</code><i>k</i><code>-1]</code>, leaving elements
	 * <code>b[off+</code><i>k</i><code>]</code> through
	 * <code>b[off+len-1]</code> unaffected.
	 *
	 * <p>
	 * In every case, elements <code>b[0]</code> through <code>b[off]</code> and
	 * elements <code>b[off+len]</code> through <code>b[b.length-1]</code> are
	 * unaffected.
	 *
	 * <p>
	 * If the first byte cannot be read for any reason other than end of file,
	 * then an <code>IOException</code> is thrown. In particular, an
	 * <code>IOException</code> is thrown if the input stream has been closed.
	 *
	 * <p>
	 * The <code>read(b,</code> <code>off,</code> <code>len)</code> method for
	 * class <code>InputStream</code> simply calls the method
	 * <code>read()</code> repeatedly. If the first such call results in an
	 * <code>IOException</code>, that exception is returned from the call to the
	 * <code>read(b,</code> <code>off,</code> <code>len)</code> method. If any
	 * subsequent call to <code>read()</code> results in a
	 * <code>IOException</code>, the exception is caught and treated as if it
	 * were end of file; the bytes read up to that point are stored into
	 * <code>b</code> and the number of bytes read before the exception occurred
	 * is returned. Subclasses are encouraged to provide a more efficient
	 * implementation of this method.
	 *
	 * @param b
	 *            the buffer into which the data is read.
	 * @param off
	 *            the start offset in array <code>b</code> at which the data is
	 *            written.
	 * @param len
	 *            the maximum number of bytes to read.
	 * @return the total number of bytes read into the buffer, or
	 *         <code>-1</code> if there is no more data because the end of the
	 *         stream has been reached.
	 * @exception IOException
	 *                if an I/O error occurs.
	 * @exception NullPointerException
	 *                if <code>b</code> is <code>null</code>.
	 * @see java.io.InputStream#read()
	 */
	public synchronized int read(byte b[], int off, int len) throws IOException {
		if (b == null)
			throw new NullPointerException();
		else if (off < 0 || off > b.length || len < 0 || off + len > b.length || off + len < 0)
			throw new IndexOutOfBoundsException();
		else if (len == 0)
			return 0;

		int c = this.read();
		if (c == -1)
			return -1;
		b[off] = (byte) c;
		if (this.available() <= 0)
			return 1;

		int i = 1;
		try {
			for (; i < len; i++) {
				c = this.read();
				char theChar = (char) c;
				if (c == -1)
					break;
				if (b != null)
					b[off + i] = (byte) c;
				if (this.available() <= 0)
					return i + 1;
			}
		} catch (IOException ee) {
		}
		return i;
	}

}
