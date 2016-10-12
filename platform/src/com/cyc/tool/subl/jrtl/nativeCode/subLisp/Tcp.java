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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSocketStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public class Tcp extends SubLTrampolineFile {

	//// Constructors

	public static SubLSymbol $remote_address$;

	public static SubLSymbol $remote_hostname$;

	//// Public Area

	public static SubLSymbol $retain_client_socketP$;
	public static SubLSymbol $tcp_localhost_onlyP$;
	public static SubLFile me = new Tcp();
	private static Map portToServerSocketProcessMap = new HashMap();

	private static long computeIPAddress(byte[] rawAddress) {
		// convert a raw IP address into its integer representation
		long result = 0;
		for (byte nextByte : rawAddress) {
			result <<= 8;
			result += nextByte;
		}
		return result;
	}

	public static SubLObject open_tcp_stream(SubLObject host, SubLObject port) {
		return SubLObjectFactory.makeSocketStream(host.getString(), port.intValue());
	}

	public static SubLObject open_tcp_stream(SubLObject host, SubLObject port, SubLObject timeoutSeconds) {
		int timeoutMs = 60000;
		if (timeoutSeconds == CommonSymbols.NIL)
			timeoutMs = 65536000;
		else if (timeoutSeconds != CommonSymbols.UNPROVIDED)
			timeoutMs = timeoutSeconds.intValue() * 1000;
		return SubLObjectFactory.makeSocketStream(host.getString(), port.intValue(), timeoutMs);
	}

	//// Initializers

	public static SubLObject start_tcp_server(SubLObject port, SubLObject handler) {
		SubLFunction handlerTyped = handler.getFunc();
		int portTyped = port.intValue();
		SubLProcess result = SubLObjectFactory.makeProcess(
				SubLObjectFactory.makeString("Socket Server (port: " + portTyped + " handler: " + handler + ")"),
				new ServerSocketProcess(portTyped, handler));
		synchronized (Tcp.portToServerSocketProcessMap) {
			Tcp.portToServerSocketProcessMap.put(port, result);
		}
		return result;
	}

	public static SubLObject stop_tcp_server(SubLObject port) {
		SubLProcess process = null;
		synchronized (Tcp.portToServerSocketProcessMap) {
			process = (SubLProcess) Tcp.portToServerSocketProcessMap.remove(port);
		}
		if (process == null)
			Errors.error(port + " is not a tcp server port designator.");
		else {
			process.interrupt();
			process.killProcess();
		}
		return CommonSymbols.NIL;
	}

	/** Creates a new instance of Environment. */
	public Tcp() {
	}

	public void declareFunctions() {
		//SubLFiles.declareFunction(Tcp.me, "open_tcp_stream", "OPEN-TCP-STREAM", 2, 0, false);
		SubLFiles.declareFunction(Tcp.me, "open_tcp_stream", "OPEN-TCP-STREAM", 2, 1, false);		
		SubLFiles.declareFunction(Tcp.me, "start_tcp_server", "START-TCP-SERVER", 2, 0, false);
		SubLFiles.declareFunction(Tcp.me, "stop_tcp_server", "STOP-TCP-SERVER", 1, 0, false);
	}

	//// Protected Area

	//// Private Area

	public void initializeVariables() {
		Tcp.$retain_client_socketP$ = SubLFiles.defvar(Tcp.me, "*RETAIN-CLIENT-SOCKET?*", CommonSymbols.NIL);
		Tcp.$tcp_localhost_onlyP$ = SubLFiles.defvar(Tcp.me, "*TCP-LOCALHOST-ONLY?*", CommonSymbols.NIL);
		Tcp.$remote_hostname$ = SubLFiles.defvar(Tcp.me, "*REMOTE-HOSTNAME*", CommonSymbols.NIL);
		Tcp.$remote_address$ = SubLFiles.defvar(Tcp.me, "*REMOTE-ADDRESS*", CommonSymbols.NIL);
	}

	//// Internal Rep

	public void runTopLevelForms() {
	}

	private static class ServerSocketHandlerProcess extends SafeRunnable {
		private Socket connectionSocket;

		private SubLFunction func;

		private SubLString host;
		private SubLInteger ipAddress;
		private SubLSocketStream socketStream;

		ServerSocketHandlerProcess(SubLFunction func, Socket connectionSocket) {
			InetAddress inetAddress = connectionSocket.getInetAddress();
			this.func = func;
			this.connectionSocket = connectionSocket;
			this.ipAddress = SubLObjectFactory.makeInteger(Tcp.computeIPAddress(inetAddress.getAddress()));
			this.host = SubLObjectFactory.makeString(inetAddress.getCanonicalHostName());
		}

		public synchronized void safeRun() {
			SubLObject oldRemoteHostname = Dynamic.currentBinding(Tcp.$remote_hostname$);
			SubLObject oldRemoteAddress = Dynamic.currentBinding(Tcp.$remote_address$);
			SubLObject oldRetainClientSocket = Dynamic.currentBinding(Tcp.$retain_client_socketP$);
			try {
				Dynamic.bind(Tcp.$remote_hostname$, this.host);
				Dynamic.bind(Tcp.$remote_address$, this.ipAddress);
				Dynamic.bind(Tcp.$retain_client_socketP$, CommonSymbols.NIL);
				this.socketStream = SubLObjectFactory.makeSocketStream(this.connectionSocket);
				Functions.funcall(this.func, this.socketStream, this.socketStream);
			} catch (Exception e) {
				Errors.error("Error detected on socket connection: " + this.socketStream, e);
				try {
					if (this.socketStream != null && Tcp.$retain_client_socketP$.getValue() == CommonSymbols.NIL)
						try {
							this.socketStream.close();
						} finally {
							this.socketStream = null;
						}
				} finally {
					Dynamic.rebind(Tcp.$remote_hostname$, oldRemoteHostname);
					Dynamic.rebind(Tcp.$remote_address$, oldRemoteAddress);
					Dynamic.rebind(Tcp.$retain_client_socketP$, oldRetainClientSocket);
				}
			} finally {
				try {
					if (this.socketStream != null && Tcp.$retain_client_socketP$.getValue() == CommonSymbols.NIL)
						try {
							this.socketStream.close();
						} finally {
							this.socketStream = null;
						}
				} finally {
					Dynamic.rebind(Tcp.$remote_hostname$, oldRemoteHostname);
					Dynamic.rebind(Tcp.$remote_address$, oldRemoteAddress);
					Dynamic.rebind(Tcp.$retain_client_socketP$, oldRetainClientSocket);
				}
			}
		}
	}

	private static class ServerSocketProcess extends SafeRunnable {
		private static int SOCKET_ACCEPT_TIMEOUT_MSECS = 500;

		private SubLObject funcSpec;

		private int port;

		private ServerSocket serverSocket;

		ServerSocketProcess(int port, SubLObject funcSpec) {
			this.funcSpec = funcSpec;
			this.port = port;
			try {
				this.serverSocket = new ServerSocket(port);
				this.serverSocket.setSoTimeout(ServerSocketProcess.SOCKET_ACCEPT_TIMEOUT_MSECS);
			} catch (IOException e) {
				Errors.error("Unable to create server socket on port: " + port, e);
			}
		}

		private void cleanup(Socket newSock) {
			if (newSock != null)
				try {
					newSock.close();
				} catch (Exception e) {
				}
			try {
				this.serverSocket.close();
			} catch (Exception e) {
			}
			this.funcSpec = null;
		}

		public void safeRun() {
			Socket socket = null;
			try {
				while (true) {
					socket = null;
					try {
						try {
							socket = this.serverSocket.accept();
						} catch (SocketTimeoutException ste) {
							Threads.possiblyHandleInterrupts(false);
						}
						if (socket == null)
							continue;
						SubLObject rawAcceptAll = Tcp.$tcp_localhost_onlyP$.getGlobalValue();
						boolean acceptAll = rawAcceptAll == null || rawAcceptAll.isNil();
						boolean isLocalHost = false;
						if (!acceptAll)
							isLocalHost = socket.getInetAddress().isLoopbackAddress();
						if (acceptAll || isLocalHost)
							SubLObjectFactory.makeProcess(
									SubLObjectFactory.makeString("Socket Connection Handler: " + socket),
									new ServerSocketHandlerProcess(this.funcSpec.getFunc(), socket));
						else {
							socket.close();
							socket = null;
						}
					} catch (IOException ioe) {
						Errors.handleError("Error accepting socket connection.", ioe);
					}
				}
			} finally {
				this.cleanup(socket);
			}
		}
	}

	//// Main

}
