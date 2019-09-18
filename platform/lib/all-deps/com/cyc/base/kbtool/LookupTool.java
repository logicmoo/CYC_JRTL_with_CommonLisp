package com.cyc.base.kbtool;

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.Nart;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSentence;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.cycobject.Guid;
import com.cyc.base.CycTimeOutException;
import java.util.List;

/**
 *
 * @author nwinant
 */
public interface LookupTool {
  /**
   * Finds a Cyc constant in the KB with the specified name
   *
   * @param constantName the name of the new constant
   *
   * @return the constant term or null if the argument name is null or if the term is not found
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycConstantI find(String constantName) throws CycConnectionException, CycConnectionException, CycApiException;

  List findConstantsForGuids(List constantGuids) throws CycConnectionException, CycConnectionException, CycApiException;

  List findConstantsForNames(List constantNames) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Finds or creates a Cyc constant in the KB with the specified name. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param constantName the name of the new constant
   *
   * @return the new constant term
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycConstantI findOrCreate(String constantName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of assertions contained in the given mt.
   *
   * @param mt the given microtheory
   *
   * @return the list of assertions contained in the given mt
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getAllAssertionsInMt(CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the dependent specs for a Fort collection. Dependent specs are
   * those direct and indirect specs of the collection such that every path connecting the spec to
   * a genl of the collection passes through the collection. In a typical taxomonmy it is
   * expected that all-dependent-specs gives the same result as all-specs.
   *
   * @param cycFort the given collection
   *
   * @return the list of all of the dependent specs for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllDependentSpecs(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the dependent specs for a Fort collection. Dependent specs are
   * those direct and indirect specs of the collection such that every path connecting the spec to
   * a genl of the collection passes through the collection. In a typical taxomonmy it is
   * expected that all-dependent-specs gives the same result as all-specs.
   *
   * @param cycFort the given collection
   * @param mt the relevant mt
   *
   * @return the list of all of the dependent specs for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllDependentSpecs(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the genlPreds for a CycConstantI predicate, using an upward closure.
   *
   * @param predicate the predicate for which all the genlPreds are obtained
   *
   * @return a list of all of the genlPreds for a CycConstantI predicate, using an upward closure
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllGenlPreds(CycConstantI predicate) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the genlPreds for a CycConstantI predicate, using an upward closure.
   *
   * @param predicate the predicate for which all the genlPreds are obtained
   * @param mt the relevant mt
   *
   * @return a list of all of the genlPreds for a CycConstantI predicate, using an upward closure
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllGenlPreds(CycConstantI predicate, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the direct and indirect genls for the given Fort collection.
   *
   * @param cycFort the collection
   *
   * @return the list of all of the direct and indirect genls for a Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllGenls(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the direct and indirect genls for a Fort collection given a
 relevant microtheory.
   *
   * @param cycObject the collection
   * @param mt the relevant mt
   *
   * @return the list of all of the direct and indirect genls for a Fort collection given a
 relevant microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllGenls(CycObject cycObject, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the direct and indirect genls for a Fort SPEC which are also specs
 of Fort GENL.
   *
   * @param spec the given collection
   * @param genl the more general collection
   *
   * @return the list of all of the direct and indirect genls for a Fort SPEC which are also
 specs of Fort GENL
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllGenlsWrt(Fort spec, Fort genl) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the direct and indirect genls for a Fort SPEC which are also specs
 of Fort GENL.
   *
   * @param spec the given collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the list of all of the direct and indirect genls for a Fort SPEC which are also
 specs of Fort GENL
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllGenlsWrt(Fort spec, Fort genl, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of all the direct and indirect instances (individuals) for a Fort collection.
   *
   * @param cycFort the collection for which all the direct and indirect instances (individuals)
   * are sought
   *
   * @return the list of all the direct and indirect instances (individuals) for the given
   * collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllInstances(CycObject cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of all the direct and indirect instances for a Fort collection in
 the given microtheory.
   *
   * @param cycFort the collection for which all the direct and indirect instances are sought
   * @param mt the relevant mt
   *
   * @return the list of all the direct and indirect instances for the
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error given collection
   */
  CycList getAllInstances(CycObject cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the collections of which the Fort is directly and indirectly an instance.
   *
   * @param cycFort the given term
   *
   * @return the list of the collections of which the Fort is directly and indirectly an
 instance
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllIsa(CycObject cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the collections of which the Fort is directly and indirectly an instance.
   *
   * @param cycFort the given term
   * @param mt the relevant mt
   *
   * @return the list of the collections of which the Fort is directly and indirectly an
 instance
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllIsa(CycObject cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of all the direct and indirect quoted instances for a Fort collection in
 the given microtheory.
   *
   * @param cycFort the collection for which all the direct and indirect quoted instances are sought
   * @param mt the relevant mt
   *
   * @return the list of all the direct and indirect quoted instances for the Fort collection in
 the given microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error given collection
   */
  CycList getAllQuotedInstances(final CycObject cycFort, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of all the direct and indirect quoted instances for a Fort collection in
 the given microtheory.
   *
   * @param cycFort the collection for which all the direct and indirect quoted instances are sought
   * @param mt the relevant mt
   *
   * @return the list of all the direct and indirect quoted instances for the Fort collection in
 the given microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error given collection
   * @throws CycTimeOutException if the calculation times out
   */
  CycList getAllQuotedInstances(final CycObject cycFort, final CycObject mt, final long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Gets the list of all of the direct and indirect specs-inverses for the given predicate in all
   * microtheories.
   *
   * @param cycFort the predicate
   *
   * @return the list of all of the direct and indirect spec-inverses for the given predicate in
   * all microtheories.
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllSpecInverses(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the direct and indirect specs-inverses for the given predicate in the
   * given microtheory.
   *
   * @param cycFort the predicate
   * @param mt the microtheory
   *
   * @return the list of all of the direct and indirect spec-inverses for the given predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllSpecInverses(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the direct and indirect specs-mts for the given microtheory in mt-mt
   * (currently #$UniversalVocabularyMt).
   *
   * @param mt the microtheory
   *
   * @return the list of all of the direct and indirect specs-mts for the given microtheory in
   * mt-mt (currently #$UniversalVocabularyMt)
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllSpecMts(CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the direct and indirect specs-preds for the given predicate in all
   * microtheories.
   *
   * @param cycFort the predicate
   *
   * @return the list of all of the direct and indirect spec-preds for the given predicate in all
   * microtheories.
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllSpecPreds(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the direct and indirect specs-preds for the given predicate in the
   * given microtheory.
   *
   * @param cycFort the predicate
   * @param mt the microtheory
   *
   * @return the list of all of the direct and indirect spec-preds for the given predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllSpecPreds(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of all of the direct and indirect specs for a Fort collection.
   *
   * @param cycFort the collection
   *
   * @return the list of all of the direct and indirect specs for the given collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllSpecs(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of all of the direct and indirect specs for the given collection in the given
   * microtheory.
   *
   * @param cycFort the collection
   * @param mt the microtheory
   *
   * @return the list of all of the direct and indirect specs for the given collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getAllSpecs(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of all KB assertions for an indexed term.
   *
   * @param cycFort the given indexed term
   *
   * @return the list of all CycAssertions for the term
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  List<CycAssertion> getAllTermAssertions(Fort cycFort) throws CycConnectionException, CycApiException, CycConnectionException;

  /**
   * Returns the list of applicable binary predicates which are elements of any of the given list
   * of KBSubsetCollections.
   *
   * @param kbSubsetCollections the list of KBSubsetCollections
   *
   * @return the list of applicable binary predicates which are elements of any of the given list
   * of KBSubsetCollections
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getApplicableBinaryPredicates(CycList kbSubsetCollections) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the first arg1 term from gafs having the specified predicate and arg2 values.
   *
   * @param predicate the given predicate
   * @param arg2 the given arg2 term
   * @param mt the inference microtheory
   *
   * @return the first arg1 term from gafs having the specified predicate and arg2 values
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  Object getArg1(String predicate, String arg2, String mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the first arg1 term from gafs having the specified predicate and arg2 values.
   *
   * @param predicate the given predicate
   * @param arg2 the given arg2 term
   * @param mt the inference microtheory
   *
   * @return the first arg1 term from gafs having the specified predicate and arg2 values
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  Object getArg1(Fort predicate, DenotationalTerm arg2, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the arg1Formats for a CycConstantI predicate.
   *
   * @param cycObject the given predicate term
   *
   * @return a list of the arg1Formats for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg1Formats(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the arg1Formats for a CycConstantI predicate.
   *
   * @param cycObject the given predicate term
   * @param mt the relevant mt
   *
   * @return a list of the arg1Formats for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg1Formats(CycObject cycObject, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the arg1Isas for a CycConstantI predicate.
   *
   * @param cycObject the predicate for which argument 1 contraints are sought.
   *
   * @return the list of the arg1Isas for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg1Isas(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the arg1Isas for a CycConstantI predicate given an mt.
   *
   * @param predicate the predicate for which argument 1 contraints are sought.
   * @param mt the relevant microtheory
   *
   * @return the list of the arg1Isas for a CycConstantI predicate given an mt
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg1Isas(final CycObject predicate, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of arg1 terms from gafs having the specified predicate and arg2 values.
   *
   * @param predicate the given predicate
   * @param arg2 the given arg2 term
   * @param mt the inference microtheory
   *
   * @return the list of arg1 terms from gafs having the specified predicate and arg2 values
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getArg1s(String predicate, String arg2, String mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of arg1 terms from gafs having the specified predicate and arg2 values.
   *
   * @param predicate the given predicate
   * @param arg2 the given arg2 term
   * @param mt the inference microtheory
   *
   * @return the list of arg1 terms from gafs having the specified predicate and arg2 values
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getArg1s(Fort predicate, DenotationalTerm arg2, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the single (first) arg2 value of a binary gaf, given the predicate and arg0, looking
   * in all microtheories. Return null if none found.
   *
   * @param predicate the given predicate for the gaf pattern
   * @param arg1 the given first argument of the gaf
   *
   * @return the single (first) arg2 value of the binary gaf(s)
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  Object getArg2(Fort predicate, Object arg1) throws CycConnectionException, CycApiException;

  /**
   * Returns the first arg2 term from binary gafs having the specified predicate and arg1 values.
   *
   * @param predicate the given predicate
   * @param arg1 the given arg1 term
   * @param mt the inference microtheory
   *
   * @return the first arg2 term from gafs having the specified predicate and arg1 values or null
   * if none
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  Object getArg2(String predicate, String arg1, String mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the first arg2 term from binary gafs having the specified predicate and arg1 values.
   *
   * @param predicate the given predicate
   * @param arg1 the given arg1 term
   * @param mt the inference microtheory
   *
   * @return the first arg2 term from gafs having the specified predicate and arg1 values or null
   * if none
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  Object getArg2(String predicate, Fort arg1, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the first arg2 term from binary gafs having the specified predicate and arg1 values.
   *
   * @param predicate the given predicate
   * @param arg1 the given arg1 term
   * @param mt the inference microtheory
   *
   * @return the first arg2 term from gafs having the specified predicate and arg1 values or null
   * if none
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  Object getArg2(Fort predicate, Fort arg1, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the arg2Formats for a CycConstantI predicate.
   *
   * @param cycObject the given predicate term
   *
   * @return a list of the arg2Formats for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg2Formats(final CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the arg2Formats for a CycConstantI predicate.
   *
   * @param cycObject the given predicate term
   * @param mt the relevant mt
   *
   * @return a list of the arg2Formats for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg2Formats(final CycObject cycObject, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the arg2Isas for a CycConstantI predicate.
   *
   * @param cycObject the predicate for which argument 2 contraints are sought.
   *
   * @return the list of the arg2Isas for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg2Isas(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the arg2Isas for a CycConstantI predicate given an mt.
   *
   * @param cycObject the predicate for which argument 2 contraints are sought.
   * @param mt the relevant microtheory
   *
   * @return the list of the arg2Isas for a CycConstantI predicate given an mt
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg2Isas(CycObject cycObject, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of arg2 values of binary gafs, given the predicate and arg1, looking in all
   * microtheories.
   *
   * @param predicate the given predicate for the gaf pattern
   * @param arg1 the given first argument of the gaf
   *
   * @return the list of arg2 values of the binary gafs
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg2s(Fort predicate, Object arg1) throws CycConnectionException, CycApiException;

  /**
   * Returns the list of arg2 terms from binary gafs having the specified predicate and arg1
   * values.
   *
   * @param predicate the given predicate
   * @param arg1 the given arg1 term
   * @param mt the inference microtheory
   *
   * @return the list of arg2 terms from gafs having the specified predicate and arg1 values
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getArg2s(String predicate, String arg1, String mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of arg2 terms from binary gafs having the specified predicate and arg1
   * values.
   *
   * @param predicate the given predicate
   * @param arg1 the given arg1 term
   * @param mt the inference microtheory
   *
   * @return the list of arg2 terms from gafs having the specified predicate and arg1 values
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getArg2s(String predicate, Fort arg1, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of arg2 terms from binary gafs having the specified predicate and arg1
   * values.
   *
   * @param predicate the given predicate
   * @param arg1 the given arg1 term
   * @param mt the inference microtheory
   *
   * @return the list of arg2 terms from gafs having the specified predicate and arg1 values
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getArg2s(Fort predicate, Fort arg1, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the arg3Isas for a CycConstantI predicate.
   *
   * @param predicate the predicate for which argument 3 contraints are sought.
   *
   * @return the list of the arg1Isas for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg3Isas(Fort predicate) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the arg3Isas for a CycConstantI predicate given an mt.
   *
   * @param predicate the predicate for which argument 3 contraints are sought.
   * @param mt the relevant microtheory
   *
   * @return the list of the arg1Isas for a CycConstantI predicate given an mt
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg3Isas(Fort predicate, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the arg4Isas for a CycConstantI predicate.
   *
   * @param predicate the predicate for which argument 4 contraints are sought.
   *
   * @return the list of the arg4Isas for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg4Isas(Fort predicate) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the arg4Isas for a CycConstantI predicate given an mt.
   *
   * @param predicate the predicate for which argument 4 contraints are sought.
   * @param mt the relevant microtheory
   *
   * @return the list of the arg4Isas for a CycConstantI predicate given an mt
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArg4Isas(Fort predicate, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the argNGenls for a CycConstantI predicate.
   *
   * @param predicate the given predicate term
   * @param argPosition the argument position for which the genls argument constraints are sought
   * (position 1 = first argument)
   *
   * @return the list of the argNGenls for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArgNGenls(Fort predicate, int argPosition) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the argNGenls for a CycConstantI predicate.
   *
   * @param predicate the given predicate term
   * @param argPosition the argument position for which the genls argument constraints are sought
   * (position 1 = first argument)
   * @param mt the relevant mt
   *
   * @return the list of the argNGenls for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArgNGenls(Fort predicate, int argPosition, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the argNIsas for a CycConstantI predicate.
   *
   * @param predicate the predicate for which argument N contraints are sought.
   * @param argPosition the argument position of argument N
   *
   * @return the list of the argNIsas for a CycConstantI predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArgNIsas(Fort predicate, int argPosition) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the argNIsas for a CycConstantI predicate given an mt.
   *
   * @param predicate the predicate for which argument contraints are sought.
   * @param argPosition the argument position of argument N
   * @param mt the relevant microtheory
   *
   * @return the list of the arg1Isas for a CycConstantI predicate given an mt
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getArgNIsas(Fort predicate, int argPosition, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the arity of the given predicate.
   *
   * @param predicate the given predicate whose number of arguments is sought
   *
   * @return the arity of the given predicate, or zero if the argument is not a predicate
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  int getArity(Fort predicate) throws CycConnectionException, CycApiException;

  /**
   * Returns the first arg2 ground or non-term from assertions having the specified predicate and
   * arg1 values.
   *
   * @param predicate the given predicate
   * @param arg1 the given arg1 term
   * @param mt the inference microtheory
   *
   * @return the first arg2 ground or non-term from assertions having the specified predicate and
   * arg1 values
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  Object getAssertionArg2(String predicate, String arg1, String mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the first arg2 ground or non-term from assertions having the specified predicate and
   * arg1 values.
   *
   * @param predicate the given predicate
   * @param arg1 the given arg1 term
   * @param mt the inference microtheory
   *
   * @return the first arg2 ground or non-term from assertions having the specified predicate and
   * arg1 values
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  Object getAssertionArg2(Fort predicate, Fort arg1, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a <tt>CycAssertion</tt> by using its ID.
   *
   * @param id the id of the <tt>CycAssertion</tt> sought
   *
   * @return the <tt>CycAssertion</tt> if found or <tt>null</tt> if not found
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycAssertion getAssertionById(Integer id) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the assertion date for the given assertion, or zero if the date is not available.
   *
   * @return the assertion date for the given assertion
   */
  Long getAssertionDate(CycAssertion cycAssertion) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the backchaining implication rules which might apply to the given rule.
   *
   * @param predicate the predicate for which backward chaining implication rules are sought
   * @param formula the literal for which backward chaining implication rules are sought
   * @param mt the microtheory (and its genlMts) in which the search for backchaining implication
   * rules takes place
   *
   * @return a list of the backchaining implication rules which might apply to the given predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getBackchainImplicationRules(CycConstantI predicate, CycList formula, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the backchaining implication rules which might apply to the given predicate.
   *
   * @param predicate the predicate for which backchaining rules are sought
   * @param mt the microtheory (and its genlMts) in which the search for backchaining rules takes
   * place
   *
   * @return a list of the backchaining implication rules which might apply to the given predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getBackchainRules(CycConstantI predicate, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the coExtensionals for a Fort. Limited to 120 seconds.
   *
   * @param cycObject the given collection term
   *
   * @return a list of the coExtensionals for a Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getCoExtensionals(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the coExtensionals for a Fort. Limited to 120 seconds.
   *
   * @param cycObject the given collection term
   * @param timeoutMsecs the time to wait before giving up
   *
   * @return a list of the coExtensionals for a Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   * @throws CycTimeOutException if the calculation times out
   */
  CycList getCoExtensionals(CycObject cycObject, long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Gets a list of the coExtensionals for a Fort. Limited to 120 seconds.
   *
   * @param cycObject the given collection term
   * @param mt the microtheory
   *
   * @return a list of the coExtensionals for a Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getCoExtensionals(CycObject cycObject, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException, CycTimeOutException;

  /**
   * Gets a list of the coExtensionals for a Fort.
   *
   * @param cycObject the given collection term
   * @param mt the relevant mt for inference
   *
   * @return a list of the coExtensionals for a Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getCoExtensionals(CycObject cycObject, CycObject mt, long timeoutMsecs) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the collection leaves (most specific of the all-specs) for a Fort
 collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the collection leaves (most specific of the all-specs) for a Fort
 collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getCollectionLeaves(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the collection leaves (most specific of the all-specs) for a Fort
 collection.
   *
   * @param cycFort the given collection
   * @param mt the relevant mt
   *
   * @return the list of the collection leaves (most specific of the all-specs) for a Fort
 collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getCollectionLeaves(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the comment for a Fort. Embedded quotes are replaced by spaces.
   *
   * @param cycObject the term for which the comment is sought
   *
   * @return the comment for the given Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  String getComment(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the comment for a Fort in the relevant mt. Embedded quotes are replaced by spaces.
   *
   * @param cycObject the term for which the comment is sought
   * @param mt the relevant mt from which the comment is visible
   *
   * @return the comment for the given Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  String getComment(final CycObject cycObject, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a CycConstantI by using its GUID.
   *
   * @param guid the GUID from which to find the constant
   *
   * @return the complete <tt>CycConstantI</tt> if found, otherwise return <tt>null</tt>
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycConstantI getConstantByGuid(Guid guid) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a CycConstantI by using its constant name.
   *
   * @param constantName the name of the constant to be instantiated
   *
   * @return the complete <tt>CycConstantI</tt> if found, otherwise return null
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycConstantI getConstantByName(final String constantName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the Guid for the given constant name, raising an exception if the constant does not
   * exist.
   *
   * @param constantName the name of the constant object for which the Guid is sought
   *
   * @return the Guid for the given CycConstantI
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  Guid getConstantGuid(String constantName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the name for the given constant guid.
   *
   * @param guid the guid of the constant object for which the name is sought
   *
   * @return the name for the given CycConstantI
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  String getConstantName(Guid guid) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the Nart object from a Cons object that lists the names of its functor and its
 arguments.
   *
   * @param elCons the given list which names the functor and arguments
   *
   * @return a Nart object from a Cons object that lists the names of its functor and its
 arguments
   */
  Nart getCycNartFromCons(CycList elCons) throws CycConnectionException, CycConnectionException;

  /**
   * Returns the list of Cyc terms whose denotation matches the given English string.
   *
   * @param denotationString the given English denotation string
   *
   * @return the list of Cyc terms whose denotation matches the given English string
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getDenotsOfString(String denotationString) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of Cyc terms whose denotation matches the given English string and which are
   * instances of any of the given collections.
   *
   * @param denotationString the given English denotation string
   * @param collections the given list of collections
   *
   * @return the list of Cyc terms whose denotation matches the given English string
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getDenotsOfString(String denotationString, CycList collections) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the disjointWiths for a Fort.
   *
   * @param cycObject the given collection term
   *
   * @return a list of the disjointWiths for a Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getDisjointWiths(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the disjointWiths for a Fort.
   *
   * @param cycFort the given collection term
   * @param mt the relevant mt
   *
   * @return a list of the disjointWiths for a Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getDisjointWiths(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /** Returns the external ID for the given Cyc object.
   *
   * @deprecated Should be replaced in favor of {@link DefaultCycObject#toCompactExternalId(Object, CycAccess)}
   * @param cycObject the Cyc object
   * @return the external ID string
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Deprecated
  String getExternalIDString(final CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the forward chaining implication rules which might apply to the given rule.
   *
   * @param predicate the predicate for which forward chaining implication rules are sought
   * @param formula the literal for which forward chaining implication rules are sought
   * @param mt the microtheory (and its genlMts) in which the search for forward chaining rules
   * takes place
   *
   * @return a list of the forward chaining implication rules which might apply to the given
   * predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getForwardChainRules(CycConstantI predicate, CycList formula, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the forward chaining implication rules which might apply to the given
   * predicate.
   *
   * @param predicate the predicate for which forward chaining rules are sought
   * @param mt the microtheory (and its genlMts) in which the search for forward chaining rules
   * takes place
   *
   * @return a list of the forward chaining implication rules which might apply to the given
   * predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getForwardChainRules(CycConstantI predicate, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of gafs in which the predicate is the given predicate and in which the given
   * term appears in the first argument position.
   *
   * @param cycFort the given term
   * @param predicate the given predicate
   * @param mt the relevant inference microtheory
   *
   * @return the list of gafs in which the predicate is a element of the given list of predicates
   * and in which the given term appears in the first argument position
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getGafs(final CycObject cycFort, final CycObject predicate, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of gafs in which the predicate is the given predicate and in which the given
   * term appears in the first argument position.
   *
   * @param cycObject the given term
   * @param predicate the given predicate
   *
   * @return the list of gafs in which the predicate is a element of the given list of predicates
   * and in which the given term appears in the first argument position
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getGafs(final CycObject cycObject, final CycObject predicate) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of gafs in which the predicate is the given predicate and in which the given
   * NAUT appears in the first argument position.
   *
   * @param naut the given NAUT
   * @param predicate the given predicate
   *
   * @return the list of gafs in which the predicate is a element of the given list of predicates
   * and in which the given term appears in the first argument position
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getGafsForNaut(final CycList naut, final CycObject predicate) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of gafs in which the predicate is a element of the given list of predicates
   * and in which the given term appears in the first argument position.
   *
   * @param cycObject the given term
   * @param predicates the given list of predicates
   * @param mt the relevant inference microtheory
   *
   * @return the list of gafs in which the predicate is a element of the given list of predicates
   * and in which the given term appears in the first argument position
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getGafsForPredicates(final CycObject cycObject, final List predicates, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of gafs in which the predicate is a element of the given list of predicates
   * and in which the given term appears in the first argument position.
   *
   * @param cycObject the given term
   * @param predicates the given list of predicates
   *
   * @return the list of gafs in which the predicate is a element of the given list of predicates
   * and in which the given term appears in the first argument position
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getGafsForPredicates(final CycObject cycObject, final List predicates) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the genlPreds for a CycConstantI predicate.
   *
   * @param predicate the given predicate term
   *
   * @return the list of the more general predicates for the given predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getGenlPreds(final CycObject predicate) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the genlPreds for a CycConstantI predicate.
   *
   * @param predicate the given predicate term
   * @param mt the relevant mt
   *
   * @return the list of the more general predicates for the given predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getGenlPreds(final CycObject predicate, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the direct genls of the direct specs for the given Fort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the direct genls of the direct specs for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getGenlSiblings(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the direct genls of the direct specs for the given Fort collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the direct genls of the direct specs for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getGenlSiblings(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the directly asserted true genls for the given Fort collection.
   *
   * @param cycObject the given term
   *
   * @return the list of the directly asserted true genls for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getGenls(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the directly asserted true genls for the given Fort collection.
   *
   * @param cycObject the given term
   * @param mt the relevant mt
   *
   * @return the list of the directly asserted true genls for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getGenls(final CycObject cycObject, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the instance siblings of a Fort, for all collections of which it is an
 instance.
   *
   * @param cycFort the given term
   *
   * @return the list of the instance siblings of a Fort, for all collections of which it is an
 instance
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getInstanceSiblings(CycObject cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the instance siblings of a Fort, for all collections of which it is an
 instance.
   *
   * @param cycFort the given term
   * @param mt the relevant mt
   *
   * @return the list of the instance siblings of a Fort, for all collections of which it is an
 instance
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if an error is returned by the Cyc server
   */
  CycList getInstanceSiblings(CycObject cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the asserted instances of a Fort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the instances (who are individuals) of a Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getInstances(CycObject cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the asserted instances of a Fort collection.
   *
   * @param cycFort the given collection
   * @param mt the relevant mt
   *
   * @return the list of the instances (who are individuals) of a Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getInstances(CycObject cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the interArgIsa1-2 isa constraints for arg2, given the predicate and arg1.
   *
   * @param predicate the predicate for interArgIsa1-2 contraints are sought.
   * @param arg1 the argument in position 1
   *
   * @return the list of the interArgIsa1-2 isa constraints for arg2, given the predicate and arg1
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getInterArgIsa1_2_forArg2(Fort predicate, Fort arg1) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the interArgIsa1-2 isa constraints for arg2, given the predicate and arg1.
   *
   * @param predicate the predicate for interArgIsa1-2 contraints are sought.
   * @param arg1 the argument in position 1
   * @param mt the relevant inference microtheory
   *
   * @return the list of the interArgIsa1-2 isa constraints for arg2, given the predicate and arg1
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getInterArgIsa1_2_forArg2(Fort predicate, Fort arg1, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the interArgIsa1-2 isa constraint pairs for the given predicate. Each item
   * of the returned list is a pair (arg1-isa arg2-isa) which means that when (#$isa arg1
   * arg1-isa) holds, (#$isa arg2 arg2-isa) must also hold for (predicate arg1 arg2 ..) to be well
   * formed.
   *
   * @param predicate the predicate for interArgIsa1-2 contraints are sought.
   *
   * @return the list of the interArgIsa1-2 isa constraint pairs for the given predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getInterArgIsa1_2s(Fort predicate) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the interArgIsa1-2 isa constraint pairs for the given predicate. Each item
   * of the returned list is a pair (arg1-isa arg2-isa) which means that when (#$isa arg1
   * arg1-isa) holds, (#$isa arg2 arg2-isa) must also hold for (predicate arg1 arg2 ..) to be well
   * formed.
   *
   * @param predicate the predicate for interArgIsa1-2 contraints are sought.
   * @param mt the relevant inference microtheory
   *
   * @return the list of the interArgIsa1-2 isa constraint pairs for the given predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getInterArgIsa1_2s(Fort predicate, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the isas for the given Fort.
   *
   * @param cycObject the term for which its isas are sought
   *
   * @return the list of the isas for the given Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getIsas(CycObject cycObject) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the isas for the given Fort.
   *
   * @param cycObject the term for which its isas are sought
   * @param mt the relevant mt
   *
   * @return the list of the isas for the given Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getIsas(final CycObject cycObject, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the elements of the given CycKBSubsetCollection.
   *
   * @param cycKbSubsetCollection the given CycKBSubsetCollection
   *
   * @return a list of the elements of the given CycKBSubsetCollection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getKbSubset(Fort cycKbSubsetCollection) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a known CycConstantI by using its GUID string.
   *
   * @param guidString the globally unique ID string of the constant to be instantiated
   *
   * @return the complete <tt>CycConstantI</tt> if found, otherwise throw an exception
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycConstantI getKnownConstantByGuid(String guidString) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a known CycConstantI by using its GUID.
   *
   * @param guid the globally unique ID of the constant to be instantiated
   *
   * @return the complete <tt>CycConstantI</tt> if found, otherwise throw an exception
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycConstantI getKnownConstantByGuid(Guid guid) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a known CycConstantI by using its constant name.
   *
   * @param constantName the name of the constant to be instantiated
   *
   * @return the complete <tt>CycConstantI</tt> if found, otherwise throw an exception
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycConstantI getKnownConstantByName(String constantName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a known Fort by using its constant name or NART string.
   *
   * @param fortName the name of the FORT to be instantiated
   * @return the complete <tt>Fort</tt> if found, otherwise throw an exception
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  Fort getKnownFortByName(String fortName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the collections asserted to be disjoint with a Fort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the collections asserted to be disjoint with a Fort collection
   *
   * @throws CycConnectionException if a communication error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getLocalDisjointWith(CycObject cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the collections asserted to be disjoint with a Fort collection.
   *
   * @param cycFort the given collection
   * @param mt the relevant mt
   *
   * @return the list of the collections asserted to be disjoint with a Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getLocalDisjointWith(CycObject cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of Cyc terms whose denotation matches the given English multi-word string.
   *
   * @deprecated use getDenotsOfString instead
   *
   * @param multiWordDenotationString the given English denotation multi-word string
   *
   * @return the list of Cyc terms whose denotation matches the given English multi-word string
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Deprecated
  CycList getMWSDenotsOfString(CycList multiWordDenotationString) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of Cyc terms whose denotation matches the given English multi-word string and
   * which are instances of any of the given collections.
   *
   * @deprecated use getDenotsOfString instead
   *
   * @param multiWordDenotationString the given English denotation string
   * @param collections the given list of collections
   *
   * @return the list of Cyc terms whose denotation matches the given English multi-word string
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Deprecated
  CycList getMWSDenotsOfString(CycList multiWordDenotationString, CycList collections) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the most general collections from the given list of collectons.
   *
   * @param collections the given collections
   *
   * @return the most general collections from the given list of collectons
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMaxCols(final CycList collections) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the most general collections from the given list of collectons.
   *
   * @param collections the given collections
   * @param mt the inference microtheory
   *
   * @return the most general collections from the given list of collectons
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMaxCols(final CycList collections, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the least specific specs for the given Fort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the least specific specs for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMaxSpecs(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the least specific specs for the given Fort collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the least specific specs for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMaxSpecs(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the single most specific collection from the given list of collectons.
   *
   * @param collections the given collections
   *
   * @return the single most specific collection from the given list of collectons
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  Fort getMinCol(final CycList collections) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the single most specific collection from the given list of collectons.
   *
   * @param collections the given collections
   * @param mt the relevant mt
   *
   * @return the single most specific collection from the given list of collectons
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  Fort getMinCol(final CycList collections, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the most specific collections from the given list of collectons.
   *
   * @param collections the given collections
   *
   * @return the most specific collections from the given list of collectons
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMinCols(final CycList collections) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the most specific collections from the given list of collectons.
   *
   * @param collections the given collections
   * @param mt the inference microtheory
   *
   * @return the most specific collections from the given list of collectons
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMinCols(final CycList collections, final CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the minimum (most specific) genls for a Fort collection.
   *
   * @param cycFort the given collection term
   *
   * @return a list of the minimum (most specific) genls for a Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMinGenls(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the minimum (most specific) genls for a Fort collection.
   *
   * @param cycFort the collection
   * @param mt the microtheory in which to look
   *
   * @return a list of the minimum (most specific) genls for a Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMinGenls(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the most specific collections (having no subsets) which contain a Fort
 term.
   *
   * @param cycFort the given term
   *
   * @return the list of the most specific collections (having no subsets) which contain a Fort
 term
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMinIsas(CycObject cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the most specific collections (having no subsets) which contain a Fort
 term.
   *
   * @param cycFort the given term
   * @param mt the relevant mt
   *
   * @return the list of the most specific collections (having no subsets) which contain a Fort
 term
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getMinIsas(CycObject cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of name strings for the given Fort.
   *
   * @param cycFort the given FORT
   * @param mt the relevant inference microtheory
   *
   * @return the list of name strings for the given Fort
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getNameStrings(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns the list of tuples gathered from assertions in given microtheory in which the
   * predicate is the given predicate, in which the given term appears in the indexArg position
   * and in which the list of gatherArgs determines the assertion arguments returned as each
   * tuple.
   *
   * @param term the term in the index argument position
   * @param predicate the given predicate
   * @param indexArg the argument position in which the given term appears
   * @param gatherArgs the list of argument Integer positions which indicate the assertion
   * arguments to be returned as each tuple
   * @param mt the relevant inference microtheory
   *
   * @return the list of tuples gathered from assertions in given microtheory in which the
   * predicate is the given predicate, in which the given term appears in the indexArg
   * position and in which the list of gatherArgs determines the assertion arguments
   * returned as each tuple
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getPredicateValueTuplesInMt(Fort term, Fort predicate, int indexArg, CycList gatherArgs, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a list of the public Cyc constants.
   *
   * @return a list of the public Cyc constants
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getPublicConstants() throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns a random assertion.
   *
   * @return a random assertion
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycAssertion getRandomAssertion() throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns a random constant.
   *
   * @return a random constant
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycConstantI getRandomConstant() throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns a random nart (Non-Atomic Reified Term).
   *
   * @return a random nart (Non-Atomic Reified Term)
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  Nart getRandomNart() throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the resultIsa for a CycConstantI function.
   *
   * @param function the given function term
   *
   * @return the list of the resultIsa for a CycConstantI function
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getResultIsas(Fort function) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the resultIsa for a CycConstantI function.
   *
   * @param function the given function term
   * @param mt the relevant mt
   *
   * @return the list of the resultIsa for a CycConstantI function
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getResultIsas(Fort function, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list with the specified number of sample specs of the given Fort collection.
   * Attempts to return leaves that are maximally differet with regard to their all-genls.
   *
   * @param cycFort the given collection
   * @param numberOfSamples the maximum number of sample specs returned
   *
   * @return the list with the specified number of sample specs of the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getSampleLeafSpecs(Fort cycFort, int numberOfSamples) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list with the specified number of sample specs of the given Fort collection.
   * Attempts to return leaves that are maximally differet with regard to their all-genls.
   *
   * @param cycFort the given collection
   * @param numberOfSamples the maximum number of sample specs returned
   * @param mt the relevant mt
   *
   * @return the list with the specified number of sample specs of the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getSampleLeafSpecs(Fort cycFort, int numberOfSamples, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the siblings (direct specs of the direct genls) for the given Fort
 collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the siblings (direct specs of the direct genls) for the given Fort
 collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getSiblings(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the siblings (direct specs of the direct genls) for the given Fort
 collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the siblings (direct specs of the direct genls) for the given Fort
 collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getSiblings(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  CycSentence getSimplifiedSentence(FormulaSentence sentence) throws CycConnectionException, CycConnectionException;

  CycSentence getSimplifiedSentence(FormulaSentence sentence, ELMt mt) throws CycConnectionException, CycConnectionException;

  /**
   * Gets the list of the siblings (direct specs of the direct genls) for the given Fort
 collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the siblings (direct specs of the direct genls) for the given Fort
 collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getSpecSiblings(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the siblings (direct specs of the direct genls) for the given Fort
 collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the siblings (direct specs of the direct genls) for the given Fort
 collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getSpecSiblings(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the directly asserted true specs for the given Fort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the directly asserted true specs for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getSpecs(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the directly asserted true specs for the given Fort collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the directly asserted true specs for the given Fort collection
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getSpecs(Fort cycFort, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;
  
  /**
   * Gets the list of mappings from the specified information source given the inference
   * microtheory. Each returned list item is the pair consisting of external concept string and
   * synonymous Cyc term.
   *
   * @param informationSource the external indexed information source
   * @param mt the assertion microtheory
   *
   * @return list of mappings from the specified information source given the inference
   * microtheory
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getSynonymousExternalConcepts(String informationSource, String mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of mappings from the specified information source given the inference
   * microtheory. Each returned list item is the pair consisting of external concept string and
   * synonymous Cyc term.
   *
   * @param informationSource the external indexed information source
   * @param mt the assertion microtheory
   *
   * @return the list of mappings from the specified information source given the inference
   * microtheory
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  CycList getSynonymousExternalConcepts(Fort informationSource, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets a DenotationalTerm (i.e. CycConstantI, Nart, or CycNaut) by using its constant name
 or formula string.  This method will not create any terms.  However, if a NAT formula is sent
 in, and its functor is reifiable, this method will return a Nart object, regardless of whether
 or not that term has actually been reified in the Cyc KB.
   *
   * @param termName the name of the term to be instantiated
   * @return the complete <tt>DenotationalTerm</tt> if found, otherwise throw an exception
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  DenotationalTerm getTermByName(String termName) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the justifications of why Fort COLLECTION1 and a Fort COLLECTION2
 intersect. see getWhyGenl
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   *
   * @return the list of the justifications of why Fort COLLECTION1 and a Fort COLLECTION2
 intersect
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getWhyCollectionsIntersect(Fort collection1, Fort collection2) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the justifications of why Fort COLLECTION1 and a Fort COLLECTION2
 intersect. see getWhyGenl
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   * @param mt the relevant mt
   *
   * @return the list of the justifications of why Fort COLLECTION1 and a Fort COLLECTION2
 intersect
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getWhyCollectionsIntersect(Fort collection1, Fort collection2, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the English parapharse of the justifications of why Fort COLLECTION1 and a Fort
 COLLECTION2 intersect. see getWhyGenlParaphrase
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   *
   * @return the English parapharse of the justifications of why Fort COLLECTION1 and a Fort
 COLLECTION2 intersect
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  List getWhyCollectionsIntersectParaphrase(Fort collection1, Fort collection2) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the English parapharse of the justifications of why Fort COLLECTION1 and a Fort
 COLLECTION2 intersect. see getWhyGenlParaphrase
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   * @param mt the relevant mt
   *
   * @return the English parapharse of the justifications of why Fort COLLECTION1 and a Fort
 COLLECTION2 intersect
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  List getWhyCollectionsIntersectParaphrase(Fort collection1, Fort collection2, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the justifications of why Fort SPEC is a SPEC of Fort GENL.
   * getWhyGenl("Dog", "Animal") --> "(((#$genls #$Dog #$CanineAnimal) :TRUE) (#$genls
   * #$CanineAnimal #$NonPersonAnimal) :TRUE) (#$genls #$NonPersonAnimal #$Animal) :TRUE))
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   *
   * @return the list of the justifications of why Fort SPEC is a SPEC of Fort GENL
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getWhyGenl(Fort spec, Fort genl) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the justifications of why Fort SPEC is a SPEC of Fort GENL.
   * getWhyGenl("Dog", "Animal") --> "(((#$genls #$Dog #$CanineAnimal) :TRUE) (#$genls
   * #$CanineAnimal #$NonPersonAnimal) :TRUE) (#$genls #$NonPersonAnimal #$Animal) :TRUE))
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the list of the justifications of why Fort SPEC is a SPEC of Fort GENL
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getWhyGenl(Fort spec, Fort genl, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the English parapharse of the justifications of why Fort SPEC is a SPEC of Fort
 GENL. getWhyGenlParaphrase("Dog", "Animal") --> "a dog is a kind of canine" "a canine is a
   * kind of non-human animal" "a non-human animal is a kind of animal"
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   *
   * @return the English parapharse of the justifications of why Fort SPEC is a SPEC of Fort
 GENL
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  List getWhyGenlParaphrase(Fort spec, Fort genl) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the English parapharse of the justifications of why Fort SPEC is a SPEC of Fort
 GENL. getWhyGenlParaphrase("Dog", "Animal") --> "a dog is a kind of canine" "a canine is a
   * kind of non-human animal" "a non-human animal is a kind of animal"
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the English parapharse of the justifications of why Fort SPEC is a SPEC of Fort
 GENL
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  List getWhyGenlParaphrase(Fort spec, Fort genl, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the justifications of why Fort TERM is an instance of Fort COLLECTION.
   * getWhyIsa("Brazil", "Country") --> "(((#$isa #$Brazil #$IndependentCountry) :TRUE) (#$genls
   * #$IndependentCountry #$Country) :TRUE))
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   *
   * @return the list of the justifications of why Fort TERM is an instance of Fort
 COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getWhyIsa(CycObject spec, CycObject genl) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the list of the justifications of why Fort TERM is an instance of Fort COLLECTION.
   * getWhyIsa("Brazil", "Country") --> "(((#$isa #$Brazil #$IndependentCountry) :TRUE) (#$genls
   * #$IndependentCountry #$Country) :TRUE))
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the list of the justifications of why Fort TERM is an instance of Fort
 COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList getWhyIsa(CycObject spec, CycObject genl, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Gets the English parapharse of the justifications of why Fort TERM is an instance of
 Fort COLLECTION. getWhyGenlParaphase("Brazil", "Country") --> "Brazil is an independent
   * country" "an independent country is a kind of country"
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   *
   * @return the English parapharse of the justifications of why Fort TERM is an instance of
 Fort COLLECTION
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  List getWhyIsaParaphrase(CycObject spec, CycObject genl) throws CycConnectionException, CycApiException;

  /**
   * Gets the English parapharse of the justifications of why Fort TERM is an instance of
 Fort COLLECTION. getWhyGenlParaphase("Brazil", "Country") --> "Brazil is an independent
   * country" "an independent country is a kind of country"
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the English parapharse of the justifications of why Fort TERM is an instance of
 Fort COLLECTION
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  List getWhyIsaParaphrase(Fort spec, Fort genl, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns <tt>true</tt> iff any ground formula instances exist having the given predicate, and
   * the given term in the given argument position.
   *
   * @param term the term present at the given argument position
   * @param predicate the <tt>CycConstantI</tt> predicate for the formula
   * @param argumentPosition the argument position of the given term in the ground formula
   * @param mt microtheory (including its genlMts) in which the existence is sought
   *
   * @return <tt>true</tt> iff any ground formula instances exist having the given predicate, and
   * the given term in the given argument position
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean hasSomePredicateUsingTerm(CycConstantI predicate, Fort term, Integer argumentPosition, CycObject mt) throws CycConnectionException, CycApiException;
}
