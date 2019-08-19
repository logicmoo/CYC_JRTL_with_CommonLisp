package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_datastructures_enumerated_types extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types";
    public static String myFingerPrint = "8d0cf9bbcec6bb641bac6468b8957449605a5e104af755f585416598dc1cbc57";
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4800L)
    private static SubLSymbol $specially_handled_inference_metrics$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5200L)
    private static SubLSymbol $non_inference_query_metrics$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6100L)
    private static SubLSymbol $arete_query_metrics$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6600L)
    private static SubLSymbol $removal_ask_query_metrics$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 7300L)
    private static SubLSymbol $inference_static_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12900L)
    private static SubLSymbol $inference_allows_hl_predicate_transformation_by_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13200L)
    private static SubLSymbol $inference_allows_unbound_predicate_transformation_by_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13500L)
    private static SubLSymbol $inference_allows_evaluatable_predicate_transformation_by_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13900L)
    private static SubLSymbol $inference_allows_indeterminate_results_by_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14200L)
    private static SubLSymbol $default_allowed_rules$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14400L)
    private static SubLSymbol $default_forbidden_rules$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14600L)
    private static SubLSymbol $default_allowed_modules$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14800L)
    private static SubLSymbol $inference_allows_abnormality_checking_by_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 15100L)
    private static SubLSymbol $inference_resource_constraints$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16500L)
    public static SubLSymbol $default_max_number$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16600L)
    public static SubLSymbol $default_max_time$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16800L)
    public static SubLSymbol $default_max_step$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17100L)
    public static SubLSymbol $default_forward_max_time$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17300L)
    public static SubLSymbol $default_max_proof_depth$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17500L)
    public static SubLSymbol $default_max_transformation_depth$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17700L)
    public static SubLSymbol $default_min_rule_utility$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17900L)
    public static SubLSymbol $default_probably_approximately_done$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 18100L)
    private static SubLSymbol $inference_other_dynamic_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22500L)
    public static SubLSymbol $default_inference_metrics_template$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23000L)
    private static SubLSymbol $strategy_static_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24100L)
    public static SubLSymbol $default_removal_backtracking_productivity_limit$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24600L)
    public static SubLSymbol $default_proof_spec$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24900L)
    private static SubLSymbol $strategy_dynamic_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25700L)
    public static SubLSymbol $default_productivity_limit$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 27000L)
    private static SubLSymbol $problem_store_static_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32300L)
    private static SubLSymbol $problem_store_dynamic_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32800L)
    private static SubLSymbol $inference_meta_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 34200L)
    private static SubLSymbol $inference_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35100L)
    private static SubLSymbol $continuable_inference_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35300L)
    private static SubLSymbol $avoided_inference_reasons$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35700L)
    private static SubLSymbol $inference_suspend_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37300L)
    private static SubLSymbol $continuable_inference_suspend_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37800L)
    private static SubLSymbol $exhausted_inference_suspend_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39300L)
    private static SubLSymbol $tactical_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39800L)
    private static SubLSymbol $provability_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 40100L)
    private static SubLSymbol $problem_status_table$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42100L)
    private static SubLSymbol $ordered_tactical_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42600L)
    private static SubLSymbol $union_ordered_tactical_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45300L)
    private static SubLSymbol $add_restriction_layer_of_indirection_by_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45700L)
    private static SubLSymbol $negation_by_failure_by_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46500L)
    private static SubLSymbol $evaluate_subl_allowed_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46800L)
    private static SubLSymbol $rewrite_allowed_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47100L)
    private static SubLSymbol $abduction_allowed_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47400L)
    public static SubLSymbol $new_terms_allowed_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47600L)
    public static SubLSymbol $compute_answer_justifications_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48000L)
    public static SubLSymbol $default_inference_mode$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48100L)
    private static SubLSymbol $inference_modes$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48600L)
    private static SubLSymbol $problem_link_types$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49000L)
    private static SubLSymbol $default_problem_store_name$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49400L)
    public static SubLSymbol $default_equality_reasoning_method$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49600L)
    private static SubLSymbol $problem_store_equality_reasoning_methods$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50200L)
    public static SubLSymbol $default_equality_reasoning_domain$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50400L)
    private static SubLSymbol $problem_store_equality_reasoning_domains$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51000L)
    private static SubLSymbol $default_intermediate_step_validation_level$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51300L)
    private static SubLSymbol $intermediate_step_validation_levels$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52000L)
    public static SubLSymbol $default_max_problem_count$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52400L)
    private static SubLSymbol $removal_allowed_by_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52600L)
    private static SubLSymbol $transformation_allowed_by_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52900L)
    public static SubLSymbol $default_problem_store_inference_direction$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53000L)
    private static SubLSymbol $inference_directions$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53500L)
    private static SubLSymbol $tactic_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53800L)
    private static SubLSymbol $tactic_types$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54900L)
    private static SubLSymbol $ordered_completenesses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57200L)
    private static SubLSymbol $productivity_to_number_table$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60200L)
    private static SubLSymbol $proof_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60500L)
    private static SubLSymbol $proof_reject_reasons$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61000L)
    private static SubLSymbol $destructibility_statuses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 62300L)
    private static SubLSymbol $balancing_tactician_strategy_type_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 66300L)
    private static SubLSymbol $legacy_strategy_type_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 67800L)
    private static SubLSymbol $strategy_type_properties$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68500L)
    private static SubLSymbol $inference_return_types$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68900L)
    public static SubLSymbol $inference_default_return_type$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70000L)
    private static SubLSymbol $inference_answer_languages$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70100L)
    public static SubLSymbol $inference_default_answer_language$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70500L)
    private static SubLSymbol $result_uniqueness_criteria$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70800L)
    public static SubLSymbol $default_result_uniqueness_criterion$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71100L)
    private static SubLSymbol $inference_disjunction_free_el_vars_policies$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71500L)
    public static SubLSymbol $default_inference_disjunction_free_el_vars_policy$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72100L)
    private static SubLSymbol $inference_transitive_closure_modes$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72500L)
    private static SubLSymbol $inference_transitive_closure_mode_default$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72900L)
    public static SubLSymbol $maintain_term_working_set_defaultP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73200L)
    public static SubLSymbol $inference_events_default$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73500L)
    private static SubLSymbol $inference_event_types$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74200L)
    private static SubLSymbol $inference_halt_conditions_default$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74500L)
    private static SubLSymbol $inference_halt_conditions$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74900L)
    private static SubLSymbol $inference_accumulator_types$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75700L)
    private static SubLSymbol $inference_default_forget_extra_resultsP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76200L)
    private static SubLSymbol $inference_default_cache_inference_resultsP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76600L)
    public static SubLSymbol $inference_default_browsableP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77000L)
    public static SubLSymbol $inference_default_continuableP$;
    private static SubLSymbol $sym0$QUERY_PROPERTY_P;
    private static SubLSymbol $sym1$ALL_QUERY_PROPERTIES;
    private static SubLString $str2$Return_a_list_of_all_the_query_pr;
    private static SubLList $list3;
    private static SubLSymbol $sym4$QUERY_STATIC_PROPERTY_P;
    private static SubLSymbol $sym5$QUERY_STATIC_OR_META_PROPERTY_P;
    private static SubLSymbol $sym6$QUERY_DYNAMIC_PROPERTY_P;
    private static SubLList $list7;
    private static SubLList $list8;
    private static SubLList $list9;
    private static SubLList $list10;
    private static SubLSymbol $sym11$INFERENCE_PROPERTY_P;
    private static SubLList $list12;
    private static SubLSymbol $sym13$INFERENCE_STATIC_PROPERTY_P;
    private static SubLSymbol $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLSymbol $ALLOW_HL_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $ALLOW_INDETERMINATE_RESULTS_;
    private static SubLSymbol $ALL;
    private static SubLSymbol $ALLOWED_RULES;
    private static SubLSymbol $NONE;
    private static SubLSymbol $FORBIDDEN_RULES;
    private static SubLSymbol $ALLOWED_MODULES;
    private static SubLSymbol $ALLOW_ABNORMALITY_CHECKING_;
    private static SubLList $list26;
    private static SubLSymbol $sym27$INFERENCE_RESOURCE_CONSTRAINT_P;
    private static SubLSymbol $MAX_NUMBER;
    private static SubLSymbol $MAX_TIME;
    private static SubLSymbol $MAX_STEP;
    private static SubLSymbol $INFERENCE_MODE;
    private static SubLSymbol $FORWARD_MAX_TIME;
    private static SubLSymbol $MAX_PROOF_DEPTH;
    private static SubLSymbol $MAX_TRANSFORMATION_DEPTH;
    private static SubLInteger $int$_100;
    private static SubLSymbol $MIN_RULE_UTILITY;
    private static SubLSymbol $PROBABLY_APPROXIMATELY_DONE;
    private static SubLList $list38;
    private static SubLSymbol $sym39$INFERENCE_DYNAMIC_PROPERTY_P;
    private static SubLSymbol $METRICS;
    private static SubLSymbol $sym41$STRATEGY_PROPERTY_P;
    private static SubLList $list42;
    private static SubLSymbol $sym43$STRATEGY_STATIC_PROPERTY_P;
    private static SubLSymbol $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT;
    private static SubLSymbol $ANYTHING;
    private static SubLSymbol $PROOF_SPEC;
    private static SubLList $list47;
    private static SubLSymbol $sym48$STRATEGY_DYNAMIC_PROPERTY_P;
    private static SubLInteger $int$100;
    private static SubLSymbol $PRODUCTIVITY_LIMIT;
    private static SubLSymbol $sym51$PROBLEM_STORE_PROPERTY_P;
    private static SubLList $list52;
    private static SubLSymbol $sym53$PROBLEM_STORE_STATIC_PROPERTY_P;
    private static SubLSymbol $sym54$PROBLEM_STORE_DYNAMIC_PROPERTY_P;
    private static SubLList $list55;
    private static SubLSymbol $sym56$INFERENCE_META_PROPERTY_P;
    private static SubLList $list57;
    private static SubLList $list58;
    private static SubLList $list59;
    private static SubLList $list60;
    private static SubLSymbol $sym61$INFERENCE_STATUS_P;
    private static SubLSymbol $SUSPENDED;
    private static SubLSymbol $TAUTOLOGY;
    private static SubLList $list64;
    private static SubLList $list65;
    private static SubLSymbol $ERROR;
    private static SubLSymbol $sym67$STRINGP;
    private static SubLSymbol $JUSTIFICATION;
    private static SubLSymbol $sym69$HL_JUSTIFICATION_LIST_P;
    private static SubLList $list70;
    private static SubLList $list71;
    private static SubLList $list72;
    private static SubLSymbol $sym73$SECOND;
    private static SubLList $list74;
    private static SubLString $str75$No_match_to_combine__s_and__s;
    private static SubLSymbol $GOOD;
    private static SubLSymbol $NO_GOOD;
    private static SubLSymbol $NEUTRAL;
    private static SubLSymbol $UNEXAMINED;
    private static SubLSymbol $EXAMINED;
    private static SubLSymbol $POSSIBLE;
    private static SubLSymbol $PENDING;
    private static SubLSymbol $FINISHED;
    private static SubLSymbol $ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static SubLSymbol $NEGATION_BY_FAILURE_;
    private static SubLSymbol $COMPLETENESS_MINIMIZATION_ALLOWED_;
    private static SubLSymbol $EVALUATE_SUBL_ALLOWED_;
    private static SubLSymbol $REWRITE_ALLOWED_;
    private static SubLSymbol $ABDUCTION_ALLOWED_;
    private static SubLSymbol $NEW_TERMS_ALLOWED_;
    private static SubLSymbol $COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static SubLSymbol $CUSTOM;
    private static SubLList $list93;
    private static SubLList $list94;
    private static SubLSymbol $PROBLEM_STORE_NAME;
    private static SubLSymbol $CZER_EQUAL;
    private static SubLList $list97;
    private static SubLSymbol $EQUALITY_REASONING_METHOD;
    private static SubLList $list99;
    private static SubLSymbol $EQUALITY_REASONING_DOMAIN;
    private static SubLList $list101;
    private static SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static SubLInteger $int$100000;
    private static SubLSymbol $MAX_PROBLEM_COUNT;
    private static SubLSymbol $REMOVAL_ALLOWED_;
    private static SubLSymbol $TRANSFORMATION_ALLOWED_;
    private static SubLSymbol $BACKWARD;
    private static SubLList $list108;
    private static SubLSymbol $DIRECTION;
    private static SubLList $list110;
    private static SubLList $list111;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $STRUCTURAL;
    private static SubLSymbol $REMOVAL_CONJUNCTIVE;
    private static SubLSymbol $REWRITE;
    private static SubLSymbol $META_REMOVAL;
    private static SubLString $str118$HL_Module_of_unknown_type___s;
    private static SubLList $list119;
    private static SubLSymbol $sym120$COMPLETENESS_P;
    private static SubLSymbol $COMPLETE;
    private static SubLString $str122$Complete;
    private static SubLSymbol $INCOMPLETE;
    private static SubLString $str124$Incomplete;
    private static SubLSymbol $GROSSLY_INCOMPLETE;
    private static SubLString $str126$Grossly_Incomplete;
    private static SubLSymbol $IMPOSSIBLE;
    private static SubLString $str128$Impossible;
    private static SubLString $str129$Unexpected_completeness__a;
    private static SubLSymbol $sym130$COMPLETENESS__;
    private static SubLSymbol $sym131$COMPLETENESS__;
    private static SubLList $list132;
    private static SubLSymbol $sym133$PRODUCTIVITY_P;
    private static SubLList $list134;
    private static SubLList $list135;
    private static SubLList $list136;
    private static SubLSymbol $sym137$DESTRUCTIBILITY_STATUS_P;
    private static SubLSymbol $INDESTRUCTIBLE;
    private static SubLString $str139$Indestructible;
    private static SubLSymbol $DESTRUCTIBLE;
    private static SubLString $str141$Destructible;
    private static SubLSymbol $UNKNOWN;
    private static SubLString $str143$Unknown;
    private static SubLString $str144$Unexpected_destructibility_status;
    private static SubLString $str145$I;
    private static SubLString $str146$;
    private static SubLString $str147$_;
    private static SubLList $list148;
    private static SubLList $list149;
    private static SubLSymbol $sym150$STRATEGY_TYPE_PROPERTY_P;
    private static SubLSymbol $MUST_OVERRIDE;
    private static SubLString $str152$Strategy_must_implement_method__s;
    private static SubLList $list153;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $TEMPLATE;
    private static SubLSymbol $FORMAT;
    private static SubLSymbol $RETURN;
    private static SubLList $list158;
    private static SubLSymbol $EL;
    private static SubLSymbol $ANSWER_LANGUAGE;
    private static SubLList $list161;
    private static SubLSymbol $RESULT_UNIQUENESS;
    private static SubLList $list163;
    private static SubLSymbol $REQUIRE_EQUAL;
    private static SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY;
    private static SubLList $list166;
    private static SubLSymbol $TRANSITIVE_CLOSURE_MODE;
    private static SubLSymbol $MAINTAIN_TERM_WORKING_SET_;
    private static SubLSymbol $EVENTS;
    private static SubLList $list170;
    private static SubLSymbol $HALT_CONDITIONS;
    private static SubLList $list172;
    private static SubLList $list173;
    private static SubLSymbol $sym174$INFERENCE_ACCUMULATOR_TYPE_P;
    private static SubLSymbol $FORGET_EXTRA_RESULTS_;
    private static SubLSymbol $CACHE_INFERENCE_RESULTS_;
    private static SubLSymbol $BROWSABLE_;
    private static SubLSymbol $CONTINUABLE_;
    private static SubLSymbol $BLOCK_;
    private static SubLSymbol $UNSPECIFIED;
    private static SubLSymbol $CONDITIONAL_SENTENCE_;
    private static SubLSymbol $NON_EXPLANATORY_SENTENCE;
    private static SubLSymbol $sym183$INFERENCE_P;

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 1700L)
    public static SubLObject query_property_p(SubLObject v_object) {
        return makeBoolean(NIL != query_static_property_p(v_object) || NIL != query_dynamic_property_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2000L)
    public static SubLObject query_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym0$QUERY_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2100L)
    public static SubLObject all_query_properties() {
        return nconc(all_query_static_properties(), all_query_dynamic_properties());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2400L)
    public static SubLObject merge_query_properties(SubLObject query_properties, SubLObject overriding_query_properties) {
        if (NIL != overriding_query_properties) {
            query_properties = conses_high.copy_list(query_properties);
            SubLObject remainder;
            SubLObject property;
            SubLObject value;
            for (remainder = NIL, remainder = overriding_query_properties; NIL != remainder; remainder = conses_high.cddr(remainder)) {
                property = remainder.first();
                value = conses_high.cadr(remainder);
                query_properties = conses_high.putf(query_properties, property, value);
            }
        }
        return query_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2800L)
    public static SubLObject query_static_property_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_static_property_p(v_object) || NIL != problem_store_static_property_p(v_object) || NIL != strategy_static_property_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3000L)
    public static SubLObject query_static_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym4$QUERY_STATIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3100L)
    public static SubLObject extract_query_static_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym4$QUERY_STATIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3400L)
    public static SubLObject all_query_static_properties() {
        return nconc(all_inference_static_properties(), all_problem_store_static_properties(), all_strategy_static_properties());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3700L)
    public static SubLObject query_static_or_meta_property_p(SubLObject v_object) {
        return makeBoolean(NIL != query_static_property_p(v_object) || NIL != inference_meta_property_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3800L)
    public static SubLObject query_static_or_meta_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym5$QUERY_STATIC_OR_META_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3900L)
    public static SubLObject extract_query_static_or_meta_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym5$QUERY_STATIC_OR_META_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4100L)
    public static SubLObject query_dynamic_property_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_dynamic_property_p(v_object) || NIL != problem_store_dynamic_property_p(v_object) || NIL != strategy_dynamic_property_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4300L)
    public static SubLObject query_dynamic_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym6$QUERY_DYNAMIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4400L)
    public static SubLObject extract_query_dynamic_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym6$QUERY_DYNAMIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4500L)
    public static SubLObject all_query_dynamic_properties() {
        return nconc(all_inference_dynamic_properties(), all_problem_store_dynamic_properties(), all_strategy_dynamic_properties());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5500L)
    public static SubLObject query_metric_p(SubLObject v_object) {
        return makeBoolean(
                v_object.isKeyword() && (NIL != list_utilities.member_eqP(v_object, $specially_handled_inference_metrics$.getGlobalValue()) || NIL != list_utilities.member_eqP(v_object, $non_inference_query_metrics$.getGlobalValue()) || NIL != inference_metrics.inference_metric_nameP(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5800L)
    public static SubLObject inference_query_metric_p(SubLObject v_object) {
        return makeBoolean(NIL != query_metric_p(v_object) && NIL == subl_promotions.memberP(v_object, $non_inference_query_metrics$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5900L)
    public static SubLObject all_query_metrics() {
        return append(inference_metrics.inference_metric_names(), $specially_handled_inference_metrics$.getGlobalValue(), $non_inference_query_metrics$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6300L)
    public static SubLObject arete_query_metric_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $arete_query_metrics$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6400L)
    public static SubLObject all_arete_query_metrics() {
        return conses_high.copy_list($arete_query_metrics$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6900L)
    public static SubLObject removal_ask_query_metric_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $removal_ask_query_metrics$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 7000L)
    public static SubLObject inference_property_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_static_property_p(v_object) || NIL != inference_dynamic_property_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 7200L)
    public static SubLObject inference_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym11$INFERENCE_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11700L)
    public static SubLObject inference_static_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_static_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11800L)
    public static SubLObject inference_static_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym13$INFERENCE_STATIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11900L)
    public static SubLObject extract_inference_static_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym13$INFERENCE_STATIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12100L)
    public static SubLObject all_inference_static_properties() {
        return conses_high.copy_list($inference_static_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12200L)
    public static SubLObject inference_static_or_meta_property_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_static_property_p(v_object) || NIL != inference_meta_property_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12400L)
    public static SubLObject inference_static_or_meta_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12500L)
    public static SubLObject extract_inference_static_or_meta_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12700L)
    public static SubLObject inference_properties_problem_store(SubLObject v_properties) {
        SubLObject raw_value = conses_high.getf(v_properties, $PROBLEM_STORE, NIL);
        if (NIL != subl_promotions.non_negative_integer_p(raw_value)) {
            return inference_datastructures_problem_store.find_problem_store_by_id(raw_value);
        }
        return raw_value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13000L)
    public static SubLObject inference_properties_allow_hl_predicate_transformationP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ALLOW_HL_PREDICATE_TRANSFORMATION_, $inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13300L)
    public static SubLObject inference_properties_allow_unbound_predicate_transformationP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, $inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13600L)
    public static SubLObject inference_properties_allow_evaluatable_predicate_transformationP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, $inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14000L)
    public static SubLObject inference_properties_allow_indeterminate_resultsP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ALLOW_INDETERMINATE_RESULTS_, $inference_allows_indeterminate_results_by_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14300L)
    public static SubLObject inference_properties_allowed_rules(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ALLOWED_RULES, $default_allowed_rules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14400L)
    public static SubLObject inference_properties_forbidden_rules(SubLObject v_properties) {
        return conses_high.getf(v_properties, $FORBIDDEN_RULES, $default_forbidden_rules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14600L)
    public static SubLObject inference_properties_allowed_modules(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ALLOWED_MODULES, $default_allowed_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14900L)
    public static SubLObject inference_properties_allow_abnormality_checkingP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ALLOW_ABNORMALITY_CHECKING_, $inference_allows_abnormality_checking_by_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16100L)
    public static SubLObject inference_resource_constraint_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_resource_constraints$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16200L)
    public static SubLObject inference_resource_constraints_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym27$INFERENCE_RESOURCE_CONSTRAINT_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16300L)
    public static SubLObject extract_inference_resource_constraints(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym27$INFERENCE_RESOURCE_CONSTRAINT_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16500L)
    public static SubLObject inference_properties_max_number(SubLObject v_properties) {
        return conses_high.getf(v_properties, $MAX_NUMBER, $default_max_number$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16700L)
    public static SubLObject inference_properties_max_time(SubLObject v_properties) {
        return conses_high.getf(v_properties, $MAX_TIME, $default_max_time$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16900L)
    public static SubLObject inference_properties_max_step(SubLObject v_properties) {
        return conses_high.getf(v_properties, $MAX_STEP, $default_max_step$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17000L)
    public static SubLObject inference_properties_mode(SubLObject v_properties) {
        return conses_high.getf(v_properties, $INFERENCE_MODE, $default_inference_mode$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17100L)
    public static SubLObject inference_properties_forward_max_time(SubLObject v_properties) {
        return conses_high.getf(v_properties, $FORWARD_MAX_TIME, $default_forward_max_time$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17300L)
    public static SubLObject inference_properties_max_proof_depth(SubLObject v_properties) {
        return conses_high.getf(v_properties, $MAX_PROOF_DEPTH, $default_max_proof_depth$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17500L)
    public static SubLObject inference_properties_max_transformation_depth(SubLObject v_properties) {
        return conses_high.getf(v_properties, $MAX_TRANSFORMATION_DEPTH, $default_max_transformation_depth$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17800L)
    public static SubLObject inference_properties_min_rule_utility(SubLObject v_properties) {
        return conses_high.getf(v_properties, $MIN_RULE_UTILITY, $default_min_rule_utility$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 18000L)
    public static SubLObject inference_properties_probably_approximately_done(SubLObject v_properties) {
        return conses_high.getf(v_properties, $PROBABLY_APPROXIMATELY_DONE, $default_probably_approximately_done$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 21800L)
    public static SubLObject inference_dynamic_property_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_resource_constraint_p(v_object) || NIL != list_utilities.member_eqP(v_object, $inference_other_dynamic_properties$.getGlobalValue()));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22000L)
    public static SubLObject inference_dynamic_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym39$INFERENCE_DYNAMIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22100L)
    public static SubLObject extract_inference_dynamic_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym39$INFERENCE_DYNAMIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22300L)
    public static SubLObject all_inference_dynamic_properties() {
        return nconc(conses_high.copy_list($inference_other_dynamic_properties$.getGlobalValue()), conses_high.copy_list($inference_resource_constraints$.getGlobalValue()));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22600L)
    public static SubLObject inference_properties_metrics(SubLObject v_properties) {
        return conses_high.getf(v_properties, $METRICS, $default_inference_metrics_template$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22700L)
    public static SubLObject strategy_property_p(SubLObject v_object) {
        return makeBoolean(NIL != strategy_static_property_p(v_object) || NIL != strategy_dynamic_property_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22900L)
    public static SubLObject strategy_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym41$STRATEGY_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23600L)
    public static SubLObject strategy_static_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $strategy_static_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23700L)
    public static SubLObject strategy_static_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym43$STRATEGY_STATIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23800L)
    public static SubLObject extract_strategy_static_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym43$STRATEGY_STATIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24000L)
    public static SubLObject all_strategy_static_properties() {
        return conses_high.copy_list($strategy_static_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24400L)
    public static SubLObject strategy_static_properties_removal_backtracking_productivity_limit(SubLObject v_properties) {
        return conses_high.getf(v_properties, $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, $default_removal_backtracking_productivity_limit$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24700L)
    public static SubLObject strategy_static_properties_proof_spec(SubLObject v_properties) {
        return conses_high.getf(v_properties, $PROOF_SPEC, $default_proof_spec$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25200L)
    public static SubLObject strategy_dynamic_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $strategy_dynamic_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25300L)
    public static SubLObject strategy_dynamic_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym48$STRATEGY_DYNAMIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25400L)
    public static SubLObject extract_strategy_dynamic_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym48$STRATEGY_DYNAMIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25600L)
    public static SubLObject all_strategy_dynamic_properties() {
        return conses_high.copy_list($strategy_dynamic_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26200L)
    public static SubLObject strategy_dynamic_properties_productivity_limit(SubLObject v_properties) {
        return conses_high.getf(v_properties, $PRODUCTIVITY_LIMIT, $default_productivity_limit$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26300L)
    public static SubLObject problem_store_property_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_store_static_property_p(v_object) || NIL != problem_store_dynamic_property_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26600L)
    public static SubLObject problem_store_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym51$PROBLEM_STORE_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26700L)
    public static SubLObject all_problem_store_properties() {
        return nconc(all_problem_store_static_properties(), all_problem_store_dynamic_properties());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26900L)
    public static SubLObject extract_problem_store_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym51$PROBLEM_STORE_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31700L)
    public static SubLObject problem_store_static_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_store_static_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31800L)
    public static SubLObject problem_store_static_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym53$PROBLEM_STORE_STATIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31900L)
    public static SubLObject extract_problem_store_static_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym53$PROBLEM_STORE_STATIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32100L)
    public static SubLObject all_problem_store_static_properties() {
        return conses_high.copy_list($problem_store_static_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32400L)
    public static SubLObject problem_store_dynamic_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_store_dynamic_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32500L)
    public static SubLObject problem_store_dynamic_properties_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, $sym54$PROBLEM_STORE_DYNAMIC_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32600L)
    public static SubLObject all_problem_store_dynamic_properties() {
        return conses_high.copy_list($problem_store_dynamic_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33400L)
    public static SubLObject inference_meta_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_meta_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33500L)
    public static SubLObject all_inference_meta_properties() {
        return conses_high.copy_list($inference_meta_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33600L)
    public static SubLObject extract_inference_meta_properties(SubLObject v_properties) {
        return list_utilities.filter_plist(v_properties, $sym56$INFERENCE_META_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33700L)
    public static SubLObject query_halt_reason_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_suspend_status_p(v_object) || NIL != avoided_inference_reason_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 34100L)
    public static SubLObject exhausted_query_halt_reason_p(SubLObject v_object) {
        return makeBoolean(NIL != exhausted_inference_suspend_status_p(v_object) || NIL != avoided_inference_reason_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35000L)
    public static SubLObject inference_status_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_statuses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35200L)
    public static SubLObject continuable_inference_status_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $continuable_inference_statuses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35600L)
    public static SubLObject avoided_inference_reason_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $avoided_inference_reasons$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 36800L)
    public static SubLObject inference_suspend_status_p(SubLObject v_object) {
        return makeBoolean(NIL != list_utilities.member_eqP(v_object, $inference_suspend_statuses$.getGlobalValue()) || NIL != list_utilities.member_eqP(v_object, $inference_halt_conditions$.getGlobalValue()) || NIL != inference_error_suspend_status_p(v_object)
                || NIL != inference_justification_status_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37000L)
    public static SubLObject inference_suspend_status_applicableP(SubLObject status) {
        assert NIL != inference_status_p(status) : status;
        return makeBoolean(status == $SUSPENDED || status == $TAUTOLOGY);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37500L)
    public static SubLObject continuable_inference_suspend_status_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $continuable_inference_suspend_statuses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38000L)
    public static SubLObject exhausted_inference_suspend_status_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $exhausted_inference_suspend_statuses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38100L)
    public static SubLObject inference_error_suspend_status_p(SubLObject v_object) {
        return makeBoolean(NIL != list_utilities.doubletonP(v_object) && $ERROR == v_object.first() && conses_high.second(v_object).isString());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38400L)
    public static SubLObject new_inference_error_suspend_status(SubLObject message) {
        assert NIL != Types.stringp(message) : message;
        return list($ERROR, message);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38500L)
    public static SubLObject inference_error_suspend_status_message(SubLObject error_status) {
        return conses_high.second(error_status);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38700L)
    public static SubLObject inference_justification_status_p(SubLObject v_object) {
        return makeBoolean(v_object.isList() && $JUSTIFICATION == v_object.first() && NIL != arguments.hl_justification_list_p(v_object.rest()));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39000L)
    public static SubLObject new_inference_justification_status(SubLObject message) {
        assert NIL != arguments.hl_justification_list_p(message) : message;
        return cons($JUSTIFICATION, message);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39200L)
    public static SubLObject inference_justification_status_message(SubLObject justification_status) {
        return justification_status.rest();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39700L)
    public static SubLObject tactical_status_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $tactical_statuses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 40000L)
    public static SubLObject provability_status_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $provability_statuses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42300L)
    public static SubLObject tactical_status_weakerP(SubLObject status1, SubLObject status2) {
        return list_utilities.position_L(status1, status2, $ordered_tactical_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42500L)
    public static SubLObject tactical_status_strongerP(SubLObject status1, SubLObject status2) {
        return tactical_status_weakerP(status2, status1);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42900L)
    public static SubLObject tactical_status_unionP(SubLObject status1, SubLObject status2) {
        return list_utilities.position_L(status1, status2, $union_ordered_tactical_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43100L)
    public static SubLObject problem_status_p(SubLObject v_object) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43300L)
    public static SubLObject problem_status_from_tactical_status_and_provability_status(SubLObject tactical_status, SubLObject provability_status) {
        SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (tactical_status.eql(conses_high.second(triple)) && provability_status.eql(conses_high.third(triple))) {
                return triple.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        }
        Errors.error($str75$No_match_to_combine__s_and__s, tactical_status, provability_status);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43700L)
    public static SubLObject tactical_status_from_problem_status(SubLObject status) {
        SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (status.eql(triple.first())) {
                return conses_high.second(triple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44000L)
    public static SubLObject provability_status_from_problem_status(SubLObject status) {
        SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (status.eql(triple.first())) {
                return conses_high.third(triple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44300L)
    public static SubLObject good_problem_status_p(SubLObject status) {
        return Equality.eq($GOOD, provability_status_from_problem_status(status));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44400L)
    public static SubLObject no_good_problem_status_p(SubLObject status) {
        return Equality.eq($NO_GOOD, provability_status_from_problem_status(status));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44500L)
    public static SubLObject neutral_problem_status_p(SubLObject status) {
        return Equality.eq($NEUTRAL, provability_status_from_problem_status(status));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44700L)
    public static SubLObject unexamined_problem_status_p(SubLObject status) {
        return Equality.eq($UNEXAMINED, tactical_status_from_problem_status(status));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44800L)
    public static SubLObject examined_problem_status_p(SubLObject status) {
        return Equality.eq($EXAMINED, tactical_status_from_problem_status(status));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44900L)
    public static SubLObject possible_problem_status_p(SubLObject status) {
        return Equality.eq($POSSIBLE, tactical_status_from_problem_status(status));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45000L)
    public static SubLObject pending_problem_status_p(SubLObject status) {
        return Equality.eq($PENDING, tactical_status_from_problem_status(status));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45200L)
    public static SubLObject finished_problem_status_p(SubLObject status) {
        return Equality.eq($FINISHED, tactical_status_from_problem_status(status));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45500L)
    public static SubLObject problem_store_properties_add_restriction_layer_of_indirectionP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45800L)
    public static SubLObject problem_store_properties_negation_by_failureP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $NEGATION_BY_FAILURE_, $negation_by_failure_by_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46000L)
    public static SubLObject problem_store_properties_completeness_minimization_allowedP(SubLObject v_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(v_properties, $COMPLETENESS_MINIMIZATION_ALLOWED_, control_vars.$complete_extent_minimization$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46600L)
    public static SubLObject problem_store_properties_evaluate_subl_allowedP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $EVALUATE_SUBL_ALLOWED_, $evaluate_subl_allowed_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46900L)
    public static SubLObject problem_store_properties_rewrite_allowedP(SubLObject v_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(v_properties, $REWRITE_ALLOWED_, $rewrite_allowed_defaultP$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47200L)
    public static SubLObject problem_store_properties_abduction_allowedP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ABDUCTION_ALLOWED_, $abduction_allowed_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47500L)
    public static SubLObject problem_store_properties_new_terms_allowedP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $NEW_TERMS_ALLOWED_, $new_terms_allowed_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47800L)
    public static SubLObject problem_store_properties_compute_answer_justificationsP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $COMPUTE_ANSWER_JUSTIFICATIONS_, $compute_answer_justifications_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48400L)
    public static SubLObject all_inference_modes() {
        return conses_high.copy_list($inference_modes$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48500L)
    public static SubLObject inference_mode_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_modes$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48900L)
    public static SubLObject problem_link_type_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_link_types$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49200L)
    public static SubLObject problem_store_name_p(SubLObject v_object) {
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49200L)
    public static SubLObject problem_store_properties_name(SubLObject v_properties) {
        return conses_high.getf(v_properties, $PROBLEM_STORE_NAME, $default_problem_store_name$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49900L)
    public static SubLObject problem_store_equality_reasoning_method_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_store_equality_reasoning_methods$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50000L)
    public static SubLObject problem_store_properties_equality_reasoning_method(SubLObject v_properties) {
        return conses_high.getf(v_properties, $EQUALITY_REASONING_METHOD, $default_equality_reasoning_method$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50700L)
    public static SubLObject problem_store_equality_reasoning_domain_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $problem_store_equality_reasoning_domains$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50800L)
    public static SubLObject problem_store_properties_equality_reasoning_domain(SubLObject v_properties) {
        return conses_high.getf(v_properties, $EQUALITY_REASONING_DOMAIN, $default_equality_reasoning_domain$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51700L)
    public static SubLObject intermediate_step_validation_level_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $intermediate_step_validation_levels$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51800L)
    public static SubLObject problem_store_properties_intermediate_step_validation_level(SubLObject v_properties) {
        return conses_high.getf(v_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $default_intermediate_step_validation_level$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52100L)
    public static SubLObject max_problem_count_p(SubLObject v_object) {
        return makeBoolean(NIL != number_utilities.positive_infinity_p(v_object) || NIL != subl_promotions.non_negative_integer_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52200L)
    public static SubLObject problem_store_properties_max_problem_count(SubLObject v_properties) {
        return conses_high.getf(v_properties, $MAX_PROBLEM_COUNT, $default_max_problem_count$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52400L)
    public static SubLObject removal_allowed_by_propertiesP(SubLObject problem_store_properties) {
        return conses_high.getf(problem_store_properties, $REMOVAL_ALLOWED_, $removal_allowed_by_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52700L)
    public static SubLObject transformation_allowed_by_propertiesP(SubLObject problem_store_properties) {
        return conses_high.getf(problem_store_properties, $TRANSFORMATION_ALLOWED_, $transformation_allowed_by_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53200L)
    public static SubLObject inference_direction_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_directions$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53300L)
    public static SubLObject problem_store_properties_direction(SubLObject v_properties) {
        return conses_high.getf(v_properties, $DIRECTION, $default_problem_store_inference_direction$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53700L)
    public static SubLObject tactic_status_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $tactic_statuses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54100L)
    public static SubLObject tactic_type_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $tactic_types$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54200L)
    public static SubLObject tactic_type_from_hl_module(SubLObject hl_module) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55200L)
    public static SubLObject completeness_string(SubLObject completeness) {
        assert NIL != completeness_p(completeness) : completeness;
        if (completeness.eql($COMPLETE)) {
            return $str122$Complete;
        }
        if (completeness.eql($INCOMPLETE)) {
            return $str124$Incomplete;
        }
        if (completeness.eql($GROSSLY_INCOMPLETE)) {
            return $str126$Grossly_Incomplete;
        }
        if (completeness.eql($IMPOSSIBLE)) {
            return $str128$Impossible;
        }
        Errors.error($str129$Unexpected_completeness__a, completeness);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55600L)
    public static SubLObject completeness_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $ordered_completenesses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55700L)
    public static SubLObject impossible_completeness_p(SubLObject v_object) {
        return Equality.eq($IMPOSSIBLE, v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55700L)
    public static SubLObject completeness_L(SubLObject completeness1, SubLObject completeness2) {
        assert NIL != completeness_p(completeness1) : completeness1;
        assert NIL != completeness_p(completeness2) : completeness2;
        return list_utilities.position_L(completeness1, completeness2, $ordered_completenesses$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56000L)
    public static SubLObject completeness_G(SubLObject completeness1, SubLObject completeness2) {
        return completeness_L(completeness2, completeness1);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56200L)
    public static SubLObject min_completeness(SubLObject completeness_list) {
        return (NIL != completeness_list) ? list_utilities.extremal(completeness_list, $sym130$COMPLETENESS__, UNPROVIDED) : conses_high.last($ordered_completenesses$.getGlobalValue(), UNPROVIDED).first();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56400L)
    public static SubLObject min2_completeness(SubLObject completeness1, SubLObject completeness2) {
        return (NIL != completeness_L(completeness2, completeness1)) ? completeness2 : completeness1;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56600L)
    public static SubLObject max_completeness(SubLObject completeness_list) {
        return (NIL != completeness_list) ? list_utilities.extremal(completeness_list, $sym131$COMPLETENESS__, UNPROVIDED) : $ordered_completenesses$.getGlobalValue().first();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56800L)
    public static SubLObject max2_completeness(SubLObject completeness1, SubLObject completeness2) {
        return (NIL != completeness_L(completeness2, completeness1)) ? completeness1 : completeness2;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56900L)
    public static SubLObject productivity_p(SubLObject v_object) {
        return makeBoolean(NIL != number_utilities.positive_infinity_p(v_object) || NIL != subl_promotions.non_negative_integer_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57100L)
    public static SubLObject infinite_productivity_p(SubLObject v_object) {
        return number_utilities.positive_infinity_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57300L)
    public static SubLObject productivity_for_number_of_children(SubLObject number_of_children) {
        if (number_of_children.isInteger()) {
            return Numbers.multiply($int$100, number_of_children);
        }
        SubLObject productivity = list_utilities.alist_lookup_without_values($productivity_to_number_table$.getGlobalValue(), number_of_children, UNPROVIDED, UNPROVIDED);
        if (NIL == productivity) {
            productivity = Numbers.truncate(Numbers.multiply($int$100, number_of_children), UNPROVIDED);
        }
        return productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57800L)
    public static SubLObject number_of_children_for_productivity(SubLObject productivity) {
        return Numbers.integerDivide(productivity, $int$100);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58000L)
    public static SubLObject cost_for_productivity(SubLObject productivity) {
        return Numbers.divide(productivity, $int$100);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58200L)
    public static SubLObject removal_cost_cutoff_for_productivity(SubLObject productivity) {
        assert NIL != productivity_p(productivity) : productivity;
        if (NIL != number_utilities.positive_infinity_p(productivity)) {
            return NIL;
        }
        return cost_for_productivity(productivity);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58400L)
    public static SubLObject productivity_E(SubLObject productivity1, SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_E(productivity1, productivity2);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58600L)
    public static SubLObject productivity_L(SubLObject productivity1, SubLObject productivity2) {
        assert NIL != productivity_p(productivity1) : productivity1;
        assert NIL != productivity_p(productivity2) : productivity2;
        return number_utilities.potentially_infinite_integer_L(productivity1, productivity2);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58800L)
    public static SubLObject productivity_LE(SubLObject productivity1, SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_LE(productivity1, productivity2);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58900L)
    public static SubLObject productivity_G(SubLObject productivity1, SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_G(productivity1, productivity2);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59000L)
    public static SubLObject productivity_GE(SubLObject productivity1, SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_GE(productivity1, productivity2);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59200L)
    public static SubLObject productivity_X(SubLObject productivity1, SubLObject productivity2) {
        return number_utilities.potentially_infinite_integer_plus(productivity1, productivity2);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59300L)
    public static SubLObject productivity_max(SubLObject productivity1, SubLObject productivity2) {
        return (NIL != productivity_L(productivity1, productivity2)) ? productivity2 : productivity1;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59500L)
    public static SubLObject productivity_sum(SubLObject productivities) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59700L)
    public static SubLObject productivity_times_number(SubLObject productivity, SubLObject number) {
        return number_utilities.potentially_infinite_integer_times_number_rounded(productivity, number);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59900L)
    public static SubLObject productivity_divide_number(SubLObject productivity, SubLObject number) {
        return number_utilities.potentially_infinite_integer_divided_by_number_rounded(productivity, number);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60000L)
    public static SubLObject decrement_productivity_for_number_of_children(SubLObject productivity, SubLObject number) {
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        return productivity_for_number_of_children(Numbers.subtract(number_of_children_for_productivity(productivity), number));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60400L)
    public static SubLObject proof_status_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $proof_statuses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60900L)
    public static SubLObject proof_reject_reason_p(SubLObject v_object) {
        return makeBoolean(NIL != arguments.hl_justification_p(v_object) || NIL != list_utilities.member_eqP(v_object, $proof_reject_reasons$.getGlobalValue()));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61300L)
    public static SubLObject destructibility_status_string(SubLObject destructibility_status) {
        assert NIL != destructibility_status_p(destructibility_status) : destructibility_status;
        if (destructibility_status.eql($INDESTRUCTIBLE)) {
            return $str139$Indestructible;
        }
        if (destructibility_status.eql($DESTRUCTIBLE)) {
            return $str141$Destructible;
        }
        if (destructibility_status.eql($UNKNOWN)) {
            return $str143$Unknown;
        }
        Errors.error($str144$Unexpected_destructibility_status, destructibility_status);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61600L)
    public static SubLObject destructibility_status_hint(SubLObject destructibility_status) {
        assert NIL != destructibility_status_p(destructibility_status) : destructibility_status;
        if (destructibility_status.eql($INDESTRUCTIBLE)) {
            return $str145$I;
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 62000L)
    public static SubLObject destructibility_status_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $destructibility_statuses$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 62100L)
    public static SubLObject destructibility_status_destructibleP(SubLObject destructibility_status) {
        assert NIL != destructibility_status_p(destructibility_status) : destructibility_status;
        return Equality.eq($DESTRUCTIBLE, destructibility_status);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 67900L)
    public static SubLObject strategy_type_property_p(SubLObject v_object) {
        return list_utilities.alist_has_keyP($strategy_type_properties$.getGlobalValue(), v_object, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68200L)
    public static SubLObject strategy_default_method_handler(SubLObject method) {
        assert NIL != strategy_type_property_p(method) : method;
        SubLObject handler = list_utilities.alist_lookup_without_values($strategy_type_properties$.getGlobalValue(), method, UNPROVIDED, UNPROVIDED);
        if ($MUST_OVERRIDE == handler) {
            return Errors.error($str152$Strategy_must_implement_method__s, method);
        }
        return handler;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69000L)
    public static SubLObject inference_simple_return_type_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_return_types$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69100L)
    public static SubLObject inference_properties_has_simple_return_typeP(SubLObject query_properties) {
        return inference_simple_return_type_p(inference_properties_return_type(query_properties));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69300L)
    public static SubLObject inference_template_return_type_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && $TEMPLATE == v_object.first());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69400L)
    public static SubLObject inference_format_return_type_p(SubLObject v_object) {
        return makeBoolean(NIL != list_utilities.proper_list_p(v_object) && $FORMAT == v_object.first() && NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED) && conses_high.second(v_object).isString());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69600L)
    public static SubLObject inference_return_type_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_simple_return_type_p(v_object) || NIL != inference_template_return_type_p(v_object) || NIL != inference_format_return_type_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69800L)
    public static SubLObject inference_properties_return_type(SubLObject v_properties) {
        return conses_high.getf(v_properties, $RETURN, $inference_default_return_type$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70200L)
    public static SubLObject inference_answer_language_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_answer_languages$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70300L)
    public static SubLObject inference_properties_answer_language(SubLObject v_properties) {
        return conses_high.getf(v_properties, $ANSWER_LANGUAGE, $inference_default_answer_language$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70900L)
    public static SubLObject result_uniqueness_criterion_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $result_uniqueness_criteria$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71000L)
    public static SubLObject inference_properties_uniqueness_criterion(SubLObject v_properties) {
        return conses_high.getf(v_properties, $RESULT_UNIQUENESS, $default_result_uniqueness_criterion$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71800L)
    public static SubLObject inference_disjunction_free_el_vars_policy_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_disjunction_free_el_vars_policies$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71900L)
    public static SubLObject inference_properties_disjunction_free_el_vars_policy(SubLObject v_properties) {
        return conses_high.getf(v_properties, $DISJUNCTION_FREE_EL_VARS_POLICY, $default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72600L)
    public static SubLObject inference_transitive_closure_mode_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_transitive_closure_modes$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72700L)
    public static SubLObject inference_properties_transitive_closure_mode(SubLObject v_properties) {
        return conses_high.getf(v_properties, $TRANSITIVE_CLOSURE_MODE, $inference_transitive_closure_mode_default$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73100L)
    public static SubLObject inference_properties_maintain_term_working_setP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $MAINTAIN_TERM_WORKING_SET_, $maintain_term_working_set_defaultP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73300L)
    public static SubLObject inference_properties_events(SubLObject v_properties) {
        return conses_high.getf(v_properties, $EVENTS, $inference_events_default$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74100L)
    public static SubLObject inference_event_type_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_event_types$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74300L)
    public static SubLObject inference_properties_halt_conditions(SubLObject v_properties) {
        return conses_high.getf(v_properties, $HALT_CONDITIONS, $inference_halt_conditions_default$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74800L)
    public static SubLObject inference_halt_condition_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_halt_conditions$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75300L)
    public static SubLObject inference_accumulator_type_p(SubLObject v_object) {
        return list_utilities.alist_has_keyP($inference_accumulator_types$.getGlobalValue(), v_object, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75400L)
    public static SubLObject initialize_inference_accumulator(SubLObject accumulator_type) {
        assert NIL != inference_accumulator_type_p(accumulator_type) : accumulator_type;
        SubLObject initialization_fn = list_utilities.alist_lookup_without_values($inference_accumulator_types$.getGlobalValue(), accumulator_type, UNPROVIDED, UNPROVIDED);
        return Functions.funcall(initialization_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76100L)
    public static SubLObject inference_properties_forget_extra_resultsP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $FORGET_EXTRA_RESULTS_, $inference_default_forget_extra_resultsP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76400L)
    public static SubLObject inference_properties_cache_inference_resultsP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $CACHE_INFERENCE_RESULTS_, $inference_default_cache_inference_resultsP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76700L)
    public static SubLObject inference_properties_browsableP(SubLObject v_properties) {
        return makeBoolean(NIL != conses_high.getf(v_properties, $BROWSABLE_, $inference_default_browsableP$.getGlobalValue()) || NIL != inference_properties_continuableP(v_properties));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77100L)
    public static SubLObject inference_properties_continuableP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $CONTINUABLE_, $inference_default_continuableP$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77300L)
    public static SubLObject inference_properties_blockP(SubLObject v_properties) {
        return conses_high.getf(v_properties, $BLOCK_, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77400L)
    public static SubLObject inference_query_property_lookup(SubLObject query_properties, SubLObject property) {
        SubLObject value = conses_high.getf(query_properties, property, $UNSPECIFIED);
        if ($UNSPECIFIED == value) {
            return inference_engine_default_for_property(property);
        }
        return value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77800L)
    public static SubLObject inference_engine_default_for_property(SubLObject query_property) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != query_property_p(query_property) : query_property;
        SubLObject value = NIL;
        SubLObject specified = NIL;
        if (query_property.eql($DISJUNCTION_FREE_EL_VARS_POLICY)) {
            value = $default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($RESULT_UNIQUENESS)) {
            value = $default_result_uniqueness_criterion$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($PROBLEM_STORE)) {
            value = NIL;
            specified = NIL;
        } else if (query_property.eql($CONDITIONAL_SENTENCE_)) {
            value = NIL;
            specified = T;
        } else if (query_property.eql($NON_EXPLANATORY_SENTENCE)) {
            value = NIL;
            specified = T;
        } else if (query_property.eql($ALLOW_HL_PREDICATE_TRANSFORMATION_)) {
            value = $inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_)) {
            value = $inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_)) {
            value = $inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($ALLOW_INDETERMINATE_RESULTS_)) {
            value = $inference_allows_indeterminate_results_by_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($ALLOWED_RULES)) {
            value = $default_allowed_rules$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($ALLOWED_MODULES)) {
            value = $default_allowed_modules$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($FORBIDDEN_RULES)) {
            value = $default_forbidden_rules$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($ALLOW_ABNORMALITY_CHECKING_)) {
            value = $inference_allows_abnormality_checking_by_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($TRANSITIVE_CLOSURE_MODE)) {
            value = $inference_transitive_closure_mode_default$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($MAX_NUMBER)) {
            value = $default_max_number$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($MAX_TIME)) {
            value = $default_max_time$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($MAX_STEP)) {
            value = $default_max_step$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($FORWARD_MAX_TIME)) {
            value = $default_forward_max_time$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($MAX_PROOF_DEPTH)) {
            value = $default_max_proof_depth$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($MAX_TRANSFORMATION_DEPTH)) {
            value = $default_max_transformation_depth$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($MIN_RULE_UTILITY)) {
            value = $default_min_rule_utility$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($PROBABLY_APPROXIMATELY_DONE)) {
            value = $default_probably_approximately_done$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($RETURN)) {
            value = $inference_default_return_type$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($METRICS)) {
            value = $default_inference_metrics_template$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($ANSWER_LANGUAGE)) {
            value = $inference_default_answer_language$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($CACHE_INFERENCE_RESULTS_)) {
            value = $inference_default_cache_inference_resultsP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($FORGET_EXTRA_RESULTS_)) {
            value = $inference_default_forget_extra_resultsP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($BROWSABLE_)) {
            value = $inference_default_browsableP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($CONTINUABLE_)) {
            value = $inference_default_continuableP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($BLOCK_)) {
            value = NIL;
            specified = T;
        } else if (query_property.eql($EQUALITY_REASONING_METHOD)) {
            value = $default_equality_reasoning_method$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($EQUALITY_REASONING_DOMAIN)) {
            value = $default_equality_reasoning_domain$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
            value = $default_intermediate_step_validation_level$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($MAX_PROBLEM_COUNT)) {
            value = $default_max_problem_count$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($REMOVAL_ALLOWED_)) {
            value = $removal_allowed_by_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($TRANSFORMATION_ALLOWED_)) {
            value = $transformation_allowed_by_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
            value = $add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($NEGATION_BY_FAILURE_)) {
            value = $negation_by_failure_by_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($COMPLETENESS_MINIMIZATION_ALLOWED_)) {
            value = control_vars.$complete_extent_minimization$.getDynamicValue(thread);
            specified = T;
        } else if (query_property.eql($DIRECTION)) {
            value = $default_problem_store_inference_direction$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($EVALUATE_SUBL_ALLOWED_)) {
            value = $evaluate_subl_allowed_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($REWRITE_ALLOWED_)) {
            value = $rewrite_allowed_defaultP$.getDynamicValue(thread);
            specified = T;
        } else if (query_property.eql($ABDUCTION_ALLOWED_)) {
            value = $abduction_allowed_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($NEW_TERMS_ALLOWED_)) {
            value = $new_terms_allowed_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($INFERENCE_MODE)) {
            value = $default_inference_mode$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($MAINTAIN_TERM_WORKING_SET_)) {
            value = $maintain_term_working_set_defaultP$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($EVENTS)) {
            value = $inference_events_default$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($HALT_CONDITIONS)) {
            value = $inference_halt_conditions_default$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($PROBLEM_STORE_NAME)) {
            value = $default_problem_store_name$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($PRODUCTIVITY_LIMIT)) {
            value = $default_productivity_limit$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
            value = $default_removal_backtracking_productivity_limit$.getGlobalValue();
            specified = T;
        } else if (query_property.eql($PROOF_SPEC)) {
            value = $default_proof_spec$.getGlobalValue();
            specified = T;
        } else {
            value = $UNKNOWN;
            specified = NIL;
        }
        return subl_promotions.values2(value, specified);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 83500L)
    public static SubLObject query_property_is_defaultP(SubLObject property, SubLObject value) {
        return Equality.equal(value, inference_engine_default_for_property(property));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 83700L)
    public static SubLObject inference_input_non_default_query_properties(SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        SubLObject query_properties = inference_datastructures_inference.inference_input_query_properties(inference);
        SubLObject non_default_query_properties = NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject v_default;
        for (remainder = NIL, remainder = query_properties; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            v_default = inference_engine_default_for_property(property);
            if (!v_default.equal(value)) {
                non_default_query_properties = conses_high.putf(non_default_query_properties, property, value);
            }
        }
        return non_default_query_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 84400L)
    public static SubLObject all_default_query_properties() {
        SubLObject v_properties = NIL;
        SubLObject cdolist_list_var = all_query_properties();
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject value = inference_engine_default_for_property(property);
            v_properties = cons(property, v_properties);
            v_properties = cons(value, v_properties);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 84700L)
    public static SubLObject explicify_default_query_properties(SubLObject query_properties) {
        return list_utilities.nmerge_plist(all_default_query_properties(), query_properties);
    }

    public static SubLObject declare_inference_datastructures_enumerated_types_file() {
        declareFunction(myName, "query_property_p", "QUERY-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "query_properties_p", "QUERY-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "all_query_properties", "ALL-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(myName, "merge_query_properties", "MERGE-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(myName, "query_static_property_p", "QUERY-STATIC-PROPERTY-P", 1, 0, false);
        new $query_static_property_p$UnaryFunction();
        declareFunction(myName, "query_static_properties_p", "QUERY-STATIC-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "extract_query_static_properties", "EXTRACT-QUERY-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(myName, "all_query_static_properties", "ALL-QUERY-STATIC-PROPERTIES", 0, 0, false);
        declareFunction(myName, "query_static_or_meta_property_p", "QUERY-STATIC-OR-META-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "query_static_or_meta_properties_p", "QUERY-STATIC-OR-META-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "extract_query_static_or_meta_properties", "EXTRACT-QUERY-STATIC-OR-META-PROPERTIES", 1, 0, false);
        declareFunction(myName, "query_dynamic_property_p", "QUERY-DYNAMIC-PROPERTY-P", 1, 0, false);
        new $query_dynamic_property_p$UnaryFunction();
        declareFunction(myName, "query_dynamic_properties_p", "QUERY-DYNAMIC-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "extract_query_dynamic_properties", "EXTRACT-QUERY-DYNAMIC-PROPERTIES", 1, 0, false);
        declareFunction(myName, "all_query_dynamic_properties", "ALL-QUERY-DYNAMIC-PROPERTIES", 0, 0, false);
        declareFunction(myName, "query_metric_p", "QUERY-METRIC-P", 1, 0, false);
        declareFunction(myName, "inference_query_metric_p", "INFERENCE-QUERY-METRIC-P", 1, 0, false);
        new $inference_query_metric_p$UnaryFunction();
        declareFunction(myName, "all_query_metrics", "ALL-QUERY-METRICS", 0, 0, false);
        declareFunction(myName, "arete_query_metric_p", "ARETE-QUERY-METRIC-P", 1, 0, false);
        declareFunction(myName, "all_arete_query_metrics", "ALL-ARETE-QUERY-METRICS", 0, 0, false);
        declareFunction(myName, "removal_ask_query_metric_p", "REMOVAL-ASK-QUERY-METRIC-P", 1, 0, false);
        declareFunction(myName, "inference_property_p", "INFERENCE-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "inference_properties_p", "INFERENCE-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "inference_static_property_p", "INFERENCE-STATIC-PROPERTY-P", 1, 0, false);
        new $inference_static_property_p$UnaryFunction();
        declareFunction(myName, "inference_static_properties_p", "INFERENCE-STATIC-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "extract_inference_static_properties", "EXTRACT-INFERENCE-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(myName, "all_inference_static_properties", "ALL-INFERENCE-STATIC-PROPERTIES", 0, 0, false);
        declareFunction(myName, "inference_static_or_meta_property_p", "INFERENCE-STATIC-OR-META-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "inference_static_or_meta_properties_p", "INFERENCE-STATIC-OR-META-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "extract_inference_static_or_meta_properties", "EXTRACT-INFERENCE-STATIC-OR-META-PROPERTIES", 1, 0, false);
        declareFunction(myName, "inference_properties_problem_store", "INFERENCE-PROPERTIES-PROBLEM-STORE", 1, 0, false);
        declareFunction(myName, "inference_properties_allow_hl_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "inference_properties_allow_unbound_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "inference_properties_allow_evaluatable_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "inference_properties_allow_indeterminate_resultsP", "INFERENCE-PROPERTIES-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false);
        declareFunction(myName, "inference_properties_allowed_rules", "INFERENCE-PROPERTIES-ALLOWED-RULES", 1, 0, false);
        declareFunction(myName, "inference_properties_forbidden_rules", "INFERENCE-PROPERTIES-FORBIDDEN-RULES", 1, 0, false);
        declareFunction(myName, "inference_properties_allowed_modules", "INFERENCE-PROPERTIES-ALLOWED-MODULES", 1, 0, false);
        declareFunction(myName, "inference_properties_allow_abnormality_checkingP", "INFERENCE-PROPERTIES-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false);
        declareFunction(myName, "inference_resource_constraint_p", "INFERENCE-RESOURCE-CONSTRAINT-P", 1, 0, false);
        declareFunction(myName, "inference_resource_constraints_p", "INFERENCE-RESOURCE-CONSTRAINTS-P", 1, 0, false);
        declareFunction(myName, "extract_inference_resource_constraints", "EXTRACT-INFERENCE-RESOURCE-CONSTRAINTS", 1, 0, false);
        declareFunction(myName, "inference_properties_max_number", "INFERENCE-PROPERTIES-MAX-NUMBER", 1, 0, false);
        declareFunction(myName, "inference_properties_max_time", "INFERENCE-PROPERTIES-MAX-TIME", 1, 0, false);
        declareFunction(myName, "inference_properties_max_step", "INFERENCE-PROPERTIES-MAX-STEP", 1, 0, false);
        declareFunction(myName, "inference_properties_mode", "INFERENCE-PROPERTIES-MODE", 1, 0, false);
        declareFunction(myName, "inference_properties_forward_max_time", "INFERENCE-PROPERTIES-FORWARD-MAX-TIME", 1, 0, false);
        declareFunction(myName, "inference_properties_max_proof_depth", "INFERENCE-PROPERTIES-MAX-PROOF-DEPTH", 1, 0, false);
        declareFunction(myName, "inference_properties_max_transformation_depth", "INFERENCE-PROPERTIES-MAX-TRANSFORMATION-DEPTH", 1, 0, false);
        declareFunction(myName, "inference_properties_min_rule_utility", "INFERENCE-PROPERTIES-MIN-RULE-UTILITY", 1, 0, false);
        declareFunction(myName, "inference_properties_probably_approximately_done", "INFERENCE-PROPERTIES-PROBABLY-APPROXIMATELY-DONE", 1, 0, false);
        declareFunction(myName, "inference_dynamic_property_p", "INFERENCE-DYNAMIC-PROPERTY-P", 1, 0, false);
        new $inference_dynamic_property_p$UnaryFunction();
        declareFunction(myName, "inference_dynamic_properties_p", "INFERENCE-DYNAMIC-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "extract_inference_dynamic_properties", "EXTRACT-INFERENCE-DYNAMIC-PROPERTIES", 1, 0, false);
        declareFunction(myName, "all_inference_dynamic_properties", "ALL-INFERENCE-DYNAMIC-PROPERTIES", 0, 0, false);
        declareFunction(myName, "inference_properties_metrics", "INFERENCE-PROPERTIES-METRICS", 1, 0, false);
        declareFunction(myName, "strategy_property_p", "STRATEGY-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "strategy_properties_p", "STRATEGY-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "strategy_static_property_p", "STRATEGY-STATIC-PROPERTY-P", 1, 0, false);
        new $strategy_static_property_p$UnaryFunction();
        declareFunction(myName, "strategy_static_properties_p", "STRATEGY-STATIC-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "extract_strategy_static_properties", "EXTRACT-STRATEGY-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(myName, "all_strategy_static_properties", "ALL-STRATEGY-STATIC-PROPERTIES", 0, 0, false);
        declareFunction(myName, "strategy_static_properties_removal_backtracking_productivity_limit", "STRATEGY-STATIC-PROPERTIES-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(myName, "strategy_static_properties_proof_spec", "STRATEGY-STATIC-PROPERTIES-PROOF-SPEC", 1, 0, false);
        declareFunction(myName, "strategy_dynamic_property_p", "STRATEGY-DYNAMIC-PROPERTY-P", 1, 0, false);
        new $strategy_dynamic_property_p$UnaryFunction();
        declareFunction(myName, "strategy_dynamic_properties_p", "STRATEGY-DYNAMIC-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "extract_strategy_dynamic_properties", "EXTRACT-STRATEGY-DYNAMIC-PROPERTIES", 1, 0, false);
        declareFunction(myName, "all_strategy_dynamic_properties", "ALL-STRATEGY-DYNAMIC-PROPERTIES", 0, 0, false);
        declareFunction(myName, "strategy_dynamic_properties_productivity_limit", "STRATEGY-DYNAMIC-PROPERTIES-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(myName, "problem_store_property_p", "PROBLEM-STORE-PROPERTY-P", 1, 0, false);
        new $problem_store_property_p$UnaryFunction();
        declareFunction(myName, "problem_store_properties_p", "PROBLEM-STORE-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "all_problem_store_properties", "ALL-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        declareFunction(myName, "extract_problem_store_properties", "EXTRACT-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        declareFunction(myName, "problem_store_static_property_p", "PROBLEM-STORE-STATIC-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "problem_store_static_properties_p", "PROBLEM-STORE-STATIC-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "extract_problem_store_static_properties", "EXTRACT-PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(myName, "all_problem_store_static_properties", "ALL-PROBLEM-STORE-STATIC-PROPERTIES", 0, 0, false);
        declareFunction(myName, "problem_store_dynamic_property_p", "PROBLEM-STORE-DYNAMIC-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "problem_store_dynamic_properties_p", "PROBLEM-STORE-DYNAMIC-PROPERTIES-P", 1, 0, false);
        declareFunction(myName, "all_problem_store_dynamic_properties", "ALL-PROBLEM-STORE-DYNAMIC-PROPERTIES", 0, 0, false);
        declareFunction(myName, "inference_meta_property_p", "INFERENCE-META-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "all_inference_meta_properties", "ALL-INFERENCE-META-PROPERTIES", 0, 0, false);
        declareFunction(myName, "extract_inference_meta_properties", "EXTRACT-INFERENCE-META-PROPERTIES", 1, 0, false);
        declareFunction(myName, "query_halt_reason_p", "QUERY-HALT-REASON-P", 1, 0, false);
        declareFunction(myName, "exhausted_query_halt_reason_p", "EXHAUSTED-QUERY-HALT-REASON-P", 1, 0, false);
        declareFunction(myName, "inference_status_p", "INFERENCE-STATUS-P", 1, 0, false);
        declareFunction(myName, "continuable_inference_status_p", "CONTINUABLE-INFERENCE-STATUS-P", 1, 0, false);
        declareFunction(myName, "avoided_inference_reason_p", "AVOIDED-INFERENCE-REASON-P", 1, 0, false);
        declareFunction(myName, "inference_suspend_status_p", "INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
        declareFunction(myName, "inference_suspend_status_applicableP", "INFERENCE-SUSPEND-STATUS-APPLICABLE?", 1, 0, false);
        declareFunction(myName, "continuable_inference_suspend_status_p", "CONTINUABLE-INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
        declareFunction(myName, "exhausted_inference_suspend_status_p", "EXHAUSTED-INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
        declareFunction(myName, "inference_error_suspend_status_p", "INFERENCE-ERROR-SUSPEND-STATUS-P", 1, 0, false);
        declareFunction(myName, "new_inference_error_suspend_status", "NEW-INFERENCE-ERROR-SUSPEND-STATUS", 1, 0, false);
        declareFunction(myName, "inference_error_suspend_status_message", "INFERENCE-ERROR-SUSPEND-STATUS-MESSAGE", 1, 0, false);
        declareFunction(myName, "inference_justification_status_p", "INFERENCE-JUSTIFICATION-STATUS-P", 1, 0, false);
        declareFunction(myName, "new_inference_justification_status", "NEW-INFERENCE-JUSTIFICATION-STATUS", 1, 0, false);
        declareFunction(myName, "inference_justification_status_message", "INFERENCE-JUSTIFICATION-STATUS-MESSAGE", 1, 0, false);
        declareFunction(myName, "tactical_status_p", "TACTICAL-STATUS-P", 1, 0, false);
        declareFunction(myName, "provability_status_p", "PROVABILITY-STATUS-P", 1, 0, false);
        declareFunction(myName, "tactical_status_weakerP", "TACTICAL-STATUS-WEAKER?", 2, 0, false);
        declareFunction(myName, "tactical_status_strongerP", "TACTICAL-STATUS-STRONGER?", 2, 0, false);
        declareFunction(myName, "tactical_status_unionP", "TACTICAL-STATUS-UNION?", 2, 0, false);
        declareFunction(myName, "problem_status_p", "PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(myName, "problem_status_from_tactical_status_and_provability_status", "PROBLEM-STATUS-FROM-TACTICAL-STATUS-AND-PROVABILITY-STATUS", 2, 0, false);
        declareFunction(myName, "tactical_status_from_problem_status", "TACTICAL-STATUS-FROM-PROBLEM-STATUS", 1, 0, false);
        declareFunction(myName, "provability_status_from_problem_status", "PROVABILITY-STATUS-FROM-PROBLEM-STATUS", 1, 0, false);
        declareFunction(myName, "good_problem_status_p", "GOOD-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(myName, "no_good_problem_status_p", "NO-GOOD-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(myName, "neutral_problem_status_p", "NEUTRAL-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(myName, "unexamined_problem_status_p", "UNEXAMINED-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(myName, "examined_problem_status_p", "EXAMINED-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(myName, "possible_problem_status_p", "POSSIBLE-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(myName, "pending_problem_status_p", "PENDING-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(myName, "finished_problem_status_p", "FINISHED-PROBLEM-STATUS-P", 1, 0, false);
        declareFunction(myName, "problem_store_properties_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-PROPERTIES-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
        declareFunction(myName, "problem_store_properties_negation_by_failureP", "PROBLEM-STORE-PROPERTIES-NEGATION-BY-FAILURE?", 1, 0, false);
        declareFunction(myName, "problem_store_properties_completeness_minimization_allowedP", "PROBLEM-STORE-PROPERTIES-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
        declareFunction(myName, "problem_store_properties_evaluate_subl_allowedP", "PROBLEM-STORE-PROPERTIES-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
        declareFunction(myName, "problem_store_properties_rewrite_allowedP", "PROBLEM-STORE-PROPERTIES-REWRITE-ALLOWED?", 1, 0, false);
        declareFunction(myName, "problem_store_properties_abduction_allowedP", "PROBLEM-STORE-PROPERTIES-ABDUCTION-ALLOWED?", 1, 0, false);
        declareFunction(myName, "problem_store_properties_new_terms_allowedP", "PROBLEM-STORE-PROPERTIES-NEW-TERMS-ALLOWED?", 1, 0, false);
        declareFunction(myName, "problem_store_properties_compute_answer_justificationsP", "PROBLEM-STORE-PROPERTIES-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
        declareFunction(myName, "all_inference_modes", "ALL-INFERENCE-MODES", 0, 0, false);
        declareFunction(myName, "inference_mode_p", "INFERENCE-MODE-P", 1, 0, false);
        declareFunction(myName, "problem_link_type_p", "PROBLEM-LINK-TYPE-P", 1, 0, false);
        declareFunction(myName, "problem_store_name_p", "PROBLEM-STORE-NAME-P", 1, 0, false);
        declareFunction(myName, "problem_store_properties_name", "PROBLEM-STORE-PROPERTIES-NAME", 1, 0, false);
        declareFunction(myName, "problem_store_equality_reasoning_method_p", "PROBLEM-STORE-EQUALITY-REASONING-METHOD-P", 1, 0, false);
        declareFunction(myName, "problem_store_properties_equality_reasoning_method", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-METHOD", 1, 0, false);
        declareFunction(myName, "problem_store_equality_reasoning_domain_p", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN-P", 1, 0, false);
        declareFunction(myName, "problem_store_properties_equality_reasoning_domain", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-DOMAIN", 1, 0, false);
        declareFunction(myName, "intermediate_step_validation_level_p", "INTERMEDIATE-STEP-VALIDATION-LEVEL-P", 1, 0, false);
        declareFunction(myName, "problem_store_properties_intermediate_step_validation_level", "PROBLEM-STORE-PROPERTIES-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
        declareFunction(myName, "max_problem_count_p", "MAX-PROBLEM-COUNT-P", 1, 0, false);
        declareFunction(myName, "problem_store_properties_max_problem_count", "PROBLEM-STORE-PROPERTIES-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction(myName, "removal_allowed_by_propertiesP", "REMOVAL-ALLOWED-BY-PROPERTIES?", 1, 0, false);
        declareFunction(myName, "transformation_allowed_by_propertiesP", "TRANSFORMATION-ALLOWED-BY-PROPERTIES?", 1, 0, false);
        declareFunction(myName, "inference_direction_p", "INFERENCE-DIRECTION-P", 1, 0, false);
        declareFunction(myName, "problem_store_properties_direction", "PROBLEM-STORE-PROPERTIES-DIRECTION", 1, 0, false);
        declareFunction(myName, "tactic_status_p", "TACTIC-STATUS-P", 1, 0, false);
        declareFunction(myName, "tactic_type_p", "TACTIC-TYPE-P", 1, 0, false);
        declareFunction(myName, "tactic_type_from_hl_module", "TACTIC-TYPE-FROM-HL-MODULE", 1, 0, false);
        declareFunction(myName, "completeness_string", "COMPLETENESS-STRING", 1, 0, false);
        declareFunction(myName, "completeness_p", "COMPLETENESS-P", 1, 0, false);
        declareFunction(myName, "impossible_completeness_p", "IMPOSSIBLE-COMPLETENESS-P", 1, 0, false);
        declareFunction(myName, "completeness_L", "COMPLETENESS-<", 2, 0, false);
        declareFunction(myName, "completeness_G", "COMPLETENESS->", 2, 0, false);
        declareFunction(myName, "min_completeness", "MIN-COMPLETENESS", 1, 0, false);
        declareFunction(myName, "min2_completeness", "MIN2-COMPLETENESS", 2, 0, false);
        declareFunction(myName, "max_completeness", "MAX-COMPLETENESS", 1, 0, false);
        declareFunction(myName, "max2_completeness", "MAX2-COMPLETENESS", 2, 0, false);
        declareFunction(myName, "productivity_p", "PRODUCTIVITY-P", 1, 0, false);
        declareFunction(myName, "infinite_productivity_p", "INFINITE-PRODUCTIVITY-P", 1, 0, false);
        declareFunction(myName, "productivity_for_number_of_children", "PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 0, false);
        declareFunction(myName, "number_of_children_for_productivity", "NUMBER-OF-CHILDREN-FOR-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "cost_for_productivity", "COST-FOR-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "removal_cost_cutoff_for_productivity", "REMOVAL-COST-CUTOFF-FOR-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "productivity_E", "PRODUCTIVITY-=", 2, 0, false);
        declareFunction(myName, "productivity_L", "PRODUCTIVITY-<", 2, 0, false);
        declareFunction(myName, "productivity_LE", "PRODUCTIVITY-<=", 2, 0, false);
        declareFunction(myName, "productivity_G", "PRODUCTIVITY->", 2, 0, false);
        declareFunction(myName, "productivity_GE", "PRODUCTIVITY->=", 2, 0, false);
        declareFunction(myName, "productivity_X", "PRODUCTIVITY-+", 2, 0, false);
        declareFunction(myName, "productivity_max", "PRODUCTIVITY-MAX", 2, 0, false);
        declareFunction(myName, "productivity_sum", "PRODUCTIVITY-SUM", 1, 0, false);
        declareFunction(myName, "productivity_times_number", "PRODUCTIVITY-TIMES-NUMBER", 2, 0, false);
        declareFunction(myName, "productivity_divide_number", "PRODUCTIVITY-DIVIDE-NUMBER", 2, 0, false);
        declareFunction(myName, "decrement_productivity_for_number_of_children", "DECREMENT-PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 1, false);
        declareFunction(myName, "proof_status_p", "PROOF-STATUS-P", 1, 0, false);
        declareFunction(myName, "proof_reject_reason_p", "PROOF-REJECT-REASON-P", 1, 0, false);
        declareFunction(myName, "destructibility_status_string", "DESTRUCTIBILITY-STATUS-STRING", 1, 0, false);
        declareFunction(myName, "destructibility_status_hint", "DESTRUCTIBILITY-STATUS-HINT", 1, 0, false);
        declareFunction(myName, "destructibility_status_p", "DESTRUCTIBILITY-STATUS-P", 1, 0, false);
        declareFunction(myName, "destructibility_status_destructibleP", "DESTRUCTIBILITY-STATUS-DESTRUCTIBLE?", 1, 0, false);
        declareFunction(myName, "strategy_type_property_p", "STRATEGY-TYPE-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "strategy_default_method_handler", "STRATEGY-DEFAULT-METHOD-HANDLER", 1, 0, false);
        declareFunction(myName, "inference_simple_return_type_p", "INFERENCE-SIMPLE-RETURN-TYPE-P", 1, 0, false);
        declareFunction(myName, "inference_properties_has_simple_return_typeP", "INFERENCE-PROPERTIES-HAS-SIMPLE-RETURN-TYPE?", 1, 0, false);
        declareFunction(myName, "inference_template_return_type_p", "INFERENCE-TEMPLATE-RETURN-TYPE-P", 1, 0, false);
        declareFunction(myName, "inference_format_return_type_p", "INFERENCE-FORMAT-RETURN-TYPE-P", 1, 0, false);
        declareFunction(myName, "inference_return_type_p", "INFERENCE-RETURN-TYPE-P", 1, 0, false);
        declareFunction(myName, "inference_properties_return_type", "INFERENCE-PROPERTIES-RETURN-TYPE", 1, 0, false);
        declareFunction(myName, "inference_answer_language_p", "INFERENCE-ANSWER-LANGUAGE-P", 1, 0, false);
        declareFunction(myName, "inference_properties_answer_language", "INFERENCE-PROPERTIES-ANSWER-LANGUAGE", 1, 0, false);
        declareFunction(myName, "result_uniqueness_criterion_p", "RESULT-UNIQUENESS-CRITERION-P", 1, 0, false);
        declareFunction(myName, "inference_properties_uniqueness_criterion", "INFERENCE-PROPERTIES-UNIQUENESS-CRITERION", 1, 0, false);
        declareFunction(myName, "inference_disjunction_free_el_vars_policy_p", "INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY-P", 1, 0, false);
        declareFunction(myName, "inference_properties_disjunction_free_el_vars_policy", "INFERENCE-PROPERTIES-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
        declareFunction(myName, "inference_transitive_closure_mode_p", "INFERENCE-TRANSITIVE-CLOSURE-MODE-P", 1, 0, false);
        declareFunction(myName, "inference_properties_transitive_closure_mode", "INFERENCE-PROPERTIES-TRANSITIVE-CLOSURE-MODE", 1, 0, false);
        declareFunction(myName, "inference_properties_maintain_term_working_setP", "INFERENCE-PROPERTIES-MAINTAIN-TERM-WORKING-SET?", 1, 0, false);
        declareFunction(myName, "inference_properties_events", "INFERENCE-PROPERTIES-EVENTS", 1, 0, false);
        declareFunction(myName, "inference_event_type_p", "INFERENCE-EVENT-TYPE-P", 1, 0, false);
        declareFunction(myName, "inference_properties_halt_conditions", "INFERENCE-PROPERTIES-HALT-CONDITIONS", 1, 0, false);
        declareFunction(myName, "inference_halt_condition_p", "INFERENCE-HALT-CONDITION-P", 1, 0, false);
        declareFunction(myName, "inference_accumulator_type_p", "INFERENCE-ACCUMULATOR-TYPE-P", 1, 0, false);
        declareFunction(myName, "initialize_inference_accumulator", "INITIALIZE-INFERENCE-ACCUMULATOR", 1, 0, false);
        declareFunction(myName, "inference_properties_forget_extra_resultsP", "INFERENCE-PROPERTIES-FORGET-EXTRA-RESULTS?", 1, 0, false);
        declareFunction(myName, "inference_properties_cache_inference_resultsP", "INFERENCE-PROPERTIES-CACHE-INFERENCE-RESULTS?", 1, 0, false);
        declareFunction(myName, "inference_properties_browsableP", "INFERENCE-PROPERTIES-BROWSABLE?", 1, 0, false);
        declareFunction(myName, "inference_properties_continuableP", "INFERENCE-PROPERTIES-CONTINUABLE?", 1, 0, false);
        declareFunction(myName, "inference_properties_blockP", "INFERENCE-PROPERTIES-BLOCK?", 1, 0, false);
        declareFunction(myName, "inference_query_property_lookup", "INFERENCE-QUERY-PROPERTY-LOOKUP", 2, 0, false);
        declareFunction(myName, "inference_engine_default_for_property", "INFERENCE-ENGINE-DEFAULT-FOR-PROPERTY", 1, 0, false);
        declareFunction(myName, "query_property_is_defaultP", "QUERY-PROPERTY-IS-DEFAULT?", 2, 0, false);
        declareFunction(myName, "inference_input_non_default_query_properties", "INFERENCE-INPUT-NON-DEFAULT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "all_default_query_properties", "ALL-DEFAULT-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(myName, "explicify_default_query_properties", "EXPLICIFY-DEFAULT-QUERY-PROPERTIES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_enumerated_types_file() {
        $specially_handled_inference_metrics$ = deflexical("*SPECIALLY-HANDLED-INFERENCE-METRICS*", $list7);
        $non_inference_query_metrics$ = deflexical("*NON-INFERENCE-QUERY-METRICS*", $list8);
        $arete_query_metrics$ = deflexical("*ARETE-QUERY-METRICS*", $list9);
        $removal_ask_query_metrics$ = deflexical("*REMOVAL-ASK-QUERY-METRICS*", $list10);
        $inference_static_properties$ = deflexical("*INFERENCE-STATIC-PROPERTIES*", $list12);
        $inference_allows_hl_predicate_transformation_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-HL-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL);
        $inference_allows_unbound_predicate_transformation_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-UNBOUND-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL);
        $inference_allows_evaluatable_predicate_transformation_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-EVALUATABLE-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL);
        $inference_allows_indeterminate_results_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-INDETERMINATE-RESULTS-BY-DEFAULT?*", T);
        $default_allowed_rules$ = deflexical("*DEFAULT-ALLOWED-RULES*", $ALL);
        $default_forbidden_rules$ = deflexical("*DEFAULT-FORBIDDEN-RULES*", $NONE);
        $default_allowed_modules$ = deflexical("*DEFAULT-ALLOWED-MODULES*", $ALL);
        $inference_allows_abnormality_checking_by_defaultP$ = SubLFiles.deflexical("*INFERENCE-ALLOWS-ABNORMALITY-CHECKING-BY-DEFAULT?*", T);
        $inference_resource_constraints$ = deflexical("*INFERENCE-RESOURCE-CONSTRAINTS*", $list26);
        $default_max_number$ = deflexical("*DEFAULT-MAX-NUMBER*", NIL);
        $default_max_time$ = deflexical("*DEFAULT-MAX-TIME*", NIL);
        $default_max_step$ = deflexical("*DEFAULT-MAX-STEP*", NIL);
        $default_forward_max_time$ = deflexical("*DEFAULT-FORWARD-MAX-TIME*", ZERO_INTEGER);
        $default_max_proof_depth$ = deflexical("*DEFAULT-MAX-PROOF-DEPTH*", NIL);
        $default_max_transformation_depth$ = deflexical("*DEFAULT-MAX-TRANSFORMATION-DEPTH*", ZERO_INTEGER);
        $default_min_rule_utility$ = deflexical("*DEFAULT-MIN-RULE-UTILITY*", $int$_100);
        $default_probably_approximately_done$ = deflexical("*DEFAULT-PROBABLY-APPROXIMATELY-DONE*", ONE_INTEGER);
        $inference_other_dynamic_properties$ = deflexical("*INFERENCE-OTHER-DYNAMIC-PROPERTIES*", $list38);
        $default_inference_metrics_template$ = deflexical("*DEFAULT-INFERENCE-METRICS-TEMPLATE*", NIL);
        $strategy_static_properties$ = deflexical("*STRATEGY-STATIC-PROPERTIES*", $list42);
        $default_removal_backtracking_productivity_limit$ = SubLFiles.deflexical("*DEFAULT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT*", ZERO_INTEGER);
        $default_proof_spec$ = deflexical("*DEFAULT-PROOF-SPEC*", $ANYTHING);
        $strategy_dynamic_properties$ = deflexical("*STRATEGY-DYNAMIC-PROPERTIES*", $list47);
        $default_productivity_limit$ = deflexical("*DEFAULT-PRODUCTIVITY-LIMIT*", Numbers.multiply(TWO_INTEGER, $int$100, control_vars.$default_removal_cost_cutoff$.getGlobalValue()));
        $problem_store_static_properties$ = deflexical("*PROBLEM-STORE-STATIC-PROPERTIES*", $list52);
        $problem_store_dynamic_properties$ = deflexical("*PROBLEM-STORE-DYNAMIC-PROPERTIES*", NIL);
        $inference_meta_properties$ = deflexical("*INFERENCE-META-PROPERTIES*", $list55);
        $inference_statuses$ = deflexical("*INFERENCE-STATUSES*", $list57);
        $continuable_inference_statuses$ = deflexical("*CONTINUABLE-INFERENCE-STATUSES*", $list58);
        $avoided_inference_reasons$ = deflexical("*AVOIDED-INFERENCE-REASONS*", $list59);
        $inference_suspend_statuses$ = deflexical("*INFERENCE-SUSPEND-STATUSES*", $list60);
        $continuable_inference_suspend_statuses$ = deflexical("*CONTINUABLE-INFERENCE-SUSPEND-STATUSES*", $list64);
        $exhausted_inference_suspend_statuses$ = deflexical("*EXHAUSTED-INFERENCE-SUSPEND-STATUSES*", $list65);
        $tactical_statuses$ = deflexical("*TACTICAL-STATUSES*", $list70);
        $provability_statuses$ = deflexical("*PROVABILITY-STATUSES*", $list71);
        $problem_status_table$ = deflexical("*PROBLEM-STATUS-TABLE*", $list72);
        $ordered_tactical_statuses$ = deflexical("*ORDERED-TACTICAL-STATUSES*", list_utilities.delete_duplicates_sorted(Mapping.mapcar($sym73$SECOND, $problem_status_table$.getGlobalValue()), UNPROVIDED));
        $union_ordered_tactical_statuses$ = deflexical("*UNION-ORDERED-TACTICAL-STATUSES*", $list74);
        $add_restriction_layer_of_indirection_by_defaultP$ = SubLFiles.deflexical("*ADD-RESTRICTION-LAYER-OF-INDIRECTION-BY-DEFAULT?*", NIL);
        $negation_by_failure_by_defaultP$ = deflexical("*NEGATION-BY-FAILURE-BY-DEFAULT?*", NIL);
        $evaluate_subl_allowed_defaultP$ = deflexical("*EVALUATE-SUBL-ALLOWED-DEFAULT?*", T);
        $rewrite_allowed_defaultP$ = defparameter("*REWRITE-ALLOWED-DEFAULT?*", NIL);
        $abduction_allowed_defaultP$ = deflexical("*ABDUCTION-ALLOWED-DEFAULT?*", NIL);
        $new_terms_allowed_defaultP$ = deflexical("*NEW-TERMS-ALLOWED-DEFAULT?*", T);
        $compute_answer_justifications_defaultP$ = deflexical("*COMPUTE-ANSWER-JUSTIFICATIONS-DEFAULT?*", T);
        $default_inference_mode$ = deflexical("*DEFAULT-INFERENCE-MODE*", $CUSTOM);
        $inference_modes$ = deflexical("*INFERENCE-MODES*", $list93);
        $problem_link_types$ = deflexical("*PROBLEM-LINK-TYPES*", $list94);
        $default_problem_store_name$ = deflexical("*DEFAULT-PROBLEM-STORE-NAME*", NIL);
        $default_equality_reasoning_method$ = deflexical("*DEFAULT-EQUALITY-REASONING-METHOD*", $CZER_EQUAL);
        $problem_store_equality_reasoning_methods$ = deflexical("*PROBLEM-STORE-EQUALITY-REASONING-METHODS*", $list97);
        $default_equality_reasoning_domain$ = deflexical("*DEFAULT-EQUALITY-REASONING-DOMAIN*", $ALL);
        $problem_store_equality_reasoning_domains$ = deflexical("*PROBLEM-STORE-EQUALITY-REASONING-DOMAINS*", $list99);
        $default_intermediate_step_validation_level$ = SubLFiles.deflexical("*DEFAULT-INTERMEDIATE-STEP-VALIDATION-LEVEL*", $NONE);
        $intermediate_step_validation_levels$ = deflexical("*INTERMEDIATE-STEP-VALIDATION-LEVELS*", $list101);
        $default_max_problem_count$ = deflexical("*DEFAULT-MAX-PROBLEM-COUNT*", $int$100000);
        $removal_allowed_by_defaultP$ = deflexical("*REMOVAL-ALLOWED-BY-DEFAULT?*", T);
        $transformation_allowed_by_defaultP$ = deflexical("*TRANSFORMATION-ALLOWED-BY-DEFAULT?*", T);
        $default_problem_store_inference_direction$ = SubLFiles.deflexical("*DEFAULT-PROBLEM-STORE-INFERENCE-DIRECTION*", $BACKWARD);
        $inference_directions$ = deflexical("*INFERENCE-DIRECTIONS*", $list108);
        $tactic_statuses$ = deflexical("*TACTIC-STATUSES*", $list110);
        $tactic_types$ = deflexical("*TACTIC-TYPES*", $list111);
        $ordered_completenesses$ = deflexical("*ORDERED-COMPLETENESSES*", $list119);
        $productivity_to_number_table$ = deflexical("*PRODUCTIVITY-TO-NUMBER-TABLE*", $list132);
        $proof_statuses$ = deflexical("*PROOF-STATUSES*", $list134);
        $proof_reject_reasons$ = deflexical("*PROOF-REJECT-REASONS*", $list135);
        $destructibility_statuses$ = deflexical("*DESTRUCTIBILITY-STATUSES*", $list136);
        $balancing_tactician_strategy_type_properties$ = SubLFiles.deflexical("*BALANCING-TACTICIAN-STRATEGY-TYPE-PROPERTIES*", $list148);
        $legacy_strategy_type_properties$ = deflexical("*LEGACY-STRATEGY-TYPE-PROPERTIES*", $list149);
        $strategy_type_properties$ = deflexical("*STRATEGY-TYPE-PROPERTIES*", append($balancing_tactician_strategy_type_properties$.getGlobalValue(), $legacy_strategy_type_properties$.getGlobalValue()));
        $inference_return_types$ = deflexical("*INFERENCE-RETURN-TYPES*", $list153);
        $inference_default_return_type$ = deflexical("*INFERENCE-DEFAULT-RETURN-TYPE*", $BINDINGS);
        $inference_answer_languages$ = deflexical("*INFERENCE-ANSWER-LANGUAGES*", $list158);
        $inference_default_answer_language$ = deflexical("*INFERENCE-DEFAULT-ANSWER-LANGUAGE*", $EL);
        $result_uniqueness_criteria$ = deflexical("*RESULT-UNIQUENESS-CRITERIA*", $list161);
        $default_result_uniqueness_criterion$ = deflexical("*DEFAULT-RESULT-UNIQUENESS-CRITERION*", $BINDINGS);
        $inference_disjunction_free_el_vars_policies$ = SubLFiles.deflexical("*INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICIES*", $list163);
        $default_inference_disjunction_free_el_vars_policy$ = SubLFiles.deflexical("*DEFAULT-INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY*", $REQUIRE_EQUAL);
        $inference_transitive_closure_modes$ = deflexical("*INFERENCE-TRANSITIVE-CLOSURE-MODES*", $list166);
        $inference_transitive_closure_mode_default$ = SubLFiles.deflexical("*INFERENCE-TRANSITIVE-CLOSURE-MODE-DEFAULT*", $NONE);
        $maintain_term_working_set_defaultP$ = deflexical("*MAINTAIN-TERM-WORKING-SET-DEFAULT?*", NIL);
        $inference_events_default$ = deflexical("*INFERENCE-EVENTS-DEFAULT*", NIL);
        $inference_event_types$ = deflexical("*INFERENCE-EVENT-TYPES*", $list170);
        $inference_halt_conditions_default$ = deflexical("*INFERENCE-HALT-CONDITIONS-DEFAULT*", NIL);
        $inference_halt_conditions$ = deflexical("*INFERENCE-HALT-CONDITIONS*", $list172);
        $inference_accumulator_types$ = deflexical("*INFERENCE-ACCUMULATOR-TYPES*", $list173);
        $inference_default_forget_extra_resultsP$ = deflexical("*INFERENCE-DEFAULT-FORGET-EXTRA-RESULTS?*", NIL);
        $inference_default_cache_inference_resultsP$ = SubLFiles.deflexical("*INFERENCE-DEFAULT-CACHE-INFERENCE-RESULTS?*", NIL);
        $inference_default_browsableP$ = deflexical("*INFERENCE-DEFAULT-BROWSABLE?*", NIL);
        $inference_default_continuableP$ = deflexical("*INFERENCE-DEFAULT-CONTINUABLE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_enumerated_types_file() {
        access_macros.register_external_symbol($sym0$QUERY_PROPERTY_P);
        utilities_macros.register_cyc_api_function($sym1$ALL_QUERY_PROPERTIES, NIL, $str2$Return_a_list_of_all_the_query_pr, NIL, $list3);
        access_macros.register_external_symbol($sym51$PROBLEM_STORE_PROPERTY_P);
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

    static {
        me = new inference_datastructures_enumerated_types();
        $specially_handled_inference_metrics$ = null;
        $non_inference_query_metrics$ = null;
        $arete_query_metrics$ = null;
        $removal_ask_query_metrics$ = null;
        $inference_static_properties$ = null;
        $inference_allows_hl_predicate_transformation_by_defaultP$ = null;
        $inference_allows_unbound_predicate_transformation_by_defaultP$ = null;
        $inference_allows_evaluatable_predicate_transformation_by_defaultP$ = null;
        $inference_allows_indeterminate_results_by_defaultP$ = null;
        $default_allowed_rules$ = null;
        $default_forbidden_rules$ = null;
        $default_allowed_modules$ = null;
        $inference_allows_abnormality_checking_by_defaultP$ = null;
        $inference_resource_constraints$ = null;
        $default_max_number$ = null;
        $default_max_time$ = null;
        $default_max_step$ = null;
        $default_forward_max_time$ = null;
        $default_max_proof_depth$ = null;
        $default_max_transformation_depth$ = null;
        $default_min_rule_utility$ = null;
        $default_probably_approximately_done$ = null;
        $inference_other_dynamic_properties$ = null;
        $default_inference_metrics_template$ = null;
        $strategy_static_properties$ = null;
        $default_removal_backtracking_productivity_limit$ = null;
        $default_proof_spec$ = null;
        $strategy_dynamic_properties$ = null;
        $default_productivity_limit$ = null;
        $problem_store_static_properties$ = null;
        $problem_store_dynamic_properties$ = null;
        $inference_meta_properties$ = null;
        $inference_statuses$ = null;
        $continuable_inference_statuses$ = null;
        $avoided_inference_reasons$ = null;
        $inference_suspend_statuses$ = null;
        $continuable_inference_suspend_statuses$ = null;
        $exhausted_inference_suspend_statuses$ = null;
        $tactical_statuses$ = null;
        $provability_statuses$ = null;
        $problem_status_table$ = null;
        $ordered_tactical_statuses$ = null;
        $union_ordered_tactical_statuses$ = null;
        $add_restriction_layer_of_indirection_by_defaultP$ = null;
        $negation_by_failure_by_defaultP$ = null;
        $evaluate_subl_allowed_defaultP$ = null;
        $rewrite_allowed_defaultP$ = null;
        $abduction_allowed_defaultP$ = null;
        $new_terms_allowed_defaultP$ = null;
        $compute_answer_justifications_defaultP$ = null;
        $default_inference_mode$ = null;
        $inference_modes$ = null;
        $problem_link_types$ = null;
        $default_problem_store_name$ = null;
        $default_equality_reasoning_method$ = null;
        $problem_store_equality_reasoning_methods$ = null;
        $default_equality_reasoning_domain$ = null;
        $problem_store_equality_reasoning_domains$ = null;
        $default_intermediate_step_validation_level$ = null;
        $intermediate_step_validation_levels$ = null;
        $default_max_problem_count$ = null;
        $removal_allowed_by_defaultP$ = null;
        $transformation_allowed_by_defaultP$ = null;
        $default_problem_store_inference_direction$ = null;
        $inference_directions$ = null;
        $tactic_statuses$ = null;
        $tactic_types$ = null;
        $ordered_completenesses$ = null;
        $productivity_to_number_table$ = null;
        $proof_statuses$ = null;
        $proof_reject_reasons$ = null;
        $destructibility_statuses$ = null;
        $balancing_tactician_strategy_type_properties$ = null;
        $legacy_strategy_type_properties$ = null;
        $strategy_type_properties$ = null;
        $inference_return_types$ = null;
        $inference_default_return_type$ = null;
        $inference_answer_languages$ = null;
        $inference_default_answer_language$ = null;
        $result_uniqueness_criteria$ = null;
        $default_result_uniqueness_criterion$ = null;
        $inference_disjunction_free_el_vars_policies$ = null;
        $default_inference_disjunction_free_el_vars_policy$ = null;
        $inference_transitive_closure_modes$ = null;
        $inference_transitive_closure_mode_default$ = null;
        $maintain_term_working_set_defaultP$ = null;
        $inference_events_default$ = null;
        $inference_event_types$ = null;
        $inference_halt_conditions_default$ = null;
        $inference_halt_conditions$ = null;
        $inference_accumulator_types$ = null;
        $inference_default_forget_extra_resultsP$ = null;
        $inference_default_cache_inference_resultsP$ = null;
        $inference_default_browsableP$ = null;
        $inference_default_continuableP$ = null;
        $sym0$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
        $sym1$ALL_QUERY_PROPERTIES = makeSymbol("ALL-QUERY-PROPERTIES");
        $str2$Return_a_list_of_all_the_query_pr = makeString("Return a list of all the query properties.\n   @note destructible");
        $list3 = list(list(makeSymbol("LIST"), makeSymbol("KEYWORDP")));
        $sym4$QUERY_STATIC_PROPERTY_P = makeSymbol("QUERY-STATIC-PROPERTY-P");
        $sym5$QUERY_STATIC_OR_META_PROPERTY_P = makeSymbol("QUERY-STATIC-OR-META-PROPERTY-P");
        $sym6$QUERY_DYNAMIC_PROPERTY_P = makeSymbol("QUERY-DYNAMIC-PROPERTY-P");
        $list7 = list(makeKeyword("NEW-ROOT-TIMES"), makeKeyword("NEW-ROOT-COUNT"), makeKeyword("PROBLEM-CREATION-TIMES"), makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES"), makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES"), makeKeyword("INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES"),
                makeKeyword("INFERENCE-IDS"));
        $list8 = list(makeKeyword("COMPLETE-USER-TIME"), makeKeyword("COMPLETE-SYSTEM-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));
        $list9 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("HYPOTHESIZATION-TIME"), makeKeyword("TOTAL-TIME"));
        $list10 = list(new SubLObject[] { makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TIME-PER-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-USER-TIME"),
                makeKeyword("COMPLETE-SYSTEM-TIME"), makeKeyword("COMPLETE-TOTAL-TIME") });
        $sym11$INFERENCE_PROPERTY_P = makeSymbol("INFERENCE-PROPERTY-P");
        $list12 = list(new SubLObject[] { makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROBLEM-STORE"), makeKeyword("CONDITIONAL-SENTENCE?"), makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"),
                makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOWED-RULES"), makeKeyword("FORBIDDEN-RULES"), makeKeyword("ALLOWED-MODULES"),
                makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("MAINTAIN-TERM-WORKING-SET?"), makeKeyword("EVENTS"), makeKeyword("HALT-CONDITIONS") });
        $sym13$INFERENCE_STATIC_PROPERTY_P = makeSymbol("INFERENCE-STATIC-PROPERTY-P");
        $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P = makeSymbol("INFERENCE-STATIC-OR-META-PROPERTY-P");
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ALL = makeKeyword("ALL");
        $ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
        $NONE = makeKeyword("NONE");
        $FORBIDDEN_RULES = makeKeyword("FORBIDDEN-RULES");
        $ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
        $ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $list26 = list(makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("INFERENCE-MODE"));
        $sym27$INFERENCE_RESOURCE_CONSTRAINT_P = makeSymbol("INFERENCE-RESOURCE-CONSTRAINT-P");
        $MAX_NUMBER = makeKeyword("MAX-NUMBER");
        $MAX_TIME = makeKeyword("MAX-TIME");
        $MAX_STEP = makeKeyword("MAX-STEP");
        $INFERENCE_MODE = makeKeyword("INFERENCE-MODE");
        $FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");
        $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");
        $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $int$_100 = makeInteger(-100);
        $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");
        $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $list38 = list(new SubLObject[] { makeKeyword("FORWARD-MAX-TIME"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("MIN-RULE-UTILITY"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("RETURN"), makeKeyword("ANSWER-LANGUAGE"),
                makeKeyword("CACHE-INFERENCE-RESULTS?"), makeKeyword("FORGET-EXTRA-RESULTS?"), makeKeyword("BROWSABLE?"), makeKeyword("CONTINUABLE?"), makeKeyword("BLOCK?"), makeKeyword("METRICS") });
        $sym39$INFERENCE_DYNAMIC_PROPERTY_P = makeSymbol("INFERENCE-DYNAMIC-PROPERTY-P");
        $METRICS = makeKeyword("METRICS");
        $sym41$STRATEGY_PROPERTY_P = makeSymbol("STRATEGY-PROPERTY-P");
        $list42 = list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PROOF-SPEC"));
        $sym43$STRATEGY_STATIC_PROPERTY_P = makeSymbol("STRATEGY-STATIC-PROPERTY-P");
        $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $ANYTHING = makeKeyword("ANYTHING");
        $PROOF_SPEC = makeKeyword("PROOF-SPEC");
        $list47 = list(makeKeyword("PRODUCTIVITY-LIMIT"));
        $sym48$STRATEGY_DYNAMIC_PROPERTY_P = makeSymbol("STRATEGY-DYNAMIC-PROPERTY-P");
        $int$100 = makeInteger(100);
        $PRODUCTIVITY_LIMIT = makeKeyword("PRODUCTIVITY-LIMIT");
        $sym51$PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $list52 = ConsesLow.list(new SubLObject[] { makeKeyword("PROBLEM-STORE-NAME"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("REMOVAL-ALLOWED?"),
                makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"),
                makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?") });
        $sym53$PROBLEM_STORE_STATIC_PROPERTY_P = makeSymbol("PROBLEM-STORE-STATIC-PROPERTY-P");
        $sym54$PROBLEM_STORE_DYNAMIC_PROPERTY_P = makeSymbol("PROBLEM-STORE-DYNAMIC-PROPERTY-P");
        $list55 = list(makeKeyword("INFERENCE-MODE"));
        $sym56$INFERENCE_META_PROPERTY_P = makeSymbol("INFERENCE-META-PROPERTY-P");
        $list57 = list(new SubLObject[] { makeKeyword("NEW"), makeKeyword("PREPARED"), makeKeyword("READY"), makeKeyword("RUNNING"), makeKeyword("SUSPENDED"), makeKeyword("DEAD"), makeKeyword("TAUTOLOGY"), makeKeyword("CONTRADICTION"), makeKeyword("ILL-FORMED") });
        $list58 = list(makeKeyword("PREPARED"), makeKeyword("SUSPENDED"));
        $list59 = list(makeKeyword("TAUTOLOGY"), makeKeyword("CONTRADICTION"), makeKeyword("ILL-FORMED"), makeKeyword("NON-TRIVIAL"), makeKeyword("NOT-A-QUERY"));
        $list60 = list(new SubLObject[] { makeKeyword("ABORT"), makeKeyword("INTERRUPT"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("MAX-PROOF-COUNT"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("EXHAUST"),
                makeKeyword("EXHAUST-TOTAL") });
        $sym61$INFERENCE_STATUS_P = makeSymbol("INFERENCE-STATUS-P");
        $SUSPENDED = makeKeyword("SUSPENDED");
        $TAUTOLOGY = makeKeyword("TAUTOLOGY");
        $list64 = list(makeKeyword("INTERRUPT"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("EXHAUST"));
        $list65 = list(makeKeyword("EXHAUST"), makeKeyword("EXHAUST-TOTAL"));
        $ERROR = makeKeyword("ERROR");
        $sym67$STRINGP = makeSymbol("STRINGP");
        $JUSTIFICATION = makeKeyword("JUSTIFICATION");
        $sym69$HL_JUSTIFICATION_LIST_P = makeSymbol("HL-JUSTIFICATION-LIST-P");
        $list70 = list(makeKeyword("NEW"), makeKeyword("UNEXAMINED"), makeKeyword("EXAMINED"), makeKeyword("POSSIBLE"), makeKeyword("PENDING"), makeKeyword("FINISHED"));
        $list71 = list(makeKeyword("GOOD"), makeKeyword("NEUTRAL"), makeKeyword("NO-GOOD"));
        $list72 = list(new SubLObject[] { list(makeKeyword("NEW"), makeKeyword("NEW"), makeKeyword("NEUTRAL")), list(makeKeyword("UNEXAMINED"), makeKeyword("UNEXAMINED"), makeKeyword("NEUTRAL")), list(makeKeyword("UNEXAMINED-GOOD"), makeKeyword("UNEXAMINED"), makeKeyword("GOOD")),
                list(makeKeyword("UNEXAMINED-NO-GOOD"), makeKeyword("UNEXAMINED"), makeKeyword("NO-GOOD")), list(makeKeyword("EXAMINED"), makeKeyword("EXAMINED"), makeKeyword("NEUTRAL")), list(makeKeyword("EXAMINED-GOOD"), makeKeyword("EXAMINED"), makeKeyword("GOOD")),
                list(makeKeyword("EXAMINED-NO-GOOD"), makeKeyword("EXAMINED"), makeKeyword("NO-GOOD")), list(makeKeyword("POSSIBLE"), makeKeyword("POSSIBLE"), makeKeyword("NEUTRAL")), list(makeKeyword("POSSIBLE-GOOD"), makeKeyword("POSSIBLE"), makeKeyword("GOOD")),
                list(makeKeyword("POSSIBLE-NO-GOOD"), makeKeyword("POSSIBLE"), makeKeyword("NO-GOOD")), list(makeKeyword("PENDING"), makeKeyword("PENDING"), makeKeyword("NEUTRAL")), list(makeKeyword("PENDING-GOOD"), makeKeyword("PENDING"), makeKeyword("GOOD")),
                list(makeKeyword("PENDING-NO-GOOD"), makeKeyword("PENDING"), makeKeyword("NO-GOOD")), list(makeKeyword("FINISHED"), makeKeyword("FINISHED"), makeKeyword("NEUTRAL")), list(makeKeyword("FINISHED-GOOD"), makeKeyword("FINISHED"), makeKeyword("GOOD")),
                list(makeKeyword("FINISHED-NO-GOOD"), makeKeyword("FINISHED"), makeKeyword("NO-GOOD")) });
        $sym73$SECOND = makeSymbol("SECOND");
        $list74 = list(makeKeyword("NEW"), makeKeyword("POSSIBLE"), makeKeyword("PENDING"), makeKeyword("EXAMINED"), makeKeyword("UNEXAMINED"), makeKeyword("FINISHED"));
        $str75$No_match_to_combine__s_and__s = makeString("No match to combine ~s and ~s");
        $GOOD = makeKeyword("GOOD");
        $NO_GOOD = makeKeyword("NO-GOOD");
        $NEUTRAL = makeKeyword("NEUTRAL");
        $UNEXAMINED = makeKeyword("UNEXAMINED");
        $EXAMINED = makeKeyword("EXAMINED");
        $POSSIBLE = makeKeyword("POSSIBLE");
        $PENDING = makeKeyword("PENDING");
        $FINISHED = makeKeyword("FINISHED");
        $ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");
        $COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");
        $ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");
        $NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");
        $COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $CUSTOM = makeKeyword("CUSTOM");
        $list93 = list(makeKeyword("MINIMAL"), makeKeyword("SHALLOW"), makeKeyword("EXTENDED"), makeKeyword("MAXIMAL"), makeKeyword("CUSTOM"));
        $list94 = list(new SubLObject[] { makeKeyword("REMOVAL"), makeKeyword("TRANSFORMATION"), makeKeyword("RESIDUAL-TRANSFORMATION"), makeKeyword("REWRITE"), makeKeyword("JOIN-ORDERED"), makeKeyword("JOIN"), makeKeyword("SPLIT"), makeKeyword("RESTRICTION"), makeKeyword("UNION"),
                makeKeyword("DISJUNCTIVE-ASSUMPTION"), makeKeyword("ANSWER"), makeKeyword("INDIRECTION") });
        $PROBLEM_STORE_NAME = makeKeyword("PROBLEM-STORE-NAME");
        $CZER_EQUAL = makeKeyword("CZER-EQUAL");
        $list97 = list(makeKeyword("EQUAL"), makeKeyword("CZER-EQUAL"));
        $EQUALITY_REASONING_METHOD = makeKeyword("EQUALITY-REASONING-METHOD");
        $list99 = list(makeKeyword("ALL"), makeKeyword("SINGLE-LITERAL"), makeKeyword("NONE"));
        $EQUALITY_REASONING_DOMAIN = makeKeyword("EQUALITY-REASONING-DOMAIN");
        $list101 = list(makeKeyword("ALL"), makeKeyword("ARG-TYPE"), makeKeyword("MINIMAL"), makeKeyword("NONE"));
        $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $int$100000 = makeInteger(100000);
        $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");
        $REMOVAL_ALLOWED_ = makeKeyword("REMOVAL-ALLOWED?");
        $TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $BACKWARD = makeKeyword("BACKWARD");
        $list108 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"));
        $DIRECTION = makeKeyword("DIRECTION");
        $list110 = list(makeKeyword("POSSIBLE"), makeKeyword("EXECUTED"), makeKeyword("DISCARDED"));
        $list111 = list(makeKeyword("REMOVAL"), makeKeyword("META-REMOVAL"), makeKeyword("TRANSFORMATION"), makeKeyword("REWRITE"), makeKeyword("STRUCTURAL"), makeKeyword("REMOVAL-CONJUNCTIVE"));
        $REMOVAL = makeKeyword("REMOVAL");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $STRUCTURAL = makeKeyword("STRUCTURAL");
        $REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
        $REWRITE = makeKeyword("REWRITE");
        $META_REMOVAL = makeKeyword("META-REMOVAL");
        $str118$HL_Module_of_unknown_type___s = makeString("HL-Module of unknown type: ~s");
        $list119 = list(makeKeyword("IMPOSSIBLE"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INCOMPLETE"), makeKeyword("COMPLETE"));
        $sym120$COMPLETENESS_P = makeSymbol("COMPLETENESS-P");
        $COMPLETE = makeKeyword("COMPLETE");
        $str122$Complete = makeString("Complete");
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $str124$Incomplete = makeString("Incomplete");
        $GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
        $str126$Grossly_Incomplete = makeString("Grossly Incomplete");
        $IMPOSSIBLE = makeKeyword("IMPOSSIBLE");
        $str128$Impossible = makeString("Impossible");
        $str129$Unexpected_completeness__a = makeString("Unexpected completeness ~a");
        $sym130$COMPLETENESS__ = makeSymbol("COMPLETENESS-<");
        $sym131$COMPLETENESS__ = makeSymbol("COMPLETENESS->");
        $list132 = list(cons(makeDouble(0.5), makeInteger(50)), cons(makeDouble(1.5), makeInteger(150)));
        $sym133$PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");
        $list134 = list(makeKeyword("PROVEN"), makeKeyword("REJECTED"));
        $list135 = list(new SubLObject[] { makeKeyword("CIRCULAR"), makeKeyword("ILL-FORMED"), makeKeyword("NON-ABDUCIBLE-RULE"), makeKeyword("REJECTED-SUBPROOF"), makeKeyword("MAX-PROOF-BUBBLING-DEPTH"), makeKeyword("INCONSISTENT-MT-ASSUMPTIONS"), makeKeyword("EXCEPTED-ASSERTION"),
                makeKeyword("ABNORMAL"), makeKeyword("PROBLEM-NO-GOOD"), makeKeyword("MODUS-TOLLENS-WITH-NON-WFF") });
        $list136 = list(makeKeyword("INDESTRUCTIBLE"), makeKeyword("DESTRUCTIBLE"), makeKeyword("UNKNOWN"));
        $sym137$DESTRUCTIBILITY_STATUS_P = makeSymbol("DESTRUCTIBILITY-STATUS-P");
        $INDESTRUCTIBLE = makeKeyword("INDESTRUCTIBLE");
        $str139$Indestructible = makeString("Indestructible");
        $DESTRUCTIBLE = makeKeyword("DESTRUCTIBLE");
        $str141$Destructible = makeString("Destructible");
        $UNKNOWN = makeKeyword("UNKNOWN");
        $str143$Unknown = makeString("Unknown");
        $str144$Unexpected_destructibility_status = makeString("Unexpected destructibility status ~s");
        $str145$I = makeString("I");
        $str146$ = makeString("");
        $str147$_ = makeString("?");
        $list148 = list(new SubLObject[] { cons(makeKeyword("NAME"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("COMMENT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("CONSTRUCTOR"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("DO-ONE-STEP"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("DONE?"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SELECT-BEST-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("EXECUTE-STRATEGEM"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("INITIAL-RELEVANT-STRATEGIES"), makeSymbol("DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES")), cons(makeKeyword("NEW-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("DEFAULT-STRATEGY-INITIALIZE-PROPERTIES")), cons(makeKeyword("UPDATE-PROPERTIES"), makeSymbol("DEFAULT-STRATEGY-UPDATE-PROPERTIES")),
                cons(makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED")), cons(makeKeyword("RECONSIDER-SET-ASIDES"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?")), cons(makeKeyword("QUIESCE"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("NEW-ARGUMENT-LINK"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PROBLEM-COULD-BE-PENDING"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?")), cons(makeKeyword("THROW-AWAY-PROBLEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SET-ASIDE-PROBLEM"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("THROW-AWAY-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SET-ASIDE-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-NEXT-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("MOTIVATE-STRATEGEM"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("ACTIVATE-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("LINK-HEAD-MOTIVATED?"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), makeSymbol("ZERO")),
                cons(makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("HAPPINESS-TABLE"), makeSymbol("NULL")) });
        $list149 = list(new SubLObject[] { cons(makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("POP-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NO-NEW-ROOTS"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("THROW-AWAY-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-REMOVAL-STRATEGEM"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("ACTIVATE-REMOVAL-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POP-REMOVAL-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("PEEK-TRANSFORMATION-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POP-TRANSFORMATION-STRATEGEM"), makeKeyword("MUST-OVERRIDE")),
                cons(makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeKeyword("MUST-OVERRIDE")) });
        $sym150$STRATEGY_TYPE_PROPERTY_P = makeSymbol("STRATEGY-TYPE-PROPERTY-P");
        $MUST_OVERRIDE = makeKeyword("MUST-OVERRIDE");
        $str152$Strategy_must_implement_method__s = makeString("Strategy must implement method ~s");
        $list153 = list(makeKeyword("ANSWER"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"), makeKeyword("BINDINGS-AND-SUPPORTS"), makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS"), makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS"));
        $BINDINGS = makeKeyword("BINDINGS");
        $TEMPLATE = makeKeyword("TEMPLATE");
        $FORMAT = makeKeyword("FORMAT");
        $RETURN = makeKeyword("RETURN");
        $list158 = list(makeKeyword("EL"), makeKeyword("HL"));
        $EL = makeKeyword("EL");
        $ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
        $list161 = list(makeKeyword("PROOF"), makeKeyword("BINDINGS"));
        $RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
        $list163 = list(makeKeyword("REQUIRE-EQUAL"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("COMPUTE-UNION"));
        $REQUIRE_EQUAL = makeKeyword("REQUIRE-EQUAL");
        $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $list166 = list(makeKeyword("NONE"), makeKeyword("FOCUSED"), makeKeyword("ALL"));
        $TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $MAINTAIN_TERM_WORKING_SET_ = makeKeyword("MAINTAIN-TERM-WORKING-SET?");
        $EVENTS = makeKeyword("EVENTS");
        $list170 = list(makeKeyword("NEW-ANSWER"), makeKeyword("STATUS-CHANGE"), makeKeyword("NEW-TRANSFORMATION-DEPTH-REACHED"), makeKeyword("SKSI-QUERY"));
        $HALT_CONDITIONS = makeKeyword("HALT-CONDITIONS");
        $list172 = list(makeKeyword("LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS"));
        $list173 = list(cons(makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC"), makeSymbol("NEW-SUM-ACCUMULATOR")), cons(makeKeyword("SKSI-QUERY-START-TIMES-ACC"), makeSymbol("NEW-LIST-ACCUMULATOR")), cons(makeKeyword("SPARQL-QUERY-PROFILE-ACC"), makeSymbol("NEW-LIST-ACCUMULATOR")));
        $sym174$INFERENCE_ACCUMULATOR_TYPE_P = makeSymbol("INFERENCE-ACCUMULATOR-TYPE-P");
        $FORGET_EXTRA_RESULTS_ = makeKeyword("FORGET-EXTRA-RESULTS?");
        $CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $BROWSABLE_ = makeKeyword("BROWSABLE?");
        $CONTINUABLE_ = makeKeyword("CONTINUABLE?");
        $BLOCK_ = makeKeyword("BLOCK?");
        $UNSPECIFIED = makeKeyword("UNSPECIFIED");
        $CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
        $NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");
        $sym183$INFERENCE_P = makeSymbol("INFERENCE-P");
    }

    public static class $query_static_property_p$UnaryFunction extends UnaryFunction {
        public $query_static_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QUERY-STATIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return query_static_property_p(arg1);
        }
    }

    public static class $query_dynamic_property_p$UnaryFunction extends UnaryFunction {
        public $query_dynamic_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QUERY-DYNAMIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return query_dynamic_property_p(arg1);
        }
    }

    public static class $inference_query_metric_p$UnaryFunction extends UnaryFunction {
        public $inference_query_metric_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-QUERY-METRIC-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_query_metric_p(arg1);
        }
    }

    public static class $inference_static_property_p$UnaryFunction extends UnaryFunction {
        public $inference_static_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-STATIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_static_property_p(arg1);
        }
    }

    public static class $inference_dynamic_property_p$UnaryFunction extends UnaryFunction {
        public $inference_dynamic_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-DYNAMIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_dynamic_property_p(arg1);
        }
    }

    public static class $strategy_static_property_p$UnaryFunction extends UnaryFunction {
        public $strategy_static_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGY-STATIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return strategy_static_property_p(arg1);
        }
    }

    public static class $strategy_dynamic_property_p$UnaryFunction extends UnaryFunction {
        public $strategy_dynamic_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGY-DYNAMIC-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return strategy_dynamic_property_p(arg1);
        }
    }

    public static class $problem_store_property_p$UnaryFunction extends UnaryFunction {
        public $problem_store_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-STORE-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return problem_store_property_p(arg1);
        }
    }

    /**
     * TODO Describe the purpose of this method.
     * @return
     */
    public static SubLObject balancing_tactician_enabledP() {
        // TODO Auto-generated method stub
        return null;
    }
}
/*
 *
 * Total time: 488 ms
 *
 */