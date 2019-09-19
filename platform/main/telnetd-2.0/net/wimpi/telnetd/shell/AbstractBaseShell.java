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

import java.util.HashMap;

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.io.TerminalReader;
import net.wimpi.telnetd.net.Connection;
import net.wimpi.telnetd.net.ConnectionData;
import net.wimpi.telnetd.util.ThreadPool;

/**
 * A base class for shell implementations with some
 * convenience methods.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public abstract class AbstractBaseShell implements Shell {

	protected ThreadPool m_ThreadPool = Activator.getThreadPool();
	protected Connection m_Connection;
	protected BasicTerminalIO m_TermIO;
	protected ConnectionData m_ConData;
	protected HashMap m_Environment;
	protected net.wimpi.telnetd.io.TerminalReader m_TerminalReader;

	public AbstractBaseShell() {
	}//constructor

	public void prepare(Connection con) {
		m_Connection = con;
		m_ConData = con.getConnectionData();
		m_TermIO = con.getTerminalIO();
		m_Environment = m_ConData.getEnvironment();
		m_TerminalReader = new TerminalReader(m_TermIO);
	}//prepareShell

	//Telnet session reference accessors
	public Connection getConnection() {
		return m_Connection;
	}//getConnection

	public ConnectionData getConnectionData() {
		return m_ConData;
	}//getConnectionData

	public BasicTerminalIO getTerminalIO() {
		return m_TermIO;
	}//getTerminalIO

	public Object getVariable(String key) {
		return m_Environment.get(key);
	}//getVariable

	public void setVariable(String key, Object o) {
		m_Environment.put(key, o);
	}//setVariable

	public void forceTelnetClose() {
		Activator.getServices().debug("forceTelnetClose()");
		try {
			//close connection
			m_Connection.close();
			//then interrupt
			m_Connection.interrupt();
		} catch (Exception ex) {
			Activator.getServices().error("forceTelnetClose()", ex);
		}
	}//forceTelnetClose

	public void execute(Runnable task) {
		m_ThreadPool.execute(task);
	}//execute

	public void reset() {
		m_Environment.clear();
		m_Environment = null;
		m_Connection = null;
		m_TermIO = null;
		m_ConData = null;
	}//reset

}//class AbstractBaseShell
