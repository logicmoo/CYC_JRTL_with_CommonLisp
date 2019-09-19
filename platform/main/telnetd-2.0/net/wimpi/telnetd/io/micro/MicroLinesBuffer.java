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
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.wimpi.telnetd.io.toolkit.BufferOverflowException;
import net.wimpi.telnetd.io.toolkit.Point;

/**
 * Provides a buffer that manages {@link MicroEditline}
 * instances as lines.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
class MicroLinesBuffer {

  private int m_FirstVisibleRow = 0;
  private int m_RowCursor = 0;
  private int m_MaxRows = Integer.MAX_VALUE;
  private List m_Lines;
  private int m_Scroll;
  protected int m_Wrap;
  private int m_VisibleRows;
  private int m_LastRowCursor = 0;
  private String m_LineSeparator = System.getProperty("line.separator");

  public MicroLinesBuffer(int rows) {
    m_Lines = new ArrayList(200);
    m_VisibleRows = rows;
    m_Wrap = rows / 2;
    m_Scroll = m_VisibleRows - m_Wrap;
    //System.err.println("m_VisibleRows=" + m_VisibleRows + "::m_Wrap=" + m_Wrap + "::m_Scroll=" + m_Scroll);
  }//constructor

  public String getLineSeparator() {
    return m_LineSeparator;
  }//getLineSeparator

  public void setLineSeparator(String sep) {
    if (sep == null || sep.length() == 0) {
      sep = System.getProperty("line.separator");
    }
    m_LineSeparator = sep;
  }//setLineSeparator

  public int getRowCursor() {
    return m_RowCursor;
  }//getRowCursor

  public void setRowCursor(int rc) {
//    logBufferState("setRowCursor::to=" + rc);
    if (rc >= 0 && rc < m_Lines.size()) {
      m_RowCursor = rc;
      m_LastRowCursor = m_RowCursor + 1; //to ensure update will fetch all
      get().cursorToBegin();
      updateVisible();
      relocateVisibleLines();
    }
//    logBufferState("setRowCursor::to=" + rc);
  }//setRowCursor

  public Point getTerminalPosition() {
    //The row offset is due to the indexing (cursor starts at 0)
    //and the header bar in the editor
    return new Point(get().getColumnCursor(), //column on terminal
        m_RowCursor - m_FirstVisibleRow + 2  //row on terminal
    );

  }//getTerminalPosition

  /**
   * Tests if this buffer is already at the top.
   *
   * @return true if at top, false otherwise.
   */
  public boolean atTop() {
    return m_RowCursor == 0;
  }//atTop

  /**
   * Tests if this buffer is already at the bottom.
   *
   * @return true if at bottom, false otherwise.
   */
  public boolean atBottom() {
    return m_RowCursor == m_Lines.size() - 1;
  }//atBottom

  /**
   * Moves the buffer to the top.
   */
  public void toTop() {
    if (m_RowCursor == 0) {
      return; //already at top
    }
    m_RowCursor = 0;
    m_FirstVisibleRow = 0;
    m_LastRowCursor = m_RowCursor + 1; //to ensure update will fetch all
    get().cursorToBegin();
    relocateVisibleLines();
    //logBufferState("toTop");
  }//toTop

  /**
   * Moves the buffer to the bottom.
   */
  public void toBottom() {
    if (m_RowCursor == m_Lines.size() - 1) {
      return; //already at bottom
    }
    m_RowCursor = m_Lines.size() - 1;
    m_FirstVisibleRow = m_RowCursor - m_Scroll;
    if (m_FirstVisibleRow < 0) {
      m_FirstVisibleRow = 0;
    }
    m_LastRowCursor = m_RowCursor + 1;
    get().cursorToBegin();
    relocateVisibleLines();
    //logBufferState("toBottom");
  }//toBottom

  /**
   * Moves the buffer a page down (relative to the
   * first visible row).
   */
  public void pageDown() {
    if (m_RowCursor == m_Lines.size() - 1) {
      return;
    }
    int left = m_Lines.size() - m_FirstVisibleRow;
    if (left < m_VisibleRows) {
      toBottom();
      return;
    } else {
      m_FirstVisibleRow += m_VisibleRows;
      m_RowCursor = m_FirstVisibleRow;
      m_LastRowCursor = m_RowCursor + 1;
      get().cursorToBegin();
      relocateVisibleLines();
      //logBufferState("pageDown");
    }
  }//pageDown

  /**
   * Moves the buffer a page up (relative to the
   * first visible row).
   */
  public void pageUp() {
    if (m_RowCursor == 0) {
      return; //already at top
    }
    if (m_FirstVisibleRow < m_VisibleRows) {
      toTop();
      return;
    } else {
      m_FirstVisibleRow -= m_VisibleRows;
      m_RowCursor = m_FirstVisibleRow;
      m_LastRowCursor = m_RowCursor + 1;
      get().cursorToBegin();
      relocateVisibleLines();
      //logBufferState("pageUp");
    }
  }//pageUp

  /**
   * Moves the cursor left to the next line.
   * <p/>
   * A check for atTop() can be used before
   * to signal the user that left isn't possible,
   * saving a method call (although this method
   * will do nothing but return on the same check).
   * </p>
   * <p/>
   * This method returns true, if the screen had
   * to be scrolled, in this case the screen will
   * require a complete update.
   * </p>
   *
   * @return true if scrolled, false otherwise.
   */
  public boolean left() {
    if (atTop()) {
      return false;
    } else {
      if (m_RowCursor > m_FirstVisibleRow) {
        //only move cursor one up, no redraw
        m_RowCursor--;
        get().cursorToEnd();
        //logBufferState("left");
        return false;
      } else {
        m_RowCursor--;
        m_LastRowCursor = m_RowCursor + 1; //to update all lines
        updateVisible();
        relocateVisibleLines();
        get().cursorToEnd();
        //logBufferState("up");
        return true;
      }
    }
  }//left

  /**
   * Moves the cursor right to the next line.
   * <p/>
   * A check for atTop() can be used to signal
   * the user that left isn't possible, saving a
   * method call (although this method will do nothing
   * but return on the same check).
   * </p>
   * <p/>
   * This method returns true, if the screen had
   * to be scrolled, in this case the screen will
   * require a complete update.
   * </p>
   *
   * @return true if scrolled, false otherwise.
   */
  public boolean right() {
    if (atBottom()) {
      return false;
    } else {
      if (m_RowCursor < (m_FirstVisibleRow + m_VisibleRows - 1)) {
        m_RowCursor++;
        get().cursorToBegin();
        //logBufferState("right");
        return false;
      } else {
        m_RowCursor++;
        m_LastRowCursor = m_RowCursor + 1; //to update all lines
        updateVisible();
        relocateVisibleLines();
        get().cursorToBegin();
        //logBufferState("right");
        return true;
      }
    }
  }//right

  /**
   * Moves the buffer one up.
   *
   * @return true if scrolled, false otherwise.
   */
  public boolean up() {
    if (atTop()) {
      //logBufferState("up");
      return false;
    } else {
      if (m_RowCursor > m_FirstVisibleRow) {
        int udc = get().getUpdDownCursorPos();
        //only move cursor one up, no redraw
        m_RowCursor--;
        //System.err.println("UpDownCursorPos = " + udc);
        get().setUpDownCursorPos(udc);
        //logBufferState("up");
        return false;
      } else {
        int udc = get().getUpdDownCursorPos();
        m_RowCursor--;
        m_LastRowCursor = m_RowCursor + 1; //to update all lines
        updateVisible();
        relocateVisibleLines();
        get().setUpDownCursorPos(udc);
        //logBufferState("up");
        return true;
      }
    }
  }//up

  public boolean down() {
    if (atBottom()) {
      //logBufferState("down");
      return false;
    } else {
      if (m_RowCursor < (m_FirstVisibleRow + m_VisibleRows - 1)) {
        int udc = get().getUpdDownCursorPos();
        m_RowCursor++;
        get().setUpDownCursorPos(udc);
        //System.err.println("UpDownCursorPos = " + udc);
        //logBufferState("down");
        return false;
      } else {
        int udc = get().getUpdDownCursorPos();
        m_RowCursor++;
        m_LastRowCursor = m_RowCursor + 1; //to update all lines
        updateVisible();
        relocateVisibleLines();
        get().setUpDownCursorPos(udc);
        //logBufferState("down");
        return true;
      }
    }
  }//down

  public int findPreviousParagraph() {
    boolean firstempty = false;
    boolean firsttext= false;

    for(int i = m_RowCursor; i >= 0; i--) {
      MicroEditline line = (MicroEditline) m_Lines.get(i);
      if(firsttext) {
          if(line.isEmpty()) {
            return i;
          }
      }
      if(!firstempty) {
        if(line.isEmpty()) {
          firstempty = true;
        }
      } else {
        if(!line.isEmpty()) {
          firsttext = true;
        }
      }
    }
    return -1;
  }//findPreviousParagraph

  public int findNextParagraph() {
    //logBufferState("findNextParagraph");
    boolean firstempty = false;
    for(int i = m_RowCursor+1; i < this.size(); i++) {
      MicroEditline line = (MicroEditline) m_Lines.get(i);
      if(!firstempty) {
        if(line.isEmpty()) {
          firstempty = true;
        }
      } else {
        if(!line.isEmpty()) {
          return i;
        }
      }
    }
    return -1;
  }//findNextParagraph


  public int size() {
    return m_Lines.size();
  }//size

  public Iterator iterator() {
    return m_Lines.listIterator();
  }//iterator

  public String toString() {
    final StringBuffer sbuf = new StringBuffer();
    //iterate over buffers and accumulate text, skip last line
    //if empty
    MicroEditline el = null;
    for (int i = 0; i < m_Lines.size(); i++) {
      el = get(i);
      if (i == m_Lines.size() - 1 && el.size() == 0) {
        break;
      } else {
        sbuf.append(el.getValue());
        sbuf.append(m_LineSeparator);
      }
    }
    return sbuf.toString();
  }//toString

  public void writeTo(OutputStream out)
      throws IOException {
    MicroEditline el = null;
    PrintWriter pw = new PrintWriter(out);
    for (int i = 0; i < m_Lines.size(); i++) {
      el = get(i);
      pw.print(el.getValue());
      pw.print(m_LineSeparator);
    }
    pw.flush();
  }//writeTo

  public boolean hasSpace() {
    return (m_Lines.size() < m_MaxRows);
  }//hasSpace

  public MicroEditline remove() {
    //logBufferState("begin:remove");
    if (m_Lines.size() == 0) {
      return null;
    }
    m_LastRowCursor = m_RowCursor + 1;
    MicroEditline el = (MicroEditline) m_Lines.remove(m_RowCursor);
    relocateVisibleLines();
    //logBufferState("end:remove");
    return el;
  }//remove

  public void insert(MicroEditline el)
      throws BufferOverflowException {
    //logBufferState("begin:insert");
    ensureSpace(1);
    el.cursorToBegin();
    m_Lines.add(++m_RowCursor, el);
    m_LastRowCursor = m_RowCursor + 1; //partial update down
    relocateVisibleLines();
    //logBufferState("end:insert");
  }//insert


  /**
   * Insert all lines from the given <tt>List</tt>.
   * at the actual row.
   * TODO: This is broken, needs some work it seems.
   *
   * @param lines
   */
  public void insert(List lines)
      throws BufferOverflowException {
    //logBufferState("begin:insert(lines)");
    final int nl = lines.size();
    ensureSpace(nl);
    m_Lines.addAll(m_RowCursor, lines);
    m_RowCursor += nl;
    //ensure update
    m_LastRowCursor = m_RowCursor + 1;
    m_FirstVisibleRow = (m_RowCursor / m_VisibleRows) * m_VisibleRows; //div rounds
    get().cursorToBegin();
    relocateVisibleLines();
    //updateVisible();
    //logBufferState("end:insert(lines)");
  }//insert

  /**
   * Appends a line without recalculating the
   * visibility.
   * <p/>
   * This method should be when the visibility
   * will not change through the append, or if
   * the editor is doing a block update (loading
   * a file or paste).
   * </p>
   *
   * @param el
   */
  public void quickAppend(MicroEditline el)
      throws BufferOverflowException {
    m_Lines.add(el);
    m_RowCursor++;
  }//append

  /**
   * Append a line.
   *
   * @param el
   */
  public void append(MicroEditline el)
      throws BufferOverflowException {

    ensureSpace(1);
    m_Lines.add(el);
    m_LastRowCursor = m_RowCursor;
    m_RowCursor++; //advance a line
    updateVisible();
  }//append

  /**
   * Returns a line at a specific row cursor position.
   *
   * @param linenum
   * @return a {@link MicroEditline} instance.
   */
  public MicroEditline get(int linenum) {
    return (MicroEditline) m_Lines.get(linenum);
  }//get

  /**
   * Returns a line at the actual row cursor position.
   *
   * @return a {@link MicroEditline} instance.
   */
  public MicroEditline get() {
    return (MicroEditline) m_Lines.get(m_RowCursor);
  }//get


  /**
   * Clears the buffer.
   */
  public void clear() {
    m_Lines.clear();  //clear buffer
    m_FirstVisibleRow = 0;
    m_RowCursor = 0;
    m_LastRowCursor = 0;
  }//clear

  private void updateVisible() {
    if ((m_RowCursor - m_FirstVisibleRow) >= m_VisibleRows) {
      m_FirstVisibleRow += m_Scroll;
      return;
    }
    if ((m_RowCursor - m_FirstVisibleRow) < m_Wrap) {
      m_FirstVisibleRow -= m_Scroll;
      if (m_FirstVisibleRow < 0) {
        m_FirstVisibleRow = 0;
      }
    }
    if (m_RowCursor <= m_FirstVisibleRow) {
      m_FirstVisibleRow = m_RowCursor;
    }
  }//updateVisible

  public List getRowsToUpdate() {
    if (m_RowCursor < m_LastRowCursor) {
      return m_Lines.subList(
          m_FirstVisibleRow, minFrom(
          m_FirstVisibleRow, m_Lines.size() - m_FirstVisibleRow, m_VisibleRows
      )
      );
    } else {
      return m_Lines.subList(
          m_LastRowCursor, //start update from
          minFrom(0, m_VisibleRows + m_FirstVisibleRow, m_Lines.size() - 1) //last visible row
      );
    }
  }//getRowsToUpdate

  public List getVisibleRows() {
    return m_Lines.subList(
        m_FirstVisibleRow, minFrom(
        m_FirstVisibleRow, m_Lines.size() - m_FirstVisibleRow, m_VisibleRows
    )
    );
  }//getVisibleRows

  private void relocateVisibleLines() {
    int row = 2;
    for (int i = m_FirstVisibleRow; i < minFrom(m_FirstVisibleRow, m_VisibleRows, m_Lines.size() - m_FirstVisibleRow); i++) {
      get(i).setLocation(row++);
    }
  }//relocateVisibleLines

  private void ensureSpace(int rows) throws BufferOverflowException {
    if (!(m_Lines.size() + rows < m_MaxRows)) {
      throw new BufferOverflowException();
    }
  }//ensureSpace

  private static final int minFrom(int from, int n, int m) {
    return (n < m) ? n + from : m + from;
  }//min

  private void logBufferState(String met) {
    System.err.println(met + "()::m_RowCursor=" + m_RowCursor + "::m_LastRowCursor=" + m_LastRowCursor + "::m_FirstVisibleRow=" + m_FirstVisibleRow + "::size=" + m_Lines.size());
  }

}//class MicroLinesBuffer
