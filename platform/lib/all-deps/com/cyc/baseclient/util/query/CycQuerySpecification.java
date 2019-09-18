/*
 * CycQuerySpecification.java
 *
 * Created on August 11, 2004, 10:49 AM
 */

package com.cyc.baseclient.util.query;

import com.cyc.baseclient.cycobject.CycArrayList;

/**
 * @version $Id: CycQuerySpecification.java 150536 2014-04-15 20:54:59Z nwinant $
 * @author  mreimers
 */
public interface CycQuerySpecification extends QuerySpecification {
  
  public CycArrayList getQueryFormula();
}
