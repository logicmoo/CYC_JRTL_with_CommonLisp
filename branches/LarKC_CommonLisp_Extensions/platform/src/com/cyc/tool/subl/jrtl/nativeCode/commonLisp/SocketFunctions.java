/*
 * server_socket_close.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: server_socket_close.java 12288 2009-11-29 22:00:12Z vvoutilainen $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class SocketFunctions {

	//### %make-socket
	private static final Primitive MAKE_SOCKET = new make_socket();

	public final static class make_socket extends JavaPrimitive {
		make_socket() {
			super("%make-socket", PACKAGE_SYS, false, "host port");
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			String host = first.getString();
			int port = second.intValue();
			try {
				Socket socket = new Socket(host, port);
				return new ABCLJavaObject(socket);
			} catch (Exception e) {
				return error(new LispError(e.getMessage()));
			}
		}

	}

	//### %make-server-socket
	private static final Primitive MAKE_SERVER_SOCKET = new make_server_socket();

	public final static class make_server_socket extends JavaPrimitive {
		make_server_socket() {
			super("%make-server-socket", PACKAGE_SYS, false, "port element-type");
		}

		@Override
		public SubLObject execute(SubLObject first)

		{
			int port = first.intValue();
			try {
				ServerSocket socket = new ServerSocket(port);
				return new ABCLJavaObject(socket);
			} catch (Exception e) {
				return error(new LispError(e.getMessage()));
			}
		}

	}

	// ### %server-socket-close
	private static final Primitive SERVER_SOCKET_CLOSE = new server_socket_close();

	public final static class server_socket_close extends JavaPrimitive {
		protected server_socket_close() {
			super("%server-socket-close", PACKAGE_SYS, false, "socket");
		}

		@Override
		public SubLObject execute(SubLObject first)

		{
			try {
				ServerSocket serverSocket = (ServerSocket) ABCLJavaObject.getObject(first);
				serverSocket.close();
				return T;
			} catch (Exception e) {
				return error(new LispError(e.getMessage()));
			}
		}
	}

	//### %socket-stream
	private static final Primitive SOCKET_STREAM = new socket_stream();

	public final static class socket_stream extends JavaPrimitive {
		protected socket_stream() {
			super("%socket-stream", PACKAGE_SYS, false, "socket element-type external-format");
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			Socket socket = (Socket) ((JavaObject) first).getObject();
			SubLObject elementType = second; // Checked by caller.
			try {
				LispStream in = makeStream(LispSymbols.SYSTEM_STREAM, socket.getInputStream(), elementType, third);
				LispStream out = makeStream(LispSymbols.SYSTEM_STREAM, socket.getOutputStream(), elementType, third);
				return new SocketStream(socket, in, out);
			} catch (Exception e) {
				return error(new LispError(e.getMessage()));
			}
		}

	}

	//### %socket-accept
	private static final Primitive SOCKET_ACCEPT = new socket_accept();

	public final static class socket_accept extends JavaPrimitive {
		protected socket_accept() {
			super("%socket-accept", PACKAGE_SYS, false, "socket");
		}

		@Override
		public SubLObject execute(SubLObject first)

		{
			ServerSocket serverSocket = (ServerSocket) ((JavaObject) first).getObject();
			try {
				Socket socket = serverSocket.accept();
				return new ABCLJavaObject(socket);
			} catch (Exception e) {
				return error(new LispError(e.getMessage()));
			}
		}

	}

	//### %socket-close
	private static final Primitive SOCKET_CLOSE = new socket_close();

	public final static class socket_close extends JavaPrimitive {
		protected socket_close() {
			super("%socket-close", PACKAGE_SYS, false, "socket");
		}

		@Override
		public SubLObject execute(SubLObject first)

		{
			Socket socket = (Socket) ABCLJavaObject.getObject(first);
			try {
				socket.close();
				return T;
			} catch (Exception e) {
				return error(new LispError(e.getMessage()));
			}
		}

	}

}
