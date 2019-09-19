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
import java.net.Socket;
import java.util.List;

import net.lag.jaramiko.AuthError;
import net.lag.jaramiko.Channel;
import net.lag.jaramiko.ChannelError;
import net.lag.jaramiko.InteractiveQuery;
import net.lag.jaramiko.Message;
import net.lag.jaramiko.PKey;
import net.lag.jaramiko.ServerInterface;
import net.lag.jaramiko.ServerTransport;
import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.io.terminal.TerminalResizeListener;
import net.wimpi.telnetd.util.Latch;


class SSHSocket extends Socket
    implements SecureSocket {

  private ServerInterface m_ServerInterface;
  private ServerTransport m_Transport;
  private Channel m_Channel;
  private PKey m_Key;
  private boolean m_Initialized = false;
  private String m_Terminal;
  private int m_Height;
  private int m_Width;
  private String m_Username;

  private InputStream m_In = null;
  private OutputStream m_Out = null;
  private Latch m_Init;

  private TerminalResizeListener m_TerminalResizeListener;

/*
* Constructor for class SSHSocket.
*/

  public SSHSocket(PKey key) {
    super();
    m_ServerInterface = new ServerInterfaceImpl();
    m_Key = key;
  }//constructor

  public void initiate() throws IOException {
    m_Init = new Latch();
    m_Transport = new ServerTransport(this);
    m_Transport.addServerKey(m_Key);
    //Tracing
    //m_Transport.setLog(new ConsoleLog());
    //m_Transport.setServerBanner("java-telnetd-ssh");
    m_Transport.start(m_ServerInterface, TIMEOUT);
    m_Channel = m_Transport.accept(TIMEOUT);
    if (m_Channel == null) {
      return;
    }
    m_In = m_Channel.getInputStream();
    m_Out = m_Channel.getOutputStream();
    try {
      //give it time...might even take longer?? (argl)
      m_Init.attempt(TIMEOUT);
    } catch (InterruptedException e) {
      Activator.getServices().error("initiate()", e);
    }
    m_Initialized = true;
  }//initiate

  public synchronized InputStream getInputStream() throws IOException {
    if (m_Initialized) {
      return m_In;
    } else {
      return super.getInputStream();
    }
  }//getInputStream

  public synchronized OutputStream getOutputStream() throws IOException {
    if (m_Initialized) {
      return m_Out;
    } else {
      return super.getOutputStream();
    }
  }//getOutputStream

  public void setTerminalResizeListener(TerminalResizeListener l) {
    m_TerminalResizeListener = l;
  }//setTerminalResizeListener

  public void close() throws IOException {
    if (m_Initialized) {
      m_Channel.shutdownRead();
      m_Channel.shutdownWrite();
      m_Channel.close();
      m_Transport.close();
    }
    super.close();
  }//close

  public String getTerminal() {
    return m_Terminal;
  }//getTerminal

  public int getWidth() {
    return m_Width;
  }//getWidth

  public int getHeight() {
    return m_Height;
  }//getHeight

  public String getUsername() {
    return m_Username;
  }//getUsername

  class ServerInterfaceImpl implements ServerInterface {

    public int checkChannelRequest(String string, int id) {
      return ((id == 0 && "session".equals(string)) ? ChannelError.SUCCESS : ChannelError.CONNECT_FAILED);
    }//checkChannelRequest

    public String getAllowedAuths(String string) {
      return "none,password,publickey";
    }//getAllowedAuths

    public int checkAuthNone(String string) {
      m_Username = string;
      return AuthError.SUCCESS;
    }//checkAuthError

    public int checkAuthPassword(String string, String string1) {
      //System.out.println("password:" + string + "::" + string1 );
      return AuthError.SUCCESS;
    }//checkAuthPassword

    public int checkAuthPublicKey(String string, PKey pKey) {
      //System.out.println("pubkey:" + string + "::" + pKey.toString() );
      return AuthError.SUCCESS;
    }//checkAuthPublicKey

    public InteractiveQuery checkAuthInteractive(String string, String[] strings) {
      return null;
    }//checkAuthInteractive

    public int checkAuthInteractiveResponse(String[] strings) {
      return 0;
    }//

    public List checkGlobalRequest(String string, Message message) {
      return null;
    }//checkGlobalRequest
/*
    public boolean checkChannelPTYRequest(Channel channel, String s, int i, int i1, int i2, int i3, TerminalModes terminalModes) {
      m_Terminal = s;
      m_Height = i1;
      m_Width = i;
      if (SSHSocket.this.m_TerminalResizeListener != null) {
        m_TerminalResizeListener.terminalResized(m_Width, m_Height);
      }
      //Activator.getServices().debug("checkChannelPTYRequest()");
      ///Activator.getServices().debug("::term=" + m_Terminal);
      //Activator.getServices().debug("::width=" + m_Width);
      //Activator.getServices().debug("::height=" + m_Height);
      ///Activator.getServices().debug("::modes=" + modes.toString());
      return true;
    }
*/
    public boolean checkChannelPTYRequest(Channel channel, String string, int i, int i1, int i2, int i3, String modes) {
      m_Terminal = string;
      m_Height = i1;
      m_Width = i;
      if (SSHSocket.this.m_TerminalResizeListener != null) {
        m_TerminalResizeListener.terminalResized(m_Width, m_Height);
      }
      //Activator.getServices().debug("checkChannelPTYRequest()");
      ///Activator.getServices().debug("::term=" + m_Terminal);
      //Activator.getServices().debug("::width=" + m_Width);
      //Activator.getServices().debug("::height=" + m_Height);
      ///Activator.getServices().debug("::modes=" + modes.toString());
      return true;
    }//checkChannelPTYRequest

    public boolean checkChannelShellRequest(Channel channel) {
      m_Init.release();
      return true;
    }//checkChannelRequest

    public boolean checkChannelExecRequest(Channel channel, String string) {
      return false;
    }//checkChannelExecRequest

    public boolean checkChannelSubsystemRequest(Channel channel, String string) {
      return false;
    }//checkChannelSubsystemRequest

    public boolean checkChannelWindowChangeRequest(Channel channel, int i, int i1, int i2, int i3) {
      if (m_Channel.equals(channel)) {
        m_Height = i1;
        m_Width = i;
        if (SSHSocket.this.m_TerminalResizeListener != null) {
          m_TerminalResizeListener.terminalResized(m_Width, m_Height);
        }
        return true;
      }
      return false;
    }//checkChannelWindowChangeRequest

  }//inner class ServerInterfaceImpl

  private static final int TIMEOUT = 1000 * 60 * 5;

}//SSHSocket