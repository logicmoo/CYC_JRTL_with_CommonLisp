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
package net.wimpi.telnetd.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import net.wimpi.telnetd.impl.Activator;

/**
 * Class implementing a <tt>TerminalOutputStream</tt>.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class TerminalOutputStream
    extends OutputStream {

  private ByteArrayOutputStream m_BytesOut;
  protected BasicTerminalIO m_TermIO;

  public TerminalOutputStream(BasicTerminalIO tio) {
    m_TermIO = tio;
    m_BytesOut = new ByteArrayOutputStream(4096);
  }//constructor

  public void write(byte[] chars, int off, int len) throws IOException {
    String str = new String(chars, off, len);
    m_TermIO.write(str);
    str = null;
  }//write


  /**
   * Returns the <tt>TerminalIO</tt> instance used for
   * the actual output.
   *
   * @return the terminal i/o instance.
   */
  public BasicTerminalIO getTermIO() {
    return m_TermIO;
  }//getTermIO

  /**
   * Writes a byte to the output buffer.
   *
   * @param i
   * @throws IOException
   */
  public void write(int i) throws IOException {
    m_BytesOut.write(i);
  }//write


  /**
   * Flushes the output buffer to the terminal.
   *
   * @throws IOException
   */
  public void flush() throws IOException {
    byte[] bytes = m_BytesOut.toByteArray();
    write(bytes, 0, bytes.length);
    m_BytesOut.reset();
    m_TermIO.flush();
  }//flush

  /**
   * NOOP
   *
   * @throws IOException
   */
  public void close() throws IOException {
    Activator.getServices().debug("close()");
  }//close

}//class TerminalOutputStream
