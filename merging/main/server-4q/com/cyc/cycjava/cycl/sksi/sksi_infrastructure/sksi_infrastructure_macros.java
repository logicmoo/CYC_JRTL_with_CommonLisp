/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
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
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-INFRASTRUCTURE-MACROS
 * source file: /cyc/top/cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp
 * created:     2019/07/03 17:37:52
 */
public final class sksi_infrastructure_macros extends SubLTranslatedFile implements V12 {
    public static final SubLObject sksi_do_best_gaf_lookup_index_true(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject assertion_var = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    assertion_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    asent = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt12);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt12);
                            if (NIL == member(current_3, $list_alt13, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt12);
                        }
                        {
                            SubLObject methods_tail = property_list_member($METHODS, current);
                            SubLObject v_methods = (NIL != methods_tail) ? ((SubLObject) (cadr(methods_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_BEST_GAF_LOOKUP_INDEX, list(assertion_var, asent, $METHODS, v_methods, $TRUTH, $TRUE, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLFile me = new sksi_infrastructure_macros();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_profiling_onP$ = makeSymbol("*SKSI-PROFILING-ON?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_sql_query_time$ = makeSymbol("*SKSI-SQL-QUERY-TIME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_sql_query_count$ = makeSymbol("*SKSI-SQL-QUERY-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_sql_update_time$ = makeSymbol("*SKSI-SQL-UPDATE-TIME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_sql_update_count$ = makeSymbol("*SKSI-SQL-UPDATE-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_sql_batch_update_count$ = makeSymbol("*SKSI-SQL-BATCH-UPDATE-COUNT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list7 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("PREDICATE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list8 = list(makeKeyword("INDEX"), makeKeyword("PREDICATE"), $DONE);

    static private final SubLList $list12 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("ASENT"), makeSymbol("&KEY"), makeSymbol("METHODS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list13 = list(makeKeyword("METHODS"), $DONE);

    private static final SubLSymbol DO_GAFS_POTENTIALLY_MATCHING_FORMULA = makeSymbol("DO-GAFS-POTENTIALLY-MATCHING-FORMULA");

    static private final SubLList $list17 = list(list(makeSymbol("*SKSI-PROFILING-ON?*"), T), list(makeSymbol("*SKSI-SQL-QUERY-TIME*"), ZERO_INTEGER), list(makeSymbol("*SKSI-SQL-QUERY-COUNT*"), ZERO_INTEGER), list(makeSymbol("*SKSI-SQL-UPDATE-TIME*"), ZERO_INTEGER), list(makeSymbol("*SKSI-SQL-UPDATE-COUNT*"), ZERO_INTEGER), list(makeSymbol("*SKSI-SQL-BATCH-UPDATE-COUNT*"), ZERO_INTEGER));

    static private final SubLSymbol $sym18$START_TIME = makeUninternedSymbol("START-TIME");

    static private final SubLSymbol $sym19$END_TIME = makeUninternedSymbol("END-TIME");

    static private final SubLSymbol $sym20$TOTAL_TIME = makeUninternedSymbol("TOTAL-TIME");

    static private final SubLSymbol $sym21$RESULT = makeUninternedSymbol("RESULT");

    static private final SubLList $list22 = list(list(makeSymbol("GET-INTERNAL-REAL-TIME")));

    private static final SubLSymbol WITH_SKSI_PROFILING_ON = makeSymbol("WITH-SKSI-PROFILING-ON");

    static private final SubLString $str27$Result_____A__ = makeString("Result: ~%~A~%");

    private static final SubLSymbol ELAPSED_SECONDS_BETWEEN_INTERNAL_REAL_TIMES = makeSymbol("ELAPSED-SECONDS-BETWEEN-INTERNAL-REAL-TIMES");

    static private final SubLString $str29$__Query_time____A_sec__ = makeString("~%Query time : ~A sec~%");

    static private final SubLString $str30$_Cyc_side____A_sec__ = makeString(" Cyc side : ~A sec~%");

    static private final SubLSymbol $sym31$_ = makeSymbol("-");

    static private final SubLList $list32 = list(makeSymbol("*SKSI-SQL-QUERY-TIME*"));

    static private final SubLList $list33 = list(makeSymbol("FORMAT"), T, makeString(" DB side : ~A sec~%"), makeSymbol("*SKSI-SQL-QUERY-TIME*"));

    static private final SubLList $list34 = list(makeSymbol("FORMAT"), T, makeString(" # queries : ~A~%"), makeSymbol("*SKSI-SQL-QUERY-COUNT*"));

    static private final SubLString $str35$___bindings____A__ = makeString(" # bindings : ~A~%");

    static private final SubLList $list39 = list(ZERO_INTEGER);

    // Definitions
    public static final SubLObject sksi_do_predicate_extent_index_true_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject predicate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    predicate = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_PREDICATE_EXTENT_INDEX, list(var, predicate, $TRUTH, $TRUE, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject sksi_do_predicate_extent_index_true(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_PREDICATE_EXTENT_INDEX, list(var, predicate, $TRUTH, $TRUE, $DONE, done), append(body, NIL));
    }

    public static final SubLObject sksi_do_gaf_arg_index_true_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt7);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt7);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt7);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt7);
                            if (NIL == member(current_2, $list_alt8, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt7);
                        }
                        {
                            SubLObject index_tail = property_list_member($INDEX, current);
                            SubLObject index = (NIL != index_tail) ? ((SubLObject) (cadr(index_tail))) : NIL;
                            SubLObject predicate_tail = property_list_member($PREDICATE, current);
                            SubLObject predicate = (NIL != predicate_tail) ? ((SubLObject) (cadr(predicate_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $INDEX, index, $PREDICATE, predicate, $TRUTH, $TRUE, $DONE, done }), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject sksi_do_gaf_arg_index_true(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list7);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list7);
            if (NIL == member(current_$2, $list8, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list7);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject predicate_tail = property_list_member($PREDICATE, current);
        final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $INDEX, index, $PREDICATE, predicate, $TRUTH, $TRUE, $DONE, done }), append(body, NIL));
    }

    public static SubLObject sksi_do_gafs_potentially_matching_formula_true(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        asent = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list12);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list12);
            if (NIL == member(current_$3, $list13, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list12);
        }
        final SubLObject methods_tail = property_list_member($METHODS, current);
        final SubLObject v_methods = (NIL != methods_tail) ? cadr(methods_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_GAFS_POTENTIALLY_MATCHING_FORMULA, list(assertion_var, asent, $METHODS, v_methods, $TRUTH, $TRUE, $DONE, done), append(body, NIL));
    }

    public static final SubLObject sksi_profiling_onP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sksi_profiling_onP$.getDynamicValue(thread);
        }
    }

    public static SubLObject sksi_profiling_onP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sksi_profiling_onP$.getDynamicValue(thread);
    }

    public static final SubLObject with_sksi_profiling_on_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt17, append(body, NIL));
        }
    }

    public static SubLObject with_sksi_profiling_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list17, append(body, NIL));
    }

    /**
     * BODY is supposed to be some kind of inference call
     * like @xref new-cyc-query or @xref removal-ask.
     * BODY is evaluated and several types of info
     * gathered during that evaluation (total real time,
     * real time spent on the DB side on SQL queries,
     * real time spent on the Cyc side by the inference
     * engine, the number of SQL queries made and the
     * number of bindings returned by the inference engine
     * as well as the bindings themselves) are displayed.
     */
    @LispMethod(comment = "BODY is supposed to be some kind of inference call\r\nlike @xref new-cyc-query or @xref removal-ask.\r\nBODY is evaluated and several types of info\r\ngathered during that evaluation (total real time,\r\nreal time spent on the DB side on SQL queries,\r\nreal time spent on the Cyc side by the inference\r\nengine, the number of SQL queries made and the\r\nnumber of bindings returned by the inference engine\r\nas well as the bindings themselves) are displayed.\nBODY is supposed to be some kind of inference call\nlike @xref new-cyc-query or @xref removal-ask.\nBODY is evaluated and several types of info\ngathered during that evaluation (total real time,\nreal time spent on the DB side on SQL queries,\nreal time spent on the Cyc side by the inference\nengine, the number of SQL queries made and the\nnumber of bindings returned by the inference engine\nas well as the bindings themselves) are displayed.")
    public static final SubLObject with_sksi_query_profiling_results_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject start_time = $sym18$START_TIME;
            SubLObject end_time = $sym19$END_TIME;
            SubLObject total_time = $sym20$TOTAL_TIME;
            SubLObject result = $sym21$RESULT;
            return list(CLET, list(bq_cons(start_time, $list_alt22), end_time, total_time, result), list(WITH_SKSI_PROFILING_ON, list(new SubLObject[]{ PROGN, listS(CSETQ, result, append(body, NIL)), listS(CSETQ, end_time, $list_alt22), list(FORMAT, T, $str_alt27$Result_____A__, result), list(CSETQ, total_time, list(ELAPSED_SECONDS_BETWEEN_INTERNAL_REAL_TIMES, start_time, end_time)), list(FORMAT, T, $str_alt29$__Query_time____A_sec__, total_time), list(FORMAT, T, $str_alt30$_Cyc_side____A_sec__, listS($sym31$_, total_time, $list_alt32)), $list_alt33, $list_alt34, list(FORMAT, T, $str_alt35$___bindings____A__, listS(FIF, list(CONSP, result), list(LIST_LENGTH, result), $list_alt39)) })));
        }
    }

    /**
     * BODY is supposed to be some kind of inference call
     * like @xref new-cyc-query or @xref removal-ask.
     * BODY is evaluated and several types of info
     * gathered during that evaluation (total real time,
     * real time spent on the DB side on SQL queries,
     * real time spent on the Cyc side by the inference
     * engine, the number of SQL queries made and the
     * number of bindings returned by the inference engine
     * as well as the bindings themselves) are displayed.
     */
    @LispMethod(comment = "BODY is supposed to be some kind of inference call\r\nlike @xref new-cyc-query or @xref removal-ask.\r\nBODY is evaluated and several types of info\r\ngathered during that evaluation (total real time,\r\nreal time spent on the DB side on SQL queries,\r\nreal time spent on the Cyc side by the inference\r\nengine, the number of SQL queries made and the\r\nnumber of bindings returned by the inference engine\r\nas well as the bindings themselves) are displayed.\nBODY is supposed to be some kind of inference call\nlike @xref new-cyc-query or @xref removal-ask.\nBODY is evaluated and several types of info\ngathered during that evaluation (total real time,\nreal time spent on the DB side on SQL queries,\nreal time spent on the Cyc side by the inference\nengine, the number of SQL queries made and the\nnumber of bindings returned by the inference engine\nas well as the bindings themselves) are displayed.")
    public static SubLObject with_sksi_query_profiling_results(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject start_time = $sym18$START_TIME;
        final SubLObject end_time = $sym19$END_TIME;
        final SubLObject total_time = $sym20$TOTAL_TIME;
        final SubLObject result = $sym21$RESULT;
        return list(CLET, list(bq_cons(start_time, $list22), end_time, total_time, result), list(WITH_SKSI_PROFILING_ON, list(new SubLObject[]{ PROGN, listS(CSETQ, result, append(body, NIL)), listS(CSETQ, end_time, $list22), list(FORMAT, T, $str27$Result_____A__, result), list(CSETQ, total_time, list(ELAPSED_SECONDS_BETWEEN_INTERNAL_REAL_TIMES, start_time, end_time)), list(FORMAT, T, $str29$__Query_time____A_sec__, total_time), list(FORMAT, T, $str30$_Cyc_side____A_sec__, listS($sym31$_, total_time, $list32)), $list33, $list34, list(FORMAT, T, $str35$___bindings____A__, listS(FIF, list(CONSP, result), list(LIST_LENGTH, result), $list39)) })));
    }

    public static final SubLObject declare_sksi_infrastructure_macros_file_alt() {
        declareMacro("sksi_do_predicate_extent_index_true", "SKSI-DO-PREDICATE-EXTENT-INDEX-TRUE");
        declareMacro("sksi_do_gaf_arg_index_true", "SKSI-DO-GAF-ARG-INDEX-TRUE");
        declareMacro("sksi_do_best_gaf_lookup_index_true", "SKSI-DO-BEST-GAF-LOOKUP-INDEX-TRUE");
        declareFunction("sksi_profiling_onP", "SKSI-PROFILING-ON?", 0, 0, false);
        declareMacro("with_sksi_profiling_on", "WITH-SKSI-PROFILING-ON");
        declareMacro("with_sksi_query_profiling_results", "WITH-SKSI-QUERY-PROFILING-RESULTS");
        return NIL;
    }

    public static SubLObject declare_sksi_infrastructure_macros_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("sksi_do_predicate_extent_index_true", "SKSI-DO-PREDICATE-EXTENT-INDEX-TRUE");
            declareMacro("sksi_do_gaf_arg_index_true", "SKSI-DO-GAF-ARG-INDEX-TRUE");
            declareMacro("sksi_do_gafs_potentially_matching_formula_true", "SKSI-DO-GAFS-POTENTIALLY-MATCHING-FORMULA-TRUE");
            declareFunction("sksi_profiling_onP", "SKSI-PROFILING-ON?", 0, 0, false);
            declareMacro("with_sksi_profiling_on", "WITH-SKSI-PROFILING-ON");
            declareMacro("with_sksi_query_profiling_results", "WITH-SKSI-QUERY-PROFILING-RESULTS");
        }
        if (SubLFiles.USE_V2) {
            declareMacro("sksi_do_best_gaf_lookup_index_true", "SKSI-DO-BEST-GAF-LOOKUP-INDEX-TRUE");
        }
        return NIL;
    }

    public static SubLObject declare_sksi_infrastructure_macros_file_Previous() {
        declareMacro("sksi_do_predicate_extent_index_true", "SKSI-DO-PREDICATE-EXTENT-INDEX-TRUE");
        declareMacro("sksi_do_gaf_arg_index_true", "SKSI-DO-GAF-ARG-INDEX-TRUE");
        declareMacro("sksi_do_gafs_potentially_matching_formula_true", "SKSI-DO-GAFS-POTENTIALLY-MATCHING-FORMULA-TRUE");
        declareFunction("sksi_profiling_onP", "SKSI-PROFILING-ON?", 0, 0, false);
        declareMacro("with_sksi_profiling_on", "WITH-SKSI-PROFILING-ON");
        declareMacro("with_sksi_query_profiling_results", "WITH-SKSI-QUERY-PROFILING-RESULTS");
        return NIL;
    }

    public static SubLObject init_sksi_infrastructure_macros_file() {
        defparameter("*SKSI-PROFILING-ON?*", NIL);
        defparameter("*SKSI-SQL-QUERY-TIME*", NIL);
        defparameter("*SKSI-SQL-QUERY-COUNT*", NIL);
        defparameter("*SKSI-SQL-UPDATE-TIME*", NIL);
        defparameter("*SKSI-SQL-UPDATE-COUNT*", NIL);
        defparameter("*SKSI-SQL-BATCH-UPDATE-COUNT*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_infrastructure_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_infrastructure_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_infrastructure_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_infrastructure_macros_file();
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    

    static private final SubLList $list_alt1 = list($DONE);

    static private final SubLList $list_alt7 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("PREDICATE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt8 = list(makeKeyword("INDEX"), makeKeyword("PREDICATE"), $DONE);

    static private final SubLList $list_alt12 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("ASENT"), makeSymbol("&KEY"), makeSymbol("METHODS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt13 = list(makeKeyword("METHODS"), $DONE);

    private static final SubLSymbol DO_BEST_GAF_LOOKUP_INDEX = makeSymbol("DO-BEST-GAF-LOOKUP-INDEX");

    static private final SubLList $list_alt17 = list(list(makeSymbol("*SKSI-PROFILING-ON?*"), T), list(makeSymbol("*SKSI-SQL-QUERY-TIME*"), ZERO_INTEGER), list(makeSymbol("*SKSI-SQL-QUERY-COUNT*"), ZERO_INTEGER), list(makeSymbol("*SKSI-SQL-UPDATE-TIME*"), ZERO_INTEGER), list(makeSymbol("*SKSI-SQL-UPDATE-COUNT*"), ZERO_INTEGER), list(makeSymbol("*SKSI-SQL-BATCH-UPDATE-COUNT*"), ZERO_INTEGER));

    static private final SubLList $list_alt22 = list(list(makeSymbol("GET-INTERNAL-REAL-TIME")));

    static private final SubLString $str_alt27$Result_____A__ = makeString("Result: ~%~A~%");

    static private final SubLString $str_alt29$__Query_time____A_sec__ = makeString("~%Query time : ~A sec~%");

    static private final SubLString $str_alt30$_Cyc_side____A_sec__ = makeString(" Cyc side : ~A sec~%");

    static private final SubLList $list_alt32 = list(makeSymbol("*SKSI-SQL-QUERY-TIME*"));

    static private final SubLList $list_alt33 = list(makeSymbol("FORMAT"), T, makeString(" DB side : ~A sec~%"), makeSymbol("*SKSI-SQL-QUERY-TIME*"));

    static private final SubLList $list_alt34 = list(makeSymbol("FORMAT"), T, makeString(" # queries : ~A~%"), makeSymbol("*SKSI-SQL-QUERY-COUNT*"));

    static private final SubLString $str_alt35$___bindings____A__ = makeString(" # bindings : ~A~%");

    static private final SubLList $list_alt39 = list(ZERO_INTEGER);
}

/**
 * Total time: 108 ms
 */
