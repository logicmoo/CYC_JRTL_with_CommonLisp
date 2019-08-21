package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class proof_view_news
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.proof_view_news";
  public static final String myFingerPrint = "cf720921a547811791c4f6d1349c4a978bae957210ac2533e6361f1776c8e197";
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 976L)
  public static SubLSymbol $proof_view_story_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 10944L)
  private static SubLSymbol $proof_view_news_detail_last_sentence$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12671L)
  private static SubLSymbol $proof_view_story_coherence_weight$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12736L)
  private static SubLSymbol $proof_view_story_meaninginess_weight$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12802L)
  private static SubLSymbol $proof_view_story_depth_weight$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 15468L)
  private static SubLSymbol $proof_view_story_section_max_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19722L)
  private static SubLSymbol $promising_news_query_sample_rate$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19869L)
  private static SubLSymbol $news_troller_daemon_abortP$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 25651L)
  public static SubLSymbol $proof_view_news_xsl_file$;
  private static final SubLString $str0$Story_;
  private static final SubLSymbol $kw1$STORY_ROOT;
  private static final SubLSymbol $sym2$PROOF_VIEW_ADD_STORY_SECTION;
  private static final SubLSymbol $kw3$STORY;
  private static final SubLObject $const4$CycProofViewStorySection;
  private static final SubLString $str5$;
  private static final SubLSymbol $kw6$HEADLINE;
  private static final SubLSymbol $kw7$IGNORE;
  private static final SubLSymbol $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS;
  private static final SubLString $str9$_S_is_trivial_in__S;
  private static final SubLString $str10$_S_is_irrelevant_in__S;
  private static final SubLSymbol $kw11$SUBHEADLINE;
  private static final SubLSymbol $kw12$JUSTIFICATION_ROOT;
  private static final SubLSymbol $sym13$THCL_FORT_;
  private static final SubLString $str14$__Main_actors___S__;
  private static final SubLString $str15$__Found__D_background_facts_for__;
  private static final SubLSymbol $sym16$_;
  private static final SubLSymbol $sym17$UNLEXIFIED_;
  private static final SubLSymbol $sym18$FORT_P;
  private static final SubLString $str19$Unlexified_FORT__S___in__S;
  private static final SubLString $str20$Trivial_fact__S;
  private static final SubLSymbol $kw21$SEEN_STORY_SENTENCES;
  private static final SubLSymbol $kw22$SUMMARY_ROOT;
  private static final SubLString $str23$__Current_paragraph_now_has__S_se;
  private static final SubLSymbol $sym24$SET_P;
  private static final SubLSymbol $sym25$PROOF_VIEW_STORY_DETAIL_SCORE;
  private static final SubLSymbol $sym26$_EXIT;
  private static final SubLSymbol $sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE;
  private static final SubLFloat $float28$30_0;
  private static final SubLFloat $float29$1_0;
  private static final SubLFloat $float30$50_0;
  private static final SubLSymbol $kw31$STORY_SENTENCES_SO_FAR;
  private static final SubLSymbol $kw32$STORY_PARAGRAPH;
  private static final SubLString $str33$_S___coheres_with__S;
  private static final SubLSymbol $sym34$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLString $str35$Reached_story_depth_cutoff_of__D_;
  private static final SubLList $list36;
  private static final SubLObject $const37$englishGloss;
  private static final SubLSymbol $sym38$SHOW_PROOF_VIEW_STORY_SECTION;
  private static final SubLSymbol $sym39$HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE;
  private static final SubLSymbol $sym40$HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE;
  private static final SubLSymbol $sym41$HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH;
  private static final SubLSymbol $sym42$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE;
  private static final SubLString $str43$pf_object;
  private static final SubLString $str44$story_body;
  private static final SubLString $str45$entry;
  private static final SubLString $str46$story_paragraph;
  private static final SubLInteger $int47$25;
  private static final SubLString $str48$News_Troller;
  private static final SubLSymbol $sym49$TROLL_FOR_NEWS;
  private static final SubLSymbol $sym50$DIRECTORY_P;
  private static final SubLString $str51$cdolist;
  private static final SubLSymbol $kw52$INPUT;
  private static final SubLString $str53$Unable_to_open__S;
  private static final SubLSymbol $kw54$EOF;
  private static final SubLString $str55$Read_invalid_query_info__s;
  private static final SubLSymbol $sym56$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str57$aries;
  private static final SubLString $str58$scorpio;
  private static final SubLString $str59$libra;
  private static final SubLString $str60$__Evaluating_queries_in__S__;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$NEWS_TROLLER_QUERY_FORBIDDEN_TERM_;
  private static final SubLSymbol $kw63$BROWSABLE_;
  private static final SubLString $str64$__Got__D_answer__P_for__S__;
  private static final SubLInteger $int65$50;
  private static final SubLString $str66$__Evaluated__D_queries___;
  private static final SubLString $str67$Caught_error_running_promising_qu;
  private static final SubLSymbol $sym68$PPH_VAR_TYPING_CLAUSE_;
  private static final SubLSymbol $sym69$INVALID_FILE_NAME_CHAR;
  private static final SubLString $str70$_;
  private static final SubLString $str71$_xml;
  private static final SubLString $str72$UTF_8;
  private static final SubLString $str73$__xml_stylesheet_type__text_xsl__;
  private static final SubLString $str74$_cyc_projects_shell_DreamCatcherP;
  private static final SubLInteger $int75$1000;
  private static final SubLString $str76$proof_view_news;
  private static final SubLString $str77$Generated_news_story__D_character;
  private static final SubLSymbol $kw78$OUTPUT;
  private static final SubLString $str79$_xml_news_xsl;

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 818L)
  public static SubLObject headline_for_proof_conclusion(final SubLObject proof_conclusion)
  {
    return cycl_string.cycl_string_to_utf8_string( pph_headline.generate_english_headline_string( proof_conclusion, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 1152L)
  public static SubLObject proof_view_add_story_section(final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject story_root_entry = proof_view_populator.proof_view_add_section_root( v_proof_view, $proof_view_story_label$.getDynamicValue( thread ) );
    final SubLObject item_var = $proof_view_story_label$.getDynamicValue( thread );
    if( NIL == conses_high.member( item_var, proof_view.$proof_view_tab_entry_labels$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      proof_view.$proof_view_tab_entry_labels$.setDynamicValue( ConsesLow.cons( item_var, proof_view.$proof_view_tab_entry_labels$.getDynamicValue( thread ) ), thread );
    }
    proof_view_build_story_section( story_root_entry );
    proof_view_populator.proof_view_entry_note_expand_initially( story_root_entry );
    if( NIL != list_utilities.lengthG( proof_view.proof_view_entry_get_children( story_root_entry ), ONE_INTEGER, UNPROVIDED ) )
    {
      proof_view.proof_view_set_property( v_proof_view, $kw1$STORY_ROOT, story_root_entry );
    }
    else
    {
      proof_view_populator.proof_view_remove_entry( v_proof_view, story_root_entry );
    }
    return story_root_entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 1795L)
  public static SubLObject proof_view_get_story_root_entry(final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject root_entry = proof_view.proof_view_get_root_entry( v_proof_view );
    SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children( root_entry );
    SubLObject child_entry = NIL;
    child_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( proof_view.proof_view_entry_get_label( child_entry ).equal( $proof_view_story_label$.getDynamicValue( thread ) ) )
      {
        return child_entry;
      }
      cdolist_list_var = cdolist_list_var.rest();
      child_entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 2113L)
  public static SubLObject proof_view_build_story_section(final SubLObject story_root_entry)
  {
    final SubLObject headline_entry = maybe_add_proof_view_headline( story_root_entry );
    maybe_add_proof_view_subheadline( story_root_entry, headline_entry );
    final SubLObject lede_content = maybe_add_proof_view_lede( story_root_entry );
    maybe_add_proof_view_story_significance( story_root_entry );
    maybe_add_proof_view_story_actors_brief_background( story_root_entry, lede_content );
    maybe_add_proof_view_story_details( story_root_entry );
    return story_root_entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 2631L)
  public static SubLObject maybe_add_proof_view_headline(final SubLObject story_root_entry)
  {
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( story_root_entry );
    final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion( proof_view.proof_view_get_proof( v_proof_view ), UNPROVIDED );
    final SubLObject headline_content = proof_view_headline_content( proof_conclusion, v_proof_view );
    return proof_view_populator.proof_view_add_new_entry( v_proof_view, $str5$, story_root_entry, $kw6$HEADLINE, headline_content, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 3033L)
  public static SubLObject proof_view_headline_content(final SubLObject proof_conclusion, SubLObject v_proof_view)
  {
    if( v_proof_view == UNPROVIDED )
    {
      v_proof_view = NIL;
    }
    if( NIL != el_utilities.el_conjunction_p( proof_conclusion ) )
    {
      SubLObject best_conjunct = NIL;
      SubLObject best_conjunct_score = ZERO_INTEGER;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( proof_conclusion, $kw7$IGNORE );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject best_score = proof_view_headline_conjunct_score( conjunct );
        if( best_score.numG( best_conjunct_score ) )
        {
          best_conjunct = conjunct;
          best_conjunct_score = best_score;
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      return best_conjunct;
    }
    return proof_conclusion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 3601L)
  public static SubLObject proof_view_headline_conjunct_score(final SubLObject conjunct)
  {
    if( NIL != pph_utilities.pph_var_typing_predicateP( cycl_utilities.formula_arg0( conjunct ), UNPROVIDED ) )
    {
      return ONE_INTEGER;
    }
    return proof_view_sentence_meaninginess( conjunct, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 3853L)
  public static SubLObject proof_view_sentence_meaninginess_internal(final SubLObject sentence, SubLObject irrelevance_context, SubLObject triviality_context)
  {
    if( irrelevance_context == UNPROVIDED )
    {
      irrelevance_context = pph_proof.pph_irrelevance_check_mt();
    }
    if( triviality_context == UNPROVIDED )
    {
      triviality_context = pph_proof.pph_triviality_check_mt();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best_score = ZERO_INTEGER;
    if( NIL != pph_proof.pph_trivial_sentenceP( sentence, triviality_context ) )
    {
      if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str9$_S_is_trivial_in__S, sentence, triviality_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL != pph_proof.pph_irrelevant_formulaP( sentence, NIL, irrelevance_context ) )
    {
      if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str10$_S_is_irrelevant_in__S, sentence, irrelevance_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw7$IGNORE );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject term_score = string_relevant_assertions.term_meaninginess( v_term );
        if( term_score.numG( best_score ) )
        {
          best_score = term_score;
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    return best_score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 3853L)
  public static SubLObject proof_view_sentence_meaninginess(final SubLObject sentence, SubLObject irrelevance_context, SubLObject triviality_context)
  {
    if( irrelevance_context == UNPROVIDED )
    {
      irrelevance_context = pph_proof.pph_irrelevance_check_mt();
    }
    if( triviality_context == UNPROVIDED )
    {
      triviality_context = pph_proof.pph_triviality_check_mt();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_sentence_meaninginess_internal( sentence, irrelevance_context, triviality_context );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( sentence, irrelevance_context, triviality_context );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( irrelevance_context.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && triviality_context.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_sentence_meaninginess_internal( sentence, irrelevance_context, triviality_context ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, irrelevance_context, triviality_context ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 4612L)
  public static SubLObject maybe_add_proof_view_subheadline(final SubLObject story_root_entry, final SubLObject headline_entry)
  {
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( story_root_entry );
    final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion( proof_view.proof_view_get_proof( v_proof_view ), UNPROVIDED );
    final SubLObject headline_content = proof_view.proof_view_entry_get_object( headline_entry );
    final SubLObject subheadline_content = proof_view_subheadline_content( proof_conclusion, headline_content, v_proof_view );
    return ( NIL != subheadline_content ) ? proof_view_populator.proof_view_add_new_entry( v_proof_view, $str5$, story_root_entry, $kw11$SUBHEADLINE, subheadline_content, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 5161L)
  public static SubLObject proof_view_subheadline_content(final SubLObject proof_conclusion, final SubLObject headline_content, final SubLObject v_proof_view)
  {
    if( NIL != el_utilities.el_conjunction_p( proof_conclusion ) )
    {
      final SubLObject conjuncts_to_keep = Sequences.remove( headline_content, cycl_utilities.formula_args( proof_conclusion, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
      return ( NIL != conjuncts_to_keep ) ? ( ( NIL != list_utilities.singletonP( conjuncts_to_keep ) ) ? list_utilities.only_one( conjuncts_to_keep ) : simplifier.conjoin( conjuncts_to_keep, UNPROVIDED ) ) : NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 5592L)
  public static SubLObject maybe_add_proof_view_lede(final SubLObject story_root_entry)
  {
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( story_root_entry );
    final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion( proof_view.proof_view_get_proof( v_proof_view ), UNPROVIDED );
    final SubLObject justification_entry = proof_view.proof_view_get_property( v_proof_view, $kw12$JUSTIFICATION_ROOT, UNPROVIDED );
    final SubLObject top_level_proof = proof_view.proof_view_get_proof( v_proof_view );
    final SubLObject top_level_rule = pph_proof.pph_real_or_quasi_transformation_proof_rule( top_level_proof );
    final SubLObject top_level_rule_trivialP = pph_proof.pph_trivial_assertionP( top_level_rule, UNPROVIDED );
    final SubLObject lede_content = ( NIL != proof_conclusion ) ? proof_view_lede_content( proof_conclusion, v_proof_view ) : NIL;
    if( NIL != lede_content )
    {
      proof_view_add_story_paragraph( story_root_entry, lede_content );
    }
    return lede_content;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 6305L)
  public static SubLObject proof_view_lede_content(final SubLObject proof_conclusion, final SubLObject v_proof_view)
  {
    return proof_conclusion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 6467L)
  public static SubLObject maybe_add_proof_view_story_significance(final SubLObject story_root_entry)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 6584L)
  public static SubLObject maybe_add_proof_view_story_actors_brief_background(final SubLObject story_root_entry, final SubLObject lede_content)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject main_actors = cycl_utilities.expression_gather( lede_content, $sym13$THCL_FORT_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( story_root_entry );
    final SubLObject domain_mt = proof_view.proof_view_get_domain_mt( v_proof_view );
    final SubLObject seen_sentences = proof_view_get_seen_story_sentences( v_proof_view );
    final SubLObject unincluded_facts = queues.create_queue( UNPROVIDED );
    if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
    {
      format_nil.force_format( T, $str14$__Main_actors___S__, main_actors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject local_state;
    final SubLObject state = local_state = proof_view.find_proof_view_memoization_state( proof_view.proof_view_entry_get_proof_view( story_root_entry ) );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject cdolist_list_var = main_actors;
        SubLObject actor = NIL;
        actor = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject key_facts = Sequences.remove( ZERO_INTEGER, fact_sheets.thcl_sentences_for_term_fact_sheet( actor, domain_mt ), $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED );
          SubLObject actor_facts = NIL;
          if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str15$__Found__D_background_facts_for__, Sequences.length( key_facts ), actor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          while ( NIL == list_utilities.lengthGE( actor_facts, THREE_INTEGER, UNPROVIDED ) && NIL == list_utilities.empty_list_p( key_facts ))
          {
            final SubLObject fact = list_utilities.extremal( key_facts, Symbols.symbol_function( $sym16$_ ), $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS );
            if( NIL != set.set_add( proof_view_summary.proof_view_summary_item_sentence( fact ), seen_sentences ) && NIL != fact_okay_for_proof_view_actor_brief_backgroundP( fact ) )
            {
              final SubLObject last_fact = list_utilities.last_one( queues.queue_elements( unincluded_facts ) );
              if( NIL == queues.queue_empty_p( unincluded_facts ) && NIL == proof_view_story_fact_coheres_with_last_factP( fact, last_fact ) )
              {
                proof_add_unincluded_story_facts_paragraph( story_root_entry, unincluded_facts );
              }
              proof_view_maybe_enqueue_unincluded_fact( v_proof_view, fact, unincluded_facts );
              actor_facts = ConsesLow.cons( fact, actor_facts );
            }
            key_facts = Sequences.remove( fact, key_facts, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          proof_add_unincluded_story_facts_paragraph( story_root_entry, unincluded_facts );
          cdolist_list_var = cdolist_list_var.rest();
          actor = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 8231L)
  public static SubLObject proof_view_maybe_enqueue_unincluded_fact(final SubLObject v_proof_view, final SubLObject fact, final SubLObject queue)
  {
    if( NIL == subl_promotions.memberP( proof_view.proof_view_fact_sentence( fact ), proof_view_get_story_sentences_so_far( v_proof_view ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      queues.enqueue( fact, queue );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 8468L)
  public static SubLObject fact_okay_for_proof_view_actor_brief_backgroundP(final SubLObject fact)
  {
    if( NIL != Sequences.find_if( $sym17$UNLEXIFIED_, cycl_utilities.expression_gather( fact, $sym18$FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.warn( $str19$Unlexified_FORT__S___in__S, Sequences.find_if( $sym17$UNLEXIFIED_, cycl_utilities.expression_gather( fact, $sym18$FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
          UNPROVIDED, UNPROVIDED ), fact );
      return NIL;
    }
    if( NIL != pph_proof.sentence_trivial_for_justification_paraphraseP( fact, UNPROVIDED ) )
    {
      Errors.warn( $str20$Trivial_fact__S, fact );
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 8854L)
  public static SubLObject proof_view_get_seen_story_sentences(final SubLObject v_proof_view)
  {
    SubLObject ans = proof_view.proof_view_get_property( v_proof_view, $kw21$SEEN_STORY_SENTENCES, misc_utilities.uninitialized() );
    if( NIL != misc_utilities.uninitialized_p( ans ) )
    {
      ans = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
      proof_view.proof_view_set_property( v_proof_view, $kw21$SEEN_STORY_SENTENCES, ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 9166L)
  public static SubLObject maybe_add_proof_view_story_details(final SubLObject story_root_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( story_root_entry );
    final SubLObject justification_entry = proof_view.proof_view_get_property( v_proof_view, $kw12$JUSTIFICATION_ROOT, UNPROVIDED );
    final SubLObject summary_entry = proof_view.proof_view_get_property( v_proof_view, $kw22$SUMMARY_ROOT, UNPROVIDED );
    final SubLObject detailed_entries_to_include = detailed_entry_gather_story_entries( justification_entry, UNPROVIDED, UNPROVIDED );
    final SubLObject seen_sentences = proof_view_get_seen_story_sentences( v_proof_view );
    final SubLObject enoughP = NIL;
    final SubLObject unincluded_facts = queues.create_queue( UNPROVIDED );
    if( NIL != summary_entry )
    {
      set_utilities.set_add_all( proof_view.proof_view_entry_get_children( summary_entry ), detailed_entries_to_include );
    }
    final SubLObject local_state;
    final SubLObject state = local_state = proof_view.find_proof_view_memoization_state( v_proof_view );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        while ( NIL == enoughP && NIL == set.empty_set_p( detailed_entries_to_include ))
        {
          final SubLObject last_fact = ( NIL != queues.queue_empty_p( unincluded_facts ) ) ? list_utilities.last_one( proof_view_get_story_sentences_so_far( proof_view.proof_view_entry_get_proof_view( set_utilities
              .set_arbitrary_element_without_values( detailed_entries_to_include, UNPROVIDED ) ) ) ) : list_utilities.last_one( queues.queue_elements( unincluded_facts ) );
          SubLObject fact = choose_next_proof_view_story_detail( detailed_entries_to_include, unincluded_facts );
          if( NIL != set.set_add( proof_view_summary.proof_view_summary_item_sentence( fact ), seen_sentences ) )
          {
            if( NIL != arguments.hl_support_p( fact ) )
            {
              fact = arguments.support_sentence( fact );
            }
            if( NIL == queues.queue_empty_p( unincluded_facts ) && NIL == proof_view_story_fact_coheres_with_last_factP( fact, last_fact ) )
            {
              proof_add_unincluded_story_facts_paragraph( story_root_entry, unincluded_facts );
            }
            proof_view_maybe_enqueue_unincluded_fact( v_proof_view, fact, unincluded_facts );
            if( NIL == proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
            {
              continue;
            }
            format_nil.force_format( T, $str23$__Current_paragraph_now_has__S_se, queues.queue_size( unincluded_facts ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    proof_add_unincluded_story_facts_paragraph( story_root_entry, unincluded_facts );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 11023L)
  public static SubLObject choose_next_proof_view_story_detail(final SubLObject detailed_entries_to_include, final SubLObject unincluded_facts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != set.set_p( detailed_entries_to_include ) : detailed_entries_to_include;
    final SubLObject sentences_so_far = proof_view_get_story_sentences_so_far( proof_view.proof_view_entry_get_proof_view( set_utilities.set_arbitrary_element_without_values( detailed_entries_to_include,
        UNPROVIDED ) ) );
    final SubLObject _prev_bind_0 = $proof_view_news_detail_last_sentence$.currentBinding( thread );
    try
    {
      $proof_view_news_detail_last_sentence$.bind( ( NIL != queues.queue_empty_p( unincluded_facts ) ) ? list_utilities.last_one( sentences_so_far ) : list_utilities.last_one( queues.queue_elements( unincluded_facts ) ),
          thread );
      final SubLObject best_entry = list_utilities.extremal( set.set_element_list( detailed_entries_to_include ), Symbols.symbol_function( $sym16$_ ), $sym25$PROOF_VIEW_STORY_DETAIL_SCORE );
      set.set_remove( best_entry, detailed_entries_to_include );
      return proof_view.proof_view_entry_get_object( best_entry );
    }
    finally
    {
      $proof_view_news_detail_last_sentence$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 11753L)
  public static SubLObject proof_view_story_detail_score(final SubLObject entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject last_sentence = $proof_view_news_detail_last_sentence$.getDynamicValue( thread );
    final SubLObject fact = proof_view.proof_view_entry_get_object( entry );
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( entry );
    final SubLObject justification_entry = proof_view.proof_view_get_property( v_proof_view, $kw12$JUSTIFICATION_ROOT, UNPROVIDED );
    final SubLObject root_depth = proof_view.proof_view_entry_get_depth( justification_entry );
    final SubLObject depth = Numbers.subtract( proof_view.proof_view_entry_get_depth( entry ), root_depth );
    return proof_view_story_detail_score_wrt_last_sentence( fact, last_sentence, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12265L)
  public static SubLObject proof_view_story_detail_score_wrt_last_sentence_internal(final SubLObject fact, final SubLObject last_sentence, final SubLObject depth)
  {
    final SubLObject coherence = Sequences.length( conses_high.intersection( proof_view_story_fact_terms( fact ), proof_view_story_fact_terms( last_sentence ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    final SubLObject meaninginess = proof_view_sentence_meaninginess( fact, UNPROVIDED, UNPROVIDED );
    return compute_proof_view_story_detail_score( coherence, meaninginess, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12265L)
  public static SubLObject proof_view_story_detail_score_wrt_last_sentence(final SubLObject fact, final SubLObject last_sentence, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_story_detail_score_wrt_last_sentence_internal( fact, last_sentence, depth );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE, THREE_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( fact, last_sentence, depth );
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
        if( fact.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( last_sentence.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && depth.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_story_detail_score_wrt_last_sentence_internal( fact, last_sentence, depth ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( fact, last_sentence, depth ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12862L)
  public static SubLObject compute_proof_view_story_detail_score(final SubLObject coherence, final SubLObject meaninginess, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.add( Numbers.multiply( $proof_view_story_coherence_weight$.getDynamicValue( thread ), coherence ), Numbers.multiply( $proof_view_story_meaninginess_weight$.getDynamicValue( thread ), meaninginess ),
        Numbers.multiply( $proof_view_story_depth_weight$.getDynamicValue( thread ), Numbers.divide( ONE_INTEGER, depth ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 13121L)
  public static SubLObject sort_proof_view_story_details(final SubLObject entries)
  {
    final SubLObject v_proof_view = ( NIL != set.set_emptyP( entries ) ) ? NIL : proof_view.proof_view_entry_get_proof_view( set_utilities.set_arbitrary_element_without_values( entries, UNPROVIDED ) );
    return ( NIL != v_proof_view ) ? Sequences.nreverse( proof_view_populator.proof_view_sort_entries_to_maximize_coherence( v_proof_view, proof_view.proof_view_get_domain_mt( v_proof_view ), set.set_element_list(
        entries ) ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 13593L)
  public static SubLObject proof_view_get_story_sentences_so_far(final SubLObject v_proof_view)
  {
    return proof_view.proof_view_get_property( v_proof_view, $kw31$STORY_SENTENCES_SO_FAR, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 13734L)
  public static SubLObject proof_view_add_story_sentence(final SubLObject v_proof_view, final SubLObject sentence)
  {
    return proof_view.proof_view_set_property( v_proof_view, $kw31$STORY_SENTENCES_SO_FAR, list_utilities.add_to_end( proof_view.proof_view_fact_sentence( sentence ), proof_view_get_story_sentences_so_far(
        v_proof_view ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 13981L)
  public static SubLObject proof_add_unincluded_story_facts_paragraph(final SubLObject story_root_entry, final SubLObject unincluded_facts)
  {
    if( NIL != queues.queue_empty_p( unincluded_facts ) )
    {
      return NIL;
    }
    final SubLObject facts = queues.dequeue_all( unincluded_facts );
    final SubLObject content = ( NIL != list_utilities.singletonP( facts ) ) ? list_utilities.only_one( facts ) : simplifier.conjoin( facts, UNPROVIDED );
    return proof_view_add_story_paragraph( story_root_entry, content );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 14323L)
  public static SubLObject proof_view_add_story_paragraph(final SubLObject story_root_entry, final SubLObject content)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( story_root_entry );
    final SubLObject _prev_bind_0 = proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.currentBinding( thread );
    try
    {
      proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.bind( T, thread );
      final SubLObject story_paragraph_entry = proof_view_populator.proof_view_add_new_entry( v_proof_view, $str5$, story_root_entry, $kw32$STORY_PARAGRAPH, content, UNPROVIDED );
      SubLObject cdolist_list_var = ( NIL != el_utilities.el_conjunction_p( content ) ) ? cycl_utilities.formula_args( content, UNPROVIDED ) : ConsesLow.list( content );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        proof_view_add_story_sentence( v_proof_view, conjunct );
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      return story_paragraph_entry;
    }
    finally
    {
      proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 14825L)
  public static SubLObject proof_view_story_fact_coheres_with_last_factP(final SubLObject fact, final SubLObject last_fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != proof_view_story_fact_requires_own_paragraphP( fact ) )
    {
      return NIL;
    }
    if( NIL != list_utilities.non_empty_list_p( conses_high.intersection( proof_view_story_fact_terms( fact ), proof_view_story_fact_terms( last_fact ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) )
    {
      if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str33$_S___coheres_with__S, fact, last_fact, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 15208L)
  public static SubLObject proof_view_story_fact_terms(final SubLObject fact)
  {
    return list_utilities.find_all_if( $sym34$CYCL_DENOTATIONAL_TERM_P, cycl_utilities.formula_args( fact, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 15329L)
  public static SubLObject proof_view_story_fact_requires_own_paragraphP(final SubLObject fact)
  {
    if( NIL != el_utilities.el_conjunction_p( fact ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 15531L)
  public static SubLObject detailed_entry_gather_story_entries(final SubLObject detailed_entry, SubLObject entries, SubLObject depth)
  {
    if( entries == UNPROVIDED )
    {
      entries = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    }
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( depth.numGE( $proof_view_story_section_max_depth$.getDynamicValue( thread ) ) )
    {
      if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        Errors.warn( $str35$Reached_story_depth_cutoff_of__D_, $proof_view_story_section_max_depth$.getDynamicValue( thread ), proof_view.proof_view_entry_get_object( detailed_entry ) );
      }
    }
    else
    {
      SubLObject cdolist_list_var;
      final SubLObject children = cdolist_list_var = proof_view.proof_view_entry_get_children( detailed_entry );
      SubLObject child = NIL;
      child = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set_utilities.set_add_set( detailed_entry_gather_story_entries( child, entries, number_utilities.f_1X( depth ) ), entries );
        cdolist_list_var = cdolist_list_var.rest();
        child = cdolist_list_var.first();
      }
      if( NIL != proof_view_story_include_detailed_entryP( detailed_entry ) )
      {
        SubLObject child_missingP = NIL;
        if( NIL == child_missingP )
        {
          SubLObject csome_list_var = children;
          SubLObject child2 = NIL;
          child2 = csome_list_var.first();
          while ( NIL == child_missingP && NIL != csome_list_var)
          {
            if( NIL == set.set_memberP( child2, entries ) )
            {
              child_missingP = T;
            }
            csome_list_var = csome_list_var.rest();
            child2 = csome_list_var.first();
          }
        }
        if( NIL != list_utilities.empty_list_p( children ) || NIL != child_missingP )
        {
          set.set_add( detailed_entry, entries );
        }
      }
    }
    return entries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 16578L)
  public static SubLObject proof_view_story_include_detailed_entryP(final SubLObject detailed_entry)
  {
    if( NIL != subl_promotions.memberP( proof_view.proof_view_entry_get_object_type( detailed_entry ), $list36, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != pph_proof.sentence_trivial_for_justification_paraphraseP( proof_view.proof_view_entry_get_object( detailed_entry ), UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != proof_view_story_include_detailed_entry_objectP( proof_view.proof_view_entry_get_object( detailed_entry ), proof_view.proof_view_entry_get_proof_view( detailed_entry ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 17077L)
  public static SubLObject proof_view_story_include_detailed_entry_objectP(final SubLObject v_object, final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.rule_assertionP( v_object ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( proof_view.proof_view_get_language_mt( v_proof_view ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        return kb_mapping_utilities.some_pred_value_in_relevant_mts( v_object, $const37$englishGloss, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return cycl_grammar.cycl_sentence_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 17805L)
  public static SubLObject show_proof_view_story_section(final SubLObject root, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( root );
    if( !root.eql( proof_view.proof_view_get_property( v_proof_view, $kw1$STORY_ROOT, UNPROVIDED ) ) )
    {
      return NIL;
    }
    final SubLObject children = proof_view.proof_view_entry_get_children( root );
    final SubLObject headline_entry = Sequences.find( $kw6$HEADLINE, children, Symbols.symbol_function( EQL ), $sym42$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE, UNPROVIDED, UNPROVIDED );
    final SubLObject include_cyclP = proof_view.proof_view_get_include_cycl_in_outputP( v_proof_view );
    if( NIL != headline_entry )
    {
      html_utilities.html_markup( proof_view.proof_view_entry_generate_html( headline_entry ) );
      if( NIL != include_cyclP )
      {
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str43$pf_object );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject v_object = proof_view.proof_view_entry_get_object( headline_entry );
          pph_proof.show_proof_view_object( v_object, headline_entry, ZERO_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      }
    }
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str44$story_body );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject cdolist_list_var = Sequences.remove( headline_entry, children, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject child = NIL;
      child = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str45$entry );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str46$story_paragraph );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( proof_view.proof_view_entry_generate_html( child ) );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
          }
          html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          if( NIL != include_cyclP )
          {
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str43$pf_object );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              final SubLObject v_object2 = proof_view.proof_view_entry_get_object( child );
              pph_proof.show_proof_view_object( v_object2, child, ZERO_INTEGER );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
        }
        html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
        cdolist_list_var = cdolist_list_var.rest();
        child = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19039L)
  public static SubLObject html_output_proof_view_story_headline(final SubLObject v_proof_view, final SubLObject v_object, SubLObject allow_external_linksP)
  {
    if( allow_external_linksP == UNPROVIDED )
    {
      allow_external_linksP = NIL;
    }
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( ONE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    pph_proof.pph_show_sentence( v_object, pph_headline.generate_english_headline_string( v_object, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( ONE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19289L)
  public static SubLObject html_output_proof_view_story_subheadline(final SubLObject v_proof_view, final SubLObject v_object, SubLObject allow_external_linksP)
  {
    if( allow_external_linksP == UNPROVIDED )
    {
      allow_external_linksP = NIL;
    }
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    pph_proof.pph_show_sentence( v_object, pph_headline.generate_english_headline_string( v_object, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19539L)
  public static SubLObject html_output_proof_view_story_paragraph(final SubLObject v_proof_view, final SubLObject v_object, SubLObject allow_external_linksP)
  {
    if( allow_external_linksP == UNPROVIDED )
    {
      allow_external_linksP = NIL;
    }
    pph_proof.pph_show_sentence( v_object, UNPROVIDED, UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19924L)
  public static SubLObject launch_news_troller_daemon()
  {
    $news_troller_daemon_abortP$.setGlobalValue( NIL );
    return process_utilities.make_cyc_server_process( $str48$News_Troller, $sym49$TROLL_FOR_NEWS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 20072L)
  public static SubLObject halt_news_troller_daemon()
  {
    $news_troller_daemon_abortP$.setGlobalValue( T );
    return $news_troller_daemon_abortP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 20188L)
  public static SubLObject troll_for_news(SubLObject keepalive_filename, SubLObject done_queries)
  {
    if( keepalive_filename == UNPROVIDED )
    {
      keepalive_filename = NIL;
    }
    if( done_queries == UNPROVIDED )
    {
      done_queries = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject last_file = NIL;
    SubLObject skip_fileP = NIL;
    SubLObject abortP = $news_troller_daemon_abortP$.getGlobalValue();
    final SubLObject new_kbqs = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        while ( NIL == abortP)
        {
          final SubLObject _prev_bind_0_$7 = Errors.$ignore_warnsP$.currentBinding( thread );
          try
          {
            Errors.$ignore_warnsP$.bind( T, thread );
            assert NIL != Filesys.directory_p( transcript_utilities.transcript_directory() ) : transcript_utilities.transcript_directory();
            SubLObject directory_contents_var = Filesys.directory( transcript_utilities.transcript_directory(), T );
            final SubLObject progress_message_var = NIL;
            final SubLObject _prev_bind_0_$8 = utilities_macros.$silent_progressP$.currentBinding( thread );
            try
            {
              utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
              if( NIL.isFunctionSpec() )
              {
                directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
              }
              final SubLObject list_var = directory_contents_var;
              final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_note$.currentBinding( thread );
              final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
              final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
              final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
              final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
              final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
              final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
              final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
              try
              {
                utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str51$cdolist, thread );
                utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
                utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
                utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
                utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                try
                {
                  utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
                  if( NIL == abortP )
                  {
                    SubLObject csome_list_var = list_var;
                    SubLObject current_file = NIL;
                    current_file = csome_list_var.first();
                    while ( NIL == abortP && NIL != csome_list_var)
                    {
                      if( NIL != inference_analysis.asked_queries_filenameP( current_file ) )
                      {
                        SubLObject done_varP = NIL;
                        SubLObject i = ZERO_INTEGER;
                        SubLObject stream = NIL;
                        try
                        {
                          final SubLObject _prev_bind_0_$10 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                          try
                          {
                            stream_macros.$stream_requires_locking$.bind( NIL, thread );
                            stream = compatibility.open_binary( current_file, $kw52$INPUT );
                          }
                          finally
                          {
                            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$10, thread );
                          }
                          if( !stream.isStream() )
                          {
                            Errors.error( $str53$Unable_to_open__S, current_file );
                          }
                          final SubLObject input_stream = stream;
                          final SubLObject _prev_bind_0_$11 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
                          try
                          {
                            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
                            cfasl.cfasl_set_common_symbols( inference_analysis.asked_query_common_symbols() );
                            while ( NIL == done_varP)
                            {
                              final SubLObject query_info = inference_analysis.load_asked_query_from_stream( input_stream );
                              if( $kw54$EOF == query_info )
                              {
                                done_varP = T;
                              }
                              else if( query_info.isString() )
                              {
                                Errors.warn( $str55$Read_invalid_query_info__s, query_info );
                              }
                              else
                              {
                                final SubLObject _prev_bind_0_$12 = Errors.$ignore_warnsP$.currentBinding( thread );
                                try
                                {
                                  Errors.$ignore_warnsP$.bind( NIL, thread );
                                  SubLObject err_msg = NIL;
                                  try
                                  {
                                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                                    final SubLObject _prev_bind_0_$13 = Errors.$error_handler$.currentBinding( thread );
                                    try
                                    {
                                      Errors.$error_handler$.bind( $sym56$CATCH_ERROR_MESSAGE_HANDLER, thread );
                                      try
                                      {
                                        if( !current_file.equal( last_file ) )
                                        {
                                          last_file = current_file;
                                          skip_fileP = makeBoolean( NIL != string_utilities.substringP( $str57$aries, current_file, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != string_utilities.substringP(
                                              $str58$scorpio, current_file, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != string_utilities.substringP( $str59$libra, current_file, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                                          if( NIL == skip_fileP && NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
                                          {
                                            format_nil.force_format( T, $str60$__Evaluating_queries_in__S__, current_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                          }
                                        }
                                        if( NIL == skip_fileP && NIL != list_utilities.proper_list_p( query_info ) && NIL != list_utilities.lengthE( query_info, THREE_INTEGER, UNPROVIDED ) )
                                        {
                                          SubLObject current;
                                          final SubLObject datum = current = query_info;
                                          SubLObject sentence = NIL;
                                          SubLObject mt = NIL;
                                          SubLObject query_properties = NIL;
                                          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
                                          sentence = current.first();
                                          current = current.rest();
                                          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
                                          mt = current.first();
                                          current = current.rest();
                                          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
                                          query_properties = current.first();
                                          current = current.rest();
                                          if( NIL == current )
                                          {
                                            if( !random.random( $promising_news_query_sample_rate$.getGlobalValue() ).isPositive() && NIL == set.set_memberP( query_info, done_queries )
                                                && NIL != inference_datastructures_enumerated_types.problem_store_properties_compute_answer_justificationsP( query_properties ) && NIL == list_utilities.tree_find_if(
                                                    $sym62$NEWS_TROLLER_QUERY_FORBIDDEN_TERM_, query_info, UNPROVIDED ) && NIL == query_sentence_has_no_obvious_headlineP( sentence ) )
                                            {
                                              query_properties = conses_high.putf( query_properties, $kw63$BROWSABLE_, T );
                                              SubLObject inference = NIL;
                                              SubLObject time = NIL;
                                              try
                                              {
                                                final SubLObject time_var = Time.get_internal_real_time();
                                                inference = Values.nth_value_step_2( Values.nth_value_step_1( TWO_INTEGER ), inference_kernel.new_cyc_query( sentence, mt, query_properties ) );
                                                time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                                                final SubLObject answer_count = inference_datastructures_inference.inference_answer_count( inference );
                                                final SubLObject num_to_try = Numbers.min( FIVE_INTEGER, Numbers.max( ONE_INTEGER, Numbers.integerDivide( answer_count, $promising_news_query_sample_rate$
                                                    .getGlobalValue() ) ) );
                                                if( answer_count.isPositive() && time.numG( ONE_INTEGER ) )
                                                {
                                                  if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
                                                  {
                                                    format_nil.force_format( T, $str64$__Got__D_answer__P_for__S__, answer_count, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                  }
                                                  SubLObject cdolist_list_var = list_utilities.random_n( num_to_try, inference_datastructures_inference.inference_all_answers( inference, UNPROVIDED ) );
                                                  SubLObject v_answer = NIL;
                                                  v_answer = cdolist_list_var.first();
                                                  while ( NIL != cdolist_list_var)
                                                  {
                                                    if( NIL == abortP )
                                                    {
                                                      maybe_output_news_story( v_answer );
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    v_answer = cdolist_list_var.first();
                                                  }
                                                }
                                              }
                                              finally
                                              {
                                                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                try
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                  final SubLObject _values = Values.getValuesAsVector();
                                                  set.set_add( query_info, done_queries );
                                                  if( ZERO_INTEGER.eql( Numbers.mod( set.set_size( done_queries ), $int65$50 ) ) && NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
                                                  {
                                                    format_nil.force_format( T, $str66$__Evaluated__D_queries___, set.set_size( done_queries ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                                                        UNPROVIDED );
                                                  }
                                                  inference_datastructures_inference.destroy_inference_and_problem_store( inference );
                                                  Values.restoreValuesFromVector( _values );
                                                }
                                                finally
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
                                                }
                                              }
                                            }
                                          }
                                          else
                                          {
                                            cdestructuring_bind.cdestructuring_bind_error( datum, $list61 );
                                          }
                                        }
                                      }
                                      catch( final Throwable catch_var )
                                      {
                                        Errors.handleThrowable( catch_var, NIL );
                                      }
                                    }
                                    finally
                                    {
                                      Errors.$error_handler$.rebind( _prev_bind_0_$13, thread );
                                    }
                                  }
                                  catch( final Throwable ccatch_env_var )
                                  {
                                    err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                                  }
                                  finally
                                  {
                                    thread.throwStack.pop();
                                  }
                                  if( NIL != err_msg )
                                  {
                                    Errors.warn( $str67$Caught_error_running_promising_qu, current_file, err_msg );
                                  }
                                }
                                finally
                                {
                                  Errors.$ignore_warnsP$.rebind( _prev_bind_0_$12, thread );
                                }
                                if( NIL != $news_troller_daemon_abortP$.getGlobalValue() )
                                {
                                  abortP = T;
                                }
                                file_utilities.possibly_update_keepalive_file( keepalive_filename );
                                i = Numbers.add( i, ONE_INTEGER );
                              }
                              if( NIL != abortP )
                              {
                                done_varP = abortP;
                              }
                            }
                          }
                          finally
                          {
                            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0_$11, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if( stream.isStream() )
                            {
                              streams_high.close( stream, UNPROVIDED );
                            }
                            Values.restoreValuesFromVector( _values2 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
                          }
                        }
                      }
                      utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                      utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                      csome_list_var = csome_list_var.rest();
                      current_file = csome_list_var.first();
                    }
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
                  }
                }
              }
              finally
              {
                utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
                utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
                utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
                utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
                utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
                utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
                utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
                utilities_macros.$progress_note$.rebind( _prev_bind_0_$9, thread );
              }
            }
            finally
            {
              utilities_macros.$silent_progressP$.rebind( _prev_bind_0_$8, thread );
            }
          }
          finally
          {
            Errors.$ignore_warnsP$.rebind( _prev_bind_0_$7, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values4 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values4 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return new_kbqs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 22883L)
  public static SubLObject query_sentence_has_no_obvious_headlineP(final SubLObject sentence)
  {
    if( NIL != el_utilities.el_conjunction_p( sentence ) )
    {
      final SubLObject badP = makeBoolean( NIL == list_utilities.singletonP( Sequences.remove_if( $sym68$PPH_VAR_TYPING_CLAUSE_, cycl_utilities.formula_args( sentence, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) ) );
      return badP;
    }
    if( NIL != el_utilities.el_existential_p( sentence ) )
    {
      return query_sentence_has_no_obvious_headlineP( cycl_utilities.formula_arg2( sentence, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 23310L)
  public static SubLObject news_troller_query_forbidden_termP(final SubLObject v_term)
  {
    if( NIL != narts_high.invalid_nartP( v_term, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != constant_handles.invalid_constantP( v_term, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 23481L)
  public static SubLObject filename_from_news_proof_view(final SubLObject v_proof_view, final SubLObject directory)
  {
    final SubLObject story_root = proof_view_get_story_root_entry( v_proof_view );
    final SubLObject headline_entry = proof_view.proof_view_entry_get_children( story_root ).first();
    final SubLObject headline = html_utilities.remove_html_tags( proof_view.proof_view_entry_generate_html( headline_entry ), UNPROVIDED );
    final SubLObject short_head = ( NIL != list_utilities.lengthL( headline, $int65$50, UNPROVIDED ) ) ? headline : string_utilities.substring( headline, ZERO_INTEGER, $int65$50 );
    final SubLObject clean_head = Strings.string_downcase( Sequences.remove_if( $sym69$INVALID_FILE_NAME_CHAR, short_head, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    return Sequences.cconcatenate( directory, new SubLObject[] { $str70$_, clean_head, $str71$_xml
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 23995L)
  public static SubLObject invalid_file_name_char(final SubLObject v_char)
  {
    if( v_char.eql( Characters.CHAR_space ) )
    {
      return T;
    }
    if( v_char.eql( Characters.CHAR_colon ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 24124L)
  public static SubLObject construct_news_story_proof_view(final SubLObject proof, final SubLObject v_answer, SubLObject debugP, SubLObject summary_algorithm)
  {
    if( debugP == UNPROVIDED )
    {
      debugP = proof_view.$proof_view_debugP$.getDynamicValue();
    }
    if( summary_algorithm == UNPROVIDED )
    {
      summary_algorithm = NIL;
    }
    final SubLObject v_proof_view = proof_view.get_new_empty_proof_view( UNPROVIDED, UNPROVIDED );
    proof_view.proof_view_set_proof( v_proof_view, proof );
    proof_view.proof_view_set_answer( v_proof_view, v_answer );
    proof_view.proof_view_set_include_rules_sectionP( v_proof_view, NIL );
    proof_view_linear.proof_view_set_include_linear_sectionP( v_proof_view, NIL );
    proof_view.proof_view_set_allow_external_linksP( v_proof_view, NIL );
    proof_view.proof_view_set_allow_internal_linksP( v_proof_view, NIL );
    proof_view_summary.proof_view_set_include_summary_sectionP( v_proof_view, NIL );
    proof_view.proof_view_set_include_justification_sectionP( v_proof_view, NIL );
    proof_view.proof_view_set_include_sourcesP( v_proof_view, T );
    proof_view_populator.proof_view_set_include_special_sectionP( v_proof_view, $kw3$STORY, T );
    proof_view.proof_view_set_allow_internal_linksP( v_proof_view, NIL );
    proof_view.proof_view_set_allow_external_linksP( v_proof_view, NIL );
    proof_view.proof_view_set_link_phrasesP( v_proof_view, NIL );
    proof_view.proof_view_set_include_silkP( v_proof_view, NIL );
    proof_view.proof_view_set_include_cycml_in_xmlP( v_proof_view, NIL );
    proof_view.proof_view_set_include_cycl_in_outputP( v_proof_view, T );
    proof_view.proof_view_set_enable_debugP( v_proof_view, debugP );
    if( NIL != summary_algorithm )
    {
      proof_view_summary.proof_view_set_summary_algorithm( v_proof_view, summary_algorithm );
    }
    proof_view_populator.proof_view_populate( v_proof_view, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 25420L)
  public static SubLObject output_proof_view_news_story(final SubLObject v_proof_view)
  {
    xml_utilities.xml_header( $float29$1_0, $str72$UTF_8, UNPROVIDED );
    xml_utilities.xml_write_string( $str73$__xml_stylesheet_type__text_xsl__, UNPROVIDED, UNPROVIDED );
    proof_view.output_proof_view_in_xml( v_proof_view, T );
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 25779L)
  public static SubLObject maybe_output_news_story(final SubLObject inference_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject proof = pph_proof.inference_answer_get_proofs( inference_answer ).first();
    final SubLObject _prev_bind_0 = proof_view.$proof_view_debugP$.currentBinding( thread );
    try
    {
      proof_view.$proof_view_debugP$.bind( NIL, thread );
      final SubLObject v_proof_view = construct_news_story_proof_view( proof, inference_answer, UNPROVIDED, UNPROVIDED );
      final SubLObject story_root = proof_view.proof_view_get_property( v_proof_view, $kw1$STORY_ROOT, NIL );
      final SubLObject para_count = number_utilities.f_1_( proof_view.proof_view_count_entries( story_root ) );
      SubLObject xml = NIL;
      if( para_count.numG( THREE_INTEGER ) )
      {
        try
        {
          SubLObject stream = NIL;
          try
          {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0_$18 = xml_vars.$xml_stream$.currentBinding( thread );
            try
            {
              xml_vars.$xml_stream$.bind( stream, thread );
              output_proof_view_news_story( v_proof_view );
            }
            finally
            {
              xml_vars.$xml_stream$.rebind( _prev_bind_0_$18, thread );
            }
            xml = streams_high.get_output_stream_string( stream );
          }
          finally
          {
            final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              streams_high.close( stream, UNPROVIDED );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
            }
          }
          final SubLObject demerits = proof_view.proof_view_entry_get_paraphrase_demerits( story_root, T );
          if( NIL != list_utilities.lengthGE( xml, $int75$1000, UNPROVIDED ) && para_count.numG( demerits ) )
          {
            final SubLObject directory = print_high.princ_to_string( file_utilities.make_directory_recursive( file_utilities.relative_filename( transcript_utilities.transcript_directory(), $str76$proof_view_news,
                UNPROVIDED ), UNPROVIDED, UNPROVIDED ) );
            final SubLObject filename = filename_from_news_proof_view( v_proof_view, directory );
            Errors.warn( $str77$Generated_news_story__D_character, new SubLObject[] { Sequences.length( xml ), para_count, demerits, inference_answer
            } );
            SubLObject stream_$20 = NIL;
            try
            {
              final SubLObject _prev_bind_0_$20 = stream_macros.$stream_requires_locking$.currentBinding( thread );
              try
              {
                stream_macros.$stream_requires_locking$.bind( NIL, thread );
                stream_$20 = compatibility.open_text( filename, $kw78$OUTPUT );
              }
              finally
              {
                stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$20, thread );
              }
              if( !stream_$20.isStream() )
              {
                Errors.error( $str53$Unable_to_open__S, filename );
              }
              final SubLObject stream_$21 = stream_$20;
              print_high.princ( xml, stream_$21 );
            }
            finally
            {
              final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( stream_$20.isStream() )
                {
                  streams_high.close( stream_$20, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
              }
            }
            final SubLObject xsl = Sequences.cconcatenate( directory, $str79$_xml_news_xsl );
            if( NIL == file_utilities.file_existsP( xsl ) )
            {
              file_utilities.create_symbolic_link( xsl, $proof_view_news_xsl_file$.getGlobalValue() );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            proof_view.destroy_proof_view( v_proof_view );
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
          }
        }
      }
      return xml;
    }
    finally
    {
      proof_view.$proof_view_debugP$.rebind( _prev_bind_0, thread );
    }
  }

  public static SubLObject declare_proof_view_news_file()
  {
    SubLFiles.declareFunction( me, "headline_for_proof_conclusion", "HEADLINE-FOR-PROOF-CONCLUSION", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_add_story_section", "PROOF-VIEW-ADD-STORY-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_story_root_entry", "PROOF-VIEW-GET-STORY-ROOT-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_build_story_section", "PROOF-VIEW-BUILD-STORY-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_add_proof_view_headline", "MAYBE-ADD-PROOF-VIEW-HEADLINE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_headline_content", "PROOF-VIEW-HEADLINE-CONTENT", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_view_headline_conjunct_score", "PROOF-VIEW-HEADLINE-CONJUNCT-SCORE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_sentence_meaninginess_internal", "PROOF-VIEW-SENTENCE-MEANINGINESS-INTERNAL", 1, 2, false );
    SubLFiles.declareFunction( me, "proof_view_sentence_meaninginess", "PROOF-VIEW-SENTENCE-MEANINGINESS", 1, 2, false );
    SubLFiles.declareFunction( me, "maybe_add_proof_view_subheadline", "MAYBE-ADD-PROOF-VIEW-SUBHEADLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_subheadline_content", "PROOF-VIEW-SUBHEADLINE-CONTENT", 3, 0, false );
    SubLFiles.declareFunction( me, "maybe_add_proof_view_lede", "MAYBE-ADD-PROOF-VIEW-LEDE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_lede_content", "PROOF-VIEW-LEDE-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "maybe_add_proof_view_story_significance", "MAYBE-ADD-PROOF-VIEW-STORY-SIGNIFICANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_add_proof_view_story_actors_brief_background", "MAYBE-ADD-PROOF-VIEW-STORY-ACTORS-BRIEF-BACKGROUND", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_maybe_enqueue_unincluded_fact", "PROOF-VIEW-MAYBE-ENQUEUE-UNINCLUDED-FACT", 3, 0, false );
    SubLFiles.declareFunction( me, "fact_okay_for_proof_view_actor_brief_backgroundP", "FACT-OKAY-FOR-PROOF-VIEW-ACTOR-BRIEF-BACKGROUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_seen_story_sentences", "PROOF-VIEW-GET-SEEN-STORY-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_add_proof_view_story_details", "MAYBE-ADD-PROOF-VIEW-STORY-DETAILS", 1, 0, false );
    SubLFiles.declareFunction( me, "choose_next_proof_view_story_detail", "CHOOSE-NEXT-PROOF-VIEW-STORY-DETAIL", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_story_detail_score", "PROOF-VIEW-STORY-DETAIL-SCORE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_story_detail_score_wrt_last_sentence_internal", "PROOF-VIEW-STORY-DETAIL-SCORE-WRT-LAST-SENTENCE-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "proof_view_story_detail_score_wrt_last_sentence", "PROOF-VIEW-STORY-DETAIL-SCORE-WRT-LAST-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_proof_view_story_detail_score", "COMPUTE-PROOF-VIEW-STORY-DETAIL-SCORE", 3, 0, false );
    SubLFiles.declareFunction( me, "sort_proof_view_story_details", "SORT-PROOF-VIEW-STORY-DETAILS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_story_sentences_so_far", "PROOF-VIEW-GET-STORY-SENTENCES-SO-FAR", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_add_story_sentence", "PROOF-VIEW-ADD-STORY-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_add_unincluded_story_facts_paragraph", "PROOF-ADD-UNINCLUDED-STORY-FACTS-PARAGRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_add_story_paragraph", "PROOF-VIEW-ADD-STORY-PARAGRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_story_fact_coheres_with_last_factP", "PROOF-VIEW-STORY-FACT-COHERES-WITH-LAST-FACT?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_story_fact_terms", "PROOF-VIEW-STORY-FACT-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_story_fact_requires_own_paragraphP", "PROOF-VIEW-STORY-FACT-REQUIRES-OWN-PARAGRAPH?", 1, 0, false );
    SubLFiles.declareFunction( me, "detailed_entry_gather_story_entries", "DETAILED-ENTRY-GATHER-STORY-ENTRIES", 1, 2, false );
    SubLFiles.declareFunction( me, "proof_view_story_include_detailed_entryP", "PROOF-VIEW-STORY-INCLUDE-DETAILED-ENTRY?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_story_include_detailed_entry_objectP", "PROOF-VIEW-STORY-INCLUDE-DETAILED-ENTRY-OBJECT?", 2, 0, false );
    SubLFiles.declareFunction( me, "show_proof_view_story_section", "SHOW-PROOF-VIEW-STORY-SECTION", 1, 1, false );
    SubLFiles.declareFunction( me, "html_output_proof_view_story_headline", "HTML-OUTPUT-PROOF-VIEW-STORY-HEADLINE", 2, 1, false );
    SubLFiles.declareFunction( me, "html_output_proof_view_story_subheadline", "HTML-OUTPUT-PROOF-VIEW-STORY-SUBHEADLINE", 2, 1, false );
    SubLFiles.declareFunction( me, "html_output_proof_view_story_paragraph", "HTML-OUTPUT-PROOF-VIEW-STORY-PARAGRAPH", 2, 1, false );
    SubLFiles.declareFunction( me, "launch_news_troller_daemon", "LAUNCH-NEWS-TROLLER-DAEMON", 0, 0, false );
    SubLFiles.declareFunction( me, "halt_news_troller_daemon", "HALT-NEWS-TROLLER-DAEMON", 0, 0, false );
    SubLFiles.declareFunction( me, "troll_for_news", "TROLL-FOR-NEWS", 0, 2, false );
    SubLFiles.declareFunction( me, "query_sentence_has_no_obvious_headlineP", "QUERY-SENTENCE-HAS-NO-OBVIOUS-HEADLINE?", 1, 0, false );
    SubLFiles.declareFunction( me, "news_troller_query_forbidden_termP", "NEWS-TROLLER-QUERY-FORBIDDEN-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "filename_from_news_proof_view", "FILENAME-FROM-NEWS-PROOF-VIEW", 2, 0, false );
    SubLFiles.declareFunction( me, "invalid_file_name_char", "INVALID-FILE-NAME-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_news_story_proof_view", "CONSTRUCT-NEWS-STORY-PROOF-VIEW", 2, 2, false );
    SubLFiles.declareFunction( me, "output_proof_view_news_story", "OUTPUT-PROOF-VIEW-NEWS-STORY", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_output_news_story", "MAYBE-OUTPUT-NEWS-STORY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_proof_view_news_file()
  {
    $proof_view_story_label$ = SubLFiles.defparameter( "*PROOF-VIEW-STORY-LABEL*", $str0$Story_ );
    $proof_view_news_detail_last_sentence$ = SubLFiles.defparameter( "*PROOF-VIEW-NEWS-DETAIL-LAST-SENTENCE*", misc_utilities.uninitialized() );
    $proof_view_story_coherence_weight$ = SubLFiles.defparameter( "*PROOF-VIEW-STORY-COHERENCE-WEIGHT*", $float28$30_0 );
    $proof_view_story_meaninginess_weight$ = SubLFiles.defparameter( "*PROOF-VIEW-STORY-MEANINGINESS-WEIGHT*", $float29$1_0 );
    $proof_view_story_depth_weight$ = SubLFiles.defparameter( "*PROOF-VIEW-STORY-DEPTH-WEIGHT*", $float30$50_0 );
    $proof_view_story_section_max_depth$ = SubLFiles.defparameter( "*PROOF-VIEW-STORY-SECTION-MAX-DEPTH*", FIVE_INTEGER );
    $promising_news_query_sample_rate$ = SubLFiles.deflexical( "*PROMISING-NEWS-QUERY-SAMPLE-RATE*", $int47$25 );
    $news_troller_daemon_abortP$ = SubLFiles.deflexical( "*NEWS-TROLLER-DAEMON-ABORT?*", NIL );
    $proof_view_news_xsl_file$ = SubLFiles.deflexical( "*PROOF-VIEW-NEWS-XSL-FILE*", $str74$_cyc_projects_shell_DreamCatcherP );
    return NIL;
  }

  public static SubLObject setup_proof_view_news_file()
  {
    utilities_macros.note_funcall_helper_function( $sym2$PROOF_VIEW_ADD_STORY_SECTION );
    proof_view_populator.note_proof_view_special_section_populator( $sym2$PROOF_VIEW_ADD_STORY_SECTION, $kw3$STORY, NIL, $const4$CycProofViewStorySection );
    memoization_state.note_memoized_function( $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS );
    memoization_state.note_memoized_function( $sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE );
    proof_view.register_proof_view_entry_shower( $sym38$SHOW_PROOF_VIEW_STORY_SECTION );
    proof_view.register_proof_view_output_fn_for_object_type( $kw6$HEADLINE, $sym39$HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE );
    proof_view.register_proof_view_output_fn_for_object_type( $kw11$SUBHEADLINE, $sym40$HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE );
    proof_view.register_proof_view_output_fn_for_object_type( $kw32$STORY_PARAGRAPH, $sym41$HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH );
    utilities_macros.note_funcall_helper_function( $sym38$SHOW_PROOF_VIEW_STORY_SECTION );
    utilities_macros.note_funcall_helper_function( $sym39$HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE );
    utilities_macros.note_funcall_helper_function( $sym40$HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE );
    utilities_macros.note_funcall_helper_function( $sym41$HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_proof_view_news_file();
  }

  @Override
  public void initializeVariables()
  {
    init_proof_view_news_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_proof_view_news_file();
  }
  static
  {
    me = new proof_view_news();
    $proof_view_story_label$ = null;
    $proof_view_news_detail_last_sentence$ = null;
    $proof_view_story_coherence_weight$ = null;
    $proof_view_story_meaninginess_weight$ = null;
    $proof_view_story_depth_weight$ = null;
    $proof_view_story_section_max_depth$ = null;
    $promising_news_query_sample_rate$ = null;
    $news_troller_daemon_abortP$ = null;
    $proof_view_news_xsl_file$ = null;
    $str0$Story_ = makeString( "Story:" );
    $kw1$STORY_ROOT = makeKeyword( "STORY-ROOT" );
    $sym2$PROOF_VIEW_ADD_STORY_SECTION = makeSymbol( "PROOF-VIEW-ADD-STORY-SECTION" );
    $kw3$STORY = makeKeyword( "STORY" );
    $const4$CycProofViewStorySection = constant_handles.reader_make_constant_shell( makeString( "CycProofViewStorySection" ) );
    $str5$ = makeString( "" );
    $kw6$HEADLINE = makeKeyword( "HEADLINE" );
    $kw7$IGNORE = makeKeyword( "IGNORE" );
    $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS = makeSymbol( "PROOF-VIEW-SENTENCE-MEANINGINESS" );
    $str9$_S_is_trivial_in__S = makeString( "~S is trivial in ~S" );
    $str10$_S_is_irrelevant_in__S = makeString( "~S is irrelevant in ~S" );
    $kw11$SUBHEADLINE = makeKeyword( "SUBHEADLINE" );
    $kw12$JUSTIFICATION_ROOT = makeKeyword( "JUSTIFICATION-ROOT" );
    $sym13$THCL_FORT_ = makeSymbol( "THCL-FORT?" );
    $str14$__Main_actors___S__ = makeString( "~&Main actors: ~S~%" );
    $str15$__Found__D_background_facts_for__ = makeString( "~&Found ~D background facts for ~S~%" );
    $sym16$_ = makeSymbol( ">" );
    $sym17$UNLEXIFIED_ = makeSymbol( "UNLEXIFIED?" );
    $sym18$FORT_P = makeSymbol( "FORT-P" );
    $str19$Unlexified_FORT__S___in__S = makeString( "Unlexified FORT ~S~% in ~S" );
    $str20$Trivial_fact__S = makeString( "Trivial fact ~S" );
    $kw21$SEEN_STORY_SENTENCES = makeKeyword( "SEEN-STORY-SENTENCES" );
    $kw22$SUMMARY_ROOT = makeKeyword( "SUMMARY-ROOT" );
    $str23$__Current_paragraph_now_has__S_se = makeString( "~&Current paragraph now has ~S sentences.~%" );
    $sym24$SET_P = makeSymbol( "SET-P" );
    $sym25$PROOF_VIEW_STORY_DETAIL_SCORE = makeSymbol( "PROOF-VIEW-STORY-DETAIL-SCORE" );
    $sym26$_EXIT = makeSymbol( "%EXIT" );
    $sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE = makeSymbol( "PROOF-VIEW-STORY-DETAIL-SCORE-WRT-LAST-SENTENCE" );
    $float28$30_0 = makeDouble( 30.0 );
    $float29$1_0 = makeDouble( 1.0 );
    $float30$50_0 = makeDouble( 50.0 );
    $kw31$STORY_SENTENCES_SO_FAR = makeKeyword( "STORY-SENTENCES-SO-FAR" );
    $kw32$STORY_PARAGRAPH = makeKeyword( "STORY-PARAGRAPH" );
    $str33$_S___coheres_with__S = makeString( "~S~% coheres with ~S" );
    $sym34$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $str35$Reached_story_depth_cutoff_of__D_ = makeString( "Reached story depth cutoff of ~D.~% Pruning supports for~% ~S" );
    $list36 = ConsesLow.list( makeKeyword( "ASSERTION-BOOKKEEPING" ) );
    $const37$englishGloss = constant_handles.reader_make_constant_shell( makeString( "englishGloss" ) );
    $sym38$SHOW_PROOF_VIEW_STORY_SECTION = makeSymbol( "SHOW-PROOF-VIEW-STORY-SECTION" );
    $sym39$HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE = makeSymbol( "HTML-OUTPUT-PROOF-VIEW-STORY-HEADLINE" );
    $sym40$HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE = makeSymbol( "HTML-OUTPUT-PROOF-VIEW-STORY-SUBHEADLINE" );
    $sym41$HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH = makeSymbol( "HTML-OUTPUT-PROOF-VIEW-STORY-PARAGRAPH" );
    $sym42$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE = makeSymbol( "PROOF-VIEW-ENTRY-GET-OBJECT-TYPE" );
    $str43$pf_object = makeString( "pf-object" );
    $str44$story_body = makeString( "story-body" );
    $str45$entry = makeString( "entry" );
    $str46$story_paragraph = makeString( "story-paragraph" );
    $int47$25 = makeInteger( 25 );
    $str48$News_Troller = makeString( "News Troller" );
    $sym49$TROLL_FOR_NEWS = makeSymbol( "TROLL-FOR-NEWS" );
    $sym50$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $str51$cdolist = makeString( "cdolist" );
    $kw52$INPUT = makeKeyword( "INPUT" );
    $str53$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw54$EOF = makeKeyword( "EOF" );
    $str55$Read_invalid_query_info__s = makeString( "Read invalid query info ~s" );
    $sym56$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str57$aries = makeString( "aries" );
    $str58$scorpio = makeString( "scorpio" );
    $str59$libra = makeString( "libra" );
    $str60$__Evaluating_queries_in__S__ = makeString( "~&Evaluating queries in ~S~%" );
    $list61 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "QUERY-PROPERTIES" ) );
    $sym62$NEWS_TROLLER_QUERY_FORBIDDEN_TERM_ = makeSymbol( "NEWS-TROLLER-QUERY-FORBIDDEN-TERM?" );
    $kw63$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $str64$__Got__D_answer__P_for__S__ = makeString( "~&Got ~D answer~:P for ~S~%" );
    $int65$50 = makeInteger( 50 );
    $str66$__Evaluated__D_queries___ = makeString( "~&Evaluated ~D queries.~%" );
    $str67$Caught_error_running_promising_qu = makeString( "Caught error running promising query ~S~%~A" );
    $sym68$PPH_VAR_TYPING_CLAUSE_ = makeSymbol( "PPH-VAR-TYPING-CLAUSE?" );
    $sym69$INVALID_FILE_NAME_CHAR = makeSymbol( "INVALID-FILE-NAME-CHAR" );
    $str70$_ = makeString( "/" );
    $str71$_xml = makeString( ".xml" );
    $str72$UTF_8 = makeString( "UTF-8" );
    $str73$__xml_stylesheet_type__text_xsl__ = makeString( "<?xml-stylesheet type=\"text/xsl\" href=\"xml-news.xsl\"?>" );
    $str74$_cyc_projects_shell_DreamCatcherP = makeString( "/cyc/projects/shell/DreamCatcherPhaseII/ProofViewNewsArticles/xml-news.xsl" );
    $int75$1000 = makeInteger( 1000 );
    $str76$proof_view_news = makeString( "proof-view-news" );
    $str77$Generated_news_story__D_character = makeString( "Generated news story ~D characters long (~S paragraphs, ~D demerits) for~% ~S" );
    $kw78$OUTPUT = makeKeyword( "OUTPUT" );
    $str79$_xml_news_xsl = makeString( "/xml-news.xsl" );
  }
}
/*
 * 
 * Total time: 831 ms
 * 
 */