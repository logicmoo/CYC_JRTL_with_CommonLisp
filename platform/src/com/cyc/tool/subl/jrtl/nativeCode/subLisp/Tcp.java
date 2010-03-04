/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSocketStream;
import com.cyc.tool.subl.util.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

//// Internal Imports

//// External Imports

public  class Tcp extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Environment. */
  public Tcp() {}
  public static final SubLFile me = new Tcp();
  
  //// Public Area
  
  public static SubLSymbol $retain_client_socketP$;
  public static SubLSymbol $tcp_localhost_onlyP$;
  public static SubLSymbol $remote_hostname$;
  public static SubLSymbol $remote_address$;
  
  public static final SubLObject open_tcp_stream(SubLObject host, SubLObject port) {
    return SubLObjectFactory.makeSocketStream(host.getString(), port.intValue());
  }
  
  public static final SubLObject start_tcp_server(SubLObject port, SubLObject handler) {
    SubLFunction handlerTyped = handler.getFunc();
    int portTyped = port.intValue();
    SubLProcess result = SubLObjectFactory.
      makeProcess(SubLObjectFactory.makeString("Socket Server (port: " + portTyped + " handler: " + handler + ")"),
      new ServerSocketProcess(portTyped, handler));
    synchronized (portToServerSocketProcessMap) {
      portToServerSocketProcessMap.put(port, result);
    }
    return result;
  }
  
  public static final SubLObject stop_tcp_server(SubLObject port) {
    SubLProcess process = null;
    synchronized (portToServerSocketProcessMap) {
      process = (SubLProcess)portToServerSocketProcessMap.remove(port);
    }
    if (process == null) {
      Errors.error(port + " is not a tcp server port designator.");
    } else {
      process.interrupt();
    }
    return NIL;
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "open_tcp_stream",  "OPEN-TCP-STREAM",  2, 0, false);
    SubLFiles.declareFunction(me, "start_tcp_server", "START-TCP-SERVER", 2, 0, false);
    SubLFiles.declareFunction(me, "stop_tcp_server",  "STOP-TCP-SERVER",  1, 0, false);
  }
  
  public void initializeVariables() {
    $retain_client_socketP$ = SubLFiles.defvar(me, "*RETAIN-CLIENT-SOCKET?*", NIL);
    $tcp_localhost_onlyP$   = SubLFiles.defvar(me, "*TCP-LOCALHOST-ONLY?*",   NIL);
    $remote_hostname$       = SubLFiles.defvar(me, "*REMOTE-HOSTNAME*",       NIL);
    $remote_address$        = SubLFiles.defvar(me, "*REMOTE-ADDRESS*",        NIL);
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area

  private static final long computeIPAddress(byte[] rawAddress) {
    // convert a raw IP address into its integer representation
    long result = 0;
    for (byte nextByte : rawAddress) {
      result <<= 8;
      result += nextByte;
    }
    return result;
  }

  //// Internal Rep
  
  private static final Map portToServerSocketProcessMap = new HashMap();
  
  private static final class ServerSocketProcess extends SafeRunnable {
    ServerSocketProcess(int port, SubLObject funcSpec) {
      this.funcSpec = funcSpec;
      this.port = port;
      try {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(SOCKET_ACCEPT_TIMEOUT_MSECS);
      } catch (IOException e) {
        Errors.error("Unable to create server socket on port: " + port, e);
      }
    }
    
    public void safeRun() {
      Socket socket = null;
      try {
        while (true) {
          socket = null;
          try {
            try {
              socket = serverSocket.accept();
            } catch (java.net.SocketTimeoutException ste) {
              Threads.possiblyHandleInterrupts(false);
            }
            if (socket != null) {
              SubLObjectFactory.makeProcess(SubLObjectFactory.makeString("Socket Connection Handler: " + socket),
                  new ServerSocketHandlerProcess(funcSpec.getFunc(), socket));
            }
          } catch (IOException ioe) {
            Errors.handleError("Error accepting socket connection.", ioe);
          }
        }
      } finally {
        cleanup(socket);
      }
    }
    
    private void cleanup(Socket newSock) {
      if (newSock != null) {
        try { newSock.close(); } catch (Exception e) {}
      }
      try { serverSocket.close(); } catch (Exception e) {}
      funcSpec = null;
    }
    
    private SubLObject funcSpec;
    private ServerSocket serverSocket;
    private int port;
    private static final int SOCKET_ACCEPT_TIMEOUT_MSECS = 500;
  }
  
  private static final class ServerSocketHandlerProcess extends SafeRunnable {
    ServerSocketHandlerProcess(SubLFunction func, Socket connectionSocket) {
      final InetAddress inetAddress = connectionSocket.getInetAddress();
      this.func = func;
      this.connectionSocket = connectionSocket;
      this.ipAddress = SubLObjectFactory.makeInteger(computeIPAddress(inetAddress.getAddress()));
      this.host      = SubLObjectFactory.makeString(inetAddress.getCanonicalHostName());
    }
    
    public synchronized void safeRun() {
      SubLObject oldRemoteHostname = Dynamic.currentBinding($remote_hostname$);
      SubLObject oldRemoteAddress = Dynamic.currentBinding($remote_address$);
      SubLObject oldRetainClientSocket = Dynamic.currentBinding($retain_client_socketP$);
      try {
        Dynamic.bind($remote_hostname$, host);
        Dynamic.bind($remote_address$, ipAddress);
        Dynamic.bind($retain_client_socketP$, NIL);
        socketStream = SubLObjectFactory.makeSocketStream(connectionSocket);
        Functions.funcall(func, socketStream, socketStream);
      } catch (Exception e) {
        Errors.error("Error detected on socket connection: " + socketStream, e);
      } finally {
        try {
          if ((socketStream != null) && ($retain_client_socketP$.getValue() == NIL)) {
            try {
              socketStream.close();
            } finally {
              socketStream = null;
            }
          }
        } finally {
          Dynamic.rebind($remote_hostname$, oldRemoteHostname);
          Dynamic.rebind($remote_address$, oldRemoteAddress);
          Dynamic.rebind($retain_client_socketP$, oldRetainClientSocket);
        }
      }
    }
    private final Socket connectionSocket;
    private final SubLFunction func;
    private SubLSocketStream socketStream;
    private SubLString host;
    private SubLInteger ipAddress;
  }
  
  //// Main
  
}
