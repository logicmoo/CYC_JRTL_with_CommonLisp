/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.cat.common.config;

import java.io.IOException;
import java.net.UnknownHostException;
//import javax.servlet.FilterConfig;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.ELMt;
import org.opencyc.cycobject.ELMtConstant;
import org.opencyc.cycobject.Guid;
import org.opencyc.inference.params.DefaultInferenceParameters;
import org.opencyc.inference.params.InferenceParameters;

/**
 * This is a simple POJO implementation of CycConfiguration. It is the responsibility
 * of the  instantiater (or descendent) of this class to ensure that the appropriate
 * properties are initialized.
 * 
 * @author nwinant
 */
public class DefaultCycConfiguration implements CycConfiguration {
    /*
  public CycConfiguration(FilterConfig fConfig) throws UnknownHostException, IOException {
    // FIXME: this constructor is slowly falling behind...
    
    if (fConfig.getInitParameter(CYC_SERVERS_PROPERTY) != null) {
      cycServers = fConfig.getInitParameter(CYC_SERVERS_PROPERTY);
      searchForServer();
    } else {
      cycHost = fConfig.getInitParameter(CYC_HOST_PROPERTY);
      cycBasePort = Integer.valueOf(fConfig.getInitParameter(CYC_PORT_PROPERTY));
    }
    
    if (fConfig.getInitParameter(CYC_TIMEOUT_MSECS_PROPERTY) != null) {
      cycTimeoutMsecs = Long.valueOf(fConfig.getInitParameter(CYC_TIMEOUT_MSECS_PROPERTY));
    }
    if ((fConfig.getInitParameter(MT_STRING_PROPERTY) != null)
            && (fConfig.getInitParameter(MT_GUID_STRING_PROPERTY) != null)) {
      setMt(fConfig.getInitParameter(MT_STRING_PROPERTY),
              fConfig.getInitParameter(MT_GUID_STRING_PROPERTY));
    }
    if ((fConfig.getInitParameter(PARAPHRASE_MT_STRING_PROPERTY) != null)
            && (fConfig.getInitParameter(PARAPHRASE_MT_GUID_STRING_PROPERTY) != null)) {
      setParaphraseMt(fConfig.getInitParameter(PARAPHRASE_MT_STRING_PROPERTY),
              fConfig.getInitParameter(PARAPHRASE_MT_GUID_STRING_PROPERTY));
    }
  }
  */


  // Public area
  
  @Override
  public void setMt(ELMt mt) {
    this.mt = mt;
  }

  @Override
  public void setMt(String mtString, String mtGuidString) throws UnknownHostException, IOException {
    this.mtString = mtString;
    this.mtGuidString = mtGuidString;
    setMt(ELMtConstant.makeELMtConstant(new CycConstant(mtString, new Guid(mtGuidString))));
  }

  @Override
  public ELMt getMt() {
    return this.mt;
  }

  @Override
  public void setParaphraseMt(ELMt mt) {
    this.paraphraseMt = mt;
  }

  @Override
  public void setParaphraseMt(String mtString, String mtGuidString) throws UnknownHostException, IOException {
    this.paraphraseMtString = mtString;
    this.paraphraseMtGuidString = mtGuidString;
    setParaphraseMt(ELMtConstant.makeELMtConstant(new CycConstant(paraphraseMtString,
    new Guid(paraphraseMtGuidString))));
  }

  @Override
  public ELMt getParaphraseMt() {
    return this.paraphraseMt;
  }
  
  @Override
  public Long getCycTimeoutMsecs() {
    return cycTimeoutMsecs;
  }

  @Override
  public CycServer getCycServer() {
    return cycServer;
  }
  
  @Override
  public void setDefaultCyclist(String defaultCyclist) {
    this.defaultCyclist = defaultCyclist;
  }
  
  @Override
  public String getDefaultCyclist() {
    return this.defaultCyclist;
  }

  @Override
  public Integer getCycConnectionRetryMaxAttempts() {
    return cycConnectionRetryMaxAttempts;
  }
  
  @Override
  public Integer getCycConnectionRetryWaitSecs() {
    return cycConnectionRetryWaitSecs;
  }
  
  @Override
  public Integer getCycConnectionRetryLogUpdateFrequency() {
    return cycConnectionRetryLogUpdateFrequency;
  }
  
  @Override
  public boolean isAllowUserSpecifiedServers() {
    return allowUserSpecifiedServers;
  }
  
  @Override
  public InferenceParameters getNewInferenceParameters(CycAccess access) {
    DefaultInferenceParameters params = new DefaultInferenceParameters(access);
    params.setMaxTransformationDepth(2);
    params.setBrowsable(false);
    params.setContinuable(false);
    params.setAllowIndeterminateResults(false);
    return params;
  }

  @Override
  public boolean searchForServer() {
    if (cycServers != null) {
      for (String serverString : cycServers.split(";")) {
        CycServer server = CycServer.fromString(serverString);
        if (isCycReachable(server)) {
          this.cycServer = server;
          getLog().info("Connected to host " + server);
          return true;
        }
      }
    }
    return false;
  }


  // Protected area

  protected boolean isCycReachable(CycServer server) {
    try {
      getLog().info("Testing connection to Cyc " + server);
      CycAccess access = new CycAccess(server.getHostName(), server.getBasePort());
      if (access != (CycAccess) null) {
        access = null;
        getLog().info("Connected");
        return true;
      } else {
        getLog().log(Level.SEVERE, "Failed to connect to Cyc server on " + server + ".");
        return false;
      }
    } catch (Exception e) {
      getLog().log(Level.SEVERE, "Failed to connect to Cyc server on " + server + ".");
      return false;
    }
  }

  protected Logger getLog() {
    if (log == null)
      log = Logger.getLogger(getClass().getName());
    return log;
  }


  // Internal rep

  private static final long serialVersionUID = 1L;
  
  protected String cycServers;
  protected CycServer cycServer;
  protected Long cycTimeoutMsecs;
  protected String mtString;
  protected String mtGuidString;
  protected String paraphraseMtString;
  protected String paraphraseMtGuidString;
  protected String defaultCyclist;
  protected ELMt mt;
  protected ELMt paraphraseMt;
  protected Integer cycConnectionRetryMaxAttempts;
  protected Integer cycConnectionRetryWaitSecs;
  protected Integer cycConnectionRetryLogUpdateFrequency;
  protected boolean allowUserSpecifiedServers = false;
  private Logger log;
}
