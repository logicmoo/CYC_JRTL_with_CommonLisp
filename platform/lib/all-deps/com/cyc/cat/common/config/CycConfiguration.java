/* $Id: CycConfiguration.java 146408 2013-07-09 23:36:58Z nwinant $
 *
 * Copyright (c) 2008 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package com.cyc.cat.common.config;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.ELMt;
import org.opencyc.inference.params.InferenceParameters;

/** 
 * <P>CycConfiguration is designed to...
 *
 * <P>Copyright (c) 2008 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : Apr 8, 2010, 12:01:24 PM
 * Author     : nwinant
 * @version $Id: CycConfiguration.java 146408 2013-07-09 23:36:58Z nwinant $
 */
public interface CycConfiguration extends Serializable {

  public void setMt(ELMt mt);
  public void setMt(String mtString, String mtGuidString) throws UnknownHostException, IOException;
  public ELMt getMt();
  public void setParaphraseMt(ELMt mt);
  public void setParaphraseMt(String mtString, String mtGuidString) throws UnknownHostException, IOException;
  public ELMt getParaphraseMt();
  public Long getCycTimeoutMsecs();
  public CycServer getCycServer();
  public void setDefaultCyclist(String defaultCyclist);
  public String getDefaultCyclist();
  public boolean isAllowUserSpecifiedServers();
  public Integer getCycConnectionRetryMaxAttempts();
  public Integer getCycConnectionRetryWaitSecs();
  public Integer getCycConnectionRetryLogUpdateFrequency();
  public InferenceParameters getNewInferenceParameters(CycAccess access);
  public boolean searchForServer();
}
