package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_cache
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lexicon_cache";
  public static final String myFingerPrint = "1a499bb47e0dd301bc6654473d50f8e59e6380196802d6175887e2c853dca7fc";
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 1565L)
  private static SubLSymbol $perfect_aspect_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 2886L)
  private static SubLSymbol $sowu_eq_test$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3088L)
  private static SubLSymbol $sowu_first_onlyP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3209L)
  private static SubLSymbol $sowu_use_morphologyP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3319L)
  private static SubLSymbol $sowu_include_supportsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3431L)
  private static SubLSymbol $sowu_respect_orderP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 9006L)
  private static SubLSymbol $within_regular_generation_internalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
  private static SubLSymbol $sosowp_do_filter_exceptions_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12310L)
  private static SubLSymbol $sosowp_done_args$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12579L)
  private static SubLSymbol $sosowp_repeated_argsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 31287L)
  private static SubLSymbol $grsos_done_args$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 31543L)
  private static SubLSymbol $grsos_repeated_argsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 37308L)
  private static SubLSymbol $lexicon_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 38260L)
  private static SubLSymbol $allow_nl_trie_rotation_initializationP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 44133L)
  private static SubLSymbol $must_use_static_memory_for_nl_trieP$;
  private static final SubLString $str0$_Revision__146268__;
  private static final SubLSymbol $sym1$_LEXICON_CACHE_CODE_REVISION_;
  private static final SubLList $list2;
  private static final SubLString $str3$d2c1a460_aa6e_11d8_8d3f_0002b3a84;
  private static final SubLSymbol $sym4$STRINGP;
  private static final SubLSymbol $sym5$PARSE_MORPHOLOGICALLY_OPTION_P;
  private static final SubLSymbol $sym6$WORDS_OF_STRING;
  private static final SubLList $list7;
  private static final SubLString $str8$_return_LISTP__of_word_units_asso;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$ALL;
  private static final SubLSymbol $sym12$LEXICAL_WORD_;
  private static final SubLSymbol $sym13$SPEECH_PART_PRED_;
  private static final SubLSymbol $kw14$DEPTH;
  private static final SubLSymbol $kw15$STACK;
  private static final SubLSymbol $kw16$QUEUE;
  private static final SubLObject $const17$True_JustificationTruth;
  private static final SubLSymbol $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw19$ERROR;
  private static final SubLString $str20$_A_is_not_a__A;
  private static final SubLSymbol $sym21$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw22$CERROR;
  private static final SubLString $str23$continue_anyway;
  private static final SubLSymbol $kw24$WARN;
  private static final SubLString $str25$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const26$genlPreds;
  private static final SubLString $str27$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str28$attempting_to_bind_direction_link;
  private static final SubLString $str29$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLObject $const30$regularSuffix;
  private static final SubLSymbol $sym31$LISTP;
  private static final SubLSymbol $sym32$PREFER_POS_PRED_;
  private static final SubLSymbol $sym33$REGULAR_GENERATION_ANSWER_STRING;
  private static final SubLSymbol $sym34$SOSOWP_DO_FILTER_EXCEPTIONS;
  private static final SubLSymbol $sym35$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym36$ALL_SPEC_PREDICATES;
  private static final SubLSymbol $sym37$_SOSOWP_DO_FILTER_EXCEPTIONS_CACHING_STATE_;
  private static final SubLSymbol $sym38$GENL_PRED_;
  private static final SubLSymbol $sym39$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const40$EverythingPSC;
  private static final SubLSymbol $sym41$RELEVANT_MT_IS_ANY_MT;
  private static final SubLObject $const42$InferencePSC;
  private static final SubLSymbol $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
  private static final SubLSymbol $sym44$ALL_GENL_LEXICON_PREDS;
  private static final SubLSymbol $sym45$_;
  private static final SubLSymbol $sym46$NUM_PREDICATE_EXTENT_INDEX;
  private static final SubLInteger $int47$64;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$PROGN;
  private static final SubLSymbol $sym50$CLET;
  private static final SubLSymbol $sym51$NEW_ARGS_;
  private static final SubLSymbol $sym52$SET_ADD;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$CUNWIND_PROTECT;
  private static final SubLSymbol $sym56$PWHEN;
  private static final SubLSymbol $sym57$SET_REMOVE;
  private static final SubLSymbol $sym58$STRING_OR_STRINGS_OF_WORD_PRED;
  private static final SubLSymbol $sym59$RELEVANT_PRED_IS_EVERYTHING;
  private static final SubLInteger $int60$1000;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$REGULAR_GENERATION_ANSWER_STRING_PLUS_SUPPORTS;
  private static final SubLSymbol $sym63$SOSOWP_INT_ANSWER_TO_UTF8;
  private static final SubLSymbol $sym64$_STRING;
  private static final SubLSymbol $sym65$_PRED;
  private static final SubLSymbol $kw66$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw67$MAX_NUMBER;
  private static final SubLSymbol $kw68$INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $kw69$NONE;
  private static final SubLSymbol $kw70$RETURN;
  private static final SubLSymbol $kw71$BINDINGS_AND_SUPPORTS;
  private static final SubLSymbol $kw72$BINDINGS;
  private static final SubLObject $const73$and;
  private static final SubLSymbol $sym74$FIRST;
  private static final SubLSymbol $sym75$SOSOWP_INT_SPEC_PREDS;
  private static final SubLInteger $int76$200;
  private static final SubLSymbol $sym77$PREFER_LEXICAL_ASSERTION_;
  private static final SubLObject $const78$simpleFuture_Generic;
  private static final SubLObject $const79$futureTense_Generic;
  private static final SubLObject $const80$EnglishMt;
  private static final SubLObject $const81$EnglishHeadlineParaphraseMt;
  private static final SubLString $str82$to_;
  private static final SubLString $str83$will_;
  private static final SubLObject $const84$infinitive;
  private static final SubLString $str85$_;
  private static final SubLObject $const86$perfect;
  private static final SubLObject $const87$abbreviationForLexicalWord;
  private static final SubLSymbol $kw88$GAF;
  private static final SubLSymbol $kw89$TRUE;
  private static final SubLObject $const90$futurePerfect_Universal;
  private static final SubLString $str91$will_have;
  private static final SubLObject $const92$pastPerfect_Universal;
  private static final SubLString $str93$had;
  private static final SubLObject $const94$firstPersonSg_PresentPerfect;
  private static final SubLObject $const95$secondPersonSg_PresentPerfect;
  private static final SubLObject $const96$pluralVerb_PresentPerfect;
  private static final SubLString $str97$have;
  private static final SubLObject $const98$thirdPersonSg_PresentPerfect;
  private static final SubLString $str99$has;
  private static final SubLObject $const100$dispreferredLexification;
  private static final SubLSymbol $kw101$MONOTONIC;
  private static final SubLSymbol $kw102$DEFAULT;
  private static final SubLSymbol $kw103$TERSE;
  private static final SubLObject $const104$genStringAssertion_Terse;
  private static final SubLSymbol $kw105$PRECISE;
  private static final SubLObject $const106$genStringAssertion_Precise;
  private static final SubLObject $const107$genStringAssertion;
  private static final SubLSymbol $sym108$SECOND;
  private static final SubLObject $const109$verbStrings;
  private static final SubLObject $const110$simpleNounStrings;
  private static final SubLObject $const111$plural_Generic;
  private static final SubLObject $const112$singular_Generic;
  private static final SubLObject $const113$ProperNoun;
  private static final SubLObject $const114$CountNoun_Generic;
  private static final SubLObject $const115$MassNoun_Generic;
  private static final SubLInteger $int116$400;
  private static final SubLObject $const117$tensed;
  private static final SubLObject $const118$presentTense_Generic;
  private static final SubLList $list119;
  private static final SubLList $list120;
  private static final SubLObject $const121$adverbStrings;
  private static final SubLObject $const122$adjStrings;
  private static final SubLObject $const123$regularDegree;
  private static final SubLObject $const124$regularAdverb;
  private static final SubLObject $const125$Noun;
  private static final SubLObject $const126$comparativeDegree;
  private static final SubLObject $const127$comparativeAdverb;
  private static final SubLObject $const128$superlativeDegree;
  private static final SubLObject $const129$superlativeAdverb;
  private static final SubLString $str130$est;
  private static final SubLString $str131$er;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$VALID_CONSTANT_;
  private static final SubLObject $const134$AnytimePSC;
  private static final SubLList $list135;
  private static final SubLString $str136$Merely_validating_NL_trie_as_it_a;
  private static final SubLString $str137$Skipping_initialization_of_NL_tri;
  private static final SubLString $str138$needed;
  private static final SubLString $str139$allowed;
  private static final SubLString $str140$lexicon_cache;
  private static final SubLString $str141$cfasl;
  private static final SubLSymbol $kw142$OUTPUT;
  private static final SubLString $str143$Dumping_lexicon_cache___;
  private static final SubLString $str144$Unable_to_open__S;
  private static final SubLString $str145$CFASL_file__s_not_found;
  private static final SubLString $str146$Loading_lexicon_cache___;
  private static final SubLSymbol $kw147$INPUT;
  private static final SubLString $str148$nl_trie_contents;
  private static final SubLString $str149$nl_trie_contents_index;
  private static final SubLSymbol $sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__;
  private static final SubLSymbol $sym151$MUST_USE_STATIC_MEMORY_FOR_NL_TRIE;
  private static final SubLString $str152$Instruct_the_loader_to_use_static;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$MAY_USE_DYNAMIC_MEMORY_FOR_NL_TRIE;
  private static final SubLString $str155$Instruct_the_loader_to_leave_it_u;
  private static final SubLSymbol $kw156$TEST;
  private static final SubLSymbol $kw157$OWNER;
  private static final SubLSymbol $kw158$CLASSES;
  private static final SubLSymbol $kw159$KB;
  private static final SubLSymbol $kw160$FULL;
  private static final SubLSymbol $kw161$WORKING_;
  private static final SubLList $list162;

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 1682L)
  public static SubLObject perfect_aspect_pred()
  {
    if( NIL == $perfect_aspect_pred$.getGlobalValue() )
    {
      $perfect_aspect_pred$.setGlobalValue( constants_high.find_constant_by_guid( Guids.string_to_guid( $str3$d2c1a460_aa6e_11d8_8d3f_0002b3a84 ) ) );
    }
    return $perfect_aspect_pred$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 1957L)
  public static SubLObject words_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    enforceType( string, $sym4$STRINGP );
    enforceType( parse_morphologically, $sym5$PARSE_MORPHOLOGICALLY_OPTION_P );
    SubLObject words = nl_trie_accessors.nl_trie_words_of_string( string, misspellingsP, lookup_mt, UNPROVIDED );
    if( NIL != lexicon_accessors.proceed_with_morphological_parsingP( words, parse_morphologically ) )
    {
      words = czer_utilities.delete_el_duplicates( ConsesLow.append( words, morphological_word_parser.words_of_complex_word_string( string ) ) );
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3536L)
  public static SubLObject strings_of_word_unit(final SubLObject word, SubLObject include, SubLObject exceptions, SubLObject mt)
  {
    if( include == UNPROVIDED )
    {
      include = $kw11$ALL;
    }
    if( exceptions == UNPROVIDED )
    {
      exceptions = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexicon_accessors.lexical_wordP( word ) : word;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding( thread );
    try
    {
      $sowu_first_onlyP$.bind( NIL, thread );
      ans = string_or_strings_of_word_unit( word, include, exceptions, mt, UNPROVIDED );
    }
    finally
    {
      $sowu_first_onlyP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 4132L)
  public static SubLObject first_string_of_word_unit(final SubLObject word, SubLObject include, SubLObject exceptions, SubLObject mt)
  {
    if( include == UNPROVIDED )
    {
      include = $kw11$ALL;
    }
    if( exceptions == UNPROVIDED )
    {
      exceptions = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexicon_accessors.lexical_wordP( word ) : word;
    SubLObject string = NIL;
    SubLObject pred = NIL;
    final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding( thread );
    try
    {
      $sowu_first_onlyP$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject string_$1 = string_or_strings_of_word_unit( word, include, exceptions, mt, UNPROVIDED );
      final SubLObject pred_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      string = string_$1;
      pred = pred_$2;
    }
    finally
    {
      $sowu_first_onlyP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( string, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 4612L)
  public static SubLObject strings_of_wordXpred(final SubLObject word, final SubLObject pred, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = lexicon_vars.lexicon_lookup_mt_info();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexicon_accessors.lexical_wordP( word ) : word;
    assert NIL != lexicon_accessors.speech_part_predP( pred, UNPROVIDED ) : pred;
    SubLObject ans_strings = NIL;
    SubLObject ans_preds = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject _prev_bind_0_$3 = $sowu_first_onlyP$.currentBinding( thread );
        try
        {
          $sowu_first_onlyP$.bind( NIL, thread );
          thread.resetMultipleValues();
          final SubLObject ans_strings_$4 = string_or_strings_of_wordXpred( word, pred, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject ans_preds_$5 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          ans_strings = ans_strings_$4;
          ans_preds = ans_preds_$5;
        }
        finally
        {
          $sowu_first_onlyP$.rebind( _prev_bind_0_$3, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( ans_strings, ans_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 5178L)
  public static SubLObject inference_strings_of_wordXpred(final SubLObject word, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $sowu_include_supportsP$.currentBinding( thread );
    try
    {
      $sowu_include_supportsP$.bind( T, thread );
      ans = strings_of_wordXpred( word, pred, mt_relevance_macros.mt_info( UNPROVIDED ) );
    }
    finally
    {
      $sowu_include_supportsP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 5373L)
  public static SubLObject first_string_of_wordXpred(final SubLObject word, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexicon_accessors.lexical_wordP( word ) : word;
    assert NIL != lexicon_accessors.speech_part_predP( pred, UNPROVIDED ) : pred;
    SubLObject ans_string = NIL;
    SubLObject ans_pred = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject _prev_bind_0_$7 = $sowu_first_onlyP$.currentBinding( thread );
        try
        {
          $sowu_first_onlyP$.bind( T, thread );
          final SubLObject mt_var = mt;
          final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            thread.resetMultipleValues();
            final SubLObject ans_string_$9 = string_or_strings_of_wordXpred( word, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            final SubLObject ans_pred_$10 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ans_string = ans_string_$9;
            ans_pred = ans_pred_$10;
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$8, thread );
          }
        }
        finally
        {
          $sowu_first_onlyP$.rebind( _prev_bind_0_$7, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( ans_string, ans_pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 5924L)
  public static SubLObject ok_to_derive_word_form_from_predP(final SubLObject wu, final SubLObject derived_pred, final SubLObject basic_pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLObject cleared_preds = set_utilities.new_singleton_set( basic_pred, UNPROVIDED );
    return ok_to_derive_word_form_for_predP( wu, derived_pred, mt, cleared_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 6304L)
  public static SubLObject ok_to_derive_word_form_for_predP(final SubLObject wu, final SubLObject pred, final SubLObject mt, final SubLObject cleared_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = NIL;
    SubLObject irregularP = NIL;
    if( NIL != lexicon_accessors.derived_predP( pred, mt ) && NIL == irregularP )
    {
      final SubLObject deck_type = $kw16$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
            final SubLObject tv_var = $const17$True_JustificationTruth;
            final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw19$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw22$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str23$continue_anyway, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw24$WARN ) )
                {
                  Errors.warn( $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str25$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str23$continue_anyway, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const26$genlPreds ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const26$genlPreds ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const26$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const26$genlPreds ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$16 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const26$genlPreds ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode && NIL == irregularP; node_and_predicate_mode = deck.deck_pop(
                        recur_deck ) )
                    {
                      final SubLObject node_var_$21 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject spec_pred = node_var_$21;
                      final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$21 ) )
                        {
                          irregularP = word_form_assertedP( wu, spec_pred, mt );
                        }
                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const26$genlPreds ) );
                        SubLObject rest;
                        SubLObject module_var;
                        SubLObject _prev_bind_0_$17;
                        SubLObject _prev_bind_1_$17;
                        SubLObject node;
                        SubLObject d_link;
                        SubLObject mt_links;
                        SubLObject iteration_state;
                        SubLObject mt_$25;
                        SubLObject tv_links;
                        SubLObject _prev_bind_0_$18;
                        SubLObject iteration_state_$27;
                        SubLObject tv;
                        SubLObject link_nodes;
                        SubLObject _prev_bind_0_$19;
                        SubLObject sol;
                        SubLObject set_contents_var;
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject node_vars_link_node;
                        SubLObject csome_list_var;
                        SubLObject node_vars_link_node2;
                        SubLObject new_list;
                        SubLObject rest_$29;
                        SubLObject generating_fn;
                        SubLObject _prev_bind_0_$20;
                        SubLObject sol2;
                        SubLObject link_nodes2;
                        SubLObject set_contents_var2;
                        SubLObject basis_object2;
                        SubLObject state2;
                        SubLObject node_vars_link_node3;
                        SubLObject csome_list_var2;
                        SubLObject node_vars_link_node4;
                        for( rest = NIL, rest = accessible_modules; NIL == irregularP && NIL != rest; rest = rest.rest() )
                        {
                          module_var = rest.first();
                          _prev_bind_0_$17 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          _prev_bind_1_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            node = function_terms.naut_to_nart( node_var_$21 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == irregularP && NIL == dictionary_contents
                                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    mt_$25 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$25 ) )
                                    {
                                      _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$25, thread );
                                        for( iteration_state_$27 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == irregularP && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$27 ); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next( iteration_state_$27 ) )
                                        {
                                          thread.resetMultipleValues();
                                          tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$27 );
                                          link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == irregularP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == irregularP )
                                                {
                                                  csome_list_var = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var.first();
                                                  while ( NIL == irregularP && NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    node_vars_link_node2 = csome_list_var.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str27$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$19, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$27 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$18, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str28$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                  .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              for( rest_$29 = NIL, rest_$29 = new_list; NIL == irregularP && NIL != rest_$29; rest_$29 = rest_$29.rest() )
                              {
                                generating_fn = rest_$29.first();
                                _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    set_contents_var2 = set.do_set_internal( sol2 );
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == irregularP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    if( NIL == irregularP )
                                    {
                                      csome_list_var2 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var2.first();
                                      while ( NIL == irregularP && NIL != csome_list_var2)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        node_vars_link_node4 = csome_list_var2.first();
                                      }
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str27$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$20, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$17, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$17, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$16, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$18, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$16, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$15, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str29$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$17, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$15, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$14, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$14, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$13, thread );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$12, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL == irregularP )
    {
      set.set_add( pred, cleared_preds );
      if( NIL == okP )
      {
        SubLObject csome_list_var3 = kb_mapping_utilities.pred_values_in_relevant_mts( pred, $const30$regularSuffix, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject more_basic_pred = NIL;
        more_basic_pred = csome_list_var3.first();
        while ( NIL == okP && NIL != csome_list_var3)
        {
          okP = makeBoolean( NIL == lexicon_accessors.derived_predP( more_basic_pred, UNPROVIDED ) || NIL != set.set_memberP( more_basic_pred, cleared_preds ) || NIL != ok_to_derive_word_form_for_predP( wu,
              more_basic_pred, mt, cleared_preds ) );
          set.set_add( more_basic_pred, cleared_preds );
          csome_list_var3 = csome_list_var3.rest();
          more_basic_pred = csome_list_var3.first();
        }
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 6988L)
  public static SubLObject word_form_assertedP(final SubLObject wu, final SubLObject pred, final SubLObject mt)
  {
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( wu, pred, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 7092L)
  public static SubLObject generate_regular_string(final SubLObject wu, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexicon_accessors.lexical_wordP( wu ) : wu;
    assert NIL != lexicon_accessors.speech_part_predP( pred, UNPROVIDED ) : pred;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding( thread );
    try
    {
      $sowu_first_onlyP$.bind( T, thread );
      ans = generate_regular_string_or_strings( wu, pred, mt );
    }
    finally
    {
      $sowu_first_onlyP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 7859L)
  public static SubLObject generate_regular_strings(final SubLObject wu, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexicon_accessors.lexical_wordP( wu ) : wu;
    assert NIL != lexicon_accessors.speech_part_predP( pred, UNPROVIDED ) : pred;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding( thread );
    try
    {
      $sowu_first_onlyP$.bind( NIL, thread );
      ans = generate_regular_string_or_strings( wu, pred, mt );
    }
    finally
    {
      $sowu_first_onlyP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 8218L)
  public static SubLObject strings_of_word_unit_with_supports(final SubLObject word, final SubLObject include)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( include ) : include;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $sowu_include_supportsP$.currentBinding( thread );
    try
    {
      $sowu_include_supportsP$.bind( T, thread );
      ans = strings_of_word_unit( word, include, NIL, NIL );
    }
    finally
    {
      $sowu_include_supportsP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 8502L)
  public static SubLObject ordered_strings_of_word_unit(final SubLObject word, SubLObject include, SubLObject exceptions, SubLObject lookup_mt)
  {
    if( include == UNPROVIDED )
    {
      include = $kw11$ALL;
    }
    if( exceptions == UNPROVIDED )
    {
      exceptions = NIL;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject respect_orderP = T;
    final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding( thread );
    try
    {
      $sowu_first_onlyP$.bind( NIL, thread );
      ans = string_or_strings_of_word_unit( word, include, exceptions, lookup_mt, respect_orderP );
    }
    finally
    {
      $sowu_first_onlyP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 9118L)
  public static SubLObject string_or_strings_of_word_unit(SubLObject word, final SubLObject include, final SubLObject exceptions, SubLObject mt, SubLObject respect_orderP)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( respect_orderP == UNPROVIDED )
    {
      respect_orderP = $sowu_respect_orderP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.possibly_naut_p( word ) )
    {
      final SubLObject nart = narts_high.find_nart( word );
      word = ( ( NIL != nart ) ? nart : word );
    }
    if( NIL != forts.fort_p( word ) && NIL == lexicon_accessors.quick_lexical_wordP( word, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject preds0 = ( include == $kw11$ALL ) ? lexicon_accessors.top_level_nl_preds() : include;
    final SubLObject preds2 = ( NIL != respect_orderP || NIL == $sowu_first_onlyP$.getDynamicValue( thread ) ) ? preds0
        : Sort.sort( sosowp_filter_exceptions( conses_high.copy_list( preds0 ), exceptions ), $sym32$PREFER_POS_PRED_, UNPROVIDED );
    SubLObject answers = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $within_regular_generation_internalsP$.currentBinding( thread );
    try
    {
      $within_regular_generation_internalsP$.bind( T, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0_$32 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject mt_var = mt;
          final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            if( NIL == doneP )
            {
              SubLObject csome_list_var = preds2;
              SubLObject pred = NIL;
              pred = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                if( NIL != lexicon_accessors.speech_part_predP( pred, UNPROVIDED ) )
                {
                  final SubLObject new_answers = string_or_strings_of_wordXpred( word, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  if( NIL != new_answers )
                  {
                    answers = ConsesLow.append( answers, new_answers );
                    doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                  }
                }
                csome_list_var = csome_list_var.rest();
                pred = csome_list_var.first();
              }
            }
            if( include == $kw11$ALL && NIL == doneP && NIL == doneP )
            {
              SubLObject csome_list_var = lexicon_accessors.other_strings_of_wu( word, lexicon_vars.$misspellingsP$.getDynamicValue( thread ), mt );
              SubLObject other_string = NIL;
              other_string = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                if( NIL == subl_promotions.memberP( other_string, answers, $sowu_eq_test$.getGlobalValue(), $sym33$REGULAR_GENERATION_ANSWER_STRING ) )
                {
                  answers = ConsesLow.cons( ConsesLow.list( other_string, lexicon_vars.$top_level_nl_pred$.getGlobalValue() ), answers );
                  doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                }
                csome_list_var = csome_list_var.rest();
                other_string = csome_list_var.first();
              }
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$33, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$32, thread );
      }
    }
    finally
    {
      $within_regular_generation_internalsP$.rebind( _prev_bind_0, thread );
    }
    return extract_regular_generation_answer_type( answers, $sowu_first_onlyP$.getDynamicValue( thread ), $sowu_include_supportsP$.getDynamicValue( thread ), $within_regular_generation_internalsP$.getDynamicValue(
        thread ), respect_orderP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11096L)
  public static SubLObject sosowp_filter_exceptions(final SubLObject include, final SubLObject exceptions)
  {
    if( NIL == include )
    {
      return NIL;
    }
    if( NIL == exceptions )
    {
      return include;
    }
    return sosowp_do_filter_exceptions( include, exceptions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
  public static SubLObject clear_sosowp_do_filter_exceptions()
  {
    final SubLObject cs = $sosowp_do_filter_exceptions_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
  public static SubLObject remove_sosowp_do_filter_exceptions(final SubLObject include, final SubLObject exceptions)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $sosowp_do_filter_exceptions_caching_state$.getGlobalValue(), ConsesLow.list( include, exceptions ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
  public static SubLObject sosowp_do_filter_exceptions_internal(final SubLObject include, final SubLObject exceptions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym35$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), thread );
      final SubLObject all_include = Sequences.delete_duplicates( list_utilities.flatten( Mapping.mapcar( $sym36$ALL_SPEC_PREDICATES, include ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject filtered_include = NIL;
      SubLObject cdolist_list_var = all_include;
      SubLObject include_pred = NIL;
      include_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == lexicon_accessors.speech_part_pred_max_floors( ConsesLow.cons( include_pred, exceptions ), UNPROVIDED ) )
        {
          final SubLObject item_var = include_pred;
          if( NIL == conses_high.member( item_var, filtered_include, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            filtered_include = ConsesLow.cons( item_var, filtered_include );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        include_pred = cdolist_list_var.first();
      }
      ans = sosowp_remove_spec_preds( filtered_include, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
  public static SubLObject sosowp_do_filter_exceptions(final SubLObject include, final SubLObject exceptions)
  {
    SubLObject caching_state = $sosowp_do_filter_exceptions_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym34$SOSOWP_DO_FILTER_EXCEPTIONS, $sym37$_SOSOWP_DO_FILTER_EXCEPTIONS_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, SIXTEEN_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( include, exceptions );
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
        if( include.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && exceptions.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sosowp_do_filter_exceptions_internal( include, exceptions ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( include, exceptions ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11935L)
  public static SubLObject sosowp_remove_spec_preds(final SubLObject preds, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( !preds.isList() )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = preds;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject others = Sequences.remove( pred, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == subl_promotions.memberP( Functions.funcall( key, pred ), others, $sym38$GENL_PRED_, key ) )
      {
        ans = ConsesLow.cons( pred, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12631L)
  public static SubLObject sosowp_repeated_argsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $sosowp_repeated_argsP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12706L)
  public static SubLObject sosowp_top_levelP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.numLE( set.set_size( $sosowp_done_args$.getDynamicValue( thread ) ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12790L)
  public static SubLObject higher_asserted_entry_for_wuP(final SubLObject pred, final SubLObject wu, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = lexicon_vars.lexicon_lookup_mt_info();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( wu ) )
    {
      if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym39$RELEVANT_MT_IS_EVERYTHING ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
          if( NIL == ans )
          {
            SubLObject csome_list_var = all_genl_lexicon_preds( pred, mt_info );
            SubLObject genl_pred = NIL;
            genl_pred = csome_list_var.first();
            while ( NIL == ans && NIL != csome_list_var)
            {
              if( NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( wu, genl_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              {
                ans = T;
              }
              csome_list_var = csome_list_var.rest();
              genl_pred = csome_list_var.first();
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym41$RELEVANT_MT_IS_ANY_MT ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_ANY_MT, thread );
          mt_relevance_macros.$mt$.bind( $const42$InferencePSC, thread );
          if( NIL == ans )
          {
            SubLObject csome_list_var = all_genl_lexicon_preds( pred, mt_info );
            SubLObject genl_pred = NIL;
            genl_pred = csome_list_var.first();
            while ( NIL == ans && NIL != csome_list_var)
            {
              if( NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( wu, genl_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              {
                ans = T;
              }
              csome_list_var = csome_list_var.rest();
              genl_pred = csome_list_var.first();
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
          mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
          if( NIL == ans )
          {
            SubLObject csome_list_var = all_genl_lexicon_preds( pred, mt_info );
            SubLObject genl_pred = NIL;
            genl_pred = csome_list_var.first();
            while ( NIL == ans && NIL != csome_list_var)
            {
              if( NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( wu, genl_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              {
                ans = T;
              }
              csome_list_var = csome_list_var.rest();
              genl_pred = csome_list_var.first();
            }
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym35$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( mt_info, thread );
          if( NIL == ans )
          {
            SubLObject csome_list_var = all_genl_lexicon_preds( pred, mt_info );
            SubLObject genl_pred = NIL;
            genl_pred = csome_list_var.first();
            while ( NIL == ans && NIL != csome_list_var)
            {
              if( NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( wu, genl_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              {
                ans = T;
              }
              csome_list_var = csome_list_var.rest();
              genl_pred = csome_list_var.first();
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13281L)
  public static SubLObject all_genl_lexicon_preds_internal(final SubLObject pred, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = lexicon_vars.lexicon_lookup_mt_info();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym39$RELEVANT_MT_IS_EVERYTHING ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
        ans = Sort.sort( genl_predicates.all_genl_preds( pred, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym45$_ ), $sym46$NUM_PREDICATE_EXTENT_INDEX );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym41$RELEVANT_MT_IS_ANY_MT ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const42$InferencePSC, thread );
        ans = Sort.sort( genl_predicates.all_genl_preds( pred, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym45$_ ), $sym46$NUM_PREDICATE_EXTENT_INDEX );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
        mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
        ans = Sort.sort( genl_predicates.all_genl_preds( pred, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym45$_ ), $sym46$NUM_PREDICATE_EXTENT_INDEX );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym35$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( mt_info, thread );
        ans = Sort.sort( genl_predicates.all_genl_preds( pred, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym45$_ ), $sym46$NUM_PREDICATE_EXTENT_INDEX );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13281L)
  public static SubLObject all_genl_lexicon_preds(final SubLObject pred, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = lexicon_vars.lexicon_lookup_mt_info();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return all_genl_lexicon_preds_internal( pred, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym44$ALL_GENL_LEXICON_PREDS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym44$ALL_GENL_LEXICON_PREDS, TWO_INTEGER, $int47$64, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym44$ALL_GENL_LEXICON_PREDS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, mt_info );
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
        if( pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( all_genl_lexicon_preds_internal( pred, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13540L)
  public static SubLObject with_sosowp_context(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    args = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym49$PROGN, ConsesLow.list( $sym50$CLET, reader.bq_cons( ConsesLow.list( $sym51$NEW_ARGS_, ConsesLow.listS( $sym52$SET_ADD, args, $list53 ) ), $list54 ), reader.bq_cons(
        $sym55$CUNWIND_PROTECT, ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym56$PWHEN, $sym51$NEW_ARGS_, ConsesLow.listS( $sym57$SET_REMOVE, args, $list53 ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13970L)
  public static SubLObject string_or_strings_of_wordXpred_internal(SubLObject word, final SubLObject pred, SubLObject mt_info, SubLObject first_onlyP, SubLObject include_supportsP,
      SubLObject within_regular_generation_internalsP, SubLObject respect_orderP)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    if( first_onlyP == UNPROVIDED )
    {
      first_onlyP = $sowu_first_onlyP$.getDynamicValue();
    }
    if( include_supportsP == UNPROVIDED )
    {
      include_supportsP = $sowu_include_supportsP$.getDynamicValue();
    }
    if( within_regular_generation_internalsP == UNPROVIDED )
    {
      within_regular_generation_internalsP = $within_regular_generation_internalsP$.getDynamicValue();
    }
    if( respect_orderP == UNPROVIDED )
    {
      respect_orderP = $sowu_respect_orderP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.possibly_naut_p( word ) )
    {
      final SubLObject nart = narts_high.find_nart( word );
      word = ( ( NIL != nart ) ? nart : word );
    }
    SubLObject answers = NIL;
    final SubLObject _prev_bind_0 = $within_regular_generation_internalsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    try
    {
      $within_regular_generation_internalsP$.bind( T, thread );
      pred_relevance_macros.$relevant_pred_function$.bind( $sym59$RELEVANT_PRED_IS_EVERYTHING, thread );
      if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym39$RELEVANT_MT_IS_EVERYTHING ) )
      {
        final SubLObject _prev_bind_0_$35 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$36 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
          answers = sosowp_int( word, pred, mt_info, first_onlyP, include_supportsP, $sowu_use_morphologyP$.getDynamicValue( thread ), $sowu_eq_test$.getGlobalValue() );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$36, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$35, thread );
        }
      }
      else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym41$RELEVANT_MT_IS_ANY_MT ) )
      {
        final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$37 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_ANY_MT, thread );
          mt_relevance_macros.$mt$.bind( $const42$InferencePSC, thread );
          answers = sosowp_int( word, pred, mt_info, first_onlyP, include_supportsP, $sowu_use_morphologyP$.getDynamicValue( thread ), $sowu_eq_test$.getGlobalValue() );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$37, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$36, thread );
        }
      }
      else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
      {
        final SubLObject _prev_bind_0_$37 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$38 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
          mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
          answers = sosowp_int( word, pred, mt_info, first_onlyP, include_supportsP, $sowu_use_morphologyP$.getDynamicValue( thread ), $sowu_eq_test$.getGlobalValue() );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_1_$38, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$37, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0_$38 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$39 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym35$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( mt_info, thread );
          answers = sosowp_int( word, pred, mt_info, first_onlyP, include_supportsP, $sowu_use_morphologyP$.getDynamicValue( thread ), $sowu_eq_test$.getGlobalValue() );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$39, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$38, thread );
        }
      }
    }
    finally
    {
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_2, thread );
      $within_regular_generation_internalsP$.rebind( _prev_bind_0, thread );
    }
    return extract_regular_generation_answer_type( answers, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13970L)
  public static SubLObject string_or_strings_of_wordXpred(final SubLObject word, final SubLObject pred, SubLObject mt_info, SubLObject first_onlyP, SubLObject include_supportsP,
      SubLObject within_regular_generation_internalsP, SubLObject respect_orderP)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    if( first_onlyP == UNPROVIDED )
    {
      first_onlyP = $sowu_first_onlyP$.getDynamicValue();
    }
    if( include_supportsP == UNPROVIDED )
    {
      include_supportsP = $sowu_include_supportsP$.getDynamicValue();
    }
    if( within_regular_generation_internalsP == UNPROVIDED )
    {
      within_regular_generation_internalsP = $within_regular_generation_internalsP$.getDynamicValue();
    }
    if( respect_orderP == UNPROVIDED )
    {
      respect_orderP = $sowu_respect_orderP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return string_or_strings_of_wordXpred_internal( word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym58$STRING_OR_STRINGS_OF_WORD_PRED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym58$STRING_OR_STRINGS_OF_WORD_PRED, SEVEN_INTEGER, $int60$1000, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym58$STRING_OR_STRINGS_OF_WORD_PRED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_7( word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP );
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
        if( word.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pred.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt_info.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( first_onlyP.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( include_supportsP.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( within_regular_generation_internalsP.equal( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( NIL != cached_args && NIL == cached_args.rest() && respect_orderP.equal( cached_args.first() ) )
                    {
                      return memoization_state.caching_results( results2 );
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( string_or_strings_of_wordXpred_internal( word, pred, mt_info, first_onlyP, include_supportsP,
        within_regular_generation_internalsP, respect_orderP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP,
        respect_orderP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15088L)
  public static SubLObject make_regular_generation_answer(final SubLObject string, SubLObject pred, SubLObject supports)
  {
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( supports == UNPROVIDED )
    {
      supports = NIL;
    }
    return ConsesLow.append( ConsesLow.list( string, pred ), supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15215L)
  public static SubLObject regular_generation_answer_string(final SubLObject v_answer)
  {
    return v_answer.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15298L)
  public static SubLObject regular_generation_answer_pred(final SubLObject v_answer)
  {
    return conses_high.second( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15380L)
  public static SubLObject regular_generation_answer_supports(final SubLObject v_answer)
  {
    return v_answer.rest().rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15471L)
  public static SubLObject regular_generation_answer_string_plus_supports(final SubLObject v_answer)
  {
    SubLObject string = NIL;
    SubLObject pred = NIL;
    SubLObject supports = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( v_answer, v_answer, $list61 );
    string = v_answer.first();
    SubLObject current = v_answer.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, v_answer, $list61 );
    pred = current.first();
    current = ( supports = current.rest() );
    return ConsesLow.cons( string, supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15652L)
  public static SubLObject extract_regular_generation_answer_type(final SubLObject answers, SubLObject first_onlyP, SubLObject include_supportsP, SubLObject within_regular_generation_internalsP,
      SubLObject respect_orderP)
  {
    if( first_onlyP == UNPROVIDED )
    {
      first_onlyP = $sowu_first_onlyP$.getDynamicValue();
    }
    if( include_supportsP == UNPROVIDED )
    {
      include_supportsP = $sowu_include_supportsP$.getDynamicValue();
    }
    if( within_regular_generation_internalsP == UNPROVIDED )
    {
      within_regular_generation_internalsP = $within_regular_generation_internalsP$.getDynamicValue();
    }
    if( respect_orderP == UNPROVIDED )
    {
      respect_orderP = NIL;
    }
    if( NIL != within_regular_generation_internalsP )
    {
      return answers;
    }
    if( NIL != first_onlyP )
    {
      final SubLObject first_answer = answers.first();
      return Values.values( regular_generation_answer_string( first_answer ), regular_generation_answer_pred( first_answer ) );
    }
    if( NIL != include_supportsP )
    {
      return Mapping.mapcar( $sym62$REGULAR_GENERATION_ANSWER_STRING_PLUS_SUPPORTS, answers );
    }
    SubLObject strings = NIL;
    SubLObject preds = NIL;
    SubLObject cdolist_list_var = answers;
    SubLObject v_answer = NIL;
    v_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject answer_string = regular_generation_answer_string( v_answer );
      if( NIL == subl_promotions.memberP( answer_string, strings, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        strings = ConsesLow.cons( answer_string, strings );
        preds = ConsesLow.cons( regular_generation_answer_pred( v_answer ), preds );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_answer = cdolist_list_var.first();
    }
    return ( NIL != respect_orderP ) ? Values.values( Sequences.nreverse( strings ), Sequences.nreverse( preds ) ) : Values.values( strings, preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 16696L)
  public static SubLObject sosowp_int(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP,
      final SubLObject test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    final SubLObject new_argsP = set.set_add( ConsesLow.list( word, pred, mt_info ), $sosowp_done_args$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = $sosowp_repeated_argsP$.currentBinding( thread );
    try
    {
      $sosowp_repeated_argsP$.bind( makeBoolean( NIL != $sosowp_repeated_argsP$.getDynamicValue( thread ) || NIL == new_argsP ), thread );
      try
      {
        answers = ( NIL != kb_indexing_datastructures.indexed_term_p( word ) ) ? sosowp_int_via_index_surfing( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test ) : NIL;
      }
      finally
      {
        final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != new_argsP )
          {
            set.set_remove( ConsesLow.list( word, pred, mt_info ), $sosowp_done_args$.getDynamicValue( thread ) );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
        }
      }
    }
    finally
    {
      $sosowp_repeated_argsP$.rebind( _prev_bind_0, thread );
    }
    answers = Mapping.mapcar( $sym63$SOSOWP_INT_ANSWER_TO_UTF8, answers );
    if( NIL == first_onlyP )
    {
      answers = Sequences.delete_duplicates( answers, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      answers = sosowp_sort_answers( answers );
      answers = sosowp_remove_duplicate_strings( answers, test );
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 17541L)
  public static SubLObject sosowp_int_answer_to_utf8(final SubLObject v_answer)
  {
    return ConsesLow.rplaca( v_answer, cycl_string.cycl_string_to_utf8_string( v_answer.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 17662L)
  public static SubLObject sosowp_int_via_inference(final SubLObject word, final SubLObject pred, final SubLObject mt, final SubLObject first_onlyP, final SubLObject include_supportsP)
  {
    final SubLObject string_var = $sym64$_STRING;
    final SubLObject pred_var = $sym65$_PRED;
    final SubLObject exhaustiveP = NIL;
    final SubLObject query_properties = ConsesLow.list( $kw66$MAX_TRANSFORMATION_DEPTH, THREE_INTEGER, $kw67$MAX_NUMBER, ( NIL != first_onlyP || NIL == exhaustiveP ) ? ONE_INTEGER : NIL,
        $kw68$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw69$NONE, $kw70$RETURN, ( NIL != include_supportsP ) ? $kw71$BINDINGS_AND_SUPPORTS : $kw72$BINDINGS );
    final SubLObject query_sentence = ConsesLow.list( $const73$and, ConsesLow.list( pred_var, word, string_var ), ConsesLow.list( $const26$genlPreds, pred_var, pred ) );
    final SubLObject query_results = inference_kernel.new_cyc_query( query_sentence, mt, query_properties );
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = query_results;
    SubLObject query_result = NIL;
    query_result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_bindings = ( NIL != include_supportsP ) ? query_result.first() : query_result;
      final SubLObject supports = ( NIL != include_supportsP ) ? conses_high.second( query_result ) : NIL;
      final SubLObject result_string = bindings.variable_lookup( string_var, v_bindings );
      final SubLObject result_pred = bindings.variable_lookup( pred_var, v_bindings );
      if( result_string.isString() && NIL != result_pred )
      {
        answers = ConsesLow.cons( make_regular_generation_answer( result_string, result_pred, supports ), answers );
      }
      cdolist_list_var = cdolist_list_var.rest();
      query_result = cdolist_list_var.first();
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 18788L)
  public static SubLObject sosowp_int_via_index_surfing(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP,
      final SubLObject use_morphologyP, final SubLObject test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject answers = sosowp_int_this_pred( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP );
    SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    doneP = makeBoolean( NIL != doneP || NIL != sosowp_repeated_argsP() );
    if( NIL == doneP )
    {
      if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym39$RELEVANT_MT_IS_EVERYTHING ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
          final SubLObject spec_pred_answers = sosowp_int_spec_preds( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
          answers = ConsesLow.append( answers, spec_pred_answers );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym41$RELEVANT_MT_IS_ANY_MT ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_ANY_MT, thread );
          mt_relevance_macros.$mt$.bind( $const42$InferencePSC, thread );
          final SubLObject spec_pred_answers = sosowp_int_spec_preds( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
          answers = ConsesLow.append( answers, spec_pred_answers );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
          mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
          final SubLObject spec_pred_answers = sosowp_int_spec_preds( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
          answers = ConsesLow.append( answers, spec_pred_answers );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym35$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( mt_info, thread );
          final SubLObject spec_pred_answers = sosowp_int_spec_preds( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
          answers = ConsesLow.append( answers, spec_pred_answers );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 19439L)
  public static SubLObject sosowp_remove_duplicate_strings(final SubLObject answers, final SubLObject test)
  {
    return list_utilities.remove_duplicates_from_end( answers, test, Symbols.symbol_function( $sym74$FIRST ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 19562L)
  public static SubLObject sosowp_int_spec_preds_internal(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP,
      final SubLObject use_morphologyP, final SubLObject test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    SubLObject doneP = NIL;
    if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym39$RELEVANT_MT_IS_EVERYTHING ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
        final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word( pred, word );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = spec_preds;
          SubLObject spec_pred = NIL;
          spec_pred = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            if( NIL != lexicon_accessors.speech_part_predP( spec_pred, UNPROVIDED ) )
            {
              SubLObject spec_pred_answers = sosowp_int( word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
              if( NIL != spec_pred_answers )
              {
                if( NIL != $sowu_include_supportsP$.getDynamicValue( thread ) && NIL != sosowp_top_levelP() )
                {
                  SubLObject enhanced_answers = NIL;
                  SubLObject cdolist_list_var = spec_pred_answers;
                  SubLObject v_answer = NIL;
                  v_answer = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    enhanced_answers = ConsesLow.cons( make_regular_generation_answer( regular_generation_answer_string( v_answer ), regular_generation_answer_pred( v_answer ), ConsesLow.cons( removal_module_utilities
                        .make_genl_preds_support( regular_generation_answer_pred( v_answer ), pred ), regular_generation_answer_supports( v_answer ) ) ), enhanced_answers );
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                  }
                  spec_pred_answers = Sequences.nreverse( enhanced_answers );
                }
                if( NIL != first_onlyP )
                {
                  answers = spec_pred_answers;
                  doneP = T;
                }
                else
                {
                  answers = ConsesLow.append( answers, spec_pred_answers );
                }
              }
            }
            csome_list_var = csome_list_var.rest();
            spec_pred = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym41$RELEVANT_MT_IS_ANY_MT ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const42$InferencePSC, thread );
        final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word( pred, word );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = spec_preds;
          SubLObject spec_pred = NIL;
          spec_pred = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            if( NIL != lexicon_accessors.speech_part_predP( spec_pred, UNPROVIDED ) )
            {
              SubLObject spec_pred_answers = sosowp_int( word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
              if( NIL != spec_pred_answers )
              {
                if( NIL != $sowu_include_supportsP$.getDynamicValue( thread ) && NIL != sosowp_top_levelP() )
                {
                  SubLObject enhanced_answers = NIL;
                  SubLObject cdolist_list_var = spec_pred_answers;
                  SubLObject v_answer = NIL;
                  v_answer = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    enhanced_answers = ConsesLow.cons( make_regular_generation_answer( regular_generation_answer_string( v_answer ), regular_generation_answer_pred( v_answer ), ConsesLow.cons( removal_module_utilities
                        .make_genl_preds_support( regular_generation_answer_pred( v_answer ), pred ), regular_generation_answer_supports( v_answer ) ) ), enhanced_answers );
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                  }
                  spec_pred_answers = Sequences.nreverse( enhanced_answers );
                }
                if( NIL != first_onlyP )
                {
                  answers = spec_pred_answers;
                  doneP = T;
                }
                else
                {
                  answers = ConsesLow.append( answers, spec_pred_answers );
                }
              }
            }
            csome_list_var = csome_list_var.rest();
            spec_pred = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
        mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
        final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word( pred, word );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = spec_preds;
          SubLObject spec_pred = NIL;
          spec_pred = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            if( NIL != lexicon_accessors.speech_part_predP( spec_pred, UNPROVIDED ) )
            {
              SubLObject spec_pred_answers = sosowp_int( word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
              if( NIL != spec_pred_answers )
              {
                if( NIL != $sowu_include_supportsP$.getDynamicValue( thread ) && NIL != sosowp_top_levelP() )
                {
                  SubLObject enhanced_answers = NIL;
                  SubLObject cdolist_list_var = spec_pred_answers;
                  SubLObject v_answer = NIL;
                  v_answer = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    enhanced_answers = ConsesLow.cons( make_regular_generation_answer( regular_generation_answer_string( v_answer ), regular_generation_answer_pred( v_answer ), ConsesLow.cons( removal_module_utilities
                        .make_genl_preds_support( regular_generation_answer_pred( v_answer ), pred ), regular_generation_answer_supports( v_answer ) ) ), enhanced_answers );
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                  }
                  spec_pred_answers = Sequences.nreverse( enhanced_answers );
                }
                if( NIL != first_onlyP )
                {
                  answers = spec_pred_answers;
                  doneP = T;
                }
                else
                {
                  answers = ConsesLow.append( answers, spec_pred_answers );
                }
              }
            }
            csome_list_var = csome_list_var.rest();
            spec_pred = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym35$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( mt_info, thread );
        final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word( pred, word );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = spec_preds;
          SubLObject spec_pred = NIL;
          spec_pred = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            if( NIL != lexicon_accessors.speech_part_predP( spec_pred, UNPROVIDED ) )
            {
              SubLObject spec_pred_answers = sosowp_int( word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
              if( NIL != spec_pred_answers )
              {
                if( NIL != $sowu_include_supportsP$.getDynamicValue( thread ) && NIL != sosowp_top_levelP() )
                {
                  SubLObject enhanced_answers = NIL;
                  SubLObject cdolist_list_var = spec_pred_answers;
                  SubLObject v_answer = NIL;
                  v_answer = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    enhanced_answers = ConsesLow.cons( make_regular_generation_answer( regular_generation_answer_string( v_answer ), regular_generation_answer_pred( v_answer ), ConsesLow.cons( removal_module_utilities
                        .make_genl_preds_support( regular_generation_answer_pred( v_answer ), pred ), regular_generation_answer_supports( v_answer ) ) ), enhanced_answers );
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                  }
                  spec_pred_answers = Sequences.nreverse( enhanced_answers );
                }
                if( NIL != first_onlyP )
                {
                  answers = spec_pred_answers;
                  doneP = T;
                }
                else
                {
                  answers = ConsesLow.append( answers, spec_pred_answers );
                }
              }
            }
            csome_list_var = csome_list_var.rest();
            spec_pred = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 19562L)
  public static SubLObject sosowp_int_spec_preds(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP,
      final SubLObject test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sosowp_int_spec_preds_internal( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym75$SOSOWP_INT_SPEC_PREDS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym75$SOSOWP_INT_SPEC_PREDS, SEVEN_INTEGER, $int76$200, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym75$SOSOWP_INT_SPEC_PREDS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_7( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test );
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
        if( word.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pred.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt_info.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( first_onlyP.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( include_supportsP.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( use_morphologyP.equal( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( NIL != cached_args && NIL == cached_args.rest() && test.equal( cached_args.first() ) )
                    {
                      return memoization_state.caching_results( results2 );
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sosowp_int_spec_preds_internal( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 20835L)
  public static SubLObject sosowp_int_this_pred(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    SubLObject doneP = NIL;
    if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym39$RELEVANT_MT_IS_EVERYTHING ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
        SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index( word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        lookup_gafs = Sort.sort( lookup_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = lookup_gafs;
          SubLObject gaf = NIL;
          gaf = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            final SubLObject string = assertions_high.gaf_arg2( gaf );
            final SubLObject v_answer = ( NIL != include_supportsP ) ? ConsesLow.list( string, pred, gaf ) : ConsesLow.list( string, pred );
            answers = ConsesLow.cons( v_answer, answers );
            if( NIL != first_onlyP )
            {
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            gaf = csome_list_var.first();
          }
        }
        answers = Sequences.nreverse( answers );
        if( NIL == doneP )
        {
          if( NIL == lookup_gafs && NIL != use_morphologyP )
          {
            if( NIL == higher_asserted_entry_for_wuP( pred, word, mt_info ) )
            {
              if( NIL != ( ( NIL != constant_handles.valid_constantP( $const78$simpleFuture_Generic, UNPROVIDED ) ) ? lexicon_accessors.genl_pos_predP( pred, $const78$simpleFuture_Generic, UNPROVIDED )
                  : makeBoolean( NIL != constant_handles.valid_constantP( $const79$futureTense_Generic, UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred, $const79$futureTense_Generic, UNPROVIDED ) ) )
                  && NIL != mt_relevance_macros.relevant_mtP( $const80$EnglishMt ) )
              {
                if( NIL == doneP )
                {
                  SubLObject csome_list_var = string_or_strings_of_wordXpred( word, $const84$infinitive, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED );
                  SubLObject future_answer = NIL;
                  future_answer = csome_list_var.first();
                  while ( NIL == doneP && NIL != csome_list_var)
                  {
                    if( NIL != future_answer )
                    {
                      final SubLObject infinitive = regular_generation_answer_string( future_answer );
                      final SubLObject helper = ( NIL != constant_handles.valid_constantP( $const81$EnglishHeadlineParaphraseMt, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP(
                          $const81$EnglishHeadlineParaphraseMt ) ) ? $str82$to_ : $str83$will_;
                      final SubLObject future_string = Sequences.cconcatenate( helper, infinitive );
                      answers = ConsesLow.cons( ConsesLow.list( future_string, pred ), answers );
                      doneP = first_onlyP;
                    }
                    csome_list_var = csome_list_var.rest();
                    future_answer = csome_list_var.first();
                  }
                }
              }
              else if( NIL != constant_handles.valid_constantP( perfect_aspect_pred(), UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred, perfect_aspect_pred(), UNPROVIDED ) && NIL != mt_relevance_macros
                  .relevant_mtP( $const80$EnglishMt ) )
              {
                final SubLObject have_aux = perfect_english_have_aux_for_pred( pred );
                if( have_aux.isString() && NIL == doneP )
                {
                  SubLObject csome_list_var2 = string_or_strings_of_wordXpred( word, $const86$perfect, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED );
                  SubLObject perfect_answer = NIL;
                  perfect_answer = csome_list_var2.first();
                  while ( NIL == doneP && NIL != csome_list_var2)
                  {
                    if( NIL != perfect_answer )
                    {
                      final SubLObject perfect_form = regular_generation_answer_string( perfect_answer );
                      final SubLObject perfect_string = Sequences.cconcatenate( have_aux, new SubLObject[] { $str85$_, perfect_form
                      } );
                      answers = ConsesLow.cons( ConsesLow.list( perfect_string, pred ), answers );
                      doneP = first_onlyP;
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    perfect_answer = csome_list_var2.first();
                  }
                }
              }
              else if( NIL != lexicon_accessors.derived_predP( pred, UNPROVIDED ) && NIL == doneP )
              {
                SubLObject csome_list_var = generate_regular_string_or_strings( word, pred, mt_info );
                SubLObject derived_answer = NIL;
                derived_answer = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  if( NIL != derived_answer )
                  {
                    answers = ConsesLow.cons( derived_answer, answers );
                    doneP = first_onlyP;
                  }
                  csome_list_var = csome_list_var.rest();
                  derived_answer = csome_list_var.first();
                }
              }
            }
          }
        }
        if( NIL == doneP && NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue( thread ) )
        {
          SubLObject abbrev_gafs = NIL;
          final SubLObject pred_var = $const87$abbreviationForLexicalWord;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word, NIL, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw88$GAF, $kw89$TRUE, NIL );
                  SubLObject done_var_$44 = NIL;
                  final SubLObject token_var_$45 = NIL;
                  while ( NIL == done_var_$44)
                  {
                    final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$45 );
                    final SubLObject valid_$46 = makeBoolean( !token_var_$45.eql( abbrev_gaf ) );
                    if( NIL != valid_$46 )
                    {
                      final SubLObject term_phrases_constraint = assertions_high.gaf_arg2( abbrev_gaf );
                      if( term_phrases_constraint.eql( pred ) || term_phrases_constraint.eql( lexicon_accessors.pos_of_pred( pred ) ) )
                      {
                        abbrev_gafs = ConsesLow.cons( abbrev_gaf, abbrev_gafs );
                      }
                    }
                    done_var_$44 = makeBoolean( NIL == valid_$46 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$47, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          abbrev_gafs = Sort.sort( abbrev_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED );
          if( NIL == doneP )
          {
            SubLObject csome_list_var3 = abbrev_gafs;
            SubLObject gaf2 = NIL;
            gaf2 = csome_list_var3.first();
            while ( NIL == doneP && NIL != csome_list_var3)
            {
              final SubLObject string_arg = THREE_INTEGER;
              final SubLObject string2 = assertions_high.gaf_arg( gaf2, string_arg );
              SubLObject v_answer2 = ConsesLow.list( string2, pred );
              if( NIL != include_supportsP )
              {
                v_answer2 = ConsesLow.append( v_answer2, ConsesLow.list( gaf2 ) );
              }
              answers = ConsesLow.cons( v_answer2, answers );
              if( NIL != first_onlyP )
              {
                doneP = T;
              }
              csome_list_var3 = csome_list_var3.rest();
              gaf2 = csome_list_var3.first();
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym41$RELEVANT_MT_IS_ANY_MT ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const42$InferencePSC, thread );
        SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index( word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        lookup_gafs = Sort.sort( lookup_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = lookup_gafs;
          SubLObject gaf = NIL;
          gaf = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            final SubLObject string = assertions_high.gaf_arg2( gaf );
            final SubLObject v_answer = ( NIL != include_supportsP ) ? ConsesLow.list( string, pred, gaf ) : ConsesLow.list( string, pred );
            answers = ConsesLow.cons( v_answer, answers );
            if( NIL != first_onlyP )
            {
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            gaf = csome_list_var.first();
          }
        }
        answers = Sequences.nreverse( answers );
        if( NIL == doneP )
        {
          if( NIL == lookup_gafs && NIL != use_morphologyP )
          {
            if( NIL == higher_asserted_entry_for_wuP( pred, word, mt_info ) )
            {
              if( NIL != ( ( NIL != constant_handles.valid_constantP( $const78$simpleFuture_Generic, UNPROVIDED ) ) ? lexicon_accessors.genl_pos_predP( pred, $const78$simpleFuture_Generic, UNPROVIDED )
                  : makeBoolean( NIL != constant_handles.valid_constantP( $const79$futureTense_Generic, UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred, $const79$futureTense_Generic, UNPROVIDED ) ) )
                  && NIL != mt_relevance_macros.relevant_mtP( $const80$EnglishMt ) )
              {
                if( NIL == doneP )
                {
                  SubLObject csome_list_var = string_or_strings_of_wordXpred( word, $const84$infinitive, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED );
                  SubLObject future_answer = NIL;
                  future_answer = csome_list_var.first();
                  while ( NIL == doneP && NIL != csome_list_var)
                  {
                    if( NIL != future_answer )
                    {
                      final SubLObject infinitive = regular_generation_answer_string( future_answer );
                      final SubLObject helper = ( NIL != constant_handles.valid_constantP( $const81$EnglishHeadlineParaphraseMt, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP(
                          $const81$EnglishHeadlineParaphraseMt ) ) ? $str82$to_ : $str83$will_;
                      final SubLObject future_string = Sequences.cconcatenate( helper, infinitive );
                      answers = ConsesLow.cons( ConsesLow.list( future_string, pred ), answers );
                      doneP = first_onlyP;
                    }
                    csome_list_var = csome_list_var.rest();
                    future_answer = csome_list_var.first();
                  }
                }
              }
              else if( NIL != constant_handles.valid_constantP( perfect_aspect_pred(), UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred, perfect_aspect_pred(), UNPROVIDED ) && NIL != mt_relevance_macros
                  .relevant_mtP( $const80$EnglishMt ) )
              {
                final SubLObject have_aux = perfect_english_have_aux_for_pred( pred );
                if( have_aux.isString() && NIL == doneP )
                {
                  SubLObject csome_list_var2 = string_or_strings_of_wordXpred( word, $const86$perfect, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED );
                  SubLObject perfect_answer = NIL;
                  perfect_answer = csome_list_var2.first();
                  while ( NIL == doneP && NIL != csome_list_var2)
                  {
                    if( NIL != perfect_answer )
                    {
                      final SubLObject perfect_form = regular_generation_answer_string( perfect_answer );
                      final SubLObject perfect_string = Sequences.cconcatenate( have_aux, new SubLObject[] { $str85$_, perfect_form
                      } );
                      answers = ConsesLow.cons( ConsesLow.list( perfect_string, pred ), answers );
                      doneP = first_onlyP;
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    perfect_answer = csome_list_var2.first();
                  }
                }
              }
              else if( NIL != lexicon_accessors.derived_predP( pred, UNPROVIDED ) && NIL == doneP )
              {
                SubLObject csome_list_var = generate_regular_string_or_strings( word, pred, mt_info );
                SubLObject derived_answer = NIL;
                derived_answer = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  if( NIL != derived_answer )
                  {
                    answers = ConsesLow.cons( derived_answer, answers );
                    doneP = first_onlyP;
                  }
                  csome_list_var = csome_list_var.rest();
                  derived_answer = csome_list_var.first();
                }
              }
            }
          }
        }
        if( NIL == doneP && NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue( thread ) )
        {
          SubLObject abbrev_gafs = NIL;
          final SubLObject pred_var = $const87$abbreviationForLexicalWord;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word, NIL, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw88$GAF, $kw89$TRUE, NIL );
                  SubLObject done_var_$45 = NIL;
                  final SubLObject token_var_$46 = NIL;
                  while ( NIL == done_var_$45)
                  {
                    final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$46 );
                    final SubLObject valid_$47 = makeBoolean( !token_var_$46.eql( abbrev_gaf ) );
                    if( NIL != valid_$47 )
                    {
                      final SubLObject term_phrases_constraint = assertions_high.gaf_arg2( abbrev_gaf );
                      if( term_phrases_constraint.eql( pred ) || term_phrases_constraint.eql( lexicon_accessors.pos_of_pred( pred ) ) )
                      {
                        abbrev_gafs = ConsesLow.cons( abbrev_gaf, abbrev_gafs );
                      }
                    }
                    done_var_$45 = makeBoolean( NIL == valid_$47 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$48, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          abbrev_gafs = Sort.sort( abbrev_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED );
          if( NIL == doneP )
          {
            SubLObject csome_list_var3 = abbrev_gafs;
            SubLObject gaf2 = NIL;
            gaf2 = csome_list_var3.first();
            while ( NIL == doneP && NIL != csome_list_var3)
            {
              final SubLObject string_arg = THREE_INTEGER;
              final SubLObject string2 = assertions_high.gaf_arg( gaf2, string_arg );
              SubLObject v_answer2 = ConsesLow.list( string2, pred );
              if( NIL != include_supportsP )
              {
                v_answer2 = ConsesLow.append( v_answer2, ConsesLow.list( gaf2 ) );
              }
              answers = ConsesLow.cons( v_answer2, answers );
              if( NIL != first_onlyP )
              {
                doneP = T;
              }
              csome_list_var3 = csome_list_var3.rest();
              gaf2 = csome_list_var3.first();
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
        mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
        SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index( word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        lookup_gafs = Sort.sort( lookup_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = lookup_gafs;
          SubLObject gaf = NIL;
          gaf = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            final SubLObject string = assertions_high.gaf_arg2( gaf );
            final SubLObject v_answer = ( NIL != include_supportsP ) ? ConsesLow.list( string, pred, gaf ) : ConsesLow.list( string, pred );
            answers = ConsesLow.cons( v_answer, answers );
            if( NIL != first_onlyP )
            {
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            gaf = csome_list_var.first();
          }
        }
        answers = Sequences.nreverse( answers );
        if( NIL == doneP )
        {
          if( NIL == lookup_gafs && NIL != use_morphologyP )
          {
            if( NIL == higher_asserted_entry_for_wuP( pred, word, mt_info ) )
            {
              if( NIL != ( ( NIL != constant_handles.valid_constantP( $const78$simpleFuture_Generic, UNPROVIDED ) ) ? lexicon_accessors.genl_pos_predP( pred, $const78$simpleFuture_Generic, UNPROVIDED )
                  : makeBoolean( NIL != constant_handles.valid_constantP( $const79$futureTense_Generic, UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred, $const79$futureTense_Generic, UNPROVIDED ) ) )
                  && NIL != mt_relevance_macros.relevant_mtP( $const80$EnglishMt ) )
              {
                if( NIL == doneP )
                {
                  SubLObject csome_list_var = string_or_strings_of_wordXpred( word, $const84$infinitive, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED );
                  SubLObject future_answer = NIL;
                  future_answer = csome_list_var.first();
                  while ( NIL == doneP && NIL != csome_list_var)
                  {
                    if( NIL != future_answer )
                    {
                      final SubLObject infinitive = regular_generation_answer_string( future_answer );
                      final SubLObject helper = ( NIL != constant_handles.valid_constantP( $const81$EnglishHeadlineParaphraseMt, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP(
                          $const81$EnglishHeadlineParaphraseMt ) ) ? $str82$to_ : $str83$will_;
                      final SubLObject future_string = Sequences.cconcatenate( helper, infinitive );
                      answers = ConsesLow.cons( ConsesLow.list( future_string, pred ), answers );
                      doneP = first_onlyP;
                    }
                    csome_list_var = csome_list_var.rest();
                    future_answer = csome_list_var.first();
                  }
                }
              }
              else if( NIL != constant_handles.valid_constantP( perfect_aspect_pred(), UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred, perfect_aspect_pred(), UNPROVIDED ) && NIL != mt_relevance_macros
                  .relevant_mtP( $const80$EnglishMt ) )
              {
                final SubLObject have_aux = perfect_english_have_aux_for_pred( pred );
                if( have_aux.isString() && NIL == doneP )
                {
                  SubLObject csome_list_var2 = string_or_strings_of_wordXpred( word, $const86$perfect, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED );
                  SubLObject perfect_answer = NIL;
                  perfect_answer = csome_list_var2.first();
                  while ( NIL == doneP && NIL != csome_list_var2)
                  {
                    if( NIL != perfect_answer )
                    {
                      final SubLObject perfect_form = regular_generation_answer_string( perfect_answer );
                      final SubLObject perfect_string = Sequences.cconcatenate( have_aux, new SubLObject[] { $str85$_, perfect_form
                      } );
                      answers = ConsesLow.cons( ConsesLow.list( perfect_string, pred ), answers );
                      doneP = first_onlyP;
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    perfect_answer = csome_list_var2.first();
                  }
                }
              }
              else if( NIL != lexicon_accessors.derived_predP( pred, UNPROVIDED ) && NIL == doneP )
              {
                SubLObject csome_list_var = generate_regular_string_or_strings( word, pred, mt_info );
                SubLObject derived_answer = NIL;
                derived_answer = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  if( NIL != derived_answer )
                  {
                    answers = ConsesLow.cons( derived_answer, answers );
                    doneP = first_onlyP;
                  }
                  csome_list_var = csome_list_var.rest();
                  derived_answer = csome_list_var.first();
                }
              }
            }
          }
        }
        if( NIL == doneP && NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue( thread ) )
        {
          SubLObject abbrev_gafs = NIL;
          final SubLObject pred_var = $const87$abbreviationForLexicalWord;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word, NIL, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw88$GAF, $kw89$TRUE, NIL );
                  SubLObject done_var_$46 = NIL;
                  final SubLObject token_var_$47 = NIL;
                  while ( NIL == done_var_$46)
                  {
                    final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$47 );
                    final SubLObject valid_$48 = makeBoolean( !token_var_$47.eql( abbrev_gaf ) );
                    if( NIL != valid_$48 )
                    {
                      final SubLObject term_phrases_constraint = assertions_high.gaf_arg2( abbrev_gaf );
                      if( term_phrases_constraint.eql( pred ) || term_phrases_constraint.eql( lexicon_accessors.pos_of_pred( pred ) ) )
                      {
                        abbrev_gafs = ConsesLow.cons( abbrev_gaf, abbrev_gafs );
                      }
                    }
                    done_var_$46 = makeBoolean( NIL == valid_$48 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          abbrev_gafs = Sort.sort( abbrev_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED );
          if( NIL == doneP )
          {
            SubLObject csome_list_var3 = abbrev_gafs;
            SubLObject gaf2 = NIL;
            gaf2 = csome_list_var3.first();
            while ( NIL == doneP && NIL != csome_list_var3)
            {
              final SubLObject string_arg = THREE_INTEGER;
              final SubLObject string2 = assertions_high.gaf_arg( gaf2, string_arg );
              SubLObject v_answer2 = ConsesLow.list( string2, pred );
              if( NIL != include_supportsP )
              {
                v_answer2 = ConsesLow.append( v_answer2, ConsesLow.list( gaf2 ) );
              }
              answers = ConsesLow.cons( v_answer2, answers );
              if( NIL != first_onlyP )
              {
                doneP = T;
              }
              csome_list_var3 = csome_list_var3.rest();
              gaf2 = csome_list_var3.first();
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym35$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( mt_info, thread );
        SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index( word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        lookup_gafs = Sort.sort( lookup_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = lookup_gafs;
          SubLObject gaf = NIL;
          gaf = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            final SubLObject string = assertions_high.gaf_arg2( gaf );
            final SubLObject v_answer = ( NIL != include_supportsP ) ? ConsesLow.list( string, pred, gaf ) : ConsesLow.list( string, pred );
            answers = ConsesLow.cons( v_answer, answers );
            if( NIL != first_onlyP )
            {
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            gaf = csome_list_var.first();
          }
        }
        answers = Sequences.nreverse( answers );
        if( NIL == doneP )
        {
          if( NIL == lookup_gafs && NIL != use_morphologyP )
          {
            if( NIL == higher_asserted_entry_for_wuP( pred, word, mt_info ) )
            {
              if( NIL != ( ( NIL != constant_handles.valid_constantP( $const78$simpleFuture_Generic, UNPROVIDED ) ) ? lexicon_accessors.genl_pos_predP( pred, $const78$simpleFuture_Generic, UNPROVIDED )
                  : makeBoolean( NIL != constant_handles.valid_constantP( $const79$futureTense_Generic, UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred, $const79$futureTense_Generic, UNPROVIDED ) ) )
                  && NIL != mt_relevance_macros.relevant_mtP( $const80$EnglishMt ) )
              {
                if( NIL == doneP )
                {
                  SubLObject csome_list_var = string_or_strings_of_wordXpred( word, $const84$infinitive, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED );
                  SubLObject future_answer = NIL;
                  future_answer = csome_list_var.first();
                  while ( NIL == doneP && NIL != csome_list_var)
                  {
                    if( NIL != future_answer )
                    {
                      final SubLObject infinitive = regular_generation_answer_string( future_answer );
                      final SubLObject helper = ( NIL != constant_handles.valid_constantP( $const81$EnglishHeadlineParaphraseMt, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP(
                          $const81$EnglishHeadlineParaphraseMt ) ) ? $str82$to_ : $str83$will_;
                      final SubLObject future_string = Sequences.cconcatenate( helper, infinitive );
                      answers = ConsesLow.cons( ConsesLow.list( future_string, pred ), answers );
                      doneP = first_onlyP;
                    }
                    csome_list_var = csome_list_var.rest();
                    future_answer = csome_list_var.first();
                  }
                }
              }
              else if( NIL != constant_handles.valid_constantP( perfect_aspect_pred(), UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred, perfect_aspect_pred(), UNPROVIDED ) && NIL != mt_relevance_macros
                  .relevant_mtP( $const80$EnglishMt ) )
              {
                final SubLObject have_aux = perfect_english_have_aux_for_pred( pred );
                if( have_aux.isString() && NIL == doneP )
                {
                  SubLObject csome_list_var2 = string_or_strings_of_wordXpred( word, $const86$perfect, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED );
                  SubLObject perfect_answer = NIL;
                  perfect_answer = csome_list_var2.first();
                  while ( NIL == doneP && NIL != csome_list_var2)
                  {
                    if( NIL != perfect_answer )
                    {
                      final SubLObject perfect_form = regular_generation_answer_string( perfect_answer );
                      final SubLObject perfect_string = Sequences.cconcatenate( have_aux, new SubLObject[] { $str85$_, perfect_form
                      } );
                      answers = ConsesLow.cons( ConsesLow.list( perfect_string, pred ), answers );
                      doneP = first_onlyP;
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    perfect_answer = csome_list_var2.first();
                  }
                }
              }
              else if( NIL != lexicon_accessors.derived_predP( pred, UNPROVIDED ) && NIL == doneP )
              {
                SubLObject csome_list_var = generate_regular_string_or_strings( word, pred, mt_info );
                SubLObject derived_answer = NIL;
                derived_answer = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  if( NIL != derived_answer )
                  {
                    answers = ConsesLow.cons( derived_answer, answers );
                    doneP = first_onlyP;
                  }
                  csome_list_var = csome_list_var.rest();
                  derived_answer = csome_list_var.first();
                }
              }
            }
          }
        }
        if( NIL == doneP && NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue( thread ) )
        {
          SubLObject abbrev_gafs = NIL;
          final SubLObject pred_var = $const87$abbreviationForLexicalWord;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word, NIL, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw88$GAF, $kw89$TRUE, NIL );
                  SubLObject done_var_$47 = NIL;
                  final SubLObject token_var_$48 = NIL;
                  while ( NIL == done_var_$47)
                  {
                    final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$48 );
                    final SubLObject valid_$49 = makeBoolean( !token_var_$48.eql( abbrev_gaf ) );
                    if( NIL != valid_$49 )
                    {
                      final SubLObject term_phrases_constraint = assertions_high.gaf_arg2( abbrev_gaf );
                      if( term_phrases_constraint.eql( pred ) || term_phrases_constraint.eql( lexicon_accessors.pos_of_pred( pred ) ) )
                      {
                        abbrev_gafs = ConsesLow.cons( abbrev_gaf, abbrev_gafs );
                      }
                    }
                    done_var_$47 = makeBoolean( NIL == valid_$49 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          abbrev_gafs = Sort.sort( abbrev_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED );
          if( NIL == doneP )
          {
            SubLObject csome_list_var3 = abbrev_gafs;
            SubLObject gaf2 = NIL;
            gaf2 = csome_list_var3.first();
            while ( NIL == doneP && NIL != csome_list_var3)
            {
              final SubLObject string_arg = THREE_INTEGER;
              final SubLObject string2 = assertions_high.gaf_arg( gaf2, string_arg );
              SubLObject v_answer2 = ConsesLow.list( string2, pred );
              if( NIL != include_supportsP )
              {
                v_answer2 = ConsesLow.append( v_answer2, ConsesLow.list( gaf2 ) );
              }
              answers = ConsesLow.cons( v_answer2, answers );
              if( NIL != first_onlyP )
              {
                doneP = T;
              }
              csome_list_var3 = csome_list_var3.rest();
              gaf2 = csome_list_var3.first();
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( answers, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 24351L)
  public static SubLObject perfect_english_have_aux_for_pred(final SubLObject pred)
  {
    if( pred.eql( $const90$futurePerfect_Universal ) )
    {
      return $str91$will_have;
    }
    if( pred.eql( $const92$pastPerfect_Universal ) )
    {
      return $str93$had;
    }
    if( pred.eql( $const94$firstPersonSg_PresentPerfect ) || pred.eql( $const95$secondPersonSg_PresentPerfect ) || pred.eql( $const96$pluralVerb_PresentPerfect ) )
    {
      return $str97$have;
    }
    if( pred.eql( $const98$thirdPersonSg_PresentPerfect ) )
    {
      return $str99$has;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 24726L)
  public static SubLObject prefer_lexical_assertionP(final SubLObject as1, final SubLObject as2, SubLObject terseness)
  {
    if( terseness == UNPROVIDED )
    {
      terseness = NIL;
    }
    final SubLObject gsa_pred = gen_string_assertion_pred_for_terseness( terseness );
    if( NIL == assertion_handles.assertion_p( as1 ) )
    {
      return NIL;
    }
    if( NIL == assertion_handles.assertion_p( as2 ) )
    {
      return T;
    }
    if( NIL != somewhere_cache.some_pred_assertion_somewhereP( gsa_pred, as1, TWO_INTEGER, UNPROVIDED ) && NIL == somewhere_cache.some_pred_assertion_somewhereP( gsa_pred, as2, TWO_INTEGER, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != somewhere_cache.some_pred_assertion_somewhereP( gsa_pred, as2, TWO_INTEGER, UNPROVIDED ) && NIL == somewhere_cache.some_pred_assertion_somewhereP( gsa_pred, as1, TWO_INTEGER, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const100$dispreferredLexification, as1, TWO_INTEGER, UNPROVIDED ) && NIL == somewhere_cache.some_pred_assertion_somewhereP(
        $const100$dispreferredLexification, as2, TWO_INTEGER, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const100$dispreferredLexification, as2, TWO_INTEGER, UNPROVIDED ) && NIL == somewhere_cache.some_pred_assertion_somewhereP(
        $const100$dispreferredLexification, as1, TWO_INTEGER, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != terseness && NIL != prefer_lexical_assertionP( as1, as2, NIL ) )
    {
      return T;
    }
    if( NIL != terseness && NIL != prefer_lexical_assertionP( as2, as1, NIL ) )
    {
      return NIL;
    }
    return prefer_lexical_assertion_sans_asserted_preferenceP( as1, as2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 25951L)
  public static SubLObject prefer_lexical_assertion_sans_asserted_preferenceP(final SubLObject as1, final SubLObject as2)
  {
    if( NIL != abbreviation_assertion_p( as2 ) && NIL == abbreviation_assertion_p( as1 ) )
    {
      return T;
    }
    if( NIL != abbreviation_assertion_p( as1 ) && NIL == abbreviation_assertion_p( as2 ) )
    {
      return NIL;
    }
    if( $kw101$MONOTONIC == assertions_high.assertion_strength( as1 ) && $kw102$DEFAULT == assertions_high.assertion_strength( as2 ) )
    {
      return T;
    }
    if( $kw101$MONOTONIC == assertions_high.assertion_strength( as2 ) && $kw102$DEFAULT == assertions_high.assertion_strength( as1 ) )
    {
      return NIL;
    }
    if( NIL != cardinality_estimates.generality_estimateL( assertions_high.assertion_mt( as1 ), assertions_high.assertion_mt( as2 ) ) )
    {
      return T;
    }
    if( NIL != cardinality_estimates.generality_estimateG( assertions_high.assertion_mt( as1 ), assertions_high.assertion_mt( as2 ) ) )
    {
      return NIL;
    }
    if( NIL != assertions_high.asserted_assertionP( as1 ) && NIL == assertions_high.asserted_assertionP( as2 ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 26848L)
  public static SubLObject abbreviation_assertion_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( v_object ) && cycl_utilities.formula_arg0( v_object ).eql( $const87$abbreviationForLexicalWord ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 26999L)
  public static SubLObject gen_string_assertion_pred_for_terseness(final SubLObject terseness)
  {
    if( terseness.eql( $kw103$TERSE ) )
    {
      return $const104$genStringAssertion_Terse;
    }
    if( terseness.eql( $kw105$PRECISE ) )
    {
      return $const106$genStringAssertion_Precise;
    }
    return $const107$genStringAssertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 27243L)
  public static SubLObject sosowp_sort_answers(final SubLObject answers)
  {
    return Sort.sort( answers, $sym32$PREFER_POS_PRED_, Symbols.symbol_function( $sym108$SECOND ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 27341L)
  public static SubLObject sosowp_immediate_spec_preds_for_word(final SubLObject pred, final SubLObject word)
  {
    final SubLObject ans;
    final SubLObject all_immediate_spec_preds = ans = kb_mapping_utilities.pred_values_in_any_mt( pred, $const26$genlPreds, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    return Sort.sort( list_utilities.remove_if_not( $sym13$SPEECH_PART_PRED_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym32$PREFER_POS_PRED_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 27706L)
  public static SubLObject prefer_pos_predP_internal(final SubLObject pred1, final SubLObject pred2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
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
      if( NIL != lexicon_accessors.genl_pos_predP( pred1, $const109$verbStrings, UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred2, $const109$verbStrings, UNPROVIDED ) )
      {
        ans = prefer_verbal_pos_predP( pred1, pred2, mt );
      }
      else if( NIL != lexicon_accessors.derived_predP( pred2, UNPROVIDED ) && NIL == lexicon_accessors.derived_predP( pred1, UNPROVIDED ) )
      {
        ans = T;
      }
      else if( NIL != lexicon_accessors.genl_pos_predP( pred1, $const110$simpleNounStrings, UNPROVIDED ) && NIL == lexicon_accessors.genl_pos_predP( pred2, $const110$simpleNounStrings, UNPROVIDED ) )
      {
        ans = T;
      }
      else if( NIL != lexicon_accessors.genl_pos_predP( pred2, $const111$plural_Generic, UNPROVIDED ) && NIL == lexicon_accessors.genl_pos_predP( pred1, $const111$plural_Generic, UNPROVIDED ) )
      {
        ans = T;
      }
      else if( NIL != lexicon_accessors.genl_pos_predP( pred1, $const112$singular_Generic, UNPROVIDED ) && NIL == lexicon_accessors.genl_pos_predP( pred2, $const112$singular_Generic, UNPROVIDED ) )
      {
        ans = T;
      }
      else if( NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( pred2 ), $const113$ProperNoun, UNPROVIDED ) && NIL == lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( pred1 ),
          $const113$ProperNoun, UNPROVIDED ) )
      {
        ans = T;
      }
      else if( NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( pred1 ), $const114$CountNoun_Generic, UNPROVIDED ) && NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( pred2 ),
          $const115$MassNoun_Generic, UNPROVIDED ) )
      {
        ans = T;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 27706L)
  public static SubLObject prefer_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return prefer_pos_predP_internal( pred1, pred2, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym32$PREFER_POS_PRED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym32$PREFER_POS_PRED_, THREE_INTEGER, $int116$400, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym32$PREFER_POS_PRED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( pred1, pred2, mt );
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
        if( pred1.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pred2.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( prefer_pos_predP_internal( pred1, pred2, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred1, pred2, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 28871L)
  public static SubLObject prefer_verbal_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
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
      final SubLObject pred1_tensedP = lexicon_accessors.genl_pos_predP( pred1, $const117$tensed, UNPROVIDED );
      final SubLObject pred2_tensedP = lexicon_accessors.genl_pos_predP( pred2, $const117$tensed, UNPROVIDED );
      ans = ( NIL != pred1_tensedP ) ? ( ( NIL != pred2_tensedP ) ? prefer_tensed_pos_predP( pred1, pred2, mt ) : NIL ) : ( ( NIL != pred2_tensedP ) ? T : prefer_non_tensed_pos_predP( pred1, pred2, mt ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 29615L)
  public static SubLObject prefer_tensed_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
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
      final SubLObject pred1_presentP = lexicon_accessors.genl_pos_predP( pred1, $const118$presentTense_Generic, UNPROVIDED );
      final SubLObject pred2_presentP = lexicon_accessors.genl_pos_predP( pred2, $const118$presentTense_Generic, UNPROVIDED );
      if( NIL != pred1_presentP && NIL == pred2_presentP )
      {
        ans = T;
      }
      else if( NIL != pred2_presentP && NIL == pred1_presentP )
      {
        ans = NIL;
      }
      else
      {
        final SubLObject pred1_perfectP = lexicon_accessors.genl_pos_predP( pred1, perfect_aspect_pred(), UNPROVIDED );
        final SubLObject pred2_perfectP = lexicon_accessors.genl_pos_predP( pred2, perfect_aspect_pred(), UNPROVIDED );
        if( NIL != pred1_perfectP && NIL == pred2_perfectP )
        {
          ans = NIL;
        }
        else if( NIL != pred2_perfectP && NIL == pred1_perfectP )
        {
          ans = T;
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 30774L)
  public static SubLObject prefer_non_tensed_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 31594L)
  public static SubLObject grsos_repeated_argsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $grsos_repeated_argsP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 31667L)
  public static SubLObject with_grsos_context(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    args = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym49$PROGN, ConsesLow.listS( $sym50$CLET, reader.bq_cons( ConsesLow.list( $sym51$NEW_ARGS_, ConsesLow.listS( $sym52$SET_ADD, args, $list119 ) ), $list120 ), ConsesLow.append( body, ConsesLow
        .list( ConsesLow.list( $sym56$PWHEN, $sym51$NEW_ARGS_, ConsesLow.listS( $sym57$SET_REMOVE, args, $list119 ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 32057L)
  public static SubLObject generate_regular_string_or_strings(final SubLObject wu, final SubLObject pred, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = lexicon_vars.lexicon_lookup_mt_info();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    SubLObject doneP = NIL;
    SubLObject stop_recursionP = NIL;
    final SubLObject new_argsP = set.set_add( ConsesLow.list( wu, pred, mt_info ), $grsos_done_args$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = $within_regular_generation_internalsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $grsos_repeated_argsP$.currentBinding( thread );
    try
    {
      $within_regular_generation_internalsP$.bind( T, thread );
      $grsos_repeated_argsP$.bind( makeBoolean( NIL != $grsos_repeated_argsP$.getDynamicValue( thread ) || NIL == new_argsP ), thread );
      if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym39$RELEVANT_MT_IS_EVERYTHING ) )
      {
        final SubLObject _prev_bind_0_$60 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$61 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym39$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const40$EverythingPSC, thread );
          if( NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( pred ), $const113$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
          {
            final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred( pred );
            final SubLObject base_string_answers = ( NIL != kb_utilities.kbeq( base_form, pred ) ) ? NIL : string_or_strings_of_wordXpred( wu, base_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL == doneP )
            {
              SubLObject csome_list_var = base_string_answers;
              SubLObject base_answer = NIL;
              base_answer = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                final SubLObject base_string = regular_generation_answer_string( base_answer );
                final SubLObject upcased_string = string_utilities.string_proper( base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                final SubLObject upcased_answer = make_regular_generation_answer( upcased_string, pred, regular_generation_answer_supports( base_answer ) );
                answers = ConsesLow.cons( upcased_answer, answers );
                doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                csome_list_var = csome_list_var.rest();
                base_answer = csome_list_var.first();
              }
            }
          }
          if( NIL != derived_modifier_predP( pred ) )
          {
            final SubLObject result = generate_regular_modifier_string_or_strings( wu, pred, mt_info );
            if( NIL != result )
            {
              answers = ConsesLow.append( answers, result );
              doneP = $sowu_first_onlyP$.getDynamicValue( thread );
            }
          }
          else if( NIL != lexicon_accessors.speech_part_predP( pred, ( NIL != hlmt.hlmt_p( mt_info ) ) ? mt_info : $const42$InferencePSC ) )
          {
            if( NIL != grsos_repeated_argsP() )
            {
              stop_recursionP = T;
            }
            if( NIL == doneP )
            {
              SubLObject csome_list_var2 = morphology.suffix_rules_for_pred( pred );
              SubLObject rule = NIL;
              rule = csome_list_var2.first();
              while ( NIL == doneP && NIL != csome_list_var2)
              {
                final SubLObject base_form2 = assertions_high.gaf_arg2( rule );
                final SubLObject suffix = assertions_high.gaf_arg3( rule );
                final SubLObject _prev_bind_0_$61 = $sowu_use_morphologyP$.currentBinding( thread );
                try
                {
                  $sowu_use_morphologyP$.bind( makeBoolean( NIL != $sowu_use_morphologyP$.getDynamicValue( thread ) && NIL == stop_recursionP ), thread );
                  if( NIL == doneP )
                  {
                    SubLObject csome_list_var_$63 = string_or_strings_of_wordXpred( wu, base_form2, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    SubLObject base_answer2 = NIL;
                    base_answer2 = csome_list_var_$63.first();
                    while ( NIL == doneP && NIL != csome_list_var_$63)
                    {
                      final SubLObject base_string2 = regular_generation_answer_string( base_answer2 );
                      final SubLObject base_supports = regular_generation_answer_supports( base_answer2 );
                      final SubLObject derived_string = morphology.add_english_suffix( base_string2, suffix );
                      final SubLObject supports = ( NIL != arguments.support_p( rule ) ) ? ConsesLow.cons( rule, base_supports ) : base_supports;
                      final SubLObject derived_answer = make_regular_generation_answer( derived_string, pred, supports );
                      answers = ConsesLow.cons( derived_answer, answers );
                      doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                      csome_list_var_$63 = csome_list_var_$63.rest();
                      base_answer2 = csome_list_var_$63.first();
                    }
                  }
                }
                finally
                {
                  $sowu_use_morphologyP$.rebind( _prev_bind_0_$61, thread );
                }
                csome_list_var2 = csome_list_var2.rest();
                rule = csome_list_var2.first();
              }
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$61, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$60, thread );
        }
      }
      else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym41$RELEVANT_MT_IS_ANY_MT ) )
      {
        final SubLObject _prev_bind_0_$62 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_ANY_MT, thread );
          mt_relevance_macros.$mt$.bind( $const42$InferencePSC, thread );
          if( NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( pred ), $const113$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
          {
            final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred( pred );
            final SubLObject base_string_answers = ( NIL != kb_utilities.kbeq( base_form, pred ) ) ? NIL : string_or_strings_of_wordXpred( wu, base_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL == doneP )
            {
              SubLObject csome_list_var = base_string_answers;
              SubLObject base_answer = NIL;
              base_answer = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                final SubLObject base_string = regular_generation_answer_string( base_answer );
                final SubLObject upcased_string = string_utilities.string_proper( base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                final SubLObject upcased_answer = make_regular_generation_answer( upcased_string, pred, regular_generation_answer_supports( base_answer ) );
                answers = ConsesLow.cons( upcased_answer, answers );
                doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                csome_list_var = csome_list_var.rest();
                base_answer = csome_list_var.first();
              }
            }
          }
          if( NIL != derived_modifier_predP( pred ) )
          {
            final SubLObject result = generate_regular_modifier_string_or_strings( wu, pred, mt_info );
            if( NIL != result )
            {
              answers = ConsesLow.append( answers, result );
              doneP = $sowu_first_onlyP$.getDynamicValue( thread );
            }
          }
          else if( NIL != lexicon_accessors.speech_part_predP( pred, ( NIL != hlmt.hlmt_p( mt_info ) ) ? mt_info : $const42$InferencePSC ) )
          {
            if( NIL != grsos_repeated_argsP() )
            {
              stop_recursionP = T;
            }
            if( NIL == doneP )
            {
              SubLObject csome_list_var2 = morphology.suffix_rules_for_pred( pred );
              SubLObject rule = NIL;
              rule = csome_list_var2.first();
              while ( NIL == doneP && NIL != csome_list_var2)
              {
                final SubLObject base_form2 = assertions_high.gaf_arg2( rule );
                final SubLObject suffix = assertions_high.gaf_arg3( rule );
                final SubLObject _prev_bind_0_$63 = $sowu_use_morphologyP$.currentBinding( thread );
                try
                {
                  $sowu_use_morphologyP$.bind( makeBoolean( NIL != $sowu_use_morphologyP$.getDynamicValue( thread ) && NIL == stop_recursionP ), thread );
                  if( NIL == doneP )
                  {
                    SubLObject csome_list_var_$64 = string_or_strings_of_wordXpred( wu, base_form2, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    SubLObject base_answer2 = NIL;
                    base_answer2 = csome_list_var_$64.first();
                    while ( NIL == doneP && NIL != csome_list_var_$64)
                    {
                      final SubLObject base_string2 = regular_generation_answer_string( base_answer2 );
                      final SubLObject base_supports = regular_generation_answer_supports( base_answer2 );
                      final SubLObject derived_string = morphology.add_english_suffix( base_string2, suffix );
                      final SubLObject supports = ( NIL != arguments.support_p( rule ) ) ? ConsesLow.cons( rule, base_supports ) : base_supports;
                      final SubLObject derived_answer = make_regular_generation_answer( derived_string, pred, supports );
                      answers = ConsesLow.cons( derived_answer, answers );
                      doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                      csome_list_var_$64 = csome_list_var_$64.rest();
                      base_answer2 = csome_list_var_$64.first();
                    }
                  }
                }
                finally
                {
                  $sowu_use_morphologyP$.rebind( _prev_bind_0_$63, thread );
                }
                csome_list_var2 = csome_list_var2.rest();
                rule = csome_list_var2.first();
              }
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$62, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$62, thread );
        }
      }
      else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
      {
        final SubLObject _prev_bind_0_$64 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$63 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
          mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
          if( NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( pred ), $const113$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
          {
            final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred( pred );
            final SubLObject base_string_answers = ( NIL != kb_utilities.kbeq( base_form, pred ) ) ? NIL : string_or_strings_of_wordXpred( wu, base_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL == doneP )
            {
              SubLObject csome_list_var = base_string_answers;
              SubLObject base_answer = NIL;
              base_answer = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                final SubLObject base_string = regular_generation_answer_string( base_answer );
                final SubLObject upcased_string = string_utilities.string_proper( base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                final SubLObject upcased_answer = make_regular_generation_answer( upcased_string, pred, regular_generation_answer_supports( base_answer ) );
                answers = ConsesLow.cons( upcased_answer, answers );
                doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                csome_list_var = csome_list_var.rest();
                base_answer = csome_list_var.first();
              }
            }
          }
          if( NIL != derived_modifier_predP( pred ) )
          {
            final SubLObject result = generate_regular_modifier_string_or_strings( wu, pred, mt_info );
            if( NIL != result )
            {
              answers = ConsesLow.append( answers, result );
              doneP = $sowu_first_onlyP$.getDynamicValue( thread );
            }
          }
          else if( NIL != lexicon_accessors.speech_part_predP( pred, ( NIL != hlmt.hlmt_p( mt_info ) ) ? mt_info : $const42$InferencePSC ) )
          {
            if( NIL != grsos_repeated_argsP() )
            {
              stop_recursionP = T;
            }
            if( NIL == doneP )
            {
              SubLObject csome_list_var2 = morphology.suffix_rules_for_pred( pred );
              SubLObject rule = NIL;
              rule = csome_list_var2.first();
              while ( NIL == doneP && NIL != csome_list_var2)
              {
                final SubLObject base_form2 = assertions_high.gaf_arg2( rule );
                final SubLObject suffix = assertions_high.gaf_arg3( rule );
                final SubLObject _prev_bind_0_$65 = $sowu_use_morphologyP$.currentBinding( thread );
                try
                {
                  $sowu_use_morphologyP$.bind( makeBoolean( NIL != $sowu_use_morphologyP$.getDynamicValue( thread ) && NIL == stop_recursionP ), thread );
                  if( NIL == doneP )
                  {
                    SubLObject csome_list_var_$65 = string_or_strings_of_wordXpred( wu, base_form2, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    SubLObject base_answer2 = NIL;
                    base_answer2 = csome_list_var_$65.first();
                    while ( NIL == doneP && NIL != csome_list_var_$65)
                    {
                      final SubLObject base_string2 = regular_generation_answer_string( base_answer2 );
                      final SubLObject base_supports = regular_generation_answer_supports( base_answer2 );
                      final SubLObject derived_string = morphology.add_english_suffix( base_string2, suffix );
                      final SubLObject supports = ( NIL != arguments.support_p( rule ) ) ? ConsesLow.cons( rule, base_supports ) : base_supports;
                      final SubLObject derived_answer = make_regular_generation_answer( derived_string, pred, supports );
                      answers = ConsesLow.cons( derived_answer, answers );
                      doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                      csome_list_var_$65 = csome_list_var_$65.rest();
                      base_answer2 = csome_list_var_$65.first();
                    }
                  }
                }
                finally
                {
                  $sowu_use_morphologyP$.rebind( _prev_bind_0_$65, thread );
                }
                csome_list_var2 = csome_list_var2.rest();
                rule = csome_list_var2.first();
              }
            }
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_1_$63, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$64, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0_$66 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$64 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym35$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( mt_info, thread );
          if( NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( pred ), $const113$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
          {
            final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred( pred );
            final SubLObject base_string_answers = ( NIL != kb_utilities.kbeq( base_form, pred ) ) ? NIL : string_or_strings_of_wordXpred( wu, base_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL == doneP )
            {
              SubLObject csome_list_var = base_string_answers;
              SubLObject base_answer = NIL;
              base_answer = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                final SubLObject base_string = regular_generation_answer_string( base_answer );
                final SubLObject upcased_string = string_utilities.string_proper( base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                final SubLObject upcased_answer = make_regular_generation_answer( upcased_string, pred, regular_generation_answer_supports( base_answer ) );
                answers = ConsesLow.cons( upcased_answer, answers );
                doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                csome_list_var = csome_list_var.rest();
                base_answer = csome_list_var.first();
              }
            }
          }
          if( NIL != derived_modifier_predP( pred ) )
          {
            final SubLObject result = generate_regular_modifier_string_or_strings( wu, pred, mt_info );
            if( NIL != result )
            {
              answers = ConsesLow.append( answers, result );
              doneP = $sowu_first_onlyP$.getDynamicValue( thread );
            }
          }
          else if( NIL != lexicon_accessors.speech_part_predP( pred, ( NIL != hlmt.hlmt_p( mt_info ) ) ? mt_info : $const42$InferencePSC ) )
          {
            if( NIL != grsos_repeated_argsP() )
            {
              stop_recursionP = T;
            }
            if( NIL == doneP )
            {
              SubLObject csome_list_var2 = morphology.suffix_rules_for_pred( pred );
              SubLObject rule = NIL;
              rule = csome_list_var2.first();
              while ( NIL == doneP && NIL != csome_list_var2)
              {
                final SubLObject base_form2 = assertions_high.gaf_arg2( rule );
                final SubLObject suffix = assertions_high.gaf_arg3( rule );
                final SubLObject _prev_bind_0_$67 = $sowu_use_morphologyP$.currentBinding( thread );
                try
                {
                  $sowu_use_morphologyP$.bind( makeBoolean( NIL != $sowu_use_morphologyP$.getDynamicValue( thread ) && NIL == stop_recursionP ), thread );
                  if( NIL == doneP )
                  {
                    SubLObject csome_list_var_$66 = string_or_strings_of_wordXpred( wu, base_form2, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    SubLObject base_answer2 = NIL;
                    base_answer2 = csome_list_var_$66.first();
                    while ( NIL == doneP && NIL != csome_list_var_$66)
                    {
                      final SubLObject base_string2 = regular_generation_answer_string( base_answer2 );
                      final SubLObject base_supports = regular_generation_answer_supports( base_answer2 );
                      final SubLObject derived_string = morphology.add_english_suffix( base_string2, suffix );
                      final SubLObject supports = ( NIL != arguments.support_p( rule ) ) ? ConsesLow.cons( rule, base_supports ) : base_supports;
                      final SubLObject derived_answer = make_regular_generation_answer( derived_string, pred, supports );
                      answers = ConsesLow.cons( derived_answer, answers );
                      doneP = $sowu_first_onlyP$.getDynamicValue( thread );
                      csome_list_var_$66 = csome_list_var_$66.rest();
                      base_answer2 = csome_list_var_$66.first();
                    }
                  }
                }
                finally
                {
                  $sowu_use_morphologyP$.rebind( _prev_bind_0_$67, thread );
                }
                csome_list_var2 = csome_list_var2.rest();
                rule = csome_list_var2.first();
              }
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$64, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$66, thread );
        }
      }
      if( NIL != new_argsP )
      {
        set.set_remove( ConsesLow.list( wu, pred, mt_info ), $grsos_done_args$.getDynamicValue( thread ) );
      }
    }
    finally
    {
      $grsos_repeated_argsP$.rebind( _prev_bind_2, thread );
      $within_regular_generation_internalsP$.rebind( _prev_bind_0, thread );
    }
    return extract_regular_generation_answer_type( answers, $sowu_first_onlyP$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 34800L)
  public static SubLObject generate_regular_modifier_string_or_strings(final SubLObject wu, final SubLObject pred, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    SubLObject doneP = NIL;
    final SubLObject base_pred = base_pred_for_derived_modifier_pred( pred );
    final SubLObject base_string_answers = string_or_strings_of_wordXpred( wu, base_pred, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == doneP )
    {
      SubLObject csome_list_var = base_string_answers;
      SubLObject base_answer = NIL;
      base_answer = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        final SubLObject base_string = regular_generation_answer_string( base_answer );
        final SubLObject inflected_string = morphology.generate_regular_string_from_form( pred, base_pred, base_string, mt_info );
        final SubLObject inflected_answer = ConsesLow.append( ConsesLow.list( inflected_string, pred ), regular_generation_answer_supports( base_answer ) );
        answers = ConsesLow.cons( inflected_answer, answers );
        doneP = $sowu_first_onlyP$.getDynamicValue( thread );
        csome_list_var = csome_list_var.rest();
        base_answer = csome_list_var.first();
      }
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 35587L)
  public static SubLObject derived_modifier_predP(final SubLObject pred)
  {
    return makeBoolean( NIL != lexicon_accessors.derived_predP( pred, UNPROVIDED ) && ( NIL != lexicon_accessors.genl_pos_predP( pred, $const121$adverbStrings, UNPROVIDED ) || NIL != lexicon_accessors.genl_pos_predP(
        pred, $const122$adjStrings, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 35760L)
  public static SubLObject base_pred_for_derived_modifier_pred(final SubLObject derived_pred)
  {
    if( NIL != lexicon_accessors.genl_pos_predP( derived_pred, $const122$adjStrings, UNPROVIDED ) )
    {
      return $const123$regularDegree;
    }
    if( NIL != lexicon_accessors.genl_pos_predP( derived_pred, $const121$adverbStrings, UNPROVIDED ) )
    {
      return $const124$regularAdverb;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 35990L)
  public static SubLObject modifier_form_blockedP(final SubLObject string, final SubLObject pred)
  {
    return makeBoolean( NIL != modifier_form_has_noun_denotP( string ) || ( NIL != superlative_formP( pred ) && NIL != superlative_form_lacks_corresponding_comparativeP( string, pred ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 36401L)
  public static SubLObject modifier_form_has_noun_denotP(final SubLObject string)
  {
    return list_utilities.sublisp_boolean( lexicon_accessors.denots_of_stringXspeech_part( string, $const125$Noun, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 36521L)
  public static SubLObject comparative_formP(final SubLObject pred)
  {
    return makeBoolean( NIL != lexicon_accessors.genl_pos_predP( pred, $const126$comparativeDegree, UNPROVIDED ) || NIL != lexicon_accessors.genl_pos_predP( pred, $const127$comparativeAdverb, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 36669L)
  public static SubLObject superlative_formP(final SubLObject pred)
  {
    return makeBoolean( NIL != lexicon_accessors.genl_pos_predP( pred, $const128$superlativeDegree, UNPROVIDED ) || NIL != lexicon_accessors.genl_pos_predP( pred, $const129$superlativeAdverb, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 36817L)
  public static SubLObject superlative_form_lacks_corresponding_comparativeP(final SubLObject string, final SubLObject pred)
  {
    SubLObject blockedP = NIL;
    if( NIL != kb_utilities.kbeq( pred, $const129$superlativeAdverb ) )
    {
      blockedP = Types.sublisp_null( lexicon_accessors.words_of_stringXpred( morphology.add_english_suffix( string_utilities.post_remove( string, $str130$est, UNPROVIDED ), $str131$er ), $const127$comparativeAdverb,
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else if( NIL != kb_utilities.kbeq( pred, $const128$superlativeDegree ) )
    {
      blockedP = Types.sublisp_null( lexicon_accessors.words_of_stringXpred( morphology.add_english_suffix( string_utilities.post_remove( string, $str130$est, UNPROVIDED ), $str131$er ), $const126$comparativeDegree,
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return blockedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 37724L)
  public static SubLObject initialize_lexicon_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym133$VALID_CONSTANT_, $lexicon_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_lexicon_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_lexicon_kb_loaded();
    }
    return kb_control_vars.lexicon_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 38078L)
  public static SubLObject initialize_lexicon_modules()
  {
    initialize_lexicon();
    sme_lexification_wizard_accessors.init_sme_lexwiz();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 38414L)
  public static SubLObject initialize_lexicon()
  {
    lexicon_accessors.clear_cached_lexical_access_functions();
    initialize_lexicon_lookup_mt();
    lexicon_vars.initialize_multi_word_preds();
    lexicon_vars.initialize_all_speech_part_preds();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 38739L)
  public static SubLObject initialize_lexicon_lookup_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.kb_loaded() )
    {
      lexicon_vars.$lexicon_lookup_mt$.setDynamicValue( NIL, thread );
      if( NIL == lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) )
      {
        SubLObject csome_list_var = $list135;
        SubLObject mt_name = NIL;
        mt_name = csome_list_var.first();
        while ( NIL == lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) && NIL != csome_list_var)
        {
          final SubLObject mt = constants_high.find_constant( mt_name );
          if( NIL != constant_handles.valid_constantP( mt, UNPROVIDED ) )
          {
            final SubLObject anytime = hlmt_czer.canonicalize_hlmt( hlmt.new_hlmt( ConsesLow.list( mt, $const134$AnytimePSC ) ) );
            lexicon_vars.$lexicon_lookup_mt$.setDynamicValue( ( NIL != hlmt.valid_hlmt_p( anytime, UNPROVIDED ) ) ? anytime : mt, thread );
          }
          csome_list_var = csome_list_var.rest();
          mt_name = csome_list_var.first();
        }
      }
    }
    return lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 39277L)
  public static SubLObject initialize_lexicon_from_kb()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    lexicon_vars.initialize_all_speech_part_preds();
    final SubLObject nl_trie_rebuild_flag = makeBoolean( NIL != nl_trie.empty_nl_trieP( UNPROVIDED ) || NIL != nl_trie_staleness_test.nl_trie_known_stale_p() || NIL != nl_trie_staleness_test.nl_trie_revisions_staleP() );
    if( NIL != nl_trie_rebuild_flag )
    {
      nl_trie.initialize_nl_trie( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      PrintLow.format( T, $str136$Merely_validating_NL_trie_as_it_a );
      nl_trie.nl_trie_validate_all_entries();
    }
    if( NIL != $allow_nl_trie_rotation_initializationP$.getDynamicValue( thread ) && ( NIL != nl_trie_rebuild_flag || NIL == nl_trie_accessors.nl_trie_rotation_index_initializedP() ) )
    {
      nl_trie_accessors.force_nl_trie_rotation_index_initialization( UNPROVIDED );
    }
    else
    {
      PrintLow.format( T, $str137$Skipping_initialization_of_NL_tri, ( NIL != $allow_nl_trie_rotation_initializationP$.getDynamicValue( thread ) ) ? $str138$needed : $str139$allowed );
    }
    control_vars.note_lexicon_initialized();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 40287L)
  public static SubLObject lexicon_cache_filename(final SubLObject directory_path)
  {
    return file_utilities.relative_filename( directory_path, $str140$lexicon_cache, $str141$cfasl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 40473L)
  public static SubLObject rebuild_lexicon_cache()
  {
    nl_trie.initialize_nl_trie( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    control_vars.note_lexicon_initialized();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 40835L)
  public static SubLObject lexicon_cache_builtP()
  {
    return makeBoolean( NIL != lexicon_vars.$nl_trie_code_revision$.getGlobalValue() && NIL != lexicon_vars.$morphology_code_revision$.getGlobalValue() && NIL != lexicon_vars.$lexicon_cache_code_revision$
        .getGlobalValue() && NIL != nl_trie.get_nl_trie() && NIL == nl_trie.empty_nl_trieP( nl_trie.get_nl_trie() ) && NIL != nl_trie_completion.$nl_trie_completion_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 41153L)
  public static SubLObject dump_lexicon_cache(final SubLObject directory_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cfasl_file = lexicon_cache_filename( directory_path );
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      final SubLObject data_file = get_nl_trie_contents_data_file( directory_path );
      final SubLObject index_file = get_nl_trie_contents_index_file( directory_path );
      SubLObject fvector = NIL;
      try
      {
        fvector = file_vector.new_file_vector( data_file, index_file, $kw142$OUTPUT, file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ), file_utilities.$default_big_stream_buffer_size$
            .getDynamicValue( thread ), UNPROVIDED );
        dumper.kb_dump_stamp_file_vector_for_references( fvector );
        final SubLObject str = $str143$Dumping_lexicon_cache___;
        final SubLObject _prev_bind_0_$76 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$77 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          SubLObject stream = NIL;
          try
          {
            stream = compatibility.open_binary( cfasl_file, $kw142$OUTPUT );
            if( !stream.isStream() )
            {
              Errors.error( $str144$Unable_to_open__S, cfasl_file );
            }
            final SubLObject stream_$78 = stream;
            nl_trie_staleness_test.dump_nl_trie_revisions( stream_$78 );
            nl_trie.dump_swappable_nl_trie_to_lexicon_cache( stream_$78, fvector );
            nl_trie.dump_nl_trie_completion_index( stream_$78 );
          }
          finally
          {
            final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( stream.isStream() )
              {
                streams_high.close( stream, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$77, thread );
            }
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$77, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$76, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$78 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( NIL != file_vector.file_vector_p( fvector ) )
          {
            file_vector.close_file_vector( fvector );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$78, thread );
        }
      }
      dumper.discard_dump_filename( index_file );
      dumper.discard_dump_filename( data_file );
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 42048L)
  public static SubLObject load_lexicon_cache(SubLObject directory_path)
  {
    if( directory_path == UNPROVIDED )
    {
      directory_path = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == directory_path )
    {
      directory_path = dumper.kb_dump_directory( UNPROVIDED, UNPROVIDED );
    }
    final SubLObject cfasl_file = lexicon_cache_filename( directory_path );
    if( NIL == Filesys.probe_file( cfasl_file ) )
    {
      Errors.warn( $str145$CFASL_file__s_not_found, cfasl_file );
    }
    else
    {
      final SubLObject str = $str146$Loading_lexicon_cache___;
      final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$is_noting_progressP$.bind( T, thread );
        utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
        utilities_macros.noting_progress_preamble( str );
        final SubLObject _prev_bind_0_$81 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
        final SubLObject _prev_bind_1_$82 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
        try
        {
          StreamsLow.$stream_initial_input_buffer_size$.bind( file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ), thread );
          StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
          SubLObject stream = NIL;
          try
          {
            stream = compatibility.open_binary( cfasl_file, $kw147$INPUT );
            if( !stream.isStream() )
            {
              Errors.error( $str144$Unable_to_open__S, cfasl_file );
            }
            final SubLObject stream_$83 = stream;
            nl_trie_staleness_test.load_nl_trie_revisions( stream_$83 );
            final SubLObject _prev_bind_0_$82 = cfasl.$cfasl_input_to_static_area$.currentBinding( thread );
            try
            {
              cfasl.$cfasl_input_to_static_area$.bind( load_nl_trie_into_static_areaP(), thread );
              nl_trie.load_nl_trie_from_lexicon_cache( stream_$83 );
              final SubLObject data_file = get_nl_trie_contents_data_file( directory_path );
              final SubLObject index_file = get_nl_trie_contents_index_file( directory_path );
              if( NIL != file_utilities.file_existsP( data_file ) && NIL != file_utilities.file_existsP( index_file ) )
              {
                nl_trie.reconnect_nl_trie_to_file_vector_files( data_file, index_file, UNPROVIDED );
              }
              dumper.discard_dump_filename( index_file );
              dumper.discard_dump_filename( data_file );
              nl_trie.load_nl_trie_completion_index( stream_$83 );
            }
            finally
            {
              cfasl.$cfasl_input_to_static_area$.rebind( _prev_bind_0_$82, thread );
            }
            if( NIL != $allow_nl_trie_rotation_initializationP$.getDynamicValue( thread ) )
            {
              nl_trie_accessors.initialize_nl_trie_rotation_index( UNPROVIDED );
            }
            control_vars.note_lexicon_initialized();
          }
          finally
          {
            final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( stream.isStream() )
              {
                streams_high.close( stream, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$83, thread );
            }
          }
        }
        finally
        {
          StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_1_$82, thread );
          StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0_$81, thread );
        }
        utilities_macros.noting_progress_postamble();
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
        utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 43533L)
  public static SubLObject get_nl_trie_contents_data_file(SubLObject directory_path)
  {
    if( directory_path == UNPROVIDED )
    {
      directory_path = NIL;
    }
    return dumper.kb_dump_file( $str148$nl_trie_contents, directory_path, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 43659L)
  public static SubLObject get_nl_trie_contents_index_file(SubLObject directory_path)
  {
    if( directory_path == UNPROVIDED )
    {
      directory_path = NIL;
    }
    return dumper.kb_dump_file( $str149$nl_trie_contents_index, directory_path, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 43791L)
  public static SubLObject redump_lexicon_cache(SubLObject directory_path)
  {
    if( directory_path == UNPROVIDED )
    {
      directory_path = NIL;
    }
    if( NIL == directory_path )
    {
      directory_path = dumper.kb_dump_directory( UNPROVIDED, UNPROVIDED );
    }
    return dump_lexicon_cache( directory_path );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 44247L)
  public static SubLObject must_use_static_memory_for_nl_trie()
  {
    $must_use_static_memory_for_nl_trieP$.setGlobalValue( T );
    return list_utilities.sublisp_boolean( $must_use_static_memory_for_nl_trieP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 44505L)
  public static SubLObject may_use_dynamic_memory_for_nl_trie()
  {
    $must_use_static_memory_for_nl_trieP$.setGlobalValue( NIL );
    return list_utilities.sublisp_boolean( $must_use_static_memory_for_nl_trieP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 44823L)
  public static SubLObject load_nl_trie_into_static_areaP()
  {
    if( NIL == $must_use_static_memory_for_nl_trieP$.getGlobalValue() )
    {
      return T;
    }
    return T;
  }

  public static SubLObject declare_lexicon_cache_file()
  {
    SubLFiles.declareFunction( me, "perfect_aspect_pred", "PERFECT-ASPECT-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "words_of_string", "WORDS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "strings_of_word_unit", "STRINGS-OF-WORD-UNIT", 1, 3, false );
    SubLFiles.declareFunction( me, "first_string_of_word_unit", "FIRST-STRING-OF-WORD-UNIT", 1, 3, false );
    SubLFiles.declareFunction( me, "strings_of_wordXpred", "STRINGS-OF-WORD&PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "inference_strings_of_wordXpred", "INFERENCE-STRINGS-OF-WORD&PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "first_string_of_wordXpred", "FIRST-STRING-OF-WORD&PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "ok_to_derive_word_form_from_predP", "OK-TO-DERIVE-WORD-FORM-FROM-PRED?", 3, 1, false );
    SubLFiles.declareFunction( me, "ok_to_derive_word_form_for_predP", "OK-TO-DERIVE-WORD-FORM-FOR-PRED?", 4, 0, false );
    SubLFiles.declareFunction( me, "word_form_assertedP", "WORD-FORM-ASSERTED?", 3, 0, false );
    SubLFiles.declareFunction( me, "generate_regular_string", "GENERATE-REGULAR-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "generate_regular_strings", "GENERATE-REGULAR-STRINGS", 2, 1, false );
    SubLFiles.declareFunction( me, "strings_of_word_unit_with_supports", "STRINGS-OF-WORD-UNIT-WITH-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "ordered_strings_of_word_unit", "ORDERED-STRINGS-OF-WORD-UNIT", 1, 3, false );
    SubLFiles.declareFunction( me, "string_or_strings_of_word_unit", "STRING-OR-STRINGS-OF-WORD-UNIT", 3, 2, false );
    SubLFiles.declareFunction( me, "sosowp_filter_exceptions", "SOSOWP-FILTER-EXCEPTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_sosowp_do_filter_exceptions", "CLEAR-SOSOWP-DO-FILTER-EXCEPTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sosowp_do_filter_exceptions", "REMOVE-SOSOWP-DO-FILTER-EXCEPTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "sosowp_do_filter_exceptions_internal", "SOSOWP-DO-FILTER-EXCEPTIONS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sosowp_do_filter_exceptions", "SOSOWP-DO-FILTER-EXCEPTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "sosowp_remove_spec_preds", "SOSOWP-REMOVE-SPEC-PREDS", 1, 1, false );
    SubLFiles.declareFunction( me, "sosowp_repeated_argsP", "SOSOWP-REPEATED-ARGS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sosowp_top_levelP", "SOSOWP-TOP-LEVEL?", 0, 0, false );
    SubLFiles.declareFunction( me, "higher_asserted_entry_for_wuP", "HIGHER-ASSERTED-ENTRY-FOR-WU?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_genl_lexicon_preds_internal", "ALL-GENL-LEXICON-PREDS-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "all_genl_lexicon_preds", "ALL-GENL-LEXICON-PREDS", 1, 1, false );
    SubLFiles.declareMacro( me, "with_sosowp_context", "WITH-SOSOWP-CONTEXT" );
    SubLFiles.declareFunction( me, "string_or_strings_of_wordXpred_internal", "STRING-OR-STRINGS-OF-WORD&PRED-INTERNAL", 2, 5, false );
    SubLFiles.declareFunction( me, "string_or_strings_of_wordXpred", "STRING-OR-STRINGS-OF-WORD&PRED", 2, 5, false );
    SubLFiles.declareFunction( me, "make_regular_generation_answer", "MAKE-REGULAR-GENERATION-ANSWER", 1, 2, false );
    SubLFiles.declareFunction( me, "regular_generation_answer_string", "REGULAR-GENERATION-ANSWER-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "regular_generation_answer_pred", "REGULAR-GENERATION-ANSWER-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "regular_generation_answer_supports", "REGULAR-GENERATION-ANSWER-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "regular_generation_answer_string_plus_supports", "REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS", 1, 0, false );
    new $regular_generation_answer_string_plus_supports$UnaryFunction();
    SubLFiles.declareFunction( me, "extract_regular_generation_answer_type", "EXTRACT-REGULAR-GENERATION-ANSWER-TYPE", 1, 4, false );
    SubLFiles.declareFunction( me, "sosowp_int", "SOSOWP-INT", 7, 0, false );
    SubLFiles.declareFunction( me, "sosowp_int_answer_to_utf8", "SOSOWP-INT-ANSWER-TO-UTF8", 1, 0, false );
    SubLFiles.declareFunction( me, "sosowp_int_via_inference", "SOSOWP-INT-VIA-INFERENCE", 5, 0, false );
    SubLFiles.declareFunction( me, "sosowp_int_via_index_surfing", "SOSOWP-INT-VIA-INDEX-SURFING", 7, 0, false );
    SubLFiles.declareFunction( me, "sosowp_remove_duplicate_strings", "SOSOWP-REMOVE-DUPLICATE-STRINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "sosowp_int_spec_preds_internal", "SOSOWP-INT-SPEC-PREDS-INTERNAL", 7, 0, false );
    SubLFiles.declareFunction( me, "sosowp_int_spec_preds", "SOSOWP-INT-SPEC-PREDS", 7, 0, false );
    SubLFiles.declareFunction( me, "sosowp_int_this_pred", "SOSOWP-INT-THIS-PRED", 6, 0, false );
    SubLFiles.declareFunction( me, "perfect_english_have_aux_for_pred", "PERFECT-ENGLISH-HAVE-AUX-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "prefer_lexical_assertionP", "PREFER-LEXICAL-ASSERTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "prefer_lexical_assertion_sans_asserted_preferenceP", "PREFER-LEXICAL-ASSERTION-SANS-ASSERTED-PREFERENCE?", 2, 0, false );
    SubLFiles.declareFunction( me, "abbreviation_assertion_p", "ABBREVIATION-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "gen_string_assertion_pred_for_terseness", "GEN-STRING-ASSERTION-PRED-FOR-TERSENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "sosowp_sort_answers", "SOSOWP-SORT-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "sosowp_immediate_spec_preds_for_word", "SOSOWP-IMMEDIATE-SPEC-PREDS-FOR-WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "prefer_pos_predP_internal", "PREFER-POS-PRED?-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "prefer_pos_predP", "PREFER-POS-PRED?", 2, 1, false );
    new $prefer_pos_predP$BinaryFunction();
    SubLFiles.declareFunction( me, "prefer_verbal_pos_predP", "PREFER-VERBAL-POS-PRED?", 2, 1, false );
    SubLFiles.declareFunction( me, "prefer_tensed_pos_predP", "PREFER-TENSED-POS-PRED?", 2, 1, false );
    SubLFiles.declareFunction( me, "prefer_non_tensed_pos_predP", "PREFER-NON-TENSED-POS-PRED?", 2, 1, false );
    SubLFiles.declareFunction( me, "grsos_repeated_argsP", "GRSOS-REPEATED-ARGS?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_grsos_context", "WITH-GRSOS-CONTEXT" );
    SubLFiles.declareFunction( me, "generate_regular_string_or_strings", "GENERATE-REGULAR-STRING-OR-STRINGS", 2, 1, false );
    SubLFiles.declareFunction( me, "generate_regular_modifier_string_or_strings", "GENERATE-REGULAR-MODIFIER-STRING-OR-STRINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "derived_modifier_predP", "DERIVED-MODIFIER-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "base_pred_for_derived_modifier_pred", "BASE-PRED-FOR-DERIVED-MODIFIER-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "modifier_form_blockedP", "MODIFIER-FORM-BLOCKED?", 2, 0, false );
    SubLFiles.declareFunction( me, "modifier_form_has_noun_denotP", "MODIFIER-FORM-HAS-NOUN-DENOT?", 1, 0, false );
    SubLFiles.declareFunction( me, "comparative_formP", "COMPARATIVE-FORM?", 1, 0, false );
    SubLFiles.declareFunction( me, "superlative_formP", "SUPERLATIVE-FORM?", 1, 0, false );
    SubLFiles.declareFunction( me, "superlative_form_lacks_corresponding_comparativeP", "SUPERLATIVE-FORM-LACKS-CORRESPONDING-COMPARATIVE?", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_lexicon_kb_feature", "INITIALIZE-LEXICON-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_lexicon_modules", "INITIALIZE-LEXICON-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_lexicon", "INITIALIZE-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_lexicon_lookup_mt", "INITIALIZE-LEXICON-LOOKUP-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_lexicon_from_kb", "INITIALIZE-LEXICON-FROM-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "lexicon_cache_filename", "LEXICON-CACHE-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "rebuild_lexicon_cache", "REBUILD-LEXICON-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "lexicon_cache_builtP", "LEXICON-CACHE-BUILT?", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_lexicon_cache", "DUMP-LEXICON-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "load_lexicon_cache", "LOAD-LEXICON-CACHE", 0, 1, false );
    SubLFiles.declareFunction( me, "get_nl_trie_contents_data_file", "GET-NL-TRIE-CONTENTS-DATA-FILE", 0, 1, false );
    SubLFiles.declareFunction( me, "get_nl_trie_contents_index_file", "GET-NL-TRIE-CONTENTS-INDEX-FILE", 0, 1, false );
    SubLFiles.declareFunction( me, "redump_lexicon_cache", "REDUMP-LEXICON-CACHE", 0, 1, false );
    SubLFiles.declareFunction( me, "must_use_static_memory_for_nl_trie", "MUST-USE-STATIC-MEMORY-FOR-NL-TRIE", 0, 0, false );
    SubLFiles.declareFunction( me, "may_use_dynamic_memory_for_nl_trie", "MAY-USE-DYNAMIC-MEMORY-FOR-NL-TRIE", 0, 0, false );
    SubLFiles.declareFunction( me, "load_nl_trie_into_static_areaP", "LOAD-NL-TRIE-INTO-STATIC-AREA?", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_lexicon_cache_file()
  {
    $perfect_aspect_pred$ = SubLFiles.deflexical( "*PERFECT-ASPECT-PRED*", NIL );
    $sowu_eq_test$ = SubLFiles.deflexical( "*SOWU-EQ-TEST*", Symbols.symbol_function( EQUAL ) );
    $sowu_first_onlyP$ = SubLFiles.defparameter( "*SOWU-FIRST-ONLY?*", NIL );
    $sowu_use_morphologyP$ = SubLFiles.defparameter( "*SOWU-USE-MORPHOLOGY?*", T );
    $sowu_include_supportsP$ = SubLFiles.defparameter( "*SOWU-INCLUDE-SUPPORTS?*", NIL );
    $sowu_respect_orderP$ = SubLFiles.defparameter( "*SOWU-RESPECT-ORDER?*", T );
    $within_regular_generation_internalsP$ = SubLFiles.defparameter( "*WITHIN-REGULAR-GENERATION-INTERNALS?*", NIL );
    $sosowp_do_filter_exceptions_caching_state$ = SubLFiles.deflexical( "*SOSOWP-DO-FILTER-EXCEPTIONS-CACHING-STATE*", NIL );
    $sosowp_done_args$ = SubLFiles.defparameter( "*SOSOWP-DONE-ARGS*", set.new_set( EQUAL, UNPROVIDED ) );
    $sosowp_repeated_argsP$ = SubLFiles.defparameter( "*SOSOWP-REPEATED-ARGS?*", NIL );
    $grsos_done_args$ = SubLFiles.defparameter( "*GRSOS-DONE-ARGS*", set.new_set( EQUAL, UNPROVIDED ) );
    $grsos_repeated_argsP$ = SubLFiles.defparameter( "*GRSOS-REPEATED-ARGS?*", NIL );
    $lexicon_core_constants$ = SubLFiles.deflexical( "*LEXICON-CORE-CONSTANTS*", $list132 );
    $allow_nl_trie_rotation_initializationP$ = SubLFiles.defparameter( "*ALLOW-NL-TRIE-ROTATION-INITIALIZATION?*", NIL );
    $must_use_static_memory_for_nl_trieP$ = SubLFiles.deflexical( "*MUST-USE-STATIC-MEMORY-FOR-NL-TRIE?*", ( maybeDefault( $sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__, $must_use_static_memory_for_nl_trieP$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_lexicon_cache_file()
  {
    lexicon_vars.$lexicon_cache_code_revision$.setGlobalValue( $str0$_Revision__146268__ );
    lexicon_vars.declare_noop_updates_for_lexicon_global( $sym1$_LEXICON_CACHE_CODE_REVISION_, $list2 );
    utilities_macros.register_cyc_api_function( $sym6$WORDS_OF_STRING, $list7, $str8$_return_LISTP__of_word_units_asso, $list9, $list10 );
    memoization_state.note_globally_cached_function( $sym34$SOSOWP_DO_FILTER_EXCEPTIONS );
    memoization_state.note_memoized_function( $sym44$ALL_GENL_LEXICON_PREDS );
    memoization_state.note_memoized_function( $sym58$STRING_OR_STRINGS_OF_WORD_PRED );
    memoization_state.note_memoized_function( $sym75$SOSOWP_INT_SPEC_PREDS );
    memoization_state.note_memoized_function( $sym32$PREFER_POS_PRED_ );
    subl_macro_promotions.declare_defglobal( $sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__ );
    utilities_macros.register_cyc_api_function( $sym151$MUST_USE_STATIC_MEMORY_FOR_NL_TRIE, NIL, $str152$Instruct_the_loader_to_use_static, NIL, $list153 );
    utilities_macros.register_cyc_api_function( $sym154$MAY_USE_DYNAMIC_MEMORY_FOR_NL_TRIE, NIL, $str155$Instruct_the_loader_to_leave_it_u, NIL, $list153 );
    generic_testing.define_test_case_table_int( $sym32$PREFER_POS_PRED_, ConsesLow.list( new SubLObject[] { $kw156$TEST, Symbols.symbol_function( EQL ), $kw157$OWNER, NIL, $kw158$CLASSES, NIL, $kw159$KB, $kw160$FULL,
      $kw161$WORKING_, T
    } ), $list162 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexicon_cache_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexicon_cache_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexicon_cache_file();
  }
  static
  {
    me = new lexicon_cache();
    $perfect_aspect_pred$ = null;
    $sowu_eq_test$ = null;
    $sowu_first_onlyP$ = null;
    $sowu_use_morphologyP$ = null;
    $sowu_include_supportsP$ = null;
    $sowu_respect_orderP$ = null;
    $within_regular_generation_internalsP$ = null;
    $sosowp_do_filter_exceptions_caching_state$ = null;
    $sosowp_done_args$ = null;
    $sosowp_repeated_argsP$ = null;
    $grsos_done_args$ = null;
    $grsos_repeated_argsP$ = null;
    $lexicon_core_constants$ = null;
    $allow_nl_trie_rotation_initializationP$ = null;
    $must_use_static_memory_for_nl_trieP$ = null;
    $str0$_Revision__146268__ = makeString( "$Revision: 146268 $" );
    $sym1$_LEXICON_CACHE_CODE_REVISION_ = makeSymbol( "*LEXICON-CACHE-CODE-REVISION*" );
    $list2 = ConsesLow.list( ConsesLow.list( makeString( "1.193" ), makeString( "1.194" ) ), ConsesLow.list( makeString( "1.194" ), makeString( "1.195" ) ), ConsesLow.list( makeString( "1.195" ), makeString( "1.196" ) ),
        ConsesLow.list( makeString( "1.197" ), makeString( "1.198" ) ), ConsesLow.list( makeString( "1.198" ), makeString( "1.199" ) ), ConsesLow.list( makeString( "1.199" ), makeString( "1.200" ) ) );
    $str3$d2c1a460_aa6e_11d8_8d3f_0002b3a84 = makeString( "d2c1a460-aa6e-11d8-8d3f-0002b3a84f94" );
    $sym4$STRINGP = makeSymbol( "STRINGP" );
    $sym5$PARSE_MORPHOLOGICALLY_OPTION_P = makeSymbol( "PARSE-MORPHOLOGICALLY-OPTION-P" );
    $sym6$WORDS_OF_STRING = makeSymbol( "WORDS-OF-STRING" );
    $list7 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MISSPELLINGS?" ), makeSymbol( "*MISSPELLINGS?*" ) ), ConsesLow.list( makeSymbol( "LOOKUP-MT" ), makeSymbol(
        "*LEXICON-LOOKUP-MT*" ) ), ConsesLow.list( makeSymbol( "PARSE-MORPHOLOGICALLY" ), makeSymbol( "*PARSE-MORPHOLOGICALLY*" ) ) );
    $str8$_return_LISTP__of_word_units_asso = makeString(
        "@return LISTP; of word units associated with STRING.\n@param STRING stringp\n@param MISSPELLINGS? boolean; Should we include misspellings?\n@param LOOKUP-MT hlmt-p; Which mt should we look from?\n@param PARSE-MORPHOLOGICALLY: :ALWAYS or :NEVER or :AS-FALLBACK;\n                               Do we attempt to parse STRING as a complex (multi-morpheme) word?" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "PARSE-MORPHOLOGICALLY" ), makeSymbol( "PARSE-MORPHOLOGICALLY-OPTION-P" ) ) );
    $list10 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $kw11$ALL = makeKeyword( "ALL" );
    $sym12$LEXICAL_WORD_ = makeSymbol( "LEXICAL-WORD?" );
    $sym13$SPEECH_PART_PRED_ = makeSymbol( "SPEECH-PART-PRED?" );
    $kw14$DEPTH = makeKeyword( "DEPTH" );
    $kw15$STACK = makeKeyword( "STACK" );
    $kw16$QUEUE = makeKeyword( "QUEUE" );
    $const17$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw19$ERROR = makeKeyword( "ERROR" );
    $str20$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym21$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw22$CERROR = makeKeyword( "CERROR" );
    $str23$continue_anyway = makeString( "continue anyway" );
    $kw24$WARN = makeKeyword( "WARN" );
    $str25$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const26$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str27$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str28$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str29$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $const30$regularSuffix = constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) );
    $sym31$LISTP = makeSymbol( "LISTP" );
    $sym32$PREFER_POS_PRED_ = makeSymbol( "PREFER-POS-PRED?" );
    $sym33$REGULAR_GENERATION_ANSWER_STRING = makeSymbol( "REGULAR-GENERATION-ANSWER-STRING" );
    $sym34$SOSOWP_DO_FILTER_EXCEPTIONS = makeSymbol( "SOSOWP-DO-FILTER-EXCEPTIONS" );
    $sym35$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym36$ALL_SPEC_PREDICATES = makeSymbol( "ALL-SPEC-PREDICATES" );
    $sym37$_SOSOWP_DO_FILTER_EXCEPTIONS_CACHING_STATE_ = makeSymbol( "*SOSOWP-DO-FILTER-EXCEPTIONS-CACHING-STATE*" );
    $sym38$GENL_PRED_ = makeSymbol( "GENL-PRED?" );
    $sym39$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const40$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym41$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $const42$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $sym44$ALL_GENL_LEXICON_PREDS = makeSymbol( "ALL-GENL-LEXICON-PREDS" );
    $sym45$_ = makeSymbol( ">" );
    $sym46$NUM_PREDICATE_EXTENT_INDEX = makeSymbol( "NUM-PREDICATE-EXTENT-INDEX" );
    $int47$64 = makeInteger( 64 );
    $list48 = ConsesLow.list( makeSymbol( "ARGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym49$PROGN = makeSymbol( "PROGN" );
    $sym50$CLET = makeSymbol( "CLET" );
    $sym51$NEW_ARGS_ = makeSymbol( "NEW-ARGS?" );
    $sym52$SET_ADD = makeSymbol( "SET-ADD" );
    $list53 = ConsesLow.list( makeSymbol( "*SOSOWP-DONE-ARGS*" ) );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SOSOWP-REPEATED-ARGS?*" ), ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "*SOSOWP-REPEATED-ARGS?*" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol(
        "NEW-ARGS?" ) ) ) ) );
    $sym55$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym56$PWHEN = makeSymbol( "PWHEN" );
    $sym57$SET_REMOVE = makeSymbol( "SET-REMOVE" );
    $sym58$STRING_OR_STRINGS_OF_WORD_PRED = makeSymbol( "STRING-OR-STRINGS-OF-WORD&PRED" );
    $sym59$RELEVANT_PRED_IS_EVERYTHING = makeSymbol( "RELEVANT-PRED-IS-EVERYTHING" );
    $int60$1000 = makeInteger( 1000 );
    $list61 = ConsesLow.listS( makeSymbol( "STRING" ), makeSymbol( "PRED" ), makeSymbol( "SUPPORTS" ) );
    $sym62$REGULAR_GENERATION_ANSWER_STRING_PLUS_SUPPORTS = makeSymbol( "REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS" );
    $sym63$SOSOWP_INT_ANSWER_TO_UTF8 = makeSymbol( "SOSOWP-INT-ANSWER-TO-UTF8" );
    $sym64$_STRING = makeSymbol( "?STRING" );
    $sym65$_PRED = makeSymbol( "?PRED" );
    $kw66$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw67$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw68$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $kw69$NONE = makeKeyword( "NONE" );
    $kw70$RETURN = makeKeyword( "RETURN" );
    $kw71$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $kw72$BINDINGS = makeKeyword( "BINDINGS" );
    $const73$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $sym74$FIRST = makeSymbol( "FIRST" );
    $sym75$SOSOWP_INT_SPEC_PREDS = makeSymbol( "SOSOWP-INT-SPEC-PREDS" );
    $int76$200 = makeInteger( 200 );
    $sym77$PREFER_LEXICAL_ASSERTION_ = makeSymbol( "PREFER-LEXICAL-ASSERTION?" );
    $const78$simpleFuture_Generic = constant_handles.reader_make_constant_shell( makeString( "simpleFuture-Generic" ) );
    $const79$futureTense_Generic = constant_handles.reader_make_constant_shell( makeString( "futureTense-Generic" ) );
    $const80$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $const81$EnglishHeadlineParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "EnglishHeadlineParaphraseMt" ) );
    $str82$to_ = makeString( "to " );
    $str83$will_ = makeString( "will " );
    $const84$infinitive = constant_handles.reader_make_constant_shell( makeString( "infinitive" ) );
    $str85$_ = makeString( " " );
    $const86$perfect = constant_handles.reader_make_constant_shell( makeString( "perfect" ) );
    $const87$abbreviationForLexicalWord = constant_handles.reader_make_constant_shell( makeString( "abbreviationForLexicalWord" ) );
    $kw88$GAF = makeKeyword( "GAF" );
    $kw89$TRUE = makeKeyword( "TRUE" );
    $const90$futurePerfect_Universal = constant_handles.reader_make_constant_shell( makeString( "futurePerfect-Universal" ) );
    $str91$will_have = makeString( "will have" );
    $const92$pastPerfect_Universal = constant_handles.reader_make_constant_shell( makeString( "pastPerfect-Universal" ) );
    $str93$had = makeString( "had" );
    $const94$firstPersonSg_PresentPerfect = constant_handles.reader_make_constant_shell( makeString( "firstPersonSg-PresentPerfect" ) );
    $const95$secondPersonSg_PresentPerfect = constant_handles.reader_make_constant_shell( makeString( "secondPersonSg-PresentPerfect" ) );
    $const96$pluralVerb_PresentPerfect = constant_handles.reader_make_constant_shell( makeString( "pluralVerb-PresentPerfect" ) );
    $str97$have = makeString( "have" );
    $const98$thirdPersonSg_PresentPerfect = constant_handles.reader_make_constant_shell( makeString( "thirdPersonSg-PresentPerfect" ) );
    $str99$has = makeString( "has" );
    $const100$dispreferredLexification = constant_handles.reader_make_constant_shell( makeString( "dispreferredLexification" ) );
    $kw101$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw102$DEFAULT = makeKeyword( "DEFAULT" );
    $kw103$TERSE = makeKeyword( "TERSE" );
    $const104$genStringAssertion_Terse = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion-Terse" ) );
    $kw105$PRECISE = makeKeyword( "PRECISE" );
    $const106$genStringAssertion_Precise = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion-Precise" ) );
    $const107$genStringAssertion = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion" ) );
    $sym108$SECOND = makeSymbol( "SECOND" );
    $const109$verbStrings = constant_handles.reader_make_constant_shell( makeString( "verbStrings" ) );
    $const110$simpleNounStrings = constant_handles.reader_make_constant_shell( makeString( "simpleNounStrings" ) );
    $const111$plural_Generic = constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) );
    $const112$singular_Generic = constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) );
    $const113$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $const114$CountNoun_Generic = constant_handles.reader_make_constant_shell( makeString( "CountNoun-Generic" ) );
    $const115$MassNoun_Generic = constant_handles.reader_make_constant_shell( makeString( "MassNoun-Generic" ) );
    $int116$400 = makeInteger( 400 );
    $const117$tensed = constant_handles.reader_make_constant_shell( makeString( "tensed" ) );
    $const118$presentTense_Generic = constant_handles.reader_make_constant_shell( makeString( "presentTense-Generic" ) );
    $list119 = ConsesLow.list( makeSymbol( "*GRSOS-DONE-ARGS*" ) );
    $list120 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-REGULAR-GENERATION-INTERNALS?*" ), T ), ConsesLow.list( makeSymbol( "*GRSOS-REPEATED-ARGS?*" ), ConsesLow.list( makeSymbol( "COR" ), makeSymbol(
        "*GRSOS-REPEATED-ARGS?*" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "NEW-ARGS?" ) ) ) ) );
    $const121$adverbStrings = constant_handles.reader_make_constant_shell( makeString( "adverbStrings" ) );
    $const122$adjStrings = constant_handles.reader_make_constant_shell( makeString( "adjStrings" ) );
    $const123$regularDegree = constant_handles.reader_make_constant_shell( makeString( "regularDegree" ) );
    $const124$regularAdverb = constant_handles.reader_make_constant_shell( makeString( "regularAdverb" ) );
    $const125$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const126$comparativeDegree = constant_handles.reader_make_constant_shell( makeString( "comparativeDegree" ) );
    $const127$comparativeAdverb = constant_handles.reader_make_constant_shell( makeString( "comparativeAdverb" ) );
    $const128$superlativeDegree = constant_handles.reader_make_constant_shell( makeString( "superlativeDegree" ) );
    $const129$superlativeAdverb = constant_handles.reader_make_constant_shell( makeString( "superlativeAdverb" ) );
    $str130$est = makeString( "est" );
    $str131$er = makeString( "er" );
    $list132 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LexicalWord" ) ), constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), constant_handles
        .reader_make_constant_shell( makeString( "termStrings" ) ), constant_handles.reader_make_constant_shell( makeString( "GeneralLexiconMt" ) ), constant_handles.reader_make_constant_shell( makeString(
            "AllLexicalMicrotheoryPSC" ) ) );
    $sym133$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $const134$AnytimePSC = constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) );
    $list135 = ConsesLow.list( makeString( "AllEnglishValidatedLexicalMicrotheoryPSC" ), makeString( "AllEnglishLexicalMicrotheoryPSC" ), makeString( "EnglishMt" ), makeString( "BaseKB" ) );
    $str136$Merely_validating_NL_trie_as_it_a = makeString( "Merely validating NL trie as it appears to be non-empty and non-stale." );
    $str137$Skipping_initialization_of_NL_tri = makeString( "Skipping initialization of NL trie rotation index and it appears to not be ~A." );
    $str138$needed = makeString( "needed" );
    $str139$allowed = makeString( "allowed" );
    $str140$lexicon_cache = makeString( "lexicon-cache" );
    $str141$cfasl = makeString( "cfasl" );
    $kw142$OUTPUT = makeKeyword( "OUTPUT" );
    $str143$Dumping_lexicon_cache___ = makeString( "Dumping lexicon cache..." );
    $str144$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str145$CFASL_file__s_not_found = makeString( "CFASL file ~s not found" );
    $str146$Loading_lexicon_cache___ = makeString( "Loading lexicon cache..." );
    $kw147$INPUT = makeKeyword( "INPUT" );
    $str148$nl_trie_contents = makeString( "nl-trie-contents" );
    $str149$nl_trie_contents_index = makeString( "nl-trie-contents-index" );
    $sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__ = makeSymbol( "*MUST-USE-STATIC-MEMORY-FOR-NL-TRIE?*" );
    $sym151$MUST_USE_STATIC_MEMORY_FOR_NL_TRIE = makeSymbol( "MUST-USE-STATIC-MEMORY-FOR-NL-TRIE" );
    $str152$Instruct_the_loader_to_use_static = makeString( "Instruct the loader to use static memory when loading the NL trie." );
    $list153 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym154$MAY_USE_DYNAMIC_MEMORY_FOR_NL_TRIE = makeSymbol( "MAY-USE-DYNAMIC-MEMORY-FOR-NL-TRIE" );
    $str155$Instruct_the_loader_to_leave_it_u = makeString( "Instruct the loader to leave it up to the implementation whether to\n   use dynamic or static memory when loading the NL trie" );
    $kw156$TEST = makeKeyword( "TEST" );
    $kw157$OWNER = makeKeyword( "OWNER" );
    $kw158$CLASSES = makeKeyword( "CLASSES" );
    $kw159$KB = makeKeyword( "KB" );
    $kw160$FULL = makeKeyword( "FULL" );
    $kw161$WORKING_ = makeKeyword( "WORKING?" );
    $list162 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thirdPersonSg-Past" ) ), constant_handles.reader_make_constant_shell( makeString(
        "thirdPersonSg-Present" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thirdPersonSg-Present" ) ), constant_handles.reader_make_constant_shell( makeString(
            "thirdPersonSg-Past" ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pastPerfect-Universal" ) ), constant_handles.reader_make_constant_shell( makeString(
                "thirdPersonSg-Past" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thirdPersonSg-Past" ) ), constant_handles.reader_make_constant_shell(
                    makeString( "pastPerfect-Universal" ) ) ), T ) );
  }

  public static final class $regular_generation_answer_string_plus_supports$UnaryFunction
      extends
        UnaryFunction
  {
    public $regular_generation_answer_string_plus_supports$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return regular_generation_answer_string_plus_supports( arg1 );
    }
  }

  public static final class $prefer_pos_predP$BinaryFunction
      extends
        BinaryFunction
  {
    public $prefer_pos_predP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PREFER-POS-PRED?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return prefer_pos_predP( arg1, arg2, $prefer_pos_predP$BinaryFunction.UNPROVIDED );
    }
  }
}
/*
 * 
 * Total time: 2118 ms
 * 
 */