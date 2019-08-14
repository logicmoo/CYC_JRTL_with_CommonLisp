/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PARSING-MACROS
 * source file: /cyc/top/cycl/parsing-macros.lisp
 * created:     2019/07/03 17:37:51
 */
public final class parsing_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new parsing_macros();

 public static final String myName = "com.cyc.cycjava.cycl.parsing_macros";




    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $parsing_timeout_time_check_count$ = makeSymbol("*PARSING-TIMEOUT-TIME-CHECK-COUNT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("DELAY-IN-SECONDS"), makeSymbol("TIMED-OUT?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list2 = list(makeSymbol("*PARSING-TIMEOUT-TIME-CHECK-COUNT*"), ZERO_INTEGER);

    public static final SubLSymbol $parsing_timeout_time$ = makeSymbol("*PARSING-TIMEOUT-TIME*");

    private static final SubLSymbol PARSING_COMPUTE_TIMEOUT_TIME = makeSymbol("PARSING-COMPUTE-TIMEOUT-TIME");

    static private final SubLList $list5 = list(list(makeSymbol("*PARSING-TIMEOUT-REACHED?*"), makeSymbol("*PARSING-TIMEOUT-REACHED?*")));

    static private final SubLList $list6 = list(makeSymbol("CSETQ"), makeSymbol("*PARSING-TIMEOUT-REACHED?*"), list(makeSymbol("PARSING-TIMEOUT-TIME-REACHED?")));

    public static final SubLSymbol $parsing_timeout_reachedP$ = makeSymbol("*PARSING-TIMEOUT-REACHED?*");

    static private final SubLList $list10 = list(list(makeSymbol("PARSING-TIMEOUT-TIME-REACHED?")));

    private static final SubLSymbol WITH_PARSING_TIMEOUT = makeSymbol("WITH-PARSING-TIMEOUT");

    static private final SubLList $list14 = list(NIL);

    static private final SubLList $list15 = list(makeSymbol("CHART-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym16$CHART = makeUninternedSymbol("CHART");

    private static final SubLSymbol PSP_CHART_MEMOIZATION_STATE = makeSymbol("PSP-CHART-MEMOIZATION-STATE");

    public static final SubLSymbol $psp_chart$ = makeSymbol("*PSP-CHART*");

    static private final SubLList $list20 = list(list(makeSymbol("INPUT-STRING"), makeSymbol("&KEY"), list(makeSymbol("GAP-TYPE"), $NONE)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list21 = list(makeKeyword("GAP-TYPE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym25$START_INDEX = makeUninternedSymbol("START-INDEX");

    static private final SubLSymbol $sym26$END_INDEX = makeUninternedSymbol("END-INDEX");

    static private final SubLSymbol $sym27$CHART = makeUninternedSymbol("CHART");

    static private final SubLList $list30 = list(makeSymbol("NULL"), makeSymbol("*PSP-CHART*"));

    private static final SubLSymbol PSP_CHART_MATCHES_GAP_TYPE_P = makeSymbol("PSP-CHART-MATCHES-GAP-TYPE-P");

    private static final SubLSymbol PSP_FIND_STRING_IN_CHARTS = makeSymbol("PSP-FIND-STRING-IN-CHARTS");

    static private final SubLList $list34 = list(makeSymbol("*PSP-CHART*"), makeSymbol("*PSP-EXTRA-CHARTS*"));

    public static final SubLSymbol $psp_chart_start_index$ = makeSymbol("*PSP-CHART-START-INDEX*");

    public static final SubLSymbol $psp_chart_end_index$ = makeSymbol("*PSP-CHART-END-INDEX*");

    private static final SubLSymbol PSP_CHART_DO_SYNTACTIC_PARSING = makeSymbol("PSP-CHART-DO-SYNTACTIC-PARSING");

    static private final SubLList $list38 = list(list(makeSymbol("*PSP-CHART-START-INDEX*"), ZERO_INTEGER), list(makeSymbol("*PSP-CHART-END-INDEX*"), NIL));

    private static final SubLSymbol WITH_PSP_CHART = makeSymbol("WITH-PSP-CHART");

    private static final SubLSymbol PSP_CHART_FOR_STRING = makeSymbol("PSP-CHART-FOR-STRING");

    static private final SubLList $list41 = list(makeSymbol("GET-PSP-LEXICON"));

    static private final SubLList $list42 = list(list(makeSymbol("PUNLESS"), makeSymbol("*PSP-DONT-DESTROY-CHART?*"), list(makeSymbol("DESTROY-PSP-CHART"))));

    private static final SubLSymbol GET_PSP_LEXICON = makeSymbol("GET-PSP-LEXICON");

    private static final SubLSymbol WITH_PSP_CHART_FOR_STRING = makeSymbol("WITH-PSP-CHART-FOR-STRING");

    static private final SubLList $list45 = list(list(makeSymbol("CHARTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $psp_extra_charts$ = makeSymbol("*PSP-EXTRA-CHARTS*");

    static private final SubLList $list48 = list(makeSymbol("PSP-LEXICON-ROOT-MT"));

    static private final SubLList $list49 = list(list(makeSymbol("DTR"), makeSymbol("EDGE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list50 = list($DONE);

    private static final SubLSymbol PSP_EDGE_DTRS = makeSymbol("PSP-EDGE-DTRS");

    static private final SubLList $list54 = list(list(makeSymbol("DTR"), makeSymbol("DTR-NUM"), makeSymbol("EDGE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym55$I = makeUninternedSymbol("I");

    private static final SubLSymbol CSOME_NUMBERED = makeSymbol("CSOME-NUMBERED");

    static private final SubLSymbol $sym57$1_ = makeSymbol("1+");

    private static final SubLSymbol WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");

    public static final SubLSymbol $psp_sbhl_resourcing_limit$ = makeSymbol("*PSP-SBHL-RESOURCING-LIMIT*");

    static private final SubLList $list60 = list(makeSymbol("BLACKLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list62 = list(makeSymbol("LISTP"));

    public static final SubLSymbol $parser_cycl_blacklist$ = makeSymbol("*PARSER-CYCL-BLACKLIST*");

    static private final SubLList $list64 = list(list(makeSymbol("*PSP-POS-PRED-FILTER?*"), T));

    static private final SubLList $list65 = list(makeSymbol("NAME"), makeSymbol("EDGE-SET-ARGS"), makeSymbol("EDGE-SET-FN-DEF"), makeSymbol("EDGE-CYCLS-FN-DEF"));

    static private final SubLSymbol $sym66$ENVIRONMENT = makeUninternedSymbol("ENVIRONMENT");

    static private final SubLSymbol $sym67$STRING = makeUninternedSymbol("STRING");

    static private final SubLSymbol $sym68$BEST = makeUninternedSymbol("BEST");

    static private final SubLSymbol $sym69$REST = makeUninternedSymbol("REST");

    static private final SubLSymbol $sym70$EDGE = makeUninternedSymbol("EDGE");

    static private final SubLSymbol $sym71$EDGE_SETS = makeUninternedSymbol("EDGE-SETS");

    static private final SubLSymbol $sym72$_OPTIONAL = makeSymbol("&OPTIONAL");

    static private final SubLList $list73 = list(list(makeSymbol("PSP-ENVIRONMENTAL-STATE")));

    static private final SubLString $str74$_CACHED = makeString("-CACHED");

    static private final SubLString $str75$CLEAR_ = makeString("CLEAR-");

    static private final SubLString $str76$_CACHED_INTERNAL = makeString("-CACHED-INTERNAL");

    static private final SubLString $str77$_EDGE_SETS = makeString("-EDGE-SETS");

    static private final SubLString $str78$_EDGE_CYCLS = makeString("-EDGE-CYCLS");

    private static final SubLSymbol DEFINE_CACHED_NEW = makeSymbol("DEFINE-CACHED-NEW");

    static private final SubLList $list83 = list($SIZE, makeInteger(256), $TEST, list(makeSymbol("FUNCTION"), EQUAL));

    static private final SubLList $list85 = list(makeKeyword("GAP-TYPE"), makeSymbol("*PSP-GAP-TYPE-ALLOWED*"));

    public static final SubLSymbol $reify_parse_nodesP$ = makeSymbol("*REIFY-PARSE-NODES?*");

    private static final SubLSymbol SET_PARSE_ROOT_NODE = makeSymbol("SET-PARSE-ROOT-NODE");

    private static final SubLSymbol PSP_FIND_OR_CREATE_NODE_FOR_EDGES = makeSymbol("PSP-FIND-OR-CREATE-NODE-FOR-EDGES");

    private static final SubLSymbol SET_UNION = makeSymbol("SET-UNION");

    static private final SubLList $list91 = list(list(makeSymbol("FUNCTION"), EQL));

    private static final SubLSymbol PSP_ACCUMULATE_ANSWERS = makeSymbol("PSP-ACCUMULATE-ANSWERS");

    static private final SubLList $list96 = list(makeSymbol("BYPASS-PSP-CACHES?"));

    static private final SubLList $list97 = list(makeSymbol("PSP-ENVIRONMENTAL-STATE"));

    static private final SubLList $list99 = list(makeSymbol("EDGE"));

    static private final SubLList $list100 = list(list(makeSymbol("CYCLS"), NIL));

    private static final SubLSymbol WITH_PSP_SBHL_RESOURCING = makeSymbol("WITH-PSP-SBHL-RESOURCING");

    static private final SubLList $list102 = list(list(RET, makeSymbol("CYCLS")));

    private static final SubLSymbol DEFINE_PSP_INTERFACE_HELPER = makeSymbol("DEFINE-PSP-INTERFACE-HELPER");

    static private final SubLSymbol $sym104$BYPASS_PSP_CACHES_ = makeSymbol("BYPASS-PSP-CACHES?");

    static private final SubLList $list105 = list(list(makeSymbol("ROOT-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list106 = list(makeSymbol("*PARSE-ROOT-NODE*"), NIL);

    static private final SubLList $list108 = list(makeSymbol("*PARSE-ROOT-NODE*"));

    static private final SubLList $list109 = list(list(makeSymbol("*VARIABLE-UNIQUIFICATION-STORE*"), list(makeSymbol("NEW-DICTIONARY"), list(QUOTE, EQUALP))));

    static private final SubLList $list110 = list(list(makeSymbol("FROM-PSP-CYCL"), makeSymbol("TO-PSP-CYCL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym111$NL_TAG_TEMPLATES = makeUninternedSymbol("NL-TAG-TEMPLATES");

    private static final SubLSymbol PSP_STRIP_AND_REMEMBER_NL_TAGS = makeSymbol("PSP-STRIP-AND-REMEMBER-NL-TAGS");

    private static final SubLSymbol PSP_ADD_NL_TAG_TEMPLATES = makeSymbol("PSP-ADD-NL-TAG-TEMPLATES");

    private static final SubLSymbol PSP_PROMOTING_NL_TAGS = makeSymbol("PSP-PROMOTING-NL-TAGS");

    static private final SubLList $list115 = list(makeSymbol("REFERENT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $speaker_referent$ = makeSymbol("*SPEAKER-REFERENT*");

    static private final SubLList $list117 = list(makeSymbol("NEW-STRING-BASED-NCS?"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $npp_use_strings_for_semanticsP$ = makeSymbol("*NPP-USE-STRINGS-FOR-SEMANTICS?*");

    /**
     * Execute BODY so that the Phrase Structure Parser will return whatever results
     * it has as soon as it notices that DELAY-IN-SECONDS seconds have elapsed from the start of execution.
     *
     * @param DELAY-IN-SECONDS;
     * 		numberp of real- or run-time seconds.
     * 		The granularity is (/ 1 *INTERNAL-TIME-UNITS-PER-SECOND*) seconds.
     * @param TIMED-OUT?;
     * 		a variable that is set to T if the timeout has been reached.
     */
    @LispMethod(comment = "Execute BODY so that the Phrase Structure Parser will return whatever results\r\nit has as soon as it notices that DELAY-IN-SECONDS seconds have elapsed from the start of execution.\r\n\r\n@param DELAY-IN-SECONDS;\r\n\t\tnumberp of real- or run-time seconds.\r\n\t\tThe granularity is (/ 1 *INTERNAL-TIME-UNITS-PER-SECOND*) seconds.\r\n@param TIMED-OUT?;\r\n\t\ta variable that is set to T if the timeout has been reached.\nExecute BODY so that the Phrase Structure Parser will return whatever results\nit has as soon as it notices that DELAY-IN-SECONDS seconds have elapsed from the start of execution.")
    public static final SubLObject with_parsing_timeout_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject delay_in_seconds = NIL;
                    SubLObject timed_outP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    delay_in_seconds = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    timed_outP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, listS($list_alt2, list($parsing_timeout_time$, list(PARSING_COMPUTE_TIMEOUT_TIME, delay_in_seconds)), $list_alt5), $list_alt6, listS(PUNLESS, $parsing_timeout_reachedP$, append(body, NIL)), listS(CSETQ, timed_outP, $list_alt10));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY so that the Phrase Structure Parser will return whatever results
     * it has as soon as it notices that DELAY-IN-SECONDS seconds have elapsed from the start of execution.
     *
     * @param DELAY-IN-SECONDS;
     * 		numberp of real- or run-time seconds.
     * 		The granularity is (/ 1 *INTERNAL-TIME-UNITS-PER-SECOND*) seconds.
     * @param TIMED-OUT?;
     * 		a variable that is set to T if the timeout has been reached.
     */
    @LispMethod(comment = "Execute BODY so that the Phrase Structure Parser will return whatever results\r\nit has as soon as it notices that DELAY-IN-SECONDS seconds have elapsed from the start of execution.\r\n\r\n@param DELAY-IN-SECONDS;\r\n\t\tnumberp of real- or run-time seconds.\r\n\t\tThe granularity is (/ 1 *INTERNAL-TIME-UNITS-PER-SECOND*) seconds.\r\n@param TIMED-OUT?;\r\n\t\ta variable that is set to T if the timeout has been reached.\nExecute BODY so that the Phrase Structure Parser will return whatever results\nit has as soon as it notices that DELAY-IN-SECONDS seconds have elapsed from the start of execution.")
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
            return list(CLET, listS($list2, list($parsing_timeout_time$, list(PARSING_COMPUTE_TIMEOUT_TIME, delay_in_seconds)), $list5), $list6, listS(PUNLESS, $parsing_timeout_reachedP$, append(body, NIL)), listS(CSETQ, timed_outP, $list10));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static final SubLObject possibly_with_parsing_timeout_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject delay_in_seconds = NIL;
                    SubLObject timed_outP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    delay_in_seconds = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    timed_outP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PIF, delay_in_seconds, listS(WITH_PARSING_TIMEOUT, list(delay_in_seconds, timed_outP), append(body, NIL)), bq_cons(PROGN, append(body, list(listS(CSETQ, timed_outP, $list_alt14)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
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

    /**
     *
     *
     * @return boolean; Has the allotted time expired?
     */
    @LispMethod(comment = "@return boolean; Has the allotted time expired?")
    public static final SubLObject parsing_timeout_time_reachedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$parsing_timeout_time$.getDynamicValue(thread).isNumber()) {
                return NIL;
            } else {
                if (NIL != $parsing_timeout_reachedP$.getDynamicValue(thread)) {
                    return T;
                } else {
                    if (com.cyc.cycjava.cycl.parsing_macros.parsing_timeout_current_time().numGE($parsing_timeout_time$.getDynamicValue(thread))) {
                        $parsing_timeout_reachedP$.setDynamicValue(T, thread);
                        return T;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean; Has the allotted time expired?
     */
    @LispMethod(comment = "@return boolean; Has the allotted time expired?")
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

    /**
     *
     *
     * @return NIL or numberp; Number of seconds since we should have stopped.
     */
    @LispMethod(comment = "@return NIL or numberp; Number of seconds since we should have stopped.")
    public static final SubLObject parsing_timeout_time_passed_by_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.parsing_macros.parsing_timeout_time_reachedP()) {
                return subtract(com.cyc.cycjava.cycl.parsing_macros.parsing_timeout_current_time(), $parsing_timeout_time$.getDynamicValue(thread));
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return NIL or numberp; Number of seconds since we should have stopped.
     */
    @LispMethod(comment = "@return NIL or numberp; Number of seconds since we should have stopped.")
    public static SubLObject parsing_timeout_time_passed_by() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != parsing_timeout_time_reachedP()) {
            return subtract(parsing_timeout_current_time(), $parsing_timeout_time$.getDynamicValue(thread));
        }
        return NIL;
    }

    /**
     *
     *
     * @return NIL or non-negative number of seconds remaining
     */
    @LispMethod(comment = "@return NIL or non-negative number of seconds remaining")
    public static final SubLObject parsing_timeout_time_remaining_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$parsing_timeout_time$.getDynamicValue(thread).isNumber()) {
                return NIL;
            } else {
                if (NIL != $parsing_timeout_reachedP$.getDynamicValue(thread)) {
                    return ZERO_INTEGER;
                } else {
                    {
                        SubLObject computed = subtract($parsing_timeout_time$.getDynamicValue(thread), com.cyc.cycjava.cycl.parsing_macros.parsing_timeout_current_time());
                        if (NIL == number_utilities.positive_number_p(computed)) {
                            $parsing_timeout_reachedP$.setDynamicValue(T, thread);
                        }
                        return NIL != $parsing_timeout_reachedP$.getDynamicValue(thread) ? ((SubLObject) (ZERO_INTEGER)) : divide(computed, time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return NIL or non-negative number of seconds remaining
     */
    @LispMethod(comment = "@return NIL or non-negative number of seconds remaining")
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

    public static final SubLObject parsing_timeout_current_time_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $parsing_timeout_time_check_count$.setDynamicValue(add($parsing_timeout_time_check_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            return get_internal_real_time();
        }
    }

    public static SubLObject parsing_timeout_current_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $parsing_timeout_time_check_count$.setDynamicValue(add($parsing_timeout_time_check_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        return get_internal_real_time();
    }

    public static final SubLObject parsing_compute_timeout_time_alt(SubLObject delay_in_seconds) {
        {
            SubLObject current_time = com.cyc.cycjava.cycl.parsing_macros.parsing_timeout_current_time();
            SubLObject offset = floor(multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), UNPROVIDED);
            return add(current_time, offset);
        }
    }

    public static SubLObject parsing_compute_timeout_time(final SubLObject delay_in_seconds) {
        final SubLObject current_time = parsing_timeout_current_time();
        final SubLObject offset = floor(multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), UNPROVIDED);
        return add(current_time, offset);
    }

    /**
     * Evaluate BODY with *PSP-CHART* bound to whatever CHART-FORM evaluates to.
     */
    @LispMethod(comment = "Evaluate BODY with *PSP-CHART* bound to whatever CHART-FORM evaluates to.")
    public static final SubLObject with_psp_chart_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject chart_form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            chart_form = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject chart = $sym16$CHART;
                return list(CLET, list(list(chart, chart_form)), list(WITH_MEMOIZATION_STATE, list(list(PSP_CHART_MEMOIZATION_STATE, chart)), listS(CLET, list(list($psp_chart$, chart)), append(body, NIL))));
            }
        }
    }

    /**
     * Evaluate BODY with *PSP-CHART* bound to whatever CHART-FORM evaluates to.
     */
    @LispMethod(comment = "Evaluate BODY with *PSP-CHART* bound to whatever CHART-FORM evaluates to.")
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

    /**
     * Evaluate BODY with *PSP-CHART* bound to a completed chart for INPUT-STRING.
     */
    @LispMethod(comment = "Evaluate BODY with *PSP-CHART* bound to a completed chart for INPUT-STRING.")
    public static final SubLObject with_psp_chart_for_string_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject input_string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    input_string = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            if (NIL == member(current_1, $list_alt21, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt20);
                        }
                        {
                            SubLObject gap_type_tail = property_list_member($GAP_TYPE, current);
                            SubLObject gap_type = (NIL != gap_type_tail) ? ((SubLObject) (cadr(gap_type_tail))) : $NONE;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject start_index = $sym25$START_INDEX;
                                SubLObject end_index = $sym26$END_INDEX;
                                SubLObject chart = $sym27$CHART;
                                return list(CLET, list(bq_cons(start_index, $list_alt14), bq_cons(end_index, $list_alt14), bq_cons(chart, $list_alt14)), list(PWHEN, list(COR, $list_alt30, list(PSP_CHART_MATCHES_GAP_TYPE_P, $psp_chart$, gap_type)), list(CMULTIPLE_VALUE_SETQ, list(start_index, end_index, chart), listS(PSP_FIND_STRING_IN_CHARTS, input_string, $list_alt34))), list(PIF, start_index, listS(CLET, list(list($psp_chart_start_index$, start_index), list($psp_chart_end_index$, end_index), list($psp_chart$, chart)), list(PSP_CHART_DO_SYNTACTIC_PARSING, chart), append(body, NIL)), list(CLET, $list_alt38, listS(WITH_PSP_CHART, list(PSP_CHART_FOR_STRING, input_string, $list_alt41, gap_type), append(body, $list_alt42)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Evaluate BODY with *PSP-CHART* bound to a completed chart for INPUT-STRING.
     */
    @LispMethod(comment = "Evaluate BODY with *PSP-CHART* bound to a completed chart for INPUT-STRING.")
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

    public static final SubLObject get_psp_lexicon_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != misc_utilities.initialized_p(parsing_vars.$psp_lexicon$.getDynamicValue(thread)) ? ((SubLObject) (parsing_vars.$psp_lexicon$.getDynamicValue(thread))) : psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject get_psp_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.initialized_p(parsing_vars.$psp_lexicon$.getDynamicValue(thread)) ? parsing_vars.$psp_lexicon$.getDynamicValue(thread) : psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject psp_chart_matches_gap_type_p_alt(SubLObject chart, SubLObject gap_type) {
        return makeBoolean((NIL != psp_chart.phrase_structure_parser_chart_p(chart)) && psp_chart.psp_chart_gap_type(chart).equal(gap_type));
    }

    public static SubLObject psp_chart_matches_gap_type_p(final SubLObject chart, final SubLObject gap_type) {
        return makeBoolean((NIL != psp_chart.phrase_structure_parser_chart_p(chart)) && psp_chart.psp_chart_gap_type(chart).equal(gap_type));
    }

    public static final SubLObject with_extra_psp_charts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject charts = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    charts = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($psp_extra_charts$, charts)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt45);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject with_psp_lexicon_mt_relevance_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_INFERENCE_MT_RELEVANCE, $list_alt48, append(body, NIL));
        }
    }

    public static SubLObject with_psp_lexicon_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_INFERENCE_MT_RELEVANCE, $list48, append(body, NIL));
    }

    public static final SubLObject psp_edge_do_dtrs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt49);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dtr = NIL;
                    SubLObject edge = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt49);
                    dtr = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt49);
                    edge = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt49);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt49);
                            if (NIL == member(current_2, $list_alt50, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt49);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CSOME, list(dtr, list(PSP_EDGE_DTRS, edge), done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject psp_edge_do_dtrs_numbered_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt54);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dtr = NIL;
                    SubLObject dtr_num = NIL;
                    SubLObject edge = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    dtr = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    dtr_num = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    edge = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt54);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt54);
                            if (NIL == member(current_3, $list_alt50, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt54);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject i = $sym55$I;
                                return list(CSOME_NUMBERED, list(dtr, i, list(PSP_EDGE_DTRS, edge), done), listS(CLET, list(list(dtr_num, list($sym57$1_, i))), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject with_psp_sbhl_resourcing_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SBHL_RESOURCED_MARKING_SPACES, $psp_sbhl_resourcing_limit$, append(body, NIL));
        }
    }

    public static SubLObject with_psp_sbhl_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_RESOURCED_MARKING_SPACES, $psp_sbhl_resourcing_limit$, append(body, NIL));
    }

    /**
     * Evaluate BODY with *PARSER-CYCL-BLACKLIST* bound to BLACKLIST.
     */
    @LispMethod(comment = "Evaluate BODY with *PARSER-CYCL-BLACKLIST* bound to BLACKLIST.")
    public static final SubLObject with_parser_blacklist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject blacklist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt60);
            blacklist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, blacklist, $list_alt62), listS(CLET, list(list($parser_cycl_blacklist$, blacklist)), append(body, NIL)));
            }
        }
    }

    /**
     * Evaluate BODY with *PARSER-CYCL-BLACKLIST* bound to BLACKLIST.
     */
    @LispMethod(comment = "Evaluate BODY with *PARSER-CYCL-BLACKLIST* bound to BLACKLIST.")
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

    /**
     * Use the draconian parse filters
     */
    @LispMethod(comment = "Use the draconian parse filters")
    public static final SubLObject with_pos_pred_parse_filter_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt64, append(body, NIL));
        }
    }

    /**
     * Use the draconian parse filters
     */
    @LispMethod(comment = "Use the draconian parse filters")
    public static SubLObject with_pos_pred_parse_filter(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list64, append(body, NIL));
    }

    /**
     * Define a PSP function named NAME with two mini-helper functions.
     * The first takes EDGE-SET-ARGS, is defined by EDGE-SET-FN-DEF, and returns a list of edge sets.
     * The second is defined by EDGE-CYCLS-FN-DEF, takes an edge, and returns a list of CycL expressions for it.
     */
    @LispMethod(comment = "Define a PSP function named NAME with two mini-helper functions.\r\nThe first takes EDGE-SET-ARGS, is defined by EDGE-SET-FN-DEF, and returns a list of edge sets.\r\nThe second is defined by EDGE-CYCLS-FN-DEF, takes an edge, and returns a list of CycL expressions for it.\nDefine a PSP function named NAME with two mini-helper functions.\nThe first takes EDGE-SET-ARGS, is defined by EDGE-SET-FN-DEF, and returns a list of edge sets.\nThe second is defined by EDGE-CYCLS-FN-DEF, takes an edge, and returns a list of CycL expressions for it.")
    public static final SubLObject define_psp_interface_helper_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject edge_set_args = NIL;
            SubLObject edge_set_fn_def = NIL;
            SubLObject edge_cycls_fn_def = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            edge_set_args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            edge_set_fn_def = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            edge_cycls_fn_def = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject environment_4 = $sym66$ENVIRONMENT;
                    SubLObject string = $sym67$STRING;
                    SubLObject best = $sym68$BEST;
                    SubLObject rest = $sym69$REST;
                    SubLObject edge = $sym70$EDGE;
                    SubLObject edge_sets = $sym71$EDGE_SETS;
                    SubLObject basic_arg_list = cons(string, edge_set_args);
                    SubLObject full_arg_list = append(basic_arg_list, list($sym72$_OPTIONAL, bq_cons(environment_4, $list_alt73)));
                    SubLObject cached_fn = intern(cconcatenate(symbol_name(name), $str_alt74$_CACHED), UNPROVIDED);
                    SubLObject clearer = intern(cconcatenate($str_alt75$CLEAR_, symbol_name(cached_fn)), UNPROVIDED);
                    SubLObject cached_internal_fn = intern(cconcatenate(symbol_name(name), $str_alt76$_CACHED_INTERNAL), UNPROVIDED);
                    SubLObject edge_set_fn = intern(cconcatenate(symbol_name(name), $str_alt77$_EDGE_SETS), UNPROVIDED);
                    SubLObject edge_cycls_fn = intern(cconcatenate(symbol_name(name), $str_alt78$_EDGE_CYCLS), UNPROVIDED);
                    SubLObject item_var = clearer;
                    if (NIL == member(item_var, parsing_vars.$psp_cached_interface_helper_clearing_functions$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        parsing_vars.$psp_cached_interface_helper_clearing_functions$.setGlobalValue(cons(item_var, parsing_vars.$psp_cached_interface_helper_clearing_functions$.getGlobalValue()));
                    }
                    return list(PROGN, list(DECLAIM, list(FACCESS, PRIVATE, name, cached_fn, cached_internal_fn)), list(DEFINE_CACHED_NEW, cached_fn, full_arg_list, $list_alt83, list(IGNORE, environment_4), list(CLET, list(bq_cons(best, $list_alt14), bq_cons(rest, $list_alt14)), list(WITH_PSP_CHART_FOR_STRING, bq_cons(string, $list_alt85), list(CLET, list(list(edge_sets, bq_cons(edge_set_fn, edge_set_args))), list(PWHEN, list(CAND, $reify_parse_nodesP$, edge_sets), list(SET_PARSE_ROOT_NODE, list(PSP_FIND_OR_CREATE_NODE_FOR_EDGES, listS(SET_UNION, edge_sets, $list_alt91)))), list(PSP_ACCUMULATE_ANSWERS, list(edge, edge_sets, best, rest), list(edge_cycls_fn, edge)))), list(RET, list(VALUES, best, rest)))), list(DEFINE, name, basic_arg_list, list(PIF, $list_alt96, list(RET, bq_cons(cached_internal_fn, append(basic_arg_list, list($list_alt97)))), list(RET, bq_cons(cached_fn, basic_arg_list)))), list(DEFINE_PRIVATE, edge_set_fn, edge_set_args, edge_set_fn_def), list(DEFINE_PRIVATE, edge_cycls_fn, $list_alt99, listS(CLET, $list_alt100, list(WITH_PSP_SBHL_RESOURCING, edge_cycls_fn_def), $list_alt102)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt65);
            }
        }
        return NIL;
    }

    /**
     * Define a PSP function named NAME with two mini-helper functions.
     * The first takes EDGE-SET-ARGS, is defined by EDGE-SET-FN-DEF, and returns a list of edge sets.
     * The second is defined by EDGE-CYCLS-FN-DEF, takes an edge, and returns a list of CycL expressions for it.
     */
    @LispMethod(comment = "Define a PSP function named NAME with two mini-helper functions.\r\nThe first takes EDGE-SET-ARGS, is defined by EDGE-SET-FN-DEF, and returns a list of edge sets.\r\nThe second is defined by EDGE-CYCLS-FN-DEF, takes an edge, and returns a list of CycL expressions for it.\nDefine a PSP function named NAME with two mini-helper functions.\nThe first takes EDGE-SET-ARGS, is defined by EDGE-SET-FN-DEF, and returns a list of edge sets.\nThe second is defined by EDGE-CYCLS-FN-DEF, takes an edge, and returns a list of CycL expressions for it.")
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
            return list(PROGN, list(DECLAIM, list(FACCESS, PRIVATE, name, cached_fn, cached_internal_fn)), list(DEFINE_CACHED_NEW, cached_fn, full_arg_list, $list83, list(IGNORE, environment_$4), list(CLET, list(bq_cons(best, $list14), bq_cons(rest, $list14)), list(WITH_PSP_CHART_FOR_STRING, bq_cons(string, $list85), list(CLET, list(list(edge_sets, bq_cons(edge_set_fn, edge_set_args))), list(PWHEN, list(CAND, $reify_parse_nodesP$, edge_sets), list(SET_PARSE_ROOT_NODE, list(PSP_FIND_OR_CREATE_NODE_FOR_EDGES, listS(SET_UNION, edge_sets, $list91)))), list(PSP_ACCUMULATE_ANSWERS, list(edge, edge_sets, best, rest), list(edge_cycls_fn, edge)))), list(RET, list(VALUES, best, rest)))), list(DEFINE, name, basic_arg_list, list(PIF, $list96, list(RET, bq_cons(cached_internal_fn, append(basic_arg_list, list($list97)))), list(RET, bq_cons(cached_fn, basic_arg_list)))), list(DEFINE_PRIVATE, edge_set_fn, edge_set_args, edge_set_fn_def), list(DEFINE_PRIVATE, edge_cycls_fn, $list99, listS(CLET, $list100, list(WITH_PSP_SBHL_RESOURCING, edge_cycls_fn_def), $list102)));
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    public static final SubLObject set_parse_root_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            parsing_vars.$parse_root_node$.setDynamicValue(node, thread);
            return parsing_vars.$parse_root_node$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_parse_root_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        parsing_vars.$parse_root_node$.setDynamicValue(node, thread);
        return parsing_vars.$parse_root_node$.getDynamicValue(thread);
    }

    public static final SubLObject bypass_psp_cachesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue(thread)) || (NIL != parsing_vars.$bypass_psp_cachesP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject bypass_psp_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue(thread)) || (NIL != parsing_vars.$bypass_psp_cachesP$.getDynamicValue(thread)));
    }

    /**
     * Execute BODY, and then set ROOT-VAR to whatever *PARSE-ROOT-NODE* is set to
     * after BODY is finished.
     */
    @LispMethod(comment = "Execute BODY, and then set ROOT-VAR to whatever *PARSE-ROOT-NODE* is set to\r\nafter BODY is finished.\nExecute BODY, and then set ROOT-VAR to whatever *PARSE-ROOT-NODE* is set to\nafter BODY is finished.")
    public static final SubLObject setting_parse_root_node_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject root_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt105);
                    root_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list($list_alt106, list($reify_parse_nodesP$, list(BOUNDP, root_var))), append(body, list(listS(CSETQ, root_var, $list_alt108))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt105);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY, and then set ROOT-VAR to whatever *PARSE-ROOT-NODE* is set to
     * after BODY is finished.
     */
    @LispMethod(comment = "Execute BODY, and then set ROOT-VAR to whatever *PARSE-ROOT-NODE* is set to\r\nafter BODY is finished.\nExecute BODY, and then set ROOT-VAR to whatever *PARSE-ROOT-NODE* is set to\nafter BODY is finished.")
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
            return listS(CLET, list($list106, list($reify_parse_nodesP$, list(BOUNDP, root_var))), append(body, list(listS(CSETQ, root_var, $list108))));
        }
        cdestructuring_bind_error(datum, $list105);
        return NIL;
    }

    public static final SubLObject with_new_variable_uniquification_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt109, append(body, NIL));
        }
    }

    public static SubLObject with_new_variable_uniquification_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list109, append(body, NIL));
    }

    /**
     * Execute BODY, promoting any NL tags from FROM-PSP-CYCL to TO-PSP-CYCL.
     */
    @LispMethod(comment = "Execute BODY, promoting any NL tags from FROM-PSP-CYCL to TO-PSP-CYCL.")
    public static final SubLObject psp_promoting_nl_tags_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt110);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject from_psp_cycl = NIL;
                    SubLObject to_psp_cycl = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt110);
                    from_psp_cycl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt110);
                    to_psp_cycl = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject nl_tag_templates = $sym111$NL_TAG_TEMPLATES;
                            return listS(CLET, list(nl_tag_templates), list(CMULTIPLE_VALUE_SETQ, list(from_psp_cycl, nl_tag_templates), list(PSP_STRIP_AND_REMEMBER_NL_TAGS, from_psp_cycl)), append(body, list(list(CSETQ, to_psp_cycl, list(PSP_ADD_NL_TAG_TEMPLATES, to_psp_cycl, nl_tag_templates)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt110);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY, promoting any NL tags from FROM-PSP-CYCL to TO-PSP-CYCL.
     */
    @LispMethod(comment = "Execute BODY, promoting any NL tags from FROM-PSP-CYCL to TO-PSP-CYCL.")
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

    public static final SubLObject psp_strip_and_remember_nl_tags_alt(SubLObject psp_cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != psp_semantics.psp_weighted_cycl_p(psp_cycl)) {
                {
                    SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
                    thread.resetMultipleValues();
                    {
                        SubLObject stripped = parsing_utilities.strip_nl_tags_top_level(cycl);
                        SubLObject nl_tag_templates = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        psp_semantics.psp_weighted_cycl_set_cycl(psp_cycl, stripped);
                        return values(psp_cycl, nl_tag_templates);
                    }
                }
            } else {
                return parsing_utilities.strip_nl_tags_top_level(psp_cycl);
            }
        }
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

    public static final SubLObject psp_add_nl_tag_templates_alt(SubLObject psp_cycl, SubLObject nl_tag_templates) {
        {
            SubLObject cdolist_list_var = nl_tag_templates;
            SubLObject nl_tag_template = NIL;
            for (nl_tag_template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nl_tag_template = cdolist_list_var.first()) {
                psp_cycl = com.cyc.cycjava.cycl.parsing_macros.psp_add_nl_tag_template(psp_cycl, nl_tag_template);
            }
        }
        return psp_cycl;
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

    public static final SubLObject psp_add_nl_tag_template_alt(SubLObject psp_cycl, SubLObject nl_tag_template) {
        if (NIL != psp_semantics.psp_weighted_cycl_p(psp_cycl)) {
            {
                SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
                SubLObject replaced = com.cyc.cycjava.cycl.parsing_macros.psp_add_nl_tag_template(cycl, nl_tag_template);
                psp_semantics.psp_weighted_cycl_set_cycl(psp_cycl, replaced);
                return psp_cycl;
            }
        } else {
            return parsing_utilities.add_nl_tag_template(psp_cycl, nl_tag_template);
        }
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

    public static final SubLObject with_speaker_referent_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject referent = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt115);
            referent = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($speaker_referent$, referent)), append(body, NIL));
            }
        }
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

    public static final SubLObject with_new_ncs_using_stringsP_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject new_string_based_ncsP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt117);
            new_string_based_ncsP = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($npp_use_strings_for_semanticsP$, new_string_based_ncsP)), append(body, NIL));
            }
        }
    }

    public static SubLObject with_new_ncs_using_stringsP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject new_string_based_ncsP = NIL;
        destructuring_bind_must_consp(current, datum, $list117);
        new_string_based_ncsP = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($npp_use_strings_for_semanticsP$, new_string_based_ncsP)), append(body, NIL));
    }

    public static SubLObject declare_parsing_macros_file() {
        declareMacro("with_parsing_timeout", "WITH-PARSING-TIMEOUT");
        declareMacro("possibly_with_parsing_timeout", "POSSIBLY-WITH-PARSING-TIMEOUT");
        declareFunction("parsing_timeout_time_reachedP", "PARSING-TIMEOUT-TIME-REACHED?", 0, 0, false);
        declareFunction("parsing_timeout_time_passed_by", "PARSING-TIMEOUT-TIME-PASSED-BY", 0, 0, false);
        declareFunction("parsing_timeout_time_remaining", "PARSING-TIMEOUT-TIME-REMAINING", 0, 0, false);
        declareFunction("parsing_timeout_current_time", "PARSING-TIMEOUT-CURRENT-TIME", 0, 0, false);
        declareFunction("parsing_compute_timeout_time", "PARSING-COMPUTE-TIMEOUT-TIME", 1, 0, false);
        declareMacro("with_psp_chart", "WITH-PSP-CHART");
        declareMacro("with_psp_chart_for_string", "WITH-PSP-CHART-FOR-STRING");
        declareFunction("get_psp_lexicon", "GET-PSP-LEXICON", 0, 0, false);
        declareFunction("psp_chart_matches_gap_type_p", "PSP-CHART-MATCHES-GAP-TYPE-P", 2, 0, false);
        declareMacro("with_extra_psp_charts", "WITH-EXTRA-PSP-CHARTS");
        declareMacro("with_psp_lexicon_mt_relevance", "WITH-PSP-LEXICON-MT-RELEVANCE");
        declareMacro("psp_edge_do_dtrs", "PSP-EDGE-DO-DTRS");
        declareMacro("psp_edge_do_dtrs_numbered", "PSP-EDGE-DO-DTRS-NUMBERED");
        declareMacro("with_psp_sbhl_resourcing", "WITH-PSP-SBHL-RESOURCING");
        declareMacro("with_parser_blacklist", "WITH-PARSER-BLACKLIST");
        declareMacro("with_pos_pred_parse_filter", "WITH-POS-PRED-PARSE-FILTER");
        declareMacro("define_psp_interface_helper", "DEFINE-PSP-INTERFACE-HELPER");
        declareFunction("set_parse_root_node", "SET-PARSE-ROOT-NODE", 1, 0, false);
        declareFunction("bypass_psp_cachesP", "BYPASS-PSP-CACHES?", 0, 0, false);
        declareMacro("setting_parse_root_node", "SETTING-PARSE-ROOT-NODE");
        declareMacro("with_new_variable_uniquification_state", "WITH-NEW-VARIABLE-UNIQUIFICATION-STATE");
        declareMacro("psp_promoting_nl_tags", "PSP-PROMOTING-NL-TAGS");
        declareFunction("psp_strip_and_remember_nl_tags", "PSP-STRIP-AND-REMEMBER-NL-TAGS", 1, 0, false);
        declareFunction("psp_add_nl_tag_templates", "PSP-ADD-NL-TAG-TEMPLATES", 2, 0, false);
        declareFunction("psp_add_nl_tag_template", "PSP-ADD-NL-TAG-TEMPLATE", 2, 0, false);
        declareMacro("with_speaker_referent", "WITH-SPEAKER-REFERENT");
        declareMacro("with_new_ncs_using_stringsP", "WITH-NEW-NCS-USING-STRINGS?");
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("DELAY-IN-SECONDS"), makeSymbol("TIMED-OUT?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt2 = list(makeSymbol("*PARSING-TIMEOUT-TIME-CHECK-COUNT*"), ZERO_INTEGER);

    static private final SubLList $list_alt5 = list(list(makeSymbol("*PARSING-TIMEOUT-REACHED?*"), makeSymbol("*PARSING-TIMEOUT-REACHED?*")));

    static private final SubLList $list_alt6 = list(makeSymbol("CSETQ"), makeSymbol("*PARSING-TIMEOUT-REACHED?*"), list(makeSymbol("PARSING-TIMEOUT-TIME-REACHED?")));

    static private final SubLList $list_alt10 = list(list(makeSymbol("PARSING-TIMEOUT-TIME-REACHED?")));

    public static SubLObject init_parsing_macros_file() {
        defparameter("*PARSING-TIMEOUT-TIME*", NIL);
        defparameter("*PARSING-TIMEOUT-REACHED?*", NIL);
        defparameter("*PARSING-TIMEOUT-TIME-CHECK-COUNT*", ZERO_INTEGER);
        defconstant("*PSP-SBHL-RESOURCING-LIMIT*", SIX_INTEGER);
        return NIL;
    }

    static private final SubLList $list_alt14 = list(NIL);

    static private final SubLList $list_alt15 = list(makeSymbol("CHART-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    static private final SubLList $list_alt20 = list(list(makeSymbol("INPUT-STRING"), makeSymbol("&KEY"), list(makeSymbol("GAP-TYPE"), $NONE)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt21 = list(makeKeyword("GAP-TYPE"));

    @Override
    public void declareFunctions() {
        declare_parsing_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_parsing_macros_file();
    }

    static private final SubLList $list_alt30 = list(makeSymbol("NULL"), makeSymbol("*PSP-CHART*"));

    @Override
    public void runTopLevelForms() {
        setup_parsing_macros_file();
    }

    static {
    }

    static private final SubLList $list_alt34 = list(makeSymbol("*PSP-CHART*"), makeSymbol("*PSP-EXTRA-CHARTS*"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("*PSP-CHART-START-INDEX*"), ZERO_INTEGER), list(makeSymbol("*PSP-CHART-END-INDEX*"), NIL));

    static private final SubLList $list_alt41 = list(makeSymbol("GET-PSP-LEXICON"));

    static private final SubLList $list_alt42 = list(list(makeSymbol("PUNLESS"), makeSymbol("*PSP-DONT-DESTROY-CHART?*"), list(makeSymbol("DESTROY-PSP-CHART"))));

    static private final SubLList $list_alt45 = list(list(makeSymbol("CHARTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt48 = list(makeSymbol("PSP-LEXICON-ROOT-MT"));

    static private final SubLList $list_alt49 = list(list(makeSymbol("DTR"), makeSymbol("EDGE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt50 = list($DONE);

    static private final SubLList $list_alt54 = list(list(makeSymbol("DTR"), makeSymbol("DTR-NUM"), makeSymbol("EDGE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt60 = list(makeSymbol("BLACKLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt62 = list(makeSymbol("LISTP"));

    static private final SubLList $list_alt64 = list(list(makeSymbol("*PSP-POS-PRED-FILTER?*"), T));

    static private final SubLList $list_alt65 = list(makeSymbol("NAME"), makeSymbol("EDGE-SET-ARGS"), makeSymbol("EDGE-SET-FN-DEF"), makeSymbol("EDGE-CYCLS-FN-DEF"));

    static private final SubLList $list_alt73 = list(list(makeSymbol("PSP-ENVIRONMENTAL-STATE")));

    static private final SubLString $str_alt74$_CACHED = makeString("-CACHED");

    static private final SubLString $str_alt75$CLEAR_ = makeString("CLEAR-");

    static private final SubLString $str_alt76$_CACHED_INTERNAL = makeString("-CACHED-INTERNAL");

    static private final SubLString $str_alt77$_EDGE_SETS = makeString("-EDGE-SETS");

    static private final SubLString $str_alt78$_EDGE_CYCLS = makeString("-EDGE-CYCLS");

    static private final SubLList $list_alt83 = list($SIZE, makeInteger(256), $TEST, list(makeSymbol("FUNCTION"), EQUAL));

    static private final SubLList $list_alt85 = list(makeKeyword("GAP-TYPE"), makeSymbol("*PSP-GAP-TYPE-ALLOWED*"));

    static private final SubLList $list_alt91 = list(list(makeSymbol("FUNCTION"), EQL));

    static private final SubLList $list_alt96 = list(makeSymbol("BYPASS-PSP-CACHES?"));

    static private final SubLList $list_alt97 = list(makeSymbol("PSP-ENVIRONMENTAL-STATE"));

    static private final SubLList $list_alt99 = list(makeSymbol("EDGE"));

    static private final SubLList $list_alt100 = list(list(makeSymbol("CYCLS"), NIL));

    static private final SubLList $list_alt102 = list(list(RET, makeSymbol("CYCLS")));

    static private final SubLList $list_alt105 = list(list(makeSymbol("ROOT-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt106 = list(makeSymbol("*PARSE-ROOT-NODE*"), NIL);

    static private final SubLList $list_alt108 = list(makeSymbol("*PARSE-ROOT-NODE*"));

    static private final SubLList $list_alt109 = list(list(makeSymbol("*VARIABLE-UNIQUIFICATION-STORE*"), list(makeSymbol("NEW-DICTIONARY"), list(QUOTE, EQUALP))));

    static private final SubLList $list_alt110 = list(list(makeSymbol("FROM-PSP-CYCL"), makeSymbol("TO-PSP-CYCL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt115 = list(makeSymbol("REFERENT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt117 = list(makeSymbol("NEW-STRING-BASED-NCS?"), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 195 ms
 */
