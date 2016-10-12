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

package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

//// Internal Imports

//// External Imports

public class SubLSocketStream extends SubLInOutTextStreamImpl implements SubLOutputBinaryStream, SubLInputBinaryStream {

	//// Constructors

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	private Socket socket;

	//// Public Area

	private String host;

	/** Creates a new instance of SubLSocketStream. */
	SubLSocketStream(Socket socket) {
		this.socket = socket;
		this.host = socket.getInetAddress().getCanonicalHostName();
		try {
			socket.setSoLinger(true, 50);
			socket.setReceiveBufferSize(1024 * 1024 * 4);
			socket.setTcpNoDelay(true);
			socket.setSoTimeout(250);
		} catch (IOException ioe) {
			Errors.error("Unable to open socket " + socket + ".", ioe);
		}
		this.init();
	}

	//// Protected Area

	//// Private Area

	/** Creates a new instance of SubLSocketStream. */
	SubLSocketStream(String host, int port) {
		this(host, port, 0);
	}

	SubLSocketStream(String host, int port, int timeout) {
		if (port < 0 || port >= 65536)
			Errors.error("Got invalid port number: " + port);
		try {
			this.host = host;
			SocketAddress sockAddr = new InetSocketAddress(host, port);
			this.socket = new Socket();
			this.socket.setSoLinger(true, 50);
			this.socket.setReceiveBufferSize(1024 * 1024 * 4);
			this.socket.setTcpNoDelay(true);
			this.socket.setSoTimeout(250);
			this.socket.connect(sockAddr, timeout);
		} catch (UnknownHostException uhe) {
			Errors.error("Got unknown host: " + host, uhe);
		} catch (IOException ioe) {
			Errors.error("Unable to open socket " + host + "@" + port + ".", ioe);
		}
		this.init();
	}
	//// Internal Rep

	public synchronized void close() {
		if (this.isClosed())
			return;
		try {
			if (this.socket != null) {
				try {
					if (!this.socket.isInputShutdown())
						this.socket.shutdownInput();
				} catch (Exception e) {
				} // ignore
				try {
					if (!this.socket.isOutputShutdown())
						this.socket.shutdownOutput();
				} catch (Exception e) {
				} // ignore
				this.socket.close(); // @note this automatically closes input
										// and
				// output socket streams
				this.socket = null;
			}
		} catch (IOException ioe) {
		} // ignore
		super.close();
	}

	protected void init() {
		try {
			this.inStream = SubLStreamFactory.makeInputTextStream(this.socket);
			this.outStream = SubLStreamFactory.makeOutputTextStream(this.socket.getOutputStream());
		} catch (IOException ioe) {
			Errors.error("Error trying to establish socket input/output streams.", ioe);
		}
	}

	//// Main

	public String toString() {
		return "#<SOCKET-STREAM " + this.host + ":"
				+ (this.socket == null ? "INVALID SOCKET" : "" + this.socket.getPort())
				+ (this.isClosed() ? " CLOSED" : " OPEN") + " @ " + this.superHash() + ">";
	}

}
