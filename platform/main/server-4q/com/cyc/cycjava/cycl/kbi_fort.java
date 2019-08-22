/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KBI-FORT
 *  source file: /cyc/top/cycl/kbi-fort.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_fort extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_fort() {
    }

    public static final SubLFile me = new kbi_fort();


    // // Definitions
    public static final SubLObject fort_diagnostics(SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        kbi_utilities.reset_kbi_state($FORT);
        return fort_diagnostics_int(repairP, printP);
    }

    public static final SubLObject fort_diagnostics_wrt(SubLObject v_modules, SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        kbi_utilities.reset_kbi_state($FORT);
        {
            SubLObject old_modules = kbi_utilities.kbi_selected_modules(UNPROVIDED);
            SubLObject result = NIL;
            try {
                kbi_utilities.kbi_unselect_modules(old_modules);
                kbi_utilities.kbi_select_modules(v_modules);
                result = fort_diagnostics_int(repairP, printP);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        kbi_utilities.kbi_unselect_modules(v_modules);
                        kbi_utilities.kbi_select_modules(old_modules);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject forts_diagnostics_wrt(SubLObject v_forts, SubLObject v_modules, SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        kbi_utilities.reset_kbi_state($FORT);
        {
            SubLObject old_modules = kbi_utilities.kbi_selected_modules(UNPROVIDED);
            SubLObject result = NIL;
            try {
                kbi_utilities.kbi_unselect_modules(old_modules);
                kbi_utilities.kbi_select_modules(v_modules);
                result = forts_diagnostics(v_forts, repairP, printP);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        kbi_utilities.kbi_unselect_modules(v_modules);
                        kbi_utilities.kbi_select_modules(old_modules);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    /**
     * perform kbi diagnostics sweep on FORTS
     */
    public static final SubLObject forts_diagnostics(SubLObject v_forts, SubLObject repairP, SubLObject printP) {
        if (repairP == UNPROVIDED) {
            repairP = kbi_vars.$kbi_repairing_findingsP$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_utilities.reset_kbi_state($FORT);
            {
                SubLObject result = NIL;
                kbi_vars.$kbi_last_domain$.setDynamicValue($FORT, thread);
                kbi_vars.$kbi_items_to_consider$.setDynamicValue(length(v_forts), thread);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kbi_vars.$kbi_repairing_findingsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = kbi_vars.$within_kbi_sweepP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(kbi_vars.$kbi_relevant_mt_function$.getDynamicValue(thread), thread);
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
                        kbi_vars.$kbi_repairing_findingsP$.bind(repairP, thread);
                        kbi_vars.$within_kbi_sweepP$.bind(T, thread);
                        {
                            SubLObject list_var = v_forts;
                            utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt1$diagnosing__s_forts, kbi_vars.$kbi_items_to_consider$.getDynamicValue(thread)), thread);
                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject fort = NIL;
                                        for (fort = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , fort = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            {
                                                SubLObject _prev_bind_0_5 = utilities_macros.$progress_total$.currentBinding(thread);
                                                SubLObject _prev_bind_1_6 = utilities_macros.$progress_sofar$.currentBinding(thread);
                                                try {
                                                    utilities_macros.$progress_total$.bind(NIL, thread);
                                                    utilities_macros.$progress_sofar$.bind(NIL, thread);
                                                    if (gethash($FORT, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED).isNumber()) {
                                                        sethash($FORT, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), add(gethash($FORT, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                                                    }
                                                    if (NIL != kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.getDynamicValue(thread)) {
                                                        if (fort == kbi_vars.$kbi_last_fort_considered$.getDynamicValue(thread)) {
                                                            kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.setDynamicValue(NIL, thread);
                                                        }
                                                    } else {
                                                        diagnose_fort(fort);
                                                        kbi_vars.$kbi_last_fort_considered$.setDynamicValue(fort, thread);
                                                    }
                                                } finally {
                                                    utilities_macros.$progress_sofar$.rebind(_prev_bind_1_6, thread);
                                                    utilities_macros.$progress_total$.rebind(_prev_bind_0_5, thread);
                                                }
                                            }
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_4, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_3, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_2, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        kbi_vars.$within_kbi_sweepP$.rebind(_prev_bind_3, thread);
                        kbi_vars.$kbi_repairing_findingsP$.rebind(_prev_bind_2, thread);
                        kbi_vars.$kbi_caching_findingsP$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != printP) {
                    {
                        SubLObject _prev_bind_0 = kbi_vars.$kbi_print_whyP$.currentBinding(thread);
                        try {
                            kbi_vars.$kbi_print_whyP$.bind(T, thread);
                            result = kbi_utilities.kbi_print_domain_results($FORT);
                        } finally {
                            kbi_vars.$kbi_print_whyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject fort_diagnostics_int(SubLObject repairP, SubLObject printP) {
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
                kbi_vars.$kbi_last_domain$.setDynamicValue($FORT, thread);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kbi_vars.$within_kbi_sweepP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = kbi_vars.$kbi_repairing_findingsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(kbi_vars.$kbi_relevant_mt_function$.getDynamicValue(thread), thread);
                        mt_relevance_macros.$mt$.bind(kbi_vars.$kbi_mt$.getDynamicValue(thread), thread);
                        kbi_vars.$within_kbi_sweepP$.bind(T, thread);
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
                        kbi_vars.$kbi_repairing_findingsP$.bind(repairP, thread);
                        {
                            SubLObject message = $$$mapping_Cyc_FORTs;
                            SubLObject total = forts.fort_count();
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_7 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_8 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_9 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3_10 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(message);
                                    {
                                        SubLObject cdolist_list_var = forts.do_forts_tables();
                                        SubLObject table_var = NIL;
                                        for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                            if (NIL == id_index.do_id_index_empty_p(table_var, $SKIP)) {
                                                {
                                                    SubLObject id = id_index.do_id_index_next_id(table_var, T, NIL, NIL);
                                                    SubLObject state_var = id_index.do_id_index_next_state(table_var, T, id, NIL);
                                                    SubLObject fort = NIL;
                                                    while (NIL != id) {
                                                        fort = id_index.do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                        if (NIL != id_index.do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                            sofar = add(sofar, ONE_INTEGER);
                                                            utilities_macros.note_percent_progress(sofar, total);
                                                            {
                                                                SubLObject _prev_bind_0_11 = utilities_macros.$progress_total$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_12 = utilities_macros.$progress_sofar$.currentBinding(thread);
                                                                try {
                                                                    utilities_macros.$progress_total$.bind(NIL, thread);
                                                                    utilities_macros.$progress_sofar$.bind(NIL, thread);
                                                                    if (gethash($FORT, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED).isNumber()) {
                                                                        sethash($FORT, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), add(gethash($FORT, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                                                                    }
                                                                    if (NIL != kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.getDynamicValue(thread)) {
                                                                        if (fort == kbi_vars.$kbi_last_fort_considered$.getDynamicValue(thread)) {
                                                                            kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.setDynamicValue(NIL, thread);
                                                                        }
                                                                    } else {
                                                                        if (NIL != funcall(kbi_vars.$kbi_sweep_select_fn$.getDynamicValue(thread), fort)) {
                                                                            diagnose_fort(fort);
                                                                            kbi_vars.$kbi_last_fort_considered$.setDynamicValue(fort, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    utilities_macros.$progress_sofar$.rebind(_prev_bind_1_12, thread);
                                                                    utilities_macros.$progress_total$.rebind(_prev_bind_0_11, thread);
                                                                }
                                                            }
                                                        }
                                                        id = id_index.do_id_index_next_id(table_var, T, id, state_var);
                                                        state_var = id_index.do_id_index_next_state(table_var, T, id, state_var);
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_10, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_9, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_8, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                            if (NIL != printP) {
                                result = kbi_utilities.kbi_print_domain_results($FORT);
                            }
                        }
                    } finally {
                        kbi_vars.$kbi_repairing_findingsP$.rebind(_prev_bind_4, thread);
                        kbi_vars.$kbi_caching_findingsP$.rebind(_prev_bind_3, thread);
                        kbi_vars.$within_kbi_sweepP$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject resume_fort_diagnostics(SubLObject repairP, SubLObject printP) {
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
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.bind(T, thread);
                        result = fort_diagnostics_int(repairP, printP);
                    } finally {
                        kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject resume_forts_diagnostics(SubLObject v_forts, SubLObject repairP, SubLObject printP) {
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
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.bind(T, thread);
                        result = forts_diagnostics(v_forts, repairP, printP);
                    } finally {
                        kbi_vars.$kbi_resuming_fort_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * obsolete -- use diagnose-fort
     */
    public static final SubLObject diagnose_constant(SubLObject fort) {
        return diagnose_fort(fort);
    }

    public static final SubLObject diagnose_fort(SubLObject fort) {
        return diagnose_fort_int(fort);
    }

    public static final SubLObject diagnose_fort_int(SubLObject fort) {
        return kbi_utilities.diagnose_qua_sub_domains(fort, $FORT);
    }







    /**
     * is FORT released?
     */
    public static final SubLObject fort_releasedP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($FORT_RELEASED)) && (NIL != kbi_utilities.kbi_applies_toP($FORT_RELEASED, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($FORT_RELEASED);
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
                                            SubLObject _prev_bind_0_13 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_releasedP(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($FORT_RELEASED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-RELEASED applies to FORT
     */
    public static final SubLObject why_fort_releasedP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($FORT_RELEASED, fort)) {
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
                                        SubLObject _prev_bind_0_15 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_releasedP(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($FORT_RELEASED, fort, data);
                            } else {
                                return list($FORT_RELEASED, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_releasedP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_fort_releasedP(SubLObject fort) {
        if ((NIL != constant_handles.constant_p(fort)) && (NIL != constant_completion.constant_mentioned_in_codeP(fort))) {
            kbi_utilities.add_kbi_result($MENTIONED_IN_CODE);
        }
        if (NIL != cb_browser.public_fortP(fort)) {
            kbi_utilities.add_kbi_result($PUBLIC);
        }
        if (NIL != cb_browser.ikb_fortP(fort)) {
            kbi_utilities.add_kbi_result($HPKB_IKB);
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_nl_why_fort_releasedP(SubLObject fort, SubLObject data) {
        return format(NIL, $str_alt20$_s_release_status___a_, fort, string_utilities.stringify_items(data, symbol_function(OBJECT_TO_STRING), $str_alt22$__, $str_alt23$__and_));
    }







    /**
     * test FORT for datastructure validity
     */
    public static final SubLObject kbi_fort_invalidP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($FORT_INVALID)) && (NIL != kbi_utilities.kbi_applies_toP($FORT_INVALID, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($FORT_INVALID);
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
                                            SubLObject _prev_bind_0_17 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_invalid_intP(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($FORT_INVALID, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-INVALID applies to FORT
     */
    public static final SubLObject why_fort_invalidP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($FORT_INVALID, fort)) {
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
                                        SubLObject _prev_bind_0_19 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_invalid_intP(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($FORT_INVALID, fort, data);
                            } else {
                                return list($FORT_INVALID, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_invalidP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_fort_invalid_intP(SubLObject fort) {
        if (NIL != forts.invalid_fortP(fort)) {
            kbi_utilities.set_kbi_result(fort);
            return kbi_utilities.kbi_result();
        }
        return NIL;
    }

    public static final SubLObject kbi_nl_why_fort_invalidP(SubLObject fort, SubLObject data) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        return format(NIL, $str_alt32$_s_is_not_a_valid_fort, fort);
    }

    // defparameter
    public static final SubLSymbol $fort_wXmalformed_sbhl_links_results$ = makeSymbol("*FORT-W/MALFORMED-SBHL-LINKS-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXmalformed_sbhl_links_time$ = makeSymbol("*FORT-W/MALFORMED-SBHL-LINKS-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXmalformed_sbhl_links_count$ = makeSymbol("*FORT-W/MALFORMED-SBHL-LINKS-COUNT*");

    /**
     * test FORT for malformed sbhl data (e.g., wrt sbhl bnf)
     */
    public static final SubLObject malformed_sbhl_linksP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw39$FORT_W_MALFORMED_SBHL_LINKS)) && (NIL != kbi_utilities.kbi_applies_toP($kw39$FORT_W_MALFORMED_SBHL_LINKS, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw39$FORT_W_MALFORMED_SBHL_LINKS);
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
                                            SubLObject _prev_bind_0_21 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_malformed_sbhl_linksP(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw39$FORT_W_MALFORMED_SBHL_LINKS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/MALFORMED-SBHL-LINKS applies to FORT
     */
    public static final SubLObject why_fort_wXmalformed_sbhl_linksP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw39$FORT_W_MALFORMED_SBHL_LINKS, fort)) {
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
                                        SubLObject _prev_bind_0_23 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_malformed_sbhl_linksP(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw39$FORT_W_MALFORMED_SBHL_LINKS, fort, data);
                            } else {
                                return list($kw39$FORT_W_MALFORMED_SBHL_LINKS, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXmalformed_sbhl_linksP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_malformed_sbhl_linksP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject validP = sbhl_link_utilities.valid_sbhl_links_p(fort);
                SubLObject invalid_links = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != validP) {
                    kbi_utilities.set_kbi_result(NIL);
                } else {
                    kbi_utilities.set_kbi_result(invalid_links);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_nl_why_fort_wXmalformed_sbhl_linksP(SubLObject fort, SubLObject mal_links) {
        return format(NIL, $str_alt41$_s_has_malformed_sbhl_links___s, fort, mal_links);
    }

    // defparameter
    public static final SubLSymbol $fort_wXunknown_type_results$ = makeSymbol("*FORT-W/UNKNOWN-TYPE-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXunknown_type_time$ = makeSymbol("*FORT-W/UNKNOWN-TYPE-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXunknown_type_count$ = makeSymbol("*FORT-W/UNKNOWN-TYPE-COUNT*");

    /**
     * test fort for unknown type
     */
    public static final SubLObject fort_wXunknown_typeP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw48$FORT_W_UNKNOWN_TYPE)) && (NIL != kbi_utilities.kbi_applies_toP($kw48$FORT_W_UNKNOWN_TYPE, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw48$FORT_W_UNKNOWN_TYPE);
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
                                            SubLObject _prev_bind_0_25 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_wXunknown_type(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw48$FORT_W_UNKNOWN_TYPE, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/UNKNOWN-TYPE applies to FORT
     */
    public static final SubLObject why_fort_wXunknown_typeP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw48$FORT_W_UNKNOWN_TYPE, fort)) {
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
                                        SubLObject _prev_bind_0_27 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_wXunknown_type(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw48$FORT_W_UNKNOWN_TYPE, fort, data);
                            } else {
                                return list($kw48$FORT_W_UNKNOWN_TYPE, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXunknown_typeP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_fort_wXunknown_type(SubLObject fort) {
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_nl_why_fort_wXunknown_typeP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXtype = NIL;
            for (mtXtype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXtype = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXtype;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt51);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt51);
                    type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt52$___s_type_is__s_but_should_be_one, new SubLObject[]{ fort, type, string_utilities.stringify_items(sbhl_cache.all_fort_types(), symbol_function(OBJECT_TO_STRING), $str_alt22$__, $str_alt53$_and_), mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt51);
                    }
                }
            }
            return nl_result;
        }
    }

    // defparameter
    public static final SubLSymbol $fort_wXmal_types_results$ = makeSymbol("*FORT-W/MAL-TYPES-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXmal_types_time$ = makeSymbol("*FORT-W/MAL-TYPES-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXmal_types_count$ = makeSymbol("*FORT-W/MAL-TYPES-COUNT*");

    /**
     * test FORT for stale sbhl types
     */
    public static final SubLObject fort_wXmal_typesP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw60$FORT_W_MAL_TYPES)) && (NIL != kbi_utilities.kbi_applies_toP($kw60$FORT_W_MAL_TYPES, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw60$FORT_W_MAL_TYPES);
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
                                            SubLObject _prev_bind_0_29 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_mal_types(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw60$FORT_W_MAL_TYPES, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/MAL-TYPES applies to FORT
     */
    public static final SubLObject why_fort_wXmal_typesP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw60$FORT_W_MAL_TYPES, fort)) {
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
                                        SubLObject _prev_bind_0_31 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_mal_types(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_32, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_31, thread);
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
                                return list($kw60$FORT_W_MAL_TYPES, fort, data);
                            } else {
                                return list($kw60$FORT_W_MAL_TYPES, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXmal_typesP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_fort_mal_types(SubLObject fort) {
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_nl_why_fort_wXmal_typesP(SubLObject fort, SubLObject result) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = result;
            SubLObject mtXoldXnew = NIL;
            for (mtXoldXnew = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXoldXnew = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXoldXnew;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject old = NIL;
                    SubLObject v_new = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt62);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt62);
                    old = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt62);
                    v_new = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt63$___s_type_in__s_is__s_but_should_, new SubLObject[]{ fort, mt, old, v_new }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt62);
                    }
                }
            }
            return nl_result;
        }
    }

    // defparameter
    public static final SubLSymbol $fort_wXo_isa_results$ = makeSymbol("*FORT-W/O-ISA-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXo_isa_time$ = makeSymbol("*FORT-W/O-ISA-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXo_isa_count$ = makeSymbol("*FORT-W/O-ISA-COUNT*");

    /**
     * test fort for references in mts where they have no #$isa
     */
    public static final SubLObject fort_wXo_isaP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw70$FORT_W_O_ISA)) && (NIL != kbi_utilities.kbi_applies_toP($kw70$FORT_W_O_ISA, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw70$FORT_W_O_ISA);
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
                                            SubLObject _prev_bind_0_33 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_wXo_isa_in_mts(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_34, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_33, thread);
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
                    kbi_utilities.kbi_increment_time($kw70$FORT_W_O_ISA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/O-ISA applies to FORT
     */
    public static final SubLObject why_fort_wXo_isaP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw70$FORT_W_O_ISA, fort)) {
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
                                        SubLObject _prev_bind_0_35 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_wXo_isa_in_mts(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_36, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_35, thread);
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
                                return list($kw70$FORT_W_O_ISA, fort, data);
                            } else {
                                return list($kw70$FORT_W_O_ISA, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXo_isaP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_fort_wXo_isa_in_mts(SubLObject fort) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = kbi_utilities.kbi_cached_term_mts(fort);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL == isa.isa(fort, mt, UNPROVIDED)) {
                            {
                                SubLObject assertion = fort_non_excepted_assertion_wXo_isa_in_mt(fort, mt);
                                if (NIL != assertion) {
                                    kbi_utilities.add_kbi_result(assertion);
                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                }
                            }
                        }
                        return kbi_utilities.kbi_result();
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject fort_non_excepted_assertion_wXo_isa_in_mt(SubLObject fort, SubLObject mt) {
        if (mt.eql($$BookkeepingMt)) {
            {
                SubLObject cdolist_list_var = kb_accessors.ata(fort, mt);
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    if (!(((NIL != assertions_high.gaf_assertionP(assertion)) && kb_accessors.arg1_isa(assertions_high.gaf_arg0(assertion), mt).equal($list_alt73)) && fort.eql(assertions_high.gaf_arg1(assertion)))) {
                        return assertion;
                    }
                }
            }
        } else
            if (mt.eql(mt_vars.$tou_mt$.getGlobalValue())) {
                {
                    SubLObject cdolist_list_var = kb_accessors.ata(fort, mt);
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        if (!(((NIL != assertions_high.gaf_assertionP(assertion)) && $$termOfUnit.eql(assertions_high.gaf_arg0(assertion))) && (fort.eql(assertions_high.gaf_arg1(assertion)) || ((NIL != list_utilities.tree_find(fort, narts_high.nart_el_formula(assertions_high.gaf_arg1(assertion)), UNPROVIDED, UNPROVIDED)) && (NIL != fort_wXo_isa_in_mt_exceptionP(assertions_high.gaf_arg1(assertion), mt)))))) {
                            return assertion;
                        }
                    }
                }
            } else {
                return kb_accessors.any_term_assertion(fort, mt).first();
            }

        return NIL;
    }

    public static final SubLObject fort_wXo_isa_in_mt_exceptionP(SubLObject fort, SubLObject mt) {
        return NIL;
    }

    public static final SubLObject kbi_nl_why_fort_wXo_isaP(SubLObject fort, SubLObject data) {
        if (NIL != data) {
            {
                SubLObject nl_result = format(NIL, $str_alt75$___s, fort);
                SubLObject cdolist_list_var = data;
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt76$____in__a_has_no_isa_but_is_refer, assertions_high.assertion_mt(assertion), fi.assertion_fi_formula(assertion, UNPROVIDED)));
                }
                return nl_result;
            }
        }
        return NIL;
    }







    /**
     * test fort for collections that include them via #$defnSufficient but not via #$isa
     */
    public static final SubLObject fort_missing_isa_via_defnP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($FORT_MISSING_ISA_VIA_DEFN)) && (NIL != kbi_utilities.kbi_applies_toP($FORT_MISSING_ISA_VIA_DEFN, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($FORT_MISSING_ISA_VIA_DEFN);
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
                                            SubLObject _prev_bind_0_37 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_missing_isa_via_defn_in_mts(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_38, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_37, thread);
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
                    kbi_utilities.kbi_increment_time($FORT_MISSING_ISA_VIA_DEFN, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-MISSING-ISA-VIA-DEFN applies to FORT
     */
    public static final SubLObject why_fort_missing_isa_via_defnP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($FORT_MISSING_ISA_VIA_DEFN, fort)) {
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
                                        SubLObject _prev_bind_0_39 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_missing_isa_via_defn_in_mts(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_39, thread);
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
                                return list($FORT_MISSING_ISA_VIA_DEFN, fort, data);
                            } else {
                                return list($FORT_MISSING_ISA_VIA_DEFN, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_missing_isa_via_defnP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_fort_missing_isa_via_defn_in_mts(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_target$.bind(fort, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = $list_alt87;
                                SubLObject defn_pred = NIL;
                                for (defn_pred = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , defn_pred = csome_list_var.first()) {
                                    kb_mapping.map_predicate_extent_index(symbol_function($sym85$KBI_GATHER_ADMITTING_COL_MT), defn_pred, $TRUE, UNPROVIDED);
                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
                        control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
                    }
                }
                return kbi_utilities.kbi_result();
            }
        }
    }

    public static final SubLObject kbi_gather_admitting_colXmt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject col = assertions_high.gaf_arg1(assertion);
                SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                SubLObject pred = assertions_high.gaf_arg0(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                if (NIL == genls.any_specP(col, $list_alt88, mt, UNPROVIDED)) {
                    if (NIL != at_defns.viable_defnP(defn, UNPROVIDED)) {
                        if (NIL != at_defns.quiet_defn_admitsP(defn, control_vars.$mapping_target$.getDynamicValue(thread), col, mt)) {
                            if (NIL == isa.isaP(control_vars.$mapping_target$.getDynamicValue(thread), col, mt, UNPROVIDED)) {
                                kbi_utilities.add_kbi_result(list(mt, col, pred, defn));
                                if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                    utilities_macros.mapping_finished();
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_fort_missing_isa_via_defnP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXcolXpredXdefn = NIL;
            for (mtXcolXpredXdefn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXcolXpredXdefn = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXcolXpredXdefn;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject col = NIL;
                    SubLObject pred = NIL;
                    SubLObject defn = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    col = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    defn = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt90$___s_is_admitted_by__s___s_of__s_, new SubLObject[]{ fort, defn, pred, col, col, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt89);
                    }
                }
            }
            return nl_result;
        }
    }







    /**
     * test fort for collections that includes a fort via #$isa but not via #$defnNecessary
     */
    public static final SubLObject fort_violating_isa_defnP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($FORT_VIOLATING_ISA_DEFN)) && (NIL != kbi_utilities.kbi_applies_toP($FORT_VIOLATING_ISA_DEFN, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($FORT_VIOLATING_ISA_DEFN);
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
                                            SubLObject _prev_bind_0_41 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_violating_isa_defn_in_mts(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_42, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_41, thread);
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
                    kbi_utilities.kbi_increment_time($FORT_VIOLATING_ISA_DEFN, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-VIOLATING-ISA-DEFN applies to FORT
     */
    public static final SubLObject why_fort_violating_isa_defnP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($FORT_VIOLATING_ISA_DEFN, fort)) {
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
                                        SubLObject _prev_bind_0_43 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_violating_isa_defn_in_mts(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_44, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_43, thread);
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
                                return list($FORT_VIOLATING_ISA_DEFN, fort, data);
                            } else {
                                return list($FORT_VIOLATING_ISA_DEFN, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_violating_isa_defnP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_fort_violating_isa_defn_in_mts(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$isa) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$isa))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                        {
                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(fort, sbhl_module_vars.get_sbhl_module($$isa));
                            if (NIL != d_link) {
                                {
                                    SubLObject rest = NIL;
                                    for (rest = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$isa)); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject direction = rest.first();
                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$isa));
                                            if (NIL != mt_links) {
                                                if (direction == sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$isa))) {
                                                    {
                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                        while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject iteration_state_45 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                    while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_45)))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state_45);
                                                                            SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.sbhl_true_tv_p(mt)) {
                                                                                {
                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                    SubLObject rest_46 = NIL;
                                                                                    for (rest_46 = new_list; !((NIL != doneP) || (NIL == rest_46)); rest_46 = rest_46.rest()) {
                                                                                        {
                                                                                            SubLObject v_isa = rest_46.first();
                                                                                            if (NIL != at_defns.defining_defns_rejectP(v_isa, fort, mt)) {
                                                                                                kbi_utilities.add_kbi_result(list(mt, v_isa, $$defnIff, kb_mapping_utilities.fpred_value_in_relevant_mts(v_isa, $$defnIff, mt, ONE_INTEGER, TWO_INTEGER, $TRUE)));
                                                                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                            }
                                                                                            if (NIL == doneP) {
                                                                                                if (NIL != at_defns.necessary_defns_rejectP(v_isa, fort, mt)) {
                                                                                                    if (NIL == doneP) {
                                                                                                        {
                                                                                                            SubLObject csome_list_var = at_defns.rejected_by_necessary_defns(v_isa, fort, mt);
                                                                                                            SubLObject defn = NIL;
                                                                                                            for (defn = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , defn = csome_list_var.first()) {
                                                                                                                kbi_utilities.add_kbi_result(list(mt, v_isa, $$defnNecessary, defn));
                                                                                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            iteration_state_45 = dictionary_contents.do_dictionary_contents_next(iteration_state_45);
                                                                        }
                                                                    } 
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_45);
                                                                }
                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return kbi_utilities.kbi_result();
            }
        }
    }

    public static final SubLObject kbi_nl_why_fort_violating_isa_defnP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXcolXpredXdefn = NIL;
            for (mtXcolXpredXdefn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXcolXpredXdefn = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXcolXpredXdefn;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject col = NIL;
                    SubLObject pred = NIL;
                    SubLObject defn = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    col = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    defn = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt102$___s___isa__s_but_is_rejected_by_, new SubLObject[]{ fort, col, pred, defn, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt89);
                    }
                }
            }
            return nl_result;
        }
    }

    // defparameter
    public static final SubLSymbol $fort_wXo_expected_gafs_results$ = makeSymbol("*FORT-W/O-EXPECTED-GAFS-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXo_expected_gafs_time$ = makeSymbol("*FORT-W/O-EXPECTED-GAFS-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXo_expected_gafs_count$ = makeSymbol("*FORT-W/O-EXPECTED-GAFS-COUNT*");

    /**
     * test fort for expected but missing gaf assertions
     */
    public static final SubLObject fort_wXo_expected_gafsP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw109$FORT_W_O_EXPECTED_GAFS)) && (NIL != kbi_utilities.kbi_applies_toP($kw109$FORT_W_O_EXPECTED_GAFS, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw109$FORT_W_O_EXPECTED_GAFS);
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
                                            SubLObject _prev_bind_0_47 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_wXo_expected_gafs_in_mts(fort, UNPROVIDED);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_48, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_47, thread);
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
                    kbi_utilities.kbi_increment_time($kw109$FORT_W_O_EXPECTED_GAFS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/O-EXPECTED-GAFS applies to FORT
     */
    public static final SubLObject why_fort_wXo_expected_gafsP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw109$FORT_W_O_EXPECTED_GAFS, fort)) {
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
                                        SubLObject _prev_bind_0_49 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_wXo_expected_gafs_in_mts(fort, UNPROVIDED);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_50, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_49, thread);
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
                                return list($kw109$FORT_W_O_EXPECTED_GAFS, fort, data);
                            } else {
                                return list($kw109$FORT_W_O_EXPECTED_GAFS, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXo_expected_gafsP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    /**
     * identify (in english) kb gaps involving FORT
     */
    public static final SubLObject tell_me_more_fort(SubLObject fort, SubLObject minP) {
        if (minP == UNPROVIDED) {
            minP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mtXpredXargXisas = NIL;
                SubLObject nl_result = $str_alt111$please_assert_;
                {
                    SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                    try {
                        kbi_macros.$kbi_result$.bind(NIL, thread);
                        {
                            SubLObject error_message = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_51 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            try {
                                                kbi_fort_wXo_expected_gafs_in_mts(fort, minP);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        mtXpredXargXisas = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_52, thread);
                                                    }
                                                }
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_51, thread);
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
                if (NIL != mtXpredXargXisas) {
                    {
                        SubLObject cdolist_list_var = mtXpredXargXisas;
                        SubLObject mtXpredXargXisa = NIL;
                        for (mtXpredXargXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXargXisa = cdolist_list_var.first()) {
                            {
                                SubLObject datum = mtXpredXargXisa;
                                SubLObject current = datum;
                                SubLObject mt = NIL;
                                SubLObject pred = NIL;
                                SubLObject arg = NIL;
                                SubLObject v_isa = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt112);
                                mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt112);
                                pred = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt112);
                                arg = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt112);
                                v_isa = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject pcase_var = arg;
                                        if (pcase_var.eql(ONE_INTEGER)) {
                                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt113$______s__s___a____in__s_, new SubLObject[]{ pred, fort, kb_paths.fort_name(best_gaf_argn_isa(listS(pred, fort, $list_alt114), TWO_INTEGER, mt)), mt }));
                                        } else
                                            if (pcase_var.eql(TWO_INTEGER)) {
                                                nl_result = cconcatenate(nl_result, format(NIL, $str_alt115$______s___a___s___in__s_, new SubLObject[]{ pred, fort, kb_paths.fort_name(best_gaf_argn_isa(list(pred, $X, fort), ONE_INTEGER, mt)), mt }));
                                            }

                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt112);
                                }
                            }
                        }
                    }
                    return nl_result;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject best_gaf_argn_isa(SubLObject gaf, SubLObject arg, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject v_isa = genls.min_cols(list_utilities.remove_duplicate_forts(at_utilities.arg_requires_isa_in_relation(arg, gaf, mt)), mt, UNPROVIDED);
            SubLObject floors = genls.max_floor_cols(v_isa, NIL, mt, UNPROVIDED);
            if (NIL != floors) {
                return floors.first();
            } else
                if (NIL != v_isa) {
                    return v_isa.first();
                } else {
                    return $$Thing;
                }

        }
    }

    public static final SubLObject kbi_fort_wXo_expected_gafs_in_mts(SubLObject fort, SubLObject minP) {
        if (minP == UNPROVIDED) {
            minP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_source$.currentBinding(thread);
                    try {
                        control_vars.$mapping_source$.bind(fort, thread);
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = czer_vars.$required_arg_preds$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_53 = control_vars.$mapping_pred$.currentBinding(thread);
                                    try {
                                        control_vars.$mapping_pred$.bind(NIL, thread);
                                        for (control_vars.$mapping_pred$.setDynamicValue(csome_list_var.first(), thread); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , control_vars.$mapping_pred$.setDynamicValue(csome_list_var.first(), thread)) {
                                            {
                                                SubLObject _prev_bind_0_54 = control_vars.$mapping_index_arg$.currentBinding(thread);
                                                try {
                                                    control_vars.$mapping_index_arg$.bind(kb_accessors.required_pred_arg(control_vars.$mapping_pred$.getDynamicValue(thread)), thread);
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var_55 = kbi_utilities.kbi_cached_term_mts(fort);
                                                            {
                                                                SubLObject _prev_bind_0_56 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                try {
                                                                    mt_relevance_macros.$mt$.bind(NIL, thread);
                                                                    for (mt_relevance_macros.$mt$.setDynamicValue(csome_list_var_55.first(), thread); !((NIL != doneP) || (NIL == csome_list_var_55)); csome_list_var_55 = csome_list_var_55.rest() , mt_relevance_macros.$mt$.setDynamicValue(csome_list_var_55.first(), thread)) {
                                                                        isa.any_wrt_all_isa(symbol_function(GATHER_MISSING_EXPECTED_PREDS_VIA_COL), fort, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                                                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                        if (NIL != minP) {
                                                                            {
                                                                                SubLObject relevant = NIL;
                                                                                {
                                                                                    SubLObject cdolist_list_var = kbi_utilities.kbi_result();
                                                                                    SubLObject mtXpredXargXisa = NIL;
                                                                                    for (mtXpredXargXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXargXisa = cdolist_list_var.first()) {
                                                                                        if (control_vars.$mapping_index_arg$.getDynamicValue(thread) == third(mtXpredXargXisa)) {
                                                                                            relevant = cons(mtXpredXargXisa, relevant);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (NIL != relevant) {
                                                                                    {
                                                                                        SubLObject min_preds = genl_predicates.min_predicates(Mapping.mapcar(symbol_function(SECOND), relevant), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                                                                                        SubLObject cdolist_list_var = relevant;
                                                                                        SubLObject mtXpredXargXisa = NIL;
                                                                                        for (mtXpredXargXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXargXisa = cdolist_list_var.first()) {
                                                                                            if (NIL == subl_promotions.memberP(second(mtXpredXargXisa), min_preds, UNPROVIDED, UNPROVIDED)) {
                                                                                                kbi_macros.$kbi_result$.setDynamicValue(remove(mtXpredXargXisa, kbi_macros.$kbi_result$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_56, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    control_vars.$mapping_index_arg$.rebind(_prev_bind_0_54, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        control_vars.$mapping_pred$.rebind(_prev_bind_0_53, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        control_vars.$mapping_source$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject gather_missing_expected_preds_via_col(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kb_mapping.map_gaf_arg_index(symbol_function(GATHER_MISSING_EXPECTED_PREDS), col, ONE_INTEGER, control_vars.$mapping_pred$.getDynamicValue(thread), $TRUE, UNPROVIDED);
            if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                return kbi_utilities.kbi_result();
            }
            return NIL;
        }
    }

    public static final SubLObject gather_missing_expected_preds(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject col = assertions_high.gaf_arg1(assertion);
                SubLObject pred = assertions_high.gaf_arg2(assertion);
                SubLObject gather_arg = (TWO_INTEGER.numE(control_vars.$mapping_index_arg$.getDynamicValue(thread))) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                if (NIL == kb_gp_mapping.gp_fpred_value(control_vars.$mapping_source$.getDynamicValue(thread), pred, control_vars.$mapping_index_arg$.getDynamicValue(thread), gather_arg)) {
                    kbi_utilities.adjoin_kbi_result(list(mt, pred, control_vars.$mapping_index_arg$.getDynamicValue(thread), col), symbol_function(EQUAL), UNPROVIDED);
                    if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                        utilities_macros.mapping_finished();
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_fort_wXo_expected_gafsP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXpredXargXisa = NIL;
            for (mtXpredXargXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXargXisa = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXpredXargXisa;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject pred = NIL;
                    SubLObject arg = NIL;
                    SubLObject v_isa = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    v_isa = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject spec_preds = remove(pred, genl_predicates.all_spec_preds_wrt_arg(pred, fort, arg, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            nl_result = cconcatenate(nl_result, new SubLObject[]{ format(NIL, $str_alt121$__every__s_is_expected_to_appear_, new SubLObject[]{ v_isa, arg, pred, mt }), NIL != spec_preds ? ((SubLObject) (format(NIL, $str_alt122$____candidate___specPreds_are__a, string_utilities.stringify_items(spec_preds, symbol_function(STR), $str_alt22$__, $str_alt53$_and_)))) : $str_alt50$ });
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt112);
                    }
                }
            }
            return nl_result;
        }
    }

    // defparameter
    public static final SubLSymbol $fort_wXo_assertions_results$ = makeSymbol("*FORT-W/O-ASSERTIONS-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXo_assertions_time$ = makeSymbol("*FORT-W/O-ASSERTIONS-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXo_assertions_count$ = makeSymbol("*FORT-W/O-ASSERTIONS-COUNT*");

    /**
     * test fort for having no significant (e.g., vs. bookkeeping) assertions
     */
    public static final SubLObject fort_wXo_assertionsP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw130$FORT_W_O_ASSERTIONS)) && (NIL != kbi_utilities.kbi_applies_toP($kw130$FORT_W_O_ASSERTIONS, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw130$FORT_W_O_ASSERTIONS);
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
                                            SubLObject _prev_bind_0_57 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_wXo_assertionsP(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_58, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_57, thread);
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
                    kbi_utilities.kbi_increment_time($kw130$FORT_W_O_ASSERTIONS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/O-ASSERTIONS applies to FORT
     */
    public static final SubLObject why_fort_wXo_assertionsP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw130$FORT_W_O_ASSERTIONS, fort)) {
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
                                        SubLObject _prev_bind_0_59 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_wXo_assertionsP(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_60, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_59, thread);
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
                                return list($kw130$FORT_W_O_ASSERTIONS, fort, data);
                            } else {
                                return list($kw130$FORT_W_O_ASSERTIONS, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXo_assertionsP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject fort_wXo_assertionP(SubLObject fort) {
        if (NIL != kbi_utilities.run_kbi_moduleP($kw130$FORT_W_O_ASSERTIONS)) {
            return makeBoolean(NIL == significant_assertionsP(kb_accessors.all_term_assertions(fort, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject kbi_fort_wXo_assertionsP(SubLObject fort) {
        if (NIL != fort_wXo_assertionP(fort)) {
            kbi_utilities.set_kbi_result(T);
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_nl_why_fort_wXo_assertionsP(SubLObject fort, SubLObject data) {
        return format(NIL, $str_alt132$_s_has_no_significant__e_g___non_, fort);
    }

    public static final SubLObject significant_assertionsP(SubLObject assertions) {
        {
            SubLObject significantP = NIL;
            if (NIL == significantP) {
                {
                    SubLObject csome_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != significantP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        significantP = significant_assertionP(assertion);
                    }
                }
            }
            return significantP;
        }
    }

    public static final SubLObject significant_assertionP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnf = assertions_high.assertion_cnf(assertion);
                SubLObject v_boolean = NIL;
                if (cnf.isCons()) {
                    {
                        SubLObject mt_var = assertions_high.assertion_mt(assertion);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                v_boolean = makeBoolean(((NIL == clauses.gaf_cnfP(cnf)) || (NIL != significant_literalsP(clauses.pos_lits(cnf)))) || (NIL != significant_literalsP(clauses.neg_lits(cnf))));
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return v_boolean;
            }
        }
    }

    public static final SubLObject significant_literalsP(SubLObject literals) {
        {
            SubLObject significantP = NIL;
            if (NIL == significantP) {
                {
                    SubLObject csome_list_var = literals;
                    SubLObject literal = NIL;
                    for (literal = csome_list_var.first(); !((NIL != significantP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , literal = csome_list_var.first()) {
                        significantP = significant_literalP(literal);
                    }
                }
            }
            return significantP;
        }
    }

    public static final SubLObject significant_literalP(SubLObject literal) {
        return significant_predicateP(el_utilities.literal_predicate(literal, UNPROVIDED));
    }

    public static final SubLObject significant_predicateP(SubLObject predicate) {
        if (NIL != fort_types_interface.predicateP(predicate)) {
            return makeBoolean(NIL == isa.isaP(predicate, $$BookkeepingPredicate, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $fort_wXmal_indexing_results$ = makeSymbol("*FORT-W/MAL-INDEXING-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXmal_indexing_time$ = makeSymbol("*FORT-W/MAL-INDEXING-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXmal_indexing_count$ = makeSymbol("*FORT-W/MAL-INDEXING-COUNT*");

    /**
     * test fort for indexing inappropriate assertions
     */
    public static final SubLObject fort_wXmal_indexingP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw140$FORT_W_MAL_INDEXING)) && (NIL != kbi_utilities.kbi_applies_toP($kw140$FORT_W_MAL_INDEXING, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw140$FORT_W_MAL_INDEXING);
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
                                            SubLObject _prev_bind_0_61 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_term_indexing_inappropriate_assertions(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_62, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_61, thread);
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
                    kbi_utilities.kbi_increment_time($kw140$FORT_W_MAL_INDEXING, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/MAL-INDEXING applies to FORT
     */
    public static final SubLObject why_fort_wXmal_indexingP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw140$FORT_W_MAL_INDEXING, fort)) {
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
                                        SubLObject _prev_bind_0_63 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_term_indexing_inappropriate_assertions(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_64, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_63, thread);
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
                                return list($kw140$FORT_W_MAL_INDEXING, fort, data);
                            } else {
                                return list($kw140$FORT_W_MAL_INDEXING, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXmal_indexingP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_fort_wXmal_indexingP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = data;
            SubLObject datum = NIL;
            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = datum.first();
                    if (pcase_var.eql($INAPPROPRIATE_ASSERTIONS)) {
                        {
                            SubLObject datum_65 = datum.rest();
                            SubLObject current = datum_65;
                            SubLObject arg = NIL;
                            SubLObject pred = NIL;
                            SubLObject mt = NIL;
                            SubLObject assertions = NIL;
                            destructuring_bind_must_consp(current, datum_65, $list_alt143);
                            arg = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum_65, $list_alt143);
                            pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum_65, $list_alt143);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum_65, $list_alt143);
                            assertions = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                nl_result = cconcatenate(nl_result, format(NIL, $str_alt144$_s_incorrectly_includes_via_index, new SubLObject[]{ fort, arg, NIL != pred ? ((SubLObject) (format(NIL, $str_alt145$_relation__s, pred))) : $str_alt50$, NIL != mt ? ((SubLObject) (format(NIL, $str_alt146$_mt__s, mt))) : $str_alt50$, string_utilities.stringify_items(assertions, STR, $str_alt147$_____s, UNPROVIDED) }));
                            } else {
                                cdestructuring_bind_error(datum_65, $list_alt143);
                            }
                        }
                    } else {
                        kbi_utilities.kbi_cerror(THREE_INTEGER, $$$continue_anyway, $str_alt149$unexpected_kbi_symbol____s, datum.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                nl_result = cconcatenate(nl_result, format(NIL, $str_alt150$__));
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_term_indexing_inappropriate_assertions(SubLObject v_term) {
        inappropriate_assertions(kb_accessors.all_term_assertions(v_term, UNPROVIDED), v_term, $SIMPLE, UNPROVIDED, UNPROVIDED);
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject inappropriate_assertions(SubLObject assertions, SubLObject v_term, SubLObject arg, SubLObject pred, SubLObject mt) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject inappropriate = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        if (NIL != inappropriate_assertionP(assertion, v_term, arg)) {
                            inappropriate = cons(assertion, inappropriate);
                            doneP = kbi_utilities.kbi_doneP(inappropriate);
                        }
                    }
                }
            }
            if (NIL != inappropriate) {
                kbi_utilities.add_kbi_result(list($INAPPROPRIATE_ASSERTIONS, arg, pred, mt, inappropriate));
            }
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject inappropriate_assertionP(SubLObject assertion, SubLObject v_term, SubLObject arg) {
        {
            SubLObject pcase_var = arg;
            if (pcase_var.eql($SIMPLE)) {
                return makeBoolean(!(v_term.eql(assertions_high.assertion_mt(assertion)) || (NIL != list_utilities.tree_find(v_term, assertions_high.assertion_formula(assertion), UNPROVIDED, UNPROVIDED))));
            } else {
                Errors.cerror($$$continue_anyway, $str_alt152$unexpected_index_symbol____s, arg);
            }
        }
        return NIL;
    }

    public static final SubLObject appropriate_gaf_cnfP(SubLObject cnf, SubLObject v_term, SubLObject pos) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            return makeBoolean((v_term.eql(nth(pos, clauses.pos_lits(cnf).first())) || v_term.eql(nth(pos, clauses.neg_lits(cnf).first()))) || (NIL != (NIL != el_utilities.tou_litP(clauses.pos_lits(cnf).first()) ? ((SubLObject) (eql(v_term, nth(pos, el_utilities.literal_arg2(clauses.pos_lits(cnf).first(), UNPROVIDED))))) : NIL)));
        }
        return NIL;
    }

    public static final SubLObject appropriate_rule_cnfP(SubLObject cnf, SubLObject v_term, SubLObject arg) {
        if (NIL == clauses.gaf_cnfP(cnf)) {
            {
                SubLObject pcase_var = arg;
                if (pcase_var.eql($NEG)) {
                    return appropriate_rule_litsP(clauses.neg_lits(cnf), v_term);
                } else
                    if (pcase_var.eql($POS)) {
                        return appropriate_rule_litsP(clauses.pos_lits(cnf), v_term);
                    } else {
                        Errors.cerror($$$continue_anyway, $str_alt152$unexpected_index_symbol____s, arg);
                    }

            }
        }
        return NIL;
    }

    public static final SubLObject appropriate_rule_litsP(SubLObject lits, SubLObject v_term) {
        if (NIL != fort_types_interface.predicateP(v_term)) {
            return subl_promotions.memberP(v_term, Mapping.mapcar(symbol_function(LITERAL_PREDICATE), lits), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != fort_types_interface.collectionP(v_term)) {
                return subl_promotions.memberP(v_term, Mapping.mapcar(symbol_function(THIRD), el_utilities.isa_lits(lits)), UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != fort_types_interface.non_predicate_functionP(v_term)) {
                    return subl_promotions.memberP(v_term, Mapping.mapcar(symbol_function(FIRST), Mapping.mapcar(symbol_function(THIRD), el_utilities.tou_lits(lits))), UNPROVIDED, UNPROVIDED);
                } else {
                    return list_utilities.tree_find(v_term, lits, UNPROVIDED, UNPROVIDED);
                }


    }

    // defparameter
    public static final SubLSymbol $fort_wXcycle_results$ = makeSymbol("*FORT-W/CYCLE-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXcycle_time$ = makeSymbol("*FORT-W/CYCLE-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXcycle_count$ = makeSymbol("*FORT-W/CYCLE-COUNT*");

    /**
     * test fort for cycles along transitive preds
     */
    public static final SubLObject fort_wXcycleP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw164$FORT_W_CYCLE)) && (NIL != kbi_utilities.kbi_applies_toP($kw164$FORT_W_CYCLE, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw164$FORT_W_CYCLE);
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
                                                        kbi_fort_wXcycle_in_mts(fort);
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
                    kbi_utilities.kbi_increment_time($kw164$FORT_W_CYCLE, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/CYCLE applies to FORT
     */
    public static final SubLObject why_fort_wXcycleP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw164$FORT_W_CYCLE, fort)) {
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
                                                    kbi_fort_wXcycle_in_mts(fort);
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
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw164$FORT_W_CYCLE, fort, data);
                            } else {
                                return list($kw164$FORT_W_CYCLE, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXcycleP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cycle_declared_wrtP(SubLObject pred, SubLObject cycle, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject notP = NIL;
            SubLObject ec_pred = kb_accessors.equivalence_class_pred_wrt(pred, mt);
            SubLObject nodes = NIL;
            SubLObject node1 = NIL;
            SubLObject node2 = NIL;
            for (nodes = cycle, node1 = nodes.first(), node2 = second(nodes); !((NIL != notP) || (NIL == node2)); nodes = nodes.rest() , node1 = nodes.first() , node2 = second(nodes)) {
                notP = makeBoolean(NIL == kb_accessors.equivalence_classP(ec_pred, node1, node2, mt));
            }
            return makeBoolean(NIL == notP);
        }
    }

    public static final SubLObject kbi_nl_why_fort_wXcycleP(SubLObject fort, SubLObject mt_pred_cycles) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = mt_pred_cycles;
            SubLObject mtXpredXcycle = NIL;
            for (mtXpredXcycle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXcycle = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXpredXcycle;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject pred = NIL;
                    SubLObject cycle = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt166);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt166);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt166);
                    cycle = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt167$__in__s___s_has_cyclic_path_along, new SubLObject[]{ mt, fort, pred, string_utilities.stringify_items(cycle, symbol_function(STR), $str_alt168$____, UNPROVIDED) }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt166);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_fort_wXcycle_in_mts(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_source$.currentBinding(thread);
                    try {
                        control_vars.$mapping_source$.bind(fort, thread);
                        try {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = $list_alt170;
                                    {
                                        SubLObject _prev_bind_0_70 = control_vars.$mapping_index_arg$.currentBinding(thread);
                                        try {
                                            control_vars.$mapping_index_arg$.bind(NIL, thread);
                                            for (control_vars.$mapping_index_arg$.setDynamicValue(csome_list_var.first(), thread); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , control_vars.$mapping_index_arg$.setDynamicValue(csome_list_var.first(), thread)) {
                                                kb_mapping.map_gaf_arg_index(symbol_function(KBI_FORT_GATHER_CYCLES), control_vars.$mapping_source$.getDynamicValue(thread), control_vars.$mapping_index_arg$.getDynamicValue(thread), NIL, $TRUE, UNPROVIDED);
                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                            }
                                        } finally {
                                            control_vars.$mapping_index_arg$.rebind(_prev_bind_0_70, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    clrhash(kbi_vars.$kbi_predicate_table$.getDynamicValue(thread));
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_71, thread);
                                }
                            }
                        }
                    } finally {
                        control_vars.$mapping_source$.rebind(_prev_bind_0, thread);
                    }
                }
                return kbi_utilities.kbi_result();
            }
        }
    }

    public static final SubLObject kbi_fort_gather_cycles(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject pred = assertions_high.gaf_arg0(assertion);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    {
                        SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                        try {
                            gt_vars.$gt_pred$.bind(pred, thread);
                            if (NIL == kbi_utilities.kbi_check_predicate_doneP(pred)) {
                                kbi_utilities.kbi_check_predicate_done(pred);
                                if (NIL != kb_accessors.binary_predicateP(pred)) {
                                    if (NIL == sbhl_module_utilities.sbhl_predicate_p(pred)) {
                                        if (NIL == kb_accessors.irreflexive_predicateP(pred)) {
                                            if (NIL != gt_methods.gt_cyclesP(pred, control_vars.$mapping_source$.getDynamicValue(thread), mt)) {
                                                {
                                                    SubLObject path = gt_methods.gt_any_superior_path(pred, control_vars.$mapping_source$.getDynamicValue(thread), control_vars.$mapping_source$.getDynamicValue(thread), mt);
                                                    if (NIL == cycle_declared_wrtP(pred, path, mt)) {
                                                        kbi_utilities.add_kbi_result(list(mt, pred, gt_methods.gt_any_superior_path(pred, control_vars.$mapping_source$.getDynamicValue(thread), control_vars.$mapping_source$.getDynamicValue(thread), mt)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    // defparameter
    public static final SubLSymbol $fort_wXmal_cycle_results$ = makeSymbol("*FORT-W/MAL-CYCLE-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXmal_cycle_time$ = makeSymbol("*FORT-W/MAL-CYCLE-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXmal_cycle_count$ = makeSymbol("*FORT-W/MAL-CYCLE-COUNT*");

    /**
     * test fort for participating in invalid cycles (e.g., irreflexivity violations)
     */
    public static final SubLObject fort_wXmal_cycleP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw177$FORT_W_MAL_CYCLE)) && (NIL != kbi_utilities.kbi_applies_toP($kw177$FORT_W_MAL_CYCLE, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw177$FORT_W_MAL_CYCLE);
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
                                            SubLObject _prev_bind_0_72 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_wXmal_cycle_in_mts(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_73, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_72, thread);
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
                    kbi_utilities.kbi_increment_time($kw177$FORT_W_MAL_CYCLE, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/MAL-CYCLE applies to FORT
     */
    public static final SubLObject why_fort_wXmal_cycleP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw177$FORT_W_MAL_CYCLE, fort)) {
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
                                        SubLObject _prev_bind_0_74 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_wXmal_cycle_in_mts(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_75, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_74, thread);
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
                                return list($kw177$FORT_W_MAL_CYCLE, fort, data);
                            } else {
                                return list($kw177$FORT_W_MAL_CYCLE, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXmal_cycleP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_fort_wXmal_cycleP(SubLObject fort, SubLObject mt_pred_cycles) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = mt_pred_cycles;
            SubLObject mtXpredXcycle = NIL;
            for (mtXpredXcycle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXcycle = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXpredXcycle;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject pred = NIL;
                    SubLObject cycle = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt166);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt166);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt166);
                    cycle = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt179$__in__s___s_has_invalid_cycle_pat, new SubLObject[]{ mt, fort, pred, string_utilities.stringify_items(cycle, symbol_function(STR), $str_alt168$____, UNPROVIDED) }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt166);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_fort_wXmal_cycle_in_mts(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_source$.currentBinding(thread);
                    try {
                        control_vars.$mapping_source$.bind(fort, thread);
                        try {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = $list_alt170;
                                    {
                                        SubLObject _prev_bind_0_76 = control_vars.$mapping_index_arg$.currentBinding(thread);
                                        try {
                                            control_vars.$mapping_index_arg$.bind(NIL, thread);
                                            for (control_vars.$mapping_index_arg$.setDynamicValue(csome_list_var.first(), thread); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , control_vars.$mapping_index_arg$.setDynamicValue(csome_list_var.first(), thread)) {
                                                kb_mapping.map_gaf_arg_index(symbol_function(KBI_FORT_GATHER_MAL_CYCLES), control_vars.$mapping_source$.getDynamicValue(thread), control_vars.$mapping_index_arg$.getDynamicValue(thread), NIL, $TRUE, UNPROVIDED);
                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                            }
                                        } finally {
                                            control_vars.$mapping_index_arg$.rebind(_prev_bind_0_76, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    clrhash(kbi_vars.$kbi_predicate_table$.getDynamicValue(thread));
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_77, thread);
                                }
                            }
                        }
                    } finally {
                        control_vars.$mapping_source$.rebind(_prev_bind_0, thread);
                    }
                }
                return kbi_utilities.kbi_result();
            }
        }
    }

    public static final SubLObject kbi_fort_gather_mal_cycles(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject pred = assertions_high.gaf_arg0(assertion);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    if (NIL == kbi_utilities.kbi_check_predicate_doneP(pred)) {
                        kbi_utilities.kbi_check_predicate_done(pred);
                        if (NIL != kb_accessors.binary_predicateP(pred)) {
                            if (NIL == sbhl_module_utilities.sbhl_predicate_p(pred)) {
                                if (NIL != kb_accessors.irreflexive_predicateP(pred)) {
                                    if (NIL != gt_methods.gt_cyclesP(pred, control_vars.$mapping_source$.getDynamicValue(thread), mt)) {
                                        kbi_utilities.add_kbi_result(list(mt, pred, gt_methods.gt_any_superior_path(pred, control_vars.$mapping_source$.getDynamicValue(thread), control_vars.$mapping_source$.getDynamicValue(thread), mt)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    // defparameter
    public static final SubLSymbol $fort_wXo_superiors_results$ = makeSymbol("*FORT-W/O-SUPERIORS-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXo_superiors_time$ = makeSymbol("*FORT-W/O-SUPERIORS-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXo_superiors_count$ = makeSymbol("*FORT-W/O-SUPERIORS-COUNT*");

    /**
     * test fort for no superiors along relevant transitive preds
     */
    public static final SubLObject fort_wXo_superiorsP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw187$FORT_W_O_SUPERIORS)) && (NIL != kbi_utilities.kbi_applies_toP($kw187$FORT_W_O_SUPERIORS, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw187$FORT_W_O_SUPERIORS);
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
                                            SubLObject _prev_bind_0_78 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_wXo_superiors_in_mts(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_79, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_78, thread);
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
                    kbi_utilities.kbi_increment_time($kw187$FORT_W_O_SUPERIORS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/O-SUPERIORS applies to FORT
     */
    public static final SubLObject why_fort_wXo_superiorsP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw187$FORT_W_O_SUPERIORS, fort)) {
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
                                        SubLObject _prev_bind_0_80 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_wXo_superiors_in_mts(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_81, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_80, thread);
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
                                return list($kw187$FORT_W_O_SUPERIORS, fort, data);
                            } else {
                                return list($kw187$FORT_W_O_SUPERIORS, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXo_superiorsP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_fort_wXo_superiorsP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = data;
            SubLObject predXmt = NIL;
            for (predXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predXmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = predXmt;
                    SubLObject current = datum;
                    SubLObject pred = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt189);
                    pred = current.first();
                    current = current.rest();
                    mt = current;
                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt190$_s_has_no__s_superiors__in_mt__a_, new SubLObject[]{ fort, pred, mt }));
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_fort_wXo_superiors_in_mts(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = $list_alt170;
                                SubLObject arg = NIL;
                                for (arg = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                    {
                                        SubLObject other_arg = (arg.numE(TWO_INTEGER)) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                                        if (NIL == doneP) {
                                            {
                                                SubLObject csome_list_var_82 = predXmts_of_arg_pred_isa(v_term, $$TransitiveBinaryPredicate, arg, UNPROVIDED);
                                                SubLObject predXmt = NIL;
                                                for (predXmt = csome_list_var_82.first(); !((NIL != doneP) || (NIL == csome_list_var_82)); csome_list_var_82 = csome_list_var_82.rest() , predXmt = csome_list_var_82.first()) {
                                                    {
                                                        SubLObject datum = predXmt;
                                                        SubLObject current = datum;
                                                        SubLObject pred = NIL;
                                                        SubLObject mt = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt189);
                                                        pred = current.first();
                                                        current = current.rest();
                                                        mt = current;
                                                        if (other_arg.numE(kb_accessors.fan_out_arg(pred, mt))) {
                                                            if (NIL == kb_mapping_utilities.fpred_value_in_relevant_mts(v_term, pred, mt, other_arg, arg, UNPROVIDED)) {
                                                                if (NIL == kb_accessors.root_wrtP(v_term, pred, mt)) {
                                                                    kbi_utilities.add_kbi_result(predXmt);
                                                                }
                                                            }
                                                        }
                                                    }
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
                return kbi_utilities.kbi_result();
            }
        }
    }

    public static final SubLObject predXmts_of_arg_pred_isa(SubLObject v_term, SubLObject pred_type, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kbi_utilities.$mapping_reference_data$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
                    SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                    try {
                        kbi_utilities.$mapping_reference_data$.bind(pred_type, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        pred_relevance_macros.$relevant_pred_function$.bind(symbol_function($sym194$RELEVANT_PRED_ISA_PRED_TYPE_), thread);
                        kb_mapping.map_gaf_arg_index(symbol_function(GATHER_MUFFET), v_term, index_arg, NIL, truth, UNPROVIDED);
                        result = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
                        control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
                        kbi_utilities.$mapping_reference_data$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject gather_muffet(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject predicate = assertions_high.gaf_predicate(assertion);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    SubLObject item_var = cons(predicate, mt);
                    if (NIL == member(item_var, control_vars.$mapping_answer$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        control_vars.$mapping_answer$.setDynamicValue(cons(item_var, control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return control_vars.$mapping_answer$.getDynamicValue(thread);
        }
    }

    public static final SubLObject relevant_pred_isa_pred_typeP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return isa.isaP(predicate, kbi_utilities.$mapping_reference_data$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    // defparameter
    public static final SubLSymbol $fort_wXo_inferiors_results$ = makeSymbol("*FORT-W/O-INFERIORS-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXo_inferiors_time$ = makeSymbol("*FORT-W/O-INFERIORS-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXo_inferiors_count$ = makeSymbol("*FORT-W/O-INFERIORS-COUNT*");

    /**
     * test fort for no inferiors along relevant transitive preds
     */
    public static final SubLObject fort_wXo_inferiorsP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw202$FORT_W_O_INFERIORS)) && (NIL != kbi_utilities.kbi_applies_toP($kw202$FORT_W_O_INFERIORS, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw202$FORT_W_O_INFERIORS);
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
                                            SubLObject _prev_bind_0_83 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_wXo_inferiors_in_mts(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_84, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_83, thread);
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
                    kbi_utilities.kbi_increment_time($kw202$FORT_W_O_INFERIORS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/O-INFERIORS applies to FORT
     */
    public static final SubLObject why_fort_wXo_inferiorsP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw202$FORT_W_O_INFERIORS, fort)) {
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
                                        SubLObject _prev_bind_0_85 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_wXo_inferiors_in_mts(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_86, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_85, thread);
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
                                return list($kw202$FORT_W_O_INFERIORS, fort, data);
                            } else {
                                return list($kw202$FORT_W_O_INFERIORS, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXo_inferiorsP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_fort_wXo_inferiorsP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = data;
            SubLObject predXmt = NIL;
            for (predXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predXmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = predXmt;
                    SubLObject current = datum;
                    SubLObject pred = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt189);
                    pred = current.first();
                    current = current.rest();
                    mt = current;
                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt204$_s_has_no__s_inferiors__in_mt__a_, new SubLObject[]{ fort, pred, mt }));
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_fort_wXo_inferiors_in_mts(SubLObject v_term) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = $list_alt170;
                    SubLObject arg = NIL;
                    for (arg = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                        {
                            SubLObject other_arg = (arg.numE(TWO_INTEGER)) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var_87 = predXmts_of_arg_pred_isa(v_term, $$TransitiveBinaryPredicate, arg, UNPROVIDED);
                                    SubLObject predXmt = NIL;
                                    for (predXmt = csome_list_var_87.first(); !((NIL != doneP) || (NIL == csome_list_var_87)); csome_list_var_87 = csome_list_var_87.rest() , predXmt = csome_list_var_87.first()) {
                                        {
                                            SubLObject datum = predXmt;
                                            SubLObject current = datum;
                                            SubLObject pred = NIL;
                                            SubLObject mt = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt189);
                                            pred = current.first();
                                            current = current.rest();
                                            mt = current;
                                            if (arg.numE(kb_accessors.fan_out_arg(pred, mt))) {
                                                if (NIL == kb_mapping_utilities.fpred_value_in_relevant_mts(v_term, pred, mt, other_arg, arg, UNPROVIDED)) {
                                                    if (NIL == kb_accessors.leaf_wrtP(v_term, pred, mt)) {
                                                        kbi_utilities.add_kbi_result(predXmt);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * diagnose all assertions indexed by fort
     */
    public static final SubLObject fort_assertions_diagnosesP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($FORT_ASSERTIONS_DIAGNOSES)) && (NIL != kbi_utilities.kbi_applies_toP($FORT_ASSERTIONS_DIAGNOSES, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($FORT_ASSERTIONS_DIAGNOSES);
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
                                            SubLObject _prev_bind_0_88 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_assertions_diagnoses(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_89 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_89, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_88, thread);
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
                    kbi_utilities.kbi_increment_time($FORT_ASSERTIONS_DIAGNOSES, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-ASSERTIONS-DIAGNOSES applies to FORT
     */
    public static final SubLObject why_fort_assertions_diagnosesP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($FORT_ASSERTIONS_DIAGNOSES, fort)) {
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
                                        SubLObject _prev_bind_0_90 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_assertions_diagnoses(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_91, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_90, thread);
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
                                return list($FORT_ASSERTIONS_DIAGNOSES, fort, data);
                            } else {
                                return list($FORT_ASSERTIONS_DIAGNOSES, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_assertions_diagnosesP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_fort_assertions_diagnosesP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt213$___s_assertion_diagnostics_, fort);
            SubLObject cdolist_list_var = data;
            SubLObject assertionXdiagnoses = NIL;
            for (assertionXdiagnoses = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertionXdiagnoses = cdolist_list_var.first()) {
                {
                    SubLObject datum = assertionXdiagnoses;
                    SubLObject current = datum;
                    SubLObject assertion = NIL;
                    SubLObject diagnoses = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt214);
                    assertion = current.first();
                    current = current.rest();
                    diagnoses = current;
                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt215$_____s______has_diagnosis__s, assertion, diagnoses));
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_fort_assertions_diagnoses(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = kbi_all_term_assertions_wrt(fort);
                        SubLObject assertion = NIL;
                        for (assertion = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                            {
                                SubLObject diagnoses = kbi_assertion.cached_diagnose_assertion(assertion);
                                if (NIL != diagnoses) {
                                    kbi_utilities.add_kbi_result(cons(assertion, diagnoses));
                                    if (NIL == kbi_vars.$kbi_caching_findingsP$.getDynamicValue(thread)) {
                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    /**
     * nil or a collection whose instances will be candidates for triggering assertions diagnostics
     */
    // defparameter
    private static final SubLSymbol $kbi_distribute_assertions_to_single_fort_of_type$ = makeSymbol("*KBI-DISTRIBUTE-ASSERTIONS-TO-SINGLE-FORT-OF-TYPE*");

    /**
     * when non-nil, assertions will be triggered only for the constant indexing it having the greatest id
     */
    // defparameter
    private static final SubLSymbol $kbi_distribute_assertions_to_single_fortP$ = makeSymbol("*KBI-DISTRIBUTE-ASSERTIONS-TO-SINGLE-FORT?*");

    public static final SubLObject kbi_all_term_assertions_wrt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertions = kb_accessors.all_term_assertions(fort, T);
                SubLObject result = NIL;
                if (NIL != $kbi_distribute_assertions_to_single_fortP$.getDynamicValue(thread)) {
                    {
                        SubLObject cdolist_list_var = assertions;
                        SubLObject assertion = NIL;
                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                            {
                                SubLObject winner = NIL;
                                SubLObject mt = assertions_high.assertion_mt(assertion);
                                SubLObject cdolist_list_var_92 = list_utilities.tree_gather(FULLY_INDEXED_TERM_P, assertions_high.assertion_formula(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject v_term = NIL;
                                for (v_term = cdolist_list_var_92.first(); NIL != cdolist_list_var_92; cdolist_list_var_92 = cdolist_list_var_92.rest() , v_term = cdolist_list_var_92.first()) {
                                    if (NIL != forts.fort_p(v_term)) {
                                        if ((NIL == $kbi_distribute_assertions_to_single_fort_of_type$.getDynamicValue(thread)) || (NIL != isa.isaP(v_term, $kbi_distribute_assertions_to_single_fort_of_type$.getDynamicValue(thread), mt, UNPROVIDED))) {
                                            if ((NIL != winner) || (NIL != kb_utilities.term_L(v_term, winner, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                winner = v_term;
                                            }
                                        }
                                    }
                                }
                                if ((NIL == winner) || fort.eql(winner)) {
                                    result = cons(assertion, result);
                                }
                            }
                        }
                    }
                } else {
                    result = assertions;
                }
                return result;
            }
        }
    }

    // defparameter
    public static final SubLSymbol $fort_isa_sbhlXkb_mismatch_results$ = makeSymbol("*FORT-ISA-SBHL/KB-MISMATCH-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_isa_sbhlXkb_mismatch_time$ = makeSymbol("*FORT-ISA-SBHL/KB-MISMATCH-TIME*");

    // defparameter
    public static final SubLSymbol $fort_isa_sbhlXkb_mismatch_count$ = makeSymbol("*FORT-ISA-SBHL/KB-MISMATCH-COUNT*");

    /**
     * test FORT for mismatches between sbhl type and kb #$isa assertions
     */
    public static final SubLObject fort_isa_sbhlXkb_mismatchP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw223$FORT_ISA_SBHL_KB_MISMATCH)) && (NIL != kbi_utilities.kbi_applies_toP($kw223$FORT_ISA_SBHL_KB_MISMATCH, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw223$FORT_ISA_SBHL_KB_MISMATCH);
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
                                            SubLObject _prev_bind_0_93 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_isa_sbhlXkb_mismatchP(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw223$FORT_ISA_SBHL_KB_MISMATCH, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-ISA-SBHL/KB-MISMATCH applies to FORT
     */
    public static final SubLObject why_fort_isa_sbhlXkb_mismatchP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw223$FORT_ISA_SBHL_KB_MISMATCH, fort)) {
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
                                        SubLObject _prev_bind_0_95 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_fort_isa_sbhlXkb_mismatchP(fort);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_96 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw223$FORT_ISA_SBHL_KB_MISMATCH, fort, data);
                            } else {
                                return list($kw223$FORT_ISA_SBHL_KB_MISMATCH, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_isa_sbhlXkb_mismatchP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_fort_isa_sbhlXkb_mismatchP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = data;
            SubLObject mismatchXisaXmtXtruth = NIL;
            for (mismatchXisaXmtXtruth = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mismatchXisaXmtXtruth = cdolist_list_var.first()) {
                {
                    SubLObject datum = mismatchXisaXmtXtruth;
                    SubLObject current = datum;
                    SubLObject mismatch = NIL;
                    SubLObject v_isa = NIL;
                    SubLObject mt = NIL;
                    SubLObject truth = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt225);
                    mismatch = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt225);
                    v_isa = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt225);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt225);
                    truth = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject formula = NIL;
                            SubLObject assignment = NIL;
                            SubLObject con = NIL;
                            {
                                SubLObject pcase_var = truth;
                                if (pcase_var.eql($TRUE)) {
                                    formula = format(NIL, $str_alt226$___isa__s__s_, fort, v_isa);
                                } else
                                    if (pcase_var.eql($FALSE)) {
                                        formula = format(NIL, $str_alt228$___not____isa__s__s__, fort, v_isa);
                                    }

                            }
                            {
                                SubLObject pcase_var = mismatch;
                                if (pcase_var.eql($kw229$SBHL_KB_)) {
                                    assignment = $$$true_in_kb_but_not_sbhl;
                                } else
                                    if (pcase_var.eql($kw231$SBHL_KB_)) {
                                        assignment = $$$true_in_sbhl_but_not_kb;
                                    }

                            }
                            if (mismatch.eql($kw229$SBHL_KB_)) {
                                {
                                    SubLObject pcase_var = truth;
                                    if (pcase_var.eql($TRUE)) {
                                        con = kbi_utilities.kbi_why_not_isaP(fort, v_isa, mt);
                                    } else
                                        if (pcase_var.eql($FALSE)) {
                                            con = isa.why_isaP(fort, v_isa, mt, UNPROVIDED, UNPROVIDED);
                                        }

                                }
                            }
                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt233$_____ist__s__a___a, new SubLObject[]{ mt, formula, assignment }));
                            if (NIL != con) {
                                nl_result = cconcatenate(nl_result, format(NIL, $str_alt234$____con_argument________a, string_utilities.stringify_items(con, STR, $str_alt235$______, UNPROVIDED)));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt225);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_fort_isa_sbhlXkb_mismatchP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = isa.isa_mts(fort);
                        SubLObject mt = NIL;
                        for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                    mt_relevance_macros.$mt$.bind(mt, thread);
                                    fort_isa_sbhlXkb_mismatch_in_mtP(fort, isa.asserted_isa(fort, NIL), mt);
                                    if (NIL == kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                        fort_not_isa_sbhlXkb_mismatch_in_mtP(fort, isa.asserted_not_isa(fort, NIL), mt);
                                    }
                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return kbi_utilities.kbi_result();
            }
        }
    }

    public static final SubLObject fort_isa_sbhlXkb_mismatch_in_mtP(SubLObject fort, SubLObject asserted_isa, SubLObject mt) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = asserted_isa;
                    SubLObject v_isa = NIL;
                    for (v_isa = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_isa = csome_list_var.first()) {
                        if (NIL == isa.isaP(fort, v_isa, mt, UNPROVIDED)) {
                            kbi_utilities.add_kbi_result(list($kw229$SBHL_KB_, v_isa, mt, $TRUE));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.isa(fort, UNPROVIDED, UNPROVIDED);
                    SubLObject v_isa = NIL;
                    for (v_isa = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_isa = csome_list_var.first()) {
                        if (NIL == subl_promotions.memberP(v_isa, asserted_isa, UNPROVIDED, UNPROVIDED)) {
                            kbi_utilities.add_kbi_result(list($kw231$SBHL_KB_, v_isa, mt, $TRUE));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject fort_not_isa_sbhlXkb_mismatch_in_mtP(SubLObject fort, SubLObject asserted_not_isa, SubLObject mt) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = asserted_not_isa;
                    SubLObject not_isa = NIL;
                    for (not_isa = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , not_isa = csome_list_var.first()) {
                        if (NIL == isa.not_isaP(fort, not_isa, UNPROVIDED, UNPROVIDED)) {
                            kbi_utilities.add_kbi_result(list($kw229$SBHL_KB_, not_isa, mt, $FALSE));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.not_isa(fort, UNPROVIDED, UNPROVIDED);
                    SubLObject not_isa = NIL;
                    for (not_isa = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , not_isa = csome_list_var.first()) {
                        if (NIL == subl_promotions.memberP(not_isa, asserted_not_isa, UNPROVIDED, UNPROVIDED)) {
                            kbi_utilities.add_kbi_result(list($kw231$SBHL_KB_, not_isa, mt, $FALSE));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $fort_wXisa_inconsistency_results$ = makeSymbol("*FORT-W/ISA-INCONSISTENCY-RESULTS*");

    // defparameter
    public static final SubLSymbol $fort_wXisa_inconsistency_time$ = makeSymbol("*FORT-W/ISA-INCONSISTENCY-TIME*");

    // defparameter
    public static final SubLSymbol $fort_wXisa_inconsistency_count$ = makeSymbol("*FORT-W/ISA-INCONSISTENCY-COUNT*");

    /**
     * test FORT for inconsistencies among #$isa data
     */
    public static final SubLObject fort_wXisa_inconsistencyP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw243$FORT_W_ISA_INCONSISTENCY)) && (NIL != kbi_utilities.kbi_applies_toP($kw243$FORT_W_ISA_INCONSISTENCY, fort))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw243$FORT_W_ISA_INCONSISTENCY);
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
                                            SubLObject _prev_bind_0_97 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_fort_wXisa_inconsistencyP(fort);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_98 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw243$FORT_W_ISA_INCONSISTENCY, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FORT-W/ISA-INCONSISTENCY applies to FORT
     */
    public static final SubLObject why_fort_wXisa_inconsistencyP(SubLObject fort, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw243$FORT_W_ISA_INCONSISTENCY, fort)) {
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
                                                    kbi_fort_wXisa_inconsistencyP(fort);
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
                                return list($kw243$FORT_W_ISA_INCONSISTENCY, fort, data);
                            } else {
                                return list($kw243$FORT_W_ISA_INCONSISTENCY, fort);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_fort_wXisa_inconsistencyP(fort, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_fort_wXisa_inconsistencyP(SubLObject fort, SubLObject data) {
        {
            SubLObject nl_result = $str_alt50$;
            SubLObject cdolist_list_var = data;
            SubLObject inconsistencyXmt = NIL;
            for (inconsistencyXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inconsistencyXmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = inconsistencyXmt;
                    SubLObject current = datum;
                    SubLObject inconsistency = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt245);
                    inconsistency = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt245);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pro = isa.why_isaP(fort, inconsistency, mt, UNPROVIDED, UNPROVIDED);
                            SubLObject con = kbi_utilities.kbi_why_not_isaP(fort, inconsistency, mt);
                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt246$__isa_module_holds_that__s_____bo, new SubLObject[]{ fort, inconsistency, mt }));
                            if (NIL != pro) {
                                nl_result = cconcatenate(nl_result, format(NIL, $str_alt247$____pro_argument________a, string_utilities.stringify_items(pro, STR, $str_alt235$______, UNPROVIDED)));
                            }
                            if (NIL != con) {
                                nl_result = cconcatenate(nl_result, format(NIL, $str_alt234$____con_argument________a, string_utilities.stringify_items(con, STR, $str_alt235$______, UNPROVIDED)));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt245);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_fort_wXisa_inconsistencyP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = isa.isa_mts(fort);
                        SubLObject mt = NIL;
                        for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                            {
                                SubLObject mt_isa = NIL;
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        mt_isa = isa.min_isa(fort, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var_101 = mt_isa;
                                        SubLObject v_isa = NIL;
                                        for (v_isa = csome_list_var_101.first(); !((NIL != doneP) || (NIL == csome_list_var_101)); csome_list_var_101 = csome_list_var_101.rest() , v_isa = csome_list_var_101.first()) {
                                            if (NIL != isa.not_isaP(fort, v_isa, mt, UNPROVIDED)) {
                                                kbi_utilities.add_kbi_result(list(v_isa, mt));
                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return kbi_utilities.kbi_result();
            }
        }
    }

    public static final SubLObject declare_kbi_fort_file() {
        declareFunction("fort_diagnostics", "FORT-DIAGNOSTICS", 0, 2, false);
        declareFunction("fort_diagnostics_wrt", "FORT-DIAGNOSTICS-WRT", 1, 2, false);
        declareFunction("forts_diagnostics_wrt", "FORTS-DIAGNOSTICS-WRT", 2, 2, false);
        declareFunction("forts_diagnostics", "FORTS-DIAGNOSTICS", 1, 2, false);
        declareFunction("fort_diagnostics_int", "FORT-DIAGNOSTICS-INT", 0, 2, false);
        declareFunction("resume_fort_diagnostics", "RESUME-FORT-DIAGNOSTICS", 0, 2, false);
        declareFunction("resume_forts_diagnostics", "RESUME-FORTS-DIAGNOSTICS", 1, 2, false);
        declareFunction("diagnose_constant", "DIAGNOSE-CONSTANT", 1, 0, false);
        declareFunction("diagnose_fort", "DIAGNOSE-FORT", 1, 0, false);
        declareFunction("diagnose_fort_int", "DIAGNOSE-FORT-INT", 1, 0, false);
        declareFunction("fort_releasedP", "FORT-RELEASED?", 1, 0, false);
        declareFunction("why_fort_releasedP", "WHY-FORT-RELEASED?", 1, 1, false);
        declareFunction("kbi_fort_releasedP", "KBI-FORT-RELEASED?", 1, 0, false);
        declareFunction("kbi_nl_why_fort_releasedP", "KBI-NL-WHY-FORT-RELEASED?", 2, 0, false);
        declareFunction("kbi_fort_invalidP", "KBI-FORT-INVALID?", 1, 0, false);
        declareFunction("why_fort_invalidP", "WHY-FORT-INVALID?", 1, 1, false);
        declareFunction("kbi_fort_invalid_intP", "KBI-FORT-INVALID-INT?", 1, 0, false);
        declareFunction("kbi_nl_why_fort_invalidP", "KBI-NL-WHY-FORT-INVALID?", 1, 1, false);
        declareFunction("malformed_sbhl_linksP", "MALFORMED-SBHL-LINKS?", 1, 0, false);
        declareFunction("why_fort_wXmalformed_sbhl_linksP", "WHY-FORT-W/MALFORMED-SBHL-LINKS?", 1, 1, false);
        declareFunction("kbi_malformed_sbhl_linksP", "KBI-MALFORMED-SBHL-LINKS?", 1, 0, false);
        declareFunction("kbi_nl_why_fort_wXmalformed_sbhl_linksP", "KBI-NL-WHY-FORT-W/MALFORMED-SBHL-LINKS?", 2, 0, false);
        declareFunction("fort_wXunknown_typeP", "FORT-W/UNKNOWN-TYPE?", 1, 0, false);
        declareFunction("why_fort_wXunknown_typeP", "WHY-FORT-W/UNKNOWN-TYPE?", 1, 1, false);
        declareFunction("kbi_fort_wXunknown_type", "KBI-FORT-W/UNKNOWN-TYPE", 1, 0, false);
        declareFunction("kbi_nl_why_fort_wXunknown_typeP", "KBI-NL-WHY-FORT-W/UNKNOWN-TYPE?", 2, 0, false);
        declareFunction("fort_wXmal_typesP", "FORT-W/MAL-TYPES?", 1, 0, false);
        declareFunction("why_fort_wXmal_typesP", "WHY-FORT-W/MAL-TYPES?", 1, 1, false);
        declareFunction("kbi_fort_mal_types", "KBI-FORT-MAL-TYPES", 1, 0, false);
        declareFunction("kbi_nl_why_fort_wXmal_typesP", "KBI-NL-WHY-FORT-W/MAL-TYPES?", 2, 0, false);
        declareFunction("fort_wXo_isaP", "FORT-W/O-ISA?", 1, 0, false);
        declareFunction("why_fort_wXo_isaP", "WHY-FORT-W/O-ISA?", 1, 1, false);
        declareFunction("kbi_fort_wXo_isa_in_mts", "KBI-FORT-W/O-ISA-IN-MTS", 1, 0, false);
        declareFunction("fort_non_excepted_assertion_wXo_isa_in_mt", "FORT-NON-EXCEPTED-ASSERTION-W/O-ISA-IN-MT", 2, 0, false);
        declareFunction("fort_wXo_isa_in_mt_exceptionP", "FORT-W/O-ISA-IN-MT-EXCEPTION?", 2, 0, false);
        declareFunction("kbi_nl_why_fort_wXo_isaP", "KBI-NL-WHY-FORT-W/O-ISA?", 2, 0, false);
        declareFunction("fort_missing_isa_via_defnP", "FORT-MISSING-ISA-VIA-DEFN?", 1, 0, false);
        declareFunction("why_fort_missing_isa_via_defnP", "WHY-FORT-MISSING-ISA-VIA-DEFN?", 1, 1, false);
        declareFunction("kbi_fort_missing_isa_via_defn_in_mts", "KBI-FORT-MISSING-ISA-VIA-DEFN-IN-MTS", 1, 0, false);
        declareFunction("kbi_gather_admitting_colXmt", "KBI-GATHER-ADMITTING-COL.MT", 1, 0, false);
        declareFunction("kbi_nl_why_fort_missing_isa_via_defnP", "KBI-NL-WHY-FORT-MISSING-ISA-VIA-DEFN?", 2, 0, false);
        declareFunction("fort_violating_isa_defnP", "FORT-VIOLATING-ISA-DEFN?", 1, 0, false);
        declareFunction("why_fort_violating_isa_defnP", "WHY-FORT-VIOLATING-ISA-DEFN?", 1, 1, false);
        declareFunction("kbi_fort_violating_isa_defn_in_mts", "KBI-FORT-VIOLATING-ISA-DEFN-IN-MTS", 1, 0, false);
        declareFunction("kbi_nl_why_fort_violating_isa_defnP", "KBI-NL-WHY-FORT-VIOLATING-ISA-DEFN?", 2, 0, false);
        declareFunction("fort_wXo_expected_gafsP", "FORT-W/O-EXPECTED-GAFS?", 1, 0, false);
        declareFunction("why_fort_wXo_expected_gafsP", "WHY-FORT-W/O-EXPECTED-GAFS?", 1, 1, false);
        declareFunction("tell_me_more_fort", "TELL-ME-MORE-FORT", 1, 1, false);
        declareFunction("best_gaf_argn_isa", "BEST-GAF-ARGN-ISA", 2, 1, false);
        declareFunction("kbi_fort_wXo_expected_gafs_in_mts", "KBI-FORT-W/O-EXPECTED-GAFS-IN-MTS", 1, 1, false);
        declareFunction("gather_missing_expected_preds_via_col", "GATHER-MISSING-EXPECTED-PREDS-VIA-COL", 1, 0, false);
        declareFunction("gather_missing_expected_preds", "GATHER-MISSING-EXPECTED-PREDS", 1, 0, false);
        declareFunction("kbi_nl_why_fort_wXo_expected_gafsP", "KBI-NL-WHY-FORT-W/O-EXPECTED-GAFS?", 2, 0, false);
        declareFunction("fort_wXo_assertionsP", "FORT-W/O-ASSERTIONS?", 1, 0, false);
        declareFunction("why_fort_wXo_assertionsP", "WHY-FORT-W/O-ASSERTIONS?", 1, 1, false);
        declareFunction("fort_wXo_assertionP", "FORT-W/O-ASSERTION?", 1, 0, false);
        declareFunction("kbi_fort_wXo_assertionsP", "KBI-FORT-W/O-ASSERTIONS?", 1, 0, false);
        declareFunction("kbi_nl_why_fort_wXo_assertionsP", "KBI-NL-WHY-FORT-W/O-ASSERTIONS?", 2, 0, false);
        declareFunction("significant_assertionsP", "SIGNIFICANT-ASSERTIONS?", 1, 0, false);
        declareFunction("significant_assertionP", "SIGNIFICANT-ASSERTION?", 1, 0, false);
        declareFunction("significant_literalsP", "SIGNIFICANT-LITERALS?", 1, 0, false);
        declareFunction("significant_literalP", "SIGNIFICANT-LITERAL?", 1, 0, false);
        declareFunction("significant_predicateP", "SIGNIFICANT-PREDICATE?", 1, 0, false);
        declareFunction("fort_wXmal_indexingP", "FORT-W/MAL-INDEXING?", 1, 0, false);
        declareFunction("why_fort_wXmal_indexingP", "WHY-FORT-W/MAL-INDEXING?", 1, 1, false);
        declareFunction("kbi_nl_why_fort_wXmal_indexingP", "KBI-NL-WHY-FORT-W/MAL-INDEXING?", 2, 0, false);
        declareFunction("kbi_term_indexing_inappropriate_assertions", "KBI-TERM-INDEXING-INAPPROPRIATE-ASSERTIONS", 1, 0, false);
        declareFunction("inappropriate_assertions", "INAPPROPRIATE-ASSERTIONS", 3, 2, false);
        declareFunction("inappropriate_assertionP", "INAPPROPRIATE-ASSERTION?", 3, 0, false);
        declareFunction("appropriate_gaf_cnfP", "APPROPRIATE-GAF-CNF?", 3, 0, false);
        declareFunction("appropriate_rule_cnfP", "APPROPRIATE-RULE-CNF?", 3, 0, false);
        declareFunction("appropriate_rule_litsP", "APPROPRIATE-RULE-LITS?", 2, 0, false);
        declareFunction("fort_wXcycleP", "FORT-W/CYCLE?", 1, 0, false);
        declareFunction("why_fort_wXcycleP", "WHY-FORT-W/CYCLE?", 1, 1, false);
        declareFunction("cycle_declared_wrtP", "CYCLE-DECLARED-WRT?", 2, 1, false);
        declareFunction("kbi_nl_why_fort_wXcycleP", "KBI-NL-WHY-FORT-W/CYCLE?", 2, 0, false);
        declareFunction("kbi_fort_wXcycle_in_mts", "KBI-FORT-W/CYCLE-IN-MTS", 1, 0, false);
        declareFunction("kbi_fort_gather_cycles", "KBI-FORT-GATHER-CYCLES", 1, 0, false);
        declareFunction("fort_wXmal_cycleP", "FORT-W/MAL-CYCLE?", 1, 0, false);
        declareFunction("why_fort_wXmal_cycleP", "WHY-FORT-W/MAL-CYCLE?", 1, 1, false);
        declareFunction("kbi_nl_why_fort_wXmal_cycleP", "KBI-NL-WHY-FORT-W/MAL-CYCLE?", 2, 0, false);
        declareFunction("kbi_fort_wXmal_cycle_in_mts", "KBI-FORT-W/MAL-CYCLE-IN-MTS", 1, 0, false);
        declareFunction("kbi_fort_gather_mal_cycles", "KBI-FORT-GATHER-MAL-CYCLES", 1, 0, false);
        declareFunction("fort_wXo_superiorsP", "FORT-W/O-SUPERIORS?", 1, 0, false);
        declareFunction("why_fort_wXo_superiorsP", "WHY-FORT-W/O-SUPERIORS?", 1, 1, false);
        declareFunction("kbi_nl_why_fort_wXo_superiorsP", "KBI-NL-WHY-FORT-W/O-SUPERIORS?", 2, 0, false);
        declareFunction("kbi_fort_wXo_superiors_in_mts", "KBI-FORT-W/O-SUPERIORS-IN-MTS", 1, 0, false);
        declareFunction("predXmts_of_arg_pred_isa", "PRED.MTS-OF-ARG-PRED-ISA", 2, 2, false);
        declareFunction("gather_muffet", "GATHER-MUFFET", 1, 0, false);
        declareFunction("relevant_pred_isa_pred_typeP", "RELEVANT-PRED-ISA-PRED-TYPE?", 1, 0, false);
        declareFunction("fort_wXo_inferiorsP", "FORT-W/O-INFERIORS?", 1, 0, false);
        declareFunction("why_fort_wXo_inferiorsP", "WHY-FORT-W/O-INFERIORS?", 1, 1, false);
        declareFunction("kbi_nl_why_fort_wXo_inferiorsP", "KBI-NL-WHY-FORT-W/O-INFERIORS?", 2, 0, false);
        declareFunction("kbi_fort_wXo_inferiors_in_mts", "KBI-FORT-W/O-INFERIORS-IN-MTS", 1, 0, false);
        declareFunction("fort_assertions_diagnosesP", "FORT-ASSERTIONS-DIAGNOSES?", 1, 0, false);
        declareFunction("why_fort_assertions_diagnosesP", "WHY-FORT-ASSERTIONS-DIAGNOSES?", 1, 1, false);
        declareFunction("kbi_nl_why_fort_assertions_diagnosesP", "KBI-NL-WHY-FORT-ASSERTIONS-DIAGNOSES?", 2, 0, false);
        declareFunction("kbi_fort_assertions_diagnoses", "KBI-FORT-ASSERTIONS-DIAGNOSES", 1, 0, false);
        declareFunction("kbi_all_term_assertions_wrt", "KBI-ALL-TERM-ASSERTIONS-WRT", 1, 0, false);
        declareFunction("fort_isa_sbhlXkb_mismatchP", "FORT-ISA-SBHL/KB-MISMATCH?", 1, 0, false);
        declareFunction("why_fort_isa_sbhlXkb_mismatchP", "WHY-FORT-ISA-SBHL/KB-MISMATCH?", 1, 1, false);
        declareFunction("kbi_nl_why_fort_isa_sbhlXkb_mismatchP", "KBI-NL-WHY-FORT-ISA-SBHL/KB-MISMATCH?", 2, 0, false);
        declareFunction("kbi_fort_isa_sbhlXkb_mismatchP", "KBI-FORT-ISA-SBHL/KB-MISMATCH?", 1, 0, false);
        declareFunction("fort_isa_sbhlXkb_mismatch_in_mtP", "FORT-ISA-SBHL/KB-MISMATCH-IN-MT?", 3, 0, false);
        declareFunction("fort_not_isa_sbhlXkb_mismatch_in_mtP", "FORT-NOT-ISA-SBHL/KB-MISMATCH-IN-MT?", 3, 0, false);
        declareFunction("fort_wXisa_inconsistencyP", "FORT-W/ISA-INCONSISTENCY?", 1, 0, false);
        declareFunction("why_fort_wXisa_inconsistencyP", "WHY-FORT-W/ISA-INCONSISTENCY?", 1, 1, false);
        declareFunction("kbi_nl_why_fort_wXisa_inconsistencyP", "KBI-NL-WHY-FORT-W/ISA-INCONSISTENCY?", 2, 0, false);
        declareFunction("kbi_fort_wXisa_inconsistencyP", "KBI-FORT-W/ISA-INCONSISTENCY?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_fort_file() {
        defparameter("*FORT-RELEASED-RESULTS*", NIL);
        defparameter("*FORT-RELEASED-TIME*", ZERO_INTEGER);
        defparameter("*FORT-RELEASED-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-INVALID-RESULTS*", NIL);
        defparameter("*FORT-INVALID-TIME*", ZERO_INTEGER);
        defparameter("*FORT-INVALID-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/MALFORMED-SBHL-LINKS-RESULTS*", NIL);
        defparameter("*FORT-W/MALFORMED-SBHL-LINKS-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/MALFORMED-SBHL-LINKS-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/UNKNOWN-TYPE-RESULTS*", NIL);
        defparameter("*FORT-W/UNKNOWN-TYPE-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/UNKNOWN-TYPE-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/MAL-TYPES-RESULTS*", NIL);
        defparameter("*FORT-W/MAL-TYPES-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/MAL-TYPES-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/O-ISA-RESULTS*", NIL);
        defparameter("*FORT-W/O-ISA-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/O-ISA-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-MISSING-ISA-VIA-DEFN-RESULTS*", NIL);
        defparameter("*FORT-MISSING-ISA-VIA-DEFN-TIME*", ZERO_INTEGER);
        defparameter("*FORT-MISSING-ISA-VIA-DEFN-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-VIOLATING-ISA-DEFN-RESULTS*", NIL);
        defparameter("*FORT-VIOLATING-ISA-DEFN-TIME*", ZERO_INTEGER);
        defparameter("*FORT-VIOLATING-ISA-DEFN-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/O-EXPECTED-GAFS-RESULTS*", NIL);
        defparameter("*FORT-W/O-EXPECTED-GAFS-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/O-EXPECTED-GAFS-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/O-ASSERTIONS-RESULTS*", NIL);
        defparameter("*FORT-W/O-ASSERTIONS-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/O-ASSERTIONS-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/MAL-INDEXING-RESULTS*", NIL);
        defparameter("*FORT-W/MAL-INDEXING-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/MAL-INDEXING-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/CYCLE-RESULTS*", NIL);
        defparameter("*FORT-W/CYCLE-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/CYCLE-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/MAL-CYCLE-RESULTS*", NIL);
        defparameter("*FORT-W/MAL-CYCLE-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/MAL-CYCLE-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/O-SUPERIORS-RESULTS*", NIL);
        defparameter("*FORT-W/O-SUPERIORS-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/O-SUPERIORS-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/O-INFERIORS-RESULTS*", NIL);
        defparameter("*FORT-W/O-INFERIORS-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/O-INFERIORS-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-ASSERTIONS-DIAGNOSES-RESULTS*", NIL);
        defparameter("*FORT-ASSERTIONS-DIAGNOSES-TIME*", ZERO_INTEGER);
        defparameter("*FORT-ASSERTIONS-DIAGNOSES-COUNT*", ZERO_INTEGER);
        defparameter("*KBI-DISTRIBUTE-ASSERTIONS-TO-SINGLE-FORT-OF-TYPE*", NIL);
        defparameter("*KBI-DISTRIBUTE-ASSERTIONS-TO-SINGLE-FORT?*", NIL);
        defparameter("*FORT-ISA-SBHL/KB-MISMATCH-RESULTS*", NIL);
        defparameter("*FORT-ISA-SBHL/KB-MISMATCH-TIME*", ZERO_INTEGER);
        defparameter("*FORT-ISA-SBHL/KB-MISMATCH-COUNT*", ZERO_INTEGER);
        defparameter("*FORT-W/ISA-INCONSISTENCY-RESULTS*", NIL);
        defparameter("*FORT-W/ISA-INCONSISTENCY-TIME*", ZERO_INTEGER);
        defparameter("*FORT-W/ISA-INCONSISTENCY-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_fort_file() {
                {
            SubLObject item_var = $fort_released_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_released_results$, $str_alt5$violators_of_kbi_module__FORT_REL);
        {
            SubLObject item_var = $fort_released_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_released_time$, $str_alt7$run_time_of_predicate_application);
        {
            SubLObject item_var = $fort_released_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_released_count$, $str_alt9$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($FORT_RELEASED, $list_alt16);
        {
            SubLObject item_var = $fort_invalid_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_invalid_results$, $str_alt25$violators_of_kbi_module__FORT_INV);
        {
            SubLObject item_var = $fort_invalid_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_invalid_time$, $str_alt27$run_time_of_predicate_application);
        {
            SubLObject item_var = $fort_invalid_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_invalid_count$, $str_alt29$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($FORT_INVALID, $list_alt31);
        {
            SubLObject item_var = $sym33$_FORT_W_MALFORMED_SBHL_LINKS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym33$_FORT_W_MALFORMED_SBHL_LINKS_RESULTS_, $str_alt34$violators_of_kbi_module__FORT_W_M);
        {
            SubLObject item_var = $sym35$_FORT_W_MALFORMED_SBHL_LINKS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym35$_FORT_W_MALFORMED_SBHL_LINKS_TIME_, $str_alt36$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym37$_FORT_W_MALFORMED_SBHL_LINKS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym37$_FORT_W_MALFORMED_SBHL_LINKS_COUNT_, $str_alt38$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw39$FORT_W_MALFORMED_SBHL_LINKS, $list_alt40);
        {
            SubLObject item_var = $sym42$_FORT_W_UNKNOWN_TYPE_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym42$_FORT_W_UNKNOWN_TYPE_RESULTS_, $str_alt43$violators_of_kbi_module__FORT_W_U);
        {
            SubLObject item_var = $sym44$_FORT_W_UNKNOWN_TYPE_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym44$_FORT_W_UNKNOWN_TYPE_TIME_, $str_alt45$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym46$_FORT_W_UNKNOWN_TYPE_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym46$_FORT_W_UNKNOWN_TYPE_COUNT_, $str_alt47$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw48$FORT_W_UNKNOWN_TYPE, $list_alt49);
        {
            SubLObject item_var = $sym54$_FORT_W_MAL_TYPES_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym54$_FORT_W_MAL_TYPES_RESULTS_, $str_alt55$violators_of_kbi_module__FORT_W_M);
        {
            SubLObject item_var = $sym56$_FORT_W_MAL_TYPES_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym56$_FORT_W_MAL_TYPES_TIME_, $str_alt57$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym58$_FORT_W_MAL_TYPES_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym58$_FORT_W_MAL_TYPES_COUNT_, $str_alt59$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw60$FORT_W_MAL_TYPES, $list_alt61);
        {
            SubLObject item_var = $sym64$_FORT_W_O_ISA_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym64$_FORT_W_O_ISA_RESULTS_, $str_alt65$violators_of_kbi_module__FORT_W_O);
        {
            SubLObject item_var = $sym66$_FORT_W_O_ISA_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym66$_FORT_W_O_ISA_TIME_, $str_alt67$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym68$_FORT_W_O_ISA_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym68$_FORT_W_O_ISA_COUNT_, $str_alt69$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw70$FORT_W_O_ISA, $list_alt71);
        {
            SubLObject item_var = $fort_missing_isa_via_defn_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_missing_isa_via_defn_results$, $str_alt78$violators_of_kbi_module__FORT_MIS);
        {
            SubLObject item_var = $fort_missing_isa_via_defn_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_missing_isa_via_defn_time$, $str_alt80$run_time_of_predicate_application);
        {
            SubLObject item_var = $fort_missing_isa_via_defn_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_missing_isa_via_defn_count$, $str_alt82$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($FORT_MISSING_ISA_VIA_DEFN, $list_alt84);
        {
            SubLObject item_var = $fort_violating_isa_defn_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_violating_isa_defn_results$, $str_alt92$violators_of_kbi_module__FORT_VIO);
        {
            SubLObject item_var = $fort_violating_isa_defn_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_violating_isa_defn_time$, $str_alt94$run_time_of_predicate_application);
        {
            SubLObject item_var = $fort_violating_isa_defn_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_violating_isa_defn_count$, $str_alt96$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($FORT_VIOLATING_ISA_DEFN, $list_alt98);
        {
            SubLObject item_var = $sym103$_FORT_W_O_EXPECTED_GAFS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym103$_FORT_W_O_EXPECTED_GAFS_RESULTS_, $str_alt104$violators_of_kbi_module__FORT_W_O);
        {
            SubLObject item_var = $sym105$_FORT_W_O_EXPECTED_GAFS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym105$_FORT_W_O_EXPECTED_GAFS_TIME_, $str_alt106$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym107$_FORT_W_O_EXPECTED_GAFS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym107$_FORT_W_O_EXPECTED_GAFS_COUNT_, $str_alt108$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw109$FORT_W_O_EXPECTED_GAFS, $list_alt110);
        {
            SubLObject item_var = $sym124$_FORT_W_O_ASSERTIONS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym124$_FORT_W_O_ASSERTIONS_RESULTS_, $str_alt125$violators_of_kbi_module__FORT_W_O);
        {
            SubLObject item_var = $sym126$_FORT_W_O_ASSERTIONS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym126$_FORT_W_O_ASSERTIONS_TIME_, $str_alt127$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym128$_FORT_W_O_ASSERTIONS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym128$_FORT_W_O_ASSERTIONS_COUNT_, $str_alt129$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw130$FORT_W_O_ASSERTIONS, $list_alt131);
        {
            SubLObject item_var = $sym134$_FORT_W_MAL_INDEXING_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym134$_FORT_W_MAL_INDEXING_RESULTS_, $str_alt135$violators_of_kbi_module__FORT_W_M);
        {
            SubLObject item_var = $sym136$_FORT_W_MAL_INDEXING_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym136$_FORT_W_MAL_INDEXING_TIME_, $str_alt137$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym138$_FORT_W_MAL_INDEXING_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym138$_FORT_W_MAL_INDEXING_COUNT_, $str_alt139$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw140$FORT_W_MAL_INDEXING, $list_alt141);
        {
            SubLObject item_var = $sym158$_FORT_W_CYCLE_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym158$_FORT_W_CYCLE_RESULTS_, $str_alt159$violators_of_kbi_module__FORT_W_C);
        {
            SubLObject item_var = $sym160$_FORT_W_CYCLE_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym160$_FORT_W_CYCLE_TIME_, $str_alt161$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym162$_FORT_W_CYCLE_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym162$_FORT_W_CYCLE_COUNT_, $str_alt163$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw164$FORT_W_CYCLE, $list_alt165);
        {
            SubLObject item_var = $sym171$_FORT_W_MAL_CYCLE_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym171$_FORT_W_MAL_CYCLE_RESULTS_, $str_alt172$violators_of_kbi_module__FORT_W_M);
        {
            SubLObject item_var = $sym173$_FORT_W_MAL_CYCLE_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym173$_FORT_W_MAL_CYCLE_TIME_, $str_alt174$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym175$_FORT_W_MAL_CYCLE_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym175$_FORT_W_MAL_CYCLE_COUNT_, $str_alt176$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw177$FORT_W_MAL_CYCLE, $list_alt178);
        {
            SubLObject item_var = $sym181$_FORT_W_O_SUPERIORS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym181$_FORT_W_O_SUPERIORS_RESULTS_, $str_alt182$violators_of_kbi_module__FORT_W_O);
        {
            SubLObject item_var = $sym183$_FORT_W_O_SUPERIORS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym183$_FORT_W_O_SUPERIORS_TIME_, $str_alt184$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym185$_FORT_W_O_SUPERIORS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym185$_FORT_W_O_SUPERIORS_COUNT_, $str_alt186$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw187$FORT_W_O_SUPERIORS, $list_alt188);
        {
            SubLObject item_var = $sym196$_FORT_W_O_INFERIORS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym196$_FORT_W_O_INFERIORS_RESULTS_, $str_alt197$violators_of_kbi_module__FORT_W_O);
        {
            SubLObject item_var = $sym198$_FORT_W_O_INFERIORS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym198$_FORT_W_O_INFERIORS_TIME_, $str_alt199$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym200$_FORT_W_O_INFERIORS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym200$_FORT_W_O_INFERIORS_COUNT_, $str_alt201$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw202$FORT_W_O_INFERIORS, $list_alt203);
        {
            SubLObject item_var = $fort_assertions_diagnoses_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_assertions_diagnoses_results$, $str_alt206$violators_of_kbi_module__FORT_ASS);
        {
            SubLObject item_var = $fort_assertions_diagnoses_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_assertions_diagnoses_time$, $str_alt208$run_time_of_predicate_application);
        {
            SubLObject item_var = $fort_assertions_diagnoses_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($fort_assertions_diagnoses_count$, $str_alt210$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($FORT_ASSERTIONS_DIAGNOSES, $list_alt212);
        {
            SubLObject item_var = $sym217$_FORT_ISA_SBHL_KB_MISMATCH_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym217$_FORT_ISA_SBHL_KB_MISMATCH_RESULTS_, $str_alt218$violators_of_kbi_module__FORT_ISA);
        {
            SubLObject item_var = $sym219$_FORT_ISA_SBHL_KB_MISMATCH_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym219$_FORT_ISA_SBHL_KB_MISMATCH_TIME_, $str_alt220$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym221$_FORT_ISA_SBHL_KB_MISMATCH_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym221$_FORT_ISA_SBHL_KB_MISMATCH_COUNT_, $str_alt222$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw223$FORT_ISA_SBHL_KB_MISMATCH, $list_alt224);
        {
            SubLObject item_var = $sym237$_FORT_W_ISA_INCONSISTENCY_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym237$_FORT_W_ISA_INCONSISTENCY_RESULTS_, $str_alt238$violators_of_kbi_module__FORT_W_I);
        {
            SubLObject item_var = $sym239$_FORT_W_ISA_INCONSISTENCY_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym239$_FORT_W_ISA_INCONSISTENCY_TIME_, $str_alt240$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym241$_FORT_W_ISA_INCONSISTENCY_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym241$_FORT_W_ISA_INCONSISTENCY_COUNT_, $str_alt242$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw243$FORT_W_ISA_INCONSISTENCY, $list_alt244);
        return NIL;
    }



    static private final SubLString $str_alt1$diagnosing__s_forts = makeString("diagnosing ~s forts");

    static private final SubLString $$$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");



    public static final SubLSymbol $fort_released_results$ = makeSymbol("*FORT-RELEASED-RESULTS*");

    static private final SubLString $str_alt5$violators_of_kbi_module__FORT_REL = makeString("violators of kbi module :FORT-RELEASED");

    public static final SubLSymbol $fort_released_time$ = makeSymbol("*FORT-RELEASED-TIME*");

    static private final SubLString $str_alt7$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-RELEASED");

    public static final SubLSymbol $fort_released_count$ = makeSymbol("*FORT-RELEASED-COUNT*");

    static private final SubLString $str_alt9$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-RELEASED");

    private static final SubLSymbol $FORT_RELEASED = makeKeyword("FORT-RELEASED");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-RELEASED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-RELEASED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-RELEASED-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-RELEASED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-RELEASED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-RELEASED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-RELEASED?"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("is FORT released?") });

    private static final SubLSymbol $MENTIONED_IN_CODE = makeKeyword("MENTIONED-IN-CODE");



    private static final SubLSymbol $HPKB_IKB = makeKeyword("HPKB-IKB");

    static private final SubLString $str_alt20$_s_release_status___a_ = makeString("~s release status: ~a)");

    private static final SubLSymbol OBJECT_TO_STRING = makeSymbol("OBJECT-TO-STRING");

    static private final SubLString $str_alt22$__ = makeString(", ");

    static private final SubLString $str_alt23$__and_ = makeString(", and ");

    public static final SubLSymbol $fort_invalid_results$ = makeSymbol("*FORT-INVALID-RESULTS*");

    static private final SubLString $str_alt25$violators_of_kbi_module__FORT_INV = makeString("violators of kbi module :FORT-INVALID");

    public static final SubLSymbol $fort_invalid_time$ = makeSymbol("*FORT-INVALID-TIME*");

    static private final SubLString $str_alt27$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-INVALID");

    public static final SubLSymbol $fort_invalid_count$ = makeSymbol("*FORT-INVALID-COUNT*");

    static private final SubLString $str_alt29$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-INVALID");

    private static final SubLSymbol $FORT_INVALID = makeKeyword("FORT-INVALID");

    static private final SubLList $list_alt31 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-INVALID-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-INVALID-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-INVALID-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-INVALID-INT?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("KBI-FORT-INVALID?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-INVALID?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-INVALID?"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-DOC"), makeString("test FORT for datastructure validity") });

    static private final SubLString $str_alt32$_s_is_not_a_valid_fort = makeString("~s is not a valid fort");

    static private final SubLSymbol $sym33$_FORT_W_MALFORMED_SBHL_LINKS_RESULTS_ = makeSymbol("*FORT-W/MALFORMED-SBHL-LINKS-RESULTS*");

    static private final SubLString $str_alt34$violators_of_kbi_module__FORT_W_M = makeString("violators of kbi module :FORT-W/MALFORMED-SBHL-LINKS");

    static private final SubLSymbol $sym35$_FORT_W_MALFORMED_SBHL_LINKS_TIME_ = makeSymbol("*FORT-W/MALFORMED-SBHL-LINKS-TIME*");

    static private final SubLString $str_alt36$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/MALFORMED-SBHL-LINKS");

    static private final SubLSymbol $sym37$_FORT_W_MALFORMED_SBHL_LINKS_COUNT_ = makeSymbol("*FORT-W/MALFORMED-SBHL-LINKS-COUNT*");

    static private final SubLString $str_alt38$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/MALFORMED-SBHL-LINKS");

    public static final SubLSymbol $kw39$FORT_W_MALFORMED_SBHL_LINKS = makeKeyword("FORT-W/MALFORMED-SBHL-LINKS");

    static private final SubLList $list_alt40 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/MALFORMED-SBHL-LINKS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/MALFORMED-SBHL-LINKS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/MALFORMED-SBHL-LINKS-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-MALFORMED-SBHL-LINKS?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("MALFORMED-SBHL-LINKS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/MALFORMED-SBHL-LINKS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/MALFORMED-SBHL-LINKS?"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-DOC"), makeString("test FORT for malformed sbhl data (e.g., wrt sbhl bnf)") });

    static private final SubLString $str_alt41$_s_has_malformed_sbhl_links___s = makeString("~s has malformed sbhl links: ~s");

    static private final SubLSymbol $sym42$_FORT_W_UNKNOWN_TYPE_RESULTS_ = makeSymbol("*FORT-W/UNKNOWN-TYPE-RESULTS*");

    static private final SubLString $str_alt43$violators_of_kbi_module__FORT_W_U = makeString("violators of kbi module :FORT-W/UNKNOWN-TYPE");

    static private final SubLSymbol $sym44$_FORT_W_UNKNOWN_TYPE_TIME_ = makeSymbol("*FORT-W/UNKNOWN-TYPE-TIME*");

    static private final SubLString $str_alt45$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/UNKNOWN-TYPE");

    static private final SubLSymbol $sym46$_FORT_W_UNKNOWN_TYPE_COUNT_ = makeSymbol("*FORT-W/UNKNOWN-TYPE-COUNT*");

    static private final SubLString $str_alt47$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/UNKNOWN-TYPE");

    public static final SubLSymbol $kw48$FORT_W_UNKNOWN_TYPE = makeKeyword("FORT-W/UNKNOWN-TYPE");

    static private final SubLList $list_alt49 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/UNKNOWN-TYPE-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/UNKNOWN-TYPE-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/UNKNOWN-TYPE-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-W/UNKNOWN-TYPE"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/UNKNOWN-TYPE?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/UNKNOWN-TYPE?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/UNKNOWN-TYPE?"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-DOC"), makeString("test fort for unknown type") });

    static private final SubLString $str_alt50$ = makeString("");

    static private final SubLList $list_alt51 = list(makeSymbol("MT"), makeSymbol("TYPE"));

    static private final SubLString $str_alt52$___s_type_is__s_but_should_be_one = makeString("~%~s type is ~s but should be one of ~a [in ~s]");

    static private final SubLString $str_alt53$_and_ = makeString(" and ");

    static private final SubLSymbol $sym54$_FORT_W_MAL_TYPES_RESULTS_ = makeSymbol("*FORT-W/MAL-TYPES-RESULTS*");

    static private final SubLString $str_alt55$violators_of_kbi_module__FORT_W_M = makeString("violators of kbi module :FORT-W/MAL-TYPES");

    static private final SubLSymbol $sym56$_FORT_W_MAL_TYPES_TIME_ = makeSymbol("*FORT-W/MAL-TYPES-TIME*");

    static private final SubLString $str_alt57$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/MAL-TYPES");

    static private final SubLSymbol $sym58$_FORT_W_MAL_TYPES_COUNT_ = makeSymbol("*FORT-W/MAL-TYPES-COUNT*");

    static private final SubLString $str_alt59$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/MAL-TYPES");

    public static final SubLSymbol $kw60$FORT_W_MAL_TYPES = makeKeyword("FORT-W/MAL-TYPES");

    static private final SubLList $list_alt61 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/MAL-TYPES-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/MAL-TYPES-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/MAL-TYPES-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-MAL-TYPES"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/MAL-TYPES?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/MAL-TYPES?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/MAL-TYPES?"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("STALE-DATA"), makeKeyword("KBI-DOC"), makeString("test FORT for stale sbhl types") });

    static private final SubLList $list_alt62 = list(makeSymbol("MT"), makeSymbol("OLD"), makeSymbol("NEW"));

    static private final SubLString $str_alt63$___s_type_in__s_is__s_but_should_ = makeString("~%~s type in ~s is ~s but should be ~s");

    static private final SubLSymbol $sym64$_FORT_W_O_ISA_RESULTS_ = makeSymbol("*FORT-W/O-ISA-RESULTS*");

    static private final SubLString $str_alt65$violators_of_kbi_module__FORT_W_O = makeString("violators of kbi module :FORT-W/O-ISA");

    static private final SubLSymbol $sym66$_FORT_W_O_ISA_TIME_ = makeSymbol("*FORT-W/O-ISA-TIME*");

    static private final SubLString $str_alt67$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/O-ISA");

    static private final SubLSymbol $sym68$_FORT_W_O_ISA_COUNT_ = makeSymbol("*FORT-W/O-ISA-COUNT*");

    static private final SubLString $str_alt69$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/O-ISA");

    public static final SubLSymbol $kw70$FORT_W_O_ISA = makeKeyword("FORT-W/O-ISA");

    static private final SubLList $list_alt71 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/O-ISA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/O-ISA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/O-ISA-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-W/O-ISA-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/O-ISA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/O-ISA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/O-ISA?"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-DOC"), makeString("test fort for references in mts where they have no #$isa") });

    public static final SubLObject $$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));

    static private final SubLList $list_alt73 = list(constant_handles.reader_make_constant_shell(makeString("CycLReifiableDenotationalTerm")));

    public static final SubLObject $$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));

    static private final SubLString $str_alt75$___s = makeString("~%~s");

    static private final SubLString $str_alt76$____in__a_has_no_isa_but_is_refer = makeString("~%  in ~a has no isa but is referenced in~%     ~a ");

    public static final SubLSymbol $fort_missing_isa_via_defn_results$ = makeSymbol("*FORT-MISSING-ISA-VIA-DEFN-RESULTS*");

    static private final SubLString $str_alt78$violators_of_kbi_module__FORT_MIS = makeString("violators of kbi module :FORT-MISSING-ISA-VIA-DEFN");

    public static final SubLSymbol $fort_missing_isa_via_defn_time$ = makeSymbol("*FORT-MISSING-ISA-VIA-DEFN-TIME*");

    static private final SubLString $str_alt80$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-MISSING-ISA-VIA-DEFN");

    public static final SubLSymbol $fort_missing_isa_via_defn_count$ = makeSymbol("*FORT-MISSING-ISA-VIA-DEFN-COUNT*");

    static private final SubLString $str_alt82$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-MISSING-ISA-VIA-DEFN");

    private static final SubLSymbol $FORT_MISSING_ISA_VIA_DEFN = makeKeyword("FORT-MISSING-ISA-VIA-DEFN");

    static private final SubLList $list_alt84 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-MISSING-ISA-VIA-DEFN-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-MISSING-ISA-VIA-DEFN-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-MISSING-ISA-VIA-DEFN-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-MISSING-ISA-VIA-DEFN-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-MISSING-ISA-VIA-DEFN?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-MISSING-ISA-VIA-DEFN?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-MISSING-ISA-VIA-DEFN?"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-URGENCY"), makeKeyword("LOW"), makeKeyword("KBI-DOC"), makeString("test fort for collections that include them via #$defnSufficient but not via #$isa") });

    static private final SubLSymbol $sym85$KBI_GATHER_ADMITTING_COL_MT = makeSymbol("KBI-GATHER-ADMITTING-COL.MT");



    static private final SubLList $list_alt87 = list(constant_handles.reader_make_constant_shell(makeString("defnSufficient")), constant_handles.reader_make_constant_shell(makeString("defnIff")));

    static private final SubLList $list_alt88 = list(constant_handles.reader_make_constant_shell(makeString("CycLReifiableDenotationalTerm")), constant_handles.reader_make_constant_shell(makeString("NLTemplateExpression")), constant_handles.reader_make_constant_shell(makeString("SubLAtom")));

    static private final SubLList $list_alt89 = list(makeSymbol("MT"), makeSymbol("COL"), makeSymbol("PRED"), makeSymbol("DEFN"));

    static private final SubLString $str_alt90$___s_is_admitted_by__s___s_of__s_ = makeString("~%~s is admitted by ~s, ~s of ~s, but not #$isa ~s [in ~s]");

    public static final SubLSymbol $fort_violating_isa_defn_results$ = makeSymbol("*FORT-VIOLATING-ISA-DEFN-RESULTS*");

    static private final SubLString $str_alt92$violators_of_kbi_module__FORT_VIO = makeString("violators of kbi module :FORT-VIOLATING-ISA-DEFN");

    public static final SubLSymbol $fort_violating_isa_defn_time$ = makeSymbol("*FORT-VIOLATING-ISA-DEFN-TIME*");

    static private final SubLString $str_alt94$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-VIOLATING-ISA-DEFN");

    public static final SubLSymbol $fort_violating_isa_defn_count$ = makeSymbol("*FORT-VIOLATING-ISA-DEFN-COUNT*");

    static private final SubLString $str_alt96$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-VIOLATING-ISA-DEFN");

    private static final SubLSymbol $FORT_VIOLATING_ISA_DEFN = makeKeyword("FORT-VIOLATING-ISA-DEFN");

    static private final SubLList $list_alt98 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-VIOLATING-ISA-DEFN-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-VIOLATING-ISA-DEFN-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-VIOLATING-ISA-DEFN-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-VIOLATING-ISA-DEFN?"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-VIOLATING-ISA-DEFN-IN-MTS"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-VIOLATING-ISA-DEFN?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-VIOLATING-ISA-DEFN?"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-DOC"), makeString("test fort for collections that includes a fort via #$isa but not via #$defnNecessary") });

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$defnIff = constant_handles.reader_make_constant_shell(makeString("defnIff"));

    public static final SubLObject $$defnNecessary = constant_handles.reader_make_constant_shell(makeString("defnNecessary"));

    static private final SubLString $str_alt102$___s___isa__s_but_is_rejected_by_ = makeString("~%~s #$isa ~s but is rejected by ~s ~s [in ~s]");

    static private final SubLSymbol $sym103$_FORT_W_O_EXPECTED_GAFS_RESULTS_ = makeSymbol("*FORT-W/O-EXPECTED-GAFS-RESULTS*");

    static private final SubLString $str_alt104$violators_of_kbi_module__FORT_W_O = makeString("violators of kbi module :FORT-W/O-EXPECTED-GAFS");

    static private final SubLSymbol $sym105$_FORT_W_O_EXPECTED_GAFS_TIME_ = makeSymbol("*FORT-W/O-EXPECTED-GAFS-TIME*");

    static private final SubLString $str_alt106$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/O-EXPECTED-GAFS");

    static private final SubLSymbol $sym107$_FORT_W_O_EXPECTED_GAFS_COUNT_ = makeSymbol("*FORT-W/O-EXPECTED-GAFS-COUNT*");

    static private final SubLString $str_alt108$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/O-EXPECTED-GAFS");

    public static final SubLSymbol $kw109$FORT_W_O_EXPECTED_GAFS = makeKeyword("FORT-W/O-EXPECTED-GAFS");

    static private final SubLList $list_alt110 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/O-EXPECTED-GAFS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/O-EXPECTED-GAFS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/O-EXPECTED-GAFS-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-W/O-EXPECTED-GAFS-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/O-EXPECTED-GAFS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/O-EXPECTED-GAFS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/O-EXPECTED-GAFS?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test fort for expected but missing gaf assertions") });

    static private final SubLString $str_alt111$please_assert_ = makeString("please assert:");

    static private final SubLList $list_alt112 = list(makeSymbol("MT"), makeSymbol("PRED"), makeSymbol("ARG"), makeSymbol("ISA"));

    static private final SubLString $str_alt113$______s__s___a____in__s_ = makeString("~%  (~s ~s <~a>) [in ~s]");

    static private final SubLList $list_alt114 = list(makeKeyword("X"));

    static private final SubLString $str_alt115$______s___a___s___in__s_ = makeString("~%  (~s <~a> ~s) [in ~s]");



    public static final SubLObject $$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol GATHER_MISSING_EXPECTED_PREDS_VIA_COL = makeSymbol("GATHER-MISSING-EXPECTED-PREDS-VIA-COL");



    private static final SubLSymbol GATHER_MISSING_EXPECTED_PREDS = makeSymbol("GATHER-MISSING-EXPECTED-PREDS");

    static private final SubLString $str_alt121$__every__s_is_expected_to_appear_ = makeString("~%every ~s is expected to appear as arg ~s of ~s in ~s");

    static private final SubLString $str_alt122$____candidate___specPreds_are__a = makeString("~%  candidate #$specPreds are ~a");



    static private final SubLSymbol $sym124$_FORT_W_O_ASSERTIONS_RESULTS_ = makeSymbol("*FORT-W/O-ASSERTIONS-RESULTS*");

    static private final SubLString $str_alt125$violators_of_kbi_module__FORT_W_O = makeString("violators of kbi module :FORT-W/O-ASSERTIONS");

    static private final SubLSymbol $sym126$_FORT_W_O_ASSERTIONS_TIME_ = makeSymbol("*FORT-W/O-ASSERTIONS-TIME*");

    static private final SubLString $str_alt127$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/O-ASSERTIONS");

    static private final SubLSymbol $sym128$_FORT_W_O_ASSERTIONS_COUNT_ = makeSymbol("*FORT-W/O-ASSERTIONS-COUNT*");

    static private final SubLString $str_alt129$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/O-ASSERTIONS");

    public static final SubLSymbol $kw130$FORT_W_O_ASSERTIONS = makeKeyword("FORT-W/O-ASSERTIONS");

    static private final SubLList $list_alt131 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/O-ASSERTIONS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/O-ASSERTIONS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/O-ASSERTIONS-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-W/O-ASSERTIONS?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/O-ASSERTIONS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/O-ASSERTIONS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/O-ASSERTIONS?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test fort for having no significant (e.g., vs. bookkeeping) assertions") });

    static private final SubLString $str_alt132$_s_has_no_significant__e_g___non_ = makeString("~s has no significant (e.g., non-bookkeeping) assertions (oh well...)");

    public static final SubLObject $$BookkeepingPredicate = constant_handles.reader_make_constant_shell(makeString("BookkeepingPredicate"));

    static private final SubLSymbol $sym134$_FORT_W_MAL_INDEXING_RESULTS_ = makeSymbol("*FORT-W/MAL-INDEXING-RESULTS*");

    static private final SubLString $str_alt135$violators_of_kbi_module__FORT_W_M = makeString("violators of kbi module :FORT-W/MAL-INDEXING");

    static private final SubLSymbol $sym136$_FORT_W_MAL_INDEXING_TIME_ = makeSymbol("*FORT-W/MAL-INDEXING-TIME*");

    static private final SubLString $str_alt137$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/MAL-INDEXING");

    static private final SubLSymbol $sym138$_FORT_W_MAL_INDEXING_COUNT_ = makeSymbol("*FORT-W/MAL-INDEXING-COUNT*");

    static private final SubLString $str_alt139$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/MAL-INDEXING");

    public static final SubLSymbol $kw140$FORT_W_MAL_INDEXING = makeKeyword("FORT-W/MAL-INDEXING");

    static private final SubLList $list_alt141 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/MAL-INDEXING-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/MAL-INDEXING-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/MAL-INDEXING-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), FOUR_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-TERM-INDEXING-INAPPROPRIATE-ASSERTIONS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/MAL-INDEXING?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/MAL-INDEXING?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/MAL-INDEXING?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-DOC"), makeString("test fort for indexing inappropriate assertions") });

    private static final SubLSymbol $INAPPROPRIATE_ASSERTIONS = makeKeyword("INAPPROPRIATE-ASSERTIONS");

    static private final SubLList $list_alt143 = list(makeSymbol("ARG"), makeSymbol("PRED"), makeSymbol("MT"), makeSymbol("ASSERTIONS"));

    static private final SubLString $str_alt144$_s_incorrectly_includes_via_index = makeString("~s incorrectly includes via index arg ~s~a~a assertions:~%  ~a");

    static private final SubLString $str_alt145$_relation__s = makeString(" relation ~s");

    static private final SubLString $str_alt146$_mt__s = makeString(" mt ~s");

    static private final SubLString $str_alt147$_____s = makeString("~%  ~s");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str_alt149$unexpected_kbi_symbol____s = makeString("unexpected kbi symbol : ~s");

    static private final SubLString $str_alt150$__ = makeString("~%");



    static private final SubLString $str_alt152$unexpected_index_symbol____s = makeString("unexpected index symbol : ~s");





    private static final SubLSymbol LITERAL_PREDICATE = makeSymbol("LITERAL-PREDICATE");





    static private final SubLSymbol $sym158$_FORT_W_CYCLE_RESULTS_ = makeSymbol("*FORT-W/CYCLE-RESULTS*");

    static private final SubLString $str_alt159$violators_of_kbi_module__FORT_W_C = makeString("violators of kbi module :FORT-W/CYCLE");

    static private final SubLSymbol $sym160$_FORT_W_CYCLE_TIME_ = makeSymbol("*FORT-W/CYCLE-TIME*");

    static private final SubLString $str_alt161$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/CYCLE");

    static private final SubLSymbol $sym162$_FORT_W_CYCLE_COUNT_ = makeSymbol("*FORT-W/CYCLE-COUNT*");

    static private final SubLString $str_alt163$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/CYCLE");

    public static final SubLSymbol $kw164$FORT_W_CYCLE = makeKeyword("FORT-W/CYCLE");

    static private final SubLList $list_alt165 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/CYCLE-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/CYCLE-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/CYCLE-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-W/CYCLE-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/CYCLE?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/CYCLE?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/CYCLE?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test fort for cycles along transitive preds") });

    static private final SubLList $list_alt166 = list(makeSymbol("MT"), makeSymbol("PRED"), makeSymbol("CYCLE"));

    static private final SubLString $str_alt167$__in__s___s_has_cyclic_path_along = makeString("~%in ~s, ~s has cyclic path along ~s:~%  ~a");

    static private final SubLString $str_alt168$____ = makeString("~%  ");

    private static final SubLSymbol KBI_FORT_GATHER_CYCLES = makeSymbol("KBI-FORT-GATHER-CYCLES");

    static private final SubLList $list_alt170 = list(ONE_INTEGER, TWO_INTEGER);

    static private final SubLSymbol $sym171$_FORT_W_MAL_CYCLE_RESULTS_ = makeSymbol("*FORT-W/MAL-CYCLE-RESULTS*");

    static private final SubLString $str_alt172$violators_of_kbi_module__FORT_W_M = makeString("violators of kbi module :FORT-W/MAL-CYCLE");

    static private final SubLSymbol $sym173$_FORT_W_MAL_CYCLE_TIME_ = makeSymbol("*FORT-W/MAL-CYCLE-TIME*");

    static private final SubLString $str_alt174$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/MAL-CYCLE");

    static private final SubLSymbol $sym175$_FORT_W_MAL_CYCLE_COUNT_ = makeSymbol("*FORT-W/MAL-CYCLE-COUNT*");

    static private final SubLString $str_alt176$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/MAL-CYCLE");

    public static final SubLSymbol $kw177$FORT_W_MAL_CYCLE = makeKeyword("FORT-W/MAL-CYCLE");

    static private final SubLList $list_alt178 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/MAL-CYCLE-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/MAL-CYCLE-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/MAL-CYCLE-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-W/MAL-CYCLE-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/MAL-CYCLE?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/MAL-CYCLE?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/MAL-CYCLE?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-DOC"), makeString("test fort for participating in invalid cycles (e.g., irreflexivity violations)") });

    static private final SubLString $str_alt179$__in__s___s_has_invalid_cycle_pat = makeString("~%in ~s, ~s has invalid cycle path along ~s:~%  ~a");

    private static final SubLSymbol KBI_FORT_GATHER_MAL_CYCLES = makeSymbol("KBI-FORT-GATHER-MAL-CYCLES");

    static private final SubLSymbol $sym181$_FORT_W_O_SUPERIORS_RESULTS_ = makeSymbol("*FORT-W/O-SUPERIORS-RESULTS*");

    static private final SubLString $str_alt182$violators_of_kbi_module__FORT_W_O = makeString("violators of kbi module :FORT-W/O-SUPERIORS");

    static private final SubLSymbol $sym183$_FORT_W_O_SUPERIORS_TIME_ = makeSymbol("*FORT-W/O-SUPERIORS-TIME*");

    static private final SubLString $str_alt184$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/O-SUPERIORS");

    static private final SubLSymbol $sym185$_FORT_W_O_SUPERIORS_COUNT_ = makeSymbol("*FORT-W/O-SUPERIORS-COUNT*");

    static private final SubLString $str_alt186$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/O-SUPERIORS");

    public static final SubLSymbol $kw187$FORT_W_O_SUPERIORS = makeKeyword("FORT-W/O-SUPERIORS");

    static private final SubLList $list_alt188 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/O-SUPERIORS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/O-SUPERIORS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/O-SUPERIORS-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-W/O-SUPERIORS-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/O-SUPERIORS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/O-SUPERIORS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/O-SUPERIORS?"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-DOC"), makeString("test fort for no superiors along relevant transitive preds") });

    static private final SubLList $list_alt189 = cons(makeSymbol("PRED"), makeSymbol("MT"));

    static private final SubLString $str_alt190$_s_has_no__s_superiors__in_mt__a_ = makeString("~s has no ~s superiors (in mt ~a)");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));

    static private final SubLSymbol $sym194$RELEVANT_PRED_ISA_PRED_TYPE_ = makeSymbol("RELEVANT-PRED-ISA-PRED-TYPE?");

    private static final SubLSymbol GATHER_MUFFET = makeSymbol("GATHER-MUFFET");

    static private final SubLSymbol $sym196$_FORT_W_O_INFERIORS_RESULTS_ = makeSymbol("*FORT-W/O-INFERIORS-RESULTS*");

    static private final SubLString $str_alt197$violators_of_kbi_module__FORT_W_O = makeString("violators of kbi module :FORT-W/O-INFERIORS");

    static private final SubLSymbol $sym198$_FORT_W_O_INFERIORS_TIME_ = makeSymbol("*FORT-W/O-INFERIORS-TIME*");

    static private final SubLString $str_alt199$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/O-INFERIORS");

    static private final SubLSymbol $sym200$_FORT_W_O_INFERIORS_COUNT_ = makeSymbol("*FORT-W/O-INFERIORS-COUNT*");

    static private final SubLString $str_alt201$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/O-INFERIORS");

    public static final SubLSymbol $kw202$FORT_W_O_INFERIORS = makeKeyword("FORT-W/O-INFERIORS");

    static private final SubLList $list_alt203 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/O-INFERIORS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/O-INFERIORS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/O-INFERIORS-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-W/O-INFERIORS-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/O-INFERIORS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/O-INFERIORS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/O-INFERIORS?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-DOC"), makeString("test fort for no inferiors along relevant transitive preds") });

    static private final SubLString $str_alt204$_s_has_no__s_inferiors__in_mt__a_ = makeString("~s has no ~s inferiors (in mt ~a)");

    public static final SubLSymbol $fort_assertions_diagnoses_results$ = makeSymbol("*FORT-ASSERTIONS-DIAGNOSES-RESULTS*");

    static private final SubLString $str_alt206$violators_of_kbi_module__FORT_ASS = makeString("violators of kbi module :FORT-ASSERTIONS-DIAGNOSES");

    public static final SubLSymbol $fort_assertions_diagnoses_time$ = makeSymbol("*FORT-ASSERTIONS-DIAGNOSES-TIME*");

    static private final SubLString $str_alt208$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-ASSERTIONS-DIAGNOSES");

    public static final SubLSymbol $fort_assertions_diagnoses_count$ = makeSymbol("*FORT-ASSERTIONS-DIAGNOSES-COUNT*");

    static private final SubLString $str_alt210$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-ASSERTIONS-DIAGNOSES");

    private static final SubLSymbol $FORT_ASSERTIONS_DIAGNOSES = makeKeyword("FORT-ASSERTIONS-DIAGNOSES");

    static private final SubLList $list_alt212 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-ASSERTIONS-DIAGNOSES-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-ASSERTIONS-DIAGNOSES-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-ASSERTIONS-DIAGNOSES-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), FIVE_INTEGER, makeKeyword("KBI-SELECTED?"), NIL, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-ASSERTIONS-DIAGNOSES"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-ASSERTIONS-DIAGNOSES?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-ASSERTIONS-DIAGNOSES?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-ASSERTIONS-DIAGNOSES?"), makeKeyword("KBI-DOC"), makeString("diagnose all assertions indexed by fort") });

    static private final SubLString $str_alt213$___s_assertion_diagnostics_ = makeString("~%~s assertion diagnostics:");

    static private final SubLList $list_alt214 = cons(makeSymbol("ASSERTION"), makeSymbol("DIAGNOSES"));

    static private final SubLString $str_alt215$_____s______has_diagnosis__s = makeString("~%  ~s~%    has diagnosis ~s");

    private static final SubLSymbol FULLY_INDEXED_TERM_P = makeSymbol("FULLY-INDEXED-TERM-P");

    static private final SubLSymbol $sym217$_FORT_ISA_SBHL_KB_MISMATCH_RESULTS_ = makeSymbol("*FORT-ISA-SBHL/KB-MISMATCH-RESULTS*");

    static private final SubLString $str_alt218$violators_of_kbi_module__FORT_ISA = makeString("violators of kbi module :FORT-ISA-SBHL/KB-MISMATCH");

    static private final SubLSymbol $sym219$_FORT_ISA_SBHL_KB_MISMATCH_TIME_ = makeSymbol("*FORT-ISA-SBHL/KB-MISMATCH-TIME*");

    static private final SubLString $str_alt220$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-ISA-SBHL/KB-MISMATCH");

    static private final SubLSymbol $sym221$_FORT_ISA_SBHL_KB_MISMATCH_COUNT_ = makeSymbol("*FORT-ISA-SBHL/KB-MISMATCH-COUNT*");

    static private final SubLString $str_alt222$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-ISA-SBHL/KB-MISMATCH");

    public static final SubLSymbol $kw223$FORT_ISA_SBHL_KB_MISMATCH = makeKeyword("FORT-ISA-SBHL/KB-MISMATCH");

    static private final SubLList $list_alt224 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-ISA-SBHL/KB-MISMATCH-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-ISA-SBHL/KB-MISMATCH-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-ISA-SBHL/KB-MISMATCH-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-ISA-SBHL/KB-MISMATCH?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-ISA-SBHL/KB-MISMATCH?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-ISA-SBHL/KB-MISMATCH?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-ISA-SBHL/KB-MISMATCH?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test FORT for mismatches between sbhl type and kb #$isa assertions") });

    static private final SubLList $list_alt225 = list(makeSymbol("MISMATCH"), makeSymbol("ISA"), makeSymbol("MT"), makeSymbol("TRUTH"));

    static private final SubLString $str_alt226$___isa__s__s_ = makeString("(#$isa ~s ~s)");



    static private final SubLString $str_alt228$___not____isa__s__s__ = makeString("(#$not (#$isa ~s ~s))");

    public static final SubLSymbol $kw229$SBHL_KB_ = makeKeyword("SBHL-KB+");

    static private final SubLString $$$true_in_kb_but_not_sbhl = makeString("true in kb but not sbhl");

    public static final SubLSymbol $kw231$SBHL_KB_ = makeKeyword("SBHL+KB-");

    static private final SubLString $$$true_in_sbhl_but_not_kb = makeString("true in sbhl but not kb");

    static private final SubLString $str_alt233$_____ist__s__a___a = makeString("~%(#$ist ~s ~a) ~a");

    static private final SubLString $str_alt234$____con_argument________a = makeString("~%  con argument:~%    ~a");

    static private final SubLString $str_alt235$______ = makeString("~%    ");



    static private final SubLSymbol $sym237$_FORT_W_ISA_INCONSISTENCY_RESULTS_ = makeSymbol("*FORT-W/ISA-INCONSISTENCY-RESULTS*");

    static private final SubLString $str_alt238$violators_of_kbi_module__FORT_W_I = makeString("violators of kbi module :FORT-W/ISA-INCONSISTENCY");

    static private final SubLSymbol $sym239$_FORT_W_ISA_INCONSISTENCY_TIME_ = makeSymbol("*FORT-W/ISA-INCONSISTENCY-TIME*");

    static private final SubLString $str_alt240$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FORT-W/ISA-INCONSISTENCY");

    static private final SubLSymbol $sym241$_FORT_W_ISA_INCONSISTENCY_COUNT_ = makeSymbol("*FORT-W/ISA-INCONSISTENCY-COUNT*");

    static private final SubLString $str_alt242$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FORT-W/ISA-INCONSISTENCY");

    public static final SubLSymbol $kw243$FORT_W_ISA_INCONSISTENCY = makeKeyword("FORT-W/ISA-INCONSISTENCY");

    static private final SubLList $list_alt244 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FORT-W/ISA-INCONSISTENCY-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FORT-W/ISA-INCONSISTENCY-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FORT-W/ISA-INCONSISTENCY-COUNT*"), makeKeyword("KBI-DOMAIN"), $FORT, makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FORT-W/ISA-INCONSISTENCY?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FORT-W/ISA-INCONSISTENCY?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FORT-W/ISA-INCONSISTENCY?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FORT-W/ISA-INCONSISTENCY?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test FORT for inconsistencies among #$isa data") });

    static private final SubLList $list_alt245 = list(makeSymbol("INCONSISTENCY"), makeSymbol("MT"));

    static private final SubLString $str_alt246$__isa_module_holds_that__s_____bo = makeString("~%isa module holds that ~s ~%  both is and is not an instance of ~s ~%  [in ~s]");

    static private final SubLString $str_alt247$____pro_argument________a = makeString("~%  pro argument:~%    ~a");

    // // Initializers
    public void declareFunctions() {
        declare_kbi_fort_file();
    }

    public void initializeVariables() {
        init_kbi_fort_file();
    }

    public void runTopLevelForms() {
        setup_kbi_fort_file();
    }
}

