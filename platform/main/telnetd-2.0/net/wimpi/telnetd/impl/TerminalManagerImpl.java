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
package net.wimpi.telnetd.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.osgi.framework.BundleContext;

import net.wimpi.telnetd.io.terminal.NoSuchTerminalException;
import net.wimpi.telnetd.io.terminal.Terminal;
import net.wimpi.telnetd.io.terminal.ansi;
import net.wimpi.telnetd.io.terminal.vt100;
import net.wimpi.telnetd.io.terminal.xterm;
import net.wimpi.telnetd.service.TerminalManager;

/**
 * Class implementing the {@link TerminalManager} service.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
public class TerminalManagerImpl implements TerminalManager {

	private org.apache.log4j.Logger m_Services;
	private Map m_Terminals;
	private Map m_Aliases;
	private String m_Default;

	public TerminalManagerImpl() {
	}//constructor

	/**
	 * Activates this terminal manager.
	 * @param bc the bundle context.
	 */
	public void activate(BundleContext bc) {
		m_Services = Activator.getServices();
		m_Terminals = new HashMap(25);
		m_Aliases = new HashMap(25);
		try {
			//1. Register default bundled
			register("vt100", new vt100());
			register("ansi", new ansi());
			register("xterm", new xterm());

			//2. Register default aliases
			registerAlias("vt100", "vt100-am");
			registerAlias("vt100", "vt102");
			registerAlias("vt100", "dec-vt100");

			registerAlias("ansi", "vt320");
			registerAlias("ansi", "vt220");
			registerAlias("ansi", "linux");
			registerAlias("ansi", "screen");

			registerAlias("xterm", "color-xterm");
			registerAlias("xterm", "xterm-color");

			//3. Set default to ansi
			setDefault("ansi");

		} catch (NoSuchTerminalException ex) {
			m_Services.error("Something went terribly wrong.");
		}
	}//activate

	public void deactivate() {
		if (m_Terminals != null) {
			m_Terminals.clear();
			m_Terminals = null;
		}
		if (m_Aliases != null) {
			m_Aliases.clear();
			m_Aliases = null;
		}
		m_Default = null;
	}//deactivate

	public boolean register(String termid, Terminal term) {
		if (m_Terminals.containsKey(termid)) {
			return false;
		}
		if (m_Aliases.containsKey(termid)) {
			//un-alias
			m_Aliases.remove(termid);
			m_Services.info("Removed alias " + termid);
		}
		m_Terminals.put(termid, term);
		m_Services.info("Registered terminal " + termid);
		return true;
	}//register

	public boolean registerAlias(String termid, String alias) throws NoSuchTerminalException {
		if (!m_Terminals.containsKey(termid)) {
			if (m_Aliases.containsKey(termid)) {
				//resolve alias to termid and register new alias
				m_Aliases.put(alias, m_Aliases.get(termid));
				return true;
			} else {
				throw new NoSuchTerminalException(termid);
			}
		} else {
			if (m_Aliases.containsKey(termid)) {
				//already aliased
				return false;
			} else {
				m_Aliases.put(alias, termid);
				return true;
			}
		}
	}//register

	public boolean unregister(String id) {
		if (m_Terminals.containsKey(id)) {
			//remove all aliases
			for (Iterator iter = m_Aliases.entrySet().iterator(); iter.hasNext();) {
				Map.Entry next = (Map.Entry) iter.next();
				if (next.getValue().equals(id)) {
					//remove
					iter.remove();
				}
			}
			m_Terminals.remove(id);
			return true;
		} else {
			return (m_Aliases.remove(id) != null);
		}
	}//unregister

	public String getDefault() {
		return m_Default;
	}//getDefault

	public void setDefault(String termid) throws NoSuchTerminalException {
		if (isAvailable(termid)) {
			m_Default = termid;
		} else {
			throw new NoSuchTerminalException(termid);
		}
	}//setDefault

	public boolean isAvailable(String termid) {
		return (m_Terminals.containsKey(termid) || isAlias(termid));
	}//isAvailable

	public boolean isAlias(String termid) {
		return m_Aliases.containsKey(termid);
	}//isAlias

	public Iterator listAvailable() {
		TreeSet ts = new TreeSet();
		ts.addAll(m_Terminals.keySet());
		ts.addAll(m_Aliases.keySet());
		return ts.iterator();
	}//listAvailable

	public Terminal get(String termid) throws NoSuchTerminalException {

		if (m_Terminals == null) {
			activate(null);
		}
		if (m_Terminals.containsKey(termid)) {
			return ((Terminal) m_Terminals.get(termid)).getInstance();
		} else {
			if (m_Aliases.containsKey(termid)) {
				return ((Terminal) m_Terminals.get(m_Aliases.get(termid))).getInstance();
			} else {
				if (m_Default != null) {
					return ((Terminal) m_Terminals.get(m_Default)).getInstance();
				} else {
					throw new NoSuchTerminalException(termid);
				}
			}
		}
	}//getTerminal

}//class TerminalManagerImpl
