/* For LarKC */
package com.cyc.tool.subl.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class TextAreaInputStream extends InputStream implements KeyListener {
	public TextAreaInputStream(JTextArea textArea) {
		charReady = false;
		command = null;
		commandIndex = 0;
		(this.textArea = textArea).addKeyListener(this);
	}

	public static void main(String[] args) {
	}

	private JTextArea textArea;
	private volatile boolean charReady;
	private String command;
	int commandIndex;

	@Override
	public synchronized int available() throws IOException {
		if (command == null)
			return 0;
		return command.length() - commandIndex;
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == '\n') {
			if (command != null)
				Errors.error("Got bad key event: " + e);
			Runnable runnable = new SafeRunnable() {
				@Override
				public void safeRun() {
					String tempStr = textArea.getText();
					if (ReaderUtilities.shouldProcessSubLStatementNow(tempStr))
						synchronized (TextAreaInputStream.this) {
							command = tempStr.endsWith("\n") ? tempStr : tempStr + "\n";
							commandIndex = 0;
							charReady = true;
							textArea.setText("");
							TextAreaInputStream.this.notify();
						}
				}
			};
			SwingUtilities.invokeLater(runnable);
		}
	}

	@Override
	public synchronized int read() throws IOException {
		if (!charReady)
			try {
				this.wait();
			} catch (Exception ex) {
			}
		int theChar = command.charAt(commandIndex++);
		char theRealChar = (char) theChar;
		if (commandIndex >= command.length()) {
			command = null;
			commandIndex = 0;
			charReady = false;
		}
		return theChar;
	}

	@Override
	public synchronized int read(byte[] b, int off, int len) throws IOException {
		if (b == null)
			throw new NullPointerException();
		if (off < 0 || off > b.length || len < 0 || off + len > b.length || off + len < 0)
			throw new IndexOutOfBoundsException();
		if (len == 0)
			return 0;
		int c = this.read();
		if (c == -1)
			return -1;
		b[off] = (byte) c;
		if (available() <= 0)
			return 1;
		int i = 1;
		try {
			while (i < len) {
				c = this.read();
				char theChar = (char) c;
				if (c == -1)
					break;
				if (b != null)
					b[off + i] = (byte) c;
				if (available() <= 0)
					return i + 1;
				++i;
			}
		} catch (IOException ex) {
		}
		return i;
	}
}
