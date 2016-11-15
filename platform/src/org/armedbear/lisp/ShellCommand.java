/*
 * ShellCommand.java
 *
 * Copyright (C) 2000-2005 Peter Graves
 * $Id: ShellCommand.java 12513 2010-03-02 22:35:36Z ehuelsmann $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class ShellCommand implements Runnable {
	private class ReaderThread extends Thread {
		private char[] buf = new char[4096];
		private InputStream inputStream;
		private BufferedReader reader;
		private boolean done = false;

		public ReaderThread(InputStream inputStream) {
			this.inputStream = inputStream;
			this.reader = new BufferedReader(new InputStreamReader(inputStream));
		}

		private String read() {
			StringBuffer sb = new StringBuffer();
			try {
				do {
					int numChars = this.reader.read(this.buf, 0, this.buf.length); // Blocks.
					if (numChars < 0) {
						this.done = true;
						break;
					}
					if (numChars > 0)
						sb.append(this.buf, 0, numChars);
					Thread.sleep(10);
				} while (this.reader.ready());
			} catch (IOException e) {
				return null;
			} catch (InterruptedException e) {
				return null;
			}
			return sb.toString();
		}

		public void run() {
			while (!this.done) {
				String s = this.read();
				if (s == null)
					return;
				ShellCommand.this.processOutput(s);
			}
		}
	}

	// run-shell-command command &key directory (output *standard-output*)
	// ### %run-shell-command command directory output => exit-code
	private static Primitive _RUN_SHELL_COMMAND = new JavaPrimitive("%run-shell-command", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			if (!(Utilities.isPlatformUnix || Utilities.isPlatformWindows))
				return Lisp
						.error(new LispError("run-shell-command not implemented for " + System.getProperty("os.name")));
			else {
				String command = first.getString();
				String namestring = null;
				LispStream outputStream = null;
				if (second != Lisp.NIL) {
					Pathname pathname = Lisp.coerceToPathname(second);
					namestring = pathname.getNamestring();
					if (namestring == null)
						return Lisp.error(
								new FileError("Pathname has no namestring: " + pathname.writeToString(), pathname));
				}
				if (third != Lisp.NIL)
					outputStream = Lisp.checkStream(third);
				ShellCommand shellCommand = new ShellCommand(command, namestring, outputStream);
				shellCommand.run();
				if (outputStream != null)
					outputStream._finishOutput();
				return Lisp.number(shellCommand.exitValue());
			}
		}
	};

	// Does not handle embedded single-quoted strings.
	private static List<String> tokenize(String s) {
		ArrayList<String> list = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		boolean inQuote = false;
		int limit = s.length();
		for (int i = 0; i < limit; i++) {
			char c = s.charAt(i);
			switch (c) {
			case ' ':
				if (inQuote)
					sb.append(c);
				else if (sb.length() > 0) {
					list.add(sb.toString());
					sb.setLength(0);
				}
				break;
			case '"':
				if (inQuote) {
					if (sb.length() > 0) {
						list.add(sb.toString());
						sb.setLength(0);
					}
					inQuote = false;
				} else
					inQuote = true;
				break;
			default:
				sb.append(c);
				break;
			}
		}
		if (sb.length() > 0)
			list.add(sb.toString());
		return list;
	}

	private String command;

	private String directory;

	private LispStream outputStream;

	private StringBuffer output;

	private int exitValue = -1;

	public ShellCommand(String command, String directory, LispStream outputStream)

	{
		this.command = command;
		this.directory = directory;
		this.outputStream = outputStream;
		this.output = outputStream == null ? new StringBuffer() : null;
	}

	int exitValue() {
		return this.exitValue;
	}

	public String getOutput() {
		return this.output != null ? this.output.toString() : "";
	}

	void processOutput(String s) {
		if (this.outputStream != null)
			this.outputStream._writeString(s);
		else
			this.output.append(s);
	}

	public void run() {
		Process process = null;
		try {
			if (this.command != null)
				if (Utilities.isPlatformUnix) {
					if (this.directory != null) {
						StringBuilder sb = new StringBuilder("\\cd \"");
						sb.append(this.directory);
						sb.append("\" && ");
						sb.append(this.command);
						String[] cmdarray = { "/bin/sh", "-c", sb.toString() };
						process = Runtime.getRuntime().exec(cmdarray);
					} else {
						String[] cmdarray = { "/bin/sh", "-c", this.command };
						process = Runtime.getRuntime().exec(cmdarray);
					}
				} else if (Utilities.isPlatformWindows) {
					ArrayList<String> list = new ArrayList<String>();
					list.add("cmd.exe");
					list.add("/c");
					if (this.directory != null) {
						StringBuilder sb = new StringBuilder("cd /d \"");
						sb.append(this.directory);
						sb.append("\" && ");
						sb.append(this.command);
						list.addAll(ShellCommand.tokenize(sb.toString()));
					} else
						list.addAll(ShellCommand.tokenize(this.command));
					int size = list.size();
					String[] cmdarray = new String[size];
					for (int i = 0; i < size; i++)
						cmdarray[i] = list.get(i);
					process = Runtime.getRuntime().exec(cmdarray);
				}
		} catch (IOException e) {
			Debug.trace(e);
		}
		if (process != null) {
			ReaderThread stdoutThread = new ReaderThread(process.getInputStream());
			stdoutThread.start();
			ReaderThread stderrThread = new ReaderThread(process.getErrorStream());
			stderrThread.start();
			try {
				this.exitValue = process.waitFor();
			} catch (InterruptedException e) {
				Debug.trace(e);
			}
			try {
				stdoutThread.join();
			} catch (InterruptedException e) {
				Debug.trace(e);
			}
			try {
				stderrThread.join();
			} catch (InterruptedException e) {
				Debug.trace(e);
			}
		}
	}
}
