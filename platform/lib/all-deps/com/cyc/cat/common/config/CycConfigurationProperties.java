/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.cat.common.config;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Properties;

/**
 *
 * @author nwinant
 */
public class CycConfigurationProperties extends DefaultCycConfiguration {
  
  public CycConfigurationProperties(Properties properties) throws UnknownHostException, IOException {
    if (properties.containsKey(CYC_SERVERS_PROPERTY)) {
      cycServers = properties.getProperty(CYC_SERVERS_PROPERTY);
      searchForServer();
    } else if (properties.containsKey(CYC_SERVER_PROPERTY)) {
      cycServer = CycServer.fromString(properties.getProperty(CYC_SERVER_PROPERTY));
    } else {
      cycServer = new CycServer(
              properties.getProperty(CYC_HOST_PROPERTY),
              Integer.valueOf(properties.getProperty(CYC_PORT_PROPERTY)));
    }
    if (properties.containsKey(CYC_ALLOW_USER_SPECIFIED_SERVERS)) {
      this.allowUserSpecifiedServers = Boolean.parseBoolean(properties.getProperty(CYC_ALLOW_USER_SPECIFIED_SERVERS));
    }
    if (properties.getProperty(CYC_TIMEOUT_MSECS_PROPERTY) != null) {
      cycTimeoutMsecs = Long.valueOf(properties.getProperty(CYC_TIMEOUT_MSECS_PROPERTY));
    }
    if ((properties.getProperty(MT_STRING_PROPERTY) != null)
            && (properties.getProperty(MT_GUID_STRING_PROPERTY) != null)) {
      setMt(properties.getProperty(MT_STRING_PROPERTY),
              properties.getProperty(MT_GUID_STRING_PROPERTY));
    }
    if ((properties.getProperty(PARAPHRASE_MT_STRING_PROPERTY) != null)
            && (properties.getProperty(PARAPHRASE_MT_GUID_STRING_PROPERTY) != null)) {
      setParaphraseMt(properties.getProperty(PARAPHRASE_MT_STRING_PROPERTY),
              properties.getProperty(PARAPHRASE_MT_GUID_STRING_PROPERTY));
    }
    
    this.defaultCyclist = properties.getProperty(CYC_DEFAULT_CYCLIST_PROPERTY);
    
    // FIXME: add these to the FilterConfig constructor, above.
    cycConnectionRetryMaxAttempts = Integer.valueOf(properties.getProperty(CYC_CONNECTION_RETRY_MAX_ATTEMPTS_PROPERTY, "0"));
    cycConnectionRetryWaitSecs = Integer.valueOf(properties.getProperty(CYC_CONNECTION_RETRY_WAIT_SECS_PROPERTY, "15"));
    cycConnectionRetryLogUpdateFrequency = Integer.valueOf(properties.getProperty(CYC_CONNECTION_RETRY_LOG_UPDATE_FREQUENCY_PROPERTY, "4"));
  }
    
  public static final String CYC_HOST_PROPERTY                  = "cyc.host";
  public static final String CYC_PORT_PROPERTY                  = "cyc.port";
  public static final String CYC_SERVER_PROPERTY                = "cyc.server";
  public static final String CYC_SERVERS_PROPERTY               = "cyc.servers";
  public static final String CYC_DEFAULT_CYCLIST_PROPERTY       = "cyc.defaultCyclist";
  public static final String CYC_ALLOW_USER_SPECIFIED_SERVERS   = "cyc.allowUserSpecifiedServers";
  public static final String CYC_TIMEOUT_MSECS_PROPERTY         = "cyc.timeoutMsecs";
  public static final String MT_STRING_PROPERTY                 = "cyc.mtString";
  public static final String MT_GUID_STRING_PROPERTY            = "cyc.mtGuidString";
  public static final String PARAPHRASE_MT_STRING_PROPERTY      = "cyc.paraphraseMtString";
  public static final String PARAPHRASE_MT_GUID_STRING_PROPERTY = "cyc.paraphraseMtGuidString";
  public static final String CYC_CONNECTION_RETRY_MAX_ATTEMPTS_PROPERTY         = "cyc.connection.retry.maxAttempts";
  public static final String CYC_CONNECTION_RETRY_WAIT_SECS_PROPERTY            = "cyc.connection.retry.waitSecs";
  public static final String CYC_CONNECTION_RETRY_LOG_UPDATE_FREQUENCY_PROPERTY = "cyc.connection.retry.logUpdateFrequency";
}
