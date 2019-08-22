package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$conflicts_from_invalid_deductions$;
import static com.cyc.cycjava.cycl.control_vars.$filter_deductions_for_trivially_derivable_gafs$;
import static com.cyc.cycjava.cycl.control_vars.$forward_inference_removal_cost_cutoff$;
import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.control_vars.$prefer_forward_skolemization$;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.control_vars.browse_forward_inferencesP;
import static com.cyc.cycjava.cycl.el_utilities.compatible_formula_arity_p;
import static com.cyc.cycjava.cycl.el_utilities.hl_ground_tree_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.sefify;
import static com.cyc.cycjava.cycl.el_utilities.tou_asentP;
import static com.cyc.cycjava.cycl.el_utilities.tou_litP;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$current_forward_problem_store$;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_delayed_mode_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_delayed_mode_string$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.possibly_get_forward_inference_environment;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.auxiliary_indexing;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_cache;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.modules.forward_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class forward extends SubLTranslatedFile {
    public static final SubLFile me = new forward();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.forward";

    public static final String myFingerPrint = "db16bacaab6eb1686d653ddc6b127294ee07d610a047dc8d636b200ca9b04469";

    // defparameter
    public static final SubLSymbol $forward_inference_traceP$ = makeSymbol("*FORWARD-INFERENCE-TRACE?*");

    // defparameter
    public static final SubLSymbol $tracing_forward_inference$ = makeSymbol("*TRACING-FORWARD-INFERENCE*");

    // defparameter
    public static final SubLSymbol $forward_inference_debugP$ = makeSymbol("*FORWARD-INFERENCE-DEBUG?*");

    // defparameter
    // Definitions
    /**
     * Whether forward inference requires that a computed placement mt for a forward
     * deduction be the mt of one of its supports.
     */
    public static final SubLSymbol $require_cached_gaf_mt_from_supports$ = makeSymbol("*REQUIRE-CACHED-GAF-MT-FROM-SUPPORTS*");

    // defvar
    /**
     * A function-spec-p to call on each browsable forward inference. It will be
     * passed an inference-p as its arg1 (the forward inference object) and a
     * rule-assertion? as its arg2 (the forward rule being used).
     */
    public static final SubLSymbol $forward_inference_browsing_callback$ = makeSymbol("*FORWARD-INFERENCE-BROWSING-CALLBACK*");

    // defparameter
    /**
     * Optionally, store more info about each forward inference by passing it to the
     * callback. Additions are stored in a plist and are: target-asent target-truth
     * trigger-bindings trigger-supports forward-results. @see
     * forward-propagate-dnf.
     */
    public static final SubLSymbol $forward_inference_browsing_callback_more_infoP$ = makeSymbol("*FORWARD-INFERENCE-BROWSING-CALLBACK-MORE-INFO?*");

    // defvar
    // Variable for debugging
    private static final SubLSymbol $block_forward_inferencesP$ = makeSymbol("*BLOCK-FORWARD-INFERENCES?*");

    // deflexical
    public static final SubLSymbol $forward_inference_asserted_asent_fast_fail_cutoff$ = makeSymbol("*FORWARD-INFERENCE-ASSERTED-ASENT-FAST-FAIL-CUTOFF*");

    // defparameter
    public static final SubLSymbol $respect_defining_mt_for_hypothetical_termsP$ = makeSymbol("*RESPECT-DEFINING-MT-FOR-HYPOTHETICAL-TERMS?*");

    // defparameter
    public static final SubLSymbol $support_forward_propagate_rule_via_trigger_gafsP$ = makeSymbol("*SUPPORT-FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS?*");

    // defparameter
    public static final SubLSymbol $forward_propagate_rule_via_trigger_gafs_problem_store_size$ = makeSymbol("*FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS-PROBLEM-STORE-SIZE*");

    // defparameter
    public static final SubLSymbol $forward_inference_callback_reasons$ = makeSymbol("*FORWARD-INFERENCE-CALLBACK-REASONS*");

    // defparameter
    public static final SubLSymbol $suppressed_forward_inference_callback_reasons$ = makeSymbol("*SUPPRESSED-FORWARD-INFERENCE-CALLBACK-REASONS*");

    // defparameter
    public static final SubLSymbol $forced_forward_inference_callback_reasons$ = makeSymbol("*FORCED-FORWARD-INFERENCE-CALLBACK-REASONS*");



    // defparameter
    private static final SubLSymbol $global_forward_inference_environment$ = makeSymbol("*GLOBAL-FORWARD-INFERENCE-ENVIRONMENT*");



    // deflexical
    private static final SubLSymbol $currently_forward_propagating_supports_lock$ = makeSymbol("*CURRENTLY-FORWARD-PROPAGATING-SUPPORTS-LOCK*");





    // deflexical
    // Problem store properties assumed by forward inference.
    private static final SubLSymbol $forward_problem_store_properties$ = makeSymbol("*FORWARD-PROBLEM-STORE-PROPERTIES*");

    // defparameter
    // temp control variable
    public static final SubLSymbol $forward_inference_shares_same_problem_storeP$ = makeSymbol("*FORWARD-INFERENCE-SHARES-SAME-PROBLEM-STORE?*");

    // defparameter
    private static final SubLSymbol $forward_inference_recursion_depth$ = makeSymbol("*FORWARD-INFERENCE-RECURSION-DEPTH*");

    // defparameter
    private static final SubLSymbol $someone_else_will_process_this_forward_inference_environment$ = makeSymbol("*SOMEONE-ELSE-WILL-PROCESS-THIS-FORWARD-INFERENCE-ENVIRONMENT*");

    // defparameter
    private static final SubLSymbol $someone_else_will_process_the_global_forward_inference_environmentP$ = makeSymbol("*SOMEONE-ELSE-WILL-PROCESS-THE-GLOBAL-FORWARD-INFERENCE-ENVIRONMENT?*");

    // defparameter
    public static final SubLSymbol $default_forward_propagation_mt$ = makeSymbol("*DEFAULT-FORWARD-PROPAGATION-MT*");

    // defparameter
    public static final SubLSymbol $allow_forward_propagation_mt_overrideP$ = makeSymbol("*ALLOW-FORWARD-PROPAGATION-MT-OVERRIDE?*");

    // defparameter
    public static final SubLSymbol $debug_forward_propagation_mt_overrideP$ = makeSymbol("*DEBUG-FORWARD-PROPAGATION-MT-OVERRIDE?*");

    // defparameter
    /**
     * The queue of new assertibles (hl-assertible-p) computed during one forward
     * theory revision cycle.
     */
    public static final SubLSymbol $forward_inference_assertibles_queue$ = makeSymbol("*FORWARD-INFERENCE-ASSERTIBLES-QUEUE*");



    // defparameter
    // Should we bother to type-filter a prospective forward DNF.
    public static final SubLSymbol $type_filter_forward_dnf$ = makeSymbol("*TYPE-FILTER-FORWARD-DNF*");

    // defparameter
    public static final SubLSymbol $forward_non_trigger_literal_restricted_examine_asent$ = makeSymbol("*FORWARD-NON-TRIGGER-LITERAL-RESTRICTED-EXAMINE-ASENT*");

    // defparameter
    public static final SubLSymbol $handle_one_forward_propagation_callback$ = makeSymbol("*HANDLE-ONE-FORWARD-PROPAGATION-CALLBACK*");

    // defparameter
    private static final SubLSymbol $check_forward_propagate_doomed_due_to_null_max_floor_mtsP$ = makeSymbol("*CHECK-FORWARD-PROPAGATE-DOOMED-DUE-TO-NULL-MAX-FLOOR-MTS?*");

    // defparameter
    /**
     * integerp; Reified microtheories whose spec-cardinality is at or below this
     * threshold are considered to be sufficiently close to being a leaf microtheory
     * as to warrant eager forward inference mt-pruning analysis. A negative value
     * therefore disables this feature.
     */
    private static final SubLSymbol $forward_leafy_mt_threshold$ = makeSymbol("*FORWARD-LEAFY-MT-THRESHOLD*");

    // defparameter
    private static final SubLSymbol $forward_inference_show_propagation_results_progress_cutoff$ = makeSymbol("*FORWARD-INFERENCE-SHOW-PROPAGATION-RESULTS-PROGRESS-CUTOFF*");

    // defparameter
    public static final SubLSymbol $forward_inference_overriding_query_properties$ = makeSymbol("*FORWARD-INFERENCE-OVERRIDING-QUERY-PROPERTIES*");

    // defparameter
    public static final SubLSymbol $rule_forward_inference_productivity_aggressive_whacking_modeP$ = makeSymbol("*RULE-FORWARD-INFERENCE-PRODUCTIVITY-AGGRESSIVE-WHACKING-MODE?*");

    // defparameter
    public static final SubLSymbol $minimum_rule_forward_inference_productivity_limit$ = makeSymbol("*MINIMUM-RULE-FORWARD-INFERENCE-PRODUCTIVITY-LIMIT*");

    // defparameter
    public static final SubLSymbol $assertive_wff_rule_whacking_factor$ = makeSymbol("*ASSERTIVE-WFF-RULE-WHACKING-FACTOR*");

    // defparameter
    public static final SubLSymbol $old_rule_without_dependents_or_bookkeeping_whacking_factor$ = makeSymbol("*OLD-RULE-WITHOUT-DEPENDENTS-OR-BOOKKEEPING-WHACKING-FACTOR*");

    // defparameter
    public static final SubLSymbol $old_rule_without_dependents_whacking_compensation_factor$ = makeSymbol("*OLD-RULE-WITHOUT-DEPENDENTS-WHACKING-COMPENSATION-FACTOR*");

    // defvar
    public static final SubLSymbol $compute_decontextualized_deduction_mtP$ = makeSymbol("*COMPUTE-DECONTEXTUALIZED-DEDUCTION-MT?*");

    // defparameter
    public static final SubLSymbol $add_forward_deductions_from_supports_callback$ = makeSymbol("*ADD-FORWARD-DEDUCTIONS-FROM-SUPPORTS-CALLBACK*");

    // defvar
    /**
     * When non-NIL, the deductions that result from forward inference are assumed
     * to be WFF.
     */
    public static final SubLSymbol $assume_forward_deduction_is_wfP$ = makeSymbol("*ASSUME-FORWARD-DEDUCTION-IS-WF?*");

    // defvar
    /**
     * Temporary control variable; When non-nil, forward rules labelled with
     * #$constraint are treated as constraints that must be already true rather than
     * mechanisms to add deductions to the KB.
     */
    private static final SubLSymbol $forward_constraint_inference_enabledP$ = makeSymbol("*FORWARD-CONSTRAINT-INFERENCE-ENABLED?*");

    // defparameter
    private static final SubLSymbol $compute_all_mt_and_support_combinations_exceptions$ = makeSymbol("*COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS-EXCEPTIONS*");

    // defparameter
    public static final SubLSymbol $verify_some_support_combinations_possible$ = makeSymbol("*VERIFY-SOME-SUPPORT-COMBINATIONS-POSSIBLE*");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("SYNTACTICALLY-INVALID-FORWARD-NON-TRIGGER-ASENT"), makeKeyword("SYNTACTICALLY-INVALID-FORWARD-TRIGGER-ASENT"), makeKeyword("SYNTACTICALLY-INVALID-TERM-OF-UNIT"), makeKeyword("SEMANTICALLY-INVALID-ASSERTED-SENTENCE-ASENT"), makeKeyword("SEMANTICALLY-INVALID-COMPLETE-EXTENT-ASSERTED-ASENT"), makeKeyword("SEMANTICALLY-INVALID-ISA-ASENT"), makeKeyword("SEMANTICALLY-INVALID-GENLS-ASENT"), makeKeyword("NULL-MAX-FLOOR-MTS-OF-RULE-AND-GAF-MTS"), makeKeyword("SEMANTICALLY-INVALID-CLOSED-ASENT-VIA-QUERY"), makeKeyword("CONCLUDED-ASENT-NOT-HL-GROUND-TREE"), makeKeyword("NULL-MT-SUPPORT-COMBINATIONS"), makeKeyword("INVALID-LIFT"), makeKeyword("INVALID-PLACEMENT"), makeKeyword("FORWARD-BINDINGS-ABNORMAL"), makeKeyword("FORWARD-BINDINGS-EXCEPTED"), makeKeyword("FORWARD-CONCLUSION-FORBIDDEN-IN-MT"), makeKeyword("INVALIDATED-SUPPORT"), makeKeyword("FORWARD-CONCLUSION-TAUTOLOGICAL"), makeKeyword("FORWARD-CONCLUSION-CONTRADICTION"), makeKeyword("CZER-INVALIDATED-SUPPORT"), makeKeyword("FORWARD-CONCLUSION-NOT-WF"), makeKeyword("FORWARD-CONCLUSION-TRIVIALLY-DERIVABLE") });





    private static final SubLString $str4$______S__ = makeString("~&;; ~S~%");

    private static final SubLString $str5$_repropagate_forward_gaf_wrt_rule = makeString("(repropagate-forward-gaf-wrt-rule~%  ~S~%  ~S)~%");

    private static final SubLSymbol $global_forward_inference_environment_lock$ = makeSymbol("*GLOBAL-FORWARD-INFERENCE-ENVIRONMENT-LOCK*");

    private static final SubLString $str7$Global_forward_inference_environm = makeString("Global forward inference environment lock");

    private static final SubLSymbol $currently_forward_propagating_supports$ = makeSymbol("*CURRENTLY-FORWARD-PROPAGATING-SUPPORTS*");

    private static final SubLString $str9$Currently_Forward_Propagating_Sup = makeString("Currently Forward Propagating Supports Lock");

    private static final SubLList $list10 = list(makeSymbol("SUPPORT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym11$SUPPORT_VAR = makeUninternedSymbol("SUPPORT-VAR");



    private static final SubLSymbol WITH_CURRENTLY_FORWARD_PROPAGATING_SUPPORT = makeSymbol("WITH-CURRENTLY-FORWARD-PROPAGATING-SUPPORT");





    private static final SubLSymbol ADD_CURRENTLY_FORWARD_PROPAGATING_SUPPORT = makeSymbol("ADD-CURRENTLY-FORWARD-PROPAGATING-SUPPORT");

    private static final SubLSymbol REM_CURRENTLY_FORWARD_PROPAGATING_SUPPORT = makeSymbol("REM-CURRENTLY-FORWARD-PROPAGATING-SUPPORT");





    private static final SubLSymbol $forward_inference_gaf$ = makeSymbol("*FORWARD-INFERENCE-GAF*");

    private static final SubLList $list21 = list(makeSymbol("RULE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $forward_inference_rule$ = makeSymbol("*FORWARD-INFERENCE-RULE*");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"), makeKeyword("NEGATION-BY-FAILURE?"), NIL, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("DIRECTION"), makeKeyword("FORWARD") });

    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str27$Did_not_clear_problem_store__S_si = makeString("Did not clear problem store ~S since it contained a running inference!");

    private static final SubLString $str28$___S = makeString("~%~S");



    private static final SubLSymbol $sym30$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str31$Forward_inference_recursion_probl = makeString("Forward inference recursion problem? depth = ~S");

    private static final SubLSymbol $sym32$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    private static final SubLSymbol $sym33$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$termForwardPropagationOverrideMt = reader_make_constant_shell(makeString("termForwardPropagationOverrideMt"));

    private static final SubLObject $$mtHasForwardPropagationOverrideMt = reader_make_constant_shell(makeString("mtHasForwardPropagationOverrideMt"));

    private static final SubLObject $const38$ruleRestrictedToSingleInstancesOf = reader_make_constant_shell(makeString("ruleRestrictedToSingleInstancesOfCol"));



    private static final SubLString $str40$Could_not_find_forward_inference_ = makeString("Could not find forward inference override for ~S for rule ~S (gaf=~S)");

    private static final SubLString $str41$More_than_one_override_mt_for__S_ = makeString("More than one override-mt for ~S in ~S for rule ~S");

    private static final SubLString $str42$More_than_one_instance_of__S_in__ = makeString("More than one instance of ~S in ~S for rule ~S");

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLString $str44$inference_psc_override_mt___S = makeString("inference-psc-override-mt: ~S");



    private static final SubLSymbol $FORWARD_PROPAGATE_SUPPORT = makeKeyword("FORWARD-PROPAGATE-SUPPORT");





    private static final SubLSymbol $FORWARD_PROPAGATE_ONE_SUPPORT_AND_GENERATE_ASSERTIBLES = makeKeyword("FORWARD-PROPAGATE-ONE-SUPPORT-AND-GENERATE-ASSERTIBLES");

    private static final SubLSymbol $sym50$FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_C = makeSymbol("FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED");

    private static final SubLSymbol $forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$ = makeSymbol("*FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED-CACHING-STATE*");



    private static final SubLSymbol $sym53$CLEAR_FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTI = makeSymbol("CLEAR-FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED");



    private static final SubLSymbol $FORWARD_PROPAGATE_SUPPORT_GENERATE_ASSERTIBLES = makeKeyword("FORWARD-PROPAGATE-SUPPORT-GENERATE-ASSERTIBLES");

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLString $str57$__Propagating__S_ = makeString("~&Propagating ~S ");

    private static final SubLString $str58$_____A_assertible__P = makeString(" ;; ~A assertible~:P");

    private static final SubLString $str59$Assertion__s_was_removed_by_its_o = makeString("Assertion ~s was removed by its own forward propagation");

    private static final SubLSymbol $sym60$INVALID_ASSERTION_ = makeSymbol("INVALID-ASSERTION?");

    private static final SubLString $str61$invalid_assertion_in_hl_assertibl = makeString("invalid assertion in hl-assertible ~s encountered during forward inference");



    private static final SubLSymbol $sym63$INVALID_KB_HL_SUPPORT_ = makeSymbol("INVALID-KB-HL-SUPPORT?");

    private static final SubLString $str64$invalid_kb_hl_support_in_hl_asser = makeString("invalid kb hl support in hl-assertible ~s encountered during forward inference");

    private static final SubLSymbol KB_HL_SUPPORT_ID = makeSymbol("KB-HL-SUPPORT-ID");

    private static final SubLSymbol $HL_ADD_ASSERTIBLE = makeKeyword("HL-ADD-ASSERTIBLE");

    private static final SubLString $str67$_S_does_not_have_an_atomic_senten = makeString("~S does not have an atomic sentence.");

    private static final SubLSymbol $FORWARD_TACTIC_SPECS = makeKeyword("FORWARD-TACTIC-SPECS");





    private static final SubLList $list71 = list(makeSymbol("TRIGGER-ASENT"), makeSymbol("TRIGGER-SENSE"), makeSymbol("EXAMINE-ASENT"), makeSymbol("TRIGGER-SUPPORT"), makeSymbol("RULE"), makeSymbol("&OPTIONAL"), makeSymbol("ADDITIONAL-SUPPORTS"));



    private static final SubLSymbol $sym73$VALID_ASSERTION_ = makeSymbol("VALID-ASSERTION?");



    private static final SubLSymbol $kw75$FORWARD_INFERENCE_RULE_ALLOWED_ = makeKeyword("FORWARD-INFERENCE-RULE-ALLOWED?");

    private static final SubLSymbol $kw76$FORWARD_INFERENCE_RULE_FORBIDDEN_ = makeKeyword("FORWARD-INFERENCE-RULE-FORBIDDEN?");

    private static final SubLSymbol $FORWARD_PROPAGATE_GAF_INTERNAL = makeKeyword("FORWARD-PROPAGATE-GAF-INTERNAL");

    private static final SubLSymbol $POSSIBLY_SIMPLIFY_IST_SENTENCES_FOR_UNIFY = makeKeyword("POSSIBLY-SIMPLIFY-IST-SENTENCES-FOR-UNIFY");

    private static final SubLSymbol $GAF_ASENT_UNIFY = makeKeyword("GAF-ASENT-UNIFY");

    private static final SubLSymbol $HANDLE_FORWARD_PROPAGATION_FROM_GAF = makeKeyword("HANDLE-FORWARD-PROPAGATION-FROM-GAF");

    private static final SubLObject $$creationTemplateFORTs = reader_make_constant_shell(makeString("creationTemplateFORTs"));



    private static final SubLSymbol $sym83$_TEMPLATE = makeSymbol("?TEMPLATE");

    private static final SubLObject $$genlCreationTemplate = reader_make_constant_shell(makeString("genlCreationTemplate"));

    private static final SubLList $list85 = list(makeSymbol("?TEMPLATE"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$creationTemplateAllowableRules = reader_make_constant_shell(makeString("creationTemplateAllowableRules"));

    private static final SubLObject $const88$creationTemplateAllowsAllRulesFro = reader_make_constant_shell(makeString("creationTemplateAllowsAllRulesFromMt"));







    private static final SubLString $str92$do_broad_mt_index = makeString("do-broad-mt-index");













    private static final SubLSymbol $FORWARD_PROPAGATION_SUPPORTS_DOOMED = makeKeyword("FORWARD-PROPAGATION-SUPPORTS-DOOMED");









    private static final SubLSymbol $SYNTACTICALLY_INVALID_FORWARD_DNF = makeKeyword("SYNTACTICALLY-INVALID-FORWARD-DNF");





    private static final SubLSymbol $SEMANTICALLY_INVALID_FORWARD_DNF = makeKeyword("SEMANTICALLY-INVALID-FORWARD-DNF");

    private static final SubLSymbol $NULL_MAX_FLOOR_MTS_OF_RULE_AND_GAF_MTS = makeKeyword("NULL-MAX-FLOOR-MTS-OF-RULE-AND-GAF-MTS");







    private static final SubLSymbol $sym112$FORWARD_PRAGMATIC_TRIGGER_LITERAL_LIT_ = makeSymbol("FORWARD-PRAGMATIC-TRIGGER-LITERAL-LIT?");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLSymbol $FORWARD_PROPAGATE_DNF = makeKeyword("FORWARD-PROPAGATE-DNF");



    private static final SubLString $$$Propagating_results = makeString("Propagating results");

    private static final SubLString $$$Propagating_ = makeString("Propagating ");

    private static final SubLString $$$_results_for_ = makeString(" results for ");

    private static final SubLString $str119$____ = makeString(" -> ");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $FORWARD_PROPAGATE_RULE_VIA_TRIGGER_GAFS = makeKeyword("FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS");

    private static final SubLString $str122$Forward_inference_incomplete_for_ = makeString("Forward inference incomplete for ~S and ~S due to: ~A");



    private static final SubLString $str124$Tried_to_do_forward_inference_out = makeString("Tried to do forward inference outside of a problem store");



    private static final SubLSymbol $NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");

    private static final SubLSymbol $kw127$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");







    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");









    private static final SubLSymbol $BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS");

    private static final SubLSymbol $kw137$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLInteger $int$150000 = makeInteger(150000);



    private static final SubLSymbol $ADD_FORWARD_PROPAGATION_RESULT = makeKeyword("ADD-FORWARD-PROPAGATION-RESULT");

    private static final SubLList $list142 = list(makeSymbol("INFERENCE-BINDINGS"), makeSymbol("INFERENCE-SUPPORTS"), makeSymbol("INFERENCE-PRAGMATIC-SUPPORTS"));

    private static final SubLSymbol $CONCLUDED_ASENT_NOT_HL_GROUND_TREE = makeKeyword("CONCLUDED-ASENT-NOT-HL-GROUND-TREE");



    private static final SubLList $list145 = list(NIL, NIL, NIL);

    private static final SubLSymbol $NULL_MT_SUPPORT_COMBINATIONS = makeKeyword("NULL-MT-SUPPORT-COMBINATIONS");



    private static final SubLSymbol COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS = makeSymbol("COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS");







    private static final SubLSymbol $MT_SUPPORT_COMBINATIONS = makeKeyword("MT-SUPPORT-COMBINATIONS");

    private static final SubLList $list153 = list(makeSymbol("CONCLUDED-MTS"), makeSymbol("SUPPORT-COMBINATION"));

    private static final SubLSymbol $NO_MT_SUPPORT_COMBINATION_CONCLUDED_MTS_FOUND = makeKeyword("NO-MT-SUPPORT-COMBINATION-CONCLUDED-MTS-FOUND");





    private static final SubLSymbol CONCLUDED_ASENT = makeSymbol("CONCLUDED-ASENT");

    private static final SubLSymbol PROPAGATION_MT = makeSymbol("PROPAGATION-MT");



    private static final SubLSymbol CONCLUDED_MT = makeSymbol("CONCLUDED-MT");

    private static final SubLSymbol $HANDLE_FORWARD_DEDUCTION_IN_MT = makeKeyword("HANDLE-FORWARD-DEDUCTION-IN-MT");







    private static final SubLSymbol $kw165$FORWARD_BINDINGS_ABNORMAL_ = makeKeyword("FORWARD-BINDINGS-ABNORMAL?");

    private static final SubLSymbol $FORWARD_BINDINGS_ABNORMAL = makeKeyword("FORWARD-BINDINGS-ABNORMAL");

    private static final SubLSymbol $kw167$SUPPORTS_CONTAIN_EXCEPTED_ASSERTION_IN_MT_ = makeKeyword("SUPPORTS-CONTAIN-EXCEPTED-ASSERTION-IN-MT?");

    private static final SubLSymbol $FORWARD_BINDINGS_EXCEPTED = makeKeyword("FORWARD-BINDINGS-EXCEPTED");

    private static final SubLSymbol $sym169$CONSTRAINT_RULE_ = makeSymbol("CONSTRAINT-RULE?");

    private static final SubLSymbol $kw170$FORBID_FORWARD_CONCLUSION_IN_MT_ = makeKeyword("FORBID-FORWARD-CONCLUSION-IN-MT?");

    private static final SubLSymbol $FORWARD_CONCLUSION_FORBIDDEN_IN_MT = makeKeyword("FORWARD-CONCLUSION-FORBIDDEN-IN-MT");

    private static final SubLString $str172$Something_between_queueing_and_pr = makeString("Something between queueing and processing of ~s in ~s invalidated the forward supports ~s");



    private static final SubLSymbol $CANONICALIZE_WF_GAF = makeKeyword("CANONICALIZE-WF-GAF");



    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLSymbol $FORWARD_CONCLUSION_TAUTOLOGICAL = makeKeyword("FORWARD-CONCLUSION-TAUTOLOGICAL");

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLSymbol $FORWARD_CONCLUSION_CONTRADICTION = makeKeyword("FORWARD-CONCLUSION-CONTRADICTION");

    private static final SubLString $str180$Canonicalization_of__s_in__s_inva = makeString("Canonicalization of ~s in ~s invalidated the forward supports ~s");

    private static final SubLSymbol $CZER_INVALIDATED_SUPPORT = makeKeyword("CZER-INVALIDATED-SUPPORT");

    private static final SubLString $str182$Forward_conclusion_not_WFF______S = makeString("Forward conclusion not WFF:~%  ~S~%because:~%  ~S~%");

    private static final SubLSymbol $FORWARD_CONCLUSION_NOT_WF = makeKeyword("FORWARD-CONCLUSION-NOT-WF");

    private static final SubLList $list184 = list(makeSymbol("CANON-CNF"), makeSymbol("&OPTIONAL"), makeSymbol("BINDING-LIST"));



    private static final SubLSymbol $FORWARD_CONCLUSION_TRIVIALLY_DERIVABLE = makeKeyword("FORWARD-CONCLUSION-TRIVIALLY-DERIVABLE");

    private static final SubLSymbol CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");



    private static final SubLSymbol $sym189$ASSERTIVE_WFF_RULE_ = makeSymbol("ASSERTIVE-WFF-RULE?");

    private static final SubLSymbol $sym190$WFF_CONSTRAINT_SUPPORT_ = makeSymbol("WFF-CONSTRAINT-SUPPORT?");

    private static final SubLObject $$WFFConstraintPredicate = reader_make_constant_shell(makeString("WFFConstraintPredicate"));

    private static final SubLObject $$wffConstraintMt = reader_make_constant_shell(makeString("wffConstraintMt"));

    private static final SubLObject $$constraint = reader_make_constant_shell(makeString("constraint"));

    private static final SubLSymbol $FORWARD_DEDUCTION_CONSTRAINT_VIOLATION = makeKeyword("FORWARD-DEDUCTION-CONSTRAINT-VIOLATION");

    private static final SubLSymbol $sym195$FORWARD_TRIGGER_LITERAL_LIT_ = makeSymbol("FORWARD-TRIGGER-LITERAL-LIT?");

    private static final SubLObject $$forwardTriggerLiteral = reader_make_constant_shell(makeString("forwardTriggerLiteral"));

    private static final SubLSymbol $SYNTACTICALLY_INVALID_FORWARD_TRIGGER_ASENT = makeKeyword("SYNTACTICALLY-INVALID-FORWARD-TRIGGER-ASENT");

    private static final SubLSymbol $sym198$FORWARD_NON_TRIGGER_LITERAL_LIT_ = makeSymbol("FORWARD-NON-TRIGGER-LITERAL-LIT?");

    private static final SubLObject $$forwardNonTriggerLiteral = reader_make_constant_shell(makeString("forwardNonTriggerLiteral"));

    private static final SubLSymbol $SYNTACTICALLY_INVALID_FORWARD_NON_TRIGGER_ASENT = makeKeyword("SYNTACTICALLY-INVALID-FORWARD-NON-TRIGGER-ASENT");



    private static final SubLSymbol FORWARD_LEAFY_MT_P = makeSymbol("FORWARD-LEAFY-MT-P");

    private static final SubLSymbol $sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_ = makeSymbol("FORWARD-POSSIBLY-SOME-COMMON-SPEC-MT?");

    private static final SubLList $list204 = list(makeSymbol("LEAFY-MT"), makeSymbol("&REST"), makeSymbol("OTHER-LEAFY-MTS"));

    private static final SubLSymbol $COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS = makeKeyword("COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS");

    private static final SubLSymbol $COMPUTE_MTS_FROM_SUPPORTS = makeKeyword("COMPUTE-MTS-FROM-SUPPORTS");

    private static final SubLSymbol $SOME_SUPPORT_COMBINATIONS_EXTENSIONALLY_POSSIBLE = makeKeyword("SOME-SUPPORT-COMBINATIONS-EXTENSIONALLY-POSSIBLE");



    private static final SubLSymbol $ALL_FORWARD_SUPPORT_MT_COMBINATIONS = makeKeyword("ALL-FORWARD-SUPPORT-MT-COMBINATIONS");

    private static final SubLList $list210 = cons(makeSymbol("FIRST"), makeSymbol("REST"));



    private static final SubLSymbol $sym212$SPEC_MT_ = makeSymbol("SPEC-MT?");

    private static final SubLSymbol HYPOTHETICAL_TERM_P = makeSymbol("HYPOTHETICAL-TERM-P");

    private static final SubLSymbol $FORWARD_MT_PLACEMENTS_FROM_SUPPORT_MTS = makeKeyword("FORWARD-MT-PLACEMENTS-FROM-SUPPORT-MTS");

    private static final SubLString $str215$Skipping_max_floor_mts_call_due_t = makeString("Skipping max-floor-mts call due to universal lifting rule: ~S");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $NULL_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED = makeKeyword("NULL-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED");

    private static final SubLSymbol $ALL_COMPUTED_WFF_MT_COMBINATIONS = makeKeyword("ALL-COMPUTED-WFF-MT-COMBINATIONS");

    private static final SubLSymbol $NULL_INFERENCE_MAX_FLOOR_MTS_OF_NAT = makeKeyword("NULL-INFERENCE-MAX-FLOOR-MTS-OF-NAT");

    public static SubLObject forward_propagate_rule_via_trigger_gafsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $support_forward_propagate_rule_via_trigger_gafsP$.getDynamicValue(thread)) && (NIL == browse_forward_inferencesP())) && (NIL == $forward_inference_browsing_callback$.getDynamicValue(thread)));
    }

    public static SubLObject call_forward_inference_browsing_callbackP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $forward_inference_debugP$.getDynamicValue(thread)) || (NIL != $forward_inference_browsing_callback$.getDynamicValue(thread)));
    }

    public static SubLObject call_forward_inference_browsing_callback(final SubLObject possible_inference, final SubLObject rule, SubLObject more_info) {
        if (more_info == UNPROVIDED) {
            more_info = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject reason = getf(more_info, $REASON, UNPROVIDED);
        if (NIL != reason) {
            final SubLObject reason_type = getf(reason, $TYPE, UNPROVIDED);
            if ((NIL == list_utilities.member_eqP(reason_type, $forced_forward_inference_callback_reasons$.getDynamicValue(thread))) && (NIL != list_utilities.member_eqP(reason_type, $suppressed_forward_inference_callback_reasons$.getDynamicValue(thread)))) {
                return NIL;
            }
            if (NIL != $forward_inference_debugP$.getDynamicValue(thread)) {
                format(T, $str4$______S__, reason);
                format_nil.force_format(T, $str5$_repropagate_forward_gaf_wrt_rule, sefify(current_forward_inference_gaf()), sefify(rule), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        SubLObject result = NIL;
        if (NIL != $forward_inference_browsing_callback$.getDynamicValue(thread)) {
            if (NIL != $forward_inference_browsing_callback_more_infoP$.getDynamicValue(thread)) {
                result = funcall($forward_inference_browsing_callback$.getDynamicValue(thread), possible_inference, rule, more_info);
            } else {
                result = funcall($forward_inference_browsing_callback$.getDynamicValue(thread), possible_inference, rule);
            }
        }
        return result;
    }

    public static SubLObject current_forward_inference_environment() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kb_control_vars.$forward_inference_environment$.getDynamicValue(thread);
    }

    public static SubLObject get_forward_inference_environment() {
        return new_forward_inference_environment();
    }

    public static SubLObject free_forward_inference_enviornment(final SubLObject environment) {
        return NIL;
    }

    public static SubLObject clear_forward_inference_environment(final SubLObject environment) {
        return queues.clear_queue(environment);
    }

    public static SubLObject new_forward_inference_environment() {
        return queues.create_queue(UNPROVIDED);
    }

    public static SubLObject queue_global_forward_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($global_forward_inference_environment_lock$.getGlobalValue());
            result = queues.enqueue(assertion, $global_forward_inference_environment$.getDynamicValue(thread));
        } finally {
            if (NIL != release) {
                release_lock($global_forward_inference_environment_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject dequeue_global_forward_assertion() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($global_forward_inference_environment_lock$.getGlobalValue());
            result = queues.dequeue($global_forward_inference_environment$.getDynamicValue(thread));
        } finally {
            if (NIL != release) {
                release_lock($global_forward_inference_environment_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject global_forward_assertion_queue_empty_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($global_forward_inference_environment_lock$.getGlobalValue());
            result = queues.queue_empty_p($global_forward_inference_environment$.getDynamicValue(thread));
        } finally {
            if (NIL != release) {
                release_lock($global_forward_inference_environment_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject clear_global_forward_inference_environment() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($global_forward_inference_environment_lock$.getGlobalValue());
            result = queues.queue_size($global_forward_inference_environment$.getDynamicValue(thread));
            queues.clear_queue($global_forward_inference_environment$.getDynamicValue(thread));
        } finally {
            if (NIL != release) {
                release_lock($global_forward_inference_environment_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject with_currently_forward_propagating_support(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject support = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        support = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (!support.isAtom()) {
            final SubLObject support_var = $sym11$SUPPORT_VAR;
            return list(CLET, list(list(support_var, support)), listS(WITH_CURRENTLY_FORWARD_PROPAGATING_SUPPORT, support_var, append(body, NIL)));
        }
        return list(CUNWIND_PROTECT, listS(PROGN, list(ADD_CURRENTLY_FORWARD_PROPAGATING_SUPPORT, support), append(body, NIL)), list(REM_CURRENTLY_FORWARD_PROPAGATING_SUPPORT, support));
    }

    public static SubLObject currently_forward_propagating_supportP(final SubLObject support) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            result = set.set_memberP(support, $currently_forward_propagating_supports$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject all_currently_forward_propagating_supports() {
        SubLObject supports = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            supports = set.set_element_list($currently_forward_propagating_supports$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return supports;
    }

    public static SubLObject currently_forward_propagating_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != currently_forward_propagating_supportP(assertion)));
    }

    public static SubLObject all_currently_forward_propagating_assertions() {
        final SubLObject supports = all_currently_forward_propagating_supports();
        SubLObject assertions = list_utilities.remove_if_not(symbol_function(ASSERTION_P), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        assertions = assertion_utilities.sort_assertions(assertions);
        return assertions;
    }

    public static SubLObject clear_currently_forward_propagating_supports() {
        SubLObject total = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            total = set.set_size($currently_forward_propagating_supports$.getGlobalValue());
            set.clear_set($currently_forward_propagating_supports$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return total;
    }

    public static SubLObject add_currently_forward_propagating_support(final SubLObject support) {
        assert NIL != arguments.support_p(support) : "arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) " + support;
        SubLObject release = NIL;
        try {
            release = seize_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            set.set_add(support, $currently_forward_propagating_supports$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject rem_currently_forward_propagating_support(final SubLObject support) {
        assert NIL != arguments.support_p(support) : "arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) " + support;
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            result = set.set_remove(support, $currently_forward_propagating_supports$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject with_forward_inference_source_support(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject support = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        support = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($forward_inference_gaf$, support)), append(body, NIL));
    }

    public static SubLObject with_forward_inference_rule(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rule = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        rule = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($forward_inference_rule$, rule)), append(body, NIL));
    }

    public static SubLObject current_forward_inference_gaf() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $forward_inference_gaf$.getDynamicValue(thread);
    }

    public static SubLObject current_forward_inference_rule() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $forward_inference_rule$.getDynamicValue(thread);
    }

    public static SubLObject current_forward_inference_assertion() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $forward_inference_gaf$.getDynamicValue(thread) ? $forward_inference_gaf$.getDynamicValue(thread) : $forward_inference_rule$.getDynamicValue(thread);
    }

    public static SubLObject current_forward_inference_fully_propagating_ruleP() {
        return makeBoolean((NIL != current_forward_inference_rule()) && (NIL == current_forward_inference_gaf()));
    }

    public static SubLObject forward_problem_store_properties() {
        return copy_list($forward_problem_store_properties$.getGlobalValue());
    }

    public static SubLObject new_forward_problem_store(SubLObject support) {
        if (support == UNPROVIDED) {
            support = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_metrics.increment_forward_problem_store_historical_count();
        SubLObject problem_store_properties = forward_problem_store_properties();
        if (((NIL != forward_propagate_rule_via_trigger_gafsP()) && (NIL != assertions_high.rule_assertionP(support))) && (NIL == assertions_high.single_literal_antecedent_ruleP(support))) {
            problem_store_properties = putf(problem_store_properties, $MAX_PROBLEM_COUNT, $forward_propagate_rule_via_trigger_gafs_problem_store_size$.getDynamicValue(thread));
        }
        return inference_datastructures_problem_store.new_problem_store(problem_store_properties);
    }

    public static SubLObject destroy_forward_problem_store(final SubLObject store) {
        inference_metrics.update_forward_problem_historical_count(store);
        inference_metrics.update_maximum_forward_problem_store_historical_problem_count(store);
        return inference_datastructures_problem_store.destroy_problem_store(store);
    }

    public static SubLObject forward_inference_shares_same_problem_storeP(SubLObject support) {
        if (support == UNPROVIDED) {
            support = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.rule_assertionP(support)) {
            return NIL;
        }
        return $forward_inference_shares_same_problem_storeP$.getDynamicValue(thread);
    }

    public static SubLObject get_forward_problem_store(SubLObject support) {
        if (support == UNPROVIDED) {
            support = current_forward_inference_gaf();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = NIL;
        if ((NIL != inference_datastructures_problem_store.problem_store_p($current_forward_problem_store$.getDynamicValue(thread))) && (NIL == inference_datastructures_problem_store.valid_problem_store_p($current_forward_problem_store$.getDynamicValue(thread)))) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        clear_current_forward_problem_store();
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        if (NIL != forward_inference_shares_same_problem_storeP(support)) {
            store = $current_forward_problem_store$.getDynamicValue(thread);
        }
        if (NIL == store) {
            clear_current_forward_problem_store();
            store = new_forward_problem_store(support);
        }
        $current_forward_problem_store$.setDynamicValue(store, thread);
        return store;
    }

    public static SubLObject clear_current_forward_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != inference_datastructures_problem_store.problem_store_p($current_forward_problem_store$.getDynamicValue(thread))) && (NIL != inference_datastructures_problem_store.valid_problem_store_p($current_forward_problem_store$.getDynamicValue(thread)))) && (NIL != inference_datastructures_problem_store.problem_store_running_inferences($current_forward_problem_store$.getDynamicValue(thread)))) {
            if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                Errors.warn($str27$Did_not_clear_problem_store__S_si, $current_forward_problem_store$.getDynamicValue(thread));
            }
        } else {
            clear_current_forward_problem_store_int();
        }
        return NIL;
    }

    public static SubLObject clear_current_forward_problem_store_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $current_forward_problem_store$.getDynamicValue(thread)) {
            try {
                if (NIL == browse_forward_inferencesP()) {
                    destroy_forward_problem_store($current_forward_problem_store$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    $current_forward_problem_store$.setDynamicValue(NIL, thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject clear_current_forward_inference_environment() {
        return clear_forward_inference_environment(current_forward_inference_environment());
    }

    public static SubLObject queue_forward_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread)) {
            final SubLObject environment = current_forward_inference_environment();
            if (NIL != misc_utilities.initialized_p(environment)) {
                queues.enqueue(assertion, environment);
            } else {
                queue_global_forward_assertion(assertion);
            }
            if (NIL != $tracing_forward_inference$.getDynamicValue(thread)) {
                format(T, $str28$___S, assertion);
            }
        }
        return assertion;
    }

    public static SubLObject remqueue_forward_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject environment = current_forward_inference_environment();
        if (NIL != misc_utilities.initialized_p(environment)) {
            return queues.remqueue(assertion, environment, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject queue_or_repropagate_forward_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != tms.tms_should_schedule_assertion_for_forward_propagationP(assertion)) {
            final SubLObject environment = current_forward_inference_environment();
            if (NIL != misc_utilities.initialized_p(environment)) {
                queue_forward_assertion(assertion);
                if (NIL == someone_else_will_process_this_forward_inference_environmentP(environment)) {
                    return perform_forward_inference();
                }
            } else {
                final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $prefer_forward_skolemization$.currentBinding(thread);
                try {
                    kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
                    $prefer_forward_skolemization$.bind(NIL, thread);
                    final SubLObject environment_$1 = get_forward_inference_environment();
                    assert NIL != queues.queue_p(environment_$1) : "queues.queue_p(environment_$1) " + "CommonSymbols.NIL != queues.queue_p(environment_$1) " + environment_$1;
                    final SubLObject _prev_bind_0_$2 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = $current_forward_problem_store$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_environment$.bind(environment_$1, thread);
                        $current_forward_problem_store$.bind(NIL, thread);
                        try {
                            forward_propagate_assertion(assertion, UNPROVIDED);
                            return perform_forward_inference();
                        } finally {
                            final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                clear_current_forward_problem_store();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    } finally {
                        $current_forward_problem_store$.rebind(_prev_bind_1_$3, thread);
                        kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    $prefer_forward_skolemization$.rebind(_prev_bind_2, thread);
                    kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject queue_or_repropagate_forward_assertions(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject environment = current_forward_inference_environment();
        if (NIL != misc_utilities.initialized_p(environment)) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != tms.tms_should_schedule_assertion_for_forward_propagationP(assertion)) {
                    queue_forward_assertion(assertion);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
            if (NIL == someone_else_will_process_this_forward_inference_environmentP(environment)) {
                return perform_forward_inference();
            }
        } else {
            final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $prefer_forward_skolemization$.currentBinding(thread);
            try {
                kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
                $prefer_forward_skolemization$.bind(NIL, thread);
                final SubLObject environment_$5 = get_forward_inference_environment();
                assert NIL != queues.queue_p(environment_$5) : "queues.queue_p(environment_$5) " + "CommonSymbols.NIL != queues.queue_p(environment_$5) " + environment_$5;
                final SubLObject _prev_bind_0_$6 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = $current_forward_problem_store$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment_$5, thread);
                    $current_forward_problem_store$.bind(NIL, thread);
                    try {
                        SubLObject cdolist_list_var2 = assertions;
                        SubLObject assertion2 = NIL;
                        assertion2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (NIL != tms.tms_should_schedule_assertion_for_forward_propagationP(assertion2)) {
                                forward_propagate_assertion(assertion2, UNPROVIDED);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            assertion2 = cdolist_list_var2.first();
                        } 
                        return perform_forward_inference();
                    } finally {
                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            clear_current_forward_problem_store();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                } finally {
                    $current_forward_problem_store$.rebind(_prev_bind_1_$7, thread);
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$6, thread);
                }
            } finally {
                $prefer_forward_skolemization$.rebind(_prev_bind_2, thread);
                kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject someone_else_will_process_this_forward_inference_environmentP(final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != queues.queue_p(environment)) && environment.eql($someone_else_will_process_this_forward_inference_environment$.getDynamicValue(thread)));
    }

    public static SubLObject performing_forward_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread)) || $forward_inference_recursion_depth$.getDynamicValue(thread).isPositive());
    }

    public static SubLObject perform_forward_inference_now() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $someone_else_will_process_this_forward_inference_environment$.currentBinding(thread);
        try {
            $someone_else_will_process_this_forward_inference_environment$.bind(NIL, thread);
            result = perform_forward_inference();
        } finally {
            $someone_else_will_process_this_forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject perform_forward_inference() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = $current_forward_problem_store$.currentBinding(thread);
            try {
                $current_forward_problem_store$.bind(NIL, thread);
                try {
                    final SubLObject _prev_bind_0_$9 = $forward_inference_recursion_depth$.currentBinding(thread);
                    try {
                        $forward_inference_recursion_depth$.bind(number_utilities.f_1X($forward_inference_recursion_depth$.getDynamicValue(thread)), thread);
                        if ((NIL != $inference_debugP$.getDynamicValue(thread)) && $forward_inference_recursion_depth$.getDynamicValue(thread).numGE(TWENTY_INTEGER)) {
                            Errors.sublisp_break($str31$Forward_inference_recursion_probl, new SubLObject[]{ $forward_inference_recursion_depth$.getDynamicValue(thread) });
                        }
                        SubLObject environment;
                        for (SubLObject doneP = NIL; NIL == doneP; doneP = makeBoolean(NIL == forward_inference_to_doP(environment))) {
                            environment = current_forward_inference_environment();
                            if (NIL != dynamic_forward_inference_to_doP(environment)) {
                                final SubLObject _prev_bind_0_$10 = $someone_else_will_process_this_forward_inference_environment$.currentBinding(thread);
                                try {
                                    $someone_else_will_process_this_forward_inference_environment$.bind(environment, thread);
                                    if (NIL != misc_utilities.initialized_p(environment)) {
                                        while (NIL == queues.queue_empty_p(environment)) {
                                            final SubLObject assertion = queues.dequeue(environment);
                                            final SubLObject some_results = forward_propagate_assertion(assertion, UNPROVIDED);
                                            result = nconc(nreverse(some_results), result);
                                        } 
                                    }
                                } finally {
                                    $someone_else_will_process_this_forward_inference_environment$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            if (NIL != global_forward_inference_to_doP()) {
                                final SubLObject _prev_bind_0_$11 = $someone_else_will_process_the_global_forward_inference_environmentP$.currentBinding(thread);
                                try {
                                    $someone_else_will_process_the_global_forward_inference_environmentP$.bind(T, thread);
                                    for (SubLObject global_assertion = dequeue_global_forward_assertion(); NIL != global_assertion; global_assertion = dequeue_global_forward_assertion()) {
                                        final SubLObject some_results = forward_propagate_assertion(global_assertion, UNPROVIDED);
                                        result = nconc(nreverse(some_results), result);
                                    }
                                } finally {
                                    $someone_else_will_process_the_global_forward_inference_environmentP$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                        }
                    } finally {
                        $forward_inference_recursion_depth$.rebind(_prev_bind_0_$9, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        clear_current_forward_problem_store();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                $current_forward_problem_store$.rebind(_prev_bind_0, thread);
            }
        }
        return nreverse(result);
    }

    public static SubLObject dynamic_forward_inference_to_doP(final SubLObject environment) {
        return makeBoolean(((NIL != misc_utilities.initialized_p(environment)) && (NIL == someone_else_will_process_this_forward_inference_environmentP(environment))) && (NIL == queues.queue_empty_p(environment)));
    }

    public static SubLObject global_forward_inference_to_doP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != misc_utilities.initialized_p($global_forward_inference_environment$.getDynamicValue(thread))) && (NIL == $someone_else_will_process_the_global_forward_inference_environmentP$.getDynamicValue(thread))) && (NIL == global_forward_assertion_queue_empty_p()));
    }

    public static SubLObject forward_inference_to_doP(final SubLObject environment) {
        return makeBoolean((NIL != dynamic_forward_inference_to_doP(environment)) || (NIL != global_forward_inference_to_doP()));
    }

    public static SubLObject repropagate_forward_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if ((NIL == kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread)) || (NIL == assertions_high.forward_assertionP(assertion))) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject environment = possibly_get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            queue_forward_assertion(assertion);
            result = perform_forward_inference();
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject repropagate_forward_gaf_wrt_rule(final SubLObject gaf, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.gaf_assertionP(gaf) : "assertions_high.gaf_assertionP(gaf) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(gaf) " + gaf;
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_forbidden_rules$.bind($NONE, thread);
            kb_control_vars.$forward_inference_allowed_rules$.bind(list(rule), thread);
            result = repropagate_forward_assertion(gaf);
        } finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_forbidden_rules$.rebind(_prev_bind_0, thread);
        }
        SubLObject added_assertions = NIL;
        SubLObject cdolist_list_var = result;
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != deduction_handles.valid_deductionP(argument, UNPROVIDED)) && (NIL != assertion_handles.valid_assertionP(deductions_high.deduction_supported_object(argument), UNPROVIDED))) {
                final SubLObject item_var = deductions_high.deduction_supported_object(argument);
                if (NIL == member(item_var, added_assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                    added_assertions = cons(item_var, added_assertions);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        cdolist_list_var = added_assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                result = nconc(repropagate_forward_assertion(assertion), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject inference_psc_overriding_termP(final SubLObject v_term) {
        return subl_promotions.positive_integer_p(kb_indexing.num_gaf_arg_index(v_term, ONE_INTEGER, $$termForwardPropagationOverrideMt, UNPROVIDED));
    }

    public static SubLObject inference_psc_overriding_term_mt(final SubLObject v_term) {
        return kb_mapping_utilities.fpred_value_in_any_mt(v_term, $$termForwardPropagationOverrideMt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject inference_psc_overriding_mt_mt(final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_any_mt(mt, $$mtHasForwardPropagationOverrideMt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject inference_psc_override_mt(final SubLObject assertion, final SubLObject rule, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(propagation_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject single_instance_cols_for_rule = kb_mapping_utilities.pred_values_in_any_mt(rule, $const38$ruleRestrictedToSingleInstancesOf, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            final SubLObject assertion_terms = append(cycl_utilities.expression_gather(assertions_high.assertion_cnf(assertion), FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.expression_gather(assertions_high.assertion_mt(assertion), FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject restricted_propagation_mts = NIL;
            SubLObject cdolist_list_var = single_instance_cols_for_rule;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_instances = list_utilities.fast_remove_duplicates(isa.all_instances_among(col, assertion_terms, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != v_instances) {
                    if (NIL != list_utilities.singletonP(v_instances)) {
                        final SubLObject instance = v_instances.first();
                        final SubLObject override_mts = kb_mapping_utilities.pred_values_in_any_mt(instance, $$termForwardPropagationOverrideMt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                        if (NIL == override_mts) {
                            if (NIL != $debug_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
                                Errors.warn($str40$Could_not_find_forward_inference_, instance, rule, assertion);
                            }
                        } else
                            if (NIL != list_utilities.singletonP(override_mts)) {
                                final SubLObject item_var = override_mts.first();
                                if (NIL == member(item_var, restricted_propagation_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    restricted_propagation_mts = cons(item_var, restricted_propagation_mts);
                                }
                            } else {
                                if (NIL != $debug_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
                                    Errors.warn($str41$More_than_one_override_mt_for__S_, instance, assertion, rule);
                                }
                                SubLObject cdolist_list_var_$13 = override_mts;
                                SubLObject override_mt = NIL;
                                override_mt = cdolist_list_var_$13.first();
                                while (NIL != cdolist_list_var_$13) {
                                    final SubLObject item_var2 = override_mt;
                                    if (NIL == member(item_var2, restricted_propagation_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        restricted_propagation_mts = cons(item_var2, restricted_propagation_mts);
                                    }
                                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                    override_mt = cdolist_list_var_$13.first();
                                } 
                            }

                    } else
                        if (NIL != $debug_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
                            Errors.warn($str42$More_than_one_instance_of__S_in__, col, assertion, rule);
                        }

                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
            if (NIL != restricted_propagation_mts) {
                if (NIL != list_utilities.singletonP(restricted_propagation_mts)) {
                    result = restricted_propagation_mts.first();
                } else {
                    result = cons($$MtUnionFn, restricted_propagation_mts);
                }
            }
            if ((NIL != $debug_forward_propagation_mt_overrideP$.getDynamicValue(thread)) && (NIL != result)) {
                Errors.warn($str44$inference_psc_override_mt___S, result);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            final SubLObject inference_psc_override_mt = inference_psc_overriding_mt_mt(assertions_high.assertion_mt(assertion));
            if (NIL != fort_types_interface.microtheory_p(inference_psc_override_mt)) {
                result = inference_psc_override_mt;
            }
        }
        if (NIL == result) {
            result = propagation_mt;
        }
        return result;
    }

    public static SubLObject global_forward_propagation_mtP(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $allow_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
            return T;
        }
        return kb_utilities.kbeq($$InferencePSC, mt);
    }

    public static SubLObject forward_inference_assertibles_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $forward_inference_assertibles_queue$.getDynamicValue(thread);
    }

    public static SubLObject note_new_forward_assertible(final SubLObject hl_assertible) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        queues.enqueue(hl_assertible, $forward_inference_assertibles_queue$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject forward_propagate_assertion(final SubLObject assertion, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $default_forward_propagation_mt$.getDynamicValue();
        }
        if ((NIL == tms.tms_assertion_being_removedP(assertion)) && (NIL == assertion_utilities.unknown_assertionP(assertion))) {
            return forward_propagate_assertion_int(assertion, propagation_mt, T);
        }
        return NIL;
    }

    public static SubLObject forward_propagate_assertion_int(final SubLObject assertion, final SubLObject propagation_mt, final SubLObject modify_hlP) {
        if (NIL != forward_propagation_permittedP(assertion, propagation_mt)) {
            return forward_propagate_support(assertion, propagation_mt, modify_hlP);
        }
        return NIL;
    }

    public static SubLObject forward_propagation_permittedP(final SubLObject assertion, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread)) && (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED))) && ((NIL == global_forward_propagation_mtP(propagation_mt)) || (NIL != assertions_high.forward_assertionP(assertion)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject forward_propagate_support(final SubLObject support, SubLObject propagation_mt, SubLObject modify_hlP) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $default_forward_propagation_mt$.getDynamicValue();
        }
        if (modify_hlP == UNPROVIDED) {
            modify_hlP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject outermost_initP = sublisp_null(inference_metrics.$forward_inference_last_metric_time$.getDynamicValue(thread));
        try {
            final SubLObject _prev_bind_0 = inference_metrics.$forward_inference_last_metric_time$.currentBinding(thread);
            try {
                inference_metrics.$forward_inference_last_metric_time$.bind(NIL != outermost_initP ? inference_metrics.initial_forward_inference_metric_time() : inference_metrics.$forward_inference_last_metric_time$.getDynamicValue(thread), thread);
                final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if ((NIL != last_metric_type) && (NIL != last_metric)) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$14 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind($FORWARD_PROPAGATE_SUPPORT, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind($NO_RULE, thread);
                    try {
                        SubLObject assertibles = NIL;
                        try {
                            add_currently_forward_propagating_support(support);
                            final SubLObject assertibles_queue = forward_propagate_support_generate_assertibles(support, propagation_mt);
                            assertibles = forward_propagate_support_handle_assertibles(assertibles_queue, support, modify_hlP);
                        } finally {
                            final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                rem_currently_forward_propagating_support(support);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                        return assertibles;
                    } finally {
                        final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics($HARNESS, $FORWARD_PROPAGATE_SUPPORT, $NO_GAF, $NO_RULE, NIL);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                } finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$14, thread);
                }
            } finally {
                inference_metrics.$forward_inference_last_metric_time$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (NIL == outermost_initP) {
                    inference_metrics.$forward_inference_last_metric_time$.setDynamicValue(inference_metrics.initial_forward_inference_metric_time(), thread);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
    }

    public static SubLObject forward_propagate_one_support_and_generate_assertibles(final SubLObject support, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.support_p(support) : "arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) " + support;
        final SubLObject outermost_initP = sublisp_null(inference_metrics.$forward_inference_last_metric_time$.getDynamicValue(thread));
        try {
            final SubLObject _prev_bind_0 = inference_metrics.$forward_inference_last_metric_time$.currentBinding(thread);
            try {
                inference_metrics.$forward_inference_last_metric_time$.bind(NIL != outermost_initP ? inference_metrics.initial_forward_inference_metric_time() : inference_metrics.$forward_inference_last_metric_time$.getDynamicValue(thread), thread);
                final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if ((NIL != last_metric_type) && (NIL != last_metric)) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$17 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind($FORWARD_PROPAGATE_ONE_SUPPORT_AND_GENERATE_ASSERTIBLES, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind($NO_RULE, thread);
                    try {
                        SubLObject assertibles_queue = NIL;
                        try {
                            add_currently_forward_propagating_support(support);
                            final SubLObject environment = get_forward_inference_environment();
                            assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
                            final SubLObject _prev_bind_0_$18 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                assertibles_queue = forward_propagate_support_generate_assertibles(support, propagation_mt);
                            } finally {
                                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$18, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                rem_currently_forward_propagating_support(support);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                        return assertibles_queue;
                    } finally {
                        final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics($HARNESS, $FORWARD_PROPAGATE_ONE_SUPPORT_AND_GENERATE_ASSERTIBLES, $NO_GAF, $NO_RULE, NIL);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                } finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                inference_metrics.$forward_inference_last_metric_time$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (NIL == outermost_initP) {
                    inference_metrics.$forward_inference_last_metric_time$.setDynamicValue(inference_metrics.initial_forward_inference_metric_time(), thread);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
    }

    public static SubLObject clear_forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached() {
        final SubLObject cs = $forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached(final SubLObject trigger_gaf, final SubLObject rule) {
        return memoization_state.caching_state_remove_function_results_with_args($forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$.getGlobalValue(), list(trigger_gaf, rule), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_internal(final SubLObject trigger_gaf, final SubLObject rule) {
        return forward_propagate_one_support_wrt_rule_and_generate_assertibles(trigger_gaf, rule, UNPROVIDED);
    }

    public static SubLObject forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached(final SubLObject trigger_gaf, final SubLObject rule) {
        SubLObject caching_state = $forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym50$FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_C, $forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$, $int$32, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym53$CLEAR_FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTI);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(trigger_gaf, rule);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (trigger_gaf.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && rule.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_internal(trigger_gaf, rule)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(trigger_gaf, rule));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject forward_propagate_one_support_wrt_rule_and_generate_assertibles(final SubLObject support, final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.support_p(support) : "arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) " + support;
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_forbidden_rules$.bind($NONE, thread);
            kb_control_vars.$forward_inference_allowed_rules$.bind(list(rule), thread);
            result = forward_propagate_one_support_and_generate_assertibles(support, propagation_mt);
        } finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_forbidden_rules$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject forward_propagate_one_assertion_wrt_rules_and_queue_or_repropagate_assertibles(final SubLObject assertion, final SubLObject rules, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertibles_queue = NIL;
        SubLObject new_assertions = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $prefer_forward_skolemization$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
            $prefer_forward_skolemization$.bind(NIL, thread);
            final SubLObject environment = get_forward_inference_environment();
            assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
            final SubLObject _prev_bind_0_$21 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            final SubLObject _prev_bind_1_$22 = $current_forward_problem_store$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                $current_forward_problem_store$.bind(NIL, thread);
                try {
                    final SubLObject _prev_bind_0_$22 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$23 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_forbidden_rules$.bind($NONE, thread);
                        kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                        assertibles_queue = forward_propagate_support_generate_assertibles(assertion, propagation_mt);
                        new_assertions = forward_propagate_handle_batched_assertibles(assertibles_queue, T);
                        new_assertions = list_utilities.nadjoin_to_end(assertion, new_assertions, UNPROVIDED);
                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_1_$23, thread);
                        kb_control_vars.$forward_inference_forbidden_rules$.rebind(_prev_bind_0_$22, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        clear_current_forward_problem_store();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                $current_forward_problem_store$.rebind(_prev_bind_1_$22, thread);
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$21, thread);
            }
        } finally {
            $prefer_forward_skolemization$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        queue_or_repropagate_forward_assertions(new_assertions);
        return new_assertions;
    }

    public static SubLObject forward_propagate_supports_and_generate_assertibles(final SubLObject supports, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(supports) : "list_utilities.non_dotted_list_p(supports) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(supports) " + supports;
        SubLObject cdolist_list_var = supports;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != arguments.support_p(elem) : "arguments.support_p(elem) " + "CommonSymbols.NIL != arguments.support_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject all_assertibles_queue = queues.create_queue(UNPROVIDED);
        final SubLObject environment = get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            SubLObject cdolist_list_var2 = supports;
            SubLObject support = NIL;
            support = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                try {
                    add_currently_forward_propagating_support(support);
                    final SubLObject assertibles_queue = forward_propagate_support_generate_assertibles(support, propagation_mt);
                    SubLObject cdolist_list_var_$26 = queues.do_queue_elements_queue_elements(assertibles_queue);
                    SubLObject assertible = NIL;
                    assertible = cdolist_list_var_$26.first();
                    while (NIL != cdolist_list_var_$26) {
                        queues.enqueue(assertible, all_assertibles_queue);
                        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                        assertible = cdolist_list_var_$26.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        rem_currently_forward_propagating_support(support);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                support = cdolist_list_var2.first();
            } 
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return all_assertibles_queue;
    }

    public static SubLObject forward_propagate_support_generate_assertibles(final SubLObject support, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertibles_queue = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($FORWARD_PROPAGATE_SUPPORT_GENERATE_ASSERTIBLES, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                final SubLObject _prev_bind_0_$28 = $noting_progress_delayed_mode_seconds$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = $noting_progress_delayed_mode_string$.currentBinding(thread);
                try {
                    $noting_progress_delayed_mode_seconds$.bind(NIL != $forward_inference_traceP$.getDynamicValue(thread) ? NIL : $int$30, thread);
                    $noting_progress_delayed_mode_string$.bind(format(NIL, $str57$__Propagating__S_, sefify(support)), thread);
                    final SubLObject str = format(NIL, $str57$__Propagating__S_, sefify(support));
                    final SubLObject _prev_bind_0_$29 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$30 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$32 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$33 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject store_var = get_forward_problem_store(support);
                        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
                        final SubLObject _prev_bind_0_$30 = memoization_state.$memoization_state$.currentBinding(thread);
                        try {
                            memoization_state.$memoization_state$.bind(local_state, thread);
                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                            try {
                                SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                                final SubLObject _prev_bind_0_$31 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$31 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$33 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$32 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$32 = $forward_inference_assertibles_queue$.currentBinding(thread);
                                        try {
                                            kb_control_vars.$within_forward_inferenceP$.bind(T, thread);
                                            $forward_inference_assertibles_queue$.bind(queues.create_queue(UNPROVIDED), thread);
                                            if (NIL != assertions_high.rule_assertionP(support)) {
                                                forward_propagate_rule(support, propagation_mt);
                                            } else {
                                                forward_propagate_asent_support(support, propagation_mt);
                                            }
                                            if (((NIL == queues.queue_empty_p(forward_inference_assertibles_queue())) && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))) && (NIL == $prefer_forward_skolemization$.getDynamicValue(thread))) {
                                                clear_current_forward_problem_store();
                                            }
                                            assertibles_queue = $forward_inference_assertibles_queue$.getDynamicValue(thread);
                                        } finally {
                                            $forward_inference_assertibles_queue$.rebind(_prev_bind_1_$32, thread);
                                            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0_$32, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_$33, thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$31, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$31, thread);
                                }
                                inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                            } finally {
                                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                }
                            }
                        } finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$30, thread);
                        }
                        if (NIL != $forward_inference_traceP$.getDynamicValue(thread)) {
                            format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), $str58$_____A_assertible__P, queues.queue_size(assertibles_queue), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_3_$33, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$32, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$30, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$29, thread);
                    }
                } finally {
                    $noting_progress_delayed_mode_string$.rebind(_prev_bind_1_$29, thread);
                    $noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0_$28, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $FORWARD_PROPAGATE_SUPPORT_GENERATE_ASSERTIBLES, $NO_GAF, NIL, NIL);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return assertibles_queue;
    }

    public static SubLObject forward_propagate_handle_batched_assertibles(final SubLObject assertibles_queue, SubLObject return_new_assertionsP) {
        if (return_new_assertionsP == UNPROVIDED) {
            return_new_assertionsP = NIL;
        }
        final SubLObject new_assertion_id_threshold = assertion_handles.next_assertion_id();
        final SubLObject result_assertions = set.new_set(symbol_function(EQ), UNPROVIDED);
        SubLObject deductions = NIL;
        SubLObject cdolist_list_var;
        deductions = cdolist_list_var = forward_propagate_support_handle_assertibles(assertibles_queue, NIL, T);
        SubLObject deduction = NIL;
        deduction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion = deductions_high.deduction_supported_object(deduction);
            if ((NIL != assertion_handles.assertion_p(assertion)) && ((NIL == return_new_assertionsP) || assertion_handles.assertion_id(assertion).numGE(new_assertion_id_threshold))) {
                set.set_add(assertion, result_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        } 
        return assertion_utilities.sort_assertions(set.set_element_list(result_assertions));
    }

    public static SubLObject forward_propagate_support_handle_assertibles(final SubLObject assertibles_queue, SubLObject support, SubLObject modify_hlP) {
        if (support == UNPROVIDED) {
            support = NIL;
        }
        if (modify_hlP == UNPROVIDED) {
            modify_hlP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertibles = NIL;
        clear_current_forward_problem_store();
        final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $forward_inference_assertibles_queue$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind(T, thread);
            $forward_inference_assertibles_queue$.bind(assertibles_queue, thread);
            $current_forward_problem_store$.bind(NIL, thread);
            try {
                final SubLObject _prev_bind_0_$43 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$44 = $prefer_forward_skolemization$.currentBinding(thread);
                try {
                    kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
                    $prefer_forward_skolemization$.bind(NIL, thread);
                    final SubLObject store_var = get_forward_problem_store(UNPROVIDED);
                    final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
                    final SubLObject _prev_bind_0_$44 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                            final SubLObject _prev_bind_0_$45 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$45 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$48 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                try {
                                    SubLObject doneP;
                                    SubLObject rest;
                                    SubLObject hl_assertible;
                                    SubLObject hl_assertible_var;
                                    SubLObject argument_spec;
                                    SubLObject hl_assertion_spec_var_$49;
                                    SubLObject hl_assertion_spec_var;
                                    SubLObject cnf;
                                    SubLObject mt;
                                    SubLObject direction;
                                    SubLObject variable_map;
                                    SubLObject last_metric_type;
                                    SubLObject last_metric;
                                    SubLObject last_gaf;
                                    SubLObject last_rule;
                                    SubLObject _prev_bind_0_$46;
                                    SubLObject _prev_bind_1_$46;
                                    SubLObject _prev_bind_2_$49;
                                    SubLObject _prev_bind_4;
                                    SubLObject _prev_bind_0_$47;
                                    SubLObject var;
                                    SubLObject _prev_bind_0_$48;
                                    SubLObject _values;
                                    for (doneP = NIL, rest = NIL, rest = queues.do_queue_elements_queue_elements(forward_inference_assertibles_queue()); (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                        hl_assertible = rest.first();
                                        if (NIL != assertions_high.invalid_assertionP(support, UNPROVIDED)) {
                                            Errors.warn($str59$Assertion__s_was_removed_by_its_o, assertion_handles.assertion_id(support));
                                            doneP = T;
                                        } else {
                                            hl_assertible_var = hl_assertible;
                                            argument_spec = hl_storage_modules.hl_assertible_argument_spec(hl_assertible_var);
                                            hl_assertion_spec_var = hl_assertion_spec_var_$49 = hl_storage_modules.hl_assertible_hl_assertion_spec(hl_assertible_var);
                                            cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$49);
                                            mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$49);
                                            direction = hl_storage_modules.hl_assertion_spec_direction(hl_assertion_spec_var_$49);
                                            variable_map = hl_storage_modules.hl_assertion_spec_variable_map(hl_assertion_spec_var_$49);
                                            if (NIL != list_utilities.tree_find_if($sym60$INVALID_ASSERTION_, argument_spec, UNPROVIDED)) {
                                                if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                                                    Errors.warn($str61$invalid_assertion_in_hl_assertibl, Mapping.mapcar(ASSERTION_ID, list_utilities.find_all_if($sym60$INVALID_ASSERTION_, argument_spec, UNPROVIDED)));
                                                }
                                            } else
                                                if (NIL != list_utilities.tree_find_if($sym63$INVALID_KB_HL_SUPPORT_, argument_spec, UNPROVIDED)) {
                                                    if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                                                        Errors.warn($str64$invalid_kb_hl_support_in_hl_asser, Mapping.mapcar(KB_HL_SUPPORT_ID, list_utilities.find_all_if($sym63$INVALID_KB_HL_SUPPORT_, argument_spec, UNPROVIDED)));
                                                    }
                                                } else {
                                                    last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                                                    last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                                                    last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                                                    last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                                                    if ((NIL != last_metric_type) && (NIL != last_metric)) {
                                                        inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
                                                    }
                                                    _prev_bind_0_$46 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                                                    _prev_bind_1_$46 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                                                    _prev_bind_2_$49 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                                                    _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                                                    try {
                                                        hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                                                        hl_macros.$forward_inference_metric_last_metric$.bind($HL_ADD_ASSERTIBLE, thread);
                                                        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                                                        hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                                                        try {
                                                            _prev_bind_0_$47 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
                                                            try {
                                                                kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                                                                if (NIL != modify_hlP) {
                                                                    var = hl_storage_modules.hl_add_assertible(hl_assertible);
                                                                    if (NIL != var) {
                                                                        assertibles = cons(var, assertibles);
                                                                    }
                                                                } else {
                                                                    assertibles = cons(hl_assertible, assertibles);
                                                                }
                                                            } finally {
                                                                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0_$47, thread);
                                                            }
                                                        } finally {
                                                            _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                _values = getValuesAsVector();
                                                                inference_metrics.increment_forward_inference_metrics($HARNESS, $HL_ADD_ASSERTIBLE, NIL, NIL, NIL);
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                                                        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$49, thread);
                                                        hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$46, thread);
                                                        hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$46, thread);
                                                    }
                                                }

                                        }
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_$48, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$45, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$45, thread);
                            }
                            inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                        } finally {
                            final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$44, thread);
                    }
                } finally {
                    $prefer_forward_skolemization$.rebind(_prev_bind_1_$44, thread);
                    kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0_$43, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    clear_current_forward_problem_store();
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                }
            }
        } finally {
            $current_forward_problem_store$.rebind(_prev_bind_3, thread);
            $forward_inference_assertibles_queue$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return nreverse(assertibles);
    }

    public static SubLObject forward_propagate_rule(final SubLObject rule, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $forward_inference_rule$.currentBinding(thread);
        try {
            $forward_inference_rule$.bind(rule, thread);
            final SubLObject rule_cnf = assertions_high.assertion_cnf(rule);
            final SubLObject pragmatic_dnf = inference_worker_transformation.forward_rule_pragmatic_dnf(rule, propagation_mt);
            handle_forward_propagation(rule_cnf, pragmatic_dnf, propagation_mt, NIL, rule, NIL);
        } finally {
            $forward_inference_rule$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject support_truth_sense(final SubLObject support) {
        return enumeration_types.truth_sense(arguments.support_truth(support));
    }

    public static SubLObject support_asent(final SubLObject support) {
        if (NIL != arguments.hl_support_p(support)) {
            return arguments.hl_support_sentence(support);
        }
        if (NIL != assertions_high.gaf_assertionP(support)) {
            return assertions_high.gaf_formula(support);
        }
        return Errors.error($str67$_S_does_not_have_an_atomic_senten, support);
    }

    public static SubLObject forward_propagate_asent_support(final SubLObject source_support, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $forward_inference_gaf$.currentBinding(thread);
        try {
            $forward_inference_gaf$.bind(source_support, thread);
            SubLObject forward_tactic_specs = NIL;
            SubLObject cdolist_list_var;
            forward_tactic_specs = cdolist_list_var = forward_propagate_asent_tactic_specs(source_support, propagation_mt);
            SubLObject forward_tactic_spec = NIL;
            forward_tactic_spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                forward_propagate_one_tactic_spec(source_support, forward_tactic_spec, propagation_mt);
                cdolist_list_var = cdolist_list_var.rest();
                forward_tactic_spec = cdolist_list_var.first();
            } 
        } finally {
            $forward_inference_gaf$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_propagate_asent_tactic_specs(final SubLObject source_support, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source_sense = support_truth_sense(source_support);
        SubLObject tactic_specs = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($FORWARD_TACTIC_SPECS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($OVERHEAD, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind($NO_RULE, thread);
            try {
                if (($POS == source_sense) || (NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread))) {
                    final SubLObject source_asent = copy_tree(support_asent(source_support));
                    final SubLObject _prev_bind_0_$58 = kb_control_vars.$relax_type_restrictions_for_nats$.currentBinding(thread);
                    try {
                        kb_control_vars.$relax_type_restrictions_for_nats$.bind(makeBoolean((NIL != kb_control_vars.$relax_type_restrictions_for_nats$.getDynamicValue(thread)) || (NIL != tou_asentP(source_asent))), thread);
                        tactic_specs = forward_modules.forward_tactic_specs(source_asent, source_sense, propagation_mt);
                    } finally {
                        kb_control_vars.$relax_type_restrictions_for_nats$.rebind(_prev_bind_0_$58, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($FORWARD_TACTIC_SPECS, $OVERHEAD, NIL, $NO_RULE, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return tactic_specs;
    }

    public static SubLObject forward_propagate_one_tactic_spec(final SubLObject source_gaf_assertion, final SubLObject forward_tactic_spec, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trigger_asent = NIL;
        SubLObject trigger_sense = NIL;
        SubLObject examine_asent = NIL;
        SubLObject trigger_support = NIL;
        SubLObject rule = NIL;
        destructuring_bind_must_consp(forward_tactic_spec, forward_tactic_spec, $list71);
        trigger_asent = forward_tactic_spec.first();
        SubLObject current = forward_tactic_spec.rest();
        destructuring_bind_must_consp(current, forward_tactic_spec, $list71);
        trigger_sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, forward_tactic_spec, $list71);
        examine_asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, forward_tactic_spec, $list71);
        trigger_support = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, forward_tactic_spec, $list71);
        rule = current.first();
        current = current.rest();
        final SubLObject additional_supports = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, forward_tactic_spec, $list71);
        current = current.rest();
        if (NIL == current) {
            final SubLObject examine_sense = enumeration_types.inverse_sense(trigger_sense);
            if (($NEG == examine_sense) || (NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread))) {
                if (NIL == arguments.support_p(trigger_support)) {
                    trigger_support = source_gaf_assertion;
                }
                final SubLObject trigger_supports = make_forward_trigger_supports(trigger_support, additional_supports);
                forward_propagate_gaf_internal(trigger_asent, examine_asent, examine_sense, propagation_mt, rule, trigger_supports);
            }
        } else {
            cdestructuring_bind_error(forward_tactic_spec, $list71);
        }
        return NIL;
    }

    public static SubLObject make_forward_trigger_supports(final SubLObject source_gaf_assertion, final SubLObject additional_supports) {
        SubLObject trigger_supports = copy_list(additional_supports);
        if (NIL != source_gaf_assertion) {
            trigger_supports = cons(source_gaf_assertion, trigger_supports);
        }
        return trigger_supports;
    }

    public static SubLObject forward_inference_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread).isList() ? list_utilities.find_all_if($sym73$VALID_ASSERTION_, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread), UNPROVIDED) : kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
    }

    public static SubLObject forward_inference_all_rules_allowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread), $ALL);
    }

    public static SubLObject forward_inference_rule_allowedP(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != forward_inference_all_rules_allowedP()) || (NIL != (NIL != set.set_p(kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread)) ? set.set_memberP(rule, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread)) : list_utilities.member_kbeqP(rule, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread)))));
    }

    public static SubLObject forward_inference_forbidden_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread).isList() ? list_utilities.find_all_if($sym73$VALID_ASSERTION_, kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread), UNPROVIDED) : kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread);
    }

    public static SubLObject forward_inference_no_rules_forbiddenP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread), $NONE);
    }

    public static SubLObject forward_inference_rule_forbiddenP(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == forward_inference_no_rules_forbiddenP()) && (NIL != (NIL != set.set_p(kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread)) ? set.set_memberP(rule, kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread)) : list_utilities.member_kbeqP(rule, kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread)))));
    }

    public static SubLObject forward_propagate_gaf_internal(SubLObject trigger_asent, SubLObject examine_asent, final SubLObject examine_sense, SubLObject propagation_mt, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fast_failP = NIL;
        SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($kw75$FORWARD_INFERENCE_RULE_ALLOWED_, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                if (NIL == forward_inference_rule_allowedP(rule)) {
                    fast_failP = T;
                }
            } finally {
                final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $kw75$FORWARD_INFERENCE_RULE_ALLOWED_, $NO_GAF, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        if (NIL == fast_failP) {
            last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if ((NIL != last_metric_type) && (NIL != last_metric)) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
            }
            _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind($kw76$FORWARD_INFERENCE_RULE_FORBIDDEN_, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                try {
                    if (NIL != forward_inference_rule_forbiddenP(rule)) {
                        fast_failP = T;
                    }
                } finally {
                    final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics($HARNESS, $kw76$FORWARD_INFERENCE_RULE_FORBIDDEN_, $NO_GAF, NIL, NIL);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                    }
                }
            } finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != fast_failP) {
            return NIL;
        }
        final SubLObject _prev_bind_5 = $forward_inference_rule$.currentBinding(thread);
        try {
            $forward_inference_rule$.bind(rule, thread);
            last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if ((NIL != last_metric_type) && (NIL != last_metric)) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
            }
            final SubLObject _prev_bind_0_$62 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind($FORWARD_PROPAGATE_GAF_INTERNAL, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                try {
                    if (NIL != $allow_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
                        propagation_mt = inference_psc_override_mt(current_forward_inference_gaf(), current_forward_inference_rule(), propagation_mt);
                    }
                    final SubLObject cnf = assertions_high.assertion_cnf(rule);
                    final SubLObject pos_lits = clauses.pos_lits(cnf);
                    final SubLObject neg_lits = clauses.neg_lits(cnf);
                    final SubLObject examine_lits = ($POS == examine_sense) ? pos_lits : neg_lits;
                    final SubLObject other_lits = ($POS == examine_sense) ? neg_lits : pos_lits;
                    final SubLObject pragmatic_dnf = inference_worker_transformation.forward_rule_pragmatic_dnf(rule, propagation_mt);
                    final SubLObject last_metric_type_$63 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                    final SubLObject last_metric_$64 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                    final SubLObject last_gaf_$65 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                    final SubLObject last_rule_$66 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                    if ((NIL != last_metric_type_$63) && (NIL != last_metric_$64)) {
                        inference_metrics.increment_forward_inference_metrics(last_metric_type_$63, last_metric_$64, last_gaf_$65, last_rule_$66, ZERO_INTEGER);
                    }
                    final SubLObject _prev_bind_0_$63 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$68 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$69 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$70 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                    try {
                        hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                        hl_macros.$forward_inference_metric_last_metric$.bind($POSSIBLY_SIMPLIFY_IST_SENTENCES_FOR_UNIFY, thread);
                        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
                        hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                        try {
                            thread.resetMultipleValues();
                            final SubLObject trigger_asent_$71 = removal_modules_ist.possibly_simplify_ist_sentences_for_unify(trigger_asent, examine_asent);
                            final SubLObject examine_asent_$72 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            trigger_asent = trigger_asent_$71;
                            examine_asent = examine_asent_$72;
                        } finally {
                            final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                inference_metrics.increment_forward_inference_metrics($HARNESS, $POSSIBLY_SIMPLIFY_IST_SENTENCES_FOR_UNIFY, $NO_GAF, NIL, NIL);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                            }
                        }
                    } finally {
                        hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_3_$70, thread);
                        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$69, thread);
                        hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$68, thread);
                        hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$63, thread);
                    }
                    if (cycl_utilities.atomic_sentence_predicate(trigger_asent).equal(cycl_utilities.atomic_sentence_predicate(examine_asent)) || ((NIL != auxiliary_indexing.unbound_predicate_literal(examine_asent)) && (NIL != compatible_formula_arity_p(examine_asent, trigger_asent)))) {
                        SubLObject trigger_bindings = NIL;
                        SubLObject gaf_asent = NIL;
                        SubLObject unify_justification = NIL;
                        final SubLObject last_metric_type_$64 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                        final SubLObject last_metric_$65 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                        final SubLObject last_gaf_$66 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                        final SubLObject last_rule_$67 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                        if ((NIL != last_metric_type_$64) && (NIL != last_metric_$65)) {
                            inference_metrics.increment_forward_inference_metrics(last_metric_type_$64, last_metric_$65, last_gaf_$66, last_rule_$67, ZERO_INTEGER);
                        }
                        final SubLObject _prev_bind_0_$65 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$69 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$70 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$71 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                        try {
                            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                            hl_macros.$forward_inference_metric_last_metric$.bind($GAF_ASENT_UNIFY, thread);
                            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
                            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                            try {
                                thread.resetMultipleValues();
                                final SubLObject trigger_bindings_$82 = unification_utilities.gaf_asent_unify(trigger_asent, examine_asent, T, T);
                                final SubLObject gaf_asent_$83 = thread.secondMultipleValue();
                                final SubLObject unify_justification_$84 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                trigger_bindings = trigger_bindings_$82;
                                gaf_asent = gaf_asent_$83;
                                unify_justification = unify_justification_$84;
                            } finally {
                                final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    inference_metrics.increment_forward_inference_metrics($HARNESS, $GAF_ASENT_UNIFY, $NO_GAF, NIL, NIL);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                }
                            }
                        } finally {
                            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_3_$71, thread);
                            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$70, thread);
                            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$69, thread);
                            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$65, thread);
                        }
                        if (NIL != trigger_bindings) {
                            SubLObject remainder_neg_lits = NIL;
                            SubLObject remainder_pos_lits = NIL;
                            if ($POS == examine_sense) {
                                remainder_neg_lits = other_lits;
                                remainder_pos_lits = remove(examine_asent, examine_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                remainder_neg_lits = remove(examine_asent, examine_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                remainder_pos_lits = other_lits;
                            }
                            handle_forward_propagation_from_gaf(examine_asent, remainder_neg_lits, remainder_pos_lits, pragmatic_dnf, propagation_mt, trigger_bindings, rule, append(trigger_supports, unify_justification));
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics($HARNESS, $FORWARD_PROPAGATE_GAF_INTERNAL, $NO_GAF, NIL, NIL);
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                    }
                }
            } finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$62, thread);
            }
        } finally {
            $forward_inference_rule$.rebind(_prev_bind_5, thread);
        }
        return NIL;
    }

    public static SubLObject handle_forward_propagation_from_gaf(final SubLObject examine_asent, final SubLObject remainder_neg_lits, final SubLObject remainder_pos_lits, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($HANDLE_FORWARD_PROPAGATION_FROM_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                final SubLObject restricted_remainder_neg_lits = bindings.apply_bindings(trigger_bindings, remainder_neg_lits);
                final SubLObject restricted_remainder_pos_lits = bindings.apply_bindings(trigger_bindings, remainder_pos_lits);
                final SubLObject restricted_rule_remainder_cnf = clauses.make_cnf(restricted_remainder_neg_lits, restricted_remainder_pos_lits);
                final SubLObject restricted_pragmatic_dnf = bindings.apply_bindings(trigger_bindings, pragmatic_dnf);
                final SubLObject _prev_bind_0_$87 = $forward_non_trigger_literal_restricted_examine_asent$.currentBinding(thread);
                try {
                    $forward_non_trigger_literal_restricted_examine_asent$.bind(bindings.apply_bindings(trigger_bindings, examine_asent), thread);
                    handle_forward_propagation(restricted_rule_remainder_cnf, restricted_pragmatic_dnf, propagation_mt, trigger_bindings, rule, trigger_supports);
                } finally {
                    $forward_non_trigger_literal_restricted_examine_asent$.rebind(_prev_bind_0_$87, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $HANDLE_FORWARD_PROPAGATION_FROM_GAF, $NO_GAF, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject creation_template_forward_rules_via_exemplars(final SubLObject creation_template) {
        final SubLObject exemplars = creation_template_exemplars(creation_template);
        return assertion_utilities.all_forward_rules_relevant_to_terms(exemplars);
    }

    public static SubLObject creation_template_exemplars(final SubLObject creation_template) {
        return kb_mapping_utilities.pred_values_in_any_mt(creation_template, $$creationTemplateFORTs, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject creation_template_allowable_rules(final SubLObject creation_template) {
        final SubLObject rule_set = set.new_set(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = all_genl_creation_templates(creation_template);
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$89 = creation_template_allowable_rules_internal(template);
            SubLObject rule = NIL;
            rule = cdolist_list_var_$89.first();
            while (NIL != cdolist_list_var_$89) {
                set.set_add(rule, rule_set);
                cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                rule = cdolist_list_var_$89.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return rule_set;
    }

    public static SubLObject all_genl_creation_templates(final SubLObject creation_template) {
        return backward.removal_ask_variable($sym83$_TEMPLATE, listS($$genlCreationTemplate, creation_template, $list85), $$EverythingPSC, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject creation_template_allowable_rules_internal(final SubLObject creation_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = kb_mapping_utilities.pred_values_in_any_mt(creation_template, $$creationTemplateAllowableRules, ONE_INTEGER, TWO_INTEGER, $TRUE);
        SubLObject cdolist_list_var;
        final SubLObject mts = cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(creation_template, $const88$creationTemplateAllowsAllRulesFro, ONE_INTEGER, TWO_INTEGER, $TRUE);
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql($MT)) {
                if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, $RULE)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, $TRUE, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(rule));
                            if ((NIL != valid) && (NIL != assertions_high.forward_assertionP(rule))) {
                                final SubLObject item_var = rule;
                                if (NIL == member(item_var, rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    rules = cons(item_var, rules);
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            } else
                if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, $RULE))) {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = $str92$do_broad_mt_index;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$90 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$90, $SKIP)) {
                                final SubLObject idx_$91 = idx_$90;
                                if (NIL == id_index_dense_objects_empty_p(idx_$91, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$91);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject rule2;
                                    SubLObject item_var2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            rule2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(rule2, mt, $RULE, $TRUE)) && (NIL != assertions_high.forward_assertionP(rule2))) {
                                                item_var2 = rule2;
                                                if (NIL == member(item_var2, rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    rules = cons(item_var2, rules);
                                                }
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$92 = idx_$90;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$92)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$92);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$92);
                                    final SubLObject end_id = id_index_next_id(idx_$92);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject rule3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(rule3, mt, $RULE, $TRUE)) && (NIL != assertions_high.forward_assertionP(rule3))) {
                                                final SubLObject item_var3 = rule3;
                                                if (NIL == member(item_var3, rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    rules = cons(item_var3, rules);
                                                }
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject handle_forward_propagation(final SubLObject rule_remainder_cnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject failureP = forward_propagation_supports_doomedP(rule, trigger_supports);
        if (NIL != failureP) {
            if (NIL != call_forward_inference_browsing_callbackP()) {
                call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, trigger_supports, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, list($TYPE, $FORWARD_PROPAGATION_SUPPORTS_DOOMED, $SUPPORT_MTS, list_utilities.fast_remove_duplicates(remove($$InferencePSC, cons(assertions_high.assertion_mt(rule), Mapping.mapcar(SUPPORT_MT, trigger_supports)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) }));
            }
            return NIL;
        }
        final SubLObject rule_remainder_neg_lits = clauses.neg_lits(rule_remainder_cnf);
        SubLObject cdolist_list_var;
        final SubLObject rule_remainder_pos_lits = cdolist_list_var = clauses.pos_lits(rule_remainder_cnf);
        SubLObject target_asent = NIL;
        target_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject other_pos_lits = remove(target_asent, rule_remainder_pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject query_dnf = clauses.make_dnf(other_pos_lits, rule_remainder_neg_lits);
            handle_one_forward_propagation(query_dnf, pragmatic_dnf, propagation_mt, target_asent, $TRUE, trigger_bindings, rule, trigger_supports);
            cdolist_list_var = cdolist_list_var.rest();
            target_asent = cdolist_list_var.first();
        } 
        if (NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue(thread)) {
            cdolist_list_var = rule_remainder_neg_lits;
            target_asent = NIL;
            target_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject other_neg_lits = remove(target_asent, rule_remainder_neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject query_dnf = clauses.make_dnf(rule_remainder_pos_lits, other_neg_lits);
                handle_one_forward_propagation(query_dnf, pragmatic_dnf, propagation_mt, target_asent, $FALSE, trigger_bindings, rule, trigger_supports);
                cdolist_list_var = cdolist_list_var.rest();
                target_asent = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject handle_one_forward_propagation(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject target_asent, final SubLObject target_truth, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $handle_one_forward_propagation_callback$.getDynamicValue(thread)) {
            return funcall($handle_one_forward_propagation_callback$.getDynamicValue(thread), new SubLObject[]{ query_dnf, pragmatic_dnf, propagation_mt, target_asent, target_truth, trigger_bindings, rule, trigger_supports });
        }
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($INFERENCE_REJECTED);
            if ((NIL != clauses.empty_clauseP(query_dnf)) && (NIL != clauses.empty_clauseP(pragmatic_dnf))) {
                final SubLObject query_time = ZERO_INTEGER;
                final SubLObject inference = NIL;
                inference_metrics.increment_forward_inference_historical_count();
                inference_metrics.note_forward_inference_for_rule(rule, inference);
                inference_metrics.increment_successful_forward_inference_historical_count();
                add_empty_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports);
                return NIL;
            }
            SubLObject failureP = NIL;
            SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if ((NIL != last_metric_type) && (NIL != last_metric)) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
            }
            SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind($SYNTACTICALLY_INVALID_FORWARD_DNF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                try {
                    failureP = makeBoolean(NIL == syntactically_valid_forward_dnf(query_dnf, pragmatic_dnf, propagation_mt, UNPROVIDED));
                    if ((NIL != failureP) && (NIL != call_forward_inference_browsing_callbackP())) {
                        call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, target_asent, $TARGET_TRUTH, target_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, trigger_supports, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, nth_value_step_2(nth_value_step_1(ONE_INTEGER), syntactically_valid_forward_dnf(query_dnf, pragmatic_dnf, propagation_mt, T)) }));
                    }
                    if (NIL != failureP) {
                        return NIL;
                    }
                } finally {
                    final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics($HARNESS, $SYNTACTICALLY_INVALID_FORWARD_DNF, $NO_GAF, NIL, NIL);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                    }
                }
            } finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
            failureP = NIL;
            last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if ((NIL != last_metric_type) && (NIL != last_metric)) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
            }
            _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind($SEMANTICALLY_INVALID_FORWARD_DNF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                try {
                    failureP = makeBoolean(NIL == semantically_valid_forward_dnf(query_dnf, pragmatic_dnf, propagation_mt, UNPROVIDED));
                    if ((NIL != failureP) && (NIL != call_forward_inference_browsing_callbackP())) {
                        call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, target_asent, $TARGET_TRUTH, target_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, trigger_supports, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, nth_value_step_2(nth_value_step_1(ONE_INTEGER), semantically_valid_forward_dnf(query_dnf, pragmatic_dnf, propagation_mt, T)) }));
                    }
                } finally {
                    final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics($HARNESS, $SEMANTICALLY_INVALID_FORWARD_DNF, $NO_GAF, NIL, NIL);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                    }
                }
            } finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
            if (NIL != failureP) {
                return NIL;
            }
            failureP = NIL;
            last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if ((NIL != last_metric_type) && (NIL != last_metric)) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
            }
            _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind($NULL_MAX_FLOOR_MTS_OF_RULE_AND_GAF_MTS, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                try {
                    failureP = makeBoolean((NIL != $check_forward_propagate_doomed_due_to_null_max_floor_mtsP$.getDynamicValue(thread)) && (NIL != forward_propagate_doomed_due_to_null_max_floor_mtsP(rule, current_forward_inference_gaf(), trigger_supports)));
                    if ((NIL != failureP) && (NIL != call_forward_inference_browsing_callbackP())) {
                        call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, target_asent, $TARGET_TRUTH, target_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, trigger_supports, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, list($TYPE, $NULL_MAX_FLOOR_MTS_OF_RULE_AND_GAF_MTS, $RULE_MT, assertions_high.assertion_mt(rule), $GAF_MT, arguments.support_mt(current_forward_inference_gaf())) }));
                    }
                    if (NIL != failureP) {
                        return NIL;
                    }
                } finally {
                    final SubLObject _prev_bind_0_$96 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics($HARNESS, $NULL_MAX_FLOOR_MTS_OF_RULE_AND_GAF_MTS, $NO_GAF, NIL, NIL);
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                    }
                }
            } finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
            final SubLObject filtered_pragmatic_dnf = filter_forward_pragmatic_dnf(pragmatic_dnf);
            forward_propagate_dnf(query_dnf, filtered_pragmatic_dnf, propagation_mt, target_asent, target_truth, trigger_bindings, rule, trigger_supports);
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $INFERENCE_REJECTED);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject forward_propagate_doomed_due_to_null_max_floor_mtsP(final SubLObject rule, final SubLObject gaf, SubLObject trigger_supports) {
        if (trigger_supports == UNPROVIDED) {
            trigger_supports = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == rule) || (NIL == gaf)) {
            return NIL;
        }
        if (NIL != assertion_utilities.universal_lifting_ruleP(rule)) {
            return NIL;
        }
        SubLObject ist_antecedent_lit_propagationP = NIL;
        if (NIL == ist_antecedent_lit_propagationP) {
            SubLObject csome_list_var = trigger_supports;
            SubLObject trigger_support = NIL;
            trigger_support = csome_list_var.first();
            while ((NIL == ist_antecedent_lit_propagationP) && (NIL != csome_list_var)) {
                if ((NIL != arguments.hl_support_p(trigger_support)) && ($QUERY == arguments.hl_support_module(trigger_support))) {
                    ist_antecedent_lit_propagationP = T;
                }
                if (NIL != ist_antecedent_lit_propagationP) {
                    return NIL;
                }
                csome_list_var = csome_list_var.rest();
                trigger_support = csome_list_var.first();
            } 
        }
        final SubLObject gaf_mt = arguments.support_mt(current_forward_inference_gaf());
        final SubLObject rule_mt = arguments.support_mt(rule);
        final SubLObject _prev_bind_0 = genl_mts.$suppress_max_floor_mts_explosion_warning$.currentBinding(thread);
        try {
            genl_mts.$suppress_max_floor_mts_explosion_warning$.bind(T, thread);
            if ((((NIL != mt_vars.core_microtheory_p(gaf_mt)) || (NIL != mt_vars.core_microtheory_p(rule_mt))) || (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(rule_mt))) || (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(gaf_mt))) {
                return NIL;
            }
            final SubLObject gaf_mt_monad = hlmt.hlmt_monad_mt(gaf_mt);
            final SubLObject rule_mt_monad = hlmt.hlmt_monad_mt(rule_mt);
            if ((NIL == genl_mts.asserted_spec_mtsP(gaf_mt_monad, UNPROVIDED)) && (NIL == mt_relevance_cache.basemtP(rule_mt_monad, gaf_mt_monad))) {
                return NIL;
            }
            final SubLObject _prev_bind_0_$97 = $forward_leafy_mt_threshold$.currentBinding(thread);
            try {
                $forward_leafy_mt_threshold$.bind(SEVENTEEN_INTEGER, thread);
                if (NIL != forward_propagation_mts_doomedP(list(gaf_mt_monad, rule_mt_monad))) {
                    return T;
                }
            } finally {
                $forward_leafy_mt_threshold$.rebind(_prev_bind_0_$97, thread);
            }
        } finally {
            genl_mts.$suppress_max_floor_mts_explosion_warning$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject filter_forward_pragmatic_dnf(final SubLObject pragmatic_dnf) {
        final SubLObject pos_lits = clauses.pos_lits(pragmatic_dnf);
        if (NIL == find_if($sym112$FORWARD_PRAGMATIC_TRIGGER_LITERAL_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return pragmatic_dnf;
        }
        final SubLObject new_pos_lits = remove_if($sym112$FORWARD_PRAGMATIC_TRIGGER_LITERAL_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return clauses.make_dnf(clauses.neg_lits(pragmatic_dnf), new_pos_lits);
    }

    public static SubLObject forward_propagate_dnf(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject target_asent, final SubLObject target_truth, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($FORWARD_PROPAGATE_DNF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                SubLObject forward_results = NIL;
                SubLObject inference = NIL;
                SubLObject query_time = NIL;
                SubLObject halt_reason = NIL;
                thread.resetMultipleValues();
                final SubLObject forward_results_$98 = new_forward_query_from_dnf(query_dnf, pragmatic_dnf, propagation_mt, UNPROVIDED);
                final SubLObject inference_$99 = thread.secondMultipleValue();
                final SubLObject query_time_$100 = thread.thirdMultipleValue();
                final SubLObject halt_reason_$101 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                forward_results = forward_results_$98;
                inference = inference_$99;
                query_time = query_time_$100;
                halt_reason = halt_reason_$101;
                if (NIL != call_forward_inference_browsing_callbackP()) {
                    call_forward_inference_browsing_callback(inference, rule, list(new SubLObject[]{ $TARGET_ASENT, target_asent, $TARGET_TRUTH, target_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, trigger_supports, $FORWARD_RESULTS, forward_results }));
                }
                inference_metrics.increment_forward_inference_historical_count();
                if (NIL != forward_results) {
                    inference_metrics.increment_successful_forward_inference_historical_count();
                }
                if (halt_reason == $EXHAUST_TOTAL) {
                    final SubLObject _prev_bind_0_$102 = $silent_progressP$.currentBinding(thread);
                    try {
                        $silent_progressP$.bind(numL(length(forward_results), $forward_inference_show_propagation_results_progress_cutoff$.getDynamicValue(thread)), thread);
                        final SubLObject list_var = forward_results;
                        final SubLObject _prev_bind_0_$103 = $progress_note$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$104 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$105 = $progress_total$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$106 = $progress_sofar$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $progress_note$.bind(NIL != (NIL != $silent_progressP$.getDynamicValue(thread) ? $$$Propagating_results : cconcatenate($$$Propagating_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(forward_results)), $$$_results_for_, format_nil.format_nil_s_no_copy(current_forward_inference_gaf()), $str119$____, format_nil.format_nil_s_no_copy(target_asent) })) ? NIL != $silent_progressP$.getDynamicValue(thread) ? $$$Propagating_results : cconcatenate($$$Propagating_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(forward_results)), $$$_results_for_, format_nil.format_nil_s_no_copy(current_forward_inference_gaf()), $str119$____, format_nil.format_nil_s_no_copy(target_asent) }) : $$$cdolist, thread);
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_total$.bind(length(list_var), thread);
                            $progress_sofar$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                SubLObject csome_list_var = list_var;
                                SubLObject forward_result = NIL;
                                forward_result = csome_list_var.first();
                                while (NIL != csome_list_var) {
                                    add_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports, forward_result);
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    csome_list_var = csome_list_var.rest();
                                    forward_result = csome_list_var.first();
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$104 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                            $progress_sofar$.rebind(_prev_bind_3_$106, thread);
                            $progress_total$.rebind(_prev_bind_2_$105, thread);
                            $progress_start_time$.rebind(_prev_bind_1_$104, thread);
                            $progress_note$.rebind(_prev_bind_0_$103, thread);
                        }
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_0_$102, thread);
                    }
                } else
                    if (((halt_reason != $EXHAUST_TOTAL) && (NIL != forward_propagate_rule_via_trigger_gafsP())) && (NIL != current_forward_inference_fully_propagating_ruleP())) {
                        final SubLObject last_metric_type_$108 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                        final SubLObject last_metric_$109 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                        final SubLObject last_gaf_$110 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                        final SubLObject last_rule_$111 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                        if ((NIL != last_metric_type_$108) && (NIL != last_metric_$109)) {
                            inference_metrics.increment_forward_inference_metrics(last_metric_type_$108, last_metric_$109, last_gaf_$110, last_rule_$111, ZERO_INTEGER);
                        }
                        final SubLObject _prev_bind_0_$105 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$105 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$106 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$107 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                        try {
                            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                            hl_macros.$forward_inference_metric_last_metric$.bind($FORWARD_PROPAGATE_RULE_VIA_TRIGGER_GAFS, thread);
                            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                            try {
                                clear_current_forward_problem_store();
                                final SubLObject environment = get_forward_inference_environment();
                                assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
                                final SubLObject _prev_bind_0_$106 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                                try {
                                    kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                    forward_rule_propagation.forward_propagate_rule_via_trigger_gafs(current_forward_inference_rule(), UNPROVIDED);
                                } finally {
                                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$106, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$107 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    inference_metrics.increment_forward_inference_metrics($HARNESS, $FORWARD_PROPAGATE_RULE_VIA_TRIGGER_GAFS, NIL, NIL, NIL);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                }
                            }
                        } finally {
                            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_3_$107, thread);
                            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$106, thread);
                            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$105, thread);
                            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$105, thread);
                        }
                    } else {
                        Errors.warn($str122$Forward_inference_incomplete_for_, current_forward_inference_gaf(), current_forward_inference_rule(), halt_reason);
                        final SubLObject list_var2 = forward_results;
                        final SubLObject _prev_bind_0_$108 = $progress_note$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$106 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$107 = $progress_total$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$108 = $progress_sofar$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $progress_note$.bind(NIL != cconcatenate($$$Propagating_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(forward_results)), $$$_results_for_, format_nil.format_nil_s_no_copy(current_forward_inference_gaf()), $str119$____, format_nil.format_nil_s_no_copy(target_asent) }) ? cconcatenate($$$Propagating_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(forward_results)), $$$_results_for_, format_nil.format_nil_s_no_copy(current_forward_inference_gaf()), $str119$____, format_nil.format_nil_s_no_copy(target_asent) }) : $$$cdolist, thread);
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_total$.bind(length(list_var2), thread);
                            $progress_sofar$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                SubLObject csome_list_var2 = list_var2;
                                SubLObject forward_result2 = NIL;
                                forward_result2 = csome_list_var2.first();
                                while (NIL != csome_list_var2) {
                                    add_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports, forward_result2);
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    csome_list_var2 = csome_list_var2.rest();
                                    forward_result2 = csome_list_var2.first();
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$109 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                            $progress_sofar$.rebind(_prev_bind_3_$108, thread);
                            $progress_total$.rebind(_prev_bind_2_$107, thread);
                            $progress_start_time$.rebind(_prev_bind_1_$106, thread);
                            $progress_note$.rebind(_prev_bind_0_$108, thread);
                        }
                    }

            } finally {
                final SubLObject _prev_bind_0_$110 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $FORWARD_PROPAGATE_DNF, NIL, NIL, NIL);
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject new_forward_query_from_dnf(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = $forward_inference_overriding_query_properties$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_properties = forward_inference_query_properties(pragmatic_dnf, overriding_query_properties);
        SubLObject forward_results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject query_time = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($INFERENCE, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($OVERHEAD, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                final SubLObject time_var = get_internal_real_time();
                thread.resetMultipleValues();
                final SubLObject forward_results_$124 = inference_kernel.new_cyc_query_from_dnf(query_dnf, propagation_mt, NIL, query_properties);
                final SubLObject halt_reason_$125 = thread.secondMultipleValue();
                final SubLObject inference_$126 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                forward_results = forward_results_$124;
                halt_reason = halt_reason_$125;
                inference = inference_$126;
                query_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            } finally {
                final SubLObject _prev_bind_0_$127 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($INFERENCE, $OVERHEAD, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$127, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return values(forward_results, inference, query_time, halt_reason);
    }

    public static SubLObject new_cyc_trivial_forward_query_from_dnf(final SubLObject dnf, final SubLObject mt, SubLObject scoped_vars, SubLObject overriding_query_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        final SubLObject query_properties = trivial_forward_inference_query_properties(clauses.empty_clause(), overriding_query_properties);
        return inference_trivial.new_cyc_trivial_query_from_dnf(dnf, mt, scoped_vars, query_properties);
    }

    public static SubLObject new_forward_query(final SubLObject query_sentence, SubLObject pragmatic_dnf, SubLObject propagation_mt) {
        if (pragmatic_dnf == UNPROVIDED) {
            pragmatic_dnf = clauses.empty_clause();
        }
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_properties = forward_inference_query_properties(pragmatic_dnf, UNPROVIDED);
        SubLObject forward_results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject query_time = NIL;
        final SubLObject time_var = get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject forward_results_$128 = inference_kernel.new_cyc_query(query_sentence, propagation_mt, query_properties);
        final SubLObject halt_reason_$129 = thread.secondMultipleValue();
        final SubLObject inference_$130 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        forward_results = forward_results_$128;
        halt_reason = halt_reason_$129;
        inference = inference_$130;
        query_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return values(forward_results, inference, query_time, halt_reason);
    }

    public static SubLObject forward_inference_query_properties(final SubLObject pragmatic_dnf, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = get_forward_problem_store(UNPROVIDED);
        final SubLObject non_explanatory_sentence = (NIL != clauses.empty_clauseP(pragmatic_dnf)) ? NIL : clauses.dnf_formula(pragmatic_dnf);
        final SubLObject browsableP = list_utilities.sublisp_boolean(browse_forward_inferencesP());
        final SubLObject blockP = list_utilities.sublisp_boolean($block_forward_inferencesP$.getDynamicValue(thread));
        final SubLObject max_time = kb_control_vars.$forward_inference_time_cutoff$.getDynamicValue(thread);
        final SubLObject productivity_limit = forward_inference_productivity_limit();
        final SubLObject new_terms_allowed = $prefer_forward_skolemization$.getDynamicValue(thread);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == inference_datastructures_problem_store.problem_store_p(store))) {
            Errors.error($str124$Tried_to_do_forward_inference_out);
        }
        SubLObject query_properties = list(new SubLObject[]{ $PROBLEM_STORE, store, $NON_EXPLANATORY_SENTENCE, non_explanatory_sentence, $kw127$ALLOW_INDETERMINATE_RESULTS_, T, $BROWSABLE_, browsableP, $BLOCK_, blockP, $PRODUCTIVITY_LIMIT, productivity_limit, $PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER, $MAX_TIME, max_time, $RESULT_UNIQUENESS, $PROOF, $RETURN, $BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS, $kw137$NEW_TERMS_ALLOWED_, new_terms_allowed });
        if (NIL != overriding_query_properties) {
            query_properties = list_utilities.merge_plist(query_properties, overriding_query_properties);
        }
        return query_properties;
    }

    public static SubLObject trivial_forward_inference_query_properties(final SubLObject pragmatic_dnf, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        final SubLObject query_properties = forward_inference_query_properties(pragmatic_dnf, overriding_query_properties);
        SubLObject trivial_query_properties = NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            if (NIL != inference_trivial.trivial_strategist_can_handle_query_propertyP(property, value)) {
                trivial_query_properties = putf(trivial_query_properties, property, value);
            }
        }
        return trivial_query_properties;
    }

    public static SubLObject forward_inference_productivity_limit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff($forward_inference_removal_cost_cutoff$.getDynamicValue(thread));
        final SubLObject possible_rule_forward_inference_productivity_limit = NIL;
        return productivity_limit;
    }

    public static SubLObject rule_forward_inference_productivity_limit(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff($forward_inference_removal_cost_cutoff$.getDynamicValue(thread));
        final SubLObject asserted_when = assertions_high.asserted_when(rule);
        if (NIL != wff.assertive_wff_ruleP(rule)) {
            productivity_limit = number_utilities.div(productivity_limit, $assertive_wff_rule_whacking_factor$.getDynamicValue(thread));
        } else
            if (NIL == assertions_high.assertion_has_dependents_p(rule)) {
                if ((NIL != $rule_forward_inference_productivity_aggressive_whacking_modeP$.getDynamicValue(thread)) && (NIL == asserted_when)) {
                    productivity_limit = number_utilities.div(productivity_limit, number_utilities.f_1X(number_utilities.div($old_rule_without_dependents_or_bookkeeping_whacking_factor$.getDynamicValue(thread), $old_rule_without_dependents_whacking_compensation_factor$.getDynamicValue(thread))));
                } else
                    if (NIL != $rule_forward_inference_productivity_aggressive_whacking_modeP$.getDynamicValue(thread)) {
                        final SubLObject old_factor = subtract(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), asserted_when);
                        if (NIL != subl_promotions.positive_integer_p(old_factor)) {
                            productivity_limit = number_utilities.div(productivity_limit, number_utilities.f_1X(number_utilities.div(old_factor, $old_rule_without_dependents_whacking_compensation_factor$.getDynamicValue(thread))));
                        }
                    }

            }

        if (productivity_limit.numL($minimum_rule_forward_inference_productivity_limit$.getDynamicValue(thread))) {
            productivity_limit = $minimum_rule_forward_inference_productivity_limit$.getDynamicValue(thread);
        }
        return productivity_limit;
    }

    public static SubLObject add_forward_propagation_result(final SubLObject target_asent, final SubLObject target_truth, final SubLObject propagation_mt, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports, final SubLObject forward_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($ADD_FORWARD_PROPAGATION_RESULT, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                SubLObject inference_bindings = NIL;
                SubLObject inference_supports = NIL;
                SubLObject inference_pragmatic_supports = NIL;
                destructuring_bind_must_consp(forward_result, forward_result, $list142);
                inference_bindings = forward_result.first();
                SubLObject current = forward_result.rest();
                destructuring_bind_must_consp(current, forward_result, $list142);
                inference_supports = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, forward_result, $list142);
                inference_pragmatic_supports = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject concluded_asent = bindings.apply_bindings(inference_bindings, target_asent);
                    if (NIL == hl_ground_tree_p(concluded_asent)) {
                        if (NIL != call_forward_inference_browsing_callbackP()) {
                            call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, target_asent, $TARGET_TRUTH, target_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, trigger_supports, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, list($TYPE, $CONCLUDED_ASENT_NOT_HL_GROUND_TREE, $ASENT, concluded_asent) }));
                        }
                    } else {
                        final SubLObject concluded_supports = new_forward_concluded_supports(rule, trigger_supports, inference_supports);
                        add_forward_deductions_from_supports(propagation_mt, concluded_asent, target_truth, concluded_supports, inference_pragmatic_supports, rule, trigger_bindings, inference_bindings);
                    }
                } else {
                    cdestructuring_bind_error(forward_result, $list142);
                }
            } finally {
                final SubLObject _prev_bind_0_$131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $ADD_FORWARD_PROPAGATION_RESULT, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject add_empty_forward_propagation_result(final SubLObject target_asent, final SubLObject target_truth, final SubLObject propagation_mt, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        if (NIL != call_forward_inference_browsing_callbackP()) {
            call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, target_asent, $TARGET_TRUTH, target_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, trigger_supports, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ONE_INTEGER }));
        }
        return add_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports, $list145);
    }

    public static SubLObject new_forward_concluded_supports(final SubLObject rule, final SubLObject trigger_supports, SubLObject inference_supports) {
        if (inference_supports == UNPROVIDED) {
            inference_supports = NIL;
        }
        return bq_cons(rule, append(NIL != trigger_supports ? copy_list(trigger_supports) : NIL, NIL != inference_supports ? copy_list(inference_supports) : NIL, NIL));
    }

    public static SubLObject add_forward_deductions_from_supports(final SubLObject propagation_mt, final SubLObject concluded_asent, final SubLObject concluded_truth, final SubLObject concluded_supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $add_forward_deductions_from_supports_callback$.getDynamicValue(thread)) {
            return funcall($add_forward_deductions_from_supports_callback$.getDynamicValue(thread), new SubLObject[]{ propagation_mt, concluded_asent, concluded_truth, concluded_supports, pragmatic_supports, rule, trigger_bindings, inference_bindings });
        }
        thread.resetMultipleValues();
        final SubLObject mt_support_combinations = compute_all_mt_and_support_combinations(concluded_supports, pragmatic_supports);
        final SubLObject failure_reasons = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == mt_support_combinations) {
            if (NIL != call_forward_inference_browsing_callbackP()) {
                call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, concluded_asent, $TARGET_TRUTH, concluded_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, NIL, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, list($TYPE, $NULL_MT_SUPPORT_COMBINATIONS, $ASENT, concluded_asent, $FORM, list(COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS, sefify(concluded_supports), sefify(pragmatic_supports)), $FAILURE_REASONS, failure_reasons) }));
            }
        } else
            if (((NIL != kb_accessors.decontextualized_literalP(concluded_asent)) && (NIL != global_forward_propagation_mtP(propagation_mt))) && (NIL != $compute_decontextualized_deduction_mtP$.getDynamicValue(thread))) {
                SubLObject valid_liftP = NIL;
                if (NIL == valid_liftP) {
                    SubLObject csome_list_var = mt_support_combinations;
                    SubLObject mt_support_combination = NIL;
                    mt_support_combination = csome_list_var.first();
                    while ((NIL == valid_liftP) && (NIL != csome_list_var)) {
                        if (NIL == valid_liftP) {
                            SubLObject csome_list_var_$132 = mt_support_combination.first();
                            SubLObject concluded_mt = NIL;
                            concluded_mt = csome_list_var_$132.first();
                            while ((NIL == valid_liftP) && (NIL != csome_list_var_$132)) {
                                if (NIL != mt_relevance_macros.mt_relevant_to_mtP(propagation_mt, concluded_mt)) {
                                    valid_liftP = T;
                                }
                                csome_list_var_$132 = csome_list_var_$132.rest();
                                concluded_mt = csome_list_var_$132.first();
                            } 
                        }
                        csome_list_var = csome_list_var.rest();
                        mt_support_combination = csome_list_var.first();
                    } 
                }
                if ((NIL == valid_liftP) && (NIL != call_forward_inference_browsing_callbackP())) {
                    call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, concluded_asent, $TARGET_TRUTH, concluded_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, NIL, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, list(new SubLObject[]{ $TYPE, $INVALID_LIFT, $ASENT, concluded_asent, $PROPAGATION_MT, propagation_mt, $MT_SUPPORT_COMBINATIONS, sefify(mt_support_combinations), $FAILURE_REASONS, failure_reasons }) }));
                }
                if (NIL != valid_liftP) {
                    final SubLObject convention_mt = kb_accessors.decontextualized_literal_convention_mt(concluded_asent);
                    SubLObject placement_doneP = NIL;
                    if (NIL == placement_doneP) {
                        SubLObject csome_list_var2 = mt_support_combinations;
                        SubLObject mt_support_combination2 = NIL;
                        mt_support_combination2 = csome_list_var2.first();
                        while ((NIL == placement_doneP) && (NIL != csome_list_var2)) {
                            SubLObject current;
                            final SubLObject datum = current = mt_support_combination2;
                            SubLObject concluded_mts = NIL;
                            SubLObject support_combination = NIL;
                            destructuring_bind_must_consp(current, datum, $list153);
                            concluded_mts = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list153);
                            support_combination = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL == placement_doneP) {
                                    SubLObject csome_list_var_$133;
                                    SubLObject concluded_mt2;
                                    for (csome_list_var_$133 = concluded_mts, concluded_mt2 = NIL, concluded_mt2 = csome_list_var_$133.first(); (NIL == placement_doneP) && (NIL != csome_list_var_$133); placement_doneP = sublisp_null(handle_forward_deduction_in_mt(concluded_asent, concluded_truth, concluded_mt2, convention_mt, support_combination, pragmatic_supports, rule, trigger_bindings, inference_bindings)) , csome_list_var_$133 = csome_list_var_$133.rest() , concluded_mt2 = csome_list_var_$133.first()) {
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list153);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            mt_support_combination2 = csome_list_var2.first();
                        } 
                    }
                }
            } else
                if (NIL != kb_accessors.decontextualized_literalP(concluded_asent)) {
                    SubLObject valid_liftP = NIL;
                    if (NIL == valid_liftP) {
                        SubLObject csome_list_var = mt_support_combinations;
                        SubLObject mt_support_combination = NIL;
                        mt_support_combination = csome_list_var.first();
                        while ((NIL == valid_liftP) && (NIL != csome_list_var)) {
                            if (NIL == valid_liftP) {
                                SubLObject csome_list_var_$134 = mt_support_combination.first();
                                SubLObject concluded_mt = NIL;
                                concluded_mt = csome_list_var_$134.first();
                                while ((NIL == valid_liftP) && (NIL != csome_list_var_$134)) {
                                    if (NIL != mt_relevance_macros.mt_relevant_to_mtP(propagation_mt, concluded_mt)) {
                                        valid_liftP = T;
                                    }
                                    csome_list_var_$134 = csome_list_var_$134.rest();
                                    concluded_mt = csome_list_var_$134.first();
                                } 
                            }
                            csome_list_var = csome_list_var.rest();
                            mt_support_combination = csome_list_var.first();
                        } 
                    }
                    if ((NIL == valid_liftP) && (NIL != call_forward_inference_browsing_callbackP())) {
                        call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, concluded_asent, $TARGET_TRUTH, concluded_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, NIL, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, list(new SubLObject[]{ $TYPE, $INVALID_LIFT, $ASENT, concluded_asent, $PROPAGATION_MT, propagation_mt, $MT_SUPPORT_COMBINATIONS, sefify(mt_support_combinations), $FAILURE_REASONS, failure_reasons }) }));
                    }
                    if (NIL != valid_liftP) {
                        final SubLObject convention_mt = kb_accessors.decontextualized_literal_convention_mt(concluded_asent);
                        handle_forward_deduction_in_mt(concluded_asent, concluded_truth, propagation_mt, convention_mt, concluded_supports, pragmatic_supports, rule, trigger_bindings, inference_bindings);
                    }
                } else
                    if (NIL != global_forward_propagation_mtP(propagation_mt)) {
                        SubLObject mt_support_combination3 = NIL;
                        SubLObject mt_support_combination_$135 = NIL;
                        SubLObject failure_reason = NIL;
                        SubLObject failure_reason_$136 = NIL;
                        mt_support_combination3 = mt_support_combinations;
                        mt_support_combination_$135 = mt_support_combination3.first();
                        failure_reason = failure_reasons;
                        failure_reason_$136 = failure_reason.first();
                        while ((NIL != failure_reason) || (NIL != mt_support_combination3)) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = mt_support_combination_$135;
                            SubLObject concluded_mts2 = NIL;
                            SubLObject support_combination2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list153);
                            concluded_mts2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list153);
                            support_combination2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if ((NIL == concluded_mts2) && (NIL != call_forward_inference_browsing_callbackP())) {
                                    call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, concluded_asent, $TARGET_TRUTH, concluded_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, NIL, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, list($TYPE, $NO_MT_SUPPORT_COMBINATION_CONCLUDED_MTS_FOUND, $ASENT, concluded_asent, $FORM, list(COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS, sefify(concluded_supports), sefify(pragmatic_supports)), $FAILURE_REASON, failure_reason_$136) }));
                                }
                                SubLObject cdolist_list_var = concluded_mts2;
                                SubLObject concluded_mt3 = NIL;
                                concluded_mt3 = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL == mt_relevance_macros.mt_relevant_to_mtP(propagation_mt, concluded_mt3)) {
                                        if (NIL != call_forward_inference_browsing_callbackP()) {
                                            call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, concluded_asent, $TARGET_TRUTH, concluded_truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, NIL, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, list(new SubLObject[]{ $TYPE, $INVALID_PLACEMENT, $ASENT, CONCLUDED_ASENT, $PROPAGATION_MT, PROPAGATION_MT, $CONCLUDED_MT, CONCLUDED_MT, $FAILURE_REASON, failure_reason_$136 }) }));
                                        }
                                    } else {
                                        handle_forward_deduction_in_mt(concluded_asent, concluded_truth, concluded_mt3, concluded_mt3, support_combination2, pragmatic_supports, rule, trigger_bindings, inference_bindings);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    concluded_mt3 = cdolist_list_var.first();
                                } 
                            } else {
                                cdestructuring_bind_error(datum2, $list153);
                            }
                            mt_support_combination3 = mt_support_combination3.rest();
                            mt_support_combination_$135 = mt_support_combination3.first();
                            failure_reason = failure_reason.rest();
                            failure_reason_$136 = failure_reason.first();
                        } 
                    } else {
                        handle_forward_deduction_in_mt(concluded_asent, concluded_truth, propagation_mt, propagation_mt, concluded_supports, pragmatic_supports, rule, trigger_bindings, inference_bindings);
                    }



        return NIL;
    }

    public static SubLObject handle_forward_deduction_in_mt(final SubLObject asent, final SubLObject truth, final SubLObject mt, final SubLObject placement_mt, final SubLObject supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject failure_reason = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($HANDLE_FORWARD_DEDUCTION_IN_MT, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                thread.resetMultipleValues();
                final SubLObject result_$137 = handle_forward_deduction_in_mt_int(asent, truth, mt, placement_mt, supports, pragmatic_supports, rule, trigger_bindings, inference_bindings);
                final SubLObject failure_reason_$138 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$137;
                failure_reason = failure_reason_$138;
                if (result.isKeyword() && (NIL != call_forward_inference_browsing_callbackP())) {
                    call_forward_inference_browsing_callback(NIL, rule, list(new SubLObject[]{ $TARGET_ASENT, asent, $TARGET_TRUTH, truth, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, supports, $FORWARD_RESULTS, NIL, $ANSWER_COUNT, ZERO_INTEGER, $REASON, list(new SubLObject[]{ $TYPE, result, $ASENT, asent, $MT, mt, $PLACEMENT_MT, placement_mt, $SUPPORTS, supports, $PRAGMATIC_SUPPORTS, pragmatic_supports, $FAILURE_REASON, failure_reason }) }));
                }
            } finally {
                final SubLObject _prev_bind_0_$139 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $HANDLE_FORWARD_DEDUCTION_IN_MT, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$139, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject handle_forward_deduction_in_mt_int(final SubLObject asent, final SubLObject truth, final SubLObject mt, final SubLObject placement_mt, final SubLObject supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forward_bindings_abnormalP = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($kw165$FORWARD_BINDINGS_ABNORMAL_, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                forward_bindings_abnormalP = abnormal.forward_bindings_abnormalP(mt, rule, trigger_bindings, inference_bindings);
            } finally {
                final SubLObject _prev_bind_0_$140 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $kw165$FORWARD_BINDINGS_ABNORMAL_, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$140, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        if (NIL != forward_bindings_abnormalP) {
            return subl_promotions.values2($FORWARD_BINDINGS_ABNORMAL, NIL);
        }
        if (NIL != abnormal.abnormality_except_support_enabledP()) {
            final SubLObject _prev_bind_5 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                SubLObject supports_contain_excepted_assertion_in_mtP = NIL;
                final SubLObject last_metric_type2 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric2 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf2 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule2 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if ((NIL != last_metric_type2) && (NIL != last_metric2)) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type2, last_metric2, last_gaf2, last_rule2, ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$141 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_6 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_7 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_8 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind($kw167$SUPPORTS_CONTAIN_EXCEPTED_ASSERTION_IN_MT_, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                    try {
                        supports_contain_excepted_assertion_in_mtP = inference_worker_transformation.supports_contain_excepted_assertion_in_mtP(supports, mt, UNPROVIDED);
                    } finally {
                        final SubLObject _prev_bind_0_$142 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics($HARNESS, $kw167$SUPPORTS_CONTAIN_EXCEPTED_ASSERTION_IN_MT_, NIL, NIL, NIL);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                        }
                    }
                } finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_8, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_7, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_6, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$141, thread);
                }
                if (NIL != supports_contain_excepted_assertion_in_mtP) {
                    return subl_promotions.values2($FORWARD_BINDINGS_EXCEPTED, NIL);
                }
            } finally {
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_5, thread);
            }
        }
        inference_metrics.note_forward_inference_successful_rule(rule);
        final SubLObject v_bindings = append(trigger_bindings, inference_bindings);
        if (NIL != find_if($sym169$CONSTRAINT_RULE_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return handle_forward_deduction_in_mt_as_constraint(asent, truth, mt, placement_mt, supports, pragmatic_supports, v_bindings);
        }
        return handle_forward_deduction_in_mt_as_assertible(asent, truth, mt, placement_mt, supports, pragmatic_supports, v_bindings);
    }

    public static SubLObject handle_forward_deduction_in_mt_as_assertible(final SubLObject asent, final SubLObject truth, SubLObject mt, SubLObject placement_mt, final SubLObject supports, SubLObject pragmatic_supports, SubLObject v_bindings) {
        if (pragmatic_supports == UNPROVIDED) {
            pragmatic_supports = NIL;
        }
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forbid_forward_conclusion_in_mtP = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($kw170$FORBID_FORWARD_CONCLUSION_IN_MT_, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                forbid_forward_conclusion_in_mtP = forbid_forward_conclusion_in_mtP(asent, truth, mt, supports, pragmatic_supports);
            } finally {
                final SubLObject _prev_bind_0_$143 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $kw170$FORBID_FORWARD_CONCLUSION_IN_MT_, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        if (NIL != forbid_forward_conclusion_in_mtP) {
            return subl_promotions.values2($FORWARD_CONCLUSION_FORBIDDEN_IN_MT, NIL);
        }
        if (NIL != find_if($sym60$INVALID_ASSERTION_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                Errors.warn($str172$Something_between_queueing_and_pr, asent, mt, supports);
            }
            return subl_promotions.values2($INVALIDATED_SUPPORT, NIL);
        }
        final SubLObject gaf_formula = cycl_utilities.possibly_negate(asent, truth);
        SubLObject canon_cnfs = NIL;
        final SubLObject _prev_bind_5 = czer_vars.$assume_hlmt_is_canonicalP$.currentBinding(thread);
        try {
            czer_vars.$assume_hlmt_is_canonicalP$.bind(T, thread);
            if (NIL != $assume_forward_deduction_is_wfP$.getDynamicValue(thread)) {
                final SubLObject last_metric_type2 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric2 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf2 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule2 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if ((NIL != last_metric_type2) && (NIL != last_metric2)) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type2, last_metric2, last_gaf2, last_rule2, ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$144 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_6 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_7 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_8 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind($CANONICALIZE_WF_GAF, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                    try {
                        thread.resetMultipleValues();
                        final SubLObject canon_cnfs_$145 = czer_main.canonicalize_wf_gaf(gaf_formula, mt);
                        final SubLObject mt_$146 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_cnfs = canon_cnfs_$145;
                        mt = mt_$146;
                    } finally {
                        final SubLObject _prev_bind_0_$145 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics($HARNESS, $CANONICALIZE_WF_GAF, NIL, NIL, NIL);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                        }
                    }
                } finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_8, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_7, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_6, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$144, thread);
                }
            } else {
                final SubLObject last_metric_type2 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric2 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf2 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule2 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if ((NIL != last_metric_type2) && (NIL != last_metric2)) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type2, last_metric2, last_gaf2, last_rule2, ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$146 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_6 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_7 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_8 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind($CANONICALIZE_GAF, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                    try {
                        thread.resetMultipleValues();
                        final SubLObject canon_cnfs_$146 = czer_main.canonicalize_gaf(gaf_formula, mt);
                        final SubLObject mt_$147 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_cnfs = canon_cnfs_$146;
                        mt = mt_$147;
                    } finally {
                        final SubLObject _prev_bind_0_$147 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics($HARNESS, $CANONICALIZE_GAF, NIL, NIL, NIL);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$147, thread);
                        }
                    }
                } finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_8, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_7, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_6, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$146, thread);
                }
            }
        } finally {
            czer_vars.$assume_hlmt_is_canonicalP$.rebind(_prev_bind_5, thread);
        }
        if (NIL != ist_sentence_p(asent, UNPROVIDED)) {
            placement_mt = mt;
        }
        if (NIL != kb_utilities.kbeq(canon_cnfs, $$True)) {
            return subl_promotions.values2($FORWARD_CONCLUSION_TAUTOLOGICAL, NIL);
        }
        if (NIL != kb_utilities.kbeq(canon_cnfs, $$False)) {
            return subl_promotions.values2($FORWARD_CONCLUSION_CONTRADICTION, NIL);
        }
        if (NIL != find_if($sym60$INVALID_ASSERTION_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                Errors.warn($str180$Canonicalization_of__s_in__s_inva, gaf_formula, mt, supports);
            }
            return subl_promotions.values2($CZER_INVALIDATED_SUPPORT, NIL);
        }
        if (NIL == canon_cnfs) {
            if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                format(T, $str182$Forward_conclusion_not_WFF______S, gaf_formula, wff.why_not_wff_assert(gaf_formula, mt, UNPROVIDED));
            }
            conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
            return subl_promotions.values2($FORWARD_CONCLUSION_NOT_WF, NIL != call_forward_inference_browsing_callbackP() ? wff.why_not_wff_assert(gaf_formula, mt, UNPROVIDED) : NIL);
        }
        SubLObject cdolist_list_var = canon_cnfs;
        SubLObject canon_cnf_bind_list_pair = NIL;
        canon_cnf_bind_list_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_cnf_bind_list_pair;
            SubLObject canon_cnf = NIL;
            destructuring_bind_must_consp(current, datum, $list184);
            canon_cnf = current.first();
            current = current.rest();
            final SubLObject binding_list = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list184);
            current = current.rest();
            if (NIL == current) {
                assert NIL != clauses.cnf_p(canon_cnf) : "clauses.cnf_p(canon_cnf) " + "CommonSymbols.NIL != clauses.cnf_p(canon_cnf) " + canon_cnf;
                if (((NIL != $filter_deductions_for_trivially_derivable_gafs$.getDynamicValue(thread)) && (NIL != clauses.atomic_clause_p(canon_cnf))) && (NIL != tms.atomic_cnf_trivially_derivable(canon_cnf, mt))) {
                    return subl_promotions.values2($FORWARD_CONCLUSION_TRIVIALLY_DERIVABLE, NIL);
                }
                final SubLObject pragmatic_support_mts = remove($$InferencePSC, remove_if(CORE_MICROTHEORY_P, Mapping.mapcar(SUPPORT_MT, pragmatic_supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return subl_promotions.values2(handle_forward_deduction_in_mt_as_assertible_int(canon_cnf, placement_mt, supports, binding_list, v_bindings, pragmatic_support_mts), NIL);
            } else {
                cdestructuring_bind_error(datum, $list184);
                cdolist_list_var = cdolist_list_var.rest();
                canon_cnf_bind_list_pair = cdolist_list_var.first();
            }
        } 
        return NIL;
    }

    public static SubLObject handle_forward_deduction_in_mt_as_assertible_int(final SubLObject cnf, final SubLObject mt, final SubLObject supports, SubLObject variable_map, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (variable_map == UNPROVIDED) {
            variable_map = NIL;
        }
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLObject deduction_spec = deductions_high.create_deduction_spec(supports, v_bindings, pragmatic_support_mts);
        final SubLObject hl_assertion_spec = hl_storage_modules.new_hl_assertion_spec(cnf, mt, $FORWARD, variable_map);
        final SubLObject hl_assertible = hl_storage_modules.new_hl_assertible(hl_assertion_spec, deduction_spec);
        return note_new_forward_assertible(hl_assertible);
    }

    public static SubLObject forbid_forward_conclusion_in_mtP(final SubLObject asent, final SubLObject truth, final SubLObject mt, final SubLObject supports, final SubLObject pragmatic_supports) {
        if (NIL != find_if($sym189$ASSERTIVE_WFF_RULE_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return makeBoolean((NIL != wff_constraint_mtP(mt)) || (NIL != list_utilities.any_in_list($sym190$WFF_CONSTRAINT_SUPPORT_, supports, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject wff_constraint_supportP(final SubLObject support) {
        if (NIL != wff_constraint_mtP(arguments.support_mt(support))) {
            final SubLObject operator = cycl_utilities.sentence_arg0(arguments.support_sentence(support));
            if (NIL != isa.isa_in_any_mtP(operator, $$WFFConstraintPredicate)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject wff_constraint_mtP(final SubLObject mt) {
        final SubLObject monad = hlmt.hlmt_monad_mt(mt);
        return somewhere_cache.some_pred_assertion_somewhereP($$wffConstraintMt, monad, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject constraint_ruleP(final SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != assertions_high.rule_assertionP(rule)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(rule, $$constraint, mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject handle_forward_deduction_in_mt_as_constraint(final SubLObject asent, final SubLObject truth, SubLObject mt, final SubLObject placement_mt, final SubLObject supports, SubLObject pragma_supports, SubLObject v_bindings) {
        if (pragma_supports == UNPROVIDED) {
            pragma_supports = NIL;
        }
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $forward_constraint_inference_enabledP$.getDynamicValue(thread)) || (NIL == $conflicts_from_invalid_deductions$.getDynamicValue(thread))) {
            return handle_forward_deduction_in_mt_as_assertible(asent, truth, mt, placement_mt, supports, pragma_supports, v_bindings);
        }
        final SubLObject gaf_formula = cycl_utilities.negate(cycl_utilities.possibly_negate(asent, truth));
        SubLObject canon_cnfs = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$assume_hlmt_is_canonicalP$.currentBinding(thread);
        try {
            czer_vars.$assume_hlmt_is_canonicalP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject canon_cnfs_$152 = czer_main.canonicalize_gaf(gaf_formula, mt);
            final SubLObject mt_$153 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_cnfs = canon_cnfs_$152;
            mt = mt_$153;
        } finally {
            czer_vars.$assume_hlmt_is_canonicalP$.rebind(_prev_bind_0, thread);
        }
        if (NIL == canon_cnfs) {
            conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
            return $FORWARD_CONCLUSION_NOT_WF;
        }
        if ($$False.eql(canon_cnfs)) {
            conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
            return $FORWARD_CONCLUSION_TAUTOLOGICAL;
        }
        if ($$True.eql(canon_cnfs)) {
            return $FORWARD_CONCLUSION_CONTRADICTION;
        }
        SubLObject cdolist_list_var = canon_cnfs;
        SubLObject canon_cnf_bind_list_pair = NIL;
        canon_cnf_bind_list_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_cnf_bind_list_pair;
            SubLObject canon_cnf = NIL;
            destructuring_bind_must_consp(current, datum, $list184);
            canon_cnf = current.first();
            current = current.rest();
            final SubLObject binding_list = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list184);
            current = current.rest();
            if (NIL == current) {
                assert NIL != clauses.cnf_p(canon_cnf) : "clauses.cnf_p(canon_cnf) " + "CommonSymbols.NIL != clauses.cnf_p(canon_cnf) " + canon_cnf;
                if (NIL != verify_forward_deduction_constraint(canon_cnf, mt)) {
                    conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
                    return $FORWARD_DEDUCTION_CONSTRAINT_VIOLATION;
                }
            } else {
                cdestructuring_bind_error(datum, $list184);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_cnf_bind_list_pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject verify_forward_deduction_constraint(final SubLObject constraint_clause, final SubLObject mt) {
        SubLObject result = NIL;
        result = list_utilities.sublisp_boolean(inference_kernel.new_cyc_query_from_dnf(constraint_clause, mt, NIL, forward_inference_query_properties(clauses.empty_clause(), UNPROVIDED)));
        return result;
    }

    public static SubLObject cycl_sentence_for_forward_inference_canonicalP(final SubLObject asent, final SubLObject mt, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $forward_inference_rule$.currentBinding(thread);
        try {
            $within_assert$.bind(T, thread);
            kb_control_vars.$within_forward_inferenceP$.bind(T, thread);
            $forward_inference_rule$.bind(rule, thread);
            if (NIL == czer_main.canonicalize_cycl_sentence(asent, mt)) {
                if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                    format(T, $str182$Forward_conclusion_not_WFF______S, asent, wff.why_not_wff_assert(asent, mt, UNPROVIDED));
                }
                return NIL;
            }
        } finally {
            $forward_inference_rule$.rebind(_prev_bind_3, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject syntactically_valid_forward_dnf(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        return syntactically_valid_forward_non_trigger_asents(query_dnf, pragmatic_dnf, justifyP);
    }

    public static SubLObject syntactically_valid_forward_non_trigger_asents(final SubLObject query_dnf, final SubLObject pragmatic_dnf, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP = NIL;
        SubLObject reason = NIL;
        final SubLObject pos_lits = clauses.pos_lits(pragmatic_dnf);
        if (NIL != find_if($sym195$FORWARD_TRIGGER_LITERAL_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            SubLObject validP = NIL;
            if (NIL == validP) {
                SubLObject csome_list_var = pos_lits;
                SubLObject asent = NIL;
                asent = csome_list_var.first();
                while ((NIL == validP) && (NIL != csome_list_var)) {
                    if (cycl_utilities.atomic_sentence_predicate(asent).eql($$forwardTriggerLiteral)) {
                        if ((NIL != variables.fully_bound_p(asent)) && cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED).equal($forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread))) {
                            validP = T;
                        } else
                            if (NIL != justifyP) {
                                reason = list($TYPE, $SYNTACTICALLY_INVALID_FORWARD_TRIGGER_ASENT, $ASENT, $forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread));
                            }

                    }
                    csome_list_var = csome_list_var.rest();
                    asent = csome_list_var.first();
                } 
            }
            invalidP = makeBoolean(NIL == validP);
        } else
            if ((NIL != find_if($sym198$FORWARD_NON_TRIGGER_LITERAL_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == invalidP)) {
                SubLObject csome_list_var2 = pos_lits;
                SubLObject asent2 = NIL;
                asent2 = csome_list_var2.first();
                while ((NIL == invalidP) && (NIL != csome_list_var2)) {
                    if ((cycl_utilities.atomic_sentence_predicate(asent2).eql($$forwardNonTriggerLiteral) && (NIL != variables.fully_bound_p(asent2))) && cycl_utilities.atomic_sentence_arg1(asent2, UNPROVIDED).equal($forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread))) {
                        invalidP = T;
                        if (NIL != justifyP) {
                            reason = list($TYPE, $SYNTACTICALLY_INVALID_FORWARD_NON_TRIGGER_ASENT, $ASENT, $forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread));
                        }
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    asent2 = csome_list_var2.first();
                } 
            }

        return values(makeBoolean(NIL == invalidP), reason);
    }

    public static SubLObject semantically_valid_forward_dnf(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $type_filter_forward_dnf$.getDynamicValue(thread)) {
            return T;
        }
        SubLObject current_validP = T;
        SubLObject current_reason = NIL;
        thread.resetMultipleValues();
        final SubLObject current_validP_$154 = backward.semantically_valid_term_of_unit_asents(query_dnf, propagation_mt, justifyP);
        final SubLObject current_reason_$155 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        current_validP = current_validP_$154;
        current_reason = current_reason_$155;
        if (NIL != current_validP) {
            thread.resetMultipleValues();
            final SubLObject current_validP_$155 = backward.semantically_valid_closed_asentsP(query_dnf, propagation_mt, justifyP);
            final SubLObject current_reason_$156 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            current_validP = current_validP_$155;
            current_reason = current_reason_$156;
            if (NIL != current_validP) {
                thread.resetMultipleValues();
                final SubLObject current_validP_$156 = backward.semantically_valid_term_of_unit_asents(pragmatic_dnf, propagation_mt, justifyP);
                final SubLObject current_reason_$157 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                current_validP = current_validP_$156;
                current_reason = current_reason_$157;
                if (NIL != current_validP) {
                    thread.resetMultipleValues();
                    final SubLObject current_validP_$157 = backward.semantically_valid_closed_asentsP(pragmatic_dnf, propagation_mt, justifyP);
                    final SubLObject current_reason_$158 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    current_validP = current_validP_$157;
                    current_reason = current_reason_$158;
                }
            }
        }
        if (NIL == justifyP) {
            return current_validP;
        }
        return values(current_validP, current_reason);
    }

    public static SubLObject forward_leafy_mt_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return leafy_mt_p(v_object, $forward_leafy_mt_threshold$.getDynamicValue(thread));
    }

    public static SubLObject forward_propagation_supports_doomedP(final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($FORWARD_PROPAGATION_SUPPORTS_DOOMED, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind($NO_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                if (NIL != assertion_utilities.universal_lifting_ruleP(rule)) {
                    result = NIL;
                } else
                    if ($forward_leafy_mt_threshold$.getDynamicValue(thread).isNegative()) {
                        result = NIL;
                    } else {
                        SubLObject mts = cons(assertions_high.assertion_mt(rule), Mapping.mapcar(symbol_function(SUPPORT_MT), trigger_supports));
                        mts = delete($$InferencePSC, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        mts = delete_duplicates(mts, symbol_function(HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != list_utilities.lengthGE(mts, TWO_INTEGER, UNPROVIDED)) {
                            mts = genl_mts.min_mts(mts, UNPROVIDED);
                            if (NIL != list_utilities.lengthGE(mts, TWO_INTEGER, UNPROVIDED)) {
                                result = forward_propagation_mts_doomedP(mts);
                            }
                        }
                    }

            } finally {
                final SubLObject _prev_bind_0_$162 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $FORWARD_PROPAGATION_SUPPORTS_DOOMED, $NO_GAF, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$162, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject forward_propagation_mts_doomedP(final SubLObject mts) {
        return makeBoolean((NIL != find_if(symbol_function(FORWARD_LEAFY_MT_P), mts, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == forward_possibly_some_common_spec_mtP(mts)));
    }

    public static SubLObject forward_possibly_some_common_spec_mtP_internal(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = T;
        thread.resetMultipleValues();
        final SubLObject leafy_mts = list_utilities.partition_list(mts, FORWARD_LEAFY_MT_P);
        final SubLObject non_leafy_mts = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != leafy_mts) {
            SubLObject current;
            final SubLObject datum = current = leafy_mts;
            SubLObject leafy_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list204);
            leafy_mt = current.first();
            final SubLObject other_leafy_mts;
            current = other_leafy_mts = current.rest();
            final SubLObject leafy_specs = genl_mts.all_spec_mts(leafy_mt, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.lengthLE(leafy_specs, $forward_leafy_mt_threshold$.getDynamicValue(thread), UNPROVIDED)) {
                SubLObject cdolist_list_var = append(other_leafy_mts, non_leafy_mts);
                SubLObject other_mt = NIL;
                other_mt = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == genl_mts.genl_mt_of_anyP(leafy_specs, other_mt, UNPROVIDED, UNPROVIDED)) {
                        result = NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    other_mt = cdolist_list_var.first();
                } 
            }
        }
        return result;
    }

    public static SubLObject forward_possibly_some_common_spec_mtP(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return forward_possibly_some_common_spec_mtP_internal(mts);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(forward_possibly_some_common_spec_mtP_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject leafy_mt_p(final SubLObject v_object, SubLObject threshold) {
        if (threshold == UNPROVIDED) {
            threshold = ZERO_INTEGER;
        }
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.microtheory_p(v_object))) && cardinality_estimates.spec_cardinality(v_object).numLE(threshold));
    }

    public static SubLObject compute_all_mt_and_support_combinations(final SubLObject supports, SubLObject pragmatic_supports) {
        if (pragmatic_supports == UNPROVIDED) {
            pragmatic_supports = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                final SubLObject _prev_bind_0_$163 = genl_mts.$suppress_max_floor_mts_explosion_warning$.currentBinding(thread);
                final SubLObject _prev_bind_1_$164 = $compute_all_mt_and_support_combinations_exceptions$.currentBinding(thread);
                try {
                    genl_mts.$suppress_max_floor_mts_explosion_warning$.bind(NIL != assertion_utilities.lifting_consequent_ruleP(current_forward_inference_rule()) ? T : genl_mts.$suppress_max_floor_mts_explosion_warning$.getDynamicValue(thread), thread);
                    $compute_all_mt_and_support_combinations_exceptions$.bind(NIL, thread);
                    if (NIL != some_support_combinations_extensionally_possible(supports)) {
                        final SubLObject support_combinations = all_forward_support_mt_combinations(supports);
                        final SubLObject pragmatic_support_combinations = all_forward_support_mt_combinations(pragmatic_supports);
                        SubLObject v_answer = NIL;
                        SubLObject failure_reasons = NIL;
                        SubLObject cdolist_list_var = support_combinations;
                        SubLObject support_combination = NIL;
                        support_combination = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            support_combination = delete_duplicates(support_combination, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var_$165 = pragmatic_support_combinations;
                            SubLObject pragmatic_support_combination = NIL;
                            pragmatic_support_combination = cdolist_list_var_$165.first();
                            while (NIL != cdolist_list_var_$165) {
                                pragmatic_support_combination = delete_duplicates(pragmatic_support_combination, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject supports_$166 = append(support_combination, pragmatic_support_combination);
                                SubLObject mts = NIL;
                                final SubLObject last_metric_type_$167 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                                final SubLObject last_metric_$168 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                                final SubLObject last_gaf_$169 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                                final SubLObject last_rule_$170 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                                if ((NIL != last_metric_type_$167) && (NIL != last_metric_$168)) {
                                    inference_metrics.increment_forward_inference_metrics(last_metric_type_$167, last_metric_$168, last_gaf_$169, last_rule_$170, ZERO_INTEGER);
                                }
                                final SubLObject _prev_bind_0_$164 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$165 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$173 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$174 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                                try {
                                    hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
                                    hl_macros.$forward_inference_metric_last_metric$.bind($COMPUTE_MTS_FROM_SUPPORTS, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                                    try {
                                        mts = compute_mts_from_supports(supports_$166, UNPROVIDED);
                                    } finally {
                                        final SubLObject _prev_bind_0_$165 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            inference_metrics.increment_forward_inference_metrics($HARNESS, $COMPUTE_MTS_FROM_SUPPORTS, NIL, NIL, NIL);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$165, thread);
                                        }
                                    }
                                } finally {
                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_3_$174, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$173, thread);
                                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$165, thread);
                                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$164, thread);
                                }
                                v_answer = cons(list(mts, support_combination), v_answer);
                                failure_reasons = cons($compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread), failure_reasons);
                                cdolist_list_var_$165 = cdolist_list_var_$165.rest();
                                pragmatic_support_combination = cdolist_list_var_$165.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            support_combination = cdolist_list_var.first();
                        } 
                        return values(nreverse(v_answer), nreverse(failure_reasons));
                    }
                } finally {
                    $compute_all_mt_and_support_combinations_exceptions$.rebind(_prev_bind_1_$164, thread);
                    genl_mts.$suppress_max_floor_mts_explosion_warning$.rebind(_prev_bind_0_$163, thread);
                }
                return values(NIL, NIL);
            } finally {
                final SubLObject _prev_bind_0_$166 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS, NIL, NIL, NIL);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$166, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject compute_decontextualized_support_combinations(final SubLObject supports, final SubLObject pragmatic_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != some_support_combinations_theoretically_possible(supports)) {
            final SubLObject support_combinations = all_forward_support_mt_combinations(supports);
            final SubLObject pragmatic_support_combinations = all_forward_support_mt_combinations(pragmatic_supports);
            SubLObject v_answer = NIL;
            SubLObject failure_reasons = NIL;
            SubLObject cdolist_list_var = support_combinations;
            SubLObject support_combination = NIL;
            support_combination = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                support_combination = delete_duplicates(support_combination, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var_$177 = pragmatic_support_combinations;
                SubLObject pragmatic_support_combination = NIL;
                pragmatic_support_combination = cdolist_list_var_$177.first();
                while (NIL != cdolist_list_var_$177) {
                    pragmatic_support_combination = delete_duplicates(pragmatic_support_combination, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject supports_$178 = append(support_combination, pragmatic_support_combination);
                    if (NIL != some_support_combinations_extensionally_possible(supports_$178)) {
                        v_answer = cons(support_combination, v_answer);
                        failure_reasons = cons($compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread), failure_reasons);
                    }
                    cdolist_list_var_$177 = cdolist_list_var_$177.rest();
                    pragmatic_support_combination = cdolist_list_var_$177.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                support_combination = cdolist_list_var.first();
            } 
            return values(nreverse(v_answer), nreverse(failure_reasons));
        }
        return NIL;
    }

    public static SubLObject some_support_combinations_theoretically_possible(final SubLObject supports) {
        return T;
    }

    public static SubLObject some_support_combinations_extensionally_possible(SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($SOME_SUPPORT_COMBINATIONS_EXTENSIONALLY_POSSIBLE, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                if (NIL != assertion_utilities.universal_lifting_ruleP(current_forward_inference_rule())) {
                    result = T;
                } else
                    if (NIL == $verify_some_support_combinations_possible$.getDynamicValue(thread)) {
                        result = T;
                    } else {
                        supports = list_utilities.remove_if_not(symbol_function(ASSERTION_P), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == supports) {
                            result = T;
                        } else {
                            final SubLObject mts = Mapping.mapcar(symbol_function(ASSERTION_MT), supports);
                            result = inference_trampolines.inference_some_max_floor_mts(mts);
                        }
                    }

            } finally {
                final SubLObject _prev_bind_0_$179 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $SOME_SUPPORT_COMBINATIONS_EXTENSIONALLY_POSSIBLE, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_forward_support_mt_combinations(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($ALL_FORWARD_SUPPORT_MT_COMBINATIONS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                result = all_forward_support_mt_combinations_int(supports);
            } finally {
                final SubLObject _prev_bind_0_$180 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $ALL_FORWARD_SUPPORT_MT_COMBINATIONS, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$180, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_forward_support_mt_combinations_int(final SubLObject supports) {
        SubLObject result = NIL;
        if (NIL == supports) {
            result = list(NIL);
        } else {
            SubLObject first = NIL;
            SubLObject rest = NIL;
            destructuring_bind_must_consp(supports, supports, $list210);
            first = supports.first();
            final SubLObject current = rest = supports.rest();
            final SubLObject first_combos = forward_support_mt_combinations(first);
            if (NIL != first_combos) {
                final SubLObject rest_combos = all_forward_support_mt_combinations_int(rest);
                result = list_utilities.mapcar_product(symbol_function(CONS), first_combos, rest_combos);
            } else {
                result = NIL;
            }
        }
        return result;
    }

    public static SubLObject forward_support_mt_combinations(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return list(support);
        }
        return hl_supports.hl_forward_mt_combos(support);
    }

    public static SubLObject compute_mts_from_supports(final SubLObject supports, SubLObject require_from_listP) {
        if (require_from_listP == UNPROVIDED) {
            require_from_listP = $require_cached_gaf_mt_from_supports$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answer_mts = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($COMPUTE_MTS_FROM_SUPPORTS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                thread.resetMultipleValues();
                final SubLObject assume_wff_supports = separate_supports_for_mt_placement(supports);
                final SubLObject compute_where_wff_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject mts_from_assumed_wff_supports = Mapping.mapcar(symbol_function(SUPPORT_MT), assume_wff_supports);
                if (NIL == compute_where_wff_supports) {
                    answer_mts = forward_mt_placements_from_support_mts(mts_from_assumed_wff_supports, require_from_listP);
                } else {
                    SubLObject cdolist_list_var;
                    final SubLObject additional_mt_combinations = cdolist_list_var = all_computed_wff_mt_combinations(compute_where_wff_supports);
                    SubLObject additional_mts = NIL;
                    additional_mts = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        answer_mts = union(answer_mts, forward_mt_placements_from_support_mts(append(additional_mts, mts_from_assumed_wff_supports), require_from_listP), UNPROVIDED, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        additional_mts = cdolist_list_var.first();
                    } 
                    if (NIL != answer_mts) {
                        answer_mts = list_utilities.delete_subsumed_items(answer_mts, symbol_function($sym212$SPEC_MT_), UNPROVIDED);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$181 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $COMPUTE_MTS_FROM_SUPPORTS, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$181, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return answer_mts;
    }

    public static SubLObject separate_supports_for_mt_placement(final SubLObject supports) {
        SubLObject assume_wff_supports = NIL;
        SubLObject compute_where_wff_supports = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != compute_where_wff_formulaP(arguments.support_formula(support))) {
                compute_where_wff_supports = cons(support, compute_where_wff_supports);
            }
            if (NIL != assume_where_wff_formulaP(arguments.support_formula(support))) {
                assume_wff_supports = cons(support, assume_wff_supports);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return values(nreverse(assume_wff_supports), nreverse(compute_where_wff_supports));
    }

    public static SubLObject compute_where_wff_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != tou_litP(formula)) || ((NIL != $respect_defining_mt_for_hypothetical_termsP$.getDynamicValue(thread)) && (NIL != cycl_utilities.expression_find_if(HYPOTHETICAL_TERM_P, formula, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject assume_where_wff_formulaP(final SubLObject formula) {
        return makeBoolean(NIL == tou_litP(formula));
    }

    public static SubLObject forward_mt_placements_from_support_mts(SubLObject mts, SubLObject require_from_listP) {
        if (require_from_listP == UNPROVIDED) {
            require_from_listP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($FORWARD_MT_PLACEMENTS_FROM_SUPPORT_MTS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                if (NIL != assertion_utilities.universal_lifting_ruleP(current_forward_inference_rule())) {
                    if (NIL != $forward_inference_debugP$.getDynamicValue(thread)) {
                        Errors.warn($str215$Skipping_max_floor_mts_call_due_t, sefify(current_forward_inference_rule()));
                    }
                    result = list($$BaseKB);
                }
                if (NIL == result) {
                    if (NIL != kb_control_vars.within_forward_inferenceP()) {
                        mts = remove($$InferencePSC, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    result = inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mts, NIL != require_from_listP ? mts : NIL);
                    if ((NIL != call_forward_inference_browsing_callbackP()) && (NIL == result)) {
                        final SubLObject item_var = list($NULL_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED, sefify(mts));
                        if (NIL == member(item_var, $compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            $compute_all_mt_and_support_combinations_exceptions$.setDynamicValue(cons(item_var, $compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread)), thread);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$182 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $FORWARD_MT_PLACEMENTS_FROM_SUPPORT_MTS, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$182, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_computed_wff_mt_combinations(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind($ALL_COMPUTED_WFF_MT_COMBINATIONS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                result = all_computed_wff_mt_combinations_int(supports);
            } finally {
                final SubLObject _prev_bind_0_$183 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($HARNESS, $ALL_COMPUTED_WFF_MT_COMBINATIONS, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$183, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_computed_wff_mt_combinations_int(final SubLObject supports) {
        if (NIL == supports) {
            return list(NIL);
        }
        SubLObject first = NIL;
        SubLObject rest = NIL;
        destructuring_bind_must_consp(supports, supports, $list210);
        first = supports.first();
        final SubLObject current = rest = supports.rest();
        final SubLObject first_combos = computed_wff_mt_combinations(first);
        final SubLObject rest_combos = all_computed_wff_mt_combinations_int(rest);
        return list_utilities.mapcar_product(symbol_function(CONS), first_combos, rest_combos);
    }

    public static SubLObject computed_wff_mt_combinations(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = arguments.support_formula(support);
        return append(computed_wff_mt_combinations_wrt_term_of_unit(formula), NIL != $respect_defining_mt_for_hypothetical_termsP$.getDynamicValue(thread) ? computed_wff_mt_combinations_wrt_hypothetical_terms(formula) : NIL);
    }

    public static SubLObject computed_wff_mt_combinations_wrt_term_of_unit(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nartsP$.bind(makeBoolean((NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread)) || (((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL != current_forward_inference_rule())) && (NIL != wff.assertive_wff_ruleP(current_forward_inference_rule())))), thread);
            SubLObject result = NIL;
            if (NIL != tou_litP(formula)) {
                final SubLObject nat = literal_arg2(formula, UNPROVIDED);
                result = copy_list(inference_trampolines.inference_max_floor_mts_of_nat(nat));
                if ((NIL != call_forward_inference_browsing_callbackP()) && (NIL == result)) {
                    final SubLObject item_var = list($NULL_INFERENCE_MAX_FLOOR_MTS_OF_NAT, sefify(nat), wff.why_not_wft(nat, UNPROVIDED, UNPROVIDED));
                    if (NIL == member(item_var, $compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        $compute_all_mt_and_support_combinations_exceptions$.setDynamicValue(cons(item_var, $compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return result;
        } finally {
            at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject computed_wff_mt_combinations_wrt_hypothetical_terms(final SubLObject formula) {
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(formula, HYPOTHETICAL_TERM_P, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject hyp_term = NIL;
        hyp_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject defining_mt = kb_accessors.defining_mt(hyp_term);
            if (NIL == defining_mt) {
                defining_mt = mt_vars.$core_mt_floor$.getGlobalValue();
            }
            mts = cons(defining_mt, mts);
            cdolist_list_var = cdolist_list_var.rest();
            hyp_term = cdolist_list_var.first();
        } 
        return nreverse(mts);
    }

    public static SubLObject declare_forward_file() {
        declareFunction(me, "forward_propagate_rule_via_trigger_gafsP", "FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS?", 0, 0, false);
        declareFunction(me, "call_forward_inference_browsing_callbackP", "CALL-FORWARD-INFERENCE-BROWSING-CALLBACK?", 0, 0, false);
        declareFunction(me, "call_forward_inference_browsing_callback", "CALL-FORWARD-INFERENCE-BROWSING-CALLBACK", 2, 1, false);
        declareFunction(me, "current_forward_inference_environment", "CURRENT-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        declareFunction(me, "get_forward_inference_environment", "GET-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        declareFunction(me, "free_forward_inference_enviornment", "FREE-FORWARD-INFERENCE-ENVIORNMENT", 1, 0, false);
        declareFunction(me, "clear_forward_inference_environment", "CLEAR-FORWARD-INFERENCE-ENVIRONMENT", 1, 0, false);
        declareFunction(me, "new_forward_inference_environment", "NEW-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        declareFunction(me, "queue_global_forward_assertion", "QUEUE-GLOBAL-FORWARD-ASSERTION", 1, 0, false);
        declareFunction(me, "dequeue_global_forward_assertion", "DEQUEUE-GLOBAL-FORWARD-ASSERTION", 0, 0, false);
        declareFunction(me, "global_forward_assertion_queue_empty_p", "GLOBAL-FORWARD-ASSERTION-QUEUE-EMPTY-P", 0, 0, false);
        declareFunction(me, "clear_global_forward_inference_environment", "CLEAR-GLOBAL-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        declareMacro(me, "with_currently_forward_propagating_support", "WITH-CURRENTLY-FORWARD-PROPAGATING-SUPPORT");
        declareFunction(me, "currently_forward_propagating_supportP", "CURRENTLY-FORWARD-PROPAGATING-SUPPORT?", 1, 0, false);
        declareFunction(me, "all_currently_forward_propagating_supports", "ALL-CURRENTLY-FORWARD-PROPAGATING-SUPPORTS", 0, 0, false);
        declareFunction(me, "currently_forward_propagating_assertionP", "CURRENTLY-FORWARD-PROPAGATING-ASSERTION?", 1, 0, false);
        declareFunction(me, "all_currently_forward_propagating_assertions", "ALL-CURRENTLY-FORWARD-PROPAGATING-ASSERTIONS", 0, 0, false);
        declareFunction(me, "clear_currently_forward_propagating_supports", "CLEAR-CURRENTLY-FORWARD-PROPAGATING-SUPPORTS", 0, 0, false);
        declareFunction(me, "add_currently_forward_propagating_support", "ADD-CURRENTLY-FORWARD-PROPAGATING-SUPPORT", 1, 0, false);
        declareFunction(me, "rem_currently_forward_propagating_support", "REM-CURRENTLY-FORWARD-PROPAGATING-SUPPORT", 1, 0, false);
        declareMacro(me, "with_forward_inference_source_support", "WITH-FORWARD-INFERENCE-SOURCE-SUPPORT");
        declareMacro(me, "with_forward_inference_rule", "WITH-FORWARD-INFERENCE-RULE");
        declareFunction(me, "current_forward_inference_gaf", "CURRENT-FORWARD-INFERENCE-GAF", 0, 0, false);
        declareFunction(me, "current_forward_inference_rule", "CURRENT-FORWARD-INFERENCE-RULE", 0, 0, false);
        declareFunction(me, "current_forward_inference_assertion", "CURRENT-FORWARD-INFERENCE-ASSERTION", 0, 0, false);
        declareFunction(me, "current_forward_inference_fully_propagating_ruleP", "CURRENT-FORWARD-INFERENCE-FULLY-PROPAGATING-RULE?", 0, 0, false);
        declareFunction(me, "forward_problem_store_properties", "FORWARD-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        declareFunction(me, "new_forward_problem_store", "NEW-FORWARD-PROBLEM-STORE", 0, 1, false);
        declareFunction(me, "destroy_forward_problem_store", "DESTROY-FORWARD-PROBLEM-STORE", 1, 0, false);
        declareFunction(me, "forward_inference_shares_same_problem_storeP", "FORWARD-INFERENCE-SHARES-SAME-PROBLEM-STORE?", 0, 1, false);
        declareFunction(me, "get_forward_problem_store", "GET-FORWARD-PROBLEM-STORE", 0, 1, false);
        declareFunction(me, "clear_current_forward_problem_store", "CLEAR-CURRENT-FORWARD-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "clear_current_forward_problem_store_int", "CLEAR-CURRENT-FORWARD-PROBLEM-STORE-INT", 0, 0, false);
        declareFunction(me, "clear_current_forward_inference_environment", "CLEAR-CURRENT-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        declareFunction(me, "queue_forward_assertion", "QUEUE-FORWARD-ASSERTION", 1, 0, false);
        declareFunction(me, "remqueue_forward_assertion", "REMQUEUE-FORWARD-ASSERTION", 1, 0, false);
        declareFunction(me, "queue_or_repropagate_forward_assertion", "QUEUE-OR-REPROPAGATE-FORWARD-ASSERTION", 1, 0, false);
        declareFunction(me, "queue_or_repropagate_forward_assertions", "QUEUE-OR-REPROPAGATE-FORWARD-ASSERTIONS", 1, 0, false);
        declareFunction(me, "someone_else_will_process_this_forward_inference_environmentP", "SOMEONE-ELSE-WILL-PROCESS-THIS-FORWARD-INFERENCE-ENVIRONMENT?", 1, 0, false);
        declareFunction(me, "performing_forward_inferenceP", "PERFORMING-FORWARD-INFERENCE?", 0, 0, false);
        declareFunction(me, "perform_forward_inference_now", "PERFORM-FORWARD-INFERENCE-NOW", 0, 0, false);
        declareFunction(me, "perform_forward_inference", "PERFORM-FORWARD-INFERENCE", 0, 0, false);
        declareFunction(me, "dynamic_forward_inference_to_doP", "DYNAMIC-FORWARD-INFERENCE-TO-DO?", 1, 0, false);
        declareFunction(me, "global_forward_inference_to_doP", "GLOBAL-FORWARD-INFERENCE-TO-DO?", 0, 0, false);
        declareFunction(me, "forward_inference_to_doP", "FORWARD-INFERENCE-TO-DO?", 1, 0, false);
        declareFunction(me, "repropagate_forward_assertion", "REPROPAGATE-FORWARD-ASSERTION", 1, 0, false);
        declareFunction(me, "repropagate_forward_gaf_wrt_rule", "REPROPAGATE-FORWARD-GAF-WRT-RULE", 2, 0, false);
        declareFunction(me, "inference_psc_overriding_termP", "INFERENCE-PSC-OVERRIDING-TERM?", 1, 0, false);
        declareFunction(me, "inference_psc_overriding_term_mt", "INFERENCE-PSC-OVERRIDING-TERM-MT", 1, 0, false);
        declareFunction(me, "inference_psc_overriding_mt_mt", "INFERENCE-PSC-OVERRIDING-MT-MT", 1, 0, false);
        declareFunction(me, "inference_psc_override_mt", "INFERENCE-PSC-OVERRIDE-MT", 3, 0, false);
        declareFunction(me, "global_forward_propagation_mtP", "GLOBAL-FORWARD-PROPAGATION-MT?", 1, 0, false);
        declareFunction(me, "forward_inference_assertibles_queue", "FORWARD-INFERENCE-ASSERTIBLES-QUEUE", 0, 0, false);
        declareFunction(me, "note_new_forward_assertible", "NOTE-NEW-FORWARD-ASSERTIBLE", 1, 0, false);
        declareFunction(me, "forward_propagate_assertion", "FORWARD-PROPAGATE-ASSERTION", 1, 1, false);
        declareFunction(me, "forward_propagate_assertion_int", "FORWARD-PROPAGATE-ASSERTION-INT", 3, 0, false);
        declareFunction(me, "forward_propagation_permittedP", "FORWARD-PROPAGATION-PERMITTED?", 2, 0, false);
        declareFunction(me, "forward_propagate_support", "FORWARD-PROPAGATE-SUPPORT", 1, 2, false);
        declareFunction(me, "forward_propagate_one_support_and_generate_assertibles", "FORWARD-PROPAGATE-ONE-SUPPORT-AND-GENERATE-ASSERTIBLES", 1, 1, false);
        declareFunction(me, "clear_forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached", "CLEAR-FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED", 0, 0, false);
        declareFunction(me, "remove_forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached", "REMOVE-FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED", 2, 0, false);
        declareFunction(me, "forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_internal", "FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached", "FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED", 2, 0, false);
        declareFunction(me, "forward_propagate_one_support_wrt_rule_and_generate_assertibles", "FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES", 2, 1, false);
        declareFunction(me, "forward_propagate_one_assertion_wrt_rules_and_queue_or_repropagate_assertibles", "FORWARD-PROPAGATE-ONE-ASSERTION-WRT-RULES-AND-QUEUE-OR-REPROPAGATE-ASSERTIBLES", 2, 1, false);
        declareFunction(me, "forward_propagate_supports_and_generate_assertibles", "FORWARD-PROPAGATE-SUPPORTS-AND-GENERATE-ASSERTIBLES", 1, 1, false);
        declareFunction(me, "forward_propagate_support_generate_assertibles", "FORWARD-PROPAGATE-SUPPORT-GENERATE-ASSERTIBLES", 2, 0, false);
        declareFunction(me, "forward_propagate_handle_batched_assertibles", "FORWARD-PROPAGATE-HANDLE-BATCHED-ASSERTIBLES", 1, 1, false);
        declareFunction(me, "forward_propagate_support_handle_assertibles", "FORWARD-PROPAGATE-SUPPORT-HANDLE-ASSERTIBLES", 1, 2, false);
        declareFunction(me, "forward_propagate_rule", "FORWARD-PROPAGATE-RULE", 2, 0, false);
        declareFunction(me, "support_truth_sense", "SUPPORT-TRUTH-SENSE", 1, 0, false);
        declareFunction(me, "support_asent", "SUPPORT-ASENT", 1, 0, false);
        declareFunction(me, "forward_propagate_asent_support", "FORWARD-PROPAGATE-ASENT-SUPPORT", 2, 0, false);
        declareFunction(me, "forward_propagate_asent_tactic_specs", "FORWARD-PROPAGATE-ASENT-TACTIC-SPECS", 2, 0, false);
        declareFunction(me, "forward_propagate_one_tactic_spec", "FORWARD-PROPAGATE-ONE-TACTIC-SPEC", 3, 0, false);
        declareFunction(me, "make_forward_trigger_supports", "MAKE-FORWARD-TRIGGER-SUPPORTS", 2, 0, false);
        declareFunction(me, "forward_inference_allowed_rules", "FORWARD-INFERENCE-ALLOWED-RULES", 0, 0, false);
        declareFunction(me, "forward_inference_all_rules_allowedP", "FORWARD-INFERENCE-ALL-RULES-ALLOWED?", 0, 0, false);
        declareFunction(me, "forward_inference_rule_allowedP", "FORWARD-INFERENCE-RULE-ALLOWED?", 1, 0, false);
        declareFunction(me, "forward_inference_forbidden_rules", "FORWARD-INFERENCE-FORBIDDEN-RULES", 0, 0, false);
        declareFunction(me, "forward_inference_no_rules_forbiddenP", "FORWARD-INFERENCE-NO-RULES-FORBIDDEN?", 0, 0, false);
        declareFunction(me, "forward_inference_rule_forbiddenP", "FORWARD-INFERENCE-RULE-FORBIDDEN?", 1, 0, false);
        declareFunction(me, "forward_propagate_gaf_internal", "FORWARD-PROPAGATE-GAF-INTERNAL", 6, 0, false);
        declareFunction(me, "handle_forward_propagation_from_gaf", "HANDLE-FORWARD-PROPAGATION-FROM-GAF", 8, 0, false);
        declareFunction(me, "creation_template_forward_rules_via_exemplars", "CREATION-TEMPLATE-FORWARD-RULES-VIA-EXEMPLARS", 1, 0, false);
        declareFunction(me, "creation_template_exemplars", "CREATION-TEMPLATE-EXEMPLARS", 1, 0, false);
        declareFunction(me, "creation_template_allowable_rules", "CREATION-TEMPLATE-ALLOWABLE-RULES", 1, 0, false);
        declareFunction(me, "all_genl_creation_templates", "ALL-GENL-CREATION-TEMPLATES", 1, 0, false);
        declareFunction(me, "creation_template_allowable_rules_internal", "CREATION-TEMPLATE-ALLOWABLE-RULES-INTERNAL", 1, 0, false);
        declareFunction(me, "handle_forward_propagation", "HANDLE-FORWARD-PROPAGATION", 6, 0, false);
        declareFunction(me, "handle_one_forward_propagation", "HANDLE-ONE-FORWARD-PROPAGATION", 8, 0, false);
        declareFunction(me, "forward_propagate_doomed_due_to_null_max_floor_mtsP", "FORWARD-PROPAGATE-DOOMED-DUE-TO-NULL-MAX-FLOOR-MTS?", 2, 1, false);
        declareFunction(me, "filter_forward_pragmatic_dnf", "FILTER-FORWARD-PRAGMATIC-DNF", 1, 0, false);
        declareFunction(me, "forward_propagate_dnf", "FORWARD-PROPAGATE-DNF", 8, 0, false);
        declareFunction(me, "new_forward_query_from_dnf", "NEW-FORWARD-QUERY-FROM-DNF", 3, 1, false);
        declareFunction(me, "new_cyc_trivial_forward_query_from_dnf", "NEW-CYC-TRIVIAL-FORWARD-QUERY-FROM-DNF", 2, 2, false);
        declareFunction(me, "new_forward_query", "NEW-FORWARD-QUERY", 1, 2, false);
        declareFunction(me, "forward_inference_query_properties", "FORWARD-INFERENCE-QUERY-PROPERTIES", 1, 1, false);
        declareFunction(me, "trivial_forward_inference_query_properties", "TRIVIAL-FORWARD-INFERENCE-QUERY-PROPERTIES", 1, 1, false);
        declareFunction(me, "forward_inference_productivity_limit", "FORWARD-INFERENCE-PRODUCTIVITY-LIMIT", 0, 0, false);
        declareFunction(me, "rule_forward_inference_productivity_limit", "RULE-FORWARD-INFERENCE-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(me, "add_forward_propagation_result", "ADD-FORWARD-PROPAGATION-RESULT", 7, 0, false);
        declareFunction(me, "add_empty_forward_propagation_result", "ADD-EMPTY-FORWARD-PROPAGATION-RESULT", 6, 0, false);
        declareFunction(me, "new_forward_concluded_supports", "NEW-FORWARD-CONCLUDED-SUPPORTS", 2, 1, false);
        declareFunction(me, "add_forward_deductions_from_supports", "ADD-FORWARD-DEDUCTIONS-FROM-SUPPORTS", 8, 0, false);
        declareFunction(me, "handle_forward_deduction_in_mt", "HANDLE-FORWARD-DEDUCTION-IN-MT", 9, 0, false);
        declareFunction(me, "handle_forward_deduction_in_mt_int", "HANDLE-FORWARD-DEDUCTION-IN-MT-INT", 9, 0, false);
        declareFunction(me, "handle_forward_deduction_in_mt_as_assertible", "HANDLE-FORWARD-DEDUCTION-IN-MT-AS-ASSERTIBLE", 5, 2, false);
        declareFunction(me, "handle_forward_deduction_in_mt_as_assertible_int", "HANDLE-FORWARD-DEDUCTION-IN-MT-AS-ASSERTIBLE-INT", 3, 3, false);
        declareFunction(me, "forbid_forward_conclusion_in_mtP", "FORBID-FORWARD-CONCLUSION-IN-MT?", 5, 0, false);
        declareFunction(me, "wff_constraint_supportP", "WFF-CONSTRAINT-SUPPORT?", 1, 0, false);
        declareFunction(me, "wff_constraint_mtP", "WFF-CONSTRAINT-MT?", 1, 0, false);
        declareFunction(me, "constraint_ruleP", "CONSTRAINT-RULE?", 1, 1, false);
        declareFunction(me, "handle_forward_deduction_in_mt_as_constraint", "HANDLE-FORWARD-DEDUCTION-IN-MT-AS-CONSTRAINT", 5, 2, false);
        declareFunction(me, "verify_forward_deduction_constraint", "VERIFY-FORWARD-DEDUCTION-CONSTRAINT", 2, 0, false);
        declareFunction(me, "cycl_sentence_for_forward_inference_canonicalP", "CYCL-SENTENCE-FOR-FORWARD-INFERENCE-CANONICAL?", 3, 0, false);
        declareFunction(me, "syntactically_valid_forward_dnf", "SYNTACTICALLY-VALID-FORWARD-DNF", 3, 1, false);
        declareFunction(me, "syntactically_valid_forward_non_trigger_asents", "SYNTACTICALLY-VALID-FORWARD-NON-TRIGGER-ASENTS", 2, 1, false);
        declareFunction(me, "semantically_valid_forward_dnf", "SEMANTICALLY-VALID-FORWARD-DNF", 3, 1, false);
        declareFunction(me, "forward_leafy_mt_p", "FORWARD-LEAFY-MT-P", 1, 0, false);
        declareFunction(me, "forward_propagation_supports_doomedP", "FORWARD-PROPAGATION-SUPPORTS-DOOMED?", 2, 0, false);
        declareFunction(me, "forward_propagation_mts_doomedP", "FORWARD-PROPAGATION-MTS-DOOMED?", 1, 0, false);
        declareFunction(me, "forward_possibly_some_common_spec_mtP_internal", "FORWARD-POSSIBLY-SOME-COMMON-SPEC-MT?-INTERNAL", 1, 0, false);
        declareFunction(me, "forward_possibly_some_common_spec_mtP", "FORWARD-POSSIBLY-SOME-COMMON-SPEC-MT?", 1, 0, false);
        declareFunction(me, "leafy_mt_p", "LEAFY-MT-P", 1, 1, false);
        declareFunction(me, "compute_all_mt_and_support_combinations", "COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS", 1, 1, false);
        declareFunction(me, "compute_decontextualized_support_combinations", "COMPUTE-DECONTEXTUALIZED-SUPPORT-COMBINATIONS", 2, 0, false);
        declareFunction(me, "some_support_combinations_theoretically_possible", "SOME-SUPPORT-COMBINATIONS-THEORETICALLY-POSSIBLE", 1, 0, false);
        declareFunction(me, "some_support_combinations_extensionally_possible", "SOME-SUPPORT-COMBINATIONS-EXTENSIONALLY-POSSIBLE", 1, 0, false);
        declareFunction(me, "all_forward_support_mt_combinations", "ALL-FORWARD-SUPPORT-MT-COMBINATIONS", 1, 0, false);
        declareFunction(me, "all_forward_support_mt_combinations_int", "ALL-FORWARD-SUPPORT-MT-COMBINATIONS-INT", 1, 0, false);
        declareFunction(me, "forward_support_mt_combinations", "FORWARD-SUPPORT-MT-COMBINATIONS", 1, 0, false);
        declareFunction(me, "compute_mts_from_supports", "COMPUTE-MTS-FROM-SUPPORTS", 1, 1, false);
        declareFunction(me, "separate_supports_for_mt_placement", "SEPARATE-SUPPORTS-FOR-MT-PLACEMENT", 1, 0, false);
        declareFunction(me, "compute_where_wff_formulaP", "COMPUTE-WHERE-WFF-FORMULA?", 1, 0, false);
        declareFunction(me, "assume_where_wff_formulaP", "ASSUME-WHERE-WFF-FORMULA?", 1, 0, false);
        declareFunction(me, "forward_mt_placements_from_support_mts", "FORWARD-MT-PLACEMENTS-FROM-SUPPORT-MTS", 1, 1, false);
        declareFunction(me, "all_computed_wff_mt_combinations", "ALL-COMPUTED-WFF-MT-COMBINATIONS", 1, 0, false);
        declareFunction(me, "all_computed_wff_mt_combinations_int", "ALL-COMPUTED-WFF-MT-COMBINATIONS-INT", 1, 0, false);
        declareFunction(me, "computed_wff_mt_combinations", "COMPUTED-WFF-MT-COMBINATIONS", 1, 0, false);
        declareFunction(me, "computed_wff_mt_combinations_wrt_term_of_unit", "COMPUTED-WFF-MT-COMBINATIONS-WRT-TERM-OF-UNIT", 1, 0, false);
        declareFunction(me, "computed_wff_mt_combinations_wrt_hypothetical_terms", "COMPUTED-WFF-MT-COMBINATIONS-WRT-HYPOTHETICAL-TERMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_forward_file() {
        defparameter("*FORWARD-INFERENCE-TRACE?*", NIL);
        defparameter("*TRACING-FORWARD-INFERENCE*", NIL);
        defparameter("*FORWARD-INFERENCE-DEBUG?*", NIL);
        defparameter("*REQUIRE-CACHED-GAF-MT-FROM-SUPPORTS*", NIL);
        defvar("*FORWARD-INFERENCE-BROWSING-CALLBACK*", NIL);
        defparameter("*FORWARD-INFERENCE-BROWSING-CALLBACK-MORE-INFO?*", NIL);
        defvar("*BLOCK-FORWARD-INFERENCES?*", NIL);
        deflexical("*FORWARD-INFERENCE-ASSERTED-ASENT-FAST-FAIL-CUTOFF*", ONE_INTEGER);
        defparameter("*RESPECT-DEFINING-MT-FOR-HYPOTHETICAL-TERMS?*", T);
        defparameter("*SUPPORT-FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS?*", T);
        defparameter("*FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS-PROBLEM-STORE-SIZE*", $int$10000);
        defparameter("*FORWARD-INFERENCE-CALLBACK-REASONS*", $list1);
        defparameter("*SUPPRESSED-FORWARD-INFERENCE-CALLBACK-REASONS*", NIL);
        defparameter("*FORCED-FORWARD-INFERENCE-CALLBACK-REASONS*", NIL);
        deflexical("*GLOBAL-FORWARD-INFERENCE-ENVIRONMENT-LOCK*", SubLTrampolineFile.maybeDefault($global_forward_inference_environment_lock$, $global_forward_inference_environment_lock$, () -> make_lock($str7$Global_forward_inference_environm)));
        defparameter("*GLOBAL-FORWARD-INFERENCE-ENVIRONMENT*", queues.create_queue(UNPROVIDED));
        deflexical("*CURRENTLY-FORWARD-PROPAGATING-SUPPORTS*", SubLTrampolineFile.maybeDefault($currently_forward_propagating_supports$, $currently_forward_propagating_supports$, () -> set.new_set(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*CURRENTLY-FORWARD-PROPAGATING-SUPPORTS-LOCK*", make_lock($str9$Currently_Forward_Propagating_Sup));
        defparameter("*FORWARD-INFERENCE-GAF*", NIL);
        defparameter("*FORWARD-INFERENCE-RULE*", NIL);
        deflexical("*FORWARD-PROBLEM-STORE-PROPERTIES*", $list23);
        defparameter("*FORWARD-INFERENCE-SHARES-SAME-PROBLEM-STORE?*", T);
        defparameter("*FORWARD-INFERENCE-RECURSION-DEPTH*", ZERO_INTEGER);
        defparameter("*SOMEONE-ELSE-WILL-PROCESS-THIS-FORWARD-INFERENCE-ENVIRONMENT*", NIL);
        defparameter("*SOMEONE-ELSE-WILL-PROCESS-THE-GLOBAL-FORWARD-INFERENCE-ENVIRONMENT?*", NIL);
        defparameter("*DEFAULT-FORWARD-PROPAGATION-MT*", $$InferencePSC);
        defparameter("*ALLOW-FORWARD-PROPAGATION-MT-OVERRIDE?*", NIL);
        defparameter("*DEBUG-FORWARD-PROPAGATION-MT-OVERRIDE?*", NIL);
        defparameter("*FORWARD-INFERENCE-ASSERTIBLES-QUEUE*", NIL);
        deflexical("*FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED-CACHING-STATE*", NIL);
        defparameter("*TYPE-FILTER-FORWARD-DNF*", T);
        defparameter("*FORWARD-NON-TRIGGER-LITERAL-RESTRICTED-EXAMINE-ASENT*", NIL);
        defparameter("*HANDLE-ONE-FORWARD-PROPAGATION-CALLBACK*", NIL);
        defparameter("*CHECK-FORWARD-PROPAGATE-DOOMED-DUE-TO-NULL-MAX-FLOOR-MTS?*", T);
        defparameter("*FORWARD-LEAFY-MT-THRESHOLD*", MINUS_ONE_INTEGER);
        defparameter("*FORWARD-INFERENCE-SHOW-PROPAGATION-RESULTS-PROGRESS-CUTOFF*", $int$5000);
        defparameter("*FORWARD-INFERENCE-OVERRIDING-QUERY-PROPERTIES*", NIL);
        defparameter("*RULE-FORWARD-INFERENCE-PRODUCTIVITY-AGGRESSIVE-WHACKING-MODE?*", NIL);
        defparameter("*MINIMUM-RULE-FORWARD-INFERENCE-PRODUCTIVITY-LIMIT*", $int$10000);
        defparameter("*ASSERTIVE-WFF-RULE-WHACKING-FACTOR*", $int$200);
        defparameter("*OLD-RULE-WITHOUT-DEPENDENTS-OR-BOOKKEEPING-WHACKING-FACTOR*", $int$150000);
        defparameter("*OLD-RULE-WITHOUT-DEPENDENTS-WHACKING-COMPENSATION-FACTOR*", $int$1000);
        defvar("*COMPUTE-DECONTEXTUALIZED-DEDUCTION-MT?*", T);
        defparameter("*ADD-FORWARD-DEDUCTIONS-FROM-SUPPORTS-CALLBACK*", NIL);
        defvar("*ASSUME-FORWARD-DEDUCTION-IS-WF?*", NIL);
        defvar("*FORWARD-CONSTRAINT-INFERENCE-ENABLED?*", NIL);
        defparameter("*COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS-EXCEPTIONS*", NIL);
        defparameter("*VERIFY-SOME-SUPPORT-COMBINATIONS-POSSIBLE*", T);
        return NIL;
    }

    public static SubLObject setup_forward_file() {
        declare_defglobal($global_forward_inference_environment_lock$);
        declare_defglobal($currently_forward_propagating_supports$);
        memoization_state.note_globally_cached_function($sym50$FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_C);
        note_funcall_helper_function($sym190$WFF_CONSTRAINT_SUPPORT_);
        memoization_state.note_memoized_function($sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_forward_file();
    }

    @Override
    public void initializeVariables() {
        init_forward_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_forward_file();
    }

    
}

/**
 * Total time: 2693 ms
 */
