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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_enumerated_types
    extends
      SubLTranslatedFile
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
  public static SubLObject query_property_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != query_static_property_p( v_object ) || NIL != query_dynamic_property_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2079L)
  public static SubLObject query_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym0$QUERY_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2175L)
  public static SubLObject all_query_properties()
  {
    return ConsesLow.nconc( all_query_static_properties(), all_query_dynamic_properties() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2402L)
  public static SubLObject merge_query_properties(SubLObject query_properties, final SubLObject overriding_query_properties)
  {
    if( NIL != overriding_query_properties )
    {
      query_properties = conses_high.copy_list( query_properties );
      SubLObject remainder;
      SubLObject property;
      SubLObject value;
      for( remainder = NIL, remainder = overriding_query_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        property = remainder.first();
        value = conses_high.cadr( remainder );
        query_properties = conses_high.putf( query_properties, property, value );
      }
    }
    return query_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2801L)
  public static SubLObject query_static_property_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_static_property_p( v_object ) || NIL != problem_store_static_property_p( v_object ) || NIL != strategy_static_property_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3011L)
  public static SubLObject query_static_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym4$QUERY_STATIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3121L)
  public static SubLObject extract_query_static_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym4$QUERY_STATIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3442L)
  public static SubLObject all_query_static_properties()
  {
    return ConsesLow.nconc( all_inference_static_properties(), all_problem_store_static_properties(), all_strategy_static_properties() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3701L)
  public static SubLObject query_static_or_meta_property_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != query_static_property_p( v_object ) || NIL != inference_meta_property_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3846L)
  public static SubLObject query_static_or_meta_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym5$QUERY_STATIC_OR_META_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3972L)
  public static SubLObject extract_query_static_or_meta_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym5$QUERY_STATIC_OR_META_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4112L)
  public static SubLObject query_dynamic_property_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_dynamic_property_p( v_object ) || NIL != problem_store_dynamic_property_p( v_object ) || NIL != strategy_dynamic_property_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4328L)
  public static SubLObject query_dynamic_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym6$QUERY_DYNAMIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4440L)
  public static SubLObject extract_query_dynamic_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym6$QUERY_DYNAMIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4566L)
  public static SubLObject all_query_dynamic_properties()
  {
    return ConsesLow.nconc( all_inference_dynamic_properties(), all_problem_store_dynamic_properties(), all_strategy_dynamic_properties() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5579L)
  public static SubLObject query_metric_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isKeyword() && ( NIL != list_utilities.member_eqP( v_object, $specially_handled_inference_metrics$.getGlobalValue() ) || NIL != list_utilities.member_eqP( v_object,
        $non_inference_query_metrics$.getGlobalValue() ) || NIL != inference_metrics.inference_metric_nameP( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5819L)
  public static SubLObject inference_query_metric_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != query_metric_p( v_object ) && NIL == subl_promotions.memberP( v_object, $non_inference_query_metrics$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5969L)
  public static SubLObject all_query_metrics()
  {
    return ConsesLow.append( inference_metrics.inference_metric_names(), $specially_handled_inference_metrics$.getGlobalValue(), $non_inference_query_metrics$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6377L)
  public static SubLObject arete_query_metric_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $arete_query_metrics$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6474L)
  public static SubLObject all_arete_query_metrics()
  {
    return conses_high.copy_list( $arete_query_metrics$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6940L)
  public static SubLObject removal_ask_query_metric_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $removal_ask_query_metrics$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 7049L)
  public static SubLObject inference_property_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_static_property_p( v_object ) || NIL != inference_dynamic_property_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 7245L)
  public static SubLObject inference_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym11$INFERENCE_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11745L)
  public static SubLObject inference_static_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_static_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11857L)
  public static SubLObject inference_static_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym13$INFERENCE_STATIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11975L)
  public static SubLObject extract_inference_static_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym13$INFERENCE_STATIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12107L)
  public static SubLObject all_inference_static_properties()
  {
    return conses_high.copy_list( $inference_static_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12289L)
  public static SubLObject inference_static_or_meta_property_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_static_property_p( v_object ) || NIL != inference_meta_property_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12442L)
  public static SubLObject inference_static_or_meta_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12576L)
  public static SubLObject extract_inference_static_or_meta_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12724L)
  public static SubLObject inference_properties_problem_store(final SubLObject v_properties)
  {
    final SubLObject raw_value = conses_high.getf( v_properties, $kw15$PROBLEM_STORE, NIL );
    if( NIL != subl_promotions.non_negative_integer_p( raw_value ) )
    {
      return inference_datastructures_problem_store.find_problem_store_by_id( raw_value );
    }
    return raw_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13047L)
  public static SubLObject inference_properties_allow_hl_predicate_transformationP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_, $inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13348L)
  public static SubLObject inference_properties_allow_unbound_predicate_transformationP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, $inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13668L)
  public static SubLObject inference_properties_allow_evaluatable_predicate_transformationP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, $inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14067L)
  public static SubLObject inference_properties_allow_indeterminate_resultsP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw19$ALLOW_INDETERMINATE_RESULTS_, $inference_allows_indeterminate_results_by_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14311L)
  public static SubLObject inference_properties_allowed_rules(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw21$ALLOWED_RULES, $default_allowed_rules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14498L)
  public static SubLObject inference_properties_forbidden_rules(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw23$FORBIDDEN_RULES, $default_forbidden_rules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14692L)
  public static SubLObject inference_properties_allowed_modules(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw24$ALLOWED_MODULES, $default_allowed_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14912L)
  public static SubLObject inference_properties_allow_abnormality_checkingP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw25$ALLOW_ABNORMALITY_CHECKING_, $inference_allows_abnormality_checking_by_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16132L)
  public static SubLObject inference_resource_constraint_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_resource_constraints$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16253L)
  public static SubLObject inference_resource_constraints_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym27$INFERENCE_RESOURCE_CONSTRAINT_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16378L)
  public static SubLObject extract_inference_resource_constraints(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym27$INFERENCE_RESOURCE_CONSTRAINT_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16566L)
  public static SubLObject inference_properties_max_number(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw28$MAX_NUMBER, $default_max_number$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16737L)
  public static SubLObject inference_properties_max_time(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw29$MAX_TIME, $default_max_time$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16902L)
  public static SubLObject inference_properties_max_step(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw30$MAX_STEP, $default_max_step$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17020L)
  public static SubLObject inference_properties_mode(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw31$INFERENCE_MODE, $default_inference_mode$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17199L)
  public static SubLObject inference_properties_forward_max_time(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw32$FORWARD_MAX_TIME, $default_forward_max_time$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17395L)
  public static SubLObject inference_properties_max_proof_depth(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw33$MAX_PROOF_DEPTH, $default_max_proof_depth$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17595L)
  public static SubLObject inference_properties_max_transformation_depth(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw34$MAX_TRANSFORMATION_DEPTH, $default_max_transformation_depth$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17817L)
  public static SubLObject inference_properties_min_rule_utility(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw36$MIN_RULE_UTILITY, $default_min_rule_utility$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 18023L)
  public static SubLObject inference_properties_probably_approximately_done(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw37$PROBABLY_APPROXIMATELY_DONE, $default_probably_approximately_done$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 21881L)
  public static SubLObject inference_dynamic_property_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_resource_constraint_p( v_object ) || NIL != list_utilities.member_eqP( v_object, $inference_other_dynamic_properties$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22053L)
  public static SubLObject inference_dynamic_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym39$INFERENCE_DYNAMIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22173L)
  public static SubLObject extract_inference_dynamic_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym39$INFERENCE_DYNAMIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22307L)
  public static SubLObject all_inference_dynamic_properties()
  {
    return ConsesLow.nconc( conses_high.copy_list( $inference_other_dynamic_properties$.getGlobalValue() ), conses_high.copy_list( $inference_resource_constraints$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22623L)
  public static SubLObject inference_properties_metrics(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw40$METRICS, $default_inference_metrics_template$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22757L)
  public static SubLObject strategy_property_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != strategy_static_property_p( v_object ) || NIL != strategy_dynamic_property_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22947L)
  public static SubLObject strategy_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym41$STRATEGY_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23644L)
  public static SubLObject strategy_static_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $strategy_static_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23754L)
  public static SubLObject strategy_static_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym43$STRATEGY_STATIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23870L)
  public static SubLObject extract_strategy_static_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym43$STRATEGY_STATIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24000L)
  public static SubLObject all_strategy_static_properties()
  {
    return conses_high.copy_list( $strategy_static_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24444L)
  public static SubLObject strategy_static_properties_removal_backtracking_productivity_limit(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw44$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, $default_removal_backtracking_productivity_limit$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24776L)
  public static SubLObject strategy_static_properties_proof_spec(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw46$PROOF_SPEC, $default_proof_spec$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25252L)
  public static SubLObject strategy_dynamic_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $strategy_dynamic_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25364L)
  public static SubLObject strategy_dynamic_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym48$STRATEGY_DYNAMIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25482L)
  public static SubLObject extract_strategy_dynamic_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym48$STRATEGY_DYNAMIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25614L)
  public static SubLObject all_strategy_dynamic_properties()
  {
    return conses_high.copy_list( $strategy_dynamic_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26244L)
  public static SubLObject strategy_dynamic_properties_productivity_limit(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw50$PRODUCTIVITY_LIMIT, $default_productivity_limit$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26399L)
  public static SubLObject problem_store_property_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != problem_store_static_property_p( v_object ) || NIL != problem_store_dynamic_property_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26621L)
  public static SubLObject problem_store_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym51$PROBLEM_STORE_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26733L)
  public static SubLObject all_problem_store_properties()
  {
    return ConsesLow.nconc( all_problem_store_static_properties(), all_problem_store_dynamic_properties() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26959L)
  public static SubLObject extract_problem_store_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym51$PROBLEM_STORE_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31706L)
  public static SubLObject problem_store_static_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $problem_store_static_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31864L)
  public static SubLObject problem_store_static_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym53$PROBLEM_STORE_STATIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31990L)
  public static SubLObject extract_problem_store_static_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym53$PROBLEM_STORE_STATIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32130L)
  public static SubLObject all_problem_store_static_properties()
  {
    return conses_high.copy_list( $problem_store_static_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32437L)
  public static SubLObject problem_store_dynamic_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $problem_store_dynamic_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32559L)
  public static SubLObject problem_store_dynamic_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym54$PROBLEM_STORE_DYNAMIC_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32687L)
  public static SubLObject all_problem_store_dynamic_properties()
  {
    return conses_high.copy_list( $problem_store_dynamic_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33434L)
  public static SubLObject inference_meta_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_meta_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33542L)
  public static SubLObject all_inference_meta_properties()
  {
    return conses_high.copy_list( $inference_meta_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33640L)
  public static SubLObject extract_inference_meta_properties(final SubLObject v_properties)
  {
    return list_utilities.filter_plist( v_properties, $sym56$INFERENCE_META_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33768L)
  public static SubLObject query_halt_reason_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_suspend_status_p( v_object ) || NIL != avoided_inference_reason_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 34111L)
  public static SubLObject exhausted_query_halt_reason_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != exhausted_inference_suspend_status_p( v_object ) || NIL != avoided_inference_reason_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35088L)
  public static SubLObject inference_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35270L)
  public static SubLObject continuable_inference_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $continuable_inference_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35616L)
  public static SubLObject avoided_inference_reason_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $avoided_inference_reasons$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 36822L)
  public static SubLObject inference_suspend_status_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.member_eqP( v_object, $inference_suspend_statuses$.getGlobalValue() ) || NIL != list_utilities.member_eqP( v_object, $inference_halt_conditions$.getGlobalValue() )
        || NIL != inference_error_suspend_status_p( v_object ) || NIL != inference_justification_status_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37085L)
  public static SubLObject inference_suspend_status_applicableP(final SubLObject status)
  {
    assert NIL != inference_status_p( status ) : status;
    return makeBoolean( status == $kw62$SUSPENDED || status == $kw63$TAUTOLOGY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37555L)
  public static SubLObject continuable_inference_suspend_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $continuable_inference_suspend_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38044L)
  public static SubLObject exhausted_inference_suspend_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $exhausted_inference_suspend_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38174L)
  public static SubLObject inference_error_suspend_status_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.doubletonP( v_object ) && $kw66$ERROR == v_object.first() && conses_high.second( v_object ).isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38463L)
  public static SubLObject new_inference_error_suspend_status(final SubLObject message)
  {
    assert NIL != Types.stringp( message ) : message;
    return ConsesLow.list( $kw66$ERROR, message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38589L)
  public static SubLObject inference_error_suspend_status_message(final SubLObject error_status)
  {
    return conses_high.second( error_status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38710L)
  public static SubLObject inference_justification_status_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isList() && $kw68$JUSTIFICATION == v_object.first() && NIL != arguments.hl_justification_list_p( v_object.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39084L)
  public static SubLObject new_inference_justification_status(final SubLObject message)
  {
    assert NIL != arguments.hl_justification_list_p( message ) : message;
    return ConsesLow.cons( $kw68$JUSTIFICATION, message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39234L)
  public static SubLObject inference_justification_status_message(final SubLObject justification_status)
  {
    return justification_status.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39764L)
  public static SubLObject tactical_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $tactical_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 40046L)
  public static SubLObject provability_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $provability_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42347L)
  public static SubLObject tactical_status_weakerP(final SubLObject status1, final SubLObject status2)
  {
    return list_utilities.position_L( status1, status2, $ordered_tactical_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42535L)
  public static SubLObject tactical_status_strongerP(final SubLObject status1, final SubLObject status2)
  {
    return tactical_status_weakerP( status2, status1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42902L)
  public static SubLObject tactical_status_unionP(final SubLObject status1, final SubLObject status2)
  {
    return list_utilities.position_L( status1, status2, $union_ordered_tactical_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43144L)
  public static SubLObject problem_status_p(final SubLObject v_object)
  {
    SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( v_object.eql( triple.first() ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43357L)
  public static SubLObject problem_status_from_tactical_status_and_provability_status(final SubLObject tactical_status, final SubLObject provability_status)
  {
    SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( tactical_status.eql( conses_high.second( triple ) ) && provability_status.eql( conses_high.third( triple ) ) )
      {
        return triple.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    Errors.error( $str75$No_match_to_combine__s_and__s, tactical_status, provability_status );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43719L)
  public static SubLObject tactical_status_from_problem_status(final SubLObject status)
  {
    SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( status.eql( triple.first() ) )
      {
        return conses_high.second( triple );
      }
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44007L)
  public static SubLObject provability_status_from_problem_status(final SubLObject status)
  {
    SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( status.eql( triple.first() ) )
      {
        return conses_high.third( triple );
      }
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44308L)
  public static SubLObject good_problem_status_p(final SubLObject status)
  {
    return Equality.eq( $kw76$GOOD, provability_status_from_problem_status( status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44472L)
  public static SubLObject no_good_problem_status_p(final SubLObject status)
  {
    return Equality.eq( $kw77$NO_GOOD, provability_status_from_problem_status( status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44596L)
  public static SubLObject neutral_problem_status_p(final SubLObject status)
  {
    return Equality.eq( $kw78$NEUTRAL, provability_status_from_problem_status( status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44720L)
  public static SubLObject unexamined_problem_status_p(final SubLObject status)
  {
    return Equality.eq( $kw79$UNEXAMINED, tactical_status_from_problem_status( status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44848L)
  public static SubLObject examined_problem_status_p(final SubLObject status)
  {
    return Equality.eq( $kw80$EXAMINED, tactical_status_from_problem_status( status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44971L)
  public static SubLObject possible_problem_status_p(final SubLObject status)
  {
    return Equality.eq( $kw81$POSSIBLE, tactical_status_from_problem_status( status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45094L)
  public static SubLObject pending_problem_status_p(final SubLObject status)
  {
    return Equality.eq( $kw82$PENDING, tactical_status_from_problem_status( status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45215L)
  public static SubLObject finished_problem_status_p(final SubLObject status)
  {
    return Equality.eq( $kw83$FINISHED, tactical_status_from_problem_status( status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45546L)
  public static SubLObject problem_store_properties_add_restriction_layer_of_indirectionP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45898L)
  public static SubLObject problem_store_properties_negation_by_failureP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw85$NEGATION_BY_FAILURE_, $negation_by_failure_by_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46059L)
  public static SubLObject problem_store_properties_completeness_minimization_allowedP(final SubLObject v_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.getf( v_properties, $kw86$COMPLETENESS_MINIMIZATION_ALLOWED_, control_vars.$complete_extent_minimization$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46652L)
  public static SubLObject problem_store_properties_evaluate_subl_allowedP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw87$EVALUATE_SUBL_ALLOWED_, $evaluate_subl_allowed_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46990L)
  public static SubLObject problem_store_properties_rewrite_allowedP(final SubLObject v_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.getf( v_properties, $kw88$REWRITE_ALLOWED_, $rewrite_allowed_defaultP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47262L)
  public static SubLObject problem_store_properties_abduction_allowedP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw89$ABDUCTION_ALLOWED_, $abduction_allowed_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47540L)
  public static SubLObject problem_store_properties_new_terms_allowedP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw90$NEW_TERMS_ALLOWED_, $new_terms_allowed_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47867L)
  public static SubLObject problem_store_properties_compute_answer_justificationsP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw91$COMPUTE_ANSWER_JUSTIFICATIONS_, $compute_answer_justifications_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48454L)
  public static SubLObject all_inference_modes()
  {
    return conses_high.copy_list( $inference_modes$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48535L)
  public static SubLObject inference_mode_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_modes$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48997L)
  public static SubLObject problem_link_type_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $problem_link_types$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49214L)
  public static SubLObject problem_store_name_p(final SubLObject v_object)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49289L)
  public static SubLObject problem_store_properties_name(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw95$PROBLEM_STORE_NAME, $default_problem_store_name$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49902L)
  public static SubLObject problem_store_equality_reasoning_method_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $problem_store_equality_reasoning_methods$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50041L)
  public static SubLObject problem_store_properties_equality_reasoning_method(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw98$EQUALITY_REASONING_METHOD, $default_equality_reasoning_method$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50726L)
  public static SubLObject problem_store_equality_reasoning_domain_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $problem_store_equality_reasoning_domains$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50865L)
  public static SubLObject problem_store_properties_equality_reasoning_domain(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw100$EQUALITY_REASONING_DOMAIN, $default_equality_reasoning_domain$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51720L)
  public static SubLObject intermediate_step_validation_level_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $intermediate_step_validation_levels$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51849L)
  public static SubLObject problem_store_properties_intermediate_step_validation_level(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw102$INTERMEDIATE_STEP_VALIDATION_LEVEL, $default_intermediate_step_validation_level$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52130L)
  public static SubLObject max_problem_count_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != number_utilities.positive_infinity_p( v_object ) || NIL != subl_promotions.non_negative_integer_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52256L)
  public static SubLObject problem_store_properties_max_problem_count(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw104$MAX_PROBLEM_COUNT, $default_max_problem_count$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52480L)
  public static SubLObject removal_allowed_by_propertiesP(final SubLObject problem_store_properties)
  {
    return conses_high.getf( problem_store_properties, $kw105$REMOVAL_ALLOWED_, $removal_allowed_by_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52735L)
  public static SubLObject transformation_allowed_by_propertiesP(final SubLObject problem_store_properties)
  {
    return conses_high.getf( problem_store_properties, $kw106$TRANSFORMATION_ALLOWED_, $transformation_allowed_by_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53281L)
  public static SubLObject inference_direction_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_directions$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53380L)
  public static SubLObject problem_store_properties_direction(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw109$DIRECTION, $default_problem_store_inference_direction$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53717L)
  public static SubLObject tactic_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $tactic_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54136L)
  public static SubLObject tactic_type_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $tactic_types$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54219L)
  public static SubLObject tactic_type_from_hl_module(final SubLObject hl_module)
  {
    if( NIL != inference_modules.removal_module_p( hl_module ) )
    {
      return $kw112$REMOVAL;
    }
    if( NIL != inference_modules.transformation_module_p( hl_module ) )
    {
      return $kw113$TRANSFORMATION;
    }
    if( NIL != inference_modules.structural_module_p( hl_module ) )
    {
      return $kw114$STRUCTURAL;
    }
    if( NIL != inference_modules.meta_structural_module_p( hl_module ) )
    {
      return $kw114$STRUCTURAL;
    }
    if( NIL != inference_modules.conjunctive_removal_module_p( hl_module ) )
    {
      return $kw115$REMOVAL_CONJUNCTIVE;
    }
    if( NIL != inference_modules.rewrite_module_p( hl_module ) )
    {
      return $kw116$REWRITE;
    }
    if( NIL != inference_modules.meta_removal_module_p( hl_module ) )
    {
      return $kw117$META_REMOVAL;
    }
    if( NIL != inference_modules.meta_transformation_module_p( hl_module ) )
    {
      return $kw113$TRANSFORMATION;
    }
    Errors.error( $str118$HL_Module_of_unknown_type___s, hl_module );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55234L)
  public static SubLObject completeness_string(final SubLObject completeness)
  {
    assert NIL != completeness_p( completeness ) : completeness;
    if( completeness.eql( $kw121$COMPLETE ) )
    {
      return $str122$Complete;
    }
    if( completeness.eql( $kw123$INCOMPLETE ) )
    {
      return $str124$Incomplete;
    }
    if( completeness.eql( $kw125$GROSSLY_INCOMPLETE ) )
    {
      return $str126$Grossly_Incomplete;
    }
    if( completeness.eql( $kw127$IMPOSSIBLE ) )
    {
      return $str128$Impossible;
    }
    Errors.error( $str129$Unexpected_completeness__a, completeness );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55616L)
  public static SubLObject completeness_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $ordered_completenesses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55710L)
  public static SubLObject impossible_completeness_p(final SubLObject v_object)
  {
    return Equality.eq( $kw127$IMPOSSIBLE, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55794L)
  public static SubLObject completeness_L(final SubLObject completeness1, final SubLObject completeness2)
  {
    assert NIL != completeness_p( completeness1 ) : completeness1;
    assert NIL != completeness_p( completeness2 ) : completeness2;
    return list_utilities.position_L( completeness1, completeness2, $ordered_completenesses$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56099L)
  public static SubLObject completeness_G(final SubLObject completeness1, final SubLObject completeness2)
  {
    return completeness_L( completeness2, completeness1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56294L)
  public static SubLObject min_completeness(final SubLObject completeness_list)
  {
    return ( NIL != completeness_list ) ? list_utilities.extremal( completeness_list, $sym130$COMPLETENESS__, UNPROVIDED ) : conses_high.last( $ordered_completenesses$.getGlobalValue(), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56475L)
  public static SubLObject min2_completeness(final SubLObject completeness1, final SubLObject completeness2)
  {
    return ( NIL != completeness_L( completeness2, completeness1 ) ) ? completeness2 : completeness1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56627L)
  public static SubLObject max_completeness(final SubLObject completeness_list)
  {
    return ( NIL != completeness_list ) ? list_utilities.extremal( completeness_list, $sym131$COMPLETENESS__, UNPROVIDED ) : $ordered_completenesses$.getGlobalValue().first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56801L)
  public static SubLObject max2_completeness(final SubLObject completeness1, final SubLObject completeness2)
  {
    return ( NIL != completeness_L( completeness2, completeness1 ) ) ? completeness1 : completeness2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56953L)
  public static SubLObject productivity_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != number_utilities.positive_infinity_p( v_object ) || NIL != subl_promotions.non_negative_integer_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57123L)
  public static SubLObject infinite_productivity_p(final SubLObject v_object)
  {
    return number_utilities.positive_infinity_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57330L)
  public static SubLObject productivity_for_number_of_children(final SubLObject number_of_children)
  {
    if( number_of_children.isInteger() )
    {
      return Numbers.multiply( $int49$100, number_of_children );
    }
    SubLObject productivity = list_utilities.alist_lookup_without_values( $productivity_to_number_table$.getGlobalValue(), number_of_children, UNPROVIDED, UNPROVIDED );
    if( NIL == productivity )
    {
      productivity = Numbers.truncate( Numbers.multiply( $int49$100, number_of_children ), UNPROVIDED );
    }
    return productivity;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57843L)
  public static SubLObject number_of_children_for_productivity(final SubLObject productivity)
  {
    return Numbers.integerDivide( productivity, $int49$100 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58063L)
  public static SubLObject cost_for_productivity(final SubLObject productivity)
  {
    return Numbers.divide( productivity, $int49$100 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58258L)
  public static SubLObject removal_cost_cutoff_for_productivity(final SubLObject productivity)
  {
    assert NIL != productivity_p( productivity ) : productivity;
    if( NIL != number_utilities.positive_infinity_p( productivity ) )
    {
      return NIL;
    }
    return cost_for_productivity( productivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58483L)
  public static SubLObject productivity_E(final SubLObject productivity1, final SubLObject productivity2)
  {
    return number_utilities.potentially_infinite_integer_E( productivity1, productivity2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58615L)
  public static SubLObject productivity_L(final SubLObject productivity1, final SubLObject productivity2)
  {
    assert NIL != productivity_p( productivity1 ) : productivity1;
    assert NIL != productivity_p( productivity2 ) : productivity2;
    return number_utilities.potentially_infinite_integer_L( productivity1, productivity2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58834L)
  public static SubLObject productivity_LE(final SubLObject productivity1, final SubLObject productivity2)
  {
    return number_utilities.potentially_infinite_integer_LE( productivity1, productivity2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58967L)
  public static SubLObject productivity_G(final SubLObject productivity1, final SubLObject productivity2)
  {
    return number_utilities.potentially_infinite_integer_G( productivity1, productivity2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59098L)
  public static SubLObject productivity_GE(final SubLObject productivity1, final SubLObject productivity2)
  {
    return number_utilities.potentially_infinite_integer_GE( productivity1, productivity2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59231L)
  public static SubLObject productivity_X(final SubLObject productivity1, final SubLObject productivity2)
  {
    return number_utilities.potentially_infinite_integer_plus( productivity1, productivity2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59365L)
  public static SubLObject productivity_max(final SubLObject productivity1, final SubLObject productivity2)
  {
    return ( NIL != productivity_L( productivity1, productivity2 ) ) ? productivity2 : productivity1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59516L)
  public static SubLObject productivity_sum(final SubLObject productivities)
  {
    SubLObject total_productivity = ZERO_INTEGER;
    SubLObject cdolist_list_var = productivities;
    SubLObject productivity = NIL;
    productivity = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      total_productivity = productivity_X( total_productivity, productivity );
      cdolist_list_var = cdolist_list_var.rest();
      productivity = cdolist_list_var.first();
    }
    return total_productivity;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59756L)
  public static SubLObject productivity_times_number(final SubLObject productivity, final SubLObject number)
  {
    return number_utilities.potentially_infinite_integer_times_number_rounded( productivity, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59901L)
  public static SubLObject productivity_divide_number(final SubLObject productivity, final SubLObject number)
  {
    return number_utilities.potentially_infinite_integer_divided_by_number_rounded( productivity, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60052L)
  public static SubLObject decrement_productivity_for_number_of_children(final SubLObject productivity, SubLObject number)
  {
    if( number == UNPROVIDED )
    {
      number = ONE_INTEGER;
    }
    return productivity_for_number_of_children( Numbers.subtract( number_of_children_for_productivity( productivity ), number ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60425L)
  public static SubLObject proof_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $proof_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 60930L)
  public static SubLObject proof_reject_reason_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != arguments.hl_justification_p( v_object ) || NIL != list_utilities.member_eqP( v_object, $proof_reject_reasons$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61300L)
  public static SubLObject destructibility_status_string(final SubLObject destructibility_status)
  {
    assert NIL != destructibility_status_p( destructibility_status ) : destructibility_status;
    if( destructibility_status.eql( $kw138$INDESTRUCTIBLE ) )
    {
      return $str139$Indestructible;
    }
    if( destructibility_status.eql( $kw140$DESTRUCTIBLE ) )
    {
      return $str141$Destructible;
    }
    if( destructibility_status.eql( $kw142$UNKNOWN ) )
    {
      return $str143$Unknown;
    }
    Errors.error( $str144$Unexpected_destructibility_status, destructibility_status );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61686L)
  public static SubLObject destructibility_status_hint(final SubLObject destructibility_status)
  {
    assert NIL != destructibility_status_p( destructibility_status ) : destructibility_status;
    if( destructibility_status.eql( $kw138$INDESTRUCTIBLE ) )
    {
      return $str145$I;
    }
    if( destructibility_status.eql( $kw140$DESTRUCTIBLE ) )
    {
      return $str146$;
    }
    if( destructibility_status.eql( $kw142$UNKNOWN ) )
    {
      return $str147$_;
    }
    Errors.error( $str144$Unexpected_destructibility_status, destructibility_status );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 62054L)
  public static SubLObject destructibility_status_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $destructibility_statuses$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 62161L)
  public static SubLObject destructibility_status_destructibleP(final SubLObject destructibility_status)
  {
    assert NIL != destructibility_status_p( destructibility_status ) : destructibility_status;
    return Equality.eq( $kw140$DESTRUCTIBLE, destructibility_status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 67955L)
  public static SubLObject strategy_type_property_p(final SubLObject v_object)
  {
    return list_utilities.alist_has_keyP( $strategy_type_properties$.getGlobalValue(), v_object, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68229L)
  public static SubLObject strategy_default_method_handler(final SubLObject method)
  {
    assert NIL != strategy_type_property_p( method ) : method;
    final SubLObject handler = list_utilities.alist_lookup_without_values( $strategy_type_properties$.getGlobalValue(), method, UNPROVIDED, UNPROVIDED );
    if( $kw151$MUST_OVERRIDE == handler )
    {
      return Errors.error( $str152$Strategy_must_implement_method__s, method );
    }
    return handler;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69077L)
  public static SubLObject inference_simple_return_type_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_return_types$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69190L)
  public static SubLObject inference_properties_has_simple_return_typeP(final SubLObject query_properties)
  {
    return inference_simple_return_type_p( inference_properties_return_type( query_properties ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69367L)
  public static SubLObject inference_template_return_type_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && $kw155$TEMPLATE == v_object.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69495L)
  public static SubLObject inference_format_return_type_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && $kw156$FORMAT == v_object.first() && NIL != list_utilities.lengthGE( v_object, TWO_INTEGER, UNPROVIDED ) && conses_high.second( v_object )
        .isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69685L)
  public static SubLObject inference_return_type_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_simple_return_type_p( v_object ) || NIL != inference_template_return_type_p( v_object ) || NIL != inference_format_return_type_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69885L)
  public static SubLObject inference_properties_return_type(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw157$RETURN, $inference_default_return_type$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70257L)
  public static SubLObject inference_answer_language_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_answer_languages$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70368L)
  public static SubLObject inference_properties_answer_language(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw160$ANSWER_LANGUAGE, $inference_default_answer_language$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70904L)
  public static SubLObject result_uniqueness_criterion_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $result_uniqueness_criteria$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71017L)
  public static SubLObject inference_properties_uniqueness_criterion(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw162$RESULT_UNIQUENESS, $default_result_uniqueness_criterion$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71800L)
  public static SubLObject inference_disjunction_free_el_vars_policy_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_disjunction_free_el_vars_policies$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71944L)
  public static SubLObject inference_properties_disjunction_free_el_vars_policy(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw165$DISJUNCTION_FREE_EL_VARS_POLICY, $default_inference_disjunction_free_el_vars_policy$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72662L)
  public static SubLObject inference_transitive_closure_mode_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_transitive_closure_modes$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72792L)
  public static SubLObject inference_properties_transitive_closure_mode(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw167$TRANSITIVE_CLOSURE_MODE, $inference_transitive_closure_mode_default$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73121L)
  public static SubLObject inference_properties_maintain_term_working_setP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw168$MAINTAIN_TERM_WORKING_SET_, $maintain_term_working_set_defaultP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73379L)
  public static SubLObject inference_properties_events(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw169$EVENTS, $inference_events_default$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74125L)
  public static SubLObject inference_event_type_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_event_types$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74375L)
  public static SubLObject inference_properties_halt_conditions(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw171$HALT_CONDITIONS, $inference_halt_conditions_default$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74806L)
  public static SubLObject inference_halt_condition_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_halt_conditions$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75330L)
  public static SubLObject inference_accumulator_type_p(final SubLObject v_object)
  {
    return list_utilities.alist_has_keyP( $inference_accumulator_types$.getGlobalValue(), v_object, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75447L)
  public static SubLObject initialize_inference_accumulator(final SubLObject accumulator_type)
  {
    assert NIL != inference_accumulator_type_p( accumulator_type ) : accumulator_type;
    final SubLObject initialization_fn = list_utilities.alist_lookup_without_values( $inference_accumulator_types$.getGlobalValue(), accumulator_type, UNPROVIDED, UNPROVIDED );
    return Functions.funcall( initialization_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76100L)
  public static SubLObject inference_properties_forget_extra_resultsP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw175$FORGET_EXTRA_RESULTS_, $inference_default_forget_extra_resultsP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76448L)
  public static SubLObject inference_properties_cache_inference_resultsP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw176$CACHE_INFERENCE_RESULTS_, $inference_default_cache_inference_resultsP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76784L)
  public static SubLObject inference_properties_browsableP(final SubLObject v_properties)
  {
    return makeBoolean( NIL != conses_high.getf( v_properties, $kw177$BROWSABLE_, $inference_default_browsableP$.getGlobalValue() ) || NIL != inference_properties_continuableP( v_properties ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77179L)
  public static SubLObject inference_properties_continuableP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw178$CONTINUABLE_, $inference_default_continuableP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77319L)
  public static SubLObject inference_properties_blockP(final SubLObject v_properties)
  {
    return conses_high.getf( v_properties, $kw179$BLOCK_, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77429L)
  public static SubLObject inference_query_property_lookup(final SubLObject query_properties, final SubLObject property)
  {
    final SubLObject value = conses_high.getf( query_properties, property, $kw180$UNSPECIFIED );
    if( $kw180$UNSPECIFIED == value )
    {
      return inference_engine_default_for_property( property );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 77864L)
  public static SubLObject inference_engine_default_for_property(final SubLObject query_property)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != query_property_p( query_property ) : query_property;
    SubLObject value = NIL;
    SubLObject specified = NIL;
    if( query_property.eql( $kw165$DISJUNCTION_FREE_EL_VARS_POLICY ) )
    {
      value = $default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw162$RESULT_UNIQUENESS ) )
    {
      value = $default_result_uniqueness_criterion$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw15$PROBLEM_STORE ) )
    {
      value = NIL;
      specified = NIL;
    }
    else if( query_property.eql( $kw181$CONDITIONAL_SENTENCE_ ) )
    {
      value = NIL;
      specified = T;
    }
    else if( query_property.eql( $kw182$NON_EXPLANATORY_SENTENCE ) )
    {
      value = NIL;
      specified = T;
    }
    else if( query_property.eql( $kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_ ) )
    {
      value = $inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ ) )
    {
      value = $inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ ) )
    {
      value = $inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw19$ALLOW_INDETERMINATE_RESULTS_ ) )
    {
      value = $inference_allows_indeterminate_results_by_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw21$ALLOWED_RULES ) )
    {
      value = $default_allowed_rules$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw24$ALLOWED_MODULES ) )
    {
      value = $default_allowed_modules$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw23$FORBIDDEN_RULES ) )
    {
      value = $default_forbidden_rules$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw25$ALLOW_ABNORMALITY_CHECKING_ ) )
    {
      value = $inference_allows_abnormality_checking_by_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw167$TRANSITIVE_CLOSURE_MODE ) )
    {
      value = $inference_transitive_closure_mode_default$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw28$MAX_NUMBER ) )
    {
      value = $default_max_number$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw29$MAX_TIME ) )
    {
      value = $default_max_time$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw30$MAX_STEP ) )
    {
      value = $default_max_step$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw32$FORWARD_MAX_TIME ) )
    {
      value = $default_forward_max_time$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw33$MAX_PROOF_DEPTH ) )
    {
      value = $default_max_proof_depth$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw34$MAX_TRANSFORMATION_DEPTH ) )
    {
      value = $default_max_transformation_depth$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw36$MIN_RULE_UTILITY ) )
    {
      value = $default_min_rule_utility$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw37$PROBABLY_APPROXIMATELY_DONE ) )
    {
      value = $default_probably_approximately_done$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw157$RETURN ) )
    {
      value = $inference_default_return_type$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw40$METRICS ) )
    {
      value = $default_inference_metrics_template$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw160$ANSWER_LANGUAGE ) )
    {
      value = $inference_default_answer_language$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw176$CACHE_INFERENCE_RESULTS_ ) )
    {
      value = $inference_default_cache_inference_resultsP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw175$FORGET_EXTRA_RESULTS_ ) )
    {
      value = $inference_default_forget_extra_resultsP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw177$BROWSABLE_ ) )
    {
      value = $inference_default_browsableP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw178$CONTINUABLE_ ) )
    {
      value = $inference_default_continuableP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw179$BLOCK_ ) )
    {
      value = NIL;
      specified = T;
    }
    else if( query_property.eql( $kw98$EQUALITY_REASONING_METHOD ) )
    {
      value = $default_equality_reasoning_method$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw100$EQUALITY_REASONING_DOMAIN ) )
    {
      value = $default_equality_reasoning_domain$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw102$INTERMEDIATE_STEP_VALIDATION_LEVEL ) )
    {
      value = $default_intermediate_step_validation_level$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw104$MAX_PROBLEM_COUNT ) )
    {
      value = $default_max_problem_count$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw105$REMOVAL_ALLOWED_ ) )
    {
      value = $removal_allowed_by_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw106$TRANSFORMATION_ALLOWED_ ) )
    {
      value = $transformation_allowed_by_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ ) )
    {
      value = $add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw85$NEGATION_BY_FAILURE_ ) )
    {
      value = $negation_by_failure_by_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw86$COMPLETENESS_MINIMIZATION_ALLOWED_ ) )
    {
      value = control_vars.$complete_extent_minimization$.getDynamicValue( thread );
      specified = T;
    }
    else if( query_property.eql( $kw109$DIRECTION ) )
    {
      value = $default_problem_store_inference_direction$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw87$EVALUATE_SUBL_ALLOWED_ ) )
    {
      value = $evaluate_subl_allowed_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw88$REWRITE_ALLOWED_ ) )
    {
      value = $rewrite_allowed_defaultP$.getDynamicValue( thread );
      specified = T;
    }
    else if( query_property.eql( $kw89$ABDUCTION_ALLOWED_ ) )
    {
      value = $abduction_allowed_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw90$NEW_TERMS_ALLOWED_ ) )
    {
      value = $new_terms_allowed_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw31$INFERENCE_MODE ) )
    {
      value = $default_inference_mode$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw168$MAINTAIN_TERM_WORKING_SET_ ) )
    {
      value = $maintain_term_working_set_defaultP$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw169$EVENTS ) )
    {
      value = $inference_events_default$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw171$HALT_CONDITIONS ) )
    {
      value = $inference_halt_conditions_default$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw95$PROBLEM_STORE_NAME ) )
    {
      value = $default_problem_store_name$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw50$PRODUCTIVITY_LIMIT ) )
    {
      value = $default_productivity_limit$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw44$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT ) )
    {
      value = $default_removal_backtracking_productivity_limit$.getGlobalValue();
      specified = T;
    }
    else if( query_property.eql( $kw46$PROOF_SPEC ) )
    {
      value = $default_proof_spec$.getGlobalValue();
      specified = T;
    }
    else
    {
      value = $kw142$UNKNOWN;
      specified = NIL;
    }
    return subl_promotions.values2( value, specified );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 83591L)
  public static SubLObject query_property_is_defaultP(final SubLObject property, final SubLObject value)
  {
    return Equality.equal( value, inference_engine_default_for_property( property ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 83723L)
  public static SubLObject inference_input_non_default_query_properties(final SubLObject inference)
  {
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject query_properties = inference_datastructures_inference.inference_input_query_properties( inference );
    SubLObject non_default_query_properties = NIL;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    SubLObject v_default;
    for( remainder = NIL, remainder = query_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      v_default = inference_engine_default_for_property( property );
      if( !v_default.equal( value ) )
      {
        non_default_query_properties = conses_high.putf( non_default_query_properties, property, value );
      }
    }
    return non_default_query_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 84482L)
  public static SubLObject all_default_query_properties()
  {
    SubLObject v_properties = NIL;
    SubLObject cdolist_list_var = all_query_properties();
    SubLObject property = NIL;
    property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject value = inference_engine_default_for_property( property );
      v_properties = ConsesLow.cons( property, v_properties );
      v_properties = ConsesLow.cons( value, v_properties );
      cdolist_list_var = cdolist_list_var.rest();
      property = cdolist_list_var.first();
    }
    return Sequences.nreverse( v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 84768L)
  public static SubLObject explicify_default_query_properties(final SubLObject query_properties)
  {
    return list_utilities.nmerge_plist( all_default_query_properties(), query_properties );
  }

  public static SubLObject declare_inference_datastructures_enumerated_types_file()
  {
    SubLFiles.declareFunction( me, "query_property_p", "QUERY-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "query_properties_p", "QUERY-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_query_properties", "ALL-QUERY-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "merge_query_properties", "MERGE-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "query_static_property_p", "QUERY-STATIC-PROPERTY-P", 1, 0, false );
    new $query_static_property_p$UnaryFunction();
    SubLFiles.declareFunction( me, "query_static_properties_p", "QUERY-STATIC-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_query_static_properties", "EXTRACT-QUERY-STATIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_query_static_properties", "ALL-QUERY-STATIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "query_static_or_meta_property_p", "QUERY-STATIC-OR-META-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "query_static_or_meta_properties_p", "QUERY-STATIC-OR-META-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_query_static_or_meta_properties", "EXTRACT-QUERY-STATIC-OR-META-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "query_dynamic_property_p", "QUERY-DYNAMIC-PROPERTY-P", 1, 0, false );
    new $query_dynamic_property_p$UnaryFunction();
    SubLFiles.declareFunction( me, "query_dynamic_properties_p", "QUERY-DYNAMIC-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_query_dynamic_properties", "EXTRACT-QUERY-DYNAMIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_query_dynamic_properties", "ALL-QUERY-DYNAMIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "query_metric_p", "QUERY-METRIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_query_metric_p", "INFERENCE-QUERY-METRIC-P", 1, 0, false );
    new $inference_query_metric_p$UnaryFunction();
    SubLFiles.declareFunction( me, "all_query_metrics", "ALL-QUERY-METRICS", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_query_metric_p", "ARETE-QUERY-METRIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_arete_query_metrics", "ALL-ARETE-QUERY-METRICS", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_ask_query_metric_p", "REMOVAL-ASK-QUERY-METRIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_property_p", "INFERENCE-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_p", "INFERENCE-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_static_property_p", "INFERENCE-STATIC-PROPERTY-P", 1, 0, false );
    new $inference_static_property_p$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_static_properties_p", "INFERENCE-STATIC-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_inference_static_properties", "EXTRACT-INFERENCE-STATIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_inference_static_properties", "ALL-INFERENCE-STATIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_static_or_meta_property_p", "INFERENCE-STATIC-OR-META-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_static_or_meta_properties_p", "INFERENCE-STATIC-OR-META-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_inference_static_or_meta_properties", "EXTRACT-INFERENCE-STATIC-OR-META-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_problem_store", "INFERENCE-PROPERTIES-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_allow_hl_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_allow_unbound_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_allow_evaluatable_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_allow_indeterminate_resultsP", "INFERENCE-PROPERTIES-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_allowed_rules", "INFERENCE-PROPERTIES-ALLOWED-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_forbidden_rules", "INFERENCE-PROPERTIES-FORBIDDEN-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_allowed_modules", "INFERENCE-PROPERTIES-ALLOWED-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_allow_abnormality_checkingP", "INFERENCE-PROPERTIES-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_resource_constraint_p", "INFERENCE-RESOURCE-CONSTRAINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_resource_constraints_p", "INFERENCE-RESOURCE-CONSTRAINTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_inference_resource_constraints", "EXTRACT-INFERENCE-RESOURCE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_max_number", "INFERENCE-PROPERTIES-MAX-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_max_time", "INFERENCE-PROPERTIES-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_max_step", "INFERENCE-PROPERTIES-MAX-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_mode", "INFERENCE-PROPERTIES-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_forward_max_time", "INFERENCE-PROPERTIES-FORWARD-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_max_proof_depth", "INFERENCE-PROPERTIES-MAX-PROOF-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_max_transformation_depth", "INFERENCE-PROPERTIES-MAX-TRANSFORMATION-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_min_rule_utility", "INFERENCE-PROPERTIES-MIN-RULE-UTILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_probably_approximately_done", "INFERENCE-PROPERTIES-PROBABLY-APPROXIMATELY-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_dynamic_property_p", "INFERENCE-DYNAMIC-PROPERTY-P", 1, 0, false );
    new $inference_dynamic_property_p$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_dynamic_properties_p", "INFERENCE-DYNAMIC-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_inference_dynamic_properties", "EXTRACT-INFERENCE-DYNAMIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_inference_dynamic_properties", "ALL-INFERENCE-DYNAMIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_metrics", "INFERENCE-PROPERTIES-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_property_p", "STRATEGY-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_properties_p", "STRATEGY-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_static_property_p", "STRATEGY-STATIC-PROPERTY-P", 1, 0, false );
    new $strategy_static_property_p$UnaryFunction();
    SubLFiles.declareFunction( me, "strategy_static_properties_p", "STRATEGY-STATIC-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_strategy_static_properties", "EXTRACT-STRATEGY-STATIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_strategy_static_properties", "ALL-STRATEGY-STATIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "strategy_static_properties_removal_backtracking_productivity_limit", "STRATEGY-STATIC-PROPERTIES-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_static_properties_proof_spec", "STRATEGY-STATIC-PROPERTIES-PROOF-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_dynamic_property_p", "STRATEGY-DYNAMIC-PROPERTY-P", 1, 0, false );
    new $strategy_dynamic_property_p$UnaryFunction();
    SubLFiles.declareFunction( me, "strategy_dynamic_properties_p", "STRATEGY-DYNAMIC-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_strategy_dynamic_properties", "EXTRACT-STRATEGY-DYNAMIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_strategy_dynamic_properties", "ALL-STRATEGY-DYNAMIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "strategy_dynamic_properties_productivity_limit", "STRATEGY-DYNAMIC-PROPERTIES-PRODUCTIVITY-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_property_p", "PROBLEM-STORE-PROPERTY-P", 1, 0, false );
    new $problem_store_property_p$UnaryFunction();
    SubLFiles.declareFunction( me, "problem_store_properties_p", "PROBLEM-STORE-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_problem_store_properties", "ALL-PROBLEM-STORE-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "extract_problem_store_properties", "EXTRACT-PROBLEM-STORE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_static_property_p", "PROBLEM-STORE-STATIC-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_static_properties_p", "PROBLEM-STORE-STATIC-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_problem_store_static_properties", "EXTRACT-PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_problem_store_static_properties", "ALL-PROBLEM-STORE-STATIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_store_dynamic_property_p", "PROBLEM-STORE-DYNAMIC-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_dynamic_properties_p", "PROBLEM-STORE-DYNAMIC-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_problem_store_dynamic_properties", "ALL-PROBLEM-STORE-DYNAMIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_meta_property_p", "INFERENCE-META-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_inference_meta_properties", "ALL-INFERENCE-META-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "extract_inference_meta_properties", "EXTRACT-INFERENCE-META-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "query_halt_reason_p", "QUERY-HALT-REASON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "exhausted_query_halt_reason_p", "EXHAUSTED-QUERY-HALT-REASON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_status_p", "INFERENCE-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "continuable_inference_status_p", "CONTINUABLE-INFERENCE-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "avoided_inference_reason_p", "AVOIDED-INFERENCE-REASON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_suspend_status_p", "INFERENCE-SUSPEND-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_suspend_status_applicableP", "INFERENCE-SUSPEND-STATUS-APPLICABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "continuable_inference_suspend_status_p", "CONTINUABLE-INFERENCE-SUSPEND-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "exhausted_inference_suspend_status_p", "EXHAUSTED-INFERENCE-SUSPEND-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_error_suspend_status_p", "INFERENCE-ERROR-SUSPEND-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_inference_error_suspend_status", "NEW-INFERENCE-ERROR-SUSPEND-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_error_suspend_status_message", "INFERENCE-ERROR-SUSPEND-STATUS-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_justification_status_p", "INFERENCE-JUSTIFICATION-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_inference_justification_status", "NEW-INFERENCE-JUSTIFICATION-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_justification_status_message", "INFERENCE-JUSTIFICATION-STATUS-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "tactical_status_p", "TACTICAL-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "provability_status_p", "PROVABILITY-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tactical_status_weakerP", "TACTICAL-STATUS-WEAKER?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactical_status_strongerP", "TACTICAL-STATUS-STRONGER?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactical_status_unionP", "TACTICAL-STATUS-UNION?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_status_p", "PROBLEM-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_status_from_tactical_status_and_provability_status", "PROBLEM-STATUS-FROM-TACTICAL-STATUS-AND-PROVABILITY-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "tactical_status_from_problem_status", "TACTICAL-STATUS-FROM-PROBLEM-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "provability_status_from_problem_status", "PROVABILITY-STATUS-FROM-PROBLEM-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "good_problem_status_p", "GOOD-PROBLEM-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "no_good_problem_status_p", "NO-GOOD-PROBLEM-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "neutral_problem_status_p", "NEUTRAL-PROBLEM-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "unexamined_problem_status_p", "UNEXAMINED-PROBLEM-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "examined_problem_status_p", "EXAMINED-PROBLEM-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_problem_status_p", "POSSIBLE-PROBLEM-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pending_problem_status_p", "PENDING-PROBLEM-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "finished_problem_status_p", "FINISHED-PROBLEM-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-PROPERTIES-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_negation_by_failureP", "PROBLEM-STORE-PROPERTIES-NEGATION-BY-FAILURE?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_completeness_minimization_allowedP", "PROBLEM-STORE-PROPERTIES-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_evaluate_subl_allowedP", "PROBLEM-STORE-PROPERTIES-EVALUATE-SUBL-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_rewrite_allowedP", "PROBLEM-STORE-PROPERTIES-REWRITE-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_abduction_allowedP", "PROBLEM-STORE-PROPERTIES-ABDUCTION-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_new_terms_allowedP", "PROBLEM-STORE-PROPERTIES-NEW-TERMS-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_compute_answer_justificationsP", "PROBLEM-STORE-PROPERTIES-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "all_inference_modes", "ALL-INFERENCE-MODES", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_mode_p", "INFERENCE-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_link_type_p", "PROBLEM-LINK-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_name_p", "PROBLEM-STORE-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_name", "PROBLEM-STORE-PROPERTIES-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_equality_reasoning_method_p", "PROBLEM-STORE-EQUALITY-REASONING-METHOD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_equality_reasoning_method", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_equality_reasoning_domain_p", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_equality_reasoning_domain", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-DOMAIN", 1, 0, false );
    SubLFiles.declareFunction( me, "intermediate_step_validation_level_p", "INTERMEDIATE-STEP-VALIDATION-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_intermediate_step_validation_level", "PROBLEM-STORE-PROPERTIES-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "max_problem_count_p", "MAX-PROBLEM-COUNT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_max_problem_count", "PROBLEM-STORE-PROPERTIES-MAX-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_allowed_by_propertiesP", "REMOVAL-ALLOWED-BY-PROPERTIES?", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_allowed_by_propertiesP", "TRANSFORMATION-ALLOWED-BY-PROPERTIES?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_direction_p", "INFERENCE-DIRECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties_direction", "PROBLEM-STORE-PROPERTIES-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "tactic_status_p", "TACTIC-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tactic_type_p", "TACTIC-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tactic_type_from_hl_module", "TACTIC-TYPE-FROM-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "completeness_string", "COMPLETENESS-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "completeness_p", "COMPLETENESS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "impossible_completeness_p", "IMPOSSIBLE-COMPLETENESS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "completeness_L", "COMPLETENESS-<", 2, 0, false );
    SubLFiles.declareFunction( me, "completeness_G", "COMPLETENESS->", 2, 0, false );
    SubLFiles.declareFunction( me, "min_completeness", "MIN-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "min2_completeness", "MIN2-COMPLETENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "max_completeness", "MAX-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "max2_completeness", "MAX2-COMPLETENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "productivity_p", "PRODUCTIVITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "infinite_productivity_p", "INFINITE-PRODUCTIVITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "productivity_for_number_of_children", "PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "number_of_children_for_productivity", "NUMBER-OF-CHILDREN-FOR-PRODUCTIVITY", 1, 0, false );
    SubLFiles.declareFunction( me, "cost_for_productivity", "COST-FOR-PRODUCTIVITY", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_cost_cutoff_for_productivity", "REMOVAL-COST-CUTOFF-FOR-PRODUCTIVITY", 1, 0, false );
    SubLFiles.declareFunction( me, "productivity_E", "PRODUCTIVITY-=", 2, 0, false );
    SubLFiles.declareFunction( me, "productivity_L", "PRODUCTIVITY-<", 2, 0, false );
    SubLFiles.declareFunction( me, "productivity_LE", "PRODUCTIVITY-<=", 2, 0, false );
    SubLFiles.declareFunction( me, "productivity_G", "PRODUCTIVITY->", 2, 0, false );
    SubLFiles.declareFunction( me, "productivity_GE", "PRODUCTIVITY->=", 2, 0, false );
    SubLFiles.declareFunction( me, "productivity_X", "PRODUCTIVITY-+", 2, 0, false );
    SubLFiles.declareFunction( me, "productivity_max", "PRODUCTIVITY-MAX", 2, 0, false );
    SubLFiles.declareFunction( me, "productivity_sum", "PRODUCTIVITY-SUM", 1, 0, false );
    SubLFiles.declareFunction( me, "productivity_times_number", "PRODUCTIVITY-TIMES-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "productivity_divide_number", "PRODUCTIVITY-DIVIDE-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "decrement_productivity_for_number_of_children", "DECREMENT-PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_status_p", "PROOF-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_reject_reason_p", "PROOF-REJECT-REASON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "destructibility_status_string", "DESTRUCTIBILITY-STATUS-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "destructibility_status_hint", "DESTRUCTIBILITY-STATUS-HINT", 1, 0, false );
    SubLFiles.declareFunction( me, "destructibility_status_p", "DESTRUCTIBILITY-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "destructibility_status_destructibleP", "DESTRUCTIBILITY-STATUS-DESTRUCTIBLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_type_property_p", "STRATEGY-TYPE-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_default_method_handler", "STRATEGY-DEFAULT-METHOD-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_simple_return_type_p", "INFERENCE-SIMPLE-RETURN-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_has_simple_return_typeP", "INFERENCE-PROPERTIES-HAS-SIMPLE-RETURN-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_template_return_type_p", "INFERENCE-TEMPLATE-RETURN-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_format_return_type_p", "INFERENCE-FORMAT-RETURN-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_return_type_p", "INFERENCE-RETURN-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_return_type", "INFERENCE-PROPERTIES-RETURN-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_language_p", "INFERENCE-ANSWER-LANGUAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_answer_language", "INFERENCE-PROPERTIES-ANSWER-LANGUAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "result_uniqueness_criterion_p", "RESULT-UNIQUENESS-CRITERION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_uniqueness_criterion", "INFERENCE-PROPERTIES-UNIQUENESS-CRITERION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_disjunction_free_el_vars_policy_p", "INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_disjunction_free_el_vars_policy", "INFERENCE-PROPERTIES-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_transitive_closure_mode_p", "INFERENCE-TRANSITIVE-CLOSURE-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_transitive_closure_mode", "INFERENCE-PROPERTIES-TRANSITIVE-CLOSURE-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_maintain_term_working_setP", "INFERENCE-PROPERTIES-MAINTAIN-TERM-WORKING-SET?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_events", "INFERENCE-PROPERTIES-EVENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_event_type_p", "INFERENCE-EVENT-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_halt_conditions", "INFERENCE-PROPERTIES-HALT-CONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_halt_condition_p", "INFERENCE-HALT-CONDITION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_accumulator_type_p", "INFERENCE-ACCUMULATOR-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_inference_accumulator", "INITIALIZE-INFERENCE-ACCUMULATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_forget_extra_resultsP", "INFERENCE-PROPERTIES-FORGET-EXTRA-RESULTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_cache_inference_resultsP", "INFERENCE-PROPERTIES-CACHE-INFERENCE-RESULTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_browsableP", "INFERENCE-PROPERTIES-BROWSABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_continuableP", "INFERENCE-PROPERTIES-CONTINUABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties_blockP", "INFERENCE-PROPERTIES-BLOCK?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_query_property_lookup", "INFERENCE-QUERY-PROPERTY-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_engine_default_for_property", "INFERENCE-ENGINE-DEFAULT-FOR-PROPERTY", 1, 0, false );
    SubLFiles.declareFunction( me, "query_property_is_defaultP", "QUERY-PROPERTY-IS-DEFAULT?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_input_non_default_query_properties", "INFERENCE-INPUT-NON-DEFAULT-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_default_query_properties", "ALL-DEFAULT-QUERY-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "explicify_default_query_properties", "EXPLICIFY-DEFAULT-QUERY-PROPERTIES", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_datastructures_enumerated_types_file()
  {
    $specially_handled_inference_metrics$ = SubLFiles.deflexical( "*SPECIALLY-HANDLED-INFERENCE-METRICS*", $list7 );
    $non_inference_query_metrics$ = SubLFiles.deflexical( "*NON-INFERENCE-QUERY-METRICS*", $list8 );
    $arete_query_metrics$ = SubLFiles.deflexical( "*ARETE-QUERY-METRICS*", $list9 );
    $removal_ask_query_metrics$ = SubLFiles.deflexical( "*REMOVAL-ASK-QUERY-METRICS*", $list10 );
    $inference_static_properties$ = SubLFiles.deflexical( "*INFERENCE-STATIC-PROPERTIES*", $list12 );
    $inference_allows_hl_predicate_transformation_by_defaultP$ = SubLFiles.deflexical( "*INFERENCE-ALLOWS-HL-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL );
    $inference_allows_unbound_predicate_transformation_by_defaultP$ = SubLFiles.deflexical( "*INFERENCE-ALLOWS-UNBOUND-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL );
    $inference_allows_evaluatable_predicate_transformation_by_defaultP$ = SubLFiles.deflexical( "*INFERENCE-ALLOWS-EVALUATABLE-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL );
    $inference_allows_indeterminate_results_by_defaultP$ = SubLFiles.deflexical( "*INFERENCE-ALLOWS-INDETERMINATE-RESULTS-BY-DEFAULT?*", T );
    $default_allowed_rules$ = SubLFiles.deflexical( "*DEFAULT-ALLOWED-RULES*", $kw20$ALL );
    $default_forbidden_rules$ = SubLFiles.deflexical( "*DEFAULT-FORBIDDEN-RULES*", $kw22$NONE );
    $default_allowed_modules$ = SubLFiles.deflexical( "*DEFAULT-ALLOWED-MODULES*", $kw20$ALL );
    $inference_allows_abnormality_checking_by_defaultP$ = SubLFiles.deflexical( "*INFERENCE-ALLOWS-ABNORMALITY-CHECKING-BY-DEFAULT?*", T );
    $inference_resource_constraints$ = SubLFiles.deflexical( "*INFERENCE-RESOURCE-CONSTRAINTS*", $list26 );
    $default_max_number$ = SubLFiles.deflexical( "*DEFAULT-MAX-NUMBER*", NIL );
    $default_max_time$ = SubLFiles.deflexical( "*DEFAULT-MAX-TIME*", NIL );
    $default_max_step$ = SubLFiles.deflexical( "*DEFAULT-MAX-STEP*", NIL );
    $default_forward_max_time$ = SubLFiles.deflexical( "*DEFAULT-FORWARD-MAX-TIME*", ZERO_INTEGER );
    $default_max_proof_depth$ = SubLFiles.deflexical( "*DEFAULT-MAX-PROOF-DEPTH*", NIL );
    $default_max_transformation_depth$ = SubLFiles.deflexical( "*DEFAULT-MAX-TRANSFORMATION-DEPTH*", ZERO_INTEGER );
    $default_min_rule_utility$ = SubLFiles.deflexical( "*DEFAULT-MIN-RULE-UTILITY*", $int35$_100 );
    $default_probably_approximately_done$ = SubLFiles.deflexical( "*DEFAULT-PROBABLY-APPROXIMATELY-DONE*", ONE_INTEGER );
    $inference_other_dynamic_properties$ = SubLFiles.deflexical( "*INFERENCE-OTHER-DYNAMIC-PROPERTIES*", $list38 );
    $default_inference_metrics_template$ = SubLFiles.deflexical( "*DEFAULT-INFERENCE-METRICS-TEMPLATE*", NIL );
    $strategy_static_properties$ = SubLFiles.deflexical( "*STRATEGY-STATIC-PROPERTIES*", $list42 );
    $default_removal_backtracking_productivity_limit$ = SubLFiles.deflexical( "*DEFAULT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT*", ZERO_INTEGER );
    $default_proof_spec$ = SubLFiles.deflexical( "*DEFAULT-PROOF-SPEC*", $kw45$ANYTHING );
    $strategy_dynamic_properties$ = SubLFiles.deflexical( "*STRATEGY-DYNAMIC-PROPERTIES*", $list47 );
    $default_productivity_limit$ = SubLFiles.deflexical( "*DEFAULT-PRODUCTIVITY-LIMIT*", Numbers.multiply( TWO_INTEGER, $int49$100, control_vars.$default_removal_cost_cutoff$.getGlobalValue() ) );
    $problem_store_static_properties$ = SubLFiles.deflexical( "*PROBLEM-STORE-STATIC-PROPERTIES*", $list52 );
    $problem_store_dynamic_properties$ = SubLFiles.deflexical( "*PROBLEM-STORE-DYNAMIC-PROPERTIES*", NIL );
    $inference_meta_properties$ = SubLFiles.deflexical( "*INFERENCE-META-PROPERTIES*", $list55 );
    $inference_statuses$ = SubLFiles.deflexical( "*INFERENCE-STATUSES*", $list57 );
    $continuable_inference_statuses$ = SubLFiles.deflexical( "*CONTINUABLE-INFERENCE-STATUSES*", $list58 );
    $avoided_inference_reasons$ = SubLFiles.deflexical( "*AVOIDED-INFERENCE-REASONS*", $list59 );
    $inference_suspend_statuses$ = SubLFiles.deflexical( "*INFERENCE-SUSPEND-STATUSES*", $list60 );
    $continuable_inference_suspend_statuses$ = SubLFiles.deflexical( "*CONTINUABLE-INFERENCE-SUSPEND-STATUSES*", $list64 );
    $exhausted_inference_suspend_statuses$ = SubLFiles.deflexical( "*EXHAUSTED-INFERENCE-SUSPEND-STATUSES*", $list65 );
    $tactical_statuses$ = SubLFiles.deflexical( "*TACTICAL-STATUSES*", $list70 );
    $provability_statuses$ = SubLFiles.deflexical( "*PROVABILITY-STATUSES*", $list71 );
    $problem_status_table$ = SubLFiles.deflexical( "*PROBLEM-STATUS-TABLE*", $list72 );
    $ordered_tactical_statuses$ = SubLFiles.deflexical( "*ORDERED-TACTICAL-STATUSES*", list_utilities.delete_duplicates_sorted( Mapping.mapcar( $sym73$SECOND, $problem_status_table$.getGlobalValue() ), UNPROVIDED ) );
    $union_ordered_tactical_statuses$ = SubLFiles.deflexical( "*UNION-ORDERED-TACTICAL-STATUSES*", $list74 );
    $add_restriction_layer_of_indirection_by_defaultP$ = SubLFiles.deflexical( "*ADD-RESTRICTION-LAYER-OF-INDIRECTION-BY-DEFAULT?*", NIL );
    $negation_by_failure_by_defaultP$ = SubLFiles.deflexical( "*NEGATION-BY-FAILURE-BY-DEFAULT?*", NIL );
    $evaluate_subl_allowed_defaultP$ = SubLFiles.deflexical( "*EVALUATE-SUBL-ALLOWED-DEFAULT?*", T );
    $rewrite_allowed_defaultP$ = SubLFiles.defparameter( "*REWRITE-ALLOWED-DEFAULT?*", NIL );
    $abduction_allowed_defaultP$ = SubLFiles.deflexical( "*ABDUCTION-ALLOWED-DEFAULT?*", NIL );
    $new_terms_allowed_defaultP$ = SubLFiles.deflexical( "*NEW-TERMS-ALLOWED-DEFAULT?*", T );
    $compute_answer_justifications_defaultP$ = SubLFiles.deflexical( "*COMPUTE-ANSWER-JUSTIFICATIONS-DEFAULT?*", T );
    $default_inference_mode$ = SubLFiles.deflexical( "*DEFAULT-INFERENCE-MODE*", $kw92$CUSTOM );
    $inference_modes$ = SubLFiles.deflexical( "*INFERENCE-MODES*", $list93 );
    $problem_link_types$ = SubLFiles.deflexical( "*PROBLEM-LINK-TYPES*", $list94 );
    $default_problem_store_name$ = SubLFiles.deflexical( "*DEFAULT-PROBLEM-STORE-NAME*", NIL );
    $default_equality_reasoning_method$ = SubLFiles.deflexical( "*DEFAULT-EQUALITY-REASONING-METHOD*", $kw96$CZER_EQUAL );
    $problem_store_equality_reasoning_methods$ = SubLFiles.deflexical( "*PROBLEM-STORE-EQUALITY-REASONING-METHODS*", $list97 );
    $default_equality_reasoning_domain$ = SubLFiles.deflexical( "*DEFAULT-EQUALITY-REASONING-DOMAIN*", $kw20$ALL );
    $problem_store_equality_reasoning_domains$ = SubLFiles.deflexical( "*PROBLEM-STORE-EQUALITY-REASONING-DOMAINS*", $list99 );
    $default_intermediate_step_validation_level$ = SubLFiles.deflexical( "*DEFAULT-INTERMEDIATE-STEP-VALIDATION-LEVEL*", $kw22$NONE );
    $intermediate_step_validation_levels$ = SubLFiles.deflexical( "*INTERMEDIATE-STEP-VALIDATION-LEVELS*", $list101 );
    $default_max_problem_count$ = SubLFiles.deflexical( "*DEFAULT-MAX-PROBLEM-COUNT*", $int103$100000 );
    $removal_allowed_by_defaultP$ = SubLFiles.deflexical( "*REMOVAL-ALLOWED-BY-DEFAULT?*", T );
    $transformation_allowed_by_defaultP$ = SubLFiles.deflexical( "*TRANSFORMATION-ALLOWED-BY-DEFAULT?*", T );
    $default_problem_store_inference_direction$ = SubLFiles.deflexical( "*DEFAULT-PROBLEM-STORE-INFERENCE-DIRECTION*", $kw107$BACKWARD );
    $inference_directions$ = SubLFiles.deflexical( "*INFERENCE-DIRECTIONS*", $list108 );
    $tactic_statuses$ = SubLFiles.deflexical( "*TACTIC-STATUSES*", $list110 );
    $tactic_types$ = SubLFiles.deflexical( "*TACTIC-TYPES*", $list111 );
    $ordered_completenesses$ = SubLFiles.deflexical( "*ORDERED-COMPLETENESSES*", $list119 );
    $productivity_to_number_table$ = SubLFiles.deflexical( "*PRODUCTIVITY-TO-NUMBER-TABLE*", $list132 );
    $proof_statuses$ = SubLFiles.deflexical( "*PROOF-STATUSES*", $list134 );
    $proof_reject_reasons$ = SubLFiles.deflexical( "*PROOF-REJECT-REASONS*", $list135 );
    $destructibility_statuses$ = SubLFiles.deflexical( "*DESTRUCTIBILITY-STATUSES*", $list136 );
    $balancing_tactician_strategy_type_properties$ = SubLFiles.deflexical( "*BALANCING-TACTICIAN-STRATEGY-TYPE-PROPERTIES*", $list148 );
    $legacy_strategy_type_properties$ = SubLFiles.deflexical( "*LEGACY-STRATEGY-TYPE-PROPERTIES*", $list149 );
    $strategy_type_properties$ = SubLFiles.deflexical( "*STRATEGY-TYPE-PROPERTIES*", ConsesLow.append( $balancing_tactician_strategy_type_properties$.getGlobalValue(), $legacy_strategy_type_properties$
        .getGlobalValue() ) );
    $inference_return_types$ = SubLFiles.deflexical( "*INFERENCE-RETURN-TYPES*", $list153 );
    $inference_default_return_type$ = SubLFiles.deflexical( "*INFERENCE-DEFAULT-RETURN-TYPE*", $kw154$BINDINGS );
    $inference_answer_languages$ = SubLFiles.deflexical( "*INFERENCE-ANSWER-LANGUAGES*", $list158 );
    $inference_default_answer_language$ = SubLFiles.deflexical( "*INFERENCE-DEFAULT-ANSWER-LANGUAGE*", $kw159$EL );
    $result_uniqueness_criteria$ = SubLFiles.deflexical( "*RESULT-UNIQUENESS-CRITERIA*", $list161 );
    $default_result_uniqueness_criterion$ = SubLFiles.deflexical( "*DEFAULT-RESULT-UNIQUENESS-CRITERION*", $kw154$BINDINGS );
    $inference_disjunction_free_el_vars_policies$ = SubLFiles.deflexical( "*INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICIES*", $list163 );
    $default_inference_disjunction_free_el_vars_policy$ = SubLFiles.deflexical( "*DEFAULT-INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY*", $kw164$REQUIRE_EQUAL );
    $inference_transitive_closure_modes$ = SubLFiles.deflexical( "*INFERENCE-TRANSITIVE-CLOSURE-MODES*", $list166 );
    $inference_transitive_closure_mode_default$ = SubLFiles.deflexical( "*INFERENCE-TRANSITIVE-CLOSURE-MODE-DEFAULT*", $kw22$NONE );
    $maintain_term_working_set_defaultP$ = SubLFiles.deflexical( "*MAINTAIN-TERM-WORKING-SET-DEFAULT?*", NIL );
    $inference_events_default$ = SubLFiles.deflexical( "*INFERENCE-EVENTS-DEFAULT*", NIL );
    $inference_event_types$ = SubLFiles.deflexical( "*INFERENCE-EVENT-TYPES*", $list170 );
    $inference_halt_conditions_default$ = SubLFiles.deflexical( "*INFERENCE-HALT-CONDITIONS-DEFAULT*", NIL );
    $inference_halt_conditions$ = SubLFiles.deflexical( "*INFERENCE-HALT-CONDITIONS*", $list172 );
    $inference_accumulator_types$ = SubLFiles.deflexical( "*INFERENCE-ACCUMULATOR-TYPES*", $list173 );
    $inference_default_forget_extra_resultsP$ = SubLFiles.deflexical( "*INFERENCE-DEFAULT-FORGET-EXTRA-RESULTS?*", NIL );
    $inference_default_cache_inference_resultsP$ = SubLFiles.deflexical( "*INFERENCE-DEFAULT-CACHE-INFERENCE-RESULTS?*", NIL );
    $inference_default_browsableP$ = SubLFiles.deflexical( "*INFERENCE-DEFAULT-BROWSABLE?*", NIL );
    $inference_default_continuableP$ = SubLFiles.deflexical( "*INFERENCE-DEFAULT-CONTINUABLE?*", NIL );
    return NIL;
  }

  public static SubLObject setup_inference_datastructures_enumerated_types_file()
  {
    access_macros.register_external_symbol( $sym0$QUERY_PROPERTY_P );
    utilities_macros.register_cyc_api_function( $sym1$ALL_QUERY_PROPERTIES, NIL, $str2$Return_a_list_of_all_the_query_pr, NIL, $list3 );
    access_macros.register_external_symbol( $sym51$PROBLEM_STORE_PROPERTY_P );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_datastructures_enumerated_types_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_datastructures_enumerated_types_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_datastructures_enumerated_types_file();
  }
  static
  {
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
    $sym0$QUERY_PROPERTY_P = makeSymbol( "QUERY-PROPERTY-P" );
    $sym1$ALL_QUERY_PROPERTIES = makeSymbol( "ALL-QUERY-PROPERTIES" );
    $str2$Return_a_list_of_all_the_query_pr = makeString( "Return a list of all the query properties.\n   @note destructible" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "KEYWORDP" ) ) );
    $sym4$QUERY_STATIC_PROPERTY_P = makeSymbol( "QUERY-STATIC-PROPERTY-P" );
    $sym5$QUERY_STATIC_OR_META_PROPERTY_P = makeSymbol( "QUERY-STATIC-OR-META-PROPERTY-P" );
    $sym6$QUERY_DYNAMIC_PROPERTY_P = makeSymbol( "QUERY-DYNAMIC-PROPERTY-P" );
    $list7 = ConsesLow.list( makeKeyword( "NEW-ROOT-TIMES" ), makeKeyword( "NEW-ROOT-COUNT" ), makeKeyword( "PROBLEM-CREATION-TIMES" ), makeKeyword( "INFERENCE-ANSWER-QUERY-PROPERTIES" ), makeKeyword(
        "INFERENCE-STRONGEST-QUERY-PROPERTIES" ), makeKeyword( "INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES" ), makeKeyword( "INFERENCE-IDS" ) );
    $list8 = ConsesLow.list( makeKeyword( "COMPLETE-USER-TIME" ), makeKeyword( "COMPLETE-SYSTEM-TIME" ), makeKeyword( "COMPLETE-TOTAL-TIME" ) );
    $list9 = ConsesLow.list( makeKeyword( "ANSWER-COUNT" ), makeKeyword( "TIME-TO-FIRST-ANSWER" ), makeKeyword( "TIME-TO-LAST-ANSWER" ), makeKeyword( "HYPOTHESIZATION-TIME" ), makeKeyword( "TOTAL-TIME" ) );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "ANSWER-COUNT" ), makeKeyword( "TIME-TO-FIRST-ANSWER" ), makeKeyword( "TIME-TO-LAST-ANSWER" ), makeKeyword( "TIME-PER-ANSWER" ), makeKeyword(
        "LATENCY-IMPROVEMENT-FROM-ITERATIVITY" ), makeKeyword( "TOTAL-TIME" ), makeKeyword( "COMPLETE-USER-TIME" ), makeKeyword( "COMPLETE-SYSTEM-TIME" ), makeKeyword( "COMPLETE-TOTAL-TIME" )
    } );
    $sym11$INFERENCE_PROPERTY_P = makeSymbol( "INFERENCE-PROPERTY-P" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" ), makeKeyword( "RESULT-UNIQUENESS" ), makeKeyword( "PROBLEM-STORE" ), makeKeyword( "CONDITIONAL-SENTENCE?" ), makeKeyword(
        "NON-EXPLANATORY-SENTENCE" ), makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ),
      makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), makeKeyword( "ALLOWED-RULES" ), makeKeyword( "FORBIDDEN-RULES" ), makeKeyword( "ALLOWED-MODULES" ), makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" ), makeKeyword(
          "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "MAINTAIN-TERM-WORKING-SET?" ), makeKeyword( "EVENTS" ), makeKeyword( "HALT-CONDITIONS" )
    } );
    $sym13$INFERENCE_STATIC_PROPERTY_P = makeSymbol( "INFERENCE-STATIC-PROPERTY-P" );
    $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P = makeSymbol( "INFERENCE-STATIC-OR-META-PROPERTY-P" );
    $kw15$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" );
    $kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" );
    $kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $kw19$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw20$ALL = makeKeyword( "ALL" );
    $kw21$ALLOWED_RULES = makeKeyword( "ALLOWED-RULES" );
    $kw22$NONE = makeKeyword( "NONE" );
    $kw23$FORBIDDEN_RULES = makeKeyword( "FORBIDDEN-RULES" );
    $kw24$ALLOWED_MODULES = makeKeyword( "ALLOWED-MODULES" );
    $kw25$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" );
    $list26 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), makeKeyword( "MAX-TIME" ), makeKeyword( "MAX-STEP" ), makeKeyword( "INFERENCE-MODE" ) );
    $sym27$INFERENCE_RESOURCE_CONSTRAINT_P = makeSymbol( "INFERENCE-RESOURCE-CONSTRAINT-P" );
    $kw28$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw29$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw30$MAX_STEP = makeKeyword( "MAX-STEP" );
    $kw31$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw32$FORWARD_MAX_TIME = makeKeyword( "FORWARD-MAX-TIME" );
    $kw33$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $kw34$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $int35$_100 = makeInteger( -100 );
    $kw36$MIN_RULE_UTILITY = makeKeyword( "MIN-RULE-UTILITY" );
    $kw37$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $list38 = ConsesLow.list( new SubLObject[] { makeKeyword( "FORWARD-MAX-TIME" ), makeKeyword( "MAX-PROOF-DEPTH" ), makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), makeKeyword( "MIN-RULE-UTILITY" ), makeKeyword(
        "PROBABLY-APPROXIMATELY-DONE" ), makeKeyword( "RETURN" ), makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "CACHE-INFERENCE-RESULTS?" ), makeKeyword( "FORGET-EXTRA-RESULTS?" ), makeKeyword( "BROWSABLE?" ),
      makeKeyword( "CONTINUABLE?" ), makeKeyword( "BLOCK?" ), makeKeyword( "METRICS" )
    } );
    $sym39$INFERENCE_DYNAMIC_PROPERTY_P = makeSymbol( "INFERENCE-DYNAMIC-PROPERTY-P" );
    $kw40$METRICS = makeKeyword( "METRICS" );
    $sym41$STRATEGY_PROPERTY_P = makeSymbol( "STRATEGY-PROPERTY-P" );
    $list42 = ConsesLow.list( makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), makeKeyword( "PROOF-SPEC" ) );
    $sym43$STRATEGY_STATIC_PROPERTY_P = makeSymbol( "STRATEGY-STATIC-PROPERTY-P" );
    $kw44$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" );
    $kw45$ANYTHING = makeKeyword( "ANYTHING" );
    $kw46$PROOF_SPEC = makeKeyword( "PROOF-SPEC" );
    $list47 = ConsesLow.list( makeKeyword( "PRODUCTIVITY-LIMIT" ) );
    $sym48$STRATEGY_DYNAMIC_PROPERTY_P = makeSymbol( "STRATEGY-DYNAMIC-PROPERTY-P" );
    $int49$100 = makeInteger( 100 );
    $kw50$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $sym51$PROBLEM_STORE_PROPERTY_P = makeSymbol( "PROBLEM-STORE-PROPERTY-P" );
    $list52 = ConsesLow.list( new SubLObject[] { makeKeyword( "PROBLEM-STORE-NAME" ), makeKeyword( "EQUALITY-REASONING-METHOD" ), makeKeyword( "EQUALITY-REASONING-DOMAIN" ), makeKeyword(
        "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword( "MAX-PROBLEM-COUNT" ), makeKeyword( "REMOVAL-ALLOWED?" ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ),
      makeKeyword( "NEGATION-BY-FAILURE?" ), makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" ), makeKeyword( "DIRECTION" ), makeKeyword( "EVALUATE-SUBL-ALLOWED?" ), makeKeyword( "REWRITE-ALLOWED?" ), makeKeyword(
          "ABDUCTION-ALLOWED?" ), makeKeyword( "NEW-TERMS-ALLOWED?" ), makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" )
    } );
    $sym53$PROBLEM_STORE_STATIC_PROPERTY_P = makeSymbol( "PROBLEM-STORE-STATIC-PROPERTY-P" );
    $sym54$PROBLEM_STORE_DYNAMIC_PROPERTY_P = makeSymbol( "PROBLEM-STORE-DYNAMIC-PROPERTY-P" );
    $list55 = ConsesLow.list( makeKeyword( "INFERENCE-MODE" ) );
    $sym56$INFERENCE_META_PROPERTY_P = makeSymbol( "INFERENCE-META-PROPERTY-P" );
    $list57 = ConsesLow.list( new SubLObject[] { makeKeyword( "NEW" ), makeKeyword( "PREPARED" ), makeKeyword( "READY" ), makeKeyword( "RUNNING" ), makeKeyword( "SUSPENDED" ), makeKeyword( "DEAD" ), makeKeyword(
        "TAUTOLOGY" ), makeKeyword( "CONTRADICTION" ), makeKeyword( "ILL-FORMED" )
    } );
    $list58 = ConsesLow.list( makeKeyword( "PREPARED" ), makeKeyword( "SUSPENDED" ) );
    $list59 = ConsesLow.list( makeKeyword( "TAUTOLOGY" ), makeKeyword( "CONTRADICTION" ), makeKeyword( "ILL-FORMED" ), makeKeyword( "NON-TRIVIAL" ), makeKeyword( "NOT-A-QUERY" ) );
    $list60 = ConsesLow.list( new SubLObject[] { makeKeyword( "ABORT" ), makeKeyword( "INTERRUPT" ), makeKeyword( "MAX-NUMBER" ), makeKeyword( "MAX-TIME" ), makeKeyword( "MAX-STEP" ), makeKeyword( "MAX-PROBLEM-COUNT" ),
      makeKeyword( "MAX-PROOF-COUNT" ), makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), makeKeyword( "EXHAUST" ), makeKeyword( "EXHAUST-TOTAL" )
    } );
    $sym61$INFERENCE_STATUS_P = makeSymbol( "INFERENCE-STATUS-P" );
    $kw62$SUSPENDED = makeKeyword( "SUSPENDED" );
    $kw63$TAUTOLOGY = makeKeyword( "TAUTOLOGY" );
    $list64 = ConsesLow.list( makeKeyword( "INTERRUPT" ), makeKeyword( "MAX-NUMBER" ), makeKeyword( "MAX-TIME" ), makeKeyword( "MAX-STEP" ), makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), makeKeyword( "EXHAUST" ) );
    $list65 = ConsesLow.list( makeKeyword( "EXHAUST" ), makeKeyword( "EXHAUST-TOTAL" ) );
    $kw66$ERROR = makeKeyword( "ERROR" );
    $sym67$STRINGP = makeSymbol( "STRINGP" );
    $kw68$JUSTIFICATION = makeKeyword( "JUSTIFICATION" );
    $sym69$HL_JUSTIFICATION_LIST_P = makeSymbol( "HL-JUSTIFICATION-LIST-P" );
    $list70 = ConsesLow.list( makeKeyword( "NEW" ), makeKeyword( "UNEXAMINED" ), makeKeyword( "EXAMINED" ), makeKeyword( "POSSIBLE" ), makeKeyword( "PENDING" ), makeKeyword( "FINISHED" ) );
    $list71 = ConsesLow.list( makeKeyword( "GOOD" ), makeKeyword( "NEUTRAL" ), makeKeyword( "NO-GOOD" ) );
    $list72 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "NEW" ), makeKeyword( "NEW" ), makeKeyword( "NEUTRAL" ) ), ConsesLow.list( makeKeyword( "UNEXAMINED" ), makeKeyword( "UNEXAMINED" ),
        makeKeyword( "NEUTRAL" ) ), ConsesLow.list( makeKeyword( "UNEXAMINED-GOOD" ), makeKeyword( "UNEXAMINED" ), makeKeyword( "GOOD" ) ), ConsesLow.list( makeKeyword( "UNEXAMINED-NO-GOOD" ), makeKeyword(
            "UNEXAMINED" ), makeKeyword( "NO-GOOD" ) ), ConsesLow.list( makeKeyword( "EXAMINED" ), makeKeyword( "EXAMINED" ), makeKeyword( "NEUTRAL" ) ), ConsesLow.list( makeKeyword( "EXAMINED-GOOD" ), makeKeyword(
                "EXAMINED" ), makeKeyword( "GOOD" ) ), ConsesLow.list( makeKeyword( "EXAMINED-NO-GOOD" ), makeKeyword( "EXAMINED" ), makeKeyword( "NO-GOOD" ) ), ConsesLow.list( makeKeyword( "POSSIBLE" ), makeKeyword(
                    "POSSIBLE" ), makeKeyword( "NEUTRAL" ) ), ConsesLow.list( makeKeyword( "POSSIBLE-GOOD" ), makeKeyword( "POSSIBLE" ), makeKeyword( "GOOD" ) ), ConsesLow.list( makeKeyword( "POSSIBLE-NO-GOOD" ),
                        makeKeyword( "POSSIBLE" ), makeKeyword( "NO-GOOD" ) ), ConsesLow.list( makeKeyword( "PENDING" ), makeKeyword( "PENDING" ), makeKeyword( "NEUTRAL" ) ), ConsesLow.list( makeKeyword(
                            "PENDING-GOOD" ), makeKeyword( "PENDING" ), makeKeyword( "GOOD" ) ), ConsesLow.list( makeKeyword( "PENDING-NO-GOOD" ), makeKeyword( "PENDING" ), makeKeyword( "NO-GOOD" ) ), ConsesLow.list(
                                makeKeyword( "FINISHED" ), makeKeyword( "FINISHED" ), makeKeyword( "NEUTRAL" ) ), ConsesLow.list( makeKeyword( "FINISHED-GOOD" ), makeKeyword( "FINISHED" ), makeKeyword( "GOOD" ) ),
      ConsesLow.list( makeKeyword( "FINISHED-NO-GOOD" ), makeKeyword( "FINISHED" ), makeKeyword( "NO-GOOD" ) )
    } );
    $sym73$SECOND = makeSymbol( "SECOND" );
    $list74 = ConsesLow.list( makeKeyword( "NEW" ), makeKeyword( "POSSIBLE" ), makeKeyword( "PENDING" ), makeKeyword( "EXAMINED" ), makeKeyword( "UNEXAMINED" ), makeKeyword( "FINISHED" ) );
    $str75$No_match_to_combine__s_and__s = makeString( "No match to combine ~s and ~s" );
    $kw76$GOOD = makeKeyword( "GOOD" );
    $kw77$NO_GOOD = makeKeyword( "NO-GOOD" );
    $kw78$NEUTRAL = makeKeyword( "NEUTRAL" );
    $kw79$UNEXAMINED = makeKeyword( "UNEXAMINED" );
    $kw80$EXAMINED = makeKeyword( "EXAMINED" );
    $kw81$POSSIBLE = makeKeyword( "POSSIBLE" );
    $kw82$PENDING = makeKeyword( "PENDING" );
    $kw83$FINISHED = makeKeyword( "FINISHED" );
    $kw84$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw85$NEGATION_BY_FAILURE_ = makeKeyword( "NEGATION-BY-FAILURE?" );
    $kw86$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" );
    $kw87$EVALUATE_SUBL_ALLOWED_ = makeKeyword( "EVALUATE-SUBL-ALLOWED?" );
    $kw88$REWRITE_ALLOWED_ = makeKeyword( "REWRITE-ALLOWED?" );
    $kw89$ABDUCTION_ALLOWED_ = makeKeyword( "ABDUCTION-ALLOWED?" );
    $kw90$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw91$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $kw92$CUSTOM = makeKeyword( "CUSTOM" );
    $list93 = ConsesLow.list( makeKeyword( "MINIMAL" ), makeKeyword( "SHALLOW" ), makeKeyword( "EXTENDED" ), makeKeyword( "MAXIMAL" ), makeKeyword( "CUSTOM" ) );
    $list94 = ConsesLow.list( new SubLObject[] { makeKeyword( "REMOVAL" ), makeKeyword( "TRANSFORMATION" ), makeKeyword( "RESIDUAL-TRANSFORMATION" ), makeKeyword( "REWRITE" ), makeKeyword( "JOIN-ORDERED" ), makeKeyword(
        "JOIN" ), makeKeyword( "SPLIT" ), makeKeyword( "RESTRICTION" ), makeKeyword( "UNION" ), makeKeyword( "DISJUNCTIVE-ASSUMPTION" ), makeKeyword( "ANSWER" ), makeKeyword( "INDIRECTION" )
    } );
    $kw95$PROBLEM_STORE_NAME = makeKeyword( "PROBLEM-STORE-NAME" );
    $kw96$CZER_EQUAL = makeKeyword( "CZER-EQUAL" );
    $list97 = ConsesLow.list( makeKeyword( "EQUAL" ), makeKeyword( "CZER-EQUAL" ) );
    $kw98$EQUALITY_REASONING_METHOD = makeKeyword( "EQUALITY-REASONING-METHOD" );
    $list99 = ConsesLow.list( makeKeyword( "ALL" ), makeKeyword( "SINGLE-LITERAL" ), makeKeyword( "NONE" ) );
    $kw100$EQUALITY_REASONING_DOMAIN = makeKeyword( "EQUALITY-REASONING-DOMAIN" );
    $list101 = ConsesLow.list( makeKeyword( "ALL" ), makeKeyword( "ARG-TYPE" ), makeKeyword( "MINIMAL" ), makeKeyword( "NONE" ) );
    $kw102$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $int103$100000 = makeInteger( 100000 );
    $kw104$MAX_PROBLEM_COUNT = makeKeyword( "MAX-PROBLEM-COUNT" );
    $kw105$REMOVAL_ALLOWED_ = makeKeyword( "REMOVAL-ALLOWED?" );
    $kw106$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $kw107$BACKWARD = makeKeyword( "BACKWARD" );
    $list108 = ConsesLow.list( makeKeyword( "BACKWARD" ), makeKeyword( "FORWARD" ) );
    $kw109$DIRECTION = makeKeyword( "DIRECTION" );
    $list110 = ConsesLow.list( makeKeyword( "POSSIBLE" ), makeKeyword( "EXECUTED" ), makeKeyword( "DISCARDED" ) );
    $list111 = ConsesLow.list( makeKeyword( "REMOVAL" ), makeKeyword( "META-REMOVAL" ), makeKeyword( "TRANSFORMATION" ), makeKeyword( "REWRITE" ), makeKeyword( "STRUCTURAL" ), makeKeyword( "REMOVAL-CONJUNCTIVE" ) );
    $kw112$REMOVAL = makeKeyword( "REMOVAL" );
    $kw113$TRANSFORMATION = makeKeyword( "TRANSFORMATION" );
    $kw114$STRUCTURAL = makeKeyword( "STRUCTURAL" );
    $kw115$REMOVAL_CONJUNCTIVE = makeKeyword( "REMOVAL-CONJUNCTIVE" );
    $kw116$REWRITE = makeKeyword( "REWRITE" );
    $kw117$META_REMOVAL = makeKeyword( "META-REMOVAL" );
    $str118$HL_Module_of_unknown_type___s = makeString( "HL-Module of unknown type: ~s" );
    $list119 = ConsesLow.list( makeKeyword( "IMPOSSIBLE" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "COMPLETE" ) );
    $sym120$COMPLETENESS_P = makeSymbol( "COMPLETENESS-P" );
    $kw121$COMPLETE = makeKeyword( "COMPLETE" );
    $str122$Complete = makeString( "Complete" );
    $kw123$INCOMPLETE = makeKeyword( "INCOMPLETE" );
    $str124$Incomplete = makeString( "Incomplete" );
    $kw125$GROSSLY_INCOMPLETE = makeKeyword( "GROSSLY-INCOMPLETE" );
    $str126$Grossly_Incomplete = makeString( "Grossly Incomplete" );
    $kw127$IMPOSSIBLE = makeKeyword( "IMPOSSIBLE" );
    $str128$Impossible = makeString( "Impossible" );
    $str129$Unexpected_completeness__a = makeString( "Unexpected completeness ~a" );
    $sym130$COMPLETENESS__ = makeSymbol( "COMPLETENESS-<" );
    $sym131$COMPLETENESS__ = makeSymbol( "COMPLETENESS->" );
    $list132 = ConsesLow.list( ConsesLow.cons( makeDouble( 0.5 ), makeInteger( 50 ) ), ConsesLow.cons( makeDouble( 1.5 ), makeInteger( 150 ) ) );
    $sym133$PRODUCTIVITY_P = makeSymbol( "PRODUCTIVITY-P" );
    $list134 = ConsesLow.list( makeKeyword( "PROVEN" ), makeKeyword( "REJECTED" ) );
    $list135 = ConsesLow.list( new SubLObject[] { makeKeyword( "CIRCULAR" ), makeKeyword( "ILL-FORMED" ), makeKeyword( "NON-ABDUCIBLE-RULE" ), makeKeyword( "REJECTED-SUBPROOF" ), makeKeyword(
        "MAX-PROOF-BUBBLING-DEPTH" ), makeKeyword( "INCONSISTENT-MT-ASSUMPTIONS" ), makeKeyword( "EXCEPTED-ASSERTION" ), makeKeyword( "ABNORMAL" ), makeKeyword( "PROBLEM-NO-GOOD" ), makeKeyword(
            "MODUS-TOLLENS-WITH-NON-WFF" )
    } );
    $list136 = ConsesLow.list( makeKeyword( "INDESTRUCTIBLE" ), makeKeyword( "DESTRUCTIBLE" ), makeKeyword( "UNKNOWN" ) );
    $sym137$DESTRUCTIBILITY_STATUS_P = makeSymbol( "DESTRUCTIBILITY-STATUS-P" );
    $kw138$INDESTRUCTIBLE = makeKeyword( "INDESTRUCTIBLE" );
    $str139$Indestructible = makeString( "Indestructible" );
    $kw140$DESTRUCTIBLE = makeKeyword( "DESTRUCTIBLE" );
    $str141$Destructible = makeString( "Destructible" );
    $kw142$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str143$Unknown = makeString( "Unknown" );
    $str144$Unexpected_destructibility_status = makeString( "Unexpected destructibility status ~s" );
    $str145$I = makeString( "I" );
    $str146$ = makeString( "" );
    $str147$_ = makeString( "?" );
    $list148 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeKeyword( "NAME" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "COMMENT" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons(
        makeKeyword( "CONSTRUCTOR" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "DO-ONE-STEP" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "DONE?" ), makeKeyword(
            "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "POSSIBLY-ACTIVATE-PROBLEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "SELECT-BEST-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ),
      ConsesLow.cons( makeKeyword( "EXECUTE-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "INITIAL-RELEVANT-STRATEGIES" ), makeSymbol( "DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES" ) ),
      ConsesLow.cons( makeKeyword( "NEW-TACTIC" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "SPLIT-TACTICS-POSSIBLE" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword(
          "INITIALIZE-PROPERTIES" ), makeSymbol( "DEFAULT-STRATEGY-INITIALIZE-PROPERTIES" ) ), ConsesLow.cons( makeKeyword( "UPDATE-PROPERTIES" ), makeSymbol( "DEFAULT-STRATEGY-UPDATE-PROPERTIES" ) ), ConsesLow.cons(
              makeKeyword( "INFERENCE-DYNAMIC-PROPERTIES-UPDATED" ), makeSymbol( "DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED" ) ), ConsesLow.cons( makeKeyword( "RECONSIDER-SET-ASIDES" ), makeKeyword(
                  "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "THROW-AWAY-UNINTERESTING-SET-ASIDES" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "CONTINUATION-POSSIBLE?" ), makeSymbol(
                      "STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?" ) ), ConsesLow.cons( makeKeyword( "QUIESCE" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "NEW-ARGUMENT-LINK" ), makeKeyword(
                          "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "RELEVANT-TACTICS-WRT-REMOVAL" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "PROBLEM-COULD-BE-PENDING" ), makeKeyword(
                              "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "PROBLEM-NOTHING-TO-DO?" ), makeSymbol( "PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?" ) ), ConsesLow.cons( makeKeyword(
                                  "THROW-AWAY-PROBLEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "SET-ASIDE-PROBLEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword(
                                      "THROW-AWAY-TACTIC" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "SET-ASIDE-TACTIC" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword(
                                          "PEEK-NEXT-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "MOTIVATE-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword(
                                              "ACTIVATE-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "LINK-HEAD-MOTIVATED?" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons(
                                                  makeKeyword( "RECONSIDER-SPLIT-SET-ASIDES" ), makeSymbol( "ZERO" ) ), ConsesLow.cons( makeKeyword( "SUBSTRATEGY-STRATEGEM-MOTIVATED" ), makeKeyword( "MUST-OVERRIDE" ) ),
      ConsesLow.cons( makeKeyword( "SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL" ), makeKeyword(
          "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "SUBSTRATEGY-PROBLEM-STATUS-CHANGE" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "HAPPINESS-TABLE" ), makeSymbol( "NULL" ) )
    } );
    $list149 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeKeyword( "EARLY-REMOVAL-PRODUCTIVITY-LIMIT" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "PEEK-NEW-ROOT" ), makeKeyword(
        "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "ACTIVATE-NEW-ROOT" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "POP-NEW-ROOT" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons(
            makeKeyword( "NO-NEW-ROOTS" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "THROW-AWAY-NEW-ROOT" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword(
                "PEEK-REMOVAL-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "ACTIVATE-REMOVAL-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword(
                    "POP-REMOVAL-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "NO-ACTIVE-REMOVAL-STRATEGEMS" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword(
                        "PEEK-TRANSFORMATION-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "ACTIVATE-TRANSFORMATION-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons(
                            makeKeyword( "POP-TRANSFORMATION-STRATEGEM" ), makeKeyword( "MUST-OVERRIDE" ) ), ConsesLow.cons( makeKeyword( "NO-ACTIVE-TRANSFORMATION-STRATEGEMS" ), makeKeyword( "MUST-OVERRIDE" ) )
    } );
    $sym150$STRATEGY_TYPE_PROPERTY_P = makeSymbol( "STRATEGY-TYPE-PROPERTY-P" );
    $kw151$MUST_OVERRIDE = makeKeyword( "MUST-OVERRIDE" );
    $str152$Strategy_must_implement_method__s = makeString( "Strategy must implement method ~s" );
    $list153 = ConsesLow.list( makeKeyword( "ANSWER" ), makeKeyword( "BINDINGS" ), makeKeyword( "SUPPORTS" ), makeKeyword( "BINDINGS-AND-SUPPORTS" ), makeKeyword( "BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS" ),
        makeKeyword( "BINDINGS-AND-HYPOTHETICAL-BINDINGS" ) );
    $kw154$BINDINGS = makeKeyword( "BINDINGS" );
    $kw155$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw156$FORMAT = makeKeyword( "FORMAT" );
    $kw157$RETURN = makeKeyword( "RETURN" );
    $list158 = ConsesLow.list( makeKeyword( "EL" ), makeKeyword( "HL" ) );
    $kw159$EL = makeKeyword( "EL" );
    $kw160$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $list161 = ConsesLow.list( makeKeyword( "PROOF" ), makeKeyword( "BINDINGS" ) );
    $kw162$RESULT_UNIQUENESS = makeKeyword( "RESULT-UNIQUENESS" );
    $list163 = ConsesLow.list( makeKeyword( "REQUIRE-EQUAL" ), makeKeyword( "COMPUTE-INTERSECTION" ), makeKeyword( "COMPUTE-UNION" ) );
    $kw164$REQUIRE_EQUAL = makeKeyword( "REQUIRE-EQUAL" );
    $kw165$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $list166 = ConsesLow.list( makeKeyword( "NONE" ), makeKeyword( "FOCUSED" ), makeKeyword( "ALL" ) );
    $kw167$TRANSITIVE_CLOSURE_MODE = makeKeyword( "TRANSITIVE-CLOSURE-MODE" );
    $kw168$MAINTAIN_TERM_WORKING_SET_ = makeKeyword( "MAINTAIN-TERM-WORKING-SET?" );
    $kw169$EVENTS = makeKeyword( "EVENTS" );
    $list170 = ConsesLow.list( makeKeyword( "NEW-ANSWER" ), makeKeyword( "STATUS-CHANGE" ), makeKeyword( "NEW-TRANSFORMATION-DEPTH-REACHED" ), makeKeyword( "SKSI-QUERY" ) );
    $kw171$HALT_CONDITIONS = makeKeyword( "HALT-CONDITIONS" );
    $list172 = ConsesLow.list( makeKeyword( "LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS" ) );
    $list173 = ConsesLow.list( ConsesLow.cons( makeKeyword( "SKSI-QUERY-TOTAL-TIME-ACC" ), makeSymbol( "NEW-SUM-ACCUMULATOR" ) ), ConsesLow.cons( makeKeyword( "SKSI-QUERY-START-TIMES-ACC" ), makeSymbol(
        "NEW-LIST-ACCUMULATOR" ) ), ConsesLow.cons( makeKeyword( "SPARQL-QUERY-PROFILE-ACC" ), makeSymbol( "NEW-LIST-ACCUMULATOR" ) ) );
    $sym174$INFERENCE_ACCUMULATOR_TYPE_P = makeSymbol( "INFERENCE-ACCUMULATOR-TYPE-P" );
    $kw175$FORGET_EXTRA_RESULTS_ = makeKeyword( "FORGET-EXTRA-RESULTS?" );
    $kw176$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $kw177$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw178$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw179$BLOCK_ = makeKeyword( "BLOCK?" );
    $kw180$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $kw181$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $kw182$NON_EXPLANATORY_SENTENCE = makeKeyword( "NON-EXPLANATORY-SENTENCE" );
    $sym183$INFERENCE_P = makeSymbol( "INFERENCE-P" );
  }

  public static final class $query_static_property_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $query_static_property_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "QUERY-STATIC-PROPERTY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return query_static_property_p( arg1 );
    }
  }

  public static final class $query_dynamic_property_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $query_dynamic_property_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "QUERY-DYNAMIC-PROPERTY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return query_dynamic_property_p( arg1 );
    }
  }

  public static final class $inference_query_metric_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_query_metric_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-QUERY-METRIC-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_query_metric_p( arg1 );
    }
  }

  public static final class $inference_static_property_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_static_property_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-STATIC-PROPERTY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_static_property_p( arg1 );
    }
  }

  public static final class $inference_dynamic_property_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_dynamic_property_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-DYNAMIC-PROPERTY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_dynamic_property_p( arg1 );
    }
  }

  public static final class $strategy_static_property_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $strategy_static_property_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "STRATEGY-STATIC-PROPERTY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return strategy_static_property_p( arg1 );
    }
  }

  public static final class $strategy_dynamic_property_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $strategy_dynamic_property_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "STRATEGY-DYNAMIC-PROPERTY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return strategy_dynamic_property_p( arg1 );
    }
  }

  public static final class $problem_store_property_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $problem_store_property_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PROBLEM-STORE-PROPERTY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return problem_store_property_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 488 ms
 * 
 */