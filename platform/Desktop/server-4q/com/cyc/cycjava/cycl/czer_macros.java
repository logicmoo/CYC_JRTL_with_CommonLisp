package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class czer_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.czer_macros";
    public static final String myFingerPrint = "523b28e7eb7c8dcb88b7cc8c1d92e95805e194dfe1a715c4b81c3439afddf8ec";
    private static final SubLSymbol $sym0$WITH_MEMOIZATION_STATE;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$PROGN;
    private static final SubLSymbol $sym15$PUNLESS;
    private static final SubLSymbol $sym16$VALID_TENSE_CZER_MODE_P;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$_TENSE_CZER_MODE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 718L)
    public static SubLObject with_czer_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym0$WITH_MEMOIZATION_STATE, (SubLObject)czer_macros.$list1, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 852L)
    public static SubLObject with_new_czer_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list3, (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym0$WITH_MEMOIZATION_STATE, (SubLObject)czer_macros.$list1, ConsesLow.append(body, (SubLObject)czer_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1080L)
    public static SubLObject within_canonicalizer(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list4, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1182L)
    public static SubLObject within_negation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list5, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1298L)
    public static SubLObject within_disjunction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list6, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1455L)
    public static SubLObject within_conjunction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list7, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1685L)
    public static SubLObject within_assert(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list8, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1824L)
    public static SubLObject not_within_assert(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list9, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 2020L)
    public static SubLObject within_ask(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list10, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 2150L)
    public static SubLObject within_query(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list11, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 2280L)
    public static SubLObject within_tou_gaf(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)czer_macros.$list12, ConsesLow.append(body, (SubLObject)czer_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 2419L)
    public static SubLObject with_tense_czer_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = (SubLObject)czer_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)czer_macros.$list13);
        mode = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)czer_macros.$sym14$PROGN, (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym15$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)czer_macros.$sym16$VALID_TENSE_CZER_MODE_P, mode), (SubLObject)czer_macros.$list17), (SubLObject)ConsesLow.listS((SubLObject)czer_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)czer_macros.$sym18$_TENSE_CZER_MODE_, mode)), ConsesLow.append(body, (SubLObject)czer_macros.NIL)));
    }
    
    public static SubLObject declare_czer_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "with_czer_memoization_state", "WITH-CZER-MEMOIZATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "with_new_czer_memoization_state", "WITH-NEW-CZER-MEMOIZATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "within_canonicalizer", "WITHIN-CANONICALIZER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "within_negation", "WITHIN-NEGATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "within_disjunction", "WITHIN-DISJUNCTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "within_conjunction", "WITHIN-CONJUNCTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "within_assert", "WITHIN-ASSERT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "not_within_assert", "NOT-WITHIN-ASSERT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "within_ask", "WITHIN-ASK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "within_query", "WITHIN-QUERY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "within_tou_gaf", "WITHIN-TOU-GAF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.czer_macros", "with_tense_czer_mode", "WITH-TENSE-CZER-MODE");
        return (SubLObject)czer_macros.NIL;
    }
    
    public static SubLObject init_czer_macros_file() {
        return (SubLObject)czer_macros.NIL;
    }
    
    public static SubLObject setup_czer_macros_file() {
        return (SubLObject)czer_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_czer_macros_file();
    }
    
    public void initializeVariables() {
        init_czer_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_czer_macros_file();
    }
    
    static {
        me = (SubLFile)new czer_macros();
        $sym0$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CZER-MEMOIZATION-STATE*"));
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CZER-MEMOIZATION-STATE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MEMOIZATION-STATE"), (SubLObject)SubLObjectFactory.makeString("czer memoization state"))));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-CANONICALIZER?*"), (SubLObject)czer_macros.T));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-NEGATION?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-NEGATION?*"))));
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-DISJUNCTION?*"), (SubLObject)czer_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-NEGATED-DISJUNCTION?*"), (SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-NEGATION?*")));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-CONJUNCTION?*"), (SubLObject)czer_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-NEGATED-CONJUNCTION?*"), (SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-NEGATION?*")));
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-ASSERT*"), (SubLObject)czer_macros.T));
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-ASSERT*"), (SubLObject)czer_macros.NIL));
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-ASK*"), (SubLObject)czer_macros.T));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-QUERY*"), (SubLObject)czer_macros.T));
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-TOU-GAF?*"), (SubLObject)czer_macros.T));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym14$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym15$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym16$VALID_TENSE_CZER_MODE_P = SubLObjectFactory.makeSymbol("VALID-TENSE-CZER-MODE-P");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Cannot set tense czer to invalid mode.")));
        $sym18$_TENSE_CZER_MODE_ = SubLObjectFactory.makeSymbol("*TENSE-CZER-MODE*");
    }
}

/*

	Total time: 147 ms
	
*/