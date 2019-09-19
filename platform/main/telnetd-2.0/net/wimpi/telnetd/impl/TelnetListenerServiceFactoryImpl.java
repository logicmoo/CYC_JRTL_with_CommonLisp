///***
// * Java TelnetD library (embeddable telnet daemon)
// * Copyright (c) Dieter Wimberger
// * All rights reserved.
// *
// * Redistribution and use in source and binary forms, with or without
// * modification, are permitted provided that the following conditions are
// * met:
// * Redistributions of source code must retain the above copyright notice,
// * this list of conditions and the following disclaimer.
// * Redistributions in binary form must reproduce the above copyright notice,
// * this list of conditions and the following disclaimer in the documentation
// * and/or other materials provided with the distribution.
// *
// * Neither the name of the author nor the names of its contributors
// * may be used to endorse or promote products derived from this software
// * without specific prior written permission.
// *
// * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
// * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
// * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
// * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
// * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
// * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
// * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
// * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// * POSSIBILITY OF SUCH DAMAGE.
// ***/
//package net.wimpi.telnetd.impl;
//
//import net.wimpi.telnetd.service.TelnetListenerService;
//import net.wimpi.telnetd.service.TelnetListenerServiceFactory;
//import net.wimpi.telnetd.util.DictionaryUtility;
//import org.osgi.framework.BundleContext;
//import org.osgi.framework.Constants;
//import org.osgi.framework.ServiceRegistration;
//import org.osgi.service.cm.ConfigurationException;
//import org.osgi.service.cm.ManagedServiceFactory;
//
//import java.util.*;
//
///**
// * This class implements {@link TelnetListenerServiceFactory}.
// * <p/>
// *
// * @author Dieter Wimberger (wimpi)
// * @version @version@ (@date@)
// */
//class TelnetListenerServiceFactoryImpl
//    implements TelnetListenerServiceFactory {
//
//  private ServiceMediator m_Services;
//  private BundleContext m_BundleContext;
//  private Map m_TLServices;
//  private ServiceRegistration m_Registration;
//
//  public TelnetListenerServiceFactoryImpl() {
//
//  }//TelnetListenerServiceFactoryImpl
//
//  public void activate(BundleContext bc) {
//    m_Services = Activator.getServices();
//    m_BundleContext = bc;
//    m_TLServices = new HashMap();
//    Properties props = new Properties();
//    props.put(Constants.SERVICE_PID,
//        TelnetListenerServiceFactory.class.getName());
//    String[] classes =
//        new String[]{ManagedServiceFactory.class.getName(), TelnetListenerServiceFactory.class.getName()};
//    m_Registration = m_BundleContext.registerService(
//        classes,
//        this,
//        props);
//  }//activate
//
//  public void deactivate() {
//    m_Services.debug("deactivate()");
//    final ClassLoader cl = Thread.currentThread().getContextClassLoader();
//    Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
//    try {
//      //unregister all services?
//      for (Iterator iter = m_TLServices.entrySet().iterator(); iter.hasNext();) {
//        Map.Entry entry = (Map.Entry) iter.next();
//        ServiceRegistration sreg = (ServiceRegistration) entry.getValue();
//        TelnetListenerService tls = (TelnetListenerService) m_BundleContext.getService(sreg.getReference());
//        //1. unregister service
//        sreg.unregister();
//        m_Services.info("Unregistered TelnetListenerService " + entry.getKey());
//        //2. stop service
//        tls.stop();
//        m_Services.info("Stopped TelnetListenerService " + entry.getKey());
//        iter.remove();
//      }
//      m_Registration.unregister();
//      m_TLServices.clear();
//
//      m_Registration = null;
//      m_TLServices = null;
//      m_BundleContext = null;
//    } finally {
//      Thread.currentThread().setContextClassLoader(cl);
//    }
//  }//deactivate
//
//  public String getName() {
//    return "Telnet Listener Service Factory";
//  }//getName
//
//  public void updated(String pid, Dictionary conf)
//      throws ConfigurationException {
//    final ClassLoader cl = Thread.currentThread().getContextClassLoader();
//    Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
//    try {
//      if (m_TLServices.containsKey(pid)) {
//        m_Services.info("Updating TelnetListenerService " + pid);
//        ServiceRegistration sr = (ServiceRegistration) m_TLServices.get(pid);
//        TelnetListenerServiceImpl tls = (TelnetListenerServiceImpl) m_BundleContext.getService(sr.getReference());
//        boolean running = tls.isStarted();
//        if (running) {
//          tls.stop();
//          m_Services.info("Stopped TelnetListenerService " + pid);
//        }
//        tls.configure(conf);
//        m_Services.info("Configured TelnetListenerService " + pid);
//        if (running || DictionaryUtility.getBool(conf, "listener.autostart")) {
//          tls.start();
//          m_Services.info("Restarted TelnetListenerService " + pid);
//        }
//      } else {
//        m_Services.info("Creating TelnetListenerService " + pid);
//        //1. create and configure service
//        TelnetListenerServiceImpl tls = new TelnetListenerServiceImpl();
//        tls.configure(conf);
//
//        //2.register service
//        Properties props = new Properties();
//        props.put(Constants.SERVICE_PID, pid);
//
//        ServiceRegistration sr = m_BundleContext.registerService(TelnetListenerService.class.getName(), tls, props);
//        m_TLServices.put(pid, sr);
//
//        //3. start if configured to
//        if (DictionaryUtility.getBool(conf, "listener.autostart")) {
//          m_Services.info("Autostarting TelnetListenerService" + pid);
//          tls.start();
//        } else {
//          m_Services.info("Not autostarted.");
//        }
//
//      }
//    } finally {
//      Thread.currentThread().setContextClassLoader(cl);
//    }
//  }//updatedTemplates
//
//  /**
//   * Removes the {@link net.wimpi.telnetd.service.TelnetListenerService}
//   * associated with the given identifier.
//   * <p/>
//   * The service instance will be unregistered and stopped, connections
//   * will be shutdown.
//   * </p>
//   *
//   * @param pid the id to be deleted.
//   */
//  public void deleted(String pid) {
//    final ClassLoader cl = Thread.currentThread().getContextClassLoader();
//    Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
//    try {
//      if (m_TLServices.containsKey(pid)) {
//        ServiceRegistration sreg = (ServiceRegistration) m_TLServices.remove(pid);
//        TelnetListenerService tls = (TelnetListenerService) m_BundleContext.getService(sreg.getReference());
//
//        //1. unregister service
//        sreg.unregister();
//        m_Services.info("Unregistered TelnetListenerService " + pid);
//        //2. stop service
//
//
//        tls.stop();
//
//        m_Services.info("Stopped TelnetListenerService " + pid);
//      }
//    } finally {
//      Thread.currentThread().setContextClassLoader(cl);
//    }
//  }//deleted
//
//
//}//class TelnetListenerServiceFactoryImpl
