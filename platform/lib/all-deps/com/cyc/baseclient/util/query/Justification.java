/*
 * Justification.java
 *
 * Created on August 10, 2004, 2:06 PM
 */

package com.cyc.baseclient.util.query;

/**
 * @version $Id: Justification.java 150536 2014-04-15 20:54:59Z nwinant $
 * @author  mreimers
 */
public interface Justification {
  public QueryResultSet getQueryResultSet();
  public int getQueryResultSetIndex();
  public String toPrettyString();
}
