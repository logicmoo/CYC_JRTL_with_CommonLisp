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
package net.wimpi.telnetd.io.micro;

import java.io.IOException;

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.io.toolkit.BufferOverflowException;
import net.wimpi.telnetd.io.toolkit.InputFilter;
import net.wimpi.telnetd.io.toolkit.Point;
import net.wimpi.telnetd.io.toolkit.TabCompletionFilter;

/**
 * Provides an <tt>Editline</tt> with block scrolling
 * functionality.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 * @see net.wimpi.telnetd.io.toolkit.LineEditBuffer
 */
class MicroEditline {

  private BasicTerminalIO m_IO;
  private InputFilter m_InputFilter = null;
  private LineEditBuffer m_Buffer;
  private boolean m_JustBackspace = false;
  private Point m_Location;
  private String m_Wrap = "";
  private int m_UpDownCursorPos = -1;
  private int m_TabSize = 4;
  private boolean m_EdMode = false;

  public MicroEditline(BasicTerminalIO io) {
    m_IO = io;
    m_Buffer = new LineEditBuffer(m_IO.getColumns() - 1);
  }//constructor

  public MicroEditline(BasicTerminalIO io, boolean b) {
    m_IO = io;
    m_Buffer = new LineEditBuffer(m_IO.getColumns() - 1);
    m_JustBackspace = b;
  }//constructor

  public MicroEditline(BasicTerminalIO io, String val) {
    m_IO = io;
    m_Buffer = new LineEditBuffer(m_IO.getColumns() - 1);
    try {
      m_Buffer.setValue(val);
    } catch (BufferOverflowException ex) {
      try {
        m_Buffer.setValue(val.substring(0, Integer.MAX_VALUE));
      } catch (Exception bex) {
        //ignore
      }
    }
  }//constructor

  public MicroEditline(BasicTerminalIO io, String val, boolean b) {
    m_IO = io;
    m_JustBackspace = b;
    m_Buffer = new LineEditBuffer(m_IO.getColumns() - 1);
    try {
      m_Buffer.setValue(val);
    } catch (BufferOverflowException ex) {
      try {
        m_Buffer.setValue(val.substring(0, Integer.MAX_VALUE));
      } catch (Exception bex) {
        //ignore
      }
    }
  }//constructor

  public void setIgnoreDelete(boolean b) {
    m_JustBackspace = b;
  }//setIgnoreDelete

  public boolean isIgnoreDelete() {
    return m_JustBackspace;
  }//isIgnoreBackspace

  public boolean isEdMode() {
    return m_EdMode;
  }//isEdMode

  public void setEdMode(boolean edMode) {
    m_EdMode = edMode;
  }//setEdMode

  public int getColumnCursor() {
    return m_Buffer.getColumnCursor();
  }//getCursor

  public void cursorToBegin() {
    m_Buffer.setCursor(0);
  }//cursorToBegin

  public boolean cursorAtBegin() {
    return m_Buffer.atStart();
  }//cursorAtBegin

  public void cursorToEnd() {
    m_Buffer.setCursor(m_Buffer.size());
  }//cursorToEnd

  public boolean cursorAtEnd() {
    return m_Buffer.atEnd();
  }//cursorAtEnd
  
  public void setCursor(int pos) {
    m_Buffer.setCursor(pos);
  }//setCursor

  public void setUpDownCursorPos(int pos) {
    m_UpDownCursorPos = pos;
    m_Buffer.setCursor(pos);
  }//setUpdDownCursorPos

  public int getUpdDownCursorPos() {
    return m_UpDownCursorPos;
  }//getUpDownCursorPos

  public String getValue() {
    return m_Buffer.toString();
  }//getValue

  public void setValue(String str)
      throws BufferOverflowException {
    //m_IO.storeCursor();
    m_Buffer.setValue(str);
    //draw();
    //m_IO.restoreCursor();
    //m_IO.flush();
  }//setValue

  public void append(String str) {
    for(int i =0 ; i< str.length();i++) {
      m_Buffer.append(str.charAt(i));
    }
  }//append

  public void clear() throws IOException {
    m_Buffer.clear();
    draw();
  }//clear

  /**
   * Method that will be
   * reading and processing input.
   */
  public int run() throws IOException {
    int in = 0;
    int fv = -1;
    //Location in actual row, and first column
    if (m_Buffer.firstVisible() != 0) {
      draw();
    }
    do {
      //get next key
      in = m_IO.readCharacter();
      //log.debug("run()::in=" + in);

      //Just backspace mode, convert deletes to backspace
      if (m_JustBackspace && in == BasicTerminalIO.DELETE) {
        in = BasicTerminalIO.BACKSPACE;
      }
      switch (in) {
        case BasicTerminalIO.IO_ERROR:
          in = -1;
          throw new IOException();
        case BasicTerminalIO.LEFT:
          fv = m_Buffer.firstVisible();
          if (!moveLeft()) {
            //We need to ensure that if we are scrolled,
            //that the first visible part is drawn on the screen
            if (fv != m_Buffer.firstVisible()) {
              cursorToBegin();
              draw();
            }
            return in;
          } else {
            if (fv == m_Buffer.firstVisible()) {
              continue;
            }
            m_UpDownCursorPos = -1;
          }
          break;
        case BasicTerminalIO.RIGHT:
          fv = m_Buffer.firstVisible();
          if (!moveRight()) {
            if(m_EdMode) {
              m_IO.bell();
              m_IO.flush();
              continue;
            }
            if (fv > 0) {
              cursorToBegin();
              draw();
              m_UpDownCursorPos = -1;
            }
            return in;
          } else {
            if (fv == m_Buffer.firstVisible()) {
              continue;
            }
            m_UpDownCursorPos = -1;
          }
          break;
        case BasicTerminalIO.WORD_FORWARD:
          if(!m_Buffer.nextWord()) {
            m_IO.bell();
            m_IO.flush();
            continue;
          }
          break;
        case BasicTerminalIO.WORD_BACKWARD:
          if(!m_Buffer.previousWord()) {
            m_IO.bell();
            m_IO.flush();
            continue;
          }
          break;
        case BasicTerminalIO.PARAGRAPH_FORWARD:
        case BasicTerminalIO.PARAGRAPH_BACKWARD:
          resetToBegin();
          return in;
        case BasicTerminalIO.BACKSPACE:
          fv = m_Buffer.firstVisible();
          if (!m_Buffer.removeLastChar()) {
            return in;
          } else {
            if (m_Buffer.atEnd() && fv != m_Buffer.firstVisible()) {
              m_IO.moveLeft(1);
              m_IO.eraseToEndOfLine();
              m_IO.flush();
              continue;
            }
          }
          break;
        case BasicTerminalIO.DELETE:
          if (!m_Buffer.removeChar()) {
            m_IO.bell();
            m_IO.flush();
            continue;
          }
          break;
        case BasicTerminalIO.ENTER:
          m_UpDownCursorPos = -1;
          if (!m_Buffer.atEnd()) {
            m_Wrap = m_Buffer.cutWrap();
            m_IO.eraseToEndOfLine(); //erase to end of line without flush
            resetToBegin();
            return Micro.HARDWRAPPED_CONTENT;
          } else {
            resetToBegin();
            return in;
          }
        case BasicTerminalIO.UP:
        case BasicTerminalIO.DOWN:
          if (m_UpDownCursorPos == -1) {
            m_UpDownCursorPos = m_Buffer.position();
          }
          resetToBegin();
          return in;
        case BasicTerminalIO.TABULATOR:
          if (!(m_InputFilter instanceof TabCompletionFilter)) {
            for (int i = 0; i < m_TabSize; i++) {
              m_Buffer.append(' ');
            }
          }
          break;
        case BasicTerminalIO.CTRL_A:
          fv = m_Buffer.firstVisible();
          int left = m_Buffer.getColumnCursor() - 1;
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
            continue;
          } else {
            if (fv == m_Buffer.firstVisible()) {
              //no scrolling involved
              m_IO.moveRight(right);
              m_IO.flush();
              continue;
            }
          }
          break;
        case BasicTerminalIO.CTRL_W:
          //clear last word
          if (!m_Buffer.removeLastWord()) {
            m_IO.bell();
            m_IO.flush();
            continue;
          }
          break;
        case Micro.NEXT_PAGE:
        case Micro.PREV_PAGE:
        case Micro.TO_TOP:
        case Micro.TO_BOTTOM:
          m_UpDownCursorPos = -1;
          return in;
        case Micro.CURSOR_POS:
        case Micro.CUT_TEXT:
        case Micro.UNCUT_TEXT:
        case Micro.PASTE_MODE:
        case Micro.EXIT:
        case BasicTerminalIO.CTRL_N:
          return in;
        default:
          //send it through the filter if one is set
          if (m_InputFilter != null) {
            in = m_InputFilter.filterInput(in);

            if (in == InputFilter.INPUT_HANDLED) {
              break;
            } else if (in == InputFilter.INPUT_INVALID) {
              m_IO.bell();
              m_IO.flush();
              continue;
            }
          } else {
            //filter control characters not used for micro itself
            if (in<=20) {
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
              m_IO.write((char) in);
              m_IO.flush();
              continue;
            }
          }
          break;
      }

      if (in != -1) {
        draw();
      } else {
        return -1;
      }
    } while (in != -1);
    return -1;
  }//run

  private void resetToBegin() throws IOException {
    if (m_Buffer.firstVisible() != 0) {
      cursorToBegin();
      draw();
    }
  }//resetToBegin

  public String getHardwrap() {
    return m_Wrap;
  }//getHardwrap

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

  /**
   * Accessor method for line buffer size.
   *
   * @ return int that represents the number of chars in the fields buffer.
   */
  public int size() {
    return m_Buffer.size();
  }//getSize

  public boolean isEmpty() {
    return m_Buffer.size() == 0;
  }//isEmpty

  public void draw() throws IOException {
    //m_Buffer.logState("draw");
    if (m_Location == null) {
      Activator.getServices().error("Location not set on editline.");
      m_Buffer.logState("draw()");
    }
    m_IO.setCursor(m_Location);
    if (this.size() == 0) {
      m_IO.eraseToEndOfLine();
    } else {
      m_IO.write(m_Buffer.viewString());
      m_IO.eraseToEndOfLine();
      m_IO.moveLeft(m_Buffer.cursorCorrection());
    }
    m_IO.flush();
  }//draw

  /**
   * Sets this <tt>Component</tt> location.
   *
   * @param row int that represents a row coordinate.
   */
  public void setLocation(int row) {
    if (m_Location != null) {
      m_Location.setColumn(1);
      m_Location.setRow(row);
    } else {
      m_Location = new Point(1, row);
    }
  }//setLocation

  public void setLocation() {
    try {
      m_Location = m_IO.getCursorPosition();
    } catch (Exception ex) {
      setLocation(m_IO.getRows());
    }
  }//setLocation

}//class MicroEditline
