package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_enumerated_types extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types";
    public static final String myFingerPrint = "8d0cf9bbcec6bb641bac6468b8957449605a5e104af755f585416598dc1cbc57";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4830L)
    private static SubLSymbol $specially_handled_inference_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5296L)
    private static SubLSymbol $non_inference_query_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6183L)
    private static SubLSymbol $arete_query_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6648L)
    private static SubLSymbol $removal_ask_query_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 7349L)
    private static SubLSymbol $inference_static_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12961L)
    private static SubLSymbol $inference_allows_hl_predicate_transformation_by_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13257L)
    private static SubLSymbol $inference_allows_unbound_predicate_transformation_by_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13573L)
    private static SubLSymbol $inference_allows_evaluatable_predicate_transformation_by_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13905L)
    private static SubLSymbol $inference_allows_indeterminate_results_by_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14259L)
    private static SubLSymbol $default_allowed_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14444L)
    private static SubLSymbol $default_forbidden_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14637L)
    private static SubLSymbol $default_allowed_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14831L)
    private static SubLSymbol $inference_allows_abnormality_checking_by_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 15101L)
    private static SubLSymbol $inference_resource_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16517L)
    public static SubLSymbol $default_max_number$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16690L)
    public static SubLSymbol $default_max_time$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16855L)
    public static SubLSymbol $default_max_step$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17146L)
    public static SubLSymbol $default_forward_max_time$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17341L)
    public static SubLSymbol $default_max_proof_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17534L)
    public static SubLSymbol $default_max_transformation_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17761L)
    public static SubLSymbol $default_min_rule_utility$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17959L)
    public static SubLSymbol $default_probably_approximately_done$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 18198L)
    private static SubLSymbol $inference_other_dynamic_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22558L)
    public static SubLSymbol $default_inference_metrics_template$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23049L)
    private static SubLSymbol $strategy_static_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24179L)
    public static SubLSymbol $default_removal_backtracking_productivity_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24661L)
    public static SubLSymbol $default_proof_spec$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24906L)
    private static SubLSymbol $strategy_dynamic_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25796L)
    public static SubLSymbol $default_productivity_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 27085L)
    private static SubLSymbol $problem_store_static_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32324L)
    private static SubLSymbol $problem_store_dynamic_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32883L)
    private static SubLSymbol $inference_meta_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 34268L)
    private static SubLSymbol $inference_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35182L)
    private static SubLSymbol $continuable_inference_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35388L)
    private static SubLSymbol $avoided_inference_reasons$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35725L)
    private static SubLSymbol $inference_suspend_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37333L)
    private static SubLSymbol $continuable_inference_suspend_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37888L)
    private static SubLSymbol $exhausted_inference_suspend_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39385L)
    private static SubLSymbol $tactical_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39856L)
    private static SubLSymbol $provability_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 40144L)
    private static SubLSymbol $problem_status_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42157L)
    private static SubLSymbol $ordered_tactical_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42649L)
    private static SubLSymbol $union_ordered_tactical_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45338L)
    private static SubLSymbol $add_restriction_layer_of_indirection_by_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45758L)
    private static SubLSymbol $negation_by_failure_by_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46509L)
    private static SubLSymbol $evaluate_subl_allowed_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46816L)
    private static SubLSymbol $rewrite_allowed_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47136L)
    private static SubLSymbol $abduction_allowed_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47414L)
    public static SubLSymbol $new_terms_allowed_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47692L)
    public static SubLSymbol $compute_answer_justifications_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48055L)
    public static SubLSymbol $default_inference_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48167L)
    private static SubLSymbol $inference_modes$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48624L)
    private static SubLSymbol $problem_link_types$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49092L)
    private static SubLSymbol $default_problem_store_name$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49427L)
    public static SubLSymbol $default_equality_reasoning_method$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49629L)
    private static SubLSymbol $problem_store_equality_reasoning_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50214L)
    public static SubLSymbol $default_equality_reasoning_domain$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50409L)
    private static SubLSymbol $problem_store_equality_reasoning_domains$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51038L)
    private static SubLSymbol $default_intermediate_step_validation_level$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51313L)
    private static SubLSymbol $intermediate_step_validation_levels$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52049L)
    public static SubLSymbol $default_max_problem_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52405L)
    private static SubLSymbol $removal_allowed_by_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52646L)
    private static SubLSymbol $transformation_allowed_by_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52922L)
    public static SubLSymbol $default_problem_store_inference_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53070L)
    private static SubLSymbol $inference_directions$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53529L)
    private static SubLSymbol $tactic_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53805L)
    private static SubLSymbol $tactic_types$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54954L)
    private static SubLSymbol $ordered_completenesses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57210L)
    private static SubLSymbol $productivity_to_number_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60260L)
    private static SubLSymbol $proof_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60511L)
    private static SubLSymbol $proof_reject_reasons$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61068L)
    private static SubLSymbol $destructibility_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 62353L)
    private static SubLSymbol $balancing_tactician_strategy_type_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 66397L)
    private static SubLSymbol $legacy_strategy_type_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 67816L)
    private static SubLSymbol $strategy_type_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68535L)
    private static SubLSymbol $inference_return_types$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68967L)
    public static SubLSymbol $inference_default_return_type$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70017L)
    private static SubLSymbol $inference_answer_languages$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70193L)
    public static SubLSymbol $inference_default_answer_language$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70557L)
    private static SubLSymbol $result_uniqueness_criteria$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70832L)
    public static SubLSymbol $default_result_uniqueness_criterion$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71175L)
    private static SubLSymbol $inference_disjunction_free_el_vars_policies$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71534L)
    public static SubLSymbol $default_inference_disjunction_free_el_vars_policy$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72141L)
    private static SubLSymbol $inference_transitive_closure_modes$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72590L)
    private static SubLSymbol $inference_transitive_closure_mode_default$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72965L)
    public static SubLSymbol $maintain_term_working_set_defaultP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73293L)
    public static SubLSymbol $inference_events_default$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73501L)
    private static SubLSymbol $inference_event_types$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74255L)
    private static SubLSymbol $inference_halt_conditions_default$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74524L)
    private static SubLSymbol $inference_halt_conditions$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74915L)
    private static SubLSymbol $inference_accumulator_types$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75752L)
    private static SubLSymbol $inference_default_forget_extra_resultsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76267L)
    private static SubLSymbol $inference_default_cache_inference_resultsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76624L)
    public static SubLSymbol $inference_default_browsableP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77013L)
    public static SubLSymbol $inference_default_continuableP$;
    private static final SubLSymbol $sym0$QUERY_PROPERTY_P;
    private static final SubLSymbol $sym1$ALL_QUERY_PROPERTIES;
    private static final SubLString $str2$Return_a_list_of_all_the_query_pr;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$QUERY_STATIC_PROPERTY_P;
    private static final SubLSymbol $sym5$QUERY_STATIC_OR_META_PROPERTY_P;
    private static final SubLSymbol $sym6$QUERY_DYNAMIC_PROPERTY_P;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$INFERENCE_PROPERTY_P;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$INFERENCE_STATIC_PROPERTY_P;
    private static final SubLSymbol $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P;
    private static final SubLSymbol $kw15$PROBLEM_STORE;
    private static final SubLSymbol $kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_;
    private static final SubLSymbol $kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
    private static final SubLSymbol $kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
    private static final SubLSymbol $kw19$ALLOW_INDETERMINATE_RESULTS_;
    private static final SubLSymbol $kw20$ALL;
    private static final SubLSymbol $kw21$ALLOWED_RULES;
    private static final SubLSymbol $kw22$NONE;
    private static final SubLSymbol $kw23$FORBIDDEN_RULES;
    private static final SubLSymbol $kw24$ALLOWED_MODULES;
    private static final SubLSymbol $kw25$ALLOW_ABNORMALITY_CHECKING_;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$INFERENCE_RESOURCE_CONSTRAINT_P;
    private static final SubLSymbol $kw28$MAX_NUMBER;
    private static final SubLSymbol $kw29$MAX_TIME;
    private static final SubLSymbol $kw30$MAX_STEP;
    private static final SubLSymbol $kw31$INFERENCE_MODE;
    private static final SubLSymbol $kw32$FORWARD_MAX_TIME;
    private static final SubLSymbol $kw33$MAX_PROOF_DEPTH;
    private static final SubLSymbol $kw34$MAX_TRANSFORMATION_DEPTH;
    private static final SubLInteger $int35$_100;
    private static final SubLSymbol $kw36$MIN_RULE_UTILITY;
    private static final SubLSymbol $kw37$PROBABLY_APPROXIMATELY_DONE;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$INFERENCE_DYNAMIC_PROPERTY_P;
    private static final SubLSymbol $kw40$METRICS;
    private static final SubLSymbol $sym41$STRATEGY_PROPERTY_P;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$STRATEGY_STATIC_PROPERTY_P;
    private static final SubLSymbol $kw44$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $kw45$ANYTHING;
    private static final SubLSymbol $kw46$PROOF_SPEC;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$STRATEGY_DYNAMIC_PROPERTY_P;
    private static final SubLInteger $int49$100;
    private static final SubLSymbol $kw50$PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $sym51$PROBLEM_STORE_PROPERTY_P;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$PROBLEM_STORE_STATIC_PROPERTY_P;
    private static final SubLSymbol $sym54$PROBLEM_STORE_DYNAMIC_PROPERTY_P;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$INFERENCE_META_PROPERTY_P;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$INFERENCE_STATUS_P;
    private static final SubLSymbol $kw62$SUSPENDED;
    private static final SubLSymbol $kw63$TAUTOLOGY;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLSymbol $kw66$ERROR;
    private static final SubLSymbol $sym67$STRINGP;
    private static final SubLSymbol $kw68$JUSTIFICATION;
    private static final SubLSymbol $sym69$HL_JUSTIFICATION_LIST_P;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$SECOND;
    private static final SubLList $list74;
    private static final SubLString $str75$No_match_to_combine__s_and__s;
    private static final SubLSymbol $kw76$GOOD;
    private static final SubLSymbol $kw77$NO_GOOD;
    private static final SubLSymbol $kw78$NEUTRAL;
    private static final SubLSymbol $kw79$UNEXAMINED;
    private static final SubLSymbol $kw80$EXAMINED;
    private static final SubLSymbol $kw81$POSSIBLE;
    private static final SubLSymbol $kw82$PENDING;
    private static final SubLSymbol $kw83$FINISHED;
    private static final SubLSymbol $kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static final SubLSymbol $kw85$NEGATION_BY_FAILURE_;
    private static final SubLSymbol $kw86$COMPLETENESS_MINIMIZATION_ALLOWED_;
    private static final SubLSymbol $kw87$EVALUATE_SUBL_ALLOWED_;
    private static final SubLSymbol $kw88$REWRITE_ALLOWED_;
    private static final SubLSymbol $kw89$ABDUCTION_ALLOWED_;
    private static final SubLSymbol $kw90$NEW_TERMS_ALLOWED_;
    private static final SubLSymbol $kw91$COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static final SubLSymbol $kw92$CUSTOM;
    private static final SubLList $list93;
    private static final SubLList $list94;
    private static final SubLSymbol $kw95$PROBLEM_STORE_NAME;
    private static final SubLSymbol $kw96$CZER_EQUAL;
    private static final SubLList $list97;
    private static final SubLSymbol $kw98$EQUALITY_REASONING_METHOD;
    private static final SubLList $list99;
    private static final SubLSymbol $kw100$EQUALITY_REASONING_DOMAIN;
    private static final SubLList $list101;
    private static final SubLSymbol $kw102$INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static final SubLInteger $int103$100000;
    private static final SubLSymbol $kw104$MAX_PROBLEM_COUNT;
    private static final SubLSymbol $kw105$REMOVAL_ALLOWED_;
    private static final SubLSymbol $kw106$TRANSFORMATION_ALLOWED_;
    private static final SubLSymbol $kw107$BACKWARD;
    private static final SubLList $list108;
    private static final SubLSymbol $kw109$DIRECTION;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLSymbol $kw112$REMOVAL;
    private static final SubLSymbol $kw113$TRANSFORMATION;
    private static final SubLSymbol $kw114$STRUCTURAL;
    private static final SubLSymbol $kw115$REMOVAL_CONJUNCTIVE;
    private static final SubLSymbol $kw116$REWRITE;
    private static final SubLSymbol $kw117$META_REMOVAL;
    private static final SubLString $str118$HL_Module_of_unknown_type___s;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$COMPLETENESS_P;
    private static final SubLSymbol $kw121$COMPLETE;
    private static final SubLString $str122$Complete;
    private static final SubLSymbol $kw123$INCOMPLETE;
    private static final SubLString $str124$Incomplete;
    private static final SubLSymbol $kw125$GROSSLY_INCOMPLETE;
    private static final SubLString $str126$Grossly_Incomplete;
    private static final SubLSymbol $kw127$IMPOSSIBLE;
    private static final SubLString $str128$Impossible;
    private static final SubLString $str129$Unexpected_completeness__a;
    private static final SubLSymbol $sym130$COMPLETENESS__;
    private static final SubLSymbol $sym131$COMPLETENESS__;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$PRODUCTIVITY_P;
    private static final SubLList $list134;
    private static final SubLList $list135;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$DESTRUCTIBILITY_STATUS_P;
    private static final SubLSymbol $kw138$INDESTRUCTIBLE;
    private static final SubLString $str139$Indestructible;
    private static final SubLSymbol $kw140$DESTRUCTIBLE;
    private static final SubLString $str141$Destructible;
    private static final SubLSymbol $kw142$UNKNOWN;
    private static final SubLString $str143$Unknown;
    private static final SubLString $str144$Unexpected_destructibility_status;
    private static final SubLString $str145$I;
    private static final SubLString $str146$;
    private static final SubLString $str147$_;
    private static final SubLList $list148;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$STRATEGY_TYPE_PROPERTY_P;
    private static final SubLSymbol $kw151$MUST_OVERRIDE;
    private static final SubLString $str152$Strategy_must_implement_method__s;
    private static final SubLList $list153;
    private static final SubLSymbol $kw154$BINDINGS;
    private static final SubLSymbol $kw155$TEMPLATE;
    private static final SubLSymbol $kw156$FORMAT;
    private static final SubLSymbol $kw157$RETURN;
    private static final SubLList $list158;
    private static final SubLSymbol $kw159$EL;
    private static final SubLSymbol $kw160$ANSWER_LANGUAGE;
    private static final SubLList $list161;
    private static final SubLSymbol $kw162$RESULT_UNIQUENESS;
    private static final SubLList $list163;
    private static final SubLSymbol $kw164$REQUIRE_EQUAL;
    private static final SubLSymbol $kw165$DISJUNCTION_FREE_EL_VARS_POLICY;
    private static final SubLList $list166;
    private static final SubLSymbol $kw167$TRANSITIVE_CLOSURE_MODE;
    private static final SubLSymbol $kw168$MAINTAIN_TERM_WORKING_SET_;
    private static final SubLSymbol $kw169$EVENTS;
    private static final SubLList $list170;
    private static final SubLSymbol $kw171$HALT_CONDITIONS;
    private static final SubLList $list172;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$INFERENCE_ACCUMULATOR_TYPE_P;
    private static final SubLSymbol $kw175$FORGET_EXTRA_RESULTS_;
    private static final SubLSymbol $kw176$CACHE_INFERENCE_RESULTS_;
    private static final SubLSymbol $kw177$BROWSABLE_;
    private static final SubLSymbol $kw178$CONTINUABLE_;
    private static final SubLSymbol $kw179$BLOCK_;
    private static final SubLSymbol $kw180$UNSPECIFIED;
    private static final SubLSymbol $kw181$CONDITIONAL_SENTENCE_;
    private static final SubLSymbol $kw182$NON_EXPLANATORY_SENTENCE;
    private static final SubLSymbol $sym183$INFERENCE_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 1747L)
    public static SubLObject query_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != query_static_property_p(v_object) || inference_datastructures_enumerated_types.NIL != query_dynamic_property_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2079L)
    public static SubLObject query_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym0$QUERY_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2175L)
    public static SubLObject all_query_properties() {
        return ConsesLow.nconc(all_query_static_properties(), all_query_dynamic_properties());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2402L)
    public static SubLObject merge_query_properties(SubLObject query_properties, final SubLObject overriding_query_properties) {
        if (inference_datastructures_enumerated_types.NIL != overriding_query_properties) {
            query_properties = conses_high.copy_list(query_properties);
            SubLObject remainder;
            SubLObject property;
            SubLObject value;
            for (remainder = (SubLObject)inference_datastructures_enumerated_types.NIL, remainder = overriding_query_properties; inference_datastructures_enumerated_types.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                property = remainder.first();
                value = conses_high.cadr(remainder);
                query_properties = conses_high.putf(query_properties, property, value);
            }
        }
        return query_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2801L)
    public static SubLObject query_static_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != inference_static_property_p(v_object) || inference_datastructures_enumerated_types.NIL != problem_store_static_property_p(v_object) || inference_datastructures_enumerated_types.NIL != strategy_static_property_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3011L)
    public static SubLObject query_static_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym4$QUERY_STATIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3121L)
    public static SubLObject extract_query_static_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym4$QUERY_STATIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3442L)
    public static SubLObject all_query_static_properties() {
        return ConsesLow.nconc(all_inference_static_properties(), all_problem_store_static_properties(), all_strategy_static_properties());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3701L)
    public static SubLObject query_static_or_meta_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != query_static_property_p(v_object) || inference_datastructures_enumerated_types.NIL != inference_meta_property_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3846L)
    public static SubLObject query_static_or_meta_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym5$QUERY_STATIC_OR_META_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3972L)
    public static SubLObject extract_query_static_or_meta_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym5$QUERY_STATIC_OR_META_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4112L)
    public static SubLObject query_dynamic_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != inference_dynamic_property_p(v_object) || inference_datastructures_enumerated_types.NIL != problem_store_dynamic_property_p(v_object) || inference_datastructures_enumerated_types.NIL != strategy_dynamic_property_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4328L)
    public static SubLObject query_dynamic_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym6$QUERY_DYNAMIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4440L)
    public static SubLObject extract_query_dynamic_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym6$QUERY_DYNAMIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4566L)
    public static SubLObject all_query_dynamic_properties() {
        return ConsesLow.nconc(all_inference_dynamic_properties(), all_problem_store_dynamic_properties(), all_strategy_dynamic_properties());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5579L)
    public static SubLObject query_metric_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isKeyword() && (inference_datastructures_enumerated_types.NIL != list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$specially_handled_inference_metrics$.getGlobalValue()) || inference_datastructures_enumerated_types.NIL != list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$non_inference_query_metrics$.getGlobalValue()) || inference_datastructures_enumerated_types.NIL != inference_metrics.inference_metric_nameP(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5819L)
    public static SubLObject inference_query_metric_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != query_metric_p(v_object) && inference_datastructures_enumerated_types.NIL == subl_promotions.memberP(v_object, inference_datastructures_enumerated_types.$non_inference_query_metrics$.getGlobalValue(), (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5969L)
    public static SubLObject all_query_metrics() {
        return ConsesLow.append(inference_metrics.inference_metric_names(), inference_datastructures_enumerated_types.$specially_handled_inference_metrics$.getGlobalValue(), inference_datastructures_enumerated_types.$non_inference_query_metrics$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6377L)
    public static SubLObject arete_query_metric_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$arete_query_metrics$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6474L)
    public static SubLObject all_arete_query_metrics() {
        return conses_high.copy_list(inference_datastructures_enumerated_types.$arete_query_metrics$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6940L)
    public static SubLObject removal_ask_query_metric_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$removal_ask_query_metrics$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 7049L)
    public static SubLObject inference_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != inference_static_property_p(v_object) || inference_datastructures_enumerated_types.NIL != inference_dynamic_property_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 7245L)
    public static SubLObject inference_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym11$INFERENCE_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11745L)
    public static SubLObject inference_static_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_static_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11857L)
    public static SubLObject inference_static_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym13$INFERENCE_STATIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11975L)
    public static SubLObject extract_inference_static_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym13$INFERENCE_STATIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12107L)
    public static SubLObject all_inference_static_properties() {
        return conses_high.copy_list(inference_datastructures_enumerated_types.$inference_static_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12289L)
    public static SubLObject inference_static_or_meta_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != inference_static_property_p(v_object) || inference_datastructures_enumerated_types.NIL != inference_meta_property_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12442L)
    public static SubLObject inference_static_or_meta_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym14$INFERENCE_STATIC_OR_META_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12576L)
    public static SubLObject extract_inference_static_or_meta_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym14$INFERENCE_STATIC_OR_META_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12724L)
    public static SubLObject inference_properties_problem_store(final SubLObject v_properties) {
        final SubLObject raw_value = conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw15$PROBLEM_STORE, (SubLObject)inference_datastructures_enumerated_types.NIL);
        if (inference_datastructures_enumerated_types.NIL != subl_promotions.non_negative_integer_p(raw_value)) {
            return inference_datastructures_problem_store.find_problem_store_by_id(raw_value);
        }
        return raw_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13047L)
    public static SubLObject inference_properties_allow_hl_predicate_transformationP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_, inference_datastructures_enumerated_types.$inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13348L)
    public static SubLObject inference_properties_allow_unbound_predicate_transformationP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, inference_datastructures_enumerated_types.$inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13668L)
    public static SubLObject inference_properties_allow_evaluatable_predicate_transformationP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, inference_datastructures_enumerated_types.$inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14067L)
    public static SubLObject inference_properties_allow_indeterminate_resultsP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw19$ALLOW_INDETERMINATE_RESULTS_, inference_datastructures_enumerated_types.$inference_allows_indeterminate_results_by_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14311L)
    public static SubLObject inference_properties_allowed_rules(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw21$ALLOWED_RULES, inference_datastructures_enumerated_types.$default_allowed_rules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14498L)
    public static SubLObject inference_properties_forbidden_rules(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw23$FORBIDDEN_RULES, inference_datastructures_enumerated_types.$default_forbidden_rules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14692L)
    public static SubLObject inference_properties_allowed_modules(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw24$ALLOWED_MODULES, inference_datastructures_enumerated_types.$default_allowed_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14912L)
    public static SubLObject inference_properties_allow_abnormality_checkingP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw25$ALLOW_ABNORMALITY_CHECKING_, inference_datastructures_enumerated_types.$inference_allows_abnormality_checking_by_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16132L)
    public static SubLObject inference_resource_constraint_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_resource_constraints$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16253L)
    public static SubLObject inference_resource_constraints_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym27$INFERENCE_RESOURCE_CONSTRAINT_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16378L)
    public static SubLObject extract_inference_resource_constraints(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym27$INFERENCE_RESOURCE_CONSTRAINT_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16566L)
    public static SubLObject inference_properties_max_number(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw28$MAX_NUMBER, inference_datastructures_enumerated_types.$default_max_number$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16737L)
    public static SubLObject inference_properties_max_time(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw29$MAX_TIME, inference_datastructures_enumerated_types.$default_max_time$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16902L)
    public static SubLObject inference_properties_max_step(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw30$MAX_STEP, inference_datastructures_enumerated_types.$default_max_step$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17020L)
    public static SubLObject inference_properties_mode(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw31$INFERENCE_MODE, inference_datastructures_enumerated_types.$default_inference_mode$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17199L)
    public static SubLObject inference_properties_forward_max_time(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw32$FORWARD_MAX_TIME, inference_datastructures_enumerated_types.$default_forward_max_time$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17395L)
    public static SubLObject inference_properties_max_proof_depth(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw33$MAX_PROOF_DEPTH, inference_datastructures_enumerated_types.$default_max_proof_depth$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17595L)
    public static SubLObject inference_properties_max_transformation_depth(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw34$MAX_TRANSFORMATION_DEPTH, inference_datastructures_enumerated_types.$default_max_transformation_depth$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17817L)
    public static SubLObject inference_properties_min_rule_utility(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw36$MIN_RULE_UTILITY, inference_datastructures_enumerated_types.$default_min_rule_utility$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 18023L)
    public static SubLObject inference_properties_probably_approximately_done(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw37$PROBABLY_APPROXIMATELY_DONE, inference_datastructures_enumerated_types.$default_probably_approximately_done$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 21881L)
    public static SubLObject inference_dynamic_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != inference_resource_constraint_p(v_object) || inference_datastructures_enumerated_types.NIL != list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_other_dynamic_properties$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22053L)
    public static SubLObject inference_dynamic_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym39$INFERENCE_DYNAMIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22173L)
    public static SubLObject extract_inference_dynamic_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym39$INFERENCE_DYNAMIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22307L)
    public static SubLObject all_inference_dynamic_properties() {
        return ConsesLow.nconc(conses_high.copy_list(inference_datastructures_enumerated_types.$inference_other_dynamic_properties$.getGlobalValue()), conses_high.copy_list(inference_datastructures_enumerated_types.$inference_resource_constraints$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22623L)
    public static SubLObject inference_properties_metrics(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw40$METRICS, inference_datastructures_enumerated_types.$default_inference_metrics_template$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22757L)
    public static SubLObject strategy_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != strategy_static_property_p(v_object) || inference_datastructures_enumerated_types.NIL != strategy_dynamic_property_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22947L)
    public static SubLObject strategy_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym41$STRATEGY_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23644L)
    public static SubLObject strategy_static_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$strategy_static_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23754L)
    public static SubLObject strategy_static_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym43$STRATEGY_STATIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23870L)
    public static SubLObject extract_strategy_static_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym43$STRATEGY_STATIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24000L)
    public static SubLObject all_strategy_static_properties() {
        return conses_high.copy_list(inference_datastructures_enumerated_types.$strategy_static_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24444L)
    public static SubLObject strategy_static_properties_removal_backtracking_productivity_limit(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw44$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24776L)
    public static SubLObject strategy_static_properties_proof_spec(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw46$PROOF_SPEC, inference_datastructures_enumerated_types.$default_proof_spec$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25252L)
    public static SubLObject strategy_dynamic_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$strategy_dynamic_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25364L)
    public static SubLObject strategy_dynamic_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym48$STRATEGY_DYNAMIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25482L)
    public static SubLObject extract_strategy_dynamic_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym48$STRATEGY_DYNAMIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25614L)
    public static SubLObject all_strategy_dynamic_properties() {
        return conses_high.copy_list(inference_datastructures_enumerated_types.$strategy_dynamic_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26244L)
    public static SubLObject strategy_dynamic_properties_productivity_limit(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw50$PRODUCTIVITY_LIMIT, inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26399L)
    public static SubLObject problem_store_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != problem_store_static_property_p(v_object) || inference_datastructures_enumerated_types.NIL != problem_store_dynamic_property_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26621L)
    public static SubLObject problem_store_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym51$PROBLEM_STORE_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26733L)
    public static SubLObject all_problem_store_properties() {
        return ConsesLow.nconc(all_problem_store_static_properties(), all_problem_store_dynamic_properties());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26959L)
    public static SubLObject extract_problem_store_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym51$PROBLEM_STORE_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31706L)
    public static SubLObject problem_store_static_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$problem_store_static_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31864L)
    public static SubLObject problem_store_static_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym53$PROBLEM_STORE_STATIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31990L)
    public static SubLObject extract_problem_store_static_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym53$PROBLEM_STORE_STATIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32130L)
    public static SubLObject all_problem_store_static_properties() {
        return conses_high.copy_list(inference_datastructures_enumerated_types.$problem_store_static_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32437L)
    public static SubLObject problem_store_dynamic_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$problem_store_dynamic_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32559L)
    public static SubLObject problem_store_dynamic_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)inference_datastructures_enumerated_types.$sym54$PROBLEM_STORE_DYNAMIC_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32687L)
    public static SubLObject all_problem_store_dynamic_properties() {
        return conses_high.copy_list(inference_datastructures_enumerated_types.$problem_store_dynamic_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33434L)
    public static SubLObject inference_meta_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_meta_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33542L)
    public static SubLObject all_inference_meta_properties() {
        return conses_high.copy_list(inference_datastructures_enumerated_types.$inference_meta_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33640L)
    public static SubLObject extract_inference_meta_properties(final SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, (SubLObject)inference_datastructures_enumerated_types.$sym56$INFERENCE_META_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33768L)
    public static SubLObject query_halt_reason_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != inference_suspend_status_p(v_object) || inference_datastructures_enumerated_types.NIL != avoided_inference_reason_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 34111L)
    public static SubLObject exhausted_query_halt_reason_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != exhausted_inference_suspend_status_p(v_object) || inference_datastructures_enumerated_types.NIL != avoided_inference_reason_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35088L)
    public static SubLObject inference_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_statuses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35270L)
    public static SubLObject continuable_inference_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$continuable_inference_statuses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35616L)
    public static SubLObject avoided_inference_reason_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$avoided_inference_reasons$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 36822L)
    public static SubLObject inference_suspend_status_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_suspend_statuses$.getGlobalValue()) || inference_datastructures_enumerated_types.NIL != list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_halt_conditions$.getGlobalValue()) || inference_datastructures_enumerated_types.NIL != inference_error_suspend_status_p(v_object) || inference_datastructures_enumerated_types.NIL != inference_justification_status_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37085L)
    public static SubLObject inference_suspend_status_applicableP(final SubLObject status) {
        assert inference_datastructures_enumerated_types.NIL != inference_status_p(status) : status;
        return (SubLObject)SubLObjectFactory.makeBoolean(status == inference_datastructures_enumerated_types.$kw62$SUSPENDED || status == inference_datastructures_enumerated_types.$kw63$TAUTOLOGY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37555L)
    public static SubLObject continuable_inference_suspend_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$continuable_inference_suspend_statuses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38044L)
    public static SubLObject exhausted_inference_suspend_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$exhausted_inference_suspend_statuses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38174L)
    public static SubLObject inference_error_suspend_status_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != list_utilities.doubletonP(v_object) && inference_datastructures_enumerated_types.$kw66$ERROR == v_object.first() && conses_high.second(v_object).isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38463L)
    public static SubLObject new_inference_error_suspend_status(final SubLObject message) {
        assert inference_datastructures_enumerated_types.NIL != Types.stringp(message) : message;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_enumerated_types.$kw66$ERROR, message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38589L)
    public static SubLObject inference_error_suspend_status_message(final SubLObject error_status) {
        return conses_high.second(error_status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38710L)
    public static SubLObject inference_justification_status_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && inference_datastructures_enumerated_types.$kw68$JUSTIFICATION == v_object.first() && inference_datastructures_enumerated_types.NIL != arguments.hl_justification_list_p(v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39084L)
    public static SubLObject new_inference_justification_status(final SubLObject message) {
        assert inference_datastructures_enumerated_types.NIL != arguments.hl_justification_list_p(message) : message;
        return (SubLObject)ConsesLow.cons((SubLObject)inference_datastructures_enumerated_types.$kw68$JUSTIFICATION, message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39234L)
    public static SubLObject inference_justification_status_message(final SubLObject justification_status) {
        return justification_status.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39764L)
    public static SubLObject tactical_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$tactical_statuses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 40046L)
    public static SubLObject provability_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$provability_statuses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42347L)
    public static SubLObject tactical_status_weakerP(final SubLObject status1, final SubLObject status2) {
        return list_utilities.position_L(status1, status2, inference_datastructures_enumerated_types.$ordered_tactical_statuses$.getGlobalValue(), (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42535L)
    public static SubLObject tactical_status_strongerP(final SubLObject status1, final SubLObject status2) {
        return tactical_status_weakerP(status2, status1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42902L)
    public static SubLObject tactical_status_unionP(final SubLObject status1, final SubLObject status2) {
        return list_utilities.position_L(status1, status2, inference_datastructures_enumerated_types.$union_ordered_tactical_statuses$.getGlobalValue(), (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43144L)
    public static SubLObject problem_status_p(final SubLObject v_object) {
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.$problem_status_table$.getGlobalValue();
        SubLObject triple = (SubLObject)inference_datastructures_enumerated_types.NIL;
        triple = cdolist_list_var.first();
        while (inference_datastructures_enumerated_types.NIL != cdolist_list_var) {
            if (v_object.eql(triple.first())) {
                return (SubLObject)inference_datastructures_enumerated_types.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43357L)
    public static SubLObject problem_status_from_tactical_status_and_provability_status(final SubLObject tactical_status, final SubLObject provability_status) {
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.$problem_status_table$.getGlobalValue();
        SubLObject triple = (SubLObject)inference_datastructures_enumerated_types.NIL;
        triple = cdolist_list_var.first();
        while (inference_datastructures_enumerated_types.NIL != cdolist_list_var) {
            if (tactical_status.eql(conses_high.second(triple)) && provability_status.eql(conses_high.third(triple))) {
                return triple.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        }
        Errors.error((SubLObject)inference_datastructures_enumerated_types.$str75$No_match_to_combine__s_and__s, tactical_status, provability_status);
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43719L)
    public static SubLObject tactical_status_from_problem_status(final SubLObject status) {
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.$problem_status_table$.getGlobalValue();
        SubLObject triple = (SubLObject)inference_datastructures_enumerated_types.NIL;
        triple = cdolist_list_var.first();
        while (inference_datastructures_enumerated_types.NIL != cdolist_list_var) {
            if (status.eql(triple.first())) {
                return conses_high.second(triple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44007L)
    public static SubLObject provability_status_from_problem_status(final SubLObject status) {
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.$problem_status_table$.getGlobalValue();
        SubLObject triple = (SubLObject)inference_datastructures_enumerated_types.NIL;
        triple = cdolist_list_var.first();
        while (inference_datastructures_enumerated_types.NIL != cdolist_list_var) {
            if (status.eql(triple.first())) {
                return conses_high.third(triple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44308L)
    public static SubLObject good_problem_status_p(final SubLObject status) {
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw76$GOOD, provability_status_from_problem_status(status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44472L)
    public static SubLObject no_good_problem_status_p(final SubLObject status) {
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw77$NO_GOOD, provability_status_from_problem_status(status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44596L)
    public static SubLObject neutral_problem_status_p(final SubLObject status) {
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw78$NEUTRAL, provability_status_from_problem_status(status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44720L)
    public static SubLObject unexamined_problem_status_p(final SubLObject status) {
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw79$UNEXAMINED, tactical_status_from_problem_status(status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44848L)
    public static SubLObject examined_problem_status_p(final SubLObject status) {
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw80$EXAMINED, tactical_status_from_problem_status(status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44971L)
    public static SubLObject possible_problem_status_p(final SubLObject status) {
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw81$POSSIBLE, tactical_status_from_problem_status(status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45094L)
    public static SubLObject pending_problem_status_p(final SubLObject status) {
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw82$PENDING, tactical_status_from_problem_status(status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45215L)
    public static SubLObject finished_problem_status_p(final SubLObject status) {
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw83$FINISHED, tactical_status_from_problem_status(status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45546L)
    public static SubLObject problem_store_properties_add_restriction_layer_of_indirectionP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, inference_datastructures_enumerated_types.$add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45898L)
    public static SubLObject problem_store_properties_negation_by_failureP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw85$NEGATION_BY_FAILURE_, inference_datastructures_enumerated_types.$negation_by_failure_by_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46059L)
    public static SubLObject problem_store_properties_completeness_minimization_allowedP(final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw86$COMPLETENESS_MINIMIZATION_ALLOWED_, control_vars.$complete_extent_minimization$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46652L)
    public static SubLObject problem_store_properties_evaluate_subl_allowedP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw87$EVALUATE_SUBL_ALLOWED_, inference_datastructures_enumerated_types.$evaluate_subl_allowed_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46990L)
    public static SubLObject problem_store_properties_rewrite_allowedP(final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw88$REWRITE_ALLOWED_, inference_datastructures_enumerated_types.$rewrite_allowed_defaultP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47262L)
    public static SubLObject problem_store_properties_abduction_allowedP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw89$ABDUCTION_ALLOWED_, inference_datastructures_enumerated_types.$abduction_allowed_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47540L)
    public static SubLObject problem_store_properties_new_terms_allowedP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw90$NEW_TERMS_ALLOWED_, inference_datastructures_enumerated_types.$new_terms_allowed_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47867L)
    public static SubLObject problem_store_properties_compute_answer_justificationsP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw91$COMPUTE_ANSWER_JUSTIFICATIONS_, inference_datastructures_enumerated_types.$compute_answer_justifications_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48454L)
    public static SubLObject all_inference_modes() {
        return conses_high.copy_list(inference_datastructures_enumerated_types.$inference_modes$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48535L)
    public static SubLObject inference_mode_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_modes$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48997L)
    public static SubLObject problem_link_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$problem_link_types$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49214L)
    public static SubLObject problem_store_name_p(final SubLObject v_object) {
        return (SubLObject)inference_datastructures_enumerated_types.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49289L)
    public static SubLObject problem_store_properties_name(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw95$PROBLEM_STORE_NAME, inference_datastructures_enumerated_types.$default_problem_store_name$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49902L)
    public static SubLObject problem_store_equality_reasoning_method_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$problem_store_equality_reasoning_methods$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50041L)
    public static SubLObject problem_store_properties_equality_reasoning_method(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw98$EQUALITY_REASONING_METHOD, inference_datastructures_enumerated_types.$default_equality_reasoning_method$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50726L)
    public static SubLObject problem_store_equality_reasoning_domain_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$problem_store_equality_reasoning_domains$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50865L)
    public static SubLObject problem_store_properties_equality_reasoning_domain(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw100$EQUALITY_REASONING_DOMAIN, inference_datastructures_enumerated_types.$default_equality_reasoning_domain$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51720L)
    public static SubLObject intermediate_step_validation_level_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$intermediate_step_validation_levels$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51849L)
    public static SubLObject problem_store_properties_intermediate_step_validation_level(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw102$INTERMEDIATE_STEP_VALIDATION_LEVEL, inference_datastructures_enumerated_types.$default_intermediate_step_validation_level$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52130L)
    public static SubLObject max_problem_count_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != number_utilities.positive_infinity_p(v_object) || inference_datastructures_enumerated_types.NIL != subl_promotions.non_negative_integer_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52256L)
    public static SubLObject problem_store_properties_max_problem_count(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw104$MAX_PROBLEM_COUNT, inference_datastructures_enumerated_types.$default_max_problem_count$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52480L)
    public static SubLObject removal_allowed_by_propertiesP(final SubLObject problem_store_properties) {
        return conses_high.getf(problem_store_properties, (SubLObject)inference_datastructures_enumerated_types.$kw105$REMOVAL_ALLOWED_, inference_datastructures_enumerated_types.$removal_allowed_by_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52735L)
    public static SubLObject transformation_allowed_by_propertiesP(final SubLObject problem_store_properties) {
        return conses_high.getf(problem_store_properties, (SubLObject)inference_datastructures_enumerated_types.$kw106$TRANSFORMATION_ALLOWED_, inference_datastructures_enumerated_types.$transformation_allowed_by_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53281L)
    public static SubLObject inference_direction_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_directions$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53380L)
    public static SubLObject problem_store_properties_direction(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw109$DIRECTION, inference_datastructures_enumerated_types.$default_problem_store_inference_direction$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53717L)
    public static SubLObject tactic_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$tactic_statuses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54136L)
    public static SubLObject tactic_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$tactic_types$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54219L)
    public static SubLObject tactic_type_from_hl_module(final SubLObject hl_module) {
        if (inference_datastructures_enumerated_types.NIL != inference_modules.removal_module_p(hl_module)) {
            return (SubLObject)inference_datastructures_enumerated_types.$kw112$REMOVAL;
        }
        if (inference_datastructures_enumerated_types.NIL != inference_modules.transformation_module_p(hl_module)) {
            return (SubLObject)inference_datastructures_enumerated_types.$kw113$TRANSFORMATION;
        }
        if (inference_datastructures_enumerated_types.NIL != inference_modules.structural_module_p(hl_module)) {
            return (SubLObject)inference_datastructures_enumerated_types.$kw114$STRUCTURAL;
        }
        if (inference_datastructures_enumerated_types.NIL != inference_modules.meta_structural_module_p(hl_module)) {
            return (SubLObject)inference_datastructures_enumerated_types.$kw114$STRUCTURAL;
        }
        if (inference_datastructures_enumerated_types.NIL != inference_modules.conjunctive_removal_module_p(hl_module)) {
            return (SubLObject)inference_datastructures_enumerated_types.$kw115$REMOVAL_CONJUNCTIVE;
        }
        if (inference_datastructures_enumerated_types.NIL != inference_modules.rewrite_module_p(hl_module)) {
            return (SubLObject)inference_datastructures_enumerated_types.$kw116$REWRITE;
        }
        if (inference_datastructures_enumerated_types.NIL != inference_modules.meta_removal_module_p(hl_module)) {
            return (SubLObject)inference_datastructures_enumerated_types.$kw117$META_REMOVAL;
        }
        if (inference_datastructures_enumerated_types.NIL != inference_modules.meta_transformation_module_p(hl_module)) {
            return (SubLObject)inference_datastructures_enumerated_types.$kw113$TRANSFORMATION;
        }
        Errors.error((SubLObject)inference_datastructures_enumerated_types.$str118$HL_Module_of_unknown_type___s, hl_module);
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55234L)
    public static SubLObject completeness_string(final SubLObject completeness) {
        assert inference_datastructures_enumerated_types.NIL != completeness_p(completeness) : completeness;
        if (completeness.eql((SubLObject)inference_datastructures_enumerated_types.$kw121$COMPLETE)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str122$Complete;
        }
        if (completeness.eql((SubLObject)inference_datastructures_enumerated_types.$kw123$INCOMPLETE)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str124$Incomplete;
        }
        if (completeness.eql((SubLObject)inference_datastructures_enumerated_types.$kw125$GROSSLY_INCOMPLETE)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str126$Grossly_Incomplete;
        }
        if (completeness.eql((SubLObject)inference_datastructures_enumerated_types.$kw127$IMPOSSIBLE)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str128$Impossible;
        }
        Errors.error((SubLObject)inference_datastructures_enumerated_types.$str129$Unexpected_completeness__a, completeness);
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55616L)
    public static SubLObject completeness_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$ordered_completenesses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55710L)
    public static SubLObject impossible_completeness_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw127$IMPOSSIBLE, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55794L)
    public static SubLObject completeness_L(final SubLObject completeness1, final SubLObject completeness2) {
        assert inference_datastructures_enumerated_types.NIL != completeness_p(completeness1) : completeness1;
        assert inference_datastructures_enumerated_types.NIL != completeness_p(completeness2) : completeness2;
        return list_utilities.position_L(completeness1, completeness2, inference_datastructures_enumerated_types.$ordered_completenesses$.getGlobalValue(), (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56099L)
    public static SubLObject completeness_G(final SubLObject completeness1, final SubLObject completeness2) {
        return completeness_L(completeness2, completeness1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56294L)
    public static SubLObject min_completeness(final SubLObject completeness_list) {
        return (inference_datastructures_enumerated_types.NIL != completeness_list) ? list_utilities.extremal(completeness_list, (SubLObject)inference_datastructures_enumerated_types.$sym130$COMPLETENESS__, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED) : conses_high.last(inference_datastructures_enumerated_types.$ordered_completenesses$.getGlobalValue(), (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56475L)
    public static SubLObject min2_completeness(final SubLObject completeness1, final SubLObject completeness2) {
        return (inference_datastructures_enumerated_types.NIL != completeness_L(completeness2, completeness1)) ? completeness2 : completeness1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56627L)
    public static SubLObject max_completeness(final SubLObject completeness_list) {
        return (inference_datastructures_enumerated_types.NIL != completeness_list) ? list_utilities.extremal(completeness_list, (SubLObject)inference_datastructures_enumerated_types.$sym131$COMPLETENESS__, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED) : inference_datastructures_enumerated_types.$ordered_completenesses$.getGlobalValue().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56801L)
    public static SubLObject max2_completeness(final SubLObject completeness1, final SubLObject completeness2) {
        return (inference_datastructures_enumerated_types.NIL != completeness_L(completeness2, completeness1)) ? completeness1 : completeness2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56953L)
    public static SubLObject productivity_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != number_utilities.positive_infinity_p(v_object) || inference_datastructures_enumerated_types.NIL != subl_promotions.non_negative_integer_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57123L)
    public static SubLObject infinite_productivity_p(final SubLObject v_object) {
        return number_utilities.positive_infinity_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57330L)
    public static SubLObject productivity_for_number_of_children(final SubLObject number_of_children) {
        if (number_of_children.isInteger()) {
            return Numbers.multiply((SubLObject)inference_datastructures_enumerated_types.$int49$100, number_of_children);
        }
        SubLObject productivity = list_utilities.alist_lookup_without_values(inference_datastructures_enumerated_types.$productivity_to_number_table$.getGlobalValue(), number_of_children, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED);
        if (inference_datastructures_enumerated_types.NIL == productivity) {
            productivity = Numbers.truncate(Numbers.multiply((SubLObject)inference_datastructures_enumerated_types.$int49$100, number_of_children), (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED);
        }
        return productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57843L)
    public static SubLObject number_of_children_for_productivity(final SubLObject productivity) {
        return Numbers.integerDivide(productivity, (SubLObject)inference_datastructures_enumerated_types.$int49$100);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58063L)
    public static SubLObject cost_for_productivity(final SubLObject productivity) {
        return Numbers.divide(productivity, (SubLObject)inference_datastructures_enumerated_types.$int49$100);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58258L)
    public static SubLObject removal_cost_cutoff_for_productivity(final SubLObject productivity) {
        assert inference_datastructures_enumerated_types.NIL != productivity_p(productivity) : productivity;
        if (inference_datastructures_enumerated_types.NIL != number_utilities.positive_infinity_p(productivity)) {
            return (SubLObject)inference_datastructures_enumerated_types.NIL;
        }
        return cost_for_productivity(productivity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58483L)
    public static SubLObject productivity_E(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_E(productivity1, productivity2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58615L)
    public static SubLObject productivity_L(final SubLObject productivity1, final SubLObject productivity2) {
        assert inference_datastructures_enumerated_types.NIL != productivity_p(productivity1) : productivity1;
        assert inference_datastructures_enumerated_types.NIL != productivity_p(productivity2) : productivity2;
        return number_utilities.potentially_infinite_integer_L(productivity1, productivity2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58834L)
    public static SubLObject productivity_LE(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_LE(productivity1, productivity2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58967L)
    public static SubLObject productivity_G(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_G(productivity1, productivity2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59098L)
    public static SubLObject productivity_GE(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_GE(productivity1, productivity2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59231L)
    public static SubLObject productivity_X(final SubLObject productivity1, final SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_plus(productivity1, productivity2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59365L)
    public static SubLObject productivity_max(final SubLObject productivity1, final SubLObject productivity2) {
        return (inference_datastructures_enumerated_types.NIL != productivity_L(productivity1, productivity2)) ? productivity2 : productivity1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59516L)
    public static SubLObject productivity_sum(final SubLObject productivities) {
        SubLObject total_productivity = (SubLObject)inference_datastructures_enumerated_types.ZERO_INTEGER;
        SubLObject cdolist_list_var = productivities;
        SubLObject productivity = (SubLObject)inference_datastructures_enumerated_types.NIL;
        productivity = cdolist_list_var.first();
        while (inference_datastructures_enumerated_types.NIL != cdolist_list_var) {
            total_productivity = productivity_X(total_productivity, productivity);
            cdolist_list_var = cdolist_list_var.rest();
            productivity = cdolist_list_var.first();
        }
        return total_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59756L)
    public static SubLObject productivity_times_number(final SubLObject productivity, final SubLObject number) {
        return number_utilities.potentially_infinite_integer_times_number_rounded(productivity, number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59901L)
    public static SubLObject productivity_divide_number(final SubLObject productivity, final SubLObject number) {
        return number_utilities.potentially_infinite_integer_divided_by_number_rounded(productivity, number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60052L)
    public static SubLObject decrement_productivity_for_number_of_children(final SubLObject productivity, SubLObject number) {
        if (number == inference_datastructures_enumerated_types.UNPROVIDED) {
            number = (SubLObject)inference_datastructures_enumerated_types.ONE_INTEGER;
        }
        return productivity_for_number_of_children(Numbers.subtract(number_of_children_for_productivity(productivity), number));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60425L)
    public static SubLObject proof_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$proof_statuses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60930L)
    public static SubLObject proof_reject_reason_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != arguments.hl_justification_p(v_object) || inference_datastructures_enumerated_types.NIL != list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$proof_reject_reasons$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61300L)
    public static SubLObject destructibility_status_string(final SubLObject destructibility_status) {
        assert inference_datastructures_enumerated_types.NIL != destructibility_status_p(destructibility_status) : destructibility_status;
        if (destructibility_status.eql((SubLObject)inference_datastructures_enumerated_types.$kw138$INDESTRUCTIBLE)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str139$Indestructible;
        }
        if (destructibility_status.eql((SubLObject)inference_datastructures_enumerated_types.$kw140$DESTRUCTIBLE)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str141$Destructible;
        }
        if (destructibility_status.eql((SubLObject)inference_datastructures_enumerated_types.$kw142$UNKNOWN)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str143$Unknown;
        }
        Errors.error((SubLObject)inference_datastructures_enumerated_types.$str144$Unexpected_destructibility_status, destructibility_status);
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61686L)
    public static SubLObject destructibility_status_hint(final SubLObject destructibility_status) {
        assert inference_datastructures_enumerated_types.NIL != destructibility_status_p(destructibility_status) : destructibility_status;
        if (destructibility_status.eql((SubLObject)inference_datastructures_enumerated_types.$kw138$INDESTRUCTIBLE)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str145$I;
        }
        if (destructibility_status.eql((SubLObject)inference_datastructures_enumerated_types.$kw140$DESTRUCTIBLE)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str146$;
        }
        if (destructibility_status.eql((SubLObject)inference_datastructures_enumerated_types.$kw142$UNKNOWN)) {
            return (SubLObject)inference_datastructures_enumerated_types.$str147$_;
        }
        Errors.error((SubLObject)inference_datastructures_enumerated_types.$str144$Unexpected_destructibility_status, destructibility_status);
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 62054L)
    public static SubLObject destructibility_status_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$destructibility_statuses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 62161L)
    public static SubLObject destructibility_status_destructibleP(final SubLObject destructibility_status) {
        assert inference_datastructures_enumerated_types.NIL != destructibility_status_p(destructibility_status) : destructibility_status;
        return Equality.eq((SubLObject)inference_datastructures_enumerated_types.$kw140$DESTRUCTIBLE, destructibility_status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 67955L)
    public static SubLObject strategy_type_property_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP(inference_datastructures_enumerated_types.$strategy_type_properties$.getGlobalValue(), v_object, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68229L)
    public static SubLObject strategy_default_method_handler(final SubLObject method) {
        assert inference_datastructures_enumerated_types.NIL != strategy_type_property_p(method) : method;
        final SubLObject handler = list_utilities.alist_lookup_without_values(inference_datastructures_enumerated_types.$strategy_type_properties$.getGlobalValue(), method, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED);
        if (inference_datastructures_enumerated_types.$kw151$MUST_OVERRIDE == handler) {
            return Errors.error((SubLObject)inference_datastructures_enumerated_types.$str152$Strategy_must_implement_method__s, method);
        }
        return handler;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69077L)
    public static SubLObject inference_simple_return_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_return_types$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69190L)
    public static SubLObject inference_properties_has_simple_return_typeP(final SubLObject query_properties) {
        return inference_simple_return_type_p(inference_properties_return_type(query_properties));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69367L)
    public static SubLObject inference_template_return_type_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && inference_datastructures_enumerated_types.$kw155$TEMPLATE == v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69495L)
    public static SubLObject inference_format_return_type_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != list_utilities.proper_list_p(v_object) && inference_datastructures_enumerated_types.$kw156$FORMAT == v_object.first() && inference_datastructures_enumerated_types.NIL != list_utilities.lengthGE(v_object, (SubLObject)inference_datastructures_enumerated_types.TWO_INTEGER, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED) && conses_high.second(v_object).isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69685L)
    public static SubLObject inference_return_type_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != inference_simple_return_type_p(v_object) || inference_datastructures_enumerated_types.NIL != inference_template_return_type_p(v_object) || inference_datastructures_enumerated_types.NIL != inference_format_return_type_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69885L)
    public static SubLObject inference_properties_return_type(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw157$RETURN, inference_datastructures_enumerated_types.$inference_default_return_type$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70257L)
    public static SubLObject inference_answer_language_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_answer_languages$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70368L)
    public static SubLObject inference_properties_answer_language(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw160$ANSWER_LANGUAGE, inference_datastructures_enumerated_types.$inference_default_answer_language$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70904L)
    public static SubLObject result_uniqueness_criterion_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$result_uniqueness_criteria$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71017L)
    public static SubLObject inference_properties_uniqueness_criterion(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw162$RESULT_UNIQUENESS, inference_datastructures_enumerated_types.$default_result_uniqueness_criterion$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71800L)
    public static SubLObject inference_disjunction_free_el_vars_policy_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_disjunction_free_el_vars_policies$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71944L)
    public static SubLObject inference_properties_disjunction_free_el_vars_policy(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw165$DISJUNCTION_FREE_EL_VARS_POLICY, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72662L)
    public static SubLObject inference_transitive_closure_mode_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_transitive_closure_modes$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72792L)
    public static SubLObject inference_properties_transitive_closure_mode(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw167$TRANSITIVE_CLOSURE_MODE, inference_datastructures_enumerated_types.$inference_transitive_closure_mode_default$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73121L)
    public static SubLObject inference_properties_maintain_term_working_setP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw168$MAINTAIN_TERM_WORKING_SET_, inference_datastructures_enumerated_types.$maintain_term_working_set_defaultP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73379L)
    public static SubLObject inference_properties_events(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw169$EVENTS, inference_datastructures_enumerated_types.$inference_events_default$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74125L)
    public static SubLObject inference_event_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_event_types$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74375L)
    public static SubLObject inference_properties_halt_conditions(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw171$HALT_CONDITIONS, inference_datastructures_enumerated_types.$inference_halt_conditions_default$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74806L)
    public static SubLObject inference_halt_condition_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_datastructures_enumerated_types.$inference_halt_conditions$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75330L)
    public static SubLObject inference_accumulator_type_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP(inference_datastructures_enumerated_types.$inference_accumulator_types$.getGlobalValue(), v_object, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75447L)
    public static SubLObject initialize_inference_accumulator(final SubLObject accumulator_type) {
        assert inference_datastructures_enumerated_types.NIL != inference_accumulator_type_p(accumulator_type) : accumulator_type;
        final SubLObject initialization_fn = list_utilities.alist_lookup_without_values(inference_datastructures_enumerated_types.$inference_accumulator_types$.getGlobalValue(), accumulator_type, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED, (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED);
        return Functions.funcall(initialization_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76100L)
    public static SubLObject inference_properties_forget_extra_resultsP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw175$FORGET_EXTRA_RESULTS_, inference_datastructures_enumerated_types.$inference_default_forget_extra_resultsP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76448L)
    public static SubLObject inference_properties_cache_inference_resultsP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw176$CACHE_INFERENCE_RESULTS_, inference_datastructures_enumerated_types.$inference_default_cache_inference_resultsP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76784L)
    public static SubLObject inference_properties_browsableP(final SubLObject v_properties) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_enumerated_types.NIL != conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw177$BROWSABLE_, inference_datastructures_enumerated_types.$inference_default_browsableP$.getGlobalValue()) || inference_datastructures_enumerated_types.NIL != inference_properties_continuableP(v_properties));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77179L)
    public static SubLObject inference_properties_continuableP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw178$CONTINUABLE_, inference_datastructures_enumerated_types.$inference_default_continuableP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77319L)
    public static SubLObject inference_properties_blockP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)inference_datastructures_enumerated_types.$kw179$BLOCK_, (SubLObject)inference_datastructures_enumerated_types.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77429L)
    public static SubLObject inference_query_property_lookup(final SubLObject query_properties, final SubLObject property) {
        final SubLObject value = conses_high.getf(query_properties, property, (SubLObject)inference_datastructures_enumerated_types.$kw180$UNSPECIFIED);
        if (inference_datastructures_enumerated_types.$kw180$UNSPECIFIED == value) {
            return inference_engine_default_for_property(property);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77864L)
    public static SubLObject inference_engine_default_for_property(final SubLObject query_property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_datastructures_enumerated_types.NIL != query_property_p(query_property) : query_property;
        SubLObject value = (SubLObject)inference_datastructures_enumerated_types.NIL;
        SubLObject specified = (SubLObject)inference_datastructures_enumerated_types.NIL;
        if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw165$DISJUNCTION_FREE_EL_VARS_POLICY)) {
            value = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw162$RESULT_UNIQUENESS)) {
            value = inference_datastructures_enumerated_types.$default_result_uniqueness_criterion$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw15$PROBLEM_STORE)) {
            value = (SubLObject)inference_datastructures_enumerated_types.NIL;
            specified = (SubLObject)inference_datastructures_enumerated_types.NIL;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw181$CONDITIONAL_SENTENCE_)) {
            value = (SubLObject)inference_datastructures_enumerated_types.NIL;
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw182$NON_EXPLANATORY_SENTENCE)) {
            value = (SubLObject)inference_datastructures_enumerated_types.NIL;
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_)) {
            value = inference_datastructures_enumerated_types.$inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_)) {
            value = inference_datastructures_enumerated_types.$inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_)) {
            value = inference_datastructures_enumerated_types.$inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw19$ALLOW_INDETERMINATE_RESULTS_)) {
            value = inference_datastructures_enumerated_types.$inference_allows_indeterminate_results_by_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw21$ALLOWED_RULES)) {
            value = inference_datastructures_enumerated_types.$default_allowed_rules$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw24$ALLOWED_MODULES)) {
            value = inference_datastructures_enumerated_types.$default_allowed_modules$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw23$FORBIDDEN_RULES)) {
            value = inference_datastructures_enumerated_types.$default_forbidden_rules$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw25$ALLOW_ABNORMALITY_CHECKING_)) {
            value = inference_datastructures_enumerated_types.$inference_allows_abnormality_checking_by_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw167$TRANSITIVE_CLOSURE_MODE)) {
            value = inference_datastructures_enumerated_types.$inference_transitive_closure_mode_default$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw28$MAX_NUMBER)) {
            value = inference_datastructures_enumerated_types.$default_max_number$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw29$MAX_TIME)) {
            value = inference_datastructures_enumerated_types.$default_max_time$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw30$MAX_STEP)) {
            value = inference_datastructures_enumerated_types.$default_max_step$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw32$FORWARD_MAX_TIME)) {
            value = inference_datastructures_enumerated_types.$default_forward_max_time$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw33$MAX_PROOF_DEPTH)) {
            value = inference_datastructures_enumerated_types.$default_max_proof_depth$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw34$MAX_TRANSFORMATION_DEPTH)) {
            value = inference_datastructures_enumerated_types.$default_max_transformation_depth$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw36$MIN_RULE_UTILITY)) {
            value = inference_datastructures_enumerated_types.$default_min_rule_utility$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw37$PROBABLY_APPROXIMATELY_DONE)) {
            value = inference_datastructures_enumerated_types.$default_probably_approximately_done$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw157$RETURN)) {
            value = inference_datastructures_enumerated_types.$inference_default_return_type$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw40$METRICS)) {
            value = inference_datastructures_enumerated_types.$default_inference_metrics_template$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw160$ANSWER_LANGUAGE)) {
            value = inference_datastructures_enumerated_types.$inference_default_answer_language$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw176$CACHE_INFERENCE_RESULTS_)) {
            value = inference_datastructures_enumerated_types.$inference_default_cache_inference_resultsP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw175$FORGET_EXTRA_RESULTS_)) {
            value = inference_datastructures_enumerated_types.$inference_default_forget_extra_resultsP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw177$BROWSABLE_)) {
            value = inference_datastructures_enumerated_types.$inference_default_browsableP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw178$CONTINUABLE_)) {
            value = inference_datastructures_enumerated_types.$inference_default_continuableP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw179$BLOCK_)) {
            value = (SubLObject)inference_datastructures_enumerated_types.NIL;
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw98$EQUALITY_REASONING_METHOD)) {
            value = inference_datastructures_enumerated_types.$default_equality_reasoning_method$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw100$EQUALITY_REASONING_DOMAIN)) {
            value = inference_datastructures_enumerated_types.$default_equality_reasoning_domain$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw102$INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
            value = inference_datastructures_enumerated_types.$default_intermediate_step_validation_level$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw104$MAX_PROBLEM_COUNT)) {
            value = inference_datastructures_enumerated_types.$default_max_problem_count$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw105$REMOVAL_ALLOWED_)) {
            value = inference_datastructures_enumerated_types.$removal_allowed_by_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw106$TRANSFORMATION_ALLOWED_)) {
            value = inference_datastructures_enumerated_types.$transformation_allowed_by_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
            value = inference_datastructures_enumerated_types.$add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw85$NEGATION_BY_FAILURE_)) {
            value = inference_datastructures_enumerated_types.$negation_by_failure_by_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw86$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
            value = control_vars.$complete_extent_minimization$.getDynamicValue(thread);
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw109$DIRECTION)) {
            value = inference_datastructures_enumerated_types.$default_problem_store_inference_direction$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw87$EVALUATE_SUBL_ALLOWED_)) {
            value = inference_datastructures_enumerated_types.$evaluate_subl_allowed_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw88$REWRITE_ALLOWED_)) {
            value = inference_datastructures_enumerated_types.$rewrite_allowed_defaultP$.getDynamicValue(thread);
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw89$ABDUCTION_ALLOWED_)) {
            value = inference_datastructures_enumerated_types.$abduction_allowed_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw90$NEW_TERMS_ALLOWED_)) {
            value = inference_datastructures_enumerated_types.$new_terms_allowed_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw31$INFERENCE_MODE)) {
            value = inference_datastructures_enumerated_types.$default_inference_mode$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw168$MAINTAIN_TERM_WORKING_SET_)) {
            value = inference_datastructures_enumerated_types.$maintain_term_working_set_defaultP$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw169$EVENTS)) {
            value = inference_datastructures_enumerated_types.$inference_events_default$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw171$HALT_CONDITIONS)) {
            value = inference_datastructures_enumerated_types.$inference_halt_conditions_default$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw95$PROBLEM_STORE_NAME)) {
            value = inference_datastructures_enumerated_types.$default_problem_store_name$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw50$PRODUCTIVITY_LIMIT)) {
            value = inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw44$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
            value = inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else if (query_property.eql((SubLObject)inference_datastructures_enumerated_types.$kw46$PROOF_SPEC)) {
            value = inference_datastructures_enumerated_types.$default_proof_spec$.getGlobalValue();
            specified = (SubLObject)inference_datastructures_enumerated_types.T;
        }
        else {
            value = (SubLObject)inference_datastructures_enumerated_types.$kw142$UNKNOWN;
            specified = (SubLObject)inference_datastructures_enumerated_types.NIL;
        }
        return subl_promotions.values2(value, specified);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 83591L)
    public static SubLObject query_property_is_defaultP(final SubLObject property, final SubLObject value) {
        return Equality.equal(value, inference_engine_default_for_property(property));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 83723L)
    public static SubLObject inference_input_non_default_query_properties(final SubLObject inference) {
        assert inference_datastructures_enumerated_types.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject query_properties = inference_datastructures_inference.inference_input_query_properties(inference);
        SubLObject non_default_query_properties = (SubLObject)inference_datastructures_enumerated_types.NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject v_default;
        for (remainder = (SubLObject)inference_datastructures_enumerated_types.NIL, remainder = query_properties; inference_datastructures_enumerated_types.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            v_default = inference_engine_default_for_property(property);
            if (!v_default.equal(value)) {
                non_default_query_properties = conses_high.putf(non_default_query_properties, property, value);
            }
        }
        return non_default_query_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 84482L)
    public static SubLObject all_default_query_properties() {
        SubLObject v_properties = (SubLObject)inference_datastructures_enumerated_types.NIL;
        SubLObject cdolist_list_var = all_query_properties();
        SubLObject property = (SubLObject)inference_datastructures_enumerated_types.NIL;
        property = cdolist_list_var.first();
        while (inference_datastructures_enumerated_types.NIL != cdolist_list_var) {
            final SubLObject value = inference_engine_default_for_property(property);
            v_properties = (SubLObject)ConsesLow.cons(property, v_properties);
            v_properties = (SubLObject)ConsesLow.cons(value, v_properties);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 84768L)
    public static SubLObject explicify_default_query_properties(final SubLObject query_properties) {
        return list_utilities.nmerge_plist(all_default_query_properties(), query_properties);
    }
    
    public static SubLObject declare_inference_datastructures_enumerated_types_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_property_p", "QUERY-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_properties_p", "QUERY-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_query_properties", "ALL-QUERY-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "merge_query_properties", "MERGE-QUERY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_static_property_p", "QUERY-STATIC-PROPERTY-P", 1, 0, false);
        new $query_static_property_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_static_properties_p", "QUERY-STATIC-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_query_static_properties", "EXTRACT-QUERY-STATIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_query_static_properties", "ALL-QUERY-STATIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_static_or_meta_property_p", "QUERY-STATIC-OR-META-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_static_or_meta_properties_p", "QUERY-STATIC-OR-META-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_query_static_or_meta_properties", "EXTRACT-QUERY-STATIC-OR-META-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_dynamic_property_p", "QUERY-DYNAMIC-PROPERTY-P", 1, 0, false);
        new $query_dynamic_property_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_dynamic_properties_p", "QUERY-DYNAMIC-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_query_dynamic_properties", "EXTRACT-QUERY-DYNAMIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_query_dynamic_properties", "ALL-QUERY-DYNAMIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_metric_p", "QUERY-METRIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_query_metric_p", "INFERENCE-QUERY-METRIC-P", 1, 0, false);
        new $inference_query_metric_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_query_metrics", "ALL-QUERY-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "arete_query_metric_p", "ARETE-QUERY-METRIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_arete_query_metrics", "ALL-ARETE-QUERY-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "removal_ask_query_metric_p", "REMOVAL-ASK-QUERY-METRIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_property_p", "INFERENCE-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_p", "INFERENCE-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_static_property_p", "INFERENCE-STATIC-PROPERTY-P", 1, 0, false);
        new $inference_static_property_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_static_properties_p", "INFERENCE-STATIC-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_inference_static_properties", "EXTRACT-INFERENCE-STATIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_inference_static_properties", "ALL-INFERENCE-STATIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_static_or_meta_property_p", "INFERENCE-STATIC-OR-META-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_static_or_meta_properties_p", "INFERENCE-STATIC-OR-META-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_inference_static_or_meta_properties", "EXTRACT-INFERENCE-STATIC-OR-META-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_problem_store", "INFERENCE-PROPERTIES-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_allow_hl_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_allow_unbound_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_allow_evaluatable_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_allow_indeterminate_resultsP", "INFERENCE-PROPERTIES-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_allowed_rules", "INFERENCE-PROPERTIES-ALLOWED-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_forbidden_rules", "INFERENCE-PROPERTIES-FORBIDDEN-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_allowed_modules", "INFERENCE-PROPERTIES-ALLOWED-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_allow_abnormality_checkingP", "INFERENCE-PROPERTIES-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_resource_constraint_p", "INFERENCE-RESOURCE-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_resource_constraints_p", "INFERENCE-RESOURCE-CONSTRAINTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_inference_resource_constraints", "EXTRACT-INFERENCE-RESOURCE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_max_number", "INFERENCE-PROPERTIES-MAX-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_max_time", "INFERENCE-PROPERTIES-MAX-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_max_step", "INFERENCE-PROPERTIES-MAX-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_mode", "INFERENCE-PROPERTIES-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_forward_max_time", "INFERENCE-PROPERTIES-FORWARD-MAX-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_max_proof_depth", "INFERENCE-PROPERTIES-MAX-PROOF-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_max_transformation_depth", "INFERENCE-PROPERTIES-MAX-TRANSFORMATION-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_min_rule_utility", "INFERENCE-PROPERTIES-MIN-RULE-UTILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_probably_approximately_done", "INFERENCE-PROPERTIES-PROBABLY-APPROXIMATELY-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_dynamic_property_p", "INFERENCE-DYNAMIC-PROPERTY-P", 1, 0, false);
        new $inference_dynamic_property_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_dynamic_properties_p", "INFERENCE-DYNAMIC-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_inference_dynamic_properties", "EXTRACT-INFERENCE-DYNAMIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_inference_dynamic_properties", "ALL-INFERENCE-DYNAMIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_metrics", "INFERENCE-PROPERTIES-METRICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_property_p", "STRATEGY-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_properties_p", "STRATEGY-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_static_property_p", "STRATEGY-STATIC-PROPERTY-P", 1, 0, false);
        new $strategy_static_property_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_static_properties_p", "STRATEGY-STATIC-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_strategy_static_properties", "EXTRACT-STRATEGY-STATIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_strategy_static_properties", "ALL-STRATEGY-STATIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_static_properties_removal_backtracking_productivity_limit", "STRATEGY-STATIC-PROPERTIES-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_static_properties_proof_spec", "STRATEGY-STATIC-PROPERTIES-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_dynamic_property_p", "STRATEGY-DYNAMIC-PROPERTY-P", 1, 0, false);
        new $strategy_dynamic_property_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_dynamic_properties_p", "STRATEGY-DYNAMIC-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_strategy_dynamic_properties", "EXTRACT-STRATEGY-DYNAMIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_strategy_dynamic_properties", "ALL-STRATEGY-DYNAMIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_dynamic_properties_productivity_limit", "STRATEGY-DYNAMIC-PROPERTIES-PRODUCTIVITY-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_property_p", "PROBLEM-STORE-PROPERTY-P", 1, 0, false);
        new $problem_store_property_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_p", "PROBLEM-STORE-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_problem_store_properties", "ALL-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_problem_store_properties", "EXTRACT-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_static_property_p", "PROBLEM-STORE-STATIC-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_static_properties_p", "PROBLEM-STORE-STATIC-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_problem_store_static_properties", "EXTRACT-PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_problem_store_static_properties", "ALL-PROBLEM-STORE-STATIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_dynamic_property_p", "PROBLEM-STORE-DYNAMIC-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_dynamic_properties_p", "PROBLEM-STORE-DYNAMIC-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_problem_store_dynamic_properties", "ALL-PROBLEM-STORE-DYNAMIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_meta_property_p", "INFERENCE-META-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_inference_meta_properties", "ALL-INFERENCE-META-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "extract_inference_meta_properties", "EXTRACT-INFERENCE-META-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_halt_reason_p", "QUERY-HALT-REASON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "exhausted_query_halt_reason_p", "EXHAUSTED-QUERY-HALT-REASON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_status_p", "INFERENCE-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "continuable_inference_status_p", "CONTINUABLE-INFERENCE-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "avoided_inference_reason_p", "AVOIDED-INFERENCE-REASON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_suspend_status_p", "INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_suspend_status_applicableP", "INFERENCE-SUSPEND-STATUS-APPLICABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "continuable_inference_suspend_status_p", "CONTINUABLE-INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "exhausted_inference_suspend_status_p", "EXHAUSTED-INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_error_suspend_status_p", "INFERENCE-ERROR-SUSPEND-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "new_inference_error_suspend_status", "NEW-INFERENCE-ERROR-SUSPEND-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_error_suspend_status_message", "INFERENCE-ERROR-SUSPEND-STATUS-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_justification_status_p", "INFERENCE-JUSTIFICATION-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "new_inference_justification_status", "NEW-INFERENCE-JUSTIFICATION-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_justification_status_message", "INFERENCE-JUSTIFICATION-STATUS-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "tactical_status_p", "TACTICAL-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "provability_status_p", "PROVABILITY-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "tactical_status_weakerP", "TACTICAL-STATUS-WEAKER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "tactical_status_strongerP", "TACTICAL-STATUS-STRONGER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "tactical_status_unionP", "TACTICAL-STATUS-UNION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_status_p", "PROBLEM-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_status_from_tactical_status_and_provability_status", "PROBLEM-STATUS-FROM-TACTICAL-STATUS-AND-PROVABILITY-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "tactical_status_from_problem_status", "TACTICAL-STATUS-FROM-PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "provability_status_from_problem_status", "PROVABILITY-STATUS-FROM-PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "good_problem_status_p", "GOOD-PROBLEM-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "no_good_problem_status_p", "NO-GOOD-PROBLEM-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "neutral_problem_status_p", "NEUTRAL-PROBLEM-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "unexamined_problem_status_p", "UNEXAMINED-PROBLEM-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "examined_problem_status_p", "EXAMINED-PROBLEM-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "possible_problem_status_p", "POSSIBLE-PROBLEM-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "pending_problem_status_p", "PENDING-PROBLEM-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "finished_problem_status_p", "FINISHED-PROBLEM-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-PROPERTIES-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_negation_by_failureP", "PROBLEM-STORE-PROPERTIES-NEGATION-BY-FAILURE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_completeness_minimization_allowedP", "PROBLEM-STORE-PROPERTIES-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_evaluate_subl_allowedP", "PROBLEM-STORE-PROPERTIES-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_rewrite_allowedP", "PROBLEM-STORE-PROPERTIES-REWRITE-ALLOWED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_abduction_allowedP", "PROBLEM-STORE-PROPERTIES-ABDUCTION-ALLOWED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_new_terms_allowedP", "PROBLEM-STORE-PROPERTIES-NEW-TERMS-ALLOWED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_compute_answer_justificationsP", "PROBLEM-STORE-PROPERTIES-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_inference_modes", "ALL-INFERENCE-MODES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_mode_p", "INFERENCE-MODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_link_type_p", "PROBLEM-LINK-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_name_p", "PROBLEM-STORE-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_name", "PROBLEM-STORE-PROPERTIES-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_equality_reasoning_method_p", "PROBLEM-STORE-EQUALITY-REASONING-METHOD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_equality_reasoning_method", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_equality_reasoning_domain_p", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_equality_reasoning_domain", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-DOMAIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "intermediate_step_validation_level_p", "INTERMEDIATE-STEP-VALIDATION-LEVEL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_intermediate_step_validation_level", "PROBLEM-STORE-PROPERTIES-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "max_problem_count_p", "MAX-PROBLEM-COUNT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_max_problem_count", "PROBLEM-STORE-PROPERTIES-MAX-PROBLEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "removal_allowed_by_propertiesP", "REMOVAL-ALLOWED-BY-PROPERTIES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "transformation_allowed_by_propertiesP", "TRANSFORMATION-ALLOWED-BY-PROPERTIES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_direction_p", "INFERENCE-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "problem_store_properties_direction", "PROBLEM-STORE-PROPERTIES-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "tactic_status_p", "TACTIC-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "tactic_type_p", "TACTIC-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "tactic_type_from_hl_module", "TACTIC-TYPE-FROM-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "completeness_string", "COMPLETENESS-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "completeness_p", "COMPLETENESS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "impossible_completeness_p", "IMPOSSIBLE-COMPLETENESS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "completeness_L", "COMPLETENESS-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "completeness_G", "COMPLETENESS->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "min_completeness", "MIN-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "min2_completeness", "MIN2-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "max_completeness", "MAX-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "max2_completeness", "MAX2-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_p", "PRODUCTIVITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "infinite_productivity_p", "INFINITE-PRODUCTIVITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_for_number_of_children", "PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "number_of_children_for_productivity", "NUMBER-OF-CHILDREN-FOR-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "cost_for_productivity", "COST-FOR-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "removal_cost_cutoff_for_productivity", "REMOVAL-COST-CUTOFF-FOR-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_E", "PRODUCTIVITY-=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_L", "PRODUCTIVITY-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_LE", "PRODUCTIVITY-<=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_G", "PRODUCTIVITY->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_GE", "PRODUCTIVITY->=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_X", "PRODUCTIVITY-+", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_max", "PRODUCTIVITY-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_sum", "PRODUCTIVITY-SUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_times_number", "PRODUCTIVITY-TIMES-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "productivity_divide_number", "PRODUCTIVITY-DIVIDE-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "decrement_productivity_for_number_of_children", "DECREMENT-PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "proof_status_p", "PROOF-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "proof_reject_reason_p", "PROOF-REJECT-REASON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "destructibility_status_string", "DESTRUCTIBILITY-STATUS-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "destructibility_status_hint", "DESTRUCTIBILITY-STATUS-HINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "destructibility_status_p", "DESTRUCTIBILITY-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "destructibility_status_destructibleP", "DESTRUCTIBILITY-STATUS-DESTRUCTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_type_property_p", "STRATEGY-TYPE-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "strategy_default_method_handler", "STRATEGY-DEFAULT-METHOD-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_simple_return_type_p", "INFERENCE-SIMPLE-RETURN-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_has_simple_return_typeP", "INFERENCE-PROPERTIES-HAS-SIMPLE-RETURN-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_template_return_type_p", "INFERENCE-TEMPLATE-RETURN-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_format_return_type_p", "INFERENCE-FORMAT-RETURN-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_return_type_p", "INFERENCE-RETURN-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_return_type", "INFERENCE-PROPERTIES-RETURN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_answer_language_p", "INFERENCE-ANSWER-LANGUAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_answer_language", "INFERENCE-PROPERTIES-ANSWER-LANGUAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "result_uniqueness_criterion_p", "RESULT-UNIQUENESS-CRITERION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_uniqueness_criterion", "INFERENCE-PROPERTIES-UNIQUENESS-CRITERION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_disjunction_free_el_vars_policy_p", "INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_disjunction_free_el_vars_policy", "INFERENCE-PROPERTIES-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_transitive_closure_mode_p", "INFERENCE-TRANSITIVE-CLOSURE-MODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_transitive_closure_mode", "INFERENCE-PROPERTIES-TRANSITIVE-CLOSURE-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_maintain_term_working_setP", "INFERENCE-PROPERTIES-MAINTAIN-TERM-WORKING-SET?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_events", "INFERENCE-PROPERTIES-EVENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_event_type_p", "INFERENCE-EVENT-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_halt_conditions", "INFERENCE-PROPERTIES-HALT-CONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_halt_condition_p", "INFERENCE-HALT-CONDITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_accumulator_type_p", "INFERENCE-ACCUMULATOR-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "initialize_inference_accumulator", "INITIALIZE-INFERENCE-ACCUMULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_forget_extra_resultsP", "INFERENCE-PROPERTIES-FORGET-EXTRA-RESULTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_cache_inference_resultsP", "INFERENCE-PROPERTIES-CACHE-INFERENCE-RESULTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_browsableP", "INFERENCE-PROPERTIES-BROWSABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_continuableP", "INFERENCE-PROPERTIES-CONTINUABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_properties_blockP", "INFERENCE-PROPERTIES-BLOCK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_query_property_lookup", "INFERENCE-QUERY-PROPERTY-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_engine_default_for_property", "INFERENCE-ENGINE-DEFAULT-FOR-PROPERTY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "query_property_is_defaultP", "QUERY-PROPERTY-IS-DEFAULT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "inference_input_non_default_query_properties", "INFERENCE-INPUT-NON-DEFAULT-QUERY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "all_default_query_properties", "ALL-DEFAULT-QUERY-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types", "explicify_default_query_properties", "EXPLICIFY-DEFAULT-QUERY-PROPERTIES", 1, 0, false);
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    public static SubLObject init_inference_datastructures_enumerated_types_file() {
        inference_datastructures_enumerated_types.$specially_handled_inference_metrics$ = SubLFiles.deflexical("*SPECIALLY-HANDLED-INFERENCE-METRICS*", (SubLObject)inference_datastructures_enumerated_types.$list7);
        inference_datastructures_enumerated_types.$non_inference_query_metrics$ = SubLFiles.deflexical("*NON-INFERENCE-QUERY-METRICS*", (SubLObject)inference_datastructures_enumerated_types.$list8);
        inference_datastructures_enumerated_types.$arete_query_metrics$ = SubLFiles.deflexical("*ARETE-QUERY-METRICS*", (SubLObject)inference_datastructures_enumerated_types.$list9);
        inference_datastructures_enumerated_types.$removal_ask_query_metrics$ = SubLFiles.deflexical("*REMOVAL-ASK-QUERY-METRICS*", (SubLObject)inference_datastructures_enumerated_types.$list10);
        inference_datastructures_enumerated_types.$inference_static_properties$ = SubLFiles.deflexical("*INFERENCE-STATIC-PROPERTIES*", (SubLObject)inference_datastructures_enumerated_types.$list12);
        inference_datastructures_enumerated_types.$inference_allows_hl_predicate_transformation_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-HL-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_allows_unbound_predicate_transformation_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-UNBOUND-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_allows_evaluatable_predicate_transformation_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-EVALUATABLE-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_allows_indeterminate_results_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-INDETERMINATE-RESULTS-BY-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.T);
        inference_datastructures_enumerated_types.$default_allowed_rules$ = SubLFiles.deflexical("*DEFAULT-ALLOWED-RULES*", (SubLObject)inference_datastructures_enumerated_types.$kw20$ALL);
        inference_datastructures_enumerated_types.$default_forbidden_rules$ = SubLFiles.deflexical("*DEFAULT-FORBIDDEN-RULES*", (SubLObject)inference_datastructures_enumerated_types.$kw22$NONE);
        inference_datastructures_enumerated_types.$default_allowed_modules$ = SubLFiles.deflexical("*DEFAULT-ALLOWED-MODULES*", (SubLObject)inference_datastructures_enumerated_types.$kw20$ALL);
        inference_datastructures_enumerated_types.$inference_allows_abnormality_checking_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-ABNORMALITY-CHECKING-BY-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.T);
        inference_datastructures_enumerated_types.$inference_resource_constraints$ = SubLFiles.deflexical("*INFERENCE-RESOURCE-CONSTRAINTS*", (SubLObject)inference_datastructures_enumerated_types.$list26);
        inference_datastructures_enumerated_types.$default_max_number$ = SubLFiles.deflexical("*DEFAULT-MAX-NUMBER*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$default_max_time$ = SubLFiles.deflexical("*DEFAULT-MAX-TIME*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$default_max_step$ = SubLFiles.deflexical("*DEFAULT-MAX-STEP*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$default_forward_max_time$ = SubLFiles.deflexical("*DEFAULT-FORWARD-MAX-TIME*", (SubLObject)inference_datastructures_enumerated_types.ZERO_INTEGER);
        inference_datastructures_enumerated_types.$default_max_proof_depth$ = SubLFiles.deflexical("*DEFAULT-MAX-PROOF-DEPTH*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$default_max_transformation_depth$ = SubLFiles.deflexical("*DEFAULT-MAX-TRANSFORMATION-DEPTH*", (SubLObject)inference_datastructures_enumerated_types.ZERO_INTEGER);
        inference_datastructures_enumerated_types.$default_min_rule_utility$ = SubLFiles.deflexical("*DEFAULT-MIN-RULE-UTILITY*", (SubLObject)inference_datastructures_enumerated_types.$int35$_100);
        inference_datastructures_enumerated_types.$default_probably_approximately_done$ = SubLFiles.deflexical("*DEFAULT-PROBABLY-APPROXIMATELY-DONE*", (SubLObject)inference_datastructures_enumerated_types.ONE_INTEGER);
        inference_datastructures_enumerated_types.$inference_other_dynamic_properties$ = SubLFiles.deflexical("*INFERENCE-OTHER-DYNAMIC-PROPERTIES*", (SubLObject)inference_datastructures_enumerated_types.$list38);
        inference_datastructures_enumerated_types.$default_inference_metrics_template$ = SubLFiles.deflexical("*DEFAULT-INFERENCE-METRICS-TEMPLATE*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$strategy_static_properties$ = SubLFiles.deflexical("*STRATEGY-STATIC-PROPERTIES*", (SubLObject)inference_datastructures_enumerated_types.$list42);
        inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$ = SubLFiles.deflexical("*DEFAULT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT*", (SubLObject)inference_datastructures_enumerated_types.ZERO_INTEGER);
        inference_datastructures_enumerated_types.$default_proof_spec$ = SubLFiles.deflexical("*DEFAULT-PROOF-SPEC*", (SubLObject)inference_datastructures_enumerated_types.$kw45$ANYTHING);
        inference_datastructures_enumerated_types.$strategy_dynamic_properties$ = SubLFiles.deflexical("*STRATEGY-DYNAMIC-PROPERTIES*", (SubLObject)inference_datastructures_enumerated_types.$list47);
        inference_datastructures_enumerated_types.$default_productivity_limit$ = SubLFiles.deflexical("*DEFAULT-PRODUCTIVITY-LIMIT*", Numbers.multiply((SubLObject)inference_datastructures_enumerated_types.TWO_INTEGER, (SubLObject)inference_datastructures_enumerated_types.$int49$100, control_vars.$default_removal_cost_cutoff$.getGlobalValue()));
        inference_datastructures_enumerated_types.$problem_store_static_properties$ = SubLFiles.deflexical("*PROBLEM-STORE-STATIC-PROPERTIES*", (SubLObject)inference_datastructures_enumerated_types.$list52);
        inference_datastructures_enumerated_types.$problem_store_dynamic_properties$ = SubLFiles.deflexical("*PROBLEM-STORE-DYNAMIC-PROPERTIES*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_meta_properties$ = SubLFiles.deflexical("*INFERENCE-META-PROPERTIES*", (SubLObject)inference_datastructures_enumerated_types.$list55);
        inference_datastructures_enumerated_types.$inference_statuses$ = SubLFiles.deflexical("*INFERENCE-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list57);
        inference_datastructures_enumerated_types.$continuable_inference_statuses$ = SubLFiles.deflexical("*CONTINUABLE-INFERENCE-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list58);
        inference_datastructures_enumerated_types.$avoided_inference_reasons$ = SubLFiles.deflexical("*AVOIDED-INFERENCE-REASONS*", (SubLObject)inference_datastructures_enumerated_types.$list59);
        inference_datastructures_enumerated_types.$inference_suspend_statuses$ = SubLFiles.deflexical("*INFERENCE-SUSPEND-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list60);
        inference_datastructures_enumerated_types.$continuable_inference_suspend_statuses$ = SubLFiles.deflexical("*CONTINUABLE-INFERENCE-SUSPEND-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list64);
        inference_datastructures_enumerated_types.$exhausted_inference_suspend_statuses$ = SubLFiles.deflexical("*EXHAUSTED-INFERENCE-SUSPEND-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list65);
        inference_datastructures_enumerated_types.$tactical_statuses$ = SubLFiles.deflexical("*TACTICAL-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list70);
        inference_datastructures_enumerated_types.$provability_statuses$ = SubLFiles.deflexical("*PROVABILITY-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list71);
        inference_datastructures_enumerated_types.$problem_status_table$ = SubLFiles.deflexical("*PROBLEM-STATUS-TABLE*", (SubLObject)inference_datastructures_enumerated_types.$list72);
        inference_datastructures_enumerated_types.$ordered_tactical_statuses$ = SubLFiles.deflexical("*ORDERED-TACTICAL-STATUSES*", list_utilities.delete_duplicates_sorted(Mapping.mapcar((SubLObject)inference_datastructures_enumerated_types.$sym73$SECOND, inference_datastructures_enumerated_types.$problem_status_table$.getGlobalValue()), (SubLObject)inference_datastructures_enumerated_types.UNPROVIDED));
        inference_datastructures_enumerated_types.$union_ordered_tactical_statuses$ = SubLFiles.deflexical("*UNION-ORDERED-TACTICAL-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list74);
        inference_datastructures_enumerated_types.$add_restriction_layer_of_indirection_by_defaultP$ = SubLFiles.deflexical("*ADD-RESTRICTION-LAYER-OF-INDIRECTION-BY-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$negation_by_failure_by_defaultP$ = SubLFiles.deflexical("*NEGATION-BY-FAILURE-BY-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$evaluate_subl_allowed_defaultP$ = SubLFiles.deflexical("*EVALUATE-SUBL-ALLOWED-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.T);
        inference_datastructures_enumerated_types.$rewrite_allowed_defaultP$ = SubLFiles.defparameter("*REWRITE-ALLOWED-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$abduction_allowed_defaultP$ = SubLFiles.deflexical("*ABDUCTION-ALLOWED-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$new_terms_allowed_defaultP$ = SubLFiles.deflexical("*NEW-TERMS-ALLOWED-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.T);
        inference_datastructures_enumerated_types.$compute_answer_justifications_defaultP$ = SubLFiles.deflexical("*COMPUTE-ANSWER-JUSTIFICATIONS-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.T);
        inference_datastructures_enumerated_types.$default_inference_mode$ = SubLFiles.deflexical("*DEFAULT-INFERENCE-MODE*", (SubLObject)inference_datastructures_enumerated_types.$kw92$CUSTOM);
        inference_datastructures_enumerated_types.$inference_modes$ = SubLFiles.deflexical("*INFERENCE-MODES*", (SubLObject)inference_datastructures_enumerated_types.$list93);
        inference_datastructures_enumerated_types.$problem_link_types$ = SubLFiles.deflexical("*PROBLEM-LINK-TYPES*", (SubLObject)inference_datastructures_enumerated_types.$list94);
        inference_datastructures_enumerated_types.$default_problem_store_name$ = SubLFiles.deflexical("*DEFAULT-PROBLEM-STORE-NAME*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$default_equality_reasoning_method$ = SubLFiles.deflexical("*DEFAULT-EQUALITY-REASONING-METHOD*", (SubLObject)inference_datastructures_enumerated_types.$kw96$CZER_EQUAL);
        inference_datastructures_enumerated_types.$problem_store_equality_reasoning_methods$ = SubLFiles.deflexical("*PROBLEM-STORE-EQUALITY-REASONING-METHODS*", (SubLObject)inference_datastructures_enumerated_types.$list97);
        inference_datastructures_enumerated_types.$default_equality_reasoning_domain$ = SubLFiles.deflexical("*DEFAULT-EQUALITY-REASONING-DOMAIN*", (SubLObject)inference_datastructures_enumerated_types.$kw20$ALL);
        inference_datastructures_enumerated_types.$problem_store_equality_reasoning_domains$ = SubLFiles.deflexical("*PROBLEM-STORE-EQUALITY-REASONING-DOMAINS*", (SubLObject)inference_datastructures_enumerated_types.$list99);
        inference_datastructures_enumerated_types.$default_intermediate_step_validation_level$ = SubLFiles.deflexical("*DEFAULT-INTERMEDIATE-STEP-VALIDATION-LEVEL*", (SubLObject)inference_datastructures_enumerated_types.$kw22$NONE);
        inference_datastructures_enumerated_types.$intermediate_step_validation_levels$ = SubLFiles.deflexical("*INTERMEDIATE-STEP-VALIDATION-LEVELS*", (SubLObject)inference_datastructures_enumerated_types.$list101);
        inference_datastructures_enumerated_types.$default_max_problem_count$ = SubLFiles.deflexical("*DEFAULT-MAX-PROBLEM-COUNT*", (SubLObject)inference_datastructures_enumerated_types.$int103$100000);
        inference_datastructures_enumerated_types.$removal_allowed_by_defaultP$ = SubLFiles.deflexical("*REMOVAL-ALLOWED-BY-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.T);
        inference_datastructures_enumerated_types.$transformation_allowed_by_defaultP$ = SubLFiles.deflexical("*TRANSFORMATION-ALLOWED-BY-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.T);
        inference_datastructures_enumerated_types.$default_problem_store_inference_direction$ = SubLFiles.deflexical("*DEFAULT-PROBLEM-STORE-INFERENCE-DIRECTION*", (SubLObject)inference_datastructures_enumerated_types.$kw107$BACKWARD);
        inference_datastructures_enumerated_types.$inference_directions$ = SubLFiles.deflexical("*INFERENCE-DIRECTIONS*", (SubLObject)inference_datastructures_enumerated_types.$list108);
        inference_datastructures_enumerated_types.$tactic_statuses$ = SubLFiles.deflexical("*TACTIC-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list110);
        inference_datastructures_enumerated_types.$tactic_types$ = SubLFiles.deflexical("*TACTIC-TYPES*", (SubLObject)inference_datastructures_enumerated_types.$list111);
        inference_datastructures_enumerated_types.$ordered_completenesses$ = SubLFiles.deflexical("*ORDERED-COMPLETENESSES*", (SubLObject)inference_datastructures_enumerated_types.$list119);
        inference_datastructures_enumerated_types.$productivity_to_number_table$ = SubLFiles.deflexical("*PRODUCTIVITY-TO-NUMBER-TABLE*", (SubLObject)inference_datastructures_enumerated_types.$list132);
        inference_datastructures_enumerated_types.$proof_statuses$ = SubLFiles.deflexical("*PROOF-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list134);
        inference_datastructures_enumerated_types.$proof_reject_reasons$ = SubLFiles.deflexical("*PROOF-REJECT-REASONS*", (SubLObject)inference_datastructures_enumerated_types.$list135);
        inference_datastructures_enumerated_types.$destructibility_statuses$ = SubLFiles.deflexical("*DESTRUCTIBILITY-STATUSES*", (SubLObject)inference_datastructures_enumerated_types.$list136);
        inference_datastructures_enumerated_types.$balancing_tactician_strategy_type_properties$ = SubLFiles.deflexical("*BALANCING-TACTICIAN-STRATEGY-TYPE-PROPERTIES*", (SubLObject)inference_datastructures_enumerated_types.$list148);
        inference_datastructures_enumerated_types.$legacy_strategy_type_properties$ = SubLFiles.deflexical("*LEGACY-STRATEGY-TYPE-PROPERTIES*", (SubLObject)inference_datastructures_enumerated_types.$list149);
        inference_datastructures_enumerated_types.$strategy_type_properties$ = SubLFiles.deflexical("*STRATEGY-TYPE-PROPERTIES*", ConsesLow.append(inference_datastructures_enumerated_types.$balancing_tactician_strategy_type_properties$.getGlobalValue(), inference_datastructures_enumerated_types.$legacy_strategy_type_properties$.getGlobalValue()));
        inference_datastructures_enumerated_types.$inference_return_types$ = SubLFiles.deflexical("*INFERENCE-RETURN-TYPES*", (SubLObject)inference_datastructures_enumerated_types.$list153);
        inference_datastructures_enumerated_types.$inference_default_return_type$ = SubLFiles.deflexical("*INFERENCE-DEFAULT-RETURN-TYPE*", (SubLObject)inference_datastructures_enumerated_types.$kw154$BINDINGS);
        inference_datastructures_enumerated_types.$inference_answer_languages$ = SubLFiles.deflexical("*INFERENCE-ANSWER-LANGUAGES*", (SubLObject)inference_datastructures_enumerated_types.$list158);
        inference_datastructures_enumerated_types.$inference_default_answer_language$ = SubLFiles.deflexical("*INFERENCE-DEFAULT-ANSWER-LANGUAGE*", (SubLObject)inference_datastructures_enumerated_types.$kw159$EL);
        inference_datastructures_enumerated_types.$result_uniqueness_criteria$ = SubLFiles.deflexical("*RESULT-UNIQUENESS-CRITERIA*", (SubLObject)inference_datastructures_enumerated_types.$list161);
        inference_datastructures_enumerated_types.$default_result_uniqueness_criterion$ = SubLFiles.deflexical("*DEFAULT-RESULT-UNIQUENESS-CRITERION*", (SubLObject)inference_datastructures_enumerated_types.$kw154$BINDINGS);
        inference_datastructures_enumerated_types.$inference_disjunction_free_el_vars_policies$ = SubLFiles.deflexical("*INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICIES*", (SubLObject)inference_datastructures_enumerated_types.$list163);
        inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$ = SubLFiles.deflexical("*DEFAULT-INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY*", (SubLObject)inference_datastructures_enumerated_types.$kw164$REQUIRE_EQUAL);
        inference_datastructures_enumerated_types.$inference_transitive_closure_modes$ = SubLFiles.deflexical("*INFERENCE-TRANSITIVE-CLOSURE-MODES*", (SubLObject)inference_datastructures_enumerated_types.$list166);
        inference_datastructures_enumerated_types.$inference_transitive_closure_mode_default$ = SubLFiles.deflexical("*INFERENCE-TRANSITIVE-CLOSURE-MODE-DEFAULT*", (SubLObject)inference_datastructures_enumerated_types.$kw22$NONE);
        inference_datastructures_enumerated_types.$maintain_term_working_set_defaultP$ = SubLFiles.deflexical("*MAINTAIN-TERM-WORKING-SET-DEFAULT?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_events_default$ = SubLFiles.deflexical("*INFERENCE-EVENTS-DEFAULT*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_event_types$ = SubLFiles.deflexical("*INFERENCE-EVENT-TYPES*", (SubLObject)inference_datastructures_enumerated_types.$list170);
        inference_datastructures_enumerated_types.$inference_halt_conditions_default$ = SubLFiles.deflexical("*INFERENCE-HALT-CONDITIONS-DEFAULT*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_halt_conditions$ = SubLFiles.deflexical("*INFERENCE-HALT-CONDITIONS*", (SubLObject)inference_datastructures_enumerated_types.$list172);
        inference_datastructures_enumerated_types.$inference_accumulator_types$ = SubLFiles.deflexical("*INFERENCE-ACCUMULATOR-TYPES*", (SubLObject)inference_datastructures_enumerated_types.$list173);
        inference_datastructures_enumerated_types.$inference_default_forget_extra_resultsP$ = SubLFiles.deflexical("*INFERENCE-DEFAULT-FORGET-EXTRA-RESULTS?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_default_cache_inference_resultsP$ = SubLFiles.deflexical("*INFERENCE-DEFAULT-CACHE-INFERENCE-RESULTS?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_default_browsableP$ = SubLFiles.deflexical("*INFERENCE-DEFAULT-BROWSABLE?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        inference_datastructures_enumerated_types.$inference_default_continuableP$ = SubLFiles.deflexical("*INFERENCE-DEFAULT-CONTINUABLE?*", (SubLObject)inference_datastructures_enumerated_types.NIL);
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    public static SubLObject setup_inference_datastructures_enumerated_types_file() {
        access_macros.register_external_symbol((SubLObject)inference_datastructures_enumerated_types.$sym0$QUERY_PROPERTY_P);
        utilities_macros.register_cyc_api_function((SubLObject)inference_datastructures_enumerated_types.$sym1$ALL_QUERY_PROPERTIES, (SubLObject)inference_datastructures_enumerated_types.NIL, (SubLObject)inference_datastructures_enumerated_types.$str2$Return_a_list_of_all_the_query_pr, (SubLObject)inference_datastructures_enumerated_types.NIL, (SubLObject)inference_datastructures_enumerated_types.$list3);
        access_macros.register_external_symbol((SubLObject)inference_datastructures_enumerated_types.$sym51$PROBLEM_STORE_PROPERTY_P);
        return (SubLObject)inference_datastructures_enumerated_types.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_datastructures_enumerated_types_file();
    }
    
    public void initializeVariables() {
        init_inference_datastructures_enumerated_types_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_datastructures_enumerated_types_file();
    }
    
    static {
        me = (SubLFile)new inference_datastructures_enumerated_types();
        inference_datastructures_enumerated_types.$specially_handled_inference_metrics$ = null;
        inference_datastructures_enumerated_types.$non_inference_query_metrics$ = null;
        inference_datastructures_enumerated_types.$arete_query_metrics$ = null;
        inference_datastructures_enumerated_types.$removal_ask_query_metrics$ = null;
        inference_datastructures_enumerated_types.$inference_static_properties$ = null;
        inference_datastructures_enumerated_types.$inference_allows_hl_predicate_transformation_by_defaultP$ = null;
        inference_datastructures_enumerated_types.$inference_allows_unbound_predicate_transformation_by_defaultP$ = null;
        inference_datastructures_enumerated_types.$inference_allows_evaluatable_predicate_transformation_by_defaultP$ = null;
        inference_datastructures_enumerated_types.$inference_allows_indeterminate_results_by_defaultP$ = null;
        inference_datastructures_enumerated_types.$default_allowed_rules$ = null;
        inference_datastructures_enumerated_types.$default_forbidden_rules$ = null;
        inference_datastructures_enumerated_types.$default_allowed_modules$ = null;
        inference_datastructures_enumerated_types.$inference_allows_abnormality_checking_by_defaultP$ = null;
        inference_datastructures_enumerated_types.$inference_resource_constraints$ = null;
        inference_datastructures_enumerated_types.$default_max_number$ = null;
        inference_datastructures_enumerated_types.$default_max_time$ = null;
        inference_datastructures_enumerated_types.$default_max_step$ = null;
        inference_datastructures_enumerated_types.$default_forward_max_time$ = null;
        inference_datastructures_enumerated_types.$default_max_proof_depth$ = null;
        inference_datastructures_enumerated_types.$default_max_transformation_depth$ = null;
        inference_datastructures_enumerated_types.$default_min_rule_utility$ = null;
        inference_datastructures_enumerated_types.$default_probably_approximately_done$ = null;
        inference_datastructures_enumerated_types.$inference_other_dynamic_properties$ = null;
        inference_datastructures_enumerated_types.$default_inference_metrics_template$ = null;
        inference_datastructures_enumerated_types.$strategy_static_properties$ = null;
        inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$ = null;
        inference_datastructures_enumerated_types.$default_proof_spec$ = null;
        inference_datastructures_enumerated_types.$strategy_dynamic_properties$ = null;
        inference_datastructures_enumerated_types.$default_productivity_limit$ = null;
        inference_datastructures_enumerated_types.$problem_store_static_properties$ = null;
        inference_datastructures_enumerated_types.$problem_store_dynamic_properties$ = null;
        inference_datastructures_enumerated_types.$inference_meta_properties$ = null;
        inference_datastructures_enumerated_types.$inference_statuses$ = null;
        inference_datastructures_enumerated_types.$continuable_inference_statuses$ = null;
        inference_datastructures_enumerated_types.$avoided_inference_reasons$ = null;
        inference_datastructures_enumerated_types.$inference_suspend_statuses$ = null;
        inference_datastructures_enumerated_types.$continuable_inference_suspend_statuses$ = null;
        inference_datastructures_enumerated_types.$exhausted_inference_suspend_statuses$ = null;
        inference_datastructures_enumerated_types.$tactical_statuses$ = null;
        inference_datastructures_enumerated_types.$provability_statuses$ = null;
        inference_datastructures_enumerated_types.$problem_status_table$ = null;
        inference_datastructures_enumerated_types.$ordered_tactical_statuses$ = null;
        inference_datastructures_enumerated_types.$union_ordered_tactical_statuses$ = null;
        inference_datastructures_enumerated_types.$add_restriction_layer_of_indirection_by_defaultP$ = null;
        inference_datastructures_enumerated_types.$negation_by_failure_by_defaultP$ = null;
        inference_datastructures_enumerated_types.$evaluate_subl_allowed_defaultP$ = null;
        inference_datastructures_enumerated_types.$rewrite_allowed_defaultP$ = null;
        inference_datastructures_enumerated_types.$abduction_allowed_defaultP$ = null;
        inference_datastructures_enumerated_types.$new_terms_allowed_defaultP$ = null;
        inference_datastructures_enumerated_types.$compute_answer_justifications_defaultP$ = null;
        inference_datastructures_enumerated_types.$default_inference_mode$ = null;
        inference_datastructures_enumerated_types.$inference_modes$ = null;
        inference_datastructures_enumerated_types.$problem_link_types$ = null;
        inference_datastructures_enumerated_types.$default_problem_store_name$ = null;
        inference_datastructures_enumerated_types.$default_equality_reasoning_method$ = null;
        inference_datastructures_enumerated_types.$problem_store_equality_reasoning_methods$ = null;
        inference_datastructures_enumerated_types.$default_equality_reasoning_domain$ = null;
        inference_datastructures_enumerated_types.$problem_store_equality_reasoning_domains$ = null;
        inference_datastructures_enumerated_types.$default_intermediate_step_validation_level$ = null;
        inference_datastructures_enumerated_types.$intermediate_step_validation_levels$ = null;
        inference_datastructures_enumerated_types.$default_max_problem_count$ = null;
        inference_datastructures_enumerated_types.$removal_allowed_by_defaultP$ = null;
        inference_datastructures_enumerated_types.$transformation_allowed_by_defaultP$ = null;
        inference_datastructures_enumerated_types.$default_problem_store_inference_direction$ = null;
        inference_datastructures_enumerated_types.$inference_directions$ = null;
        inference_datastructures_enumerated_types.$tactic_statuses$ = null;
        inference_datastructures_enumerated_types.$tactic_types$ = null;
        inference_datastructures_enumerated_types.$ordered_completenesses$ = null;
        inference_datastructures_enumerated_types.$productivity_to_number_table$ = null;
        inference_datastructures_enumerated_types.$proof_statuses$ = null;
        inference_datastructures_enumerated_types.$proof_reject_reasons$ = null;
        inference_datastructures_enumerated_types.$destructibility_statuses$ = null;
        inference_datastructures_enumerated_types.$balancing_tactician_strategy_type_properties$ = null;
        inference_datastructures_enumerated_types.$legacy_strategy_type_properties$ = null;
        inference_datastructures_enumerated_types.$strategy_type_properties$ = null;
        inference_datastructures_enumerated_types.$inference_return_types$ = null;
        inference_datastructures_enumerated_types.$inference_default_return_type$ = null;
        inference_datastructures_enumerated_types.$inference_answer_languages$ = null;
        inference_datastructures_enumerated_types.$inference_default_answer_language$ = null;
        inference_datastructures_enumerated_types.$result_uniqueness_criteria$ = null;
        inference_datastructures_enumerated_types.$default_result_uniqueness_criterion$ = null;
        inference_datastructures_enumerated_types.$inference_disjunction_free_el_vars_policies$ = null;
        inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$ = null;
        inference_datastructures_enumerated_types.$inference_transitive_closure_modes$ = null;
        inference_datastructures_enumerated_types.$inference_transitive_closure_mode_default$ = null;
        inference_datastructures_enumerated_types.$maintain_term_working_set_defaultP$ = null;
        inference_datastructures_enumerated_types.$inference_events_default$ = null;
        inference_datastructures_enumerated_types.$inference_event_types$ = null;
        inference_datastructures_enumerated_types.$inference_halt_conditions_default$ = null;
        inference_datastructures_enumerated_types.$inference_halt_conditions$ = null;
        inference_datastructures_enumerated_types.$inference_accumulator_types$ = null;
        inference_datastructures_enumerated_types.$inference_default_forget_extra_resultsP$ = null;
        inference_datastructures_enumerated_types.$inference_default_cache_inference_resultsP$ = null;
        inference_datastructures_enumerated_types.$inference_default_browsableP$ = null;
        inference_datastructures_enumerated_types.$inference_default_continuableP$ = null;
        $sym0$QUERY_PROPERTY_P = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $sym1$ALL_QUERY_PROPERTIES = SubLObjectFactory.makeSymbol("ALL-QUERY-PROPERTIES");
        $str2$Return_a_list_of_all_the_query_pr = SubLObjectFactory.makeString("Return a list of all the query properties.\n   @note destructible");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")));
        $sym4$QUERY_STATIC_PROPERTY_P = SubLObjectFactory.makeSymbol("QUERY-STATIC-PROPERTY-P");
        $sym5$QUERY_STATIC_OR_META_PROPERTY_P = SubLObjectFactory.makeSymbol("QUERY-STATIC-OR-META-PROPERTY-P");
        $sym6$QUERY_DYNAMIC_PROPERTY_P = SubLObjectFactory.makeSymbol("QUERY-DYNAMIC-PROPERTY-P");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-ROOT-TIMES"), (SubLObject)SubLObjectFactory.makeKeyword("NEW-ROOT-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-CREATION-TIMES"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-IDS"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-USER-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-SYSTEM-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("HYPOTHESIZATION-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"));
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ANSWER-COUNT"), SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER"), SubLObjectFactory.makeKeyword("TIME-PER-ANSWER"), SubLObjectFactory.makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), SubLObjectFactory.makeKeyword("TOTAL-TIME"), SubLObjectFactory.makeKeyword("COMPLETE-USER-TIME"), SubLObjectFactory.makeKeyword("COMPLETE-SYSTEM-TIME"), SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME") });
        $sym11$INFERENCE_PROPERTY_P = SubLObjectFactory.makeSymbol("INFERENCE-PROPERTY-P");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS"), SubLObjectFactory.makeKeyword("PROBLEM-STORE"), SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?"), SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE"), SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), SubLObjectFactory.makeKeyword("ALLOWED-RULES"), SubLObjectFactory.makeKeyword("FORBIDDEN-RULES"), SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), SubLObjectFactory.makeKeyword("MAINTAIN-TERM-WORKING-SET?"), SubLObjectFactory.makeKeyword("EVENTS"), SubLObjectFactory.makeKeyword("HALT-CONDITIONS") });
        $sym13$INFERENCE_STATIC_PROPERTY_P = SubLObjectFactory.makeSymbol("INFERENCE-STATIC-PROPERTY-P");
        $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P = SubLObjectFactory.makeSymbol("INFERENCE-STATIC-OR-META-PROPERTY-P");
        $kw15$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_ = SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $kw19$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw20$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw21$ALLOWED_RULES = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $kw22$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw23$FORBIDDEN_RULES = SubLObjectFactory.makeKeyword("FORBIDDEN-RULES");
        $kw24$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $kw25$ALLOW_ABNORMALITY_CHECKING_ = SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-STEP"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"));
        $sym27$INFERENCE_RESOURCE_CONSTRAINT_P = SubLObjectFactory.makeSymbol("INFERENCE-RESOURCE-CONSTRAINT-P");
        $kw28$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw29$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw30$MAX_STEP = SubLObjectFactory.makeKeyword("MAX-STEP");
        $kw31$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw32$FORWARD_MAX_TIME = SubLObjectFactory.makeKeyword("FORWARD-MAX-TIME");
        $kw33$MAX_PROOF_DEPTH = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $kw34$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $int35$_100 = SubLObjectFactory.makeInteger(-100);
        $kw36$MIN_RULE_UTILITY = SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY");
        $kw37$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FORWARD-MAX-TIME"), SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY"), SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeKeyword("RETURN"), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), SubLObjectFactory.makeKeyword("FORGET-EXTRA-RESULTS?"), SubLObjectFactory.makeKeyword("BROWSABLE?"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), SubLObjectFactory.makeKeyword("BLOCK?"), SubLObjectFactory.makeKeyword("METRICS") });
        $sym39$INFERENCE_DYNAMIC_PROPERTY_P = SubLObjectFactory.makeSymbol("INFERENCE-DYNAMIC-PROPERTY-P");
        $kw40$METRICS = SubLObjectFactory.makeKeyword("METRICS");
        $sym41$STRATEGY_PROPERTY_P = SubLObjectFactory.makeSymbol("STRATEGY-PROPERTY-P");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("PROOF-SPEC"));
        $sym43$STRATEGY_STATIC_PROPERTY_P = SubLObjectFactory.makeSymbol("STRATEGY-STATIC-PROPERTY-P");
        $kw44$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $kw45$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $kw46$PROOF_SPEC = SubLObjectFactory.makeKeyword("PROOF-SPEC");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"));
        $sym48$STRATEGY_DYNAMIC_PROPERTY_P = SubLObjectFactory.makeSymbol("STRATEGY-DYNAMIC-PROPERTY-P");
        $int49$100 = SubLObjectFactory.makeInteger(100);
        $kw50$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $sym51$PROBLEM_STORE_PROPERTY_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $list52 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PROBLEM-STORE-NAME"), SubLObjectFactory.makeKeyword("EQUALITY-REASONING-METHOD"), SubLObjectFactory.makeKeyword("EQUALITY-REASONING-DOMAIN"), SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("REMOVAL-ALLOWED?"), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?"), SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("EVALUATE-SUBL-ALLOWED?"), SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?"), SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?"), SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?") });
        $sym53$PROBLEM_STORE_STATIC_PROPERTY_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-STATIC-PROPERTY-P");
        $sym54$PROBLEM_STORE_DYNAMIC_PROPERTY_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-DYNAMIC-PROPERTY-P");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"));
        $sym56$INFERENCE_META_PROPERTY_P = SubLObjectFactory.makeSymbol("INFERENCE-META-PROPERTY-P");
        $list57 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NEW"), SubLObjectFactory.makeKeyword("PREPARED"), SubLObjectFactory.makeKeyword("READY"), SubLObjectFactory.makeKeyword("RUNNING"), SubLObjectFactory.makeKeyword("SUSPENDED"), SubLObjectFactory.makeKeyword("DEAD"), SubLObjectFactory.makeKeyword("TAUTOLOGY"), SubLObjectFactory.makeKeyword("CONTRADICTION"), SubLObjectFactory.makeKeyword("ILL-FORMED") });
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREPARED"), (SubLObject)SubLObjectFactory.makeKeyword("SUSPENDED"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TAUTOLOGY"), (SubLObject)SubLObjectFactory.makeKeyword("CONTRADICTION"), (SubLObject)SubLObjectFactory.makeKeyword("ILL-FORMED"), (SubLObject)SubLObjectFactory.makeKeyword("NON-TRIVIAL"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-A-QUERY"));
        $list60 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ABORT"), SubLObjectFactory.makeKeyword("INTERRUPT"), SubLObjectFactory.makeKeyword("MAX-NUMBER"), SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeKeyword("MAX-STEP"), SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("MAX-PROOF-COUNT"), SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeKeyword("EXHAUST"), SubLObjectFactory.makeKeyword("EXHAUST-TOTAL") });
        $sym61$INFERENCE_STATUS_P = SubLObjectFactory.makeSymbol("INFERENCE-STATUS-P");
        $kw62$SUSPENDED = SubLObjectFactory.makeKeyword("SUSPENDED");
        $kw63$TAUTOLOGY = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERRUPT"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-STEP"), (SubLObject)SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)SubLObjectFactory.makeKeyword("EXHAUST"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXHAUST"), (SubLObject)SubLObjectFactory.makeKeyword("EXHAUST-TOTAL"));
        $kw66$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $sym67$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw68$JUSTIFICATION = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $sym69$HL_JUSTIFICATION_LIST_P = SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-LIST-P");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW"), (SubLObject)SubLObjectFactory.makeKeyword("UNEXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("PENDING"), (SubLObject)SubLObjectFactory.makeKeyword("FINISHED"));
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTRAL"), (SubLObject)SubLObjectFactory.makeKeyword("NO-GOOD"));
        $list72 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW"), (SubLObject)SubLObjectFactory.makeKeyword("NEW"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNEXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("UNEXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNEXAMINED-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("UNEXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("GOOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNEXAMINED-NO-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("UNEXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("NO-GOOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXAMINED-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("GOOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXAMINED-NO-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("NO-GOOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("GOOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE-NO-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("NO-GOOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PENDING"), (SubLObject)SubLObjectFactory.makeKeyword("PENDING"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PENDING-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("PENDING"), (SubLObject)SubLObjectFactory.makeKeyword("GOOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PENDING-NO-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("PENDING"), (SubLObject)SubLObjectFactory.makeKeyword("NO-GOOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FINISHED"), (SubLObject)SubLObjectFactory.makeKeyword("FINISHED"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FINISHED-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("FINISHED"), (SubLObject)SubLObjectFactory.makeKeyword("GOOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FINISHED-NO-GOOD"), (SubLObject)SubLObjectFactory.makeKeyword("FINISHED"), (SubLObject)SubLObjectFactory.makeKeyword("NO-GOOD")) });
        $sym73$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW"), (SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("PENDING"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("UNEXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("FINISHED"));
        $str75$No_match_to_combine__s_and__s = SubLObjectFactory.makeString("No match to combine ~s and ~s");
        $kw76$GOOD = SubLObjectFactory.makeKeyword("GOOD");
        $kw77$NO_GOOD = SubLObjectFactory.makeKeyword("NO-GOOD");
        $kw78$NEUTRAL = SubLObjectFactory.makeKeyword("NEUTRAL");
        $kw79$UNEXAMINED = SubLObjectFactory.makeKeyword("UNEXAMINED");
        $kw80$EXAMINED = SubLObjectFactory.makeKeyword("EXAMINED");
        $kw81$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw82$PENDING = SubLObjectFactory.makeKeyword("PENDING");
        $kw83$FINISHED = SubLObjectFactory.makeKeyword("FINISHED");
        $kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $kw85$NEGATION_BY_FAILURE_ = SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?");
        $kw86$COMPLETENESS_MINIMIZATION_ALLOWED_ = SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $kw87$EVALUATE_SUBL_ALLOWED_ = SubLObjectFactory.makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $kw88$REWRITE_ALLOWED_ = SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?");
        $kw89$ABDUCTION_ALLOWED_ = SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?");
        $kw90$NEW_TERMS_ALLOWED_ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $kw91$COMPUTE_ANSWER_JUSTIFICATIONS_ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $kw92$CUSTOM = SubLObjectFactory.makeKeyword("CUSTOM");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOW"), (SubLObject)SubLObjectFactory.makeKeyword("EXTENDED"), (SubLObject)SubLObjectFactory.makeKeyword("MAXIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("CUSTOM"));
        $list94 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REMOVAL"), SubLObjectFactory.makeKeyword("TRANSFORMATION"), SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION"), SubLObjectFactory.makeKeyword("REWRITE"), SubLObjectFactory.makeKeyword("JOIN-ORDERED"), SubLObjectFactory.makeKeyword("JOIN"), SubLObjectFactory.makeKeyword("SPLIT"), SubLObjectFactory.makeKeyword("RESTRICTION"), SubLObjectFactory.makeKeyword("UNION"), SubLObjectFactory.makeKeyword("DISJUNCTIVE-ASSUMPTION"), SubLObjectFactory.makeKeyword("ANSWER"), SubLObjectFactory.makeKeyword("INDIRECTION") });
        $kw95$PROBLEM_STORE_NAME = SubLObjectFactory.makeKeyword("PROBLEM-STORE-NAME");
        $kw96$CZER_EQUAL = SubLObjectFactory.makeKeyword("CZER-EQUAL");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EQUAL"), (SubLObject)SubLObjectFactory.makeKeyword("CZER-EQUAL"));
        $kw98$EQUALITY_REASONING_METHOD = SubLObjectFactory.makeKeyword("EQUALITY-REASONING-METHOD");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("SINGLE-LITERAL"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"));
        $kw100$EQUALITY_REASONING_DOMAIN = SubLObjectFactory.makeKeyword("EQUALITY-REASONING-DOMAIN");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"));
        $kw102$INTERMEDIATE_STEP_VALIDATION_LEVEL = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $int103$100000 = SubLObjectFactory.makeInteger(100000);
        $kw104$MAX_PROBLEM_COUNT = SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT");
        $kw105$REMOVAL_ALLOWED_ = SubLObjectFactory.makeKeyword("REMOVAL-ALLOWED?");
        $kw106$TRANSFORMATION_ALLOWED_ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $kw107$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $kw109$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("EXECUTED"), (SubLObject)SubLObjectFactory.makeKeyword("DISCARDED"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("META-REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION"), (SubLObject)SubLObjectFactory.makeKeyword("REWRITE"), (SubLObject)SubLObjectFactory.makeKeyword("STRUCTURAL"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE"));
        $kw112$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $kw113$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $kw114$STRUCTURAL = SubLObjectFactory.makeKeyword("STRUCTURAL");
        $kw115$REMOVAL_CONJUNCTIVE = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE");
        $kw116$REWRITE = SubLObjectFactory.makeKeyword("REWRITE");
        $kw117$META_REMOVAL = SubLObjectFactory.makeKeyword("META-REMOVAL");
        $str118$HL_Module_of_unknown_type___s = SubLObjectFactory.makeString("HL-Module of unknown type: ~s");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IMPOSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), (SubLObject)SubLObjectFactory.makeKeyword("INCOMPLETE"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE"));
        $sym120$COMPLETENESS_P = SubLObjectFactory.makeSymbol("COMPLETENESS-P");
        $kw121$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $str122$Complete = SubLObjectFactory.makeString("Complete");
        $kw123$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $str124$Incomplete = SubLObjectFactory.makeString("Incomplete");
        $kw125$GROSSLY_INCOMPLETE = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $str126$Grossly_Incomplete = SubLObjectFactory.makeString("Grossly Incomplete");
        $kw127$IMPOSSIBLE = SubLObjectFactory.makeKeyword("IMPOSSIBLE");
        $str128$Impossible = SubLObjectFactory.makeString("Impossible");
        $str129$Unexpected_completeness__a = SubLObjectFactory.makeString("Unexpected completeness ~a");
        $sym130$COMPLETENESS__ = SubLObjectFactory.makeSymbol("COMPLETENESS-<");
        $sym131$COMPLETENESS__ = SubLObjectFactory.makeSymbol("COMPLETENESS->");
        $list132 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeDouble(0.5), (SubLObject)SubLObjectFactory.makeInteger(50)), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeDouble(1.5), (SubLObject)SubLObjectFactory.makeInteger(150)));
        $sym133$PRODUCTIVITY_P = SubLObjectFactory.makeSymbol("PRODUCTIVITY-P");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROVEN"), (SubLObject)SubLObjectFactory.makeKeyword("REJECTED"));
        $list135 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("CIRCULAR"), SubLObjectFactory.makeKeyword("ILL-FORMED"), SubLObjectFactory.makeKeyword("NON-ABDUCIBLE-RULE"), SubLObjectFactory.makeKeyword("REJECTED-SUBPROOF"), SubLObjectFactory.makeKeyword("MAX-PROOF-BUBBLING-DEPTH"), SubLObjectFactory.makeKeyword("INCONSISTENT-MT-ASSUMPTIONS"), SubLObjectFactory.makeKeyword("EXCEPTED-ASSERTION"), SubLObjectFactory.makeKeyword("ABNORMAL"), SubLObjectFactory.makeKeyword("PROBLEM-NO-GOOD"), SubLObjectFactory.makeKeyword("MODUS-TOLLENS-WITH-NON-WFF") });
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDESTRUCTIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("DESTRUCTIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN"));
        $sym137$DESTRUCTIBILITY_STATUS_P = SubLObjectFactory.makeSymbol("DESTRUCTIBILITY-STATUS-P");
        $kw138$INDESTRUCTIBLE = SubLObjectFactory.makeKeyword("INDESTRUCTIBLE");
        $str139$Indestructible = SubLObjectFactory.makeString("Indestructible");
        $kw140$DESTRUCTIBLE = SubLObjectFactory.makeKeyword("DESTRUCTIBLE");
        $str141$Destructible = SubLObjectFactory.makeString("Destructible");
        $kw142$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str143$Unknown = SubLObjectFactory.makeString("Unknown");
        $str144$Unexpected_destructibility_status = SubLObjectFactory.makeString("Unexpected destructibility status ~s");
        $str145$I = SubLObjectFactory.makeString("I");
        $str146$ = SubLObjectFactory.makeString("");
        $str147$_ = SubLObjectFactory.makeString("?");
        $list148 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CONSTRUCTOR"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DO-ONE-STEP"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DONE?"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SELECT-BEST-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXECUTE-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INITIAL-RELEVANT-STRATEGIES"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NEW-TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SPLIT-TACTICS-POSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INITIALIZE-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-STRATEGY-INITIALIZE-PROPERTIES")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UPDATE-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-STRATEGY-UPDATE-PROPERTIES")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RECONSIDER-SET-ASIDES"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CONTINUATION-POSSIBLE?"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("QUIESCE"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NEW-ARGUMENT-LINK"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-COULD-BE-PENDING"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-NOTHING-TO-DO?"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("THROW-AWAY-PROBLEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("THROW-AWAY-TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SET-ASIDE-TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PEEK-NEXT-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MOTIVATE-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ACTIVATE-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LINK-HEAD-MOTIVATED?"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), (SubLObject)SubLObjectFactory.makeSymbol("ZERO")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("HAPPINESS-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("NULL")) });
        $list149 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PEEK-NEW-ROOT"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ACTIVATE-NEW-ROOT"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POP-NEW-ROOT"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NO-NEW-ROOTS"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("THROW-AWAY-NEW-ROOT"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PEEK-REMOVAL-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ACTIVATE-REMOVAL-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POP-REMOVAL-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PEEK-TRANSFORMATION-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POP-TRANSFORMATION-STRATEGEM"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS"), (SubLObject)SubLObjectFactory.makeKeyword("MUST-OVERRIDE")) });
        $sym150$STRATEGY_TYPE_PROPERTY_P = SubLObjectFactory.makeSymbol("STRATEGY-TYPE-PROPERTY-P");
        $kw151$MUST_OVERRIDE = SubLObjectFactory.makeKeyword("MUST-OVERRIDE");
        $str152$Strategy_must_implement_method__s = SubLObjectFactory.makeString("Strategy must implement method ~s");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS"));
        $kw154$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw155$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $kw156$FORMAT = SubLObjectFactory.makeKeyword("FORMAT");
        $kw157$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EL"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $kw159$EL = SubLObjectFactory.makeKeyword("EL");
        $kw160$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROOF"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"));
        $kw162$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRE-EQUAL"), (SubLObject)SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION"), (SubLObject)SubLObjectFactory.makeKeyword("COMPUTE-UNION"));
        $kw164$REQUIRE_EQUAL = SubLObjectFactory.makeKeyword("REQUIRE-EQUAL");
        $kw165$DISJUNCTION_FREE_EL_VARS_POLICY = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeKeyword("FOCUSED"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $kw167$TRANSITIVE_CLOSURE_MODE = SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $kw168$MAINTAIN_TERM_WORKING_SET_ = SubLObjectFactory.makeKeyword("MAINTAIN-TERM-WORKING-SET?");
        $kw169$EVENTS = SubLObjectFactory.makeKeyword("EVENTS");
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("STATUS-CHANGE"), (SubLObject)SubLObjectFactory.makeKeyword("NEW-TRANSFORMATION-DEPTH-REACHED"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI-QUERY"));
        $kw171$HALT_CONDITIONS = SubLObjectFactory.makeKeyword("HALT-CONDITIONS");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS"));
        $list173 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SUM-ACCUMULATOR")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SKSI-QUERY-START-TIMES-ACC"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST-ACCUMULATOR")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SPARQL-QUERY-PROFILE-ACC"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST-ACCUMULATOR")));
        $sym174$INFERENCE_ACCUMULATOR_TYPE_P = SubLObjectFactory.makeSymbol("INFERENCE-ACCUMULATOR-TYPE-P");
        $kw175$FORGET_EXTRA_RESULTS_ = SubLObjectFactory.makeKeyword("FORGET-EXTRA-RESULTS?");
        $kw176$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw177$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw178$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw179$BLOCK_ = SubLObjectFactory.makeKeyword("BLOCK?");
        $kw180$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $kw181$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $kw182$NON_EXPLANATORY_SENTENCE = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE");
        $sym183$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
    }
    
    public static final class $query_static_property_p$UnaryFunction extends UnaryFunction
    {
        public $query_static_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QUERY-STATIC-PROPERTY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_enumerated_types.query_static_property_p(arg1);
        }
    }
    
    public static final class $query_dynamic_property_p$UnaryFunction extends UnaryFunction
    {
        public $query_dynamic_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QUERY-DYNAMIC-PROPERTY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_enumerated_types.query_dynamic_property_p(arg1);
        }
    }
    
    public static final class $inference_query_metric_p$UnaryFunction extends UnaryFunction
    {
        public $inference_query_metric_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-QUERY-METRIC-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_enumerated_types.inference_query_metric_p(arg1);
        }
    }
    
    public static final class $inference_static_property_p$UnaryFunction extends UnaryFunction
    {
        public $inference_static_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-STATIC-PROPERTY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_enumerated_types.inference_static_property_p(arg1);
        }
    }
    
    public static final class $inference_dynamic_property_p$UnaryFunction extends UnaryFunction
    {
        public $inference_dynamic_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-DYNAMIC-PROPERTY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_enumerated_types.inference_dynamic_property_p(arg1);
        }
    }
    
    public static final class $strategy_static_property_p$UnaryFunction extends UnaryFunction
    {
        public $strategy_static_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGY-STATIC-PROPERTY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_enumerated_types.strategy_static_property_p(arg1);
        }
    }
    
    public static final class $strategy_dynamic_property_p$UnaryFunction extends UnaryFunction
    {
        public $strategy_dynamic_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGY-DYNAMIC-PROPERTY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_enumerated_types.strategy_dynamic_property_p(arg1);
        }
    }
    
    public static final class $problem_store_property_p$UnaryFunction extends UnaryFunction
    {
        public $problem_store_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-STORE-PROPERTY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_enumerated_types.problem_store_property_p(arg1);
        }
    }
}

/*

	Total time: 488 ms
	
*/