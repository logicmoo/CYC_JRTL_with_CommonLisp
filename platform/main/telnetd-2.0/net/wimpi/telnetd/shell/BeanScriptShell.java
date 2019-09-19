/***
 * Java TelnetD library (embeddable telnet daemon)
 * Copyright (c) Dieter Wimberger
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
 * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ***/
package net.wimpi.telnetd.shell;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.armedbear.lisp.Debug;
import org.armedbear.lisp.ReaderInputStream;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.Startup;
import org.logicmoo.system.SystemCurrent;

import bsh.Interpreter;
import bsh.NameSpace;
import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.io.BaseIO;
import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.io.TerminalIO;
import net.wimpi.telnetd.io.TerminalOutputStream;
import net.wimpi.telnetd.io.TerminalPrintStream;
import net.wimpi.telnetd.io.TerminalReader;
import net.wimpi.telnetd.io.toolkit.BufferOverflowException;
import net.wimpi.telnetd.io.toolkit.Editfield;
import net.wimpi.telnetd.io.toolkit.InputFilter;
import net.wimpi.telnetd.io.toolkit.Label;
import net.wimpi.telnetd.io.toolkit.TabCompletionFilter;
import net.wimpi.telnetd.net.Connection;
import net.wimpi.telnetd.net.ConnectionData;
import net.wimpi.telnetd.net.ConnectionEvent;
import net.wimpi.telnetd.util.StringCompletions;

/**
 */
public class BeanScriptShell extends AbstractBaseShell {

	protected Interpreter m_Interpreter;
	protected boolean m_Exit = false;
	//private TerminalReader m_TerminalReader;
	static Interpreter globalInterp;

	/**
	 * constructor and init methods
	 */
	public BeanScriptShell() {
	}//constructor

	public void run(Connection con) {
		//1. prepare
		prepare(con);
		globalInterp = BeanShellCntrl.ensureBSH();

		try {
			writeConnectionInfo();
			BeanShellCntrl.shells.put(con.getConnectionKey(), this);
			//run
			initTerminal(m_TerminalReader);
			//final BaseIO baseIO = m_TermIO.getBaseIO();
			//			final OutputStream outputStream = baseIO.getOutputStream();
			//			InputStream inputStream = baseIO.getInputStream();
			//
			//			int available = inputStream.available();
			//			int countDown = 50; // = 5 seconds
			//			while (countDown > 0 && available == 0) {
			//				countDown--;
			//				Thread.sleep(100);
			//				available = inputStream.available();
			//			}
			//			byte[] b = null;
			//			if (available > 0) {
			//				b = new byte[available];
			//				inputStream.read(b);
			//				// 58 bytes = negotiations?
			//			}

			//m_TerminalReader.setEcho(true);

			final TerminalPrintStream outputStream = new TerminalPrintStream(new TerminalOutputStream(m_TermIO));
			final PrintStream errorStream = new PrintStream(outputStream, true);
			InputStream inputStream = new ReaderInputStream(m_TerminalReader);

			//addAutoComplete(m_TermIO);
			if (Startup.needIOConsole) {
				Startup.MainThreaded = true;
				Startup.needIOConsole = false;
				Startup.noExit = true;
				//				if (!(inputStream instanceof BufferedInputStream)) {
				//					inputStream = new BufferedInputStream(inputStream, 1);
				//				}

			}
			SystemCurrent.setIn(inputStream);
			SystemCurrent.setOut(outputStream);
			SystemCurrent.setErr(errorStream);
			Debug.assertTrue(SystemCurrent.mustIn() == inputStream, "SystemCurrent.mustIn()==inputStream");
			Debug.assertTrue(SystemCurrent.mustOut() == outputStream, "SystemCurrent.mustOut() == outputStream");

			if (false) {

				org.armedbear.lisp.Interpreter a = org.armedbear.lisp.Interpreter.createNewLispInstance(inputStream, //
						outputStream, "./", null, false, null, false);

				a.init();
				a.run();
			}

			m_Interpreter = new Interpreter(m_TerminalReader, outputStream, errorStream, true);
			final ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
			m_Interpreter.setClassLoader(contextClassLoader);
			m_Interpreter.getNameSpace().importStatic(org.logicmoo.system.Startup.class);
			initializeInterpreter();
			m_Interpreter.eval("lisp_repl();");
			//	m_Interpreter.run();
		} catch (

		Exception ex) {
			Activator.getServices().error("run():", ex);
		}
		con.removeConnectionListener(this);
		return;
	}//run

	private void writeConnectionInfo() throws IOException {
		ConnectionData cd = m_Connection.getConnectionData();
		//output header
		BasicTerminalIO m_IO = m_TermIO;

		final String crlf = BasicTerminalIO.CRLF;

		m_IO.write(crlf + "DEBUG: Active Connection" + crlf);
		m_IO.write("------------------------" + crlf);

		//output connection data
		m_IO.write("Connected from: " + cd.getHostName() + "[" + cd.getHostAddress() + ":" + cd.getPort() + "]" + crlf);
		m_IO.write("Guessed Locale: " + cd.getLocale() + crlf);
		m_IO.write(crlf);
		//output negotiated terminal properties
		m_IO.write("Negotiated Terminal Type: " + cd.getNegotiatedTerminalType() + crlf);
		m_IO.write("Negotiated Columns: " + cd.getTerminalColumns() + crlf);
		m_IO.write("Negotiated Rows: " + cd.getTerminalRows() + crlf);

		//output of assigned terminal instance (the cast is a hack, please
		//do not copy for other TCommands, because it would break the
		//decoupling of interface and implementation!
		m_IO.write(crlf);
		m_IO.write("Assigned Terminal instance: " + ((TerminalIO) m_IO).getTerminal());
		m_IO.write(crlf);
		m_IO.write("Environment: " + cd.getEnvironment().toString());
		m_IO.write(crlf);
		//output footer
		m_IO.write("-----------------------------------------------" + crlf + crlf);

		m_IO.flush();

	}

	private void initTerminal(TerminalReader terminalReader) throws IOException {
		final BasicTerminalIO terminalIO = getTerminalIO();
		//		terminalIO.setDefaultTerminal();
		//		terminalIO.setSignalling(true);
		setCharacterAtATime(terminalIO);
		terminalReader.setEcho(true);
		//		terminalIO.setBold(true);
	}

	private void addAutoComplete(BasicTerminalIO m_IO) throws IOException {
		Label l = new Label(m_IO, "testedit", "TestEdit: ");
		Editfield m_EF = new Editfield(m_IO, "edit", 50);
		m_EF.setInputFilter(new TabCompletionFilter(m_EF) {

			public int filterInput(int key) throws IOException {
				if (key == 't') {
					try {
						m_EF.setValue("Test");
					} catch (BufferOverflowException e) {

					}
					return InputFilter.INPUT_HANDLED;
				} else if (key == 'c') {
					m_EF.clear();
					return InputFilter.INPUT_HANDLED;
				} else {

					return key;
				}
			}

			@Override
			public StringCompletions complete(String fragment) {
				return new StringCompletions() {
					int next = 0;

					@Override
					public String nextCompletion() {
						next++;
						return "AutoComplete " + next + " for frag: " + fragment;
					}
				};
			}

		});
		l.draw();
		m_EF.run();
	}

	/**
	 * @param terminalIO
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void setCharacterAtATime(final BasicTerminalIO terminalIO) throws UnsupportedEncodingException, IOException {
		final BaseIO baseIO = terminalIO.getBaseIO();
		OutputStreamWriter out = new OutputStreamWriter(baseIO.getOutputStream(), "ISO-8859-1");
		out.write(new char[] { 255, 253, 34, /* IAC DO LINEMODE */
				255, 250, 34, 1, 0, 255, 240, /* IAC SB LINEMODE MODE 0 IAC SE */
				255, 251, 1 /* IAC WILL ECHO */ });
		out.flush();
	}

	/**
	 * Method that can be overridden to initialize the
	 * Interpreter or it's namespace with package and
	 * class imports, as well as variables required.
	 */
	protected void initializeInterpreter() {
		//imports
		NameSpace ns = m_Interpreter.getNameSpace();
		ns.importPackage("net.wimpi.telnetd.io.terminal");
		//variables
		try {
			m_Interpreter.set("termio", m_TermIO);
			m_Interpreter.set("cdata", m_ConData);
			m_Interpreter.set("env", m_Environment);
			m_Interpreter.set("termreader", m_TerminalReader);
		} catch (Exception ex) {
			Activator.getServices().error("initializeInterpreter():", ex);
		}
	}//initializeInterpreter

	//ConnectionListener Implementation
	public void connectionIdle(ConnectionEvent ce) {
		execute(new LogoutHandler("connectionIdle()", "connection_event_idle_warning"));
	}//connectionIdle

	public void connectionTimedOut(ConnectionEvent ce) {
		execute(new LogoutHandler("connectionTimedOut()", "connection_event_idle_loggedout"));
	}//connectionTimedOut

	public void connectionLogoutRequest(ConnectionEvent ce) {
		execute(new LogoutHandler("connectionLogoutRequest()", "connection_event_logoutrequest"));
	}//connectionLogoutRequest

	public void connectionSentBreak(ConnectionEvent ce) {
		Activator.getServices().debug("connectionSentBreak");
	}//connectionSentBreak

	@Override
	public TerminalReader getTerminalReader() {
		return m_TerminalReader;
	}

	class LogoutHandler implements Runnable {

		protected String m_Debug;
		protected String m_Reason;

		public LogoutHandler(String debug, String reason) {
			m_Debug = debug;
			m_Reason = reason;
		}//constructor

		public void run() {
			Activator.getServices().debug(m_Debug);
			try {
				m_TermIO.write(m_Reason);
			} catch (Exception ex) {
				Activator.getServices().error("run()", ex);
			}
			forceTelnetClose();
		}//run

	}//inner class LogoutHandler

}//BeanScriptShell
