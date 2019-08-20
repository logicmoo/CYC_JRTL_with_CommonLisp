package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.ghl_search_utilities;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.tva_cache;
import com.cyc.cycjava.cycl.tva_inference;
import com.cyc.cycjava.cycl.tva_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_tva_lookup extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "a4bf4eba6f3dcd25ad6dc2dd78d119bd383d44e9a9c3fda926c016de1edfcca2";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 900L)
    private static SubLSymbol $tva_unify_default_preference$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 1200L)
    private static SubLSymbol $tva_pos_preference_skip_tva_applicable_to_some_bindable_argP$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 11400L)
    private static SubLSymbol $tva_use_recursive_hl_forward_mtsP$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 16900L)
    private static SubLSymbol $default_tva_check_cost$;
    private static SubLSymbol $DISPREFERRED;
    private static SubLSymbol $TVA_POS;
    private static SubLList $list2;
    private static SubLSymbol $REMOVAL_TVA_CHECK;
    private static SubLSymbol $REMOVAL_TVA_UNIFY;
    private static SubLSymbol $REMOVAL_TVA_UNIFY_CLOSURE;
    private static SubLSymbol $NONE;
    private static SubLSymbol $PREFERRED;
    private static SubLList $list8;
    private static SubLList $list9;
    private static SubLSymbol $GROSSLY_DISPREFERRED;
    private static SubLSymbol $TACTICAL;
    private static SubLSymbol $ALL;
    private static SubLSymbol $IGNORE;
    private static SubLSymbol $POS;
    private static SubLSymbol $QUERY;
    private static SubLSymbol $GENLPREDS;
    private static SubLSymbol $TRANSITIVITY;
    private static SubLSymbol $GAF_ARG;
    private static SubLSymbol $GAF;
    private static SubLSymbol $PREDICATE_EXTENT;
    private static SubLSymbol $OVERLAP;
    private static SubLSymbol $sym22$ATOMIC_SENTENCE_VALID_WRT_IRREFLEXIVITY_;
    private static SubLSymbol $sym23$FULLY_BOUND_P;
    private static SubLSymbol $NEG;
    private static SubLSymbol $sym25$TVA_ANSWER_JUSTIFICATION_BETTER_;
    private static SubLList $list26;
    private static SubLSymbol $sym27$CYCL_ASSERTED_ASSERTION_;
    private static SubLSymbol $sym28$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED;
    private static SubLSymbol $sym29$HLMT_EQUAL;
    private static SubLSymbol $CODE;
    private static SubLSymbol $sym31$SUPPORT_MT;
    private static SubLList $list32;
    private static SubLSymbol $sym33$FIRST;
    private static SubLSymbol $sym34$RELEVANT_MT_IS_ANY_MT;
    private static SubLObject $$InferencePSC;
    private static SubLSymbol $sym36$SECOND;
    private static SubLSymbol $sym37$TVA_MAX_FLOOR_MTS_OF_JUST;
    private static SubLObject $$not;
    private static SubLSymbol $TVA;
    private static SubLSymbol $sym40$FAST_NON_SKOLEM_INDETERMINATE_TERM_;
    private static SubLSymbol $sym41$NON_SKOLEM_INDETERMINATE_TERM_;
    private static SubLList $list42;
    private static SubLSymbol $REMOVAL_TVA_CHECK_NEG;
    private static SubLList $list44;
    private static SubLSymbol $sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT;
    private static SubLInteger $int$2048;
    private static SubLSymbol $sym47$TVA_UNIFY_USEFUL_;
    private static SubLSymbol $DEPTH;
    private static SubLSymbol $STACK;
    private static SubLSymbol $QUEUE;
    private static SubLSymbol $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static SubLSymbol $ERROR;
    private static SubLString $str53$_A_is_not_a__A;
    private static SubLSymbol $sym54$SBHL_TRUE_TV_P;
    private static SubLSymbol $CERROR;
    private static SubLString $str56$continue_anyway;
    private static SubLSymbol $WARN;
    private static SubLString $str58$_A_is_not_a_valid__sbhl_type_erro;
    private static SubLObject $$genlPreds;
    private static SubLObject $$transitiveViaArg;
    private static SubLObject $$conservativeViaArg;
    private static SubLObject $$transitiveViaArgInverse;
    private static SubLObject $$conservativeViaArgInverse;
    private static SubLString $str64$_A_is_neither_SET_P_nor_LISTP_;
    private static SubLString $str65$attempting_to_bind_direction_link;
    private static SubLString $str66$Node__a_does_not_pass_sbhl_type_t;
    private static SubLSymbol $sym67$HL_VARIABLE_P;
    private static SubLList $list68;
    private static SubLList $list69;
    private static SubLList $list70;
    private static SubLList $list71;
    private static SubLList $list72;
    private static SubLSymbol $sym73$_;
    private static SubLSymbol $sym74$TVA_CLOSURE_CRM_ITERATOR_DONE;
    private static SubLSymbol $sym75$TVA_CLOSURE_CRM_ITERATOR_NEXT;
    private static SubLSymbol $sym76$TVA_CLOSURE_CRM_ITERATOR_FINALIZE;
    private static SubLList $list77;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 1200L)
    public static SubLObject tva_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference = inference_datastructures_strategy.strategic_context_inference(strategic_context);
        SubLObject allow_allP = Types.sublisp_null(inference);
        SubLObject check_allowedP = makeBoolean(NIL != allow_allP || NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_modules.find_hl_module_by_name($REMOVAL_TVA_CHECK)));
        SubLObject unify_allowedP = makeBoolean(NIL != allow_allP || NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_modules.find_hl_module_by_name($REMOVAL_TVA_UNIFY)));
        SubLObject unify_closure_allowedP = makeBoolean(NIL != allow_allP || NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_modules.find_hl_module_by_name($REMOVAL_TVA_UNIFY_CLOSURE)));
        if (NIL != inference && $NONE == inference_datastructures_inference.inference_transitive_closure_mode(inference)) {
            unify_closure_allowedP = NIL;
        }
        if (NIL == check_allowedP && NIL == unify_allowedP && NIL == unify_closure_allowedP) {
            return NIL;
        }
        if (NIL == forts.fort_p(cycl_utilities.atomic_sentence_predicate(asent))) {
            return NIL;
        }
        if (NIL == check_allowedP) {
            return $PREFERRED;
        }
        if (NIL != tva_cache.tva_cache_enabled_p() && ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list8) && NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(cycl_utilities.atomic_sentence_predicate(asent), TWO_INTEGER))
                || (NIL != formula_pattern_match.formula_matches_pattern(asent, $list9) && NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(cycl_utilities.atomic_sentence_predicate(asent), ONE_INTEGER)))) {
            return $PREFERRED;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return $PREFERRED;
        }
        if (NIL == $tva_pos_preference_skip_tva_applicable_to_some_bindable_argP$.getDynamicValue(thread) && NIL == tva_applicable_to_some_bindable_argP(asent, bindable_vars)) {
            return NIL;
        }
        if (NIL == removal_tva_unify_required(asent, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == preference_modules.within_generic_preference_analysisP() && NIL == tva_asent_has_fully_bound_argP(asent)) {
            return $GROSSLY_DISPREFERRED;
        }
        if ($TACTICAL == strategic_context) {
            return $DISPREFERRED;
        }
        if (NIL != unify_closure_allowedP && $ALL == inference_datastructures_inference.inference_transitive_closure_mode(inference)) {
            return $PREFERRED;
        }
        if (NIL == unify_allowedP && NIL == unify_closure_allowedP) {
            return $GROSSLY_DISPREFERRED;
        }
        return $tva_unify_default_preference$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 4200L)
    public static SubLObject tva_asent_has_fully_bound_argP(SubLObject asent) {
        SubLObject found_fully_bound_argP = NIL;
        SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = args; NIL == found_fully_bound_argP && NIL != rest; rest = rest.rest()) {
            arg = rest.first();
            if (NIL != variables.fully_bound_p(arg)) {
                found_fully_bound_argP = T;
            }
        }
        return found_fully_bound_argP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 4500L)
    public static SubLObject tva_applicable_to_some_bindable_argP(SubLObject asent, SubLObject bindable_vars) {
        SubLObject applicableP = NIL;
        SubLObject tva_asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject argnum = ZERO_INTEGER;
        SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = args; NIL == applicableP && NIL != rest; rest = rest.rest()) {
            arg = rest.first();
            argnum = Numbers.add(argnum, ONE_INTEGER);
            if (NIL != list_utilities.tree_find_any(bindable_vars, arg, UNPROVIDED, UNPROVIDED) && NIL != tva_utilities.any_tva_for_argP(tva_asent_pred, argnum)) {
                applicableP = argnum;
            }
        }
        return applicableP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 4900L)
    public static SubLObject possible_tva_check_solved_by_other_hl_module(SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != inference_worker.currently_active_problem() && NIL != inference_worker.problem_goodP(inference_worker.currently_active_problem()) && NIL != inference_datastructures_problem.problem_has_some_proofP(inference_worker.currently_active_problem(), UNPROVIDED)
                && $REMOVAL_TVA_CHECK == inference_datastructures_tactic.tactic_hl_module_name(inference_worker.currently_executing_tactic())) {
            result = $QUERY;
        }
        if (NIL == result) {
            SubLObject mt_var = mt;
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = tva_determine_lookup_success(asent, sense);
                if (NIL == result) {
                    if (NIL != tva_determine_genl_preds_success(asent, sense)) {
                        result = $GENLPREDS;
                    } else if (NIL != tva_determine_genl_inverse_success(asent, sense)) {
                        result = $GENLPREDS;
                    } else if (NIL != el_utilities.el_binary_formula_p(asent) && NIL != inference_trampolines.inference_transitive_predicateP(cycl_utilities.atomic_sentence_predicate(asent))
                            && NIL != ghl_search_methods.gt_predicate_relation_p(cycl_utilities.atomic_sentence_predicate(asent), cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), mt, UNPROVIDED, UNPROVIDED)) {
                        result = $TRANSITIVITY;
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 6600L)
    public static SubLObject tva_determine_lookup_success(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, sense);
        SubLObject pcase_var;
        SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            SubLObject argnum = thread.secondMultipleValue();
            SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = result;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$1 = result;
                                    SubLObject token_var_$2 = NIL;
                                    while (NIL == done_var_$1) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                        if (NIL != valid_$3 && NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                                            SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, UNPROVIDED, UNPROVIDED);
                                            if (NIL != v_bindings) {
                                                result = assertion;
                                            }
                                        }
                                        done_var_$1 = makeBoolean(NIL == valid_$3 || NIL != result);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid || NIL != result);
                        }
                    }
                } else {
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = result;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$2 = result;
                                    SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                        if (NIL != valid_$4 && NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                                            SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, UNPROVIDED, UNPROVIDED);
                                            if (NIL != v_bindings) {
                                                result = assertion;
                                            }
                                        }
                                        done_var_$2 = makeBoolean(NIL == valid_$4 || NIL != result);
                                    }
                                } finally {
                                    SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values2 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid || NIL != result);
                        }
                    }
                }
            } else if (NIL != predicate) {
                SubLObject pred_var = predicate;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                    SubLObject done_var = result;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                SubLObject done_var_$3 = result;
                                SubLObject token_var_$4 = NIL;
                                while (NIL == done_var_$3) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                    if (NIL != valid_$5 && NIL != backward_utilities.direction_is_relevant(assertion)) {
                                        SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, UNPROVIDED, UNPROVIDED);
                                        if (NIL != v_bindings) {
                                            result = assertion;
                                        }
                                    }
                                    done_var_$3 = makeBoolean(NIL == valid_$5 || NIL != result);
                                }
                            } finally {
                                SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values3 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid || NIL != result);
                    }
                }
            } else {
                SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                    SubLObject done_var = result;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                SubLObject done_var_$4 = result;
                                SubLObject token_var_$5 = NIL;
                                while (NIL == done_var_$4) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                    if (NIL != valid_$6 && NIL != backward_utilities.direction_is_relevant(assertion)) {
                                        SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, UNPROVIDED, UNPROVIDED);
                                        if (NIL != v_bindings) {
                                            result = assertion;
                                        }
                                    }
                                    done_var_$4 = makeBoolean(NIL == valid_$6 || NIL != result);
                                }
                            } finally {
                                SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values4 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid || NIL != result);
                    }
                }
            }
        } else if (pcase_var.eql($PREDICATE_EXTENT)) {
            SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                SubLObject str = NIL;
                SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind(T, thread);
                    utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                    utilities_macros.noting_progress_preamble(str);
                    SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = result;
                    SubLObject token_var2 = NIL;
                    while (NIL == done_var2) {
                        SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                        if (NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                SubLObject done_var_$5 = result;
                                SubLObject token_var_$6 = NIL;
                                while (NIL == done_var_$5) {
                                    SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                    SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                    if (NIL != valid_$7 && NIL != backward_utilities.direction_is_relevant(assertion2)) {
                                        SubLObject gaf_formula2 = assertions_high.gaf_formula(assertion2);
                                        SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(asent, gaf_formula2, UNPROVIDED, UNPROVIDED);
                                        if (NIL != v_bindings2) {
                                            result = assertion2;
                                        }
                                    }
                                    done_var_$5 = makeBoolean(NIL == valid_$7 || NIL != result);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values5 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        }
                        done_var2 = makeBoolean(NIL == valid2 || NIL != result);
                    }
                    utilities_macros.noting_progress_postamble();
                } finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        } else if (pcase_var.eql($OVERLAP)) {
            SubLObject rest;
            SubLObject assertion3;
            SubLObject gaf_formula3;
            SubLObject v_bindings3;
            for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); NIL == result && NIL != rest; rest = rest.rest()) {
                assertion3 = rest.first();
                if ((NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense))) && NIL != backward_utilities.direction_is_relevant(assertion3)) {
                    gaf_formula3 = assertions_high.gaf_formula(assertion3);
                    v_bindings3 = unification_utilities.gaf_asent_unify(asent, gaf_formula3, UNPROVIDED, UNPROVIDED);
                    if (NIL != v_bindings3) {
                        result = assertion3;
                    }
                }
            }
        } else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 7000L)
    public static SubLObject tva_determine_genl_preds_success(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject obfuscated_asent = removal_modules_genlpreds_lookup.obfuscate_predicate(asent);
        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding(thread);
        SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_pred_relevance(sense), thread);
            control_vars.$inference_literal$.bind(asent, thread);
            control_vars.$inference_sense$.bind(sense, thread);
            SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, enumeration_types.sense_truth(sense), NIL);
            SubLObject pcase_var;
            SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                SubLObject argnum = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$17 = NIL;
                                        SubLObject token_var_$18 = NIL;
                                        while (NIL == done_var_$17) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                            SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(gaf));
                                            if (NIL != valid_$19 && NIL != tva_determine_genl_preds_lookup_int(gaf)) {
                                                successP = T;
                                            }
                                            done_var_$17 = makeBoolean(NIL == valid_$19);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$18 = NIL;
                                        SubLObject token_var_$19 = NIL;
                                        while (NIL == done_var_$18) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                            SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(gaf));
                                            if (NIL != valid_$20 && NIL != tva_determine_genl_preds_lookup_int(gaf)) {
                                                successP = T;
                                            }
                                            done_var_$18 = makeBoolean(NIL == valid_$20);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values2 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (NIL != predicate) {
                    SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$19 = NIL;
                                    SubLObject token_var_$20 = NIL;
                                    while (NIL == done_var_$19) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                        SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(gaf));
                                        if (NIL != valid_$21 && NIL != tva_determine_genl_preds_lookup_int(gaf)) {
                                            successP = T;
                                        }
                                        done_var_$19 = makeBoolean(NIL == valid_$21);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values3 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                } else {
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$20 = NIL;
                                    SubLObject token_var_$21 = NIL;
                                    while (NIL == done_var_$20) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                                        SubLObject valid_$22 = makeBoolean(!token_var_$21.eql(gaf));
                                        if (NIL != valid_$22 && NIL != tva_determine_genl_preds_lookup_int(gaf)) {
                                            successP = T;
                                        }
                                        done_var_$20 = makeBoolean(NIL == valid_$22);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values4 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                }
            } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_0_$24 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_1_$34 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_2_$35 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$21 = NIL;
                                    SubLObject token_var_$22 = NIL;
                                    while (NIL == done_var_$21) {
                                        SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$22);
                                        SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(gaf2));
                                        if (NIL != valid_$23 && NIL != tva_determine_genl_preds_lookup_int(gaf2)) {
                                            successP = T;
                                        }
                                        done_var_$21 = makeBoolean(NIL == valid_$23);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values5 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$35, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$34, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            } else if (pcase_var.eql($OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                SubLObject gaf3 = NIL;
                gaf3 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(gaf3, enumeration_types.sense_truth(sense))) && NIL != tva_determine_genl_preds_lookup_int(gaf3)) {
                        successP = T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            } else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        } finally {
            control_vars.$inference_sense$.rebind(_prev_bind_3, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 7500L)
    public static SubLObject tva_determine_genl_preds_lookup_int(SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject assertion_literal = assertions_high.gaf_formula(assertion);
            SubLObject ass_pred = el_utilities.literal_predicate(assertion_literal, UNPROVIDED);
            SubLObject inf_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), UNPROVIDED);
            if (!ass_pred.eql(inf_pred)) {
                SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(control_vars.$inference_literal$.getDynamicValue(thread), assertion_literal, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    successP = T;
                }
            }
        }
        return successP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 8000L)
    public static SubLObject tva_determine_genl_inverse_success(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        if (NIL != el_utilities.el_binary_formula_p(asent)) {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject obfuscated_asent = removal_modules_genlpreds_lookup.obfuscate_predicate(removal_modules_symmetry.symmetric_asent(asent));
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding(thread);
            SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_inverse_relevance(sense), thread);
                control_vars.$inference_literal$.bind(asent, thread);
                control_vars.$inference_sense$.bind(sense, thread);
                SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, enumeration_types.sense_truth(sense), NIL);
                SubLObject pcase_var;
                SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                    SubLObject argnum = thread.secondMultipleValue();
                    SubLObject predicate = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != argnum) {
                        if (NIL != predicate) {
                            SubLObject pred_var = predicate;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$40 = NIL;
                                            SubLObject token_var_$41 = NIL;
                                            while (NIL == done_var_$40) {
                                                SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                                SubLObject valid_$42 = makeBoolean(!token_var_$41.eql(gaf));
                                                if (NIL != valid_$42 && NIL != tva_determine_genl_inverse_lookup_int(gaf)) {
                                                    successP = T;
                                                }
                                                done_var_$40 = makeBoolean(NIL == valid_$42);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        } else {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$41 = NIL;
                                            SubLObject token_var_$42 = NIL;
                                            while (NIL == done_var_$41) {
                                                SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                                                SubLObject valid_$43 = makeBoolean(!token_var_$42.eql(gaf));
                                                if (NIL != valid_$43 && NIL != tva_determine_genl_inverse_lookup_int(gaf)) {
                                                    successP = T;
                                                }
                                                done_var_$41 = makeBoolean(NIL == valid_$43);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values2 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        }
                    } else if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$42 = NIL;
                                        SubLObject token_var_$43 = NIL;
                                        while (NIL == done_var_$42) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                            SubLObject valid_$44 = makeBoolean(!token_var_$43.eql(gaf));
                                            if (NIL != valid_$44 && NIL != tva_determine_genl_inverse_lookup_int(gaf)) {
                                                successP = T;
                                            }
                                            done_var_$42 = makeBoolean(NIL == valid_$44);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values3 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$43 = NIL;
                                        SubLObject token_var_$44 = NIL;
                                        while (NIL == done_var_$43) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                            SubLObject valid_$45 = makeBoolean(!token_var_$44.eql(gaf));
                                            if (NIL != valid_$45 && NIL != tva_determine_genl_inverse_lookup_int(gaf)) {
                                                successP = T;
                                            }
                                            done_var_$43 = makeBoolean(NIL == valid_$45);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values4 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values4);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                    SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        SubLObject str = NIL;
                        SubLObject _prev_bind_0_$47 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        SubLObject _prev_bind_1_$57 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        SubLObject _prev_bind_2_$58 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind(T, thread);
                            utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                            utilities_macros.noting_progress_preamble(str);
                            SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$44 = NIL;
                                        SubLObject token_var_$45 = NIL;
                                        while (NIL == done_var_$44) {
                                            SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$45);
                                            SubLObject valid_$46 = makeBoolean(!token_var_$45.eql(gaf2));
                                            if (NIL != valid_$46 && NIL != tva_determine_genl_inverse_lookup_int(gaf2)) {
                                                successP = T;
                                            }
                                            done_var_$44 = makeBoolean(NIL == valid_$46);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values5 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values5);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            }
                            utilities_macros.noting_progress_postamble();
                        } finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$58, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$57, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$47, thread);
                        }
                    }
                } else if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject gaf3 = NIL;
                    gaf3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(gaf3, enumeration_types.sense_truth(sense))) && NIL != tva_determine_genl_inverse_lookup_int(gaf3)) {
                            successP = T;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        gaf3 = cdolist_list_var.first();
                    }
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }
            } finally {
                control_vars.$inference_sense$.rebind(_prev_bind_3, thread);
                control_vars.$inference_literal$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        }
        return successP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 8500L)
    public static SubLObject tva_determine_genl_inverse_lookup_int(SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject assertion_literal = assertions_high.gaf_formula(assertion);
            SubLObject ass_pred = el_utilities.literal_predicate(assertion_literal, UNPROVIDED);
            SubLObject inf_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), UNPROVIDED);
            if (!ass_pred.eql(inf_pred)) {
                SubLObject symmetric_literal = removal_modules_symmetry.symmetric_literal(control_vars.$inference_literal$.getDynamicValue(thread));
                SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(symmetric_literal, assertion_literal, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    successP = T;
                }
            }
        }
        return successP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 9100L)
    public static SubLObject atomic_sentence_valid_wrt_irreflexivityP(SubLObject asent) {
        return arguments_valid_wrt_irreflexivityP(cycl_utilities.atomic_sentence_predicate(asent), cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 9400L)
    public static SubLObject arguments_valid_wrt_irreflexivityP(SubLObject pred, SubLObject arg1, SubLObject arg2) {
        return makeBoolean(NIL == fort_types_interface.irreflexive_binary_predicate_p(pred) || NIL == equals.equalsP(arg1, arg2, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 9600L)
    public static SubLObject tva_check(SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        assert NIL != variables.fully_bound_p(asent) : asent;
        return list_utilities.sublisp_boolean(tva_inference.tva_unify(asent, mt, T, NIL, $NONE, T, Equality.eq(sense, $NEG)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 10000L)
    public static SubLObject tva_justify(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != variables.fully_bound_p(asent) : asent;
        SubLObject sense = NIL;
        if (NIL != cycl_utilities.negatedP(asent)) {
            sense = $NEG;
            asent = cycl_utilities.negate(asent);
        }
        SubLObject answers = tva_inference.tva_unify(asent, mt, NIL, T, NIL, NIL, Equality.eq(sense, $NEG));
        if (NIL != answers) {
            SubLObject current;
            SubLObject datum = current = Sort.sort(answers, $sym25$TVA_ANSWER_JUSTIFICATION_BETTER_, UNPROVIDED).first();
            SubLObject v_bindings = NIL;
            SubLObject supports = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list26);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list26);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                return supports;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, $list26);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 10600L)
    public static SubLObject tva_answer_justification_betterP(SubLObject answer1, SubLObject answer2) {
        SubLObject just1 = conses_high.second(answer1);
        SubLObject just2 = conses_high.second(answer2);
        SubLObject just1_count = Sequences.length(just1);
        SubLObject just2_count = Sequences.length(just2);
        SubLObject just1_asserted_ass_count = Sequences.length(list_utilities.find_all_if($sym27$CYCL_ASSERTED_ASSERTION_, just1, UNPROVIDED));
        SubLObject just2_asserted_ass_count = Sequences.length(list_utilities.find_all_if($sym27$CYCL_ASSERTED_ASSERTION_, just2, UNPROVIDED));
        if (just1_asserted_ass_count.numG(just2_asserted_ass_count)) {
            return T;
        }
        if (just1_asserted_ass_count.numL(just2_asserted_ass_count)) {
            return NIL;
        }
        if (just1_count.numL(just2_count)) {
            return T;
        }
        if (just1_count.numG(just2_count)) {
            return NIL;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 11600L)
    public static SubLObject tva_max_floor_mts_of_just(SubLObject just) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_lists = NIL;
        SubLObject cdolist_list_var = just;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(support)) {
                mt_lists = cons(list(assertions_high.assertion_mt(support)), mt_lists);
            } else if (NIL != arguments.hl_support_p(support)) {
                SubLObject new_mts = NIL;
                if (NIL != $tva_use_recursive_hl_forward_mtsP$.getDynamicValue(thread)) {
                    new_mts = new_tva_support_mts_for_support(support);
                } else {
                    new_mts = legacy_tva_support_mts_for_support(support);
                }
                if (NIL != new_mts) {
                    mt_lists = cons(new_mts, mt_lists);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Sequences.remove(NIL, list_utilities.union_all(Mapping.mapcar($sym28$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED, list_utilities.cross_products(mt_lists)), $sym29$HLMT_EQUAL, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 12800L)
    public static SubLObject new_tva_support_mts_for_support(SubLObject support) {
        return ($CODE == arguments.support_module(support)) ? NIL : Mapping.mapcar($sym31$SUPPORT_MT, hl_supports.hl_forward_mt_combos(support));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 13000L)
    public static SubLObject legacy_tva_support_mts_for_support(SubLObject support) {
        SubLObject new_mts = NIL;
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list32);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list32);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list32);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list32);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject pred = cycl_utilities.atomic_sentence_arg(asent, ZERO_INTEGER, UNPROVIDED);
            if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
                SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED);
                new_mts = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(module, arg1, arg2, UNPROVIDED);
            } else if (NIL != kb_accessors.transitive_predicateP(pred)) {
                SubLObject arg3 = cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
                SubLObject arg4 = cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED);
                new_mts = gt_methods.gt_superior_in_what_mts(pred, arg3, arg4);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(support, $list32);
        }
        return new_mts;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14000L)
    public static SubLObject inference_tva_check(SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        SubLObject result = NIL;
        if (NIL == possible_tva_check_solved_by_other_hl_module(asent, mt, sense)) {
            result = tva_check(asent, mt, sense);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14300L)
    public static SubLObject inference_tva_unify(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        SubLObject tva_unification = tva_inference.tva_unify(asent, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != tva_unification) {
            result = Mapping.mapcar(Symbols.symbol_function($sym33$FIRST), tva_unification);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14600L)
    public static SubLObject inference_tva_justify(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        result = tva_justify(asent, mt);
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14900L)
    public static SubLObject inference_tva_max_floor_mts(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid_mts = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym34$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject all_justs = Mapping.mapcar(Symbols.symbol_function($sym36$SECOND), tva_inference.tva_unify(asent, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject all_max_floors = Mapping.mapcar($sym37$TVA_MAX_FLOOR_MTS_OF_JUST, all_justs);
            valid_mts = list_utilities.union_all(all_max_floors, $sym29$HLMT_EQUAL, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return valid_mts;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 15300L)
    public static SubLObject make_tva_support(SubLObject literal, SubLObject sense, SubLObject mt) {
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject support_sentence = (sense == $NEG) ? list($$not, literal) : literal;
        SubLObject other_hl_module_or_support = possible_tva_check_solved_by_other_hl_module(literal, mt, sense);
        if (NIL != assertion_handles.assertion_p(other_hl_module_or_support)) {
            if (NIL != fort_types_interface.transitive_binary_predicate_p(cycl_utilities.atomic_sentence_predicate(literal))) {
                return arguments.make_hl_support($TRANSITIVITY, support_sentence, mt, UNPROVIDED);
            }
            return other_hl_module_or_support;
        } else {
            if (NIL != arguments.support_p(other_hl_module_or_support)) {
                return other_hl_module_or_support;
            }
            if (NIL != hl_supports.hl_support_module_p(other_hl_module_or_support)) {
                return arguments.make_hl_support(other_hl_module_or_support, support_sentence, mt, UNPROVIDED);
            }
            return arguments.make_hl_support($TVA, support_sentence, mt, UNPROVIDED);
        }
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 16300L)
    public static SubLObject removal_tva_required(SubLObject asent) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean(NIL != forts.fort_p(predicate) && (NIL != tva_utilities.some_tva_for_predicate(predicate) || NIL != tva_utilities.some_cva_for_predicate(predicate)) && NIL == list_utilities.tree_find_if($sym40$FAST_NON_SKOLEM_INDETERMINATE_TERM_, asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 16700L)
    public static SubLObject removal_tva_check_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_tva_required(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 16900L)
    public static SubLObject removal_tva_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL == cycl_utilities.expression_find_if($sym41$NON_SKOLEM_INDETERMINATE_TERM_, asent, UNPROVIDED, UNPROVIDED) && (NIL != mt_relevance_macros.all_mts_are_relevantP() || NIL != mt_relevance_macros.any_mt_is_relevantP() || NIL != wff.el_wff_assertibleP(asent, UNPROVIDED, UNPROVIDED))
                && NIL != inference_tva_check(asent, NIL, sense)) {
            SubLObject hl_support = make_tva_support(asent, sense, UNPROVIDED);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19100L)
    public static SubLObject removal_tva_unify_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean(NIL != removal_tva_unify_required_int(asent, UNPROVIDED) && NIL != tva_unify_usefulP(asent));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19400L)
    public static SubLObject removal_tva_unify_required_int_internal(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean(NIL != removal_tva_required(asent) && NIL != no_nested_variables_p(asent) && NIL == el_utilities.ist_sentence_p(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19400L)
    public static SubLObject removal_tva_unify_required_int(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_tva_unify_required_int_internal(asent, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT, TWO_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(asent, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(removal_tva_unify_required_int_internal(asent, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19600L)
    public static SubLObject tva_unify_usefulP_internal(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tva_asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject tva_term_argnums = tva_inference.determine_term_argnums(asent);
        SubLObject found_use_for_unifyP = tva_unify_from_cache_possibleP(asent);
        if (NIL == found_use_for_unifyP) {
            SubLObject node_var = tva_asent_pred;
            SubLObject deck_type = $QUEUE;
            SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject tv_var = NIL;
                    SubLObject _prev_bind_0_$63 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str53$_A_is_not_a__A, tv_var, $sym54$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str56$continue_anyway, $str53$_A_is_not_a__A, tv_var, $sym54$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else if (pcase_var.eql($WARN)) {
                                Errors.warn($str53$_A_is_not_a__A, tv_var, $sym54$SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($str56$continue_anyway, $str53$_A_is_not_a__A, tv_var, $sym54$SBHL_TRUE_TV_P);
                            }
                        }
                        SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        SubLObject _prev_bind_1_$65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_asent_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                SubLObject _prev_bind_1_$66 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                SubLObject _prev_bind_2_$68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    for (node_and_predicate_mode = list(tva_asent_pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode && NIL == found_use_for_unifyP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        SubLObject node_var_$69 = node_and_predicate_mode.first();
                                        SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        SubLObject pred = node_var_$69;
                                        SubLObject _prev_bind_0_$66 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            SubLObject inverse_modeP = predicate_mode;
                                            if (NIL == found_use_for_unifyP) {
                                                SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                                                SubLObject tva_pred = NIL;
                                                tva_pred = csome_list_var.first();
                                                while (NIL == found_use_for_unifyP && NIL != csome_list_var) {
                                                    if (NIL == found_use_for_unifyP) {
                                                        SubLObject csome_list_var_$71 = tva_term_argnums;
                                                        SubLObject argnum = NIL;
                                                        argnum = csome_list_var_$71.first();
                                                        while (NIL == found_use_for_unifyP && NIL != csome_list_var_$71) {
                                                            SubLObject trans_preds = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, pred, argnum, inverse_modeP, UNPROVIDED);
                                                            if (NIL == found_use_for_unifyP) {
                                                                SubLObject csome_list_var_$72 = trans_preds;
                                                                SubLObject trans_pred = NIL;
                                                                trans_pred = csome_list_var_$72.first();
                                                                while (NIL == found_use_for_unifyP && NIL != csome_list_var_$72) {
                                                                    SubLObject _prev_bind_0_$67 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
                                                                    try {
                                                                        gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
                                                                        SubLObject arg = cycl_utilities.atomic_sentence_arg(asent, argnum, UNPROVIDED);
                                                                        SubLObject pcase_var2 = tva_pred;
                                                                        if (pcase_var2.eql($$transitiveViaArg) || pcase_var2.eql($$conservativeViaArg)) {
                                                                            if (ZERO_INTEGER.numL(ghl_search_utilities.ghl_inverse_cardinality(trans_pred, arg))) {
                                                                                found_use_for_unifyP = T;
                                                                            }
                                                                        } else if ((pcase_var2.eql($$transitiveViaArgInverse) || pcase_var2.eql($$conservativeViaArgInverse)) && ZERO_INTEGER.numL(ghl_search_utilities.ghl_predicate_cardinality(trans_pred, arg))) {
                                                                            found_use_for_unifyP = T;
                                                                        }
                                                                    } finally {
                                                                        gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0_$67, thread);
                                                                    }
                                                                    csome_list_var_$72 = csome_list_var_$72.rest();
                                                                    trans_pred = csome_list_var_$72.first();
                                                                }
                                                            }
                                                            csome_list_var_$71 = csome_list_var_$71.rest();
                                                            argnum = csome_list_var_$71.first();
                                                        }
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    tva_pred = csome_list_var.first();
                                                }
                                            }
                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$68;
                                            SubLObject _prev_bind_1_$67;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$69;
                                            SubLObject iteration_state_$77;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$70;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$79;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$71;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var3;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; NIL == found_use_for_unifyP && NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$68 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                            (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var_$69);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == found_use_for_unifyP
                                                                        && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$77 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == found_use_for_unifyP
                                                                                    && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$77); iteration_state_$77 = dictionary_contents.do_dictionary_contents_next(iteration_state_$77)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$77);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == found_use_for_unifyP
                                                                                                    && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else if (sol.isList()) {
                                                                                            if (NIL == found_use_for_unifyP) {
                                                                                                csome_list_var2 = sol;
                                                                                                node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                while (NIL == found_use_for_unifyP && NIL != csome_list_var2) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str64$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$70, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$77);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$69, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str65$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                ? list_utilities.randomize_list(
                                                                        sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                        for (rest_$79 = NIL, rest_$79 = new_list; NIL == found_use_for_unifyP && NIL != rest_$79; rest_$79 = rest_$79.rest()) {
                                                            generating_fn = rest_$79.first();
                                                            _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == found_use_for_unifyP
                                                                            && NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else if (sol2.isList()) {
                                                                    if (NIL == found_use_for_unifyP) {
                                                                        csome_list_var3 = sol2;
                                                                        node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                        while (NIL == found_use_for_unifyP && NIL != csome_list_var3) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                } else {
                                                                    Errors.error($str64$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$71, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$67, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$68, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$66, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$68, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$66, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$65, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str66$Node__a_does_not_pass_sbhl_type_t, tva_asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$65, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$64, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$63, thread);
                    }
                } finally {
                    SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return found_use_for_unifyP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19600L)
    public static SubLObject tva_unify_usefulP(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return tva_unify_usefulP_internal(asent);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym47$TVA_UNIFY_USEFUL_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym47$TVA_UNIFY_USEFUL_, ONE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym47$TVA_UNIFY_USEFUL_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(tva_unify_usefulP_internal(asent)));
            memoization_state.caching_state_put(caching_state, asent, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 21000L)
    public static SubLObject tva_unify_from_cache_possibleP(SubLObject asent) {
        SubLObject arg0 = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject cachedP = NIL;
        SubLObject index_argnum = ZERO_INTEGER;
        SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
        SubLObject rest;
        SubLObject index_arg;
        for (rest = NIL, rest = args; NIL == cachedP && NIL != rest; cachedP = makeBoolean(NIL != variables.fully_bound_p(index_arg) && NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(arg0, index_argnum)), rest = rest.rest()) {
            index_arg = rest.first();
            index_argnum = Numbers.add(index_argnum, ONE_INTEGER);
        }
        return cachedP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 21400L)
    public static SubLObject no_nested_variables_p(SubLObject asent) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = cycl_utilities.formula_args(asent, UNPROVIDED);
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while (NIL == foundP && NIL != csome_list_var) {
                if (NIL == cycl_grammar.hl_variable_p(arg) && NIL != list_utilities.sublisp_boolean(list_utilities.tree_gather(arg, $sym67$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    foundP = T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        return makeBoolean(NIL == foundP);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 21700L)
    public static SubLObject removal_tva_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tva_asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject cdolist_list_var;
        SubLObject tva_term_argnums = cdolist_list_var = tva_inference.determine_term_argnums(asent);
        SubLObject tva_term_argnum = NIL;
        tva_term_argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == tva_utilities.any_tva_for_argP(tva_asent_pred, tva_term_argnum)) {
                SubLObject v_term = cycl_utilities.sentence_arg(asent, tva_term_argnum, UNPROVIDED);
                SubLObject fast_total = ZERO_INTEGER;
                SubLObject node_var = tva_asent_pred;
                SubLObject deck_type = $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject tv_var = NIL;
                        SubLObject _prev_bind_0_$82 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str53$_A_is_not_a__A, tv_var, $sym54$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str56$continue_anyway, $str53$_A_is_not_a__A, tv_var, $sym54$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($WARN)) {
                                    Errors.warn($str53$_A_is_not_a__A, tv_var, $sym54$SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str56$continue_anyway, $str53$_A_is_not_a__A, tv_var, $sym54$SBHL_TRUE_TV_P);
                                }
                            }
                            SubLObject _prev_bind_0_$83 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            SubLObject _prev_bind_1_$84 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_asent_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                    SubLObject _prev_bind_0_$84 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_1_$85 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_$87 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        for (node_and_predicate_mode = list(tva_asent_pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            SubLObject node_var_$88 = node_and_predicate_mode.first();
                                            SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            SubLObject pred = node_var_$88;
                                            SubLObject _prev_bind_0_$85 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                SubLObject inverse_modeP = predicate_mode;
                                                if (NIL != cycl_grammar.cycl_represented_term_p(v_term)) {
                                                    fast_total = Numbers.add(fast_total, kb_indexing.num_gaf_arg_index(v_term, tva_term_argnum, pred, UNPROVIDED));
                                                }
                                                SubLObject cdolist_list_var_$90;
                                                SubLObject accessible_modules = cdolist_list_var_$90 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var_$90.first();
                                                while (NIL != cdolist_list_var_$90) {
                                                    SubLObject _prev_bind_0_$86 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_$86 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        SubLObject node = function_terms.naut_to_nart(node_var_$88);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                            iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            SubLObject _prev_bind_0_$87 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$94;
                                                                                for (iteration_state_$94 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                        iteration_state_$94); iteration_state_$94 = dictionary_contents.do_dictionary_contents_next(iteration_state_$94)) {
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$94);
                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        SubLObject _prev_bind_0_$88 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object,
                                                                                                        set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str64$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$88, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$94);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$87, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str65$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$91;
                                                            SubLObject new_list = cdolist_list_var_$91 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                    ? list_utilities.randomize_list(
                                                                            sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$91.first();
                                                            while (NIL != cdolist_list_var_$91) {
                                                                SubLObject _prev_bind_0_$89 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    SubLObject sol2;
                                                                    SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2,
                                                                                set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    } else {
                                                                        Errors.error($str64$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$89, thread);
                                                                }
                                                                cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                                generating_fn = cdolist_list_var_$91.first();
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$86, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$86, thread);
                                                    }
                                                    cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                                                    module_var = cdolist_list_var_$90.first();
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$85, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$87, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$85, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$84, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str66$Node__a_does_not_pass_sbhl_type_t, tva_asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$84, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$83, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$82, thread);
                        }
                    } finally {
                        SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
                if (fast_total.numG(ZERO_INTEGER)) {
                    return fast_total;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tva_term_argnum = cdolist_list_var.first();
        }
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = tva_term_argnums;
        SubLObject argnum = NIL;
        argnum = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject spec_preds = NIL;
            SubLObject inverse_preds = NIL;
            SubLObject node_var2 = tva_asent_pred;
            SubLObject deck_type2 = $QUEUE;
            SubLObject recur_deck2 = deck.create_deck(deck_type2);
            SubLObject node_and_predicate_mode2 = NIL;
            SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject tv_var2 = NIL;
                    SubLObject _prev_bind_0_$91 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    SubLObject _prev_bind_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var2) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var2) ? $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (NIL != tv_var2 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                            SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var2.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str53$_A_is_not_a__A, tv_var2, $sym54$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else if (pcase_var2.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str56$continue_anyway, $str53$_A_is_not_a__A, tv_var2, $sym54$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else if (pcase_var2.eql($WARN)) {
                                Errors.warn($str53$_A_is_not_a__A, tv_var2, $sym54$SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($str56$continue_anyway, $str53$_A_is_not_a__A, tv_var2, $sym54$SBHL_TRUE_TV_P);
                            }
                        }
                        SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        SubLObject _prev_bind_1_$87 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        SubLObject _prev_bind_8 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        SubLObject _prev_bind_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        SubLObject _prev_bind_10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_asent_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                SubLObject _prev_bind_0_$93 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                SubLObject _prev_bind_1_$88 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                SubLObject _prev_bind_2_$88 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var2, UNPROVIDED);
                                    for (node_and_predicate_mode2 = list(tva_asent_pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode2; node_and_predicate_mode2 = deck.deck_pop(recur_deck2)) {
                                        SubLObject node_var_$89 = node_and_predicate_mode2.first();
                                        SubLObject predicate_mode2 = conses_high.second(node_and_predicate_mode2);
                                        SubLObject pred2 = node_var_$89;
                                        SubLObject _prev_bind_0_$94 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode2, thread);
                                            SubLObject inverse_modeP2 = predicate_mode2;
                                            SubLObject csome_list_var3 = tva_utilities.get_tva_predicates();
                                            SubLObject tva_pred = NIL;
                                            tva_pred = csome_list_var3.first();
                                            while (NIL != csome_list_var3) {
                                                SubLObject cdolist_list_var_$92;
                                                SubLObject trans_preds = cdolist_list_var_$92 = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, pred2, argnum, inverse_modeP2, UNPROVIDED);
                                                SubLObject trans_pred = NIL;
                                                trans_pred = cdolist_list_var_$92.first();
                                                while (NIL != cdolist_list_var_$92) {
                                                    if (!makeBoolean(NIL == inverse_modeP2).eql(makeBoolean(NIL == subl_promotions.memberP(tva_pred, $list68, UNPROVIDED, UNPROVIDED)))) {
                                                        inverse_preds = cons(trans_pred, inverse_preds);
                                                    } else {
                                                        spec_preds = cons(trans_pred, spec_preds);
                                                    }
                                                    cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                    trans_pred = cdolist_list_var_$92.first();
                                                }
                                                csome_list_var3 = csome_list_var3.rest();
                                                tva_pred = csome_list_var3.first();
                                            }
                                            SubLObject cdolist_list_var_$93;
                                            SubLObject accessible_modules = cdolist_list_var_$93 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var_$93.first();
                                            while (NIL != cdolist_list_var_$93) {
                                                SubLObject _prev_bind_0_$95 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                SubLObject _prev_bind_1_$89 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                            (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    SubLObject node = function_terms.naut_to_nart(node_var_$89);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                        iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$95;
                                                                            for (iteration_state_$95 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                    iteration_state_$95); iteration_state_$95 = dictionary_contents.do_dictionary_contents_next(iteration_state_$95)) {
                                                                                thread.resetMultipleValues();
                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$95);
                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    SubLObject _prev_bind_0_$97 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object,
                                                                                                    set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck2);
                                                                                                }
                                                                                            }
                                                                                        } else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck2);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str64$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$97, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$95);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$96, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str65$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$94;
                                                        SubLObject new_list = cdolist_list_var_$94 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                ? list_utilities.randomize_list(
                                                                        sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$94.first();
                                                        while (NIL != cdolist_list_var_$94) {
                                                            SubLObject _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                SubLObject sol2;
                                                                SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2,
                                                                            set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck2);
                                                                        }
                                                                    }
                                                                } else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck2);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                } else {
                                                                    Errors.error($str64$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$98, thread);
                                                            }
                                                            cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                                                            generating_fn = cdolist_list_var_$94.first();
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$89, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$95, thread);
                                                }
                                                cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                                                module_var = cdolist_list_var_$93.first();
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$94, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$88, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$88, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$93, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str66$Node__a_does_not_pass_sbhl_type_t, tva_asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_10, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_9, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_8, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$87, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$92, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$91, thread);
                    }
                } finally {
                    SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_6, thread);
            }
            _prev_bind_6 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
            try {
                gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
                SubLObject arg = cycl_utilities.atomic_sentence_arg(asent, argnum, UNPROVIDED);
                SubLObject cdolist_list_var_$95 = genl_predicates.min_predicates(spec_preds, UNPROVIDED, UNPROVIDED);
                SubLObject trans_pred2 = NIL;
                trans_pred2 = cdolist_list_var_$95.first();
                while (NIL != cdolist_list_var_$95) {
                    total = Numbers.add(total, ghl_search_utilities.ghl_inverse_cardinality(trans_pred2, arg));
                    cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                    trans_pred2 = cdolist_list_var_$95.first();
                }
                SubLObject cdolist_list_var_$96 = genl_predicates.max_predicates(inverse_preds, UNPROVIDED, UNPROVIDED);
                trans_pred2 = NIL;
                trans_pred2 = cdolist_list_var_$96.first();
                while (NIL != cdolist_list_var_$96) {
                    total = Numbers.add(total, ghl_search_utilities.ghl_predicate_cardinality(trans_pred2, arg));
                    cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                    trans_pred2 = cdolist_list_var_$96.first();
                }
            } finally {
                gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_6, thread);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            argnum = cdolist_list_var2.first();
        }
        return total;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 23600L)
    public static SubLObject removal_tva_unify_iterator(SubLObject asent) {
        return iteration.new_list_iterator(inference_tva_unify(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 25000L)
    public static SubLObject removal_tva_unify_closure_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject inference = inference_macros.current_controlling_inference();
        return makeBoolean(NIL != inference_datastructures_inference.inference_p(inference) && $NONE != inference_datastructures_inference.inference_transitive_closure_mode(inference) && NIL != removal_tva_unify_required_int(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 25400L)
    public static SubLObject removal_tva_unify_closure_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject basic_tva_estimate = removal_tva_unify_cost(asent, sense);
        SubLObject trans_coefficient = ZERO_INTEGER;
        if (!basic_tva_estimate.isZero()) {
            SubLObject csome_list_var = tva_utilities.get_tva_predicates();
            SubLObject tva_pred = NIL;
            tva_pred = csome_list_var.first();
            while (NIL != csome_list_var) {
                SubLObject pred_var = tva_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(asent_pred, ONE_INTEGER, pred_var)) {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(asent_pred, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$119 = NIL;
                                SubLObject token_var_$120 = NIL;
                                while (NIL == done_var_$119) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$120);
                                    SubLObject valid_$121 = makeBoolean(!token_var_$120.eql(assertion));
                                    if (NIL != valid_$121) {
                                        trans_coefficient = Numbers.add(trans_coefficient, kb_indexing.relevant_num_predicate_extent_index(assertions_high.gaf_arg2(assertion)));
                                    }
                                    done_var_$119 = makeBoolean(NIL == valid_$121);
                                }
                            } finally {
                                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                }
                csome_list_var = csome_list_var.rest();
                tva_pred = csome_list_var.first();
            }
        }
        SubLObject cost_estimate = Numbers.add(basic_tva_estimate, Numbers.multiply(basic_tva_estimate, trans_coefficient));
        SubLObject cardinality_estimate = NIL;
        if (NIL == sksi_query_utilities.some_sksi_removal_module_registeredP()) {
            SubLObject var_argnums = dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED);
            SubLObject argnum = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                argnum = Numbers.add(argnum, ONE_INTEGER);
                if (NIL != cycl_grammar.hl_variable_p(arg)) {
                    dictionary_utilities.dictionary_push(var_argnums, arg, argnum);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_argnums)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                SubLObject argnums = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject var_cardinality_estimate = NIL;
                SubLObject cdolist_list_var2 = argnums;
                SubLObject argnum2 = NIL;
                argnum2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$122 = kb_accessors.argn_isa(asent_pred, argnum2, UNPROVIDED);
                    SubLObject arg_isa = NIL;
                    arg_isa = cdolist_list_var_$122.first();
                    while (NIL != cdolist_list_var_$122) {
                        if (NIL != var_cardinality_estimate) {
                            var_cardinality_estimate = Numbers.min(var_cardinality_estimate, cardinality_estimates.instance_cardinality(arg_isa));
                        } else {
                            var_cardinality_estimate = cardinality_estimates.instance_cardinality(arg_isa);
                        }
                        cdolist_list_var_$122 = cdolist_list_var_$122.rest();
                        arg_isa = cdolist_list_var_$122.first();
                    }
                    SubLObject cdolist_list_var_$123 = kb_accessors.argn_genl(asent_pred, argnum2, UNPROVIDED);
                    SubLObject arg_genl = NIL;
                    arg_genl = cdolist_list_var_$123.first();
                    while (NIL != cdolist_list_var_$123) {
                        if (NIL != var_cardinality_estimate) {
                            var_cardinality_estimate = Numbers.min(var_cardinality_estimate, cardinality_estimates.spec_cardinality(arg_genl));
                        } else {
                            var_cardinality_estimate = cardinality_estimates.spec_cardinality(arg_genl);
                        }
                        cdolist_list_var_$123 = cdolist_list_var_$123.rest();
                        arg_genl = cdolist_list_var_$123.first();
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    argnum2 = cdolist_list_var2.first();
                }
                if (NIL != var_cardinality_estimate) {
                    if (NIL != cardinality_estimate) {
                        cardinality_estimate = Numbers.multiply(cardinality_estimate, var_cardinality_estimate);
                    } else {
                        cardinality_estimate = var_cardinality_estimate;
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        SubLObject upper_estimate = (NIL != cardinality_estimate) ? Numbers.min(cardinality_estimate, cost_estimate) : cost_estimate;
        SubLObject lower_estimate = Numbers.max(ONE_INTEGER, basic_tva_estimate);
        SubLObject final_estimate = Numbers.round(number_utilities.four_significant_digits(Numbers.sqrt(Numbers.multiply(upper_estimate, lower_estimate))), UNPROVIDED);
        return final_estimate;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 27900L)
    public static SubLObject removal_tva_unify_closure_iterator(SubLObject asent) {
        if (NIL == cycl_utilities.expression_find_if($sym41$NON_SKOLEM_INDETERMINATE_TERM_, asent, UNPROVIDED, UNPROVIDED)) {
            return tva_inference.tva_unify_closure_iterator(asent, NIL, (NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_transitive_closure_mode(inference_macros.current_controlling_inference()) : $ALL);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 29300L)
    public static SubLObject removal_tva_unify_closure_conjunction_applicability(SubLObject contextualized_dnf_clause) {
        SubLObject subclause_specs = NIL;
        SubLObject pos_index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject pos_lit = NIL;
        pos_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = pos_lit;
            SubLObject pos_mt = NIL;
            SubLObject pos_asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list71);
            pos_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list71);
            pos_asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != removal_tva_unify_closure_conjunction_appropriate_asentP(pos_asent, pos_mt)) {
                    SubLObject vars = el_utilities.literal_free_variables(pos_asent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject pos_indices = list(pos_index);
                    SubLObject index = ZERO_INTEGER;
                    SubLObject cdolist_list_var_$124 = clauses.pos_lits(contextualized_dnf_clause);
                    SubLObject lit = NIL;
                    lit = cdolist_list_var_$124.first();
                    while (NIL != cdolist_list_var_$124) {
                        if (!index.eql(pos_index)) {
                            SubLObject current_$126;
                            SubLObject datum_$125 = current_$126 = lit;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$126, datum_$125, $list72);
                            mt = current_$126.first();
                            current_$126 = current_$126.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$126, datum_$125, $list72);
                            asent = current_$126.first();
                            current_$126 = current_$126.rest();
                            if (NIL == current_$126) {
                                if (NIL != removal_tva_unify_closure_conjunction_appropriate_asentP(asent, mt) && NIL != list_utilities.sets_equalP(vars, el_utilities.literal_free_variables(asent, UNPROVIDED, UNPROVIDED, UNPROVIDED), Symbols.symbol_function(EQL))) {
                                    pos_indices = cons(index, pos_indices);
                                }
                            } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$125, $list72);
                            }
                        }
                        index = Numbers.add(index, ONE_INTEGER);
                        cdolist_list_var_$124 = cdolist_list_var_$124.rest();
                        lit = cdolist_list_var_$124.first();
                    }
                    if (NIL != list_utilities.lengthG(pos_indices, ONE_INTEGER, UNPROVIDED)) {
                        subclause_specs = cons(clause_utilities.new_subclause_spec(NIL, Sort.sort(pos_indices, Symbols.symbol_function($sym73$_), UNPROVIDED)), subclause_specs);
                    }
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list71);
            }
            pos_index = Numbers.add(pos_index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(subclause_specs, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 31100L)
    public static SubLObject removal_tva_unify_closure_conjunction_appropriate_asentP(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject result = NIL;
        if (NIL != forts.fort_p(pred) && NIL == el_utilities.closedP(asent, UNPROVIDED) && NIL != removal_tva_unify_closure_conjunction_appropriate_predicateP(pred)) {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                result = removal_tva_unify_required_int(asent, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 31500L)
    public static SubLObject removal_tva_unify_closure_conjunction_appropriate_predicateP(SubLObject predicate) {
        return makeBoolean(NIL == hl_supports.hl_predicate_p(predicate) && NIL == sbhl_module_utilities.sbhl_predicate_p(predicate) && NIL == sbhl_time_utilities.sbhl_time_predicate_p(predicate) && NIL == inference_modules.solely_specific_removal_module_predicateP(predicate));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 31800L)
    public static SubLObject removal_tva_unify_closure_conjunction_cost(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = lit;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject mt_var = mt;
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject asent_cost = removal_tva_unify_closure_cost(asent, UNPROVIDED);
                    if (NIL != asent_cost) {
                        if (NIL != cost) {
                            cost = Numbers.min(cost, asent_cost);
                        } else {
                            cost = asent_cost;
                        }
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list72);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 32300L)
    public static SubLObject removal_tva_unify_closure_conjunction_output_generate(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject closure = NIL;
        SubLObject emptyP = NIL;
        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            SubLObject rest;
            SubLObject lit;
            SubLObject current;
            SubLObject datum;
            SubLObject mt;
            SubLObject asent;
            SubLObject asent_closure;
            for (rest = NIL, rest = clauses.pos_lits(contextualized_dnf_clause); NIL == emptyP && NIL != rest; rest = rest.rest()) {
                lit = rest.first();
                datum = (current = lit);
                mt = NIL;
                asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    asent_closure = tva_inference.tva_unify(asent, mt, NIL, NIL, $ALL, UNPROVIDED, UNPROVIDED);
                    if (NIL != closure) {
                        if (NIL != asent_closure) {
                            closure = set_utilities.set_intersection(list(closure, set_utilities.make_set_from_list(asent_closure, Symbols.symbol_function(EQUAL))), Symbols.symbol_function(EQUAL));
                        } else {
                            set.clear_set(closure);
                        }
                    } else {
                        closure = set_utilities.make_set_from_list(asent_closure, Symbols.symbol_function(EQUAL));
                    }
                    if (NIL != set.empty_set_p(closure)) {
                        emptyP = T;
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list72);
                }
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return (NIL != emptyP) ? iteration.new_null_iterator() : new_tva_closure_crm_iterator(closure, contextualized_dnf_clause);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 33000L)
    public static SubLObject new_tva_closure_crm_iterator(SubLObject closure, SubLObject contextualized_dnf_clause) {
        return iteration.new_iterator(tva_closure_crm_iterator_state(closure, contextualized_dnf_clause), $sym74$TVA_CLOSURE_CRM_ITERATOR_DONE, $sym75$TVA_CLOSURE_CRM_ITERATOR_NEXT, $sym76$TVA_CLOSURE_CRM_ITERATOR_FINALIZE);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 33300L)
    public static SubLObject tva_closure_crm_iterator_state(SubLObject closure, SubLObject contextualized_dnf_clause) {
        SubLObject closure_iterator = set.new_set_iterator(closure);
        SubLObject support_templates = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = lit;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject support_template = arguments.make_hl_support($TVA, asent, mt, UNPROVIDED);
                support_templates = cons(list(support_template), support_templates);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list72);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return list(closure_iterator, Sequences.nreverse(support_templates));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 33800L)
    public static SubLObject tva_closure_crm_iterator_done(SubLObject state) {
        SubLObject closure_iterator = NIL;
        SubLObject support_templates = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list77);
        closure_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list77);
        support_templates = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_done(closure_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, $list77);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 34000L)
    public static SubLObject tva_closure_crm_iterator_next(SubLObject state) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject closure_iterator = NIL;
        SubLObject support_templates = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list77);
        closure_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list77);
        support_templates = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, $list77);
            return NIL;
        }
        thread.resetMultipleValues();
        SubLObject result = iteration.iteration_next(closure_iterator);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            SubLObject v_bindings = result.first();
            SubLObject supports = conses_high.sublis(v_bindings, support_templates, UNPROVIDED, UNPROVIDED);
            return Values.values(list(v_bindings, supports), state, NIL);
        }
        return Values.values(NIL, state, T);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 34400L)
    public static SubLObject tva_closure_crm_iterator_finalize(SubLObject state) {
        SubLObject closure_iterator = NIL;
        SubLObject support_templates = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list77);
        closure_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list77);
        support_templates = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_finalize(closure_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, $list77);
        return NIL;
    }

    public static SubLObject declare_removal_modules_tva_lookup_file() {
        declareFunction("tva_pos_preference", "TVA-POS-PREFERENCE", 3, 0, false);
        declareFunction("tva_asent_has_fully_bound_argP", "TVA-ASENT-HAS-FULLY-BOUND-ARG?", 1, 0, false);
        declareFunction("tva_applicable_to_some_bindable_argP", "TVA-APPLICABLE-TO-SOME-BINDABLE-ARG?", 2, 0, false);
        declareFunction("possible_tva_check_solved_by_other_hl_module", "POSSIBLE-TVA-CHECK-SOLVED-BY-OTHER-HL-MODULE", 1, 2, false);
        declareFunction("tva_determine_lookup_success", "TVA-DETERMINE-LOOKUP-SUCCESS", 1, 1, false);
        declareFunction("tva_determine_genl_preds_success", "TVA-DETERMINE-GENL-PREDS-SUCCESS", 1, 1, false);
        declareFunction("tva_determine_genl_preds_lookup_int", "TVA-DETERMINE-GENL-PREDS-LOOKUP-INT", 1, 0, false);
        declareFunction("tva_determine_genl_inverse_success", "TVA-DETERMINE-GENL-INVERSE-SUCCESS", 1, 1, false);
        declareFunction("tva_determine_genl_inverse_lookup_int", "TVA-DETERMINE-GENL-INVERSE-LOOKUP-INT", 1, 0, false);
        declareFunction("atomic_sentence_valid_wrt_irreflexivityP", "ATOMIC-SENTENCE-VALID-WRT-IRREFLEXIVITY?", 1, 0, false);
        declareFunction("arguments_valid_wrt_irreflexivityP", "ARGUMENTS-VALID-WRT-IRREFLEXIVITY?", 3, 0, false);
        declareFunction("tva_check", "TVA-CHECK", 1, 2, false);
        declareFunction("tva_justify", "TVA-JUSTIFY", 1, 1, false);
        declareFunction("tva_answer_justification_betterP", "TVA-ANSWER-JUSTIFICATION-BETTER?", 2, 0, false);
        declareFunction("tva_max_floor_mts_of_just", "TVA-MAX-FLOOR-MTS-OF-JUST", 1, 0, false);
        declareFunction("new_tva_support_mts_for_support", "NEW-TVA-SUPPORT-MTS-FOR-SUPPORT", 1, 0, false);
        declareFunction("legacy_tva_support_mts_for_support", "LEGACY-TVA-SUPPORT-MTS-FOR-SUPPORT", 1, 0, false);
        declareFunction("inference_tva_check", "INFERENCE-TVA-CHECK", 1, 2, false);
        declareFunction("inference_tva_unify", "INFERENCE-TVA-UNIFY", 1, 1, false);
        declareFunction("inference_tva_justify", "INFERENCE-TVA-JUSTIFY", 1, 1, false);
        declareFunction("inference_tva_max_floor_mts", "INFERENCE-TVA-MAX-FLOOR-MTS", 1, 0, false);
        declareFunction("make_tva_support", "MAKE-TVA-SUPPORT", 1, 2, false);
        declareFunction("removal_tva_required", "REMOVAL-TVA-REQUIRED", 1, 0, false);
        declareFunction("removal_tva_check_required", "REMOVAL-TVA-CHECK-REQUIRED", 1, 1, false);
        declareFunction("removal_tva_check_expand", "REMOVAL-TVA-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_tva_unify_required", "REMOVAL-TVA-UNIFY-REQUIRED", 1, 1, false);
        declareFunction("removal_tva_unify_required_int_internal", "REMOVAL-TVA-UNIFY-REQUIRED-INT-INTERNAL", 1, 1, false);
        declareFunction("removal_tva_unify_required_int", "REMOVAL-TVA-UNIFY-REQUIRED-INT", 1, 1, false);
        declareFunction("tva_unify_usefulP_internal", "TVA-UNIFY-USEFUL?-INTERNAL", 1, 0, false);
        declareFunction("tva_unify_usefulP", "TVA-UNIFY-USEFUL?", 1, 0, false);
        declareFunction("tva_unify_from_cache_possibleP", "TVA-UNIFY-FROM-CACHE-POSSIBLE?", 1, 0, false);
        declareFunction("no_nested_variables_p", "NO-NESTED-VARIABLES-P", 1, 0, false);
        declareFunction("removal_tva_unify_cost", "REMOVAL-TVA-UNIFY-COST", 1, 1, false);
        new $removal_tva_unify_cost$UnaryFunction();
        new $removal_tva_unify_cost$BinaryFunction();
        declareFunction("removal_tva_unify_iterator", "REMOVAL-TVA-UNIFY-ITERATOR", 1, 0, false);
        declareFunction("removal_tva_unify_closure_required", "REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED", 1, 1, false);
        new $removal_tva_unify_closure_required$UnaryFunction();
        new $removal_tva_unify_closure_required$BinaryFunction();
        declareFunction("removal_tva_unify_closure_cost", "REMOVAL-TVA-UNIFY-CLOSURE-COST", 1, 1, false);
        declareFunction("removal_tva_unify_closure_iterator", "REMOVAL-TVA-UNIFY-CLOSURE-ITERATOR", 1, 0, false);
        declareFunction("removal_tva_unify_closure_conjunction_applicability", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPLICABILITY", 1, 0, false);
        new $removal_tva_unify_closure_conjunction_applicability$UnaryFunction();
        declareFunction("removal_tva_unify_closure_conjunction_appropriate_asentP", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPROPRIATE-ASENT?", 2, 0, false);
        declareFunction("removal_tva_unify_closure_conjunction_appropriate_predicateP", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPROPRIATE-PREDICATE?", 1, 0, false);
        declareFunction("removal_tva_unify_closure_conjunction_cost", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-COST", 1, 0, false);
        declareFunction("removal_tva_unify_closure_conjunction_output_generate", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-OUTPUT-GENERATE", 1, 0, false);
        declareFunction("new_tva_closure_crm_iterator", "NEW-TVA-CLOSURE-CRM-ITERATOR", 2, 0, false);
        declareFunction("tva_closure_crm_iterator_state", "TVA-CLOSURE-CRM-ITERATOR-STATE", 2, 0, false);
        declareFunction("tva_closure_crm_iterator_done", "TVA-CLOSURE-CRM-ITERATOR-DONE", 1, 0, false);
        declareFunction("tva_closure_crm_iterator_next", "TVA-CLOSURE-CRM-ITERATOR-NEXT", 1, 0, false);
        declareFunction("tva_closure_crm_iterator_finalize", "TVA-CLOSURE-CRM-ITERATOR-FINALIZE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_tva_lookup_file() {
        $tva_unify_default_preference$ = defparameter("*TVA-UNIFY-DEFAULT-PREFERENCE*", $DISPREFERRED);
        $tva_pos_preference_skip_tva_applicable_to_some_bindable_argP$ = SubLFiles.defparameter("*TVA-POS-PREFERENCE-SKIP-TVA-APPLICABLE-TO-SOME-BINDABLE-ARG?*", T);
        $tva_use_recursive_hl_forward_mtsP$ = defparameter("*TVA-USE-RECURSIVE-HL-FORWARD-MTS?*", T);
        $default_tva_check_cost$ = deflexical("*DEFAULT-TVA-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_tva_lookup_file() {
        preference_modules.inference_preference_module($TVA_POS, $list2);
        utilities_macros.note_funcall_helper_function($sym22$ATOMIC_SENTENCE_VALID_WRT_IRREFLEXIVITY_);
        inference_modules.inference_removal_module($REMOVAL_TVA_CHECK, $list42);
        inference_modules.inference_removal_module($REMOVAL_TVA_CHECK_NEG, $list44);
        memoization_state.note_memoized_function($sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT);
        memoization_state.note_memoized_function($sym47$TVA_UNIFY_USEFUL_);
        inference_modules.inference_removal_module($REMOVAL_TVA_UNIFY, $list69);
        inference_modules.inference_removal_module($REMOVAL_TVA_UNIFY_CLOSURE, $list70);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_tva_lookup_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_tva_lookup_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_tva_lookup_file();
    }

    static {
        me = new removal_modules_tva_lookup();
        $tva_unify_default_preference$ = null;
        $tva_pos_preference_skip_tva_applicable_to_some_bindable_argP$ = null;
        $tva_use_recursive_hl_forward_mtsP$ = null;
        $default_tva_check_cost$ = null;
        $DISPREFERRED = makeKeyword("DISPREFERRED");
        $TVA_POS = makeKeyword("TVA-POS");
        $list2 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("TVA-POS-PREFERENCE"));
        $REMOVAL_TVA_CHECK = makeKeyword("REMOVAL-TVA-CHECK");
        $REMOVAL_TVA_UNIFY = makeKeyword("REMOVAL-TVA-UNIFY");
        $REMOVAL_TVA_UNIFY_CLOSURE = makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE");
        $NONE = makeKeyword("NONE");
        $PREFERRED = makeKeyword("PREFERRED");
        $list8 = list(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"));
        $list9 = list(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"));
        $GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
        $TACTICAL = makeKeyword("TACTICAL");
        $ALL = makeKeyword("ALL");
        $IGNORE = makeKeyword("IGNORE");
        $POS = makeKeyword("POS");
        $QUERY = makeKeyword("QUERY");
        $GENLPREDS = makeKeyword("GENLPREDS");
        $TRANSITIVITY = makeKeyword("TRANSITIVITY");
        $GAF_ARG = makeKeyword("GAF-ARG");
        $GAF = makeKeyword("GAF");
        $PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
        $OVERLAP = makeKeyword("OVERLAP");
        $sym22$ATOMIC_SENTENCE_VALID_WRT_IRREFLEXIVITY_ = makeSymbol("ATOMIC-SENTENCE-VALID-WRT-IRREFLEXIVITY?");
        $sym23$FULLY_BOUND_P = makeSymbol("FULLY-BOUND-P");
        $NEG = makeKeyword("NEG");
        $sym25$TVA_ANSWER_JUSTIFICATION_BETTER_ = makeSymbol("TVA-ANSWER-JUSTIFICATION-BETTER?");
        $list26 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
        $sym27$CYCL_ASSERTED_ASSERTION_ = makeSymbol("CYCL-ASSERTED-ASSERTION?");
        $sym28$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED = makeSymbol("INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED");
        $sym29$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
        $CODE = makeKeyword("CODE");
        $sym31$SUPPORT_MT = makeSymbol("SUPPORT-MT");
        $list32 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));
        $sym33$FIRST = makeSymbol("FIRST");
        $sym34$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $sym36$SECOND = makeSymbol("SECOND");
        $sym37$TVA_MAX_FLOOR_MTS_OF_JUST = makeSymbol("TVA-MAX-FLOOR-MTS-OF-JUST");
        $$not = makeConstSym(("not"));
        $TVA = makeKeyword("TVA");
        $sym40$FAST_NON_SKOLEM_INDETERMINATE_TERM_ = makeSymbol("FAST-NON-SKOLEM-INDETERMINATE-TERM?");
        $sym41$NON_SKOLEM_INDETERMINATE_TERM_ = makeSymbol("NON-SKOLEM-INDETERMINATE-TERM?");
        $list42 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TVA-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-TVA-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TVA-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<fort> . <fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString(
                        "(#$relationAllExists #$physicalParts #$Dog #$Head)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$transitiveViaArg #$relationAllExists #$genls 3)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n (#$genls #$Head-Vertebrate #$Head)\n") });
        $REMOVAL_TVA_CHECK_NEG = makeKeyword("REMOVAL-TVA-CHECK-NEG");
        $list44 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TVA-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-TVA-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TVA-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<fort> . <fully-bound>)\nusing #$negationPreds, #$negationInverse, true assertions, and GAF \nindexing in the KB via #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString(
                        "(#$not (#$relationExistsExists #$parts #$CellNucleus #$Cell))\nvia \n (#$relationNotExistsExists #$parts #$NuclearBody #$Cell)\n (#$transitiveViaArgInverse #$relationNotExistsExists #$genls 2) \n (#$negationPreds #$relationNotExistsExists #$relationExistsExists) \n (#$genls #$CellNucleus #$NuclearBody)\n") });
        $sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT = makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED-INT");
        $int$2048 = makeInteger(2048);
        $sym47$TVA_UNIFY_USEFUL_ = makeSymbol("TVA-UNIFY-USEFUL?");
        $DEPTH = makeKeyword("DEPTH");
        $STACK = makeKeyword("STACK");
        $QUEUE = makeKeyword("QUEUE");
        $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $ERROR = makeKeyword("ERROR");
        $str53$_A_is_not_a__A = makeString("~A is not a ~A");
        $sym54$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
        $CERROR = makeKeyword("CERROR");
        $str56$continue_anyway = makeString("continue anyway");
        $WARN = makeKeyword("WARN");
        $str58$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
        $$genlPreds = makeConstSym(("genlPreds"));
        $$transitiveViaArg = makeConstSym(("transitiveViaArg"));
        $$conservativeViaArg = makeConstSym(("conservativeViaArg"));
        $$transitiveViaArgInverse = makeConstSym(("transitiveViaArgInverse"));
        $$conservativeViaArgInverse = makeConstSym(("conservativeViaArgInverse"));
        $str64$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");
        $str65$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str66$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym67$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
        $list68 = list(makeConstSym(("transitiveViaArgInverse")), makeConstSym(("conservativeViaArgInverse")));
        $list69 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED"), makeKeyword("COST"),
                makeSymbol("REMOVAL-TVA-UNIFY-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-TVA-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))),
                makeKeyword("OUTPUT-VERIFY-PATTERN"), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("ATOMIC-SENTENCE-VALID-WRT-IRREFLEXIVITY?")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("POSSIBLE-TVA-CHECK-SOLVED-BY-OTHER-HL-MODULE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TVA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"),
                makeString("(<fort> . <not-fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString(
                        "(#$relationAllExists #$physicalParts #$Dog ?COL)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n") });
        $list70 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED"), makeKeyword("COST"),
                makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TVA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"),
                makeString("(<fort> . <not-fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString(
                        "(#$relationAllExists #$physicalParts #$Dog ?COL)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n") });
        $list71 = list(makeSymbol("POS-MT"), makeSymbol("POS-ASENT"));
        $list72 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $sym73$_ = makeSymbol("<");
        $sym74$TVA_CLOSURE_CRM_ITERATOR_DONE = makeSymbol("TVA-CLOSURE-CRM-ITERATOR-DONE");
        $sym75$TVA_CLOSURE_CRM_ITERATOR_NEXT = makeSymbol("TVA-CLOSURE-CRM-ITERATOR-NEXT");
        $sym76$TVA_CLOSURE_CRM_ITERATOR_FINALIZE = makeSymbol("TVA-CLOSURE-CRM-ITERATOR-FINALIZE");
        $list77 = list(makeSymbol("CLOSURE-ITERATOR"), makeSymbol("SUPPORT-TEMPLATES"));
    }

    public static class $removal_tva_unify_cost$UnaryFunction extends UnaryFunction {
        public $removal_tva_unify_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_tva_unify_cost(arg1, $removal_tva_unify_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_tva_unify_cost$BinaryFunction extends BinaryFunction {
        public $removal_tva_unify_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_tva_unify_cost(arg1, arg2);
        }
    }

    public static class $removal_tva_unify_closure_required$UnaryFunction extends UnaryFunction {
        public $removal_tva_unify_closure_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_tva_unify_closure_required(arg1, $removal_tva_unify_closure_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_tva_unify_closure_required$BinaryFunction extends BinaryFunction {
        public $removal_tva_unify_closure_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_tva_unify_closure_required(arg1, arg2);
        }
    }

    public static class $removal_tva_unify_closure_conjunction_applicability$UnaryFunction extends UnaryFunction {
        public $removal_tva_unify_closure_conjunction_applicability$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_tva_unify_closure_conjunction_applicability(arg1);
        }
    }
}
/*
 *
 * Total time: 3023 ms
 *
 */