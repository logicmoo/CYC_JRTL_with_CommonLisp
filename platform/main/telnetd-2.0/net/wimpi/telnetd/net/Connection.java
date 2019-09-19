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

package net.wimpi.telnetd.net;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.impl.BeanScriptShellService;
import net.wimpi.telnetd.impl.ShellServiceManagerImpl;
import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.io.TerminalIO;
import net.wimpi.telnetd.net.ssh.SecureSocket;
import net.wimpi.telnetd.service.ShellServiceManager;
import net.wimpi.telnetd.shell.PoolingShellService;
import net.wimpi.telnetd.shell.Shell;
import net.wimpi.telnetd.shell.ShellService;

/**
 * Class that implements a connection with this telnet daemon.<br>
 * It is derived from java.lang.Thread, which reflects the architecture
 * constraint of one thread per connection. This might seem a waste of
 * resources, but as a matter of fact sharing threads would require a
 * far more complex imlementation, due to the fact that telnet is not a
 * stateless protocol (i.e. alive throughout a session of multiple requests
 * and responses).<br>
 * Each Connection instance is created by the listeners ConnectionManager
 * instance, making it part of a threadgroup and passing in an associated
 * ConnectionData instance, that holds vital information about the connection.
 * Be sure to take a look at their documention.<br>
 * <p/>
 * Once the thread has started and is running, it will get a login
 * shell instance from the ShellManager and run passing its own reference.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 * @see net.wimpi.telnetd.net.ConnectionManager
 * @see net.wimpi.telnetd.net.ConnectionData
 * @see net.wimpi.telnetd.service.ShellServiceManager
 * @see net.wimpi.telnetd.io.TerminalIO
 */
public class Connection implements Runnable {

	private ShellServiceManager m_ShellServiceManager = Activator.getShellServiceManager();

	private Thread m_Thread;
	private boolean m_Dead;
	private List m_Listeners;

	//Associations
	private ConnectionData m_ConnectionData; //associated information
	private BasicTerminalIO m_TerminalIO; //associated terminal io
	private ShellService m_NextShellService;
	private ShellService m_ActualShellService;

	/**
	 * Constructs a TelnetConnection by invoking its parent constructor
	 * and setting of various members.<br>
	 * Subsequently instantiates the whole i/o subsystem, negotiating
	 * telnet protocol level options etc.<br>
	 *
	 * @param cd  ConnectionData instance containing all vital information
	 *            of this connection.
	 * @see ConnectionData
	 */
	public Connection(ConnectionData cd) {
		m_ConnectionData = cd;
		//init the connection listeners for events
		//(there should actually be only one or two)
		m_Listeners = new ArrayList(3);
		m_TerminalIO = new TerminalIO(this);
		m_Dead = false;
	}//constructor

	public Connection(ThreadGroup m_ThreadGroup, ConnectionData newCD) {
		this(newCD);

	}

	public void setThread(Thread t) {
		m_Thread = t;
	}//setThread

	public void interrupt() throws InterruptedException {
		if (m_Thread != null && m_Thread.isAlive() && !m_Thread.isInterrupted()) {
			m_Thread.interrupt();
		}
	}//interrupt

	/**
	 * Method overloaded to implement following behaviour:
	 * <ol>
	 * <li> On first entry, retrieve an instance of the configured
	 * login shell from the ShellManager and run it.
	 * <li> Handle a shell switch or close down disgracefully when
	 * problems (i.e. unhandled unchecked exceptions) occur in the
	 * running shell.
	 * </ol>
	 */
	public void run() {

		if (m_ConnectionData.isSecure()) {
			SecureSocket insock = (SecureSocket) m_ConnectionData.getSocket();
			try {
				Activator.getServices().debug("initating SSH Connection: " + insock.toString());
				insock.initiate();
			} catch (Throwable t) {
				Activator.getServices().error("run()", t);
			}
		}
		boolean done = false;
		Shell sh = null;

		try {
			m_TerminalIO.initIO();
		} catch (IOException ex) {
			Activator.getServices().error("run()", ex);
			return;
		}
		try {
			if (!setNextShell(m_ConnectionData.getStartShell())) {
				Activator.getServices().error("Failed to obtain start shell " + m_ConnectionData.getStartShell());
				return;
			}
			sh = leaseShell(); //next is actual
			do {
				sh.run(this);
				releaseShell(sh); //if required
				if (m_Dead) {
					done = true;
					break;
				}
				sh = leaseShell();
				if (sh == null) {
					done = true;
				}
			} while (!done || m_Dead);

		} catch (Exception ex) {
			Activator.getServices().error("run()", ex); //Handle properly
			releaseShell(sh); //if required
		} finally {
			//call close if not dead already
			if (!m_Dead) {
				close();
			}
		}
		Activator.getServices().debug("run():: Returning from " + this.toString());
		//null out all
		m_ConnectionData.dispose();
		m_ConnectionData = null;
		m_ShellServiceManager = null;
		m_Thread = null;
		m_Listeners.clear();
		m_Listeners = null;
		m_TerminalIO.close();
		m_TerminalIO = null;
		m_NextShellService = null;
		m_ActualShellService = null;
	}//run

	/**
	 * Method to access the associated connection data.
	 *
	 * @return ConnectionData associated with the Connection instance.
	 * @see net.wimpi.telnetd.net.ConnectionData
	 */
	public ConnectionData getConnectionData() {
		return m_ConnectionData;
	}//getConnectionData

	/**
	 * Method to access the associated terminal io.
	 *
	 * @return BasicTerminalIO associated with the Connection instance.
	 * @see net.wimpi.telnetd.io.BasicTerminalIO
	 */
	public BasicTerminalIO getTerminalIO() {
		return m_TerminalIO;
	}//getTerminalIO

	/**
	 * Method to prepare the Connection for a shell switch.<br>
	 * A shell instance will be acquired from the ShellManager
	 * according to the given name.<br>
	 * In case of a nonexistant name the return will be false,
	 * otherwise true.
	 *
	 * @param name String that should represent a valid shell name.
	 * @return boolean flagging if the request could be carried out correctly.
	 * @see net.wimpi.telnetd.service.ShellServiceManager
	 */
	public boolean setNextShell(String name) {
		try {
			if (m_ShellServiceManager == null) {
				m_ShellServiceManager = new ShellServiceManagerImpl();
			}
			try {
				m_NextShellService = m_ShellServiceManager.get(name);
			} catch (Exception e) {
			}

			if (m_NextShellService == null) {
				m_NextShellService = new BeanScriptShellService();
			}
			if (m_NextShellService == null) {
				return false;
			} else {
				return true;
			}
		} catch (Exception ex) {
			m_NextShellService = null;
			return false;
		}
	}//setNextShell

	private Shell leaseShell() {
		if (m_NextShellService == null) {
			return null;
		}
		m_ActualShellService = m_NextShellService;
		m_NextShellService = null;
		if (m_ActualShellService instanceof PoolingShellService) {
			try {
				return ((PoolingShellService) m_ActualShellService).leaseShell();
			} catch (Exception ex) {
				Activator.getServices().error("leaseShell()", ex);
				return null;
			}
		} else {
			return m_ActualShellService.createShell();
		}
	}//leaseShell

	private void releaseShell(Shell sh) {
		if (m_ActualShellService instanceof PoolingShellService) {
			try {
				((PoolingShellService) m_ActualShellService).releaseShell(sh);
			} catch (Exception ex) {
				Activator.getServices().error("releaseShell()", ex);
			}
		}
	}//releaseShell

	/**
	 * Closes the connection and its underlying i/o and network
	 * resources.<br>
	 */
	public synchronized void close() {
		if (m_Dead) {
			return;
		}
		if (m_TerminalIO != null) {
			//close I/O
			try {
				m_TerminalIO.close();
			} catch (Exception ex) {
			}

		}
		//try close Socket
		try {
			//close socket
			m_ConnectionData.getSocket().close();
		} catch (Exception ex) {
			Activator.getServices().error("close()", ex);
		}
		try {
			//register closed connection in ConnectionManager
			m_ConnectionData.getManager().registerClosedConnection(this);
		} catch (Exception ex) {
			Activator.getServices().error("close()", ex);
		}
		if (!Thread.currentThread().equals(m_Thread)) {
			m_Thread.interrupt();
		}
		Activator.getServices().debug("Closed " + this.toString() + " and inactive.");
		m_Dead = true;
	}//close

	/**
	 * Returns if a connection has been closed.<br>
	 *
	 * @return the state of the connection.
	 */
	public boolean isActive() {
		Socket s = m_ConnectionData.getSocket();
		if (m_Dead || s == null || s.isClosed() || s.isInputShutdown() || s.isOutputShutdown()) {
			return false;
		} else {
			return true;
		}
	}//isClosed

	/**
	 * *** Event handling ***************
	 * Method that registers a ConnectionListener with the
	 * Connection instance.
	 *
	 * @param cl ConnectionListener to be registered.
	 * @param cl ConnectionListener to be registered.
	 * @param cl ConnectionListener to be registered.
	 * @param cl ConnectionListener to be registered.
	 * @see ConnectionListener
	 *      <p/>
	 *      Method that registers a ConnectionListener with the
	 *      Connection instance.
	 * @see ConnectionListener
	 *      <p/>
	 *      Method that registers a ConnectionListener with the
	 *      Connection instance.
	 * @see ConnectionListener
	 *      <p/>
	 *      Method that registers a ConnectionListener with the
	 *      Connection instance.
	 * @see net.wimpi.telnetd.net.ConnectionListener
	 */

	/**
	 * Method that registers a ConnectionListener with the
	 * Connection instance.
	 *
	 * @param cl ConnectionListener to be registered.
	 * @see net.wimpi.telnetd.net.ConnectionListener
	 */
	public void addConnectionListener(ConnectionListener cl) {
		m_Listeners.add(cl);
	}//addConnectionListener

	/**
	 * Method that removes a ConnectionListener from the
	 * Connection instance.
	 *
	 * @param cl ConnectionListener to be removed.
	 * @see net.wimpi.telnetd.net.ConnectionListener
	 */
	public void removeConnectionListener(ConnectionListener cl) {
		m_Listeners.remove(cl);
	}//removeConnectionListener

	/**
	 * Method called by the io subsystem to pass on a
	 * "low-level" event. It will be properly delegated to
	 * all registered listeners.
	 *
	 * @param ce ConnectionEvent to be processed.
	 * @see net.wimpi.telnetd.net.ConnectionEvent
	 */
	public void processConnectionEvent(ConnectionEvent ce) {
		try {
			for (int i = 0; i < m_Listeners.size(); i++) {
				ConnectionListener cl = (ConnectionListener) m_Listeners.get(i);
				if (ce.isType(ConnectionEvent.CONNECTION_IDLE)) {
					cl.connectionIdle(ce);
				} else if (ce.isType(ConnectionEvent.CONNECTION_TIMEDOUT)) {
					cl.connectionTimedOut(ce);
				} else if (ce.isType(ConnectionEvent.CONNECTION_LOGOUTREQUEST)) {
					cl.connectionLogoutRequest(ce);
				} else if (ce.isType(ConnectionEvent.CONNECTION_BREAK)) {
					cl.connectionSentBreak(ce);
				}
			}
			if (m_Listeners.size() == 0 && (ce.isType(ConnectionEvent.CONNECTION_TIMEDOUT) || ce.isType(ConnectionEvent.CONNECTION_LOGOUTREQUEST))) {
				close();
			}
		} catch (Exception ex) {
			Activator.getServices().error("processConnectionEvent()", ex);
		}

	}//processConnectionEvent

	public void start() {
		if (m_Thread == null) {
			m_Thread = new Thread(this);
		}
		m_Thread.setName(getClass().getSimpleName() + " " + getConnectionInfo());
		m_Thread.start();
	}

	private String getConnectionInfo() {
		final ConnectionData connectionData = getConnectionData();
		if (connectionData == null)
			return "(unknown)";
		try {
			String slocalPort = "(???)";
			final Socket socket = connectionData.getSocket();
			if (socket != null) {
				slocalPort = "" + socket.getLocalPort();
			}
			final String connKey = getConnectionKey();
			return connectionData.getStartShell() + ":" + slocalPort + "(" + connKey + ")";
		} catch (Exception e) {
			return "(" + e + ")";
		}
	}

	public String getConnectionKey() {
		final ConnectionData connectionData = getConnectionData();
		return connectionData.getHostAddress() + ":" + connectionData.getPort();
	}

}//class Connection
