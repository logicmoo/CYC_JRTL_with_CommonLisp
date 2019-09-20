package org.opencyc.parser;

import java.util.Iterator;
import org.opencyc.api.CycObjectFactory;
import java.util.List;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.DefaultCycObject;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycFormulaSentence;
import org.opencyc.cycobject.CycList;
import org.opencyc.api.CycApiServerSideException;
import org.opencyc.api.CycApiException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.opencyc.api.CycAccess;

public class CycLParserUtil
{
    private static String TEST_CYC_MACHINE;
    private static int TEST_CYC_PORT;
    
    public static Object parseCycLTerm(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        return parseCycLTerm(new StringReader(toParse), testForEOF, access);
    }
    
    public static Object parseCycLTerm(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        final CycLParser parser = new CycLParser(reader, access);
        return completeConstants(parser.term(testForEOF), access);
    }
    
    public static CycList parseCycLTermList(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        return parseCycLTermList(new StringReader(toParse), testForEOF, access);
    }
    
    public static CycList parseCycLTermList(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        final CycLParser parser = new CycLParser(reader, access);
        return (CycList)completeConstants(parser.termList(testForEOF), access);
    }
    
    public static CycFormulaSentence parseCycLSentence(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        return parseCycLSentence(new StringReader(toParse), testForEOF, access);
    }
    
    public static CycFormulaSentence parseCycLSentence(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        final CycLParser parser = new CycLParser(reader, access);
        return new CycFormulaSentence((Iterable)completeConstants(parser.sentence(testForEOF), access));
    }
    
    public static String parseCycLString(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, TokenMgrError {
        return parseCycLString(new StringReader(toParse), testForEOF, access);
    }
    
    public static String parseCycLString(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, TokenMgrError {
        final CycLParser parser = new CycLParser(reader, access);
        return parser.string(testForEOF);
    }
    
    public static Number parseCycLNumber(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, TokenMgrError {
        return parseCycLNumber(new StringReader(toParse), testForEOF, access);
    }
    
    public static Number parseCycLNumber(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, TokenMgrError {
        final CycLParser parser = new CycLParser(reader, access);
        return parser.number(testForEOF);
    }
    
    public static CycConstant parseCycLConstant(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        return parseCycLConstant(new StringReader(toParse), testForEOF, access);
    }
    
    public static CycConstant parseCycLConstant(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        final CycLParser parser = new CycLParser(reader, access);
        return (CycConstant)completeConstants(parser.constant(testForEOF), access);
    }
    
    public static CycVariable parseCycLVariable(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, TokenMgrError {
        return parseCycLVariable(new StringReader(toParse), testForEOF, access);
    }
    
    public static CycVariable parseCycLVariable(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, TokenMgrError {
        final CycLParser parser = new CycLParser(reader, access);
        return parser.variable(testForEOF);
    }
    
    public static Object parseCycLDenotationalTerm(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        return parseCycLDenotationalTerm(new StringReader(toParse), testForEOF, access);
    }
    
    public static Object parseCycLDenotationalTerm(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        final CycLParser parser = new CycLParser(reader, access);
        return completeConstants(parser.denotationalTerm(testForEOF), access);
    }
    
    public static CycFort parseCycLFORT(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        return parseCycLFORT(new StringReader(toParse), testForEOF, access);
    }
    
    public static CycFort parseCycLFORT(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        final Object result = parseCycLDenotationalTerm(reader, testForEOF, access);
        if (result instanceof CycList) {
            final Object result2 = access.getHLCycTerm(DefaultCycObject.cyclify(result));
            if (!(result2 instanceof CycNart)) {
                throw new RuntimeException("Unknown fort: " + result);
            }
            return (CycFort)result2;
        }
        else {
            if (result instanceof CycConstant) {
                return (CycFort)result;
            }
            if (result instanceof CycNart) {
                return (CycFort)result;
            }
            throw new RuntimeException("Unable to find appropriate FORT.");
        }
    }
    
    public static Object nartSubstitute(final Object cyclObject, final CycAccess access) throws IOException {
        if (!DefaultCycObject.isCycLObject(cyclObject)) {
            throw new RuntimeException(DefaultCycObject.cyclify(cyclObject) + " is not a valid Cyc object.");
        }
        if (!(cyclObject instanceof CycObject)) {
            return cyclObject;
        }
        return access.converseObject((Object)("(nart-substitute  '" + DefaultCycObject.cyclifyWithEscapeChars(cyclObject, true) + ")"));
    }
    
    public static Object toHL(final Object cyclObject, final CycAccess access) throws IOException {
        if (!DefaultCycObject.isCycLObject(cyclObject)) {
            throw new RuntimeException(DefaultCycObject.cyclify(cyclObject) + " is not a valid Cyc object.");
        }
        if (!(cyclObject instanceof CycObject)) {
            return cyclObject;
        }
        return access.converseObject((Object)("(canonicalize-term  '" + DefaultCycObject.cyclifyWithEscapeChars(cyclObject, true) + ")"));
    }
    
    public static Object parseCycLNonAtomicDenotationalTerm(final String toParse, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        return parseCycLNonAtomicDenotationalTerm(new StringReader(toParse), testForEOF, access);
    }
    
    public static Object parseCycLNonAtomicDenotationalTerm(final Reader reader, final boolean testForEOF, final CycAccess access) throws ParseException, IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException, TokenMgrError {
        final CycLParser parser = new CycLParser(reader, access);
        return completeConstants(parser.nonAtomicDenotationalTerm(testForEOF), access);
    }
    
    public static Object completeConstants(final Object obj, final CycAccess access) throws IOException, CycApiException, CycApiServerSideException, InvalidConstantNameException, InvalidConstantGuidException, UnsupportedVocabularyException {
        final List allConstants = DefaultCycObject.getReferencedConstants(obj);
        if (allConstants == null || allConstants.size() == 0) {
            return obj;
        }
        CycList incompleteConstantsWithNames = null;
        CycList incompleteConstantsWithGuids = null;
        for (final CycConstant curConst : (Iterable<CycConstant>) allConstants) {
            if (curConst.name == null && curConst.guid == null) {
                throw new IllegalArgumentException("Can't deal with completely bare constants.");
            }
            if (curConst.name == null) {
                if (incompleteConstantsWithGuids == null) {
                    incompleteConstantsWithGuids = new CycList();
                }
                incompleteConstantsWithGuids.add((Object)curConst);
            }
            if (curConst.guid != null) {
                continue;
            }
            if (incompleteConstantsWithNames == null) {
                incompleteConstantsWithNames = new CycList();
            }
            incompleteConstantsWithNames.add((Object)curConst);
        }
        List cycConstants = access.findConstantsForNames((List)incompleteConstantsWithNames);
        if (cycConstants != null && incompleteConstantsWithNames != null) {
            InvalidConstantNameException icne = null;
            final Iterator iter2 = cycConstants.iterator();
            final Iterator oldIter = incompleteConstantsWithNames.iterator();
            while (iter2.hasNext()) {
                final Object curConstant = iter2.next();
                final CycConstant oldConstant = (CycConstant) oldIter.next();
                if (!(curConstant instanceof CycConstant)) {
                    if (icne == null) {
                        icne = new InvalidConstantNameException();
                    }
                    icne.addInvalidConstantName(oldConstant.getName());
                }
                else {
                    oldConstant.setGuid(((CycConstant)curConstant).getGuid());
                    CycObjectFactory.addCycConstantCache(oldConstant);
                }
            }
            if (icne != null) {
                throw icne;
            }
        }
        cycConstants = access.findConstantsForGuids((List)incompleteConstantsWithGuids);
        if (cycConstants != null && incompleteConstantsWithGuids != null) {
            InvalidConstantGuidException icge = null;
            final Iterator iter2 = cycConstants.iterator();
            final Iterator oldIter = incompleteConstantsWithGuids.iterator();
            while (iter2.hasNext()) {
                final Object curConstant = iter2.next();
                final CycConstant oldConstant = (CycConstant) oldIter.next();
                if (!(curConstant instanceof CycConstant)) {
                    if (icge == null) {
                        icge = new InvalidConstantGuidException();
                    }
                    icge.addInvalidConstantGuid(oldConstant.getGuid());
                }
                else {
                    oldConstant.setName(((CycConstant)curConstant).getName());
                    CycObjectFactory.addCycConstantCache(oldConstant);
                }
            }
            if (icge != null) {
                throw icge;
            }
        }
        for (final CycConstant curConst2 :(Iterable<CycConstant>) allConstants) {
            if (CycAccess.sublQuoteFnConst.guid.equals((Object)curConst2.getGuid())) {
                throw new UnsupportedVocabularyException(CycAccess.sublQuoteFnConst);
            }
            if (CycAccess.expandSubLFnConst.guid.equals((Object)curConst2.getGuid())) {
                throw new UnsupportedVocabularyException(CycAccess.expandSubLFnConst);
            }
        }
        return obj;
    }
    
    protected static void sanityCheck() {
        try {
            final CycAccess access = new CycAccess(CycLParserUtil.TEST_CYC_MACHINE, CycLParserUtil.TEST_CYC_PORT);
            Object obj = parseCycLConstant("Dog", true, access);
            System.out.println("Got result: " + obj);
            obj = parseCycLConstant("#G\"bd590573-9c29-11b1-9dad-c379636f7270\"", true, access);
            System.out.println("Got result: " + obj);
            try {
                obj = parseCycLConstant("Dogqweqr", true, access);
                System.out.println("Got result: " + obj);
            }
            catch (Exception e) {
                e.printStackTrace(System.out);
            }
            try {
                obj = parseCycLConstant("#G\"bd590573-9c29-11b1-9dad-c379636f7279\"", true, access);
                System.out.println("Got result: " + obj);
            }
            catch (Exception e) {
                e.printStackTrace(System.out);
            }
            try {
                obj = parseCycLFORT("(FruitFn AppleTree)", true, access);
                System.out.println("Got FORT: " + obj);
            }
            catch (Exception e) {
                e.printStackTrace(System.out);
            }
            try {
                obj = parseCycLDenotationalTerm("(FruitFn AppleTree)", true, access);
                System.out.println("Got FORT: " + obj + " of type: " + obj.getClass());
                obj = nartSubstitute(obj, access);
                System.out.println("Got FORT: " + obj + " of type: " + obj.getClass());
                obj = toHL(obj, access);
                System.out.println("Got FORT: " + obj + " of type: " + obj.getClass());
                obj = nartSubstitute("\"", access);
                System.out.println("Got single double quote string as: " + obj);
                obj = toHL("\"", access);
                System.out.println("Got single double quote string as: " + obj);
            }
            catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        catch (Exception e2) {
            e2.printStackTrace();
            System.out.println("Finished abnormally");
            System.exit(-1);
        }
    }
    
    public static void main(final String[] args) {
        System.out.println("Starting");
        try {
            sanityCheck();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Finished abnormally");
            System.exit(-1);
        }
        System.out.println("Finished");
        System.exit(0);
    }
    
    static {
        CycLParserUtil.TEST_CYC_MACHINE = "localhost";
        CycLParserUtil.TEST_CYC_PORT = 3660;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 109 ms
	
	Decompiled with Procyon 0.5.32.
*/