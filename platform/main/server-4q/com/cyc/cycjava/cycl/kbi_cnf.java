/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KBI-CNF
 *  source file: /cyc/top/cycl/kbi-cnf.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class kbi_cnf extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_cnf() {
    }

    public static final SubLFile me = new kbi_cnf();


    // // Definitions
    public static final SubLObject cnf_diagnostics(SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        kbi_utilities.reset_kbi_state($CNF);
        return cnf_diagnostics_int(repairP, printP);
    }

    public static final SubLObject cnf_diagnostics_wrt(SubLObject v_modules, SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        kbi_utilities.reset_kbi_state($CNF);
        {
            SubLObject result = NIL;
            try {
                kbi_utilities.set_kbi_external_sub_domain_modules($CNF, v_modules);
                result = cnf_diagnostics_int(repairP, printP);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        kbi_utilities.clear_kbi_external_sub_domain_modules();
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject resume_cnf_diagnostics(SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_cnf_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_cnf_diagnostic_sweepP$.bind(T, thread);
                        result = cnf_diagnostics_int(repairP, printP);
                    } finally {
                        kbi_vars.$kbi_resuming_cnf_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject resume_cnf_diagnostics_wrt(SubLObject v_modules, SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_cnf_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_cnf_diagnostic_sweepP$.bind(T, thread);
                        try {
                            kbi_utilities.set_kbi_external_sub_domain_modules($CNF, v_modules);
                            result = cnf_diagnostics_int(repairP, printP);
                        } finally {
                            {
                                SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    kbi_utilities.clear_kbi_external_sub_domain_modules();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        kbi_vars.$kbi_resuming_cnf_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * perform kbi diagnostics sweep on CNFS
     */
    public static final SubLObject cnfs_diagnostics(SubLObject cnfs, SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_utilities.reset_kbi_state($CNF);
            {
                SubLObject result = NIL;
                kbi_vars.$kbi_last_domain$.setDynamicValue($CNF, thread);
                kbi_vars.$kbi_items_to_consider$.setDynamicValue(length(cnfs), thread);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = kbi_vars.$kbi_repairing_findingsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(kbi_vars.$kbi_relevant_mt_function$.getDynamicValue(thread), thread);
                        mt_relevance_macros.$mt$.bind(kbi_vars.$kbi_mt$.getDynamicValue(thread), thread);
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
                        kbi_vars.$kbi_repairing_findingsP$.bind(repairP, thread);
                        {
                            SubLObject list_var = cnfs;
                            utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt1$diagnosing__s_cnfs, kbi_vars.$kbi_items_to_consider$.getDynamicValue(thread)), thread);
                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject cnf = NIL;
                                        for (cnf = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            diagnose_cnf(cnf, UNPROVIDED);
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_5, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_4, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_3, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    } finally {
                        kbi_vars.$kbi_repairing_findingsP$.rebind(_prev_bind_3, thread);
                        kbi_vars.$kbi_caching_findingsP$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != printP) {
                    {
                        SubLObject _prev_bind_0 = kbi_vars.$kbi_print_whyP$.currentBinding(thread);
                        try {
                            kbi_vars.$kbi_print_whyP$.bind(T, thread);
                            result = kbi_utilities.kbi_print_domain_results($CNF);
                        } finally {
                            kbi_vars.$kbi_print_whyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject cnf_diagnostics_int(SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                kbi_vars.$kbi_last_domain$.setDynamicValue($CNF, thread);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = kbi_vars.$kbi_repairing_findingsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(kbi_vars.$kbi_relevant_mt_function$.getDynamicValue(thread), thread);
                        mt_relevance_macros.$mt$.bind(kbi_vars.$kbi_mt$.getDynamicValue(thread), thread);
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
                        kbi_vars.$kbi_repairing_findingsP$.bind(repairP, thread);
                        {
                            SubLObject idx = assertion_handles.do_assertions_table();
                            SubLObject total = id_index.id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            SubLTrampolineFile.checkType($$$mapping_Cyc_assertions, STRINGP);
                            {
                                SubLObject _prev_bind_0_6 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_8 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3_9 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble($$$mapping_Cyc_assertions);
                                    if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                        {
                                            SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                            SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                            SubLObject assertion = NIL;
                                            while (NIL != id) {
                                                assertion = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != id_index.do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                    utilities_macros.note_percent_progress(sofar, total);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    if (NIL != kbi_vars.$kbi_resuming_cnf_diagnostic_sweepP$.getDynamicValue(thread)) {
                                                        if (kbi_vars.$kbi_last_cnf_considered$.getDynamicValue(thread) == assertion_handles.assertion_id(assertion)) {
                                                            kbi_vars.$kbi_resuming_cnf_diagnostic_sweepP$.setDynamicValue(NIL, thread);
                                                        }
                                                    } else {
                                                        diagnose_cnf(assertions_high.assertion_cnf(assertion), assertions_high.assertion_mt(assertion));
                                                        kbi_vars.$kbi_last_cnf_considered$.setDynamicValue(assertion_handles.assertion_id(assertion), thread);
                                                    }
                                                }
                                                id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                            } 
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_9, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_8, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_7, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                            if (NIL != printP) {
                                {
                                    SubLObject _prev_bind_0_10 = kbi_vars.$kbi_print_whyP$.currentBinding(thread);
                                    try {
                                        kbi_vars.$kbi_print_whyP$.bind(T, thread);
                                        result = kbi_utilities.kbi_print_domain_results($CNF);
                                    } finally {
                                        kbi_vars.$kbi_print_whyP$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        kbi_vars.$kbi_repairing_findingsP$.rebind(_prev_bind_3, thread);
                        kbi_vars.$kbi_caching_findingsP$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }



    public static final SubLObject clear_cached_diagnose_cnf() {
        {
            SubLObject cs = $cached_diagnose_cnf_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cached_diagnose_cnf(SubLObject cnf, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_diagnose_cnf_caching_state$.getGlobalValue(), list(cnf, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_diagnose_cnf_internal(SubLObject cnf, SubLObject mt) {
        return diagnose_cnf(cnf, mt);
    }

    public static final SubLObject cached_diagnose_cnf(SubLObject cnf, SubLObject mt) {
        {
            SubLObject caching_state = $cached_diagnose_cnf_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_DIAGNOSE_CNF, $cached_diagnose_cnf_caching_state$, NIL, EQL, TWO_INTEGER, $int$1024);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(cnf, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (cnf.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(cached_diagnose_cnf_internal(cnf, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cnf, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * return kbi modules that hold for CNF
     */
    public static final SubLObject diagnose_cnf(SubLObject cnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gethash($CNF, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED).isNumber()) {
                sethash($CNF, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), add(gethash($CNF, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            }
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        result = diagnose_cnf_int(cnf);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject diagnose_cnf_int(SubLObject cnf) {
        return kbi_utilities.diagnose_qua_sub_domains(cnf, $CNF);
    }

    // defparameter
    public static final SubLSymbol $cnf_reflexive_wXo_different_repairs$ = makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-REPAIRS*");

    // defparameter
    public static final SubLSymbol $cnf_reflexive_wXo_different_results$ = makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-RESULTS*");

    // defparameter
    public static final SubLSymbol $cnf_reflexive_wXo_different_time$ = makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-TIME*");

    // defparameter
    public static final SubLSymbol $cnf_reflexive_wXo_different_count$ = makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-COUNT*");

    /**
     * test CNF for a reflexive neg-lit predicate while not excluding reflexive binding
     */
    public static final SubLObject cnf_reflexive_wXo_differentP(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw17$CNF_REFLEXIVE_W_O_DIFFERENT)) && (NIL != kbi_utilities.kbi_applies_toP($kw17$CNF_REFLEXIVE_W_O_DIFFERENT, cnf))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw17$CNF_REFLEXIVE_W_O_DIFFERENT);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_11 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_cnf_reflexive_wXo_differentP(cnf, UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw17$CNF_REFLEXIVE_W_O_DIFFERENT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-REFLEXIVE-W/O-DIFFERENT applies to CNF
     */
    public static final SubLObject why_cnf_reflexive_wXo_differentP(SubLObject cnf, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw17$CNF_REFLEXIVE_W_O_DIFFERENT, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_13 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_cnf_reflexive_wXo_differentP(cnf, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_13, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw17$CNF_REFLEXIVE_W_O_DIFFERENT, cnf, data);
                            } else {
                                return list($kw17$CNF_REFLEXIVE_W_O_DIFFERENT, cnf);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_cnf_reflexive_wXo_differentP(cnf, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_cnf_reflexive_wXo_differentP(SubLObject cnf, SubLObject mt, SubLObject varP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (varP == UNPROVIDED) {
            varP = $sym24$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject neg_lits = clauses.neg_lits(cnf);
                SubLObject pos_lits = clauses.pos_lits(cnf);
                SubLObject diff_lits = el_utilities.pred_lits(neg_lits, $$different);
                SubLObject doneP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = neg_lits;
                                SubLObject neg_lit = NIL;
                                for (neg_lit = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , neg_lit = csome_list_var.first()) {
                                    if ((((NIL != kb_accessors.reflexive_predicateP(el_utilities.literal_arg0(neg_lit, UNPROVIDED))) && (NIL != funcall(varP, el_utilities.literal_arg1(neg_lit, UNPROVIDED)))) && (NIL != funcall(varP, el_utilities.literal_arg2(neg_lit, UNPROVIDED)))) && (!el_utilities.literal_arg1(neg_lit, UNPROVIDED).eql(el_utilities.literal_arg2(neg_lit, UNPROVIDED)))) {
                                        {
                                            SubLObject not_okP = NIL;
                                            if (NIL == not_okP) {
                                                {
                                                    SubLObject csome_list_var_15 = pos_lits;
                                                    SubLObject pos_lit = NIL;
                                                    for (pos_lit = csome_list_var_15.first(); !((NIL != not_okP) || (NIL == csome_list_var_15)); csome_list_var_15 = csome_list_var_15.rest() , pos_lit = csome_list_var_15.first()) {
                                                        not_okP = makeBoolean((NIL != subl_promotions.memberP(el_utilities.literal_arg1(neg_lit, UNPROVIDED), el_utilities.literal_args(pos_lit, UNPROVIDED), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(el_utilities.literal_arg2(neg_lit, UNPROVIDED), el_utilities.literal_args(pos_lit, UNPROVIDED), UNPROVIDED, UNPROVIDED)));
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject okP = makeBoolean(NIL == not_okP);
                                                if (NIL == okP) {
                                                    {
                                                        SubLObject csome_list_var_16 = diff_lits;
                                                        SubLObject diff_lit = NIL;
                                                        for (diff_lit = csome_list_var_16.first(); !((NIL != okP) || (NIL == csome_list_var_16)); csome_list_var_16 = csome_list_var_16.rest() , diff_lit = csome_list_var_16.first()) {
                                                            okP = makeBoolean((NIL != subl_promotions.memberP(el_utilities.literal_arg1(neg_lit, UNPROVIDED), el_utilities.literal_args(diff_lit, UNPROVIDED), UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(el_utilities.literal_arg2(neg_lit, UNPROVIDED), el_utilities.literal_args(diff_lit, UNPROVIDED), UNPROVIDED, UNPROVIDED)));
                                                        }
                                                    }
                                                }
                                                if (NIL == okP) {
                                                    kbi_utilities.add_kbi_result(list(neg_lit, mt, kbi_vars.$kbi_assertion$.getDynamicValue(thread)));
                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_nl_why_cnf_reflexive_wXo_differentP(SubLObject cnf, SubLObject data) {
        if (NIL != data) {
            {
                SubLObject nl_result = $str_alt26$;
                nl_result = format(NIL, $str_alt27$_a__formula________s, NIL != third(data.first()) ? ((SubLObject) (format($str_alt28$assertion_id____a, assertion_handles.assertion_id(third(data.first()))))) : $str_alt26$, clauses.cnf_formula(cnf, UNPROVIDED));
                {
                    SubLObject cdolist_list_var = data;
                    SubLObject datum = NIL;
                    for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                        {
                            SubLObject datum_17 = datum;
                            SubLObject current = datum_17;
                            SubLObject reflexive_lit = NIL;
                            SubLObject mt = NIL;
                            SubLObject assertion = NIL;
                            destructuring_bind_must_consp(current, datum_17, $list_alt29);
                            reflexive_lit = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum_17, $list_alt29);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum_17, $list_alt29);
                            assertion = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject reflexive_pred = el_utilities.literal_arg0(reflexive_lit, UNPROVIDED);
                                    SubLObject var1 = el_utilities.literal_arg1(reflexive_lit, UNPROVIDED);
                                    SubLObject var2 = el_utilities.literal_arg2(reflexive_lit, UNPROVIDED);
                                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt30$__includes_reflexive_predicate__s, new SubLObject[]{ reflexive_pred, var1, var2 }));
                                }
                            } else {
                                cdestructuring_bind_error(datum_17, $list_alt29);
                            }
                        }
                    }
                }
                return nl_result;
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_nl_verbose_cnf_reflexive_wXo_differentP(SubLObject cnf, SubLObject data) {
        if (NIL != data) {
            {
                SubLObject datum = data.first();
                SubLObject current = datum;
                SubLObject reflexive_lit = NIL;
                SubLObject mt = NIL;
                SubLObject assertion = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt29);
                reflexive_lit = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt29);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt29);
                assertion = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject reflexive_pred = el_utilities.literal_arg0(reflexive_lit, UNPROVIDED);
                        SubLObject var1 = el_utilities.literal_arg1(reflexive_lit, UNPROVIDED);
                        SubLObject var2 = el_utilities.literal_arg2(reflexive_lit, UNPROVIDED);
                        return cconcatenate(NIL != assertion ? ((SubLObject) (format($str_alt31$assertion_id____a__, assertion_handles.assertion_id(assertion)))) : $str_alt26$, new SubLObject[]{ format(NIL, $str_alt32$Since__a_and__a_are_different_var, var1, var2), $str_alt33$_we_guess_the_author_intends_them, format(NIL, $str_alt34$_even_though_the_reflexivity_of__, reflexive_pred), format(NIL, $str_alt35$__We_can_immediately_solve_this_p, var1, var2) });
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt29);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_cnf_reflexive_wXo_different_repair(SubLObject cnf, SubLObject data) {
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject reflexive_lit = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            reflexive_lit = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject var1 = el_utilities.literal_arg1(reflexive_lit, UNPROVIDED);
                    SubLObject var2 = el_utilities.literal_arg2(reflexive_lit, UNPROVIDED);
                    SubLObject neg_lits = clauses.neg_lits(cnf);
                    SubLObject pos_lits = clauses.pos_lits(cnf);
                    SubLObject diff_lit = el_utilities.make_binary_formula($$different, var1, var2);
                    return clauses.make_cnf(list_utilities.nadd_to_end(diff_lit, neg_lits), pos_lits);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt36);
            }
        }
        return NIL;
    }







    /**
     * test CNF for isolated terms
     */
    public static final SubLObject cnf_unconnectedP(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($CNF_UNCONNECTED)) && (NIL != kbi_utilities.kbi_applies_toP($CNF_UNCONNECTED, cnf))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($CNF_UNCONNECTED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_18 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_cnf_unconnectedP(cnf, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($CNF_UNCONNECTED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-UNCONNECTED applies to CNF
     */
    public static final SubLObject cnf_unconnected_terms(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_applies_toP($CNF_UNCONNECTED, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_20 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_cnf_unconnectedP(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_20, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return data;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-UNCONNECTED applies to CNF
     */
    public static final SubLObject why_cnf_unconnectedP(SubLObject cnf, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($CNF_UNCONNECTED, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_22 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_cnf_unconnectedP(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_23, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($CNF_UNCONNECTED, cnf, data);
                            } else {
                                return list($CNF_UNCONNECTED, cnf);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_cnf_unconnectedP(cnf, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kb_unconnected_axioms() {
        return cnf_diagnostics_wrt($list_alt45, NIL, NIL);
    }

    public static final SubLObject formula_unconnectedP(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unconnectedP = NIL;
                SubLObject cnfs = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject cnfs_24 = clausifier.cnf_clausal_form(formula, mt);
                    SubLObject mt_25 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    cnfs = cnfs_24;
                    mt = mt_25;
                }
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            if (NIL == unconnectedP) {
                                {
                                    SubLObject csome_list_var = cnfs;
                                    SubLObject cnf = NIL;
                                    for (cnf = csome_list_var.first(); !((NIL != unconnectedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
                                        unconnectedP = cnf_unconnectedP(cnf);
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return unconnectedP;
            }
        }
    }

    public static final SubLObject formula_unconnected_terms(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unconnected = NIL;
                SubLObject cnfs = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject cnfs_26 = clausifier.cnf_clausal_form(formula, mt);
                    SubLObject mt_27 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    cnfs = cnfs_26;
                    mt = mt_27;
                }
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject cdolist_list_var = cnfs;
                                SubLObject cnf = NIL;
                                for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                                    unconnected = nunion(unconnected, cnf_unconnected_terms(cnf), UNPROVIDED, UNPROVIDED);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return unconnected;
            }
        }
    }

    // defparameter
    public static final SubLSymbol $diagnose_unconnected_ground_cnfP$ = makeSymbol("*DIAGNOSE-UNCONNECTED-GROUND-CNF?*");

    public static final SubLObject kbi_cnf_unconnectedP(SubLObject cnf, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym24$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject groundP = el_utilities.groundP(cnf, varP);
                if ((NIL != $diagnose_unconnected_ground_cnfP$.getDynamicValue(thread)) || (NIL == groundP)) {
                    {
                        SubLObject free_vars = clause_utilities.clause_free_variables(cnf, varP, UNPROVIDED);
                        SubLObject candidates = (NIL != free_vars) ? ((SubLObject) (ke_coherence.unconnected_cnf_terms(cnf, NIL != groundP ? ((SubLObject) (symbol_function(IDENTITY))) : varP))) : NIL;
                        SubLObject unconnected = intersection(candidates, free_vars, UNPROVIDED, UNPROVIDED);
                        if (NIL != unconnected) {
                            kbi_utilities.set_kbi_result(list(unconnected, kbi_vars.$kbi_assertion$.getDynamicValue(thread)));
                        }
                    }
                }
            }
            kbi_utilities.nreverse_kbi_result();
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_nl_why_cnf_unconnectedP(SubLObject cnf, SubLObject data) {
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject terms = NIL;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt48);
            terms = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt48);
            assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt49$_a__formula________s___references, new SubLObject[]{ NIL != assertion ? ((SubLObject) (format(NIL, $str_alt28$assertion_id____a, assertion_handles.assertion_id(assertion)))) : $str_alt26$, clauses.cnf_formula(cnf, UNPROVIDED), string_utilities.stringify_items(terms, symbol_function(STR), $str_alt51$__, $str_alt52$_and_) });
            } else {
                cdestructuring_bind_error(datum, $list_alt48);
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_nl_verbose_why_cnf_unconnectedP(SubLObject cnf, SubLObject data) {
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject terms = NIL;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt48);
            terms = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt48);
            assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                return cconcatenate(format(NIL, $str_alt53$Re_formula_______s__The_component, clauses.cnf_formula(cnf, UNPROVIDED)), new SubLObject[]{ $str_alt54$__Viewing_this_rule_as_a_graph__w, format(NIL, $str_alt55$_the_following_terms_are_disconne, string_utilities.stringify_items(terms, symbol_function(OBJECT_TO_STRING), $str_alt51$__, $str_alt52$_and_)), $str_alt57$__The_requisite_inferential_inter, $str_alt58$_it_is_considered_to_lack_explana });
            } else {
                cdestructuring_bind_error(datum, $list_alt48);
            }
        }
        return NIL;
    }







    /**
     * test CNF for standard wff violations
     */
    public static final SubLObject cnf_not_wffP(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($CNF_NOT_WFF)) && (NIL != kbi_utilities.kbi_applies_toP($CNF_NOT_WFF, cnf))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($CNF_NOT_WFF);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_28 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_cnf_not_wffP(cnf, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_29, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_28, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($CNF_NOT_WFF, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-NOT-WFF applies to CNF
     */
    public static final SubLObject cnf_not_wff_violations(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_applies_toP($CNF_NOT_WFF, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_30 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_cnf_not_wffP(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_31, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_30, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return data;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-NOT-WFF applies to CNF
     */
    public static final SubLObject why_cnf_not_wffP(SubLObject cnf, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($CNF_NOT_WFF, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_32 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_cnf_not_wffP(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_32, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($CNF_NOT_WFF, cnf, data);
                            } else {
                                return list($CNF_NOT_WFF, cnf);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_cnf_not_wffP(cnf, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_cnf_not_wffP(SubLObject cnf, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt67$this_cnf_has_the_following_wff_vi, NIL != list_utilities.singletonP(data) ? ((SubLObject) ($str_alt26$)) : $$$s);
            SubLObject cdolist_list_var = data;
            SubLObject violation = NIL;
            for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , violation = cdolist_list_var.first()) {
                nl_result = cconcatenate(nl_result, wff.explain_wff_violation(violation, UNPROVIDED));
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_cnf_not_wffP(SubLObject cnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                SubLObject _prev_bind_1 = wff_utilities.$check_arityP$.currentBinding(thread);
                SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                SubLObject _prev_bind_5 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                try {
                    wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                    wff_utilities.$check_arityP$.bind(T, thread);
                    wff_utilities.$check_arg_typesP$.bind(T, thread);
                    wff_vars.$noting_wff_violationsP$.bind(T, thread);
                    wff_vars.$accumulating_wff_violationsP$.bind(makeBoolean(!kbi_macros.$kbi_doneP_fn$.getDynamicValue(thread).eql(symbol_function(KBI_DONE_IF_ANY_RESULT))), thread);
                    at_vars.$accumulating_at_violationsP$.bind(wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread), thread);
                    {
                        SubLObject formula = clauses.cnf_formula(cnf, UNPROVIDED);
                        SubLObject wffP = wff.el_wffP(formula, mt, UNPROVIDED);
                        SubLObject doneP = NIL;
                        if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = wff_vars.$wff_violations$.getDynamicValue(thread);
                                    SubLObject violation = NIL;
                                    for (violation = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , violation = csome_list_var.first()) {
                                        kbi_utilities.add_kbi_result(violation);
                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                    }
                                }
                            }
                        } else
                            if (NIL == wffP) {
                                kbi_utilities.add_kbi_result(T);
                            }

                    }
                } finally {
                    at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_5, thread);
                    wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
                    wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                    wff_utilities.$check_arityP$.rebind(_prev_bind_1, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * test CNF for all wff violations
     */
    public static final SubLObject cnf_not_wff_completeP(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($CNF_NOT_WFF_COMPLETE)) && (NIL != kbi_utilities.kbi_applies_toP($CNF_NOT_WFF_COMPLETE, cnf))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($CNF_NOT_WFF_COMPLETE);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_34 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_cnf_not_wff_completeP(cnf, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_34, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($CNF_NOT_WFF_COMPLETE, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-NOT-WFF-COMPLETE applies to CNF
     */
    public static final SubLObject cnf_not_wff_complete_violations(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_applies_toP($CNF_NOT_WFF_COMPLETE, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_36 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_cnf_not_wff_completeP(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_37, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_36, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return data;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-NOT-WFF-COMPLETE applies to CNF
     */
    public static final SubLObject why_cnf_not_wff_completeP(SubLObject cnf, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($CNF_NOT_WFF_COMPLETE, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_38 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_cnf_not_wff_completeP(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_39, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_38, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($CNF_NOT_WFF_COMPLETE, cnf, data);
                            } else {
                                return list($CNF_NOT_WFF_COMPLETE, cnf);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_cnf_not_wff_completeP(cnf, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_cnf_not_wff_completeP(SubLObject cnf, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt67$this_cnf_has_the_following_wff_vi, NIL != list_utilities.singletonP(data) ? ((SubLObject) ($str_alt26$)) : $$$s);
            SubLObject cdolist_list_var = data;
            SubLObject violation = NIL;
            for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , violation = cdolist_list_var.first()) {
                nl_result = cconcatenate(nl_result, wff.explain_wff_violation(violation, UNPROVIDED));
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_cnf_not_wff_completeP(SubLObject cnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                SubLObject _prev_bind_1 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                SubLObject _prev_bind_2 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
                SubLObject _prev_bind_3 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
                SubLObject _prev_bind_4 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                SubLObject _prev_bind_5 = wff_utilities.$check_arityP$.currentBinding(thread);
                SubLObject _prev_bind_6 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                SubLObject _prev_bind_7 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                SubLObject _prev_bind_8 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                SubLObject _prev_bind_9 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                try {
                    wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                    at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                    at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
                    at_vars.$at_admit_consistent_nartsP$.bind(NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind(T, thread);
                    wff_utilities.$check_arityP$.bind(T, thread);
                    wff_utilities.$check_arg_typesP$.bind(T, thread);
                    wff_vars.$noting_wff_violationsP$.bind(T, thread);
                    wff_vars.$accumulating_wff_violationsP$.bind(makeBoolean(!kbi_macros.$kbi_doneP_fn$.getDynamicValue(thread).eql(symbol_function(KBI_DONE_IF_ANY_RESULT))), thread);
                    at_vars.$accumulating_at_violationsP$.bind(wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread), thread);
                    {
                        SubLObject formula = clauses.cnf_formula(cnf, UNPROVIDED);
                        SubLObject wffP = wff.el_wffP(formula, mt, UNPROVIDED);
                        SubLObject doneP = NIL;
                        if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = wff_vars.$wff_violations$.getDynamicValue(thread);
                                    SubLObject violation = NIL;
                                    for (violation = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , violation = csome_list_var.first()) {
                                        kbi_utilities.add_kbi_result(violation);
                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                    }
                                }
                            }
                        } else
                            if (NIL == wffP) {
                                kbi_utilities.add_kbi_result(T);
                            }

                    }
                } finally {
                    at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_9, thread);
                    wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_8, thread);
                    wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_arityP$.rebind(_prev_bind_5, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_3, thread);
                    at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_2, thread);
                    at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_1, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $cnf_wXfree_var_in_pos_lit_results$ = makeSymbol("*CNF-W/FREE-VAR-IN-POS-LIT-RESULTS*");

    // defparameter
    public static final SubLSymbol $cnf_wXfree_var_in_pos_lit_time$ = makeSymbol("*CNF-W/FREE-VAR-IN-POS-LIT-TIME*");

    // defparameter
    public static final SubLSymbol $cnf_wXfree_var_in_pos_lit_count$ = makeSymbol("*CNF-W/FREE-VAR-IN-POS-LIT-COUNT*");

    /**
     * test CNF for free variables in consequent
     */
    public static final SubLObject cnf_wXfree_var_in_pos_litP(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw83$CNF_W_FREE_VAR_IN_POS_LIT)) && (NIL != kbi_utilities.kbi_applies_toP($kw83$CNF_W_FREE_VAR_IN_POS_LIT, cnf))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw83$CNF_W_FREE_VAR_IN_POS_LIT);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_40 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_free_pos_lit_vars(cnf, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_41, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_40, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw83$CNF_W_FREE_VAR_IN_POS_LIT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-W/FREE-VAR-IN-POS-LIT applies to CNF
     */
    public static final SubLObject cnf_wXfree_var_in_pos_lit_violations(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_applies_toP($kw83$CNF_W_FREE_VAR_IN_POS_LIT, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_42 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_free_pos_lit_vars(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_43, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_42, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return data;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-W/FREE-VAR-IN-POS-LIT applies to CNF
     */
    public static final SubLObject why_cnf_wXfree_var_in_pos_litP(SubLObject cnf, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw83$CNF_W_FREE_VAR_IN_POS_LIT, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_44 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_free_pos_lit_vars(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_45, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_44, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw83$CNF_W_FREE_VAR_IN_POS_LIT, cnf, data);
                            } else {
                                return list($kw83$CNF_W_FREE_VAR_IN_POS_LIT, cnf);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_cnf_wXfree_var_in_pos_litP(cnf, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_cnf_wXfree_var_in_pos_litP(SubLObject cnf, SubLObject data) {
        if (NIL != data) {
            {
                SubLObject datum = data;
                SubLObject current = datum;
                SubLObject vars = NIL;
                SubLObject assertion = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt85);
                vars = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt85);
                assertion = current.first();
                current = current.rest();
                if (NIL == current) {
                    return format(NIL, $str_alt86$_a__formula________s____has_conse, new SubLObject[]{ NIL != assertion ? ((SubLObject) (format(NIL, $str_alt28$assertion_id____a, assertion_handles.assertion_id(assertion)))) : $str_alt26$, clauses.cnf_formula(cnf, UNPROVIDED), NIL != list_utilities.singletonP(vars) ? ((SubLObject) ($str_alt26$)) : $$$s, string_utilities.stringify_items(vars, OBJECT_TO_STRING, $str_alt51$__, $str_alt52$_and_) });
                } else {
                    cdestructuring_bind_error(datum, $list_alt85);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_free_pos_lit_vars(SubLObject cnf, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym24$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(cnf);
                SubLObject neg_lits = clauses.neg_lits(cnf);
                SubLObject pos_lit_vars = el_utilities.literals_free_variables(pos_lits, NIL, varP, UNPROVIDED);
                SubLObject neg_lit_vars = (NIL != pos_lit_vars) ? ((SubLObject) (el_utilities.literals_free_variables(neg_lits, NIL, varP, UNPROVIDED))) : NIL;
                SubLObject free_pos_lit_vars = set_difference(pos_lit_vars, neg_lit_vars, UNPROVIDED, UNPROVIDED);
                if (NIL != free_pos_lit_vars) {
                    kbi_utilities.set_kbi_result(list(free_pos_lit_vars, kbi_vars.$kbi_assertion$.getDynamicValue(thread)));
                }
            }
            kbi_utilities.nreverse_kbi_result();
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $cnf_wXfree_var_in_neg_lit_results$ = makeSymbol("*CNF-W/FREE-VAR-IN-NEG-LIT-RESULTS*");

    // defparameter
    public static final SubLSymbol $cnf_wXfree_var_in_neg_lit_time$ = makeSymbol("*CNF-W/FREE-VAR-IN-NEG-LIT-TIME*");

    // defparameter
    public static final SubLSymbol $cnf_wXfree_var_in_neg_lit_count$ = makeSymbol("*CNF-W/FREE-VAR-IN-NEG-LIT-COUNT*");

    /**
     * test CNF for free variables in antecedent
     */
    public static final SubLObject cnf_wXfree_var_in_neg_litP(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw93$CNF_W_FREE_VAR_IN_NEG_LIT)) && (NIL != kbi_utilities.kbi_applies_toP($kw93$CNF_W_FREE_VAR_IN_NEG_LIT, cnf))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw93$CNF_W_FREE_VAR_IN_NEG_LIT);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_46 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_free_neg_lit_vars(cnf, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_47, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_46, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw93$CNF_W_FREE_VAR_IN_NEG_LIT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-W/FREE-VAR-IN-NEG-LIT applies to CNF
     */
    public static final SubLObject cnf_wXfree_var_in_neg_lit_violations(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_applies_toP($kw93$CNF_W_FREE_VAR_IN_NEG_LIT, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_48 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_free_neg_lit_vars(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_49, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_48, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return data;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-W/FREE-VAR-IN-NEG-LIT applies to CNF
     */
    public static final SubLObject why_cnf_wXfree_var_in_neg_litP(SubLObject cnf, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw93$CNF_W_FREE_VAR_IN_NEG_LIT, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_50 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_free_neg_lit_vars(cnf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_51, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_50, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw93$CNF_W_FREE_VAR_IN_NEG_LIT, cnf, data);
                            } else {
                                return list($kw93$CNF_W_FREE_VAR_IN_NEG_LIT, cnf);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_cnf_wXfree_var_in_neg_litP(cnf, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_cnf_wXfree_var_in_neg_litP(SubLObject cnf, SubLObject data) {
        if (NIL != data) {
            {
                SubLObject datum = data;
                SubLObject current = datum;
                SubLObject vars = NIL;
                SubLObject assertion = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt85);
                vars = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt85);
                assertion = current.first();
                current = current.rest();
                if (NIL == current) {
                    return format(NIL, $str_alt95$_a__formula______s__has_anteceden, new SubLObject[]{ NIL != assertion ? ((SubLObject) (format(NIL, $str_alt28$assertion_id____a, assertion_handles.assertion_id(assertion)))) : $str_alt26$, clauses.cnf_formula(cnf, UNPROVIDED), NIL != list_utilities.singletonP(vars) ? ((SubLObject) ($str_alt26$)) : $$$s, string_utilities.stringify_items(vars, OBJECT_TO_STRING, $str_alt51$__, $str_alt52$_and_) });
                } else {
                    cdestructuring_bind_error(datum, $list_alt85);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_free_neg_lit_vars(SubLObject cnf, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym24$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(cnf);
                SubLObject neg_lits = clauses.neg_lits(cnf);
                SubLObject neg_lit_vars = el_utilities.literals_free_variables(neg_lits, NIL, varP, UNPROVIDED);
                SubLObject pos_lit_vars = (NIL != neg_lit_vars) ? ((SubLObject) (el_utilities.literals_free_variables(pos_lits, NIL, varP, UNPROVIDED))) : NIL;
                SubLObject neg_lit_var_referecencs = list_utilities.tree_gather(neg_lits, varP, NIL, UNPROVIDED, UNPROVIDED);
                SubLObject candidates = set_difference(neg_lit_vars, pos_lit_vars, UNPROVIDED, UNPROVIDED);
                SubLObject free_neg_lit_vars = NIL;
                SubLObject cdolist_list_var = candidates;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(var, member(var, neg_lit_var_referecencs, UNPROVIDED, UNPROVIDED).rest(), UNPROVIDED, UNPROVIDED)) {
                        free_neg_lit_vars = cons(var, free_neg_lit_vars);
                    }
                }
                if (NIL != free_neg_lit_vars) {
                    kbi_utilities.set_kbi_result(list(free_neg_lit_vars, kbi_vars.$kbi_assertion$.getDynamicValue(thread)));
                }
                kbi_utilities.nreverse_kbi_result();
                return kbi_utilities.kbi_result();
            }
        }
    }







    /**
     * test CNF for a tautology
     */
    public static final SubLObject cnf_tautologyP(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($CNF_TAUTOLOGY)) && (NIL != kbi_utilities.kbi_applies_toP($CNF_TAUTOLOGY, cnf))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($CNF_TAUTOLOGY);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_52 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_cnf_tautologic_literals(cnf);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_53, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_52, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($CNF_TAUTOLOGY, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-TAUTOLOGY applies to CNF
     */
    public static final SubLObject cnf_tautologic_literals(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_applies_toP($CNF_TAUTOLOGY, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_54 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_cnf_tautologic_literals(cnf);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_55, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_54, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return data;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :CNF-TAUTOLOGY applies to CNF
     */
    public static final SubLObject why_cnf_tautologyP(SubLObject cnf, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($CNF_TAUTOLOGY, cnf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_56 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_cnf_tautologic_literals(cnf);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_57, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_56, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($CNF_TAUTOLOGY, cnf, data);
                            } else {
                                return list($CNF_TAUTOLOGY, cnf);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_cnf_tautologyP(cnf, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_cnf_tautologyP(SubLObject cnf, SubLObject data) {
        return format(NIL, $str_alt104$formula______s__has_antecedent_fr, new SubLObject[]{ clauses.cnf_formula(cnf, UNPROVIDED), NIL != list_utilities.singletonP(data) ? ((SubLObject) ($str_alt26$)) : $$$s, string_utilities.stringify_items(data, OBJECT_TO_STRING, $str_alt51$__, $str_alt52$_and_) });
    }

    public static final SubLObject kbi_cnf_tautologic_literals(SubLObject cnf) {
        {
            SubLObject pos_lits = clauses.pos_lits(cnf);
            SubLObject doneP = NIL;
            if (NIL != pos_lits) {
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = clauses.neg_lits(cnf);
                        SubLObject neg_lit = NIL;
                        for (neg_lit = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , neg_lit = csome_list_var.first()) {
                            if (NIL != subl_promotions.memberP(neg_lit, pos_lits, UNPROVIDED, UNPROVIDED)) {
                                kbi_utilities.add_kbi_result(neg_lit);
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return kbi_utilities.kbi_result();
    }







    /**
     * test FORMULA for second-order vars
     */
    public static final SubLObject second_order_formulaP(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($SECOND_ORDER_FORMULA)) && (NIL != kbi_utilities.kbi_applies_toP($SECOND_ORDER_FORMULA, formula))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($SECOND_ORDER_FORMULA);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_58 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_second_order_vars(formula, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_59, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_58, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($SECOND_ORDER_FORMULA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SECOND-ORDER-FORMULA applies to FORMULA
     */
    public static final SubLObject why_second_order_formulaP(SubLObject formula, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($SECOND_ORDER_FORMULA, formula)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_60 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_second_order_vars(formula, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_61, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_60, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($SECOND_ORDER_FORMULA, formula, data);
                            } else {
                                return list($SECOND_ORDER_FORMULA, formula);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_second_order_formulaP(formula, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_second_order_formulaP(SubLObject formula, SubLObject data) {
        return format(NIL, $str_alt113$formula______s__has_second_order_, new SubLObject[]{ formula, NIL != list_utilities.singletonP(data) ? ((SubLObject) ($str_alt26$)) : $$$s, string_utilities.stringify_items(data, OBJECT_TO_STRING, $str_alt51$__, $str_alt52$_and_) });
    }

    public static final SubLObject kbi_second_order_vars(SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym24$CYC_VAR_;
        }
        {
            SubLObject operator = cycl_utilities.formula_arg0(formula);
            SubLObject doneP = NIL;
            if (NIL != funcall(varP, operator)) {
                kbi_utilities.add_kbi_result(operator);
                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
            }
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                    SubLObject v_term = NIL;
                    for (v_term = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                        if (NIL != el_utilities.relation_expressionP(v_term)) {
                            kbi_second_order_vars(v_term, varP);
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
        }
        return kbi_utilities.kbi_result();
    }







    /**
     * test FORMULA for unreified, reifiable nats
     */
    public static final SubLObject unreified_nat_formulaP(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($UNREIFIED_NAT_FORMULA)) && (NIL != kbi_utilities.kbi_applies_toP($UNREIFIED_NAT_FORMULA, formula))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($UNREIFIED_NAT_FORMULA);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_62 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_formula_nats_to_reify(formula);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_63, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_62, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($UNREIFIED_NAT_FORMULA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :UNREIFIED-NAT-FORMULA applies to FORMULA
     */
    public static final SubLObject why_unreified_nat_formulaP(SubLObject formula, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($UNREIFIED_NAT_FORMULA, formula)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_64 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_formula_nats_to_reify(formula);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_65, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_64, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($UNREIFIED_NAT_FORMULA, formula, data);
                            } else {
                                return list($UNREIFIED_NAT_FORMULA, formula);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_unreified_nat_formulaP(formula, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_unreified_nat_formulaP(SubLObject formula, SubLObject data) {
        return format(NIL, $str_alt122$formula______s__has_unreified_rei, new SubLObject[]{ formula, NIL != list_utilities.singletonP(data) ? ((SubLObject) ($str_alt26$)) : $$$s, string_utilities.stringify_items(data, OBJECT_TO_STRING, $str_alt51$__, $str_alt52$_and_) });
    }

    public static final SubLObject kbi_formula_nats_to_reify(SubLObject formula) {
        if (NIL == el_utilities.tou_litP(formula)) {
            kbi_utilities.set_kbi_result(list_utilities.tree_gather(formula, $sym123$REIFIABLE_NAT_, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        kbi_utilities.nreverse_kbi_result();
        return kbi_utilities.kbi_result();
    }







    /**
     * test FORMULA for non-fort terms not admitted as arguments by defns
     */
    public static final SubLObject formula_missing_defnP(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($FORMULA_MISSING_DEFN)) && (NIL != kbi_utilities.kbi_applies_toP($FORMULA_MISSING_DEFN, formula))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($FORMULA_MISSING_DEFN);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_66 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_formula_missing_defns(formula, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_67, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_66, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($FORMULA_MISSING_DEFN, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORMULA-MISSING-DEFN applies to FORMULA
     */
    public static final SubLObject formula_missing_defns(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_applies_toP($FORMULA_MISSING_DEFN, formula)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_68 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_formula_missing_defns(formula, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_69, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_68, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return data;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORMULA-MISSING-DEFN applies to FORMULA
     */
    public static final SubLObject why_formula_missing_defnP(SubLObject formula, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($FORMULA_MISSING_DEFN, formula)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_70 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_formula_missing_defns(formula, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_71, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_70, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($FORMULA_MISSING_DEFN, formula, data);
                            } else {
                                return list($FORMULA_MISSING_DEFN, formula);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_formula_missing_defnP(formula, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject mal_assertions_wrt_arg_isa_wXo_defn(SubLObject collection, SubLObject n, SubLObject mt) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = kb_accessors.arg_isa_of(collection, mt);
                        SubLObject relation = NIL;
                        for (relation = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , relation = csome_list_var.first()) {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var_72 = relevant_term_assertions_relation_extent_and_rules(relation, mt, $TRUE, NIL, T);
                                    SubLObject assertion = NIL;
                                    for (assertion = csome_list_var_72.first(); !((NIL != doneP) || (NIL == csome_list_var_72)); csome_list_var_72 = csome_list_var_72.rest() , assertion = csome_list_var_72.first()) {
                                        {
                                            SubLObject mt_73 = assertions_high.assertion_mt(assertion);
                                            SubLObject cnf = assertions_high.assertion_cnf(assertion);
                                            SubLObject malP = NIL;
                                            {
                                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                                    mt_relevance_macros.$mt$.bind(mt_73, thread);
                                                    if (NIL == malP) {
                                                        {
                                                            SubLObject csome_list_var_74 = formula_missing_defns(cnf);
                                                            SubLObject termXcolXmt = NIL;
                                                            for (termXcolXmt = csome_list_var_74.first(); !((NIL != malP) || (NIL == csome_list_var_74)); csome_list_var_74 = csome_list_var_74.rest() , termXcolXmt = csome_list_var_74.first()) {
                                                                malP = eql(collection, second(termXcolXmt));
                                                            }
                                                        }
                                                    }
                                                    if (NIL != malP) {
                                                        count = add(count, ONE_INTEGER);
                                                        result = cons(assertion, result);
                                                        doneP = numGE(count, n);
                                                    }
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject relevant_term_assertions_relation_extent_and_rules(SubLObject relation, SubLObject mt, SubLObject truth, SubLObject gafs_onlyP, SubLObject remove_duplicatesP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject pred_var = relation;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                        {
                                                            SubLObject done_var_75 = NIL;
                                                            SubLObject token_var_76 = NIL;
                                                            while (NIL == done_var_75) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_76);
                                                                    SubLObject valid_77 = makeBoolean(token_var_76 != ass);
                                                                    if (NIL != valid_77) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_75 = makeBoolean(NIL == valid_77);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_78, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                            if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(relation)) {
                                {
                                    SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(relation);
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        {
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                                    SubLObject valid = makeBoolean(token_var != ass);
                                                    if (NIL != valid) {
                                                        result = cons(ass, result);
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_79, thread);
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(relation, NIL, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(relation, NIL, NIL);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_80 = NIL;
                                                            SubLObject token_var_81 = NIL;
                                                            while (NIL == done_var_80) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_81);
                                                                    SubLObject valid_82 = makeBoolean(token_var_81 != ass);
                                                                    if (NIL != valid_82) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_80 = makeBoolean(NIL == valid_82);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_83, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                            if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(relation, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(relation, NIL);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_84 = NIL;
                                                            SubLObject token_var_85 = NIL;
                                                            while (NIL == done_var_84) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_85);
                                                                    SubLObject valid_86 = makeBoolean(token_var_85 != ass);
                                                                    if (NIL != valid_86) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_84 = makeBoolean(NIL == valid_86);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_87, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != gafs_onlyP) {
                    result = list_utilities.delete_if_not($sym136$GAF_ASSERTION_, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != remove_duplicatesP) {
                    result = list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return result;
            }
        }
    }

    public static final SubLObject kbi_nl_why_formula_missing_defnP(SubLObject formula, SubLObject data) {
        {
            SubLObject result = format(NIL, $str_alt137$formula______s__has, formula);
            SubLObject cdolist_list_var = data;
            SubLObject termXcolXmt = NIL;
            for (termXcolXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , termXcolXmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = termXcolXmt;
                    SubLObject current = datum;
                    SubLObject v_term = NIL;
                    SubLObject col = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    v_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    col = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        result = cconcatenate(result, format(NIL, $str_alt139$_non_fort_term__s_not_admitted_by, new SubLObject[]{ v_term, col, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt138);
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject kbi_formula_missing_defns(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != el_utilities.mt_designating_literalP(formula)) {
            return kbi_formula_missing_defns(el_utilities.designated_sentence(formula), el_utilities.designated_mt(formula));
        } else
            if (NIL != el_utilities.relation_expressionP(formula)) {
                {
                    SubLObject operator = cycl_utilities.formula_arg0(formula);
                    SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
                    SubLObject arg = ZERO_INTEGER;
                    SubLObject doneP = NIL;
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = args;
                            SubLObject v_term = NIL;
                            for (v_term = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                if (NIL == forts.fort_p(v_term)) {
                                    if (NIL == arg_type.relation_arg_okP(operator, v_term, arg, at_utilities.arg_type_mt(operator, args, arg, mt))) {
                                        if (NIL == doneP) {
                                            {
                                                SubLObject csome_list_var_88 = kb_accessors.argn_isa(operator, arg, mt);
                                                SubLObject collection = NIL;
                                                for (collection = csome_list_var_88.first(); !((NIL != doneP) || (NIL == csome_list_var_88)); csome_list_var_88 = csome_list_var_88.rest() , collection = csome_list_var_88.first()) {
                                                    if (!((NIL != kb_accessors.admitting_defnsP(collection, mt)) || (NIL != at_defns.suf_defn_assertions(collection)))) {
                                                        if (NIL == isa.isaP(v_term, collection, mt, UNPROVIDED)) {
                                                            kbi_utilities.add_kbi_result(list(arg, collection, mt));
                                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL != doneP) {
                                        } else
                                            if (NIL != term.nautP(v_term, UNPROVIDED)) {
                                                kbi_formula_missing_defns(v_term, mt);
                                            } else
                                                if (NIL != term.sentenceP(v_term, UNPROVIDED)) {
                                                    kbi_formula_missing_defns(v_term, mt);
                                                }


                                    }
                                }
                            }
                        }
                    }
                }
                return kbi_utilities.kbi_result();
            }

        return NIL;
    }



    public static final SubLObject clear_cached_diagnose_gaf() {
        {
            SubLObject cs = $cached_diagnose_gaf_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cached_diagnose_gaf(SubLObject gaf, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_diagnose_gaf_caching_state$.getGlobalValue(), list(gaf, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_diagnose_gaf_internal(SubLObject gaf, SubLObject mt) {
        return diagnose_gaf(gaf, mt);
    }

    public static final SubLObject cached_diagnose_gaf(SubLObject gaf, SubLObject mt) {
        {
            SubLObject caching_state = $cached_diagnose_gaf_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_DIAGNOSE_GAF, $cached_diagnose_gaf_caching_state$, NIL, EQL, TWO_INTEGER, $int$1024);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(gaf, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (gaf.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(cached_diagnose_gaf_internal(gaf, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(gaf, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject diagnose_gaf(SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gethash($GAF, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED).isNumber()) {
                sethash($GAF, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), add(gethash($GAF, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            }
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        result = diagnose_gaf_int(gaf);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject diagnose_gaf_int(SubLObject gaf) {
        return kbi_utilities.diagnose_qua_sub_domains(gaf, $GAF);
    }







    /**
     * test GAF for contrary arguments
     */
    public static final SubLObject gaf_not_trueP(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($GAF_NOT_TRUE)) && (NIL != kbi_utilities.kbi_applies_toP($GAF_NOT_TRUE, gaf))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($GAF_NOT_TRUE);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_89 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_gaf_not_trueP(gaf, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_90 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_90, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_89, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($GAF_NOT_TRUE, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :GAF-NOT-TRUE applies to GAF
     */
    public static final SubLObject gaf_not_true_supports(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_applies_toP($GAF_NOT_TRUE, gaf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_91 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_gaf_not_trueP(gaf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_92, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_91, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return data;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :GAF-NOT-TRUE applies to GAF
     */
    public static final SubLObject why_gaf_not_trueP(SubLObject gaf, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($GAF_NOT_TRUE, gaf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_93 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_gaf_not_trueP(gaf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_94, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_93, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($GAF_NOT_TRUE, gaf, data);
                            } else {
                                return list($GAF_NOT_TRUE, gaf);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_gaf_not_trueP(gaf, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_gaf_not_trueP(SubLObject gaf, SubLObject data) {
        return format(NIL, $str_alt150$___not__s________has_argument____, gaf, string_utilities.stringify_items(Mapping.mapcar(symbol_function(JUSTIFY_SUPPORTS), data), symbol_function(STR), $str_alt152$_____, UNPROVIDED));
    }

    public static final SubLObject justify_supports(SubLObject supports) {
        if (NIL != list_utilities.singletonP(supports)) {
            return Mapping.mapcar(symbol_function(JUSTIFY_SUPPORT), supports);
        } else {
            return cons($$and, Mapping.mapcar(symbol_function(JUSTIFY_SUPPORT), supports));
        }
    }

    public static final SubLObject kbi_gaf_not_trueP(SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_macros.$kbi_booleanP$.getDynamicValue(thread)) {
                {
                    SubLObject truth = ask_utilities.inference_literal_truth(gaf, mt);
                    kbi_utilities.set_kbi_result(eql(truth, $FALSE));
                }
            } else {
                {
                    SubLObject justs = inference_literal_justify(cycl_utilities.negate(gaf), mt);
                    kbi_utilities.set_kbi_result(justs);
                    kbi_utilities.nreverse_kbi_result();
                }
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * test GAF for existing true or false arguments
     */
    public static final SubLObject gaf_truth_knownP(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($GAF_TRUTH_KNOWN)) && (NIL != kbi_utilities.kbi_applies_toP($GAF_TRUTH_KNOWN, gaf))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($GAF_TRUTH_KNOWN);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_95 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_gaf_truth_knownP(gaf, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_96 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_96, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_95, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($GAF_TRUTH_KNOWN, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :GAF-TRUTH-KNOWN applies to GAF
     */
    public static final SubLObject gaf_truth_known_supports(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_applies_toP($GAF_TRUTH_KNOWN, gaf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_97 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_gaf_truth_knownP(gaf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_98 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_98, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_97, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return data;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :GAF-TRUTH-KNOWN applies to GAF
     */
    public static final SubLObject why_gaf_truth_knownP(SubLObject gaf, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($GAF_TRUTH_KNOWN, gaf)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_99 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_gaf_truth_knownP(gaf, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_100, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_99, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($GAF_TRUTH_KNOWN, gaf, data);
                            } else {
                                return list($GAF_TRUTH_KNOWN, gaf);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_gaf_truth_knownP(gaf, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_gaf_truth_knownP(SubLObject gaf, SubLObject data) {
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject truth = NIL;
            SubLObject v_arguments = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt164);
            truth = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt164);
            v_arguments = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject nl_arguments = nl_arguments(v_arguments);
                    return format(NIL, $str_alt165$_s_______has_truth__s_with_argume, new SubLObject[]{ gaf, truth, NIL != list_utilities.singletonP(nl_arguments) ? ((SubLObject) ($str_alt26$)) : $$$s, string_utilities.stringify_items(nl_arguments, symbol_function(IDENTITY), $str_alt166$___, UNPROVIDED) });
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt164);
            }
        }
        return NIL;
    }

    public static final SubLObject nl_arguments(SubLObject support_sets) {
        {
            SubLObject nl_arguments = NIL;
            SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(EL_ARGUMENT), support_sets);
            SubLObject argument = NIL;
            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                {
                    SubLObject nl_argument = NIL;
                    if (NIL != el_utilities.el_conjunction_p(argument)) {
                        nl_argument = cconcatenate($str_alt167$_, new SubLObject[]{ string_utilities.object_to_string(cycl_utilities.formula_operator(argument)), $str_alt168$_, string_utilities.stringify_items(cycl_utilities.formula_args(argument, UNPROVIDED), symbol_function(OBJECT_TO_STRING), $str_alt169$__________, UNPROVIDED), $str_alt170$_ });
                    } else {
                        nl_argument = string_utilities.object_to_string(argument);
                    }
                    nl_arguments = cons(nl_argument, nl_arguments);
                }
            }
            return nreverse(nl_arguments);
        }
    }

    public static final SubLObject el_argument(SubLObject supports) {
        if (NIL != list_utilities.singletonP(supports)) {
            return el_support(supports.first());
        } else {
            return simplifier.simplify_cycl_conjunction(simplifier.conjoin(Mapping.mapcar(symbol_function(EL_SUPPORT), supports), UNPROVIDED), UNPROVIDED);
        }
    }

    public static final SubLObject el_support(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            {
                SubLObject mt = assertions_high.assertion_mt(support);
                SubLObject formula = uncanonicalizer.assertion_el_formula(support);
                return list($$ist, mt, formula);
            }
        } else
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                {
                    SubLObject justification = kb_hl_supports.kb_hl_support_justification(support);
                    return el_argument(justification);
                }
            } else {
                {
                    SubLObject justification = hl_supports.hl_justify(support);
                    return justification.equal(list(support)) ? ((SubLObject) (NIL)) : el_argument(justification);
                }
            }

    }

    /**
     * Recursively call the inference engine to see if LITERAL can be proved.
     */
    public static final SubLObject inference_literal_justify(SubLObject literal, SubLObject mt) {
        {
            SubLObject fi_formula = copy_tree(literal);
            SubLObject results = ask_utilities.inference_recursive_query(fi_formula, mt, UNPROVIDED);
            if (NIL != results) {
                {
                    SubLObject v_arguments = remove(NIL, Mapping.mapcar(symbol_function(SECOND), results), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != v_arguments) {
                        return v_arguments;
                    } else {
                        return $list_alt175;
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_gaf_truth_knownP(SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_macros.$kbi_booleanP$.getDynamicValue(thread)) {
                {
                    SubLObject truth = ask_utilities.inference_literal_truth(gaf, mt);
                    kbi_utilities.set_kbi_result(makeBoolean(truth.eql($TRUE) || truth.eql($FALSE)));
                }
            } else {
                {
                    SubLObject justs = inference_literal_justify(gaf, mt);
                    if (NIL != justs) {
                        kbi_utilities.add_kbi_result(list($TRUE, justs));
                    } else {
                        {
                            SubLObject negation = cycl_utilities.negate(gaf);
                            justs = inference_literal_justify(negation, mt);
                            if (NIL != justs) {
                                kbi_utilities.add_kbi_result(list($FALSE, justs));
                            }
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject declare_kbi_cnf_file() {
        declareFunction("cnf_diagnostics", "CNF-DIAGNOSTICS", 0, 2, false);
        declareFunction("cnf_diagnostics_wrt", "CNF-DIAGNOSTICS-WRT", 1, 2, false);
        declareFunction("resume_cnf_diagnostics", "RESUME-CNF-DIAGNOSTICS", 0, 2, false);
        declareFunction("resume_cnf_diagnostics_wrt", "RESUME-CNF-DIAGNOSTICS-WRT", 1, 2, false);
        declareFunction("cnfs_diagnostics", "CNFS-DIAGNOSTICS", 1, 2, false);
        declareFunction("cnf_diagnostics_int", "CNF-DIAGNOSTICS-INT", 0, 2, false);
        declareFunction("clear_cached_diagnose_cnf", "CLEAR-CACHED-DIAGNOSE-CNF", 0, 0, false);
        declareFunction("remove_cached_diagnose_cnf", "REMOVE-CACHED-DIAGNOSE-CNF", 2, 0, false);
        declareFunction("cached_diagnose_cnf_internal", "CACHED-DIAGNOSE-CNF-INTERNAL", 2, 0, false);
        declareFunction("cached_diagnose_cnf", "CACHED-DIAGNOSE-CNF", 2, 0, false);
        declareFunction("diagnose_cnf", "DIAGNOSE-CNF", 1, 1, false);
        declareFunction("diagnose_cnf_int", "DIAGNOSE-CNF-INT", 1, 0, false);
        declareFunction("cnf_reflexive_wXo_differentP", "CNF-REFLEXIVE-W/O-DIFFERENT?", 1, 0, false);
        declareFunction("why_cnf_reflexive_wXo_differentP", "WHY-CNF-REFLEXIVE-W/O-DIFFERENT?", 1, 1, false);
        declareFunction("kbi_cnf_reflexive_wXo_differentP", "KBI-CNF-REFLEXIVE-W/O-DIFFERENT?", 1, 2, false);
        declareFunction("kbi_nl_why_cnf_reflexive_wXo_differentP", "KBI-NL-WHY-CNF-REFLEXIVE-W/O-DIFFERENT?", 2, 0, false);
        declareFunction("kbi_nl_verbose_cnf_reflexive_wXo_differentP", "KBI-NL-VERBOSE-CNF-REFLEXIVE-W/O-DIFFERENT?", 2, 0, false);
        declareFunction("kbi_cnf_reflexive_wXo_different_repair", "KBI-CNF-REFLEXIVE-W/O-DIFFERENT-REPAIR", 2, 0, false);
        declareFunction("cnf_unconnectedP", "CNF-UNCONNECTED?", 1, 0, false);
        declareFunction("cnf_unconnected_terms", "CNF-UNCONNECTED-TERMS", 1, 0, false);
        declareFunction("why_cnf_unconnectedP", "WHY-CNF-UNCONNECTED?", 1, 1, false);
        declareFunction("kb_unconnected_axioms", "KB-UNCONNECTED-AXIOMS", 0, 0, false);
        declareFunction("formula_unconnectedP", "FORMULA-UNCONNECTED?", 1, 1, false);
        declareFunction("formula_unconnected_terms", "FORMULA-UNCONNECTED-TERMS", 1, 1, false);
        declareFunction("kbi_cnf_unconnectedP", "KBI-CNF-UNCONNECTED?", 1, 1, false);
        declareFunction("kbi_nl_why_cnf_unconnectedP", "KBI-NL-WHY-CNF-UNCONNECTED?", 2, 0, false);
        declareFunction("kbi_nl_verbose_why_cnf_unconnectedP", "KBI-NL-VERBOSE-WHY-CNF-UNCONNECTED?", 2, 0, false);
        declareFunction("cnf_not_wffP", "CNF-NOT-WFF?", 1, 0, false);
        declareFunction("cnf_not_wff_violations", "CNF-NOT-WFF-VIOLATIONS", 1, 0, false);
        declareFunction("why_cnf_not_wffP", "WHY-CNF-NOT-WFF?", 1, 1, false);
        declareFunction("kbi_nl_why_cnf_not_wffP", "KBI-NL-WHY-CNF-NOT-WFF?", 2, 0, false);
        declareFunction("kbi_cnf_not_wffP", "KBI-CNF-NOT-WFF?", 1, 1, false);
        declareFunction("cnf_not_wff_completeP", "CNF-NOT-WFF-COMPLETE?", 1, 0, false);
        declareFunction("cnf_not_wff_complete_violations", "CNF-NOT-WFF-COMPLETE-VIOLATIONS", 1, 0, false);
        declareFunction("why_cnf_not_wff_completeP", "WHY-CNF-NOT-WFF-COMPLETE?", 1, 1, false);
        declareFunction("kbi_nl_why_cnf_not_wff_completeP", "KBI-NL-WHY-CNF-NOT-WFF-COMPLETE?", 2, 0, false);
        declareFunction("kbi_cnf_not_wff_completeP", "KBI-CNF-NOT-WFF-COMPLETE?", 1, 1, false);
        declareFunction("cnf_wXfree_var_in_pos_litP", "CNF-W/FREE-VAR-IN-POS-LIT?", 1, 0, false);
        declareFunction("cnf_wXfree_var_in_pos_lit_violations", "CNF-W/FREE-VAR-IN-POS-LIT-VIOLATIONS", 1, 0, false);
        declareFunction("why_cnf_wXfree_var_in_pos_litP", "WHY-CNF-W/FREE-VAR-IN-POS-LIT?", 1, 1, false);
        declareFunction("kbi_nl_why_cnf_wXfree_var_in_pos_litP", "KBI-NL-WHY-CNF-W/FREE-VAR-IN-POS-LIT?", 2, 0, false);
        declareFunction("kbi_free_pos_lit_vars", "KBI-FREE-POS-LIT-VARS", 1, 1, false);
        declareFunction("cnf_wXfree_var_in_neg_litP", "CNF-W/FREE-VAR-IN-NEG-LIT?", 1, 0, false);
        declareFunction("cnf_wXfree_var_in_neg_lit_violations", "CNF-W/FREE-VAR-IN-NEG-LIT-VIOLATIONS", 1, 0, false);
        declareFunction("why_cnf_wXfree_var_in_neg_litP", "WHY-CNF-W/FREE-VAR-IN-NEG-LIT?", 1, 1, false);
        declareFunction("kbi_nl_why_cnf_wXfree_var_in_neg_litP", "KBI-NL-WHY-CNF-W/FREE-VAR-IN-NEG-LIT?", 2, 0, false);
        declareFunction("kbi_free_neg_lit_vars", "KBI-FREE-NEG-LIT-VARS", 1, 1, false);
        declareFunction("cnf_tautologyP", "CNF-TAUTOLOGY?", 1, 0, false);
        declareFunction("cnf_tautologic_literals", "CNF-TAUTOLOGIC-LITERALS", 1, 0, false);
        declareFunction("why_cnf_tautologyP", "WHY-CNF-TAUTOLOGY?", 1, 1, false);
        declareFunction("kbi_nl_why_cnf_tautologyP", "KBI-NL-WHY-CNF-TAUTOLOGY?", 2, 0, false);
        declareFunction("kbi_cnf_tautologic_literals", "KBI-CNF-TAUTOLOGIC-LITERALS", 1, 0, false);
        declareFunction("second_order_formulaP", "SECOND-ORDER-FORMULA?", 1, 0, false);
        declareFunction("why_second_order_formulaP", "WHY-SECOND-ORDER-FORMULA?", 1, 1, false);
        declareFunction("kbi_nl_why_second_order_formulaP", "KBI-NL-WHY-SECOND-ORDER-FORMULA?", 2, 0, false);
        declareFunction("kbi_second_order_vars", "KBI-SECOND-ORDER-VARS", 1, 1, false);
        declareFunction("unreified_nat_formulaP", "UNREIFIED-NAT-FORMULA?", 1, 0, false);
        declareFunction("why_unreified_nat_formulaP", "WHY-UNREIFIED-NAT-FORMULA?", 1, 1, false);
        declareFunction("kbi_nl_why_unreified_nat_formulaP", "KBI-NL-WHY-UNREIFIED-NAT-FORMULA?", 2, 0, false);
        declareFunction("kbi_formula_nats_to_reify", "KBI-FORMULA-NATS-TO-REIFY", 1, 0, false);
        declareFunction("formula_missing_defnP", "FORMULA-MISSING-DEFN?", 1, 0, false);
        declareFunction("formula_missing_defns", "FORMULA-MISSING-DEFNS", 1, 0, false);
        declareFunction("why_formula_missing_defnP", "WHY-FORMULA-MISSING-DEFN?", 1, 1, false);
        declareFunction("mal_assertions_wrt_arg_isa_wXo_defn", "MAL-ASSERTIONS-WRT-ARG-ISA-W/O-DEFN", 1, 2, false);
        declareFunction("relevant_term_assertions_relation_extent_and_rules", "RELEVANT-TERM-ASSERTIONS-RELATION-EXTENT-AND-RULES", 5, 0, false);
        declareFunction("kbi_nl_why_formula_missing_defnP", "KBI-NL-WHY-FORMULA-MISSING-DEFN?", 2, 0, false);
        declareFunction("kbi_formula_missing_defns", "KBI-FORMULA-MISSING-DEFNS", 1, 1, false);
        declareFunction("clear_cached_diagnose_gaf", "CLEAR-CACHED-DIAGNOSE-GAF", 0, 0, false);
        declareFunction("remove_cached_diagnose_gaf", "REMOVE-CACHED-DIAGNOSE-GAF", 2, 0, false);
        declareFunction("cached_diagnose_gaf_internal", "CACHED-DIAGNOSE-GAF-INTERNAL", 2, 0, false);
        declareFunction("cached_diagnose_gaf", "CACHED-DIAGNOSE-GAF", 2, 0, false);
        declareFunction("diagnose_gaf", "DIAGNOSE-GAF", 1, 1, false);
        declareFunction("diagnose_gaf_int", "DIAGNOSE-GAF-INT", 1, 0, false);
        declareFunction("gaf_not_trueP", "GAF-NOT-TRUE?", 1, 0, false);
        declareFunction("gaf_not_true_supports", "GAF-NOT-TRUE-SUPPORTS", 1, 0, false);
        declareFunction("why_gaf_not_trueP", "WHY-GAF-NOT-TRUE?", 1, 1, false);
        declareFunction("kbi_nl_why_gaf_not_trueP", "KBI-NL-WHY-GAF-NOT-TRUE?", 2, 0, false);
        declareFunction("justify_supports", "JUSTIFY-SUPPORTS", 1, 0, false);
        declareFunction("kbi_gaf_not_trueP", "KBI-GAF-NOT-TRUE?", 1, 1, false);
        declareFunction("gaf_truth_knownP", "GAF-TRUTH-KNOWN?", 1, 0, false);
        declareFunction("gaf_truth_known_supports", "GAF-TRUTH-KNOWN-SUPPORTS", 1, 0, false);
        declareFunction("why_gaf_truth_knownP", "WHY-GAF-TRUTH-KNOWN?", 1, 1, false);
        declareFunction("kbi_nl_why_gaf_truth_knownP", "KBI-NL-WHY-GAF-TRUTH-KNOWN?", 2, 0, false);
        declareFunction("nl_arguments", "NL-ARGUMENTS", 1, 0, false);
        declareFunction("el_argument", "EL-ARGUMENT", 1, 0, false);
        declareFunction("el_support", "EL-SUPPORT", 1, 0, false);
        declareFunction("inference_literal_justify", "INFERENCE-LITERAL-JUSTIFY", 2, 0, false);
        declareFunction("kbi_gaf_truth_knownP", "KBI-GAF-TRUTH-KNOWN?", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_kbi_cnf_file() {
        deflexical("*CACHED-DIAGNOSE-CNF-CACHING-STATE*", NIL);
        defparameter("*CNF-REFLEXIVE-W/O-DIFFERENT-REPAIRS*", NIL);
        defparameter("*CNF-REFLEXIVE-W/O-DIFFERENT-RESULTS*", NIL);
        defparameter("*CNF-REFLEXIVE-W/O-DIFFERENT-TIME*", ZERO_INTEGER);
        defparameter("*CNF-REFLEXIVE-W/O-DIFFERENT-COUNT*", ZERO_INTEGER);
        defparameter("*CNF-UNCONNECTED-RESULTS*", NIL);
        defparameter("*CNF-UNCONNECTED-TIME*", ZERO_INTEGER);
        defparameter("*CNF-UNCONNECTED-COUNT*", ZERO_INTEGER);
        defparameter("*DIAGNOSE-UNCONNECTED-GROUND-CNF?*", NIL);
        defparameter("*CNF-NOT-WFF-RESULTS*", NIL);
        defparameter("*CNF-NOT-WFF-TIME*", ZERO_INTEGER);
        defparameter("*CNF-NOT-WFF-COUNT*", ZERO_INTEGER);
        defparameter("*CNF-NOT-WFF-COMPLETE-RESULTS*", NIL);
        defparameter("*CNF-NOT-WFF-COMPLETE-TIME*", ZERO_INTEGER);
        defparameter("*CNF-NOT-WFF-COMPLETE-COUNT*", ZERO_INTEGER);
        defparameter("*CNF-W/FREE-VAR-IN-POS-LIT-RESULTS*", NIL);
        defparameter("*CNF-W/FREE-VAR-IN-POS-LIT-TIME*", ZERO_INTEGER);
        defparameter("*CNF-W/FREE-VAR-IN-POS-LIT-COUNT*", ZERO_INTEGER);
        defparameter("*CNF-W/FREE-VAR-IN-NEG-LIT-RESULTS*", NIL);
        defparameter("*CNF-W/FREE-VAR-IN-NEG-LIT-TIME*", ZERO_INTEGER);
        defparameter("*CNF-W/FREE-VAR-IN-NEG-LIT-COUNT*", ZERO_INTEGER);
        defparameter("*CNF-TAUTOLOGY-RESULTS*", NIL);
        defparameter("*CNF-TAUTOLOGY-TIME*", ZERO_INTEGER);
        defparameter("*CNF-TAUTOLOGY-COUNT*", ZERO_INTEGER);
        defparameter("*SECOND-ORDER-FORMULA-RESULTS*", NIL);
        defparameter("*SECOND-ORDER-FORMULA-TIME*", ZERO_INTEGER);
        defparameter("*SECOND-ORDER-FORMULA-COUNT*", ZERO_INTEGER);
        defparameter("*UNREIFIED-NAT-FORMULA-RESULTS*", NIL);
        defparameter("*UNREIFIED-NAT-FORMULA-TIME*", ZERO_INTEGER);
        defparameter("*UNREIFIED-NAT-FORMULA-COUNT*", ZERO_INTEGER);
        defparameter("*FORMULA-MISSING-DEFN-RESULTS*", NIL);
        defparameter("*FORMULA-MISSING-DEFN-TIME*", ZERO_INTEGER);
        defparameter("*FORMULA-MISSING-DEFN-COUNT*", ZERO_INTEGER);
        deflexical("*CACHED-DIAGNOSE-GAF-CACHING-STATE*", NIL);
        defparameter("*GAF-NOT-TRUE-RESULTS*", NIL);
        defparameter("*GAF-NOT-TRUE-TIME*", ZERO_INTEGER);
        defparameter("*GAF-NOT-TRUE-COUNT*", ZERO_INTEGER);
        defparameter("*GAF-TRUTH-KNOWN-RESULTS*", NIL);
        defparameter("*GAF-TRUTH-KNOWN-TIME*", ZERO_INTEGER);
        defparameter("*GAF-TRUTH-KNOWN-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_cnf_file() {
                memoization_state.note_globally_cached_function(CACHED_DIAGNOSE_CNF);
        {
            SubLObject item_var = $sym9$_CNF_REFLEXIVE_W_O_DIFFERENT_REPAIRS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym9$_CNF_REFLEXIVE_W_O_DIFFERENT_REPAIRS_, $str_alt10$repaired_violators_of_kbi_module_);
        {
            SubLObject item_var = $sym11$_CNF_REFLEXIVE_W_O_DIFFERENT_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym11$_CNF_REFLEXIVE_W_O_DIFFERENT_RESULTS_, $str_alt12$violators_of_kbi_module__CNF_REFL);
        {
            SubLObject item_var = $sym13$_CNF_REFLEXIVE_W_O_DIFFERENT_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym13$_CNF_REFLEXIVE_W_O_DIFFERENT_TIME_, $str_alt14$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym15$_CNF_REFLEXIVE_W_O_DIFFERENT_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym15$_CNF_REFLEXIVE_W_O_DIFFERENT_COUNT_, $str_alt16$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw17$CNF_REFLEXIVE_W_O_DIFFERENT, $list_alt23);
        {
            SubLObject item_var = $cnf_unconnected_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_unconnected_results$, $str_alt38$violators_of_kbi_module__CNF_UNCO);
        {
            SubLObject item_var = $cnf_unconnected_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_unconnected_time$, $str_alt40$run_time_of_predicate_application);
        {
            SubLObject item_var = $cnf_unconnected_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_unconnected_count$, $str_alt42$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($CNF_UNCONNECTED, $list_alt44);
        {
            SubLObject item_var = $sym46$_DIAGNOSE_UNCONNECTED_GROUND_CNF__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym46$_DIAGNOSE_UNCONNECTED_GROUND_CNF__, $str_alt47$should__cnf_not_connected_be_appl);
        {
            SubLObject item_var = $cnf_not_wff_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_not_wff_results$, $str_alt60$violators_of_kbi_module__CNF_NOT_);
        {
            SubLObject item_var = $cnf_not_wff_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_not_wff_time$, $str_alt62$run_time_of_predicate_application);
        {
            SubLObject item_var = $cnf_not_wff_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_not_wff_count$, $str_alt64$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($CNF_NOT_WFF, $list_alt66);
        {
            SubLObject item_var = $cnf_not_wff_complete_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_not_wff_complete_results$, $str_alt70$violators_of_kbi_module__CNF_NOT_);
        {
            SubLObject item_var = $cnf_not_wff_complete_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_not_wff_complete_time$, $str_alt72$run_time_of_predicate_application);
        {
            SubLObject item_var = $cnf_not_wff_complete_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_not_wff_complete_count$, $str_alt74$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($CNF_NOT_WFF_COMPLETE, $list_alt76);
        {
            SubLObject item_var = $sym77$_CNF_W_FREE_VAR_IN_POS_LIT_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym77$_CNF_W_FREE_VAR_IN_POS_LIT_RESULTS_, $str_alt78$violators_of_kbi_module__CNF_W_FR);
        {
            SubLObject item_var = $sym79$_CNF_W_FREE_VAR_IN_POS_LIT_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym79$_CNF_W_FREE_VAR_IN_POS_LIT_TIME_, $str_alt80$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym81$_CNF_W_FREE_VAR_IN_POS_LIT_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym81$_CNF_W_FREE_VAR_IN_POS_LIT_COUNT_, $str_alt82$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw83$CNF_W_FREE_VAR_IN_POS_LIT, $list_alt84);
        {
            SubLObject item_var = $sym87$_CNF_W_FREE_VAR_IN_NEG_LIT_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym87$_CNF_W_FREE_VAR_IN_NEG_LIT_RESULTS_, $str_alt88$violators_of_kbi_module__CNF_W_FR);
        {
            SubLObject item_var = $sym89$_CNF_W_FREE_VAR_IN_NEG_LIT_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym89$_CNF_W_FREE_VAR_IN_NEG_LIT_TIME_, $str_alt90$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym91$_CNF_W_FREE_VAR_IN_NEG_LIT_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym91$_CNF_W_FREE_VAR_IN_NEG_LIT_COUNT_, $str_alt92$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw93$CNF_W_FREE_VAR_IN_NEG_LIT, $list_alt94);
        {
            SubLObject item_var = $cnf_tautology_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_tautology_results$, $str_alt97$violators_of_kbi_module__CNF_TAUT);
        {
            SubLObject item_var = $cnf_tautology_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_tautology_time$, $str_alt99$run_time_of_predicate_application);
        {
            SubLObject item_var = $cnf_tautology_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($cnf_tautology_count$, $str_alt101$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($CNF_TAUTOLOGY, $list_alt103);
        {
            SubLObject item_var = $second_order_formula_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($second_order_formula_results$, $str_alt106$violators_of_kbi_module__SECOND_O);
        {
            SubLObject item_var = $second_order_formula_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($second_order_formula_time$, $str_alt108$run_time_of_predicate_application);
        {
            SubLObject item_var = $second_order_formula_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($second_order_formula_count$, $str_alt110$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($SECOND_ORDER_FORMULA, $list_alt112);
        {
            SubLObject item_var = $unreified_nat_formula_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($unreified_nat_formula_results$, $str_alt115$violators_of_kbi_module__UNREIFIE);
        {
            SubLObject item_var = $unreified_nat_formula_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($unreified_nat_formula_time$, $str_alt117$run_time_of_predicate_application);
        {
            SubLObject item_var = $unreified_nat_formula_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($unreified_nat_formula_count$, $str_alt119$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($UNREIFIED_NAT_FORMULA, $list_alt121);
        {
            SubLObject item_var = $formula_missing_defn_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($formula_missing_defn_results$, $str_alt125$violators_of_kbi_module__FORMULA_);
        {
            SubLObject item_var = $formula_missing_defn_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($formula_missing_defn_time$, $str_alt127$run_time_of_predicate_application);
        {
            SubLObject item_var = $formula_missing_defn_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($formula_missing_defn_count$, $str_alt129$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($FORMULA_MISSING_DEFN, $list_alt131);
        memoization_state.note_globally_cached_function(CACHED_DIAGNOSE_GAF);
        {
            SubLObject item_var = $gaf_not_true_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($gaf_not_true_results$, $str_alt143$violators_of_kbi_module__GAF_NOT_);
        {
            SubLObject item_var = $gaf_not_true_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($gaf_not_true_time$, $str_alt145$run_time_of_predicate_application);
        {
            SubLObject item_var = $gaf_not_true_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($gaf_not_true_count$, $str_alt147$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($GAF_NOT_TRUE, $list_alt149);
        {
            SubLObject item_var = $gaf_truth_known_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($gaf_truth_known_results$, $str_alt157$violators_of_kbi_module__GAF_TRUT);
        {
            SubLObject item_var = $gaf_truth_known_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($gaf_truth_known_time$, $str_alt159$run_time_of_predicate_application);
        {
            SubLObject item_var = $gaf_truth_known_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($gaf_truth_known_count$, $str_alt161$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($GAF_TRUTH_KNOWN, $list_alt163);
        return NIL;
    }



    static private final SubLString $str_alt1$diagnosing__s_cnfs = makeString("diagnosing ~s cnfs");

    static private final SubLString $$$mapping_Cyc_assertions = makeString("mapping Cyc assertions");





    private static final SubLSymbol CACHED_DIAGNOSE_CNF = makeSymbol("CACHED-DIAGNOSE-CNF");

    public static final SubLSymbol $cached_diagnose_cnf_caching_state$ = makeSymbol("*CACHED-DIAGNOSE-CNF-CACHING-STATE*");

    public static final SubLInteger $int$1024 = makeInteger(1024);

    public static final SubLSymbol $kw8$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym9$_CNF_REFLEXIVE_W_O_DIFFERENT_REPAIRS_ = makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-REPAIRS*");

    static private final SubLString $str_alt10$repaired_violators_of_kbi_module_ = makeString("repaired violators of kbi module :CNF-REFLEXIVE-W/O-DIFFERENT");

    static private final SubLSymbol $sym11$_CNF_REFLEXIVE_W_O_DIFFERENT_RESULTS_ = makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-RESULTS*");

    static private final SubLString $str_alt12$violators_of_kbi_module__CNF_REFL = makeString("violators of kbi module :CNF-REFLEXIVE-W/O-DIFFERENT");

    static private final SubLSymbol $sym13$_CNF_REFLEXIVE_W_O_DIFFERENT_TIME_ = makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-TIME*");

    static private final SubLString $str_alt14$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :CNF-REFLEXIVE-W/O-DIFFERENT");

    static private final SubLSymbol $sym15$_CNF_REFLEXIVE_W_O_DIFFERENT_COUNT_ = makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-COUNT*");

    static private final SubLString $str_alt16$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :CNF-REFLEXIVE-W/O-DIFFERENT");

    public static final SubLSymbol $kw17$CNF_REFLEXIVE_W_O_DIFFERENT = makeKeyword("CNF-REFLEXIVE-W/O-DIFFERENT");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt23 = list(new SubLObject[]{ makeKeyword("KBI-REPAIR-CACHE"), makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-REPAIRS*"), makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*CNF-REFLEXIVE-W/O-DIFFERENT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("CNF"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-CNF-REFLEXIVE-W/O-DIFFERENT?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("CNF-REFLEXIVE-W/O-DIFFERENT?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-CNF-REFLEXIVE-W/O-DIFFERENT?"), makeKeyword("KBI-REPAIR-FN"), makeSymbol("KBI-CNF-REFLEXIVE-W/O-DIFFERENT-REPAIR"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-CNF-REFLEXIVE-W/O-DIFFERENT?"), makeKeyword("KBI-NL-VERBOSE-FN"), makeSymbol("KBI-NL-VERBOSE-CNF-REFLEXIVE-W/O-DIFFERENT?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("INEFFICIENT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-AUTHOR"), makeString("Goolsbey"), makeKeyword("KBI-DATE"), makeString("September 1998"), makeKeyword("KBI-DOC"), makeString("test CNF for a reflexive neg-lit predicate while not excluding reflexive binding"), makeKeyword("KBI-EXAMPLE-OBJECT"), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relatives")), makeSymbol("?X"), makeSymbol("?Y")), list(constant_handles.reader_make_constant_shell(makeString("memberOfSpecies")), makeSymbol("?Y"), makeSymbol("?Z"))), list(constant_handles.reader_make_constant_shell(makeString("memberOfSpecies")), makeSymbol("?X"), makeSymbol("?Z"))), makeKeyword("KBI-EXAMPLE-RESULT"), T, makeKeyword("KBI-EXAMPLE-REPAIR"), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relatives")), makeSymbol("?X"), makeSymbol("?Y")), list(constant_handles.reader_make_constant_shell(makeString("memberOfSpecies")), makeSymbol("?Y"), makeSymbol("?Z")), list(constant_handles.reader_make_constant_shell(makeString("different")), makeSymbol("?X"), makeSymbol("?Y"))), list(constant_handles.reader_make_constant_shell(makeString("memberOfSpecies")), makeSymbol("?X"), makeSymbol("?Z"))) });

    static private final SubLSymbol $sym24$CYC_VAR_ = makeSymbol("CYC-VAR?");

    public static final SubLObject $$different = constant_handles.reader_make_constant_shell(makeString("different"));

    static private final SubLString $str_alt26$ = makeString("");

    static private final SubLString $str_alt27$_a__formula________s = makeString("~a~%formula : ~%  ~s");

    static private final SubLString $str_alt28$assertion_id____a = makeString("assertion id : ~a");

    static private final SubLList $list_alt29 = list(makeSymbol("REFLEXIVE-LIT"), makeSymbol("MT"), makeSymbol("ASSERTION"));

    static private final SubLString $str_alt30$__includes_reflexive_predicate__s = makeString("~%includes reflexive predicate ~s~%with no antecedent literal (#$different ~a ~a).");

    static private final SubLString $str_alt31$assertion_id____a__ = makeString("assertion id : ~a~%");

    static private final SubLString $str_alt32$Since__a_and__a_are_different_var = makeString("Since ~a and ~a are different variables in the rule,");

    static private final SubLString $str_alt33$_we_guess_the_author_intends_them = makeString(" we guess the author intends them to bind to different things,");

    static private final SubLString $str_alt34$_even_though_the_reflexivity_of__ = makeString(" even though the reflexivity of ~s allows them to unify.");

    static private final SubLString $str_alt35$__We_can_immediately_solve_this_p = makeString("  We can immediately solve this problem by adding (#$different ~a ~a) to the rule's antecedent.");

    static private final SubLList $list_alt36 = list(makeSymbol("REFLEXIVE-LIT"), makeSymbol("MT"));

    public static final SubLSymbol $cnf_unconnected_results$ = makeSymbol("*CNF-UNCONNECTED-RESULTS*");

    static private final SubLString $str_alt38$violators_of_kbi_module__CNF_UNCO = makeString("violators of kbi module :CNF-UNCONNECTED");

    public static final SubLSymbol $cnf_unconnected_time$ = makeSymbol("*CNF-UNCONNECTED-TIME*");

    static private final SubLString $str_alt40$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :CNF-UNCONNECTED");

    public static final SubLSymbol $cnf_unconnected_count$ = makeSymbol("*CNF-UNCONNECTED-COUNT*");

    static private final SubLString $str_alt42$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :CNF-UNCONNECTED");

    private static final SubLSymbol $CNF_UNCONNECTED = makeKeyword("CNF-UNCONNECTED");

    static private final SubLList $list_alt44 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*CNF-UNCONNECTED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*CNF-UNCONNECTED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*CNF-UNCONNECTED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("CNF"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-CNF-UNCONNECTED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("CNF-UNCONNECTED?"), makeKeyword("KBI-RESULT-FN"), makeSymbol("CNF-UNCONNECTED-TERMS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-CNF-UNCONNECTED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-CNF-UNCONNECTED?"), makeKeyword("KBI-NL-VERBOSE-FN"), makeSymbol("KBI-NL-VERBOSE-WHY-CNF-UNCONNECTED?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("INCOHERENT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("SUPPLANTED-BY"), list(makeKeyword("CNF-W/FREE-VAR-IN-POS-LIT")), makeKeyword("KBI-DATE"), makeString("February 1996"), makeKeyword("KBI-DOC"), makeString("test CNF for isolated terms"), makeKeyword("KBI-EXAMPLE-OBJECT"), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relatives")), makeSymbol("?X"), makeSymbol("?Y")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?Z"), constant_handles.reader_make_constant_shell(makeString("Dog")))), list(constant_handles.reader_make_constant_shell(makeString("relatives")), makeSymbol("?Y"), makeSymbol("?X"))), makeKeyword("KBI-EXAMPLE-RESULT"), list(makeSymbol("?Z")), makeKeyword("KBI-EXAMPLE-REPAIR"), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("relatives")), makeSymbol("?X"), makeSymbol("?Y")), list(constant_handles.reader_make_constant_shell(makeString("relatives")), makeSymbol("?Y"), makeSymbol("?X"))) });

    static private final SubLList $list_alt45 = list(makeKeyword("CNF-NOT-CONNECTED"));

    static private final SubLSymbol $sym46$_DIAGNOSE_UNCONNECTED_GROUND_CNF__ = makeSymbol("*DIAGNOSE-UNCONNECTED-GROUND-CNF?*");

    static private final SubLString $str_alt47$should__cnf_not_connected_be_appl = makeString("should :cnf-not-connected be applied to ground (as well as quantified) clauses?");

    static private final SubLList $list_alt48 = list(makeSymbol("TERMS"), makeSymbol("ASSERTION"));

    static private final SubLString $str_alt49$_a__formula________s___references = makeString("~a~%formula : ~%  ~s ~%references isolated terms: ~a");



    static private final SubLString $str_alt51$__ = makeString(", ");

    static private final SubLString $str_alt52$_and_ = makeString(" and ");

    static private final SubLString $str_alt53$Re_formula_______s__The_component = makeString("Re formula: ~%  ~s~%The components of a rule should share an inferential inter-dependence.");

    static private final SubLString $str_alt54$__Viewing_this_rule_as_a_graph__w = makeString("  Viewing this rule as a graph, with predicates as links and terms as nodes,");

    static private final SubLString $str_alt55$_the_following_terms_are_disconne = makeString(" the following terms are disconnected: ~a.");

    private static final SubLSymbol OBJECT_TO_STRING = makeSymbol("OBJECT-TO-STRING");

    static private final SubLString $str_alt57$__The_requisite_inferential_inter = makeString("  The requisite inferential inter-dependence is not apparent in such a disconnected rule; ");

    static private final SubLString $str_alt58$_it_is_considered_to_lack_explana = makeString(" it is considered to lack explanatory and epistemelogical coherence and is probably wrong.");

    public static final SubLSymbol $cnf_not_wff_results$ = makeSymbol("*CNF-NOT-WFF-RESULTS*");

    static private final SubLString $str_alt60$violators_of_kbi_module__CNF_NOT_ = makeString("violators of kbi module :CNF-NOT-WFF");

    public static final SubLSymbol $cnf_not_wff_time$ = makeSymbol("*CNF-NOT-WFF-TIME*");

    static private final SubLString $str_alt62$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :CNF-NOT-WFF");

    public static final SubLSymbol $cnf_not_wff_count$ = makeSymbol("*CNF-NOT-WFF-COUNT*");

    static private final SubLString $str_alt64$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :CNF-NOT-WFF");

    private static final SubLSymbol $CNF_NOT_WFF = makeKeyword("CNF-NOT-WFF");

    static private final SubLList $list_alt66 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*CNF-NOT-WFF-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*CNF-NOT-WFF-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*CNF-NOT-WFF-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("CNF"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-CNF-NOT-WFF?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("CNF-NOT-WFF?"), makeKeyword("KBI-RESULT-FN"), makeSymbol("CNF-NOT-WFF-VIOLATIONS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-CNF-NOT-WFF?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-CNF-NOT-WFF?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DATE"), makeString("July 1995"), makeKeyword("KBI-DOC"), makeString("test CNF for standard wff violations"), makeKeyword("KBI-EXAMPLE-OBJECT"), list(constant_handles.reader_make_constant_shell(makeString("France")), constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("Country"))), makeKeyword("KBI-EXAMPLE-RESULT"), list(list(makeKeyword("INVALID-CLPE"), list(constant_handles.reader_make_constant_shell(makeString("France")), constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("Country"))), constant_handles.reader_make_constant_shell(makeString("BaseKB")))) });

    static private final SubLString $str_alt67$this_cnf_has_the_following_wff_vi = makeString("this cnf has the following wff violation~a:");

    static private final SubLString $$$s = makeString("s");

    public static final SubLSymbol $cnf_not_wff_complete_results$ = makeSymbol("*CNF-NOT-WFF-COMPLETE-RESULTS*");

    static private final SubLString $str_alt70$violators_of_kbi_module__CNF_NOT_ = makeString("violators of kbi module :CNF-NOT-WFF-COMPLETE");

    public static final SubLSymbol $cnf_not_wff_complete_time$ = makeSymbol("*CNF-NOT-WFF-COMPLETE-TIME*");

    static private final SubLString $str_alt72$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :CNF-NOT-WFF-COMPLETE");

    public static final SubLSymbol $cnf_not_wff_complete_count$ = makeSymbol("*CNF-NOT-WFF-COMPLETE-COUNT*");

    static private final SubLString $str_alt74$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :CNF-NOT-WFF-COMPLETE");

    private static final SubLSymbol $CNF_NOT_WFF_COMPLETE = makeKeyword("CNF-NOT-WFF-COMPLETE");

    static private final SubLList $list_alt76 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*CNF-NOT-WFF-COMPLETE-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*CNF-NOT-WFF-COMPLETE-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*CNF-NOT-WFF-COMPLETE-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("CNF"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-CNF-NOT-WFF-COMPLETE?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("CNF-NOT-WFF-COMPLETE?"), makeKeyword("KBI-RESULT-FN"), makeSymbol("CNF-NOT-WFF-COMPLETE-VIOLATIONS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-CNF-NOT-WFF-COMPLETE?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-CNF-NOT-WFF-COMPLETE?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DATE"), makeString("July 1995"), makeKeyword("KBI-DOC"), makeString("test CNF for all wff violations") });

    static private final SubLSymbol $sym77$_CNF_W_FREE_VAR_IN_POS_LIT_RESULTS_ = makeSymbol("*CNF-W/FREE-VAR-IN-POS-LIT-RESULTS*");

    static private final SubLString $str_alt78$violators_of_kbi_module__CNF_W_FR = makeString("violators of kbi module :CNF-W/FREE-VAR-IN-POS-LIT");

    static private final SubLSymbol $sym79$_CNF_W_FREE_VAR_IN_POS_LIT_TIME_ = makeSymbol("*CNF-W/FREE-VAR-IN-POS-LIT-TIME*");

    static private final SubLString $str_alt80$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :CNF-W/FREE-VAR-IN-POS-LIT");

    static private final SubLSymbol $sym81$_CNF_W_FREE_VAR_IN_POS_LIT_COUNT_ = makeSymbol("*CNF-W/FREE-VAR-IN-POS-LIT-COUNT*");

    static private final SubLString $str_alt82$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :CNF-W/FREE-VAR-IN-POS-LIT");

    public static final SubLSymbol $kw83$CNF_W_FREE_VAR_IN_POS_LIT = makeKeyword("CNF-W/FREE-VAR-IN-POS-LIT");

    static private final SubLList $list_alt84 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*CNF-W/FREE-VAR-IN-POS-LIT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*CNF-W/FREE-VAR-IN-POS-LIT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*CNF-W/FREE-VAR-IN-POS-LIT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("CNF"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-APPLY-FN"), makeSymbol("POS-LITS"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FREE-POS-LIT-VARS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("CNF-W/FREE-VAR-IN-POS-LIT?"), makeKeyword("KBI-RESULT-FN"), makeSymbol("CNF-W/FREE-VAR-IN-POS-LIT-VIOLATIONS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-CNF-W/FREE-VAR-IN-POS-LIT?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-CNF-W/FREE-VAR-IN-POS-LIT?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("IMPRECISE"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DATE"), makeString("February 1996"), makeKeyword("KBI-DOC"), makeString("test CNF for free variables in consequent") });

    static private final SubLList $list_alt85 = list(makeSymbol("VARS"), makeSymbol("ASSERTION"));

    static private final SubLString $str_alt86$_a__formula________s____has_conse = makeString("~a~%formula : ~%  ~s  ~%has consequent free variable~a: ~a");

    static private final SubLSymbol $sym87$_CNF_W_FREE_VAR_IN_NEG_LIT_RESULTS_ = makeSymbol("*CNF-W/FREE-VAR-IN-NEG-LIT-RESULTS*");

    static private final SubLString $str_alt88$violators_of_kbi_module__CNF_W_FR = makeString("violators of kbi module :CNF-W/FREE-VAR-IN-NEG-LIT");

    static private final SubLSymbol $sym89$_CNF_W_FREE_VAR_IN_NEG_LIT_TIME_ = makeSymbol("*CNF-W/FREE-VAR-IN-NEG-LIT-TIME*");

    static private final SubLString $str_alt90$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :CNF-W/FREE-VAR-IN-NEG-LIT");

    static private final SubLSymbol $sym91$_CNF_W_FREE_VAR_IN_NEG_LIT_COUNT_ = makeSymbol("*CNF-W/FREE-VAR-IN-NEG-LIT-COUNT*");

    static private final SubLString $str_alt92$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :CNF-W/FREE-VAR-IN-NEG-LIT");

    public static final SubLSymbol $kw93$CNF_W_FREE_VAR_IN_NEG_LIT = makeKeyword("CNF-W/FREE-VAR-IN-NEG-LIT");

    static private final SubLList $list_alt94 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*CNF-W/FREE-VAR-IN-NEG-LIT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*CNF-W/FREE-VAR-IN-NEG-LIT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*CNF-W/FREE-VAR-IN-NEG-LIT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("CNF"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-APPLY-FN"), makeSymbol("NEG-LITS"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FREE-NEG-LIT-VARS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("CNF-W/FREE-VAR-IN-NEG-LIT?"), makeKeyword("KBI-RESULT-FN"), makeSymbol("CNF-W/FREE-VAR-IN-NEG-LIT-VIOLATIONS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-CNF-W/FREE-VAR-IN-NEG-LIT?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-CNF-W/FREE-VAR-IN-NEG-LIT?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("IMPRECISE"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("SUPPLANTED-BY"), list(makeKeyword("CNF-UNCONNECTED")), makeKeyword("KBI-DATE"), makeString("February 1996"), makeKeyword("KBI-DOC"), makeString("test CNF for free variables in antecedent") });

    static private final SubLString $str_alt95$_a__formula______s__has_anteceden = makeString("~a~%formula ~%  ~s~%has antecedent free variable~a: ~a");

    public static final SubLSymbol $cnf_tautology_results$ = makeSymbol("*CNF-TAUTOLOGY-RESULTS*");

    static private final SubLString $str_alt97$violators_of_kbi_module__CNF_TAUT = makeString("violators of kbi module :CNF-TAUTOLOGY");

    public static final SubLSymbol $cnf_tautology_time$ = makeSymbol("*CNF-TAUTOLOGY-TIME*");

    static private final SubLString $str_alt99$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :CNF-TAUTOLOGY");

    public static final SubLSymbol $cnf_tautology_count$ = makeSymbol("*CNF-TAUTOLOGY-COUNT*");

    static private final SubLString $str_alt101$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :CNF-TAUTOLOGY");

    private static final SubLSymbol $CNF_TAUTOLOGY = makeKeyword("CNF-TAUTOLOGY");

    static private final SubLList $list_alt103 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*CNF-TAUTOLOGY-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*CNF-TAUTOLOGY-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*CNF-TAUTOLOGY-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("CNF"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-APPLY-FN"), makeSymbol("NEG-LITS"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-CNF-TAUTOLOGIC-LITERALS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("CNF-TAUTOLOGY?"), makeKeyword("KBI-RESULT-FN"), makeSymbol("CNF-TAUTOLOGIC-LITERALS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-CNF-TAUTOLOGY?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-CNF-TAUTOLOGY?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("REDUNDANCY"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DATE"), makeString("April 1996"), makeKeyword("KBI-DOC"), makeString("test CNF for a tautology") });

    static private final SubLString $str_alt104$formula______s__has_antecedent_fr = makeString("formula ~%  ~s~%has antecedent free variable~a: ~a");

    public static final SubLSymbol $second_order_formula_results$ = makeSymbol("*SECOND-ORDER-FORMULA-RESULTS*");

    static private final SubLString $str_alt106$violators_of_kbi_module__SECOND_O = makeString("violators of kbi module :SECOND-ORDER-FORMULA");

    public static final SubLSymbol $second_order_formula_time$ = makeSymbol("*SECOND-ORDER-FORMULA-TIME*");

    static private final SubLString $str_alt108$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SECOND-ORDER-FORMULA");

    public static final SubLSymbol $second_order_formula_count$ = makeSymbol("*SECOND-ORDER-FORMULA-COUNT*");

    static private final SubLString $str_alt110$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SECOND-ORDER-FORMULA");

    private static final SubLSymbol $SECOND_ORDER_FORMULA = makeKeyword("SECOND-ORDER-FORMULA");

    static private final SubLList $list_alt112 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SECOND-ORDER-FORMULA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SECOND-ORDER-FORMULA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SECOND-ORDER-FORMULA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("FORMULA"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SECOND-ORDER-VARS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SECOND-ORDER-FORMULA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SECOND-ORDER-FORMULA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SECOND-ORDER-FORMULA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("INEFFICIENT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DATE"), makeString("July 1996"), makeKeyword("KBI-DOC"), makeString("test FORMULA for second-order vars") });

    static private final SubLString $str_alt113$formula______s__has_second_order_ = makeString("formula ~%  ~s~%has second-order variable~a: ~a");

    public static final SubLSymbol $unreified_nat_formula_results$ = makeSymbol("*UNREIFIED-NAT-FORMULA-RESULTS*");

    static private final SubLString $str_alt115$violators_of_kbi_module__UNREIFIE = makeString("violators of kbi module :UNREIFIED-NAT-FORMULA");

    public static final SubLSymbol $unreified_nat_formula_time$ = makeSymbol("*UNREIFIED-NAT-FORMULA-TIME*");

    static private final SubLString $str_alt117$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :UNREIFIED-NAT-FORMULA");

    public static final SubLSymbol $unreified_nat_formula_count$ = makeSymbol("*UNREIFIED-NAT-FORMULA-COUNT*");

    static private final SubLString $str_alt119$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :UNREIFIED-NAT-FORMULA");

    private static final SubLSymbol $UNREIFIED_NAT_FORMULA = makeKeyword("UNREIFIED-NAT-FORMULA");

    static private final SubLList $list_alt121 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*UNREIFIED-NAT-FORMULA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*UNREIFIED-NAT-FORMULA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*UNREIFIED-NAT-FORMULA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("FORMULA"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORMULA-NATS-TO-REIFY"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("UNREIFIED-NAT-FORMULA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-UNREIFIED-NAT-FORMULA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-UNREIFIED-NAT-FORMULA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("STALE-DATA"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DATE"), makeString("July 1996"), makeKeyword("KBI-DOC"), makeString("test FORMULA for unreified, reifiable nats") });

    static private final SubLString $str_alt122$formula______s__has_unreified_rei = makeString("formula ~%  ~s~%has unreified reifiable nat~a: ~a");

    static private final SubLSymbol $sym123$REIFIABLE_NAT_ = makeSymbol("REIFIABLE-NAT?");

    public static final SubLSymbol $formula_missing_defn_results$ = makeSymbol("*FORMULA-MISSING-DEFN-RESULTS*");

    static private final SubLString $str_alt125$violators_of_kbi_module__FORMULA_ = makeString("violators of kbi module :FORMULA-MISSING-DEFN");

    public static final SubLSymbol $formula_missing_defn_time$ = makeSymbol("*FORMULA-MISSING-DEFN-TIME*");

    static private final SubLString $str_alt127$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORMULA-MISSING-DEFN");

    public static final SubLSymbol $formula_missing_defn_count$ = makeSymbol("*FORMULA-MISSING-DEFN-COUNT*");

    static private final SubLString $str_alt129$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORMULA-MISSING-DEFN");

    private static final SubLSymbol $FORMULA_MISSING_DEFN = makeKeyword("FORMULA-MISSING-DEFN");

    static private final SubLList $list_alt131 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORMULA-MISSING-DEFN-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORMULA-MISSING-DEFN-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORMULA-MISSING-DEFN-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("FORMULA"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORMULA-MISSING-DEFNS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORMULA-MISSING-DEFN?"), makeKeyword("KBI-RESULT-FN"), makeSymbol("FORMULA-MISSING-DEFNS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORMULA-MISSING-DEFN?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORMULA-MISSING-DEFN?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DATE"), makeString("March 1996"), makeKeyword("KBI-DOC"), makeString("test FORMULA for non-fort terms not admitted as arguments by defns") });









    static private final SubLSymbol $sym136$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    static private final SubLString $str_alt137$formula______s__has = makeString("formula ~%  ~s~%has");

    static private final SubLList $list_alt138 = list(makeSymbol("TERM"), makeSymbol("COL"), makeSymbol("MT"));

    static private final SubLString $str_alt139$_non_fort_term__s_not_admitted_by = makeString(" non-fort term ~s not admitted by arg-isa ~s via defns [in ~s]~%");

    private static final SubLSymbol CACHED_DIAGNOSE_GAF = makeSymbol("CACHED-DIAGNOSE-GAF");

    public static final SubLSymbol $cached_diagnose_gaf_caching_state$ = makeSymbol("*CACHED-DIAGNOSE-GAF-CACHING-STATE*");

    public static final SubLSymbol $gaf_not_true_results$ = makeSymbol("*GAF-NOT-TRUE-RESULTS*");

    static private final SubLString $str_alt143$violators_of_kbi_module__GAF_NOT_ = makeString("violators of kbi module :GAF-NOT-TRUE");

    public static final SubLSymbol $gaf_not_true_time$ = makeSymbol("*GAF-NOT-TRUE-TIME*");

    static private final SubLString $str_alt145$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :GAF-NOT-TRUE");

    public static final SubLSymbol $gaf_not_true_count$ = makeSymbol("*GAF-NOT-TRUE-COUNT*");

    static private final SubLString $str_alt147$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :GAF-NOT-TRUE");

    private static final SubLSymbol $GAF_NOT_TRUE = makeKeyword("GAF-NOT-TRUE");

    static private final SubLList $list_alt149 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*GAF-NOT-TRUE-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*GAF-NOT-TRUE-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*GAF-NOT-TRUE-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("GAF"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-GAF-NOT-TRUE?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("GAF-NOT-TRUE?"), makeKeyword("KBI-RESULT-FN"), makeSymbol("GAF-NOT-TRUE-SUPPORTS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-GAF-NOT-TRUE?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-GAF-NOT-TRUE?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DATE"), makeString("September 1998"), makeKeyword("KBI-DOC"), makeString("test GAF for contrary arguments"), makeKeyword("KBI-EXAMPLE-OBJECT"), list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("France")), constant_handles.reader_make_constant_shell(makeString("Mammal"))), makeKeyword("KBI-EXAMPLE-RESULT"), T, makeKeyword("KBI-EXAMPLE-REPAIR"), list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("France")), constant_handles.reader_make_constant_shell(makeString("Mammal")))) });

    static private final SubLString $str_alt150$___not__s________has_argument____ = makeString("(#$not ~s) ~%    has argument: ~%  ~a");

    private static final SubLSymbol JUSTIFY_SUPPORTS = makeSymbol("JUSTIFY-SUPPORTS");

    static private final SubLString $str_alt152$_____ = makeString("~%   ");

    private static final SubLSymbol JUSTIFY_SUPPORT = makeSymbol("JUSTIFY-SUPPORT");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));



    public static final SubLSymbol $gaf_truth_known_results$ = makeSymbol("*GAF-TRUTH-KNOWN-RESULTS*");

    static private final SubLString $str_alt157$violators_of_kbi_module__GAF_TRUT = makeString("violators of kbi module :GAF-TRUTH-KNOWN");

    public static final SubLSymbol $gaf_truth_known_time$ = makeSymbol("*GAF-TRUTH-KNOWN-TIME*");

    static private final SubLString $str_alt159$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :GAF-TRUTH-KNOWN");

    public static final SubLSymbol $gaf_truth_known_count$ = makeSymbol("*GAF-TRUTH-KNOWN-COUNT*");

    static private final SubLString $str_alt161$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :GAF-TRUTH-KNOWN");

    private static final SubLSymbol $GAF_TRUTH_KNOWN = makeKeyword("GAF-TRUTH-KNOWN");

    static private final SubLList $list_alt163 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*GAF-TRUTH-KNOWN-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*GAF-TRUTH-KNOWN-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*GAF-TRUTH-KNOWN-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("GAF"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-GAF-TRUTH-KNOWN?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("GAF-TRUTH-KNOWN?"), makeKeyword("KBI-RESULT-FN"), makeSymbol("GAF-TRUTH-KNOWN-SUPPORTS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-GAF-TRUTH-KNOWN?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-GAF-TRUTH-KNOWN?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DATE"), makeString("September 1998"), makeKeyword("KBI-DOC"), makeString("test GAF for existing true or false arguments"), makeKeyword("KBI-EXAMPLE-OBJECT"), list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("France")), constant_handles.reader_make_constant_shell(makeString("Country"))), makeKeyword("KBI-EXAMPLE-RESULT"), constant_handles.reader_make_constant_shell(makeString("True")) });

    static private final SubLList $list_alt164 = list(makeSymbol("TRUTH"), makeSymbol("ARGUMENTS"));

    static private final SubLString $str_alt165$_s_______has_truth__s_with_argume = makeString("~s ~%    has truth ~s with argument~a: ~%  ~a");

    static private final SubLString $str_alt166$___ = makeString("~% ");

    static private final SubLString $str_alt167$_ = makeString("(");

    static private final SubLString $str_alt168$_ = makeString(" ");

    static private final SubLString $str_alt169$__________ = makeString("~%        ");

    static private final SubLString $str_alt170$_ = makeString(")");

    private static final SubLSymbol EL_ARGUMENT = makeSymbol("EL-ARGUMENT");

    private static final SubLSymbol EL_SUPPORT = makeSymbol("EL-SUPPORT");

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));



    static private final SubLList $list_alt175 = list(makeKeyword("NO-ARGUMENT"));

    // // Initializers
    public void declareFunctions() {
        declare_kbi_cnf_file();
    }

    public void initializeVariables() {
        init_kbi_cnf_file();
    }

    public void runTopLevelForms() {
        setup_kbi_cnf_file();
    }
}

