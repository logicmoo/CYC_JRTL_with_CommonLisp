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

import java.text.BreakIterator;

import net.wimpi.telnetd.io.toolkit.BufferOverflowException;

/**
 * Provides a line edit buffer with horizontal block
 * scrolling.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
class LineEditBuffer {

  protected StringBuffer m_Buf;
  protected int m_Pos = 0;
  protected int m_VisibleLength;
  protected int m_FirstVisiblePos;
  protected int m_Wrap = 8;
  protected int m_Scroll;
  protected int m_LastCorrection = 0;

  protected boolean m_InsertMode = true;

  public LineEditBuffer(int vlen) {
    m_Buf = new StringBuffer(2048);
    m_VisibleLength = vlen;
    m_FirstVisiblePos = 0;
    m_Scroll = m_VisibleLength - m_Wrap;
  }//constructor

  public boolean isInsertMode() {
    return m_InsertMode;
  }//isInsertMode

  public void setInsertMode(boolean insertMode) {
    m_InsertMode = insertMode;
  }//setInsertMode

  public int getColumnCursor() {
    return m_Pos - m_FirstVisiblePos + 1;
  }//getColumnCursor

  public void setCursor(int pos) {
    if (pos > m_Buf.length()) {
      pos = m_Buf.length();
    } else if (pos < 0) {
      pos = 0;
    }
    m_Pos = pos;
    updateVisibility();
  }//setCursor

  public int size() {
    return m_Buf.length();
  }//size

  private boolean hasSpace() {
    //logState("hasSpace");
    return (m_Buf.length() < MAX_CHARS);
  }//hasSpace

  public void clear() {
    //logState("clear");
    m_Buf = new StringBuffer();
    m_Pos = 0;
    m_FirstVisiblePos = 0;
  }//clear

  public void append(char c) {
    //logState("append");
    m_Buf.append(c);
    m_Pos++;
    updateVisibility();
  }//append

  public void setValue(String str)
      throws BufferOverflowException {
    if (str.length() > MAX_CHARS) {
      throw new BufferOverflowException();
    }
    m_Buf = new StringBuffer(str);
    m_Pos = 0;
    m_FirstVisiblePos = 0;
  }//setValue

  public boolean left() {
    if (m_Pos == 0) {
      return false;
    } else {
      m_Pos--;
      updateVisibility();
      return true;
    }
  }//left

  public boolean right() {
    if (m_Pos >= m_Buf.length()) {
      return false;
    } else {
      m_Pos++;
      updateVisibility();
      return true;
    }
  }//right

  public boolean atEnd() {
    //logState("atEnd");
    return (m_Pos == m_Buf.length());
  }//atEnd

  public boolean toEnd() {
    if (atEnd()) {
      return false;
    }
    m_Pos = m_Buf.length();
    updateVisibility();
    return true;
  }//toEnd

  public boolean atStart() {
    return m_Pos == 0;
  }//atStart

  public boolean toStart() {
    if (atStart()) {
      return false;
    }
    m_Pos = 0;
    updateVisibility();
    return true;
  }//toStart

  public boolean hasVisibleSpace() {
    return (m_Pos - m_FirstVisiblePos) >= m_VisibleLength;
  }//hasVisibleSpace

  public boolean removeLastWord() {
    if (m_Pos == 0) {
      return false;
    }
    //Figure word boundaries
    //1. fix end to position
    int toidx = Math.min(m_Buf.length(), m_Pos);
    //System.out.println("==> buflen=" + m_Buf.length() + "::pos=" + m_Pos + "::toidx=" + toidx);

    //2. search backwards until we got a space,
    //   but don't account for spaces before a string started
    int fromidx = 0;
    boolean wordstarted = false;
    for (int i = toidx - 1; i >= 0; i--) {
      if (m_Buf.charAt(i) == ' ') {
        if (wordstarted) {
          fromidx = i + 1;
          break;
        }
      } else {
        wordstarted = true;
      }
    }
    //System.out.println("==> fromidx=" + fromidx + "::toidx=" + toidx);
    //3. Remove from to
    m_Buf.delete(fromidx, toidx);
    //4. correct pos
    m_Pos = fromidx;
    updateVisibility();
    return true;
  }//removeLastWord

  public boolean nextWord() {
    if (atEnd()) {
      return false;
    }

    //1. Fix end to position
    int toidx = m_Buf.length();
    BreakIterator wb = BreakIterator.getWordInstance();
    wb.setText(m_Buf.toString());
    if(m_Pos+1 == toidx) {
      m_Pos+=1;
      updateVisibility();
      return true;
    }
    //2. search forward to boundary, not space
    for (int i = m_Pos+1; i < toidx; i++) {
      m_Pos = i;
      if (wb.isBoundary(i)) {
        break;
      }
    }
    updateVisibility();
    return true;
  }//wordForward

  public boolean previousWord() {
    //logState("previousWord::start");
    if (m_Pos == 0) {
      return false;
    }
    //1. Fix end to position
    int fromidx = Math.min(m_Buf.length(), m_Pos) - 1;
    BreakIterator wb = BreakIterator.getWordInstance();
    wb.setText(m_Buf.toString());

    //2. search backwards to boundary, not space
    for (int i = fromidx; i >=0; i--) {
      m_Pos = i;
      if (wb.isBoundary(i)) {
        break;
      }
    }
    updateVisibility();
    //logState("previousWord::end");
    return true;
  }//lastWord

  public boolean putChar(char c) {
    if (!hasSpace()) {
      return false;
    }
    if (atEnd()) {
      append(c);
    } else {
      if (m_InsertMode) {
        insert(c);
      } else {
        overwrite(c);
      }
    }
    return true;
  }//putChar

  public boolean removeChar() {
    //logState("removeChar");
    if (atEnd()) {
      return false;
    } else {
      m_Buf.deleteCharAt(m_Pos);
      updateVisibility();
      return true;
    }
  }//removeChar

  public boolean removeLastChar() {
    //logState("removeLastChar");
    if (m_Pos > 0) {
      //delete
      m_Pos--;
      m_Buf.deleteCharAt(m_Pos);
      //update first visible
      updateVisibility();
      return true;
    } else {
      return false;
    }
  }//removeLastChar

  protected void updateVisibility() {

    if ((m_Pos - m_FirstVisiblePos) >= m_VisibleLength) {
      m_FirstVisiblePos += m_Scroll;
      return;
    }
    if ((m_Pos - m_FirstVisiblePos) < m_Wrap) {
      m_FirstVisiblePos -= m_Scroll;
      if (m_FirstVisiblePos < 0) {
        m_FirstVisiblePos = 0;
      }
    }
    if (m_Pos <= m_FirstVisiblePos) {
      m_FirstVisiblePos = m_Pos;
    }
  }//updateVisibility

  public void insert(char c) {
    //logState("insert");
    m_Buf.insert(m_Pos, c);
    m_Pos++;
    updateVisibility();
  }//insert

  public void overwrite(char c) {
    //logState("overwrite");
    m_Buf.setCharAt(m_Pos, c);
  }//overwrite

  public char actualChar() {
    if (m_Buf.length() == 0) {
      return (char) -1;
    }
    return m_Buf.charAt((m_Pos < m_Buf.length()) ? m_Pos : 0);
  }//charAt

  public char charAt(int idx) {
    try {
      return m_Buf.charAt(idx);
    } catch (IndexOutOfBoundsException ex) {
      return (char) -1;
    }
  }//charAt

  public String toString() {
    return m_Buf.toString();
  }//toString

  public String viewString() {
    int buflen = m_Buf.length();
    if (m_VisibleLength > buflen) {
      m_LastCorrection = buflen - m_Pos;
      return m_Buf.toString();
    } else {
      int min = minFrom(m_FirstVisiblePos, buflen - m_FirstVisiblePos, m_VisibleLength);
      if (m_Pos == m_Buf.length()) {
        m_LastCorrection = 0;
      } else {
        m_LastCorrection = min - m_Pos;
      }
      return m_Buf.substring(m_FirstVisiblePos, minFrom(m_FirstVisiblePos, buflen - m_FirstVisiblePos, m_VisibleLength));
    }
  }//viewString

  public String cutWrap() {
    final String str = m_Buf.substring(m_Pos);
    m_Buf.delete(m_Pos, m_Buf.length());
    return str;
  }//cutWrap

  public String substring(int start, int end) {
    return m_Buf.substring(start, end);
  }//substring

  public int position() {
    return m_Pos;
  }//position

  public int remaining() {
    return m_Buf.length() - m_Pos;
  }//remaining

  public int cursorCorrection() {
    return m_LastCorrection;
  }//cursorCorrection

  public int firstVisible() {
    return m_FirstVisiblePos;
  }//firstVisible

  public final void logState(String str) {
    // Activator.getServices().debug
    System.out.println(str + "()::" + "pos=" + position() + " char=" + charAt(m_Pos) + "::fv=" + firstVisible() + " char=" + charAt(firstVisible()) + "::length=" + size() + "::content=" + toString() + "::view=" + viewString());
  }//logState

  private static final int minFrom(int from, int n, int m) {
    return (n < m) ? n + from : m + from;
  }//min

  public static final int MAX_CHARS = 2048; //2k max per line

}//class EditBuffer
