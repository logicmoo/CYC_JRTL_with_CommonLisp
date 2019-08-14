/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$nat_matching_predicate$;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.function_terms.nat_formula_p;
import static com.cyc.cycjava.cycl.function_terms.term_of_unit_assertion;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NARTS-LOW
 * source file: /cyc/top/cycl/narts-low.lisp
 * created:     2019/07/03 17:37:20
 */
public final class narts_low extends SubLTranslatedFile implements V12 {
    public static final SubLObject arete_note_nart_touched(SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != arete.$arete_log_kb_touchesP$.getDynamicValue(thread)) {
                dictionary_utilities.dictionary_increment($arete_narts_touched$.getGlobalValue(), nart, UNPROVIDED);
            }
            return NIL;
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $arete_narts_touched$ = makeSymbol("*ARETE-NARTS-TOUCHED*");

    public static final SubLFile me = new narts_low();

 public static final String myName = "com.cyc.cycjava.cycl.narts_low";


    private static final SubLList $list0 = list(makeKeyword("NART-ARG"), makeKeyword("FUNCTION-EXTENT"));

    private static final SubLSymbol NAT_FORMULA_P = makeSymbol("NAT-FORMULA-P");



    private static final SubLString $str11$Initializing_NART_HL_formula_tabl = makeString("Initializing NART HL formula table");

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list14 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLString $str17$_A = makeString("~A");

    public static final SubLObject register_nart_hl_formula_for_kb_load_alt(SubLObject id, SubLObject nart_hl_formula) {
        return nart_hl_formula_manager.register_nart_hl_formula(id, nart_hl_formula);
    }

    public static SubLObject register_nart_hl_formula_for_kb_load(final SubLObject id, final SubLObject nart_hl_formula) {
        return nart_hl_formula_manager.register_nart_hl_formula(id, nart_hl_formula);
    }

    public static final SubLObject nart_hl_formula_internal_alt(SubLObject nart) {
        return nart_hl_formula_manager.lookup_nart_hl_formula(nart_handles.nart_id(nart));
    }

    public static SubLObject nart_hl_formula_internal(final SubLObject nart) {
        return nart_hl_formula_manager.lookup_nart_hl_formula(nart_handles.nart_id(nart));
    }

    /**
     * Return the NART implementing NART-HL-FORMULA, or NIL if none is present.
     * No substitutions for sub-NARTs are performed.
     */
    @LispMethod(comment = "Return the NART implementing NART-HL-FORMULA, or NIL if none is present.\r\nNo substitutions for sub-NARTs are performed.\nReturn the NART implementing NART-HL-FORMULA, or NIL if none is present.\nNo substitutions for sub-NARTs are performed.")
    public static final SubLObject lookup_nart_internal_alt(SubLObject nart_hl_formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != possibly_naut_p(nart_hl_formula)) {
                {
                    SubLObject ans = NIL;
                    SubLObject l_index = kb_indexing.best_nat_lookup_index(nart_hl_formula, NIL);
                    SubLObject method = kb_mapping_macros.do_nli_extract_method(l_index);
                    SubLObject pcase_var = method;
                    if (pcase_var.eql($NART_ARG)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_term = kb_mapping_macros.do_nli_vna_extract_keys(l_index);
                            SubLObject argnum = thread.secondMultipleValue();
                            SubLObject functor = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != argnum) {
                                if (NIL != functor) {
                                    if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, functor)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, functor);
                                            SubLObject done_var = ans;
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
                                                                    SubLObject done_var_1 = ans;
                                                                    SubLObject token_var_2 = NIL;
                                                                    while (NIL == done_var_1) {
                                                                        {
                                                                            SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                            SubLObject valid_3 = makeBoolean(token_var_2 != tou_assertion);
                                                                            if (NIL != valid_3) {
                                                                                if (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED)) {
                                                                                    {
                                                                                        SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                                                        if (NIL != possibly_naut_p(naut)) {
                                                                                            if (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                                                                ans = assertions_high.gaf_arg1(tou_assertion);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_1 = makeBoolean((NIL == valid_3) || (NIL != ans));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != ans));
                                                }
                                            } 
                                        }
                                    }
                                } else {
                                    if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, NIL);
                                            SubLObject done_var = ans;
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
                                                                    SubLObject done_var_4 = ans;
                                                                    SubLObject token_var_5 = NIL;
                                                                    while (NIL == done_var_4) {
                                                                        {
                                                                            SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                            SubLObject valid_6 = makeBoolean(token_var_5 != tou_assertion);
                                                                            if (NIL != valid_6) {
                                                                                if (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED)) {
                                                                                    {
                                                                                        SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                                                        if (NIL != possibly_naut_p(naut)) {
                                                                                            if (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                                                                ans = assertions_high.gaf_arg1(tou_assertion);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_4 = makeBoolean((NIL == valid_6) || (NIL != ans));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != ans));
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (NIL != functor) {
                                    if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, functor)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, functor);
                                            SubLObject done_var = ans;
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
                                                                    SubLObject done_var_7 = ans;
                                                                    SubLObject token_var_8 = NIL;
                                                                    while (NIL == done_var_7) {
                                                                        {
                                                                            SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                            SubLObject valid_9 = makeBoolean(token_var_8 != tou_assertion);
                                                                            if (NIL != valid_9) {
                                                                                if (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED)) {
                                                                                    {
                                                                                        SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                                                        if (NIL != possibly_naut_p(naut)) {
                                                                                            if (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                                                                ans = assertions_high.gaf_arg1(tou_assertion);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_7 = makeBoolean((NIL == valid_9) || (NIL != ans));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != ans));
                                                }
                                            } 
                                        }
                                    }
                                } else {
                                    if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, NIL);
                                            SubLObject done_var = ans;
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
                                                                    SubLObject done_var_10 = ans;
                                                                    SubLObject token_var_11 = NIL;
                                                                    while (NIL == done_var_10) {
                                                                        {
                                                                            SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                            SubLObject valid_12 = makeBoolean(token_var_11 != tou_assertion);
                                                                            if (NIL != valid_12) {
                                                                                if (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED)) {
                                                                                    {
                                                                                        SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                                                        if (NIL != possibly_naut_p(naut)) {
                                                                                            if (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                                                                ans = assertions_high.gaf_arg1(tou_assertion);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_10 = makeBoolean((NIL == valid_12) || (NIL != ans));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != ans));
                                                }
                                            } 
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($FUNCTION_EXTENT)) {
                            if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(kb_mapping_macros.do_nli_vfe_extract_key(l_index))) {
                                {
                                    SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(kb_mapping_macros.do_nli_vfe_extract_key(l_index));
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        {
                                            SubLObject done_var = ans;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                                    SubLObject valid = makeBoolean(token_var != tou_assertion);
                                                    if (NIL != valid) {
                                                        if (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED)) {
                                                            {
                                                                SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                                if (NIL != possibly_naut_p(naut)) {
                                                                    if (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                                        ans = assertions_high.gaf_arg1(tou_assertion);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != ans));
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($OVERLAP)) {
                                {
                                    SubLObject rest = NIL;
                                    for (rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_nli_vo_extract_key(l_index), UNPROVIDED); !((NIL != ans) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject tou_assertion = rest.first();
                                            if (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED)) {
                                                {
                                                    SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                    if (NIL != possibly_naut_p(naut)) {
                                                        if (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                            ans = assertions_high.gaf_arg1(tou_assertion);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                kb_mapping_macros.do_nli_method_error(l_index, method);
                            }
                        }
                    }
                    return ans;
                }
            }
            return NIL;
        }
    }

    /**
     * Return the NART implementing NART-HL-FORMULA, or NIL if none is present.
     * No substitutions for sub-NARTs are performed.
     */
    @LispMethod(comment = "Return the NART implementing NART-HL-FORMULA, or NIL if none is present.\r\nNo substitutions for sub-NARTs are performed.\nReturn the NART implementing NART-HL-FORMULA, or NIL if none is present.\nNo substitutions for sub-NARTs are performed.")
    public static SubLObject lookup_nart_internal(final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != possibly_naut_p(nart_hl_formula)) {
            final SubLObject v_methods = $list0;
            SubLObject ans = NIL;
            final SubLObject l_index = kb_indexing.best_nat_lookup_index(nart_hl_formula, v_methods);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_nli_extract_method(l_index);
            if (pcase_var.eql($NART_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_nli_vna_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject functor = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != functor) {
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, functor)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, functor);
                            SubLObject done_var = ans;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$1 = ans;
                                        final SubLObject token_var_$2 = NIL;
                                        while (NIL == done_var_$1) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(tou_assertion));
                                            if ((NIL != valid_$3) && (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED))) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if ((NIL != possibly_naut_p(naut)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula))) {
                                                    ans = assertions_high.gaf_arg1(tou_assertion);
                                                }
                                            }
                                            done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != ans));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != ans));
                            } 
                        }
                    } else
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, NIL)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, NIL);
                            SubLObject done_var = ans;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$2 = ans;
                                        final SubLObject token_var_$3 = NIL;
                                        while (NIL == done_var_$2) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(tou_assertion));
                                            if ((NIL != valid_$4) && (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED))) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if ((NIL != possibly_naut_p(naut)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula))) {
                                                    ans = assertions_high.gaf_arg1(tou_assertion);
                                                }
                                            }
                                            done_var_$2 = makeBoolean((NIL == valid_$4) || (NIL != ans));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != ans));
                            } 
                        }

                } else
                    if (NIL != functor) {
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, functor)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, functor);
                            SubLObject done_var = ans;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$3 = ans;
                                        final SubLObject token_var_$4 = NIL;
                                        while (NIL == done_var_$3) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(tou_assertion));
                                            if ((NIL != valid_$5) && (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED))) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if ((NIL != possibly_naut_p(naut)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula))) {
                                                    ans = assertions_high.gaf_arg1(tou_assertion);
                                                }
                                            }
                                            done_var_$3 = makeBoolean((NIL == valid_$5) || (NIL != ans));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != ans));
                            } 
                        }
                    } else
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, NIL)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, NIL);
                            SubLObject done_var = ans;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$4 = ans;
                                        final SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(tou_assertion));
                                            if ((NIL != valid_$6) && (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED))) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if ((NIL != possibly_naut_p(naut)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula))) {
                                                    ans = assertions_high.gaf_arg1(tou_assertion);
                                                }
                                            }
                                            done_var_$4 = makeBoolean((NIL == valid_$6) || (NIL != ans));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != ans));
                            } 
                        }


            } else
                if (pcase_var.eql($FUNCTION_EXTENT)) {
                    if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(kb_mapping_macros.do_nli_vfe_extract_key(l_index))) {
                        final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(kb_mapping_macros.do_nli_vfe_extract_key(l_index));
                        SubLObject final_index_iterator2 = NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                            SubLObject done_var2 = ans;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject tou_assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(tou_assertion2));
                                if ((NIL != valid2) && (NIL != assertion_handles.valid_assertionP(tou_assertion2, UNPROVIDED))) {
                                    final SubLObject naut2 = assertions_high.gaf_arg2(tou_assertion2);
                                    if ((NIL != possibly_naut_p(naut2)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut2, nart_hl_formula))) {
                                        ans = assertions_high.gaf_arg1(tou_assertion2);
                                    }
                                }
                                done_var2 = makeBoolean((NIL == valid2) || (NIL != ans));
                            } 
                        } finally {
                            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                if (NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject rest;
                        SubLObject tou_assertion3;
                        SubLObject naut3;
                        for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_nli_vo_extract_key(l_index), UNPROVIDED); (NIL == ans) && (NIL != rest); rest = rest.rest()) {
                            tou_assertion3 = rest.first();
                            if (NIL != assertion_handles.valid_assertionP(tou_assertion3, UNPROVIDED)) {
                                naut3 = assertions_high.gaf_arg2(tou_assertion3);
                                if ((NIL != possibly_naut_p(naut3)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut3, nart_hl_formula))) {
                                    ans = assertions_high.gaf_arg1(tou_assertion3);
                                }
                            }
                        }
                    } else {
                        kb_mapping_macros.do_nli_method_error(l_index, method);
                    }


            return ans;
        }
        return NIL;
    }

    /**
     * Return the indexing structure for NART.
     */
    @LispMethod(comment = "Return the indexing structure for NART.")
    public static final SubLObject nart_index_alt(SubLObject nart) {
        SubLTrampolineFile.checkType(nart, NART_P);
        return nart_index_manager.lookup_nart_index(nart_handles.nart_id(nart));
    }

    @LispMethod(comment = "Return the indexing structure for NART.")
    public static SubLObject nart_index(final SubLObject nart) {
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        return nart_index_manager.lookup_nart_index(nart_handles.nart_id(nart));
    }/**
     * Return the indexing structure for NART.
     */


    public static SubLObject nart_index_swapped_inP(final SubLObject nart) {
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        arete.arete_note_nart_touched(nart);
        return nart_index_manager.nart_index_cachedP(nart_handles.nart_id(nart));
    }

    public static final SubLObject kb_create_nart_kb_store_alt(SubLObject nart_hl_formula) {
        {
            SubLObject nart = com.cyc.cycjava.cycl.narts_low.lookup_nart_internal(nart_hl_formula);
            if (NIL != nart) {
                return nart_handles.nart_id(nart);
            } else {
                {
                    SubLObject internal_id = nart_handles.make_nart_id();
                    nart = nart_handles.make_nart_shell(internal_id);
                    com.cyc.cycjava.cycl.narts_low.kb_create_nart_int(nart, internal_id, nart_hl_formula);
                    return internal_id;
                }
            }
        }
    }

    public static SubLObject kb_create_nart_kb_store(final SubLObject nart_hl_formula) {
        SubLObject nart = lookup_nart_internal(nart_hl_formula);
        if (NIL != nart) {
            return nart_handles.nart_id(nart);
        }
        final SubLObject internal_id = nart_handles.make_nart_id();
        nart = nart_handles.make_nart_shell(internal_id);
        kb_create_nart_int(nart, internal_id, nart_hl_formula);
        return internal_id;
    }

    public static final SubLObject kb_create_nart_int_alt(SubLObject nart, SubLObject internal_id, SubLObject nart_hl_formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            nart_hl_formula_manager.register_nart_hl_formula(internal_id, nart_hl_formula);
            {
                SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
                try {
                    hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(NIL, thread);
                    com.cyc.cycjava.cycl.narts_low.add_nart_indices(nart, nart_hl_formula);
                } finally {
                    hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject kb_create_nart_int(final SubLObject nart, final SubLObject internal_id, final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        nart_hl_formula_manager.register_nart_hl_formula(internal_id, nart_hl_formula);
        final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
        try {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(NIL, thread);
            add_nart_indices(nart, nart_hl_formula);
        } finally {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject kb_create_nart_cyc_alt(SubLObject internal_id) {
        return nart_handles.make_nart_shell(internal_id);
    }

    public static SubLObject kb_create_nart_cyc(final SubLObject internal_id) {
        return nart_handles.make_nart_shell(internal_id);
    }

    public static final SubLObject add_nart_indices_alt(SubLObject nart, SubLObject nart_hl_formula) {
        SubLTrampolineFile.checkType(nart, NART_P);
        SubLTrampolineFile.checkType(nart_hl_formula, NAT_FORMULA_P);
        {
            SubLObject tou_asent = make_binary_formula($$termOfUnit, nart, nart_hl_formula);
            SubLObject tou_cnf = clause_utilities.make_gaf_cnf(tou_asent);
            SubLObject tou_direction = $FORWARD;
            SubLObject tou_assertion = assertions_interface.kb_create_assertion(tou_cnf, mt_vars.$tou_mt$.getGlobalValue());
            assertions_interface.kb_set_assertion_direction(tou_assertion, tou_direction);
        }
        return nart;
    }

    public static SubLObject add_nart_indices(final SubLObject nart, final SubLObject nart_hl_formula) {
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        assert NIL != function_terms.nat_formula_p(nart_hl_formula) : "! function_terms.nat_formula_p(nart_hl_formula) " + ("function_terms.nat_formula_p(nart_hl_formula) " + "CommonSymbols.NIL != function_terms.nat_formula_p(nart_hl_formula) ") + nart_hl_formula;
        final SubLObject tou_asent = make_binary_formula($$termOfUnit, nart, nart_hl_formula);
        final SubLObject tou_cnf = clause_utilities.make_gaf_cnf(tou_asent);
        final SubLObject tou_direction = $FORWARD;
        final SubLObject tou_assertion = assertions_interface.kb_create_assertion(tou_cnf, mt_vars.$tou_mt$.getGlobalValue(), NIL, tou_direction, $TRUE, $MONOTONIC, NIL);
        return nart;
    }

    /**
     *
     *
     * @return boolean; t iff successful.
     */
    @LispMethod(comment = "@return boolean; t iff successful.")
    public static final SubLObject reinstall_nart_hl_formula_alt(SubLObject nart, SubLObject new_nart_hl_formula) {
        SubLTrampolineFile.checkType(nart, NART_P);
        SubLTrampolineFile.checkType(new_nart_hl_formula, NAT_FORMULA_P);
        {
            SubLObject tou_ass = term_of_unit_assertion(nart);
            SubLObject new_tou_cnf = clause_utilities.make_gaf_cnf(make_binary_formula($$termOfUnit, nart, new_nart_hl_formula));
            assertions_low.reconnect_assertion(tou_ass, new_tou_cnf);
        }
        return nart;
    }

    /**
     *
     *
     * @return boolean; t iff successful.
     */
    @LispMethod(comment = "@return boolean; t iff successful.")
    public static SubLObject reinstall_nart_hl_formula(final SubLObject nart, final SubLObject new_nart_hl_formula) {
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        assert NIL != function_terms.nat_formula_p(new_nart_hl_formula) : "! function_terms.nat_formula_p(new_nart_hl_formula) " + ("function_terms.nat_formula_p(new_nart_hl_formula) " + "CommonSymbols.NIL != function_terms.nat_formula_p(new_nart_hl_formula) ") + new_nart_hl_formula;
        final SubLObject tou_ass = function_terms.term_of_unit_assertion(nart);
        final SubLObject new_tou_cnf = clause_utilities.make_gaf_cnf(make_binary_formula($$termOfUnit, nart, new_nart_hl_formula));
        assertions_low.reconnect_assertion(tou_ass, new_tou_cnf);
        return nart;
    }

    /**
     * Initialize the id -> nart-hl-formula table, getting the information
     * from the termOfUnit assertions.
     */
    @LispMethod(comment = "Initialize the id -> nart-hl-formula table, getting the information\r\nfrom the termOfUnit assertions.\nInitialize the id -> nart-hl-formula table, getting the information\nfrom the termOfUnit assertions.")
    public static final SubLObject initialize_nart_hl_formulas_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            nart_hl_formula_manager.setup_nart_hl_formula_table(nart_handles.nart_count(), NIL);
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject total = kb_indexing.num_predicate_extent_index($$termOfUnit, mt_vars.$tou_mt$.getGlobalValue());
                SubLObject sofar = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($str_alt9$Initializing_NART_HL_formula_tabl);
                        {
                            SubLObject _prev_bind_0_13 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1_14 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
                                {
                                    SubLObject pred_var = $$termOfUnit;
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                {
                                                                    SubLObject done_var_15 = NIL;
                                                                    SubLObject token_var_16 = NIL;
                                                                    while (NIL == done_var_15) {
                                                                        {
                                                                            SubLObject tou_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_16);
                                                                            SubLObject valid_17 = makeBoolean(token_var_16 != tou_ass);
                                                                            if (NIL != valid_17) {
                                                                                note_percent_progress(sofar, total);
                                                                                sofar = add(sofar, ONE_INTEGER);
                                                                                {
                                                                                    SubLObject message_var = NIL;
                                                                                    try {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_18 = Errors.$error_handler$.currentBinding(thread);
                                                                                            try {
                                                                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                                                try {
                                                                                                    {
                                                                                                        SubLObject nart = assertions_high.gaf_arg1(tou_ass);
                                                                                                        SubLObject nart_hl_formula = assertions_high.gaf_arg2(tou_ass);
                                                                                                        if ((NIL != nart_handles.valid_nartP(nart, UNPROVIDED)) && (NIL != nat_formula_p(nart_hl_formula))) {
                                                                                                            com.cyc.cycjava.cycl.narts_low.reset_nart_hl_formula(nart, nart_hl_formula);
                                                                                                            count = add(count, ONE_INTEGER);
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
                                                                                        message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                                                    }
                                                                                    if (message_var.isString()) {
                                                                                        Errors.warn($str_alt13$_A, message_var);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_15 = makeBoolean(NIL == valid_17);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
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
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_14, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_13, thread);
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(count, nart_handles.nart_count());
            }
        }
    }

    /**
     * Initialize the id -> nart-hl-formula table, getting the information
     * from the termOfUnit assertions.
     */
    @LispMethod(comment = "Initialize the id -> nart-hl-formula table, getting the information\r\nfrom the termOfUnit assertions.\nInitialize the id -> nart-hl-formula table, getting the information\nfrom the termOfUnit assertions.")
    public static SubLObject initialize_nart_hl_formulas_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        nart_hl_formula_manager.setup_nart_hl_formula_table(nart_handles.nart_count(), NIL);
        SubLObject count = ZERO_INTEGER;
        final SubLObject total = kb_indexing.num_predicate_extent_index($$termOfUnit, mt_vars.$tou_mt$.getGlobalValue());
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str11$Initializing_NART_HL_formula_tabl);
                final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$14 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
                    final SubLObject pred_var = $$termOfUnit;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$14 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$15 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$17 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$18 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$19 = NIL;
                                        final SubLObject token_var_$20 = NIL;
                                        while (NIL == done_var_$19) {
                                            final SubLObject tou_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                            final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(tou_ass));
                                            if (NIL != valid_$21) {
                                                note_percent_progress(sofar, total);
                                                sofar = add(sofar, ONE_INTEGER);
                                                SubLObject message_var = NIL;
                                                final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
                                                eval($list14);
                                                try {
                                                    try {
                                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                        final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                            try {
                                                                final SubLObject nart = assertions_high.gaf_arg1(tou_ass);
                                                                final SubLObject nart_hl_formula = assertions_high.gaf_arg2(tou_ass);
                                                                if ((NIL != nart_handles.valid_nartP(nart, UNPROVIDED)) && (NIL != function_terms.nat_formula_p(nart_hl_formula))) {
                                                                    reset_nart_hl_formula(nart, nart_hl_formula);
                                                                    count = add(count, ONE_INTEGER);
                                                                }
                                                            } catch (final Throwable catch_var) {
                                                                Errors.handleThrowable(catch_var, NIL);
                                                            }
                                                        } finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                    } catch (final Throwable ccatch_env_var) {
                                                        message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                    } finally {
                                                        thread.throwStack.pop();
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                                    }
                                                }
                                                if (message_var.isString()) {
                                                    Errors.warn($str17$_A, message_var);
                                                }
                                            }
                                            done_var_$19 = makeBoolean(NIL == valid_$21);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_3_$18, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$17, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$15, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$14, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$13, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return values(count, nart_handles.nart_count());
    }

    /**
     * Primitively change the HL formula of NART to NEW-HL-FORMULA.
     */
    @LispMethod(comment = "Primitively change the HL formula of NART to NEW-HL-FORMULA.")
    public static final SubLObject reset_nart_hl_formula_alt(SubLObject nart, SubLObject new_hl_formula) {
        nart_hl_formula_manager.register_nart_hl_formula(nart_handles.nart_id(nart), new_hl_formula);
        return nart;
    }

    @LispMethod(comment = "Primitively change the HL formula of NART to NEW-HL-FORMULA.")
    public static SubLObject reset_nart_hl_formula(final SubLObject nart, final SubLObject new_hl_formula) {
        nart_hl_formula_manager.register_nart_hl_formula(nart_handles.nart_id(nart), new_hl_formula);
        return nart;
    }/**
     * Primitively change the HL formula of NART to NEW-HL-FORMULA.
     */


    /**
     * Primitively change the assertion index for NART to NEW-INDEX.
     */
    @LispMethod(comment = "Primitively change the assertion index for NART to NEW-INDEX.")
    public static final SubLObject reset_nart_index_alt(SubLObject nart, SubLObject new_index) {
        SubLTrampolineFile.checkType(nart, NART_P);
        nart_index_manager.register_nart_index(nart_handles.nart_id(nart), new_index);
        return nart;
    }

    @LispMethod(comment = "Primitively change the assertion index for NART to NEW-INDEX.")
    public static SubLObject reset_nart_index(final SubLObject nart, final SubLObject new_index) {
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        nart_index_manager.register_nart_index(nart_handles.nart_id(nart), new_index);
        return nart;
    }/**
     * Primitively change the assertion index for NART to NEW-INDEX.
     */


    public static final SubLObject kb_remove_nart_internal_alt(SubLObject nart) {
        {
            SubLObject tou_ass = term_of_unit_assertion(nart);
            if (NIL != assertion_handles.valid_assertionP(tou_ass, UNPROVIDED)) {
                assertions_low.kb_remove_assertion_internal(tou_ass);
            }
        }
        {
            SubLObject id = nart_handles.nart_id(nart);
            if (id.isInteger()) {
                nart_index_manager.deregister_nart_index(id);
                nart_hl_formula_manager.deregister_nart_hl_formula(id);
                nart_handles.deregister_nart_id(id);
            }
        }
        nart_handles.free_nart(nart);
        return NIL;
    }

    public static SubLObject kb_remove_nart_internal(final SubLObject nart) {
        SubLObject cdolist_list_var = function_terms.term_of_unit_assertions(nart);
        SubLObject tou_ass = NIL;
        tou_ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.valid_assertionP(tou_ass, UNPROVIDED)) {
                assertions_low.kb_remove_assertion_internal(tou_ass);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tou_ass = cdolist_list_var.first();
        } 
        final SubLObject id = nart_handles.nart_id(nart);
        if (id.isInteger()) {
            nart_index_manager.deregister_nart_index(id);
            nart_hl_formula_manager.deregister_nart_hl_formula(id);
            nart_handles.deregister_nart_id(id);
        }
        nart_handles.free_nart(nart);
        return NIL;
    }

    public static final SubLObject declare_narts_low_file_alt() {
        declareFunction("arete_note_nart_touched", "ARETE-NOTE-NART-TOUCHED", 1, 0, false);
        declareFunction("register_nart_hl_formula_for_kb_load", "REGISTER-NART-HL-FORMULA-FOR-KB-LOAD", 2, 0, false);
        declareFunction("nart_hl_formula_internal", "NART-HL-FORMULA-INTERNAL", 1, 0, false);
        declareFunction("lookup_nart_internal", "LOOKUP-NART-INTERNAL", 1, 0, false);
        declareFunction("nart_index", "NART-INDEX", 1, 0, false);
        declareFunction("kb_create_nart_kb_store", "KB-CREATE-NART-KB-STORE", 1, 0, false);
        declareFunction("kb_create_nart_int", "KB-CREATE-NART-INT", 3, 0, false);
        declareFunction("kb_create_nart_cyc", "KB-CREATE-NART-CYC", 1, 0, false);
        declareFunction("add_nart_indices", "ADD-NART-INDICES", 2, 0, false);
        declareFunction("reinstall_nart_hl_formula", "REINSTALL-NART-HL-FORMULA", 2, 0, false);
        declareFunction("initialize_nart_hl_formulas_internal", "INITIALIZE-NART-HL-FORMULAS-INTERNAL", 0, 0, false);
        declareFunction("reset_nart_hl_formula", "RESET-NART-HL-FORMULA", 2, 0, false);
        declareFunction("reset_nart_index", "RESET-NART-INDEX", 2, 0, false);
        declareFunction("kb_remove_nart_internal", "KB-REMOVE-NART-INTERNAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_narts_low_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("register_nart_hl_formula_for_kb_load", "REGISTER-NART-HL-FORMULA-FOR-KB-LOAD", 2, 0, false);
            declareFunction("nart_hl_formula_internal", "NART-HL-FORMULA-INTERNAL", 1, 0, false);
            declareFunction("lookup_nart_internal", "LOOKUP-NART-INTERNAL", 1, 0, false);
            declareFunction("nart_index", "NART-INDEX", 1, 0, false);
            declareFunction("nart_index_swapped_inP", "NART-INDEX-SWAPPED-IN?", 1, 0, false);
            declareFunction("kb_create_nart_kb_store", "KB-CREATE-NART-KB-STORE", 1, 0, false);
            declareFunction("kb_create_nart_int", "KB-CREATE-NART-INT", 3, 0, false);
            declareFunction("kb_create_nart_cyc", "KB-CREATE-NART-CYC", 1, 0, false);
            declareFunction("add_nart_indices", "ADD-NART-INDICES", 2, 0, false);
            declareFunction("reinstall_nart_hl_formula", "REINSTALL-NART-HL-FORMULA", 2, 0, false);
            declareFunction("initialize_nart_hl_formulas_internal", "INITIALIZE-NART-HL-FORMULAS-INTERNAL", 0, 0, false);
            declareFunction("reset_nart_hl_formula", "RESET-NART-HL-FORMULA", 2, 0, false);
            declareFunction("reset_nart_index", "RESET-NART-INDEX", 2, 0, false);
            declareFunction("kb_remove_nart_internal", "KB-REMOVE-NART-INTERNAL", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("arete_note_nart_touched", "ARETE-NOTE-NART-TOUCHED", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_narts_low_file_Previous() {
        declareFunction("register_nart_hl_formula_for_kb_load", "REGISTER-NART-HL-FORMULA-FOR-KB-LOAD", 2, 0, false);
        declareFunction("nart_hl_formula_internal", "NART-HL-FORMULA-INTERNAL", 1, 0, false);
        declareFunction("lookup_nart_internal", "LOOKUP-NART-INTERNAL", 1, 0, false);
        declareFunction("nart_index", "NART-INDEX", 1, 0, false);
        declareFunction("nart_index_swapped_inP", "NART-INDEX-SWAPPED-IN?", 1, 0, false);
        declareFunction("kb_create_nart_kb_store", "KB-CREATE-NART-KB-STORE", 1, 0, false);
        declareFunction("kb_create_nart_int", "KB-CREATE-NART-INT", 3, 0, false);
        declareFunction("kb_create_nart_cyc", "KB-CREATE-NART-CYC", 1, 0, false);
        declareFunction("add_nart_indices", "ADD-NART-INDICES", 2, 0, false);
        declareFunction("reinstall_nart_hl_formula", "REINSTALL-NART-HL-FORMULA", 2, 0, false);
        declareFunction("initialize_nart_hl_formulas_internal", "INITIALIZE-NART-HL-FORMULAS-INTERNAL", 0, 0, false);
        declareFunction("reset_nart_hl_formula", "RESET-NART-HL-FORMULA", 2, 0, false);
        declareFunction("reset_nart_index", "RESET-NART-INDEX", 2, 0, false);
        declareFunction("kb_remove_nart_internal", "KB-REMOVE-NART-INTERNAL", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_narts_low_file_alt() {
        deflexical("*ARETE-NARTS-TOUCHED*", NIL != boundp($arete_narts_touched$) ? ((SubLObject) ($arete_narts_touched$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_narts_low_file() {
        if (SubLFiles.USE_V1) {
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ARETE-NARTS-TOUCHED*", NIL != boundp($arete_narts_touched$) ? ((SubLObject) ($arete_narts_touched$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_narts_low_file_Previous() {
        return NIL;
    }

    public static final SubLObject setup_narts_low_file_alt() {
        declare_defglobal($arete_narts_touched$);
        return NIL;
    }

    public static SubLObject setup_narts_low_file() {
        if (SubLFiles.USE_V1) {
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($arete_narts_touched$);
        }
        return NIL;
    }

    public static SubLObject setup_narts_low_file_Previous() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_narts_low_file();
    }

    @Override
    public void initializeVariables() {
        init_narts_low_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_narts_low_file();
    }

    static {
    }

    static private final SubLString $str_alt9$Initializing_NART_HL_formula_tabl = makeString("Initializing NART HL formula table");

    static private final SubLString $str_alt13$_A = makeString("~A");
}

/**
 * Total time: 427 ms
 */
