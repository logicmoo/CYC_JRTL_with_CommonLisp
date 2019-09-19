/***
 * Coalevo Project
 * http://www.coalevo.net
 *
 * (c) Verein zur Foerderung der Internetkommunikation, Austria
 * http://www.vfi.or.at
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at:
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***/
package net.wimpi.telnetd.impl;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Dictionary;

import javax.xml.parsers.SAXParserFactory;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundleListener;
import org.osgi.framework.Constants;
import org.osgi.framework.Filter;
import org.osgi.framework.FrameworkListener;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogService;

import net.wimpi.telnetd.util.Latch;

/**
 * Implements a mediator pattern class for services from the OSGi container.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class ServiceMediator implements BundleContext, Bundle, ServiceReference {

	private BundleContext m_BundleContext;

	private SAXParserFactory m_SAXParserFactory;
	private Latch m_SAXParserFactoryLatch;

	private LogService m_LogService;
	private Latch m_LogServiceLatch;

	private ServiceListener m_ServiceListener;

	private ServiceReference m_ServRef = new ServiceReference() {

		public Object getProperty(String s) {
			return "";
		}

		public String[] getPropertyKeys() {
			return new String[] { "" };
		}

		public Bundle getBundle() {
			return m_BundleContext.getBundle();
		}//getBundle

		public Bundle[] getUsingBundles() {
			return new Bundle[0];
		}

		//Tests if the bundle that registered the service referenced by this ServiceReference and the specified bundle use the same source for the package of the specified class name.
		//@Override
		public boolean isAssignableTo(Bundle var1, String var2) {
			// TODO Auto-generated method stub
			if (true)
				throw new RuntimeException("Auto-generated method stub:  ServiceReference.isAssignableTo");
			return false;
		}

		// Compares this ServiceReference with the specified ServiceReference for order.
		//@Override
		public int compareTo(Object var1) {
			if (var1 instanceof ServiceMediator) {
				return hashCode() - var1.hashCode();
			}
			if (var1 instanceof Comparable) {
				return -((Comparable) var1).compareTo(this);
			}
			throw new RuntimeException("Auto-generated method stub:  ServiceReference.compareTo");
			//	return hashCode() - var1.hashCode();
		}

	};

	public SAXParserFactory getSAXParserFactory(long wait) {
		try {
			if (wait < 0) {
				m_SAXParserFactoryLatch.acquire();
			} else if (wait > 0) {
				m_SAXParserFactoryLatch.attempt(wait);
			}
		} catch (InterruptedException e) {
			e.printStackTrace(System.err);
		}

		return m_SAXParserFactory;
	}//getSAXParserFactory

	public LogService getLogServiceLatch(long wait) {
		try {
			if (wait < 0) {
				m_LogServiceLatch.acquire();
			} else if (wait > 0) {
				m_LogServiceLatch.attempt(wait);
			}
		} catch (InterruptedException e) {
			e.printStackTrace(System.err);
		}
		return m_LogService;
	}//getLogService

	public void info(String msg) {
		if (m_LogService != null) {
			m_LogService.log(m_ServRef, LogService.LOG_INFO, msg);
		} else {
			sysout(msg);
		}
	}//info

	public void error(String msg, Throwable t) {
		if (m_LogService != null) {
			m_LogService.log(m_ServRef, LogService.LOG_ERROR, msg, t);
		} else {
			syserr(msg, t);
		}
	}//error

	public void error(String msg) {
		if (m_LogService != null) {
			m_LogService.log(m_ServRef, LogService.LOG_ERROR, msg);
		} else {
			syserr(msg, null);
		}
	}//error

	public void debug(String msg) {
		if (m_LogService != null) {
			m_LogService.log(m_ServRef, LogService.LOG_DEBUG, msg);
		} else {
			sysout(msg);
		}
	}//debug

	public void warn(String msg) {
		if (m_LogService != null) {
			m_LogService.log(m_ServRef, LogService.LOG_WARNING, msg);
		} else {
			syserr(msg, null);
		}
	}//warn

	private void sysout(String msg) {
		//Assemble String
		StringBuffer sbuf = new StringBuffer();
		if (m_BundleContext == null) {
			m_BundleContext = this;
		}
		Bundle b = m_BundleContext.getBundle();
		sbuf.append(b.getHeaders().get(Constants.BUNDLE_NAME));
		sbuf.append(" [");
		sbuf.append(b.getBundleId());
		sbuf.append("] ");
		sbuf.append(msg);
		System.out.println(sbuf.toString());
	}//sysout

	private void syserr(String msg, Throwable t) {
		//Assemble String
		StringBuffer sbuf = new StringBuffer();
		Bundle b = m_BundleContext.getBundle();
		sbuf.append(b.getHeaders().get(Constants.BUNDLE_NAME));
		sbuf.append(" [");
		sbuf.append(b.getBundleId());
		sbuf.append("] ");
		sbuf.append(msg);
		System.err.println(sbuf.toString());
		if (t != null) {
			t.printStackTrace(System.err);
		}
	}//logToSystem

	public boolean activate(BundleContext bc) {
		//get the context
		m_BundleContext = bc;

		m_SAXParserFactoryLatch = createWaitLatch();
		m_LogServiceLatch = createWaitLatch();

		//prepareDefinitions listener
		m_ServiceListener = new ServiceListenerImpl();

		//prepareDefinitions the filter
		String filter = "(|(objectclass=" + SAXParserFactory.class.getName() + ")" + "(objectclass=" + LogService.class.getName() + "))";

		try {
			//add the listener to the bundle context.
			bc.addServiceListener(m_ServiceListener, filter);

			//ensure that already registered Service instances are registered with
			//the manager
			ServiceReference[] srl = bc.getServiceReferences(null, filter);
			for (int i = 0; srl != null && i < srl.length; i++) {
				m_ServiceListener.serviceChanged(new ServiceEvent(ServiceEvent.REGISTERED, srl[i]));
			}
		} catch (InvalidSyntaxException ex) {
			ex.printStackTrace(System.err);
			return false;
		}
		return true;
	}//activate

	public void deactivate() {
		if (m_ServiceListener != null) {
			m_BundleContext.removeServiceListener(m_ServiceListener);
			m_ServiceListener = null;
		}

		m_SAXParserFactory = null;
		m_LogService = null;

		if (m_SAXParserFactoryLatch != null) {
			m_SAXParserFactoryLatch.release();
			m_SAXParserFactoryLatch = null;
		}
		if (m_LogServiceLatch != null) {
			m_LogServiceLatch.release();
			m_LogServiceLatch = null;
		}

		m_BundleContext = null;
	}//deactivate

	private Latch createWaitLatch() {
		return new Latch();
	}//createWaitLatch

	private class ServiceListenerImpl implements ServiceListener {

		public void serviceChanged(ServiceEvent ev) {
			ServiceReference sr = ev.getServiceReference();
			Object o = null;
			switch (ev.getType()) {
			case ServiceEvent.REGISTERED:
				o = m_BundleContext.getService(sr);
				if (o == null) {
					return;
				} else if (o instanceof SAXParserFactory) {
					m_SAXParserFactory = (SAXParserFactory) o;
					m_SAXParserFactory.setValidating(false);
					m_SAXParserFactory.setNamespaceAware(true);
					m_SAXParserFactoryLatch.release();
				} else if (o instanceof LogService) {
					m_LogService = (LogService) o;
					m_LogServiceLatch.release();
				} else {
					m_BundleContext.ungetService(sr);
				}
				break;
			case ServiceEvent.UNREGISTERING:
				o = m_BundleContext.getService(sr);
				if (o == null) {
					return;
				} else if (o instanceof SAXParserFactory) {
					m_SAXParserFactory = null;
					m_SAXParserFactoryLatch = createWaitLatch();
				} else if (o instanceof LogService) {
					m_LogService = null;
					m_LogServiceLatch = createWaitLatch();
				} else {
					m_BundleContext.ungetService(sr);
				}
				break;
			}
		}
	}//inner class ServiceListenerImpl

	public static long WAIT_UNLIMITED = -1;
	public static long NO_WAIT = 0;

	@Override
	public String getProperty(String var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.getProperty");
		return null;
	}

	@Override
	public Bundle getBundle() {
		return this;
	}

	@Override
	public Bundle installBundle(String var1) throws BundleException {
		return this;
	}

	@Override
	public Bundle installBundle(String var1, InputStream var2) throws BundleException {
		return this;
	}

	@Override
	public Bundle getBundle(long var1) {
		return this;
	}

	@Override
	public Bundle[] getBundles() {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.getBundles");
		return null;
	}

	@Override
	public void addServiceListener(ServiceListener var1, String var2) throws InvalidSyntaxException {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.addServiceListener");

	}

	@Override
	public void addServiceListener(ServiceListener var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.addServiceListener");

	}

	@Override
	public void removeServiceListener(ServiceListener var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.removeServiceListener");

	}

	@Override
	public void addBundleListener(BundleListener var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.addBundleListener");

	}

	@Override
	public void removeBundleListener(BundleListener var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.removeBundleListener");

	}

	@Override
	public void addFrameworkListener(FrameworkListener var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.addFrameworkListener");

	}

	@Override
	public void removeFrameworkListener(FrameworkListener var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.removeFrameworkListener");

	}

	@Override
	public ServiceRegistration registerService(String[] var1, Object var2, Dictionary var3) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.registerService");
		return null;
	}

	@Override
	public ServiceRegistration registerService(String var1, Object var2, Dictionary var3) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.registerService");
		return null;
	}

	@Override
	public ServiceReference[] getServiceReferences(String var1, String var2) throws InvalidSyntaxException {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.getServiceReferences");
		return null;
	}

	@Override
	public ServiceReference getServiceReference(String var1) {
		return this;
	}

	@Override
	public Object getService(ServiceReference var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.getService");
		return null;
	}

	@Override
	public boolean ungetService(ServiceReference var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.ungetService");
		return false;
	}

	@Override
	public File getDataFile(String var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.getDataFile");
		return null;
	}

	@Override
	public Filter createFilter(String var1) throws InvalidSyntaxException {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  BundleContext.createFilter");
		return null;
	}

	@Override
	public long getBundleId() {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.getBundleId");
		return 0;
	}

	@Override
	public Dictionary getHeaders() {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.getHeaders");
		return null;
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.getLocation");
		return null;
	}

	@Override
	public ServiceReference[] getRegisteredServices() {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.getRegisteredServices");
		return null;
	}

	@Override
	public URL getResource(String var1) {
		return ServiceMediator.class.getResource(var1);
	}

	@Override
	public ServiceReference[] getServicesInUse() {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.getServicesInUse");
		return null;
	}

	@Override
	public int getState() {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.getState");
		return 0;
	}

	@Override
	public boolean hasPermission(Object var1) {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.hasPermission");
		return false;
	}

	@Override
	public void start() throws BundleException {

	}

	@Override
	public void stop() throws BundleException {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.stop");

	}

	@Override
	public void uninstall() throws BundleException {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.uninstall");

	}

	@Override
	public void update() throws BundleException {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.update");

	}

	@Override
	public void update(InputStream var1) throws BundleException {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  Bundle.update");

	}

	@Override
	public String[] getPropertyKeys() {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  ServiceReference.getPropertyKeys");
		return null;
	}

	@Override
	public Bundle[] getUsingBundles() {
		// TODO Auto-generated method stub
		if (true)
			throw new RuntimeException("Auto-generated method stub:  ServiceReference.getUsingBundles");
		return null;
	}

}//class ServiceMediator
