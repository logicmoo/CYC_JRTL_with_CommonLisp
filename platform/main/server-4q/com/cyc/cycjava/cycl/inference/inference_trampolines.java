package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
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

public class inference_trampolines extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.inference_trampolines";
    public static String myFingerPrint = "fc715d1b5f0d1e4297a83a1b426a3c7c43377855f54cd834050897f6fe1952e4";
    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3300L)
    private static SubLSymbol $indeterminate_term_p_caching_state$;
    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9900L)
    private static SubLSymbol $some_max_floor_mtsP_cached_caching_state$;
    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10400L)
    private static SubLSymbol $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$;
    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11100L)
    public static SubLSymbol $block_inference_excepted_assertion_in_inference_index_lookupP$;
    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11200L)
    public static SubLSymbol $disable_inference_excepted_assertion_supportP$;
    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21500L)
    public static SubLSymbol $recursive_query_override_properties$;
    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 23600L)
    private static SubLSymbol $inference_true_sentence_recursion_stack$;
    private static SubLObject $$Collection;
    private static SubLSymbol $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P;
    private static SubLSymbol $sym2$INDETERMINATE_TERM_P;
    private static SubLObject $$IndeterminateTerm;
    private static SubLSymbol $sym4$_INDETERMINATE_TERM_P_CACHING_STATE_;
    private static SubLSymbol $sym5$CLEAR_INDETERMINATE_TERM_P;
    private static SubLSymbol $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_;
    private static SubLSymbol $sym7$INFERENCE_ALL_GENL_PREDICATES;
    private static SubLSymbol $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT;
    private static SubLSymbol $sym9$INFERENCE_ALL_GENL_INVERSES;
    private static SubLSymbol $sym10$INFERENCE_ALL_SPEC_INVERSES_INT;
    private static SubLSymbol $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX;
    private static SubLSymbol $DEPTH;
    private static SubLSymbol $STACK;
    private static SubLSymbol $QUEUE;
    private static SubLSymbol $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static SubLSymbol $ERROR;
    private static SubLString $str17$_A_is_not_a__A;
    private static SubLSymbol $sym18$SBHL_TRUE_TV_P;
    private static SubLSymbol $CERROR;
    private static SubLString $str20$continue_anyway;
    private static SubLSymbol $WARN;
    private static SubLString $str22$_A_is_not_a_valid__sbhl_type_erro;
    private static SubLObject $$genlPreds;
    private static SubLString $str24$_A_is_neither_SET_P_nor_LISTP_;
    private static SubLString $str25$attempting_to_bind_direction_link;
    private static SubLString $str26$Node__a_does_not_pass_sbhl_type_t;
    private static SubLSymbol $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT;
    private static SubLSymbol $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX;
    private static SubLObject $$genlInverse;
    private static SubLSymbol $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT;
    private static SubLSymbol $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX;
    private static SubLSymbol $sym32$HLMT_EQUAL;
    private static SubLSymbol $sym33$SOME_MAX_FLOOR_MTS__CACHED;
    private static SubLSymbol $sym34$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_;
    private static SubLInteger $int$256;
    private static SubLSymbol $sym36$CLEAR_SOME_MAX_FLOOR_MTS__CACHED;
    private static SubLSymbol $sym37$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED;
    private static SubLSymbol $sym38$_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED_CACHING_STATE_;
    private static SubLSymbol $sym39$CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED;
    private static SubLSymbol $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT;
    private static SubLSymbol $sym41$INFERENCE_APPLICABLE_SDCT_;
    private static SubLSymbol $sym42$ASSERTION_P;
    private static SubLSymbol $sym43$INFERENCE_EXCEPTED_ASSERTION__SHALLOW;
    private static SubLSymbol $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_;
    private static SubLInteger $int$2048;
    private static SubLSymbol $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW;
    private static SubLList $list47;
    private static SubLList $list48;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym51$DO_INFERENCE_GAF_LOOKUP_INDEX;
    private static SubLSymbol $sym52$DO_GAF_LOOKUP_INDEX;
    private static SubLSymbol $sym53$INFERENCE_GAF_LOOKUP_INDEX;
    private static SubLSymbol $TRUTH;
    private static SubLSymbol $sym55$SENSE_TRUTH;
    private static SubLSymbol $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX;
    private static SubLSymbol $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX;
    private static SubLSymbol $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM;
    private static SubLSymbol $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX;
    private static SubLSymbol $sym60$INFERENCE_KEY_GAF_ARG_INDEX;
    private static SubLSymbol $sym61$PROBLEM_P;
    private static SubLList $list62;
    private static SubLObject $$isa;
    private static SubLObject $$genls;
    private static SubLSymbol $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_;
    private static SubLSymbol $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_;
    private static SubLSymbol $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_;
    private static SubLSymbol $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_;
    private static SubLSymbol $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_;
    private static SubLSymbol $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_;
    private static SubLSymbol $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_;
    private static SubLSymbol $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_;
    private static SubLObject $$highlyRelevantMt;
    private static SubLSymbol $TRUE;
    private static SubLObject $$highlyRelevantAssertion;
    private static SubLObject $$highlyRelevantPredAssertion;
    private static SubLObject $$highlyRelevantTerm;
    private static SubLObject $$irrelevantMt;
    private static SubLObject $$irrelevantAssertion;
    private static SubLObject $$irrelevantPredAssertion;
    private static SubLObject $$irrelevantTerm;
    private static SubLObject $$assertionUtility;
    private static SubLSymbol $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY;
    private static SubLSymbol $ALLOWED_MODULES;
    private static SubLSymbol $FALSE;
    private static SubLSymbol $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY;
    private static SubLSymbol $MAX_NUMBER;
    private static SubLSymbol $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE;
    private static SubLList $list89;
    private static SubLSymbol $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED;
    private static SubLObject $$InferencePSC;
    private static SubLSymbol $MAX_TRANSFORMATION_DEPTH;
    private static SubLSymbol $MIN_RULE_UTILITY;
    private static SubLInteger $int$_100;
    private static SubLObject $$TheSetOf;
    private static SubLSymbol $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS;

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1000L)
    public static SubLObject inference_atomic_term_p(SubLObject v_object) {
        return makeBoolean(NIL != cycl_grammar.subl_strict_atomic_term_p(v_object) || isConstSym(v_object));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1200L)
    public static SubLObject inference_collectionP(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(v_object) && NIL != fort_types_interface.collectionP(v_object)) || (NIL != el_utilities.possibly_naut_p(v_object) && NIL != isa.isaP(v_object, $$Collection, mt, UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1400L)
    public static SubLObject inference_predicate_p(SubLObject v_object) {
        return makeBoolean(NIL != forts.fort_p(v_object) && NIL != fort_types_interface.predicateP(v_object));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1600L)
    public static SubLObject inference_commutative_relationP(SubLObject relation) {
        return fort_types_interface.commutative_relation_p(relation);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1800L)
    public static SubLObject inference_symmetric_predicateP(SubLObject predicate) {
        return fort_types_interface.symmetric_binary_predicate_p(predicate);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2000L)
    public static SubLObject inference_commutative_predicate_p(SubLObject predicate) {
        return fort_types_interface.commutative_predicate_p(predicate);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2100L)
    public static SubLObject inference_partially_commutative_predicate_p_internal(SubLObject predicate) {
        return fort_types_interface.partially_commutative_predicate_p(predicate);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2100L)
    public static SubLObject inference_partially_commutative_predicate_p(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_partially_commutative_predicate_p_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_partially_commutative_predicate_p_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2200L)
    public static SubLObject inference_at_least_partially_commutative_predicate_p(SubLObject predicate) {
        return makeBoolean(NIL != inference_commutative_predicate_p(predicate) || NIL != inference_partially_commutative_predicate_p(predicate));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2400L)
    public static SubLObject inference_asymmetric_predicateP(SubLObject predicate) {
        return fort_types_interface.asymmetric_binary_predicate_p(predicate);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2600L)
    public static SubLObject inference_transitive_predicateP(SubLObject predicate) {
        return fort_types_interface.transitive_binary_predicate_p(predicate);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2700L)
    public static SubLObject inference_evaluatable_predicateP(SubLObject predicate) {
        return relation_evaluation.evaluatable_predicateP(predicate, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2800L)
    public static SubLObject inference_reflexive_predicateP(SubLObject predicate) {
        return fort_types_interface.reflexive_binary_predicate_p(predicate);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2900L)
    public static SubLObject inference_irreflexive_predicateP(SubLObject predicate) {
        return fort_types_interface.irreflexive_binary_predicate_p(predicate);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3000L)
    public static SubLObject inference_indeterminate_termP(SubLObject value) {
        if (NIL != forts.fort_p(value)) {
            return indeterminate_term_p(value);
        }
        if (NIL != el_utilities.possibly_naut_p(value)) {
            return makeBoolean(NIL != kb_accessors.common_non_skolem_indeterminate_term_denoting_functionP(cycl_utilities.formula_operator(value)) || NIL != memoized_inference_indeterminate_termP(value));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3300L)
    public static SubLObject clear_indeterminate_term_p() {
        SubLObject cs = $indeterminate_term_p_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3300L)
    public static SubLObject remove_indeterminate_term_p(SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($indeterminate_term_p_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3300L)
    public static SubLObject indeterminate_term_p_internal(SubLObject fort) {
        return isa.quoted_isa_in_any_mtP(fort, $$IndeterminateTerm);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3300L)
    public static SubLObject indeterminate_term_p(SubLObject fort) {
        SubLObject caching_state = $indeterminate_term_p_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym2$INDETERMINATE_TERM_P, $sym4$_INDETERMINATE_TERM_P_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym5$CLEAR_INDETERMINATE_TERM_P);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(indeterminate_term_p_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3600L)
    public static SubLObject memoized_inference_indeterminate_termP_internal(SubLObject value) {
        return isa.quoted_isa_in_any_mtP(value, $$IndeterminateTerm);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3600L)
    public static SubLObject memoized_inference_indeterminate_termP(SubLObject value) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_inference_indeterminate_termP_internal(value);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, value, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_inference_indeterminate_termP_internal(value)));
            memoization_state.caching_state_put(caching_state, value, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3800L)
    public static SubLObject inference_some_genl_pred_or_inverseP(SubLObject pred) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            ans = genl_predicates.some_genl_pred_or_inverseP(pred, NIL, UNPROVIDED);
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4200L)
    public static SubLObject inference_some_spec_pred_or_inverseP(SubLObject pred) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred)) {
            return NIL;
        }
        SubLObject ans = NIL;
        SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            ans = genl_predicates.some_spec_pred_or_inverseP(pred, NIL, UNPROVIDED);
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4400L)
    public static SubLObject inference_some_negation_pred_or_inverseP(SubLObject pred) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            ans = negation_predicate.some_negation_pred_or_inverseP(pred, NIL, UNPROVIDED);
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4700L)
    public static SubLObject inference_all_genl_predicates_internal(SubLObject predicate) {
        return genl_predicates.all_genl_predicates(predicate, NIL, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4700L)
    public static SubLObject inference_all_genl_predicates(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_genl_predicates_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym7$INFERENCE_ALL_GENL_PREDICATES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym7$INFERENCE_ALL_GENL_PREDICATES, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym7$INFERENCE_ALL_GENL_PREDICATES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_genl_predicates_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4800L)
    public static SubLObject inference_all_spec_predicates(SubLObject predicate) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(predicate)) {
            return inference_all_spec_predicates_int(predicate);
        }
        return list(predicate);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5000L)
    public static SubLObject inference_all_spec_predicates_int_internal(SubLObject predicate) {
        return genl_predicates.all_spec_predicates(predicate, NIL, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5000L)
    public static SubLObject inference_all_spec_predicates_int(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_spec_predicates_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_spec_predicates_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5100L)
    public static SubLObject inference_all_genl_inverses_internal(SubLObject predicate) {
        return genl_predicates.all_genl_inverses(predicate, NIL, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5100L)
    public static SubLObject inference_all_genl_inverses(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_genl_inverses_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym9$INFERENCE_ALL_GENL_INVERSES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym9$INFERENCE_ALL_GENL_INVERSES, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym9$INFERENCE_ALL_GENL_INVERSES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_genl_inverses_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5200L)
    public static SubLObject inference_all_spec_inverses(SubLObject predicate) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(predicate)) {
            return inference_all_spec_inverses_int(predicate);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5400L)
    public static SubLObject inference_all_spec_inverses_int_internal(SubLObject predicate) {
        return genl_predicates.all_spec_inverses(predicate, NIL, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5400L)
    public static SubLObject inference_all_spec_inverses_int(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_spec_inverses_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym10$INFERENCE_ALL_SPEC_INVERSES_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym10$INFERENCE_ALL_SPEC_INVERSES_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym10$INFERENCE_ALL_SPEC_INVERSES_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_spec_inverses_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5600L)
    public static SubLObject inference_all_proper_genl_predicates_with_axiom_index_internal(SubLObject pred, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        SubLObject deck_type = $QUEUE;
        SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject tv_var = NIL;
                SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($WARN)) {
                            Errors.warn($str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P);
                        } else {
                            Errors.warn($str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P);
                        }
                    }
                    SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                            SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    SubLObject node_var_$7 = node_and_predicate_mode.first();
                                    SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    SubLObject genl_pred = node_var_$7;
                                    SubLObject _prev_bind_0_$4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$7) && !genl_pred.eql(pred)) {
                                            SubLObject num = kb_indexing.relevant_num_predicate_rule_index(genl_pred, sense);
                                            if (num.isPositive()) {
                                                result = cons(genl_pred, result);
                                                cost = Numbers.add(cost, num);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                        (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                SubLObject node = function_terms.naut_to_nart(node_var_$7);
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
                                                                    SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$12;
                                                                        for (iteration_state_$12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                iteration_state_$12); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next(iteration_state_$12)) {
                                                                            thread.resetMultipleValues();
                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$12);
                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                        Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$7, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$12);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$6, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$14;
                                                    SubLObject new_list = cdolist_list_var_$14 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                            ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$14.first();
                                                    while (NIL != cdolist_list_var_$14) {
                                                        SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$8, thread);
                                                        }
                                                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                        generating_fn = cdolist_list_var_$14.first();
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$5, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$6, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$3, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Values.values(Sequences.nreverse(result), cost);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5600L)
    public static SubLObject inference_all_proper_genl_predicates_with_axiom_index(SubLObject pred, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_proper_genl_predicates_with_axiom_index_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_proper_genl_predicates_with_axiom_index_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 6500L)
    public static SubLObject inference_all_proper_spec_predicates_with_axiom_index(SubLObject pred, SubLObject sense) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred)) {
            return inference_all_proper_spec_predicates_with_axiom_index_int(pred, sense);
        }
        return Values.values(NIL, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 6700L)
    public static SubLObject inference_all_proper_spec_predicates_with_axiom_index_int_internal(SubLObject pred, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        SubLObject deck_type = $QUEUE;
        SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject tv_var = NIL;
                SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($WARN)) {
                            Errors.warn($str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P);
                        } else {
                            Errors.warn($str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P);
                        }
                    }
                    SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                            SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    SubLObject node_var_$23 = node_and_predicate_mode.first();
                                    SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    SubLObject spec_pred = node_var_$23;
                                    SubLObject _prev_bind_0_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$23) && !spec_pred.eql(pred)) {
                                            SubLObject num = kb_indexing.relevant_num_predicate_rule_index(spec_pred, sense);
                                            if (num.isPositive()) {
                                                result = cons(spec_pred, result);
                                                cost = Numbers.add(cost, num);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                        (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                SubLObject node = function_terms.naut_to_nart(node_var_$23);
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
                                                                    SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$28;
                                                                        for (iteration_state_$28 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                iteration_state_$28); iteration_state_$28 = dictionary_contents.do_dictionary_contents_next(iteration_state_$28)) {
                                                                            thread.resetMultipleValues();
                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$28);
                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                        Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$23, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$28);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$22, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$30;
                                                    SubLObject new_list = cdolist_list_var_$30 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                            ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$30.first();
                                                    while (NIL != cdolist_list_var_$30) {
                                                        SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$24, thread);
                                                        }
                                                        cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                        generating_fn = cdolist_list_var_$30.first();
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$21, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$20, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$22, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$20, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$19, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Values.values(Sequences.nreverse(result), cost);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 6700L)
    public static SubLObject inference_all_proper_spec_predicates_with_axiom_index_int(SubLObject pred, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_proper_spec_predicates_with_axiom_index_int_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_proper_spec_predicates_with_axiom_index_int_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 7400L)
    public static SubLObject inference_all_proper_genl_inverses_with_axiom_index_internal(SubLObject pred, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        SubLObject deck_type = $QUEUE;
        SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject tv_var = NIL;
                SubLObject _prev_bind_0_$33 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($WARN)) {
                            Errors.warn($str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P);
                        } else {
                            Errors.warn($str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P);
                        }
                    }
                    SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1_$35 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                        if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                            SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_1_$36 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_$38 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    SubLObject node_var_$39 = node_and_predicate_mode.first();
                                    SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    SubLObject genl_pred = node_var_$39;
                                    SubLObject _prev_bind_0_$36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$39) && !genl_pred.eql(pred)) {
                                            SubLObject num = kb_indexing.relevant_num_predicate_rule_index(genl_pred, sense);
                                            if (num.isPositive()) {
                                                result = cons(genl_pred, result);
                                                cost = Numbers.add(cost, num);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlInverse));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            SubLObject _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                        (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                SubLObject node = function_terms.naut_to_nart(node_var_$39);
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
                                                                    SubLObject _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$44;
                                                                        for (iteration_state_$44 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                iteration_state_$44); iteration_state_$44 = dictionary_contents.do_dictionary_contents_next(iteration_state_$44)) {
                                                                            thread.resetMultipleValues();
                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$44);
                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                        Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$39, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$44);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$38, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$46;
                                                    SubLObject new_list = cdolist_list_var_$46 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                            ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$46.first();
                                                    while (NIL != cdolist_list_var_$46) {
                                                        SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$40, thread);
                                                        }
                                                        cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                                                        generating_fn = cdolist_list_var_$46.first();
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$37, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$37, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$36, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$38, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$36, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$35, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$35, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$34, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$33, thread);
                }
            } finally {
                SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Values.values(Sequences.nreverse(result), cost);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 7400L)
    public static SubLObject inference_all_proper_genl_inverses_with_axiom_index(SubLObject pred, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_proper_genl_inverses_with_axiom_index_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_proper_genl_inverses_with_axiom_index_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8000L)
    public static SubLObject inference_all_proper_spec_inverses_with_axiom_index(SubLObject pred, SubLObject sense) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred)) {
            return inference_all_proper_spec_inverses_with_axiom_index_int(pred, sense);
        }
        return Values.values(NIL, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8300L)
    public static SubLObject inference_all_proper_spec_inverses_with_axiom_index_int_internal(SubLObject pred, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        SubLObject deck_type = $QUEUE;
        SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject tv_var = NIL;
                SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($WARN)) {
                            Errors.warn($str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P);
                        } else {
                            Errors.warn($str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P);
                        }
                    }
                    SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1_$51 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                        if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                            SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_1_$52 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    SubLObject node_var_$55 = node_and_predicate_mode.first();
                                    SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    SubLObject spec_pred = node_var_$55;
                                    SubLObject _prev_bind_0_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$55) && !spec_pred.eql(pred)) {
                                            SubLObject num = kb_indexing.relevant_num_predicate_rule_index(spec_pred, sense);
                                            if (num.isPositive()) {
                                                result = cons(spec_pred, result);
                                                cost = Numbers.add(cost, num);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlInverse));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                        (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                SubLObject node = function_terms.naut_to_nart(node_var_$55);
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
                                                                    SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$60;
                                                                        for (iteration_state_$60 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                iteration_state_$60); iteration_state_$60 = dictionary_contents.do_dictionary_contents_next(iteration_state_$60)) {
                                                                            thread.resetMultipleValues();
                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$60);
                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                        Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$55, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$60);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$54, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$62;
                                                    SubLObject new_list = cdolist_list_var_$62 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                            ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$62.first();
                                                    while (NIL != cdolist_list_var_$62) {
                                                        SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$56, thread);
                                                        }
                                                        cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                                                        generating_fn = cdolist_list_var_$62.first();
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$53, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$53, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$52, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$54, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$52, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$51, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$51, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$50, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$49, thread);
                }
            } finally {
                SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Values.values(Sequences.nreverse(result), cost);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8300L)
    public static SubLObject inference_all_proper_spec_inverses_with_axiom_index_int(SubLObject pred, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_proper_spec_inverses_with_axiom_index_int_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_proper_spec_inverses_with_axiom_index_int_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9000L)
    public static SubLObject inference_all_negation_predicates_with_axiom_index_internal(SubLObject pred, SubLObject sense) {
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        SubLObject cdolist_list_var = negation_predicate.all_negation_predicates(pred, NIL, NIL);
        SubLObject negation_pred = NIL;
        negation_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject num = kb_indexing.relevant_num_predicate_rule_index(negation_pred, sense);
            if (num.isPositive()) {
                result = cons(negation_pred, result);
                cost = Numbers.add(cost, num);
            }
            cdolist_list_var = cdolist_list_var.rest();
            negation_pred = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(result), cost);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9000L)
    public static SubLObject inference_all_negation_predicates_with_axiom_index(SubLObject pred, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_negation_predicates_with_axiom_index_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_negation_predicates_with_axiom_index_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9600L)
    public static SubLObject inference_some_max_floor_mts(SubLObject mts) {
        mts = Sequences.remove_duplicates(mts, Symbols.symbol_function($sym32$HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        mts = mt_vars.minimize_mts_wrt_core(mts);
        return some_max_floor_mtsP_cached(mts);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9900L)
    public static SubLObject clear_some_max_floor_mtsP_cached() {
        SubLObject cs = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9900L)
    public static SubLObject remove_some_max_floor_mtsP_cached(SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($some_max_floor_mtsP_cached_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9900L)
    public static SubLObject some_max_floor_mtsP_cached_internal(SubLObject mts) {
        return some_max_floor_mtsP(mts);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9900L)
    public static SubLObject some_max_floor_mtsP_cached(SubLObject mts) {
        SubLObject caching_state = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym33$SOME_MAX_FLOOR_MTS__CACHED, $sym34$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback($sym36$CLEAR_SOME_MAX_FLOOR_MTS__CACHED);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(some_max_floor_mtsP_cached_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10000L)
    public static SubLObject inference_max_floor_mts_with_cycles_pruned(SubLObject mts, SubLObject candidates) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        mts = Sequences.remove_duplicates(mts, Symbols.symbol_function($sym32$HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        mts = mt_vars.minimize_mts_wrt_core(mts);
        if (NIL != candidates) {
            return genl_mts.max_floor_mts_with_cycles_pruned(mts, candidates, UNPROVIDED);
        }
        return inference_max_floor_mts_with_cycles_pruned_cached(mts);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10400L)
    public static SubLObject clear_inference_max_floor_mts_with_cycles_pruned_cached() {
        SubLObject cs = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10400L)
    public static SubLObject remove_inference_max_floor_mts_with_cycles_pruned_cached(SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10400L)
    public static SubLObject inference_max_floor_mts_with_cycles_pruned_cached_internal(SubLObject mts) {
        return genl_mts.max_floor_mts_with_cycles_pruned(mts, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10400L)
    public static SubLObject inference_max_floor_mts_with_cycles_pruned_cached(SubLObject mts) {
        SubLObject caching_state = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym37$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED, $sym38$_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED_CACHING_STATE_, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback($sym39$CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(inference_max_floor_mts_with_cycles_pruned_cached_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10600L)
    public static SubLObject inference_max_floor_mts_of_nat_internal(SubLObject nat) {
        return at_utilities.max_floor_mts_of_nat(nat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10600L)
    public static SubLObject inference_max_floor_mts_of_nat(SubLObject nat) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_max_floor_mts_of_nat_internal(nat);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nat, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_max_floor_mts_of_nat_internal(nat)));
            memoization_state.caching_state_put(caching_state, nat, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10700L)
    public static SubLObject some_max_floor_mtsP(SubLObject mts) {
        return list_utilities.sublisp_boolean(genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10900L)
    public static SubLObject inference_applicable_sdctP_internal(SubLObject col) {
        return sdc.applicable_sdctP(col, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10900L)
    public static SubLObject inference_applicable_sdctP(SubLObject col) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_applicable_sdctP_internal(col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym41$INFERENCE_APPLICABLE_SDCT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym41$INFERENCE_APPLICABLE_SDCT_, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym41$INFERENCE_APPLICABLE_SDCT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_applicable_sdctP_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11300L)
    public static SubLObject expression_has_inference_excepted_assertionP_iteration_helper(SubLObject expression) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != $block_inference_excepted_assertion_in_inference_index_lookupP$.getDynamicValue(thread) && NIL != expression_has_inference_excepted_assertionP(expression));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11600L)
    public static SubLObject expression_has_inference_excepted_assertionP(SubLObject expression) {
        SubLObject assertions = cycl_utilities.expression_gather(expression, $sym42$ASSERTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list_utilities.sublisp_boolean(Sequences.find_if($sym43$INFERENCE_EXCEPTED_ASSERTION__SHALLOW, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11800L)
    public static SubLObject inference_excepted_assertionP(SubLObject assertion, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $disable_inference_excepted_assertion_supportP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        if (NIL != kb_control_vars.within_forward_inferenceP() && NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt)) {
            return NIL;
        }
        return memoized_inference_excepted_assertionP(assertion, mt_relevance_macros.current_mt_relevance_mt(), justifyP);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12300L)
    public static SubLObject memoized_inference_excepted_assertionP_internal(SubLObject assertion, SubLObject mt, SubLObject justifyP) {
        return assertion_utilities.excepted_assertion_in_mtP(assertion, mt_relevance_macros.conservative_constraint_mt(mt), justifyP, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12300L)
    public static SubLObject memoized_inference_excepted_assertionP(SubLObject assertion, SubLObject mt, SubLObject justifyP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_inference_excepted_assertionP_internal(assertion, mt, justifyP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, THREE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(assertion, mt, justifyP);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (assertion.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && justifyP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_inference_excepted_assertionP_internal(assertion, mt, justifyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(assertion, mt, justifyP));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12500L)
    public static SubLObject inference_excepted_assertionP_shallow(SubLObject assertion, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $disable_inference_excepted_assertion_supportP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        if (NIL != kb_control_vars.within_forward_inferenceP() && NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt)) {
            return NIL;
        }
        return memoized_inference_excepted_assertionP_shallow(assertion, mt_relevance_macros.current_mt_relevance_mt(), justifyP);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13000L)
    public static SubLObject memoized_inference_excepted_assertionP_shallow_internal(SubLObject assertion, SubLObject mt, SubLObject justifyP) {
        return assertion_utilities.excepted_assertion_in_mtP_shallow(assertion, mt_relevance_macros.conservative_constraint_mt(mt), justifyP);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13000L)
    public static SubLObject memoized_inference_excepted_assertionP_shallow(SubLObject assertion, SubLObject mt, SubLObject justifyP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_inference_excepted_assertionP_shallow_internal(assertion, mt, justifyP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW, THREE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(assertion, mt, justifyP);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (assertion.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && justifyP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_inference_excepted_assertionP_shallow_internal(assertion, mt, justifyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(assertion, mt, justifyP));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13300L)
    public static SubLObject do_inference_gafs_potentially_matching_formula(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject asent = NIL;
        SubLObject sense = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        sense = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$65 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list47);
            current_$65 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == conses_high.member(current_$65, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$65 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym51$DO_INFERENCE_GAF_LOOKUP_INDEX, list(assertion_var, asent, sense, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13700L)
    public static SubLObject do_inference_gaf_lookup_index(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject asent = NIL;
        SubLObject sense = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        sense = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$66 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list47);
            current_$66 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == conses_high.member(current_$66, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$66 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym52$DO_GAF_LOOKUP_INDEX, list(assertion_var, list($sym53$INFERENCE_GAF_LOOKUP_INDEX, asent, sense), $TRUTH, list($sym55$SENSE_TRUTH, sense), $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14500L)
    public static SubLObject inference_gaf_lookup_index_internal(SubLObject asent, SubLObject sense) {
        return kb_indexing.best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14500L)
    public static SubLObject inference_gaf_lookup_index(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_gaf_lookup_index_internal(asent, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym53$INFERENCE_GAF_LOOKUP_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym53$INFERENCE_GAF_LOOKUP_INDEX, TWO_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym53$INFERENCE_GAF_LOOKUP_INDEX, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(asent, sense);
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
                    if (NIL != cached_args && NIL == cached_args.rest() && sense.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_gaf_lookup_index_internal(asent, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, sense));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14600L)
    public static SubLObject inference_num_gaf_lookup_index_internal(SubLObject asent, SubLObject sense) {
        return kb_indexing.num_best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14600L)
    public static SubLObject inference_num_gaf_lookup_index(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_num_gaf_lookup_index_internal(asent, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX, TWO_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(asent, sense);
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
                    if (NIL != cached_args && NIL == cached_args.rest() && sense.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_num_gaf_lookup_index_internal(asent, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, sense));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14800L)
    public static SubLObject inference_relevant_num_gaf_lookup_index_internal(SubLObject mt_info, SubLObject asent, SubLObject sense) {
        return kb_indexing.num_best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14800L)
    public static SubLObject inference_relevant_num_gaf_lookup_index(SubLObject mt_info, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_relevant_num_gaf_lookup_index_internal(mt_info, asent, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, THREE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(mt_info, asent, sense);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (mt_info.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (asent.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && sense.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_relevant_num_gaf_lookup_index_internal(mt_info, asent, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(mt_info, asent, sense));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15000L)
    public static SubLObject inference_argnums_from_gafs_mentioning_term_internal(SubLObject v_term) {
        return kb_indexing.argnums_from_gafs_mentioning_term_with_relevant_mt(v_term);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15000L)
    public static SubLObject inference_argnums_from_gafs_mentioning_term(SubLObject v_term) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_argnums_from_gafs_mentioning_term_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM, ONE_INTEGER, $int$2048, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_argnums_from_gafs_mentioning_term_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15100L)
    public static SubLObject inference_preds_from_gafs_mentioning_term_at_index_internal(SubLObject v_term, SubLObject argnum) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        return kb_indexing.preds_from_gafs_mentioning_term_at_argnum_with_relevant_mt(v_term, argnum);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15100L)
    public static SubLObject inference_preds_from_gafs_mentioning_term_at_index(SubLObject v_term, SubLObject argnum) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_preds_from_gafs_mentioning_term_at_index_internal(v_term, argnum);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX, TWO_INTEGER, $int$2048, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, argnum);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (v_term.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && argnum.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_preds_from_gafs_mentioning_term_at_index_internal(v_term, argnum)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, argnum));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15300L)
    public static SubLObject inference_key_gaf_arg_index_internal(SubLObject v_term, SubLObject argnum, SubLObject pred) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        return kb_indexing.relevant_key_gaf_arg_index(v_term, argnum, pred);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15300L)
    public static SubLObject inference_key_gaf_arg_index(SubLObject v_term, SubLObject argnum, SubLObject pred) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_key_gaf_arg_index_internal(v_term, argnum, pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym60$INFERENCE_KEY_GAF_ARG_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym60$INFERENCE_KEY_GAF_ARG_INDEX, THREE_INTEGER, $int$2048, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym60$INFERENCE_KEY_GAF_ARG_INDEX, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, argnum, pred);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (v_term.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && pred.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_key_gaf_arg_index_internal(v_term, argnum, pred)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, argnum, pred));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15500L)
    public static SubLObject compute_problem_backchain_requiredP(SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject cdolist_list_var;
        SubLObject query = cdolist_list_var = inference_datastructures_problem.problem_query(problem);
        SubLObject contextualized_dnf_clause = NIL;
        contextualized_dnf_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf_clause = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15900L)
    public static SubLObject inference_some_backchain_required_asent_in_clauseP(SubLObject contextualized_dnf_clause) {
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_backchain_required_contextualized_asentP(contextualized_asent)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_backchain_required_contextualized_asentP(contextualized_asent)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 16200L)
    public static SubLObject inference_backchain_required_contextualized_asentP(SubLObject contextualized_asent) {
        SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
        SubLObject mt = inference_datastructures_problem_query.contextualized_asent_mt(contextualized_asent);
        return inference_backchain_required_asentP(asent, mt);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 16500L)
    public static SubLObject inference_backchain_required_asentP(SubLObject asent, SubLObject mt) {
        mt = backchain_control_mt(mt);
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(pred)) {
            if (NIL != inference_predicate_backchain_requiredP(pred, mt)) {
                return T;
            }
            SubLObject pred_$67 = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != subl_promotions.memberP(pred_$67, $list62, Symbols.symbol_function(EQL), UNPROVIDED)) {
                SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(col)) {
                    if (NIL != inference_collection_backchain_requiredP(col, mt)) {
                        return T;
                    }
                    if (pred_$67.eql($$isa) && NIL != inference_collection_isa_backchain_requiredP(col, mt)) {
                        return T;
                    }
                    if (pred_$67.eql($$genls) && NIL != inference_collection_genls_backchain_requiredP(col, mt)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17200L)
    public static SubLObject inference_predicate_backchain_requiredP_internal(SubLObject predicate, SubLObject mt) {
        return kb_accessors.backchain_requiredP(predicate, backchain_control_mt(mt));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17200L)
    public static SubLObject inference_predicate_backchain_requiredP(SubLObject predicate, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_predicate_backchain_requiredP_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_predicate_backchain_requiredP_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17400L)
    public static SubLObject inference_backchain_forbiddenP_internal(SubLObject predicate, SubLObject mt) {
        return kb_accessors.backchain_forbiddenP(predicate, backchain_control_mt(mt));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17400L)
    public static SubLObject inference_backchain_forbiddenP(SubLObject predicate, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_backchain_forbiddenP_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_backchain_forbiddenP_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17500L)
    public static SubLObject inference_collection_isa_backchain_encouragedP_internal(SubLObject collection, SubLObject mt) {
        return kb_accessors.collection_isa_backchain_encouragedP(collection, backchain_control_mt(mt));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17500L)
    public static SubLObject inference_collection_isa_backchain_encouragedP(SubLObject collection, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_isa_backchain_encouragedP_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_collection_isa_backchain_encouragedP_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17700L)
    public static SubLObject inference_collection_genls_backchain_encouragedP_internal(SubLObject collection, SubLObject mt) {
        return kb_accessors.collection_genls_backchain_encouragedP(collection, backchain_control_mt(mt));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17700L)
    public static SubLObject inference_collection_genls_backchain_encouragedP(SubLObject collection, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_genls_backchain_encouragedP_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_collection_genls_backchain_encouragedP_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17900L)
    public static SubLObject inference_collection_backchain_encouragedP_internal(SubLObject collection, SubLObject mt) {
        return kb_accessors.collection_backchain_encouragedP(collection, backchain_control_mt(mt));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17900L)
    public static SubLObject inference_collection_backchain_encouragedP(SubLObject collection, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_backchain_encouragedP_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_collection_backchain_encouragedP_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18100L)
    public static SubLObject inference_collection_backchain_requiredP_internal(SubLObject col, SubLObject mt) {
        return kb_accessors.collection_backchain_requiredP(col, backchain_control_mt(mt));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18100L)
    public static SubLObject inference_collection_backchain_requiredP(SubLObject col, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_backchain_requiredP_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_collection_backchain_requiredP_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18300L)
    public static SubLObject inference_collection_isa_backchain_requiredP_internal(SubLObject col, SubLObject mt) {
        return kb_accessors.collection_isa_backchain_requiredP(col, backchain_control_mt(mt));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18300L)
    public static SubLObject inference_collection_isa_backchain_requiredP(SubLObject col, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_isa_backchain_requiredP_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_collection_isa_backchain_requiredP_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18400L)
    public static SubLObject inference_collection_genls_backchain_requiredP_internal(SubLObject col, SubLObject mt) {
        return kb_accessors.collection_genls_backchain_requiredP(col, backchain_control_mt(mt));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18400L)
    public static SubLObject inference_collection_genls_backchain_requiredP(SubLObject col, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_genls_backchain_requiredP_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_collection_genls_backchain_requiredP_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18600L)
    public static SubLObject backchain_control_mt(SubLObject mt) {
        return mt_relevance_macros.conservative_constraint_mt(mt);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18900L)
    public static SubLObject inference_relevant_mtP(SubLObject assertion_mt, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(NIL != forts.fort_p(assertion_mt) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion_mt, $$highlyRelevantMt, inference_mt, ONE_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 19200L)
    public static SubLObject inference_relevant_assertionP(SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(NIL != assertion_handles.assertion_p(assertion) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion, $$highlyRelevantAssertion, inference_mt, ONE_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 19500L)
    public static SubLObject inference_relevant_predicate_assertionP(SubLObject predicate, SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(NIL != forts.fort_p(predicate) && NIL != assertion_handles.assertion_p(assertion) && NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$highlyRelevantPredAssertion, predicate, assertion, inference_mt, ONE_INTEGER, TWO_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 19800L)
    public static SubLObject inference_relevant_termP(SubLObject v_term, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(NIL != forts.fort_p(v_term) && NIL != kb_accessors.highly_relevant_term_somewhereP(v_term) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, $$highlyRelevantTerm, inference_mt, ONE_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 20000L)
    public static SubLObject inference_irrelevant_mtP(SubLObject assertion_mt, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(NIL != forts.fort_p(assertion_mt) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion_mt, $$irrelevantMt, inference_mt, ONE_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 20300L)
    public static SubLObject inference_irrelevant_assertionP(SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(NIL != assertion_handles.assertion_p(assertion) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion, $$irrelevantAssertion, inference_mt, ONE_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 20500L)
    public static SubLObject inference_irrelevant_predicate_assertionP(SubLObject predicate, SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(NIL != forts.fort_p(predicate) && NIL != assertion_handles.assertion_p(assertion) && NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$irrelevantPredAssertion, predicate, assertion, inference_mt, ONE_INTEGER, TWO_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 20800L)
    public static SubLObject inference_irrelevant_termP(SubLObject v_term, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(NIL != forts.fort_p(v_term) && NIL != kb_accessors.irrelevant_term_somewhereP(v_term) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, $$irrelevantTerm, inference_mt, ONE_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21100L)
    public static SubLObject inference_rule_has_utilityP(SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(NIL != assertion_handles.assertion_p(assertion) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion, $$assertionUtility, inference_mt, ONE_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21300L)
    public static SubLObject inference_rule_utility(SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        if (NIL != assertion_handles.assertion_p(assertion)) {
            return kb_mapping_utilities.fpred_value_in_relevant_mts(assertion, $$assertionUtility, inference_mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21900L)
    public static SubLObject inference_known_sentence_removal_query_internal(SubLObject asent, SubLObject mt, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject halt_reason = T;
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        SubLObject results = NIL;
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(asent)) {
            if (NIL != el_utilities.ist_of_atomic_sentence_p(asent)) {
                thread.resetMultipleValues();
                SubLObject asent_$68 = czer_utilities.unwrap_if_ist(asent, mt, UNPROVIDED);
                SubLObject mt_$69 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                asent = asent_$68;
                mt = mt_$69;
            }
            SubLObject pcase_var = truth;
            if (pcase_var.eql($TRUE)) {
                SubLObject query_properties = determine_sentence_recursive_query_properties(asent, mt);
                SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
                try {
                    czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
                    query_properties = conses_high.putf(query_properties, $ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec());
                    thread.resetMultipleValues();
                    SubLObject results_$70 = ask_utilities.recursive_query(asent, mt, query_properties);
                    SubLObject halt_reason_$71 = thread.secondMultipleValue();
                    SubLObject inference_$72 = thread.thirdMultipleValue();
                    SubLObject metrics_$73 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$70;
                    halt_reason = halt_reason_$71;
                    inference = inference_$72;
                    metrics = metrics_$73;
                } finally {
                    czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
                }
            } else if (pcase_var.eql($FALSE)) {
                thread.resetMultipleValues();
                SubLObject results_$71 = ask_utilities.recursive_query(el_utilities.make_negation(asent), mt, list($ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec()));
                SubLObject halt_reason_$72 = thread.secondMultipleValue();
                SubLObject inference_$73 = thread.thirdMultipleValue();
                SubLObject metrics_$74 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                results = results_$71;
                halt_reason = halt_reason_$72;
                inference = inference_$73;
                metrics = metrics_$74;
            }
        }
        return Values.values(results, halt_reason, inference, metrics);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21900L)
    public static SubLObject inference_known_sentence_removal_query(SubLObject asent, SubLObject mt, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_known_sentence_removal_query_internal(asent, mt, truth);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(asent, mt, truth);
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
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && truth.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_known_sentence_removal_query_internal(asent, mt, truth)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, mt, truth));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 23200L)
    public static SubLObject inference_known_sentence_recursive_query(SubLObject formula, SubLObject mt, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject results = inference_true_sentence_recursive_query(formula, mt, number, UNPROVIDED);
        SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(results, inference_datastructures_enumerated_types.exhausted_query_halt_reason_p(halt_reason));
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 23600L)
    public static SubLObject inference_true_sentence_recursion_cycleP(SubLObject sentence) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_utilities.el_universal_p(sentence)) {
            return T;
        }
        return subl_promotions.memberP(sentence, $inference_true_sentence_recursion_stack$.getDynamicValue(thread), Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 24000L)
    public static SubLObject inference_true_sentence_recursive_query_internal(SubLObject formula, SubLObject mt, SubLObject number, SubLObject dummy_query_properties) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (dummy_query_properties == UNPROVIDED) {
            dummy_query_properties = $recursive_query_override_properties$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        if (NIL == inference_true_sentence_recursion_cycleP(formula)) {
            SubLObject _prev_bind_0 = $inference_true_sentence_recursion_stack$.currentBinding(thread);
            try {
                $inference_true_sentence_recursion_stack$.bind(cons(formula, $inference_true_sentence_recursion_stack$.getDynamicValue(thread)), thread);
                SubLObject query_properties = determine_sentence_recursive_query_properties(formula, mt);
                SubLObject _prev_bind_0_$78 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
                try {
                    czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
                    query_properties = conses_high.putf(query_properties, $MAX_NUMBER, number);
                    query_properties = conses_high.putf(query_properties, $ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec());
                    thread.resetMultipleValues();
                    SubLObject results_$79 = ask_utilities.inference_recursive_query_unique_bindings(formula, mt, query_properties);
                    SubLObject halt_reason_$80 = thread.secondMultipleValue();
                    SubLObject inference_$81 = thread.thirdMultipleValue();
                    SubLObject metrics_$82 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$79;
                    halt_reason = halt_reason_$80;
                    inference = inference_$81;
                    metrics = metrics_$82;
                } finally {
                    czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0_$78, thread);
                }
            } finally {
                $inference_true_sentence_recursion_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(results, halt_reason, inference, metrics);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 24000L)
    public static SubLObject inference_true_sentence_recursive_query(SubLObject formula, SubLObject mt, SubLObject number, SubLObject dummy_query_properties) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (dummy_query_properties == UNPROVIDED) {
            dummy_query_properties = $recursive_query_override_properties$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_true_sentence_recursive_query_internal(formula, mt, number, dummy_query_properties);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_4(formula, mt, number, dummy_query_properties);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (number.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (NIL != cached_args && NIL == cached_args.rest() && dummy_query_properties.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_true_sentence_recursive_query_internal(formula, mt, number, dummy_query_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt, number, dummy_query_properties));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25100L)
    public static SubLObject inference_mts_where_gaf_sentence_true_internal(SubLObject gaf_sentence) {
        SubLObject all_mt_support_combinations = inference_mts_where_gaf_sentence_true_justified(gaf_sentence);
        SubLObject all_mts = NIL;
        SubLObject cdolist_list_var = all_mt_support_combinations;
        SubLObject mt_support_combination = NIL;
        mt_support_combination = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = mt_support_combination;
            SubLObject mts = NIL;
            SubLObject support_combination = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list89);
            mts = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list89);
            support_combination = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$83 = mts;
                SubLObject mt = NIL;
                mt = cdolist_list_var_$83.first();
                while (NIL != cdolist_list_var_$83) {
                    SubLObject item_var = mt;
                    if (NIL == conses_high.member(item_var, all_mts, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                        all_mts = cons(item_var, all_mts);
                    }
                    cdolist_list_var_$83 = cdolist_list_var_$83.rest();
                    mt = cdolist_list_var_$83.first();
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list89);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_support_combination = cdolist_list_var.first();
        }
        return Sequences.nreverse(all_mts);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25100L)
    public static SubLObject inference_mts_where_gaf_sentence_true(SubLObject gaf_sentence) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_mts_where_gaf_sentence_true_internal(gaf_sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, gaf_sentence, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_mts_where_gaf_sentence_true_internal(gaf_sentence)));
            memoization_state.caching_state_put(caching_state, gaf_sentence, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25600L)
    public static SubLObject inference_mts_where_gaf_sentence_true_justified_memoized_internal(SubLObject gaf_sentence) {
        return inference_mts_where_gaf_sentence_true_justified(gaf_sentence);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25600L)
    public static SubLObject inference_mts_where_gaf_sentence_true_justified_memoized(SubLObject gaf_sentence) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_mts_where_gaf_sentence_true_justified_memoized_internal(gaf_sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, gaf_sentence, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_mts_where_gaf_sentence_true_justified_memoized_internal(gaf_sentence)));
            memoization_state.caching_state_put(caching_state, gaf_sentence, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25800L)
    public static SubLObject inference_mts_where_gaf_sentence_true_justified(SubLObject gaf_sentence) {
        SubLObject all_mt_support_combinations = NIL;
        SubLObject cdolist_list_var;
        SubLObject raw_justifications = cdolist_list_var = backward.removal_ask_justifications(gaf_sentence, $$InferencePSC, $TRUE, UNPROVIDED);
        SubLObject raw_justification = NIL;
        raw_justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$84;
            SubLObject mt_support_combinations = cdolist_list_var_$84 = forward.compute_all_mt_and_support_combinations(raw_justification, UNPROVIDED);
            SubLObject mt_support_combination = NIL;
            mt_support_combination = cdolist_list_var_$84.first();
            while (NIL != cdolist_list_var_$84) {
                all_mt_support_combinations = cons(mt_support_combination, all_mt_support_combinations);
                cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                mt_support_combination = cdolist_list_var_$84.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_justification = cdolist_list_var.first();
        }
        return Sequences.nreverse(all_mt_support_combinations);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 26500L)
    public static SubLObject determine_sentence_recursive_query_properties(SubLObject sentence, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $recursive_query_override_properties$.getDynamicValue(thread)) {
            return $recursive_query_override_properties$.getDynamicValue(thread);
        }
        return determine_sentence_recursive_query_properties_recursive(sentence, mt);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 27000L)
    public static SubLObject determine_sentence_recursive_query_properties_recursive(SubLObject sentence, SubLObject mt) {
        if (NIL != inference_completeness_utilities.inference_completely_enumerable_via_backchain_asentP(sentence, mt)) {
            if (NIL != inference_datastructures_inference.inference_p(inference_macros.current_controlling_inference())) {
                return list($MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference_macros.current_controlling_inference(), $MAX_TRANSFORMATION_DEPTH, UNPROVIDED), $MIN_RULE_UTILITY,
                        inference_utilities.inference_property_lookup(inference_macros.current_controlling_inference(), $MIN_RULE_UTILITY, UNPROVIDED));
            }
            return list($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MIN_RULE_UTILITY, $int$_100);
        } else {
            if (NIL != el_utilities.el_conjunction_p(sentence) || NIL != el_utilities.el_disjunction_p(sentence)) {
                SubLObject xjuncts = cycl_utilities.formula_args(sentence, UNPROVIDED);
                SubLObject xjunction_properties = NIL;
                SubLObject cdolist_list_var = xjuncts;
                SubLObject xjunct = NIL;
                xjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject xjunct_properties = determine_sentence_recursive_query_properties_recursive(xjunct, mt);
                    if (NIL != xjunct_properties) {
                        xjunction_properties = inference_parameters.inference_merge_query_properties(xjunction_properties, xjunct_properties);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    xjunct = cdolist_list_var.first();
                }
                return xjunction_properties;
            }
            if (NIL != el_utilities.el_existential_p(sentence)) {
                return determine_sentence_recursive_query_properties_recursive(cycl_utilities.formula_arg2(sentence, UNPROVIDED), mt);
            }
            if (NIL != el_utilities.el_formula_with_operator_p(cycl_utilities.formula_arg2(sentence, UNPROVIDED), $$TheSetOf)) {
                return determine_sentence_recursive_query_properties_recursive(cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(sentence, UNPROVIDED), UNPROVIDED), mt);
            }
            return NIL;
        }
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 28400L)
    public static SubLObject inference_rule_type_constraints_internal(SubLObject rule) {
        return assertion_utilities.rule_type_constraints(rule);
    }

    @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 28400L)
    public static SubLObject inference_rule_type_constraints(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_rule_type_constraints_internal(rule);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_rule_type_constraints_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_inference_trampolines_file() {
        declareFunction(myName, "inference_atomic_term_p", "INFERENCE-ATOMIC-TERM-P", 1, 0, false);
        declareFunction(myName, "inference_collectionP", "INFERENCE-COLLECTION?", 1, 1, false);
        declareFunction(myName, "inference_predicate_p", "INFERENCE-PREDICATE-P", 1, 0, false);
        new $inference_predicate_p$UnaryFunction();
        declareFunction(myName, "inference_commutative_relationP", "INFERENCE-COMMUTATIVE-RELATION?", 1, 0, false);
        declareFunction(myName, "inference_symmetric_predicateP", "INFERENCE-SYMMETRIC-PREDICATE?", 1, 0, false);
        new $inference_symmetric_predicateP$UnaryFunction();
        declareFunction(myName, "inference_commutative_predicate_p", "INFERENCE-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        new $inference_commutative_predicate_p$UnaryFunction();
        declareFunction(myName, "inference_partially_commutative_predicate_p_internal", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_partially_commutative_predicate_p", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        new $inference_partially_commutative_predicate_p$UnaryFunction();
        declareFunction(myName, "inference_at_least_partially_commutative_predicate_p", "INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction(myName, "inference_asymmetric_predicateP", "INFERENCE-ASYMMETRIC-PREDICATE?", 1, 0, false);
        declareFunction(myName, "inference_transitive_predicateP", "INFERENCE-TRANSITIVE-PREDICATE?", 1, 0, false);
        new $inference_transitive_predicateP$UnaryFunction();
        declareFunction(myName, "inference_evaluatable_predicateP", "INFERENCE-EVALUATABLE-PREDICATE?", 1, 0, false);
        new $inference_evaluatable_predicateP$UnaryFunction();
        declareFunction(myName, "inference_reflexive_predicateP", "INFERENCE-REFLEXIVE-PREDICATE?", 1, 0, false);
        new $inference_reflexive_predicateP$UnaryFunction();
        declareFunction(myName, "inference_irreflexive_predicateP", "INFERENCE-IRREFLEXIVE-PREDICATE?", 1, 0, false);
        declareFunction(myName, "inference_indeterminate_termP", "INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
        declareFunction(myName, "clear_indeterminate_term_p", "CLEAR-INDETERMINATE-TERM-P", 0, 0, false);
        new $clear_indeterminate_term_p$ZeroArityFunction();
        declareFunction(myName, "remove_indeterminate_term_p", "REMOVE-INDETERMINATE-TERM-P", 1, 0, false);
        declareFunction(myName, "indeterminate_term_p_internal", "INDETERMINATE-TERM-P-INTERNAL", 1, 0, false);
        declareFunction(myName, "indeterminate_term_p", "INDETERMINATE-TERM-P", 1, 0, false);
        declareFunction(myName, "memoized_inference_indeterminate_termP_internal", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?-INTERNAL", 1, 0, false);
        declareFunction(myName, "memoized_inference_indeterminate_termP", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
        declareFunction(myName, "inference_some_genl_pred_or_inverseP", "INFERENCE-SOME-GENL-PRED-OR-INVERSE?", 1, 0, false);
        new $inference_some_genl_pred_or_inverseP$UnaryFunction();
        declareFunction(myName, "inference_some_spec_pred_or_inverseP", "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?", 1, 0, false);
        new $inference_some_spec_pred_or_inverseP$UnaryFunction();
        declareFunction(myName, "inference_some_negation_pred_or_inverseP", "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?", 1, 0, false);
        declareFunction(myName, "inference_all_genl_predicates_internal", "INFERENCE-ALL-GENL-PREDICATES-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_all_genl_predicates", "INFERENCE-ALL-GENL-PREDICATES", 1, 0, false);
        declareFunction(myName, "inference_all_spec_predicates", "INFERENCE-ALL-SPEC-PREDICATES", 1, 0, false);
        declareFunction(myName, "inference_all_spec_predicates_int_internal", "INFERENCE-ALL-SPEC-PREDICATES-INT-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_all_spec_predicates_int", "INFERENCE-ALL-SPEC-PREDICATES-INT", 1, 0, false);
        declareFunction(myName, "inference_all_genl_inverses_internal", "INFERENCE-ALL-GENL-INVERSES-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_all_genl_inverses", "INFERENCE-ALL-GENL-INVERSES", 1, 0, false);
        declareFunction(myName, "inference_all_spec_inverses", "INFERENCE-ALL-SPEC-INVERSES", 1, 0, false);
        declareFunction(myName, "inference_all_spec_inverses_int_internal", "INFERENCE-ALL-SPEC-INVERSES-INT-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_all_spec_inverses_int", "INFERENCE-ALL-SPEC-INVERSES-INT", 1, 0, false);
        declareFunction(myName, "inference_all_proper_genl_predicates_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_all_proper_genl_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction(myName, "inference_all_proper_spec_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction(myName, "inference_all_proper_spec_predicates_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_all_proper_spec_predicates_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT", 2, 0, false);
        declareFunction(myName, "inference_all_proper_genl_inverses_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_all_proper_genl_inverses_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction(myName, "inference_all_proper_spec_inverses_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction(myName, "inference_all_proper_spec_inverses_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_all_proper_spec_inverses_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT", 2, 0, false);
        declareFunction(myName, "inference_all_negation_predicates_with_axiom_index_internal", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_all_negation_predicates_with_axiom_index", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction(myName, "inference_some_max_floor_mts", "INFERENCE-SOME-MAX-FLOOR-MTS", 1, 0, false);
        declareFunction(myName, "clear_some_max_floor_mtsP_cached", "CLEAR-SOME-MAX-FLOOR-MTS?-CACHED", 0, 0, false);
        declareFunction(myName, "remove_some_max_floor_mtsP_cached", "REMOVE-SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
        declareFunction(myName, "some_max_floor_mtsP_cached_internal", "SOME-MAX-FLOOR-MTS?-CACHED-INTERNAL", 1, 0, false);
        declareFunction(myName, "some_max_floor_mtsP_cached", "SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
        declareFunction(myName, "inference_max_floor_mts_with_cycles_pruned", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED", 1, 1, false);
        declareFunction(myName, "clear_inference_max_floor_mts_with_cycles_pruned_cached", "CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 0, 0, false);
        declareFunction(myName, "remove_inference_max_floor_mts_with_cycles_pruned_cached", "REMOVE-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
        declareFunction(myName, "inference_max_floor_mts_with_cycles_pruned_cached_internal", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_max_floor_mts_with_cycles_pruned_cached", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
        declareFunction(myName, "inference_max_floor_mts_of_nat_internal", "INFERENCE-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_max_floor_mts_of_nat", "INFERENCE-MAX-FLOOR-MTS-OF-NAT", 1, 0, false);
        declareFunction(myName, "some_max_floor_mtsP", "SOME-MAX-FLOOR-MTS?", 1, 0, false);
        declareFunction(myName, "inference_applicable_sdctP_internal", "INFERENCE-APPLICABLE-SDCT?-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_applicable_sdctP", "INFERENCE-APPLICABLE-SDCT?", 1, 0, false);
        declareFunction(myName, "expression_has_inference_excepted_assertionP_iteration_helper", "EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?-ITERATION-HELPER", 1, 0, false);
        declareFunction(myName, "expression_has_inference_excepted_assertionP", "EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?", 1, 0, false);
        declareFunction(myName, "inference_excepted_assertionP", "INFERENCE-EXCEPTED-ASSERTION?", 1, 1, false);
        declareFunction(myName, "memoized_inference_excepted_assertionP_internal", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-INTERNAL", 3, 0, false);
        declareFunction(myName, "memoized_inference_excepted_assertionP", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?", 3, 0, false);
        declareFunction(myName, "inference_excepted_assertionP_shallow", "INFERENCE-EXCEPTED-ASSERTION?-SHALLOW", 1, 1, false);
        declareFunction(myName, "memoized_inference_excepted_assertionP_shallow_internal", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW-INTERNAL", 3, 0, false);
        declareFunction(myName, "memoized_inference_excepted_assertionP_shallow", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW", 3, 0, false);
        declareMacro(me, "do_inference_gafs_potentially_matching_formula", "DO-INFERENCE-GAFS-POTENTIALLY-MATCHING-FORMULA");
        declareMacro(me, "do_inference_gaf_lookup_index", "DO-INFERENCE-GAF-LOOKUP-INDEX");
        declareFunction(myName, "inference_gaf_lookup_index_internal", "INFERENCE-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_gaf_lookup_index", "INFERENCE-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction(myName, "inference_num_gaf_lookup_index_internal", "INFERENCE-NUM-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_num_gaf_lookup_index", "INFERENCE-NUM-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction(myName, "inference_relevant_num_gaf_lookup_index_internal", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX-INTERNAL", 3, 0, false);
        declareFunction(myName, "inference_relevant_num_gaf_lookup_index", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX", 3, 0, false);
        declareFunction(myName, "inference_argnums_from_gafs_mentioning_term_internal", "INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_argnums_from_gafs_mentioning_term", "INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM", 1, 0, false);
        declareFunction(myName, "inference_preds_from_gafs_mentioning_term_at_index_internal", "INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX-INTERNAL", 1, 1, false);
        declareFunction(myName, "inference_preds_from_gafs_mentioning_term_at_index", "INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX", 1, 1, false);
        declareFunction(myName, "inference_key_gaf_arg_index_internal", "INFERENCE-KEY-GAF-ARG-INDEX-INTERNAL", 1, 2, false);
        declareFunction(myName, "inference_key_gaf_arg_index", "INFERENCE-KEY-GAF-ARG-INDEX", 1, 2, false);
        declareFunction(myName, "compute_problem_backchain_requiredP", "COMPUTE-PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false);
        declareFunction(myName, "inference_some_backchain_required_asent_in_clauseP", "INFERENCE-SOME-BACKCHAIN-REQUIRED-ASENT-IN-CLAUSE?", 1, 0, false);
        declareFunction(myName, "inference_backchain_required_contextualized_asentP", "INFERENCE-BACKCHAIN-REQUIRED-CONTEXTUALIZED-ASENT?", 1, 0, false);
        declareFunction(myName, "inference_backchain_required_asentP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT?", 2, 0, false);
        declareFunction(myName, "inference_predicate_backchain_requiredP_internal", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_predicate_backchain_requiredP", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction(myName, "inference_backchain_forbiddenP_internal", "INFERENCE-BACKCHAIN-FORBIDDEN?-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_backchain_forbiddenP", "INFERENCE-BACKCHAIN-FORBIDDEN?", 2, 0, false);
        declareFunction(myName, "inference_collection_isa_backchain_encouragedP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_collection_isa_backchain_encouragedP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction(myName, "inference_collection_genls_backchain_encouragedP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_collection_genls_backchain_encouragedP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction(myName, "inference_collection_backchain_encouragedP_internal", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_collection_backchain_encouragedP", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction(myName, "inference_collection_backchain_requiredP_internal", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_collection_backchain_requiredP", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction(myName, "inference_collection_isa_backchain_requiredP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_collection_isa_backchain_requiredP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction(myName, "inference_collection_genls_backchain_requiredP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_collection_genls_backchain_requiredP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction(myName, "backchain_control_mt", "BACKCHAIN-CONTROL-MT", 1, 0, false);
        declareFunction(myName, "inference_relevant_mtP", "INFERENCE-RELEVANT-MT?", 1, 1, false);
        declareFunction(myName, "inference_relevant_assertionP", "INFERENCE-RELEVANT-ASSERTION?", 1, 1, false);
        declareFunction(myName, "inference_relevant_predicate_assertionP", "INFERENCE-RELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
        declareFunction(myName, "inference_relevant_termP", "INFERENCE-RELEVANT-TERM?", 1, 1, false);
        declareFunction(myName, "inference_irrelevant_mtP", "INFERENCE-IRRELEVANT-MT?", 1, 1, false);
        declareFunction(myName, "inference_irrelevant_assertionP", "INFERENCE-IRRELEVANT-ASSERTION?", 1, 1, false);
        declareFunction(myName, "inference_irrelevant_predicate_assertionP", "INFERENCE-IRRELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
        declareFunction(myName, "inference_irrelevant_termP", "INFERENCE-IRRELEVANT-TERM?", 1, 1, false);
        declareFunction(myName, "inference_rule_has_utilityP", "INFERENCE-RULE-HAS-UTILITY?", 1, 1, false);
        declareFunction(myName, "inference_rule_utility", "INFERENCE-RULE-UTILITY", 1, 1, false);
        declareFunction(myName, "inference_known_sentence_removal_query_internal", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY-INTERNAL", 2, 1, false);
        declareFunction(myName, "inference_known_sentence_removal_query", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY", 2, 1, false);
        declareFunction(myName, "inference_known_sentence_recursive_query", "INFERENCE-KNOWN-SENTENCE-RECURSIVE-QUERY", 2, 1, false);
        declareFunction(myName, "inference_true_sentence_recursion_cycleP", "INFERENCE-TRUE-SENTENCE-RECURSION-CYCLE?", 1, 0, false);
        declareFunction(myName, "inference_true_sentence_recursive_query_internal", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY-INTERNAL", 2, 2, false);
        declareFunction(myName, "inference_true_sentence_recursive_query", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY", 2, 2, false);
        declareFunction(myName, "inference_mts_where_gaf_sentence_true_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_mts_where_gaf_sentence_true", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE", 1, 0, false);
        declareFunction(myName, "inference_mts_where_gaf_sentence_true_justified_memoized_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_mts_where_gaf_sentence_true_justified_memoized", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED", 1, 0, false);
        declareFunction(myName, "inference_mts_where_gaf_sentence_true_justified", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED", 1, 0, false);
        declareFunction(myName, "determine_sentence_recursive_query_properties", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(myName, "determine_sentence_recursive_query_properties_recursive", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES-RECURSIVE", 2, 0, false);
        declareFunction(myName, "inference_rule_type_constraints_internal", "INFERENCE-RULE-TYPE-CONSTRAINTS-INTERNAL", 1, 0, false);
        declareFunction(myName, "inference_rule_type_constraints", "INFERENCE-RULE-TYPE-CONSTRAINTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_trampolines_file() {
        $indeterminate_term_p_caching_state$ = deflexical("*INDETERMINATE-TERM-P-CACHING-STATE*", NIL);
        $some_max_floor_mtsP_cached_caching_state$ = deflexical("*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*", NIL);
        $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$ = SubLFiles.deflexical("*INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-CACHING-STATE*", NIL);
        $block_inference_excepted_assertion_in_inference_index_lookupP$ = SubLFiles.defparameter("*BLOCK-INFERENCE-EXCEPTED-ASSERTION-IN-INFERENCE-INDEX-LOOKUP?*", T);
        $disable_inference_excepted_assertion_supportP$ = SubLFiles.defparameter("*DISABLE-INFERENCE-EXCEPTED-ASSERTION-SUPPORT?*", NIL);
        $recursive_query_override_properties$ = defparameter("*RECURSIVE-QUERY-OVERRIDE-PROPERTIES*", NIL);
        $inference_true_sentence_recursion_stack$ = defparameter("*INFERENCE-TRUE-SENTENCE-RECURSION-STACK*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_trampolines_file() {
        memoization_state.note_memoized_function($sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P);
        memoization_state.note_globally_cached_function($sym2$INDETERMINATE_TERM_P);
        memoization_state.note_memoized_function($sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_);
        memoization_state.note_memoized_function($sym7$INFERENCE_ALL_GENL_PREDICATES);
        memoization_state.note_memoized_function($sym8$INFERENCE_ALL_SPEC_PREDICATES_INT);
        memoization_state.note_memoized_function($sym9$INFERENCE_ALL_GENL_INVERSES);
        memoization_state.note_memoized_function($sym10$INFERENCE_ALL_SPEC_INVERSES_INT);
        memoization_state.note_memoized_function($sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX);
        memoization_state.note_memoized_function($sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT);
        memoization_state.note_memoized_function($sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX);
        memoization_state.note_memoized_function($sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT);
        memoization_state.note_memoized_function($sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX);
        memoization_state.note_globally_cached_function($sym33$SOME_MAX_FLOOR_MTS__CACHED);
        memoization_state.note_globally_cached_function($sym37$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED);
        memoization_state.note_memoized_function($sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT);
        memoization_state.note_memoized_function($sym41$INFERENCE_APPLICABLE_SDCT_);
        memoization_state.note_memoized_function($sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_);
        memoization_state.note_memoized_function($sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW);
        memoization_state.note_memoized_function($sym53$INFERENCE_GAF_LOOKUP_INDEX);
        memoization_state.note_memoized_function($sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX);
        memoization_state.note_memoized_function($sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX);
        memoization_state.note_memoized_function($sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM);
        memoization_state.note_memoized_function($sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX);
        memoization_state.note_memoized_function($sym60$INFERENCE_KEY_GAF_ARG_INDEX);
        memoization_state.note_memoized_function($sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym66$INFERENCE_BACKCHAIN_FORBIDDEN_);
        memoization_state.note_memoized_function($sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_memoized_function($sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_memoized_function($sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_memoized_function($sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY);
        memoization_state.note_memoized_function($sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY);
        memoization_state.note_memoized_function($sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE);
        memoization_state.note_memoized_function($sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED);
        memoization_state.note_memoized_function($sym96$INFERENCE_RULE_TYPE_CONSTRAINTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_trampolines_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_trampolines_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_trampolines_file();
    }

    static {
        me = new inference_trampolines();
        $indeterminate_term_p_caching_state$ = null;
        $some_max_floor_mtsP_cached_caching_state$ = null;
        $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$ = null;
        $block_inference_excepted_assertion_in_inference_index_lookupP$ = null;
        $disable_inference_excepted_assertion_supportP$ = null;
        $recursive_query_override_properties$ = null;
        $inference_true_sentence_recursion_stack$ = null;
        $$Collection = makeConstSym(("Collection"));
        $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P = makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P");
        $sym2$INDETERMINATE_TERM_P = makeSymbol("INDETERMINATE-TERM-P");
        $$IndeterminateTerm = makeConstSym(("IndeterminateTerm"));
        $sym4$_INDETERMINATE_TERM_P_CACHING_STATE_ = makeSymbol("*INDETERMINATE-TERM-P-CACHING-STATE*");
        $sym5$CLEAR_INDETERMINATE_TERM_P = makeSymbol("CLEAR-INDETERMINATE-TERM-P");
        $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_ = makeSymbol("MEMOIZED-INFERENCE-INDETERMINATE-TERM?");
        $sym7$INFERENCE_ALL_GENL_PREDICATES = makeSymbol("INFERENCE-ALL-GENL-PREDICATES");
        $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT = makeSymbol("INFERENCE-ALL-SPEC-PREDICATES-INT");
        $sym9$INFERENCE_ALL_GENL_INVERSES = makeSymbol("INFERENCE-ALL-GENL-INVERSES");
        $sym10$INFERENCE_ALL_SPEC_INVERSES_INT = makeSymbol("INFERENCE-ALL-SPEC-INVERSES-INT");
        $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX = makeSymbol("INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX");
        $DEPTH = makeKeyword("DEPTH");
        $STACK = makeKeyword("STACK");
        $QUEUE = makeKeyword("QUEUE");
        $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $ERROR = makeKeyword("ERROR");
        $str17$_A_is_not_a__A = makeString("~A is not a ~A");
        $sym18$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
        $CERROR = makeKeyword("CERROR");
        $str20$continue_anyway = makeString("continue anyway");
        $WARN = makeKeyword("WARN");
        $str22$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
        $$genlPreds = makeConstSym(("genlPreds"));
        $str24$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");
        $str25$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str26$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT = makeSymbol("INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT");
        $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX = makeSymbol("INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX");
        $$genlInverse = makeConstSym(("genlInverse"));
        $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT = makeSymbol("INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT");
        $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX = makeSymbol("INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX");
        $sym32$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
        $sym33$SOME_MAX_FLOOR_MTS__CACHED = makeSymbol("SOME-MAX-FLOOR-MTS?-CACHED");
        $sym34$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_ = makeSymbol("*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*");
        $int$256 = makeInteger(256);
        $sym36$CLEAR_SOME_MAX_FLOOR_MTS__CACHED = makeSymbol("CLEAR-SOME-MAX-FLOOR-MTS?-CACHED");
        $sym37$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED = makeSymbol("INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED");
        $sym38$_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED_CACHING_STATE_ = makeSymbol("*INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-CACHING-STATE*");
        $sym39$CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED = makeSymbol("CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED");
        $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT = makeSymbol("INFERENCE-MAX-FLOOR-MTS-OF-NAT");
        $sym41$INFERENCE_APPLICABLE_SDCT_ = makeSymbol("INFERENCE-APPLICABLE-SDCT?");
        $sym42$ASSERTION_P = makeSymbol("ASSERTION-P");
        $sym43$INFERENCE_EXCEPTED_ASSERTION__SHALLOW = makeSymbol("INFERENCE-EXCEPTED-ASSERTION?-SHALLOW");
        $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_ = makeSymbol("MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?");
        $int$2048 = makeInteger(2048);
        $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW = makeSymbol("MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW");
        $list47 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list48 = list(makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $sym51$DO_INFERENCE_GAF_LOOKUP_INDEX = makeSymbol("DO-INFERENCE-GAF-LOOKUP-INDEX");
        $sym52$DO_GAF_LOOKUP_INDEX = makeSymbol("DO-GAF-LOOKUP-INDEX");
        $sym53$INFERENCE_GAF_LOOKUP_INDEX = makeSymbol("INFERENCE-GAF-LOOKUP-INDEX");
        $TRUTH = makeKeyword("TRUTH");
        $sym55$SENSE_TRUTH = makeSymbol("SENSE-TRUTH");
        $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX = makeSymbol("INFERENCE-NUM-GAF-LOOKUP-INDEX");
        $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX = makeSymbol("INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX");
        $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM = makeSymbol("INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM");
        $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX = makeSymbol("INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX");
        $sym60$INFERENCE_KEY_GAF_ARG_INDEX = makeSymbol("INFERENCE-KEY-GAF-ARG-INDEX");
        $sym61$PROBLEM_P = makeSymbol("PROBLEM-P");
        $list62 = list(makeConstSym(("isa")), makeConstSym(("genls")));
        $$isa = makeConstSym(("isa"));
        $$genls = makeConstSym(("genls"));
        $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?");
        $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_ = makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN?");
        $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?");
        $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?");
        $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?");
        $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?");
        $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?");
        $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?");
        $$highlyRelevantMt = makeConstSym(("highlyRelevantMt"));
        $TRUE = makeKeyword("TRUE");
        $$highlyRelevantAssertion = makeConstSym(("highlyRelevantAssertion"));
        $$highlyRelevantPredAssertion = makeConstSym(("highlyRelevantPredAssertion"));
        $$highlyRelevantTerm = makeConstSym(("highlyRelevantTerm"));
        $$irrelevantMt = makeConstSym(("irrelevantMt"));
        $$irrelevantAssertion = makeConstSym(("irrelevantAssertion"));
        $$irrelevantPredAssertion = makeConstSym(("irrelevantPredAssertion"));
        $$irrelevantTerm = makeConstSym(("irrelevantTerm"));
        $$assertionUtility = makeConstSym(("assertionUtility"));
        $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY = makeSymbol("INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY");
        $ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
        $FALSE = makeKeyword("FALSE");
        $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY = makeSymbol("INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY");
        $MAX_NUMBER = makeKeyword("MAX-NUMBER");
        $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE = makeSymbol("INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE");
        $list89 = list(makeSymbol("MTS"), makeSymbol("SUPPORT-COMBINATION"));
        $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED = makeSymbol("INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED");
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");
        $int$_100 = makeInteger(-100);
        $$TheSetOf = makeConstSym(("TheSetOf"));
        $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS = makeSymbol("INFERENCE-RULE-TYPE-CONSTRAINTS");
    }

    public static class $inference_predicate_p$UnaryFunction extends UnaryFunction {
        public $inference_predicate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_predicate_p(arg1);
        }
    }

    public static class $inference_symmetric_predicateP$UnaryFunction extends UnaryFunction {
        public $inference_symmetric_predicateP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-SYMMETRIC-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_symmetric_predicateP(arg1);
        }
    }

    public static class $inference_commutative_predicate_p$UnaryFunction extends UnaryFunction {
        public $inference_commutative_predicate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-COMMUTATIVE-PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_commutative_predicate_p(arg1);
        }
    }

    public static class $inference_partially_commutative_predicate_p$UnaryFunction extends UnaryFunction {
        public $inference_partially_commutative_predicate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_partially_commutative_predicate_p(arg1);
        }
    }

    public static class $inference_transitive_predicateP$UnaryFunction extends UnaryFunction {
        public $inference_transitive_predicateP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-TRANSITIVE-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_transitive_predicateP(arg1);
        }
    }

    public static class $inference_evaluatable_predicateP$UnaryFunction extends UnaryFunction {
        public $inference_evaluatable_predicateP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-EVALUATABLE-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_evaluatable_predicateP(arg1);
        }
    }

    public static class $inference_reflexive_predicateP$UnaryFunction extends UnaryFunction {
        public $inference_reflexive_predicateP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-REFLEXIVE-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_reflexive_predicateP(arg1);
        }
    }

    public static class $clear_indeterminate_term_p$ZeroArityFunction extends ZeroArityFunction {
        public $clear_indeterminate_term_p$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-INDETERMINATE-TERM-P"));
        }

        @Override
        public SubLObject processItem() {
            return clear_indeterminate_term_p();
        }
    }

    public static class $inference_some_genl_pred_or_inverseP$UnaryFunction extends UnaryFunction {
        public $inference_some_genl_pred_or_inverseP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_some_genl_pred_or_inverseP(arg1);
        }
    }

    public static class $inference_some_spec_pred_or_inverseP$UnaryFunction extends UnaryFunction {
        public $inference_some_spec_pred_or_inverseP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_some_spec_pred_or_inverseP(arg1);
        }
    }

}
/*
 *
 * Total time: 1586 ms
 *
 */