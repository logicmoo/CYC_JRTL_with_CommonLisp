/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      KBI-AXIOM
 *  source file: /cyc/top/cycl/kbi-axiom.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_axiom extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_axiom() {
    }

    public static final SubLFile me = new kbi_axiom();


    // // Definitions
    // defparameter
    public static final SubLSymbol $second_order_axioms$ = makeSymbol("*SECOND-ORDER-AXIOMS*");

    // defparameter
    public static final SubLSymbol $tautologic_axioms$ = makeSymbol("*TAUTOLOGIC-AXIOMS*");

    // defparameter
    public static final SubLSymbol $free_pos_lit_var_axioms$ = makeSymbol("*FREE-POS-LIT-VAR-AXIOMS*");

    // defparameter
    public static final SubLSymbol $free_neg_lit_var_axioms$ = makeSymbol("*FREE-NEG-LIT-VAR-AXIOMS*");

    // defparameter
    public static final SubLSymbol $unconnected_lit_axioms$ = makeSymbol("*UNCONNECTED-LIT-AXIOMS*");

    // defparameter
    public static final SubLSymbol $lispy_nat_axioms$ = makeSymbol("*LISPY-NAT-AXIOMS*");

    // defparameter
    public static final SubLSymbol $arg_types_wXo_defns$ = makeSymbol("*ARG-TYPES-W/O-DEFNS*");

    public static final SubLObject axiom_diagnostics(SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        kbi_utilities.reset_kbi_state($AXIOM);
        return axiom_diagnostics_int(repairP, printP);
    }

    public static final SubLObject axiom_diagnostics_wrt(SubLObject v_modules, SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        kbi_utilities.reset_kbi_state($AXIOM);
        {
            SubLObject result = NIL;
            try {
                kbi_utilities.set_kbi_external_sub_domain_modules($AXIOM, v_modules);
                result = axiom_diagnostics_int(repairP, printP);
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

    public static final SubLObject resume_axiom_diagnostics(SubLObject repairP, SubLObject printP) {
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
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_axiom_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_axiom_diagnostic_sweepP$.bind(T, thread);
                        result = axiom_diagnostics_int(repairP, printP);
                    } finally {
                        kbi_vars.$kbi_resuming_axiom_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject resume_axiom_diagnostics_wrt(SubLObject v_modules, SubLObject repairP, SubLObject printP) {
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
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_axiom_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_axiom_diagnostic_sweepP$.bind(T, thread);
                        try {
                            kbi_utilities.set_kbi_external_sub_domain_modules($AXIOM, v_modules);
                            result = axiom_diagnostics_int(repairP, printP);
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
                        kbi_vars.$kbi_resuming_axiom_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * perform kbi diagnostics sweep on CLAUSE-STRUCS
     */
    public static final SubLObject axioms_diagnostics(SubLObject v_clause_strucs, SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_utilities.reset_kbi_state($AXIOM);
            {
                SubLObject result = NIL;
                kbi_vars.$kbi_last_domain$.setDynamicValue($AXIOM, thread);
                kbi_vars.$kbi_items_to_consider$.setDynamicValue(length(v_clause_strucs), thread);
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
                            SubLObject list_var = v_clause_strucs;
                            utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt1$diagnosing__s_clause_strucs, kbi_vars.$kbi_items_to_consider$.getDynamicValue(thread)), thread);
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
                                        SubLObject clause_struc = NIL;
                                        for (clause_struc = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , clause_struc = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            diagnose_axiom(clause_struc, UNPROVIDED);
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
                            result = kbi_utilities.kbi_print_domain_results($AXIOM);
                        } finally {
                            kbi_vars.$kbi_print_whyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject axiom_diagnostics_int(SubLObject repairP, SubLObject printP) {
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
                kbi_vars.$kbi_last_domain$.setDynamicValue($AXIOM, thread);
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
                            SubLObject idx = clause_strucs.clause_struc_table();
                            SubLObject total = id_index.id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            SubLTrampolineFile.checkType($$$mapping_Cyc_clause_structs, STRINGP);
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
                                    utilities_macros.noting_percent_progress_preamble($$$mapping_Cyc_clause_structs);
                                    if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                        {
                                            SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                            SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                            SubLObject clause_struc = NIL;
                                            while (NIL != id) {
                                                clause_struc = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != id_index.do_id_index_id_and_object_validP(id, clause_struc, $SKIP)) {
                                                    utilities_macros.note_percent_progress(sofar, total);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    if (NIL != kbi_vars.$kbi_resuming_axiom_diagnostic_sweepP$.getDynamicValue(thread)) {
                                                        if (kbi_vars.$kbi_last_axiom_considered$.getDynamicValue(thread) == clause_strucs.clause_struc_id(clause_struc)) {
                                                            kbi_vars.$kbi_resuming_axiom_diagnostic_sweepP$.setDynamicValue(NIL, thread);
                                                        }
                                                    } else {
                                                        diagnose_axiom(clause_struc, UNPROVIDED);
                                                        kbi_vars.$kbi_last_axiom_considered$.setDynamicValue(assertion_handles.assertion_id(clause_struc), thread);
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
                                        result = kbi_utilities.kbi_print_domain_results($AXIOM);
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



    public static final SubLObject clear_cached_diagnose_axiom() {
        {
            SubLObject cs = $cached_diagnose_axiom_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cached_diagnose_axiom(SubLObject clause_struc) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_diagnose_axiom_caching_state$.getGlobalValue(), list(clause_struc), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_diagnose_axiom_internal(SubLObject clause_struc) {
        return diagnose_axiom(clause_struc, UNPROVIDED);
    }

    public static final SubLObject cached_diagnose_axiom(SubLObject clause_struc) {
        {
            SubLObject caching_state = $cached_diagnose_axiom_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_DIAGNOSE_AXIOM, $cached_diagnose_axiom_caching_state$, NIL, EQL, ONE_INTEGER, $int$1024);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, clause_struc, $kw8$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(cached_diagnose_axiom_internal(clause_struc)));
                    memoization_state.caching_state_put(caching_state, clause_struc, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    /**
     * return kbi modules that hold for CLAUSE-STRUC
     */
    public static final SubLObject diagnose_axiom(SubLObject clause_struc, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != axiom_accessible_in_mtP(clause_struc, mt)) {
                if (gethash($CNF, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED).isNumber()) {
                    sethash($AXIOM, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), add(gethash($AXIOM, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
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
                            result = diagnose_axiom_int(clause_struc);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject diagnose_axiom_int(SubLObject clause_struc) {
        return kbi_utilities.diagnose_qua_sub_domains(clause_struc, $AXIOM);
    }

    public static final SubLObject axiom_accessible_in_mtP(SubLObject clause_struc, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != clause_strucs.clause_struc_p(clause_struc)) {
                {
                    SubLObject accessibleP = NIL;
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject rest = NIL;
                                for (rest = clause_strucs.clause_struc_assertions(clause_struc); !((NIL != accessibleP) || (NIL == rest)); rest = rest.rest()) {
                                    {
                                        SubLObject assertion = rest.first();
                                        accessibleP = makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion))));
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return accessibleP;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject axiom_creators(SubLObject clause_struc) {
        if (NIL != clause_strucs.clause_struc_p(clause_struc)) {
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = clause_strucs.clause_struc_assertions(clause_struc);
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    if (NIL != assertions_high.asserted_assertionP(assertion)) {
                        {
                            SubLObject who = assertions_high.asserted_by(assertion);
                            if (NIL != who) {
                                {
                                    SubLObject item_var = who;
                                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        result = cons(item_var, result);
                                    }
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $axiom_wXo_id_results$ = makeSymbol("*AXIOM-W/O-ID-RESULTS*");

    // defparameter
    public static final SubLSymbol $axiom_wXo_id_time$ = makeSymbol("*AXIOM-W/O-ID-TIME*");

    // defparameter
    public static final SubLSymbol $axiom_wXo_id_count$ = makeSymbol("*AXIOM-W/O-ID-COUNT*");

    /**
     * test CLAUSE-STRUC for invalid or missing id
     */
    public static final SubLObject axiom_wXo_idP(SubLObject axiom) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw16$AXIOM_W_O_ID)) && (NIL != kbi_utilities.kbi_applies_toP($kw16$AXIOM_W_O_ID, axiom))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw16$AXIOM_W_O_ID);
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
                                                        kbi_axiom_wXo_idP(axiom);
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
                    kbi_utilities.kbi_increment_time($kw16$AXIOM_W_O_ID, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :AXIOM-W/O-ID applies to AXIOM
     */
    public static final SubLObject why_axiom_wXo_idP(SubLObject axiom, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw16$AXIOM_W_O_ID, axiom)) {
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
                                                    kbi_axiom_wXo_idP(axiom);
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
                                return list($kw16$AXIOM_W_O_ID, axiom, data);
                            } else {
                                return list($kw16$AXIOM_W_O_ID, axiom);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_axiom_wXo_idP(axiom, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_axiom_wXo_idP(SubLObject clause_struc) {
        {
            SubLObject id = clause_strucs.clause_struc_id(clause_struc);
            if (NIL == collection_defns.cyc_non_negative_integer(id)) {
                kbi_utilities.set_kbi_result(id);
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_nl_why_axiom_wXo_idP(SubLObject clause_struc, SubLObject id) {
        return format(NIL, $str_alt23$_s_has_malformed_id__s__should_be, clause_struc, id);
    }

    // defparameter
    public static final SubLSymbol $axiom_wXo_assertion_results$ = makeSymbol("*AXIOM-W/O-ASSERTION-RESULTS*");

    // defparameter
    public static final SubLSymbol $axiom_wXo_assertion_time$ = makeSymbol("*AXIOM-W/O-ASSERTION-TIME*");

    // defparameter
    public static final SubLSymbol $axiom_wXo_assertion_count$ = makeSymbol("*AXIOM-W/O-ASSERTION-COUNT*");

    /**
     * test CLAUSE-STRUC for no assertion
     */
    public static final SubLObject axiom_wXo_assertionP(SubLObject axiom) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw30$AXIOM_W_O_ASSERTION)) && (NIL != kbi_utilities.kbi_applies_toP($kw30$AXIOM_W_O_ASSERTION, axiom))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw30$AXIOM_W_O_ASSERTION);
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
                                            SubLObject _prev_bind_0_15 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_axiom_wXo_assertionP(axiom);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_15, thread);
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
                    kbi_utilities.kbi_increment_time($kw30$AXIOM_W_O_ASSERTION, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :AXIOM-W/O-ASSERTION applies to AXIOM
     */
    public static final SubLObject why_axiom_wXo_assertionP(SubLObject axiom, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw30$AXIOM_W_O_ASSERTION, axiom)) {
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
                                        SubLObject _prev_bind_0_17 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_axiom_wXo_assertionP(axiom);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_17, thread);
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
                                return list($kw30$AXIOM_W_O_ASSERTION, axiom, data);
                            } else {
                                return list($kw30$AXIOM_W_O_ASSERTION, axiom);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_axiom_wXo_assertionP(axiom, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_axiom_wXo_assertionP(SubLObject clause_struc, SubLObject data) {
        return format(NIL, $str_alt32$_s_has_no_assertion, clause_struc);
    }

    public static final SubLObject kbi_axiom_wXo_assertionP(SubLObject clause_struc) {
        if (NIL == clause_strucs.clause_struc_assertions(clause_struc)) {
            kbi_utilities.set_kbi_result(clause_struc);
        }
        return kbi_utilities.kbi_result();
    }

    // defparameter
    public static final SubLSymbol $axiom_wXmal_assertions_results$ = makeSymbol("*AXIOM-W/MAL-ASSERTIONS-RESULTS*");

    // defparameter
    public static final SubLSymbol $axiom_wXmal_assertions_time$ = makeSymbol("*AXIOM-W/MAL-ASSERTIONS-TIME*");

    // defparameter
    public static final SubLSymbol $axiom_wXmal_assertions_count$ = makeSymbol("*AXIOM-W/MAL-ASSERTIONS-COUNT*");

    /**
     * test CLAUSE-STRUC for invalid assertions
     */
    public static final SubLObject axiom_wXmal_assertionsP(SubLObject axiom) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw39$AXIOM_W_MAL_ASSERTIONS)) && (NIL != kbi_utilities.kbi_applies_toP($kw39$AXIOM_W_MAL_ASSERTIONS, axiom))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw39$AXIOM_W_MAL_ASSERTIONS);
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
                                            SubLObject _prev_bind_0_19 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_axiom_wXmal_assertions(axiom);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_19, thread);
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
                    kbi_utilities.kbi_increment_time($kw39$AXIOM_W_MAL_ASSERTIONS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :AXIOM-W/MAL-ASSERTIONS applies to AXIOM
     */
    public static final SubLObject why_axiom_wXmal_assertionsP(SubLObject axiom, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw39$AXIOM_W_MAL_ASSERTIONS, axiom)) {
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
                                        SubLObject _prev_bind_0_21 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_axiom_wXmal_assertions(axiom);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_21, thread);
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
                                return list($kw39$AXIOM_W_MAL_ASSERTIONS, axiom, data);
                            } else {
                                return list($kw39$AXIOM_W_MAL_ASSERTIONS, axiom);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_axiom_wXmal_assertionsP(axiom, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_axiom_wXmal_assertions(SubLObject clause_struc) {
        {
            SubLObject doneP = NIL;
            SubLObject rest = NIL;
            for (rest = clause_strucs.clause_struc_assertions(clause_struc); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject assertion = rest.first();
                    if (NIL == assertion_handles.assertion_p(assertion)) {
                        kbi_utilities.add_kbi_result(cons($NON_ASSERTION, assertion));
                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                    } else
                        if (clause_struc != assertions_low.assertion_clause_struc(assertion)) {
                            kbi_utilities.add_kbi_result(cons($NON_AXIOM_ASSERTION, assertion));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }

                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_nl_why_axiom_wXmal_assertionsP(SubLObject clause_struc, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt43$_s_references_as_assertions__);
            SubLObject cdolist_list_var = data;
            SubLObject tagXassertion = NIL;
            for (tagXassertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tagXassertion = cdolist_list_var.first()) {
                {
                    SubLObject datum = tagXassertion;
                    SubLObject current = datum;
                    SubLObject tag = NIL;
                    SubLObject assertion = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    tag = current.first();
                    current = current.rest();
                    assertion = current;
                    {
                        SubLObject pcase_var = tag;
                        if (pcase_var.eql($NON_ASSERTION)) {
                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt45$____non_assertion__s, assertion));
                        } else
                            if (pcase_var.eql($NON_AXIOM_ASSERTION)) {
                                nl_result = cconcatenate(nl_result, format(NIL, $str_alt46$____irrelevant_assertion__s, assertion));
                            }

                    }
                }
            }
            return nl_result;
        }
    }







    /**
     * diagnose all assertions indexed by CLAUSE-STRUC
     */
    public static final SubLObject axiom_assertions_diagnosesP(SubLObject axiom) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($AXIOM_ASSERTIONS_DIAGNOSES)) && (NIL != kbi_utilities.kbi_applies_toP($AXIOM_ASSERTIONS_DIAGNOSES, axiom))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($AXIOM_ASSERTIONS_DIAGNOSES);
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
                                            SubLObject _prev_bind_0_23 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_axiom_assertions_diagnoses(axiom);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_23, thread);
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
                    kbi_utilities.kbi_increment_time($AXIOM_ASSERTIONS_DIAGNOSES, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :AXIOM-ASSERTIONS-DIAGNOSES applies to AXIOM
     */
    public static final SubLObject why_axiom_assertions_diagnosesP(SubLObject axiom, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($AXIOM_ASSERTIONS_DIAGNOSES, axiom)) {
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
                                        SubLObject _prev_bind_0_25 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_axiom_assertions_diagnoses(axiom);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_25, thread);
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
                                return list($AXIOM_ASSERTIONS_DIAGNOSES, axiom, data);
                            } else {
                                return list($AXIOM_ASSERTIONS_DIAGNOSES, axiom);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_axiom_assertions_diagnosesP(axiom, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_axiom_assertions_diagnosesP(SubLObject clause_struc, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt55$___s_assertion_diagnostics_, clause_struc);
            SubLObject cdolist_list_var = data;
            SubLObject assertionXdiagnoses = NIL;
            for (assertionXdiagnoses = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertionXdiagnoses = cdolist_list_var.first()) {
                {
                    SubLObject datum = assertionXdiagnoses;
                    SubLObject current = datum;
                    SubLObject assertion = NIL;
                    SubLObject diagnoses = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt56);
                    assertion = current.first();
                    current = current.rest();
                    diagnoses = current;
                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt57$_____s______has_diagnoses___a, assertion, diagnoses));
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_axiom_assertions_diagnoses(SubLObject clause_struc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                SubLObject rest = NIL;
                for (rest = clause_strucs.clause_struc_assertions(clause_struc); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject assertion = rest.first();
                        SubLObject diagnoses = kbi_assertion.cached_diagnose_assertion(assertion);
                        if (NIL != diagnoses) {
                            kbi_utilities.add_kbi_result(cons(assertion, diagnoses));
                            if (NIL == kbi_vars.$kbi_caching_findingsP$.getDynamicValue(thread)) {
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                }
                return kbi_utilities.kbi_result();
            }
        }
    }







    /**
     * diagnose cnf indexed by CLAUSE-STRUC
     */
    public static final SubLObject axiom_cnf_diagnosesP(SubLObject axiom) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($AXIOM_CNF_DIAGNOSES)) && (NIL != kbi_utilities.kbi_applies_toP($AXIOM_CNF_DIAGNOSES, axiom))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($AXIOM_CNF_DIAGNOSES);
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
                                            SubLObject _prev_bind_0_27 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_axiom_cnf_diagnoses(axiom);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_27, thread);
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
                    kbi_utilities.kbi_increment_time($AXIOM_CNF_DIAGNOSES, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :AXIOM-CNF-DIAGNOSES applies to AXIOM
     */
    public static final SubLObject why_axiom_cnf_diagnosesP(SubLObject axiom, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($AXIOM_CNF_DIAGNOSES, axiom)) {
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
                                        SubLObject _prev_bind_0_29 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_axiom_cnf_diagnoses(axiom);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_29, thread);
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
                                return list($AXIOM_CNF_DIAGNOSES, axiom, data);
                            } else {
                                return list($AXIOM_CNF_DIAGNOSES, axiom);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_axiom_cnf_diagnosesP(axiom, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_axiom_cnf_diagnosesP(SubLObject clause_struc, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt66$___s_cnf_diagnostics_, clause_struc);
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject cnf = NIL;
            SubLObject diagnoses = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            cnf = current.first();
            current = current.rest();
            diagnoses = current;
            nl_result = cconcatenate(nl_result, format(NIL, $str_alt68$_____s______has_diagnosis__s, cnf, diagnoses));
            return nl_result;
        }
    }

    public static final SubLObject kbi_axiom_cnf_diagnoses(SubLObject clause_struc) {
        {
            SubLObject cnf = clause_strucs.clause_struc_cnf(clause_struc);
            SubLObject diagnoses = kbi_cnf.diagnose_cnf(cnf, UNPROVIDED);
            if (NIL != diagnoses) {
                kbi_utilities.add_kbi_result(cons(cnf, diagnoses));
            }
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject declare_kbi_axiom_file() {
        declareFunction("axiom_diagnostics", "AXIOM-DIAGNOSTICS", 0, 2, false);
        declareFunction("axiom_diagnostics_wrt", "AXIOM-DIAGNOSTICS-WRT", 1, 2, false);
        declareFunction("resume_axiom_diagnostics", "RESUME-AXIOM-DIAGNOSTICS", 0, 2, false);
        declareFunction("resume_axiom_diagnostics_wrt", "RESUME-AXIOM-DIAGNOSTICS-WRT", 1, 2, false);
        declareFunction("axioms_diagnostics", "AXIOMS-DIAGNOSTICS", 1, 2, false);
        declareFunction("axiom_diagnostics_int", "AXIOM-DIAGNOSTICS-INT", 0, 2, false);
        declareFunction("clear_cached_diagnose_axiom", "CLEAR-CACHED-DIAGNOSE-AXIOM", 0, 0, false);
        declareFunction("remove_cached_diagnose_axiom", "REMOVE-CACHED-DIAGNOSE-AXIOM", 1, 0, false);
        declareFunction("cached_diagnose_axiom_internal", "CACHED-DIAGNOSE-AXIOM-INTERNAL", 1, 0, false);
        declareFunction("cached_diagnose_axiom", "CACHED-DIAGNOSE-AXIOM", 1, 0, false);
        declareFunction("diagnose_axiom", "DIAGNOSE-AXIOM", 1, 1, false);
        declareFunction("diagnose_axiom_int", "DIAGNOSE-AXIOM-INT", 1, 0, false);
        declareFunction("axiom_accessible_in_mtP", "AXIOM-ACCESSIBLE-IN-MT?", 1, 1, false);
        declareFunction("axiom_creators", "AXIOM-CREATORS", 1, 0, false);
        declareFunction("axiom_wXo_idP", "AXIOM-W/O-ID?", 1, 0, false);
        declareFunction("why_axiom_wXo_idP", "WHY-AXIOM-W/O-ID?", 1, 1, false);
        declareFunction("kbi_axiom_wXo_idP", "KBI-AXIOM-W/O-ID?", 1, 0, false);
        declareFunction("kbi_nl_why_axiom_wXo_idP", "KBI-NL-WHY-AXIOM-W/O-ID?", 2, 0, false);
        declareFunction("axiom_wXo_assertionP", "AXIOM-W/O-ASSERTION?", 1, 0, false);
        declareFunction("why_axiom_wXo_assertionP", "WHY-AXIOM-W/O-ASSERTION?", 1, 1, false);
        declareFunction("kbi_nl_why_axiom_wXo_assertionP", "KBI-NL-WHY-AXIOM-W/O-ASSERTION?", 2, 0, false);
        declareFunction("kbi_axiom_wXo_assertionP", "KBI-AXIOM-W/O-ASSERTION?", 1, 0, false);
        declareFunction("axiom_wXmal_assertionsP", "AXIOM-W/MAL-ASSERTIONS?", 1, 0, false);
        declareFunction("why_axiom_wXmal_assertionsP", "WHY-AXIOM-W/MAL-ASSERTIONS?", 1, 1, false);
        declareFunction("kbi_axiom_wXmal_assertions", "KBI-AXIOM-W/MAL-ASSERTIONS", 1, 0, false);
        declareFunction("kbi_nl_why_axiom_wXmal_assertionsP", "KBI-NL-WHY-AXIOM-W/MAL-ASSERTIONS?", 2, 0, false);
        declareFunction("axiom_assertions_diagnosesP", "AXIOM-ASSERTIONS-DIAGNOSES?", 1, 0, false);
        declareFunction("why_axiom_assertions_diagnosesP", "WHY-AXIOM-ASSERTIONS-DIAGNOSES?", 1, 1, false);
        declareFunction("kbi_nl_why_axiom_assertions_diagnosesP", "KBI-NL-WHY-AXIOM-ASSERTIONS-DIAGNOSES?", 2, 0, false);
        declareFunction("kbi_axiom_assertions_diagnoses", "KBI-AXIOM-ASSERTIONS-DIAGNOSES", 1, 0, false);
        declareFunction("axiom_cnf_diagnosesP", "AXIOM-CNF-DIAGNOSES?", 1, 0, false);
        declareFunction("why_axiom_cnf_diagnosesP", "WHY-AXIOM-CNF-DIAGNOSES?", 1, 1, false);
        declareFunction("kbi_nl_why_axiom_cnf_diagnosesP", "KBI-NL-WHY-AXIOM-CNF-DIAGNOSES?", 2, 0, false);
        declareFunction("kbi_axiom_cnf_diagnoses", "KBI-AXIOM-CNF-DIAGNOSES", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_axiom_file() {
        defparameter("*SECOND-ORDER-AXIOMS*", NIL);
        defparameter("*TAUTOLOGIC-AXIOMS*", NIL);
        defparameter("*FREE-POS-LIT-VAR-AXIOMS*", NIL);
        defparameter("*FREE-NEG-LIT-VAR-AXIOMS*", NIL);
        defparameter("*UNCONNECTED-LIT-AXIOMS*", NIL);
        defparameter("*LISPY-NAT-AXIOMS*", NIL);
        defparameter("*ARG-TYPES-W/O-DEFNS*", NIL);
        deflexical("*CACHED-DIAGNOSE-AXIOM-CACHING-STATE*", NIL);
        defparameter("*AXIOM-W/O-ID-RESULTS*", NIL);
        defparameter("*AXIOM-W/O-ID-TIME*", ZERO_INTEGER);
        defparameter("*AXIOM-W/O-ID-COUNT*", ZERO_INTEGER);
        defparameter("*AXIOM-W/O-ASSERTION-RESULTS*", NIL);
        defparameter("*AXIOM-W/O-ASSERTION-TIME*", ZERO_INTEGER);
        defparameter("*AXIOM-W/O-ASSERTION-COUNT*", ZERO_INTEGER);
        defparameter("*AXIOM-W/MAL-ASSERTIONS-RESULTS*", NIL);
        defparameter("*AXIOM-W/MAL-ASSERTIONS-TIME*", ZERO_INTEGER);
        defparameter("*AXIOM-W/MAL-ASSERTIONS-COUNT*", ZERO_INTEGER);
        defparameter("*AXIOM-ASSERTIONS-DIAGNOSES-RESULTS*", NIL);
        defparameter("*AXIOM-ASSERTIONS-DIAGNOSES-TIME*", ZERO_INTEGER);
        defparameter("*AXIOM-ASSERTIONS-DIAGNOSES-COUNT*", ZERO_INTEGER);
        defparameter("*AXIOM-CNF-DIAGNOSES-RESULTS*", NIL);
        defparameter("*AXIOM-CNF-DIAGNOSES-TIME*", ZERO_INTEGER);
        defparameter("*AXIOM-CNF-DIAGNOSES-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_axiom_file() {
                memoization_state.note_globally_cached_function(CACHED_DIAGNOSE_AXIOM);
        {
            SubLObject item_var = $sym10$_AXIOM_W_O_ID_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym10$_AXIOM_W_O_ID_RESULTS_, $str_alt11$violators_of_kbi_module__AXIOM_W_);
        {
            SubLObject item_var = $sym12$_AXIOM_W_O_ID_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym12$_AXIOM_W_O_ID_TIME_, $str_alt13$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym14$_AXIOM_W_O_ID_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym14$_AXIOM_W_O_ID_COUNT_, $str_alt15$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw16$AXIOM_W_O_ID, $list_alt22);
        {
            SubLObject item_var = $sym24$_AXIOM_W_O_ASSERTION_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym24$_AXIOM_W_O_ASSERTION_RESULTS_, $str_alt25$violators_of_kbi_module__AXIOM_W_);
        {
            SubLObject item_var = $sym26$_AXIOM_W_O_ASSERTION_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym26$_AXIOM_W_O_ASSERTION_TIME_, $str_alt27$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym28$_AXIOM_W_O_ASSERTION_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym28$_AXIOM_W_O_ASSERTION_COUNT_, $str_alt29$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw30$AXIOM_W_O_ASSERTION, $list_alt31);
        {
            SubLObject item_var = $sym33$_AXIOM_W_MAL_ASSERTIONS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym33$_AXIOM_W_MAL_ASSERTIONS_RESULTS_, $str_alt34$violators_of_kbi_module__AXIOM_W_);
        {
            SubLObject item_var = $sym35$_AXIOM_W_MAL_ASSERTIONS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym35$_AXIOM_W_MAL_ASSERTIONS_TIME_, $str_alt36$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym37$_AXIOM_W_MAL_ASSERTIONS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym37$_AXIOM_W_MAL_ASSERTIONS_COUNT_, $str_alt38$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw39$AXIOM_W_MAL_ASSERTIONS, $list_alt40);
        {
            SubLObject item_var = $axiom_assertions_diagnoses_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($axiom_assertions_diagnoses_results$, $str_alt48$violators_of_kbi_module__AXIOM_AS);
        {
            SubLObject item_var = $axiom_assertions_diagnoses_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($axiom_assertions_diagnoses_time$, $str_alt50$run_time_of_predicate_application);
        {
            SubLObject item_var = $axiom_assertions_diagnoses_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($axiom_assertions_diagnoses_count$, $str_alt52$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($AXIOM_ASSERTIONS_DIAGNOSES, $list_alt54);
        {
            SubLObject item_var = $axiom_cnf_diagnoses_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($axiom_cnf_diagnoses_results$, $str_alt59$violators_of_kbi_module__AXIOM_CN);
        {
            SubLObject item_var = $axiom_cnf_diagnoses_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($axiom_cnf_diagnoses_time$, $str_alt61$run_time_of_predicate_application);
        {
            SubLObject item_var = $axiom_cnf_diagnoses_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($axiom_cnf_diagnoses_count$, $str_alt63$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($AXIOM_CNF_DIAGNOSES, $list_alt65);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $AXIOM = makeKeyword("AXIOM");

    static private final SubLString $str_alt1$diagnosing__s_clause_strucs = makeString("diagnosing ~s clause-strucs");

    static private final SubLString $$$mapping_Cyc_clause_structs = makeString("mapping Cyc clause structs");





    private static final SubLSymbol CACHED_DIAGNOSE_AXIOM = makeSymbol("CACHED-DIAGNOSE-AXIOM");

    public static final SubLSymbol $cached_diagnose_axiom_caching_state$ = makeSymbol("*CACHED-DIAGNOSE-AXIOM-CACHING-STATE*");

    public static final SubLInteger $int$1024 = makeInteger(1024);

    public static final SubLSymbol $kw8$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");



    static private final SubLSymbol $sym10$_AXIOM_W_O_ID_RESULTS_ = makeSymbol("*AXIOM-W/O-ID-RESULTS*");

    static private final SubLString $str_alt11$violators_of_kbi_module__AXIOM_W_ = makeString("violators of kbi module :AXIOM-W/O-ID");

    static private final SubLSymbol $sym12$_AXIOM_W_O_ID_TIME_ = makeSymbol("*AXIOM-W/O-ID-TIME*");

    static private final SubLString $str_alt13$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :AXIOM-W/O-ID");

    static private final SubLSymbol $sym14$_AXIOM_W_O_ID_COUNT_ = makeSymbol("*AXIOM-W/O-ID-COUNT*");

    static private final SubLString $str_alt15$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :AXIOM-W/O-ID");

    public static final SubLSymbol $kw16$AXIOM_W_O_ID = makeKeyword("AXIOM-W/O-ID");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*AXIOM-W/O-ID-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*AXIOM-W/O-ID-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*AXIOM-W/O-ID-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("AXIOM"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-AXIOM-W/O-ID?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("AXIOM-W/O-ID?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-AXIOM-W/O-ID?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-AXIOM-W/O-ID?"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test CLAUSE-STRUC for invalid or missing id") });

    static private final SubLString $str_alt23$_s_has_malformed_id__s__should_be = makeString("~s has malformed id ~s (should be a non-negative integer)");

    static private final SubLSymbol $sym24$_AXIOM_W_O_ASSERTION_RESULTS_ = makeSymbol("*AXIOM-W/O-ASSERTION-RESULTS*");

    static private final SubLString $str_alt25$violators_of_kbi_module__AXIOM_W_ = makeString("violators of kbi module :AXIOM-W/O-ASSERTION");

    static private final SubLSymbol $sym26$_AXIOM_W_O_ASSERTION_TIME_ = makeSymbol("*AXIOM-W/O-ASSERTION-TIME*");

    static private final SubLString $str_alt27$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :AXIOM-W/O-ASSERTION");

    static private final SubLSymbol $sym28$_AXIOM_W_O_ASSERTION_COUNT_ = makeSymbol("*AXIOM-W/O-ASSERTION-COUNT*");

    static private final SubLString $str_alt29$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :AXIOM-W/O-ASSERTION");

    public static final SubLSymbol $kw30$AXIOM_W_O_ASSERTION = makeKeyword("AXIOM-W/O-ASSERTION");

    static private final SubLList $list_alt31 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*AXIOM-W/O-ASSERTION-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*AXIOM-W/O-ASSERTION-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*AXIOM-W/O-ASSERTION-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("AXIOM"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-AXIOM-W/O-ASSERTION?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("AXIOM-W/O-ASSERTION?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-AXIOM-W/O-ASSERTION?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-AXIOM-W/O-ASSERTION?"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test CLAUSE-STRUC for no assertion") });

    static private final SubLString $str_alt32$_s_has_no_assertion = makeString("~s has no assertion");

    static private final SubLSymbol $sym33$_AXIOM_W_MAL_ASSERTIONS_RESULTS_ = makeSymbol("*AXIOM-W/MAL-ASSERTIONS-RESULTS*");

    static private final SubLString $str_alt34$violators_of_kbi_module__AXIOM_W_ = makeString("violators of kbi module :AXIOM-W/MAL-ASSERTIONS");

    static private final SubLSymbol $sym35$_AXIOM_W_MAL_ASSERTIONS_TIME_ = makeSymbol("*AXIOM-W/MAL-ASSERTIONS-TIME*");

    static private final SubLString $str_alt36$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :AXIOM-W/MAL-ASSERTIONS");

    static private final SubLSymbol $sym37$_AXIOM_W_MAL_ASSERTIONS_COUNT_ = makeSymbol("*AXIOM-W/MAL-ASSERTIONS-COUNT*");

    static private final SubLString $str_alt38$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :AXIOM-W/MAL-ASSERTIONS");

    public static final SubLSymbol $kw39$AXIOM_W_MAL_ASSERTIONS = makeKeyword("AXIOM-W/MAL-ASSERTIONS");

    static private final SubLList $list_alt40 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*AXIOM-W/MAL-ASSERTIONS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*AXIOM-W/MAL-ASSERTIONS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*AXIOM-W/MAL-ASSERTIONS-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("AXIOM"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-AXIOM-W/MAL-ASSERTIONS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("AXIOM-W/MAL-ASSERTIONS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-AXIOM-W/MAL-ASSERTIONS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-AXIOM-W/MAL-ASSERTIONS?"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("SUPPLANTED-BY"), list(makeKeyword("AXIOM-W/O-ASSERTION")), makeKeyword("KBI-DOC"), makeString("test CLAUSE-STRUC for invalid assertions") });

    private static final SubLSymbol $NON_ASSERTION = makeKeyword("NON-ASSERTION");

    private static final SubLSymbol $NON_AXIOM_ASSERTION = makeKeyword("NON-AXIOM-ASSERTION");

    static private final SubLString $str_alt43$_s_references_as_assertions__ = makeString("~s references as assertions: ");

    static private final SubLList $list_alt44 = cons(makeSymbol("TAG"), makeSymbol("ASSERTION"));

    static private final SubLString $str_alt45$____non_assertion__s = makeString("~%  non-assertion ~s");

    static private final SubLString $str_alt46$____irrelevant_assertion__s = makeString("~%  irrelevant assertion ~s");

    public static final SubLSymbol $axiom_assertions_diagnoses_results$ = makeSymbol("*AXIOM-ASSERTIONS-DIAGNOSES-RESULTS*");

    static private final SubLString $str_alt48$violators_of_kbi_module__AXIOM_AS = makeString("violators of kbi module :AXIOM-ASSERTIONS-DIAGNOSES");

    public static final SubLSymbol $axiom_assertions_diagnoses_time$ = makeSymbol("*AXIOM-ASSERTIONS-DIAGNOSES-TIME*");

    static private final SubLString $str_alt50$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :AXIOM-ASSERTIONS-DIAGNOSES");

    public static final SubLSymbol $axiom_assertions_diagnoses_count$ = makeSymbol("*AXIOM-ASSERTIONS-DIAGNOSES-COUNT*");

    static private final SubLString $str_alt52$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :AXIOM-ASSERTIONS-DIAGNOSES");

    private static final SubLSymbol $AXIOM_ASSERTIONS_DIAGNOSES = makeKeyword("AXIOM-ASSERTIONS-DIAGNOSES");

    static private final SubLList $list_alt54 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*AXIOM-ASSERTIONS-DIAGNOSES-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*AXIOM-ASSERTIONS-DIAGNOSES-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*AXIOM-ASSERTIONS-DIAGNOSES-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("AXIOM"), makeKeyword("KBI-LEVEL"), FIVE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-AXIOM-ASSERTIONS-DIAGNOSES"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("AXIOM-ASSERTIONS-DIAGNOSES?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-AXIOM-ASSERTIONS-DIAGNOSES?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-AXIOM-ASSERTIONS-DIAGNOSES?"), makeKeyword("KBI-DOC"), makeString("diagnose all assertions indexed by CLAUSE-STRUC") });

    static private final SubLString $str_alt55$___s_assertion_diagnostics_ = makeString("~%~s assertion diagnostics:");

    static private final SubLList $list_alt56 = cons(makeSymbol("ASSERTION"), makeSymbol("DIAGNOSES"));

    static private final SubLString $str_alt57$_____s______has_diagnoses___a = makeString("~%  ~s~%    has diagnoses: ~a");

    public static final SubLSymbol $axiom_cnf_diagnoses_results$ = makeSymbol("*AXIOM-CNF-DIAGNOSES-RESULTS*");

    static private final SubLString $str_alt59$violators_of_kbi_module__AXIOM_CN = makeString("violators of kbi module :AXIOM-CNF-DIAGNOSES");

    public static final SubLSymbol $axiom_cnf_diagnoses_time$ = makeSymbol("*AXIOM-CNF-DIAGNOSES-TIME*");

    static private final SubLString $str_alt61$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :AXIOM-CNF-DIAGNOSES");

    public static final SubLSymbol $axiom_cnf_diagnoses_count$ = makeSymbol("*AXIOM-CNF-DIAGNOSES-COUNT*");

    static private final SubLString $str_alt63$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :AXIOM-CNF-DIAGNOSES");

    private static final SubLSymbol $AXIOM_CNF_DIAGNOSES = makeKeyword("AXIOM-CNF-DIAGNOSES");

    static private final SubLList $list_alt65 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*AXIOM-CNF-DIAGNOSES-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*AXIOM-CNF-DIAGNOSES-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*AXIOM-CNF-DIAGNOSES-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("AXIOM"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-AXIOM-CNF-DIAGNOSES"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("AXIOM-CNF-DIAGNOSES?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-AXIOM-CNF-DIAGNOSES?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-AXIOM-CNF-DIAGNOSES?"), makeKeyword("KBI-DOC"), makeString("diagnose cnf indexed by CLAUSE-STRUC") });

    static private final SubLString $str_alt66$___s_cnf_diagnostics_ = makeString("~%~s cnf diagnostics:");

    static private final SubLList $list_alt67 = cons(makeSymbol("CNF"), makeSymbol("DIAGNOSES"));

    static private final SubLString $str_alt68$_____s______has_diagnosis__s = makeString("~%  ~s~%    has diagnosis ~s");

    // // Initializers
    public void declareFunctions() {
        declare_kbi_axiom_file();
    }

    public void initializeVariables() {
        init_kbi_axiom_file();
    }

    public void runTopLevelForms() {
        setup_kbi_axiom_file();
    }
}

