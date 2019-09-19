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

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.util.StringUtil;

/**
 * Provides a smooth scrolling edit buffer for
 * other {@link ActiveComponent} instances.
 * <p/>
 * The buffer supports hidden input content,
 * through {@link #setHideChar(char)} and
 * {@link #hiddenViewString()}.
 * </p>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
class EditBuffer {

  protected StringBuffer m_Buf;
  protected int m_Pos = 0;
  protected int m_ViewLength;
  protected int m_FirstVisiblePos;
  protected boolean m_InsertMode = true;
  protected int m_MaxLength = -1;
  protected char m_HideChar = '*';

  public EditBuffer(int vlen, int length) {
    m_MaxLength = length;
    m_Buf = new StringBuffer(length);
    m_ViewLength = vlen;
    m_FirstVisiblePos = 0;
  }//constructor

  public EditBuffer(int vlen) {
    m_Buf = new StringBuffer(2048);
    m_ViewLength = vlen;
    m_FirstVisiblePos = 0;
  }//constructor

  public boolean isInsertMode() {
    return m_InsertMode;
  }//isInsertMode

  public void setInsertMode(boolean insertMode) {
    m_InsertMode = insertMode;
  }//setInsertMode

  public int size() {
    return m_Buf.length();
  }//size

  private boolean hasSpace() {
    logState("hasSpace");
    if (m_MaxLength < 0) {
      return true;
    } else {
      return m_Buf.length() <= m_MaxLength;
    }
  }//hasSpace

  public void clear() {
    logState("clear");
    m_Buf = new StringBuffer();
    m_Pos = 0;
    m_FirstVisiblePos = 0;
  }//clear

  public void append(char c) {
    logState("append");
    m_Buf.append(c);
    m_Pos++;
    updateFirstVisible();
  }//append

  public void setValue(String str)
      throws BufferOverflowException {
    if (m_MaxLength > 0 && str.length() > m_MaxLength) {
      throw new BufferOverflowException();
    }
    m_Buf = new StringBuffer(str);
    m_Pos = str.length();
    updateFirstVisible();
  }//setValue

  public void appendValue(String str)
      throws BufferOverflowException {
    if (m_MaxLength > 0 && str.length() > m_MaxLength) {
      throw new BufferOverflowException();
    }
    m_Buf.append(str);
    //m_Pos+=str.length();  //don't update pos
    updateFirstVisible();
  }//setValue
  

  public boolean left() {
    if (m_Pos == 0) {
      return false;
    } else {
      m_Pos--;
      updateFirstVisible();
      return true;
    }
  }//left

  public boolean right() {
    if (m_Pos >= m_Buf.length()) {
      return false;
    } else {
      m_Pos++;
      updateFirstVisible();
      return true;
    }
  }//right

  public boolean atEnd() {
    //logState("atEnd");
    return (m_Pos == m_Buf.length());
  }//atEnd

  public boolean hasVisibleSpace() {
    return m_Pos - m_FirstVisiblePos > m_ViewLength;
  }//hasVisibleSpace

  public boolean toEnd() {
    if (atEnd()) {
      return false;
    }
    m_Pos = m_Buf.length();
    updateFirstVisible();
    return true;
  }//toEnd

  public boolean toStart() {
    if (m_Pos == 0) {
      return false;
    }
    m_Pos = 0;
    updateFirstVisible();
    return true;
  }//toStart

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
    logState("removeChar");
    if (atEnd()) {
      return false;
    } else {
      m_Buf.deleteCharAt(m_Pos);
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
      updateFirstVisible();
      return true;
    } else {
      return false;
    }
  }//removeLastChar

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
    updateFirstVisible();
    return true;
  }//removeLastWord

  protected void updateFirstVisible() {
    if (m_Pos - m_FirstVisiblePos > m_ViewLength) {
      m_FirstVisiblePos++;
      return;
    }
    if (m_Pos - m_FirstVisiblePos < m_ViewLength) {
      m_FirstVisiblePos--;
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
    updateFirstVisible();
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
    if (m_ViewLength > buflen) {
      return StringUtil.appendSpaces(m_Buf.toString(), m_ViewLength - buflen);
    } else {
      Activator.getServices().debug("viewString()::firstvis=" + m_FirstVisiblePos);
      return m_Buf.substring(m_FirstVisiblePos, m_ViewLength + m_FirstVisiblePos);
    }
  }//viewString

  public char getHideChar() {
    return m_HideChar;
  }//getHideChar

  public void setHideChar(char hideChar) {
    m_HideChar = hideChar;
  }//setHideChar

  public String hiddenViewString() {
    int buflen = m_Buf.length();
    final StringBuffer sbuf = new StringBuffer();
    if (m_ViewLength > buflen) {
      StringUtil.appendCharacter(sbuf, m_HideChar, buflen);
      return StringUtil.appendSpaces(sbuf, m_ViewLength - buflen).toString();
    } else {
      //Activator.getServices().debug("viewString()::firstvis=" + m_FirstVisiblePos);
      return StringUtil.appendCharacter(sbuf, m_HideChar, m_ViewLength).toString();
    }
  }//hiddenViewString

  public String substring(int start, int end) {
    return m_Buf.substring(start, end);
  }//substring

  public int position() {
    return m_Pos;
  }//position

  public int remaining() {
    return m_Buf.length() - m_Pos;
  }//remaining

  public int remainingVisible() {
/*    int buflen = m_Buf.length();
    if(buflen <= m_VisibleLength) {
      return m_FirstVisiblePos + buflen - m_Pos;
    } else {
      return m_FirstVisiblePos + m_VisibleLength - m_Pos;
    }
*/
    return m_FirstVisiblePos + m_ViewLength - m_Pos;
  }//remainingVisible

  public int firstVisible() {
    return m_FirstVisiblePos;
  }//firstVisible


  public static void main(String[] args) {
    //BasicConfigurator.configure();
    EditBuffer buf = new EditBuffer(4, 20);
    //buf.setValue("ab");
    buf.append('a');
    buf.logState("");
    buf.append('b');
    buf.logState("");
    buf.append('c');
    buf.logState("");
    buf.append('d');
    buf.logState("");

    Activator.getServices().debug(buf.viewString());
    for (int i = 0; buf.right(); i++) {
      Activator.getServices().debug("right:" + i);
      buf.logState("");
    }

    for (int i = 0; buf.left(); i++) {
      Activator.getServices().debug("left:" + i);
      buf.logState("");
    }

    for (int i = 0; buf.right(); i++) {
      Activator.getServices().debug("right:" + i);
      buf.logState("");
    }

    for (int i = 0; buf.left(); i++) {
      Activator.getServices().debug("left:" + i);
      buf.logState("");
    }

  }//main

  public final void logState(String str) {
    //if(Activator.getServices().isDebugEnabled()) {
    //Activator.getServices().debug("pos=" + position() + " char=" + actualChar() + "::fv=" + firstVisible());
    //  Activator.getServices().debug(str + "()::" + "pos=" + position() + " char=" + charAt(m_Pos) + "::fv=" + firstVisible() + " char=" + charAt(firstVisible()) + "::length=" + size() + "::content=" + toString() + "::view=" + viewString());
    //}
  }//logState

}//class EditBuffer
