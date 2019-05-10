package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lexicon_vars";
  public static final String myFingerPrint = "017c1cde5f5ffc02e7e176989998808cd5f873a7573f11c55dc75e74b8562600";
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 655L)
  public static SubLSymbol $psg_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 769L)
  public static SubLSymbol $print_while_building_hashP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 889L)
  public static SubLSymbol $nl_understanding_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 981L)
  public static SubLSymbol $nl_generation_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1069L)
  public static SubLSymbol $nl_relevance_purpose$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1175L)
  public static SubLSymbol $misspellingsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1267L)
  public static SubLSymbol $parse_morphologically$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1392L)
  private static SubLSymbol $parse_morphologically_options$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1758L)
  public static SubLSymbol $exclude_vulgaritiesP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1866L)
  public static SubLSymbol $exclude_slangP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1967L)
  public static SubLSymbol $exclude_archaic_speechP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2079L)
  public static SubLSymbol $exclude_indirect_relationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2859L)
  public static SubLSymbol $lexicon_lookup_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3241L)
  public static SubLSymbol $greedy_nlwe_interpretations$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3393L)
  public static SubLSymbol $favored_pos$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3456L)
  public static SubLSymbol $max_mww_word_length$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3562L)
  public static SubLSymbol $use_acronymsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3659L)
  public static SubLSymbol $use_abbreviationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3769L)
  public static SubLSymbol $use_lexical_abbreviationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3905L)
  public static SubLSymbol $initialize_nl_trie_control_varsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 4025L)
  public static SubLSymbol $wn_pos_cyc_pos_map$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6346L)
  private static SubLSymbol $semtrans_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6964L)
  private static SubLSymbol $multi_word_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 7758L)
  public static SubLSymbol $semantic_predicates_excluded_from_lexical_lookup$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 8532L)
  private static SubLSymbol $abbreviation_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9127L)
  private static SubLSymbol $acronym_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9702L)
  private static SubLSymbol $proper_name_predicates_from_kb$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 11376L)
  private static SubLSymbol $term_strings_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
  private static SubLSymbol $head_position_pred_cachedP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
  private static SubLSymbol $verb_frames_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14438L)
  public static SubLSymbol $noun_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14495L)
  public static SubLSymbol $pn_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14568L)
  public static SubLSymbol $pn_mass_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14622L)
  public static SubLSymbol $pn_count_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14686L)
  public static SubLSymbol $agentive_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14749L)
  public static SubLSymbol $mass_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14961L)
  public static SubLSymbol $verb_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15272L)
  public static SubLSymbol $adjective_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15381L)
  public static SubLSymbol $adverb_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15484L)
  private static SubLSymbol $all_lexicon_string_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17057L)
  private static SubLSymbol $all_lexicon_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17527L)
  public static SubLSymbol $top_level_nl_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 18251L)
  public static SubLSymbol $root_form_speech_parts$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 18875L)
  public static SubLSymbol $lexicon_cache_code_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 19111L)
  public static SubLSymbol $morphology_code_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 19277L)
  public static SubLSymbol $nl_trie_code_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 19427L)
  private static SubLSymbol $noop_updates_for_lexicon_globals$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 20469L)
  private static SubLSymbol $lexicon_global_noop_done_values$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 21690L)
  public static SubLSymbol $mwp_reformulate_resultsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 21907L)
  public static SubLSymbol $mwp_triefy_resultsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22021L)
  public static SubLSymbol $use_mwpP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22156L)
  public static SubLSymbol $mwp_make_up_basesP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22296L)
  public static SubLSymbol $mwp_semantic_check_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22355L)
  public static SubLSymbol $mwp_syntactic_check_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22414L)
  public static SubLSymbol $mwp_rule_lookup_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22469L)
  public static SubLSymbol $mwp_wff_filter_level$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22517L)
  public static SubLSymbol $mwp_suppress_recursive_analysisP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22649L)
  public static SubLSymbol $nl_affix_types$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22841L)
  public static SubLSymbol $default_lexification_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23026L)
  public static SubLSymbol $default_syntactic_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23135L)
  public static SubLSymbol $default_relational_lexification_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23270L)
  public static SubLSymbol $default_lexification_template_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23395L)
  public static SubLSymbol $default_predicate_lexification_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23534L)
  public static SubLSymbol $use_sme_lexwiz$;
  private static final SubLSymbol $kw0$GENERATION;
  private static final SubLSymbol $kw1$AS_FALLBACK;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$LEXICON_FILTER_ACTIVE_;
  private static final SubLObject $const5$BaseKB;
  private static final SubLSymbol $sym6$_LEXICON_LOOKUP_MT_;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$IMAGE_DEMO;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$_EXIT;
  private static final SubLSymbol $sym11$_SEMTRANS_PREDS_;
  private static final SubLObject $const12$SemTransPred;
  private static final SubLSymbol $sym13$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const14$EverythingPSC;
  private static final SubLObject $const15$MultiWordForConstantPred;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$_ABBREVIATION_PREDICATES_;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$_ACRONYM_PREDICATES_;
  private static final SubLObject $const20$acronymString;
  private static final SubLSymbol $sym21$_PROPER_NAME_PREDICATES_FROM_KB_;
  private static final SubLObject $const22$properNameStrings;
  private static final SubLObject $const23$ProperNamePredicate_General;
  private static final SubLSymbol $sym24$_TERM_STRINGS_PREDS_;
  private static final SubLObject $const25$termStrings;
  private static final SubLObject $const26$HeadMedialMultiWordForConstantPre;
  private static final SubLObject $const27$HeadInitialMultiWordForConstantPr;
  private static final SubLObject $const28$HeadFinalMultiWordForConstantPred;
  private static final SubLSymbol $sym29$HEAD_POSITION_PRED_CACHED_;
  private static final SubLSymbol $sym30$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_;
  private static final SubLInteger $int31$256;
  private static final SubLSymbol $sym32$VERB_FRAMES;
  private static final SubLObject $const33$verbSemTrans;
  private static final SubLSymbol $sym34$_VERB_FRAMES_CACHING_STATE_;
  private static final SubLInteger $int35$128;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $kw45$UNINITIALIZED;
  private static final SubLSymbol $sym46$VALID_CONSTANT_;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLObject $const49$wordStrings;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$_LEXICON_CACHE_CODE_REVISION_;
  private static final SubLSymbol $sym52$_MORPHOLOGY_CODE_REVISION_;
  private static final SubLSymbol $sym53$_NL_TRIE_CODE_REVISION_;
  private static final SubLSymbol $sym54$_NOOP_UPDATES_FOR_LEXICON_GLOBALS_;
  private static final SubLString $str55$Lexicon_global_noop_updates_must_;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$SUPERSTRING_;
  private static final SubLObject $const58$EnglishMt;
  private static final SubLList $list59;
  private static final SubLString $str60$GeneralEnglishMt;
  private static final SubLSymbol $sym61$_DEFAULT_LEXIFICATION_MT_;
  private static final SubLSymbol $sym62$_DEFAULT_SYNTACTIC_MT_;
  private static final SubLString $str63$EnglishParaphraseMt;
  private static final SubLSymbol $sym64$_DEFAULT_RELATIONAL_LEXIFICATION_MT_;
  private static final SubLString $str65$EnglishTemplateMt;
  private static final SubLSymbol $sym66$_DEFAULT_LEXIFICATION_TEMPLATE_MT_;
  private static final SubLString $str67$RelationParaphraseMt;
  private static final SubLSymbol $sym68$_DEFAULT_PREDICATE_LEXIFICATION_MT_;
  private static final SubLSymbol $sym69$_USE_SME_LEXWIZ_;

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1639L)
  public static SubLObject parse_morphologically_option_p(final SubLObject v_object)
  {
    return conses_high.member( v_object, $parse_morphologically_options$.getGlobalValue(), Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2249L)
  public static SubLObject active_lexicon_filtersP()
  {
    return list_utilities.sublisp_boolean( active_lexicon_filters() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2404L)
  public static SubLObject lexicon_filters()
  {
    return $list3;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2606L)
  public static SubLObject active_lexicon_filters()
  {
    return list_utilities.remove_if_not( $sym4$LEXICON_FILTER_ACTIVE_, lexicon_filters(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2775L)
  public static SubLObject lexicon_filter_activeP(final SubLObject filter)
  {
    return list_utilities.sublisp_boolean( Eval.eval( filter ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3102L)
  public static SubLObject lexicon_lookup_mt_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return mt_relevance_macros.mt_to_mt_info( $lexicon_lookup_mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 4448L)
  public static SubLObject set_app(final SubLObject app)
  {
    if( app == $kw8$IMAGE_DEMO )
    {
      $greedy_nlwe_interpretations$.setDynamicValue( T );
      $use_acronymsP$.setDynamicValue( NIL );
      $use_abbreviationsP$.setDynamicValue( NIL );
      control_vars.$partial_semanticsP$.setDynamicValue( T );
      $nl_understanding_mts$.setDynamicValue( $list9 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 5220L)
  public static SubLObject clear_cached_lexical_vars()
  {
    clear_lex_pred_set( $multi_word_preds$.getGlobalValue() );
    clear_lex_pred_set( $proper_name_predicates_from_kb$.getGlobalValue() );
    clear_lex_pred_set( $term_strings_preds$.getGlobalValue() );
    $all_lexicon_string_predicates$.setGlobalValue( misc_utilities.uninitialized() );
    $all_lexicon_predicates$.setGlobalValue( NIL );
    clear_lex_pred_set( $semtrans_preds$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 5672L)
  public static SubLObject lex_pred_set_p(final SubLObject v_object)
  {
    return locking_map.locking_map_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 5747L)
  public static SubLObject lex_pred_set_uninitializedP(final SubLObject v_set)
  {
    final SubLObject rw_lock_var = locking_map.locking_map_lock( v_set );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      return makeBoolean( map_utilities.map_size( v_set ).eql( ONE_INTEGER ) && NIL != map_utilities.map_has_keyP( v_set, misc_utilities.uninitialized() ) );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 5921L)
  public static SubLObject clear_lex_pred_set(final SubLObject v_set)
  {
    final SubLObject rw_lock_var = locking_map.locking_map_lock( v_set );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      map_utilities.map_remove_all( v_set );
      map_utilities.map_put( v_set, misc_utilities.uninitialized(), T );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6076L)
  public static SubLObject new_lex_pred_set()
  {
    return locking_map.create_locking_map( set_utilities.new_singleton_set( misc_utilities.uninitialized(), Symbols.symbol_function( EQL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6187L)
  public static SubLObject lex_pred_set_memberP(final SubLObject pred, final SubLObject v_set)
  {
    return map_utilities.map_has_keyP( v_set, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6271L)
  public static SubLObject lex_pred_set_element_list(final SubLObject v_set)
  {
    return map_utilities.map_keys( v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6459L)
  public static SubLObject initialize_semtrans_preds()
  {
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $semtrans_preds$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      map_utilities.map_remove_all( $semtrans_preds$.getGlobalValue() );
      SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts( $const12$SemTransPred );
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        map_utilities.map_put( $semtrans_preds$.getGlobalValue(), pred, T );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return $semtrans_preds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6727L)
  public static SubLObject semtrans_predP(final SubLObject v_term)
  {
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $semtrans_preds$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      if( NIL != lex_pred_set_uninitializedP( $semtrans_preds$.getGlobalValue() ) )
      {
        initialize_semtrans_preds();
      }
      return lex_pred_set_memberP( v_term, $semtrans_preds$.getGlobalValue() );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 7082L)
  public static SubLObject multi_word_preds()
  {
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $multi_word_preds$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      if( NIL != lex_pred_set_uninitializedP( $multi_word_preds$.getGlobalValue() ) )
      {
        initialize_multi_word_preds();
      }
      return lex_pred_set_element_list( $multi_word_preds$.getGlobalValue() );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 7328L)
  public static SubLObject initialize_multi_word_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $multi_word_preds$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      clear_head_position_pred_cachedP();
      map_utilities.map_remove_all( $multi_word_preds$.getGlobalValue() );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym13$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const14$EverythingPSC, thread );
        if( NIL != constant_handles.valid_constantP( $const15$MultiWordForConstantPred, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var = isa.all_fort_instances( $const15$MultiWordForConstantPred, UNPROVIDED, UNPROVIDED );
          SubLObject pred = NIL;
          pred = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL == hl_prototypes.hl_prototypical_instanceP( pred ) )
            {
              map_utilities.map_put( $multi_word_preds$.getGlobalValue(), pred, T );
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return $multi_word_preds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 8598L)
  public static SubLObject abbreviation_predicates()
  {
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $abbreviation_predicates$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      if( NIL != lex_pred_set_uninitializedP( $abbreviation_predicates$.getGlobalValue() ) )
      {
        map_utilities.map_remove_all( $abbreviation_predicates$.getGlobalValue() );
        SubLObject cdolist_list_var = $list18;
        SubLObject abbrev_pred = NIL;
        abbrev_pred = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$1 = genl_predicates.all_spec_preds( abbrev_pred, UNPROVIDED, UNPROVIDED );
          SubLObject pred = NIL;
          pred = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            map_utilities.map_put( $abbreviation_predicates$.getGlobalValue(), pred, T );
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            pred = cdolist_list_var_$1.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          abbrev_pred = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return lex_pred_set_element_list( $abbreviation_predicates$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9188L)
  public static SubLObject acronym_predicates()
  {
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $acronym_predicates$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      if( NIL != lex_pred_set_uninitializedP( $acronym_predicates$.getGlobalValue() ) )
      {
        SubLObject cdolist_list_var = genl_predicates.all_spec_preds( $const20$acronymString, UNPROVIDED, UNPROVIDED );
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          map_utilities.map_put( $acronym_predicates$.getGlobalValue(), pred, T );
          cdolist_list_var = cdolist_list_var.rest();
          pred = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return lex_pred_set_element_list( $acronym_predicates$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9499L)
  public static SubLObject name_string_preds(SubLObject force_reinitializationP)
  {
    if( force_reinitializationP == UNPROVIDED )
    {
      force_reinitializationP = NIL;
    }
    return lex_pred_set_element_list( name_string_preds_set( force_reinitializationP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9824L)
  public static SubLObject name_string_preds_set(SubLObject force_reinitializationP)
  {
    if( force_reinitializationP == UNPROVIDED )
    {
      force_reinitializationP = NIL;
    }
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $proper_name_predicates_from_kb$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      if( NIL != lex_pred_set_uninitializedP( $proper_name_predicates_from_kb$.getGlobalValue() ) || NIL != force_reinitializationP )
      {
        initialize_proper_name_preds();
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return $proper_name_predicates_from_kb$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 10270L)
  public static SubLObject initialize_proper_name_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $proper_name_predicates_from_kb$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      map_utilities.map_remove_all( $proper_name_predicates_from_kb$.getGlobalValue() );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym13$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const14$EverythingPSC, thread );
        if( NIL != constant_handles.valid_constantP( $const22$properNameStrings, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var = genl_predicates.all_spec_predicates( $const22$properNameStrings, UNPROVIDED, UNPROVIDED );
          SubLObject spec_pred = NIL;
          spec_pred = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            map_utilities.map_put( $proper_name_predicates_from_kb$.getGlobalValue(), spec_pred, T );
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
          }
        }
        if( NIL != constant_handles.valid_constantP( $const23$ProperNamePredicate_General, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var = isa.all_fort_instances( $const23$ProperNamePredicate_General, UNPROVIDED, UNPROVIDED );
          SubLObject pred = NIL;
          pred = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            map_utilities.map_put( $proper_name_predicates_from_kb$.getGlobalValue(), pred, T );
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return $proper_name_predicates_from_kb$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 10860L)
  public static SubLObject name_string_predP(final SubLObject obj)
  {
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $proper_name_predicates_from_kb$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      if( NIL != lex_pred_set_uninitializedP( $proper_name_predicates_from_kb$.getGlobalValue() ) )
      {
        initialize_proper_name_preds();
      }
      return lex_pred_set_memberP( obj, $proper_name_predicates_from_kb$.getGlobalValue() );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 11437L)
  public static SubLObject term_strings_preds(SubLObject force_reinitializationP)
  {
    if( force_reinitializationP == UNPROVIDED )
    {
      force_reinitializationP = NIL;
    }
    return lex_pred_set_element_list( term_strings_preds_set( force_reinitializationP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 11643L)
  public static SubLObject term_strings_preds_set(SubLObject force_reinitializationP)
  {
    if( force_reinitializationP == UNPROVIDED )
    {
      force_reinitializationP = NIL;
    }
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $term_strings_preds$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      if( NIL != lex_pred_set_uninitializedP( $term_strings_preds$.getGlobalValue() ) || NIL != force_reinitializationP )
      {
        initialize_term_strings_preds();
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return $term_strings_preds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 11984L)
  public static SubLObject initialize_term_strings_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    initialize_proper_name_preds();
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $term_strings_preds$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      map_utilities.map_remove_all( $term_strings_preds$.getGlobalValue() );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym13$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const14$EverythingPSC, thread );
        if( NIL != constant_handles.valid_constantP( $const25$termStrings, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var = genl_predicates.all_spec_preds( $const25$termStrings, UNPROVIDED, UNPROVIDED );
          SubLObject pred = NIL;
          pred = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL == name_string_predP( pred ) )
            {
              map_utilities.map_put( $term_strings_preds$.getGlobalValue(), pred, T );
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return $term_strings_preds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 12388L)
  public static SubLObject term_strings_predP(final SubLObject obj)
  {
    final SubLObject rw_lock_var = locking_map.locking_map_lock( $term_strings_preds$.getGlobalValue() );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      if( NIL != lex_pred_set_uninitializedP( $term_strings_preds$.getGlobalValue() ) )
      {
        initialize_term_strings_preds();
      }
      return lex_pred_set_memberP( obj, $term_strings_preds$.getGlobalValue() );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 12844L)
  public static SubLObject name_or_term_strings_predP(final SubLObject obj)
  {
    return makeBoolean( NIL != name_string_predP( obj ) || NIL != term_strings_predP( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13062L)
  public static SubLObject nl_agr_predP(final SubLObject obj)
  {
    return makeBoolean( NIL != name_or_term_strings_predP( obj ) || NIL != lexicon_accessors.speech_part_predP( obj, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13265L)
  public static SubLObject head_medial_predP(final SubLObject pred)
  {
    return head_position_pred_cachedP( pred, $const26$HeadMedialMultiWordForConstantPre );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13500L)
  public static SubLObject head_initial_predP(final SubLObject pred)
  {
    return head_position_pred_cachedP( pred, $const27$HeadInitialMultiWordForConstantPr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13737L)
  public static SubLObject head_final_predP(final SubLObject pred)
  {
    return head_position_pred_cachedP( pred, $const28$HeadFinalMultiWordForConstantPred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
  public static SubLObject clear_head_position_pred_cachedP()
  {
    final SubLObject cs = $head_position_pred_cachedP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
  public static SubLObject remove_head_position_pred_cachedP(final SubLObject pred, final SubLObject type)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $head_position_pred_cachedP_caching_state$.getGlobalValue(), ConsesLow.list( pred, type ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
  public static SubLObject head_position_pred_cachedP_internal(final SubLObject pred, final SubLObject type)
  {
    return makeBoolean( NIL != constant_handles.valid_constantP( pred, UNPROVIDED ) && NIL != constant_handles.valid_constantP( type, UNPROVIDED ) && NIL != isa.isa_in_any_mtP( pred, type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
  public static SubLObject head_position_pred_cachedP(final SubLObject pred, final SubLObject type)
  {
    SubLObject caching_state = $head_position_pred_cachedP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym29$HEAD_POSITION_PRED_CACHED_, $sym30$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_, NIL, EQL, TWO_INTEGER, $int31$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, type );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && type.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( head_position_pred_cachedP_internal( pred, type ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, type ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
  public static SubLObject clear_verb_frames()
  {
    final SubLObject cs = $verb_frames_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
  public static SubLObject remove_verb_frames(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $verb_frames_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
  public static SubLObject verb_frames_internal(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = kb_mapping_utilities.pred_refs( $const33$verbSemTrans, THREE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
  public static SubLObject verb_frames(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $verb_frames_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym32$VERB_FRAMES, $sym34$_VERB_FRAMES_CACHING_STATE_, $int35$128, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( verb_frames_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15553L)
  public static SubLObject all_lexicon_string_predicates()
  {
    if( $kw45$UNINITIALIZED == $all_lexicon_string_predicates$.getGlobalValue() )
    {
      initialize_all_lexicon_string_predicates();
    }
    return $all_lexicon_string_predicates$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15755L)
  public static SubLObject initialize_all_lexicon_string_predicates()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym13$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const14$EverythingPSC, thread );
      $all_lexicon_string_predicates$.setGlobalValue( list_utilities.remove_if_not( $sym46$VALID_CONSTANT_, $list47, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      $all_lexicon_string_predicates$.setGlobalValue( ConsesLow.append( $all_lexicon_string_predicates$.getGlobalValue(), conses_high.set_difference( lexicon_accessors.all_speech_part_preds( UNPROVIDED ),
          $all_lexicon_string_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_lexicon_string_predicates();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17109L)
  public static SubLObject all_lexicon_predicates()
  {
    if( NIL == $all_lexicon_predicates$.getGlobalValue() )
    {
      initialize_all_lexicon_predicates();
    }
    return $all_lexicon_predicates$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17270L)
  public static SubLObject initialize_all_lexicon_predicates()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym13$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const14$EverythingPSC, thread );
      $all_lexicon_predicates$.setGlobalValue( ConsesLow.append( list_utilities.remove_if_not( $sym46$VALID_CONSTANT_, $list48, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), all_lexicon_string_predicates() ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $all_lexicon_predicates$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17586L)
  public static SubLObject initialize_all_speech_part_preds()
  {
    initialize_all_lexicon_string_predicates();
    initialize_all_lexicon_predicates();
    return $all_lexicon_string_predicates$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 19486L)
  public static SubLObject declare_noop_updates_for_lexicon_global(final SubLObject global, final SubLObject noop_updates)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = noop_updates;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == list_utilities.doubletonP( pair ) || NIL == string_utilities.list_of_string_p( pair ) ) )
      {
        Errors.error( $str55$Lexicon_global_noop_updates_must_, pair );
      }
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject earlier = NIL;
      SubLObject later = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
      earlier = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
      later = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject global_alist = list_utilities.alist_lookup( $noop_updates_for_lexicon_globals$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED );
        global_alist = list_utilities.alist_push( global_alist, earlier, later, Symbols.symbol_function( EQUAL ) );
        $noop_updates_for_lexicon_globals$.setGlobalValue( list_utilities.alist_enter( $noop_updates_for_lexicon_globals$.getGlobalValue(), global, global_alist, UNPROVIDED ) );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return $noop_updates_for_lexicon_globals$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 20530L)
  public static SubLObject lexicon_global_revision_noop_p(final SubLObject global, final SubLObject recorded_value, final SubLObject current_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $lexicon_global_noop_done_values$.currentBinding( thread );
    try
    {
      $lexicon_global_noop_done_values$.bind( NIL, thread );
      ans = lexicon_global_revision_noop_p_int( global, recorded_value, current_value );
    }
    finally
    {
      $lexicon_global_noop_done_values$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 20907L)
  public static SubLObject lexicon_global_revision_noop_p_int(final SubLObject global, final SubLObject recorded_value, final SubLObject current_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != string_utilities.substringP( recorded_value, current_value, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != subl_promotions.memberP( recorded_value, $lexicon_global_noop_done_values$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    $lexicon_global_noop_done_values$.setDynamicValue( ConsesLow.cons( recorded_value, $lexicon_global_noop_done_values$.getDynamicValue( thread ) ), thread );
    final SubLObject other_ok_values = noop_updates_for_lexicon_global( global, recorded_value );
    SubLObject noopP = NIL;
    if( NIL == noopP )
    {
      SubLObject csome_list_var;
      SubLObject value;
      for( csome_list_var = other_ok_values, value = NIL, value = csome_list_var.first(); NIL == noopP && NIL != csome_list_var; noopP = lexicon_global_revision_noop_p_int( global, value,
          current_value ), csome_list_var = csome_list_var.rest(), value = csome_list_var.first() )
      {
      }
    }
    return noopP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 21465L)
  public static SubLObject noop_updates_for_lexicon_global(final SubLObject global, final SubLObject recorded_value)
  {
    final SubLObject global_alist = list_utilities.alist_lookup( $noop_updates_for_lexicon_globals$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED );
    return list_utilities.alist_lookup( global_alist, recorded_value, Symbols.symbol_function( $sym57$SUPERSTRING_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22760L)
  public static SubLObject nl_affix_type_p(final SubLObject obj)
  {
    return subl_promotions.memberP( obj, $nl_affix_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_lexicon_vars_file()
  {
    SubLFiles.declareFunction( me, "parse_morphologically_option_p", "PARSE-MORPHOLOGICALLY-OPTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "active_lexicon_filtersP", "ACTIVE-LEXICON-FILTERS?", 0, 0, false );
    SubLFiles.declareFunction( me, "lexicon_filters", "LEXICON-FILTERS", 0, 0, false );
    SubLFiles.declareFunction( me, "active_lexicon_filters", "ACTIVE-LEXICON-FILTERS", 0, 0, false );
    SubLFiles.declareFunction( me, "lexicon_filter_activeP", "LEXICON-FILTER-ACTIVE?", 1, 0, false );
    SubLFiles.declareFunction( me, "lexicon_lookup_mt_info", "LEXICON-LOOKUP-MT-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "set_app", "SET-APP", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_lexical_vars", "CLEAR-CACHED-LEXICAL-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "lex_pred_set_p", "LEX-PRED-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_pred_set_uninitializedP", "LEX-PRED-SET-UNINITIALIZED?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_lex_pred_set", "CLEAR-LEX-PRED-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "new_lex_pred_set", "NEW-LEX-PRED-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "lex_pred_set_memberP", "LEX-PRED-SET-MEMBER?", 2, 0, false );
    SubLFiles.declareFunction( me, "lex_pred_set_element_list", "LEX-PRED-SET-ELEMENT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_semtrans_preds", "INITIALIZE-SEMTRANS-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "semtrans_predP", "SEMTRANS-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "multi_word_preds", "MULTI-WORD-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_multi_word_preds", "INITIALIZE-MULTI-WORD-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "abbreviation_predicates", "ABBREVIATION-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "acronym_predicates", "ACRONYM-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "name_string_preds", "NAME-STRING-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "name_string_preds_set", "NAME-STRING-PREDS-SET", 0, 1, false );
    SubLFiles.declareFunction( me, "initialize_proper_name_preds", "INITIALIZE-PROPER-NAME-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "name_string_predP", "NAME-STRING-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_strings_preds", "TERM-STRINGS-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "term_strings_preds_set", "TERM-STRINGS-PREDS-SET", 0, 1, false );
    SubLFiles.declareFunction( me, "initialize_term_strings_preds", "INITIALIZE-TERM-STRINGS-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "term_strings_predP", "TERM-STRINGS-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "name_or_term_strings_predP", "NAME-OR-TERM-STRINGS-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_agr_predP", "NL-AGR-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "head_medial_predP", "HEAD-MEDIAL-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "head_initial_predP", "HEAD-INITIAL-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "head_final_predP", "HEAD-FINAL-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_head_position_pred_cachedP", "CLEAR-HEAD-POSITION-PRED-CACHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_head_position_pred_cachedP", "REMOVE-HEAD-POSITION-PRED-CACHED?", 2, 0, false );
    SubLFiles.declareFunction( me, "head_position_pred_cachedP_internal", "HEAD-POSITION-PRED-CACHED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "head_position_pred_cachedP", "HEAD-POSITION-PRED-CACHED?", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_verb_frames", "CLEAR-VERB-FRAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_verb_frames", "REMOVE-VERB-FRAMES", 0, 1, false );
    SubLFiles.declareFunction( me, "verb_frames_internal", "VERB-FRAMES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "verb_frames", "VERB-FRAMES", 0, 1, false );
    SubLFiles.declareFunction( me, "all_lexicon_string_predicates", "ALL-LEXICON-STRING-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_all_lexicon_string_predicates", "INITIALIZE-ALL-LEXICON-STRING-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "all_lexicon_predicates", "ALL-LEXICON-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_all_lexicon_predicates", "INITIALIZE-ALL-LEXICON-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_all_speech_part_preds", "INITIALIZE-ALL-SPEECH-PART-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_noop_updates_for_lexicon_global", "DECLARE-NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "lexicon_global_revision_noop_p", "LEXICON-GLOBAL-REVISION-NOOP-P", 3, 0, false );
    SubLFiles.declareFunction( me, "lexicon_global_revision_noop_p_int", "LEXICON-GLOBAL-REVISION-NOOP-P-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "noop_updates_for_lexicon_global", "NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_affix_type_p", "NL-AFFIX-TYPE-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_lexicon_vars_file()
  {
    $psg_rules$ = SubLFiles.defparameter( "*PSG-RULES*", NIL );
    $print_while_building_hashP$ = SubLFiles.defparameter( "*PRINT-WHILE-BUILDING-HASH?*", NIL );
    $nl_understanding_mts$ = SubLFiles.defparameter( "*NL-UNDERSTANDING-MTS*", NIL );
    $nl_generation_mts$ = SubLFiles.defparameter( "*NL-GENERATION-MTS*", NIL );
    $nl_relevance_purpose$ = SubLFiles.defparameter( "*NL-RELEVANCE-PURPOSE*", $kw0$GENERATION );
    $misspellingsP$ = SubLFiles.defparameter( "*MISSPELLINGS?*", NIL );
    $parse_morphologically$ = SubLFiles.defparameter( "*PARSE-MORPHOLOGICALLY*", $kw1$AS_FALLBACK );
    $parse_morphologically_options$ = SubLFiles.deflexical( "*PARSE-MORPHOLOGICALLY-OPTIONS*", $list2 );
    $exclude_vulgaritiesP$ = SubLFiles.defparameter( "*EXCLUDE-VULGARITIES?*", NIL );
    $exclude_slangP$ = SubLFiles.defparameter( "*EXCLUDE-SLANG?*", NIL );
    $exclude_archaic_speechP$ = SubLFiles.defparameter( "*EXCLUDE-ARCHAIC-SPEECH?*", NIL );
    $exclude_indirect_relationsP$ = SubLFiles.defparameter( "*EXCLUDE-INDIRECT-RELATIONS?*", NIL );
    $lexicon_lookup_mt$ = SubLFiles.defvar( "*LEXICON-LOOKUP-MT*", $const5$BaseKB );
    $greedy_nlwe_interpretations$ = SubLFiles.defparameter( "*GREEDY-NLWE-INTERPRETATIONS*", T );
    $favored_pos$ = SubLFiles.defparameter( "*FAVORED-POS*", NIL );
    $max_mww_word_length$ = SubLFiles.defparameter( "*MAX-MWW-WORD-LENGTH*", TEN_INTEGER );
    $use_acronymsP$ = SubLFiles.defparameter( "*USE-ACRONYMS?*", NIL );
    $use_abbreviationsP$ = SubLFiles.defparameter( "*USE-ABBREVIATIONS?*", NIL );
    $use_lexical_abbreviationsP$ = SubLFiles.defparameter( "*USE-LEXICAL-ABBREVIATIONS?*", T );
    $initialize_nl_trie_control_varsP$ = SubLFiles.defparameter( "*INITIALIZE-NL-TRIE-CONTROL-VARS?*", T );
    $wn_pos_cyc_pos_map$ = SubLFiles.defparameter( "*WN-POS-CYC-POS-MAP*", $list7 );
    $semtrans_preds$ = SubLFiles.deflexical( "*SEMTRANS-PREDS*", maybeDefault( $sym11$_SEMTRANS_PREDS_, $semtrans_preds$, () -> ( new_lex_pred_set() ) ) );
    $multi_word_preds$ = SubLFiles.deflexical( "*MULTI-WORD-PREDS*", new_lex_pred_set() );
    $semantic_predicates_excluded_from_lexical_lookup$ = SubLFiles.defparameter( "*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*", set_utilities.construct_set_from_list( $list16, UNPROVIDED, UNPROVIDED ) );
    $abbreviation_predicates$ = SubLFiles.deflexical( "*ABBREVIATION-PREDICATES*", maybeDefault( $sym17$_ABBREVIATION_PREDICATES_, $abbreviation_predicates$, () -> ( new_lex_pred_set() ) ) );
    $acronym_predicates$ = SubLFiles.deflexical( "*ACRONYM-PREDICATES*", maybeDefault( $sym19$_ACRONYM_PREDICATES_, $acronym_predicates$, () -> ( new_lex_pred_set() ) ) );
    $proper_name_predicates_from_kb$ = SubLFiles.deflexical( "*PROPER-NAME-PREDICATES-FROM-KB*", maybeDefault( $sym21$_PROPER_NAME_PREDICATES_FROM_KB_, $proper_name_predicates_from_kb$, () -> ( new_lex_pred_set() ) ) );
    $term_strings_preds$ = SubLFiles.deflexical( "*TERM-STRINGS-PREDS*", maybeDefault( $sym24$_TERM_STRINGS_PREDS_, $term_strings_preds$, () -> ( new_lex_pred_set() ) ) );
    $head_position_pred_cachedP_caching_state$ = SubLFiles.deflexical( "*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*", NIL );
    $verb_frames_caching_state$ = SubLFiles.deflexical( "*VERB-FRAMES-CACHING-STATE*", NIL );
    $noun_predicates$ = SubLFiles.defparameter( "*NOUN-PREDICATES*", $list36 );
    $pn_predicates$ = SubLFiles.defparameter( "*PN-PREDICATES*", $list37 );
    $pn_mass_predicates$ = SubLFiles.defparameter( "*PN-MASS-PREDICATES*", $list38 );
    $pn_count_predicates$ = SubLFiles.defparameter( "*PN-COUNT-PREDICATES*", $list39 );
    $agentive_preds$ = SubLFiles.defparameter( "*AGENTIVE-PREDS*", $list40 );
    $mass_predicates$ = SubLFiles.defparameter( "*MASS-PREDICATES*", $list41 );
    $verb_predicates$ = SubLFiles.defparameter( "*VERB-PREDICATES*", $list42 );
    $adjective_predicates$ = SubLFiles.defparameter( "*ADJECTIVE-PREDICATES*", $list43 );
    $adverb_predicates$ = SubLFiles.defparameter( "*ADVERB-PREDICATES*", $list44 );
    $all_lexicon_string_predicates$ = SubLFiles.deflexical( "*ALL-LEXICON-STRING-PREDICATES*", $kw45$UNINITIALIZED );
    $all_lexicon_predicates$ = SubLFiles.deflexical( "*ALL-LEXICON-PREDICATES*", NIL );
    $top_level_nl_pred$ = SubLFiles.defconstant( "*TOP-LEVEL-NL-PRED*", $const49$wordStrings );
    $root_form_speech_parts$ = SubLFiles.deflexical( "*ROOT-FORM-SPEECH-PARTS*", $list50 );
    $lexicon_cache_code_revision$ = SubLFiles.deflexical( "*LEXICON-CACHE-CODE-REVISION*", ( maybeDefault( $sym51$_LEXICON_CACHE_CODE_REVISION_, $lexicon_cache_code_revision$, NIL ) ) );
    $morphology_code_revision$ = SubLFiles.deflexical( "*MORPHOLOGY-CODE-REVISION*", ( maybeDefault( $sym52$_MORPHOLOGY_CODE_REVISION_, $morphology_code_revision$, NIL ) ) );
    $nl_trie_code_revision$ = SubLFiles.deflexical( "*NL-TRIE-CODE-REVISION*", ( maybeDefault( $sym53$_NL_TRIE_CODE_REVISION_, $nl_trie_code_revision$, NIL ) ) );
    $noop_updates_for_lexicon_globals$ = SubLFiles.deflexical( "*NOOP-UPDATES-FOR-LEXICON-GLOBALS*", ( maybeDefault( $sym54$_NOOP_UPDATES_FOR_LEXICON_GLOBALS_, $noop_updates_for_lexicon_globals$, NIL ) ) );
    $lexicon_global_noop_done_values$ = SubLFiles.defparameter( "*LEXICON-GLOBAL-NOOP-DONE-VALUES*", NIL );
    $mwp_reformulate_resultsP$ = SubLFiles.defparameter( "*MWP-REFORMULATE-RESULTS?*", NIL );
    $mwp_triefy_resultsP$ = SubLFiles.defparameter( "*MWP-TRIEFY-RESULTS?*", NIL );
    $use_mwpP$ = SubLFiles.defparameter( "*USE-MWP?*", NIL );
    $mwp_make_up_basesP$ = SubLFiles.defparameter( "*MWP-MAKE-UP-BASES?*", NIL );
    $mwp_semantic_check_mt$ = SubLFiles.defparameter( "*MWP-SEMANTIC-CHECK-MT*", $const58$EnglishMt );
    $mwp_syntactic_check_mt$ = SubLFiles.defparameter( "*MWP-SYNTACTIC-CHECK-MT*", $const58$EnglishMt );
    $mwp_rule_lookup_mt$ = SubLFiles.defparameter( "*MWP-RULE-LOOKUP-MT*", $const58$EnglishMt );
    $mwp_wff_filter_level$ = SubLFiles.defparameter( "*MWP-WFF-FILTER-LEVEL*", ONE_INTEGER );
    $mwp_suppress_recursive_analysisP$ = SubLFiles.defparameter( "*MWP-SUPPRESS-RECURSIVE-ANALYSIS?*", NIL );
    $nl_affix_types$ = SubLFiles.defconstant( "*NL-AFFIX-TYPES*", $list59 );
    $default_lexification_mt$ = SubLFiles.defvar( "*DEFAULT-LEXIFICATION-MT*", $str60$GeneralEnglishMt );
    $default_syntactic_mt$ = SubLFiles.defvar( "*DEFAULT-SYNTACTIC-MT*", $str60$GeneralEnglishMt );
    $default_relational_lexification_mt$ = SubLFiles.defvar( "*DEFAULT-RELATIONAL-LEXIFICATION-MT*", $str63$EnglishParaphraseMt );
    $default_lexification_template_mt$ = SubLFiles.defvar( "*DEFAULT-LEXIFICATION-TEMPLATE-MT*", $str65$EnglishTemplateMt );
    $default_predicate_lexification_mt$ = SubLFiles.defvar( "*DEFAULT-PREDICATE-LEXIFICATION-MT*", $str67$RelationParaphraseMt );
    $use_sme_lexwiz$ = SubLFiles.defvar( "*USE-SME-LEXWIZ*", T );
    return NIL;
  }

  public static SubLObject setup_lexicon_vars_file()
  {
    mt_vars.note_mt_var( $sym6$_LEXICON_LOOKUP_MT_, UNPROVIDED );
    subl_macro_promotions.declare_defglobal( $sym11$_SEMTRANS_PREDS_ );
    subl_macro_promotions.declare_defglobal( $sym17$_ABBREVIATION_PREDICATES_ );
    subl_macro_promotions.declare_defglobal( $sym19$_ACRONYM_PREDICATES_ );
    subl_macro_promotions.declare_defglobal( $sym21$_PROPER_NAME_PREDICATES_FROM_KB_ );
    subl_macro_promotions.declare_defglobal( $sym24$_TERM_STRINGS_PREDS_ );
    memoization_state.note_globally_cached_function( $sym29$HEAD_POSITION_PRED_CACHED_ );
    memoization_state.note_globally_cached_function( $sym32$VERB_FRAMES );
    subl_macro_promotions.declare_defglobal( $sym51$_LEXICON_CACHE_CODE_REVISION_ );
    subl_macro_promotions.declare_defglobal( $sym52$_MORPHOLOGY_CODE_REVISION_ );
    subl_macro_promotions.declare_defglobal( $sym53$_NL_TRIE_CODE_REVISION_ );
    subl_macro_promotions.declare_defglobal( $sym54$_NOOP_UPDATES_FOR_LEXICON_GLOBALS_ );
    utilities_macros.register_html_state_variable( $sym61$_DEFAULT_LEXIFICATION_MT_ );
    utilities_macros.register_html_interface_variable( $sym61$_DEFAULT_LEXIFICATION_MT_ );
    utilities_macros.register_html_state_variable( $sym62$_DEFAULT_SYNTACTIC_MT_ );
    utilities_macros.register_html_interface_variable( $sym62$_DEFAULT_SYNTACTIC_MT_ );
    utilities_macros.register_html_state_variable( $sym64$_DEFAULT_RELATIONAL_LEXIFICATION_MT_ );
    utilities_macros.register_html_interface_variable( $sym64$_DEFAULT_RELATIONAL_LEXIFICATION_MT_ );
    utilities_macros.register_html_state_variable( $sym66$_DEFAULT_LEXIFICATION_TEMPLATE_MT_ );
    utilities_macros.register_html_interface_variable( $sym66$_DEFAULT_LEXIFICATION_TEMPLATE_MT_ );
    utilities_macros.register_html_state_variable( $sym68$_DEFAULT_PREDICATE_LEXIFICATION_MT_ );
    utilities_macros.register_html_interface_variable( $sym68$_DEFAULT_PREDICATE_LEXIFICATION_MT_ );
    utilities_macros.register_html_state_variable( $sym69$_USE_SME_LEXWIZ_ );
    utilities_macros.register_html_interface_variable( $sym69$_USE_SME_LEXWIZ_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexicon_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexicon_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexicon_vars_file();
  }
  static
  {
    me = new lexicon_vars();
    $psg_rules$ = null;
    $print_while_building_hashP$ = null;
    $nl_understanding_mts$ = null;
    $nl_generation_mts$ = null;
    $nl_relevance_purpose$ = null;
    $misspellingsP$ = null;
    $parse_morphologically$ = null;
    $parse_morphologically_options$ = null;
    $exclude_vulgaritiesP$ = null;
    $exclude_slangP$ = null;
    $exclude_archaic_speechP$ = null;
    $exclude_indirect_relationsP$ = null;
    $lexicon_lookup_mt$ = null;
    $greedy_nlwe_interpretations$ = null;
    $favored_pos$ = null;
    $max_mww_word_length$ = null;
    $use_acronymsP$ = null;
    $use_abbreviationsP$ = null;
    $use_lexical_abbreviationsP$ = null;
    $initialize_nl_trie_control_varsP$ = null;
    $wn_pos_cyc_pos_map$ = null;
    $semtrans_preds$ = null;
    $multi_word_preds$ = null;
    $semantic_predicates_excluded_from_lexical_lookup$ = null;
    $abbreviation_predicates$ = null;
    $acronym_predicates$ = null;
    $proper_name_predicates_from_kb$ = null;
    $term_strings_preds$ = null;
    $head_position_pred_cachedP_caching_state$ = null;
    $verb_frames_caching_state$ = null;
    $noun_predicates$ = null;
    $pn_predicates$ = null;
    $pn_mass_predicates$ = null;
    $pn_count_predicates$ = null;
    $agentive_preds$ = null;
    $mass_predicates$ = null;
    $verb_predicates$ = null;
    $adjective_predicates$ = null;
    $adverb_predicates$ = null;
    $all_lexicon_string_predicates$ = null;
    $all_lexicon_predicates$ = null;
    $top_level_nl_pred$ = null;
    $root_form_speech_parts$ = null;
    $lexicon_cache_code_revision$ = null;
    $morphology_code_revision$ = null;
    $nl_trie_code_revision$ = null;
    $noop_updates_for_lexicon_globals$ = null;
    $lexicon_global_noop_done_values$ = null;
    $mwp_reformulate_resultsP$ = null;
    $mwp_triefy_resultsP$ = null;
    $use_mwpP$ = null;
    $mwp_make_up_basesP$ = null;
    $mwp_semantic_check_mt$ = null;
    $mwp_syntactic_check_mt$ = null;
    $mwp_rule_lookup_mt$ = null;
    $mwp_wff_filter_level$ = null;
    $mwp_suppress_recursive_analysisP$ = null;
    $nl_affix_types$ = null;
    $default_lexification_mt$ = null;
    $default_syntactic_mt$ = null;
    $default_relational_lexification_mt$ = null;
    $default_lexification_template_mt$ = null;
    $default_predicate_lexification_mt$ = null;
    $use_sme_lexwiz$ = null;
    $kw0$GENERATION = makeKeyword( "GENERATION" );
    $kw1$AS_FALLBACK = makeKeyword( "AS-FALLBACK" );
    $list2 = ConsesLow.list( makeKeyword( "ALWAYS" ), makeKeyword( "ONLY" ), makeKeyword( "AS-FALLBACK" ), makeKeyword( "NEVER" ) );
    $list3 = ConsesLow.list( makeSymbol( "*EXCLUDE-VULGARITIES?*" ), makeSymbol( "*EXCLUDE-SLANG?*" ), makeSymbol( "*EXCLUDE-ARCHAIC-SPEECH?*" ), makeSymbol( "*EXCLUDE-INDIRECT-RELATIONS?*" ) );
    $sym4$LEXICON_FILTER_ACTIVE_ = makeSymbol( "LEXICON-FILTER-ACTIVE?" );
    $const5$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym6$_LEXICON_LOOKUP_MT_ = makeSymbol( "*LEXICON-LOOKUP-MT*" );
    $list7 = ConsesLow.list( ConsesLow.cons( makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ) ), ConsesLow.cons( makeKeyword( "NOUN" ), constant_handles
        .reader_make_constant_shell( makeString( "AgentiveNoun" ) ) ), ConsesLow.cons( makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "ProperCountNoun" ) ) ), ConsesLow.cons( makeKeyword(
            "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "ProperMassNoun" ) ) ), ConsesLow.cons( makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) ) ),
        ConsesLow.cons( makeKeyword( "VERB" ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) ), ConsesLow.cons( makeKeyword( "ADJECTIVE" ), constant_handles.reader_make_constant_shell( makeString(
            "Adjective" ) ) ), ConsesLow.cons( makeKeyword( "ADVERB" ), constant_handles.reader_make_constant_shell( makeString( "Adverb" ) ) ) );
    $kw8$IMAGE_DEMO = makeKeyword( "IMAGE-DEMO" );
    $list9 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) );
    $sym10$_EXIT = makeSymbol( "%EXIT" );
    $sym11$_SEMTRANS_PREDS_ = makeSymbol( "*SEMTRANS-PREDS*" );
    $const12$SemTransPred = constant_handles.reader_make_constant_shell( makeString( "SemTransPred" ) );
    $sym13$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const14$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const15$MultiWordForConstantPred = constant_handles.reader_make_constant_shell( makeString( "MultiWordForConstantPred" ) );
    $list16 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), constant_handles.reader_make_constant_shell( makeString( "termStrings-GuessedFromName" ) ),
      constant_handles.reader_make_constant_shell( makeString( "denotationPlaceholder" ) ), constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ), constant_handles.reader_make_constant_shell(
          makeString( "middleName" ) ), constant_handles.reader_make_constant_shell( makeString( "familyName" ) ), constant_handles.reader_make_constant_shell( makeString( "firstName" ) ), constant_handles
              .reader_make_constant_shell( makeString( "lastName" ) ), constant_handles.reader_make_constant_shell( makeString( "middleNameInitial" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "initialsString" ) ), constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) ), constant_handles.reader_make_constant_shell( makeString( "stockTickerSymbol" ) ),
      constant_handles.reader_make_constant_shell( makeString( "epistleAddresseeText" ) ), constant_handles.reader_make_constant_shell( makeString( "gospelName-Short" ) ), constant_handles.reader_make_constant_shell(
          makeString( "nicknames" ) ), constant_handles.reader_make_constant_shell( makeString( "atomicSymbol" ) ), constant_handles.reader_make_constant_shell( makeString( "titleOfWork" ) ), constant_handles
              .reader_make_constant_shell( makeString( "sectionTitle" ) ), constant_handles.reader_make_constant_shell( makeString( "referenceWorkEntryTitle" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "executableProgramName" ) ), constant_handles.reader_make_constant_shell( makeString( "countryCodeDigraph" ) ), constant_handles.reader_make_constant_shell( makeString( "internetCountryCode" ) ),
      constant_handles.reader_make_constant_shell( makeString( "folderTitle" ) ), constant_handles.reader_make_constant_shell( makeString( "ksTermString" ) ), constant_handles.reader_make_constant_shell( makeString(
          "rdfs:label" ) ), constant_handles.reader_make_constant_shell( makeString( "programStrings" ) )
    } );
    $sym17$_ABBREVIATION_PREDICATES_ = makeSymbol( "*ABBREVIATION-PREDICATES*" );
    $list18 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "abbreviationString-PN" ) ), constant_handles.reader_make_constant_shell( makeString( "abbreviationForLexicalWord" ) ),
        constant_handles.reader_make_constant_shell( makeString( "abbreviationForMultiWordString" ) ), constant_handles.reader_make_constant_shell( makeString( "abbreviationForCompoundString" ) ) );
    $sym19$_ACRONYM_PREDICATES_ = makeSymbol( "*ACRONYM-PREDICATES*" );
    $const20$acronymString = constant_handles.reader_make_constant_shell( makeString( "acronymString" ) );
    $sym21$_PROPER_NAME_PREDICATES_FROM_KB_ = makeSymbol( "*PROPER-NAME-PREDICATES-FROM-KB*" );
    $const22$properNameStrings = constant_handles.reader_make_constant_shell( makeString( "properNameStrings" ) );
    $const23$ProperNamePredicate_General = constant_handles.reader_make_constant_shell( makeString( "ProperNamePredicate-General" ) );
    $sym24$_TERM_STRINGS_PREDS_ = makeSymbol( "*TERM-STRINGS-PREDS*" );
    $const25$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $const26$HeadMedialMultiWordForConstantPre = constant_handles.reader_make_constant_shell( makeString( "HeadMedialMultiWordForConstantPred" ) );
    $const27$HeadInitialMultiWordForConstantPr = constant_handles.reader_make_constant_shell( makeString( "HeadInitialMultiWordForConstantPred" ) );
    $const28$HeadFinalMultiWordForConstantPred = constant_handles.reader_make_constant_shell( makeString( "HeadFinalMultiWordForConstantPred" ) );
    $sym29$HEAD_POSITION_PRED_CACHED_ = makeSymbol( "HEAD-POSITION-PRED-CACHED?" );
    $sym30$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_ = makeSymbol( "*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*" );
    $int31$256 = makeInteger( 256 );
    $sym32$VERB_FRAMES = makeSymbol( "VERB-FRAMES" );
    $const33$verbSemTrans = constant_handles.reader_make_constant_shell( makeString( "verbSemTrans" ) );
    $sym34$_VERB_FRAMES_CACHING_STATE_ = makeSymbol( "*VERB-FRAMES-CACHING-STATE*" );
    $int35$128 = makeInteger( 128 );
    $list36 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ), constant_handles.reader_make_constant_shell( makeString( "plural" ) ) );
    $list37 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pnSingular" ) ), constant_handles.reader_make_constant_shell( makeString( "pnPlural" ) ), constant_handles
        .reader_make_constant_shell( makeString( "pnMassNumber" ) ) );
    $list38 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pnMassNumber" ) ) );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pnSingular" ) ), constant_handles.reader_make_constant_shell( makeString( "pnPlural" ) ) );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "agentive-Sg" ) ), constant_handles.reader_make_constant_shell( makeString( "agentive-Pl" ) ) );
    $list41 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ), constant_handles.reader_make_constant_shell( makeString( "agentive-Mass" ) ) );
    $list42 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "infinitive" ) ), constant_handles.reader_make_constant_shell( makeString( "pastTense-Universal" ) ),
      constant_handles.reader_make_constant_shell( makeString( "presentParticiple" ) ), constant_handles.reader_make_constant_shell( makeString( "perfect" ) ), constant_handles.reader_make_constant_shell( makeString(
          "thirdPersonSg-Past" ) ), constant_handles.reader_make_constant_shell( makeString( "secondPersonSg-Past" ) ), constant_handles.reader_make_constant_shell( makeString( "firstPersonSg-Past" ) ), constant_handles
              .reader_make_constant_shell( makeString( "pluralVerb-Past" ) ), constant_handles.reader_make_constant_shell( makeString( "thirdPersonSg-Present" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "firstPersonSg-Present" ) ), constant_handles.reader_make_constant_shell( makeString( "secondPersonSg-Present" ) )
    } );
    $list43 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regularDegree" ) ), constant_handles.reader_make_constant_shell( makeString( "comparativeDegree" ) ), constant_handles
        .reader_make_constant_shell( makeString( "superlativeDegree" ) ) );
    $list44 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regularAdverb" ) ), constant_handles.reader_make_constant_shell( makeString( "comparativeAdverb" ) ), constant_handles
        .reader_make_constant_shell( makeString( "superlativeAdverb" ) ) );
    $kw45$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym46$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $list47 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "properNameStrings" ) ), constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ),
      constant_handles.reader_make_constant_shell( makeString( "plural" ) ), constant_handles.reader_make_constant_shell( makeString( "singular" ) ), constant_handles.reader_make_constant_shell( makeString(
          "pnMassNumber" ) ), constant_handles.reader_make_constant_shell( makeString( "pnPlural" ) ), constant_handles.reader_make_constant_shell( makeString( "pnSingular" ) ), constant_handles
              .reader_make_constant_shell( makeString( "gerund" ) ), constant_handles.reader_make_constant_shell( makeString( "presentParticiple" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "infinitive" ) ), constant_handles.reader_make_constant_shell( makeString( "secondPersonSg-Present" ) ), constant_handles.reader_make_constant_shell( makeString( "firstPersonSg-Present" ) ),
      constant_handles.reader_make_constant_shell( makeString( "thirdPersonSg-Present" ) ), constant_handles.reader_make_constant_shell( makeString( "perfect" ) ), makeSymbol( "PASTTENSE-UNIVERSAL" ), constant_handles
          .reader_make_constant_shell( makeString( "thirdPersonSg-Past" ) ), constant_handles.reader_make_constant_shell( makeString( "secondPersonSg-Past" ) ), constant_handles.reader_make_constant_shell( makeString(
              "firstPersonSg-Past" ) ), constant_handles.reader_make_constant_shell( makeString( "pluralVerb-Past" ) ), constant_handles.reader_make_constant_shell( makeString( "agentive-Mass" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "agentive-Pl" ) ), constant_handles.reader_make_constant_shell( makeString( "agentive-Sg" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "regularAdverb" ) ), constant_handles.reader_make_constant_shell( makeString( "comparativeAdverb" ) ), constant_handles.reader_make_constant_shell( makeString( "superlativeAdverb" ) ),
      constant_handles.reader_make_constant_shell( makeString( "regularDegree" ) ), constant_handles.reader_make_constant_shell( makeString( "comparativeDegree" ) ), constant_handles.reader_make_constant_shell(
          makeString( "superlativeDegree" ) ), constant_handles.reader_make_constant_shell( makeString( "pnNonPlural-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "nonSingular-Generic" ) ),
      constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "massNumber-Generic" ) ), constant_handles.reader_make_constant_shell(
          makeString( "plural-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "singular-Feminine" ) ),
      constant_handles.reader_make_constant_shell( makeString( "singular-Masculine" ) ), constant_handles.reader_make_constant_shell( makeString( "plural-Feminine" ) ), constant_handles.reader_make_constant_shell(
          makeString( "plural-Masculine" ) ), constant_handles.reader_make_constant_shell( makeString( "singular-Neuter" ) ), constant_handles.reader_make_constant_shell( makeString( "plural-Neuter" ) ), constant_handles
              .reader_make_constant_shell( makeString( "nonThirdSg-Present" ) ), constant_handles.reader_make_constant_shell( makeString( "perfective-Generic" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "wordStrings" ) )
    } );
    $list48 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "partOfSpeech" ) ), constant_handles.reader_make_constant_shell( makeString( "subcatFrame" ) ) );
    $const49$wordStrings = constant_handles.reader_make_constant_shell( makeString( "wordStrings" ) );
    $list50 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "infinitive" ) ), constant_handles.reader_make_constant_shell( makeString( "singular" ) ), constant_handles
        .reader_make_constant_shell( makeString( "massNumber" ) ), constant_handles.reader_make_constant_shell( makeString( "regularDegree" ) ), constant_handles.reader_make_constant_shell( makeString(
            "nonGradableAdjectiveForm" ) ), constant_handles.reader_make_constant_shell( makeString( "regularAdverb" ) ), constant_handles.reader_make_constant_shell( makeString( "pnMassNumber" ) ), constant_handles
                .reader_make_constant_shell( makeString( "pnSingular" ) ), constant_handles.reader_make_constant_shell( makeString( "agentive-Sg" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "agentive-Mass" ) ), constant_handles.reader_make_constant_shell( makeString( "gerund" ) )
    } );
    $sym51$_LEXICON_CACHE_CODE_REVISION_ = makeSymbol( "*LEXICON-CACHE-CODE-REVISION*" );
    $sym52$_MORPHOLOGY_CODE_REVISION_ = makeSymbol( "*MORPHOLOGY-CODE-REVISION*" );
    $sym53$_NL_TRIE_CODE_REVISION_ = makeSymbol( "*NL-TRIE-CODE-REVISION*" );
    $sym54$_NOOP_UPDATES_FOR_LEXICON_GLOBALS_ = makeSymbol( "*NOOP-UPDATES-FOR-LEXICON-GLOBALS*" );
    $str55$Lexicon_global_noop_updates_must_ = makeString( "Lexicon global noop-updates must be lists of two strings, which ~S isn't." );
    $list56 = ConsesLow.list( makeSymbol( "EARLIER" ), makeSymbol( "LATER" ) );
    $sym57$SUPERSTRING_ = makeSymbol( "SUPERSTRING?" );
    $const58$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $list59 = ConsesLow.list( makeKeyword( "DERIV" ), makeKeyword( "INFL" ) );
    $str60$GeneralEnglishMt = makeString( "GeneralEnglishMt" );
    $sym61$_DEFAULT_LEXIFICATION_MT_ = makeSymbol( "*DEFAULT-LEXIFICATION-MT*" );
    $sym62$_DEFAULT_SYNTACTIC_MT_ = makeSymbol( "*DEFAULT-SYNTACTIC-MT*" );
    $str63$EnglishParaphraseMt = makeString( "EnglishParaphraseMt" );
    $sym64$_DEFAULT_RELATIONAL_LEXIFICATION_MT_ = makeSymbol( "*DEFAULT-RELATIONAL-LEXIFICATION-MT*" );
    $str65$EnglishTemplateMt = makeString( "EnglishTemplateMt" );
    $sym66$_DEFAULT_LEXIFICATION_TEMPLATE_MT_ = makeSymbol( "*DEFAULT-LEXIFICATION-TEMPLATE-MT*" );
    $str67$RelationParaphraseMt = makeString( "RelationParaphraseMt" );
    $sym68$_DEFAULT_PREDICATE_LEXIFICATION_MT_ = makeSymbol( "*DEFAULT-PREDICATE-LEXIFICATION-MT*" );
    $sym69$_USE_SME_LEXWIZ_ = makeSymbol( "*USE-SME-LEXWIZ*" );
  }
}
/*
 * 
 * Total time: 259 ms
 * 
 */