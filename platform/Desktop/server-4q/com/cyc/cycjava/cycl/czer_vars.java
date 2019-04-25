package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class czer_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.czer_vars";
  public static final String myFingerPrint = "66633f58aefd67cbbbeb5fbb15496653f8bc09240f797e2ea41a0ff598384b15";
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 387L)
  public static SubLSymbol $required_arg_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 689L)
  public static SubLSymbol $arg_positions$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 839L)
  public static SubLSymbol $accumulating_semantic_violationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 950L)
  public static SubLSymbol $semantic_violations$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 1073L)
  public static SubLSymbol $assertion_key$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 1202L)
  public static SubLSymbol $nart_key$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 1317L)
  public static SubLSymbol $rf_key$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 1469L)
  public static SubLSymbol $implication_operators$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 1571L)
  public static SubLSymbol $logical_operators$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 1970L)
  public static SubLSymbol $skolem_function_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 2263L)
  public static SubLSymbol $arg_isa_binary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 2382L)
  public static SubLSymbol $arg_isa_ternary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 2692L)
  public static SubLSymbol $arg_not_isa_binary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 2836L)
  public static SubLSymbol $arg_not_isa_ternary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 2902L)
  public static SubLSymbol $arg_quoted_isa_binary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 3082L)
  public static SubLSymbol $arg_quoted_isa_ternary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 3176L)
  public static SubLSymbol $arg_genl_binary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 3303L)
  public static SubLSymbol $arg_genl_ternary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 3381L)
  public static SubLSymbol $arg_format_binary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 3511L)
  public static SubLSymbol $arg_format_ternary_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 3576L)
  public static SubLSymbol $meta_arg_type$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 3664L)
  public static SubLSymbol $possibly_meta_arg_type$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 3761L)
  public static SubLSymbol $variables_that_cannot_be_sequence_variables$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 3964L)
  public static SubLSymbol $el_supports_dot_syntaxP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 4054L)
  public static SubLSymbol $el_supports_variable_arity_skolemsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 4117L)
  public static SubLSymbol $el_supports_contractionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 4236L)
  public static SubLSymbol $inside_quote$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 4329L)
  public static SubLSymbol $fi_last_assertions_asserted$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 4382L)
  public static SubLSymbol $new_canonicalizerP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 4713L)
  public static SubLSymbol $within_canonicalizerP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 4850L)
  public static SubLSymbol $form_of_clausal_form$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 4945L)
  public static SubLSymbol $must_enforce_semanticsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 5037L)
  public static SubLSymbol $el_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 5131L)
  public static SubLSymbol $canon_verboseP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 5295L)
  public static SubLSymbol $varP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 5378L)
  public static SubLSymbol $subordinate_fi_opsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 5429L)
  public static SubLSymbol $cryP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 5499L)
  public static SubLSymbol $minimal_skolem_arityP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 5709L)
  public static SubLSymbol $skolemize_during_asksP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 5867L)
  public static SubLSymbol $drop_all_existentialsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 6327L)
  public static SubLSymbol $leave_skolem_constants_aloneP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 6849L)
  public static SubLSymbol $forbid_quantified_sequence_variablesP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 7271L)
  public static SubLSymbol $use_skolem_constantsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 7431L)
  public static SubLSymbol $canonicalize_gaf_commutative_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 7544L)
  public static SubLSymbol $canon_var_function$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 7867L)
  public static SubLSymbol $canonical_variable_type$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 8011L)
  public static SubLSymbol $standardize_variables_memory$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 8176L)
  public static SubLSymbol $distributing_meta_knowledgeP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 8307L)
  public static SubLSymbol $distribute_meta_over_common_elP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 8484L)
  public static SubLSymbol $find_uncanonical_decontextualized_assertionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 8793L)
  public static SubLSymbol $canonicalize_el_template_vars_during_queriesP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 9478L)
  public static SubLSymbol $robust_assertion_lookup$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 9945L)
  public static SubLSymbol $robust_nart_lookup$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 10183L)
  public static SubLSymbol $recanonicalizing_candidate_natP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 10324L)
  public static SubLSymbol $el_var_blist$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 10477L)
  public static SubLSymbol $gathering_quantified_fn_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 10600L)
  public static SubLSymbol $expand_el_relationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 10725L)
  public static SubLSymbol $canonicalize_all_sentence_argsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 10897L)
  public static SubLSymbol $canonicalize_tensed_literalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11036L)
  public static SubLSymbol $add_term_of_unit_litsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11088L)
  public static SubLSymbol $turn_existentials_into_skolemsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11229L)
  public static SubLSymbol $reify_skolemsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11273L)
  public static SubLSymbol $create_narts_regardless_of_whether_within_assertP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11354L)
  public static SubLSymbol $disable_create_narts_regardless_of_whether_within_assertP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11597L)
  public static SubLSymbol $canonicalize_functionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11650L)
  public static SubLSymbol $canonicalize_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11699L)
  public static SubLSymbol $canonicalize_literalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11751L)
  public static SubLSymbol $canonicalize_disjunction_as_enumerationP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11916L)
  public static SubLSymbol $canonicalize_variablesP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 11969L)
  public static SubLSymbol $implicitify_universalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 12189L)
  public static SubLSymbol $assume_free_vars_are_existentially_boundP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 12471L)
  public static SubLSymbol $encapsulate_var_formulaP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 12608L)
  public static SubLSymbol $encapsulate_intensional_formulaP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 12781L)
  public static SubLSymbol $czer_quiescence_iteration_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 12934L)
  public static SubLSymbol $clause_el_var_names$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 12986L)
  public static SubLSymbol $el_symbol_suffix_table$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 13087L)
  public static SubLSymbol $within_negationP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 13195L)
  public static SubLSymbol $hl_pred_order$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 13388L)
  public static SubLSymbol $controlP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 13521L)
  public static SubLSymbol $control_1$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 13654L)
  public static SubLSymbol $control_2$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 13788L)
  public static SubLSymbol $control_3$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 13921L)
  public static SubLSymbol $control_4$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 14054L)
  public static SubLSymbol $control_5$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 14187L)
  public static SubLSymbol $control_6$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 14320L)
  public static SubLSymbol $control_ecaP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 14456L)
  public static SubLSymbol $czer_memoization_state$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 14576L)
  public static SubLSymbol $use_czer_fort_typesP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 14667L)
  public static SubLSymbol $use_czer_fort_types_globallyP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 14889L)
  public static SubLSymbol $canonicalizer_directive_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 15239L)
  public static SubLSymbol $assume_hlmt_is_canonicalP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 15410L)
  public static SubLSymbol $ununiquify_el_varsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 15612L)
  public static SubLSymbol $unremove_universalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 15747L)
  public static SubLSymbol $uncanonicalize_tensed_literalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 15898L)
  public static SubLSymbol $recanonicalizingP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 16056L)
  public static SubLSymbol $recanonicalizing_candidate_assertion_stack$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 16161L)
  public static SubLSymbol $noting_ill_formed_meta_argsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 16299L)
  public static SubLSymbol $recan_ill_formed_meta_argsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 16541L)
  public static SubLSymbol $simplify_sentenceP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 16635L)
  public static SubLSymbol $simplify_literalP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 16682L)
  public static SubLSymbol $simplify_implicationP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 16733L)
  public static SubLSymbol $simplify_non_wff_literalP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 16841L)
  public static SubLSymbol $try_to_simplify_non_wff_into_wffP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 17019L)
  public static SubLSymbol $trying_to_simplify_non_wff_into_wffP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 17184L)
  public static SubLSymbol $simplify_using_semanticsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 17317L)
  public static SubLSymbol $simplify_redundanciesP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 17452L)
  public static SubLSymbol $simplify_transitive_redundanciesP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 17613L)
  public static SubLSymbol $simplify_contradictionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 17804L)
  public static SubLSymbol $simplify_sequence_vars_using_kb_arityP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 18089L)
  public static SubLSymbol $sequence_variable_split_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 18406L)
  public static SubLSymbol $simplify_equality_literalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 18740L)
  public static SubLSymbol $simplify_true_sentence_awayP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 18964L)
  public static SubLSymbol $skolem_axiom_table$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 19105L)
  public static SubLSymbol $infer_skolem_result_isa_via_arg_constraintsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 19300L)
  public static SubLSymbol $interpolate_singleton_arg_isaP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 19439L)
  public static SubLSymbol $clothe_naked_skolemsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 19869L)
  public static SubLSymbol $preds_of_computed_skolem_gafs$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 20231L)
  public static SubLSymbol $preds_of_editable_skolem_gafs$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 20850L)
  public static SubLSymbol $empty_skolems$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 20990L)
  public static SubLSymbol $mal_skolems$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21114L)
  public static SubLSymbol $express_as_rule_macroP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21218L)
  public static SubLSymbol $express_as_genlsP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21292L)
  public static SubLSymbol $express_as_arg_isaP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21343L)
  public static SubLSymbol $express_as_arg_genlP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21474L)
  public static SubLSymbol $express_as_genl_predicatesP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21533L)
  public static SubLSymbol $express_as_genl_inverseP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21589L)
  public static SubLSymbol $express_as_inter_arg_isaP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21646L)
  public static SubLSymbol $express_as_disjoint_withP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21704L)
  public static SubLSymbol $express_as_negation_predicatesP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21767L)
  public static SubLSymbol $express_as_negation_inverseP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21827L)
  public static SubLSymbol $express_as_reflexiveP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21881L)
  public static SubLSymbol $express_as_symmetricP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21934L)
  public static SubLSymbol $express_as_transitiveP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 21988L)
  public static SubLSymbol $express_as_irreflexiveP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22043L)
  public static SubLSymbol $express_as_asymmetricP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22097L)
  public static SubLSymbol $express_as_relation_typeP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22180L)
  public static SubLSymbol $express_as_required_arg_predP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22241L)
  public static SubLSymbol $tense_czer_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22325L)
  private static SubLSymbol $valid_tense_czer_modes$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$ASSERTION_FORMULA;
  private static final SubLSymbol $sym3$NART_HL_FORMULA;
  private static final SubLSymbol $sym4$RF_FORMULA;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLObject $const18$CycLAssertion;
  private static final SubLObject $const19$CycLIndexedTerm;
  private static final SubLSymbol $sym20$_FI_LAST_ASSERTIONS_ASSERTED_;
  private static final SubLSymbol $sym21$EL_VAR_;
  private static final SubLSymbol $kw22$ASSERT_ONLY;
  private static final SubLSymbol $kw23$DEFAULT;
  private static final SubLSymbol $kw24$KB_VAR;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$_SKOLEM_AXIOM_TABLE_;
  private static final SubLInteger $int28$2048;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$ASSERT;
  private static final SubLSymbol $kw34$QUERY;
  private static final SubLString $str35$Canonicalizer_tense_mode_not_set_;

  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22399L)
  public static SubLObject valid_tense_czer_mode_p(final SubLObject mode)
  {
    return list_utilities.member_eqP( mode, $valid_tense_czer_modes$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22501L)
  public static SubLObject get_tense_czer_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $tense_czer_mode$.getDynamicValue( thread ) != $kw23$DEFAULT )
    {
      return $tense_czer_mode$.getDynamicValue( thread );
    }
    if( NIL != control_vars.$within_assert$.getDynamicValue( thread ) )
    {
      return $kw33$ASSERT;
    }
    if( NIL != control_vars.$within_ask$.getDynamicValue( thread ) )
    {
      return $kw34$QUERY;
    }
    Errors.warn( $str35$Canonicalizer_tense_mode_not_set_ );
    return $kw23$DEFAULT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22758L)
  public static SubLObject within_assert_tense_czer_modeP()
  {
    return Equality.eq( get_tense_czer_mode(), $kw33$ASSERT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22855L)
  public static SubLObject within_query_tense_czer_modeP()
  {
    return Equality.eq( get_tense_czer_mode(), $kw34$QUERY );
  }

  public static SubLObject declare_czer_vars_file()
  {
    SubLFiles.declareFunction( me, "valid_tense_czer_mode_p", "VALID-TENSE-CZER-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_tense_czer_mode", "GET-TENSE-CZER-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "within_assert_tense_czer_modeP", "WITHIN-ASSERT-TENSE-CZER-MODE?", 0, 0, false );
    SubLFiles.declareFunction( me, "within_query_tense_czer_modeP", "WITHIN-QUERY-TENSE-CZER-MODE?", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_czer_vars_file()
  {
    $required_arg_preds$ = SubLFiles.defparameter( "*REQUIRED-ARG-PREDS*", $list0 );
    $arg_positions$ = SubLFiles.deflexical( "*ARG-POSITIONS*", $list1 );
    $accumulating_semantic_violationsP$ = SubLFiles.defparameter( "*ACCUMULATING-SEMANTIC-VIOLATIONS?*", NIL );
    $semantic_violations$ = SubLFiles.defparameter( "*SEMANTIC-VIOLATIONS*", NIL );
    $assertion_key$ = SubLFiles.defparameter( "*ASSERTION-KEY*", $sym2$ASSERTION_FORMULA );
    $nart_key$ = SubLFiles.defparameter( "*NART-KEY*", $sym3$NART_HL_FORMULA );
    $rf_key$ = SubLFiles.defparameter( "*RF-KEY*", $sym4$RF_FORMULA );
    $implication_operators$ = SubLFiles.deflexical( "*IMPLICATION-OPERATORS*", $list5 );
    $logical_operators$ = SubLFiles.deflexical( "*LOGICAL-OPERATORS*", $list6 );
    $skolem_function_functions$ = SubLFiles.deflexical( "*SKOLEM-FUNCTION-FUNCTIONS*", $list7 );
    $arg_isa_binary_preds$ = SubLFiles.deflexical( "*ARG-ISA-BINARY-PREDS*", $list8 );
    $arg_isa_ternary_preds$ = SubLFiles.deflexical( "*ARG-ISA-TERNARY-PREDS*", $list9 );
    $arg_not_isa_binary_preds$ = SubLFiles.deflexical( "*ARG-NOT-ISA-BINARY-PREDS*", $list10 );
    $arg_not_isa_ternary_preds$ = SubLFiles.deflexical( "*ARG-NOT-ISA-TERNARY-PREDS*", $list11 );
    $arg_quoted_isa_binary_preds$ = SubLFiles.deflexical( "*ARG-QUOTED-ISA-BINARY-PREDS*", $list12 );
    $arg_quoted_isa_ternary_preds$ = SubLFiles.deflexical( "*ARG-QUOTED-ISA-TERNARY-PREDS*", $list13 );
    $arg_genl_binary_preds$ = SubLFiles.deflexical( "*ARG-GENL-BINARY-PREDS*", $list14 );
    $arg_genl_ternary_preds$ = SubLFiles.deflexical( "*ARG-GENL-TERNARY-PREDS*", $list15 );
    $arg_format_binary_preds$ = SubLFiles.deflexical( "*ARG-FORMAT-BINARY-PREDS*", $list16 );
    $arg_format_ternary_preds$ = SubLFiles.deflexical( "*ARG-FORMAT-TERNARY-PREDS*", $list17 );
    $meta_arg_type$ = SubLFiles.deflexical( "*META-ARG-TYPE*", $const18$CycLAssertion );
    $possibly_meta_arg_type$ = SubLFiles.deflexical( "*POSSIBLY-META-ARG-TYPE*", $const19$CycLIndexedTerm );
    $variables_that_cannot_be_sequence_variables$ = SubLFiles.defparameter( "*VARIABLES-THAT-CANNOT-BE-SEQUENCE-VARIABLES*", NIL );
    $el_supports_dot_syntaxP$ = SubLFiles.defparameter( "*EL-SUPPORTS-DOT-SYNTAX?*", T );
    $el_supports_variable_arity_skolemsP$ = SubLFiles.deflexical( "*EL-SUPPORTS-VARIABLE-ARITY-SKOLEMS?*", T );
    $el_supports_contractionsP$ = SubLFiles.defparameter( "*EL-SUPPORTS-CONTRACTIONS?*", NIL );
    $inside_quote$ = SubLFiles.defvar( "*INSIDE-QUOTE*", NIL );
    $fi_last_assertions_asserted$ = SubLFiles.defparameter( "*FI-LAST-ASSERTIONS-ASSERTED*", NIL );
    $new_canonicalizerP$ = SubLFiles.defparameter( "*NEW-CANONICALIZER?*", NIL );
    $within_canonicalizerP$ = SubLFiles.defparameter( "*WITHIN-CANONICALIZER?*", NIL );
    $form_of_clausal_form$ = SubLFiles.defparameter( "*FORM-OF-CLAUSAL-FORM*", NIL );
    $must_enforce_semanticsP$ = SubLFiles.defparameter( "*MUST-ENFORCE-SEMANTICS?*", NIL );
    $el_trace_level$ = SubLFiles.defparameter( "*EL-TRACE-LEVEL*", ZERO_INTEGER );
    $canon_verboseP$ = SubLFiles.defparameter( "*CANON-VERBOSE?*", NIL );
    $varP$ = SubLFiles.defparameter( "*VAR?*", $sym21$EL_VAR_ );
    $subordinate_fi_opsP$ = SubLFiles.defparameter( "*SUBORDINATE-FI-OPS?*", NIL );
    $cryP$ = SubLFiles.defparameter( "*CRY?*", T );
    $minimal_skolem_arityP$ = SubLFiles.defparameter( "*MINIMAL-SKOLEM-ARITY?*", NIL );
    $skolemize_during_asksP$ = SubLFiles.defparameter( "*SKOLEMIZE-DURING-ASKS?*", NIL );
    $drop_all_existentialsP$ = SubLFiles.defparameter( "*DROP-ALL-EXISTENTIALS?*", NIL );
    $leave_skolem_constants_aloneP$ = SubLFiles.defparameter( "*LEAVE-SKOLEM-CONSTANTS-ALONE?*", NIL );
    $forbid_quantified_sequence_variablesP$ = SubLFiles.defparameter( "*FORBID-QUANTIFIED-SEQUENCE-VARIABLES?*", $kw22$ASSERT_ONLY );
    $use_skolem_constantsP$ = SubLFiles.defparameter( "*USE-SKOLEM-CONSTANTS?*", NIL );
    $canonicalize_gaf_commutative_termsP$ = SubLFiles.defparameter( "*CANONICALIZE-GAF-COMMUTATIVE-TERMS?*", T );
    $canon_var_function$ = SubLFiles.defparameter( "*CANON-VAR-FUNCTION*", $kw23$DEFAULT );
    $canonical_variable_type$ = SubLFiles.defparameter( "*CANONICAL-VARIABLE-TYPE*", $kw24$KB_VAR );
    $standardize_variables_memory$ = SubLFiles.defparameter( "*STANDARDIZE-VARIABLES-MEMORY*", NIL );
    $distributing_meta_knowledgeP$ = SubLFiles.defparameter( "*DISTRIBUTING-META-KNOWLEDGE?*", NIL );
    $distribute_meta_over_common_elP$ = SubLFiles.defparameter( "*DISTRIBUTE-META-OVER-COMMON-EL?*", T );
    $find_uncanonical_decontextualized_assertionsP$ = SubLFiles.defparameter( "*FIND-UNCANONICAL-DECONTEXTUALIZED-ASSERTIONS?*", T );
    $canonicalize_el_template_vars_during_queriesP$ = SubLFiles.defparameter( "*CANONICALIZE-EL-TEMPLATE-VARS-DURING-QUERIES?*", T );
    $robust_assertion_lookup$ = SubLFiles.defparameter( "*ROBUST-ASSERTION-LOOKUP*", NIL );
    $robust_nart_lookup$ = SubLFiles.defparameter( "*ROBUST-NART-LOOKUP*", $kw23$DEFAULT );
    $recanonicalizing_candidate_natP$ = SubLFiles.defparameter( "*RECANONICALIZING-CANDIDATE-NAT?*", NIL );
    $el_var_blist$ = SubLFiles.defparameter( "*EL-VAR-BLIST*", NIL );
    $gathering_quantified_fn_termsP$ = SubLFiles.defparameter( "*GATHERING-QUANTIFIED-FN-TERMS?*", NIL );
    $expand_el_relationsP$ = SubLFiles.defparameter( "*EXPAND-EL-RELATIONS?*", T );
    $canonicalize_all_sentence_argsP$ = SubLFiles.defparameter( "*CANONICALIZE-ALL-SENTENCE-ARGS?*", NIL );
    $canonicalize_tensed_literalsP$ = SubLFiles.defparameter( "*CANONICALIZE-TENSED-LITERALS?*", T );
    $add_term_of_unit_litsP$ = SubLFiles.defparameter( "*ADD-TERM-OF-UNIT-LITS?*", T );
    $turn_existentials_into_skolemsP$ = SubLFiles.defparameter( "*TURN-EXISTENTIALS-INTO-SKOLEMS?*", T );
    $reify_skolemsP$ = SubLFiles.defparameter( "*REIFY-SKOLEMS?*", T );
    $create_narts_regardless_of_whether_within_assertP$ = SubLFiles.defparameter( "*CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", NIL );
    $disable_create_narts_regardless_of_whether_within_assertP$ = SubLFiles.defparameter( "*DISABLE-CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", NIL );
    $canonicalize_functionsP$ = SubLFiles.defparameter( "*CANONICALIZE-FUNCTIONS?*", T );
    $canonicalize_termsP$ = SubLFiles.defparameter( "*CANONICALIZE-TERMS?*", T );
    $canonicalize_literalsP$ = SubLFiles.defparameter( "*CANONICALIZE-LITERALS?*", T );
    $canonicalize_disjunction_as_enumerationP$ = SubLFiles.defparameter( "*CANONICALIZE-DISJUNCTION-AS-ENUMERATION?*", NIL );
    $canonicalize_variablesP$ = SubLFiles.defparameter( "*CANONICALIZE-VARIABLES?*", T );
    $implicitify_universalsP$ = SubLFiles.defparameter( "*IMPLICITIFY-UNIVERSALS?*", T );
    $assume_free_vars_are_existentially_boundP$ = SubLFiles.defparameter( "*ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?*", NIL );
    $encapsulate_var_formulaP$ = SubLFiles.defparameter( "*ENCAPSULATE-VAR-FORMULA?*", T );
    $encapsulate_intensional_formulaP$ = SubLFiles.defparameter( "*ENCAPSULATE-INTENSIONAL-FORMULA?*", T );
    $czer_quiescence_iteration_limit$ = SubLFiles.defparameter( "*CZER-QUIESCENCE-ITERATION-LIMIT*", TEN_INTEGER );
    $clause_el_var_names$ = SubLFiles.defparameter( "*CLAUSE-EL-VAR-NAMES*", NIL );
    $el_symbol_suffix_table$ = SubLFiles.defparameter( "*EL-SYMBOL-SUFFIX-TABLE*", NIL );
    $within_negationP$ = SubLFiles.defparameter( "*WITHIN-NEGATION?*", NIL );
    $hl_pred_order$ = SubLFiles.deflexical( "*HL-PRED-ORDER*", $list25 );
    $controlP$ = SubLFiles.defparameter( "*CONTROL?*", NIL );
    $control_1$ = SubLFiles.defparameter( "*CONTROL-1*", NIL );
    $control_2$ = SubLFiles.defparameter( "*CONTROL-2*", NIL );
    $control_3$ = SubLFiles.defparameter( "*CONTROL-3*", NIL );
    $control_4$ = SubLFiles.defparameter( "*CONTROL-4*", NIL );
    $control_5$ = SubLFiles.defparameter( "*CONTROL-5*", NIL );
    $control_6$ = SubLFiles.defparameter( "*CONTROL-6*", NIL );
    $control_ecaP$ = SubLFiles.defparameter( "*CONTROL-ECA?*", NIL );
    $czer_memoization_state$ = SubLFiles.defparameter( "*CZER-MEMOIZATION-STATE*", NIL );
    $use_czer_fort_typesP$ = SubLFiles.defparameter( "*USE-CZER-FORT-TYPES?*", T );
    $use_czer_fort_types_globallyP$ = SubLFiles.defparameter( "*USE-CZER-FORT-TYPES-GLOBALLY?*", T );
    $canonicalizer_directive_predicates$ = SubLFiles.deflexical( "*CANONICALIZER-DIRECTIVE-PREDICATES*", $list26 );
    $assume_hlmt_is_canonicalP$ = SubLFiles.defparameter( "*ASSUME-HLMT-IS-CANONICAL?*", NIL );
    $ununiquify_el_varsP$ = SubLFiles.defparameter( "*UNUNIQUIFY-EL-VARS?*", NIL );
    $unremove_universalsP$ = SubLFiles.defparameter( "*UNREMOVE-UNIVERSALS?*", T );
    $uncanonicalize_tensed_literalsP$ = SubLFiles.defparameter( "*UNCANONICALIZE-TENSED-LITERALS?*", T );
    $recanonicalizingP$ = SubLFiles.defparameter( "*RECANONICALIZING?*", NIL );
    $recanonicalizing_candidate_assertion_stack$ = SubLFiles.defparameter( "*RECANONICALIZING-CANDIDATE-ASSERTION-STACK*", NIL );
    $noting_ill_formed_meta_argsP$ = SubLFiles.defparameter( "*NOTING-ILL-FORMED-META-ARGS?*", NIL );
    $recan_ill_formed_meta_argsP$ = SubLFiles.defparameter( "*RECAN-ILL-FORMED-META-ARGS?*", NIL );
    $simplify_sentenceP$ = SubLFiles.defparameter( "*SIMPLIFY-SENTENCE?*", T );
    $simplify_literalP$ = SubLFiles.defparameter( "*SIMPLIFY-LITERAL?*", T );
    $simplify_implicationP$ = SubLFiles.defparameter( "*SIMPLIFY-IMPLICATION?*", T );
    $simplify_non_wff_literalP$ = SubLFiles.defparameter( "*SIMPLIFY-NON-WFF-LITERAL?*", T );
    $try_to_simplify_non_wff_into_wffP$ = SubLFiles.defparameter( "*TRY-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", T );
    $trying_to_simplify_non_wff_into_wffP$ = SubLFiles.defparameter( "*TRYING-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", NIL );
    $simplify_using_semanticsP$ = SubLFiles.defparameter( "*SIMPLIFY-USING-SEMANTICS?*", T );
    $simplify_redundanciesP$ = SubLFiles.defparameter( "*SIMPLIFY-REDUNDANCIES?*", NIL );
    $simplify_transitive_redundanciesP$ = SubLFiles.defparameter( "*SIMPLIFY-TRANSITIVE-REDUNDANCIES?*", NIL );
    $simplify_contradictionsP$ = SubLFiles.defparameter( "*SIMPLIFY-CONTRADICTIONS?*", NIL );
    $simplify_sequence_vars_using_kb_arityP$ = SubLFiles.defparameter( "*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*", T );
    $sequence_variable_split_limit$ = SubLFiles.defparameter( "*SEQUENCE-VARIABLE-SPLIT-LIMIT*", FIVE_INTEGER );
    $simplify_equality_literalsP$ = SubLFiles.defparameter( "*SIMPLIFY-EQUALITY-LITERALS?*", NIL );
    $simplify_true_sentence_awayP$ = SubLFiles.defparameter( "*SIMPLIFY-TRUE-SENTENCE-AWAY?*", NIL );
    $skolem_axiom_table$ = SubLFiles.deflexical( "*SKOLEM-AXIOM-TABLE*", maybeDefault( $sym27$_SKOLEM_AXIOM_TABLE_, $skolem_axiom_table$, () -> ( Hashtables.make_hash_table( $int28$2048, Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) ) ) );
    $infer_skolem_result_isa_via_arg_constraintsP$ = SubLFiles.defparameter( "*INFER-SKOLEM-RESULT-ISA-VIA-ARG-CONSTRAINTS?*", T );
    $interpolate_singleton_arg_isaP$ = SubLFiles.defparameter( "*INTERPOLATE-SINGLETON-ARG-ISA?*", NIL );
    $clothe_naked_skolemsP$ = SubLFiles.defparameter( "*CLOTHE-NAKED-SKOLEMS?*", NIL );
    $preds_of_computed_skolem_gafs$ = SubLFiles.defparameter( "*PREDS-OF-COMPUTED-SKOLEM-GAFS*", $list29 );
    $preds_of_editable_skolem_gafs$ = SubLFiles.deflexical( "*PREDS-OF-EDITABLE-SKOLEM-GAFS*", ConsesLow.append( new SubLObject[] { $list30, $arg_isa_binary_preds$.getGlobalValue(), $arg_isa_ternary_preds$
        .getGlobalValue(), $arg_quoted_isa_binary_preds$.getGlobalValue(), $arg_quoted_isa_ternary_preds$.getGlobalValue(), $list31
    } ) );
    $empty_skolems$ = SubLFiles.defparameter( "*EMPTY-SKOLEMS*", NIL );
    $mal_skolems$ = SubLFiles.defparameter( "*MAL-SKOLEMS*", NIL );
    $express_as_rule_macroP$ = SubLFiles.defparameter( "*EXPRESS-AS-RULE-MACRO?*", NIL );
    $express_as_genlsP$ = SubLFiles.defparameter( "*EXPRESS-AS-GENLS?*", NIL );
    $express_as_arg_isaP$ = SubLFiles.defparameter( "*EXPRESS-AS-ARG-ISA?*", NIL );
    $express_as_arg_genlP$ = SubLFiles.defparameter( "*EXPRESS-AS-ARG-GENL?*", NIL );
    $express_as_genl_predicatesP$ = SubLFiles.defparameter( "*EXPRESS-AS-GENL-PREDICATES?*", NIL );
    $express_as_genl_inverseP$ = SubLFiles.defparameter( "*EXPRESS-AS-GENL-INVERSE?*", NIL );
    $express_as_inter_arg_isaP$ = SubLFiles.defparameter( "*EXPRESS-AS-INTER-ARG-ISA?*", NIL );
    $express_as_disjoint_withP$ = SubLFiles.defparameter( "*EXPRESS-AS-DISJOINT-WITH?*", NIL );
    $express_as_negation_predicatesP$ = SubLFiles.defparameter( "*EXPRESS-AS-NEGATION-PREDICATES?*", NIL );
    $express_as_negation_inverseP$ = SubLFiles.defparameter( "*EXPRESS-AS-NEGATION-INVERSE?*", NIL );
    $express_as_reflexiveP$ = SubLFiles.defparameter( "*EXPRESS-AS-REFLEXIVE?*", NIL );
    $express_as_symmetricP$ = SubLFiles.defparameter( "*EXPRESS-AS-SYMMETRIC?*", NIL );
    $express_as_transitiveP$ = SubLFiles.defparameter( "*EXPRESS-AS-TRANSITIVE?*", NIL );
    $express_as_irreflexiveP$ = SubLFiles.defparameter( "*EXPRESS-AS-IRREFLEXIVE?*", NIL );
    $express_as_asymmetricP$ = SubLFiles.defparameter( "*EXPRESS-AS-ASYMMETRIC?*", NIL );
    $express_as_relation_typeP$ = SubLFiles.defparameter( "*EXPRESS-AS-RELATION-TYPE?*", NIL );
    $express_as_required_arg_predP$ = SubLFiles.defparameter( "*EXPRESS-AS-REQUIRED-ARG-PRED?*", NIL );
    $tense_czer_mode$ = SubLFiles.defparameter( "*TENSE-CZER-MODE*", $kw23$DEFAULT );
    $valid_tense_czer_modes$ = SubLFiles.deflexical( "*VALID-TENSE-CZER-MODES*", $list32 );
    return NIL;
  }

  public static SubLObject setup_czer_vars_file()
  {
    utilities_macros.register_html_state_variable( $sym20$_FI_LAST_ASSERTIONS_ASSERTED_ );
    final SubLObject item_var = $sym20$_FI_LAST_ASSERTIONS_ASSERTED_;
    if( NIL == conses_high.member( item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$fi_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$fi_state_variables$.getGlobalValue() ) );
    }
    subl_macro_promotions.declare_defglobal( $sym27$_SKOLEM_AXIOM_TABLE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_czer_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_czer_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_czer_vars_file();
  }
  static
  {
    me = new czer_vars();
    $required_arg_preds$ = null;
    $arg_positions$ = null;
    $accumulating_semantic_violationsP$ = null;
    $semantic_violations$ = null;
    $assertion_key$ = null;
    $nart_key$ = null;
    $rf_key$ = null;
    $implication_operators$ = null;
    $logical_operators$ = null;
    $skolem_function_functions$ = null;
    $arg_isa_binary_preds$ = null;
    $arg_isa_ternary_preds$ = null;
    $arg_not_isa_binary_preds$ = null;
    $arg_not_isa_ternary_preds$ = null;
    $arg_quoted_isa_binary_preds$ = null;
    $arg_quoted_isa_ternary_preds$ = null;
    $arg_genl_binary_preds$ = null;
    $arg_genl_ternary_preds$ = null;
    $arg_format_binary_preds$ = null;
    $arg_format_ternary_preds$ = null;
    $meta_arg_type$ = null;
    $possibly_meta_arg_type$ = null;
    $variables_that_cannot_be_sequence_variables$ = null;
    $el_supports_dot_syntaxP$ = null;
    $el_supports_variable_arity_skolemsP$ = null;
    $el_supports_contractionsP$ = null;
    $inside_quote$ = null;
    $fi_last_assertions_asserted$ = null;
    $new_canonicalizerP$ = null;
    $within_canonicalizerP$ = null;
    $form_of_clausal_form$ = null;
    $must_enforce_semanticsP$ = null;
    $el_trace_level$ = null;
    $canon_verboseP$ = null;
    $varP$ = null;
    $subordinate_fi_opsP$ = null;
    $cryP$ = null;
    $minimal_skolem_arityP$ = null;
    $skolemize_during_asksP$ = null;
    $drop_all_existentialsP$ = null;
    $leave_skolem_constants_aloneP$ = null;
    $forbid_quantified_sequence_variablesP$ = null;
    $use_skolem_constantsP$ = null;
    $canonicalize_gaf_commutative_termsP$ = null;
    $canon_var_function$ = null;
    $canonical_variable_type$ = null;
    $standardize_variables_memory$ = null;
    $distributing_meta_knowledgeP$ = null;
    $distribute_meta_over_common_elP$ = null;
    $find_uncanonical_decontextualized_assertionsP$ = null;
    $canonicalize_el_template_vars_during_queriesP$ = null;
    $robust_assertion_lookup$ = null;
    $robust_nart_lookup$ = null;
    $recanonicalizing_candidate_natP$ = null;
    $el_var_blist$ = null;
    $gathering_quantified_fn_termsP$ = null;
    $expand_el_relationsP$ = null;
    $canonicalize_all_sentence_argsP$ = null;
    $canonicalize_tensed_literalsP$ = null;
    $add_term_of_unit_litsP$ = null;
    $turn_existentials_into_skolemsP$ = null;
    $reify_skolemsP$ = null;
    $create_narts_regardless_of_whether_within_assertP$ = null;
    $disable_create_narts_regardless_of_whether_within_assertP$ = null;
    $canonicalize_functionsP$ = null;
    $canonicalize_termsP$ = null;
    $canonicalize_literalsP$ = null;
    $canonicalize_disjunction_as_enumerationP$ = null;
    $canonicalize_variablesP$ = null;
    $implicitify_universalsP$ = null;
    $assume_free_vars_are_existentially_boundP$ = null;
    $encapsulate_var_formulaP$ = null;
    $encapsulate_intensional_formulaP$ = null;
    $czer_quiescence_iteration_limit$ = null;
    $clause_el_var_names$ = null;
    $el_symbol_suffix_table$ = null;
    $within_negationP$ = null;
    $hl_pred_order$ = null;
    $controlP$ = null;
    $control_1$ = null;
    $control_2$ = null;
    $control_3$ = null;
    $control_4$ = null;
    $control_5$ = null;
    $control_6$ = null;
    $control_ecaP$ = null;
    $czer_memoization_state$ = null;
    $use_czer_fort_typesP$ = null;
    $use_czer_fort_types_globallyP$ = null;
    $canonicalizer_directive_predicates$ = null;
    $assume_hlmt_is_canonicalP$ = null;
    $ununiquify_el_varsP$ = null;
    $unremove_universalsP$ = null;
    $uncanonicalize_tensed_literalsP$ = null;
    $recanonicalizingP$ = null;
    $recanonicalizing_candidate_assertion_stack$ = null;
    $noting_ill_formed_meta_argsP$ = null;
    $recan_ill_formed_meta_argsP$ = null;
    $simplify_sentenceP$ = null;
    $simplify_literalP$ = null;
    $simplify_implicationP$ = null;
    $simplify_non_wff_literalP$ = null;
    $try_to_simplify_non_wff_into_wffP$ = null;
    $trying_to_simplify_non_wff_into_wffP$ = null;
    $simplify_using_semanticsP$ = null;
    $simplify_redundanciesP$ = null;
    $simplify_transitive_redundanciesP$ = null;
    $simplify_contradictionsP$ = null;
    $simplify_sequence_vars_using_kb_arityP$ = null;
    $sequence_variable_split_limit$ = null;
    $simplify_equality_literalsP$ = null;
    $simplify_true_sentence_awayP$ = null;
    $skolem_axiom_table$ = null;
    $infer_skolem_result_isa_via_arg_constraintsP$ = null;
    $interpolate_singleton_arg_isaP$ = null;
    $clothe_naked_skolemsP$ = null;
    $preds_of_computed_skolem_gafs$ = null;
    $preds_of_editable_skolem_gafs$ = null;
    $empty_skolems$ = null;
    $mal_skolems$ = null;
    $express_as_rule_macroP$ = null;
    $express_as_genlsP$ = null;
    $express_as_arg_isaP$ = null;
    $express_as_arg_genlP$ = null;
    $express_as_genl_predicatesP$ = null;
    $express_as_genl_inverseP$ = null;
    $express_as_inter_arg_isaP$ = null;
    $express_as_disjoint_withP$ = null;
    $express_as_negation_predicatesP$ = null;
    $express_as_negation_inverseP$ = null;
    $express_as_reflexiveP$ = null;
    $express_as_symmetricP$ = null;
    $express_as_transitiveP$ = null;
    $express_as_irreflexiveP$ = null;
    $express_as_asymmetricP$ = null;
    $express_as_relation_typeP$ = null;
    $express_as_required_arg_predP$ = null;
    $tense_czer_mode$ = null;
    $valid_tense_czer_modes$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "requiredArg1Pred" ) ), constant_handles.reader_make_constant_shell( makeString( "requiredArg2Pred" ) ) );
    $list1 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER );
    $sym2$ASSERTION_FORMULA = makeSymbol( "ASSERTION-FORMULA" );
    $sym3$NART_HL_FORMULA = makeSymbol( "NART-HL-FORMULA" );
    $sym4$RF_FORMULA = makeSymbol( "RF-FORMULA" );
    $list5 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ) );
    $list6 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell( makeString( "or" ) ), constant_handles
        .reader_make_constant_shell( makeString( "xor" ) ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), constant_handles.reader_make_constant_shell( makeString( "equiv" ) ), constant_handles
            .reader_make_constant_shell( makeString( "implies" ) ), constant_handles.reader_make_constant_shell( makeString( "exceptFor" ) ), constant_handles.reader_make_constant_shell( makeString( "exceptWhen" ) ),
      constant_handles.reader_make_constant_shell( makeString( "forAll" ) ), constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), constant_handles.reader_make_constant_shell( makeString(
          "thereExistExactly" ) ), constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) ), constant_handles.reader_make_constant_shell( makeString( "thereExistAtMost" ) )
    } );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SkolemFunctionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SkolemFuncNFn" ) ) );
    $list8 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ), constant_handles.reader_make_constant_shell(
        makeString( "arg3Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5Isa" ) ), constant_handles
            .reader_make_constant_shell( makeString( "arg6Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "argsIsa" ) ) );
    $list9 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argAndRestIsa" ) ) );
    $list10 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1NotIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2NotIsa" ) ), constant_handles
        .reader_make_constant_shell( makeString( "arg3NotIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4NotIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5NotIsa" ) ),
        constant_handles.reader_make_constant_shell( makeString( "arg6NotIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argsNotIsa" ) ) );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argNotIsa" ) ) );
    $list12 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2QuotedIsa" ) ), constant_handles
        .reader_make_constant_shell( makeString( "arg3QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString(
            "arg5QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg6QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argsQuotedIsa" ) ) );
    $list13 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argQuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argAndRestQuotedIsa" ) ) );
    $list14 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2Genl" ) ), constant_handles.reader_make_constant_shell(
        makeString( "argsGenl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg3Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4Genl" ) ), constant_handles
            .reader_make_constant_shell( makeString( "arg5Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg6Genl" ) ) );
    $list15 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argGenl" ) ), constant_handles.reader_make_constant_shell( makeString( "argAndRestGenl" ) ) );
    $list16 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1Format" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2Format" ) ), constant_handles
        .reader_make_constant_shell( makeString( "arg3Format" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4Format" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5Format" ) ),
        constant_handles.reader_make_constant_shell( makeString( "arg6Format" ) ) );
    $list17 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argFormat" ) ) );
    $const18$CycLAssertion = constant_handles.reader_make_constant_shell( makeString( "CycLAssertion" ) );
    $const19$CycLIndexedTerm = constant_handles.reader_make_constant_shell( makeString( "CycLIndexedTerm" ) );
    $sym20$_FI_LAST_ASSERTIONS_ASSERTED_ = makeSymbol( "*FI-LAST-ASSERTIONS-ASSERTED*" );
    $sym21$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $kw22$ASSERT_ONLY = makeKeyword( "ASSERT-ONLY" );
    $kw23$DEFAULT = makeKeyword( "DEFAULT" );
    $kw24$KB_VAR = makeKeyword( "KB-VAR" );
    $list25 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $list26 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "canonicalizerDirectiveForArg" ) ), constant_handles.reader_make_constant_shell( makeString( "canonicalizerDirectiveForAllArgs" ) ),
        constant_handles.reader_make_constant_shell( makeString( "canonicalizerDirectiveForArgAndRest" ) ) );
    $sym27$_SKOLEM_AXIOM_TABLE_ = makeSymbol( "*SKOLEM-AXIOM-TABLE*" );
    $int28$2048 = makeInteger( 2048 );
    $list29 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arity" ) ), constant_handles
        .reader_make_constant_shell( makeString( "arityMin" ) ), constant_handles.reader_make_constant_shell( makeString( "arityMax" ) ), constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) ),
      constant_handles.reader_make_constant_shell( makeString( "resultGenl" ) ), constant_handles.reader_make_constant_shell( makeString( "resultIsaArg" ) ), constant_handles.reader_make_constant_shell( makeString(
          "resultGenlArg" ) ), constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ), constant_handles.reader_make_constant_shell(
              makeString( "arg3Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5Isa" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "arg6Isa" ) )
    } );
    $list30 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arity" ) ), constant_handles
        .reader_make_constant_shell( makeString( "arityMin" ) ), constant_handles.reader_make_constant_shell( makeString( "arityMax" ) ), constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) ),
      constant_handles.reader_make_constant_shell( makeString( "resultGenl" ) ), constant_handles.reader_make_constant_shell( makeString( "resultIsaArg" ) ), constant_handles.reader_make_constant_shell( makeString(
          "resultGenlArg" ) ), constant_handles.reader_make_constant_shell( makeString( "resultQuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "evaluationResultQuotedIsa" ) )
    } );
    $list31 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ), constant_handles
        .reader_make_constant_shell( makeString( "myCreationSecond" ) ), constant_handles.reader_make_constant_shell( makeString( "comment" ) ), constant_handles.reader_make_constant_shell( makeString( "sharedNotes" ) ),
        constant_handles.reader_make_constant_shell( makeString( "skolemizeForward" ) ) );
    $list32 = ConsesLow.list( makeKeyword( "DEFAULT" ), makeKeyword( "QUERY" ), makeKeyword( "ASSERT" ) );
    $kw33$ASSERT = makeKeyword( "ASSERT" );
    $kw34$QUERY = makeKeyword( "QUERY" );
    $str35$Canonicalizer_tense_mode_not_set_ = makeString( "Canonicalizer tense mode not set." );
  }
}
/*
 * 
 * Total time: 171 ms
 * 
 */