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

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

//// Internal Imports

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class TextAreaOutputStream extends OutputStream {

	//// Constructors

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	//// Public Area

	private JTextArea textArea;

	private JScrollPane scrollPane;

	//// Protected Area

	//// Private Area

	private boolean isScolledToBottom;
	//// Main

	/**
	 * Creates a new instance of TextAreaOutputStream which writes to the
	 * specified instance of javax.swing.JTextArea control.
	 *
	 * @param textArea
	 *            A reference to the javax.swing.JTextArea control to which the
	 *            output must be redirected to.
	 */
	public TextAreaOutputStream(JTextArea textArea, JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
		this.textArea = textArea;
	}

	//// Internal Rep

	private boolean isScolledToBottom() {
		JScrollBar sb = this.scrollPane.getVerticalScrollBar();
		int currentValue = sb.getValue();
		int maxValue = sb.getMaximum();
		int extent = sb.getVisibleAmount();
		boolean isAtBottom = currentValue >= maxValue - extent;
		// if (!isAtBottom)
		/*
		 * System.out.println("current value: " + currentValue);
		 * System.out.println("max value: " + maxValue);
		 * System.out.println("extent: " + extent);
		 */
		// int i = 0;
		return isAtBottom;
	}

	private void scrollTextAreaToBottom() {
		JScrollBar sb = this.scrollPane.getVerticalScrollBar();
		sb.setValue(sb.getMaximum());
	}

	/**
	 * Writes <code>len</code> bytes from the specified byte array starting at
	 * offset <code>off</code> to this output stream. The general contract for
	 * <code>write(b, off, len)</code> is that some of the bytes in the array
	 * <code>b</code> are written to the output stream in order; element
	 * <code>b[off]</code> is the first byte written and
	 * <code>b[off+len-1]</code> is the last byte written by this operation.
	 * <p>
	 * The <code>write</code> method of <code>OutputStream</code> calls the
	 * write method of one argument on each of the bytes to be written out.
	 * Subclasses are encouraged to override this method and provide a more
	 * efficient implementation.
	 * <p>
	 * If <code>b</code> is <code>null</code>, a
	 * <code>NullPointerException</code> is thrown.
	 * <p>
	 * If <code>off</code> is negative, or <code>len</code> is negative, or
	 * <code>off+len</code> is greater than the length of the array
	 * <code>b</code>, then an <tt>IndexOutOfBoundsException</tt> is thrown.
	 *
	 * @param b
	 *            the data.
	 * @param off
	 *            the start offset in the data.
	 * @param len
	 *            the number of bytes to write.
	 * @exception IOException
	 *                if an I/O error occurs. In particular, an
	 *                <code>IOException</code> is thrown if the output stream is
	 *                closed.
	 */
	public void write(byte b[], int off, int len) throws IOException {
		// boolean isScolledToBottom;
		this.isScolledToBottom = true;
		try {
			SwingUtilities.invokeAndWait(new SafeRunnable() {
				public void safeRun() {
					TextAreaOutputStream.this.isScolledToBottom = TextAreaOutputStream.this.isScolledToBottom();
				}
			});
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		} catch (Exception e) {
			Errors.handleError("Error while scrolling GUI read/eval loop panel.", e);
		}
		if (b == null)
			throw new NullPointerException();
		else if (off < 0 || off > b.length || len < 0 || off + len > b.length || off + len < 0)
			throw new IndexOutOfBoundsException();
		else if (len == 0)
			return;
		this.textArea.append(new String(b, off, len));
		/*
		 * try { Thread.currentThread().sleep(100); } catch
		 * (InterruptedException ie) { Thread.currentThread().interrupt(); }
		 */
		if (this.isScolledToBottom)
			SwingUtilities.invokeLater(new SafeRunnable() {
				public void safeRun() {
					TextAreaOutputStream.this.scrollTextAreaToBottom();
				}
			});
	}

	/**
	 * Writes the specified byte as a character to the javax.swing.JTextArea.
	 *
	 * @param b
	 *            The byte to be written as character to the JTextArea.
	 */
	public void write(int b) throws IOException {
		// append the data as characters to the JTextArea control
		this.textArea.append(String.valueOf((char) b));
	}

}
