package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.mt_relevance_cache;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.auxiliary_indexing;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.modules.forward_modules;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class forward extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.forward";
    public static final String myFingerPrint = "db16bacaab6eb1686d653ddc6b127294ee07d610a047dc8d636b200ca9b04469";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 596L)
    public static SubLSymbol $forward_inference_traceP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 812L)
    public static SubLSymbol $tracing_forward_inference$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 961L)
    public static SubLSymbol $forward_inference_debugP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 1132L)
    public static SubLSymbol $require_cached_gaf_mt_from_supports$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 1333L)
    public static SubLSymbol $forward_inference_browsing_callback$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 1607L)
    public static SubLSymbol $forward_inference_browsing_callback_more_infoP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 1926L)
    private static SubLSymbol $block_forward_inferencesP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 2007L)
    public static SubLSymbol $forward_inference_asserted_asent_fast_fail_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 2195L)
    public static SubLSymbol $respect_defining_mt_for_hypothetical_termsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 2367L)
    public static SubLSymbol $support_forward_propagate_rule_via_trigger_gafsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 2603L)
    public static SubLSymbol $forward_propagate_rule_via_trigger_gafs_problem_store_size$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 3127L)
    public static SubLSymbol $forward_inference_callback_reasons$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 5371L)
    public static SubLSymbol $suppressed_forward_inference_callback_reasons$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 5518L)
    public static SubLSymbol $forced_forward_inference_callback_reasons$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 7269L)
    private static SubLSymbol $global_forward_inference_environment_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 7515L)
    private static SubLSymbol $global_forward_inference_environment$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 8600L)
    private static SubLSymbol $currently_forward_propagating_supports$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 8889L)
    private static SubLSymbol $currently_forward_propagating_supports_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 11697L)
    private static SubLSymbol $forward_inference_gaf$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 11879L)
    public static SubLSymbol $forward_inference_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 12729L)
    private static SubLSymbol $forward_problem_store_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 14350L)
    public static SubLSymbol $forward_inference_shares_same_problem_storeP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 19080L)
    private static SubLSymbol $forward_inference_recursion_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 19142L)
    private static SubLSymbol $someone_else_will_process_this_forward_inference_environment$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 19309L)
    private static SubLSymbol $someone_else_will_process_the_global_forward_inference_environmentP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 23884L)
    public static SubLSymbol $default_forward_propagation_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 24049L)
    public static SubLSymbol $allow_forward_propagation_mt_overrideP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 24120L)
    public static SubLSymbol $debug_forward_propagation_mt_overrideP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 27206L)
    public static SubLSymbol $forward_inference_assertibles_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 30491L)
    private static SubLSymbol $forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 40661L)
    public static SubLSymbol $type_filter_forward_dnf$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 44988L)
    public static SubLSymbol $forward_non_trigger_literal_restricted_examine_asent$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 50755L)
    public static SubLSymbol $handle_one_forward_propagation_callback$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 50960L)
    private static SubLSymbol $check_forward_propagate_doomed_due_to_null_max_floor_mtsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 55169L)
    private static SubLSymbol $forward_leafy_mt_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 57522L)
    private static SubLSymbol $forward_inference_show_propagation_results_progress_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 60455L)
    public static SubLSymbol $forward_inference_overriding_query_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 64810L)
    public static SubLSymbol $rule_forward_inference_productivity_aggressive_whacking_modeP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 65156L)
    public static SubLSymbol $minimum_rule_forward_inference_productivity_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 65293L)
    public static SubLSymbol $assertive_wff_rule_whacking_factor$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 65433L)
    public static SubLSymbol $old_rule_without_dependents_or_bookkeeping_whacking_factor$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 65636L)
    public static SubLSymbol $old_rule_without_dependents_whacking_compensation_factor$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 69879L)
    public static SubLSymbol $compute_decontextualized_deduction_mtP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 70233L)
    public static SubLSymbol $add_forward_deductions_from_supports_callback$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 79905L)
    public static SubLSymbol $assume_forward_deduction_is_wfP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 84360L)
    private static SubLSymbol $forward_constraint_inference_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 93294L)
    private static SubLSymbol $compute_all_mt_and_support_combinations_exceptions$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 96696L)
    public static SubLSymbol $verify_some_support_combinations_possible$;
    private static final SubLInteger $int0$10000;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$REASON;
    private static final SubLSymbol $kw3$TYPE;
    private static final SubLString $str4$______S__;
    private static final SubLString $str5$_repropagate_forward_gaf_wrt_rule;
    private static final SubLSymbol $sym6$_GLOBAL_FORWARD_INFERENCE_ENVIRONMENT_LOCK_;
    private static final SubLString $str7$Global_forward_inference_environm;
    private static final SubLSymbol $sym8$_CURRENTLY_FORWARD_PROPAGATING_SUPPORTS_;
    private static final SubLString $str9$Currently_Forward_Propagating_Sup;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$SUPPORT_VAR;
    private static final SubLSymbol $sym12$CLET;
    private static final SubLSymbol $sym13$WITH_CURRENTLY_FORWARD_PROPAGATING_SUPPORT;
    private static final SubLSymbol $sym14$CUNWIND_PROTECT;
    private static final SubLSymbol $sym15$PROGN;
    private static final SubLSymbol $sym16$ADD_CURRENTLY_FORWARD_PROPAGATING_SUPPORT;
    private static final SubLSymbol $sym17$REM_CURRENTLY_FORWARD_PROPAGATING_SUPPORT;
    private static final SubLSymbol $sym18$ASSERTION_P;
    private static final SubLSymbol $sym19$SUPPORT_P;
    private static final SubLSymbol $sym20$_FORWARD_INFERENCE_GAF_;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$_FORWARD_INFERENCE_RULE_;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$MAX_PROBLEM_COUNT;
    private static final SubLSymbol $kw25$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym26$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str27$Did_not_clear_problem_store__S_si;
    private static final SubLString $str28$___S;
    private static final SubLSymbol $sym29$QUEUE_P;
    private static final SubLSymbol $sym30$_EXIT;
    private static final SubLString $str31$Forward_inference_recursion_probl;
    private static final SubLSymbol $sym32$GAF_ASSERTION_;
    private static final SubLSymbol $sym33$RULE_ASSERTION_;
    private static final SubLSymbol $kw34$NONE;
    private static final SubLObject $const35$InferencePSC;
    private static final SubLObject $const36$termForwardPropagationOverrideMt;
    private static final SubLObject $const37$mtHasForwardPropagationOverrideMt;
    private static final SubLObject $const38$ruleRestrictedToSingleInstancesOf;
    private static final SubLSymbol $sym39$FORT_P;
    private static final SubLString $str40$Could_not_find_forward_inference_;
    private static final SubLString $str41$More_than_one_override_mt_for__S_;
    private static final SubLString $str42$More_than_one_instance_of__S_in__;
    private static final SubLObject $const43$MtUnionFn;
    private static final SubLString $str44$inference_psc_override_mt___S;
    private static final SubLSymbol $kw45$HARNESS;
    private static final SubLSymbol $kw46$FORWARD_PROPAGATE_SUPPORT;
    private static final SubLSymbol $kw47$NO_GAF;
    private static final SubLSymbol $kw48$NO_RULE;
    private static final SubLSymbol $kw49$FORWARD_PROPAGATE_ONE_SUPPORT_AND_GENERATE_ASSERTIBLES;
    private static final SubLSymbol $sym50$FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_C;
    private static final SubLSymbol $sym51$_FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_;
    private static final SubLInteger $int52$32;
    private static final SubLSymbol $sym53$CLEAR_FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTI;
    private static final SubLSymbol $sym54$NON_DOTTED_LIST_P;
    private static final SubLSymbol $kw55$FORWARD_PROPAGATE_SUPPORT_GENERATE_ASSERTIBLES;
    private static final SubLInteger $int56$30;
    private static final SubLString $str57$__Propagating__S_;
    private static final SubLString $str58$_____A_assertible__P;
    private static final SubLString $str59$Assertion__s_was_removed_by_its_o;
    private static final SubLSymbol $sym60$INVALID_ASSERTION_;
    private static final SubLString $str61$invalid_assertion_in_hl_assertibl;
    private static final SubLSymbol $sym62$ASSERTION_ID;
    private static final SubLSymbol $sym63$INVALID_KB_HL_SUPPORT_;
    private static final SubLString $str64$invalid_kb_hl_support_in_hl_asser;
    private static final SubLSymbol $sym65$KB_HL_SUPPORT_ID;
    private static final SubLSymbol $kw66$HL_ADD_ASSERTIBLE;
    private static final SubLString $str67$_S_does_not_have_an_atomic_senten;
    private static final SubLSymbol $kw68$FORWARD_TACTIC_SPECS;
    private static final SubLSymbol $kw69$OVERHEAD;
    private static final SubLSymbol $kw70$POS;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$NEG;
    private static final SubLSymbol $sym73$VALID_ASSERTION_;
    private static final SubLSymbol $kw74$ALL;
    private static final SubLSymbol $kw75$FORWARD_INFERENCE_RULE_ALLOWED_;
    private static final SubLSymbol $kw76$FORWARD_INFERENCE_RULE_FORBIDDEN_;
    private static final SubLSymbol $kw77$FORWARD_PROPAGATE_GAF_INTERNAL;
    private static final SubLSymbol $kw78$POSSIBLY_SIMPLIFY_IST_SENTENCES_FOR_UNIFY;
    private static final SubLSymbol $kw79$GAF_ASENT_UNIFY;
    private static final SubLSymbol $kw80$HANDLE_FORWARD_PROPAGATION_FROM_GAF;
    private static final SubLObject $const81$creationTemplateFORTs;
    private static final SubLSymbol $kw82$TRUE;
    private static final SubLSymbol $sym83$_TEMPLATE;
    private static final SubLObject $const84$genlCreationTemplate;
    private static final SubLList $list85;
    private static final SubLObject $const86$EverythingPSC;
    private static final SubLObject $const87$creationTemplateAllowableRules;
    private static final SubLObject $const88$creationTemplateAllowsAllRulesFro;
    private static final SubLSymbol $kw89$MT;
    private static final SubLSymbol $kw90$RULE;
    private static final SubLSymbol $kw91$BROAD_MT;
    private static final SubLString $str92$do_broad_mt_index;
    private static final SubLSymbol $sym93$STRINGP;
    private static final SubLSymbol $kw94$SKIP;
    private static final SubLSymbol $kw95$TRIGGER_BINDINGS;
    private static final SubLSymbol $kw96$TRIGGER_SUPPORTS;
    private static final SubLSymbol $kw97$FORWARD_RESULTS;
    private static final SubLSymbol $kw98$ANSWER_COUNT;
    private static final SubLSymbol $kw99$FORWARD_PROPAGATION_SUPPORTS_DOOMED;
    private static final SubLSymbol $kw100$SUPPORT_MTS;
    private static final SubLSymbol $sym101$SUPPORT_MT;
    private static final SubLSymbol $kw102$FALSE;
    private static final SubLSymbol $kw103$INFERENCE_REJECTED;
    private static final SubLSymbol $kw104$SYNTACTICALLY_INVALID_FORWARD_DNF;
    private static final SubLSymbol $kw105$TARGET_ASENT;
    private static final SubLSymbol $kw106$TARGET_TRUTH;
    private static final SubLSymbol $kw107$SEMANTICALLY_INVALID_FORWARD_DNF;
    private static final SubLSymbol $kw108$NULL_MAX_FLOOR_MTS_OF_RULE_AND_GAF_MTS;
    private static final SubLSymbol $kw109$RULE_MT;
    private static final SubLSymbol $kw110$GAF_MT;
    private static final SubLSymbol $kw111$QUERY;
    private static final SubLSymbol $sym112$FORWARD_PRAGMATIC_TRIGGER_LITERAL_LIT_;
    private static final SubLInteger $int113$5000;
    private static final SubLSymbol $kw114$FORWARD_PROPAGATE_DNF;
    private static final SubLSymbol $kw115$EXHAUST_TOTAL;
    private static final SubLString $str116$Propagating_results;
    private static final SubLString $str117$Propagating_;
    private static final SubLString $str118$_results_for_;
    private static final SubLString $str119$____;
    private static final SubLString $str120$cdolist;
    private static final SubLSymbol $kw121$FORWARD_PROPAGATE_RULE_VIA_TRIGGER_GAFS;
    private static final SubLString $str122$Forward_inference_incomplete_for_;
    private static final SubLSymbol $kw123$INFERENCE;
    private static final SubLString $str124$Tried_to_do_forward_inference_out;
    private static final SubLSymbol $kw125$PROBLEM_STORE;
    private static final SubLSymbol $kw126$NON_EXPLANATORY_SENTENCE;
    private static final SubLSymbol $kw127$ALLOW_INDETERMINATE_RESULTS_;
    private static final SubLSymbol $kw128$BROWSABLE_;
    private static final SubLSymbol $kw129$BLOCK_;
    private static final SubLSymbol $kw130$PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $kw131$PROBABLY_APPROXIMATELY_DONE;
    private static final SubLSymbol $kw132$MAX_TIME;
    private static final SubLSymbol $kw133$RESULT_UNIQUENESS;
    private static final SubLSymbol $kw134$PROOF;
    private static final SubLSymbol $kw135$RETURN;
    private static final SubLSymbol $kw136$BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS;
    private static final SubLSymbol $kw137$NEW_TERMS_ALLOWED_;
    private static final SubLInteger $int138$200;
    private static final SubLInteger $int139$150000;
    private static final SubLInteger $int140$1000;
    private static final SubLSymbol $kw141$ADD_FORWARD_PROPAGATION_RESULT;
    private static final SubLList $list142;
    private static final SubLSymbol $kw143$CONCLUDED_ASENT_NOT_HL_GROUND_TREE;
    private static final SubLSymbol $kw144$ASENT;
    private static final SubLList $list145;
    private static final SubLSymbol $kw146$NULL_MT_SUPPORT_COMBINATIONS;
    private static final SubLSymbol $kw147$FORM;
    private static final SubLSymbol $sym148$COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS;
    private static final SubLSymbol $kw149$FAILURE_REASONS;
    private static final SubLSymbol $kw150$INVALID_LIFT;
    private static final SubLSymbol $kw151$PROPAGATION_MT;
    private static final SubLSymbol $kw152$MT_SUPPORT_COMBINATIONS;
    private static final SubLList $list153;
    private static final SubLSymbol $kw154$NO_MT_SUPPORT_COMBINATION_CONCLUDED_MTS_FOUND;
    private static final SubLSymbol $kw155$FAILURE_REASON;
    private static final SubLSymbol $kw156$INVALID_PLACEMENT;
    private static final SubLSymbol $sym157$CONCLUDED_ASENT;
    private static final SubLSymbol $sym158$PROPAGATION_MT;
    private static final SubLSymbol $kw159$CONCLUDED_MT;
    private static final SubLSymbol $sym160$CONCLUDED_MT;
    private static final SubLSymbol $kw161$HANDLE_FORWARD_DEDUCTION_IN_MT;
    private static final SubLSymbol $kw162$PLACEMENT_MT;
    private static final SubLSymbol $kw163$SUPPORTS;
    private static final SubLSymbol $kw164$PRAGMATIC_SUPPORTS;
    private static final SubLSymbol $kw165$FORWARD_BINDINGS_ABNORMAL_;
    private static final SubLSymbol $kw166$FORWARD_BINDINGS_ABNORMAL;
    private static final SubLSymbol $kw167$SUPPORTS_CONTAIN_EXCEPTED_ASSERTION_IN_MT_;
    private static final SubLSymbol $kw168$FORWARD_BINDINGS_EXCEPTED;
    private static final SubLSymbol $sym169$CONSTRAINT_RULE_;
    private static final SubLSymbol $kw170$FORBID_FORWARD_CONCLUSION_IN_MT_;
    private static final SubLSymbol $kw171$FORWARD_CONCLUSION_FORBIDDEN_IN_MT;
    private static final SubLString $str172$Something_between_queueing_and_pr;
    private static final SubLSymbol $kw173$INVALIDATED_SUPPORT;
    private static final SubLSymbol $kw174$CANONICALIZE_WF_GAF;
    private static final SubLSymbol $kw175$CANONICALIZE_GAF;
    private static final SubLObject $const176$True;
    private static final SubLSymbol $kw177$FORWARD_CONCLUSION_TAUTOLOGICAL;
    private static final SubLObject $const178$False;
    private static final SubLSymbol $kw179$FORWARD_CONCLUSION_CONTRADICTION;
    private static final SubLString $str180$Canonicalization_of__s_in__s_inva;
    private static final SubLSymbol $kw181$CZER_INVALIDATED_SUPPORT;
    private static final SubLString $str182$Forward_conclusion_not_WFF______S;
    private static final SubLSymbol $kw183$FORWARD_CONCLUSION_NOT_WF;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$CNF_P;
    private static final SubLSymbol $kw186$FORWARD_CONCLUSION_TRIVIALLY_DERIVABLE;
    private static final SubLSymbol $sym187$CORE_MICROTHEORY_P;
    private static final SubLSymbol $kw188$FORWARD;
    private static final SubLSymbol $sym189$ASSERTIVE_WFF_RULE_;
    private static final SubLSymbol $sym190$WFF_CONSTRAINT_SUPPORT_;
    private static final SubLObject $const191$WFFConstraintPredicate;
    private static final SubLObject $const192$wffConstraintMt;
    private static final SubLObject $const193$constraint;
    private static final SubLSymbol $kw194$FORWARD_DEDUCTION_CONSTRAINT_VIOLATION;
    private static final SubLSymbol $sym195$FORWARD_TRIGGER_LITERAL_LIT_;
    private static final SubLObject $const196$forwardTriggerLiteral;
    private static final SubLSymbol $kw197$SYNTACTICALLY_INVALID_FORWARD_TRIGGER_ASENT;
    private static final SubLSymbol $sym198$FORWARD_NON_TRIGGER_LITERAL_LIT_;
    private static final SubLObject $const199$forwardNonTriggerLiteral;
    private static final SubLSymbol $kw200$SYNTACTICALLY_INVALID_FORWARD_NON_TRIGGER_ASENT;
    private static final SubLSymbol $sym201$HLMT_EQUAL;
    private static final SubLSymbol $sym202$FORWARD_LEAFY_MT_P;
    private static final SubLSymbol $sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_;
    private static final SubLList $list204;
    private static final SubLSymbol $kw205$COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS;
    private static final SubLSymbol $kw206$COMPUTE_MTS_FROM_SUPPORTS;
    private static final SubLSymbol $kw207$SOME_SUPPORT_COMBINATIONS_EXTENSIONALLY_POSSIBLE;
    private static final SubLSymbol $sym208$ASSERTION_MT;
    private static final SubLSymbol $kw209$ALL_FORWARD_SUPPORT_MT_COMBINATIONS;
    private static final SubLList $list210;
    private static final SubLSymbol $sym211$CONS;
    private static final SubLSymbol $sym212$SPEC_MT_;
    private static final SubLSymbol $sym213$HYPOTHETICAL_TERM_P;
    private static final SubLSymbol $kw214$FORWARD_MT_PLACEMENTS_FROM_SUPPORT_MTS;
    private static final SubLString $str215$Skipping_max_floor_mts_call_due_t;
    private static final SubLObject $const216$BaseKB;
    private static final SubLSymbol $kw217$NULL_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED;
    private static final SubLSymbol $kw218$ALL_COMPUTED_WFF_MT_COMBINATIONS;
    private static final SubLSymbol $kw219$NULL_INFERENCE_MAX_FLOOR_MTS_OF_NAT;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 2696L)
    public static SubLObject forward_propagate_rule_via_trigger_gafsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != forward.$support_forward_propagate_rule_via_trigger_gafsP$.getDynamicValue(thread) && forward.NIL == control_vars.browse_forward_inferencesP() && forward.NIL == forward.$forward_inference_browsing_callback$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 2917L)
    public static SubLObject call_forward_inference_browsing_callbackP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != forward.$forward_inference_debugP$.getDynamicValue(thread) || forward.NIL != forward.$forward_inference_browsing_callback$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 5741L)
    public static SubLObject call_forward_inference_browsing_callback(final SubLObject possible_inference, final SubLObject rule, SubLObject more_info) {
        if (more_info == forward.UNPROVIDED) {
            more_info = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject reason = conses_high.getf(more_info, (SubLObject)forward.$kw2$REASON, (SubLObject)forward.UNPROVIDED);
        if (forward.NIL != reason) {
            final SubLObject reason_type = conses_high.getf(reason, (SubLObject)forward.$kw3$TYPE, (SubLObject)forward.UNPROVIDED);
            if (forward.NIL == list_utilities.member_eqP(reason_type, forward.$forced_forward_inference_callback_reasons$.getDynamicValue(thread)) && forward.NIL != list_utilities.member_eqP(reason_type, forward.$suppressed_forward_inference_callback_reasons$.getDynamicValue(thread))) {
                return (SubLObject)forward.NIL;
            }
            if (forward.NIL != forward.$forward_inference_debugP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)forward.T, (SubLObject)forward.$str4$______S__, reason);
                format_nil.force_format((SubLObject)forward.T, (SubLObject)forward.$str5$_repropagate_forward_gaf_wrt_rule, el_utilities.sefify(current_forward_inference_gaf()), el_utilities.sefify(rule), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
            }
        }
        SubLObject result = (SubLObject)forward.NIL;
        if (forward.NIL != forward.$forward_inference_browsing_callback$.getDynamicValue(thread)) {
            if (forward.NIL != forward.$forward_inference_browsing_callback_more_infoP$.getDynamicValue(thread)) {
                result = Functions.funcall(forward.$forward_inference_browsing_callback$.getDynamicValue(thread), possible_inference, rule, more_info);
            }
            else {
                result = Functions.funcall(forward.$forward_inference_browsing_callback$.getDynamicValue(thread), possible_inference, rule);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 6674L)
    public static SubLObject current_forward_inference_environment() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kb_control_vars.$forward_inference_environment$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 6870L)
    public static SubLObject get_forward_inference_environment() {
        return new_forward_inference_environment();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 6971L)
    public static SubLObject free_forward_inference_enviornment(final SubLObject environment) {
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 7075L)
    public static SubLObject clear_forward_inference_environment(final SubLObject environment) {
        return queues.clear_queue(environment);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 7177L)
    public static SubLObject new_forward_inference_environment() {
        return queues.create_queue((SubLObject)forward.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 7593L)
    public static SubLObject queue_global_forward_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        SubLObject release = (SubLObject)forward.NIL;
        try {
            release = Locks.seize_lock(forward.$global_forward_inference_environment_lock$.getGlobalValue());
            result = queues.enqueue(assertion, forward.$global_forward_inference_environment$.getDynamicValue(thread));
        }
        finally {
            if (forward.NIL != release) {
                Locks.release_lock(forward.$global_forward_inference_environment_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 7836L)
    public static SubLObject dequeue_global_forward_assertion() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        SubLObject release = (SubLObject)forward.NIL;
        try {
            release = Locks.seize_lock(forward.$global_forward_inference_environment_lock$.getGlobalValue());
            result = queues.dequeue(forward.$global_forward_inference_environment$.getDynamicValue(thread));
        }
        finally {
            if (forward.NIL != release) {
                Locks.release_lock(forward.$global_forward_inference_environment_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 8062L)
    public static SubLObject global_forward_assertion_queue_empty_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        SubLObject release = (SubLObject)forward.NIL;
        try {
            release = Locks.seize_lock(forward.$global_forward_inference_environment_lock$.getGlobalValue());
            result = queues.queue_empty_p(forward.$global_forward_inference_environment$.getDynamicValue(thread));
        }
        finally {
            if (forward.NIL != release) {
                Locks.release_lock(forward.$global_forward_inference_environment_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 8300L)
    public static SubLObject clear_global_forward_inference_environment() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        SubLObject release = (SubLObject)forward.NIL;
        try {
            release = Locks.seize_lock(forward.$global_forward_inference_environment_lock$.getGlobalValue());
            result = queues.queue_size(forward.$global_forward_inference_environment$.getDynamicValue(thread));
            queues.clear_queue(forward.$global_forward_inference_environment$.getDynamicValue(thread));
        }
        finally {
            if (forward.NIL != release) {
                Locks.release_lock(forward.$global_forward_inference_environment_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 9022L)
    public static SubLObject with_currently_forward_propagating_support(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject support = (SubLObject)forward.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward.$list10);
        support = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (!support.isAtom()) {
            final SubLObject support_var = (SubLObject)forward.$sym11$SUPPORT_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)forward.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(support_var, support)), (SubLObject)ConsesLow.listS((SubLObject)forward.$sym13$WITH_CURRENTLY_FORWARD_PROPAGATING_SUPPORT, support_var, ConsesLow.append(body, (SubLObject)forward.NIL)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)forward.$sym14$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)forward.$sym15$PROGN, (SubLObject)ConsesLow.list((SubLObject)forward.$sym16$ADD_CURRENTLY_FORWARD_PROPAGATING_SUPPORT, support), ConsesLow.append(body, (SubLObject)forward.NIL)), (SubLObject)ConsesLow.list((SubLObject)forward.$sym17$REM_CURRENTLY_FORWARD_PROPAGATING_SUPPORT, support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 9458L)
    public static SubLObject currently_forward_propagating_supportP(final SubLObject support) {
        SubLObject result = (SubLObject)forward.NIL;
        SubLObject release = (SubLObject)forward.NIL;
        try {
            release = Locks.seize_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            result = set.set_memberP(support, forward.$currently_forward_propagating_supports$.getGlobalValue());
        }
        finally {
            if (forward.NIL != release) {
                Locks.release_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 9852L)
    public static SubLObject all_currently_forward_propagating_supports() {
        SubLObject supports = (SubLObject)forward.NIL;
        SubLObject release = (SubLObject)forward.NIL;
        try {
            release = Locks.seize_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            supports = set.set_element_list(forward.$currently_forward_propagating_supports$.getGlobalValue());
        }
        finally {
            if (forward.NIL != release) {
                Locks.release_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 10200L)
    public static SubLObject currently_forward_propagating_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != assertion_handles.assertion_p(assertion) && forward.NIL != currently_forward_propagating_supportP(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 10458L)
    public static SubLObject all_currently_forward_propagating_assertions() {
        final SubLObject supports = all_currently_forward_propagating_supports();
        SubLObject assertions = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)forward.$sym18$ASSERTION_P), supports, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
        assertions = assertion_utilities.sort_assertions(assertions);
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 10848L)
    public static SubLObject clear_currently_forward_propagating_supports() {
        SubLObject total = (SubLObject)forward.NIL;
        SubLObject release = (SubLObject)forward.NIL;
        try {
            release = Locks.seize_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            total = set.set_size(forward.$currently_forward_propagating_supports$.getGlobalValue());
            set.clear_set(forward.$currently_forward_propagating_supports$.getGlobalValue());
        }
        finally {
            if (forward.NIL != release) {
                Locks.release_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 11164L)
    public static SubLObject add_currently_forward_propagating_support(final SubLObject support) {
        assert forward.NIL != arguments.support_p(support) : support;
        SubLObject release = (SubLObject)forward.NIL;
        try {
            release = Locks.seize_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            set.set_add(support, forward.$currently_forward_propagating_supports$.getGlobalValue());
        }
        finally {
            if (forward.NIL != release) {
                Locks.release_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return (SubLObject)forward.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 11407L)
    public static SubLObject rem_currently_forward_propagating_support(final SubLObject support) {
        assert forward.NIL != arguments.support_p(support) : support;
        SubLObject result = (SubLObject)forward.NIL;
        SubLObject release = (SubLObject)forward.NIL;
        try {
            release = Locks.seize_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            result = set.set_remove(support, forward.$currently_forward_propagating_supports$.getGlobalValue());
        }
        finally {
            if (forward.NIL != release) {
                Locks.release_lock(forward.$currently_forward_propagating_supports_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 11995L)
    public static SubLObject with_forward_inference_source_support(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject support = (SubLObject)forward.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward.$list10);
        support = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)forward.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)forward.$sym20$_FORWARD_INFERENCE_GAF_, support)), ConsesLow.append(body, (SubLObject)forward.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 12137L)
    public static SubLObject with_forward_inference_rule(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rule = (SubLObject)forward.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward.$list21);
        rule = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)forward.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)forward.$sym22$_FORWARD_INFERENCE_RULE_, rule)), ConsesLow.append(body, (SubLObject)forward.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 12264L)
    public static SubLObject current_forward_inference_gaf() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return forward.$forward_inference_gaf$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 12349L)
    public static SubLObject current_forward_inference_rule() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return forward.$forward_inference_rule$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 12436L)
    public static SubLObject current_forward_inference_assertion() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (forward.NIL != forward.$forward_inference_gaf$.getDynamicValue(thread)) ? forward.$forward_inference_gaf$.getDynamicValue(thread) : forward.$forward_inference_rule$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 12563L)
    public static SubLObject current_forward_inference_fully_propagating_ruleP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != current_forward_inference_rule() && forward.NIL == current_forward_inference_gaf());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 13309L)
    public static SubLObject forward_problem_store_properties() {
        return conses_high.copy_list(forward.$forward_problem_store_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 13420L)
    public static SubLObject new_forward_problem_store(SubLObject support) {
        if (support == forward.UNPROVIDED) {
            support = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_metrics.increment_forward_problem_store_historical_count();
        SubLObject problem_store_properties = forward_problem_store_properties();
        if (forward.NIL != forward_propagate_rule_via_trigger_gafsP() && forward.NIL != assertions_high.rule_assertionP(support) && forward.NIL == assertions_high.single_literal_antecedent_ruleP(support)) {
            problem_store_properties = conses_high.putf(problem_store_properties, (SubLObject)forward.$kw24$MAX_PROBLEM_COUNT, forward.$forward_propagate_rule_via_trigger_gafs_problem_store_size$.getDynamicValue(thread));
        }
        return inference_datastructures_problem_store.new_problem_store(problem_store_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 14134L)
    public static SubLObject destroy_forward_problem_store(final SubLObject store) {
        inference_metrics.update_forward_problem_historical_count(store);
        inference_metrics.update_maximum_forward_problem_store_historical_problem_count(store);
        return inference_datastructures_problem_store.destroy_problem_store(store);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 14491L)
    public static SubLObject forward_inference_shares_same_problem_storeP(SubLObject support) {
        if (support == forward.UNPROVIDED) {
            support = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL != assertions_high.rule_assertionP(support)) {
            return (SubLObject)forward.NIL;
        }
        return forward.$forward_inference_shares_same_problem_storeP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 14685L)
    public static SubLObject get_forward_problem_store(SubLObject support) {
        if (support == forward.UNPROVIDED) {
            support = current_forward_inference_gaf();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = (SubLObject)forward.NIL;
        if (forward.NIL != inference_datastructures_problem_store.problem_store_p(utilities_macros.$current_forward_problem_store$.getDynamicValue(thread)) && forward.NIL == inference_datastructures_problem_store.valid_problem_store_p(utilities_macros.$current_forward_problem_store$.getDynamicValue(thread))) {
            SubLObject ignore_errors_tag = (SubLObject)forward.NIL;
            try {
                thread.throwStack.push(forward.$kw25$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)forward.$sym26$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        clear_current_forward_problem_store();
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)forward.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)forward.$kw25$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        if (forward.NIL != forward_inference_shares_same_problem_storeP(support)) {
            store = utilities_macros.$current_forward_problem_store$.getDynamicValue(thread);
        }
        if (forward.NIL == store) {
            clear_current_forward_problem_store();
            store = new_forward_problem_store(support);
        }
        utilities_macros.$current_forward_problem_store$.setDynamicValue(store, thread);
        return store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 15642L)
    public static SubLObject clear_current_forward_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL != inference_datastructures_problem_store.problem_store_p(utilities_macros.$current_forward_problem_store$.getDynamicValue(thread)) && forward.NIL != inference_datastructures_problem_store.valid_problem_store_p(utilities_macros.$current_forward_problem_store$.getDynamicValue(thread)) && forward.NIL != inference_datastructures_problem_store.problem_store_running_inferences(utilities_macros.$current_forward_problem_store$.getDynamicValue(thread))) {
            if (forward.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)forward.$str27$Did_not_clear_problem_store__S_si, utilities_macros.$current_forward_problem_store$.getDynamicValue(thread));
            }
        }
        else {
            clear_current_forward_problem_store_int();
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 16326L)
    public static SubLObject clear_current_forward_problem_store_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL != utilities_macros.$current_forward_problem_store$.getDynamicValue(thread)) {
            try {
                if (forward.NIL == control_vars.browse_forward_inferencesP()) {
                    destroy_forward_problem_store(utilities_macros.$current_forward_problem_store$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.$current_forward_problem_store$.setDynamicValue((SubLObject)forward.NIL, thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 16685L)
    public static SubLObject clear_current_forward_inference_environment() {
        return clear_forward_inference_environment(current_forward_inference_environment());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 16897L)
    public static SubLObject queue_forward_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (forward.NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread)) {
            final SubLObject environment = current_forward_inference_environment();
            if (forward.NIL != misc_utilities.initialized_p(environment)) {
                queues.enqueue(assertion, environment);
            }
            else {
                queue_global_forward_assertion(assertion);
            }
            if (forward.NIL != forward.$tracing_forward_inference$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)forward.T, (SubLObject)forward.$str28$___S, assertion);
            }
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 17308L)
    public static SubLObject remqueue_forward_assertion(final SubLObject assertion) {
        assert forward.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject environment = current_forward_inference_environment();
        if (forward.NIL != misc_utilities.initialized_p(environment)) {
            return queues.remqueue(assertion, environment, (SubLObject)forward.UNPROVIDED);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 17551L)
    public static SubLObject queue_or_repropagate_forward_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL != tms.tms_should_schedule_assertion_for_forward_propagationP(assertion)) {
            final SubLObject environment = current_forward_inference_environment();
            if (forward.NIL != misc_utilities.initialized_p(environment)) {
                queue_forward_assertion(assertion);
                if (forward.NIL == someone_else_will_process_this_forward_inference_environmentP(environment)) {
                    return perform_forward_inference();
                }
            }
            else {
                final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
                try {
                    kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)forward.NIL, thread);
                    control_vars.$prefer_forward_skolemization$.bind((SubLObject)forward.NIL, thread);
                    final SubLObject environment_$1 = get_forward_inference_environment();
                    assert forward.NIL != queues.queue_p(environment_$1) : environment_$1;
                    final SubLObject _prev_bind_0_$2 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_environment$.bind(environment_$1, thread);
                        utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward.NIL, thread);
                        try {
                            forward_propagate_assertion(assertion, (SubLObject)forward.UNPROVIDED);
                            return perform_forward_inference();
                        }
                        finally {
                            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                clear_current_forward_problem_store();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_1_$3, thread);
                        kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_2, thread);
                    kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 18232L)
    public static SubLObject queue_or_repropagate_forward_assertions(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject environment = current_forward_inference_environment();
        if (forward.NIL != misc_utilities.initialized_p(environment)) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = (SubLObject)forward.NIL;
            assertion = cdolist_list_var.first();
            while (forward.NIL != cdolist_list_var) {
                if (forward.NIL != tms.tms_should_schedule_assertion_for_forward_propagationP(assertion)) {
                    queue_forward_assertion(assertion);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
            if (forward.NIL == someone_else_will_process_this_forward_inference_environmentP(environment)) {
                return perform_forward_inference();
            }
        }
        else {
            final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
            try {
                kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)forward.NIL, thread);
                control_vars.$prefer_forward_skolemization$.bind((SubLObject)forward.NIL, thread);
                final SubLObject environment_$5 = get_forward_inference_environment();
                assert forward.NIL != queues.queue_p(environment_$5) : environment_$5;
                final SubLObject _prev_bind_0_$6 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment_$5, thread);
                    utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward.NIL, thread);
                    try {
                        SubLObject cdolist_list_var2 = assertions;
                        SubLObject assertion2 = (SubLObject)forward.NIL;
                        assertion2 = cdolist_list_var2.first();
                        while (forward.NIL != cdolist_list_var2) {
                            if (forward.NIL != tms.tms_should_schedule_assertion_for_forward_propagationP(assertion2)) {
                                forward_propagate_assertion(assertion2, (SubLObject)forward.UNPROVIDED);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            assertion2 = cdolist_list_var2.first();
                        }
                        return perform_forward_inference();
                    }
                    finally {
                        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            clear_current_forward_problem_store();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_1_$7, thread);
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$6, thread);
                }
            }
            finally {
                control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_2, thread);
                kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 19469L)
    public static SubLObject someone_else_will_process_this_forward_inference_environmentP(final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != queues.queue_p(environment) && environment.eql(forward.$someone_else_will_process_this_forward_inference_environment$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 19686L)
    public static SubLObject performing_forward_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread) || forward.$forward_inference_recursion_depth$.getDynamicValue(thread).isPositive());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 19830L)
    public static SubLObject perform_forward_inference_now() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject _prev_bind_0 = forward.$someone_else_will_process_this_forward_inference_environment$.currentBinding(thread);
        try {
            forward.$someone_else_will_process_this_forward_inference_environment$.bind((SubLObject)forward.NIL, thread);
            result = perform_forward_inference();
        }
        finally {
            forward.$someone_else_will_process_this_forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 20073L)
    public static SubLObject perform_forward_inference() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        if (forward.NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
            try {
                utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward.NIL, thread);
                try {
                    final SubLObject _prev_bind_0_$9 = forward.$forward_inference_recursion_depth$.currentBinding(thread);
                    try {
                        forward.$forward_inference_recursion_depth$.bind(number_utilities.f_1X(forward.$forward_inference_recursion_depth$.getDynamicValue(thread)), thread);
                        if (forward.NIL != control_vars.$inference_debugP$.getDynamicValue(thread) && forward.$forward_inference_recursion_depth$.getDynamicValue(thread).numGE((SubLObject)forward.TWENTY_INTEGER)) {
                            Errors.sublisp_break((SubLObject)forward.$str31$Forward_inference_recursion_probl, new SubLObject[] { forward.$forward_inference_recursion_depth$.getDynamicValue(thread) });
                        }
                        SubLObject environment;
                        for (SubLObject doneP = (SubLObject)forward.NIL; forward.NIL == doneP; doneP = (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL == forward_inference_to_doP(environment))) {
                            environment = current_forward_inference_environment();
                            if (forward.NIL != dynamic_forward_inference_to_doP(environment)) {
                                final SubLObject _prev_bind_0_$10 = forward.$someone_else_will_process_this_forward_inference_environment$.currentBinding(thread);
                                try {
                                    forward.$someone_else_will_process_this_forward_inference_environment$.bind(environment, thread);
                                    if (forward.NIL != misc_utilities.initialized_p(environment)) {
                                        while (forward.NIL == queues.queue_empty_p(environment)) {
                                            final SubLObject assertion = queues.dequeue(environment);
                                            final SubLObject some_results = forward_propagate_assertion(assertion, (SubLObject)forward.UNPROVIDED);
                                            result = ConsesLow.nconc(Sequences.nreverse(some_results), result);
                                        }
                                    }
                                }
                                finally {
                                    forward.$someone_else_will_process_this_forward_inference_environment$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            if (forward.NIL != global_forward_inference_to_doP()) {
                                final SubLObject _prev_bind_0_$11 = forward.$someone_else_will_process_the_global_forward_inference_environmentP$.currentBinding(thread);
                                try {
                                    forward.$someone_else_will_process_the_global_forward_inference_environmentP$.bind((SubLObject)forward.T, thread);
                                    for (SubLObject global_assertion = dequeue_global_forward_assertion(); forward.NIL != global_assertion; global_assertion = dequeue_global_forward_assertion()) {
                                        final SubLObject some_results = forward_propagate_assertion(global_assertion, (SubLObject)forward.UNPROVIDED);
                                        result = ConsesLow.nconc(Sequences.nreverse(some_results), result);
                                    }
                                }
                                finally {
                                    forward.$someone_else_will_process_the_global_forward_inference_environmentP$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                        }
                    }
                    finally {
                        forward.$forward_inference_recursion_depth$.rebind(_prev_bind_0_$9, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        clear_current_forward_problem_store();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 22043L)
    public static SubLObject dynamic_forward_inference_to_doP(final SubLObject environment) {
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != misc_utilities.initialized_p(environment) && forward.NIL == someone_else_will_process_this_forward_inference_environmentP(environment) && forward.NIL == queues.queue_empty_p(environment));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 22281L)
    public static SubLObject global_forward_inference_to_doP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != misc_utilities.initialized_p(forward.$global_forward_inference_environment$.getDynamicValue(thread)) && forward.NIL == forward.$someone_else_will_process_the_global_forward_inference_environmentP$.getDynamicValue(thread) && forward.NIL == global_forward_assertion_queue_empty_p());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 22541L)
    public static SubLObject forward_inference_to_doP(final SubLObject environment) {
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != dynamic_forward_inference_to_doP(environment) || forward.NIL != global_forward_inference_to_doP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 22698L)
    public static SubLObject repropagate_forward_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (forward.NIL == kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread) || forward.NIL == assertions_high.forward_assertionP(assertion)) {
            return (SubLObject)forward.NIL;
        }
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject environment = utilities_macros.possibly_get_forward_inference_environment();
        assert forward.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            queue_forward_assertion(assertion);
            result = perform_forward_inference();
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 23102L)
    public static SubLObject repropagate_forward_gaf_wrt_rule(final SubLObject gaf, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward.NIL != assertions_high.gaf_assertionP(gaf) : gaf;
        assert forward.NIL != assertions_high.rule_assertionP(rule) : rule;
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_forbidden_rules$.bind((SubLObject)forward.$kw34$NONE, thread);
            kb_control_vars.$forward_inference_allowed_rules$.bind((SubLObject)ConsesLow.list(rule), thread);
            result = repropagate_forward_assertion(gaf);
        }
        finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_forbidden_rules$.rebind(_prev_bind_0, thread);
        }
        SubLObject added_assertions = (SubLObject)forward.NIL;
        SubLObject cdolist_list_var = result;
        SubLObject argument = (SubLObject)forward.NIL;
        argument = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            if (forward.NIL != deduction_handles.valid_deductionP(argument, (SubLObject)forward.UNPROVIDED) && forward.NIL != assertion_handles.valid_assertionP(deductions_high.deduction_supported_object(argument), (SubLObject)forward.UNPROVIDED)) {
                final SubLObject item_var = deductions_high.deduction_supported_object(argument);
                if (forward.NIL == conses_high.member(item_var, added_assertions, Symbols.symbol_function((SubLObject)forward.EQL), Symbols.symbol_function((SubLObject)forward.IDENTITY))) {
                    added_assertions = (SubLObject)ConsesLow.cons(item_var, added_assertions);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        cdolist_list_var = added_assertions;
        SubLObject assertion = (SubLObject)forward.NIL;
        assertion = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            if (forward.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)forward.UNPROVIDED)) {
                result = ConsesLow.nconc(repropagate_forward_assertion(assertion), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 24190L)
    public static SubLObject inference_psc_overriding_termP(final SubLObject v_term) {
        return subl_promotions.positive_integer_p(kb_indexing.num_gaf_arg_index(v_term, (SubLObject)forward.ONE_INTEGER, forward.$const36$termForwardPropagationOverrideMt, (SubLObject)forward.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 24337L)
    public static SubLObject inference_psc_overriding_term_mt(final SubLObject v_term) {
        return kb_mapping_utilities.fpred_value_in_any_mt(v_term, forward.$const36$termForwardPropagationOverrideMt, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 24471L)
    public static SubLObject inference_psc_overriding_mt_mt(final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_any_mt(mt, forward.$const37$mtHasForwardPropagationOverrideMt, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 24600L)
    public static SubLObject inference_psc_override_mt(final SubLObject assertion, final SubLObject rule, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(propagation_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject single_instance_cols_for_rule = kb_mapping_utilities.pred_values_in_any_mt(rule, forward.$const38$ruleRestrictedToSingleInstancesOf, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.UNPROVIDED);
            final SubLObject assertion_terms = ConsesLow.append(cycl_utilities.expression_gather(assertions_high.assertion_cnf(assertion), (SubLObject)forward.$sym39$FORT_P, (SubLObject)forward.T, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED), cycl_utilities.expression_gather(assertions_high.assertion_mt(assertion), (SubLObject)forward.$sym39$FORT_P, (SubLObject)forward.T, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED));
            SubLObject restricted_propagation_mts = (SubLObject)forward.NIL;
            SubLObject cdolist_list_var = single_instance_cols_for_rule;
            SubLObject col = (SubLObject)forward.NIL;
            col = cdolist_list_var.first();
            while (forward.NIL != cdolist_list_var) {
                final SubLObject v_instances = list_utilities.fast_remove_duplicates(isa.all_instances_among(col, assertion_terms, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                if (forward.NIL != v_instances) {
                    if (forward.NIL != list_utilities.singletonP(v_instances)) {
                        final SubLObject instance = v_instances.first();
                        final SubLObject override_mts = kb_mapping_utilities.pred_values_in_any_mt(instance, forward.$const36$termForwardPropagationOverrideMt, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.UNPROVIDED);
                        if (forward.NIL == override_mts) {
                            if (forward.NIL != forward.$debug_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
                                Errors.warn((SubLObject)forward.$str40$Could_not_find_forward_inference_, instance, rule, assertion);
                            }
                        }
                        else if (forward.NIL != list_utilities.singletonP(override_mts)) {
                            final SubLObject item_var = override_mts.first();
                            if (forward.NIL == conses_high.member(item_var, restricted_propagation_mts, Symbols.symbol_function((SubLObject)forward.EQL), Symbols.symbol_function((SubLObject)forward.IDENTITY))) {
                                restricted_propagation_mts = (SubLObject)ConsesLow.cons(item_var, restricted_propagation_mts);
                            }
                        }
                        else {
                            if (forward.NIL != forward.$debug_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
                                Errors.warn((SubLObject)forward.$str41$More_than_one_override_mt_for__S_, instance, assertion, rule);
                            }
                            SubLObject cdolist_list_var_$13 = override_mts;
                            SubLObject override_mt = (SubLObject)forward.NIL;
                            override_mt = cdolist_list_var_$13.first();
                            while (forward.NIL != cdolist_list_var_$13) {
                                final SubLObject item_var2 = override_mt;
                                if (forward.NIL == conses_high.member(item_var2, restricted_propagation_mts, Symbols.symbol_function((SubLObject)forward.EQL), Symbols.symbol_function((SubLObject)forward.IDENTITY))) {
                                    restricted_propagation_mts = (SubLObject)ConsesLow.cons(item_var2, restricted_propagation_mts);
                                }
                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                override_mt = cdolist_list_var_$13.first();
                            }
                        }
                    }
                    else if (forward.NIL != forward.$debug_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
                        Errors.warn((SubLObject)forward.$str42$More_than_one_instance_of__S_in__, col, assertion, rule);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
            if (forward.NIL != restricted_propagation_mts) {
                if (forward.NIL != list_utilities.singletonP(restricted_propagation_mts)) {
                    result = restricted_propagation_mts.first();
                }
                else {
                    result = (SubLObject)ConsesLow.cons(forward.$const43$MtUnionFn, restricted_propagation_mts);
                }
            }
            if (forward.NIL != forward.$debug_forward_propagation_mt_overrideP$.getDynamicValue(thread) && forward.NIL != result) {
                Errors.warn((SubLObject)forward.$str44$inference_psc_override_mt___S, result);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (forward.NIL == result) {
            final SubLObject inference_psc_override_mt = inference_psc_overriding_mt_mt(assertions_high.assertion_mt(assertion));
            if (forward.NIL != fort_types_interface.microtheory_p(inference_psc_override_mt)) {
                result = inference_psc_override_mt;
            }
        }
        if (forward.NIL == result) {
            result = propagation_mt;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 26805L)
    public static SubLObject global_forward_propagation_mtP(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL != forward.$allow_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
            return (SubLObject)forward.T;
        }
        return kb_utilities.kbeq(forward.$const35$InferencePSC, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 27533L)
    public static SubLObject forward_inference_assertibles_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return forward.$forward_inference_assertibles_queue$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 27636L)
    public static SubLObject note_new_forward_assertible(final SubLObject hl_assertible) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        queues.enqueue(hl_assertible, forward.$forward_inference_assertibles_queue$.getDynamicValue(thread));
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 27820L)
    public static SubLObject forward_propagate_assertion(final SubLObject assertion, SubLObject propagation_mt) {
        if (propagation_mt == forward.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        if (forward.NIL == tms.tms_assertion_being_removedP(assertion) && forward.NIL == assertion_utilities.unknown_assertionP(assertion)) {
            return forward_propagate_assertion_int(assertion, propagation_mt, (SubLObject)forward.T);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 28754L)
    public static SubLObject forward_propagate_assertion_int(final SubLObject assertion, final SubLObject propagation_mt, final SubLObject modify_hlP) {
        if (forward.NIL != forward_propagation_permittedP(assertion, propagation_mt)) {
            return forward_propagate_support(assertion, propagation_mt, modify_hlP);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 28986L)
    public static SubLObject forward_propagation_permittedP(final SubLObject assertion, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread) && forward.NIL != assertions_high.valid_assertion(assertion, (SubLObject)forward.UNPROVIDED) && (forward.NIL == global_forward_propagation_mtP(propagation_mt) || forward.NIL != assertions_high.forward_assertionP(assertion))) {
            return (SubLObject)forward.T;
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 29284L)
    public static SubLObject forward_propagate_support(final SubLObject support, SubLObject propagation_mt, SubLObject modify_hlP) {
        if (propagation_mt == forward.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        if (modify_hlP == forward.UNPROVIDED) {
            modify_hlP = (SubLObject)forward.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject outermost_initP = Types.sublisp_null(inference_metrics.$forward_inference_last_metric_time$.getDynamicValue(thread));
        try {
            final SubLObject _prev_bind_0 = inference_metrics.$forward_inference_last_metric_time$.currentBinding(thread);
            try {
                inference_metrics.$forward_inference_last_metric_time$.bind((forward.NIL != outermost_initP) ? inference_metrics.initial_forward_inference_metric_time() : inference_metrics.$forward_inference_last_metric_time$.getDynamicValue(thread), thread);
                final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$14 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw46$FORWARD_PROPAGATE_SUPPORT, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.$kw48$NO_RULE, thread);
                    try {
                        SubLObject assertibles = (SubLObject)forward.NIL;
                        try {
                            add_currently_forward_propagating_support(support);
                            final SubLObject assertibles_queue = forward_propagate_support_generate_assertibles(support, propagation_mt);
                            assertibles = forward_propagate_support_handle_assertibles(assertibles_queue, support, modify_hlP);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                rem_currently_forward_propagating_support(support);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                        return assertibles;
                    }
                    finally {
                        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw46$FORWARD_PROPAGATE_SUPPORT, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.$kw48$NO_RULE, (SubLObject)forward.NIL);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                }
                finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$14, thread);
                }
            }
            finally {
                inference_metrics.$forward_inference_last_metric_time$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (forward.NIL == outermost_initP) {
                    inference_metrics.$forward_inference_last_metric_time$.setDynamicValue(inference_metrics.initial_forward_inference_metric_time(), thread);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 29831L)
    public static SubLObject forward_propagate_one_support_and_generate_assertibles(final SubLObject support, SubLObject propagation_mt) {
        if (propagation_mt == forward.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward.NIL != arguments.support_p(support) : support;
        final SubLObject outermost_initP = Types.sublisp_null(inference_metrics.$forward_inference_last_metric_time$.getDynamicValue(thread));
        try {
            final SubLObject _prev_bind_0 = inference_metrics.$forward_inference_last_metric_time$.currentBinding(thread);
            try {
                inference_metrics.$forward_inference_last_metric_time$.bind((forward.NIL != outermost_initP) ? inference_metrics.initial_forward_inference_metric_time() : inference_metrics.$forward_inference_last_metric_time$.getDynamicValue(thread), thread);
                final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$17 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw49$FORWARD_PROPAGATE_ONE_SUPPORT_AND_GENERATE_ASSERTIBLES, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.$kw48$NO_RULE, thread);
                    try {
                        SubLObject assertibles_queue = (SubLObject)forward.NIL;
                        try {
                            add_currently_forward_propagating_support(support);
                            final SubLObject environment = get_forward_inference_environment();
                            assert forward.NIL != queues.queue_p(environment) : environment;
                            final SubLObject _prev_bind_0_$18 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                assertibles_queue = forward_propagate_support_generate_assertibles(support, propagation_mt);
                            }
                            finally {
                                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                rem_currently_forward_propagating_support(support);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                        return assertibles_queue;
                    }
                    finally {
                        final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw49$FORWARD_PROPAGATE_ONE_SUPPORT_AND_GENERATE_ASSERTIBLES, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.$kw48$NO_RULE, (SubLObject)forward.NIL);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                }
                finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$17, thread);
                }
            }
            finally {
                inference_metrics.$forward_inference_last_metric_time$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (forward.NIL == outermost_initP) {
                    inference_metrics.$forward_inference_last_metric_time$.setDynamicValue(inference_metrics.initial_forward_inference_metric_time(), thread);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 30491L)
    public static SubLObject clear_forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached() {
        final SubLObject cs = forward.$forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$.getGlobalValue();
        if (forward.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 30491L)
    public static SubLObject remove_forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached(final SubLObject trigger_gaf, final SubLObject rule) {
        return memoization_state.caching_state_remove_function_results_with_args(forward.$forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(trigger_gaf, rule), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 30491L)
    public static SubLObject forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_internal(final SubLObject trigger_gaf, final SubLObject rule) {
        return forward_propagate_one_support_wrt_rule_and_generate_assertibles(trigger_gaf, rule, (SubLObject)forward.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 30491L)
    public static SubLObject forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached(final SubLObject trigger_gaf, final SubLObject rule) {
        SubLObject caching_state = forward.$forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$.getGlobalValue();
        if (forward.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)forward.$sym50$FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_C, (SubLObject)forward.$sym51$_FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_, (SubLObject)forward.$int52$32, (SubLObject)forward.EQL, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)forward.$sym53$CLEAR_FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTI);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(trigger_gaf, rule);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)forward.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)forward.NIL;
            collision = cdolist_list_var.first();
            while (forward.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (trigger_gaf.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (forward.NIL != cached_args && forward.NIL == cached_args.rest() && rule.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_internal(trigger_gaf, rule)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(trigger_gaf, rule));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 30897L)
    public static SubLObject forward_propagate_one_support_wrt_rule_and_generate_assertibles(final SubLObject support, final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == forward.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward.NIL != arguments.support_p(support) : support;
        assert forward.NIL != assertions_high.rule_assertionP(rule) : rule;
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_forbidden_rules$.bind((SubLObject)forward.$kw34$NONE, thread);
            kb_control_vars.$forward_inference_allowed_rules$.bind((SubLObject)ConsesLow.list(rule), thread);
            result = forward_propagate_one_support_and_generate_assertibles(support, propagation_mt);
        }
        finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_forbidden_rules$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 31468L)
    public static SubLObject forward_propagate_one_assertion_wrt_rules_and_queue_or_repropagate_assertibles(final SubLObject assertion, final SubLObject rules, SubLObject propagation_mt) {
        if (propagation_mt == forward.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertibles_queue = (SubLObject)forward.NIL;
        SubLObject new_assertions = (SubLObject)forward.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)forward.NIL, thread);
            control_vars.$prefer_forward_skolemization$.bind((SubLObject)forward.NIL, thread);
            final SubLObject environment = get_forward_inference_environment();
            assert forward.NIL != queues.queue_p(environment) : environment;
            final SubLObject _prev_bind_0_$21 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            final SubLObject _prev_bind_1_$22 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward.NIL, thread);
                try {
                    final SubLObject _prev_bind_0_$22 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$23 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_forbidden_rules$.bind((SubLObject)forward.$kw34$NONE, thread);
                        kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                        assertibles_queue = forward_propagate_support_generate_assertibles(assertion, propagation_mt);
                        new_assertions = forward_propagate_handle_batched_assertibles(assertibles_queue, (SubLObject)forward.T);
                        new_assertions = list_utilities.nadjoin_to_end(assertion, new_assertions, (SubLObject)forward.UNPROVIDED);
                    }
                    finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_1_$23, thread);
                        kb_control_vars.$forward_inference_forbidden_rules$.rebind(_prev_bind_0_$22, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        clear_current_forward_problem_store();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            }
            finally {
                utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_1_$22, thread);
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$21, thread);
            }
        }
        finally {
            control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        queue_or_repropagate_forward_assertions(new_assertions);
        return new_assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 32168L)
    public static SubLObject forward_propagate_supports_and_generate_assertibles(final SubLObject supports, SubLObject propagation_mt) {
        if (propagation_mt == forward.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward.NIL != list_utilities.non_dotted_list_p(supports) : supports;
        SubLObject cdolist_list_var = supports;
        SubLObject elem = (SubLObject)forward.NIL;
        elem = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            assert forward.NIL != arguments.support_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject all_assertibles_queue = queues.create_queue((SubLObject)forward.UNPROVIDED);
        final SubLObject environment = get_forward_inference_environment();
        assert forward.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            SubLObject cdolist_list_var2 = supports;
            SubLObject support = (SubLObject)forward.NIL;
            support = cdolist_list_var2.first();
            while (forward.NIL != cdolist_list_var2) {
                try {
                    add_currently_forward_propagating_support(support);
                    final SubLObject assertibles_queue = forward_propagate_support_generate_assertibles(support, propagation_mt);
                    SubLObject cdolist_list_var_$26 = queues.do_queue_elements_queue_elements(assertibles_queue);
                    SubLObject assertible = (SubLObject)forward.NIL;
                    assertible = cdolist_list_var_$26.first();
                    while (forward.NIL != cdolist_list_var_$26) {
                        queues.enqueue(assertible, all_assertibles_queue);
                        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                        assertible = cdolist_list_var_$26.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        rem_currently_forward_propagating_support(support);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                support = cdolist_list_var2.first();
            }
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return all_assertibles_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 32941L)
    public static SubLObject forward_propagate_support_generate_assertibles(final SubLObject support, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertibles_queue = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw55$FORWARD_PROPAGATE_SUPPORT_GENERATE_ASSERTIBLES, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                final SubLObject _prev_bind_0_$28 = utilities_macros.$noting_progress_delayed_mode_seconds$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = utilities_macros.$noting_progress_delayed_mode_string$.currentBinding(thread);
                try {
                    utilities_macros.$noting_progress_delayed_mode_seconds$.bind((SubLObject)((forward.NIL != forward.$forward_inference_traceP$.getDynamicValue(thread)) ? forward.NIL : forward.$int56$30), thread);
                    utilities_macros.$noting_progress_delayed_mode_string$.bind(PrintLow.format((SubLObject)forward.NIL, (SubLObject)forward.$str57$__Propagating__S_, el_utilities.sefify(support)), thread);
                    final SubLObject str = PrintLow.format((SubLObject)forward.NIL, (SubLObject)forward.$str57$__Propagating__S_, el_utilities.sefify(support));
                    final SubLObject _prev_bind_0_$29 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$30 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$32 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$33 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)forward.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)forward.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)forward.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)forward.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((forward.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : forward.T), thread);
                        utilities_macros.noting_progress_preamble(str);
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
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)forward.T, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$32 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$32 = forward.$forward_inference_assertibles_queue$.currentBinding(thread);
                                        try {
                                            kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)forward.T, thread);
                                            forward.$forward_inference_assertibles_queue$.bind(queues.create_queue((SubLObject)forward.UNPROVIDED), thread);
                                            if (forward.NIL != assertions_high.rule_assertionP(support)) {
                                                forward_propagate_rule(support, propagation_mt);
                                            }
                                            else {
                                                forward_propagate_asent_support(support, propagation_mt);
                                            }
                                            if (forward.NIL == queues.queue_empty_p(forward_inference_assertibles_queue()) && forward.NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread) && forward.NIL == control_vars.$prefer_forward_skolemization$.getDynamicValue(thread)) {
                                                clear_current_forward_problem_store();
                                            }
                                            assertibles_queue = forward.$forward_inference_assertibles_queue$.getDynamicValue(thread);
                                        }
                                        finally {
                                            forward.$forward_inference_assertibles_queue$.rebind(_prev_bind_1_$32, thread);
                                            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0_$32, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_$33, thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$31, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$31, thread);
                                }
                                inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                            }
                            finally {
                                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                }
                            }
                        }
                        finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$30, thread);
                        }
                        if (forward.NIL != forward.$forward_inference_traceP$.getDynamicValue(thread)) {
                            format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)forward.$str58$_____A_assertible__P, queues.queue_size(assertibles_queue), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$33, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$32, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$30, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$29, thread);
                    }
                }
                finally {
                    utilities_macros.$noting_progress_delayed_mode_string$.rebind(_prev_bind_1_$29, thread);
                    utilities_macros.$noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0_$28, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw55$FORWARD_PROPAGATE_SUPPORT_GENERATE_ASSERTIBLES, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return assertibles_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 34512L)
    public static SubLObject forward_propagate_handle_batched_assertibles(final SubLObject assertibles_queue, SubLObject return_new_assertionsP) {
        if (return_new_assertionsP == forward.UNPROVIDED) {
            return_new_assertionsP = (SubLObject)forward.NIL;
        }
        final SubLObject new_assertion_id_threshold = assertion_handles.next_assertion_id();
        final SubLObject result_assertions = set.new_set(Symbols.symbol_function((SubLObject)forward.EQ), (SubLObject)forward.UNPROVIDED);
        SubLObject deductions = (SubLObject)forward.NIL;
        SubLObject cdolist_list_var;
        deductions = (cdolist_list_var = forward_propagate_support_handle_assertibles(assertibles_queue, (SubLObject)forward.NIL, (SubLObject)forward.T));
        SubLObject deduction = (SubLObject)forward.NIL;
        deduction = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            final SubLObject assertion = deductions_high.deduction_supported_object(deduction);
            if (forward.NIL != assertion_handles.assertion_p(assertion) && (forward.NIL == return_new_assertionsP || assertion_handles.assertion_id(assertion).numGE(new_assertion_id_threshold))) {
                set.set_add(assertion, result_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        }
        return assertion_utilities.sort_assertions(set.set_element_list(result_assertions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 35385L)
    public static SubLObject forward_propagate_support_handle_assertibles(final SubLObject assertibles_queue, SubLObject support, SubLObject modify_hlP) {
        if (support == forward.UNPROVIDED) {
            support = (SubLObject)forward.NIL;
        }
        if (modify_hlP == forward.UNPROVIDED) {
            modify_hlP = (SubLObject)forward.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertibles = (SubLObject)forward.NIL;
        clear_current_forward_problem_store();
        final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = forward.$forward_inference_assertibles_queue$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)forward.T, thread);
            forward.$forward_inference_assertibles_queue$.bind(assertibles_queue, thread);
            utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward.NIL, thread);
            try {
                final SubLObject _prev_bind_0_$43 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$44 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
                try {
                    kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)forward.NIL, thread);
                    control_vars.$prefer_forward_skolemization$.bind((SubLObject)forward.NIL, thread);
                    final SubLObject store_var = get_forward_problem_store((SubLObject)forward.UNPROVIDED);
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
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)forward.T, thread);
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
                                    for (doneP = (SubLObject)forward.NIL, rest = (SubLObject)forward.NIL, rest = queues.do_queue_elements_queue_elements(forward_inference_assertibles_queue()); forward.NIL == doneP && forward.NIL != rest; rest = rest.rest()) {
                                        hl_assertible = rest.first();
                                        if (forward.NIL != assertions_high.invalid_assertionP(support, (SubLObject)forward.UNPROVIDED)) {
                                            Errors.warn((SubLObject)forward.$str59$Assertion__s_was_removed_by_its_o, assertion_handles.assertion_id(support));
                                            doneP = (SubLObject)forward.T;
                                        }
                                        else {
                                            hl_assertible_var = hl_assertible;
                                            argument_spec = hl_storage_modules.hl_assertible_argument_spec(hl_assertible_var);
                                            hl_assertion_spec_var = (hl_assertion_spec_var_$49 = hl_storage_modules.hl_assertible_hl_assertion_spec(hl_assertible_var));
                                            cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$49);
                                            mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$49);
                                            direction = hl_storage_modules.hl_assertion_spec_direction(hl_assertion_spec_var_$49);
                                            variable_map = hl_storage_modules.hl_assertion_spec_variable_map(hl_assertion_spec_var_$49);
                                            if (forward.NIL != list_utilities.tree_find_if((SubLObject)forward.$sym60$INVALID_ASSERTION_, argument_spec, (SubLObject)forward.UNPROVIDED)) {
                                                if (forward.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                                                    Errors.warn((SubLObject)forward.$str61$invalid_assertion_in_hl_assertibl, Mapping.mapcar((SubLObject)forward.$sym62$ASSERTION_ID, list_utilities.find_all_if((SubLObject)forward.$sym60$INVALID_ASSERTION_, argument_spec, (SubLObject)forward.UNPROVIDED)));
                                                }
                                            }
                                            else if (forward.NIL != list_utilities.tree_find_if((SubLObject)forward.$sym63$INVALID_KB_HL_SUPPORT_, argument_spec, (SubLObject)forward.UNPROVIDED)) {
                                                if (forward.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                                                    Errors.warn((SubLObject)forward.$str64$invalid_kb_hl_support_in_hl_asser, Mapping.mapcar((SubLObject)forward.$sym65$KB_HL_SUPPORT_ID, list_utilities.find_all_if((SubLObject)forward.$sym63$INVALID_KB_HL_SUPPORT_, argument_spec, (SubLObject)forward.UNPROVIDED)));
                                                }
                                            }
                                            else {
                                                last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                                                last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                                                last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                                                last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                                                if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
                                                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
                                                }
                                                _prev_bind_0_$46 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                                                _prev_bind_1_$46 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                                                _prev_bind_2_$49 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                                                _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                                                try {
                                                    hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                                                    hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw66$HL_ADD_ASSERTIBLE, thread);
                                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
                                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                                                    try {
                                                        _prev_bind_0_$47 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
                                                        try {
                                                            kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)forward.NIL, thread);
                                                            if (forward.NIL != modify_hlP) {
                                                                var = hl_storage_modules.hl_add_assertible(hl_assertible);
                                                                if (forward.NIL != var) {
                                                                    assertibles = (SubLObject)ConsesLow.cons(var, assertibles);
                                                                }
                                                            }
                                                            else {
                                                                assertibles = (SubLObject)ConsesLow.cons(hl_assertible, assertibles);
                                                            }
                                                        }
                                                        finally {
                                                            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0_$47, thread);
                                                        }
                                                    }
                                                    finally {
                                                        _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                                            _values = Values.getValuesAsVector();
                                                            inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw66$HL_ADD_ASSERTIBLE, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$49, thread);
                                                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$46, thread);
                                                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$46, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_$48, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$45, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$45, thread);
                            }
                            inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$44, thread);
                    }
                }
                finally {
                    control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_1_$44, thread);
                    kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0_$43, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    clear_current_forward_problem_store();
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                }
            }
        }
        finally {
            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_3, thread);
            forward.$forward_inference_assertibles_queue$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(assertibles);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 37520L)
    public static SubLObject forward_propagate_rule(final SubLObject rule, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = forward.$forward_inference_rule$.currentBinding(thread);
        try {
            forward.$forward_inference_rule$.bind(rule, thread);
            final SubLObject rule_cnf = assertions_high.assertion_cnf(rule);
            final SubLObject pragmatic_dnf = inference_worker_transformation.forward_rule_pragmatic_dnf(rule, propagation_mt);
            handle_forward_propagation(rule_cnf, pragmatic_dnf, propagation_mt, (SubLObject)forward.NIL, rule, (SubLObject)forward.NIL);
        }
        finally {
            forward.$forward_inference_rule$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 37974L)
    public static SubLObject support_truth_sense(final SubLObject support) {
        return enumeration_types.truth_sense(arguments.support_truth(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 38208L)
    public static SubLObject support_asent(final SubLObject support) {
        if (forward.NIL != arguments.hl_support_p(support)) {
            return arguments.hl_support_sentence(support);
        }
        if (forward.NIL != assertions_high.gaf_assertionP(support)) {
            return assertions_high.gaf_formula(support);
        }
        return Errors.error((SubLObject)forward.$str67$_S_does_not_have_an_atomic_senten, support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 38493L)
    public static SubLObject forward_propagate_asent_support(final SubLObject source_support, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = forward.$forward_inference_gaf$.currentBinding(thread);
        try {
            forward.$forward_inference_gaf$.bind(source_support, thread);
            SubLObject forward_tactic_specs = (SubLObject)forward.NIL;
            SubLObject cdolist_list_var;
            forward_tactic_specs = (cdolist_list_var = forward_propagate_asent_tactic_specs(source_support, propagation_mt));
            SubLObject forward_tactic_spec = (SubLObject)forward.NIL;
            forward_tactic_spec = cdolist_list_var.first();
            while (forward.NIL != cdolist_list_var) {
                forward_propagate_one_tactic_spec(source_support, forward_tactic_spec, propagation_mt);
                cdolist_list_var = cdolist_list_var.rest();
                forward_tactic_spec = cdolist_list_var.first();
            }
        }
        finally {
            forward.$forward_inference_gaf$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 38981L)
    public static SubLObject forward_propagate_asent_tactic_specs(final SubLObject source_support, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source_sense = support_truth_sense(source_support);
        SubLObject tactic_specs = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw68$FORWARD_TACTIC_SPECS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw69$OVERHEAD, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.$kw48$NO_RULE, thread);
            try {
                if (forward.$kw70$POS == source_sense || forward.NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread)) {
                    final SubLObject source_asent = conses_high.copy_tree(support_asent(source_support));
                    final SubLObject _prev_bind_0_$58 = kb_control_vars.$relax_type_restrictions_for_nats$.currentBinding(thread);
                    try {
                        kb_control_vars.$relax_type_restrictions_for_nats$.bind((SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != kb_control_vars.$relax_type_restrictions_for_nats$.getDynamicValue(thread) || forward.NIL != el_utilities.tou_asentP(source_asent)), thread);
                        tactic_specs = forward_modules.forward_tactic_specs(source_asent, source_sense, propagation_mt);
                    }
                    finally {
                        kb_control_vars.$relax_type_restrictions_for_nats$.rebind(_prev_bind_0_$58, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw68$FORWARD_TACTIC_SPECS, (SubLObject)forward.$kw69$OVERHEAD, (SubLObject)forward.NIL, (SubLObject)forward.$kw48$NO_RULE, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return tactic_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 39640L)
    public static SubLObject forward_propagate_one_tactic_spec(final SubLObject source_gaf_assertion, final SubLObject forward_tactic_spec, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trigger_asent = (SubLObject)forward.NIL;
        SubLObject trigger_sense = (SubLObject)forward.NIL;
        SubLObject examine_asent = (SubLObject)forward.NIL;
        SubLObject trigger_support = (SubLObject)forward.NIL;
        SubLObject rule = (SubLObject)forward.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(forward_tactic_spec, forward_tactic_spec, (SubLObject)forward.$list71);
        trigger_asent = forward_tactic_spec.first();
        SubLObject current = forward_tactic_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, forward_tactic_spec, (SubLObject)forward.$list71);
        trigger_sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, forward_tactic_spec, (SubLObject)forward.$list71);
        examine_asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, forward_tactic_spec, (SubLObject)forward.$list71);
        trigger_support = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, forward_tactic_spec, (SubLObject)forward.$list71);
        rule = current.first();
        current = current.rest();
        final SubLObject additional_supports = (SubLObject)(current.isCons() ? current.first() : forward.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, forward_tactic_spec, (SubLObject)forward.$list71);
        current = current.rest();
        if (forward.NIL == current) {
            final SubLObject examine_sense = enumeration_types.inverse_sense(trigger_sense);
            if (forward.$kw72$NEG == examine_sense || forward.NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread)) {
                if (forward.NIL == arguments.support_p(trigger_support)) {
                    trigger_support = source_gaf_assertion;
                }
                final SubLObject trigger_supports = make_forward_trigger_supports(trigger_support, additional_supports);
                forward_propagate_gaf_internal(trigger_asent, examine_asent, examine_sense, propagation_mt, rule, trigger_supports);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(forward_tactic_spec, (SubLObject)forward.$list71);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 40396L)
    public static SubLObject make_forward_trigger_supports(final SubLObject source_gaf_assertion, final SubLObject additional_supports) {
        SubLObject trigger_supports = conses_high.copy_list(additional_supports);
        if (forward.NIL != source_gaf_assertion) {
            trigger_supports = (SubLObject)ConsesLow.cons(source_gaf_assertion, trigger_supports);
        }
        return trigger_supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 40778L)
    public static SubLObject forward_inference_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread).isList() ? list_utilities.find_all_if((SubLObject)forward.$sym73$VALID_ASSERTION_, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread), (SubLObject)forward.UNPROVIDED) : kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 41108L)
    public static SubLObject forward_inference_all_rules_allowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread), (SubLObject)forward.$kw74$ALL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 41220L)
    public static SubLObject forward_inference_rule_allowedP(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != forward_inference_all_rules_allowedP() || forward.NIL != ((forward.NIL != set.set_p(kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread))) ? set.set_memberP(rule, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread)) : list_utilities.member_kbeqP(rule, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 41499L)
    public static SubLObject forward_inference_forbidden_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread).isList() ? list_utilities.find_all_if((SubLObject)forward.$sym73$VALID_ASSERTION_, kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread), (SubLObject)forward.UNPROVIDED) : kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 41825L)
    public static SubLObject forward_inference_no_rules_forbiddenP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread), (SubLObject)forward.$kw34$NONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 41941L)
    public static SubLObject forward_inference_rule_forbiddenP(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL == forward_inference_no_rules_forbiddenP() && forward.NIL != ((forward.NIL != set.set_p(kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread))) ? set.set_memberP(rule, kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread)) : list_utilities.member_kbeqP(rule, kb_control_vars.$forward_inference_forbidden_rules$.getDynamicValue(thread))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 42240L)
    public static SubLObject forward_propagate_gaf_internal(SubLObject trigger_asent, SubLObject examine_asent, final SubLObject examine_sense, SubLObject propagation_mt, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fast_failP = (SubLObject)forward.NIL;
        SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw75$FORWARD_INFERENCE_RULE_ALLOWED_, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                if (forward.NIL == forward_inference_rule_allowedP(rule)) {
                    fast_failP = (SubLObject)forward.T;
                }
            }
            finally {
                final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw75$FORWARD_INFERENCE_RULE_ALLOWED_, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        if (forward.NIL == fast_failP) {
            last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
            }
            _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw76$FORWARD_INFERENCE_RULE_FORBIDDEN_, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                try {
                    if (forward.NIL != forward_inference_rule_forbiddenP(rule)) {
                        fast_failP = (SubLObject)forward.T;
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw76$FORWARD_INFERENCE_RULE_FORBIDDEN_, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                    }
                }
            }
            finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
        }
        if (forward.NIL != fast_failP) {
            return (SubLObject)forward.NIL;
        }
        final SubLObject _prev_bind_5 = forward.$forward_inference_rule$.currentBinding(thread);
        try {
            forward.$forward_inference_rule$.bind(rule, thread);
            last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
            }
            final SubLObject _prev_bind_0_$62 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw77$FORWARD_PROPAGATE_GAF_INTERNAL, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                try {
                    if (forward.NIL != forward.$allow_forward_propagation_mt_overrideP$.getDynamicValue(thread)) {
                        propagation_mt = inference_psc_override_mt(current_forward_inference_gaf(), current_forward_inference_rule(), propagation_mt);
                    }
                    final SubLObject cnf = assertions_high.assertion_cnf(rule);
                    final SubLObject pos_lits = clauses.pos_lits(cnf);
                    final SubLObject neg_lits = clauses.neg_lits(cnf);
                    final SubLObject examine_lits = (forward.$kw70$POS == examine_sense) ? pos_lits : neg_lits;
                    final SubLObject other_lits = (forward.$kw70$POS == examine_sense) ? neg_lits : pos_lits;
                    final SubLObject pragmatic_dnf = inference_worker_transformation.forward_rule_pragmatic_dnf(rule, propagation_mt);
                    final SubLObject last_metric_type_$63 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                    final SubLObject last_metric_$64 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                    final SubLObject last_gaf_$65 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                    final SubLObject last_rule_$66 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                    if (forward.NIL != last_metric_type_$63 && forward.NIL != last_metric_$64) {
                        inference_metrics.increment_forward_inference_metrics(last_metric_type_$63, last_metric_$64, last_gaf_$65, last_rule_$66, (SubLObject)forward.ZERO_INTEGER);
                    }
                    final SubLObject _prev_bind_0_$63 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$68 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$69 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$70 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                    try {
                        hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                        hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw78$POSSIBLY_SIMPLIFY_IST_SENTENCES_FOR_UNIFY, thread);
                        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
                        hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                        try {
                            thread.resetMultipleValues();
                            final SubLObject trigger_asent_$71 = removal_modules_ist.possibly_simplify_ist_sentences_for_unify(trigger_asent, examine_asent);
                            final SubLObject examine_asent_$72 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            trigger_asent = trigger_asent_$71;
                            examine_asent = examine_asent_$72;
                        }
                        finally {
                            final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw78$POSSIBLY_SIMPLIFY_IST_SENTENCES_FOR_UNIFY, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                            }
                        }
                    }
                    finally {
                        hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_3_$70, thread);
                        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$69, thread);
                        hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$68, thread);
                        hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$63, thread);
                    }
                    if (cycl_utilities.atomic_sentence_predicate(trigger_asent).equal(cycl_utilities.atomic_sentence_predicate(examine_asent)) || (forward.NIL != auxiliary_indexing.unbound_predicate_literal(examine_asent) && forward.NIL != el_utilities.compatible_formula_arity_p(examine_asent, trigger_asent))) {
                        SubLObject trigger_bindings = (SubLObject)forward.NIL;
                        SubLObject gaf_asent = (SubLObject)forward.NIL;
                        SubLObject unify_justification = (SubLObject)forward.NIL;
                        final SubLObject last_metric_type_$64 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                        final SubLObject last_metric_$65 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                        final SubLObject last_gaf_$66 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                        final SubLObject last_rule_$67 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                        if (forward.NIL != last_metric_type_$64 && forward.NIL != last_metric_$65) {
                            inference_metrics.increment_forward_inference_metrics(last_metric_type_$64, last_metric_$65, last_gaf_$66, last_rule_$67, (SubLObject)forward.ZERO_INTEGER);
                        }
                        final SubLObject _prev_bind_0_$65 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$69 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$70 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$71 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                        try {
                            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw79$GAF_ASENT_UNIFY, thread);
                            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
                            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                            try {
                                thread.resetMultipleValues();
                                final SubLObject trigger_bindings_$82 = unification_utilities.gaf_asent_unify(trigger_asent, examine_asent, (SubLObject)forward.T, (SubLObject)forward.T);
                                final SubLObject gaf_asent_$83 = thread.secondMultipleValue();
                                final SubLObject unify_justification_$84 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                trigger_bindings = trigger_bindings_$82;
                                gaf_asent = gaf_asent_$83;
                                unify_justification = unify_justification_$84;
                            }
                            finally {
                                final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw79$GAF_ASENT_UNIFY, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                }
                            }
                        }
                        finally {
                            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_3_$71, thread);
                            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$70, thread);
                            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$69, thread);
                            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$65, thread);
                        }
                        if (forward.NIL != trigger_bindings) {
                            SubLObject remainder_neg_lits = (SubLObject)forward.NIL;
                            SubLObject remainder_pos_lits = (SubLObject)forward.NIL;
                            if (forward.$kw70$POS == examine_sense) {
                                remainder_neg_lits = other_lits;
                                remainder_pos_lits = Sequences.remove(examine_asent, examine_lits, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                            }
                            else {
                                remainder_neg_lits = Sequences.remove(examine_asent, examine_lits, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                                remainder_pos_lits = other_lits;
                            }
                            handle_forward_propagation_from_gaf(examine_asent, remainder_neg_lits, remainder_pos_lits, pragmatic_dnf, propagation_mt, trigger_bindings, rule, ConsesLow.append(trigger_supports, unify_justification));
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                        final SubLObject _values5 = Values.getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw77$FORWARD_PROPAGATE_GAF_INTERNAL, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                        Values.restoreValuesFromVector(_values5);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                    }
                }
            }
            finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$62, thread);
            }
        }
        finally {
            forward.$forward_inference_rule$.rebind(_prev_bind_5, thread);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 45125L)
    public static SubLObject handle_forward_propagation_from_gaf(final SubLObject examine_asent, final SubLObject remainder_neg_lits, final SubLObject remainder_pos_lits, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw80$HANDLE_FORWARD_PROPAGATION_FROM_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                final SubLObject restricted_remainder_neg_lits = bindings.apply_bindings(trigger_bindings, remainder_neg_lits);
                final SubLObject restricted_remainder_pos_lits = bindings.apply_bindings(trigger_bindings, remainder_pos_lits);
                final SubLObject restricted_rule_remainder_cnf = clauses.make_cnf(restricted_remainder_neg_lits, restricted_remainder_pos_lits);
                final SubLObject restricted_pragmatic_dnf = bindings.apply_bindings(trigger_bindings, pragmatic_dnf);
                final SubLObject _prev_bind_0_$87 = forward.$forward_non_trigger_literal_restricted_examine_asent$.currentBinding(thread);
                try {
                    forward.$forward_non_trigger_literal_restricted_examine_asent$.bind(bindings.apply_bindings(trigger_bindings, examine_asent), thread);
                    handle_forward_propagation(restricted_rule_remainder_cnf, restricted_pragmatic_dnf, propagation_mt, trigger_bindings, rule, trigger_supports);
                }
                finally {
                    forward.$forward_non_trigger_literal_restricted_examine_asent$.rebind(_prev_bind_0_$87, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw80$HANDLE_FORWARD_PROPAGATION_FROM_GAF, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 46884L)
    public static SubLObject creation_template_forward_rules_via_exemplars(final SubLObject creation_template) {
        final SubLObject exemplars = creation_template_exemplars(creation_template);
        return assertion_utilities.all_forward_rules_relevant_to_terms(exemplars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 47345L)
    public static SubLObject creation_template_exemplars(final SubLObject creation_template) {
        return kb_mapping_utilities.pred_values_in_any_mt(creation_template, forward.$const81$creationTemplateFORTs, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.$kw82$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 47589L)
    public static SubLObject creation_template_allowable_rules(final SubLObject creation_template) {
        final SubLObject rule_set = set.new_set(Symbols.symbol_function((SubLObject)forward.EQ), (SubLObject)forward.UNPROVIDED);
        SubLObject cdolist_list_var = all_genl_creation_templates(creation_template);
        SubLObject template = (SubLObject)forward.NIL;
        template = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$89 = creation_template_allowable_rules_internal(template);
            SubLObject rule = (SubLObject)forward.NIL;
            rule = cdolist_list_var_$89.first();
            while (forward.NIL != cdolist_list_var_$89) {
                set.set_add(rule, rule_set);
                cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                rule = cdolist_list_var_$89.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        return rule_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 47891L)
    public static SubLObject all_genl_creation_templates(final SubLObject creation_template) {
        return backward.removal_ask_variable((SubLObject)forward.$sym83$_TEMPLATE, (SubLObject)ConsesLow.listS(forward.$const84$genlCreationTemplate, creation_template, (SubLObject)forward.$list85), forward.$const86$EverythingPSC, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 48086L)
    public static SubLObject creation_template_allowable_rules_internal(final SubLObject creation_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = kb_mapping_utilities.pred_values_in_any_mt(creation_template, forward.$const87$creationTemplateAllowableRules, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.$kw82$TRUE);
        SubLObject cdolist_list_var;
        final SubLObject mts = cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(creation_template, forward.$const88$creationTemplateAllowsAllRulesFro, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.$kw82$TRUE);
        SubLObject mt = (SubLObject)forward.NIL;
        mt = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql((SubLObject)forward.$kw89$MT)) {
                if (forward.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)forward.$kw90$RULE)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = (SubLObject)forward.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward.$kw90$RULE, (SubLObject)forward.$kw82$TRUE, (SubLObject)forward.NIL);
                        SubLObject done_var = (SubLObject)forward.NIL;
                        final SubLObject token_var = (SubLObject)forward.NIL;
                        while (forward.NIL == done_var) {
                            final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(rule));
                            if (forward.NIL != valid && forward.NIL != assertions_high.forward_assertionP(rule)) {
                                final SubLObject item_var = rule;
                                if (forward.NIL == conses_high.member(item_var, rules, Symbols.symbol_function((SubLObject)forward.EQL), Symbols.symbol_function((SubLObject)forward.IDENTITY))) {
                                    rules = (SubLObject)ConsesLow.cons(item_var, rules);
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL == valid);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (forward.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)forward.$kw91$BROAD_MT) && forward.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)forward.$kw90$RULE)) {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = (SubLObject)forward.$str92$do_broad_mt_index;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)forward.ZERO_INTEGER;
                assert forward.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)forward.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)forward.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)forward.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$90 = idx;
                        if (forward.NIL == id_index.id_index_objects_empty_p(idx_$90, (SubLObject)forward.$kw94$SKIP)) {
                            final SubLObject idx_$91 = idx_$90;
                            if (forward.NIL == id_index.id_index_dense_objects_empty_p(idx_$91, (SubLObject)forward.$kw94$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$91);
                                final SubLObject backwardP_var = (SubLObject)forward.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject rule2;
                                SubLObject item_var2;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)forward.NIL, v_iteration = (SubLObject)forward.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)forward.ONE_INTEGER)) {
                                    a_id = ((forward.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)forward.ONE_INTEGER) : v_iteration);
                                    a_handle = Vectors.aref(vector_var, a_id);
                                    if (forward.NIL == id_index.id_index_tombstone_p(a_handle) || forward.NIL == id_index.id_index_skip_tombstones_p((SubLObject)forward.$kw94$SKIP)) {
                                        if (forward.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                            a_handle = (SubLObject)forward.$kw94$SKIP;
                                        }
                                        rule2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (forward.NIL != kb_mapping_macros.do_broad_mt_index_match_p(rule2, mt, (SubLObject)forward.$kw90$RULE, (SubLObject)forward.$kw82$TRUE) && forward.NIL != assertions_high.forward_assertionP(rule2)) {
                                            item_var2 = rule2;
                                            if (forward.NIL == conses_high.member(item_var2, rules, Symbols.symbol_function((SubLObject)forward.EQL), Symbols.symbol_function((SubLObject)forward.IDENTITY))) {
                                                rules = (SubLObject)ConsesLow.cons(item_var2, rules);
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)forward.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$92 = idx_$90;
                            if (forward.NIL == id_index.id_index_sparse_objects_empty_p(idx_$92) || forward.NIL == id_index.id_index_skip_tombstones_p((SubLObject)forward.$kw94$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$92);
                                SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$92);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$92);
                                final SubLObject v_default = (SubLObject)((forward.NIL != id_index.id_index_skip_tombstones_p((SubLObject)forward.$kw94$SKIP)) ? forward.NIL : forward.$kw94$SKIP);
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                    if (forward.NIL == id_index.id_index_skip_tombstones_p((SubLObject)forward.$kw94$SKIP) || forward.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                        final SubLObject rule3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (forward.NIL != kb_mapping_macros.do_broad_mt_index_match_p(rule3, mt, (SubLObject)forward.$kw90$RULE, (SubLObject)forward.$kw82$TRUE) && forward.NIL != assertions_high.forward_assertionP(rule3)) {
                                            final SubLObject item_var3 = rule3;
                                            if (forward.NIL == conses_high.member(item_var3, rules, Symbols.symbol_function((SubLObject)forward.EQL), Symbols.symbol_function((SubLObject)forward.IDENTITY))) {
                                                rules = (SubLObject)ConsesLow.cons(item_var3, rules);
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)forward.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    a_id2 = Numbers.add(a_id2, (SubLObject)forward.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 48544L)
    public static SubLObject handle_forward_propagation(final SubLObject rule_remainder_cnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject failureP = forward_propagation_supports_doomedP(rule, trigger_supports);
        if (forward.NIL != failureP) {
            if (forward.NIL != call_forward_inference_browsing_callbackP()) {
                call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, trigger_supports, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, ConsesLow.list((SubLObject)forward.$kw3$TYPE, (SubLObject)forward.$kw99$FORWARD_PROPAGATION_SUPPORTS_DOOMED, (SubLObject)forward.$kw100$SUPPORT_MTS, list_utilities.fast_remove_duplicates(Sequences.remove(forward.$const35$InferencePSC, (SubLObject)ConsesLow.cons(assertions_high.assertion_mt(rule), Mapping.mapcar((SubLObject)forward.$sym101$SUPPORT_MT, trigger_supports)), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED)) }));
            }
            return (SubLObject)forward.NIL;
        }
        final SubLObject rule_remainder_neg_lits = clauses.neg_lits(rule_remainder_cnf);
        SubLObject cdolist_list_var;
        final SubLObject rule_remainder_pos_lits = cdolist_list_var = clauses.pos_lits(rule_remainder_cnf);
        SubLObject target_asent = (SubLObject)forward.NIL;
        target_asent = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            final SubLObject other_pos_lits = Sequences.remove(target_asent, rule_remainder_pos_lits, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
            final SubLObject query_dnf = clauses.make_dnf(other_pos_lits, rule_remainder_neg_lits);
            handle_one_forward_propagation(query_dnf, pragmatic_dnf, propagation_mt, target_asent, (SubLObject)forward.$kw82$TRUE, trigger_bindings, rule, trigger_supports);
            cdolist_list_var = cdolist_list_var.rest();
            target_asent = cdolist_list_var.first();
        }
        if (forward.NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue(thread)) {
            cdolist_list_var = rule_remainder_neg_lits;
            target_asent = (SubLObject)forward.NIL;
            target_asent = cdolist_list_var.first();
            while (forward.NIL != cdolist_list_var) {
                final SubLObject other_neg_lits = Sequences.remove(target_asent, rule_remainder_neg_lits, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                final SubLObject query_dnf = clauses.make_dnf(rule_remainder_pos_lits, other_neg_lits);
                handle_one_forward_propagation(query_dnf, pragmatic_dnf, propagation_mt, target_asent, (SubLObject)forward.$kw102$FALSE, trigger_bindings, rule, trigger_supports);
                cdolist_list_var = cdolist_list_var.rest();
                target_asent = cdolist_list_var.first();
            }
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 51046L)
    public static SubLObject handle_one_forward_propagation(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject target_asent, final SubLObject target_truth, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL != forward.$handle_one_forward_propagation_callback$.getDynamicValue(thread)) {
            return Functions.funcall(forward.$handle_one_forward_propagation_callback$.getDynamicValue(thread), new SubLObject[] { query_dnf, pragmatic_dnf, propagation_mt, target_asent, target_truth, trigger_bindings, rule, trigger_supports });
        }
        SubLObject catch_var = (SubLObject)forward.NIL;
        try {
            thread.throwStack.push(forward.$kw103$INFERENCE_REJECTED);
            if (forward.NIL != clauses.empty_clauseP(query_dnf) && forward.NIL != clauses.empty_clauseP(pragmatic_dnf)) {
                final SubLObject query_time = (SubLObject)forward.ZERO_INTEGER;
                final SubLObject inference = (SubLObject)forward.NIL;
                inference_metrics.increment_forward_inference_historical_count();
                inference_metrics.note_forward_inference_for_rule(rule, inference);
                inference_metrics.increment_successful_forward_inference_historical_count();
                add_empty_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports);
                return (SubLObject)forward.NIL;
            }
            SubLObject failureP = (SubLObject)forward.NIL;
            SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
            }
            SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw104$SYNTACTICALLY_INVALID_FORWARD_DNF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                try {
                    failureP = (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL == syntactically_valid_forward_dnf(query_dnf, pragmatic_dnf, propagation_mt, (SubLObject)forward.UNPROVIDED));
                    if (forward.NIL != failureP && forward.NIL != call_forward_inference_browsing_callbackP()) {
                        call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, target_asent, forward.$kw106$TARGET_TRUTH, target_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, trigger_supports, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)forward.ONE_INTEGER), syntactically_valid_forward_dnf(query_dnf, pragmatic_dnf, propagation_mt, (SubLObject)forward.T)) }));
                    }
                    if (forward.NIL != failureP) {
                        return (SubLObject)forward.NIL;
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw104$SYNTACTICALLY_INVALID_FORWARD_DNF, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                    }
                }
            }
            finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
            failureP = (SubLObject)forward.NIL;
            last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
            }
            _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw107$SEMANTICALLY_INVALID_FORWARD_DNF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                try {
                    failureP = (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL == semantically_valid_forward_dnf(query_dnf, pragmatic_dnf, propagation_mt, (SubLObject)forward.UNPROVIDED));
                    if (forward.NIL != failureP && forward.NIL != call_forward_inference_browsing_callbackP()) {
                        call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, target_asent, forward.$kw106$TARGET_TRUTH, target_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, trigger_supports, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)forward.ONE_INTEGER), semantically_valid_forward_dnf(query_dnf, pragmatic_dnf, propagation_mt, (SubLObject)forward.T)) }));
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw107$SEMANTICALLY_INVALID_FORWARD_DNF, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                    }
                }
            }
            finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
            if (forward.NIL != failureP) {
                return (SubLObject)forward.NIL;
            }
            failureP = (SubLObject)forward.NIL;
            last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
            }
            _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw108$NULL_MAX_FLOOR_MTS_OF_RULE_AND_GAF_MTS, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                try {
                    failureP = (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != forward.$check_forward_propagate_doomed_due_to_null_max_floor_mtsP$.getDynamicValue(thread) && forward.NIL != forward_propagate_doomed_due_to_null_max_floor_mtsP(rule, current_forward_inference_gaf(), trigger_supports));
                    if (forward.NIL != failureP && forward.NIL != call_forward_inference_browsing_callbackP()) {
                        call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, target_asent, forward.$kw106$TARGET_TRUTH, target_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, trigger_supports, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, ConsesLow.list((SubLObject)forward.$kw3$TYPE, (SubLObject)forward.$kw108$NULL_MAX_FLOOR_MTS_OF_RULE_AND_GAF_MTS, (SubLObject)forward.$kw109$RULE_MT, assertions_high.assertion_mt(rule), (SubLObject)forward.$kw110$GAF_MT, arguments.support_mt(current_forward_inference_gaf())) }));
                    }
                    if (forward.NIL != failureP) {
                        return (SubLObject)forward.NIL;
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$96 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw108$NULL_MAX_FLOOR_MTS_OF_RULE_AND_GAF_MTS, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                    }
                }
            }
            finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
            final SubLObject filtered_pragmatic_dnf = filter_forward_pragmatic_dnf(pragmatic_dnf);
            forward_propagate_dnf(query_dnf, filtered_pragmatic_dnf, propagation_mt, target_asent, target_truth, trigger_bindings, rule, trigger_supports);
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)forward.$kw103$INFERENCE_REJECTED);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 55570L)
    public static SubLObject forward_propagate_doomed_due_to_null_max_floor_mtsP(final SubLObject rule, final SubLObject gaf, SubLObject trigger_supports) {
        if (trigger_supports == forward.UNPROVIDED) {
            trigger_supports = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL == rule || forward.NIL == gaf) {
            return (SubLObject)forward.NIL;
        }
        if (forward.NIL != assertion_utilities.universal_lifting_ruleP(rule)) {
            return (SubLObject)forward.NIL;
        }
        SubLObject ist_antecedent_lit_propagationP = (SubLObject)forward.NIL;
        if (forward.NIL == ist_antecedent_lit_propagationP) {
            SubLObject csome_list_var = trigger_supports;
            SubLObject trigger_support = (SubLObject)forward.NIL;
            trigger_support = csome_list_var.first();
            while (forward.NIL == ist_antecedent_lit_propagationP && forward.NIL != csome_list_var) {
                if (forward.NIL != arguments.hl_support_p(trigger_support) && forward.$kw111$QUERY == arguments.hl_support_module(trigger_support)) {
                    ist_antecedent_lit_propagationP = (SubLObject)forward.T;
                }
                if (forward.NIL != ist_antecedent_lit_propagationP) {
                    return (SubLObject)forward.NIL;
                }
                csome_list_var = csome_list_var.rest();
                trigger_support = csome_list_var.first();
            }
        }
        final SubLObject gaf_mt = arguments.support_mt(current_forward_inference_gaf());
        final SubLObject rule_mt = arguments.support_mt(rule);
        final SubLObject _prev_bind_0 = genl_mts.$suppress_max_floor_mts_explosion_warning$.currentBinding(thread);
        try {
            genl_mts.$suppress_max_floor_mts_explosion_warning$.bind((SubLObject)forward.T, thread);
            if (forward.NIL != mt_vars.core_microtheory_p(gaf_mt) || forward.NIL != mt_vars.core_microtheory_p(rule_mt) || forward.NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(rule_mt) || forward.NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(gaf_mt)) {
                return (SubLObject)forward.NIL;
            }
            final SubLObject gaf_mt_monad = hlmt.hlmt_monad_mt(gaf_mt);
            final SubLObject rule_mt_monad = hlmt.hlmt_monad_mt(rule_mt);
            if (forward.NIL == genl_mts.asserted_spec_mtsP(gaf_mt_monad, (SubLObject)forward.UNPROVIDED) && forward.NIL == mt_relevance_cache.basemtP(rule_mt_monad, gaf_mt_monad)) {
                return (SubLObject)forward.NIL;
            }
            final SubLObject _prev_bind_0_$97 = forward.$forward_leafy_mt_threshold$.currentBinding(thread);
            try {
                forward.$forward_leafy_mt_threshold$.bind((SubLObject)forward.SEVENTEEN_INTEGER, thread);
                if (forward.NIL != forward_propagation_mts_doomedP((SubLObject)ConsesLow.list(gaf_mt_monad, rule_mt_monad))) {
                    return (SubLObject)forward.T;
                }
            }
            finally {
                forward.$forward_leafy_mt_threshold$.rebind(_prev_bind_0_$97, thread);
            }
        }
        finally {
            genl_mts.$suppress_max_floor_mts_explosion_warning$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 57098L)
    public static SubLObject filter_forward_pragmatic_dnf(final SubLObject pragmatic_dnf) {
        final SubLObject pos_lits = clauses.pos_lits(pragmatic_dnf);
        if (forward.NIL == Sequences.find_if((SubLObject)forward.$sym112$FORWARD_PRAGMATIC_TRIGGER_LITERAL_LIT_, pos_lits, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED)) {
            return pragmatic_dnf;
        }
        final SubLObject new_pos_lits = Sequences.remove_if((SubLObject)forward.$sym112$FORWARD_PRAGMATIC_TRIGGER_LITERAL_LIT_, pos_lits, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
        return clauses.make_dnf(clauses.neg_lits(pragmatic_dnf), new_pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 57688L)
    public static SubLObject forward_propagate_dnf(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject target_asent, final SubLObject target_truth, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw114$FORWARD_PROPAGATE_DNF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                SubLObject forward_results = (SubLObject)forward.NIL;
                SubLObject inference = (SubLObject)forward.NIL;
                SubLObject query_time = (SubLObject)forward.NIL;
                SubLObject halt_reason = (SubLObject)forward.NIL;
                thread.resetMultipleValues();
                final SubLObject forward_results_$98 = new_forward_query_from_dnf(query_dnf, pragmatic_dnf, propagation_mt, (SubLObject)forward.UNPROVIDED);
                final SubLObject inference_$99 = thread.secondMultipleValue();
                final SubLObject query_time_$100 = thread.thirdMultipleValue();
                final SubLObject halt_reason_$101 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                forward_results = forward_results_$98;
                inference = inference_$99;
                query_time = query_time_$100;
                halt_reason = halt_reason_$101;
                if (forward.NIL != call_forward_inference_browsing_callbackP()) {
                    call_forward_inference_browsing_callback(inference, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, target_asent, forward.$kw106$TARGET_TRUTH, target_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, trigger_supports, forward.$kw97$FORWARD_RESULTS, forward_results }));
                }
                inference_metrics.increment_forward_inference_historical_count();
                if (forward.NIL != forward_results) {
                    inference_metrics.increment_successful_forward_inference_historical_count();
                }
                if (halt_reason == forward.$kw115$EXHAUST_TOTAL) {
                    final SubLObject _prev_bind_0_$102 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(Numbers.numL(Sequences.length(forward_results), forward.$forward_inference_show_propagation_results_progress_cutoff$.getDynamicValue(thread)), thread);
                        final SubLObject list_var = forward_results;
                        final SubLObject _prev_bind_0_$103 = utilities_macros.$progress_note$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$104 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$105 = utilities_macros.$progress_total$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$106 = utilities_macros.$progress_sofar$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_note$.bind((SubLObject)((forward.NIL != ((forward.NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) ? forward.$str116$Propagating_results : Sequences.cconcatenate((SubLObject)forward.$str117$Propagating_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(forward_results)), forward.$str118$_results_for_, format_nil.format_nil_s_no_copy(current_forward_inference_gaf()), forward.$str119$____, format_nil.format_nil_s_no_copy(target_asent) }))) ? ((forward.NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) ? forward.$str116$Propagating_results : Sequences.cconcatenate((SubLObject)forward.$str117$Propagating_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(forward_results)), forward.$str118$_results_for_, format_nil.format_nil_s_no_copy(current_forward_inference_gaf()), forward.$str119$____, format_nil.format_nil_s_no_copy(target_asent) })) : forward.$str120$cdolist), thread);
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                            utilities_macros.$progress_sofar$.bind((SubLObject)forward.ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_index$.bind((SubLObject)forward.ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)forward.NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)forward.T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                            try {
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                SubLObject csome_list_var = list_var;
                                SubLObject forward_result = (SubLObject)forward.NIL;
                                forward_result = csome_list_var.first();
                                while (forward.NIL != csome_list_var) {
                                    add_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports, forward_result);
                                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)forward.ONE_INTEGER), thread);
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    csome_list_var = csome_list_var.rest();
                                    forward_result = csome_list_var.first();
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    utilities_macros.noting_percent_progress_postamble();
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                                }
                            }
                        }
                        finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_sofar$.rebind(_prev_bind_3_$106, thread);
                            utilities_macros.$progress_total$.rebind(_prev_bind_2_$105, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$104, thread);
                            utilities_macros.$progress_note$.rebind(_prev_bind_0_$103, thread);
                        }
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0_$102, thread);
                    }
                }
                else if (halt_reason != forward.$kw115$EXHAUST_TOTAL && forward.NIL != forward_propagate_rule_via_trigger_gafsP() && forward.NIL != current_forward_inference_fully_propagating_ruleP()) {
                    final SubLObject last_metric_type_$108 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                    final SubLObject last_metric_$109 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                    final SubLObject last_gaf_$110 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                    final SubLObject last_rule_$111 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                    if (forward.NIL != last_metric_type_$108 && forward.NIL != last_metric_$109) {
                        inference_metrics.increment_forward_inference_metrics(last_metric_type_$108, last_metric_$109, last_gaf_$110, last_rule_$111, (SubLObject)forward.ZERO_INTEGER);
                    }
                    final SubLObject _prev_bind_0_$105 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$105 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$106 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$107 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                    try {
                        hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                        hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw121$FORWARD_PROPAGATE_RULE_VIA_TRIGGER_GAFS, thread);
                        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
                        hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                        try {
                            clear_current_forward_problem_store();
                            final SubLObject environment = get_forward_inference_environment();
                            assert forward.NIL != queues.queue_p(environment) : environment;
                            final SubLObject _prev_bind_0_$106 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                forward_rule_propagation.forward_propagate_rule_via_trigger_gafs(current_forward_inference_rule(), (SubLObject)forward.UNPROVIDED);
                            }
                            finally {
                                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$106, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw121$FORWARD_PROPAGATE_RULE_VIA_TRIGGER_GAFS, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                            }
                        }
                    }
                    finally {
                        hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_3_$107, thread);
                        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$106, thread);
                        hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$105, thread);
                        hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$105, thread);
                    }
                }
                else {
                    Errors.warn((SubLObject)forward.$str122$Forward_inference_incomplete_for_, current_forward_inference_gaf(), current_forward_inference_rule(), halt_reason);
                    final SubLObject list_var2 = forward_results;
                    final SubLObject _prev_bind_0_$108 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$106 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$107 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$108 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)((forward.NIL != Sequences.cconcatenate((SubLObject)forward.$str117$Propagating_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(forward_results)), forward.$str118$_results_for_, format_nil.format_nil_s_no_copy(current_forward_inference_gaf()), forward.$str119$____, format_nil.format_nil_s_no_copy(target_asent) })) ? Sequences.cconcatenate((SubLObject)forward.$str117$Propagating_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(forward_results)), forward.$str118$_results_for_, format_nil.format_nil_s_no_copy(current_forward_inference_gaf()), forward.$str119$____, format_nil.format_nil_s_no_copy(target_asent) }) : forward.$str120$cdolist), thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var2), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)forward.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)forward.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)forward.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)forward.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var2 = list_var2;
                            SubLObject forward_result2 = (SubLObject)forward.NIL;
                            forward_result2 = csome_list_var2.first();
                            while (forward.NIL != csome_list_var2) {
                                add_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports, forward_result2);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)forward.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var2 = csome_list_var2.rest();
                                forward_result2 = csome_list_var2.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_3_$108, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_2_$107, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$106, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$108, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw114$FORWARD_PROPAGATE_DNF, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 60541L)
    public static SubLObject new_forward_query_from_dnf(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, SubLObject overriding_query_properties) {
        if (overriding_query_properties == forward.UNPROVIDED) {
            overriding_query_properties = forward.$forward_inference_overriding_query_properties$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_properties = forward_inference_query_properties(pragmatic_dnf, overriding_query_properties);
        SubLObject forward_results = (SubLObject)forward.NIL;
        SubLObject halt_reason = (SubLObject)forward.NIL;
        SubLObject inference = (SubLObject)forward.NIL;
        SubLObject query_time = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw123$INFERENCE, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw69$OVERHEAD, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                final SubLObject time_var = Time.get_internal_real_time();
                thread.resetMultipleValues();
                final SubLObject forward_results_$124 = inference_kernel.new_cyc_query_from_dnf(query_dnf, propagation_mt, (SubLObject)forward.NIL, query_properties);
                final SubLObject halt_reason_$125 = thread.secondMultipleValue();
                final SubLObject inference_$126 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                forward_results = forward_results_$124;
                halt_reason = halt_reason_$125;
                inference = inference_$126;
                query_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            }
            finally {
                final SubLObject _prev_bind_0_$127 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw123$INFERENCE, (SubLObject)forward.$kw69$OVERHEAD, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$127, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return Values.values(forward_results, inference, query_time, halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 61330L)
    public static SubLObject new_cyc_trivial_forward_query_from_dnf(final SubLObject dnf, final SubLObject mt, SubLObject scoped_vars, SubLObject overriding_query_properties) {
        if (scoped_vars == forward.UNPROVIDED) {
            scoped_vars = (SubLObject)forward.NIL;
        }
        if (overriding_query_properties == forward.UNPROVIDED) {
            overriding_query_properties = (SubLObject)forward.NIL;
        }
        final SubLObject query_properties = trivial_forward_inference_query_properties(clauses.empty_clause(), overriding_query_properties);
        return inference_trivial.new_cyc_trivial_query_from_dnf(dnf, mt, scoped_vars, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 61645L)
    public static SubLObject new_forward_query(final SubLObject query_sentence, SubLObject pragmatic_dnf, SubLObject propagation_mt) {
        if (pragmatic_dnf == forward.UNPROVIDED) {
            pragmatic_dnf = clauses.empty_clause();
        }
        if (propagation_mt == forward.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_properties = forward_inference_query_properties(pragmatic_dnf, (SubLObject)forward.UNPROVIDED);
        SubLObject forward_results = (SubLObject)forward.NIL;
        SubLObject halt_reason = (SubLObject)forward.NIL;
        SubLObject inference = (SubLObject)forward.NIL;
        SubLObject query_time = (SubLObject)forward.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject forward_results_$128 = inference_kernel.new_cyc_query(query_sentence, propagation_mt, query_properties);
        final SubLObject halt_reason_$129 = thread.secondMultipleValue();
        final SubLObject inference_$130 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        forward_results = forward_results_$128;
        halt_reason = halt_reason_$129;
        inference = inference_$130;
        query_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(forward_results, inference, query_time, halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 62241L)
    public static SubLObject forward_inference_query_properties(final SubLObject pragmatic_dnf, SubLObject overriding_query_properties) {
        if (overriding_query_properties == forward.UNPROVIDED) {
            overriding_query_properties = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = get_forward_problem_store((SubLObject)forward.UNPROVIDED);
        final SubLObject non_explanatory_sentence = (SubLObject)((forward.NIL != clauses.empty_clauseP(pragmatic_dnf)) ? forward.NIL : clauses.dnf_formula(pragmatic_dnf));
        final SubLObject browsableP = list_utilities.sublisp_boolean(control_vars.browse_forward_inferencesP());
        final SubLObject blockP = list_utilities.sublisp_boolean(forward.$block_forward_inferencesP$.getDynamicValue(thread));
        final SubLObject max_time = kb_control_vars.$forward_inference_time_cutoff$.getDynamicValue(thread);
        final SubLObject productivity_limit = forward_inference_productivity_limit();
        final SubLObject new_terms_allowed = control_vars.$prefer_forward_skolemization$.getDynamicValue(thread);
        if (forward.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && forward.NIL == inference_datastructures_problem_store.problem_store_p(store)) {
            Errors.error((SubLObject)forward.$str124$Tried_to_do_forward_inference_out);
        }
        SubLObject query_properties = (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw125$PROBLEM_STORE, store, forward.$kw126$NON_EXPLANATORY_SENTENCE, non_explanatory_sentence, forward.$kw127$ALLOW_INDETERMINATE_RESULTS_, forward.T, forward.$kw128$BROWSABLE_, browsableP, forward.$kw129$BLOCK_, blockP, forward.$kw130$PRODUCTIVITY_LIMIT, productivity_limit, forward.$kw131$PROBABLY_APPROXIMATELY_DONE, forward.ONE_INTEGER, forward.$kw132$MAX_TIME, max_time, forward.$kw133$RESULT_UNIQUENESS, forward.$kw134$PROOF, forward.$kw135$RETURN, forward.$kw136$BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS, forward.$kw137$NEW_TERMS_ALLOWED_, new_terms_allowed });
        if (forward.NIL != overriding_query_properties) {
            query_properties = list_utilities.merge_plist(query_properties, overriding_query_properties);
        }
        return query_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 63599L)
    public static SubLObject trivial_forward_inference_query_properties(final SubLObject pragmatic_dnf, SubLObject overriding_query_properties) {
        if (overriding_query_properties == forward.UNPROVIDED) {
            overriding_query_properties = (SubLObject)forward.NIL;
        }
        final SubLObject query_properties = forward_inference_query_properties(pragmatic_dnf, overriding_query_properties);
        SubLObject trivial_query_properties = (SubLObject)forward.NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)forward.NIL, remainder = query_properties; forward.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (forward.NIL != inference_trivial.trivial_strategist_can_handle_query_propertyP(property, value)) {
                trivial_query_properties = conses_high.putf(trivial_query_properties, property, value);
            }
        }
        return trivial_query_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 64097L)
    public static SubLObject forward_inference_productivity_limit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff(control_vars.$forward_inference_removal_cost_cutoff$.getDynamicValue(thread));
        final SubLObject possible_rule_forward_inference_productivity_limit = (SubLObject)forward.NIL;
        return productivity_limit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 65725L)
    public static SubLObject rule_forward_inference_productivity_limit(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff(control_vars.$forward_inference_removal_cost_cutoff$.getDynamicValue(thread));
        final SubLObject asserted_when = assertions_high.asserted_when(rule);
        if (forward.NIL != wff.assertive_wff_ruleP(rule)) {
            productivity_limit = number_utilities.div(productivity_limit, forward.$assertive_wff_rule_whacking_factor$.getDynamicValue(thread));
        }
        else if (forward.NIL == assertions_high.assertion_has_dependents_p(rule)) {
            if (forward.NIL != forward.$rule_forward_inference_productivity_aggressive_whacking_modeP$.getDynamicValue(thread) && forward.NIL == asserted_when) {
                productivity_limit = number_utilities.div(productivity_limit, number_utilities.f_1X(number_utilities.div(forward.$old_rule_without_dependents_or_bookkeeping_whacking_factor$.getDynamicValue(thread), forward.$old_rule_without_dependents_whacking_compensation_factor$.getDynamicValue(thread))));
            }
            else if (forward.NIL != forward.$rule_forward_inference_productivity_aggressive_whacking_modeP$.getDynamicValue(thread)) {
                final SubLObject old_factor = Numbers.subtract(numeric_date_utilities.get_universal_date((SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED), asserted_when);
                if (forward.NIL != subl_promotions.positive_integer_p(old_factor)) {
                    productivity_limit = number_utilities.div(productivity_limit, number_utilities.f_1X(number_utilities.div(old_factor, forward.$old_rule_without_dependents_whacking_compensation_factor$.getDynamicValue(thread))));
                }
            }
        }
        if (productivity_limit.numL(forward.$minimum_rule_forward_inference_productivity_limit$.getDynamicValue(thread))) {
            productivity_limit = forward.$minimum_rule_forward_inference_productivity_limit$.getDynamicValue(thread);
        }
        return productivity_limit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 67322L)
    public static SubLObject add_forward_propagation_result(final SubLObject target_asent, final SubLObject target_truth, final SubLObject propagation_mt, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports, final SubLObject forward_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw141$ADD_FORWARD_PROPAGATION_RESULT, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                SubLObject inference_bindings = (SubLObject)forward.NIL;
                SubLObject inference_supports = (SubLObject)forward.NIL;
                SubLObject inference_pragmatic_supports = (SubLObject)forward.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(forward_result, forward_result, (SubLObject)forward.$list142);
                inference_bindings = forward_result.first();
                SubLObject current = forward_result.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, forward_result, (SubLObject)forward.$list142);
                inference_supports = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, forward_result, (SubLObject)forward.$list142);
                inference_pragmatic_supports = current.first();
                current = current.rest();
                if (forward.NIL == current) {
                    final SubLObject concluded_asent = bindings.apply_bindings(inference_bindings, target_asent);
                    if (forward.NIL == el_utilities.hl_ground_tree_p(concluded_asent)) {
                        if (forward.NIL != call_forward_inference_browsing_callbackP()) {
                            call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, target_asent, forward.$kw106$TARGET_TRUTH, target_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, trigger_supports, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, ConsesLow.list((SubLObject)forward.$kw3$TYPE, (SubLObject)forward.$kw143$CONCLUDED_ASENT_NOT_HL_GROUND_TREE, (SubLObject)forward.$kw144$ASENT, concluded_asent) }));
                        }
                    }
                    else {
                        final SubLObject concluded_supports = new_forward_concluded_supports(rule, trigger_supports, inference_supports);
                        add_forward_deductions_from_supports(propagation_mt, concluded_asent, target_truth, concluded_supports, inference_pragmatic_supports, rule, trigger_bindings, inference_bindings);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(forward_result, (SubLObject)forward.$list142);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw141$ADD_FORWARD_PROPAGATION_RESULT, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 68863L)
    public static SubLObject add_empty_forward_propagation_result(final SubLObject target_asent, final SubLObject target_truth, final SubLObject propagation_mt, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        if (forward.NIL != call_forward_inference_browsing_callbackP()) {
            call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, target_asent, forward.$kw106$TARGET_TRUTH, target_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, trigger_supports, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ONE_INTEGER }));
        }
        return add_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports, (SubLObject)forward.$list145);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 69446L)
    public static SubLObject new_forward_concluded_supports(final SubLObject rule, final SubLObject trigger_supports, SubLObject inference_supports) {
        if (inference_supports == forward.UNPROVIDED) {
            inference_supports = (SubLObject)forward.NIL;
        }
        return reader.bq_cons(rule, ConsesLow.append((SubLObject)((forward.NIL != trigger_supports) ? conses_high.copy_list(trigger_supports) : forward.NIL), (SubLObject)((forward.NIL != inference_supports) ? conses_high.copy_list(inference_supports) : forward.NIL), (SubLObject)forward.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 70450L)
    public static SubLObject add_forward_deductions_from_supports(final SubLObject propagation_mt, final SubLObject concluded_asent, final SubLObject concluded_truth, final SubLObject concluded_supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL != forward.$add_forward_deductions_from_supports_callback$.getDynamicValue(thread)) {
            return Functions.funcall(forward.$add_forward_deductions_from_supports_callback$.getDynamicValue(thread), new SubLObject[] { propagation_mt, concluded_asent, concluded_truth, concluded_supports, pragmatic_supports, rule, trigger_bindings, inference_bindings });
        }
        thread.resetMultipleValues();
        final SubLObject mt_support_combinations = compute_all_mt_and_support_combinations(concluded_supports, pragmatic_supports);
        final SubLObject failure_reasons = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (forward.NIL == mt_support_combinations) {
            if (forward.NIL != call_forward_inference_browsing_callbackP()) {
                call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, concluded_asent, forward.$kw106$TARGET_TRUTH, concluded_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, forward.NIL, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, ConsesLow.list((SubLObject)forward.$kw3$TYPE, (SubLObject)forward.$kw146$NULL_MT_SUPPORT_COMBINATIONS, (SubLObject)forward.$kw144$ASENT, concluded_asent, (SubLObject)forward.$kw147$FORM, (SubLObject)ConsesLow.list((SubLObject)forward.$sym148$COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS, el_utilities.sefify(concluded_supports), el_utilities.sefify(pragmatic_supports)), (SubLObject)forward.$kw149$FAILURE_REASONS, failure_reasons) }));
            }
        }
        else if (forward.NIL != kb_accessors.decontextualized_literalP(concluded_asent) && forward.NIL != global_forward_propagation_mtP(propagation_mt) && forward.NIL != forward.$compute_decontextualized_deduction_mtP$.getDynamicValue(thread)) {
            SubLObject valid_liftP = (SubLObject)forward.NIL;
            if (forward.NIL == valid_liftP) {
                SubLObject csome_list_var = mt_support_combinations;
                SubLObject mt_support_combination = (SubLObject)forward.NIL;
                mt_support_combination = csome_list_var.first();
                while (forward.NIL == valid_liftP && forward.NIL != csome_list_var) {
                    if (forward.NIL == valid_liftP) {
                        SubLObject csome_list_var_$132 = mt_support_combination.first();
                        SubLObject concluded_mt = (SubLObject)forward.NIL;
                        concluded_mt = csome_list_var_$132.first();
                        while (forward.NIL == valid_liftP && forward.NIL != csome_list_var_$132) {
                            if (forward.NIL != mt_relevance_macros.mt_relevant_to_mtP(propagation_mt, concluded_mt)) {
                                valid_liftP = (SubLObject)forward.T;
                            }
                            csome_list_var_$132 = csome_list_var_$132.rest();
                            concluded_mt = csome_list_var_$132.first();
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    mt_support_combination = csome_list_var.first();
                }
            }
            if (forward.NIL == valid_liftP && forward.NIL != call_forward_inference_browsing_callbackP()) {
                call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, concluded_asent, forward.$kw106$TARGET_TRUTH, concluded_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, forward.NIL, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, ConsesLow.list(new SubLObject[] { forward.$kw3$TYPE, forward.$kw150$INVALID_LIFT, forward.$kw144$ASENT, concluded_asent, forward.$kw151$PROPAGATION_MT, propagation_mt, forward.$kw152$MT_SUPPORT_COMBINATIONS, el_utilities.sefify(mt_support_combinations), forward.$kw149$FAILURE_REASONS, failure_reasons }) }));
            }
            if (forward.NIL != valid_liftP) {
                final SubLObject convention_mt = kb_accessors.decontextualized_literal_convention_mt(concluded_asent);
                SubLObject placement_doneP = (SubLObject)forward.NIL;
                if (forward.NIL == placement_doneP) {
                    SubLObject csome_list_var2 = mt_support_combinations;
                    SubLObject mt_support_combination2 = (SubLObject)forward.NIL;
                    mt_support_combination2 = csome_list_var2.first();
                    while (forward.NIL == placement_doneP && forward.NIL != csome_list_var2) {
                        SubLObject current;
                        final SubLObject datum = current = mt_support_combination2;
                        SubLObject concluded_mts = (SubLObject)forward.NIL;
                        SubLObject support_combination = (SubLObject)forward.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward.$list153);
                        concluded_mts = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward.$list153);
                        support_combination = current.first();
                        current = current.rest();
                        if (forward.NIL == current) {
                            if (forward.NIL == placement_doneP) {
                                SubLObject csome_list_var_$133;
                                SubLObject concluded_mt2;
                                for (csome_list_var_$133 = concluded_mts, concluded_mt2 = (SubLObject)forward.NIL, concluded_mt2 = csome_list_var_$133.first(); forward.NIL == placement_doneP && forward.NIL != csome_list_var_$133; placement_doneP = Types.sublisp_null(handle_forward_deduction_in_mt(concluded_asent, concluded_truth, concluded_mt2, convention_mt, support_combination, pragmatic_supports, rule, trigger_bindings, inference_bindings)), csome_list_var_$133 = csome_list_var_$133.rest(), concluded_mt2 = csome_list_var_$133.first()) {}
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)forward.$list153);
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        mt_support_combination2 = csome_list_var2.first();
                    }
                }
            }
        }
        else if (forward.NIL != kb_accessors.decontextualized_literalP(concluded_asent)) {
            SubLObject valid_liftP = (SubLObject)forward.NIL;
            if (forward.NIL == valid_liftP) {
                SubLObject csome_list_var = mt_support_combinations;
                SubLObject mt_support_combination = (SubLObject)forward.NIL;
                mt_support_combination = csome_list_var.first();
                while (forward.NIL == valid_liftP && forward.NIL != csome_list_var) {
                    if (forward.NIL == valid_liftP) {
                        SubLObject csome_list_var_$134 = mt_support_combination.first();
                        SubLObject concluded_mt = (SubLObject)forward.NIL;
                        concluded_mt = csome_list_var_$134.first();
                        while (forward.NIL == valid_liftP && forward.NIL != csome_list_var_$134) {
                            if (forward.NIL != mt_relevance_macros.mt_relevant_to_mtP(propagation_mt, concluded_mt)) {
                                valid_liftP = (SubLObject)forward.T;
                            }
                            csome_list_var_$134 = csome_list_var_$134.rest();
                            concluded_mt = csome_list_var_$134.first();
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    mt_support_combination = csome_list_var.first();
                }
            }
            if (forward.NIL == valid_liftP && forward.NIL != call_forward_inference_browsing_callbackP()) {
                call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, concluded_asent, forward.$kw106$TARGET_TRUTH, concluded_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, forward.NIL, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, ConsesLow.list(new SubLObject[] { forward.$kw3$TYPE, forward.$kw150$INVALID_LIFT, forward.$kw144$ASENT, concluded_asent, forward.$kw151$PROPAGATION_MT, propagation_mt, forward.$kw152$MT_SUPPORT_COMBINATIONS, el_utilities.sefify(mt_support_combinations), forward.$kw149$FAILURE_REASONS, failure_reasons }) }));
            }
            if (forward.NIL != valid_liftP) {
                final SubLObject convention_mt = kb_accessors.decontextualized_literal_convention_mt(concluded_asent);
                handle_forward_deduction_in_mt(concluded_asent, concluded_truth, propagation_mt, convention_mt, concluded_supports, pragmatic_supports, rule, trigger_bindings, inference_bindings);
            }
        }
        else if (forward.NIL != global_forward_propagation_mtP(propagation_mt)) {
            SubLObject mt_support_combination3 = (SubLObject)forward.NIL;
            SubLObject mt_support_combination_$135 = (SubLObject)forward.NIL;
            SubLObject failure_reason = (SubLObject)forward.NIL;
            SubLObject failure_reason_$136 = (SubLObject)forward.NIL;
            mt_support_combination3 = mt_support_combinations;
            mt_support_combination_$135 = mt_support_combination3.first();
            failure_reason = failure_reasons;
            failure_reason_$136 = failure_reason.first();
            while (forward.NIL != failure_reason || forward.NIL != mt_support_combination3) {
                SubLObject current2;
                final SubLObject datum2 = current2 = mt_support_combination_$135;
                SubLObject concluded_mts2 = (SubLObject)forward.NIL;
                SubLObject support_combination2 = (SubLObject)forward.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)forward.$list153);
                concluded_mts2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)forward.$list153);
                support_combination2 = current2.first();
                current2 = current2.rest();
                if (forward.NIL == current2) {
                    if (forward.NIL == concluded_mts2 && forward.NIL != call_forward_inference_browsing_callbackP()) {
                        call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, concluded_asent, forward.$kw106$TARGET_TRUTH, concluded_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, forward.NIL, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, ConsesLow.list((SubLObject)forward.$kw3$TYPE, (SubLObject)forward.$kw154$NO_MT_SUPPORT_COMBINATION_CONCLUDED_MTS_FOUND, (SubLObject)forward.$kw144$ASENT, concluded_asent, (SubLObject)forward.$kw147$FORM, (SubLObject)ConsesLow.list((SubLObject)forward.$sym148$COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS, el_utilities.sefify(concluded_supports), el_utilities.sefify(pragmatic_supports)), (SubLObject)forward.$kw155$FAILURE_REASON, failure_reason_$136) }));
                    }
                    SubLObject cdolist_list_var = concluded_mts2;
                    SubLObject concluded_mt3 = (SubLObject)forward.NIL;
                    concluded_mt3 = cdolist_list_var.first();
                    while (forward.NIL != cdolist_list_var) {
                        if (forward.NIL == mt_relevance_macros.mt_relevant_to_mtP(propagation_mt, concluded_mt3)) {
                            if (forward.NIL != call_forward_inference_browsing_callbackP()) {
                                call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, concluded_asent, forward.$kw106$TARGET_TRUTH, concluded_truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, forward.NIL, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, ConsesLow.list(new SubLObject[] { forward.$kw3$TYPE, forward.$kw156$INVALID_PLACEMENT, forward.$kw144$ASENT, forward.$sym157$CONCLUDED_ASENT, forward.$kw151$PROPAGATION_MT, forward.$sym158$PROPAGATION_MT, forward.$kw159$CONCLUDED_MT, forward.$sym160$CONCLUDED_MT, forward.$kw155$FAILURE_REASON, failure_reason_$136 }) }));
                            }
                        }
                        else {
                            handle_forward_deduction_in_mt(concluded_asent, concluded_truth, concluded_mt3, concluded_mt3, support_combination2, pragmatic_supports, rule, trigger_bindings, inference_bindings);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        concluded_mt3 = cdolist_list_var.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)forward.$list153);
                }
                mt_support_combination3 = mt_support_combination3.rest();
                mt_support_combination_$135 = mt_support_combination3.first();
                failure_reason = failure_reason.rest();
                failure_reason_$136 = failure_reason.first();
            }
        }
        else {
            handle_forward_deduction_in_mt(concluded_asent, concluded_truth, propagation_mt, propagation_mt, concluded_supports, pragmatic_supports, rule, trigger_bindings, inference_bindings);
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 77081L)
    public static SubLObject handle_forward_deduction_in_mt(final SubLObject asent, final SubLObject truth, final SubLObject mt, final SubLObject placement_mt, final SubLObject supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        SubLObject failure_reason = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw161$HANDLE_FORWARD_DEDUCTION_IN_MT, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                thread.resetMultipleValues();
                final SubLObject result_$137 = handle_forward_deduction_in_mt_int(asent, truth, mt, placement_mt, supports, pragmatic_supports, rule, trigger_bindings, inference_bindings);
                final SubLObject failure_reason_$138 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$137;
                failure_reason = failure_reason_$138;
                if (result.isKeyword() && forward.NIL != call_forward_inference_browsing_callbackP()) {
                    call_forward_inference_browsing_callback((SubLObject)forward.NIL, rule, (SubLObject)ConsesLow.list(new SubLObject[] { forward.$kw105$TARGET_ASENT, asent, forward.$kw106$TARGET_TRUTH, truth, forward.$kw95$TRIGGER_BINDINGS, trigger_bindings, forward.$kw96$TRIGGER_SUPPORTS, supports, forward.$kw97$FORWARD_RESULTS, forward.NIL, forward.$kw98$ANSWER_COUNT, forward.ZERO_INTEGER, forward.$kw2$REASON, ConsesLow.list(new SubLObject[] { forward.$kw3$TYPE, result, forward.$kw144$ASENT, asent, forward.$kw89$MT, mt, forward.$kw162$PLACEMENT_MT, placement_mt, forward.$kw163$SUPPORTS, supports, forward.$kw164$PRAGMATIC_SUPPORTS, pragmatic_supports, forward.$kw155$FAILURE_REASON, failure_reason }) }));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$139 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw161$HANDLE_FORWARD_DEDUCTION_IN_MT, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$139, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 78136L)
    public static SubLObject handle_forward_deduction_in_mt_int(final SubLObject asent, final SubLObject truth, final SubLObject mt, final SubLObject placement_mt, final SubLObject supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forward_bindings_abnormalP = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw165$FORWARD_BINDINGS_ABNORMAL_, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                forward_bindings_abnormalP = abnormal.forward_bindings_abnormalP(mt, rule, trigger_bindings, inference_bindings);
            }
            finally {
                final SubLObject _prev_bind_0_$140 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw165$FORWARD_BINDINGS_ABNORMAL_, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$140, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        if (forward.NIL != forward_bindings_abnormalP) {
            return subl_promotions.values2((SubLObject)forward.$kw166$FORWARD_BINDINGS_ABNORMAL, (SubLObject)forward.NIL);
        }
        if (forward.NIL != abnormal.abnormality_except_support_enabledP()) {
            final SubLObject _prev_bind_5 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)forward.NIL, thread);
                SubLObject supports_contain_excepted_assertion_in_mtP = (SubLObject)forward.NIL;
                final SubLObject last_metric_type2 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric2 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf2 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule2 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if (forward.NIL != last_metric_type2 && forward.NIL != last_metric2) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type2, last_metric2, last_gaf2, last_rule2, (SubLObject)forward.ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$141 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_6 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_7 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_8 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw167$SUPPORTS_CONTAIN_EXCEPTED_ASSERTION_IN_MT_, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                    try {
                        supports_contain_excepted_assertion_in_mtP = inference_worker_transformation.supports_contain_excepted_assertion_in_mtP(supports, mt, (SubLObject)forward.UNPROVIDED);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$142 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw167$SUPPORTS_CONTAIN_EXCEPTED_ASSERTION_IN_MT_, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                        }
                    }
                }
                finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_8, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_7, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_6, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$141, thread);
                }
                if (forward.NIL != supports_contain_excepted_assertion_in_mtP) {
                    return subl_promotions.values2((SubLObject)forward.$kw168$FORWARD_BINDINGS_EXCEPTED, (SubLObject)forward.NIL);
                }
            }
            finally {
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_5, thread);
            }
        }
        inference_metrics.note_forward_inference_successful_rule(rule);
        final SubLObject v_bindings = ConsesLow.append(trigger_bindings, inference_bindings);
        if (forward.NIL != Sequences.find_if((SubLObject)forward.$sym169$CONSTRAINT_RULE_, supports, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED)) {
            return handle_forward_deduction_in_mt_as_constraint(asent, truth, mt, placement_mt, supports, pragmatic_supports, v_bindings);
        }
        return handle_forward_deduction_in_mt_as_assertible(asent, truth, mt, placement_mt, supports, pragmatic_supports, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 80079L)
    public static SubLObject handle_forward_deduction_in_mt_as_assertible(final SubLObject asent, final SubLObject truth, SubLObject mt, SubLObject placement_mt, final SubLObject supports, SubLObject pragmatic_supports, SubLObject v_bindings) {
        if (pragmatic_supports == forward.UNPROVIDED) {
            pragmatic_supports = (SubLObject)forward.NIL;
        }
        if (v_bindings == forward.UNPROVIDED) {
            v_bindings = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forbid_forward_conclusion_in_mtP = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw170$FORBID_FORWARD_CONCLUSION_IN_MT_, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                forbid_forward_conclusion_in_mtP = forbid_forward_conclusion_in_mtP(asent, truth, mt, supports, pragmatic_supports);
            }
            finally {
                final SubLObject _prev_bind_0_$143 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw170$FORBID_FORWARD_CONCLUSION_IN_MT_, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        if (forward.NIL != forbid_forward_conclusion_in_mtP) {
            return subl_promotions.values2((SubLObject)forward.$kw171$FORWARD_CONCLUSION_FORBIDDEN_IN_MT, (SubLObject)forward.NIL);
        }
        if (forward.NIL != Sequences.find_if((SubLObject)forward.$sym60$INVALID_ASSERTION_, supports, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED)) {
            if (forward.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)forward.$str172$Something_between_queueing_and_pr, asent, mt, supports);
            }
            return subl_promotions.values2((SubLObject)forward.$kw173$INVALIDATED_SUPPORT, (SubLObject)forward.NIL);
        }
        final SubLObject gaf_formula = cycl_utilities.possibly_negate(asent, truth);
        SubLObject canon_cnfs = (SubLObject)forward.NIL;
        final SubLObject _prev_bind_5 = czer_vars.$assume_hlmt_is_canonicalP$.currentBinding(thread);
        try {
            czer_vars.$assume_hlmt_is_canonicalP$.bind((SubLObject)forward.T, thread);
            if (forward.NIL != forward.$assume_forward_deduction_is_wfP$.getDynamicValue(thread)) {
                final SubLObject last_metric_type2 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric2 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf2 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule2 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if (forward.NIL != last_metric_type2 && forward.NIL != last_metric2) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type2, last_metric2, last_gaf2, last_rule2, (SubLObject)forward.ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$144 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_6 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_7 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_8 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw174$CANONICALIZE_WF_GAF, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                    try {
                        thread.resetMultipleValues();
                        final SubLObject canon_cnfs_$145 = czer_main.canonicalize_wf_gaf(gaf_formula, mt);
                        final SubLObject mt_$146 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_cnfs = canon_cnfs_$145;
                        mt = mt_$146;
                    }
                    finally {
                        final SubLObject _prev_bind_0_$145 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw174$CANONICALIZE_WF_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                        }
                    }
                }
                finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_8, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_7, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_6, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$144, thread);
                }
            }
            else {
                final SubLObject last_metric_type2 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric2 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf2 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule2 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if (forward.NIL != last_metric_type2 && forward.NIL != last_metric2) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type2, last_metric2, last_gaf2, last_rule2, (SubLObject)forward.ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0_$146 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_6 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_7 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_8 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw175$CANONICALIZE_GAF, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                    try {
                        thread.resetMultipleValues();
                        final SubLObject canon_cnfs_$146 = czer_main.canonicalize_gaf(gaf_formula, mt);
                        final SubLObject mt_$147 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_cnfs = canon_cnfs_$146;
                        mt = mt_$147;
                    }
                    finally {
                        final SubLObject _prev_bind_0_$147 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw175$CANONICALIZE_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$147, thread);
                        }
                    }
                }
                finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_8, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_7, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_6, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$146, thread);
                }
            }
        }
        finally {
            czer_vars.$assume_hlmt_is_canonicalP$.rebind(_prev_bind_5, thread);
        }
        if (forward.NIL != el_utilities.ist_sentence_p(asent, (SubLObject)forward.UNPROVIDED)) {
            placement_mt = mt;
        }
        if (forward.NIL != kb_utilities.kbeq(canon_cnfs, forward.$const176$True)) {
            return subl_promotions.values2((SubLObject)forward.$kw177$FORWARD_CONCLUSION_TAUTOLOGICAL, (SubLObject)forward.NIL);
        }
        if (forward.NIL != kb_utilities.kbeq(canon_cnfs, forward.$const178$False)) {
            return subl_promotions.values2((SubLObject)forward.$kw179$FORWARD_CONCLUSION_CONTRADICTION, (SubLObject)forward.NIL);
        }
        if (forward.NIL != Sequences.find_if((SubLObject)forward.$sym60$INVALID_ASSERTION_, supports, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED)) {
            if (forward.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)forward.$str180$Canonicalization_of__s_in__s_inva, gaf_formula, mt, supports);
            }
            return subl_promotions.values2((SubLObject)forward.$kw181$CZER_INVALIDATED_SUPPORT, (SubLObject)forward.NIL);
        }
        if (forward.NIL == canon_cnfs) {
            if (forward.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)forward.T, (SubLObject)forward.$str182$Forward_conclusion_not_WFF______S, gaf_formula, wff.why_not_wff_assert(gaf_formula, mt, (SubLObject)forward.UNPROVIDED));
            }
            conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
            return subl_promotions.values2((SubLObject)forward.$kw183$FORWARD_CONCLUSION_NOT_WF, (SubLObject)((forward.NIL != call_forward_inference_browsing_callbackP()) ? wff.why_not_wff_assert(gaf_formula, mt, (SubLObject)forward.UNPROVIDED) : forward.NIL));
        }
        SubLObject cdolist_list_var = canon_cnfs;
        SubLObject canon_cnf_bind_list_pair = (SubLObject)forward.NIL;
        canon_cnf_bind_list_pair = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_cnf_bind_list_pair;
            SubLObject canon_cnf = (SubLObject)forward.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward.$list184);
            canon_cnf = current.first();
            current = current.rest();
            final SubLObject binding_list = (SubLObject)(current.isCons() ? current.first() : forward.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)forward.$list184);
            current = current.rest();
            if (forward.NIL == current) {
                assert forward.NIL != clauses.cnf_p(canon_cnf) : canon_cnf;
                if (forward.NIL != control_vars.$filter_deductions_for_trivially_derivable_gafs$.getDynamicValue(thread) && forward.NIL != clauses.atomic_clause_p(canon_cnf) && forward.NIL != tms.atomic_cnf_trivially_derivable(canon_cnf, mt)) {
                    return subl_promotions.values2((SubLObject)forward.$kw186$FORWARD_CONCLUSION_TRIVIALLY_DERIVABLE, (SubLObject)forward.NIL);
                }
                final SubLObject pragmatic_support_mts = Sequences.remove(forward.$const35$InferencePSC, Sequences.remove_if((SubLObject)forward.$sym187$CORE_MICROTHEORY_P, Mapping.mapcar((SubLObject)forward.$sym101$SUPPORT_MT, pragmatic_supports), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                return subl_promotions.values2(handle_forward_deduction_in_mt_as_assertible_int(canon_cnf, placement_mt, supports, binding_list, v_bindings, pragmatic_support_mts), (SubLObject)forward.NIL);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)forward.$list184);
                cdolist_list_var = cdolist_list_var.rest();
                canon_cnf_bind_list_pair = cdolist_list_var.first();
            }
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 83234L)
    public static SubLObject handle_forward_deduction_in_mt_as_assertible_int(final SubLObject cnf, final SubLObject mt, final SubLObject supports, SubLObject variable_map, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (variable_map == forward.UNPROVIDED) {
            variable_map = (SubLObject)forward.NIL;
        }
        if (v_bindings == forward.UNPROVIDED) {
            v_bindings = (SubLObject)forward.NIL;
        }
        if (pragmatic_support_mts == forward.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)forward.NIL;
        }
        final SubLObject deduction_spec = deductions_high.create_deduction_spec(supports, v_bindings, pragmatic_support_mts);
        final SubLObject hl_assertion_spec = hl_storage_modules.new_hl_assertion_spec(cnf, mt, (SubLObject)forward.$kw188$FORWARD, variable_map);
        final SubLObject hl_assertible = hl_storage_modules.new_hl_assertible(hl_assertion_spec, deduction_spec);
        return note_new_forward_assertible(hl_assertible);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 83672L)
    public static SubLObject forbid_forward_conclusion_in_mtP(final SubLObject asent, final SubLObject truth, final SubLObject mt, final SubLObject supports, final SubLObject pragmatic_supports) {
        if (forward.NIL != Sequences.find_if((SubLObject)forward.$sym189$ASSERTIVE_WFF_RULE_, supports, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != wff_constraint_mtP(mt) || forward.NIL != list_utilities.any_in_list((SubLObject)forward.$sym190$WFF_CONSTRAINT_SUPPORT_, supports, (SubLObject)forward.UNPROVIDED));
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 83958L)
    public static SubLObject wff_constraint_supportP(final SubLObject support) {
        if (forward.NIL != wff_constraint_mtP(arguments.support_mt(support))) {
            final SubLObject operator = cycl_utilities.sentence_arg0(arguments.support_sentence(support));
            if (forward.NIL != isa.isa_in_any_mtP(operator, forward.$const191$WFFConstraintPredicate)) {
                return (SubLObject)forward.T;
            }
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 84211L)
    public static SubLObject wff_constraint_mtP(final SubLObject mt) {
        final SubLObject monad = hlmt.hlmt_monad_mt(mt);
        return somewhere_cache.some_pred_assertion_somewhereP(forward.$const192$wffConstraintMt, monad, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 84654L)
    public static SubLObject constraint_ruleP(final SubLObject rule, SubLObject mt) {
        if (mt == forward.UNPROVIDED) {
            mt = (SubLObject)forward.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != assertions_high.rule_assertionP(rule) && forward.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(rule, forward.$const193$constraint, mt, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.$kw82$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 84893L)
    public static SubLObject handle_forward_deduction_in_mt_as_constraint(final SubLObject asent, final SubLObject truth, SubLObject mt, final SubLObject placement_mt, final SubLObject supports, SubLObject pragma_supports, SubLObject v_bindings) {
        if (pragma_supports == forward.UNPROVIDED) {
            pragma_supports = (SubLObject)forward.NIL;
        }
        if (v_bindings == forward.UNPROVIDED) {
            v_bindings = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL == forward.$forward_constraint_inference_enabledP$.getDynamicValue(thread) || forward.NIL == control_vars.$conflicts_from_invalid_deductions$.getDynamicValue(thread)) {
            return handle_forward_deduction_in_mt_as_assertible(asent, truth, mt, placement_mt, supports, pragma_supports, v_bindings);
        }
        final SubLObject gaf_formula = cycl_utilities.negate(cycl_utilities.possibly_negate(asent, truth));
        SubLObject canon_cnfs = (SubLObject)forward.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$assume_hlmt_is_canonicalP$.currentBinding(thread);
        try {
            czer_vars.$assume_hlmt_is_canonicalP$.bind((SubLObject)forward.T, thread);
            thread.resetMultipleValues();
            final SubLObject canon_cnfs_$152 = czer_main.canonicalize_gaf(gaf_formula, mt);
            final SubLObject mt_$153 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_cnfs = canon_cnfs_$152;
            mt = mt_$153;
        }
        finally {
            czer_vars.$assume_hlmt_is_canonicalP$.rebind(_prev_bind_0, thread);
        }
        if (forward.NIL == canon_cnfs) {
            conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
            return (SubLObject)forward.$kw183$FORWARD_CONCLUSION_NOT_WF;
        }
        if (forward.$const178$False.eql(canon_cnfs)) {
            conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
            return (SubLObject)forward.$kw177$FORWARD_CONCLUSION_TAUTOLOGICAL;
        }
        if (forward.$const176$True.eql(canon_cnfs)) {
            return (SubLObject)forward.$kw179$FORWARD_CONCLUSION_CONTRADICTION;
        }
        SubLObject cdolist_list_var = canon_cnfs;
        SubLObject canon_cnf_bind_list_pair = (SubLObject)forward.NIL;
        canon_cnf_bind_list_pair = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_cnf_bind_list_pair;
            SubLObject canon_cnf = (SubLObject)forward.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward.$list184);
            canon_cnf = current.first();
            current = current.rest();
            final SubLObject binding_list = (SubLObject)(current.isCons() ? current.first() : forward.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)forward.$list184);
            current = current.rest();
            if (forward.NIL == current) {
                assert forward.NIL != clauses.cnf_p(canon_cnf) : canon_cnf;
                if (forward.NIL != verify_forward_deduction_constraint(canon_cnf, mt)) {
                    conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
                    return (SubLObject)forward.$kw194$FORWARD_DEDUCTION_CONSTRAINT_VIOLATION;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)forward.$list184);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_cnf_bind_list_pair = cdolist_list_var.first();
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 86457L)
    public static SubLObject verify_forward_deduction_constraint(final SubLObject constraint_clause, final SubLObject mt) {
        SubLObject result = (SubLObject)forward.NIL;
        result = list_utilities.sublisp_boolean(inference_kernel.new_cyc_query_from_dnf(constraint_clause, mt, (SubLObject)forward.NIL, forward_inference_query_properties(clauses.empty_clause(), (SubLObject)forward.UNPROVIDED)));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 86826L)
    public static SubLObject cycl_sentence_for_forward_inference_canonicalP(final SubLObject asent, final SubLObject mt, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = forward.$forward_inference_rule$.currentBinding(thread);
        try {
            control_vars.$within_assert$.bind((SubLObject)forward.T, thread);
            kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)forward.T, thread);
            forward.$forward_inference_rule$.bind(rule, thread);
            if (forward.NIL == czer_main.canonicalize_cycl_sentence(asent, mt)) {
                if (forward.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)forward.T, (SubLObject)forward.$str182$Forward_conclusion_not_WFF______S, asent, wff.why_not_wff_assert(asent, mt, (SubLObject)forward.UNPROVIDED));
                }
                return (SubLObject)forward.NIL;
            }
        }
        finally {
            forward.$forward_inference_rule$.rebind(_prev_bind_3, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_2, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 87364L)
    public static SubLObject syntactically_valid_forward_dnf(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, SubLObject justifyP) {
        if (justifyP == forward.UNPROVIDED) {
            justifyP = (SubLObject)forward.NIL;
        }
        return syntactically_valid_forward_non_trigger_asents(query_dnf, pragmatic_dnf, justifyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 87789L)
    public static SubLObject syntactically_valid_forward_non_trigger_asents(final SubLObject query_dnf, final SubLObject pragmatic_dnf, SubLObject justifyP) {
        if (justifyP == forward.UNPROVIDED) {
            justifyP = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP = (SubLObject)forward.NIL;
        SubLObject reason = (SubLObject)forward.NIL;
        final SubLObject pos_lits = clauses.pos_lits(pragmatic_dnf);
        if (forward.NIL != Sequences.find_if((SubLObject)forward.$sym195$FORWARD_TRIGGER_LITERAL_LIT_, pos_lits, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED)) {
            SubLObject validP = (SubLObject)forward.NIL;
            if (forward.NIL == validP) {
                SubLObject csome_list_var = pos_lits;
                SubLObject asent = (SubLObject)forward.NIL;
                asent = csome_list_var.first();
                while (forward.NIL == validP && forward.NIL != csome_list_var) {
                    if (cycl_utilities.atomic_sentence_predicate(asent).eql(forward.$const196$forwardTriggerLiteral)) {
                        if (forward.NIL != variables.fully_bound_p(asent) && cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward.UNPROVIDED).equal(forward.$forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread))) {
                            validP = (SubLObject)forward.T;
                        }
                        else if (forward.NIL != justifyP) {
                            reason = (SubLObject)ConsesLow.list((SubLObject)forward.$kw3$TYPE, (SubLObject)forward.$kw197$SYNTACTICALLY_INVALID_FORWARD_TRIGGER_ASENT, (SubLObject)forward.$kw144$ASENT, forward.$forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread));
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    asent = csome_list_var.first();
                }
            }
            invalidP = (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL == validP);
        }
        else if (forward.NIL != Sequences.find_if((SubLObject)forward.$sym198$FORWARD_NON_TRIGGER_LITERAL_LIT_, pos_lits, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED) && forward.NIL == invalidP) {
            SubLObject csome_list_var2 = pos_lits;
            SubLObject asent2 = (SubLObject)forward.NIL;
            asent2 = csome_list_var2.first();
            while (forward.NIL == invalidP && forward.NIL != csome_list_var2) {
                if (cycl_utilities.atomic_sentence_predicate(asent2).eql(forward.$const199$forwardNonTriggerLiteral) && forward.NIL != variables.fully_bound_p(asent2) && cycl_utilities.atomic_sentence_arg1(asent2, (SubLObject)forward.UNPROVIDED).equal(forward.$forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread))) {
                    invalidP = (SubLObject)forward.T;
                    if (forward.NIL != justifyP) {
                        reason = (SubLObject)ConsesLow.list((SubLObject)forward.$kw3$TYPE, (SubLObject)forward.$kw200$SYNTACTICALLY_INVALID_FORWARD_NON_TRIGGER_ASENT, (SubLObject)forward.$kw144$ASENT, forward.$forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread));
                    }
                }
                csome_list_var2 = csome_list_var2.rest();
                asent2 = csome_list_var2.first();
            }
        }
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(forward.NIL == invalidP), reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 89481L)
    public static SubLObject semantically_valid_forward_dnf(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, SubLObject justifyP) {
        if (justifyP == forward.UNPROVIDED) {
            justifyP = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL == forward.$type_filter_forward_dnf$.getDynamicValue(thread)) {
            return (SubLObject)forward.T;
        }
        SubLObject current_validP = (SubLObject)forward.T;
        SubLObject current_reason = (SubLObject)forward.NIL;
        thread.resetMultipleValues();
        final SubLObject current_validP_$154 = backward.semantically_valid_term_of_unit_asents(query_dnf, propagation_mt, justifyP);
        final SubLObject current_reason_$155 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        current_validP = current_validP_$154;
        current_reason = current_reason_$155;
        if (forward.NIL != current_validP) {
            thread.resetMultipleValues();
            final SubLObject current_validP_$155 = backward.semantically_valid_closed_asentsP(query_dnf, propagation_mt, justifyP);
            final SubLObject current_reason_$156 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            current_validP = current_validP_$155;
            current_reason = current_reason_$156;
            if (forward.NIL != current_validP) {
                thread.resetMultipleValues();
                final SubLObject current_validP_$156 = backward.semantically_valid_term_of_unit_asents(pragmatic_dnf, propagation_mt, justifyP);
                final SubLObject current_reason_$157 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                current_validP = current_validP_$156;
                current_reason = current_reason_$157;
                if (forward.NIL != current_validP) {
                    thread.resetMultipleValues();
                    final SubLObject current_validP_$157 = backward.semantically_valid_closed_asentsP(pragmatic_dnf, propagation_mt, justifyP);
                    final SubLObject current_reason_$158 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    current_validP = current_validP_$157;
                    current_reason = current_reason_$158;
                }
            }
        }
        if (forward.NIL == justifyP) {
            return current_validP;
        }
        return Values.values(current_validP, current_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 90875L)
    public static SubLObject forward_leafy_mt_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return leafy_mt_p(v_object, forward.$forward_leafy_mt_threshold$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 91218L)
    public static SubLObject forward_propagation_supports_doomedP(final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw99$FORWARD_PROPAGATION_SUPPORTS_DOOMED, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.$kw47$NO_GAF, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                if (forward.NIL != assertion_utilities.universal_lifting_ruleP(rule)) {
                    result = (SubLObject)forward.NIL;
                }
                else if (forward.$forward_leafy_mt_threshold$.getDynamicValue(thread).isNegative()) {
                    result = (SubLObject)forward.NIL;
                }
                else {
                    SubLObject mts = (SubLObject)ConsesLow.cons(assertions_high.assertion_mt(rule), Mapping.mapcar(Symbols.symbol_function((SubLObject)forward.$sym101$SUPPORT_MT), trigger_supports));
                    mts = Sequences.delete(forward.$const35$InferencePSC, mts, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                    mts = Sequences.delete_duplicates(mts, Symbols.symbol_function((SubLObject)forward.$sym201$HLMT_EQUAL), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                    if (forward.NIL != list_utilities.lengthGE(mts, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.UNPROVIDED)) {
                        mts = genl_mts.min_mts(mts, (SubLObject)forward.UNPROVIDED);
                        if (forward.NIL != list_utilities.lengthGE(mts, (SubLObject)forward.TWO_INTEGER, (SubLObject)forward.UNPROVIDED)) {
                            result = forward_propagation_mts_doomedP(mts);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$162 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw99$FORWARD_PROPAGATION_SUPPORTS_DOOMED, (SubLObject)forward.$kw47$NO_GAF, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$162, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 92063L)
    public static SubLObject forward_propagation_mts_doomedP(final SubLObject mts) {
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)forward.$sym202$FORWARD_LEAFY_MT_P), mts, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED) && forward.NIL == forward_possibly_some_common_spec_mtP(mts));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 92226L)
    public static SubLObject forward_possibly_some_common_spec_mtP_internal(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.T;
        thread.resetMultipleValues();
        final SubLObject leafy_mts = list_utilities.partition_list(mts, (SubLObject)forward.$sym202$FORWARD_LEAFY_MT_P);
        final SubLObject non_leafy_mts = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (forward.NIL != leafy_mts) {
            SubLObject current;
            final SubLObject datum = current = leafy_mts;
            SubLObject leafy_mt = (SubLObject)forward.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward.$list204);
            leafy_mt = current.first();
            final SubLObject other_leafy_mts;
            current = (other_leafy_mts = current.rest());
            final SubLObject leafy_specs = genl_mts.all_spec_mts(leafy_mt, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
            if (forward.NIL != list_utilities.lengthLE(leafy_specs, forward.$forward_leafy_mt_threshold$.getDynamicValue(thread), (SubLObject)forward.UNPROVIDED)) {
                SubLObject cdolist_list_var = ConsesLow.append(other_leafy_mts, non_leafy_mts);
                SubLObject other_mt = (SubLObject)forward.NIL;
                other_mt = cdolist_list_var.first();
                while (forward.NIL != cdolist_list_var) {
                    if (forward.NIL == genl_mts.genl_mt_of_anyP(leafy_specs, other_mt, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED)) {
                        result = (SubLObject)forward.NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    other_mt = cdolist_list_var.first();
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 92226L)
    public static SubLObject forward_possibly_some_common_spec_mtP(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)forward.NIL;
        if (forward.NIL == v_memoization_state) {
            return forward_possibly_some_common_spec_mtP_internal(mts);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)forward.$sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_, (SubLObject)forward.UNPROVIDED);
        if (forward.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)forward.$sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_, (SubLObject)forward.ONE_INTEGER, (SubLObject)forward.NIL, (SubLObject)forward.EQUAL, (SubLObject)forward.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)forward.$sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(forward_possibly_some_common_spec_mtP_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, (SubLObject)forward.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 92948L)
    public static SubLObject leafy_mt_p(final SubLObject v_object, SubLObject threshold) {
        if (threshold == forward.UNPROVIDED) {
            threshold = (SubLObject)forward.ZERO_INTEGER;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != forts.fort_p(v_object) && forward.NIL != fort_types_interface.microtheory_p(v_object) && cardinality_estimates.spec_cardinality(v_object).numLE(threshold));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 93514L)
    public static SubLObject compute_all_mt_and_support_combinations(final SubLObject supports, SubLObject pragmatic_supports) {
        if (pragmatic_supports == forward.UNPROVIDED) {
            pragmatic_supports = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw205$COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                final SubLObject _prev_bind_0_$163 = genl_mts.$suppress_max_floor_mts_explosion_warning$.currentBinding(thread);
                final SubLObject _prev_bind_1_$164 = forward.$compute_all_mt_and_support_combinations_exceptions$.currentBinding(thread);
                try {
                    genl_mts.$suppress_max_floor_mts_explosion_warning$.bind((SubLObject)((forward.NIL != assertion_utilities.lifting_consequent_ruleP(current_forward_inference_rule())) ? forward.T : genl_mts.$suppress_max_floor_mts_explosion_warning$.getDynamicValue(thread)), thread);
                    forward.$compute_all_mt_and_support_combinations_exceptions$.bind((SubLObject)forward.NIL, thread);
                    if (forward.NIL != some_support_combinations_extensionally_possible(supports)) {
                        final SubLObject support_combinations = all_forward_support_mt_combinations(supports);
                        final SubLObject pragmatic_support_combinations = all_forward_support_mt_combinations(pragmatic_supports);
                        SubLObject v_answer = (SubLObject)forward.NIL;
                        SubLObject failure_reasons = (SubLObject)forward.NIL;
                        SubLObject cdolist_list_var = support_combinations;
                        SubLObject support_combination = (SubLObject)forward.NIL;
                        support_combination = cdolist_list_var.first();
                        while (forward.NIL != cdolist_list_var) {
                            support_combination = Sequences.delete_duplicates(support_combination, Symbols.symbol_function((SubLObject)forward.EQUAL), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                            SubLObject cdolist_list_var_$165 = pragmatic_support_combinations;
                            SubLObject pragmatic_support_combination = (SubLObject)forward.NIL;
                            pragmatic_support_combination = cdolist_list_var_$165.first();
                            while (forward.NIL != cdolist_list_var_$165) {
                                pragmatic_support_combination = Sequences.delete_duplicates(pragmatic_support_combination, Symbols.symbol_function((SubLObject)forward.EQUAL), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                                final SubLObject supports_$166 = ConsesLow.append(support_combination, pragmatic_support_combination);
                                SubLObject mts = (SubLObject)forward.NIL;
                                final SubLObject last_metric_type_$167 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                                final SubLObject last_metric_$168 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                                final SubLObject last_gaf_$169 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                                final SubLObject last_rule_$170 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                                if (forward.NIL != last_metric_type_$167 && forward.NIL != last_metric_$168) {
                                    inference_metrics.increment_forward_inference_metrics(last_metric_type_$167, last_metric_$168, last_gaf_$169, last_rule_$170, (SubLObject)forward.ZERO_INTEGER);
                                }
                                final SubLObject _prev_bind_0_$164 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$165 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$173 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$174 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                                try {
                                    hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
                                    hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw206$COMPUTE_MTS_FROM_SUPPORTS, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
                                    try {
                                        mts = compute_mts_from_supports(supports_$166, (SubLObject)forward.UNPROVIDED);
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$165 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw206$COMPUTE_MTS_FROM_SUPPORTS, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$165, thread);
                                        }
                                    }
                                }
                                finally {
                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_3_$174, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$173, thread);
                                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$165, thread);
                                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$164, thread);
                                }
                                v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(mts, support_combination), v_answer);
                                failure_reasons = (SubLObject)ConsesLow.cons(forward.$compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread), failure_reasons);
                                cdolist_list_var_$165 = cdolist_list_var_$165.rest();
                                pragmatic_support_combination = cdolist_list_var_$165.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            support_combination = cdolist_list_var.first();
                        }
                        return Values.values(Sequences.nreverse(v_answer), Sequences.nreverse(failure_reasons));
                    }
                }
                finally {
                    forward.$compute_all_mt_and_support_combinations_exceptions$.rebind(_prev_bind_1_$164, thread);
                    genl_mts.$suppress_max_floor_mts_explosion_warning$.rebind(_prev_bind_0_$163, thread);
                }
                return Values.values((SubLObject)forward.NIL, (SubLObject)forward.NIL);
            }
            finally {
                final SubLObject _prev_bind_0_$166 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw205$COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$166, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 95229L)
    public static SubLObject compute_decontextualized_support_combinations(final SubLObject supports, final SubLObject pragmatic_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward.NIL != some_support_combinations_theoretically_possible(supports)) {
            final SubLObject support_combinations = all_forward_support_mt_combinations(supports);
            final SubLObject pragmatic_support_combinations = all_forward_support_mt_combinations(pragmatic_supports);
            SubLObject v_answer = (SubLObject)forward.NIL;
            SubLObject failure_reasons = (SubLObject)forward.NIL;
            SubLObject cdolist_list_var = support_combinations;
            SubLObject support_combination = (SubLObject)forward.NIL;
            support_combination = cdolist_list_var.first();
            while (forward.NIL != cdolist_list_var) {
                support_combination = Sequences.delete_duplicates(support_combination, Symbols.symbol_function((SubLObject)forward.EQUAL), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                SubLObject cdolist_list_var_$177 = pragmatic_support_combinations;
                SubLObject pragmatic_support_combination = (SubLObject)forward.NIL;
                pragmatic_support_combination = cdolist_list_var_$177.first();
                while (forward.NIL != cdolist_list_var_$177) {
                    pragmatic_support_combination = Sequences.delete_duplicates(pragmatic_support_combination, Symbols.symbol_function((SubLObject)forward.EQUAL), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                    final SubLObject supports_$178 = ConsesLow.append(support_combination, pragmatic_support_combination);
                    if (forward.NIL != some_support_combinations_extensionally_possible(supports_$178)) {
                        v_answer = (SubLObject)ConsesLow.cons(support_combination, v_answer);
                        failure_reasons = (SubLObject)ConsesLow.cons(forward.$compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread), failure_reasons);
                    }
                    cdolist_list_var_$177 = cdolist_list_var_$177.rest();
                    pragmatic_support_combination = cdolist_list_var_$177.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                support_combination = cdolist_list_var.first();
            }
            return Values.values(Sequences.nreverse(v_answer), Sequences.nreverse(failure_reasons));
        }
        return (SubLObject)forward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 96758L)
    public static SubLObject some_support_combinations_theoretically_possible(final SubLObject supports) {
        return (SubLObject)forward.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 97143L)
    public static SubLObject some_support_combinations_extensionally_possible(SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw207$SOME_SUPPORT_COMBINATIONS_EXTENSIONALLY_POSSIBLE, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                if (forward.NIL != assertion_utilities.universal_lifting_ruleP(current_forward_inference_rule())) {
                    result = (SubLObject)forward.T;
                }
                else if (forward.NIL == forward.$verify_some_support_combinations_possible$.getDynamicValue(thread)) {
                    result = (SubLObject)forward.T;
                }
                else {
                    supports = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)forward.$sym18$ASSERTION_P), supports, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                    if (forward.NIL == supports) {
                        result = (SubLObject)forward.T;
                    }
                    else {
                        final SubLObject mts = Mapping.mapcar(Symbols.symbol_function((SubLObject)forward.$sym208$ASSERTION_MT), supports);
                        result = inference_trampolines.inference_some_max_floor_mts(mts);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw207$SOME_SUPPORT_COMBINATIONS_EXTENSIONALLY_POSSIBLE, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 97780L)
    public static SubLObject all_forward_support_mt_combinations(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw209$ALL_FORWARD_SUPPORT_MT_COMBINATIONS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                result = all_forward_support_mt_combinations_int(supports);
            }
            finally {
                final SubLObject _prev_bind_0_$180 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw209$ALL_FORWARD_SUPPORT_MT_COMBINATIONS, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$180, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 98057L)
    public static SubLObject all_forward_support_mt_combinations_int(final SubLObject supports) {
        SubLObject result = (SubLObject)forward.NIL;
        if (forward.NIL == supports) {
            result = (SubLObject)ConsesLow.list((SubLObject)forward.NIL);
        }
        else {
            SubLObject first = (SubLObject)forward.NIL;
            SubLObject rest = (SubLObject)forward.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(supports, supports, (SubLObject)forward.$list210);
            first = supports.first();
            final SubLObject current = rest = supports.rest();
            final SubLObject first_combos = forward_support_mt_combinations(first);
            if (forward.NIL != first_combos) {
                final SubLObject rest_combos = all_forward_support_mt_combinations_int(rest);
                result = list_utilities.mapcar_product(Symbols.symbol_function((SubLObject)forward.$sym211$CONS), first_combos, rest_combos);
            }
            else {
                result = (SubLObject)forward.NIL;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 98824L)
    public static SubLObject forward_support_mt_combinations(final SubLObject support) {
        if (forward.NIL != assertion_handles.assertion_p(support)) {
            return (SubLObject)ConsesLow.list(support);
        }
        return hl_supports.hl_forward_mt_combos(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 98986L)
    public static SubLObject compute_mts_from_supports(final SubLObject supports, SubLObject require_from_listP) {
        if (require_from_listP == forward.UNPROVIDED) {
            require_from_listP = forward.$require_cached_gaf_mt_from_supports$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answer_mts = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw206$COMPUTE_MTS_FROM_SUPPORTS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                thread.resetMultipleValues();
                final SubLObject assume_wff_supports = separate_supports_for_mt_placement(supports);
                final SubLObject compute_where_wff_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject mts_from_assumed_wff_supports = Mapping.mapcar(Symbols.symbol_function((SubLObject)forward.$sym101$SUPPORT_MT), assume_wff_supports);
                if (forward.NIL == compute_where_wff_supports) {
                    answer_mts = forward_mt_placements_from_support_mts(mts_from_assumed_wff_supports, require_from_listP);
                }
                else {
                    SubLObject cdolist_list_var;
                    final SubLObject additional_mt_combinations = cdolist_list_var = all_computed_wff_mt_combinations(compute_where_wff_supports);
                    SubLObject additional_mts = (SubLObject)forward.NIL;
                    additional_mts = cdolist_list_var.first();
                    while (forward.NIL != cdolist_list_var) {
                        answer_mts = conses_high.union(answer_mts, forward_mt_placements_from_support_mts(ConsesLow.append(additional_mts, mts_from_assumed_wff_supports), require_from_listP), (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        additional_mts = cdolist_list_var.first();
                    }
                    if (forward.NIL != answer_mts) {
                        answer_mts = list_utilities.delete_subsumed_items(answer_mts, Symbols.symbol_function((SubLObject)forward.$sym212$SPEC_MT_), (SubLObject)forward.UNPROVIDED);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$181 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw206$COMPUTE_MTS_FROM_SUPPORTS, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$181, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return answer_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 100155L)
    public static SubLObject separate_supports_for_mt_placement(final SubLObject supports) {
        SubLObject assume_wff_supports = (SubLObject)forward.NIL;
        SubLObject compute_where_wff_supports = (SubLObject)forward.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)forward.NIL;
        support = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            if (forward.NIL != compute_where_wff_formulaP(arguments.support_formula(support))) {
                compute_where_wff_supports = (SubLObject)ConsesLow.cons(support, compute_where_wff_supports);
            }
            if (forward.NIL != assume_where_wff_formulaP(arguments.support_formula(support))) {
                assume_wff_supports = (SubLObject)ConsesLow.cons(support, assume_wff_supports);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(assume_wff_supports), Sequences.nreverse(compute_where_wff_supports));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 101100L)
    public static SubLObject compute_where_wff_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != el_utilities.tou_litP(formula) || (forward.NIL != forward.$respect_defining_mt_for_hypothetical_termsP$.getDynamicValue(thread) && forward.NIL != cycl_utilities.expression_find_if((SubLObject)forward.$sym213$HYPOTHETICAL_TERM_P, formula, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 101300L)
    public static SubLObject assume_where_wff_formulaP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(forward.NIL == el_utilities.tou_litP(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 101388L)
    public static SubLObject forward_mt_placements_from_support_mts(SubLObject mts, SubLObject require_from_listP) {
        if (require_from_listP == forward.UNPROVIDED) {
            require_from_listP = (SubLObject)forward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw214$FORWARD_MT_PLACEMENTS_FROM_SUPPORT_MTS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                if (forward.NIL != assertion_utilities.universal_lifting_ruleP(current_forward_inference_rule())) {
                    if (forward.NIL != forward.$forward_inference_debugP$.getDynamicValue(thread)) {
                        Errors.warn((SubLObject)forward.$str215$Skipping_max_floor_mts_call_due_t, el_utilities.sefify(current_forward_inference_rule()));
                    }
                    result = (SubLObject)ConsesLow.list(forward.$const216$BaseKB);
                }
                if (forward.NIL == result) {
                    if (forward.NIL != kb_control_vars.within_forward_inferenceP()) {
                        mts = Sequences.remove(forward.$const35$InferencePSC, mts, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
                    }
                    result = inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mts, (SubLObject)((forward.NIL != require_from_listP) ? mts : forward.NIL));
                    if (forward.NIL != call_forward_inference_browsing_callbackP() && forward.NIL == result) {
                        final SubLObject item_var = (SubLObject)ConsesLow.list((SubLObject)forward.$kw217$NULL_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED, el_utilities.sefify(mts));
                        if (forward.NIL == conses_high.member(item_var, forward.$compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)forward.EQUAL), Symbols.symbol_function((SubLObject)forward.IDENTITY))) {
                            forward.$compute_all_mt_and_support_combinations_exceptions$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, forward.$compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread)), thread);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$182 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw214$FORWARD_MT_PLACEMENTS_FROM_SUPPORT_MTS, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$182, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 102591L)
    public static SubLObject all_computed_wff_mt_combinations(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (forward.NIL != last_metric_type && forward.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward.$kw45$HARNESS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind((SubLObject)forward.$kw218$ALL_COMPUTED_WFF_MT_COMBINATIONS, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward.NIL, thread);
            try {
                result = all_computed_wff_mt_combinations_int(supports);
            }
            finally {
                final SubLObject _prev_bind_0_$183 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)forward.$kw45$HARNESS, (SubLObject)forward.$kw218$ALL_COMPUTED_WFF_MT_COMBINATIONS, (SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$183, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 102857L)
    public static SubLObject all_computed_wff_mt_combinations_int(final SubLObject supports) {
        if (forward.NIL == supports) {
            return (SubLObject)ConsesLow.list((SubLObject)forward.NIL);
        }
        SubLObject first = (SubLObject)forward.NIL;
        SubLObject rest = (SubLObject)forward.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(supports, supports, (SubLObject)forward.$list210);
        first = supports.first();
        final SubLObject current = rest = supports.rest();
        final SubLObject first_combos = computed_wff_mt_combinations(first);
        final SubLObject rest_combos = all_computed_wff_mt_combinations_int(rest);
        return list_utilities.mapcar_product(Symbols.symbol_function((SubLObject)forward.$sym211$CONS), first_combos, rest_combos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 103255L)
    public static SubLObject computed_wff_mt_combinations(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = arguments.support_formula(support);
        return ConsesLow.append(computed_wff_mt_combinations_wrt_term_of_unit(formula), (SubLObject)((forward.NIL != forward.$respect_defining_mt_for_hypothetical_termsP$.getDynamicValue(thread)) ? computed_wff_mt_combinations_wrt_hypothetical_terms(formula) : forward.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 103639L)
    public static SubLObject computed_wff_mt_combinations_wrt_term_of_unit(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nartsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(forward.NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread) || (forward.NIL != kb_control_vars.within_forward_inferenceP() && forward.NIL != current_forward_inference_rule() && forward.NIL != wff.assertive_wff_ruleP(current_forward_inference_rule()))), thread);
            SubLObject result = (SubLObject)forward.NIL;
            if (forward.NIL != el_utilities.tou_litP(formula)) {
                final SubLObject nat = el_utilities.literal_arg2(formula, (SubLObject)forward.UNPROVIDED);
                result = conses_high.copy_list(inference_trampolines.inference_max_floor_mts_of_nat(nat));
                if (forward.NIL != call_forward_inference_browsing_callbackP() && forward.NIL == result) {
                    final SubLObject item_var = (SubLObject)ConsesLow.list((SubLObject)forward.$kw219$NULL_INFERENCE_MAX_FLOOR_MTS_OF_NAT, el_utilities.sefify(nat), wff.why_not_wft(nat, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED));
                    if (forward.NIL == conses_high.member(item_var, forward.$compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)forward.EQUAL), Symbols.symbol_function((SubLObject)forward.IDENTITY))) {
                        forward.$compute_all_mt_and_support_combinations_exceptions$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, forward.$compute_all_mt_and_support_combinations_exceptions$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return result;
        }
        finally {
            at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward.lisp", position = 104341L)
    public static SubLObject computed_wff_mt_combinations_wrt_hypothetical_terms(final SubLObject formula) {
        SubLObject mts = (SubLObject)forward.NIL;
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(formula, (SubLObject)forward.$sym213$HYPOTHETICAL_TERM_P, (SubLObject)forward.NIL, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED, (SubLObject)forward.UNPROVIDED);
        SubLObject hyp_term = (SubLObject)forward.NIL;
        hyp_term = cdolist_list_var.first();
        while (forward.NIL != cdolist_list_var) {
            SubLObject defining_mt = kb_accessors.defining_mt(hyp_term);
            if (forward.NIL == defining_mt) {
                defining_mt = mt_vars.$core_mt_floor$.getGlobalValue();
            }
            mts = (SubLObject)ConsesLow.cons(defining_mt, mts);
            cdolist_list_var = cdolist_list_var.rest();
            hyp_term = cdolist_list_var.first();
        }
        return Sequences.nreverse(mts);
    }
    
    public static SubLObject declare_forward_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_rule_via_trigger_gafsP", "FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "call_forward_inference_browsing_callbackP", "CALL-FORWARD-INFERENCE-BROWSING-CALLBACK?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "call_forward_inference_browsing_callback", "CALL-FORWARD-INFERENCE-BROWSING-CALLBACK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "current_forward_inference_environment", "CURRENT-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "get_forward_inference_environment", "GET-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "free_forward_inference_enviornment", "FREE-FORWARD-INFERENCE-ENVIORNMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "clear_forward_inference_environment", "CLEAR-FORWARD-INFERENCE-ENVIRONMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "new_forward_inference_environment", "NEW-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "queue_global_forward_assertion", "QUEUE-GLOBAL-FORWARD-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "dequeue_global_forward_assertion", "DEQUEUE-GLOBAL-FORWARD-ASSERTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "global_forward_assertion_queue_empty_p", "GLOBAL-FORWARD-ASSERTION-QUEUE-EMPTY-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "clear_global_forward_inference_environment", "CLEAR-GLOBAL-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.forward", "with_currently_forward_propagating_support", "WITH-CURRENTLY-FORWARD-PROPAGATING-SUPPORT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "currently_forward_propagating_supportP", "CURRENTLY-FORWARD-PROPAGATING-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "all_currently_forward_propagating_supports", "ALL-CURRENTLY-FORWARD-PROPAGATING-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "currently_forward_propagating_assertionP", "CURRENTLY-FORWARD-PROPAGATING-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "all_currently_forward_propagating_assertions", "ALL-CURRENTLY-FORWARD-PROPAGATING-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "clear_currently_forward_propagating_supports", "CLEAR-CURRENTLY-FORWARD-PROPAGATING-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "add_currently_forward_propagating_support", "ADD-CURRENTLY-FORWARD-PROPAGATING-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "rem_currently_forward_propagating_support", "REM-CURRENTLY-FORWARD-PROPAGATING-SUPPORT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.forward", "with_forward_inference_source_support", "WITH-FORWARD-INFERENCE-SOURCE-SUPPORT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.forward", "with_forward_inference_rule", "WITH-FORWARD-INFERENCE-RULE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "current_forward_inference_gaf", "CURRENT-FORWARD-INFERENCE-GAF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "current_forward_inference_rule", "CURRENT-FORWARD-INFERENCE-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "current_forward_inference_assertion", "CURRENT-FORWARD-INFERENCE-ASSERTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "current_forward_inference_fully_propagating_ruleP", "CURRENT-FORWARD-INFERENCE-FULLY-PROPAGATING-RULE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_problem_store_properties", "FORWARD-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "new_forward_problem_store", "NEW-FORWARD-PROBLEM-STORE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "destroy_forward_problem_store", "DESTROY-FORWARD-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_shares_same_problem_storeP", "FORWARD-INFERENCE-SHARES-SAME-PROBLEM-STORE?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "get_forward_problem_store", "GET-FORWARD-PROBLEM-STORE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "clear_current_forward_problem_store", "CLEAR-CURRENT-FORWARD-PROBLEM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "clear_current_forward_problem_store_int", "CLEAR-CURRENT-FORWARD-PROBLEM-STORE-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "clear_current_forward_inference_environment", "CLEAR-CURRENT-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "queue_forward_assertion", "QUEUE-FORWARD-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "remqueue_forward_assertion", "REMQUEUE-FORWARD-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "queue_or_repropagate_forward_assertion", "QUEUE-OR-REPROPAGATE-FORWARD-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "queue_or_repropagate_forward_assertions", "QUEUE-OR-REPROPAGATE-FORWARD-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "someone_else_will_process_this_forward_inference_environmentP", "SOMEONE-ELSE-WILL-PROCESS-THIS-FORWARD-INFERENCE-ENVIRONMENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "performing_forward_inferenceP", "PERFORMING-FORWARD-INFERENCE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "perform_forward_inference_now", "PERFORM-FORWARD-INFERENCE-NOW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "perform_forward_inference", "PERFORM-FORWARD-INFERENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "dynamic_forward_inference_to_doP", "DYNAMIC-FORWARD-INFERENCE-TO-DO?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "global_forward_inference_to_doP", "GLOBAL-FORWARD-INFERENCE-TO-DO?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_to_doP", "FORWARD-INFERENCE-TO-DO?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "repropagate_forward_assertion", "REPROPAGATE-FORWARD-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "repropagate_forward_gaf_wrt_rule", "REPROPAGATE-FORWARD-GAF-WRT-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "inference_psc_overriding_termP", "INFERENCE-PSC-OVERRIDING-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "inference_psc_overriding_term_mt", "INFERENCE-PSC-OVERRIDING-TERM-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "inference_psc_overriding_mt_mt", "INFERENCE-PSC-OVERRIDING-MT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "inference_psc_override_mt", "INFERENCE-PSC-OVERRIDE-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "global_forward_propagation_mtP", "GLOBAL-FORWARD-PROPAGATION-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_assertibles_queue", "FORWARD-INFERENCE-ASSERTIBLES-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "note_new_forward_assertible", "NOTE-NEW-FORWARD-ASSERTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_assertion", "FORWARD-PROPAGATE-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_assertion_int", "FORWARD-PROPAGATE-ASSERTION-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagation_permittedP", "FORWARD-PROPAGATION-PERMITTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_support", "FORWARD-PROPAGATE-SUPPORT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_one_support_and_generate_assertibles", "FORWARD-PROPAGATE-ONE-SUPPORT-AND-GENERATE-ASSERTIBLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "clear_forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached", "CLEAR-FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "remove_forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached", "REMOVE-FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_internal", "FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached", "FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_one_support_wrt_rule_and_generate_assertibles", "FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_one_assertion_wrt_rules_and_queue_or_repropagate_assertibles", "FORWARD-PROPAGATE-ONE-ASSERTION-WRT-RULES-AND-QUEUE-OR-REPROPAGATE-ASSERTIBLES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_supports_and_generate_assertibles", "FORWARD-PROPAGATE-SUPPORTS-AND-GENERATE-ASSERTIBLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_support_generate_assertibles", "FORWARD-PROPAGATE-SUPPORT-GENERATE-ASSERTIBLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_handle_batched_assertibles", "FORWARD-PROPAGATE-HANDLE-BATCHED-ASSERTIBLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_support_handle_assertibles", "FORWARD-PROPAGATE-SUPPORT-HANDLE-ASSERTIBLES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_rule", "FORWARD-PROPAGATE-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "support_truth_sense", "SUPPORT-TRUTH-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "support_asent", "SUPPORT-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_asent_support", "FORWARD-PROPAGATE-ASENT-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_asent_tactic_specs", "FORWARD-PROPAGATE-ASENT-TACTIC-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_one_tactic_spec", "FORWARD-PROPAGATE-ONE-TACTIC-SPEC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "make_forward_trigger_supports", "MAKE-FORWARD-TRIGGER-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_allowed_rules", "FORWARD-INFERENCE-ALLOWED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_all_rules_allowedP", "FORWARD-INFERENCE-ALL-RULES-ALLOWED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_rule_allowedP", "FORWARD-INFERENCE-RULE-ALLOWED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_forbidden_rules", "FORWARD-INFERENCE-FORBIDDEN-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_no_rules_forbiddenP", "FORWARD-INFERENCE-NO-RULES-FORBIDDEN?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_rule_forbiddenP", "FORWARD-INFERENCE-RULE-FORBIDDEN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_gaf_internal", "FORWARD-PROPAGATE-GAF-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "handle_forward_propagation_from_gaf", "HANDLE-FORWARD-PROPAGATION-FROM-GAF", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "creation_template_forward_rules_via_exemplars", "CREATION-TEMPLATE-FORWARD-RULES-VIA-EXEMPLARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "creation_template_exemplars", "CREATION-TEMPLATE-EXEMPLARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "creation_template_allowable_rules", "CREATION-TEMPLATE-ALLOWABLE-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "all_genl_creation_templates", "ALL-GENL-CREATION-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "creation_template_allowable_rules_internal", "CREATION-TEMPLATE-ALLOWABLE-RULES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "handle_forward_propagation", "HANDLE-FORWARD-PROPAGATION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "handle_one_forward_propagation", "HANDLE-ONE-FORWARD-PROPAGATION", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_doomed_due_to_null_max_floor_mtsP", "FORWARD-PROPAGATE-DOOMED-DUE-TO-NULL-MAX-FLOOR-MTS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "filter_forward_pragmatic_dnf", "FILTER-FORWARD-PRAGMATIC-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagate_dnf", "FORWARD-PROPAGATE-DNF", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "new_forward_query_from_dnf", "NEW-FORWARD-QUERY-FROM-DNF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "new_cyc_trivial_forward_query_from_dnf", "NEW-CYC-TRIVIAL-FORWARD-QUERY-FROM-DNF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "new_forward_query", "NEW-FORWARD-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_query_properties", "FORWARD-INFERENCE-QUERY-PROPERTIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "trivial_forward_inference_query_properties", "TRIVIAL-FORWARD-INFERENCE-QUERY-PROPERTIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_inference_productivity_limit", "FORWARD-INFERENCE-PRODUCTIVITY-LIMIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "rule_forward_inference_productivity_limit", "RULE-FORWARD-INFERENCE-PRODUCTIVITY-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "add_forward_propagation_result", "ADD-FORWARD-PROPAGATION-RESULT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "add_empty_forward_propagation_result", "ADD-EMPTY-FORWARD-PROPAGATION-RESULT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "new_forward_concluded_supports", "NEW-FORWARD-CONCLUDED-SUPPORTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "add_forward_deductions_from_supports", "ADD-FORWARD-DEDUCTIONS-FROM-SUPPORTS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "handle_forward_deduction_in_mt", "HANDLE-FORWARD-DEDUCTION-IN-MT", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "handle_forward_deduction_in_mt_int", "HANDLE-FORWARD-DEDUCTION-IN-MT-INT", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "handle_forward_deduction_in_mt_as_assertible", "HANDLE-FORWARD-DEDUCTION-IN-MT-AS-ASSERTIBLE", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "handle_forward_deduction_in_mt_as_assertible_int", "HANDLE-FORWARD-DEDUCTION-IN-MT-AS-ASSERTIBLE-INT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forbid_forward_conclusion_in_mtP", "FORBID-FORWARD-CONCLUSION-IN-MT?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "wff_constraint_supportP", "WFF-CONSTRAINT-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "wff_constraint_mtP", "WFF-CONSTRAINT-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "constraint_ruleP", "CONSTRAINT-RULE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "handle_forward_deduction_in_mt_as_constraint", "HANDLE-FORWARD-DEDUCTION-IN-MT-AS-CONSTRAINT", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "verify_forward_deduction_constraint", "VERIFY-FORWARD-DEDUCTION-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "cycl_sentence_for_forward_inference_canonicalP", "CYCL-SENTENCE-FOR-FORWARD-INFERENCE-CANONICAL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "syntactically_valid_forward_dnf", "SYNTACTICALLY-VALID-FORWARD-DNF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "syntactically_valid_forward_non_trigger_asents", "SYNTACTICALLY-VALID-FORWARD-NON-TRIGGER-ASENTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "semantically_valid_forward_dnf", "SEMANTICALLY-VALID-FORWARD-DNF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_leafy_mt_p", "FORWARD-LEAFY-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagation_supports_doomedP", "FORWARD-PROPAGATION-SUPPORTS-DOOMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_propagation_mts_doomedP", "FORWARD-PROPAGATION-MTS-DOOMED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_possibly_some_common_spec_mtP_internal", "FORWARD-POSSIBLY-SOME-COMMON-SPEC-MT?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_possibly_some_common_spec_mtP", "FORWARD-POSSIBLY-SOME-COMMON-SPEC-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "leafy_mt_p", "LEAFY-MT-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "compute_all_mt_and_support_combinations", "COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "compute_decontextualized_support_combinations", "COMPUTE-DECONTEXTUALIZED-SUPPORT-COMBINATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "some_support_combinations_theoretically_possible", "SOME-SUPPORT-COMBINATIONS-THEORETICALLY-POSSIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "some_support_combinations_extensionally_possible", "SOME-SUPPORT-COMBINATIONS-EXTENSIONALLY-POSSIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "all_forward_support_mt_combinations", "ALL-FORWARD-SUPPORT-MT-COMBINATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "all_forward_support_mt_combinations_int", "ALL-FORWARD-SUPPORT-MT-COMBINATIONS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_support_mt_combinations", "FORWARD-SUPPORT-MT-COMBINATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "compute_mts_from_supports", "COMPUTE-MTS-FROM-SUPPORTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "separate_supports_for_mt_placement", "SEPARATE-SUPPORTS-FOR-MT-PLACEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "compute_where_wff_formulaP", "COMPUTE-WHERE-WFF-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "assume_where_wff_formulaP", "ASSUME-WHERE-WFF-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "forward_mt_placements_from_support_mts", "FORWARD-MT-PLACEMENTS-FROM-SUPPORT-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "all_computed_wff_mt_combinations", "ALL-COMPUTED-WFF-MT-COMBINATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "all_computed_wff_mt_combinations_int", "ALL-COMPUTED-WFF-MT-COMBINATIONS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "computed_wff_mt_combinations", "COMPUTED-WFF-MT-COMBINATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "computed_wff_mt_combinations_wrt_term_of_unit", "COMPUTED-WFF-MT-COMBINATIONS-WRT-TERM-OF-UNIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward", "computed_wff_mt_combinations_wrt_hypothetical_terms", "COMPUTED-WFF-MT-COMBINATIONS-WRT-HYPOTHETICAL-TERMS", 1, 0, false);
        return (SubLObject)forward.NIL;
    }
    
    public static SubLObject init_forward_file() {
        forward.$forward_inference_traceP$ = SubLFiles.defparameter("*FORWARD-INFERENCE-TRACE?*", (SubLObject)forward.NIL);
        forward.$tracing_forward_inference$ = SubLFiles.defparameter("*TRACING-FORWARD-INFERENCE*", (SubLObject)forward.NIL);
        forward.$forward_inference_debugP$ = SubLFiles.defparameter("*FORWARD-INFERENCE-DEBUG?*", (SubLObject)forward.NIL);
        forward.$require_cached_gaf_mt_from_supports$ = SubLFiles.defparameter("*REQUIRE-CACHED-GAF-MT-FROM-SUPPORTS*", (SubLObject)forward.NIL);
        forward.$forward_inference_browsing_callback$ = SubLFiles.defvar("*FORWARD-INFERENCE-BROWSING-CALLBACK*", (SubLObject)forward.NIL);
        forward.$forward_inference_browsing_callback_more_infoP$ = SubLFiles.defparameter("*FORWARD-INFERENCE-BROWSING-CALLBACK-MORE-INFO?*", (SubLObject)forward.NIL);
        forward.$block_forward_inferencesP$ = SubLFiles.defvar("*BLOCK-FORWARD-INFERENCES?*", (SubLObject)forward.NIL);
        forward.$forward_inference_asserted_asent_fast_fail_cutoff$ = SubLFiles.deflexical("*FORWARD-INFERENCE-ASSERTED-ASENT-FAST-FAIL-CUTOFF*", (SubLObject)forward.ONE_INTEGER);
        forward.$respect_defining_mt_for_hypothetical_termsP$ = SubLFiles.defparameter("*RESPECT-DEFINING-MT-FOR-HYPOTHETICAL-TERMS?*", (SubLObject)forward.T);
        forward.$support_forward_propagate_rule_via_trigger_gafsP$ = SubLFiles.defparameter("*SUPPORT-FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS?*", (SubLObject)forward.T);
        forward.$forward_propagate_rule_via_trigger_gafs_problem_store_size$ = SubLFiles.defparameter("*FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS-PROBLEM-STORE-SIZE*", (SubLObject)forward.$int0$10000);
        forward.$forward_inference_callback_reasons$ = SubLFiles.defparameter("*FORWARD-INFERENCE-CALLBACK-REASONS*", (SubLObject)forward.$list1);
        forward.$suppressed_forward_inference_callback_reasons$ = SubLFiles.defparameter("*SUPPRESSED-FORWARD-INFERENCE-CALLBACK-REASONS*", (SubLObject)forward.NIL);
        forward.$forced_forward_inference_callback_reasons$ = SubLFiles.defparameter("*FORCED-FORWARD-INFERENCE-CALLBACK-REASONS*", (SubLObject)forward.NIL);
        forward.$global_forward_inference_environment_lock$ = SubLFiles.deflexical("*GLOBAL-FORWARD-INFERENCE-ENVIRONMENT-LOCK*", maybeDefault((SubLObject)forward.$sym6$_GLOBAL_FORWARD_INFERENCE_ENVIRONMENT_LOCK_, forward.$global_forward_inference_environment_lock$, ()->(Locks.make_lock((SubLObject)forward.$str7$Global_forward_inference_environm))));
        forward.$global_forward_inference_environment$ = SubLFiles.defparameter("*GLOBAL-FORWARD-INFERENCE-ENVIRONMENT*", queues.create_queue((SubLObject)forward.UNPROVIDED));
        forward.$currently_forward_propagating_supports$ = SubLFiles.deflexical("*CURRENTLY-FORWARD-PROPAGATING-SUPPORTS*", maybeDefault((SubLObject)forward.$sym8$_CURRENTLY_FORWARD_PROPAGATING_SUPPORTS_, forward.$currently_forward_propagating_supports$, ()->(set.new_set(Symbols.symbol_function((SubLObject)forward.EQUAL), (SubLObject)forward.UNPROVIDED))));
        forward.$currently_forward_propagating_supports_lock$ = SubLFiles.deflexical("*CURRENTLY-FORWARD-PROPAGATING-SUPPORTS-LOCK*", Locks.make_lock((SubLObject)forward.$str9$Currently_Forward_Propagating_Sup));
        forward.$forward_inference_gaf$ = SubLFiles.defparameter("*FORWARD-INFERENCE-GAF*", (SubLObject)forward.NIL);
        forward.$forward_inference_rule$ = SubLFiles.defparameter("*FORWARD-INFERENCE-RULE*", (SubLObject)forward.NIL);
        forward.$forward_problem_store_properties$ = SubLFiles.deflexical("*FORWARD-PROBLEM-STORE-PROPERTIES*", (SubLObject)forward.$list23);
        forward.$forward_inference_shares_same_problem_storeP$ = SubLFiles.defparameter("*FORWARD-INFERENCE-SHARES-SAME-PROBLEM-STORE?*", (SubLObject)forward.T);
        forward.$forward_inference_recursion_depth$ = SubLFiles.defparameter("*FORWARD-INFERENCE-RECURSION-DEPTH*", (SubLObject)forward.ZERO_INTEGER);
        forward.$someone_else_will_process_this_forward_inference_environment$ = SubLFiles.defparameter("*SOMEONE-ELSE-WILL-PROCESS-THIS-FORWARD-INFERENCE-ENVIRONMENT*", (SubLObject)forward.NIL);
        forward.$someone_else_will_process_the_global_forward_inference_environmentP$ = SubLFiles.defparameter("*SOMEONE-ELSE-WILL-PROCESS-THE-GLOBAL-FORWARD-INFERENCE-ENVIRONMENT?*", (SubLObject)forward.NIL);
        forward.$default_forward_propagation_mt$ = SubLFiles.defparameter("*DEFAULT-FORWARD-PROPAGATION-MT*", forward.$const35$InferencePSC);
        forward.$allow_forward_propagation_mt_overrideP$ = SubLFiles.defparameter("*ALLOW-FORWARD-PROPAGATION-MT-OVERRIDE?*", (SubLObject)forward.NIL);
        forward.$debug_forward_propagation_mt_overrideP$ = SubLFiles.defparameter("*DEBUG-FORWARD-PROPAGATION-MT-OVERRIDE?*", (SubLObject)forward.NIL);
        forward.$forward_inference_assertibles_queue$ = SubLFiles.defparameter("*FORWARD-INFERENCE-ASSERTIBLES-QUEUE*", (SubLObject)forward.NIL);
        forward.$forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$ = SubLFiles.deflexical("*FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED-CACHING-STATE*", (SubLObject)forward.NIL);
        forward.$type_filter_forward_dnf$ = SubLFiles.defparameter("*TYPE-FILTER-FORWARD-DNF*", (SubLObject)forward.T);
        forward.$forward_non_trigger_literal_restricted_examine_asent$ = SubLFiles.defparameter("*FORWARD-NON-TRIGGER-LITERAL-RESTRICTED-EXAMINE-ASENT*", (SubLObject)forward.NIL);
        forward.$handle_one_forward_propagation_callback$ = SubLFiles.defparameter("*HANDLE-ONE-FORWARD-PROPAGATION-CALLBACK*", (SubLObject)forward.NIL);
        forward.$check_forward_propagate_doomed_due_to_null_max_floor_mtsP$ = SubLFiles.defparameter("*CHECK-FORWARD-PROPAGATE-DOOMED-DUE-TO-NULL-MAX-FLOOR-MTS?*", (SubLObject)forward.T);
        forward.$forward_leafy_mt_threshold$ = SubLFiles.defparameter("*FORWARD-LEAFY-MT-THRESHOLD*", (SubLObject)forward.MINUS_ONE_INTEGER);
        forward.$forward_inference_show_propagation_results_progress_cutoff$ = SubLFiles.defparameter("*FORWARD-INFERENCE-SHOW-PROPAGATION-RESULTS-PROGRESS-CUTOFF*", (SubLObject)forward.$int113$5000);
        forward.$forward_inference_overriding_query_properties$ = SubLFiles.defparameter("*FORWARD-INFERENCE-OVERRIDING-QUERY-PROPERTIES*", (SubLObject)forward.NIL);
        forward.$rule_forward_inference_productivity_aggressive_whacking_modeP$ = SubLFiles.defparameter("*RULE-FORWARD-INFERENCE-PRODUCTIVITY-AGGRESSIVE-WHACKING-MODE?*", (SubLObject)forward.NIL);
        forward.$minimum_rule_forward_inference_productivity_limit$ = SubLFiles.defparameter("*MINIMUM-RULE-FORWARD-INFERENCE-PRODUCTIVITY-LIMIT*", (SubLObject)forward.$int0$10000);
        forward.$assertive_wff_rule_whacking_factor$ = SubLFiles.defparameter("*ASSERTIVE-WFF-RULE-WHACKING-FACTOR*", (SubLObject)forward.$int138$200);
        forward.$old_rule_without_dependents_or_bookkeeping_whacking_factor$ = SubLFiles.defparameter("*OLD-RULE-WITHOUT-DEPENDENTS-OR-BOOKKEEPING-WHACKING-FACTOR*", (SubLObject)forward.$int139$150000);
        forward.$old_rule_without_dependents_whacking_compensation_factor$ = SubLFiles.defparameter("*OLD-RULE-WITHOUT-DEPENDENTS-WHACKING-COMPENSATION-FACTOR*", (SubLObject)forward.$int140$1000);
        forward.$compute_decontextualized_deduction_mtP$ = SubLFiles.defvar("*COMPUTE-DECONTEXTUALIZED-DEDUCTION-MT?*", (SubLObject)forward.T);
        forward.$add_forward_deductions_from_supports_callback$ = SubLFiles.defparameter("*ADD-FORWARD-DEDUCTIONS-FROM-SUPPORTS-CALLBACK*", (SubLObject)forward.NIL);
        forward.$assume_forward_deduction_is_wfP$ = SubLFiles.defvar("*ASSUME-FORWARD-DEDUCTION-IS-WF?*", (SubLObject)forward.NIL);
        forward.$forward_constraint_inference_enabledP$ = SubLFiles.defvar("*FORWARD-CONSTRAINT-INFERENCE-ENABLED?*", (SubLObject)forward.NIL);
        forward.$compute_all_mt_and_support_combinations_exceptions$ = SubLFiles.defparameter("*COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS-EXCEPTIONS*", (SubLObject)forward.NIL);
        forward.$verify_some_support_combinations_possible$ = SubLFiles.defparameter("*VERIFY-SOME-SUPPORT-COMBINATIONS-POSSIBLE*", (SubLObject)forward.T);
        return (SubLObject)forward.NIL;
    }
    
    public static SubLObject setup_forward_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)forward.$sym6$_GLOBAL_FORWARD_INFERENCE_ENVIRONMENT_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)forward.$sym8$_CURRENTLY_FORWARD_PROPAGATING_SUPPORTS_);
        memoization_state.note_globally_cached_function((SubLObject)forward.$sym50$FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_C);
        utilities_macros.note_funcall_helper_function((SubLObject)forward.$sym190$WFF_CONSTRAINT_SUPPORT_);
        memoization_state.note_memoized_function((SubLObject)forward.$sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_);
        return (SubLObject)forward.NIL;
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
    
    static {
        me = (SubLFile)new forward();
        forward.$forward_inference_traceP$ = null;
        forward.$tracing_forward_inference$ = null;
        forward.$forward_inference_debugP$ = null;
        forward.$require_cached_gaf_mt_from_supports$ = null;
        forward.$forward_inference_browsing_callback$ = null;
        forward.$forward_inference_browsing_callback_more_infoP$ = null;
        forward.$block_forward_inferencesP$ = null;
        forward.$forward_inference_asserted_asent_fast_fail_cutoff$ = null;
        forward.$respect_defining_mt_for_hypothetical_termsP$ = null;
        forward.$support_forward_propagate_rule_via_trigger_gafsP$ = null;
        forward.$forward_propagate_rule_via_trigger_gafs_problem_store_size$ = null;
        forward.$forward_inference_callback_reasons$ = null;
        forward.$suppressed_forward_inference_callback_reasons$ = null;
        forward.$forced_forward_inference_callback_reasons$ = null;
        forward.$global_forward_inference_environment_lock$ = null;
        forward.$global_forward_inference_environment$ = null;
        forward.$currently_forward_propagating_supports$ = null;
        forward.$currently_forward_propagating_supports_lock$ = null;
        forward.$forward_inference_gaf$ = null;
        forward.$forward_inference_rule$ = null;
        forward.$forward_problem_store_properties$ = null;
        forward.$forward_inference_shares_same_problem_storeP$ = null;
        forward.$forward_inference_recursion_depth$ = null;
        forward.$someone_else_will_process_this_forward_inference_environment$ = null;
        forward.$someone_else_will_process_the_global_forward_inference_environmentP$ = null;
        forward.$default_forward_propagation_mt$ = null;
        forward.$allow_forward_propagation_mt_overrideP$ = null;
        forward.$debug_forward_propagation_mt_overrideP$ = null;
        forward.$forward_inference_assertibles_queue$ = null;
        forward.$forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached_caching_state$ = null;
        forward.$type_filter_forward_dnf$ = null;
        forward.$forward_non_trigger_literal_restricted_examine_asent$ = null;
        forward.$handle_one_forward_propagation_callback$ = null;
        forward.$check_forward_propagate_doomed_due_to_null_max_floor_mtsP$ = null;
        forward.$forward_leafy_mt_threshold$ = null;
        forward.$forward_inference_show_propagation_results_progress_cutoff$ = null;
        forward.$forward_inference_overriding_query_properties$ = null;
        forward.$rule_forward_inference_productivity_aggressive_whacking_modeP$ = null;
        forward.$minimum_rule_forward_inference_productivity_limit$ = null;
        forward.$assertive_wff_rule_whacking_factor$ = null;
        forward.$old_rule_without_dependents_or_bookkeeping_whacking_factor$ = null;
        forward.$old_rule_without_dependents_whacking_compensation_factor$ = null;
        forward.$compute_decontextualized_deduction_mtP$ = null;
        forward.$add_forward_deductions_from_supports_callback$ = null;
        forward.$assume_forward_deduction_is_wfP$ = null;
        forward.$forward_constraint_inference_enabledP$ = null;
        forward.$compute_all_mt_and_support_combinations_exceptions$ = null;
        forward.$verify_some_support_combinations_possible$ = null;
        $int0$10000 = SubLObjectFactory.makeInteger(10000);
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SYNTACTICALLY-INVALID-FORWARD-NON-TRIGGER-ASENT"), SubLObjectFactory.makeKeyword("SYNTACTICALLY-INVALID-FORWARD-TRIGGER-ASENT"), SubLObjectFactory.makeKeyword("SYNTACTICALLY-INVALID-TERM-OF-UNIT"), SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-ASSERTED-SENTENCE-ASENT"), SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-COMPLETE-EXTENT-ASSERTED-ASENT"), SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-ISA-ASENT"), SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-GENLS-ASENT"), SubLObjectFactory.makeKeyword("NULL-MAX-FLOOR-MTS-OF-RULE-AND-GAF-MTS"), SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-CLOSED-ASENT-VIA-QUERY"), SubLObjectFactory.makeKeyword("CONCLUDED-ASENT-NOT-HL-GROUND-TREE"), SubLObjectFactory.makeKeyword("NULL-MT-SUPPORT-COMBINATIONS"), SubLObjectFactory.makeKeyword("INVALID-LIFT"), SubLObjectFactory.makeKeyword("INVALID-PLACEMENT"), SubLObjectFactory.makeKeyword("FORWARD-BINDINGS-ABNORMAL"), SubLObjectFactory.makeKeyword("FORWARD-BINDINGS-EXCEPTED"), SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-FORBIDDEN-IN-MT"), SubLObjectFactory.makeKeyword("INVALIDATED-SUPPORT"), SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-TAUTOLOGICAL"), SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-CONTRADICTION"), SubLObjectFactory.makeKeyword("CZER-INVALIDATED-SUPPORT"), SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-NOT-WF"), SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-TRIVIALLY-DERIVABLE") });
        $kw2$REASON = SubLObjectFactory.makeKeyword("REASON");
        $kw3$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $str4$______S__ = SubLObjectFactory.makeString("~&;; ~S~%");
        $str5$_repropagate_forward_gaf_wrt_rule = SubLObjectFactory.makeString("(repropagate-forward-gaf-wrt-rule~%  ~S~%  ~S)~%");
        $sym6$_GLOBAL_FORWARD_INFERENCE_ENVIRONMENT_LOCK_ = SubLObjectFactory.makeSymbol("*GLOBAL-FORWARD-INFERENCE-ENVIRONMENT-LOCK*");
        $str7$Global_forward_inference_environm = SubLObjectFactory.makeString("Global forward inference environment lock");
        $sym8$_CURRENTLY_FORWARD_PROPAGATING_SUPPORTS_ = SubLObjectFactory.makeSymbol("*CURRENTLY-FORWARD-PROPAGATING-SUPPORTS*");
        $str9$Currently_Forward_Propagating_Sup = SubLObjectFactory.makeString("Currently Forward Propagating Supports Lock");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$SUPPORT_VAR = SubLObjectFactory.makeUninternedSymbol("SUPPORT-VAR");
        $sym12$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym13$WITH_CURRENTLY_FORWARD_PROPAGATING_SUPPORT = SubLObjectFactory.makeSymbol("WITH-CURRENTLY-FORWARD-PROPAGATING-SUPPORT");
        $sym14$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym15$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym16$ADD_CURRENTLY_FORWARD_PROPAGATING_SUPPORT = SubLObjectFactory.makeSymbol("ADD-CURRENTLY-FORWARD-PROPAGATING-SUPPORT");
        $sym17$REM_CURRENTLY_FORWARD_PROPAGATING_SUPPORT = SubLObjectFactory.makeSymbol("REM-CURRENTLY-FORWARD-PROPAGATING-SUPPORT");
        $sym18$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym19$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym20$_FORWARD_INFERENCE_GAF_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-GAF*");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym22$_FORWARD_INFERENCE_RULE_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-RULE*");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), forward.NIL, SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), SubLObjectFactory.makeKeyword("NONE"), SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?"), forward.NIL, SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), forward.T, SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("FORWARD") });
        $kw24$MAX_PROBLEM_COUNT = SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT");
        $kw25$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym26$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str27$Did_not_clear_problem_store__S_si = SubLObjectFactory.makeString("Did not clear problem store ~S since it contained a running inference!");
        $str28$___S = SubLObjectFactory.makeString("~%~S");
        $sym29$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $sym30$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str31$Forward_inference_recursion_probl = SubLObjectFactory.makeString("Forward inference recursion problem? depth = ~S");
        $sym32$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $sym33$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $kw34$NONE = SubLObjectFactory.makeKeyword("NONE");
        $const35$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const36$termForwardPropagationOverrideMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termForwardPropagationOverrideMt"));
        $const37$mtHasForwardPropagationOverrideMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtHasForwardPropagationOverrideMt"));
        $const38$ruleRestrictedToSingleInstancesOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleRestrictedToSingleInstancesOfCol"));
        $sym39$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str40$Could_not_find_forward_inference_ = SubLObjectFactory.makeString("Could not find forward inference override for ~S for rule ~S (gaf=~S)");
        $str41$More_than_one_override_mt_for__S_ = SubLObjectFactory.makeString("More than one override-mt for ~S in ~S for rule ~S");
        $str42$More_than_one_instance_of__S_in__ = SubLObjectFactory.makeString("More than one instance of ~S in ~S for rule ~S");
        $const43$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $str44$inference_psc_override_mt___S = SubLObjectFactory.makeString("inference-psc-override-mt: ~S");
        $kw45$HARNESS = SubLObjectFactory.makeKeyword("HARNESS");
        $kw46$FORWARD_PROPAGATE_SUPPORT = SubLObjectFactory.makeKeyword("FORWARD-PROPAGATE-SUPPORT");
        $kw47$NO_GAF = SubLObjectFactory.makeKeyword("NO-GAF");
        $kw48$NO_RULE = SubLObjectFactory.makeKeyword("NO-RULE");
        $kw49$FORWARD_PROPAGATE_ONE_SUPPORT_AND_GENERATE_ASSERTIBLES = SubLObjectFactory.makeKeyword("FORWARD-PROPAGATE-ONE-SUPPORT-AND-GENERATE-ASSERTIBLES");
        $sym50$FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_C = SubLObjectFactory.makeSymbol("FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED");
        $sym51$_FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTIBLES_ = SubLObjectFactory.makeSymbol("*FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED-CACHING-STATE*");
        $int52$32 = SubLObjectFactory.makeInteger(32);
        $sym53$CLEAR_FORWARD_PROPAGATE_ONE_SUPPORT_WRT_RULE_AND_GENERATE_ASSERTI = SubLObjectFactory.makeSymbol("CLEAR-FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED");
        $sym54$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $kw55$FORWARD_PROPAGATE_SUPPORT_GENERATE_ASSERTIBLES = SubLObjectFactory.makeKeyword("FORWARD-PROPAGATE-SUPPORT-GENERATE-ASSERTIBLES");
        $int56$30 = SubLObjectFactory.makeInteger(30);
        $str57$__Propagating__S_ = SubLObjectFactory.makeString("~&Propagating ~S ");
        $str58$_____A_assertible__P = SubLObjectFactory.makeString(" ;; ~A assertible~:P");
        $str59$Assertion__s_was_removed_by_its_o = SubLObjectFactory.makeString("Assertion ~s was removed by its own forward propagation");
        $sym60$INVALID_ASSERTION_ = SubLObjectFactory.makeSymbol("INVALID-ASSERTION?");
        $str61$invalid_assertion_in_hl_assertibl = SubLObjectFactory.makeString("invalid assertion in hl-assertible ~s encountered during forward inference");
        $sym62$ASSERTION_ID = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $sym63$INVALID_KB_HL_SUPPORT_ = SubLObjectFactory.makeSymbol("INVALID-KB-HL-SUPPORT?");
        $str64$invalid_kb_hl_support_in_hl_asser = SubLObjectFactory.makeString("invalid kb hl support in hl-assertible ~s encountered during forward inference");
        $sym65$KB_HL_SUPPORT_ID = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-ID");
        $kw66$HL_ADD_ASSERTIBLE = SubLObjectFactory.makeKeyword("HL-ADD-ASSERTIBLE");
        $str67$_S_does_not_have_an_atomic_senten = SubLObjectFactory.makeString("~S does not have an atomic sentence.");
        $kw68$FORWARD_TACTIC_SPECS = SubLObjectFactory.makeKeyword("FORWARD-TACTIC-SPECS");
        $kw69$OVERHEAD = SubLObjectFactory.makeKeyword("OVERHEAD");
        $kw70$POS = SubLObjectFactory.makeKeyword("POS");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("EXAMINE-ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ADDITIONAL-SUPPORTS"));
        $kw72$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym73$VALID_ASSERTION_ = SubLObjectFactory.makeSymbol("VALID-ASSERTION?");
        $kw74$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw75$FORWARD_INFERENCE_RULE_ALLOWED_ = SubLObjectFactory.makeKeyword("FORWARD-INFERENCE-RULE-ALLOWED?");
        $kw76$FORWARD_INFERENCE_RULE_FORBIDDEN_ = SubLObjectFactory.makeKeyword("FORWARD-INFERENCE-RULE-FORBIDDEN?");
        $kw77$FORWARD_PROPAGATE_GAF_INTERNAL = SubLObjectFactory.makeKeyword("FORWARD-PROPAGATE-GAF-INTERNAL");
        $kw78$POSSIBLY_SIMPLIFY_IST_SENTENCES_FOR_UNIFY = SubLObjectFactory.makeKeyword("POSSIBLY-SIMPLIFY-IST-SENTENCES-FOR-UNIFY");
        $kw79$GAF_ASENT_UNIFY = SubLObjectFactory.makeKeyword("GAF-ASENT-UNIFY");
        $kw80$HANDLE_FORWARD_PROPAGATION_FROM_GAF = SubLObjectFactory.makeKeyword("HANDLE-FORWARD-PROPAGATION-FROM-GAF");
        $const81$creationTemplateFORTs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("creationTemplateFORTs"));
        $kw82$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym83$_TEMPLATE = SubLObjectFactory.makeSymbol("?TEMPLATE");
        $const84$genlCreationTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlCreationTemplate"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TEMPLATE"));
        $const86$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const87$creationTemplateAllowableRules = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("creationTemplateAllowableRules"));
        $const88$creationTemplateAllowsAllRulesFro = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("creationTemplateAllowsAllRulesFromMt"));
        $kw89$MT = SubLObjectFactory.makeKeyword("MT");
        $kw90$RULE = SubLObjectFactory.makeKeyword("RULE");
        $kw91$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $str92$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym93$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw94$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw95$TRIGGER_BINDINGS = SubLObjectFactory.makeKeyword("TRIGGER-BINDINGS");
        $kw96$TRIGGER_SUPPORTS = SubLObjectFactory.makeKeyword("TRIGGER-SUPPORTS");
        $kw97$FORWARD_RESULTS = SubLObjectFactory.makeKeyword("FORWARD-RESULTS");
        $kw98$ANSWER_COUNT = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $kw99$FORWARD_PROPAGATION_SUPPORTS_DOOMED = SubLObjectFactory.makeKeyword("FORWARD-PROPAGATION-SUPPORTS-DOOMED");
        $kw100$SUPPORT_MTS = SubLObjectFactory.makeKeyword("SUPPORT-MTS");
        $sym101$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $kw102$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw103$INFERENCE_REJECTED = SubLObjectFactory.makeKeyword("INFERENCE-REJECTED");
        $kw104$SYNTACTICALLY_INVALID_FORWARD_DNF = SubLObjectFactory.makeKeyword("SYNTACTICALLY-INVALID-FORWARD-DNF");
        $kw105$TARGET_ASENT = SubLObjectFactory.makeKeyword("TARGET-ASENT");
        $kw106$TARGET_TRUTH = SubLObjectFactory.makeKeyword("TARGET-TRUTH");
        $kw107$SEMANTICALLY_INVALID_FORWARD_DNF = SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-FORWARD-DNF");
        $kw108$NULL_MAX_FLOOR_MTS_OF_RULE_AND_GAF_MTS = SubLObjectFactory.makeKeyword("NULL-MAX-FLOOR-MTS-OF-RULE-AND-GAF-MTS");
        $kw109$RULE_MT = SubLObjectFactory.makeKeyword("RULE-MT");
        $kw110$GAF_MT = SubLObjectFactory.makeKeyword("GAF-MT");
        $kw111$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $sym112$FORWARD_PRAGMATIC_TRIGGER_LITERAL_LIT_ = SubLObjectFactory.makeSymbol("FORWARD-PRAGMATIC-TRIGGER-LITERAL-LIT?");
        $int113$5000 = SubLObjectFactory.makeInteger(5000);
        $kw114$FORWARD_PROPAGATE_DNF = SubLObjectFactory.makeKeyword("FORWARD-PROPAGATE-DNF");
        $kw115$EXHAUST_TOTAL = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $str116$Propagating_results = SubLObjectFactory.makeString("Propagating results");
        $str117$Propagating_ = SubLObjectFactory.makeString("Propagating ");
        $str118$_results_for_ = SubLObjectFactory.makeString(" results for ");
        $str119$____ = SubLObjectFactory.makeString(" -> ");
        $str120$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw121$FORWARD_PROPAGATE_RULE_VIA_TRIGGER_GAFS = SubLObjectFactory.makeKeyword("FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS");
        $str122$Forward_inference_incomplete_for_ = SubLObjectFactory.makeString("Forward inference incomplete for ~S and ~S due to: ~A");
        $kw123$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $str124$Tried_to_do_forward_inference_out = SubLObjectFactory.makeString("Tried to do forward inference outside of a problem store");
        $kw125$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw126$NON_EXPLANATORY_SENTENCE = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE");
        $kw127$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw128$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw129$BLOCK_ = SubLObjectFactory.makeKeyword("BLOCK?");
        $kw130$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $kw131$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $kw132$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw133$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw134$PROOF = SubLObjectFactory.makeKeyword("PROOF");
        $kw135$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw136$BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS");
        $kw137$NEW_TERMS_ALLOWED_ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $int138$200 = SubLObjectFactory.makeInteger(200);
        $int139$150000 = SubLObjectFactory.makeInteger(150000);
        $int140$1000 = SubLObjectFactory.makeInteger(1000);
        $kw141$ADD_FORWARD_PROPAGATION_RESULT = SubLObjectFactory.makeKeyword("ADD-FORWARD-PROPAGATION-RESULT");
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PRAGMATIC-SUPPORTS"));
        $kw143$CONCLUDED_ASENT_NOT_HL_GROUND_TREE = SubLObjectFactory.makeKeyword("CONCLUDED-ASENT-NOT-HL-GROUND-TREE");
        $kw144$ASENT = SubLObjectFactory.makeKeyword("ASENT");
        $list145 = ConsesLow.list((SubLObject)forward.NIL, (SubLObject)forward.NIL, (SubLObject)forward.NIL);
        $kw146$NULL_MT_SUPPORT_COMBINATIONS = SubLObjectFactory.makeKeyword("NULL-MT-SUPPORT-COMBINATIONS");
        $kw147$FORM = SubLObjectFactory.makeKeyword("FORM");
        $sym148$COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS = SubLObjectFactory.makeSymbol("COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS");
        $kw149$FAILURE_REASONS = SubLObjectFactory.makeKeyword("FAILURE-REASONS");
        $kw150$INVALID_LIFT = SubLObjectFactory.makeKeyword("INVALID-LIFT");
        $kw151$PROPAGATION_MT = SubLObjectFactory.makeKeyword("PROPAGATION-MT");
        $kw152$MT_SUPPORT_COMBINATIONS = SubLObjectFactory.makeKeyword("MT-SUPPORT-COMBINATIONS");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONCLUDED-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-COMBINATION"));
        $kw154$NO_MT_SUPPORT_COMBINATION_CONCLUDED_MTS_FOUND = SubLObjectFactory.makeKeyword("NO-MT-SUPPORT-COMBINATION-CONCLUDED-MTS-FOUND");
        $kw155$FAILURE_REASON = SubLObjectFactory.makeKeyword("FAILURE-REASON");
        $kw156$INVALID_PLACEMENT = SubLObjectFactory.makeKeyword("INVALID-PLACEMENT");
        $sym157$CONCLUDED_ASENT = SubLObjectFactory.makeSymbol("CONCLUDED-ASENT");
        $sym158$PROPAGATION_MT = SubLObjectFactory.makeSymbol("PROPAGATION-MT");
        $kw159$CONCLUDED_MT = SubLObjectFactory.makeKeyword("CONCLUDED-MT");
        $sym160$CONCLUDED_MT = SubLObjectFactory.makeSymbol("CONCLUDED-MT");
        $kw161$HANDLE_FORWARD_DEDUCTION_IN_MT = SubLObjectFactory.makeKeyword("HANDLE-FORWARD-DEDUCTION-IN-MT");
        $kw162$PLACEMENT_MT = SubLObjectFactory.makeKeyword("PLACEMENT-MT");
        $kw163$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $kw164$PRAGMATIC_SUPPORTS = SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORTS");
        $kw165$FORWARD_BINDINGS_ABNORMAL_ = SubLObjectFactory.makeKeyword("FORWARD-BINDINGS-ABNORMAL?");
        $kw166$FORWARD_BINDINGS_ABNORMAL = SubLObjectFactory.makeKeyword("FORWARD-BINDINGS-ABNORMAL");
        $kw167$SUPPORTS_CONTAIN_EXCEPTED_ASSERTION_IN_MT_ = SubLObjectFactory.makeKeyword("SUPPORTS-CONTAIN-EXCEPTED-ASSERTION-IN-MT?");
        $kw168$FORWARD_BINDINGS_EXCEPTED = SubLObjectFactory.makeKeyword("FORWARD-BINDINGS-EXCEPTED");
        $sym169$CONSTRAINT_RULE_ = SubLObjectFactory.makeSymbol("CONSTRAINT-RULE?");
        $kw170$FORBID_FORWARD_CONCLUSION_IN_MT_ = SubLObjectFactory.makeKeyword("FORBID-FORWARD-CONCLUSION-IN-MT?");
        $kw171$FORWARD_CONCLUSION_FORBIDDEN_IN_MT = SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-FORBIDDEN-IN-MT");
        $str172$Something_between_queueing_and_pr = SubLObjectFactory.makeString("Something between queueing and processing of ~s in ~s invalidated the forward supports ~s");
        $kw173$INVALIDATED_SUPPORT = SubLObjectFactory.makeKeyword("INVALIDATED-SUPPORT");
        $kw174$CANONICALIZE_WF_GAF = SubLObjectFactory.makeKeyword("CANONICALIZE-WF-GAF");
        $kw175$CANONICALIZE_GAF = SubLObjectFactory.makeKeyword("CANONICALIZE-GAF");
        $const176$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $kw177$FORWARD_CONCLUSION_TAUTOLOGICAL = SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-TAUTOLOGICAL");
        $const178$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $kw179$FORWARD_CONCLUSION_CONTRADICTION = SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-CONTRADICTION");
        $str180$Canonicalization_of__s_in__s_inva = SubLObjectFactory.makeString("Canonicalization of ~s in ~s invalidated the forward supports ~s");
        $kw181$CZER_INVALIDATED_SUPPORT = SubLObjectFactory.makeKeyword("CZER-INVALIDATED-SUPPORT");
        $str182$Forward_conclusion_not_WFF______S = SubLObjectFactory.makeString("Forward conclusion not WFF:~%  ~S~%because:~%  ~S~%");
        $kw183$FORWARD_CONCLUSION_NOT_WF = SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-NOT-WF");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANON-CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING-LIST"));
        $sym185$CNF_P = SubLObjectFactory.makeSymbol("CNF-P");
        $kw186$FORWARD_CONCLUSION_TRIVIALLY_DERIVABLE = SubLObjectFactory.makeKeyword("FORWARD-CONCLUSION-TRIVIALLY-DERIVABLE");
        $sym187$CORE_MICROTHEORY_P = SubLObjectFactory.makeSymbol("CORE-MICROTHEORY-P");
        $kw188$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $sym189$ASSERTIVE_WFF_RULE_ = SubLObjectFactory.makeSymbol("ASSERTIVE-WFF-RULE?");
        $sym190$WFF_CONSTRAINT_SUPPORT_ = SubLObjectFactory.makeSymbol("WFF-CONSTRAINT-SUPPORT?");
        $const191$WFFConstraintPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WFFConstraintPredicate"));
        $const192$wffConstraintMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wffConstraintMt"));
        $const193$constraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constraint"));
        $kw194$FORWARD_DEDUCTION_CONSTRAINT_VIOLATION = SubLObjectFactory.makeKeyword("FORWARD-DEDUCTION-CONSTRAINT-VIOLATION");
        $sym195$FORWARD_TRIGGER_LITERAL_LIT_ = SubLObjectFactory.makeSymbol("FORWARD-TRIGGER-LITERAL-LIT?");
        $const196$forwardTriggerLiteral = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardTriggerLiteral"));
        $kw197$SYNTACTICALLY_INVALID_FORWARD_TRIGGER_ASENT = SubLObjectFactory.makeKeyword("SYNTACTICALLY-INVALID-FORWARD-TRIGGER-ASENT");
        $sym198$FORWARD_NON_TRIGGER_LITERAL_LIT_ = SubLObjectFactory.makeSymbol("FORWARD-NON-TRIGGER-LITERAL-LIT?");
        $const199$forwardNonTriggerLiteral = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardNonTriggerLiteral"));
        $kw200$SYNTACTICALLY_INVALID_FORWARD_NON_TRIGGER_ASENT = SubLObjectFactory.makeKeyword("SYNTACTICALLY-INVALID-FORWARD-NON-TRIGGER-ASENT");
        $sym201$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $sym202$FORWARD_LEAFY_MT_P = SubLObjectFactory.makeSymbol("FORWARD-LEAFY-MT-P");
        $sym203$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_ = SubLObjectFactory.makeSymbol("FORWARD-POSSIBLY-SOME-COMMON-SPEC-MT?");
        $list204 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEAFY-MT"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LEAFY-MTS"));
        $kw205$COMPUTE_ALL_MT_AND_SUPPORT_COMBINATIONS = SubLObjectFactory.makeKeyword("COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS");
        $kw206$COMPUTE_MTS_FROM_SUPPORTS = SubLObjectFactory.makeKeyword("COMPUTE-MTS-FROM-SUPPORTS");
        $kw207$SOME_SUPPORT_COMBINATIONS_EXTENSIONALLY_POSSIBLE = SubLObjectFactory.makeKeyword("SOME-SUPPORT-COMBINATIONS-EXTENSIONALLY-POSSIBLE");
        $sym208$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $kw209$ALL_FORWARD_SUPPORT_MT_COMBINATIONS = SubLObjectFactory.makeKeyword("ALL-FORWARD-SUPPORT-MT-COMBINATIONS");
        $list210 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $sym211$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym212$SPEC_MT_ = SubLObjectFactory.makeSymbol("SPEC-MT?");
        $sym213$HYPOTHETICAL_TERM_P = SubLObjectFactory.makeSymbol("HYPOTHETICAL-TERM-P");
        $kw214$FORWARD_MT_PLACEMENTS_FROM_SUPPORT_MTS = SubLObjectFactory.makeKeyword("FORWARD-MT-PLACEMENTS-FROM-SUPPORT-MTS");
        $str215$Skipping_max_floor_mts_call_due_t = SubLObjectFactory.makeString("Skipping max-floor-mts call due to universal lifting rule: ~S");
        $const216$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw217$NULL_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED = SubLObjectFactory.makeKeyword("NULL-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED");
        $kw218$ALL_COMPUTED_WFF_MT_COMBINATIONS = SubLObjectFactory.makeKeyword("ALL-COMPUTED-WFF-MT-COMBINATIONS");
        $kw219$NULL_INFERENCE_MAX_FLOOR_MTS_OF_NAT = SubLObjectFactory.makeKeyword("NULL-INFERENCE-MAX-FLOOR-MTS-OF-NAT");
    }
}

/*

	Total time: 2693 ms
	
*/