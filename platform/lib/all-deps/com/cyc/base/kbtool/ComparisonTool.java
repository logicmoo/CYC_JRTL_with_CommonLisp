package com.cyc.base.kbtool;

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycObject;

/**
 *
 * @author nwinant
 */
public interface ComparisonTool {
  
  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 are asserted coextensional.
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 are asserted coextensional
 otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areAssertedCoextensional(Fort collection1, Fort collection2) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 are asserted coextensional.
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   * @param mt the relevant mt
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 are asserted coextensional
 otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areAssertedCoextensional(Fort collection1, Fort collection2, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 are disjoint.
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 are disjoint, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areDisjoint(CycObject collection1, CycObject collection2) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 are disjoint.
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   * @param mt the relevant mt
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 are disjoint, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areDisjoint(CycObject collection1, CycObject collection2, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 are in a hierarchy.
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 are in a hierarchy, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areHierarchical(Fort collection1, Fort collection2) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 are in a hierarchy.
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   * @param mt the relevant mt
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 are in a hierarchy, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areHierarchical(Fort collection1, Fort collection2, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 intersect with regard to all-specs.
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 intersect with regard to all-specs
 otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areIntersecting(Fort collection1, Fort collection2) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 intersect with regard to all-specs.
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   * @param mt the relevant mt
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 intersect with regard to all-specs
 otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areIntersecting(Fort collection1, Fort collection2, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 are tacitly coextensional via
 mutual genls of each other.
   *
   * @param collection1 the first given collection
   * @param collection2 the second given collection
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 are tacitly coextensional via
 mutual genls of each other, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areTacitCoextensional(Fort collection1, Fort collection2) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Returns true if Fort COLLECION1 and Fort COLLECTION2 are tacitly coextensional via
 mutual genls of each other.
   *
   * @param collection1 the first given collection
   * @param collection2 the second given collection
   * @param mt the relevant mt
   *
   * @return true if Fort COLLECION1 and Fort COLLECTION2 are tacitly coextensional via
 mutual genls of each other, otherwise false
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean areTacitCoextensional(Fort collection1, Fort collection2, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /** 
   * Determines whether the two input objects are equal EL expressions.
   */
  boolean equalsEL(Object obj1, Object obj2) throws CycConnectionException;

  /**
   * Returns true if CycConstantI BINARYPREDICATE relates Fort ARG1 and Fort ARG2.
   *
   * @param binaryPredicate the predicate
   * @param arg1 the first argument related by the predicate
   * @param arg2 the second argument related by the predicate
   *
   * @return true if CycConstantI BINARYPREDICATE relates Fort ARG1 and Fort ARG2 otherwise
 false
   *
   * @throws CycConnectionException if cyc server host not found on the network or the Cyc server cannot be found
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean predicateRelates(CycConstantI binaryPredicate, Fort arg1, Fort arg2) throws CycConnectionException, CycApiException;

  /**
   * Returns true if CycConstantI BINARYPREDICATE relates Fort ARG1 and Fort ARG2.
   *
   * @param binaryPredicate the predicate
   * @param arg1 the first argument related by the predicate
   * @param arg2 the second argument related by the predicate
   * @param mt the relevant mt
   *
   * @return true if CycConstantI BINARYPREDICATE relates Fort ARG1 and Fort ARG2 otherwise
 false
   *
   * @throws CycConnectionException if cyc server host not found on the network or the Cyc server cannot be found
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean predicateRelates(CycConstantI binaryPredicate, Fort arg1, Fort arg2, CycObject mt) throws CycConnectionException, CycApiException;

  /**
   * Returns true if Fort TERM is provably not a instance of Fort COLLECTION,
 using the given microtheory.
   * Method implementation optimised for the binary api.
   *
   * @param term the term
   * @param collection the collection
   * @param mt the microtheory in which the ask is performed
   *
   * @return <tt>true</tt> if Fort TERM is provably not a instance of Fort COLLECTION
   *
   * @throws CycConnectionException if cyc server host not found on the network or the Cyc server cannot be found
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean provablyNotIsa(CycObject term, CycObject collection, CycObject mt) throws CycConnectionException, CycApiException;
  
  
}
