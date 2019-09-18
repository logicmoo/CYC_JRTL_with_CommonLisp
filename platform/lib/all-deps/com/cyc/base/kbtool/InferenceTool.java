package com.cyc.base.kbtool;

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.inference.InferenceResultSet;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.CycTimeOutException;

/**
 *
 * @author nwinant
 */
public interface InferenceTool {
  /** 
   * Determines whether the two input queries are equal EL expressions. 
   * @param obj1
   * @param obj2
   * @return 
   * @throws java.io.CycConnectionException
   */
  boolean areQueriesEqualAtEL(Object obj1, Object obj2) throws CycConnectionException;
  
  /**
   * Asks a Cyc query and returns the binding list. Properties:
   *
   * @param query the query expression
   * @param mt the inference microtheory
   * @param maxTransformationDepth the Integer maximum transformation depth or nil for no limit
   * @param maxNumber the Integer maximum number of returned bindings or nil for no limit
   * @param maxTimeSeconds the Integer maximum number of seconds inference duration or nil for no
   * limit
   * @param maxProofDepth the Integer maximum number of levels in the proof tree or nil for no
   * limit
   *
   * @return the binding list of answers for the given query and inference property settings
   *
   * @throws CycConnectionException if a communication error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList askCycQuery(CycList query, CycObject mt, Object maxTransformationDepth, Object maxNumber, Object maxTimeSeconds, Object maxProofDepth) throws CycConnectionException, CycConnectionException, CycApiException;

  /** Destroys the named problem store.
   *
   * @param name the unique problem store name
   */
  void destroyInferenceProblemStoreByName(final String name) throws CycConnectionException, CycApiException;
  
  /**
   * Run a synchronous query against Cyc.
   *
   * </p><strong>Note: </strong> One should put this call in a try/finally statement
   * and the finally statement should explicitly close the result set. Failure to do so
   * could cause garbage to accumulate on the server.
   *
   * @param query the query in CycList form to ask
   * @param mt the microtheory in which the query should be asked
   * @param queryProperties the query properties to use when asking the query
   * @param timeoutMsecs the amount of time in milliseconds to wait before
   * giving up. A zero for this value means to wait forever.
   * @return the
   * <code>InferenceResultSet</code> which provides a convenient
   * mechanism for walking over results similar to java.sql.ResultSet
   * @throws CycConnectionException if a communication error occurs
   * @throws CycApiException if an internal error occurs
   * @throws CycTimeOutException if the query times out
   */
  InferenceResultSet executeQuery(final CycList query, final ELMt mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Run a synchronous query against Cyc.
   *
   * </p><strong>Note: </strong> One should put this call in a try/finally statement
   * and the finally statement should explicitly close the result set. Failure to do so
   * could cause garbage to accumulate on the server.
   *
   * @param query the query in FormulaSentence form to ask
   * @param mt the microtheory in which the query should be asked
   * @param queryProperties the query properties to use when asking the query
   * @return the
   * <code>InferenceResultSet</code> which provides a convenient
   * mechanism for walking over results similar to java.sql.ResultSet
   * @throws CycConnectionException if a communication error occurs
   * @throws CycApiException if an internal error occurs
   * @throws CycTimeOutException if the query times out
   */
  InferenceResultSet executeQuery(final FormulaSentence query, final ELMt mt, final InferenceParameters queryProperties) throws CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Run a synchronous query against Cyc.
   *
   * </p><strong>Note: </strong> One should put this call in a try/finally statement
   * and the finally statement should explicitly close the result set. Failure to do so
   * could cause garbage to accumulate on the server.
   *
   * @param query the query in FormulaSentence form to ask
   * @param mt the microtheory in which the query should be asked
   * @param queryProperties the query properties to use when asking the query
   * @param timeoutMsecs the amount of time in milliseconds to wait before
   * giving up. A zero for this value means to wait forever.
   * @return the
   * <code>InferenceResultSet</code> which provides a convenient
   * mechanism for walking over results similar to java.sql.ResultSet
   * @throws CycConnectionException if a communication error occurs
   * @throws CycApiException if an internal error occurs
   * @throws CycTimeOutException if the query times out
   */
  InferenceResultSet executeQuery(final FormulaSentence query, final CycObject mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Run a synchronous query against Cyc.
   *
   * </p><strong>Note: </strong> One should put this call in a try/finally statement
   * and the finally statement should explicitly close the result set. Failure to do so
   * could cause garbage to accumulate on the server.
   *
   * @param query the query in String form to ask
   * @param mt the microtheory in which the query should be asked (as a String, CycObject or ELMt)
   * @param queryProperties the query properties to use when asking the query
   * @param timeoutMsecs the amount of time in milliseconds to wait before
   * giving up. A zero for this value means to wait forever.
   * @return the
   * <code>InferenceResultSet</code> which provides a convenient
   * mechanism for walking over results similar to java.sql.ResultSet
   * @throws CycConnectionException if a communication error occurs
   * @throws CycApiException if an internal error occurs
   * @throws CycTimeOutException if the query times out
   */
  InferenceResultSet executeQuery(final String query, final Object mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws CycConnectionException, CycApiException, CycTimeOutException;
  
  /** 
   * Returns a clone of the default HL query properties.
   *
   * @return the default HL query propoerties
   */
  InferenceParameters getHLQueryProperties();
  
  /** Initializes a named inference problem store.
   *
   * @param name the unique problem store name
   * @param queryProperties the given query properties or null if the defaults are to be used
   */
  void initializeNamedInferenceProblemStore(final String name, final InferenceParameters queryProperties) throws CycConnectionException, CycApiException;

  /**
   * Returns true if the Cyc query (with inference parameters) is proven true.
   *
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords
   * and values, or null if the defaults are to used
   *
   * @return true if the query is proven true.
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error or if there are open variables in the query
   */
  boolean isQueryTrue(CycList query, CycObject mt, InferenceParameters queryProperties) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the Cyc query (with inference parameters) is proven true.
   *
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords
   * and values, or null if the defaults are to used
   *
   * @return true if the query is proven true.
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error or if there are open variables in the query
   */
  boolean isQueryTrue(FormulaSentence query, CycObject mt, InferenceParameters queryProperties) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the Cyc query (with inference parameters) is proven true.
   *
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords
   * and values, or null if the defaults are to used
   * @param timeoutMsecs the time in milliseconds to wait before giving up,
   * set to zero in order to wait forever
   *
   * @return true if the query is proven true.
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error or if there are open variables in the query
   * @throws CycTimeOutException if the calculation takes too long
   */
  boolean isQueryTrue(CycList query, CycObject mt, InferenceParameters queryProperties, long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the Cyc query (with inference parameters) is proven true.
   *
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords
   * and values, or null if the defaults are to used
   * @param timeoutMsecs the time in milliseconds to wait before giving up,
   * set to zero in order to wait forever
   *
   * @return true if the query is proven true.
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error or if there are open variables in the query
   * @throws CycTimeOutException if the calculation takes too long
   */
  boolean isQueryTrue(FormulaSentence query, CycObject mt, InferenceParameters queryProperties, long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff the query is true in the knowledge base.
   *
   * @deprecated
   * @param query the query to be asked in the knowledge base
   * @param mt the microtheory in which the query is asked
   *
   * @return <tt>true</tt> iff the query is true in the knowledge base
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Deprecated
  boolean isQueryTrue(CycList query, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff the query is true in the knowledge base, implements a cache to avoid
   * asking the same question twice from the KB.
   *
   * @deprecated
   * @param query the query to be asked in the knowledge base
   * @param mt the microtheory in which the query is asked
   *
   * @return <tt>true</tt> iff the query is true in the knowledge base
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Deprecated
  boolean isQueryTrue_Cached(CycList query, CycObject mt) throws CycConnectionException, CycApiException;
  
  /** Returns a query properties string for the given query properties if present, otherwise
   * returns a query properties string for the default query properties.
   *
   * @param queryProperties the given query properties or null if the defaults are to be used
   *
   * @return a query properties string for the given query properties if present, otherwise
   * returns a query properties string for the default query properties
   */
  String queryPropertiesToString(final InferenceParameters queryProperties);

  /**
   * Asks a Cyc query (new inference parameters) and returns an XML stream according
 to the specifications in the CycList xmlSpec.
   *
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values
   * @param xmlSpec the specification of elements, attributes, sort order and bindings for the XML that the method returns
   *
   * @return the binding list from the query in the XML format specified by xmlSpec
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  String queryResultsToXMLString(CycList query, CycObject mt, InferenceParameters queryProperties, CycList xmlSpec) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns an XML stream according
 to the specifications in the CycList xmlSpec.
   *
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values
   * @param xmlSpec the specification of elements, attributes, sort order and bindings for the XML that the method returns
   *
   * @return the binding list from the query in the XML format specified by xmlSpec
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  String queryResultsToXMLString(FormulaSentence query, CycObject mt, InferenceParameters queryProperties, CycList xmlSpec) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable.
   *
   * @param variable the unbound variable for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to used
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList<Object> queryVariable(final CycVariableI variable, final CycList query, final CycObject mt, final InferenceParameters queryProperties) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable.
   *
   * @param queryVariable the unbound variable for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList<Object> queryVariable(final CycVariableI queryVariable, final FormulaSentence query, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable.
   *
   * @param queryVariable the unbound variable for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to used
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList<Object> queryVariable(final CycVariableI queryVariable, final FormulaSentence query, final CycObject mt, final InferenceParameters queryProperties) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable.
   *
   * @param queryVariable the unbound variable for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory (given in String, CycObject or ELMt form)
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to used
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList<Object> queryVariable(final CycVariableI queryVariable, final String query, final Object mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable.
   *
   * @param variable the unbound variable for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to used
   * @param timeoutMsecs the amount of time in milliseconds to wait before giving up, set to
   * zero in order to wait forever.
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   * @throws CycTimeOutException if the calculation takes too long
   */
  CycList<Object> queryVariable(final CycVariableI variable, final CycList query, final CycObject mt, final InferenceParameters queryProperties, long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable.
   *
   * @param variable the unbound variable for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to used
   * @param timeoutMsecs the amount of time in milliseconds to wait before giving up, set to
   * zero in order to wait forever.
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   * @throws CycTimeOutException if the calculation takes too long
   */
  CycList<Object> queryVariable(final CycVariableI variable, final FormulaSentence query, final CycObject mt, final InferenceParameters queryProperties, long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable.
   *
   * @param variable the unbound variable for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to used
   * @param inferenceProblemStoreName the problem store name
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList queryVariable(final CycVariableI variable, final CycList query, final CycObject mt, final InferenceParameters queryProperties, final String inferenceProblemStoreName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns a list of bindings for a query with a single unbound variable.
   *
   * @param query the query to be asked in the knowledge base
   * @param variable the single unbound variable in the query for which bindings are sought
   * @param mt the microtheory in which the query is asked
   *
   * @return a list of bindings for the query
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList queryVariable(final CycList query, final CycVariableI variable, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  CycList<Object> queryVariableLow(final CycVariableI queryVariable, final InferenceResultSet rs) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable list.
   *
   * @param variables the list of unbound variables for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to be used
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList<Object> queryVariables(final CycList<CycVariableI> variables, final CycList<Object> query, final CycObject mt, final InferenceParameters queryProperties) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable list.
   *
   * @param variables the list of unbound variables for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to be used
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList<Object> queryVariables(final CycList<CycVariableI> variables, final FormulaSentence query, final CycObject mt, final InferenceParameters queryProperties) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable list.
   *
   * @param variables the list of unbound variables for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to be used
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @SuppressWarnings(value = "unchecked")
  CycList<Object> queryVariables(final CycList<CycVariableI> variables, final String query, final Object mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable list.
   *
   * @param queryVariables the list of unbound variables for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to be used
   * @param inferenceProblemStoreName the problem store name
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList queryVariables(final CycList queryVariables, final CycList query, final CycObject mt, final InferenceParameters queryProperties, final String inferenceProblemStoreName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Asks a Cyc query (new inference parameters) and returns the binding list for the given variable list.
   *
   * @param queryVariables the list of unbound variables for which bindings are sought
   * @param query the query expression
   * @param mt the inference microtheory
   * @param queryProperties queryProperties the list of query property keywords and values, or null if the defaults are to be used
   * @param inferenceProblemStoreName the problem store name
   *
   * @return the binding list resulting from the given query
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList queryVariables(final CycList<CycVariableI> queryVariables, final FormulaSentence query, final CycObject mt, final InferenceParameters queryProperties, final String inferenceProblemStoreName) throws CycConnectionException, CycConnectionException, CycApiException;

}
