/*
 * Query.java
 *
 * Created on August 11, 2004, 10:21 AM
 */

package com.cyc.baseclient.util.query;

/**
 * @version $Id: Query.java 150536 2014-04-15 20:54:59Z nwinant $
 * @author  mreimers
 */
public interface Query {

  public Object getId();
  public QuerySpecification getOriginalQuerySpecification();
  public QuerySpecification getQuerySpecification();
  public void setQuerySpecification(QuerySpecification querySpecification);
  
  //public Query makeQuery(QuerySpecification querySpecification);
  
  /**
   * Revert this Query back to the original QuerySpecification.
   */
  public void revertQuerySpecification();
  
  public QueryStatus getQueryStatus();
  public void setQueryStatus(QueryStatus queryStatus);
  
  public QueryResultSet getQueryResultSet();
  public void setQueryResultSet(QueryResultSet resultSet);
  
  //public void notifyDataAvailable();
  //public void notifySpecificationChanged();
  //public void notifyStatusChanged();
  
  public void startQuery();
  public void stopQuery();
  public void pauseQuery();
  public void continueQuery();
  
  public void addQueryListener(QueryListener listener);
  public void removeQueryListener(QueryListener listener);
}
