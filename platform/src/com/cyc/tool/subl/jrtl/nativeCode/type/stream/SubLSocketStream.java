//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.armedbear.lisp.SocketStream;
import org.armedbear.lisp.Stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class SubLSocketStream extends SocketStream implements SubLOutputBinaryStream, SubLInputBinaryStream {

    public SubLSocketStream(Socket socket, Stream in, Stream out)
    {
	super(in, out);
        this.socket = socket;
    }

	SubLSocketStream(Socket socket) {
		super();
		this.socket = socket;
		host = socket.getInetAddress().getCanonicalHostName();
		try {
			setDefaultSocketOptions();
		} catch (IOException ioe) {
			Errors.error("Unable to open socket " + socket + ".", ioe);
		}
		init();
	}

	SubLSocketStream(String host, int port, int timeout) {
		super();
		if (port < 0 || port >= 65536)
			Errors.error("Got invalid port number: " + port);
		try {
			this.host = host;
			SocketAddress sockAddr = new InetSocketAddress(host, port);
			(socket = new Socket()).connect(sockAddr, timeout);
			setDefaultSocketOptions();
		} catch (UnknownHostException uhe) {
			Errors.error("Got unknown host: " + host, uhe);
		} catch (IOException ioe) {
			Errors.error("Unable to open socket " + host + "@" + port + ".", ioe);
		}
		init();
	}

	private void setDefaultSocketOptions() throws SocketException
	{
		socket.setSoLinger(true, 50);
		socket.setReceiveBufferSize(4194304);
		socket.setTcpNoDelay(true);
		socket.setSoTimeout(250);
	}

	public static void main(String[] args) {
	}

	//private Socket socket;
	private String host;

	@Override
	public synchronized void close() {
		if (isClosed())
			return;
		try {
			if (socket != null) {
				try {
					if (!socket.isInputShutdown())
						socket.shutdownInput();
				} catch (Exception ex) {
				}
				try {
					if (!socket.isOutputShutdown())
						socket.shutdownOutput();
				} catch (Exception ex2) {
				}
				socket.close();
				socket = null;
			}
		} catch (IOException ex3) {
		}
		super.close();
	}

	@Override
	public String printObjectImpl() {
		return "#<SOCKET-STREAM " + host + ":" + (socket == null ? "INVALID SOCKET" : "" + socket.getPort())
				+ (isClosed() ? " CLOSED" : " OPEN") + " @ " + superHash() + ">";
	}

	protected void init() {
		try {
			if(inStream==null)inStream = (Stream)SubLStreamFactory.makeInputTextStream(socket.getInputStream());
			if(outStream==null)outStream = (Stream)SubLStreamFactory.makeOutputTextStream(socket.getOutputStream());
			//if(inStream!=null && getStreamElementType()==null) setStreamElementType(inStream.getStreamElementType());
			if(inStream!=null && getElementType()==null) setElementType(inStream.getElementType());
		} catch (IOException ioe) {
			Errors.error("Error trying to establish socket input/output streams.", ioe);
		}
	}
}
