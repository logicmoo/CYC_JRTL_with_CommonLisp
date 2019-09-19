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
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

import net.wimpi.telnetd.net.Connection;
import net.wimpi.telnetd.net.ConnectionData;
import net.wimpi.telnetd.net.ssh.SecureSocket;

/**
 * Implements a {@link BaseIO} for a the SSH stream input.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class StreamIO
    implements BaseIO {

  private Connection m_Connection;
  private ConnectionData m_ConnectionData;
  private boolean m_CRFlag;
  //Byte based i/o
  private InputStream m_Input;
  private OutputStream m_Output;
  //Character based i/o
  private Reader m_Reader;
  private String m_Encoding = "UTF-8";

  public void initIO() throws IOException {
    m_ConnectionData = m_Connection.getConnectionData();
    if (m_ConnectionData.isSecure()) {
      SecureSocket s = (SecureSocket) m_ConnectionData.getSocket();
      m_Input = s.getInputStream();
      m_Output = s.getOutputStream();
      m_ConnectionData.setTerminalGeometry(s.getWidth(), s.getHeight());
      m_ConnectionData.setNegotiatedTerminalType(s.getTerminal());
      m_ConnectionData.getEnvironment().put("login.username", s.getUsername());
    } else {
      Socket s = m_ConnectionData.getSocket();
      m_Input = s.getInputStream();
      m_Output = s.getOutputStream();
    }
    m_Reader = new InputStreamReader(m_Input, m_Encoding);
  }//initIO

  public void setConnection(Connection con) {
    m_Connection = con;
  }//setConnection

  /**
   * Method to output a byte. Ensures that CR(\r) is never send
   * alone,but CRLF(\r\n), which is a rule of the telnet protocol.
   *
   * @param b Byte to be written.
   */
  public void write(byte b)
      throws IOException {
    //try {
    //ensure CRLF(\r\n) is written for LF(\n) to adhere
    //to the protocol.
    if (!m_CRFlag && b == 10) {
      m_Output.write(13);
    }
    //ensure CRLF(\r\n) is written for CR(\r) to adhere
    //to the protocol.
    if (m_CRFlag && b != 10) {
      m_Output.write(10);
    }

    m_Output.write(b);
    //log.debug("write(byte)::" + b);
    if (b == 13) {
      m_CRFlag = true;
    } else {
      m_CRFlag = false;
    }
  }//write(byte)

  public void write(int i) throws IOException {
    m_Output.write(i);
  }//write

  public void write(byte[] sequence) throws IOException {
    m_Output.write(sequence);
  }//write

  public void write(int[] sequence) throws IOException {
    for (int j = 0; j < sequence.length; j++) {
      write((byte) sequence[j]);
    }
  }//write

  public void write(char ch) throws IOException {
    write(Character.toString(ch));
  }//write

  public void write(String str) throws IOException {
    write(str.getBytes("UTF-8"));
  }//write

  public void flush() throws IOException {
    m_Output.flush();
  }//flush

  public void close() {
    try {
      m_Output.close();
    } catch (Exception ex) {
    }
    try {
      m_Input.close();
    } catch (Exception ex) {
    }
    //cleanup resources
    m_Connection = null;
    m_ConnectionData = null;
    m_Input = null;
    m_Output = null;
  }//close

  public InputStream getInputStream() {
    return m_Input;
  }//getInputStream

  public OutputStream getOutputStream() {
    return m_Output;
  }//getOutputStream

  /**
   * Method to read a byte from the InputStream.
   * Invokes the IACHandler upon IAC (Byte=255).
   *
   * @return int read from stream.
   */
  public int read() throws IOException {
    int i = -1;
    i = m_Input.read();
    //log activity
    m_ConnectionData.activity();

    if (i == CR) {
      return LF;
    }
    return i;
  }//read

  public int readCharacter() throws IOException {
    int i = -1;
    i = m_Reader.read();
    //log activity
    m_ConnectionData.activity();

    if (i == CR) {
      return LF;
    }
    return i;
  }

  public void setEncoding(String enc) throws UnsupportedEncodingException {
    m_Reader = new InputStreamReader(m_Input, enc);
    m_Encoding = enc;
  }//setEncoding

  public String getEncoding() {
    return m_Encoding;
  }//getEncoding

}//class StreamIO
