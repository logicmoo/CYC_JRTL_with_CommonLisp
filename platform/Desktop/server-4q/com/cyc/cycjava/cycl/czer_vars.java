package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class czer_vars extends SubLTranslatedFile
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
    public static SubLObject valid_tense_czer_mode_p(final SubLObject mode) {
        return list_utilities.member_eqP(mode, czer_vars.$valid_tense_czer_modes$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22501L)
    public static SubLObject get_tense_czer_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_vars.$tense_czer_mode$.getDynamicValue(thread) != czer_vars.$kw23$DEFAULT) {
            return czer_vars.$tense_czer_mode$.getDynamicValue(thread);
        }
        if (czer_vars.NIL != control_vars.$within_assert$.getDynamicValue(thread)) {
            return (SubLObject)czer_vars.$kw33$ASSERT;
        }
        if (czer_vars.NIL != control_vars.$within_ask$.getDynamicValue(thread)) {
            return (SubLObject)czer_vars.$kw34$QUERY;
        }
        Errors.warn((SubLObject)czer_vars.$str35$Canonicalizer_tense_mode_not_set_);
        return (SubLObject)czer_vars.$kw23$DEFAULT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22758L)
    public static SubLObject within_assert_tense_czer_modeP() {
        return Equality.eq(get_tense_czer_mode(), (SubLObject)czer_vars.$kw33$ASSERT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-vars.lisp", position = 22855L)
    public static SubLObject within_query_tense_czer_modeP() {
        return Equality.eq(get_tense_czer_mode(), (SubLObject)czer_vars.$kw34$QUERY);
    }
    
    public static SubLObject declare_czer_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_vars", "valid_tense_czer_mode_p", "VALID-TENSE-CZER-MODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_vars", "get_tense_czer_mode", "GET-TENSE-CZER-MODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_vars", "within_assert_tense_czer_modeP", "WITHIN-ASSERT-TENSE-CZER-MODE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_vars", "within_query_tense_czer_modeP", "WITHIN-QUERY-TENSE-CZER-MODE?", 0, 0, false);
        return (SubLObject)czer_vars.NIL;
    }
    
    public static SubLObject init_czer_vars_file() {
        czer_vars.$required_arg_preds$ = SubLFiles.defparameter("*REQUIRED-ARG-PREDS*", (SubLObject)czer_vars.$list0);
        czer_vars.$arg_positions$ = SubLFiles.deflexical("*ARG-POSITIONS*", (SubLObject)czer_vars.$list1);
        czer_vars.$accumulating_semantic_violationsP$ = SubLFiles.defparameter("*ACCUMULATING-SEMANTIC-VIOLATIONS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$semantic_violations$ = SubLFiles.defparameter("*SEMANTIC-VIOLATIONS*", (SubLObject)czer_vars.NIL);
        czer_vars.$assertion_key$ = SubLFiles.defparameter("*ASSERTION-KEY*", (SubLObject)czer_vars.$sym2$ASSERTION_FORMULA);
        czer_vars.$nart_key$ = SubLFiles.defparameter("*NART-KEY*", (SubLObject)czer_vars.$sym3$NART_HL_FORMULA);
        czer_vars.$rf_key$ = SubLFiles.defparameter("*RF-KEY*", (SubLObject)czer_vars.$sym4$RF_FORMULA);
        czer_vars.$implication_operators$ = SubLFiles.deflexical("*IMPLICATION-OPERATORS*", (SubLObject)czer_vars.$list5);
        czer_vars.$logical_operators$ = SubLFiles.deflexical("*LOGICAL-OPERATORS*", (SubLObject)czer_vars.$list6);
        czer_vars.$skolem_function_functions$ = SubLFiles.deflexical("*SKOLEM-FUNCTION-FUNCTIONS*", (SubLObject)czer_vars.$list7);
        czer_vars.$arg_isa_binary_preds$ = SubLFiles.deflexical("*ARG-ISA-BINARY-PREDS*", (SubLObject)czer_vars.$list8);
        czer_vars.$arg_isa_ternary_preds$ = SubLFiles.deflexical("*ARG-ISA-TERNARY-PREDS*", (SubLObject)czer_vars.$list9);
        czer_vars.$arg_not_isa_binary_preds$ = SubLFiles.deflexical("*ARG-NOT-ISA-BINARY-PREDS*", (SubLObject)czer_vars.$list10);
        czer_vars.$arg_not_isa_ternary_preds$ = SubLFiles.deflexical("*ARG-NOT-ISA-TERNARY-PREDS*", (SubLObject)czer_vars.$list11);
        czer_vars.$arg_quoted_isa_binary_preds$ = SubLFiles.deflexical("*ARG-QUOTED-ISA-BINARY-PREDS*", (SubLObject)czer_vars.$list12);
        czer_vars.$arg_quoted_isa_ternary_preds$ = SubLFiles.deflexical("*ARG-QUOTED-ISA-TERNARY-PREDS*", (SubLObject)czer_vars.$list13);
        czer_vars.$arg_genl_binary_preds$ = SubLFiles.deflexical("*ARG-GENL-BINARY-PREDS*", (SubLObject)czer_vars.$list14);
        czer_vars.$arg_genl_ternary_preds$ = SubLFiles.deflexical("*ARG-GENL-TERNARY-PREDS*", (SubLObject)czer_vars.$list15);
        czer_vars.$arg_format_binary_preds$ = SubLFiles.deflexical("*ARG-FORMAT-BINARY-PREDS*", (SubLObject)czer_vars.$list16);
        czer_vars.$arg_format_ternary_preds$ = SubLFiles.deflexical("*ARG-FORMAT-TERNARY-PREDS*", (SubLObject)czer_vars.$list17);
        czer_vars.$meta_arg_type$ = SubLFiles.deflexical("*META-ARG-TYPE*", czer_vars.$const18$CycLAssertion);
        czer_vars.$possibly_meta_arg_type$ = SubLFiles.deflexical("*POSSIBLY-META-ARG-TYPE*", czer_vars.$const19$CycLIndexedTerm);
        czer_vars.$variables_that_cannot_be_sequence_variables$ = SubLFiles.defparameter("*VARIABLES-THAT-CANNOT-BE-SEQUENCE-VARIABLES*", (SubLObject)czer_vars.NIL);
        czer_vars.$el_supports_dot_syntaxP$ = SubLFiles.defparameter("*EL-SUPPORTS-DOT-SYNTAX?*", (SubLObject)czer_vars.T);
        czer_vars.$el_supports_variable_arity_skolemsP$ = SubLFiles.deflexical("*EL-SUPPORTS-VARIABLE-ARITY-SKOLEMS?*", (SubLObject)czer_vars.T);
        czer_vars.$el_supports_contractionsP$ = SubLFiles.defparameter("*EL-SUPPORTS-CONTRACTIONS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$inside_quote$ = SubLFiles.defvar("*INSIDE-QUOTE*", (SubLObject)czer_vars.NIL);
        czer_vars.$fi_last_assertions_asserted$ = SubLFiles.defparameter("*FI-LAST-ASSERTIONS-ASSERTED*", (SubLObject)czer_vars.NIL);
        czer_vars.$new_canonicalizerP$ = SubLFiles.defparameter("*NEW-CANONICALIZER?*", (SubLObject)czer_vars.NIL);
        czer_vars.$within_canonicalizerP$ = SubLFiles.defparameter("*WITHIN-CANONICALIZER?*", (SubLObject)czer_vars.NIL);
        czer_vars.$form_of_clausal_form$ = SubLFiles.defparameter("*FORM-OF-CLAUSAL-FORM*", (SubLObject)czer_vars.NIL);
        czer_vars.$must_enforce_semanticsP$ = SubLFiles.defparameter("*MUST-ENFORCE-SEMANTICS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$el_trace_level$ = SubLFiles.defparameter("*EL-TRACE-LEVEL*", (SubLObject)czer_vars.ZERO_INTEGER);
        czer_vars.$canon_verboseP$ = SubLFiles.defparameter("*CANON-VERBOSE?*", (SubLObject)czer_vars.NIL);
        czer_vars.$varP$ = SubLFiles.defparameter("*VAR?*", (SubLObject)czer_vars.$sym21$EL_VAR_);
        czer_vars.$subordinate_fi_opsP$ = SubLFiles.defparameter("*SUBORDINATE-FI-OPS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$cryP$ = SubLFiles.defparameter("*CRY?*", (SubLObject)czer_vars.T);
        czer_vars.$minimal_skolem_arityP$ = SubLFiles.defparameter("*MINIMAL-SKOLEM-ARITY?*", (SubLObject)czer_vars.NIL);
        czer_vars.$skolemize_during_asksP$ = SubLFiles.defparameter("*SKOLEMIZE-DURING-ASKS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$drop_all_existentialsP$ = SubLFiles.defparameter("*DROP-ALL-EXISTENTIALS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$leave_skolem_constants_aloneP$ = SubLFiles.defparameter("*LEAVE-SKOLEM-CONSTANTS-ALONE?*", (SubLObject)czer_vars.NIL);
        czer_vars.$forbid_quantified_sequence_variablesP$ = SubLFiles.defparameter("*FORBID-QUANTIFIED-SEQUENCE-VARIABLES?*", (SubLObject)czer_vars.$kw22$ASSERT_ONLY);
        czer_vars.$use_skolem_constantsP$ = SubLFiles.defparameter("*USE-SKOLEM-CONSTANTS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$canonicalize_gaf_commutative_termsP$ = SubLFiles.defparameter("*CANONICALIZE-GAF-COMMUTATIVE-TERMS?*", (SubLObject)czer_vars.T);
        czer_vars.$canon_var_function$ = SubLFiles.defparameter("*CANON-VAR-FUNCTION*", (SubLObject)czer_vars.$kw23$DEFAULT);
        czer_vars.$canonical_variable_type$ = SubLFiles.defparameter("*CANONICAL-VARIABLE-TYPE*", (SubLObject)czer_vars.$kw24$KB_VAR);
        czer_vars.$standardize_variables_memory$ = SubLFiles.defparameter("*STANDARDIZE-VARIABLES-MEMORY*", (SubLObject)czer_vars.NIL);
        czer_vars.$distributing_meta_knowledgeP$ = SubLFiles.defparameter("*DISTRIBUTING-META-KNOWLEDGE?*", (SubLObject)czer_vars.NIL);
        czer_vars.$distribute_meta_over_common_elP$ = SubLFiles.defparameter("*DISTRIBUTE-META-OVER-COMMON-EL?*", (SubLObject)czer_vars.T);
        czer_vars.$find_uncanonical_decontextualized_assertionsP$ = SubLFiles.defparameter("*FIND-UNCANONICAL-DECONTEXTUALIZED-ASSERTIONS?*", (SubLObject)czer_vars.T);
        czer_vars.$canonicalize_el_template_vars_during_queriesP$ = SubLFiles.defparameter("*CANONICALIZE-EL-TEMPLATE-VARS-DURING-QUERIES?*", (SubLObject)czer_vars.T);
        czer_vars.$robust_assertion_lookup$ = SubLFiles.defparameter("*ROBUST-ASSERTION-LOOKUP*", (SubLObject)czer_vars.NIL);
        czer_vars.$robust_nart_lookup$ = SubLFiles.defparameter("*ROBUST-NART-LOOKUP*", (SubLObject)czer_vars.$kw23$DEFAULT);
        czer_vars.$recanonicalizing_candidate_natP$ = SubLFiles.defparameter("*RECANONICALIZING-CANDIDATE-NAT?*", (SubLObject)czer_vars.NIL);
        czer_vars.$el_var_blist$ = SubLFiles.defparameter("*EL-VAR-BLIST*", (SubLObject)czer_vars.NIL);
        czer_vars.$gathering_quantified_fn_termsP$ = SubLFiles.defparameter("*GATHERING-QUANTIFIED-FN-TERMS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$expand_el_relationsP$ = SubLFiles.defparameter("*EXPAND-EL-RELATIONS?*", (SubLObject)czer_vars.T);
        czer_vars.$canonicalize_all_sentence_argsP$ = SubLFiles.defparameter("*CANONICALIZE-ALL-SENTENCE-ARGS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$canonicalize_tensed_literalsP$ = SubLFiles.defparameter("*CANONICALIZE-TENSED-LITERALS?*", (SubLObject)czer_vars.T);
        czer_vars.$add_term_of_unit_litsP$ = SubLFiles.defparameter("*ADD-TERM-OF-UNIT-LITS?*", (SubLObject)czer_vars.T);
        czer_vars.$turn_existentials_into_skolemsP$ = SubLFiles.defparameter("*TURN-EXISTENTIALS-INTO-SKOLEMS?*", (SubLObject)czer_vars.T);
        czer_vars.$reify_skolemsP$ = SubLFiles.defparameter("*REIFY-SKOLEMS?*", (SubLObject)czer_vars.T);
        czer_vars.$create_narts_regardless_of_whether_within_assertP$ = SubLFiles.defparameter("*CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", (SubLObject)czer_vars.NIL);
        czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$ = SubLFiles.defparameter("*DISABLE-CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", (SubLObject)czer_vars.NIL);
        czer_vars.$canonicalize_functionsP$ = SubLFiles.defparameter("*CANONICALIZE-FUNCTIONS?*", (SubLObject)czer_vars.T);
        czer_vars.$canonicalize_termsP$ = SubLFiles.defparameter("*CANONICALIZE-TERMS?*", (SubLObject)czer_vars.T);
        czer_vars.$canonicalize_literalsP$ = SubLFiles.defparameter("*CANONICALIZE-LITERALS?*", (SubLObject)czer_vars.T);
        czer_vars.$canonicalize_disjunction_as_enumerationP$ = SubLFiles.defparameter("*CANONICALIZE-DISJUNCTION-AS-ENUMERATION?*", (SubLObject)czer_vars.NIL);
        czer_vars.$canonicalize_variablesP$ = SubLFiles.defparameter("*CANONICALIZE-VARIABLES?*", (SubLObject)czer_vars.T);
        czer_vars.$implicitify_universalsP$ = SubLFiles.defparameter("*IMPLICITIFY-UNIVERSALS?*", (SubLObject)czer_vars.T);
        czer_vars.$assume_free_vars_are_existentially_boundP$ = SubLFiles.defparameter("*ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?*", (SubLObject)czer_vars.NIL);
        czer_vars.$encapsulate_var_formulaP$ = SubLFiles.defparameter("*ENCAPSULATE-VAR-FORMULA?*", (SubLObject)czer_vars.T);
        czer_vars.$encapsulate_intensional_formulaP$ = SubLFiles.defparameter("*ENCAPSULATE-INTENSIONAL-FORMULA?*", (SubLObject)czer_vars.T);
        czer_vars.$czer_quiescence_iteration_limit$ = SubLFiles.defparameter("*CZER-QUIESCENCE-ITERATION-LIMIT*", (SubLObject)czer_vars.TEN_INTEGER);
        czer_vars.$clause_el_var_names$ = SubLFiles.defparameter("*CLAUSE-EL-VAR-NAMES*", (SubLObject)czer_vars.NIL);
        czer_vars.$el_symbol_suffix_table$ = SubLFiles.defparameter("*EL-SYMBOL-SUFFIX-TABLE*", (SubLObject)czer_vars.NIL);
        czer_vars.$within_negationP$ = SubLFiles.defparameter("*WITHIN-NEGATION?*", (SubLObject)czer_vars.NIL);
        czer_vars.$hl_pred_order$ = SubLFiles.deflexical("*HL-PRED-ORDER*", (SubLObject)czer_vars.$list25);
        czer_vars.$controlP$ = SubLFiles.defparameter("*CONTROL?*", (SubLObject)czer_vars.NIL);
        czer_vars.$control_1$ = SubLFiles.defparameter("*CONTROL-1*", (SubLObject)czer_vars.NIL);
        czer_vars.$control_2$ = SubLFiles.defparameter("*CONTROL-2*", (SubLObject)czer_vars.NIL);
        czer_vars.$control_3$ = SubLFiles.defparameter("*CONTROL-3*", (SubLObject)czer_vars.NIL);
        czer_vars.$control_4$ = SubLFiles.defparameter("*CONTROL-4*", (SubLObject)czer_vars.NIL);
        czer_vars.$control_5$ = SubLFiles.defparameter("*CONTROL-5*", (SubLObject)czer_vars.NIL);
        czer_vars.$control_6$ = SubLFiles.defparameter("*CONTROL-6*", (SubLObject)czer_vars.NIL);
        czer_vars.$control_ecaP$ = SubLFiles.defparameter("*CONTROL-ECA?*", (SubLObject)czer_vars.NIL);
        czer_vars.$czer_memoization_state$ = SubLFiles.defparameter("*CZER-MEMOIZATION-STATE*", (SubLObject)czer_vars.NIL);
        czer_vars.$use_czer_fort_typesP$ = SubLFiles.defparameter("*USE-CZER-FORT-TYPES?*", (SubLObject)czer_vars.T);
        czer_vars.$use_czer_fort_types_globallyP$ = SubLFiles.defparameter("*USE-CZER-FORT-TYPES-GLOBALLY?*", (SubLObject)czer_vars.T);
        czer_vars.$canonicalizer_directive_predicates$ = SubLFiles.deflexical("*CANONICALIZER-DIRECTIVE-PREDICATES*", (SubLObject)czer_vars.$list26);
        czer_vars.$assume_hlmt_is_canonicalP$ = SubLFiles.defparameter("*ASSUME-HLMT-IS-CANONICAL?*", (SubLObject)czer_vars.NIL);
        czer_vars.$ununiquify_el_varsP$ = SubLFiles.defparameter("*UNUNIQUIFY-EL-VARS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$unremove_universalsP$ = SubLFiles.defparameter("*UNREMOVE-UNIVERSALS?*", (SubLObject)czer_vars.T);
        czer_vars.$uncanonicalize_tensed_literalsP$ = SubLFiles.defparameter("*UNCANONICALIZE-TENSED-LITERALS?*", (SubLObject)czer_vars.T);
        czer_vars.$recanonicalizingP$ = SubLFiles.defparameter("*RECANONICALIZING?*", (SubLObject)czer_vars.NIL);
        czer_vars.$recanonicalizing_candidate_assertion_stack$ = SubLFiles.defparameter("*RECANONICALIZING-CANDIDATE-ASSERTION-STACK*", (SubLObject)czer_vars.NIL);
        czer_vars.$noting_ill_formed_meta_argsP$ = SubLFiles.defparameter("*NOTING-ILL-FORMED-META-ARGS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$recan_ill_formed_meta_argsP$ = SubLFiles.defparameter("*RECAN-ILL-FORMED-META-ARGS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$simplify_sentenceP$ = SubLFiles.defparameter("*SIMPLIFY-SENTENCE?*", (SubLObject)czer_vars.T);
        czer_vars.$simplify_literalP$ = SubLFiles.defparameter("*SIMPLIFY-LITERAL?*", (SubLObject)czer_vars.T);
        czer_vars.$simplify_implicationP$ = SubLFiles.defparameter("*SIMPLIFY-IMPLICATION?*", (SubLObject)czer_vars.T);
        czer_vars.$simplify_non_wff_literalP$ = SubLFiles.defparameter("*SIMPLIFY-NON-WFF-LITERAL?*", (SubLObject)czer_vars.T);
        czer_vars.$try_to_simplify_non_wff_into_wffP$ = SubLFiles.defparameter("*TRY-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", (SubLObject)czer_vars.T);
        czer_vars.$trying_to_simplify_non_wff_into_wffP$ = SubLFiles.defparameter("*TRYING-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", (SubLObject)czer_vars.NIL);
        czer_vars.$simplify_using_semanticsP$ = SubLFiles.defparameter("*SIMPLIFY-USING-SEMANTICS?*", (SubLObject)czer_vars.T);
        czer_vars.$simplify_redundanciesP$ = SubLFiles.defparameter("*SIMPLIFY-REDUNDANCIES?*", (SubLObject)czer_vars.NIL);
        czer_vars.$simplify_transitive_redundanciesP$ = SubLFiles.defparameter("*SIMPLIFY-TRANSITIVE-REDUNDANCIES?*", (SubLObject)czer_vars.NIL);
        czer_vars.$simplify_contradictionsP$ = SubLFiles.defparameter("*SIMPLIFY-CONTRADICTIONS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$simplify_sequence_vars_using_kb_arityP$ = SubLFiles.defparameter("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*", (SubLObject)czer_vars.T);
        czer_vars.$sequence_variable_split_limit$ = SubLFiles.defparameter("*SEQUENCE-VARIABLE-SPLIT-LIMIT*", (SubLObject)czer_vars.FIVE_INTEGER);
        czer_vars.$simplify_equality_literalsP$ = SubLFiles.defparameter("*SIMPLIFY-EQUALITY-LITERALS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$simplify_true_sentence_awayP$ = SubLFiles.defparameter("*SIMPLIFY-TRUE-SENTENCE-AWAY?*", (SubLObject)czer_vars.NIL);
        czer_vars.$skolem_axiom_table$ = SubLFiles.deflexical("*SKOLEM-AXIOM-TABLE*", (czer_vars.NIL != Symbols.boundp((SubLObject)czer_vars.$sym27$_SKOLEM_AXIOM_TABLE_)) ? czer_vars.$skolem_axiom_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)czer_vars.$int28$2048, Symbols.symbol_function((SubLObject)czer_vars.EQUAL), (SubLObject)czer_vars.UNPROVIDED));
        czer_vars.$infer_skolem_result_isa_via_arg_constraintsP$ = SubLFiles.defparameter("*INFER-SKOLEM-RESULT-ISA-VIA-ARG-CONSTRAINTS?*", (SubLObject)czer_vars.T);
        czer_vars.$interpolate_singleton_arg_isaP$ = SubLFiles.defparameter("*INTERPOLATE-SINGLETON-ARG-ISA?*", (SubLObject)czer_vars.NIL);
        czer_vars.$clothe_naked_skolemsP$ = SubLFiles.defparameter("*CLOTHE-NAKED-SKOLEMS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$preds_of_computed_skolem_gafs$ = SubLFiles.defparameter("*PREDS-OF-COMPUTED-SKOLEM-GAFS*", (SubLObject)czer_vars.$list29);
        czer_vars.$preds_of_editable_skolem_gafs$ = SubLFiles.deflexical("*PREDS-OF-EDITABLE-SKOLEM-GAFS*", ConsesLow.append(new SubLObject[] { czer_vars.$list30, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), czer_vars.$arg_quoted_isa_binary_preds$.getGlobalValue(), czer_vars.$arg_quoted_isa_ternary_preds$.getGlobalValue(), czer_vars.$list31 }));
        czer_vars.$empty_skolems$ = SubLFiles.defparameter("*EMPTY-SKOLEMS*", (SubLObject)czer_vars.NIL);
        czer_vars.$mal_skolems$ = SubLFiles.defparameter("*MAL-SKOLEMS*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_rule_macroP$ = SubLFiles.defparameter("*EXPRESS-AS-RULE-MACRO?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_genlsP$ = SubLFiles.defparameter("*EXPRESS-AS-GENLS?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_arg_isaP$ = SubLFiles.defparameter("*EXPRESS-AS-ARG-ISA?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_arg_genlP$ = SubLFiles.defparameter("*EXPRESS-AS-ARG-GENL?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_genl_predicatesP$ = SubLFiles.defparameter("*EXPRESS-AS-GENL-PREDICATES?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_genl_inverseP$ = SubLFiles.defparameter("*EXPRESS-AS-GENL-INVERSE?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_inter_arg_isaP$ = SubLFiles.defparameter("*EXPRESS-AS-INTER-ARG-ISA?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_disjoint_withP$ = SubLFiles.defparameter("*EXPRESS-AS-DISJOINT-WITH?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_negation_predicatesP$ = SubLFiles.defparameter("*EXPRESS-AS-NEGATION-PREDICATES?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_negation_inverseP$ = SubLFiles.defparameter("*EXPRESS-AS-NEGATION-INVERSE?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_reflexiveP$ = SubLFiles.defparameter("*EXPRESS-AS-REFLEXIVE?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_symmetricP$ = SubLFiles.defparameter("*EXPRESS-AS-SYMMETRIC?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_transitiveP$ = SubLFiles.defparameter("*EXPRESS-AS-TRANSITIVE?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_irreflexiveP$ = SubLFiles.defparameter("*EXPRESS-AS-IRREFLEXIVE?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_asymmetricP$ = SubLFiles.defparameter("*EXPRESS-AS-ASYMMETRIC?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_relation_typeP$ = SubLFiles.defparameter("*EXPRESS-AS-RELATION-TYPE?*", (SubLObject)czer_vars.NIL);
        czer_vars.$express_as_required_arg_predP$ = SubLFiles.defparameter("*EXPRESS-AS-REQUIRED-ARG-PRED?*", (SubLObject)czer_vars.NIL);
        czer_vars.$tense_czer_mode$ = SubLFiles.defparameter("*TENSE-CZER-MODE*", (SubLObject)czer_vars.$kw23$DEFAULT);
        czer_vars.$valid_tense_czer_modes$ = SubLFiles.deflexical("*VALID-TENSE-CZER-MODES*", (SubLObject)czer_vars.$list32);
        return (SubLObject)czer_vars.NIL;
    }
    
    public static SubLObject setup_czer_vars_file() {
        utilities_macros.register_html_state_variable((SubLObject)czer_vars.$sym20$_FI_LAST_ASSERTIONS_ASSERTED_);
        final SubLObject item_var = (SubLObject)czer_vars.$sym20$_FI_LAST_ASSERTIONS_ASSERTED_;
        if (czer_vars.NIL == conses_high.member(item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)czer_vars.EQL), Symbols.symbol_function((SubLObject)czer_vars.IDENTITY))) {
            utilities_macros.$fi_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$fi_state_variables$.getGlobalValue()));
        }
        subl_macro_promotions.declare_defglobal((SubLObject)czer_vars.$sym27$_SKOLEM_AXIOM_TABLE_);
        return (SubLObject)czer_vars.NIL;
    }
    
    public void declareFunctions() {
        declare_czer_vars_file();
    }
    
    public void initializeVariables() {
        init_czer_vars_file();
    }
    
    public void runTopLevelForms() {
        setup_czer_vars_file();
    }
    
    static {
        me = (SubLFile)new czer_vars();
        czer_vars.$required_arg_preds$ = null;
        czer_vars.$arg_positions$ = null;
        czer_vars.$accumulating_semantic_violationsP$ = null;
        czer_vars.$semantic_violations$ = null;
        czer_vars.$assertion_key$ = null;
        czer_vars.$nart_key$ = null;
        czer_vars.$rf_key$ = null;
        czer_vars.$implication_operators$ = null;
        czer_vars.$logical_operators$ = null;
        czer_vars.$skolem_function_functions$ = null;
        czer_vars.$arg_isa_binary_preds$ = null;
        czer_vars.$arg_isa_ternary_preds$ = null;
        czer_vars.$arg_not_isa_binary_preds$ = null;
        czer_vars.$arg_not_isa_ternary_preds$ = null;
        czer_vars.$arg_quoted_isa_binary_preds$ = null;
        czer_vars.$arg_quoted_isa_ternary_preds$ = null;
        czer_vars.$arg_genl_binary_preds$ = null;
        czer_vars.$arg_genl_ternary_preds$ = null;
        czer_vars.$arg_format_binary_preds$ = null;
        czer_vars.$arg_format_ternary_preds$ = null;
        czer_vars.$meta_arg_type$ = null;
        czer_vars.$possibly_meta_arg_type$ = null;
        czer_vars.$variables_that_cannot_be_sequence_variables$ = null;
        czer_vars.$el_supports_dot_syntaxP$ = null;
        czer_vars.$el_supports_variable_arity_skolemsP$ = null;
        czer_vars.$el_supports_contractionsP$ = null;
        czer_vars.$inside_quote$ = null;
        czer_vars.$fi_last_assertions_asserted$ = null;
        czer_vars.$new_canonicalizerP$ = null;
        czer_vars.$within_canonicalizerP$ = null;
        czer_vars.$form_of_clausal_form$ = null;
        czer_vars.$must_enforce_semanticsP$ = null;
        czer_vars.$el_trace_level$ = null;
        czer_vars.$canon_verboseP$ = null;
        czer_vars.$varP$ = null;
        czer_vars.$subordinate_fi_opsP$ = null;
        czer_vars.$cryP$ = null;
        czer_vars.$minimal_skolem_arityP$ = null;
        czer_vars.$skolemize_during_asksP$ = null;
        czer_vars.$drop_all_existentialsP$ = null;
        czer_vars.$leave_skolem_constants_aloneP$ = null;
        czer_vars.$forbid_quantified_sequence_variablesP$ = null;
        czer_vars.$use_skolem_constantsP$ = null;
        czer_vars.$canonicalize_gaf_commutative_termsP$ = null;
        czer_vars.$canon_var_function$ = null;
        czer_vars.$canonical_variable_type$ = null;
        czer_vars.$standardize_variables_memory$ = null;
        czer_vars.$distributing_meta_knowledgeP$ = null;
        czer_vars.$distribute_meta_over_common_elP$ = null;
        czer_vars.$find_uncanonical_decontextualized_assertionsP$ = null;
        czer_vars.$canonicalize_el_template_vars_during_queriesP$ = null;
        czer_vars.$robust_assertion_lookup$ = null;
        czer_vars.$robust_nart_lookup$ = null;
        czer_vars.$recanonicalizing_candidate_natP$ = null;
        czer_vars.$el_var_blist$ = null;
        czer_vars.$gathering_quantified_fn_termsP$ = null;
        czer_vars.$expand_el_relationsP$ = null;
        czer_vars.$canonicalize_all_sentence_argsP$ = null;
        czer_vars.$canonicalize_tensed_literalsP$ = null;
        czer_vars.$add_term_of_unit_litsP$ = null;
        czer_vars.$turn_existentials_into_skolemsP$ = null;
        czer_vars.$reify_skolemsP$ = null;
        czer_vars.$create_narts_regardless_of_whether_within_assertP$ = null;
        czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$ = null;
        czer_vars.$canonicalize_functionsP$ = null;
        czer_vars.$canonicalize_termsP$ = null;
        czer_vars.$canonicalize_literalsP$ = null;
        czer_vars.$canonicalize_disjunction_as_enumerationP$ = null;
        czer_vars.$canonicalize_variablesP$ = null;
        czer_vars.$implicitify_universalsP$ = null;
        czer_vars.$assume_free_vars_are_existentially_boundP$ = null;
        czer_vars.$encapsulate_var_formulaP$ = null;
        czer_vars.$encapsulate_intensional_formulaP$ = null;
        czer_vars.$czer_quiescence_iteration_limit$ = null;
        czer_vars.$clause_el_var_names$ = null;
        czer_vars.$el_symbol_suffix_table$ = null;
        czer_vars.$within_negationP$ = null;
        czer_vars.$hl_pred_order$ = null;
        czer_vars.$controlP$ = null;
        czer_vars.$control_1$ = null;
        czer_vars.$control_2$ = null;
        czer_vars.$control_3$ = null;
        czer_vars.$control_4$ = null;
        czer_vars.$control_5$ = null;
        czer_vars.$control_6$ = null;
        czer_vars.$control_ecaP$ = null;
        czer_vars.$czer_memoization_state$ = null;
        czer_vars.$use_czer_fort_typesP$ = null;
        czer_vars.$use_czer_fort_types_globallyP$ = null;
        czer_vars.$canonicalizer_directive_predicates$ = null;
        czer_vars.$assume_hlmt_is_canonicalP$ = null;
        czer_vars.$ununiquify_el_varsP$ = null;
        czer_vars.$unremove_universalsP$ = null;
        czer_vars.$uncanonicalize_tensed_literalsP$ = null;
        czer_vars.$recanonicalizingP$ = null;
        czer_vars.$recanonicalizing_candidate_assertion_stack$ = null;
        czer_vars.$noting_ill_formed_meta_argsP$ = null;
        czer_vars.$recan_ill_formed_meta_argsP$ = null;
        czer_vars.$simplify_sentenceP$ = null;
        czer_vars.$simplify_literalP$ = null;
        czer_vars.$simplify_implicationP$ = null;
        czer_vars.$simplify_non_wff_literalP$ = null;
        czer_vars.$try_to_simplify_non_wff_into_wffP$ = null;
        czer_vars.$trying_to_simplify_non_wff_into_wffP$ = null;
        czer_vars.$simplify_using_semanticsP$ = null;
        czer_vars.$simplify_redundanciesP$ = null;
        czer_vars.$simplify_transitive_redundanciesP$ = null;
        czer_vars.$simplify_contradictionsP$ = null;
        czer_vars.$simplify_sequence_vars_using_kb_arityP$ = null;
        czer_vars.$sequence_variable_split_limit$ = null;
        czer_vars.$simplify_equality_literalsP$ = null;
        czer_vars.$simplify_true_sentence_awayP$ = null;
        czer_vars.$skolem_axiom_table$ = null;
        czer_vars.$infer_skolem_result_isa_via_arg_constraintsP$ = null;
        czer_vars.$interpolate_singleton_arg_isaP$ = null;
        czer_vars.$clothe_naked_skolemsP$ = null;
        czer_vars.$preds_of_computed_skolem_gafs$ = null;
        czer_vars.$preds_of_editable_skolem_gafs$ = null;
        czer_vars.$empty_skolems$ = null;
        czer_vars.$mal_skolems$ = null;
        czer_vars.$express_as_rule_macroP$ = null;
        czer_vars.$express_as_genlsP$ = null;
        czer_vars.$express_as_arg_isaP$ = null;
        czer_vars.$express_as_arg_genlP$ = null;
        czer_vars.$express_as_genl_predicatesP$ = null;
        czer_vars.$express_as_genl_inverseP$ = null;
        czer_vars.$express_as_inter_arg_isaP$ = null;
        czer_vars.$express_as_disjoint_withP$ = null;
        czer_vars.$express_as_negation_predicatesP$ = null;
        czer_vars.$express_as_negation_inverseP$ = null;
        czer_vars.$express_as_reflexiveP$ = null;
        czer_vars.$express_as_symmetricP$ = null;
        czer_vars.$express_as_transitiveP$ = null;
        czer_vars.$express_as_irreflexiveP$ = null;
        czer_vars.$express_as_asymmetricP$ = null;
        czer_vars.$express_as_relation_typeP$ = null;
        czer_vars.$express_as_required_arg_predP$ = null;
        czer_vars.$tense_czer_mode$ = null;
        czer_vars.$valid_tense_czer_modes$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requiredArg1Pred")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requiredArg2Pred")));
        $list1 = ConsesLow.list((SubLObject)czer_vars.ONE_INTEGER, (SubLObject)czer_vars.TWO_INTEGER, (SubLObject)czer_vars.THREE_INTEGER, (SubLObject)czer_vars.FOUR_INTEGER, (SubLObject)czer_vars.FIVE_INTEGER);
        $sym2$ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $sym3$NART_HL_FORMULA = SubLObjectFactory.makeSymbol("NART-HL-FORMULA");
        $sym4$RF_FORMULA = SubLObjectFactory.makeSymbol("RF-FORMULA");
        $list5 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")));
        $list6 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("xor")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equiv")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptFor")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptWhen")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistExactly")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtMost")) });
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFuncNFn")));
        $list8 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsIsa")));
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestIsa")));
        $list10 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1NotIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2NotIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3NotIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4NotIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5NotIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6NotIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsNotIsa")));
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argNotIsa")));
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsQuotedIsa")));
        $list13 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argQuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestQuotedIsa")));
        $list14 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Genl")));
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestGenl")));
        $list16 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Format")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Format")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Format")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Format")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Format")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Format")));
        $list17 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argFormat")));
        $const18$CycLAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLAssertion"));
        $const19$CycLIndexedTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLIndexedTerm"));
        $sym20$_FI_LAST_ASSERTIONS_ASSERTED_ = SubLObjectFactory.makeSymbol("*FI-LAST-ASSERTIONS-ASSERTED*");
        $sym21$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $kw22$ASSERT_ONLY = SubLObjectFactory.makeKeyword("ASSERT-ONLY");
        $kw23$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw24$KB_VAR = SubLObjectFactory.makeKeyword("KB-VAR");
        $list25 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $list26 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForAllArgs")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArgAndRest")));
        $sym27$_SKOLEM_AXIOM_TABLE_ = SubLObjectFactory.makeSymbol("*SKOLEM-AXIOM-TABLE*");
        $int28$2048 = SubLObjectFactory.makeInteger(2048);
        $list29 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMax")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsaArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenlArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Isa")) });
        $list30 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMax")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsaArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenlArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultQuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationResultQuotedIsa")) });
        $list31 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sharedNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("skolemizeForward")));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERT"));
        $kw33$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $kw34$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $str35$Canonicalizer_tense_mode_not_set_ = SubLObjectFactory.makeString("Canonicalizer tense mode not set.");
    }
}

/*

	Total time: 171 ms
	
*/