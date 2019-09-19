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

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.collections.buffer.BoundedFifoBuffer;

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.impl.TerminalManagerImpl;
import net.wimpi.telnetd.io.terminal.ColorHelper;
import net.wimpi.telnetd.io.terminal.NoSuchTerminalException;
import net.wimpi.telnetd.io.terminal.Terminal;
import net.wimpi.telnetd.io.toolkit.Point;
import net.wimpi.telnetd.io.toolkit.Titlebar;
import net.wimpi.telnetd.net.Connection;
import net.wimpi.telnetd.net.ConnectionData;
import net.wimpi.telnetd.net.ConnectionEvent;
import net.wimpi.telnetd.service.TerminalManager;
import net.wimpi.telnetd.util.Mutex;
import net.wimpi.telnetd.util.ReentrantLock;

/**
 * Class for Terminal specific I/O.
 * It represents the layer between the application layer and the generic telnet I/O.
 * Terminal specific I/O is achieved via pluggable terminal classes
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 * @see net.wimpi.telnetd.io.TelnetIO
 * @see net.wimpi.telnetd.io.terminal.Terminal
 */
public class TerminalIO implements BasicTerminalIO {

	private TerminalManager m_TerminalManager = Activator.getTerminalManager();

	private BaseIO m_BaseIO; //low level I/O

	private Connection m_Connection; //the connection this instance is working for
	private ConnectionData m_ConnectionData; //holds data of the connection
	private Terminal m_Terminal; //active terminal object

	private boolean m_AcousticSignalling; //flag for accoustic signalling
	private boolean m_Autoflush; //flag for autoflushing mode
	private boolean m_ForceBold; //flag for forcing bold output
	private boolean m_LineWrapping;
	private ByteArrayOutputStream m_EscapeBout = new ByteArrayOutputStream();
	private ReentrantLock m_WriteLock;
	private Mutex m_ReadLock;
	private BoundedFifoBuffer m_Buffer = new BoundedFifoBuffer();
	private boolean m_GettingCursor = false;

	/**
	 * Constructor of the TerminalIO class.
	 *
	 * @param con Connection the instance will be working for
	 */
	public TerminalIO(Connection con) {
		m_Connection = con;
		m_AcousticSignalling = true;
		m_Autoflush = true;
		m_WriteLock = new ReentrantLock();
		m_ReadLock = new Mutex();
		//store the associated  ConnectionData instance
		m_ConnectionData = m_Connection.getConnectionData();
	}//constructor

	public void initIO() throws IOException {
		if (!m_ConnectionData.isSecure()) {
			try {
				//create a new telnet io
				m_BaseIO = new TelnetIO();
				m_BaseIO.setConnection(m_Connection);
				m_BaseIO.initIO();
			} catch (Exception ex) {
				Activator.getServices().error("TerminalIO(Connection)", ex);
				throw (IOException) new IOException("Failed to initialize I/O.").initCause(ex);
			}
		} else {
			try {
				//create a new stream io
				m_BaseIO = new StreamIO();
				m_BaseIO.setConnection(m_Connection);
				m_BaseIO.initIO();
			} catch (Exception ex) {
				Activator.getServices().error("TerminalIO(Connection)", ex);
				throw (IOException) new IOException("Failed to initialize I/O.").initCause(ex);
			}
		}

		//set default terminal
		try {
			setDefaultTerminal();
		} catch (Exception ex) {
			Activator.getServices().error("TerminalIO()", ex);
			throw new RuntimeException();
		}

	}//init

	public BaseIO getBaseIO() {
		return m_BaseIO;
	}//getBaseIO

	//*** Visible character I/O methods ***/

	/**
	 * Read a single character and take care for terminal function calls.
	 *
	 * @return <ul>
	 *         <li>character read
	 *         <li>IOERROR in case of an error
	 *         <li>DELETE,BACKSPACE,TABULATOR,ESCAPE,COLORINIT,LOGOUTREQUEST
	 *         <li>UP,DOWN,LEFT,RIGHT
	 *         </ul>
	 */
	public int read() throws IOException {
		try {
			m_ReadLock.acquire();
			int i = -1;
			if (!m_GettingCursor && m_Buffer.size() > 0) {
				i = ((Integer) m_Buffer.remove()).intValue();
			} else {
				i = m_BaseIO.read();
			}
			//translate possible control sequences
			i = m_Terminal.translateControlCharacter(i);

			//catch & fire a logoutrequest event
			if (i == LOGOUTREQUEST) {
				m_Connection.processConnectionEvent(new ConnectionEvent(m_Connection, ConnectionEvent.CONNECTION_LOGOUTREQUEST));
				i = HANDLED;
			} else if (i < -1 && i == ESCAPE) {
				//translate an incoming escape sequence
				i = handleEscapeSequence();
			}

			//return i holding a char or a defined special key
			return i;
		} catch (InterruptedException ex) {
			return -1;
		} finally {
			m_ReadLock.release();
		}
	}//read

	public int readCharacter() throws IOException {
		try {
			m_ReadLock.acquire();
			int i = -1;
			if (!m_GettingCursor && m_Buffer.size() > 0) {
				i = ((Integer) m_Buffer.remove()).intValue();
			} else {
				i = m_BaseIO.readCharacter();
			}
			//translate possible control sequences
			i = m_Terminal.translateControlCharacter(i);

			//catch & fire a logoutrequest event
			if (i == LOGOUTREQUEST) {
				m_Connection.processConnectionEvent(new ConnectionEvent(m_Connection, ConnectionEvent.CONNECTION_LOGOUTREQUEST));
				i = HANDLED;
			} else if (i < -1 && i == ESCAPE) {
				m_EscapeBout.reset();
				//1. read until letter, which should finish a sequence
				int c = -1;
				while (!m_Terminal.isEscSeqTerminator(c = m_BaseIO.readCharacter())) {
					m_EscapeBout.write(c);
					if (m_EscapeBout.size() == m_Terminal.getMaxEscSeqLength()) {
						break;
					}
				}
				//System.out.println("readCharacter()::terminator=" + (char) c + "::bytes=" + new String(m_EscapeBout.toByteArray()));
				i = m_Terminal.translateEscapeSequence(m_EscapeBout.toByteArray(), c);
				//System.out.println("readCharacter()::i=" + i);
			}

			//return i holding a char or a defined special key
			return i;
		} catch (InterruptedException ex) {
			return -1;
		} finally {
			m_ReadLock.release();
		}
	}//readCharacter

	public void write(byte b) throws IOException {
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(b);
			if (m_Autoflush) {
				flush();
			}
		} catch (InterruptedException ex) {
			Activator.getServices().error("write(byte)", ex);
		} finally {
			m_WriteLock.release();
		}
	}//write

	public void write(char ch) throws IOException {
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(ch);
			if (m_Autoflush) {
				flush();
			}
		} catch (InterruptedException ex) {
			Activator.getServices().error("write(char)", ex);
		} finally {
			m_WriteLock.release();
		}
	}//write(char)

	public void write(String str) throws IOException {
		try {
			m_WriteLock.acquire();
			if (m_ForceBold) {
				m_BaseIO.write(m_Terminal.formatBold(str));
			} else {
				m_BaseIO.write(m_Terminal.format(str));
			}
			if (m_Autoflush) {
				flush();
			}
		} catch (InterruptedException ex) {
			Activator.getServices().error("write(String)", ex);
		} finally {
			m_WriteLock.release();
		}
	}//write(String)

	//**** End of Visible character I/O methods  ***************************//

	//*** Erase methods ****************************************************//

	public void eraseToEndOfLine() throws IOException {
		doErase(EEOL);
	}//eraseToEndOfLine

	public void eraseToBeginOfLine() throws IOException {
		doErase(EBOL);
	}//eraseToBeginOfLine

	public void eraseLine() throws IOException {
		doErase(EEL);
	}//eraseLine

	public void eraseToEndOfScreen() throws IOException {
		doErase(EEOS);
	}//eraseToEndOfScreen

	public void eraseToBeginOfScreen() throws IOException {
		doErase(EBOS);
	}//eraseToBeginOfScreen

	public void eraseScreen() throws IOException {
		doErase(EES);
	}//eraseScreen

	/**
	 * Method that erases the last character.
	 *
	 * @throws IOException if an I/O error occurs.
	 */
	public void eraseCharacter() throws IOException {
		write((byte) BS);
	}//eraseCharacter

	private void doErase(int funcConst) throws IOException {
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(m_Terminal.getEraseSequence(funcConst));
			if (m_Autoflush) {
				flush();
			}
		} catch (InterruptedException ex) {
			Activator.getServices().error("doErase(int)", ex);
		} finally {
			m_WriteLock.release();
		}
	}//erase

	//***  End of Erase methods ****//

	//***  Cursor related methods	***//

	public void moveCursor(int direction, int times) throws IOException {
		//catch bogus moves
		if (times <= 0 || (direction != LEFT && direction != RIGHT && direction != UP && direction != DOWN)) {
			return;
		}
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(m_Terminal.getCursorMoveSequence(direction, times));
			if (m_Autoflush) {
				flush();
			}
		} catch (InterruptedException ex) {
			Activator.getServices().error("moveCursor(int,int)", ex);
		} finally {
			m_WriteLock.release();
		}
	}//moveCursor

	public void moveLeft(int times) throws IOException {
		moveCursor(LEFT, times);
	}//moveLeft

	public void moveRight(int times) throws IOException {
		moveCursor(RIGHT, times);
	}//moveRight

	public void moveUp(int times) throws IOException {
		moveCursor(UP, times);
	}//moveUp

	public void moveDown(int times) throws IOException {
		moveCursor(DOWN, times);
	}//moveDown

	public void setCursor(int row, int col) throws IOException {
		int[] pos = new int[2];
		pos[0] = row;
		pos[1] = col;
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(m_Terminal.getCursorPositioningSequence(pos));
			if (m_Autoflush) {
				flush();
			}
		} catch (InterruptedException ex) {
			Activator.getServices().error("setCursor(int,int)", ex);
		} finally {
			m_WriteLock.release();
		}
	}//setCursor

	public void setCursor(Point p) throws IOException {
		if (p == null) {
			return;
		}
		setCursor(p.getRow(), p.getColumn());
	}//setCursor

	public void homeCursor() throws IOException {
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(m_Terminal.getCursorPositioningSequence(HOME));
			if (m_Autoflush) {
				flush();
			}
		} catch (InterruptedException ex) {
			Activator.getServices().error("homeCursor()", ex);
		} finally {
			m_WriteLock.release();
		}
	}//homeCursor

	public void storeCursor() throws IOException {
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(m_Terminal.getSpecialSequence(STORECURSOR));
		} catch (InterruptedException ex) {
			Activator.getServices().error("storeCursor()", ex);
		} finally {
			m_WriteLock.release();
		}
	}//store Cursor

	public synchronized void restoreCursor() throws IOException {
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(m_Terminal.getSpecialSequence(RESTORECURSOR));
		} catch (InterruptedException ex) {
			Activator.getServices().error("write(byte)", ex);
		} finally {
			m_WriteLock.release();
		}
	}//restore Cursor

	// End of cursor related methods //

	// Special terminal function methods //

	public synchronized void setSignalling(boolean bool) {
		m_AcousticSignalling = bool;
	}//setAcousticSignalling

	public synchronized boolean isSignalling() {
		return m_AcousticSignalling;
	}//isAcousticSignalling

	/**
	 * Method to write the NVT defined BEL onto the stream.
	 * If signalling is off, the method simply returns, without
	 * any action.
	 */
	public synchronized void bell() throws IOException {
		//Activator.getServices().debug("bell()::signal=" + m_AcousticSignalling);
		if (m_AcousticSignalling) {
			try {
				m_WriteLock.acquire();

				m_BaseIO.write(BEL);
				flush();
			} catch (InterruptedException ex) {
				Activator.getServices().error("bell()", ex);
			} finally {
				m_WriteLock.release();
			}
		}
	}//bell

	public boolean defineScrollRegion(int topmargin, int bottommargin) throws IOException {
		if (m_Terminal.supportsScrolling()) {
			try {
				m_WriteLock.acquire();
				m_BaseIO.write(m_Terminal.getScrollMarginsSequence(topmargin, bottommargin));
				flush();
			} catch (InterruptedException ex) {
				Activator.getServices().error("defineScrollRegion(int,int)", ex);
			} finally {
				m_WriteLock.release();
			}
			return true;
		} else {
			return false;
		}
	}//defineScrollRegion

	public synchronized void setForegroundColor(int color) throws IOException {
		if (m_Terminal.supportsSGR()) {
			try {
				m_WriteLock.acquire();
				m_BaseIO.write(m_Terminal.getGRSequence(FCOLOR, color));
				if (m_Autoflush) {
					flush();
				}
			} catch (InterruptedException ex) {
				Activator.getServices().error("setForegroundColor(int color)", ex);
			} finally {
				m_WriteLock.release();
			}
		}
	}//setForegroundColor

	public synchronized void setBackgroundColor(int color) throws IOException {
		if (m_Terminal.supportsSGR()) {
			//this method adds the offset to the fg color by itself
			try {
				m_WriteLock.acquire();
				m_BaseIO.write(m_Terminal.getGRSequence(BCOLOR, color + 10));
				if (m_Autoflush) {
					flush();
				}
			} catch (InterruptedException ex) {
				Activator.getServices().error("setBackgroundColor(int color)", ex);
			} finally {
				m_WriteLock.release();
			}
		}
	}//setBackgroundColor

	public synchronized void setBold(boolean b) throws IOException {
		if (m_Terminal.supportsSGR()) {
			try {
				m_WriteLock.acquire();
				if (b) {
					m_BaseIO.write(m_Terminal.getGRSequence(STYLE, BOLD));
				} else {
					m_BaseIO.write(m_Terminal.getGRSequence(STYLE, BOLD_OFF));
				}
				if (m_Autoflush) {
					flush();
				}
			} catch (InterruptedException ex) {
				Activator.getServices().error("setBold(boolean)", ex);
			} finally {
				m_WriteLock.release();
			}
		}
	}//setBold

	public void forceBold(boolean b) {
		m_ForceBold = b;
	}//forceBold

	public void setColorsEnabled(boolean b) {
		m_Terminal.setColorsEnabled(b);
	}//setColorsEnabled

	public boolean isColorsEnabled() {
		return m_Terminal.isColorsEnabled();
	}//isColorsEnabled

	public void setUnderlined(boolean b) throws IOException {
		if (m_Terminal.supportsSGR()) {
			try {
				m_WriteLock.acquire();
				if (b) {
					m_BaseIO.write(m_Terminal.getGRSequence(STYLE, UNDERLINED));
				} else {
					m_BaseIO.write(m_Terminal.getGRSequence(STYLE, UNDERLINED_OFF));
				}
				if (m_Autoflush) {
					flush();
				}
			} catch (InterruptedException ex) {
				Activator.getServices().error("setUnderlined(boolean)", ex);
			} finally {
				m_WriteLock.release();
			}
		}
	}//setUnderlined

	public void setItalic(boolean b) throws IOException {
		if (m_Terminal.supportsSGR()) {
			try {
				m_WriteLock.acquire();
				if (b) {
					m_BaseIO.write(m_Terminal.getGRSequence(STYLE, ITALIC));
				} else {
					m_BaseIO.write(m_Terminal.getGRSequence(STYLE, ITALIC_OFF));
				}
				if (m_Autoflush) {
					flush();
				}
			} catch (InterruptedException ex) {
				Activator.getServices().error("setItalic(boolean)", ex);
			} finally {
				m_WriteLock.release();
			}
		}
	}//setItalic

	public void setBlink(boolean b) throws IOException {
		if (m_Terminal.supportsSGR()) {
			try {
				m_WriteLock.acquire();
				if (b) {
					m_BaseIO.write(m_Terminal.getGRSequence(STYLE, BLINK));
				} else {
					m_BaseIO.write(m_Terminal.getGRSequence(STYLE, BLINK_OFF));
				}
				if (m_Autoflush) {
					flush();
				}
			} catch (InterruptedException ex) {
				Activator.getServices().error("setBlink(boolean)", ex);
			} finally {
				m_WriteLock.release();
			}
		}
	}//setItalic

	public void resetAttributes() throws IOException {
		if (m_Terminal.supportsSGR()) {
			try {
				m_WriteLock.acquire();
				m_BaseIO.write(m_Terminal.getGRSequence(RESET, 0));
			} catch (InterruptedException ex) {
				Activator.getServices().error("resetAttributes()", ex);
			} finally {
				m_WriteLock.release();
			}
		}
	}//resetGR

	//*** End of special terminal function methods ***************************//

	//*** Auxiliary I/O methods **********************************************//

	public void showError(String error) throws IOException {
		Titlebar t = new Titlebar(this, "error");
		t.setBackgroundColor(ColorHelper.RED);
		t.setForegroundColor(ColorHelper.WHITE);
		t.setAlignment(Titlebar.ALIGN_LEFT);
		t.setTitleText(error);
		t.draw();
	}//showError

	public void clearError() throws IOException {
		boolean b = isAutoflushing();
		setAutoflushing(false);
		try {
			storeCursor();
			setCursor(0, 0);
			eraseToEndOfLine();
			restoreCursor();
			flush();
		} finally {
			setAutoflushing(b);
		}
	}//clearError

	private int handleEscapeSequence() throws IOException {
		m_EscapeBout.reset();
		//Activator.getServices().debug("handleEscapeSequence()");
		//1. read until letter, which should finish a sequence
		int c = -1;
		while (!m_Terminal.isEscSeqTerminator(c = m_BaseIO.read())) {
			m_EscapeBout.write(c);
			if (m_EscapeBout.size() == m_Terminal.getMaxEscSeqLength()) {
				break;
			}
		}
		return m_Terminal.translateEscapeSequence(m_EscapeBout.toByteArray(), c);
	}//handleEscapeSequence

	/**
	 * Accessor method for the autoflushing mechanism.
	 */
	public boolean isAutoflushing() {
		return m_Autoflush;
	}//isAutoflushing

	public void resetTerminal() throws IOException {
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(m_Terminal.getSpecialSequence(DEVICERESET));
		} catch (InterruptedException ex) {
			Activator.getServices().error("resetTerminal()", ex);
		} finally {
			m_WriteLock.release();
		}
	}//resetTerminal

	public void setLineWrapping(boolean b) throws IOException {
		if (b && !m_LineWrapping) {
			try {
				m_WriteLock.acquire();
				m_BaseIO.write(m_Terminal.getSpecialSequence(LINEWRAP));
			} catch (InterruptedException ex) {
				Activator.getServices().error("setLineWrapping(boolean)", ex);
			} finally {
				m_WriteLock.release();
			}
			m_LineWrapping = true;
			return;
		}
		if (!b && m_LineWrapping) {
			try {
				m_WriteLock.acquire();
				m_BaseIO.write(m_Terminal.getSpecialSequence(NOLINEWRAP));
			} catch (InterruptedException ex) {
				Activator.getServices().error("setLineWrapping(boolean)", ex);
			} finally {
				m_WriteLock.release();
			}
			m_LineWrapping = false;
			return;
		}
	}//setLineWrapping

	public boolean isLineWrapping() {
		return m_LineWrapping;
	}//isLineWrapping

	/**
	 * Mutator method for the autoflushing mechanism.
	 */
	public synchronized void setAutoflushing(boolean b) {
		m_Autoflush = b;
	}//setAutoflushing

	/**
	 * Method to flush the Low-Level Buffer
	 */
	public void flush() throws IOException {
		try {
			m_WriteLock.acquire();
			m_BaseIO.flush();
		} catch (InterruptedException ex) {
			Activator.getServices().error("flush()", ex);
		} finally {
			m_WriteLock.release();
		}
	}//flush (implements the famous iToilet)

	public void close() {
		try {
			m_BaseIO.close();
		} catch (Exception ex) {

		}
		//release all references
		m_TerminalManager = null;
		m_BaseIO = null;
		m_Connection = null;
		m_ConnectionData = null;
		m_Terminal = null;
		m_EscapeBout = null;
		m_WriteLock = null;
		m_ReadLock = null;
	}//close

	/*** End of Auxiliary I/O methods  **************************************/

	/**
	 * *********************************************************************
	 * Terminal management specific methods			                        *
	 * **********************************************************************
	 * Accessor method to get the active terminal object
	 *
	 * @return Object that implements Terminal
	 */

	/**
	 * Accessor method to get the active terminal object
	 *
	 * @return Object that implements Terminal
	 */
	public Terminal getTerminal() {
		return m_Terminal;
	}//getTerminal

	/**
	 * Sets the default terminal ,which will either be
	 * the negotiated one for the connection, or the systems
	 * default.
	 */
	public void setDefaultTerminal() throws IOException {
		//set the terminal passing the negotiated string
		setTerminal(m_ConnectionData.getNegotiatedTerminalType());
	}//setDefaultTerminal

	/**
	 * Mutator method to set the active terminal object
	 * If the String does not name a terminal we support
	 * then the vt100 is the terminal of selection automatically.
	 *
	 * @param terminalName String that represents common terminal name
	 */
	public void setTerminal(String terminalName) throws IOException {

		if (m_TerminalManager == null)
			m_TerminalManager = new TerminalManagerImpl();

		try {
			m_Terminal = m_TerminalManager.get(terminalName);
		} catch (NoSuchTerminalException ex) {
			Activator.getServices().error("setTerminal()", ex);
		}
		//Terminal is set we init it....
		initTerminal();
		//debug message
		Activator.getServices().debug("Set terminal to " + m_Terminal.toString());
	}//setTerminal

	/**
	 * Terminal initialization
	 * @throws IOException if an I/O error occurs.
	 */
	private synchronized void initTerminal() throws IOException {
		try {
			m_WriteLock.acquire();
			m_BaseIO.write(m_Terminal.getInitSequence());
			flush();
		} catch (InterruptedException ex) {
			Activator.getServices().error("initTerminal()", ex);
		} finally {
			m_WriteLock.release();
		}
	}//initTerminal

	public int getRows() {
		return m_ConnectionData.getTerminalRows();
	}//getRows

	public int getColumns() {
		return m_ConnectionData.getTerminalColumns();
	}//getColumns

	public Point getCursorPosition() throws IOException {
		int i = HANDLED;
		try {
			m_WriteLock.acquire();
			m_GettingCursor = true;
			//1. request cursor position
			m_BaseIO.write(m_Terminal.getSpecialSequence(REQUESTCURSOR));
			m_BaseIO.flush();
			int count = 0;
			boolean done = false;
			do {
				i = read();
				//Activator.getServices().debug("getCursorPos():i=" + i);
				if (i == CURSORREPORT) {
					done = true;
				} else if (count++ < 32) {
					m_Buffer.add(new Integer(i));
				} else {
					m_Buffer.clear();
					done = true;
				}
				//} while (i!=CURSORREPORT && count < 32 && m_Buffer.add(new Integer(i)));
			} while (!done);
			if (i != CURSORREPORT) {
				return new Point(-1, -1);
			}
			return m_Terminal.getReportedCursorPosition();
		} catch (InterruptedException ex) {
			Activator.getServices().error("getCursorPosition()", ex);
			return new Point(-1, -1);
		} finally {
			m_WriteLock.release();
			m_GettingCursor = false;
		}
	}//getCursorPosition

	public void addTerminalGeometryListener() {

	}//addTerminalGeometryListener

	/*** End of terminal management specific methods  ***********************/

	/**
	 * Terminal independent representation constants for terminal
	 * functions.
	 */
	public static final int[] HOME = { 0, 0 };

	// Functions 105x
	public static final int STORECURSOR = -1051; //store cursor position + attributes
	public static final int RESTORECURSOR = -1052; //restore cursor + attributes
	public static final int REQUESTCURSOR = -1053; //request cursor position

	// Erasing 11xx
	public static final int EEOL = -1100; //erase to end of line
	public static final int EBOL = -1101; //erase to beginning of line
	public static final int EEL = -1103; //erase entire line
	public static final int EEOS = -1104; //erase to end of screen
	public static final int EBOS = -1105; //erase to beginning of screen
	public static final int EES = -1106; //erase entire screen

	// Escape Sequence-ing 12xx
	public static final int ESCAPE = -1200; //Escape
	public static final int BYTEMISSING = -1201; //another byte needed
	public static final int UNRECOGNIZED = -1202; //escape match missed
	public static final int CURSORREPORT = -1203; //cursor report
	public static final int READTOLETTER = -1204; //Read to a specific ESC end character

	// Control Characters 13xx
	public static final int ENTER = -1300; //LF is ENTER at the moment
	public static final int HANDLED = -1305; //indicates a handled escape or control sequence.

	/**
	 * Network Virtual Terminal Specific Keys
	 * Thats what we have to offer at least.
	 */
	public static final int BEL = 7;
	public static final int BS = 8;
	public static final int DEL = 127;
	public static final int CR = 13;
	public static final int LF = 10;

	public static final int BOLD = 1;
	public static final int BOLD_OFF = 22;
	public static final int ITALIC = 3;
	public static final int ITALIC_OFF = 23;
	public static final int BLINK = 5;
	public static final int BLINK_OFF = 25;
	public static final int UNDERLINED = 4;
	public static final int UNDERLINED_OFF = 24;

	public static final int FCOLOR = -10001;
	public static final int BCOLOR = -10002;
	public static final int STYLE = -10003;
	public static final int RESET = -10004;
	public static final int DEVICERESET = -10005;
	public static final int LINEWRAP = -10006;
	public static final int NOLINEWRAP = -10007;

	@Override
	public void setLinewrapping(boolean b) throws IOException {
		setLineWrapping(b);
	}

	/** end Constants Declaration  ******************************************/

}//class TerminalIO
