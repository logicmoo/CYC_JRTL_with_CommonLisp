/***
 * Java TelnetD library (embeddable telnet daemon)
 * Copyright (c) Dieter Wimberger
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
 * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ***/
package net.wimpi.telnetd.io;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import net.wimpi.telnetd.impl.Activator;

/**
 * Class implementing a terminal reader adapter
 * originally designed for the BeanShell Interpreter.
 * <p/>
 * Provides simple line editing (Backspace, Strg-U and a history).
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class TerminalReader extends Reader {

	protected BasicTerminalIO m_TermIO;
	protected boolean m_Echo = false;
	protected ArrayList m_LineBuffer = new ArrayList(50);
	protected int m_LBCursor = 0;

	public TerminalReader(BasicTerminalIO termio) {
		m_TermIO = termio;
	}//TerminalReader

	/**
	 * Tests if this <tt>TerminalReader</tt> will echo
	 * the character input to the terminal.
	 *
	 * @return true if echo, false otherwise.
	 */
	public boolean isEcho() {
		return m_Echo;
	}//isEcho

	/**
	 * Sets if this <tt>TerminalReader</tt> will echo
	 * the character input to the terminal.
	 * <p/>
	 * This only makes sense in character input mode,
	 * in line mode the terminal will handle editing,
	 * and this is recommended for using a more complex shell.
	 * If you implement your own character based editor, you
	 * might as well change this.<br/>
	 * (Default is false).
	 *
	 * @param echo true if echo, false otherwise.
	 */
	public void setEcho(boolean echo) {
		m_Echo = echo;
	}//setEcho

	public int read(char[] chars, int off, int len) throws IOException {
		m_LBCursor = m_LineBuffer.size();
		m_TermIO.setAutoflushing(true);
		for (int i = off; i < off + len; i++) {
			int ch = m_TermIO.read();
			chars[i] = (char) ch;
			if ((i == off && ch == -1) || ch == 4) {
				return -1;
			}
			if (ch == -1 || ch == 10 || ch == 13) {
				int read = i - off + 1;
				if (m_Echo) {
					m_TermIO.write("\r\n");
				}
				StringBuffer sbuf = new StringBuffer();
				for (int m = off; m < off + read - 1; m++) {
					sbuf.append(chars[m]);
				}
				storeLine(sbuf.toString());
				return read;
			}
			//naive backspace handling
			if (ch == BasicTerminalIO.BACKSPACE || ch == BasicTerminalIO.DELETE) {
				if (i > off) {
					i = i - 2;
					m_TermIO.moveLeft(1);
					m_TermIO.eraseToEndOfLine();
				} else {
					i--;
					m_TermIO.bell();
				}
			} else if (ch == BasicTerminalIO.CTRL_U) {
				m_TermIO.moveLeft(i - off);
				m_TermIO.eraseToEndOfLine();
				i = off - 1;
			} else if (ch == BasicTerminalIO.LEFT || ch == BasicTerminalIO.RIGHT) {
				i--;
				m_TermIO.bell();
			} else if (ch == BasicTerminalIO.UP) {
				String str = prevLine();
				if (str == null) {
					m_TermIO.bell();
					i--;
				} else {
					m_TermIO.moveLeft(i - off);
					m_TermIO.eraseToEndOfLine();
					i = off;
					//fill buffer
					for (int m = 0; m < str.length(); m++) {
						chars[i++] = str.charAt(m);
					}
					i--;
					//print buffer
					m_TermIO.write(str);
				}
			} else if (ch == BasicTerminalIO.DOWN) {
				String str = nextLine();
				if (str == null) {
					m_TermIO.bell();
					i--;
				} else {
					m_TermIO.moveLeft(i - off);
					m_TermIO.eraseToEndOfLine();
					i = off;
					//fill buffer
					for (int m = 0; m < str.length(); m++) {
						chars[i++] = str.charAt(m);
					}
					i--;
					//print buffer
					m_TermIO.write(str);
				}
			} else {
				if (m_Echo) {
					m_TermIO.write(chars[i]);
				}
			}
		}
		return len;
	}//read

	private String prevLine() {
		if (m_LBCursor == 0) {
			return null;
		} else {
			m_LBCursor--;
			return (String) m_LineBuffer.get(m_LBCursor);
		}
	}//prevLine

	private String nextLine() {
		if (m_LBCursor >= m_LineBuffer.size() - 1) {
			return null;
		} else {
			m_LBCursor++;
			return (String) m_LineBuffer.get(m_LBCursor);
		}
	}//nextLine

	private void storeLine(String sbuf) {
		if (m_LineBuffer.size() > 49) {
			m_LineBuffer.remove(0);
		}
		m_LineBuffer.add(sbuf);
	}//storeLine

	public void close() throws IOException {
		Activator.getServices().debug("close()");
	}//close

}//class TerminalReader
