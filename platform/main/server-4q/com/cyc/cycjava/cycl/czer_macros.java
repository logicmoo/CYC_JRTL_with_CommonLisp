package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.czer_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.czer_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class czer_macros extends SubLTranslatedFile {
    public static final SubLFile me = new czer_macros();

    public static final String myName = "com.cyc.cycjava.cycl.czer_macros";

    public static final String myFingerPrint = "523b28e7eb7c8dcb88b7cc8c1d92e95805e194dfe1a715c4b81c3439afddf8ec";



    public static final SubLList $list1 = list(makeSymbol("*CZER-MEMOIZATION-STATE*"));



    public static final SubLList $list3 = list(list(makeSymbol("*CZER-MEMOIZATION-STATE*"), list(makeSymbol("NEW-MEMOIZATION-STATE"), makeString("czer memoization state"))));

    public static final SubLList $list4 = list(list(makeSymbol("*WITHIN-CANONICALIZER?*"), T));

    public static final SubLList $list5 = list(list(makeSymbol("*WITHIN-NEGATION?*"), list(makeSymbol("CNOT"), makeSymbol("*WITHIN-NEGATION?*"))));

    public static final SubLList $list6 = list(list(makeSymbol("*WITHIN-DISJUNCTION?*"), T), list(makeSymbol("*WITHIN-NEGATED-DISJUNCTION?*"), makeSymbol("*WITHIN-NEGATION?*")));

    public static final SubLList $list7 = list(list(makeSymbol("*WITHIN-CONJUNCTION?*"), T), list(makeSymbol("*WITHIN-NEGATED-CONJUNCTION?*"), makeSymbol("*WITHIN-NEGATION?*")));

    public static final SubLList $list8 = list(list(makeSymbol("*WITHIN-ASSERT*"), T));

    public static final SubLList $list9 = list(list(makeSymbol("*WITHIN-ASSERT*"), NIL));

    public static final SubLList $list10 = list(list(makeSymbol("*WITHIN-ASK*"), T));

    public static final SubLList $list11 = list(list(makeSymbol("*WITHIN-QUERY*"), T));

    public static final SubLList $list12 = list(list(makeSymbol("*WITHIN-TOU-GAF?*"), T));

    public static final SubLList $list13 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));





    public static final SubLSymbol VALID_TENSE_CZER_MODE_P = makeSymbol("VALID-TENSE-CZER-MODE-P");

    public static final SubLList $list17 = list(list(makeSymbol("ERROR"), makeString("Cannot set tense czer to invalid mode.")));

    public static final SubLSymbol $tense_czer_mode$ = makeSymbol("*TENSE-CZER-MODE*");

    public static SubLObject with_czer_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_MEMOIZATION_STATE, $list1, append(body, NIL));
    }

    public static SubLObject with_new_czer_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list3, listS(WITH_MEMOIZATION_STATE, $list1, append(body, NIL)));
    }

    public static SubLObject within_canonicalizer(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static SubLObject within_negation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list5, append(body, NIL));
    }

    public static SubLObject within_disjunction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

    public static SubLObject within_conjunction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list7, append(body, NIL));
    }

    public static SubLObject within_assert(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list8, append(body, NIL));
    }

    public static SubLObject not_within_assert(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list9, append(body, NIL));
    }

    public static SubLObject within_ask(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list10, append(body, NIL));
    }

    public static SubLObject within_query(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list11, append(body, NIL));
    }

    public static SubLObject within_tou_gaf(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list12, append(body, NIL));
    }

    public static SubLObject with_tense_czer_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        mode = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(PUNLESS, list(VALID_TENSE_CZER_MODE_P, mode), $list17), listS(CLET, list(list($tense_czer_mode$, mode)), append(body, NIL)));
    }

    public static SubLObject declare_czer_macros_file() {
        declareMacro(me, "with_czer_memoization_state", "WITH-CZER-MEMOIZATION-STATE");
        declareMacro(me, "with_new_czer_memoization_state", "WITH-NEW-CZER-MEMOIZATION-STATE");
        declareMacro(me, "within_canonicalizer", "WITHIN-CANONICALIZER");
        declareMacro(me, "within_negation", "WITHIN-NEGATION");
        declareMacro(me, "within_disjunction", "WITHIN-DISJUNCTION");
        declareMacro(me, "within_conjunction", "WITHIN-CONJUNCTION");
        declareMacro(me, "within_assert", "WITHIN-ASSERT");
        declareMacro(me, "not_within_assert", "NOT-WITHIN-ASSERT");
        declareMacro(me, "within_ask", "WITHIN-ASK");
        declareMacro(me, "within_query", "WITHIN-QUERY");
        declareMacro(me, "within_tou_gaf", "WITHIN-TOU-GAF");
        declareMacro(me, "with_tense_czer_mode", "WITH-TENSE-CZER-MODE");
        return NIL;
    }

    public static SubLObject init_czer_macros_file() {
        return NIL;
    }

    public static SubLObject setup_czer_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_czer_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_czer_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_czer_macros_file();
    }

    static {




















    }
}

/**
 * Total time: 147 ms
 */
