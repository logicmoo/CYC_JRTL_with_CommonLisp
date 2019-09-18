/*
 * Query.java
 *
 * Created on August 10, 2004, 2:04 PM
 */

package com.cyc.baseclient.util.query;

import java.util.Set;

/**
 * @version $Id: QuerySpecification.java 150536 2014-04-15 20:54:59Z nwinant $
 * @author  mreimers
 */
public interface QuerySpecification {
  
  public String getGloss();
  
  public Object getQuestion();
  
  public Set getConstraints();
  public Set getFilteredConstraints(Class constraintType);
  
  public Object clone();
}
