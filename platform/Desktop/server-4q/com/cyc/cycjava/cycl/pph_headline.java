package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_headline
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_headline";
  public static final String myFingerPrint = "bc36e815edd9d5b9cc8af10c242728857b2a66051613ce36d194a2e38b0426d3";
  private static final SubLObject $const0$EnglishHeadlineParaphraseMt;
  private static final SubLSymbol $kw1$NONE;
  private static final SubLString $str2$Finished_generating__S;
  private static final SubLString $str3$Removed_extraneous_determiners___;
  private static final SubLString $str4$Removed_extraneous_copulas____S;
  private static final SubLString $str5$Tweaked_verb_tense____S;
  private static final SubLSymbol $sym6$_EXIT;
  private static final SubLString $str7$the_;
  private static final SubLString $str8$Updating_string_from__S___to__S;
  private static final SubLString $str9$Complement___S;
  private static final SubLObject $const10$passiveParticiple;
  private static final SubLString $str11$not;
  private static final SubLString $str12$not_;
  private static final SubLString $str13$Removing_copula_from__S;
  private static final SubLString $str14$Not_removing_copula_with_compleme;
  private static final SubLObject $const15$pastTense_Generic;
  private static final SubLList $list16;
  private static final SubLObject $const17$Verb;
  private static final SubLString $str18$Converting__S_to_present_tense;
  private static final SubLObject $const19$futureTense_Generic;
  private static final SubLList $list20;
  private static final SubLString $str21$to_;
  private static final SubLString $str22$Converting__S_to_infinitive;
  private static final SubLObject $const23$Indefinite_NLAttr;
  private static final SubLObject $const24$Definite_NLAttr;
  private static final SubLObject $const25$Some_NLAttr;
  private static final SubLObject $const26$Every_NLAttr;
  private static final SubLString $str27$_tmp_proof_conclusions_cfasl;
  private static final SubLSymbol $sym28$HYPOTHETICAL_TERM_P;
  private static final SubLSymbol $sym29$INVALID_FORT_;
  private static final SubLString $str30$_________________________________;
  private static final SubLInteger $int31$150;
  private static final SubLString $str32$_define_test_case_table_generate_;
  private static final SubLString $str33$_____S_____S___;
  private static final SubLString $str34$_;
  private static final SubLSymbol $sym35$GENERATE_ENGLISH_HEADLINE_STRING;
  private static final SubLSymbol $kw36$TEST;
  private static final SubLSymbol $kw37$OWNER;
  private static final SubLSymbol $kw38$CLASSES;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$KB;
  private static final SubLSymbol $kw41$FULL;
  private static final SubLSymbol $kw42$WORKING_;
  private static final SubLObject $list43;

  @SubLTranslatedFile.SubL(source = "cycl/pph-headline.lisp", position = 757L)
  public static SubLObject generate_english_headline_string(final SubLObject sentence, SubLObject domain_mt, SubLObject language_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = $const0$EnglishHeadlineParaphraseMt;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
    try
    {
      pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
      pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
      pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
      try
      {
        final SubLObject _prev_bind_0_$1 = pph_vars.$constant_link_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$2 = pph_vars.$html_generation_term_id_function$.currentBinding( thread );
        final SubLObject _prev_bind_2_$3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding( thread );
        final SubLObject _prev_bind_4 = pph_vars.$pph_significant_digits_cutoff$.currentBinding( thread );
        try
        {
          pph_vars.$constant_link_function$.bind( $kw1$NONE, thread );
          pph_vars.$html_generation_term_id_function$.bind( NIL, thread );
          pph_vars.$pph_use_bulleted_listsP$.bind( NIL, thread );
          pph_vars.$pph_significant_digits_cutoff$.bind( THREE_INTEGER, thread );
          final SubLObject v_pph_phrase = pph_phrase.new_pph_phrase_for_cycl( sentence, UNPROVIDED, UNPROVIDED );
          SubLObject string = NIL;
          SubLObject result_agr_pred = NIL;
          SubLObject justification = NIL;
          SubLObject output_list = NIL;
          SubLObject demerits = NIL;
          final SubLObject _prev_bind_0_$2 = pph_vars.$generation_level$.currentBinding( thread );
          try
          {
            pph_vars.$generation_level$.bind( number_utilities.f_1X( pph_vars.$generation_level$.getDynamicValue( thread ) ), thread );
            pph_main.pph_phrase_generate( v_pph_phrase, pph_vars.maybe_temporally_qualify_pph_language_mt( language_mt ), domain_mt, UNPROVIDED );
          }
          finally
          {
            pph_vars.$generation_level$.rebind( _prev_bind_0_$2, thread );
          }
          if( NIL != pph_phrase.pph_phrase_doneP( v_pph_phrase ) )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str2$Finished_generating__S, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            if( NIL != pph_headline_remove_extraneous_determiners( v_pph_phrase ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str3$Removed_extraneous_determiners___, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            if( NIL != pph_headline_remove_extraneous_copulas( v_pph_phrase ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str4$Removed_extraneous_copulas____S, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            if( NIL != pph_headline_tweak_head_verb_tense( v_pph_phrase ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str5$Tweaked_verb_tense____S, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            string = apply_headline_capitalization( pph_string.pph_string_if_non_null_to_output_format( pph_phrase.pph_phrase_string( v_pph_phrase, T ), UNPROVIDED ) );
            result_agr_pred = pph_phrase.pph_phrase_agr_pred( v_pph_phrase );
            justification = pph_phrase.pph_phrase_justification( v_pph_phrase );
            output_list = pph_phrase.pph_phrase_output_list( v_pph_phrase );
            demerits = pph_phrase.pph_phrase_demerits( v_pph_phrase );
          }
          return Values.values( string, result_agr_pred, justification, output_list, demerits );
        }
        finally
        {
          pph_vars.$pph_significant_digits_cutoff$.rebind( _prev_bind_4, thread );
          pph_vars.$pph_use_bulleted_listsP$.rebind( _prev_bind_2_$3, thread );
          pph_vars.$html_generation_term_id_function$.rebind( _prev_bind_1_$2, thread );
          pph_vars.$constant_link_function$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          pph_macros.destroy_new_pph_phrases();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_3, thread );
      pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_2, thread );
      pph_macros.$new_pph_phrases$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-headline.lisp", position = 2348L)
  public static SubLObject pph_headline_remove_extraneous_determiners(final SubLObject v_pph_phrase)
  {
    SubLObject changedP = NIL;
    if( NIL != pph_phrase.pph_phrase_npP( v_pph_phrase ) && NIL == pph_phrase_resolution.pph_copular_complementP( v_pph_phrase ) && TWO_INTEGER.eql( pph_phrase.pph_phrase_dtr_count( v_pph_phrase ) ) )
    {
      final SubLObject detp = pph_phrase.pph_phrase_nth_dtr( v_pph_phrase, ZERO_INTEGER );
      if( NIL != pph_phrase_resolution.pph_phrase_detpP( detp ) && NIL != pph_detp_cycl_unnewsworthyP( pph_phrase.pph_phrase_cycl( detp, UNPROVIDED ) ) )
      {
        pph_phrase.pph_phrase_remove_dtr( v_pph_phrase, detp );
        changedP = T;
      }
    }
    else if( NIL != pph_utilities.pph_name_string_predP( pph_phrase.pph_phrase_agr_pred( v_pph_phrase ) ) && NIL != string_utilities.starts_with_by_test( pph_phrase.pph_phrase_string( v_pph_phrase, T ), $str7$the_,
        Symbols.symbol_function( EQUALP ) ) )
    {
      pph_phrase.pph_phrase_set_string( v_pph_phrase, string_utilities.pre_remove( pph_phrase.pph_phrase_string( v_pph_phrase, T ), $str7$the_, Symbols.symbol_function( EQUALP ) ) );
      changedP = T;
    }
    SubLObject dtr_num = ZERO_INTEGER;
    if( document.sign_constituents( v_pph_phrase ).isVector() )
    {
      final SubLObject vector_var = document.sign_constituents( v_pph_phrase );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject dtr;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        dtr = Vectors.aref( vector_var, element_num );
        if( NIL != pph_headline_remove_extraneous_determiners( dtr ) )
        {
          changedP = T;
        }
        dtr_num = Numbers.add( dtr_num, ONE_INTEGER );
      }
    }
    if( NIL != changedP && NIL != pph_phrase.pph_phrase_has_dtrsP( v_pph_phrase ) )
    {
      pph_finished_phrase_update_from_dtrs( v_pph_phrase );
    }
    return changedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-headline.lisp", position = 3471L)
  public static SubLObject pph_finished_phrase_update_from_dtrs(final SubLObject v_pph_phrase)
  {
    if( NIL == pph_phrase.pph_phrase_has_dtrsP( v_pph_phrase ) )
    {
      return NIL;
    }
    final SubLObject old_string = pph_phrase.pph_phrase_string( v_pph_phrase, UNPROVIDED );
    pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs( v_pph_phrase );
    final SubLObject new_string = pph_phrase.pph_phrase_output_list_string( pph_phrase.pph_phrase_output_list( v_pph_phrase ), UNPROVIDED );
    if( !old_string.equal( new_string ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str8$Updating_string_from__S___to__S, pph_string.pph_string_to_utf8( old_string ), pph_string.pph_string_to_utf8( new_string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-headline.lisp", position = 3994L)
  public static SubLObject pph_headline_remove_extraneous_copulas(final SubLObject v_pph_phrase)
  {
    if( NIL != pph_phrase.pph_copula_phraseP( pph_phrase.pph_phrase_head_dtr( v_pph_phrase ) ) )
    {
      final SubLObject head_dtr_num = pph_phrase.pph_phrase_head_dtr_num( v_pph_phrase );
      final SubLObject comp_dtr_num = number_utilities.f_1X( head_dtr_num );
      final SubLObject complement = pph_phrase.pph_phrase_dtr_count( v_pph_phrase ).numG( comp_dtr_num ) ? pph_phrase.pph_phrase_nth_dtr( v_pph_phrase, comp_dtr_num ) : NIL;
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str9$Complement___S, complement, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != pph_phrase.pph_det_nbarP( complement ) || NIL != pph_utilities.pph_genl_pos_predP( pph_phrase.pph_phrase_agr_pred( complement ), $const10$passiveParticiple, UNPROVIDED ) || NIL != pph_phrase
          .pph_phrase_ppP( complement ) || NIL != pph_phrase.pph_phrase_adjpP( complement ) || NIL != pph_phrase.pph_phrase_adjP( complement ) || pph_phrase.pph_phrase_string( complement, NIL ).equal( $str11$not )
          || NIL != string_utilities.starts_with( pph_phrase.pph_phrase_string( complement, NIL ), $str12$not_ ) )
      {
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str13$Removing_copula_from__S, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        pph_phrase.pph_phrase_remove_dtr( v_pph_phrase, pph_phrase.pph_phrase_head_dtr( v_pph_phrase ) );
        pph_phrase.pph_phrase_set_head_dtr_num( v_pph_phrase, NIL );
        pph_finished_phrase_update_from_dtrs( v_pph_phrase );
        return T;
      }
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str14$Not_removing_copula_with_compleme, complement, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    if( NIL != pph_phrase.pph_phrase_has_dtrsP( v_pph_phrase ) && NIL != pph_phrase.pph_phrase_head_dtr( v_pph_phrase ) && NIL != pph_phrase.pph_phrase_sP( pph_phrase.pph_phrase_head_dtr( v_pph_phrase ) )
        && NIL != pph_headline_remove_extraneous_copulas( pph_phrase.pph_phrase_head_dtr( v_pph_phrase ) ) )
    {
      pph_finished_phrase_update_from_dtrs( v_pph_phrase );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-headline.lisp", position = 5349L)
  public static SubLObject pph_headline_tweak_head_verb_tense(final SubLObject v_pph_phrase)
  {
    final SubLObject head_dtr = pph_phrase.pph_phrase_lexical_head_dtr( v_pph_phrase );
    final SubLObject head_wu = ( NIL != head_dtr ) ? pph_phrase.pph_phrase_wu( head_dtr, UNPROVIDED ) : NIL;
    if( NIL != head_wu )
    {
      if( NIL != pph_utilities.pph_genl_pos_predP( pph_phrase.pph_phrase_agr_pred( head_dtr ), $const15$pastTense_Generic, UNPROVIDED ) )
      {
        final SubLObject subj = pph_phrase_resolution.pph_phrase_agr_target_phrase( head_dtr, v_pph_phrase );
        final SubLObject new_pred = ( NIL != subj ) ? pph_phrase_resolution.verb_pred_for_subject( subj, $list16 ) : NIL;
        final SubLObject new_string = ( NIL != new_pred ) ? pph_methods_lexicon.pph_first_string_of_wordXspeech_part( head_wu, $const17$Verb, ConsesLow.list( new_pred ), UNPROVIDED ) : NIL;
        if( NIL != new_string )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str18$Converting__S_to_present_tense, head_dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          pph_phrase.pph_phrase_set_string( head_dtr, new_string );
          pph_finished_phrase_update_from_dtrs( v_pph_phrase );
          return T;
        }
      }
      else if( NIL != pph_utilities.pph_genl_pos_predP( pph_phrase.pph_phrase_agr_pred( head_dtr ), $const19$futureTense_Generic, UNPROVIDED ) )
      {
        final SubLObject subj = pph_phrase_resolution.pph_phrase_agr_target_phrase( head_dtr, UNPROVIDED );
        final SubLObject new_pred = ( NIL != subj ) ? pph_phrase_resolution.verb_pred_for_subject( subj, $list20 ) : NIL;
        final SubLObject inf = pph_methods_lexicon.pph_first_string_of_wordXspeech_part( head_wu, $const17$Verb, ConsesLow.list( new_pred ), UNPROVIDED );
        final SubLObject new_string2 = ( NIL != inf ) ? Sequences.cconcatenate( $str21$to_, inf ) : NIL;
        if( NIL != new_string2 )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str22$Converting__S_to_infinitive, head_dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          pph_phrase.pph_phrase_set_string( head_dtr, new_string2 );
          pph_finished_phrase_update_from_dtrs( v_pph_phrase );
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-headline.lisp", position = 6676L)
  public static SubLObject pph_detp_cycl_unnewsworthyP(final SubLObject det_cycl)
  {
    if( det_cycl.eql( $const23$Indefinite_NLAttr ) || det_cycl.eql( $const24$Definite_NLAttr ) || det_cycl.eql( $const25$Some_NLAttr ) || det_cycl.eql( $const26$Every_NLAttr ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-headline.lisp", position = 6871L)
  public static SubLObject apply_headline_capitalization(final SubLObject string)
  {
    return string_utilities.char_subst( Characters.CHAR_quote, Characters.CHAR_quotation, string_utilities.capitalize_smart( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-headline.lisp", position = 6983L)
  public static SubLObject print_headlines(SubLObject proof_conclusions)
  {
    if( proof_conclusions == UNPROVIDED )
    {
      proof_conclusions = cfasl_utilities.cfasl_load( $str27$_tmp_proof_conclusions_cfasl );
    }
    SubLObject cdolist_list_var = proof_conclusions;
    SubLObject proof_conclusion = NIL;
    proof_conclusion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == cycl_utilities.expression_find_if( $sym28$HYPOTHETICAL_TERM_P, proof_conclusion, UNPROVIDED, UNPROVIDED ) && NIL == cycl_utilities.expression_find_if( $sym29$INVALID_FORT_, proof_conclusion, UNPROVIDED,
          UNPROVIDED ) )
      {
        final SubLObject content = proof_view_news.proof_view_headline_content( proof_conclusion, UNPROVIDED );
        final SubLObject headline = ( NIL != content ) ? unicode_strings.html_escaped_to_utf8_string( generate_english_headline_string( content, UNPROVIDED, UNPROVIDED ) ) : NIL;
        if( NIL != headline )
        {
          format_nil.force_format( T, $str30$_________________________________, proof_conclusion, headline, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      proof_conclusion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-headline.lisp", position = 7686L)
  public static SubLObject print_headline_test_case_table(SubLObject proof_conclusions)
  {
    if( proof_conclusions == UNPROVIDED )
    {
      proof_conclusions = cfasl_utilities.cfasl_load( $str27$_tmp_proof_conclusions_cfasl );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = Errors.$ignore_warnsP$.currentBinding( thread );
    try
    {
      Errors.$ignore_warnsP$.bind( T, thread );
      final SubLObject max_length = $int31$150;
      format_nil.force_format( T, $str32$_define_test_case_table_generate_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = proof_conclusions;
      SubLObject proof_conclusion = NIL;
      proof_conclusion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == assertions_high.invalid_assertionP( proof_conclusion, UNPROVIDED ) && NIL == cycl_utilities.expression_find_if( $sym28$HYPOTHETICAL_TERM_P, proof_conclusion, T, UNPROVIDED ) && NIL == cycl_utilities
            .expression_find_if( $sym29$INVALID_FORT_, proof_conclusion, T, UNPROVIDED ) )
        {
          final SubLObject _prev_bind_0_$6 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
          try
          {
            pph_vars.$pph_demerit_cutoff$.bind( TWO_INTEGER, thread );
            final SubLObject content = proof_view_news.proof_view_headline_content( proof_conclusion, UNPROVIDED );
            final SubLObject headline = ( NIL != content ) ? generate_english_headline_string( content, UNPROVIDED, UNPROVIDED ) : NIL;
            if( NIL != headline && NIL != list_utilities.lengthLE( headline, max_length, UNPROVIDED ) )
            {
              format_nil.force_format( T, $str33$_____S_____S___, cycl_utilities.hl_to_el( content ), headline, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
          }
          finally
          {
            pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0_$6, thread );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        proof_conclusion = cdolist_list_var.first();
      }
      format_nil.force_format( T, $str34$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      Errors.$ignore_warnsP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_pph_headline_file()
  {
    SubLFiles.declareFunction( me, "generate_english_headline_string", "GENERATE-ENGLISH-HEADLINE-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "pph_headline_remove_extraneous_determiners", "PPH-HEADLINE-REMOVE-EXTRANEOUS-DETERMINERS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_finished_phrase_update_from_dtrs", "PPH-FINISHED-PHRASE-UPDATE-FROM-DTRS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_headline_remove_extraneous_copulas", "PPH-HEADLINE-REMOVE-EXTRANEOUS-COPULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_headline_tweak_head_verb_tense", "PPH-HEADLINE-TWEAK-HEAD-VERB-TENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_detp_cycl_unnewsworthyP", "PPH-DETP-CYCL-UNNEWSWORTHY?", 1, 0, false );
    SubLFiles.declareFunction( me, "apply_headline_capitalization", "APPLY-HEADLINE-CAPITALIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "print_headlines", "PRINT-HEADLINES", 0, 1, false );
    SubLFiles.declareFunction( me, "print_headline_test_case_table", "PRINT-HEADLINE-TEST-CASE-TABLE", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_pph_headline_file()
  {
    return NIL;
  }

  public static SubLObject setup_pph_headline_file()
  {
    generic_testing.define_test_case_table_int( $sym35$GENERATE_ENGLISH_HEADLINE_STRING, ConsesLow.list( new SubLObject[] { $kw36$TEST, Symbols.symbol_function( EQUAL ), $kw37$OWNER, NIL, $kw38$CLASSES, $list39,
      $kw40$KB, $kw41$FULL, $kw42$WORKING_, T
    } ), $list43 );
    return NIL;
  }

  private static SubLObject _constant_43_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TypeCapableFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "anatomicallyCapableOf" ) ) ), constant_handles.reader_make_constant_shell( makeString( "SparklingEnopeSquid" ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "WaveEmissionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "VisibleLight" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                "doneBy" ) ) ) ), makeString( "Firefly Squid Anatomically Capable of Glowing" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "causes-SubSitTypeSubSitType" ) ), constant_handles.reader_make_constant_shell( makeString( "SCerevisiaeMatingScript" ) ), constant_handles.reader_make_constant_shell( makeString(
                        "SecretionOfMatingFactorAlpha" ) ), constant_handles.reader_make_constant_shell( makeString( "MovementOfATypeCellTowardAlphaTypeCell" ) ) ) ), makeString(
                            "In Mating of S. Cerevisiae, Secretion of Mating Factor &#x3B1; Causes Moving toward an &#x3B1; Cell" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "ThomasPynchon" ) ), constant_handles.reader_make_constant_shell( makeString(
                                    "ArticulateOrEloquent" ) ) ) ), makeString( "Thomas Pynchon Fluent" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                        "sentenceTruth" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "knowsAbout" ) ), constant_handles.reader_make_constant_shell( makeString(
                                            "LudwigVanBeethoven" ) ), constant_handles.reader_make_constant_shell( makeString( "CityOfParisFrance" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                "False" ) ) ) ), makeString( "Ludwig Van Beethoven Does Not Know Something about Paris, France" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                    .reader_make_constant_shell( makeString( "goals" ) ), constant_handles.reader_make_constant_shell( makeString( "RepublicanParty-US" ) ), ConsesLow.list(
                                                        constant_handles.reader_make_constant_shell( makeString( "governmentType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                            "PalestinianWestBankAndGaza" ) ), constant_handles.reader_make_constant_shell( makeString( "DemocraticGeopoliticalEntity" ) ) ) ) ), makeString(
                                                                "Republican Party Has the Goal That [West Bank and Gaza Is in Democracy]" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                    .reader_make_constant_shell( makeString( "eventOccursAt" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                        "TerroristAttack-March-17-1992-Buenos-Aires" ) ), constant_handles.reader_make_constant_shell( makeString( "CityOfBuenosAiresArgentina" ) ) ) ),
                                                                    makeString(
                                                                        "March 17, 1992 Car Bombing of the Israeli Embassy in Buenos Aires, Argentina by the Lebanese Hizballah Happened in Buenos Aires, Argentina" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles.reader_make_constant_shell( makeString( "objectRemoved" ) ),
          constant_handles.reader_make_constant_shell( makeString( "Circumcision" ) ), constant_handles.reader_make_constant_shell( makeString( "AnimalBodyPart" ) ) ) ), makeString(
              "Body Parts Are Removed during Circumcisions" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "NoddingOff" ) ), constant_handles.reader_make_constant_shell( makeString( "Nodding-Gesture" ) ) ) ), makeString( "No Noddings Noddings" ) ), ConsesLow.list(
                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "typeBehaviorCapable-PerformedBy" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "Comedian" ) ), constant_handles.reader_make_constant_shell( makeString( "JokeTelling" ) ) ) ), makeString( "Instances of Comedians Are Typically Capable of Performing Told Jokes" ) ), ConsesLow
                              .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "typeIngredientTypes" ) ), constant_handles.reader_make_constant_shell( makeString(
                                  "Pizza" ) ), constant_handles.reader_make_constant_shell( makeString( "TomatoBasedSauce" ) ) ) ), makeString( "Pizza Includes Tomato Sauce" ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                      .list( constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), constant_handles.reader_make_constant_shell( makeString( "NatalieCurtis" ) ), ConsesLow.list(
                                          constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), EIGHT_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                              constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                  2003 ) ) ) ) ) ), makeString( "Natalie Curtis Born on December 8, 2003" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                      makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "EscherichiaColi" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                          "BiologicalAgentType" ) ) ) ), makeString( "E. Coli a Biological Agent" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                              .reader_make_constant_shell( makeString( "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                  "GlycogenBreakdown-CellularSignalingScript" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ActivationOfEnzymeTypeFn" ) ),
                                                                      constant_handles.reader_make_constant_shell( makeString( "PhosphorylaseKinaseMolecule" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                          "PhosphorylaseKinaseActivation-GlycogenBreakdownTransductionPathway" ) ) ) ), makeString(
                                                                              "Activation of Phosphorylase Kinase Required for Phosphorylase Kinase Activation to Take Place in Cellular Signaling That Results in Glycogen Breakdown" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "schooling" ) ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashington" ) ),
          constant_handles.reader_make_constant_shell( makeString( "WestPoint-EducationalOrganization" ) ), constant_handles.reader_make_constant_shell( makeString( "Enrolled" ) ) ) ), makeString(
              "George Washington Is Enrolled at United States Military Academy" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "doesBusinessWith" ) ),
                  constant_handles.reader_make_constant_shell( makeString( "Iran" ) ), constant_handles.reader_make_constant_shell( makeString( "TranspekIndustryLtd" ) ) ) ), makeString(
                      "Iran Does Business With Transpek Industry Ltd." ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "TwoByFour" ) ), constant_handles.reader_make_constant_shell(
                              makeString( "Foldable" ) ) ) ) ), makeString( "Two-by-four Not Type of Foldable Thing" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "sentenceTruth" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell(
                                      makeString( "objectPaidFor" ) ), constant_handles.reader_make_constant_shell( makeString( "Buying" ) ), constant_handles.reader_make_constant_shell( makeString( "Love" ) ) ),
                                  constant_handles.reader_make_constant_shell( makeString( "False" ) ) ) ), makeString( "Love Not Paid for in Buyings" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "supplyThroughAmountDuring" ) ), constant_handles.reader_make_constant_shell( makeString( "PlanetEarth" ) ), constant_handles
                                          .reader_make_constant_shell( makeString( "PetroleumProduct" ) ), constant_handles.reader_make_constant_shell( makeString( "StraitOfHormuz" ) ), ConsesLow.list( constant_handles
                                              .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1995 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                  "MillionBarrelsPerDay" ) ), FOURTEEN_INTEGER ) ) ), makeString(
                                                      "Earth Supply of Petroleum Product via the Strait of Hormuz during 1995 Is 14 Million Barrels per Day" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                          constant_handles.reader_make_constant_shell( makeString( "symptomOfAilment" ) ), constant_handles.reader_make_constant_shell( makeString( "PulmonaryEdema" ) ),
                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PoisoningViaSubstanceFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                              "Phosgene" ) ) ) ) ), makeString( "Pulmonary Edema a Symptom of Phosgene Poisoning" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                  .reader_make_constant_shell( makeString( "hasMembers" ) ), constant_handles.reader_make_constant_shell( makeString( "LebaneseHizballah" ) ),
                                                                  constant_handles.reader_make_constant_shell( makeString( "Terrorist-Harb-3" ) ) ) ), makeString( "Lebanese Hezbollah Has Hajj Khalil Harb as Member" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subOrganizations" ) ), constant_handles.reader_make_constant_shell( makeString( "AlQaida" ) ),
          constant_handles.reader_make_constant_shell( makeString( "JihadGroup" ) ) ) ), makeString( "New Jihad a Suborganization of Al-Qaeda" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "relationAllInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "flashPoint" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "MustardGas" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DegreeCelsius" ) ), makeInteger( 104 ) ) ) ), makeString( "Flash Point of Mustard Gas Is 104&#x2103;" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "admittedSentence" ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "behaviorCapable" ) ), constant_handles.reader_make_constant_shell( makeString( "Guyren" ) ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "BirthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Guyren" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                  "birthParent" ) ) ) ) ) ), makeString( "'Guyren Howe Is Capable of His Birth' Not a Well-formed Sentence" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                      .reader_make_constant_shell( makeString( "sopEventPertainsToObjectOnDate" ) ), constant_handles.reader_make_constant_shell( makeString( "OrionAssetWellStartupCriteriaSpecification" ) ),
                      constant_handles.reader_make_constant_shell( makeString( "WellProduction-Oil" ) ), constant_handles.reader_make_constant_shell( makeString( "Well-105P4-Orion" ) ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 40 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 40 ), ConsesLow
                              .list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), SEVENTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
                                  EIGHTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "April" ) ), ConsesLow
                                      .list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2011 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                          makeString( "SOPEventFn-NoDepth" ) ), constant_handles.reader_make_constant_shell( makeString( "OrionAssetWellStartupCriteriaSpecification" ) ), constant_handles
                                              .reader_make_constant_shell( makeString( "WellProduction-Oil" ) ), constant_handles.reader_make_constant_shell( makeString( "Well-105P4-Orion" ) ), ConsesLow.list(
                                                  constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 40 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                      "MinuteFn" ) ), makeInteger( 40 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), SEVENTEEN_INTEGER, ConsesLow.list(
                                                          constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), EIGHTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "April" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                  "YearFn" ) ), makeInteger( 2011 ) ) ) ) ) ) ) ) ) ), makeString( "Oil Production in Orion 105-P4" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                      constant_handles.reader_make_constant_shell( makeString( "objectTypePlayingRoleInTypeHasPartTypeLackingInObjectTypePlayingRoleInEventType" ) ),
                                                                      constant_handles.reader_make_constant_shell( makeString( "EukaryoticCell" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                          "locusOfCellularProcess-Cell" ) ), constant_handles.reader_make_constant_shell( makeString( "Anaphase" ) ), constant_handles
                                                                              .reader_make_constant_shell( makeString( "MitoticSpindle" ) ), constant_handles.reader_make_constant_shell( makeString( "EukaryoticCell" ) ),
                                                                      constant_handles.reader_make_constant_shell( makeString( "locusOfCellularProcess-Cell" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                          "InterphaseOfEukaryoticCellCycle" ) ) ) ), makeString( "Eukaryotic Cells Have Mitotic Spindles during Anaphase but Not during Interphase" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), constant_handles.reader_make_constant_shell( makeString( "Cyc" ) ), makeString(
          "Cyc" ) ) ), makeString( "Cyc Is Named 'Cyc'" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TypeCapableFn" ) ), constant_handles
              .reader_make_constant_shell( makeString( "behaviorCapable" ) ) ), constant_handles.reader_make_constant_shell( makeString( "Bat-Mammal" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "Flying-FlappingWings" ) ), constant_handles.reader_make_constant_shell( makeString( "doneBy" ) ) ) ), makeString( "Bats Are Capable of Flying by Flapping Wings" ) ), ConsesLow.list( ConsesLow.list(
                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), constant_handles.reader_make_constant_shell( makeString( "Currency" ) ), constant_handles
                          .reader_make_constant_shell( makeString( "PlantPart" ) ) ) ), makeString( "No Currency a Plant Part" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "conceptuallyRelated" ) ), constant_handles
                                  .reader_make_constant_shell( makeString( "Dog" ) ), constant_handles.reader_make_constant_shell( makeString( "DogFood" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                      makeString( "conceptuallyRelated" ) ), constant_handles.reader_make_constant_shell( makeString( "DogFood" ) ), constant_handles.reader_make_constant_shell( makeString(
                                          "Dog" ) ) ) ) ), makeString(
                                              "Either the Concept 'dog' Is Conceptually Related to the Concept 'dog Food' or the Concept 'dog Food' Is Conceptually Related to the Concept 'dog'" ) ), ConsesLow.list(
                                                  ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                      .reader_make_constant_shell( makeString( "TypeCapableFn" ) ), constant_handles.reader_make_constant_shell( makeString( "behaviorCapable" ) ) ), constant_handles
                                                          .reader_make_constant_shell( makeString( "Automobile" ) ), constant_handles.reader_make_constant_shell( makeString( "GoingToSleep" ) ), constant_handles
                                                              .reader_make_constant_shell( makeString( "bodilyDoer" ) ) ) ) ), makeString( "Cars Not Capable of Going to Sleep" ) ), ConsesLow.list( ConsesLow.list(
                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "damages" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                      "TerroristAttack-November-19-1995-Islamabad-Pakistan" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                          "EmbassyBuildingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Indonesia-TheNation" ) ), constant_handles
                                                                              .reader_make_constant_shell( makeString( "CityOfIslamabadPakistan" ) ) ) ) ), makeString(
                                                                                  "Islamabad, Pakistan Terrorist Attack on November 19, 1995 Damaged Indonesian Embassy in Islamabad, Pakistan" ) ), ConsesLow.list(
                                                                                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "properSubEventTypes" ) ), constant_handles
                                                                                          .reader_make_constant_shell( makeString( "InterphaseOfEukaryoticCellCycle" ) ), constant_handles.reader_make_constant_shell(
                                                                                              makeString( "Replication-DNA" ) ) ) ), makeString( "Interphase Involves DNA Replication" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sizeParameterOfObject" ) ), constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "PlanetEarth" ) ), ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "MetricTon" ) ), makeDouble( 6.0E21 ) ) ) ), makeString(
                                                                                                              "Mass of Earth Is 6 &#xD7; 10<sup>21</sup> Metric Tons" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "partTypeCount" ) ), ConsesLow.list(
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "EntityOfTypeBetweenStagesFn" ) ),
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "EukaryoticCell" ) ), constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "Mitosis" ) ), constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "Prometaphase" ) ), constant_handles
                                                                                                                                  .reader_make_constant_shell( makeString( "Metaphase" ) ) ), constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "CellNucleus" ) ), ZERO_INTEGER ) ),
                                                                                                                  makeString(
                                                                                                                      "Eukaryotic Cells between the Prometaphase and Metaphase Stages of Mitosis Lack Cell Nuclei" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "positionOfPersonInOrganization" ) ), constant_handles.reader_make_constant_shell( makeString(
          "MarthaStewart" ) ), constant_handles.reader_make_constant_shell( makeString( "MarthaStewartLivingOmnimedia" ) ), constant_handles.reader_make_constant_shell( makeString( "OfficerInOrganization" ) ) ) ),
          makeString( "Martha Stewart Holds Position of Officer at Martha Stewart Living Omnimedia" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "spokesmanFor" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn-Ternary" ) ), makeString( "Iranian Hezbollah" ), constant_handles.reader_make_constant_shell(
                  makeString( "Organization" ) ), makeString( "1a571fca-17bc-41d9-861b-eeda621be215" ) ), constant_handles.reader_make_constant_shell( makeString( "Terrorist-Mojtaba-Bigdeli" ) ) ) ), makeString(
                      "Mojtaba Bigdeli a Spokesperson for Iranian Hezbollah" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "distanceBetween" ) ),
                          constant_handles.reader_make_constant_shell( makeString( "AxialNorthPoleOfEarth" ) ), constant_handles.reader_make_constant_shell( makeString( "AxialSouthPoleOfEarth" ) ), ConsesLow.list(
                              constant_handles.reader_make_constant_shell( makeString( "Mile" ) ), makeDouble( 12506.397610602144 ) ) ) ), makeString(
                                  "Shortest Distance between North Pole and South Pole Is 12,500 Miles" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "performedBy" ) ), constant_handles.reader_make_constant_shell( makeString( "HezbollahRocketAttacksOnNorthernIsrael-July132006" ) ), constant_handles.reader_make_constant_shell(
                                          makeString( "LebaneseHizballah" ) ) ) ), makeString( "Lebanese Hezbollah Deliberately Performed the July 13th Rocket Attacks on Northern Israel" ) ), ConsesLow.list( ConsesLow
                                              .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                  "MtSpace" ) ), constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) ), ConsesLow.list( constant_handles
                                                      .reader_make_constant_shell( makeString( "MtTimeWithGranularityDimFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                          makeInteger( 2000 ) ), constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                              makeString( "numberOfInhabitants" ) ), constant_handles.reader_make_constant_shell( makeString( "PlanetEarth" ) ), makeInteger( "6233821945" ) ) ) ),
                                              makeString( "Current World Data Collector Knowledge (in 2000): the Population of Earth Is 6,230,000,000" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles.reader_make_constant_shell( makeString( "subSituations" ) ), constant_handles
                                                      .reader_make_constant_shell( makeString( "Event" ) ), constant_handles.reader_make_constant_shell( makeString( "Event" ) ) ) ), makeString(
                                                          "Events Are Part of Events" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "eventOccursAt" ) ),
                                                              constant_handles.reader_make_constant_shell( makeString( "WTCTerroristAttackSept2001" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                  "NewYork-State" ) ) ) ), makeString( "September 11 Attack on the WTC Happened in New York State" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                      constant_handles.reader_make_constant_shell( makeString( "equals" ) ), constant_handles.reader_make_constant_shell( makeString( "MarkTwain" ) ),
                                                                      constant_handles.reader_make_constant_shell( makeString( "SamuelClemens" ) ) ) ), makeString( "Mark Twain Identical to Samuel Clemens" ) ), ConsesLow
                                                                          .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "citizens-Birth" ) ), constant_handles
                                                                              .reader_make_constant_shell( makeString( "IrishRepublic" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                  "Terrorist-Ferris" ) ) ) ), makeString( "Martin Ferris a Citizen by Birth of Ireland" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                      constant_handles.reader_make_constant_shell( makeString( "perpetrator" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                          "TerroristAttack-January-1-1996-Colombia" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                              "RevolutionaryArmedForcesOfColombia" ) ) ) ), makeString(
                                                                                                  "Revolutionary Armed Forces of Colombia a Perpetrator in Terrorist Attack in Colombia on January 1, 1996" ) ), ConsesLow
                                                                                                      .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "hasBeliefSystems" ) ), constant_handles.reader_make_constant_shell( makeString( "RedArmyFaction" ) ),
                                                                                                          constant_handles.reader_make_constant_shell( makeString( "Communism" ) ) ) ), makeString(
                                                                                                              "Red Army Faction Believes in Communism" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "frequentlyInContactWith" ) ), constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "Terrorist-Fazul" ) ), constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "Terrorist-Mohamed-3" ) ) ) ), makeString(
                                                                                                                              "Fazul Mohammed Is Frequently in Contact With Ali Mohamed" ) ), ConsesLow.list( ConsesLow
                                                                                                                                  .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "partTypeCount" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "DuplicatedChromosome" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                              makeString( "DNAMolecule" ) ), TWO_INTEGER ) ), makeString(
                                                                                                                                                  "Duplicated Chromosomes Have 2 DNA Molecules as Parts" ) ), ConsesLow
                                                                                                                                                      .list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "languageSpoken" ) ),
                                                                                                                                                          constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                              "JenniferSullivan" ) ), constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                      "EnglishLanguage" ) ) ) ), makeString(
                                                                                                                                                                          "Jennifer Sullivan Speaks English" ) ), ConsesLow
                                                                                                                                                                              .list( ConsesLow.list( ConsesLow.list(
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "genls" ) ),
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "Chicken-Meat" ) ),
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "Meat" ) ) ) ),
                                                                                                                                                                                  makeString(
                                                                                                                                                                                      "Chicken Meat a Type of Meat" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "primarySupervisor" ) ), constant_handles.reader_make_constant_shell( makeString( "Brett" ) ),
          constant_handles.reader_make_constant_shell( makeString( "ABelasco" ) ) ) ), makeString( "Brett Summers's Primary Supervisor Is Alan Belasco" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString( "Mitosis" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "ChromosomeLinesUpAtMetaphasePlate" ) ), constant_handles.reader_make_constant_shell( makeString( "Anaphase" ) ) ) ), makeString(
                      "Lining Up of Chromosome along the Metaphase Plate Required for Anaphase to Take Place in Mitosis" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "TerroristAttack-March-31-2003-Bologna-Italy" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                              makeString( "UnsuccessfulAttemptToFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ProperSubcollectionNamedFn-Ternary" ) ), makeString(
                                  "attack the headquarters of IBM in Bologna" ), constant_handles.reader_make_constant_shell( makeString( "ActionOnObject" ) ), makeString(
                                      "33f6a954-f4ed-11d9-9bea-0002b3a85b0b" ) ) ) ) ), makeString(
                                          "Bologna, Italy Terrorist Attack on March 31, 2003 an Unsuccessful Attempt to Perform Attack the Headquarters of IBM in Bologna" ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                              .list( constant_handles.reader_make_constant_shell( makeString( "sentenceTruth" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                  "relationExistsExists" ) ), constant_handles.reader_make_constant_shell( makeString( "ailmentConditionAffects" ) ), constant_handles.reader_make_constant_shell(
                                                      makeString( "TesticularCancer" ) ), constant_handles.reader_make_constant_shell( makeString( "AdultFemaleHuman" ) ) ), constant_handles.reader_make_constant_shell(
                                                          makeString( "False" ) ) ) ), makeString( "No Testicular Cancer Afflicts Any Woman" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                              .reader_make_constant_shell( makeString( "preferredNameString" ) ), constant_handles.reader_make_constant_shell( makeString( "Terrorist-Abayla" ) ),
                                                              makeString( "Hassan Abayla" ) ) ), makeString( "'Hassan Abayla' a Preferred Name for Hassan Abayla" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                  constant_handles.reader_make_constant_shell( makeString( "laterThan" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                      "Tomorrow-Indexical" ) ), constant_handles.reader_make_constant_shell( makeString( "Today-Indexical" ) ) ) ), makeString(
                                                                          "Tomorrow Later than Today" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "evaluate" ) ), makeString( "06-21-2004" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DateEncodeStringFn" ) ),
                                                                                  makeString( "MM-DD-YYYY" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 21 ),
                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                          makeString( "June" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                              2004 ) ) ) ) ) ) ), makeString( "The String Encoding June 21, 2004 Using the Template MM-DD-YYYY Is 06-21-2004" ) ), ConsesLow
                                                                                                  .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                      "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString( "Mitosis" ) ),
                                                                                                      constant_handles.reader_make_constant_shell( makeString( "SisterChromatidsCutByEnzyme-Mitosis" ) ), constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "Telophase" ) ) ) ), makeString(
                                                                                                              "Sister Chromatid Separation Required for Telophase to Take Place in Mitosis" ) ), ConsesLow.list( ConsesLow
                                                                                                                  .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                      "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "EukaryoticCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                              "MCheckpoint" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                  "Anaphase" ) ) ) ), makeString(
                                                                                                                                      "M Checkpoint Required for Anaphase to Take Place in Eukaryotic Cell Cycle" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "residenceOfOrganization" ) ), constant_handles.reader_make_constant_shell( makeString(
          "HarakatUl-Mujahedin" ) ), constant_handles.reader_make_constant_shell( makeString( "Pakistan" ) ) ) ), makeString( "Harakat Ul-Mujahedin's Headquarters in Pakistan" ) ), ConsesLow.list( ConsesLow.list(
              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Terrorist-al-Zarqawi" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "EthnicGroupOfArabs" ) ) ) ), makeString( "Abu Musab al-Zarqawi an Arab" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                      .reader_make_constant_shell( makeString( "relationAllInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "awardSignifiesAchievementInSport" ) ), constant_handles
                          .reader_make_constant_shell( makeString( "HeismanAward" ) ), constant_handles.reader_make_constant_shell( makeString( "Football-American" ) ) ) ), makeString(
                              "Heisman Award Signifies Achievement in Football" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ),
                                  TWELVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SquareRootFn" ) ), makeInteger( 144 ) ) ) ), makeString( "Square Root of 144 = 12" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equivalentRolePlayersOfType-SitTypeToSubSitType" ) ), constant_handles.reader_make_constant_shell(
          makeString( "InterphaseOfEukaryoticCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString( "actors" ) ), constant_handles.reader_make_constant_shell( makeString( "SPhase" ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "SubEventRoleFn" ) ), constant_handles.reader_make_constant_shell( makeString( "outputsCreated" ) ) ), constant_handles.reader_make_constant_shell(
                  makeString( "DuplicatedChromosome" ) ) ) ), makeString( "Duplicated Chromosome That Plays Output Created Role in S Phase during Interphase to Play Actor Role in That Interphase" ) ), ConsesLow.list(
                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mostGeneralCoveringOfEventType" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "InterphaseOfEukaryoticCellCycle" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "G1Phase" ) ), constant_handles.reader_make_constant_shell( makeString( "SPhase" ) ), constant_handles.reader_make_constant_shell( makeString( "G2Phase" ) ) ) ) ), makeString(
                                  "The most General Way to Decompose Interphase Is as a Sequence of G&#x2081; Phase, S Phase, and G&#x2082; Phase" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "hates" ) ), constant_handles.reader_make_constant_shell( makeString( "AbuZubaydah" ) ), constant_handles.reader_make_constant_shell(
                                          makeString( "GeorgeWBush" ) ) ) ), makeString( "Abu Zubaydah Hates George W. Bush" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                              .reader_make_constant_shell( makeString( "sitTypeHasSubSitTypeUsingOutputFromSubSitType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                  "EukaryoticCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString( "Anaphase" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                      "InterphaseOfEukaryoticCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString( "DuplicatedChromosome" ) ) ) ), makeString(
                                                          "In Eukaryotic Cell Cycles, Duplicated Chromosomes Created during Interphase Subsequently Used in Anaphase" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                              constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                  "physicalDecompositions" ) ), constant_handles.reader_make_constant_shell( makeString( "EukaryoticChromosome" ) ), constant_handles
                                                                      .reader_make_constant_shell( makeString( "Chromatin" ) ) ) ), makeString( "Eukaryotic Chromosomes Contain Chromatin" ) ), ConsesLow.list( ConsesLow
                                                                          .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), constant_handles.reader_make_constant_shell(
                                                                              makeString( "BlackColor" ) ), constant_handles.reader_make_constant_shell( makeString( "Swan" ) ) ) ), makeString( "No Swan Black" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ),
          constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), constant_handles
              .reader_make_constant_shell( makeString( "Now" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "hasBeliefSystems" ) ), constant_handles.reader_make_constant_shell( makeString( "ChrisDeaton" ) ), constant_handles.reader_make_constant_shell( makeString( "Christianity" ) ) ) ) ) ),
          makeString( "Cyc's Knowledge about Cyclists (at Present): Chris Deaton Does Not Believe in Christianity" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
              makeString( "majorReligions" ) ), constant_handles.reader_make_constant_shell( makeString( "India" ) ), constant_handles.reader_make_constant_shell( makeString( "Hinduism" ) ) ) ), makeString(
                  "Hinduism a Major Religion in India" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "animalInjuredIn" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "HizballahUSEmbassyAttack-1984" ) ), constant_handles.reader_make_constant_shell( makeString( "Person-91" ) ) ) ), makeString(
                          "Reginald Bartholomew Injured during Beirut Terrorist Attack on September 20, 1984" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "evaluate" ) ), SEVEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "DifferenceFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), FIVE_INTEGER, SIX_INTEGER ), NINE_INTEGER ), ConsesLow.list(
                                      constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), ONE_INTEGER, TWO_INTEGER ) ) ) ), makeString( "((5 &#xD7; 6) &#x2212; 9) &#xF7; (1 + 2) = 7" ) ), ConsesLow
                                          .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllInstanceInstance-Conditional-CeterisParibus" ) ), constant_handles
                                              .reader_make_constant_shell( makeString( "EukaryoticCell" ) ), constant_handles.reader_make_constant_shell( makeString( "hasPartTypes" ) ), constant_handles
                                                  .reader_make_constant_shell( makeString( "EarlyMitoticSpindle" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                      "QuantifiedVersionOfBinaryPredicateFn" ) ), constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), ConsesLow.list( constant_handles
                                                          .reader_make_constant_shell( makeString( "InverseBinaryPredicateFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "PresentTenseVersionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "locusOfCellularProcess-Cell" ) ) ) ) ), constant_handles
                                                                  .reader_make_constant_shell( makeString( "Prophase" ) ) ) ), makeString( "Eukaryotic Cell With Early Mitotic Spindle Undergoing Prophase" ) ), ConsesLow
                                                                      .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                          "objectTypePlayingRoleInTypeHasPartTypeLackingInObjectTypePlayingRoleInEventType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                              "EukaryoticCell" ) ), constant_handles.reader_make_constant_shell( makeString( "locusOfCellularProcess-Cell" ) ), constant_handles
                                                                                  .reader_make_constant_shell( makeString( "G1Phase" ) ), constant_handles.reader_make_constant_shell( makeString( "CellNucleus" ) ),
                                                                          constant_handles.reader_make_constant_shell( makeString( "EukaryoticCell" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                              "locusOfCellularProcess-Cell" ) ), constant_handles.reader_make_constant_shell( makeString( "Anaphase" ) ) ) ), makeString(
                                                                                  "Eukaryotic Cells Have Cell Nuclei during G&#x2081; Phase but Not during Anaphase" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                      constant_handles.reader_make_constant_shell( makeString( "organizationKeyMembers" ) ), constant_handles.reader_make_constant_shell(
                                                                                          makeString( "LebaneseHizballah" ) ), constant_handles.reader_make_constant_shell( makeString( "Terrorist-Mohtashemi" ) ) ) ),
                                                                                      makeString( "Ali Mohtashemi-Pour a Key Member of Lebanese Hezbollah" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                          constant_handles.reader_make_constant_shell( makeString( "sentenceTruth" ) ), ConsesLow.list( constant_handles
                                                                                              .reader_make_constant_shell( makeString( "brothers" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                  "MarkTwain" ) ), constant_handles.reader_make_constant_shell( makeString( "SamuelClemens" ) ) ), constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "False" ) ) ) ), makeString(
                                                                                                          "Mark Twain's Brothers Do Not Include Samuel Clemens" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                              constant_handles.reader_make_constant_shell( makeString( "hasLeadershipPosition" ) ), constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "Imhausen-ChemieAG" ) ), constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "JurgenHippenstiel-Imhausen" ) ) ) ), makeString(
                                                                                                                          "Jurgen Hippenstiel-Imhausen Has Leadership Responsibilities in Imhausen-Chemie" ) ), ConsesLow
                                                                                                                              .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                  makeString( "birthDate" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "OsamaBinLaden" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                          makeString( "YearFn" ) ), makeInteger( 1957 ) ) ) ), makeString(
                                                                                                                                              "Osama Bin Laden Born in 1957" ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                                                                                                  .list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "residenceOfOrganization" ) ), constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "DeltaGScientific" ) ),
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                          "RepublicOfSouthAfrica" ) ) ) ), makeString(
                                                                                                                                                              "Delta G Scientific's Headquarters in South Africa" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "perpetrator" ) ), constant_handles.reader_make_constant_shell( makeString(
          "TerroristAttack-November-8-2003-Riyadh-Saudi-Arabia" ) ), constant_handles.reader_make_constant_shell( makeString( "AlQaida" ) ) ) ), makeString(
              "Al-Qaeda a Perpetrator in Riyadh, Saudi Arabia Terrorist Attack on November 8, 2003" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "distanceBetween" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TerritoryFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CityOfAustinTX" ) ) ),
                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TerritoryFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CityOfLosAngelesCA" ) ) ), ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "Mile" ) ), makeDouble( 1241.7095986680342 ) ) ) ), makeString( "Shortest Distance between Austin and Los Angeles Is 1240 Miles" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString(
          "MitoticPhaseOfCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString( "SisterChromatidsCutByEnzyme-Mitosis" ) ), constant_handles.reader_make_constant_shell( makeString( "Telophase" ) ) ) ),
          makeString( "Sister Chromatid Separation Required for Telophase to Take Place in M Phase" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString( "MitoticPhaseOfCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "ChromosomeLinesUpAtMetaphasePlate" ) ), constant_handles.reader_make_constant_shell( makeString( "Anaphase" ) ) ) ), makeString(
                      "Lining Up of Chromosome along the Metaphase Plate Required for Anaphase to Take Place in M Phase" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString( "EukaryoticCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "G2Checkpoint" ) ), constant_handles.reader_make_constant_shell( makeString( "MitoticPhaseOfCellCycle" ) ) ) ), makeString(
                                  "G2 Checkpoint Required for M Phase to Take Place in Eukaryotic Cell Cycle" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "coveringOfEventType" ) ), constant_handles.reader_make_constant_shell( makeString( "Anaphase" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "TheList" ) ), constant_handles.reader_make_constant_shell( makeString( "AnaphaseA" ) ), constant_handles.reader_make_constant_shell( makeString( "AnaphaseB" ) ) ) ) ),
                                      makeString( "Anaphase a Sequence of Anaphase A, Anaphase B" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "disjointWith" ) ), constant_handles.reader_make_constant_shell( makeString( "Stinger" ) ), constant_handles.reader_make_constant_shell( makeString( "Scorpion" ) ) ) ),
                                          makeString( "No Stinger a Scorpion" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                              "ratioOfCollectionToDifferentiatedCollection" ) ), constant_handles.reader_make_constant_shell( makeString( "Percent" ) ), ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Bombing" ) ), constant_handles
                                                      .reader_make_constant_shell( makeString( "eventOccursAt" ) ), constant_handles.reader_make_constant_shell( makeString( "NorthernIreland" ) ) ), ConsesLow.list(
                                                          constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                              "TerroristAttack" ) ), constant_handles.reader_make_constant_shell( makeString( "perpetrator" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                  "IrishRepublicanArmy" ) ) ), makeDouble( 3.1 ) ) ), makeString(
                                                                      "Percent of Instances of Northern Ireland Bomb Attacks That Are Also Terrorist Attacks Performed by Irish Republican Army Are 3.1" ) ), ConsesLow
                                                                          .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "placeOfDeath" ) ), constant_handles
                                                                              .reader_make_constant_shell( makeString( "Terrorist-al-Banna" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                  "CityOfBaghdadIraq" ) ) ) ), makeString( "Abu Nidal Died in Baghdad, Iraq" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                      constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                          makeString( "admittedSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                              "biologicalFather" ) ), constant_handles.reader_make_constant_shell( makeString( "Cyc" ) ), constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "Lenat" ) ) ) ) ) ), makeString(
                                                                                                      "'Doug Lenat Is the Biological Father of Cyc.' Not a Well-formed Sentence" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "symptomOfAilment" ) ), constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "UpperRespiratoryInfection" ) ), constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "AnthraxInfection" ) ) ) ), makeString(
                                                                                                                      "Upper Respiratory Infections a Symptom of Anthrax" ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                                                                          .list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                              "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                  makeString( "Mitosis" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "MCheckpoint" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "Anaphase" ) ) ) ), makeString(
                                                                                                                                              "M Checkpoint Required for Anaphase to Take Place in Mitosis" ) ), ConsesLow
                                                                                                                                                  .list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "relationMostExists" ) ),
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "fanOf" ) ),
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                          "UnitedStatesPerson" ) ), constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "Athlete" ) ) ) ),
                                                                                                                                                      makeString( "Most Americans Fans of Athletes" ) ), ConsesLow.list(
                                                                                                                                                          ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                  "necessaryConditionFor-InSitType" ) ), constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "EukaryoticCellCycle" ) ), constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "ChromosomalDuplication-Eukaryotic" ) ),
                                                                                                                                                              constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                  "SPhase" ) ) ) ), makeString(
                                                                                                                                                                      "Chromosomal Duplication Required for S Phase to Take Place in Eukaryotic Cell Cycle" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "precursors-Chemical" ) ), constant_handles.reader_make_constant_shell( makeString( "VX-NerveAgent" ) ),
          constant_handles.reader_make_constant_shell( makeString( "Sulfur" ) ) ) ), makeString( "Sulfur Is Chemical Precursor for VX" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString( "EukaryoticCellCycle" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "EarlyMitoticSpindleAssembly" ) ), constant_handles.reader_make_constant_shell( makeString( "Prophase" ) ) ) ), makeString(
                      "Early Mitotic Spindle Formation Required for Prophase to Take Place in Eukaryotic Cell Cycle" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "relationAllInstanceInstance-Conditional-CeterisParibus" ) ), constant_handles.reader_make_constant_shell( makeString( "EukaryoticCell" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "hasPartTypes" ) ), constant_handles.reader_make_constant_shell( makeString( "MicrofilamentRing" ) ), ConsesLow.list( constant_handles
                                  .reader_make_constant_shell( makeString( "QuantifiedVersionOfBinaryPredicateFn" ) ), constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), ConsesLow
                                      .list( constant_handles.reader_make_constant_shell( makeString( "InverseBinaryPredicateFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "PresentTenseVersionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "locusOfCellularProcess-Cell" ) ) ) ) ), constant_handles.reader_make_constant_shell(
                                              makeString( "Cytokinesis" ) ) ) ), makeString( "Eukaryotic Cell With Microfilament Ring Undergoing Cytokinesis" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                  constant_handles.reader_make_constant_shell( makeString( "hasBeliefSystems" ) ), constant_handles.reader_make_constant_shell( makeString( "MuhammadTheProphet" ) ),
                                                  constant_handles.reader_make_constant_shell( makeString( "Islam" ) ) ) ), makeString( "Muhammad Believes in Islam" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "recommendedFoodOrDrinkAllowanceForBLO" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                          "ReginaldQOinkers-ThePig" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FoodOrDrinkForFn" ) ), constant_handles
                                                              .reader_make_constant_shell( makeString( "PotbelliedPig" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                  "PerFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Cup-UnitOfVolume" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                      "DaysDuration" ) ) ), makeDouble( 1.5 ), TWO_INTEGER ) ) ), makeString(
                                                                          "It Is Recommended That Reginald Q. Oinkers Consume 1.5&#x2013;2 Cups per Day of Food or Drink for Potbellied Pigs" ) ), ConsesLow.list( ConsesLow
                                                                              .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "necessaryConditionFor-InSitType" ) ), constant_handles
                                                                                  .reader_make_constant_shell( makeString( "BotanicalCellWallFormation" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                      "IncorporationOfVesicleMaterialsIntoCellPlate" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                          "CellPlateFormation" ) ) ) ), makeString(
                                                                                              "Incorporation of Materials from Vesicles into the Cell Plate Required for Cell Plate Formation to Take Place in Botanical Cell Wall Formation" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "probability" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Lenat" ) ), constant_handles.reader_make_constant_shell( makeString(
              "OntologicalEngineer" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Lenat" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "ComputerProgrammer" ) ) ) ), makeDouble( 0.9999469432 ) ) ), makeString( "Virtually Certain That Doug Lenat Is Ontological Engineer or Developer" ) ), ConsesLow
                      .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "EukaryoticCellCycle" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ChangeOnSlotFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "QuantitySlotForArg2Fn" ) ), constant_handles.reader_make_constant_shell( makeString( "DNAStuff" ) ), constant_handles.reader_make_constant_shell( makeString( "amountPresentAt" ) ) ) ),
                          constant_handles.reader_make_constant_shell( makeString( "G2Phase" ) ) ) ), makeString( "Change in Amount of DNA Present Required for G&#x2082; Phase to Take Place in Eukaryotic Cell Cycle" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sentenceTruth" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "hasBeliefSystems" ) ), constant_handles.reader_make_constant_shell( makeString( "HillaryClinton" ) ), constant_handles.reader_make_constant_shell( makeString( "ProLifeIdeology" ) ) ), constant_handles
              .reader_make_constant_shell( makeString( "False" ) ) ) ), makeString( "Hillary Clinton Does Not Believe in Pro-life Ideology" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Sarin" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "NerveAgentType" ) ) ) ), makeString( "Sarin a Nerve Agent" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "causes-SitTypeSitType" ) ),
                          constant_handles.reader_make_constant_shell( makeString( "PhosphorylationCascade" ) ), constant_handles.reader_make_constant_shell( makeString( "CellularLevelResponseToSignal-Amplified" ) ) ) ),
                          makeString( "Phosphorylation Cascades Cause Amplified Cellular Response" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "biologicalFunction" ) ), constant_handles.reader_make_constant_shell( makeString( "Ribosome" ) ), constant_handles.reader_make_constant_shell( makeString( "CellularProteinSynthesis" ) ),
                              constant_handles.reader_make_constant_shell( makeString( "locusOfCellularProcess-CellPart" ) ) ) ), makeString( "Cellular Protein Synthesis Takes Place in Ribosomes" ) ), ConsesLow.list(
                                  ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "parts" ) ), constant_handles.reader_make_constant_shell( makeString( "ContinentOfAustralia" ) ),
                                      constant_handles.reader_make_constant_shell( makeString( "CityOfCanberraAustralia" ) ) ) ), makeString( "Canberra, Australia Is Part of Australia" ) ), ConsesLow.list( ConsesLow
                                          .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inheritRolePlayersOfType-SubSitTypeToSubSitType" ) ), constant_handles
                                              .reader_make_constant_shell( makeString( "BrushingOnesTeeth" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LookingForObjectOfTypeFn" ) ),
                                                  constant_handles.reader_make_constant_shell( makeString( "ToothpasteTube" ) ) ), constant_handles.reader_make_constant_shell( makeString( "performedBy" ) ),
                                              constant_handles.reader_make_constant_shell( makeString( "TeethCleaning" ) ), constant_handles.reader_make_constant_shell( makeString( "performedBy" ) ), constant_handles
                                                  .reader_make_constant_shell( makeString( "Person" ) ) ) ), makeString( "In Brushing Teeth, Person That Looks for a Toothpaste Tube Also Cleans Teeth" ) ), ConsesLow.list(
                                                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                          "Trichloroethylene" ) ), constant_handles.reader_make_constant_shell( makeString( "ChemicalAgentType" ) ) ) ), makeString(
                                                              "Trichloroethylene a Chemical Warfare Agent" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                  "relationAllExistsCount" ) ), constant_handles.reader_make_constant_shell( makeString( "anatomicalParts" ) ), constant_handles.reader_make_constant_shell(
                                                                      makeString( "Beetle" ) ), constant_handles.reader_make_constant_shell( makeString( "Leg" ) ), SIX_INTEGER ) ), makeString( "Beetle Has Six Legs" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "negativeVestedInterest" ) ), constant_handles.reader_make_constant_shell( makeString( "AlQaida" ) ),
          constant_handles.reader_make_constant_shell( makeString( "Spain" ) ) ) ), makeString( "Al-Qaeda Opposes Spain" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
              makeString( "hasBeenIn" ) ), constant_handles.reader_make_constant_shell( makeString( "Terrorist-al-Banna" ) ), constant_handles.reader_make_constant_shell( makeString( "Libya" ) ) ) ), makeString(
                  "Abu Nidal Has Been in Libya" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell(
                      makeString( "Bacon" ) ), constant_handles.reader_make_constant_shell( makeString( "Pork" ) ) ) ), makeString( "Bacon a Type of Pork" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "birthPlace" ) ), constant_handles.reader_make_constant_shell( makeString( "JamesCurtis" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "CityOfAustinTX" ) ) ) ), makeString( "James Curtis Born in Austin" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                  .reader_make_constant_shell( makeString( "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString( "EukaryoticCellCycle" ) ), constant_handles
                                      .reader_make_constant_shell( makeString( "G2Checkpoint" ) ), constant_handles.reader_make_constant_shell( makeString( "Mitosis" ) ) ) ), makeString(
                                          "G2 Checkpoint Required for Mitosis to Take Place in Eukaryotic Cell Cycle" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                              makeString( "symptomOfAilment" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LevelOfSubstanceTypeInSysTypeFn" ) ), constant_handles
                                                  .reader_make_constant_shell( makeString( "Acetylcholinesterase" ) ), constant_handles.reader_make_constant_shell( makeString( "HomoSapiens" ) ), constant_handles
                                                      .reader_make_constant_shell( makeString( "LowLevelOfStandardSubstanceInSystem" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                          "PoisoningViaSubstanceFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Sarin" ) ) ) ) ), makeString(
                                                              "Lower than Normal Cholinesterase Enzyme Level a Symptom of Sarin Poisoning" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                  .reader_make_constant_shell( makeString( "sentenceTruth" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                      "inhibitionOfSitTypeAffectsSlot" ) ), constant_handles.reader_make_constant_shell( makeString( "MCheckpoint" ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "RestrictionOnSlotFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                              "EukaryoticCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString( "rateOfEvent" ) ) ) ), constant_handles
                                                                                  .reader_make_constant_shell( makeString( "True" ) ) ) ), makeString(
                                                                                      "Interfering With M Checkpoint Would Affect Rate of the Cell Cycle" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                          constant_handles.reader_make_constant_shell( makeString( "sentenceTruth" ) ), ConsesLow.list( constant_handles
                                                                                              .reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "HotSauce" ) ),
                                                                                              constant_handles.reader_make_constant_shell( makeString( "BlandTaste" ) ) ), constant_handles.reader_make_constant_shell(
                                                                                                  makeString( "False" ) ) ) ), makeString( "Hot Sauce Not Bland" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                      constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                                                                                                          makeString( "Texas-State" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "State-UnitedStates" ) ) ) ), makeString( "Texas a U.S. State" ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "Methyldichloroarsine" ) ), constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "BlisterAgentType" ) ) ) ), makeString(
                                                                                                                              "Methyldichloroarsine a Blister Agent" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "bordersOn" ) ), constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "Germany" ) ), constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "France" ) ) ) ), makeString(
                                                                                                                                              "Germany Borders on France" ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                                                                                                  .list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "hasDegreeInField" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "Terrorist-Alamoudi" ) ), constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "MastersDegree" ) ),
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                          "BusinessAdministration" ) ) ) ), makeString(
                                                                                                                                                              "Abdulrahman Alamoudi Has Masters Degree in Business Administration" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationExistsAll" ) ), constant_handles.reader_make_constant_shell( makeString(
          "nontangentialProperPartOfSpaceRegion" ) ), constant_handles.reader_make_constant_shell( makeString( "HomogeneousExtendedSpaceRegion" ) ), constant_handles.reader_make_constant_shell( makeString(
              "HomogeneousExtendedSpaceRegion" ) ) ) ), makeString( "RCC Region Contains RCC Regions" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "movieReleaseYear" ) ), constant_handles.reader_make_constant_shell( makeString( "ForYourEyesOnly-TheMovie" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                      makeInteger( 1981 ) ) ) ), makeString( "'For Your Eyes Only' Released in 1981" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                          "necessaryConditionFor-InSitType" ) ), constant_handles.reader_make_constant_shell( makeString( "EukaryoticCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "ReplicatedChromosomeCondensation" ) ), constant_handles.reader_make_constant_shell( makeString( "Prometaphase" ) ) ) ), makeString(
                                  "Replicated Chromosome Condensation Required for Prometaphase to Take Place in Eukaryotic Cell Cycle" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "eventOccursAt" ) ), constant_handles.reader_make_constant_shell( makeString( "TerroristAttack-November-19-2001-Bilbao-Spain" ) ),
                                      constant_handles.reader_make_constant_shell( makeString( "Spain" ) ) ) ), makeString( "Bilbao Bombing on November 19, 2001 Happened in Spain" ) ), ConsesLow.list( ConsesLow.list(
                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sentenceTruth" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owns" ) ),
                                              constant_handles.reader_make_constant_shell( makeString( "DonaldTrump" ) ), constant_handles.reader_make_constant_shell( makeString( "PacificOcean" ) ) ), constant_handles
                                                  .reader_make_constant_shell( makeString( "False" ) ) ) ), makeString( "Donald Trump Does Not Own Pacific Ocean" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "sitTypeHasSubSitTypeUsingOutputFromSubSitType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                          "MitoticPhaseOfCellCycle" ) ), constant_handles.reader_make_constant_shell( makeString( "Cytokinesis" ) ), constant_handles.reader_make_constant_shell(
                                                              makeString( "Telophase" ) ), constant_handles.reader_make_constant_shell( makeString( "CellNucleus" ) ) ) ), makeString(
                                                                  "In M Phase, Cell Nuclei Created during Telophase Subsequently Used in Cytokinesis" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                      .reader_make_constant_shell( makeString( "eventOccursAt" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                          "TerroristAttack-July-9-2002-Caldas-Colombia" ) ), constant_handles.reader_make_constant_shell( makeString( "Colombia" ) ) ) ), makeString(
                                                                              "Caldas, Colombia Terrorist Attack on July 9, 2002 Happened in Colombia" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "properSubEventTypes" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                      "MitoticPhaseOfCellCycle" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DecreaseOnSlotFn" ) ),
                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuantitySlotForArg2Fn" ) ), constant_handles
                                                                                              .reader_make_constant_shell( makeString( "MPF" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                  "amountPresentAt" ) ) ) ) ) ), makeString( "M Phase Involves Decrease in Quantity of MPF Present" ) ), ConsesLow.list(
                                                                                                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "causes-SubSitTypeSubSitType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "ChemicalInteraction" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                  "CatalystSeparationFromActivator" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                      makeString( "EndingOfSitTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "CatalyticActivation" ) ) ) ) ), makeString(
                                                                                                                              "In Chemical Interactions, Separation of a Catalytic Molecule from Its Activator Causes Ending of Catalytic Activation" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ),
          constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeWithGranularityDimFn" ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "September" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1993 ) ) ), ConsesLow.list( constant_handles
                      .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "September" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) ) ) ), ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "JonC" ) ), constant_handles.reader_make_constant_shell( makeString(
                                  "GraduateStudent" ) ) ) ) ), makeString( "Cyc's Knowledge about Cyclists (time Period between September 1993 and September 1999): Jon Curtis a Graduate Student" ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_headline_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_headline_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_headline_file();
  }
  static
  {
    me = new pph_headline();
    $const0$EnglishHeadlineParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "EnglishHeadlineParaphraseMt" ) );
    $kw1$NONE = makeKeyword( "NONE" );
    $str2$Finished_generating__S = makeString( "Finished generating ~S" );
    $str3$Removed_extraneous_determiners___ = makeString( "Removed extraneous determiners~% ~S" );
    $str4$Removed_extraneous_copulas____S = makeString( "Removed extraneous copulas~% ~S" );
    $str5$Tweaked_verb_tense____S = makeString( "Tweaked verb tense~% ~S" );
    $sym6$_EXIT = makeSymbol( "%EXIT" );
    $str7$the_ = makeString( "the " );
    $str8$Updating_string_from__S___to__S = makeString( "Updating string from ~S~% to ~S" );
    $str9$Complement___S = makeString( "Complement: ~S" );
    $const10$passiveParticiple = constant_handles.reader_make_constant_shell( makeString( "passiveParticiple" ) );
    $str11$not = makeString( "not" );
    $str12$not_ = makeString( "not " );
    $str13$Removing_copula_from__S = makeString( "Removing copula from ~S" );
    $str14$Not_removing_copula_with_compleme = makeString( "Not removing copula with complement ~S" );
    $const15$pastTense_Generic = constant_handles.reader_make_constant_shell( makeString( "pastTense-Generic" ) );
    $list16 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "presentTense-Generic" ) ) );
    $const17$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $str18$Converting__S_to_present_tense = makeString( "Converting ~S to present tense" );
    $const19$futureTense_Generic = constant_handles.reader_make_constant_shell( makeString( "futureTense-Generic" ) );
    $list20 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "infinitive" ) ) );
    $str21$to_ = makeString( "to " );
    $str22$Converting__S_to_infinitive = makeString( "Converting ~S to infinitive" );
    $const23$Indefinite_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Indefinite-NLAttr" ) );
    $const24$Definite_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) );
    $const25$Some_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Some-NLAttr" ) );
    $const26$Every_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Every-NLAttr" ) );
    $str27$_tmp_proof_conclusions_cfasl = makeString( "/tmp/proof-conclusions.cfasl" );
    $sym28$HYPOTHETICAL_TERM_P = makeSymbol( "HYPOTHETICAL-TERM-P" );
    $sym29$INVALID_FORT_ = makeSymbol( "INVALID-FORT?" );
    $str30$_________________________________ = makeString( "~%~%================================================~%~S~%==============================================~%~A~%==========================================~%" );
    $int31$150 = makeInteger( 150 );
    $str32$_define_test_case_table_generate_ = makeString( "(define-test-case-table generate-english-headline-string\n    (:owner \"baxter\" :test #'equal :kb :full :classes '(pph-test-case-tables))" );
    $str33$_____S_____S___ = makeString( "~&((~S)~% ~S)~%" );
    $str34$_ = makeString( ")" );
    $sym35$GENERATE_ENGLISH_HEADLINE_STRING = makeSymbol( "GENERATE-ENGLISH-HEADLINE-STRING" );
    $kw36$TEST = makeKeyword( "TEST" );
    $kw37$OWNER = makeKeyword( "OWNER" );
    $kw38$CLASSES = makeKeyword( "CLASSES" );
    $list39 = ConsesLow.list( makeSymbol( "PPH-TEST-CASE-TABLES-NOT-WORKING" ) );
    $kw40$KB = makeKeyword( "KB" );
    $kw41$FULL = makeKeyword( "FULL" );
    $kw42$WORKING_ = makeKeyword( "WORKING?" );
    $list43 = _constant_43_initializer();
  }
}
/*
 * 
 * Total time: 348 ms
 * 
 */