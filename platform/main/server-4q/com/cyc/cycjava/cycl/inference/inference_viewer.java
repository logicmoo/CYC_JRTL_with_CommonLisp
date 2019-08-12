/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-VIEWER
 * source file: /cyc/top/cycl/inference/inference-viewer.lisp
 * created:     2019/07/03 17:37:48
 */
public final class inference_viewer extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_viewer();

 public static final String myName = "com.cyc.cycjava.cycl.inference.inference_viewer";


    static private final SubLList $list2 = cons(makeSymbol("PROBLEM"), makeSymbol("TIME"));

    static private final SubLSymbol $sym3$_ = makeSymbol(">");

    public static final SubLSymbol $cyc_term_working_set_query_lock$ = makeSymbol("*CYC-TERM-WORKING-SET-QUERY-LOCK*");

    static private final SubLString $str5$cyc_term_working_set_query_lock = makeString("cyc-term-working-set-query lock");

    public static final SubLSymbol $cyc_term_working_set_query_inference$ = makeSymbol("*CYC-TERM-WORKING-SET-QUERY-INFERENCE*");

    private static final SubLSymbol $kw7$MAINTAIN_TERM_WORKING_SET_ = makeKeyword("MAINTAIN-TERM-WORKING-SET?");

    static private final SubLString $str9$cyc_query_subprocess = makeString("cyc-query subprocess");

    private static final SubLSymbol CYC_TERM_WORKING_SET_QUERY_INT = makeSymbol("CYC-TERM-WORKING-SET-QUERY-INT");

    public static final SubLSymbol $external_inference_monitor_time_increment_secs$ = makeSymbol("*EXTERNAL-INFERENCE-MONITOR-TIME-INCREMENT-SECS*");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    public static final SubLSymbol $external_inference_monitor_max_terms$ = makeSymbol("*EXTERNAL-INFERENCE-MONITOR-MAX-TERMS*");



    private static final SubLSymbol EXTERNALLY_MONITOR_INFERENCE_TERM_WORKING_SET = makeSymbol("EXTERNALLY-MONITOR-INFERENCE-TERM-WORKING-SET");

    static private final SubLList $list17 = cons(makeSymbol("KEY"), makeSymbol("VAL"));

    static private final SubLList $list18 = list(makeSymbol("TIME"), makeSymbol("ALIST"));

    static private final SubLString $str19$____Time___s__ = makeString("~%~%Time: ~s~%");

    // Definitions
    /**
     *
     *
     * @return listp; an ordered alist, each item of the form (TERM . WEIGHT)
    returned in order of the highest weight first.
    WEIGHT is an estimate of how long INFERENCE has been working on problems containing TERM.
    'working on a problem P' is defined as:
    . P is possible
    . having executed at least one tactic on P
     * @param MAX-TERMS;
     * 		NIL or positive-integer-p; if non-nil, will only return
     * 		the highest-weighted MAX-TERMS terms.
     * @param FILTER;
     * 		a unary predicate to call on the forts in the problem queries.
     * 		If it returns NIL, the fort will be filtered out.
     * @param PENETRATE-HL-STRUCTURES?;
     * 		if T, we descend into embedded narts and assertions and return
     * 		the constants inside them.  If NIL, we return the narts (but not the assertions).
     */
    @LispMethod(comment = "@return listp; an ordered alist, each item of the form (TERM . WEIGHT)\r\nreturned in order of the highest weight first.\r\nWEIGHT is an estimate of how long INFERENCE has been working on problems containing TERM.\r\n\'working on a problem P\' is defined as:\r\n. P is possible\r\n. having executed at least one tactic on P\r\n@param MAX-TERMS;\r\n\t\tNIL or positive-integer-p; if non-nil, will only return\r\n\t\tthe highest-weighted MAX-TERMS terms.\r\n@param FILTER;\r\n\t\ta unary predicate to call on the forts in the problem queries.\r\n\t\tIf it returns NIL, the fort will be filtered out.\r\n@param PENETRATE-HL-STRUCTURES?;\r\n\t\tif T, we descend into embedded narts and assertions and return\r\n\t\tthe constants inside them.  If NIL, we return the narts (but not the assertions).")
    public static final SubLObject inference_term_working_set_alt(SubLObject inference, SubLObject max_terms, SubLObject filter, SubLObject penetrate_hl_structuresP) {
        if (max_terms == UNPROVIDED) {
            max_terms = NIL;
        }
        if (filter == UNPROVIDED) {
            filter = symbol_function(TRUE);
        }
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        if (NIL != max_terms) {
            SubLTrampolineFile.checkType(max_terms, POSITIVE_INTEGER_P);
        }
        {
            SubLObject dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject problem_alist = NIL;
            if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                {
                    SubLObject table = inference_datastructures_inference.inference_problem_working_time_table(inference);
                    problem_alist = hash_table_utilities.hash_table_to_alist(table);
                }
                {
                    SubLObject forbidden_inference_viewer_fort_set = set_utilities.construct_set_from_list(com.cyc.cycjava.cycl.inference.inference_viewer.forbidden_inference_viewer_forts(inference, penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
                    SubLObject now = get_internal_real_time();
                    SubLObject cdolist_list_var = problem_alist;
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject problem = NIL;
                            SubLObject time = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt2);
                            problem = current.first();
                            current = current.rest();
                            time = current;
                            {
                                SubLObject elapsed_internal_real_time = subtract(now, time);
                                SubLObject cdolist_list_var_1 = cycl_utilities.expression_forts(inference_datastructures_problem.problem_query(problem), penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
                                SubLObject fort = NIL;
                                for (fort = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , fort = cdolist_list_var_1.first()) {
                                    if (NIL == set.set_memberP(fort, forbidden_inference_viewer_fort_set)) {
                                        if (NIL != com.cyc.cycjava.cycl.inference.inference_viewer.fort_passes_inference_viewer_filterP(fort, filter)) {
                                            dictionary_utilities.dictionary_increment(dict, fort, elapsed_internal_real_time);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject term_alist = dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym3$_));
                if (NIL != subl_promotions.positive_integer_p(max_terms)) {
                    return list_utilities.first_n(max_terms, term_alist);
                } else {
                    return term_alist;
                }
            }
        }
    }

    // Definitions
    /**
     *
     *
     * @return listp; an ordered alist, each item of the form (TERM . WEIGHT)
    returned in order of the highest weight first.
    WEIGHT is an estimate of how long INFERENCE has been working on problems containing TERM.
    'working on a problem P' is defined as:
    . P is possible
    . having executed at least one tactic on P
     * @param MAX-TERMS;
     * 		NIL or positive-integer-p; if non-nil, will only return
     * 		the highest-weighted MAX-TERMS terms.
     * @param FILTER;
     * 		a unary predicate to call on the forts in the problem queries.
     * 		If it returns NIL, the fort will be filtered out.
     * @param PENETRATE-HL-STRUCTURES?;
     * 		if T, we descend into embedded narts and assertions and return
     * 		the constants inside them.  If NIL, we return the narts (but not the assertions).
     */
    @LispMethod(comment = "@return listp; an ordered alist, each item of the form (TERM . WEIGHT)\r\nreturned in order of the highest weight first.\r\nWEIGHT is an estimate of how long INFERENCE has been working on problems containing TERM.\r\n\'working on a problem P\' is defined as:\r\n. P is possible\r\n. having executed at least one tactic on P\r\n@param MAX-TERMS;\r\n\t\tNIL or positive-integer-p; if non-nil, will only return\r\n\t\tthe highest-weighted MAX-TERMS terms.\r\n@param FILTER;\r\n\t\ta unary predicate to call on the forts in the problem queries.\r\n\t\tIf it returns NIL, the fort will be filtered out.\r\n@param PENETRATE-HL-STRUCTURES?;\r\n\t\tif T, we descend into embedded narts and assertions and return\r\n\t\tthe constants inside them.  If NIL, we return the narts (but not the assertions).")
    public static SubLObject inference_term_working_set(final SubLObject inference, SubLObject max_terms, SubLObject filter, SubLObject penetrate_hl_structuresP) {
        if (max_terms == UNPROVIDED) {
            max_terms = NIL;
        }
        if (filter == UNPROVIDED) {
            filter = symbol_function(TRUE);
        }
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        if (((NIL != max_terms) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(max_terms))) {
            throw new AssertionError(max_terms);
        }
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        SubLObject problem_alist = NIL;
        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            final SubLObject table = inference_datastructures_inference.inference_problem_working_time_table(inference);
            problem_alist = hash_table_utilities.hash_table_to_alist(table);
            final SubLObject forbidden_inference_viewer_fort_set = set_utilities.construct_set_from_list(forbidden_inference_viewer_forts(inference, penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
            final SubLObject now = get_internal_real_time();
            SubLObject cdolist_list_var = problem_alist;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject problem = NIL;
                SubLObject time = NIL;
                destructuring_bind_must_consp(current, datum, $list2);
                problem = current.first();
                current = time = current.rest();
                final SubLObject elapsed_internal_real_time = subtract(now, time);
                SubLObject cdolist_list_var_$1 = cycl_utilities.expression_forts(inference_datastructures_problem.problem_query(problem), penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
                SubLObject fort = NIL;
                fort = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if ((NIL == set.set_memberP(fort, forbidden_inference_viewer_fort_set)) && (NIL != fort_passes_inference_viewer_filterP(fort, filter))) {
                        dictionary_utilities.dictionary_increment(dict, fort, elapsed_internal_real_time);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    fort = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        }
        final SubLObject term_alist = dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym3$_));
        if (NIL != subl_promotions.positive_integer_p(max_terms)) {
            return list_utilities.first_n(max_terms, term_alist);
        }
        return term_alist;
    }

    public static final SubLObject fort_passes_inference_viewer_filterP_alt(SubLObject fort, SubLObject filter) {
        if (symbol_function(TRUE) == filter) {
            return T;
        } else {
            return funcall(filter, fort);
        }
    }

    public static SubLObject fort_passes_inference_viewer_filterP(final SubLObject fort, final SubLObject filter) {
        if (symbol_function(TRUE).eql(filter)) {
            return T;
        }
        return funcall(filter, fort);
    }

    public static final SubLObject forbidden_inference_viewer_forts_alt(SubLObject inference, SubLObject penetrate_hl_structuresP) {
        return cycl_utilities.expression_forts(inference_datastructures_inference.inference_mt(inference), penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject forbidden_inference_viewer_forts(final SubLObject inference, final SubLObject penetrate_hl_structuresP) {
        return cycl_utilities.expression_forts(inference_datastructures_inference.inference_mt(inference), penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_term_working_set_query_int_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        {
            SubLObject new_query_properties = putf(copy_list(query_properties), $kw7$MAINTAIN_TERM_WORKING_SET_, T);
            SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(new_query_properties));
            SubLObject lock = $cyc_term_working_set_query_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $cyc_term_working_set_query_inference$.setGlobalValue(inference);
                inference_kernel.continue_inference($cyc_term_working_set_query_inference$.getGlobalValue(), inference_datastructures_enumerated_types.extract_query_dynamic_properties(new_query_properties));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cyc_term_working_set_query_int(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties) {
        final SubLObject new_query_properties = putf(copy_list(query_properties), $kw7$MAINTAIN_TERM_WORKING_SET_, T);
        final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(new_query_properties));
        SubLObject release = NIL;
        try {
            release = seize_lock($cyc_term_working_set_query_lock$.getGlobalValue());
            $cyc_term_working_set_query_inference$.setGlobalValue(inference);
            inference_kernel.continue_inference($cyc_term_working_set_query_inference$.getGlobalValue(), inference_datastructures_enumerated_types.extract_query_dynamic_properties(new_query_properties));
        } finally {
            if (NIL != release) {
                release_lock($cyc_term_working_set_query_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Like @xref new-cyc-query except, every TIME-INCREMENT, gathers the alist of
     * the terms being worked on, until the inference is suspended.
     * Returns a list of data, each datum of the form (UNIVERSAL-TIME TERM-WORKING-SET-ALIST)
     */
    @LispMethod(comment = "Like @xref new-cyc-query except, every TIME-INCREMENT, gathers the alist of\r\nthe terms being worked on, until the inference is suspended.\r\nReturns a list of data, each datum of the form (UNIVERSAL-TIME TERM-WORKING-SET-ALIST)\nLike @xref new-cyc-query except, every TIME-INCREMENT, gathers the alist of\nthe terms being worked on, until the inference is suspended.\nReturns a list of data, each datum of the form (UNIVERSAL-TIME TERM-WORKING-SET-ALIST)")
    public static final SubLObject cyc_term_working_set_query_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties, SubLObject time_increment, SubLObject filter, SubLObject penetrate_hl_structuresP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (time_increment == UNPROVIDED) {
            time_increment = NIL;
        }
        if (filter == UNPROVIDED) {
            filter = symbol_function(TRUE);
        }
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        SubLTrampolineFile.checkType(time_increment, NON_NEGATIVE_NUMBER_P);
        {
            SubLObject data = NIL;
            SubLObject lock = $cyc_term_working_set_query_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $cyc_term_working_set_query_inference$.setGlobalValue(NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            subl_promotions.make_process_with_args($str_alt9$cyc_query_subprocess, CYC_TERM_WORKING_SET_QUERY_INT, list(sentence, mt, query_properties));
            while (!((NIL != inference_datastructures_inference.inference_p($cyc_term_working_set_query_inference$.getGlobalValue())) && (NIL != inference_datastructures_inference.suspended_inference_p($cyc_term_working_set_query_inference$.getGlobalValue())))) {
                if (NIL != inference_datastructures_inference.inference_p($cyc_term_working_set_query_inference$.getGlobalValue())) {
                    {
                        SubLObject datum = list(get_universal_time(), com.cyc.cycjava.cycl.inference.inference_viewer.inference_term_working_set($cyc_term_working_set_query_inference$.getGlobalValue(), NIL, filter, penetrate_hl_structuresP));
                        data = cons(datum, data);
                    }
                }
                sleep(time_increment);
            } 
            return nreverse(data);
        }
    }

    /**
     * Like @xref new-cyc-query except, every TIME-INCREMENT, gathers the alist of
     * the terms being worked on, until the inference is suspended.
     * Returns a list of data, each datum of the form (UNIVERSAL-TIME TERM-WORKING-SET-ALIST)
     */
    @LispMethod(comment = "Like @xref new-cyc-query except, every TIME-INCREMENT, gathers the alist of\r\nthe terms being worked on, until the inference is suspended.\r\nReturns a list of data, each datum of the form (UNIVERSAL-TIME TERM-WORKING-SET-ALIST)\nLike @xref new-cyc-query except, every TIME-INCREMENT, gathers the alist of\nthe terms being worked on, until the inference is suspended.\nReturns a list of data, each datum of the form (UNIVERSAL-TIME TERM-WORKING-SET-ALIST)")
    public static SubLObject cyc_term_working_set_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties, SubLObject time_increment, SubLObject filter, SubLObject penetrate_hl_structuresP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (time_increment == UNPROVIDED) {
            time_increment = NIL;
        }
        if (filter == UNPROVIDED) {
            filter = symbol_function(TRUE);
        }
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        assert NIL != number_utilities.non_negative_number_p(time_increment) : "! number_utilities.non_negative_number_p(time_increment) " + ("number_utilities.non_negative_number_p(time_increment) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(time_increment) ") + time_increment;
        SubLObject data = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($cyc_term_working_set_query_lock$.getGlobalValue());
            $cyc_term_working_set_query_inference$.setGlobalValue(NIL);
        } finally {
            if (NIL != release) {
                release_lock($cyc_term_working_set_query_lock$.getGlobalValue());
            }
        }
        subl_promotions.make_process_with_args($str9$cyc_query_subprocess, CYC_TERM_WORKING_SET_QUERY_INT, list(sentence, mt, query_properties));
        while ((NIL == inference_datastructures_inference.inference_p($cyc_term_working_set_query_inference$.getGlobalValue())) || (NIL == inference_datastructures_inference.suspended_inference_p($cyc_term_working_set_query_inference$.getGlobalValue()))) {
            if (NIL != inference_datastructures_inference.inference_p($cyc_term_working_set_query_inference$.getGlobalValue())) {
                final SubLObject datum = list(get_universal_time(), inference_term_working_set($cyc_term_working_set_query_inference$.getGlobalValue(), NIL, filter, penetrate_hl_structuresP));
                data = cons(datum, data);
            }
            sleep(time_increment);
        } 
        return nreverse(data);
    }

    /**
     *
     *
     * @return NIL or an error message
    Posts multiple (incremental) listp; (TIME TERM-LIST) where TERM-LIST is an ordered
    list of pairs, each item of the form (NL-GENERATION-PPH-LIST WEIGHT)
    posted in order of the highest weight first.
    WEIGHT is an estimate of how long INFERENCE has been working on problems containing TERM.
    'working on a problem P' is defined as:
    . P is possible
    . having executed at least one tactic on P
    Posts results incrementally using the task api processor. Will error if the function
    is not called from a task api processor thread.
     * @param problem-store-id;
     * 		;the problem store  to monitor
     * @param inference-id;
     * 		;the inference to monitor
     * @param MAX-TERMS;
     * 		NIL or positive-integer-p; if non-nil, will only post
     * 		the highest-weighted MAX-TERMS terms.
     * @param TIME-INCREMENT-SECS;
     * 		non-negative-number-p; period to sleep before sending more results
     * @param FILTER;
     * 		a unary predicate to call on the forts in the problem queries.
     * 		If it returns NIL, the fort will be filtered out.
     * @param PENETRATE-HL-STRUCTURES?;
     * 		if T, we descend into embedded narts and assertions and post
     * 		the constants inside them.  If NIL, we post the narts (but not the assertions).
     */
    @LispMethod(comment = "@return NIL or an error message\r\nPosts multiple (incremental) listp; (TIME TERM-LIST) where TERM-LIST is an ordered\r\nlist of pairs, each item of the form (NL-GENERATION-PPH-LIST WEIGHT)\r\nposted in order of the highest weight first.\r\nWEIGHT is an estimate of how long INFERENCE has been working on problems containing TERM.\r\n\'working on a problem P\' is defined as:\r\n. P is possible\r\n. having executed at least one tactic on P\r\nPosts results incrementally using the task api processor. Will error if the function\r\nis not called from a task api processor thread.\r\n@param problem-store-id;\r\n\t\t;the problem store  to monitor\r\n@param inference-id;\r\n\t\t;the inference to monitor\r\n@param MAX-TERMS;\r\n\t\tNIL or positive-integer-p; if non-nil, will only post\r\n\t\tthe highest-weighted MAX-TERMS terms.\r\n@param TIME-INCREMENT-SECS;\r\n\t\tnon-negative-number-p; period to sleep before sending more results\r\n@param FILTER;\r\n\t\ta unary predicate to call on the forts in the problem queries.\r\n\t\tIf it returns NIL, the fort will be filtered out.\r\n@param PENETRATE-HL-STRUCTURES?;\r\n\t\tif T, we descend into embedded narts and assertions and post\r\n\t\tthe constants inside them.  If NIL, we post the narts (but not the assertions).")
    public static final SubLObject externally_monitor_inference_term_working_set_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject time_increment_secs, SubLObject max_terms, SubLObject filter, SubLObject penetrate_hl_structuresP) {
        if (time_increment_secs == UNPROVIDED) {
            time_increment_secs = $external_inference_monitor_time_increment_secs$.getGlobalValue();
        }
        if (max_terms == UNPROVIDED) {
            max_terms = $external_inference_monitor_max_terms$.getGlobalValue();
        }
        if (filter == UNPROVIDED) {
            filter = symbol_function(TRUE);
        }
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        SubLTrampolineFile.checkType(time_increment_secs, NON_NEGATIVE_NUMBER_P);
        SubLTrampolineFile.checkType(max_terms, POSITIVE_INTEGER_P);
        {
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
                                while ((NIL != inference_datastructures_inference.valid_inference_p(inference)) && (NIL == inference_datastructures_inference.suspended_inference_p(inference))) {
                                    if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                                        {
                                            SubLObject terms_alist = com.cyc.cycjava.cycl.inference.inference_viewer.inference_term_working_set(inference, max_terms, filter, penetrate_hl_structuresP);
                                            SubLObject terms_list_for_java = NIL;
                                            SubLObject cdolist_list_var = terms_alist;
                                            SubLObject cons = NIL;
                                            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = cons;
                                                    SubLObject current = datum;
                                                    SubLObject key = NIL;
                                                    SubLObject val = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt17);
                                                    key = current.first();
                                                    current = current.rest();
                                                    val = current;
                                                    terms_list_for_java = cons(list(pph_main.cached_paraphrase_for_java(key, UNPROVIDED), val), terms_list_for_java);
                                                }
                                            }
                                            terms_list_for_java = nreverse(terms_list_for_java);
                                            {
                                                SubLObject datum = list(get_universal_time(), terms_list_for_java);
                                                task_processor.post_task_info_processor_partial_results(datum);
                                            }
                                        }
                                        sleep(time_increment_secs);
                                    }
                                } 
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            return error;
        }
    }

    /**
     *
     *
     * @return NIL or an error message
    Posts multiple (incremental) listp; (TIME TERM-LIST) where TERM-LIST is an ordered
    list of pairs, each item of the form (NL-GENERATION-PPH-LIST WEIGHT)
    posted in order of the highest weight first.
    WEIGHT is an estimate of how long INFERENCE has been working on problems containing TERM.
    'working on a problem P' is defined as:
    . P is possible
    . having executed at least one tactic on P
    Posts results incrementally using the task api processor. Will error if the function
    is not called from a task api processor thread.
     * @param problem-store-id;
     * 		;the problem store  to monitor
     * @param inference-id;
     * 		;the inference to monitor
     * @param MAX-TERMS;
     * 		NIL or positive-integer-p; if non-nil, will only post
     * 		the highest-weighted MAX-TERMS terms.
     * @param TIME-INCREMENT-SECS;
     * 		non-negative-number-p; period to sleep before sending more results
     * @param FILTER;
     * 		a unary predicate to call on the forts in the problem queries.
     * 		If it returns NIL, the fort will be filtered out.
     * @param PENETRATE-HL-STRUCTURES?;
     * 		if T, we descend into embedded narts and assertions and post
     * 		the constants inside them.  If NIL, we post the narts (but not the assertions).
     */
    @LispMethod(comment = "@return NIL or an error message\r\nPosts multiple (incremental) listp; (TIME TERM-LIST) where TERM-LIST is an ordered\r\nlist of pairs, each item of the form (NL-GENERATION-PPH-LIST WEIGHT)\r\nposted in order of the highest weight first.\r\nWEIGHT is an estimate of how long INFERENCE has been working on problems containing TERM.\r\n\'working on a problem P\' is defined as:\r\n. P is possible\r\n. having executed at least one tactic on P\r\nPosts results incrementally using the task api processor. Will error if the function\r\nis not called from a task api processor thread.\r\n@param problem-store-id;\r\n\t\t;the problem store  to monitor\r\n@param inference-id;\r\n\t\t;the inference to monitor\r\n@param MAX-TERMS;\r\n\t\tNIL or positive-integer-p; if non-nil, will only post\r\n\t\tthe highest-weighted MAX-TERMS terms.\r\n@param TIME-INCREMENT-SECS;\r\n\t\tnon-negative-number-p; period to sleep before sending more results\r\n@param FILTER;\r\n\t\ta unary predicate to call on the forts in the problem queries.\r\n\t\tIf it returns NIL, the fort will be filtered out.\r\n@param PENETRATE-HL-STRUCTURES?;\r\n\t\tif T, we descend into embedded narts and assertions and post\r\n\t\tthe constants inside them.  If NIL, we post the narts (but not the assertions).")
    public static SubLObject externally_monitor_inference_term_working_set(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject time_increment_secs, SubLObject max_terms, SubLObject filter, SubLObject penetrate_hl_structuresP) {
        if (time_increment_secs == UNPROVIDED) {
            time_increment_secs = $external_inference_monitor_time_increment_secs$.getGlobalValue();
        }
        if (max_terms == UNPROVIDED) {
            max_terms = $external_inference_monitor_max_terms$.getGlobalValue();
        }
        if (filter == UNPROVIDED) {
            filter = symbol_function(TRUE);
        }
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != number_utilities.non_negative_number_p(time_increment_secs) : "! number_utilities.non_negative_number_p(time_increment_secs) " + ("number_utilities.non_negative_number_p(time_increment_secs) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(time_increment_secs) ") + time_increment_secs;
        assert NIL != subl_promotions.positive_integer_p(max_terms) : "! subl_promotions.positive_integer_p(max_terms) " + ("subl_promotions.positive_integer_p(max_terms) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(max_terms) ") + max_terms;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
                    while ((NIL != inference_datastructures_inference.valid_inference_p(inference)) && (NIL == inference_datastructures_inference.suspended_inference_p(inference))) {
                        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                            final SubLObject terms_alist = inference_term_working_set(inference, max_terms, filter, penetrate_hl_structuresP);
                            SubLObject terms_list_for_java = NIL;
                            SubLObject cdolist_list_var = terms_alist;
                            SubLObject cons = NIL;
                            cons = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = cons;
                                SubLObject key = NIL;
                                SubLObject val = NIL;
                                destructuring_bind_must_consp(current, datum, $list17);
                                key = current.first();
                                current = val = current.rest();
                                terms_list_for_java = cons(list(pph_main.cached_paraphrase_for_java(key, UNPROVIDED), val), terms_list_for_java);
                                cdolist_list_var = cdolist_list_var.rest();
                                cons = cdolist_list_var.first();
                            } 
                            terms_list_for_java = nreverse(terms_list_for_java);
                            final SubLObject datum = list(get_universal_time(), terms_list_for_java);
                            task_processor.post_task_info_processor_partial_results(datum);
                            sleep(time_increment_secs);
                        }
                    } 
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return error;
    }

    public static final SubLObject print_term_working_set_data_alt(SubLObject data) {
        {
            SubLObject cdolist_list_var = data;
            SubLObject datum = NIL;
            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                {
                    SubLObject datum_2 = datum;
                    SubLObject current = datum_2;
                    SubLObject time = NIL;
                    SubLObject alist = NIL;
                    destructuring_bind_must_consp(current, datum_2, $list_alt18);
                    time = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_2, $list_alt18);
                    alist = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        format(T, $str_alt19$____Time___s__, numeric_date_utilities.timestring(time));
                        format_nil.print_one_per_line(alist, UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum_2, $list_alt18);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject print_term_working_set_data(final SubLObject data) {
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$2 = current = datum;
            SubLObject time = NIL;
            SubLObject alist = NIL;
            destructuring_bind_must_consp(current, datum_$2, $list18);
            time = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum_$2, $list18);
            alist = current.first();
            current = current.rest();
            if (NIL == current) {
                format(T, $str19$____Time___s__, numeric_date_utilities.timestring(time));
                format_nil.print_one_per_line(alist, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum_$2, $list18);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_inference_viewer_file() {
        declareFunction("inference_term_working_set", "INFERENCE-TERM-WORKING-SET", 1, 3, false);
        declareFunction("fort_passes_inference_viewer_filterP", "FORT-PASSES-INFERENCE-VIEWER-FILTER?", 2, 0, false);
        declareFunction("forbidden_inference_viewer_forts", "FORBIDDEN-INFERENCE-VIEWER-FORTS", 2, 0, false);
        declareFunction("cyc_term_working_set_query_int", "CYC-TERM-WORKING-SET-QUERY-INT", 3, 0, false);
        declareFunction("cyc_term_working_set_query", "CYC-TERM-WORKING-SET-QUERY", 1, 5, false);
        declareFunction("externally_monitor_inference_term_working_set", "EXTERNALLY-MONITOR-INFERENCE-TERM-WORKING-SET", 2, 4, false);
        declareFunction("print_term_working_set_data", "PRINT-TERM-WORKING-SET-DATA", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_viewer_file_alt() {
        deflexical("*CYC-TERM-WORKING-SET-QUERY-LOCK*", NIL != boundp($cyc_term_working_set_query_lock$) ? ((SubLObject) ($cyc_term_working_set_query_lock$.getGlobalValue())) : make_lock($str_alt5$cyc_term_working_set_query_lock));
        deflexical("*CYC-TERM-WORKING-SET-QUERY-INFERENCE*", NIL != boundp($cyc_term_working_set_query_inference$) ? ((SubLObject) ($cyc_term_working_set_query_inference$.getGlobalValue())) : NIL);
        deflexical("*EXTERNAL-INFERENCE-MONITOR-TIME-INCREMENT-SECS*", $float$0_5);
        deflexical("*EXTERNAL-INFERENCE-MONITOR-MAX-TERMS*", $int$25);
        return NIL;
    }

    public static SubLObject init_inference_viewer_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CYC-TERM-WORKING-SET-QUERY-LOCK*", SubLTrampolineFile.maybeDefault($cyc_term_working_set_query_lock$, $cyc_term_working_set_query_lock$, () -> make_lock($str5$cyc_term_working_set_query_lock)));
            deflexical("*CYC-TERM-WORKING-SET-QUERY-INFERENCE*", SubLTrampolineFile.maybeDefault($cyc_term_working_set_query_inference$, $cyc_term_working_set_query_inference$, NIL));
            deflexical("*EXTERNAL-INFERENCE-MONITOR-TIME-INCREMENT-SECS*", $float$0_5);
            deflexical("*EXTERNAL-INFERENCE-MONITOR-MAX-TERMS*", $int$25);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CYC-TERM-WORKING-SET-QUERY-LOCK*", NIL != boundp($cyc_term_working_set_query_lock$) ? ((SubLObject) ($cyc_term_working_set_query_lock$.getGlobalValue())) : make_lock($str_alt5$cyc_term_working_set_query_lock));
            deflexical("*CYC-TERM-WORKING-SET-QUERY-INFERENCE*", NIL != boundp($cyc_term_working_set_query_inference$) ? ((SubLObject) ($cyc_term_working_set_query_inference$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_inference_viewer_file_Previous() {
        deflexical("*CYC-TERM-WORKING-SET-QUERY-LOCK*", SubLTrampolineFile.maybeDefault($cyc_term_working_set_query_lock$, $cyc_term_working_set_query_lock$, () -> make_lock($str5$cyc_term_working_set_query_lock)));
        deflexical("*CYC-TERM-WORKING-SET-QUERY-INFERENCE*", SubLTrampolineFile.maybeDefault($cyc_term_working_set_query_inference$, $cyc_term_working_set_query_inference$, NIL));
        deflexical("*EXTERNAL-INFERENCE-MONITOR-TIME-INCREMENT-SECS*", $float$0_5);
        deflexical("*EXTERNAL-INFERENCE-MONITOR-MAX-TERMS*", $int$25);
        return NIL;
    }

    public static SubLObject setup_inference_viewer_file() {
        declare_defglobal($cyc_term_working_set_query_lock$);
        declare_defglobal($cyc_term_working_set_query_inference$);
        register_external_symbol($external_inference_monitor_time_increment_secs$);
        register_external_symbol($external_inference_monitor_max_terms$);
        register_external_symbol(EXTERNALLY_MONITOR_INFERENCE_TERM_WORKING_SET);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_viewer_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_viewer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_viewer_file();
    }

    static {
    }

    static private final SubLList $list_alt2 = cons(makeSymbol("PROBLEM"), makeSymbol("TIME"));

    static private final SubLString $str_alt5$cyc_term_working_set_query_lock = makeString("cyc-term-working-set-query lock");

    static private final SubLString $str_alt9$cyc_query_subprocess = makeString("cyc-query subprocess");

    static private final SubLList $list_alt17 = cons(makeSymbol("KEY"), makeSymbol("VAL"));

    static private final SubLList $list_alt18 = list(makeSymbol("TIME"), makeSymbol("ALIST"));

    static private final SubLString $str_alt19$____Time___s__ = makeString("~%~%Time: ~s~%");
}

/**
 * Total time: 136 ms synthetic
 */
