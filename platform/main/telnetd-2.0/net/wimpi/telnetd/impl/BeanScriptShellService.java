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

import org.osgi.framework.BundleContext;

import net.wimpi.telnetd.shell.BeanScriptShell;
import net.wimpi.telnetd.shell.Shell;
import net.wimpi.telnetd.shell.ShellService;
import net.wimpi.telnetd.util.NoExitSecurityManager;

/**
 * This class implements a BeanShellScript shell.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class BeanScriptShellService implements ShellService {

	private SecurityManager m_SystemSecurity;

	public boolean activate(BundleContext bc) {
		//set no exit security manager
		m_SystemSecurity = System.getSecurityManager();
		System.setSecurityManager(new NoExitSecurityManager(m_SystemSecurity));
		return true;
	}//activate

	public void deactivate() {
		System.setSecurityManager(m_SystemSecurity);
		m_SystemSecurity = null;
	}//deactivate

	public String getIdentifier() {
		return "net.wimpi.telnetd.shell.BeanScriptShell";
	}//getIdentifier

	public Shell createShell() {
		return new BeanScriptShell();
	}//createShell

}//class BeanScriptShellService
