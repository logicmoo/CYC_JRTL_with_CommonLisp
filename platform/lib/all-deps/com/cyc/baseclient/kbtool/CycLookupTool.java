package com.cyc.baseclient.kbtool;

import com.cyc.base.CycAccess;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSentence;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.cycobject.Guid;
import com.cyc.base.kbtool.LookupTool;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import com.cyc.baseclient.AbstractKBTool;
import static com.cyc.baseclient.CommonConstants.everythingPSC;
import static com.cyc.baseclient.CommonConstants.inferencePSC;
import com.cyc.baseclient.CycObjectFactory;
import static com.cyc.baseclient.CycObjectFactory.makeCycSymbol;
import com.cyc.baseclient.api.SubLAPIHelper;
import static com.cyc.baseclient.api.SubLAPIHelper.makeNestedSubLStmt;
import static com.cyc.baseclient.api.SubLAPIHelper.makeSubLStmt;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.DefaultCycAssertion;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.CycFort;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.cycobject.CycListParser;
import com.cyc.baseclient.cycobject.CycNart;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.CycVariable;
import com.cyc.baseclient.cycobject.DefaultCycObject;
import com.cyc.baseclient.datatype.StringUtils;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.baseclient.nl.Paraphraser;
import com.cyc.baseclient.util.Log;

/**
 *
 * @author nwinant
 */
public class CycLookupTool extends AbstractKBTool implements LookupTool {
  
  public CycLookupTool(CycAccess client) {
    super(client);
  }
  
  public CycLookupTool() {
    super();
  }
  
  
  // Public
  
    /**
   * Finds a Cyc constant in the KB with the specified name
   *
   * @param constantName the name of the new constant
   *
   * @return the constant term or null if the argument name is null or if the term is not found
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstantI find(String constantName)
          throws CycConnectionException, com.cyc.base.CycApiException {
    if (constantName == null) {
      return null;
    }

    return getConstantByName(constantName);
  }

  /**
   * Finds or creates a Cyc constant in the KB with the specified name. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param constantName the name of the new constant
   *
   * @return the new constant term
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstantI findOrCreate(String constantName)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getCyc().getObjectTool().makeCycConstant(constantName);
  }
  
  /**
   * Gets a known CycConstant by using its constant name.
   *
   * @param constantName the name of the constant to be instantiated
   *
   * @return the complete <tt>CycConstant</tt> if found, otherwise throw an exception
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycConstant getKnownConstantByName(String constantName)
          throws CycConnectionException, CycApiException {
    CycConstant cycConstant = getConstantByName(constantName);

    if (cycConstant == null) {
      throw new com.cyc.base.CycApiException("Expected constant not found " + constantName);
    }

    return cycConstant;
  }

  /**
   * Gets a known CycFort by using its constant name or NART string.
   *
   * @param fortName the name of the FORT to be instantiated
   * @return the complete <tt>CycFort</tt> if found, otherwise throw an exception
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort getKnownFortByName(String fortName)
          throws CycConnectionException, CycApiException {
    Fort fort = null;
    if (fortName.contains(")")) {
      final CycArrayList terms = new CycListParser(getCyc()).read(fortName);
      fort = getCycNartFromCons(terms);
    } else {
      fort = getKnownConstantByName(fortName);
    }
    if (fort == null) {
      throw new com.cyc.base.CycApiException("'" + fortName + "' is not a valid FORT name.");
    }
    return fort;
  }

  /**
   * Gets a DenotationalTerm (i.e. CycConstant, CycNart, or CycNaut) by using its constant name 
   * or formula string.  This method will not create any terms.  However, if a NAT formula is sent
   * in, and its functor is reifiable, this method will return a CycNart object, regardless of whether
   * or not that term has actually been reified in the Cyc KB.
   *
   * @param termName the name of the term to be instantiated
   * @return the complete <tt>DenotationalTerm</tt> if found, otherwise throw an exception
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public DenotationalTerm getTermByName(String termName)
          throws CycConnectionException, com.cyc.base.CycApiException {
    DenotationalTerm term = null;
    if (termName.contains(")")) {
      final CycArrayList terms = new CycListParser(getCyc()).read(termName);
      term = getCycNartFromCons(terms);
      if (term == null && getCyc().getInspectorTool().isFunction((CycObject)terms.first())) {          
          term = new CycNaut(terms);
      }
    } else {
      term = getKnownConstantByName(termName);
    }
    if (term == null) {
      throw new com.cyc.base.CycApiException("'" + termName + "' is not a valid FORT name.");
    }
    return term;
  }
  
  @Override
  public List findConstantsForNames(List constantNames)
          throws CycConnectionException, com.cyc.base.CycApiException {
    if ((constantNames == null) || (constantNames.size() <= 0)) {
      return null;
    }
    StringBuffer command = new StringBuffer(
            "(MAPCAR (QUOTE FIND-CONSTANT) (LIST");
    for (Iterator iter = constantNames.iterator(); iter.hasNext();) {
      command.append(" \"");
      String curConstName = StringUtils.escapeDoubleQuotes("" + iter.next());
      command.append(curConstName);
      command.append("\"");
    }
    command.append("))");
    final Object result = getConverse().converseCycObject("" + command);
    if (!(result instanceof CycArrayList)) {
      return null;
    }
    return (CycArrayList) result;
  }

  @Override
  public List findConstantsForGuids(List constantGuids)
          throws CycConnectionException, com.cyc.base.CycApiException {
    if ((constantGuids == null) || (constantGuids.size() <= 0)) {
      return null;
    }
    List result = new ArrayList();
    // @ToDo this is very inefficient...we need to find a way to do this
    // with a single round trip to Cyc. --Tony
    for (Iterator iter = constantGuids.iterator(); iter.hasNext();) {
      CycConstant item = (CycConstant) iter.next();
      try {
        result.add(getConstantByGuid(item.getGuid()));
      } catch (Exception e) {
        result.add(CycObjectFactory.nil);
      }
    }
    return result;
  }

  /**
   * Gets a CycConstant by using its constant name.
   *
   * @param constantName the name of the constant to be instantiated
   *
   * @return the complete <tt>CycConstant</tt> if found, otherwise return null
   *
   * @throws IOException if a data communication error occurs
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstant getConstantByName(final String constantName)
          throws CycConnectionException, CycApiException {
    String name = constantName;
    if (constantName.startsWith("#$")) {
      name = name.substring(2);
    }
    CycConstant answer = CycObjectFactory.getCycConstantCacheByName(name);
    if (answer != null) { //@todo sometimes the cache is stale, and we ought to be able to force a look in the KB.
      return answer;
    }
    final String command = makeSubLStmt("find-constant", name);
    final Object answerObject = getConverse().converseObject(command);
    if (answerObject instanceof CycConstant) {
      answer = (CycConstant) answerObject;
      CycObjectFactory.addCycConstantCache(answer);
      return answer;
    }
    return null;
  }

  /**
   * Gets the CycGuid for the given constant name, raising an exception if the constant does not
 exist.
   *
   * @param constantName the name of the constant object for which the CycGuid is sought
   *
   * @return the CycGuid for the given CycConstant
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public Guid getConstantGuid(String constantName)
          throws CycConnectionException, com.cyc.base.CycApiException {
    final String command =
            makeSubLStmt("guid-to-string",
            makeNestedSubLStmt("constant-external-id",
            makeNestedSubLStmt("find-constant", constantName)));
    return CycObjectFactory.makeGuid(getConverse().converseString(command));
  }

  /**
   * Gets a <tt>DefaultCycAssertion</tt> by using its ID.
   *
   * @param id the id of the <tt>DefaultCycAssertion</tt> sought
   *
   * @return the <tt>DefaultCycAssertion</tt> if found or <tt>null</tt> if not found
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public DefaultCycAssertion getAssertionById(Integer id)
          throws CycConnectionException, com.cyc.base.CycApiException {
    final String command = makeSubLStmt("find-assertion-by-id", id);
    Object obj = getConverse().converseObject(command);

    if (obj.equals(new CycSymbol("NIL"))) {
      return null;
    } else if (!(obj instanceof DefaultCycAssertion)) {
      throw new RuntimeException(obj + " is not a CycAssertion");
    } else {
      return (DefaultCycAssertion) obj;
    }
  }

  /**
   * Gets the name for the given constant guid.
   *
   * @param guid the guid of the constant object for which the name is sought
   *
   * @return the name for the given CycConstant
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public String getConstantName(Guid guid)
          throws CycConnectionException, com.cyc.base.CycApiException {
    // Optimized for the binary api.

    String command = makeSubLStmt("constant-name",
            makeNestedSubLStmt("find-constant-by-external-id",
            makeNestedSubLStmt("string-to-guid"), guid.toString()));

    return getConverse().converseString(command);
  }

  /**
   * Gets a known CycConstant by using its GUID string.
   *
   * @param guidString the globally unique ID string of the constant to be instantiated
   *
   * @return the complete <tt>CycConstant</tt> if found, otherwise throw an exception
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstant getKnownConstantByGuid(String guidString)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycGuid guid = CycObjectFactory.makeGuid(guidString);

    return getKnownConstantByGuid(guid);
  }

  /**
   * Gets a known CycConstant by using its GUID.
   *
   * @param guid the globally unique ID of the constant to be instantiated
   *
   * @return the complete <tt>CycConstant</tt> if found, otherwise throw an exception
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstant getKnownConstantByGuid(Guid guid)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycConstant cycConstant = getConstantByGuid(guid);

    if (cycConstant == null) {
      throw new com.cyc.base.CycApiException("Expected constant not found " + guid);
    }

    return cycConstant;
  }

  /**
   * Gets a CycConstant by using its GUID.
   *
   * @param guid the GUID from which to find the constant
   *
   * @return the complete <tt>CycConstant</tt> if found, otherwise return <tt>null</tt>
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstant getConstantByGuid(Guid guid)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycConstant answer = CycObjectFactory.getCycConstantCacheByGuid(
            guid);
    if (answer != null) {
      return answer;
    }
    final String command =
            makeSubLStmt("find-constant-by-external-id",
            makeNestedSubLStmt("string-to-guid", guid.getGuidString()));
    final Object answerObject = getConverse().converseObject(command);
    if (answerObject instanceof CycConstant) {
      answer = (CycConstant) answerObject;
      CycObjectFactory.addCycConstantCache(answer);
      return answer;
    }
    return null;
  }
  
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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getArg2s(String predicate, String arg1, String mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getArg2s(getKnownConstantByName(predicate),
            getKnownConstantByName(arg1),
            getKnownConstantByName(mt));
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getArg2s(String predicate, Fort arg1, CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getArg2s(getKnownConstantByName(predicate), arg1, makeELMt_inner(mt));
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getArg2s(Fort predicate, Fort arg1, CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {

    CycVariable variable = CycObjectFactory.makeCycVariable("?arg2");
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            predicate, arg1, variable);

    return getCyc().getInferenceTool().queryVariable(variable, query, makeELMt_inner(mt));
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Object getArg2(String predicate, String arg1, String mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getArg2(getKnownConstantByName(predicate),
            getKnownConstantByName(arg1),
            getKnownConstantByName(mt));
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Object getArg2(String predicate, Fort arg1, CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getArg2(getKnownConstantByName(predicate), arg1, makeELMt_inner(mt));
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Object getArg2(Fort predicate, Fort arg1, CycObject mt)
          throws CycConnectionException, CycApiException {

    CycVariableI variable = CycObjectFactory.makeCycVariable("?arg2");
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            predicate, arg1, variable);
    final DefaultInferenceParameters params = new DefaultInferenceParameters(
            getCyc());
    params.setMaxNumber(1);
    CycList answer = getCyc().getInferenceTool().queryVariable(variable, query, makeELMt_inner(mt), params);

    if (answer.size() > 0) {
      return answer.get(0);
    } else {
      return null;
    }
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Object getAssertionArg2(String predicate, String arg1, String mt)
          throws CycConnectionException, CycApiException {
    return getAssertionArg2(getKnownConstantByName(predicate),
            getKnownConstantByName(arg1),
            getKnownConstantByName(mt));
  }

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
   * @throws com.cyc.base.CycConnectionException
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Object getAssertionArg2(Fort predicate, Fort arg1, CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseObject(makeSubLStmt(FPRED_VALUE_IN_MT, arg1, predicate,
            makeELMt_inner(mt)));
  }

  /**
   * Returns the first arg1 term from gafs having the specified predicate and arg2 values.
   *
   * @param predicate the given predicate
   * @param arg2 the given arg2 term
   * @param mt the inference microtheory
   *
   * @return the first arg1 term from gafs having the specified predicate and arg2 values
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Object getArg1(String predicate, String arg2, String mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getArg1(getKnownConstantByName(predicate),
            getKnownConstantByName(arg2),
            getKnownConstantByName(mt));
  }

  /**
   * Returns the first arg1 term from gafs having the specified predicate and arg2 values.
   *
   * @param predicate the given predicate
   * @param arg2 the given arg2 term
   * @param mt the inference microtheory
   *
   * @return the first arg1 term from gafs having the specified predicate and arg2 values
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Object getArg1(Fort predicate, DenotationalTerm arg2,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycList answer = getArg1s(predicate, arg2, makeELMt_inner(mt));
    if (answer.size() > 0) {
      return answer.get(0);
    } else {
      return null;
    }
  }

  /**
   * Returns the list of arg1 terms from gafs having the specified predicate and arg2 values.
   *
   * @param predicate the given predicate
   * @param arg2 the given arg2 term
   * @param mt the inference microtheory
   *
   * @return the list of arg1 terms from gafs having the specified predicate and arg2 values
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getArg1s(String predicate, String arg2, String mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getArg1s(getKnownConstantByName(predicate),
            getKnownConstantByName(arg2),
            getKnownConstantByName(mt));
  }

  /**
   * Returns the list of arg1 terms from gafs having the specified predicate and arg2 values.
   *
   * @param predicate the given predicate
   * @param arg2 the given arg2 term
   * @param mt the inference microtheory
   *
   * @return the list of arg1 terms from gafs having the specified predicate and arg2 values
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getArg1s(Fort predicate, DenotationalTerm arg2,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {

    CycVariable variable = CycObjectFactory.makeCycVariable("?arg1");
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            predicate, variable, arg2);

    return getCyc().getInferenceTool().queryVariable(variable, query, makeELMt_inner(mt));
  }
  
    /**
   * Returns the list of assertions contained in the given mt.
   *
   * @param mt the given microtheory
   *
   * @return the list of assertions contained in the given mt
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getAllAssertionsInMt(CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList(makeSubLStmt("gather-mt-index", mt));
  }

  /**
   * Returns the list of Cyc terms whose denotation matches the given English string.
   *
   * @param denotationString the given English denotation string
   *
   * @return the list of Cyc terms whose denotation matches the given English string
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getDenotsOfString(String denotationString)
          throws CycConnectionException, CycApiException {
    String command = makeSubLStmt("denots-of-string", denotationString);
    return getConverse().converseList(command);
  }

  /**
   * Returns the list of Cyc terms whose denotation matches the given English string and which are
   * instances of any of the given collections.
   *
   * @param denotationString the given English denotation string
   * @param collections the given list of collections
   *
   * @return the list of Cyc terms whose denotation matches the given English string
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getDenotsOfString(String denotationString, CycList collections)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycList setArgs = collections.addToBeginning(new CycConstant("TheSet", new Guid("bd58e476-9c29-11b1-9dad-c379636f7270")));
    CycNaut collectionUnion = new CycNaut(new CycConstant("CollectionUnionFn", new Guid("beb84af8-9c29-11b1-9dad-c379636f7270")), setArgs);
    String command = makeSubLStmt("typed-denots-of-string", denotationString, collectionUnion);
    return getConverse().converseList(command);
  }

  /**
   * Returns the list of Cyc terms whose denotation matches the given English multi-word string.
   *
   * @deprecated use getDenotsOfString instead
   *
   * @param multiWordDenotationString the given English denotation multi-word string
   *
   * @return the list of Cyc terms whose denotation matches the given English multi-word string
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Deprecated
  public CycList getMWSDenotsOfString(CycList multiWordDenotationString)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = makeSubLStmt("mws-denots-of-string",
            multiWordDenotationString);
    return getConverse().converseList(command);
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Deprecated
  public CycList getMWSDenotsOfString(CycList multiWordDenotationString,
          CycList collections)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = makeSubLStmt("mws-denots-of-string",
            multiWordDenotationString);

    CycList terms = getConverse().converseList(command);
    CycArrayList result = new CycArrayList();
    Iterator collectionsIterator = collections.iterator();

    while (collectionsIterator.hasNext()) {
      CycFort oneCollection = (CycFort) collectionsIterator.next();
      Iterator termsIter = terms.iterator();

      while (termsIter.hasNext()) {
        CycFort term = (CycFort) termsIter.next();

        if (getCyc().getInspectorTool().isa(term, oneCollection)) {
          result.add(term);
        }
      }
    }

    return result;
  }

  /** Returns the external ID for the given Cyc object.
   *
   * @deprecated Should be replaced in favor of {@link DefaultCycObject#toCompactExternalId(Object, CycAccess)}
   * @param cycObject the Cyc object
   * @return the external ID string
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Deprecated
  @Override
  public String getExternalIDString(final CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return DefaultCycObject.toCompactExternalId(cycObject, getCyc());
  }

  /**
   * Gets the comment for a CycFort. Embedded quotes are replaced by spaces.
   *
   * @param cycObject the term for which the comment is sought
   *
   * @return the comment for the given CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public String getComment(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (cycObject instanceof CycArrayList) {
      return null;
    }
    String script = "(clet ((comment-string \n" + "         (with-all-mts (comment "
            + cycObject.stringApiValue() + ")))) \n" + "  (fif comment-string \n"
            + "       (string-substitute \" \" \"\\\"\" comment-string) \n"
            + "       \"\"))";

    return getConverse().converseString(script);
  }

  /**
   * Gets the comment for a CycFort in the relevant mt. Embedded quotes are replaced by spaces.
   *
   * @param cycObject the term for which the comment is sought
   * @param mt the relevant mt from which the comment is visible
   *
   * @return the comment for the given CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public String getComment(final CycObject cycObject,
          final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    String script =
            "(clet ((comment-string \n"
            + "         (comment " + cycObject.stringApiValue() + " " +  makeELMt_inner(
            mt).stringApiValue() + "))) \n"
            + "  (fif comment-string \n"
            + "       (string-substitute \" \" \"\\\"\" comment-string) \n"
            + "       \"\"))";

    return getConverse().converseString(script);
  }

  /**
   * Gets the list of the isas for the given CycFort.
   *
   * @param cycObject the term for which its isas are sought
   *
   * @return the list of the isas for the given CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getIsas(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseList("(remove-duplicates (with-all-mts (isa " + cycObject.stringApiValue()
            + ")))");
  }

  /**
   * Gets the list of the isas for the given CycFort.
   *
   * @param cycObject the term for which its isas are sought
   * @param mt the relevant mt
   *
   * @return the list of the isas for the given CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getIsas(final CycObject cycObject,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseList("(isa " + cycObject.stringApiValue()
            + " " +  makeELMt_inner(mt).stringApiValue()
            + ")");
  }

  /**
   * Gets the list of the directly asserted true genls for the given CycFort collection.
   *
   * @param cycObject the given term
   *
   * @return the list of the directly asserted true genls for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getGenls(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseList("(remove-duplicates (with-all-mts (genls " + cycObject.stringApiValue()
            + ")))");
  }

  /**
   * Gets the list of the directly asserted true genls for the given CycFort collection.
   *
   * @param cycObject the given term
   * @param mt the relevant mt
   *
   * @return the list of the directly asserted true genls for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getGenls(final CycObject cycObject,
          final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseList("(genls " + cycObject.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the minimum (most specific) genls for a CycFort collection.
   *
   * @param cycFort the given collection term
   *
   * @return a list of the minimum (most specific) genls for a CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMinGenls(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (min-genls "
            + cycFort.stringApiValue() + ")))");
  }

  /**
   * Gets a list of the minimum (most specific) genls for a CycFort collection.
   *
   * @param cycFort the collection
   * @param mt the microtheory in which to look
   *
   * @return a list of the minimum (most specific) genls for a CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMinGenls(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(min-genls " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the directly asserted true specs for the given CycFort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the directly asserted true specs for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getSpecs(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (specs " + cycFort.stringApiValue()
            + ")))");
  }

  /**
   * Gets the list of the directly asserted true specs for the given CycFort collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the directly asserted true specs for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getSpecs(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(specs " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the least specific specs for the given CycFort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the least specific specs for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMaxSpecs(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (max-specs "
            + cycFort.stringApiValue() + ")))");
  }

  /**
   * Gets the list of the least specific specs for the given CycFort collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the least specific specs for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMaxSpecs(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(max-specs " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the direct genls of the direct specs for the given CycFort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the direct genls of the direct specs for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getGenlSiblings(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (genl-siblings "
            + cycFort.stringApiValue() + ")))");
  }

  /**
   * Gets the list of the direct genls of the direct specs for the given CycFort collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the direct genls of the direct specs for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getGenlSiblings(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(genl-siblings " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the siblings (direct specs of the direct genls) for the given CycFort
   * collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the siblings (direct specs of the direct genls) for the given CycFort
   * collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getSiblings(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getSpecSiblings(cycFort);
  }

  /**
   * Gets the list of the siblings (direct specs of the direct genls) for the given CycFort
   * collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the siblings (direct specs of the direct genls) for the given CycFort
   * collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getSiblings(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getSpecSiblings(cycFort,
            mt);
  }

  /**
   * Gets the list of the siblings (direct specs of the direct genls) for the given CycFort
   * collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the siblings (direct specs of the direct genls) for the given CycFort
   * collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getSpecSiblings(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (spec-siblings "
            + cycFort.stringApiValue() + ")))");
  }

  /**
   * Gets the list of the siblings (direct specs of the direct genls) for the given CycFort
   * collection.
   *
   * @param cycFort the given collection
   * @param mt the microtheory in which to look
   *
   * @return the list of the siblings (direct specs of the direct genls) for the given CycFort
   * collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getSpecSiblings(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(spec-siblings " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of all of the direct and indirect genls for the given CycFort collection.
   *
   * @param cycFort the collection
   *
   * @return the list of all of the direct and indirect genls for a CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllGenls(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-genls-in-any-mt " + cycFort.stringApiValue() + ")");
  }

  /**
   * Gets the list of all of the direct and indirect genls for a CycFort collection given a
   * relevant microtheory.
   *
   * @param cycObject the collection
   * @param mt the relevant mt
   *
   * @return the list of all of the direct and indirect genls for a CycFort collection given a
   * relevant microtheory
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllGenls(CycObject cycObject,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseList("(all-genls " + cycObject.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of all of the direct and indirect specs for a CycFort collection.
   *
   * @param cycFort the collection
   *
   * @return the list of all of the direct and indirect specs for the given collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllSpecs(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (all-specs "
            + cycFort.stringApiValue() + ")))");
  }

  /**
   * Gets the list of all of the direct and indirect specs for the given collection in the given
   * microtheory.
   *
   * @param cycFort the collection
   * @param mt the microtheory
   *
   * @return the list of all of the direct and indirect specs for the given collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllSpecs(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-specs " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of all of the direct and indirect genls for a CycFort SPEC which are also specs
   * of CycFort GENL.
   *
   * @param spec the given collection
   * @param genl the more general collection
   *
   * @return the list of all of the direct and indirect genls for a CycFort SPEC which are also
   * specs of CycFort GENL
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllGenlsWrt(Fort spec,
          Fort genl)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (all-genls-wrt "
            + spec.stringApiValue() + " " + genl.stringApiValue() + ")))");
  }

  /**
   * Gets the list of all of the direct and indirect genls for a CycFort SPEC which are also specs
   * of CycFort GENL.
   *
   * @param spec the given collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the list of all of the direct and indirect genls for a CycFort SPEC which are also
   * specs of CycFort GENL
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllGenlsWrt(Fort spec,
          Fort genl,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-genls-wrt " + spec.stringApiValue() + " " + genl.stringApiValue()
            + " " + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of all of the dependent specs for a CycFort collection. Dependent specs are
   * those direct and indirect specs of the collection such that every path connecting the spec to
   * a genl of the collection passes through the collection. In a typical taxomonmy it is
   * expected that all-dependent-specs gives the same result as all-specs.
   *
   * @param cycFort the given collection
   *
   * @return the list of all of the dependent specs for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllDependentSpecs(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (all-dependent-specs "
            + cycFort.stringApiValue() + ")))");
  }

  /**
   * Gets the list of all of the dependent specs for a CycFort collection. Dependent specs are
   * those direct and indirect specs of the collection such that every path connecting the spec to
   * a genl of the collection passes through the collection. In a typical taxomonmy it is
   * expected that all-dependent-specs gives the same result as all-specs.
   *
   * @param cycFort the given collection
   * @param mt the relevant mt
   *
   * @return the list of all of the dependent specs for the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllDependentSpecs(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-dependent-specs " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of all KB assertions for an indexed term.
   *
   * @param cycFort the given indexed term
   *
   * @return the list of all DefaultCycAssertions for the term
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public List<CycAssertion> getAllTermAssertions(Fort cycFort) throws CycConnectionException, com.cyc.base.CycApiException {
    final String command = SubLAPIHelper.makeSubLStmt("all-term-assertions",
            cycFort);
    return getConverse().converseList(command);
  }

  /**
   * Gets the list with the specified number of sample specs of the given CycFort collection.
   * Attempts to return leaves that are maximally differet with regard to their all-genls.
   *
   * @param cycFort the given collection
   * @param numberOfSamples the maximum number of sample specs returned
   *
   * @return the list with the specified number of sample specs of the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getSampleLeafSpecs(Fort cycFort,
          int numberOfSamples)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(with-all-mts (sample-leaf-specs " + cycFort.stringApiValue() + " "
            + numberOfSamples + "))");
  }

  /**
   * Gets the list with the specified number of sample specs of the given CycFort collection.
   * Attempts to return leaves that are maximally differet with regard to their all-genls.
   *
   * @param cycFort the given collection
   * @param numberOfSamples the maximum number of sample specs returned
   * @param mt the relevant mt
   *
   * @return the list with the specified number of sample specs of the given CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getSampleLeafSpecs(Fort cycFort,
          int numberOfSamples,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(sample-leaf-specs " + cycFort.stringApiValue() + " " + numberOfSamples
            + " " + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Returns the single most specific collection from the given list of collectons.
   *
   * @param collections the given collections
   *
   * @return the single most specific collection from the given list of collectons
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycFort getMinCol(final CycList collections)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return (CycFort) getConverse().converseObject("(with-all-mts (min-col " + collections.stringApiValue()
            + "))");
  }

  /**
   * Returns the single most specific collection from the given list of collectons.
   *
   * @param collections the given collections
   * @param mt the relevant mt
   *
   * @return the single most specific collection from the given list of collectons
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycFort getMinCol(final CycList collections, final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (collections == null) {
      throw new NullPointerException("collections must not be null");
    }
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return (CycFort) getConverse().converseObject("(with-inference-mt-relevance " + makeELMt_inner(
            mt).stringApiValue()
            + " (min-col " + collections.stringApiValue() + "))");
  }

  /**
   * Returns the most general collections from the given list of collectons.
   *
   * @param collections the given collections
   *
   * @return the most general collections from the given list of collectons
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMaxCols(final CycList collections)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    assert collections != null : "collections cannot be null";

    return getConverse().converseList("(with-all-mts (max-cols " + collections.stringApiValue()
            + "))");
  }

  /**
   * Returns the most general collections from the given list of collectons.
   *
   * @param collections the given collections
   * @param mt the inference microtheory
   *
   * @return the most general collections from the given list of collectons
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMaxCols(final CycList collections, final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (collections == null) {
      throw new NullPointerException("collections must not be null");
    }
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseList("(with-inference-mt-relevance " + makeELMt_inner(mt).stringApiValue() + " (max-cols " + collections.stringApiValue()
            + "))");
  }

  /**
   * Returns the most specific collections from the given list of collectons.
   *
   * @param collections the given collections
   *
   * @return the most specific collections from the given list of collectons
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMinCols(final CycList collections)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    assert collections != null : "collections cannot be null";

    return getConverse().converseList("(with-all-mts (min-cols " + collections.stringApiValue()
            + "))");
  }

  /**
   * Returns the most specific collections from the given list of collectons.
   *
   * @param collections the given collections
   * @param mt the inference microtheory
   *
   * @return the most specific collections from the given list of collectons
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMinCols(final CycList collections, final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (collections == null) {
      throw new NullPointerException("collections must not be null");
    }
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseList("(with-inference-mt-relevance " + makeELMt_inner(mt).stringApiValue()
            + " (min-cols " + collections.stringApiValue() + "))");
  }

  /**
   * Gets the list of the justifications of why CycFort SPEC is a SPEC of CycFort GENL.
   * getWhyGenl("Dog", "Animal") --> "(((#$genls #$Dog #$CanineAnimal) :TRUE) (#$genls
   * #$CanineAnimal #$NonPersonAnimal) :TRUE) (#$genls #$NonPersonAnimal #$Animal) :TRUE))
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   *
   * @return the list of the justifications of why CycFort SPEC is a SPEC of CycFort GENL
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getWhyGenl(Fort spec,
          Fort genl)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(with-all-mts (why-genl? " + spec.stringApiValue() + " "
            + genl.stringApiValue() + "))");
  }

  /**
   * Gets the list of the justifications of why CycFort SPEC is a SPEC of CycFort GENL.
   * getWhyGenl("Dog", "Animal") --> "(((#$genls #$Dog #$CanineAnimal) :TRUE) (#$genls
   * #$CanineAnimal #$NonPersonAnimal) :TRUE) (#$genls #$NonPersonAnimal #$Animal) :TRUE))
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the list of the justifications of why CycFort SPEC is a SPEC of CycFort GENL
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getWhyGenl(Fort spec,
          Fort genl,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(why-genl? " + spec.stringApiValue() + " " + genl.stringApiValue()
            + " " + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the English parapharse of the justifications of why CycFort SPEC is a SPEC of CycFort
   * GENL. getWhyGenlParaphrase("Dog", "Animal") --> "a dog is a kind of canine" "a canine is a
   * kind of non-human animal" "a non-human animal is a kind of animal"
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   *
   * @return the English parapharse of the justifications of why CycFort SPEC is a SPEC of CycFort
   * GENL
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public List getWhyGenlParaphrase(Fort spec,
          Fort genl)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycList listAnswer = getConverse().converseList("(with-all-mts (why-genl? " + spec.stringApiValue() + " "
            + genl.stringApiValue() + "))");
    List answerPhrases = new ArrayList();

    if (listAnswer.size() == 0) {
      return answerPhrases;
    }

    CycList iter = listAnswer;

    Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);
    for (int i = 0; i < listAnswer.size(); i++) {
      CycList assertion = (CycList) ((CycList) listAnswer.get(
              i)).first();
      answerPhrases.add(p.paraphrase(assertion).getString());
    }

    return answerPhrases;
  }

  /**
   * Gets the English parapharse of the justifications of why CycFort SPEC is a SPEC of CycFort
   * GENL. getWhyGenlParaphrase("Dog", "Animal") --> "a dog is a kind of canine" "a canine is a
   * kind of non-human animal" "a non-human animal is a kind of animal"
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the English parapharse of the justifications of why CycFort SPEC is a SPEC of CycFort
   * GENL
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public List getWhyGenlParaphrase(Fort spec,
          Fort genl,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycList listAnswer = getConverse().converseList("(why-genl? " + spec.stringApiValue() + " "
            + genl.stringApiValue() + " "
            + getCyc().getObjectTool().makeELMt(mt).stringApiValue() + ")");
    List answerPhrases = new ArrayList();

    if (listAnswer.size() == 0) {
      return answerPhrases;
    }

    CycList iter = listAnswer;

    Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);
    for (int i = 0; i < listAnswer.size(); i++) {
      CycList assertion = (CycList) ((CycList) listAnswer.get(
              i)).first();
      answerPhrases.add(p.paraphrase(assertion).getString());
    }

    return answerPhrases;
  }

  /**
   * Gets the list of the justifications of why CycFort COLLECTION1 and a CycFort COLLECTION2
   * intersect. see getWhyGenl
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   *
   * @return the list of the justifications of why CycFort COLLECTION1 and a CycFort COLLECTION2
   * intersect
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getWhyCollectionsIntersect(Fort collection1,
          Fort collection2)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList(
            "(with-all-mts (why-collections-intersect? "
            + collection1.stringApiValue() + " " + collection2.stringApiValue() + "))");
  }

  /**
   * Gets the list of the justifications of why CycFort COLLECTION1 and a CycFort COLLECTION2
   * intersect. see getWhyGenl
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   * @param mt the relevant mt
   *
   * @return the list of the justifications of why CycFort COLLECTION1 and a CycFort COLLECTION2
   * intersect
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getWhyCollectionsIntersect(Fort collection1,
          Fort collection2,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(why-collections-intersect? " + collection1.stringApiValue() + " "
            + collection2.stringApiValue() + " " + makeELMt_inner(
            mt).stringApiValue() + ")");
  }

  /**
   * Gets the English parapharse of the justifications of why CycFort COLLECTION1 and a CycFort
   * COLLECTION2 intersect. see getWhyGenlParaphrase
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   *
   * @return the English parapharse of the justifications of why CycFort COLLECTION1 and a CycFort
   * COLLECTION2 intersect
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public List getWhyCollectionsIntersectParaphrase(Fort collection1,
          Fort collection2)
          throws CycConnectionException,
          com.cyc.base.CycApiException {
    CycList listAnswer = getConverse().converseList("(with-all-mts (why-collections-intersect? "
            + collection1.stringApiValue() + " "
            + collection2.stringApiValue() + "))");
    List answerPhrases = new ArrayList();

    if (listAnswer.size() == 0) {
      return answerPhrases;
    }

    CycList iter = listAnswer;
    Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);

    for (int i = 0; i < listAnswer.size(); i++) {
      CycList assertion = (CycList) ((CycList) listAnswer.get(
              i)).first();


      //Log.current.println("assertion: " + assertion);
      answerPhrases.add(p.paraphrase(assertion).getString());
    }

    return answerPhrases;
  }

  /**
   * Gets the English parapharse of the justifications of why CycFort COLLECTION1 and a CycFort
   * COLLECTION2 intersect. see getWhyGenlParaphrase
   *
   * @param collection1 the first collection
   * @param collection2 the second collection
   * @param mt the relevant mt
   *
   * @return the English parapharse of the justifications of why CycFort COLLECTION1 and a CycFort
   * COLLECTION2 intersect
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public List getWhyCollectionsIntersectParaphrase(Fort collection1,
          Fort collection2,
          CycObject mt)
          throws CycConnectionException,
          com.cyc.base.CycApiException {
    CycList listAnswer = getConverse().converseList("(with-all-mts (why-collections-intersect? "
            + collection1.stringApiValue() + " "
            + collection2.stringApiValue() + " "
            + getCyc().getObjectTool().makeELMt(mt).stringApiValue() + ")");
    List answerPhrases = new ArrayList();

    if (listAnswer.size() == 0) {
      return answerPhrases;
    }

    CycList iter = listAnswer;
    Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);

    for (int i = 0; i < listAnswer.size(); i++) {
      CycList assertion = (CycList) ((CycList) listAnswer.get(
              i)).first();


      //Log.current.println("assertion: " + assertion);
      answerPhrases.add(p.paraphrase(assertion).getString());
    }

    return answerPhrases;
  }

  /**
   * Gets the list of the collection leaves (most specific of the all-specs) for a CycFort
   * collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the collection leaves (most specific of the all-specs) for a CycFort
   * collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getCollectionLeaves(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList(
            "(with-all-mts (collection-leaves " + cycFort.stringApiValue() + "))");
  }

  /**
   * Gets the list of the collection leaves (most specific of the all-specs) for a CycFort
   * collection.
   *
   * @param cycFort the given collection
   * @param mt the relevant mt
   *
   * @return the list of the collection leaves (most specific of the all-specs) for a CycFort
   * collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getCollectionLeaves(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(collection-leaves " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the collections asserted to be disjoint with a CycFort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the collections asserted to be disjoint with a CycFort collection
   *
   * @throws IOException if a communication error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getLocalDisjointWith(CycObject cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList(
            "(with-all-mts (local-disjoint-with " + cycFort.stringApiValue() + "))");
  }

  /**
   * Gets the list of the collections asserted to be disjoint with a CycFort collection.
   *
   * @param cycFort the given collection
   * @param mt the relevant mt
   *
   * @return the list of the collections asserted to be disjoint with a CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getLocalDisjointWith(CycObject cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(local-disjoint-with " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the most specific collections (having no subsets) which contain a CycFort
   * term.
   *
   * @param cycFort the given term
   *
   * @return the list of the most specific collections (having no subsets) which contain a CycFort
   * term
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMinIsas(CycObject cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList(
            "(with-all-mts (min-isa " + cycFort.stringApiValue() + "))");
  }

  /**
   * Gets the list of the most specific collections (having no subsets) which contain a CycFort
   * term.
   *
   * @param cycFort the given term
   * @param mt the relevant mt
   *
   * @return the list of the most specific collections (having no subsets) which contain a CycFort
   * term
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getMinIsas(CycObject cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(min-isa " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the asserted instances of a CycFort collection.
   *
   * @param cycFort the given collection
   *
   * @return the list of the instances (who are individuals) of a CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getInstances(CycObject cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycList result = getConverse().converseList(
            "(with-all-mts (instances " + cycFort.stringApiValue() + "))");
    return result;
  }

  /**
   * Gets the list of the asserted instances of a CycFort collection.
   *
   * @param cycFort the given collection
   * @param mt the relevant mt
   *
   * @return the list of the instances (who are individuals) of a CycFort collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getInstances(CycObject cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(instances " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the instance siblings of a CycFort, for all collections of which it is an
   * instance.
   *
   * @param cycFort the given term
   *
   * @return the list of the instance siblings of a CycFort, for all collections of which it is an
   * instance
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getInstanceSiblings(CycObject cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList(
            "(with-all-mts (instance-siblings " + cycFort.stringApiValue() + "))");
  }

  /**
   * Gets the list of the instance siblings of a CycFort, for all collections of which it is an
   * instance.
   *
   * @param cycFort the given term
   * @param mt the relevant mt
   *
   * @return the list of the instance siblings of a CycFort, for all collections of which it is an
   * instance
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if an error is returned by the Cyc server
   */
  @Override
  public CycList getInstanceSiblings(CycObject cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(instance-siblings " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the collections of which the CycFort is directly and indirectly an instance.
   *
   * @param cycFort the given term
   *
   * @return the list of the collections of which the CycFort is directly and indirectly an
   * instance
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllIsa(CycObject cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = "(all-isa-in-any-mt " + cycFort.stringApiValue() + ")";
    CycList result = getConverse().converseList(command);
    return result;
  }

  /**
   * Gets the list of the collections of which the CycFort is directly and indirectly an instance.
   *
   * @param cycFort the given term
   * @param mt the relevant mt
   *
   * @return the list of the collections of which the CycFort is directly and indirectly an
   * instance
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllIsa(CycObject cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-isa " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of all the direct and indirect instances (individuals) for a CycFort collection.
   *
   * @param cycFort the collection for which all the direct and indirect instances (individuals)
   * are sought
   *
   * @return the list of all the direct and indirect instances (individuals) for the given
   * collection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllInstances(CycObject cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList(
            "(all-instances-in-all-mts " + cycFort.stringApiValue() + ")");
  }

  /**
   * Gets a list of all the direct and indirect instances for a CycFort collection in
   * the given microtheory.
   *
   * @param cycFort the collection for which all the direct and indirect instances are sought
   * @param mt the relevant mt
   *
   * @return the list of all the direct and indirect instances for the
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error given collection
   */
  @Override
  public CycList getAllInstances(CycObject cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-instances " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of all the direct and indirect quoted instances for a CycFort collection in
   * the given microtheory.
   *
   * @param cycFort the collection for which all the direct and indirect quoted instances are sought
   * @param mt the relevant mt
   *
   * @return the list of all the direct and indirect quoted instances for the CycFort collection in
   * the given microtheory
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error given collection
   */
  @Override
  public CycList getAllQuotedInstances(final CycObject cycFort,
          final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getAllQuotedInstances(cycFort, mt, 0);
  }

  /**
   * Gets a list of all the direct and indirect quoted instances for a CycFort collection in
   * the given microtheory.
   *
   * @param cycFort the collection for which all the direct and indirect quoted instances are sought
   * @param mt the relevant mt
   *
   * @return the list of all the direct and indirect quoted instances for the CycFort collection in
   * the given microtheory
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error given collection
   * @throws CycTimeOutException if the calculation times out
   */
  @Override
  public CycList getAllQuotedInstances(final CycObject cycFort,
          final CycObject mt,
          final long timeoutMsecs)
          throws CycConnectionException, com.cyc.base.CycApiException, CycTimeOutException {
    final CycVariable queryVariable = CycObjectFactory.makeCycVariable(
            "?QUOTED-INSTANCE");
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            getKnownConstantByName("quotedIsa"), queryVariable, cycFort);
    return getCyc().getInferenceTool().queryVariable(queryVariable, query, makeELMt_inner(mt), null, timeoutMsecs);
  }


  /**
   * Gets the list of the justifications of why CycFort TERM is an instance of CycFort COLLECTION.
   * getWhyIsa("Brazil", "Country") --> "(((#$isa #$Brazil #$IndependentCountry) :TRUE) (#$genls
   * #$IndependentCountry #$Country) :TRUE))
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   *
   * @return the list of the justifications of why CycFort TERM is an instance of CycFort
   * COLLECTION
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getWhyIsa(CycObject spec,
          CycObject genl)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(with-all-mts (why-isa? " + spec.stringApiValue() + " "
            + genl.stringApiValue() + "))");
  }

  /**
   * Gets the list of the justifications of why CycFort TERM is an instance of CycFort COLLECTION.
   * getWhyIsa("Brazil", "Country") --> "(((#$isa #$Brazil #$IndependentCountry) :TRUE) (#$genls
   * #$IndependentCountry #$Country) :TRUE))
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the list of the justifications of why CycFort TERM is an instance of CycFort
   * COLLECTION
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getWhyIsa(CycObject spec,
          CycObject genl,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(why-isa? " + spec.stringApiValue() + " " + genl.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the English parapharse of the justifications of why CycFort TERM is an instance of
   * CycFort COLLECTION. getWhyGenlParaphase("Brazil", "Country") --> "Brazil is an independent
   * country" "an independent country is a kind of country"
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   *
   * @return the English parapharse of the justifications of why CycFort TERM is an instance of
   * CycFort COLLECTION
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public List getWhyIsaParaphrase(CycObject spec,
          CycObject genl)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = "(with-all-mts (why-isa? " + spec.stringApiValue() + " "
            + genl.stringApiValue() + "))";
    CycList listAnswer = getConverse().converseList(command);
    List answerPhrases = new ArrayList();

    if (listAnswer.size() == 0) {
      return answerPhrases;
    }
    Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);

    for (int i = 0; i < listAnswer.size(); i++) {
      CycList assertion = (CycList) ((CycList) listAnswer.get(
              i)).first();
      answerPhrases.add(p.paraphrase(assertion).getString());
    }

    return answerPhrases;
  }

  /**
   * Gets the English parapharse of the justifications of why CycFort TERM is an instance of
   * CycFort COLLECTION. getWhyGenlParaphase("Brazil", "Country") --> "Brazil is an independent
   * country" "an independent country is a kind of country"
   *
   * @param spec the specialized collection
   * @param genl the more general collection
   * @param mt the relevant mt
   *
   * @return the English parapharse of the justifications of why CycFort TERM is an instance of
   * CycFort COLLECTION
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public List getWhyIsaParaphrase(Fort spec,
          Fort genl,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = "(why-isa? " + spec.stringApiValue() + " " + genl.stringApiValue() + " "
            + getCyc().getObjectTool().makeELMt(mt).stringApiValue() + ")";
    CycList listAnswer = getConverse().converseList(command);
    List answerPhrases = new ArrayList();

    if (listAnswer.size() == 0) {
      return answerPhrases;
    }
    Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);

    for (int i = 0; i < listAnswer.size(); i++) {
      CycList assertion = (CycList) ((CycList) listAnswer.get(
              i)).first();
      answerPhrases.add(p.paraphrase(assertion).getString());
    }

    return answerPhrases;
  }

  /**
   * Gets the list of the genlPreds for a CycConstant predicate.
   *
   * @param predicate the given predicate term
   *
   * @return the list of the more general predicates for the given predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getGenlPreds(final CycObject predicate)
          throws CycConnectionException, com.cyc.base.CycApiException {
    if (predicate instanceof CycArrayList) {
      final String script =
              "(clet ((canonicalized-predicate (canonicalize-term " + predicate.stringApiValue() + ")))"
              + "  (pif (fort-p canonicalized-predicate)"
              + "    (remove-duplicates (with-all-mts (genl-predicates canonicalized-predicate)))"
              + "    nil))";
      return getConverse().converseList(script);
    } else {
      return getConverse().converseList("(remove-duplicates (with-all-mts (genl-predicates "
              + predicate.stringApiValue() + ")))");
    }
  }

  /**
   * Gets the list of the genlPreds for a CycConstant predicate.
   *
   * @param predicate the given predicate term
   * @param mt the relevant mt
   *
   * @return the list of the more general predicates for the given predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getGenlPreds(final CycObject predicate,
          final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    if (predicate instanceof CycArrayList) {
      final String script =
              "(clet ((canonicalized-predicate (canonicalize-term " + predicate.stringApiValue() + ")))"
              + "  (pif (fort-p canonicalized-predicate)"
              + "    (remove-duplicates (with-all-mts (genl-predicates canonicalized-predicate " + makeELMt_inner(
              mt).stringApiValue() + ")))"
              + "    nil))";
      return getConverse().converseList(script);
    } else {
      return getConverse().converseList("(genl-predicates " + predicate.stringApiValue() + " " + makeELMt_inner(
              mt).stringApiValue() + ")");
    }
  }

  /**
   * Gets the list of all of the genlPreds for a CycConstant predicate, using an upward closure.
   *
   * @param predicate the predicate for which all the genlPreds are obtained
   *
   * @return a list of all of the genlPreds for a CycConstant predicate, using an upward closure
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllGenlPreds(CycConstantI predicate)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (all-genl-predicates "
            + predicate.stringApiValue() + ")))");
  }

  /**
   * Gets the list of all of the genlPreds for a CycConstant predicate, using an upward closure.
   *
   * @param predicate the predicate for which all the genlPreds are obtained
   * @param mt the relevant mt
   *
   * @return a list of all of the genlPreds for a CycConstant predicate, using an upward closure
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllGenlPreds(CycConstantI predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-genl-predicates " + predicate.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of all of the direct and indirect specs-preds for the given predicate in all
   * microtheories.
   *
   * @param cycFort the predicate
   *
   * @return the list of all of the direct and indirect spec-preds for the given predicate in all
   * microtheories.
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllSpecPreds(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (all-spec-predicates "
            + cycFort.stringApiValue() + ")))");
  }

  /**
   * Gets the list of all of the direct and indirect specs-preds for the given predicate in the
   * given microtheory.
   *
   * @param cycFort the predicate
   * @param mt the microtheory
   *
   * @return the list of all of the direct and indirect spec-preds for the given predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllSpecPreds(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-spec-predicates " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of all of the direct and indirect specs-inverses for the given predicate in all
   * microtheories.
   *
   * @param cycFort the predicate
   *
   * @return the list of all of the direct and indirect spec-inverses for the given predicate in
   * all microtheories.
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllSpecInverses(Fort cycFort)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (all-spec-inverses "
            + cycFort.stringApiValue() + ")))");
  }

  /**
   * Gets the list of all of the direct and indirect specs-inverses for the given predicate in the
   * given microtheory.
   *
   * @param cycFort the predicate
   * @param mt the microtheory
   *
   * @return the list of all of the direct and indirect spec-inverses for the given predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllSpecInverses(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-spec-inverses " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of all of the direct and indirect specs-mts for the given microtheory in mt-mt
   * (currently #$UniversalVocabularyMt).
   *
   * @param mt the microtheory
   *
   * @return the list of all of the direct and indirect specs-mts for the given microtheory in
   * mt-mt (currently #$UniversalVocabularyMt)
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getAllSpecMts(CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(all-spec-mts " + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the arg1Isas for a CycConstant predicate.
   *
   * @param cycObject the predicate for which argument 1 contraints are sought.
   *
   * @return the list of the arg1Isas for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg1Isas(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseList("(remove-duplicates (with-all-mts (arg1-isa "
            + cycObject.stringApiValue() + ")))");
  }

  /**
   * Gets the list of the arg1Isas for a CycConstant predicate given an mt.
   *
   * @param predicate the predicate for which argument 1 contraints are sought.
   * @param mt the relevant microtheory
   *
   * @return the list of the arg1Isas for a CycConstant predicate given an mt
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg1Isas(final CycObject predicate,
          final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (predicate == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseList("(arg1-isa " + predicate.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the arg2Isas for a CycConstant predicate.
   *
   * @param cycObject the predicate for which argument 2 contraints are sought.
   *
   * @return the list of the arg2Isas for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg2Isas(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseList("(remove-duplicates (with-all-mts (arg2-isa "
            + cycObject.stringApiValue() + ")))");
  }

  /**
   * Gets the list of the arg2Isas for a CycConstant predicate given an mt.
   *
   * @param cycObject the predicate for which argument 2 contraints are sought.
   * @param mt the relevant microtheory
   *
   * @return the list of the arg2Isas for a CycConstant predicate given an mt
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg2Isas(CycObject cycObject,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
    }
    return getConverse().converseList("(arg2-isa " + cycObject.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the arg3Isas for a CycConstant predicate.
   *
   * @param predicate the predicate for which argument 3 contraints are sought.
   *
   * @return the list of the arg1Isas for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg3Isas(Fort predicate)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (arg3-isa "
            + predicate.stringApiValue() + ")))");
  }

  /**
   * Gets the list of the arg3Isas for a CycConstant predicate given an mt.
   *
   * @param predicate the predicate for which argument 3 contraints are sought.
   * @param mt the relevant microtheory
   *
   * @return the list of the arg1Isas for a CycConstant predicate given an mt
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg3Isas(Fort predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(arg3-isa " + predicate.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the arg4Isas for a CycConstant predicate.
   *
   * @param predicate the predicate for which argument 4 contraints are sought.
   *
   * @return the list of the arg4Isas for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg4Isas(Fort predicate)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (arg4-isa "
            + predicate.stringApiValue() + ")))");
  }

  /**
   * Gets the list of the arg4Isas for a CycConstant predicate given an mt.
   *
   * @param predicate the predicate for which argument 4 contraints are sought.
   * @param mt the relevant microtheory
   *
   * @return the list of the arg4Isas for a CycConstant predicate given an mt
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg4Isas(Fort predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(arg4-isa " + predicate.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the argNIsas for a CycConstant predicate.
   *
   * @param predicate the predicate for which argument N contraints are sought.
   * @param argPosition the argument position of argument N
   *
   * @return the list of the argNIsas for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArgNIsas(Fort predicate,
          int argPosition)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = "(remove-duplicates \n" + "  (with-all-mts \n" + "    (argn-isa "
            + predicate.stringApiValue() + " " + Integer.toString(
            argPosition) + ")))";

    return getConverse().converseList(command);
  }

  /**
   * Gets the list of the argNIsas for a CycConstant predicate given an mt.
   *
   * @param predicate the predicate for which argument contraints are sought.
   * @param argPosition the argument position of argument N
   * @param mt the relevant microtheory
   *
   * @return the list of the arg1Isas for a CycConstant predicate given an mt
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArgNIsas(Fort predicate,
          int argPosition,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = "(remove-duplicates \n" + "  (with-all-mts \n" + "    (argn-isa \n"
            + "      " + predicate.stringApiValue() + "      "
            + Integer.toString(argPosition) + "      " + makeELMt_inner(
            mt).stringApiValue()
            + ")))";

    return getConverse().converseList(command);
  }

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
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getInterArgIsa1_2s(Fort predicate)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = "(remove-duplicates \n" + "  (with-all-mts \n" + "    (inter-arg-isa1-2 "
            + predicate.stringApiValue() + ")))";

    return getConverse().converseList(command);
  }

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
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getInterArgIsa1_2s(Fort predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = "(remove-duplicates \n" + "  (with-all-mts \n" + "    (inter-arg-isa1-2 "
            + "      " + predicate.stringApiValue() + "      "
            + makeELMt_inner(mt).stringApiValue() + ")))";

    return getConverse().converseList(command);
  }

  /**
   * Gets the list of the interArgIsa1-2 isa constraints for arg2, given the predicate and arg1.
   *
   * @param predicate the predicate for interArgIsa1-2 contraints are sought.
   * @param arg1 the argument in position 1
   *
   * @return the list of the interArgIsa1-2 isa constraints for arg2, given the predicate and arg1
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getInterArgIsa1_2_forArg2(Fort predicate,
          Fort arg1)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycArrayList result = new CycArrayList();
    ListIterator constraintPairs = getInterArgIsa1_2s(predicate).listIterator();

    while (constraintPairs.hasNext()) {
      CycArrayList pair = (CycArrayList) constraintPairs.next();

      if (pair.first().equals(arg1)) {
        result.add(pair.second());
      }
    }

    return result;
  }

  /**
   * Gets the list of the interArgIsa1-2 isa constraints for arg2, given the predicate and arg1.
   *
   * @param predicate the predicate for interArgIsa1-2 contraints are sought.
   * @param arg1 the argument in position 1
   * @param mt the relevant inference microtheory
   *
   * @return the list of the interArgIsa1-2 isa constraints for arg2, given the predicate and arg1
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getInterArgIsa1_2_forArg2(Fort predicate,
          Fort arg1,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycArrayList result = new CycArrayList();
    ListIterator constraintPairs = getInterArgIsa1_2s(predicate,
            mt).listIterator();

    while (constraintPairs.hasNext()) {
      CycArrayList pair = (CycArrayList) constraintPairs.next();

      if (pair.first().equals(arg1)) {
        result.add(pair.second());
      }
    }

    return result;
  }

  /**
   * Gets the list of the resultIsa for a CycConstant function.
   *
   * @param function the given function term
   *
   * @return the list of the resultIsa for a CycConstant function
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getResultIsas(Fort function)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (result-isa "
            + function.stringApiValue() + ")))");
  }

  /**
   * Gets the list of the resultIsa for a CycConstant function.
   *
   * @param function the given function term
   * @param mt the relevant mt
   *
   * @return the list of the resultIsa for a CycConstant function
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getResultIsas(Fort function,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(result-isa " + function.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets the list of the argNGenls for a CycConstant predicate.
   *
   * @param predicate the given predicate term
   * @param argPosition the argument position for which the genls argument constraints are sought
   * (position 1 = first argument)
   *
   * @return the list of the argNGenls for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArgNGenls(Fort predicate,
          int argPosition)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(remove-duplicates (with-all-mts (argn-genl "
            + predicate.stringApiValue() + " " + argPosition + ")))");
  }

  /**
   * Gets the list of the argNGenls for a CycConstant predicate.
   *
   * @param predicate the given predicate term
   * @param argPosition the argument position for which the genls argument constraints are sought
   * (position 1 = first argument)
   * @param mt the relevant mt
   *
   * @return the list of the argNGenls for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArgNGenls(Fort predicate,
          int argPosition,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(argn-genl " + predicate.stringApiValue() + " " + argPosition + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the arg1Formats for a CycConstant predicate.
   *
   * @param cycObject the given predicate term
   *
   * @return a list of the arg1Formats for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg1Formats(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseList(
            "(with-all-mts (arg1-format " + cycObject.stringApiValue() + "))");
  }

  /**
   * Gets a list of the arg1Formats for a CycConstant predicate.
   *
   * @param cycObject the given predicate term
   * @param mt the relevant mt
   *
   * @return a list of the arg1Formats for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg1Formats(CycObject cycObject,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    return getConverse().converseList("(arg1-format " + cycObject.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the arg2Formats for a CycConstant predicate.
   *
   * @param cycObject the given predicate term
   *
   * @return a list of the arg2Formats for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg2Formats(final CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseList(
            "(with-all-mts (arg2-format " + cycObject.stringApiValue() + "))");
  }

  /**
   * Gets a list of the arg2Formats for a CycConstant predicate.
   *
   * @param cycObject the given predicate term
   * @param mt the relevant mt
   *
   * @return a list of the arg2Formats for a CycConstant predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg2Formats(final CycObject cycObject,
          final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    return getConverse().converseList("(arg2-format " + cycObject.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the disjointWiths for a CycFort.
   *
   * @param cycObject the given collection term
   *
   * @return a list of the disjointWiths for a CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getDisjointWiths(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    return getConverse().converseList("(remove-duplicates (with-all-mts (local-disjoint-with "
            + cycObject.stringApiValue() + ")))");
  }

  /**
   * Gets a list of the disjointWiths for a CycFort.
   *
   * @param cycFort the given collection term
   * @param mt the relevant mt
   *
   * @return a list of the disjointWiths for a CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getDisjointWiths(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getConverse().converseList("(local-disjoint-with " + cycFort.stringApiValue() + " "
            + makeELMt_inner(mt).stringApiValue() + ")");
  }

  /**
   * Gets a list of the coExtensionals for a CycFort. Limited to 120 seconds.
   *
   * @param cycObject the given collection term
   *
   * @return a list of the coExtensionals for a CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getCoExtensionals(CycObject cycObject)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getCoExtensionals(cycObject, 0);
  }

  /**
   * Gets a list of the coExtensionals for a CycFort. Limited to 120 seconds.
   *
   * @param cycObject the given collection term
   * @param timeoutMsecs the time to wait before giving up
   *
   * @return a list of the coExtensionals for a CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   * @throws CycTimeOutException if the calculation times out
   */
  @Override
  public CycList getCoExtensionals(CycObject cycObject, long timeoutMsecs)
          throws CycConnectionException, com.cyc.base.CycApiException, CycTimeOutException {
    return getCoExtensionals(cycObject, inferencePSC, timeoutMsecs);
  }

  /**
   * Gets a list of the coExtensionals for a CycFort. Limited to 120 seconds.
   *
   * @param cycObject the given collection term
   * @param mt the microtheory
   *
   * @return a list of the coExtensionals for a CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getCoExtensionals(CycObject cycObject, CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException, CycTimeOutException {
    return getCoExtensionals(cycObject, mt, 0);
  }

  /**
   * Gets a list of the coExtensionals for a CycFort.
   *
   * @param cycObject the given collection term
   * @param mt the relevant mt for inference
   *
   * @return a list of the coExtensionals for a CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getCoExtensionals(CycObject cycObject,
          CycObject mt, long timeoutMsecs)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    CycList answer = null;
    try {
      final String queryString =
              "(#$and"
              + "  (#$different  " + cycObject.cyclify() + " ?X) "
              + "  (#$or (#$coExtensional " + cycObject.cyclify() + " ?X) "
              + "    (#$coextensionalSetOrCollections " + cycObject.cyclify() + " ?X)))";
      final FormulaSentence query = getCyc().getObjectTool().makeCycSentence(queryString);
      final CycVariable queryVariable = CycObjectFactory.makeCycVariable("?X");
      answer = getCyc().getInferenceTool().queryVariable(queryVariable, query, makeELMt_inner(mt), null,
              timeoutMsecs);
    } catch (CycConnectionException e) {
      if (IOException.class.isInstance(e)) {
        Log.current.println("getCoExtensionals - ignoring:\n" + e.getMessage());
        return new CycArrayList();
      } else {
        throw e;
      }
    }

    return getCyc().getObjectTool().canonicalizeList(answer);
  }
  
    /**
   * Gets the CycNart object from a Cons object that lists the names of its functor and its
   * arguments.
   *
   * @param elCons the given list which names the functor and arguments
   *
   * @return a CycNart object from a Cons object that lists the names of its functor and its
   * arguments
   */
  @Override
  public CycNart getCycNartFromCons(CycList elCons) throws CycConnectionException {
    if (getCyc().getInspectorTool().isReifiableFunction((CycObject) (elCons.get(0)))) {
      return new CycNart(elCons);
    } else {
      return null;
    }
  }
  
  /* *
   * Gets the default generated phrase for a CycFort (intended for predicates).
   *
   * @param cycObject the predicate term for paraphrasing
   *
   * @return the default generated phrase for a CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  /*
  @Override
  public String getGeneratedPhrase(CycObject cycObject)
          throws CycConnectionException, com.cyc.baseclient.api.CycApiException {
    return getGeneratedPhrase(cycObject, true, null);
  }
  */
  
  /**
   * Gets a list of the public Cyc constants.
   *
   * @return a list of the public Cyc constants
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getPublicConstants()
          throws CycConnectionException, com.cyc.base.CycApiException {
    // #$PublicConstant
    return getKbSubset(getKnownConstantByGuid(
            "bd7abd90-9c29-11b1-9dad-c379636f7270"));
  }

  /**
   * Gets a list of the elements of the given CycKBSubsetCollection.
   *
   * @param cycKbSubsetCollection the given CycKBSubsetCollection
   *
   * @return a list of the elements of the given CycKBSubsetCollection
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getKbSubset(Fort cycKbSubsetCollection)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycList answer = getConverse().converseList("(ask-template '?X '(#$isa ?X "
            + cycKbSubsetCollection.stringApiValue() + ") #$EverythingPSC)");

    return getCyc().getObjectTool().canonicalizeList(answer);
  }

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
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getBackchainImplicationRules(CycConstantI predicate,
          CycList formula, CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    StringBuilder command = new StringBuilder();

    if (makeELMt_inner(mt).equals(inferencePSC) || makeELMt_inner(mt).equals(
            everythingPSC)) {
      command.append("(clet (backchain-rules formula) ");
      command.append("  (with-all-mts ");
      command.append("    (do-predicate-rule-index (rule ").
              append(predicate.stringApiValue()).
              append(" :pos nil :backward) ");
      command.append("       (csetq formula (assertion-el-formula rule)) ");
      command.append("       (pwhen (cand (eq (first formula) #$implies) ");
      command.append("                    (unify-el-possible ").
              append(formula.stringApiValue()).
              append(" ");
      command.append(
              "                                          (third formula))) ");
      command.append("         (cpush formula backchain-rules)))) ");
      command.append("   backchain-rules)");
    } else {
      command.append("(clet (backchain-rules formula) ");
      command.append("  (with-inference-mt-relevance ").
              append(makeELMt_inner(mt).stringApiValue()).
              append(" ");
      command.append("    (do-predicate-rule-index (rule ").
              append(predicate.stringApiValue()).
              append(" :pos nil :backward) ");
      command.append("       (csetq formula (assertion-el-formula rule)) ");
      command.append("       (pwhen (cand (eq (first formula) #$implies) ");
      command.append("                    (unify-el-possible ").
              append(formula.stringApiValue()).
              append(" ");
      command.append(
              "                                          (third formula))) ");
      command.append("         (cpush formula backchain-rules)))) ");
      command.append("   backchain-rules)");
    }

    //getCyc().traceOn();
    return getConverse().converseList(command.toString());
  }

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
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getForwardChainRules(CycConstantI predicate,
          CycList formula, CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    StringBuilder command = new StringBuilder();
    if (makeELMt_inner(mt).equals(inferencePSC) || makeELMt_inner(mt).equals(
            everythingPSC)) {
      command.append("(clet (backchain-rules formula) ");
      command.append("  (with-all-mts ");
      command.append("    (do-predicate-rule-index (rule ").append(
              predicate.stringApiValue()).append(" :pos nil :forward) ");
      command.append("       (csetq formula (assertion-el-formula rule)) ");
      command.append("       (pwhen (cand (eq (first formula) #$implies) ");
      command.append("                    (unify-el-possible ").append(
              formula.stringApiValue()).append(" ");
      command.append(
              "                                          (third formula))) ");
      command.append("         (cpush formula backchain-rules)))) ");
      command.append("   backchain-rules)");
    } else {
      command.append("(clet (backchain-rules formula) ");
      command.append("  (with-inference-mt-relevance ").append(
              makeELMt_inner(mt).stringApiValue()).append(" ");
      command.append("    (do-predicate-rule-index (rule ").append(
              predicate.stringApiValue()).append(" :pos nil :forward) ");
      command.append("       (csetq formula (assertion-el-formula rule)) ");
      command.append("       (pwhen (cand (eq (first formula) #$implies) ");
      command.append("                    (unify-el-possible ").append(
              formula.stringApiValue()).append(" ");
      command.append(
              "                                          (third formula))) ");
      command.append("         (cpush formula backchain-rules)))) ");
      command.append("   backchain-rules)");
    }

    return getConverse().converseList(command.toString());
  }

  /**
   * Gets a list of the backchaining implication rules which might apply to the given predicate.
   *
   * @param predicate the predicate for which backchaining rules are sought
   * @param mt the microtheory (and its genlMts) in which the search for backchaining rules takes
   * place
   *
   * @return a list of the backchaining implication rules which might apply to the given predicate
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getBackchainRules(CycConstantI predicate, CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    StringBuilder command = new StringBuilder();
    if (makeELMt_inner(mt).equals(inferencePSC) || makeELMt_inner(mt).equals(
            everythingPSC)) {
      command.append("(clet (backchain-rules) ");
      command.append("  (with-all-mts ");
      command.append("    (do-predicate-rule-index (rule ").append(
              predicate.stringApiValue()).append(" ");
      command.append("                                :sense :pos ");
      command.append("                                :done nil ");
      command.append("                                :direction :backward) ");
      command.append(
              "       (pwhen (eq (first (assertion-el-formula rule)) #$implies) ");
      command.append(
              "         (cpush (assertion-el-formula rule) backchain-rules)))) ");
      command.append("   backchain-rules)");
    } else {
      command.append("(clet (backchain-rules) ");
      command.append("  (with-inference-mt-relevance ").append(
              makeELMt_inner(mt).stringApiValue()).append(" ");
      command.append("    (do-predicate-rule-index (rule ").append(
              predicate.stringApiValue()).append(" ");
      command.append("                                :sense :pos ");
      command.append("                                :done nil ");
      command.append("                                :direction :backward) ");
      command.append(
              "       (pwhen (eq (first (assertion-el-formula rule)) #$implies) ");
      command.append(
              "         (cpush (assertion-el-formula rule) backchain-rules)))) ");
      command.append("   backchain-rules)");
    }

    //getCyc().traceOn();
    return getConverse().converseList(command.toString());
  }

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
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getForwardChainRules(CycConstantI predicate,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    StringBuilder command = new StringBuilder();

    if (makeELMt_inner(mt).equals(inferencePSC) || makeELMt_inner(mt).equals(
            everythingPSC)) {
      command.append("(clet (backchain-rules) ");
      command.append("  (with-all-mts ");
      command.append("    (do-predicate-rule-index (rule ").append(
              predicate.stringApiValue()).append(" ");
      command.append("                                :sense :pos ");
      command.append("                                :done nil ");
      command.append("                                :direction :forward) ");
      command.append(
              "       (pwhen (eq (first (assertion-el-formula rule)) #$implies) ");
      command.append(
              "         (cpush (assertion-el-formula rule) backchain-rules)))) ");
      command.append("   backchain-rules)");
    } else {
      command.append("(clet (backchain-rules) ");
      command.append("  (with-inference-mt-relevance ").append(
              makeELMt_inner(mt).stringApiValue()).append(" ");
      command.append("    (do-predicate-rule-index (rule ").append(
              predicate.stringApiValue()).append(" ");
      command.append("                                :sense :pos ");
      command.append("                                :done nil ");
      command.append("                                :direction :forward) ");
      command.append(
              "       (pwhen (eq (first (assertion-el-formula rule)) #$implies) ");
      command.append(
              "         (cpush (assertion-el-formula rule) backchain-rules)))) ");
      command.append("   backchain-rules)");
    }

    return getConverse().converseList(command.toString());
  }

  /**
   * Returns <tt>true</tt> iff any ground formula instances exist having the given predicate, and
   * the given term in the given argument position.
   *
   * @param term the term present at the given argument position
   * @param predicate the <tt>CycConstant</tt> predicate for the formula
   * @param argumentPosition the argument position of the given term in the ground formula
   * @param mt microtheory (including its genlMts) in which the existence is sought
   *
   * @return <tt>true</tt> iff any ground formula instances exist having the given predicate, and
   * the given term in the given argument position
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public boolean hasSomePredicateUsingTerm(CycConstantI predicate,
          Fort term,
          Integer argumentPosition,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command;
    if (makeELMt_inner(mt).equals(inferencePSC) || makeELMt_inner(mt).equals(everythingPSC)) {
      command = makeSubLStmt(SOME_PRED_VALUE_IN_ANY_MT, term, predicate,
              argumentPosition);
    } else {
      command = makeSubLStmt(SOME_PRED_VALUE_IN_RELEVANT_MTS, term, predicate,
              makeELMt_inner(mt), argumentPosition);
    }

    //getCyc().traceOn();
    return getConverse().converseBoolean(command);
  }
  
    /**
   * Returns the arity of the given predicate.
   *
   * @param predicate the given predicate whose number of arguments is sought
   *
   * @return the arity of the given predicate, or zero if the argument is not a predicate
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public int getArity(Fort predicate)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = makeSubLStmt(WITH_ALL_MTS,
            makeNestedSubLStmt("arity", predicate));
    Object object = getConverse().converseObject(command);
    if (object instanceof Integer) {
      return (Integer) object;
    } else {
      return 0;
    }
  }

  /**
   * Returns the list of arg2 values of binary gafs, given the predicate and arg1, looking in all
   * microtheories.
   *
   * @param predicate the given predicate for the gaf pattern
   * @param arg1 the given first argument of the gaf
   *
   * @return the list of arg2 values of the binary gafs
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getArg2s(Fort predicate,
          Object arg1)
          throws CycConnectionException, com.cyc.base.CycApiException {

    CycVariable variable = CycObjectFactory.makeCycVariable("?arg2");
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            predicate, arg1, variable);

    return getCyc().getInferenceTool().queryVariable(variable, query, inferencePSC);
  }

  /**
   * Returns the single (first) arg2 value of a binary gaf, given the predicate and arg0, looking
   * in all microtheories. Return null if none found.
   *
   * @param predicate the given predicate for the gaf pattern
   * @param arg1 the given first argument of the gaf
   *
   * @return the single (first) arg2 value of the binary gaf(s)
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public Object getArg2(Fort predicate,
          Object arg1)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycList arg2s = getArg2s(predicate, arg1);
    if (arg2s.isEmpty()) {
      return null;
    } else {
      return arg2s.first();
    }
  }

    /**
   * Returns the list of applicable binary predicates which are elements of any of the given list
   * of KBSubsetCollections.
   *
   * @param kbSubsetCollections the list of KBSubsetCollections
   *
   * @return the list of applicable binary predicates which are elements of any of the given list
   * of KBSubsetCollections
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getApplicableBinaryPredicates(CycList kbSubsetCollections)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycList result = new CycArrayList();

    for (int i = 0; i < kbSubsetCollections.size(); i++) {
      CycFort kbSubsetCollection = (CycFort) kbSubsetCollections.get(
              i);
      String query = "(#$and \n" + "  (#$isa ?binary-predicate " + kbSubsetCollection.stringApiValue()
              + ") \n" + "  (#$isa ?binary-predicate #$BinaryPredicate))";
      result.addAllNew(getCyc().getInferenceTool().queryVariable(CycObjectFactory.makeCycVariable(
              "?binary-predicate"),
              getCyc().getObjectTool().makeCycSentence(query), inferencePSC,
              new DefaultInferenceParameters(getCyc())));
    }

    return result;
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getGafsForPredicates(final CycObject cycObject,
          final List predicates,
          final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (predicates == null) {
      throw new NullPointerException("predicates must not be null");
    }
    if (predicates == null) {
      throw new NullPointerException("predicates must not be null");
    }
    final CycArrayList result = new CycArrayList();

    for (int i = 0; i < predicates.size(); i++) {
      result.addAllNew(getGafs(cycObject,
              (CycFort) predicates.get(
              i),
              makeELMt_inner(mt)));
    }

    return result;
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getGafs(final CycObject cycFort,
          final CycObject predicate,
          final CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    if (cycFort == null) {
      throw new NullPointerException("cycFort must not be null");
    }
    if (predicate == null) {
      throw new NullPointerException("predicate must not be null");
    }
    if (mt == null) {
      throw new NullPointerException("mt must not be null");
      // TODO handle the case where the cycObject is a NAUT,
      //getGafsForNaut
    }
    final CycArrayList gafs = new CycArrayList();
    final String command = "(with-inference-mt-relevance " + makeELMt_inner(mt).stringApiValue() + "\n"
            + "  (pred-values-in-relevant-mts " + cycFort.stringApiValue() + " "
            + predicate.stringApiValue() + "))";
    final CycList values = getConverse().converseList(command);

    for (int i = 0; i < values.size(); i++) {
      final CycArrayList gaf = new CycArrayList();
      gaf.add(predicate);
      gaf.add(cycFort);
      gaf.add(values.get(i));
      gafs.add(gaf);
    }

    return gafs;
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getGafsForPredicates(final CycObject cycObject,
          final List predicates)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (predicates == null) {
      throw new NullPointerException("predicates must not be null");
    }
    final CycArrayList result = new CycArrayList();
    for (int i = 0; i < predicates.size(); i++) {
      result.addAllNew(getGafs(cycObject, (CycObject) predicates.get(i)));
    }

    return result;
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getGafs(final CycObject cycObject,
          final CycObject predicate)
          throws CycConnectionException, com.cyc.base.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    verifyPossibleDenotationalTerm_inner(cycObject);
    if (cycObject instanceof CycArrayList) {
      return getGafsForNaut((CycArrayList) cycObject, predicate);
    }
    final CycArrayList gafs = new CycArrayList();
    // TODO handle the case where the cycObject is a NAUT,
    //getGafsForNaut
    final String command = "(with-all-mts \n" + "  (pred-values-in-relevant-mts (canonicalize-term "
            + cycObject.stringApiValue() + ") " + "(canonicalize-term "
            + predicate.stringApiValue() + ")))";
    final CycList values = getConverse().converseList(command);

    for (int i = 0; i < values.size(); i++) {
      final CycArrayList gaf = new CycArrayList();
      gaf.add(predicate);
      gaf.add(cycObject);
      gaf.add(values.get(i));
      gafs.add(gaf);
    }

    return gafs;
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getGafsForNaut(final CycList naut,
          final CycObject predicate)
          throws CycConnectionException, com.cyc.base.CycApiException {
    final String command =
            "(clet (assertions) "
            + "  (do-gaf-arg-index-naut (assertion " + naut.stringApiValue() + ")"
            + "    (pwhen (equal (formula-arg1 assertion) " + predicate.stringApiValue() + ")"
            + "      (cpush assertion assertions))) "
            + "  assertions)";
    final CycList gafs = getConverse().converseList(command);

    //// Postconditions
    assert gafs != null : "gafs cannot be null";

    return gafs;
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getPredicateValueTuplesInMt(Fort term, Fort predicate,
          int indexArg, CycList gatherArgs, CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycArrayList tuples = new CycArrayList();
    String command = makeSubLStmt("pred-value-tuples-in-mt", term, predicate,
            indexArg,
            gatherArgs, makeELMt_inner(mt));
    return getConverse().converseList(command);
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getSynonymousExternalConcepts(String informationSource,
          String mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    return getSynonymousExternalConcepts(getKnownConstantByName(
            informationSource),
            getKnownConstantByName(mt));
  }

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
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycList getSynonymousExternalConcepts(Fort informationSource,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    CycArrayList variables = new CycArrayList();
    CycVariable cycTermVar = CycObjectFactory.makeCycVariable("?cyc-term");
    variables.add(cycTermVar);

    CycVariable externalConceptVar = CycObjectFactory.makeCycVariable(
            "?externalConcept");
    variables.add(externalConceptVar);

    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            // #$synonymousExternalConcept
            getKnownConstantByGuid("c0e2af4e-9c29-11b1-9dad-c379636f7270"),
            cycTermVar, informationSource, externalConceptVar);

    return getCyc().getInferenceTool().queryVariables(variables, query, makeELMt_inner(mt),
            new DefaultInferenceParameters(getCyc()));
  }

  /**
   * Gets the list of name strings for the given CycFort.
   *
   * @param cycFort the given FORT
   * @param mt the relevant inference microtheory
   *
   * @return the list of name strings for the given CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycList getNameStrings(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, com.cyc.base.CycApiException {
    // (#$nameString <cycFort> ?name-string)

    CycVariable variable = CycObjectFactory.makeCycVariable("?name-string");
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            getKnownConstantByGuid("c0fdf7e8-9c29-11b1-9dad-c379636f7270"),
            cycFort, variable);

    return getCyc().getInferenceTool().queryVariable(variable, query, makeELMt_inner(mt));
  }

  @Override
  public CycSentence getSimplifiedSentence(FormulaSentence sentence) throws CycConnectionException {
    return sentence.getSimplifiedSentence(getCyc());
  }

  @Override
  public CycSentence getSimplifiedSentence(FormulaSentence sentence, ELMt mt) throws CycConnectionException {
    return sentence.getSimplifiedSentence(getCyc(), mt);
  }
  
    /**
   * Returns a random constant.
   *
   * @return a random constant
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycConstant getRandomConstant()
          throws CycConnectionException, com.cyc.base.CycApiException {
    return (CycConstant) getConverse().converseObject("(random-constant)");
  }

  /**
   * Returns a random nart (Non-Atomic Reified Term).
   *
   * @return a random nart (Non-Atomic Reified Term)
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycNart getRandomNart()
          throws CycConnectionException, com.cyc.base.CycApiException {
    return (CycNart) getConverse().converseObject("(random-nart)");
  }

  /**
   * Returns a random assertion.
   *
   * @return a random assertion
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public DefaultCycAssertion getRandomAssertion()
          throws CycConnectionException, com.cyc.base.CycApiException {
    return (DefaultCycAssertion) getConverse().converseObject("(random-assertion)");
  }

  /**
   * Gets the assertion date for the given assertion, or zero if the date is not available.
   *
   * @param cycAssertion
   * @return the assertion date for the given assertion
   */
  @Override
  public Long getAssertionDate(CycAssertion cycAssertion)
          throws CycConnectionException, com.cyc.base.CycApiException {
    String command = makeSubLStmt("asserted-when", cycAssertion);
    Object date = getConverse().converseObject(command);
    if (date instanceof Integer) {
      return ((Integer) date).longValue();
    }
    if (date instanceof Long) {
      return (Long) date;
    }
    if (date.equals(CycObjectFactory.nil)) {
      return 0l;
    } else {
      throw new com.cyc.base.CycApiException(
              "unexpected type of date returned " + date.toString());
    }
  }
  
  
  // Private
  /*
  private String getGeneratedPhrase(CycObject cycObject, boolean precise,
          CycObject languageMt)
          throws CycConnectionException, com.cyc.baseclient.api.CycApiException {
    //// Preconditions
    if (cycObject == null) {
      throw new NullPointerException("cycObject must not be null");
    }
    final NLFormat nlf = NLFormat.getInstance(getCyc());
    nlf.setPrecise(precise);
    if (languageMt != null) {
      nlf.setFormatLanguageMt(languageMt);
    }
    return nlf.format(cycObject);
  }
  */
  
  // Internal
  
  private static final CycSymbol SOME_PRED_VALUE_IN_ANY_MT = makeCycSymbol(
          "some-pred-value-in-any-mt");
  
  private static final CycSymbol SOME_PRED_VALUE_IN_RELEVANT_MTS = makeCycSymbol(
          "some-pred-value-in-relevant-mts");
  
  private static final CycSymbol FPRED_VALUE_IN_MT = makeCycSymbol("fpred-value-in-mt");
}
