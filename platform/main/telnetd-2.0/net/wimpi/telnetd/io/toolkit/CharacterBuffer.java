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

import java.util.ArrayList;

/**
 * Provides a character buffer for {@link ActiveComponent}
 * instances.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
class CharacterBuffer {

  //Members
  private ArrayList m_Buffer;
  private int m_Size;

  public CharacterBuffer(int size) {
    if (size == -1) {
      m_Buffer = new ArrayList(100);
    } else {
      m_Buffer = new ArrayList(size);
    }
    m_Size = size;
  }//constructor

  public char getCharAt(int pos)
      throws IndexOutOfBoundsException {

    return ((Character) m_Buffer.get(pos)).charValue();
  }//getCharAt

  public void setCharAt(int pos, char ch)
      throws IndexOutOfBoundsException {

    m_Buffer.set(pos, new Character(ch));
  }//setCharAt

  public void insertCharAt(int pos, char ch)
      throws BufferOverflowException, IndexOutOfBoundsException {

    m_Buffer.add(pos, new Character(ch));
  }//insertCharAt

  public void append(char aChar)
      throws BufferOverflowException {

    m_Buffer.add(new Character(aChar));
  }//append

  public void append(String str)
      throws BufferOverflowException {
    for (int i = 0; i < str.length(); i++) {
      append(str.charAt(i));
    }
  }//append

  public void removeCharAt(int pos)
      throws IndexOutOfBoundsException {

    m_Buffer.remove(pos);
  }//removeCharAt

  public void clear() {
    m_Buffer.clear();
  }//clear

  public int size() {
    return m_Buffer.size();
  }//size

  public String toString() {
    final StringBuffer sbuf = new StringBuffer();
    for (int i = 0; i < m_Buffer.size(); i++) {
      sbuf.append(((Character) m_Buffer.get(i)).charValue());
    }
    return sbuf.toString();
  }//toString

  public String view(int start, int len) {
    final StringBuffer sbuf = new StringBuffer();
    final int end = start + len;
    for (int i = start; i < end; i++) {
      sbuf.append(((Character) m_Buffer.get(i)).charValue());
    }
    return sbuf.toString();
  }//toString

  public void ensureSpace(int chars)
      throws BufferOverflowException {
    if (m_Size == -1) {
      return;
    }
    if (chars > (m_Size - m_Buffer.size())) {
      throw new BufferOverflowException();
    }
  }//ensureSpace

}//class CharacterBuffer