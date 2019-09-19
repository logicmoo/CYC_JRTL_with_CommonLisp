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

import java.io.File;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.xml.sax.XMLReader;

import net.wimpi.telnetd.service.ShellServiceManager;
import net.wimpi.telnetd.service.TemplatesService;
import net.wimpi.telnetd.service.TerminalManager;
import net.wimpi.telnetd.shell.ShellService;
import net.wimpi.telnetd.util.ThreadPool;

/**
 * This class is the <tt>BundleActivator</tt> implementation
 * for the OSGi telnetd.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class Activator implements BundleActivator {

	private static BundleContext c_BundleContext;
	private static ServiceMediator c_Services;
	private static TerminalManagerImpl c_TerminalManager;
	private static ShellServiceManagerImpl c_ShellServiceManager;
	//private static TelnetListenerServiceFactoryImpl c_TelnetListenerServiceFactory;
	protected static ThreadPool c_ThreadPool;

	private ShellService m_BeanShellService;
	private ShellService m_DummyShellService;

	public void start(final BundleContext bundleContext) throws Exception {
		c_BundleContext = bundleContext;

		Thread t = new Thread(new Runnable() {
			public void run() {
				c_Services = new ServiceMediator();
				c_Services.activate(bundleContext);

				//1. create and register terminal manager
				c_TerminalManager = new TerminalManagerImpl();
				c_TerminalManager.activate(c_BundleContext);
				c_BundleContext.registerService(TerminalManager.class.getName(), c_TerminalManager, null);
				c_Services.info("Created, activated and registered TerminalManager instance.");

				//2. create and register shell service manager
				c_ShellServiceManager = new ShellServiceManagerImpl();
				c_ShellServiceManager.activate(c_BundleContext);
				c_BundleContext.registerService(ShellServiceManager.class.getName(), c_ShellServiceManager, null);
				c_Services.info("Created, activated and registered ShellServiceManager instance.");

				//3. create and register telnet listener service factory
				//c_TelnetListenerServiceFactory = new TelnetListenerServiceFactoryImpl();
				//c_TelnetListenerServiceFactory.activate(c_BundleContext);
				c_Services.info("Created, activated and registered TelnetListenerServiceFactory instance.");
				c_BundleContext.registerService(ShellServiceManager.class.getName(), c_ShellServiceManager, null);
				//4. create and register templates service
				c_BundleContext.registerService(TemplatesService.class.getName(), new TemplatesServiceImpl(), null);
				c_Services.info("Created, activated and registered TemplatesService instance.");

				//5. create and register the dummy shell service
				c_ThreadPool = new ThreadPool(2);
				c_ThreadPool.activate();
				m_DummyShellService = new DummyShellService();
				m_DummyShellService.activate(bundleContext);
				//m_BeanShellService = new BeanScriptShellService();
				//m_BeanShellService.activate(bundleContext);

				c_BundleContext.registerService(ShellService.class.getName(), m_DummyShellService, null);
				//c_BundleContext.registerService(ShellService.class.getName(), m_BeanShellService, null);
			}//run
		}//Runnable
		);//Thread
		t.setContextClassLoader(getClass().getClassLoader());
		t.start();
	}//start

	public void stop(BundleContext bundleContext) throws Exception {

		try {
			if (m_DummyShellService != null) {
				m_DummyShellService.deactivate();
				m_DummyShellService = null;
			}
		} catch (Exception ex) {
			c_Services.error("stop()", ex);
		}
		try {
			if (m_BeanShellService != null) {
				m_BeanShellService.deactivate();
				m_BeanShellService = null;
			}
		} catch (Exception ex) {
			c_Services.error("stop()", ex);
		}
		try {

			if (c_TerminalManager != null) {
				c_TerminalManager.deactivate();
				c_TerminalManager = null;
			}
		} catch (Exception ex) {
			c_Services.error("stop()", ex);
		}
		try {
			if (c_ShellServiceManager != null) {
				c_ShellServiceManager.deactivate();
				c_ShellServiceManager = null;
			}
		} catch (Exception ex) {
			c_Services.error("stop()", ex);
		}
		//		try {
		//			if (c_TelnetListenerServiceFactory != null) {
		//				c_TelnetListenerServiceFactory.deactivate();
		//				c_TelnetListenerServiceFactory = null;
		//			}
		//		} catch (Exception ex) {
		//			c_Services.error("stop()", ex);
		//		}
		try {
			if (c_ThreadPool != null) {
				c_ThreadPool.deactivate();
				c_ThreadPool = null;
			}
		} catch (Exception ex) {
			c_Services.error("stop()", ex);
		}
		if (c_Services != null) {
			c_Services.deactivate();
			c_Services = null;
		}

		c_BundleContext = null;
	}//stop

	public static TerminalManager getTerminalManager() {
		return c_TerminalManager;
	}//getTerminalManager

	public static ShellServiceManager getShellServiceManager() {
		return c_ShellServiceManager;
	}//getShellServiceManager

	/**
	 * Will obtain factory on demand, dynamically requesting it from
	 * the OSGi container.
	 *
	 * @return an XMLReader from a factory.
	 */
	public static XMLReader getXMLReader() {
		try {
			return c_Services.getSAXParserFactory(ServiceMediator.WAIT_UNLIMITED).newSAXParser().getXMLReader();
		} catch (Exception ex) {
			c_Services.error("getXMLReader()", ex);
			return null;
		}
	}//getParser

	public static ThreadPool getThreadPool() {
		return c_ThreadPool;
	}//getThreadPool

	public static File getDataDir() {
		return c_BundleContext.getDataFile("");
	}//getDataDir

	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Activator.class);

	public static org.apache.log4j.Logger getServices() {
		if (c_Services == null) {
			c_Services = new ServiceMediator();
		}
		return log;
	}//getServices

}//class Activator