package com.cyc.base.inference;

//// Internal Imports
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;

import java.util.*;

/**
 * <P>InferenceWorker is designed to...
 *
 * @author tbrussea, zelal
 * @date July 27, 2005, 11:40 AM
 * @version $Id: InferenceWorkerSynch.java 150734 2014-04-24 22:32:49Z nwinant $
 */
public interface InferenceWorkerSynch extends InferenceWorker {

  public List performSynchronousInference()
  throws CycConnectionException, CycTimeOutException, CycApiException;

  public InferenceResultSet executeQuery()
  throws CycConnectionException, CycTimeOutException, CycApiException;
  
}
