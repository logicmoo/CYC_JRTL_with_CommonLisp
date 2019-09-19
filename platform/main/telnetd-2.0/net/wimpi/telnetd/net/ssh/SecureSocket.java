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
package net.wimpi.telnetd.net.ssh;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import net.wimpi.telnetd.io.terminal.TerminalResizeListener;

/**
 * Defines an interface for a secure socket.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public interface SecureSocket {

  /**
   * Returns the requested terminal type.
   *
   * @return a terminal type string.
   */
  public String getTerminal();

  /**
   * Returns the requested width.
   *
   * @return the requested width.
   */
  public int getWidth();

  /**
   * Returns the requested height.
   *
   * @return the requested height.
   */
  public int getHeight();

  /**
   * Returns the <tt>java.io.InputStream</tt> of
   * this <tt>SecureSocket</tt>.
   *
   * @return a <tt>java.io.InputStream</tt> instance.
   * @throws IOException if an I/O error occurs.
   */
  public InputStream getInputStream() throws IOException;

  /**
   * Returns the <tt>java.io.OutputStream</tt> of
   * this <tt>SecureSocket</tt>.
   *
   * @return a <tt>java.io.OutputStream</tt> instance.
   * @throws IOException if an I/O error occurs.
   */
  public OutputStream getOutputStream() throws IOException;

  /**
   * Sets the terminal resize listener that will receive low level incoming
   * size changes.
   *
   * @param l the {@link TerminalResizeListener}.
   */
  public void setTerminalResizeListener(TerminalResizeListener l);

  /**
   * Returns the username passed in to the ssh connection.
   * @return the username as string.
   */
  public String getUsername();

  /**
   * Initiates the connection.
   */
  public void initiate() throws IOException;

}//interface SecureSocket
