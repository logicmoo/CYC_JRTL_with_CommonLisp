package com.cyc.kb;

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
import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.ArgPosition;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.base.inference.InferenceIdentifier;
import com.cyc.base.inference.InferenceMode;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.inference.InferenceStatus;
import com.cyc.base.inference.InferenceSuspendReason;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.inference.InferenceWorkerListener;
import com.cyc.base.inference.InferenceWorkerSynch;
import com.cyc.base.inference.metrics.InferenceMetric;
import com.cyc.base.inference.metrics.InferenceMetricsI;
import com.cyc.base.inference.metrics.InferenceMetricsValuesI;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.api.SubLAPIHelper;
import com.cyc.baseclient.cycobject.CycArgPosition;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.inference.CycBackedInferenceAnswer;
import com.cyc.baseclient.inference.DefaultInferenceStatus;
import com.cyc.baseclient.inference.DefaultInferenceSuspendReason;
import com.cyc.baseclient.inference.DefaultInferenceWorkerSynch;
import com.cyc.baseclient.inference.DefaultResultSet;
import com.cyc.baseclient.inference.InferenceAnswerIdentifier;
import com.cyc.baseclient.inference.ResultSetInferenceAnswer;
import com.cyc.baseclient.inference.metrics.InferenceMetricsValues;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.baseclient.inference.params.OpenCycInferenceParameterEnum.OpenCycInferenceMode;
import com.cyc.baseclient.inference.params.SpecifiedInferenceParameters;
import com.cyc.baseclient.parser.CycLParserUtil;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBTermImpl;
import com.cyc.kb.client.KBUtils;
import com.cyc.kb.client.SentenceImpl;
import com.cyc.kb.client.VariableImpl;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBApiException;

import java.io.IOException;
import java.util.*;

import javax.xml.bind.JAXBException;

/**
 * <code>Query</code> is designed to represent queries posed to Cyc and provide
 * access to their results.
 * <p>
 * In general, the process of getting an answer from Cyc is:
 * <ol>
 * <li> Create a <code>Query</code> object and set relevant fields on it.
 * <li> Access the answers via methods like
 * {@link #getAnswers()}, {@link #getResultSet()}, or
 * {@link #get(String, Class)} or by adding a listener via
 * {@link #addListener(com.cyc.base.inference.InferenceWorkerListener)} and
 * starting the query via {@link #performInference()}.
 *
 * @author Vijay Raj
 * @author David Baxter
 *
 */
public class Query {

  private static final int TIMEOUT = 0;
  private static final CycSymbolI RETURN
          = CycObjectFactory.makeCycSymbol(":RETURN");
  private static final CycSymbolI COMPUTE_ANSWER_JUSTIFICATIONS
          = CycObjectFactory.makeCycSymbol(":COMPUTE-ANSWER-JUSTIFICATIONS?");
  private Context ctx;
  private InferenceParameters params;
  private FormulaSentence querySentence = null;
  private final Set<InferenceWorkerListener> listeners = new HashSet<InferenceWorkerListener>();
  private CycAccess cyc = null;
  private KBIndividual id;
  private final Set<Category> categories = new HashSet<Category>();
  private boolean retainInference = false;
  private final QueryInference inference = new QueryInference();

  /**
   * constructs a Query working with the string queryStr.
   * <p>
   * The query is executed in InferencePSC with a default timeout and default
   * inference parameters.
   *
   * @param queryStr	the string representing the CycL query
   * @see com.cyc.kb.Query#TIMEOUT
   *
   * @throws IOException
   */
  public Query(String queryStr) throws IOException {
    this(queryStr, "InferencePSC");
  }

  /**
   * Returns a query object defined by queryStr asked in Microtheory ctxStr,
   * with default inference parameters.
   *
   * @param queryStr The query string.
   * @param ctxStr The Microtheory where the query is asked.
   *
   * @throws IOException
   *
   */
  public Query(String queryStr, String ctxStr) throws IOException {
    this(queryStr, ctxStr, "");
  }

  /**
   * Returns a query object defined by queryStr asked in Microtheory ctxStr,
   * with inference parameters, queryParams.
   *
   * @param queryStr The query string.
   * @param ctxStr The Microtheory where the query is asked.
   * @param queryParams The inference parameters in ":INFERENCE-MODE :SHALLOW
   * :MAX-TIME 1" format.
   *
   * @todo We need a link to all inference params here, and we should make the
   * description more formal. Or advise them to use the constructor that
   * actually takes an InferenceParameters
   * @throws IOException
   *
   */
  public Query(String queryStr, String ctxStr, String queryParams) throws IOException {
    try {
      ctx = ContextImpl.get(ctxStr);
      if (queryStr == null || queryStr.contains("null")) {
        System.out.println("Query string: " + queryStr);
      }
      querySentence = CycLParserUtil.parseCycLSentence(queryStr, true,
              getCycAccess());
      if (queryParams.equals("")) {
        initializeParams();
      } else {
        params = new DefaultInferenceParameters(getCycAccess(), queryParams);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Returns a new query with the specified context, sentence, and parameters.
   *
   * @param sent The CycL sentence to be queried
   * @param ctx the Context in which to run the query
   * @param params
   *
   */
  @Deprecated
  public Query(FormulaSentence sent, Context ctx, InferenceParameters params) {
    this.ctx = ctx;
    this.querySentence = sent;
    this.params = params;
  }

  public Query(Sentence sent, Context ctx, InferenceParameters params) {
    this((FormulaSentence) sent.getCore(), ctx, params);
  }

  /**
   * Returns a new query with the specified context and sentence, and default
   * parameters.
   *
   * @param sent The CycL sentence to be queried
   * @param ctx the Context in which to run the query
   *
   * @throws IOException
   *
   */
  @Deprecated
  public Query(FormulaSentence sent, Context ctx) throws IOException {
    this.ctx = ctx;
    this.querySentence = sent;
    initializeParams();
  }

  public Query(Sentence sent, Context ctx) throws IOException {
    this((FormulaSentence) sent.getCore(), ctx);
  }

  /**
   * Returns a new query with the specified context, sentence, and parameters.
   *
   * @param sent The CycL sentence to be queried
   * @param ctx the Context in which to run the query
   * @param params
   * @throws KBApiException
   *
   * @deprecated Use {@link #Query(FormulaSentence,Context,InferenceParameters)}
   *
   */
  @Deprecated
  public Query(FormulaSentence sent, ELMt ctx, InferenceParameters params) throws KBApiException {
    this.ctx = ContextImpl.get(ctx);
    this.querySentence = sent;
    this.params = params;
  }

  public Query(Sentence sent, ELMt ctx, InferenceParameters params) throws KBApiException {
    this((FormulaSentence) sent.getCore(), ctx, params);
  }

  /**
   * Returns a new query with the specified context and sentence, and default
   * parameters.
   *
   * @param sent The CycL sentence to be queried
   * @param ctx the Context in which to run the query
   *
   * @throws IOException
   * @throws KBApiException
   * @deprecated Use {@link #Query(FormulaSentence,Context)}
   *
   */
  @Deprecated
  public Query(FormulaSentence sent, ELMt ctx) throws IOException, KBApiException {
    this.ctx = ContextImpl.get(ctx);
    this.querySentence = sent;
    initializeParams();
  }

  public Query(Sentence sent, ELMt ctx) throws IOException, KBApiException {
    this((FormulaSentence) sent.getCore(), ctx);
  }

  /**
   * Constructs a Query from a CycLQuerySpecification term.
   *
   * @param id
   * @throws KBApiException
   * @throws CycConnectionException
   * @deprecated New code should use {@link Query#Query(com.cyc.kb.KBIndividual)
   * }.
   *
   */
  public Query(final DenotationalTerm id) throws KBApiException, CycConnectionException {
    this(KBIndividualImpl.get(id.cyclify()));
  }

  /**
   * Constructs a Query from a CycLQuerySpecification KBIndividualImpl. Use of this
   * constructor is equivalent to calling
   * {@link Query#load(com.cyc.kb.KBIndividual)}.
   *
   * @param id
   * @throws KBApiException
   * @throws CycConnectionException
   */
  public Query(final KBIndividual id) throws KBApiException, CycConnectionException {
    final Query tempQuery = load(id);
    this.setQuerySentence(tempQuery.getQuerySentenceCyc());
    this.setContext(tempQuery.getContext());
    this.setInferenceParameters(tempQuery.getInferenceParameters());
  }

  /**
   * Run this query and return the results.
   *
   * @return the results of running the query.
   * @throws CycApiException
   * @throws CycConnectionException
   *
   */
  public KBInferenceResultSet performInference()
          throws CycTimeOutException, CycApiException, CycConnectionException {
    return inference.performInference();
  }

  /**
   * Get the Cyc term that defines this query. To change the Id of an existing
   * query, see {@link #saveAs(String)}
   *
   * @return the id term.
   */
  public KBIndividual getId() {
    return id;
  }

  /**
   * Set the Cyc term that underlies this query in the KB. Note that setting a
   * new ID will not be reflected immediately in the KB. Instead, the change
   * will only be reflected in the KB when the query is saved. Setting a new Id
   * on a query is similar to calling {@link #saveAs(String)}, in that neither
   * method will change the original Query specification in the KB.
   *
   * In general, this method should be avoided. <code>Query</code> is saved.
   *
   * @param id
   */
  void setId(KBIndividual id) {
    this.id = id;
  }

  /**
   * Returns a Query object defined by a query term (i.e. an instance of
   * #$CycLQuerySpecification). Use of this method is equivalent to calling
   * {@link Query#Query(com.cyc.kb.KBIndividual)}.
   *
   * @param id an instance of #$CycLQuerySpecification
   * @return a Query object defined by queryTerm
   * @throws CycConnectionException if there is a problem talking to Cyc
   * @throws KBApiException if there is a problem creating the Query object
   * @throws RuntimeException if there is some other kind of problem
   */
  public static Query load(KBIndividual id) throws CycConnectionException, KBApiException {
    try {
      return new QueryReader().queryFromTerm(id);
    } catch (JAXBException ex) {
      throw new RuntimeException(ex);
    }
  }

  /**
   * Returns a Query object defined by a CycLQuerySpecification term, and
   * substitutes in relevant values from the indexicals Map. This is the
   * equivalent of calling {@link #load(com.cyc.kb.KBIndividual)} and then
   * calling {@link #substituteTermsWithCycObject(java.util.Map)} on it.
   *
   *
   * @param id The instance of CycLQuerySpecification
   * @param indexicals A map from terms in the query (as loaded from the KB) to
   * the actual values that should be queried with.
   *
   * @return a Query object defined by id
   * @throws Exception
   *
   * @deprecated Use {@link #load(KBIndividual,Map)}
   */
  @Deprecated
  public static Query loadCycObjectMap(KBIndividual id, Map<CycObject, Object> indexicals) throws Exception {

    Query q = load(id);
    /*this.ctx = ctx;
     if (!id.isInstanceOf(new Context("UniversalVocabularyMt"), new com.cyc.kb.Collection("CycLQuerySpecification"))) {
     throw new Exception(id + " is not an instance of #$CycLQuerySpecification in UniversalVocabularyMt");
     } else {
     this.id = id;
     }*/
    replaceIndexicalsWithCycObject(q, indexicals);
    return q;
  }

  public static Query load(KBIndividual id, Map<KBObject, Object> indexicals) throws Exception {
    Map<CycObject, Object> kboToCoMap = KBUtils.convertKBObjectMapToCoObjectMap(indexicals);

    Query q = loadCycObjectMap(id, kboToCoMap);
    return q;
  }

  /**
   * Returns a Query object defined by a CycLQuerySpecification term, and
   * substitutes in relevant values from the indexicals Map.
   *
   * @param idStr The instance of CycLQuerySpecification
   * @param indexicals A map from terms in the query (as loaded from the KB) to
   * the actual values that should be queried with.
   *
   * @return a Query object defined by idStr
   * @throws Exception
   */
  public static Query load(String idStr, Map<String, String> indexicals) throws Exception {
    Query q = load(KBIndividualImpl.get(idStr));
    replaceIndexicals(indexicals, q);
    return q;

  }

  /**
   * Substitute specified terms for specified indexicals in the query sentence.
   *
   * @param indexicals - a map from indexicals to their replacements.
   */
  @Deprecated
  public void substituteTermsWithCycObject(Map<CycObject, Object> indexicals) {
    querySentence.applySubstitutionsDestructive(indexicals);
  }

  public void substituteTerms(Map<KBObject, Object> indexicals) {
    Map<CycObject, Object> kboToCoMap = KBUtils.convertKBObjectMapToCoObjectMap(indexicals);
    querySentence.applySubstitutionsDestructive(kboToCoMap);
  }

  @Deprecated
  private static void replaceIndexicalsWithCycObject(Query q,
          Map<CycObject, Object> indexicals) throws IOException, CycApiException, CycConnectionException {
    FormulaSentence cfs = q.getQuerySentenceCyc().treeSubstitute(
            getCurrentCycAccess(), indexicals);
    q.setQuerySentence(cfs);
    q.substituteTermsWithCycObject(indexicals);
  }

  private static void replaceIndexicals(Query q, Map<KBObject, Object> indexicals)
          throws IOException, CycApiException, CycConnectionException {
    Map<CycObject, Object> kboToCoMap = KBUtils.convertKBObjectMapToCoObjectMap(indexicals);
    replaceIndexicalsWithCycObject(q, kboToCoMap);
  }

  private static void replaceIndexicals(Map<String, String> indexicals, Query q)
          throws IOException, CycApiException, CycConnectionException {
    Map<CycObject, Object> idx = new HashMap<CycObject, Object>();
    for (Map.Entry<String, String> kv : indexicals.entrySet()) {
      //this.indexicals.put(cyc.getKnownFortByName(kv.getKey()), CycObjectFactory.makeCycVariable(kv.getValue()));
      idx.put((CycObject) getCycObject(kv.getKey()), getCycObject(kv.getValue()));
    }
    replaceIndexicalsWithCycObject(q, idx);
  }

  /**
   * Ensure that any required Semantic Knowledge Source removal modules for this
   * query have been registered on the Cyc Server and made available for
   * inference.
   *
   * @throws IOException if there is a problem communicating with Cyc.
   * @throws CycConnectionException
   * @throws CycApiException
   *
   * @todo shouldn't this just happen as a side-effect of running the query, if
   * it hasn't happened by the time the query is run? If it does happen
   * automatically, then the only real reason to have this method exposed is to
   * allow the developer control over when exactly this registration happens. If
   * that's the case, it should be explained as such here.
   * @todo should there be a way to note new SKSI sources? Or is that strictly a
   * KB thing. If so, we should probably say that here.
   */
  public void registerRequiredSKSModules() throws IOException, CycApiException, CycConnectionException {
    getCycAccess().converse().converseVoid(
            "(ensure-sksi-modules-needed " + getId().stringApiValue() + ")");
  }

  private static Object getCycObject(String str) {
    if (str.startsWith("?")) {
      return CycObjectFactory.makeCycVariable(str);
    } else if (str.startsWith(":")) {
      return CycObjectFactory.makeCycSymbol(str);
    } else {
      try {
        return getCurrentCycAccess().getLookupTool().getKnownFortByName(getCurrentCycAccess().cyclifyString(
                str));
      } catch (Exception e) {
        return str;
      }
    }
  }

  /**
   * Saves this Query as the term which is its current ID.
   *
   * @see Query#saveAs(java.lang.String)
   * @throws IOException if there is a problem communicating with Cyc.
   * @throws CycConnectionException
   * @throws CycApiException
   * @see Query#getId()
   */
  public void save() throws IOException, CycApiException, CycConnectionException {
    final String command = SubLAPIHelper.makeSubLStmt("update-kbq-definition",
            (DenotationalTerm) getCycAccess().getLookupTool().getKnownFortByName(
                    getId().stringApiValue()),
            getQuerySentenceCyc(), getContext().asELMt(), params);
    getCycAccess().converse().converseVoid(command);
  }

  /**
   * Saves this Query as a new query term with the specified name.
   *
   * @param name The name by which to save the query.
   *
   * @return the new term
   * @throws CycConnectionException
   * @throws IOException
   * @throws CycApiException
   * @throws CreateException if a constant already exists with the specified
   * name.
   * @see Query#save()
   */
  public KBIndividual saveAs(String name) throws KBApiException, IOException, CycApiException, CycConnectionException {
    if (KBTermImpl.existsAsType(name)) {
      throw new CreateException("The name " + name + " is already used.");
    }
    KBIndividual newID = KBIndividualImpl.findOrCreate(name);
    newID.instantiates(KBCollectionImpl.get("CycLQuerySpecification"), ContextImpl.get("UniversalVocabularyMt"));
    setId(newID);
    save();
    return newID;
  }

  /**
   * Returns the categories to which this query belongs. Categories are
   * associated with queries via
   * {@link #addCategory(com.cyc.kb.Query.Category)}.
   *
   * @return the categories to which this query belongs.
   */
  public Collection<? extends Category> getCategories() {
    return Collections.unmodifiableCollection(categories);
  }

  /**
   * Add a new category to which this query belongs.
   *
   * @param category
   */
  public void addCategory(Category category) {
    categories.add(category);
  }

  /**
   * Get the inference identifier for this query.
   *
   * @return the identifier, or null if inference has not been started.
   * @throws CycConnectionException
   * @throws CycTimeOutException
   * @throws CycApiException
   */
  public InferenceIdentifier getInferenceIdentifier()
          throws CycApiException, CycTimeOutException, CycConnectionException {
    return inference.getInferenceIdentifier();
  }

  /**
   * Get the metrics to collect for this Query.
   *
   * @return the metrics
   *
   * @see com.cyc.base.inference.InferenceParameters#getMetrics()
   */
  public Collection<InferenceMetric> getMetrics() {
    return getInferenceParameters().getMetrics();
  }

  /**
   * Get the metrics values for this Query.
   *
   * @return the metrics values.
   * @throws CycConnectionException
   * @throws CycTimeOutException
   * @throws CycApiException
   */
  public InferenceMetricsValuesI getMetricsValues() throws CycApiException, CycTimeOutException, CycConnectionException {
    return InferenceMetricsValues.fromInference(getInferenceIdentifier());
  }

  /**
   * Return the inference parameters for this query.
   *
   * @return the inference parameters.
   */
  public InferenceParameters getInferenceParameters() {
    if (params == null) {
      initializeParams();
    }
    return params;
  }

  /**
   * Adds a listener to this query.
   *
   * @param listener
   * @return this query.
   */
  public Query addListener(InferenceWorkerListener listener) {
    listeners.add(listener);
    return this;
  }

  /**
   * Designates var as a variable to return bindings for.
   *
   * @param var
   * @return this query.
   * @throws java.lang.IllegalArgumentException if var is not found in this
   * query.
   * @throws java.lang.IllegalStateException if query has already been started.
   */
  @Deprecated
  public Query addQueryVariable(CycVariableI var) {
    if (!querySentence.treeContains(var)) {
      throw new IllegalArgumentException(
              var + " is not contained in " + querySentence);
    }
    if (inference.hasBeenStarted) {
      throw new IllegalStateException("Query has already been started.");
    }
    if (!getQueryVariablesCyc().contains(var)) {
      querySentence.existentiallyUnbind(var);
    }
    return this;
  }

  public Query addQueryVariable(Variable var) {
    Query q = addQueryVariable((CycVariableI) var.getCore());
    return q;
  }

  /**
   * Bind a query variable to a specified value. All occurrences of the variable
   * in this query's sentence will be replaced with the specified value.
   *
   * @param var must be a query variable in this query.
   * @param replacement the value to substitute for var.
   */
  @Deprecated
  public void bindVariable(CycVariableI var, Object replacement) {
    if (!getQueryVariablesCyc().contains(var)) {
      throw new IllegalArgumentException(
              var + " is not a query variable in " + getQuerySentenceCyc());
    }
    getQuerySentenceCyc().substituteDestructive(var, replacement);
  }

  public void bindVariable(Variable var, Object replacement) {
    bindVariable((CycVariableI) var.getCore(), replacement);
  }

  /**
   * Bind a query variable to a specified value.
   *
   * @param varName The name of the variable, with or without the '?' prefix.
   * @param replacement
   */
  public void bindVariable(String varName, Object replacement) {
    final CycVariableI var = CycObjectFactory.makeCycVariable(varName);
    if (!getQueryVariablesCyc().contains(var)) {
      throw new IllegalArgumentException(
              var + " is not a query variable in " + getQuerySentenceCyc());
    }
    getQuerySentenceCyc().substituteDestructive(var, replacement);
  }

  /**
   * Designates var as a variable to <i>not</i> return bindings for.
   *
   * @param var
   * @return this Query
   * @throws java.lang.IllegalArgumentException if var is not found in this
   * query.
   * @throws java.lang.IllegalStateException if query has already been started.
   */
  @Deprecated
  public Query removeQueryVariable(CycVariableI var) {
    if (!querySentence.treeContains(var)) {
      throw new IllegalArgumentException(
              var + " is not contained in " + querySentence);
    }
    if (inference.hasBeenStarted) {
      throw new IllegalStateException("Query has already been started.");
    }
    if (getQueryVariablesCyc().contains(var)) {
      querySentence.existentiallyBind(var);
    }
    return this;
  }

  public Query removeQueryVariable(Variable var) {
    Query q = removeQueryVariable((CycVariableI) var.getCore());
    return q;
  }

  /**
   * Return a Collection of the variables in this query for which bindings are
   * sought. Note that this is a copy of the variables, and modification of the
   * returned value will not result in modifications of the underlying Query.
   *
   * @return a Collection of the variables in this query for which bindings are
   * to be sought.
   */
  @Deprecated
  public Collection<CycVariableI> getQueryVariablesCyc() {
    return querySentence.findQueryableVariables();
  }

  public java.util.Collection<Variable> getQueryVariables() throws KBApiException {
    java.util.Collection<CycVariableI> cycvars = getQueryVariablesCyc();
    java.util.Collection<Variable> vars = new HashSet<Variable>();
    for (CycVariableI v : cycvars) {
      vars.add(new VariableImpl(v));
    }
    return vars;
  }

  /**
   * Continues the query. Can be used if a query has not been started yet, has
   * stopped due to reaching the specified number of answers, or has used its
   * alloted time or other resources and is continuable.
   * <p>
   * Any resource constraints, e.g. time or number, get to "start over," so if
   * the inference has already used its alloted 5 seconds, or found the
   * specified three answers, continuing it will allow it to run for up to
   * <i>another</i>
   * 5 seconds, or until it finds up to <i>another</i> three answers.
   * <p>
   * Returns when the inference has stopped running.
   *
   * @throws CycConnectionException
   * @see #setMaxNumber(java.lang.Integer)
   * @see #setMaxTime(java.lang.Integer)
   * @see #isContinuable()
   * @see #setContinuable(boolean)
   *
   * @see
   * InferenceWorker#continueInference(com.cyc.base.inference.InferenceParameters) 
   */
  public void continueQuery() throws CycApiException, CycTimeOutException, CycConnectionException {
    inference.continueInference();
  }

  /**
   * Identifies redundant clauses in this query.
   *
   * For instance, if one clause isa (isa ?X Dog) and another is (isa ?X
   * GreatDane), that pair is considered redundant. This method provides no
   * guidance as to what can or should be done to resolve the redundancy, and in
   * fact it may be virtually harmless, as Cyc can often solve such a query
   * almost as efficiently as it can solve the more specific clause of the pair.
   *
   * @return a collection of pairs of any such clauses
   * @throws CycConnectionException
   * @throws CycApiException
   */
  @Deprecated
  public Collection<Collection<FormulaSentence>> findRedundantClausesCFS() throws CycApiException, CycConnectionException {
    final Set<Collection<FormulaSentence>> clausePairs = new HashSet<Collection<FormulaSentence>>();
    for (final Object obj : getCycAccess().converse().converseList(SubLAPIHelper.makeSubLStmt(
            "find-redundant-literals",
            querySentence, ctx.asELMt()))) {
      final CycList dottedPair = (CycList) obj;
      final FormulaSentence sentence1 = new CycFormulaSentence(
              (CycList) dottedPair.first());
      final FormulaSentence sentence2 = new CycFormulaSentence(
              (CycList) dottedPair.rest());
      clausePairs.add(Arrays.asList(sentence1, sentence2));
    }
    return clausePairs;
  }

  /**
   * Identifies redundant clauses in this query.
   *
   * For instance, if one clause isa (isa ?X Dog) and another is (isa ?X
   * GreatDane), that pair is considered redundant. This method provides no
   * guidance as to what can or should be done to resolve the redundancy, and in
   * fact it may be virtually harmless, as Cyc can often solve such a query
   * almost as efficiently as it can solve the more specific clause of the pair.
   *
   * @return a collection of pairs of any such clauses
   * @throws com.cyc.kb.exception.KBApiException
   * @throws CycConnectionException
   * @throws CycApiException
   */
  public Collection<Collection<Sentence>> findRedundantClauses()
          throws KBApiException, CycApiException, CycConnectionException {
    Collection<Collection<FormulaSentence>> cycClauseCollections = findRedundantClausesCFS();
    Collection<Collection<Sentence>> clauses = new HashSet<Collection<Sentence>>();
    Collection<Sentence> clauseCollections = new HashSet<Sentence>();
    for (Collection<FormulaSentence> c : cycClauseCollections) {
      for (FormulaSentence s : c) {
        clauseCollections.add(new SentenceImpl(s));
      }
      clauses.add(clauseCollections);
    }
    return clauses;
  }

  /**
   * Identifies unconnected clauses in this query. Generally, all clauses of a
   * query will be connected by a chain of variables that connect them together.
   * Queries with unconnected clauses are effectively separate queries, and
   * running queries with disconnected clauses generally results in a cartesian
   * product of the answer sets of the two separate queries.
   *
   * @return a collection of the arg positions of any such clauses
   * @throws java.io.IOException if there is a problem communicating with Cyc.
   * @throws CycConnectionException
   * @throws CycApiException
   */
  public Collection<ArgPosition> findUnconnectedClauses() throws IOException, CycApiException, CycConnectionException {
    final Set<ArgPosition> argPositions = new HashSet<ArgPosition>();
    for (final Object obj : getCycAccess().converse().converseList(SubLAPIHelper.makeSubLStmt(
            "find-unconnected-literals",
            querySentence))) {
      argPositions.add(new CycArgPosition((List<Integer>) obj));
    }
    return argPositions;
  }

  /**
   * Conjoin this sentence with otherQuery, attempting to unify and rename
   * variables. Typically, two different variables will unify into a single
   * variable, causing all the uses of one of the variables to be renamed with
   * the name of the other. In some cases, additional renaming may happen (e.g.
   * if the queries contain mnemonic variables that become more tightly
   * constrained as a result of the unification, a new mnemonic variable may be
   * used in place of both of the original variables).
   *
   * @param otherQuery
   * @return the new query
   * @throws KBApiException if there was a problem constructing the new query.
   * @throws CycConnectionException
   * @throws CycApiException
   */
  public Query merge(Query otherQuery) throws KBApiException, CycApiException, CycConnectionException {
    final String command = SubLAPIHelper.makeSubLStmt("combine-queries",
            querySentence, ctx.asELMt(), params, otherQuery.querySentence,
            otherQuery.ctx.asELMt(), otherQuery.params);
    final CycList newStuff = getCycAccess().converse().converseList(command);
    final Object paramsObj = newStuff.third();
    final List paramsList = CycObjectFactory.nil.equals(paramsObj) ? Collections.emptyList() : (List) paramsObj;
    final List sentenceAsList = (List) newStuff.first();
    return new Query(
            new CycFormulaSentence(sentenceAsList),
            ContextImpl.get((CycObject) newStuff.second()),
            DefaultInferenceParameters.fromPlist(getCycAccess(), paramsList));
  }

  /**
   * Set the inference mode for this Query.
   *
   * @param mode
   * @return this Query
   *
   * @see
   * com.cyc.base.inference.InferenceParameters#setInferenceMode(com.cyc.base.inference.InferenceMode)
   */
  public Query setInferenceMode(InferenceMode mode) {
    getInferenceParameters().setInferenceMode(mode);
    return this;
  }

  /**
   * Check whether this Query (once run) is browsable.
   *
   * @return true iff it is so specified.
   */
  public boolean isBrowsable() {
    return getInferenceParameters().isBrowsable();
  }

  public Query setBrowsable(boolean value) {
    ((SpecifiedInferenceParameters) getInferenceParameters()).setBrowsable(value);
    return this;
  }

  /**
   * Check whether this Query is continuable. Queries that have not yet been run
   * are considered continuable, as well as ones whose parameters have the
   * continuable flag set.
   *
   * @see DefaultInferenceParameters#setContinuable(boolean)
   * @see #continueQuery()
   *
   * @return true iff it can be continued.
   */
  public boolean isContinuable() {
    return !inference.hasBeenStarted || getInferenceParameters().isContinuable();
  }

  /**
   *
   * @param value
   * @return this Query
   * @see #continueQuery()
   */
  public Query setContinuable(boolean value) {
    ((SpecifiedInferenceParameters) getInferenceParameters()).setContinuable(value);
    return this;
  }

  /**
   * Set the maximum number of answers (or sets of answers) that Cyc will
   * attempt to find for this Query. In some cases (such as when a set of
   * answers is retrieved in a batch), more answers than this may actually be
   * returned. Once this number of answers has been reached, Cyc will not
   * actively look for additional answers.
   *
   * @param max
   * @return this Query
   *
   * @see
   * com.cyc.base.inference.InferenceParameters#setMaxNumber(java.lang.Integer)
   */
  public Query setMaxNumber(Integer max) {
    getInferenceParameters().setMaxNumber(max);
    return this;
  }

  /**
   * Set the Context of this Query.
   *
   * @param ctx
   * @return this object.
   */
  public Query setContext(final Context ctx) {
    this.ctx = ctx;
    return this;
  }

  /**
   * Set the soft timeout for this Query in seconds.
   *
   * @param max
   * @return this Query
   *
   * @see
   * com.cyc.base.inference.InferenceParameters#setMaxTime(java.lang.Integer)
   */
  public Query setMaxTime(Integer max) {
    getInferenceParameters().setMaxTime(max);
    return this;
  }

  /**
   * Set the metrics to collect for this Query.
   *
   * @param metrics
   * @return this Query
   *
   * @see
   * com.cyc.base.inference.InferenceParameters#setMetrics(com.cyc.base.inference.metrics.InferenceMetricsI)
   * @throws java.lang.IllegalStateException if query has already been started.
   */
  public Query setMetrics(InferenceMetricsI metrics) {
    getInferenceParameters().setMetrics(metrics);
    return this;
  }

  /**
   * Set the inference parameters for this query.
   *
   * @param params the inference parameters
   * @return this Query object.
   */
  public Query setInferenceParameters(final InferenceParameters params) {
    this.params = params;
    return this;
  }

  /**
   * Sets the hypothesized clause of this Query. When the query is run, Cyc will
   * assume that this clause is true. If the clause is independently known to be
   * false in the query context, the query will be considered tautologous, and
   * will fail.
   *
   * @param sentence
   * @return this Query.
   * @see Query#getQuerySentenceHypothesizedClause()
   * @throws java.lang.IllegalStateException if query has already been started.
   */
  @Deprecated
  public Query setQuerySentenceHypothesizedClause(
          CycFormulaSentence sentence) {
    if (querySentence.isConditionalSentence()) {
      querySentence.setSpecifiedObject(CycArgPosition.ARG1, sentence);
    } else {
      querySentence = CycFormulaSentence.makeConditional(sentence, querySentence);
    }
    return this;
  }

  /**
   * Sets the hypothesized clause of this Query. When the query is run, Cyc will
   * assume that this clause is true. If the clause is independently known to be
   * false in the query context, the query will be considered tautologous, and
   * will fail.
   *
   * @param sentence
   * @return this Query.
   * @see Query#getQuerySentenceHypothesizedClause()
   * @throws java.lang.IllegalStateException if query has already been started.
   */
  public Query setQuerySentenceHypothesizedClause(Sentence sentence) {
    Query q = setQuerySentenceHypothesizedClause((CycFormulaSentence) sentence.getCore());
    return q;
  }

  /**
   * Sets the main (i.e. non-hypothesized) clause of this Query
   *
   * @param sentence
   * @return this Query.
   * @see Query#getQuerySentenceMainClause()
   * @throws java.lang.IllegalStateException if query has already been started.
   */
  @Deprecated
  public Query setQuerySentenceMainClause(
          CycFormulaSentence sentence) {
    if (querySentence.isConditionalSentence()) {
      querySentence.setSpecifiedObject(CycArgPosition.ARG2, sentence);
    } else {
      querySentence = sentence;
    }
    return this;
  }

  /**
   * Sets the main (i.e. non-hypothesized) clause of this Query
   *
   * @param sentence
   * @return this Query.
   * @see Query#getQuerySentenceMainClause()
   * @throws java.lang.IllegalStateException if query has already been started.
   */
  public Query setQuerySentenceMainClause(Sentence sentence) {
    Query q = setQuerySentenceMainClause((CycFormulaSentence) sentence.getCore());
    return q;
  }

  /**
   * Designates vars as the variables to return bindings for.
   *
   * @param vars
   * @return this query.
   * @throws java.lang.IllegalArgumentException if any of vars is not found in
   * this query.
   * @throws java.lang.IllegalStateException if query has already been started.
   */
  public Query setQueryVariablesCyc(Collection<CycVariableI> vars) {
    for (final CycVariableI var : getQueryVariablesCyc()) {
      removeQueryVariable(var);
    }
    for (final CycVariableI var : vars) {
      addQueryVariable(var);
    }
    return this;
  }

  /**
   * Designates vars as the variables to return bindings for.
   *
   * @param vars
   * @return this query.
   * @throws java.lang.IllegalArgumentException if any of vars is not found in
   * this query.
   * @throws java.lang.IllegalStateException if query has already been started.
   */
  public Query setQueryVariables(Collection<Variable> vars) {
    Collection<CycVariableI> cycvars = new HashSet<CycVariableI>();
    for (Variable v : vars) {
      cycvars.add((CycVariableI) v.getCore());
    }
    Query q = setQueryVariablesCyc(cycvars);
    return q;
  }

  /**
   * Starts the query.
   *
   * @throws CycConnectionException
   * @throws CycApiException
   * @throws CycTimeOutException
   *
   * @throws IOException
   */
  public void start() throws CycTimeOutException, CycApiException, IOException, CycConnectionException {
    inference.start();
  }

  /**
   * Issues a request that the query stop immediately.
   *
   * @param patience If non-null, the query will be forcibly aborted if it does
   * not stop before this many seconds have elapsed.
   */
  public void stop(final Integer patience) {
    inference.stop(patience);
  }

  /**
   * Get the Cyc image to be used for this query.
   *
   * @return a CycAccess for the Cyc image.
   */
  public final synchronized CycAccess getCycAccess() {
    if (cyc == null) {
      cyc = CycAccessManager.get().getCurrentAccess();
    }
    return cyc;
  }

  /**
   * Set the Cyc image to be used for this query. If not set, the Cyc image for
   * the current thread will be used.
   *
   * @see com.cyc.base.CycAccessManager#getCurrentAccess()
   * @param cyc
   */
  public void setCycAccess(final CycAccess cyc) {
    this.cyc = cyc;
  }

  /**
   * Specify that this inference should be retained by Cyc until it is
   * explicitly closed. This can be called before the query has been started,
   * and must be called before the query has finished running.
   *
   * @see Query#close()
   */
  public void retainInference() {
    this.retainInference = true;
  }

  private DefaultInferenceParameters getDefaultInferenceParameters() {
    return new DefaultInferenceParameters(getCycAccess(), true);
  }

  private void initializeParams() {
    this.params = getDefaultInferenceParameters();
  }

  /**
   * A class for categorizing queries. There are no predefined categories, and
   * these categories need not correspond to any categorization of reified
   * queries in Cyc. Adding a category does not result in any assertions being
   * made.
   *
   * @see #addCategory(com.cyc.kb.Query.Category)
   */
  public static class Category {

    /**
     * Find or create the Category with the specified name.
     *
     * @param name
     * @return this category
     */
    static public synchronized Category get(final String name) {
      final Category existing = instances.get(name);
      if (existing != null) {
        return existing;
      }
      final Category category = new Category(name);
      instances.put(name, category);
      return category;
    }

    public String getName() {
      return name;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == null) {
        return false;
      }
      if (getClass() != obj.getClass()) {
        return false;
      }
      final Category other = (Category) obj;
      if ((this.name == null) ? (other.name != null) : !this.name.equals(
              other.name)) {
        return false;
    }
      return true;
    }

    @Override
    public int hashCode() {
      int hash = 5;
      hash = 43 * hash + (this.name != null ? this.name.hashCode() : 0);
      return hash;
    }
    private final String name;

    /**
     * Create a new category with the specified name. Does not cause a new term
     * to be reified on the Cyc server.
     *
     * @param name
     */
    private Category(final String name) {
      this.name = name;
    }

    private static final Map<String, Category> instances = new HashMap<String, Category>();
  }

  /**
   * Returns the number of answers found for this query. For running queries,
   * the value returned by this method may change as additional answers are
   * found.
   *
   * @return the number of answers found for this query.
   * @throws CycConnectionException
   * @throws CycTimeOutException
   * @throws CycApiException
   */
  public int getAnswerCount() throws CycApiException, CycTimeOutException, CycConnectionException {
    if (!getQueryVariablesCyc().isEmpty()) {
      return getResultSet().getCurrentRowCount();
    } else if (isTrue()) {
      return 1;
    } else {
      return 0;
    }
  }

  /**
   * Returns the list of answers for this query. For running queries, the value
   * returned by this method may change as additional answers are found.
   *
   * @return the list of answers
   * @throws CycConnectionException
   * @throws CycTimeOutException
   * @throws CycApiException
   * @throws IOException
   */
  public List<InferenceAnswer> getAnswers()
          throws CycApiException, CycTimeOutException, CycConnectionException, IOException {
    final List<InferenceAnswer> answers = new ArrayList<InferenceAnswer>(
            getAnswerCount());
    for (int i = 0; i < getAnswerCount(); i++) {
      answers.add(getAnswer(i));
    }
    return answers;
  }

  /**
   * Returns the nth answer for this query. For the first answer, n == 0.
   *
   * @param n
   * @return the answer.
   * @throws CycConnectionException
   * @throws CycTimeOutException
   * @throws CycApiException
   * @throws IOException
   */
  public InferenceAnswer getAnswer(final int n)
          throws CycApiException, CycTimeOutException, CycConnectionException, IOException {
    if (n >= getAnswerCount()) {
      throw new IllegalArgumentException("Can't get answer " + n
              + ". Query has only " + getAnswerCount() + " answers.");
    }
    final InferenceIdentifier inferenceIdentifier = getInferenceIdentifier();
    if (inferenceIdentifier != null) {
      return new CycBackedInferenceAnswer(new InferenceAnswerIdentifier(
              inferenceIdentifier, n));
    } else if (getResultSet() != null) {
      final KBInferenceResultSet resultSet = getResultSet();
      return new ResultSetInferenceAnswer((DefaultResultSet) resultSet.getInferenceResultSet(), n);
    } else {
      return null;
    }
  }

  /**
   * Returns the Context of this Query.
   *
   * @return the Context of this Query
   */
  public Context getContext() {
    return ctx;
  }

  /**
   * Get the CycL sentence of this query.
   *
   * @return the query sentence
   */
  @Deprecated
  public FormulaSentence getQuerySentenceCyc() {
    return querySentence;
  }

  public Sentence getQuerySentence() throws KBApiException {
    Sentence s = new SentenceImpl(getQuerySentenceCyc());
    return s;
  }

  /**
   * Set the CycL sentence of this query.
   *
   * @param querySentence
   */
  @Deprecated
  public void setQuerySentence(FormulaSentence querySentence) {
    this.querySentence = querySentence;
  }

  public void setQuerySentence(Sentence querySentence) {
    setQuerySentence((FormulaSentence) querySentence.getCore());
  }

  /**
   * Returns the main (that is, non-hypothesized) clause of this Query. All
   * valid queries have a main sentence clause.
   *
   * @return the main (i.e. non-hypothesized) clause of this query.
   */
  @Deprecated
  public FormulaSentence getQuerySentenceMainClauseCyc() {
    if (querySentence.isConditionalSentence()) {
      return (FormulaSentence) querySentence.getArg2();
    } else {
      return querySentence;
    }
  }

  public Sentence getQuerySentenceMainClause() throws KBApiException {
    Sentence s = new SentenceImpl(getQuerySentenceMainClauseCyc());
    return s;
  }

  /**
   * Returns the hypothesized clause of this Query, if any. Most queries have no
   * hypothesized clause, in which case this method will return null.
   *
   * @return the hypothesized clause of this query, if any, or null if there is
   * none.
   */
  @Deprecated
  public FormulaSentence getQuerySentenceHypothesizedClauseCyc() {
    if (querySentence.isConditionalSentence()) {
      return (FormulaSentence) querySentence.getArg1();
    } else {
      return null;
    }
  }

  public Sentence getQuerySentenceHypothesizedClause() throws KBApiException {
    Sentence s = new SentenceImpl(getQuerySentenceHypothesizedClauseCyc());
    return s;
  }

  /**
   * Get the CycL sentence from the specified answer to this query. Substitutes
   * the set of bindings from answer into the query sentence.
   *
   * @param answer
   * @return the answer sentence
   * @throws CycConnectionException
   */
  @Deprecated
  public FormulaSentence getAnswerSentenceCyc(InferenceAnswer answer) throws CycConnectionException {
    final FormulaSentence sentence = getQuerySentenceMainClauseCyc().deepCopy();
    for (final CycVariableI var : getQueryVariablesCyc()) {
      sentence.substituteDestructive(var, answer.getBinding(var));
    }
    return sentence;
  }

  public Sentence getAnswerSentence(InferenceAnswer answer) throws KBApiException, CycConnectionException {
    Sentence s = new SentenceImpl(getAnswerSentenceCyc(answer));
    return s;
  }

  /**
   * Forget all results for this query. All settings on the Query are retained,
   * including the query sentence, context, and inference parameters. After a
   * Query has been cleared, it can be re-run, with possibly different results.
   *
   * @return this Query
   */
  public Query clearResults() {
    inference.clear();
    return this;
  }

  /**
   * Returns the soft timeout for this Query in seconds.
   *
   * @return the soft timeout for this Query in seconds.
   *
   * @see com.cyc.base.inference.InferenceParameters#getMaxTime()
   */
  public Integer getMaxTime() {
    if (params == null) {
      return null;
    } else {
      return params.getMaxTime();
    }
  }

  /**
   * Returns the maximum number of answers (or sets of answers) that Cyc will
   * attempt to find for this Query. In some cases (such as when a set of
   * answers is retrieved in a batch), more answers than this may actually be
   * returned. Once this number of answers has been reached, Cyc will not
   * actively look for additional answers.
   *
   * @return the number cutoff for this Query.
   *
   * @see com.cyc.base.inference.InferenceParameters#getMaxNumber()
   */
  public Integer getMaxNumber() {
    if (params == null) {
      return null;
    } else {
      return params.getMaxNumber();
    }
  }

  /**
   * Returns the inference mode for this Query.
   *
   * @return the inference mode for this Query.
   *
   * @see com.cyc.base.inference.InferenceParameters#getInferenceMode()
   */
  public InferenceMode getInferenceMode() {
    if (params == null) {
      return null;
    } else {
      return params.getInferenceMode();
    }
  }

  /**
   * Return the InferenceStatus for this Query.
   *
   * @return the InferenceStatus for this Query.
   */
  public InferenceStatus getStatus() {
    return this.inference.inferenceStatus;
  }
  
  /**
   * Return the reason why this Query was suspended (if it was).
   * @return the reason, or null if this Query was not suspended.
   * @see DefaultInferenceSuspendReason for examples.
   */
  public InferenceSuspendReason getSuspendReason() {
    return this.inference.getSuspendReason();
  }

  /**
   *
   * @return true iff this query has been proven true.
   * @throws CycConnectionException
   * @throws CycTimeOutException
   * @throws CycApiException
   * @throws RuntimeException if the query has open variables.
   * @see com.cyc.base.inference.InferenceResultSet#getTruthValue()
   */
  public boolean isTrue() throws CycApiException, CycTimeOutException, CycConnectionException {
    return getResultSet().getTruthValue();
  }

  /**
   * Is this query either True (if a boolean query) or does it have bindings (if
   * non-boolean)
   *
   * @return True if there are bindings (or it's a true boolean query), false if
   * there are no bindings (or it's a false boolean query).
   * @throws CycConnectionException
   * @throws CycTimeOutException
   * @throws CycApiException
   * @throws IOException
   *
   */
  public boolean isProvable() throws CycApiException, CycTimeOutException, IOException, CycConnectionException {
    Boolean isProvable = null;
    try {
      isProvable = isTrue();
    } catch (Exception e) {
    }

    if (isProvable == null) {
      isProvable = next();
    }
    return isProvable;
  }

  /**
   * Advance the cursor to the next result
   *
   * @return true if successful (i.e. there was another result)
   * @throws IOException
   * @throws CycConnectionException
   * @throws CycTimeOutException
   * @throws CycApiException
   * @see org.opencyc.inference.AbstractResultSet#next()
   */
  private boolean next() throws IOException, CycApiException, CycTimeOutException, CycConnectionException {
    return getResultSet().next();
  }

  /**
   * Closes this query's result set, and releases resources on the Cyc server.
   * See {@link com.cyc.kb.KBInferenceResultSet#close()} for more details on
   * what happens when a query is closed.
   *
   * @see com.cyc.kb.KBInferenceResultSet#close()
   */
  public void close() {
    inference.close();
  }

  @Override
  public String toString() {
    return "Query: " + querySentence;
  }

  /**
   *
   * @return this query's result set. The KBInferenceResultSet is an object that
   * may be updated dynamically for running queries. This contrasts with
   * {@link #getAnswers()} which returns a static list of the answers at the
   * time is was called.
   * @throws CycConnectionException
   * @throws CycTimeOutException
   * @throws CycApiException
   *
   * @throws IOException
   * @see com.cyc.kb.KBInferenceResultSet
   */
  public synchronized KBInferenceResultSet getResultSet()
          throws CycApiException, CycTimeOutException, CycConnectionException {
    return inference.getResultSet();
  }

  @Override
  public int hashCode() {
    int hash = 1;
    hash = hash * 17 + (ctx == null ? 0 : ctx.hashCode());
    hash = hash * 31 + (params == null ? 0 : params.hashCode());
    hash = hash * 13 + (querySentence == null ? 0 : querySentence.hashCode());
    return hash;
  }

  @Override
  public boolean equals(Object o) {
    if ((o == null) || !(o instanceof Query)) {
      return false;
    }
    return this.hashCode() == o.hashCode();
  }

  /**
   * Inner class to hold the aspects of a Query that it acquires when run.
   */
  private class QueryInference implements InferenceWorkerListener {

    private KBInferenceResultSet rs = null;
    private boolean hasBeenStarted = false;
    private InferenceWorker worker;
    private InferenceStatus inferenceStatus = DefaultInferenceStatus.NOT_STARTED;
    private InferenceIdentifier inferenceIdentifier = null;
    private final List<Object> cycAnswers = new ArrayList<Object>();

    /**
     *
     * @param inferenceWorker
     */
    @Override
    public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
      this.hasBeenStarted = true;
    }

    /**
     *
     * @param oldStatus
     * @param newStatus
     * @param suspendReason
     * @param inferenceWorker
     */
    @Override
    public void notifyInferenceStatusChanged(InferenceStatus oldStatus,
            InferenceStatus newStatus, InferenceSuspendReason suspendReason,
            InferenceWorker inferenceWorker) {
      this.inferenceStatus = newStatus;
    }

    /**
     *
     * @param inferenceWorker
     * @param newAnswers
     */
    @Override
    public void notifyInferenceAnswersAvailable(InferenceWorker inferenceWorker,
            List newAnswers) {
      cycAnswers.addAll(newAnswers);
    }

    /**
     *
     * @param inferenceWorker
     * @param e
     */
    @Override
    public void notifyInferenceTerminated(InferenceWorker inferenceWorker,
            Exception e) {
      if (isContinuingInference) {
        isContinuingInference = false;
        synchronized (continueInferenceLock) {
          continueInferenceLock.notify();
        }
      }
    }

    private InferenceIdentifier getInferenceIdentifier()
            throws CycApiException, CycTimeOutException, CycConnectionException {
      if (inferenceIdentifier == null && hasBeenStarted) {
        if (worker != null) {
          inferenceIdentifier = worker.getInferenceIdentifier();
        }
        if (getResultSet() != null && inferenceIdentifier == null) {
          inferenceIdentifier = rs.getInferenceIdentifier();
        }
      }
      return inferenceIdentifier;
    }

    private InferenceSuspendReason getSuspendReason() {
      if (worker != null) {
        return worker.getSuspendReason();
      } else {
        return null;
      }
    }

    private void start() throws IOException, CycTimeOutException, CycApiException, CycConnectionException {
      worker = createInferenceWorker();
      worker.start();
      hasBeenStarted = true;
    }

    private void stop(final Integer patience) {
      if (patience == null) {
        worker.interruptInference();
      } else {
        worker.interruptInference(patience.intValue());
      }
    }

    private void close() {
      if (worker != null) {
        try {
          worker.releaseInferenceResources(5000);
          return;
        } catch (Exception ex) {
          System.err.println(
                  "Got exception try to free inference resources for " + this);
          ex.printStackTrace(System.err);
        }
      }
      if (rs != null) {
        rs.close();
      }
    }

    private KBInferenceResultSet getResultSet() throws CycApiException, CycTimeOutException, CycConnectionException {
      if (rs == null) {
        if (!hasBeenStarted) {
          performInference();
        }
        if (rs == null) {
          setResultSet(new KBInferenceResultSet(cycAnswers));
        }
      }
      if (rs.getCurrentRowCount() < cycAnswers.size()) {
        setResultSet(new KBInferenceResultSet(cycAnswers));
      }
      return rs;
    }

    private KBInferenceResultSet performInference() throws CycApiException, CycTimeOutException, CycConnectionException {

      if (requiresInferenceWorker()) {
        createInferenceWorker().executeQuery();
      } else {
        this.setResultSet(new KBInferenceResultSet(getCycAccess().getInferenceTool().executeQuery(getQuerySentenceCyc(),
                getContext().asELMt(), getInferenceParameters())));
        hasBeenStarted = true;
        this.inferenceStatus = DefaultInferenceStatus.SUSPENDED;
      }
      return rs;
    }
    private final Object continueInferenceLock = new Object();
    private boolean isContinuingInference = false;

    private void continueInference() throws CycApiException, CycTimeOutException, CycConnectionException {
      if (!isContinuable()) {
        throw new UnsupportedOperationException("This query is not continuable.");
      } else if (!hasBeenStarted) {
        performInference();
      } else if (worker != null) {
        try {
          isContinuingInference = true;
          worker.continueInference(params);
          synchronized (continueInferenceLock) {
            while (isContinuingInference) {
              continueInferenceLock.wait();
            }
          }
        } catch (InterruptedException ex) {

        } finally {
          isContinuingInference = false;
        }
      } else {
        throw new UnsupportedOperationException("This query cannot be continued.");
      }
    }

    private InferenceWorkerSynch createInferenceWorker() {

      final ELMt elmt = ctx.asELMt();
      worker = new DefaultInferenceWorkerSynch(querySentence, elmt, params,
              getCycAccess(),
              TIMEOUT);
      // We get to be the first listener, so we can be sure we're up to date
      // when other listeners are called.
      worker.addInferenceListener(this);
      for (final InferenceWorkerListener listener : listeners) {
        worker.addInferenceListener(listener);
      }
      return (InferenceWorkerSynch) worker;

    }

    private void setResultSet(KBInferenceResultSet rs) {
      this.rs = rs;
    }

    private void clear() {
      close();
      rs = null;
      hasBeenStarted = false;
      worker = null;
      inferenceStatus = DefaultInferenceStatus.NOT_STARTED;
      inferenceIdentifier = null;
      cycAnswers.clear();
    }
  }

  /**
   *
   * @throws IOException
   */
  private Query() throws IOException {
  }

  private boolean requiresInferenceWorker() {
    final InferenceParameters inferenceParameters = getInferenceParameters();
    if (inferenceParameters.containsKey(RETURN)) {
      return true;
    } else if (Boolean.TRUE.equals(inferenceParameters.isContinuable())) {
      return true;
    } else if (Boolean.TRUE.equals(inferenceParameters.isBrowsable())) {
      return true;
    } else if (!listeners.isEmpty()) {
      return true;
    } else if (retainInference == true) {
      return true;
    } else if (inferenceParameters.getInferenceMode() != null
            && inferenceParameters.getInferenceMode() != OpenCycInferenceMode.MINIMAL_MODE) {
      return true;
    } else if (inferenceParameters.getMaxTransformationDepth() != null
            && inferenceParameters.getMaxTransformationDepth() > 0) {
      return true;
    } else if (CycObjectFactory.t.equals(
            inferenceParameters.get(COMPUTE_ANSWER_JUSTIFICATIONS))) {
      return true;
    } else {
      return false;
    }
  }

  private static CycAccess getCurrentCycAccess() {
    return CycAccessManager.get().getCurrentAccess();
  }
}
