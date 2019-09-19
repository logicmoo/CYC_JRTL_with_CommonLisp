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

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

import net.wimpi.telnetd.service.ShellServiceManager;
import net.wimpi.telnetd.shell.NoSuchShellServiceException;
import net.wimpi.telnetd.shell.ShellService;

/**
 * This class implements a {@link ShellServiceManager} for
 * dynamic shell implementation handling in an OSGi container.
 * <p/>
 * It implements the white board model
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class ShellServiceManagerImpl implements ShellServiceManager {

	private org.apache.log4j.Logger m_Services;
	private BundleContext m_BundleContext;
	private Map m_ShellServices;
	private ShellServiceListener m_ShellServiceListener;

	public ShellServiceManagerImpl() {
		activate(m_BundleContext);
	}//ShellServiceManagerImpl
/*
 * An error occurred while collecting items to be installed
session context was:(profile=epp.package.jee, phase=org.eclipse.equinox.internal.p2.engine.phases.Collect, operand=, action=).
No repository found containing: osgi.bundle,org.eclipse.buildship.branding,3.1.2.v20190903-1732
No repository found containing: osgi.bundle,org.eclipse.buildship.core,3.1.2.v20190903-1732
No repository found containing: osgi.bundle,org.eclipse.buildship.stsmigration,3.1.2.v20190903-1732
No repository found containing: osgi.bundle,org.eclipse.buildship.ui,3.1.2.v20190903-1732
No repository found containing: osgi.bundle,org.gradle.toolingapi,5.6.1.v20190903-1732
No repository found containing: osgi.bundle,com.google.guava,27.1.0.v20190517-1946
No repository found containing: org.eclipse.update.feature,org.eclipse.buildship,3.1.2.v20190903-1732
 */
	/**
	 * Activates this <tt>ShellServiceManagerImpl</tt>.
	 * The logic will automatically register all {@link net.wimpi.telnetd.shell.ShellService} class
	 * objects, whether registered before or after the activation (i.e. white board
	 * model implementation).
	 *
	 * @param bc the <tt>BundleContext</tt>.
	 */
	public void activate(BundleContext bc) {
		m_Services = Activator.getServices();
		//get the context
		m_BundleContext = bc;
		//prepare the services
		m_ShellServices = Collections.synchronizedMap(new HashMap());

		//prepare listener
		m_ShellServiceListener = new ShellServiceListener();

		//prepare the filter
		String filter = "(objectclass=" + ShellService.class.getName() + ")";

		try {
			if (bc == null)
				return;
			//add the listener to the bundle context.
			bc.addServiceListener(m_ShellServiceListener, filter);
			//ensure that already registered ShellService instances are registered with
			//the manager
			ServiceReference[] srl = bc.getServiceReferences(null, filter);
			for (int i = 0; srl != null && i < srl.length; i++) {
				m_ShellServiceListener.serviceChanged(new ServiceEvent(ServiceEvent.REGISTERED, srl[i]));
			}
		} catch (InvalidSyntaxException ex) {
			m_Services.error("activate()", ex);
		}
	}//activate

	/**
	 * Deactivates this <tt>ShellServiceManagerImpl</tt>.
	 * The logic will remove the listener and release all
	 * references.
	 */
	public void deactivate() {
		//remove the listener
		m_BundleContext.removeServiceListener(m_ShellServiceListener);
		//null out the references
		m_ShellServices.clear();

		m_ShellServices = null;
		m_ShellServiceListener = null;
		m_BundleContext = null;
	}//deactivate

	public boolean register(ShellService sf) {
		String id = sf.getIdentifier();
		if (m_ShellServices.containsKey(id)) {
			return false;
		} else {
			m_ShellServices.put(id, sf);
			m_Services.info("Registered ShellService " + id);
			return true;
		}
	}//register

	public boolean unregister(String id) {
		if (!m_ShellServices.containsKey(id)) {
			return false;
		} else {
			m_ShellServices.remove(id);
			m_Services.info("Unregistered ShellService " + id);
			return true;
		}
	}//unregister

	public ShellService get(String id) throws NoSuchShellServiceException {
		Object o = m_ShellServices.get(id);
		if (o != null) {
			return (ShellService) o;
		} else {
			throw new NoSuchShellServiceException(id);
		}
	}//get

	public boolean isAvailable(String id) {
		return m_ShellServices.containsKey(id);
	}//isAvailable

	public Iterator listAvailable() {
		return m_ShellServices.keySet().iterator();
	}//listAvailable

	private class ShellServiceListener implements ServiceListener {

		public void serviceChanged(ServiceEvent ev) {
			ServiceReference sr = ev.getServiceReference();
			Object o = null;
			switch (ev.getType()) {
			case ServiceEvent.REGISTERED:
				o = m_BundleContext.getService(sr);
				if (o == null) {
					m_Services.error("ServiceListener:serviceChanged:registered:null");
				} else if (!(o instanceof ShellService)) {
					m_Services.error("ServiceListener:serviceChanged:registered:Reference not a ShellService instance.");
				} else {
					register((ShellService) o);
				}
				break;
			case ServiceEvent.UNREGISTERING:
				o = m_BundleContext.getService(sr);
				if (o == null) {
					m_Services.error("ServiceListener:serviceChanged:unregistering:null");
				} else if (!(o instanceof ShellService)) {
					m_Services.error("ServiceListener:serviceChanged:unregistering:Reference not a ShellService instance.");
				} else {
					unregister(((ShellService) o).getIdentifier());
				}
				break;
			}
		}
	}//inner class ShellServiceListener

}//class ShellServiceManagerImpl
