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

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.io.BasicTerminalIO;

/**
 * Provides an <tt>Editline</tt> with block scrolling
 * functionality.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class Editline
    extends ActiveComponent {

  private InputFilter m_InputFilter = null;
  private InputValidator m_InputValidator = null;
  private LineEditBuffer m_Buffer;
  private boolean m_IgnoreDelete = false;

  public Editline(BasicTerminalIO io, String name) {
    super(io, name);
    m_Buffer = new LineEditBuffer(m_IO.getColumns() - 1);
    setDimension(new Dimension(m_IO.getColumns(), 1));
  }//constructor

  public Editline(BasicTerminalIO io, String name, Point location) {
    super(io, name, location);
    m_Buffer = new LineEditBuffer(m_IO.getColumns() - 1);
    setDimension(new Dimension(m_IO.getColumns(), 1));
  }//constructor

  /**
   * Tests if this <tt>Editline</tt> ignores <tt>DELETE</tt>.
   * If this is the case, either <tt>DELETE</tt> or <tt>BACKSPACE</tt>
   * will be interpreted as <tt>BACKSPACE</tt>.
   *
   * @return true if ignoring <tt>DELETE</tt>, false otherwise.
   */
  public boolean isIgnoreDelete() {
    return m_IgnoreDelete;
  }//isIgnoreDelete

  /**
   * Sets/Resets this <tt>Editline</tt> to ignore <tt>DELETE</tt>.
   * When set, either <tt>DELETE</tt> or <tt>BACKSPACE</tt>
   * will be interpreted as <tt>BACKSPACE</tt>.
   *
   * @param b true to set, false to reset.
   */
  public void setIgnoreDelete(boolean b) {
    m_IgnoreDelete = true;
  }//setIgnoreDelete

  /**
   * Accessor method for field length.
   *
   * @return int that represents length of editfield.
   */
  public int getLength() {
    return m_Dim.getWidth();
  }//getLength

  /**
   * Accessor method for field buffer size.
   *
   * @return int that represents the number of chars in the fields buffer.
   */
  public int getSize() {
    return m_Buffer.size();
  }//getSize

  public String getValue() {
    return m_Buffer.toString();
  }//getValue

  public void setValue(String str)
      throws BufferOverflowException, IOException {
    m_IO.storeCursor();
    m_Buffer.setValue(str);
    draw();
    m_IO.restoreCursor();
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

    try {

      do {
        //get next key
        in = m_IO.readCharacter();
        //log.debug("run()::in=" + in);

        //Just backspace mode, convert deletes to backspace
        if (m_IgnoreDelete && in == BasicTerminalIO.DELETE) {
          in = BasicTerminalIO.BACKSPACE;
        }
        //send it through the filter if one is set
        if (m_InputFilter != null) {
          in = m_InputFilter.filterInput(in);
        }
        switch (in) {
          case BasicTerminalIO.IO_ERROR:
            in = -1;
            throw new IOException();
          case InputFilter.INPUT_HANDLED:
            break;
          case InputFilter.INPUT_INVALID:
            m_IO.bell();
            m_IO.flush();
            continue;
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
          case BasicTerminalIO.UP:
          case BasicTerminalIO.DOWN:
            m_IO.bell();
            m_IO.flush();
            continue;
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
          case BasicTerminalIO.ENTER:
            if (m_InputValidator != null) {
              if (m_InputValidator.validate(m_Buffer.toString())) {
                in = -1;
              } else {
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
          case BasicTerminalIO.TABULATOR:
            in = -1;
            break;
          default:
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
          return;
        }
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
    if (m_Location == null) {
      Activator.getServices().error("draw()::Location is NULL!");
      setLocation();
    }
    m_IO.setCursor(m_Location);
    m_IO.write(m_Buffer.viewString());
    m_IO.eraseToEndOfLine();
    m_IO.moveLeft(m_Buffer.cursorCorrection());
    m_IO.flush();
  }//draw

}//class Editline
