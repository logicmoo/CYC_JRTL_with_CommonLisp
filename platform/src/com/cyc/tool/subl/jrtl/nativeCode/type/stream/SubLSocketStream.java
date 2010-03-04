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

package  com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//// Internal Imports

//// External Imports

public  final class SubLSocketStream extends SubLInOutTextStreamImpl implements SubLOutputBinaryStream, SubLInputBinaryStream {
  
  //// Constructors
  
  /** Creates a new instance of SubLSocketStream. */
  SubLSocketStream(Socket socket) {
    this.socket = socket;
    host = socket.getInetAddress().getCanonicalHostName();
    try {
      socket.setSoLinger(true, 50);
      socket.setReceiveBufferSize(1024*1024*4);
      socket.setTcpNoDelay(true);
      socket.setSoTimeout(250);
    } catch (IOException ioe) {
      Errors.error("Unable to open socket " + socket + ".", ioe);
    }
    init();
  }
  
  /** Creates a new instance of SubLSocketStream. */
  SubLSocketStream(String host, int port) {
    if ((port < 0) || (port >= 65536)) {
      Errors.error("Got invalid port number: " + port);
    }
    try {
      this.host = host;
      socket = new Socket(host, port);
      socket.setSoLinger(true, 50);
      socket.setReceiveBufferSize(1024*1024*4);
      socket.setTcpNoDelay(true);
      socket.setSoTimeout(250);
    } catch (UnknownHostException uhe) {
      Errors.error("Got unknown host: " + host, uhe);
    } catch (IOException ioe) {
      Errors.error("Unable to open socket " + host + "@" + port + ".", ioe);
    }
    init();
  }
  
  //// Public Area
  
  public final synchronized void close() {
    if (isClosed()) {
      return;
    }
    try {
      if (socket != null) {
        try {
          if (!socket.isInputShutdown()) {
            socket.shutdownInput();
          }
        } catch (Exception e) {} //ignore
        try {
          if (!socket.isOutputShutdown()) {
            socket.shutdownOutput();
          }
        } catch (Exception e) {} //ignore
        socket.close(); // @note this automatically closes input and output socket streams
        socket = null;
      }
    } catch (IOException ioe) {} //ignore 
    super.close();
  }
  
  public final String toString() {
    return "#<SOCKET-STREAM " + host + ":" + ((socket == null) ? "INVALID SOCKET" : "" + socket.getPort()) + (isClosed() ? " CLOSED" : " OPEN") + " @ " + superHash() + ">";
  }
  
  //// Protected Area
  
  //// Private Area
  
  protected void init() {
    try {
      inStream = SubLStreamFactory.makeInputTextStream(socket);
      outStream = SubLStreamFactory.makeOutputTextStream(socket.getOutputStream());
    } catch (IOException ioe) {
      Errors.error("Error trying to establish socket input/output streams.", ioe);
    }
  }
  
  //// Internal Rep
  
  private Socket socket;
  private String host;
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  
}
