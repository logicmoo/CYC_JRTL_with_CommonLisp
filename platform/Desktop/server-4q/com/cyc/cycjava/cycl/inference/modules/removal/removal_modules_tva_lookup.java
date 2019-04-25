package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.ghl_search_utilities;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.wff;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.tva_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.tva_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.tva_cache;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_tva_lookup extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup";
    public static final String myFingerPrint = "a4bf4eba6f3dcd25ad6dc2dd78d119bd383d44e9a9c3fda926c016de1edfcca2";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 990L)
    private static SubLSymbol $tva_unify_default_preference$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 1206L)
    private static SubLSymbol $tva_pos_preference_skip_tva_applicable_to_some_bindable_argP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 11413L)
    private static SubLSymbol $tva_use_recursive_hl_forward_mtsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 16933L)
    private static SubLSymbol $default_tva_check_cost$;
    private static final SubLSymbol $kw0$DISPREFERRED;
    private static final SubLSymbol $kw1$TVA_POS;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$REMOVAL_TVA_CHECK;
    private static final SubLSymbol $kw4$REMOVAL_TVA_UNIFY;
    private static final SubLSymbol $kw5$REMOVAL_TVA_UNIFY_CLOSURE;
    private static final SubLSymbol $kw6$NONE;
    private static final SubLSymbol $kw7$PREFERRED;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$GROSSLY_DISPREFERRED;
    private static final SubLSymbol $kw11$TACTICAL;
    private static final SubLSymbol $kw12$ALL;
    private static final SubLSymbol $kw13$IGNORE;
    private static final SubLSymbol $kw14$POS;
    private static final SubLSymbol $kw15$QUERY;
    private static final SubLSymbol $kw16$GENLPREDS;
    private static final SubLSymbol $kw17$TRANSITIVITY;
    private static final SubLSymbol $kw18$GAF_ARG;
    private static final SubLSymbol $kw19$GAF;
    private static final SubLSymbol $kw20$PREDICATE_EXTENT;
    private static final SubLSymbol $kw21$OVERLAP;
    private static final SubLSymbol $sym22$ATOMIC_SENTENCE_VALID_WRT_IRREFLEXIVITY_;
    private static final SubLSymbol $sym23$FULLY_BOUND_P;
    private static final SubLSymbol $kw24$NEG;
    private static final SubLSymbol $sym25$TVA_ANSWER_JUSTIFICATION_BETTER_;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$CYCL_ASSERTED_ASSERTION_;
    private static final SubLSymbol $sym28$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED;
    private static final SubLSymbol $sym29$HLMT_EQUAL;
    private static final SubLSymbol $kw30$CODE;
    private static final SubLSymbol $sym31$SUPPORT_MT;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$FIRST;
    private static final SubLSymbol $sym34$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const35$InferencePSC;
    private static final SubLSymbol $sym36$SECOND;
    private static final SubLSymbol $sym37$TVA_MAX_FLOOR_MTS_OF_JUST;
    private static final SubLObject $const38$not;
    private static final SubLSymbol $kw39$TVA;
    private static final SubLSymbol $sym40$FAST_NON_SKOLEM_INDETERMINATE_TERM_;
    private static final SubLSymbol $sym41$NON_SKOLEM_INDETERMINATE_TERM_;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$REMOVAL_TVA_CHECK_NEG;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT;
    private static final SubLInteger $int46$2048;
    private static final SubLSymbol $sym47$TVA_UNIFY_USEFUL_;
    private static final SubLSymbol $kw48$DEPTH;
    private static final SubLSymbol $kw49$STACK;
    private static final SubLSymbol $kw50$QUEUE;
    private static final SubLSymbol $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw52$ERROR;
    private static final SubLString $str53$_A_is_not_a__A;
    private static final SubLSymbol $sym54$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw55$CERROR;
    private static final SubLString $str56$continue_anyway;
    private static final SubLSymbol $kw57$WARN;
    private static final SubLString $str58$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const59$genlPreds;
    private static final SubLObject $const60$transitiveViaArg;
    private static final SubLObject $const61$conservativeViaArg;
    private static final SubLObject $const62$transitiveViaArgInverse;
    private static final SubLObject $const63$conservativeViaArgInverse;
    private static final SubLString $str64$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str65$attempting_to_bind_direction_link;
    private static final SubLString $str66$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym67$HL_VARIABLE_P;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$_;
    private static final SubLSymbol $sym74$TVA_CLOSURE_CRM_ITERATOR_DONE;
    private static final SubLSymbol $sym75$TVA_CLOSURE_CRM_ITERATOR_NEXT;
    private static final SubLSymbol $sym76$TVA_CLOSURE_CRM_ITERATOR_FINALIZE;
    private static final SubLList $list77;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 1295L)
    public static SubLObject tva_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference = inference_datastructures_strategy.strategic_context_inference(strategic_context);
        final SubLObject allow_allP = Types.sublisp_null(inference);
        final SubLObject check_allowedP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL != allow_allP || removal_modules_tva_lookup.NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_modules.find_hl_module_by_name((SubLObject)removal_modules_tva_lookup.$kw3$REMOVAL_TVA_CHECK)));
        final SubLObject unify_allowedP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL != allow_allP || removal_modules_tva_lookup.NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_modules.find_hl_module_by_name((SubLObject)removal_modules_tva_lookup.$kw4$REMOVAL_TVA_UNIFY)));
        SubLObject unify_closure_allowedP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL != allow_allP || removal_modules_tva_lookup.NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_modules.find_hl_module_by_name((SubLObject)removal_modules_tva_lookup.$kw5$REMOVAL_TVA_UNIFY_CLOSURE)));
        if (removal_modules_tva_lookup.NIL != inference && removal_modules_tva_lookup.$kw6$NONE == inference_datastructures_inference.inference_transitive_closure_mode(inference)) {
            unify_closure_allowedP = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (removal_modules_tva_lookup.NIL == check_allowedP && removal_modules_tva_lookup.NIL == unify_allowedP && removal_modules_tva_lookup.NIL == unify_closure_allowedP) {
            return (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (removal_modules_tva_lookup.NIL == forts.fort_p(cycl_utilities.atomic_sentence_predicate(asent))) {
            return (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (removal_modules_tva_lookup.NIL == check_allowedP) {
            return (SubLObject)removal_modules_tva_lookup.$kw7$PREFERRED;
        }
        if (removal_modules_tva_lookup.NIL != tva_cache.tva_cache_enabled_p() && ((removal_modules_tva_lookup.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_tva_lookup.$list8) && removal_modules_tva_lookup.NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(cycl_utilities.atomic_sentence_predicate(asent), (SubLObject)removal_modules_tva_lookup.TWO_INTEGER)) || (removal_modules_tva_lookup.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_tva_lookup.$list9) && removal_modules_tva_lookup.NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(cycl_utilities.atomic_sentence_predicate(asent), (SubLObject)removal_modules_tva_lookup.ONE_INTEGER)))) {
            return (SubLObject)removal_modules_tva_lookup.$kw7$PREFERRED;
        }
        if (removal_modules_tva_lookup.NIL != variables.fully_bound_p(asent)) {
            return (SubLObject)removal_modules_tva_lookup.$kw7$PREFERRED;
        }
        if (removal_modules_tva_lookup.NIL == removal_modules_tva_lookup.$tva_pos_preference_skip_tva_applicable_to_some_bindable_argP$.getDynamicValue(thread) && removal_modules_tva_lookup.NIL == tva_applicable_to_some_bindable_argP(asent, bindable_vars)) {
            return (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (removal_modules_tva_lookup.NIL == removal_tva_unify_required(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
            return (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (removal_modules_tva_lookup.NIL == preference_modules.within_generic_preference_analysisP() && removal_modules_tva_lookup.NIL == tva_asent_has_fully_bound_argP(asent)) {
            return (SubLObject)removal_modules_tva_lookup.$kw10$GROSSLY_DISPREFERRED;
        }
        if (removal_modules_tva_lookup.$kw11$TACTICAL == strategic_context) {
            return (SubLObject)removal_modules_tva_lookup.$kw0$DISPREFERRED;
        }
        if (removal_modules_tva_lookup.NIL != unify_closure_allowedP && removal_modules_tva_lookup.$kw12$ALL == inference_datastructures_inference.inference_transitive_closure_mode(inference)) {
            return (SubLObject)removal_modules_tva_lookup.$kw7$PREFERRED;
        }
        if (removal_modules_tva_lookup.NIL == unify_allowedP && removal_modules_tva_lookup.NIL == unify_closure_allowedP) {
            return (SubLObject)removal_modules_tva_lookup.$kw10$GROSSLY_DISPREFERRED;
        }
        return removal_modules_tva_lookup.$tva_unify_default_preference$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 4263L)
    public static SubLObject tva_asent_has_fully_bound_argP(final SubLObject asent) {
        SubLObject found_fully_bound_argP = (SubLObject)removal_modules_tva_lookup.NIL;
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_tva_lookup.$kw13$IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = (SubLObject)removal_modules_tva_lookup.NIL, rest = args; removal_modules_tva_lookup.NIL == found_fully_bound_argP && removal_modules_tva_lookup.NIL != rest; rest = rest.rest()) {
            arg = rest.first();
            if (removal_modules_tva_lookup.NIL != variables.fully_bound_p(arg)) {
                found_fully_bound_argP = (SubLObject)removal_modules_tva_lookup.T;
            }
        }
        return found_fully_bound_argP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 4518L)
    public static SubLObject tva_applicable_to_some_bindable_argP(final SubLObject asent, final SubLObject bindable_vars) {
        SubLObject applicableP = (SubLObject)removal_modules_tva_lookup.NIL;
        final SubLObject tva_asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject argnum = (SubLObject)removal_modules_tva_lookup.ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_tva_lookup.$kw13$IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = (SubLObject)removal_modules_tva_lookup.NIL, rest = args; removal_modules_tva_lookup.NIL == applicableP && removal_modules_tva_lookup.NIL != rest; rest = rest.rest()) {
            arg = rest.first();
            argnum = Numbers.add(argnum, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER);
            if (removal_modules_tva_lookup.NIL != list_utilities.tree_find_any(bindable_vars, arg, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED) && removal_modules_tva_lookup.NIL != tva_utilities.any_tva_for_argP(tva_asent_pred, argnum)) {
                applicableP = argnum;
            }
        }
        return applicableP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 4906L)
    public static SubLObject possible_tva_check_solved_by_other_hl_module(final SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == removal_modules_tva_lookup.UNPROVIDED) {
            mt = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.$kw14$POS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL != inference_worker.currently_active_problem() && removal_modules_tva_lookup.NIL != inference_worker.problem_goodP(inference_worker.currently_active_problem()) && removal_modules_tva_lookup.NIL != inference_datastructures_problem.problem_has_some_proofP(inference_worker.currently_active_problem(), (SubLObject)removal_modules_tva_lookup.UNPROVIDED) && removal_modules_tva_lookup.$kw3$REMOVAL_TVA_CHECK == inference_datastructures_tactic.tactic_hl_module_name(inference_worker.currently_executing_tactic())) {
            result = (SubLObject)removal_modules_tva_lookup.$kw15$QUERY;
        }
        if (removal_modules_tva_lookup.NIL == result) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = tva_determine_lookup_success(asent, sense);
                if (removal_modules_tva_lookup.NIL == result) {
                    if (removal_modules_tva_lookup.NIL != tva_determine_genl_preds_success(asent, sense)) {
                        result = (SubLObject)removal_modules_tva_lookup.$kw16$GENLPREDS;
                    }
                    else if (removal_modules_tva_lookup.NIL != tva_determine_genl_inverse_success(asent, sense)) {
                        result = (SubLObject)removal_modules_tva_lookup.$kw16$GENLPREDS;
                    }
                    else if (removal_modules_tva_lookup.NIL != el_utilities.el_binary_formula_p(asent) && removal_modules_tva_lookup.NIL != inference_trampolines.inference_transitive_predicateP(cycl_utilities.atomic_sentence_predicate(asent)) && removal_modules_tva_lookup.NIL != ghl_search_methods.gt_predicate_relation_p(cycl_utilities.atomic_sentence_predicate(asent), cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED), mt, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                        result = (SubLObject)removal_modules_tva_lookup.$kw17$TRANSITIVITY;
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 6673L)
    public static SubLObject tva_determine_lookup_success(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.$kw14$POS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_tva_lookup.NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw18$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_tva_lookup.NIL != argnum) {
                if (removal_modules_tva_lookup.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = result;
                        final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                        while (removal_modules_tva_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_tva_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                    SubLObject done_var_$1 = result;
                                    final SubLObject token_var_$2 = (SubLObject)removal_modules_tva_lookup.NIL;
                                    while (removal_modules_tva_lookup.NIL == done_var_$1) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                        if (removal_modules_tva_lookup.NIL != valid_$3 && removal_modules_tva_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                            if (removal_modules_tva_lookup.NIL != v_bindings) {
                                                result = assertion;
                                            }
                                        }
                                        done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$3 || removal_modules_tva_lookup.NIL != result);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid || removal_modules_tva_lookup.NIL != result);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_tva_lookup.NIL;
                    if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = result;
                        final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                        while (removal_modules_tva_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_tva_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                    SubLObject done_var_$2 = result;
                                    final SubLObject token_var_$3 = (SubLObject)removal_modules_tva_lookup.NIL;
                                    while (removal_modules_tva_lookup.NIL == done_var_$2) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(assertion));
                                        if (removal_modules_tva_lookup.NIL != valid_$4 && removal_modules_tva_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                            if (removal_modules_tva_lookup.NIL != v_bindings) {
                                                result = assertion;
                                            }
                                        }
                                        done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$4 || removal_modules_tva_lookup.NIL != result);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid || removal_modules_tva_lookup.NIL != result);
                        }
                    }
                }
            }
            else if (removal_modules_tva_lookup.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var);
                    SubLObject done_var = result;
                    final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                    while (removal_modules_tva_lookup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_tva_lookup.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                SubLObject done_var_$3 = result;
                                final SubLObject token_var_$4 = (SubLObject)removal_modules_tva_lookup.NIL;
                                while (removal_modules_tva_lookup.NIL == done_var_$3) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                    if (removal_modules_tva_lookup.NIL != valid_$5 && removal_modules_tva_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                        final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                                        final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                        if (removal_modules_tva_lookup.NIL != v_bindings) {
                                            result = assertion;
                                        }
                                    }
                                    done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$5 || removal_modules_tva_lookup.NIL != result);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid || removal_modules_tva_lookup.NIL != result);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_tva_lookup.NIL;
                if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var);
                    SubLObject done_var = result;
                    final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                    while (removal_modules_tva_lookup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_tva_lookup.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                SubLObject done_var_$4 = result;
                                final SubLObject token_var_$5 = (SubLObject)removal_modules_tva_lookup.NIL;
                                while (removal_modules_tva_lookup.NIL == done_var_$4) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                    if (removal_modules_tva_lookup.NIL != valid_$6 && removal_modules_tva_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                        final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                                        final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                        if (removal_modules_tva_lookup.NIL != v_bindings) {
                                            result = assertion;
                                        }
                                    }
                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$6 || removal_modules_tva_lookup.NIL != result);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid || removal_modules_tva_lookup.NIL != result);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw20$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_tva_lookup.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_tva_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_tva_lookup.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = result;
                    final SubLObject token_var2 = (SubLObject)removal_modules_tva_lookup.NIL;
                    while (removal_modules_tva_lookup.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_tva_lookup.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_tva_lookup.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                SubLObject done_var_$5 = result;
                                final SubLObject token_var_$6 = (SubLObject)removal_modules_tva_lookup.NIL;
                                while (removal_modules_tva_lookup.NIL == done_var_$5) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion2));
                                    if (removal_modules_tva_lookup.NIL != valid_$7 && removal_modules_tva_lookup.NIL != backward_utilities.direction_is_relevant(assertion2)) {
                                        final SubLObject gaf_formula2 = assertions_high.gaf_formula(assertion2);
                                        final SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(asent, gaf_formula2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                        if (removal_modules_tva_lookup.NIL != v_bindings2) {
                                            result = assertion2;
                                        }
                                    }
                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$7 || removal_modules_tva_lookup.NIL != result);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_tva_lookup.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid2 || removal_modules_tva_lookup.NIL != result);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
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
        }
        else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw21$OVERLAP)) {
            SubLObject rest;
            SubLObject assertion3;
            SubLObject gaf_formula3;
            SubLObject v_bindings3;
            for (rest = (SubLObject)removal_modules_tva_lookup.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_tva_lookup.UNPROVIDED); removal_modules_tva_lookup.NIL == result && removal_modules_tva_lookup.NIL != rest; rest = rest.rest()) {
                assertion3 = rest.first();
                if ((removal_modules_tva_lookup.NIL == enumeration_types.sense_truth(sense) || removal_modules_tva_lookup.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense))) && removal_modules_tva_lookup.NIL != backward_utilities.direction_is_relevant(assertion3)) {
                    gaf_formula3 = assertions_high.gaf_formula(assertion3);
                    v_bindings3 = unification_utilities.gaf_asent_unify(asent, gaf_formula3, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                    if (removal_modules_tva_lookup.NIL != v_bindings3) {
                        result = assertion3;
                    }
                }
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 7063L)
    public static SubLObject tva_determine_genl_preds_success(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.$kw14$POS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)removal_modules_tva_lookup.NIL;
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject obfuscated_asent = removal_modules_genlpreds_lookup.obfuscate_predicate(asent);
        final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_pred_relevance(sense), thread);
            control_vars.$inference_literal$.bind(asent, thread);
            control_vars.$inference_sense$.bind(sense, thread);
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw18$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_tva_lookup.NIL != argnum) {
                    if (removal_modules_tva_lookup.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_tva_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                            while (removal_modules_tva_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_tva_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                        SubLObject done_var_$17 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        final SubLObject token_var_$18 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        while (removal_modules_tva_lookup.NIL == done_var_$17) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                            final SubLObject valid_$19 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$18.eql(gaf));
                                            if (removal_modules_tva_lookup.NIL != valid_$19 && removal_modules_tva_lookup.NIL != tva_determine_genl_preds_lookup_int(gaf)) {
                                                successP = (SubLObject)removal_modules_tva_lookup.T;
                                            }
                                            done_var_$17 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$19);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_tva_lookup.NIL;
                        if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_tva_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                            while (removal_modules_tva_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_tva_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                        SubLObject done_var_$18 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        final SubLObject token_var_$19 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        while (removal_modules_tva_lookup.NIL == done_var_$18) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                            final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(gaf));
                                            if (removal_modules_tva_lookup.NIL != valid_$20 && removal_modules_tva_lookup.NIL != tva_determine_genl_preds_lookup_int(gaf)) {
                                                successP = (SubLObject)removal_modules_tva_lookup.T;
                                            }
                                            done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$20);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_tva_lookup.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_tva_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                        while (removal_modules_tva_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_tva_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                    SubLObject done_var_$19 = (SubLObject)removal_modules_tva_lookup.NIL;
                                    final SubLObject token_var_$20 = (SubLObject)removal_modules_tva_lookup.NIL;
                                    while (removal_modules_tva_lookup.NIL == done_var_$19) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                        final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(gaf));
                                        if (removal_modules_tva_lookup.NIL != valid_$21 && removal_modules_tva_lookup.NIL != tva_determine_genl_preds_lookup_int(gaf)) {
                                            successP = (SubLObject)removal_modules_tva_lookup.T;
                                        }
                                        done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$21);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_tva_lookup.NIL;
                    if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_tva_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                        while (removal_modules_tva_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_tva_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                    SubLObject done_var_$20 = (SubLObject)removal_modules_tva_lookup.NIL;
                                    final SubLObject token_var_$21 = (SubLObject)removal_modules_tva_lookup.NIL;
                                    while (removal_modules_tva_lookup.NIL == done_var_$20) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                                        final SubLObject valid_$22 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$21.eql(gaf));
                                        if (removal_modules_tva_lookup.NIL != valid_$22 && removal_modules_tva_lookup.NIL != tva_determine_genl_preds_lookup_int(gaf)) {
                                            successP = (SubLObject)removal_modules_tva_lookup.T;
                                        }
                                        done_var_$20 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$22);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw20$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_tva_lookup.NIL;
                    final SubLObject _prev_bind_0_$24 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$34 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$35 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_tva_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_tva_lookup.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_tva_lookup.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_tva_lookup.NIL;
                        while (removal_modules_tva_lookup.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_tva_lookup.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_tva_lookup.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                    SubLObject done_var_$21 = (SubLObject)removal_modules_tva_lookup.NIL;
                                    final SubLObject token_var_$22 = (SubLObject)removal_modules_tva_lookup.NIL;
                                    while (removal_modules_tva_lookup.NIL == done_var_$21) {
                                        final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$22);
                                        final SubLObject valid_$23 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$22.eql(gaf2));
                                        if (removal_modules_tva_lookup.NIL != valid_$23 && removal_modules_tva_lookup.NIL != tva_determine_genl_preds_lookup_int(gaf2)) {
                                            successP = (SubLObject)removal_modules_tva_lookup.T;
                                        }
                                        done_var_$21 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$23);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_tva_lookup.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
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
            }
            else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw21$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                SubLObject gaf3 = (SubLObject)removal_modules_tva_lookup.NIL;
                gaf3 = cdolist_list_var.first();
                while (removal_modules_tva_lookup.NIL != cdolist_list_var) {
                    if ((removal_modules_tva_lookup.NIL == enumeration_types.sense_truth(sense) || removal_modules_tva_lookup.NIL != assertions_high.assertion_has_truth(gaf3, enumeration_types.sense_truth(sense))) && removal_modules_tva_lookup.NIL != tva_determine_genl_preds_lookup_int(gaf3)) {
                        successP = (SubLObject)removal_modules_tva_lookup.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        finally {
            control_vars.$inference_sense$.rebind(_prev_bind_3, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 7519L)
    public static SubLObject tva_determine_genl_preds_lookup_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject assertion_literal = assertions_high.gaf_formula(assertion);
            final SubLObject ass_pred = el_utilities.literal_predicate(assertion_literal, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            final SubLObject inf_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            if (!ass_pred.eql(inf_pred)) {
                final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(control_vars.$inference_literal$.getDynamicValue(thread), assertion_literal, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                if (removal_modules_tva_lookup.NIL != v_bindings) {
                    successP = (SubLObject)removal_modules_tva_lookup.T;
                }
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 8026L)
    public static SubLObject tva_determine_genl_inverse_success(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.$kw14$POS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL != el_utilities.el_binary_formula_p(asent)) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject obfuscated_asent = removal_modules_genlpreds_lookup.obfuscate_predicate(removal_modules_symmetry.symmetric_asent(asent));
            final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding(thread);
            final SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_inverse_relevance(sense), thread);
                control_vars.$inference_literal$.bind(asent, thread);
                control_vars.$inference_sense$.bind(sense, thread);
                final SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                final SubLObject pcase_var;
                final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw18$GAF_ARG)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                    final SubLObject argnum = thread.secondMultipleValue();
                    final SubLObject predicate = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_tva_lookup.NIL != argnum) {
                        if (removal_modules_tva_lookup.NIL != predicate) {
                            final SubLObject pred_var = predicate;
                            if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_tva_lookup.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                                while (removal_modules_tva_lookup.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_tva_lookup.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                            SubLObject done_var_$40 = (SubLObject)removal_modules_tva_lookup.NIL;
                                            final SubLObject token_var_$41 = (SubLObject)removal_modules_tva_lookup.NIL;
                                            while (removal_modules_tva_lookup.NIL == done_var_$40) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                                final SubLObject valid_$42 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$41.eql(gaf));
                                                if (removal_modules_tva_lookup.NIL != valid_$42 && removal_modules_tva_lookup.NIL != tva_determine_genl_inverse_lookup_int(gaf)) {
                                                    successP = (SubLObject)removal_modules_tva_lookup.T;
                                                }
                                                done_var_$40 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$42);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid);
                                }
                            }
                        }
                        else {
                            final SubLObject pred_var = (SubLObject)removal_modules_tva_lookup.NIL;
                            if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_tva_lookup.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                                while (removal_modules_tva_lookup.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_tva_lookup.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                            SubLObject done_var_$41 = (SubLObject)removal_modules_tva_lookup.NIL;
                                            final SubLObject token_var_$42 = (SubLObject)removal_modules_tva_lookup.NIL;
                                            while (removal_modules_tva_lookup.NIL == done_var_$41) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                                                final SubLObject valid_$43 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$42.eql(gaf));
                                                if (removal_modules_tva_lookup.NIL != valid_$43 && removal_modules_tva_lookup.NIL != tva_determine_genl_inverse_lookup_int(gaf)) {
                                                    successP = (SubLObject)removal_modules_tva_lookup.T;
                                                }
                                                done_var_$41 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$43);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid);
                                }
                            }
                        }
                    }
                    else if (removal_modules_tva_lookup.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_tva_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                            while (removal_modules_tva_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_tva_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                        SubLObject done_var_$42 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        final SubLObject token_var_$43 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        while (removal_modules_tva_lookup.NIL == done_var_$42) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                            final SubLObject valid_$44 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$43.eql(gaf));
                                            if (removal_modules_tva_lookup.NIL != valid_$44 && removal_modules_tva_lookup.NIL != tva_determine_genl_inverse_lookup_int(gaf)) {
                                                successP = (SubLObject)removal_modules_tva_lookup.T;
                                            }
                                            done_var_$42 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$44);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_tva_lookup.NIL;
                        if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_tva_lookup.NIL, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_tva_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                            while (removal_modules_tva_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_tva_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                        SubLObject done_var_$43 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        final SubLObject token_var_$44 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        while (removal_modules_tva_lookup.NIL == done_var_$43) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                            final SubLObject valid_$45 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$44.eql(gaf));
                                            if (removal_modules_tva_lookup.NIL != valid_$45 && removal_modules_tva_lookup.NIL != tva_determine_genl_inverse_lookup_int(gaf)) {
                                                successP = (SubLObject)removal_modules_tva_lookup.T;
                                            }
                                            done_var_$43 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$45);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                            final SubLObject _values4 = Values.getValuesAsVector();
                                            if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values4);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid);
                            }
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw20$PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = (SubLObject)removal_modules_tva_lookup.NIL;
                        final SubLObject _prev_bind_0_$47 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$57 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$58 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_tva_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_tva_lookup.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = (SubLObject)removal_modules_tva_lookup.NIL;
                            final SubLObject token_var2 = (SubLObject)removal_modules_tva_lookup.NIL;
                            while (removal_modules_tva_lookup.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_tva_lookup.NIL != valid2) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_tva_lookup.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_tva_lookup.NIL);
                                        SubLObject done_var_$44 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        final SubLObject token_var_$45 = (SubLObject)removal_modules_tva_lookup.NIL;
                                        while (removal_modules_tva_lookup.NIL == done_var_$44) {
                                            final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$45);
                                            final SubLObject valid_$46 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$45.eql(gaf2));
                                            if (removal_modules_tva_lookup.NIL != valid_$46 && removal_modules_tva_lookup.NIL != tva_determine_genl_inverse_lookup_int(gaf2)) {
                                                successP = (SubLObject)removal_modules_tva_lookup.T;
                                            }
                                            done_var_$44 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$46);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                            final SubLObject _values5 = Values.getValuesAsVector();
                                            if (removal_modules_tva_lookup.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values5);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid2);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
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
                }
                else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw21$OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                    SubLObject gaf3 = (SubLObject)removal_modules_tva_lookup.NIL;
                    gaf3 = cdolist_list_var.first();
                    while (removal_modules_tva_lookup.NIL != cdolist_list_var) {
                        if ((removal_modules_tva_lookup.NIL == enumeration_types.sense_truth(sense) || removal_modules_tva_lookup.NIL != assertions_high.assertion_has_truth(gaf3, enumeration_types.sense_truth(sense))) && removal_modules_tva_lookup.NIL != tva_determine_genl_inverse_lookup_int(gaf3)) {
                            successP = (SubLObject)removal_modules_tva_lookup.T;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        gaf3 = cdolist_list_var.first();
                    }
                }
                else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }
            }
            finally {
                control_vars.$inference_sense$.rebind(_prev_bind_3, thread);
                control_vars.$inference_literal$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 8553L)
    public static SubLObject tva_determine_genl_inverse_lookup_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject assertion_literal = assertions_high.gaf_formula(assertion);
            final SubLObject ass_pred = el_utilities.literal_predicate(assertion_literal, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            final SubLObject inf_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            if (!ass_pred.eql(inf_pred)) {
                final SubLObject symmetric_literal = removal_modules_symmetry.symmetric_literal(control_vars.$inference_literal$.getDynamicValue(thread));
                final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(symmetric_literal, assertion_literal, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                if (removal_modules_tva_lookup.NIL != v_bindings) {
                    successP = (SubLObject)removal_modules_tva_lookup.T;
                }
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 9132L)
    public static SubLObject atomic_sentence_valid_wrt_irreflexivityP(final SubLObject asent) {
        return arguments_valid_wrt_irreflexivityP(cycl_utilities.atomic_sentence_predicate(asent), cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 9451L)
    public static SubLObject arguments_valid_wrt_irreflexivityP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == fort_types_interface.irreflexive_binary_predicate_p(pred) || removal_modules_tva_lookup.NIL == equals.equalsP(arg1, arg2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 9606L)
    public static SubLObject tva_check(final SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == removal_modules_tva_lookup.UNPROVIDED) {
            mt = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.$kw14$POS;
        }
        assert removal_modules_tva_lookup.NIL != variables.fully_bound_p(asent) : asent;
        return list_utilities.sublisp_boolean(tva_inference.tva_unify(asent, mt, (SubLObject)removal_modules_tva_lookup.T, (SubLObject)removal_modules_tva_lookup.NIL, (SubLObject)removal_modules_tva_lookup.$kw6$NONE, (SubLObject)removal_modules_tva_lookup.T, Equality.eq(sense, (SubLObject)removal_modules_tva_lookup.$kw24$NEG)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 10046L)
    public static SubLObject tva_justify(SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_tva_lookup.UNPROVIDED) {
            mt = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        assert removal_modules_tva_lookup.NIL != variables.fully_bound_p(asent) : asent;
        SubLObject sense = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL != cycl_utilities.negatedP(asent)) {
            sense = (SubLObject)removal_modules_tva_lookup.$kw24$NEG;
            asent = cycl_utilities.negate(asent);
        }
        final SubLObject answers = tva_inference.tva_unify(asent, mt, (SubLObject)removal_modules_tva_lookup.NIL, (SubLObject)removal_modules_tva_lookup.T, (SubLObject)removal_modules_tva_lookup.NIL, (SubLObject)removal_modules_tva_lookup.NIL, Equality.eq(sense, (SubLObject)removal_modules_tva_lookup.$kw24$NEG));
        if (removal_modules_tva_lookup.NIL != answers) {
            SubLObject current;
            final SubLObject datum = current = Sort.sort(answers, (SubLObject)removal_modules_tva_lookup.$sym25$TVA_ANSWER_JUSTIFICATION_BETTER_, (SubLObject)removal_modules_tva_lookup.UNPROVIDED).first();
            SubLObject v_bindings = (SubLObject)removal_modules_tva_lookup.NIL;
            SubLObject supports = (SubLObject)removal_modules_tva_lookup.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list26);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list26);
            supports = current.first();
            current = current.rest();
            if (removal_modules_tva_lookup.NIL == current) {
                return supports;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_tva_lookup.$list26);
        }
        return (SubLObject)removal_modules_tva_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 10605L)
    public static SubLObject tva_answer_justification_betterP(final SubLObject answer1, final SubLObject answer2) {
        final SubLObject just1 = conses_high.second(answer1);
        final SubLObject just2 = conses_high.second(answer2);
        final SubLObject just1_count = Sequences.length(just1);
        final SubLObject just2_count = Sequences.length(just2);
        final SubLObject just1_asserted_ass_count = Sequences.length(list_utilities.find_all_if((SubLObject)removal_modules_tva_lookup.$sym27$CYCL_ASSERTED_ASSERTION_, just1, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
        final SubLObject just2_asserted_ass_count = Sequences.length(list_utilities.find_all_if((SubLObject)removal_modules_tva_lookup.$sym27$CYCL_ASSERTED_ASSERTION_, just2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
        if (just1_asserted_ass_count.numG(just2_asserted_ass_count)) {
            return (SubLObject)removal_modules_tva_lookup.T;
        }
        if (just1_asserted_ass_count.numL(just2_asserted_ass_count)) {
            return (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (just1_count.numL(just2_count)) {
            return (SubLObject)removal_modules_tva_lookup.T;
        }
        if (just1_count.numG(just2_count)) {
            return (SubLObject)removal_modules_tva_lookup.NIL;
        }
        return (SubLObject)removal_modules_tva_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 11686L)
    public static SubLObject tva_max_floor_mts_of_just(final SubLObject just) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_lists = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject cdolist_list_var = just;
        SubLObject support = (SubLObject)removal_modules_tva_lookup.NIL;
        support = cdolist_list_var.first();
        while (removal_modules_tva_lookup.NIL != cdolist_list_var) {
            if (removal_modules_tva_lookup.NIL != assertion_handles.assertion_p(support)) {
                mt_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertions_high.assertion_mt(support)), mt_lists);
            }
            else if (removal_modules_tva_lookup.NIL != arguments.hl_support_p(support)) {
                SubLObject new_mts = (SubLObject)removal_modules_tva_lookup.NIL;
                if (removal_modules_tva_lookup.NIL != removal_modules_tva_lookup.$tva_use_recursive_hl_forward_mtsP$.getDynamicValue(thread)) {
                    new_mts = new_tva_support_mts_for_support(support);
                }
                else {
                    new_mts = legacy_tva_support_mts_for_support(support);
                }
                if (removal_modules_tva_lookup.NIL != new_mts) {
                    mt_lists = (SubLObject)ConsesLow.cons(new_mts, mt_lists);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Sequences.remove((SubLObject)removal_modules_tva_lookup.NIL, list_utilities.union_all(Mapping.mapcar((SubLObject)removal_modules_tva_lookup.$sym28$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED, list_utilities.cross_products(mt_lists)), (SubLObject)removal_modules_tva_lookup.$sym29$HLMT_EQUAL, (SubLObject)removal_modules_tva_lookup.UNPROVIDED), (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 12865L)
    public static SubLObject new_tva_support_mts_for_support(final SubLObject support) {
        return (SubLObject)((removal_modules_tva_lookup.$kw30$CODE == arguments.support_module(support)) ? removal_modules_tva_lookup.NIL : Mapping.mapcar((SubLObject)removal_modules_tva_lookup.$sym31$SUPPORT_MT, hl_supports.hl_forward_mt_combos(support)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 13033L)
    public static SubLObject legacy_tva_support_mts_for_support(final SubLObject support) {
        SubLObject new_mts = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject hl_module = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject asent = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject mt = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject tv = (SubLObject)removal_modules_tva_lookup.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_tva_lookup.$list32);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_tva_lookup.$list32);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_tva_lookup.$list32);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_tva_lookup.$list32);
        tv = current.first();
        current = current.rest();
        if (removal_modules_tva_lookup.NIL == current) {
            final SubLObject pred = cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_tva_lookup.ZERO_INTEGER, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            if (removal_modules_tva_lookup.NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
                final SubLObject arg1 = cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                final SubLObject arg2 = cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_tva_lookup.TWO_INTEGER, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                new_mts = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(module, arg1, arg2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            }
            else if (removal_modules_tva_lookup.NIL != kb_accessors.transitive_predicateP(pred)) {
                final SubLObject arg3 = cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                final SubLObject arg4 = cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_tva_lookup.TWO_INTEGER, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                new_mts = gt_methods.gt_superior_in_what_mts(pred, arg3, arg4);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_tva_lookup.$list32);
        }
        return new_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14015L)
    public static SubLObject inference_tva_check(final SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == removal_modules_tva_lookup.UNPROVIDED) {
            mt = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.$kw14$POS;
        }
        SubLObject result = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL == possible_tva_check_solved_by_other_hl_module(asent, mt, sense)) {
            result = tva_check(asent, mt, sense);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14398L)
    public static SubLObject inference_tva_unify(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_tva_lookup.UNPROVIDED) {
            mt = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        SubLObject result = (SubLObject)removal_modules_tva_lookup.NIL;
        final SubLObject tva_unification = tva_inference.tva_unify(asent, mt, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
        if (removal_modules_tva_lookup.NIL != tva_unification) {
            result = Mapping.mapcar(Symbols.symbol_function((SubLObject)removal_modules_tva_lookup.$sym33$FIRST), tva_unification);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14697L)
    public static SubLObject inference_tva_justify(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_tva_lookup.UNPROVIDED) {
            mt = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        SubLObject result = (SubLObject)removal_modules_tva_lookup.NIL;
        result = tva_justify(asent, mt);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14909L)
    public static SubLObject inference_tva_max_floor_mts(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid_mts = (SubLObject)removal_modules_tva_lookup.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_tva_lookup.$sym34$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_tva_lookup.$const35$InferencePSC, thread);
            final SubLObject all_justs = Mapping.mapcar(Symbols.symbol_function((SubLObject)removal_modules_tva_lookup.$sym36$SECOND), tva_inference.tva_unify(asent, (SubLObject)removal_modules_tva_lookup.NIL, (SubLObject)removal_modules_tva_lookup.NIL, (SubLObject)removal_modules_tva_lookup.T, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
            final SubLObject all_max_floors = Mapping.mapcar((SubLObject)removal_modules_tva_lookup.$sym37$TVA_MAX_FLOOR_MTS_OF_JUST, all_justs);
            valid_mts = list_utilities.union_all(all_max_floors, (SubLObject)removal_modules_tva_lookup.$sym29$HLMT_EQUAL, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return valid_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 15306L)
    public static SubLObject make_tva_support(final SubLObject literal, SubLObject sense, SubLObject mt) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.$kw14$POS;
        }
        if (mt == removal_modules_tva_lookup.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject support_sentence = (SubLObject)((sense == removal_modules_tva_lookup.$kw24$NEG) ? ConsesLow.list(removal_modules_tva_lookup.$const38$not, literal) : literal);
        final SubLObject other_hl_module_or_support = possible_tva_check_solved_by_other_hl_module(literal, mt, sense);
        if (removal_modules_tva_lookup.NIL != assertion_handles.assertion_p(other_hl_module_or_support)) {
            if (removal_modules_tva_lookup.NIL != fort_types_interface.transitive_binary_predicate_p(cycl_utilities.atomic_sentence_predicate(literal))) {
                return arguments.make_hl_support((SubLObject)removal_modules_tva_lookup.$kw17$TRANSITIVITY, support_sentence, mt, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            }
            return other_hl_module_or_support;
        }
        else {
            if (removal_modules_tva_lookup.NIL != arguments.support_p(other_hl_module_or_support)) {
                return other_hl_module_or_support;
            }
            if (removal_modules_tva_lookup.NIL != hl_supports.hl_support_module_p(other_hl_module_or_support)) {
                return arguments.make_hl_support(other_hl_module_or_support, support_sentence, mt, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            }
            return arguments.make_hl_support((SubLObject)removal_modules_tva_lookup.$kw39$TVA, support_sentence, mt, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 16356L)
    public static SubLObject removal_tva_required(final SubLObject asent) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL != forts.fort_p(predicate) && (removal_modules_tva_lookup.NIL != tva_utilities.some_tva_for_predicate(predicate) || removal_modules_tva_lookup.NIL != tva_utilities.some_cva_for_predicate(predicate)) && removal_modules_tva_lookup.NIL == list_utilities.tree_find_if((SubLObject)removal_modules_tva_lookup.$sym40$FAST_NON_SKOLEM_INDETERMINATE_TERM_, asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 16741L)
    public static SubLObject removal_tva_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        return removal_tva_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 16982L)
    public static SubLObject removal_tva_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        if (removal_modules_tva_lookup.NIL == cycl_utilities.expression_find_if((SubLObject)removal_modules_tva_lookup.$sym41$NON_SKOLEM_INDETERMINATE_TERM_, asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED) && (removal_modules_tva_lookup.NIL != mt_relevance_macros.all_mts_are_relevantP() || removal_modules_tva_lookup.NIL != mt_relevance_macros.any_mt_is_relevantP() || removal_modules_tva_lookup.NIL != wff.el_wff_assertibleP(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) && removal_modules_tva_lookup.NIL != inference_tva_check(asent, (SubLObject)removal_modules_tva_lookup.NIL, sense)) {
            final SubLObject hl_support = make_tva_support(asent, sense, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
        }
        return (SubLObject)removal_modules_tva_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19180L)
    public static SubLObject removal_tva_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL != removal_tva_unify_required_int(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED) && removal_modules_tva_lookup.NIL != tva_unify_usefulP(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19422L)
    public static SubLObject removal_tva_unify_required_int_internal(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_tva_lookup.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL != removal_tva_required(asent) && removal_modules_tva_lookup.NIL != no_nested_variables_p(asent) && removal_modules_tva_lookup.NIL == el_utilities.ist_sentence_p(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19422L)
    public static SubLObject removal_tva_unify_required_int(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_tva_lookup.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL == v_memoization_state) {
            return removal_tva_unify_required_int_internal(asent, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_tva_lookup.$sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
        if (removal_modules_tva_lookup.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_tva_lookup.$sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT, (SubLObject)removal_modules_tva_lookup.TWO_INTEGER, (SubLObject)removal_modules_tva_lookup.$int46$2048, (SubLObject)removal_modules_tva_lookup.EQUAL, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_tva_lookup.$sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(asent, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)removal_modules_tva_lookup.NIL;
            collision = cdolist_list_var.first();
            while (removal_modules_tva_lookup.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (removal_modules_tva_lookup.NIL != cached_args && removal_modules_tva_lookup.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_tva_unify_required_int_internal(asent, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(asent, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19680L)
    public static SubLObject tva_unify_usefulP_internal(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tva_asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject tva_term_argnums = tva_inference.determine_term_argnums(asent);
        SubLObject found_use_for_unifyP = tva_unify_from_cache_possibleP(asent);
        if (removal_modules_tva_lookup.NIL == found_use_for_unifyP) {
            final SubLObject node_var = tva_asent_pred;
            final SubLObject deck_type = (SubLObject)removal_modules_tva_lookup.$kw50$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)removal_modules_tva_lookup.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)removal_modules_tva_lookup.NIL;
                    final SubLObject _prev_bind_0_$63 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((removal_modules_tva_lookup.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_tva_lookup.NIL != tv_var) ? removal_modules_tva_lookup.$sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (removal_modules_tva_lookup.NIL != tv_var && removal_modules_tva_lookup.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_tva_lookup.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw52$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw55$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.$str56$continue_anyway, (SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw57$WARN)) {
                                Errors.warn((SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)removal_modules_tva_lookup.$str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)removal_modules_tva_lookup.$str56$continue_anyway, (SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_tva_lookup.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds), thread);
                            if (removal_modules_tva_lookup.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_tva_lookup.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_asent_pred, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$66 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_tva_lookup.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(tva_asent_pred, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_tva_lookup.NIL != node_and_predicate_mode && removal_modules_tva_lookup.NIL == found_use_for_unifyP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$69 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject pred = node_var_$69;
                                        final SubLObject _prev_bind_0_$66 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverse_modeP = predicate_mode;
                                            if (removal_modules_tva_lookup.NIL == found_use_for_unifyP) {
                                                SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                                                SubLObject tva_pred = (SubLObject)removal_modules_tva_lookup.NIL;
                                                tva_pred = csome_list_var.first();
                                                while (removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL != csome_list_var) {
                                                    if (removal_modules_tva_lookup.NIL == found_use_for_unifyP) {
                                                        SubLObject csome_list_var_$71 = tva_term_argnums;
                                                        SubLObject argnum = (SubLObject)removal_modules_tva_lookup.NIL;
                                                        argnum = csome_list_var_$71.first();
                                                        while (removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL != csome_list_var_$71) {
                                                            final SubLObject trans_preds = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, pred, argnum, inverse_modeP, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                            if (removal_modules_tva_lookup.NIL == found_use_for_unifyP) {
                                                                SubLObject csome_list_var_$72 = trans_preds;
                                                                SubLObject trans_pred = (SubLObject)removal_modules_tva_lookup.NIL;
                                                                trans_pred = csome_list_var_$72.first();
                                                                while (removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL != csome_list_var_$72) {
                                                                    final SubLObject _prev_bind_0_$67 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
                                                                    try {
                                                                        gt_vars.$gt_handle_non_transitive_predicateP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                                                        final SubLObject arg = cycl_utilities.atomic_sentence_arg(asent, argnum, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                        final SubLObject pcase_var2 = tva_pred;
                                                                        if (pcase_var2.eql(removal_modules_tva_lookup.$const60$transitiveViaArg) || pcase_var2.eql(removal_modules_tva_lookup.$const61$conservativeViaArg)) {
                                                                            if (removal_modules_tva_lookup.ZERO_INTEGER.numL(ghl_search_utilities.ghl_inverse_cardinality(trans_pred, arg))) {
                                                                                found_use_for_unifyP = (SubLObject)removal_modules_tva_lookup.T;
                                                                            }
                                                                        }
                                                                        else if ((pcase_var2.eql(removal_modules_tva_lookup.$const62$transitiveViaArgInverse) || pcase_var2.eql(removal_modules_tva_lookup.$const63$conservativeViaArgInverse)) && removal_modules_tva_lookup.ZERO_INTEGER.numL(ghl_search_utilities.ghl_predicate_cardinality(trans_pred, arg))) {
                                                                            found_use_for_unifyP = (SubLObject)removal_modules_tva_lookup.T;
                                                                        }
                                                                    }
                                                                    finally {
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
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds));
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
                                            for (rest = (SubLObject)removal_modules_tva_lookup.NIL, rest = accessible_modules; removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$68 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_tva_lookup.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var_$69);
                                                    if (removal_modules_tva_lookup.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED));
                                                        if (removal_modules_tva_lookup.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED));
                                                            if (removal_modules_tva_lookup.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (removal_modules_tva_lookup.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$77 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$77); iteration_state_$77 = dictionary_contents.do_dictionary_contents_next(iteration_state_$77)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$77);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (removal_modules_tva_lookup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (removal_modules_tva_lookup.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_tva_lookup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (removal_modules_tva_lookup.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (removal_modules_tva_lookup.NIL == found_use_for_unifyP) {
                                                                                                csome_list_var2 = sol;
                                                                                                node_vars_link_node2 = (SubLObject)removal_modules_tva_lookup.NIL;
                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                while (removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL != csome_list_var2) {
                                                                                                    if (removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)removal_modules_tva_lookup.$str64$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$70, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$77);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$69, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_tva_lookup.FIVE_INTEGER, (SubLObject)removal_modules_tva_lookup.$str65$attempting_to_bind_direction_link, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (removal_modules_tva_lookup.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                        new_list = ((removal_modules_tva_lookup.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED)));
                                                        for (rest_$79 = (SubLObject)removal_modules_tva_lookup.NIL, rest_$79 = new_list; removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL != rest_$79; rest_$79 = rest_$79.rest()) {
                                                            generating_fn = rest_$79.first();
                                                            _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (removal_modules_tva_lookup.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_tva_lookup.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (removal_modules_tva_lookup.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (removal_modules_tva_lookup.NIL == found_use_for_unifyP) {
                                                                        csome_list_var3 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)removal_modules_tva_lookup.NIL;
                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                        while (removal_modules_tva_lookup.NIL == found_use_for_unifyP && removal_modules_tva_lookup.NIL != csome_list_var3) {
                                                                            if (removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)removal_modules_tva_lookup.$str64$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$71, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$67, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$68, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$66, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$68, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$66, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$65, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_tva_lookup.TWO_INTEGER, (SubLObject)removal_modules_tva_lookup.$str66$Node__a_does_not_pass_sbhl_type_t, tva_asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED)), (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$65, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$64, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$63, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return found_use_for_unifyP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19680L)
    public static SubLObject tva_unify_usefulP(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL == v_memoization_state) {
            return tva_unify_usefulP_internal(asent);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_tva_lookup.$sym47$TVA_UNIFY_USEFUL_, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
        if (removal_modules_tva_lookup.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_tva_lookup.$sym47$TVA_UNIFY_USEFUL_, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.$int46$2048, (SubLObject)removal_modules_tva_lookup.EQUAL, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_tva_lookup.$sym47$TVA_UNIFY_USEFUL_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(tva_unify_usefulP_internal(asent)));
            memoization_state.caching_state_put(caching_state, asent, results, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 21062L)
    public static SubLObject tva_unify_from_cache_possibleP(final SubLObject asent) {
        final SubLObject arg0 = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject cachedP = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject index_argnum = (SubLObject)removal_modules_tva_lookup.ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_tva_lookup.$kw13$IGNORE);
        SubLObject rest;
        SubLObject index_arg;
        for (rest = (SubLObject)removal_modules_tva_lookup.NIL, rest = args; removal_modules_tva_lookup.NIL == cachedP && removal_modules_tva_lookup.NIL != rest; cachedP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL != variables.fully_bound_p(index_arg) && removal_modules_tva_lookup.NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(arg0, index_argnum)), rest = rest.rest()) {
            index_arg = rest.first();
            index_argnum = Numbers.add(index_argnum, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER);
        }
        return cachedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 21401L)
    public static SubLObject no_nested_variables_p(final SubLObject asent) {
        SubLObject foundP = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL == foundP) {
            SubLObject csome_list_var = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            SubLObject arg = (SubLObject)removal_modules_tva_lookup.NIL;
            arg = csome_list_var.first();
            while (removal_modules_tva_lookup.NIL == foundP && removal_modules_tva_lookup.NIL != csome_list_var) {
                if (removal_modules_tva_lookup.NIL == cycl_grammar.hl_variable_p(arg) && removal_modules_tva_lookup.NIL != list_utilities.sublisp_boolean(list_utilities.tree_gather(arg, (SubLObject)removal_modules_tva_lookup.$sym67$HL_VARIABLE_P, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED))) {
                    foundP = (SubLObject)removal_modules_tva_lookup.T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == foundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 21790L)
    public static SubLObject removal_tva_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tva_asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject cdolist_list_var;
        final SubLObject tva_term_argnums = cdolist_list_var = tva_inference.determine_term_argnums(asent);
        SubLObject tva_term_argnum = (SubLObject)removal_modules_tva_lookup.NIL;
        tva_term_argnum = cdolist_list_var.first();
        while (removal_modules_tva_lookup.NIL != cdolist_list_var) {
            if (removal_modules_tva_lookup.NIL == tva_utilities.any_tva_for_argP(tva_asent_pred, tva_term_argnum)) {
                final SubLObject v_term = cycl_utilities.sentence_arg(asent, tva_term_argnum, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                SubLObject fast_total = (SubLObject)removal_modules_tva_lookup.ZERO_INTEGER;
                final SubLObject node_var = tva_asent_pred;
                final SubLObject deck_type = (SubLObject)removal_modules_tva_lookup.$kw50$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)removal_modules_tva_lookup.NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)removal_modules_tva_lookup.NIL;
                        final SubLObject _prev_bind_0_$82 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((removal_modules_tva_lookup.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_tva_lookup.NIL != tv_var) ? removal_modules_tva_lookup.$sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (removal_modules_tva_lookup.NIL != tv_var && removal_modules_tva_lookup.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_tva_lookup.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw52$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw55$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.$str56$continue_anyway, (SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_tva_lookup.$kw57$WARN)) {
                                    Errors.warn((SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)removal_modules_tva_lookup.$str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)removal_modules_tva_lookup.$str56$continue_anyway, (SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$83 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$84 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_tva_lookup.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds), thread);
                                if (removal_modules_tva_lookup.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_tva_lookup.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_asent_pred, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$84 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$85 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$87 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_tva_lookup.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(tva_asent_pred, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_tva_lookup.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$88 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject pred = node_var_$88;
                                            final SubLObject _prev_bind_0_$85 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_modeP = predicate_mode;
                                                if (removal_modules_tva_lookup.NIL != cycl_grammar.cycl_represented_term_p(v_term)) {
                                                    fast_total = Numbers.add(fast_total, kb_indexing.num_gaf_arg_index(v_term, tva_term_argnum, pred, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
                                                }
                                                SubLObject cdolist_list_var_$90;
                                                final SubLObject accessible_modules = cdolist_list_var_$90 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds));
                                                SubLObject module_var = (SubLObject)removal_modules_tva_lookup.NIL;
                                                module_var = cdolist_list_var_$90.first();
                                                while (removal_modules_tva_lookup.NIL != cdolist_list_var_$90) {
                                                    final SubLObject _prev_bind_0_$86 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$86 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_tva_lookup.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$88);
                                                        if (removal_modules_tva_lookup.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED));
                                                            if (removal_modules_tva_lookup.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED));
                                                                if (removal_modules_tva_lookup.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_tva_lookup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (removal_modules_tva_lookup.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$87 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$94;
                                                                                for (iteration_state_$94 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_tva_lookup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$94); iteration_state_$94 = dictionary_contents.do_dictionary_contents_next(iteration_state_$94)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$94);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (removal_modules_tva_lookup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$88 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (removal_modules_tva_lookup.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_tva_lookup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_tva_lookup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (removal_modules_tva_lookup.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)removal_modules_tva_lookup.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (removal_modules_tva_lookup.NIL != csome_list_var) {
                                                                                                    if (removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)removal_modules_tva_lookup.$str64$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$88, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$94);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$87, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_tva_lookup.FIVE_INTEGER, (SubLObject)removal_modules_tva_lookup.$str65$attempting_to_bind_direction_link, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (removal_modules_tva_lookup.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$91;
                                                            final SubLObject new_list = cdolist_list_var_$91 = ((removal_modules_tva_lookup.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)removal_modules_tva_lookup.NIL;
                                                            generating_fn = cdolist_list_var_$91.first();
                                                            while (removal_modules_tva_lookup.NIL != cdolist_list_var_$91) {
                                                                final SubLObject _prev_bind_0_$89 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (removal_modules_tva_lookup.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_tva_lookup.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_tva_lookup.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (removal_modules_tva_lookup.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)removal_modules_tva_lookup.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (removal_modules_tva_lookup.NIL != csome_list_var2) {
                                                                            if (removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)removal_modules_tva_lookup.$str64$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$89, thread);
                                                                }
                                                                cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                                generating_fn = cdolist_list_var_$91.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$86, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$86, thread);
                                                    }
                                                    cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                                                    module_var = cdolist_list_var_$90.first();
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$85, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$87, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$85, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$84, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_tva_lookup.TWO_INTEGER, (SubLObject)removal_modules_tva_lookup.$str66$Node__a_does_not_pass_sbhl_type_t, tva_asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED)), (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$84, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$83, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$82, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
                if (fast_total.numG((SubLObject)removal_modules_tva_lookup.ZERO_INTEGER)) {
                    return fast_total;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tva_term_argnum = cdolist_list_var.first();
        }
        SubLObject total = (SubLObject)removal_modules_tva_lookup.ZERO_INTEGER;
        SubLObject cdolist_list_var2 = tva_term_argnums;
        SubLObject argnum = (SubLObject)removal_modules_tva_lookup.NIL;
        argnum = cdolist_list_var2.first();
        while (removal_modules_tva_lookup.NIL != cdolist_list_var2) {
            SubLObject spec_preds = (SubLObject)removal_modules_tva_lookup.NIL;
            SubLObject inverse_preds = (SubLObject)removal_modules_tva_lookup.NIL;
            final SubLObject node_var2 = tva_asent_pred;
            final SubLObject deck_type2 = (SubLObject)removal_modules_tva_lookup.$kw50$QUEUE;
            final SubLObject recur_deck2 = deck.create_deck(deck_type2);
            SubLObject node_and_predicate_mode2 = (SubLObject)removal_modules_tva_lookup.NIL;
            SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var2 = (SubLObject)removal_modules_tva_lookup.NIL;
                    final SubLObject _prev_bind_0_$91 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((removal_modules_tva_lookup.NIL != tv_var2) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_tva_lookup.NIL != tv_var2) ? removal_modules_tva_lookup.$sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (removal_modules_tva_lookup.NIL != tv_var2 && removal_modules_tva_lookup.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_tva_lookup.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                            final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var2.eql((SubLObject)removal_modules_tva_lookup.$kw52$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                            }
                            else if (pcase_var2.eql((SubLObject)removal_modules_tva_lookup.$kw55$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.$str56$continue_anyway, (SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                            }
                            else if (pcase_var2.eql((SubLObject)removal_modules_tva_lookup.$kw57$WARN)) {
                                Errors.warn((SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)removal_modules_tva_lookup.$str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)removal_modules_tva_lookup.$str56$continue_anyway, (SubLObject)removal_modules_tva_lookup.$str53$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_tva_lookup.$sym54$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_tva_lookup.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds), thread);
                            if (removal_modules_tva_lookup.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_tva_lookup.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_asent_pred, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$93 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$88 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$88 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_tva_lookup.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                    for (node_and_predicate_mode2 = (SubLObject)ConsesLow.list(tva_asent_pred, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_tva_lookup.NIL != node_and_predicate_mode2; node_and_predicate_mode2 = deck.deck_pop(recur_deck2)) {
                                        final SubLObject node_var_$89 = node_and_predicate_mode2.first();
                                        final SubLObject predicate_mode2 = conses_high.second(node_and_predicate_mode2);
                                        final SubLObject pred2 = node_var_$89;
                                        final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode2, thread);
                                            final SubLObject inverse_modeP2 = predicate_mode2;
                                            SubLObject csome_list_var3 = tva_utilities.get_tva_predicates();
                                            SubLObject tva_pred = (SubLObject)removal_modules_tva_lookup.NIL;
                                            tva_pred = csome_list_var3.first();
                                            while (removal_modules_tva_lookup.NIL != csome_list_var3) {
                                                SubLObject cdolist_list_var_$92;
                                                final SubLObject trans_preds = cdolist_list_var_$92 = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, pred2, argnum, inverse_modeP2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                SubLObject trans_pred = (SubLObject)removal_modules_tva_lookup.NIL;
                                                trans_pred = cdolist_list_var_$92.first();
                                                while (removal_modules_tva_lookup.NIL != cdolist_list_var_$92) {
                                                    if (!SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == inverse_modeP2).eql((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == subl_promotions.memberP(tva_pred, (SubLObject)removal_modules_tva_lookup.$list68, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)))) {
                                                        inverse_preds = (SubLObject)ConsesLow.cons(trans_pred, inverse_preds);
                                                    }
                                                    else {
                                                        spec_preds = (SubLObject)ConsesLow.cons(trans_pred, spec_preds);
                                                    }
                                                    cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                    trans_pred = cdolist_list_var_$92.first();
                                                }
                                                csome_list_var3 = csome_list_var3.rest();
                                                tva_pred = csome_list_var3.first();
                                            }
                                            SubLObject cdolist_list_var_$93;
                                            final SubLObject accessible_modules = cdolist_list_var_$93 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_tva_lookup.$const59$genlPreds));
                                            SubLObject module_var = (SubLObject)removal_modules_tva_lookup.NIL;
                                            module_var = cdolist_list_var_$93.first();
                                            while (removal_modules_tva_lookup.NIL != cdolist_list_var_$93) {
                                                final SubLObject _prev_bind_0_$95 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$89 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_tva_lookup.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$89);
                                                    if (removal_modules_tva_lookup.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED));
                                                        if (removal_modules_tva_lookup.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED));
                                                            if (removal_modules_tva_lookup.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_tva_lookup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (removal_modules_tva_lookup.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$95;
                                                                            for (iteration_state_$95 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_tva_lookup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$95); iteration_state_$95 = dictionary_contents.do_dictionary_contents_next(iteration_state_$95)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$95);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (removal_modules_tva_lookup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$97 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (removal_modules_tva_lookup.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_tva_lookup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_tva_lookup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (removal_modules_tva_lookup.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck2);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)removal_modules_tva_lookup.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (removal_modules_tva_lookup.NIL != csome_list_var) {
                                                                                                if (removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck2);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)removal_modules_tva_lookup.$str64$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$97, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$95);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$96, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_tva_lookup.FIVE_INTEGER, (SubLObject)removal_modules_tva_lookup.$str65$attempting_to_bind_direction_link, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (removal_modules_tva_lookup.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$94;
                                                        final SubLObject new_list = cdolist_list_var_$94 = ((removal_modules_tva_lookup.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)removal_modules_tva_lookup.NIL;
                                                        generating_fn = cdolist_list_var_$94.first();
                                                        while (removal_modules_tva_lookup.NIL != cdolist_list_var_$94) {
                                                            final SubLObject _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (removal_modules_tva_lookup.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_tva_lookup.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_tva_lookup.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (removal_modules_tva_lookup.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck2);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)removal_modules_tva_lookup.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (removal_modules_tva_lookup.NIL != csome_list_var2) {
                                                                        if (removal_modules_tva_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck2);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)removal_modules_tva_lookup.$str64$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$98, thread);
                                                            }
                                                            cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                                                            generating_fn = cdolist_list_var_$94.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$89, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$95, thread);
                                                }
                                                cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                                                module_var = cdolist_list_var_$93.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$94, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$88, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$88, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$93, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_tva_lookup.TWO_INTEGER, (SubLObject)removal_modules_tva_lookup.$str66$Node__a_does_not_pass_sbhl_type_t, tva_asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_tva_lookup.UNPROVIDED)), (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_10, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_9, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_8, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$87, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$92, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$91, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_6, thread);
            }
            _prev_bind_6 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
            try {
                gt_vars.$gt_handle_non_transitive_predicateP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                final SubLObject arg = cycl_utilities.atomic_sentence_arg(asent, argnum, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                SubLObject cdolist_list_var_$95 = genl_predicates.min_predicates(spec_preds, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                SubLObject trans_pred2 = (SubLObject)removal_modules_tva_lookup.NIL;
                trans_pred2 = cdolist_list_var_$95.first();
                while (removal_modules_tva_lookup.NIL != cdolist_list_var_$95) {
                    total = Numbers.add(total, ghl_search_utilities.ghl_inverse_cardinality(trans_pred2, arg));
                    cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                    trans_pred2 = cdolist_list_var_$95.first();
                }
                SubLObject cdolist_list_var_$96 = genl_predicates.max_predicates(inverse_preds, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                trans_pred2 = (SubLObject)removal_modules_tva_lookup.NIL;
                trans_pred2 = cdolist_list_var_$96.first();
                while (removal_modules_tva_lookup.NIL != cdolist_list_var_$96) {
                    total = Numbers.add(total, ghl_search_utilities.ghl_predicate_cardinality(trans_pred2, arg));
                    cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                    trans_pred2 = cdolist_list_var_$96.first();
                }
            }
            finally {
                gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_6, thread);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            argnum = cdolist_list_var2.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 23694L)
    public static SubLObject removal_tva_unify_iterator(final SubLObject asent) {
        return iteration.new_list_iterator(inference_tva_unify(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 25016L)
    public static SubLObject removal_tva_unify_closure_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        final SubLObject inference = inference_macros.current_controlling_inference();
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL != inference_datastructures_inference.inference_p(inference) && removal_modules_tva_lookup.$kw6$NONE != inference_datastructures_inference.inference_transitive_closure_mode(inference) && removal_modules_tva_lookup.NIL != removal_tva_unify_required_int(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 25416L)
    public static SubLObject removal_tva_unify_closure_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_tva_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_tva_lookup.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject basic_tva_estimate = removal_tva_unify_cost(asent, sense);
        SubLObject trans_coefficient = (SubLObject)removal_modules_tva_lookup.ZERO_INTEGER;
        if (!basic_tva_estimate.isZero()) {
            SubLObject csome_list_var = tva_utilities.get_tva_predicates();
            SubLObject tva_pred = (SubLObject)removal_modules_tva_lookup.NIL;
            tva_pred = csome_list_var.first();
            while (removal_modules_tva_lookup.NIL != csome_list_var) {
                final SubLObject pred_var = tva_pred;
                if (removal_modules_tva_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(asent_pred, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(asent_pred, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_tva_lookup.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_tva_lookup.NIL;
                    while (removal_modules_tva_lookup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_tva_lookup.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_tva_lookup.$kw19$GAF, (SubLObject)removal_modules_tva_lookup.NIL, (SubLObject)removal_modules_tva_lookup.NIL);
                                SubLObject done_var_$119 = (SubLObject)removal_modules_tva_lookup.NIL;
                                final SubLObject token_var_$120 = (SubLObject)removal_modules_tva_lookup.NIL;
                                while (removal_modules_tva_lookup.NIL == done_var_$119) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$120);
                                    final SubLObject valid_$121 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$120.eql(assertion));
                                    if (removal_modules_tva_lookup.NIL != valid_$121) {
                                        trans_coefficient = Numbers.add(trans_coefficient, kb_indexing.relevant_num_predicate_extent_index(assertions_high.gaf_arg2(assertion)));
                                    }
                                    done_var_$119 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid_$121);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_tva_lookup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == valid);
                    }
                }
                csome_list_var = csome_list_var.rest();
                tva_pred = csome_list_var.first();
            }
        }
        final SubLObject cost_estimate = Numbers.add(basic_tva_estimate, Numbers.multiply(basic_tva_estimate, trans_coefficient));
        SubLObject cardinality_estimate = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL == sksi_query_utilities.some_sksi_removal_module_registeredP()) {
            final SubLObject var_argnums = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)removal_modules_tva_lookup.EQL), (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            SubLObject argnum = (SubLObject)removal_modules_tva_lookup.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_tva_lookup.$kw13$IGNORE);
            SubLObject arg = (SubLObject)removal_modules_tva_lookup.NIL;
            arg = cdolist_list_var.first();
            while (removal_modules_tva_lookup.NIL != cdolist_list_var) {
                argnum = Numbers.add(argnum, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER);
                if (removal_modules_tva_lookup.NIL != cycl_grammar.hl_variable_p(arg)) {
                    dictionary_utilities.dictionary_push(var_argnums, arg, argnum);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_argnums)); removal_modules_tva_lookup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject argnums = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject var_cardinality_estimate = (SubLObject)removal_modules_tva_lookup.NIL;
                SubLObject cdolist_list_var2 = argnums;
                SubLObject argnum2 = (SubLObject)removal_modules_tva_lookup.NIL;
                argnum2 = cdolist_list_var2.first();
                while (removal_modules_tva_lookup.NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$122 = kb_accessors.argn_isa(asent_pred, argnum2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                    SubLObject arg_isa = (SubLObject)removal_modules_tva_lookup.NIL;
                    arg_isa = cdolist_list_var_$122.first();
                    while (removal_modules_tva_lookup.NIL != cdolist_list_var_$122) {
                        if (removal_modules_tva_lookup.NIL != var_cardinality_estimate) {
                            var_cardinality_estimate = Numbers.min(var_cardinality_estimate, cardinality_estimates.instance_cardinality(arg_isa));
                        }
                        else {
                            var_cardinality_estimate = cardinality_estimates.instance_cardinality(arg_isa);
                        }
                        cdolist_list_var_$122 = cdolist_list_var_$122.rest();
                        arg_isa = cdolist_list_var_$122.first();
                    }
                    SubLObject cdolist_list_var_$123 = kb_accessors.argn_genl(asent_pred, argnum2, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                    SubLObject arg_genl = (SubLObject)removal_modules_tva_lookup.NIL;
                    arg_genl = cdolist_list_var_$123.first();
                    while (removal_modules_tva_lookup.NIL != cdolist_list_var_$123) {
                        if (removal_modules_tva_lookup.NIL != var_cardinality_estimate) {
                            var_cardinality_estimate = Numbers.min(var_cardinality_estimate, cardinality_estimates.spec_cardinality(arg_genl));
                        }
                        else {
                            var_cardinality_estimate = cardinality_estimates.spec_cardinality(arg_genl);
                        }
                        cdolist_list_var_$123 = cdolist_list_var_$123.rest();
                        arg_genl = cdolist_list_var_$123.first();
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    argnum2 = cdolist_list_var2.first();
                }
                if (removal_modules_tva_lookup.NIL != var_cardinality_estimate) {
                    if (removal_modules_tva_lookup.NIL != cardinality_estimate) {
                        cardinality_estimate = Numbers.multiply(cardinality_estimate, var_cardinality_estimate);
                    }
                    else {
                        cardinality_estimate = var_cardinality_estimate;
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        final SubLObject upper_estimate = (removal_modules_tva_lookup.NIL != cardinality_estimate) ? Numbers.min(cardinality_estimate, cost_estimate) : cost_estimate;
        final SubLObject lower_estimate = Numbers.max((SubLObject)removal_modules_tva_lookup.ONE_INTEGER, basic_tva_estimate);
        final SubLObject final_estimate = Numbers.round(number_utilities.four_significant_digits(Numbers.sqrt(Numbers.multiply(upper_estimate, lower_estimate))), (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
        return final_estimate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 27919L)
    public static SubLObject removal_tva_unify_closure_iterator(final SubLObject asent) {
        if (removal_modules_tva_lookup.NIL == cycl_utilities.expression_find_if((SubLObject)removal_modules_tva_lookup.$sym41$NON_SKOLEM_INDETERMINATE_TERM_, asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
            return tva_inference.tva_unify_closure_iterator(asent, (SubLObject)removal_modules_tva_lookup.NIL, (SubLObject)((removal_modules_tva_lookup.NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_transitive_closure_mode(inference_macros.current_controlling_inference()) : removal_modules_tva_lookup.$kw12$ALL));
        }
        return (SubLObject)removal_modules_tva_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 29381L)
    public static SubLObject removal_tva_unify_closure_conjunction_applicability(final SubLObject contextualized_dnf_clause) {
        SubLObject subclause_specs = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject pos_index = (SubLObject)removal_modules_tva_lookup.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject pos_lit = (SubLObject)removal_modules_tva_lookup.NIL;
        pos_lit = cdolist_list_var.first();
        while (removal_modules_tva_lookup.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pos_lit;
            SubLObject pos_mt = (SubLObject)removal_modules_tva_lookup.NIL;
            SubLObject pos_asent = (SubLObject)removal_modules_tva_lookup.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list71);
            pos_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list71);
            pos_asent = current.first();
            current = current.rest();
            if (removal_modules_tva_lookup.NIL == current) {
                if (removal_modules_tva_lookup.NIL != removal_tva_unify_closure_conjunction_appropriate_asentP(pos_asent, pos_mt)) {
                    final SubLObject vars = el_utilities.literal_free_variables(pos_asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                    SubLObject pos_indices = (SubLObject)ConsesLow.list(pos_index);
                    SubLObject index = (SubLObject)removal_modules_tva_lookup.ZERO_INTEGER;
                    SubLObject cdolist_list_var_$124 = clauses.pos_lits(contextualized_dnf_clause);
                    SubLObject lit = (SubLObject)removal_modules_tva_lookup.NIL;
                    lit = cdolist_list_var_$124.first();
                    while (removal_modules_tva_lookup.NIL != cdolist_list_var_$124) {
                        if (!index.eql(pos_index)) {
                            SubLObject current_$126;
                            final SubLObject datum_$125 = current_$126 = lit;
                            SubLObject mt = (SubLObject)removal_modules_tva_lookup.NIL;
                            SubLObject asent = (SubLObject)removal_modules_tva_lookup.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$126, datum_$125, (SubLObject)removal_modules_tva_lookup.$list72);
                            mt = current_$126.first();
                            current_$126 = current_$126.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$126, datum_$125, (SubLObject)removal_modules_tva_lookup.$list72);
                            asent = current_$126.first();
                            current_$126 = current_$126.rest();
                            if (removal_modules_tva_lookup.NIL == current_$126) {
                                if (removal_modules_tva_lookup.NIL != removal_tva_unify_closure_conjunction_appropriate_asentP(asent, mt) && removal_modules_tva_lookup.NIL != list_utilities.sets_equalP(vars, el_utilities.literal_free_variables(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED), Symbols.symbol_function((SubLObject)removal_modules_tva_lookup.EQL))) {
                                    pos_indices = (SubLObject)ConsesLow.cons(index, pos_indices);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$125, (SubLObject)removal_modules_tva_lookup.$list72);
                            }
                        }
                        index = Numbers.add(index, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER);
                        cdolist_list_var_$124 = cdolist_list_var_$124.rest();
                        lit = cdolist_list_var_$124.first();
                    }
                    if (removal_modules_tva_lookup.NIL != list_utilities.lengthG(pos_indices, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER, (SubLObject)removal_modules_tva_lookup.UNPROVIDED)) {
                        subclause_specs = (SubLObject)ConsesLow.cons(clause_utilities.new_subclause_spec((SubLObject)removal_modules_tva_lookup.NIL, Sort.sort(pos_indices, Symbols.symbol_function((SubLObject)removal_modules_tva_lookup.$sym73$_), (SubLObject)removal_modules_tva_lookup.UNPROVIDED)), subclause_specs);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_tva_lookup.$list71);
            }
            pos_index = Numbers.add(pos_index, (SubLObject)removal_modules_tva_lookup.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(subclause_specs, Symbols.symbol_function((SubLObject)removal_modules_tva_lookup.EQUAL), (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 31138L)
    public static SubLObject removal_tva_unify_closure_conjunction_appropriate_asentP(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject result = (SubLObject)removal_modules_tva_lookup.NIL;
        if (removal_modules_tva_lookup.NIL != forts.fort_p(pred) && removal_modules_tva_lookup.NIL == el_utilities.closedP(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED) && removal_modules_tva_lookup.NIL != removal_tva_unify_closure_conjunction_appropriate_predicateP(pred)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                result = removal_tva_unify_required_int(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 31535L)
    public static SubLObject removal_tva_unify_closure_conjunction_appropriate_predicateP(final SubLObject predicate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_tva_lookup.NIL == hl_supports.hl_predicate_p(predicate) && removal_modules_tva_lookup.NIL == sbhl_module_utilities.sbhl_predicate_p(predicate) && removal_modules_tva_lookup.NIL == sbhl_time_utilities.sbhl_time_predicate_p(predicate) && removal_modules_tva_lookup.NIL == inference_modules.solely_specific_removal_module_predicateP(predicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 31835L)
    public static SubLObject removal_tva_unify_closure_conjunction_cost(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)removal_modules_tva_lookup.NIL;
        lit = cdolist_list_var.first();
        while (removal_modules_tva_lookup.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = lit;
            SubLObject mt = (SubLObject)removal_modules_tva_lookup.NIL;
            SubLObject asent = (SubLObject)removal_modules_tva_lookup.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list72);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list72);
            asent = current.first();
            current = current.rest();
            if (removal_modules_tva_lookup.NIL == current) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject asent_cost = removal_tva_unify_closure_cost(asent, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                    if (removal_modules_tva_lookup.NIL != asent_cost) {
                        if (removal_modules_tva_lookup.NIL != cost) {
                            cost = Numbers.min(cost, asent_cost);
                        }
                        else {
                            cost = asent_cost;
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_tva_lookup.$list72);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 32326L)
    public static SubLObject removal_tva_unify_closure_conjunction_output_generate(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject closure = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject emptyP = (SubLObject)removal_modules_tva_lookup.NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)removal_modules_tva_lookup.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)removal_modules_tva_lookup.T, thread);
            SubLObject rest;
            SubLObject lit;
            SubLObject current;
            SubLObject datum;
            SubLObject mt;
            SubLObject asent;
            SubLObject asent_closure;
            for (rest = (SubLObject)removal_modules_tva_lookup.NIL, rest = clauses.pos_lits(contextualized_dnf_clause); removal_modules_tva_lookup.NIL == emptyP && removal_modules_tva_lookup.NIL != rest; rest = rest.rest()) {
                lit = rest.first();
                datum = (current = lit);
                mt = (SubLObject)removal_modules_tva_lookup.NIL;
                asent = (SubLObject)removal_modules_tva_lookup.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list72);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list72);
                asent = current.first();
                current = current.rest();
                if (removal_modules_tva_lookup.NIL == current) {
                    asent_closure = tva_inference.tva_unify(asent, mt, (SubLObject)removal_modules_tva_lookup.NIL, (SubLObject)removal_modules_tva_lookup.NIL, (SubLObject)removal_modules_tva_lookup.$kw12$ALL, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                    if (removal_modules_tva_lookup.NIL != closure) {
                        if (removal_modules_tva_lookup.NIL != asent_closure) {
                            closure = set_utilities.set_intersection((SubLObject)ConsesLow.list(closure, set_utilities.make_set_from_list(asent_closure, Symbols.symbol_function((SubLObject)removal_modules_tva_lookup.EQUAL))), Symbols.symbol_function((SubLObject)removal_modules_tva_lookup.EQUAL));
                        }
                        else {
                            set.clear_set(closure);
                        }
                    }
                    else {
                        closure = set_utilities.make_set_from_list(asent_closure, Symbols.symbol_function((SubLObject)removal_modules_tva_lookup.EQUAL));
                    }
                    if (removal_modules_tva_lookup.NIL != set.empty_set_p(closure)) {
                        emptyP = (SubLObject)removal_modules_tva_lookup.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_tva_lookup.$list72);
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return (removal_modules_tva_lookup.NIL != emptyP) ? iteration.new_null_iterator() : new_tva_closure_crm_iterator(closure, contextualized_dnf_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 33099L)
    public static SubLObject new_tva_closure_crm_iterator(final SubLObject closure, final SubLObject contextualized_dnf_clause) {
        return iteration.new_iterator(tva_closure_crm_iterator_state(closure, contextualized_dnf_clause), (SubLObject)removal_modules_tva_lookup.$sym74$TVA_CLOSURE_CRM_ITERATOR_DONE, (SubLObject)removal_modules_tva_lookup.$sym75$TVA_CLOSURE_CRM_ITERATOR_NEXT, (SubLObject)removal_modules_tva_lookup.$sym76$TVA_CLOSURE_CRM_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 33390L)
    public static SubLObject tva_closure_crm_iterator_state(final SubLObject closure, final SubLObject contextualized_dnf_clause) {
        final SubLObject closure_iterator = set.new_set_iterator(closure);
        SubLObject support_templates = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)removal_modules_tva_lookup.NIL;
        lit = cdolist_list_var.first();
        while (removal_modules_tva_lookup.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = lit;
            SubLObject mt = (SubLObject)removal_modules_tva_lookup.NIL;
            SubLObject asent = (SubLObject)removal_modules_tva_lookup.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list72);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_tva_lookup.$list72);
            asent = current.first();
            current = current.rest();
            if (removal_modules_tva_lookup.NIL == current) {
                final SubLObject support_template = arguments.make_hl_support((SubLObject)removal_modules_tva_lookup.$kw39$TVA, asent, mt, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
                support_templates = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(support_template), support_templates);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_tva_lookup.$list72);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(closure_iterator, Sequences.nreverse(support_templates));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 33835L)
    public static SubLObject tva_closure_crm_iterator_done(final SubLObject state) {
        SubLObject closure_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject support_templates = (SubLObject)removal_modules_tva_lookup.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_tva_lookup.$list77);
        closure_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_tva_lookup.$list77);
        support_templates = current.first();
        current = current.rest();
        if (removal_modules_tva_lookup.NIL == current) {
            return iteration.iteration_done(closure_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_tva_lookup.$list77);
        return (SubLObject)removal_modules_tva_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 34035L)
    public static SubLObject tva_closure_crm_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject closure_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject support_templates = (SubLObject)removal_modules_tva_lookup.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_tva_lookup.$list77);
        closure_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_tva_lookup.$list77);
        support_templates = current.first();
        current = current.rest();
        if (removal_modules_tva_lookup.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_tva_lookup.$list77);
            return (SubLObject)removal_modules_tva_lookup.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject result = iteration.iteration_next(closure_iterator);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_tva_lookup.NIL != validP) {
            final SubLObject v_bindings = result.first();
            final SubLObject supports = conses_high.sublis(v_bindings, support_templates, (SubLObject)removal_modules_tva_lookup.UNPROVIDED, (SubLObject)removal_modules_tva_lookup.UNPROVIDED);
            return Values.values((SubLObject)ConsesLow.list(v_bindings, supports), state, (SubLObject)removal_modules_tva_lookup.NIL);
        }
        return Values.values((SubLObject)removal_modules_tva_lookup.NIL, state, (SubLObject)removal_modules_tva_lookup.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 34434L)
    public static SubLObject tva_closure_crm_iterator_finalize(final SubLObject state) {
        SubLObject closure_iterator = (SubLObject)removal_modules_tva_lookup.NIL;
        SubLObject support_templates = (SubLObject)removal_modules_tva_lookup.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_tva_lookup.$list77);
        closure_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_tva_lookup.$list77);
        support_templates = current.first();
        current = current.rest();
        if (removal_modules_tva_lookup.NIL == current) {
            return iteration.iteration_finalize(closure_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_tva_lookup.$list77);
        return (SubLObject)removal_modules_tva_lookup.NIL;
    }
    
    public static SubLObject declare_removal_modules_tva_lookup_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_pos_preference", "TVA-POS-PREFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_asent_has_fully_bound_argP", "TVA-ASENT-HAS-FULLY-BOUND-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_applicable_to_some_bindable_argP", "TVA-APPLICABLE-TO-SOME-BINDABLE-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "possible_tva_check_solved_by_other_hl_module", "POSSIBLE-TVA-CHECK-SOLVED-BY-OTHER-HL-MODULE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_determine_lookup_success", "TVA-DETERMINE-LOOKUP-SUCCESS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_determine_genl_preds_success", "TVA-DETERMINE-GENL-PREDS-SUCCESS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_determine_genl_preds_lookup_int", "TVA-DETERMINE-GENL-PREDS-LOOKUP-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_determine_genl_inverse_success", "TVA-DETERMINE-GENL-INVERSE-SUCCESS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_determine_genl_inverse_lookup_int", "TVA-DETERMINE-GENL-INVERSE-LOOKUP-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "atomic_sentence_valid_wrt_irreflexivityP", "ATOMIC-SENTENCE-VALID-WRT-IRREFLEXIVITY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "arguments_valid_wrt_irreflexivityP", "ARGUMENTS-VALID-WRT-IRREFLEXIVITY?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_check", "TVA-CHECK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_justify", "TVA-JUSTIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_answer_justification_betterP", "TVA-ANSWER-JUSTIFICATION-BETTER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_max_floor_mts_of_just", "TVA-MAX-FLOOR-MTS-OF-JUST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "new_tva_support_mts_for_support", "NEW-TVA-SUPPORT-MTS-FOR-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "legacy_tva_support_mts_for_support", "LEGACY-TVA-SUPPORT-MTS-FOR-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "inference_tva_check", "INFERENCE-TVA-CHECK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "inference_tva_unify", "INFERENCE-TVA-UNIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "inference_tva_justify", "INFERENCE-TVA-JUSTIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "inference_tva_max_floor_mts", "INFERENCE-TVA-MAX-FLOOR-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "make_tva_support", "MAKE-TVA-SUPPORT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_required", "REMOVAL-TVA-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_check_required", "REMOVAL-TVA-CHECK-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_check_expand", "REMOVAL-TVA-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_required", "REMOVAL-TVA-UNIFY-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_required_int_internal", "REMOVAL-TVA-UNIFY-REQUIRED-INT-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_required_int", "REMOVAL-TVA-UNIFY-REQUIRED-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_unify_usefulP_internal", "TVA-UNIFY-USEFUL?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_unify_usefulP", "TVA-UNIFY-USEFUL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_unify_from_cache_possibleP", "TVA-UNIFY-FROM-CACHE-POSSIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "no_nested_variables_p", "NO-NESTED-VARIABLES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_cost", "REMOVAL-TVA-UNIFY-COST", 1, 1, false);
        new $removal_tva_unify_cost$UnaryFunction();
        new $removal_tva_unify_cost$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_iterator", "REMOVAL-TVA-UNIFY-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_closure_required", "REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED", 1, 1, false);
        new $removal_tva_unify_closure_required$UnaryFunction();
        new $removal_tva_unify_closure_required$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_closure_cost", "REMOVAL-TVA-UNIFY-CLOSURE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_closure_iterator", "REMOVAL-TVA-UNIFY-CLOSURE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_closure_conjunction_applicability", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPLICABILITY", 1, 0, false);
        new $removal_tva_unify_closure_conjunction_applicability$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_closure_conjunction_appropriate_asentP", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPROPRIATE-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_closure_conjunction_appropriate_predicateP", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPROPRIATE-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_closure_conjunction_cost", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "removal_tva_unify_closure_conjunction_output_generate", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-OUTPUT-GENERATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "new_tva_closure_crm_iterator", "NEW-TVA-CLOSURE-CRM-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_closure_crm_iterator_state", "TVA-CLOSURE-CRM-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_closure_crm_iterator_done", "TVA-CLOSURE-CRM-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_closure_crm_iterator_next", "TVA-CLOSURE-CRM-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup", "tva_closure_crm_iterator_finalize", "TVA-CLOSURE-CRM-ITERATOR-FINALIZE", 1, 0, false);
        return (SubLObject)removal_modules_tva_lookup.NIL;
    }
    
    public static SubLObject init_removal_modules_tva_lookup_file() {
        removal_modules_tva_lookup.$tva_unify_default_preference$ = SubLFiles.defparameter("*TVA-UNIFY-DEFAULT-PREFERENCE*", (SubLObject)removal_modules_tva_lookup.$kw0$DISPREFERRED);
        removal_modules_tva_lookup.$tva_pos_preference_skip_tva_applicable_to_some_bindable_argP$ = SubLFiles.defparameter("*TVA-POS-PREFERENCE-SKIP-TVA-APPLICABLE-TO-SOME-BINDABLE-ARG?*", (SubLObject)removal_modules_tva_lookup.T);
        removal_modules_tva_lookup.$tva_use_recursive_hl_forward_mtsP$ = SubLFiles.defparameter("*TVA-USE-RECURSIVE-HL-FORWARD-MTS?*", (SubLObject)removal_modules_tva_lookup.T);
        removal_modules_tva_lookup.$default_tva_check_cost$ = SubLFiles.deflexical("*DEFAULT-TVA-CHECK-COST*", (SubLObject)removal_modules_tva_lookup.TWO_INTEGER);
        return (SubLObject)removal_modules_tva_lookup.NIL;
    }
    
    public static SubLObject setup_removal_modules_tva_lookup_file() {
        preference_modules.inference_preference_module((SubLObject)removal_modules_tva_lookup.$kw1$TVA_POS, (SubLObject)removal_modules_tva_lookup.$list2);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_tva_lookup.$sym22$ATOMIC_SENTENCE_VALID_WRT_IRREFLEXIVITY_);
        inference_modules.inference_removal_module((SubLObject)removal_modules_tva_lookup.$kw3$REMOVAL_TVA_CHECK, (SubLObject)removal_modules_tva_lookup.$list42);
        inference_modules.inference_removal_module((SubLObject)removal_modules_tva_lookup.$kw43$REMOVAL_TVA_CHECK_NEG, (SubLObject)removal_modules_tva_lookup.$list44);
        memoization_state.note_memoized_function((SubLObject)removal_modules_tva_lookup.$sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT);
        memoization_state.note_memoized_function((SubLObject)removal_modules_tva_lookup.$sym47$TVA_UNIFY_USEFUL_);
        inference_modules.inference_removal_module((SubLObject)removal_modules_tva_lookup.$kw4$REMOVAL_TVA_UNIFY, (SubLObject)removal_modules_tva_lookup.$list69);
        inference_modules.inference_removal_module((SubLObject)removal_modules_tva_lookup.$kw5$REMOVAL_TVA_UNIFY_CLOSURE, (SubLObject)removal_modules_tva_lookup.$list70);
        return (SubLObject)removal_modules_tva_lookup.NIL;
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
        me = (SubLFile)new removal_modules_tva_lookup();
        removal_modules_tva_lookup.$tva_unify_default_preference$ = null;
        removal_modules_tva_lookup.$tva_pos_preference_skip_tva_applicable_to_some_bindable_argP$ = null;
        removal_modules_tva_lookup.$tva_use_recursive_hl_forward_mtsP$ = null;
        removal_modules_tva_lookup.$default_tva_check_cost$ = null;
        $kw0$DISPREFERRED = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $kw1$TVA_POS = SubLObjectFactory.makeKeyword("TVA-POS");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-POS-PREFERENCE"));
        $kw3$REMOVAL_TVA_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-TVA-CHECK");
        $kw4$REMOVAL_TVA_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-TVA-UNIFY");
        $kw5$REMOVAL_TVA_UNIFY_CLOSURE = SubLObjectFactory.makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE");
        $kw6$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw7$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $kw10$GROSSLY_DISPREFERRED = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $kw11$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $kw12$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw13$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw14$POS = SubLObjectFactory.makeKeyword("POS");
        $kw15$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw16$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw17$TRANSITIVITY = SubLObjectFactory.makeKeyword("TRANSITIVITY");
        $kw18$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw19$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw20$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw21$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $sym22$ATOMIC_SENTENCE_VALID_WRT_IRREFLEXIVITY_ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-VALID-WRT-IRREFLEXIVITY?");
        $sym23$FULLY_BOUND_P = SubLObjectFactory.makeSymbol("FULLY-BOUND-P");
        $kw24$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym25$TVA_ANSWER_JUSTIFICATION_BETTER_ = SubLObjectFactory.makeSymbol("TVA-ANSWER-JUSTIFICATION-BETTER?");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $sym27$CYCL_ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("CYCL-ASSERTED-ASSERTION?");
        $sym28$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED = SubLObjectFactory.makeSymbol("INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED");
        $sym29$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $kw30$CODE = SubLObjectFactory.makeKeyword("CODE");
        $sym31$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $sym33$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym34$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const35$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym36$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym37$TVA_MAX_FLOOR_MTS_OF_JUST = SubLObjectFactory.makeSymbol("TVA-MAX-FLOOR-MTS-OF-JUST");
        $const38$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw39$TVA = SubLObjectFactory.makeKeyword("TVA");
        $sym40$FAST_NON_SKOLEM_INDETERMINATE_TERM_ = SubLObjectFactory.makeSymbol("FAST-NON-SKOLEM-INDETERMINATE-TERM?");
        $sym41$NON_SKOLEM_INDETERMINATE_TERM_ = SubLObjectFactory.makeSymbol("NON-SKOLEM-INDETERMINATE-TERM?");
        $list42 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_tva_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TVA-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TVA-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TVA-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fort> . <fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$relationAllExists #$physicalParts #$Dog #$Head)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$transitiveViaArg #$relationAllExists #$genls 3)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n (#$genls #$Head-Vertebrate #$Head)\n") });
        $kw43$REMOVAL_TVA_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-TVA-CHECK-NEG");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_tva_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TVA-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TVA-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TVA-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fort> . <fully-bound>)\nusing #$negationPreds, #$negationInverse, true assertions, and GAF \nindexing in the KB via #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$relationExistsExists #$parts #$CellNucleus #$Cell))\nvia \n (#$relationNotExistsExists #$parts #$NuclearBody #$Cell)\n (#$transitiveViaArgInverse #$relationNotExistsExists #$genls 2) \n (#$negationPreds #$relationNotExistsExists #$relationExistsExists) \n (#$genls #$CellNucleus #$NuclearBody)\n") });
        $sym45$REMOVAL_TVA_UNIFY_REQUIRED_INT = SubLObjectFactory.makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED-INT");
        $int46$2048 = SubLObjectFactory.makeInteger(2048);
        $sym47$TVA_UNIFY_USEFUL_ = SubLObjectFactory.makeSymbol("TVA-UNIFY-USEFUL?");
        $kw48$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw49$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw50$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw52$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str53$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym54$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw55$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str56$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw57$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str58$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const59$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const60$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $const61$conservativeViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArg"));
        $const62$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $const63$conservativeViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse"));
        $str64$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str65$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str66$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym67$HL_VARIABLE_P = SubLObjectFactory.makeSymbol("HL-VARIABLE-P");
        $list68 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse")));
        $list69 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_tva_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TVA-UNIFY-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-TVA-UNIFY-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-VALID-WRT-IRREFLEXIVITY?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-TVA-CHECK-SOLVED-BY-OTHER-HL-MODULE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TVA"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fort> . <not-fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$relationAllExists #$physicalParts #$Dog ?COL)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n") });
        $list70 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_tva_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TVA"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fort> . <not-fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$relationAllExists #$physicalParts #$Dog ?COL)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n") });
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-MT"), (SubLObject)SubLObjectFactory.makeSymbol("POS-ASENT"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $sym73$_ = SubLObjectFactory.makeSymbol("<");
        $sym74$TVA_CLOSURE_CRM_ITERATOR_DONE = SubLObjectFactory.makeSymbol("TVA-CLOSURE-CRM-ITERATOR-DONE");
        $sym75$TVA_CLOSURE_CRM_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("TVA-CLOSURE-CRM-ITERATOR-NEXT");
        $sym76$TVA_CLOSURE_CRM_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("TVA-CLOSURE-CRM-ITERATOR-FINALIZE");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLOSURE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-TEMPLATES"));
    }
    
    public static final class $removal_tva_unify_cost$UnaryFunction extends UnaryFunction
    {
        public $removal_tva_unify_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_tva_lookup.removal_tva_unify_cost(arg1, (SubLObject)$removal_tva_unify_cost$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_tva_unify_cost$BinaryFunction extends BinaryFunction
    {
        public $removal_tva_unify_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_tva_lookup.removal_tva_unify_cost(arg1, arg2);
        }
    }
    
    public static final class $removal_tva_unify_closure_required$UnaryFunction extends UnaryFunction
    {
        public $removal_tva_unify_closure_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_tva_lookup.removal_tva_unify_closure_required(arg1, (SubLObject)$removal_tva_unify_closure_required$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_tva_unify_closure_required$BinaryFunction extends BinaryFunction
    {
        public $removal_tva_unify_closure_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_tva_lookup.removal_tva_unify_closure_required(arg1, arg2);
        }
    }
    
    public static final class $removal_tva_unify_closure_conjunction_applicability$UnaryFunction extends UnaryFunction
    {
        public $removal_tva_unify_closure_conjunction_applicability$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPLICABILITY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_tva_lookup.removal_tva_unify_closure_conjunction_applicability(arg1);
        }
    }
}

/*

	Total time: 3023 ms
	
*/