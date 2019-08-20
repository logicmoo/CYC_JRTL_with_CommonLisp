package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.proof_view;
import com.cyc.cycjava.cycl.proof_view_populator;
import com.cyc.cycjava.cycl.proof_view_summary;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_true_sentence extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "1b9c37a58217121b1f0178f7d11aa2dbe5705595b1dfc192113c8bfb43328957";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 3100L)
    private static SubLSymbol $default_known_sentence_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 4600L)
    public static SubLSymbol $known_sentence_lookahead_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 11100L)
    private static SubLSymbol $default_check_sentence_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 12700L)
    private static SubLSymbol $default_unknown_sentence_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 23700L)
    private static SubLSymbol $default_true_sentence_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 44600L)
    private static SubLSymbol $removal_sentence_justifications_max_justifications_count$;
    private static SubLObject $$unknownSentence;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $QUERY;
    private static SubLObject $$knownSentence;
    private static SubLSymbol $KNOWN_SENTENCE_POS_GAF;
    private static SubLList $list5;
    private static SubLList $list6;
    private static SubLSymbol $PREFERRED;
    private static SubLSymbol $POS;
    private static SubLSymbol $DISPREFERRED;
    private static SubLSymbol $sym10$KNOWN_SENTENCE_POS_GAF_PREFERENCE;
    private static SubLSymbol $REMOVAL_KNOWN_SENTENCE_CHECK;
    private static SubLList $list12;
    private static SubLFloat $float$0_1;
    private static SubLSymbol $REMOVAL_KNOWN_SENTENCE_POS_GAF;
    private static SubLList $list15;
    private static SubLSymbol $COMPLETE;
    private static SubLSymbol $INCOMPLETE;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_KNOWN_SENTENCE_NEG_GAF;
    private static SubLList $list21;
    private static SubLSymbol $FALSE;
    private static SubLObject $$checkSentence;
    private static SubLSymbol $CHECK_SENTENCE_SIBLING;
    private static SubLList $list25;
    private static SubLList $list26;
    private static SubLSymbol $sym27$CHECK_SENTENCE_SIBLING_REQUIRED;
    private static SubLSymbol $REMOVAL_CHECK_SENTENCE_CHECK;
    private static SubLList $list29;
    private static SubLSymbol $sym30$REMOVAL_CHECK_SENTENCE_CHECK_QUERY;
    private static SubLSymbol $NEGATIONPREDS;
    private static SubLList $list32;
    private static SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_CHECK;
    private static SubLList $list34;
    private static SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_CHECK_NEG;
    private static SubLList $list36;
    private static SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_POS_GAF;
    private static SubLList $list38;
    private static SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_NEG_GAF;
    private static SubLList $list40;
    private static SubLObject $$unknownSentenceWRTInferenceMode;
    private static SubLObject $$Shallow_CycInferenceMode;
    private static SubLObject $$Minimal_CycInferenceMode;
    private static SubLObject $$Extended_CycInferenceMode;
    private static SubLInteger $int$100;
    private static SubLInteger $int$1000;
    private static SubLSymbol $SHALLOW;
    private static SubLSymbol $MINIMAL;
    private static SubLSymbol $EXTENDED;
    private static SubLObject $$Maximal_CycInferenceMode;
    private static SubLSymbol $MAXIMAL;
    private static SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_WRT_INFERENCE_MODE_CHECK;
    private static SubLList $list53;
    private static SubLObject $$SpecifiedInferenceModeCluster;
    private static SubLObject $$trueSentence;
    private static SubLSymbol $TRUE_SENTENCE_POS_GAF;
    private static SubLList $list57;
    private static SubLSymbol $sym58$TRUE_SENTENCE_POS_GAF_PREFERENCE;
    private static SubLSymbol $REMOVAL_TRUE_SENTENCE_CHECK;
    private static SubLList $list60;
    private static SubLSymbol $REMOVAL_TRUE_SENTENCE_POS_GAF;
    private static SubLList $list62;
    private static SubLSymbol $REMOVAL_TRUE_SENTENCE_NEG_GAF;
    private static SubLList $list64;
    private static SubLSymbol $REMOVAL_TRUE_SENTENCE_NEG_FALSE;
    private static SubLList $list66;
    private static SubLSymbol $REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION;
    private static SubLList $list68;
    private static SubLSymbol $IGNORE;
    private static SubLSymbol $sym70$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED;
    private static SubLSymbol $sym71$APPEND;
    private static SubLSymbol $sym72$SENTENCE_FREE_VARIABLES;
    private static SubLSymbol $sym73$NEGATE;
    private static SubLObject $$implies;
    private static SubLObject $$and;
    private static SubLList $list76;
    private static SubLSymbol $sym77$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND;
    private static SubLSymbol $REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION;
    private static SubLList $list79;
    private static SubLObject $$memberOfList;
    private static SubLSymbol $sym81$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED;
    private static SubLSymbol $sym82$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND;
    private static SubLSymbol $REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION;
    private static SubLList $list84;
    private static SubLSymbol $sym85$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_;
    private static SubLSymbol $TRUE_DEF;
    private static SubLSymbol $sym87$REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND;
    private static SubLSymbol $ALLOW_INDETERMINATE_RESULTS_;
    private static SubLObject $$sentenceJustifications_Simple;
    private static SubLSymbol $REMOVAL_SENTENCE_JUSTIFICATIONS_SIMPLE;
    private static SubLList $list91;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY;
    private static SubLSymbol $RESULT_UNIQUENESS;
    private static SubLSymbol $PROOF;
    private static SubLSymbol $CONTINUABLE_;
    private static SubLSymbol $MAX_NUMBER;
    private static SubLSymbol $COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static SubLSymbol $MAX_TIME;
    private static SubLSymbol $MAX_TRANSFORMATION_DEPTH;
    private static SubLSymbol $ALLOWED_RULES;
    private static SubLSymbol $ALLOWED_MODULES;
    private static SubLSymbol $sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS;
    private static SubLInteger $int$1024;
    private static SubLObject $$sentenceJustifications_ProofViewS;
    private static SubLSymbol $REMOVAL_SENTENCE_JUSTIFICATIONS_PROOF_VIEW_SUMMARY;
    private static SubLList $list107;
    private static SubLSymbol $sym108$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS;
    private static SubLObject $$tautologyJustification;
    private static SubLSymbol $REMOVAL_TAUTOLOGY_JUSTIFICATION;
    private static SubLList $list111;
    private static SubLSymbol $CONDITIONAL_SENTENCE_;
    private static SubLSymbol $BROWSABLE_;
    private static SubLSymbol $TAUTOLOGY;
    private static SubLObject $$knownSentenceWithProofView;
    private static SubLSymbol $REMOVAL_KNOWNSENTENCEWITHPROOFVIEW;
    private static SubLList $list117;
    private static SubLSymbol $sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW;
    private static SubLObject $$CycProofViewFn;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 700L)
    public static SubLObject removal_complete_asentP(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return inference_completeness_utilities.inference_complete_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 800L)
    public static SubLObject make_truth_sentence_support(SubLObject truth_predicate, SubLObject sentence) {
        if (truth_predicate.eql($$unknownSentence)) {
            SubLObject truth_sentence_formula = el_utilities.make_unary_formula(truth_predicate, sentence);
            SubLObject support = arguments.make_hl_support($OPAQUE, truth_sentence_formula, UNPROVIDED, UNPROVIDED);
            return support;
        }
        return arguments.make_hl_support($QUERY, sentence, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 1200L)
    public static SubLObject make_truth_sentence_supports(SubLObject truth_asent) {
        SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(truth_asent, UNPROVIDED);
        return list(make_known_sentence_support(gaf_sentence));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 1400L)
    public static SubLObject known_sentence_literal_removal_cost(SubLObject asent, SubLObject mt, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = ZERO_INTEGER;
        if (NIL != el_utilities.ist_of_atomic_sentence_p(asent)) {
            thread.resetMultipleValues();
            SubLObject asent_$1 = czer_utilities.unwrap_if_ist_permissive(asent, mt);
            SubLObject mt_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            asent = asent_$1;
            mt = mt_$2;
        }
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = inference_utilities.literal_removal_cost(asent, sense, mt, removal_modules_abduction.abductive_modules_not_allowed_spec());
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 2200L)
    public static SubLObject known_sentence_pos_gaf_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != formula_pattern_match.pattern_matches_formula($list6, gaf_sentence)) {
            return $PREFERRED;
        }
        SubLObject lookahead_preference_level = preference_modules.literal_preference_level_wrt_modules(gaf_sentence, $POS, bindable_vars, strategic_context);
        if (NIL != preference_modules.preference_level_L(lookahead_preference_level, $DISPREFERRED)) {
            return lookahead_preference_level;
        }
        return $PREFERRED;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 3000L)
    public static SubLObject make_known_sentence_support(SubLObject sentence) {
        return make_truth_sentence_support($$knownSentence, sentence);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 3400L)
    public static SubLObject removal_known_sentence_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != removal_known_sentence_check_query(sentence, UNPROVIDED)) {
            SubLObject hl_support = make_known_sentence_support(sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 4500L)
    public static SubLObject removal_known_sentence_check_query(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_recursive_query(sentence, mt, ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 4900L)
    public static SubLObject removal_known_sentence_pos_gaf_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject cost = known_sentence_literal_removal_cost(gaf_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), $POS);
        if (!cost.isZero()) {
            cost = Numbers.add(cost, $known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        if (NIL != variables.fully_bound_p(asent)) {
            cost = Numbers.min(cost, $default_known_sentence_check_cost$.getDynamicValue(thread));
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 5300L)
    public static SubLObject removal_known_sentence_pos_gaf_iterator(SubLObject gaf_sentence) {
        return iteration.new_list_iterator(removal_known_sentence_pos_gaf_query(gaf_sentence, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 6500L)
    public static SubLObject removal_known_sentence_completeness(SubLObject gaf_sentence, SubLObject sense) {
        if (NIL != variables.fully_bound_p(gaf_sentence)) {
            return $COMPLETE;
        }
        if (NIL != formula_pattern_match.pattern_matches_formula($list6, gaf_sentence)) {
            return $COMPLETE;
        }
        SubLObject lookahead_completeness = inference_utilities.literal_removal_completeness(gaf_sentence, sense, UNPROVIDED);
        if (NIL != inference_datastructures_enumerated_types.completeness_L(lookahead_completeness, $INCOMPLETE)) {
            return lookahead_completeness;
        }
        return $COMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 7500L)
    public static SubLObject removal_known_sentence_pos_gaf_query(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_removal_query(asent, mt, $TRUE);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 7600L)
    public static SubLObject removal_known_sentence_neg_gaf_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        SubLObject cost = known_sentence_literal_removal_cost(gaf_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), $NEG);
        if (!cost.isZero()) {
            cost = Numbers.add(cost, $known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        cost = Numbers.min(cost, $default_known_sentence_check_cost$.getDynamicValue(thread));
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 8200L)
    public static SubLObject removal_known_sentence_neg_gaf_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        if (NIL != removal_known_sentence_neg_gaf_query(gaf_sentence, UNPROVIDED)) {
            SubLObject hl_support = make_known_sentence_support(negated_gaf_sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 9300L)
    public static SubLObject removal_known_sentence_neg_gaf_query(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_removal_query(asent, mt, $FALSE);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 9900L)
    public static SubLObject check_sentence_sibling_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_utilities.el_formula_with_operator_p(asent, $$checkSentence)) {
            SubLObject tactic = inference_worker.currently_considered_tactic();
            if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
                SubLObject join_ordered_link = inference_worker_join_ordered.join_ordered_tactic_link(tactic);
                SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
                SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
                SubLObject asent_wrt_supported = bindings.apply_bindings(focal_variable_map, asent);
                SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
                SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
                if (NIL != list_utilities.simple_tree_find($$checkSentence, supported_query)) {
                    SubLObject cdolist_list_var = supported_query;
                    SubLObject contextualized_clause = NIL;
                    contextualized_clause = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject sibling_sense = $NEG;
                        SubLObject index_var = ZERO_INTEGER;
                        SubLObject cdolist_list_var_$3 = clauses.neg_lits(contextualized_clause);
                        SubLObject contextualized_asent = NIL;
                        contextualized_asent = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            SubLObject current;
                            SubLObject datum = current = contextualized_asent;
                            SubLObject sibling_mt = NIL;
                            SubLObject sibling_asent = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list26);
                            sibling_mt = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list26);
                            sibling_asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ($POS == sibling_sense && NIL != el_utilities.el_formula_with_operator_p(sibling_asent, $$checkSentence) && asent_wrt_supported.equal(cycl_utilities.el_formula_arg1(sibling_asent, UNPROVIDED))
                                        && NIL != hlmt.hlmt_equal(mt_relevance_macros.$mt$.getDynamicValue(thread), sibling_mt)) {
                                    return sibling_asent;
                                }
                            } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, $list26);
                            }
                            index_var = Numbers.add(index_var, ONE_INTEGER);
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            contextualized_asent = cdolist_list_var_$3.first();
                        }
                        sibling_sense = $POS;
                        index_var = ZERO_INTEGER;
                        SubLObject cdolist_list_var_$4 = clauses.pos_lits(contextualized_clause);
                        contextualized_asent = NIL;
                        contextualized_asent = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            SubLObject current;
                            SubLObject datum = current = contextualized_asent;
                            SubLObject sibling_mt = NIL;
                            SubLObject sibling_asent = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list26);
                            sibling_mt = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list26);
                            sibling_asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ($POS == sibling_sense && NIL != el_utilities.el_formula_with_operator_p(sibling_asent, $$checkSentence) && asent_wrt_supported.equal(cycl_utilities.el_formula_arg1(sibling_asent, UNPROVIDED))
                                        && NIL != hlmt.hlmt_equal(mt_relevance_macros.$mt$.getDynamicValue(thread), sibling_mt)) {
                                    return sibling_asent;
                                }
                            } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, $list26);
                            }
                            index_var = Numbers.add(index_var, ONE_INTEGER);
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            contextualized_asent = cdolist_list_var_$4.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        contextualized_clause = cdolist_list_var.first();
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 12100L)
    public static SubLObject removal_check_sentence_check_query(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_recursive_query(sentence, mt, ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 12600L)
    public static SubLObject make_unknown_sentence_support(SubLObject sentence) {
        return make_truth_sentence_support($$unknownSentence, sentence);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 13000L)
    public static SubLObject removal_unknown_sentence_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject results = removal_known_sentence_check_query(sentence, UNPROVIDED);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sense == $POS && NIL == results && NIL != validP) {
            SubLObject hl_support = make_unknown_sentence_support(sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        if (sense == $NEG && NIL != results) {
            SubLObject hl_support = arguments.make_hl_support($QUERY, el_utilities.make_unary_formula($$knownSentence, cycl_utilities.sentence_arg1(asent, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            SubLObject negation_preds_support = arguments.make_hl_support($NEGATIONPREDS, $list32, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(hl_support, NIL, list(negation_preds_support));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 15200L)
    public static SubLObject removal_unknown_sentence_pos_gaf_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.min($default_unknown_sentence_check_cost$.getDynamicValue(thread), removal_known_sentence_pos_gaf_cost(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 15600L)
    public static SubLObject removal_unknown_sentence_pos_gaf_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject results = removal_known_sentence_pos_gaf_query(gaf_sentence, UNPROVIDED);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == results && NIL != validP) {
            SubLObject hl_support = make_unknown_sentence_support(gaf_sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 16600L)
    public static SubLObject removal_unknown_sentence_neg_gaf_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.min($default_unknown_sentence_check_cost$.getDynamicValue(thread), removal_known_sentence_neg_gaf_cost(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 17000L)
    public static SubLObject removal_unknown_sentence_neg_gaf_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        if (NIL == removal_known_sentence_neg_gaf_query(gaf_sentence, UNPROVIDED)) {
            SubLObject hl_support = make_unknown_sentence_support(negated_gaf_sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 20300L)
    public static SubLObject make_unknown_sentence_wrt_inference_mode_support(SubLObject sentence) {
        return make_truth_sentence_support($$unknownSentenceWRTInferenceMode, sentence);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 20500L)
    public static SubLObject removal_unknown_sentence_wrt_inference_mode_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mode = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (mode.eql($$Shallow_CycInferenceMode)) {
            return Numbers.multiply(ONE_INTEGER, $default_unknown_sentence_check_cost$.getDynamicValue(thread));
        }
        if (mode.eql($$Minimal_CycInferenceMode)) {
            return Numbers.multiply(TEN_INTEGER, $default_unknown_sentence_check_cost$.getDynamicValue(thread));
        }
        if (mode.eql($$Extended_CycInferenceMode)) {
            return Numbers.multiply($int$100, $default_unknown_sentence_check_cost$.getDynamicValue(thread));
        }
        return Numbers.multiply($int$1000, $default_unknown_sentence_check_cost$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 21300L)
    public static SubLObject removal_unknown_sentence_wrt_inference_mode_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mode = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject _prev_bind_0 = inference_trampolines.$recursive_query_override_properties$.currentBinding(thread);
        try {
            inference_trampolines.$recursive_query_override_properties$.bind(
                    mode.eql(
                            $$Shallow_CycInferenceMode)
                                    ? inference_parameters.query_properties_for_inference_mode($SHALLOW)
                                    : (mode.eql($$Minimal_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode($MINIMAL)
                                            : (mode.eql($$Extended_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode($EXTENDED) : (mode.eql($$Maximal_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode($MAXIMAL) : NIL))),
                    thread);
            SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            thread.resetMultipleValues();
            SubLObject results = removal_known_sentence_check_query(sentence, UNPROVIDED);
            SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == results && NIL != validP) {
                SubLObject hl_support = make_unknown_sentence_support(sentence);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            inference_trampolines.$recursive_query_override_properties$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 22900L)
    public static SubLObject inference_mode_term_p(SubLObject v_term) {
        return isa.isa_in_any_mtP(v_term, $$SpecifiedInferenceModeCluster);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 23400L)
    public static SubLObject true_sentence_pos_gaf_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        return known_sentence_pos_gaf_preference(asent, bindable_vars, strategic_context);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 23600L)
    public static SubLObject make_true_sentence_support(SubLObject sentence) {
        return make_truth_sentence_support($$trueSentence, sentence);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 23900L)
    public static SubLObject removal_true_sentence_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != removal_true_sentence_check_query(sentence, UNPROVIDED)) {
            SubLObject hl_support = make_true_sentence_support(sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 25100L)
    public static SubLObject removal_true_sentence_check_query(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_true_sentence_recursive_query(sentence, mt, ONE_INTEGER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 25300L)
    public static SubLObject removal_true_sentence_pos_gaf_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_known_sentence_pos_gaf_cost(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 25600L)
    public static SubLObject removal_true_sentence_pos_gaf_iterator(SubLObject gaf_sentence) {
        return iteration.new_list_iterator(removal_known_sentence_pos_gaf_query(gaf_sentence, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 26800L)
    public static SubLObject removal_true_sentence_neg_gaf_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_known_sentence_neg_gaf_cost(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 27200L)
    public static SubLObject removal_true_sentence_neg_gaf_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        SubLObject results = removal_known_sentence_neg_gaf_query(gaf_sentence, UNPROVIDED);
        if (NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject substituted_gaf_sentence = bindings.subst_bindings(v_bindings, gaf_sentence);
                SubLObject hl_support = make_true_sentence_support(cycl_utilities.negate(substituted_gaf_sentence));
                backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 29700L)
    public static SubLObject removal_true_sentence_universal_disjunction_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject truesentence = el_utilities.unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (NIL != el_utilities.el_universal_p(subsentence)) {
            subsentence = el_utilities.quantified_sub_sentence(subsentence);
        }
        subsentence = inference_czer.inference_el_dnf(subsentence, mt_relevance_macros.current_mt_relevance_mt(), T);
        if (NIL == el_utilities.formula_with_sequence_varP(subsentence) && NIL != el_utilities.el_disjunction_p(subsentence) && NIL == el_utilities.formula_with_sequence_varP(subsentence)) {
            SubLObject disjunction = subsentence;
            SubLObject literal_disjunct_count = ZERO_INTEGER;
            SubLObject found_a_non_literalP = NIL;
            SubLObject args = cycl_utilities.formula_args(disjunction, $IGNORE);
            SubLObject rest;
            SubLObject disjunct;
            for (rest = NIL, rest = args; NIL == found_a_non_literalP && NIL != rest; rest = rest.rest()) {
                disjunct = rest.first();
                if (NIL != cycl_grammar.cycl_literal_p(disjunct)) {
                    literal_disjunct_count = Numbers.add(literal_disjunct_count, ONE_INTEGER);
                } else {
                    found_a_non_literalP = T;
                }
            }
            if (NIL == found_a_non_literalP && literal_disjunct_count.numGE(TWO_INTEGER)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 31000L)
    public static SubLObject removal_true_sentence_universal_disjunction_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject truesentence = el_utilities.unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (NIL != el_utilities.el_universal_p(subsentence)) {
            subsentence = el_utilities.quantified_sub_sentence(subsentence);
        }
        SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        SubLObject disjunction = clausifier.el_dnf(subsentence, mt_relevance_macros.current_mt_relevance_mt());
        SubLObject cdolist_list_var;
        SubLObject args = cdolist_list_var = cycl_utilities.formula_args(disjunction, $IGNORE);
        SubLObject consequent_disjunct = NIL;
        consequent_disjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject antecedent_disjuncts = Sequences.remove(consequent_disjunct, cycl_utilities.formula_args(disjunction, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject consequent_vars = el_utilities.sentence_free_variables(consequent_disjunct, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject antecedent_vars = Functions.apply(Symbols.symbol_function($sym71$APPEND), Mapping.mapcar($sym72$SENTENCE_FREE_VARIABLES, antecedent_disjuncts));
            SubLObject cdolist_list_var_$5;
            SubLObject vars_to_quantify = cdolist_list_var_$5 = conses_high.set_difference(consequent_vars, antecedent_vars, UNPROVIDED, UNPROVIDED);
            SubLObject var = NIL;
            var = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                consequent_disjunct = el_utilities.make_universal(var, consequent_disjunct);
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                var = cdolist_list_var_$5.first();
            }
            SubLObject antecedent_negated_disjuncts = Mapping.mapcar($sym73$NEGATE, antecedent_disjuncts);
            SubLObject recursive_sentence = list($$implies, reader.bq_cons($$and, append(antecedent_negated_disjuncts, NIL)), consequent_disjunct);
            thread.resetMultipleValues();
            SubLObject results = ask_utilities.inference_recursive_query(recursive_sentence, mt, $list76);
            SubLObject halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason) && NIL != results) {
                SubLObject support = arguments.make_hl_support($QUERY, recursive_sentence, mt, UNPROVIDED);
                backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            consequent_disjunct = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 33900L)
    public static SubLObject removal_true_sentence_member_of_list_implication_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject truesentence = el_utilities.unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (NIL != el_utilities.el_universal_p(subsentence)) {
            subsentence = el_utilities.quantified_sub_sentence(subsentence);
        }
        if (NIL != el_utilities.el_implication_p(subsentence)) {
            subsentence = cycl_utilities.formula_arg1(subsentence, UNPROVIDED);
            if (cycl_utilities.formula_arg0(subsentence).eql($$memberOfList) && NIL != cycl_grammar.el_variable_p(cycl_utilities.formula_arg1(subsentence, UNPROVIDED)) && NIL != el_utilities.el_list_p(cycl_utilities.formula_arg2(subsentence, UNPROVIDED))) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 34900L)
    public static SubLObject removal_true_sentence_member_of_list_implication_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        SubLObject el_list = NIL;
        SubLObject el_var = NIL;
        SubLObject subquery = NIL;
        SubLObject recursive_sentences = NIL;
        thread.resetMultipleValues();
        SubLObject truesentence = el_utilities.unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (NIL != el_utilities.el_universal_p(subsentence)) {
            subsentence = el_utilities.quantified_sub_sentence(subsentence);
        }
        if (NIL != el_utilities.el_implication_p(subsentence)) {
            subquery = cycl_utilities.formula_arg2(subsentence, UNPROVIDED);
            subsentence = cycl_utilities.formula_arg1(subsentence, UNPROVIDED);
            if (cycl_utilities.formula_arg0(subsentence).eql($$memberOfList)) {
                el_var = cycl_utilities.formula_arg1(subsentence, UNPROVIDED);
                el_list = cycl_utilities.formula_arg2(subsentence, UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var = el_utilities.el_list_items(el_list);
        SubLObject el_term = NIL;
        el_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject recursive_sentence = bindings.apply_bindings(bindings.make_variable_bindings(list(el_var), list(el_term)), subquery);
            thread.resetMultipleValues();
            SubLObject results = ask_utilities.inference_recursive_query(recursive_sentence, mt, UNPROVIDED);
            SubLObject halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason) || NIL == results) {
                return NIL;
            }
            recursive_sentences = cons(recursive_sentence, recursive_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            el_term = cdolist_list_var.first();
        }
        backward.removal_add_node(arguments.make_hl_support($QUERY, el_utilities.make_conjunction(recursive_sentences), mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 37100L)
    public static SubLObject inference_enumerable_universal_implication_sentenceP(SubLObject sentence) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject universal_el_vars = destructure_universal_implication(sentence);
        SubLObject antecedent = thread.secondMultipleValue();
        SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != antecedent && NIL != consequent) {
            SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
            antecedent = possibly_canonicalize_sentence_wrt_universal_el_vars(antecedent, universal_el_vars);
            return inference_at_least_backchain_enumerable_sentenceP(antecedent, mt);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 37600L)
    public static SubLObject destructure_universal_implication(SubLObject sentence) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject universal_el_vars = destructure_universal_implication_recursive(sentence, NIL);
        SubLObject antecedent = thread.secondMultipleValue();
        SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(Sequences.nreverse(universal_el_vars), antecedent, consequent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 37900L)
    public static SubLObject destructure_universal_implication_recursive(SubLObject sentence, SubLObject universal_el_vars) {
        if (NIL != el_utilities.el_implication_p(sentence)) {
            SubLObject antecedent = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            SubLObject consequent = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
            return Values.values(universal_el_vars, antecedent, consequent);
        }
        if (NIL != el_utilities.el_universal_p(sentence)) {
            SubLObject universal_el_var = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            SubLObject subsentence = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
            return destructure_universal_implication_recursive(subsentence, cons(universal_el_var, universal_el_vars));
        }
        return Values.values(NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 38400L)
    public static SubLObject removal_true_sentence_enumerable_universal_implication_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        SubLObject universal_implication = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject universal_el_vars = destructure_universal_implication(universal_implication);
        SubLObject antecedent = thread.secondMultipleValue();
        SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject antecedent_query_properties = determine_enumeration_query_properties(antecedent, mt);
        SubLObject consequent_query_properties = determine_decision_query_properties(consequent, mt);
        SubLObject cdolist_list_var;
        SubLObject enumeration_cases = cdolist_list_var = ask_utilities.inference_recursive_query_unique_bindings(antecedent, mt, antecedent_query_properties);
        SubLObject case_bindings = NIL;
        case_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject case_consequent = bindings.apply_bindings(case_bindings, consequent);
            if (NIL == ask_utilities.inference_recursive_query_unique_bindings(case_consequent, mt, consequent_query_properties)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            case_bindings = cdolist_list_var.first();
        }
        SubLObject support = arguments.make_hl_support($OPAQUE, asent, mt, $TRUE_DEF);
        backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 39500L)
    public static SubLObject determine_enumeration_query_properties(SubLObject sentence, SubLObject mt) {
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
        query_properties = conses_high.putf(query_properties, $ALLOW_INDETERMINATE_RESULTS_, NIL);
        return query_properties;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 39800L)
    public static SubLObject determine_decision_query_properties(SubLObject sentence, SubLObject mt) {
        return determine_enumeration_query_properties(sentence, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 39900L)
    public static SubLObject inference_at_least_backchain_enumerable_sentenceP(SubLObject sentence, SubLObject mt) {
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return inference_at_least_backchain_enumerable_asentP(sentence, mt);
        }
        if (NIL != el_utilities.el_conjunction_p(sentence) && NIL != inference_at_least_backchain_enumerable_conjunctionP(sentence, mt)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 40500L)
    public static SubLObject inference_at_least_backchain_enumerable_asentP(SubLObject asent, SubLObject mt) {
        return makeBoolean($COMPLETE == inference_utilities.literal_removal_completeness(asent, $POS, mt) || NIL != inference_completeness_utilities.inference_completely_enumerable_via_backchain_asentP(asent, mt));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 40700L)
    public static SubLObject inference_at_least_backchain_enumerable_conjunctionP(SubLObject el_conjunction, SubLObject mt) {
        SubLObject cdolist_list_var;
        SubLObject conjuncts = cdolist_list_var = cycl_utilities.sentence_args(el_conjunction, UNPROVIDED);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_at_least_backchain_enumerable_sentenceP(conjunct, mt)) {
                SubLObject other_conjuncts = Sequences.remove(conjunct, conjuncts, Symbols.symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject bound_variables = variables.gather_hl_variables(conjunct);
                SubLObject non_complete_witness = NIL;
                if (NIL == non_complete_witness) {
                    SubLObject csome_list_var = other_conjuncts;
                    SubLObject other_conjunct = NIL;
                    other_conjunct = csome_list_var.first();
                    while (NIL == non_complete_witness && NIL != csome_list_var) {
                        if (NIL == inference_at_least_backchain_enumerable_sentenceP(other_conjunct, mt) && NIL == fully_bound_assuming_bindings_p(other_conjunct, bound_variables)) {
                            non_complete_witness = other_conjunct;
                        }
                        csome_list_var = csome_list_var.rest();
                        other_conjunct = csome_list_var.first();
                    }
                }
                if (NIL == non_complete_witness) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 41400L)
    public static SubLObject possibly_canonicalize_sentence_wrt_universal_el_vars(SubLObject sentence, SubLObject universal_el_vars) {
        SubLObject variable_map = new_el_variable_to_non_base_hl_variable_map(universal_el_vars);
        if (NIL != variable_map) {
            sentence = bindings.apply_bindings(variable_map, sentence);
        }
        return sentence;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 41700L)
    public static SubLObject new_el_variable_to_non_base_hl_variable_map(SubLObject el_vars) {
        SubLObject v_bindings = NIL;
        SubLObject list_var = NIL;
        SubLObject el_var = NIL;
        SubLObject index = NIL;
        list_var = el_vars;
        el_var = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
            SubLObject hl_var = variables.get_variable(index);
            v_bindings = bindings.add_variable_binding(el_var, hl_var, v_bindings);
        }
        return unification.non_base_variable_transform(Sequences.nreverse(v_bindings));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 42000L)
    public static SubLObject fully_bound_assuming_bindings_p(SubLObject formula, SubLObject bound_vars) {
        SubLObject formula_vars = variables.gather_hl_variables(formula);
        return conses_high.subsetp(formula_vars, bound_vars, Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 43200L)
    public static SubLObject removal_sentence_justifications_simple_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject results = removal_sentence_justifications_recursive_query(query_sentence, UNPROVIDED);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject justification_sentences = NIL;
        SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$6 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject this_answer;
                SubLObject cdolist_list_var;
                SubLObject this_justification;
                SubLObject original_supports;
                SubLObject supports;
                SubLObject support;
                SubLObject support_sentence;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    this_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(this_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(this_answer)) {
                            this_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                        this_justification = NIL;
                        this_justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            original_supports = inference_datastructures_inference.inference_answer_justification_supports(this_justification);
                            supports = conses_high.copy_list(original_supports);
                            while (NIL != supports) {
                                support = supports.first();
                                supports = supports.rest();
                                support_sentence = ((NIL != assertion_handles.assertion_p(support)) ? uncanonicalizer.assertion_el_formula(support) : arguments.support_sentence(support));
                                if (NIL == assertion_handles.assertion_p(support) && NIL != czer_utilities.equals_elP(query_sentence, support_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    supports = append(arguments.support_justification(support), supports);
                                } else {
                                    justification_sentences = cons(support_sentence, justification_sentences);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            this_justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            SubLObject idx_$7 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$7)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$7);
                SubLObject id2 = NIL;
                SubLObject this_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        this_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject original_supports2 = inference_datastructures_inference.inference_answer_justification_supports(this_justification2);
                            SubLObject supports2 = conses_high.copy_list(original_supports2);
                            while (NIL != supports2) {
                                SubLObject support2 = supports2.first();
                                supports2 = supports2.rest();
                                SubLObject support_sentence2 = (NIL != assertion_handles.assertion_p(support2)) ? uncanonicalizer.assertion_el_formula(support2) : arguments.support_sentence(support2);
                                if (NIL == assertion_handles.assertion_p(support2) && NIL != czer_utilities.equals_elP(query_sentence, support_sentence2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    supports2 = append(arguments.support_justification(support2), supports2);
                                } else {
                                    justification_sentences = cons(support_sentence2, justification_sentences);
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (NIL != justification_sentences) {
            SubLObject answer_sentence = list($$sentenceJustifications_Simple, query_sentence, el_utilities.make_el_extensional_set(justification_sentences));
            SubLObject v_bindings = unification.unify(asent, answer_sentence, T, UNPROVIDED);
            SubLObject hl_support = arguments.make_hl_support($OPAQUE, answer_sentence, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 44800L)
    public static SubLObject removal_sentence_justifications_recursive_query_internal(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference = inference_macros.current_controlling_inference();
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
        query_properties = conses_high.putf(query_properties, $RESULT_UNIQUENESS, $PROOF);
        query_properties = conses_high.putf(query_properties, $CONTINUABLE_, T);
        query_properties = conses_high.putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
        query_properties = conses_high.putf(query_properties, $COMPUTE_ANSWER_JUSTIFICATIONS_, T);
        if (NIL != inference) {
            query_properties = conses_high.putf(query_properties, $MAX_TIME, inference_utilities.inference_property_lookup(inference, $MAX_TIME, UNPROVIDED));
            query_properties = conses_high.putf(query_properties, $MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED));
            query_properties = conses_high.putf(query_properties, $ALLOWED_RULES, inference_datastructures_inference.inference_allowed_rules_list(inference));
            query_properties = conses_high.putf(query_properties, $ALLOWED_MODULES, inference_datastructures_inference.inference_allowed_modules(inference));
        } else {
            query_properties = inference_datastructures_enumerated_types.merge_query_properties(inference_utilities.current_query_properties(), query_properties);
        }
        SubLObject continue_count = ONE_INTEGER;
        thread.resetMultipleValues();
        SubLObject results = ask_utilities.inference_recursive_query(sentence, mt, query_properties);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject recursive_inference = thread.thirdMultipleValue();
        SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        query_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
        while (continue_count.numL($removal_sentence_justifications_max_justifications_count$.getDynamicValue(thread)) && NIL == removal_sentence_justifications_inference_has_good_proofP(recursive_inference) && NIL != inference_datastructures_inference.continuable_inference_p(recursive_inference)) {
            continue_count = Numbers.add(continue_count, ONE_INTEGER);
            thread.resetMultipleValues();
            SubLObject results_$8 = inference_kernel.continue_inference(recursive_inference, query_properties);
            SubLObject halt_reason_$9 = thread.secondMultipleValue();
            SubLObject inference_$10 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            results = results_$8;
            halt_reason = halt_reason_$9;
            inference = inference_$10;
        }
        return Values.values(results, halt_reason, recursive_inference);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 44800L)
    public static SubLObject removal_sentence_justifications_recursive_query(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_sentence_justifications_recursive_query_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(removal_sentence_justifications_recursive_query_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 46600L)
    public static SubLObject removal_sentence_justifications_inference_has_good_proofP(SubLObject inference) {
        SubLObject good_proof_foundP = NIL;
        SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$11 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$11, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$11);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject this_answer;
                SubLObject cdolist_list_var;
                SubLObject this_justification;
                SubLObject cdolist_list_var_$12;
                SubLObject this_proof;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    this_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(this_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(this_answer)) {
                            this_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                        this_justification = NIL;
                        this_justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$12 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification);
                            this_proof = NIL;
                            this_proof = cdolist_list_var_$12.first();
                            while (NIL != cdolist_list_var_$12) {
                                if (NIL == good_proof_foundP) {
                                    good_proof_foundP = list_utilities.sublisp_boolean(removal_sentence_justifications_get_proof_summary_items(this_proof, this_answer));
                                }
                                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                this_proof = cdolist_list_var_$12.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            this_justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            SubLObject idx_$12 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$12)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$12);
                SubLObject id2 = NIL;
                SubLObject this_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        this_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$13 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification2);
                            SubLObject this_proof2 = NIL;
                            this_proof2 = cdolist_list_var_$13.first();
                            while (NIL != cdolist_list_var_$13) {
                                if (NIL == good_proof_foundP) {
                                    good_proof_foundP = list_utilities.sublisp_boolean(removal_sentence_justifications_get_proof_summary_items(this_proof2, this_answer2));
                                }
                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                this_proof2 = cdolist_list_var_$13.first();
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return good_proof_foundP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 47200L)
    public static SubLObject removal_sentence_justifications_get_proof_summary_items_internal(SubLObject proof, SubLObject v_answer) {
        return proof_view_summary.proof_view_get_proof_summary_items(proof_view.construct_inference_proof_view(proof, v_answer, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 47200L)
    public static SubLObject removal_sentence_justifications_get_proof_summary_items(SubLObject proof, SubLObject v_answer) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_sentence_justifications_get_proof_summary_items_internal(proof, v_answer);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS, TWO_INTEGER, $int$1024, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(proof, v_answer);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (proof.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && v_answer.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(removal_sentence_justifications_get_proof_summary_items_internal(proof, v_answer)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(proof, v_answer));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 48400L)
    public static SubLObject removal_sentence_justifications_proof_view_summary_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject results = removal_sentence_justifications_recursive_query(query_sentence, UNPROVIDED);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject justification_sentences = NIL;
        SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$15 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$15, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$15);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject this_answer;
                SubLObject cdolist_list_var;
                SubLObject this_justification;
                SubLObject cdolist_list_var_$16;
                SubLObject this_proof;
                SubLObject raw_items;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    this_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(this_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(this_answer)) {
                            this_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                        this_justification = NIL;
                        this_justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$16 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification);
                            this_proof = NIL;
                            this_proof = cdolist_list_var_$16.first();
                            while (NIL != cdolist_list_var_$16) {
                                if (NIL == justification_sentences) {
                                    raw_items = removal_sentence_justifications_get_proof_summary_items(this_proof, this_answer);
                                    justification_sentences = Mapping.mapcar($sym108$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, raw_items);
                                }
                                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                this_proof = cdolist_list_var_$16.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            this_justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            SubLObject idx_$16 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$16)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$16);
                SubLObject id2 = NIL;
                SubLObject this_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        this_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$17 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification2);
                            SubLObject this_proof2 = NIL;
                            this_proof2 = cdolist_list_var_$17.first();
                            while (NIL != cdolist_list_var_$17) {
                                if (NIL == justification_sentences) {
                                    SubLObject raw_items2 = removal_sentence_justifications_get_proof_summary_items(this_proof2, this_answer2);
                                    justification_sentences = Mapping.mapcar($sym108$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, raw_items2);
                                }
                                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                this_proof2 = cdolist_list_var_$17.first();
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (NIL != justification_sentences) {
            SubLObject answer_sentence = list($$sentenceJustifications_ProofViewS, query_sentence, el_utilities.make_el_list(justification_sentences, UNPROVIDED));
            SubLObject v_bindings = unification.unify(asent, answer_sentence, T, UNPROVIDED);
            SubLObject hl_support = arguments.make_hl_support($OPAQUE, answer_sentence, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 50500L)
    public static SubLObject removal_tautology_justification_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject unquoted_query_sentence = czer_main.unquote_quoted_term(query_sentence, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject justification_sentence = removal_tautology_justification_recursive_query(unquoted_query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread));
        thread.resetMultipleValues();
        if (NIL != justification_sentence) {
            SubLObject answer_sentence = list($$tautologyJustification, query_sentence, justification_sentence);
            SubLObject v_bindings = unification.unify(asent, answer_sentence, T, UNPROVIDED);
            SubLObject hl_support = arguments.make_hl_support($QUERY, answer_sentence, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 51100L)
    public static SubLObject removal_tautology_justification_recursive_query(SubLObject sentence, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
        SubLObject result = NIL;
        query_properties = conses_high.putf(query_properties, $CONDITIONAL_SENTENCE_, T);
        query_properties = conses_high.putf(query_properties, $BROWSABLE_, T);
        thread.resetMultipleValues();
        SubLObject results = ask_utilities.inference_recursive_query(sentence, mt, query_properties);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject recursive_inference = thread.thirdMultipleValue();
        SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ($TAUTOLOGY == halt_reason) {
            SubLObject inference_suspend_status = inference_datastructures_inference.inference_suspend_status(recursive_inference);
            result = el_utilities.quotify_cycl_term(variables.uncanonicalize_hl_vars(conses_high.second(conses_high.second(inference_suspend_status).first())));
        }
        if (NIL != inference_datastructures_inference.inference_p(recursive_inference)) {
            inference_datastructures_inference.destroy_inference(recursive_inference);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 52900L)
    public static SubLObject removal_knownsentencewithproofview_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject query_pv_specification = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject query_pv = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject v_properties = list($BROWSABLE_, T);
        thread.resetMultipleValues();
        SubLObject results = ask_utilities.inference_recursive_query_unique_bindings(query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), v_properties);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject inference = thread.thirdMultipleValue();
        SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$19 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$19, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$19);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject v_bindings;
                SubLObject cdolist_list_var;
                SubLObject justification;
                SubLObject cdolist_list_var_$20;
                SubLObject proof;
                SubLObject raw_pv;
                SubLObject pv_bindings;
                SubLObject all_bindings;
                SubLObject answer_sentence;
                SubLObject hl_support;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        v_bindings = variables.canonicalize_default_el_vars(inference_datastructures_inference.inference_answer_bindings(v_answer));
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                        justification = NIL;
                        justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$20 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                            proof = NIL;
                            proof = cdolist_list_var_$20.first();
                            while (NIL != cdolist_list_var_$20) {
                                raw_pv = removal_knownsentencewithproofview_get_cyc_proof_view(proof, v_answer, query_pv_specification);
                                pv_bindings = unification_utilities.term_unify(query_pv, raw_pv, UNPROVIDED, UNPROVIDED);
                                all_bindings = append(v_bindings, pv_bindings);
                                answer_sentence = bindings.apply_bindings(all_bindings, asent);
                                hl_support = arguments.make_hl_support($OPAQUE, answer_sentence, UNPROVIDED, UNPROVIDED);
                                backward.removal_add_node(hl_support, all_bindings, UNPROVIDED);
                                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                proof = cdolist_list_var_$20.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            SubLObject idx_$20 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$20)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$20);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject v_bindings2 = variables.canonicalize_default_el_vars(inference_datastructures_inference.inference_answer_bindings(v_answer2));
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                        SubLObject justification2 = NIL;
                        justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$21 = inference_datastructures_inference.inference_answer_justification_proofs(justification2);
                            SubLObject proof2 = NIL;
                            proof2 = cdolist_list_var_$21.first();
                            while (NIL != cdolist_list_var_$21) {
                                SubLObject raw_pv2 = removal_knownsentencewithproofview_get_cyc_proof_view(proof2, v_answer2, query_pv_specification);
                                SubLObject pv_bindings2 = unification_utilities.term_unify(query_pv, raw_pv2, UNPROVIDED, UNPROVIDED);
                                SubLObject all_bindings2 = append(v_bindings2, pv_bindings2);
                                SubLObject answer_sentence2 = bindings.apply_bindings(all_bindings2, asent);
                                SubLObject hl_support2 = arguments.make_hl_support($OPAQUE, answer_sentence2, UNPROVIDED, UNPROVIDED);
                                backward.removal_add_node(hl_support2, all_bindings2, UNPROVIDED);
                                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                proof2 = cdolist_list_var_$21.first();
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            justification2 = cdolist_list_var2.first();
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 54100L)
    public static SubLObject removal_knownsentencewithproofview_get_cyc_proof_view_internal(SubLObject proof, SubLObject v_answer, SubLObject pv_specification) {
        SubLObject v_proof_view = proof_view.get_new_empty_proof_view(v_answer, proof);
        proof_view.proof_view_set_parameters_from_specification(v_proof_view, pv_specification);
        proof_view_populator.proof_view_populate(v_proof_view, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return el_utilities.make_unary_formula($$CycProofViewFn, proof_view.proof_view_get_id(v_proof_view));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 54100L)
    public static SubLObject removal_knownsentencewithproofview_get_cyc_proof_view(SubLObject proof, SubLObject v_answer, SubLObject pv_specification) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_knownsentencewithproofview_get_cyc_proof_view_internal(proof, v_answer, pv_specification);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW, THREE_INTEGER, $int$1024, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(proof, v_answer, pv_specification);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (proof.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_answer.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && pv_specification.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(removal_knownsentencewithproofview_get_cyc_proof_view_internal(proof, v_answer, pv_specification)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(proof, v_answer, pv_specification));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_removal_modules_true_sentence_file() {
        declareFunction("removal_complete_asentP", "REMOVAL-COMPLETE-ASENT?", 1, 0, false);
        declareFunction("make_truth_sentence_support", "MAKE-TRUTH-SENTENCE-SUPPORT", 2, 0, false);
        declareFunction("make_truth_sentence_supports", "MAKE-TRUTH-SENTENCE-SUPPORTS", 1, 0, false);
        declareFunction("known_sentence_literal_removal_cost", "KNOWN-SENTENCE-LITERAL-REMOVAL-COST", 3, 0, false);
        declareFunction("known_sentence_pos_gaf_preference", "KNOWN-SENTENCE-POS-GAF-PREFERENCE", 3, 0, false);
        declareFunction("make_known_sentence_support", "MAKE-KNOWN-SENTENCE-SUPPORT", 1, 0, false);
        declareFunction("removal_known_sentence_check_expand", "REMOVAL-KNOWN-SENTENCE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_known_sentence_check_query", "REMOVAL-KNOWN-SENTENCE-CHECK-QUERY", 1, 1, false);
        declareFunction("removal_known_sentence_pos_gaf_cost", "REMOVAL-KNOWN-SENTENCE-POS-GAF-COST", 1, 1, false);
        declareFunction("removal_known_sentence_pos_gaf_iterator", "REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR", 1, 0, false);
        declareFunction("removal_known_sentence_completeness", "REMOVAL-KNOWN-SENTENCE-COMPLETENESS", 2, 0, false);
        declareFunction("removal_known_sentence_pos_gaf_query", "REMOVAL-KNOWN-SENTENCE-POS-GAF-QUERY", 1, 1, false);
        declareFunction("removal_known_sentence_neg_gaf_cost", "REMOVAL-KNOWN-SENTENCE-NEG-GAF-COST", 1, 1, false);
        declareFunction("removal_known_sentence_neg_gaf_expand", "REMOVAL-KNOWN-SENTENCE-NEG-GAF-EXPAND", 1, 1, false);
        declareFunction("removal_known_sentence_neg_gaf_query", "REMOVAL-KNOWN-SENTENCE-NEG-GAF-QUERY", 1, 1, false);
        declareFunction("check_sentence_sibling_required", "CHECK-SENTENCE-SIBLING-REQUIRED", 1, 0, false);
        declareFunction("removal_check_sentence_check_query", "REMOVAL-CHECK-SENTENCE-CHECK-QUERY", 1, 1, false);
        declareFunction("make_unknown_sentence_support", "MAKE-UNKNOWN-SENTENCE-SUPPORT", 1, 0, false);
        declareFunction("removal_unknown_sentence_check_expand", "REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_unknown_sentence_pos_gaf_cost", "REMOVAL-UNKNOWN-SENTENCE-POS-GAF-COST", 1, 1, false);
        declareFunction("removal_unknown_sentence_pos_gaf_expand", "REMOVAL-UNKNOWN-SENTENCE-POS-GAF-EXPAND", 1, 1, false);
        declareFunction("removal_unknown_sentence_neg_gaf_cost", "REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-COST", 1, 1, false);
        declareFunction("removal_unknown_sentence_neg_gaf_expand", "REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-EXPAND", 1, 1, false);
        declareFunction("make_unknown_sentence_wrt_inference_mode_support", "MAKE-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-SUPPORT", 1, 0, false);
        declareFunction("removal_unknown_sentence_wrt_inference_mode_check_cost", "REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-COST", 1, 1, false);
        declareFunction("removal_unknown_sentence_wrt_inference_mode_check_expand", "REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-EXPAND", 1, 1, false);
        declareFunction("inference_mode_term_p", "INFERENCE-MODE-TERM-P", 1, 0, false);
        declareFunction("true_sentence_pos_gaf_preference", "TRUE-SENTENCE-POS-GAF-PREFERENCE", 3, 0, false);
        declareFunction("make_true_sentence_support", "MAKE-TRUE-SENTENCE-SUPPORT", 1, 0, false);
        declareFunction("removal_true_sentence_check_expand", "REMOVAL-TRUE-SENTENCE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_true_sentence_check_query", "REMOVAL-TRUE-SENTENCE-CHECK-QUERY", 1, 1, false);
        declareFunction("removal_true_sentence_pos_gaf_cost", "REMOVAL-TRUE-SENTENCE-POS-GAF-COST", 1, 1, false);
        declareFunction("removal_true_sentence_pos_gaf_iterator", "REMOVAL-TRUE-SENTENCE-POS-GAF-ITERATOR", 1, 0, false);
        declareFunction("removal_true_sentence_neg_gaf_cost", "REMOVAL-TRUE-SENTENCE-NEG-GAF-COST", 1, 1, false);
        declareFunction("removal_true_sentence_neg_gaf_expand", "REMOVAL-TRUE-SENTENCE-NEG-GAF-EXPAND", 1, 1, false);
        declareFunction("removal_true_sentence_universal_disjunction_required", "REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED", 1, 1, false);
        declareFunction("removal_true_sentence_universal_disjunction_expand", "REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND", 1, 1, false);
        declareFunction("removal_true_sentence_member_of_list_implication_required", "REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED", 1, 1, false);
        declareFunction("removal_true_sentence_member_of_list_implication_expand", "REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND", 1, 1, false);
        declareFunction("inference_enumerable_universal_implication_sentenceP", "INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?", 1, 0, false);
        declareFunction("destructure_universal_implication", "DESTRUCTURE-UNIVERSAL-IMPLICATION", 1, 0, false);
        declareFunction("destructure_universal_implication_recursive", "DESTRUCTURE-UNIVERSAL-IMPLICATION-RECURSIVE", 2, 0, false);
        declareFunction("removal_true_sentence_enumerable_universal_implication_expand", "REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND", 1, 1, false);
        declareFunction("determine_enumeration_query_properties", "DETERMINE-ENUMERATION-QUERY-PROPERTIES", 2, 0, false);
        declareFunction("determine_decision_query_properties", "DETERMINE-DECISION-QUERY-PROPERTIES", 2, 0, false);
        declareFunction("inference_at_least_backchain_enumerable_sentenceP", "INFERENCE-AT-LEAST-BACKCHAIN-ENUMERABLE-SENTENCE?", 2, 0, false);
        declareFunction("inference_at_least_backchain_enumerable_asentP", "INFERENCE-AT-LEAST-BACKCHAIN-ENUMERABLE-ASENT?", 2, 0, false);
        declareFunction("inference_at_least_backchain_enumerable_conjunctionP", "INFERENCE-AT-LEAST-BACKCHAIN-ENUMERABLE-CONJUNCTION?", 2, 0, false);
        declareFunction("possibly_canonicalize_sentence_wrt_universal_el_vars", "POSSIBLY-CANONICALIZE-SENTENCE-WRT-UNIVERSAL-EL-VARS", 2, 0, false);
        declareFunction("new_el_variable_to_non_base_hl_variable_map", "NEW-EL-VARIABLE-TO-NON-BASE-HL-VARIABLE-MAP", 1, 0, false);
        declareFunction("fully_bound_assuming_bindings_p", "FULLY-BOUND-ASSUMING-BINDINGS-P", 2, 0, false);
        declareFunction("removal_sentence_justifications_simple_expand", "REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE-EXPAND", 1, 1, false);
        declareFunction("removal_sentence_justifications_recursive_query_internal", "REMOVAL-SENTENCE-JUSTIFICATIONS-RECURSIVE-QUERY-INTERNAL", 1, 1, false);
        declareFunction("removal_sentence_justifications_recursive_query", "REMOVAL-SENTENCE-JUSTIFICATIONS-RECURSIVE-QUERY", 1, 1, false);
        declareFunction("removal_sentence_justifications_inference_has_good_proofP", "REMOVAL-SENTENCE-JUSTIFICATIONS-INFERENCE-HAS-GOOD-PROOF?", 1, 0, false);
        declareFunction("removal_sentence_justifications_get_proof_summary_items_internal", "REMOVAL-SENTENCE-JUSTIFICATIONS-GET-PROOF-SUMMARY-ITEMS-INTERNAL", 2, 0, false);
        declareFunction("removal_sentence_justifications_get_proof_summary_items", "REMOVAL-SENTENCE-JUSTIFICATIONS-GET-PROOF-SUMMARY-ITEMS", 2, 0, false);
        declareFunction("removal_sentence_justifications_proof_view_summary_expand", "REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY-EXPAND", 1, 1, false);
        declareFunction("removal_tautology_justification_expand", "REMOVAL-TAUTOLOGY-JUSTIFICATION-EXPAND", 1, 1, false);
        declareFunction("removal_tautology_justification_recursive_query", "REMOVAL-TAUTOLOGY-JUSTIFICATION-RECURSIVE-QUERY", 2, 0, false);
        declareFunction("removal_knownsentencewithproofview_expand", "REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-EXPAND", 1, 1, false);
        declareFunction("removal_knownsentencewithproofview_get_cyc_proof_view_internal", "REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-GET-CYC-PROOF-VIEW-INTERNAL", 3, 0, false);
        declareFunction("removal_knownsentencewithproofview_get_cyc_proof_view", "REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-GET-CYC-PROOF-VIEW", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_true_sentence_file() {
        $default_known_sentence_check_cost$ = defparameter("*DEFAULT-KNOWN-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        $known_sentence_lookahead_cost$ = defparameter("*KNOWN-SENTENCE-LOOKAHEAD-COST*", $float$0_1);
        $default_check_sentence_check_cost$ = defparameter("*DEFAULT-CHECK-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        $default_unknown_sentence_check_cost$ = defparameter("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*", $default_known_sentence_check_cost$.getDynamicValue());
        $default_true_sentence_check_cost$ = defparameter("*DEFAULT-TRUE-SENTENCE-CHECK-COST*", $default_known_sentence_check_cost$.getDynamicValue());
        $removal_sentence_justifications_max_justifications_count$ = SubLFiles.defparameter("*REMOVAL-SENTENCE-JUSTIFICATIONS-MAX-JUSTIFICATIONS-COUNT*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_true_sentence_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$knownSentence);
        preference_modules.inference_preference_module($KNOWN_SENTENCE_POS_GAF, $list5);
        utilities_macros.note_funcall_helper_function($sym10$KNOWN_SENTENCE_POS_GAF_PREFERENCE);
        inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_CHECK, $list12);
        inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_POS_GAF, $list15);
        inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_NEG_GAF, $list21);
        inference_modules.register_solely_specific_removal_module_predicate($$checkSentence);
        preference_modules.doomed_unless_all_args_bindable($POS, $$checkSentence);
        preference_modules.inference_preference_module($CHECK_SENTENCE_SIBLING, $list25);
        utilities_macros.note_funcall_helper_function($sym27$CHECK_SENTENCE_SIBLING_REQUIRED);
        inference_modules.inference_removal_module($REMOVAL_CHECK_SENTENCE_CHECK, $list29);
        utilities_macros.note_funcall_helper_function($sym30$REMOVAL_CHECK_SENTENCE_CHECK_QUERY);
        inference_modules.register_solely_specific_removal_module_predicate($$unknownSentence);
        preference_modules.doomed_unless_all_args_bindable($POS, $$unknownSentence);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_CHECK, $list34);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_CHECK_NEG, $list36);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_POS_GAF, $list38);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_NEG_GAF, $list40);
        inference_modules.register_solely_specific_removal_module_predicate($$unknownSentenceWRTInferenceMode);
        preference_modules.doomed_unless_all_args_bindable($POS, $$unknownSentenceWRTInferenceMode);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_WRT_INFERENCE_MODE_CHECK, $list53);
        inference_modules.register_solely_specific_removal_module_predicate($$trueSentence);
        preference_modules.inference_preference_module($TRUE_SENTENCE_POS_GAF, $list57);
        utilities_macros.note_funcall_helper_function($sym58$TRUE_SENTENCE_POS_GAF_PREFERENCE);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_CHECK, $list60);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_POS_GAF, $list62);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_GAF, $list64);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_FALSE, $list66);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION, $list68);
        utilities_macros.note_funcall_helper_function($sym70$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED);
        utilities_macros.note_funcall_helper_function($sym77$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION, $list79);
        utilities_macros.note_funcall_helper_function($sym81$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED);
        utilities_macros.note_funcall_helper_function($sym82$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION, $list84);
        utilities_macros.note_funcall_helper_function($sym85$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_);
        utilities_macros.note_funcall_helper_function($sym87$REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND);
        inference_modules.register_solely_specific_removal_module_predicate($$sentenceJustifications_Simple);
        preference_modules.doomed_unless_arg_bindable($POS, $$sentenceJustifications_Simple, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SENTENCE_JUSTIFICATIONS_SIMPLE, $list91);
        memoization_state.note_memoized_function($sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY);
        memoization_state.note_memoized_function($sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS);
        inference_modules.register_solely_specific_removal_module_predicate($$sentenceJustifications_ProofViewS);
        preference_modules.doomed_unless_arg_bindable($POS, $$sentenceJustifications_ProofViewS, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SENTENCE_JUSTIFICATIONS_PROOF_VIEW_SUMMARY, $list107);
        inference_modules.register_solely_specific_removal_module_predicate($$tautologyJustification);
        preference_modules.doomed_unless_arg_bindable($POS, $$tautologyJustification, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TAUTOLOGY_JUSTIFICATION, $list111);
        inference_modules.register_solely_specific_removal_module_predicate($$knownSentenceWithProofView);
        preference_modules.doomed_unless_arg_bindable($POS, $$knownSentenceWithProofView, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_KNOWNSENTENCEWITHPROOFVIEW, $list117);
        memoization_state.note_memoized_function($sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_true_sentence_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_true_sentence_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_true_sentence_file();
    }

    static {
        me = new removal_modules_true_sentence();
        $default_known_sentence_check_cost$ = null;
        $known_sentence_lookahead_cost$ = null;
        $default_check_sentence_check_cost$ = null;
        $default_unknown_sentence_check_cost$ = null;
        $default_true_sentence_check_cost$ = null;
        $removal_sentence_justifications_max_justifications_count$ = null;
        $$unknownSentence = makeConstSym(("unknownSentence"));
        $OPAQUE = makeKeyword("OPAQUE");
        $QUERY = makeKeyword("QUERY");
        $$knownSentence = makeConstSym(("knownSentence"));
        $KNOWN_SENTENCE_POS_GAF = makeKeyword("KNOWN-SENTENCE-POS-GAF");
        $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("knownSentence")), makeKeyword("PREFERENCE"), makeSymbol("KNOWN-SENTENCE-POS-GAF-PREFERENCE"));
        $list6 = list(makeConstSym(("isa")), makeKeyword("VARIABLE"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ADMITTING-DEFNS?")))));
        $PREFERRED = makeKeyword("PREFERRED");
        $POS = makeKeyword("POS");
        $DISPREFERRED = makeKeyword("DISPREFERRED");
        $sym10$KNOWN_SENTENCE_POS_GAF_PREFERENCE = makeSymbol("KNOWN-SENTENCE-POS-GAF-PREFERENCE");
        $REMOVAL_KNOWN_SENTENCE_CHECK = makeKeyword("REMOVAL-KNOWN-SENTENCE-CHECK");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("knownSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("knownSentence")),
                        list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))),
                                list(makeKeyword("NOT"), list(makeConstSym(("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")))))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-KNOWN-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KNOWN-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$knownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $float$0_1 = makeDouble(0.1);
        $REMOVAL_KNOWN_SENTENCE_POS_GAF = makeKeyword("REMOVAL-KNOWN-SENTENCE-POS-GAF");
        $list15 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("knownSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("knownSentence")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-COST"), makeKeyword("COMPLETENESS-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("knownSentence")), list(makeKeyword("BIND"), makeSymbol("GAF-SENTENCE"))), list(makeKeyword("CALL"), makeSymbol("REMOVAL-KNOWN-SENTENCE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")), makeKeyword("POS"))),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("knownSentence")), list(makeKeyword("BIND"), makeSymbol("GAF-SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("knownSentence")), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$knownSentence \n     (#$genls ?SPEC #$BinaryRelation))") });
        $COMPLETE = makeKeyword("COMPLETE");
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $TRUE = makeKeyword("TRUE");
        $NEG = makeKeyword("NEG");
        $REMOVAL_KNOWN_SENTENCE_NEG_GAF = makeKeyword("REMOVAL-KNOWN-SENTENCE-NEG-GAF");
        $list21 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("knownSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("knownSentence")), list(makeConstSym(("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-KNOWN-SENTENCE-NEG-GAF-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KNOWN-SENTENCE-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$knownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"),
                makeString("(#$knownSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $FALSE = makeKeyword("FALSE");
        $$checkSentence = makeConstSym(("checkSentence"));
        $CHECK_SENTENCE_SIBLING = makeKeyword("CHECK-SENTENCE-SIBLING");
        $list25 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("TEST"), makeSymbol("CHECK-SENTENCE-SIBLING-REQUIRED")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $list26 = list(makeSymbol("SIBLING-MT"), makeSymbol("SIBLING-ASENT"));
        $sym27$CHECK_SENTENCE_SIBLING_REQUIRED = makeSymbol("CHECK-SENTENCE-SIBLING-REQUIRED");
        $REMOVAL_CHECK_SENTENCE_CHECK = makeKeyword("REMOVAL-CHECK-SENTENCE-CHECK");
        $list29 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("checkSentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("checkSentence")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), makeKeyword("SENTENCE"))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CHECK-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("checkSentence")), list(makeKeyword("BIND"), makeSymbol("SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("SENTENCE"))), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-CHECK-SENTENCE-CHECK-QUERY"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("QUERY"), makeKeyword("DOCUMENTATION"),
                makeString("(#$checkSentence <sentence>)\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$checkSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $sym30$REMOVAL_CHECK_SENTENCE_CHECK_QUERY = makeSymbol("REMOVAL-CHECK-SENTENCE-CHECK-QUERY");
        $NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
        $list32 = list(makeConstSym(("negationPreds")), makeConstSym(("knownSentence")), makeConstSym(("unknownSentence")));
        $REMOVAL_UNKNOWN_SENTENCE_CHECK = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-CHECK");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("unknownSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("unknownSentence")),
                        list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))),
                                list(makeKeyword("NOT"), list(makeConstSym(("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$unknownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });
        $REMOVAL_UNKNOWN_SENTENCE_CHECK_NEG = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-CHECK-NEG");
        $list36 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("unknownSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("unknownSentence")), list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$unknownSentence (<non-predicate> . <fully-bound>)))\n    by recursively querying sentence\n    and succeeding if the query succeeds"),
                makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$unknownSentence\n      (#$thereExists ?PRED\n       (?PRED #$Collection #$Predicate))))") });
        $REMOVAL_UNKNOWN_SENTENCE_POS_GAF = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-POS-GAF");
        $list38 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("unknownSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("unknownSentence")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-POS-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-POS-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (<predicate> . <fully-bound>))\n    by recursively querying sentence (<predicate> . <fully-bound>)\n    and succeeding if it fails"),
                makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$arg1Isa #$isa #$Microtheory))") });
        $REMOVAL_UNKNOWN_SENTENCE_NEG_GAF = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("unknownSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("unknownSentence")), list(makeConstSym(("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$unknownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if it fails"), makeKeyword("EXAMPLE"),
                makeString("(#$unknownSentence\n     (#$not (#$isa #$myCreator #$DefaultMonotonicPredicate)))") });
        $$unknownSentenceWRTInferenceMode = makeConstSym(("unknownSentenceWRTInferenceMode"));
        $$Shallow_CycInferenceMode = makeConstSym(("Shallow-CycInferenceMode"));
        $$Minimal_CycInferenceMode = makeConstSym(("Minimal-CycInferenceMode"));
        $$Extended_CycInferenceMode = makeConstSym(("Extended-CycInferenceMode"));
        $int$100 = makeInteger(100);
        $int$1000 = makeInteger(1000);
        $SHALLOW = makeKeyword("SHALLOW");
        $MINIMAL = makeKeyword("MINIMAL");
        $EXTENDED = makeKeyword("EXTENDED");
        $$Maximal_CycInferenceMode = makeConstSym(("Maximal-CycInferenceMode"));
        $MAXIMAL = makeKeyword("MAXIMAL");
        $REMOVAL_UNKNOWN_SENTENCE_WRT_INFERENCE_MODE_CHECK = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK");
        $list53 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("unknownSentenceWRTInferenceMode")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("unknownSentenceWRTInferenceMode")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-MODE-TERM-P")), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$unknownSentenceWRTInferenceMode <inference-mode-term-p> <fully-bound>)\n    by recursively querying sentence <fully-bound> using the provided inference mode."), makeKeyword("EXAMPLE"),
                makeString("(#$unknownSentenceWRTInferenceMode #$Shallow-CycInferenceMode\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });
        $$SpecifiedInferenceModeCluster = makeConstSym(("SpecifiedInferenceModeCluster"));
        $$trueSentence = makeConstSym(("trueSentence"));
        $TRUE_SENTENCE_POS_GAF = makeKeyword("TRUE-SENTENCE-POS-GAF");
        $list57 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("trueSentence")), makeKeyword("PREFERENCE"), makeSymbol("TRUE-SENTENCE-POS-GAF-PREFERENCE"));
        $sym58$TRUE_SENTENCE_POS_GAF_PREFERENCE = makeSymbol("TRUE-SENTENCE-POS-GAF-PREFERENCE");
        $REMOVAL_TRUE_SENTENCE_CHECK = makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK");
        $list60 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("trueSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"),
                        list(makeConstSym(("trueSentence")),
                                list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))),
                                        list(makeKeyword("NOT"), list(makeConstSym(("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")))))),
                        list(makeConstSym(("trueSentence")), makeConstSym(("True")))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRUE-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$trueSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence\n     (#$thereExists ?COL\n      (#$disjointWith #$Collection ?COL)))") });
        $REMOVAL_TRUE_SENTENCE_POS_GAF = makeKeyword("REMOVAL-TRUE-SENTENCE-POS-GAF");
        $list62 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("trueSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("trueSentence")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-TRUE-SENTENCE-POS-GAF-COST"), makeKeyword("COMPLETENESS-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("trueSentence")), list(makeKeyword("BIND"), makeSymbol("GAF-SENTENCE"))), list(makeKeyword("CALL"), makeSymbol("REMOVAL-KNOWN-SENTENCE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")), makeKeyword("POS"))),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("trueSentence")), list(makeKeyword("BIND"), makeSymbol("GAF-SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("trueSentence")), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$trueSentence \n     (#$isa #$Predicate ?WHAT))") });
        $REMOVAL_TRUE_SENTENCE_NEG_GAF = makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-GAF");
        $list64 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("trueSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("trueSentence")), list(makeConstSym(("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-TRUE-SENTENCE-NEG-GAF-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))"),
                makeKeyword("EXAMPLE"), makeString("(#$trueSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $REMOVAL_TRUE_SENTENCE_NEG_FALSE = makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-FALSE");
        $list66 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("trueSentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("trueSentence")), makeConstSym(("False"))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), T, makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), list(makeSymbol("QUOTE"), list(makeConstSym(("trueSentence")), makeConstSym(("True"))))),
                makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence #$False)") });
        $REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION = makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION");
        $list68 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("trueSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("trueSentence")), list(makeConstSym(("forAll")), list(makeKeyword("TEST"), makeSymbol("EL-VARIABLE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED"), makeKeyword("EXCLUSIVE"),
                makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND"), makeKeyword("EXAMPLE"), makeString(
                        "(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence \n      (#$not \n       (#$thereExists ?EATER \n        (#$thereExists ?EATING \n         (#$and \n          (#$isa ?EATING #$EatingEvent) \n          (#$consumedObject ?EATING ?EATER) \n          (#$doneBy ?EATING ?EATER)))))))") });
        $IGNORE = makeKeyword("IGNORE");
        $sym70$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED = makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED");
        $sym71$APPEND = makeSymbol("APPEND");
        $sym72$SENTENCE_FREE_VARIABLES = makeSymbol("SENTENCE-FREE-VARIABLES");
        $sym73$NEGATE = makeSymbol("NEGATE");
        $$implies = makeConstSym(("implies"));
        $$and = makeConstSym(("and"));
        $list76 = list(makeKeyword("CONDITIONAL-SENTENCE?"), T);
        $sym77$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND = makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND");
        $REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION = makeKeyword("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION");
        $list79 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("trueSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("trueSentence")), list(makeConstSym(("forAll")), list(makeKeyword("TEST"), makeSymbol("EL-VARIABLE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED"), makeKeyword("EXCLUSIVE"),
                makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND"), makeKeyword("EXAMPLE"), makeString(
                        "(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence\n      (#$forAll ?PRED\n       (#$implies\n        (#$memberOfList ?PRED\n         (#$TheList #$fieldsOfCompetence \n \t\t    #$primarySupervisor\n \t\t    (#$IsaPredFn #$ProjectManager)\n \t\t    (#$IsaPredFn #$OntologicalEngineer)\n \t\t    (#$IsaPredFn #$ComputerProgrammer) #$fieldsOfCompetence))\n        (#$thereExists ?CONSTRAINT\n \t (#$thereExists ?M\n          (#$argIsa ?PRED ?M ?CONSTRAINT)))))))") });
        $$memberOfList = makeConstSym(("memberOfList"));
        $sym81$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED = makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED");
        $sym82$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND = makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND");
        $REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION = makeKeyword("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION");
        $list84 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("trueSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("trueSentence")),
                        list(makeKeyword("AND"), list(makeConstSym(("forAll")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("TREE-FIND"), makeConstSym(("implies"))), list(makeKeyword("TEST"), makeSymbol("INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?")))),
                makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND"), makeKeyword("EXAMPLE"),
                makeString("(#$ist #$UniversalVocabularyMt\n     (#$trueSentence\n      (#$forAll ?N\n       (#$implies\n        (#$elementOf ?N (#$TheSet 0 1))\n        (#$evaluate ?N (#$TimesFn ?N ?N))))))") });
        $sym85$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_ = makeSymbol("INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?");
        $TRUE_DEF = makeKeyword("TRUE-DEF");
        $sym87$REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND = makeSymbol("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND");
        $ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $$sentenceJustifications_Simple = makeConstSym(("sentenceJustifications-Simple"));
        $REMOVAL_SENTENCE_JUSTIFICATIONS_SIMPLE = makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE");
        $list91 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("sentenceJustifications-Simple")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("sentenceJustifications-Simple")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                        makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE-EXPAND"), makeKeyword("DOCUMENTATION"),
                        makeString("(#$sentenceJustifications-Simple <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"),
                        makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-Simple (#$genls #$Dog #$Animal) ?WHY))") });
        $SKIP = makeKeyword("SKIP");
        $sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY = makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-RECURSIVE-QUERY");
        $RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
        $PROOF = makeKeyword("PROOF");
        $CONTINUABLE_ = makeKeyword("CONTINUABLE?");
        $MAX_NUMBER = makeKeyword("MAX-NUMBER");
        $COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $MAX_TIME = makeKeyword("MAX-TIME");
        $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
        $ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
        $sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS = makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-GET-PROOF-SUMMARY-ITEMS");
        $int$1024 = makeInteger(1024);
        $$sentenceJustifications_ProofViewS = makeConstSym(("sentenceJustifications-ProofViewSummary"));
        $REMOVAL_SENTENCE_JUSTIFICATIONS_PROOF_VIEW_SUMMARY = makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY");
        $list107 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("sentenceJustifications-ProofViewSummary")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("sentenceJustifications-ProofViewSummary")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$sentenceJustifications-ProofViewSummary <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"),
                makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-ProofViewSummary (#$genls #$Dog #$Animal) ?WHY))") });
        $sym108$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS = makeSymbol("PROOF-VIEW-FACT-SENTENCE-WITH-HL-TERMS");
        $$tautologyJustification = makeConstSym(("tautologyJustification"));
        $REMOVAL_TAUTOLOGY_JUSTIFICATION = makeKeyword("REMOVAL-TAUTOLOGY-JUSTIFICATION");
        $list111 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("tautologyJustification")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("tautologyJustification")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TAUTOLOGY-JUSTIFICATION-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$tautologyJustification <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"),
                makeString("(#$ist #$UniversalVocabularyMt\n     (#$tautologyJustification (#$genls #$Dog #$Animal) ?WHY))") });
        $CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
        $BROWSABLE_ = makeKeyword("BROWSABLE?");
        $TAUTOLOGY = makeKeyword("TAUTOLOGY");
        $$knownSentenceWithProofView = makeConstSym(("knownSentenceWithProofView"));
        $REMOVAL_KNOWNSENTENCEWITHPROOFVIEW = makeKeyword("REMOVAL-KNOWNSENTENCEWITHPROOFVIEW");
        $list117 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("knownSentenceWithProofView")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("knownSentenceWithProofView")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$knownSentenceWithProofView <anything> <fully-bound-p> <anything>)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"),
                makeString("(#$ist #$UniversalVocabularyMt\n     (#$knownSentenceWithProofView (#$genls #$Dog #$Animal) ?WHY))") });
        $sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW = makeSymbol("REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-GET-CYC-PROOF-VIEW");
        $$CycProofViewFn = makeConstSym(("CycProofViewFn"));
    }
}
/*
 *
 * Total time: 563 ms
 *
 */