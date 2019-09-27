/*****************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one                *
 * or more contributor license agreements.  See the NOTICE file              *
 * distributed with this work for additional information                     *
 * regarding copyright ownership.  The ASF licenses this file                *
 * to you under the Apache License, Version 2.0 (the                         *
 * "License"); you may not use this file except in compliance                *
 * with the License.  You may obtain a copy of the License at                *
 *                                                                           *
 *     http://www.apache.org/licenses/LICENSE-2.0                            *
 *                                                                           *
 * Unless required by applicable law or agreed to in writing,                *
 * software distributed under the License is distributed on an               *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY                    *
 * KIND, either express or implied.  See the License for the                 *
 * specific language governing permissions and limitations                   *
 * under the License.                                                        *
 *                                                                           *
 *                                                                           *
 * This file is part of the BeanShell Java Scripting distribution.           *
 * Documentation and updates may be found at http://www.beanshell.org/       *
 * Patrick Niemeyer (pat@pat.net)                                            *
 * Author of Learning Java, O'Reilly & Associates                            *
 *                                                                           *
 *****************************************************************************/
package bsh.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.Startup;
import org.logicmoo.system.SystemCurrent;

import bsh.FileReader;
import bsh.Interpreter;
import bsh.NameSpace;

/**
    BeanShell remote session server.
    Starts instances of bsh for client connections.
    Note: the sessiond effectively maps all connections to the same interpreter
    (shared namespace).
*/
public class Sessiond extends Thread {
	private ServerSocket ss;
	NameSpace globalNameSpace;

	public static void main(String argv[]) throws IOException {
		argv = org.logicmoo.system.Startup.extractOptions(Sessiond.class, argv);
		//new Sessiond(  Integer.parseInt(argv[0])).start();
	}

	public Sessiond(NameSpace globalNameSpace, int port) throws IOException {
		ss = new ServerSocket(port);
		this.globalNameSpace = globalNameSpace;
		setDaemon(true);
		setName("Sessiond " + port);
	}

	@Override
	public void run() {
		try {
			while (true) {
				try {
					final SessiondConnection sessiondConnection = new SessiondConnection(getName(), globalNameSpace, ss.accept());
					sessiondConnection.start();
				} catch (Throwable e) {
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Startup.ignoreExceptions(() -> ss.close());
	}
}

class SessiondConnection extends Thread {
	NameSpace globalNameSpace;
	Socket client;
	Interpreter i;

	SessiondConnection(String name, NameSpace globalNameSpace, Socket client) {
		this.client = client;
		this.globalNameSpace = globalNameSpace;
		this.setDaemon(false);
		setName(name + " c= " + client);
	}

	@Override
	public void run() {
		try {
			final OutputStream outputStream = client.getOutputStream();
			final InputStream inputStream = client.getInputStream();
			PrintStream out = new PrintStream(outputStream, true, "UTF-8");
			SystemCurrent.setIn(inputStream);
			SystemCurrent.setOut(out);
			SystemCurrent.setErr(out);
			//final bsh.ConsoleAssignable console = new Interpreter.Console(in, out, out);
			i = new Interpreter(new FileReader(inputStream), out, out, true, globalNameSpace, BeanShellCntrl.ensureBSH(), "");
			i.setExitOnEOF(false); // don't exit interpreter
			i.run();
		} catch (IOException e1) {
			System.out.println(e1);
			e1.printStackTrace();
		} finally {
			dispose();
		}
	}

	public void dispose() {
		if (i != null) {
			Interpreter ii = i;
			i = null;
			ii.dispose();
		}
		Startup.ignoreExceptions(() -> client.close());
	}
}
