package com.cyc.inference;

/*
 * #%L
 * Query API
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */


//import com.cyc.cat.common.config.CycApplicationProperties;
import static com.cyc.baseclient.api.SubLAPIHelper.makeSubLStmt;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.baseclient.api.CycApiClosedConnectionException;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.DefaultCycObject;
import com.cyc.baseclient.inference.KBQueryFactory;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.inference.async.AsyncResultProcessor;
import com.cyc.inference.async.Ticket;
import com.cyc.inference.async.TicketManager;
import com.cyc.kb.Query;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.km.query.export.XMLResultsExporter;
//import org.opencyc.api.CycAccess;
//import org.opencyc.api.CycApiClosedConnectionException;
//import org.opencyc.api.CycApiException;
//import static org.opencyc.api.SubLAPIHelper.makeSubLStmt;
//import org.opencyc.cycobject.*;
//import org.opencyc.inference.InferenceWorker;
//import org.opencyc.inference.KBQueryFactory;
//import org.opencyc.inference.params.DefaultInferenceParameters;
//import org.opencyc.inference.params.InferenceParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author nwinant
 */
public class QueryAnswerer {

  /**
   * Construct a new query answerer with the specified properties.
   * @param properties
   */
  public QueryAnswerer(Properties properties) {
    this.properties = properties;
  }

  /**
   * Construct a new query answerer with default properties.
   */
  public QueryAnswerer() {
    // FIXME: Acquiring default properties should be much more elegant than this.
    //                        See QUERYAPI-22 - nwinant, 2014-05-08
    //this(new CycApplicationProperties());
    this(getDefaultProperties());
  }
   
  @Deprecated
  protected static Properties getDefaultProperties() {
    // This is a hack, and should be replaced with a more elegant solution.
    //                        See QUERYAPI-22 - nwinant, 2014-05-08
    final Properties props = new Properties();
    props.put(QueryAnswerer.INFERENCE_CLEANUP_DELAY_KEY, "1200");
    return props;
  }
  

  // Public
  /**
   * Gets results for the specified query.
   *
   * @deprecated
   * @param queryID
   * @return XML
   * @throws UnknownHostException
   * @throws IOException
   * @throws Exception
   */
  public String getResultsForQuery(final String queryID) throws IOException, Exception {
    final Query query = getQueryFromID(queryID);
    query.retainInference();
    try {
      query.performInference();
      final ByteArrayOutputStream stream = new ByteArrayOutputStream();
      new XMLResultsExporter(new PrintStream(stream)).export(query);
      return stream.toString();
    } finally {
      query.close();
    }
  }

  /**
   * Start an asynchronous query.
   * @param queryID
   * @return a ticket allowing access to the query and its results.
   * @throws UnknownHostException
   * @throws IOException
   * @throws Exception
   */
  public synchronized Ticket beginAsyncQuery(final String queryID) throws IOException, Exception {
    Ticket ticket = getTicketManager().findByQueryID(queryID);
    if (ticket == null) {
      final Query query = getQueryFromID(queryID);
      final AsyncResultProcessor asyncResultProcessor = getAsyncResultProcessor();
      ticket = getTicketManager().create(queryID);
      asyncResultProcessor.begin(query, ticket, new XMLResultsExporter());
    }
    return ticket;
  }

  /**
   * Get the results of an asynchronous query.
   * <p>Note: method will not return until results are available.
   * @param ticket
   * @return XML
   * @throws UnknownHostException
   * @throws IOException
   */
  public String getResultsForAsyncQuery(Ticket ticket) {
    System.err.println("Retrieving results: " + ticket.getId());
    String result = ticket.getResult();
    return result;
  }

  /**
   *
   * @return an upper bound on the number of results forgotten.
   */
  public int forgetCachedQueryResults() {
    return getTicketManager().clear();
  }

  /**
   * Destroy one inference, so its resources can be reclaimed.
   *
   * @param inferenceID
   * @throws UnknownHostException
   * @throws IOException
 * @throws CycConnectionException 
 * @throws CycApiException 
   * @deprecated
   */
  //
  public void destroyOneInference(final String inferenceID) throws CycApiException, CycConnectionException {
    converseVoid(makeSubLStmt("destroy-one-query-suggestion-inference",
            inferenceID, getUUID().toString()));
  }

  /**
   *
   * @return this query answerer's UUID.
   */
  public UUID getUUID() {
    return uuid;
  }
  
  /**
   *
   * @return this query answerer's ticket manager.
   */
  public TicketManager getTicketManager() {
    return TicketManager.get();
  }
  

  // Private
  
  private CycAccess getCycAccess() {
    return CycAccessManager.get().getCurrentAccess();
  }

  private void rememberInferenceWorker(InferenceWorker worker) {
    inferenceWorkerManager.rememberInferenceWorker(worker);
  }

  @SuppressWarnings("unused")
private InferenceWorker getInferenceWorker(final String queryID) throws IOException, CycApiException, CycConnectionException {
    final DenotationalTerm kbq = (DenotationalTerm) CycNaut.convertIfPromising(
            DefaultCycObject.fromCompactExternalId(queryID, getCycAccess()));
    final KBQueryFactory factory = QueryFactory.getQSInstance();
    final InferenceWorker worker = factory.getInferenceWorker(getCycAccess(),
            kbq, 30000, false);
    rememberInferenceWorker(worker);
    return worker;
  }

  private String converseString(final String command) throws CycApiException, CycConnectionException {
    try {
      LOGGER.debug("#converseString: {}", command);
      String result = getCycAccess().converse().converseString(command);
      LOGGER.debug("                 ... returning result: " + result);
      return result;
    } catch (CycApiClosedConnectionException ex) {
      LOGGER.warn("Lost Cyc connection. Reinitializing and retrying once.{}",
              ex.getLocalizedMessage());
      return getCycAccess().converse().converseString(command);
    }
  }

  private void converseVoid(String command) throws CycApiException, CycConnectionException {
    try {
      LOGGER.debug("#converseVoid: {}", command);
      getCycAccess().converse().converseVoid(command);
      LOGGER.debug("               ... returning.");
    } catch (CycApiClosedConnectionException ex) {
      LOGGER.warn("Lost Cyc connection. Reinitializing and retrying once.{}",
              ex.getLocalizedMessage());
      getCycAccess().converse().converseVoid(command);
    }
  }

  /**
   * @deprecated
   *
   * @return this query answerer's inference parameters.
   * @throws IOException
   */
  @SuppressWarnings("unused")
private InferenceParameters getInferenceParameters() throws IOException {
    if (INFERENCE_PARAMS == null) {
      INFERENCE_PARAMS = new DefaultInferenceParameters(getCycAccess());
      INFERENCE_PARAMS.put(METRICS, new CycArrayList<CycSymbolI>(STEP_INDEXED_PROGRESS_DATA));
    }
    return INFERENCE_PARAMS;
  }

  private synchronized AsyncResultProcessor getAsyncResultProcessor() {
    if (asyncResults == null) {
      getTicketManager().setInferenceCleanupDelaySeconds(Long.valueOf((String) properties.getProperty(
              INFERENCE_CLEANUP_DELAY_KEY)));
      asyncResults = new AsyncResultProcessor() {
        @Override
        protected String processResult(String command) {
          try {
            return converseString(command);
          } catch (Exception ex) {
            LOGGER.error("Error with #converseString", ex);
          }
          return null;
        }
      };
    }
    return asyncResults;
  }

  private Query getQueryFromID(final String queryID) throws Exception, IOException {
    final DenotationalTerm kbq = (DenotationalTerm) CycNaut.convertIfPromising(
            DefaultCycObject.fromCompactExternalId(queryID, getCycAccess()));
    @SuppressWarnings("deprecation")
	final Query query = Query.load(KBIndividualImpl.get(kbq));
    return query;
  }

  // Internal
  static private class QueryFactory extends MonitorCompatibleKBQueryFactory {

    static private final KBQueryFactory INSTANCE = new QueryFactory();

    static private KBQueryFactory getQSInstance() {
      return INSTANCE;
    }
    static private int DEFAULT_TIMEOUT = 15;

    /**
     * Override to introduce default timeout. 
     * @throws CycConnectionException *
     */
    @Override
    protected InferenceParameters loadKBQProperties(CycAccess access,
            DenotationalTerm kbq)
            throws CycApiException, CycConnectionException {
      final InferenceParameters params = super.loadKBQProperties(access, kbq);
      if (params.getMaxTime() == null) {
        params.setMaxTime(DEFAULT_TIMEOUT);
      }
      return params;
    }
  }

  static private class InferenceWorkerManager {

    private final Set<InferenceWorker> inferenceWorkers = new HashSet<InferenceWorker>();

    private InferenceWorkerManager() {
    }

    @Override
    protected void finalize() throws Throwable {
      releaseInferenceResources();
    }

    /**
     * Destroy one inference, so its resources can be reclaimed.
     *
     * @param worker
     * @throws UnknownHostException
     * @throws IOException
     * @throws CycConnectionException 
     * @throws CycApiException 
     * @throws CycTimeOutException 
     */
    private static void releaseInferenceResources(final InferenceWorker worker) throws UnknownHostException, IOException, CycTimeOutException, CycApiException, CycConnectionException {
      worker.releaseInferenceResources(60000);
    }

    /**
     * Destroys all inferences associated with this CycQueryLib.
     *
     * @throws UnknownHostException
     * @throws IOException
     * @throws CycConnectionException 
     * @throws CycApiException 
     * @throws CycTimeOutException 
     */
    private void releaseInferenceResources() throws UnknownHostException, IOException, CycTimeOutException, CycApiException, CycConnectionException {
      synchronized (inferenceWorkers) {
        final int workerCount = inferenceWorkers.size();
        if (workerCount > 0) {
          LOGGER.debug("Releasing resources for " + workerCount + " inference"
                  + ((workerCount == 1) ? "" : "s")
                  + ".");
          for (final Iterator<InferenceWorker> it = inferenceWorkers.iterator(); it.hasNext();) {
            releaseInferenceResources(it.next());
            it.remove();
          }
        }
      }
    }

    private void rememberInferenceWorker(InferenceWorker worker) {
      inferenceWorkers.add(worker);
    }
  }
  /**
   *
   */
  public static final CycConstantI COMPOUND_QUERY_FN = new CycConstant(
          "CompoundQueryFn", new CycGuid("b2f30bff-bf2a-495f-8721-e587d0342922"));
  private static final Logger LOGGER = LoggerFactory.getLogger(
          QueryAnswerer.class);
  private static final InferenceWorkerManager inferenceWorkerManager = new InferenceWorkerManager();
  public static final String INFERENCE_CLEANUP_DELAY_KEY = "inference.cleanup.delay";
  private static CycSymbolI METRICS = new CycSymbol(":METRICS");
  private static CycSymbolI STEP_INDEXED_PROGRESS_DATA = new CycSymbol(
          ":STEP-INDEXED-PROGRESS-DATA");
  private static InferenceParameters INFERENCE_PARAMS = null;
  private final UUID uuid = UUID.randomUUID();
  private final Properties properties;
  private AsyncResultProcessor asyncResults;
}
