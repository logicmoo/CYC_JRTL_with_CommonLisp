package com.cyc.webservice.client.api.url;

import com.cyc.cat.common.url.BaseURLStringLibrary;
import com.cyc.cat.common.url.URLString;
import com.cyc.cat.common.url.URLString.Parameter;
import com.cyc.cat.common.url.URLString.Protocol;
import java.io.Serializable;

/**
 *
 * @author nwinant
 */
public class QueryApiURLs extends BaseURLStringLibrary implements Serializable {

  // Constructors
  
  public QueryApiURLs(Protocol protocol, String host, Integer port) {
    super(protocol, host, port);
  }
  
  public QueryApiURLs(String host, Integer port) {
    super(host, port);
  }
  
  public QueryApiURLs() {
    super();
  }
  
  
  // Public
  
  /**
   * @deprecated
   */
  public URLString getResultsForQuery(String queryId) {
    return makeURL(RESULTS_PATH, new Parameter("queryId", queryId));
  }
  
  public URLString beginAsyncQuery(String queryId) {
    return makeURL(BEGIN_ASYNC_QUERY_PATH, new Parameter("queryId", queryId));
  }
  
  public URLString getAsyncQueryResults(String ticketId) {
    return makeURL(ASYNC_QUERY_RESULTS_PATH, new Parameter("ticketId", ticketId));
  }
  
  public URLString forgetCachedQueryResults() {
    return makeURL(FORGET_CACHED_PATH);
  }
  
  /**
   * @deprecated
   */
  public URLString destroyOneInference(String inferenceID) {
    return makeURL(DESTROY_INFERENCE_PATH, new Parameter("inferenceID", inferenceID));
  }
  
  public URLString getUUID() {
    return makeURL(UUID_PATH);
  }
  
  
  
  public URLString relinquishTicket(String ticketId) {
    return makeURL(getTicketActionPath(ticketId, TICKET_RELINQUISH_ACTION));
  }
  
  public URLString getInferenceIdentifier(String ticketId) {
    return makeURL(getTicketActionPath(ticketId, TICKET_INFERENCE_ID_ACTION));
  }
  
  public URLString justifyAnswer(String ticketId, String answerId) {
    return makeURL(JUSTIFY_ANSWER_PATH, new Parameter("ticketId", ticketId), new Parameter("answerId", answerId));
  }
  
  
  // Protected
  
  @Override
  protected String getBasePath() { return BASE_PATH; }
  
  protected String getTicketActionPath(String ticketId, String action) {
    return TICKET_PATH + "/" + ticketId + action;
  }
  
  
  // Internal
  
  private static final long serialVersionUID = 1L;
  
  static final public String BASE_PATH = "/query";
  static final public String INFERENCE_PATH = "/inference";
  static final public String ANSWERER_PATH = "/answerer";
  static final public String TICKET_BASE_PATH = "/ticket";
  static final public String JUSTIFY_PATH = "/justification";
  
  static final public String RESULTS_BASE_PATH = "/results";
  static final public String BEGIN_ASYNC_QUERY_BASE_PATH = "/beginAsyncQuery";
  static final public String ASYNC_QUERY_RESULTS_BASE_PATH = "/asyncQueryResults";
  static final public String FORGET_CACHED_BASE_PATH = "/forgetCachedQueryResults";
  static final public String DESTROY_INFERENCE_BASE_PATH = "/destroyOneInference";
  static final public String UUID_BASE_PATH = "/uuid";
  static final public String JUSTIFY_ANSWER_BASE_PATH = "/justify";
    
  static final public String TICKET_INFERENCE_ID_ACTION = "/inferenceIdentifier";
  static final public String TICKET_RESULTS_ACTION = "/results";
  static final public String TICKET_RELINQUISH_ACTION = "/relinquish";

  static final public String RESULTS_PATH = INFERENCE_PATH + ANSWERER_PATH + RESULTS_BASE_PATH;
  static final public String BEGIN_ASYNC_QUERY_PATH = INFERENCE_PATH + ANSWERER_PATH + BEGIN_ASYNC_QUERY_BASE_PATH;
  static final public String ASYNC_QUERY_RESULTS_PATH = INFERENCE_PATH + ANSWERER_PATH + ASYNC_QUERY_RESULTS_BASE_PATH;
  static final public String FORGET_CACHED_PATH = INFERENCE_PATH + ANSWERER_PATH + FORGET_CACHED_BASE_PATH;
  static final public String DESTROY_INFERENCE_PATH = INFERENCE_PATH + ANSWERER_PATH + DESTROY_INFERENCE_BASE_PATH;
  static final public String UUID_PATH = INFERENCE_PATH + ANSWERER_PATH + UUID_BASE_PATH;
  static final public String TICKET_PATH = INFERENCE_PATH + TICKET_BASE_PATH;
  static final public String JUSTIFY_ANSWER_PATH = JUSTIFY_PATH + JUSTIFY_ANSWER_BASE_PATH;
}