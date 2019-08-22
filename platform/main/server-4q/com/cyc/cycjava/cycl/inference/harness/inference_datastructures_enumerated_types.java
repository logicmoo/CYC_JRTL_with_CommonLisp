package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.control_vars.$complete_extent_minimization$;
import static com.cyc.cycjava.cycl.control_vars.$default_removal_cost_cutoff$;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_datastructures_enumerated_types extends SubLTranslatedFile {
    public static final SubLFile me = new inference_datastructures_enumerated_types();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types";

    public static final String myFingerPrint = "8d0cf9bbcec6bb641bac6468b8957449605a5e104af755f585416598dc1cbc57";

    // deflexical
    /**
     * The set of metrics that have special code support in @xref
     * inference-compute-metrics instead of being declared via @xref
     * declare-inference-metric.
     */
    private static final SubLSymbol $specially_handled_inference_metrics$ = makeSymbol("*SPECIALLY-HANDLED-INFERENCE-METRICS*");

    // deflexical
    /**
     * The set of metrics that are not to be gathered from the inference object.
     * These are also not declared via @xref declare-inference-metric.
     */
    private static final SubLSymbol $non_inference_query_metrics$ = makeSymbol("*NON-INFERENCE-QUERY-METRICS*");

    // deflexical
    private static final SubLSymbol $arete_query_metrics$ = makeSymbol("*ARETE-QUERY-METRICS*");

    // deflexical
    private static final SubLSymbol $removal_ask_query_metrics$ = makeSymbol("*REMOVAL-ASK-QUERY-METRICS*");

    // deflexical
    /**
     * Necessarily essential properties of an inference that are needed at creation
     * time and cannot change while an inference is suspended.
     */
    private static final SubLSymbol $inference_static_properties$ = makeSymbol("*INFERENCE-STATIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $inference_allows_hl_predicate_transformation_by_defaultP$ = makeSymbol("*INFERENCE-ALLOWS-HL-PREDICATE-TRANSFORMATION-BY-DEFAULT?*");

    // deflexical
    private static final SubLSymbol $inference_allows_unbound_predicate_transformation_by_defaultP$ = makeSymbol("*INFERENCE-ALLOWS-UNBOUND-PREDICATE-TRANSFORMATION-BY-DEFAULT?*");

    // deflexical
    private static final SubLSymbol $inference_allows_evaluatable_predicate_transformation_by_defaultP$ = makeSymbol("*INFERENCE-ALLOWS-EVALUATABLE-PREDICATE-TRANSFORMATION-BY-DEFAULT?*");

    // deflexical
    private static final SubLSymbol $inference_allows_indeterminate_results_by_defaultP$ = makeSymbol("*INFERENCE-ALLOWS-INDETERMINATE-RESULTS-BY-DEFAULT?*");

    // deflexical
    private static final SubLSymbol $default_allowed_rules$ = makeSymbol("*DEFAULT-ALLOWED-RULES*");

    // deflexical
    private static final SubLSymbol $default_forbidden_rules$ = makeSymbol("*DEFAULT-FORBIDDEN-RULES*");

    // deflexical
    private static final SubLSymbol $default_allowed_modules$ = makeSymbol("*DEFAULT-ALLOWED-MODULES*");

    // deflexical
    private static final SubLSymbol $inference_allows_abnormality_checking_by_defaultP$ = makeSymbol("*INFERENCE-ALLOWS-ABNORMALITY-CHECKING-BY-DEFAULT?*");

    // deflexical
    /**
     * Constraints on how the inference is to be run. These can change while an
     * inference is suspended, and will be honoured upon its continuation.
     */
    private static final SubLSymbol $inference_resource_constraints$ = makeSymbol("*INFERENCE-RESOURCE-CONSTRAINTS*");

    // deflexical
    public static final SubLSymbol $default_max_number$ = makeSymbol("*DEFAULT-MAX-NUMBER*");

    // deflexical
    public static final SubLSymbol $default_max_time$ = makeSymbol("*DEFAULT-MAX-TIME*");

    // deflexical
    public static final SubLSymbol $default_max_step$ = makeSymbol("*DEFAULT-MAX-STEP*");

    // deflexical
    public static final SubLSymbol $default_forward_max_time$ = makeSymbol("*DEFAULT-FORWARD-MAX-TIME*");

    // deflexical
    public static final SubLSymbol $default_max_proof_depth$ = makeSymbol("*DEFAULT-MAX-PROOF-DEPTH*");

    // deflexical
    public static final SubLSymbol $default_max_transformation_depth$ = makeSymbol("*DEFAULT-MAX-TRANSFORMATION-DEPTH*");

    // deflexical
    public static final SubLSymbol $default_min_rule_utility$ = makeSymbol("*DEFAULT-MIN-RULE-UTILITY*");

    // deflexical
    public static final SubLSymbol $default_probably_approximately_done$ = makeSymbol("*DEFAULT-PROBABLY-APPROXIMATELY-DONE*");

    // deflexical
    /**
     * Other properties that can change during suspension, but are not resource
     * constraints.
     */
    private static final SubLSymbol $inference_other_dynamic_properties$ = makeSymbol("*INFERENCE-OTHER-DYNAMIC-PROPERTIES*");

    // deflexical
    public static final SubLSymbol $default_inference_metrics_template$ = makeSymbol("*DEFAULT-INFERENCE-METRICS-TEMPLATE*");

    // deflexical
    private static final SubLSymbol $strategy_static_properties$ = makeSymbol("*STRATEGY-STATIC-PROPERTIES*");

    // deflexical
    /**
     * The default productivity above which tactics will not be considered for
     * removal backtracking. The original value is set to 200.
     */
    public static final SubLSymbol $default_removal_backtracking_productivity_limit$ = makeSymbol("*DEFAULT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT*");

    // deflexical
    // The default proof spec that will be used in inference.
    public static final SubLSymbol $default_proof_spec$ = makeSymbol("*DEFAULT-PROOF-SPEC*");

    // deflexical
    private static final SubLSymbol $strategy_dynamic_properties$ = makeSymbol("*STRATEGY-DYNAMIC-PROPERTIES*");

    // deflexical
    /**
     * The default productivity above which tactics will be ignored instead of
     * executed. The original value was set to 2 * 100 *
     * default-removal-cost-cutoff*. The 100 is for the productivity to number of
     * children multiplier, and the 2 is for the join-ordered productivity
     * multiplier, because everything in the old harness is basically a
     * join-ordered.
     */
    public static final SubLSymbol $default_productivity_limit$ = makeSymbol("*DEFAULT-PRODUCTIVITY-LIMIT*");

    // deflexical
    /**
     * The list of valid properties that you can pass in when creating a new problem
     * store
     */
    private static final SubLSymbol $problem_store_static_properties$ = makeSymbol("*PROBLEM-STORE-STATIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $problem_store_dynamic_properties$ = makeSymbol("*PROBLEM-STORE-DYNAMIC-PROPERTIES*");

    // deflexical
    /**
     * A list of meta-properties that can affect all types of other problem store,
     * strategy, and inference properties.
     */
    private static final SubLSymbol $inference_meta_properties$ = makeSymbol("*INFERENCE-META-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $inference_statuses$ = makeSymbol("*INFERENCE-STATUSES*");

    // deflexical
    private static final SubLSymbol $continuable_inference_statuses$ = makeSymbol("*CONTINUABLE-INFERENCE-STATUSES*");

    // deflexical
    /**
     * :not-a-query is used by janus-modification-operation-p which overloads the
     * notion of 'inference'.
     */
    private static final SubLSymbol $avoided_inference_reasons$ = makeSymbol("*AVOIDED-INFERENCE-REASONS*");

    // deflexical
    /**
     * These are the proper suspend statuses, but there are also the
     * inference-halt-conditions.
     */
    private static final SubLSymbol $inference_suspend_statuses$ = makeSymbol("*INFERENCE-SUSPEND-STATUSES*");

    // deflexical
    // The suspend statuses for which the inference is still continuable.
    private static final SubLSymbol $continuable_inference_suspend_statuses$ = makeSymbol("*CONTINUABLE-INFERENCE-SUSPEND-STATUSES*");

    // deflexical
    // The suspend statuses that indicate an exhausted inference.
    private static final SubLSymbol $exhausted_inference_suspend_statuses$ = makeSymbol("*EXHAUSTED-INFERENCE-SUSPEND-STATUSES*");

    // deflexical
    private static final SubLSymbol $tactical_statuses$ = makeSymbol("*TACTICAL-STATUSES*");

    // deflexical
    private static final SubLSymbol $provability_statuses$ = makeSymbol("*PROVABILITY-STATUSES*");

    // deflexical
    private static final SubLSymbol $problem_status_table$ = makeSymbol("*PROBLEM-STATUS-TABLE*");

    // deflexical
    // An ordered list, from weakest to strongest, of the tactical statuses
    private static final SubLSymbol $ordered_tactical_statuses$ = makeSymbol("*ORDERED-TACTICAL-STATUSES*");

    // deflexical
    private static final SubLSymbol $union_ordered_tactical_statuses$ = makeSymbol("*UNION-ORDERED-TACTICAL-STATUSES*");

    // deflexical
    private static final SubLSymbol $add_restriction_layer_of_indirection_by_defaultP$ = makeSymbol("*ADD-RESTRICTION-LAYER-OF-INDIRECTION-BY-DEFAULT?*");

    // deflexical
    private static final SubLSymbol $negation_by_failure_by_defaultP$ = makeSymbol("*NEGATION-BY-FAILURE-BY-DEFAULT?*");

    // deflexical
    private static final SubLSymbol $evaluate_subl_allowed_defaultP$ = makeSymbol("*EVALUATE-SUBL-ALLOWED-DEFAULT?*");

    // defparameter
    // This is a parameter so it can be bound for tests.
    private static final SubLSymbol $rewrite_allowed_defaultP$ = makeSymbol("*REWRITE-ALLOWED-DEFAULT?*");

    // deflexical
    private static final SubLSymbol $abduction_allowed_defaultP$ = makeSymbol("*ABDUCTION-ALLOWED-DEFAULT?*");

    // deflexical
    public static final SubLSymbol $new_terms_allowed_defaultP$ = makeSymbol("*NEW-TERMS-ALLOWED-DEFAULT?*");

    // deflexical
    public static final SubLSymbol $compute_answer_justifications_defaultP$ = makeSymbol("*COMPUTE-ANSWER-JUSTIFICATIONS-DEFAULT?*");

    // deflexical
    public static final SubLSymbol $default_inference_mode$ = makeSymbol("*DEFAULT-INFERENCE-MODE*");

    // deflexical
    /**
     * The list of inference modes (inference parameter clusters) known to the
     * Strategist. :custom is the special inference mode meaning 'no inference mode,
     * just use the values of the parameters'
     */
    private static final SubLSymbol $inference_modes$ = makeSymbol("*INFERENCE-MODES*");

    // deflexical
    private static final SubLSymbol $problem_link_types$ = makeSymbol("*PROBLEM-LINK-TYPES*");

    // deflexical
    private static final SubLSymbol $default_problem_store_name$ = makeSymbol("*DEFAULT-PROBLEM-STORE-NAME*");

    // deflexical
    public static final SubLSymbol $default_equality_reasoning_method$ = makeSymbol("*DEFAULT-EQUALITY-REASONING-METHOD*");

    // deflexical
    /**
     * The methods of equality reasoning the problem store could use to determine
     * whether a new problem is equal to an existing problem.
     */
    private static final SubLSymbol $problem_store_equality_reasoning_methods$ = makeSymbol("*PROBLEM-STORE-EQUALITY-REASONING-METHODS*");

    // deflexical
    public static final SubLSymbol $default_equality_reasoning_domain$ = makeSymbol("*DEFAULT-EQUALITY-REASONING-DOMAIN*");

    // deflexical
    /**
     * The domain of the equality reasoning the problem store performs. Does it try
     * to do equality reasoning on all problems, or just a certain subclass of
     * problems?
     */
    private static final SubLSymbol $problem_store_equality_reasoning_domains$ = makeSymbol("*PROBLEM-STORE-EQUALITY-REASONING-DOMAINS*");

    // deflexical
    private static final SubLSymbol $default_intermediate_step_validation_level$ = makeSymbol("*DEFAULT-INTERMEDIATE-STEP-VALIDATION-LEVEL*");

    // deflexical
    /**
     * The levels of intermediate step (proof) validation that can be handled by
     * problem stores.
     */
    private static final SubLSymbol $intermediate_step_validation_levels$ = makeSymbol("*INTERMEDIATE-STEP-VALIDATION-LEVELS*");

    // deflexical
    public static final SubLSymbol $default_max_problem_count$ = makeSymbol("*DEFAULT-MAX-PROBLEM-COUNT*");

    // deflexical
    private static final SubLSymbol $removal_allowed_by_defaultP$ = makeSymbol("*REMOVAL-ALLOWED-BY-DEFAULT?*");

    // deflexical
    private static final SubLSymbol $transformation_allowed_by_defaultP$ = makeSymbol("*TRANSFORMATION-ALLOWED-BY-DEFAULT?*");

    // deflexical
    public static final SubLSymbol $default_problem_store_inference_direction$ = makeSymbol("*DEFAULT-PROBLEM-STORE-INFERENCE-DIRECTION*");

    // deflexical
    private static final SubLSymbol $inference_directions$ = makeSymbol("*INFERENCE-DIRECTIONS*");

    // deflexical
    private static final SubLSymbol $tactic_statuses$ = makeSymbol("*TACTIC-STATUSES*");

    // deflexical
    private static final SubLSymbol $tactic_types$ = makeSymbol("*TACTIC-TYPES*");

    // deflexical
    // These are sorted from least complete to most complete.
    private static final SubLSymbol $ordered_completenesses$ = makeSymbol("*ORDERED-COMPLETENESSES*");

    // deflexical
    private static final SubLSymbol $productivity_to_number_table$ = makeSymbol("*PRODUCTIVITY-TO-NUMBER-TABLE*");

    // deflexical
    private static final SubLSymbol $proof_statuses$ = makeSymbol("*PROOF-STATUSES*");

    // deflexical
    private static final SubLSymbol $proof_reject_reasons$ = makeSymbol("*PROOF-REJECT-REASONS*");

    // deflexical
    private static final SubLSymbol $destructibility_statuses$ = makeSymbol("*DESTRUCTIBILITY-STATUSES*");

    // deflexical
    private static final SubLSymbol $balancing_tactician_strategy_type_properties$ = makeSymbol("*BALANCING-TACTICIAN-STRATEGY-TYPE-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $legacy_strategy_type_properties$ = makeSymbol("*LEGACY-STRATEGY-TYPE-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $strategy_type_properties$ = makeSymbol("*STRATEGY-TYPE-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $inference_return_types$ = makeSymbol("*INFERENCE-RETURN-TYPES*");

    // deflexical
    // The default :return type for inference.
    public static final SubLSymbol $inference_default_return_type$ = makeSymbol("*INFERENCE-DEFAULT-RETURN-TYPE*");

    // deflexical
    private static final SubLSymbol $inference_answer_languages$ = makeSymbol("*INFERENCE-ANSWER-LANGUAGES*");

    // deflexical
    public static final SubLSymbol $inference_default_answer_language$ = makeSymbol("*INFERENCE-DEFAULT-ANSWER-LANGUAGE*");

    // deflexical
    // Ways in which results can be unique in a strategy
    private static final SubLSymbol $result_uniqueness_criteria$ = makeSymbol("*RESULT-UNIQUENESS-CRITERIA*");

    // deflexical
    public static final SubLSymbol $default_result_uniqueness_criterion$ = makeSymbol("*DEFAULT-RESULT-UNIQUENESS-CRITERION*");

    // deflexical
    // Possible policies for handling the free EL vars in disjunctions
    private static final SubLSymbol $inference_disjunction_free_el_vars_policies$ = makeSymbol("*INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICIES*");

    // deflexical
    /**
     * The policy with respect to the handling of free el variables in disjunctive
     * queries. Must be one of :REQUIRE-EQUAL , :COMPUTE-INTERSECTION , or
     * :COMPUTE-UNION .
     */
    public static final SubLSymbol $default_inference_disjunction_free_el_vars_policy$ = makeSymbol("*DEFAULT-INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY*");

    // deflexical
    /**
     * Possible modes for generating transitive closures in modules such as TVA.
     * :none - no transitive closures :focused - only focused transitive closures
     * (i.e., not in the fan out direction) :all - full transitive closure
     * generation
     */
    private static final SubLSymbol $inference_transitive_closure_modes$ = makeSymbol("*INFERENCE-TRANSITIVE-CLOSURE-MODES*");

    // deflexical
    private static final SubLSymbol $inference_transitive_closure_mode_default$ = makeSymbol("*INFERENCE-TRANSITIVE-CLOSURE-MODE-DEFAULT*");

    // deflexical
    public static final SubLSymbol $maintain_term_working_set_defaultP$ = makeSymbol("*MAINTAIN-TERM-WORKING-SET-DEFAULT?*");

    // deflexical
    public static final SubLSymbol $inference_events_default$ = makeSymbol("*INFERENCE-EVENTS-DEFAULT*");

    // deflexical
    /**
     * :new-answer tells the inference to signal an :inference-new-answer event when
     * a new inference answer is created. :status-change tells the inference to
     * signal an :inference-status-change event when the inference-status changes.
     * :new-transformation-depth-reached tells the inference to signal an
     * :inference-new-transformation-depth-reached event when it reaches a problem
     * deeper than it has reached before. To be extended.
     */
    private static final SubLSymbol $inference_event_types$ = makeSymbol("*INFERENCE-EVENT-TYPES*");

    // deflexical
    private static final SubLSymbol $inference_halt_conditions_default$ = makeSymbol("*INFERENCE-HALT-CONDITIONS-DEFAULT*");

    // deflexical
    /**
     * :look-no-deeper-for-additional-answers tells the inference to halt if it's
     * gotten some answers at a transformation depth N and is considering going to
     * depth N+1. To be extended.
     */
    private static final SubLSymbol $inference_halt_conditions$ = makeSymbol("*INFERENCE-HALT-CONDITIONS*");

    // deflexical
    // An alist mapping inference accumulator names to their initializers.
    private static final SubLSymbol $inference_accumulator_types$ = makeSymbol("*INFERENCE-ACCUMULATOR-TYPES*");

    // deflexical
    /**
     * Whether the default is to discard the results that exceed the :max-number
     * cutoff
     */
    private static final SubLSymbol $inference_default_forget_extra_resultsP$ = makeSymbol("*INFERENCE-DEFAULT-FORGET-EXTRA-RESULTS?*");

    // deflexical
    /**
     * Whether the default behaviour is to cache the results of inference in the KB
     */
    private static final SubLSymbol $inference_default_cache_inference_resultsP$ = makeSymbol("*INFERENCE-DEFAULT-CACHE-INFERENCE-RESULTS?*");

    // deflexical
    /**
     * Whether inferences are browsable by default. This is NIL to avoid memory
     * issues.
     */
    public static final SubLSymbol $inference_default_browsableP$ = makeSymbol("*INFERENCE-DEFAULT-BROWSABLE?*");

    // deflexical
    /**
     * Whether inferences are continuable by default. This is NIL to avoid memory
     * issues.
     */
    public static final SubLSymbol $inference_default_continuableP$ = makeSymbol("*INFERENCE-DEFAULT-CONTINUABLE?*");



    public static final SubLSymbol ALL_QUERY_PROPERTIES = makeSymbol("ALL-QUERY-PROPERTIES");

    public static final SubLString $str2$Return_a_list_of_all_the_query_pr = makeString("Return a list of all the query properties.\n   @note destructible");

    public static final SubLList $list3 = list(list(makeSymbol("LIST"), makeSymbol("KEYWORDP")));

    public static final SubLSymbol QUERY_STATIC_PROPERTY_P = makeSymbol("QUERY-STATIC-PROPERTY-P");

    public static final SubLSymbol QUERY_STATIC_OR_META_PROPERTY_P = makeSymbol("QUERY-STATIC-OR-META-PROPERTY-P");

    public static final SubLSymbol QUERY_DYNAMIC_PROPERTY_P = makeSymbol("QUERY-DYNAMIC-PROPERTY-P");

    public static final SubLList $list7 = list(makeKeyword("NEW-ROOT-TIMES"), makeKeyword("NEW-ROOT-COUNT"), makeKeyword("PROBLEM-CREATION-TIMES"), makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES"), makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES"), makeKeyword("INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES"), makeKeyword("INFERENCE-IDS"));

    public static final SubLList $list8 = list(makeKeyword("COMPLETE-USER-TIME"), makeKeyword("COMPLETE-SYSTEM-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));

    public static final SubLList $list9 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("HYPOTHESIZATION-TIME"), makeKeyword("TOTAL-TIME"));

    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TIME-PER-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-USER-TIME"), makeKeyword("COMPLETE-SYSTEM-TIME"), makeKeyword("COMPLETE-TOTAL-TIME") });

    public static final SubLSymbol INFERENCE_PROPERTY_P = makeSymbol("INFERENCE-PROPERTY-P");

    public static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROBLEM-STORE"), makeKeyword("CONDITIONAL-SENTENCE?"), makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOWED-RULES"), makeKeyword("FORBIDDEN-RULES"), makeKeyword("ALLOWED-MODULES"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("MAINTAIN-TERM-WORKING-SET?"), makeKeyword("EVENTS"), makeKeyword("HALT-CONDITIONS") });

    public static final SubLSymbol INFERENCE_STATIC_PROPERTY_P = makeSymbol("INFERENCE-STATIC-PROPERTY-P");

    public static final SubLSymbol INFERENCE_STATIC_OR_META_PROPERTY_P = makeSymbol("INFERENCE-STATIC-OR-META-PROPERTY-P");



    private static final SubLSymbol $kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw19$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");











    private static final SubLSymbol $kw25$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");

    public static final SubLList $list26 = list(makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("INFERENCE-MODE"));

    public static final SubLSymbol INFERENCE_RESOURCE_CONSTRAINT_P = makeSymbol("INFERENCE-RESOURCE-CONSTRAINT-P");









    private static final SubLSymbol $FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLInteger $int$_100 = makeInteger(-100);

    private static final SubLSymbol $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLList $list38 = list(new SubLObject[]{ makeKeyword("FORWARD-MAX-TIME"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("MIN-RULE-UTILITY"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("RETURN"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("CACHE-INFERENCE-RESULTS?"), makeKeyword("FORGET-EXTRA-RESULTS?"), makeKeyword("BROWSABLE?"), makeKeyword("CONTINUABLE?"), makeKeyword("BLOCK?"), makeKeyword("METRICS") });

    private static final SubLSymbol INFERENCE_DYNAMIC_PROPERTY_P = makeSymbol("INFERENCE-DYNAMIC-PROPERTY-P");



    private static final SubLSymbol STRATEGY_PROPERTY_P = makeSymbol("STRATEGY-PROPERTY-P");

    private static final SubLList $list42 = list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PROOF-SPEC"));

    private static final SubLSymbol STRATEGY_STATIC_PROPERTY_P = makeSymbol("STRATEGY-STATIC-PROPERTY-P");

    private static final SubLSymbol $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");





    private static final SubLList $list47 = list(makeKeyword("PRODUCTIVITY-LIMIT"));

    private static final SubLSymbol STRATEGY_DYNAMIC_PROPERTY_P = makeSymbol("STRATEGY-DYNAMIC-PROPERTY-P");





    private static final SubLSymbol PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");

    private static final SubLList $list52 = list(new SubLObject[]{ makeKeyword("PROBLEM-STORE-NAME"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("REMOVAL-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?") });

    private static final SubLSymbol PROBLEM_STORE_STATIC_PROPERTY_P = makeSymbol("PROBLEM-STORE-STATIC-PROPERTY-P");

    private static final SubLSymbol PROBLEM_STORE_DYNAMIC_PROPERTY_P = makeSymbol("PROBLEM-STORE-DYNAMIC-PROPERTY-P");

    private static final SubLList $list55 = list(makeKeyword("INFERENCE-MODE"));

    private static final SubLSymbol INFERENCE_META_PROPERTY_P = makeSymbol("INFERENCE-META-PROPERTY-P");

    public static final SubLList $list57 = list(new SubLObject[]{ makeKeyword("NEW"), makeKeyword("PREPARED"), makeKeyword("READY"), makeKeyword("RUNNING"), makeKeyword("SUSPENDED"), makeKeyword("DEAD"), makeKeyword("TAUTOLOGY"), makeKeyword("CONTRADICTION"), makeKeyword("ILL-FORMED") });

    public static final SubLList $list58 = list(makeKeyword("PREPARED"), makeKeyword("SUSPENDED"));

    public static final SubLList $list59 = list(makeKeyword("TAUTOLOGY"), makeKeyword("CONTRADICTION"), makeKeyword("ILL-FORMED"), makeKeyword("NON-TRIVIAL"), makeKeyword("NOT-A-QUERY"));

    private static final SubLList $list60 = list(new SubLObject[]{ makeKeyword("ABORT"), makeKeyword("INTERRUPT"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("MAX-PROOF-COUNT"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("EXHAUST"), makeKeyword("EXHAUST-TOTAL") });

    private static final SubLSymbol INFERENCE_STATUS_P = makeSymbol("INFERENCE-STATUS-P");





    public static final SubLList $list64 = list(makeKeyword("INTERRUPT"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("EXHAUST"));

    private static final SubLList $list65 = list(makeKeyword("EXHAUST"), makeKeyword("EXHAUST-TOTAL"));







    private static final SubLSymbol HL_JUSTIFICATION_LIST_P = makeSymbol("HL-JUSTIFICATION-LIST-P");

    public static final SubLList $list70 = list(makeKeyword("NEW"), makeKeyword("UNEXAMINED"), makeKeyword("EXAMINED"), makeKeyword("POSSIBLE"), makeKeyword("PENDING"), makeKeyword("FINISHED"));

    public static final SubLList $list71 = list(makeKeyword("GOOD"), makeKeyword("NEUTRAL"), makeKeyword("NO-GOOD"));

    private static final SubLList $list72 = list(new SubLObject[]{ list(makeKeyword("NEW"), makeKeyword("NEW"), makeKeyword("NEUTRAL")), list(makeKeyword("UNEXAMINED"), makeKeyword("UNEXAMINED"), makeKeyword("NEUTRAL")), list(makeKeyword("UNEXAMINED-GOOD"), makeKeyword("UNEXAMINED"), makeKeyword("GOOD")), list(makeKeyword("UNEXAMINED-NO-GOOD"), makeKeyword("UNEXAMINED"), makeKeyword("NO-GOOD")), list(makeKeyword("EXAMINED"), makeKeyword("EXAMINED"), makeKeyword("NEUTRAL")), list(makeKeyword("EXAMINED-GOOD"), makeKeyword("EXAMINED"), makeKeyword("GOOD")), list(makeKeyword("EXAMINED-NO-GOOD"), makeKeyword("EXAMINED"), makeKeyword("NO-GOOD")), list(makeKeyword("POSSIBLE"), makeKeyword("POSSIBLE"), makeKeyword("NEUTRAL")), list(makeKeyword("POSSIBLE-GOOD"), makeKeyword("POSSIBLE"), makeKeyword("GOOD")), list(makeKeyword("POSSIBLE-NO-GOOD"), makeKeyword("POSSIBLE"), makeKeyword("NO-GOOD")), list(makeKeyword("PENDING"), makeKeyword("PENDING"), makeKeyword("NEUTRAL")), list(makeKeyword("PENDING-GOOD"), makeKeyword("PENDING"), makeKeyword("GOOD")), list(makeKeyword("PENDING-NO-GOOD"), makeKeyword("PENDING"), makeKeyword("NO-GOOD")), list(makeKeyword("FINISHED"), makeKeyword("FINISHED"), makeKeyword("NEUTRAL")), list(makeKeyword("FINISHED-GOOD"), makeKeyword("FINISHED"), makeKeyword("GOOD")), list(makeKeyword("FINISHED-NO-GOOD"), makeKeyword("FINISHED"), makeKeyword("NO-GOOD")) });



    private static final SubLList $list74 = list(makeKeyword("NEW"), makeKeyword("POSSIBLE"), makeKeyword("PENDING"), makeKeyword("EXAMINED"), makeKeyword("UNEXAMINED"), makeKeyword("FINISHED"));

    private static final SubLString $str75$No_match_to_combine__s_and__s = makeString("No match to combine ~s and ~s");

















    private static final SubLSymbol $kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw85$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    private static final SubLSymbol $kw86$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");

    private static final SubLSymbol $kw87$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");

    private static final SubLSymbol $kw88$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");

    private static final SubLSymbol $kw89$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");

    private static final SubLSymbol $kw90$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLSymbol $kw91$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");



    private static final SubLList $list93 = list(makeKeyword("MINIMAL"), makeKeyword("SHALLOW"), makeKeyword("EXTENDED"), makeKeyword("MAXIMAL"), makeKeyword("CUSTOM"));

    private static final SubLList $list94 = list(new SubLObject[]{ makeKeyword("REMOVAL"), makeKeyword("TRANSFORMATION"), makeKeyword("RESIDUAL-TRANSFORMATION"), makeKeyword("REWRITE"), makeKeyword("JOIN-ORDERED"), makeKeyword("JOIN"), makeKeyword("SPLIT"), makeKeyword("RESTRICTION"), makeKeyword("UNION"), makeKeyword("DISJUNCTIVE-ASSUMPTION"), makeKeyword("ANSWER"), makeKeyword("INDIRECTION") });

    private static final SubLSymbol $PROBLEM_STORE_NAME = makeKeyword("PROBLEM-STORE-NAME");



    public static final SubLList $list97 = list(makeKeyword("EQUAL"), makeKeyword("CZER-EQUAL"));

    private static final SubLSymbol $EQUALITY_REASONING_METHOD = makeKeyword("EQUALITY-REASONING-METHOD");

    public static final SubLList $list99 = list(makeKeyword("ALL"), makeKeyword("SINGLE-LITERAL"), makeKeyword("NONE"));

    private static final SubLSymbol $EQUALITY_REASONING_DOMAIN = makeKeyword("EQUALITY-REASONING-DOMAIN");

    private static final SubLList $list101 = list(makeKeyword("ALL"), makeKeyword("ARG-TYPE"), makeKeyword("MINIMAL"), makeKeyword("NONE"));

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");

    private static final SubLSymbol $kw105$REMOVAL_ALLOWED_ = makeKeyword("REMOVAL-ALLOWED?");

    private static final SubLSymbol $kw106$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");



    public static final SubLList $list108 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"));



    private static final SubLList $list110 = list(makeKeyword("POSSIBLE"), makeKeyword("EXECUTED"), makeKeyword("DISCARDED"));

    private static final SubLList $list111 = list(makeKeyword("REMOVAL"), makeKeyword("META-REMOVAL"), makeKeyword("TRANSFORMATION"), makeKeyword("REWRITE"), makeKeyword("STRUCTURAL"), makeKeyword("REMOVAL-CONJUNCTIVE"));













    private static final SubLString $str118$HL_Module_of_unknown_type___s = makeString("HL-Module of unknown type: ~s");

    private static final SubLList $list119 = list(makeKeyword("IMPOSSIBLE"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INCOMPLETE"), makeKeyword("COMPLETE"));

    private static final SubLSymbol COMPLETENESS_P = makeSymbol("COMPLETENESS-P");



    private static final SubLString $$$Complete = makeString("Complete");



    private static final SubLString $$$Incomplete = makeString("Incomplete");



    private static final SubLString $$$Grossly_Incomplete = makeString("Grossly Incomplete");



    private static final SubLString $$$Impossible = makeString("Impossible");

    private static final SubLString $str129$Unexpected_completeness__a = makeString("Unexpected completeness ~a");

    private static final SubLSymbol $sym130$COMPLETENESS__ = makeSymbol("COMPLETENESS-<");

    private static final SubLSymbol $sym131$COMPLETENESS__ = makeSymbol("COMPLETENESS->");

    public static final SubLList $list132 = list(cons(makeDouble(0.5), makeInteger(50)), cons(makeDouble(1.5), makeInteger(150)));

    private static final SubLSymbol PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");

    public static final SubLList $list134 = list(makeKeyword("PROVEN"), makeKeyword("REJECTED"));

    private static final SubLList $list135 = list(new SubLObject[]{ makeKeyword("CIRCULAR"), makeKeyword("ILL-FORMED"), makeKeyword("NON-ABDUCIBLE-RULE"), makeKeyword("REJECTED-SUBPROOF"), makeKeyword("MAX-PROOF-BUBBLING-DEPTH"), makeKeyword("INCONSISTENT-MT-ASSUMPTIONS"), makeKeyword("EXCEPTED-ASSERTION"), makeKeyword("ABNORMAL"), makeKeyword("PROBLEM-NO-GOOD"), makeKeyword("MODUS-TOLLENS-WITH-NON-WFF") });

    private static final SubLList $list136 = list(makeKeyword("INDESTRUCTIBLE"), makeKeyword("DESTRUCTIBLE"), makeKeyword("UNKNOWN"));

    private static final SubLSymbol DESTRUCTIBILITY_STATUS_P = makeSymbol("DESTRUCTIBILITY-STATUS-P");



    private static final SubLString $$$Indestructible = makeString("Indestructible");



    private static final SubLString $$$Destructible = makeString("Destructible");



    private static final SubLString $$$Unknown = makeString("Unknown");

    private static final SubLString $str144$Unexpected_destructibility_status = makeString("Unexpected destructibility status ~s");

    private static final SubLString $$$I = makeString("I");

    private static final SubLString $str146$ = makeString("");

    private static final SubLString $str147$_ = makeString("?");

    private static final SubLList $list148 = list(new SubLObject[]{ cons(makeKeyword("NAME"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("COMMENT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("CONSTRUCTOR"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("DO-ONE-STEP"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("DONE?"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SELECT-BEST-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("EXECUTE-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("INITIAL-RELEVANT-STRATEGIES"), makeSymbol("DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES")), cons(makeKeyword("NEW-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("DEFAULT-STRATEGY-INITIALIZE-PROPERTIES")), cons(makeKeyword("UPDATE-PROPERTIES"), makeSymbol("DEFAULT-STRATEGY-UPDATE-PROPERTIES")), cons(makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED")), cons(makeKeyword("RECONSIDER-SET-ASIDES"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?")), cons(makeKeyword("QUIESCE"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NEW-ARGUMENT-LINK"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PROBLEM-COULD-BE-PENDING"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?")), cons(makeKeyword("THROW-AWAY-PROBLEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SET-ASIDE-PROBLEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("THROW-AWAY-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SET-ASIDE-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-NEXT-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("MOTIVATE-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("LINK-HEAD-MOTIVATED?"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), makeSymbol("ZERO")), cons(makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("HAPPINESS-TABLE"), makeSymbol("NULL")) });

    private static final SubLList $list149 = list(new SubLObject[]{ cons(makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POP-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NO-NEW-ROOTS"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("THROW-AWAY-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-REMOVAL-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-REMOVAL-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POP-REMOVAL-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-TRANSFORMATION-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POP-TRANSFORMATION-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeKeyword("MUST-OVERRIDE")) });

    private static final SubLSymbol STRATEGY_TYPE_PROPERTY_P = makeSymbol("STRATEGY-TYPE-PROPERTY-P");



    private static final SubLString $str152$Strategy_must_implement_method__s = makeString("Strategy must implement method ~s");

    private static final SubLList $list153 = list(makeKeyword("ANSWER"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"), makeKeyword("BINDINGS-AND-SUPPORTS"), makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS"), makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS"));









    private static final SubLList $list158 = list(makeKeyword("EL"), makeKeyword("HL"));





    public static final SubLList $list161 = list(makeKeyword("PROOF"), makeKeyword("BINDINGS"));



    private static final SubLList $list163 = list(makeKeyword("REQUIRE-EQUAL"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("COMPUTE-UNION"));



    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");

    private static final SubLList $list166 = list(makeKeyword("NONE"), makeKeyword("FOCUSED"), makeKeyword("ALL"));

    private static final SubLSymbol $TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");

    private static final SubLSymbol $kw168$MAINTAIN_TERM_WORKING_SET_ = makeKeyword("MAINTAIN-TERM-WORKING-SET?");



    public static final SubLList $list170 = list(makeKeyword("NEW-ANSWER"), makeKeyword("STATUS-CHANGE"), makeKeyword("NEW-TRANSFORMATION-DEPTH-REACHED"), makeKeyword("SKSI-QUERY"));



    private static final SubLList $list172 = list(makeKeyword("LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS"));

    private static final SubLList $list173 = list(cons(makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC"), makeSymbol("NEW-SUM-ACCUMULATOR")), cons(makeKeyword("SKSI-QUERY-START-TIMES-ACC"), makeSymbol("NEW-LIST-ACCUMULATOR")), cons(makeKeyword("SPARQL-QUERY-PROFILE-ACC"), makeSymbol("NEW-LIST-ACCUMULATOR")));

    private static final SubLSymbol INFERENCE_ACCUMULATOR_TYPE_P = makeSymbol("INFERENCE-ACCUMULATOR-TYPE-P");

    private static final SubLSymbol $kw175$FORGET_EXTRA_RESULTS_ = makeKeyword("FORGET-EXTRA-RESULTS?");

    private static final SubLSymbol $kw176$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");









    private static final SubLSymbol $kw181$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLSymbol $NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");



    public static SubLObject query_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != query_static_property_p(v_object)) || (NIL != query_dynamic_property_p(v_object)));
    }

    public static SubLObject query_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, QUERY_PROPERTY_P);
    }

    public static SubLObject all_query_properties() {
        return nconc(all_query_static_properties(), all_query_dynamic_properties());
    }

    public static SubLObject merge_query_properties(SubLObject query_properties, final SubLObject overriding_query_properties) {
        if (NIL != overriding_query_properties) {
            query_properties = copy_list(query_properties);
            SubLObject remainder;
            SubLObject property;
            SubLObject value;
            for (remainder = NIL, remainder = overriding_query_properties; NIL != remainder; remainder = cddr(remainder)) {
                property = remainder.first();
                value = cadr(remainder);
                query_properties = putf(query_properties, property, value);
            }
        }
        return query_properties;
    }

    public static SubLObject query_static_property_p(final SubLObject v_object) {
        return makeBoolean(((NIL != inference_static_property_p(v_object)) || (NIL != problem_store_static_property_p(v_object))) || (NIL != strategy_static_property_p(v_object)));
    }

    public static SubLObject query_static_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, QUERY_STATIC_PROPERTY_P);
    }

    public static SubLObject extract_query_static_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, QUERY_STATIC_PROPERTY_P);
    }

    public static SubLObject all_query_static_properties() {
        return nconc(all_inference_static_properties(), all_problem_store_static_properties(), all_strategy_static_properties());
    }

    public static SubLObject query_static_or_meta_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != query_static_property_p(v_object)) || (NIL != inference_meta_property_p(v_object)));
    }

    public static SubLObject query_static_or_meta_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, QUERY_STATIC_OR_META_PROPERTY_P);
    }

    public static SubLObject extract_query_static_or_meta_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, QUERY_STATIC_OR_META_PROPERTY_P);
    }

    public static SubLObject query_dynamic_property_p(final SubLObject v_object) {
        return makeBoolean(((NIL != inference_dynamic_property_p(v_object)) || (NIL != problem_store_dynamic_property_p(v_object))) || (NIL != strategy_dynamic_property_p(v_object)));
    }

    public static SubLObject query_dynamic_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, QUERY_DYNAMIC_PROPERTY_P);
    }

    public static SubLObject extract_query_dynamic_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, QUERY_DYNAMIC_PROPERTY_P);
    }

    public static SubLObject all_query_dynamic_properties() {
        return nconc(all_inference_dynamic_properties(), all_problem_store_dynamic_properties(), all_strategy_dynamic_properties());
    }

    public static SubLObject query_metric_p(final SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (((NIL != list_utilities.member_eqP(v_object, $specially_handled_inference_metrics$.getGlobalValue())) || (NIL != list_utilities.member_eqP(v_object, $non_inference_query_metrics$.getGlobalValue()))) || (NIL != inference_metrics.inference_metric_nameP(v_object))));
    }

    public static SubLObject inference_query_metric_p(final SubLObject v_object) {
        return makeBoolean((NIL != query_metric_p(v_object)) && (NIL == subl_promotions.memberP(v_object, $non_inference_query_metrics$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject all_query_metrics() {
        return append(inference_metrics.inference_metric_names(), $specially_handled_inference_metrics$.getGlobalValue(), $non_inference_query_metrics$.getGlobalValue());
    }

    public static SubLObject arete_query_metric_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $arete_query_metrics$.getGlobalValue());
    }

    public static SubLObject all_arete_query_metrics() {
        return copy_list($arete_query_metrics$.getGlobalValue());
    }

    public static SubLObject removal_ask_query_metric_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $removal_ask_query_metrics$.getGlobalValue());
    }

    public static SubLObject inference_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_static_property_p(v_object)) || (NIL != inference_dynamic_property_p(v_object)));
    }

    public static SubLObject inference_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, INFERENCE_PROPERTY_P);
    }

    public static SubLObject inference_static_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_static_properties$.getGlobalValue());
    }

    public static SubLObject inference_static_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, INFERENCE_STATIC_PROPERTY_P);
    }

    public static SubLObject extract_inference_static_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, INFERENCE_STATIC_PROPERTY_P);
    }

    public static SubLObject all_inference_static_properties() {
        return copy_list($inference_static_properties$.getGlobalValue());
    }

    public static SubLObject inference_static_or_meta_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_static_property_p(v_object)) || (NIL != inference_meta_property_p(v_object)));
    }

    public static SubLObject inference_static_or_meta_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, INFERENCE_STATIC_OR_META_PROPERTY_P);
    }

    public static SubLObject extract_inference_static_or_meta_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, INFERENCE_STATIC_OR_META_PROPERTY_P);
    }

    public static SubLObject inference_properties_problem_store(final SubLObject v_properties) {
        final SubLObject raw_value = getf(v_properties, $PROBLEM_STORE, NIL);
        if (NIL != subl_promotions.non_negative_integer_p(raw_value)) {
            return inference_datastructures_problem_store.find_problem_store_by_id(raw_value);
        }
        return raw_value;
    }

    public static SubLObject inference_properties_allow_hl_predicate_transformationP(final SubLObject v_properties) {
        return getf(v_properties, $kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_, $inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue());
    }

    public static SubLObject inference_properties_allow_unbound_predicate_transformationP(final SubLObject v_properties) {
        return getf(v_properties, $kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, $inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue());
    }

    public static SubLObject inference_properties_allow_evaluatable_predicate_transformationP(final SubLObject v_properties) {
        return getf(v_properties, $kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, $inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue());
    }

    public static SubLObject inference_properties_allow_indeterminate_resultsP(final SubLObject v_properties) {
        return getf(v_properties, $kw19$ALLOW_INDETERMINATE_RESULTS_, $inference_allows_indeterminate_results_by_defaultP$.getGlobalValue());
    }

    public static SubLObject inference_properties_allowed_rules(final SubLObject v_properties) {
        return getf(v_properties, $ALLOWED_RULES, $default_allowed_rules$.getGlobalValue());
    }

    public static SubLObject inference_properties_forbidden_rules(final SubLObject v_properties) {
        return getf(v_properties, $FORBIDDEN_RULES, $default_forbidden_rules$.getGlobalValue());
    }

    public static SubLObject inference_properties_allowed_modules(final SubLObject v_properties) {
        return getf(v_properties, $ALLOWED_MODULES, $default_allowed_modules$.getGlobalValue());
    }

    public static SubLObject inference_properties_allow_abnormality_checkingP(final SubLObject v_properties) {
        return getf(v_properties, $kw25$ALLOW_ABNORMALITY_CHECKING_, $inference_allows_abnormality_checking_by_defaultP$.getGlobalValue());
    }

    public static SubLObject inference_resource_constraint_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_resource_constraints$.getGlobalValue());
    }

    public static SubLObject inference_resource_constraints_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, INFERENCE_RESOURCE_CONSTRAINT_P);
    }

    public static SubLObject extract_inference_resource_constraints(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, INFERENCE_RESOURCE_CONSTRAINT_P);
    }

    public static SubLObject inference_properties_max_number(final SubLObject v_properties) {
        return getf(v_properties, $MAX_NUMBER, $default_max_number$.getGlobalValue());
    }

    public static SubLObject inference_properties_max_time(final SubLObject v_properties) {
        return getf(v_properties, $MAX_TIME, $default_max_time$.getGlobalValue());
    }

    public static SubLObject inference_properties_max_step(final SubLObject v_properties) {
        return getf(v_properties, $MAX_STEP, $default_max_step$.getGlobalValue());
    }

    public static SubLObject inference_properties_mode(final SubLObject v_properties) {
        return getf(v_properties, $INFERENCE_MODE, $default_inference_mode$.getGlobalValue());
    }

    public static SubLObject inference_properties_forward_max_time(final SubLObject v_properties) {
        return getf(v_properties, $FORWARD_MAX_TIME, $default_forward_max_time$.getGlobalValue());
    }

    public static SubLObject inference_properties_max_proof_depth(final SubLObject v_properties) {
        return getf(v_properties, $MAX_PROOF_DEPTH, $default_max_proof_depth$.getGlobalValue());
    }

    public static SubLObject inference_properties_max_transformation_depth(final SubLObject v_properties) {
        return getf(v_properties, $MAX_TRANSFORMATION_DEPTH, $default_max_transformation_depth$.getGlobalValue());
    }

    public static SubLObject inference_properties_min_rule_utility(final SubLObject v_properties) {
        return getf(v_properties, $MIN_RULE_UTILITY, $default_min_rule_utility$.getGlobalValue());
    }

    public static SubLObject inference_properties_probably_approximately_done(final SubLObject v_properties) {
        return getf(v_properties, $PROBABLY_APPROXIMATELY_DONE, $default_probably_approximately_done$.getGlobalValue());
    }

    public static SubLObject inference_dynamic_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_resource_constraint_p(v_object)) || (NIL != list_utilities.member_eqP(v_object, $inference_other_dynamic_properties$.getGlobalValue())));
    }

    public static SubLObject inference_dynamic_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, INFERENCE_DYNAMIC_PROPERTY_P);
    }

    public static SubLObject extract_inference_dynamic_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, INFERENCE_DYNAMIC_PROPERTY_P);
    }

    public static SubLObject all_inference_dynamic_properties() {
        return nconc(copy_list($inference_other_dynamic_properties$.getGlobalValue()), copy_list($inference_resource_constraints$.getGlobalValue()));
    }

    public static SubLObject inference_properties_metrics(final SubLObject v_properties) {
        return getf(v_properties, $METRICS, $default_inference_metrics_template$.getGlobalValue());
    }

    public static SubLObject strategy_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != strategy_static_property_p(v_object)) || (NIL != strategy_dynamic_property_p(v_object)));
    }

    public static SubLObject strategy_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, STRATEGY_PROPERTY_P);
    }

    public static SubLObject strategy_static_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $strategy_static_properties$.getGlobalValue());
    }

    public static SubLObject strategy_static_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, STRATEGY_STATIC_PROPERTY_P);
    }

    public static SubLObject extract_strategy_static_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, STRATEGY_STATIC_PROPERTY_P);
    }

    public static SubLObject all_strategy_static_properties() {
        return copy_list($strategy_static_properties$.getGlobalValue());
    }

    public static SubLObject strategy_static_properties_removal_backtracking_productivity_limit(final SubLObject v_properties) {
        return getf(v_properties, $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, $default_removal_backtracking_productivity_limit$.getGlobalValue());
    }

    public static SubLObject strategy_static_properties_proof_spec(final SubLObject v_properties) {
        return getf(v_properties, $PROOF_SPEC, $default_proof_spec$.getGlobalValue());
    }

    public static SubLObject strategy_dynamic_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $strategy_dynamic_properties$.getGlobalValue());
    }

    public static SubLObject strategy_dynamic_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, STRATEGY_DYNAMIC_PROPERTY_P);
    }

    public static SubLObject extract_strategy_dynamic_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, STRATEGY_DYNAMIC_PROPERTY_P);
    }

    public static SubLObject all_strategy_dynamic_properties() {
        return copy_list($strategy_dynamic_properties$.getGlobalValue());
    }

    public static SubLObject strategy_dynamic_properties_productivity_limit(final SubLObject v_properties) {
        return getf(v_properties, $PRODUCTIVITY_LIMIT, $default_productivity_limit$.getGlobalValue());
    }

    public static SubLObject problem_store_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != problem_store_static_property_p(v_object)) || (NIL != problem_store_dynamic_property_p(v_object)));
    }

    public static SubLObject problem_store_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PROBLEM_STORE_PROPERTY_P);
    }

    public static SubLObject all_problem_store_properties() {
        return nconc(all_problem_store_static_properties(), all_problem_store_dynamic_properties());
    }

    public static SubLObject extract_problem_store_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, PROBLEM_STORE_PROPERTY_P);
    }

    public static SubLObject problem_store_static_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_store_static_properties$.getGlobalValue());
    }

    public static SubLObject problem_store_static_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PROBLEM_STORE_STATIC_PROPERTY_P);
    }

    public static SubLObject extract_problem_store_static_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, PROBLEM_STORE_STATIC_PROPERTY_P);
    }

    public static SubLObject all_problem_store_static_properties() {
        return copy_list($problem_store_static_properties$.getGlobalValue());
    }

    public static SubLObject problem_store_dynamic_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_store_dynamic_properties$.getGlobalValue());
    }

    public static SubLObject problem_store_dynamic_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PROBLEM_STORE_DYNAMIC_PROPERTY_P);
    }

    public static SubLObject all_problem_store_dynamic_properties() {
        return copy_list($problem_store_dynamic_properties$.getGlobalValue());
    }

    public static SubLObject inference_meta_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_meta_properties$.getGlobalValue());
    }

    public static SubLObject all_inference_meta_properties() {
        return copy_list($inference_meta_properties$.getGlobalValue());
    }

    public static SubLObject extract_inference_meta_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, INFERENCE_META_PROPERTY_P);
    }

    public static SubLObject query_halt_reason_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_suspend_status_p(v_object)) || (NIL != avoided_inference_reason_p(v_object)));
    }

    public static SubLObject exhausted_query_halt_reason_p(final SubLObject v_object) {
        return makeBoolean((NIL != exhausted_inference_suspend_status_p(v_object)) || (NIL != avoided_inference_reason_p(v_object)));
    }

    public static SubLObject inference_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_statuses$.getGlobalValue());
    }

    public static SubLObject continuable_inference_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $continuable_inference_statuses$.getGlobalValue());
    }

    public static SubLObject avoided_inference_reason_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $avoided_inference_reasons$.getGlobalValue());
    }

    public static SubLObject inference_suspend_status_p(final SubLObject v_object) {
        return makeBoolean((((NIL != list_utilities.member_eqP(v_object, $inference_suspend_statuses$.getGlobalValue())) || (NIL != list_utilities.member_eqP(v_object, $inference_halt_conditions$.getGlobalValue()))) || (NIL != inference_error_suspend_status_p(v_object))) || (NIL != inference_justification_status_p(v_object)));
    }

    public static SubLObject inference_suspend_status_applicableP(final SubLObject status) {
        assert NIL != inference_status_p(status) : "inference_datastructures_enumerated_types.inference_status_p(status) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_status_p(status) " + status;
        return makeBoolean((status == $SUSPENDED) || (status == $TAUTOLOGY));
    }

    public static SubLObject continuable_inference_suspend_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $continuable_inference_suspend_statuses$.getGlobalValue());
    }

    public static SubLObject exhausted_inference_suspend_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $exhausted_inference_suspend_statuses$.getGlobalValue());
    }

    public static SubLObject inference_error_suspend_status_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.doubletonP(v_object)) && ($ERROR == v_object.first())) && second(v_object).isString());
    }

    public static SubLObject new_inference_error_suspend_status(final SubLObject message) {
        assert NIL != stringp(message) : "Types.stringp(message) " + "CommonSymbols.NIL != Types.stringp(message) " + message;
        return list($ERROR, message);
    }

    public static SubLObject inference_error_suspend_status_message(final SubLObject error_status) {
        return second(error_status);
    }

    public static SubLObject inference_justification_status_p(final SubLObject v_object) {
        return makeBoolean((v_object.isList() && ($JUSTIFICATION == v_object.first())) && (NIL != arguments.hl_justification_list_p(v_object.rest())));
    }

    public static SubLObject new_inference_justification_status(final SubLObject message) {
        assert NIL != arguments.hl_justification_list_p(message) : "arguments.hl_justification_list_p(message) " + "CommonSymbols.NIL != arguments.hl_justification_list_p(message) " + message;
        return cons($JUSTIFICATION, message);
    }

    public static SubLObject inference_justification_status_message(final SubLObject justification_status) {
        return justification_status.rest();
    }

    public static SubLObject tactical_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $tactical_statuses$.getGlobalValue());
    }

    public static SubLObject provability_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $provability_statuses$.getGlobalValue());
    }

    public static SubLObject tactical_status_weakerP(final SubLObject status1, final SubLObject status2) {
        return list_utilities.position_L(status1, status2, $ordered_tactical_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tactical_status_strongerP(final SubLObject status1, final SubLObject status2) {
        return tactical_status_weakerP(status2, status1);
    }

    public static SubLObject tactical_status_unionP(final SubLObject status1, final SubLObject status2) {
        return list_utilities.position_L(status1, status2, $union_ordered_tactical_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject problem_status_p(final SubLObject v_object) {
        SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (v_object.eql(triple.first())) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject problem_status_from_tactical_status_and_provability_status(final SubLObject tactical_status, final SubLObject provability_status) {
        SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (tactical_status.eql(second(triple)) && provability_status.eql(third(triple))) {
                return triple.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        Errors.error($str75$No_match_to_combine__s_and__s, tactical_status, provability_status);
        return NIL;
    }

    public static SubLObject tactical_status_from_problem_status(final SubLObject status) {
        SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (status.eql(triple.first())) {
                return second(triple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject provability_status_from_problem_status(final SubLObject status) {
        SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (status.eql(triple.first())) {
                return third(triple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject good_problem_status_p(final SubLObject status) {
        return eq($GOOD, provability_status_from_problem_status(status));
    }

    public static SubLObject no_good_problem_status_p(final SubLObject status) {
        return eq($NO_GOOD, provability_status_from_problem_status(status));
    }

    public static SubLObject neutral_problem_status_p(final SubLObject status) {
        return eq($NEUTRAL, provability_status_from_problem_status(status));
    }

    public static SubLObject unexamined_problem_status_p(final SubLObject status) {
        return eq($UNEXAMINED, tactical_status_from_problem_status(status));
    }

    public static SubLObject examined_problem_status_p(final SubLObject status) {
        return eq($EXAMINED, tactical_status_from_problem_status(status));
    }

    public static SubLObject possible_problem_status_p(final SubLObject status) {
        return eq($POSSIBLE, tactical_status_from_problem_status(status));
    }

    public static SubLObject pending_problem_status_p(final SubLObject status) {
        return eq($PENDING, tactical_status_from_problem_status(status));
    }

    public static SubLObject finished_problem_status_p(final SubLObject status) {
        return eq($FINISHED, tactical_status_from_problem_status(status));
    }

    public static SubLObject problem_store_properties_add_restriction_layer_of_indirectionP(final SubLObject v_properties) {
        return getf(v_properties, $kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue());
    }

    public static SubLObject problem_store_properties_negation_by_failureP(final SubLObject v_properties) {
        return getf(v_properties, $kw85$NEGATION_BY_FAILURE_, $negation_by_failure_by_defaultP$.getGlobalValue());
    }

    public static SubLObject problem_store_properties_completeness_minimization_allowedP(final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf(v_properties, $kw86$COMPLETENESS_MINIMIZATION_ALLOWED_, $complete_extent_minimization$.getDynamicValue(thread));
    }

    public static SubLObject problem_store_properties_evaluate_subl_allowedP(final SubLObject v_properties) {
        return getf(v_properties, $kw87$EVALUATE_SUBL_ALLOWED_, $evaluate_subl_allowed_defaultP$.getGlobalValue());
    }

    public static SubLObject problem_store_properties_rewrite_allowedP(final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf(v_properties, $kw88$REWRITE_ALLOWED_, $rewrite_allowed_defaultP$.getDynamicValue(thread));
    }

    public static SubLObject problem_store_properties_abduction_allowedP(final SubLObject v_properties) {
        return getf(v_properties, $kw89$ABDUCTION_ALLOWED_, $abduction_allowed_defaultP$.getGlobalValue());
    }

    public static SubLObject problem_store_properties_new_terms_allowedP(final SubLObject v_properties) {
        return getf(v_properties, $kw90$NEW_TERMS_ALLOWED_, $new_terms_allowed_defaultP$.getGlobalValue());
    }

    public static SubLObject problem_store_properties_compute_answer_justificationsP(final SubLObject v_properties) {
        return getf(v_properties, $kw91$COMPUTE_ANSWER_JUSTIFICATIONS_, $compute_answer_justifications_defaultP$.getGlobalValue());
    }

    public static SubLObject all_inference_modes() {
        return copy_list($inference_modes$.getGlobalValue());
    }

    public static SubLObject inference_mode_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_modes$.getGlobalValue());
    }

    public static SubLObject problem_link_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_link_types$.getGlobalValue());
    }

    public static SubLObject problem_store_name_p(final SubLObject v_object) {
        return T;
    }

    public static SubLObject problem_store_properties_name(final SubLObject v_properties) {
        return getf(v_properties, $PROBLEM_STORE_NAME, $default_problem_store_name$.getGlobalValue());
    }

    public static SubLObject problem_store_equality_reasoning_method_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_store_equality_reasoning_methods$.getGlobalValue());
    }

    public static SubLObject problem_store_properties_equality_reasoning_method(final SubLObject v_properties) {
        return getf(v_properties, $EQUALITY_REASONING_METHOD, $default_equality_reasoning_method$.getGlobalValue());
    }

    public static SubLObject problem_store_equality_reasoning_domain_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_store_equality_reasoning_domains$.getGlobalValue());
    }

    public static SubLObject problem_store_properties_equality_reasoning_domain(final SubLObject v_properties) {
        return getf(v_properties, $EQUALITY_REASONING_DOMAIN, $default_equality_reasoning_domain$.getGlobalValue());
    }

    public static SubLObject intermediate_step_validation_level_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $intermediate_step_validation_levels$.getGlobalValue());
    }

    public static SubLObject problem_store_properties_intermediate_step_validation_level(final SubLObject v_properties) {
        return getf(v_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $default_intermediate_step_validation_level$.getGlobalValue());
    }

    public static SubLObject max_problem_count_p(final SubLObject v_object) {
        return makeBoolean((NIL != number_utilities.positive_infinity_p(v_object)) || (NIL != subl_promotions.non_negative_integer_p(v_object)));
    }

    public static SubLObject problem_store_properties_max_problem_count(final SubLObject v_properties) {
        return getf(v_properties, $MAX_PROBLEM_COUNT, $default_max_problem_count$.getGlobalValue());
    }

    public static SubLObject removal_allowed_by_propertiesP(final SubLObject problem_store_properties) {
        return getf(problem_store_properties, $kw105$REMOVAL_ALLOWED_, $removal_allowed_by_defaultP$.getGlobalValue());
    }

    public static SubLObject transformation_allowed_by_propertiesP(final SubLObject problem_store_properties) {
        return getf(problem_store_properties, $kw106$TRANSFORMATION_ALLOWED_, $transformation_allowed_by_defaultP$.getGlobalValue());
    }

    public static SubLObject inference_direction_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_directions$.getGlobalValue());
    }

    public static SubLObject problem_store_properties_direction(final SubLObject v_properties) {
        return getf(v_properties, $DIRECTION, $default_problem_store_inference_direction$.getGlobalValue());
    }

    public static SubLObject tactic_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $tactic_statuses$.getGlobalValue());
    }

    public static SubLObject tactic_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $tactic_types$.getGlobalValue());
    }

    public static SubLObject tactic_type_from_hl_module(final SubLObject hl_module) {
        if (NIL != inference_modules.removal_module_p(hl_module)) {
            return $REMOVAL;
        }
        if (NIL != inference_modules.transformation_module_p(hl_module)) {
            return $TRANSFORMATION;
        }
        if (NIL != inference_modules.structural_module_p(hl_module)) {
            return $STRUCTURAL;
        }
        if (NIL != inference_modules.meta_structural_module_p(hl_module)) {
            return $STRUCTURAL;
        }
        if (NIL != inference_modules.conjunctive_removal_module_p(hl_module)) {
            return $REMOVAL_CONJUNCTIVE;
        }
        if (NIL != inference_modules.rewrite_module_p(hl_module)) {
            return $REWRITE;
        }
        if (NIL != inference_modules.meta_removal_module_p(hl_module)) {
            return $META_REMOVAL;
        }
        if (NIL != inference_modules.meta_transformation_module_p(hl_module)) {
            return $TRANSFORMATION;
        }
        Errors.error($str118$HL_Module_of_unknown_type___s, hl_module);
        return NIL;
    }

    public static SubLObject completeness_string(final SubLObject completeness) {
        assert NIL != completeness_p(completeness) : "inference_datastructures_enumerated_types.completeness_p(completeness) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.completeness_p(completeness) " + completeness;
        if (completeness.eql($COMPLETE)) {
            return $$$Complete;
        }
        if (completeness.eql($INCOMPLETE)) {
            return $$$Incomplete;
        }
        if (completeness.eql($GROSSLY_INCOMPLETE)) {
            return $$$Grossly_Incomplete;
        }
        if (completeness.eql($IMPOSSIBLE)) {
            return $$$Impossible;
        }
        Errors.error($str129$Unexpected_completeness__a, completeness);
        return NIL;
    }

    public static SubLObject completeness_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $ordered_completenesses$.getGlobalValue());
    }

    public static SubLObject impossible_completeness_p(final SubLObject v_object) {
        return eq($IMPOSSIBLE, v_object);
    }

    public static SubLObject completeness_L(final SubLObject completeness1, final SubLObject completeness2) {
        assert NIL != completeness_p(completeness1) : "inference_datastructures_enumerated_types.completeness_p(completeness1) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.completeness_p(completeness1) " + completeness1;
        assert NIL != completeness_p(completeness2) : "inference_datastructures_enumerated_types.completeness_p(completeness2) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.completeness_p(completeness2) " + completeness2;
        return list_utilities.position_L(completeness1, completeness2, $ordered_completenesses$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject completeness_G(final SubLObject completeness1, final SubLObject completeness2) {
        return completeness_L(completeness2, completeness1);
    }

    public static SubLObject min_completeness(final SubLObject completeness_list) {
        return NIL != completeness_list ? list_utilities.extremal(completeness_list, $sym130$COMPLETENESS__, UNPROVIDED) : last($ordered_completenesses$.getGlobalValue(), UNPROVIDED).first();
    }

    public static SubLObject min2_completeness(final SubLObject completeness1, final SubLObject completeness2) {
        return NIL != completeness_L(completeness2, completeness1) ? completeness2 : completeness1;
    }

    public static SubLObject max_completeness(final SubLObject completeness_list) {
        return NIL != completeness_list ? list_utilities.extremal(completeness_list, $sym131$COMPLETENESS__, UNPROVIDED) : $ordered_completenesses$.getGlobalValue().first();
    }

    public static SubLObject max2_completeness(final SubLObject completeness1, final SubLObject completeness2) {
        return NIL != completeness_L(completeness2, completeness1) ? completeness1 : completeness2;
    }

    public static SubLObject productivity_p(final SubLObject v_object) {
        return makeBoolean((NIL != number_utilities.positive_infinity_p(v_object)) || (NIL != subl_promotions.non_negative_integer_p(v_object)));
    }

    public static SubLObject infinite_productivity_p(final SubLObject v_object) {
        return number_utilities.positive_infinity_p(v_object);
    }

    public static SubLObject productivity_for_number_of_children(final SubLObject number_of_children) {
        if (number_of_children.isInteger()) {
            return multiply($int$100, number_of_children);
        }
        SubLObject productivity = list_utilities.alist_lookup_without_values($productivity_to_number_table$.getGlobalValue(), number_of_children, UNPROVIDED, UNPROVIDED);
        if (NIL == productivity) {
            productivity = truncate(multiply($int$100, number_of_children), UNPROVIDED);
        }
        return productivity;
    }

    public static SubLObject number_of_children_for_productivity(final SubLObject productivity) {
        return integerDivide(productivity, $int$100);
    }

    public static SubLObject cost_for_productivity(final SubLObject productivity) {
        return divide(productivity, $int$100);
    }

    public static SubLObject removal_cost_cutoff_for_productivity(final SubLObject productivity) {
        assert NIL != productivity_p(productivity) : "inference_datastructures_enumerated_types.productivity_p(productivity) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.productivity_p(productivity) " + productivity;
        if (NIL != number_utilities.positive_infinity_p(productivity)) {
            return NIL;
        }
        return cost_for_productivity(productivity);
    }

    public static SubLObject productivity_E(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_E(productivity1, productivity2);
    }

    public static SubLObject productivity_L(final SubLObject productivity1, final SubLObject productivity2) {
        assert NIL != productivity_p(productivity1) : "inference_datastructures_enumerated_types.productivity_p(productivity1) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.productivity_p(productivity1) " + productivity1;
        assert NIL != productivity_p(productivity2) : "inference_datastructures_enumerated_types.productivity_p(productivity2) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.productivity_p(productivity2) " + productivity2;
        return number_utilities.potentially_infinite_integer_L(productivity1, productivity2);
    }

    public static SubLObject productivity_LE(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_LE(productivity1, productivity2);
    }

    public static SubLObject productivity_G(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_G(productivity1, productivity2);
    }

    public static SubLObject productivity_GE(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_GE(productivity1, productivity2);
    }

    public static SubLObject productivity_X(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_plus(productivity1, productivity2);
    }

    public static SubLObject productivity_max(final SubLObject productivity1, final SubLObject productivity2) {
        return NIL != productivity_L(productivity1, productivity2) ? productivity2 : productivity1;
    }

    public static SubLObject productivity_sum(final SubLObject productivities) {
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = productivities;
        SubLObject productivity = NIL;
        productivity = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total_productivity = productivity_X(total_productivity, productivity);
            cdolist_list_var = cdolist_list_var.rest();
            productivity = cdolist_list_var.first();
        } 
        return total_productivity;
    }

    public static SubLObject productivity_times_number(final SubLObject productivity, final SubLObject number) {
        return number_utilities.potentially_infinite_integer_times_number_rounded(productivity, number);
    }

    public static SubLObject productivity_divide_number(final SubLObject productivity, final SubLObject number) {
        return number_utilities.potentially_infinite_integer_divided_by_number_rounded(productivity, number);
    }

    public static SubLObject decrement_productivity_for_number_of_children(final SubLObject productivity, SubLObject number) {
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        return productivity_for_number_of_children(subtract(number_of_children_for_productivity(productivity), number));
    }

    public static SubLObject proof_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $proof_statuses$.getGlobalValue());
    }

    public static SubLObject proof_reject_reason_p(final SubLObject v_object) {
        return makeBoolean((NIL != arguments.hl_justification_p(v_object)) || (NIL != list_utilities.member_eqP(v_object, $proof_reject_reasons$.getGlobalValue())));
    }

    public static SubLObject destructibility_status_string(final SubLObject destructibility_status) {
        assert NIL != destructibility_status_p(destructibility_status) : "inference_datastructures_enumerated_types.destructibility_status_p(destructibility_status) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.destructibility_status_p(destructibility_status) " + destructibility_status;
        if (destructibility_status.eql($INDESTRUCTIBLE)) {
            return $$$Indestructible;
        }
        if (destructibility_status.eql($DESTRUCTIBLE)) {
            return $$$Destructible;
        }
        if (destructibility_status.eql($UNKNOWN)) {
            return $$$Unknown;
        }
        Errors.error($str144$Unexpected_destructibility_status, destructibility_status);
        return NIL;
    }

    public static SubLObject destructibility_status_hint(final SubLObject destructibility_status) {
        assert NIL != destructibility_status_p(destructibility_status) : "inference_datastructures_enumerated_types.destructibility_status_p(destructibility_status) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.destructibility_status_p(destructibility_status) " + destructibility_status;
        if (destructibility_status.eql($INDESTRUCTIBLE)) {
            return $$$I;
        }
        if (destructibility_status.eql($DESTRUCTIBLE)) {
            return $str146$;
        }
        if (destructibility_status.eql($UNKNOWN)) {
            return $str147$_;
        }
        Errors.error($str144$Unexpected_destructibility_status, destructibility_status);
        return NIL;
    }

    public static SubLObject destructibility_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $destructibility_statuses$.getGlobalValue());
    }

    public static SubLObject destructibility_status_destructibleP(final SubLObject destructibility_status) {
        assert NIL != destructibility_status_p(destructibility_status) : "inference_datastructures_enumerated_types.destructibility_status_p(destructibility_status) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.destructibility_status_p(destructibility_status) " + destructibility_status;
        return eq($DESTRUCTIBLE, destructibility_status);
    }

    public static SubLObject strategy_type_property_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP($strategy_type_properties$.getGlobalValue(), v_object, UNPROVIDED);
    }

    public static SubLObject strategy_default_method_handler(final SubLObject method) {
        assert NIL != strategy_type_property_p(method) : "inference_datastructures_enumerated_types.strategy_type_property_p(method) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.strategy_type_property_p(method) " + method;
        final SubLObject handler = list_utilities.alist_lookup_without_values($strategy_type_properties$.getGlobalValue(), method, UNPROVIDED, UNPROVIDED);
        if ($MUST_OVERRIDE == handler) {
            return Errors.error($str152$Strategy_must_implement_method__s, method);
        }
        return handler;
    }

    public static SubLObject inference_simple_return_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_return_types$.getGlobalValue());
    }

    public static SubLObject inference_properties_has_simple_return_typeP(final SubLObject query_properties) {
        return inference_simple_return_type_p(inference_properties_return_type(query_properties));
    }

    public static SubLObject inference_template_return_type_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && ($TEMPLATE == v_object.first()));
    }

    public static SubLObject inference_format_return_type_p(final SubLObject v_object) {
        return makeBoolean((((NIL != list_utilities.proper_list_p(v_object)) && ($FORMAT == v_object.first())) && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) && second(v_object).isString());
    }

    public static SubLObject inference_return_type_p(final SubLObject v_object) {
        return makeBoolean(((NIL != inference_simple_return_type_p(v_object)) || (NIL != inference_template_return_type_p(v_object))) || (NIL != inference_format_return_type_p(v_object)));
    }

    public static SubLObject inference_properties_return_type(final SubLObject v_properties) {
        return getf(v_properties, $RETURN, $inference_default_return_type$.getGlobalValue());
    }

    public static SubLObject inference_answer_language_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_answer_languages$.getGlobalValue());
    }

    public static SubLObject inference_properties_answer_language(final SubLObject v_properties) {
        return getf(v_properties, $ANSWER_LANGUAGE, $inference_default_answer_language$.getGlobalValue());
    }

    public static SubLObject result_uniqueness_criterion_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $result_uniqueness_criteria$.getGlobalValue());
    }

    public static SubLObject inference_properties_uniqueness_criterion(final SubLObject v_properties) {
        return getf(v_properties, $RESULT_UNIQUENESS, $default_result_uniqueness_criterion$.getGlobalValue());
    }

    public static SubLObject inference_disjunction_free_el_vars_policy_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_disjunction_free_el_vars_policies$.getGlobalValue());
    }

    public static SubLObject inference_properties_disjunction_free_el_vars_policy(final SubLObject v_properties) {
        return getf(v_properties, $DISJUNCTION_FREE_EL_VARS_POLICY, $default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
    }

    public static SubLObject inference_transitive_closure_mode_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_transitive_closure_modes$.getGlobalValue());
    }

    public static SubLObject inference_properties_transitive_closure_mode(final SubLObject v_properties) {
        return getf(v_properties, $TRANSITIVE_CLOSURE_MODE, $inference_transitive_closure_mode_default$.getGlobalValue());
    }

    public static SubLObject inference_properties_maintain_term_working_setP(final SubLObject v_properties) {
        return getf(v_properties, $kw168$MAINTAIN_TERM_WORKING_SET_, $maintain_term_working_set_defaultP$.getGlobalValue());
    }

    public static SubLObject inference_properties_events(final SubLObject v_properties) {
        return getf(v_properties, $EVENTS, $inference_events_default$.getGlobalValue());
    }

    public static SubLObject inference_event_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_event_types$.getGlobalValue());
    }

    public static SubLObject inference_properties_halt_conditions(final SubLObject v_properties) {
        return getf(v_properties, $HALT_CONDITIONS, $inference_halt_conditions_default$.getGlobalValue());
    }

    public static SubLObject inference_halt_condition_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_halt_conditions$.getGlobalValue());
    }

    public static SubLObject inference_accumulator_type_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP($inference_accumulator_types$.getGlobalValue(), v_object, UNPROVIDED);
    }

    public static SubLObject initialize_inference_accumulator(final SubLObject accumulator_type) {
        assert NIL != inference_accumulator_type_p(accumulator_type) : "inference_datastructures_enumerated_types.inference_accumulator_type_p(accumulator_type) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_accumulator_type_p(accumulator_type) " + accumulator_type;
        final SubLObject initialization_fn = list_utilities.alist_lookup_without_values($inference_accumulator_types$.getGlobalValue(), accumulator_type, UNPROVIDED, UNPROVIDED);
        return funcall(initialization_fn);
    }

    public static SubLObject inference_properties_forget_extra_resultsP(final SubLObject v_properties) {
        return getf(v_properties, $kw175$FORGET_EXTRA_RESULTS_, $inference_default_forget_extra_resultsP$.getGlobalValue());
    }

    public static SubLObject inference_properties_cache_inference_resultsP(final SubLObject v_properties) {
        return getf(v_properties, $kw176$CACHE_INFERENCE_RESULTS_, $inference_default_cache_inference_resultsP$.getGlobalValue());
    }

    public static SubLObject inference_properties_browsableP(final SubLObject v_properties) {
        return makeBoolean((NIL != getf(v_properties, $BROWSABLE_, $inference_default_browsableP$.getGlobalValue())) || (NIL != inference_properties_continuableP(v_properties)));
    }

    public static SubLObject inference_properties_continuableP(final SubLObject v_properties) {
        return getf(v_properties, $CONTINUABLE_, $inference_default_continuableP$.getGlobalValue());
    }

    public static SubLObject inference_properties_blockP(final SubLObject v_properties) {
        return getf(v_properties, $BLOCK_, NIL);
    }

    public static SubLObject inference_query_property_lookup(final SubLObject query_properties, final SubLObject property) {
        final SubLObject value = getf(query_properties, property, $UNSPECIFIED);
        if ($UNSPECIFIED == value) {
            return inference_engine_default_for_property(property);
        }
        return value;
    }

    public static SubLObject inference_engine_default_for_property(final SubLObject query_property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != query_property_p(query_property) : "inference_datastructures_enumerated_types.query_property_p(query_property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(query_property) " + query_property;
        SubLObject value = NIL;
        SubLObject specified = NIL;
        if (query_property.eql($DISJUNCTION_FREE_EL_VARS_POLICY)) {
            value = $default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
            specified = T;
        } else
            if (query_property.eql($RESULT_UNIQUENESS)) {
                value = $default_result_uniqueness_criterion$.getGlobalValue();
                specified = T;
            } else
                if (query_property.eql($PROBLEM_STORE)) {
                    value = NIL;
                    specified = NIL;
                } else
                    if (query_property.eql($kw181$CONDITIONAL_SENTENCE_)) {
                        value = NIL;
                        specified = T;
                    } else
                        if (query_property.eql($NON_EXPLANATORY_SENTENCE)) {
                            value = NIL;
                            specified = T;
                        } else
                            if (query_property.eql($kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_)) {
                                value = $inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue();
                                specified = T;
                            } else
                                if (query_property.eql($kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_)) {
                                    value = $inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue();
                                    specified = T;
                                } else
                                    if (query_property.eql($kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_)) {
                                        value = $inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue();
                                        specified = T;
                                    } else
                                        if (query_property.eql($kw19$ALLOW_INDETERMINATE_RESULTS_)) {
                                            value = $inference_allows_indeterminate_results_by_defaultP$.getGlobalValue();
                                            specified = T;
                                        } else
                                            if (query_property.eql($ALLOWED_RULES)) {
                                                value = $default_allowed_rules$.getGlobalValue();
                                                specified = T;
                                            } else
                                                if (query_property.eql($ALLOWED_MODULES)) {
                                                    value = $default_allowed_modules$.getGlobalValue();
                                                    specified = T;
                                                } else
                                                    if (query_property.eql($FORBIDDEN_RULES)) {
                                                        value = $default_forbidden_rules$.getGlobalValue();
                                                        specified = T;
                                                    } else
                                                        if (query_property.eql($kw25$ALLOW_ABNORMALITY_CHECKING_)) {
                                                            value = $inference_allows_abnormality_checking_by_defaultP$.getGlobalValue();
                                                            specified = T;
                                                        } else
                                                            if (query_property.eql($TRANSITIVE_CLOSURE_MODE)) {
                                                                value = $inference_transitive_closure_mode_default$.getGlobalValue();
                                                                specified = T;
                                                            } else
                                                                if (query_property.eql($MAX_NUMBER)) {
                                                                    value = $default_max_number$.getGlobalValue();
                                                                    specified = T;
                                                                } else
                                                                    if (query_property.eql($MAX_TIME)) {
                                                                        value = $default_max_time$.getGlobalValue();
                                                                        specified = T;
                                                                    } else
                                                                        if (query_property.eql($MAX_STEP)) {
                                                                            value = $default_max_step$.getGlobalValue();
                                                                            specified = T;
                                                                        } else
                                                                            if (query_property.eql($FORWARD_MAX_TIME)) {
                                                                                value = $default_forward_max_time$.getGlobalValue();
                                                                                specified = T;
                                                                            } else
                                                                                if (query_property.eql($MAX_PROOF_DEPTH)) {
                                                                                    value = $default_max_proof_depth$.getGlobalValue();
                                                                                    specified = T;
                                                                                } else
                                                                                    if (query_property.eql($MAX_TRANSFORMATION_DEPTH)) {
                                                                                        value = $default_max_transformation_depth$.getGlobalValue();
                                                                                        specified = T;
                                                                                    } else
                                                                                        if (query_property.eql($MIN_RULE_UTILITY)) {
                                                                                            value = $default_min_rule_utility$.getGlobalValue();
                                                                                            specified = T;
                                                                                        } else
                                                                                            if (query_property.eql($PROBABLY_APPROXIMATELY_DONE)) {
                                                                                                value = $default_probably_approximately_done$.getGlobalValue();
                                                                                                specified = T;
                                                                                            } else
                                                                                                if (query_property.eql($RETURN)) {
                                                                                                    value = $inference_default_return_type$.getGlobalValue();
                                                                                                    specified = T;
                                                                                                } else
                                                                                                    if (query_property.eql($METRICS)) {
                                                                                                        value = $default_inference_metrics_template$.getGlobalValue();
                                                                                                        specified = T;
                                                                                                    } else
                                                                                                        if (query_property.eql($ANSWER_LANGUAGE)) {
                                                                                                            value = $inference_default_answer_language$.getGlobalValue();
                                                                                                            specified = T;
                                                                                                        } else
                                                                                                            if (query_property.eql($kw176$CACHE_INFERENCE_RESULTS_)) {
                                                                                                                value = $inference_default_cache_inference_resultsP$.getGlobalValue();
                                                                                                                specified = T;
                                                                                                            } else
                                                                                                                if (query_property.eql($kw175$FORGET_EXTRA_RESULTS_)) {
                                                                                                                    value = $inference_default_forget_extra_resultsP$.getGlobalValue();
                                                                                                                    specified = T;
                                                                                                                } else
                                                                                                                    if (query_property.eql($BROWSABLE_)) {
                                                                                                                        value = $inference_default_browsableP$.getGlobalValue();
                                                                                                                        specified = T;
                                                                                                                    } else
                                                                                                                        if (query_property.eql($CONTINUABLE_)) {
                                                                                                                            value = $inference_default_continuableP$.getGlobalValue();
                                                                                                                            specified = T;
                                                                                                                        } else
                                                                                                                            if (query_property.eql($BLOCK_)) {
                                                                                                                                value = NIL;
                                                                                                                                specified = T;
                                                                                                                            } else
                                                                                                                                if (query_property.eql($EQUALITY_REASONING_METHOD)) {
                                                                                                                                    value = $default_equality_reasoning_method$.getGlobalValue();
                                                                                                                                    specified = T;
                                                                                                                                } else
                                                                                                                                    if (query_property.eql($EQUALITY_REASONING_DOMAIN)) {
                                                                                                                                        value = $default_equality_reasoning_domain$.getGlobalValue();
                                                                                                                                        specified = T;
                                                                                                                                    } else
                                                                                                                                        if (query_property.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
                                                                                                                                            value = $default_intermediate_step_validation_level$.getGlobalValue();
                                                                                                                                            specified = T;
                                                                                                                                        } else
                                                                                                                                            if (query_property.eql($MAX_PROBLEM_COUNT)) {
                                                                                                                                                value = $default_max_problem_count$.getGlobalValue();
                                                                                                                                                specified = T;
                                                                                                                                            } else
                                                                                                                                                if (query_property.eql($kw105$REMOVAL_ALLOWED_)) {
                                                                                                                                                    value = $removal_allowed_by_defaultP$.getGlobalValue();
                                                                                                                                                    specified = T;
                                                                                                                                                } else
                                                                                                                                                    if (query_property.eql($kw106$TRANSFORMATION_ALLOWED_)) {
                                                                                                                                                        value = $transformation_allowed_by_defaultP$.getGlobalValue();
                                                                                                                                                        specified = T;
                                                                                                                                                    } else
                                                                                                                                                        if (query_property.eql($kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
                                                                                                                                                            value = $add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue();
                                                                                                                                                            specified = T;
                                                                                                                                                        } else
                                                                                                                                                            if (query_property.eql($kw85$NEGATION_BY_FAILURE_)) {
                                                                                                                                                                value = $negation_by_failure_by_defaultP$.getGlobalValue();
                                                                                                                                                                specified = T;
                                                                                                                                                            } else
                                                                                                                                                                if (query_property.eql($kw86$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
                                                                                                                                                                    value = $complete_extent_minimization$.getDynamicValue(thread);
                                                                                                                                                                    specified = T;
                                                                                                                                                                } else
                                                                                                                                                                    if (query_property.eql($DIRECTION)) {
                                                                                                                                                                        value = $default_problem_store_inference_direction$.getGlobalValue();
                                                                                                                                                                        specified = T;
                                                                                                                                                                    } else
                                                                                                                                                                        if (query_property.eql($kw87$EVALUATE_SUBL_ALLOWED_)) {
                                                                                                                                                                            value = $evaluate_subl_allowed_defaultP$.getGlobalValue();
                                                                                                                                                                            specified = T;
                                                                                                                                                                        } else
                                                                                                                                                                            if (query_property.eql($kw88$REWRITE_ALLOWED_)) {
                                                                                                                                                                                value = $rewrite_allowed_defaultP$.getDynamicValue(thread);
                                                                                                                                                                                specified = T;
                                                                                                                                                                            } else
                                                                                                                                                                                if (query_property.eql($kw89$ABDUCTION_ALLOWED_)) {
                                                                                                                                                                                    value = $abduction_allowed_defaultP$.getGlobalValue();
                                                                                                                                                                                    specified = T;
                                                                                                                                                                                } else
                                                                                                                                                                                    if (query_property.eql($kw90$NEW_TERMS_ALLOWED_)) {
                                                                                                                                                                                        value = $new_terms_allowed_defaultP$.getGlobalValue();
                                                                                                                                                                                        specified = T;
                                                                                                                                                                                    } else
                                                                                                                                                                                        if (query_property.eql($INFERENCE_MODE)) {
                                                                                                                                                                                            value = $default_inference_mode$.getGlobalValue();
                                                                                                                                                                                            specified = T;
                                                                                                                                                                                        } else
                                                                                                                                                                                            if (query_property.eql($kw168$MAINTAIN_TERM_WORKING_SET_)) {
                                                                                                                                                                                                value = $maintain_term_working_set_defaultP$.getGlobalValue();
                                                                                                                                                                                                specified = T;
                                                                                                                                                                                            } else
                                                                                                                                                                                                if (query_property.eql($EVENTS)) {
                                                                                                                                                                                                    value = $inference_events_default$.getGlobalValue();
                                                                                                                                                                                                    specified = T;
                                                                                                                                                                                                } else
                                                                                                                                                                                                    if (query_property.eql($HALT_CONDITIONS)) {
                                                                                                                                                                                                        value = $inference_halt_conditions_default$.getGlobalValue();
                                                                                                                                                                                                        specified = T;
                                                                                                                                                                                                    } else
                                                                                                                                                                                                        if (query_property.eql($PROBLEM_STORE_NAME)) {
                                                                                                                                                                                                            value = $default_problem_store_name$.getGlobalValue();
                                                                                                                                                                                                            specified = T;
                                                                                                                                                                                                        } else
                                                                                                                                                                                                            if (query_property.eql($PRODUCTIVITY_LIMIT)) {
                                                                                                                                                                                                                value = $default_productivity_limit$.getGlobalValue();
                                                                                                                                                                                                                specified = T;
                                                                                                                                                                                                            } else
                                                                                                                                                                                                                if (query_property.eql($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
                                                                                                                                                                                                                    value = $default_removal_backtracking_productivity_limit$.getGlobalValue();
                                                                                                                                                                                                                    specified = T;
                                                                                                                                                                                                                } else
                                                                                                                                                                                                                    if (query_property.eql($PROOF_SPEC)) {
                                                                                                                                                                                                                        value = $default_proof_spec$.getGlobalValue();
                                                                                                                                                                                                                        specified = T;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        value = $UNKNOWN;
                                                                                                                                                                                                                        specified = NIL;
                                                                                                                                                                                                                    }



















































        return subl_promotions.values2(value, specified);
    }

    public static SubLObject query_property_is_defaultP(final SubLObject property, final SubLObject value) {
        return equal(value, inference_engine_default_for_property(property));
    }

    public static SubLObject inference_input_non_default_query_properties(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject query_properties = inference_datastructures_inference.inference_input_query_properties(inference);
        SubLObject non_default_query_properties = NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject v_default;
        for (remainder = NIL, remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            v_default = inference_engine_default_for_property(property);
            if (!v_default.equal(value)) {
                non_default_query_properties = putf(non_default_query_properties, property, value);
            }
        }
        return non_default_query_properties;
    }

    public static SubLObject all_default_query_properties() {
        SubLObject v_properties = NIL;
        SubLObject cdolist_list_var = all_query_properties();
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = inference_engine_default_for_property(property);
            v_properties = cons(property, v_properties);
            v_properties = cons(value, v_properties);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        return nreverse(v_properties);
    }

    public static SubLObject explicify_default_query_properties(final SubLObject query_properties) {
        return list_utilities.nmerge_plist(all_default_query_properties(), query_properties);
    }

    public static SubLObject declare_inference_datastructures_enumerated_types_file() {
        declareFunction(me, "query_property_p", "QUERY-PROPERTY-P", 1, 0, false);
        declareFunction(me, "query_properties_p", "QUERY-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "all_query_properties", "ALL-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(me, "merge_query_properties", "MERGE-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(me, "query_static_property_p", "QUERY-STATIC-PROPERTY-P", 1, 0, false);
        new inference_datastructures_enumerated_types.$query_static_property_p$UnaryFunction();
        declareFunction(me, "query_static_properties_p", "QUERY-STATIC-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "extract_query_static_properties", "EXTRACT-QUERY-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "all_query_static_properties", "ALL-QUERY-STATIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "query_static_or_meta_property_p", "QUERY-STATIC-OR-META-PROPERTY-P", 1, 0, false);
        declareFunction(me, "query_static_or_meta_properties_p", "QUERY-STATIC-OR-META-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "extract_query_static_or_meta_properties", "EXTRACT-QUERY-STATIC-OR-META-PROPERTIES", 1, 0, false);
        declareFunction(me, "query_dynamic_property_p", "QUERY-DYNAMIC-PROPERTY-P", 1, 0, false);
        new inference_datastructures_enumerated_types.$query_dynamic_property_p$UnaryFunction();
        declareFunction(me, "query_dynamic_properties_p", "QUERY-DYNAMIC-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "extract_query_dynamic_properties", "EXTRACT-QUERY-DYNAMIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "all_query_dynamic_properties", "ALL-QUERY-DYNAMIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "query_metric_p", "QUERY-METRIC-P", 1, 0, false);
        declareFunction(me, "inference_query_metric_p", "INFERENCE-QUERY-METRIC-P", 1, 0, false);
        new inference_datastructures_enumerated_types.$inference_query_metric_p$UnaryFunction();
        declareFunction(me, "all_query_metrics", "ALL-QUERY-METRICS", 0, 0, false);
        declareFunction(me, "arete_query_metric_p", "ARETE-QUERY-METRIC-P", 1, 0, false);
        declareFunction(me, "all_arete_query_metrics", "ALL-ARETE-QUERY-METRICS", 0, 0, false);
        declareFunction(me, "removal_ask_query_metric_p", "REMOVAL-ASK-QUERY-METRIC-P", 1, 0, false);
        declareFunction(me, "inference_property_p", "INFERENCE-PROPERTY-P", 1, 0, false);
        declareFunction(me, "inference_properties_p", "INFERENCE-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "inference_static_property_p", "INFERENCE-STATIC-PROPERTY-P", 1, 0, false);
        new inference_datastructures_enumerated_types.$inference_static_property_p$UnaryFunction();
        declareFunction(me, "inference_static_properties_p", "INFERENCE-STATIC-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "extract_inference_static_properties", "EXTRACT-INFERENCE-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "all_inference_static_properties", "ALL-INFERENCE-STATIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "inference_static_or_meta_property_p", "INFERENCE-STATIC-OR-META-PROPERTY-P", 1, 0, false);
        declareFunction(me, "inference_static_or_meta_properties_p", "INFERENCE-STATIC-OR-META-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "extract_inference_static_or_meta_properties", "EXTRACT-INFERENCE-STATIC-OR-META-PROPERTIES", 1, 0, false);
        declareFunction(me, "inference_properties_problem_store", "INFERENCE-PROPERTIES-PROBLEM-STORE", 1, 0, false);
        declareFunction(me, "inference_properties_allow_hl_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(me, "inference_properties_allow_unbound_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(me, "inference_properties_allow_evaluatable_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(me, "inference_properties_allow_indeterminate_resultsP", "INFERENCE-PROPERTIES-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false);
        declareFunction(me, "inference_properties_allowed_rules", "INFERENCE-PROPERTIES-ALLOWED-RULES", 1, 0, false);
        declareFunction(me, "inference_properties_forbidden_rules", "INFERENCE-PROPERTIES-FORBIDDEN-RULES", 1, 0, false);
        declareFunction(me, "inference_properties_allowed_modules", "INFERENCE-PROPERTIES-ALLOWED-MODULES", 1, 0, false);
        declareFunction(me, "inference_properties_allow_abnormality_checkingP", "INFERENCE-PROPERTIES-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false);
        declareFunction(me, "inference_resource_constraint_p", "INFERENCE-RESOURCE-CONSTRAINT-P", 1, 0, false);
        declareFunction(me, "inference_resource_constraints_p", "INFERENCE-RESOURCE-CONSTRAINTS-P", 1, 0, false);
        declareFunction(me, "extract_inference_resource_constraints", "EXTRACT-INFERENCE-RESOURCE-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "inference_properties_max_number", "INFERENCE-PROPERTIES-MAX-NUMBER", 1, 0, false);
        declareFunction(me, "inference_properties_max_time", "INFERENCE-PROPERTIES-MAX-TIME", 1, 0, false);
        declareFunction(me, "inference_properties_max_step", "INFERENCE-PROPERTIES-MAX-STEP", 1, 0, false);
        declareFunction(me, "inference_properties_mode", "INFERENCE-PROPERTIES-MODE", 1, 0, false);
        declareFunction(me, "inference_properties_forward_max_time", "INFERENCE-PROPERTIES-FORWARD-MAX-TIME", 1, 0, false);
        declareFunction(me, "inference_properties_max_proof_depth", "INFERENCE-PROPERTIES-MAX-PROOF-DEPTH", 1, 0, false);
        declareFunction(me, "inference_properties_max_transformation_depth", "INFERENCE-PROPERTIES-MAX-TRANSFORMATION-DEPTH", 1, 0, false);
        declareFunction(me, "inference_properties_min_rule_utility", "INFERENCE-PROPERTIES-MIN-RULE-UTILITY", 1, 0, false);
        declareFunction(me, "inference_properties_probably_approximately_done", "INFERENCE-PROPERTIES-PROBABLY-APPROXIMATELY-DONE", 1, 0, false);
        declareFunction(me, "inference_dynamic_property_p", "INFERENCE-DYNAMIC-PROPERTY-P", 1, 0, false);
        new inference_datastructures_enumerated_types.$inference_dynamic_property_p$UnaryFunction();
        declareFunction(me, "inference_dynamic_properties_p", "INFERENCE-DYNAMIC-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "extract_inference_dynamic_properties", "EXTRACT-INFERENCE-DYNAMIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "all_inference_dynamic_properties", "ALL-INFERENCE-DYNAMIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "inference_properties_metrics", "INFERENCE-PROPERTIES-METRICS", 1, 0, false);
        declareFunction(me, "strategy_property_p", "STRATEGY-PROPERTY-P", 1, 0, false);
        declareFunction(me, "strategy_properties_p", "STRATEGY-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "strategy_static_property_p", "STRATEGY-STATIC-PROPERTY-P", 1, 0, false);
        new inference_datastructures_enumerated_types.$strategy_static_property_p$UnaryFunction();
        declareFunction(me, "strategy_static_properties_p", "STRATEGY-STATIC-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "extract_strategy_static_properties", "EXTRACT-STRATEGY-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "all_strategy_static_properties", "ALL-STRATEGY-STATIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "strategy_static_properties_removal_backtracking_productivity_limit", "STRATEGY-STATIC-PROPERTIES-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(me, "strategy_static_properties_proof_spec", "STRATEGY-STATIC-PROPERTIES-PROOF-SPEC", 1, 0, false);
        declareFunction(me, "strategy_dynamic_property_p", "STRATEGY-DYNAMIC-PROPERTY-P", 1, 0, false);
        new inference_datastructures_enumerated_types.$strategy_dynamic_property_p$UnaryFunction();
        declareFunction(me, "strategy_dynamic_properties_p", "STRATEGY-DYNAMIC-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "extract_strategy_dynamic_properties", "EXTRACT-STRATEGY-DYNAMIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "all_strategy_dynamic_properties", "ALL-STRATEGY-DYNAMIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "strategy_dynamic_properties_productivity_limit", "STRATEGY-DYNAMIC-PROPERTIES-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(me, "problem_store_property_p", "PROBLEM-STORE-PROPERTY-P", 1, 0, false);
        new inference_datastructures_enumerated_types.$problem_store_property_p$UnaryFunction();
        declareFunction(me, "problem_store_properties_p", "PROBLEM-STORE-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "all_problem_store_properties", "ALL-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        declareFunction(me, "extract_problem_store_properties", "EXTRACT-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        declareFunction(me, "problem_store_static_property_p", "PROBLEM-STORE-STATIC-PROPERTY-P", 1, 0, false);
        declareFunction(me, "problem_store_static_properties_p", "PROBLEM-STORE-STATIC-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "extract_problem_store_static_properties", "EXTRACT-PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "all_problem_store_static_properties", "ALL-PROBLEM-STORE-STATIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "problem_store_dynamic_property_p", "PROBLEM-STORE-DYNAMIC-PROPERTY-P", 1, 0, false);
        declareFunction(me, "problem_store_dynamic_properties_p", "PROBLEM-STORE-DYNAMIC-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "all_problem_store_dynamic_properties", "ALL-PROBLEM-STORE-DYNAMIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "inference_meta_property_p", "INFERENCE-META-PROPERTY-P", 1, 0, false);
        declareFunction(me, "all_inference_meta_properties", "ALL-INFERENCE-META-PROPERTIES", 0, 0, false);
        declareFunction(me, "extract_inference_meta_properties", "EXTRACT-INFERENCE-META-PROPERTIES", 1, 0, false);
        declareFunction(me, "query_halt_reason_p", "QUERY-HALT-REASON-P", 1, 0, false);
        declareFunction(me, "exhausted_query_halt_reason_p", "EXHAUSTED-QUERY-HALT-REASON-P", 1, 0, false);
        declareFunction(me, "inference_status_p", "INFERENCE-STATUS-P", 1, 0, false);
        declareFunction(me, "continuable_inference_status_p", "CONTINUABLE-INFERENCE-STATUS-P", 1, 0, false);
        declareFunction(me, "avoided_inference_reason_p", "AVOIDED-INFERENCE-REASON-P", 1, 0, false);
        declareFunction(me, "inference_suspend_status_p", "INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
        declareFunction(me, "inference_suspend_status_applicableP", "INFERENCE-SUSPEND-STATUS-APPLICABLE?", 1, 0, false);
        declareFunction(me, "continuable_inference_suspend_status_p", "CONTINUABLE-INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
        declareFunction(me, "exhausted_inference_suspend_status_p", "EXHAUSTED-INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
        declareFunction(me, "inference_error_suspend_status_p", "INFERENCE-ERROR-SUSPEND-STATUS-P", 1, 0, false);
        declareFunction(me, "new_inference_error_suspend_status", "NEW-INFERENCE-ERROR-SUSPEND-STATUS", 1, 0, false);
        declareFunction(me, "inference_error_suspend_status_message", "INFERENCE-ERROR-SUSPEND-STATUS-MESSAGE", 1, 0, false);
        declareFunction(me, "inference_justification_status_p", "INFERENCE-JUSTIFICATION-STATUS-P", 1, 0, false);
        declareFunction(me, "new_inference_justification_status", "NEW-INFERENCE-JUSTIFICATION-STATUS", 1, 0, false);
        declareFunction(me, "inference_justification_status_message", "INFERENCE-JUSTIFICATION-STATUS-MESSAGE", 1, 0, false);
        declareFunction(me, "tactical_status_p", "TACTICAL-STATUS-P", 1, 0, false);
        declareFunction(me, "provability_status_p", "PROVABILITY-STATUS-P", 1, 0, false);
        declareFunction(me, "tactical_status_weakerP", "TACTICAL-STATUS-WEAKER?", 2, 0, false);
        declareFunction(me, "tactical_status_strongerP", "TACTICAL-STATUS-STRONGER?", 2, 0, false);
        declareFunction(me, "tactical_status_unionP", "TACTICAL-STATUS-UNION?", 2, 0, false);
        declareFunction(me, "problem_status_p", "PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(me, "problem_status_from_tactical_status_and_provability_status", "PROBLEM-STATUS-FROM-TACTICAL-STATUS-AND-PROVABILITY-STATUS", 2, 0, false);
        declareFunction(me, "tactical_status_from_problem_status", "TACTICAL-STATUS-FROM-PROBLEM-STATUS", 1, 0, false);
        declareFunction(me, "provability_status_from_problem_status", "PROVABILITY-STATUS-FROM-PROBLEM-STATUS", 1, 0, false);
        declareFunction(me, "good_problem_status_p", "GOOD-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(me, "no_good_problem_status_p", "NO-GOOD-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(me, "neutral_problem_status_p", "NEUTRAL-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(me, "unexamined_problem_status_p", "UNEXAMINED-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(me, "examined_problem_status_p", "EXAMINED-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(me, "possible_problem_status_p", "POSSIBLE-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(me, "pending_problem_status_p", "PENDING-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(me, "finished_problem_status_p", "FINISHED-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(me, "problem_store_properties_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-PROPERTIES-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
        declareFunction(me, "problem_store_properties_negation_by_failureP", "PROBLEM-STORE-PROPERTIES-NEGATION-BY-FAILURE?", 1, 0, false);
        declareFunction(me, "problem_store_properties_completeness_minimization_allowedP", "PROBLEM-STORE-PROPERTIES-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
        declareFunction(me, "problem_store_properties_evaluate_subl_allowedP", "PROBLEM-STORE-PROPERTIES-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
        declareFunction(me, "problem_store_properties_rewrite_allowedP", "PROBLEM-STORE-PROPERTIES-REWRITE-ALLOWED?", 1, 0, false);
        declareFunction(me, "problem_store_properties_abduction_allowedP", "PROBLEM-STORE-PROPERTIES-ABDUCTION-ALLOWED?", 1, 0, false);
        declareFunction(me, "problem_store_properties_new_terms_allowedP", "PROBLEM-STORE-PROPERTIES-NEW-TERMS-ALLOWED?", 1, 0, false);
        declareFunction(me, "problem_store_properties_compute_answer_justificationsP", "PROBLEM-STORE-PROPERTIES-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
        declareFunction(me, "all_inference_modes", "ALL-INFERENCE-MODES", 0, 0, false);
        declareFunction(me, "inference_mode_p", "INFERENCE-MODE-P", 1, 0, false);
        declareFunction(me, "problem_link_type_p", "PROBLEM-LINK-TYPE-P", 1, 0, false);
        declareFunction(me, "problem_store_name_p", "PROBLEM-STORE-NAME-P", 1, 0, false);
        declareFunction(me, "problem_store_properties_name", "PROBLEM-STORE-PROPERTIES-NAME", 1, 0, false);
        declareFunction(me, "problem_store_equality_reasoning_method_p", "PROBLEM-STORE-EQUALITY-REASONING-METHOD-P", 1, 0, false);
        declareFunction(me, "problem_store_properties_equality_reasoning_method", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-METHOD", 1, 0, false);
        declareFunction(me, "problem_store_equality_reasoning_domain_p", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN-P", 1, 0, false);
        declareFunction(me, "problem_store_properties_equality_reasoning_domain", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-DOMAIN", 1, 0, false);
        declareFunction(me, "intermediate_step_validation_level_p", "INTERMEDIATE-STEP-VALIDATION-LEVEL-P", 1, 0, false);
        declareFunction(me, "problem_store_properties_intermediate_step_validation_level", "PROBLEM-STORE-PROPERTIES-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
        declareFunction(me, "max_problem_count_p", "MAX-PROBLEM-COUNT-P", 1, 0, false);
        declareFunction(me, "problem_store_properties_max_problem_count", "PROBLEM-STORE-PROPERTIES-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction(me, "removal_allowed_by_propertiesP", "REMOVAL-ALLOWED-BY-PROPERTIES?", 1, 0, false);
        declareFunction(me, "transformation_allowed_by_propertiesP", "TRANSFORMATION-ALLOWED-BY-PROPERTIES?", 1, 0, false);
        declareFunction(me, "inference_direction_p", "INFERENCE-DIRECTION-P", 1, 0, false);
        declareFunction(me, "problem_store_properties_direction", "PROBLEM-STORE-PROPERTIES-DIRECTION", 1, 0, false);
        declareFunction(me, "tactic_status_p", "TACTIC-STATUS-P", 1, 0, false);
        declareFunction(me, "tactic_type_p", "TACTIC-TYPE-P", 1, 0, false);
        declareFunction(me, "tactic_type_from_hl_module", "TACTIC-TYPE-FROM-HL-MODULE", 1, 0, false);
        declareFunction(me, "completeness_string", "COMPLETENESS-STRING", 1, 0, false);
        declareFunction(me, "completeness_p", "COMPLETENESS-P", 1, 0, false);
        declareFunction(me, "impossible_completeness_p", "IMPOSSIBLE-COMPLETENESS-P", 1, 0, false);
        declareFunction(me, "completeness_L", "COMPLETENESS-<", 2, 0, false);
        declareFunction(me, "completeness_G", "COMPLETENESS->", 2, 0, false);
        declareFunction(me, "min_completeness", "MIN-COMPLETENESS", 1, 0, false);
        declareFunction(me, "min2_completeness", "MIN2-COMPLETENESS", 2, 0, false);
        declareFunction(me, "max_completeness", "MAX-COMPLETENESS", 1, 0, false);
        declareFunction(me, "max2_completeness", "MAX2-COMPLETENESS", 2, 0, false);
        declareFunction(me, "productivity_p", "PRODUCTIVITY-P", 1, 0, false);
        declareFunction(me, "infinite_productivity_p", "INFINITE-PRODUCTIVITY-P", 1, 0, false);
        declareFunction(me, "productivity_for_number_of_children", "PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 0, false);
        declareFunction(me, "number_of_children_for_productivity", "NUMBER-OF-CHILDREN-FOR-PRODUCTIVITY", 1, 0, false);
        declareFunction(me, "cost_for_productivity", "COST-FOR-PRODUCTIVITY", 1, 0, false);
        declareFunction(me, "removal_cost_cutoff_for_productivity", "REMOVAL-COST-CUTOFF-FOR-PRODUCTIVITY", 1, 0, false);
        declareFunction(me, "productivity_E", "PRODUCTIVITY-=", 2, 0, false);
        declareFunction(me, "productivity_L", "PRODUCTIVITY-<", 2, 0, false);
        declareFunction(me, "productivity_LE", "PRODUCTIVITY-<=", 2, 0, false);
        declareFunction(me, "productivity_G", "PRODUCTIVITY->", 2, 0, false);
        declareFunction(me, "productivity_GE", "PRODUCTIVITY->=", 2, 0, false);
        declareFunction(me, "productivity_X", "PRODUCTIVITY-+", 2, 0, false);
        declareFunction(me, "productivity_max", "PRODUCTIVITY-MAX", 2, 0, false);
        declareFunction(me, "productivity_sum", "PRODUCTIVITY-SUM", 1, 0, false);
        declareFunction(me, "productivity_times_number", "PRODUCTIVITY-TIMES-NUMBER", 2, 0, false);
        declareFunction(me, "productivity_divide_number", "PRODUCTIVITY-DIVIDE-NUMBER", 2, 0, false);
        declareFunction(me, "decrement_productivity_for_number_of_children", "DECREMENT-PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 1, false);
        declareFunction(me, "proof_status_p", "PROOF-STATUS-P", 1, 0, false);
        declareFunction(me, "proof_reject_reason_p", "PROOF-REJECT-REASON-P", 1, 0, false);
        declareFunction(me, "destructibility_status_string", "DESTRUCTIBILITY-STATUS-STRING", 1, 0, false);
        declareFunction(me, "destructibility_status_hint", "DESTRUCTIBILITY-STATUS-HINT", 1, 0, false);
        declareFunction(me, "destructibility_status_p", "DESTRUCTIBILITY-STATUS-P", 1, 0, false);
        declareFunction(me, "destructibility_status_destructibleP", "DESTRUCTIBILITY-STATUS-DESTRUCTIBLE?", 1, 0, false);
        declareFunction(me, "strategy_type_property_p", "STRATEGY-TYPE-PROPERTY-P", 1, 0, false);
        declareFunction(me, "strategy_default_method_handler", "STRATEGY-DEFAULT-METHOD-HANDLER", 1, 0, false);
        declareFunction(me, "inference_simple_return_type_p", "INFERENCE-SIMPLE-RETURN-TYPE-P", 1, 0, false);
        declareFunction(me, "inference_properties_has_simple_return_typeP", "INFERENCE-PROPERTIES-HAS-SIMPLE-RETURN-TYPE?", 1, 0, false);
        declareFunction(me, "inference_template_return_type_p", "INFERENCE-TEMPLATE-RETURN-TYPE-P", 1, 0, false);
        declareFunction(me, "inference_format_return_type_p", "INFERENCE-FORMAT-RETURN-TYPE-P", 1, 0, false);
        declareFunction(me, "inference_return_type_p", "INFERENCE-RETURN-TYPE-P", 1, 0, false);
        declareFunction(me, "inference_properties_return_type", "INFERENCE-PROPERTIES-RETURN-TYPE", 1, 0, false);
        declareFunction(me, "inference_answer_language_p", "INFERENCE-ANSWER-LANGUAGE-P", 1, 0, false);
        declareFunction(me, "inference_properties_answer_language", "INFERENCE-PROPERTIES-ANSWER-LANGUAGE", 1, 0, false);
        declareFunction(me, "result_uniqueness_criterion_p", "RESULT-UNIQUENESS-CRITERION-P", 1, 0, false);
        declareFunction(me, "inference_properties_uniqueness_criterion", "INFERENCE-PROPERTIES-UNIQUENESS-CRITERION", 1, 0, false);
        declareFunction(me, "inference_disjunction_free_el_vars_policy_p", "INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY-P", 1, 0, false);
        declareFunction(me, "inference_properties_disjunction_free_el_vars_policy", "INFERENCE-PROPERTIES-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
        declareFunction(me, "inference_transitive_closure_mode_p", "INFERENCE-TRANSITIVE-CLOSURE-MODE-P", 1, 0, false);
        declareFunction(me, "inference_properties_transitive_closure_mode", "INFERENCE-PROPERTIES-TRANSITIVE-CLOSURE-MODE", 1, 0, false);
        declareFunction(me, "inference_properties_maintain_term_working_setP", "INFERENCE-PROPERTIES-MAINTAIN-TERM-WORKING-SET?", 1, 0, false);
        declareFunction(me, "inference_properties_events", "INFERENCE-PROPERTIES-EVENTS", 1, 0, false);
        declareFunction(me, "inference_event_type_p", "INFERENCE-EVENT-TYPE-P", 1, 0, false);
        declareFunction(me, "inference_properties_halt_conditions", "INFERENCE-PROPERTIES-HALT-CONDITIONS", 1, 0, false);
        declareFunction(me, "inference_halt_condition_p", "INFERENCE-HALT-CONDITION-P", 1, 0, false);
        declareFunction(me, "inference_accumulator_type_p", "INFERENCE-ACCUMULATOR-TYPE-P", 1, 0, false);
        declareFunction(me, "initialize_inference_accumulator", "INITIALIZE-INFERENCE-ACCUMULATOR", 1, 0, false);
        declareFunction(me, "inference_properties_forget_extra_resultsP", "INFERENCE-PROPERTIES-FORGET-EXTRA-RESULTS?", 1, 0, false);
        declareFunction(me, "inference_properties_cache_inference_resultsP", "INFERENCE-PROPERTIES-CACHE-INFERENCE-RESULTS?", 1, 0, false);
        declareFunction(me, "inference_properties_browsableP", "INFERENCE-PROPERTIES-BROWSABLE?", 1, 0, false);
        declareFunction(me, "inference_properties_continuableP", "INFERENCE-PROPERTIES-CONTINUABLE?", 1, 0, false);
        declareFunction(me, "inference_properties_blockP", "INFERENCE-PROPERTIES-BLOCK?", 1, 0, false);
        declareFunction(me, "inference_query_property_lookup", "INFERENCE-QUERY-PROPERTY-LOOKUP", 2, 0, false);
        declareFunction(me, "inference_engine_default_for_property", "INFERENCE-ENGINE-DEFAULT-FOR-PROPERTY", 1, 0, false);
        declareFunction(me, "query_property_is_defaultP", "QUERY-PROPERTY-IS-DEFAULT?", 2, 0, false);
        declareFunction(me, "inference_input_non_default_query_properties", "INFERENCE-INPUT-NON-DEFAULT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "all_default_query_properties", "ALL-DEFAULT-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(me, "explicify_default_query_properties", "EXPLICIFY-DEFAULT-QUERY-PROPERTIES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_enumerated_types_file() {
        deflexical("*SPECIALLY-HANDLED-INFERENCE-METRICS*", $list7);
        deflexical("*NON-INFERENCE-QUERY-METRICS*", $list8);
        deflexical("*ARETE-QUERY-METRICS*", $list9);
        deflexical("*REMOVAL-ASK-QUERY-METRICS*", $list10);
        deflexical("*INFERENCE-STATIC-PROPERTIES*", $list12);
        deflexical("*INFERENCE-ALLOWS-HL-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL);
        deflexical("*INFERENCE-ALLOWS-UNBOUND-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL);
        deflexical("*INFERENCE-ALLOWS-EVALUATABLE-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL);
        deflexical("*INFERENCE-ALLOWS-INDETERMINATE-RESULTS-BY-DEFAULT?*", T);
        deflexical("*DEFAULT-ALLOWED-RULES*", $ALL);
        deflexical("*DEFAULT-FORBIDDEN-RULES*", $NONE);
        deflexical("*DEFAULT-ALLOWED-MODULES*", $ALL);
        deflexical("*INFERENCE-ALLOWS-ABNORMALITY-CHECKING-BY-DEFAULT?*", T);
        deflexical("*INFERENCE-RESOURCE-CONSTRAINTS*", $list26);
        deflexical("*DEFAULT-MAX-NUMBER*", NIL);
        deflexical("*DEFAULT-MAX-TIME*", NIL);
        deflexical("*DEFAULT-MAX-STEP*", NIL);
        deflexical("*DEFAULT-FORWARD-MAX-TIME*", ZERO_INTEGER);
        deflexical("*DEFAULT-MAX-PROOF-DEPTH*", NIL);
        deflexical("*DEFAULT-MAX-TRANSFORMATION-DEPTH*", ZERO_INTEGER);
        deflexical("*DEFAULT-MIN-RULE-UTILITY*", $int$_100);
        deflexical("*DEFAULT-PROBABLY-APPROXIMATELY-DONE*", ONE_INTEGER);
        deflexical("*INFERENCE-OTHER-DYNAMIC-PROPERTIES*", $list38);
        deflexical("*DEFAULT-INFERENCE-METRICS-TEMPLATE*", NIL);
        deflexical("*STRATEGY-STATIC-PROPERTIES*", $list42);
        deflexical("*DEFAULT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT*", ZERO_INTEGER);
        deflexical("*DEFAULT-PROOF-SPEC*", $ANYTHING);
        deflexical("*STRATEGY-DYNAMIC-PROPERTIES*", $list47);
        deflexical("*DEFAULT-PRODUCTIVITY-LIMIT*", multiply(TWO_INTEGER, $int$100, $default_removal_cost_cutoff$.getGlobalValue()));
        deflexical("*PROBLEM-STORE-STATIC-PROPERTIES*", $list52);
        deflexical("*PROBLEM-STORE-DYNAMIC-PROPERTIES*", NIL);
        deflexical("*INFERENCE-META-PROPERTIES*", $list55);
        deflexical("*INFERENCE-STATUSES*", $list57);
        deflexical("*CONTINUABLE-INFERENCE-STATUSES*", $list58);
        deflexical("*AVOIDED-INFERENCE-REASONS*", $list59);
        deflexical("*INFERENCE-SUSPEND-STATUSES*", $list60);
        deflexical("*CONTINUABLE-INFERENCE-SUSPEND-STATUSES*", $list64);
        deflexical("*EXHAUSTED-INFERENCE-SUSPEND-STATUSES*", $list65);
        deflexical("*TACTICAL-STATUSES*", $list70);
        deflexical("*PROVABILITY-STATUSES*", $list71);
        deflexical("*PROBLEM-STATUS-TABLE*", $list72);
        deflexical("*ORDERED-TACTICAL-STATUSES*", list_utilities.delete_duplicates_sorted(Mapping.mapcar(SECOND, $problem_status_table$.getGlobalValue()), UNPROVIDED));
        deflexical("*UNION-ORDERED-TACTICAL-STATUSES*", $list74);
        deflexical("*ADD-RESTRICTION-LAYER-OF-INDIRECTION-BY-DEFAULT?*", NIL);
        deflexical("*NEGATION-BY-FAILURE-BY-DEFAULT?*", NIL);
        deflexical("*EVALUATE-SUBL-ALLOWED-DEFAULT?*", T);
        defparameter("*REWRITE-ALLOWED-DEFAULT?*", NIL);
        deflexical("*ABDUCTION-ALLOWED-DEFAULT?*", NIL);
        deflexical("*NEW-TERMS-ALLOWED-DEFAULT?*", T);
        deflexical("*COMPUTE-ANSWER-JUSTIFICATIONS-DEFAULT?*", T);
        deflexical("*DEFAULT-INFERENCE-MODE*", $CUSTOM);
        deflexical("*INFERENCE-MODES*", $list93);
        deflexical("*PROBLEM-LINK-TYPES*", $list94);
        deflexical("*DEFAULT-PROBLEM-STORE-NAME*", NIL);
        deflexical("*DEFAULT-EQUALITY-REASONING-METHOD*", $CZER_EQUAL);
        deflexical("*PROBLEM-STORE-EQUALITY-REASONING-METHODS*", $list97);
        deflexical("*DEFAULT-EQUALITY-REASONING-DOMAIN*", $ALL);
        deflexical("*PROBLEM-STORE-EQUALITY-REASONING-DOMAINS*", $list99);
        deflexical("*DEFAULT-INTERMEDIATE-STEP-VALIDATION-LEVEL*", $NONE);
        deflexical("*INTERMEDIATE-STEP-VALIDATION-LEVELS*", $list101);
        deflexical("*DEFAULT-MAX-PROBLEM-COUNT*", $int$100000);
        deflexical("*REMOVAL-ALLOWED-BY-DEFAULT?*", T);
        deflexical("*TRANSFORMATION-ALLOWED-BY-DEFAULT?*", T);
        deflexical("*DEFAULT-PROBLEM-STORE-INFERENCE-DIRECTION*", $BACKWARD);
        deflexical("*INFERENCE-DIRECTIONS*", $list108);
        deflexical("*TACTIC-STATUSES*", $list110);
        deflexical("*TACTIC-TYPES*", $list111);
        deflexical("*ORDERED-COMPLETENESSES*", $list119);
        deflexical("*PRODUCTIVITY-TO-NUMBER-TABLE*", $list132);
        deflexical("*PROOF-STATUSES*", $list134);
        deflexical("*PROOF-REJECT-REASONS*", $list135);
        deflexical("*DESTRUCTIBILITY-STATUSES*", $list136);
        deflexical("*BALANCING-TACTICIAN-STRATEGY-TYPE-PROPERTIES*", $list148);
        deflexical("*LEGACY-STRATEGY-TYPE-PROPERTIES*", $list149);
        deflexical("*STRATEGY-TYPE-PROPERTIES*", append($balancing_tactician_strategy_type_properties$.getGlobalValue(), $legacy_strategy_type_properties$.getGlobalValue()));
        deflexical("*INFERENCE-RETURN-TYPES*", $list153);
        deflexical("*INFERENCE-DEFAULT-RETURN-TYPE*", $BINDINGS);
        deflexical("*INFERENCE-ANSWER-LANGUAGES*", $list158);
        deflexical("*INFERENCE-DEFAULT-ANSWER-LANGUAGE*", $EL);
        deflexical("*RESULT-UNIQUENESS-CRITERIA*", $list161);
        deflexical("*DEFAULT-RESULT-UNIQUENESS-CRITERION*", $BINDINGS);
        deflexical("*INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICIES*", $list163);
        deflexical("*DEFAULT-INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY*", $REQUIRE_EQUAL);
        deflexical("*INFERENCE-TRANSITIVE-CLOSURE-MODES*", $list166);
        deflexical("*INFERENCE-TRANSITIVE-CLOSURE-MODE-DEFAULT*", $NONE);
        deflexical("*MAINTAIN-TERM-WORKING-SET-DEFAULT?*", NIL);
        deflexical("*INFERENCE-EVENTS-DEFAULT*", NIL);
        deflexical("*INFERENCE-EVENT-TYPES*", $list170);
        deflexical("*INFERENCE-HALT-CONDITIONS-DEFAULT*", NIL);
        deflexical("*INFERENCE-HALT-CONDITIONS*", $list172);
        deflexical("*INFERENCE-ACCUMULATOR-TYPES*", $list173);
        deflexical("*INFERENCE-DEFAULT-FORGET-EXTRA-RESULTS?*", NIL);
        deflexical("*INFERENCE-DEFAULT-CACHE-INFERENCE-RESULTS?*", NIL);
        deflexical("*INFERENCE-DEFAULT-BROWSABLE?*", NIL);
        deflexical("*INFERENCE-DEFAULT-CONTINUABLE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_enumerated_types_file() {
        register_external_symbol(QUERY_PROPERTY_P);
        register_cyc_api_function(ALL_QUERY_PROPERTIES, NIL, $str2$Return_a_list_of_all_the_query_pr, NIL, $list3);
        register_external_symbol(PROBLEM_STORE_PROPERTY_P);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_datastructures_enumerated_types_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_datastructures_enumerated_types_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_datastructures_enumerated_types_file();
    }

    

    public static final class $query_static_property_p$UnaryFunction extends UnaryFunction {
        public $query_static_property_p$UnaryFunction() {
            super(extractFunctionNamed("QUERY-STATIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return query_static_property_p(arg1);
        }
    }

    public static final class $query_dynamic_property_p$UnaryFunction extends UnaryFunction {
        public $query_dynamic_property_p$UnaryFunction() {
            super(extractFunctionNamed("QUERY-DYNAMIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return query_dynamic_property_p(arg1);
        }
    }

    public static final class $inference_query_metric_p$UnaryFunction extends UnaryFunction {
        public $inference_query_metric_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-QUERY-METRIC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_query_metric_p(arg1);
        }
    }

    public static final class $inference_static_property_p$UnaryFunction extends UnaryFunction {
        public $inference_static_property_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-STATIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_static_property_p(arg1);
        }
    }

    public static final class $inference_dynamic_property_p$UnaryFunction extends UnaryFunction {
        public $inference_dynamic_property_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-DYNAMIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_dynamic_property_p(arg1);
        }
    }

    public static final class $strategy_static_property_p$UnaryFunction extends UnaryFunction {
        public $strategy_static_property_p$UnaryFunction() {
            super(extractFunctionNamed("STRATEGY-STATIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return strategy_static_property_p(arg1);
        }
    }

    public static final class $strategy_dynamic_property_p$UnaryFunction extends UnaryFunction {
        public $strategy_dynamic_property_p$UnaryFunction() {
            super(extractFunctionNamed("STRATEGY-DYNAMIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return strategy_dynamic_property_p(arg1);
        }
    }

    public static final class $problem_store_property_p$UnaryFunction extends UnaryFunction {
        public $problem_store_property_p$UnaryFunction() {
            super(extractFunctionNamed("PROBLEM-STORE-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return problem_store_property_p(arg1);
        }
    }
}

/**
 * Total time: 488 ms
 */
