/* $Id: CycFormulaSentence.java 144272 2013-03-28 14:07:09Z baxter $
 *
 * Copyright (c) 2008 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.cycobject;

//// External Imports
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.*;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.api.SubLAPIHelper;
import static org.opencyc.api.SubLAPIHelper.makeSubLStmt;

/**
 * <P>CycSentence is designed to be an object that represents Sentences composed
 * of a truth function and a list of arguments
 *
 * <P>Copyright (c) 2008 Cycorp, Inc. All rights reserved. <BR>This software is
 * the proprietary information of Cycorp, Inc. <P>Use is subject to license
 * terms.
 *
 * Created on : Jul 6, 2009, 10:05:43 AM Author : baxter
 *
 * @version $Id: CycFormulaSentence.java 144272 2013-03-28 14:07:09Z baxter $
 *
 * @todo make it implement CycLFormula, or get rid of CycLFormula, as
 * appropriate
 */
public class CycFormulaSentence extends CycFormula implements CycSentence {

  /**
   * Create and return a new CycSentence whose arguments are terms. CycList
   * arguments will be converted to CycNauts or CycSentences.
   *
   * @param terms
   */
  public CycFormulaSentence(Iterable<? extends Object> terms) {
    super(terms);
  }

  /**
   * Create and return a new CycSentence whose arguments are terms. CycList
   * arguments will be converted to CycNauts or CycSentences.
   *
   * @param terms
   * @return
   */
  public static CycFormulaSentence makeCycFormulaSentence(
          Iterable<? extends Object> terms) {
    return new CycFormulaSentence(terms);
  }

  /**
   * Build a new CycSentence from terms.
   *
   * @param terms
   * @return
   */
  public static CycFormulaSentence makeCycFormulaSentence(Object... terms) {
    final CycFormulaSentence newSentence = new CycFormulaSentence();
    for (final Object arg : terms) {
      newSentence.addArg(arg);
    }
    return newSentence;
    //return new CycFormulaSentence(CycList.makeCycList(terms));
  }

  /**
   * Build a new CycSentence from a String. This will add #$ wherever necessary.
   *
   * @param cyc
   * @param cycl
   * @return
   * @throws CycApiException
   * @throws IOException
   */
  public static CycFormulaSentence makeCycSentence(CycAccess cyc, String cycl)
          throws CycApiException, IOException {
    return new CycFormulaSentence(cyc.makeCycList(cyc.cyclifyString(cycl)));
  }

  /**
   * Build a new CycSentence from a String. This will add #$ wherever
   * necessary.
   *
   * @param cycl
   * @return
   * @throws CycApiException
   * @throws IOException
   */
  public static CycFormulaSentence makeCycSentence(String cycl)
          throws CycApiException, IOException {
    CycAccess cyc = CycAccess.getCurrent();
    return new CycFormulaSentence(cyc.makeCycList(cyc.cyclifyString(cycl)));
  }

  /**
   * Make a new conjunction conjoining the arguments.
   *
   * @see #isConjunction()
   * @param conjuncts
   * @return
   */
  public static CycFormulaSentence makeConjunction(
          CycFormulaSentence... conjuncts) {
    return makeConjunction(Arrays.asList(conjuncts));
  }

  /**
   * Make a new conjunction from the elements of conjuncts.
   *
   * @see #isConjunction()
   * @param conjuncts
   * @return
   */
  public static CycFormulaSentence makeConjunction(
          Iterable<CycFormulaSentence> conjuncts) {
    final CycFormulaSentence newSentence = makeCycFormulaSentence(AND);
    for (final Object conjunct : conjuncts) {
      newSentence.addArg(conjunct);
    }
    return newSentence;
  }

  /**
   * Make a new disjunction from the elements of conjuncts.
   *
   * @param conjuncts
   * @return
   */
  public static CycFormulaSentence makeDisjunction(
          Iterable<CycFormulaSentence> conjuncts) {
    final CycFormulaSentence newSentence = makeCycFormulaSentence(OR);
    for (final Object conjunct : conjuncts) {
      newSentence.addArg(conjunct);
    }
    return newSentence;
  }

  /**
   * Make a new conditional sentence with the specified antecedent and consequent.
   *
   * @see #isConditionalSentence()
   * @param antecedent
   * @param consequent
   * @return
   */
  public static CycFormulaSentence makeConditional(CycFormulaSentence antecedent,
          CycFormulaSentence consequent) {
    return makeCycFormulaSentence(IMPLIES, antecedent, consequent);
  }

  /**
   * Make a negated form of the specified sentence.
   *
   * @param sentence
   * @return
   */
  public static CycFormulaSentence makeNegation(CycFormulaSentence sentence) {
    return makeCycFormulaSentence(NOT, sentence);
  }

  /**
   * Convert obj to a CycFormulaSentence if it looks like it could be one.
   *
   * @param obj
   * @return
   */
  static public Object convertIfPromising(final Object obj) {
    if (obj instanceof List && !(obj instanceof CycFormulaSentence)) {
      final List<Object> termAsList = (List) obj;
      if (!termAsList.isEmpty() && termAsList.get(0) instanceof CycConstant) {
        final CycConstant arg0 = (CycConstant) termAsList.get(0);
        if (Character.isLowerCase(arg0.getName().charAt(0))) {
          return new CycFormulaSentence(termAsList);
        }
      }
    }
    return obj;
  }

  private CycFormulaSentence() {
  }

  /**
   *
   * @return true iff this is a conditional sentence.
   */
  @Override
  public boolean isConditionalSentence() {
    if (IMPLIES.equals(getOperator())) {
      return true;
    } else if (isConjunction() && getArity() == 1 && ((CycFormulaSentence) getArg(
            1)).isConditionalSentence()) {
      return true;
    } else {
      return false;
    }
  }

  /**
   *
   * @return true iff this is a conjunction.
   */
  @Override
  public boolean isConjunction() {
    return (AND.equals(getOperator()));
  }

  /**
   *
   * @return true iff this is negated.
   */
  @Override
  public boolean isNegated() {
    return (NOT.equals(getOperator()));
  }

  /**
   *
   * @return true iff the operator of this sentence is a logical operator.
   * @see #getOperator()
   */
  @Override
  public boolean isLogicalConnectorSentence() {
    return isLogicalOperatorFort(getOperator());
  }

  /**
   *
   * @return true iff this is an existential sentence.
   */
  @Override
  public boolean isExistential() {
    return THERE_EXISTS.equals(getOperator());
  }

  /**
   * Adds existential quantification for var in this sentence.
   *
   * @param var
   */
  public void existentiallyBind(CycVariable var) {
    synchronized (args) {
      final Object oldArgs = this.clone();
      args.clear();
      args.add(oldArgs);
      args.add(0, var);
      args.add(0, THERE_EXISTS);
    }
  }

  /**
   * Removes existential quantification for var in this sentence.
   *
   * @param var
   */
  public void existentiallyUnbind(CycVariable var) {
    synchronized (args) {
      final Set<ArgPosition> existentialPositions = new HashSet<ArgPosition>(1);
      for (final ArgPositionTrackingTreeWalker argWalker = new ArgPositionTrackingTreeWalker();
              argWalker.hasNext();) {
        if (THERE_EXISTS.equals(argWalker.next()) && argWalker.getCurrentArgPosition().last() == 0) {
          final ArgPosition quantPosition = argWalker.getCurrentArgPosition();
          final ArgPosition parentPosition = quantPosition.deepCopy().toParent();
          final ArgPosition varPosition = parentPosition.deepCopy().extend(1);
          if (var.equals(getSpecifiedObject(varPosition))) {
            existentialPositions.add(parentPosition);
          }
        }
      }
      for (final ArgPosition existentialPosition : existentialPositions) {
        setSpecifiedObject(existentialPosition, getSpecifiedObject(
                existentialPosition.deepCopy().extend(2)));
      }
    }
  }

  /**
   *
   * @return true iff this is a universally quantified sentence.
   */
  @Override
  public boolean isUniversal() {
    return FOR_ALL.equals(getOperator());
  }

  private static boolean isLogicalOperatorFort(final Object obj) {
    return (LOGICAL_OPERATOR_FORTS.contains(obj));
  }

  /**
   * Suggest mnemonic names for variables in this sentence.
   *
   * @param access
   * @return mapping from variables to suggested new names for them.
   * @throws UnknownHostException
   * @throws IOException
   */
  public Map<CycVariable, String> getOptimizedVarNames(CycAccess access) throws UnknownHostException, IOException {
    Map<CycVariable, String> retMap = new HashMap<CycVariable, String>();
    String command = makeSubLStmt(PPH_OPTIMIZED_NAMES_FOR_VARIABLES, this);
    @SuppressWarnings("unchecked")
    CycList<CycObject> resultList = access.converseList(command);
    for (CycObject singleValue : resultList) {
      if (singleValue instanceof CycList) {
        final CycList dottedPair = (CycList) singleValue;
        if (dottedPair.first() instanceof CycVariable) {
          if (dottedPair.getDottedElement() instanceof String) {
            retMap.put((CycVariable) dottedPair.first(),
                    (String) (dottedPair.getDottedElement()));
          }
        } else {
          optimizedVarProblemResult(singleValue);
        }
      } else {
        optimizedVarProblemResult(singleValue);
      }
    }
    return retMap;
  }

  private void optimizedVarProblemResult(CycObject singleValue) throws RuntimeException {
    throw new RuntimeException(
            "Unable to interpret " + singleValue + " as an optimized variable name.");
  }

  /**
   * Insert <tt>toInsert</tt> into this sentence at <tt>argPosition</tt>,
   * using <tt>access</tt> to attempt to unify and rename variables.
   *
   * @param toInsert
   * @param argPosition
   * @param access
   * @return the new sentence
   * @throws IOException if there is a problem talking to Cyc
   */
  public CycFormulaSentence splice(CycFormulaSentence toInsert,
          ArgPosition argPosition,
          CycAccess access) throws IOException {
    access.requireNonOpenCyc();
    final String command = SubLAPIHelper.makeSubLStmt(
            "combine-formulas-at-position", this, toInsert, argPosition);
    final List result = access.converseList(command);
    return new CycFormulaSentence(result);
  }

  /**
   * Returns a collection of terms from cyc that could be plugged into position.
   * This functionality is supported by #$suggestionsForPred... assertions.
   *
   * @param position the position in this sentence for which replacements are sought.
   * @param mt the microtheory from which to perform necessary reasoning.
   * @param cyc the Cyc image that finds the candidate replacement terms.
   * @return a collection of candidate replacement terms.
   * @throws IOException if there is a problem talking to Cyc
   */
  //@TODO -- Promote to CycFormula?
  public List<Object> getCandidateReplacements(ArgPosition position,
          ELMt mt, CycAccess cyc) throws IOException {
    cyc.requireNonOpenCyc();
    final String command = SubLAPIHelper.makeSubLStmt(
            "candidate-replacements-for-arg", this, position, mt);
    return cyc.converseList(command);
  }

  /**
   * Determines whether newTerm is valid at position.
   *
   * @param position the position to be checked
   * @param newTerm the candidate new term
   * @param cyc the Cyc image that issues the judgment
   * @param mt the microtheory to use for constraints
   * @return true iff newTerm is valid at position in mt
   */
  public boolean isValidReplacement(ArgPosition position, Object newTerm,
          ELMt mt,
          CycAccess cyc) {
    final CycFormulaSentence subbed = this.deepCopy();
    subbed.setSpecifiedObject(position, newTerm);
    return subbed.getNonWffExplanation(cyc, mt) == null;
  }

  /**
   *
   * @param access
   * @return
   * @throws UnknownHostException
   * @throws IOException
   */
  public CycSentence getEqualsFoldedSentence(CycAccess access) throws UnknownHostException, IOException {
    return getEqualsFoldedSentence(access, CycAccess.currentWorldDataMt);
  }

  /**
   *
   * @param access
   * @param mt
   * @return
   * @throws UnknownHostException
   * @throws IOException
   */
  public CycSentence getEqualsFoldedSentence(CycAccess access, ELMt mt) throws UnknownHostException, IOException {
    String command = null;
    try {
      command = "(with-inference-mt-relevance " + mt.stringApiValue() + " (fold-equals " + this.stringApiValue() + "))";
    } catch (Exception ex) {
      throw (new RuntimeException(ex));
    }
    Object rawResult = access.converseObject(command);
    CycSentence result;
    if (rawResult instanceof CycList) {
      result = new CycFormulaSentence((CycList) rawResult);
    } else if (rawResult instanceof CycConstant) {
      result = new CycConstantSentence((CycConstant) rawResult);
    } else {
      throw new CycApiException(
              "getEqualsFoldedSentence returned " + rawResult
              + ", which is not a CycSentence.\nOriginal input: " + this.toString());
    }
    //System.out.println("FOLDED TO: "+result.toString());
    return result;
  }

  /**
   * Get a simplified version of this sentence.
   *
   * @param access
   * @return
   * @throws UnknownHostException
   * @throws IOException
   */
  public CycSentence getSimplifiedSentence(CycAccess access) throws UnknownHostException, IOException {
    return getSimplifiedSentence(access, getDefaultSimplifierMt());
  }

  static synchronized ELMt getDefaultSimplifierMt() {
    if (simplifierMt == null && CycAccess.mtSpace != null) {
      simplifierMt = ELMtCycNaut.makeELMtCycNaut(Arrays.asList(CycAccess.mtSpace,
              CycAccess.currentWorldDataMt, CycAccess.anytimePSC));
    }
    return simplifierMt;
  }

  /**
   * Get a simplified version of this sentence.
   *
   * @param access
   * @param mt the microtheory to use for semantic requirements and checks
   * @return
   * @throws UnknownHostException
   * @throws IOException
   */
  public CycSentence getSimplifiedSentence(CycAccess access, ELMt mt) throws UnknownHostException, IOException {
    access.requireNonOpenCyc();
    String command = null;
    try {
      command = "(with-inference-mt-relevance " + mt.stringApiValue() + " (simplify-cycl-sentence (fold-equals "
              + this.stringApiValue() + ")))";
      //System.out.println("TRYING TO SIMPLIFY WITH:"+ command);
    } catch (Exception ex) {
      throw (new RuntimeException(ex));
    }
    Object rawResult = access.converseObject(command);
    CycSentence result;
    if (rawResult instanceof CycList) {
      result = new CycFormulaSentence((CycList) rawResult);
    } else if (rawResult instanceof CycConstant) {
      result = new CycConstantSentence((CycConstant) rawResult);
    } else {
      throw new CycApiException(
              "getSimplifiedSentence returned " + rawResult
              + ", which is not a CycSentence.\nOriginal input: " + this.toString());
    }
    //System.out.println("SIMPLIFIED TO: "+result.toString());
    return result;
  }

  /**
   * Return a version of this with all expandable relations expanded into their more
   * verbose forms. For example, this will expand Subcollection functions, as well as other
   * relations that have #$expansion's in the KB.
   *
   * @param access
   * @return
   * @throws UnknownHostException
   * @throws IOException
   */
  public CycFormulaSentence getExpandedSentence(CycAccess access) throws UnknownHostException, IOException {
    return getExpandedSentence(access, getDefaultSimplifierMt());
  }

  /**
   * Return a version of this with all expandable relations expanded into their more
   * verbose forms. For example, this will expand Subcollection functions, as well as other
   * relations that have #$expansion's in the KB.
   *
   * @param access
   * @param mt the microtheory from which to look for expansions.
   * @return the expanded version of this sentence.
   * @throws UnknownHostException
   * @throws IOException
   */
  public CycFormulaSentence getExpandedSentence(CycAccess access, ELMt mt) throws UnknownHostException, IOException {
    String command = null;
    try {
      command = "(el-expand-all " + this.stringApiValue() + " " + mt.stringApiValue() + ")";
    } catch (Exception ex) {
      throw (new RuntimeException(ex));
    }
    Object rawResult = access.converseObject(command);
    CycFormulaSentence result;
    if (rawResult instanceof CycList) {
      result = new CycFormulaSentence((CycList) rawResult);
    } else {
      throw new CycApiException(
              "getExpandedSentence returned " + rawResult
              + ", which is not a CycFormulaSentence.\nOriginal input: " + this.toString());
    }
    //System.out.println("SIMPLIFIED TO: "+result.toString());
    return result;
  }

  /**
   * Return a canonical version of this. If two different sentences yield the same
   * sentence after calling this method, then those two sentences are equal at the EL.
   * In other words, they are merely syntactic variants of the same semantic meaning.
   *
   * @see #getCanonicalElSentence(org.opencyc.api.CycAccess, org.opencyc.cycobject.ELMt, java.lang.Boolean)
   * @param access
   * @return the canonical version of this sentence.
   * @throws UnknownHostException
   * @throws IOException
   */
  public CycFormulaSentence getCanonicalElSentence(CycAccess access) throws UnknownHostException, IOException {
    return getCanonicalElSentence(access, getDefaultSimplifierMt(), true);
  }

  /**
   * @see #getCanonicalElSentence(org.opencyc.api.CycAccess, org.opencyc.cycobject.ELMt, java.lang.Boolean)
   * @param access
   * @param canonicalizeVars
   * @return
   * @throws UnknownHostException
   * @throws IOException
   */
  public CycFormulaSentence getCanonicalElSentence(CycAccess access,
          Boolean canonicalizeVars) throws UnknownHostException, IOException {
    return getCanonicalElSentence(access, getDefaultSimplifierMt(),
            canonicalizeVars);
  }

  /**
   * Return a canonical version of this. If two different sentences yield the same sentence after calling this method (with
   * canonicalizeVars set to True), then those two sentences are equal at the EL.
   * In other words, they are merely syntactic variants of the same semantic meaning.
   *
   * @param access
   * @param mt
   * @param canonicalizeVars
   * @return the canonical version of this sentence.
   * @throws UnknownHostException
   * @throws IOException
   */
  public CycFormulaSentence getCanonicalElSentence(CycAccess access, ELMt mt,
          Boolean canonicalizeVars) throws UnknownHostException, IOException {
    String command = null;
    //need to add the following to the command..." " + DefaultCycObject.stringApiValue(canonicalizeVars) +
    try {
      command = "(canonicalize-el-sentence " + this.stringApiValue() + " " + mt.stringApiValue() + " " + DefaultCycObject.stringApiValue(
              canonicalizeVars) + ")";
    } catch (Exception ex) {
      throw (new RuntimeException(ex));
    }
    Object rawResult = access.converseObject(command);
    CycFormulaSentence result;
    if (rawResult instanceof CycList) {
      result = new CycFormulaSentence((CycList) rawResult);
    } else {
      throw new CycApiException(
              "getCanonicalElSentence returned " + rawResult
              + ", which is not a CycFormulaSentence.\nOriginal input: " + this.toString());
    }
    return result;
  }

  /**
   * Is this sentence inconsistent with any of its constraints (e.g. predicate argument constraints)? A false return value does not
   * mean that this meets all the constraints, but it means that it is not inconsistent with them. For example, if an argument position
   * is constrained to be a spec of #$Mammal, and the argument is merely known to be a spec of #$Animal, then the argument does not meet all
   * of the constraints, but there are no constraint violations, and this method should return false.
   *
   * @param access
   * @param mt
   * @return true if violations are found
   */
  public boolean hasWffConstraintViolations(CycAccess access, ELMt mt) {
    try {
      String command = "(el-lenient-wff-assertible? "
              + this.stringApiValue() + " " + mt.stringApiValue() + ")";
      Object rawResult = access.converseObject(command);
      boolean equalsT = CycObjectFactory.t.equals(rawResult);
      return (!equalsT);
    } catch (Exception ex) {
      throw (new CycApiException(
              "Unable to decide whether " + this + " is well-formed in " + mt,
              ex));
    }
  }

  /**
   * @see #getNonWffAssertExplanation(org.opencyc.api.CycAccess, org.opencyc.cycobject.ELMt)
   * @param access
   * @return the explanation
   */
  public String getNonWffAssertExplanation(CycAccess access) {
    try {
      return getNonWffAssertExplanation(access, CycAccess.currentWorldDataMt);
    } catch (Exception ex) {
      throw (new CycApiException(
              "Unable to retrieve explanation for why " + this + " is not well-formed in " + CycAccess.currentWorldDataMt,
              ex));
    }
  }

  /**
   * Returns a string that attempts to explain why this is not well-formed for
   * assertion. Return null if this is well-formed for assertion.
   *
   * @param access
   * @param mt
   * @return An explanation, or null if no problems found.
   */
  public String getNonWffAssertExplanation(CycAccess access, ELMt mt) {
    try {
      String command = "(with-inference-mt-relevance " + mt.stringApiValue()
              + " (opencyc-explanation-of-why-not-wff-assert "
              + this.stringApiValue() + " " + mt.stringApiValue() + "))";
      Object rawResult = access.converseObject(command);
      if (rawResult instanceof String) {
        return (String) rawResult;
      } else {
        return null;
      }
    } catch (Exception ex) {
      throw (new CycApiException(
              "Unable to retrieve explanation for why " + this + " is not well-formed in " + mt,
              ex));
    }
  }

  /**
   * @see #getNonWffAssertExplanation(org.opencyc.api.CycAccess, org.opencyc.cycobject.ELMt)
   * @param access
   * @return
   */
  public String getNonWffExplanation(CycAccess access) {
    return getNonWffExplanation(access, getDefaultSimplifierMt());
  }

  /**
   * Returns a string that attempts to explain why this is not well-formed for
   * any purpose. Return null if this is well-formed. If you want to make an assertion with your sentence,
   * use the much more constraining {@link org.opencyc.cycobject.CycFormulaSentence#getNonWffAssertExplanation getNonWffAssertExplanation}.
   *
   * @param access
   * @param mt
   * @return An explanation, or null if no problems found.
   */
  public String getNonWffExplanation(CycAccess access, ELMt mt) {
    try {
      String command = "(with-inference-mt-relevance " + mt.stringApiValue()
              + " (opencyc-explanation-of-why-not-wff "
              + this.stringApiValue() + " " + mt.stringApiValue() + "))";
      Object rawResult = access.converseObject(command);
      if (rawResult instanceof String) {
        return (String) rawResult;
      } else {
        return null;
      }
    } catch (Exception ex) {
      throw (new CycApiException(
              "Unable to retrieve explanation for why " + this + " is not well-formed in " + mt,
              ex));
    }
  }

  /**
   * Returns a string that attempts to explain why this is not well-formed for
   * any purpose. Return null if this is well-formed. If you want to make an assertion with your sentence,
   * use the much more constraining {@link org.opencyc.cycobject.CycFormulaSentence#getNonWffAssertExplanation getNonWffAssertExplanation}.
   *
   * @param mt
   * @return An explanation, or null if no problems found.
   */
  public String getNonWffExplanation(ELMt mt) {
    return getNonWffExplanation(CycAccess.getCurrent(), mt);
  }

  /**
   *
   * @return a deep copy of this sentence.
   */
  @Override
  public CycFormulaSentence deepCopy() {
    return new CycFormulaSentence(super.deepCopy().getArgsUnmodifiable());
  }

  /**
   *
   * @param original
   * @param replacement
   * @return A copy of this sentence, with original replaced with replacement throughout.
   */
  public CycFormulaSentence substituteNonDestructive(Object original,
          Object replacement) {
    Map<Object, Object> map = new HashMap<Object, Object>();
    map.put(original, replacement);
    return (CycFormulaSentence) this.applySubstitutionsNonDestructive(map);
  }

  /**
   * Replace original with replacement in this sentence.
   *
   * @param original
   * @param replacement
   */
  public void substituteDestructive(Object original, Object replacement) {
    Map<Object, Object> map = new HashMap<Object, Object>();
    map.put(original, replacement);
    this.applySubstitutionsDestructive(map);
  }

  /**
   * Returns the result of a tree substitution on the sentence. Note that this
   * leaves the original sentence unmodified.
   *
   * @param access
   * @param substitutions
   * @return The CycFormulaSentence resulting from the tree substitution.
   * @throws CycApiException
   * @throws IOException
   */
  public CycFormulaSentence treeSubstitute(CycAccess access,
          Map<CycObject, Object> substitutions) throws CycApiException, IOException {
    CycFormulaSentence result = this;
    if (substitutions != null) {
      for (final Map.Entry<CycObject, Object> entry : substitutions.entrySet()) {
        final CycObject oldTerm = entry.getKey();
        final Object newTerm = entry.getValue();
        final String command = SubLAPIHelper.makeSubLStmtWNartSubstitute(
                "formula-subst", newTerm, oldTerm, result, EQUAL);
        result = access.converseSentence(command);
      }
    }
    return result;
  }

  /**
   * Returns the result of a tree substitution on the sentence. Note that this
   * leaves the original sentence unmodified.
   *
   * @param substitutions
   * @return The CycFormulaSentence resulting from the tree substitution.
   * @throws CycApiException
   * @throws IOException
   */
  public CycFormulaSentence treeSubstitute(Map<CycObject, Object> substitutions) throws CycApiException, IOException {
    return treeSubstitute(CycAccess.getCurrent(), substitutions);
  }

  @Override
  public Object clone() {
    return new CycFormulaSentence(args);
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof CycFormulaSentence) {
      return args.compareTo(((CycFormulaSentence) o).args);
    } else {
      return 0;
    }
  }
  private static final CycSymbol PPH_OPTIMIZED_NAMES_FOR_VARIABLES =
          CycObjectFactory.makeCycSymbol("pph-optimized-names-for-variables");
  private static final CycSymbol EQUAL = CycObjectFactory.makeCycSymbol("equal");
  public static final CycConstant AND = CycAccess.and;
  public static final CycConstant THERE_EXISTS = CycAccess.thereExistsConst;
  public static final CycConstant FOR_ALL = CycAccess.forAllConst;
  public static final CycConstant OR = CycAccess.or;
  public static final CycConstant NOT = CycAccess.not;
  public static final CycConstant UNKNOWN_SENTENCE =
          new CycConstant("unknownSentence", new Guid(
          "be1e5136-9c29-11b1-9dad-c379636f7270"));
  public static final CycConstant IMPLIES = CycAccess.impliesConst;
  private static final Collection<? extends Object> LOGICAL_OPERATOR_FORTS =
          Collections.unmodifiableCollection(
          Arrays.asList(AND, OR, NOT, UNKNOWN_SENTENCE, IMPLIES));
  private static ELMt simplifierMt = null;
}
