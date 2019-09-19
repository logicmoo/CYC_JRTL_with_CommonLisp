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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import net.wimpi.telnetd.net.Connection;

/**
 * Defines the <tt>BaseIO</tt> interface.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public interface BaseIO {

  public void initIO() throws IOException;

  /**
   * Sets the {@link Connection}.
   *
   * @param con a {@link Connection} instance.
   */
  public void setConnection(Connection con);

  /**
   * Writes a byte to the output.
   *
   * @param b Byte to be written.
   * @throws IOException if an I/O error occurs.
   */
  public void write(byte b) throws IOException;

  /**
   * Method to output an int.
   *
   * @param i Integer to be written.
   * @throws IOException if an I/O error occurs.
   */
  public void write(int i) throws IOException;

  /**
   * Method to write an array of bytes.
   *
   * @param sequence byte[] to be written.
   * @throws IOException if an I/O error occurs.
   */
  public void write(byte[] sequence) throws IOException;

  /**
   * Method to output an array of int' s.
   *
   * @param sequence int [] to write
   * @throws IOException if an I/O error occurs.
   */
  public void write(int[] sequence) throws IOException;

  /**
   * Method to write a char.
   *
   * @param ch char to be written.
   * @throws IOException if an I/O error occurs.
   */
  public void write(char ch) throws IOException;

  /**
   * Method to output a string.
   *
   * @param str String to be written.
   * @throws IOException if an I/O error occurs.
   */
  public void write(String str) throws IOException;

  /**
   * Method to flush all buffered output.
   *
   * @throws IOException if an I/O error occurs.
   */
  public void flush() throws IOException;

  /**
   * Method to read a byte from the InputStream.
   *
   * @return int read from stream.
   * @throws IOException if an I/O error occurs.
   */
  public int read() throws IOException;

  /**
   * Method to read a character from the InputStream using the set encoding.
   *
   * @return int the character read from stream.
   * @throws IOException if an I/O error occurs.
   */
  public int readCharacter() throws IOException;

  /**
   * Closes the underlying I/O.
   */
  public void close();

  /**
   * Returns the raw <tt>InputStream</tt>.
   *
   * @return a <tt>InputStream</tt>.
   */
  public InputStream getInputStream();

  /**
   * Returns the raw <tt>OutputStream</tt>.
   * @return a <tt>OutputStream</tt>.
   */
  public OutputStream getOutputStream();

  /**
   * Returns the actual encoding.
   * @return encoding identifier string.
   */
  public String getEncoding();

  /**
   * Sets an encoding.
   * @param enc the encoding identifier string.
   * @throws UnsupportedEncodingException if the encoding is not supported by the JVM.
   */
  public void setEncoding(String enc) throws UnsupportedEncodingException;

  public static final byte CR = 13;
  public static final byte LF = 10;

}//interface BaseIO
