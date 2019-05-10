package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class auto_lexifier
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.auto_lexifier";
  public static final String myFingerPrint = "65c8d4b0762a667144cdc9a88dd9672c95deb4f60ba628fe93e0087e4b2e0e16";
  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
  private static SubLSymbol $language_has_known_unicode_codepoint_range_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 6915L)
  private static SubLSymbol $bogus_unicode_string$;
  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 7039L)
  private static SubLSymbol $bogusly_lexified_terms$;
  private static final SubLObject $const0$InferencePSC;
  private static final SubLObject $const1$EnglishLanguage;
  private static final SubLObject $const2$ist;
  private static final SubLString $str3$No_lexical_Mt_for__S___Unable_to_;
  private static final SubLString $str4$No_valid_characters_for__S_in__S_;
  private static final SubLObject $const5$Individual;
  private static final SubLObject $const6$nameString;
  private static final SubLObject $const7$termStrings;
  private static final SubLSymbol $sym8$NON_ASCII_CHAR_P;
  private static final SubLSymbol $kw9$OFF;
  private static final SubLSymbol $kw10$NONE;
  private static final SubLSymbol $sym11$PHRASE_STRUCTURE_PARSER_CHART_P;
  private static final SubLSymbol $kw12$ANY;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$GET_PSP_EDGE_SPAN;
  private static final SubLSymbol $kw15$LEXICAL;
  private static final SubLObject $const16$singular_Generic;
  private static final SubLObject $const17$Person;
  private static final SubLSymbol $sym18$_;
  private static final SubLList $list19;
  private static final SubLString $str20$the_;
  private static final SubLObject $const21$definiteDescriptions;
  private static final SubLSymbol $sym22$STRINGP;
  private static final SubLObject $const23$thereExists;
  private static final SubLSymbol $sym24$_ORTH;
  private static final SubLObject $const25$and;
  private static final SubLObject $const26$orthography;
  private static final SubLList $list27;
  private static final SubLObject $const28$stringHasCharacterInOrthography;
  private static final SubLSymbol $sym29$LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE;
  private static final SubLSymbol $sym30$_RANGE;
  private static final SubLList $list31;
  private static final SubLObject $const32$LanguageAndWritingSystemMt;
  private static final SubLSymbol $sym33$_LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE_CACHING_STATE_;
  private static final SubLInteger $int34$64;
  private static final SubLSymbol $sym35$AUTO_LEXIFY;
  private static final SubLSymbol $kw36$TEST;
  private static final SubLSymbol $kw37$OWNER;
  private static final SubLSymbol $kw38$CLASSES;
  private static final SubLSymbol $kw39$KB;
  private static final SubLSymbol $kw40$FULL;
  private static final SubLSymbol $kw41$WORKING_;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const45$EverythingPSC;
  private static final SubLObject $const46$wikipediaArticleName_Canonical;
  private static final SubLSymbol $kw47$GAF;
  private static final SubLObject $const48$CycTermLearner_2010Edition;
  private static final SubLString $str49$Bad_name___S_contains__S;
  private static final SubLString $str50$_home_baxter_logs_bogusly_lexifie;

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 1051L)
  public static SubLObject auto_lexify_for_language(final SubLObject string, final SubLObject meaning, final SubLObject language, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $const0$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lexical_mt = lexicon_utilities.lexical_mt_for_language( language );
    if( language.equal( $const1$EnglishLanguage ) )
    {
      final SubLObject sentences = auto_lexify( string, meaning, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), domain_mt );
      SubLObject contextualized_sentences = NIL;
      SubLObject cdolist_list_var = sentences;
      SubLObject sentence = NIL;
      sentence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        contextualized_sentences = ConsesLow.cons( ConsesLow.list( $const2$ist, lexical_mt, sentence ), contextualized_sentences );
        cdolist_list_var = cdolist_list_var.rest();
        sentence = cdolist_list_var.first();
      }
      return Sequences.nreverse( contextualized_sentences );
    }
    final SubLObject lexical_mt_$1 = lexicon_utilities.lexical_mt_for_language( language );
    SubLObject lexical_sentence = NIL;
    if( NIL == lexical_mt_$1 )
    {
      Errors.warn( $str3$No_lexical_Mt_for__S___Unable_to_, language, meaning, string );
      return NIL;
    }
    if( NIL != string_known_invalid_for_language( string, language ) )
    {
      Errors.warn( $str4$No_valid_characters_for__S_in__S_, string, language );
      return NIL;
    }
    if( NIL != isa.isaP( meaning, $const5$Individual, domain_mt, UNPROVIDED ) )
    {
      lexical_sentence = ConsesLow.list( $const2$ist, lexical_mt_$1, ConsesLow.list( $const6$nameString, meaning, unicode_nauts.utf8_string_to_cycl_safe_string( string ) ) );
    }
    else
    {
      lexical_sentence = ConsesLow.list( $const2$ist, lexical_mt_$1, ConsesLow.list( $const7$termStrings, meaning, unicode_nauts.utf8_string_to_cycl_safe_string( string ) ) );
    }
    return ConsesLow.list( lexical_sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 2213L)
  public static SubLObject auto_lexify(final SubLObject string, final SubLObject meaning, SubLObject lexical_mt, SubLObject domain_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $const0$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    SubLObject unique_heads = NIL;
    final SubLObject v_cycl_string = ( NIL != Sequences.find_if( $sym8$NON_ASCII_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? cycl_string.convert_string_to_cycl( string ) : string;
    final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_vars.$guess_semantics_for_unknown_wordsP$.currentBinding( thread );
    try
    {
      lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( $kw9$OFF, thread );
      parsing_vars.$guess_semantics_for_unknown_wordsP$.bind( T, thread );
      SubLObject start_index = NIL;
      SubLObject end_index = NIL;
      SubLObject chart = NIL;
      if( NIL == parsing_vars.$psp_chart$.getDynamicValue( thread ) || NIL != parsing_macros.psp_chart_matches_gap_type_p( parsing_vars.$psp_chart$.getDynamicValue( thread ), $kw10$NONE ) )
      {
        thread.resetMultipleValues();
        final SubLObject start_index_$2 = psp_main.psp_find_string_in_charts( cycl_string.cycl_string_to_utf8_string( v_cycl_string ), parsing_vars.$psp_chart$.getDynamicValue( thread ), parsing_vars.$psp_extra_charts$
            .getDynamicValue( thread ) );
        final SubLObject end_index_$3 = thread.secondMultipleValue();
        final SubLObject chart_$4 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        start_index = start_index_$2;
        end_index = end_index_$3;
        chart = chart_$4;
      }
      if( NIL != start_index )
      {
        final SubLObject _prev_bind_0_$5 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$6 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
        final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding( thread );
        try
        {
          parsing_vars.$psp_chart_start_index$.bind( start_index, thread );
          parsing_vars.$psp_chart_end_index$.bind( end_index, thread );
          parsing_vars.$psp_chart$.bind( chart, thread );
          psp_syntax.psp_chart_do_syntactic_parsing( chart, UNPROVIDED, UNPROVIDED );
          final SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue( thread );
          assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use ) : chart_to_use;
          if( psp_chart.psp_chart_max_span() == $kw12$ANY )
          {
            final SubLObject pcase_var = $kw12$ANY;
            if( pcase_var.eql( $kw12$ANY ) )
            {
              final SubLObject chart_to_use_$7 = ( NIL != chart_to_use ) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue( thread );
              assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use_$7 ) : chart_to_use_$7;
              SubLObject iteration_state;
              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( psp_chart.psp_chart_spans_to_edges( chart_to_use_$7 ) ) ); NIL == dictionary_contents
                  .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
              {
                thread.resetMultipleValues();
                final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                final SubLObject value = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject csome_list_var = psp_chart.psp_edges_with_span( span_to_do, chart_to_use );
                SubLObject edge = NIL;
                edge = csome_list_var.first();
                while ( NIL != csome_list_var)
                {
                  if( NIL != psp_chart.psp_do_edge_okP( edge, $list13, T ) )
                  {
                    final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme( edge );
                    if( NIL == Sequences.find( psp_chart.get_psp_edge_span( head_lexeme ), unique_heads, EQUAL, $sym14$GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED ) )
                    {
                      unique_heads = ConsesLow.cons( head_lexeme, unique_heads );
                      final SubLObject var = auto_lexify_nbar_with_head_edge( string, meaning, head_lexeme, lexical_mt, domain_mt );
                      if( NIL != var )
                      {
                        answers = ConsesLow.cons( var, answers );
                      }
                    }
                  }
                  csome_list_var = csome_list_var.rest();
                  edge = csome_list_var.first();
                }
              }
              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
            }
            else if( pcase_var.eql( $kw15$LEXICAL ) )
            {
              final SubLObject chart_to_use_$8 = ( NIL != chart_to_use ) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue( thread );
              assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use_$8 ) : chart_to_use_$8;
              SubLObject iteration_state;
              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( psp_chart.psp_chart_spans_to_edges( chart_to_use_$8 ) ) ); NIL == dictionary_contents
                  .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
              {
                thread.resetMultipleValues();
                final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                final SubLObject value = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span( span_to_do, chart_to_use );
                SubLObject edge = NIL;
                edge = csome_list_var.first();
                while ( NIL != csome_list_var)
                {
                  if( NIL != psp_chart.psp_do_edge_okP( edge, $list13, T ) )
                  {
                    final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme( edge );
                    if( NIL == Sequences.find( psp_chart.get_psp_edge_span( head_lexeme ), unique_heads, EQUAL, $sym14$GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED ) )
                    {
                      unique_heads = ConsesLow.cons( head_lexeme, unique_heads );
                      final SubLObject var = auto_lexify_nbar_with_head_edge( string, meaning, head_lexeme, lexical_mt, domain_mt );
                      if( NIL != var )
                      {
                        answers = ConsesLow.cons( var, answers );
                      }
                    }
                  }
                  csome_list_var = csome_list_var.rest();
                  edge = csome_list_var.first();
                }
              }
              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
            }
          }
          else if( NIL != interval_span.interval_span_p( psp_chart.psp_chart_max_span() ) )
          {
            final SubLObject pcase_var = $kw12$ANY;
            if( pcase_var.eql( $kw12$ANY ) )
            {
              SubLObject csome_list_var2 = psp_chart.psp_edges_with_span( psp_chart.psp_chart_max_span(), chart_to_use );
              SubLObject edge2 = NIL;
              edge2 = csome_list_var2.first();
              while ( NIL != csome_list_var2)
              {
                if( NIL != psp_chart.psp_do_edge_okP( edge2, $list13, T ) )
                {
                  final SubLObject head_lexeme2 = psp_chart.get_psp_edge_head_lexeme( edge2 );
                  if( NIL == Sequences.find( psp_chart.get_psp_edge_span( head_lexeme2 ), unique_heads, EQUAL, $sym14$GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED ) )
                  {
                    unique_heads = ConsesLow.cons( head_lexeme2, unique_heads );
                    final SubLObject var2 = auto_lexify_nbar_with_head_edge( string, meaning, head_lexeme2, lexical_mt, domain_mt );
                    if( NIL != var2 )
                    {
                      answers = ConsesLow.cons( var2, answers );
                    }
                  }
                }
                csome_list_var2 = csome_list_var2.rest();
                edge2 = csome_list_var2.first();
              }
            }
            else if( pcase_var.eql( $kw15$LEXICAL ) )
            {
              SubLObject csome_list_var2 = psp_chart.psp_lexical_edges_with_span( psp_chart.psp_chart_max_span(), chart_to_use );
              SubLObject edge2 = NIL;
              edge2 = csome_list_var2.first();
              while ( NIL != csome_list_var2)
              {
                if( NIL != psp_chart.psp_do_edge_okP( edge2, $list13, T ) )
                {
                  final SubLObject head_lexeme2 = psp_chart.get_psp_edge_head_lexeme( edge2 );
                  if( NIL == Sequences.find( psp_chart.get_psp_edge_span( head_lexeme2 ), unique_heads, EQUAL, $sym14$GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED ) )
                  {
                    unique_heads = ConsesLow.cons( head_lexeme2, unique_heads );
                    final SubLObject var2 = auto_lexify_nbar_with_head_edge( string, meaning, head_lexeme2, lexical_mt, domain_mt );
                    if( NIL != var2 )
                    {
                      answers = ConsesLow.cons( var2, answers );
                    }
                  }
                }
                csome_list_var2 = csome_list_var2.rest();
                edge2 = csome_list_var2.first();
              }
            }
          }
        }
        finally
        {
          parsing_vars.$psp_chart$.rebind( _prev_bind_3, thread );
          parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_1_$6, thread );
          parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0_$5, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0_$6 = parsing_vars.$psp_chart_start_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$7 = parsing_vars.$psp_chart_end_index$.currentBinding( thread );
        try
        {
          parsing_vars.$psp_chart_start_index$.bind( ZERO_INTEGER, thread );
          parsing_vars.$psp_chart_end_index$.bind( NIL, thread );
          final SubLObject chart_$5 = psp_syntax.psp_chart_for_string( cycl_string.cycl_string_to_utf8_string( v_cycl_string ), parsing_macros.get_psp_lexicon(), $kw10$NONE, UNPROVIDED );
          final SubLObject local_state = psp_chart.psp_chart_memoization_state( chart_$5 );
          final SubLObject _prev_bind_0_$7 = memoization_state.$memoization_state$.currentBinding( thread );
          try
          {
            memoization_state.$memoization_state$.bind( local_state, thread );
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
            try
            {
              final SubLObject _prev_bind_0_$8 = parsing_vars.$psp_chart$.currentBinding( thread );
              try
              {
                parsing_vars.$psp_chart$.bind( chart_$5, thread );
                final SubLObject chart_to_use2 = parsing_vars.$psp_chart$.getDynamicValue( thread );
                assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use2 ) : chart_to_use2;
                if( psp_chart.psp_chart_max_span() == $kw12$ANY )
                {
                  final SubLObject pcase_var2 = $kw12$ANY;
                  if( pcase_var2.eql( $kw12$ANY ) )
                  {
                    final SubLObject chart_to_use_$9 = ( NIL != chart_to_use2 ) ? chart_to_use2 : parsing_vars.$psp_chart$.getDynamicValue( thread );
                    assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use_$9 ) : chart_to_use_$9;
                    SubLObject iteration_state2;
                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( psp_chart.psp_chart_spans_to_edges( chart_to_use_$9 ) ) ); NIL == dictionary_contents
                        .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                    {
                      thread.resetMultipleValues();
                      final SubLObject span_to_do2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                      final SubLObject value2 = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      SubLObject csome_list_var3 = psp_chart.psp_edges_with_span( span_to_do2, chart_to_use2 );
                      SubLObject edge3 = NIL;
                      edge3 = csome_list_var3.first();
                      while ( NIL != csome_list_var3)
                      {
                        if( NIL != psp_chart.psp_do_edge_okP( edge3, $list13, T ) )
                        {
                          final SubLObject head_lexeme3 = psp_chart.get_psp_edge_head_lexeme( edge3 );
                          if( NIL == Sequences.find( psp_chart.get_psp_edge_span( head_lexeme3 ), unique_heads, EQUAL, $sym14$GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED ) )
                          {
                            unique_heads = ConsesLow.cons( head_lexeme3, unique_heads );
                            final SubLObject var3 = auto_lexify_nbar_with_head_edge( string, meaning, head_lexeme3, lexical_mt, domain_mt );
                            if( NIL != var3 )
                            {
                              answers = ConsesLow.cons( var3, answers );
                            }
                          }
                        }
                        csome_list_var3 = csome_list_var3.rest();
                        edge3 = csome_list_var3.first();
                      }
                    }
                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                  }
                  else if( pcase_var2.eql( $kw15$LEXICAL ) )
                  {
                    final SubLObject chart_to_use_$10 = ( NIL != chart_to_use2 ) ? chart_to_use2 : parsing_vars.$psp_chart$.getDynamicValue( thread );
                    assert NIL != psp_chart.phrase_structure_parser_chart_p( chart_to_use_$10 ) : chart_to_use_$10;
                    SubLObject iteration_state2;
                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( psp_chart.psp_chart_spans_to_edges( chart_to_use_$10 ) ) ); NIL == dictionary_contents
                        .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                    {
                      thread.resetMultipleValues();
                      final SubLObject span_to_do2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                      final SubLObject value2 = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      SubLObject csome_list_var3 = psp_chart.psp_lexical_edges_with_span( span_to_do2, chart_to_use2 );
                      SubLObject edge3 = NIL;
                      edge3 = csome_list_var3.first();
                      while ( NIL != csome_list_var3)
                      {
                        if( NIL != psp_chart.psp_do_edge_okP( edge3, $list13, T ) )
                        {
                          final SubLObject head_lexeme3 = psp_chart.get_psp_edge_head_lexeme( edge3 );
                          if( NIL == Sequences.find( psp_chart.get_psp_edge_span( head_lexeme3 ), unique_heads, EQUAL, $sym14$GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED ) )
                          {
                            unique_heads = ConsesLow.cons( head_lexeme3, unique_heads );
                            final SubLObject var3 = auto_lexify_nbar_with_head_edge( string, meaning, head_lexeme3, lexical_mt, domain_mt );
                            if( NIL != var3 )
                            {
                              answers = ConsesLow.cons( var3, answers );
                            }
                          }
                        }
                        csome_list_var3 = csome_list_var3.rest();
                        edge3 = csome_list_var3.first();
                      }
                    }
                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                  }
                }
                else if( NIL != interval_span.interval_span_p( psp_chart.psp_chart_max_span() ) )
                {
                  final SubLObject pcase_var2 = $kw12$ANY;
                  if( pcase_var2.eql( $kw12$ANY ) )
                  {
                    SubLObject csome_list_var = psp_chart.psp_edges_with_span( psp_chart.psp_chart_max_span(), chart_to_use2 );
                    SubLObject edge = NIL;
                    edge = csome_list_var.first();
                    while ( NIL != csome_list_var)
                    {
                      if( NIL != psp_chart.psp_do_edge_okP( edge, $list13, T ) )
                      {
                        final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme( edge );
                        if( NIL == Sequences.find( psp_chart.get_psp_edge_span( head_lexeme ), unique_heads, EQUAL, $sym14$GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED ) )
                        {
                          unique_heads = ConsesLow.cons( head_lexeme, unique_heads );
                          final SubLObject var = auto_lexify_nbar_with_head_edge( string, meaning, head_lexeme, lexical_mt, domain_mt );
                          if( NIL != var )
                          {
                            answers = ConsesLow.cons( var, answers );
                          }
                        }
                      }
                      csome_list_var = csome_list_var.rest();
                      edge = csome_list_var.first();
                    }
                  }
                  else if( pcase_var2.eql( $kw15$LEXICAL ) )
                  {
                    SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span( psp_chart.psp_chart_max_span(), chart_to_use2 );
                    SubLObject edge = NIL;
                    edge = csome_list_var.first();
                    while ( NIL != csome_list_var)
                    {
                      if( NIL != psp_chart.psp_do_edge_okP( edge, $list13, T ) )
                      {
                        final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme( edge );
                        if( NIL == Sequences.find( psp_chart.get_psp_edge_span( head_lexeme ), unique_heads, EQUAL, $sym14$GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED ) )
                        {
                          unique_heads = ConsesLow.cons( head_lexeme, unique_heads );
                          final SubLObject var = auto_lexify_nbar_with_head_edge( string, meaning, head_lexeme, lexical_mt, domain_mt );
                          if( NIL != var )
                          {
                            answers = ConsesLow.cons( var, answers );
                          }
                        }
                      }
                      csome_list_var = csome_list_var.rest();
                      edge = csome_list_var.first();
                    }
                  }
                }
                if( NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue( thread ) )
                {
                  psp_chart.destroy_psp_chart( UNPROVIDED );
                }
              }
              finally
              {
                parsing_vars.$psp_chart$.rebind( _prev_bind_0_$8, thread );
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
            memoization_state.$memoization_state$.rebind( _prev_bind_0_$7, thread );
          }
        }
        finally
        {
          parsing_vars.$psp_chart_end_index$.rebind( _prev_bind_1_$7, thread );
          parsing_vars.$psp_chart_start_index$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      parsing_vars.$guess_semantics_for_unknown_wordsP$.rebind( _prev_bind_2, thread );
      lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_0, thread );
    }
    if( NIL == answers )
    {
      final SubLObject var4 = make_proper_name_formula( meaning, v_cycl_string );
      if( NIL != var4 )
      {
        answers = ConsesLow.cons( var4, answers );
      }
    }
    return Sequences.remove_duplicates( answers, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 3514L)
  public static SubLObject auto_lexify_nbar_with_head_edge(final SubLObject string, final SubLObject meaning, final SubLObject head_lexeme, final SubLObject lexical_mt, final SubLObject domain_mt)
  {
    if( NIL != isa.isaP( meaning, $const5$Individual, domain_mt, UNPROVIDED ) )
    {
      if( NIL != lexicon_accessors.genl_pos_predP( psp_chart.get_psp_edge_pos_pred( head_lexeme ), $const16$singular_Generic, lexical_mt ) )
      {
        if( NIL != isa.isaP( meaning, $const17$Person, domain_mt, UNPROVIDED ) )
        {
          return make_proper_name_formula( meaning, string );
        }
        return make_def_description( meaning, string );
      }
    }
    else
    {
      final SubLObject span_length = interval_span.interval_span_length( psp_chart.get_psp_edge_span( head_lexeme ) );
      final SubLObject head_string = psp_chart.get_psp_edge_string( head_lexeme );
      final SubLObject category = psp_chart.get_psp_edge_category( head_lexeme );
      SubLObject head_position = Numbers.add( ONE_INTEGER, interval_span.interval_span_start( psp_chart.get_psp_edge_span( head_lexeme ) ) );
      if( !span_length.eql( ONE_INTEGER ) )
      {
        final SubLObject locations = nl_trie.nl_trie_head_locations_in_lexical_string( head_string );
        if( NIL != locations )
        {
          final SubLObject location = Sort.sort( locations, $sym18$_, UNPROVIDED ).first();
          head_position = Numbers.add( head_position, location );
        }
        else
        {
          final SubLObject location = Sequences.length( string_utilities.string_tokenize( head_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          head_position = Numbers.add( head_position, location );
        }
      }
      if( NIL != lexicon_accessors.speech_partP( category, UNPROVIDED ) )
      {
        return lexification_wizard.determine_lexical_formula( meaning, string, head_position, category, lexical_mt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 4712L)
  public static SubLObject make_def_description(final SubLObject meaning, final SubLObject string)
  {
    final SubLObject full_string = ( NIL != string_utilities.starts_with_one_of( string, $list19 ) ) ? string : Sequences.cconcatenate( $str20$the_, string );
    return ConsesLow.list( $const21$definiteDescriptions, meaning, full_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 4949L)
  public static SubLObject make_proper_name_formula(final SubLObject cyc_term, final SubLObject lex_phrase)
  {
    final SubLObject cyc_predicate = misc_kb_utilities.fort_for_string( lexification_wizard.$default_proper_name_pred$.getGlobalValue() );
    return ConsesLow.list( cyc_predicate, cyc_term, lex_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5136L)
  public static SubLObject string_known_invalid_for_language(final SubLObject str, final SubLObject lang)
  {
    assert NIL != Types.stringp( str ) : str;
    if( NIL != unicode_strings.ascii_string_p( str ) )
    {
      return NIL;
    }
    return makeBoolean( NIL != language_has_known_unicode_codepoint_range( lang ) && NIL == ask_utilities.query_boolean( ConsesLow.list( $const23$thereExists, $sym24$_ORTH, ConsesLow.list( $const25$and, ConsesLow.listS(
        $const26$orthography, lang, $list27 ), ConsesLow.listS( $const28$stringHasCharacterInOrthography, unicode_nauts.utf8_string_to_cycl_safe_string( str ), $list27 ) ) ), $const0$InferencePSC, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
  public static SubLObject clear_language_has_known_unicode_codepoint_range()
  {
    final SubLObject cs = $language_has_known_unicode_codepoint_range_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
  public static SubLObject remove_language_has_known_unicode_codepoint_range(final SubLObject lang)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $language_has_known_unicode_codepoint_range_caching_state$.getGlobalValue(), ConsesLow.list( lang ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
  public static SubLObject language_has_known_unicode_codepoint_range_internal(final SubLObject lang)
  {
    return ask_utilities.query_boolean( ConsesLow.list( $const23$thereExists, $sym24$_ORTH, ConsesLow.list( $const23$thereExists, $sym30$_RANGE, ConsesLow.list( $const25$and, $list31, ConsesLow.listS(
        $const26$orthography, lang, $list27 ) ) ) ), $const32$LanguageAndWritingSystemMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
  public static SubLObject language_has_known_unicode_codepoint_range(final SubLObject lang)
  {
    SubLObject caching_state = $language_has_known_unicode_codepoint_range_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym29$LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE, $sym33$_LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE_CACHING_STATE_, $int34$64, EQL,
          ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, lang, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( language_has_known_unicode_codepoint_range_internal( lang ) ) );
      memoization_state.caching_state_put( caching_state, lang, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 7104L)
  public static SubLObject bogusly_lexified_terms()
  {
    return $bogusly_lexified_terms$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 7182L)
  public static SubLObject remove_bogus_auto_lexified_names()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject bogus_char_vector = cycl_string.cycl_string_to_unicode_vector( $bogus_unicode_string$.getGlobalValue() );
    final SubLObject bad_terms = $bogusly_lexified_terms$.getGlobalValue();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym44$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const45$EverythingPSC, thread );
      final SubLObject pred_var = $const46$wikipediaArticleName_Canonical;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$17 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw47$GAF, NIL, NIL );
                SubLObject done_var_$19 = NIL;
                final SubLObject token_var_$20 = NIL;
                while ( NIL == done_var_$19)
                {
                  final SubLObject wanc_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$20 );
                  final SubLObject valid_$21 = makeBoolean( !token_var_$20.eql( wanc_as ) );
                  if( NIL != valid_$21 )
                  {
                    final SubLObject v_term = assertions_high.gaf_arg1( wanc_as );
                    final SubLObject pred_var_$22 = $const6$nameString;
                    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var_$22 ) )
                    {
                      final SubLObject iterator_var_$23 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var_$22 );
                      SubLObject done_var_$20 = NIL;
                      final SubLObject token_var_$21 = NIL;
                      while ( NIL == done_var_$20)
                      {
                        final SubLObject final_index_spec_$26 = iteration.iteration_next_without_values_macro_helper( iterator_var_$23, token_var_$21 );
                        final SubLObject valid_$22 = makeBoolean( !token_var_$21.eql( final_index_spec_$26 ) );
                        if( NIL != valid_$22 )
                        {
                          SubLObject final_index_iterator_$28 = NIL;
                          try
                          {
                            final_index_iterator_$28 = kb_mapping_macros.new_final_index_iterator( final_index_spec_$26, $kw47$GAF, NIL, NIL );
                            SubLObject done_var_$21 = NIL;
                            final SubLObject token_var_$22 = NIL;
                            while ( NIL == done_var_$21)
                            {
                              final SubLObject name_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator_$28, token_var_$22 );
                              final SubLObject valid_$23 = makeBoolean( !token_var_$22.eql( name_gaf ) );
                              if( NIL != valid_$23 && NIL != removal_modules_assertion_mt.assertion_asserted_byP( name_gaf, $const48$CycTermLearner_2010Edition ) )
                              {
                                SubLObject badP = NIL;
                                final SubLObject name = assertions_high.gaf_arg2( name_gaf );
                                final SubLObject name_vector = cycl_string.cycl_string_to_unicode_vector( name );
                                if( NIL != unicode_nauts.unicode_naut_p( name, UNPROVIDED ) )
                                {
                                  final SubLObject vector_var = bogus_char_vector;
                                  final SubLObject backwardP_var = NIL;
                                  SubLObject length;
                                  SubLObject v_iteration;
                                  SubLObject element_num;
                                  SubLObject bogus_char_code;
                                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                                  {
                                    element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                                    bogus_char_code = Vectors.aref( vector_var, element_num );
                                    if( NIL != Sequences.find( bogus_char_code, name_vector, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                                    {
                                      Errors.warn( $str49$Bad_name___S_contains__S, name, bogus_char_code );
                                      badP = T;
                                    }
                                  }
                                }
                                if( NIL != badP )
                                {
                                  set.set_add( v_term, bad_terms );
                                  ke.ke_unassert_assertion( name_gaf );
                                }
                              }
                              done_var_$21 = makeBoolean( NIL == valid_$23 );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values = Values.getValuesAsVector();
                              if( NIL != final_index_iterator_$28 )
                              {
                                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator_$28 );
                              }
                              Values.restoreValuesFromVector( _values );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
                            }
                          }
                        }
                        done_var_$20 = makeBoolean( NIL == valid_$22 );
                      }
                    }
                  }
                  done_var_$19 = makeBoolean( NIL == valid_$21 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
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
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$18, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$17, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return bad_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 8072L)
  public static SubLObject load_bogusly_lexified_terms(SubLObject file)
  {
    if( file == UNPROVIDED )
    {
      file = $str50$_home_baxter_logs_bogusly_lexifie;
    }
    $bogusly_lexified_terms$.setGlobalValue( cfasl_utilities.cfasl_load( file ) );
    return $bogusly_lexified_terms$.getGlobalValue();
  }

  public static SubLObject declare_auto_lexifier_file()
  {
    SubLFiles.declareFunction( me, "auto_lexify_for_language", "AUTO-LEXIFY-FOR-LANGUAGE", 3, 1, false );
    SubLFiles.declareFunction( me, "auto_lexify", "AUTO-LEXIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "auto_lexify_nbar_with_head_edge", "AUTO-LEXIFY-NBAR-WITH-HEAD-EDGE", 5, 0, false );
    SubLFiles.declareFunction( me, "make_def_description", "MAKE-DEF-DESCRIPTION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_proper_name_formula", "MAKE-PROPER-NAME-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "string_known_invalid_for_language", "STRING-KNOWN-INVALID-FOR-LANGUAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_language_has_known_unicode_codepoint_range", "CLEAR-LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_language_has_known_unicode_codepoint_range", "REMOVE-LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "language_has_known_unicode_codepoint_range_internal", "LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "language_has_known_unicode_codepoint_range", "LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "bogusly_lexified_terms", "BOGUSLY-LEXIFIED-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_bogus_auto_lexified_names", "REMOVE-BOGUS-AUTO-LEXIFIED-NAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "load_bogusly_lexified_terms", "LOAD-BOGUSLY-LEXIFIED-TERMS", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_auto_lexifier_file()
  {
    $language_has_known_unicode_codepoint_range_caching_state$ = SubLFiles.deflexical( "*LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE-CACHING-STATE*", NIL );
    $bogus_unicode_string$ = SubLFiles.deflexical( "*BOGUS-UNICODE-STRING*", $list43 );
    $bogusly_lexified_terms$ = SubLFiles.deflexical( "*BOGUSLY-LEXIFIED-TERMS*", set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject setup_auto_lexifier_file()
  {
    memoization_state.note_globally_cached_function( $sym29$LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE );
    generic_testing.define_test_case_table_int( $sym35$AUTO_LEXIFY, ConsesLow.list( new SubLObject[] { $kw36$TEST, EQUAL, $kw37$OWNER, NIL, $kw38$CLASSES, NIL, $kw39$KB, $kw40$FULL, $kw41$WORKING_, T
    } ), $list42 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_auto_lexifier_file();
  }

  @Override
  public void initializeVariables()
  {
    init_auto_lexifier_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_auto_lexifier_file();
  }
  static
  {
    me = new auto_lexifier();
    $language_has_known_unicode_codepoint_range_caching_state$ = null;
    $bogus_unicode_string$ = null;
    $bogusly_lexified_terms$ = null;
    $const0$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $const1$EnglishLanguage = constant_handles.reader_make_constant_shell( makeString( "EnglishLanguage" ) );
    $const2$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $str3$No_lexical_Mt_for__S___Unable_to_ = makeString( "No lexical Mt for ~S.  Unable to auto-lexify ~S as ~S." );
    $str4$No_valid_characters_for__S_in__S_ = makeString( "No valid characters for ~S in ~S.  Unable to autolexify." );
    $const5$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $const6$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $const7$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $sym8$NON_ASCII_CHAR_P = makeSymbol( "NON-ASCII-CHAR-P" );
    $kw9$OFF = makeKeyword( "OFF" );
    $kw10$NONE = makeKeyword( "NONE" );
    $sym11$PHRASE_STRUCTURE_PARSER_CHART_P = makeSymbol( "PHRASE-STRUCTURE-PARSER-CHART-P" );
    $kw12$ANY = makeKeyword( "ANY" );
    $list13 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) );
    $sym14$GET_PSP_EDGE_SPAN = makeSymbol( "GET-PSP-EDGE-SPAN" );
    $kw15$LEXICAL = makeKeyword( "LEXICAL" );
    $const16$singular_Generic = constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) );
    $const17$Person = constant_handles.reader_make_constant_shell( makeString( "Person" ) );
    $sym18$_ = makeSymbol( ">" );
    $list19 = ConsesLow.list( makeString( "The " ), makeString( "the " ) );
    $str20$the_ = makeString( "the " );
    $const21$definiteDescriptions = constant_handles.reader_make_constant_shell( makeString( "definiteDescriptions" ) );
    $sym22$STRINGP = makeSymbol( "STRINGP" );
    $const23$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym24$_ORTH = makeSymbol( "?ORTH" );
    $const25$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const26$orthography = constant_handles.reader_make_constant_shell( makeString( "orthography" ) );
    $list27 = ConsesLow.list( makeSymbol( "?ORTH" ) );
    $const28$stringHasCharacterInOrthography = constant_handles.reader_make_constant_shell( makeString( "stringHasCharacterInOrthography" ) );
    $sym29$LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE = makeSymbol( "LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE" );
    $sym30$_RANGE = makeSymbol( "?RANGE" );
    $list31 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unicodeCodePointRangeUsedInWritingSystem" ) ), makeSymbol( "?RANGE" ), makeSymbol( "?ORTH" ) );
    $const32$LanguageAndWritingSystemMt = constant_handles.reader_make_constant_shell( makeString( "LanguageAndWritingSystemMt" ) );
    $sym33$_LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE_CACHING_STATE_ = makeSymbol( "*LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE-CACHING-STATE*" );
    $int34$64 = makeInteger( 64 );
    $sym35$AUTO_LEXIFY = makeSymbol( "AUTO-LEXIFY" );
    $kw36$TEST = makeKeyword( "TEST" );
    $kw37$OWNER = makeKeyword( "OWNER" );
    $kw38$CLASSES = makeKeyword( "CLASSES" );
    $kw39$KB = makeKeyword( "KB" );
    $kw40$FULL = makeKeyword( "FULL" );
    $kw41$WORKING_ = makeKeyword( "WORKING?" );
    $list42 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "turkey sandwich" ), constant_handles.reader_make_constant_shell( makeString( "FederalBureauOfInvestigation" ) ) ), ConsesLow.list( ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "definiteDescriptions" ) ), constant_handles.reader_make_constant_shell( makeString( "FederalBureauOfInvestigation" ) ), makeString(
            "the turkey sandwich" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "turkey sandwich" ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow.list( ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), makeString( "turkey" ) ),
                constant_handles.reader_make_constant_shell( makeString( "Sandwich-TheWord" ) ), constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ), constant_handles.reader_make_constant_shell(
                    makeString( "HeartAttack" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "turkey sandwich on rye" ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow
                        .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "headMedialString" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ),
                            makeString( "turkey" ) ), constant_handles.reader_make_constant_shell( makeString( "Sandwich-TheWord" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                "TheList" ) ), makeString( "on" ), makeString( "rye" ) ), constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ), constant_handles.reader_make_constant_shell( makeString(
                                    "HeartAttack" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "newspaper agency" ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow.list(
                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                            "TheList" ) ), makeString( "newspaper" ) ), constant_handles.reader_make_constant_shell( makeString( "Agency-TheWord" ) ), constant_handles.reader_make_constant_shell(
                                                makeString( "CountNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                    "Parisian terrorist organization" ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                        .reader_make_constant_shell( makeString( "multiWordString" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), makeString(
                                                            "Parisian" ), makeString( "terrorist" ) ), constant_handles.reader_make_constant_shell( makeString( "Organization-TheWord" ) ), constant_handles
                                                                .reader_make_constant_shell( makeString( "CountNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ) ) ), ConsesLow.list(
                                                                    ConsesLow.list( makeString( "terrorist organization" ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow.list(
                                                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) ), ConsesLow.list( constant_handles
                                                                            .reader_make_constant_shell( makeString( "TheList" ) ), makeString( "terrorist" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                "Organization-TheWord" ) ), constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ), constant_handles
                                                                                    .reader_make_constant_shell( makeString( "HeartAttack" ) ) ) ) ) );
    $list43 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&uA6;&uB0;&u80;&u93;&u9D;&uC3;&uA2;&uA4;&uB6;&uB3;&uBC;" ) );
    $sym44$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const45$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const46$wikipediaArticleName_Canonical = constant_handles.reader_make_constant_shell( makeString( "wikipediaArticleName-Canonical" ) );
    $kw47$GAF = makeKeyword( "GAF" );
    $const48$CycTermLearner_2010Edition = constant_handles.reader_make_constant_shell( makeString( "CycTermLearner-2010Edition" ) );
    $str49$Bad_name___S_contains__S = makeString( "Bad name: ~S contains ~S" );
    $str50$_home_baxter_logs_bogusly_lexifie = makeString( "/home/baxter/logs/bogusly-lexified-terms.cfasl" );
  }
}
/*
 * 
 * Total time: 537 ms
 * 
 */