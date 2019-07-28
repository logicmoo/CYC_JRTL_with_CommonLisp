package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.backward.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class backward extends SubLTranslatedFile {
    public static final SubLFile me = new backward();

    public static final String myName = "com.cyc.cycjava.cycl.backward";

    public static final String myFingerPrint = "7b3a06f44100f1e63f4d2d6fef6e95dbc8ccb36e4820f4b4f6d23749c8c1fbdd";

    // defparameter
    // Definitions
    // When non-nil, the implementation to funcall inside REMOVAL-ADD-NODE.
    public static final SubLSymbol $removal_add_node_method$ = makeSymbol("*REMOVAL-ADD-NODE-METHOD*");

    // defparameter
    /**
     * When non-nil, the implementation to funcall inside TRANSFORMATION-ADD-NODE.
     */
    public static final SubLSymbol $transformation_add_node_method$ = makeSymbol("*TRANSFORMATION-ADD-NODE-METHOD*");

    // defparameter
    /**
     * If any non-backchain literals exist in the transformation layer, and they
     * have an estimated removal cost less than this, force these removals to be
     * done first. Since the productivity of join-ordered links is doubled, this is
     * equal to DOUBLE the number of children that the focal problem can have and
     * still be considered for early removal. NIL means never perform early
     * removals. T means always perform early removals first.
     */
    public static final SubLSymbol $transformation_early_removal_threshold$ = makeSymbol("*TRANSFORMATION-EARLY-REMOVAL-THRESHOLD*");

    // defparameter
    // Bound by INFERENCE-EXPAND-INTERNAL
    private static final SubLSymbol $inference_expand_new_children$ = makeSymbol("*INFERENCE-EXPAND-NEW-CHILDREN*");

    // defparameter
    // Bound by INFERENCE-EXPAND-INTERNAL
    public static final SubLSymbol $inference_expand_hl_module$ = makeSymbol("*INFERENCE-EXPAND-HL-MODULE*");

    // defparameter
    // Bound by INFERENCE-EXPAND-INTERNAL
    public static final SubLSymbol $inference_expand_sense$ = makeSymbol("*INFERENCE-EXPAND-SENSE*");

    // defparameter
    public static final SubLSymbol $force_query_supports_in_forward_inferenceP$ = makeSymbol("*FORCE-QUERY-SUPPORTS-IN-FORWARD-INFERENCE?*");

    // defparameter
    public static final SubLSymbol $force_forward_mt_combos_computation_in_forward_inferenceP$ = makeSymbol("*FORCE-FORWARD-MT-COMBOS-COMPUTATION-IN-FORWARD-INFERENCE?*");

    // defparameter
    public static final SubLSymbol $debug_removal_add_node_helper_modify_supportsP$ = makeSymbol("*DEBUG-REMOVAL-ADD-NODE-HELPER-MODIFY-SUPPORTS?*");

    // deflexical
    private static final SubLSymbol $removal_ask_query_properties$ = makeSymbol("*REMOVAL-ASK-QUERY-PROPERTIES*");

    // defparameter
    /**
     * An #'equal dictionary-contents mapping bindings to a list of justifications
     * of those bindings.
     */
    private static final SubLSymbol $removal_ask_answers$ = makeSymbol("*REMOVAL-ASK-ANSWERS*");

    // defparameter
    private static final SubLSymbol $removal_ask_max_number$ = makeSymbol("*REMOVAL-ASK-MAX-NUMBER*");

    // defparameter
    private static final SubLSymbol $removal_ask_disallows_indeterminate_termsP$ = makeSymbol("*REMOVAL-ASK-DISALLOWS-INDETERMINATE-TERMS?*");

    // defparameter
    private static final SubLSymbol $removal_ask_first_answer_elapsed_internal_real_time$ = makeSymbol("*REMOVAL-ASK-FIRST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*");

    // defparameter
    private static final SubLSymbol $removal_ask_last_answer_elapsed_internal_real_time$ = makeSymbol("*REMOVAL-ASK-LAST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*");

    // defparameter
    private static final SubLSymbol $removal_ask_start_internal_real_time$ = makeSymbol("*REMOVAL-ASK-START-INTERNAL-REAL-TIME*");



    // defvar
    private static final SubLSymbol $forward_inference_pruning_mode$ = makeSymbol("*FORWARD-INFERENCE-PRUNING-MODE*");

    // defvar
    // temporary control parameter; @todo eliminate
    private static final SubLSymbol $forward_asserted_sentence_pruning_enabledP$ = makeSymbol("*FORWARD-ASSERTED-SENTENCE-PRUNING-ENABLED?*");

    // defconstant
    private static final SubLSymbol $preds_with_assumed_extent$ = makeSymbol("*PREDS-WITH-ASSUMED-EXTENT*");

    // deflexical
    private static final SubLSymbol $literal_set_sense_table$ = makeSymbol("*LITERAL-SET-SENSE-TABLE*");

    // Internal Constants
    public static final SubLString $str0$The_legacy_harness_is_no_longer_s = makeString("The legacy harness is no longer supported.");



    public static final SubLSymbol HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE");

    public static final SubLSymbol HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS");

    public static final SubLSymbol REMOVAL_ASK_ADD_NODE = makeSymbol("REMOVAL-ASK-ADD-NODE");



    private static final SubLString $str6$Removing_invalid_support__S_from_ = makeString("Removing invalid support ~S from ~S result");

    private static final SubLSymbol $sym7$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_ = makeSymbol("SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?");

    private static final SubLObject $$rewriteOf = reader_make_constant_shell(makeString("rewriteOf"));



    private static final SubLSymbol $sym10$HAS_PREFERRED_REWRITE_TERM_ = makeSymbol("HAS-PREFERRED-REWRITE-TERM?");

    private static final SubLSymbol PREFERRED_REWRITE_TERM = makeSymbol("PREFERRED-REWRITE-TERM");

    private static final SubLObject $$Now = reader_make_constant_shell(makeString("Now"));

    public static final SubLList $list13 = list(reader_make_constant_shell(makeString("Now")));



    private static final SubLObject $$indexicalReferent = reader_make_constant_shell(makeString("indexicalReferent"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));



    private static final SubLList $list18 = list(makeSymbol("MTS"), makeSymbol("IGNORED-SUPPORTS"));



    private static final SubLList $list20 = list(makeSymbol("IGNORED-MTS"), makeSymbol("NEW-SUPPORTS"));

    private static final SubLList $list21 = list(makeKeyword("MAX-NUMBER"), makeKeyword("ALLOWED-MODULES"), makeKeyword("METRICS"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"));

    private static final SubLSymbol REMOVAL_ASK = makeSymbol("REMOVAL-ASK");



    private static final SubLSymbol CYCL_ATOMIC_SENTENCE_P = makeSymbol("CYCL-ATOMIC-SENTENCE-P");



    private static final SubLSymbol REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol("REMOVAL-ASK-QUERY-PROPERTY-P");





    private static final SubLList $list29 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));









    private static final SubLSymbol $sym34$_ = makeSymbol("<");



    private static final SubLSymbol $kw36$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLSymbol $REMOVAL_ASK_DONE = makeKeyword("REMOVAL-ASK-DONE");

    private static final SubLList $list38 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));



    private static final SubLSymbol $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");

    private static final SubLSymbol $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");



    private static final SubLSymbol $TIME_PER_ANSWER = makeKeyword("TIME-PER-ANSWER");

    private static final SubLSymbol $LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");

    private static final SubLSymbol $COMPLETE_USER_TIME = makeKeyword("COMPLETE-USER-TIME");

    private static final SubLSymbol $COMPLETE_SYSTEM_TIME = makeKeyword("COMPLETE-SYSTEM-TIME");

    private static final SubLSymbol $COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");

    private static final SubLString $str48$removal_ask_cannot_handle_metric_ = makeString("removal-ask cannot handle metric ~s, using NIL instead");





    private static final SubLSymbol CLOSED_CONJUNCTIVE_CYCL_SENTENCE_P = makeSymbol("CLOSED-CONJUNCTIVE-CYCL-SENTENCE-P");

    private static final SubLSymbol CYCL_LITERAL_P = makeSymbol("CYCL-LITERAL-P");



    public static final SubLSymbol $transformation_semantic_pruning_enabled$ = makeSymbol("*TRANSFORMATION-SEMANTIC-PRUNING-ENABLED*");

    private static final SubLString $str55$Semantic_pruning_of_results_of_ba = makeString("Semantic pruning of results of backchaining");

    private static final SubLString $str56$This_controls_whether_or_not_the_ = makeString("This controls whether or not the intermediate results of backchaining\nare examined to see if they are provably unsatisfiable.  If so, these\nresults are pruned from the search.  This test takes time, but usually\nprovides substantial pruning of the search tree when backchaining.");

    private static final SubLList $list57 = list(list(makeKeyword("VALUE"), T, makeString("Yes")), list(makeKeyword("VALUE"), NIL, makeString("No")));









    private static final SubLString $str62$Unexpected_pruning_mode____S = makeString("Unexpected pruning mode : ~S");

    private static final SubLList $list63 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);



    private static final SubLSymbol $SEMANTICALLY_INVALID_CLOSED_ASENT_VIA_QUERY = makeKeyword("SEMANTICALLY-INVALID-CLOSED-ASENT-VIA-QUERY");



    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));



    private static final SubLSymbol $SEMANTICALLY_INVALID_ASSERTED_SENTENCE_ASENT = makeKeyword("SEMANTICALLY-INVALID-ASSERTED-SENTENCE-ASENT");



    private static final SubLSymbol $SEMANTICALLY_INVALID_COMPLETE_EXTENT_ASSERTED_ASENT = makeKeyword("SEMANTICALLY-INVALID-COMPLETE-EXTENT-ASSERTED-ASENT");

    private static final SubLList $list72 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $SEMANTICALLY_INVALID_ISA_ASENT = makeKeyword("SEMANTICALLY-INVALID-ISA-ASENT");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol $SEMANTICALLY_INVALID_GENLS_ASENT = makeKeyword("SEMANTICALLY-INVALID-GENLS-ASENT");

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLSymbol $SYNTACTICALLY_INVALID_TERM_OF_UNIT = makeKeyword("SYNTACTICALLY-INVALID-TERM-OF-UNIT");

    private static final SubLList $list80 = list(cons(makeKeyword("NO-POS"), makeKeyword("POS")), cons(makeKeyword("NO-NEG"), makeKeyword("NEG")), cons(makeKeyword("YES-POS"), makeKeyword("POS")), cons(makeKeyword("YES-NEG"), makeKeyword("NEG")));

    private static final SubLSymbol CLOSED_CONJUNCTIVE_REMOVAL_ASK = makeSymbol("CLOSED-CONJUNCTIVE-REMOVAL-ASK");













    private static final SubLList $list88 = list(list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Collection"))))), T), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Predicate"))))), NIL), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")))), T), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Collection")))), NIL), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate"))))), NIL), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Collection"))))), T));

    public static SubLObject inference_expand_new_children() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $inference_expand_new_children$.getDynamicValue(thread);
    }

    public static SubLObject add_to_inference_expand_new_children(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $inference_expand_new_children$.setDynamicValue(cons(node, $inference_expand_new_children$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static SubLObject inference_expand_hl_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $inference_expand_hl_module$.getDynamicValue(thread);
    }

    public static SubLObject inference_expand_sense() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $inference_expand_sense$.getDynamicValue(thread);
    }

    public static SubLObject transformation_add_node(final SubLObject rule_assertion, final SubLObject rule_pivot_asent, final SubLObject rule_pivot_sense, SubLObject v_bindings, SubLObject more_supports) {
        if (more_supports == UNPROVIDED) {
            more_supports = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == v_bindings) {
            v_bindings = bindings.unification_success_token();
        }
        final SubLObject no_trans_pos_lits = NIL;
        final SubLObject no_trans_neg_lits = NIL;
        thread.resetMultipleValues();
        final SubLObject new_pos_lits = transformation_rule_dependent_lits(rule_assertion, rule_pivot_asent, rule_pivot_sense);
        final SubLObject new_neg_lits = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != $transformation_add_node_method$.getDynamicValue(thread)) {
            final SubLObject dependent_dnf = clauses.make_clause(append(new_neg_lits, no_trans_neg_lits), append(new_pos_lits, no_trans_pos_lits));
            return funcall($transformation_add_node_method$.getDynamicValue(thread), rule_assertion, rule_pivot_asent, rule_pivot_sense, v_bindings, dependent_dnf, more_supports);
        }
        return Errors.error($str0$The_legacy_harness_is_no_longer_s);
    }

    public static SubLObject transformation_rule_dependent_lits(final SubLObject rule, final SubLObject asent_from_rule, final SubLObject asent_sense) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        if ($POS == asent_sense) {
            return values(clauses.neg_lits(cnf), remove(asent_from_rule, clauses.pos_lits(cnf), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return values(remove(asent_from_rule, clauses.neg_lits(cnf), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), clauses.pos_lits(cnf));
    }

    public static SubLObject removal_add_node(final SubLObject support, SubLObject v_bindings, SubLObject more_supports) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (more_supports == UNPROVIDED) {
            more_supports = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == v_bindings) {
            v_bindings = bindings.unification_success_token();
        }
        if (NIL == $removal_add_node_method$.getDynamicValue(thread)) {
            Errors.error($str0$The_legacy_harness_is_no_longer_s);
        }
        SubLObject supports = cons(support, more_supports);
        supports = removal_add_node_helper_remove_bad_supports(supports);
        thread.resetMultipleValues();
        final SubLObject v_bindings_$1 = removal_add_node_helper_rewrite_dispreferred_terms(v_bindings, supports);
        final SubLObject supports_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_bindings = v_bindings_$1;
        supports = supports_$2;
        final SubLObject supports_list = removal_add_node_helper_modify_supports(v_bindings, supports);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = supports_list;
        SubLObject final_supports = NIL;
        final_supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = removal_add_node_funcall($removal_add_node_method$.getDynamicValue(thread), v_bindings, final_supports);
            cdolist_list_var = cdolist_list_var.rest();
            final_supports = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject removal_add_node_funcall(final SubLObject function, final SubLObject v_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (function.eql(HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE)) {
            return inference_worker_removal.handle_removal_add_node_for_output_generate(v_bindings, supports);
        }
        if (function.eql(HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS)) {
            return inference_worker_removal.handle_removal_add_node_for_expand_results(v_bindings, supports);
        }
        if (function.eql(REMOVAL_ASK_ADD_NODE)) {
            return removal_ask_add_node(v_bindings, supports);
        }
        return funcall($removal_add_node_method$.getDynamicValue(thread), v_bindings, supports);
    }

    public static SubLObject removal_add_node_helper_remove_bad_supports(SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.find_if_not(SUPPORT_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                SubLObject cdolist_list_var = list_utilities.find_all_if_not(SUPPORT_P, supports, UNPROVIDED);
                SubLObject bad_support = NIL;
                bad_support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    Errors.warn($str6$Removing_invalid_support__S_from_, bad_support, inference_worker.currently_executing_tactic());
                    cdolist_list_var = cdolist_list_var.rest();
                    bad_support = cdolist_list_var.first();
                } 
            }
            supports = list_utilities.remove_if_not(SUPPORT_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return supports;
    }

    public static SubLObject removal_add_node_helper_rewrite_dispreferred_terms(SubLObject v_bindings, SubLObject supports) {
        SubLObject bindings_values = bindings.bindings_values(v_bindings);
        SubLObject dispreferred_terms = cycl_utilities.expression_gather(bindings_values, $sym7$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject rewrite_of_supports = NIL;
        if (NIL != dispreferred_terms) {
            SubLObject cdolist_list_var;
            dispreferred_terms = cdolist_list_var = terms_not_used_in_support_quoted_context(dispreferred_terms, supports);
            SubLObject dispreferred_term = NIL;
            dispreferred_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject preferred_term = equals.preferred_rewrite_term(dispreferred_term, UNPROVIDED);
                if (NIL != preferred_term) {
                    final SubLObject rewrite_of_sentence = make_binary_formula($$rewriteOf, preferred_term, dispreferred_term);
                    SubLObject rewrite_of_support = czer_meta.find_visible_assertion_cycl(rewrite_of_sentence, UNPROVIDED);
                    if (NIL == rewrite_of_support) {
                        rewrite_of_support = arguments.make_hl_support($EQUALITY, make_binary_formula($$rewriteOf, preferred_term, dispreferred_term), UNPROVIDED, UNPROVIDED);
                    }
                    rewrite_of_supports = cons(rewrite_of_support, rewrite_of_supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                dispreferred_term = cdolist_list_var.first();
            } 
            if (NIL != rewrite_of_supports) {
                bindings_values = cycl_utilities.expression_ntransform(bindings_values, $sym10$HAS_PREFERRED_REWRITE_TERM_, PREFERRED_REWRITE_TERM, T, UNPROVIDED);
                v_bindings = bindings.make_variable_bindings(bindings.bindings_variables(v_bindings), bindings_values);
                supports = append(rewrite_of_supports, supports);
                supports = possibly_simplify_supports_to_single_deduced_assertion(v_bindings, supports);
            }
        }
        return subl_promotions.values2(v_bindings, supports);
    }

    public static SubLObject removal_add_node_helper_dereference_indexicals(SubLObject v_bindings, SubLObject supports) {
        if (((NIL != kb_control_vars.date_kb_loaded_p()) && (NIL != cycl_utilities.expression_find($$Now, v_bindings, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != terms_not_used_in_support_quoted_context($list13, supports))) {
            final SubLObject now = date_utilities.indexical_now();
            v_bindings = cycl_utilities.expression_subst(now, $$Now, v_bindings, UNPROVIDED, UNPROVIDED);
            supports = cons(arguments.make_hl_support($OPAQUE, make_binary_formula($$indexicalReferent, $$Now, now), $$BaseKB, UNPROVIDED), supports);
        }
        return values(v_bindings, supports);
    }

    public static SubLObject terms_not_used_in_support_quoted_context(final SubLObject terms, final SubLObject supports) {
        SubLObject terms_used_in_quoted_context = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject support_sentence = arguments.support_sentence(support);
            SubLObject cdolist_list_var_$3 = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                SubLObject cdolist_list_var_$4 = list_utilities.all_positions(v_term, support_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject argnum = NIL;
                argnum = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL != kb_accessors.quoted_argumentP(cycl_utilities.atomic_sentence_predicate(support_sentence), argnum)) {
                        final SubLObject item_var = v_term;
                        if (NIL == member(item_var, terms_used_in_quoted_context, symbol_function(EQL), symbol_function(IDENTITY))) {
                            terms_used_in_quoted_context = cons(item_var, terms_used_in_quoted_context);
                        }
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    argnum = cdolist_list_var_$4.first();
                } 
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                v_term = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return set_difference(terms, terms_used_in_quoted_context, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject possibly_simplify_supports_to_single_deduced_assertion(final SubLObject v_bindings, SubLObject supports) {
        SubLObject better_support_assertion_usedP = NIL;
        final SubLObject bound_problem_query = inference_czer.problem_query_formula(bindings.apply_bindings(v_bindings, inference_worker.currently_active_problem_query()));
        final SubLObject better_support_assertion_candidates = czer_meta.find_visible_assertions_cycl(bound_problem_query, UNPROVIDED);
        if (NIL == better_support_assertion_usedP) {
            SubLObject csome_list_var = better_support_assertion_candidates;
            SubLObject better_support_assertion = NIL;
            better_support_assertion = csome_list_var.first();
            while ((NIL == better_support_assertion_usedP) && (NIL != csome_list_var)) {
                if ((NIL != better_support_assertion) && (NIL != deductions_high.find_deduction(better_support_assertion, supports, UNPROVIDED))) {
                    better_support_assertion_usedP = T;
                    supports = list(better_support_assertion);
                }
                csome_list_var = csome_list_var.rest();
                better_support_assertion = csome_list_var.first();
            } 
        }
        return supports;
    }

    public static SubLObject removal_add_node_helper_modify_supports(final SubLObject v_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports_list = NIL;
        if ((((((NIL != $force_query_supports_in_forward_inferenceP$.getDynamicValue(thread)) || (NIL != $force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue(thread))) && ((NIL != kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread)) || (NIL != $debug_removal_add_node_helper_modify_supportsP$.getDynamicValue(thread)))) && (((NIL == $force_query_supports_in_forward_inferenceP$.getDynamicValue(thread)) || (NIL != inference_worker.currently_active_problem())) || (NIL != $debug_removal_add_node_helper_modify_supportsP$.getDynamicValue(thread)))) && (NIL == hl_supports.$within_hl_justify_queryP$.getDynamicValue(thread))) && (NIL != list_utilities.find_if_not(ASSERTION_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            final SubLObject query_support_ist_sentence = (NIL != $force_query_supports_in_forward_inferenceP$.getDynamicValue(thread)) ? NIL != inference_worker.currently_active_problem() ? inference_czer.problem_query_formula(bindings.apply_bindings(v_bindings, inference_worker.currently_active_problem_query())) : arguments.support_sentence(supports.first()) : NIL;
            final SubLObject query_support_sentence = (NIL != ist_sentence_p(query_support_ist_sentence, UNPROVIDED)) ? designated_sentence(query_support_ist_sentence) : query_support_ist_sentence;
            final SubLObject all_mt_and_support_combinations = (NIL != $force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue(thread)) ? forward.compute_all_mt_and_support_combinations(supports, UNPROVIDED) : NIL;
            if ((NIL != $force_query_supports_in_forward_inferenceP$.getDynamicValue(thread)) && (NIL != $force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var = all_mt_and_support_combinations;
                SubLObject mts_and_supports = NIL;
                mts_and_supports = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = mts_and_supports;
                    SubLObject mts = NIL;
                    SubLObject ignored_supports = NIL;
                    destructuring_bind_must_consp(current, datum, $list18);
                    mts = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list18);
                    ignored_supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject cdolist_list_var_$5 = mts;
                        SubLObject mt = NIL;
                        mt = cdolist_list_var_$5.first();
                        while (NIL != cdolist_list_var_$5) {
                            final SubLObject query_support = arguments.make_hl_support($QUERY, query_support_sentence, mt, UNPROVIDED);
                            supports_list = cons(list(query_support), supports_list);
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            mt = cdolist_list_var_$5.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum, $list18);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mts_and_supports = cdolist_list_var.first();
                } 
            } else
                if (NIL != $force_query_supports_in_forward_inferenceP$.getDynamicValue(thread)) {
                    final SubLObject query_support2 = arguments.make_hl_support($QUERY, query_support_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                    supports_list = cons(list(query_support2), supports_list);
                } else
                    if (NIL != $force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue(thread)) {
                        SubLObject cdolist_list_var = all_mt_and_support_combinations;
                        SubLObject mts_and_supports = NIL;
                        mts_and_supports = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = mts_and_supports;
                            SubLObject ignored_mts = NIL;
                            SubLObject new_supports = NIL;
                            destructuring_bind_must_consp(current, datum, $list20);
                            ignored_mts = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list20);
                            new_supports = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                supports_list = cons(new_supports, supports_list);
                            } else {
                                cdestructuring_bind_error(datum, $list20);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            mts_and_supports = cdolist_list_var.first();
                        } 
                    }


        }
        return NIL != supports_list ? supports_list : list(supports);
    }

    public static SubLObject removal_ask_query_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $removal_ask_query_properties$.getGlobalValue());
    }

    public static SubLObject removal_ask(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(asent, CYCL_ATOMIC_SENTENCE_P);
        final SubLObject plist_var = query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != removal_ask_query_property_p(property) : "backward.removal_ask_query_property_p(property) " + "CommonSymbols.NIL != backward.removal_ask_query_property_p(property) " + property;
        }
        if (NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        SubLObject answers = NIL;
        SubLObject halt_reason = NIL;
        SubLObject metrics = NIL;
        final SubLObject _prev_bind_0 = $removal_add_node_method$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_macros.$controlling_inferences$.currentBinding(thread);
        final SubLObject _prev_bind_3 = inference_macros.$controlling_strategy$.currentBinding(thread);
        try {
            $removal_add_node_method$.bind(REMOVAL_ASK_ADD_NODE, thread);
            inference_macros.$controlling_inferences$.bind(cons(NIL, inference_macros.$controlling_inferences$.getDynamicValue(thread)), thread);
            inference_macros.$controlling_strategy$.bind(NIL, thread);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$8 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                thread.resetMultipleValues();
                final SubLObject answers_$9 = removal_ask_int(asent, truth, query_properties);
                final SubLObject halt_reason_$10 = thread.secondMultipleValue();
                final SubLObject metrics_$11 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                answers = answers_$9;
                halt_reason = halt_reason_$10;
                metrics = metrics_$11;
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$8, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$7, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            inference_macros.$controlling_strategy$.rebind(_prev_bind_3, thread);
            inference_macros.$controlling_inferences$.rebind(_prev_bind_2, thread);
            $removal_add_node_method$.rebind(_prev_bind_0, thread);
        }
        return values(answers, halt_reason, metrics);
    }

    public static SubLObject el_removal_ask(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars(asent);
        return removal_ask(hl_asent, mt, truth, query_properties);
    }

    public static SubLObject removal_ask_bindings(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject inference_answers = removal_ask(asent, mt, truth, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject metrics = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject bindings_list = list_utilities.mapcar_unique(symbol_function(FIRST), inference_answers, symbol_function(EQUAL));
        return values(bindings_list, halt_reason, metrics);
    }

    public static SubLObject el_removal_ask_bindings(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars(asent);
        return removal_ask_bindings(hl_asent, mt, truth, query_properties);
    }

    public static SubLObject removal_ask_justifications(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject inference_answers = removal_ask(asent, mt, truth, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject metrics = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject justifications = Mapping.mapcar(symbol_function(SECOND), inference_answers);
        return values(justifications, halt_reason, metrics);
    }

    public static SubLObject el_removal_ask_justifications(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars(asent);
        return removal_ask_justifications(hl_asent, mt, truth, query_properties);
    }

    public static SubLObject removal_ask_template(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject inference_answers = removal_ask(asent, mt, truth, query_properties);
        SubLObject template_answers = NIL;
        SubLObject cdolist_list_var = inference_answers;
        SubLObject inference_answer = NIL;
        inference_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = inference_answer;
            SubLObject v_bindings = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list29);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                template_answers = cons(bindings.subst_bindings(v_bindings, template), template_answers);
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference_answer = cdolist_list_var.first();
        } 
        return nreverse(template_answers);
    }

    public static SubLObject el_removal_ask_template(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject hl_template = variables.error_unless_canonicalize_default_el_vars(template);
        final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars(asent);
        return removal_ask_template(hl_template, hl_asent, mt, truth, query_properties);
    }

    public static SubLObject el_removal_ask_variable(final SubLObject var, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        SubLObject answers = el_removal_ask_template(var, asent, mt, truth, query_properties);
        answers = list_utilities.fast_delete_duplicates(answers, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return answers;
    }

    public static SubLObject removal_ask_variable(final SubLObject variable_token, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject variable = variables.get_variable(ZERO_INTEGER);
        final SubLObject query_asent = cycl_utilities.expression_subst(variable, variable_token, asent, UNPROVIDED, UNPROVIDED);
        final SubLObject answers = removal_ask_hl_variable(variable, query_asent, mt, truth, query_properties);
        return answers;
    }

    public static SubLObject removal_ask_hl_variable(final SubLObject hl_variable, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        SubLObject answers = removal_ask_template(hl_variable, asent, mt, truth, query_properties);
        answers = list_utilities.fast_delete_duplicates(answers, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return answers;
    }

    public static SubLObject removal_ask_answer_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary_contents.dictionary_contents_size($removal_ask_answers$.getDynamicValue(thread));
    }

    public static SubLObject removal_ask_add_node(final SubLObject v_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $removal_ask_disallows_indeterminate_termsP$.getDynamicValue(thread)) && (NIL != inference_strategist.some_answer_bindings_are_indeterminateP(v_bindings))) {
            return NIL;
        }
        if ((NIL != dictionary_contents.dictionary_contents_empty_p($removal_ask_answers$.getDynamicValue(thread))) && (NIL != $removal_ask_start_internal_real_time$.getDynamicValue(thread))) {
            $removal_ask_first_answer_elapsed_internal_real_time$.setDynamicValue(numeric_date_utilities.elapsed_internal_real_time($removal_ask_start_internal_real_time$.getDynamicValue(thread), UNPROVIDED), thread);
        }
        if (NIL != $removal_ask_start_internal_real_time$.getDynamicValue(thread)) {
            $removal_ask_last_answer_elapsed_internal_real_time$.setDynamicValue(numeric_date_utilities.elapsed_internal_real_time($removal_ask_start_internal_real_time$.getDynamicValue(thread), UNPROVIDED), thread);
        }
        $removal_ask_answers$.setDynamicValue(dictionary_utilities.dictionary_contents_push($removal_ask_answers$.getDynamicValue(thread), copy_tree(v_bindings), copy_tree(supports), symbol_function(EQUAL)), thread);
        if ((NIL != $removal_ask_max_number$.getDynamicValue(thread)) && removal_ask_answer_count().numGE($removal_ask_max_number$.getDynamicValue(thread))) {
            return note_removal_ask_done($MAX_NUMBER);
        }
        return NIL;
    }

    public static SubLObject removal_ask_int(final SubLObject asent, final SubLObject truth, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject plist_var = query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != removal_ask_query_property_p(property) : "backward.removal_ask_query_property_p(property) " + "CommonSymbols.NIL != backward.removal_ask_query_property_p(property) " + property;
        }
        final SubLObject sense = enumeration_types.truth_sense(truth);
        final SubLObject allowed_modules_spec = getf(query_properties, $ALLOWED_MODULES, $ALL);
        final SubLObject allowed_tactic_specs = removal_ask_tactic_specs(asent, sense, allowed_modules_spec);
        if (NIL != allowed_tactic_specs) {
            return removal_ask_expand(asent, sense, allowed_tactic_specs, query_properties);
        }
        return values(NIL, $EXHAUST_TOTAL, NIL);
    }

    public static SubLObject removal_ask_tactic_specs(final SubLObject asent, final SubLObject sense, final SubLObject allowed_modules_spec) {
        return inference_worker_removal.literal_removal_options(asent, sense, allowed_modules_spec);
    }

    public static SubLObject removal_ask_expand(final SubLObject asent, final SubLObject sense, SubLObject tactic_specs, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        SubLObject halt_reason = NIL;
        SubLObject metric_values = NIL;
        tactic_specs = Sort.sort(copy_list(tactic_specs), symbol_function($sym34$_), symbol_function(SECOND));
        final SubLObject metrics = getf(query_properties, $METRICS, NIL);
        final SubLObject _prev_bind_0 = $removal_ask_answers$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $removal_ask_max_number$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $removal_ask_disallows_indeterminate_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $removal_ask_start_internal_real_time$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $removal_ask_first_answer_elapsed_internal_real_time$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $removal_ask_last_answer_elapsed_internal_real_time$.currentBinding(thread);
        try {
            $removal_ask_answers$.bind(dictionary_contents.new_dictionary_contents(ZERO_INTEGER, symbol_function(EQUAL)), thread);
            $removal_ask_max_number$.bind(getf(query_properties, $MAX_NUMBER, NIL), thread);
            $removal_ask_disallows_indeterminate_termsP$.bind(makeBoolean(NIL == getf(query_properties, $kw36$ALLOW_INDETERMINATE_RESULTS_, T)), thread);
            $removal_ask_start_internal_real_time$.bind(NIL != metrics ? get_internal_real_time() : NIL, thread);
            $removal_ask_first_answer_elapsed_internal_real_time$.bind(NIL, thread);
            $removal_ask_last_answer_elapsed_internal_real_time$.bind(NIL, thread);
            if (NIL == halt_reason) {
                SubLObject csome_list_var = tactic_specs;
                SubLObject tactic_spec = NIL;
                tactic_spec = csome_list_var.first();
                while ((NIL == halt_reason) && (NIL != csome_list_var)) {
                    try {
                        thread.throwStack.push($REMOVAL_ASK_DONE);
                        SubLObject current;
                        final SubLObject datum = current = tactic_spec;
                        SubLObject hl_module = NIL;
                        SubLObject productivity = NIL;
                        SubLObject completeness = NIL;
                        destructuring_bind_must_consp(current, datum, $list38);
                        hl_module = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list38);
                        productivity = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list38);
                        completeness = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            final SubLObject cost = inference_datastructures_enumerated_types.cost_for_productivity(productivity);
                            final SubLObject _prev_bind_0_$12 = $inference_expand_hl_module$.currentBinding(thread);
                            try {
                                $inference_expand_hl_module$.bind(hl_module, thread);
                                final SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
                                final SubLObject expand_method = (NIL != pattern) ? NIL : inference_modules.hl_module_expand_func(hl_module);
                                if (NIL == inference_hl_module_cost_too_expensive(hl_module, cost)) {
                                    final SubLObject _prev_bind_0_$13 = $inference_expand_sense$.currentBinding(thread);
                                    try {
                                        $inference_expand_sense$.bind(sense, thread);
                                        if (NIL != pattern) {
                                            formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
                                        } else {
                                            funcall(expand_method, asent, sense);
                                        }
                                    } finally {
                                        $inference_expand_sense$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                            } finally {
                                $inference_expand_hl_module$.rebind(_prev_bind_0_$12, thread);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list38);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        halt_reason = Errors.handleThrowable(ccatch_env_var, $REMOVAL_ASK_DONE);
                    } finally {
                        thread.throwStack.pop();
                    }
                    csome_list_var = csome_list_var.rest();
                    tactic_spec = csome_list_var.first();
                } 
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state($removal_ask_answers$.getDynamicValue(thread)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = justifications;
                SubLObject justification = NIL;
                justification = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == abnormal.abnormality_except_support_enabledP()) || (NIL == inference_worker_transformation.supports_contain_excepted_assertionP(justification, UNPROVIDED))) {
                        answers = cons(list(v_bindings, justification), answers);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if (NIL == halt_reason) {
                halt_reason = $EXHAUST_TOTAL;
            }
            if (NIL != metrics) {
                metric_values = removal_ask_compute_metric_values(metrics);
            }
        } finally {
            $removal_ask_last_answer_elapsed_internal_real_time$.rebind(_prev_bind_6, thread);
            $removal_ask_first_answer_elapsed_internal_real_time$.rebind(_prev_bind_5, thread);
            $removal_ask_start_internal_real_time$.rebind(_prev_bind_4, thread);
            $removal_ask_disallows_indeterminate_termsP$.rebind(_prev_bind_3, thread);
            $removal_ask_max_number$.rebind(_prev_bind_2, thread);
            $removal_ask_answers$.rebind(_prev_bind_0, thread);
        }
        return values(nreverse(answers), halt_reason, metric_values);
    }

    public static SubLObject removal_ask_compute_metric_values(final SubLObject metrics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject metric_values = copy_list(metrics);
        final SubLObject time_to_first_answer = (NIL != $removal_ask_first_answer_elapsed_internal_real_time$.getDynamicValue(thread)) ? numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds($removal_ask_first_answer_elapsed_internal_real_time$.getDynamicValue(thread)) : NIL;
        final SubLObject time_to_last_answer = (NIL != $removal_ask_last_answer_elapsed_internal_real_time$.getDynamicValue(thread)) ? numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds($removal_ask_last_answer_elapsed_internal_real_time$.getDynamicValue(thread)) : NIL;
        final SubLObject total_time = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(numeric_date_utilities.elapsed_internal_real_time($removal_ask_start_internal_real_time$.getDynamicValue(thread), UNPROVIDED));
        SubLObject cdolist_list_var = metrics;
        SubLObject metric = NIL;
        metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = metric;
            if (pcase_var.eql($ANSWER_COUNT)) {
                final SubLObject answer_count = removal_ask_answer_count();
                metric_values = nsubstitute(answer_count, $ANSWER_COUNT, metric_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($TIME_TO_FIRST_ANSWER)) {
                    metric_values = nsubstitute(time_to_first_answer, $TIME_TO_FIRST_ANSWER, metric_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($TIME_TO_LAST_ANSWER)) {
                        metric_values = nsubstitute(time_to_last_answer, $TIME_TO_LAST_ANSWER, metric_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($TOTAL_TIME)) {
                            metric_values = nsubstitute(total_time, $TOTAL_TIME, metric_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($TIME_PER_ANSWER)) {
                                final SubLObject answer_count = removal_ask_answer_count();
                                SubLObject time_per_answer = NIL;
                                if (total_time.isNumber() && (NIL != subl_promotions.positive_integer_p(answer_count))) {
                                    time_per_answer = divide(total_time, answer_count);
                                }
                                metric_values = nsubstitute(time_per_answer, $TIME_PER_ANSWER, metric_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($LATENCY_IMPROVEMENT_FROM_ITERATIVITY)) {
                                    final SubLObject latency_improvement_from_iterativity = list_utilities.safe_difference(total_time, time_to_first_answer);
                                    metric_values = nsubstitute(latency_improvement_from_iterativity, $LATENCY_IMPROVEMENT_FROM_ITERATIVITY, metric_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if ((!pcase_var.eql($COMPLETE_USER_TIME)) && (!pcase_var.eql($COMPLETE_SYSTEM_TIME))) {
                                        if (!pcase_var.eql($COMPLETE_TOTAL_TIME)) {
                                            Errors.warn($str48$removal_ask_cannot_handle_metric_, metric);
                                            metric_values = nsubstitute(NIL, metric, metric_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }






            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        } 
        return metric_values;
    }

    public static SubLObject note_removal_ask_done(final SubLObject halt_reason) {
        return sublisp_throw($REMOVAL_ASK_DONE, halt_reason);
    }

    public static SubLObject inference_hl_module_cost_too_expensive(final SubLObject hl_module, final SubLObject cost) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = inference_modules.hl_module_type(hl_module);
        if (pcase_var.eql($REMOVAL)) {
            return makeBoolean((NIL != $removal_cost_cutoff$.getDynamicValue(thread)) && cost.numG($removal_cost_cutoff$.getDynamicValue(thread)));
        }
        return NIL;
    }

    public static SubLObject closed_conjunctive_cycl_sentence_p(final SubLObject v_object) {
        if (NIL == groundP(v_object, UNPROVIDED)) {
            return NIL;
        }
        return cycl_literal_or_conjunction_of_cycl_literals_p(v_object);
    }

    public static SubLObject cycl_literal_or_conjunction_of_cycl_literals_p(final SubLObject v_object) {
        if (NIL != cycl_grammar.cycl_literal_p(v_object)) {
            return T;
        }
        if (NIL != el_conjunction_p(v_object)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(v_object, $IGNORE);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == cycl_grammar.cycl_literal_p(conjunct)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject closed_conjunctive_removal_ask(final SubLObject closed_sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        assert NIL != closed_conjunctive_cycl_sentence_p(closed_sentence) : "backward.closed_conjunctive_cycl_sentence_p(closed_sentence) " + "CommonSymbols.NIL != backward.closed_conjunctive_cycl_sentence_p(closed_sentence) " + closed_sentence;
        if (NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        if (NIL != el_conjunction_p(closed_sentence)) {
            SubLObject falsifiedP = NIL;
            final SubLObject args = cycl_utilities.formula_args(closed_sentence, $IGNORE);
            SubLObject rest;
            SubLObject conjunct;
            for (rest = NIL, rest = args; (NIL == falsifiedP) && (NIL != rest); rest = rest.rest()) {
                conjunct = rest.first();
                if (NIL == removal_ask_literal(conjunct, mt, query_properties)) {
                    falsifiedP = T;
                }
            }
            return makeBoolean(NIL == falsifiedP);
        }
        return list_utilities.sublisp_boolean(removal_ask_literal(closed_sentence, mt, query_properties));
    }

    public static SubLObject removal_ask_literal(final SubLObject literal, final SubLObject mt, final SubLObject query_properties) {
        assert NIL != cycl_grammar.cycl_literal_p(literal) : "cycl_grammar.cycl_literal_p(literal) " + "CommonSymbols.NIL != cycl_grammar.cycl_literal_p(literal) " + literal;
        final SubLObject truth = (NIL != el_negation_p(literal)) ? $FALSE : $TRUE;
        final SubLObject asent = literal_atomic_sentence(literal);
        return removal_ask(asent, mt, truth, query_properties);
    }

    public static SubLObject semantically_valid_closed_asentsP(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $forward_inference_pruning_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NONE)) {
            return T;
        }
        if (pcase_var.eql($LEGACY)) {
            SubLObject current_validP = T;
            SubLObject current_reason = NIL;
            thread.resetMultipleValues();
            final SubLObject current_validP_$14 = semantically_valid_asserted_sentence_asents(dnf, mt, justifyP);
            final SubLObject current_reason_$15 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            current_validP = current_validP_$14;
            current_reason = current_reason_$15;
            if (NIL != current_validP) {
                thread.resetMultipleValues();
                final SubLObject current_validP_$15 = semantically_valid_complete_extent_asserted_asents(dnf, mt, justifyP);
                final SubLObject current_reason_$16 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                current_validP = current_validP_$15;
                current_reason = current_reason_$16;
                if (NIL != current_validP) {
                    thread.resetMultipleValues();
                    final SubLObject current_validP_$16 = semantically_valid_isa_asents(dnf, mt, justifyP);
                    final SubLObject current_reason_$17 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    current_validP = current_validP_$16;
                    current_reason = current_reason_$17;
                    if (NIL != current_validP) {
                        thread.resetMultipleValues();
                        final SubLObject current_validP_$17 = semantically_valid_genls_asents(dnf, mt, justifyP);
                        final SubLObject current_reason_$18 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        current_validP = current_validP_$17;
                        current_reason = current_reason_$18;
                    }
                }
            }
            if (NIL == justifyP) {
                return current_validP;
            }
            return values(current_validP, NIL != current_validP ? NIL : current_reason);
        } else {
            if (pcase_var.eql($TRIVIAL)) {
                return semantically_valid_closed_asentsP_int(dnf, mt, NIL, justifyP);
            }
            if (pcase_var.eql($INFERENCE)) {
                return semantically_valid_closed_asentsP_int(dnf, mt, T, justifyP);
            }
            return Errors.error($str62$Unexpected_pruning_mode____S, $forward_inference_pruning_mode$.getDynamicValue(thread));
        }
    }

    public static SubLObject semantically_valid_closed_asentsP_int(final SubLObject dnf, final SubLObject mt, final SubLObject use_problem_storeP, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLObject invalidP = NIL;
        SubLObject reason = NIL;
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        SubLObject invalidP_$22 = NIL;
        if (NIL == invalidP_$22) {
            SubLObject csome_list_var = pos_lits;
            SubLObject pos_lit = NIL;
            pos_lit = csome_list_var.first();
            while ((NIL == invalidP_$22) && (NIL != csome_list_var)) {
                if (NIL != variables.fully_bound_p(pos_lit)) {
                    final SubLObject gaf_dnf = clause_utilities.make_gaf_dnf(pos_lit);
                    final SubLObject overriding_query_properties = $list63;
                    if (NIL != use_problem_storeP) {
                        invalidP_$22 = makeBoolean(NIL == forward.new_forward_query_from_dnf(gaf_dnf, clauses.empty_clause(), mt, overriding_query_properties));
                    } else {
                        invalidP_$22 = makeBoolean(NIL == forward.new_cyc_trivial_forward_query_from_dnf(gaf_dnf, mt, NIL, overriding_query_properties));
                    }
                    if ((NIL != invalidP_$22) && (NIL != justifyP)) {
                        reason = list($TYPE, $SEMANTICALLY_INVALID_CLOSED_ASENT_VIA_QUERY, $POS_LIT, pos_lit);
                    }
                }
                csome_list_var = csome_list_var.rest();
                pos_lit = csome_list_var.first();
            } 
        }
        if (NIL == justifyP) {
            return makeBoolean(NIL == invalidP);
        }
        return values(makeBoolean(NIL == invalidP), NIL != invalidP ? reason : NIL);
    }

    public static SubLObject semantically_valid_asserted_sentence_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP = NIL;
        SubLObject reason = NIL;
        if (NIL != $forward_asserted_sentence_pruning_enabledP$.getDynamicValue(thread)) {
            final SubLObject pos_lits = clauses.pos_lits(dnf);
            if (NIL != find($$assertedSentence, pos_lits, symbol_function(EQL), symbol_function(ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED)) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (NIL == invalidP) {
                        SubLObject csome_list_var = pos_lits;
                        SubLObject asent = NIL;
                        asent = csome_list_var.first();
                        while ((NIL == invalidP) && (NIL != csome_list_var)) {
                            if ($$assertedSentence.eql(cycl_utilities.atomic_sentence_predicate(asent)) && (NIL != semantically_invalid_asserted_sentence_asent(asent))) {
                                invalidP = T;
                                if (NIL != justifyP) {
                                    reason = list($TYPE, $SEMANTICALLY_INVALID_ASSERTED_SENTENCE_ASENT, $ASENT, asent);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            asent = csome_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (NIL == justifyP) {
            return makeBoolean(NIL == invalidP);
        }
        return values(makeBoolean(NIL == invalidP), NIL != invalidP ? reason : NIL);
    }

    public static SubLObject semantically_valid_complete_extent_asserted_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP = NIL;
        SubLObject reason = NIL;
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == invalidP) {
                SubLObject csome_list_var = pos_lits;
                SubLObject asent = NIL;
                asent = csome_list_var.first();
                while ((NIL == invalidP) && (NIL != csome_list_var)) {
                    final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    if (((NIL != forts.fort_p(pred)) && (NIL != kb_accessors.complete_extent_assertedP(pred, UNPROVIDED))) && (NIL != non_asserted_asentP(asent))) {
                        invalidP = T;
                        if (NIL != justifyP) {
                            reason = list($TYPE, $SEMANTICALLY_INVALID_COMPLETE_EXTENT_ASSERTED_ASENT, $ASENT, asent);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    asent = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == justifyP) {
            return makeBoolean(NIL == invalidP);
        }
        return values(makeBoolean(NIL == invalidP), NIL != invalidP ? reason : NIL);
    }

    public static SubLObject semantically_invalid_asserted_sentence_asent(final SubLObject asent) {
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return non_asserted_asentP(sentence);
    }

    public static SubLObject asent_only_has_pred_boundP(final SubLObject sentence) {
        if (NIL != variables.variable_p(sentence.first())) {
            return NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == variables.variable_p(item)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject non_asserted_asentP(final SubLObject sentence) {
        if (NIL != el_formula_p(sentence)) {
            if (NIL != asent_only_has_pred_boundP(sentence)) {
                if (NIL != list_utilities.member_kbeqP(sentence.first(), $preds_with_assumed_extent$.getGlobalValue())) {
                    return NIL;
                }
                if ((NIL != subl_promotions.positive_integer_p(kb_indexing.num_predicate_extent_index(cycl_utilities.atomic_sentence_predicate(sentence), UNPROVIDED))) && (NIL != subl_promotions.positive_integer_p(kb_indexing.relevant_num_predicate_extent_index_with_cutoff(cycl_utilities.atomic_sentence_predicate(sentence), ONE_INTEGER)))) {
                    return NIL;
                }
            }
            if (NIL != non_asserted_asent_via_somewhere_cacheP(sentence)) {
                return T;
            }
            if (NIL != non_asserted_asent_via_gaf_lookupP(sentence)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject non_asserted_asent_via_somewhere_cacheP(final SubLObject sentence) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        if (((NIL != forts.fort_p(predicate)) && (NIL != fort_types_interface.predicateP(predicate))) && (NIL != somewhere_cache.somewhere_cached_pred_p(predicate))) {
            final SubLObject argnum = somewhere_cache.some_pred_assertion_somewhere_argnum(predicate);
            final SubLObject arg = cycl_utilities.formula_arg(sentence, argnum, UNPROVIDED);
            if ((NIL != forts.fort_p(arg)) && (NIL == somewhere_cache.some_pred_assertion_somewhereP(predicate, arg, argnum, UNPROVIDED))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject non_asserted_asent_via_gaf_lookupP(final SubLObject sentence) {
        return makeBoolean((NIL != cycl_utilities.expression_find_if(INDEXED_TERM_P, sentence, UNPROVIDED, UNPROVIDED)) && (NIL == kb_indexing.asent_kb_lookup_in_any_mt(sentence, forward.$forward_inference_asserted_asent_fast_fail_cutoff$.getGlobalValue())));
    }

    public static SubLObject semantically_valid_isa_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        SubLObject invalidP = NIL;
        SubLObject reason = NIL;
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        if (NIL != find($$isa, pos_lits, symbol_function(EQL), symbol_function(ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = pos_lits;
            SubLObject asent = NIL;
            asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if (((NIL != forts.fort_p(arg1)) && (NIL != forts.fort_p(arg2))) && (NIL == at_defns.quiet_has_type_memoizedP(arg1, arg2, mt, UNPROVIDED))) {
                        invalidP = T;
                        if (NIL != justifyP) {
                            reason = list($TYPE, $SEMANTICALLY_INVALID_ISA_ASENT, $ASENT, asent);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            } 
        }
        if (NIL == justifyP) {
            return makeBoolean(NIL == invalidP);
        }
        return values(makeBoolean(NIL == invalidP), NIL != invalidP ? reason : NIL);
    }

    public static SubLObject semantically_valid_genls_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        SubLObject invalidP = NIL;
        SubLObject reason = NIL;
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        if (NIL != find($$genls, pos_lits, symbol_function(EQL), symbol_function(ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = pos_lits;
            SubLObject asent = NIL;
            asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$genls.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if (((NIL != forts.fort_p(arg1)) && (NIL != forts.fort_p(arg2))) && (NIL == genls.genlsP(arg1, arg2, mt, UNPROVIDED))) {
                        invalidP = T;
                        if (NIL != justifyP) {
                            reason = list($TYPE, $SEMANTICALLY_INVALID_GENLS_ASENT, $ASENT, asent);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            } 
        }
        if (NIL == justifyP) {
            return makeBoolean(NIL == invalidP);
        }
        return values(makeBoolean(NIL == invalidP), NIL != invalidP ? reason : NIL);
    }

    public static SubLObject semantically_valid_term_of_unit_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        return syntactically_valid_term_of_unit_asents(dnf, justifyP);
    }

    public static SubLObject syntactically_valid_term_of_unit_asents(final SubLObject dnf, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        SubLObject cdolist_list_var = clauses.pos_lits(dnf);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$termOfUnit)) && (NIL == syntactically_valid_term_of_unit_asent(asent))) {
                if (NIL != justifyP) {
                    return values(NIL, list($TYPE, $SYNTACTICALLY_INVALID_TERM_OF_UNIT, $ASENT, asent));
                }
                return NIL;
            } else {
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            }
        } 
        return T;
    }

    public static SubLObject valid_term_of_unit_arg1(final SubLObject v_object) {
        return makeBoolean((NIL != variables.variable_p(v_object)) || (NIL != cycl_grammar.cycl_nat_p(v_object)));
    }

    public static SubLObject valid_term_of_unit_arg2(final SubLObject v_object) {
        return makeBoolean((NIL != variables.variable_p(v_object)) || (NIL != narts_high.naut_p(v_object)));
    }

    public static SubLObject valid_term_of_unit_args(final SubLObject arg1, final SubLObject arg2) {
        return makeBoolean((NIL != valid_term_of_unit_arg1(arg1)) && (NIL != valid_term_of_unit_arg2(arg2)));
    }

    public static SubLObject valid_term_of_unit_inter_args(final SubLObject arg1, final SubLObject arg2) {
        if ((NIL != possibly_nat_p(arg1)) && (NIL != possibly_nat_p(arg2))) {
            final SubLObject arg1_functor = cycl_utilities.nat_functor(arg1);
            final SubLObject arg2_functor = cycl_utilities.nat_functor(arg2);
            if (((NIL != forts.fort_p(arg1_functor)) && (NIL != forts.fort_p(arg2_functor))) && (!arg1_functor.eql(arg2_functor))) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject syntactically_valid_term_of_unit_asent(final SubLObject tou_asent) {
        if (NIL != formula_arityE(tou_asent, TWO_INTEGER, UNPROVIDED)) {
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(tou_asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(tou_asent, UNPROVIDED);
            return makeBoolean((NIL != valid_term_of_unit_args(arg1, arg2)) && (NIL != valid_term_of_unit_inter_args(arg1, arg2)));
        }
        return NIL;
    }

    public static SubLObject literal_set_sense(final SubLObject literal_set) {
        return assoc(literal_set, $literal_set_sense_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject literal_set_without(final SubLObject literals, final SubLObject literal_num) {
        return list_utilities.remove_nth(literal_num, literals);
    }

    public static SubLObject declare_backward_file() {
        declareFunction(me, "inference_expand_new_children", "INFERENCE-EXPAND-NEW-CHILDREN", 0, 0, false);
        declareFunction(me, "add_to_inference_expand_new_children", "ADD-TO-INFERENCE-EXPAND-NEW-CHILDREN", 1, 0, false);
        declareFunction(me, "inference_expand_hl_module", "INFERENCE-EXPAND-HL-MODULE", 0, 0, false);
        declareFunction(me, "inference_expand_sense", "INFERENCE-EXPAND-SENSE", 0, 0, false);
        declareFunction(me, "transformation_add_node", "TRANSFORMATION-ADD-NODE", 4, 1, false);
        declareFunction(me, "transformation_rule_dependent_lits", "TRANSFORMATION-RULE-DEPENDENT-LITS", 3, 0, false);
        declareFunction(me, "removal_add_node", "REMOVAL-ADD-NODE", 1, 2, false);
        declareFunction(me, "removal_add_node_funcall", "REMOVAL-ADD-NODE-FUNCALL", 3, 0, false);
        declareFunction(me, "removal_add_node_helper_remove_bad_supports", "REMOVAL-ADD-NODE-HELPER-REMOVE-BAD-SUPPORTS", 1, 0, false);
        declareFunction(me, "removal_add_node_helper_rewrite_dispreferred_terms", "REMOVAL-ADD-NODE-HELPER-REWRITE-DISPREFERRED-TERMS", 2, 0, false);
        declareFunction(me, "removal_add_node_helper_dereference_indexicals", "REMOVAL-ADD-NODE-HELPER-DEREFERENCE-INDEXICALS", 2, 0, false);
        declareFunction(me, "terms_not_used_in_support_quoted_context", "TERMS-NOT-USED-IN-SUPPORT-QUOTED-CONTEXT", 2, 0, false);
        declareFunction(me, "possibly_simplify_supports_to_single_deduced_assertion", "POSSIBLY-SIMPLIFY-SUPPORTS-TO-SINGLE-DEDUCED-ASSERTION", 2, 0, false);
        declareFunction(me, "removal_add_node_helper_modify_supports", "REMOVAL-ADD-NODE-HELPER-MODIFY-SUPPORTS", 2, 0, false);
        declareFunction(me, "removal_ask_query_property_p", "REMOVAL-ASK-QUERY-PROPERTY-P", 1, 0, false);
        declareFunction(me, "removal_ask", "REMOVAL-ASK", 1, 3, false);
        declareFunction(me, "el_removal_ask", "EL-REMOVAL-ASK", 1, 3, false);
        declareFunction(me, "removal_ask_bindings", "REMOVAL-ASK-BINDINGS", 1, 3, false);
        declareFunction(me, "el_removal_ask_bindings", "EL-REMOVAL-ASK-BINDINGS", 1, 3, false);
        declareFunction(me, "removal_ask_justifications", "REMOVAL-ASK-JUSTIFICATIONS", 1, 3, false);
        declareFunction(me, "el_removal_ask_justifications", "EL-REMOVAL-ASK-JUSTIFICATIONS", 1, 3, false);
        declareFunction(me, "removal_ask_template", "REMOVAL-ASK-TEMPLATE", 2, 3, false);
        declareFunction(me, "el_removal_ask_template", "EL-REMOVAL-ASK-TEMPLATE", 2, 3, false);
        declareFunction(me, "el_removal_ask_variable", "EL-REMOVAL-ASK-VARIABLE", 2, 3, false);
        declareFunction(me, "removal_ask_variable", "REMOVAL-ASK-VARIABLE", 2, 3, false);
        declareFunction(me, "removal_ask_hl_variable", "REMOVAL-ASK-HL-VARIABLE", 2, 3, false);
        declareFunction(me, "removal_ask_answer_count", "REMOVAL-ASK-ANSWER-COUNT", 0, 0, false);
        declareFunction(me, "removal_ask_add_node", "REMOVAL-ASK-ADD-NODE", 2, 0, false);
        declareFunction(me, "removal_ask_int", "REMOVAL-ASK-INT", 2, 1, false);
        declareFunction(me, "removal_ask_tactic_specs", "REMOVAL-ASK-TACTIC-SPECS", 3, 0, false);
        declareFunction(me, "removal_ask_expand", "REMOVAL-ASK-EXPAND", 4, 0, false);
        declareFunction(me, "removal_ask_compute_metric_values", "REMOVAL-ASK-COMPUTE-METRIC-VALUES", 1, 0, false);
        declareFunction(me, "note_removal_ask_done", "NOTE-REMOVAL-ASK-DONE", 1, 0, false);
        declareFunction(me, "inference_hl_module_cost_too_expensive", "INFERENCE-HL-MODULE-COST-TOO-EXPENSIVE", 2, 0, false);
        declareFunction(me, "closed_conjunctive_cycl_sentence_p", "CLOSED-CONJUNCTIVE-CYCL-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_literal_or_conjunction_of_cycl_literals_p", "CYCL-LITERAL-OR-CONJUNCTION-OF-CYCL-LITERALS-P", 1, 0, false);
        declareFunction(me, "closed_conjunctive_removal_ask", "CLOSED-CONJUNCTIVE-REMOVAL-ASK", 1, 2, false);
        declareFunction(me, "removal_ask_literal", "REMOVAL-ASK-LITERAL", 3, 0, false);
        declareFunction(me, "semantically_valid_closed_asentsP", "SEMANTICALLY-VALID-CLOSED-ASENTS?", 1, 2, false);
        declareFunction(me, "semantically_valid_closed_asentsP_int", "SEMANTICALLY-VALID-CLOSED-ASENTS?-INT", 3, 1, false);
        declareFunction(me, "semantically_valid_asserted_sentence_asents", "SEMANTICALLY-VALID-ASSERTED-SENTENCE-ASENTS", 1, 2, false);
        declareFunction(me, "semantically_valid_complete_extent_asserted_asents", "SEMANTICALLY-VALID-COMPLETE-EXTENT-ASSERTED-ASENTS", 1, 2, false);
        declareFunction(me, "semantically_invalid_asserted_sentence_asent", "SEMANTICALLY-INVALID-ASSERTED-SENTENCE-ASENT", 1, 0, false);
        declareFunction(me, "asent_only_has_pred_boundP", "ASENT-ONLY-HAS-PRED-BOUND?", 1, 0, false);
        declareFunction(me, "non_asserted_asentP", "NON-ASSERTED-ASENT?", 1, 0, false);
        declareFunction(me, "non_asserted_asent_via_somewhere_cacheP", "NON-ASSERTED-ASENT-VIA-SOMEWHERE-CACHE?", 1, 0, false);
        declareFunction(me, "non_asserted_asent_via_gaf_lookupP", "NON-ASSERTED-ASENT-VIA-GAF-LOOKUP?", 1, 0, false);
        declareFunction(me, "semantically_valid_isa_asents", "SEMANTICALLY-VALID-ISA-ASENTS", 1, 2, false);
        declareFunction(me, "semantically_valid_genls_asents", "SEMANTICALLY-VALID-GENLS-ASENTS", 1, 2, false);
        declareFunction(me, "semantically_valid_term_of_unit_asents", "SEMANTICALLY-VALID-TERM-OF-UNIT-ASENTS", 1, 2, false);
        declareFunction(me, "syntactically_valid_term_of_unit_asents", "SYNTACTICALLY-VALID-TERM-OF-UNIT-ASENTS", 1, 1, false);
        declareFunction(me, "valid_term_of_unit_arg1", "VALID-TERM-OF-UNIT-ARG1", 1, 0, false);
        declareFunction(me, "valid_term_of_unit_arg2", "VALID-TERM-OF-UNIT-ARG2", 1, 0, false);
        declareFunction(me, "valid_term_of_unit_args", "VALID-TERM-OF-UNIT-ARGS", 2, 0, false);
        declareFunction(me, "valid_term_of_unit_inter_args", "VALID-TERM-OF-UNIT-INTER-ARGS", 2, 0, false);
        declareFunction(me, "syntactically_valid_term_of_unit_asent", "SYNTACTICALLY-VALID-TERM-OF-UNIT-ASENT", 1, 0, false);
        declareFunction(me, "literal_set_sense", "LITERAL-SET-SENSE", 1, 0, false);
        declareFunction(me, "literal_set_without", "LITERAL-SET-WITHOUT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_backward_file() {
        defparameter("*REMOVAL-ADD-NODE-METHOD*", NIL);
        defparameter("*TRANSFORMATION-ADD-NODE-METHOD*", NIL);
        defparameter("*TRANSFORMATION-EARLY-REMOVAL-THRESHOLD*", EIGHT_INTEGER);
        defparameter("*INFERENCE-EXPAND-NEW-CHILDREN*", NIL);
        defparameter("*INFERENCE-EXPAND-HL-MODULE*", NIL);
        defparameter("*INFERENCE-EXPAND-SENSE*", NIL);
        defparameter("*FORCE-QUERY-SUPPORTS-IN-FORWARD-INFERENCE?*", NIL);
        defparameter("*FORCE-FORWARD-MT-COMBOS-COMPUTATION-IN-FORWARD-INFERENCE?*", NIL);
        defparameter("*DEBUG-REMOVAL-ADD-NODE-HELPER-MODIFY-SUPPORTS?*", NIL);
        deflexical("*REMOVAL-ASK-QUERY-PROPERTIES*", $list21);
        defparameter("*REMOVAL-ASK-ANSWERS*", NIL);
        defparameter("*REMOVAL-ASK-MAX-NUMBER*", NIL);
        defparameter("*REMOVAL-ASK-DISALLOWS-INDETERMINATE-TERMS?*", NIL);
        defparameter("*REMOVAL-ASK-FIRST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*", NIL);
        defparameter("*REMOVAL-ASK-LAST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*", NIL);
        defparameter("*REMOVAL-ASK-START-INTERNAL-REAL-TIME*", NIL);
        defparameter("*TRANSFORMATION-SEMANTIC-PRUNING-ENABLED*", NIL);
        defvar("*FORWARD-INFERENCE-PRUNING-MODE*", $LEGACY);
        defvar("*FORWARD-ASSERTED-SENTENCE-PRUNING-ENABLED?*", T);
        defconstant("*PREDS-WITH-ASSUMED-EXTENT*", $list72);
        deflexical("*LITERAL-SET-SENSE-TABLE*", $list80);
        return NIL;
    }

    public static SubLObject setup_backward_file() {
        register_external_symbol(REMOVAL_ASK);
        declare_control_parameter_internal($transformation_semantic_pruning_enabled$, $str55$Semantic_pruning_of_results_of_ba, $str56$This_controls_whether_or_not_the_, $list57);
        define_test_case_table_int(CLOSED_CONJUNCTIVE_REMOVAL_ASK, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list88);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_backward_file();
    }

    @Override
    public void initializeVariables() {
        init_backward_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_backward_file();
    }

    static {















































































































    }
}

/**
 * Total time: 568 ms
 */
