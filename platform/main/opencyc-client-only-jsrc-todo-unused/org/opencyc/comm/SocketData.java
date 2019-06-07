/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opencyc.comm;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import org.opencyc.api.CycConnection;

/**
 *
 * @author vijay
 */
public class SocketData {

  private String hostName;
  private int port;
  private Socket socket;
  private InputStream cis;
  private CommOutputStream cos;
  
  private Socket initSocket;
  private InputStream initCis;
  private CommOutputStream initCos;

  public SocketData(String hostName, int portNum) throws IOException {
    this.hostName = hostName;
    this.port = portNum + CycConnection.CFASL_PORT_OFFSET;

    socket = new Socket(this.hostName, this.port);
    int val = socket.getReceiveBufferSize();
    socket.setReceiveBufferSize(val * 2);
    socket.setTcpNoDelay(true);
    socket.setKeepAlive(true);
    cis = socket.getInputStream();
    cos = new DefaultCommOutputStream(socket.getOutputStream());

    initSocket = new Socket(this.hostName, this.port);
    int val2 = initSocket.getReceiveBufferSize();
    initSocket.setReceiveBufferSize(val2 * 2);
    initSocket.setTcpNoDelay(true);
    initSocket.setKeepAlive(true);
    initCis = initSocket.getInputStream();
    initCos = new DefaultCommOutputStream(initSocket.getOutputStream());
  }

  public String getHostName() {
    return hostName;
  }

  public int getPort() {
    return port;
  }

  public InputStream getCis() {
    return cis;
  }

  public CommOutputStream getCos() {
    return cos;
  }

  public Socket getSocket() {
    return socket;
  }

  public Socket getInitSocket() {
    return initSocket;
  }

  public InputStream getInitCis() {
    return initCis;
  }

  public CommOutputStream getInitCos() {
    return initCos;
  }

  @Override
public String toString() {
    return "Socket with Host: " + hostName + " Port: " + port;
  }
}
