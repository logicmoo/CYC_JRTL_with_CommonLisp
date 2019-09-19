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
package net.wimpi.telnetd.io.toolkit;

import java.io.IOException;

import net.wimpi.telnetd.io.BasicTerminalIO;

/**
 * Provides an editfield {@link ActiveComponent}
 * with an underlying smooth scrolling buffer.
 * <p/>
 * The actual input can be hidden using {@link #setHiddenInput(boolean)},
 * which might be useful for password input. The default character
 * for hiding the input is <tt>*</tt>, but it can be changed at runtime
 * using {@link #setHideChar(char)}.
 * </p>
 * <p/>
 * {@link InputFilter} and {@link InputValidator} instances can be set
 * for filtering and validating input.
 * </p>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 * @see InputFilter
 * @see InputValidator
 */
public class Editfield extends ActiveComponent {

	private InputFilter m_InputFilter = null;
	private InputValidator m_InputValidator = null;
	private EditBuffer m_Buffer;
	private boolean m_IgnoreDelete = false;
	private boolean m_HiddenInput = false;
	private boolean m_InError = false;

	public Editfield(BasicTerminalIO io, String name, int length, int maxlength) {
		super(io, name);
		m_Buffer = new EditBuffer(length, maxlength);
		setDimension(new Dimension(length, 1));
	}//constructor

	public Editfield(BasicTerminalIO io, String name, int length) {
		super(io, name);
		m_Buffer = new EditBuffer(length, length);
		setDimension(new Dimension(length, 1));
	}//constructor

	public Editfield(BasicTerminalIO io, String name, Point location, int length, int maxlength) {
		super(io, name, location);
		m_Buffer = new EditBuffer(length, maxlength);
		setDimension(new Dimension(length, 1));
	}//constructor

	public Editfield(BasicTerminalIO io, String name, Point location, int length) {
		super(io, name, location);
		m_Buffer = new EditBuffer(length, length);
		setDimension(new Dimension(length, 1));
	}//constructor

	/**
	 * Returns the visible field length.
	 *
	 * @return int that represents visible length of this <tt>Editfield</tt>.
	 */
	public int getLength() {
		return m_Dim.getWidth();
	}//getLength

	/**
	 * Tests if this <tt>Editfield</tt> ignores <tt>DELETE</tt>.
	 * If this is the case, either <tt>DELETE</tt> or <tt>BACKSPACE</tt>
	 * will be interpreted as <tt>BACKSPACE</tt>.
	 *
	 * @return true if ignoring <tt>DELETE</tt>, false otherwise.
	 */
	public boolean isIgnoreDelete() {
		return m_IgnoreDelete;
	}//isIgnoreDelete

	/**
	 * Sets/Resets this <tt>Editfield</tt> to ignore <tt>DELETE</tt>.
	 * When set, either <tt>DELETE</tt> or <tt>BACKSPACE</tt>
	 * will be interpreted as <tt>BACKSPACE</tt>.
	 *
	 * @param b true to set, false to reset.
	 */
	public void setIgnoreDelete(boolean b) {
		m_IgnoreDelete = true;
	}//setIgnoreDelete

	/**
	 * Tests if this <tt>Editfield</tt> hides the input.
	 * <p/>
	 * The default character for hiding the input is <tt>*</tt>,
	 * but this can be changed at runtime using {@link #setHideChar(char)}.
	 * </p>
	 *
	 * @return true if the input is hidden, false otherwise.
	 */
	public boolean isHiddenInput() {
		return m_HiddenInput;
	}//isHiddenInput

	/**
	 * Sets/Resets this <tt>Editfield</tt> to hide the input.
	 *
	 * @param b true if to set, false otherwise.
	 * @see #setHideChar(char)
	 */
	public void setHiddenInput(boolean b) {
		m_HiddenInput = b;
	}//setHiddenInput

	/**
	 * Sets the character that will be used in hidden mode
	 * for all the characters of the input.
	 * <p/>
	 * The default character for hiding the input is <tt>*</tt>,
	 * but this can be changed at runtime using {@link #setHideChar(char)}.
	 * </p>
	 *
	 * @param c the character to be used to represent the characters of the input.
	 * @see #setHiddenInput(boolean)
	 */
	public void setHideChar(char c) {
		m_Buffer.setHideChar(c);
	}//setHideChar

	/**
	 * Sets an {@link InputFilter} for this <tt>Editfield<tt>.
	 *
	 * @param filter an {@link InputFilter} instance.
	 */
	public void setInputFilter(InputFilter filter) {
		m_InputFilter = filter;
	}//setInputFilter

	/**
	 * Sets an {@link InputValidator} for this <tt>Editfield</tt>.
	 *
	 * @param validator an {@link InputValidator} instance.
	 */
	public void setInputValidator(InputValidator validator) {
		m_InputValidator = validator;
	}//setInputValidator

	/**
	 * Tests if this <tt>Editfield</tt> is in <em>insert mode</em>.
	 *
	 * @return true if in <em>insert mode</em> false otherwise.
	 */
	public boolean isInsertMode() {
		return m_Buffer.isInsertMode();
	}//isInsertMode

	/**
	 * Sets/Resets the <em>insert mode</em> of this <tt>Editfield</tt>.
	 *
	 * @param insertMode true for set, false for reset.
	 */
	public void setInsertMode(boolean insertMode) {
		m_Buffer.setInsertMode(insertMode);
	}//setInsertMode

	/**
	 * Returns the number of input characters in this <tt>Editfield</tt>.
	 *
	 * @return the number of input characters as <tt>int</tt>.
	 */
	public int getSize() {
		return m_Buffer.size();
	}//getSize

	/**
	 * Returns the value (i.e. input) of this <tt>Editfield</tt>.
	 *
	 * @return a <tt>String</tt>.
	 */
	public String getValue() {
		return m_Buffer.toString();
	}//getValue

	/**
	 * Sets the value of this <tt>Editfield</tt> updating
	 * the terminal.
	 * <p/>
	 * Note that an {@link InputFilter} might completely replace
	 * the content of this <tt>Editfield</tt> using this method.
	 * </p>
	 *
	 * @param str the new value.
	 * @throws BufferOverflowException if an edit buffer overflow occurs.
	 * @throws IOException             if an I/O error occurs.
	 */
	public void setValue(String str) throws BufferOverflowException, IOException {
		m_Buffer.setValue(str);
		draw();
		m_IO.flush();
	}//setValue

	/**
	 * Sets the value of this <tt>Editfield</tt> updating
	 * the terminal.
	 * <p/>
	 * Note that an {@link InputFilter} might completely replace
	 * the content of this <tt>Editfield</tt> using this method.
	 * </p>
	 *
	 * @param str the new value.
	 * @param prefix the prefix.
	 * @throws BufferOverflowException if an edit buffer overflow occurs.
	 * @throws IOException             if an I/O error occurs.
	 */
	public void appendValue(String str, String prefix) throws BufferOverflowException, IOException {
		String app = str.substring(prefix.length());
		m_Buffer.setValue(prefix);
		m_Buffer.appendValue(app);
		draw();
		m_IO.flush();
	}//setValue

	public void clear() throws IOException {
		m_Buffer.clear();
		draw();
	}//clear

	/**
	 * Method that will be
	 * reading and processing input.
	 */
	public void run() throws IOException {
		int in = 0;
		int fv = -1;

		storeAutoflush();
		m_IO.setAutoflushing(false);
		draw();
		m_IO.flush();

		try {

			do {

				//log.debug("run():LOOPSTART::done=" + (in==-1));
				//get next key
				in = m_IO.readCharacter();
				//log.debug("run()::in=" + in);

				//Clear old error
				if (m_InError) {
					m_InError = false;
					m_IO.clearError();
				}

				//Just backspace mode, convert deletes to backspace
				if (m_IgnoreDelete && in == BasicTerminalIO.DELETE) {
					in = BasicTerminalIO.BACKSPACE;
				}

				switch (in) {
				case BasicTerminalIO.IO_ERROR:
					in = -1;
					throw new IOException();
				case BasicTerminalIO.LEFT:
					fv = m_Buffer.firstVisible();
					if (!moveLeft()) {
						m_IO.bell();
						m_IO.flush();
						continue;
					} else {
						if (fv == m_Buffer.firstVisible()) {
							continue;
						}
					}
					break;
				case BasicTerminalIO.RIGHT:
					fv = m_Buffer.firstVisible();
					if (!moveRight()) {
						m_IO.bell();
						m_IO.flush();
						continue;
					} else {
						if (fv == m_Buffer.firstVisible()) {
							continue;
						}
					}
					break;
				case BasicTerminalIO.CTRL_A:
					fv = m_Buffer.firstVisible();
					int left = m_Buffer.m_Pos;
					//Start of line
					if (!m_Buffer.toStart()) {
						m_IO.bell();
						m_IO.flush();
						continue;
					} else {
						if (fv == m_Buffer.firstVisible()) {
							//no scrolling involved
							m_IO.moveLeft(left);
							m_IO.flush();
							continue;
						}
					}
					break;
				case BasicTerminalIO.CTRL_E:
					fv = m_Buffer.firstVisible();
					int right = m_Buffer.size() - m_Buffer.m_Pos;
					//end of line
					if (!m_Buffer.toEnd()) {
						m_IO.bell();
						m_IO.flush();
						in = -1;
					} else {
						if (fv == m_Buffer.firstVisible()) {
							//no scrolling involved
							m_IO.moveRight(right);
							m_IO.flush();
							continue;
						}
					}
					break;
				case BasicTerminalIO.CTRL_U:
					//clear line
					clear();
					break;
				case BasicTerminalIO.CTRL_W:
					//clear last word
					if (!m_Buffer.removeLastWord()) {
						m_IO.bell();
						m_IO.flush();
						continue;
					}
					break;
				case BasicTerminalIO.UP:
				case BasicTerminalIO.DOWN:
					m_IO.bell();
					m_IO.flush();
					continue;
				case BasicTerminalIO.ENTER:
					if (m_InputValidator != null) {
						if (m_InputValidator.validate(m_Buffer.toString())) {
							in = -1;
						} else {
							String msg = m_InputValidator.getErrorMessage();
							if (msg != null) {
								m_IO.showError(msg);
								m_InError = true;
							}
							m_IO.bell();
							m_IO.flush();
							continue;
						}
					} else {
						in = -1;
					}
					break;
				case BasicTerminalIO.BACKSPACE:
					if (!m_Buffer.removeLastChar()) {
						m_IO.bell();
						m_IO.flush();
						continue;
					}
					break;
				case BasicTerminalIO.DELETE:
					if (!m_Buffer.removeChar()) {
						m_IO.bell();
						m_IO.flush();
						continue;
					}
					break;
				default:
					//send it through the filter if one is set
					if (m_InputFilter != null) {

						//if (!(m_InputFilter instanceof TabCompletionFilter)) {
						// in = -1;
						//  break;
						//}
						in = m_InputFilter.filterInput(in);

						if (in == InputFilter.INPUT_HANDLED) {
							break;
						} else if (in == InputFilter.INPUT_INVALID) {
							String msg = m_InputFilter.getErrorMessage();
							if (msg != null) {
								m_IO.showError(msg);
								m_InError = true;
							}
							m_IO.bell();
							m_IO.flush();
							continue;
						}
					}

					fv = m_Buffer.firstVisible();
					if (!m_Buffer.putChar((char) in)) {
						m_IO.bell();
						m_IO.flush();
						continue;
					} else {
						if (m_Buffer.atEnd() && fv == m_Buffer.firstVisible()) {
							if (this.m_HiddenInput) {
								m_IO.write(m_Buffer.m_HideChar);
							} else {
								m_IO.write((char) in);
							}
							m_IO.flush();
							continue;
						}
					}
					break;
				}
				if (in != -1) {
					draw();
				} else {
					return;
				}
				//log.debug("run():LOOPEND::done=" + (in == -1));
				m_IO.flush();
			} while (in != -1);

		} catch (IOException ex) {
			throw ex;
		} finally {
			restoreAutoflush();
		}
	}//run

	private boolean moveRight() throws IOException {
		if (!m_Buffer.right()) {
			return false;
		} else {
			m_IO.moveRight(1);
			return true;
		}
	}//moveRight

	private boolean moveLeft() throws IOException {
		if (!m_Buffer.left()) {
			return false;
		} else {
			m_IO.moveLeft(1);
			return true;
		}
	}//moveLeft

	public void draw() throws IOException {
		//m_Buffer.logState("");
		m_IO.setCursor(getLocation());
		if (m_HiddenInput) {
			m_IO.write(m_Buffer.hiddenViewString());
		} else {
			m_IO.write(m_Buffer.viewString());
		}
		m_IO.moveLeft(m_Buffer.remainingVisible());
	}//draw

}//class Editfield
