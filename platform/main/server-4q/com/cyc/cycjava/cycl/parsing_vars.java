package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parsing_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.parsing_vars";
  public static final String myFingerPrint = "f5e107487ca626328189cac14256db4f5516339d6b736a9fab3ab2063b72402b";
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 786L)
  private static SubLSymbol $nl_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1561L)
  public static SubLSymbol $perform_np_parser_expansion$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1682L)
  public static SubLSymbol $perform_vp_parser_expansion$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1786L)
  public static SubLSymbol $rkf_template_wff_filter_level$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1894L)
  public static SubLSymbol $np_wff_filter_level$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1941L)
  public static SubLSymbol $np_wff_filter_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2148L)
  public static SubLSymbol $guess_semantics_for_unknown_wordsP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2295L)
  public static SubLSymbol $psp_clear_caches_each_parseP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2433L)
  public static SubLSymbol $bypass_psp_cachesP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2560L)
  public static SubLSymbol $npp_use_strings_for_semanticsP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2734L)
  public static SubLSymbol $npp_max_rules_per_compound$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2899L)
  public static SubLSymbol $rbp_include_word_unitsP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3009L)
  public static SubLSymbol $rbp_bypass_deverbal_filtersP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3162L)
  public static SubLSymbol $rbp_apply_all_filters_regardlessP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3342L)
  public static SubLSymbol $rbp_filter_violations_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3623L)
  public static SubLSymbol $rbp_bypass_block_unificationP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3742L)
  public static SubLSymbol $rbp_reformulate_resultsP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3913L)
  public static SubLSymbol $evaluate_nl_reformulator_resultsP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4066L)
  public static SubLSymbol $npp_use_nl_tagsP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4161L)
  public static SubLSymbol $use_ternary_np_tagsP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4285L)
  private static SubLSymbol $nl_tag_cycl_placeholder$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4438L)
  public static SubLSymbol $psp_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4649L)
  public static SubLSymbol $psp_reformulateP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4693L)
  public static SubLSymbol $psp_pos_pred_filterP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4821L)
  public static SubLSymbol $psp_pos_pred_filter_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5041L)
  public static SubLSymbol $parser_cycl_blacklist$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5143L)
  public static SubLSymbol $psp_indexical_map$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5324L)
  public static SubLSymbol $psp_return_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5589L)
  public static SubLSymbol $psp_verboseP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5631L)
  public static SubLSymbol $psp_chart$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5734L)
  public static SubLSymbol $psp_chart_consolidate_edgesP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5931L)
  public static SubLSymbol $psp_use_lookahead_for_bad_edgesP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6114L)
  public static SubLSymbol $psp_chart_start_index$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6228L)
  public static SubLSymbol $psp_chart_end_index$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6390L)
  public static SubLSymbol $psp_extra_charts$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6523L)
  public static SubLSymbol $psp_dont_destroy_chartP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6649L)
  public static SubLSymbol $psp_rule_lookup_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6756L)
  public static SubLSymbol $psp_concept_filters$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6915L)
  public static SubLSymbol $parsing_domain_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7067L)
  public static SubLSymbol $rbp_rule_lookup_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7165L)
  public static SubLSymbol $psp_gap_type_allowed$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7319L)
  public static SubLSymbol $psp_generality_preference$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7523L)
  public static SubLSymbol $psp_parse_to_match$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7632L)
  public static SubLSymbol $psp_min_weight$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7914L)
  public static SubLSymbol $psp_max_weight$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 8083L)
  public static SubLSymbol $psp_weight_type$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 8236L)
  private static SubLSymbol $psp_environmental_globals_new$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9524L)
  public static SubLSymbol $psp_max_edges_per_span$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9654L)
  public static SubLSymbol $psp_max_edges_per_chart$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9788L)
  public static SubLSymbol $psp_cached_interface_helper_clearing_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10062L)
  public static SubLSymbol $variable_uniquification_store$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10275L)
  public static SubLSymbol $linkage_creation_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10559L)
  public static SubLSymbol $parse_tree_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10761L)
  public static SubLSymbol $parse_tree_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10992L)
  public static SubLSymbol $use_strict_syntactic_node_checkingP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11060L)
  public static SubLSymbol $parse_root_node$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11155L)
  public static SubLSymbol $parse_tokenization$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11256L)
  public static SubLSymbol $parse_tokenization_offset$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11597L)
  public static SubLSymbol $reify_parse_nodesP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11708L)
  public static SubLSymbol $storing_cyclifier_wff_results$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11837L)
  public static SubLSymbol $cyclifier_wff_checking_results$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11943L)
  public static SubLSymbol $numeral_parser_case_sensitiveP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 12119L)
  public static SubLSymbol $fscp_verboseP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 12162L)
  public static SubLSymbol $speaker_referent$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$VALID_CONSTANT_;
  private static final SubLSymbol $kw2$NL_TAG_CYCL_PLACEHOLDER;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$EVERYTHING;
  private static final SubLObject $const5$EnglishMt;
  private static final SubLObject $const6$CurrentWorldDataCollectorMt_NonHo;
  private static final SubLSymbol $kw7$NONE;
  private static final SubLSymbol $kw8$GENERAL;
  private static final SubLInteger $int9$255;
  private static final SubLSymbol $kw10$INTEGER;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$PSP_ENVIRONMENTAL_GLOBAL_PAIR;
  private static final SubLSymbol $sym13$BOUNDP;
  private static final SubLInteger $int14$2120;
  private static final SubLInteger $int15$100000;
  private static final SubLSymbol $sym16$_PSP_CACHED_INTERFACE_HELPER_CLEARING_FUNCTIONS_;
  private static final SubLSymbol $kw17$CLEARED;
  private static final SubLSymbol $kw18$DEFAULT;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$CLET;
  private static final SubLSymbol $sym21$_PARSE_TREE_MT_;
  private static final SubLString $str22$NL;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$_PARSE_TREE_PREFIX_;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $kw27$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw28$OFFSET;
  private static final SubLSymbol $sym29$_PARSE_TOKENIZATION_;
  private static final SubLSymbol $sym30$_PARSE_TOKENIZATION_OFFSET_;
  private static final SubLString $str31$data_nl_wff_results_cyclifier_wff;

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1224L)
  public static SubLObject initialize_nl_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym1$VALID_CONSTANT_, $nl_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_nl_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_nl_kb_loaded();
    }
    return kb_control_vars.nl_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4358L)
  public static SubLObject nl_tag_cycl_placeholder()
  {
    return $nl_tag_cycl_placeholder$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9088L)
  public static SubLObject psp_environmental_state()
  {
    return Mapping.mapcar( $sym12$PSP_ENVIRONMENTAL_GLOBAL_PAIR, list_utilities.remove_if_not( Symbols.symbol_function( $sym13$BOUNDP ), $psp_environmental_globals_new$.getGlobalValue(), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9367L)
  public static SubLObject psp_environmental_global_pair(final SubLObject global)
  {
    return ConsesLow.list( global, Symbols.symbol_value( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9863L)
  public static SubLObject psp_clear_interface_helper_caches()
  {
    SubLObject cdolist_list_var = $psp_cached_interface_helper_clearing_functions$.getGlobalValue();
    SubLObject clearer = NIL;
    clearer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Symbols.fboundp( clearer ) )
      {
        Functions.funcall( clearer );
      }
      cdolist_list_var = cdolist_list_var.rest();
      clearer = cdolist_list_var.first();
    }
    return $kw17$CLEARED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10376L)
  public static SubLObject use_default_linkage_creation_rulesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $kw18$DEFAULT, $linkage_creation_rules$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10481L)
  public static SubLObject linkage_creation_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $linkage_creation_rules$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10654L)
  public static SubLObject with_parse_tree_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym20$CLET, ConsesLow.list( ConsesLow.list( $sym21$_PARSE_TREE_MT_, mt ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10869L)
  public static SubLObject with_parse_tree_prefix(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject prefix = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    prefix = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym20$CLET, ConsesLow.list( ConsesLow.list( $sym24$_PARSE_TREE_PREFIX_, prefix ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11396L)
  public static SubLObject with_parse_tokenization(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tokenization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    tokenization = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      if( NIL == conses_high.member( current_$1, $list26, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw27$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    }
    final SubLObject offset_tail = cdestructuring_bind.property_list_member( $kw28$OFFSET, current );
    final SubLObject offset = ( NIL != offset_tail ) ? conses_high.cadr( offset_tail ) : ZERO_INTEGER;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym20$CLET, ConsesLow.list( ConsesLow.list( $sym29$_PARSE_TOKENIZATION_, tokenization ), ConsesLow.list( $sym30$_PARSE_TOKENIZATION_OFFSET_, offset ) ), ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_parsing_vars_file()
  {
    SubLFiles.declareFunction( me, "initialize_nl_kb_feature", "INITIALIZE-NL-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_tag_cycl_placeholder", "NL-TAG-CYCL-PLACEHOLDER", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_environmental_state", "PSP-ENVIRONMENTAL-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_environmental_global_pair", "PSP-ENVIRONMENTAL-GLOBAL-PAIR", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_clear_interface_helper_caches", "PSP-CLEAR-INTERFACE-HELPER-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "use_default_linkage_creation_rulesP", "USE-DEFAULT-LINKAGE-CREATION-RULES?", 0, 0, false );
    SubLFiles.declareFunction( me, "linkage_creation_rules", "LINKAGE-CREATION-RULES", 0, 0, false );
    SubLFiles.declareMacro( me, "with_parse_tree_mt", "WITH-PARSE-TREE-MT" );
    SubLFiles.declareMacro( me, "with_parse_tree_prefix", "WITH-PARSE-TREE-PREFIX" );
    SubLFiles.declareMacro( me, "with_parse_tokenization", "WITH-PARSE-TOKENIZATION" );
    return NIL;
  }

  public static SubLObject init_parsing_vars_file()
  {
    $nl_core_constants$ = SubLFiles.deflexical( "*NL-CORE-CONSTANTS*", $list0 );
    $perform_np_parser_expansion$ = SubLFiles.defparameter( "*PERFORM-NP-PARSER-EXPANSION*", T );
    $perform_vp_parser_expansion$ = SubLFiles.defparameter( "*PERFORM-VP-PARSER-EXPANSION*", NIL );
    $rkf_template_wff_filter_level$ = SubLFiles.defparameter( "*RKF-TEMPLATE-WFF-FILTER-LEVEL*", TWO_INTEGER );
    $np_wff_filter_level$ = SubLFiles.defparameter( "*NP-WFF-FILTER-LEVEL*", TWO_INTEGER );
    $np_wff_filter_mts$ = SubLFiles.defparameter( "*NP-WFF-FILTER-MTS*", NIL );
    $guess_semantics_for_unknown_wordsP$ = SubLFiles.defparameter( "*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*", NIL );
    $psp_clear_caches_each_parseP$ = SubLFiles.defparameter( "*PSP-CLEAR-CACHES-EACH-PARSE?*", NIL );
    $bypass_psp_cachesP$ = SubLFiles.defparameter( "*BYPASS-PSP-CACHES?*", NIL );
    $npp_use_strings_for_semanticsP$ = SubLFiles.defparameter( "*NPP-USE-STRINGS-FOR-SEMANTICS?*", T );
    $npp_max_rules_per_compound$ = SubLFiles.defparameter( "*NPP-MAX-RULES-PER-COMPOUND*", THREE_INTEGER );
    $rbp_include_word_unitsP$ = SubLFiles.defparameter( "*RBP-INCLUDE-WORD-UNITS?*", T );
    $rbp_bypass_deverbal_filtersP$ = SubLFiles.defparameter( "*RBP-BYPASS-DEVERBAL-FILTERS?*", NIL );
    $rbp_apply_all_filters_regardlessP$ = SubLFiles.defparameter( "*RBP-APPLY-ALL-FILTERS-REGARDLESS?*", NIL );
    $rbp_filter_violations_limit$ = SubLFiles.defparameter( "*RBP-FILTER-VIOLATIONS-LIMIT*", TWO_INTEGER );
    $rbp_bypass_block_unificationP$ = SubLFiles.defparameter( "*RBP-BYPASS-BLOCK-UNIFICATION?*", NIL );
    $rbp_reformulate_resultsP$ = SubLFiles.defparameter( "*RBP-REFORMULATE-RESULTS?*", T );
    $evaluate_nl_reformulator_resultsP$ = SubLFiles.defparameter( "*EVALUATE-NL-REFORMULATOR-RESULTS?*", T );
    $npp_use_nl_tagsP$ = SubLFiles.defparameter( "*NPP-USE-NL-TAGS?*", T );
    $use_ternary_np_tagsP$ = SubLFiles.defparameter( "*USE-TERNARY-NP-TAGS?*", T );
    $nl_tag_cycl_placeholder$ = SubLFiles.deflexical( "*NL-TAG-CYCL-PLACEHOLDER*", $kw2$NL_TAG_CYCL_PLACEHOLDER );
    $psp_lexicon$ = SubLFiles.defparameter( "*PSP-LEXICON*", misc_utilities.uninitialized() );
    $psp_reformulateP$ = SubLFiles.defparameter( "*PSP-REFORMULATE?*", T );
    $psp_pos_pred_filterP$ = SubLFiles.defparameter( "*PSP-POS-PRED-FILTER?*", NIL );
    $psp_pos_pred_filter_preds$ = SubLFiles.defparameter( "*PSP-POS-PRED-FILTER-PREDS*", $list3 );
    $parser_cycl_blacklist$ = SubLFiles.defvar( "*PARSER-CYCL-BLACKLIST*", NIL );
    $psp_indexical_map$ = SubLFiles.defparameter( "*PSP-INDEXICAL-MAP*", NIL );
    $psp_return_mode$ = SubLFiles.defparameter( "*PSP-RETURN-MODE*", $kw4$EVERYTHING );
    $psp_verboseP$ = SubLFiles.defparameter( "*PSP-VERBOSE?*", NIL );
    $psp_chart$ = SubLFiles.defparameter( "*PSP-CHART*", NIL );
    $psp_chart_consolidate_edgesP$ = SubLFiles.defparameter( "*PSP-CHART-CONSOLIDATE-EDGES?*", NIL );
    $psp_use_lookahead_for_bad_edgesP$ = SubLFiles.defparameter( "*PSP-USE-LOOKAHEAD-FOR-BAD-EDGES?*", NIL );
    $psp_chart_start_index$ = SubLFiles.defparameter( "*PSP-CHART-START-INDEX*", ZERO_INTEGER );
    $psp_chart_end_index$ = SubLFiles.defparameter( "*PSP-CHART-END-INDEX*", NIL );
    $psp_extra_charts$ = SubLFiles.defparameter( "*PSP-EXTRA-CHARTS*", NIL );
    $psp_dont_destroy_chartP$ = SubLFiles.defparameter( "*PSP-DONT-DESTROY-CHART?*", NIL );
    $psp_rule_lookup_mt$ = SubLFiles.deflexical( "*PSP-RULE-LOOKUP-MT*", $const5$EnglishMt );
    $psp_concept_filters$ = SubLFiles.defparameter( "*PSP-CONCEPT-FILTERS*", NIL );
    $parsing_domain_mt$ = SubLFiles.defparameter( "*PARSING-DOMAIN-MT*", $const6$CurrentWorldDataCollectorMt_NonHo );
    $rbp_rule_lookup_mt$ = SubLFiles.deflexical( "*RBP-RULE-LOOKUP-MT*", $const5$EnglishMt );
    $psp_gap_type_allowed$ = SubLFiles.defparameter( "*PSP-GAP-TYPE-ALLOWED*", $kw7$NONE );
    $psp_generality_preference$ = SubLFiles.defparameter( "*PSP-GENERALITY-PREFERENCE*", $kw8$GENERAL );
    $psp_parse_to_match$ = SubLFiles.defparameter( "*PSP-PARSE-TO-MATCH*", misc_utilities.uninitialized() );
    $psp_min_weight$ = SubLFiles.defconstant( "*PSP-MIN-WEIGHT*", ZERO_INTEGER );
    $psp_max_weight$ = SubLFiles.defconstant( "*PSP-MAX-WEIGHT*", $int9$255 );
    $psp_weight_type$ = SubLFiles.defconstant( "*PSP-WEIGHT-TYPE*", $kw10$INTEGER );
    $psp_environmental_globals_new$ = SubLFiles.deflexical( "*PSP-ENVIRONMENTAL-GLOBALS-NEW*", ConsesLow.append( $list11, lexicon_vars.lexicon_filters() ) );
    $psp_max_edges_per_span$ = SubLFiles.defparameter( "*PSP-MAX-EDGES-PER-SPAN*", $int14$2120 );
    $psp_max_edges_per_chart$ = SubLFiles.defparameter( "*PSP-MAX-EDGES-PER-CHART*", $int15$100000 );
    $psp_cached_interface_helper_clearing_functions$ = SubLFiles.deflexical( "*PSP-CACHED-INTERFACE-HELPER-CLEARING-FUNCTIONS*", ( maybeDefault( $sym16$_PSP_CACHED_INTERFACE_HELPER_CLEARING_FUNCTIONS_,
        $psp_cached_interface_helper_clearing_functions$, NIL ) ) );
    $variable_uniquification_store$ = SubLFiles.defparameter( "*VARIABLE-UNIQUIFICATION-STORE*", dictionary.new_dictionary( EQUALP, UNPROVIDED ) );
    $linkage_creation_rules$ = SubLFiles.defparameter( "*LINKAGE-CREATION-RULES*", $kw18$DEFAULT );
    $parse_tree_mt$ = SubLFiles.defparameter( "*PARSE-TREE-MT*", NIL );
    $parse_tree_prefix$ = SubLFiles.defparameter( "*PARSE-TREE-PREFIX*", $str22$NL );
    $use_strict_syntactic_node_checkingP$ = SubLFiles.defparameter( "*USE-STRICT-SYNTACTIC-NODE-CHECKING?*", NIL );
    $parse_root_node$ = SubLFiles.defparameter( "*PARSE-ROOT-NODE*", NIL );
    $parse_tokenization$ = SubLFiles.defparameter( "*PARSE-TOKENIZATION*", NIL );
    $parse_tokenization_offset$ = SubLFiles.defparameter( "*PARSE-TOKENIZATION-OFFSET*", ZERO_INTEGER );
    $reify_parse_nodesP$ = SubLFiles.defparameter( "*REIFY-PARSE-NODES?*", NIL );
    $storing_cyclifier_wff_results$ = SubLFiles.defparameter( "*STORING-CYCLIFIER-WFF-RESULTS*", NIL );
    $cyclifier_wff_checking_results$ = SubLFiles.defparameter( "*CYCLIFIER-WFF-CHECKING-RESULTS*", $str31$data_nl_wff_results_cyclifier_wff );
    $numeral_parser_case_sensitiveP$ = SubLFiles.defparameter( "*NUMERAL-PARSER-CASE-SENSITIVE?*", NIL );
    $fscp_verboseP$ = SubLFiles.defparameter( "*FSCP-VERBOSE?*", NIL );
    $speaker_referent$ = SubLFiles.defparameter( "*SPEAKER-REFERENT*", NIL );
    return NIL;
  }

  public static SubLObject setup_parsing_vars_file()
  {
    subl_macro_promotions.declare_defglobal( $sym16$_PSP_CACHED_INTERFACE_HELPER_CLEARING_FUNCTIONS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_parsing_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_parsing_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_parsing_vars_file();
  }
  static
  {
    me = new parsing_vars();
    $nl_core_constants$ = null;
    $perform_np_parser_expansion$ = null;
    $perform_vp_parser_expansion$ = null;
    $rkf_template_wff_filter_level$ = null;
    $np_wff_filter_level$ = null;
    $np_wff_filter_mts$ = null;
    $guess_semantics_for_unknown_wordsP$ = null;
    $psp_clear_caches_each_parseP$ = null;
    $bypass_psp_cachesP$ = null;
    $npp_use_strings_for_semanticsP$ = null;
    $npp_max_rules_per_compound$ = null;
    $rbp_include_word_unitsP$ = null;
    $rbp_bypass_deverbal_filtersP$ = null;
    $rbp_apply_all_filters_regardlessP$ = null;
    $rbp_filter_violations_limit$ = null;
    $rbp_bypass_block_unificationP$ = null;
    $rbp_reformulate_resultsP$ = null;
    $evaluate_nl_reformulator_resultsP$ = null;
    $npp_use_nl_tagsP$ = null;
    $use_ternary_np_tagsP$ = null;
    $nl_tag_cycl_placeholder$ = null;
    $psp_lexicon$ = null;
    $psp_reformulateP$ = null;
    $psp_pos_pred_filterP$ = null;
    $psp_pos_pred_filter_preds$ = null;
    $parser_cycl_blacklist$ = null;
    $psp_indexical_map$ = null;
    $psp_return_mode$ = null;
    $psp_verboseP$ = null;
    $psp_chart$ = null;
    $psp_chart_consolidate_edgesP$ = null;
    $psp_use_lookahead_for_bad_edgesP$ = null;
    $psp_chart_start_index$ = null;
    $psp_chart_end_index$ = null;
    $psp_extra_charts$ = null;
    $psp_dont_destroy_chartP$ = null;
    $psp_rule_lookup_mt$ = null;
    $psp_concept_filters$ = null;
    $parsing_domain_mt$ = null;
    $rbp_rule_lookup_mt$ = null;
    $psp_gap_type_allowed$ = null;
    $psp_generality_preference$ = null;
    $psp_parse_to_match$ = null;
    $psp_min_weight$ = null;
    $psp_max_weight$ = null;
    $psp_weight_type$ = null;
    $psp_environmental_globals_new$ = null;
    $psp_max_edges_per_span$ = null;
    $psp_max_edges_per_chart$ = null;
    $psp_cached_interface_helper_clearing_functions$ = null;
    $variable_uniquification_store$ = null;
    $linkage_creation_rules$ = null;
    $parse_tree_mt$ = null;
    $parse_tree_prefix$ = null;
    $use_strict_syntactic_node_checkingP$ = null;
    $parse_root_node$ = null;
    $parse_tokenization$ = null;
    $parse_tokenization_offset$ = null;
    $reify_parse_nodesP$ = null;
    $storing_cyclifier_wff_results$ = null;
    $cyclifier_wff_checking_results$ = null;
    $numeral_parser_case_sensitiveP$ = null;
    $fscp_verboseP$ = null;
    $speaker_referent$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "DataForNLMt" ) ), constant_handles.reader_make_constant_shell( makeString( "NLUtteranceAttribute" ) ),
      constant_handles.reader_make_constant_shell( makeString( "NLTagFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), constant_handles.reader_make_constant_shell( makeString(
          "NLDefinitenessFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLQuantFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles
              .reader_make_constant_shell( makeString( "NLQuantFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "singular-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "partOfSpeech" ) )
    } );
    $sym1$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $kw2$NL_TAG_CYCL_PLACEHOLDER = makeKeyword( "NL-TAG-CYCL-PLACEHOLDER" );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "stockTickerSymbol" ) ), constant_handles.reader_make_constant_shell( makeString( "countryCodeDigraph" ) ), constant_handles
        .reader_make_constant_shell( makeString( "executableProgramName" ) ), constant_handles.reader_make_constant_shell( makeString( "internetCountryCode" ) ) );
    $kw4$EVERYTHING = makeKeyword( "EVERYTHING" );
    $const5$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $const6$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) );
    $kw7$NONE = makeKeyword( "NONE" );
    $kw8$GENERAL = makeKeyword( "GENERAL" );
    $int9$255 = makeInteger( 255 );
    $kw10$INTEGER = makeKeyword( "INTEGER" );
    $list11 = ConsesLow.list( new SubLObject[] { makeSymbol( "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*" ), makeSymbol( "*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*" ), makeSymbol( "*PARSING-TIMEOUT-TIME*" ), makeSymbol(
        "*NPP-USE-NL-TAGS?*" ), makeSymbol( "*PSP-USE-TERM-LEXICON?*" ), makeSymbol( "*NP-WFF-FILTER-LEVEL*" ), makeSymbol( "*PSP-GAP-TYPE-ALLOWED*" ), makeSymbol( "*PSP-INDEXICAL-MAP*" ), makeSymbol(
            "*PSP-MAX-EDGES-PER-SPAN*" ), makeSymbol( "*PSP-MAX-EDGES-PER-CHART*" ), makeSymbol( "*USE-TERNARY-NP-TAGS?*" ), makeSymbol( "*PSP-REFORMULATE?*" ), makeSymbol( "*PSP-POS-PRED-FILTER?*" ), makeSymbol(
                "*PSP-POS-PRED-FILTER-PREDS*" ), makeSymbol( "*PARSER-CYCL-BLACKLIST*" ), makeSymbol( "*LEXICON-LOOKUP-MT*" ), makeSymbol( "*PARSING-DOMAIN-MT*" ), makeSymbol( "*PSP-RETURN-MODE*" ), makeSymbol(
                    "*PSP-PARSE-TO-MATCH*" ), makeSymbol( "*PSP-GENERALITY-PREFERENCE*" ), makeSymbol( "*PSP-CONCEPT-FILTERS*" )
    } );
    $sym12$PSP_ENVIRONMENTAL_GLOBAL_PAIR = makeSymbol( "PSP-ENVIRONMENTAL-GLOBAL-PAIR" );
    $sym13$BOUNDP = makeSymbol( "BOUNDP" );
    $int14$2120 = makeInteger( 2120 );
    $int15$100000 = makeInteger( 100000 );
    $sym16$_PSP_CACHED_INTERFACE_HELPER_CLEARING_FUNCTIONS_ = makeSymbol( "*PSP-CACHED-INTERFACE-HELPER-CLEARING-FUNCTIONS*" );
    $kw17$CLEARED = makeKeyword( "CLEARED" );
    $kw18$DEFAULT = makeKeyword( "DEFAULT" );
    $list19 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym20$CLET = makeSymbol( "CLET" );
    $sym21$_PARSE_TREE_MT_ = makeSymbol( "*PARSE-TREE-MT*" );
    $str22$NL = makeString( "NL" );
    $list23 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym24$_PARSE_TREE_PREFIX_ = makeSymbol( "*PARSE-TREE-PREFIX*" );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "TOKENIZATION" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "OFFSET" ), ZERO_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list26 = ConsesLow.list( makeKeyword( "OFFSET" ) );
    $kw27$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw28$OFFSET = makeKeyword( "OFFSET" );
    $sym29$_PARSE_TOKENIZATION_ = makeSymbol( "*PARSE-TOKENIZATION*" );
    $sym30$_PARSE_TOKENIZATION_OFFSET_ = makeSymbol( "*PARSE-TOKENIZATION-OFFSET*" );
    $str31$data_nl_wff_results_cyclifier_wff = makeString( "data/nl/wff-results/cyclifier-wff-results.txt" );
  }
}
/*
 * 
 * Total time: 111 ms
 * 
 */