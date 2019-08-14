/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
 *  module:      KBI-ASSERTION
 *  source file: /cyc/top/cycl/kbi-assertion.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_assertion extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_assertion() {
    }

    public static final SubLFile me = new kbi_assertion();

    public static final String myName = "com.cyc.cycjava.cycl.kbi_assertion";

    // // Definitions
    public static final SubLObject assertion_diagnostics(SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        kbi_utilities.reset_kbi_state($ASSERTION);
        return assertion_diagnostics_int(mt, printP);
    }

    public static final SubLObject assertion_diagnostics_wrt(SubLObject v_modules, SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        kbi_utilities.reset_kbi_state($ASSERTION);
        {
            SubLObject result = NIL;
            try {
                kbi_utilities.set_kbi_external_sub_domain_modules($ASSERTION, v_modules);
                result = assertion_diagnostics_int(mt, printP);
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

    /**
     * perform kbi diagnostics sweep on ASSERTIONS
     */
    public static final SubLObject assertions_diagnostics(SubLObject assertions, SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        kbi_utilities.reset_kbi_state($ASSERTION);
        return assertions_diagnostics_int(assertions, mt, printP);
    }

    public static final SubLObject assertions_diagnostics_wrt(SubLObject assertions, SubLObject v_modules, SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        kbi_utilities.reset_kbi_state($ASSERTION);
        {
            SubLObject result = NIL;
            try {
                kbi_utilities.set_kbi_external_sub_domain_modules($ASSERTION, v_modules);
                result = assertions_diagnostics_int(assertions, mt, printP);
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

    public static final SubLObject resume_assertion_diagnostics(SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.bind(T, thread);
                        result = assertion_diagnostics_int(mt, printP);
                    } finally {
                        kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject resume_assertions_diagnostics(SubLObject assertions, SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.bind(T, thread);
                        result = assertions_diagnostics_int(assertions, mt, printP);
                    } finally {
                        kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject resume_assertion_diagnostics_wrt(SubLObject v_modules, SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.bind(T, thread);
                        try {
                            kbi_utilities.set_kbi_external_sub_domain_modules($ASSERTION, v_modules);
                            result = assertion_diagnostics_int(mt, printP);
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
                        kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject resume_assertions_diagnostics_wrt(SubLObject assertions, SubLObject v_modules, SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.bind(T, thread);
                        try {
                            kbi_utilities.set_kbi_external_sub_domain_modules($ASSERTION, v_modules);
                            result = assertions_diagnostics_int(assertions, mt, printP);
                        } finally {
                            {
                                SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    kbi_utilities.clear_kbi_external_sub_domain_modules();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    } finally {
                        kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject assertions_diagnostics_int(SubLObject assertions, SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = kbi_vars.$kbi_print_resultsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                kbi_vars.$kbi_last_domain$.setDynamicValue($ASSERTION, thread);
                kbi_vars.$kbi_items_to_consider$.setDynamicValue(length(assertions), thread);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(kbi_vars.$kbi_relevant_mt_function$.getDynamicValue(thread), thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
                        {
                            SubLObject list_var = assertions;
                            utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt1$diagnosing__s_assertions, kbi_vars.$kbi_items_to_consider$.getDynamicValue(thread)), thread);
                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_3 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_4 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_5 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject assertion = NIL;
                                        for (assertion = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (NIL != kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.getDynamicValue(thread)) {
                                                if (kbi_vars.$kbi_last_assertion_considered$.getDynamicValue(thread) == assertion_handles.assertion_id(assertion)) {
                                                    kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.setDynamicValue(NIL, thread);
                                                }
                                            } else {
                                                diagnose_assertion(assertion);
                                                kbi_vars.$kbi_last_assertion_considered$.setDynamicValue(assertion_handles.assertion_id(assertion), thread);
                                            }
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_5, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_4, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                        }
                    } finally {
                        kbi_vars.$kbi_caching_findingsP$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != printP) {
                    result = kbi_utilities.kbi_print_domain_results($ASSERTION);
                }
                return result;
            }
        }
    }

    public static final SubLObject assertion_diagnostics_int(SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                kbi_vars.$kbi_last_domain$.setDynamicValue($ASSERTION, thread);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kbi_vars.$within_kbi_sweepP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(kbi_vars.$kbi_relevant_mt_function$.getDynamicValue(thread), thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kbi_vars.$within_kbi_sweepP$.bind(T, thread);
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
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
                                                    if (NIL != kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.getDynamicValue(thread)) {
                                                        if (kbi_vars.$kbi_last_assertion_considered$.getDynamicValue(thread) == assertion_handles.assertion_id(assertion)) {
                                                            kbi_vars.$kbi_resuming_assertion_diagnostic_sweepP$.setDynamicValue(NIL, thread);
                                                        }
                                                    } else {
                                                        if (NIL != funcall(kbi_vars.$kbi_sweep_select_fn$.getDynamicValue(thread), assertion)) {
                                                            diagnose_assertion(assertion);
                                                            kbi_vars.$kbi_last_assertion_considered$.setDynamicValue(assertion_handles.assertion_id(assertion), thread);
                                                        }
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
                                        result = kbi_utilities.kbi_print_domain_results($ASSERTION);
                                    } finally {
                                        kbi_vars.$kbi_print_whyP$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                            }
                        }
                    } finally {
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

    public static final SubLObject kbi_assertion_wrt(SubLObject v_modules, SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_utilities.reset_kbi_state($ASSERTION);
            {
                SubLObject result = NIL;
                kbi_vars.$kbi_last_domain$.setDynamicValue($ASSERTION, thread);
                sethash($ASSERTION, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), ZERO_INTEGER);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kbi_vars.$within_kbi_sweepP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(kbi_vars.$kbi_relevant_mt_function$.getDynamicValue(thread), thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kbi_vars.$within_kbi_sweepP$.bind(T, thread);
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
                        try {
                            kbi_utilities.set_kbi_external_sub_domain_modules($ASSERTION, v_modules);
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index.id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($$$mapping_Cyc_assertions, STRINGP);
                                {
                                    SubLObject _prev_bind_0_11 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1_12 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_13 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3_14 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
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
                                                        {
                                                            SubLObject _prev_bind_0_15 = utilities_macros.$progress_total$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_16 = utilities_macros.$progress_sofar$.currentBinding(thread);
                                                            try {
                                                                utilities_macros.$progress_total$.bind(NIL, thread);
                                                                utilities_macros.$progress_sofar$.bind(NIL, thread);
                                                                diagnose_assertion(assertion);
                                                            } finally {
                                                                utilities_macros.$progress_sofar$.rebind(_prev_bind_1_16, thread);
                                                                utilities_macros.$progress_total$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                    }
                                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                                } 
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_14, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_13, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_12, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    kbi_utilities.clear_kbi_external_sub_domain_modules();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                }
                            }
                        }
                        if (NIL != printP) {
                            {
                                SubLObject cdolist_list_var = v_modules;
                                SubLObject module = NIL;
                                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                    result = kbi_utilities.kbi_print_module_results(module, $ASSERTION);
                                }
                            }
                        }
                    } finally {
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

    public static final SubLObject kbi_assertions_wrt(SubLObject assertions, SubLObject v_modules, SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_utilities.reset_kbi_state($ASSERTION);
            kbi_vars.$kbi_last_domain$.setDynamicValue($ASSERTION, thread);
            kbi_vars.$kbi_items_to_consider$.setDynamicValue(length(assertions), thread);
            {
                SubLObject result = NIL;
                kbi_vars.$kbi_last_domain$.setDynamicValue($ASSERTION, thread);
                sethash($ASSERTION, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), ZERO_INTEGER);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kbi_vars.$within_kbi_sweepP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(kbi_vars.$kbi_relevant_mt_function$.getDynamicValue(thread), thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kbi_vars.$within_kbi_sweepP$.bind(T, thread);
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
                        try {
                            kbi_utilities.set_kbi_external_sub_domain_modules($ASSERTION, v_modules);
                            {
                                SubLObject list_var = assertions;
                                utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt5$mapping_kbi_assertions___s_, length(assertions)), thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_18 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1_19 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_20 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3_21 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject assertion = NIL;
                                            for (assertion = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                {
                                                    SubLObject _prev_bind_0_22 = utilities_macros.$progress_total$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_23 = utilities_macros.$progress_sofar$.currentBinding(thread);
                                                    try {
                                                        utilities_macros.$progress_total$.bind(NIL, thread);
                                                        utilities_macros.$progress_sofar$.bind(NIL, thread);
                                                        diagnose_assertion(assertion);
                                                    } finally {
                                                        utilities_macros.$progress_sofar$.rebind(_prev_bind_1_23, thread);
                                                        utilities_macros.$progress_total$.rebind(_prev_bind_0_22, thread);
                                                    }
                                                }
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_21, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_20, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_19, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_18, thread);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    kbi_utilities.clear_kbi_external_sub_domain_modules();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                }
                            }
                        }
                        if (NIL != printP) {
                            {
                                SubLObject cdolist_list_var = v_modules;
                                SubLObject module = NIL;
                                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                    result = kbi_utilities.kbi_print_module_results(module, $ASSERTION);
                                }
                            }
                        }
                    } finally {
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



    public static final SubLObject clear_cached_diagnose_assertion() {
        {
            SubLObject cs = $cached_diagnose_assertion_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cached_diagnose_assertion(SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_diagnose_assertion_caching_state$.getGlobalValue(), list(assertion), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_diagnose_assertion_internal(SubLObject assertion) {
        return diagnose_assertion(assertion);
    }

    public static final SubLObject cached_diagnose_assertion(SubLObject assertion) {
        {
            SubLObject caching_state = $cached_diagnose_assertion_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_DIAGNOSE_ASSERTION, $cached_diagnose_assertion_caching_state$, NIL, EQL, ONE_INTEGER, $int$1024);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, $kw9$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(cached_diagnose_assertion_internal(assertion)));
                    memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject diagnose_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gethash($ASSERTION, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED).isNumber()) {
                sethash($ASSERTION, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), add(gethash($ASSERTION, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            }
            return diagnose_assertion_int(assertion);
        }
    }

    public static final SubLObject diagnose_assertion_int(SubLObject assertion) {
        return kbi_utilities.diagnose_qua_sub_domains(assertion, $ASSERTION);
    }

    // defparameter
    public static final SubLSymbol $assertion_wXo_mt_results$ = makeSymbol("*ASSERTION-W/O-MT-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_mt_time$ = makeSymbol("*ASSERTION-W/O-MT-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_mt_count$ = makeSymbol("*ASSERTION-W/O-MT-COUNT*");

    /**
     * test ASSERTION for missing (or invalid) mt
     */
    public static final SubLObject assertion_wXo_mtP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw16$ASSERTION_W_O_MT)) && (NIL != kbi_utilities.kbi_applies_toP($kw16$ASSERTION_W_O_MT, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw16$ASSERTION_W_O_MT);
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
                                                        kbi_assertion_wXo_mtP(assertion);
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
                    kbi_utilities.kbi_increment_time($kw16$ASSERTION_W_O_MT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/O-MT applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXo_mtP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw16$ASSERTION_W_O_MT, assertion)) {
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
                                                    kbi_assertion_wXo_mtP(assertion);
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
                                return list($kw16$ASSERTION_W_O_MT, assertion, data);
                            } else {
                                return list($kw16$ASSERTION_W_O_MT, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXo_mtP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_wXo_mtP(SubLObject assertion, SubLObject data) {
        return format(NIL, $str_alt23$_s_is_not_a___Microtheory, data);
    }

    public static final SubLObject kbi_assertion_wXo_mtP(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL == hlmt.hlmtP(mt)) {
                kbi_utilities.add_kbi_result(mt);
            }
        }
        return kbi_utilities.kbi_result();
    }

    // defparameter
    public static final SubLSymbol $assertion_wXo_valid_id_results$ = makeSymbol("*ASSERTION-W/O-VALID-ID-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_valid_id_time$ = makeSymbol("*ASSERTION-W/O-VALID-ID-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_valid_id_count$ = makeSymbol("*ASSERTION-W/O-VALID-ID-COUNT*");

    /**
     * test ASSERTION for missing (or invalid) id
     */
    public static final SubLObject assertion_wXo_valid_idP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw30$ASSERTION_W_O_VALID_ID)) && (NIL != kbi_utilities.kbi_applies_toP($kw30$ASSERTION_W_O_VALID_ID, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw30$ASSERTION_W_O_VALID_ID);
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
                                                        kbi_valid_assertion_idP(assertion);
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
                    kbi_utilities.kbi_increment_time($kw30$ASSERTION_W_O_VALID_ID, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/O-VALID-ID applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXo_valid_idP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw30$ASSERTION_W_O_VALID_ID, assertion)) {
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
                                                    kbi_valid_assertion_idP(assertion);
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
                                return list($kw30$ASSERTION_W_O_VALID_ID, assertion, data);
                            } else {
                                return list($kw30$ASSERTION_W_O_VALID_ID, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXo_valid_idP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_wXo_valid_idP(SubLObject assertion, SubLObject id) {
        if (!id.isFixnum()) {
            return format(NIL, $str_alt32$_s_is_not_a_small__fixnum__intege, id);
        } else
            if (assertion != assertion_handles.find_assertion_by_id(id)) {
                return format(NIL, $str_alt33$_s_does_not_index__s, id, assertion);
            }

        return NIL;
    }

    public static final SubLObject kbi_valid_assertion_idP(SubLObject assertion) {
        {
            SubLObject id = assertion_handles.assertion_id(assertion);
            if (!(id.isFixnum() && (assertion == assertion_handles.find_assertion_by_id(id)))) {
                kbi_utilities.add_kbi_result(id);
            }
        }
        return kbi_utilities.kbi_result();
    }

    // defparameter
    public static final SubLSymbol $assertion_wXo_tv_results$ = makeSymbol("*ASSERTION-W/O-TV-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_tv_time$ = makeSymbol("*ASSERTION-W/O-TV-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_tv_count$ = makeSymbol("*ASSERTION-W/O-TV-COUNT*");

    /**
     * test ASSERTION for missing (or invalid) tv
     */
    public static final SubLObject assertion_wXo_tvP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw40$ASSERTION_W_O_TV)) && (NIL != kbi_utilities.kbi_applies_toP($kw40$ASSERTION_W_O_TV, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw40$ASSERTION_W_O_TV);
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
                                                        kbi_assertion_wXo_tvP(assertion);
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
                    kbi_utilities.kbi_increment_time($kw40$ASSERTION_W_O_TV, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/O-TV applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXo_tvP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw40$ASSERTION_W_O_TV, assertion)) {
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
                                                    kbi_assertion_wXo_tvP(assertion);
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
                                return list($kw40$ASSERTION_W_O_TV, assertion, data);
                            } else {
                                return list($kw40$ASSERTION_W_O_TV, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXo_tvP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_assertion_wXo_tvP(SubLObject assertion) {
        {
            SubLObject tv = assertions_high.cyc_assertion_tv(assertion);
            if (NIL == enumeration_types.tv_p(tv)) {
                kbi_utilities.add_kbi_result(tv);
            }
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_nl_why_assertion_wXo_tvP(SubLObject assertion, SubLObject tv) {
        return format(NIL, $str_alt42$_s_is_not_a_valid_assertion_truth, tv);
    }

    // defparameter
    public static final SubLSymbol $assertion_wXo_direction_results$ = makeSymbol("*ASSERTION-W/O-DIRECTION-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_direction_time$ = makeSymbol("*ASSERTION-W/O-DIRECTION-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_direction_count$ = makeSymbol("*ASSERTION-W/O-DIRECTION-COUNT*");

    /**
     * test ASSERTION for missing (or invalid) direction
     */
    public static final SubLObject assertion_wXo_directionP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw49$ASSERTION_W_O_DIRECTION)) && (NIL != kbi_utilities.kbi_applies_toP($kw49$ASSERTION_W_O_DIRECTION, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw49$ASSERTION_W_O_DIRECTION);
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
                                                        kbi_assertion_wXo_directionP(assertion);
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
                    kbi_utilities.kbi_increment_time($kw49$ASSERTION_W_O_DIRECTION, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/O-DIRECTION applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXo_directionP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw49$ASSERTION_W_O_DIRECTION, assertion)) {
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
                                                    kbi_assertion_wXo_directionP(assertion);
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
                                return list($kw49$ASSERTION_W_O_DIRECTION, assertion, data);
                            } else {
                                return list($kw49$ASSERTION_W_O_DIRECTION, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXo_directionP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_assertion_wXo_directionP(SubLObject assertion) {
        {
            SubLObject direction = assertions_high.assertion_direction(assertion);
            if (NIL == enumeration_types.direction_p(direction)) {
                kbi_utilities.add_kbi_result(direction);
            }
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_nl_why_assertion_wXo_directionP(SubLObject assertion, SubLObject direction) {
        return format(NIL, $str_alt51$_s_is_not_a_valid_assertion_direc, direction);
    }

    // defparameter
    public static final SubLSymbol $assertion_wXo_valid_var_names_results$ = makeSymbol("*ASSERTION-W/O-VALID-VAR-NAMES-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_valid_var_names_time$ = makeSymbol("*ASSERTION-W/O-VALID-VAR-NAMES-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_valid_var_names_count$ = makeSymbol("*ASSERTION-W/O-VALID-VAR-NAMES-COUNT*");

    /**
     * test ASSERTION for missing (or invalid) variable names
     */
    public static final SubLObject assertion_wXo_valid_var_namesP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw58$ASSERTION_W_O_VALID_VAR_NAMES)) && (NIL != kbi_utilities.kbi_applies_toP($kw58$ASSERTION_W_O_VALID_VAR_NAMES, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw58$ASSERTION_W_O_VALID_VAR_NAMES);
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
                                                        kbi_assertion_wXo_valid_var_names(assertion);
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
                    kbi_utilities.kbi_increment_time($kw58$ASSERTION_W_O_VALID_VAR_NAMES, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/O-VALID-VAR-NAMES applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXo_valid_var_namesP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw58$ASSERTION_W_O_VALID_VAR_NAMES, assertion)) {
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
                                                    kbi_assertion_wXo_valid_var_names(assertion);
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
                                return list($kw58$ASSERTION_W_O_VALID_VAR_NAMES, assertion, data);
                            } else {
                                return list($kw58$ASSERTION_W_O_VALID_VAR_NAMES, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXo_valid_var_namesP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_wXo_valid_var_namesP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt60$;
            SubLObject cdolist_list_var = data;
            SubLObject keyXresult = NIL;
            for (keyXresult = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyXresult = cdolist_list_var.first()) {
                {
                    SubLObject datum = keyXresult;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject result = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    result = current.first();
                    current = current.rest();
                    {
                        SubLObject orts = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt61);
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NUMBER_MISMATCH)) {
                                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt63$___s_inference_variables_but__s_v, result, orts));
                                } else
                                    if (pcase_var.eql($DUPLICATES)) {
                                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt65$___duplicated_variable_names___a, string_utilities.stringify_items(result, symbol_function(STR), $str_alt67$__, $str_alt68$_and_)));
                                    } else
                                        if (pcase_var.eql($NON_STRINGS)) {
                                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt70$___non_string_variable_names___a, string_utilities.stringify_items(result, symbol_function(STR), $str_alt67$__, $str_alt68$_and_)));
                                        } else
                                            if (pcase_var.eql($EL_HL_VAR)) {
                                                nl_result = cconcatenate(nl_result, format(NIL, $str_alt72$___invalid_el_variable_names___a, string_utilities.stringify_items(result, symbol_function(STR), $str_alt67$__, $str_alt68$_and_)));
                                            } else
                                                if (pcase_var.eql($CLOSED_HL_VARS_FOR)) {
                                                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt74$___hl_for_closed_el_variables___a, string_utilities.stringify_items(result, symbol_function(STR), $str_alt67$__, $str_alt68$_and_)));
                                                }




                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt61);
                        }
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_assertion_wXo_valid_var_names(SubLObject assertion) {
        {
            SubLObject var_names = assertions_high.assertion_variable_names(assertion);
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject hl_vars = list_utilities.cons_tree_gather(cnf, symbol_function($sym75$HL_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!length(hl_vars).numE(length(var_names))) {
                kbi_utilities.add_kbi_result(list($NUMBER_MISMATCH, length(hl_vars), length(var_names)));
            }
            if (NIL == kbi_utilities.kbi_doneP(UNPROVIDED)) {
                if (NIL != list_utilities.duplicatesP(var_names, UNPROVIDED, UNPROVIDED)) {
                    kbi_utilities.add_kbi_result(list($DUPLICATES, list_utilities.duplicates(var_names, UNPROVIDED, UNPROVIDED)));
                }
            }
            if (NIL == kbi_utilities.kbi_doneP(UNPROVIDED)) {
                {
                    SubLObject non_strings = remove_if(symbol_function(STRINGP), var_names, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != non_strings) {
                        kbi_utilities.add_kbi_result(list($NON_STRINGS, non_strings));
                    }
                }
            }
            if (NIL == kbi_utilities.kbi_doneP(UNPROVIDED)) {
                {
                    SubLObject el_hl_vars = list_utilities.cons_tree_gather(cnf, symbol_function($sym76$EL_HL_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != el_hl_vars) {
                        kbi_utilities.add_kbi_result(list($EL_HL_VAR, el_hl_vars));
                    }
                }
            }
            if (NIL == kbi_utilities.kbi_doneP(UNPROVIDED)) {
                {
                    SubLObject free_hl_vars = clause_utilities.clause_free_variables(cnf, symbol_function($sym75$HL_VAR_), UNPROVIDED);
                    SubLObject closed_hl_vars = set_difference(hl_vars, free_hl_vars, UNPROVIDED, UNPROVIDED);
                    SubLObject el_vars = assertions_high.assertion_el_variables(assertion);
                    SubLObject closed_el_vars = NIL;
                    SubLObject cdolist_list_var = closed_hl_vars;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        closed_el_vars = cons(nth(variables.variable_id(var), el_vars), closed_el_vars);
                    }
                    if (NIL != closed_el_vars) {
                        kbi_utilities.add_kbi_result(list($CLOSED_HL_VARS_FOR, nreverse(closed_el_vars)));
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject el_hl_varP(SubLObject thing) {
        return makeBoolean(((NIL != cycl_variables.el_varP(thing)) && length(symbol_name(thing)).numGE(FOUR_INTEGER)) && (NIL != Strings.stringE($str_alt77$_VAR, string_utilities.substring(symbol_name(thing), ZERO_INTEGER, FOUR_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    // defparameter
    public static final SubLSymbol $assertion_wXo_prefered_var_names_results$ = makeSymbol("*ASSERTION-W/O-PREFERED-VAR-NAMES-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_prefered_var_names_time$ = makeSymbol("*ASSERTION-W/O-PREFERED-VAR-NAMES-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_prefered_var_names_count$ = makeSymbol("*ASSERTION-W/O-PREFERED-VAR-NAMES-COUNT*");

    /**
     * test ASSERTION for missing (or invalid) variable names
     */
    public static final SubLObject assertion_wXo_prefered_var_namesP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw84$ASSERTION_W_O_PREFERED_VAR_NAMES)) && (NIL != kbi_utilities.kbi_applies_toP($kw84$ASSERTION_W_O_PREFERED_VAR_NAMES, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw84$ASSERTION_W_O_PREFERED_VAR_NAMES);
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
                                            SubLObject _prev_bind_0_45 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_poor_var_names(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_46, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_45, thread);
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
                    kbi_utilities.kbi_increment_time($kw84$ASSERTION_W_O_PREFERED_VAR_NAMES, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/O-PREFERED-VAR-NAMES applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXo_prefered_var_namesP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw84$ASSERTION_W_O_PREFERED_VAR_NAMES, assertion)) {
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
                                        SubLObject _prev_bind_0_47 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_poor_var_names(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw84$ASSERTION_W_O_PREFERED_VAR_NAMES, assertion, data);
                            } else {
                                return list($kw84$ASSERTION_W_O_PREFERED_VAR_NAMES, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXo_prefered_var_namesP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_wXo_prefered_var_namesP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt60$;
            SubLObject cdolist_list_var = data;
            SubLObject keyXresult = NIL;
            for (keyXresult = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyXresult = cdolist_list_var.first()) {
                {
                    SubLObject datum = keyXresult;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt86);
                    key = current.first();
                    current = current.rest();
                    {
                        SubLObject result = current;
                        SubLObject pcase_var = key;
                        if (pcase_var.eql($SINGLE_LETTER_VAR)) {
                            nl_result = string_utilities.add_line(format(NIL, $str_alt88$single_letter_variable___a, string_utilities.stringify_items(result, symbol_function(IDENTITY), $str_alt67$__, $str_alt68$_and_)), nl_result, $str_alt89$_, UNPROVIDED);
                        }
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_assertion_poor_var_names(SubLObject assertion) {
        kbi_poor_variable_names(assertions_high.assertion_variable_names(assertion));
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_poor_variable_names(SubLObject var_names) {
        if (var_names.isCons()) {
            {
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = var_names;
                        SubLObject var_name = NIL;
                        for (var_name = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , var_name = csome_list_var.first()) {
                            if (var_name.isString()) {
                                {
                                    SubLObject name = cycl_variables.string_without_el_var_name_prefix(var_name);
                                    if (length(name).numE(ONE_INTEGER)) {
                                        kbi_utilities.adjoin_prop_kbi_result($SINGLE_LETTER_VAR, var_name, UNPROVIDED, UNPROVIDED);
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

    // defparameter
    public static final SubLSymbol $assertion_wXo_argument_results$ = makeSymbol("*ASSERTION-W/O-ARGUMENT-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_argument_time$ = makeSymbol("*ASSERTION-W/O-ARGUMENT-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXo_argument_count$ = makeSymbol("*ASSERTION-W/O-ARGUMENT-COUNT*");

    /**
     * test ASSERTION for no arguments
     */
    public static final SubLObject assertion_wXo_argumentP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw96$ASSERTION_W_O_ARGUMENT)) && (NIL != kbi_utilities.kbi_applies_toP($kw96$ASSERTION_W_O_ARGUMENT, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw96$ASSERTION_W_O_ARGUMENT);
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
                                            SubLObject _prev_bind_0_49 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_wXo_argumentP(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw96$ASSERTION_W_O_ARGUMENT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/O-ARGUMENT applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXo_argumentP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw96$ASSERTION_W_O_ARGUMENT, assertion)) {
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
                                        SubLObject _prev_bind_0_51 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_wXo_argumentP(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw96$ASSERTION_W_O_ARGUMENT, assertion, data);
                            } else {
                                return list($kw96$ASSERTION_W_O_ARGUMENT, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXo_argumentP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_assertion_wXo_argumentP(SubLObject assertion) {
        {
            SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
            if (NIL == v_arguments) {
                kbi_utilities.set_kbi_result(T);
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_nl_why_assertion_wXo_argumentP(SubLObject assertion, SubLObject data) {
        return format(NIL, $str_alt98$_s_has_no_argument, assertion);
    }

    // defparameter
    public static final SubLSymbol $assertion_wXmal_arguments_results$ = makeSymbol("*ASSERTION-W/MAL-ARGUMENTS-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXmal_arguments_time$ = makeSymbol("*ASSERTION-W/MAL-ARGUMENTS-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXmal_arguments_count$ = makeSymbol("*ASSERTION-W/MAL-ARGUMENTS-COUNT*");

    /**
     * test ASSERTION for inappropriate arguments
     */
    public static final SubLObject assertion_wXmal_argumentsP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw105$ASSERTION_W_MAL_ARGUMENTS)) && (NIL != kbi_utilities.kbi_applies_toP($kw105$ASSERTION_W_MAL_ARGUMENTS, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw105$ASSERTION_W_MAL_ARGUMENTS);
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
                                            SubLObject _prev_bind_0_53 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_mal_arguments(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_54, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_53, thread);
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
                    kbi_utilities.kbi_increment_time($kw105$ASSERTION_W_MAL_ARGUMENTS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/MAL-ARGUMENTS applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXmal_argumentsP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw105$ASSERTION_W_MAL_ARGUMENTS, assertion)) {
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
                                        SubLObject _prev_bind_0_55 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_mal_arguments(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_56, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_55, thread);
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
                                return list($kw105$ASSERTION_W_MAL_ARGUMENTS, assertion, data);
                            } else {
                                return list($kw105$ASSERTION_W_MAL_ARGUMENTS, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXmal_argumentsP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_wXmal_argumentsP(SubLObject assertion, SubLObject data) {
        return format(NIL, $str_alt107$arguments_not_indexing_this_asser, string_utilities.stringify_items(data, symbol_function(STR), $str_alt67$__, $str_alt68$_and_));
    }

    public static final SubLObject kbi_assertion_mal_arguments(SubLObject assertion) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = assertions_high.assertion_arguments(assertion);
                    SubLObject argument = NIL;
                    for (argument = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , argument = csome_list_var.first()) {
                        if ((NIL == arguments.argument_p(argument)) || ((NIL != deduction_handles.deduction_p(argument)) && (assertion != deductions_high.deduction_assertion(argument)))) {
                            kbi_utilities.add_kbi_result(argument);
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * test ASSERTION for missing from appropriate indices
     */
    public static final SubLObject assertion_misindexedP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_MISINDEXED)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_MISINDEXED, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_MISINDEXED);
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
                                                        indices_missing_assertion(assertion);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_MISINDEXED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-MISINDEXED applies to ASSERTION
     */
    public static final SubLObject why_assertion_misindexedP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_MISINDEXED, assertion)) {
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
                                                    indices_missing_assertion(assertion);
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
                                return list($ASSERTION_MISINDEXED, assertion, data);
                            } else {
                                return list($ASSERTION_MISINDEXED, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_misindexedP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_misindexedP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt60$;
            SubLObject cdolist_list_var = data;
            SubLObject constantXindex = NIL;
            for (constantXindex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constantXindex = cdolist_list_var.first()) {
                {
                    SubLObject datum = constantXindex;
                    SubLObject current = datum;
                    SubLObject constant = NIL;
                    SubLObject index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt116);
                    constant = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt116);
                    index = current.first();
                    current = current.rest();
                    {
                        SubLObject the_term_index = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt116);
                        current = current.rest();
                        if (NIL == current) {
                            nl_result = cconcatenate(nl_result, NIL != the_term_index ? ((SubLObject) (format(NIL, $str_alt117$__assertion_missing_from__s_index, new SubLObject[]{ the_term_index, index, constant }))) : format(NIL, $str_alt118$__assertion_missing_from__s_index, constant, index));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt116);
                        }
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject incorrect_assertion_indicesP(SubLObject assertion) {
        return consp(constants_not_indexing_assertion(assertion));
    }

    public static final SubLObject why_bad_assertion_indicesP(SubLObject assertion) {
        {
            SubLObject constants_aol = constants_not_indexing_assertion(assertion);
            if (NIL != constants_aol) {
                return cons($CONSTANTS_NOT_INDEXING_ASSERTION, constants_aol);
            }
        }
        return NIL;
    }

    public static final SubLObject indices_missing_assertion(SubLObject assertion) {
        return constants_not_indexing_assertion(assertion);
    }

    public static final SubLObject constants_not_indexing_assertion(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                constants_not_indexing_gaf(assertion);
            } else {
                constants_not_indexing_rule(assertion);
            }
            if (!((((NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) || (NIL != hlmt.hlmt_naut_p(mt))) || (NIL != fort_types_interface.broad_microtheory_p(mt))) || (NIL != indexed_by_mtP(assertion, mt)))) {
                kbi_utilities.add_kbi_result(list(mt, $IST));
            }
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject indexed_by_mtP(SubLObject leaf, SubLObject mt) {
        SubLTrampolineFile.checkType(leaf, INDEXING_LEAF_P);
        return NIL != kb_indexing_datastructures.simple_indexed_term_p(mt) ? ((SubLObject) (subl_promotions.memberP(leaf, kb_indexing_datastructures.term_index(mt), UNPROVIDED, UNPROVIDED))) : subl_promotions.memberP(leaf, kb_indexing_datastructures.final_index_leaves(kb_indexing.get_mt_subindex(mt)), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject constants_not_indexing_gaf(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject literal = assertions_high.gaf_formula(assertion);
            SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
            SubLObject correct = NIL;
            SubLObject incorrect = NIL;
            SubLObject doneP = NIL;
            if (NIL != forts.fort_p(predicate)) {
                if (NIL != gaf_assertion_indexed_via_predP(assertion, predicate, mt)) {
                    correct = cons(predicate, correct);
                } else {
                    {
                        SubLObject item_var = predicate;
                        if (NIL == member(item_var, incorrect, symbol_function(EQL), symbol_function(IDENTITY))) {
                            incorrect = cons(item_var, incorrect);
                        }
                        kbi_utilities.add_kbi_result(list(predicate, ZERO_INTEGER));
                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                    }
                }
            }
            {
                SubLObject psn = ZERO_INTEGER;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = el_utilities.literal_args(literal, UNPROVIDED);
                        SubLObject arg = NIL;
                        for (arg = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                            psn = add(psn, ONE_INTEGER);
                            if (NIL != forts.fort_p(arg)) {
                                if ((NIL == el_utilities.valid_argnum_p(psn)) || (NIL != gaf_assertion_indexed_via_termP(assertion, arg, psn, predicate, mt))) {
                                    {
                                        SubLObject item_var = arg;
                                        if (NIL == member(item_var, correct, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            correct = cons(item_var, correct);
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject item_var = arg;
                                        if (NIL == member(item_var, incorrect, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            incorrect = cons(item_var, incorrect);
                                        }
                                        kbi_utilities.add_kbi_result(list(arg, psn));
                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == doneP) {
                if (NIL != el_utilities.tou_litP(literal)) {
                    {
                        SubLObject psn = ZERO_INTEGER;
                        SubLObject nat = el_utilities.literal_arg2(literal, UNPROVIDED);
                        SubLObject fn = cycl_utilities.nat_function(nat);
                        if (NIL != forts.fort_p(fn)) {
                            if (NIL != tou_assertion_indexed_via_functorP(assertion, fn, mt)) {
                                correct = cons(fn, correct);
                            } else {
                                {
                                    SubLObject item_var = fn;
                                    if (NIL == member(item_var, incorrect, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        incorrect = cons(item_var, incorrect);
                                    }
                                    kbi_utilities.add_kbi_result(list(fn, ZERO_INTEGER));
                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                }
                            }
                        }
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = cycl_utilities.nat_args(nat, UNPROVIDED);
                                SubLObject arg = NIL;
                                for (arg = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                    psn = add(psn, ONE_INTEGER);
                                    if (NIL != forts.fort_p(arg)) {
                                        if ((NIL == el_utilities.valid_argnum_p(psn)) || (NIL != tou_assertion_indexed_via_termP(assertion, arg, psn, fn, mt))) {
                                            {
                                                SubLObject item_var = arg;
                                                if (NIL == member(item_var, correct, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    correct = cons(item_var, correct);
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject item_var = arg;
                                                if (NIL == member(item_var, incorrect, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    incorrect = cons(item_var, incorrect);
                                                }
                                                kbi_utilities.add_kbi_result(list(arg, psn, incorrect));
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
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = cycl_utilities.formula_constants(literal, UNPROVIDED);
                    SubLObject constant = NIL;
                    for (constant = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constant = csome_list_var.first()) {
                        if (NIL == subl_promotions.memberP(constant, correct, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == subl_promotions.memberP(constant, incorrect, UNPROVIDED, UNPROVIDED)) {
                                if (NIL != kb_indexing_datastructures.fully_indexed_term_p(constant)) {
                                    if (NIL == assertion_indexed_via_otherP(assertion, constant, T, UNPROVIDED)) {
                                        kbi_utilities.add_kbi_result(list(constant, $OTHER));
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

    public static final SubLObject constants_not_indexing_rule(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject direction = assertions_high.assertion_direction(assertion);
            SubLObject correct = NIL;
            SubLObject incorrect = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = $list_alt126;
                    SubLObject sign = NIL;
                    for (sign = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sign = csome_list_var.first()) {
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var_61 = sign_lits(cnf, sign);
                                SubLObject lit = NIL;
                                for (lit = csome_list_var_61.first(); !((NIL != doneP) || (NIL == csome_list_var_61)); csome_list_var_61 = csome_list_var_61.rest() , lit = csome_list_var_61.first()) {
                                    {
                                        SubLObject predicate = el_utilities.literal_predicate(lit, UNPROVIDED);
                                        if (NIL != forts.fort_p(predicate)) {
                                            if ((NIL == rule_assertion_lit_pred_indexP(lit, predicate)) || (NIL != assertion_indexed_via_predicate_rule_indexP(assertion, predicate, sign, mt, direction))) {
                                                {
                                                    SubLObject item_var = predicate;
                                                    if (NIL == member(item_var, correct, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        correct = cons(item_var, correct);
                                                    }
                                                }
                                            } else {
                                                {
                                                    SubLObject item_var = predicate;
                                                    if (NIL == member(item_var, incorrect, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        incorrect = cons(item_var, incorrect);
                                                    }
                                                    kbi_utilities.add_kbi_result(list(predicate, sign));
                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject rule_result = $IRRELEVANT;
                                        if (NIL == doneP) {
                                            {
                                                SubLObject csome_list_var_62 = cycl_utilities.formula_constants(el_utilities.literal_args(lit, UNPROVIDED), UNPROVIDED);
                                                SubLObject arg = NIL;
                                                for (arg = csome_list_var_62.first(); !((NIL != doneP) || (NIL == csome_list_var_62)); csome_list_var_62 = csome_list_var_62.rest() , arg = csome_list_var_62.first()) {
                                                    if ((NIL == forts.fort_p(arg)) || (NIL == kb_indexing_datastructures.fully_indexed_term_p(arg))) {
                                                    } else
                                                        if (arg.eql(cycl_utilities.nat_function(el_utilities.literal_arg2(lit, UNPROVIDED))) && (NIL != el_utilities.tou_litP(lit))) {
                                                            if (NIL != assertion_indexed_via_function_rule_indexP(assertion, arg, sign, mt)) {
                                                                rule_result = $CORRECT;
                                                            } else {
                                                                rule_result = $INCORRECT;
                                                            }
                                                        } else
                                                            if (arg.eql(el_utilities.literal_arg2(lit, UNPROVIDED)) && (NIL != el_utilities.isa_litP(lit))) {
                                                                if (NIL != assertion_indexed_via_isa_rule_indexP(assertion, arg, sign, mt, UNPROVIDED)) {
                                                                    rule_result = $CORRECT;
                                                                } else {
                                                                    rule_result = $INCORRECT;
                                                                }
                                                            } else
                                                                if (arg.eql(el_utilities.literal_arg2(lit, UNPROVIDED)) && (NIL != el_utilities.genls_litP(lit))) {
                                                                    if (NIL != assertion_indexed_via_genls_rule_indexP(assertion, arg, sign, mt, UNPROVIDED)) {
                                                                        rule_result = $CORRECT;
                                                                    } else {
                                                                        rule_result = $INCORRECT;
                                                                    }
                                                                } else
                                                                    if (arg.eql(el_utilities.literal_arg2(lit, UNPROVIDED)) && (NIL != el_utilities.genl_mt_litP(lit))) {
                                                                        if (NIL != assertion_indexed_via_genl_mt_rule_indexP(assertion, arg, sign, mt, UNPROVIDED)) {
                                                                            rule_result = $CORRECT;
                                                                        } else {
                                                                            rule_result = $INCORRECT;
                                                                        }
                                                                    }




                                                    {
                                                        SubLObject pcase_var = rule_result;
                                                        if (pcase_var.eql($IRRELEVANT)) {
                                                        } else
                                                            if (pcase_var.eql($CORRECT)) {
                                                                {
                                                                    SubLObject item_var = arg;
                                                                    if (NIL == member(item_var, correct, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                        correct = cons(item_var, correct);
                                                                    }
                                                                }
                                                            } else
                                                                if (pcase_var.eql($INCORRECT)) {
                                                                    {
                                                                        SubLObject item_var = arg;
                                                                        if (NIL == member(item_var, incorrect, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                            incorrect = cons(item_var, incorrect);
                                                                        }
                                                                    }
                                                                    kbi_utilities.add_kbi_result(list(arg, sign));
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
                    }
                }
            }
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = cycl_utilities.formula_constants(cnf, UNPROVIDED);
                    SubLObject constant = NIL;
                    for (constant = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constant = csome_list_var.first()) {
                        if (NIL == subl_promotions.memberP(constant, correct, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == subl_promotions.memberP(constant, incorrect, UNPROVIDED, UNPROVIDED)) {
                                if (NIL != kb_indexing_datastructures.fully_indexed_term_p(constant)) {
                                    if (NIL == assertion_indexed_via_otherP(assertion, constant, UNPROVIDED, UNPROVIDED)) {
                                        incorrect = cons(constant, incorrect);
                                        kbi_utilities.add_kbi_result(list(constant, $OTHER));
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

    public static final SubLObject gaf_assertion_indexed_via_predP(SubLObject assertion, SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = foundP;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_63 = foundP;
                                                            SubLObject token_var_64 = NIL;
                                                            while (NIL == done_var_63) {
                                                                {
                                                                    SubLObject indexed_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_64);
                                                                    SubLObject valid_65 = makeBoolean(token_var_64 != indexed_assertion);
                                                                    if (NIL != valid_65) {
                                                                        foundP = eq(assertion, indexed_assertion);
                                                                    }
                                                                    done_var_63 = makeBoolean((NIL == valid_65) || (NIL != foundP));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_66, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != foundP));
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
                return foundP;
            }
        }
    }

    public static final SubLObject tou_assertion_indexed_via_functorP(SubLObject assertion, SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(functor)) {
                            {
                                SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(functor);
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    {
                                        SubLObject done_var = foundP;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject indexed_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                                SubLObject valid = makeBoolean(token_var != indexed_assertion);
                                                if (NIL != valid) {
                                                    foundP = eq(assertion, indexed_assertion);
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != foundP));
                                            }
                                        } 
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_67, thread);
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
                return foundP;
            }
        }
    }

    public static final SubLObject gaf_assertion_indexed_via_termP(SubLObject assertion, SubLObject v_term, SubLObject arg, SubLObject pred, SubLObject mt) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arg, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arg, pred_var);
                                    SubLObject done_var = foundP;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_68 = foundP;
                                                            SubLObject token_var_69 = NIL;
                                                            while (NIL == done_var_68) {
                                                                {
                                                                    SubLObject indexed_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_69);
                                                                    SubLObject valid_70 = makeBoolean(token_var_69 != indexed_assertion);
                                                                    if (NIL != valid_70) {
                                                                        foundP = eq(assertion, indexed_assertion);
                                                                    }
                                                                    done_var_68 = makeBoolean((NIL == valid_70) || (NIL != foundP));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_71, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != foundP));
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
                return foundP;
            }
        }
    }

    public static final SubLObject tou_assertion_indexed_via_termP(SubLObject assertion, SubLObject v_term, SubLObject arg, SubLObject func, SubLObject mt) {
        if (func == UNPROVIDED) {
            func = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, arg, func)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, arg, func);
                                SubLObject done_var = foundP;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                        if (NIL != valid) {
                                            {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                    {
                                                        SubLObject done_var_72 = foundP;
                                                        SubLObject token_var_73 = NIL;
                                                        while (NIL == done_var_72) {
                                                            {
                                                                SubLObject indexed_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_73);
                                                                SubLObject valid_74 = makeBoolean(token_var_73 != indexed_assertion);
                                                                if (NIL != valid_74) {
                                                                    foundP = eq(assertion, indexed_assertion);
                                                                }
                                                                done_var_72 = makeBoolean((NIL == valid_74) || (NIL != foundP));
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_75, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        done_var = makeBoolean((NIL == valid) || (NIL != foundP));
                                    }
                                } 
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return foundP;
            }
        }
    }

    public static final SubLObject assertion_indexed_via_otherP(SubLObject assertion, SubLObject v_term, SubLObject gafs_onlyP, SubLObject mt) {
        if (gafs_onlyP == UNPROVIDED) {
            gafs_onlyP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$mapping_target$.currentBinding(thread);
                    SubLObject _prev_bind_3 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        control_vars.$mapping_target$.bind(assertion, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_other_index(symbol_function($sym129$ASSERTION_FOUND_), v_term, NIL, gafs_onlyP);
                        foundP = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_3, thread);
                        control_vars.$mapping_target$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return foundP;
            }
        }
    }

    public static final SubLObject assertion_indexed_via_predicate_rule_indexP(SubLObject assertion, SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        if (direction == UNPROVIDED) {
            direction = assertions_high.assertion_direction(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_target$.bind(assertion, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_predicate_rule_index(symbol_function($sym129$ASSERTION_FOUND_), pred, sense, direction, mt);
                        foundP = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
                        control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
                    }
                }
                return foundP;
            }
        }
    }

    public static final SubLObject assertion_indexed_via_function_rule_indexP(SubLObject assertion, SubLObject func, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        if (direction == UNPROVIDED) {
            direction = assertions_high.assertion_direction(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_target$.bind(assertion, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_function_rule_index(symbol_function($sym129$ASSERTION_FOUND_), func, direction, mt);
                        foundP = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
                        control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
                    }
                }
                return foundP;
            }
        }
    }

    public static final SubLObject assertion_indexed_via_isa_rule_indexP(SubLObject assertion, SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        if (direction == UNPROVIDED) {
            direction = assertions_high.assertion_direction(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_target$.bind(assertion, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_isa_rule_index(symbol_function($sym129$ASSERTION_FOUND_), col, sense, direction, mt);
                        foundP = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
                        control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
                    }
                }
                return foundP;
            }
        }
    }

    public static final SubLObject assertion_indexed_via_genls_rule_indexP(SubLObject assertion, SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        if (direction == UNPROVIDED) {
            direction = assertions_high.assertion_direction(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_target$.bind(assertion, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_genls_rule_index(symbol_function($sym129$ASSERTION_FOUND_), col, sense, direction, mt);
                        foundP = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
                        control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
                    }
                }
                return foundP;
            }
        }
    }

    public static final SubLObject assertion_indexed_via_genl_mt_rule_indexP(SubLObject assertion, SubLObject genl_mt, SubLObject sense, SubLObject rule_mt, SubLObject direction) {
        if (rule_mt == UNPROVIDED) {
            rule_mt = assertions_high.assertion_mt(assertion);
        }
        if (direction == UNPROVIDED) {
            direction = assertions_high.assertion_direction(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_target$.bind(assertion, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_genl_mt_rule_index(symbol_function($sym129$ASSERTION_FOUND_), genl_mt, sense, direction, rule_mt);
                        foundP = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
                        control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
                    }
                }
                return foundP;
            }
        }
    }

    public static final SubLObject assertion_foundP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (control_vars.$mapping_target$.getDynamicValue(thread) == assertion) {
                control_vars.$mapping_answer$.setDynamicValue(T, thread);
                utilities_macros.mapping_finished();
            }
            return NIL;
        }
    }

    public static final SubLObject sign_lits(SubLObject cnf, SubLObject sign) {
        {
            SubLObject pcase_var = sign;
            if (pcase_var.eql($NEG)) {
                return clauses.neg_lits(cnf);
            } else
                if (pcase_var.eql($POS)) {
                    return clauses.pos_lits(cnf);
                }

        }
        return NIL;
    }

    public static final SubLObject rule_assertion_lit_term_indexP(SubLObject literal, SubLObject arg) {
        return makeBoolean(((((((NIL != forts.fort_p(arg)) && (NIL != kb_indexing_datastructures.fully_indexed_term_p(arg))) && (((NIL != fort_types_interface.collectionP(arg)) || (NIL != fort_types_interface.predicateP(arg))) || (NIL != fort_types_interface.non_predicate_functionP(arg)))) && ((NIL == fort_types_interface.predicateP(arg)) || arg.eql(el_utilities.literal_predicate(literal, UNPROVIDED)))) && ((NIL == fort_types_interface.non_predicate_functionP(arg)) || ((NIL != el_utilities.tou_litP(literal)) && arg.eql(cycl_utilities.nat_function(el_utilities.literal_arg2(literal, UNPROVIDED)))))) && ((NIL == fort_types_interface.collectionP(arg)) || (((NIL != el_utilities.isa_litP(literal)) || (NIL != el_utilities.genls_litP(literal))) && arg.eql(el_utilities.literal_arg2(literal, UNPROVIDED))))) && ((NIL == fort_types_interface.mtP(arg)) || ((NIL != el_utilities.genl_mt_litP(literal)) && arg.eql(el_utilities.literal_arg2(literal, UNPROVIDED)))));
    }

    public static final SubLObject rule_assertion_lit_pred_indexP(SubLObject literal, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = el_utilities.literal_predicate(literal, UNPROVIDED);
        }
        return makeBoolean((((((NIL != forts.fort_p(pred)) && (NIL != kb_indexing_datastructures.fully_indexed_term_p(pred))) && (!((NIL != el_utilities.tou_litP(literal)) && (NIL != forts.fort_p(cycl_utilities.nat_function(el_utilities.literal_arg2(literal, UNPROVIDED))))))) && (!(((NIL != el_utilities.isa_litP(literal)) || (NIL != el_utilities.genls_litP(literal))) && (NIL != forts.fort_p(el_utilities.literal_arg2(literal, UNPROVIDED)))))) && (!((NIL != el_utilities.genl_mt_litP(literal)) && (NIL != forts.fort_p(el_utilities.literal_arg2(literal, UNPROVIDED)))))) && (!((NIL != el_utilities.ab_litP(literal)) && (NIL != term.kb_assertionP(el_utilities.literal_arg2(literal, UNPROVIDED))))));
    }







    /**
     * test ASSERTION for duplicates (different assertions having same formula and mt)
     */
    public static final SubLObject assertion_duplicatesP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_DUPLICATES)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_DUPLICATES, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_DUPLICATES);
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
                                            SubLObject _prev_bind_0_76 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_duplicates(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_77, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_76, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_DUPLICATES, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-DUPLICATES applies to ASSERTION
     */
    public static final SubLObject why_assertion_duplicatesP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_DUPLICATES, assertion)) {
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
                                        SubLObject _prev_bind_0_78 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_duplicates(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($ASSERTION_DUPLICATES, assertion, data);
                            } else {
                                return list($ASSERTION_DUPLICATES, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_duplicatesP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_duplicatesP(SubLObject assertion, SubLObject data) {
        return format(NIL, $str_alt140$ids_of_duplicate_assertions_are__, string_utilities.stringify_items(Mapping.mapcar(symbol_function(ASSERTION_ID), cons(assertion, data)), symbol_function(STR), $str_alt67$__, $str_alt68$_and_));
    }

    public static final SubLObject kbi_assertion_duplicates(SubLObject assertion) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject cnf_assertions = kb_indexing.find_all_assertions(cnf);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = cnf_assertions;
                    SubLObject cnf_assertion = NIL;
                    for (cnf_assertion = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cnf_assertion = csome_list_var.first()) {
                        if (!assertion.eql(cnf_assertion)) {
                            if (NIL != hlmt.hlmt_equal(mt, assertions_high.assertion_mt(cnf_assertion))) {
                                kbi_utilities.add_kbi_result(cnf_assertion);
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * test ASSERTION for similar clause-strucs in #$genlMts
     */
    public static final SubLObject assertion_redundant_wrt_mtP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_REDUNDANT_WRT_MT)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_REDUNDANT_WRT_MT, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_REDUNDANT_WRT_MT);
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
                                            SubLObject _prev_bind_0_80 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_redundant_wrt_mts(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($ASSERTION_REDUNDANT_WRT_MT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-REDUNDANT-WRT-MT applies to ASSERTION
     */
    public static final SubLObject why_assertion_redundant_wrt_mtP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_REDUNDANT_WRT_MT, assertion)) {
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
                                        SubLObject _prev_bind_0_82 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_redundant_wrt_mts(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_83, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_82, thread);
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
                                return list($ASSERTION_REDUNDANT_WRT_MT, assertion, data);
                            } else {
                                return list($ASSERTION_REDUNDANT_WRT_MT, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_redundant_wrt_mtP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_assertion_redundant_wrt_mts(SubLObject assertion) {
        {
            SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject doneP = NIL;
            if ((NIL != mt) && (NIL != clause_struc)) {
                {
                    SubLObject rest = NIL;
                    for (rest = clause_strucs.clause_struc_assertions(clause_struc); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject similar_assertion = rest.first();
                            if (!assertion.eql(similar_assertion)) {
                                {
                                    SubLObject other_mt = assertions_high.assertion_mt(similar_assertion);
                                    if (NIL != genl_mts.genl_mtP(mt, other_mt, UNPROVIDED, UNPROVIDED)) {
                                        kbi_utilities.add_kbi_result(other_mt);
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

    public static final SubLObject kbi_nl_why_assertion_redundant_wrt_mtP(SubLObject assertion, SubLObject data) {
        return format(NIL, $str_alt150$the_formula_of_this_assertion_is_, string_utilities.stringify_items(data, symbol_function(STR), $str_alt67$__, $str_alt68$_and_));
    }







    /**
     * test ASSERTION for redundant #$isa literals
     */
    public static final SubLObject assertion_redundant_wrt_isaP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_REDUNDANT_WRT_ISA)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_REDUNDANT_WRT_ISA, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_REDUNDANT_WRT_ISA);
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
                                            SubLObject _prev_bind_0_84 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_redundant_isa_literals(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_85, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_84, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_REDUNDANT_WRT_ISA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-REDUNDANT-WRT-ISA applies to ASSERTION
     */
    public static final SubLObject why_assertion_redundant_wrt_isaP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_REDUNDANT_WRT_ISA, assertion)) {
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
                                        SubLObject _prev_bind_0_86 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_redundant_isa_literals(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_87, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_86, thread);
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
                                return list($ASSERTION_REDUNDANT_WRT_ISA, assertion, data);
                            } else {
                                return list($ASSERTION_REDUNDANT_WRT_ISA, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_redundant_wrt_isaP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_redundant_wrt_isaP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt159$Literals_that_are_redundant__e_g_;
            SubLObject cdolist_list_var = data;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                nl_result = cconcatenate(nl_result, format(NIL, $str_alt160$_____s, lit));
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_redundant_isa_literals(SubLObject assertion) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject isa_lits = clause_utilities.cnf_isa_lits(cnf);
            SubLObject neg_lits = clauses.neg_lits(cnf);
            SubLObject tou_lits = el_utilities.tou_lits(neg_lits);
            SubLObject doneP = NIL;
            if (NIL != isa_lits) {
                {
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    SubLObject el_neg_lits = set_difference(set_difference(neg_lits, tou_lits, symbol_function(EQUAL), UNPROVIDED), isa_lits, symbol_function(EQUAL), UNPROVIDED);
                    SubLObject var_isas = at_var_types.cnfs_variables_isa_constraints(list(clauses.make_cnf(el_neg_lits, NIL)), mt, UNPROVIDED);
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = isa_lits;
                            SubLObject isa_lit = NIL;
                            for (isa_lit = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_lit = csome_list_var.first()) {
                                {
                                    SubLObject datum = isa_lit;
                                    SubLObject current = datum;
                                    SubLObject pred = NIL;
                                    SubLObject var = NIL;
                                    SubLObject col = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt161);
                                    pred = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt161);
                                    var = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt161);
                                    col = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if ((NIL != term.el_fort_p(col)) && (NIL != genls.any_specP(col, assoc(var, var_isas, UNPROVIDED, UNPROVIDED).rest(), UNPROVIDED, UNPROVIDED))) {
                                            kbi_utilities.add_kbi_result(list(pred, el_var_of(var, assertion), col));
                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt161);
                                    }
                                }
                            }
                        }
                    }
                    return kbi_utilities.kbi_result();
                }
            }
        }
        return NIL;
    }

    public static final SubLObject el_var_of(SubLObject hl_var, SubLObject assertion) {
        return nth(variables.variable_id(hl_var), assertions_high.assertion_el_variables(assertion));
    }







    /**
     * test ASSERTION for #$isa literals that are too weak
     */
    public static final SubLObject assertion_isa_too_weakP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_ISA_TOO_WEAK)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_ISA_TOO_WEAK, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_ISA_TOO_WEAK);
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
                                                        kbi_assertion_isa_too_weak(assertion);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_ISA_TOO_WEAK, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-ISA-TOO-WEAK applies to ASSERTION
     */
    public static final SubLObject why_assertion_isa_too_weakP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_ISA_TOO_WEAK, assertion)) {
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
                                                    kbi_assertion_isa_too_weak(assertion);
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
                                return list($ASSERTION_ISA_TOO_WEAK, assertion, data);
                            } else {
                                return list($ASSERTION_ISA_TOO_WEAK, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_isa_too_weakP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_isa_too_weakP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt170$isa_literals_that_are_too_weak__e;
            SubLObject cdolist_list_var = data;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                nl_result = cconcatenate(nl_result, format(NIL, $str_alt160$_____s, lit));
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_assertion_isa_too_weak(SubLObject assertion) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject isa_lits = clause_utilities.cnf_isa_lits(cnf);
            SubLObject neg_lits = clauses.neg_lits(cnf);
            SubLObject tou_lits = el_utilities.tou_lits(neg_lits);
            SubLObject doneP = NIL;
            if (NIL != isa_lits) {
                {
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    SubLObject el_neg_lits = set_difference(set_difference(neg_lits, tou_lits, symbol_function(EQUAL), UNPROVIDED), isa_lits, symbol_function(EQUAL), UNPROVIDED);
                    SubLObject var_isas = at_var_types.cnfs_variables_isa_constraints(list(clauses.make_cnf(el_neg_lits, NIL)), mt, UNPROVIDED);
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = isa_lits;
                            SubLObject isa_lit = NIL;
                            for (isa_lit = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_lit = csome_list_var.first()) {
                                {
                                    SubLObject datum = isa_lit;
                                    SubLObject current = datum;
                                    SubLObject pred = NIL;
                                    SubLObject var = NIL;
                                    SubLObject col = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt161);
                                    pred = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt161);
                                    var = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt161);
                                    col = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if ((NIL != term.el_fort_p(col)) && (NIL != genls.any_specP(col, remove(col, assoc(var, var_isas, UNPROVIDED, UNPROVIDED).rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                                            kbi_utilities.add_kbi_result(list(pred, el_var_of(var, assertion), col));
                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt161);
                                    }
                                }
                            }
                        }
                    }
                    return kbi_utilities.kbi_result();
                }
            }
        }
        return NIL;
    }







    /**
     * test ASSERTION for literals whose predicates are too weak
     */
    public static final SubLObject assertion_pred_too_weakP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_PRED_TOO_WEAK)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_PRED_TOO_WEAK, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_PRED_TOO_WEAK);
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
                                            SubLObject _prev_bind_0_92 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_pred_too_weak(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_93, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_92, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_PRED_TOO_WEAK, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-PRED-TOO-WEAK applies to ASSERTION
     */
    public static final SubLObject why_assertion_pred_too_weakP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_PRED_TOO_WEAK, assertion)) {
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
                                        SubLObject _prev_bind_0_94 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_pred_too_weak(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_95, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_94, thread);
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
                                return list($ASSERTION_PRED_TOO_WEAK, assertion, data);
                            } else {
                                return list($ASSERTION_PRED_TOO_WEAK, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_pred_too_weakP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_pred_too_weakP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt179$literals_that_are_too_weak__e_g__;
            SubLObject cdolist_list_var = data;
            SubLObject predXlit = NIL;
            for (predXlit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predXlit = cdolist_list_var.first()) {
                {
                    SubLObject lit = second(predXlit);
                    SubLObject spec_pred = predXlit.first();
                    SubLObject genl_pred = el_utilities.literal_arg0(lit, UNPROVIDED);
                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt180$_____s_should_be_replaced_with__s, new SubLObject[]{ genl_pred, spec_pred, lit }));
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_assertion_pred_too_weak(SubLObject assertion) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject pos_lits = clauses.pos_lits(cnf);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = pos_lits;
                    SubLObject lit = NIL;
                    for (lit = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit = csome_list_var.first()) {
                        {
                            SubLObject pred = el_utilities.literal_arg0(lit, UNPROVIDED);
                            SubLObject typed_spec_preds = (NIL != forts.fort_p(pred)) ? ((SubLObject) (kb_mapping_utilities.pred_values_in_relevant_mts(pred, $$typedGenlPreds, mt, TWO_INTEGER, ONE_INTEGER, $TRUE))) : NIL;
                            SubLObject typed_spec_inverses = (NIL != forts.fort_p(pred)) ? ((SubLObject) (kb_mapping_utilities.pred_values_in_relevant_mts(pred, $$typedGenlInverse, mt, TWO_INTEGER, ONE_INTEGER, $TRUE))) : NIL;
                            SubLObject vars_isas = ((NIL != typed_spec_preds) || (NIL != typed_spec_inverses)) ? ((SubLObject) (at_var_types.cnfs_variables_isa_constraints(list(cnf), mt, UNPROVIDED))) : NIL;
                            if (NIL != typed_spec_preds) {
                                {
                                    SubLObject args = el_utilities.literal_args(lit, UNPROVIDED);
                                    if (NIL != forts.fort_p(pred)) {
                                        if (NIL == doneP) {
                                            {
                                                SubLObject csome_list_var_96 = typed_spec_preds;
                                                SubLObject typed_spec_pred = NIL;
                                                for (typed_spec_pred = csome_list_var_96.first(); !((NIL != doneP) || (NIL == csome_list_var_96)); csome_list_var_96 = csome_list_var_96.rest() , typed_spec_pred = csome_list_var_96.first()) {
                                                    {
                                                        SubLObject argnum = ONE_INTEGER;
                                                        SubLObject failing_argP = NIL;
                                                        if (NIL == failing_argP) {
                                                            {
                                                                SubLObject csome_list_var_97 = args;
                                                                SubLObject arg = NIL;
                                                                for (arg = csome_list_var_97.first(); !((NIL != failing_argP) || (NIL == csome_list_var_97)); csome_list_var_97 = csome_list_var_97.rest() , arg = csome_list_var_97.first()) {
                                                                    {
                                                                        SubLObject arg_isas = kb_accessors.argn_isa(typed_spec_pred, argnum, mt);
                                                                        if (NIL != variables.variable_p(arg)) {
                                                                            {
                                                                                SubLObject var_isas = assoc(arg, vars_isas, UNPROVIDED, UNPROVIDED).rest();
                                                                                failing_argP = makeBoolean(NIL != set_difference(genls.min_cols(append(var_isas, arg_isas), mt, UNPROVIDED), var_isas, UNPROVIDED, UNPROVIDED));
                                                                            }
                                                                        } else {
                                                                            failing_argP = makeBoolean(NIL == isa.all_isaP(arg, arg_isas, mt, UNPROVIDED));
                                                                        }
                                                                    }
                                                                    argnum = add(argnum, ONE_INTEGER);
                                                                }
                                                            }
                                                        }
                                                        if (NIL == failing_argP) {
                                                            kbi_utilities.add_kbi_result(list(typed_spec_pred, lit));
                                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL == doneP) {
                                if (NIL != typed_spec_inverses) {
                                    {
                                        SubLObject args = el_utilities.literal_args(lit, UNPROVIDED);
                                        if (NIL != forts.fort_p(pred)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var_98 = typed_spec_inverses;
                                                    SubLObject typed_spec_inverse = NIL;
                                                    for (typed_spec_inverse = csome_list_var_98.first(); !((NIL != doneP) || (NIL == csome_list_var_98)); csome_list_var_98 = csome_list_var_98.rest() , typed_spec_inverse = csome_list_var_98.first()) {
                                                        {
                                                            SubLObject argnum = ONE_INTEGER;
                                                            SubLObject failing_argP = NIL;
                                                            if (NIL == failing_argP) {
                                                                {
                                                                    SubLObject csome_list_var_99 = args;
                                                                    SubLObject arg = NIL;
                                                                    for (arg = csome_list_var_99.first(); !((NIL != failing_argP) || (NIL == csome_list_var_99)); csome_list_var_99 = csome_list_var_99.rest() , arg = csome_list_var_99.first()) {
                                                                        {
                                                                            SubLObject arg_isas = kb_accessors.argn_isa(typed_spec_inverse, misc_utilities.other_binary_arg(argnum), mt);
                                                                            if (NIL != variables.variable_p(arg)) {
                                                                                {
                                                                                    SubLObject var_isas = assoc(arg, vars_isas, UNPROVIDED, UNPROVIDED).rest();
                                                                                    failing_argP = makeBoolean(NIL != set_difference(genls.min_cols(append(var_isas, arg_isas), mt, UNPROVIDED), var_isas, UNPROVIDED, UNPROVIDED));
                                                                                }
                                                                            } else {
                                                                                failing_argP = makeBoolean(NIL == isa.all_isaP(arg, arg_isas, mt, UNPROVIDED));
                                                                            }
                                                                        }
                                                                        argnum = add(argnum, ONE_INTEGER);
                                                                    }
                                                                }
                                                            }
                                                            if (NIL == failing_argP) {
                                                                kbi_utilities.add_kbi_result(list(typed_spec_inverse, lit));
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
                        }
                    }
                }
            }
        }
        return kbi_utilities.kbi_result();
    }

    // defparameter
    public static final SubLSymbol $assertion_non_constant_arg_isa_wXo_defns_results$ = makeSymbol("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_non_constant_arg_isa_wXo_defns_time$ = makeSymbol("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_non_constant_arg_isa_wXo_defns_count$ = makeSymbol("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-COUNT*");

    /**
     * test ASSERTION for non-constant args not admitted by defns
     */
    public static final SubLObject assertion_non_constant_arg_isa_wXo_defnsP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw190$ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS)) && (NIL != kbi_utilities.kbi_applies_toP($kw190$ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw190$ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS);
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
                                            SubLObject _prev_bind_0_100 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_non_constant_arg_types_wXo_defns(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_101 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_101, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_100, thread);
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
                    kbi_utilities.kbi_increment_time($kw190$ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS applies to ASSERTION
     */
    public static final SubLObject why_assertion_non_constant_arg_isa_wXo_defnsP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw190$ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS, assertion)) {
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
                                        SubLObject _prev_bind_0_102 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_non_constant_arg_types_wXo_defns(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_103, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_102, thread);
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
                                return list($kw190$ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS, assertion, data);
                            } else {
                                return list($kw190$ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_non_constant_arg_isa_wXo_defnsP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_non_constant_arg_isa_wXo_defnsP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt192$non_constant_args_w_o_defns__inva;
            SubLObject cdolist_list_var = data;
            SubLObject litXargXisa = NIL;
            for (litXargXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , litXargXisa = cdolist_list_var.first()) {
                {
                    SubLObject datum = litXargXisa;
                    SubLObject current = datum;
                    SubLObject lit = NIL;
                    SubLObject arg = NIL;
                    SubLObject v_isa = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt193);
                    lit = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt193);
                    arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt193);
                    v_isa = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt193);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt194$___s_in__s_violates___isa_constra, new SubLObject[]{ arg, lit, v_isa, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt193);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_assertion_non_constant_arg_types_wXo_defns(SubLObject assertion) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = clauses.neg_lits(cnf);
                    SubLObject literal = NIL;
                    for (literal = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , literal = csome_list_var.first()) {
                        non_constant_arg_types_wXo_defns(literal, mt);
                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                    }
                }
            }
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = clauses.pos_lits(cnf);
                    SubLObject literal = NIL;
                    for (literal = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , literal = csome_list_var.first()) {
                        non_constant_arg_types_wXo_defns(literal, mt);
                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject non_constant_arg_types_wXo_defns(SubLObject reln_expr, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject pos = ZERO_INTEGER;
            SubLObject relation = cycl_utilities.formula_operator(reln_expr);
            SubLObject doneP = NIL;
            if (NIL != forts.fort_p(relation)) {
                {
                    SubLObject args = cycl_utilities.formula_args(reln_expr, UNPROVIDED);
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = args;
                            SubLObject arg = NIL;
                            for (arg = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                pos = add(pos, ONE_INTEGER);
                                if (NIL == forts.fort_p(arg)) {
                                    if (NIL == arg_type.relation_arg_okP(relation, arg, pos, at_utilities.arg_type_mt(relation, args, pos, mt))) {
                                        if (NIL == doneP) {
                                            {
                                                SubLObject csome_list_var_104 = kb_accessors.argn_isa(relation, pos, mt);
                                                SubLObject type = NIL;
                                                for (type = csome_list_var_104.first(); !((NIL != doneP) || (NIL == csome_list_var_104)); csome_list_var_104 = csome_list_var_104.rest() , type = csome_list_var_104.first()) {
                                                    if (!((NIL != kb_accessors.admitting_defnsP(type, mt)) || (NIL != at_defns.suf_defn_assertions(type)))) {
                                                        if (NIL == isa.isaP(arg, type, mt, UNPROVIDED)) {
                                                            kbi_utilities.add_kbi_result(list(reln_expr, arg, type, mt));
                                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL != term.nautP(arg, UNPROVIDED)) {
                                            non_constant_arg_types_wXo_defns(arg, mt);
                                        } else
                                            if (NIL != term.sentenceP(arg, UNPROVIDED)) {
                                                non_constant_arg_types_wXo_defns(arg, mt);
                                            }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }







    /**
     * test ASSERTION for being non canonical
     */
    public static final SubLObject assertion_not_canonicalP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_NOT_CANONICAL)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_NOT_CANONICAL, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_NOT_CANONICAL);
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
                                            SubLObject _prev_bind_0_105 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_not_canonical(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_106, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_105, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_NOT_CANONICAL, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-NOT-CANONICAL applies to ASSERTION
     */
    public static final SubLObject why_assertion_not_canonicalP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_NOT_CANONICAL, assertion)) {
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
                                        SubLObject _prev_bind_0_107 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_not_canonical(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_108 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_108, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_107, thread);
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
                                return list($ASSERTION_NOT_CANONICAL, assertion, data);
                            } else {
                                return list($ASSERTION_NOT_CANONICAL, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_not_canonicalP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject non_canonical_assertionP(SubLObject assertion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        {
            SubLObject new_cnf = recomputed_assertion_cnf(assertion, mt);
            SubLObject old_cnf = assertions_high.assertion_cnf(assertion);
            SubLObject non_canonicalP = makeBoolean(!old_cnf.equal(new_cnf));
            return non_canonicalP;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_not_canonicalP(SubLObject assertion, SubLObject data) {
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject old_cnf = NIL;
            SubLObject new_cnf = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt203);
            old_cnf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt203);
            new_cnf = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt204$__this_assertion_has_old_cnf_____, old_cnf, new_cnf);
            } else {
                cdestructuring_bind_error(datum, $list_alt203);
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_assertion_not_canonical(SubLObject assertion) {
        {
            SubLObject old_cnf = assertions_high.assertion_cnf(assertion);
            SubLObject new_cnf = recomputed_assertion_cnf(assertion, UNPROVIDED);
            if (!old_cnf.equal(new_cnf)) {
                kbi_utilities.set_kbi_result(list(old_cnf, new_cnf));
            }
        }
        kbi_utilities.nreverse_kbi_result();
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject recomputed_assertion_cnf(SubLObject assertion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnf = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_vars.$inhibit_skolem_assertsP$.currentBinding(thread);
                    try {
                        control_vars.$within_assert$.bind(T, thread);
                        wff_vars.$inhibit_skolem_assertsP$.bind(NIL, thread);
                        {
                            SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
                            SubLObject strength = assertions_high.assertion_strength(assertion);
                            SubLObject canon_versions = czer_main.canonicalize_cycl(formula, mt);
                            cnf = (NIL != list_utilities.singletonP(canon_versions)) ? ((SubLObject) (fi.fi_canonicalize(canon_versions.first(), T, strength))) : NIL;
                        }
                    } finally {
                        wff_vars.$inhibit_skolem_assertsP$.rebind(_prev_bind_1, thread);
                        control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return cnf;
            }
        }
    }







    /**
     * test ASSERTION for being non accessible via tl
     */
    public static final SubLObject assertion_not_accessibleP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_NOT_ACCESSIBLE)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_NOT_ACCESSIBLE, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_NOT_ACCESSIBLE);
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
                                            SubLObject _prev_bind_0_109 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_not_accessibleP(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_110 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_110, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_109, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_NOT_ACCESSIBLE, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-NOT-ACCESSIBLE applies to ASSERTION
     */
    public static final SubLObject why_assertion_not_accessibleP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_NOT_ACCESSIBLE, assertion)) {
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
                                        SubLObject _prev_bind_0_111 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_not_accessibleP(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_112, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_111, thread);
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
                                return list($ASSERTION_NOT_ACCESSIBLE, assertion, data);
                            } else {
                                return list($ASSERTION_NOT_ACCESSIBLE, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_not_accessibleP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_not_accessibleP(SubLObject assertion, SubLObject data) {
        return format(NIL, $str_alt213$This_assertion_is_inaccessible_vi, fi.assertion_fi_ist_formula(assertion, UNPROVIDED));
    }

    /**
     * Returns T iff ASSERTION el formula won't recanonicalize to itself via tl
     */
    public static final SubLObject kbi_assertion_not_accessibleP(SubLObject assertion) {
        kbi_utilities.set_kbi_result(makeBoolean(NIL == canon_tl.assertion_unassertible_via_tlP(assertion)));
        return kbi_utilities.kbi_result();
    }







    /**
     * test ASSERTION for being not accessible via el
     */
    public static final SubLObject assertion_not_accessible_via_elP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_NOT_ACCESSIBLE_VIA_EL)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_NOT_ACCESSIBLE_VIA_EL, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_NOT_ACCESSIBLE_VIA_EL);
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
                                            SubLObject _prev_bind_0_113 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_not_accessible_via_elP(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_114, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_113, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_NOT_ACCESSIBLE_VIA_EL, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-NOT-ACCESSIBLE-VIA-EL applies to ASSERTION
     */
    public static final SubLObject why_assertion_not_accessible_via_elP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_NOT_ACCESSIBLE_VIA_EL, assertion)) {
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
                                        SubLObject _prev_bind_0_115 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_not_accessible_via_elP(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_116 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_116, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_115, thread);
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
                                return list($ASSERTION_NOT_ACCESSIBLE_VIA_EL, assertion, data);
                            } else {
                                return list($ASSERTION_NOT_ACCESSIBLE_VIA_EL, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_not_accessible_via_elP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_not_accessible_via_elP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt60$;
            SubLObject datum = why_assertion_inaccessible_via_el(assertion);
            SubLObject current = datum;
            SubLObject old_cnf = NIL;
            SubLObject new_cnfs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt222);
            old_cnf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt222);
            new_cnfs = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject line = format(NIL, $str_alt223$This_assertion_has_old_cnf______s, new SubLObject[]{ old_cnf, NIL != new_cnfs.rest() ? ((SubLObject) ($$$s)) : $str_alt60$, new_cnfs.first() });
                    SubLObject cdolist_list_var = new_cnfs.rest();
                    SubLObject new_cnf = NIL;
                    for (new_cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_cnf = cdolist_list_var.first()) {
                        line = string_utilities.add_line(line, format(NIL, $str_alt225$_s, new_cnf), $str_alt226$__, UNPROVIDED);
                    }
                    nl_result = string_utilities.add_line(line, nl_result, UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt222);
            }
            return nl_result;
        }
    }

    /**
     * Returns T iff ASSERTION el formula won't recanonicalize to itself via el
     */
    public static final SubLObject kbi_assertion_not_accessible_via_elP(SubLObject assertion) {
        kbi_utilities.set_kbi_result(czer_main.canonicalizer_problemP(assertion));
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject why_assertion_inaccessible_via_el(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject old_cnf = assertions_high.assertion_cnf(assertion);
                SubLObject canon_versions = czer_main.canonicalize_cycl(formula, mt);
                SubLObject mal_cnfs = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        if (canon_versions.isCons()) {
                            {
                                SubLObject cdolist_list_var = canon_versions;
                                SubLObject canon_version = NIL;
                                for (canon_version = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , canon_version = cdolist_list_var.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cnf = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
                                        SubLObject v_variables = thread.secondMultipleValue();
                                        SubLObject hl_tv = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        if (!assertion.eql(kb_indexing.find_assertion(cnf, mt))) {
                                            mal_cnfs = cons(cnf, mal_cnfs);
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
                return list(old_cnf, mal_cnfs);
            }
        }
    }







    /**
     * test ASSERTION for being not askable
     */
    public static final SubLObject assertion_not_askable_at_elP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_NOT_ASKABLE_AT_EL)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_NOT_ASKABLE_AT_EL, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_NOT_ASKABLE_AT_EL);
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
                                            SubLObject _prev_bind_0_117 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_not_askable_at_elP(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_118, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_117, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_NOT_ASKABLE_AT_EL, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-NOT-ASKABLE-AT-EL applies to ASSERTION
     */
    public static final SubLObject why_assertion_not_askable_at_elP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_NOT_ASKABLE_AT_EL, assertion)) {
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
                                        SubLObject _prev_bind_0_119 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_not_askable_at_elP(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_120 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_120, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_119, thread);
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
                                return list($ASSERTION_NOT_ASKABLE_AT_EL, assertion, data);
                            } else {
                                return list($ASSERTION_NOT_ASKABLE_AT_EL, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_not_askable_at_elP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_not_askable_at_elP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt60$;
            SubLObject datum = why_assertion_unaskable_at_elP(assertion);
            SubLObject current = datum;
            SubLObject old_cnf = NIL;
            SubLObject new_cnfs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt222);
            old_cnf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt222);
            new_cnfs = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject line = format(NIL, $str_alt223$This_assertion_has_old_cnf______s, new SubLObject[]{ old_cnf, NIL != new_cnfs.rest() ? ((SubLObject) ($$$s)) : $str_alt60$, new_cnfs.first() });
                    SubLObject cdolist_list_var = new_cnfs.rest();
                    SubLObject new_cnf = NIL;
                    for (new_cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_cnf = cdolist_list_var.first()) {
                        line = string_utilities.add_line(line, format(NIL, $str_alt225$_s, new_cnf), $str_alt226$__, UNPROVIDED);
                    }
                    nl_result = string_utilities.add_line(line, nl_result, UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt222);
            }
            return nl_result;
        }
    }

    /**
     * Returns T iff ASSERTION el formula won't recanonicalize to itself as an ask
     */
    public static final SubLObject kbi_assertion_not_askable_at_elP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    SubLObject truth = assertions_high.assertion_truth(assertion);
                    {
                        SubLObject _prev_bind_0 = control_vars.$within_ask$.currentBinding(thread);
                        try {
                            control_vars.$within_ask$.bind(T, thread);
                            kbi_utilities.set_kbi_result(makeBoolean(NIL == backward.removal_ask(formula, mt, truth, UNPROVIDED)));
                        } finally {
                            control_vars.$within_ask$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject why_assertion_unaskable_at_elP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    SubLObject old_cnf = assertions_high.assertion_cnf(assertion);
                    SubLObject canon_versions = czer_main.canonicalize_ask(formula, mt);
                    SubLObject mal_cnfs = NIL;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            if (canon_versions.isCons()) {
                                {
                                    SubLObject cdolist_list_var = canon_versions;
                                    SubLObject canon_version = NIL;
                                    for (canon_version = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , canon_version = cdolist_list_var.first()) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject cnf = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
                                            SubLObject v_variables = thread.secondMultipleValue();
                                            SubLObject hl_tv = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (!cnf.equal(old_cnf)) {
                                                mal_cnfs = cons(cnf, mal_cnfs);
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
                    return list(old_cnf, mal_cnfs);
                }
            }
            return NIL;
        }
    }







    /**
     * test ASSERTION for being not askable
     */
    public static final SubLObject assertion_not_askable_at_fiP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_NOT_ASKABLE_AT_FI)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_NOT_ASKABLE_AT_FI, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_NOT_ASKABLE_AT_FI);
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
                                            SubLObject _prev_bind_0_121 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_not_askable_at_fiP(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_122 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_122, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_121, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_NOT_ASKABLE_AT_FI, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-NOT-ASKABLE-AT-FI applies to ASSERTION
     */
    public static final SubLObject why_assertion_not_askable_at_fiP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_NOT_ASKABLE_AT_FI, assertion)) {
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
                                        SubLObject _prev_bind_0_123 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_not_askable_at_fiP(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_124 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_124, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_123, thread);
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
                                return list($ASSERTION_NOT_ASKABLE_AT_FI, assertion, data);
                            } else {
                                return list($ASSERTION_NOT_ASKABLE_AT_FI, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_not_askable_at_fiP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_not_askable_at_fiP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt60$;
            SubLObject datum = why_assertion_unaskable_at_fiP(assertion);
            SubLObject current = datum;
            SubLObject old_cnf = NIL;
            SubLObject new_cnfs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt222);
            old_cnf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt222);
            new_cnfs = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject line = format(NIL, $str_alt223$This_assertion_has_old_cnf______s, new SubLObject[]{ old_cnf, NIL != new_cnfs.rest() ? ((SubLObject) ($$$s)) : $str_alt60$, new_cnfs.first() });
                    SubLObject cdolist_list_var = new_cnfs.rest();
                    SubLObject new_cnf = NIL;
                    for (new_cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_cnf = cdolist_list_var.first()) {
                        line = string_utilities.add_line(line, format(NIL, $str_alt225$_s, new_cnf), $str_alt226$__, UNPROVIDED);
                    }
                    nl_result = string_utilities.add_line(line, nl_result, UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt222);
            }
            return nl_result;
        }
    }

    /**
     * Returns T iff ASSERTION fi formula won't recanonicalize to itself as an ask
     */
    public static final SubLObject kbi_assertion_not_askable_at_fiP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    SubLObject truth = assertions_high.assertion_truth(assertion);
                    {
                        SubLObject _prev_bind_0 = control_vars.$within_ask$.currentBinding(thread);
                        try {
                            control_vars.$within_ask$.bind(T, thread);
                            kbi_utilities.set_kbi_result(makeBoolean(NIL == backward.removal_ask(formula, mt, truth, UNPROVIDED)));
                        } finally {
                            control_vars.$within_ask$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject why_assertion_unaskable_at_fiP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    SubLObject old_cnf = assertions_high.assertion_cnf(assertion);
                    SubLObject canon_versions = czer_main.canonicalize_ask(formula, mt);
                    SubLObject mal_cnfs = NIL;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            if (canon_versions.isCons()) {
                                {
                                    SubLObject cdolist_list_var = canon_versions;
                                    SubLObject canon_version = NIL;
                                    for (canon_version = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , canon_version = cdolist_list_var.first()) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject cnf = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
                                            SubLObject v_variables = thread.secondMultipleValue();
                                            SubLObject hl_tv = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (!cnf.equal(old_cnf)) {
                                                mal_cnfs = cons(cnf, mal_cnfs);
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
                    return list(old_cnf, mal_cnfs);
                }
            }
            return NIL;
        }
    }







    /**
     * test ASSERTION for wff violations
     */
    public static final SubLObject kbi_assertion_not_wffP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($KBI_ASSERTION_NOT_WFF)) && (NIL != kbi_utilities.kbi_applies_toP($KBI_ASSERTION_NOT_WFF, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($KBI_ASSERTION_NOT_WFF);
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
                                            SubLObject _prev_bind_0_125 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_not_wff_int(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_126 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_126, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_125, thread);
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
                    kbi_utilities.kbi_increment_time($KBI_ASSERTION_NOT_WFF, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :KBI-ASSERTION-NOT-WFF applies to ASSERTION
     */
    public static final SubLObject why_assertion_not_wffP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($KBI_ASSERTION_NOT_WFF, assertion)) {
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
                                        SubLObject _prev_bind_0_127 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_not_wff_int(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_128, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_127, thread);
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
                                return list($KBI_ASSERTION_NOT_WFF, assertion, data);
                            } else {
                                return list($KBI_ASSERTION_NOT_WFF, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_not_wffP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }



    public static final SubLObject kbi_nl_why_assertion_not_wffP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt253$this_assertion_has_the_following_, NIL != list_utilities.singletonP(data) ? ((SubLObject) ($str_alt60$)) : $$$s);
            SubLObject cdolist_list_var = data;
            SubLObject violation = NIL;
            for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , violation = cdolist_list_var.first()) {
                nl_result = cconcatenate(nl_result, wff.explain_wff_violation(violation, UNPROVIDED));
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_assertion_not_wff_int(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                SubLObject _prev_bind_1 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                SubLObject _prev_bind_2 = wff_utilities.$check_arityP$.currentBinding(thread);
                SubLObject _prev_bind_3 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                SubLObject _prev_bind_4 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                SubLObject _prev_bind_6 = wff_vars.$wff_violations$.currentBinding(thread);
                SubLObject _prev_bind_7 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                SubLObject _prev_bind_8 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                try {
                    control_vars.$within_assert$.bind(T, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                    wff_utilities.$check_arityP$.bind(T, thread);
                    wff_utilities.$check_arg_typesP$.bind(T, thread);
                    at_vars.$accumulating_at_violationsP$.bind(wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread), thread);
                    wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                    wff_vars.$wff_violations$.bind(NIL, thread);
                    wff_vars.$noting_wff_violationsP$.bind(T, thread);
                    wff_vars.$accumulating_wff_violationsP$.bind(consp($kbi_selected_wff_violations$.getDynamicValue(thread)), thread);
                    {
                        SubLObject formula = fi.assertion_fi_formula(assertion, T);
                        SubLObject mt = assertions_high.assertion_mt(assertion);
                        SubLObject doneP = NIL;
                        wff.el_wffP(formula, mt, UNPROVIDED);
                        if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = wff_vars.$wff_violations$.getDynamicValue(thread);
                                    SubLObject violation = NIL;
                                    for (violation = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , violation = csome_list_var.first()) {
                                        if ((NIL == $kbi_selected_wff_violations$.getDynamicValue(thread)) || (NIL != subl_promotions.memberP(violation.first(), $kbi_selected_wff_violations$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                                            kbi_utilities.add_kbi_result(violation);
                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_8, thread);
                    wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_7, thread);
                    wff_vars.$wff_violations$.rebind(_prev_bind_6, thread);
                    wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
                    at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_4, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arityP$.rebind(_prev_bind_2, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_1, thread);
                    control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject assertion_not_wff_due_to_arg_of_typeP(SubLObject assertion, SubLObject collection) {
        {
            SubLObject why = why_assertion_not_wffP(assertion, $EL);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject ouiP = NIL;
            if (NIL == ouiP) {
                {
                    SubLObject csome_list_var = third(why);
                    SubLObject problem = NIL;
                    for (problem = csome_list_var.first(); !((NIL != ouiP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , problem = csome_list_var.first()) {
                        {
                            SubLObject mal_term = second(problem);
                            if (NIL != forts.fort_p(mal_term)) {
                                ouiP = makeBoolean((NIL != isa.isaP(mal_term, collection, mt, UNPROVIDED)) || (NIL != genls.genlP(mal_term, collection, mt, UNPROVIDED)));
                            }
                        }
                    }
                }
            }
            return ouiP;
        }
    }

    public static final SubLObject bad_arity_assertionP(SubLObject assertion) {
        return wff_utilities.assertion_not_wffP(assertion);
    }

    public static final SubLObject why_bad_arity_assertionP(SubLObject assertion) {
        return why_assertion_not_wffP(assertion, UNPROVIDED);
    }

    public static final SubLObject bad_arg_assertionP(SubLObject assertion) {
        return wff_utilities.assertion_not_wffP(assertion);
    }

    public static final SubLObject why_bad_arg_assertionP(SubLObject assertion) {
        return wff_utilities.assertion_not_wffP(assertion);
    }







    /**
     * test ASSERTION for wff violations
     */
    public static final SubLObject assertion_el_not_wffP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_EL_NOT_WFF)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_EL_NOT_WFF, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_EL_NOT_WFF);
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
                                            SubLObject _prev_bind_0_129 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_el_not_wff(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_130 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_130, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_129, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_EL_NOT_WFF, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-EL-NOT-WFF applies to ASSERTION
     */
    public static final SubLObject why_assertion_el_not_wffP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_EL_NOT_WFF, assertion)) {
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
                                        SubLObject _prev_bind_0_131 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_el_not_wff(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_132 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_132, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_131, thread);
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
                                return list($ASSERTION_EL_NOT_WFF, assertion, data);
                            } else {
                                return list($ASSERTION_EL_NOT_WFF, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_el_not_wffP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_el_not_wffP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt253$this_assertion_has_the_following_, NIL != list_utilities.singletonP(data) ? ((SubLObject) ($str_alt60$)) : $$$s);
            SubLObject cdolist_list_var = data;
            SubLObject violation = NIL;
            for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , violation = cdolist_list_var.first()) {
                nl_result = cconcatenate(nl_result, wff.explain_wff_violation(violation, UNPROVIDED));
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_assertion_el_not_wff(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                SubLObject _prev_bind_1 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                SubLObject _prev_bind_2 = wff_utilities.$check_arityP$.currentBinding(thread);
                SubLObject _prev_bind_3 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                SubLObject _prev_bind_4 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                SubLObject _prev_bind_5 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                SubLObject _prev_bind_6 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                try {
                    control_vars.$within_assert$.bind(T, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                    wff_utilities.$check_arityP$.bind(T, thread);
                    wff_utilities.$check_arg_typesP$.bind(T, thread);
                    wff_vars.$noting_wff_violationsP$.bind(T, thread);
                    wff_vars.$accumulating_wff_violationsP$.bind(makeBoolean(!kbi_macros.$kbi_doneP_fn$.getDynamicValue(thread).eql(symbol_function(KBI_DONE_IF_ANY_RESULT))), thread);
                    at_vars.$accumulating_at_violationsP$.bind(wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread), thread);
                    {
                        SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                        SubLObject mt = assertions_high.assertion_mt(assertion);
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
                    at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_6, thread);
                    wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_5, thread);
                    wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_4, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arityP$.rebind(_prev_bind_2, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_1, thread);
                    control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject assertion_el_not_wff_due_to_arg_of_typeP(SubLObject assertion, SubLObject collection) {
        {
            SubLObject why = why_assertion_el_not_wffP(assertion, $EL);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject ouiP = NIL;
            if (NIL == ouiP) {
                {
                    SubLObject csome_list_var = third(why);
                    SubLObject problem = NIL;
                    for (problem = csome_list_var.first(); !((NIL != ouiP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , problem = csome_list_var.first()) {
                        {
                            SubLObject mal_term = second(problem);
                            if (NIL != forts.fort_p(mal_term)) {
                                ouiP = makeBoolean((NIL != isa.isaP(mal_term, collection, mt, UNPROVIDED)) || (NIL != genls.genlP(mal_term, collection, mt, UNPROVIDED)));
                            }
                        }
                    }
                }
            }
            return ouiP;
        }
    }







    /**
     * test for #$informStatement assertion w/o corresponding #$ist assertion
     */
    public static final SubLObject assertion_inform_mising_istP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($ASSERTION_INFORM_MISING_IST)) && (NIL != kbi_utilities.kbi_applies_toP($ASSERTION_INFORM_MISING_IST, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($ASSERTION_INFORM_MISING_IST);
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
                                            SubLObject _prev_bind_0_133 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_inform_mising_istP(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_134 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_134, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_133, thread);
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
                    kbi_utilities.kbi_increment_time($ASSERTION_INFORM_MISING_IST, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-INFORM-MISING-IST applies to ASSERTION
     */
    public static final SubLObject why_assertion_inform_mising_istP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($ASSERTION_INFORM_MISING_IST, assertion)) {
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
                                        SubLObject _prev_bind_0_135 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_inform_mising_istP(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_136 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_136, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_135, thread);
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
                                return list($ASSERTION_INFORM_MISING_IST, assertion, data);
                            } else {
                                return list($ASSERTION_INFORM_MISING_IST, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_inform_mising_istP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_inform_mising_istP(SubLObject assertion, SubLObject data) {
        return $str_alt270$__informStatement_assertion_w_o_c;
    }

    public static final SubLObject kbi_assertion_inform_mising_istP(SubLObject assertion) {
        {
            SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
            if (formula.isCons() && (formula.first() == $$informStatement)) {
                {
                    SubLObject mt = second(formula);
                    SubLObject cnfXblists = czer_main.canonicalize_cycl(third(formula), mt);
                    SubLObject missingP = makeBoolean(!cnfXblists.isCons());
                    if (NIL == missingP) {
                        {
                            SubLObject csome_list_var = cnfXblists;
                            SubLObject cnfXblist = NIL;
                            for (cnfXblist = csome_list_var.first(); !((NIL != missingP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cnfXblist = csome_list_var.first()) {
                                {
                                    SubLObject datum = cnfXblist;
                                    SubLObject current = datum;
                                    SubLObject cnf = NIL;
                                    SubLObject blist = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt272);
                                    cnf = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt272);
                                    blist = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        missingP = makeBoolean(NIL == kb_indexing.find_assertion(cnf, mt));
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt272);
                                    }
                                }
                            }
                        }
                    }
                    kbi_utilities.set_kbi_result(missingP);
                }
            }
        }
        return kbi_utilities.kbi_result();
    }

    // defparameter
    public static final SubLSymbol $assertion_wXmal_doc_string_results$ = makeSymbol("*ASSERTION-W/MAL-DOC-STRING-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXmal_doc_string_time$ = makeSymbol("*ASSERTION-W/MAL-DOC-STRING-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXmal_doc_string_count$ = makeSymbol("*ASSERTION-W/MAL-DOC-STRING-COUNT*");

    /**
     * test ASSERTION for mal documentation string
     */
    public static final SubLObject assertion_wXmal_doc_stringP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw279$ASSERTION_W_MAL_DOC_STRING)) && (NIL != kbi_utilities.kbi_applies_toP($kw279$ASSERTION_W_MAL_DOC_STRING, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw279$ASSERTION_W_MAL_DOC_STRING);
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
                                            SubLObject _prev_bind_0_137 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_wXmal_doc_string(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_138 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_138, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_137, thread);
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
                    kbi_utilities.kbi_increment_time($kw279$ASSERTION_W_MAL_DOC_STRING, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/MAL-DOC-STRING applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXmal_doc_stringP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw279$ASSERTION_W_MAL_DOC_STRING, assertion)) {
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
                                        SubLObject _prev_bind_0_139 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_wXmal_doc_string(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_140 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_140, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_139, thread);
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
                                return list($kw279$ASSERTION_W_MAL_DOC_STRING, assertion, data);
                            } else {
                                return list($kw279$ASSERTION_W_MAL_DOC_STRING, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXmal_doc_stringP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_wXmal_doc_stringP(SubLObject assertion, SubLObject data) {
        return format(NIL, $str_alt281$the_documentation_string_this_of_, $$$s, string_utilities.stringify_items(data, symbol_function(IDENTITY), $str_alt67$__, $str_alt282$__and_));
    }

    public static final SubLObject kbi_assertion_wXmal_doc_string(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject literal = assertions_high.gaf_formula(assertion);
                SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
                SubLObject arg2 = el_utilities.literal_arg2(literal, UNPROVIDED);
                SubLObject doneP = NIL;
                if ((NIL != doc_predP(predicate, mt)) && arg2.isString()) {
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = dumper.mal_constant_references(arg2);
                            SubLObject mal_reference = NIL;
                            for (mal_reference = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mal_reference = csome_list_var.first()) {
                                kbi_utilities.adjoin_kbi_result(mal_reference, symbol_function($sym283$STRING_), UNPROVIDED);
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject doc_predP(SubLObject thing, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != fort_types_interface.predicateP(thing)) {
            return isa.quoted_isaP(thing, $$DocumentationConstant, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ist_diagnostics(SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        kbi_utilities.reset_kbi_state($ASSERTION);
        ist_diagnostics_int(mt, printP);
        return NIL;
    }

    public static final SubLObject mts_ist_diagnostics(SubLObject mts, SubLObject printP) {
        if (mts == UNPROVIDED) {
            mts = list(mt_relevance_macros.$mt$.getDynamicValue());
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        kbi_utilities.reset_kbi_state($ASSERTION);
        {
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                ist_diagnostics_int(mt, printP);
            }
        }
        return NIL;
    }

    /**
     * perform kbi diagnostics sweep on ASSERTIONS
     */
    public static final SubLObject ist_diagnostics_int(SubLObject mt, SubLObject printP) {
        if (mt == UNPROVIDED) {
            mt = kbi_vars.$kbi_mt$.getDynamicValue();
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_utilities.reset_kbi_state($ASSERTION);
            {
                SubLObject result = NIL;
                SubLObject assertions = kb_indexing_datastructures.final_index_leaves(kb_indexing.get_mt_subindex(mt));
                kbi_vars.$kbi_last_domain$.setDynamicValue($ASSERTION, thread);
                kbi_vars.$kbi_items_to_consider$.setDynamicValue(length(assertions), thread);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(kbi_vars.$kbi_relevant_mt_function$.getDynamicValue(thread), thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
                        {
                            SubLObject list_var = assertions;
                            utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt1$diagnosing__s_assertions, kbi_vars.$kbi_items_to_consider$.getDynamicValue(thread)), thread);
                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_141 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_142 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_143 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject assertion = NIL;
                                        for (assertion = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            diagnose_assertion(assertion);
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_143, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_142, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_141, thread);
                                }
                            }
                        }
                    } finally {
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
                            result = kbi_utilities.kbi_print_domain_results($ASSERTION);
                        } finally {
                            kbi_vars.$kbi_print_whyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    // defparameter
    public static final SubLSymbol $assertion_wXatomic_neg_lit_results$ = makeSymbol("*ASSERTION-W/ATOMIC-NEG-LIT-RESULTS*");

    // defparameter
    public static final SubLSymbol $assertion_wXatomic_neg_lit_time$ = makeSymbol("*ASSERTION-W/ATOMIC-NEG-LIT-TIME*");

    // defparameter
    public static final SubLSymbol $assertion_wXatomic_neg_lit_count$ = makeSymbol("*ASSERTION-W/ATOMIC-NEG-LIT-COUNT*");

    /**
     * test ASSERTION for negated atomic sentence
     */
    public static final SubLObject assertion_wXatomic_neg_litP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw291$ASSERTION_W_ATOMIC_NEG_LIT)) && (NIL != kbi_utilities.kbi_applies_toP($kw291$ASSERTION_W_ATOMIC_NEG_LIT, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw291$ASSERTION_W_ATOMIC_NEG_LIT);
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
                                            SubLObject _prev_bind_0_144 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_assertion_wXatomic_neg_litP(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_145 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_145, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_144, thread);
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
                    kbi_utilities.kbi_increment_time($kw291$ASSERTION_W_ATOMIC_NEG_LIT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :ASSERTION-W/ATOMIC-NEG-LIT applies to ASSERTION
     */
    public static final SubLObject why_assertion_wXatomic_neg_litP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw291$ASSERTION_W_ATOMIC_NEG_LIT, assertion)) {
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
                                        SubLObject _prev_bind_0_146 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_assertion_wXatomic_neg_litP(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_147 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_147, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_146, thread);
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
                                return list($kw291$ASSERTION_W_ATOMIC_NEG_LIT, assertion, data);
                            } else {
                                return list($kw291$ASSERTION_W_ATOMIC_NEG_LIT, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_assertion_wXatomic_neg_litP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_assertion_wXatomic_neg_litP(SubLObject assertion, SubLObject data) {
        return format(NIL, $str_alt293$this_assertion_is_a_negated_atomi);
    }

    public static final SubLObject kbi_assertion_wXatomic_neg_litP(SubLObject assertion) {
        kbi_utilities.set_kbi_result(atomic_neg_litP(assertion));
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject atomic_neg_litP(SubLObject assertion) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            return makeBoolean((length(clauses.neg_lits(cnf)).numE(ONE_INTEGER) && length(clauses.pos_lits(cnf)).numE(ZERO_INTEGER)) || ((NIL != assertions_high.gaf_assertionP(assertion)) && $FALSE.eql(assertions_high.assertion_truth(assertion))));
        }
    }







    /**
     * diagnose all clause-strucs indexed by ASSERTION
     */
    public static final SubLObject diagnose_assertion_axiomP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($DIAGNOSE_ASSERTION_AXIOM)) && (NIL != kbi_utilities.kbi_applies_toP($DIAGNOSE_ASSERTION_AXIOM, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($DIAGNOSE_ASSERTION_AXIOM);
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
                                            SubLObject _prev_bind_0_148 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_diagnoses_of_assertion_axiom(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_149 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_149, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_148, thread);
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
                    kbi_utilities.kbi_increment_time($DIAGNOSE_ASSERTION_AXIOM, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :DIAGNOSE-ASSERTION-AXIOM applies to ASSERTION
     */
    public static final SubLObject why_diagnoses_of_assertion_axiomP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($DIAGNOSE_ASSERTION_AXIOM, assertion)) {
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
                                        SubLObject _prev_bind_0_150 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_diagnoses_of_assertion_axiom(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_151 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_151, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_150, thread);
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
                                return list($DIAGNOSE_ASSERTION_AXIOM, assertion, data);
                            } else {
                                return list($DIAGNOSE_ASSERTION_AXIOM, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_diagnoses_of_assertion_axiomP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_diagnoses_of_assertion_axiomP(SubLObject assertion, SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nl_result = $str_alt60$;
                SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
                SubLObject axiom = (NIL != clause_struc) ? ((SubLObject) (clause_struc)) : fi.assertion_fi_cnf(assertion, UNPROVIDED);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                if (NIL != fort_types_interface.mtP(mt)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            {
                                SubLObject cdolist_list_var = data;
                                SubLObject module = NIL;
                                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                    {
                                        SubLObject why_diagnosis = kbi_utilities.kbi_whyP(module, axiom, UNPROVIDED);
                                        if (why_diagnosis.isString()) {
                                            nl_result = cconcatenate(nl_result, new SubLObject[]{ format(NIL, $str_alt303$__via_module__a_______, Strings.string_downcase(symbol_name(module), UNPROVIDED, UNPROVIDED)), why_diagnosis });
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
                return nl_result;
            }
        }
    }

    public static final SubLObject kbi_diagnoses_of_assertion_axiom(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
                SubLObject axiom_assertions_diagnoses_selectedP = kbi_utilities.kbi_module_selectedP($AXIOM_ASSERTIONS_DIAGNOSES);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject doneP = NIL;
                if (NIL != fort_types_interface.mtP(mt)) {
                    kbi_utilities.kbi_unselect_module($AXIOM_ASSERTIONS_DIAGNOSES);
                    {
                        SubLObject _prev_bind_0 = kbi_vars.$kbi_assertion$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            kbi_vars.$kbi_assertion$.bind(assertion, thread);
                            mt_relevance_macros.$mt$.bind(assertions_high.assertion_mt(assertion), thread);
                            if (NIL != clause_struc) {
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = kbi_axiom.diagnose_axiom(clause_struc, mt);
                                        SubLObject diagnosis = NIL;
                                        for (diagnosis = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , diagnosis = csome_list_var.first()) {
                                            kbi_utilities.add_kbi_result(diagnosis);
                                            if (NIL == kbi_vars.$kbi_caching_findingsP$.getDynamicValue(thread)) {
                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject fi_cnf = fi.assertion_fi_cnf(assertion, UNPROVIDED);
                                    if (NIL == doneP) {
                                        {
                                            SubLObject csome_list_var = kbi_cnf.diagnose_cnf(fi_cnf, mt);
                                            SubLObject diagnosis = NIL;
                                            for (diagnosis = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , diagnosis = csome_list_var.first()) {
                                                kbi_utilities.add_kbi_result(diagnosis);
                                                if (NIL == kbi_vars.$kbi_caching_findingsP$.getDynamicValue(thread)) {
                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            kbi_vars.$kbi_assertion$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != axiom_assertions_diagnoses_selectedP) {
                    kbi_utilities.kbi_select_module($AXIOM_ASSERTIONS_DIAGNOSES);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * diagnose all arguments indexed by assertion
     */
    public static final SubLObject diagnose_assertion_argumentsP(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($DIAGNOSE_ASSERTION_ARGUMENTS)) && (NIL != kbi_utilities.kbi_applies_toP($DIAGNOSE_ASSERTION_ARGUMENTS, assertion))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($DIAGNOSE_ASSERTION_ARGUMENTS);
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
                                            SubLObject _prev_bind_0_152 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_diagnoses_of_assertion_arguments(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_153 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_153, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_152, thread);
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
                    kbi_utilities.kbi_increment_time($DIAGNOSE_ASSERTION_ARGUMENTS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :DIAGNOSE-ASSERTION-ARGUMENTS applies to ASSERTION
     */
    public static final SubLObject why_diagnoses_of_assertion_argumentsP(SubLObject assertion, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($DIAGNOSE_ASSERTION_ARGUMENTS, assertion)) {
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
                                        SubLObject _prev_bind_0_154 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_diagnoses_of_assertion_arguments(assertion);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_155 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_155, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_154, thread);
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
                                return list($DIAGNOSE_ASSERTION_ARGUMENTS, assertion, data);
                            } else {
                                return list($DIAGNOSE_ASSERTION_ARGUMENTS, assertion);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_diagnoses_of_assertion_argumentsP(assertion, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_diagnoses_of_assertion_argumentsP(SubLObject assertion, SubLObject data) {
        {
            SubLObject nl_result = $str_alt60$;
            SubLObject cdolist_list_var = data;
            SubLObject diagnosisXargument = NIL;
            for (diagnosisXargument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , diagnosisXargument = cdolist_list_var.first()) {
                {
                    SubLObject datum = diagnosisXargument;
                    SubLObject current = datum;
                    SubLObject diagnosis = NIL;
                    SubLObject argument = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt313);
                    diagnosis = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt313);
                    argument = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt314$___s____has_diagnosis__s, argument, diagnosis));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt313);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_diagnoses_of_assertion_arguments(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                SubLObject mt = assertions_high.assertion_mt(assertion);
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = assertions_high.assertion_arguments(assertion);
                        SubLObject argument = NIL;
                        for (argument = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , argument = csome_list_var.first()) {
                            if (NIL != deduction_handles.deduction_p(argument)) {
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var_156 = diagnose_argument(argument, mt);
                                        SubLObject diagnosis = NIL;
                                        for (diagnosis = csome_list_var_156.first(); !((NIL != doneP) || (NIL == csome_list_var_156)); csome_list_var_156 = csome_list_var_156.rest() , diagnosis = csome_list_var_156.first()) {
                                            kbi_utilities.add_kbi_result(list(diagnosis, argument));
                                            if (NIL == kbi_vars.$kbi_caching_findingsP$.getDynamicValue(thread)) {
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

    public static final SubLObject diagnose_argument(SubLObject deduction, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $assertions_not_unassertible_fast$ = makeSymbol("*ASSERTIONS-NOT-UNASSERTIBLE-FAST*");

    // defparameter
    public static final SubLSymbol $assertions_not_unassertible_fast_count$ = makeSymbol("*ASSERTIONS-NOT-UNASSERTIBLE-FAST-COUNT*");

    // defparameter
    public static final SubLSymbol $assertions_not_unassertible$ = makeSymbol("*ASSERTIONS-NOT-UNASSERTIBLE*");

    // defparameter
    public static final SubLSymbol $assertions_not_unassertible_count$ = makeSymbol("*ASSERTIONS-NOT-UNASSERTIBLE-COUNT*");

    // defparameter
    public static final SubLSymbol $uncanonical_assertions$ = makeSymbol("*UNCANONICAL-ASSERTIONS*");

    // defparameter
    public static final SubLSymbol $uncanonical_assertions_count$ = makeSymbol("*UNCANONICAL-ASSERTIONS-COUNT*");

    // defparameter
    public static final SubLSymbol $duplicate_assertions$ = makeSymbol("*DUPLICATE-ASSERTIONS*");

    // defparameter
    public static final SubLSymbol $duplicate_assertion_count$ = makeSymbol("*DUPLICATE-ASSERTION-COUNT*");

    // defparameter
    public static final SubLSymbol $mapping_assertion$ = makeSymbol("*MAPPING-ASSERTION*");

    // defparameter
    public static final SubLSymbol $mapping_assertion_id$ = makeSymbol("*MAPPING-ASSERTION-ID*");

    // defparameter
    public static final SubLSymbol $assertions_considered$ = makeSymbol("*ASSERTIONS-CONSIDERED*");

    // defparameter
    public static final SubLSymbol $gather_tl_non_canonicalsP$ = makeSymbol("*GATHER-TL-NON-CANONICALS?*");

    public static final SubLObject resume_kb_uneditable_assertions(SubLObject last_id) {
        if (last_id == UNPROVIDED) {
            last_id = $mapping_assertion_id$.getDynamicValue();
        }
        return kb_uneditable_assertions(last_id);
    }

    public static final SubLObject kb_uneditable_assertions(SubLObject last_id) {
        if (last_id == UNPROVIDED) {
            last_id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != last_id) {
                $assertions_considered$.setDynamicValue(ZERO_INTEGER, thread);
            } else {
                $assertions_considered$.setDynamicValue(ZERO_INTEGER, thread);
                $assertions_not_unassertible_count$.setDynamicValue(ZERO_INTEGER, thread);
                $assertions_not_unassertible_fast_count$.setDynamicValue(ZERO_INTEGER, thread);
                $duplicate_assertion_count$.setDynamicValue(ZERO_INTEGER, thread);
                $uncanonical_assertions_count$.setDynamicValue(ZERO_INTEGER, thread);
                $assertions_not_unassertible$.setDynamicValue(NIL, thread);
                $assertions_not_unassertible_fast$.setDynamicValue(NIL, thread);
                $duplicate_assertions$.setDynamicValue(NIL, thread);
                $uncanonical_assertions$.setDynamicValue(NIL, thread);
            }
            {
                SubLObject caught_upP = sublisp_null(last_id);
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt315$mapping_Cyc_assertions_for_unedit, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt315$mapping_Cyc_assertions_for_unedit);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                {
                                    SubLObject _prev_bind_0_157 = $mapping_assertion$.currentBinding(thread);
                                    try {
                                        $mapping_assertion$.bind(NIL, thread);
                                        while (NIL != id) {
                                            $mapping_assertion$.setDynamicValue(id_index.do_id_index_state_object(idx, $SKIP, id, state_var), thread);
                                            if (NIL != id_index.do_id_index_id_and_object_validP(id, $mapping_assertion$.getDynamicValue(thread), $SKIP)) {
                                                utilities_macros.note_percent_progress(sofar, total);
                                                sofar = add(sofar, ONE_INTEGER);
                                                {
                                                    SubLObject assertion = $mapping_assertion$.getDynamicValue(thread);
                                                    SubLObject id_158 = assertion_handles.assertion_id(assertion);
                                                    {
                                                        SubLObject _prev_bind_0_159 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_160 = utilities_macros.$progress_total$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_161 = utilities_macros.$progress_sofar$.currentBinding(thread);
                                                        try {
                                                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                                            utilities_macros.$progress_total$.bind(NIL, thread);
                                                            utilities_macros.$progress_sofar$.bind(NIL, thread);
                                                            $mapping_assertion_id$.setDynamicValue(id_158, thread);
                                                            $assertions_considered$.setDynamicValue(add($assertions_considered$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                            caught_upP = makeBoolean((NIL != caught_upP) || id_158.numE(last_id));
                                                            if (NIL != caught_upP) {
                                                                if (NIL != $gather_tl_non_canonicalsP$.getDynamicValue(thread)) {
                                                                    if (NIL == czer_main.canonicalize_cycl(canon_tl.assertion_tl_formula(assertion), assertions_high.assertion_mt(assertion))) {
                                                                        $uncanonical_assertions_count$.setDynamicValue(add($uncanonical_assertions_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                        $uncanonical_assertions$.setDynamicValue(cons(assertion, $uncanonical_assertions$.getDynamicValue(thread)), thread);
                                                                    }
                                                                }
                                                                if (NIL != canon_tl.assertion_unassertible_via_tlP(assertion)) {
                                                                    if (NIL == canon_tl.assertion_unassertible_via_tl_fastP(assertion)) {
                                                                        $assertions_not_unassertible_fast_count$.setDynamicValue(add($assertions_not_unassertible_fast_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                        $assertions_not_unassertible_fast$.setDynamicValue(cons(assertion, $assertions_not_unassertible_fast$.getDynamicValue(thread)), thread);
                                                                    }
                                                                } else
                                                                    if (NIL != canon_tl.duplicate_assertionP(assertion)) {
                                                                        $duplicate_assertion_count$.setDynamicValue(add($duplicate_assertion_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                        $duplicate_assertions$.setDynamicValue(cons(assertion, $duplicate_assertions$.getDynamicValue(thread)), thread);
                                                                    } else {
                                                                        $assertions_not_unassertible_count$.setDynamicValue(add($assertions_not_unassertible_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                        $assertions_not_unassertible$.setDynamicValue(cons(assertion, $assertions_not_unassertible$.getDynamicValue(thread)), thread);
                                                                    }

                                                            }
                                                        } finally {
                                                            utilities_macros.$progress_sofar$.rebind(_prev_bind_2_161, thread);
                                                            utilities_macros.$progress_total$.rebind(_prev_bind_1_160, thread);
                                                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0_159, thread);
                                                        }
                                                    }
                                                }
                                            }
                                            id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                            state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                        } 
                                    } finally {
                                        $mapping_assertion$.rebind(_prev_bind_0_157, thread);
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $assertions_not_unassertible_count$.getDynamicValue(thread);
        }
    }

    public static final SubLObject unassert_duplicate_assertions_via_tl(SubLObject assertion) {
        {
            SubLObject id = NIL;
            for (id = assertion_handles.assertion_id(assertion); NIL != assertions_high.valid_assertion(assertion, UNPROVIDED); id = assertion_handles.assertion_id(assertion)) {
                if (NIL != assertion_handles.find_assertion_by_id(id)) {
                    canon_tl.unassert_assertion_via_tl(assertion);
                }
            }
        }
        return makeBoolean(NIL == assertions_high.valid_assertion(assertion, UNPROVIDED));
    }

    public static final SubLObject declare_kbi_assertion_file() {
        declareFunction("assertion_diagnostics", "ASSERTION-DIAGNOSTICS", 0, 2, false);
        declareFunction("assertion_diagnostics_wrt", "ASSERTION-DIAGNOSTICS-WRT", 1, 2, false);
        declareFunction("assertions_diagnostics", "ASSERTIONS-DIAGNOSTICS", 1, 2, false);
        declareFunction("assertions_diagnostics_wrt", "ASSERTIONS-DIAGNOSTICS-WRT", 2, 2, false);
        declareFunction("resume_assertion_diagnostics", "RESUME-ASSERTION-DIAGNOSTICS", 0, 2, false);
        declareFunction("resume_assertions_diagnostics", "RESUME-ASSERTIONS-DIAGNOSTICS", 1, 2, false);
        declareFunction("resume_assertion_diagnostics_wrt", "RESUME-ASSERTION-DIAGNOSTICS-WRT", 1, 2, false);
        declareFunction("resume_assertions_diagnostics_wrt", "RESUME-ASSERTIONS-DIAGNOSTICS-WRT", 2, 2, false);
        declareFunction("assertions_diagnostics_int", "ASSERTIONS-DIAGNOSTICS-INT", 1, 2, false);
        declareFunction("assertion_diagnostics_int", "ASSERTION-DIAGNOSTICS-INT", 0, 2, false);
        declareFunction("kbi_assertion_wrt", "KBI-ASSERTION-WRT", 1, 2, false);
        declareFunction("kbi_assertions_wrt", "KBI-ASSERTIONS-WRT", 2, 2, false);
        declareFunction("clear_cached_diagnose_assertion", "CLEAR-CACHED-DIAGNOSE-ASSERTION", 0, 0, false);
        declareFunction("remove_cached_diagnose_assertion", "REMOVE-CACHED-DIAGNOSE-ASSERTION", 1, 0, false);
        declareFunction("cached_diagnose_assertion_internal", "CACHED-DIAGNOSE-ASSERTION-INTERNAL", 1, 0, false);
        declareFunction("cached_diagnose_assertion", "CACHED-DIAGNOSE-ASSERTION", 1, 0, false);
        declareFunction("diagnose_assertion", "DIAGNOSE-ASSERTION", 1, 0, false);
        declareFunction("diagnose_assertion_int", "DIAGNOSE-ASSERTION-INT", 1, 0, false);
        declareFunction("assertion_wXo_mtP", "ASSERTION-W/O-MT?", 1, 0, false);
        declareFunction("why_assertion_wXo_mtP", "WHY-ASSERTION-W/O-MT?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_wXo_mtP", "KBI-NL-WHY-ASSERTION-W/O-MT?", 2, 0, false);
        declareFunction("kbi_assertion_wXo_mtP", "KBI-ASSERTION-W/O-MT?", 1, 0, false);
        declareFunction("assertion_wXo_valid_idP", "ASSERTION-W/O-VALID-ID?", 1, 0, false);
        declareFunction("why_assertion_wXo_valid_idP", "WHY-ASSERTION-W/O-VALID-ID?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_wXo_valid_idP", "KBI-NL-WHY-ASSERTION-W/O-VALID-ID?", 2, 0, false);
        declareFunction("kbi_valid_assertion_idP", "KBI-VALID-ASSERTION-ID?", 1, 0, false);
        declareFunction("assertion_wXo_tvP", "ASSERTION-W/O-TV?", 1, 0, false);
        declareFunction("why_assertion_wXo_tvP", "WHY-ASSERTION-W/O-TV?", 1, 1, false);
        declareFunction("kbi_assertion_wXo_tvP", "KBI-ASSERTION-W/O-TV?", 1, 0, false);
        declareFunction("kbi_nl_why_assertion_wXo_tvP", "KBI-NL-WHY-ASSERTION-W/O-TV?", 2, 0, false);
        declareFunction("assertion_wXo_directionP", "ASSERTION-W/O-DIRECTION?", 1, 0, false);
        declareFunction("why_assertion_wXo_directionP", "WHY-ASSERTION-W/O-DIRECTION?", 1, 1, false);
        declareFunction("kbi_assertion_wXo_directionP", "KBI-ASSERTION-W/O-DIRECTION?", 1, 0, false);
        declareFunction("kbi_nl_why_assertion_wXo_directionP", "KBI-NL-WHY-ASSERTION-W/O-DIRECTION?", 2, 0, false);
        declareFunction("assertion_wXo_valid_var_namesP", "ASSERTION-W/O-VALID-VAR-NAMES?", 1, 0, false);
        declareFunction("why_assertion_wXo_valid_var_namesP", "WHY-ASSERTION-W/O-VALID-VAR-NAMES?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_wXo_valid_var_namesP", "KBI-NL-WHY-ASSERTION-W/O-VALID-VAR-NAMES?", 2, 0, false);
        declareFunction("kbi_assertion_wXo_valid_var_names", "KBI-ASSERTION-W/O-VALID-VAR-NAMES", 1, 0, false);
        declareFunction("el_hl_varP", "EL-HL-VAR?", 1, 0, false);
        declareFunction("assertion_wXo_prefered_var_namesP", "ASSERTION-W/O-PREFERED-VAR-NAMES?", 1, 0, false);
        declareFunction("why_assertion_wXo_prefered_var_namesP", "WHY-ASSERTION-W/O-PREFERED-VAR-NAMES?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_wXo_prefered_var_namesP", "KBI-NL-WHY-ASSERTION-W/O-PREFERED-VAR-NAMES?", 2, 0, false);
        declareFunction("kbi_assertion_poor_var_names", "KBI-ASSERTION-POOR-VAR-NAMES", 1, 0, false);
        declareFunction("kbi_poor_variable_names", "KBI-POOR-VARIABLE-NAMES", 1, 0, false);
        declareFunction("assertion_wXo_argumentP", "ASSERTION-W/O-ARGUMENT?", 1, 0, false);
        declareFunction("why_assertion_wXo_argumentP", "WHY-ASSERTION-W/O-ARGUMENT?", 1, 1, false);
        declareFunction("kbi_assertion_wXo_argumentP", "KBI-ASSERTION-W/O-ARGUMENT?", 1, 0, false);
        declareFunction("kbi_nl_why_assertion_wXo_argumentP", "KBI-NL-WHY-ASSERTION-W/O-ARGUMENT?", 2, 0, false);
        declareFunction("assertion_wXmal_argumentsP", "ASSERTION-W/MAL-ARGUMENTS?", 1, 0, false);
        declareFunction("why_assertion_wXmal_argumentsP", "WHY-ASSERTION-W/MAL-ARGUMENTS?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_wXmal_argumentsP", "KBI-NL-WHY-ASSERTION-W/MAL-ARGUMENTS?", 2, 0, false);
        declareFunction("kbi_assertion_mal_arguments", "KBI-ASSERTION-MAL-ARGUMENTS", 1, 0, false);
        declareFunction("assertion_misindexedP", "ASSERTION-MISINDEXED?", 1, 0, false);
        declareFunction("why_assertion_misindexedP", "WHY-ASSERTION-MISINDEXED?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_misindexedP", "KBI-NL-WHY-ASSERTION-MISINDEXED?", 2, 0, false);
        declareFunction("incorrect_assertion_indicesP", "INCORRECT-ASSERTION-INDICES?", 1, 0, false);
        declareFunction("why_bad_assertion_indicesP", "WHY-BAD-ASSERTION-INDICES?", 1, 0, false);
        declareFunction("indices_missing_assertion", "INDICES-MISSING-ASSERTION", 1, 0, false);
        declareFunction("constants_not_indexing_assertion", "CONSTANTS-NOT-INDEXING-ASSERTION", 1, 0, false);
        declareFunction("indexed_by_mtP", "INDEXED-BY-MT?", 2, 0, false);
        declareFunction("constants_not_indexing_gaf", "CONSTANTS-NOT-INDEXING-GAF", 1, 0, false);
        declareFunction("constants_not_indexing_rule", "CONSTANTS-NOT-INDEXING-RULE", 1, 0, false);
        declareFunction("gaf_assertion_indexed_via_predP", "GAF-ASSERTION-INDEXED-VIA-PRED?", 2, 1, false);
        declareFunction("tou_assertion_indexed_via_functorP", "TOU-ASSERTION-INDEXED-VIA-FUNCTOR?", 2, 1, false);
        declareFunction("gaf_assertion_indexed_via_termP", "GAF-ASSERTION-INDEXED-VIA-TERM?", 3, 2, false);
        declareFunction("tou_assertion_indexed_via_termP", "TOU-ASSERTION-INDEXED-VIA-TERM?", 3, 2, false);
        declareFunction("assertion_indexed_via_otherP", "ASSERTION-INDEXED-VIA-OTHER?", 2, 2, false);
        declareFunction("assertion_indexed_via_predicate_rule_indexP", "ASSERTION-INDEXED-VIA-PREDICATE-RULE-INDEX?", 3, 2, false);
        declareFunction("assertion_indexed_via_function_rule_indexP", "ASSERTION-INDEXED-VIA-FUNCTION-RULE-INDEX?", 2, 2, false);
        declareFunction("assertion_indexed_via_isa_rule_indexP", "ASSERTION-INDEXED-VIA-ISA-RULE-INDEX?", 3, 2, false);
        declareFunction("assertion_indexed_via_genls_rule_indexP", "ASSERTION-INDEXED-VIA-GENLS-RULE-INDEX?", 3, 2, false);
        declareFunction("assertion_indexed_via_genl_mt_rule_indexP", "ASSERTION-INDEXED-VIA-GENL-MT-RULE-INDEX?", 3, 2, false);
        declareFunction("assertion_foundP", "ASSERTION-FOUND?", 1, 0, false);
        declareFunction("sign_lits", "SIGN-LITS", 2, 0, false);
        declareFunction("rule_assertion_lit_term_indexP", "RULE-ASSERTION-LIT-TERM-INDEX?", 2, 0, false);
        declareFunction("rule_assertion_lit_pred_indexP", "RULE-ASSERTION-LIT-PRED-INDEX?", 1, 1, false);
        declareFunction("assertion_duplicatesP", "ASSERTION-DUPLICATES?", 1, 0, false);
        declareFunction("why_assertion_duplicatesP", "WHY-ASSERTION-DUPLICATES?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_duplicatesP", "KBI-NL-WHY-ASSERTION-DUPLICATES?", 2, 0, false);
        declareFunction("kbi_assertion_duplicates", "KBI-ASSERTION-DUPLICATES", 1, 0, false);
        declareFunction("assertion_redundant_wrt_mtP", "ASSERTION-REDUNDANT-WRT-MT?", 1, 0, false);
        declareFunction("why_assertion_redundant_wrt_mtP", "WHY-ASSERTION-REDUNDANT-WRT-MT?", 1, 1, false);
        declareFunction("kbi_assertion_redundant_wrt_mts", "KBI-ASSERTION-REDUNDANT-WRT-MTS", 1, 0, false);
        declareFunction("kbi_nl_why_assertion_redundant_wrt_mtP", "KBI-NL-WHY-ASSERTION-REDUNDANT-WRT-MT?", 2, 0, false);
        declareFunction("assertion_redundant_wrt_isaP", "ASSERTION-REDUNDANT-WRT-ISA?", 1, 0, false);
        declareFunction("why_assertion_redundant_wrt_isaP", "WHY-ASSERTION-REDUNDANT-WRT-ISA?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_redundant_wrt_isaP", "KBI-NL-WHY-ASSERTION-REDUNDANT-WRT-ISA?", 2, 0, false);
        declareFunction("kbi_redundant_isa_literals", "KBI-REDUNDANT-ISA-LITERALS", 1, 0, false);
        declareFunction("el_var_of", "EL-VAR-OF", 2, 0, false);
        declareFunction("assertion_isa_too_weakP", "ASSERTION-ISA-TOO-WEAK?", 1, 0, false);
        declareFunction("why_assertion_isa_too_weakP", "WHY-ASSERTION-ISA-TOO-WEAK?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_isa_too_weakP", "KBI-NL-WHY-ASSERTION-ISA-TOO-WEAK?", 2, 0, false);
        declareFunction("kbi_assertion_isa_too_weak", "KBI-ASSERTION-ISA-TOO-WEAK", 1, 0, false);
        declareFunction("assertion_pred_too_weakP", "ASSERTION-PRED-TOO-WEAK?", 1, 0, false);
        declareFunction("why_assertion_pred_too_weakP", "WHY-ASSERTION-PRED-TOO-WEAK?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_pred_too_weakP", "KBI-NL-WHY-ASSERTION-PRED-TOO-WEAK?", 2, 0, false);
        declareFunction("kbi_assertion_pred_too_weak", "KBI-ASSERTION-PRED-TOO-WEAK", 1, 0, false);
        declareFunction("assertion_non_constant_arg_isa_wXo_defnsP", "ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS?", 1, 0, false);
        declareFunction("why_assertion_non_constant_arg_isa_wXo_defnsP", "WHY-ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_non_constant_arg_isa_wXo_defnsP", "KBI-NL-WHY-ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS?", 2, 0, false);
        declareFunction("kbi_assertion_non_constant_arg_types_wXo_defns", "KBI-ASSERTION-NON-CONSTANT-ARG-TYPES-W/O-DEFNS", 1, 0, false);
        declareFunction("non_constant_arg_types_wXo_defns", "NON-CONSTANT-ARG-TYPES-W/O-DEFNS", 1, 1, false);
        declareFunction("assertion_not_canonicalP", "ASSERTION-NOT-CANONICAL?", 1, 0, false);
        declareFunction("why_assertion_not_canonicalP", "WHY-ASSERTION-NOT-CANONICAL?", 1, 1, false);
        declareFunction("non_canonical_assertionP", "NON-CANONICAL-ASSERTION?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_not_canonicalP", "KBI-NL-WHY-ASSERTION-NOT-CANONICAL?", 2, 0, false);
        declareFunction("kbi_assertion_not_canonical", "KBI-ASSERTION-NOT-CANONICAL", 1, 0, false);
        declareFunction("recomputed_assertion_cnf", "RECOMPUTED-ASSERTION-CNF", 1, 1, false);
        declareFunction("assertion_not_accessibleP", "ASSERTION-NOT-ACCESSIBLE?", 1, 0, false);
        declareFunction("why_assertion_not_accessibleP", "WHY-ASSERTION-NOT-ACCESSIBLE?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_not_accessibleP", "KBI-NL-WHY-ASSERTION-NOT-ACCESSIBLE?", 2, 0, false);
        declareFunction("kbi_assertion_not_accessibleP", "KBI-ASSERTION-NOT-ACCESSIBLE?", 1, 0, false);
        declareFunction("assertion_not_accessible_via_elP", "ASSERTION-NOT-ACCESSIBLE-VIA-EL?", 1, 0, false);
        declareFunction("why_assertion_not_accessible_via_elP", "WHY-ASSERTION-NOT-ACCESSIBLE-VIA-EL?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_not_accessible_via_elP", "KBI-NL-WHY-ASSERTION-NOT-ACCESSIBLE-VIA-EL?", 2, 0, false);
        declareFunction("kbi_assertion_not_accessible_via_elP", "KBI-ASSERTION-NOT-ACCESSIBLE-VIA-EL?", 1, 0, false);
        declareFunction("why_assertion_inaccessible_via_el", "WHY-ASSERTION-INACCESSIBLE-VIA-EL", 1, 0, false);
        declareFunction("assertion_not_askable_at_elP", "ASSERTION-NOT-ASKABLE-AT-EL?", 1, 0, false);
        declareFunction("why_assertion_not_askable_at_elP", "WHY-ASSERTION-NOT-ASKABLE-AT-EL?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_not_askable_at_elP", "KBI-NL-WHY-ASSERTION-NOT-ASKABLE-AT-EL?", 2, 0, false);
        declareFunction("kbi_assertion_not_askable_at_elP", "KBI-ASSERTION-NOT-ASKABLE-AT-EL?", 1, 0, false);
        declareFunction("why_assertion_unaskable_at_elP", "WHY-ASSERTION-UNASKABLE-AT-EL?", 1, 0, false);
        declareFunction("assertion_not_askable_at_fiP", "ASSERTION-NOT-ASKABLE-AT-FI?", 1, 0, false);
        declareFunction("why_assertion_not_askable_at_fiP", "WHY-ASSERTION-NOT-ASKABLE-AT-FI?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_not_askable_at_fiP", "KBI-NL-WHY-ASSERTION-NOT-ASKABLE-AT-FI?", 2, 0, false);
        declareFunction("kbi_assertion_not_askable_at_fiP", "KBI-ASSERTION-NOT-ASKABLE-AT-FI?", 1, 0, false);
        declareFunction("why_assertion_unaskable_at_fiP", "WHY-ASSERTION-UNASKABLE-AT-FI?", 1, 0, false);
        declareFunction("kbi_assertion_not_wffP", "KBI-ASSERTION-NOT-WFF?", 1, 0, false);
        declareFunction("why_assertion_not_wffP", "WHY-ASSERTION-NOT-WFF?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_not_wffP", "KBI-NL-WHY-ASSERTION-NOT-WFF?", 2, 0, false);
        declareFunction("kbi_assertion_not_wff_int", "KBI-ASSERTION-NOT-WFF-INT", 1, 0, false);
        declareFunction("assertion_not_wff_due_to_arg_of_typeP", "ASSERTION-NOT-WFF-DUE-TO-ARG-OF-TYPE?", 2, 0, false);
        declareFunction("bad_arity_assertionP", "BAD-ARITY-ASSERTION?", 1, 0, false);
        declareFunction("why_bad_arity_assertionP", "WHY-BAD-ARITY-ASSERTION?", 1, 0, false);
        declareFunction("bad_arg_assertionP", "BAD-ARG-ASSERTION?", 1, 0, false);
        declareFunction("why_bad_arg_assertionP", "WHY-BAD-ARG-ASSERTION?", 1, 0, false);
        declareFunction("assertion_el_not_wffP", "ASSERTION-EL-NOT-WFF?", 1, 0, false);
        declareFunction("why_assertion_el_not_wffP", "WHY-ASSERTION-EL-NOT-WFF?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_el_not_wffP", "KBI-NL-WHY-ASSERTION-EL-NOT-WFF?", 2, 0, false);
        declareFunction("kbi_assertion_el_not_wff", "KBI-ASSERTION-EL-NOT-WFF", 1, 0, false);
        declareFunction("assertion_el_not_wff_due_to_arg_of_typeP", "ASSERTION-EL-NOT-WFF-DUE-TO-ARG-OF-TYPE?", 2, 0, false);
        declareFunction("assertion_inform_mising_istP", "ASSERTION-INFORM-MISING-IST?", 1, 0, false);
        declareFunction("why_assertion_inform_mising_istP", "WHY-ASSERTION-INFORM-MISING-IST?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_inform_mising_istP", "KBI-NL-WHY-ASSERTION-INFORM-MISING-IST?", 2, 0, false);
        declareFunction("kbi_assertion_inform_mising_istP", "KBI-ASSERTION-INFORM-MISING-IST?", 1, 0, false);
        declareFunction("assertion_wXmal_doc_stringP", "ASSERTION-W/MAL-DOC-STRING?", 1, 0, false);
        declareFunction("why_assertion_wXmal_doc_stringP", "WHY-ASSERTION-W/MAL-DOC-STRING?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_wXmal_doc_stringP", "KBI-NL-WHY-ASSERTION-W/MAL-DOC-STRING?", 2, 0, false);
        declareFunction("kbi_assertion_wXmal_doc_string", "KBI-ASSERTION-W/MAL-DOC-STRING", 1, 0, false);
        declareFunction("doc_predP", "DOC-PRED?", 1, 1, false);
        declareFunction("ist_diagnostics", "IST-DIAGNOSTICS", 0, 2, false);
        declareFunction("mts_ist_diagnostics", "MTS-IST-DIAGNOSTICS", 0, 2, false);
        declareFunction("ist_diagnostics_int", "IST-DIAGNOSTICS-INT", 0, 2, false);
        declareFunction("assertion_wXatomic_neg_litP", "ASSERTION-W/ATOMIC-NEG-LIT?", 1, 0, false);
        declareFunction("why_assertion_wXatomic_neg_litP", "WHY-ASSERTION-W/ATOMIC-NEG-LIT?", 1, 1, false);
        declareFunction("kbi_nl_why_assertion_wXatomic_neg_litP", "KBI-NL-WHY-ASSERTION-W/ATOMIC-NEG-LIT?", 2, 0, false);
        declareFunction("kbi_assertion_wXatomic_neg_litP", "KBI-ASSERTION-W/ATOMIC-NEG-LIT?", 1, 0, false);
        declareFunction("atomic_neg_litP", "ATOMIC-NEG-LIT?", 1, 0, false);
        declareFunction("diagnose_assertion_axiomP", "DIAGNOSE-ASSERTION-AXIOM?", 1, 0, false);
        declareFunction("why_diagnoses_of_assertion_axiomP", "WHY-DIAGNOSES-OF-ASSERTION-AXIOM?", 1, 1, false);
        declareFunction("kbi_nl_why_diagnoses_of_assertion_axiomP", "KBI-NL-WHY-DIAGNOSES-OF-ASSERTION-AXIOM?", 2, 0, false);
        declareFunction("kbi_diagnoses_of_assertion_axiom", "KBI-DIAGNOSES-OF-ASSERTION-AXIOM", 1, 0, false);
        declareFunction("diagnose_assertion_argumentsP", "DIAGNOSE-ASSERTION-ARGUMENTS?", 1, 0, false);
        declareFunction("why_diagnoses_of_assertion_argumentsP", "WHY-DIAGNOSES-OF-ASSERTION-ARGUMENTS?", 1, 1, false);
        declareFunction("kbi_nl_why_diagnoses_of_assertion_argumentsP", "KBI-NL-WHY-DIAGNOSES-OF-ASSERTION-ARGUMENTS?", 2, 0, false);
        declareFunction("kbi_diagnoses_of_assertion_arguments", "KBI-DIAGNOSES-OF-ASSERTION-ARGUMENTS", 1, 0, false);
        declareFunction("diagnose_argument", "DIAGNOSE-ARGUMENT", 1, 1, false);
        declareFunction("resume_kb_uneditable_assertions", "RESUME-KB-UNEDITABLE-ASSERTIONS", 0, 1, false);
        declareFunction("kb_uneditable_assertions", "KB-UNEDITABLE-ASSERTIONS", 0, 1, false);
        declareFunction("unassert_duplicate_assertions_via_tl", "UNASSERT-DUPLICATE-ASSERTIONS-VIA-TL", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_assertion_file() {
        deflexical("*CACHED-DIAGNOSE-ASSERTION-CACHING-STATE*", NIL);
        defparameter("*ASSERTION-W/O-MT-RESULTS*", NIL);
        defparameter("*ASSERTION-W/O-MT-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-MT-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-VALID-ID-RESULTS*", NIL);
        defparameter("*ASSERTION-W/O-VALID-ID-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-VALID-ID-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-TV-RESULTS*", NIL);
        defparameter("*ASSERTION-W/O-TV-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-TV-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-DIRECTION-RESULTS*", NIL);
        defparameter("*ASSERTION-W/O-DIRECTION-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-DIRECTION-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-VALID-VAR-NAMES-RESULTS*", NIL);
        defparameter("*ASSERTION-W/O-VALID-VAR-NAMES-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-VALID-VAR-NAMES-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-PREFERED-VAR-NAMES-RESULTS*", NIL);
        defparameter("*ASSERTION-W/O-PREFERED-VAR-NAMES-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-PREFERED-VAR-NAMES-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-ARGUMENT-RESULTS*", NIL);
        defparameter("*ASSERTION-W/O-ARGUMENT-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/O-ARGUMENT-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/MAL-ARGUMENTS-RESULTS*", NIL);
        defparameter("*ASSERTION-W/MAL-ARGUMENTS-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/MAL-ARGUMENTS-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-MISINDEXED-RESULTS*", NIL);
        defparameter("*ASSERTION-MISINDEXED-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-MISINDEXED-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-DUPLICATES-RESULTS*", NIL);
        defparameter("*ASSERTION-DUPLICATES-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-DUPLICATES-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-REDUNDANT-WRT-MT-RESULTS*", NIL);
        defparameter("*ASSERTION-REDUNDANT-WRT-MT-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-REDUNDANT-WRT-MT-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-REDUNDANT-WRT-ISA-RESULTS*", NIL);
        defparameter("*ASSERTION-REDUNDANT-WRT-ISA-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-REDUNDANT-WRT-ISA-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-ISA-TOO-WEAK-RESULTS*", NIL);
        defparameter("*ASSERTION-ISA-TOO-WEAK-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-ISA-TOO-WEAK-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-PRED-TOO-WEAK-RESULTS*", NIL);
        defparameter("*ASSERTION-PRED-TOO-WEAK-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-PRED-TOO-WEAK-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-RESULTS*", NIL);
        defparameter("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-CANONICAL-RESULTS*", NIL);
        defparameter("*ASSERTION-NOT-CANONICAL-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-CANONICAL-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-ACCESSIBLE-RESULTS*", NIL);
        defparameter("*ASSERTION-NOT-ACCESSIBLE-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-ACCESSIBLE-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-ACCESSIBLE-VIA-EL-RESULTS*", NIL);
        defparameter("*ASSERTION-NOT-ACCESSIBLE-VIA-EL-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-ACCESSIBLE-VIA-EL-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-ASKABLE-AT-EL-RESULTS*", NIL);
        defparameter("*ASSERTION-NOT-ASKABLE-AT-EL-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-ASKABLE-AT-EL-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-ASKABLE-AT-FI-RESULTS*", NIL);
        defparameter("*ASSERTION-NOT-ASKABLE-AT-FI-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-NOT-ASKABLE-AT-FI-COUNT*", ZERO_INTEGER);
        defparameter("*KBI-ASSERTION-NOT-WFF-RESULTS*", NIL);
        defparameter("*KBI-ASSERTION-NOT-WFF-TIME*", ZERO_INTEGER);
        defparameter("*KBI-ASSERTION-NOT-WFF-COUNT*", ZERO_INTEGER);
        defparameter("*KBI-SELECTED-WFF-VIOLATIONS*", NIL);
        defparameter("*ASSERTION-EL-NOT-WFF-RESULTS*", NIL);
        defparameter("*ASSERTION-EL-NOT-WFF-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-EL-NOT-WFF-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-INFORM-MISING-IST-RESULTS*", NIL);
        defparameter("*ASSERTION-INFORM-MISING-IST-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-INFORM-MISING-IST-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/MAL-DOC-STRING-RESULTS*", NIL);
        defparameter("*ASSERTION-W/MAL-DOC-STRING-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/MAL-DOC-STRING-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/ATOMIC-NEG-LIT-RESULTS*", NIL);
        defparameter("*ASSERTION-W/ATOMIC-NEG-LIT-TIME*", ZERO_INTEGER);
        defparameter("*ASSERTION-W/ATOMIC-NEG-LIT-COUNT*", ZERO_INTEGER);
        defparameter("*DIAGNOSE-ASSERTION-AXIOM-RESULTS*", NIL);
        defparameter("*DIAGNOSE-ASSERTION-AXIOM-TIME*", ZERO_INTEGER);
        defparameter("*DIAGNOSE-ASSERTION-AXIOM-COUNT*", ZERO_INTEGER);
        defparameter("*DIAGNOSE-ASSERTION-ARGUMENTS-RESULTS*", NIL);
        defparameter("*DIAGNOSE-ASSERTION-ARGUMENTS-TIME*", ZERO_INTEGER);
        defparameter("*DIAGNOSE-ASSERTION-ARGUMENTS-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTIONS-NOT-UNASSERTIBLE-FAST*", NIL);
        defparameter("*ASSERTIONS-NOT-UNASSERTIBLE-FAST-COUNT*", ZERO_INTEGER);
        defparameter("*ASSERTIONS-NOT-UNASSERTIBLE*", NIL);
        defparameter("*ASSERTIONS-NOT-UNASSERTIBLE-COUNT*", ZERO_INTEGER);
        defparameter("*UNCANONICAL-ASSERTIONS*", NIL);
        defparameter("*UNCANONICAL-ASSERTIONS-COUNT*", ZERO_INTEGER);
        defparameter("*DUPLICATE-ASSERTIONS*", NIL);
        defparameter("*DUPLICATE-ASSERTION-COUNT*", ZERO_INTEGER);
        defparameter("*MAPPING-ASSERTION*", NIL);
        defparameter("*MAPPING-ASSERTION-ID*", NIL);
        defparameter("*ASSERTIONS-CONSIDERED*", ZERO_INTEGER);
        defparameter("*GATHER-TL-NON-CANONICALS?*", T);
        return NIL;
    }

    public static final SubLObject setup_kbi_assertion_file() {
                memoization_state.note_globally_cached_function(CACHED_DIAGNOSE_ASSERTION);
        {
            SubLObject item_var = $sym10$_ASSERTION_W_O_MT_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym10$_ASSERTION_W_O_MT_RESULTS_, $str_alt11$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym12$_ASSERTION_W_O_MT_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym12$_ASSERTION_W_O_MT_TIME_, $str_alt13$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym14$_ASSERTION_W_O_MT_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym14$_ASSERTION_W_O_MT_COUNT_, $str_alt15$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw16$ASSERTION_W_O_MT, $list_alt22);
        {
            SubLObject item_var = $sym24$_ASSERTION_W_O_VALID_ID_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym24$_ASSERTION_W_O_VALID_ID_RESULTS_, $str_alt25$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym26$_ASSERTION_W_O_VALID_ID_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym26$_ASSERTION_W_O_VALID_ID_TIME_, $str_alt27$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym28$_ASSERTION_W_O_VALID_ID_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym28$_ASSERTION_W_O_VALID_ID_COUNT_, $str_alt29$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw30$ASSERTION_W_O_VALID_ID, $list_alt31);
        {
            SubLObject item_var = $sym34$_ASSERTION_W_O_TV_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym34$_ASSERTION_W_O_TV_RESULTS_, $str_alt35$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym36$_ASSERTION_W_O_TV_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym36$_ASSERTION_W_O_TV_TIME_, $str_alt37$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym38$_ASSERTION_W_O_TV_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym38$_ASSERTION_W_O_TV_COUNT_, $str_alt39$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw40$ASSERTION_W_O_TV, $list_alt41);
        {
            SubLObject item_var = $sym43$_ASSERTION_W_O_DIRECTION_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym43$_ASSERTION_W_O_DIRECTION_RESULTS_, $str_alt44$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym45$_ASSERTION_W_O_DIRECTION_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym45$_ASSERTION_W_O_DIRECTION_TIME_, $str_alt46$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym47$_ASSERTION_W_O_DIRECTION_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym47$_ASSERTION_W_O_DIRECTION_COUNT_, $str_alt48$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw49$ASSERTION_W_O_DIRECTION, $list_alt50);
        {
            SubLObject item_var = $sym52$_ASSERTION_W_O_VALID_VAR_NAMES_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym52$_ASSERTION_W_O_VALID_VAR_NAMES_RESULTS_, $str_alt53$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym54$_ASSERTION_W_O_VALID_VAR_NAMES_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym54$_ASSERTION_W_O_VALID_VAR_NAMES_TIME_, $str_alt55$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym56$_ASSERTION_W_O_VALID_VAR_NAMES_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym56$_ASSERTION_W_O_VALID_VAR_NAMES_COUNT_, $str_alt57$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw58$ASSERTION_W_O_VALID_VAR_NAMES, $list_alt59);
        {
            SubLObject item_var = $sym78$_ASSERTION_W_O_PREFERED_VAR_NAMES_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym78$_ASSERTION_W_O_PREFERED_VAR_NAMES_RESULTS_, $str_alt79$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym80$_ASSERTION_W_O_PREFERED_VAR_NAMES_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym80$_ASSERTION_W_O_PREFERED_VAR_NAMES_TIME_, $str_alt81$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym82$_ASSERTION_W_O_PREFERED_VAR_NAMES_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym82$_ASSERTION_W_O_PREFERED_VAR_NAMES_COUNT_, $str_alt83$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw84$ASSERTION_W_O_PREFERED_VAR_NAMES, $list_alt85);
        {
            SubLObject item_var = $sym90$_ASSERTION_W_O_ARGUMENT_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym90$_ASSERTION_W_O_ARGUMENT_RESULTS_, $str_alt91$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym92$_ASSERTION_W_O_ARGUMENT_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym92$_ASSERTION_W_O_ARGUMENT_TIME_, $str_alt93$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym94$_ASSERTION_W_O_ARGUMENT_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym94$_ASSERTION_W_O_ARGUMENT_COUNT_, $str_alt95$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw96$ASSERTION_W_O_ARGUMENT, $list_alt97);
        {
            SubLObject item_var = $sym99$_ASSERTION_W_MAL_ARGUMENTS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym99$_ASSERTION_W_MAL_ARGUMENTS_RESULTS_, $str_alt100$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym101$_ASSERTION_W_MAL_ARGUMENTS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym101$_ASSERTION_W_MAL_ARGUMENTS_TIME_, $str_alt102$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym103$_ASSERTION_W_MAL_ARGUMENTS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym103$_ASSERTION_W_MAL_ARGUMENTS_COUNT_, $str_alt104$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw105$ASSERTION_W_MAL_ARGUMENTS, $list_alt106);
        {
            SubLObject item_var = $assertion_misindexed_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_misindexed_results$, $str_alt109$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_misindexed_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_misindexed_time$, $str_alt111$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_misindexed_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_misindexed_count$, $str_alt113$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_MISINDEXED, $list_alt115);
        {
            SubLObject item_var = $assertion_duplicates_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_duplicates_results$, $str_alt133$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_duplicates_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_duplicates_time$, $str_alt135$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_duplicates_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_duplicates_count$, $str_alt137$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_DUPLICATES, $list_alt139);
        {
            SubLObject item_var = $assertion_redundant_wrt_mt_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_redundant_wrt_mt_results$, $str_alt143$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_redundant_wrt_mt_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_redundant_wrt_mt_time$, $str_alt145$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_redundant_wrt_mt_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_redundant_wrt_mt_count$, $str_alt147$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_REDUNDANT_WRT_MT, $list_alt149);
        {
            SubLObject item_var = $assertion_redundant_wrt_isa_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_redundant_wrt_isa_results$, $str_alt152$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_redundant_wrt_isa_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_redundant_wrt_isa_time$, $str_alt154$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_redundant_wrt_isa_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_redundant_wrt_isa_count$, $str_alt156$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_REDUNDANT_WRT_ISA, $list_alt158);
        {
            SubLObject item_var = $assertion_isa_too_weak_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_isa_too_weak_results$, $str_alt163$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_isa_too_weak_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_isa_too_weak_time$, $str_alt165$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_isa_too_weak_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_isa_too_weak_count$, $str_alt167$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_ISA_TOO_WEAK, $list_alt169);
        {
            SubLObject item_var = $assertion_pred_too_weak_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_pred_too_weak_results$, $str_alt172$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_pred_too_weak_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_pred_too_weak_time$, $str_alt174$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_pred_too_weak_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_pred_too_weak_count$, $str_alt176$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_PRED_TOO_WEAK, $list_alt178);
        {
            SubLObject item_var = $sym184$_ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym184$_ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS_RESULTS_, $str_alt185$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym186$_ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym186$_ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS_TIME_, $str_alt187$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym188$_ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym188$_ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS_COUNT_, $str_alt189$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw190$ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS, $list_alt191);
        {
            SubLObject item_var = $assertion_not_canonical_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_canonical_results$, $str_alt196$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_not_canonical_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_canonical_time$, $str_alt198$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_not_canonical_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_canonical_count$, $str_alt200$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_NOT_CANONICAL, $list_alt202);
        {
            SubLObject item_var = $assertion_not_accessible_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_accessible_results$, $str_alt206$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_not_accessible_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_accessible_time$, $str_alt208$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_not_accessible_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_accessible_count$, $str_alt210$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_NOT_ACCESSIBLE, $list_alt212);
        {
            SubLObject item_var = $assertion_not_accessible_via_el_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_accessible_via_el_results$, $str_alt215$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_not_accessible_via_el_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_accessible_via_el_time$, $str_alt217$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_not_accessible_via_el_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_accessible_via_el_count$, $str_alt219$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_NOT_ACCESSIBLE_VIA_EL, $list_alt221);
        {
            SubLObject item_var = $assertion_not_askable_at_el_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_askable_at_el_results$, $str_alt229$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_not_askable_at_el_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_askable_at_el_time$, $str_alt231$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_not_askable_at_el_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_askable_at_el_count$, $str_alt233$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_NOT_ASKABLE_AT_EL, $list_alt235);
        {
            SubLObject item_var = $assertion_not_askable_at_fi_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_askable_at_fi_results$, $str_alt237$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_not_askable_at_fi_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_askable_at_fi_time$, $str_alt239$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_not_askable_at_fi_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_not_askable_at_fi_count$, $str_alt241$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_NOT_ASKABLE_AT_FI, $list_alt243);
        {
            SubLObject item_var = $kbi_assertion_not_wff_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_assertion_not_wff_results$, $str_alt245$violators_of_kbi_module__KBI_ASSE);
        {
            SubLObject item_var = $kbi_assertion_not_wff_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_assertion_not_wff_time$, $str_alt247$run_time_of_predicate_application);
        {
            SubLObject item_var = $kbi_assertion_not_wff_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_assertion_not_wff_count$, $str_alt249$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($KBI_ASSERTION_NOT_WFF, $list_alt251);
        {
            SubLObject item_var = $kbi_selected_wff_violations$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_selected_wff_violations$, NIL);
        {
            SubLObject item_var = $assertion_el_not_wff_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_el_not_wff_results$, $str_alt255$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_el_not_wff_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_el_not_wff_time$, $str_alt257$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_el_not_wff_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_el_not_wff_count$, $str_alt259$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_EL_NOT_WFF, $list_alt261);
        {
            SubLObject item_var = $assertion_inform_mising_ist_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_inform_mising_ist_results$, $str_alt263$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $assertion_inform_mising_ist_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_inform_mising_ist_time$, $str_alt265$run_time_of_predicate_application);
        {
            SubLObject item_var = $assertion_inform_mising_ist_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_inform_mising_ist_count$, $str_alt267$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($ASSERTION_INFORM_MISING_IST, $list_alt269);
        {
            SubLObject item_var = $sym273$_ASSERTION_W_MAL_DOC_STRING_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym273$_ASSERTION_W_MAL_DOC_STRING_RESULTS_, $str_alt274$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym275$_ASSERTION_W_MAL_DOC_STRING_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym275$_ASSERTION_W_MAL_DOC_STRING_TIME_, $str_alt276$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym277$_ASSERTION_W_MAL_DOC_STRING_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym277$_ASSERTION_W_MAL_DOC_STRING_COUNT_, $str_alt278$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw279$ASSERTION_W_MAL_DOC_STRING, $list_alt280);
        {
            SubLObject item_var = $sym285$_ASSERTION_W_ATOMIC_NEG_LIT_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym285$_ASSERTION_W_ATOMIC_NEG_LIT_RESULTS_, $str_alt286$violators_of_kbi_module__ASSERTIO);
        {
            SubLObject item_var = $sym287$_ASSERTION_W_ATOMIC_NEG_LIT_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym287$_ASSERTION_W_ATOMIC_NEG_LIT_TIME_, $str_alt288$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym289$_ASSERTION_W_ATOMIC_NEG_LIT_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym289$_ASSERTION_W_ATOMIC_NEG_LIT_COUNT_, $str_alt290$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw291$ASSERTION_W_ATOMIC_NEG_LIT, $list_alt292);
        {
            SubLObject item_var = $diagnose_assertion_axiom_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($diagnose_assertion_axiom_results$, $str_alt296$violators_of_kbi_module__DIAGNOSE);
        {
            SubLObject item_var = $diagnose_assertion_axiom_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($diagnose_assertion_axiom_time$, $str_alt298$run_time_of_predicate_application);
        {
            SubLObject item_var = $diagnose_assertion_axiom_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($diagnose_assertion_axiom_count$, $str_alt300$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($DIAGNOSE_ASSERTION_AXIOM, $list_alt302);
        {
            SubLObject item_var = $diagnose_assertion_arguments_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($diagnose_assertion_arguments_results$, $str_alt306$violators_of_kbi_module__DIAGNOSE);
        {
            SubLObject item_var = $diagnose_assertion_arguments_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($diagnose_assertion_arguments_time$, $str_alt308$run_time_of_predicate_application);
        {
            SubLObject item_var = $diagnose_assertion_arguments_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($diagnose_assertion_arguments_count$, $str_alt310$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($DIAGNOSE_ASSERTION_ARGUMENTS, $list_alt312);
        return NIL;
    }



    static private final SubLString $str_alt1$diagnosing__s_assertions = makeString("diagnosing ~s assertions");

    static private final SubLString $$$mapping_Cyc_assertions = makeString("mapping Cyc assertions");





    static private final SubLString $str_alt5$mapping_kbi_assertions___s_ = makeString("mapping kbi assertions [~s]");

    private static final SubLSymbol CACHED_DIAGNOSE_ASSERTION = makeSymbol("CACHED-DIAGNOSE-ASSERTION");

    public static final SubLSymbol $cached_diagnose_assertion_caching_state$ = makeSymbol("*CACHED-DIAGNOSE-ASSERTION-CACHING-STATE*");

    public static final SubLInteger $int$1024 = makeInteger(1024);

    public static final SubLSymbol $kw9$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym10$_ASSERTION_W_O_MT_RESULTS_ = makeSymbol("*ASSERTION-W/O-MT-RESULTS*");

    static private final SubLString $str_alt11$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/O-MT");

    static private final SubLSymbol $sym12$_ASSERTION_W_O_MT_TIME_ = makeSymbol("*ASSERTION-W/O-MT-TIME*");

    static private final SubLString $str_alt13$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/O-MT");

    static private final SubLSymbol $sym14$_ASSERTION_W_O_MT_COUNT_ = makeSymbol("*ASSERTION-W/O-MT-COUNT*");

    static private final SubLString $str_alt15$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/O-MT");

    public static final SubLSymbol $kw16$ASSERTION_W_O_MT = makeKeyword("ASSERTION-W/O-MT");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/O-MT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/O-MT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/O-MT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-W/O-MT?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/O-MT?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/O-MT?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/O-MT?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for missing (or invalid) mt") });

    static private final SubLString $str_alt23$_s_is_not_a___Microtheory = makeString("~s is not a #$Microtheory");

    static private final SubLSymbol $sym24$_ASSERTION_W_O_VALID_ID_RESULTS_ = makeSymbol("*ASSERTION-W/O-VALID-ID-RESULTS*");

    static private final SubLString $str_alt25$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/O-VALID-ID");

    static private final SubLSymbol $sym26$_ASSERTION_W_O_VALID_ID_TIME_ = makeSymbol("*ASSERTION-W/O-VALID-ID-TIME*");

    static private final SubLString $str_alt27$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/O-VALID-ID");

    static private final SubLSymbol $sym28$_ASSERTION_W_O_VALID_ID_COUNT_ = makeSymbol("*ASSERTION-W/O-VALID-ID-COUNT*");

    static private final SubLString $str_alt29$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/O-VALID-ID");

    public static final SubLSymbol $kw30$ASSERTION_W_O_VALID_ID = makeKeyword("ASSERTION-W/O-VALID-ID");

    static private final SubLList $list_alt31 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/O-VALID-ID-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/O-VALID-ID-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/O-VALID-ID-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-VALID-ASSERTION-ID?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/O-VALID-ID?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/O-VALID-ID?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/O-VALID-ID?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for missing (or invalid) id") });

    static private final SubLString $str_alt32$_s_is_not_a_small__fixnum__intege = makeString("~s is not a small (fixnum) integer");

    static private final SubLString $str_alt33$_s_does_not_index__s = makeString("~s does not index ~s");

    static private final SubLSymbol $sym34$_ASSERTION_W_O_TV_RESULTS_ = makeSymbol("*ASSERTION-W/O-TV-RESULTS*");

    static private final SubLString $str_alt35$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/O-TV");

    static private final SubLSymbol $sym36$_ASSERTION_W_O_TV_TIME_ = makeSymbol("*ASSERTION-W/O-TV-TIME*");

    static private final SubLString $str_alt37$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/O-TV");

    static private final SubLSymbol $sym38$_ASSERTION_W_O_TV_COUNT_ = makeSymbol("*ASSERTION-W/O-TV-COUNT*");

    static private final SubLString $str_alt39$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/O-TV");

    public static final SubLSymbol $kw40$ASSERTION_W_O_TV = makeKeyword("ASSERTION-W/O-TV");

    static private final SubLList $list_alt41 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/O-TV-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/O-TV-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/O-TV-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-W/O-TV?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/O-TV?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/O-TV?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/O-TV?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for missing (or invalid) tv") });

    static private final SubLString $str_alt42$_s_is_not_a_valid_assertion_truth = makeString("~s is not a valid assertion truth value");

    static private final SubLSymbol $sym43$_ASSERTION_W_O_DIRECTION_RESULTS_ = makeSymbol("*ASSERTION-W/O-DIRECTION-RESULTS*");

    static private final SubLString $str_alt44$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/O-DIRECTION");

    static private final SubLSymbol $sym45$_ASSERTION_W_O_DIRECTION_TIME_ = makeSymbol("*ASSERTION-W/O-DIRECTION-TIME*");

    static private final SubLString $str_alt46$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/O-DIRECTION");

    static private final SubLSymbol $sym47$_ASSERTION_W_O_DIRECTION_COUNT_ = makeSymbol("*ASSERTION-W/O-DIRECTION-COUNT*");

    static private final SubLString $str_alt48$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/O-DIRECTION");

    public static final SubLSymbol $kw49$ASSERTION_W_O_DIRECTION = makeKeyword("ASSERTION-W/O-DIRECTION");

    static private final SubLList $list_alt50 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/O-DIRECTION-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/O-DIRECTION-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/O-DIRECTION-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-W/O-DIRECTION?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/O-DIRECTION?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/O-DIRECTION?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/O-DIRECTION?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for missing (or invalid) direction") });

    static private final SubLString $str_alt51$_s_is_not_a_valid_assertion_direc = makeString("~s is not a valid assertion direction");

    static private final SubLSymbol $sym52$_ASSERTION_W_O_VALID_VAR_NAMES_RESULTS_ = makeSymbol("*ASSERTION-W/O-VALID-VAR-NAMES-RESULTS*");

    static private final SubLString $str_alt53$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/O-VALID-VAR-NAMES");

    static private final SubLSymbol $sym54$_ASSERTION_W_O_VALID_VAR_NAMES_TIME_ = makeSymbol("*ASSERTION-W/O-VALID-VAR-NAMES-TIME*");

    static private final SubLString $str_alt55$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/O-VALID-VAR-NAMES");

    static private final SubLSymbol $sym56$_ASSERTION_W_O_VALID_VAR_NAMES_COUNT_ = makeSymbol("*ASSERTION-W/O-VALID-VAR-NAMES-COUNT*");

    static private final SubLString $str_alt57$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/O-VALID-VAR-NAMES");

    public static final SubLSymbol $kw58$ASSERTION_W_O_VALID_VAR_NAMES = makeKeyword("ASSERTION-W/O-VALID-VAR-NAMES");

    static private final SubLList $list_alt59 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/O-VALID-VAR-NAMES-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/O-VALID-VAR-NAMES-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/O-VALID-VAR-NAMES-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-W/O-VALID-VAR-NAMES"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/O-VALID-VAR-NAMES?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/O-VALID-VAR-NAMES?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/O-VALID-VAR-NAMES?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for missing (or invalid) variable names") });

    static private final SubLString $str_alt60$ = makeString("");

    static private final SubLList $list_alt61 = list(makeSymbol("KEY"), makeSymbol("RESULT"), makeSymbol("&OPTIONAL"), makeSymbol("ORTS"));

    private static final SubLSymbol $NUMBER_MISMATCH = makeKeyword("NUMBER-MISMATCH");

    static private final SubLString $str_alt63$___s_inference_variables_but__s_v = makeString("~%~s inference variables but ~s variable names");

    private static final SubLSymbol $DUPLICATES = makeKeyword("DUPLICATES");

    static private final SubLString $str_alt65$___duplicated_variable_names___a = makeString("~% duplicated variable names: ~a");



    static private final SubLString $str_alt67$__ = makeString(", ");

    static private final SubLString $str_alt68$_and_ = makeString(" and ");

    private static final SubLSymbol $NON_STRINGS = makeKeyword("NON-STRINGS");

    static private final SubLString $str_alt70$___non_string_variable_names___a = makeString("~% non-string variable names: ~a");

    private static final SubLSymbol $EL_HL_VAR = makeKeyword("EL-HL-VAR");

    static private final SubLString $str_alt72$___invalid_el_variable_names___a = makeString("~% invalid el variable names: ~a");

    private static final SubLSymbol $CLOSED_HL_VARS_FOR = makeKeyword("CLOSED-HL-VARS-FOR");

    static private final SubLString $str_alt74$___hl_for_closed_el_variables___a = makeString("~% hl for closed el variables: ~a");

    static private final SubLSymbol $sym75$HL_VAR_ = makeSymbol("HL-VAR?");

    static private final SubLSymbol $sym76$EL_HL_VAR_ = makeSymbol("EL-HL-VAR?");

    static private final SubLString $str_alt77$_VAR = makeString("?VAR");

    static private final SubLSymbol $sym78$_ASSERTION_W_O_PREFERED_VAR_NAMES_RESULTS_ = makeSymbol("*ASSERTION-W/O-PREFERED-VAR-NAMES-RESULTS*");

    static private final SubLString $str_alt79$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/O-PREFERED-VAR-NAMES");

    static private final SubLSymbol $sym80$_ASSERTION_W_O_PREFERED_VAR_NAMES_TIME_ = makeSymbol("*ASSERTION-W/O-PREFERED-VAR-NAMES-TIME*");

    static private final SubLString $str_alt81$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/O-PREFERED-VAR-NAMES");

    static private final SubLSymbol $sym82$_ASSERTION_W_O_PREFERED_VAR_NAMES_COUNT_ = makeSymbol("*ASSERTION-W/O-PREFERED-VAR-NAMES-COUNT*");

    static private final SubLString $str_alt83$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/O-PREFERED-VAR-NAMES");

    public static final SubLSymbol $kw84$ASSERTION_W_O_PREFERED_VAR_NAMES = makeKeyword("ASSERTION-W/O-PREFERED-VAR-NAMES");

    static private final SubLList $list_alt85 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/O-PREFERED-VAR-NAMES-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/O-PREFERED-VAR-NAMES-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/O-PREFERED-VAR-NAMES-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-POOR-VAR-NAMES"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/O-PREFERED-VAR-NAMES?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/O-PREFERED-VAR-NAMES?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/O-PREFERED-VAR-NAMES?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("STYLE"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test ASSERTION for missing (or invalid) variable names") });

    static private final SubLList $list_alt86 = list(makeSymbol("KEY"), makeSymbol("&REST"), makeSymbol("RESULT"));

    private static final SubLSymbol $SINGLE_LETTER_VAR = makeKeyword("SINGLE-LETTER-VAR");

    static private final SubLString $str_alt88$single_letter_variable___a = makeString("single letter variable: ~a");

    static private final SubLString $str_alt89$_ = makeString(" ");

    static private final SubLSymbol $sym90$_ASSERTION_W_O_ARGUMENT_RESULTS_ = makeSymbol("*ASSERTION-W/O-ARGUMENT-RESULTS*");

    static private final SubLString $str_alt91$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/O-ARGUMENT");

    static private final SubLSymbol $sym92$_ASSERTION_W_O_ARGUMENT_TIME_ = makeSymbol("*ASSERTION-W/O-ARGUMENT-TIME*");

    static private final SubLString $str_alt93$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/O-ARGUMENT");

    static private final SubLSymbol $sym94$_ASSERTION_W_O_ARGUMENT_COUNT_ = makeSymbol("*ASSERTION-W/O-ARGUMENT-COUNT*");

    static private final SubLString $str_alt95$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/O-ARGUMENT");

    public static final SubLSymbol $kw96$ASSERTION_W_O_ARGUMENT = makeKeyword("ASSERTION-W/O-ARGUMENT");

    static private final SubLList $list_alt97 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/O-ARGUMENT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/O-ARGUMENT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/O-ARGUMENT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-W/O-ARGUMENT?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/O-ARGUMENT?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/O-ARGUMENT?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/O-ARGUMENT?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for no arguments") });

    static private final SubLString $str_alt98$_s_has_no_argument = makeString("~s has no argument");

    static private final SubLSymbol $sym99$_ASSERTION_W_MAL_ARGUMENTS_RESULTS_ = makeSymbol("*ASSERTION-W/MAL-ARGUMENTS-RESULTS*");

    static private final SubLString $str_alt100$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/MAL-ARGUMENTS");

    static private final SubLSymbol $sym101$_ASSERTION_W_MAL_ARGUMENTS_TIME_ = makeSymbol("*ASSERTION-W/MAL-ARGUMENTS-TIME*");

    static private final SubLString $str_alt102$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/MAL-ARGUMENTS");

    static private final SubLSymbol $sym103$_ASSERTION_W_MAL_ARGUMENTS_COUNT_ = makeSymbol("*ASSERTION-W/MAL-ARGUMENTS-COUNT*");

    static private final SubLString $str_alt104$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/MAL-ARGUMENTS");

    public static final SubLSymbol $kw105$ASSERTION_W_MAL_ARGUMENTS = makeKeyword("ASSERTION-W/MAL-ARGUMENTS");

    static private final SubLList $list_alt106 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/MAL-ARGUMENTS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/MAL-ARGUMENTS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/MAL-ARGUMENTS-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-MAL-ARGUMENTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/MAL-ARGUMENTS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/MAL-ARGUMENTS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/MAL-ARGUMENTS?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for inappropriate arguments") });

    static private final SubLString $str_alt107$arguments_not_indexing_this_asser = makeString("arguments not indexing this assertion: ~a");

    public static final SubLSymbol $assertion_misindexed_results$ = makeSymbol("*ASSERTION-MISINDEXED-RESULTS*");

    static private final SubLString $str_alt109$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-MISINDEXED");

    public static final SubLSymbol $assertion_misindexed_time$ = makeSymbol("*ASSERTION-MISINDEXED-TIME*");

    static private final SubLString $str_alt111$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-MISINDEXED");

    public static final SubLSymbol $assertion_misindexed_count$ = makeSymbol("*ASSERTION-MISINDEXED-COUNT*");

    static private final SubLString $str_alt113$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-MISINDEXED");

    private static final SubLSymbol $ASSERTION_MISINDEXED = makeKeyword("ASSERTION-MISINDEXED");

    static private final SubLList $list_alt115 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-MISINDEXED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-MISINDEXED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-MISINDEXED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("INDICES-MISSING-ASSERTION"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-MISINDEXED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-MISINDEXED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-MISINDEXED?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for missing from appropriate indices") });

    static private final SubLList $list_alt116 = list(makeSymbol("CONSTANT"), makeSymbol("INDEX"), makeSymbol("&OPTIONAL"), makeSymbol("THE-TERM-INDEX"));

    static private final SubLString $str_alt117$__assertion_missing_from__s_index = makeString("~%assertion missing from ~s index ~s index");

    static private final SubLString $str_alt118$__assertion_missing_from__s_index = makeString("~%assertion missing from ~s index ~s");

    private static final SubLSymbol $CONSTANTS_NOT_INDEXING_ASSERTION = makeKeyword("CONSTANTS-NOT-INDEXING-ASSERTION");



    private static final SubLSymbol INDEXING_LEAF_P = makeSymbol("INDEXING-LEAF-P");





    private static final SubLSymbol $CORRECT = makeKeyword("CORRECT");

    private static final SubLSymbol $INCORRECT = makeKeyword("INCORRECT");

    static private final SubLList $list_alt126 = list(makeKeyword("NEG"), makeKeyword("POS"));





    static private final SubLSymbol $sym129$ASSERTION_FOUND_ = makeSymbol("ASSERTION-FOUND?");





    public static final SubLSymbol $assertion_duplicates_results$ = makeSymbol("*ASSERTION-DUPLICATES-RESULTS*");

    static private final SubLString $str_alt133$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-DUPLICATES");

    public static final SubLSymbol $assertion_duplicates_time$ = makeSymbol("*ASSERTION-DUPLICATES-TIME*");

    static private final SubLString $str_alt135$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-DUPLICATES");

    public static final SubLSymbol $assertion_duplicates_count$ = makeSymbol("*ASSERTION-DUPLICATES-COUNT*");

    static private final SubLString $str_alt137$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-DUPLICATES");

    private static final SubLSymbol $ASSERTION_DUPLICATES = makeKeyword("ASSERTION-DUPLICATES");

    static private final SubLList $list_alt139 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-DUPLICATES-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-DUPLICATES-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-DUPLICATES-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), FOUR_INTEGER, makeKeyword("KBI-SELECTED?"), NIL, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-DUPLICATES"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-DUPLICATES?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-DUPLICATES?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-DUPLICATES?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for duplicates (different assertions having same formula and mt)") });

    static private final SubLString $str_alt140$ids_of_duplicate_assertions_are__ = makeString("ids of duplicate assertions are: ~a");



    public static final SubLSymbol $assertion_redundant_wrt_mt_results$ = makeSymbol("*ASSERTION-REDUNDANT-WRT-MT-RESULTS*");

    static private final SubLString $str_alt143$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-REDUNDANT-WRT-MT");

    public static final SubLSymbol $assertion_redundant_wrt_mt_time$ = makeSymbol("*ASSERTION-REDUNDANT-WRT-MT-TIME*");

    static private final SubLString $str_alt145$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-REDUNDANT-WRT-MT");

    public static final SubLSymbol $assertion_redundant_wrt_mt_count$ = makeSymbol("*ASSERTION-REDUNDANT-WRT-MT-COUNT*");

    static private final SubLString $str_alt147$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-REDUNDANT-WRT-MT");

    private static final SubLSymbol $ASSERTION_REDUNDANT_WRT_MT = makeKeyword("ASSERTION-REDUNDANT-WRT-MT");

    static private final SubLList $list_alt149 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-REDUNDANT-WRT-MT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-REDUNDANT-WRT-MT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-REDUNDANT-WRT-MT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-REDUNDANT-WRT-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-REDUNDANT-WRT-MT?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-REDUNDANT-WRT-MT?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-REDUNDANT-WRT-MT?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("REDUNDANCY"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test ASSERTION for similar clause-strucs in #$genlMts") });

    static private final SubLString $str_alt150$the_formula_of_this_assertion_is_ = makeString("the formula of this assertion is also asserted in mts: ~a");

    public static final SubLSymbol $assertion_redundant_wrt_isa_results$ = makeSymbol("*ASSERTION-REDUNDANT-WRT-ISA-RESULTS*");

    static private final SubLString $str_alt152$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-REDUNDANT-WRT-ISA");

    public static final SubLSymbol $assertion_redundant_wrt_isa_time$ = makeSymbol("*ASSERTION-REDUNDANT-WRT-ISA-TIME*");

    static private final SubLString $str_alt154$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-REDUNDANT-WRT-ISA");

    public static final SubLSymbol $assertion_redundant_wrt_isa_count$ = makeSymbol("*ASSERTION-REDUNDANT-WRT-ISA-COUNT*");

    static private final SubLString $str_alt156$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-REDUNDANT-WRT-ISA");

    private static final SubLSymbol $ASSERTION_REDUNDANT_WRT_ISA = makeKeyword("ASSERTION-REDUNDANT-WRT-ISA");

    static private final SubLList $list_alt158 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-REDUNDANT-WRT-ISA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-REDUNDANT-WRT-ISA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-REDUNDANT-WRT-ISA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-REDUNDANT-ISA-LITERALS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-REDUNDANT-WRT-ISA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-REDUNDANT-WRT-ISA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-REDUNDANT-WRT-ISA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("REDUNDANCY"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test ASSERTION for redundant #$isa literals") });

    static private final SubLString $str_alt159$Literals_that_are_redundant__e_g_ = makeString("Literals that are redundant (e.g., wrt arg-isa constraints):");

    static private final SubLString $str_alt160$_____s = makeString("~%  ~s");

    static private final SubLList $list_alt161 = list(makeSymbol("PRED"), makeSymbol("VAR"), makeSymbol("COL"));

    public static final SubLSymbol $assertion_isa_too_weak_results$ = makeSymbol("*ASSERTION-ISA-TOO-WEAK-RESULTS*");

    static private final SubLString $str_alt163$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-ISA-TOO-WEAK");

    public static final SubLSymbol $assertion_isa_too_weak_time$ = makeSymbol("*ASSERTION-ISA-TOO-WEAK-TIME*");

    static private final SubLString $str_alt165$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-ISA-TOO-WEAK");

    public static final SubLSymbol $assertion_isa_too_weak_count$ = makeSymbol("*ASSERTION-ISA-TOO-WEAK-COUNT*");

    static private final SubLString $str_alt167$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-ISA-TOO-WEAK");

    private static final SubLSymbol $ASSERTION_ISA_TOO_WEAK = makeKeyword("ASSERTION-ISA-TOO-WEAK");

    static private final SubLList $list_alt169 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-ISA-TOO-WEAK-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-ISA-TOO-WEAK-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-ISA-TOO-WEAK-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-ISA-TOO-WEAK"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-ISA-TOO-WEAK?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-ISA-TOO-WEAK?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-ISA-TOO-WEAK?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("REDUNDANCY"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test ASSERTION for #$isa literals that are too weak") });

    static private final SubLString $str_alt170$isa_literals_that_are_too_weak__e = makeString("isa literals that are too weak (e.g., wrt arg-isa constraints):");

    public static final SubLSymbol $assertion_pred_too_weak_results$ = makeSymbol("*ASSERTION-PRED-TOO-WEAK-RESULTS*");

    static private final SubLString $str_alt172$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-PRED-TOO-WEAK");

    public static final SubLSymbol $assertion_pred_too_weak_time$ = makeSymbol("*ASSERTION-PRED-TOO-WEAK-TIME*");

    static private final SubLString $str_alt174$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-PRED-TOO-WEAK");

    public static final SubLSymbol $assertion_pred_too_weak_count$ = makeSymbol("*ASSERTION-PRED-TOO-WEAK-COUNT*");

    static private final SubLString $str_alt176$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-PRED-TOO-WEAK");

    private static final SubLSymbol $ASSERTION_PRED_TOO_WEAK = makeKeyword("ASSERTION-PRED-TOO-WEAK");

    static private final SubLList $list_alt178 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-PRED-TOO-WEAK-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-PRED-TOO-WEAK-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-PRED-TOO-WEAK-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-PRED-TOO-WEAK"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-PRED-TOO-WEAK?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-PRED-TOO-WEAK?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-PRED-TOO-WEAK?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("REDUNDANCY"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test ASSERTION for literals whose predicates are too weak") });

    static private final SubLString $str_alt179$literals_that_are_too_weak__e_g__ = makeString("literals that are too weak (e.g., wrt #$typedGenlPreds):");

    static private final SubLString $str_alt180$_____s_should_be_replaced_with__s = makeString("~%  ~s should be replaced with ~s in ~%    ~s");

    public static final SubLObject $$typedGenlPreds = constant_handles.reader_make_constant_shell(makeString("typedGenlPreds"));



    public static final SubLObject $$typedGenlInverse = constant_handles.reader_make_constant_shell(makeString("typedGenlInverse"));

    static private final SubLSymbol $sym184$_ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS_RESULTS_ = makeSymbol("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-RESULTS*");

    static private final SubLString $str_alt185$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS");

    static private final SubLSymbol $sym186$_ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS_TIME_ = makeSymbol("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-TIME*");

    static private final SubLString $str_alt187$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS");

    static private final SubLSymbol $sym188$_ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS_COUNT_ = makeSymbol("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-COUNT*");

    static private final SubLString $str_alt189$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS");

    public static final SubLSymbol $kw190$ASSERTION_NON_CONSTANT_ARG_ISA_W_O_DEFNS = makeKeyword("ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS");

    static private final SubLList $list_alt191 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-NON-CONSTANT-ARG-TYPES-W/O-DEFNS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-NON-CONSTANT-ARG-ISA-W/O-DEFNS?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for non-constant args not admitted by defns") });

    static private final SubLString $str_alt192$non_constant_args_w_o_defns__inva = makeString("non-constant args w/o defns (invalid wrt arg-isa constraints):");

    static private final SubLList $list_alt193 = list(makeSymbol("LIT"), makeSymbol("ARG"), makeSymbol("ISA"), makeSymbol("MT"));

    static private final SubLString $str_alt194$___s_in__s_violates___isa_constra = makeString("~%~s in ~s violates #$isa constraint ~s [in ~s]");

    public static final SubLSymbol $assertion_not_canonical_results$ = makeSymbol("*ASSERTION-NOT-CANONICAL-RESULTS*");

    static private final SubLString $str_alt196$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-NOT-CANONICAL");

    public static final SubLSymbol $assertion_not_canonical_time$ = makeSymbol("*ASSERTION-NOT-CANONICAL-TIME*");

    static private final SubLString $str_alt198$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-NOT-CANONICAL");

    public static final SubLSymbol $assertion_not_canonical_count$ = makeSymbol("*ASSERTION-NOT-CANONICAL-COUNT*");

    static private final SubLString $str_alt200$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-NOT-CANONICAL");

    private static final SubLSymbol $ASSERTION_NOT_CANONICAL = makeKeyword("ASSERTION-NOT-CANONICAL");

    static private final SubLList $list_alt202 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-NOT-CANONICAL-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-NOT-CANONICAL-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-NOT-CANONICAL-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-NOT-CANONICAL"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-NOT-CANONICAL?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-NOT-CANONICAL?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-NOT-CANONICAL?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for being non canonical") });

    static private final SubLList $list_alt203 = list(makeSymbol("OLD-CNF"), makeSymbol("NEW-CNF"));

    static private final SubLString $str_alt204$__this_assertion_has_old_cnf_____ = makeString("~%this assertion has old cnf:~%  ~s~%  and new cnf:~%  ~s");

    public static final SubLSymbol $assertion_not_accessible_results$ = makeSymbol("*ASSERTION-NOT-ACCESSIBLE-RESULTS*");

    static private final SubLString $str_alt206$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-NOT-ACCESSIBLE");

    public static final SubLSymbol $assertion_not_accessible_time$ = makeSymbol("*ASSERTION-NOT-ACCESSIBLE-TIME*");

    static private final SubLString $str_alt208$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-NOT-ACCESSIBLE");

    public static final SubLSymbol $assertion_not_accessible_count$ = makeSymbol("*ASSERTION-NOT-ACCESSIBLE-COUNT*");

    static private final SubLString $str_alt210$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-NOT-ACCESSIBLE");

    private static final SubLSymbol $ASSERTION_NOT_ACCESSIBLE = makeKeyword("ASSERTION-NOT-ACCESSIBLE");

    static private final SubLList $list_alt212 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-NOT-ACCESSIBLE-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-NOT-ACCESSIBLE-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-NOT-ACCESSIBLE-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-NOT-ACCESSIBLE?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-NOT-ACCESSIBLE?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-NOT-ACCESSIBLE?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-NOT-ACCESSIBLE?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for being non accessible via tl") });

    static private final SubLString $str_alt213$This_assertion_is_inaccessible_vi = makeString("This assertion is inaccessible via TL:  ~s");

    public static final SubLSymbol $assertion_not_accessible_via_el_results$ = makeSymbol("*ASSERTION-NOT-ACCESSIBLE-VIA-EL-RESULTS*");

    static private final SubLString $str_alt215$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-NOT-ACCESSIBLE-VIA-EL");

    public static final SubLSymbol $assertion_not_accessible_via_el_time$ = makeSymbol("*ASSERTION-NOT-ACCESSIBLE-VIA-EL-TIME*");

    static private final SubLString $str_alt217$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-NOT-ACCESSIBLE-VIA-EL");

    public static final SubLSymbol $assertion_not_accessible_via_el_count$ = makeSymbol("*ASSERTION-NOT-ACCESSIBLE-VIA-EL-COUNT*");

    static private final SubLString $str_alt219$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-NOT-ACCESSIBLE-VIA-EL");

    private static final SubLSymbol $ASSERTION_NOT_ACCESSIBLE_VIA_EL = makeKeyword("ASSERTION-NOT-ACCESSIBLE-VIA-EL");

    static private final SubLList $list_alt221 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-NOT-ACCESSIBLE-VIA-EL-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-NOT-ACCESSIBLE-VIA-EL-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-NOT-ACCESSIBLE-VIA-EL-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-NOT-ACCESSIBLE-VIA-EL?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-NOT-ACCESSIBLE-VIA-EL?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-NOT-ACCESSIBLE-VIA-EL?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-NOT-ACCESSIBLE-VIA-EL?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for being not accessible via el") });

    static private final SubLList $list_alt222 = list(makeSymbol("OLD-CNF"), makeSymbol("NEW-CNFS"));

    static private final SubLString $str_alt223$This_assertion_has_old_cnf______s = makeString("This assertion has old cnf:~%  ~s~%  and new cnf~a:~%  ~s");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $str_alt225$_s = makeString("~s");

    static private final SubLString $str_alt226$__ = makeString("  ");



    public static final SubLSymbol $assertion_not_askable_at_el_results$ = makeSymbol("*ASSERTION-NOT-ASKABLE-AT-EL-RESULTS*");

    static private final SubLString $str_alt229$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-NOT-ASKABLE-AT-EL");

    public static final SubLSymbol $assertion_not_askable_at_el_time$ = makeSymbol("*ASSERTION-NOT-ASKABLE-AT-EL-TIME*");

    static private final SubLString $str_alt231$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-NOT-ASKABLE-AT-EL");

    public static final SubLSymbol $assertion_not_askable_at_el_count$ = makeSymbol("*ASSERTION-NOT-ASKABLE-AT-EL-COUNT*");

    static private final SubLString $str_alt233$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-NOT-ASKABLE-AT-EL");

    private static final SubLSymbol $ASSERTION_NOT_ASKABLE_AT_EL = makeKeyword("ASSERTION-NOT-ASKABLE-AT-EL");

    static private final SubLList $list_alt235 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-NOT-ASKABLE-AT-EL-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-NOT-ASKABLE-AT-EL-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-NOT-ASKABLE-AT-EL-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-SELECTED?"), NIL, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-NOT-ASKABLE-AT-EL?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-NOT-ASKABLE-AT-EL?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-NOT-ASKABLE-AT-EL?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-NOT-ASKABLE-AT-EL?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for being not askable") });

    public static final SubLSymbol $assertion_not_askable_at_fi_results$ = makeSymbol("*ASSERTION-NOT-ASKABLE-AT-FI-RESULTS*");

    static private final SubLString $str_alt237$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-NOT-ASKABLE-AT-FI");

    public static final SubLSymbol $assertion_not_askable_at_fi_time$ = makeSymbol("*ASSERTION-NOT-ASKABLE-AT-FI-TIME*");

    static private final SubLString $str_alt239$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-NOT-ASKABLE-AT-FI");

    public static final SubLSymbol $assertion_not_askable_at_fi_count$ = makeSymbol("*ASSERTION-NOT-ASKABLE-AT-FI-COUNT*");

    static private final SubLString $str_alt241$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-NOT-ASKABLE-AT-FI");

    private static final SubLSymbol $ASSERTION_NOT_ASKABLE_AT_FI = makeKeyword("ASSERTION-NOT-ASKABLE-AT-FI");

    static private final SubLList $list_alt243 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-NOT-ASKABLE-AT-FI-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-NOT-ASKABLE-AT-FI-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-NOT-ASKABLE-AT-FI-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-SELECTED?"), NIL, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-NOT-ASKABLE-AT-FI?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-NOT-ASKABLE-AT-FI?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-NOT-ASKABLE-AT-FI?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-NOT-ASKABLE-AT-FI?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("FI"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for being not askable") });

    public static final SubLSymbol $kbi_assertion_not_wff_results$ = makeSymbol("*KBI-ASSERTION-NOT-WFF-RESULTS*");

    static private final SubLString $str_alt245$violators_of_kbi_module__KBI_ASSE = makeString("violators of kbi module :KBI-ASSERTION-NOT-WFF");

    public static final SubLSymbol $kbi_assertion_not_wff_time$ = makeSymbol("*KBI-ASSERTION-NOT-WFF-TIME*");

    static private final SubLString $str_alt247$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :KBI-ASSERTION-NOT-WFF");

    public static final SubLSymbol $kbi_assertion_not_wff_count$ = makeSymbol("*KBI-ASSERTION-NOT-WFF-COUNT*");

    static private final SubLString $str_alt249$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :KBI-ASSERTION-NOT-WFF");

    private static final SubLSymbol $KBI_ASSERTION_NOT_WFF = makeKeyword("KBI-ASSERTION-NOT-WFF");

    static private final SubLList $list_alt251 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*KBI-ASSERTION-NOT-WFF-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*KBI-ASSERTION-NOT-WFF-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*KBI-ASSERTION-NOT-WFF-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-NOT-WFF-INT"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("KBI-ASSERTION-NOT-WFF?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-NOT-WFF?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-NOT-WFF?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for wff violations") });

    public static final SubLSymbol $kbi_selected_wff_violations$ = makeSymbol("*KBI-SELECTED-WFF-VIOLATIONS*");

    static private final SubLString $str_alt253$this_assertion_has_the_following_ = makeString("this assertion has the following wff violation~a:");

    public static final SubLSymbol $assertion_el_not_wff_results$ = makeSymbol("*ASSERTION-EL-NOT-WFF-RESULTS*");

    static private final SubLString $str_alt255$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-EL-NOT-WFF");

    public static final SubLSymbol $assertion_el_not_wff_time$ = makeSymbol("*ASSERTION-EL-NOT-WFF-TIME*");

    static private final SubLString $str_alt257$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-EL-NOT-WFF");

    public static final SubLSymbol $assertion_el_not_wff_count$ = makeSymbol("*ASSERTION-EL-NOT-WFF-COUNT*");

    static private final SubLString $str_alt259$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-EL-NOT-WFF");

    private static final SubLSymbol $ASSERTION_EL_NOT_WFF = makeKeyword("ASSERTION-EL-NOT-WFF");

    static private final SubLList $list_alt261 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-EL-NOT-WFF-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-EL-NOT-WFF-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-EL-NOT-WFF-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-EL-NOT-WFF"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-EL-NOT-WFF?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-EL-NOT-WFF?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-EL-NOT-WFF?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for wff violations") });

    public static final SubLSymbol $assertion_inform_mising_ist_results$ = makeSymbol("*ASSERTION-INFORM-MISING-IST-RESULTS*");

    static private final SubLString $str_alt263$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-INFORM-MISING-IST");

    public static final SubLSymbol $assertion_inform_mising_ist_time$ = makeSymbol("*ASSERTION-INFORM-MISING-IST-TIME*");

    static private final SubLString $str_alt265$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-INFORM-MISING-IST");

    public static final SubLSymbol $assertion_inform_mising_ist_count$ = makeSymbol("*ASSERTION-INFORM-MISING-IST-COUNT*");

    static private final SubLString $str_alt267$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-INFORM-MISING-IST");

    private static final SubLSymbol $ASSERTION_INFORM_MISING_IST = makeKeyword("ASSERTION-INFORM-MISING-IST");

    static private final SubLList $list_alt269 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-INFORM-MISING-IST-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-INFORM-MISING-IST-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-INFORM-MISING-IST-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-INFORM-MISING-IST?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-INFORM-MISING-IST?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-INFORM-MISING-IST?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-INFORM-MISING-IST?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test for #$informStatement assertion w/o corresponding #$ist assertion") });

    static private final SubLString $str_alt270$__informStatement_assertion_w_o_c = makeString("#$informStatement assertion w/o corresponding #$ist assertion");

    public static final SubLObject $$informStatement = constant_handles.reader_make_constant_shell(makeString("informStatement"));

    static private final SubLList $list_alt272 = list(makeSymbol("CNF"), makeSymbol("BLIST"));

    static private final SubLSymbol $sym273$_ASSERTION_W_MAL_DOC_STRING_RESULTS_ = makeSymbol("*ASSERTION-W/MAL-DOC-STRING-RESULTS*");

    static private final SubLString $str_alt274$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/MAL-DOC-STRING");

    static private final SubLSymbol $sym275$_ASSERTION_W_MAL_DOC_STRING_TIME_ = makeSymbol("*ASSERTION-W/MAL-DOC-STRING-TIME*");

    static private final SubLString $str_alt276$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/MAL-DOC-STRING");

    static private final SubLSymbol $sym277$_ASSERTION_W_MAL_DOC_STRING_COUNT_ = makeSymbol("*ASSERTION-W/MAL-DOC-STRING-COUNT*");

    static private final SubLString $str_alt278$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/MAL-DOC-STRING");

    public static final SubLSymbol $kw279$ASSERTION_W_MAL_DOC_STRING = makeKeyword("ASSERTION-W/MAL-DOC-STRING");

    static private final SubLList $list_alt280 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/MAL-DOC-STRING-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/MAL-DOC-STRING-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/MAL-DOC-STRING-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-W/MAL-DOC-STRING"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/MAL-DOC-STRING?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/MAL-DOC-STRING?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/MAL-DOC-STRING?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test ASSERTION for mal documentation string") });

    static private final SubLString $str_alt281$the_documentation_string_this_of_ = makeString("the documentation string this of assertion references undefined constant~a: ~a");

    static private final SubLString $str_alt282$__and_ = makeString(", and ");

    static private final SubLSymbol $sym283$STRING_ = makeSymbol("STRING=");

    public static final SubLObject $$DocumentationConstant = constant_handles.reader_make_constant_shell(makeString("DocumentationConstant"));

    static private final SubLSymbol $sym285$_ASSERTION_W_ATOMIC_NEG_LIT_RESULTS_ = makeSymbol("*ASSERTION-W/ATOMIC-NEG-LIT-RESULTS*");

    static private final SubLString $str_alt286$violators_of_kbi_module__ASSERTIO = makeString("violators of kbi module :ASSERTION-W/ATOMIC-NEG-LIT");

    static private final SubLSymbol $sym287$_ASSERTION_W_ATOMIC_NEG_LIT_TIME_ = makeSymbol("*ASSERTION-W/ATOMIC-NEG-LIT-TIME*");

    static private final SubLString $str_alt288$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :ASSERTION-W/ATOMIC-NEG-LIT");

    static private final SubLSymbol $sym289$_ASSERTION_W_ATOMIC_NEG_LIT_COUNT_ = makeSymbol("*ASSERTION-W/ATOMIC-NEG-LIT-COUNT*");

    static private final SubLString $str_alt290$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :ASSERTION-W/ATOMIC-NEG-LIT");

    public static final SubLSymbol $kw291$ASSERTION_W_ATOMIC_NEG_LIT = makeKeyword("ASSERTION-W/ATOMIC-NEG-LIT");

    static private final SubLList $list_alt292 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*ASSERTION-W/ATOMIC-NEG-LIT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*ASSERTION-W/ATOMIC-NEG-LIT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*ASSERTION-W/ATOMIC-NEG-LIT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-ASSERTION-W/ATOMIC-NEG-LIT?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("ASSERTION-W/ATOMIC-NEG-LIT?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-ASSERTION-W/ATOMIC-NEG-LIT?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-ASSERTION-W/ATOMIC-NEG-LIT?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("STYLE"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test ASSERTION for negated atomic sentence") });

    static private final SubLString $str_alt293$this_assertion_is_a_negated_atomi = makeString("this assertion is a negated atomic sentence");



    public static final SubLSymbol $diagnose_assertion_axiom_results$ = makeSymbol("*DIAGNOSE-ASSERTION-AXIOM-RESULTS*");

    static private final SubLString $str_alt296$violators_of_kbi_module__DIAGNOSE = makeString("violators of kbi module :DIAGNOSE-ASSERTION-AXIOM");

    public static final SubLSymbol $diagnose_assertion_axiom_time$ = makeSymbol("*DIAGNOSE-ASSERTION-AXIOM-TIME*");

    static private final SubLString $str_alt298$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :DIAGNOSE-ASSERTION-AXIOM");

    public static final SubLSymbol $diagnose_assertion_axiom_count$ = makeSymbol("*DIAGNOSE-ASSERTION-AXIOM-COUNT*");

    static private final SubLString $str_alt300$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :DIAGNOSE-ASSERTION-AXIOM");

    private static final SubLSymbol $DIAGNOSE_ASSERTION_AXIOM = makeKeyword("DIAGNOSE-ASSERTION-AXIOM");

    static private final SubLList $list_alt302 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*DIAGNOSE-ASSERTION-AXIOM-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*DIAGNOSE-ASSERTION-AXIOM-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*DIAGNOSE-ASSERTION-AXIOM-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), FIVE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-DIAGNOSES-OF-ASSERTION-AXIOM"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("DIAGNOSE-ASSERTION-AXIOM?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-DIAGNOSES-OF-ASSERTION-AXIOM?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-DIAGNOSES-OF-ASSERTION-AXIOM?"), makeKeyword("KBI-DOC"), makeString("diagnose all clause-strucs indexed by ASSERTION") });

    static private final SubLString $str_alt303$__via_module__a_______ = makeString("~%via module ~a : ~%  ");

    private static final SubLSymbol $AXIOM_ASSERTIONS_DIAGNOSES = makeKeyword("AXIOM-ASSERTIONS-DIAGNOSES");

    public static final SubLSymbol $diagnose_assertion_arguments_results$ = makeSymbol("*DIAGNOSE-ASSERTION-ARGUMENTS-RESULTS*");

    static private final SubLString $str_alt306$violators_of_kbi_module__DIAGNOSE = makeString("violators of kbi module :DIAGNOSE-ASSERTION-ARGUMENTS");

    public static final SubLSymbol $diagnose_assertion_arguments_time$ = makeSymbol("*DIAGNOSE-ASSERTION-ARGUMENTS-TIME*");

    static private final SubLString $str_alt308$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :DIAGNOSE-ASSERTION-ARGUMENTS");

    public static final SubLSymbol $diagnose_assertion_arguments_count$ = makeSymbol("*DIAGNOSE-ASSERTION-ARGUMENTS-COUNT*");

    static private final SubLString $str_alt310$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :DIAGNOSE-ASSERTION-ARGUMENTS");

    private static final SubLSymbol $DIAGNOSE_ASSERTION_ARGUMENTS = makeKeyword("DIAGNOSE-ASSERTION-ARGUMENTS");

    static private final SubLList $list_alt312 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*DIAGNOSE-ASSERTION-ARGUMENTS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*DIAGNOSE-ASSERTION-ARGUMENTS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*DIAGNOSE-ASSERTION-ARGUMENTS-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("ASSERTION"), makeKeyword("KBI-LEVEL"), FIVE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-DIAGNOSES-OF-ASSERTION-ARGUMENTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("DIAGNOSE-ASSERTION-ARGUMENTS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-DIAGNOSES-OF-ASSERTION-ARGUMENTS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-DIAGNOSES-OF-ASSERTION-ARGUMENTS?"), makeKeyword("KBI-DOC"), makeString("diagnose all arguments indexed by assertion") });

    static private final SubLList $list_alt313 = list(makeSymbol("DIAGNOSIS"), makeSymbol("ARGUMENT"));

    static private final SubLString $str_alt314$___s____has_diagnosis__s = makeString("~%~s~%  has diagnosis ~s");

    static private final SubLString $str_alt315$mapping_Cyc_assertions_for_unedit = makeString("mapping Cyc assertions for uneditables");

    // // Initializers
    public void declareFunctions() {
        declare_kbi_assertion_file();
    }

    public void initializeVariables() {
        init_kbi_assertion_file();
    }

    public void runTopLevelForms() {
        setup_kbi_assertion_file();
    }
}

