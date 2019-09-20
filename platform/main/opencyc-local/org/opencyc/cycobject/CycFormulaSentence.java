package org.opencyc.cycobject;

import java.util.Collections;
import org.opencyc.api.CycObjectFactory;
import java.net.UnknownHostException;
import org.opencyc.api.SubLAPIHelper;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
import java.io.IOException;
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycAccess;
import java.util.Collection;

public class CycFormulaSentence extends CycFormula implements CycSentence
{
    private static final CycSymbol PPH_OPTIMIZED_NAMES_FOR_VARIABLES;
    private static final CycSymbol EQUAL;
    public static final CycConstant AND;
    public static final CycConstant THERE_EXISTS;
    public static final CycConstant FOR_ALL;
    public static final CycConstant OR;
    public static final CycConstant NOT;
    public static final CycConstant UNKNOWN_SENTENCE;
    public static final CycConstant IMPLIES;
    private static final Collection<?> LOGICAL_OPERATOR_FORTS;
    private static ELMt simplifierMt;
    
    public CycFormulaSentence(final Iterable<?> terms) {
        super((Iterable)terms);
    }
    
    public static CycFormulaSentence makeCycFormulaSentence(final Iterable<?> terms) {
        return new CycFormulaSentence(terms);
    }
    
    public static CycFormulaSentence makeCycFormulaSentence(final Object... terms) {
        final CycFormulaSentence newSentence = new CycFormulaSentence();
        for (final Object arg : terms) {
            newSentence.addArg(arg);
        }
        return newSentence;
    }
    
    public static CycFormulaSentence makeCycSentence(final CycAccess cyc, final String cycl) throws CycApiException, IOException {
        return new CycFormulaSentence((Iterable<?>)cyc.makeCycList(cyc.cyclifyString(cycl)));
    }
    
    public static CycFormulaSentence makeCycSentence(final String cycl) throws CycApiException, IOException {
        final CycAccess cyc = CycAccess.getCurrent();
        return new CycFormulaSentence((Iterable<?>)cyc.makeCycList(cyc.cyclifyString(cycl)));
    }
    
    public static CycFormulaSentence makeConjunction(final CycFormulaSentence... conjuncts) {
        return makeConjunction(Arrays.asList(conjuncts));
    }
    
    public static CycFormulaSentence makeConjunction(final Iterable<CycFormulaSentence> conjuncts) {
        final CycFormulaSentence newSentence = makeCycFormulaSentence(CycFormulaSentence.AND);
        for (final Object conjunct : conjuncts) {
            newSentence.addArg(conjunct);
        }
        return newSentence;
    }
    
    public static CycFormulaSentence makeDisjunction(final Iterable<CycFormulaSentence> conjuncts) {
        final CycFormulaSentence newSentence = makeCycFormulaSentence(CycFormulaSentence.OR);
        for (final Object conjunct : conjuncts) {
            newSentence.addArg(conjunct);
        }
        return newSentence;
    }
    
    public static CycFormulaSentence makeConditional(final CycFormulaSentence antecedent, final CycFormulaSentence consequent) {
        return makeCycFormulaSentence(CycFormulaSentence.IMPLIES, antecedent, consequent);
    }
    
    public static CycFormulaSentence makeNegation(final CycFormulaSentence sentence) {
        return makeCycFormulaSentence(CycFormulaSentence.NOT, sentence);
    }
    
    public static Object convertIfPromising(final Object obj) {
        if (obj instanceof List && !(obj instanceof CycFormulaSentence)) {
            final List<Object> termAsList = (List<Object>)obj;
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
    
    public boolean isConditionalSentence() {
        return CycFormulaSentence.IMPLIES.equals(this.getOperator()) || (this.isConjunction() && this.getArity() == 1 && ((CycFormulaSentence)this.getArg(1)).isConditionalSentence());
    }
    
    public boolean isConjunction() {
        return CycFormulaSentence.AND.equals(this.getOperator());
    }
    
    public boolean isNegated() {
        return CycFormulaSentence.NOT.equals(this.getOperator());
    }
    
    public boolean isLogicalConnectorSentence() {
        return isLogicalOperatorFort(this.getOperator());
    }
    
    public boolean isExistential() {
        return CycFormulaSentence.THERE_EXISTS.equals(this.getOperator());
    }
    
    public void existentiallyBind(final CycVariable var) {
        synchronized (this.args) {
            final Object oldArgs = this.clone();
            this.args.clear();
            this.args.add(oldArgs);
            this.args.add(0, (Object)var);
            this.args.add(0, (Object)CycFormulaSentence.THERE_EXISTS);
        }
    }
    
    public void existentiallyUnbind(final CycVariable var) {
        synchronized (this.args) {
            final Set<ArgPosition> existentialPositions = new HashSet<ArgPosition>(1);
            final CycFormula.ArgPositionTrackingTreeWalker argWalker = new ArgPositionTrackingTreeWalker();
            while (argWalker.hasNext()) {
                if (CycFormulaSentence.THERE_EXISTS.equals(argWalker.next()) && argWalker.getCurrentArgPosition().last() == 0) {
                    final ArgPosition quantPosition = argWalker.getCurrentArgPosition();
                    final ArgPosition parentPosition = quantPosition.deepCopy().toParent();
                    final ArgPosition varPosition = parentPosition.deepCopy().extend(1);
                    if (!var.equals(this.getSpecifiedObject(varPosition))) {
                        continue;
                    }
                    existentialPositions.add(parentPosition);
                }
            }
            for (final ArgPosition existentialPosition : existentialPositions) {
                this.setSpecifiedObject(existentialPosition, this.getSpecifiedObject(existentialPosition.deepCopy().extend(2)));
            }
        }
    }
    
    public boolean isUniversal() {
        return CycFormulaSentence.FOR_ALL.equals(this.getOperator());
    }
    
    private static boolean isLogicalOperatorFort(final Object obj) {
        return CycFormulaSentence.LOGICAL_OPERATOR_FORTS.contains(obj);
    }
    
    public Map<CycVariable, String> getOptimizedVarNames(final CycAccess access) throws UnknownHostException, IOException {
        final Map<CycVariable, String> retMap = new HashMap<CycVariable, String>();
        final String command = SubLAPIHelper.makeSubLStmt(CycFormulaSentence.PPH_OPTIMIZED_NAMES_FOR_VARIABLES, new Object[] { this });
        final CycList<CycObject> resultList = (CycList<CycObject>)access.converseList((Object)command);
        for (final CycObject singleValue : resultList) {
            if (singleValue instanceof CycList) {
                final CycList dottedPair = (CycList)singleValue;
                if (dottedPair.first() instanceof CycVariable) {
                    if (!(dottedPair.getDottedElement() instanceof String)) {
                        continue;
                    }
                    retMap.put((CycVariable)dottedPair.first(), (String)dottedPair.getDottedElement());
                }
                else {
                    this.optimizedVarProblemResult(singleValue);
                }
            }
            else {
                this.optimizedVarProblemResult(singleValue);
            }
        }
        return retMap;
    }
    
    private void optimizedVarProblemResult(final CycObject singleValue) throws RuntimeException {
        throw new RuntimeException("Unable to interpret " + singleValue + " as an optimized variable name.");
    }
    
    public CycFormulaSentence splice(final CycFormulaSentence toInsert, final ArgPosition argPosition, final CycAccess access) throws IOException {
        access.requireNonOpenCyc();
        final String command = SubLAPIHelper.makeSubLStmt("combine-formulas-at-position", new Object[] { this, toInsert, argPosition });
        final List result = (List)access.converseList((Object)command);
        return new CycFormulaSentence(result);
    }
    
    public List<Object> getCandidateReplacements(final ArgPosition position, final ELMt mt, final CycAccess cyc) throws IOException {
        cyc.requireNonOpenCyc();
        final String command = SubLAPIHelper.makeSubLStmt("candidate-replacements-for-arg", new Object[] { this, position, mt });
        return (List<Object>)cyc.converseList((Object)command);
    }
    
    public boolean isValidReplacement(final ArgPosition position, final Object newTerm, final ELMt mt, final CycAccess cyc) {
        final CycFormulaSentence subbed = this.deepCopy();
        subbed.setSpecifiedObject(position, newTerm);
        return subbed.getNonWffExplanation(cyc, mt) == null;
    }
    
    public CycSentence getEqualsFoldedSentence(final CycAccess access) throws UnknownHostException, IOException {
        return this.getEqualsFoldedSentence(access, CycAccess.currentWorldDataMt);
    }
    
    public CycSentence getEqualsFoldedSentence(final CycAccess access, final ELMt mt) throws UnknownHostException, IOException {
        String command = null;
        try {
            command = "(with-inference-mt-relevance " + mt.stringApiValue() + " (fold-equals " + this.stringApiValue() + "))";
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        final Object rawResult = access.converseObject((Object)command);
        CycSentence result;
        if (rawResult instanceof CycList) {
            result = (CycSentence)new CycFormulaSentence((Iterable<?>)rawResult);
        }
        else {
            if (!(rawResult instanceof CycConstant)) {
                throw new CycApiException("getEqualsFoldedSentence returned " + rawResult + ", which is not a CycSentence.\nOriginal input: " + this.toString());
            }
            result = (CycSentence)new CycConstantSentence((CycConstant)rawResult);
        }
        return result;
    }
    
    public CycSentence getSimplifiedSentence(final CycAccess access) throws UnknownHostException, IOException {
        return this.getSimplifiedSentence(access, getDefaultSimplifierMt());
    }
    
    static synchronized ELMt getDefaultSimplifierMt() {
        if (CycFormulaSentence.simplifierMt == null && CycAccess.mtSpace != null) {
            CycFormulaSentence.simplifierMt = (ELMt)ELMtCycNaut.makeELMtCycNaut((List)Arrays.asList(CycAccess.mtSpace, CycAccess.currentWorldDataMt, CycAccess.anytimePSC));
        }
        return CycFormulaSentence.simplifierMt;
    }
    
    public CycSentence getSimplifiedSentence(final CycAccess access, final ELMt mt) throws UnknownHostException, IOException {
        access.requireNonOpenCyc();
        String command = null;
        try {
            command = "(with-inference-mt-relevance " + mt.stringApiValue() + " (simplify-cycl-sentence (fold-equals " + this.stringApiValue() + ")))";
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        final Object rawResult = access.converseObject((Object)command);
        CycSentence result;
        if (rawResult instanceof CycList) {
            result = (CycSentence)new CycFormulaSentence((Iterable<?>)rawResult);
        }
        else {
            if (!(rawResult instanceof CycConstant)) {
                throw new CycApiException("getSimplifiedSentence returned " + rawResult + ", which is not a CycSentence.\nOriginal input: " + this.toString());
            }
            result = (CycSentence)new CycConstantSentence((CycConstant)rawResult);
        }
        return result;
    }
    
    public CycFormulaSentence getExpandedSentence(final CycAccess access) throws UnknownHostException, IOException {
        return this.getExpandedSentence(access, getDefaultSimplifierMt());
    }
    
    public CycFormulaSentence getExpandedSentence(final CycAccess access, final ELMt mt) throws UnknownHostException, IOException {
        String command = null;
        try {
            command = "(el-expand-all " + this.stringApiValue() + " " + mt.stringApiValue() + ")";
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        final Object rawResult = access.converseObject((Object)command);
        if (rawResult instanceof CycList) {
            final CycFormulaSentence result = new CycFormulaSentence((Iterable<?>)rawResult);
            return result;
        }
        throw new CycApiException("getExpandedSentence returned " + rawResult + ", which is not a CycFormulaSentence.\nOriginal input: " + this.toString());
    }
    
    public CycFormulaSentence getCanonicalElSentence(final CycAccess access) throws UnknownHostException, IOException {
        return this.getCanonicalElSentence(access, getDefaultSimplifierMt(), true);
    }
    
    public CycFormulaSentence getCanonicalElSentence(final CycAccess access, final Boolean canonicalizeVars) throws UnknownHostException, IOException {
        return this.getCanonicalElSentence(access, getDefaultSimplifierMt(), canonicalizeVars);
    }
    
    public CycFormulaSentence getCanonicalElSentence(final CycAccess access, final ELMt mt, final Boolean canonicalizeVars) throws UnknownHostException, IOException {
        String command = null;
        try {
            command = "(canonicalize-el-sentence " + this.stringApiValue() + " " + mt.stringApiValue() + " " + DefaultCycObject.stringApiValue((Object)canonicalizeVars) + ")";
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        final Object rawResult = access.converseObject((Object)command);
        if (rawResult instanceof CycList) {
            final CycFormulaSentence result = new CycFormulaSentence((Iterable<?>)rawResult);
            return result;
        }
        throw new CycApiException("getCanonicalElSentence returned " + rawResult + ", which is not a CycFormulaSentence.\nOriginal input: " + this.toString());
    }
    
    public boolean hasWffConstraintViolations(final CycAccess access, final ELMt mt) {
        try {
            final String command = "(el-lenient-wff-assertible? " + this.stringApiValue() + " " + mt.stringApiValue() + ")";
            final Object rawResult = access.converseObject((Object)command);
            final boolean equalsT = CycObjectFactory.t.equals(rawResult);
            return !equalsT;
        }
        catch (Exception ex) {
            throw new CycApiException("Unable to decide whether " + this + " is well-formed in " + mt, (Throwable)ex);
        }
    }
    
    public String getNonWffAssertExplanation(final CycAccess access) {
        try {
            return this.getNonWffAssertExplanation(access, CycAccess.currentWorldDataMt);
        }
        catch (Exception ex) {
            throw new CycApiException("Unable to retrieve explanation for why " + this + " is not well-formed in " + CycAccess.currentWorldDataMt, (Throwable)ex);
        }
    }
    
    public String getNonWffAssertExplanation(final CycAccess access, final ELMt mt) {
        try {
            final String command = "(with-inference-mt-relevance " + mt.stringApiValue() + " (opencyc-explanation-of-why-not-wff-assert " + this.stringApiValue() + " " + mt.stringApiValue() + "))";
            final Object rawResult = access.converseObject((Object)command);
            if (rawResult instanceof String) {
                return (String)rawResult;
            }
            return null;
        }
        catch (Exception ex) {
            throw new CycApiException("Unable to retrieve explanation for why " + this + " is not well-formed in " + mt, (Throwable)ex);
        }
    }
    
    public String getNonWffExplanation(final CycAccess access) {
        return this.getNonWffExplanation(access, getDefaultSimplifierMt());
    }
    
    public String getNonWffExplanation(final CycAccess access, final ELMt mt) {
        try {
            final String command = "(with-inference-mt-relevance " + mt.stringApiValue() + " (opencyc-explanation-of-why-not-wff " + this.stringApiValue() + " " + mt.stringApiValue() + "))";
            final Object rawResult = access.converseObject((Object)command);
            if (rawResult instanceof String) {
                return (String)rawResult;
            }
            return null;
        }
        catch (Exception ex) {
            throw new CycApiException("Unable to retrieve explanation for why " + this + " is not well-formed in " + mt, (Throwable)ex);
        }
    }
    
    public String getNonWffExplanation(final ELMt mt) {
        return this.getNonWffExplanation(CycAccess.getCurrent(), mt);
    }
    
    public CycFormulaSentence deepCopy() {
        return new CycFormulaSentence(super.deepCopy().getArgsUnmodifiable());
    }
    
    public CycFormulaSentence substituteNonDestructive(final Object original, final Object replacement) {
        final Map<Object, Object> map = new HashMap<Object, Object>();
        map.put(original, replacement);
        return (CycFormulaSentence)this.applySubstitutionsNonDestructive((Map)map);
    }
    
    public void substituteDestructive(final Object original, final Object replacement) {
        final Map<Object, Object> map = new HashMap<Object, Object>();
        map.put(original, replacement);
        this.applySubstitutionsDestructive((Map)map);
    }
    
    public CycFormulaSentence treeSubstitute(final CycAccess access, final Map<CycObject, Object> substitutions) throws CycApiException, IOException {
        CycFormulaSentence result = this;
        if (substitutions != null) {
            for (final Map.Entry<CycObject, Object> entry : substitutions.entrySet()) {
                final CycObject oldTerm = entry.getKey();
                final Object newTerm = entry.getValue();
                final String command = SubLAPIHelper.makeSubLStmtWNartSubstitute("formula-subst", new Object[] { newTerm, oldTerm, result, CycFormulaSentence.EQUAL });
                result = access.converseSentence((Object)command);
            }
        }
        return result;
    }
    
    public CycFormulaSentence treeSubstitute(final Map<CycObject, Object> substitutions) throws CycApiException, IOException {
        return this.treeSubstitute(CycAccess.getCurrent(), substitutions);
    }
    
    public Object clone() {
        return new CycFormulaSentence((Iterable<?>)this.args);
    }
    
    public int compareTo(final Object o) {
        if (o instanceof CycFormulaSentence) {
            return this.args.compareTo((Object)((CycFormulaSentence)o).args);
        }
        return 0;
    }
    
    static {
        PPH_OPTIMIZED_NAMES_FOR_VARIABLES = CycObjectFactory.makeCycSymbol("pph-optimized-names-for-variables");
        EQUAL = CycObjectFactory.makeCycSymbol("equal");
        AND = CycAccess.and;
        THERE_EXISTS = CycAccess.thereExistsConst;
        FOR_ALL = CycAccess.forAllConst;
        OR = CycAccess.or;
        NOT = CycAccess.not;
        UNKNOWN_SENTENCE = new CycConstant("unknownSentence", new Guid("be1e5136-9c29-11b1-9dad-c379636f7270"));
        IMPLIES = CycAccess.impliesConst;
        LOGICAL_OPERATOR_FORTS = Collections.unmodifiableCollection((Collection<?>)Arrays.asList(CycFormulaSentence.AND, CycFormulaSentence.OR, CycFormulaSentence.NOT, CycFormulaSentence.UNKNOWN_SENTENCE, CycFormulaSentence.IMPLIES));
        CycFormulaSentence.simplifierMt = null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 202 ms
	
	Decompiled with Procyon 0.5.32.
*/