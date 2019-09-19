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

package net.wimpi.telnetd.io.terminal;

import net.wimpi.telnetd.io.TerminalIO;
import net.wimpi.telnetd.io.toolkit.Point;


/**
 * A basic terminal implementation with the focus on vt100
 * related sequences. This terminal type is most common out
 * there, with sequences that are normally also understood
 * by its successors.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
public abstract class BasicTerminal implements Terminal {

  private Point m_CursorPos;
  private boolean m_ColorsEnabled = true;

  /**
   * Constructs an instance with an associated colorizer.
   */
  public BasicTerminal() {
  }//constructor


  public int translateControlCharacter(int c) {

    switch (c) {
      case DEL:
        return TerminalIO.DELETE;
      case BS:
        return TerminalIO.BACKSPACE;
      case HT:
        return TerminalIO.TABULATOR;
      case ESC:
        return TerminalIO.ESCAPE;
      case SGR:
        return TerminalIO.COLORINIT;
      case EOT:
        return TerminalIO.LOGOUTREQUEST;
      default:
        return c;
    }
  }//translateControlCharacter

  public int translateEscapeSequence(byte[] buffer, int terminator) {
    //Standard VT100/ANSI cursor keys
    if (buffer.length == 1 && buffer[0] == LSB) {
      switch (terminator) {
        case A:
          return TerminalIO.UP;
        case B:
          return TerminalIO.DOWN;
        case C:
          return TerminalIO.RIGHT;
        case D:
          return TerminalIO.LEFT;
        default:
          return TerminalIO.UNRECOGNIZED;
      }
    }
    if(buffer.length > 1 && buffer[0] == LSB) {
      switch (terminator) {
        case A:
          if(buffer[(buffer.length-1)] == 53) {
            return TerminalIO.PARAGRAPH_BACKWARD;
          }
        case B:
          if(buffer[(buffer.length-1)] == 53) {
            return TerminalIO.PARAGRAPH_FORWARD;
          }
        case C:
          if(buffer[(buffer.length-1)] == 53) {
            return TerminalIO.WORD_FORWARD;
          }
          break;
        case D:
          if(buffer[(buffer.length-1)] == 53) {
            return TerminalIO.WORD_BACKWARD;
          }
          break;
      }
    }
    //Simple Device Reports and attributes
    if (terminator == 110 || terminator == 99) {
      //we ignore them for now
      return TerminalIO.HANDLED;
    }
    //Cursor Report
    if (terminator == 82) {
      //get semipos
      final StringBuffer row = new StringBuffer();
      final StringBuffer col = new StringBuffer();
      boolean semifound = false;
      for (int i = 1; i < buffer.length; i++) {
        if ((char) buffer[i] != SEMICOLON) {
          if (semifound) {
            col.append(Character.getNumericValue((char) buffer[i]));
          } else {
            row.append(Character.getNumericValue((char) buffer[i]));
          }
        } else {
          semifound = true;
        }
      }
      try {
        m_CursorPos = new Point(
            Integer.parseInt(col.toString()),
            Integer.parseInt(row.toString())
        );
      } catch (Exception ex) {
        return TerminalIO.HANDLED;
      }
      return TerminalIO.CURSORREPORT;
    }
    /*
    try {
      if (buffer[0] == LSB) {
        switch (buffer[1]) {
          case A:
            return TerminalIO.UP;
          case B:
            return TerminalIO.DOWN;
          case C:
            return TerminalIO.RIGHT;
          case D:
            return TerminalIO.LEFT;
          default:
              if (buffer.length < 3) {

              } else {
                if (buffer[1] == 51 && buffer[2] == 110) { //51 Ascii code of 3
                  //device failure report
                  return TerminalIO.HANDLED;
                } else if (buffer[1] == 48 && buffer[2] == 110) { //48 Ascii code of 0
                  //device ok report
                  return TerminalIO.HANDLED;
                } else if (buffer[2] == 48 && buffer[3] == 99) {
                  //store device code
                  return TerminalIO.HANDLED;
                } else if (buffer[2] == SEMICOLON && buffer[4] == 82) {

                }
              }
            break;
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      return TerminalIO.BYTEMISSING;
    }
      */
    return TerminalIO.UNRECOGNIZED;
  }//translateEscapeSequence

  public boolean isEscSeqTerminator(int b) {
    switch (b) {
      case A:
      case B:
      case C:
      case D:
      case 82: //R
      case 99: //c
      case 110: //n
        return true;
      default:
        return false;
    }
  }//isEscSeqTerminator

  public byte[] getCursorMoveSequence(int direction, int times) {
    byte[] sequence = null;

    if (times == 1) {
      sequence = new byte[3];
    } else {
      sequence = new byte[times * 3];
    }

    for (int g = 0; g < times * 3; g++) {

      sequence[g] = ESC;
      sequence[g + 1] = LSB;
      switch (direction) {
        case TerminalIO.UP:
          sequence[g + 2] = A;
          break;
        case TerminalIO.DOWN:
          sequence[g + 2] = B;
          break;
        case TerminalIO.RIGHT:
          sequence[g + 2] = C;
          break;
        case TerminalIO.LEFT:
          sequence[g + 2] = D;
          break;
        default:
          break;
      }
      g = g + 2;
    }

    return sequence;
  }// getCursorMoveSequence


  public byte[] getCursorPositioningSequence(int[] pos) {

    byte[] sequence = null;

    if (pos[0] == TerminalIO.HOME[0] && pos[1] == TerminalIO.HOME[1]) {
      sequence = new byte[3];
      sequence[0] = ESC;
      sequence[1] = LSB;
      sequence[2] = H;
    } else {
      //first translate integer coords into digits
      byte[] rowdigits = translateIntToDigitCodes(pos[0]);
      byte[] columndigits = translateIntToDigitCodes(pos[1]);
      int offset = 0;
      //now build up the sequence:
      sequence = new byte[4 + rowdigits.length + columndigits.length];
      sequence[0] = ESC;
      sequence[1] = LSB;
      //now copy the digit bytes
      System.arraycopy(rowdigits, 0, sequence, 2, rowdigits.length);
      //offset is now 2+rowdigits.length
      offset = 2 + rowdigits.length;
      sequence[offset] = SEMICOLON;
      offset++;
      System.arraycopy(columndigits, 0, sequence, offset, columndigits.length);
      offset = offset + columndigits.length;
      sequence[offset] = H;
    }
    return sequence;
  }//getCursorPositioningSequence


  public byte[] getEraseSequence(int eraseFunc) {

    byte[] sequence = null;

    switch (eraseFunc) {
      case TerminalIO.EEOL:
        sequence = new byte[3];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = LE;
        break;
      case TerminalIO.EBOL:
        sequence = new byte[4];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = 49;	//Ascii Code of 1
        sequence[3] = LE;
        break;
      case TerminalIO.EEL:
        sequence = new byte[4];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = 50;	//Ascii Code 2
        sequence[3] = LE;
        break;
      case TerminalIO.EEOS:
        sequence = new byte[3];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = SE;
        break;
      case TerminalIO.EBOS:
        sequence = new byte[4];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = 49;	//Ascii Code of 1
        sequence[3] = SE;
        break;
      case TerminalIO.EES:
        sequence = new byte[4];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = 50;	//Ascii Code of 2
        sequence[3] = SE;
        break;
      default:
        break;
    }

    return sequence;
  }//getEraseSequence

  public byte[] getSpecialSequence(int function) {

    byte[] sequence = null;

    switch (function) {
      case TerminalIO.STORECURSOR:
        sequence = new byte[2];
        sequence[0] = ESC;
        sequence[1] = 55; //Ascii Code of 7
        break;
      case TerminalIO.RESTORECURSOR:
        sequence = new byte[2];
        sequence[0] = ESC;
        sequence[1] = 56;	//Ascii Code of 8
        break;
      case TerminalIO.DEVICERESET:
        sequence = new byte[2];
        sequence[0] = ESC;
        sequence[1] = 99; //Ascii Code of c
        break;
      case TerminalIO.LINEWRAP:
        sequence = new byte[4];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = 55; //Ascii code of 7
        sequence[3] = 104; //Ascii code of h
        break;
      case TerminalIO.NOLINEWRAP:
        sequence = new byte[4];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = 55; //Ascii code of 7
        sequence[3] = 108; //Ascii code of l
        break;
      case TerminalIO.REQUESTCURSOR:
        sequence = new byte[4];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = 54; //ASCII code of 6
        sequence[3] = 110; //ASCII Code of n
        break;
    }
    return sequence;
  }//getSpecialSequence

  public byte[] getGRSequence(int type, int param) {

    byte[] sequence = new byte[0];
    int offset = 0;

    switch (type) {
      case TerminalIO.FCOLOR:
      case TerminalIO.BCOLOR:
        byte[] color = translateIntToDigitCodes(param);
        sequence = new byte[3 + color.length];

        sequence[0] = ESC;
        sequence[1] = LSB;
        //now copy the digit bytes
        System.arraycopy(color, 0, sequence, 2, color.length);
        //offset is now 2+color.length
        offset = 2 + color.length;
        sequence[offset] = 109;		//ASCII Code of m
        break;

      case TerminalIO.STYLE:
        byte[] style = translateIntToDigitCodes(param);
        sequence = new byte[3 + style.length];

        sequence[0] = ESC;
        sequence[1] = LSB;
        //now copy the digit bytes
        System.arraycopy(style, 0, sequence, 2, style.length);
        //offset is now 2+style.length
        offset = 2 + style.length;
        sequence[offset] = 109;		//ASCII Code of m
        break;

      case TerminalIO.RESET:
        sequence = new byte[5];
        sequence[0] = ESC;
        sequence[1] = LSB;
        sequence[2] = 52;			//ASCII Code of 4
        sequence[3] = 56;			//ASCII Code of 8
        sequence[4] = 109;		//ASCII Code of m
        break;
    }

    return sequence;
  }//getGRsequence


  public byte[] getScrollMarginsSequence(int topmargin, int bottommargin) {

    byte[] sequence = new byte[0];

    if (supportsScrolling()) {
      //first translate integer coords into digits
      byte[] topdigits = translateIntToDigitCodes(topmargin);
      byte[] bottomdigits = translateIntToDigitCodes(bottommargin);
      int offset = 0;
      //now build up the sequence:
      sequence = new byte[4 + topdigits.length + bottomdigits.length];
      sequence[0] = ESC;
      sequence[1] = LSB;
      //now copy the digit bytes
      System.arraycopy(topdigits, 0, sequence, 2, topdigits.length);
      //offset is now 2+topdigits.length
      offset = 2 + topdigits.length;
      sequence[offset] = SEMICOLON;
      offset++;
      System.arraycopy(bottomdigits, 0, sequence, offset, bottomdigits.length);
      offset = offset + bottomdigits.length;
      sequence[offset] = r;
    }

    return sequence;
  }//getScrollMarginsSequence

  public String format(String str) {
    return Colorizer.colorize(str, m_ColorsEnabled && supportsSGR(), false);
  }//format

  public String formatBold(String str) {
    return Colorizer.colorize(str, m_ColorsEnabled && supportsSGR(), true);
  }//formatBold

  public byte[] getInitSequence() {
    return new byte[0];
  }//getInitSequence

  public int getMaxEscSeqLength() {
    return 9;
  }//getAtomicSequenceLength

  public Point getReportedCursorPosition() {
    if (m_CursorPos == null) {
      throw new IllegalStateException();
    } else {
      try {
        return m_CursorPos;
      } finally {
        m_CursorPos = null;
      }
    }
  }//getReportedCursorPosition

  /**
   * Translates an integer to a byte sequence of its
   * digits.<br>
   *
   * @param in integer to be translated.
   * @return the byte sequence representing the digits.
   */
  public byte[] translateIntToDigitCodes(int in) {
    return Integer.toString(in).getBytes();
  }//translateIntToDigitCodes

  public boolean isColorsEnabled() {
    return m_ColorsEnabled;
  }//isColorsEnabled

  public void setColorsEnabled(boolean colorsEnabled) {
    m_ColorsEnabled = colorsEnabled;
  }//setColorsEnabled

  public abstract boolean supportsSGR();

  public abstract boolean supportsScrolling();

}//class BasicTerminal
