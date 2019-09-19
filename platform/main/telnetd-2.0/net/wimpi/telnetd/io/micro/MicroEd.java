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
import java.util.ArrayList;
import java.util.ResourceBundle;

import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.io.TerminalIO;
import net.wimpi.telnetd.io.terminal.ColorHelper;
import net.wimpi.telnetd.io.toolkit.ActiveComponent;
import net.wimpi.telnetd.io.toolkit.Dimension;

/**
 * Implements a simple editor with some buffer operations.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class MicroEd
    extends ActiveComponent {

  private ResourceBundle m_Resources;
  protected int m_MaxLines;
  protected ArrayList m_Lines;
  protected String m_LineWrap = "\n";
  protected boolean m_SwitchEditor = false;

  public MicroEd(BasicTerminalIO io, int maxrows) {
    super(io, MicroEd.class.getName());
    //This ensures the use of the standard classloader
    m_Resources = new Resources();
    m_MaxLines = maxrows;
    m_Lines = new ArrayList(maxrows);
    setDimension(new Dimension(m_IO.getColumns(), maxrows));
  }//constructor

  public void setLineWrap(String wrap) {
    m_LineWrap = wrap;
  }//setLineWrap

  public String getLineWrap() {
    return m_LineWrap;
  }//getLineWrap

  public String getValue() {
    StringBuffer sbuf = new StringBuffer();
    //skip the last line (was just to end editing.
    for (int i = 0; i < m_Lines.size(); i++) {
      sbuf.append((String) m_Lines.get(i));
      sbuf.append(m_LineWrap);
    }
    return sbuf.toString();
  }//getValue

  public boolean isSwitchEditor() {
    return m_SwitchEditor;
  }//isSwitchEditor

  public void run() throws IOException {
    //Poor mans editor, but we want something rock
    //solid for the start.
    storeAutoflush();
    storeLineWrapping();
    m_IO.setAutoflushing(false);
    m_IO.setLineWrapping(false);

    try {
      boolean done = false;
      //boolean lastempty = false;
      String hw = null;
      do {
        if (m_Lines.size() == m_MaxLines - 1) {
          m_IO.write(LAST_LINE_PROMPT);
        } else {
          m_IO.write(LINE_PROMPT);
        }
        MicroEditline el = new MicroEditline(m_IO);
        el.setLocation();
        el.setIgnoreDelete(true);//per default do Backspace only
        el.setEdMode(true);
        if (hw != null) {
          try {
            el.setValue(hw);
            el.draw();
          } catch (Exception ex) {
          }
          hw = null;
        }
        m_IO.flush();
        boolean ledone = false;
        do {
          int rv = el.run();
          switch (rv) {
            case BasicTerminalIO.ENTER:
              ledone = true;
              break;
            case Micro.HARDWRAPPED_CONTENT:
              hw = el.getHardwrap();
              ledone = true;
              break;
            case Micro.UNCUT_TEXT:
              el.clear();
              break;
            default:
              m_IO.bell();
              break;
          }
        } while (!ledone);

        //check if to remove last line
        String line = el.getValue();
        if (hw == null && (line == null | line.length() == 0)) {
          done = true;
        } else if (line.equals("!H")) {
          m_IO.write(TerminalIO.CRLF);
          m_IO.write(m_Resources.getString(MicroEd.HELP));
          //m_IO.write(TerminalIO.CRLF);
          m_IO.flush();
        } else if (line.startsWith("!DL")) {
          boolean fail = (m_Lines.size() == 0);
          int idx = m_Lines.size() - 1;
          if (!fail && line.length() > 3) {
            String ln = line.substring(3, line.length());
            try {
              int i = Integer.parseInt(ln) - 1;
              if (i >= 0 && i < m_Lines.size()) {
                idx = i;
              } else {
                fail = true;
              }
            } catch (NumberFormatException ex) {
              fail = true;
            }
          }
          if (fail) {
            m_IO.write(TerminalIO.CRLF);
            m_IO.write(ColorHelper.colorizeText(
                m_Resources.getString(MicroEd.DELETE_LINE_FAIL)
                , ColorHelper.RED)
            );
            m_IO.flush();
            continue;
          }
          m_Lines.remove(idx);
          m_IO.write(TerminalIO.CRLF);
          m_IO.write(ColorHelper.colorizeText(
              m_Resources.getString(MicroEd.DELETE_LINE)
              , ColorHelper.CYAN)
          );
          //m_IO.write(TerminalIO.CRLF);
          m_IO.flush();
        } else if (line.equals("!PM")) {
          doPasteMode();
          showBuffer();
        } else if (line.equals("!CB")) {
          m_Lines.clear();
          m_IO.write(TerminalIO.CRLF);
          m_IO.write(ColorHelper.colorizeText(
              m_Resources.getString(MicroEd.CLEAR_BUFFER)
              , ColorHelper.CYAN)
          );
          //m_IO.write(TerminalIO.CRLF);
          m_IO.flush();
        } else if (line.equals("!SB")) {
          showBuffer();
        } else if (line.equals("!AB")) {
          m_Lines.clear();
          done = true;
          continue;
        } else if (line.equals("!ED")) {
          m_SwitchEditor = true;
          done = true;
          continue;
        } else if (line.startsWith("!IL")) {
          boolean fail = false;
          int idx = 0;
          int lstart = line.indexOf(' ');
          if (line.length() > 3) {
            String ln = line.substring(3, lstart);
            try {
              int i = Integer.parseInt(ln) - 1;
              if (i >= 0 && i < m_Lines.size()) {
                idx = i;
              } else {
                fail = true;
              }
            } catch (NumberFormatException ex) {
              fail = true;
            }
          }
          if (fail) {
            m_IO.write(TerminalIO.CRLF);
            m_IO.write(ColorHelper.colorizeText(
                m_Resources.getString(MicroEd.INSERT_LINE_FAIL)
                , ColorHelper.RED)
            );
            m_IO.flush();
            continue;
          }
          m_Lines.add(idx, line.substring(lstart + 1));
          m_IO.write(TerminalIO.CRLF);
          m_IO.write(ColorHelper.colorizeText(
              m_Resources.getString(MicroEd.INSERT_LINE)
              , ColorHelper.CYAN)
          );
          m_IO.flush();

        } else if (line.startsWith("!RL")) {
          boolean fail = false;
          int idx = 0;
          int lstart = line.indexOf(' ');
          if (line.length() > 3) {
            String ln = line.substring(3, lstart);
            try {
              int i = Integer.parseInt(ln) - 1;
              if (i >= 0 && i < m_Lines.size()) {
                idx = i;
              } else {
                fail = true;
              }
            } catch (NumberFormatException ex) {
              fail = true;
            }
          }
          if (fail) {
            m_IO.write(TerminalIO.CRLF);
            m_IO.write(ColorHelper.colorizeText(
                m_Resources.getString(MicroEd.REPLACE_LINE_FAIL)
                , ColorHelper.RED)
            );
            m_IO.flush();
            continue;
          }
          m_Lines.set(idx, line.substring(lstart + 1));
          m_IO.write(TerminalIO.CRLF);
          m_IO.write(ColorHelper.colorizeText(
              m_Resources.getString(MicroEd.REPLACE_LINE)
              , ColorHelper.CYAN)
          );
          m_IO.flush();
        } else {
          m_Lines.add(el.getValue());
          if (m_Lines.size() == m_MaxLines) {
            done = true;
          }
        }
      } while (!done);
    } finally {
      //Restore I/O behavior
      restoreAutoflush();
      restoreLineWrapping();
    }
  }//run

  private void doPasteMode() throws IOException {
    m_IO.write(TerminalIO.CRLF);
    m_IO.write(ColorHelper.colorizeText(
        m_Resources.getString(MicroEd.PASTE_MODE_START)
        , ColorHelper.CYAN)
    );
    m_IO.flush();
    try {
      //2. read from raw input into cut buffer
      PastedReader r = new PastedReader(m_IO.getBaseIO().getInputStream(), LineEditBuffer.MAX_CHARS);
      String line = "";
      while (line != null) {
        line = r.readLine();
        if (line != null) {
          m_Lines.add(line);
        }
      }

    } catch (Exception ex) {
    }
    m_IO.write(TerminalIO.CRLF);
    m_IO.write(ColorHelper.colorizeText(
        m_Resources.getString(MicroEd.PASTE_MODE_END)
        , ColorHelper.CYAN)
    );
    m_IO.flush();
  }//doPasteMode

  public void showBuffer() throws IOException {
    m_IO.write(TerminalIO.CRLF);
    m_IO.write(ColorHelper.colorizeText(
        m_Resources.getString(MicroEd.SHOW_BUFFER)
        , ColorHelper.CYAN)
    );
    m_IO.write(TerminalIO.CRLF);
    for (int i = 0; i < m_Lines.size(); i++) {
      m_IO.write("\001G" + (i+1) + ": ");
      m_IO.write("\001W" + (String) m_Lines.get(i));
      if (i < m_Lines.size() - 1) {
        m_IO.write(TerminalIO.CRLF);
      }
    }
    m_IO.flush();
  }//showBuffer

  public void draw() throws IOException {
    //noop
  }//draw

  private static final String LINE_PROMPT = TerminalIO.CRLF + ColorHelper.colorizeText(">", ColorHelper.YELLOW);
  private static final String LAST_LINE_PROMPT = TerminalIO.CRLF + ColorHelper.colorizeText(">", ColorHelper.RED);
  public static final String DELETE_LINE = "microed.linedel";
  public static final String CLEAR_BUFFER = "microed.clearbuffer";
  public static final String SHOW_BUFFER = "microed.showbuffer";
  public static final String HELP = "microed.help";
  public static final String DELETE_LINE_FAIL = "microed.linedel.fail";
  public static final String INSERT_LINE = "microed.lineins";
  public static final String INSERT_LINE_FAIL = "microed.lineins.fail";
  public static final String REPLACE_LINE = "microed.linerep";
  public static final String REPLACE_LINE_FAIL = "microed.linerep.fail";
  public static final String PASTE_MODE_START = "microed.pastemode.start";
  public static final String PASTE_MODE_END = "microed.pastemode.end";

}//class MicroEd
