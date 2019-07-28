package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$keyword_package$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class control_vars extends SubLTranslatedFile {
    public static final SubLFile me = new control_vars();

    public static final String myName = "com.cyc.cycjava.cycl.control_vars";

    public static final String myFingerPrint = "0507d1915100579fd50325342170025a4afec867f5466d069b8843ac8a618bc3";

    // defparameter
    public static final SubLSymbol $read_require_constant_exists$ = makeSymbol("*READ-REQUIRE-CONSTANT-EXISTS*");





    // defparameter
    public static final SubLSymbol $bootstrapping_kbP$ = makeSymbol("*BOOTSTRAPPING-KB?*");

    // public static SubLSymbol $keyword_package$;
    // deflexical
    public static final SubLSymbol $sublisp_package$ = makeSymbol("*SUBLISP-PACKAGE*");

    // deflexical
    public static final SubLSymbol $cyc_package$ = makeSymbol("*CYC-PACKAGE*");

    // defparameter
    /**
     * predicate used to compare two cnfs when searching for an assertion (or axiom)
     * in the kb
     */
    public static final SubLSymbol $cnf_matching_predicate$ = makeSymbol("*CNF-MATCHING-PREDICATE*");

    // defparameter
    /**
     * predicate used to compare two gaf formulas when searching for an assertion
     * (or axiom) in the kb
     */
    public static final SubLSymbol $gaf_matching_predicate$ = makeSymbol("*GAF-MATCHING-PREDICATE*");

    // defparameter
    /**
     * predicate used to compare two nat formulas when searching for a reified nat
     * in the kb
     */
    public static final SubLSymbol $nat_matching_predicate$ = makeSymbol("*NAT-MATCHING-PREDICATE*");

    // defparameter
    // used for robust assertion lookup in find-assertions-*
    public static final SubLSymbol $candidate_assertion$ = makeSymbol("*CANDIDATE-ASSERTION*");

    // defparameter
    public static final SubLSymbol $variable_names$ = makeSymbol("*VARIABLE-NAMES*");

    // defparameter
    public static final SubLSymbol $assertion_truth$ = makeSymbol("*ASSERTION-TRUTH*");

    // defparameter
    public static final SubLSymbol $mapping_answer$ = makeSymbol("*MAPPING-ANSWER*");

    // defparameter
    public static final SubLSymbol $mapping_pred$ = makeSymbol("*MAPPING-PRED*");

    // defparameter
    public static final SubLSymbol $mapping_source$ = makeSymbol("*MAPPING-SOURCE*");

    // defparameter
    public static final SubLSymbol $mapping_target$ = makeSymbol("*MAPPING-TARGET*");

    // defparameter
    public static final SubLSymbol $mapping_target_arg$ = makeSymbol("*MAPPING-TARGET-ARG*");

    // defparameter
    public static final SubLSymbol $mapping_index_arg$ = makeSymbol("*MAPPING-INDEX-ARG*");

    // defparameter
    public static final SubLSymbol $mapping_gather_arg$ = makeSymbol("*MAPPING-GATHER-ARG*");

    // defparameter
    public static final SubLSymbol $mapping_gather_args$ = makeSymbol("*MAPPING-GATHER-ARGS*");

    // defparameter
    public static final SubLSymbol $mapping_output_stream$ = makeSymbol("*MAPPING-OUTPUT-STREAM*");

    // defparameter
    public static final SubLSymbol $mapping_equality_test$ = makeSymbol("*MAPPING-EQUALITY-TEST*");

    // defparameter
    public static final SubLSymbol $mapping_any_answerP$ = makeSymbol("*MAPPING-ANY-ANSWER?*");

    // defparameter
    public static final SubLSymbol $mapping_relation$ = makeSymbol("*MAPPING-RELATION*");

    // defparameter
    public static final SubLSymbol $mapping_finished_fn$ = makeSymbol("*MAPPING-FINISHED-FN*");

    // defparameter
    public static final SubLSymbol $mapping_path$ = makeSymbol("*MAPPING-PATH*");

    // defparameter
    public static final SubLSymbol $mapping_data_1$ = makeSymbol("*MAPPING-DATA-1*");

    // defparameter
    public static final SubLSymbol $mapping_data_2$ = makeSymbol("*MAPPING-DATA-2*");

    // defparameter
    public static final SubLSymbol $mapping_pivot_arg$ = makeSymbol("*MAPPING-PIVOT-ARG*");

    // defparameter
    public static final SubLSymbol $mapping_gather_key$ = makeSymbol("*MAPPING-GATHER-KEY*");

    // defparameter
    public static final SubLSymbol $mapping_gather_key_args$ = makeSymbol("*MAPPING-GATHER-KEY-ARGS*");

    // defparameter
    public static final SubLSymbol $mapping_assertion_selection_fn$ = makeSymbol("*MAPPING-ASSERTION-SELECTION-FN*");

    // defparameter
    public static final SubLSymbol $mapping_assertion_bookkeeping_fn$ = makeSymbol("*MAPPING-ASSERTION-BOOKKEEPING-FN*");

    // defparameter
    // function applied in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn$ = makeSymbol("*MAPPING-FN*");

    // defparameter
    // designates non-default argument in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn_arg$ = makeSymbol("*MAPPING-FN-ARG*");

    // defparameter
    // default arg1 in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn_arg1$ = makeSymbol("*MAPPING-FN-ARG1*");

    // defparameter
    // default arg2 in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn_arg2$ = makeSymbol("*MAPPING-FN-ARG2*");

    // defparameter
    // default arg3 in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn_arg3$ = makeSymbol("*MAPPING-FN-ARG3*");

    // defparameter
    // default arg4 in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn_arg4$ = makeSymbol("*MAPPING-FN-ARG4*");

    // defparameter
    // default arg5 in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn_arg5$ = makeSymbol("*MAPPING-FN-ARG5*");

    // defparameter
    // default arg6 in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn_arg6$ = makeSymbol("*MAPPING-FN-ARG6*");

    // defparameter
    // default arg7 in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn_arg7$ = makeSymbol("*MAPPING-FN-ARG7*");

    // defparameter
    // default arg8 in mapping-funcall-arg
    public static final SubLSymbol $mapping_fn_arg8$ = makeSymbol("*MAPPING-FN-ARG8*");

    // defparameter
    public static final SubLSymbol $kba_pred$ = makeSymbol("*KBA-PRED*");

    // defparameter
    public static final SubLSymbol $standard_indent_string$ = makeSymbol("*STANDARD-INDENT-STRING*");

    // defparameter
    /**
     * The maximum function complexity of CycL allowed by the system. NIL means 'no
     * limit'.
     */
    public static final SubLSymbol $term_functional_complexity_cutoff$ = makeSymbol("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*");

    // defparameter
    /**
     * The maximum relation complexity of CycL allowed by the system. NIL means 'no
     * limit'.
     */
    public static final SubLSymbol $term_relational_complexity_cutoff$ = makeSymbol("*TERM-RELATIONAL-COMPLEXITY-CUTOFF*");

    // defparameter
    // compile successful inference chains into macro rules?
    public static final SubLSymbol $collect_justification_compilationsP$ = makeSymbol("*COLLECT-JUSTIFICATION-COMPILATIONS?*");

    // defparameter
    // candidate macro rules are recorded here
    public static final SubLSymbol $justification_compilations$ = makeSymbol("*JUSTIFICATION-COMPILATIONS*");

    // defparameter
    // tracing level for ebl module [0..5]
    public static final SubLSymbol $ebl_trace$ = makeSymbol("*EBL-TRACE*");

    // defparameter
    // Do we allow skolemization during forward inference?
    public static final SubLSymbol $allow_forward_skolemization$ = makeSymbol("*ALLOW-FORWARD-SKOLEMIZATION*");

    // defparameter
    /**
     * Do we prefer skolemization during forward inference? This option will make
     * forward inference tend not to unify to existing NARTs so that new NARTs can
     * be created if they would come into existence (see nat-lookup-pos-preference.)
     */
    public static final SubLSymbol $prefer_forward_skolemization$ = makeSymbol("*PREFER-FORWARD-SKOLEMIZATION*");

    // defparameter
    /**
     * Do we check for and reject unifications where a variable appears in its own
     * binding?
     */
    public static final SubLSymbol $perform_unification_occurs_check$ = makeSymbol("*PERFORM-UNIFICATION-OCCURS-CHECK*");

    // defparameter
    // Do we use #$equals assertions within term unification?
    public static final SubLSymbol $perform_equals_unification$ = makeSymbol("*PERFORM-EQUALS-UNIFICATION*");

    // defparameter
    // Do we allow backward gafs?
    public static final SubLSymbol $allow_backward_gafs$ = makeSymbol("*ALLOW-BACKWARD-GAFS*");

    // defparameter
    // The direction to use for cached ask results.
    public static final SubLSymbol $cached_ask_result_direction$ = makeSymbol("*CACHED-ASK-RESULT-DIRECTION*");

    // defparameter
    // Do we check for circularly justified assertions?
    public static final SubLSymbol $check_for_circular_justs$ = makeSymbol("*CHECK-FOR-CIRCULAR-JUSTS*");

    // defparameter
    // Do we ignore deductions for gafs which are already trivially derivable?
    public static final SubLSymbol $filter_deductions_for_trivially_derivable_gafs$ = makeSymbol("*FILTER-DEDUCTIONS-FOR-TRIVIALLY-DERIVABLE-GAFS*");

    // defparameter
    // Whether the inference engine is to be run in debug mode.
    public static final SubLSymbol $inference_debugP$ = makeSymbol("*INFERENCE-DEBUG?*");

    // defparameter
    public static final SubLSymbol $inference_trace_level$ = makeSymbol("*INFERENCE-TRACE-LEVEL*");

    // defvar
    /**
     * Whether forward inferences will be browsable. If NIL, they will be destroyed
     * after use, along with their problem stores. If T, problem store destruction
     * may never happen for many problem stores--BE CAREFUL
     */
    public static final SubLSymbol $browse_forward_inferencesP$ = makeSymbol("*BROWSE-FORWARD-INFERENCES?*");

    // defparameter
    // The query properties that should be inherited by recursive queries.
    public static final SubLSymbol $query_properties_inherited_by_recursive_queries$ = makeSymbol("*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*");

    // defparameter
    // Are we using the inference engine as a proof-checker?
    public static final SubLSymbol $proof_checking_enabled$ = makeSymbol("*PROOF-CHECKING-ENABLED*");

    // defparameter
    // allowable rules
    public static final SubLSymbol $proof_checker_rules$ = makeSymbol("*PROOF-CHECKER-RULES*");

    // defparameter
    public static final SubLSymbol $inference_propagate_mt_scope$ = makeSymbol("*INFERENCE-PROPAGATE-MT-SCOPE*");

    // defparameter
    public static final SubLSymbol $inference_current_node_mt_scope$ = makeSymbol("*INFERENCE-CURRENT-NODE-MT-SCOPE*");

    // defparameter
    public static final SubLSymbol $inference_literal$ = makeSymbol("*INFERENCE-LITERAL*");

    // defparameter
    public static final SubLSymbol $inference_sense$ = makeSymbol("*INFERENCE-SENSE*");

    // defparameter
    public static final SubLSymbol $inference_arg$ = makeSymbol("*INFERENCE-ARG*");

    // defparameter
    public static final SubLSymbol $inference_more_supports$ = makeSymbol("*INFERENCE-MORE-SUPPORTS*");

    // defparameter
    // Axioms specified by #$highlyRelevantAssertion.
    public static final SubLSymbol $inference_highly_relevant_assertions$ = makeSymbol("*INFERENCE-HIGHLY-RELEVANT-ASSERTIONS*");

    // defparameter
    // Microtheories specified by highlyRelevantMt.
    public static final SubLSymbol $inference_highly_relevant_mts$ = makeSymbol("*INFERENCE-HIGHLY-RELEVANT-MTS*");

    // defparameter
    public static final SubLSymbol $within_hl_failure_backchainingP$ = makeSymbol("*WITHIN-HL-FAILURE-BACKCHAINING?*");



    // defparameter
    // Do we backchain on evaluatable predicates?
    public static final SubLSymbol $evaluatable_backchain_enabled$ = makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*");







    // deflexical
    public static final SubLSymbol $default_removal_cost_cutoff$ = makeSymbol("*DEFAULT-REMOVAL-COST-CUTOFF*");

    // defparameter
    // How expensive a removal do we allow (NIL for no restriction).
    public static final SubLSymbol $removal_cost_cutoff$ = makeSymbol("*REMOVAL-COST-CUTOFF*");

    // defparameter
    /**
     * How expensive a removal do we allow during forward inference (NIL for no
     * restriction).
     */
    public static final SubLSymbol $forward_inference_removal_cost_cutoff$ = makeSymbol("*FORWARD-INFERENCE-REMOVAL-COST-CUTOFF*");

    // defparameter
    public static final SubLSymbol $application_filtering_enabled$ = makeSymbol("*APPLICATION-FILTERING-ENABLED*");

    // defparameter
    /**
     * When a goal node is rejected, do we mark all its semantically invalid
     * ancestors as doomed, thereby cutting off large chunks of search which will
     * fail.
     */
    public static final SubLSymbol $marking_doomed_inference_ancestors$ = makeSymbol("*MARKING-DOOMED-INFERENCE-ANCESTORS*");

    // defparameter
    public static final SubLSymbol $inference_search_strategy$ = makeSymbol("*INFERENCE-SEARCH-STRATEGY*");

    // defparameter
    public static final SubLSymbol $unique_inference_result_bindings$ = makeSymbol("*UNIQUE-INFERENCE-RESULT-BINDINGS*");

    // defparameter
    /**
     * The handler function to use when generating the results to return from
     * inference searches.
     */
    public static final SubLSymbol $inference_answer_handler$ = makeSymbol("*INFERENCE-ANSWER-HANDLER*");

    // defparameter
    // The cost value used for performing an HL module simplification step.
    public static final SubLSymbol $hl_module_simplification_cost$ = makeSymbol("*HL-MODULE-SIMPLIFICATION-COST*");

    // defparameter
    // The cost value used for performing fully-bound HL module checks.
    public static final SubLSymbol $hl_module_check_cost$ = makeSymbol("*HL-MODULE-CHECK-COST*");

    // deflexical
    // The cost value used for performing cheap fully-bound HL module checks.
    public static final SubLSymbol $cheap_hl_module_check_cost$ = makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*");

    // deflexical
    // The cost value used for performing typical fully-bound HL module checks.
    public static final SubLSymbol $typical_hl_module_check_cost$ = makeSymbol("*TYPICAL-HL-MODULE-CHECK-COST*");

    // deflexical
    /**
     * The cost value used for performing expensive fully-bound HL module checks.
     */
    public static final SubLSymbol $expensive_hl_module_check_cost$ = makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*");

    // deflexical
    // The cost value used for performing expensive HL module generations.
    public static final SubLSymbol $expensive_hl_module_singleton_generate_cost$ = makeSymbol("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*");

    // defparameter
    /**
     * When non-nil, the maximum cost value allowable for fully-bound HL module
     * checks.
     */
    public static final SubLSymbol $maximum_hl_module_check_cost$ = makeSymbol("*MAXIMUM-HL-MODULE-CHECK-COST*");

    // defparameter
    // An estimate of the total number of types for the average term.
    public static final SubLSymbol $average_all_isa_count$ = makeSymbol("*AVERAGE-ALL-ISA-COUNT*");

    // defparameter
    /**
     * An estimate of the total number of superclasses for the average collection.
     */
    public static final SubLSymbol $average_all_genls_count$ = makeSymbol("*AVERAGE-ALL-GENLS-COUNT*");

    // defparameter
    public static final SubLSymbol $pgia_activeP$ = makeSymbol("*PGIA-ACTIVE?*");

    // defparameter
    // Global control of whether we ever allow any the-term reasoning at all.
    public static final SubLSymbol $the_term_inference_enabled$ = makeSymbol("*THE-TERM-INFERENCE-ENABLED*");

    // defparameter
    /**
     * Controls whether the unifier treats the-terms as variables. Should always be
     * globally NIL and bound to T by the-term inference methods.
     */
    public static final SubLSymbol $allow_the_term_unification$ = makeSymbol("*ALLOW-THE-TERM-UNIFICATION*");

    // defparameter
    public static final SubLSymbol $inference_the_term_bindings$ = makeSymbol("*INFERENCE-THE-TERM-BINDINGS*");

    // defparameter
    public static final SubLSymbol $the_term_qua_constant$ = makeSymbol("*THE-TERM-QUA-CONSTANT*");

    // defparameter
    // Determines whether or not External HL module inferencing is enabled.
    public static final SubLSymbol $external_inference_enabled$ = makeSymbol("*EXTERNAL-INFERENCE-ENABLED*");

    // defparameter
    public static final SubLSymbol $suppress_conflict_noticesP$ = makeSymbol("*SUPPRESS-CONFLICT-NOTICES?*");

    // defparameter
    public static final SubLSymbol $ignore_conflictsP$ = makeSymbol("*IGNORE-CONFLICTS?*");

    // defparameter
    public static final SubLSymbol $ignore_non_definitional_conflictsP$ = makeSymbol("*IGNORE-NON-DEFINITIONAL-CONFLICTS?*");

    // defparameter
    // Do we treat semantically invalid deductions as conflicts?
    public static final SubLSymbol $conflicts_from_invalid_deductions$ = makeSymbol("*CONFLICTS-FROM-INVALID-DEDUCTIONS*");

    // defparameter
    /**
     * When non-nil, sets of mutually inconsistent HL supports are stored on the
     * variable *inconsistent-support-sets*
     */
    public static final SubLSymbol $record_inconsistent_support_sets$ = makeSymbol("*RECORD-INCONSISTENT-SUPPORT-SETS*");

    // deflexical
    public static final SubLSymbol $last_agenda_op$ = makeSymbol("*LAST-AGENDA-OP*");

    // deflexical
    public static final SubLSymbol $last_agenda_error_message$ = makeSymbol("*LAST-AGENDA-ERROR-MESSAGE*");

    // deflexical
    /**
     * A list - containing either one or more assertions or a list of the form
     * (#$equals <term> <term>) - the contents of which accounts for the halting of
     * the agenda.
     */
    public static final SubLSymbol $last_agenda_error_explanatory_supports$ = makeSymbol("*LAST-AGENDA-ERROR-EXPLANATORY-SUPPORTS*");

    // defparameter
    public static final SubLSymbol $agenda_display_fi_warnings$ = makeSymbol("*AGENDA-DISPLAY-FI-WARNINGS*");

    // defparameter
    // Do we ignore remote errors or handle them the same way as local errors?.
    public static final SubLSymbol $ignore_remote_errors$ = makeSymbol("*IGNORE-REMOTE-ERRORS*");



    // deflexical
    /**
     * Controls whether the running image will load submitted transcripts via
     * MAYBE-LOAD-SUBMITTED-TRANSCRIPT.
     */
    private static final SubLSymbol $load_submitted_transcriptsP$ = makeSymbol("*LOAD-SUBMITTED-TRANSCRIPTS?*");

    // deflexical
    /**
     * Controls whether, when a submitted transcript is loaded, the image should
     * notify the submitter that it is being loaded as part of a build.
     */
    private static final SubLSymbol $send_submitted_transcript_loading_noticesP$ = makeSymbol("*SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?*");

    // defvar
    /**
     * A string consisting of `<machine-name>-<universal-time>-<process-id>' which
     * uniquely identifies every separate Cyc image
     */
    public static final SubLSymbol $cyc_image_id$ = makeSymbol("*CYC-IMAGE-ID*");

    // deflexical
    private static final SubLSymbol $use_tcp_port_in_image_id$ = makeSymbol("*USE-TCP-PORT-IN-IMAGE-ID*");







    // defparameter
    public static final SubLSymbol $use_transcriptP$ = makeSymbol("*USE-TRANSCRIPT?*");

    // deflexical
    public static final SubLSymbol $run_own_operationsP$ = makeSymbol("*RUN-OWN-OPERATIONS?*");





    // defparameter
    public static final SubLSymbol $unencapsulating_within_agenda$ = makeSymbol("*UNENCAPSULATING-WITHIN-AGENDA*");

    // defvar
    // Whether to save queries asked into a query transcript.
    public static final SubLSymbol $save_asked_queriesP$ = makeSymbol("*SAVE-ASKED-QUERIES?*");

    // deflexical
    public static final SubLSymbol $init_file_loadedP$ = makeSymbol("*INIT-FILE-LOADED?*");

    // defparameter
    public static final SubLSymbol $within_assert$ = makeSymbol("*WITHIN-ASSERT*");

    // defparameter
    public static final SubLSymbol $within_unassert$ = makeSymbol("*WITHIN-UNASSERT*");

    // defparameter
    public static final SubLSymbol $within_ask$ = makeSymbol("*WITHIN-ASK*");

    // defparameter
    public static final SubLSymbol $within_query$ = makeSymbol("*WITHIN-QUERY*");

    // defparameter
    public static final SubLSymbol $compute_inference_results$ = makeSymbol("*COMPUTE-INFERENCE-RESULTS*");



    // defparameter
    public static final SubLSymbol $transformation_depth_cutoff$ = makeSymbol("*TRANSFORMATION-DEPTH-CUTOFF*");

    // deflexical
    private static final SubLSymbol $lexicon_initializedP$ = makeSymbol("*LEXICON-INITIALIZED?*");

    // defparameter
    public static final SubLSymbol $partial_semanticsP$ = makeSymbol("*PARTIAL-SEMANTICS?*");

    // defparameter
    // Insist on mass vs. count distinction for looking up noun denotations?
    public static final SubLSymbol $enforce_mass_vs_countP$ = makeSymbol("*ENFORCE-MASS-VS-COUNT?*");

    // defparameter
    public static final SubLSymbol $partial_syntaxP$ = makeSymbol("*PARTIAL-SYNTAX?*");

    // deflexical
    private static final SubLSymbol $cb_presentation_languages$ = makeSymbol("*CB-PRESENTATION-LANGUAGES*");





    // defparameter
    /**
     * boolean; Should we assume Cyc is talking to the currently-logged-in Cyclist
     * when generating NL in the CB interface?
     */
    public static final SubLSymbol $assume_cyc_cyclist_dialogP$ = makeSymbol("*ASSUME-CYC-CYCLIST-DIALOG?*");

    // defparameter
    public static final SubLSymbol $generated_phrases_browsableP$ = makeSymbol("*GENERATED-PHRASES-BROWSABLE?*");

    // defparameter
    public static final SubLSymbol $highlight_demerits_in_generated_phrasesP$ = makeSymbol("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*");



    // defparameter
    // boolean: Should terms have links to edit term with FET?
    public static final SubLSymbol $show_fet_edit_buttonsP$ = makeSymbol("*SHOW-FET-EDIT-BUTTONS?*");

    // defparameter
    // boolean: Should collections have links to create instance with FET?
    public static final SubLSymbol $show_fet_create_instance_buttonsP$ = makeSymbol("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*");

    // defparameter
    // boolean: Should collections have links to create spec with FET?
    public static final SubLSymbol $show_fet_create_spec_buttonsP$ = makeSymbol("*SHOW-FET-CREATE-SPEC-BUTTONS?*");

    // defparameter
    // boolean: Should literal query result terms be displayed one per line?
    public static final SubLSymbol $cb_literal_query_results_one_per_lineP$ = makeSymbol("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*");

    // defparameter
    // boolean: Should skolem applicable relations be displayed?
    public static final SubLSymbol $cb_skolem_applicable_relationsP$ = makeSymbol("*CB-SKOLEM-APPLICABLE-RELATIONS?*");

    // defparameter
    // boolean: Should applicable relations be displayed one per line?
    public static final SubLSymbol $cb_applicable_relations_one_per_lineP$ = makeSymbol("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*");

    // defparameter
    // boolean: Should applicable relations be paraphrased?
    public static final SubLSymbol $cb_paraphrase_applicable_relationsP$ = makeSymbol("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*");

    // defparameter
    public static final SubLSymbol $show_credits$ = makeSymbol("*SHOW-CREDITS*");

    // defparameter
    public static final SubLSymbol $browse_in_meta_query_modeP$ = makeSymbol("*BROWSE-IN-META-QUERY-MODE?*");

    // defparameter
    public static final SubLSymbol $meta_query_start_string$ = makeSymbol("*META-QUERY-START-STRING*");

    // defparameter
    public static final SubLSymbol $current_cache$ = makeSymbol("*CURRENT-CACHE*");

    // defvar
    // The mt within which RKF interactions are assumed.
    public static final SubLSymbol $rkf_mt$ = makeSymbol("*RKF-MT*");

    // defparameter
    // Has the db meta query init file successfully loaded, or not?
    public static final SubLSymbol $dbm_init_file_loadedP$ = makeSymbol("*DBM-INIT-FILE-LOADED?*");

    // defparameter
    public static final SubLSymbol $dbm_cache_loading_startedP$ = makeSymbol("*DBM-CACHE-LOADING-STARTED?*");

    // defparameter
    public static final SubLSymbol $dbm_cache_loading_finishedP$ = makeSymbol("*DBM-CACHE-LOADING-FINISHED?*");

    // deflexical
    public static final SubLSymbol $wordnet_initializedP$ = makeSymbol("*WORDNET-INITIALIZED?*");

    // deflexical
    public static final SubLSymbol $use_wn_linksP$ = makeSymbol("*USE-WN-LINKS?*");





    // defparameter
    // This tag will be inserted into every Janus operation that is logged.
    public static final SubLSymbol $janus_tag$ = makeSymbol("*JANUS-TAG*");

    // defparameter
    public static final SubLSymbol $janus_new_constants$ = makeSymbol("*JANUS-NEW-CONSTANTS*");

    // defparameter
    public static final SubLSymbol $janus_test_case_loggingP$ = makeSymbol("*JANUS-TEST-CASE-LOGGING?*");

    // defparameter
    public static final SubLSymbol $janus_operations$ = makeSymbol("*JANUS-OPERATIONS*");

    // defparameter
    public static final SubLSymbol $janus_extraction_deduce_specs$ = makeSymbol("*JANUS-EXTRACTION-DEDUCE-SPECS*");

    // defparameter
    public static final SubLSymbol $janus_within_somethingP$ = makeSymbol("*JANUS-WITHIN-SOMETHING?*");

    // defparameter
    public static final SubLSymbol $janus_testing_deduce_specs$ = makeSymbol("*JANUS-TESTING-DEDUCE-SPECS*");

    // defparameter
    public static final SubLSymbol $janus_test_case_runningP$ = makeSymbol("*JANUS-TEST-CASE-RUNNING?*");

    // defvar
    public static final SubLSymbol $ask_quirkP$ = makeSymbol("*ASK-QUIRK?*");

    // defparameter
    /**
     * When non-nil, the inferences and problem-stores generated by KBQ-RUN-QUERY
     * are auto-destroyed.
     */
    public static final SubLSymbol $kbq_run_query_auto_destroy_enabledP$ = makeSymbol("*KBQ-RUN-QUERY-AUTO-DESTROY-ENABLED?*");

    // defparameter
    /**
     * When non-nil, the inferences generated by KBQ-RUN-QUERY are always run with
     * :continuable? NIL since they won't ever be continued.
     */
    public static final SubLSymbol $kbq_run_query_non_continuable_enabledP$ = makeSymbol("*KBQ-RUN-QUERY-NON-CONTINUABLE-ENABLED?*");

    // defvar
    public static final SubLSymbol $kbq_run_query_practice_modeP$ = makeSymbol("*KBQ-RUN-QUERY-PRACTICE-MODE?*");

    // Internal Constants
    public static final SubLSymbol $table_area$ = makeSymbol("*TABLE-AREA*");

    public static final SubLSymbol $hl_lock$ = makeSymbol("*HL-LOCK*");

    public static final SubLString $$$HL_Store_Lock = makeString("HL Store Lock");



    public static final SubLList $list4 = list(makeSymbol("*HL-LOCK*"));

    public static final SubLString $$$KEYWORD = makeString("KEYWORD");

    public static final SubLString $$$SUBLISP = makeString("SUBLISP");

    public static final SubLString $$$CYC = makeString("CYC");



    private static final SubLString $str9$Symbol__S_from_package__S_is_not_ = makeString("Symbol ~S from package ~S is not visible to SubL.");



    private static final SubLString $$$_ = makeString(" ");



    private static final SubLList $list13 = list(makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));

    public static final SubLSymbol $hl_failure_backchaining$ = makeSymbol("*HL-FAILURE-BACKCHAINING*");

    private static final SubLString $$$Enable_HL_predicate_backchaining = makeString("Enable HL predicate backchaining");

    private static final SubLString $str16$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow backchaining on those predicates \nwhich have dedicated HL module support, such as #$isa, #$genls and #$equals.");

    private static final SubLList $list17 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes (expensive)")));

    public static final SubLSymbol $negation_by_failure$ = makeSymbol("*NEGATION-BY-FAILURE*");

    private static final SubLString $$$Enable_negation_by_failure = makeString("Enable negation by failure");

    private static final SubLString $str20$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");

    private static final SubLList $list21 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes")));

    public static final SubLSymbol $complete_extent_minimization$ = makeSymbol("*COMPLETE-EXTENT-MINIMIZATION*");

    private static final SubLString $str23$Enable_complete_extent_minimizati = makeString("Enable complete extent minimization");

    private static final SubLString $str24$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");

    public static final SubLSymbol $unbound_rule_backchain_enabled$ = makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*");

    private static final SubLString $str26$Enable_unbound_predicate_rule_bac = makeString("Enable unbound predicate rule backchaining");

    private static final SubLString $str27$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow backchaining with rules\nthat conclude literals whose predicate position is unbound.\nMany type-level predicates have defining axioms of this form.");

    private static final SubLInteger $int$100000 = makeInteger(100000);



    private static final SubLSymbol INFERENCE_RETURN_BLISTS = makeSymbol("INFERENCE-RETURN-BLISTS");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLFloat $float$1_5 = makeDouble(1.5);

    private static final SubLInteger $int$38 = makeInteger(38);

    private static final SubLInteger $int$47 = makeInteger(47);

    public static final SubLSymbol $auto_increment_kb$ = makeSymbol("*AUTO-INCREMENT-KB*");



    private static final SubLString $$$UNKNOWN = makeString("UNKNOWN");

    private static final SubLString $str40$_ = makeString("-");

    private static final SubLString $str41$ = makeString("");

    private static final SubLString $str42$_a__a_a__a = makeString("~a-~a~a-~a");

    private static final SubLSymbol $build_kb_loaded$ = makeSymbol("*BUILD-KB-LOADED*");



    private static final SubLSymbol $kb_loaded$ = makeSymbol("*KB-LOADED*");

    private static final SubLInteger $int$10000 = makeInteger(10000);





    public static final SubLSymbol $kb_pedigree$ = makeSymbol("*KB-PEDIGREE*");



    private static final SubLSymbol $sym51$_RUN_OWN_OPERATIONS__ = makeSymbol("*RUN-OWN-OPERATIONS?*");

    public static final SubLSymbol $caught_up_on_master_transcript$ = makeSymbol("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*");

    public static final SubLSymbol $communication_mode$ = makeSymbol("*COMMUNICATION-MODE*");

    private static final SubLSymbol $sym54$_INIT_FILE_LOADED__ = makeSymbol("*INIT-FILE-LOADED?*");

    public static final SubLSymbol $cache_inference_results$ = makeSymbol("*CACHE-INFERENCE-RESULTS*");

    private static final SubLString $$$Cache_backward_query_results = makeString("Cache backward query results");

    private static final SubLString $str57$This_controls_whether_the_results = makeString("This controls whether the results of successful backward queries are cached in the KB.");

    private static final SubLSymbol $sym58$_LEXICON_INITIALIZED__ = makeSymbol("*LEXICON-INITIALIZED?*");

    private static final SubLList $list59 = list(makeKeyword("CYCL"), makeKeyword("NL"), makeKeyword("FOL"), makeKeyword("SILK"));



    public static final SubLSymbol $cb_major_presentation_language$ = makeSymbol("*CB-MAJOR-PRESENTATION-LANGUAGE*");



    private static final SubLList $list63 = list(makeSymbol("CAND"), list(makeSymbol("FWHEN-FEATURE"), makeKeyword("CYC-HALO"), T), list(EQ, makeKeyword("SILK"), makeSymbol("*CB-MAJOR-PRESENTATION-LANGUAGE*")));



    private static final SubLList $list65 = list(makeSymbol("CB-SILK-PRESENTATION-LANGUAGE?"));

    private static final SubLSymbol $sym66$_ASSUME_CYC_CYCLIST_DIALOG__ = makeSymbol("*ASSUME-CYC-CYCLIST-DIALOG?*");

    private static final SubLSymbol $sym67$_GENERATED_PHRASES_BROWSABLE__ = makeSymbol("*GENERATED-PHRASES-BROWSABLE?*");

    private static final SubLSymbol $sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ = makeSymbol("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*");

    public static final SubLSymbol $cb_paraphrase_mt$ = makeSymbol("*CB-PARAPHRASE-MT*");

    private static final SubLSymbol $sym70$_SHOW_FET_EDIT_BUTTONS__ = makeSymbol("*SHOW-FET-EDIT-BUTTONS?*");

    private static final SubLSymbol $sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ = makeSymbol("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*");

    private static final SubLSymbol $sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__ = makeSymbol("*SHOW-FET-CREATE-SPEC-BUTTONS?*");

    private static final SubLSymbol $sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ = makeSymbol("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*");

    private static final SubLSymbol $sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__ = makeSymbol("*CB-SKOLEM-APPLICABLE-RELATIONS?*");

    private static final SubLSymbol $sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ = makeSymbol("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*");

    private static final SubLSymbol $sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ = makeSymbol("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*");

    private static final SubLSymbol $sym77$_BROWSE_IN_META_QUERY_MODE__ = makeSymbol("*BROWSE-IN-META-QUERY-MODE?*");

    private static final SubLSymbol $sym78$_WORDNET_INITIALIZED__ = makeSymbol("*WORDNET-INITIALIZED?*");

    private static final SubLSymbol $sym79$_USE_WN_LINKS__ = makeSymbol("*USE-WN-LINKS?*");

    public static final SubLSymbol $acip_subkernel_extraction$ = makeSymbol("*ACIP-SUBKERNEL-EXTRACTION*");

    public static final SubLSymbol $acip_subkernel_output_stream$ = makeSymbol("*ACIP-SUBKERNEL-OUTPUT-STREAM*");

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject within_hl_modification(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list4, append(body, NIL));
    }

    public static SubLObject subl_symbol_package(final SubLObject symbol) {
        assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
        if (symbol.isKeyword()) {
            return $keyword_package$.getGlobalValue();
        }
        final SubLObject v_package = symbol_package(symbol);
        if (NIL == v_package) {
            return NIL;
        }
        final SubLObject name = symbol_name(symbol);
        if (symbol.eql(find_symbol(name, $sublisp_package$.getGlobalValue()))) {
            return $sublisp_package$.getGlobalValue();
        }
        if (symbol.eql(find_symbol(name, $cyc_package$.getGlobalValue()))) {
            return $cyc_package$.getGlobalValue();
        }
        return Errors.error($str9$Symbol__S_from_package__S_is_not_, symbol, v_package);
    }

    public static SubLObject mapping_funcall_arg(final SubLObject arg, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $mapping_fn_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject pcase_var = n;
        if (pcase_var.eql(ONE_INTEGER)) {
            final SubLObject _prev_bind_0 = $mapping_fn_arg1$.currentBinding(thread);
            try {
                $mapping_fn_arg1$.bind(arg, thread);
                result = mapping_funcall_int();
            } finally {
                $mapping_fn_arg1$.rebind(_prev_bind_0, thread);
            }
        } else
            if (pcase_var.eql(TWO_INTEGER)) {
                final SubLObject _prev_bind_0 = $mapping_fn_arg2$.currentBinding(thread);
                try {
                    $mapping_fn_arg2$.bind(arg, thread);
                    result = mapping_funcall_int();
                } finally {
                    $mapping_fn_arg2$.rebind(_prev_bind_0, thread);
                }
            } else
                if (pcase_var.eql(THREE_INTEGER)) {
                    final SubLObject _prev_bind_0 = $mapping_fn_arg3$.currentBinding(thread);
                    try {
                        $mapping_fn_arg3$.bind(arg, thread);
                        result = mapping_funcall_int();
                    } finally {
                        $mapping_fn_arg3$.rebind(_prev_bind_0, thread);
                    }
                } else
                    if (pcase_var.eql(FOUR_INTEGER)) {
                        final SubLObject _prev_bind_0 = $mapping_fn_arg4$.currentBinding(thread);
                        try {
                            $mapping_fn_arg4$.bind(arg, thread);
                            result = mapping_funcall_int();
                        } finally {
                            $mapping_fn_arg4$.rebind(_prev_bind_0, thread);
                        }
                    } else
                        if (pcase_var.eql(FIVE_INTEGER)) {
                            final SubLObject _prev_bind_0 = $mapping_fn_arg5$.currentBinding(thread);
                            try {
                                $mapping_fn_arg5$.bind(arg, thread);
                                result = mapping_funcall_int();
                            } finally {
                                $mapping_fn_arg5$.rebind(_prev_bind_0, thread);
                            }
                        } else
                            if (pcase_var.eql(SIX_INTEGER)) {
                                final SubLObject _prev_bind_0 = $mapping_fn_arg6$.currentBinding(thread);
                                try {
                                    $mapping_fn_arg6$.bind(arg, thread);
                                    result = mapping_funcall_int();
                                } finally {
                                    $mapping_fn_arg6$.rebind(_prev_bind_0, thread);
                                }
                            } else
                                if (pcase_var.eql(SEVEN_INTEGER)) {
                                    final SubLObject _prev_bind_0 = $mapping_fn_arg7$.currentBinding(thread);
                                    try {
                                        $mapping_fn_arg7$.bind(arg, thread);
                                        result = mapping_funcall_int();
                                    } finally {
                                        $mapping_fn_arg7$.rebind(_prev_bind_0, thread);
                                    }
                                } else
                                    if (pcase_var.eql(EIGHT_INTEGER)) {
                                        final SubLObject _prev_bind_0 = $mapping_fn_arg8$.currentBinding(thread);
                                        try {
                                            $mapping_fn_arg8$.bind(arg, thread);
                                            result = mapping_funcall_int();
                                        } finally {
                                            $mapping_fn_arg8$.rebind(_prev_bind_0, thread);
                                        }
                                    }







        return result;
    }

    public static SubLObject mapping_funcall_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != unprovided_argumentP($mapping_fn$.getDynamicValue(thread))) {
            return NIL;
        }
        if (NIL != unprovided_argumentP($mapping_fn_arg2$.getDynamicValue(thread))) {
            return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread));
        }
        if (NIL != unprovided_argumentP($mapping_fn_arg3$.getDynamicValue(thread))) {
            return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread));
        }
        if (NIL != unprovided_argumentP($mapping_fn_arg4$.getDynamicValue(thread))) {
            return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread));
        }
        if (NIL != unprovided_argumentP($mapping_fn_arg5$.getDynamicValue(thread))) {
            return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread));
        }
        if (NIL != unprovided_argumentP($mapping_fn_arg6$.getDynamicValue(thread))) {
            return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread));
        }
        if (NIL != unprovided_argumentP($mapping_fn_arg7$.getDynamicValue(thread))) {
            return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread), $mapping_fn_arg6$.getDynamicValue(thread));
        }
        if (NIL != unprovided_argumentP($mapping_fn_arg8$.getDynamicValue(thread))) {
            return funcall($mapping_fn$.getDynamicValue(thread), new SubLObject[]{ $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread), $mapping_fn_arg6$.getDynamicValue(thread), $mapping_fn_arg7$.getDynamicValue(thread) });
        }
        return funcall($mapping_fn$.getDynamicValue(thread), new SubLObject[]{ $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread), $mapping_fn_arg6$.getDynamicValue(thread), $mapping_fn_arg7$.getDynamicValue(thread), $mapping_fn_arg8$.getDynamicValue(thread) });
    }

    public static SubLObject inference_warn(final SubLObject format_string, SubLObject arg1, SubLObject arg2) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $inference_debugP$.getDynamicValue(thread)) {
            return Errors.error(format_string, arg1, arg2);
        }
        return Errors.warn(format_string, arg1, arg2);
    }

    public static SubLObject browse_forward_inferencesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $browse_forward_inferencesP$.getDynamicValue(thread);
    }

    public static SubLObject the_term_qua_constantP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_term, $the_term_qua_constant$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject auto_increment_kb() {
        return $auto_increment_kb$.getGlobalValue();
    }

    public static SubLObject set_auto_increment_kb(final SubLObject v_boolean) {
        assert NIL != booleanp(v_boolean) : "Types.booleanp(v_boolean) " + "CommonSymbols.NIL != Types.booleanp(v_boolean) " + v_boolean;
        $auto_increment_kb$.setGlobalValue(v_boolean);
        return $auto_increment_kb$.getGlobalValue();
    }

    public static SubLObject load_submitted_transcriptsP() {
        return $load_submitted_transcriptsP$.getGlobalValue();
    }

    public static SubLObject set_load_submitted_transcripts(final SubLObject v_boolean) {
        assert NIL != booleanp(v_boolean) : "Types.booleanp(v_boolean) " + "CommonSymbols.NIL != Types.booleanp(v_boolean) " + v_boolean;
        $load_submitted_transcriptsP$.setGlobalValue(v_boolean);
        return $load_submitted_transcriptsP$.getGlobalValue();
    }

    public static SubLObject send_submitted_transcript_loading_noticesP() {
        return $send_submitted_transcript_loading_noticesP$.getGlobalValue();
    }

    public static SubLObject set_send_submitted_transcript_loading_notices(final SubLObject v_boolean) {
        assert NIL != booleanp(v_boolean) : "Types.booleanp(v_boolean) " + "CommonSymbols.NIL != Types.booleanp(v_boolean) " + v_boolean;
        $send_submitted_transcript_loading_noticesP$.setGlobalValue(v_boolean);
        return $send_submitted_transcript_loading_noticesP$.getGlobalValue();
    }

    public static SubLObject make_cyc_image_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject machine_name = Strings.string_downcase(string_utilities.string_upto(Environment.get_machine_name($$$UNKNOWN), CHAR_period), UNPROVIDED, UNPROVIDED);
        final SubLObject base_port_string = ((NIL != $use_tcp_port_in_image_id$.getGlobalValue()) && (NIL != system_parameters.$base_tcp_port$.getDynamicValue(thread))) ? cconcatenate(string_utilities.to_string(system_parameters.$base_tcp_port$.getDynamicValue(thread)), $str40$_) : $str41$;
        final SubLObject process_id = Environment.get_process_id(UNPROVIDED);
        final SubLObject uniquifier = (process_id.isZero()) ? random.random($most_positive_fixnum$.getGlobalValue()) : process_id;
        final SubLObject cyc_universal_time = numeric_date_utilities.universal_timestring(UNPROVIDED);
        return format(NIL, $str42$_a__a_a__a, new SubLObject[]{ machine_name, base_port_string, cyc_universal_time, uniquifier });
    }

    public static SubLObject set_cyc_image_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cyc_image_id$.setDynamicValue(make_cyc_image_id(), thread);
        return $cyc_image_id$.getDynamicValue(thread);
    }

    public static SubLObject cyc_image_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cyc_image_id$.getDynamicValue(thread);
    }

    public static SubLObject build_kb_loaded() {
        return $build_kb_loaded$.getGlobalValue();
    }

    public static SubLObject set_build_kb_loaded(final SubLObject kb) {
        if (((NIL != kb) && (!assertionsDisabledSynth)) && (NIL == integerp(kb))) {
            throw new AssertionError(kb);
        }
        $build_kb_loaded$.setGlobalValue(kb);
        return set_kb_loaded(kb);
    }

    public static SubLObject kb_loaded() {
        return $kb_loaded$.getGlobalValue();
    }

    public static SubLObject set_kb_loaded(final SubLObject kb) {
        if (((NIL != kb) && (!assertionsDisabledSynth)) && (NIL == integerp(kb))) {
            throw new AssertionError(kb);
        }
        $kb_loaded$.setGlobalValue(kb);
        return kb;
    }

    public static SubLObject core_kb_loadedP() {
        return list_utilities.sublisp_boolean(kb_loaded());
    }

    public static SubLObject non_tiny_kb_loadedP() {
        return numG(constant_count(), $int$10000);
    }

    public static SubLObject kb_tiny_or_full() {
        if (NIL != non_tiny_kb_loadedP()) {
            return $FULL;
        }
        return $TINY;
    }

    public static SubLObject kb_pedigree() {
        return $kb_pedigree$.getGlobalValue();
    }

    public static SubLObject caught_up_on_master_transcript() {
        return $caught_up_on_master_transcript$.getGlobalValue();
    }

    public static SubLObject set_caught_up_on_master_transcript(final SubLObject v_boolean) {
        $caught_up_on_master_transcript$.setGlobalValue(v_boolean);
        return $caught_up_on_master_transcript$.getGlobalValue();
    }

    public static SubLObject save_asked_queriesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $save_asked_queriesP$.getDynamicValue(thread)) && (NIL != non_tiny_kb_loadedP())) && (NIL != subl_promotions.positive_integer_p(kb_loaded())));
    }

    public static SubLObject within_askP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_ask$.getDynamicValue(thread);
    }

    public static SubLObject within_queryP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $within_ask$.getDynamicValue(thread)) || (NIL != $within_query$.getDynamicValue(thread)));
    }

    public static SubLObject within_assertP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_assert$.getDynamicValue(thread);
    }

    public static SubLObject within_unassertP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_unassert$.getDynamicValue(thread);
    }

    public static SubLObject note_lexicon_initialized() {
        $lexicon_initializedP$.setGlobalValue(T);
        return $lexicon_initializedP$.getGlobalValue();
    }

    public static SubLObject lexicon_initialized_p() {
        return list_utilities.sublisp_boolean($lexicon_initializedP$.getGlobalValue());
    }

    public static SubLObject cb_presentation_language_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $cb_presentation_languages$.getGlobalValue());
    }

    public static SubLObject cb_silk_presentation_languageP(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        if (NIL != subl_promotions.memberP($CYC_HALO, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return $list63;
        }
        return NIL;
    }

    public static SubLObject pwhen_cb_silk_presentation_language(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PWHEN, $list65, append(body, NIL));
    }

    public static SubLObject declare_control_vars_file() {
        declareMacro(me, "within_hl_modification", "WITHIN-HL-MODIFICATION");
        declareFunction(me, "subl_symbol_package", "SUBL-SYMBOL-PACKAGE", 1, 0, false);
        declareFunction(me, "mapping_funcall_arg", "MAPPING-FUNCALL-ARG", 1, 1, false);
        declareFunction(me, "mapping_funcall_int", "MAPPING-FUNCALL-INT", 0, 0, false);
        declareFunction(me, "inference_warn", "INFERENCE-WARN", 1, 2, false);
        declareFunction(me, "browse_forward_inferencesP", "BROWSE-FORWARD-INFERENCES?", 0, 0, false);
        declareFunction(me, "the_term_qua_constantP", "THE-TERM-QUA-CONSTANT?", 1, 0, false);
        declareFunction(me, "auto_increment_kb", "AUTO-INCREMENT-KB", 0, 0, false);
        declareFunction(me, "set_auto_increment_kb", "SET-AUTO-INCREMENT-KB", 1, 0, false);
        declareFunction(me, "load_submitted_transcriptsP", "LOAD-SUBMITTED-TRANSCRIPTS?", 0, 0, false);
        declareFunction(me, "set_load_submitted_transcripts", "SET-LOAD-SUBMITTED-TRANSCRIPTS", 1, 0, false);
        declareFunction(me, "send_submitted_transcript_loading_noticesP", "SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?", 0, 0, false);
        declareFunction(me, "set_send_submitted_transcript_loading_notices", "SET-SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES", 1, 0, false);
        declareFunction(me, "make_cyc_image_id", "MAKE-CYC-IMAGE-ID", 0, 0, false);
        declareFunction(me, "set_cyc_image_id", "SET-CYC-IMAGE-ID", 0, 0, false);
        declareFunction(me, "cyc_image_id", "CYC-IMAGE-ID", 0, 0, false);
        declareFunction(me, "build_kb_loaded", "BUILD-KB-LOADED", 0, 0, false);
        declareFunction(me, "set_build_kb_loaded", "SET-BUILD-KB-LOADED", 1, 0, false);
        declareFunction(me, "kb_loaded", "KB-LOADED", 0, 0, false);
        declareFunction(me, "set_kb_loaded", "SET-KB-LOADED", 1, 0, false);
        declareFunction(me, "core_kb_loadedP", "CORE-KB-LOADED?", 0, 0, false);
        declareFunction(me, "non_tiny_kb_loadedP", "NON-TINY-KB-LOADED?", 0, 0, false);
        declareFunction(me, "kb_tiny_or_full", "KB-TINY-OR-FULL", 0, 0, false);
        declareFunction(me, "kb_pedigree", "KB-PEDIGREE", 0, 0, false);
        declareFunction(me, "caught_up_on_master_transcript", "CAUGHT-UP-ON-MASTER-TRANSCRIPT", 0, 0, false);
        declareFunction(me, "set_caught_up_on_master_transcript", "SET-CAUGHT-UP-ON-MASTER-TRANSCRIPT", 1, 0, false);
        declareFunction(me, "save_asked_queriesP", "SAVE-ASKED-QUERIES?", 0, 0, false);
        declareFunction(me, "within_askP", "WITHIN-ASK?", 0, 0, false);
        declareFunction(me, "within_queryP", "WITHIN-QUERY?", 0, 0, false);
        declareFunction(me, "within_assertP", "WITHIN-ASSERT?", 0, 0, false);
        declareFunction(me, "within_unassertP", "WITHIN-UNASSERT?", 0, 0, false);
        declareFunction(me, "note_lexicon_initialized", "NOTE-LEXICON-INITIALIZED", 0, 0, false);
        declareFunction(me, "lexicon_initialized_p", "LEXICON-INITIALIZED-P", 0, 0, false);
        declareFunction(me, "cb_presentation_language_p", "CB-PRESENTATION-LANGUAGE-P", 1, 0, false);
        declareMacro(me, "cb_silk_presentation_languageP", "CB-SILK-PRESENTATION-LANGUAGE?");
        declareMacro(me, "pwhen_cb_silk_presentation_language", "PWHEN-CB-SILK-PRESENTATION-LANGUAGE");
        return NIL;
    }

    public static SubLObject init_control_vars_file() {
        defparameter("*READ-REQUIRE-CONSTANT-EXISTS*", T);
        deflexical("*TABLE-AREA*", SubLTrampolineFile.maybeDefault($table_area$, $table_area$, NIL));
        deflexical("*HL-LOCK*", SubLTrampolineFile.maybeDefault($hl_lock$, $hl_lock$, () -> make_lock($$$HL_Store_Lock)));
        defparameter("*BOOTSTRAPPING-KB?*", NIL);
        deflexical("*KEYWORD-PACKAGE*", find_package($$$KEYWORD));
        deflexical("*SUBLISP-PACKAGE*", find_package($$$SUBLISP));
        deflexical("*CYC-PACKAGE*", find_package($$$CYC));
        defparameter("*CNF-MATCHING-PREDICATE*", EQUAL);
        defparameter("*GAF-MATCHING-PREDICATE*", EQUAL);
        defparameter("*NAT-MATCHING-PREDICATE*", EQUAL);
        defparameter("*CANDIDATE-ASSERTION*", NIL);
        defparameter("*VARIABLE-NAMES*", NIL);
        defparameter("*ASSERTION-TRUTH*", $TRUE);
        defparameter("*MAPPING-ANSWER*", NIL);
        defparameter("*MAPPING-PRED*", NIL);
        defparameter("*MAPPING-SOURCE*", NIL);
        defparameter("*MAPPING-TARGET*", NIL);
        defparameter("*MAPPING-TARGET-ARG*", NIL);
        defparameter("*MAPPING-INDEX-ARG*", NIL);
        defparameter("*MAPPING-GATHER-ARG*", NIL);
        defparameter("*MAPPING-GATHER-ARGS*", NIL);
        defparameter("*MAPPING-OUTPUT-STREAM*", T);
        defparameter("*MAPPING-EQUALITY-TEST*", symbol_function(EQUAL));
        defparameter("*MAPPING-ANY-ANSWER?*", NIL);
        defparameter("*MAPPING-RELATION*", NIL);
        defparameter("*MAPPING-FINISHED-FN*", NIL);
        defparameter("*MAPPING-PATH*", NIL);
        defparameter("*MAPPING-DATA-1*", NIL);
        defparameter("*MAPPING-DATA-2*", NIL);
        defparameter("*MAPPING-PIVOT-ARG*", NIL);
        defparameter("*MAPPING-GATHER-KEY*", symbol_function(IDENTITY));
        defparameter("*MAPPING-GATHER-KEY-ARGS*", NIL);
        defparameter("*MAPPING-ASSERTION-SELECTION-FN*", NIL);
        defparameter("*MAPPING-ASSERTION-BOOKKEEPING-FN*", NIL);
        defparameter("*MAPPING-FN*", $unprovided$.getGlobalValue());
        defparameter("*MAPPING-FN-ARG*", ONE_INTEGER);
        defparameter("*MAPPING-FN-ARG1*", $unprovided$.getGlobalValue());
        defparameter("*MAPPING-FN-ARG2*", $unprovided$.getGlobalValue());
        defparameter("*MAPPING-FN-ARG3*", $unprovided$.getGlobalValue());
        defparameter("*MAPPING-FN-ARG4*", $unprovided$.getGlobalValue());
        defparameter("*MAPPING-FN-ARG5*", $unprovided$.getGlobalValue());
        defparameter("*MAPPING-FN-ARG6*", $unprovided$.getGlobalValue());
        defparameter("*MAPPING-FN-ARG7*", $unprovided$.getGlobalValue());
        defparameter("*MAPPING-FN-ARG8*", $unprovided$.getGlobalValue());
        defparameter("*KBA-PRED*", NIL);
        defparameter("*STANDARD-INDENT-STRING*", $$$_);
        defparameter("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*", NIL);
        defparameter("*TERM-RELATIONAL-COMPLEXITY-CUTOFF*", NIL);
        defparameter("*COLLECT-JUSTIFICATION-COMPILATIONS?*", NIL);
        defparameter("*JUSTIFICATION-COMPILATIONS*", NIL);
        defparameter("*EBL-TRACE*", ZERO_INTEGER);
        defparameter("*ALLOW-FORWARD-SKOLEMIZATION*", NIL);
        defparameter("*PREFER-FORWARD-SKOLEMIZATION*", NIL);
        defparameter("*PERFORM-UNIFICATION-OCCURS-CHECK*", T);
        defparameter("*PERFORM-EQUALS-UNIFICATION*", T);
        defparameter("*ALLOW-BACKWARD-GAFS*", T);
        defparameter("*CACHED-ASK-RESULT-DIRECTION*", $FORWARD);
        defparameter("*CHECK-FOR-CIRCULAR-JUSTS*", T);
        defparameter("*FILTER-DEDUCTIONS-FOR-TRIVIALLY-DERIVABLE-GAFS*", NIL);
        defparameter("*INFERENCE-DEBUG?*", NIL);
        defparameter("*INFERENCE-TRACE-LEVEL*", ZERO_INTEGER);
        defvar("*BROWSE-FORWARD-INFERENCES?*", NIL);
        defparameter("*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*", $list13);
        defparameter("*PROOF-CHECKING-ENABLED*", NIL);
        defparameter("*PROOF-CHECKER-RULES*", NIL);
        defparameter("*INFERENCE-PROPAGATE-MT-SCOPE*", NIL);
        defparameter("*INFERENCE-CURRENT-NODE-MT-SCOPE*", NIL);
        defparameter("*INFERENCE-LITERAL*", NIL);
        defparameter("*INFERENCE-SENSE*", NIL);
        defparameter("*INFERENCE-ARG*", NIL);
        defparameter("*INFERENCE-MORE-SUPPORTS*", NIL);
        defparameter("*INFERENCE-HIGHLY-RELEVANT-ASSERTIONS*", NIL);
        defparameter("*INFERENCE-HIGHLY-RELEVANT-MTS*", NIL);
        defparameter("*WITHIN-HL-FAILURE-BACKCHAINING?*", NIL);
        defparameter("*HL-FAILURE-BACKCHAINING*", NIL);
        defparameter("*EVALUATABLE-BACKCHAIN-ENABLED*", NIL);
        defparameter("*NEGATION-BY-FAILURE*", NIL);
        defparameter("*COMPLETE-EXTENT-MINIMIZATION*", T);
        defparameter("*UNBOUND-RULE-BACKCHAIN-ENABLED*", NIL);
        deflexical("*DEFAULT-REMOVAL-COST-CUTOFF*", $int$100000);
        defparameter("*REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
        defparameter("*FORWARD-INFERENCE-REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
        defparameter("*APPLICATION-FILTERING-ENABLED*", NIL);
        defparameter("*MARKING-DOOMED-INFERENCE-ANCESTORS*", NIL);
        defparameter("*INFERENCE-SEARCH-STRATEGY*", $HEURISTIC);
        defparameter("*UNIQUE-INFERENCE-RESULT-BINDINGS*", T);
        defparameter("*INFERENCE-ANSWER-HANDLER*", INFERENCE_RETURN_BLISTS);
        defparameter("*HL-MODULE-SIMPLIFICATION-COST*", $float$0_1);
        defparameter("*HL-MODULE-CHECK-COST*", $float$0_5);
        deflexical("*CHEAP-HL-MODULE-CHECK-COST*", $float$0_5);
        deflexical("*TYPICAL-HL-MODULE-CHECK-COST*", $float$1_0);
        deflexical("*EXPENSIVE-HL-MODULE-CHECK-COST*", $float$1_5);
        deflexical("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        defparameter("*MAXIMUM-HL-MODULE-CHECK-COST*", NIL);
        defparameter("*AVERAGE-ALL-ISA-COUNT*", $int$38);
        defparameter("*AVERAGE-ALL-GENLS-COUNT*", $int$47);
        defparameter("*PGIA-ACTIVE?*", NIL);
        defparameter("*THE-TERM-INFERENCE-ENABLED*", NIL);
        defparameter("*ALLOW-THE-TERM-UNIFICATION*", NIL);
        defparameter("*INFERENCE-THE-TERM-BINDINGS*", NIL);
        defparameter("*THE-TERM-QUA-CONSTANT*", NIL);
        defparameter("*EXTERNAL-INFERENCE-ENABLED*", NIL);
        defparameter("*SUPPRESS-CONFLICT-NOTICES?*", NIL);
        defparameter("*IGNORE-CONFLICTS?*", NIL);
        defparameter("*IGNORE-NON-DEFINITIONAL-CONFLICTS?*", NIL);
        defparameter("*CONFLICTS-FROM-INVALID-DEDUCTIONS*", NIL);
        defparameter("*RECORD-INCONSISTENT-SUPPORT-SETS*", NIL);
        deflexical("*LAST-AGENDA-OP*", NIL);
        deflexical("*LAST-AGENDA-ERROR-MESSAGE*", NIL);
        deflexical("*LAST-AGENDA-ERROR-EXPLANATORY-SUPPORTS*", NIL);
        defparameter("*AGENDA-DISPLAY-FI-WARNINGS*", NIL);
        defparameter("*IGNORE-REMOTE-ERRORS*", T);
        deflexical("*AUTO-INCREMENT-KB*", SubLTrampolineFile.maybeDefault($auto_increment_kb$, $auto_increment_kb$, NIL));
        deflexical("*LOAD-SUBMITTED-TRANSCRIPTS?*", NIL);
        deflexical("*SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?*", NIL);
        defvar("*CYC-IMAGE-ID*", NIL);
        deflexical("*USE-TCP-PORT-IN-IMAGE-ID*", T);
        deflexical("*BUILD-KB-LOADED*", SubLTrampolineFile.maybeDefault($build_kb_loaded$, $build_kb_loaded$, NIL));
        deflexical("*KB-LOADED*", SubLTrampolineFile.maybeDefault($kb_loaded$, $kb_loaded$, NIL));
        deflexical("*KB-PEDIGREE*", SubLTrampolineFile.maybeDefault($kb_pedigree$, $kb_pedigree$, $UNKNOWN));
        defparameter("*USE-TRANSCRIPT?*", T);
        deflexical("*RUN-OWN-OPERATIONS?*", SubLTrampolineFile.maybeDefault($sym51$_RUN_OWN_OPERATIONS__, $run_own_operationsP$, T));
        deflexical("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*", SubLTrampolineFile.maybeDefault($caught_up_on_master_transcript$, $caught_up_on_master_transcript$, NIL));
        deflexical("*COMMUNICATION-MODE*", SubLTrampolineFile.maybeDefault($communication_mode$, $communication_mode$, $UNKNOWN));
        defparameter("*UNENCAPSULATING-WITHIN-AGENDA*", NIL);
        defvar("*SAVE-ASKED-QUERIES?*", NIL);
        deflexical("*INIT-FILE-LOADED?*", SubLTrampolineFile.maybeDefault($sym54$_INIT_FILE_LOADED__, $init_file_loadedP$, NIL));
        defparameter("*WITHIN-ASSERT*", NIL);
        defparameter("*WITHIN-UNASSERT*", NIL);
        defparameter("*WITHIN-ASK*", NIL);
        defparameter("*WITHIN-QUERY*", NIL);
        defparameter("*COMPUTE-INFERENCE-RESULTS*", T);
        defparameter("*CACHE-INFERENCE-RESULTS*", NIL);
        defparameter("*TRANSFORMATION-DEPTH-CUTOFF*", NIL);
        deflexical("*LEXICON-INITIALIZED?*", SubLTrampolineFile.maybeDefault($sym58$_LEXICON_INITIALIZED__, $lexicon_initializedP$, NIL));
        defparameter("*PARTIAL-SEMANTICS?*", NIL);
        defparameter("*ENFORCE-MASS-VS-COUNT?*", T);
        defparameter("*PARTIAL-SYNTAX?*", NIL);
        deflexical("*CB-PRESENTATION-LANGUAGES*", $list59);
        defparameter("*CB-MAJOR-PRESENTATION-LANGUAGE*", $CYCL);
        defparameter("*SHOW-ASSERTIONS-IN-ENGLISH*", NIL);
        defparameter("*ASSUME-CYC-CYCLIST-DIALOG?*", T);
        defparameter("*GENERATED-PHRASES-BROWSABLE?*", T);
        defparameter("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*", T);
        defparameter("*CB-PARAPHRASE-MT*", NIL);
        defparameter("*SHOW-FET-EDIT-BUTTONS?*", T);
        defparameter("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*", T);
        defparameter("*SHOW-FET-CREATE-SPEC-BUTTONS?*", NIL);
        defparameter("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*", NIL);
        defparameter("*CB-SKOLEM-APPLICABLE-RELATIONS?*", NIL);
        defparameter("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*", NIL);
        defparameter("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*", NIL);
        defparameter("*SHOW-CREDITS*", NIL);
        defparameter("*BROWSE-IN-META-QUERY-MODE?*", NIL);
        defparameter("*META-QUERY-START-STRING*", NIL);
        defparameter("*CURRENT-CACHE*", NIL);
        defvar("*RKF-MT*", NIL);
        defparameter("*DBM-INIT-FILE-LOADED?*", NIL);
        defparameter("*DBM-CACHE-LOADING-STARTED?*", NIL);
        defparameter("*DBM-CACHE-LOADING-FINISHED?*", NIL);
        deflexical("*WORDNET-INITIALIZED?*", SubLTrampolineFile.maybeDefault($sym78$_WORDNET_INITIALIZED__, $wordnet_initializedP$, NIL));
        deflexical("*USE-WN-LINKS?*", SubLTrampolineFile.maybeDefault($sym79$_USE_WN_LINKS__, $use_wn_linksP$, NIL));
        deflexical("*ACIP-SUBKERNEL-EXTRACTION*", SubLTrampolineFile.maybeDefault($acip_subkernel_extraction$, $acip_subkernel_extraction$, NIL));
        deflexical("*ACIP-SUBKERNEL-OUTPUT-STREAM*", SubLTrampolineFile.maybeDefault($acip_subkernel_output_stream$, $acip_subkernel_output_stream$, NIL));
        defparameter("*JANUS-TAG*", NIL);
        defparameter("*JANUS-NEW-CONSTANTS*", NIL);
        defparameter("*JANUS-TEST-CASE-LOGGING?*", NIL);
        defparameter("*JANUS-OPERATIONS*", NIL);
        defparameter("*JANUS-EXTRACTION-DEDUCE-SPECS*", NIL);
        defparameter("*JANUS-WITHIN-SOMETHING?*", NIL);
        defparameter("*JANUS-TESTING-DEDUCE-SPECS*", NIL);
        defparameter("*JANUS-TEST-CASE-RUNNING?*", NIL);
        defvar("*ASK-QUIRK?*", NIL);
        defparameter("*KBQ-RUN-QUERY-AUTO-DESTROY-ENABLED?*", T);
        defparameter("*KBQ-RUN-QUERY-NON-CONTINUABLE-ENABLED?*", T);
        defvar("*KBQ-RUN-QUERY-PRACTICE-MODE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_control_vars_file() {
        declare_defglobal($table_area$);
        declare_defglobal($hl_lock$);
        register_global_lock($hl_lock$, $$$HL_Store_Lock);
        declare_control_parameter_internal($hl_failure_backchaining$, $$$Enable_HL_predicate_backchaining, $str16$This_controls_whether_or_not_we_a, $list17);
        declare_control_parameter_internal($negation_by_failure$, $$$Enable_negation_by_failure, $str20$This_controls_whether_or_not_we_a, $list21);
        declare_control_parameter_internal($complete_extent_minimization$, $str23$Enable_complete_extent_minimizati, $str24$This_controls_whether_or_not_we_a, $list21);
        declare_control_parameter_internal($unbound_rule_backchain_enabled$, $str26$Enable_unbound_predicate_rule_bac, $str27$This_controls_whether_or_not_we_a, $list17);
        declare_defglobal($auto_increment_kb$);
        declare_defglobal($build_kb_loaded$);
        declare_defglobal($kb_loaded$);
        declare_defglobal($kb_pedigree$);
        declare_defglobal($sym51$_RUN_OWN_OPERATIONS__);
        declare_defglobal($caught_up_on_master_transcript$);
        declare_defglobal($communication_mode$);
        declare_defglobal($sym54$_INIT_FILE_LOADED__);
        declare_control_parameter_internal($cache_inference_results$, $$$Cache_backward_query_results, $str57$This_controls_whether_the_results, $list21);
        declare_defglobal($sym58$_LEXICON_INITIALIZED__);
        register_html_state_variable($cb_major_presentation_language$);
        register_html_interface_variable($cb_major_presentation_language$);
        register_html_state_variable($sym66$_ASSUME_CYC_CYCLIST_DIALOG__);
        register_html_interface_variable($sym66$_ASSUME_CYC_CYCLIST_DIALOG__);
        register_html_state_variable($sym67$_GENERATED_PHRASES_BROWSABLE__);
        register_html_interface_variable($sym67$_GENERATED_PHRASES_BROWSABLE__);
        register_html_state_variable($sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__);
        register_html_interface_variable($sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__);
        register_html_state_variable($cb_paraphrase_mt$);
        register_html_interface_variable($cb_paraphrase_mt$);
        register_html_state_variable($sym70$_SHOW_FET_EDIT_BUTTONS__);
        register_html_interface_variable($sym70$_SHOW_FET_EDIT_BUTTONS__);
        register_html_state_variable($sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__);
        register_html_interface_variable($sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__);
        register_html_state_variable($sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__);
        register_html_interface_variable($sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__);
        register_html_state_variable($sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__);
        register_html_interface_variable($sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__);
        register_html_state_variable($sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__);
        register_html_interface_variable($sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__);
        register_html_state_variable($sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__);
        register_html_interface_variable($sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__);
        register_html_state_variable($sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__);
        register_html_interface_variable($sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__);
        register_html_state_variable($sym77$_BROWSE_IN_META_QUERY_MODE__);
        declare_defglobal($sym78$_WORDNET_INITIALIZED__);
        declare_defglobal($sym79$_USE_WN_LINKS__);
        declare_defglobal($acip_subkernel_extraction$);
        declare_defglobal($acip_subkernel_output_stream$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_control_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_control_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_control_vars_file();
    }

    static {



































































































































































































































































    }
}

/**
 * Total time: 366 ms synthetic
 */
