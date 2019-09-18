package com.cyc.base.kbtool;

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.Formula;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.CycTimeOutException;

/**
 *
 * @author nwinant
 */
public interface InspectorTool {
  
  /**
   * Returns the count of the instances of the given collection.
   *
   * @param collection the collection whose instances are counted
   * @param mt microtheory (including its genlMts) in which the count is determined
   *
   * @return the count of the instances of the given collection
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  int countAllInstances(Fort collection, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns the count of the instances of the given collection, implements a cache to avoid asking
   * the same question twice from the KB.
   *
   * @param collection the collection whose instances are counted
   * @param mt microtheory (including its genlMts) in which the count is determined
   *
   * @return the count of the instances of the given collection
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  int countAllInstances_Cached(Fort collection, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns the count of the assertions indexed according to the given pattern, using the best
   * index (from among the predicate and argument indices). The formula can contain variables.
   *
   * @param formula the formula whose indexed instances are counted
   * @param mt microtheory (including its genlMts) in which the count is determined
   *
   * @return the count of the assertions indexed according to the given pattern, using the best
   * index (from among the predicate and argument indices)
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  int countUsingBestIndex(CycList formula, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns true if the given HL formula and microtheory correspond to a valid
   * assertion in that microtheory.
   *
   * @param hlFormula the given HL formula
   * @param mt the candidate assertion microtheory
   */
  boolean isAssertionValid(CycList hlFormula, Fort mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff backchain inference on the given predicate is discouraged.
   *
   * @param predicate the <tt>CycConstantI</tt> predicate for which backchaining discouraged status
   * is sought
   * @param mt microtheory (including its genlMts) in which the backchaining discouraged status is
   * sought
   *
   * @return <tt>true</tt> iff backchain inference on the given predicate is discouraged
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isBackchainDiscouraged(CycConstantI predicate, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff backchain inference on the given predicate is encouraged.
   *
   * @param predicate the <tt>CycConstantI</tt> predicate for which backchaining encouraged status
   * is sought
   * @param mt microtheory (including its genlMts) in which the backchaining encouraged status is
   * sought
   *
   * @return <tt>true</tt> iff backchain inference on the given predicate is encouraged
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isBackchainEncouraged(CycConstantI predicate, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff backchain inference on the given predicate is forbidden.
   *
   * @param predicate the <tt>CycConstantI</tt> predicate for which backchaining forbidden status is
   * sought
   * @param mt microtheory (including its genlMts) in which the backchaining forbidden status is
   * sought
   *
   * @return <tt>true</tt> iff backchain inference on the given predicate is forbidden
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isBackchainForbidden(CycConstantI predicate, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff backchain inference on the given predicate is required.
   *
   * @param predicate the <tt>CycConstantI</tt> predicate for which backchaining required status is
   * sought
   * @param mt microtheory (including its genlMts) in which the backchaining required status is
   * sought
   *
   * @return <tt>true</tt> iff backchain inference on the given predicate is required
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isBackchainRequired(CycConstantI predicate, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns true if the cyc object is a BinaryPredicate.
   *
   * @param cycObject the given cyc object
   *
   * @return true if cycObject is a BinaryPredicate, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isBinaryPredicate(final CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the cyc object is a BinaryPredicate.
   *
   * @param cycObject the given cyc object
   * @param mt the inference microtheory
   *
   * @return true if cycObject is a BinaryPredicate, otherwise false
   *
   * @obsolete mt is not necessary.
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isBinaryPredicate(final CycObject cycObject, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given term is a Collection.
   *
   * @param cycObject the given term
   *
   * @return true if the given term is a Collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isCollection(final CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given term is a Collection.
   *
   * @param cycObject the given term
   * @param mt the inference microtheory
   *
   * @return true if the given term is a Collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isCollection(final CycObject cycObject, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given object is a Collection.
   *
   * @param obj the given term
   *
   * @return true if the given term is a Collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isCollection(final Object obj) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given term is a collection, implemented by a cache to avoid asking the same
   * question twice from the KB.
   *
   * @param cycObject the given term
   *
   * @return true if the given term is a collection
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isCollection_Cached(CycObject cycObject) throws CycConnectionException, CycApiException;

  boolean isCollection_Cached(Object term) throws CycConnectionException, CycApiException;

  /**
   * Returns true if the candidate name is an available CycConstantI name, case insensitive.
   *
   * @param candidateName the candidate name
   *
   * @return true if the candidate name uses valid CycConstantI characters
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isConstantNameAvailable(String candidateName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if formula is well-formed Non Atomic Reifable Term.
   *
   * @param formula the given EL formula
   *
   * @return true if formula is well-formed Non Atomic Reifable Term, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isCycLNonAtomicReifableTerm(CycList formula) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if formula is well-formed Non Atomic Reifable Term.
   *
   * @param formula the given EL formula
   *
   * @return true if formula is well-formed Non Atomic Reifable Term, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isCycLNonAtomicReifableTerm(CycObject formula) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if formula is well-formed Non Atomic Un-reifable Term.
   *
   * @param formula the given EL formula
   *
   * @return true if formula is well-formed Non Atomic Un-reifable Term, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isCycLNonAtomicUnreifableTerm(CycObject formula) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given term is an evaluatable predicate.
   *
   * @param predicate the given term
   *
   * @return true if true if the given term is an evaluatable predicate, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isEvaluatablePredicate(Fort predicate) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if formula is well-formed in the relevant mt.
   *
   * @param formula the given EL formula
   * @param mt the relevant mt
   *
   * @return true if formula is well-formed in the relevant mt, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isFormulaWellFormed(CycList formula, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if formula is well-formed in the relevant mt.
   *
   * @param formula the given EL formula
   * @param mt the relevant mt
   *
   * @return true if formula is well-formed in the relevant mt, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isFormulaWellFormed(Formula formula, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given is a Function.
   *
   * @param cycObj the given term
   *
   * @return true if the given is a Function
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isFunction(CycObject cycObj) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given symbol is defined as an api function.
   *
   * @param symbolName the candidate api function symbol name
   *
   * @return true if the given symbol is defined as an api function
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isFunctionBound(String symbolName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given symbol is defined as an api function.
   *
   * @param cycSymbol the candidate api function symbol
   *
   * @return rue if the given symbol is defined as an api function
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isFunctionBound(CycSymbolI cycSymbol) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given HL formula and microtheory correspond to a valid
   * assertion in that microtheory.
   *
   * @param gaf the given assertion formula
   * @param mt the candidate assertion microtheory
   */
  boolean isGafValidAssertion(CycList gaf, ELMt mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given HL formula and microtheory correspond to a valid
   * assertion in that microtheory.
   *
   * @param gaf the given assertion formula
   * @param mt the candidate assertion microtheory
   */
  boolean isGafValidAssertion(FormulaSentence gaf, ELMt mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort GENLPRED is a genl-inverse of Fort SPECPRED in MT.
   *
   * @param genlPred the predicate for genl-inverse determination
   * @param specPred the predicate for spec-inverse determination
   * @param mt the microtheory for inverse subsumption determination
   *
   * @return <tt>true</tt> if Fort GENLPRED is a genl-inverse of Fort SPECPRED in MT
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isGenlInverseOf(Fort genlPred, Fort specPred, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort GENLPRED is a genl-inverse of Fort SPECPRED in any MT.
   *
   * @param genlPred the predicate for genl-inverse determination
   * @param specPred the predicate for spec-inverse determination
   *
   * @return <tt>true</tt> if Fort GENLPRED is a genl-inverse of Fort SPECPRED in any MT
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isGenlInverseOf(Fort genlPred, Fort specPred) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort GENLMT is a genl-mt of Fort SPECPRED in mt-mt (currently
 #$UniversalVocabularyMt).
   *
   * @param genlMt the microtheory for genl-mt determination
   * @param specMt the microtheory for spec-mt determination
   *
   * @return <tt>true</tt> if Fort GENLMT is a genl-mt of Fort SPECPRED in mt-mt (currently
 #$UniversalVocabularyMt)
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isGenlMtOf(CycObject genlMt, CycObject specMt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort GENL is a genl of Fort SPEC.
   *
   * @param genl the collection for genl determination
   * @param spec the collection for spec determination
   *
   * @return <tt>true</tt> if Fort GENL is a genl of Fort SPEC
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isGenlOf(CycObject genl, CycObject spec) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort GENL is a genl of Fort SPEC in MT.
   *
   * @param genl the collection for genl determination
   * @param spec the collection for spec determination
   * @param mt the microtheory for spec determination
   *
   * @return <tt>true</tt> if Fort GENL is a genl of Fort SPEC in MT
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isGenlOf(CycObject genl, CycObject spec, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort GENL is a genl of Fort SPEC, implements a cache to avoid asking the
 same question twice from the KB.
   *
   * @param genl the collection for genl determination
   * @param spec the collection for spec determination
   *
   * @return <tt>true</tt> if Fort GENL is a genl of Fort SPEC
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isGenlOf_Cached(CycObject genl, CycObject spec) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort GENLPRED is a genl-pred of Fort SPECPRED in MT.
   *
   * @param genlPred the predicate for genl-pred determination
   * @param specPred the predicate for spec-pred determination
   * @param mt the microtheory for subsumption determination
   *
   * @return <tt>true</tt> if Fort GENLPRED is a genl-pred of Fort SPECPRED in MT
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isGenlPredOf(Fort genlPred, Fort specPred, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort GENLPRED is a genl-pred of Fort SPECPRED in any MT.
   *
   * @param genlPred the predicate for genl-pred determination
   * @param specPred the predicate for spec-pred determination
   *
   * @return <tt>true</tt> if Fort GENLPRED is a genl-pred of Fort SPECPRED in any MT
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isGenlPredOf(Fort genlPred, Fort specPred) throws CycConnectionException, CycConnectionException, CycApiException;

  /** @return true iff expression is free of all variables.
   * @throws CycConnectionException if a data communication error occurs
   */
  boolean isGround(CycObject expression) throws CycConnectionException;

  /**
   * Returns true if the given term is an Individual.
   *
   * @param cycObject the given term
   *
   * @return true if the given term is an Individual
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isIndividual(final CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given term is an Individual.
   *
   * @param cycObject the given term
   * @param mt the inference microtheory
   *
   * @return true if the given term is an Individual
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isIndividual(final CycObject cycObject, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff the predicate has the irreflexive property: (#$isa ?PRED
   * #$IrreflexsiveBinaryPredicate).
   *
   * @param predicate the <tt>CycConstantI</tt> predicate for which irreflexive status is sought
   * @param mt microtheory (including its genlMts) in which the irreflexive status is sought
   *
   * @return <tt>true</tt> iff the predicate has the irreflexive property: (#$isa ?PRED
   * #$IrreflexsiveBinaryPredicate)
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isIrreflexivePredicate(CycConstantI predicate, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns true if the given term is a microtheory.
   *
   * @param term the constant for determination as a microtheory
   *
   * @return <tt>true</tt> iff cycConstant is a microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isMicrotheory(CycObject term) throws CycConnectionException, CycConnectionException, CycApiException;
  
  /**
   * Returns true if cycObject is a Predicate.
   *
   * @param cycObject the term for determination as a predicate
   *
   * @return true if cycObject is a Predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isPredicate(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if cycObject is a Predicate.
   *
   * @param cycObject the term for determination as a predicate
   * @param mt the inference microtheory
   *
   * @return true if cycObject is a Predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isPredicate(final CycObject cycObject, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  boolean isPredicate(final Object object, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  boolean isPredicate(final Object object) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if cycConstant is a PublicConstant.
   *
   * @param cycConstant the given constant
   *
   * @return true if cycConstant is a PublicConstant
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isPublicConstant(CycConstantI cycConstant) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if term is a quotedCollection, in any microtheory
   *
   * @param cycFort the given Fort term
   *
   * @return true if term is a quotedCollection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Deprecated
  boolean isQuotedCollection(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if term is a quotedCollection is a quotedCollection.
   *
   * @param cycFort the given Fort term
   * @param mt the microtheory in which the query is made
   *
   * @return true if term is a quotedCollection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Deprecated
  boolean isQuotedCollection(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the quoted Fort TERM is a instance of Fort COLLECTION, in any microtheory.
   * Method implementation optimised for the binary api.
   *
   * @param term the term
   * @param collection the collection
   *
   * @return <tt>true</tt> if the quoted Fort TERM is a instance of Fort COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isQuotedIsa(final CycObject term, final CycObject collection) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Returns true if the quoted Fort TERM is a instance of Fort COLLECTION, in any microtheory.
   * Method implementation optimised for the binary api.
   *
   * @param term the term
   * @param collection the collection
   * @param timeoutMsecs the time in milliseconds to wait before giving up, set to
   * zero to wait forever.
   *
   * @return <tt>true</tt> if the quoted Fort TERM is a instance of Fort COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   * @throws CycTimeOutException if the calculation times out
   */
  boolean isQuotedIsa(final CycObject term, final CycObject collection, long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Returns true if the quoted Fort TERM is a instance of Fort COLLECTION,
 in the given inference microtheory.
   *
   * @param term the term
   * @param collection the collection
   * @param mt the inference microtheory
   * set to zero in order to wait forever
   *
   * @return <tt>true</tt> if the quoted Fort TERM is a instance of Fort COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isQuotedIsa(final CycObject term, final CycObject collection, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Returns true if the quoted Fort TERM is a instance of Fort COLLECTION,
 in the given inference microtheory.
   *
   * @param term the term
   * @param collection the collection
   * @param mt the inference microtheory
   * @param timeoutMsecs the time in milliseconds to wait before giving up,
   * set to zero in order to wait forever
   *
   * @return <tt>true</tt> if the quoted Fort TERM is a instance of Fort COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   * @throws CycTimeOutException if the calculation times out
   */
  boolean isQuotedIsa(final CycObject term, final CycObject collection, final CycObject mt, long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Returns true if the given is a Function.
   *
   * @param cycObj the given term
   *
   * @return true if the given is a ReifiableFunction
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isReifiableFunction(CycObject cycObj) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort SPEC is a spec of Fort GENL.
   *
   * @param spec the considered spec collection
   * @param genl the considered genl collection
   *
   * @return true if Fort SPEC is a spec of Fort GENL, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isSpecOf(CycObject spec, CycObject genl) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort SPEC is a spec of Fort GENL.
   *
   * @param spec the considered spec collection
   * @param genl the considered genl collection
   * @param mt the relevant mt
   *
   * @return true if Fort SPEC is a spec of Fort GENL, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isSpecOf(CycObject spec, CycObject genl, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given term is a UnaryPredicate.
   *
   * @param cycObject the given term
   *
   * @return true if true if the given term is a UnaryPredicate, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isUnaryPredicate(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the given term is a UnaryPredicate.
   *
   * @param cycObject the given term
   * @param mt the inference microtheory
   *
   * @return true if true if the given term is a UnaryPredicate, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isUnaryPredicate(CycObject cycObject, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if the candidate name uses valid CycConstantI characters.
   *
   * @param candidateName the candidate name
   *
   * @return true if the candidate name uses valid CycConstantI characters
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isValidConstantName(String candidateName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff <tt>CycList</tt> represents a well formed formula.
   *
   * @param cycList the candidate well-formed-formula
   *
   * @return true iff cycList represents a well formed formula
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isWellFormedFormula(CycList cycList) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff <tt>CycList</tt> represents a well formed formula.
   *
   * @param formula the candidate well-formed-formula
   *
   * @return true iff cycList represents a well formed formula
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isWellFormedFormula(Formula formula) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort TERM is a instance of Fort COLLECTION, defaulting to all
 microtheories.
   *
   * @param term the term
   * @param collectionName the name of the collection
   *
   * @return <tt>true</tt> if Fort TERM is a instance of the Fort named by COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isa(CycObject term, String collectionName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort TERM is a instance of Fort COLLECTION, defaulting to all
 microtheories.
   *
   * @param term the term
   * @param collection the collection
   *
   * @return <tt>true</tt> if Fort TERM is a instance of Fort COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isa(CycObject term, Fort collection) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort TERM is a instance of Fort COLLECTION, using the given microtheory.
   * Method implementation optimised for the binary api.
   *
   * @param term the term
   * @param collection the collection
   * @param mt the microtheory in which the ask is performed
   *
   * @return <tt>true</tt> if Fort TERM is a instance of Fort COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean isa(CycObject term, CycObject collection, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;
  
  
  
  
  
  
  
}
