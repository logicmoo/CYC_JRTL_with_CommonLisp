package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class parsing_macros extends SubLTranslatedFile {
    public static final SubLFile me = new parsing_macros();

    public static final String myName = "com.cyc.cycjava.cycl.parsing_macros";

    public static final String myFingerPrint = "e90cf7d0bfb32707a32f8fdb6ebd04ce84cb90f2d1845bfc1406ce0e838ec290";



    // defparameter
    public static final SubLSymbol $parsing_timeout_reachedP$ = makeSymbol("*PARSING-TIMEOUT-REACHED?*");

    // defparameter
    public static final SubLSymbol $parsing_timeout_time_check_count$ = makeSymbol("*PARSING-TIMEOUT-TIME-CHECK-COUNT*");



    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("DELAY-IN-SECONDS"), makeSymbol("TIMED-OUT?")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list2 = list(makeSymbol("*PARSING-TIMEOUT-TIME-CHECK-COUNT*"), ZERO_INTEGER);

    public static final SubLSymbol $parsing_timeout_time$ = makeSymbol("*PARSING-TIMEOUT-TIME*");

    public static final SubLSymbol PARSING_COMPUTE_TIMEOUT_TIME = makeSymbol("PARSING-COMPUTE-TIMEOUT-TIME");

    public static final SubLList $list5 = list(list(makeSymbol("*PARSING-TIMEOUT-REACHED?*"), makeSymbol("*PARSING-TIMEOUT-REACHED?*")));

    public static final SubLList $list6 = list(makeSymbol("CSETQ"), makeSymbol("*PARSING-TIMEOUT-REACHED?*"), list(makeSymbol("PARSING-TIMEOUT-TIME-REACHED?")));



    public static final SubLSymbol $sym8$_PARSING_TIMEOUT_REACHED__ = makeSymbol("*PARSING-TIMEOUT-REACHED?*");



    public static final SubLList $list10 = list(list(makeSymbol("PARSING-TIMEOUT-TIME-REACHED?")));



    public static final SubLSymbol WITH_PARSING_TIMEOUT = makeSymbol("WITH-PARSING-TIMEOUT");



    public static final SubLList $list14 = list(NIL);

    public static final SubLList $list15 = list(makeSymbol("CHART-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym16$CHART = makeUninternedSymbol("CHART");



    public static final SubLSymbol PSP_CHART_MEMOIZATION_STATE = makeSymbol("PSP-CHART-MEMOIZATION-STATE");

    public static final SubLSymbol $psp_chart$ = makeSymbol("*PSP-CHART*");

    public static final SubLList $list20 = list(list(makeSymbol("INPUT-STRING"), makeSymbol("&KEY"), list(makeSymbol("GAP-TYPE"), makeKeyword("NONE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list21 = list(makeKeyword("GAP-TYPE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLSymbol $sym25$START_INDEX = makeUninternedSymbol("START-INDEX");

    public static final SubLSymbol $sym26$END_INDEX = makeUninternedSymbol("END-INDEX");

    public static final SubLSymbol $sym27$CHART = makeUninternedSymbol("CHART");





    public static final SubLList $list30 = list(makeSymbol("NULL"), makeSymbol("*PSP-CHART*"));

    public static final SubLSymbol PSP_CHART_MATCHES_GAP_TYPE_P = makeSymbol("PSP-CHART-MATCHES-GAP-TYPE-P");



    public static final SubLSymbol PSP_FIND_STRING_IN_CHARTS = makeSymbol("PSP-FIND-STRING-IN-CHARTS");

    public static final SubLList $list34 = list(makeSymbol("*PSP-CHART*"), makeSymbol("*PSP-EXTRA-CHARTS*"));

    public static final SubLSymbol $psp_chart_start_index$ = makeSymbol("*PSP-CHART-START-INDEX*");

    public static final SubLSymbol $psp_chart_end_index$ = makeSymbol("*PSP-CHART-END-INDEX*");

    public static final SubLSymbol PSP_CHART_DO_SYNTACTIC_PARSING = makeSymbol("PSP-CHART-DO-SYNTACTIC-PARSING");

    public static final SubLList $list38 = list(list(makeSymbol("*PSP-CHART-START-INDEX*"), ZERO_INTEGER), list(makeSymbol("*PSP-CHART-END-INDEX*"), NIL));

    public static final SubLSymbol WITH_PSP_CHART = makeSymbol("WITH-PSP-CHART");

    public static final SubLSymbol PSP_CHART_FOR_STRING = makeSymbol("PSP-CHART-FOR-STRING");

    public static final SubLList $list41 = list(makeSymbol("GET-PSP-LEXICON"));

    public static final SubLList $list42 = list(list(makeSymbol("PUNLESS"), makeSymbol("*PSP-DONT-DESTROY-CHART?*"), list(makeSymbol("DESTROY-PSP-CHART"))));

    public static final SubLSymbol GET_PSP_LEXICON = makeSymbol("GET-PSP-LEXICON");

    public static final SubLSymbol WITH_PSP_CHART_FOR_STRING = makeSymbol("WITH-PSP-CHART-FOR-STRING");

    public static final SubLList $list45 = list(list(makeSymbol("CHARTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $psp_extra_charts$ = makeSymbol("*PSP-EXTRA-CHARTS*");



    public static final SubLList $list48 = list(makeSymbol("PSP-LEXICON-ROOT-MT"));

    public static final SubLList $list49 = list(list(makeSymbol("DTR"), makeSymbol("EDGE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list50 = list(makeKeyword("DONE"));





    public static final SubLSymbol PSP_EDGE_DTRS = makeSymbol("PSP-EDGE-DTRS");

    public static final SubLList $list54 = list(list(makeSymbol("DTR"), makeSymbol("DTR-NUM"), makeSymbol("EDGE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym55$I = makeUninternedSymbol("I");

    public static final SubLSymbol CSOME_NUMBERED = makeSymbol("CSOME-NUMBERED");

    public static final SubLSymbol $sym57$1_ = makeSymbol("1+");

    public static final SubLSymbol WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");

    public static final SubLSymbol $psp_sbhl_resourcing_limit$ = makeSymbol("*PSP-SBHL-RESOURCING-LIMIT*");

    public static final SubLList $list60 = list(makeSymbol("BLACKLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list62 = list(makeSymbol("LISTP"));

    public static final SubLSymbol $parser_cycl_blacklist$ = makeSymbol("*PARSER-CYCL-BLACKLIST*");

    public static final SubLList $list64 = list(list(makeSymbol("*PSP-POS-PRED-FILTER?*"), T));

    public static final SubLList $list65 = list(makeSymbol("NAME"), makeSymbol("EDGE-SET-ARGS"), makeSymbol("EDGE-SET-FN-DEF"), makeSymbol("EDGE-CYCLS-FN-DEF"));

    public static final SubLSymbol $sym66$ENVIRONMENT = makeUninternedSymbol("ENVIRONMENT");

    public static final SubLSymbol $sym67$STRING = makeUninternedSymbol("STRING");

    public static final SubLSymbol $sym68$BEST = makeUninternedSymbol("BEST");

    public static final SubLSymbol $sym69$REST = makeUninternedSymbol("REST");

    public static final SubLSymbol $sym70$EDGE = makeUninternedSymbol("EDGE");

    public static final SubLSymbol $sym71$EDGE_SETS = makeUninternedSymbol("EDGE-SETS");

    public static final SubLSymbol $sym72$_OPTIONAL = makeSymbol("&OPTIONAL");

    public static final SubLList $list73 = list(list(makeSymbol("PSP-ENVIRONMENTAL-STATE")));

    public static final SubLString $str74$_CACHED = makeString("-CACHED");

    public static final SubLString $str75$CLEAR_ = makeString("CLEAR-");

    public static final SubLString $str76$_CACHED_INTERNAL = makeString("-CACHED-INTERNAL");

    public static final SubLString $str77$_EDGE_SETS = makeString("-EDGE-SETS");

    public static final SubLString $str78$_EDGE_CYCLS = makeString("-EDGE-CYCLS");







    public static final SubLSymbol DEFINE_CACHED_NEW = makeSymbol("DEFINE-CACHED-NEW");

    public static final SubLList $list83 = list(makeKeyword("SIZE"), makeInteger(256), makeKeyword("TEST"), list(makeSymbol("FUNCTION"), EQUAL));



    public static final SubLList $list85 = list(makeKeyword("GAP-TYPE"), makeSymbol("*PSP-GAP-TYPE-ALLOWED*"));



    public static final SubLSymbol $sym87$_REIFY_PARSE_NODES__ = makeSymbol("*REIFY-PARSE-NODES?*");

    public static final SubLSymbol SET_PARSE_ROOT_NODE = makeSymbol("SET-PARSE-ROOT-NODE");

    public static final SubLSymbol PSP_FIND_OR_CREATE_NODE_FOR_EDGES = makeSymbol("PSP-FIND-OR-CREATE-NODE-FOR-EDGES");

    public static final SubLSymbol SET_UNION = makeSymbol("SET-UNION");

    public static final SubLList $list91 = list(list(makeSymbol("FUNCTION"), EQL));

    public static final SubLSymbol PSP_ACCUMULATE_ANSWERS = makeSymbol("PSP-ACCUMULATE-ANSWERS");







    public static final SubLList $list96 = list(makeSymbol("BYPASS-PSP-CACHES?"));

    public static final SubLList $list97 = list(makeSymbol("PSP-ENVIRONMENTAL-STATE"));



    public static final SubLList $list99 = list(makeSymbol("EDGE"));

    public static final SubLList $list100 = list(list(makeSymbol("CYCLS"), NIL));

    public static final SubLSymbol WITH_PSP_SBHL_RESOURCING = makeSymbol("WITH-PSP-SBHL-RESOURCING");

    public static final SubLList $list102 = list(list(makeSymbol("RET"), makeSymbol("CYCLS")));

    public static final SubLSymbol DEFINE_PSP_INTERFACE_HELPER = makeSymbol("DEFINE-PSP-INTERFACE-HELPER");

    public static final SubLSymbol $sym104$BYPASS_PSP_CACHES_ = makeSymbol("BYPASS-PSP-CACHES?");

    public static final SubLList $list105 = list(list(makeSymbol("ROOT-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list106 = list(makeSymbol("*PARSE-ROOT-NODE*"), NIL);



    public static final SubLList $list108 = list(makeSymbol("*PARSE-ROOT-NODE*"));

    public static final SubLList $list109 = list(list(makeSymbol("*VARIABLE-UNIQUIFICATION-STORE*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("QUOTE"), EQUALP))));

    public static final SubLList $list110 = list(list(makeSymbol("FROM-PSP-CYCL"), makeSymbol("TO-PSP-CYCL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym111$NL_TAG_TEMPLATES = makeUninternedSymbol("NL-TAG-TEMPLATES");

    public static final SubLSymbol PSP_STRIP_AND_REMEMBER_NL_TAGS = makeSymbol("PSP-STRIP-AND-REMEMBER-NL-TAGS");

    public static final SubLSymbol PSP_ADD_NL_TAG_TEMPLATES = makeSymbol("PSP-ADD-NL-TAG-TEMPLATES");

    public static final SubLSymbol PSP_PROMOTING_NL_TAGS = makeSymbol("PSP-PROMOTING-NL-TAGS");

    public static final SubLList $list115 = list(makeSymbol("REFERENT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $speaker_referent$ = makeSymbol("*SPEAKER-REFERENT*");

    public static final SubLList $list117 = list(makeSymbol("NEW-STRING-BASED-NCS?"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym118$_NPP_USE_STRINGS_FOR_SEMANTICS__ = makeSymbol("*NPP-USE-STRINGS-FOR-SEMANTICS?*");

    public static SubLObject with_parsing_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject delay_in_seconds = NIL;
        SubLObject timed_outP = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        delay_in_seconds = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        timed_outP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, listS($list2, list($parsing_timeout_time$, list(PARSING_COMPUTE_TIMEOUT_TIME, delay_in_seconds)), $list5), $list6, listS(PUNLESS, $sym8$_PARSING_TIMEOUT_REACHED__, append(body, NIL)), listS(CSETQ, timed_outP, $list10));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject possibly_with_parsing_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject delay_in_seconds = NIL;
        SubLObject timed_outP = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        delay_in_seconds = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        timed_outP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PIF, delay_in_seconds, listS(WITH_PARSING_TIMEOUT, list(delay_in_seconds, timed_outP), append(body, NIL)), bq_cons(PROGN, append(body, list(listS(CSETQ, timed_outP, $list14)))));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject parsing_timeout_time_reachedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$parsing_timeout_time$.getDynamicValue(thread).isNumber()) {
            return NIL;
        }
        if (NIL != $parsing_timeout_reachedP$.getDynamicValue(thread)) {
            return T;
        }
        if (parsing_timeout_current_time().numGE($parsing_timeout_time$.getDynamicValue(thread))) {
            $parsing_timeout_reachedP$.setDynamicValue(T, thread);
            return T;
        }
        return NIL;
    }

    public static SubLObject parsing_timeout_time_passed_by() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != parsing_timeout_time_reachedP()) {
            return subtract(parsing_timeout_current_time(), $parsing_timeout_time$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject parsing_timeout_time_remaining() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$parsing_timeout_time$.getDynamicValue(thread).isNumber()) {
            return NIL;
        }
        if (NIL != $parsing_timeout_reachedP$.getDynamicValue(thread)) {
            return ZERO_INTEGER;
        }
        final SubLObject computed = subtract($parsing_timeout_time$.getDynamicValue(thread), parsing_timeout_current_time());
        if (NIL == number_utilities.positive_number_p(computed)) {
            $parsing_timeout_reachedP$.setDynamicValue(T, thread);
        }
        return NIL != $parsing_timeout_reachedP$.getDynamicValue(thread) ? ZERO_INTEGER : divide(computed, time_high.$internal_time_units_per_second$.getGlobalValue());
    }

    public static SubLObject parsing_timeout_current_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $parsing_timeout_time_check_count$.setDynamicValue(add($parsing_timeout_time_check_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        return get_internal_real_time();
    }

    public static SubLObject parsing_compute_timeout_time(final SubLObject delay_in_seconds) {
        final SubLObject current_time = parsing_timeout_current_time();
        final SubLObject offset = floor(multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), UNPROVIDED);
        return add(current_time, offset);
    }

    public static SubLObject with_psp_chart(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject chart_form = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        chart_form = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject chart = $sym16$CHART;
        return list(CLET, list(list(chart, chart_form)), list(WITH_MEMOIZATION_STATE, list(list(PSP_CHART_MEMOIZATION_STATE, chart)), listS(CLET, list(list($psp_chart$, chart)), append(body, NIL))));
    }

    public static SubLObject with_psp_chart_for_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_string = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        input_string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list20);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list20);
            if (NIL == member(current_$1, $list21, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list20);
        }
        final SubLObject gap_type_tail = property_list_member($GAP_TYPE, current);
        final SubLObject gap_type = (NIL != gap_type_tail) ? cadr(gap_type_tail) : $NONE;
        final SubLObject body;
        current = body = temp;
        final SubLObject start_index = $sym25$START_INDEX;
        final SubLObject end_index = $sym26$END_INDEX;
        final SubLObject chart = $sym27$CHART;
        return list(CLET, list(bq_cons(start_index, $list14), bq_cons(end_index, $list14), bq_cons(chart, $list14)), list(PWHEN, list(COR, $list30, list(PSP_CHART_MATCHES_GAP_TYPE_P, $psp_chart$, gap_type)), list(CMULTIPLE_VALUE_SETQ, list(start_index, end_index, chart), listS(PSP_FIND_STRING_IN_CHARTS, input_string, $list34))), list(PIF, start_index, listS(CLET, list(list($psp_chart_start_index$, start_index), list($psp_chart_end_index$, end_index), list($psp_chart$, chart)), list(PSP_CHART_DO_SYNTACTIC_PARSING, chart), append(body, NIL)), list(CLET, $list38, listS(WITH_PSP_CHART, list(PSP_CHART_FOR_STRING, input_string, $list41, gap_type), append(body, $list42)))));
    }

    public static SubLObject get_psp_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.initialized_p(parsing_vars.$psp_lexicon$.getDynamicValue(thread)) ? parsing_vars.$psp_lexicon$.getDynamicValue(thread) : psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_chart_matches_gap_type_p(final SubLObject chart, final SubLObject gap_type) {
        return makeBoolean((NIL != psp_chart.phrase_structure_parser_chart_p(chart)) && psp_chart.psp_chart_gap_type(chart).equal(gap_type));
    }

    public static SubLObject with_extra_psp_charts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject charts = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        charts = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($psp_extra_charts$, charts)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list45);
        return NIL;
    }

    public static SubLObject with_psp_lexicon_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_INFERENCE_MT_RELEVANCE, $list48, append(body, NIL));
    }

    public static SubLObject psp_edge_do_dtrs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dtr = NIL;
        SubLObject edge = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        dtr = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        edge = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list49);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list49);
            if (NIL == member(current_$2, $list50, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list49);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CSOME, list(dtr, list(PSP_EDGE_DTRS, edge), done), append(body, NIL));
    }

    public static SubLObject psp_edge_do_dtrs_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dtr = NIL;
        SubLObject dtr_num = NIL;
        SubLObject edge = NIL;
        destructuring_bind_must_consp(current, datum, $list54);
        dtr = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        dtr_num = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        edge = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list54);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list54);
            if (NIL == member(current_$3, $list50, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list54);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject i = $sym55$I;
        return list(CSOME_NUMBERED, list(dtr, i, list(PSP_EDGE_DTRS, edge), done), listS(CLET, list(list(dtr_num, list($sym57$1_, i))), append(body, NIL)));
    }

    public static SubLObject with_psp_sbhl_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_RESOURCED_MARKING_SPACES, $psp_sbhl_resourcing_limit$, append(body, NIL));
    }

    public static SubLObject with_parser_blacklist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject blacklist = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        blacklist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, blacklist, $list62), listS(CLET, list(list($parser_cycl_blacklist$, blacklist)), append(body, NIL)));
    }

    public static SubLObject with_pos_pred_parse_filter(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list64, append(body, NIL));
    }

    public static SubLObject define_psp_interface_helper(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject edge_set_args = NIL;
        SubLObject edge_set_fn_def = NIL;
        SubLObject edge_cycls_fn_def = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        edge_set_args = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        edge_set_fn_def = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        edge_cycls_fn_def = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject environment_$4 = $sym66$ENVIRONMENT;
            final SubLObject string = $sym67$STRING;
            final SubLObject best = $sym68$BEST;
            final SubLObject rest = $sym69$REST;
            final SubLObject edge = $sym70$EDGE;
            final SubLObject edge_sets = $sym71$EDGE_SETS;
            final SubLObject basic_arg_list = cons(string, edge_set_args);
            final SubLObject full_arg_list = append(basic_arg_list, list($sym72$_OPTIONAL, bq_cons(environment_$4, $list73)));
            final SubLObject cached_fn = intern(cconcatenate(symbol_name(name), $str74$_CACHED), UNPROVIDED);
            final SubLObject clearer = intern(cconcatenate($str75$CLEAR_, symbol_name(cached_fn)), UNPROVIDED);
            final SubLObject cached_internal_fn = intern(cconcatenate(symbol_name(name), $str76$_CACHED_INTERNAL), UNPROVIDED);
            final SubLObject edge_set_fn = intern(cconcatenate(symbol_name(name), $str77$_EDGE_SETS), UNPROVIDED);
            final SubLObject edge_cycls_fn = intern(cconcatenate(symbol_name(name), $str78$_EDGE_CYCLS), UNPROVIDED);
            final SubLObject item_var = clearer;
            if (NIL == member(item_var, parsing_vars.$psp_cached_interface_helper_clearing_functions$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                parsing_vars.$psp_cached_interface_helper_clearing_functions$.setGlobalValue(cons(item_var, parsing_vars.$psp_cached_interface_helper_clearing_functions$.getGlobalValue()));
            }
            return list(PROGN, list(DECLAIM, list(FACCESS, PRIVATE, name, cached_fn, cached_internal_fn)), list(DEFINE_CACHED_NEW, cached_fn, full_arg_list, $list83, list(IGNORE, environment_$4), list(CLET, list(bq_cons(best, $list14), bq_cons(rest, $list14)), list(WITH_PSP_CHART_FOR_STRING, bq_cons(string, $list85), list(CLET, list(list(edge_sets, bq_cons(edge_set_fn, edge_set_args))), list(PWHEN, list(CAND, $sym87$_REIFY_PARSE_NODES__, edge_sets), list(SET_PARSE_ROOT_NODE, list(PSP_FIND_OR_CREATE_NODE_FOR_EDGES, listS(SET_UNION, edge_sets, $list91)))), list(PSP_ACCUMULATE_ANSWERS, list(edge, edge_sets, best, rest), list(edge_cycls_fn, edge)))), list(RET, list(VALUES, best, rest)))), list(DEFINE, name, basic_arg_list, list(PIF, $list96, list(RET, bq_cons(cached_internal_fn, append(basic_arg_list, list($list97)))), list(RET, bq_cons(cached_fn, basic_arg_list)))), list(DEFINE_PRIVATE, edge_set_fn, edge_set_args, edge_set_fn_def), list(DEFINE_PRIVATE, edge_cycls_fn, $list99, listS(CLET, $list100, list(WITH_PSP_SBHL_RESOURCING, edge_cycls_fn_def), $list102)));
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    public static SubLObject set_parse_root_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        parsing_vars.$parse_root_node$.setDynamicValue(node, thread);
        return parsing_vars.$parse_root_node$.getDynamicValue(thread);
    }

    public static SubLObject bypass_psp_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue(thread)) || (NIL != parsing_vars.$bypass_psp_cachesP$.getDynamicValue(thread)));
    }

    public static SubLObject setting_parse_root_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list105);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject root_var = NIL;
        destructuring_bind_must_consp(current, datum, $list105);
        root_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list($list106, list($sym87$_REIFY_PARSE_NODES__, list(BOUNDP, root_var))), append(body, list(listS(CSETQ, root_var, $list108))));
        }
        cdestructuring_bind_error(datum, $list105);
        return NIL;
    }

    public static SubLObject with_new_variable_uniquification_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list109, append(body, NIL));
    }

    public static SubLObject psp_promoting_nl_tags(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list110);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject from_psp_cycl = NIL;
        SubLObject to_psp_cycl = NIL;
        destructuring_bind_must_consp(current, datum, $list110);
        from_psp_cycl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list110);
        to_psp_cycl = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject nl_tag_templates = $sym111$NL_TAG_TEMPLATES;
            return listS(CLET, list(nl_tag_templates), list(CMULTIPLE_VALUE_SETQ, list(from_psp_cycl, nl_tag_templates), list(PSP_STRIP_AND_REMEMBER_NL_TAGS, from_psp_cycl)), append(body, list(list(CSETQ, to_psp_cycl, list(PSP_ADD_NL_TAG_TEMPLATES, to_psp_cycl, nl_tag_templates)))));
        }
        cdestructuring_bind_error(datum, $list110);
        return NIL;
    }

    public static SubLObject psp_strip_and_remember_nl_tags(final SubLObject psp_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != psp_semantics.psp_weighted_cycl_p(psp_cycl)) {
            final SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
            thread.resetMultipleValues();
            final SubLObject stripped = parsing_utilities.strip_nl_tags_top_level(cycl);
            final SubLObject nl_tag_templates = thread.secondMultipleValue();
            thread.resetMultipleValues();
            psp_semantics.psp_weighted_cycl_set_cycl(psp_cycl, stripped);
            return values(psp_cycl, nl_tag_templates);
        }
        return parsing_utilities.strip_nl_tags_top_level(psp_cycl);
    }

    public static SubLObject psp_add_nl_tag_templates(SubLObject psp_cycl, final SubLObject nl_tag_templates) {
        SubLObject cdolist_list_var = nl_tag_templates;
        SubLObject nl_tag_template = NIL;
        nl_tag_template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            psp_cycl = psp_add_nl_tag_template(psp_cycl, nl_tag_template);
            cdolist_list_var = cdolist_list_var.rest();
            nl_tag_template = cdolist_list_var.first();
        } 
        return psp_cycl;
    }

    public static SubLObject psp_add_nl_tag_template(final SubLObject psp_cycl, final SubLObject nl_tag_template) {
        if (NIL != psp_semantics.psp_weighted_cycl_p(psp_cycl)) {
            final SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
            final SubLObject replaced = psp_add_nl_tag_template(cycl, nl_tag_template);
            psp_semantics.psp_weighted_cycl_set_cycl(psp_cycl, replaced);
            return psp_cycl;
        }
        return parsing_utilities.add_nl_tag_template(psp_cycl, nl_tag_template);
    }

    public static SubLObject with_speaker_referent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject referent = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        referent = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($speaker_referent$, referent)), append(body, NIL));
    }

    public static SubLObject with_new_ncs_using_stringsP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject new_string_based_ncsP = NIL;
        destructuring_bind_must_consp(current, datum, $list117);
        new_string_based_ncsP = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sym118$_NPP_USE_STRINGS_FOR_SEMANTICS__, new_string_based_ncsP)), append(body, NIL));
    }

    public static SubLObject declare_parsing_macros_file() {
        declareMacro(me, "with_parsing_timeout", "WITH-PARSING-TIMEOUT");
        declareMacro(me, "possibly_with_parsing_timeout", "POSSIBLY-WITH-PARSING-TIMEOUT");
        declareFunction(me, "parsing_timeout_time_reachedP", "PARSING-TIMEOUT-TIME-REACHED?", 0, 0, false);
        declareFunction(me, "parsing_timeout_time_passed_by", "PARSING-TIMEOUT-TIME-PASSED-BY", 0, 0, false);
        declareFunction(me, "parsing_timeout_time_remaining", "PARSING-TIMEOUT-TIME-REMAINING", 0, 0, false);
        declareFunction(me, "parsing_timeout_current_time", "PARSING-TIMEOUT-CURRENT-TIME", 0, 0, false);
        declareFunction(me, "parsing_compute_timeout_time", "PARSING-COMPUTE-TIMEOUT-TIME", 1, 0, false);
        declareMacro(me, "with_psp_chart", "WITH-PSP-CHART");
        declareMacro(me, "with_psp_chart_for_string", "WITH-PSP-CHART-FOR-STRING");
        declareFunction(me, "get_psp_lexicon", "GET-PSP-LEXICON", 0, 0, false);
        declareFunction(me, "psp_chart_matches_gap_type_p", "PSP-CHART-MATCHES-GAP-TYPE-P", 2, 0, false);
        declareMacro(me, "with_extra_psp_charts", "WITH-EXTRA-PSP-CHARTS");
        declareMacro(me, "with_psp_lexicon_mt_relevance", "WITH-PSP-LEXICON-MT-RELEVANCE");
        declareMacro(me, "psp_edge_do_dtrs", "PSP-EDGE-DO-DTRS");
        declareMacro(me, "psp_edge_do_dtrs_numbered", "PSP-EDGE-DO-DTRS-NUMBERED");
        declareMacro(me, "with_psp_sbhl_resourcing", "WITH-PSP-SBHL-RESOURCING");
        declareMacro(me, "with_parser_blacklist", "WITH-PARSER-BLACKLIST");
        declareMacro(me, "with_pos_pred_parse_filter", "WITH-POS-PRED-PARSE-FILTER");
        declareMacro(me, "define_psp_interface_helper", "DEFINE-PSP-INTERFACE-HELPER");
        declareFunction(me, "set_parse_root_node", "SET-PARSE-ROOT-NODE", 1, 0, false);
        declareFunction(me, "bypass_psp_cachesP", "BYPASS-PSP-CACHES?", 0, 0, false);
        declareMacro(me, "setting_parse_root_node", "SETTING-PARSE-ROOT-NODE");
        declareMacro(me, "with_new_variable_uniquification_state", "WITH-NEW-VARIABLE-UNIQUIFICATION-STATE");
        declareMacro(me, "psp_promoting_nl_tags", "PSP-PROMOTING-NL-TAGS");
        declareFunction(me, "psp_strip_and_remember_nl_tags", "PSP-STRIP-AND-REMEMBER-NL-TAGS", 1, 0, false);
        declareFunction(me, "psp_add_nl_tag_templates", "PSP-ADD-NL-TAG-TEMPLATES", 2, 0, false);
        declareFunction(me, "psp_add_nl_tag_template", "PSP-ADD-NL-TAG-TEMPLATE", 2, 0, false);
        declareMacro(me, "with_speaker_referent", "WITH-SPEAKER-REFERENT");
        declareMacro(me, "with_new_ncs_using_stringsP", "WITH-NEW-NCS-USING-STRINGS?");
        return NIL;
    }

    public static SubLObject init_parsing_macros_file() {
        defparameter("*PARSING-TIMEOUT-TIME*", NIL);
        defparameter("*PARSING-TIMEOUT-REACHED?*", NIL);
        defparameter("*PARSING-TIMEOUT-TIME-CHECK-COUNT*", ZERO_INTEGER);
        defconstant("*PSP-SBHL-RESOURCING-LIMIT*", SIX_INTEGER);
        return NIL;
    }

    public static SubLObject setup_parsing_macros_file() {
        register_macro_helper(PARSING_COMPUTE_TIMEOUT_TIME, WITH_PARSING_TIMEOUT);
        register_macro_helper(GET_PSP_LEXICON, WITH_PSP_CHART_FOR_STRING);
        register_macro_helper(PSP_CHART_MATCHES_GAP_TYPE_P, WITH_PSP_CHART_FOR_STRING);
        register_macro_helper(SET_PARSE_ROOT_NODE, DEFINE_PSP_INTERFACE_HELPER);
        register_macro_helper($sym104$BYPASS_PSP_CACHES_, DEFINE_PSP_INTERFACE_HELPER);
        register_macro_helper(PSP_STRIP_AND_REMEMBER_NL_TAGS, PSP_PROMOTING_NL_TAGS);
        register_macro_helper(PSP_ADD_NL_TAG_TEMPLATES, PSP_PROMOTING_NL_TAGS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_parsing_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_parsing_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_parsing_macros_file();
    }

    
}

/**
 * Total time: 195 ms
 */
