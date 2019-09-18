/*
 * JLisp.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: JLisp.java,v 1.25 2005/11/19 00:31:06 piso Exp $
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
 */

package org.armedbear.j;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.Main;
import org.logicmoo.system.Startup;

public final class LispClient extends CommandInterpreter {
	private Thread thread;
	private final File initialDir;

	static public int serverPort;
	static public ServerSocket serverSocket;
	private static Thread serverThread;
	private Socket socket;
	public Interpreter interpreter;

	private LispClient(File initialDir, Socket client) {
		//jlispInstance++;
		socket = client;
		this.initialDir = initialDir;
		//title = "jlisp.0" + jlispInstance;
		//mode = LispShellMode.getMode();
		//formatter = mode.getFormatter(this);
		//	setInitialized(true);
		new Thread(() -> start1Process());
	}

	private void start1Process() {
		try {
			synchronized (this) {
				notify();
			}
			interpreter = Interpreter.createNewLispInstance(socket.getInputStream(), socket.getOutputStream(), initialDir.canonicalPath(), Version.getLongVersionString(), true);
			interpreter.run();
		} catch (Throwable t) {
			Log.error(t);
		}
		dispose();
	}

	//@Override
	protected void initializeHistory() {
		history = new History("jlisp.history", 30);
	}

	//@Override
	protected void startProcess() {
		thread = new Thread("JLisp interpreter: " + title) {
			@Override
			public void run() {
				Main.setSubLisp(false);
				try {
					if (interpreter != null) {
						Editor.setLispInitialized(true);
						interpreter.run();
					}
				} catch (Exception e) {
					e.printStackTrace();
					Log.error(e);
				}
				Log.debug("interpreter thread exiting");
				Lisp.resetIO();
				LispThread.remove(thread);
			}
		};
		thread.setDaemon(true);
		thread.start();

		try {

			stdin = new OutputStreamWriter(socket.getOutputStream());
			stdoutThread = new StdoutThread(socket.getInputStream());
			stdoutThread.setName("JLisp reader: " + title);
			stdoutThread.setDaemon(true);
			stdoutThread.start();
		} catch (IOException e) {
			Log.error(e);
		}
	}

	protected class StdoutThread extends ReaderThread {
		public StdoutThread(InputStream stdout) {
			super(stdout);
		}

		@Override
		public String filter(String s) {
			return stdOutFilter(s);
		}

		@Override
		public void update(String s) {
			if (s != null && s.length() > 0)
				stdOutUpdate(s);
		}
	}

	protected class StderrThread extends ReaderThread {
		public StderrThread(InputStream stderr) {
			super(stderr);
		}

		@Override
		public String filter(String s) {
			return stdErrFilter(s);
		}

		@Override
		public void update(String s) {
			if (s != null && s.length() > 0)
				stdErrUpdate(s);
		}
	}

	public static void startServer(int port) throws IOException {
		if (port != 0) {
			serverPort = port;
		}
		serverSocket = new ServerSocket(serverPort);
		serverPort = serverSocket.getLocalPort();
		serverThread = new Thread(() -> {
			while (true) {
				Socket socket;
				try {
					socket = serverSocket.accept(); // Blocks
					new LispClient(null, socket);
				} catch (Throwable e) {
					Startup.printStackTrace(e);
				}
			}
		});
		serverThread.setName("LispClientServer " + port);
		serverThread.setDaemon(true);
		serverThread.start();
	}

	@Override
	public synchronized void dispose() {

		Thread disposeThread = new Thread("JLisp dispose: " + title) {
			@Override
			public void run() {
				Log.debug("JLisp.dispose");
				if (interpreter != null)
					interpreter.kill();
				if (socket != null) {
					try {
						Log.debug("closing socket");
						socket.close();
						Log.debug("back from closing socket");
					} catch (IOException e) {
						Log.debug(e);
					}
					socket = null;
				}
				if (interpreter != null) {
					interpreter.dispose();
					interpreter = null;
				}
			}
		};
		disposeThread.setDaemon(true);
		disposeThread.start();
	}

}
