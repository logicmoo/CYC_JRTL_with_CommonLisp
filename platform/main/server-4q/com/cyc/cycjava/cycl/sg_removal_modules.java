/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SG-REMOVAL-MODULES
 *  source file: /cyc/top/cycl/sg-removal-modules.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class sg_removal_modules extends SubLTranslatedFile implements V02 {
    // // Constructor
    private sg_removal_modules() {
    }

    public static final SubLFile me = new sg_removal_modules();

    public static final String myName = "com.cyc.cycjava.cycl.sg_removal_modules";

    // // Definitions
    // deflexical
    private static final SubLSymbol $sg_removal_abductive_explanation_mt_search_properties$ = makeSymbol("*SG-REMOVAL-ABDUCTIVE-EXPLANATION-MT-SEARCH-PROPERTIES*");

    public static final SubLObject sg_removal_abductive_explanation_mt_search_properties() {
        return $sg_removal_abductive_explanation_mt_search_properties$.getGlobalValue();
    }

    public static final SubLObject sg_removal_current_inference_max_time() {
        {
            SubLObject strategy = inference_macros.current_controlling_strategy();
            SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            SubLObject max_time = inference_datastructures_inference.inference_max_time(inference);
            return max_time;
        }
    }

    public static final SubLObject sg_removal_abductive_explanation_mt_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject context_mt = cycl_utilities.formula_arg2(asent, UNPROVIDED);
                SubLObject search_properties = sg_removal_abductive_explanation_mt_search_properties();
                SubLObject time_cutoff = sg_removal_current_inference_max_time();
                if (NIL != time_cutoff) {
                    search_properties = putf(search_properties, $TIME_CUTOFF, time_cutoff);
                }
                {
                    SubLObject _prev_bind_0 = sg_utilities.$sg_trace$.currentBinding(thread);
                    try {
                        sg_utilities.$sg_trace$.bind(NIL, thread);
                        sg_abduction.sg_abductive_search(context_mt, search_properties);
                    } finally {
                        sg_utilities.$sg_trace$.rebind(_prev_bind_0, thread);
                    }
                }
                sg_abduction.$sg_search$.setDynamicValue(NIL, thread);
                {
                    SubLObject exp_contexts = gt_methods.gt_all_inferiors($$genlMt, context_mt, UNPROVIDED);
                    SubLObject cdolist_list_var = exp_contexts;
                    SubLObject cur_context = NIL;
                    for (cur_context = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_context = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(cycl_utilities.formula_arg1(asent, UNPROVIDED), cur_context, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject support = arguments.make_hl_support($OPAQUE, list($$abductiveExplanationMt, cur_context, context_mt), UNPROVIDED, UNPROVIDED);
                                    backward.removal_add_node(support, v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_removal_scenario_sentence_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sent = cycl_utilities.formula_arg1(asent, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(SG_RELEVANT_SCENARIO_CONTEXT, thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                        {
                            SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sent, sense);
                            SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                            SubLObject pcase_var = method;
                            if (pcase_var.eql($GAF_ARG)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                    SubLObject argnum = thread.secondMultipleValue();
                                    SubLObject predicate = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != argnum) {
                                        if (NIL != predicate) {
                                            {
                                                SubLObject pred_var = predicate;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                            {
                                                                                SubLObject done_var_1 = NIL;
                                                                                SubLObject token_var_2 = NIL;
                                                                                while (NIL == done_var_1) {
                                                                                    {
                                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                                        SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                                        if (NIL != valid_3) {
                                                                                            if (NIL != sg_meaningful_isas_filter(assertion)) {
                                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sent);
                                                                                            }
                                                                                        }
                                                                                        done_var_1 = makeBoolean(NIL == valid_3);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
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
                                        } else {
                                            {
                                                SubLObject pred_var = NIL;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                            {
                                                                                SubLObject done_var_5 = NIL;
                                                                                SubLObject token_var_6 = NIL;
                                                                                while (NIL == done_var_5) {
                                                                                    {
                                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                                        SubLObject valid_7 = makeBoolean(token_var_6 != assertion);
                                                                                        if (NIL != valid_7) {
                                                                                            if (NIL != sg_meaningful_isas_filter(assertion)) {
                                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sent);
                                                                                            }
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
                                        }
                                    } else {
                                        if (NIL != predicate) {
                                            {
                                                SubLObject pred_var = predicate;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                            {
                                                                                SubLObject done_var_9 = NIL;
                                                                                SubLObject token_var_10 = NIL;
                                                                                while (NIL == done_var_9) {
                                                                                    {
                                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                                                        SubLObject valid_11 = makeBoolean(token_var_10 != assertion);
                                                                                        if (NIL != valid_11) {
                                                                                            if (NIL != sg_meaningful_isas_filter(assertion)) {
                                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sent);
                                                                                            }
                                                                                        }
                                                                                        done_var_9 = makeBoolean(NIL == valid_11);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
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
                                        } else {
                                            {
                                                SubLObject pred_var = NIL;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                            {
                                                                                SubLObject done_var_13 = NIL;
                                                                                SubLObject token_var_14 = NIL;
                                                                                while (NIL == done_var_13) {
                                                                                    {
                                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                                        SubLObject valid_15 = makeBoolean(token_var_14 != assertion);
                                                                                        if (NIL != valid_15) {
                                                                                            if (NIL != sg_meaningful_isas_filter(assertion)) {
                                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sent);
                                                                                            }
                                                                                        }
                                                                                        done_var_13 = makeBoolean(NIL == valid_15);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
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
                                        }
                                    }
                                }
                            } else
                                if (pcase_var.eql($PREDICATE_EXTENT)) {
                                    {
                                        SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
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
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                    {
                                                                        SubLObject done_var_17 = NIL;
                                                                        SubLObject token_var_18 = NIL;
                                                                        while (NIL == done_var_17) {
                                                                            {
                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                                                                                SubLObject valid_19 = makeBoolean(token_var_18 != assertion);
                                                                                if (NIL != valid_19) {
                                                                                    if (NIL != sg_meaningful_isas_filter(assertion)) {
                                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sent);
                                                                                    }
                                                                                }
                                                                                done_var_17 = makeBoolean(NIL == valid_19);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
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
                                } else
                                    if (pcase_var.eql($OVERLAP)) {
                                        {
                                            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                            SubLObject assertion = NIL;
                                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                                if ((NIL == enumeration_types.sense_truth(sense)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(sense)))) {
                                                    if (NIL != sg_meaningful_isas_filter(assertion)) {
                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sent);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        kb_mapping_macros.do_gli_method_error(l_index, method);
                                    }


                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * The term whose generality estimate is 100 below the cutoff we'll use for interesting collections.
     * Collections with higher generality estimates are deemed not interesting.
     */
    // defparameter
    private static final SubLSymbol $sg_generality_benchmark_term$ = makeSymbol("*SG-GENERALITY-BENCHMARK-TERM*");

    public static final SubLObject sg_meaningful_isas_filter(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != assertions_high.gaf_assertionP(assertion)) && (assertions_high.gaf_arg0(assertion) == $$isa)) {
                {
                    SubLObject collection = assertions_high.gaf_arg2(assertion);
                    if (cardinality_estimates.generality_estimate(collection).numG(add($int$100, cardinality_estimates.generality_estimate($sg_generality_benchmark_term$.getDynamicValue(thread))))) {
                        return NIL;
                    } else {
                        return assertion;
                    }
                }
            } else {
                return assertion;
            }
        }
    }

    public static final SubLObject declare_sg_removal_modules_file() {
        declareFunction("sg_removal_abductive_explanation_mt_search_properties", "SG-REMOVAL-ABDUCTIVE-EXPLANATION-MT-SEARCH-PROPERTIES", 0, 0, false);
        declareFunction("sg_removal_current_inference_max_time", "SG-REMOVAL-CURRENT-INFERENCE-MAX-TIME", 0, 0, false);
        declareFunction("sg_removal_abductive_explanation_mt_expand", "SG-REMOVAL-ABDUCTIVE-EXPLANATION-MT-EXPAND", 1, 1, false);
        declareFunction("sg_removal_scenario_sentence_expand", "SG-REMOVAL-SCENARIO-SENTENCE-EXPAND", 1, 1, false);
        declareFunction("sg_meaningful_isas_filter", "SG-MEANINGFUL-ISAS-FILTER", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sg_removal_modules_file() {
        deflexical("*SG-REMOVAL-ABDUCTIVE-EXPLANATION-MT-SEARCH-PROPERTIES*", $list_alt3);
        defparameter("*SG-GENERALITY-BENCHMARK-TERM*", $$PhysicalSituation);
        return NIL;
    }

    public static final SubLObject setup_sg_removal_modules_file() {
                inference_modules.register_solely_specific_removal_module_predicate($$abductiveExplanationMt);
        inference_modules.inference_removal_module($SG_REMOVAL_ABDUCTIVE_EXPLANATION_MT, $list_alt2);
        inference_modules.register_solely_specific_removal_module_predicate($$scenarioSentence);
        inference_modules.inference_removal_module($SG_REMOVAL_SCENARIO_SENTENCE, $list_alt9);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$abductiveExplanationMt = constant_handles.reader_make_constant_shell(makeString("abductiveExplanationMt"));

    private static final SubLSymbol $SG_REMOVAL_ABDUCTIVE_EXPLANATION_MT = makeKeyword("SG-REMOVAL-ABDUCTIVE-EXPLANATION-MT");

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("abductiveExplanationMt")), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("abductiveExplanationMt")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("SG-REMOVAL-ABDUCTIVE-EXPLANATION-MT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$abductiveExplanationMt <not fully-bound> <context>)\n    where <context> is a #$ScenarioContext. Generates new\n    contexts that are abductive explanations of <context>.") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SEARCH-TYPE"), makeKeyword("BREADTH-FIRST"), makeKeyword("EXPAND-FUNCTION"), makeSymbol("SG-AB-EXPAND"), makeKeyword("OPTIONS-FUNCTION"), makeSymbol("SG-AB-OPTIONS"), makeKeyword("GOAL-FUNCTION"), makeSymbol("FALSE"), makeKeyword("DEPTH-EXCEDED-FUNCTION"), makeSymbol("FALSE"), makeKeyword("RANKING-FUNCTION"), makeSymbol("SG-AB-NODE-VALUE") });



    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));



    public static final SubLObject $$scenarioSentence = constant_handles.reader_make_constant_shell(makeString("scenarioSentence"));

    private static final SubLSymbol $SG_REMOVAL_SCENARIO_SENTENCE = makeKeyword("SG-REMOVAL-SCENARIO-SENTENCE");

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("scenarioSentence")), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("scenarioSentence")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("SG-REMOVAL-SCENARIO-SENTENCE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$scenarioSentence <formula>) where <formula> is asserted in some \n    relevant #$ScenarioContext. That is, asserted in a scenario context\n    that can be seen by the current context. The most general relevant\n    scenario context is always the seed context.") });

    private static final SubLSymbol SG_RELEVANT_SCENARIO_CONTEXT = makeSymbol("SG-RELEVANT-SCENARIO-CONTEXT");









    public static final SubLObject $$PhysicalSituation = constant_handles.reader_make_constant_shell(makeString("PhysicalSituation"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));



    // // Initializers
    public void declareFunctions() {
        declare_sg_removal_modules_file();
    }

    public void initializeVariables() {
        init_sg_removal_modules_file();
    }

    public void runTopLevelForms() {
        setup_sg_removal_modules_file();
    }
}

