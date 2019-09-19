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
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * <tt>FilterReader</tt> for reading pasted text, that should handle input
 * in a stable way, reading UTF-8 characters, discarding control characters
 * and managing linebreaks.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
class PastedReader extends FilterReader {

  private int m_LineWidth;
  private boolean m_SkipLF = false;
  private boolean m_EOF = false;

  public PastedReader(InputStream in, int linewidth)
      throws UnsupportedEncodingException {
    super(new BufferedReader(new InputStreamReader(in, "UTF-8")));
    m_LineWidth = linewidth;
  }//constructor

  public String readLine() throws IOException {
    //check EOF flag
    if (m_EOF) {
      return null;
    }
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < m_LineWidth; i++) {
      int c = in.read();

      //check for end paste
      if (c == 16 || c == -1) {
        if (sb.length() > 0) {
          m_EOF = true;
          return sb.toString();
        } else {
          return null;
        }
      }
      //reset linefeed skipper flag
      if (c != 10 && m_SkipLF) {
        m_SkipLF = false;
      }

      //filter and check linebreaks
      if (c == 10) {
        if (m_SkipLF) {
          m_SkipLF = false;
          //but skip it too
        } else {
          break;
        }
      } else if (c == 13) {
        m_SkipLF = true;  //flag skip next lf
        break;
      } else if (c <= 20) {         //Control
        //ignore
        continue;
      } else {
        sb.append((char) c);
      }
    }
    return sb.toString();
  }//readLine

}//class PastedReader
