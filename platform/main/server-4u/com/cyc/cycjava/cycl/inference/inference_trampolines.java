/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.assertion_utilities.rule_type_constraints;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_of_atomic_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-TRAMPOLINES
 * source file: /cyc/top/cycl/inference/inference-trampolines.lisp
 * created:     2019/07/03 17:37:37
 */
public final class inference_trampolines extends SubLTranslatedFile implements V12 {
    /**
     * Return T iff PROBLEM is backchain required
     */
    @LispMethod(comment = "Return T iff PROBLEM is backchain required")
    public static final SubLObject problem_backchain_requiredP(SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject query = inference_datastructures_problem.problem_query(problem);
            SubLObject cdolist_list_var = query;
            SubLObject contextualized_dnf_clause = NIL;
            for (contextualized_dnf_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_dnf_clause = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.inference.inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause)) {
                    return NIL;
                }
            }
            return T;
        }
    }

    public static final SubLFile me = new inference_trampolines();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $some_max_floor_mtsP_cached_caching_state$ = makeSymbol("*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $block_inference_excepted_assertion_in_inference_index_lookupP$ = makeSymbol("*BLOCK-INFERENCE-EXCEPTED-ASSERTION-IN-INFERENCE-INDEX-LOOKUP?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $disable_inference_excepted_assertion_supportP$ = makeSymbol("*DISABLE-INFERENCE-EXCEPTED-ASSERTION-SUPPORT?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $recursive_query_override_properties$ = makeSymbol("*RECURSIVE-QUERY-OVERRIDE-PROPERTIES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $inference_true_sentence_recursion_stack$ = makeSymbol("*INFERENCE-TRUE-SENTENCE-RECURSION-STACK*");



    private static final SubLSymbol INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P = makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P");

    private static final SubLSymbol INDETERMINATE_TERM_P = makeSymbol("INDETERMINATE-TERM-P");



    private static final SubLSymbol $indeterminate_term_p_caching_state$ = makeSymbol("*INDETERMINATE-TERM-P-CACHING-STATE*");

    private static final SubLSymbol CLEAR_INDETERMINATE_TERM_P = makeSymbol("CLEAR-INDETERMINATE-TERM-P");

    private static final SubLSymbol $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_ = makeSymbol("MEMOIZED-INFERENCE-INDETERMINATE-TERM?");

    private static final SubLSymbol INFERENCE_ALL_GENL_PREDICATES = makeSymbol("INFERENCE-ALL-GENL-PREDICATES");

    private static final SubLSymbol INFERENCE_ALL_SPEC_PREDICATES_INT = makeSymbol("INFERENCE-ALL-SPEC-PREDICATES-INT");

    private static final SubLSymbol INFERENCE_ALL_GENL_INVERSES = makeSymbol("INFERENCE-ALL-GENL-INVERSES");

    private static final SubLSymbol INFERENCE_ALL_SPEC_INVERSES_INT = makeSymbol("INFERENCE-ALL-SPEC-INVERSES-INT");

    private static final SubLSymbol INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX = makeSymbol("INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX");

    private static final SubLString $str17$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str22$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str24$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    static private final SubLString $str25$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str26$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT = makeSymbol("INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT");

    private static final SubLSymbol INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX = makeSymbol("INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX");



    private static final SubLSymbol INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT = makeSymbol("INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT");

    private static final SubLSymbol INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX = makeSymbol("INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX");

    private static final SubLSymbol $sym33$SOME_MAX_FLOOR_MTS__CACHED = makeSymbol("SOME-MAX-FLOOR-MTS?-CACHED");

    private static final SubLSymbol $sym34$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_ = makeSymbol("*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*");

    private static final SubLSymbol $sym36$CLEAR_SOME_MAX_FLOOR_MTS__CACHED = makeSymbol("CLEAR-SOME-MAX-FLOOR-MTS?-CACHED");

    private static final SubLSymbol INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED = makeSymbol("INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED");

    private static final SubLSymbol $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$ = makeSymbol("*INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-CACHING-STATE*");

    private static final SubLSymbol CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED = makeSymbol("CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED");

    private static final SubLSymbol INFERENCE_MAX_FLOOR_MTS_OF_NAT = makeSymbol("INFERENCE-MAX-FLOOR-MTS-OF-NAT");

    private static final SubLSymbol $sym41$INFERENCE_APPLICABLE_SDCT_ = makeSymbol("INFERENCE-APPLICABLE-SDCT?");

    private static final SubLSymbol $sym43$INFERENCE_EXCEPTED_ASSERTION__SHALLOW = makeSymbol("INFERENCE-EXCEPTED-ASSERTION?-SHALLOW");

    private static final SubLSymbol $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_ = makeSymbol("MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLSymbol $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW = makeSymbol("MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW");

    private static final SubLList $list47 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list48 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DO_INFERENCE_GAF_LOOKUP_INDEX = makeSymbol("DO-INFERENCE-GAF-LOOKUP-INDEX");

    private static final SubLSymbol DO_GAF_LOOKUP_INDEX = makeSymbol("DO-GAF-LOOKUP-INDEX");

    private static final SubLSymbol INFERENCE_GAF_LOOKUP_INDEX = makeSymbol("INFERENCE-GAF-LOOKUP-INDEX");

    private static final SubLSymbol SENSE_TRUTH = makeSymbol("SENSE-TRUTH");

    private static final SubLSymbol INFERENCE_NUM_GAF_LOOKUP_INDEX = makeSymbol("INFERENCE-NUM-GAF-LOOKUP-INDEX");

    private static final SubLSymbol INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX = makeSymbol("INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX");

    private static final SubLSymbol INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM = makeSymbol("INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM");

    private static final SubLSymbol INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX = makeSymbol("INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX");

    private static final SubLSymbol INFERENCE_KEY_GAF_ARG_INDEX = makeSymbol("INFERENCE-KEY-GAF-ARG-INDEX");

    private static final SubLList $list62 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));





    private static final SubLSymbol $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?");

    private static final SubLSymbol $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_ = makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN?");

    private static final SubLSymbol $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?");

    private static final SubLSymbol $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?");

    private static final SubLSymbol $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?");

    private static final SubLSymbol $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?");

    private static final SubLSymbol $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?");

    private static final SubLSymbol $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?");



















    private static final SubLSymbol INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY = makeSymbol("INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY");

    private static final SubLSymbol INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY = makeSymbol("INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY");

    private static final SubLSymbol INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE = makeSymbol("INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE");

    private static final SubLList $list89 = list(makeSymbol("MTS"), makeSymbol("SUPPORT-COMBINATION"));

    private static final SubLSymbol INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED = makeSymbol("INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED");



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");

    private static final SubLInteger $int$_100 = makeInteger(-100);



    private static final SubLSymbol INFERENCE_RULE_TYPE_CONSTRAINTS = makeSymbol("INFERENCE-RULE-TYPE-CONSTRAINTS");

    // Definitions
    public static final SubLObject inference_atomic_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.subl_strict_atomic_term_p(v_object)) || (NIL != constant_p(v_object)));
    }

    // Definitions
    public static SubLObject inference_atomic_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.subl_strict_atomic_term_p(v_object)) || (NIL != constant_p(v_object)));
    }

    public static final SubLObject inference_collectionP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.collectionP(v_object))) || ((NIL != possibly_naut_p(v_object)) && (NIL != isa.isaP(v_object, $$Collection, mt, UNPROVIDED))));
    }

    public static SubLObject inference_collectionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.collectionP(v_object))) || ((NIL != possibly_naut_p(v_object)) && (NIL != isa.isaP(v_object, $$Collection, mt, UNPROVIDED))));
    }

    public static final SubLObject inference_predicate_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.predicateP(v_object)));
    }

    public static SubLObject inference_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.predicateP(v_object)));
    }

    public static final SubLObject inference_commutative_relationP_alt(SubLObject relation) {
        return fort_types_interface.commutative_relation_p(relation);
    }

    public static SubLObject inference_commutative_relationP(final SubLObject relation) {
        return fort_types_interface.commutative_relation_p(relation);
    }

    public static final SubLObject inference_symmetric_predicateP_alt(SubLObject predicate) {
        return fort_types_interface.symmetric_binary_predicate_p(predicate);
    }

    public static SubLObject inference_symmetric_predicateP(final SubLObject predicate) {
        return fort_types_interface.symmetric_binary_predicate_p(predicate);
    }

    public static final SubLObject inference_commutative_predicate_p_alt(SubLObject predicate) {
        return fort_types_interface.commutative_predicate_p(predicate);
    }

    public static SubLObject inference_commutative_predicate_p(final SubLObject predicate) {
        return fort_types_interface.commutative_predicate_p(predicate);
    }

    public static final SubLObject inference_partially_commutative_predicate_p_internal_alt(SubLObject predicate) {
        return fort_types_interface.partially_commutative_predicate_p(predicate);
    }

    public static SubLObject inference_partially_commutative_predicate_p_internal(final SubLObject predicate) {
        return fort_types_interface.partially_commutative_predicate_p(predicate);
    }

    public static final SubLObject inference_partially_commutative_predicate_p_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_partially_commutative_predicate_p_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_partially_commutative_predicate_p_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_partially_commutative_predicate_p(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_partially_commutative_predicate_p_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_partially_commutative_predicate_p_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject inference_at_least_partially_commutative_predicate_p_alt(SubLObject predicate) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.inference_trampolines.inference_commutative_predicate_p(predicate)) || (NIL != com.cyc.cycjava.cycl.inference.inference_trampolines.inference_partially_commutative_predicate_p(predicate)));
    }

    public static SubLObject inference_at_least_partially_commutative_predicate_p(final SubLObject predicate) {
        return makeBoolean((NIL != inference_commutative_predicate_p(predicate)) || (NIL != inference_partially_commutative_predicate_p(predicate)));
    }

    public static final SubLObject inference_asymmetric_predicateP_alt(SubLObject predicate) {
        return fort_types_interface.asymmetric_binary_predicate_p(predicate);
    }

    public static SubLObject inference_asymmetric_predicateP(final SubLObject predicate) {
        return fort_types_interface.asymmetric_binary_predicate_p(predicate);
    }

    public static final SubLObject inference_transitive_predicateP_alt(SubLObject predicate) {
        return fort_types_interface.transitive_binary_predicate_p(predicate);
    }

    public static SubLObject inference_transitive_predicateP(final SubLObject predicate) {
        return fort_types_interface.transitive_binary_predicate_p(predicate);
    }

    public static final SubLObject inference_evaluatable_predicateP_alt(SubLObject predicate) {
        return relation_evaluation.evaluatable_predicateP(predicate, UNPROVIDED);
    }

    public static SubLObject inference_evaluatable_predicateP(final SubLObject predicate) {
        return relation_evaluation.evaluatable_predicateP(predicate, UNPROVIDED);
    }

    public static final SubLObject inference_reflexive_predicateP_alt(SubLObject predicate) {
        return fort_types_interface.reflexive_binary_predicate_p(predicate);
    }

    public static SubLObject inference_reflexive_predicateP(final SubLObject predicate) {
        return fort_types_interface.reflexive_binary_predicate_p(predicate);
    }

    public static final SubLObject inference_irreflexive_predicateP_alt(SubLObject predicate) {
        return fort_types_interface.irreflexive_binary_predicate_p(predicate);
    }

    public static SubLObject inference_irreflexive_predicateP(final SubLObject predicate) {
        return fort_types_interface.irreflexive_binary_predicate_p(predicate);
    }

    public static final SubLObject inference_indeterminate_termP_alt(SubLObject value) {
        if (NIL != forts.fort_p(value)) {
            return com.cyc.cycjava.cycl.inference.inference_trampolines.indeterminate_term_p(value);
        } else {
            if (NIL != possibly_naut_p(value)) {
                return makeBoolean((NIL != kb_accessors.common_non_skolem_indeterminate_term_denoting_functionP(cycl_utilities.formula_operator(value))) || (NIL != com.cyc.cycjava.cycl.inference.inference_trampolines.memoized_inference_indeterminate_termP(value)));
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject inference_indeterminate_termP(final SubLObject value) {
        if (NIL != forts.fort_p(value)) {
            return indeterminate_term_p(value);
        }
        if (NIL != possibly_naut_p(value)) {
            return makeBoolean((NIL != kb_accessors.common_non_skolem_indeterminate_term_denoting_functionP(cycl_utilities.formula_operator(value))) || (NIL != memoized_inference_indeterminate_termP(value)));
        }
        return NIL;
    }

    public static final SubLObject clear_indeterminate_term_p_alt() {
        {
            SubLObject cs = $indeterminate_term_p_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_indeterminate_term_p() {
        final SubLObject cs = $indeterminate_term_p_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_indeterminate_term_p_alt(SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($indeterminate_term_p_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_indeterminate_term_p(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($indeterminate_term_p_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject indeterminate_term_p_internal_alt(SubLObject fort) {
        return isa.quoted_isa_in_any_mtP(fort, $$IndeterminateTerm);
    }

    public static SubLObject indeterminate_term_p_internal(final SubLObject fort) {
        return isa.quoted_isa_in_any_mtP(fort, $$IndeterminateTerm);
    }

    public static final SubLObject indeterminate_term_p_alt(SubLObject fort) {
        {
            SubLObject caching_state = $indeterminate_term_p_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(INDETERMINATE_TERM_P, $indeterminate_term_p_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_INDETERMINATE_TERM_P);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.indeterminate_term_p_internal(fort)));
                    memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject indeterminate_term_p(final SubLObject fort) {
        SubLObject caching_state = $indeterminate_term_p_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(INDETERMINATE_TERM_P, $indeterminate_term_p_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_INDETERMINATE_TERM_P);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(indeterminate_term_p_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject memoized_inference_indeterminate_termP_internal_alt(SubLObject value) {
        return isa.quoted_isa_in_any_mtP(value, $$IndeterminateTerm);
    }

    public static SubLObject memoized_inference_indeterminate_termP_internal(final SubLObject value) {
        return isa.quoted_isa_in_any_mtP(value, $$IndeterminateTerm);
    }

    public static final SubLObject memoized_inference_indeterminate_termP_alt(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.memoized_inference_indeterminate_termP_internal(value);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, value, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.memoized_inference_indeterminate_termP_internal(value)));
                        memoization_state.caching_state_put(caching_state, value, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject memoized_inference_indeterminate_termP(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
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
            results = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_inference_indeterminate_termP_internal(value)));
            memoization_state.caching_state_put(caching_state, value, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject inference_some_genl_pred_or_inverseP_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        ans = genl_predicates.some_genl_pred_or_inverseP(pred, NIL, UNPROVIDED);
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject inference_some_genl_pred_or_inverseP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            ans = genl_predicates.some_genl_pred_or_inverseP(pred, NIL, UNPROVIDED);
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject inference_some_spec_pred_or_inverseP_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred)) {
                return NIL;
            }
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        ans = genl_predicates.some_spec_pred_or_inverseP(pred, NIL, UNPROVIDED);
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject inference_some_spec_pred_or_inverseP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred)) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            ans = genl_predicates.some_spec_pred_or_inverseP(pred, NIL, UNPROVIDED);
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject inference_some_negation_pred_or_inverseP_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        ans = negation_predicate.some_negation_pred_or_inverseP(pred, NIL, UNPROVIDED);
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject inference_some_negation_pred_or_inverseP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            ans = negation_predicate.some_negation_pred_or_inverseP(pred, NIL, UNPROVIDED);
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject inference_all_genl_predicates_internal_alt(SubLObject predicate) {
        return genl_predicates.all_genl_predicates(predicate, NIL, UNPROVIDED);
    }

    public static SubLObject inference_all_genl_predicates_internal(final SubLObject predicate) {
        return genl_predicates.all_genl_predicates(predicate, NIL, UNPROVIDED);
    }

    public static final SubLObject inference_all_genl_predicates_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_genl_predicates_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_GENL_PREDICATES, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_GENL_PREDICATES, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_GENL_PREDICATES, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_genl_predicates_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_all_genl_predicates(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_genl_predicates_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_GENL_PREDICATES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_GENL_PREDICATES, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_GENL_PREDICATES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_all_genl_predicates_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject inference_all_spec_predicates_alt(SubLObject predicate) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(predicate)) {
            return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_spec_predicates_int(predicate);
        } else {
            return list(predicate);
        }
    }

    public static SubLObject inference_all_spec_predicates(final SubLObject predicate) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(predicate)) {
            return inference_all_spec_predicates_int(predicate);
        }
        return list(predicate);
    }

    public static final SubLObject inference_all_spec_predicates_int_internal_alt(SubLObject predicate) {
        return genl_predicates.all_spec_predicates(predicate, NIL, UNPROVIDED);
    }

    public static SubLObject inference_all_spec_predicates_int_internal(final SubLObject predicate) {
        return genl_predicates.all_spec_predicates(predicate, NIL, UNPROVIDED);
    }

    public static final SubLObject inference_all_spec_predicates_int_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_spec_predicates_int_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_SPEC_PREDICATES_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_SPEC_PREDICATES_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_SPEC_PREDICATES_INT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_spec_predicates_int_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_all_spec_predicates_int(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_spec_predicates_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_SPEC_PREDICATES_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_SPEC_PREDICATES_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_SPEC_PREDICATES_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_all_spec_predicates_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject inference_all_genl_inverses_internal_alt(SubLObject predicate) {
        return genl_predicates.all_genl_inverses(predicate, NIL, UNPROVIDED);
    }

    public static SubLObject inference_all_genl_inverses_internal(final SubLObject predicate) {
        return genl_predicates.all_genl_inverses(predicate, NIL, UNPROVIDED);
    }

    public static final SubLObject inference_all_genl_inverses_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_genl_inverses_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_GENL_INVERSES, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_GENL_INVERSES, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_GENL_INVERSES, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_genl_inverses_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_all_genl_inverses(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_genl_inverses_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_GENL_INVERSES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_GENL_INVERSES, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_GENL_INVERSES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_all_genl_inverses_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject inference_all_spec_inverses_alt(SubLObject predicate) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(predicate)) {
            return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_spec_inverses_int(predicate);
        } else {
            return NIL;
        }
    }

    public static SubLObject inference_all_spec_inverses(final SubLObject predicate) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(predicate)) {
            return inference_all_spec_inverses_int(predicate);
        }
        return NIL;
    }

    public static final SubLObject inference_all_spec_inverses_int_internal_alt(SubLObject predicate) {
        return genl_predicates.all_spec_inverses(predicate, NIL, UNPROVIDED);
    }

    public static SubLObject inference_all_spec_inverses_int_internal(final SubLObject predicate) {
        return genl_predicates.all_spec_inverses(predicate, NIL, UNPROVIDED);
    }

    public static final SubLObject inference_all_spec_inverses_int_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_spec_inverses_int_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_SPEC_INVERSES_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_SPEC_INVERSES_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_SPEC_INVERSES_INT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_spec_inverses_int_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_all_spec_inverses_int(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_spec_inverses_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_SPEC_INVERSES_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_SPEC_INVERSES_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_SPEC_INVERSES_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_all_spec_inverses_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return 0 listp; a list of all proper genlPreds of PRED with a relevant predicate rule index
    wrt sense SENSE.
     * @return 1 integerp; the total accumulated number of assertions indexed via
    the axiom index for all proper genlPreds of PRED.
     */
    @LispMethod(comment = "@return 0 listp; a list of all proper genlPreds of PRED with a relevant predicate rule index\r\nwrt sense SENSE.\r\n@return 1 integerp; the total accumulated number of assertions indexed via\r\nthe axiom index for all proper genlPreds of PRED.")
    public static final SubLObject inference_all_proper_genl_predicates_with_axiom_index_internal_alt(SubLObject pred, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cost = ZERO_INTEGER;
                SubLObject node_var = pred;
                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = NIL;
                            {
                                SubLObject _prev_bind_0_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt18$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt18$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt18$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt23$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt18$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                        while (NIL != node_and_predicate_mode) {
                                                            {
                                                                SubLObject node_var_7 = node_and_predicate_mode.first();
                                                                SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                SubLObject genl_pred = node_var_7;
                                                                {
                                                                    SubLObject _prev_bind_0_8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_7)) {
                                                                            if (genl_pred != pred) {
                                                                                {
                                                                                    SubLObject num = kb_indexing.relevant_num_predicate_rule_index(genl_pred, sense);
                                                                                    if (num.isPositive()) {
                                                                                        result = cons(genl_pred, result);
                                                                                        cost = add(cost, num);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_7);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_12)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_12);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_14 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , node_vars_link_node = cdolist_list_var_14.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_13, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_12 = dictionary_contents.do_dictionary_contents_next(iteration_state_12);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_12);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_11, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_15 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , generating_fn = cdolist_list_var_15.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_17 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_18 = new_list_17;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , node_vars_link_node = cdolist_list_var_18.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_16, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_10, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_9, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                            }
                                                            node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_6, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_5, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_3, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(nreverse(result), cost);
            }
        }
    }

    /**
     *
     *
     * @return 0 listp; a list of all proper genlPreds of PRED with a relevant predicate rule index
    wrt sense SENSE.
     * @return 1 integerp; the total accumulated number of assertions indexed via
    the axiom index for all proper genlPreds of PRED.
     */
    @LispMethod(comment = "@return 0 listp; a list of all proper genlPreds of PRED with a relevant predicate rule index\r\nwrt sense SENSE.\r\n@return 1 integerp; the total accumulated number of assertions indexed via\r\nthe axiom index for all proper genlPreds of PRED.")
    public static SubLObject inference_all_proper_genl_predicates_with_axiom_index_internal(final SubLObject pred, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$7 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject genl_pred = node_var_$7;
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$7)) && (!genl_pred.eql(pred))) {
                                            final SubLObject num = kb_indexing.relevant_num_predicate_rule_index(genl_pred, sense);
                                            if (num.isPositive()) {
                                                result = cons(genl_pred, result);
                                                cost = add(cost, num);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$7);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$12;
                                                                        for (iteration_state_$12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$12); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next(iteration_state_$12)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$12);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$14;
                                                        final SubLObject new_list = cdolist_list_var_$14 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$14.first();
                                                        while (NIL != cdolist_list_var_$14) {
                                                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
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
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return values(nreverse(result), cost);
    }

    public static final SubLObject inference_all_proper_genl_predicates_with_axiom_index_alt(SubLObject pred, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index_internal(pred, sense);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (sense == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index_internal(pred, sense)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, sense));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_all_proper_genl_predicates_with_axiom_index(final SubLObject pred, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_proper_genl_predicates_with_axiom_index_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_all_proper_genl_predicates_with_axiom_index_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_all_proper_spec_predicates_with_axiom_index_alt(SubLObject pred, SubLObject sense) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred)) {
            return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index_int(pred, sense);
        } else {
            return values(NIL, ZERO_INTEGER);
        }
    }

    public static SubLObject inference_all_proper_spec_predicates_with_axiom_index(final SubLObject pred, final SubLObject sense) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred)) {
            return inference_all_proper_spec_predicates_with_axiom_index_int(pred, sense);
        }
        return values(NIL, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return 0 listp; a list of all proper specPreds of PRED with a relevant predicate rule index
    wrt sense SENSE.
     * @return 1 integerp; the total accumulated number of rules indexed via
    the axiom index for all proper specPreds of PRED.
     */
    @LispMethod(comment = "@return 0 listp; a list of all proper specPreds of PRED with a relevant predicate rule index\r\nwrt sense SENSE.\r\n@return 1 integerp; the total accumulated number of rules indexed via\r\nthe axiom index for all proper specPreds of PRED.")
    public static final SubLObject inference_all_proper_spec_predicates_with_axiom_index_int_internal_alt(SubLObject pred, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cost = ZERO_INTEGER;
                SubLObject node_var = pred;
                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = NIL;
                            {
                                SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt18$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt18$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt18$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt23$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt18$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_20 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_21 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                        while (NIL != node_and_predicate_mode) {
                                                            {
                                                                SubLObject node_var_25 = node_and_predicate_mode.first();
                                                                SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                SubLObject spec_pred = node_var_25;
                                                                {
                                                                    SubLObject _prev_bind_0_26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_25)) {
                                                                            if (spec_pred != pred) {
                                                                                {
                                                                                    SubLObject num = kb_indexing.relevant_num_predicate_rule_index(spec_pred, sense);
                                                                                    if (num.isPositive()) {
                                                                                        result = cons(spec_pred, result);
                                                                                        cost = add(cost, num);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_25);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_30)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_30);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_32 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , node_vars_link_node = cdolist_list_var_32.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_31, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_30 = dictionary_contents.do_dictionary_contents_next(iteration_state_30);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_30);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_29, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_33 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest() , generating_fn = cdolist_list_var_33.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_35 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_36 = new_list_35;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , node_vars_link_node = cdolist_list_var_36.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_34, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_28, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_27, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_26, thread);
                                                                    }
                                                                }
                                                            }
                                                            node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_24, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_23, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_22, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_21, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_20, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_19, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(nreverse(result), cost);
            }
        }
    }

    /**
     *
     *
     * @return 0 listp; a list of all proper specPreds of PRED with a relevant predicate rule index
    wrt sense SENSE.
     * @return 1 integerp; the total accumulated number of rules indexed via
    the axiom index for all proper specPreds of PRED.
     */
    @LispMethod(comment = "@return 0 listp; a list of all proper specPreds of PRED with a relevant predicate rule index\r\nwrt sense SENSE.\r\n@return 1 integerp; the total accumulated number of rules indexed via\r\nthe axiom index for all proper specPreds of PRED.")
    public static SubLObject inference_all_proper_spec_predicates_with_axiom_index_int_internal(final SubLObject pred, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$23 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$23;
                                    final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$23)) && (!spec_pred.eql(pred))) {
                                            final SubLObject num = kb_indexing.relevant_num_predicate_rule_index(spec_pred, sense);
                                            if (num.isPositive()) {
                                                result = cons(spec_pred, result);
                                                cost = add(cost, num);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$23);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$28;
                                                                        for (iteration_state_$28 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$28); iteration_state_$28 = dictionary_contents.do_dictionary_contents_next(iteration_state_$28)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$28);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$30;
                                                        final SubLObject new_list = cdolist_list_var_$30 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$30.first();
                                                        while (NIL != cdolist_list_var_$30) {
                                                            final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
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
                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return values(nreverse(result), cost);
    }

    public static final SubLObject inference_all_proper_spec_predicates_with_axiom_index_int_alt(SubLObject pred, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index_int_internal(pred, sense);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index_int_internal(pred, sense)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, sense));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_all_proper_spec_predicates_with_axiom_index_int(final SubLObject pred, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_proper_spec_predicates_with_axiom_index_int_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_all_proper_spec_predicates_with_axiom_index_int_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_all_proper_genl_inverses_with_axiom_index_internal(final SubLObject pred, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$33 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$35 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$36 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$38 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$39 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject genl_pred = node_var_$39;
                                    final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$39)) && (!genl_pred.eql(pred))) {
                                            final SubLObject num = kb_indexing.relevant_num_predicate_rule_index(genl_pred, sense);
                                            if (num.isPositive()) {
                                                result = cons(genl_pred, result);
                                                cost = add(cost, num);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlInverse));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$39);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$44;
                                                                        for (iteration_state_$44 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$44); iteration_state_$44 = dictionary_contents.do_dictionary_contents_next(iteration_state_$44)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$44);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$46;
                                                        final SubLObject new_list = cdolist_list_var_$46 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$46.first();
                                                        while (NIL != cdolist_list_var_$46) {
                                                            final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
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
                final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return values(nreverse(result), cost);
    }

    public static SubLObject inference_all_proper_genl_inverses_with_axiom_index(final SubLObject pred, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_proper_genl_inverses_with_axiom_index_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_all_proper_genl_inverses_with_axiom_index_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_all_proper_spec_inverses_with_axiom_index(final SubLObject pred, final SubLObject sense) {
        if (NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred)) {
            return inference_all_proper_spec_inverses_with_axiom_index_int(pred, sense);
        }
        return values(NIL, ZERO_INTEGER);
    }

    public static SubLObject inference_all_proper_spec_inverses_with_axiom_index_int_internal(final SubLObject pred, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str17$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$51 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$52 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$55 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$55;
                                    final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$55)) && (!spec_pred.eql(pred))) {
                                            final SubLObject num = kb_indexing.relevant_num_predicate_rule_index(spec_pred, sense);
                                            if (num.isPositive()) {
                                                result = cons(spec_pred, result);
                                                cost = add(cost, num);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlInverse));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$55);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$60;
                                                                        for (iteration_state_$60 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$60); iteration_state_$60 = dictionary_contents.do_dictionary_contents_next(iteration_state_$60)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$60);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$62;
                                                        final SubLObject new_list = cdolist_list_var_$62 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$62.first();
                                                        while (NIL != cdolist_list_var_$62) {
                                                            final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
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
                final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return values(nreverse(result), cost);
    }

    public static SubLObject inference_all_proper_spec_inverses_with_axiom_index_int(final SubLObject pred, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_proper_spec_inverses_with_axiom_index_int_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_all_proper_spec_inverses_with_axiom_index_int_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return 0 listp; a list of all negationPreds of PRED with a relevant predicate rule index
    wrt sense SENSE.
     * @return 1 integerp; the total accumulated number of assertions indexed via
    the axiom index for all proper negationPreds of PRED.
     */
    @LispMethod(comment = "@return 0 listp; a list of all negationPreds of PRED with a relevant predicate rule index\r\nwrt sense SENSE.\r\n@return 1 integerp; the total accumulated number of assertions indexed via\r\nthe axiom index for all proper negationPreds of PRED.")
    public static final SubLObject inference_all_negation_predicates_with_axiom_index_internal_alt(SubLObject pred, SubLObject sense) {
        {
            SubLObject result = NIL;
            SubLObject cost = ZERO_INTEGER;
            SubLObject cdolist_list_var = negation_predicate.all_negation_predicates(pred, NIL, NIL);
            SubLObject negation_pred = NIL;
            for (negation_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , negation_pred = cdolist_list_var.first()) {
                {
                    SubLObject num = kb_indexing.relevant_num_predicate_rule_index(negation_pred, sense);
                    if (num.isPositive()) {
                        result = cons(negation_pred, result);
                        cost = add(cost, num);
                    }
                }
            }
            return values(nreverse(result), cost);
        }
    }

    /**
     *
     *
     * @return 0 listp; a list of all negationPreds of PRED with a relevant predicate rule index
    wrt sense SENSE.
     * @return 1 integerp; the total accumulated number of assertions indexed via
    the axiom index for all proper negationPreds of PRED.
     */
    @LispMethod(comment = "@return 0 listp; a list of all negationPreds of PRED with a relevant predicate rule index\r\nwrt sense SENSE.\r\n@return 1 integerp; the total accumulated number of assertions indexed via\r\nthe axiom index for all proper negationPreds of PRED.")
    public static SubLObject inference_all_negation_predicates_with_axiom_index_internal(final SubLObject pred, final SubLObject sense) {
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        SubLObject cdolist_list_var = negation_predicate.all_negation_predicates(pred, NIL, NIL);
        SubLObject negation_pred = NIL;
        negation_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject num = kb_indexing.relevant_num_predicate_rule_index(negation_pred, sense);
            if (num.isPositive()) {
                result = cons(negation_pred, result);
                cost = add(cost, num);
            }
            cdolist_list_var = cdolist_list_var.rest();
            negation_pred = cdolist_list_var.first();
        } 
        return values(nreverse(result), cost);
    }

    public static final SubLObject inference_all_negation_predicates_with_axiom_index_alt(SubLObject pred, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_negation_predicates_with_axiom_index_internal(pred, sense);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (sense == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_all_negation_predicates_with_axiom_index_internal(pred, sense)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, sense));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_all_negation_predicates_with_axiom_index(final SubLObject pred, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_all_negation_predicates_with_axiom_index_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_all_negation_predicates_with_axiom_index_internal(pred, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, sense));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_some_max_floor_mts_alt(SubLObject mts) {
        mts = remove_duplicates(mts, symbol_function(HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        mts = mt_vars.minimize_mts_wrt_core(mts);
        return com.cyc.cycjava.cycl.inference.inference_trampolines.some_max_floor_mtsP_cached(mts);
    }

    public static SubLObject inference_some_max_floor_mts(SubLObject mts) {
        mts = remove_duplicates(mts, symbol_function(HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        mts = mt_vars.minimize_mts_wrt_core(mts);
        return some_max_floor_mtsP_cached(mts);
    }

    public static final SubLObject clear_some_max_floor_mtsP_cached_alt() {
        {
            SubLObject cs = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_some_max_floor_mtsP_cached() {
        final SubLObject cs = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_some_max_floor_mtsP_cached_alt(SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($some_max_floor_mtsP_cached_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_some_max_floor_mtsP_cached(final SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($some_max_floor_mtsP_cached_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject some_max_floor_mtsP_cached_internal_alt(SubLObject mts) {
        return com.cyc.cycjava.cycl.inference.inference_trampolines.some_max_floor_mtsP(mts);
    }

    public static SubLObject some_max_floor_mtsP_cached_internal(final SubLObject mts) {
        return some_max_floor_mtsP(mts);
    }

    public static final SubLObject some_max_floor_mtsP_cached_alt(SubLObject mts) {
        {
            SubLObject caching_state = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym30$SOME_MAX_FLOOR_MTS__CACHED, $sym31$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
                memoization_state.register_mt_dependent_cache_clear_callback($sym33$CLEAR_SOME_MAX_FLOOR_MTS__CACHED);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.some_max_floor_mtsP_cached_internal(mts)));
                    memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject some_max_floor_mtsP_cached(final SubLObject mts) {
        SubLObject caching_state = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym33$SOME_MAX_FLOOR_MTS__CACHED, $sym34$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback($sym36$CLEAR_SOME_MAX_FLOOR_MTS__CACHED);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(some_max_floor_mtsP_cached_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject inference_max_floor_mts_with_cycles_pruned_alt(SubLObject mts, SubLObject candidates) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        mts = remove_duplicates(mts, symbol_function(HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        mts = mt_vars.minimize_mts_wrt_core(mts);
        if (NIL != candidates) {
            return genl_mts.max_floor_mts_with_cycles_pruned(mts, candidates, UNPROVIDED);
        } else {
            return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_max_floor_mts_with_cycles_pruned_cached(mts);
        }
    }

    public static SubLObject inference_max_floor_mts_with_cycles_pruned(SubLObject mts, SubLObject candidates) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        mts = remove_duplicates(mts, symbol_function(HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        mts = mt_vars.minimize_mts_wrt_core(mts);
        if (NIL != candidates) {
            return genl_mts.max_floor_mts_with_cycles_pruned(mts, candidates, UNPROVIDED);
        }
        return inference_max_floor_mts_with_cycles_pruned_cached(mts);
    }

    public static final SubLObject clear_inference_max_floor_mts_with_cycles_pruned_cached_alt() {
        {
            SubLObject cs = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_inference_max_floor_mts_with_cycles_pruned_cached() {
        final SubLObject cs = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_inference_max_floor_mts_with_cycles_pruned_cached_alt(SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_inference_max_floor_mts_with_cycles_pruned_cached(final SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_max_floor_mts_with_cycles_pruned_cached_internal_alt(SubLObject mts) {
        return genl_mts.max_floor_mts_with_cycles_pruned(mts, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_max_floor_mts_with_cycles_pruned_cached_internal(final SubLObject mts) {
        return genl_mts.max_floor_mts_with_cycles_pruned(mts, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_max_floor_mts_with_cycles_pruned_cached_alt(SubLObject mts) {
        {
            SubLObject caching_state = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED, $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
                memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_max_floor_mts_with_cycles_pruned_cached_internal(mts)));
                    memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject inference_max_floor_mts_with_cycles_pruned_cached(final SubLObject mts) {
        SubLObject caching_state = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED, $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(inference_max_floor_mts_with_cycles_pruned_cached_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject inference_max_floor_mts_of_nat_internal_alt(SubLObject nat) {
        return at_utilities.max_floor_mts_of_nat(nat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_max_floor_mts_of_nat_internal(final SubLObject nat) {
        return at_utilities.max_floor_mts_of_nat(nat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_max_floor_mts_of_nat_alt(SubLObject nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_max_floor_mts_of_nat_internal(nat);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MAX_FLOOR_MTS_OF_NAT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MAX_FLOOR_MTS_OF_NAT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MAX_FLOOR_MTS_OF_NAT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, nat, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_max_floor_mts_of_nat_internal(nat)));
                        memoization_state.caching_state_put(caching_state, nat, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_max_floor_mts_of_nat(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_max_floor_mts_of_nat_internal(nat);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MAX_FLOOR_MTS_OF_NAT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MAX_FLOOR_MTS_OF_NAT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MAX_FLOOR_MTS_OF_NAT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nat, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_max_floor_mts_of_nat_internal(nat)));
            memoization_state.caching_state_put(caching_state, nat, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject some_max_floor_mtsP_alt(SubLObject mts) {
        return list_utilities.sublisp_boolean(genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject some_max_floor_mtsP(final SubLObject mts) {
        return list_utilities.sublisp_boolean(genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject inference_applicable_sdctP_internal_alt(SubLObject col) {
        return sdc.applicable_sdctP(col, UNPROVIDED);
    }

    public static SubLObject inference_applicable_sdctP_internal(final SubLObject col) {
        return sdc.applicable_sdctP(col, UNPROVIDED);
    }

    public static final SubLObject inference_applicable_sdctP_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_applicable_sdctP_internal(col);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym38$INFERENCE_APPLICABLE_SDCT_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym38$INFERENCE_APPLICABLE_SDCT_, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym38$INFERENCE_APPLICABLE_SDCT_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, col, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_applicable_sdctP_internal(col)));
                        memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_applicable_sdctP(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
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
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_applicable_sdctP_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject expression_has_inference_excepted_assertionP_iteration_helper(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $block_inference_excepted_assertion_in_inference_index_lookupP$.getDynamicValue(thread)) && (NIL != expression_has_inference_excepted_assertionP(expression)));
    }

    public static SubLObject expression_has_inference_excepted_assertionP(final SubLObject expression) {
        final SubLObject assertions = cycl_utilities.expression_gather(expression, ASSERTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list_utilities.sublisp_boolean(find_if($sym43$INFERENCE_EXCEPTED_ASSERTION__SHALLOW, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject inference_excepted_assertionP(final SubLObject assertion, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $disable_inference_excepted_assertion_supportP$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        if ((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt))) {
            return NIL;
        }
        return memoized_inference_excepted_assertionP(assertion, mt_relevance_macros.current_mt_relevance_mt(), justifyP);
    }

    public static SubLObject memoized_inference_excepted_assertionP_internal(final SubLObject assertion, final SubLObject mt, final SubLObject justifyP) {
        return assertion_utilities.excepted_assertion_in_mtP(assertion, mt_relevance_macros.conservative_constraint_mt(mt), justifyP, UNPROVIDED);
    }

    public static SubLObject memoized_inference_excepted_assertionP(final SubLObject assertion, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_inference_excepted_assertionP_internal(assertion, mt, justifyP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, THREE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(assertion, mt, justifyP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (assertion.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && justifyP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_inference_excepted_assertionP_internal(assertion, mt, justifyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(assertion, mt, justifyP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_excepted_assertionP_shallow(final SubLObject assertion, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $disable_inference_excepted_assertion_supportP$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        if ((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt))) {
            return NIL;
        }
        return memoized_inference_excepted_assertionP_shallow(assertion, mt_relevance_macros.current_mt_relevance_mt(), justifyP);
    }

    public static SubLObject memoized_inference_excepted_assertionP_shallow_internal(final SubLObject assertion, final SubLObject mt, final SubLObject justifyP) {
        return assertion_utilities.excepted_assertion_in_mtP_shallow(assertion, mt_relevance_macros.conservative_constraint_mt(mt), justifyP);
    }

    public static SubLObject memoized_inference_excepted_assertionP_shallow(final SubLObject assertion, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_inference_excepted_assertionP_shallow_internal(assertion, mt, justifyP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW, THREE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(assertion, mt, justifyP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (assertion.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && justifyP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_inference_excepted_assertionP_shallow_internal(assertion, mt, justifyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(assertion, mt, justifyP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject do_inference_gafs_potentially_matching_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject asent = NIL;
        SubLObject sense = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        sense = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$65 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list47);
            current_$65 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == member(current_$65, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$65 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list47);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_INFERENCE_GAF_LOOKUP_INDEX, list(assertion_var, asent, sense, $DONE, done), append(body, NIL));
    }

    /**
     * Iterates over the best index for attempting to look up ASENT with sense SENSE using
     * any sort of gaf indexing, binding ASSERTION-VAR to each candidate assertion.
     * Stops if DONE becomes non-nil.
     *
     * @param SENSE;
    sense-p
     * 		
     */
    @LispMethod(comment = "Iterates over the best index for attempting to look up ASENT with sense SENSE using\r\nany sort of gaf indexing, binding ASSERTION-VAR to each candidate assertion.\r\nStops if DONE becomes non-nil.\r\n\r\n@param SENSE;\nsense-p\nIterates over the best index for attempting to look up ASENT with sense SENSE using\nany sort of gaf indexing, binding ASSERTION-VAR to each candidate assertion.\nStops if DONE becomes non-nil.")
    public static final SubLObject do_inference_gaf_lookup_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject assertion_var = NIL;
                    SubLObject asent = NIL;
                    SubLObject sense = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    assertion_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    asent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    sense = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_37 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt39);
                            current_37 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt39);
                            if (NIL == member(current_37, $list_alt40, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_37 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt39);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_GAF_LOOKUP_INDEX, list(assertion_var, list(INFERENCE_GAF_LOOKUP_INDEX, asent, sense), $TRUTH, list(SENSE_TRUTH, sense), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterates over the best index for attempting to look up ASENT with sense SENSE using
     * any sort of gaf indexing, binding ASSERTION-VAR to each candidate assertion.
     * Stops if DONE becomes non-nil.
     *
     * @param SENSE;
    		sense-p
     * 		
     */
    @LispMethod(comment = "Iterates over the best index for attempting to look up ASENT with sense SENSE using\r\nany sort of gaf indexing, binding ASSERTION-VAR to each candidate assertion.\r\nStops if DONE becomes non-nil.\r\n\r\n@param SENSE;\n\t\tsense-p\nIterates over the best index for attempting to look up ASENT with sense SENSE using\nany sort of gaf indexing, binding ASSERTION-VAR to each candidate assertion.\nStops if DONE becomes non-nil.")
    public static SubLObject do_inference_gaf_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject asent = NIL;
        SubLObject sense = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        sense = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$66 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list47);
            current_$66 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == member(current_$66, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$66 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list47);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_GAF_LOOKUP_INDEX, list(assertion_var, list(INFERENCE_GAF_LOOKUP_INDEX, asent, sense), $TRUTH, list(SENSE_TRUTH, sense), $DONE, done), append(body, NIL));
    }

    public static final SubLObject inference_gaf_lookup_index_internal_alt(SubLObject asent, SubLObject sense) {
        return kb_indexing.best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
    }

    public static SubLObject inference_gaf_lookup_index_internal(final SubLObject asent, final SubLObject sense) {
        return kb_indexing.best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
    }

    public static final SubLObject inference_gaf_lookup_index_alt(SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_gaf_lookup_index_internal(asent, sense);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_GAF_LOOKUP_INDEX, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_GAF_LOOKUP_INDEX, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_GAF_LOOKUP_INDEX, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(asent, sense);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (asent.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_gaf_lookup_index_internal(asent, sense)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(asent, sense));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_gaf_lookup_index(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_gaf_lookup_index_internal(asent, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_GAF_LOOKUP_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_GAF_LOOKUP_INDEX, TWO_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_GAF_LOOKUP_INDEX, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(asent, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_gaf_lookup_index_internal(asent, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, sense));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_num_gaf_lookup_index_internal_alt(SubLObject asent, SubLObject sense) {
        return kb_indexing.num_best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
    }

    public static SubLObject inference_num_gaf_lookup_index_internal(final SubLObject asent, final SubLObject sense) {
        return kb_indexing.num_best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
    }

    public static final SubLObject inference_num_gaf_lookup_index_alt(SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_num_gaf_lookup_index_internal(asent, sense);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_NUM_GAF_LOOKUP_INDEX, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_NUM_GAF_LOOKUP_INDEX, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_NUM_GAF_LOOKUP_INDEX, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(asent, sense);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (asent.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_num_gaf_lookup_index_internal(asent, sense)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(asent, sense));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_num_gaf_lookup_index(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_num_gaf_lookup_index_internal(asent, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_NUM_GAF_LOOKUP_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_NUM_GAF_LOOKUP_INDEX, TWO_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_NUM_GAF_LOOKUP_INDEX, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(asent, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_num_gaf_lookup_index_internal(asent, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, sense));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_relevant_num_gaf_lookup_index_internal_alt(SubLObject mt_info, SubLObject asent, SubLObject sense) {
        return kb_indexing.num_best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
    }

    public static SubLObject inference_relevant_num_gaf_lookup_index_internal(final SubLObject mt_info, final SubLObject asent, final SubLObject sense) {
        return kb_indexing.num_best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
    }

    public static final SubLObject inference_relevant_num_gaf_lookup_index_alt(SubLObject mt_info, SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_relevant_num_gaf_lookup_index_internal(mt_info, asent, sense);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(mt_info, asent, sense);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (mt_info.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (asent.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_relevant_num_gaf_lookup_index_internal(mt_info, asent, sense)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(mt_info, asent, sense));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_relevant_num_gaf_lookup_index(final SubLObject mt_info, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_relevant_num_gaf_lookup_index_internal(mt_info, asent, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, THREE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(mt_info, asent, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (mt_info.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (asent.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_relevant_num_gaf_lookup_index_internal(mt_info, asent, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(mt_info, asent, sense));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_argnums_from_gafs_mentioning_term_internal(final SubLObject v_term) {
        return kb_indexing.argnums_from_gafs_mentioning_term_with_relevant_mt(v_term);
    }

    public static SubLObject inference_argnums_from_gafs_mentioning_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_argnums_from_gafs_mentioning_term_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM, ONE_INTEGER, $int$2048, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_argnums_from_gafs_mentioning_term_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject inference_preds_from_gafs_mentioning_term_at_index_internal(final SubLObject v_term, SubLObject argnum) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        return kb_indexing.preds_from_gafs_mentioning_term_at_argnum_with_relevant_mt(v_term, argnum);
    }

    public static SubLObject inference_preds_from_gafs_mentioning_term_at_index(final SubLObject v_term, SubLObject argnum) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_preds_from_gafs_mentioning_term_at_index_internal(v_term, argnum);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX, TWO_INTEGER, $int$2048, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, argnum);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && argnum.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_preds_from_gafs_mentioning_term_at_index_internal(v_term, argnum)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, argnum));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_key_gaf_arg_index_internal_alt(SubLObject v_term, SubLObject argnum, SubLObject pred) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        return kb_indexing.relevant_key_gaf_arg_index(v_term, argnum, pred);
    }

    public static SubLObject inference_key_gaf_arg_index_internal(final SubLObject v_term, SubLObject argnum, SubLObject pred) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        return kb_indexing.relevant_key_gaf_arg_index(v_term, argnum, pred);
    }

    public static final SubLObject inference_key_gaf_arg_index_alt(SubLObject v_term, SubLObject argnum, SubLObject pred) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_key_gaf_arg_index_internal(v_term, argnum, pred);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_KEY_GAF_ARG_INDEX, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_KEY_GAF_ARG_INDEX, THREE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_KEY_GAF_ARG_INDEX, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, argnum, pred);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (argnum.eql(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && pred.eql(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_key_gaf_arg_index_internal(v_term, argnum, pred)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, argnum, pred));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_key_gaf_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject pred) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_key_gaf_arg_index_internal(v_term, argnum, pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_KEY_GAF_ARG_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_KEY_GAF_ARG_INDEX, THREE_INTEGER, $int$2048, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_KEY_GAF_ARG_INDEX, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, argnum, pred);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && pred.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_key_gaf_arg_index_internal(v_term, argnum, pred)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, argnum, pred));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject compute_problem_backchain_requiredP(final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        SubLObject cdolist_list_var;
        final SubLObject query = cdolist_list_var = inference_datastructures_problem.problem_query(problem);
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

    public static final SubLObject inference_some_backchain_required_asent_in_clauseP_alt(SubLObject contextualized_dnf_clause) {
        {
            SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.inference.inference_trampolines.inference_backchain_required_contextualized_asentP(contextualized_asent)) {
                    return T;
                }
            }
        }
        {
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.inference.inference_trampolines.inference_backchain_required_contextualized_asentP(contextualized_asent)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject inference_some_backchain_required_asent_in_clauseP(final SubLObject contextualized_dnf_clause) {
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

    public static final SubLObject inference_backchain_required_contextualized_asentP_alt(SubLObject contextualized_asent) {
        {
            SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
            SubLObject mt = inference_datastructures_problem_query.contextualized_asent_mt(contextualized_asent);
            return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_backchain_required_asentP(asent, mt);
        }
    }

    public static SubLObject inference_backchain_required_contextualized_asentP(final SubLObject contextualized_asent) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
        final SubLObject mt = inference_datastructures_problem_query.contextualized_asent_mt(contextualized_asent);
        return inference_backchain_required_asentP(asent, mt);
    }

    public static final SubLObject inference_backchain_required_asentP_alt(SubLObject asent, SubLObject mt) {
        mt = com.cyc.cycjava.cycl.inference.inference_trampolines.backchain_control_mt(mt);
        {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != forts.fort_p(pred)) {
                if (NIL != com.cyc.cycjava.cycl.inference.inference_trampolines.inference_predicate_backchain_requiredP(pred, mt)) {
                    return T;
                }
                {
                    SubLObject pred_38 = cycl_utilities.atomic_sentence_predicate(asent);
                    if (NIL != list_utilities.member_eqP(pred_38, $list_alt51)) {
                        {
                            SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                            if (NIL != forts.fort_p(col)) {
                                if (NIL != com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_backchain_requiredP(col, mt)) {
                                    return T;
                                } else {
                                    if ((pred_38 == $$isa) && (NIL != com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_isa_backchain_requiredP(col, mt))) {
                                        return T;
                                    } else {
                                        if ((pred_38 == $$genls) && (NIL != com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_genls_backchain_requiredP(col, mt))) {
                                            return T;
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

    public static SubLObject inference_backchain_required_asentP(final SubLObject asent, SubLObject mt) {
        mt = backchain_control_mt(mt);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(pred)) {
            if (NIL != inference_predicate_backchain_requiredP(pred, mt)) {
                return T;
            }
            final SubLObject pred_$67 = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != subl_promotions.memberP(pred_$67, $list62, symbol_function(EQL), UNPROVIDED)) {
                final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(col)) {
                    if (NIL != inference_collection_backchain_requiredP(col, mt)) {
                        return T;
                    }
                    if (pred_$67.eql($$isa) && (NIL != inference_collection_isa_backchain_requiredP(col, mt))) {
                        return T;
                    }
                    if (pred_$67.eql($$genls) && (NIL != inference_collection_genls_backchain_requiredP(col, mt))) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject inference_predicate_backchain_requiredP_internal_alt(SubLObject predicate, SubLObject mt) {
        return kb_accessors.backchain_requiredP(predicate, com.cyc.cycjava.cycl.inference.inference_trampolines.backchain_control_mt(mt));
    }

    public static SubLObject inference_predicate_backchain_requiredP_internal(final SubLObject predicate, final SubLObject mt) {
        return kb_accessors.backchain_requiredP(predicate, backchain_control_mt(mt));
    }

    public static final SubLObject inference_predicate_backchain_requiredP_alt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_predicate_backchain_requiredP_internal(predicate, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_predicate_backchain_requiredP_internal(predicate, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_predicate_backchain_requiredP(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_predicate_backchain_requiredP_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_predicate_backchain_requiredP_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_backchain_forbiddenP_internal_alt(SubLObject predicate, SubLObject mt) {
        return kb_accessors.backchain_forbiddenP(predicate, com.cyc.cycjava.cycl.inference.inference_trampolines.backchain_control_mt(mt));
    }

    public static SubLObject inference_backchain_forbiddenP_internal(final SubLObject predicate, final SubLObject mt) {
        return kb_accessors.backchain_forbiddenP(predicate, backchain_control_mt(mt));
    }

    public static final SubLObject inference_backchain_forbiddenP_alt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_backchain_forbiddenP_internal(predicate, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym55$INFERENCE_BACKCHAIN_FORBIDDEN_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym55$INFERENCE_BACKCHAIN_FORBIDDEN_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym55$INFERENCE_BACKCHAIN_FORBIDDEN_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_backchain_forbiddenP_internal(predicate, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_backchain_forbiddenP(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_backchain_forbiddenP_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_backchain_forbiddenP_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_collection_isa_backchain_encouragedP_internal_alt(SubLObject collection, SubLObject mt) {
        return kb_accessors.collection_isa_backchain_encouragedP(collection, com.cyc.cycjava.cycl.inference.inference_trampolines.backchain_control_mt(mt));
    }

    public static SubLObject inference_collection_isa_backchain_encouragedP_internal(final SubLObject collection, final SubLObject mt) {
        return kb_accessors.collection_isa_backchain_encouragedP(collection, backchain_control_mt(mt));
    }

    public static final SubLObject inference_collection_isa_backchain_encouragedP_alt(SubLObject collection, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_isa_backchain_encouragedP_internal(collection, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym56$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym56$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym56$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (collection == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_isa_backchain_encouragedP_internal(collection, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(collection, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_collection_isa_backchain_encouragedP(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_isa_backchain_encouragedP_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_collection_isa_backchain_encouragedP_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_collection_genls_backchain_encouragedP_internal_alt(SubLObject collection, SubLObject mt) {
        return kb_accessors.collection_genls_backchain_encouragedP(collection, com.cyc.cycjava.cycl.inference.inference_trampolines.backchain_control_mt(mt));
    }

    public static SubLObject inference_collection_genls_backchain_encouragedP_internal(final SubLObject collection, final SubLObject mt) {
        return kb_accessors.collection_genls_backchain_encouragedP(collection, backchain_control_mt(mt));
    }

    public static final SubLObject inference_collection_genls_backchain_encouragedP_alt(SubLObject collection, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_genls_backchain_encouragedP_internal(collection, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym57$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym57$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym57$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (collection == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_genls_backchain_encouragedP_internal(collection, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(collection, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_collection_genls_backchain_encouragedP(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_genls_backchain_encouragedP_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_collection_genls_backchain_encouragedP_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_collection_backchain_encouragedP_internal_alt(SubLObject collection, SubLObject mt) {
        return kb_accessors.collection_backchain_encouragedP(collection, com.cyc.cycjava.cycl.inference.inference_trampolines.backchain_control_mt(mt));
    }

    public static SubLObject inference_collection_backchain_encouragedP_internal(final SubLObject collection, final SubLObject mt) {
        return kb_accessors.collection_backchain_encouragedP(collection, backchain_control_mt(mt));
    }

    public static final SubLObject inference_collection_backchain_encouragedP_alt(SubLObject collection, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_backchain_encouragedP_internal(collection, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym58$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym58$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym58$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (collection == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_backchain_encouragedP_internal(collection, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(collection, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_collection_backchain_encouragedP(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_backchain_encouragedP_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_collection_backchain_encouragedP_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLSymbol $kw2$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject inference_collection_backchain_requiredP_internal_alt(SubLObject col, SubLObject mt) {
        return kb_accessors.collection_backchain_requiredP(col, com.cyc.cycjava.cycl.inference.inference_trampolines.backchain_control_mt(mt));
    }

    public static SubLObject inference_collection_backchain_requiredP_internal(final SubLObject col, final SubLObject mt) {
        return kb_accessors.collection_backchain_requiredP(col, backchain_control_mt(mt));
    }

    public static final SubLObject inference_collection_backchain_requiredP_alt(SubLObject col, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_backchain_requiredP_internal(col, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (col == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_backchain_requiredP_internal(col, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_collection_backchain_requiredP(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_backchain_requiredP_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_collection_backchain_requiredP_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt));
        return memoization_state.caching_results(results3);
    }

    static private final SubLSymbol $sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_ = makeSymbol("MEMOIZED-INFERENCE-INDETERMINATE-TERM?");

    static private final SubLString $str_alt18$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt23$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt25$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt26$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLSymbol $sym30$SOME_MAX_FLOOR_MTS__CACHED = makeSymbol("SOME-MAX-FLOOR-MTS?-CACHED");

    static private final SubLSymbol $sym31$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_ = makeSymbol("*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*");

    static private final SubLSymbol $sym33$CLEAR_SOME_MAX_FLOOR_MTS__CACHED = makeSymbol("CLEAR-SOME-MAX-FLOOR-MTS?-CACHED");

    public static final SubLObject inference_collection_isa_backchain_requiredP_internal_alt(SubLObject col, SubLObject mt) {
        return kb_accessors.collection_isa_backchain_requiredP(col, com.cyc.cycjava.cycl.inference.inference_trampolines.backchain_control_mt(mt));
    }

    public static SubLObject inference_collection_isa_backchain_requiredP_internal(final SubLObject col, final SubLObject mt) {
        return kb_accessors.collection_isa_backchain_requiredP(col, backchain_control_mt(mt));
    }

    public static final SubLObject inference_collection_isa_backchain_requiredP_alt(SubLObject col, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_isa_backchain_requiredP_internal(col, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (col == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_isa_backchain_requiredP_internal(col, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_collection_isa_backchain_requiredP(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_isa_backchain_requiredP_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_collection_isa_backchain_requiredP_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt));
        return memoization_state.caching_results(results3);
    }

    static private final SubLSymbol $sym38$INFERENCE_APPLICABLE_SDCT_ = makeSymbol("INFERENCE-APPLICABLE-SDCT?");

    static private final SubLList $list_alt39 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt40 = list($DONE);

    static private final SubLList $list_alt51 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLSymbol $sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?");

    static private final SubLSymbol $sym55$INFERENCE_BACKCHAIN_FORBIDDEN_ = makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN?");

    static private final SubLSymbol $sym56$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?");

    static private final SubLSymbol $sym57$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?");

    static private final SubLSymbol $sym58$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?");

    public static final SubLObject inference_collection_genls_backchain_requiredP_internal_alt(SubLObject col, SubLObject mt) {
        return kb_accessors.collection_genls_backchain_requiredP(col, com.cyc.cycjava.cycl.inference.inference_trampolines.backchain_control_mt(mt));
    }

    public static SubLObject inference_collection_genls_backchain_requiredP_internal(final SubLObject col, final SubLObject mt) {
        return kb_accessors.collection_genls_backchain_requiredP(col, backchain_control_mt(mt));
    }

    static private final SubLSymbol $sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?");

    static private final SubLSymbol $sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?");

    public static final SubLObject inference_collection_genls_backchain_requiredP_alt(SubLObject col, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_genls_backchain_requiredP_internal(col, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (col == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_collection_genls_backchain_requiredP_internal(col, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_collection_genls_backchain_requiredP(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_collection_genls_backchain_requiredP_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_collection_genls_backchain_requiredP_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt));
        return memoization_state.caching_results(results3);
    }

    static private final SubLSymbol $sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?");

    private static final SubLSymbol REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol("REMOVAL-ASK-QUERY-PROPERTY-P");

    static private final SubLList $list_alt79 = list(makeSymbol("MTS"), makeSymbol("SUPPORT-COMBINATION"));

    static private final SubLList $list_alt83 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

    /**
     * Assuming that we are doing inference MT, return the mt in which to look for
     * assertions that control the behaviour of backchaining.  If all mts are relevant,
     * we need to be conservative and only look for universally true backchain control assertions.
     */
    @LispMethod(comment = "Assuming that we are doing inference MT, return the mt in which to look for\r\nassertions that control the behaviour of backchaining.  If all mts are relevant,\r\nwe need to be conservative and only look for universally true backchain control assertions.\nAssuming that we are doing inference MT, return the mt in which to look for\nassertions that control the behaviour of backchaining.  If all mts are relevant,\nwe need to be conservative and only look for universally true backchain control assertions.")
    public static final SubLObject backchain_control_mt_alt(SubLObject mt) {
        return mt_relevance_macros.conservative_constraint_mt(mt);
    }

    /**
     * Assuming that we are doing inference MT, return the mt in which to look for
     * assertions that control the behaviour of backchaining.  If all mts are relevant,
     * we need to be conservative and only look for universally true backchain control assertions.
     */
    @LispMethod(comment = "Assuming that we are doing inference MT, return the mt in which to look for\r\nassertions that control the behaviour of backchaining.  If all mts are relevant,\r\nwe need to be conservative and only look for universally true backchain control assertions.\nAssuming that we are doing inference MT, return the mt in which to look for\nassertions that control the behaviour of backchaining.  If all mts are relevant,\nwe need to be conservative and only look for universally true backchain control assertions.")
    public static SubLObject backchain_control_mt(final SubLObject mt) {
        return mt_relevance_macros.conservative_constraint_mt(mt);
    }

    public static final SubLObject inference_relevant_mtP_alt(SubLObject assertion_mt, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(assertion_mt)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion_mt, $$highlyRelevantMt, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject inference_relevant_mtP(final SubLObject assertion_mt, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(assertion_mt)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion_mt, $$highlyRelevantMt, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static final SubLObject inference_relevant_assertionP_alt(SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion, $$highlyRelevantAssertion, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject inference_relevant_assertionP(final SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion, $$highlyRelevantAssertion, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static final SubLObject inference_relevant_predicate_assertionP_alt(SubLObject predicate, SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(predicate)) && (NIL != assertion_handles.assertion_p(assertion))) && (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$highlyRelevantPredAssertion, predicate, assertion, inference_mt, ONE_INTEGER, TWO_INTEGER, $TRUE)));
    }

    public static SubLObject inference_relevant_predicate_assertionP(final SubLObject predicate, final SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(predicate)) && (NIL != assertion_handles.assertion_p(assertion))) && (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$highlyRelevantPredAssertion, predicate, assertion, inference_mt, ONE_INTEGER, TWO_INTEGER, $TRUE)));
    }

    public static final SubLObject inference_relevant_termP_alt(SubLObject v_term, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(v_term)) && (NIL != kb_accessors.highly_relevant_term_somewhereP(v_term))) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, $$highlyRelevantTerm, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject inference_relevant_termP(final SubLObject v_term, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(v_term)) && (NIL != kb_accessors.highly_relevant_term_somewhereP(v_term))) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, $$highlyRelevantTerm, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static final SubLObject inference_irrelevant_mtP_alt(SubLObject assertion_mt, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(assertion_mt)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion_mt, $$irrelevantMt, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject inference_irrelevant_mtP(final SubLObject assertion_mt, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(assertion_mt)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion_mt, $$irrelevantMt, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static final SubLObject inference_irrelevant_assertionP_alt(SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion, $$irrelevantAssertion, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject inference_irrelevant_assertionP(final SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion, $$irrelevantAssertion, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static final SubLObject inference_irrelevant_predicate_assertionP_alt(SubLObject predicate, SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(predicate)) && (NIL != assertion_handles.assertion_p(assertion))) && (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$irrelevantPredAssertion, predicate, assertion, inference_mt, ONE_INTEGER, TWO_INTEGER, $TRUE)));
    }

    public static SubLObject inference_irrelevant_predicate_assertionP(final SubLObject predicate, final SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(predicate)) && (NIL != assertion_handles.assertion_p(assertion))) && (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$irrelevantPredAssertion, predicate, assertion, inference_mt, ONE_INTEGER, TWO_INTEGER, $TRUE)));
    }

    public static final SubLObject inference_irrelevant_termP_alt(SubLObject v_term, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(v_term)) && (NIL != kb_accessors.irrelevant_term_somewhereP(v_term))) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, $$irrelevantTerm, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject inference_irrelevant_termP(final SubLObject v_term, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(v_term)) && (NIL != kb_accessors.irrelevant_term_somewhereP(v_term))) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, $$irrelevantTerm, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static final SubLObject inference_rule_has_utilityP_alt(SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion, $$assertionUtility, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject inference_rule_has_utilityP(final SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion, $$assertionUtility, inference_mt, ONE_INTEGER, $TRUE)));
    }

    public static final SubLObject inference_rule_utility_alt(SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        if (NIL != assertion_handles.assertion_p(assertion)) {
            return kb_mapping_utilities.fpred_value_in_relevant_mts(assertion, $$assertionUtility, inference_mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        }
        return NIL;
    }

    public static SubLObject inference_rule_utility(final SubLObject assertion, SubLObject inference_mt) {
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        if (NIL != assertion_handles.assertion_p(assertion)) {
            return kb_mapping_utilities.fpred_value_in_relevant_mts(assertion, $$assertionUtility, inference_mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        }
        return NIL;
    }

    public static final SubLObject inference_known_sentence_removal_query_internal_alt(SubLObject asent, SubLObject mt, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject halt_reason = T;
                SubLObject results = NIL;
                if (NIL != cycl_grammar.cycl_atomic_sentence_p(asent)) {
                    if (NIL != ist_of_atomic_sentence_p(asent)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject asent_39 = czer_utilities.unwrap_if_ist(asent, mt);
                            SubLObject mt_40 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            asent = asent_39;
                            mt = mt_40;
                        }
                    }
                    {
                        SubLObject pcase_var = truth;
                        if (pcase_var.eql($TRUE)) {
                            {
                                SubLObject query_properties = com.cyc.cycjava.cycl.inference.inference_trampolines.determine_sentence_recursive_query_properties(asent, mt);
                                query_properties = putf(query_properties, $ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec());
                                if (NIL != list_utilities.plist_of_type_p(query_properties, REMOVAL_ASK_QUERY_PROPERTY_P)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject results_41 = backward.removal_ask_bindings(asent, mt, truth, query_properties);
                                        SubLObject halt_reason_42 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        results = results_41;
                                        halt_reason = halt_reason_42;
                                    }
                                } else {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject results_43 = ask_utilities.inference_recursive_query_unique_bindings(asent, mt, query_properties);
                                        SubLObject halt_reason_44 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        results = results_43;
                                        halt_reason = halt_reason_44;
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($FALSE)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject results_45 = backward.removal_ask_bindings(asent, mt, truth, list($ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec()));
                                    SubLObject halt_reason_46 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    results = results_45;
                                    halt_reason = halt_reason_46;
                                }
                            }
                        }
                    }
                }
                return values(results, halt_reason);
            }
        }
    }

    public static SubLObject inference_known_sentence_removal_query_internal(SubLObject asent, SubLObject mt, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject halt_reason = T;
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        SubLObject results = NIL;
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(asent)) {
            if (NIL != ist_of_atomic_sentence_p(asent)) {
                thread.resetMultipleValues();
                final SubLObject asent_$68 = czer_utilities.unwrap_if_ist(asent, mt, UNPROVIDED);
                final SubLObject mt_$69 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                asent = asent_$68;
                mt = mt_$69;
            }
            final SubLObject pcase_var = truth;
            if (pcase_var.eql($TRUE)) {
                SubLObject query_properties = determine_sentence_recursive_query_properties(asent, mt);
                final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
                try {
                    czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
                    query_properties = putf(query_properties, $ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec());
                    thread.resetMultipleValues();
                    final SubLObject results_$70 = ask_utilities.recursive_query(asent, mt, query_properties);
                    final SubLObject halt_reason_$71 = thread.secondMultipleValue();
                    final SubLObject inference_$72 = thread.thirdMultipleValue();
                    final SubLObject metrics_$73 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$70;
                    halt_reason = halt_reason_$71;
                    inference = inference_$72;
                    metrics = metrics_$73;
                } finally {
                    czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
                }
            } else
                if (pcase_var.eql($FALSE)) {
                    thread.resetMultipleValues();
                    final SubLObject results_$71 = ask_utilities.recursive_query(make_negation(asent), mt, list($ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec()));
                    final SubLObject halt_reason_$72 = thread.secondMultipleValue();
                    final SubLObject inference_$73 = thread.thirdMultipleValue();
                    final SubLObject metrics_$74 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$71;
                    halt_reason = halt_reason_$72;
                    inference = inference_$73;
                    metrics = metrics_$74;
                }

        }
        return values(results, halt_reason, inference, metrics);
    }

    public static final SubLObject inference_known_sentence_removal_query_alt(SubLObject asent, SubLObject mt, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_known_sentence_removal_query_internal(asent, mt, truth);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(asent, mt, truth);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (asent.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && truth.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_known_sentence_removal_query_internal(asent, mt, truth)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(asent, mt, truth));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_known_sentence_removal_query(final SubLObject asent, final SubLObject mt, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_known_sentence_removal_query_internal(asent, mt, truth);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(asent, mt, truth);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && truth.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_known_sentence_removal_query_internal(asent, mt, truth)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, mt, truth));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_known_sentence_recursive_query_alt(SubLObject formula, SubLObject mt, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject results = com.cyc.cycjava.cycl.inference.inference_trampolines.inference_true_sentence_recursive_query(formula, mt, number);
                SubLObject halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(results, inference_datastructures_enumerated_types.exhausted_query_halt_reason_p(halt_reason));
            }
        }
    }

    public static SubLObject inference_known_sentence_recursive_query(final SubLObject formula, final SubLObject mt, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = inference_true_sentence_recursive_query(formula, mt, number, UNPROVIDED);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(results, inference_datastructures_enumerated_types.exhausted_query_halt_reason_p(halt_reason));
    }

    /**
     * Return T iff SENTENCE is already being asked inside an ask of SENTENCE
     */
    @LispMethod(comment = "Return T iff SENTENCE is already being asked inside an ask of SENTENCE")
    public static final SubLObject inference_true_sentence_recursion_cycleP_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_universal_p(sentence)) {
                return T;
            } else {
                return memberP(sentence, $inference_true_sentence_recursion_stack$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
            }
        }
    }

    /**
     * Return T iff SENTENCE is already being asked inside an ask of SENTENCE
     */
    @LispMethod(comment = "Return T iff SENTENCE is already being asked inside an ask of SENTENCE")
    public static SubLObject inference_true_sentence_recursion_cycleP(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_universal_p(sentence)) {
            return T;
        }
        return subl_promotions.memberP(sentence, $inference_true_sentence_recursion_stack$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject inference_true_sentence_recursive_query_internal(SubLObject formula, SubLObject mt, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                SubLObject halt_reason = NIL;
                if (NIL == com.cyc.cycjava.cycl.inference.inference_trampolines.inference_true_sentence_recursion_cycleP(formula)) {
                    {
                        SubLObject _prev_bind_0 = $inference_true_sentence_recursion_stack$.currentBinding(thread);
                        try {
                            $inference_true_sentence_recursion_stack$.bind(cons(formula, $inference_true_sentence_recursion_stack$.getDynamicValue(thread)), thread);
                            {
                                SubLObject query_properties = com.cyc.cycjava.cycl.inference.inference_trampolines.determine_sentence_recursive_query_properties(formula, mt);
                                query_properties = putf(query_properties, $MAX_NUMBER, number);
                                query_properties = putf(query_properties, $ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec());
                                thread.resetMultipleValues();
                                {
                                    SubLObject results_47 = ask_utilities.inference_recursive_query_unique_bindings(formula, mt, query_properties);
                                    SubLObject halt_reason_48 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    results = results_47;
                                    halt_reason = halt_reason_48;
                                }
                            }
                        } finally {
                            $inference_true_sentence_recursion_stack$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(results, halt_reason);
            }
        }
    }

    public static SubLObject inference_true_sentence_recursive_query_internal(final SubLObject formula, final SubLObject mt, SubLObject number, SubLObject dummy_query_properties) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (dummy_query_properties == UNPROVIDED) {
            dummy_query_properties = $recursive_query_override_properties$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        if (NIL == inference_true_sentence_recursion_cycleP(formula)) {
            final SubLObject _prev_bind_0 = $inference_true_sentence_recursion_stack$.currentBinding(thread);
            try {
                $inference_true_sentence_recursion_stack$.bind(cons(formula, $inference_true_sentence_recursion_stack$.getDynamicValue(thread)), thread);
                SubLObject query_properties = determine_sentence_recursive_query_properties(formula, mt);
                final SubLObject _prev_bind_0_$78 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
                try {
                    czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
                    query_properties = putf(query_properties, $MAX_NUMBER, number);
                    query_properties = putf(query_properties, $ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec());
                    thread.resetMultipleValues();
                    final SubLObject results_$79 = ask_utilities.inference_recursive_query_unique_bindings(formula, mt, query_properties);
                    final SubLObject halt_reason_$80 = thread.secondMultipleValue();
                    final SubLObject inference_$81 = thread.thirdMultipleValue();
                    final SubLObject metrics_$82 = thread.fourthMultipleValue();
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
        return values(results, halt_reason, inference, metrics);
    }

    public static final SubLObject inference_true_sentence_recursive_query(SubLObject formula, SubLObject mt, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_true_sentence_recursive_query_internal(formula, mt, number);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(formula, mt, number);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && number.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_true_sentence_recursive_query_internal(formula, mt, number)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, mt, number));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_true_sentence_recursive_query(final SubLObject formula, final SubLObject mt, SubLObject number, SubLObject dummy_query_properties) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (dummy_query_properties == UNPROVIDED) {
            dummy_query_properties = $recursive_query_override_properties$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_true_sentence_recursive_query_internal(formula, mt, number, dummy_query_properties);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(formula, mt, number, dummy_query_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (number.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && dummy_query_properties.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_true_sentence_recursive_query_internal(formula, mt, number, dummy_query_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt, number, dummy_query_properties));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inference_mts_where_gaf_sentence_true_internal_alt(SubLObject gaf_sentence) {
        {
            SubLObject all_mt_support_combinations = com.cyc.cycjava.cycl.inference.inference_trampolines.inference_mts_where_gaf_sentence_true_justified(gaf_sentence);
            SubLObject all_mts = NIL;
            SubLObject cdolist_list_var = all_mt_support_combinations;
            SubLObject mt_support_combination = NIL;
            for (mt_support_combination = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_support_combination = cdolist_list_var.first()) {
                {
                    SubLObject datum = mt_support_combination;
                    SubLObject current = datum;
                    SubLObject mts = NIL;
                    SubLObject support_combination = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    mts = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    support_combination = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject cdolist_list_var_49 = mts;
                            SubLObject mt = NIL;
                            for (mt = cdolist_list_var_49.first(); NIL != cdolist_list_var_49; cdolist_list_var_49 = cdolist_list_var_49.rest() , mt = cdolist_list_var_49.first()) {
                                {
                                    SubLObject item_var = mt;
                                    if (NIL == member(item_var, all_mts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        all_mts = cons(item_var, all_mts);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt79);
                    }
                }
            }
            return nreverse(all_mts);
        }
    }

    public static SubLObject inference_mts_where_gaf_sentence_true_internal(final SubLObject gaf_sentence) {
        final SubLObject all_mt_support_combinations = inference_mts_where_gaf_sentence_true_justified(gaf_sentence);
        SubLObject all_mts = NIL;
        SubLObject cdolist_list_var = all_mt_support_combinations;
        SubLObject mt_support_combination = NIL;
        mt_support_combination = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = mt_support_combination;
            SubLObject mts = NIL;
            SubLObject support_combination = NIL;
            destructuring_bind_must_consp(current, datum, $list89);
            mts = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list89);
            support_combination = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$83 = mts;
                SubLObject mt = NIL;
                mt = cdolist_list_var_$83.first();
                while (NIL != cdolist_list_var_$83) {
                    final SubLObject item_var = mt;
                    if (NIL == member(item_var, all_mts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        all_mts = cons(item_var, all_mts);
                    }
                    cdolist_list_var_$83 = cdolist_list_var_$83.rest();
                    mt = cdolist_list_var_$83.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list89);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_support_combination = cdolist_list_var.first();
        } 
        return nreverse(all_mts);
    }

    public static final SubLObject inference_mts_where_gaf_sentence_true_alt(SubLObject gaf_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_mts_where_gaf_sentence_true_internal(gaf_sentence);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, gaf_sentence, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_mts_where_gaf_sentence_true_internal(gaf_sentence)));
                        memoization_state.caching_state_put(caching_state, gaf_sentence, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_mts_where_gaf_sentence_true(final SubLObject gaf_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_mts_where_gaf_sentence_true_internal(gaf_sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, gaf_sentence, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_mts_where_gaf_sentence_true_internal(gaf_sentence)));
            memoization_state.caching_state_put(caching_state, gaf_sentence, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject inference_mts_where_gaf_sentence_true_justified_memoized_internal_alt(SubLObject gaf_sentence) {
        return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_mts_where_gaf_sentence_true_justified(gaf_sentence);
    }

    public static SubLObject inference_mts_where_gaf_sentence_true_justified_memoized_internal(final SubLObject gaf_sentence) {
        return inference_mts_where_gaf_sentence_true_justified(gaf_sentence);
    }

    public static final SubLObject inference_mts_where_gaf_sentence_true_justified_memoized_alt(SubLObject gaf_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_mts_where_gaf_sentence_true_justified_memoized_internal(gaf_sentence);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, gaf_sentence, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_mts_where_gaf_sentence_true_justified_memoized_internal(gaf_sentence)));
                        memoization_state.caching_state_put(caching_state, gaf_sentence, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_mts_where_gaf_sentence_true_justified_memoized(final SubLObject gaf_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_mts_where_gaf_sentence_true_justified_memoized_internal(gaf_sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, gaf_sentence, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_mts_where_gaf_sentence_true_justified_memoized_internal(gaf_sentence)));
            memoization_state.caching_state_put(caching_state, gaf_sentence, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject inference_mts_where_gaf_sentence_true_justified_alt(SubLObject gaf_sentence) {
        {
            SubLObject all_mt_support_combinations = NIL;
            SubLObject raw_justifications = backward.removal_ask_justifications(gaf_sentence, $$InferencePSC, $TRUE, UNPROVIDED);
            SubLObject cdolist_list_var = raw_justifications;
            SubLObject raw_justification = NIL;
            for (raw_justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , raw_justification = cdolist_list_var.first()) {
                {
                    SubLObject mt_support_combinations = forward.compute_all_mt_and_support_combinations(raw_justification);
                    SubLObject cdolist_list_var_50 = mt_support_combinations;
                    SubLObject mt_support_combination = NIL;
                    for (mt_support_combination = cdolist_list_var_50.first(); NIL != cdolist_list_var_50; cdolist_list_var_50 = cdolist_list_var_50.rest() , mt_support_combination = cdolist_list_var_50.first()) {
                        all_mt_support_combinations = cons(mt_support_combination, all_mt_support_combinations);
                    }
                }
            }
            return nreverse(all_mt_support_combinations);
        }
    }

    public static SubLObject inference_mts_where_gaf_sentence_true_justified(final SubLObject gaf_sentence) {
        SubLObject all_mt_support_combinations = NIL;
        SubLObject cdolist_list_var;
        final SubLObject raw_justifications = cdolist_list_var = backward.removal_ask_justifications(gaf_sentence, $$InferencePSC, $TRUE, UNPROVIDED);
        SubLObject raw_justification = NIL;
        raw_justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$84;
            final SubLObject mt_support_combinations = cdolist_list_var_$84 = forward.compute_all_mt_and_support_combinations(raw_justification, UNPROVIDED);
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
        return nreverse(all_mt_support_combinations);
    }

    /**
     * When performing recursive queries, a quick analysis can reveal addional inference paramenters that when added give a much better chance of success.  Currently supported is:
     * adding :max-transformation-depth when a completely-enumerable-via-backchain asent is found.
     */
    @LispMethod(comment = "When performing recursive queries, a quick analysis can reveal addional inference paramenters that when added give a much better chance of success.  Currently supported is:\r\nadding :max-transformation-depth when a completely-enumerable-via-backchain asent is found.\nWhen performing recursive queries, a quick analysis can reveal addional inference paramenters that when added give a much better chance of success.  Currently supported is:\nadding :max-transformation-depth when a completely-enumerable-via-backchain asent is found.")
    public static final SubLObject determine_sentence_recursive_query_properties_alt(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_trampolines.determine_sentence_recursive_query_properties_recursive(sentence, mt);
    }

    /**
     * When performing recursive queries, a quick analysis can reveal addional inference paramenters that when added give a much better chance of success.  Currently supported is:
     * adding :max-transformation-depth when a completely-enumerable-via-backchain asent is found.
     */
    @LispMethod(comment = "When performing recursive queries, a quick analysis can reveal addional inference paramenters that when added give a much better chance of success.  Currently supported is:\r\nadding :max-transformation-depth when a completely-enumerable-via-backchain asent is found.\nWhen performing recursive queries, a quick analysis can reveal addional inference paramenters that when added give a much better chance of success.  Currently supported is:\nadding :max-transformation-depth when a completely-enumerable-via-backchain asent is found.")
    public static SubLObject determine_sentence_recursive_query_properties(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $recursive_query_override_properties$.getDynamicValue(thread)) {
            return $recursive_query_override_properties$.getDynamicValue(thread);
        }
        return determine_sentence_recursive_query_properties_recursive(sentence, mt);
    }

    public static final SubLObject determine_sentence_recursive_query_properties_recursive_alt(SubLObject sentence, SubLObject mt) {
        if (NIL != inference_completeness_utilities.inference_completely_enumerable_via_backchain_asentP(sentence, mt)) {
            if (NIL != inference_datastructures_inference.inference_p(inference_macros.current_controlling_inference())) {
                return list($MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference_macros.current_controlling_inference(), $MAX_TRANSFORMATION_DEPTH, UNPROVIDED));
            } else {
                return $list_alt83;
            }
        }
        if ((NIL != el_conjunction_p(sentence)) || (NIL != el_disjunction_p(sentence))) {
            {
                SubLObject xjuncts = cycl_utilities.formula_args(sentence, UNPROVIDED);
                SubLObject xjunction_properties = NIL;
                SubLObject cdolist_list_var = xjuncts;
                SubLObject xjunct = NIL;
                for (xjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , xjunct = cdolist_list_var.first()) {
                    {
                        SubLObject xjunct_properties = com.cyc.cycjava.cycl.inference.inference_trampolines.determine_sentence_recursive_query_properties_recursive(xjunct, mt);
                        xjunction_properties = inference_parameters.inference_merge_query_properties(xjunction_properties, xjunct_properties);
                    }
                }
                return xjunction_properties;
            }
        }
        if (NIL != el_existential_p(sentence)) {
            return com.cyc.cycjava.cycl.inference.inference_trampolines.determine_sentence_recursive_query_properties_recursive(cycl_utilities.formula_arg2(sentence, UNPROVIDED), mt);
        }
        if (NIL != el_formula_with_operator_p(cycl_utilities.formula_arg2(sentence, UNPROVIDED), $$TheSetOf)) {
            return com.cyc.cycjava.cycl.inference.inference_trampolines.determine_sentence_recursive_query_properties_recursive(cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(sentence, UNPROVIDED), UNPROVIDED), mt);
        }
        return NIL;
    }

    public static SubLObject determine_sentence_recursive_query_properties_recursive(final SubLObject sentence, final SubLObject mt) {
        if (NIL != inference_completeness_utilities.inference_completely_enumerable_via_backchain_asentP(sentence, mt)) {
            if (NIL != inference_datastructures_inference.inference_p(inference_macros.current_controlling_inference())) {
                return list($MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference_macros.current_controlling_inference(), $MAX_TRANSFORMATION_DEPTH, UNPROVIDED), $MIN_RULE_UTILITY, inference_utilities.inference_property_lookup(inference_macros.current_controlling_inference(), $MIN_RULE_UTILITY, UNPROVIDED));
            }
            return list($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MIN_RULE_UTILITY, $int$_100);
        } else {
            if ((NIL != el_conjunction_p(sentence)) || (NIL != el_disjunction_p(sentence))) {
                final SubLObject xjuncts = cycl_utilities.formula_args(sentence, UNPROVIDED);
                SubLObject xjunction_properties = NIL;
                SubLObject cdolist_list_var = xjuncts;
                SubLObject xjunct = NIL;
                xjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject xjunct_properties = determine_sentence_recursive_query_properties_recursive(xjunct, mt);
                    if (NIL != xjunct_properties) {
                        xjunction_properties = inference_parameters.inference_merge_query_properties(xjunction_properties, xjunct_properties);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    xjunct = cdolist_list_var.first();
                } 
                return xjunction_properties;
            }
            if (NIL != el_existential_p(sentence)) {
                return determine_sentence_recursive_query_properties_recursive(cycl_utilities.formula_arg2(sentence, UNPROVIDED), mt);
            }
            if (NIL != el_formula_with_operator_p(cycl_utilities.formula_arg2(sentence, UNPROVIDED), $$TheSetOf)) {
                return determine_sentence_recursive_query_properties_recursive(cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(sentence, UNPROVIDED), UNPROVIDED), mt);
            }
            return NIL;
        }
    }

    public static final SubLObject inference_rule_type_constraints_internal_alt(SubLObject rule) {
        return rule_type_constraints(rule);
    }

    public static SubLObject inference_rule_type_constraints_internal(final SubLObject rule) {
        return assertion_utilities.rule_type_constraints(rule);
    }

    public static final SubLObject inference_rule_type_constraints_alt(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_trampolines.inference_rule_type_constraints_internal(rule);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_RULE_TYPE_CONSTRAINTS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_RULE_TYPE_CONSTRAINTS, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_RULE_TYPE_CONSTRAINTS, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_trampolines.inference_rule_type_constraints_internal(rule)));
                        memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_rule_type_constraints(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_rule_type_constraints_internal(rule);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_RULE_TYPE_CONSTRAINTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_RULE_TYPE_CONSTRAINTS, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_RULE_TYPE_CONSTRAINTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_rule_type_constraints_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject declare_inference_trampolines_file_alt() {
        declareFunction("inference_atomic_term_p", "INFERENCE-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("inference_collectionP", "INFERENCE-COLLECTION?", 1, 1, false);
        declareFunction("inference_predicate_p", "INFERENCE-PREDICATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$inference_predicate_p$UnaryFunction();
        declareFunction("inference_commutative_relationP", "INFERENCE-COMMUTATIVE-RELATION?", 1, 0, false);
        declareFunction("inference_symmetric_predicateP", "INFERENCE-SYMMETRIC-PREDICATE?", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$inference_symmetric_predicateP$UnaryFunction();
        declareFunction("inference_commutative_predicate_p", "INFERENCE-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$inference_commutative_predicate_p$UnaryFunction();
        declareFunction("inference_partially_commutative_predicate_p_internal", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P-INTERNAL", 1, 0, false);
        declareFunction("inference_partially_commutative_predicate_p", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$inference_partially_commutative_predicate_p$UnaryFunction();
        declareFunction("inference_at_least_partially_commutative_predicate_p", "INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction("inference_asymmetric_predicateP", "INFERENCE-ASYMMETRIC-PREDICATE?", 1, 0, false);
        declareFunction("inference_transitive_predicateP", "INFERENCE-TRANSITIVE-PREDICATE?", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$inference_transitive_predicateP$UnaryFunction();
        declareFunction("inference_evaluatable_predicateP", "INFERENCE-EVALUATABLE-PREDICATE?", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$inference_evaluatable_predicateP$UnaryFunction();
        declareFunction("inference_reflexive_predicateP", "INFERENCE-REFLEXIVE-PREDICATE?", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$inference_reflexive_predicateP$UnaryFunction();
        declareFunction("inference_irreflexive_predicateP", "INFERENCE-IRREFLEXIVE-PREDICATE?", 1, 0, false);
        declareFunction("inference_indeterminate_termP", "INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
        declareFunction("clear_indeterminate_term_p", "CLEAR-INDETERMINATE-TERM-P", 0, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$clear_indeterminate_term_p$ZeroArityFunction();
        declareFunction("remove_indeterminate_term_p", "REMOVE-INDETERMINATE-TERM-P", 1, 0, false);
        declareFunction("indeterminate_term_p_internal", "INDETERMINATE-TERM-P-INTERNAL", 1, 0, false);
        declareFunction("indeterminate_term_p", "INDETERMINATE-TERM-P", 1, 0, false);
        declareFunction("memoized_inference_indeterminate_termP_internal", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?-INTERNAL", 1, 0, false);
        declareFunction("memoized_inference_indeterminate_termP", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
        declareFunction("inference_some_genl_pred_or_inverseP", "INFERENCE-SOME-GENL-PRED-OR-INVERSE?", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$inference_some_genl_pred_or_inverseP$UnaryFunction();
        declareFunction("inference_some_spec_pred_or_inverseP", "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_trampolines.$inference_some_spec_pred_or_inverseP$UnaryFunction();
        declareFunction("inference_some_negation_pred_or_inverseP", "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?", 1, 0, false);
        declareFunction("inference_all_genl_predicates_internal", "INFERENCE-ALL-GENL-PREDICATES-INTERNAL", 1, 0, false);
        declareFunction("inference_all_genl_predicates", "INFERENCE-ALL-GENL-PREDICATES", 1, 0, false);
        declareFunction("inference_all_spec_predicates", "INFERENCE-ALL-SPEC-PREDICATES", 1, 0, false);
        declareFunction("inference_all_spec_predicates_int_internal", "INFERENCE-ALL-SPEC-PREDICATES-INT-INTERNAL", 1, 0, false);
        declareFunction("inference_all_spec_predicates_int", "INFERENCE-ALL-SPEC-PREDICATES-INT", 1, 0, false);
        declareFunction("inference_all_genl_inverses_internal", "INFERENCE-ALL-GENL-INVERSES-INTERNAL", 1, 0, false);
        declareFunction("inference_all_genl_inverses", "INFERENCE-ALL-GENL-INVERSES", 1, 0, false);
        declareFunction("inference_all_spec_inverses", "INFERENCE-ALL-SPEC-INVERSES", 1, 0, false);
        declareFunction("inference_all_spec_inverses_int_internal", "INFERENCE-ALL-SPEC-INVERSES-INT-INTERNAL", 1, 0, false);
        declareFunction("inference_all_spec_inverses_int", "INFERENCE-ALL-SPEC-INVERSES-INT", 1, 0, false);
        declareFunction("inference_all_proper_genl_predicates_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
        declareFunction("inference_all_proper_genl_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction("inference_all_proper_spec_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction("inference_all_proper_spec_predicates_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false);
        declareFunction("inference_all_proper_spec_predicates_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT", 2, 0, false);
        declareFunction("inference_all_negation_predicates_with_axiom_index_internal", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
        declareFunction("inference_all_negation_predicates_with_axiom_index", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction("inference_some_max_floor_mts", "INFERENCE-SOME-MAX-FLOOR-MTS", 1, 0, false);
        declareFunction("clear_some_max_floor_mtsP_cached", "CLEAR-SOME-MAX-FLOOR-MTS?-CACHED", 0, 0, false);
        declareFunction("remove_some_max_floor_mtsP_cached", "REMOVE-SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
        declareFunction("some_max_floor_mtsP_cached_internal", "SOME-MAX-FLOOR-MTS?-CACHED-INTERNAL", 1, 0, false);
        declareFunction("some_max_floor_mtsP_cached", "SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
        declareFunction("inference_max_floor_mts_with_cycles_pruned", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED", 1, 1, false);
        declareFunction("clear_inference_max_floor_mts_with_cycles_pruned_cached", "CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 0, 0, false);
        declareFunction("remove_inference_max_floor_mts_with_cycles_pruned_cached", "REMOVE-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
        declareFunction("inference_max_floor_mts_with_cycles_pruned_cached_internal", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-INTERNAL", 1, 0, false);
        declareFunction("inference_max_floor_mts_with_cycles_pruned_cached", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
        declareFunction("inference_max_floor_mts_of_nat_internal", "INFERENCE-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 1, 0, false);
        declareFunction("inference_max_floor_mts_of_nat", "INFERENCE-MAX-FLOOR-MTS-OF-NAT", 1, 0, false);
        declareFunction("some_max_floor_mtsP", "SOME-MAX-FLOOR-MTS?", 1, 0, false);
        declareFunction("inference_applicable_sdctP_internal", "INFERENCE-APPLICABLE-SDCT?-INTERNAL", 1, 0, false);
        declareFunction("inference_applicable_sdctP", "INFERENCE-APPLICABLE-SDCT?", 1, 0, false);
        declareMacro("do_inference_gaf_lookup_index", "DO-INFERENCE-GAF-LOOKUP-INDEX");
        declareFunction("inference_gaf_lookup_index_internal", "INFERENCE-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
        declareFunction("inference_gaf_lookup_index", "INFERENCE-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction("inference_num_gaf_lookup_index_internal", "INFERENCE-NUM-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
        declareFunction("inference_num_gaf_lookup_index", "INFERENCE-NUM-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction("inference_relevant_num_gaf_lookup_index_internal", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX-INTERNAL", 3, 0, false);
        declareFunction("inference_relevant_num_gaf_lookup_index", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX", 3, 0, false);
        declareFunction("inference_key_gaf_arg_index_internal", "INFERENCE-KEY-GAF-ARG-INDEX-INTERNAL", 1, 2, false);
        declareFunction("inference_key_gaf_arg_index", "INFERENCE-KEY-GAF-ARG-INDEX", 1, 2, false);
        declareFunction("problem_backchain_requiredP", "PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false);
        declareFunction("inference_some_backchain_required_asent_in_clauseP", "INFERENCE-SOME-BACKCHAIN-REQUIRED-ASENT-IN-CLAUSE?", 1, 0, false);
        declareFunction("inference_backchain_required_contextualized_asentP", "INFERENCE-BACKCHAIN-REQUIRED-CONTEXTUALIZED-ASENT?", 1, 0, false);
        declareFunction("inference_backchain_required_asentP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT?", 2, 0, false);
        declareFunction("inference_predicate_backchain_requiredP_internal", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction("inference_predicate_backchain_requiredP", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction("inference_backchain_forbiddenP_internal", "INFERENCE-BACKCHAIN-FORBIDDEN?-INTERNAL", 2, 0, false);
        declareFunction("inference_backchain_forbiddenP", "INFERENCE-BACKCHAIN-FORBIDDEN?", 2, 0, false);
        declareFunction("inference_collection_isa_backchain_encouragedP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_isa_backchain_encouragedP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction("inference_collection_genls_backchain_encouragedP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_genls_backchain_encouragedP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction("inference_collection_backchain_encouragedP_internal", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_backchain_encouragedP", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction("inference_collection_backchain_requiredP_internal", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_backchain_requiredP", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction("inference_collection_isa_backchain_requiredP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_isa_backchain_requiredP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction("inference_collection_genls_backchain_requiredP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_genls_backchain_requiredP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction("backchain_control_mt", "BACKCHAIN-CONTROL-MT", 1, 0, false);
        declareFunction("inference_relevant_mtP", "INFERENCE-RELEVANT-MT?", 1, 1, false);
        declareFunction("inference_relevant_assertionP", "INFERENCE-RELEVANT-ASSERTION?", 1, 1, false);
        declareFunction("inference_relevant_predicate_assertionP", "INFERENCE-RELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
        declareFunction("inference_relevant_termP", "INFERENCE-RELEVANT-TERM?", 1, 1, false);
        declareFunction("inference_irrelevant_mtP", "INFERENCE-IRRELEVANT-MT?", 1, 1, false);
        declareFunction("inference_irrelevant_assertionP", "INFERENCE-IRRELEVANT-ASSERTION?", 1, 1, false);
        declareFunction("inference_irrelevant_predicate_assertionP", "INFERENCE-IRRELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
        declareFunction("inference_irrelevant_termP", "INFERENCE-IRRELEVANT-TERM?", 1, 1, false);
        declareFunction("inference_rule_has_utilityP", "INFERENCE-RULE-HAS-UTILITY?", 1, 1, false);
        declareFunction("inference_rule_utility", "INFERENCE-RULE-UTILITY", 1, 1, false);
        declareFunction("inference_known_sentence_removal_query_internal", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY-INTERNAL", 2, 1, false);
        declareFunction("inference_known_sentence_removal_query", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY", 2, 1, false);
        declareFunction("inference_known_sentence_recursive_query", "INFERENCE-KNOWN-SENTENCE-RECURSIVE-QUERY", 2, 1, false);
        declareFunction("inference_true_sentence_recursion_cycleP", "INFERENCE-TRUE-SENTENCE-RECURSION-CYCLE?", 1, 0, false);
        declareFunction("inference_true_sentence_recursive_query_internal", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY-INTERNAL", 2, 1, false);
        declareFunction("inference_true_sentence_recursive_query", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY", 2, 1, false);
        declareFunction("inference_mts_where_gaf_sentence_true_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-INTERNAL", 1, 0, false);
        declareFunction("inference_mts_where_gaf_sentence_true", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE", 1, 0, false);
        declareFunction("inference_mts_where_gaf_sentence_true_justified_memoized_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("inference_mts_where_gaf_sentence_true_justified_memoized", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED", 1, 0, false);
        declareFunction("inference_mts_where_gaf_sentence_true_justified", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED", 1, 0, false);
        declareFunction("determine_sentence_recursive_query_properties", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES", 2, 0, false);
        declareFunction("determine_sentence_recursive_query_properties_recursive", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES-RECURSIVE", 2, 0, false);
        declareFunction("inference_rule_type_constraints_internal", "INFERENCE-RULE-TYPE-CONSTRAINTS-INTERNAL", 1, 0, false);
        declareFunction("inference_rule_type_constraints", "INFERENCE-RULE-TYPE-CONSTRAINTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_trampolines_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("inference_atomic_term_p", "INFERENCE-ATOMIC-TERM-P", 1, 0, false);
            declareFunction("inference_collectionP", "INFERENCE-COLLECTION?", 1, 1, false);
            declareFunction("inference_predicate_p", "INFERENCE-PREDICATE-P", 1, 0, false);
            new inference_trampolines.$inference_predicate_p$UnaryFunction();
            declareFunction("inference_commutative_relationP", "INFERENCE-COMMUTATIVE-RELATION?", 1, 0, false);
            declareFunction("inference_symmetric_predicateP", "INFERENCE-SYMMETRIC-PREDICATE?", 1, 0, false);
            new inference_trampolines.$inference_symmetric_predicateP$UnaryFunction();
            declareFunction("inference_commutative_predicate_p", "INFERENCE-COMMUTATIVE-PREDICATE-P", 1, 0, false);
            new inference_trampolines.$inference_commutative_predicate_p$UnaryFunction();
            declareFunction("inference_partially_commutative_predicate_p_internal", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P-INTERNAL", 1, 0, false);
            declareFunction("inference_partially_commutative_predicate_p", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
            new inference_trampolines.$inference_partially_commutative_predicate_p$UnaryFunction();
            declareFunction("inference_at_least_partially_commutative_predicate_p", "INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
            declareFunction("inference_asymmetric_predicateP", "INFERENCE-ASYMMETRIC-PREDICATE?", 1, 0, false);
            declareFunction("inference_transitive_predicateP", "INFERENCE-TRANSITIVE-PREDICATE?", 1, 0, false);
            new inference_trampolines.$inference_transitive_predicateP$UnaryFunction();
            declareFunction("inference_evaluatable_predicateP", "INFERENCE-EVALUATABLE-PREDICATE?", 1, 0, false);
            new inference_trampolines.$inference_evaluatable_predicateP$UnaryFunction();
            declareFunction("inference_reflexive_predicateP", "INFERENCE-REFLEXIVE-PREDICATE?", 1, 0, false);
            new inference_trampolines.$inference_reflexive_predicateP$UnaryFunction();
            declareFunction("inference_irreflexive_predicateP", "INFERENCE-IRREFLEXIVE-PREDICATE?", 1, 0, false);
            declareFunction("inference_indeterminate_termP", "INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
            declareFunction("clear_indeterminate_term_p", "CLEAR-INDETERMINATE-TERM-P", 0, 0, false);
            new inference_trampolines.$clear_indeterminate_term_p$ZeroArityFunction();
            declareFunction("remove_indeterminate_term_p", "REMOVE-INDETERMINATE-TERM-P", 1, 0, false);
            declareFunction("indeterminate_term_p_internal", "INDETERMINATE-TERM-P-INTERNAL", 1, 0, false);
            declareFunction("indeterminate_term_p", "INDETERMINATE-TERM-P", 1, 0, false);
            declareFunction("memoized_inference_indeterminate_termP_internal", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?-INTERNAL", 1, 0, false);
            declareFunction("memoized_inference_indeterminate_termP", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
            declareFunction("inference_some_genl_pred_or_inverseP", "INFERENCE-SOME-GENL-PRED-OR-INVERSE?", 1, 0, false);
            new inference_trampolines.$inference_some_genl_pred_or_inverseP$UnaryFunction();
            declareFunction("inference_some_spec_pred_or_inverseP", "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?", 1, 0, false);
            new inference_trampolines.$inference_some_spec_pred_or_inverseP$UnaryFunction();
            declareFunction("inference_some_negation_pred_or_inverseP", "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?", 1, 0, false);
            declareFunction("inference_all_genl_predicates_internal", "INFERENCE-ALL-GENL-PREDICATES-INTERNAL", 1, 0, false);
            declareFunction("inference_all_genl_predicates", "INFERENCE-ALL-GENL-PREDICATES", 1, 0, false);
            declareFunction("inference_all_spec_predicates", "INFERENCE-ALL-SPEC-PREDICATES", 1, 0, false);
            declareFunction("inference_all_spec_predicates_int_internal", "INFERENCE-ALL-SPEC-PREDICATES-INT-INTERNAL", 1, 0, false);
            declareFunction("inference_all_spec_predicates_int", "INFERENCE-ALL-SPEC-PREDICATES-INT", 1, 0, false);
            declareFunction("inference_all_genl_inverses_internal", "INFERENCE-ALL-GENL-INVERSES-INTERNAL", 1, 0, false);
            declareFunction("inference_all_genl_inverses", "INFERENCE-ALL-GENL-INVERSES", 1, 0, false);
            declareFunction("inference_all_spec_inverses", "INFERENCE-ALL-SPEC-INVERSES", 1, 0, false);
            declareFunction("inference_all_spec_inverses_int_internal", "INFERENCE-ALL-SPEC-INVERSES-INT-INTERNAL", 1, 0, false);
            declareFunction("inference_all_spec_inverses_int", "INFERENCE-ALL-SPEC-INVERSES-INT", 1, 0, false);
            declareFunction("inference_all_proper_genl_predicates_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
            declareFunction("inference_all_proper_genl_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
            declareFunction("inference_all_proper_spec_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
            declareFunction("inference_all_proper_spec_predicates_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false);
            declareFunction("inference_all_proper_spec_predicates_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT", 2, 0, false);
            declareFunction("inference_all_proper_genl_inverses_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
            declareFunction("inference_all_proper_genl_inverses_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX", 2, 0, false);
            declareFunction("inference_all_proper_spec_inverses_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX", 2, 0, false);
            declareFunction("inference_all_proper_spec_inverses_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false);
            declareFunction("inference_all_proper_spec_inverses_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT", 2, 0, false);
            declareFunction("inference_all_negation_predicates_with_axiom_index_internal", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
            declareFunction("inference_all_negation_predicates_with_axiom_index", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
            declareFunction("inference_some_max_floor_mts", "INFERENCE-SOME-MAX-FLOOR-MTS", 1, 0, false);
            declareFunction("clear_some_max_floor_mtsP_cached", "CLEAR-SOME-MAX-FLOOR-MTS?-CACHED", 0, 0, false);
            declareFunction("remove_some_max_floor_mtsP_cached", "REMOVE-SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
            declareFunction("some_max_floor_mtsP_cached_internal", "SOME-MAX-FLOOR-MTS?-CACHED-INTERNAL", 1, 0, false);
            declareFunction("some_max_floor_mtsP_cached", "SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
            declareFunction("inference_max_floor_mts_with_cycles_pruned", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED", 1, 1, false);
            declareFunction("clear_inference_max_floor_mts_with_cycles_pruned_cached", "CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 0, 0, false);
            declareFunction("remove_inference_max_floor_mts_with_cycles_pruned_cached", "REMOVE-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
            declareFunction("inference_max_floor_mts_with_cycles_pruned_cached_internal", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-INTERNAL", 1, 0, false);
            declareFunction("inference_max_floor_mts_with_cycles_pruned_cached", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
            declareFunction("inference_max_floor_mts_of_nat_internal", "INFERENCE-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 1, 0, false);
            declareFunction("inference_max_floor_mts_of_nat", "INFERENCE-MAX-FLOOR-MTS-OF-NAT", 1, 0, false);
            declareFunction("some_max_floor_mtsP", "SOME-MAX-FLOOR-MTS?", 1, 0, false);
            declareFunction("inference_applicable_sdctP_internal", "INFERENCE-APPLICABLE-SDCT?-INTERNAL", 1, 0, false);
            declareFunction("inference_applicable_sdctP", "INFERENCE-APPLICABLE-SDCT?", 1, 0, false);
            declareFunction("expression_has_inference_excepted_assertionP_iteration_helper", "EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?-ITERATION-HELPER", 1, 0, false);
            declareFunction("expression_has_inference_excepted_assertionP", "EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?", 1, 0, false);
            declareFunction("inference_excepted_assertionP", "INFERENCE-EXCEPTED-ASSERTION?", 1, 1, false);
            declareFunction("memoized_inference_excepted_assertionP_internal", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-INTERNAL", 3, 0, false);
            declareFunction("memoized_inference_excepted_assertionP", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?", 3, 0, false);
            declareFunction("inference_excepted_assertionP_shallow", "INFERENCE-EXCEPTED-ASSERTION?-SHALLOW", 1, 1, false);
            declareFunction("memoized_inference_excepted_assertionP_shallow_internal", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW-INTERNAL", 3, 0, false);
            declareFunction("memoized_inference_excepted_assertionP_shallow", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW", 3, 0, false);
            declareMacro("do_inference_gafs_potentially_matching_formula", "DO-INFERENCE-GAFS-POTENTIALLY-MATCHING-FORMULA");
            declareMacro("do_inference_gaf_lookup_index", "DO-INFERENCE-GAF-LOOKUP-INDEX");
            declareFunction("inference_gaf_lookup_index_internal", "INFERENCE-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
            declareFunction("inference_gaf_lookup_index", "INFERENCE-GAF-LOOKUP-INDEX", 2, 0, false);
            declareFunction("inference_num_gaf_lookup_index_internal", "INFERENCE-NUM-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
            declareFunction("inference_num_gaf_lookup_index", "INFERENCE-NUM-GAF-LOOKUP-INDEX", 2, 0, false);
            declareFunction("inference_relevant_num_gaf_lookup_index_internal", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX-INTERNAL", 3, 0, false);
            declareFunction("inference_relevant_num_gaf_lookup_index", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX", 3, 0, false);
            declareFunction("inference_argnums_from_gafs_mentioning_term_internal", "INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM-INTERNAL", 1, 0, false);
            declareFunction("inference_argnums_from_gafs_mentioning_term", "INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM", 1, 0, false);
            declareFunction("inference_preds_from_gafs_mentioning_term_at_index_internal", "INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX-INTERNAL", 1, 1, false);
            declareFunction("inference_preds_from_gafs_mentioning_term_at_index", "INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX", 1, 1, false);
            declareFunction("inference_key_gaf_arg_index_internal", "INFERENCE-KEY-GAF-ARG-INDEX-INTERNAL", 1, 2, false);
            declareFunction("inference_key_gaf_arg_index", "INFERENCE-KEY-GAF-ARG-INDEX", 1, 2, false);
            declareFunction("compute_problem_backchain_requiredP", "COMPUTE-PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false);
            declareFunction("inference_some_backchain_required_asent_in_clauseP", "INFERENCE-SOME-BACKCHAIN-REQUIRED-ASENT-IN-CLAUSE?", 1, 0, false);
            declareFunction("inference_backchain_required_contextualized_asentP", "INFERENCE-BACKCHAIN-REQUIRED-CONTEXTUALIZED-ASENT?", 1, 0, false);
            declareFunction("inference_backchain_required_asentP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT?", 2, 0, false);
            declareFunction("inference_predicate_backchain_requiredP_internal", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
            declareFunction("inference_predicate_backchain_requiredP", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?", 2, 0, false);
            declareFunction("inference_backchain_forbiddenP_internal", "INFERENCE-BACKCHAIN-FORBIDDEN?-INTERNAL", 2, 0, false);
            declareFunction("inference_backchain_forbiddenP", "INFERENCE-BACKCHAIN-FORBIDDEN?", 2, 0, false);
            declareFunction("inference_collection_isa_backchain_encouragedP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
            declareFunction("inference_collection_isa_backchain_encouragedP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?", 2, 0, false);
            declareFunction("inference_collection_genls_backchain_encouragedP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
            declareFunction("inference_collection_genls_backchain_encouragedP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?", 2, 0, false);
            declareFunction("inference_collection_backchain_encouragedP_internal", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
            declareFunction("inference_collection_backchain_encouragedP", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false);
            declareFunction("inference_collection_backchain_requiredP_internal", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
            declareFunction("inference_collection_backchain_requiredP", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?", 2, 0, false);
            declareFunction("inference_collection_isa_backchain_requiredP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
            declareFunction("inference_collection_isa_backchain_requiredP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?", 2, 0, false);
            declareFunction("inference_collection_genls_backchain_requiredP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
            declareFunction("inference_collection_genls_backchain_requiredP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?", 2, 0, false);
            declareFunction("backchain_control_mt", "BACKCHAIN-CONTROL-MT", 1, 0, false);
            declareFunction("inference_relevant_mtP", "INFERENCE-RELEVANT-MT?", 1, 1, false);
            declareFunction("inference_relevant_assertionP", "INFERENCE-RELEVANT-ASSERTION?", 1, 1, false);
            declareFunction("inference_relevant_predicate_assertionP", "INFERENCE-RELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
            declareFunction("inference_relevant_termP", "INFERENCE-RELEVANT-TERM?", 1, 1, false);
            declareFunction("inference_irrelevant_mtP", "INFERENCE-IRRELEVANT-MT?", 1, 1, false);
            declareFunction("inference_irrelevant_assertionP", "INFERENCE-IRRELEVANT-ASSERTION?", 1, 1, false);
            declareFunction("inference_irrelevant_predicate_assertionP", "INFERENCE-IRRELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
            declareFunction("inference_irrelevant_termP", "INFERENCE-IRRELEVANT-TERM?", 1, 1, false);
            declareFunction("inference_rule_has_utilityP", "INFERENCE-RULE-HAS-UTILITY?", 1, 1, false);
            declareFunction("inference_rule_utility", "INFERENCE-RULE-UTILITY", 1, 1, false);
            declareFunction("inference_known_sentence_removal_query_internal", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY-INTERNAL", 2, 1, false);
            declareFunction("inference_known_sentence_removal_query", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY", 2, 1, false);
            declareFunction("inference_known_sentence_recursive_query", "INFERENCE-KNOWN-SENTENCE-RECURSIVE-QUERY", 2, 1, false);
            declareFunction("inference_true_sentence_recursion_cycleP", "INFERENCE-TRUE-SENTENCE-RECURSION-CYCLE?", 1, 0, false);
            declareFunction("inference_true_sentence_recursive_query_internal", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY-INTERNAL", 2, 2, false);
            declareFunction("inference_true_sentence_recursive_query", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY", 2, 2, false);
            declareFunction("inference_mts_where_gaf_sentence_true_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-INTERNAL", 1, 0, false);
            declareFunction("inference_mts_where_gaf_sentence_true", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE", 1, 0, false);
            declareFunction("inference_mts_where_gaf_sentence_true_justified_memoized_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED-INTERNAL", 1, 0, false);
            declareFunction("inference_mts_where_gaf_sentence_true_justified_memoized", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED", 1, 0, false);
            declareFunction("inference_mts_where_gaf_sentence_true_justified", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED", 1, 0, false);
            declareFunction("determine_sentence_recursive_query_properties", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES", 2, 0, false);
            declareFunction("determine_sentence_recursive_query_properties_recursive", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES-RECURSIVE", 2, 0, false);
            declareFunction("inference_rule_type_constraints_internal", "INFERENCE-RULE-TYPE-CONSTRAINTS-INTERNAL", 1, 0, false);
            declareFunction("inference_rule_type_constraints", "INFERENCE-RULE-TYPE-CONSTRAINTS", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("problem_backchain_requiredP", "PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false);
            declareFunction("inference_true_sentence_recursive_query_internal", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY-INTERNAL", 2, 1, false);
            declareFunction("inference_true_sentence_recursive_query", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY", 2, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_trampolines_file_Previous() {
        declareFunction("inference_atomic_term_p", "INFERENCE-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("inference_collectionP", "INFERENCE-COLLECTION?", 1, 1, false);
        declareFunction("inference_predicate_p", "INFERENCE-PREDICATE-P", 1, 0, false);
        new inference_trampolines.$inference_predicate_p$UnaryFunction();
        declareFunction("inference_commutative_relationP", "INFERENCE-COMMUTATIVE-RELATION?", 1, 0, false);
        declareFunction("inference_symmetric_predicateP", "INFERENCE-SYMMETRIC-PREDICATE?", 1, 0, false);
        new inference_trampolines.$inference_symmetric_predicateP$UnaryFunction();
        declareFunction("inference_commutative_predicate_p", "INFERENCE-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        new inference_trampolines.$inference_commutative_predicate_p$UnaryFunction();
        declareFunction("inference_partially_commutative_predicate_p_internal", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P-INTERNAL", 1, 0, false);
        declareFunction("inference_partially_commutative_predicate_p", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        new inference_trampolines.$inference_partially_commutative_predicate_p$UnaryFunction();
        declareFunction("inference_at_least_partially_commutative_predicate_p", "INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction("inference_asymmetric_predicateP", "INFERENCE-ASYMMETRIC-PREDICATE?", 1, 0, false);
        declareFunction("inference_transitive_predicateP", "INFERENCE-TRANSITIVE-PREDICATE?", 1, 0, false);
        new inference_trampolines.$inference_transitive_predicateP$UnaryFunction();
        declareFunction("inference_evaluatable_predicateP", "INFERENCE-EVALUATABLE-PREDICATE?", 1, 0, false);
        new inference_trampolines.$inference_evaluatable_predicateP$UnaryFunction();
        declareFunction("inference_reflexive_predicateP", "INFERENCE-REFLEXIVE-PREDICATE?", 1, 0, false);
        new inference_trampolines.$inference_reflexive_predicateP$UnaryFunction();
        declareFunction("inference_irreflexive_predicateP", "INFERENCE-IRREFLEXIVE-PREDICATE?", 1, 0, false);
        declareFunction("inference_indeterminate_termP", "INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
        declareFunction("clear_indeterminate_term_p", "CLEAR-INDETERMINATE-TERM-P", 0, 0, false);
        new inference_trampolines.$clear_indeterminate_term_p$ZeroArityFunction();
        declareFunction("remove_indeterminate_term_p", "REMOVE-INDETERMINATE-TERM-P", 1, 0, false);
        declareFunction("indeterminate_term_p_internal", "INDETERMINATE-TERM-P-INTERNAL", 1, 0, false);
        declareFunction("indeterminate_term_p", "INDETERMINATE-TERM-P", 1, 0, false);
        declareFunction("memoized_inference_indeterminate_termP_internal", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?-INTERNAL", 1, 0, false);
        declareFunction("memoized_inference_indeterminate_termP", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
        declareFunction("inference_some_genl_pred_or_inverseP", "INFERENCE-SOME-GENL-PRED-OR-INVERSE?", 1, 0, false);
        new inference_trampolines.$inference_some_genl_pred_or_inverseP$UnaryFunction();
        declareFunction("inference_some_spec_pred_or_inverseP", "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?", 1, 0, false);
        new inference_trampolines.$inference_some_spec_pred_or_inverseP$UnaryFunction();
        declareFunction("inference_some_negation_pred_or_inverseP", "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?", 1, 0, false);
        declareFunction("inference_all_genl_predicates_internal", "INFERENCE-ALL-GENL-PREDICATES-INTERNAL", 1, 0, false);
        declareFunction("inference_all_genl_predicates", "INFERENCE-ALL-GENL-PREDICATES", 1, 0, false);
        declareFunction("inference_all_spec_predicates", "INFERENCE-ALL-SPEC-PREDICATES", 1, 0, false);
        declareFunction("inference_all_spec_predicates_int_internal", "INFERENCE-ALL-SPEC-PREDICATES-INT-INTERNAL", 1, 0, false);
        declareFunction("inference_all_spec_predicates_int", "INFERENCE-ALL-SPEC-PREDICATES-INT", 1, 0, false);
        declareFunction("inference_all_genl_inverses_internal", "INFERENCE-ALL-GENL-INVERSES-INTERNAL", 1, 0, false);
        declareFunction("inference_all_genl_inverses", "INFERENCE-ALL-GENL-INVERSES", 1, 0, false);
        declareFunction("inference_all_spec_inverses", "INFERENCE-ALL-SPEC-INVERSES", 1, 0, false);
        declareFunction("inference_all_spec_inverses_int_internal", "INFERENCE-ALL-SPEC-INVERSES-INT-INTERNAL", 1, 0, false);
        declareFunction("inference_all_spec_inverses_int", "INFERENCE-ALL-SPEC-INVERSES-INT", 1, 0, false);
        declareFunction("inference_all_proper_genl_predicates_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
        declareFunction("inference_all_proper_genl_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction("inference_all_proper_spec_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction("inference_all_proper_spec_predicates_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false);
        declareFunction("inference_all_proper_spec_predicates_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT", 2, 0, false);
        declareFunction("inference_all_proper_genl_inverses_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
        declareFunction("inference_all_proper_genl_inverses_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction("inference_all_proper_spec_inverses_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction("inference_all_proper_spec_inverses_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false);
        declareFunction("inference_all_proper_spec_inverses_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT", 2, 0, false);
        declareFunction("inference_all_negation_predicates_with_axiom_index_internal", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
        declareFunction("inference_all_negation_predicates_with_axiom_index", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
        declareFunction("inference_some_max_floor_mts", "INFERENCE-SOME-MAX-FLOOR-MTS", 1, 0, false);
        declareFunction("clear_some_max_floor_mtsP_cached", "CLEAR-SOME-MAX-FLOOR-MTS?-CACHED", 0, 0, false);
        declareFunction("remove_some_max_floor_mtsP_cached", "REMOVE-SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
        declareFunction("some_max_floor_mtsP_cached_internal", "SOME-MAX-FLOOR-MTS?-CACHED-INTERNAL", 1, 0, false);
        declareFunction("some_max_floor_mtsP_cached", "SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
        declareFunction("inference_max_floor_mts_with_cycles_pruned", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED", 1, 1, false);
        declareFunction("clear_inference_max_floor_mts_with_cycles_pruned_cached", "CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 0, 0, false);
        declareFunction("remove_inference_max_floor_mts_with_cycles_pruned_cached", "REMOVE-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
        declareFunction("inference_max_floor_mts_with_cycles_pruned_cached_internal", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-INTERNAL", 1, 0, false);
        declareFunction("inference_max_floor_mts_with_cycles_pruned_cached", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
        declareFunction("inference_max_floor_mts_of_nat_internal", "INFERENCE-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 1, 0, false);
        declareFunction("inference_max_floor_mts_of_nat", "INFERENCE-MAX-FLOOR-MTS-OF-NAT", 1, 0, false);
        declareFunction("some_max_floor_mtsP", "SOME-MAX-FLOOR-MTS?", 1, 0, false);
        declareFunction("inference_applicable_sdctP_internal", "INFERENCE-APPLICABLE-SDCT?-INTERNAL", 1, 0, false);
        declareFunction("inference_applicable_sdctP", "INFERENCE-APPLICABLE-SDCT?", 1, 0, false);
        declareFunction("expression_has_inference_excepted_assertionP_iteration_helper", "EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?-ITERATION-HELPER", 1, 0, false);
        declareFunction("expression_has_inference_excepted_assertionP", "EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?", 1, 0, false);
        declareFunction("inference_excepted_assertionP", "INFERENCE-EXCEPTED-ASSERTION?", 1, 1, false);
        declareFunction("memoized_inference_excepted_assertionP_internal", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-INTERNAL", 3, 0, false);
        declareFunction("memoized_inference_excepted_assertionP", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?", 3, 0, false);
        declareFunction("inference_excepted_assertionP_shallow", "INFERENCE-EXCEPTED-ASSERTION?-SHALLOW", 1, 1, false);
        declareFunction("memoized_inference_excepted_assertionP_shallow_internal", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW-INTERNAL", 3, 0, false);
        declareFunction("memoized_inference_excepted_assertionP_shallow", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW", 3, 0, false);
        declareMacro("do_inference_gafs_potentially_matching_formula", "DO-INFERENCE-GAFS-POTENTIALLY-MATCHING-FORMULA");
        declareMacro("do_inference_gaf_lookup_index", "DO-INFERENCE-GAF-LOOKUP-INDEX");
        declareFunction("inference_gaf_lookup_index_internal", "INFERENCE-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
        declareFunction("inference_gaf_lookup_index", "INFERENCE-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction("inference_num_gaf_lookup_index_internal", "INFERENCE-NUM-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
        declareFunction("inference_num_gaf_lookup_index", "INFERENCE-NUM-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction("inference_relevant_num_gaf_lookup_index_internal", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX-INTERNAL", 3, 0, false);
        declareFunction("inference_relevant_num_gaf_lookup_index", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX", 3, 0, false);
        declareFunction("inference_argnums_from_gafs_mentioning_term_internal", "INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM-INTERNAL", 1, 0, false);
        declareFunction("inference_argnums_from_gafs_mentioning_term", "INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM", 1, 0, false);
        declareFunction("inference_preds_from_gafs_mentioning_term_at_index_internal", "INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX-INTERNAL", 1, 1, false);
        declareFunction("inference_preds_from_gafs_mentioning_term_at_index", "INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX", 1, 1, false);
        declareFunction("inference_key_gaf_arg_index_internal", "INFERENCE-KEY-GAF-ARG-INDEX-INTERNAL", 1, 2, false);
        declareFunction("inference_key_gaf_arg_index", "INFERENCE-KEY-GAF-ARG-INDEX", 1, 2, false);
        declareFunction("compute_problem_backchain_requiredP", "COMPUTE-PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false);
        declareFunction("inference_some_backchain_required_asent_in_clauseP", "INFERENCE-SOME-BACKCHAIN-REQUIRED-ASENT-IN-CLAUSE?", 1, 0, false);
        declareFunction("inference_backchain_required_contextualized_asentP", "INFERENCE-BACKCHAIN-REQUIRED-CONTEXTUALIZED-ASENT?", 1, 0, false);
        declareFunction("inference_backchain_required_asentP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT?", 2, 0, false);
        declareFunction("inference_predicate_backchain_requiredP_internal", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction("inference_predicate_backchain_requiredP", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction("inference_backchain_forbiddenP_internal", "INFERENCE-BACKCHAIN-FORBIDDEN?-INTERNAL", 2, 0, false);
        declareFunction("inference_backchain_forbiddenP", "INFERENCE-BACKCHAIN-FORBIDDEN?", 2, 0, false);
        declareFunction("inference_collection_isa_backchain_encouragedP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_isa_backchain_encouragedP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction("inference_collection_genls_backchain_encouragedP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_genls_backchain_encouragedP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction("inference_collection_backchain_encouragedP_internal", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_backchain_encouragedP", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction("inference_collection_backchain_requiredP_internal", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_backchain_requiredP", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction("inference_collection_isa_backchain_requiredP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_isa_backchain_requiredP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction("inference_collection_genls_backchain_requiredP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
        declareFunction("inference_collection_genls_backchain_requiredP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?", 2, 0, false);
        declareFunction("backchain_control_mt", "BACKCHAIN-CONTROL-MT", 1, 0, false);
        declareFunction("inference_relevant_mtP", "INFERENCE-RELEVANT-MT?", 1, 1, false);
        declareFunction("inference_relevant_assertionP", "INFERENCE-RELEVANT-ASSERTION?", 1, 1, false);
        declareFunction("inference_relevant_predicate_assertionP", "INFERENCE-RELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
        declareFunction("inference_relevant_termP", "INFERENCE-RELEVANT-TERM?", 1, 1, false);
        declareFunction("inference_irrelevant_mtP", "INFERENCE-IRRELEVANT-MT?", 1, 1, false);
        declareFunction("inference_irrelevant_assertionP", "INFERENCE-IRRELEVANT-ASSERTION?", 1, 1, false);
        declareFunction("inference_irrelevant_predicate_assertionP", "INFERENCE-IRRELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
        declareFunction("inference_irrelevant_termP", "INFERENCE-IRRELEVANT-TERM?", 1, 1, false);
        declareFunction("inference_rule_has_utilityP", "INFERENCE-RULE-HAS-UTILITY?", 1, 1, false);
        declareFunction("inference_rule_utility", "INFERENCE-RULE-UTILITY", 1, 1, false);
        declareFunction("inference_known_sentence_removal_query_internal", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY-INTERNAL", 2, 1, false);
        declareFunction("inference_known_sentence_removal_query", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY", 2, 1, false);
        declareFunction("inference_known_sentence_recursive_query", "INFERENCE-KNOWN-SENTENCE-RECURSIVE-QUERY", 2, 1, false);
        declareFunction("inference_true_sentence_recursion_cycleP", "INFERENCE-TRUE-SENTENCE-RECURSION-CYCLE?", 1, 0, false);
        declareFunction("inference_true_sentence_recursive_query_internal", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY-INTERNAL", 2, 2, false);
        declareFunction("inference_true_sentence_recursive_query", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY", 2, 2, false);
        declareFunction("inference_mts_where_gaf_sentence_true_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-INTERNAL", 1, 0, false);
        declareFunction("inference_mts_where_gaf_sentence_true", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE", 1, 0, false);
        declareFunction("inference_mts_where_gaf_sentence_true_justified_memoized_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("inference_mts_where_gaf_sentence_true_justified_memoized", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED", 1, 0, false);
        declareFunction("inference_mts_where_gaf_sentence_true_justified", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED", 1, 0, false);
        declareFunction("determine_sentence_recursive_query_properties", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES", 2, 0, false);
        declareFunction("determine_sentence_recursive_query_properties_recursive", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES-RECURSIVE", 2, 0, false);
        declareFunction("inference_rule_type_constraints_internal", "INFERENCE-RULE-TYPE-CONSTRAINTS-INTERNAL", 1, 0, false);
        declareFunction("inference_rule_type_constraints", "INFERENCE-RULE-TYPE-CONSTRAINTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_trampolines_file() {
        deflexical("*INDETERMINATE-TERM-P-CACHING-STATE*", NIL);
        deflexical("*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*", NIL);
        deflexical("*INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-CACHING-STATE*", NIL);
        defparameter("*BLOCK-INFERENCE-EXCEPTED-ASSERTION-IN-INFERENCE-INDEX-LOOKUP?*", T);
        defparameter("*DISABLE-INFERENCE-EXCEPTED-ASSERTION-SUPPORT?*", NIL);
        defparameter("*RECURSIVE-QUERY-OVERRIDE-PROPERTIES*", NIL);
        defparameter("*INFERENCE-TRUE-SENTENCE-RECURSION-STACK*", NIL);
        return NIL;
    }

    public static final SubLObject setup_inference_trampolines_file_alt() {
        memoization_state.note_memoized_function(INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P);
        memoization_state.note_globally_cached_function(INDETERMINATE_TERM_P);
        memoization_state.note_memoized_function($sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_);
        memoization_state.note_memoized_function(INFERENCE_ALL_GENL_PREDICATES);
        memoization_state.note_memoized_function(INFERENCE_ALL_SPEC_PREDICATES_INT);
        memoization_state.note_memoized_function(INFERENCE_ALL_GENL_INVERSES);
        memoization_state.note_memoized_function(INFERENCE_ALL_SPEC_INVERSES_INT);
        memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX);
        memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT);
        memoization_state.note_memoized_function(INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX);
        memoization_state.note_globally_cached_function($sym30$SOME_MAX_FLOOR_MTS__CACHED);
        memoization_state.note_globally_cached_function(INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED);
        memoization_state.note_memoized_function(INFERENCE_MAX_FLOOR_MTS_OF_NAT);
        memoization_state.note_memoized_function($sym38$INFERENCE_APPLICABLE_SDCT_);
        memoization_state.note_memoized_function(INFERENCE_GAF_LOOKUP_INDEX);
        memoization_state.note_memoized_function(INFERENCE_NUM_GAF_LOOKUP_INDEX);
        memoization_state.note_memoized_function(INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX);
        memoization_state.note_memoized_function(INFERENCE_KEY_GAF_ARG_INDEX);
        memoization_state.note_memoized_function($sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym55$INFERENCE_BACKCHAIN_FORBIDDEN_);
        memoization_state.note_memoized_function($sym56$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_memoized_function($sym57$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_memoized_function($sym58$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_memoized_function($sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function(INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY);
        memoization_state.note_memoized_function(INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY);
        memoization_state.note_memoized_function(INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE);
        memoization_state.note_memoized_function(INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED);
        memoization_state.note_memoized_function(INFERENCE_RULE_TYPE_CONSTRAINTS);
        return NIL;
    }

    public static SubLObject setup_inference_trampolines_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P);
            memoization_state.note_globally_cached_function(INDETERMINATE_TERM_P);
            memoization_state.note_memoized_function($sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_);
            memoization_state.note_memoized_function(INFERENCE_ALL_GENL_PREDICATES);
            memoization_state.note_memoized_function(INFERENCE_ALL_SPEC_PREDICATES_INT);
            memoization_state.note_memoized_function(INFERENCE_ALL_GENL_INVERSES);
            memoization_state.note_memoized_function(INFERENCE_ALL_SPEC_INVERSES_INT);
            memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX);
            memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT);
            memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX);
            memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT);
            memoization_state.note_memoized_function(INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX);
            memoization_state.note_globally_cached_function($sym33$SOME_MAX_FLOOR_MTS__CACHED);
            memoization_state.note_globally_cached_function(INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED);
            memoization_state.note_memoized_function(INFERENCE_MAX_FLOOR_MTS_OF_NAT);
            memoization_state.note_memoized_function($sym41$INFERENCE_APPLICABLE_SDCT_);
            memoization_state.note_memoized_function($sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_);
            memoization_state.note_memoized_function($sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW);
            memoization_state.note_memoized_function(INFERENCE_GAF_LOOKUP_INDEX);
            memoization_state.note_memoized_function(INFERENCE_NUM_GAF_LOOKUP_INDEX);
            memoization_state.note_memoized_function(INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX);
            memoization_state.note_memoized_function(INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM);
            memoization_state.note_memoized_function(INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX);
            memoization_state.note_memoized_function(INFERENCE_KEY_GAF_ARG_INDEX);
            memoization_state.note_memoized_function($sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_);
            memoization_state.note_memoized_function($sym66$INFERENCE_BACKCHAIN_FORBIDDEN_);
            memoization_state.note_memoized_function($sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_);
            memoization_state.note_memoized_function($sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_);
            memoization_state.note_memoized_function($sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_);
            memoization_state.note_memoized_function($sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_);
            memoization_state.note_memoized_function($sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_);
            memoization_state.note_memoized_function($sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_);
            memoization_state.note_memoized_function(INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY);
            memoization_state.note_memoized_function(INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY);
            memoization_state.note_memoized_function(INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE);
            memoization_state.note_memoized_function(INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED);
            memoization_state.note_memoized_function(INFERENCE_RULE_TYPE_CONSTRAINTS);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_);
            memoization_state.note_globally_cached_function($sym30$SOME_MAX_FLOOR_MTS__CACHED);
            memoization_state.note_memoized_function($sym38$INFERENCE_APPLICABLE_SDCT_);
            memoization_state.note_memoized_function($sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_);
            memoization_state.note_memoized_function($sym55$INFERENCE_BACKCHAIN_FORBIDDEN_);
            memoization_state.note_memoized_function($sym56$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_);
            memoization_state.note_memoized_function($sym57$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_);
            memoization_state.note_memoized_function($sym58$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_);
            memoization_state.note_memoized_function($sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_);
            memoization_state.note_memoized_function($sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_);
            memoization_state.note_memoized_function($sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_);
        }
        return NIL;
    }

    public static SubLObject setup_inference_trampolines_file_Previous() {
        memoization_state.note_memoized_function(INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P);
        memoization_state.note_globally_cached_function(INDETERMINATE_TERM_P);
        memoization_state.note_memoized_function($sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_);
        memoization_state.note_memoized_function(INFERENCE_ALL_GENL_PREDICATES);
        memoization_state.note_memoized_function(INFERENCE_ALL_SPEC_PREDICATES_INT);
        memoization_state.note_memoized_function(INFERENCE_ALL_GENL_INVERSES);
        memoization_state.note_memoized_function(INFERENCE_ALL_SPEC_INVERSES_INT);
        memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX);
        memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT);
        memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX);
        memoization_state.note_memoized_function(INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT);
        memoization_state.note_memoized_function(INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX);
        memoization_state.note_globally_cached_function($sym33$SOME_MAX_FLOOR_MTS__CACHED);
        memoization_state.note_globally_cached_function(INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED);
        memoization_state.note_memoized_function(INFERENCE_MAX_FLOOR_MTS_OF_NAT);
        memoization_state.note_memoized_function($sym41$INFERENCE_APPLICABLE_SDCT_);
        memoization_state.note_memoized_function($sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_);
        memoization_state.note_memoized_function($sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW);
        memoization_state.note_memoized_function(INFERENCE_GAF_LOOKUP_INDEX);
        memoization_state.note_memoized_function(INFERENCE_NUM_GAF_LOOKUP_INDEX);
        memoization_state.note_memoized_function(INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX);
        memoization_state.note_memoized_function(INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM);
        memoization_state.note_memoized_function(INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX);
        memoization_state.note_memoized_function(INFERENCE_KEY_GAF_ARG_INDEX);
        memoization_state.note_memoized_function($sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym66$INFERENCE_BACKCHAIN_FORBIDDEN_);
        memoization_state.note_memoized_function($sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_memoized_function($sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_memoized_function($sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_memoized_function($sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function($sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_);
        memoization_state.note_memoized_function(INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY);
        memoization_state.note_memoized_function(INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY);
        memoization_state.note_memoized_function(INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE);
        memoization_state.note_memoized_function(INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED);
        memoization_state.note_memoized_function(INFERENCE_RULE_TYPE_CONSTRAINTS);
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
    }

    public static final class $inference_predicate_p$UnaryFunction extends UnaryFunction {
        public $inference_predicate_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_predicate_p(arg1);
        }
    }

    public static final class $inference_symmetric_predicateP$UnaryFunction extends UnaryFunction {
        public $inference_symmetric_predicateP$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-SYMMETRIC-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_symmetric_predicateP(arg1);
        }
    }

    public static final class $inference_commutative_predicate_p$UnaryFunction extends UnaryFunction {
        public $inference_commutative_predicate_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-COMMUTATIVE-PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_commutative_predicate_p(arg1);
        }
    }

    public static final class $inference_partially_commutative_predicate_p$UnaryFunction extends UnaryFunction {
        public $inference_partially_commutative_predicate_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_partially_commutative_predicate_p(arg1);
        }
    }

    public static final class $inference_transitive_predicateP$UnaryFunction extends UnaryFunction {
        public $inference_transitive_predicateP$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-TRANSITIVE-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_transitive_predicateP(arg1);
        }
    }

    public static final class $inference_evaluatable_predicateP$UnaryFunction extends UnaryFunction {
        public $inference_evaluatable_predicateP$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-EVALUATABLE-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_evaluatable_predicateP(arg1);
        }
    }

    public static final class $inference_reflexive_predicateP$UnaryFunction extends UnaryFunction {
        public $inference_reflexive_predicateP$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-REFLEXIVE-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_reflexive_predicateP(arg1);
        }
    }

    public static final class $clear_indeterminate_term_p$ZeroArityFunction extends ZeroArityFunction {
        public $clear_indeterminate_term_p$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-INDETERMINATE-TERM-P"));
        }

        @Override
        public SubLObject processItem() {
            return clear_indeterminate_term_p();
        }
    }

    public static final class $inference_some_genl_pred_or_inverseP$UnaryFunction extends UnaryFunction {
        public $inference_some_genl_pred_or_inverseP$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_some_genl_pred_or_inverseP(arg1);
        }
    }

    public static final class $inference_some_spec_pred_or_inverseP$UnaryFunction extends UnaryFunction {
        public $inference_some_spec_pred_or_inverseP$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_some_spec_pred_or_inverseP(arg1);
        }
    }
}

/**
 * Total time: 1586 ms
 */
