///***
// * Java TelnetD library (embeddable telnet daemon)
// * Copyright (c) Dieter Wimberger
// * All rights reserved.
// *
// * Redistribution and use in source and binary forms, with or without
// * modification, are permitted provided that the following conditions are
// * met:
// * Redistributions of source code must retain the above copyright notice,
// * this list of conditions and the following disclaimer.
// * Redistributions in binary form must reproduce the above copyright notice,
// * this list of conditions and the following disclaimer in the documentation
// * and/or other materials provided with the distribution.
// *
// * Neither the name of the author nor the names of its contributors
// * may be used to endorse or promote products derived from this software
// * without specific prior written permission.
// *
// * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
// * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
// * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
// * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
// * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
// * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
// * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
// * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// * POSSIBILITY OF SUCH DAMAGE.
// ***/
//package net.wimpi.telnetd.impl;
//
//import net.lag.jaramiko.PKey;
//import net.wimpi.telnetd.net.ConnectionManager;
//import net.wimpi.telnetd.net.ssh.SSHServerSocket;
//import net.wimpi.telnetd.service.ConnectionFilter;
//import net.wimpi.telnetd.service.TelnetListenerService;
//import net.wimpi.telnetd.util.DictionaryUtility;
//import net.wimpi.telnetd.util.SSH2KeyGenerator;
//import org.osgi.framework.Constants;
//import org.osgi.service.cm.ConfigurationException;
//
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.net.SocketException;
//import java.net.URL;
//import java.util.Dictionary;
//
///**
// * This class implements {@link TelnetListenerService}.
// * <p/>
// *
// * @author Dieter Wimberger (wimpi)
// * @version @version@ (@date@)
// */
//class TelnetListenerServiceImpl
//    implements TelnetListenerService {
//
//  private ServiceMediator m_Services;
//  private String m_Name;
//  private int m_Port;                          //port number running on
//  private int m_FloodProtection;              //flooding protection
//  private ServerSocket m_ServerSocket = null; //server socket
//  private ConnectionManager m_ConnectionManager;
//  private PKey m_SSHListenerKey;
//
//  private Thread m_Thread;
//  private boolean m_Started = false;
//  private boolean m_Stopping = false;
//  private boolean m_Available;
//  private boolean m_Secure = false;
//
//  /**
//   * Constructs a new {@link TelnetListenerService} instance.
//   */
//  public TelnetListenerServiceImpl() {
//    m_ConnectionManager = new ConnectionManager();
//    m_Services = Activator.getServices();
//  }//constructor
//
//  /**
//   * Returns the name of this <tt>PortListener</tt>.
//   *
//   * @return the name as <tt>String</tt>.
//   */
//  public String getName() {
//    return m_Name;
//  }//getName
//
//  /**
//   * Starts this {@link TelnetListenerService} instance.
//   */
//  public void start() {
//    m_Services.info("Starting TelnetListenerService named " + getName());
//    if (m_ConnectionManager == null) {
//      m_ConnectionManager = new ConnectionManager();
//    }
//    m_ConnectionManager.start();
//    //m_Stopping = false;
//    m_Thread = new Thread(new Runner());
//    m_Thread.setContextClassLoader(getClass().getClassLoader());
//    m_Thread.start();
//    m_Available = true;
//  }//start
//
//  /**
//   * Stops  this {@link TelnetListenerService} instance,
//   * returning when everything was stopped successfully.
//   */
//  public void stop() {
//    if (isStarted()) {
//      m_Services.debug("stop()::" + this.toString());
//      //flag stop
//      m_Started = false;
//      m_Stopping = true;
//      m_Available = false;
//      //take down all connections
//      m_ConnectionManager.stop();
//
//      //close server socket
//      try {
//        m_ServerSocket.close();
//      } catch (IOException ex) {
//        m_Services.error("stop()", ex);
//      }
//
//      //wait for thread to die
//      try {
//        m_Thread.join();
//      } catch (InterruptedException iex) {
//        m_Services.error("stop()", iex);
//      }
//
//      m_Thread = null;
//      m_ServerSocket = null;
//      m_ConnectionManager = null;
//      m_SSHListenerKey = null;
//      m_Services.info("stop()::Stopped " + this.toString());
//    }
//  }//stop
//
//  public boolean isStarted() {
//    return m_Started;
//  }//isStarted
//
//  public void setConnectionFilter(ConnectionFilter filter) {
//    m_ConnectionManager.setConnectionFilter(filter);
//  }//setConnectionFilter
//
//  public ConnectionFilter getConnectionFilter() {
//    return m_ConnectionManager.getConnectionFilter();
//  }//getConnectionFilter
//
//  public void configure(Dictionary conf)
//      throws ConfigurationException {
//      m_Services.debug(conf.toString());
//      m_Available = false;
//      m_Name = DictionaryUtility.getString(conf, CONFKEY_NAME);
//      m_Port = DictionaryUtility.getInt(conf, CONFKEY_PORT);
//      m_FloodProtection = DictionaryUtility.getInt(conf, CONFKEY_FLOODPROT);
//      m_Secure = DictionaryUtility.getBool(conf, CONFKEY_SECURE);
//      if (m_Secure) {
//        //try load server key
//        String pk = DictionaryUtility.getString(conf, CONFKEY_PKEY);
//        String pass = DictionaryUtility.getString(conf, CONFKEY_PKEYPASS);
//        if ((pk == null || pk.length() == 0) && (pass == null || pass.length() == 0)) {
//          try {
//            //create key file
//            final String pid = DictionaryUtility.getString(conf, Constants.SERVICE_PID);
//            File key = new File(Activator.getDataDir(), pid);
//            pass = pid;
//            if (!key.exists()) {
//              //generate
//              FileOutputStream fout = new FileOutputStream(key);
//              String fprint = SSH2KeyGenerator.createSSH2Key(fout, pass, 2048);
//              m_Services.info("Generated persistent 2048 bit key::" + pid + "::" + fprint);
//            }
//            //read in
//            m_SSHListenerKey = PKey.readPrivateKeyFromStream(new FileInputStream(key), pass);
//          } catch (Exception ex) {
//            ex.printStackTrace(System.err);
//            m_Services.error("configure()", ex);
//            throw new ConfigurationException("pkey,pkeypass", "Unable to generate or load default key.");
//          }
//        } else {
//          try {
//            InputStream in = new URL(pk).openStream();
//            m_SSHListenerKey = PKey.readPrivateKeyFromStream(in, pass);
//            in.close();
//          } catch (Exception ex) {
//            m_Services.error("configure()", ex);
//            throw new ConfigurationException("pkey,pkeypass", "Unable to load SSH2 key.");
//          }
//        }
//      }
//      m_ConnectionManager.configure(conf);
//  }//configure
//
//  private class Runner implements Runnable {
//
//    /**
//     * Listen constantly to a server socket and handles incoming connections
//     * through the associated {a:link ConnectionManager}.
//     *
//     * @see net.wimpi.telnetd.net.ConnectionManager
//     */
//    public void run() {
//      try {
//        /*
//            A server socket is opened with a connectivity queue of a size specified
//            in int floodProtection.  Concurrent login handling under normal circumstances
//            should be handled properly, but denial of service attacks via massive parallel
//            program logins should be prevented with this.
//        */
//        if (m_Secure) {
//          m_ServerSocket = new SSHServerSocket(m_Port, m_FloodProtection, m_SSHListenerKey);
//          m_Services.info("Started SSH2 listener on port " + m_Port);
//        } else {
//          m_ServerSocket = new ServerSocket(m_Port, m_FloodProtection);
//          m_Services.info("Started telnet listener on port " + m_Port);
//        }
//        m_Started = true;
//        do {
//          try {
//            Socket s = m_ServerSocket.accept();
//            if (m_Available) {
//              m_ConnectionManager.makeConnection(s);
//            } else {
//              //just shut down the socket
//              s.close();
//            }
//          } catch (SocketException ex) {
//            if (m_Stopping) {
//              //server socket was closed blocked in accept
//              m_Services.debug("run(): ServerSocket closed by stop()");
//            } else {
//              m_Services.error("run()", ex);
//            }
//          } catch (IOException e) {
//            m_Services.error("run()", e);
//          } catch(Exception exc) {
//            m_Services.error("run()",exc);
//          }
//        } while (!m_Stopping);
//
//      } catch (IOException e) {
//        m_Services.error("run()", e);
//      }
//      m_Services.debug("run(): returning.");
//    }//run
//
//  }//inner class Runner
//
//}//class TelnetListenerServiceImpl
