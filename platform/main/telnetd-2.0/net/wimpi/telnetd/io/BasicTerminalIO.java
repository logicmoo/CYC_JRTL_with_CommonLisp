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

import net.wimpi.telnetd.io.toolkit.Point;

/**
 * Interface that represents the supported
 * terminal oriented low-level I/O capabilities.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
public interface BasicTerminalIO {

	/**
	 * Initializes this I/O.
	 *
	 * @throws IOException if initialization fails.
	 */
	public void initIO() throws IOException;

	/**
	 * Returns the underlying {@link BaseIO} instance.
	 * <p/>
	 * The returned instance be used for raw I/O, when
	 * full control over the streams is required.
	 * Use with care.
	 *
	 * @return a {@link BaseIO} instance.
	 */
	public BaseIO getBaseIO();

	/**
	 * Method that retrieves Input from the underlying
	 * Stream, translating Terminal specific escape
	 * sequences and returning a (constant defined) key,
	 * or a character.
	 *
	 * @return int that represents a constant defined key.
	 * @throws IOException if an I/O Error occurs.
	 */
	public int read() throws IOException;

	/**
	 * Reads a character from the underlying stream, will try to
	 * translate terminal specific escape sequences.
	 *
	 * @return a character.
	 * @throws IOException if an I/O Error occurs.
	 */
	public int readCharacter() throws IOException;

	/**
	 * Method that writes a raw byte to the terminal.
	 *
	 * @param b a <tt>byte</tt> value to be written.
	 * @throws IOException if an I/O Error occurs.
	 */
	public void write(byte b) throws IOException;

	/**
	 * Method that writes a character to the terminal.
	 *
	 * @param ch Character that should be written on the screen
	 * @throws IOException if an I/O Error occurs.
	 */
	public void write(char ch) throws IOException;

	/**
	 * Method that writes a String to the terminal,
	 *
	 * @param str String that should be written to the terminal.
	 * @throws IOException if an I/O Error occurs.
	 */
	public void write(String str) throws IOException;

	/**
	 * Method that places the cursor on the terminal
	 * on the given absolute position.
	 *
	 * @param row Integer that represents the desired row coord.
	 * @param col Integer that represents the desired column coord.
	 * @throws IOException if an I/O Error occurs.
	 */
	public void setCursor(int row, int col) throws IOException;

	/**
	 * Places the cursor on the terminal on the given
	 * absolute position.
	 *
	 * @param p {@link Point} the position for the cursor.
	 * @throws IOException if an I/O Error occurs.
	 */
	public void setCursor(Point p) throws IOException;

	/**
	 * Method that moves the cursor relative from the actual
	 * position given times into a given direction.
	 *
	 * @param direction Constant defined integer.
	 * @param times     Integer that represents the desired column coord.
	 * @throws IOException if an I/O Error occurs.
	 */
	public void moveCursor(int direction, int times) throws IOException;

	/**
	 * Convenience method to move cursor to the right.
	 * Wraps moveCursor method.
	 *
	 * @param times Integer that represents the times the cursor should be moved.
	 * @throws IOException if an I/O Error occurs.
	 * @see BasicTerminalIO#moveCursor
	 */
	public void moveRight(int times) throws IOException;

	/**
	 * Convenience method to move cursor to the left.
	 * Wraps moveCursor method.
	 *
	 * @param times Integer that represents the times the cursor should be moved.
	 * @throws IOException if an I/O Error occurs.
	 * @see BasicTerminalIO#moveCursor
	 */
	public void moveLeft(int times) throws IOException;

	/**
	 * Convenience method to move the cursor up.
	 * Wraps moveCursor method.
	 *
	 * @param times Integer that represents the times the cursor should be moved.
	 * @throws IOException if an I/O Error occurs.
	 * @see BasicTerminalIO#moveCursor
	 */
	public void moveUp(int times) throws IOException;

	/**
	 * Convenience method to move the cursor down.
	 * Wraps moveCursor method.
	 *
	 * @param times Integer that represents the times the cursor should be moved.
	 * @throws IOException if an I/O Error occurs.
	 * @see BasicTerminalIO#moveCursor
	 */
	public void moveDown(int times) throws IOException;

	/**
	 * Method that places the cursor at "home", which is defining
	 * first Row,first Column.
	 * Note that it might be wrapping moveCursor, or be a specific
	 * Escape Sequence.
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void homeCursor() throws IOException;

	/**
	 * Method that stores the actual Cursor position, either client-side,
	 * or if not possible server-side.
	 * <em>Note:</em>
	 * <ul>
	 * <li>This method also stores the GR attributes set at cursor postion.
	 * <li>As of v1.0 this feature works only if supported on client side.
	 * </ul>
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void storeCursor() throws IOException;

	/**
	 * Method that restores the last Cursor position, either client-side,
	 * or if not possible server-side.
	 * <em>Note:</em>
	 * <ul>
	 * <li>This method also stores the GR attributes set at cursor postion.
	 * <li>As of v1.0 this feature works only if supported on client side.
	 * </ul>
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void restoreCursor() throws IOException;

	/**
	 * Method that erases in the line from the actual cursor position
	 * to the end of the line.
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void eraseToEndOfLine() throws IOException;

	/**
	 * Method that erases in the actual line
	 * from the actual cursor position to the beginning of the line.
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void eraseToBeginOfLine() throws IOException;

	/**
	 * Method that erases the entire actual line.
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void eraseLine() throws IOException;

	/**
	 * Method that erases in the terminal screen
	 * from the actual cursor position to the end of the screen.
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void eraseToEndOfScreen() throws IOException;

	/**
	 * Method that erases in the terminal screen
	 * from the actual cursor postition to the beginning of the screen.
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void eraseToBeginOfScreen() throws IOException;

	/**
	 * Method that erases the entire screen.
	 * <em>Note:</em>
	 * <ul>
	 * <li> This does not necessarily affect the actual cursor position.
	 * To ensure homing, use homeCursor() afterwards.
	 * </ul>
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void eraseScreen() throws IOException;

	/**
	 * Method that erases the last character.
	 *
	 * @throws IOException if an I/O error occurs.
	 */
	public void eraseCharacter() throws IOException;

	/**
	 * Method that sets the foreground color for writing to the terminal.
	 *
	 * @param color Integer that represents one of the constant defined colors.
	 * @throws IOException if an I/O Error occurs.
	 */
	public void setForegroundColor(int color) throws IOException;

	/**
	 * Method that sets the background color for writing on the terminal.
	 *
	 * @param color Integer that represents one of the constant defined colors.
	 * @throws IOException if an I/O Error occurs.
	 */
	public void setBackgroundColor(int color) throws IOException;

	/**
	 * Method that sets bold as attribute for writing on the terminal.
	 * The final representation on the terminal might differ by the
	 * terminal type. Most likely it will be represented by extra bright characters.
	 *
	 * @param b Boolean that flags on/off
	 * @throws IOException if an I/O Error occurs.
	 */
	public void setBold(boolean b) throws IOException;

	/**
	 * Method that forces bold as attribute for writing on the terminal.
	 * The final representation on the terminal might differ by the
	 * terminal type. Most likely it will be represented by extra bright characters.
	 * <p/>
	 * This will not be affected by an attribute reset, and will be transmitted
	 * more effectively for mixed style output.
	 *
	 * @param b Boolean that flags on/off
	 */
	public void forceBold(boolean b);

	/**
	 * Sets the flag that determines if the colors are enabled.
	 * @param b true if enabled, false otherwise.
	 */
	public void setColorsEnabled(boolean b);

	/**
	 * Tests the flag that determines if colors are enabled.
	 * @return true if enabled, false otherwise.
	 */
	public boolean isColorsEnabled();

	/**
	 * Method that sets italic as attribute for writing on the terminal.
	 * The final representation on the terminal might differ by the
	 * terminal type.
	 *
	 * @param b Boolean that flags on/off
	 * @throws IOException if an I/O Error occurs.
	 */
	public void setItalic(boolean b) throws IOException;

	/**
	 * Method that sets underlined as attribute for writing on the terminal.
	 * The final representation on the terminal might differ by the
	 * terminal type.
	 *
	 * @param b Boolean that flags on/off
	 * @throws IOException if an I/O Error occurs.
	 */
	public void setUnderlined(boolean b) throws IOException;

	/**
	 * Method that sets blink attribute for writing on the terminal.
	 * The final representation on the terminal might differ by the
	 * terminal type.
	 *
	 * @param b Boolean that flags on/off
	 * @throws IOException if an I/O Error occurs.
	 */
	public void setBlink(boolean b) throws IOException;

	/**
	 * Method that resets <b>all</b> graphic rendition attributes for writing on the
	 * terminal.<p>
	 * <em>Note:<br>
	 * This will affect all attributes. Although these selective resets are defined
	 * in ECMA 048 (the successor of the ANSI X3.64 standard) they are obviously not
	 * implemented for all attributes in standard terminal emulations.
	 * </em>
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void resetAttributes() throws IOException;

	/**
	 * Method that sends a signal to the user. This is defined for
	 * <b>ANY</b> NVT which is part of the internet protocol standard.
	 * The effect on the terminal might differ by the terminal type or
	 * telnet client/terminal emulator implementation.
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void bell() throws IOException;

	/**
	 * Method that will output a header line in error colors for visually
	 * perceiveable error messages to guide users with input errors.
	 *
	 * @param error the string to be displayed.
	 * @throws IOException if an I/O error occurs.
	 */
	public void showError(String error) throws IOException;

	/**
	 * Method that will clear a formerly displayed error.
	 *
	 * @throws IOException
	 * @see #showError(String)
	 */
	public void clearError() throws IOException;

	/**
	 * Method that ensures all written bytes to be send over the
	 * network. If autoflushing is off, this will be necessary to
	 * flush buffered data already written.
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void flush() throws IOException;

	/**
	 * Closes this <tt>BasicTerminalIO</tt>.
	 */
	public void close();

	/**
	 * Sets the terminal to be used for this <tt>BasicTerminalIO</tt>.
	 *
	 * @param terminalname the name of the terminal.
	 * @throws IOException if an I/O Error occurs.
	 * @see net.wimpi.telnetd.impl.TerminalManagerImpl
	 */
	public void setTerminal(String terminalname) throws IOException;

	/**
	 * Sets the default terminal.
	 *
	 * @throws IOException if an I/O Error occurs.
	 * @see net.wimpi.telnetd.impl.TerminalManagerImpl
	 */
	public void setDefaultTerminal() throws IOException;

	/**
	 * Method to retrieve the actual rows on the clients terminal
	 * screen.
	 *
	 * @return int that represents the number of rows.
	 */
	public int getRows();

	/**
	 * Method to retrieve the actual columns on the clients temrinal
	 * screen.
	 *
	 * @return int that represents the number of columns.
	 */
	public int getColumns();

	/**
	 * Request the current cursor position on the terminal.
	 *
	 * @return a {@link Point} instance representing the position of the cursor.
	 * @throws IOException if an I/O Error occurs.
	 */
	public Point getCursorPosition() throws IOException;

	/**
	 * Mutator method for the signalling attribute.
	 *
	 * @param b Boolean that flags on(true) or off(false)
	 */
	public void setSignalling(boolean b);

	/**
	 * Accessor method for checking signalling attribute.
	 *
	 * @return Boolean that represents if signalling is either
	 *         turned on(true) or off(false).
	 */
	public boolean isSignalling();

	/**
	 * Mutator method for the autoflushing mechanism.
	 *
	 * @param b Boolean that flags on(true) or off(false)
	 */
	public void setAutoflushing(boolean b);

	/**
	 * Accessor method for the autoflushing mechanism.
	 *
	 * @return Boolean that represents if autoflushing is either
	 *         turned on(true) or off(false).
	 */
	public boolean isAutoflushing();

	/**
	 * Resets the terminal device.
	 *
	 * @throws IOException if an I/O Error occurs.
	 */
	public void resetTerminal() throws IOException;

	/**
	 * Sets the linewrapping mode.
	 *
	 * @param b true if linewrapping on, false otherwise.
	 * @throws IOException if an I/O Error occurs.
	 */
	public void setLinewrapping(boolean b) throws IOException;

	/**
	 * Tests if terminal is in linewrapping mode.
	 *
	 * @return true if linewrapping, false otherwise.
	 * @throws IOException if an I/O Error occurs.
	 */
	public boolean isLineWrapping() throws IOException;

	/**
	 * Allows to define a scroll region.
	 * EXPERIMENTAL
	 *
	 * @param topmargin    the top margin in rows.
	 * @param bottommargin the bottom margin in rows.
	 * @return true if scrolling supported, false otherwise.
	 * @throws IOException if an I/O error occurs.
	 */
	public boolean defineScrollRegion(int topmargin, int bottommargin) throws IOException;

	//Constants

	/**
	 * I/O Error
	 */
	public static final int IO_ERROR = -1;

	/**
	 * Left (defining a direction on the terminal)
	 */
	public static final int UP = -1001;

	/**
	 * Right (defining a direction on the terminal)
	 */
	public static final int DOWN = -1002;

	/**
	 * Up (defining a direction on the terminal)
	 */
	public static final int RIGHT = -1003;

	/**
	 * Down (defining a direction on the terminal)
	 */
	public static final int LEFT = -1004;

	/**
	 * Paragraph backward.
	 */
	public static final int PARAGRAPH_BACKWARD = -1005;

	/**
	 * Paragraph forward.
	 */
	public static final int PARAGRAPH_FORWARD = -1006;

	/**
	 * Word right.
	 */
	public static final int WORD_FORWARD = -1007;

	/**
	 * Word left.
	 */
	public static final int WORD_BACKWARD = -1008;

	/**
	 * Tabulator (defining the tab key)
	 */
	public static final int TABULATOR = -1301;

	/**
	 * Delete (defining the del key)
	 */
	public static final int DELETE = -1302;

	/**
	 * Backspace (defining the backspace key)
	 */
	public static final int BACKSPACE = -1303;

	/**
	 * Enter (defining the return or enter key)
	 */
	public static final int ENTER = 10;

	/**
	 * Color init (defining ctrl-a atm)
	 */
	public static final int COLORINIT = -1304;

	/**
	 * CTRL-A (equal to COLORINIT).
	 */
	public static final int CTRL_A = COLORINIT;

	/**
	 * CTRL-e
	 */
	public static final int CTRL_E = 5;

	/**
	 * CTRL-n
	 */
	public static final int CTRL_N = 14;

	/**
	 * CTRL-u
	 */
	public static final int CTRL_U = 21;

	/**
	 * CTRL-w
	 */
	public static final int CTRL_W = 23;

	/**
	 * Logout request (defining ctrl-d atm)
	 */
	public static final int LOGOUTREQUEST = -1306;

	/**
	 * Black
	 */
	public static final int BLACK = 30;

	/**
	 * Red
	 */
	public static final int RED = 31;

	/**
	 * Green
	 */
	public static final int GREEN = 32;

	/**
	 * Yellow
	 */
	public static final int YELLOW = 33;

	/**
	 * Blue
	 */
	public static final int BLUE = 34;

	/**
	 * Magenta
	 */
	public static final int MAGENTA = 35;

	/**
	 * Cyan
	 */
	public static final int CYAN = 36;

	/**
	 * White
	 */
	public static final int WHITE = 37;

	/**
	 * CRLF (defining carriage+linebreak which is obligation)
	 */
	public static final String CRLF = "\r\n";

	public void setLineWrapping(boolean b) throws IOException;

	//	public void setLineWrapping(boolean b) throws IOException;

}//interface BasicTerminalIO
