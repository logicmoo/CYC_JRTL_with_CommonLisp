package com.cyc.baseclient.comm;

import com.cyc.base.CycConnectionException;
import com.cyc.base.conn.CycConnectionInterface;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import com.cyc.baseclient.CycClient;
import static com.cyc.baseclient.comm.Comm.RequestType.INIT;
import static com.cyc.baseclient.comm.Comm.RequestType.NORMAL;

/**
 *
 * @author vijay
 */
public class SocketCommRoundRobin extends AbstractComm implements Comm {

  private List<SocketData> socketList;
  private int socketIdx;
  private int targetRoundRobinSize = 2;
  private boolean isInitialized = false;

  public SocketCommRoundRobin() {
    socketList = new ArrayList<SocketData>();
    socketIdx = 0;
  }

  public CommOutputStream createOutputStream() throws CommException, IOException {
    return null;
  }

  @Override
  public synchronized InputStream sendRequest(byte request[], String requestSummary, RequestType requestType) throws CommException, CycConnectionException {

    switch (requestType) {
      case INIT:
        try {
          // This will add upto 5 cyc images, running on localhost, 3600, 3620 to 3680.
          // This is only for testing purposes
          String host = "localhost";
          int port = 3600 + 20 * socketList.size();
          //System.out.println("Socket connection to: Host: " + host + " Port: " + port);
          SocketData socketData = new SocketData(host, port);
          
          socketList.add(socketData);
          CommOutputStream initOutputStream = socketData.getInitCos();
          
          synchronized (initOutputStream) {
            initOutputStream.write(request);
            initOutputStream.flush();
          }
          return socketData.getInitCis();
        } catch (IOException ioe) {
          throw new CycConnectionException(ioe);
        }
      case NORMAL:
        try {
          possiblyInitializeCommWIthServer();
          
          SocketData sd = socketList.get(socketIdx);
          
          synchronized (sd.getCos()) {
            sd.getCos().write(request);
            sd.getCos().flush();
          }
          socketIdx = (socketIdx + 1) % socketList.size();
          return sd.getInitCis();
        } catch (IOException ioe) {
          throw new CycConnectionException(ioe);
        }
      default:
        throw new IllegalArgumentException("Don't know about RequestType: " + requestType);
    }
  }

  public synchronized void possiblyInitializeCommWIthServer()
          throws CommException, CycConnectionException {
    try {
      if (isInitialized) {
        return;
      }
      if (socketList.size() >= targetRoundRobinSize - 1) {
        isInitialized = true;
      }
      byte[] initializationRequest = CycClient.getCycInitializationRequest(getCycConnection().getUuid());
      InputStream is = sendRequest(initializationRequest, makeRequestSummary("initialization request"), RequestType.INIT);
      
      CycClient.handleCycInitializationRequestResponse(is);
      getCycConnection().setupNewCommConnection(is);// @Note; this is required! It must happen after communication initialization.
    } catch (IOException ioe) {
      throw new CycConnectionException(ioe);
    }
  }

  @Override
  public String makeRequestSummary(String request) {
    return request;
  }
  
  @Override
  public synchronized void close() throws CycConnectionException {
    try {
      for (SocketData sd : socketList) {
        if (sd.getSocket() == null) {
          return;
        } else if (!sd.getSocket().isClosed()) {
          sd.getSocket().close();
        }
        if (sd.getInitSocket() == null) {
          return;
        } else if (!sd.getInitSocket().isClosed()) {
          sd.getInitSocket().close();
        }
      }
      socketList.clear();
    } catch (IOException ioe) {
      throw new CycConnectionException(ioe);
    }
  }

  public void setCycConnection(CycConnectionInterface conn) {
    isInitialized = false;
    super.setCycConnection(conn);
  }

  @Override
  public String toString() {
    return "SocketCommRoundRobin - Socket List: " + socketList.toString();
  }
}
