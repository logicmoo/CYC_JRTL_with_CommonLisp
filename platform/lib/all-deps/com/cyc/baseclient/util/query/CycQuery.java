/*
 * CycQuery.java
 *
 * Created on August 11, 2004, 10:48 AM
 */

package com.cyc.baseclient.util.query;

import com.cyc.baseclient.inference.DefaultInferenceStatus;
/**
 * @version $Id: CycQuery.java 150734 2014-04-24 22:32:49Z nwinant $
 * @author  mreimers
 */
public interface CycQuery extends Query {
  
  public DefaultInferenceStatus getInferenceStatus();
}
