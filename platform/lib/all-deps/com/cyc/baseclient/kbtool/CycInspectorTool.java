package com.cyc.baseclient.kbtool;

import com.cyc.base.CycAccess;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.Formula;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.kbtool.InspectorTool;
import java.util.Map;
import com.cyc.baseclient.AbstractKBTool;
import static com.cyc.baseclient.CommonConstants.inferencePSC;
import com.cyc.baseclient.CycObjectFactory;
import static com.cyc.baseclient.CycObjectFactory.makeCycSymbol;
import static com.cyc.baseclient.api.SubLAPIHelper.makeNestedSubLStmt;
import static com.cyc.baseclient.api.SubLAPIHelper.makeSubLStmt;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.DefaultCycObject;
import com.cyc.baseclient.datatype.Pair;
import com.cyc.baseclient.util.LRUCache;

/**
 *
 * @author nwinant
 */
public class CycInspectorTool extends AbstractKBTool implements InspectorTool {
  
  public CycInspectorTool(CycAccess client) {
    super(client);
  }
  
  public CycInspectorTool() {
    super();
  }
  
  
  // Public
  
  /**
   * Returns the count of the instances of the given collection.
   *
   * @param collection the collection whose instances are counted
   * @param mt microtheory (including its genlMts) in which the count is determined
   *
   * @return the count of the instances of the given collection
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public int countAllInstances(Fort collection,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    return getConverse().converseInt("(count-all-instances " + collection.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Returns the count of the instances of the given collection, implements a cache to avoid asking
   * the same question twice from the KB.
   *
   * @param collection the collection whose instances are counted
   * @param mt microtheory (including its genlMts) in which the count is determined
   *
   * @return the count of the instances of the given collection
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public int countAllInstances_Cached(Fort collection, CycObject mt)
          throws CycConnectionException, CycApiException {
    Integer countAllInstances = countAllInstancesCache.get(collection);

    if (countAllInstances != null) {
      return countAllInstances;
    }

    final int answer = countAllInstances(collection, makeELMt_inner(mt));
    countAllInstancesCache.put(collection, answer);

    return answer;
  }

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
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public int countUsingBestIndex(CycList formula,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    String command = makeSubLStmt("with-inference-mt-relevance", makeELMt_inner(mt),
            makeNestedSubLStmt("best-index-count", formula, CycObjectFactory.t,
            CycObjectFactory.t));
    return getConverse().converseInt(command);
  }
  
  /**
   * Returns true if CycFort TERM is a instance of CycFort COLLECTION, defaulting to all
   * microtheories.
   *
   * @param term the term
   * @param collectionName the name of the collection
   *
   * @return <tt>true</tt> if CycFort TERM is a instance of the CycFort named by COLLECTION
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isa(CycObject term,
          String collectionName)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isa(term,
            getKnownConstantByName_inner(collectionName));
  }

  /**
   * Returns true if CycFort TERM is a instance of CycFort COLLECTION, defaulting to all
   * microtheories.
   *
   * @param term the term
   * @param collection the collection
   *
   * @return <tt>true</tt> if CycFort TERM is a instance of CycFort COLLECTION
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isa(CycObject term,
          Fort collection)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(isa-in-any-mt? " + term.stringApiValue() + " "
            + collection.stringApiValue() + ")");
  }

  /**
   * Returns true if CycFort TERM is a instance of CycFort COLLECTION, using the given microtheory.
   * Method implementation optimised for the binary api.
   *
   * @param term the term
   * @param collection the collection
   * @param mt the microtheory in which the ask is performed
   *
   * @return <tt>true</tt> if CycFort TERM is a instance of CycFort COLLECTION
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isa(CycObject term,
          CycObject collection,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    final String command = "(isa? " + term.stringApiValue() + " "
            + collection.stringApiValue() + " " + makeELMt_inner(mt).stringApiValue() + ")";

    return getConverse().converseBoolean(command);
  }
  
  /**
   * Returns true if the quoted CycFort TERM is a instance of CycFort COLLECTION, in any microtheory.
   * Method implementation optimised for the binary api.
   *
   * @param term the term
   * @param collection the collection
   *
   * @return <tt>true</tt> if the quoted CycFort TERM is a instance of CycFort COLLECTION
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isQuotedIsa(final CycObject term, final CycObject collection)
          throws CycConnectionException, com.cyc.base.CycApiException, CycTimeOutException {
    return isQuotedIsa(term, collection, 0);
  }

  /**
   * Returns true if the quoted CycFort TERM is a instance of CycFort COLLECTION, in any microtheory.
   * Method implementation optimised for the binary api.
   *
   * @param term the term
   * @param collection the collection
   * @param timeoutMsecs the time in milliseconds to wait before giving up, set to
   * zero to wait forever.
   *
   * @return <tt>true</tt> if the quoted CycFort TERM is a instance of CycFort COLLECTION
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   * @throws CycTimeOutException if the calculation times out
   */
  @Override
  public boolean isQuotedIsa(final CycObject term, final CycObject collection,
          long timeoutMsecs)
          throws CycConnectionException, com.cyc.base.CycApiException, CycTimeOutException {
    //// Preconditions
    if (term == null) {
      throw new NullPointerException("term must not be null");
    }
    if (collection == null) {
      throw new NullPointerException("collection must not be null");
    }
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            getKnownConstantByName_inner("quotedIsa"), term, collection);
    return getCyc().getInferenceTool().isQueryTrue(query, inferencePSC, null, timeoutMsecs);
  }

  /**
   * Returns true if the quoted CycFort TERM is a instance of CycFort COLLECTION,
   * in the given inference microtheory.
   *
   * @param term the term
   * @param collection the collection
   * @param mt the inference microtheory
   * set to zero in order to wait forever
   *
   * @return <tt>true</tt> if the quoted CycFort TERM is a instance of CycFort COLLECTION
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isQuotedIsa(final CycObject term, final CycObject collection,
          final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException, CycTimeOutException {
    return isQuotedIsa(term, collection, mt, 0);
  }

  /**
   * Returns true if the quoted CycFort TERM is a instance of CycFort COLLECTION,
   * in the given inference microtheory.
   *
   * @param term the term
   * @param collection the collection
   * @param mt the inference microtheory
   * @param timeoutMsecs the time in milliseconds to wait before giving up,
   * set to zero in order to wait forever
   *
   * @return <tt>true</tt> if the quoted CycFort TERM is a instance of CycFort COLLECTION
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   * @throws CycTimeOutException if the calculation times out
   */
  @Override
  public boolean isQuotedIsa(final CycObject term, final CycObject collection,
          final CycObject mt, long timeoutMsecs)
          throws CycConnectionException, com.cyc.base.CycApiException, CycTimeOutException {
    if (term == null) {
      throw new NullPointerException("Term must not be null.");
    }
    if (collection == null) {
      throw new NullPointerException("Collection must not be null.");
    }
    if (mt == null) {
      throw new NullPointerException("Microtheory must not be null.");
    }
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            getKnownConstantByName_inner("quotedIsa"), term, collection);
    return getCyc().getInferenceTool().isQueryTrue(query, makeELMt_inner(mt), null, timeoutMsecs);
  }
  
    /**
   * Returns <tt>true</tt> iff backchain inference on the given predicate is required.
   *
   * @param predicate the <tt>CycConstant</tt> predicate for which backchaining required status is
   * sought
   * @param mt microtheory (including its genlMts) in which the backchaining required status is
   * sought
   *
   * @return <tt>true</tt> iff backchain inference on the given predicate is required
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isBackchainRequired(CycConstantI predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycConstant backchainRequired = getKnownConstantByGuid_inner(
            "beaa3d29-9c29-11b1-9dad-c379636f7270");

    return getCyc().getLookupTool().hasSomePredicateUsingTerm(backchainRequired,
            predicate, 1, makeELMt_inner(mt));
  }

  /**
   * Returns <tt>true</tt> iff backchain inference on the given predicate is encouraged.
   *
   * @param predicate the <tt>CycConstant</tt> predicate for which backchaining encouraged status
   * is sought
   * @param mt microtheory (including its genlMts) in which the backchaining encouraged status is
   * sought
   *
   * @return <tt>true</tt> iff backchain inference on the given predicate is encouraged
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isBackchainEncouraged(CycConstantI predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycConstant backchainEncouraged = getKnownConstantByGuid_inner(
            "c09d1cea-9c29-11b1-9dad-c379636f7270");

    return getCyc().getLookupTool().hasSomePredicateUsingTerm(backchainEncouraged,
            predicate, 1, makeELMt_inner(mt));
  }

  /**
   * Returns <tt>true</tt> iff backchain inference on the given predicate is discouraged.
   *
   * @param predicate the <tt>CycConstant</tt> predicate for which backchaining discouraged status
   * is sought
   * @param mt microtheory (including its genlMts) in which the backchaining discouraged status is
   * sought
   *
   * @return <tt>true</tt> iff backchain inference on the given predicate is discouraged
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isBackchainDiscouraged(CycConstantI predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycConstant backchainDiscouraged = getKnownConstantByGuid_inner(
            "bfcbce14-9c29-11b1-9dad-c379636f7270");

    return getCyc().getLookupTool().hasSomePredicateUsingTerm(backchainDiscouraged,
            predicate, 1, makeELMt_inner(mt));
  }

  /**
   * Returns <tt>true</tt> iff backchain inference on the given predicate is forbidden.
   *
   * @param predicate the <tt>CycConstant</tt> predicate for which backchaining forbidden status is
   * sought
   * @param mt microtheory (including its genlMts) in which the backchaining forbidden status is
   * sought
   *
   * @return <tt>true</tt> iff backchain inference on the given predicate is forbidden
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isBackchainForbidden(CycConstantI predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycConstant backchainForbidden = getKnownConstantByGuid_inner(
            "bfa4e9d2-9c29-11b1-9dad-c379636f7270");

    return getCyc().getLookupTool().hasSomePredicateUsingTerm(backchainForbidden,
            predicate, 1, makeELMt_inner(mt));
  }

  /**
   * Returns <tt>true</tt> iff the predicate has the irreflexive property: (#$isa ?PRED
   * #$IrreflexsiveBinaryPredicate).
   *
   * @param predicate the <tt>CycConstant</tt> predicate for which irreflexive status is sought
   * @param mt microtheory (including its genlMts) in which the irreflexive status is sought
   *
   * @return <tt>true</tt> iff the predicate has the irreflexive property: (#$isa ?PRED
   * #$IrreflexsiveBinaryPredicate)
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isIrreflexivePredicate(CycConstantI predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycConstant irreflexiveBinaryPredicate = getKnownConstantByGuid_inner(
            "bd654be7-9c29-11b1-9dad-c379636f7270");

    return this.isa(predicate,
            irreflexiveBinaryPredicate,
            makeELMt_inner(mt));
  }
  
    /**
   * Returns <tt>true</tt> iff <tt>CycArrayList</tt> represents a well formed formula.
   *
   * @param cycList the candidate well-formed-formula
   *
   * @return true iff cycList represents a well formed formula
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isWellFormedFormula(CycList cycList)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isWellFormedFormulaInternal(cycList);
  }

  /**
   * Returns <tt>true</tt> iff <tt>CycArrayList</tt> represents a well formed formula.
   *
   * @param formula the candidate well-formed-formula
   *
   * @return true iff cycList represents a well formed formula
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isWellFormedFormula(Formula formula)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isWellFormedFormulaInternal(formula);
  }

  /**
   * Returns true if the given HL formula and microtheory correspond to a valid
   * assertion in that microtheory.
   *
   * @param gaf the given assertion formula
   * @param mt the candidate assertion microtheory
   * @return 
   */
  @Override
  public boolean isGafValidAssertion(CycList gaf, ELMt mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = makeSubLStmt("find-gaf", gaf, mt);
    Object response = getConverse().converseObject(command);
    return !response.equals(CycObjectFactory.nil);
  }

  /**
   * Returns true if the given HL formula and microtheory correspond to a valid
   * assertion in that microtheory.
   *
   * @param gaf the given assertion formula
   * @param mt the candidate assertion microtheory
   */
  @Override
  public boolean isGafValidAssertion(FormulaSentence gaf, ELMt mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isGafValidAssertion(gaf.getArgs(), mt);
  }

  /**
   * Returns true if the given HL formula and microtheory correspond to a valid
   * assertion in that microtheory.
   *
   * @param hlFormula the given HL formula
   * @param mt the candidate assertion microtheory
   */
  @Override
  public boolean isAssertionValid(CycList hlFormula, Fort mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = makeSubLStmt("find-assertion", hlFormula, mt);
    Object response = getConverse().converseObject(command);
    return !response.equals(CycObjectFactory.nil);
  }  
  
   /**
   * Returns true if the cyc object is a BinaryPredicate.
   *
   * @param cycObject the given cyc object
   *
   * @return true if cycObject is a BinaryPredicate, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isBinaryPredicate(final CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseBoolean(
            "(binary-predicate? " + cycObject.stringApiValue() + ")");
  }

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
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isBinaryPredicate(final CycObject cycObject, final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isBinaryPredicate(cycObject);
  }

  /**
   * Returns true if the candidate name uses valid CycConstant characters.
   *
   * @param candidateName the candidate name
   *
   * @return true if the candidate name uses valid CycConstant characters
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isValidConstantName(String candidateName)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean(
            "(new-constant-name-spec-p " + DefaultCycObject.stringApiValue(candidateName) + ")");
  }

  /**
   * Returns true if the candidate name is an available CycConstant name, case insensitive.
   *
   * @param candidateName the candidate name
   *
   * @return true if the candidate name uses valid CycConstant characters
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isConstantNameAvailable(String candidateName)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(constant-name-available \"" + candidateName + "\")");
  }

  /**
   * Returns true if term is a quotedCollection, in any microtheory
   *
   * @param cycFort the given CycFort term
   *
   * @return true if term is a quotedCollection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   * @deprecated
   */
  @Override
  public boolean isQuotedCollection(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    throw new com.cyc.base.CycApiException(
            "quotedCollection is no longer supported, see Quote");
  }

  /**
   * Returns true if term is a quotedCollection is a quotedCollection.
   *
   * @param cycFort the given CycFort term
   * @param mt the microtheory in which the query is made
   *
   * @return true if term is a quotedCollection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   * @deprecated
   */
  @Override
  public boolean isQuotedCollection(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    throw new com.cyc.base.CycApiException(
            "quotedCollection is no longer supported, see Quote");
  }

  /** @return true iff expression is free of all variables.
   * @throws IOException if a data communication error occurs
   */
  @Override
  public boolean isGround(CycObject expression) throws CycConnectionException {
    return getConverse().converseBoolean("(ground? " + DefaultCycObject.stringApiValue(
            expression) + ")");
  }

  /**
   * Returns true if cycConstant is a PublicConstant.
   *
   * @param cycConstant the given constant
   *
   * @return true if cycConstant is a PublicConstant
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isPublicConstant(CycConstantI cycConstant)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(isa-in-any-mt? " + cycConstant.stringApiValue()
            + " #$PublicConstant)");
  }
  
    /**
   * Returns true if the given term is a microtheory.
   *
   * @param term the constant for determination as a microtheory
   *
   * @return <tt>true</tt> iff cycConstant is a microtheory
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isMicrotheory(CycObject term)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean(
            "(isa-in-any-mt? " + term.stringApiValue() + " #$Microtheory)");
  }

  /**
   * Returns true if the given term is a Collection.
   *
   * @param cycObject the given term
   *
   * @return true if the given term is a Collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isCollection(final CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseBoolean(
            "(isa-in-any-mt? " + cycObject.stringApiValue() + " #$Collection)");
  }

  /**
   * Returns true if the given term is a Collection.
   *
   * @param cycObject the given term
   * @param mt the inference microtheory
   *
   * @return true if the given term is a Collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isCollection(final CycObject cycObject, final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseBoolean("(isa? " + cycObject.stringApiValue() + " #$Collection " + makeELMt_inner(
            mt).stringApiValue() + ")");
  }

  /**
   * Returns true if the given object is a Collection.
   *
   * @param obj the given term
   *
   * @return true if the given term is a Collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isCollection(final Object obj)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (obj == null) {
      throw new NullPointerException("term must not be null");
    }
    if (obj instanceof CycObject) {
      return isCollection((CycObject) obj);
    } else {
      return false;
    }
  }

  /**
   * Returns true if the given term is a collection, implemented by a cache to avoid asking the same
   * question twice from the KB.
   *
   * @param cycObject the given term
   *
   * @return true if the given term is a collection
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isCollection_Cached(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    Boolean isCollection = isCollectionCache.get(cycObject);

    if (isCollection != null) {
      return isCollection.booleanValue();
    }

    final boolean answer = isCollection(cycObject);
    isCollectionCache.put(cycObject, answer);

    return answer;
  }

  @Override
  public boolean isCollection_Cached(Object term)
          throws CycConnectionException, com.cyc.base.CycApiException {
    if (term instanceof CycObject) {
      return isCollection_Cached((CycObject) term);
    } else {
      return false;
    }
  }

  /**
   * Returns true if the given term is an Individual.
   *
   * @param cycObject the given term
   *
   * @return true if the given term is an Individual
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isIndividual(final CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseBoolean(
            "(isa-in-any-mt? " + cycObject.stringApiValue() + " #$Individual)");
  }

  /**
   * Returns true if the given term is an Individual.
   *
   * @param cycObject the given term
   * @param mt the inference microtheory
   *
   * @return true if the given term is an Individual
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isIndividual(final CycObject cycObject, final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseBoolean("(isa? " + cycObject.stringApiValue() + " #$Individual " + makeELMt_inner(
            mt).stringApiValue() + ")");
  }

  /**
   * Returns true if the given is a Function.
   *
   * @param cycObj the given term
   *
   * @return true if the given is a Function
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isFunction(CycObject cycObj)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(isa-in-any-mt? " + cycObj.stringApiValue()
            + " #$Function-Denotational)");
  }
  
  /**
   * Returns true if the given is a Function.
   *
   * @param cycObj the given term
   *
   * @return true if the given is a ReifiableFunction
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */ 
  @Override
  public boolean isReifiableFunction(CycObject cycObj)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(isa-in-any-mt? " + cycObj.stringApiValue()
            + " #$ReifiableFunction)");
  }
  
  /**
   * Returns true if the given term is an evaluatable predicate.
   *
   * @param predicate the given term
   *
   * @return true if true if the given term is an evaluatable predicate, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isEvaluatablePredicate(Fort predicate)
          throws CycConnectionException, com.cyc.base.CycApiException {
    final String command = makeSubLStmt("with-all-mts", makeNestedSubLStmt(
            "evaluatable-predicate?", predicate));
    return getConverse().converseBoolean(command);
  }

  /**
   * Returns true if cycObject is a Predicate.
   *
   * @param cycObject the term for determination as a predicate
   *
   * @return true if cycObject is a Predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isPredicate(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseBoolean(
            "(isa-in-any-mt? " + cycObject.stringApiValue() + " #$Predicate)");
  }

  /**
   * Returns true if cycObject is a Predicate.
   *
   * @param cycObject the term for determination as a predicate
   * @param mt the inference microtheory
   *
   * @return true if cycObject is a Predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isPredicate(final CycObject cycObject, final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseBoolean("(isa? " + cycObject.stringApiValue() + " #$Predicate " + makeELMt_inner(
            mt).stringApiValue() + ")");
  }

  @Override
  public boolean isPredicate(final Object object, final CycObject mt) throws CycConnectionException, com.cyc.base.CycApiException {
    if (object == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    if (object instanceof CycObject) {
      return isPredicate((CycObject) object, mt);
    } else {
      return false;
    }
  }

  @Override
  public boolean isPredicate(final Object object) throws CycConnectionException, com.cyc.base.CycApiException {
    if (object == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    if (object instanceof CycObject) {
      return isPredicate((CycObject) object);
    } else {
      return false;
    }
  }

  /**
   * Returns true if the given term is a UnaryPredicate.
   *
   * @param cycObject the given term
   *
   * @return true if true if the given term is a UnaryPredicate, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isUnaryPredicate(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseBoolean("(isa-in-any-mt? " + cycObject.stringApiValue()
            + " #$UnaryPredicate)");
  }

  /**
   * Returns true if the given term is a UnaryPredicate.
   *
   * @param cycObject the given term
   * @param mt the inference microtheory
   *
   * @return true if true if the given term is a UnaryPredicate, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isUnaryPredicate(CycObject cycObject, final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseBoolean("(isa? " + cycObject.stringApiValue()
            + " #$UnaryPredicate " + makeELMt_inner(mt).stringApiValue() + ")");
  }
  
  /**
   * Returns true if formula is well-formed in the relevant mt.
   *
   * @param formula the given EL formula
   * @param mt the relevant mt
   *
   * @return true if formula is well-formed in the relevant mt, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isFormulaWellFormed(CycList formula,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isFormulaWellFormedInternal(formula, mt);
  }

  /**
   * Returns true if formula is well-formed in the relevant mt.
   *
   * @param formula the given EL formula
   * @param mt the relevant mt
   *
   * @return true if formula is well-formed in the relevant mt, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isFormulaWellFormed(Formula formula,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isFormulaWellFormedInternal(formula, mt);
  }



  /**
   * Returns true if formula is well-formed Non Atomic Reifable Term.
   *
   * @param formula the given EL formula
   *
   * @return true if formula is well-formed Non Atomic Reifable Term, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isCycLNonAtomicReifableTerm(CycList formula)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isCycLNonAtomicReifableTerm(formula);
  }

  /**
   * Returns true if formula is well-formed Non Atomic Reifable Term.
   *
   * @param formula the given EL formula
   *
   * @return true if formula is well-formed Non Atomic Reifable Term, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isCycLNonAtomicReifableTerm(CycObject formula)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(cycl-nart-p " + formula.stringApiValue() + ")");
  }

  /**
   * Returns true if formula is well-formed Non Atomic Un-reifable Term.
   *
   * @param formula the given EL formula
   *
   * @return true if formula is well-formed Non Atomic Un-reifable Term, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isCycLNonAtomicUnreifableTerm(CycObject formula)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(cycl-naut-p " + formula.stringApiValue() + ")");
  }
  
    /**
   * Returns true if the given symbol is defined as an api function.
   *
   * @param symbolName the candidate api function symbol name
   *
   * @return true if the given symbol is defined as an api function
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isFunctionBound(String symbolName)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycSymbol cycSymbol = makeCycSymbol(
            symbolName);

    return isFunctionBound(cycSymbol);
  }

  /**
   * Returns true if the given symbol is defined as an api function.
   *
   * @param cycSymbol the candidate api function symbol
   *
   * @return rue if the given symbol is defined as an api function
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isFunctionBound(CycSymbolI cycSymbol)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = makeSubLStmt("boolean", makeNestedSubLStmt("fboundp"),
            cycSymbol);
    return getConverse().converseBoolean(command);
  }
  
    /**
   * Returns true if CycFort SPEC is a spec of CycFort GENL.
   *
   * @param spec the considered spec collection
   * @param genl the considered genl collection
   *
   * @return true if CycFort SPEC is a spec of CycFort GENL, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isSpecOf(CycObject spec,
          CycObject genl)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isGenlOf(genl,
            spec);
  }

  /**
   * Returns true if CycFort SPEC is a spec of CycFort GENL.
   *
   * @param spec the considered spec collection
   * @param genl the considered genl collection
   * @param mt the relevant mt
   *
   * @return true if CycFort SPEC is a spec of CycFort GENL, otherwise false
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isSpecOf(CycObject spec,
          CycObject genl,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return isGenlOf(genl,
            spec,
            mt);
  }

  /**
   * Returns true if CycFort GENL is a genl of CycFort SPEC.
   *
   * @param genl the collection for genl determination
   * @param spec the collection for spec determination
   *
   * @return <tt>true</tt> if CycFort GENL is a genl of CycFort SPEC
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isGenlOf(CycObject genl,
          CycObject spec)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(genl-in-any-mt? " + spec.stringApiValue() + " "
            + genl.stringApiValue() + ")");
  }

  /**
   * Returns true if CycFort GENL is a genl of CycFort SPEC, implements a cache to avoid asking the
   * same question twice from the KB.
   *
   * @param genl the collection for genl determination
   * @param spec the collection for spec determination
   *
   * @return <tt>true</tt> if CycFort GENL is a genl of CycFort SPEC
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isGenlOf_Cached(CycObject genl,
          CycObject spec)
          throws CycConnectionException, com.cyc.base.CycApiException {
    final Pair args = new Pair(genl, spec);
    Boolean isGenlOf = isGenlOfCache.get(args);
    if (isGenlOf != null) {
      return isGenlOf.booleanValue();
    }
    final boolean answer = isGenlOf(genl, spec);
    isGenlOfCache.put(args, answer);
    return answer;
  }

  /**
   * Returns true if CycFort GENL is a genl of CycFort SPEC in MT.
   *
   * @param genl the collection for genl determination
   * @param spec the collection for spec determination
   * @param mt the microtheory for spec determination
   *
   * @return <tt>true</tt> if CycFort GENL is a genl of CycFort SPEC in MT
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isGenlOf(CycObject genl,
          CycObject spec,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(genl? " + spec.stringApiValue() + " " + genl.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Returns true if CycFort GENLPRED is a genl-pred of CycFort SPECPRED in MT.
   *
   * @param genlPred the predicate for genl-pred determination
   * @param specPred the predicate for spec-pred determination
   * @param mt the microtheory for subsumption determination
   *
   * @return <tt>true</tt> if CycFort GENLPRED is a genl-pred of CycFort SPECPRED in MT
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isGenlPredOf(Fort genlPred,
          Fort specPred,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(genl-predicate? " + specPred.stringApiValue() + " "
            + genlPred.stringApiValue() + " " + makeELMt_inner(
            mt).stringApiValue() + ")");
  }

  /**
   * Returns true if CycFort GENLPRED is a genl-pred of CycFort SPECPRED in any MT.
   *
   * @param genlPred the predicate for genl-pred determination
   * @param specPred the predicate for spec-pred determination
   *
   * @return <tt>true</tt> if CycFort GENLPRED is a genl-pred of CycFort SPECPRED in any MT
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isGenlPredOf(Fort genlPred,
          Fort specPred)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(with-all-mts (genl-predicate? " + specPred.stringApiValue() + " "
            + genlPred.stringApiValue() + "))");
  }

  /**
   * Returns true if CycFort GENLPRED is a genl-inverse of CycFort SPECPRED in MT.
   *
   * @param genlPred the predicate for genl-inverse determination
   * @param specPred the predicate for spec-inverse determination
   * @param mt the microtheory for inverse subsumption determination
   *
   * @return <tt>true</tt> if CycFort GENLPRED is a genl-inverse of CycFort SPECPRED in MT
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isGenlInverseOf(Fort genlPred,
          Fort specPred,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(genl-inverse? " + specPred.stringApiValue() + " "
            + genlPred.stringApiValue() + " " + makeELMt_inner(
            mt).stringApiValue() + ")");
  }

  /**
   * Returns true if CycFort GENLPRED is a genl-inverse of CycFort SPECPRED in any MT.
   *
   * @param genlPred the predicate for genl-inverse determination
   * @param specPred the predicate for spec-inverse determination
   *
   * @return <tt>true</tt> if CycFort GENLPRED is a genl-inverse of CycFort SPECPRED in any MT
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isGenlInverseOf(Fort genlPred,
          Fort specPred)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(with-all-mts (genl-inverse? " + specPred.stringApiValue() + " "
            + genlPred.stringApiValue() + "))");
  }

  /**
   * Returns true if CycFort GENLMT is a genl-mt of CycFort SPECPRED in mt-mt (currently
   * #$UniversalVocabularyMt).
   *
   * @param genlMt the microtheory for genl-mt determination
   * @param specMt the microtheory for spec-mt determination
   *
   * @return <tt>true</tt> if CycFort GENLMT is a genl-mt of CycFort SPECPRED in mt-mt (currently
   * #$UniversalVocabularyMt)
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean isGenlMtOf(CycObject genlMt,
          CycObject specMt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(genl-mt? " + makeELMt_inner(specMt).stringApiValue() + " "
            + makeELMt_inner(genlMt).stringApiValue() + ")");
  }
  
  
  // Private
  
  private boolean isWellFormedFormulaInternal(CycObject cycList)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean(makeSubLStmt(WITH_ALL_MTS, makeNestedSubLStmt(EL_WFF,
            cycList)));
  }
  
  private boolean isFormulaWellFormedInternal(CycObject formula,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseBoolean("(el-formula-ok? " + formula.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }
  
  
  // Internal
  
  private static final CycSymbol EL_WFF = makeCycSymbol("el-wff?");

  /** 
   * Least Recently Used Cache of isCollection results.
   */
  private final Map<CycObject, Boolean> isCollectionCache = new LRUCache<CycObject, Boolean>(
          500, 5000, true);
  
  /** 
   * Least Recently Used Cache of isGenlOf results.
   */
  private final Map<Pair, Boolean> isGenlOfCache = new LRUCache<Pair, Boolean>(
          500, 5000, true);
  
  /** 
   * Least Recently Used Cache of countAllInstances results. 
   */
  private final Map<Fort, Integer> countAllInstancesCache = new LRUCache<Fort, Integer>(
          500, 5000, true);
}
