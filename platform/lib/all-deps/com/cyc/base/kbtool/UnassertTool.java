package com.cyc.base.kbtool;

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import java.util.List;

/**
 *
 * @author nwinant
 */
public interface UnassertTool {
  
  /**
   * Kills the given Cyc constants. If CYCCONSTANT is a microtheory, then all the contained
   * assertions are deleted from the KB, the Cyc Truth Maintenance System (TMS) will automatically
   * delete any derived assertions whose sole support is the killed term(s).
   *
   * @param cycConstants the list of constant terms to be removed from the KB
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void kill(CycConstantI[] cycConstants) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Kills the given Cyc constants. If CYCCONSTANT is a microtheory, then all the contained
   * assertions are deleted from the KB, the Cyc Truth Maintenance System (TMS) will automatically
   * delete any derived assertions whose sole support is the killed term(s).
   *
   * @param cycConstants the list of constant terms to be removed from the KB
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void kill(List cycConstants) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Kills a reified Cyc term. If CYCFORT is a microtheory, then all the
   * contained assertions are deleted from the KB, the Cyc Truth Maintenance System (TMS) will
   * automatically delete any derived assertions whose sole support is the killed term(s).
   *
   * @param cycFort the NART term to be removed from the KB
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void kill(Fort cycFort) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Kills a reified Cyc term. If CYCFORT is a microtheory, then all the
   * contained assertions are deleted from the KB, the Cyc Truth Maintenance System (TMS) will
   * automatically delete any derived assertions whose sole support is the killed term(s).
   *
   * @param cycFort the NART term to be removed from the KB
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void kill(Fort cycFort, boolean bookkeeping, boolean transcript) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Kills a Cyc constant without issuing a transcript operation. If CYCCONSTANT is a microtheory,
   * then all the contained assertions are deleted from the KB, the Cyc Truth Maintenance System
   * (TMS) will automatically delete any derived assertions whose sole support is the killed
   * term(s).
   *
   * @param cycConstant the constant term to be removed from the KB
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void killWithoutTranscript(CycConstantI cycConstant) throws CycConnectionException, CycConnectionException, CycApiException;
  
  /**
   * Unasserts the given assertion.
   *
   * @param assertion the assertion in the form of a CycAssertion
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void unassertAssertion(CycAssertion assertion, boolean bookkeeping, boolean transcript) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Unasserts the given ground atomic formula (gaf) in the specified microtheory MT.
   *
   * @param gaf the gaf in the form of a CycList
   * @param mt the microtheory in which the assertion is made
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void unassertGaf(CycList gaf, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Unasserts the given ground atomic formula (gaf) in the specified microtheory MT.
   *
   * @param gaf the gaf in the form of a CycList
   * @param mt the microtheory in which the assertion is made
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void unassertGaf(FormulaSentence gaf, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Unasserts the given ground atomic formula (gaf) in the specified
   * microtheory MT.
   *
   * @param gaf the gaf in the form of a CycList
   * @param mt the microtheory in which the assertion is made
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void unassertGaf(FormulaSentence gaf, CycObject mt, boolean bookkeeping, boolean transcript) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Unasserts all assertions from the given mt having the given predicate and arg1, without a
   * transcript record of the unassert operation.
   *
   * @param predicate the given predicate or null to match all predicates
   * @param arg1 the given arg1
   * @param mt the microtheory from which to delete the matched assertions
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  void unassertMatchingAssertionsWithoutTranscript(Fort predicate, Object arg1, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Unasserts all assertions from the given mt, with a transcript record of the unassert
   * operation.
   *
   * @param mt the microtheory from which to delete all its assertions
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  void unassertMtContentsWithTranscript(CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Unasserts all assertions from the given mt, without a transcript record of the unassert
   * operation.
   *
   * @param mt the microtheory from which to delete all its assertions
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycConnectionException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  void unassertMtContentsWithoutTranscript(CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;

  /**
   * Unasserts the given sentence with bookkeeping and without placing it on the transcript queue.
   *
   * @param sentence the given sentence for unassertion
   * @param mt the microtheory from which the assertion is removed
   *
   * @throws CycConnectionException if cyc server host not found on the network
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void unassertWithBookkeepingAndWithoutTranscript(CycList sentence, CycObject mt) throws CycConnectionException, CycConnectionException, CycApiException;
}
