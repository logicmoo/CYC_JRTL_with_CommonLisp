/* $Id: SocketComm.java 145590 2013-05-15 21:12:52Z vijay $
 *
 * Copyright (c) 2013 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.comm;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.logging.Logger;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CycConnection;
import org.opencyc.api.CycConnectionInterface;

/**
 * <P>SocketComm is a default implementation of the Comm API that uses socket
 * communications.
 *
 * <P>Ex.:
 * <CODE><PRE>
 *  Comm comm = new SocketComm("localhost", 3600);
 *  CycAccess cycAccess = new CycAccess(comm);
 * </CODE></PRE>
 *
 * <P>Copyright (c) 2013 Cycorp, Inc. All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : May 7, 2013, 12:19:20 PM Author : tbrussea
 *
 * @version $Id: SocketComm.java 145590 2013-05-15 21:12:52Z vijay $
 */
public class SocketComm extends AbstractComm implements Comm {

  private final String hostName;
  private final int port;
  private Socket socket;
  private InputStream inputStream;
  private CommOutputStream outputStream;
  private boolean isInitialized = false;

  public SocketComm(String hostName, int portNum) throws IOException {
    this.hostName = hostName;
    this.port = portNum + CycConnection.CFASL_PORT_OFFSET;

  }

  @Override
  public InputStream sendRequest(byte request[], String requestSummary, RequestType requestType)
          throws CommException, IOException {
    Logger.getLogger(Socket.class.getCanonicalName()).fine(requestSummary);
    switch (requestType) {
      case INIT:
        socket = new Socket(this.hostName, this.port);
        int val1 = socket.getReceiveBufferSize();
        socket.setReceiveBufferSize(val1 * 2);
        socket.setTcpNoDelay(true);
        socket.setKeepAlive(true);
        outputStream = new DefaultCommOutputStream(socket.getOutputStream());

        Socket initSocket = new Socket(hostName, port);
        int val2 = initSocket.getReceiveBufferSize();
        initSocket.setReceiveBufferSize(val2 * 2);
        initSocket.setTcpNoDelay(true);
        initSocket.setKeepAlive(true);
        InputStream initInputStream = inputStream = initSocket.getInputStream();
        CommOutputStream initOutputStream = new DefaultCommOutputStream(initSocket.getOutputStream());
        synchronized (initOutputStream) {
          initOutputStream.write(request);
          initOutputStream.flush();
        }
        return initInputStream;
      case NORMAL:
        possiblyInitializeCommWIthServer();
        CommOutputStream oStream = outputStream;
        synchronized (oStream) {
          oStream.write(request);
          oStream.flush();
        }
        return inputStream;
      default:
        throw new IllegalArgumentException("Don't know about RequestType: " + requestType);
    }
  }

  public synchronized void possiblyInitializeCommWIthServer()
          throws CommException, IOException {
    if (isInitialized) {
      return;
    }
    isInitialized = true;
    byte[] initializationRequest = CycAccess.getCycInitializationRequest(getCycConnection().getUuid());
    InputStream is = sendRequest(initializationRequest, makeRequestSummary("initialization request"), RequestType.INIT);
    CycAccess.handleCycInitializationRequestResponse(is);
    getCycConnection().setupNewCommConnection(is);// @Note; this is required! It must happen after communication initialization.
  }

  @Override
  public String makeRequestSummary(String request) {
    return request;
  }

  @Override
  public synchronized void close() throws IOException {
    if (socket == null) {
      return;
    }
    if (!socket.isClosed()) {
      socket.close();
    }
  }

  @Override
  public void setCycConnection(CycConnectionInterface conn) {
    isInitialized = false;
    super.setCycConnection(conn);
  }

  @Override
  public String toString() {
    return "SocketComm with Host: " + hostName + " Port: " + port;
  }
}
