/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.forward_propagate_assertions;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SG-UTILITIES
 *  source file: /cyc/top/cycl/sg-utilities.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class sg_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private sg_utilities() {
    }

    public static final SubLFile me = new sg_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sg_utilities";

    // // Definitions
    // deflexical
    public static final SubLSymbol $sg_module_mt$ = makeSymbol("*SG-MODULE-MT*");

    // deflexical
    public static final SubLSymbol $sg_root_mt$ = makeSymbol("*SG-ROOT-MT*");

    /**
     * SG version of *browse-forward-inferences?* that sets that param where applicable.
     */
    // defparameter
    public static final SubLSymbol $sg_browse_forward_inferencesP$ = makeSymbol("*SG-BROWSE-FORWARD-INFERENCES?*");

    /**
     * Set to NIL to avoid the SG harness outputing any of its trace information.
     */
    // defparameter
    public static final SubLSymbol $sg_trace$ = makeSymbol("*SG-TRACE*");

    public static final SubLObject sg_trace_int(SubLObject level, SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (($sg_trace$.getDynamicValue(thread) == T) || ($sg_trace$.getDynamicValue(thread).isInteger() && level.numLE($sg_trace$.getDynamicValue(thread)))) {
                format(T, $str_alt2$___A___A, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), v_object);
                force_output(T);
                return NIL;
            }
            return NIL;
        }
    }

    public static final SubLObject sg_trace(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            level = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            string = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(SG_TRACE_INT, level, listS(FORMAT, NIL, string, append(args, NIL)));
            }
        }
    }

    public static final SubLObject with_no_sg_tracing(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt7, append(body, NIL));
        }
    }

    public static final SubLObject sg_relevant_scenario_context(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != sg_scenario_context_p(mt)) && (NIL != mt_relevance_cache.basemtP(mt_relevance_macros.$mt$.getDynamicValue(thread), mt)));
        }
    }

    public static final SubLObject with_just_sg_mts(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_MT_FUNCTION, $list_alt10, listS(IN_MT, mt, append(body, NIL)));
            }
        }
    }

    public static final SubLObject sg_util_cyc_query(SubLObject formula, SubLObject mt, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sg_trace_int(TWO_INTEGER, format(NIL, $str_alt12$SG_UTIL_CYC_QUERY));
            sg_trace_int(TWO_INTEGER, format(NIL, $str_alt13$__Formula___a__Mt___a, formula, mt));
            thread.resetMultipleValues();
            {
                SubLObject results = inference_kernel.new_cyc_query(formula, mt, v_properties);
                SubLObject reason = thread.secondMultipleValue();
                SubLObject inference = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != results) {
                    sg_trace_int(TWO_INTEGER, format(NIL, $str_alt14$__Results___a, results));
                } else {
                    sg_trace_int(TWO_INTEGER, format(NIL, $str_alt15$__Results__None));
                }
                return values(results, reason, inference);
            }
        }
    }

    public static final SubLObject sg_util_continue_inference(SubLObject inference, SubLObject v_properties) {
        sg_trace_int(FIVE_INTEGER, format(NIL, $str_alt16$SG_UTIL_CONTINUE_INFERENCE___S, inference));
        return inference_kernel.continue_inference(inference, v_properties);
    }

    public static final SubLObject sg_ab_hypothesize_formula(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sg_trace_int(TWO_INTEGER, format(NIL, $str_alt17$SG_AB_HYPOTHESIZE_FORMULA____Form, formula, mt));
            if ((NIL != el_utilities.el_conjunction_p(formula)) || (NIL != el_grammar.el_atomic_sentence_p(formula))) {
                {
                    SubLObject free_vars = el_utilities.sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject post_formula = NIL;
                    SubLObject cdolist_list_var = free_vars;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        post_formula = list(list($$ephemeralTerm, var), listS($$isa, var, $list_alt20));
                    }
                    post_formula = cons($$and, post_formula);
                    thread.resetMultipleValues();
                    {
                        SubLObject var_term_bindings = prove.fi_hypothesize_int(formula, mt, UNPROVIDED, UNPROVIDED);
                        SubLObject failure_reasons = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != var_term_bindings) {
                            if (!$list_alt22.equal(var_term_bindings)) {
                                post_formula = sublis(var_term_bindings, post_formula, UNPROVIDED, UNPROVIDED);
                                sg_ab_assert_formula(post_formula, mt);
                            }
                        } else {
                            sg_trace_int(TWO_INTEGER, format(NIL, $str_alt23$__Hypothesizing_Failed__Reason___, failure_reasons));
                        }
                        return var_term_bindings;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_ab_assert_formula(SubLObject formula, SubLObject mt) {
        sg_trace_int(ONE_INTEGER, format(NIL, $str_alt24$SG_AB_ASSERT_FORMULA____Formula__, formula, mt));
        {
            SubLObject result = cyc_kernel.cyc_assert(formula, mt, $list_alt25);
            if (NIL != result) {
                sg_util_add_assertion_log_entry(formula, mt);
            }
            return NIL;
        }
    }

    /**
     * Adds a DEDUCTION-P for FORMULA with SUPPORTS in MT. This should be
     * changed to something like ABDUCTION-P once such a thing becomes available.
     */
    public static final SubLObject sg_util_add_abduction_arguments(SubLObject formula, SubLObject supports, SubLObject mt) {
        {
            SubLObject result = NIL;
            sg_trace_int(TWO_INTEGER, format(NIL, $str_alt26$__SG_UTIL_ADD_ABDUCTION_ARGUMENTS, new SubLObject[]{ formula, length(supports), mt }));
            if (NIL == cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(formula, mt, UNPROVIDED))) {
                result = cyc_kernel.cyc_add_argument(formula, supports, mt, $list_alt25, UNPROVIDED);
            }
            if (NIL != result) {
                sg_trace_int(TWO_INTEGER, format(NIL, $str_alt27$__SG_UTIL_ADD_ABDUCTION_ARGUMENTS));
            } else {
                sg_trace_int(TWO_INTEGER, format(NIL, $str_alt28$__SG_UTIL_ADD_ABDUCTION_ARGUMENTS));
            }
            return result;
        }
    }

    public static final SubLObject sg_util_add_deduction_arguments(SubLObject formula, SubLObject supports, SubLObject mt) {
        {
            SubLObject result = NIL;
            sg_trace_int(TWO_INTEGER, format(NIL, $str_alt29$__SG_UTIL_ADD_DEDUCTION_ARGUMENTS, new SubLObject[]{ formula, length(supports), mt }));
            result = cyc_kernel.cyc_add_argument(formula, supports, mt, UNPROVIDED, UNPROVIDED);
            if (NIL != result) {
                sg_trace_int(TWO_INTEGER, format(NIL, $str_alt30$__SG_UTIL_ADD_DEDUCTION_ARGUMENTS));
            } else {
                sg_trace_int(TWO_INTEGER, format(NIL, $str_alt31$__SG_UTIL_ADD_DEDUCTION_ARGUMENTS));
            }
            return result;
        }
    }

    public static final SubLObject sg_util_forward_propagate_assertions(SubLObject assertions, SubLObject mt, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sg_trace_int(TWO_INTEGER, format(NIL, $str_alt32$__SG_UTIL_FORWARD_PROPAGATE_ASSER, assertions, mt));
            {
                SubLObject old_dependents = NIL;
                SubLObject work_doneP = NIL;
                SubLObject number = NIL;
                SubLObject time = NIL;
                SubLObject depth = NIL;
                SubLObject remainder = NIL;
                for (remainder = v_properties; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        if (property == $MAX_TIME) {
                            if (value.isInteger()) {
                                time = value;
                            }
                        } else
                            if (property == $MAX_NUMBER) {
                                number = value;
                            }

                    }
                }
                {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_1 = assertions_high.assertion_dependents(assertion);
                            SubLObject dependent = NIL;
                            for (dependent = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , dependent = cdolist_list_var_1.first()) {
                                {
                                    SubLObject item_var = dependent;
                                    if (NIL == member(item_var, old_dependents, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        old_dependents = cons(item_var, old_dependents);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject sits = sg_util_situations_of_scenario(mt);
                    {
                        SubLObject _prev_bind_0 = control_vars.$browse_forward_inferencesP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = control_vars.$allow_forward_skolemization$.currentBinding(thread);
                        SubLObject _prev_bind_2 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
                        try {
                            control_vars.$browse_forward_inferencesP$.bind($sg_browse_forward_inferencesP$.getDynamicValue(thread), thread);
                            control_vars.$allow_forward_skolemization$.bind(T, thread);
                            control_vars.$prefer_forward_skolemization$.bind(T, thread);
                            sg_trace_int(FOUR_INTEGER, format(NIL, $str_alt35$_forward_propagating_in_mt__A_aga, mt, assertions));
                            {
                                SubLObject cdolist_list_var = sits;
                                SubLObject sit = NIL;
                                for (sit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sit = cdolist_list_var.first()) {
                                    {
                                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                        {
                                            SubLObject _prev_bind_0_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2_4 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                {
                                                    SubLObject pred_var = NIL;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sit, NIL, pred_var)) {
                                                        {
                                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sit, NIL, pred_var);
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
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                {
                                                                                    SubLObject done_var_5 = NIL;
                                                                                    SubLObject token_var_6 = NIL;
                                                                                    while (NIL == done_var_5) {
                                                                                        {
                                                                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                                            SubLObject valid_7 = makeBoolean(token_var_6 != gaf);
                                                                                            if (NIL != valid_7) {
                                                                                                forward_propagate_assertions.forward_propagate_assertion_against_rules_in_mt(gaf, assertions, mt, number, time, depth);
                                                                                            }
                                                                                            done_var_5 = makeBoolean(NIL == valid_7);
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if (NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
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
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_4, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_3, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_2, thread);
                            control_vars.$allow_forward_skolemization$.rebind(_prev_bind_1, thread);
                            control_vars.$browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject new_dependents = NIL;
                    SubLObject cdolist_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_9 = assertions_high.assertion_dependents(assertion);
                            SubLObject dependent = NIL;
                            for (dependent = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , dependent = cdolist_list_var_9.first()) {
                                {
                                    SubLObject item_var = dependent;
                                    if (NIL == member(item_var, new_dependents, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        new_dependents = cons(item_var, new_dependents);
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != list_utilities.sets_equalP(old_dependents, new_dependents, UNPROVIDED)) {
                        work_doneP = NIL;
                    } else {
                        work_doneP = T;
                    }
                }
                return work_doneP;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $sg_util_new_scenario_context_formula$ = makeSymbol("*SG-UTIL-NEW-SCENARIO-CONTEXT-FORMULA*");

    public static final SubLObject sg_util_new_scenario_mt(SubLObject mt) {
        {
            SubLObject formula = subst(mt, $MT, $sg_util_new_scenario_context_formula$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            SubLObject results = prove.fi_hypothesize_int(formula, mt_vars.$mt_mt$.getGlobalValue(), $$$HYP, UNPROVIDED);
            if (NIL != results) {
                {
                    SubLObject new_mt = sublis(results, $sym40$_SPEC_MT, UNPROVIDED, UNPROVIDED);
                    sg_trace_int(ONE_INTEGER, format(NIL, $str_alt41$Making_new_context__a_from__a, new_mt, mt));
                    return new_mt;
                }
            } else {
                Errors.cerror($str_alt42$Continue_anyway_, $str_alt43$Failed_to_creat_new_scenario_in__, mt);
            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $sg_util_new_scenario_context_lits$ = makeSymbol("*SG-UTIL-NEW-SCENARIO-CONTEXT-LITS*");

    // deflexical
    private static final SubLSymbol $sg_util_new_scenario_context_extra_assertions$ = makeSymbol("*SG-UTIL-NEW-SCENARIO-CONTEXT-EXTRA-ASSERTIONS*");

    public static final SubLObject sg_util_new_scenario_context(SubLObject mts, SubLObject sink) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mts) {
                return NIL;
            }
            {
                SubLObject mt = mts.first();
                SubLObject new_mt = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject results = prove.fi_hypothesize_int(list($$and, $list_alt46, list($$genlMt, $sym40$_SPEC_MT, mt)), mt_vars.$mt_mt$.getGlobalValue(), $$$HYP, UNPROVIDED);
                    SubLObject reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != results) {
                        new_mt = sublis(results, $sym40$_SPEC_MT, UNPROVIDED, UNPROVIDED);
                        sg_trace_int(ONE_INTEGER, format(NIL, $str_alt41$Making_new_context__a_from__a, new_mt, mts));
                        {
                            SubLObject cdolist_list_var = mts.rest();
                            SubLObject genl_mt = NIL;
                            for (genl_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_mt = cdolist_list_var.first()) {
                                cyc_kernel.cyc_assert(list($$and, list($$genlMt, new_mt, genl_mt), list($$termDependsOn, new_mt, genl_mt)), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED);
                            }
                        }
                        if (NIL == cyc_kernel.cyc_assert(list($$and, list($$scenarioCollectorMt, sink, new_mt), list($$highlyRelevantMt, new_mt), list($$ephemeralTerm, new_mt)), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED)) {
                            Errors.cerror($str_alt42$Continue_anyway_, $str_alt51$Failed_to_assert___scenarioCollec, new_mt, sink);
                        }
                    } else {
                        Errors.cerror($str_alt42$Continue_anyway_, $str_alt52$Failed_to_create_new_scenario_in_, mts, reason);
                    }
                }
                return new_mt;
            }
        }
    }

    public static final SubLObject sg_util_collector_mt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject collector_mt = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_vars.$mt_mt$.getGlobalValue(), thread);
                        collector_mt = kb_mapping_utilities.fpred_value(mt, $$scenarioCollectorMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == collector_mt) {
                    return mt;
                }
                return collector_mt;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $sg_collector_mt_formula$ = makeSymbol("*SG-COLLECTOR-MT-FORMULA*");

    /**
     * Creates a new collector mt for SEED-MT. Collector mts see all the
     * generated contexts of the seed scenario.
     */
    public static final SubLObject sg_util_create_collector_mt(SubLObject seed_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sg_scenario_collector_microtheory_p(sg_util_collector_mt(seed_mt))) {
                return NIL;
            }
            thread.resetMultipleValues();
            {
                SubLObject result = prove.fi_hypothesize_int(subst(seed_mt, $MT, $sg_collector_mt_formula$.getGlobalValue(), UNPROVIDED, UNPROVIDED), mt_vars.$mt_mt$.getGlobalValue(), $$$HYP, UNPROVIDED);
                SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == result) {
                    Errors.cerror($str_alt42$Continue_anyway_, $str_alt55$Failed_to_create_collector_mt_for, seed_mt, reason);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_scenario_collector_microtheory_p(SubLObject mt) {
        return isa.isaP(mt, $$ScenarioCollectorMicrotheory, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject sg_scenario_context_p(SubLObject mt) {
        return isa.isaP(mt, $$ScenarioContext, $sg_root_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject sg_util_seeds_of_scenario(SubLObject scen_mt) {
        return kb_mapping_utilities.pred_values_in_any_mt(scen_mt, $$scenarioSeeds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sg_util_situations_of_scenario(SubLObject scen_mt) {
        return sg_util_objects_of_scenario(scen_mt, $$Situation);
    }

    public static final SubLObject sg_util_scenario_terms(SubLObject scen_mt) {
        return remove_duplicates(append(sg_util_objects_of_scenario(scen_mt, $$Situation), sg_util_objects_of_scenario(scen_mt, $$SomethingExisting)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sg_util_asserted_genl_mt(SubLObject mt) {
        {
            SubLObject mts = kb_mapping_utilities.pred_values_in_mt(mt, $$genlMt, mt_vars.$mt_mt$.getGlobalValue(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            return remove(mt_vars.$mt_root$.getGlobalValue(), mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        }
    }

    public static final SubLObject sg_util_objects_of_scenario(SubLObject scen_mt, SubLObject type) {
        if (NIL == sg_scenario_context_p(scen_mt)) {
            return NIL;
        }
        {
            SubLObject ass = kb_mapping.gather_predicate_extent_index($$isa, scen_mt, UNPROVIDED);
            SubLObject sits = NIL;
            SubLObject cdolist_list_var = ass;
            SubLObject as = NIL;
            for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , as = cdolist_list_var.first()) {
                {
                    SubLObject inst = assertions_high.gaf_arg1(as);
                    SubLObject coll = assertions_high.gaf_arg2(as);
                    if (NIL != genls.genlsP(coll, type, scen_mt, UNPROVIDED)) {
                        {
                            SubLObject item_var = inst;
                            if (NIL == member(item_var, sits, symbol_function(EQL), symbol_function(IDENTITY))) {
                                sits = cons(item_var, sits);
                            }
                        }
                    }
                }
            }
            if (NIL == sits) {
                return sg_util_situations_of_scenario(sg_util_asserted_genl_mt(scen_mt));
            }
            return sits;
        }
    }

    public static final SubLObject sg_util_assertions_of_term_in_mt(SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ass = NIL;
                if (NIL != narts_high.naut_p(v_term)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, $GAF)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != as);
                                            if (NIL != valid) {
                                                if (NIL != assertions_high.assertion_mentions_term(as, v_term)) {
                                                    ass = cons(as, ass);
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
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
                    ass = nreverse(ass);
                } else {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            ass = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return ass;
            }
        }
    }

    public static final SubLObject do_sg_scenario_contexts(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt62);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cur_mt = NIL;
                    SubLObject start_mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt62);
                    cur_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt62);
                    start_mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDO, list(list(cur_mt, list(SG_UTIL_NEXT_SCENARIO_CONTEXT, start_mt), list(SG_UTIL_NEXT_SCENARIO_CONTEXT, cur_mt))), list(list(CNOT, list(SG_SCENARIO_CONTEXT_P, cur_mt))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt62);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject sg_util_next_scenario_context(SubLObject mt) {
        {
            SubLObject potentially = kb_mapping_utilities.pred_values_in_mt(mt, $$genlMt, mt_vars.$mt_mt$.getGlobalValue(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            SubLObject candidates = delete($$BaseKB, potentially, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            candidates = list_utilities.remove_if_not(SG_SCENARIO_CONTEXT_P, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == candidates) {
                return NIL;
            } else {
                return candidates.first();
            }
        }
    }

    /**
     * Since we have really justifications now, this might not be necessary.
     */
    public static final SubLObject sg_util_assert_expansion_type(SubLObject mt, SubLObject module) {
        return cyc_kernel.cyc_assert(list($$scenarioGeneratedByExpansion, mt, module), mt, UNPROVIDED);
    }

    public static final SubLObject sg_util_all_modules_of_type(SubLObject type, SubLObject sortedP) {
        if (sortedP == UNPROVIDED) {
            sortedP = NIL;
        }
        {
            SubLObject v_modules = isa.all_fort_instances(type, $sg_module_mt$.getGlobalValue(), UNPROVIDED);
            if (NIL != sortedP) {
                v_modules = Sort.sort(v_modules, symbol_function($sym70$STRING_), CONSTANT_NAME);
            }
            return v_modules;
        }
    }

    // deflexical
    private static final SubLSymbol $sg_assertion_log$ = makeSymbol("*SG-ASSERTION-LOG*");

    public static final SubLObject sg_util_add_assertion_log_entry(SubLObject formula, SubLObject mt) {
        $sg_assertion_log$.setGlobalValue(cons(cons(formula, mt), $sg_assertion_log$.getGlobalValue()));
        return NIL;
    }

    public static final SubLObject sg_util_back_out_assertion_log() {
        {
            SubLObject cdolist_list_var = $sg_assertion_log$.getGlobalValue();
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                {
                    SubLObject formula = entry.first();
                    SubLObject mt = entry.rest();
                    fi.fi_unassert_int(formula, mt);
                }
            }
        }
        $sg_assertion_log$.setGlobalValue(NIL);
        return NIL;
    }

    public static final SubLObject sg_ab_clean_up_hypotheses(SubLObject mt) {
        return sg_util_clean_up_hypotheses(mt);
    }

    public static final SubLObject sg_util_clean_up_module_dependents(SubLObject mt) {
        return sg_modules.sg_mod_clean_up_module_dependents(mt);
    }

    public static final SubLObject sg_util_hyp_contexts_to_clean(SubLObject mt) {
        {
            SubLObject hyp_contexts = kb_mapping_utilities.pred_values(mt, $$genlMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = hyp_contexts;
            SubLObject cur_mt = NIL;
            for (cur_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_mt = cdolist_list_var.first()) {
                if (NIL != sg_scenario_context_p(cur_mt)) {
                    result = cons(cur_mt, result);
                }
            }
            return result;
        }
    }

    public static final SubLObject sg_util_clean_up_hypotheses(SubLObject mt) {
        {
            SubLObject hyp_contexts = sg_util_hyp_contexts_to_clean(mt);
            SubLObject cdolist_list_var = hyp_contexts;
            SubLObject cur_mt = NIL;
            for (cur_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_mt = cdolist_list_var.first()) {
                fi.fi_kill_int(cur_mt);
            }
            sg_util_clean_up_module_dependents(mt);
            sg_util_back_out_assertion_log();
            sg_browser.sg_cb_update_test_cases();
            return NIL;
        }
    }

    public static final SubLObject sg_refinement_benchmark(SubLObject mt, SubLObject v_modules, SubLObject depth_cutoff) {
        if (depth_cutoff == UNPROVIDED) {
            depth_cutoff = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time = NIL;
                {
                    SubLObject _prev_bind_0 = $sg_browse_forward_inferencesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $sg_trace$.currentBinding(thread);
                    try {
                        $sg_browse_forward_inferencesP$.bind(NIL, thread);
                        $sg_trace$.bind(NIL, thread);
                        sg_util_create_collector_mt(mt);
                        {
                            SubLObject time_var = get_internal_real_time();
                            {
                                SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
                                sg_refinment_benchmark_int(mt, v_modules, depth_cutoff);
                                {
                                    SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
                                    SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
                                    SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
                                    SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
                                    SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
                                    SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
                                    if (((((NIL != subl_promotions.non_zero_integer_p(new_constant_count)) || (NIL != subl_promotions.non_zero_integer_p(new_nart_count))) || (NIL != subl_promotions.non_zero_integer_p(new_assertion_count))) || (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count))) || (NIL != subl_promotions.non_zero_integer_p(new_deduction_count))) {
                                        if (cconcatenate($str_alt72$Productive__, new SubLObject[]{ format_nil.format_nil_a_no_copy(mt), $str_alt73$_, format_nil.format_nil_a_no_copy(depth_cutoff), $str_alt73$_, format_nil.format_nil_a_no_copy(v_modules) }).isString()) {
                                            format(T, $str_alt74$___A__, cconcatenate($str_alt72$Productive__, new SubLObject[]{ format_nil.format_nil_a_no_copy(mt), $str_alt73$_, format_nil.format_nil_a_no_copy(depth_cutoff), $str_alt73$_, format_nil.format_nil_a_no_copy(v_modules) }));
                                        }
                                        if (NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                                            format(T, $str_alt75$___s_constant_A__A__, new SubLObject[]{ abs(new_constant_count), abs(new_constant_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_constant_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                        if (NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                                            format(T, $str_alt80$___s_nart_A__A__, new SubLObject[]{ abs(new_nart_count), abs(new_nart_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_nart_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                        if (NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                                            format(T, $str_alt81$___s_assertion_A__A__, new SubLObject[]{ abs(new_assertion_count), abs(new_assertion_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_assertion_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                        if (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                                            format(T, $str_alt82$___s_kb_hl_support_A__A__, new SubLObject[]{ abs(new_kb_hl_support_count), abs(new_kb_hl_support_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                        if (NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                                            format(T, $str_alt83$___s_deduction_A__A__, new SubLObject[]{ abs(new_deduction_count), abs(new_deduction_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_deduction_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                    } else {
                                        if (cconcatenate($str_alt84$NOT_Productive__, new SubLObject[]{ format_nil.format_nil_a_no_copy(mt), $str_alt73$_, format_nil.format_nil_a_no_copy(depth_cutoff), $str_alt73$_, format_nil.format_nil_a_no_copy(v_modules) }).isString()) {
                                            format(T, $str_alt74$___A__, cconcatenate($str_alt84$NOT_Productive__, new SubLObject[]{ format_nil.format_nil_a_no_copy(mt), $str_alt73$_, format_nil.format_nil_a_no_copy(depth_cutoff), $str_alt73$_, format_nil.format_nil_a_no_copy(v_modules) }));
                                        }
                                    }
                                    force_output(T);
                                }
                            }
                            format(T, $str_alt85$Time_taken___A__, numeric_date_utilities.elapsed_time_abbreviation_string(time));
                            force_output(T);
                            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        }
                    } finally {
                        $sg_trace$.rebind(_prev_bind_1, thread);
                        $sg_browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return time;
            }
        }
    }

    public static final SubLObject sg_refinement_benchmark_ordered(SubLObject mt, SubLObject ordered_modules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time = NIL;
                SubLObject total_time = NIL;
                {
                    SubLObject _prev_bind_0 = $sg_browse_forward_inferencesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $sg_trace$.currentBinding(thread);
                    try {
                        $sg_browse_forward_inferencesP$.bind(NIL, thread);
                        $sg_trace$.bind(NIL, thread);
                        sg_util_create_collector_mt(mt);
                        {
                            SubLObject time_var = get_internal_real_time();
                            {
                                SubLObject cdolist_list_var = ordered_modules;
                                SubLObject module = NIL;
                                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                    {
                                        SubLObject time_var_10 = get_internal_real_time();
                                        {
                                            SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
                                            sg_refinment_benchmark_int(mt, list(module), ONE_INTEGER);
                                            {
                                                SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
                                                SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
                                                SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
                                                SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
                                                SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
                                                SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
                                                if (((((NIL != subl_promotions.non_zero_integer_p(new_constant_count)) || (NIL != subl_promotions.non_zero_integer_p(new_nart_count))) || (NIL != subl_promotions.non_zero_integer_p(new_assertion_count))) || (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count))) || (NIL != subl_promotions.non_zero_integer_p(new_deduction_count))) {
                                                    if (cconcatenate($str_alt72$Productive__, new SubLObject[]{ format_nil.format_nil_a_no_copy(mt), $str_alt73$_, format_nil.format_nil_a_no_copy(module) }).isString()) {
                                                        format(T, $str_alt74$___A__, cconcatenate($str_alt72$Productive__, new SubLObject[]{ format_nil.format_nil_a_no_copy(mt), $str_alt73$_, format_nil.format_nil_a_no_copy(module) }));
                                                    }
                                                    if (NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                                                        format(T, $str_alt75$___s_constant_A__A__, new SubLObject[]{ abs(new_constant_count), abs(new_constant_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_constant_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                                    }
                                                    if (NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                                                        format(T, $str_alt80$___s_nart_A__A__, new SubLObject[]{ abs(new_nart_count), abs(new_nart_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_nart_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                                    }
                                                    if (NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                                                        format(T, $str_alt81$___s_assertion_A__A__, new SubLObject[]{ abs(new_assertion_count), abs(new_assertion_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_assertion_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                                    }
                                                    if (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                                                        format(T, $str_alt82$___s_kb_hl_support_A__A__, new SubLObject[]{ abs(new_kb_hl_support_count), abs(new_kb_hl_support_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                                    }
                                                    if (NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                                                        format(T, $str_alt83$___s_deduction_A__A__, new SubLObject[]{ abs(new_deduction_count), abs(new_deduction_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt77$_was, NIL != subl_promotions.positive_integer_p(new_deduction_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                                    }
                                                } else {
                                                    if (cconcatenate($str_alt84$NOT_Productive__, new SubLObject[]{ format_nil.format_nil_a_no_copy(mt), $str_alt73$_, format_nil.format_nil_a_no_copy(module) }).isString()) {
                                                        format(T, $str_alt74$___A__, cconcatenate($str_alt84$NOT_Productive__, new SubLObject[]{ format_nil.format_nil_a_no_copy(mt), $str_alt73$_, format_nil.format_nil_a_no_copy(module) }));
                                                    }
                                                }
                                                force_output(T);
                                            }
                                        }
                                        time = divide(subtract(get_internal_real_time(), time_var_10), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    }
                                    format_nil.force_format(T, $str_alt85$Time_taken___A__, numeric_date_utilities.elapsed_time_abbreviation_string(time), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                            total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        }
                        format_nil.force_format(T, $str_alt86$Total_time_taken___A__, numeric_date_utilities.elapsed_time_abbreviation_string(total_time), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $sg_trace$.rebind(_prev_bind_1, thread);
                        $sg_browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return total_time;
            }
        }
    }

    public static final SubLObject sg_refinment_benchmark_int(SubLObject mt, SubLObject v_modules, SubLObject depth_cutoff) {
        if (depth_cutoff == UNPROVIDED) {
            depth_cutoff = NIL;
        }
        sg_abduction.sg_abductive_search(mt, list(new SubLObject[]{ $SEARCH_TYPE, $BREADTH_FIRST, $EXPAND_FUNCTION, SG_AB_EXPAND, $OPTIONS_FUNCTION, SG_AB_OPTIONS, $GOAL_FUNCTION, FALSE, $DEPTH_EXCEDED_FUNCTION, FALSE, $RANKING_FUNCTION, SG_AB_NODE_VALUE, $ACTIVE_MODULES, v_modules, $SG_INITIAL_REFINEMENT, T, $TIME_CUTOFF, NIL, $SG_REFINEMENT_CUTOFF, NIL != depth_cutoff ? ((SubLObject) ($ITERATIONS)) : NIL, $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER, depth_cutoff }));
        return NIL;
    }

    public static final SubLObject sg_refinement_benchmark_multiple(SubLObject mt, SubLObject all_modules, SubLObject depth_cutoff) {
        if (depth_cutoff == UNPROVIDED) {
            depth_cutoff = NIL;
        }
        {
            SubLObject cdotimes_end_var = (NIL != depth_cutoff) ? ((SubLObject) (depth_cutoff)) : ONE_INTEGER;
            SubLObject m = NIL;
            for (m = ZERO_INTEGER; m.numL(cdotimes_end_var); m = add(m, ONE_INTEGER)) {
                {
                    SubLObject cdotimes_end_var_11 = length(all_modules);
                    SubLObject n = NIL;
                    for (n = ZERO_INTEGER; n.numL(cdotimes_end_var_11); n = add(n, ONE_INTEGER)) {
                        {
                            SubLObject cdolist_list_var = list_utilities.subsets_of_size(all_modules, add(n, ONE_INTEGER));
                            SubLObject v_modules = NIL;
                            for (v_modules = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_modules = cdolist_list_var.first()) {
                                if (NIL != depth_cutoff) {
                                    sg_refinement_benchmark(mt, v_modules, add(m, ONE_INTEGER));
                                } else {
                                    sg_refinement_benchmark(mt, v_modules, UNPROVIDED);
                                }
                                kb_utilities.clear_new_kb_state();
                                Storage.gc_dynamic();
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Show a summary of the abductions in and under MT.
     */
    public static final SubLObject sg_scengen_summary_for_scenario(SubLObject mt, SubLObject indent) {
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject abduced_assertions = NIL;
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != assertion);
                                            if (NIL != valid) {
                                                if (NIL != sg_abduced_assertionP(assertion)) {
                                                    abduced_assertions = cons(assertion, abduced_assertions);
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
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
                } else
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index.id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt105$do_broad_mt_index, STRINGP);
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
                                        utilities_macros.noting_percent_progress_preamble($str_alt105$do_broad_mt_index);
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
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion, mt, NIL, NIL)) {
                                                            if (NIL != sg_abduced_assertionP(assertion)) {
                                                                abduced_assertions = cons(assertion, abduced_assertions);
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
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }

                if (NIL != abduced_assertions) {
                    string_utilities.indent(T, indent);
                    format_nil.force_format(T, $str_alt108$_A____, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = abduced_assertions;
                        SubLObject assertion = NIL;
                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                            string_utilities.indent(T, indent);
                            format_nil.force_format(T, $str_alt109$___A__, uncanonicalizer.assertion_el_formula(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = genl_mts.max_spec_mts(mt, UNPROVIDED, UNPROVIDED);
                SubLObject spec_mt = NIL;
                for (spec_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_mt = cdolist_list_var.first()) {
                    sg_scengen_summary_for_scenario(spec_mt, add(indent, TWO_INTEGER));
                }
            }
            return NIL;
        }
    }

    /**
     * Was ASSERTION created by a scengen expansion module?
     */
    public static final SubLObject sg_abduced_assertionP(SubLObject assertion) {
        {
            SubLObject result = NIL;
            SubLObject rest = NIL;
            for (rest = assertions_high.assertion_arguments(assertion); !((NIL != result) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject argument = rest.first();
                    if (NIL != deduction_handles.deduction_p(argument)) {
                        {
                            SubLObject rest_12 = NIL;
                            for (rest_12 = deductions_high.deduction_supports(argument); !((NIL != result) || (NIL == rest_12)); rest_12 = rest_12.rest()) {
                                {
                                    SubLObject supporting_assertion = rest_12.first();
                                    if (NIL != assertion_handles.assertion_p(supporting_assertion)) {
                                        if (cycl_utilities.formula_operator(uncanonicalizer.assertion_el_formula(supporting_assertion)) == $$abductiveExpansion) {
                                            result = supporting_assertion;
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

    public static final SubLObject subloop_reserved_initialize_sg_utilities_mt_relevance_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sg_utilities_mt_relevance_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_TEST_CASE, CONSTANTS, NIL);
        return NIL;
    }

    public static final SubLObject sg_utilities_mt_relevance_test_case_p(SubLObject sg_utilities_mt_relevance_test_case) {
        return classes.subloop_instanceof_class(sg_utilities_mt_relevance_test_case, SG_UTILITIES_MT_RELEVANCE_TEST_CASE);
    }

    public static final SubLObject get_sg_utilities_hypothesis_test_case_event(SubLObject sg_utilities_hypothesis_test_case) {
        return classes.subloop_get_instance_slot(sg_utilities_hypothesis_test_case, FOUR_INTEGER);
    }

    public static final SubLObject set_sg_utilities_hypothesis_test_case_event(SubLObject sg_utilities_hypothesis_test_case, SubLObject value) {
        return classes.subloop_set_instance_slot(sg_utilities_hypothesis_test_case, value, FOUR_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_sg_utilities_hypothesis_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sg_utilities_hypothesis_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_TEST_CASE, CONSTANTS, NIL);
        classes.subloop_initialize_slot(new_instance, SG_UTILITIES_HYPOTHESIS_TEST_CASE, EVENT, NIL);
        return NIL;
    }

    public static final SubLObject sg_utilities_hypothesis_test_case_p(SubLObject sg_utilities_hypothesis_test_case) {
        return classes.subloop_instanceof_class(sg_utilities_hypothesis_test_case, SG_UTILITIES_HYPOTHESIS_TEST_CASE);
    }

    public static final SubLObject declare_sg_utilities_file() {
        declareFunction("sg_trace_int", "SG-TRACE-INT", 2, 0, false);
        declareMacro("sg_trace", "SG-TRACE");
        declareMacro("with_no_sg_tracing", "WITH-NO-SG-TRACING");
        declareFunction("sg_relevant_scenario_context", "SG-RELEVANT-SCENARIO-CONTEXT", 1, 0, false);
        declareMacro("with_just_sg_mts", "WITH-JUST-SG-MTS");
        declareFunction("sg_util_cyc_query", "SG-UTIL-CYC-QUERY", 3, 0, false);
        declareFunction("sg_util_continue_inference", "SG-UTIL-CONTINUE-INFERENCE", 2, 0, false);
        declareFunction("sg_ab_hypothesize_formula", "SG-AB-HYPOTHESIZE-FORMULA", 2, 0, false);
        declareFunction("sg_ab_assert_formula", "SG-AB-ASSERT-FORMULA", 2, 0, false);
        declareFunction("sg_util_add_abduction_arguments", "SG-UTIL-ADD-ABDUCTION-ARGUMENTS", 3, 0, false);
        declareFunction("sg_util_add_deduction_arguments", "SG-UTIL-ADD-DEDUCTION-ARGUMENTS", 3, 0, false);
        declareFunction("sg_util_forward_propagate_assertions", "SG-UTIL-FORWARD-PROPAGATE-ASSERTIONS", 3, 0, false);
        declareFunction("sg_util_new_scenario_mt", "SG-UTIL-NEW-SCENARIO-MT", 1, 0, false);
        declareFunction("sg_util_new_scenario_context", "SG-UTIL-NEW-SCENARIO-CONTEXT", 2, 0, false);
        declareFunction("sg_util_collector_mt", "SG-UTIL-COLLECTOR-MT", 1, 0, false);
        declareFunction("sg_util_create_collector_mt", "SG-UTIL-CREATE-COLLECTOR-MT", 1, 0, false);
        declareFunction("sg_scenario_collector_microtheory_p", "SG-SCENARIO-COLLECTOR-MICROTHEORY-P", 1, 0, false);
        declareFunction("sg_scenario_context_p", "SG-SCENARIO-CONTEXT-P", 1, 0, false);
        declareFunction("sg_util_seeds_of_scenario", "SG-UTIL-SEEDS-OF-SCENARIO", 1, 0, false);
        declareFunction("sg_util_situations_of_scenario", "SG-UTIL-SITUATIONS-OF-SCENARIO", 1, 0, false);
        declareFunction("sg_util_scenario_terms", "SG-UTIL-SCENARIO-TERMS", 1, 0, false);
        declareFunction("sg_util_asserted_genl_mt", "SG-UTIL-ASSERTED-GENL-MT", 1, 0, false);
        declareFunction("sg_util_objects_of_scenario", "SG-UTIL-OBJECTS-OF-SCENARIO", 2, 0, false);
        declareFunction("sg_util_assertions_of_term_in_mt", "SG-UTIL-ASSERTIONS-OF-TERM-IN-MT", 2, 0, false);
        declareMacro("do_sg_scenario_contexts", "DO-SG-SCENARIO-CONTEXTS");
        declareFunction("sg_util_next_scenario_context", "SG-UTIL-NEXT-SCENARIO-CONTEXT", 1, 0, false);
        declareFunction("sg_util_assert_expansion_type", "SG-UTIL-ASSERT-EXPANSION-TYPE", 2, 0, false);
        declareFunction("sg_util_all_modules_of_type", "SG-UTIL-ALL-MODULES-OF-TYPE", 1, 1, false);
        declareFunction("sg_util_add_assertion_log_entry", "SG-UTIL-ADD-ASSERTION-LOG-ENTRY", 2, 0, false);
        declareFunction("sg_util_back_out_assertion_log", "SG-UTIL-BACK-OUT-ASSERTION-LOG", 0, 0, false);
        declareFunction("sg_ab_clean_up_hypotheses", "SG-AB-CLEAN-UP-HYPOTHESES", 1, 0, false);
        declareFunction("sg_util_clean_up_module_dependents", "SG-UTIL-CLEAN-UP-MODULE-DEPENDENTS", 1, 0, false);
        declareFunction("sg_util_hyp_contexts_to_clean", "SG-UTIL-HYP-CONTEXTS-TO-CLEAN", 1, 0, false);
        declareFunction("sg_util_clean_up_hypotheses", "SG-UTIL-CLEAN-UP-HYPOTHESES", 1, 0, false);
        declareFunction("sg_refinement_benchmark", "SG-REFINEMENT-BENCHMARK", 2, 1, false);
        declareFunction("sg_refinement_benchmark_ordered", "SG-REFINEMENT-BENCHMARK-ORDERED", 2, 0, false);
        declareFunction("sg_refinment_benchmark_int", "SG-REFINMENT-BENCHMARK-INT", 2, 1, false);
        declareFunction("sg_refinement_benchmark_multiple", "SG-REFINEMENT-BENCHMARK-MULTIPLE", 2, 1, false);
        declareFunction("sg_scengen_summary_for_scenario", "SG-SCENGEN-SUMMARY-FOR-SCENARIO", 1, 1, false);
        declareFunction("sg_abduced_assertionP", "SG-ABDUCED-ASSERTION?", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sg_utilities_mt_relevance_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SG-UTILITIES-MT-RELEVANCE-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sg_utilities_mt_relevance_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SG-UTILITIES-MT-RELEVANCE-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("sg_utilities_mt_relevance_test_case_p", "SG-UTILITIES-MT-RELEVANCE-TEST-CASE-P", 1, 0, false);
        declareFunction("get_sg_utilities_hypothesis_test_case_event", "GET-SG-UTILITIES-HYPOTHESIS-TEST-CASE-EVENT", 1, 0, false);
        declareFunction("set_sg_utilities_hypothesis_test_case_event", "SET-SG-UTILITIES-HYPOTHESIS-TEST-CASE-EVENT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_sg_utilities_hypothesis_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SG-UTILITIES-HYPOTHESIS-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sg_utilities_hypothesis_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SG-UTILITIES-HYPOTHESIS-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("sg_utilities_hypothesis_test_case_p", "SG-UTILITIES-HYPOTHESIS-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sg_utilities_file() {
        deflexical("*SG-MODULE-MT*", $$ScenarioGenerationTestMt);
        deflexical("*SG-ROOT-MT*", $$ScenarioGenerationActionPlannerMt);
        defparameter("*SG-BROWSE-FORWARD-INFERENCES?*", T);
        defparameter("*SG-TRACE*", FOUR_INTEGER);
        deflexical("*SG-UTIL-NEW-SCENARIO-CONTEXT-FORMULA*", $list_alt37);
        deflexical("*SG-UTIL-NEW-SCENARIO-CONTEXT-LITS*", $list_alt44);
        deflexical("*SG-UTIL-NEW-SCENARIO-CONTEXT-EXTRA-ASSERTIONS*", $list_alt45);
        deflexical("*SG-COLLECTOR-MT-FORMULA*", $list_alt54);
        deflexical("*SG-ASSERTION-LOG*", NIL);
        return NIL;
    }

    public static final SubLObject setup_sg_utilities_file() {
                access_macros.register_macro_helper(SG_UTIL_NEXT_SCENARIO_CONTEXT, DO_SG_SCENARIO_CONTEXTS);
        sunit_external.define_test_category($str_alt111$sg_utilities_test_category, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SG_UTILITIES_MT_RELEVANCE_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(SG_UTILITIES_MT_RELEVANCE_TEST_CASE);
        classes.subloop_new_class(SG_UTILITIES_MT_RELEVANCE_TEST_CASE, CYCL_TEST_CASE, NIL, NIL, $list_alt114);
        classes.class_set_implements_slot_listeners(SG_UTILITIES_MT_RELEVANCE_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(SG_UTILITIES_MT_RELEVANCE_TEST_CASE, $sym124$SUBLOOP_RESERVED_INITIALIZE_SG_UTILITIES_MT_RELEVANCE_TEST_CASE_C);
        classes.subloop_note_instance_initialization_function(SG_UTILITIES_MT_RELEVANCE_TEST_CASE, $sym130$SUBLOOP_RESERVED_INITIALIZE_SG_UTILITIES_MT_RELEVANCE_TEST_CASE_I);
        subloop_reserved_initialize_sg_utilities_mt_relevance_test_case_class(SG_UTILITIES_MT_RELEVANCE_TEST_CASE);
        sunit_macros.define_test_case_postamble(SG_UTILITIES_MT_RELEVANCE_TEST_CASE, $str_alt131$sg_utilities, $$$cycl, $list_alt133);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SG_UTILITIES_HYPOTHESIS_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(SG_UTILITIES_HYPOTHESIS_TEST_CASE);
        classes.subloop_new_class(SG_UTILITIES_HYPOTHESIS_TEST_CASE, CYCL_TEST_CASE, NIL, NIL, $list_alt135);
        classes.class_set_implements_slot_listeners(SG_UTILITIES_HYPOTHESIS_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(SG_UTILITIES_HYPOTHESIS_TEST_CASE, $sym136$SUBLOOP_RESERVED_INITIALIZE_SG_UTILITIES_HYPOTHESIS_TEST_CASE_CLA);
        classes.subloop_note_instance_initialization_function(SG_UTILITIES_HYPOTHESIS_TEST_CASE, $sym138$SUBLOOP_RESERVED_INITIALIZE_SG_UTILITIES_HYPOTHESIS_TEST_CASE_INS);
        subloop_reserved_initialize_sg_utilities_hypothesis_test_case_class(SG_UTILITIES_HYPOTHESIS_TEST_CASE);
        sunit_macros.define_test_case_postamble(SG_UTILITIES_HYPOTHESIS_TEST_CASE, $str_alt131$sg_utilities, $$$cycl, $list_alt133);
        sunit_macros.def_test_method_register(SG_UTILITIES_HYPOTHESIS_TEST_CASE, HYP_TEST);
        sunit_external.define_test_suite($str_alt131$sg_utilities, $list_alt133, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$ScenarioGenerationTestMt = constant_handles.reader_make_constant_shell(makeString("ScenarioGenerationTestMt"));

    public static final SubLObject $$ScenarioGenerationActionPlannerMt = constant_handles.reader_make_constant_shell(makeString("ScenarioGenerationActionPlannerMt"));

    static private final SubLString $str_alt2$___A___A = makeString("~&~A: ~A");

    static private final SubLList $list_alt3 = list(makeSymbol("LEVEL"), makeSymbol("STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol SG_TRACE_INT = makeSymbol("SG-TRACE-INT");





    static private final SubLList $list_alt7 = list(list(makeSymbol("*SG-TRACE*"), NIL));

    static private final SubLList $list_alt8 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_MT_FUNCTION = makeSymbol("WITH-MT-FUNCTION");

    static private final SubLList $list_alt10 = list(QUOTE, makeSymbol("SG-RELEVANT-SCENARIO-CONTEXT"));

    private static final SubLSymbol IN_MT = makeSymbol("IN-MT");

    static private final SubLString $str_alt12$SG_UTIL_CYC_QUERY = makeString("SG-UTIL-CYC-QUERY");

    static private final SubLString $str_alt13$__Formula___a__Mt___a = makeString("  Formula: ~a~%Mt: ~a");

    static private final SubLString $str_alt14$__Results___a = makeString("  Results: ~a");

    static private final SubLString $str_alt15$__Results__None = makeString("  Results: None");

    static private final SubLString $str_alt16$SG_UTIL_CONTINUE_INFERENCE___S = makeString("SG-UTIL-CONTINUE-INFERENCE: ~S");

    static private final SubLString $str_alt17$SG_AB_HYPOTHESIZE_FORMULA____Form = makeString("SG-AB-HYPOTHESIZE-FORMULA~%  Formula: ~s Mt: ~s");

    public static final SubLObject $$ephemeralTerm = constant_handles.reader_make_constant_shell(makeString("ephemeralTerm"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt20 = list(constant_handles.reader_make_constant_shell(makeString("HypothesizedInstance")));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLList $list_alt22 = list(cons(T, T));

    static private final SubLString $str_alt23$__Hypothesizing_Failed__Reason___ = makeString("  Hypothesizing Failed. Reason: ~s");

    static private final SubLString $str_alt24$SG_AB_ASSERT_FORMULA____Formula__ = makeString("SG-AB-ASSERT-FORMULA~%  Formula: ~s Mt: ~s");

    static private final SubLList $list_alt25 = list(makeKeyword("STRENGTH"), makeKeyword("DEFAULT"));

    static private final SubLString $str_alt26$__SG_UTIL_ADD_ABDUCTION_ARGUMENTS = makeString("  SG-UTIL-ADD-ABDUCTION-ARGUMENTS~%  Formula: ~s~% # of Supports: ~s~% Mt: ~s~%");

    static private final SubLString $str_alt27$__SG_UTIL_ADD_ABDUCTION_ARGUMENTS = makeString("  SG-UTIL-ADD-ABDUCTION-ARGUMENTS Completed");

    static private final SubLString $str_alt28$__SG_UTIL_ADD_ABDUCTION_ARGUMENTS = makeString("  SG-UTIL-ADD-ABDUCTION-ARGUMENTS Failed");

    static private final SubLString $str_alt29$__SG_UTIL_ADD_DEDUCTION_ARGUMENTS = makeString("  SG-UTIL-ADD-DEDUCTION-ARGUMENTS~%  Formula: ~s~% # of Supports: ~s~% Mt: ~s~%");

    static private final SubLString $str_alt30$__SG_UTIL_ADD_DEDUCTION_ARGUMENTS = makeString("  SG-UTIL-ADD-DEDUCTION-ARGUMENTS Completed");

    static private final SubLString $str_alt31$__SG_UTIL_ADD_DEDUCTION_ARGUMENTS = makeString("  SG-UTIL-ADD-DEDUCTION-ARGUMENTS Failed");

    static private final SubLString $str_alt32$__SG_UTIL_FORWARD_PROPAGATE_ASSER = makeString("  SG-UTIL-FORWARD-PROPAGATE-ASSERTIONS # ~A in mt: ~A~%");





    static private final SubLString $str_alt35$_forward_propagating_in_mt__A_aga = makeString(" forward propagating in mt ~A against rules ~A~%");



    static private final SubLList $list_alt37 = list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?SPEC-MT"), constant_handles.reader_make_constant_shell(makeString("ScenarioContext"))), list(constant_handles.reader_make_constant_shell(makeString("genlMt")), makeSymbol("?SPEC-MT"), makeKeyword("MT")), list(constant_handles.reader_make_constant_shell(makeString("highlyRelevantMt")), makeSymbol("?SPEC-MT")), list(constant_handles.reader_make_constant_shell(makeString("termDependsOn")), makeSymbol("?SPEC-MT"), makeKeyword("MT")), list(constant_handles.reader_make_constant_shell(makeString("ephemeralTerm")), makeSymbol("?SPEC-MT")));



    static private final SubLString $$$HYP = makeString("HYP");

    static private final SubLSymbol $sym40$_SPEC_MT = makeSymbol("?SPEC-MT");

    static private final SubLString $str_alt41$Making_new_context__a_from__a = makeString("Making new context ~a from ~a");

    static private final SubLString $str_alt42$Continue_anyway_ = makeString("Continue anyway?");

    static private final SubLString $str_alt43$Failed_to_creat_new_scenario_in__ = makeString("Failed to creat new scenario in ~a");

    static private final SubLList $list_alt44 = list(list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?SPEC-MT"), constant_handles.reader_make_constant_shell(makeString("ScenarioContext"))));

    static private final SubLList $list_alt45 = list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("scenarioCollectorMt")), makeKeyword("SINK-MT"), makeSymbol("?SPEC-MT")), list(constant_handles.reader_make_constant_shell(makeString("highlyRelevantMt")), makeSymbol("?SPEC-MT")), list(constant_handles.reader_make_constant_shell(makeString("ephemeralTerm")), makeSymbol("?SPEC-MT")));

    static private final SubLList $list_alt46 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?SPEC-MT"), constant_handles.reader_make_constant_shell(makeString("ScenarioContext")));

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    public static final SubLObject $$termDependsOn = constant_handles.reader_make_constant_shell(makeString("termDependsOn"));

    public static final SubLObject $$scenarioCollectorMt = constant_handles.reader_make_constant_shell(makeString("scenarioCollectorMt"));

    public static final SubLObject $$highlyRelevantMt = constant_handles.reader_make_constant_shell(makeString("highlyRelevantMt"));

    static private final SubLString $str_alt51$Failed_to_assert___scenarioCollec = makeString("Failed to assert #$scenarioCollectorMt relationship for new context ~a with sink ~a");

    static private final SubLString $str_alt52$Failed_to_create_new_scenario_in_ = makeString("Failed to create new scenario in ~a becasue ~a");



    static private final SubLList $list_alt54 = list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?MT"), constant_handles.reader_make_constant_shell(makeString("ScenarioCollectorMicrotheory"))), list(constant_handles.reader_make_constant_shell(makeString("scenarioCollectorMt")), makeSymbol("?MT"), makeKeyword("MT")));

    static private final SubLString $str_alt55$Failed_to_create_collector_mt_for = makeString("Failed to create collector mt for seed ~a because");

    public static final SubLObject $$ScenarioCollectorMicrotheory = constant_handles.reader_make_constant_shell(makeString("ScenarioCollectorMicrotheory"));

    public static final SubLObject $$ScenarioContext = constant_handles.reader_make_constant_shell(makeString("ScenarioContext"));

    public static final SubLObject $$scenarioSeeds = constant_handles.reader_make_constant_shell(makeString("scenarioSeeds"));

    public static final SubLObject $$Situation = constant_handles.reader_make_constant_shell(makeString("Situation"));

    public static final SubLObject $$SomethingExisting = constant_handles.reader_make_constant_shell(makeString("SomethingExisting"));



    static private final SubLList $list_alt62 = list(list(makeSymbol("CUR-MT"), makeSymbol("START-MT")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol SG_UTIL_NEXT_SCENARIO_CONTEXT = makeSymbol("SG-UTIL-NEXT-SCENARIO-CONTEXT");



    private static final SubLSymbol SG_SCENARIO_CONTEXT_P = makeSymbol("SG-SCENARIO-CONTEXT-P");

    private static final SubLSymbol DO_SG_SCENARIO_CONTEXTS = makeSymbol("DO-SG-SCENARIO-CONTEXTS");

    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLObject $$scenarioGeneratedByExpansion = constant_handles.reader_make_constant_shell(makeString("scenarioGeneratedByExpansion"));

    static private final SubLSymbol $sym70$STRING_ = makeSymbol("STRING<");



    static private final SubLString $str_alt72$Productive__ = makeString("Productive: ");

    static private final SubLString $str_alt73$_ = makeString(" ");

    static private final SubLString $str_alt74$___A__ = makeString("~&~A~%");

    static private final SubLString $str_alt75$___s_constant_A__A__ = makeString("  ~s constant~A ~A~%");

    static private final SubLString $$$s_were = makeString("s were");

    static private final SubLString $str_alt77$_was = makeString(" was");

    static private final SubLString $$$created = makeString("created");

    static private final SubLString $$$destroyed = makeString("destroyed");

    static private final SubLString $str_alt80$___s_nart_A__A__ = makeString("  ~s nart~A ~A~%");

    static private final SubLString $str_alt81$___s_assertion_A__A__ = makeString("  ~s assertion~A ~A~%");

    static private final SubLString $str_alt82$___s_kb_hl_support_A__A__ = makeString("  ~s kb-hl-support~A ~A~%");

    static private final SubLString $str_alt83$___s_deduction_A__A__ = makeString("  ~s deduction~A ~A~%");

    static private final SubLString $str_alt84$NOT_Productive__ = makeString("NOT Productive: ");

    static private final SubLString $str_alt85$Time_taken___A__ = makeString("Time taken: ~A~%");

    static private final SubLString $str_alt86$Total_time_taken___A__ = makeString("Total time taken: ~A~%");







    private static final SubLSymbol SG_AB_EXPAND = makeSymbol("SG-AB-EXPAND");



    private static final SubLSymbol SG_AB_OPTIONS = makeSymbol("SG-AB-OPTIONS");





    private static final SubLSymbol $DEPTH_EXCEDED_FUNCTION = makeKeyword("DEPTH-EXCEDED-FUNCTION");



    private static final SubLSymbol SG_AB_NODE_VALUE = makeSymbol("SG-AB-NODE-VALUE");



    private static final SubLSymbol $SG_INITIAL_REFINEMENT = makeKeyword("SG-INITIAL-REFINEMENT");



    private static final SubLSymbol $SG_REFINEMENT_CUTOFF = makeKeyword("SG-REFINEMENT-CUTOFF");



    private static final SubLSymbol $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER = makeKeyword("SG-REFINEMENT-CUTOFF-ITERATIONS-NUMBER");



    static private final SubLString $str_alt105$do_broad_mt_index = makeString("do-broad-mt-index");





    static private final SubLString $str_alt108$_A____ = makeString("~A: ~%");

    static private final SubLString $str_alt109$___A__ = makeString("  ~A~%");

    public static final SubLObject $$abductiveExpansion = constant_handles.reader_make_constant_shell(makeString("abductiveExpansion"));

    static private final SubLString $str_alt111$sg_utilities_test_category = makeString("sg-utilities-test-category");

    private static final SubLSymbol SG_UTILITIES_MT_RELEVANCE_TEST_CASE = makeSymbol("SG-UTILITIES-MT-RELEVANCE-TEST-CASE");

    private static final SubLSymbol CYCL_TEST_CASE = makeSymbol("CYCL-TEST-CASE");

    static private final SubLList $list_alt114 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HYP-TEST"), NIL, makeKeyword("PROTECTED")));



















    static private final SubLSymbol $sym124$SUBLOOP_RESERVED_INITIALIZE_SG_UTILITIES_MT_RELEVANCE_TEST_CASE_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SG-UTILITIES-MT-RELEVANCE-TEST-CASE-CLASS");











    static private final SubLSymbol $sym130$SUBLOOP_RESERVED_INITIALIZE_SG_UTILITIES_MT_RELEVANCE_TEST_CASE_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SG-UTILITIES-MT-RELEVANCE-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt131$sg_utilities = makeString("sg-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt133 = list(makeString("sg-utilities-test-category"));

    private static final SubLSymbol SG_UTILITIES_HYPOTHESIS_TEST_CASE = makeSymbol("SG-UTILITIES-HYPOTHESIS-TEST-CASE");

    static private final SubLList $list_alt135 = list(list(makeSymbol("EVENT"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HYP-TEST"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym136$SUBLOOP_RESERVED_INITIALIZE_SG_UTILITIES_HYPOTHESIS_TEST_CASE_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SG-UTILITIES-HYPOTHESIS-TEST-CASE-CLASS");



    static private final SubLSymbol $sym138$SUBLOOP_RESERVED_INITIALIZE_SG_UTILITIES_HYPOTHESIS_TEST_CASE_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SG-UTILITIES-HYPOTHESIS-TEST-CASE-INSTANCE");

    private static final SubLSymbol HYP_TEST = makeSymbol("HYP-TEST");

    // // Initializers
    public void declareFunctions() {
        declare_sg_utilities_file();
    }

    public void initializeVariables() {
        init_sg_utilities_file();
    }

    public void runTopLevelForms() {
        setup_sg_utilities_file();
    }
}

