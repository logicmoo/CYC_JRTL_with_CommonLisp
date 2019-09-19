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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.io.terminal.ColorHelper;
import net.wimpi.telnetd.io.toolkit.ActiveComponent;
import net.wimpi.telnetd.io.toolkit.BufferOverflowException;
import net.wimpi.telnetd.io.toolkit.Dimension;
import net.wimpi.telnetd.io.toolkit.Point;
import net.wimpi.telnetd.io.toolkit.Titlebar;

/**
 * Provides a nano/pico type simple editor called
 * <tt>Micro</tt>.
 * <p/>
 * The area will cover from the left upper
 * edge (2,1) to the right lower edge (Rows-3,Cols).
 * </p>
 * <p/>
 * It should handle all types of linebreaks in the input
 * {@link #setText(String)}), but the output ({@link #getText()})
 * will depend on the actual system.
 * </p>
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
public class Micro
    extends ActiveComponent {

  private ResourceBundle m_Resources;
  private MicroLinesBuffer m_Buffer;
  private List m_CutBuffer;
  private boolean m_LastWasCut;
  private Titlebar m_Title;
  private MicroHelpBar m_HelpBar;
  private String m_TitleString;
  private boolean m_JustBackspace;

  public Micro(BasicTerminalIO io) {
    super(io, Micro.class.getName());
    //TODO: This ensures the use of the standard classloader
    m_Resources = new Resources();
    int vr = (m_IO.getRows() - 4);
    m_Buffer = new MicroLinesBuffer(vr);
    m_CutBuffer = new ArrayList(5);
    setDimension(new Dimension(m_IO.getColumns(), m_IO.getRows()));
    m_Title = new Titlebar(m_IO, "Micro Title");
    m_Title.setAlignment(Titlebar.ALIGN_LEFT);
    m_Title.setBackgroundColor(ColorHelper.BLUE);
    m_Title.setForegroundColor(ColorHelper.YELLOW);
    m_TitleString = "";
    m_HelpBar = new MicroHelpBar(m_IO, "Micro Helpbar", m_Resources);
    m_HelpBar.setBackgroundColor(ColorHelper.BLUE);
    m_HelpBar.setForegroundColor(ColorHelper.YELLOW);
    setLocation(1, 2);
  }//constructor

  public void setTitleString(String str) {
    m_TitleString = str;
  }//setTitleString

  public void setJustBackspace(boolean b) {
    m_JustBackspace = b;
  }//setBackspaceOnly

  public void readTextFrom(InputStream in)
      throws IOException {
    readTextFrom(new InputStreamReader(in));
  }//readFrom

  public void readTextFrom(Reader rin)
      throws IOException {
    BufferedReader r = new BufferedReader(rin);
    String line = "";
    while (line != null) {
      line = r.readLine();
      if (line != null) {
        try {
          m_Buffer.quickAppend(new MicroEditline(m_IO, line,m_JustBackspace));
        } catch (BufferOverflowException ex) {
          line = null;
        }
      }
    }
  }//readFrom

  /**
   * Returns the content of the buffer of this
   * <tt>Micro</tt>.
   * <p/>
   * Lines will be separated using a set line
   * separator (default is from System).
   * </p>
   *
   * @return the buffer content as <tt>String</tt>.
   */
  public String getText() {
    return m_Buffer.toString();
  }//getValue

  /**
   * Sets the content of the buffer of this
   * <tt>Editarea</tt>.
   * <p/>
   * This will clear all former buffer content, and
   * require the component to be drawn again.
   * </p>
   *
   * @param str
   * @throws BufferOverflowException
   */
  public void setText(String str)
      throws BufferOverflowException {
    m_Buffer.clear();
    try {
      readTextFrom(new StringReader(str));
    } catch (IOException ex) {

    }
  }//setValue

  public void clear() throws IOException {
    //1. Buffer
    m_Buffer.clear();
    //2. Screen update
    m_IO.homeCursor();
    m_IO.eraseScreen();
    redrawTitle();
    try {
      m_Buffer.append(createLine());
    } catch (BufferOverflowException e) {
      Activator.getServices().error("clear()", e);
    }
    m_Buffer.setRowCursor(0);
    redrawHelp();
    m_IO.moveDown(1);
    m_IO.flush();
  }//clear

  /**
   * Returns the number of lines in the buffer.
   *
   * @return the number of lines as <tt>int</tt>.
   */
  public int getLineCount() {
    return m_Buffer.size();
  }//getLineCount

  /**
   * Returns the number of characters in the buffer.
   * Note that this is an expensive operation at
   * the moment.
   *
   * @return the number of characters as <tt>int</tt>.
   */
  public int getCharacterCount() {
    int size = 0;
    //iterate over buffers and accumulate size
    for (Iterator iterator = m_Buffer.iterator(); iterator.hasNext();) {
      MicroEditline editline = (MicroEditline) iterator.next();
      size += editline.size();
    }
    return size;
  }//getCharacterCount


  public void run() throws IOException, BufferOverflowException {
    //int oldcursor = 0;
    boolean done = false;
    //1. Remember actual output states and set required.
    storeAutoflush();
    storeLineWrapping();
    m_IO.setAutoflushing(false);
    m_IO.setLineWrapping(false);
    m_IO.homeCursor();
    m_IO.eraseScreen();
    redrawTitle();

    if (m_Buffer.size() == 0) {
      m_Buffer.append(createLine());
      m_Buffer.setRowCursor(0);
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    } else {
      doToTop();
    }
    redrawHelp();
    m_IO.flush();
    try {
      do {
        int in = m_Buffer.get().run();
        if (m_LastWasCut && !(in == Micro.CUT_TEXT)) {
          m_LastWasCut = false;
        }
        //switch return of a m_ActiveLine
        switch (in) {
          case BasicTerminalIO.UP:
            doUp();
            break;
          case BasicTerminalIO.LEFT:
            doLeft();
            break;
          case BasicTerminalIO.RIGHT:
            if(m_Buffer.atBottom()) {
              if(!m_Buffer.get().isEmpty()) {
                //append a line, no matter what
                m_Buffer.append(createLine());
                m_Buffer.up();
                doRight();
              } else {
                m_IO.bell();
              }
            } else {
              doRight();
            }
            break;
          case BasicTerminalIO.DOWN:
            doDown();
            break;
          case BasicTerminalIO.PARAGRAPH_FORWARD:
            if(m_Buffer.atBottom()) {
              if(m_Buffer.get().cursorAtEnd()) {
                m_IO.bell();
              } else {
                m_Buffer.get().cursorToEnd();
                m_IO.setCursor(m_Buffer.getTerminalPosition());
              }
            } else {
              int rc = m_Buffer.findNextParagraph();
              if(rc == -1) {
                doToBottom();
                m_Buffer.get().cursorToEnd();
                m_IO.setCursor(m_Buffer.getTerminalPosition());
                break;
              } else {
                m_Buffer.setRowCursor(rc);
                m_Buffer.get().cursorToBegin();
                drawScreenUpdate();
                m_IO.setCursor(m_Buffer.getTerminalPosition());
              }
            }
            break;
          case BasicTerminalIO.PARAGRAPH_BACKWARD:
            if(m_Buffer.atTop()) {
              if(m_Buffer.get().cursorAtBegin()) {
                m_IO.bell();
              } else {
                m_Buffer.get().cursorToBegin();
                m_IO.setCursor(m_Buffer.getTerminalPosition());
              }
            } else {
              int rc = m_Buffer.findPreviousParagraph();
              if(rc == -1) {
                doToTop();
                m_Buffer.get().cursorToBegin();
                m_IO.setCursor(m_Buffer.getTerminalPosition());
                break;
              } else {
                m_Buffer.setRowCursor(rc);
                if(!m_Buffer.atTop()) {
                  doRight();
                } else {
                  drawScreenUpdate();
                }
                m_IO.setCursor(m_Buffer.getTerminalPosition());
              }
            }
            break;
          case Micro.CLEAR_BUFFER:
            clear();
            continue;
          case Micro.TO_TOP:
            doToTop();
            break;
          case Micro.TO_BOTTOM:
            doToBottom();
            break;
          case Micro.PREV_PAGE:
            doPreviousPage();
            break;
          case Micro.NEXT_PAGE:
            doNextPage();
            break;
          case Micro.HARDWRAPPED_CONTENT:
            doEnter(true);
            break;
          case BasicTerminalIO.ENTER:
            doEnter(false);
            break;
          case Micro.CUT_TEXT:
            doCut();
            m_LastWasCut = true;
            break;
          case Micro.UNCUT_TEXT:
            if (m_CutBuffer.isEmpty()) {
              m_Buffer.get().clear();
            } else {
              doUncut();
            }
            break;
          case BasicTerminalIO.BACKSPACE:
            doBackspace();
            break;
          case Micro.PASTE_MODE:
            doPasteMode();
            break;
          case Micro.EXIT:
            done = true;
            break;
        }
        redrawHelp();
        m_IO.flush();
      } while (!done);
      m_IO.eraseScreen();
      m_IO.flush();
    } finally {
      //Restore I/O behavior
      restoreAutoflush();
      restoreLineWrapping();
    }
  }//run

  private void doToTop() throws IOException {
    if (m_Buffer.atTop()) {
      m_IO.bell();
    } else {
      m_Buffer.toTop();
      drawScreenUpdate();
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    }
  }//doToTop

  private void doToBottom() throws IOException {
    if (m_Buffer.atBottom()) {
      m_IO.bell();
    } else {
      m_Buffer.toBottom();
      drawScreenUpdate();
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    }
  }//doToBottom

  private void doPreviousPage() throws IOException {
    if (m_Buffer.atTop()) {
      m_IO.bell();
    } else {
      m_Buffer.pageUp();
      drawScreenUpdate();
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    }
  }//doPreviousPage

  private void doNextPage() throws IOException {
    if (m_Buffer.atBottom()) {
      m_IO.bell();
    } else {
      m_Buffer.pageDown();
      drawScreenUpdate();
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    }
  }//doNextPage

  private void doUp() throws IOException {
    if (m_Buffer.atTop()) {
      m_IO.bell();
    } else {
      if (m_Buffer.up()) {
        //full update
        drawScreenUpdate();
      }
      //Point p = m_Buffer.getTerminalPosition();
      //m_IO.setCursor(p);
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    }
  }//doUp

  private void doDown() throws IOException {
    if (m_Buffer.atBottom()) {
      m_IO.bell();
    } else {
      if (m_Buffer.down()) {
        //full update
        drawScreenUpdate();
      }
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    }
  }//doDown

  private void doLeft() throws IOException {
    if (m_Buffer.atTop()) {
      m_IO.bell();
    } else {
      if (m_Buffer.left()) {
        //full update
        drawScreenUpdate();
      }
      //Point p = m_Buffer.getTerminalPosition();
      //m_IO.setCursor(p);
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    }
  }//doLeft

  private void doRight() throws IOException {
    if (m_Buffer.atBottom()) {
      m_IO.bell();
    } else {
      if (m_Buffer.right()) {
        //full update
        drawScreenUpdate();
      }
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    }
  }//doRight

  private void doEnter(boolean b) throws IOException {
    final MicroEditline el = createLine();
    try {
      if (b) {
        el.setValue(m_Buffer.get().getHardwrap());
      }
      m_Buffer.insert(el);
      m_IO.setCursor(m_Buffer.getTerminalPosition());
      draw();
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    } catch (BufferOverflowException ex) {
      Activator.getServices().error("doHardwrap()", ex);
    }
  }//doEnter

  private void doCut() throws IOException {
    if (m_Buffer.atBottom()) {
      m_IO.bell();
      return;
    }
    if (!m_LastWasCut) {
      m_CutBuffer.clear();
    }
    final MicroEditline el = m_Buffer.remove();
    if (el == null) {
      m_IO.bell();
    } else {
      m_CutBuffer.add(el);
      m_IO.setCursor(m_Buffer.getTerminalPosition());
      draw();
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    }
  }//doCut

  private void doUncut() throws IOException {
    try {
      m_Buffer.insert(m_CutBuffer);
      draw();
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    } catch (BufferOverflowException ex) {
      m_IO.bell();
    }
  }//doUncut

  private void doBackspace() throws IOException {
    MicroEditline el = m_Buffer.get();
    //at first character, not at the top
    if(el.getColumnCursor() == 1 && !m_Buffer.atTop()) {
      String str = el.getValue();
      m_Buffer.remove();
      m_Buffer.left();
      el = m_Buffer.get();
      el.append(str);
      el.setCursor(el.getColumnCursor()-(str.length()+1));
      drawScreenUpdate();
      m_IO.setCursor(m_Buffer.getTerminalPosition());
    } else {
      m_IO.bell();
      return;
    }
  }//doBackspace

  private void doPasteMode() throws IOException {
    m_CutBuffer.clear();
    try {
      //1. redraw title with flag
      m_TitleString = m_Resources.getString("pastemode.flag");
      redrawTitle();
      m_IO.flush();
      try {
        //2. read from raw input into cut buffer
        PastedReader r = new PastedReader(m_IO.getBaseIO().getInputStream(), LineEditBuffer.MAX_CHARS);
        String line = "";
        while (line != null) {
          line = r.readLine();
          if (line != null) {
            m_CutBuffer.add(new MicroEditline(m_IO, line, m_JustBackspace));
          }
        }
      } catch (Exception ex) {
        Activator.getServices().error("", ex);
      }
      m_TitleString = "";
      redrawTitle();
      m_Buffer.insert(m_CutBuffer);
      drawScreenUpdate();
      //3. insert cut buffer
    } catch (BufferOverflowException e) {

    } finally {
      m_CutBuffer.clear();
    }
  }//doPasteMode

  private void drawScreenUpdate() throws IOException {
    final List l = m_Buffer.getRowsToUpdate();
    m_IO.setCursor(m_Location);
    m_IO.eraseToEndOfScreen();
    //draw list
    for (Iterator iter = l.listIterator(); iter.hasNext();) {
      MicroEditline el = (MicroEditline) iter.next();
      el.draw();
    }
  }//drawScreenUpdate

  public void draw() throws IOException {
    Point p = m_Buffer.getTerminalPosition();
    m_IO.setCursor(p.getRow(), 1);
    m_IO.eraseToEndOfScreen();
    final List l = m_Buffer.getRowsToUpdate();
    for (Iterator iter = l.listIterator(); iter.hasNext();) {
      MicroEditline el = (MicroEditline) iter.next();
      el.draw();
    }
  }//draw

  private MicroEditline createLine() {
    return new MicroEditline(m_IO, m_JustBackspace);
  }//createLine


  private void redrawTitle() throws IOException {
    m_Title.setTitleText(MICRO_CREDIT + m_TitleString);
    m_Title.draw();
  }//redrawTitle

  private void redrawHelp() throws IOException {
    m_HelpBar.draw();
  }//redrawHelp

  private static final String MICRO_CREDIT = " micro 1.0 ";
  public static final int EXIT = 24;
  public static final int PREV_PAGE = 25;
  public static final int NEXT_PAGE = 22;
  public static final int CUT_TEXT = 11;
  public static final int UNCUT_TEXT = 21;
  public static final int CURSOR_POS = 3;
  public static final int PASTE_MODE = 16;
  public static final int HARDWRAPPED_CONTENT = 2000;
  public static final int TO_TOP = 20;
  public static final int TO_BOTTOM = 2;
  public static final int TO_LINESTART = 0;
  public static final int CLEAR_BUFFER = BasicTerminalIO.CTRL_N;

  public static final String EXIT_KEY = "^X";
  public static final String PREV_PAGE_KEY = "^Y";
  public static final String NEXT_PAGE_KEY = "^V";
  public static final String CUT_TEXT_KEY = "^K";
  public static final String UNCUT_TEXT_KEY = "^U";
  public static final String CURSOR_POS_KEY = "^C";
  public static final String PASTE_MODE_KEY = "^P";
  public static final String TO_TOP_KEY = "^T";
  public static final String TO_BOTTOM_KEY = "^B";
  public static final String CLEAR_BUFFER_KEY = "^N";

}//class Micro
