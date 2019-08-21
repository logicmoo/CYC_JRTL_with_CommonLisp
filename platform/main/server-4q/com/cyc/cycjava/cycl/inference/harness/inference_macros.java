package com.cyc.cycjava.cycl.inference.harness;


import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.inference.harness.inference_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class inference_macros extends SubLTranslatedFile {
    public static final SubLFile me = new inference_macros();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_macros";

    public static final String myFingerPrint = "e0262c5ae6eab43218eb3a8aeec595534794dedcd6d3f2dfeb492b03196ade88";





    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("INFERENCE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));









    public static final SubLSymbol DESTROY_INFERENCE_AND_PROBLEM_STORE = makeSymbol("DESTROY-INFERENCE-AND-PROBLEM-STORE");

    public static final SubLList $list6 = list(list(makeSymbol("PROBLEM-STORE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DESTROY_PROBLEM_STORE = makeSymbol("DESTROY-PROBLEM-STORE");

    public static final SubLList $list8 = list(list(makeSymbol("PROBLEM-STORE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol WITH_PROBLEM_STORE_VAR = makeSymbol("WITH-PROBLEM-STORE-VAR");



    public static final SubLSymbol NEW_PROBLEM_STORE = makeSymbol("NEW-PROBLEM-STORE");

    public static final SubLList $list12 = list(list(makeSymbol("LINK-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list13 = list(makeKeyword("TYPE"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    public static final SubLSymbol PROBLEM_ARGUMENT_LINKS = makeSymbol("PROBLEM-ARGUMENT-LINKS");

    public static final SubLSymbol DO_PROBLEM_ARGUMENT_LINKS = makeSymbol("DO-PROBLEM-ARGUMENT-LINKS");



    public static final SubLSymbol $sym21$PROBLEM_LINK_HAS_TYPE_ = makeSymbol("PROBLEM-LINK-HAS-TYPE?");

    public static final SubLList $list22 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list23 = list(makeKeyword("OPEN?"), makeKeyword("DONE"));



    public static final SubLSymbol $sym25$LINK_VAR = makeUninternedSymbol("LINK-VAR");



    public static final SubLSymbol PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");

    public static final SubLSymbol $sym28$DO_PROBLEM_LINK_OPEN_MATCH_ = makeSymbol("DO-PROBLEM-LINK-OPEN-MATCH?");

    public static final SubLSymbol DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");

    public static final SubLList $list30 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list31 = list(ZERO_INTEGER);



    public static final SubLList $list33 = list(list(makeSymbol("SUPPORTING-PROBLEM-VAR"), makeSymbol("VARIABLE-MAP-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym34$SUPPORTING_MAPPED_PROBLEM = makeUninternedSymbol("SUPPORTING-MAPPED-PROBLEM");

    public static final SubLSymbol MAPPED_PROBLEM_PROBLEM = makeSymbol("MAPPED-PROBLEM-PROBLEM");

    public static final SubLSymbol MAPPED_PROBLEM_VARIABLE_MAP = makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP");

    public static final SubLList $list37 = list(list(makeSymbol("SIBLING-LINK-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list38 = list(makeKeyword("DONE"));

    public static final SubLSymbol $sym39$SUPPORTED_PROBLEM = makeUninternedSymbol("SUPPORTED-PROBLEM");

    public static final SubLSymbol $sym40$LINK_VAR = makeUninternedSymbol("LINK-VAR");

    public static final SubLSymbol PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");



    public static final SubLList $list43 = list(list(makeSymbol("DEPENDENT-LINK-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("LINK-TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list44 = list(makeKeyword("LINK-TYPE"), makeKeyword("DONE"));



    public static final SubLSymbol $sym46$SUPPORTED_PROBLEM = makeUninternedSymbol("SUPPORTED-PROBLEM");

    public static final SubLSymbol DO_PROBLEM_DEPENDENT_LINKS = makeSymbol("DO-PROBLEM-DEPENDENT-LINKS");

    public static final SubLList $list48 = list(list(makeSymbol("ARGUMENT-LINK-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("LINK-TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list49 = list(makeKeyword("OPEN?"), makeKeyword("LINK-TYPE"), makeKeyword("DONE"));

    public static final SubLSymbol $sym50$SUPPORTING_PROBLEM = makeUninternedSymbol("SUPPORTING-PROBLEM");

    public static final SubLSymbol $sym51$VARIABLE_MAP = makeUninternedSymbol("VARIABLE-MAP");

    public static final SubLSymbol DO_PROBLEM_LINK_SUPPORTING_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");



    public static final SubLList $list54 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list55 = list(makeKeyword("PROOF-STATUS"));





    public static final SubLSymbol PROBLEM_LINK_PROOFS = makeSymbol("PROBLEM-LINK-PROOFS");

    public static final SubLSymbol $sym59$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");

    private static final SubLList $list60 = list(list(makeSymbol("RT-LINK-VAR"), makeSymbol("JO-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym61$JO_LINK_VAR = makeUninternedSymbol("JO-LINK-VAR");

    private static final SubLSymbol $sym62$MOTIVATING_CONJUNCTION_PROBLEM = makeUninternedSymbol("MOTIVATING-CONJUNCTION-PROBLEM");



    private static final SubLSymbol $sym64$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_JOIN_ORDERED_LINK_ = makeSymbol("RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-JOIN-ORDERED-LINK?");

    private static final SubLList $list65 = list(list(makeSymbol("RT-LINK-VAR"), makeSymbol("T-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym66$T_LINK_VAR = makeUninternedSymbol("T-LINK-VAR");

    private static final SubLSymbol $sym67$JO_LINK_VAR = makeUninternedSymbol("JO-LINK-VAR");

    private static final SubLSymbol DO_PROBLEM_LINK_DEPENDENT_LINKS = makeSymbol("DO-PROBLEM-LINK-DEPENDENT-LINKS");



    private static final SubLSymbol DO_JOIN_ORDERED_LINK_MOTIVATED_RESIDUAL_TRANSFORMATION_LINKS = makeSymbol("DO-JOIN-ORDERED-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS");

    private static final SubLSymbol $sym71$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_TRANSFORMATION_LINK_ = makeSymbol("RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-TRANSFORMATION-LINK?");

    private static final SubLList $list72 = list(list(makeSymbol("*CURRENT-FORWARD-PROBLEM-STORE*"), NIL));

    public static final SubLList $list73 = list(list(makeSymbol("CLEAR-CURRENT-FORWARD-PROBLEM-STORE")));

    private static final SubLList $list74 = list(list(makeSymbol("*TYPE-FILTER-FORWARD-DNF*"), T));

    private static final SubLList $list75 = list(makeSymbol("RULES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $forward_inference_allowed_rules$ = makeSymbol("*FORWARD-INFERENCE-ALLOWED-RULES*");

    private static final SubLSymbol WITH_FORWARD_INFERENCE_ALLOWED_RULES = makeSymbol("WITH-FORWARD-INFERENCE-ALLOWED-RULES");



    private static final SubLSymbol $forward_inference_forbidden_rules$ = makeSymbol("*FORWARD-INFERENCE-FORBIDDEN-RULES*");

    private static final SubLSymbol WITH_FORWARD_INFERENCE_FORBIDDEN_RULES = makeSymbol("WITH-FORWARD-INFERENCE-FORBIDDEN-RULES");





    public static final SubLList $list83 = list(makeSymbol("INFERENCE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $controlling_inferences$ = makeSymbol("*CONTROLLING-INFERENCES*");



    private static final SubLList $list86 = list(makeSymbol("*CONTROLLING-INFERENCES*"));

    private static final SubLSymbol WITHIN_CONTROLLING_INFERENCE = makeSymbol("WITHIN-CONTROLLING-INFERENCE");

    private static final SubLSymbol WITHIN_NO_CONTROLLING_STRATEGY = makeSymbol("WITHIN-NO-CONTROLLING-STRATEGY");

    private static final SubLList $list89 = list(makeSymbol("STRATEGY"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $controlling_strategy$ = makeSymbol("*CONTROLLING-STRATEGY*");

    private static final SubLSymbol WITHIN_CONTROLLING_STRATEGY = makeSymbol("WITHIN-CONTROLLING-STRATEGY");

    private static final SubLList $list92 = list(list(makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $sym94$GATHER_TICK_DATA_ = makeUninternedSymbol("GATHER-TICK-DATA?");

    private static final SubLSymbol $sym95$INITIAL_ARETE_TERMS_TOUCHED_COUNT = makeUninternedSymbol("INITIAL-ARETE-TERMS-TOUCHED-COUNT");

    private static final SubLSymbol $sym96$INITIAL_ARETE_ASSERTIONS_TOUCHED_COUNT = makeUninternedSymbol("INITIAL-ARETE-ASSERTIONS-TOUCHED-COUNT");

    private static final SubLSymbol $sym97$INITIAL_ARETE_LOG_LAST_KB_TOUCH_ = makeUninternedSymbol("INITIAL-ARETE-LOG-LAST-KB-TOUCH?");

    private static final SubLSymbol $sym98$INITIAL_ARETE_LOG_KB_TOUCH_COUNTS_ = makeUninternedSymbol("INITIAL-ARETE-LOG-KB-TOUCH-COUNTS?");

    private static final SubLSymbol $sym99$FINAL_ARETE_TERMS_TOUCHED_COUNT = makeUninternedSymbol("FINAL-ARETE-TERMS-TOUCHED-COUNT");

    private static final SubLSymbol $sym100$FINAL_ARETE_ASSERTIONS_TOUCHED_COUNT = makeUninternedSymbol("FINAL-ARETE-ASSERTIONS-TOUCHED-COUNT");

    private static final SubLSymbol $sym101$INFERENCE_GATHERS_TICK_INDEXED_PROGRESS_DATA_ = makeSymbol("INFERENCE-GATHERS-TICK-INDEXED-PROGRESS-DATA?");

    public static final SubLList $list102 = list(makeSymbol("*ARETE-TERMS-TOUCHED-COUNT*"));

    private static final SubLList $list103 = list(makeSymbol("*ARETE-ASSERTIONS-TOUCHED-COUNT*"));

    private static final SubLList $list104 = list(makeSymbol("*ARETE-LOG-LAST-KB-TOUCH?*"));

    private static final SubLList $list105 = list(makeSymbol("*ARETE-LOG-KB-TOUCH-COUNTS?*"));

    private static final SubLSymbol $arete_terms_touched_count$ = makeSymbol("*ARETE-TERMS-TOUCHED-COUNT*");



    private static final SubLSymbol $arete_assertions_touched_count$ = makeSymbol("*ARETE-ASSERTIONS-TOUCHED-COUNT*");

    private static final SubLSymbol $sym109$_ARETE_LOG_LAST_KB_TOUCH__ = makeSymbol("*ARETE-LOG-LAST-KB-TOUCH?*");

    private static final SubLSymbol $sym110$_ARETE_LOG_KB_TOUCH_COUNTS__ = makeSymbol("*ARETE-LOG-KB-TOUCH-COUNTS?*");

    private static final SubLSymbol $sym111$_ = makeSymbol("+");

    private static final SubLSymbol $sym112$GATHER_TICK_DATA_ = makeUninternedSymbol("GATHER-TICK-DATA?");

    private static final SubLSymbol $sym113$INITIAL_ARETE_ASSERTIONS_TOUCHED = makeUninternedSymbol("INITIAL-ARETE-ASSERTIONS-TOUCHED");

    private static final SubLSymbol $sym114$INITIAL_ARETE_CONSTANTS_TOUCHED = makeUninternedSymbol("INITIAL-ARETE-CONSTANTS-TOUCHED");

    private static final SubLSymbol $sym115$INITIAL_ARETE_NARTS_TOUCHED = makeUninternedSymbol("INITIAL-ARETE-NARTS-TOUCHED");

    private static final SubLSymbol $sym116$INITIAL_ARETE_LOG_LAST_KB_TOUCH_ = makeUninternedSymbol("INITIAL-ARETE-LOG-LAST-KB-TOUCH?");

    private static final SubLSymbol $sym117$INITIAL_ARETE_LOG_KB_TOUCHES_ = makeUninternedSymbol("INITIAL-ARETE-LOG-KB-TOUCHES?");

    private static final SubLSymbol $sym118$FINAL_ARETE_ASSERTIONS_TOUCHED = makeUninternedSymbol("FINAL-ARETE-ASSERTIONS-TOUCHED");

    private static final SubLSymbol $sym119$FINAL_ARETE_CONSTANTS_TOUCHED = makeUninternedSymbol("FINAL-ARETE-CONSTANTS-TOUCHED");

    private static final SubLSymbol $sym120$FINAL_ARETE_NARTS_TOUCHED = makeUninternedSymbol("FINAL-ARETE-NARTS-TOUCHED");

    private static final SubLSymbol $sym121$INFERENCE_SHOULD_GATHER_TICK_INDEXED_PROGRESS_DATA_ = makeSymbol("INFERENCE-SHOULD-GATHER-TICK-INDEXED-PROGRESS-DATA?");

    public static final SubLList $list122 = list(makeSymbol("*ARETE-ASSERTIONS-TOUCHED*"));

    private static final SubLList $list123 = list(makeSymbol("*ARETE-CONSTANTS-TOUCHED*"));

    private static final SubLList $list124 = list(makeSymbol("*ARETE-NARTS-TOUCHED*"));

    private static final SubLList $list125 = list(makeSymbol("*ARETE-LOG-KB-TOUCHES?*"));

    private static final SubLSymbol $arete_assertions_touched$ = makeSymbol("*ARETE-ASSERTIONS-TOUCHED*");

    public static final SubLList $list127 = list(makeSymbol("NEW-SET"));

    private static final SubLSymbol $arete_constants_touched$ = makeSymbol("*ARETE-CONSTANTS-TOUCHED*");

    private static final SubLSymbol $arete_narts_touched$ = makeSymbol("*ARETE-NARTS-TOUCHED*");

    private static final SubLSymbol $sym130$_ARETE_LOG_KB_TOUCHES__ = makeSymbol("*ARETE-LOG-KB-TOUCHES?*");

    private static final SubLSymbol SET_NMERGE = makeSymbol("SET-NMERGE");

    private static final SubLList $list132 = list(list(makeSymbol("DISJUNCT-VAR"), makeSymbol("PATTERN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym133$PATTERN_VAR = makeUninternedSymbol("PATTERN-VAR");



    private static final SubLSymbol OR_PATTERN_P = makeSymbol("OR-PATTERN-P");



    private static final SubLList $list137 = list(list(makeSymbol("QUERY-INFO-VAR"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list138 = list(makeKeyword("ELEMENT-NUM"), makeKeyword("DONE?"));





    private static final SubLSymbol $sym141$DONE_VAR_ = makeUninternedSymbol("DONE-VAR?");

    private static final SubLSymbol $sym142$I = makeUninternedSymbol("I");

    private static final SubLSymbol $sym143$INPUT_STREAM = makeUninternedSymbol("INPUT-STREAM");

    private static final SubLList $list144 = list(NIL);



    private static final SubLList $list146 = list(makeKeyword("INPUT"));

    private static final SubLSymbol WITH_CFASL_COMMON_SYMBOLS = makeSymbol("WITH-CFASL-COMMON-SYMBOLS");

    private static final SubLList $list148 = list(makeSymbol("ASKED-QUERY-COMMON-SYMBOLS"));



    private static final SubLSymbol LOAD_ASKED_QUERY_FROM_STREAM = makeSymbol("LOAD-ASKED-QUERY-FROM-STREAM");





    private static final SubLList $list153 = list(T);





    private static final SubLString $str156$Read_invalid_query_info__s = makeString("Read invalid query info ~s");

    private static final SubLList $list157 = list(list(makeSymbol("QUERY-INFO-VAR"), makeSymbol("FILENAME-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list158 = list(makeKeyword("DONE?"));

    private static final SubLSymbol DO_DIRECTORY_CONTENTS = makeSymbol("DO-DIRECTORY-CONTENTS");

    private static final SubLSymbol $sym160$ASKED_QUERIES_FILENAME_ = makeSymbol("ASKED-QUERIES-FILENAME?");

    private static final SubLSymbol DO_ASKED_QUERIES = makeSymbol("DO-ASKED-QUERIES");

    private static final SubLList $list162 = list(new SubLObject[]{ makeSymbol("TRACE-LEVEL"), makeSymbol("CONTROL-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"), makeSymbol("ARG5"), makeSymbol("ARG6"), makeSymbol("ARG7"), makeSymbol("ARG8") });

    private static final SubLSymbol $sym163$__ = makeSymbol(">=");

    private static final SubLSymbol $inference_trace_level$ = makeSymbol("*INFERENCE-TRACE-LEVEL*");

    private static final SubLSymbol FORCE_FORMAT = makeSymbol("FORCE-FORMAT");

    public static final SubLSymbol $pad_metrics_data$ = makeSymbol("*PAD-METRICS-DATA*");

	public static final SubLSymbol $pad_gathering_metricsP$ = makeSymbol("*PAD-GATHERING-METRICS*");

    public static SubLObject with_inference_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_var = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        inference_var = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list0);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(inference_var) : "Types.symbolp(inference_var) " + "CommonSymbols.NIL != Types.symbolp(inference_var) " + inference_var;
        return list(CLET, list(inference_var), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(DESTROY_INFERENCE_AND_PROBLEM_STORE, inference_var)));
    }

    public static SubLObject with_problem_store_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_store_var = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        problem_store_var = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list6);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(problem_store_var) : "Types.symbolp(problem_store_var) " + "CommonSymbols.NIL != Types.symbolp(problem_store_var) " + problem_store_var;
        return list(CLET, list(problem_store_var), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(DESTROY_PROBLEM_STORE, problem_store_var)));
    }

    public static SubLObject with_new_problem_store(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_store_var = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        problem_store_var = current.first();
        current = current.rest();
        final SubLObject v_properties = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list8);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list8);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(problem_store_var) : "Types.symbolp(problem_store_var) " + "CommonSymbols.NIL != Types.symbolp(problem_store_var) " + problem_store_var;
        return listS(WITH_PROBLEM_STORE_VAR, list(problem_store_var), list(CSETQ, problem_store_var, list(NEW_PROBLEM_STORE, v_properties)), append(body, NIL));
    }

    public static SubLObject do_problem_argument_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list12);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list12);
            if (NIL == member(current_$1, $list13, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list12);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == type) {
            return listS(DO_SET_CONTENTS, list(link_var, list(PROBLEM_ARGUMENT_LINKS, problem), $DONE, done), append(body, NIL));
        }
        return list(DO_PROBLEM_ARGUMENT_LINKS, list(link_var, problem, $DONE, done), listS(PWHEN, list($sym21$PROBLEM_LINK_HAS_TYPE_, link_var, type), append(body, NIL)));
    }

    public static SubLObject do_problem_link_supporting_mapped_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_mapped_problem_var = NIL;
        SubLObject link = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        supporting_mapped_problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list22);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list22);
            if (NIL == member(current_$2, $list23, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list22);
        }
        final SubLObject openP_tail = property_list_member($OPEN_, current);
        final SubLObject openP = (NIL != openP_tail) ? cadr(openP_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject link_var = $sym25$LINK_VAR;
        return list(CLET, list(list(link_var, link)), list(DO_LIST, list(supporting_mapped_problem_var, list(PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, link_var), $DONE, done), listS(PWHEN, list($sym28$DO_PROBLEM_LINK_OPEN_MATCH_, openP, link_var, supporting_mapped_problem_var), append(body, NIL))));
    }

    public static SubLObject do_problem_link_open_matchP(final SubLObject openP, final SubLObject link, final SubLObject supporting_mapped_problem) {
        return makeBoolean((NIL == openP) || (NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem)));
    }

    public static SubLObject do_problem_link_supporting_mapped_problems_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list30);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_mapped_problem_var = NIL;
        SubLObject index_var = NIL;
        SubLObject link = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        supporting_mapped_problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list30);
        index_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list30);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list30);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list30);
            if (NIL == member(current_$3, $list23, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list30);
        }
        final SubLObject openP_tail = property_list_member($OPEN_, current);
        final SubLObject openP = (NIL != openP_tail) ? cadr(openP_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(bq_cons(index_var, $list31)), listS(DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, list(supporting_mapped_problem_var, link, $OPEN_, openP, $DONE, done), append(body, list(list(CINC, index_var)))));
    }

    public static SubLObject do_problem_link_supporting_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_problem_var = NIL;
        SubLObject variable_map_var = NIL;
        SubLObject link = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        supporting_problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        variable_map_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list33);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list33);
            if (NIL == member(current_$4, $list23, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list33);
        }
        final SubLObject openP_tail = property_list_member($OPEN_, current);
        final SubLObject openP = (NIL != openP_tail) ? cadr(openP_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject supporting_mapped_problem = $sym34$SUPPORTING_MAPPED_PROBLEM;
        return list(DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, list(supporting_mapped_problem, link, $OPEN_, openP, $DONE, done), listS(CLET, list(list(supporting_problem_var, list(MAPPED_PROBLEM_PROBLEM, supporting_mapped_problem)), list(variable_map_var, list(MAPPED_PROBLEM_VARIABLE_MAP, supporting_mapped_problem))), append(body, NIL)));
    }

    public static SubLObject do_problem_link_sibling_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sibling_link_var = NIL;
        SubLObject link = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        sibling_link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list37);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list37);
            if (NIL == member(current_$5, $list38, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list37);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject supported_problem = $sym39$SUPPORTED_PROBLEM;
        final SubLObject link_var = $sym40$LINK_VAR;
        return list(CLET, list(list(link_var, link), list(supported_problem, list(PROBLEM_LINK_SUPPORTED_PROBLEM, link_var))), list(DO_PROBLEM_ARGUMENT_LINKS, list(sibling_link_var, supported_problem, $DONE, done), listS(PUNLESS, list(EQ, link_var, sibling_link_var), append(body, NIL))));
    }

    public static SubLObject do_problem_link_dependent_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dependent_link_var = NIL;
        SubLObject link = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        dependent_link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list43);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list43);
            if (NIL == member(current_$6, $list44, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list43);
        }
        final SubLObject link_type_tail = property_list_member($LINK_TYPE, current);
        final SubLObject link_type = (NIL != link_type_tail) ? cadr(link_type_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject supported_problem = $sym46$SUPPORTED_PROBLEM;
        return list(CLET, list(list(supported_problem, list(PROBLEM_LINK_SUPPORTED_PROBLEM, link))), listS(DO_PROBLEM_DEPENDENT_LINKS, list(dependent_link_var, supported_problem, $TYPE, link_type, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_problem_link_argument_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argument_link_var = NIL;
        SubLObject link = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        argument_link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list48);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list48);
            if (NIL == member(current_$7, $list49, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list48);
        }
        final SubLObject openP_tail = property_list_member($OPEN_, current);
        final SubLObject openP = (NIL != openP_tail) ? cadr(openP_tail) : NIL;
        final SubLObject link_type_tail = property_list_member($LINK_TYPE, current);
        final SubLObject link_type = (NIL != link_type_tail) ? cadr(link_type_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject supporting_problem = $sym50$SUPPORTING_PROBLEM;
        final SubLObject variable_map = $sym51$VARIABLE_MAP;
        return list(DO_PROBLEM_LINK_SUPPORTING_PROBLEMS, list(supporting_problem, variable_map, link, $OPEN_, openP, $DONE, done), list(IGNORE, variable_map), listS(DO_PROBLEM_ARGUMENT_LINKS, list(argument_link_var, supporting_problem, $TYPE, link_type, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_problem_link_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_var = NIL;
        SubLObject link = NIL;
        destructuring_bind_must_consp(current, datum, $list54);
        proof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list54);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list54);
            if (NIL == member(current_$8, $list55, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list54);
        }
        final SubLObject proof_status_tail = property_list_member($PROOF_STATUS, current);
        final SubLObject proof_status = (NIL != proof_status_tail) ? cadr(proof_status_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(CDOLIST, list(proof_var, list(PROBLEM_LINK_PROOFS, link)), listS(PWHEN, list($sym59$PROOF_HAS_STATUS_, proof_var, proof_status), append(body, NIL)));
    }

    public static SubLObject do_join_ordered_link_motivated_residual_transformation_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rt_link_var = NIL;
        SubLObject jo_link = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        rt_link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        jo_link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list60);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list60);
            if (NIL == member(current_$9, $list38, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list60);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject jo_link_var = $sym61$JO_LINK_VAR;
        final SubLObject motivating_conjunction_problem = $sym62$MOTIVATING_CONJUNCTION_PROBLEM;
        return list(CLET, list(list(jo_link_var, jo_link), list(motivating_conjunction_problem, list(PROBLEM_LINK_SUPPORTED_PROBLEM, jo_link_var))), list(DO_PROBLEM_ARGUMENT_LINKS, list(rt_link_var, motivating_conjunction_problem, $TYPE, $RESIDUAL_TRANSFORMATION, $DONE, done), listS(PWHEN, list($sym64$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_JOIN_ORDERED_LINK_, rt_link_var, jo_link_var), append(body, NIL))));
    }

    public static SubLObject do_transformation_link_motivated_residual_transformation_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rt_link_var = NIL;
        SubLObject t_link = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        rt_link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        t_link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list65);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list65);
            if (NIL == member(current_$10, $list38, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list65);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject t_link_var = $sym66$T_LINK_VAR;
        final SubLObject jo_link_var = $sym67$JO_LINK_VAR;
        return list(CLET, list(list(t_link_var, t_link)), list(DO_PROBLEM_LINK_DEPENDENT_LINKS, list(jo_link_var, t_link_var, $LINK_TYPE, $JOIN_ORDERED, $DONE, done), list(DO_JOIN_ORDERED_LINK_MOTIVATED_RESIDUAL_TRANSFORMATION_LINKS, list(rt_link_var, jo_link_var, $DONE, done), listS(PWHEN, list($sym71$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_TRANSFORMATION_LINK_, rt_link_var, t_link_var), append(body, NIL)))));
    }

    public static SubLObject with_forward_problem_store_reuse(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list72, listS(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list73));
    }

    public static SubLObject with_forward_dnf_type_filtering(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list74, append(body, NIL));
    }

    public static SubLObject with_forward_inference_allowed_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rules = NIL;
        destructuring_bind_must_consp(current, datum, $list75);
        rules = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($forward_inference_allowed_rules$, rules)), append(body, NIL));
    }

    public static SubLObject with_forward_inference_all_rules_allowed(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_FORWARD_INFERENCE_ALLOWED_RULES, $ALL, append(body, NIL));
    }

    public static SubLObject with_forward_inference_no_rules_allowed(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_FORWARD_INFERENCE_ALLOWED_RULES, NIL, append(body, NIL));
    }

    public static SubLObject with_forward_inference_forbidden_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rules = NIL;
        destructuring_bind_must_consp(current, datum, $list75);
        rules = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($forward_inference_forbidden_rules$, rules)), append(body, NIL));
    }

    public static SubLObject with_forward_inference_no_rules_forbidden(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_FORWARD_INFERENCE_FORBIDDEN_RULES, $NONE, append(body, NIL));
    }

    public static SubLObject current_controlling_inference() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $controlling_inferences$.getDynamicValue(thread).first();
    }

    public static SubLObject current_controlling_inferences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.find_all_if(INFERENCE_P, $controlling_inferences$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject within_controlling_inference(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject inference = NIL;
        destructuring_bind_must_consp(current, datum, $list83);
        inference = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($controlling_inferences$, listS(CONS, inference, $list86))), append(body, NIL));
    }

    public static SubLObject within_no_controlling_inference(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITHIN_CONTROLLING_INFERENCE, NIL, bq_cons(WITHIN_NO_CONTROLLING_STRATEGY, append(body, NIL)));
    }

    public static SubLObject current_controlling_strategy() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $controlling_strategy$.getDynamicValue(thread);
    }

    public static SubLObject within_controlling_strategy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject strategy = NIL;
        destructuring_bind_must_consp(current, datum, $list89);
        strategy = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($controlling_strategy$, strategy)), append(body, NIL));
    }

    public static SubLObject within_no_controlling_strategy(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITHIN_CONTROLLING_STRATEGY, NIL, append(body, NIL));
    }

    public static SubLObject possibly_gathering_pad_metrics(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = NIL;
        destructuring_bind_must_consp(current, datum, $list92);
        inference = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list92);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (NIL == list_utilities.member_eqP($CYC_MAINT, $features$.getDynamicValue(thread))) {
            return bq_cons(PROGN, append(body, NIL));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject possibly_gathering_tick_indexed_inference_progress_metrics_count_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = NIL;
        destructuring_bind_must_consp(current, datum, $list92);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject gather_tick_dataP = $sym94$GATHER_TICK_DATA_;
            final SubLObject initial_arete_terms_touched_count = $sym95$INITIAL_ARETE_TERMS_TOUCHED_COUNT;
            final SubLObject initial_arete_assertions_touched_count = $sym96$INITIAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
            final SubLObject initial_arete_log_last_kb_touchP = $sym97$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
            final SubLObject initial_arete_log_kb_touch_countsP = $sym98$INITIAL_ARETE_LOG_KB_TOUCH_COUNTS_;
            final SubLObject final_arete_terms_touched_count = $sym99$FINAL_ARETE_TERMS_TOUCHED_COUNT;
            final SubLObject final_arete_assertions_touched_count = $sym100$FINAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
            return list(CLET, list(list(gather_tick_dataP, list($sym101$INFERENCE_GATHERS_TICK_INDEXED_PROGRESS_DATA_, inference)), bq_cons(initial_arete_terms_touched_count, $list102), bq_cons(initial_arete_assertions_touched_count, $list103), bq_cons(initial_arete_log_last_kb_touchP, $list104), bq_cons(initial_arete_log_kb_touch_countsP, $list105), final_arete_terms_touched_count, final_arete_assertions_touched_count), listS(CLET, list(list($arete_terms_touched_count$, list(FIF, gather_tick_dataP, ZERO_INTEGER, initial_arete_terms_touched_count)), list($arete_assertions_touched_count$, list(FIF, gather_tick_dataP, ZERO_INTEGER, initial_arete_assertions_touched_count)), list($sym109$_ARETE_LOG_LAST_KB_TOUCH__, list(FIF, gather_tick_dataP, T, initial_arete_log_last_kb_touchP)), list($sym110$_ARETE_LOG_KB_TOUCH_COUNTS__, list(FIF, gather_tick_dataP, T, initial_arete_log_kb_touch_countsP))), append(body, list(listS(CSETQ, final_arete_terms_touched_count, $list102), listS(CSETQ, final_arete_assertions_touched_count, $list103)))), list(PWHEN, initial_arete_terms_touched_count, list(CSETQ, $arete_terms_touched_count$, list(FIF, gather_tick_dataP, list($sym111$_, initial_arete_terms_touched_count, final_arete_assertions_touched_count), final_arete_terms_touched_count))), list(PWHEN, initial_arete_assertions_touched_count, list(CSETQ, $arete_assertions_touched_count$, list(FIF, gather_tick_dataP, list($sym111$_, initial_arete_assertions_touched_count, final_arete_assertions_touched_count), final_arete_assertions_touched_count))));
        }
        cdestructuring_bind_error(datum, $list92);
        return NIL;
    }

    public static SubLObject possibly_gathering_tick_indexed_inference_progress_metrics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = NIL;
        destructuring_bind_must_consp(current, datum, $list92);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject gather_tick_dataP = $sym112$GATHER_TICK_DATA_;
            final SubLObject initial_arete_assertions_touched = $sym113$INITIAL_ARETE_ASSERTIONS_TOUCHED;
            final SubLObject initial_arete_constants_touched = $sym114$INITIAL_ARETE_CONSTANTS_TOUCHED;
            final SubLObject initial_arete_narts_touched = $sym115$INITIAL_ARETE_NARTS_TOUCHED;
            final SubLObject initial_arete_log_last_kb_touchP = $sym116$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
            final SubLObject initial_arete_log_kb_touchesP = $sym117$INITIAL_ARETE_LOG_KB_TOUCHES_;
            final SubLObject final_arete_assertions_touched = $sym118$FINAL_ARETE_ASSERTIONS_TOUCHED;
            final SubLObject final_arete_constants_touched = $sym119$FINAL_ARETE_CONSTANTS_TOUCHED;
            final SubLObject final_arete_narts_touched = $sym120$FINAL_ARETE_NARTS_TOUCHED;
            return list(CLET, list(new SubLObject[]{ list(gather_tick_dataP, list($sym121$INFERENCE_SHOULD_GATHER_TICK_INDEXED_PROGRESS_DATA_, inference)), bq_cons(initial_arete_assertions_touched, $list122), bq_cons(initial_arete_constants_touched, $list123), bq_cons(initial_arete_narts_touched, $list124), bq_cons(initial_arete_log_last_kb_touchP, $list104), bq_cons(initial_arete_log_kb_touchesP, $list125), final_arete_assertions_touched, final_arete_constants_touched, final_arete_narts_touched }), listS(CLET, list(list($arete_assertions_touched$, list(FIF, gather_tick_dataP, $list127, initial_arete_assertions_touched)), list($arete_constants_touched$, list(FIF, gather_tick_dataP, $list127, initial_arete_constants_touched)), list($arete_narts_touched$, list(FIF, gather_tick_dataP, $list127, initial_arete_narts_touched)), list($sym109$_ARETE_LOG_LAST_KB_TOUCH__, list(FIF, gather_tick_dataP, T, initial_arete_log_last_kb_touchP)), list($sym130$_ARETE_LOG_KB_TOUCHES__, list(FIF, gather_tick_dataP, T, initial_arete_log_kb_touchesP))), append(body, list(listS(CSETQ, final_arete_assertions_touched, $list122), listS(CSETQ, final_arete_constants_touched, $list123), listS(CSETQ, final_arete_narts_touched, $list124)))), list(PWHEN, initial_arete_assertions_touched, list(CSETQ, $arete_assertions_touched$, list(FIF, gather_tick_dataP, list(SET_NMERGE, initial_arete_assertions_touched, final_arete_assertions_touched), final_arete_assertions_touched))), list(PWHEN, initial_arete_constants_touched, list(CSETQ, $arete_constants_touched$, list(FIF, gather_tick_dataP, list(SET_NMERGE, initial_arete_constants_touched, final_arete_constants_touched), final_arete_constants_touched))), list(PWHEN, initial_arete_narts_touched, list(CSETQ, $arete_narts_touched$, list(FIF, gather_tick_dataP, list(SET_NMERGE, initial_arete_narts_touched, final_arete_narts_touched), final_arete_narts_touched))));
        }
        cdestructuring_bind_error(datum, $list92);
        return NIL;
    }

    public static SubLObject do_pattern_possible_disjuncts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list132);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject disjunct_var = NIL;
        SubLObject pattern = NIL;
        destructuring_bind_must_consp(current, datum, $list132);
        disjunct_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list132);
        pattern = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject pattern_var = $sym133$PATTERN_VAR;
            return list(CLET, list(list(pattern_var, pattern)), list(PIF, list(OR_PATTERN_P, pattern_var), listS(CDOLIST, list(disjunct_var, list(REST, pattern_var)), append(body, NIL)), listS(CLET, list(list(disjunct_var, pattern_var)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list132);
        return NIL;
    }

    public static SubLObject do_asked_queries(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list137);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_info_var = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list137);
        query_info_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list137);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list137);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list137);
            if (NIL == member(current_$11, $list138, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list137);
        }
        final SubLObject element_num_tail = property_list_member($ELEMENT_NUM, current);
        final SubLObject element_num = (NIL != element_num_tail) ? cadr(element_num_tail) : NIL;
        final SubLObject doneP_tail = property_list_member($DONE_, current);
        final SubLObject doneP = (NIL != doneP_tail) ? cadr(doneP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject done_varP = $sym141$DONE_VAR_;
        final SubLObject i = $sym142$I;
        final SubLObject input_stream = $sym143$INPUT_STREAM;
        return list(CLET, list(bq_cons(done_varP, $list144), bq_cons(i, $list31)), list(WITH_PRIVATE_BINARY_FILE, listS(input_stream, filename, $list146), list(WITH_CFASL_COMMON_SYMBOLS, $list148, list(UNTIL, done_varP, list(CLET, list(list(query_info_var, list(LOAD_ASKED_QUERY_FROM_STREAM, input_stream))), list(PCOND, list(list(EQ, $EOF, query_info_var), listS(CSETQ, done_varP, $list153)), list(list(STRINGP, query_info_var), list(WARN, $str156$Read_invalid_query_info__s, query_info_var)), list(T, NIL != element_num ? listS(CLET, list(list(element_num, i)), append(body, NIL)) : bq_cons(PROGN, append(body, NIL)), list(CINC, i)))), list(PWHEN, doneP, list(CSETQ, done_varP, doneP))))));
    }

    public static SubLObject do_asked_queries_in_directory(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list157);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_info_var = NIL;
        SubLObject filename_var = NIL;
        SubLObject directory = NIL;
        destructuring_bind_must_consp(current, datum, $list157);
        query_info_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list157);
        filename_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list157);
        directory = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list157);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list157);
            if (NIL == member(current_$12, $list158, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list157);
        }
        final SubLObject doneP_tail = property_list_member($DONE_, current);
        final SubLObject doneP = (NIL != doneP_tail) ? cadr(doneP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_DIRECTORY_CONTENTS, list(filename_var, directory, $DONE, doneP), list(PWHEN, list($sym160$ASKED_QUERIES_FILENAME_, filename_var), listS(DO_ASKED_QUERIES, list(query_info_var, filename_var, $DONE_, doneP), append(body, NIL))));
    }

    public static SubLObject inference_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trace_level = NIL;
        SubLObject control_string = NIL;
        destructuring_bind_must_consp(current, datum, $list162);
        trace_level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list162);
        control_string = current.first();
        current = current.rest();
        final SubLObject arg1 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list162);
        current = current.rest();
        final SubLObject arg2 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list162);
        current = current.rest();
        final SubLObject arg3 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list162);
        current = current.rest();
        final SubLObject arg4 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list162);
        current = current.rest();
        final SubLObject arg5 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list162);
        current = current.rest();
        final SubLObject arg6 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list162);
        current = current.rest();
        final SubLObject arg7 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list162);
        current = current.rest();
        final SubLObject arg8 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list162);
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, list($sym163$__, $inference_trace_level$, trace_level), list(new SubLObject[]{ FORCE_FORMAT, T, control_string, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 }));
        }
        cdestructuring_bind_error(datum, $list162);
        return NIL;
    }

    public static SubLObject declare_inference_macros_file() {
        declareMacro(me, "with_inference_var", "WITH-INFERENCE-VAR");
        declareMacro(me, "with_problem_store_var", "WITH-PROBLEM-STORE-VAR");
        declareMacro(me, "with_new_problem_store", "WITH-NEW-PROBLEM-STORE");
        declareMacro(me, "do_problem_argument_links", "DO-PROBLEM-ARGUMENT-LINKS");
        declareMacro(me, "do_problem_link_supporting_mapped_problems", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
        declareFunction(me, "do_problem_link_open_matchP", "DO-PROBLEM-LINK-OPEN-MATCH?", 3, 0, false);
        declareMacro(me, "do_problem_link_supporting_mapped_problems_numbered", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
        declareMacro(me, "do_problem_link_supporting_problems", "DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");
        declareMacro(me, "do_problem_link_sibling_links", "DO-PROBLEM-LINK-SIBLING-LINKS");
        declareMacro(me, "do_problem_link_dependent_links", "DO-PROBLEM-LINK-DEPENDENT-LINKS");
        declareMacro(me, "do_problem_link_argument_links", "DO-PROBLEM-LINK-ARGUMENT-LINKS");
        declareMacro(me, "do_problem_link_proofs", "DO-PROBLEM-LINK-PROOFS");
        declareMacro(me, "do_join_ordered_link_motivated_residual_transformation_links", "DO-JOIN-ORDERED-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS");
        declareMacro(me, "do_transformation_link_motivated_residual_transformation_links", "DO-TRANSFORMATION-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS");
        declareMacro(me, "with_forward_problem_store_reuse", "WITH-FORWARD-PROBLEM-STORE-REUSE");
        declareMacro(me, "with_forward_dnf_type_filtering", "WITH-FORWARD-DNF-TYPE-FILTERING");
        declareMacro(me, "with_forward_inference_allowed_rules", "WITH-FORWARD-INFERENCE-ALLOWED-RULES");
        declareMacro(me, "with_forward_inference_all_rules_allowed", "WITH-FORWARD-INFERENCE-ALL-RULES-ALLOWED");
        declareMacro(me, "with_forward_inference_no_rules_allowed", "WITH-FORWARD-INFERENCE-NO-RULES-ALLOWED");
        declareMacro(me, "with_forward_inference_forbidden_rules", "WITH-FORWARD-INFERENCE-FORBIDDEN-RULES");
        declareMacro(me, "with_forward_inference_no_rules_forbidden", "WITH-FORWARD-INFERENCE-NO-RULES-FORBIDDEN");
        declareFunction(me, "current_controlling_inference", "CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
        declareFunction(me, "current_controlling_inferences", "CURRENT-CONTROLLING-INFERENCES", 0, 0, false);
        declareMacro(me, "within_controlling_inference", "WITHIN-CONTROLLING-INFERENCE");
        declareMacro(me, "within_no_controlling_inference", "WITHIN-NO-CONTROLLING-INFERENCE");
        declareFunction(me, "current_controlling_strategy", "CURRENT-CONTROLLING-STRATEGY", 0, 0, false);
        declareMacro(me, "within_controlling_strategy", "WITHIN-CONTROLLING-STRATEGY");
        declareMacro(me, "within_no_controlling_strategy", "WITHIN-NO-CONTROLLING-STRATEGY");
        declareMacro(me, "possibly_gathering_pad_metrics", "POSSIBLY-GATHERING-PAD-METRICS");
        declareMacro(me, "possibly_gathering_tick_indexed_inference_progress_metrics_count_method", "POSSIBLY-GATHERING-TICK-INDEXED-INFERENCE-PROGRESS-METRICS-COUNT-METHOD");
        declareMacro(me, "possibly_gathering_tick_indexed_inference_progress_metrics", "POSSIBLY-GATHERING-TICK-INDEXED-INFERENCE-PROGRESS-METRICS");
        declareMacro(me, "do_pattern_possible_disjuncts", "DO-PATTERN-POSSIBLE-DISJUNCTS");
        declareMacro(me, "do_asked_queries", "DO-ASKED-QUERIES");
        declareMacro(me, "do_asked_queries_in_directory", "DO-ASKED-QUERIES-IN-DIRECTORY");
        declareMacro(me, "inference_trace", "INFERENCE-TRACE");
        return NIL;
    }

    public static SubLObject init_inference_macros_file() {
        defparameter("*CONTROLLING-INFERENCES*", NIL);
        defparameter("*CONTROLLING-STRATEGY*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_macros_file() {
        register_macro_helper($sym28$DO_PROBLEM_LINK_OPEN_MATCH_, DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_macros_file();
    }

    static {









































































































































































    }
}

/**
 * Total time: 368 ms
 */
