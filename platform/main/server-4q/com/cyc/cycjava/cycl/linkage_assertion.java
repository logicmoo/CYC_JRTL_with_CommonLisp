package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class linkage_assertion
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.linkage_assertion";
  public static final String myFingerPrint = "e4d70fa4a93bc157cc460a8b1975d192bc2ac31bb62957936b6ecc6bcb30cc23";
  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 18648L)
  private static SubLSymbol $problematic_linkage_assertion_strings$;
  private static final SubLObject $const0$Cyc;
  private static final SubLObject $const1$ContentMtOfLinkageFn;
  private static final SubLObject $const2$mtSpindleMember;
  private static final SubLObject $const3$LinkagesMtSpindle;
  private static final SubLObject $const4$LinkagesSpindleHeadMt;
  private static final SubLSymbol $sym5$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const6$EverythingPSC;
  private static final SubLObject $const7$nthLinkParserLinkageOfInputString;
  private static final SubLSymbol $kw8$GAF;
  private static final SubLObject $const9$NthLinkParserLinkageFn;
  private static final SubLString $str10$LinkTokenization;
  private static final SubLString $str11$Linkage;
  private static final SubLObject $const12$CycTokenization;
  private static final SubLObject $const13$UniversalVocabularyMt;
  private static final SubLObject $const14$numberOfTokensInTokenization;
  private static final SubLObject $const15$tokenizationInputString;
  private static final SubLObject $const16$linkageTokenization;
  private static final SubLObject $const17$tokenizationTokenizer;
  private static final SubLList $list18;
  private static final SubLString $str19$LinkToken;
  private static final SubLSymbol $sym20$GET_STRING;
  private static final SubLString $str21$Link;
  private static final SubLSymbol $sym22$GET_CATEGORY;
  private static final SubLObject $const23$tokenStartCharacterOffset;
  private static final SubLObject $const24$tokenPennTag;
  private static final SubLObject $const25$tokenString;
  private static final SubLString $str26$Left_word___S__right_word___S;
  private static final SubLObject $const27$linkFromToInSystem;
  private static final SubLObject $const28$LinkGrammarLinkFn;
  private static final SubLSymbol $sym29$UPPER_CASE_P;
  private static final SubLSymbol $sym30$_LINK_TYPE;
  private static final SubLObject $const31$linkGrammarLinkTypeBasicLink;
  private static final SubLObject $const32$LinkagesMt;
  private static final SubLObject $const33$isa;
  private static final SubLSymbol $kw34$NOW;
  private static final SubLString $str35$Couldn_t_find_link_type_for__S;
  private static final SubLObject $const36$parseTreeOfTokenization;
  private static final SubLSymbol $sym37$GET_TREE_STRING;
  private static final SubLSymbol $kw38$START_CONSTITUENT;
  private static final SubLSymbol $kw39$END_CONSTITUENT;
  private static final SubLSymbol $kw40$WHITESPACE;
  private static final SubLString $str41$Can_t_set_category_of_null_stack;
  private static final SubLString $str42$Bad_next_token_number___S_;
  private static final SubLString $str43$__Processing__S__;
  private static final SubLString $str44$Remaining_stack__S;
  private static final SubLSymbol $kw45$OTHER;
  private static final SubLList $list46;
  private static final SubLObject $const47$and;
  private static final SubLObject $const48$nthTokenInTokenization;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$_;
  private static final SubLSymbol $sym52$POSITIVE_INTEGER_P;
  private static final SubLString $str53$_S_has__S_tokens__Need_at_least_2;
  private static final SubLSymbol $sym54$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym55$LISTP;
  private static final SubLSymbol $sym56$CONSTANT_P;
  private static final SubLString $str57$Couldn_t_find_token__S_of__S;
  private static final SubLObject $const58$TheLinkParser;
  private static final SubLObject $const59$syntacticNodePennTag;
  private static final SubLString $str60$Bad_dtr_specs___S;
  private static final SubLSymbol $sym61$INTERVAL_SPAN_P;
  private static final SubLString $str62$Can_t_get_span_start_from__S;
  private static final SubLString $str63$Can_t_get_span_end_from__S;
  private static final SubLString $str64$Can_t_get_node_from__S;
  private static final SubLSymbol $sym65$ASSERT_LINKAGE;
  private static final SubLSymbol $sym66$CYCLIFIER_LEXICON;
  private static final SubLSymbol $sym67$STRING_OR_UNICODE_NAUT_P;
  private static final SubLString $str68$Can_t_assert_a_Linkage_parse_tree;
  private static final SubLSymbol $kw69$LEXICON;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym72$LENGTH;
  private static final SubLSymbol $sym73$WORDS;
  private static final SubLSymbol $sym74$LINKS;
  private static final SubLObject $const75$LinkageReificationTemplate;
  private static final SubLList $list76;

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 985L)
  public static SubLObject default_linkage_cyclist()
  {
    return $const0$Cyc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 1296L)
  public static SubLObject content_mt_of_linkage(final SubLObject linkage_naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject content_mt_naut = ConsesLow.list( $const1$ContentMtOfLinkageFn, linkage_naut );
    final SubLObject content_mt_nart = narts_high.find_nart( content_mt_naut );
    if( NIL != nart_handles.nart_p( content_mt_nart ) )
    {
      return content_mt_nart;
    }
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( default_linkage_cyclist(), thread );
      ke.ke_assert_wff_now( ConsesLow.list( $const2$mtSpindleMember, $const3$LinkagesMtSpindle, content_mt_naut ), $const4$LinkagesSpindleHeadMt, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return hlmt_czer.canonicalize_hlmt( content_mt_naut );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 1900L)
  public static SubLObject next_linkage_number_for_sentence(final SubLObject sent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_max = MINUS_ONE_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym5$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const6$EverythingPSC, thread );
      final SubLObject pred_var = $const7$nthLinkParserLinkageOfInputString;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, NIL, NIL );
                SubLObject done_var_$3 = NIL;
                final SubLObject token_var_$4 = NIL;
                while ( NIL == done_var_$3)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                  final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( gaf ) );
                  if( NIL != valid_$5 && assertions_high.gaf_arg1( gaf ).numG( current_max ) && assertions_high.gaf_arg3( gaf ).equal( sent ) )
                  {
                    current_max = assertions_high.gaf_arg1( gaf );
                  }
                  done_var_$3 = makeBoolean( NIL == valid_$5 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
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
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return number_utilities.f_1X( current_max );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 2309L)
  public static SubLObject new_linkage_naut_for_sentence(final SubLObject sent)
  {
    final SubLObject linkage_number = next_linkage_number_for_sentence( sent );
    return ConsesLow.list( $const9$NthLinkParserLinkageFn, sent, linkage_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 2542L)
  public static SubLObject assert_link_tokenization(final SubLObject string, final SubLObject num_tokens, final SubLObject linkage_naut, SubLObject tokenization_shell)
  {
    if( tokenization_shell == UNPROVIDED )
    {
      tokenization_shell = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tokenization = $str10$LinkTokenization;
    final SubLObject mt = content_mt_of_linkage( linkage_naut );
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( default_linkage_cyclist(), thread );
      parsing_vars.$parse_tree_mt$.bind( mt, thread );
      parsing_vars.$parse_tree_prefix$.bind( $str11$Linkage, thread );
      tokenization = ( ( NIL != tokenization_shell ) ? tokenization_shell : parsing_utilities.create_parse_tree_element( $const12$CycTokenization, $const13$UniversalVocabularyMt, UNPROVIDED ) );
      parsing_utilities.assert_parse_tree_info( ConsesLow.list( $const14$numberOfTokensInTokenization, tokenization, num_tokens ), UNPROVIDED );
      if( !parsing_utilities.tokenization_input_string( tokenization ).isString() )
      {
        parsing_utilities.assert_parse_tree_info( ConsesLow.list( $const15$tokenizationInputString, tokenization, string ), UNPROVIDED );
      }
      parsing_utilities.assert_parse_tree_info( ConsesLow.list( $const16$linkageTokenization, linkage_naut, tokenization ), UNPROVIDED );
      parsing_utilities.assert_parse_tree_info( ConsesLow.listS( $const17$tokenizationTokenizer, tokenization, $list18 ), UNPROVIDED );
    }
    finally
    {
      parsing_vars.$parse_tree_prefix$.rebind( _prev_bind_3, thread );
      parsing_vars.$parse_tree_mt$.rebind( _prev_bind_2, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return tokenization;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 3843L)
  public static SubLObject assert_link_token(final SubLObject link_token, final SubLObject tokenization, final SubLObject token_num, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject token = $str19$LinkToken;
    final SubLObject word_string = methods.funcall_instance_method_with_0_args( link_token, $sym20$GET_STRING );
    final SubLObject subl_token_string = token_string_from_link_word_string( word_string );
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding( thread );
    final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_mt$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( default_linkage_cyclist(), thread );
      parsing_vars.$parse_tree_prefix$.bind( $str21$Link, thread );
      parsing_vars.$parse_tree_mt$.bind( mt, thread );
      token = parsing_utilities.create_parse_token( tokenization, token_num, UNPROVIDED, UNPROVIDED );
      final SubLObject start_offset = parsing_utilities.compute_parse_token_start_offset( tokenization, token_num, subl_token_string );
      final SubLObject input_string = parsing_utilities.tokenization_input_string( tokenization );
      final SubLObject penntag = methods.funcall_instance_method_with_0_args( link_token, $sym22$GET_CATEGORY );
      final SubLObject cycl_penntag = ( NIL != penntag ) ? parsing_utilities.penntag_to_cycl( Symbols.symbol_name( penntag ) ) : NIL;
      final SubLObject cycl_token_string = ( NIL != start_offset ) ? evaluation_defns.cyc_substring( input_string, start_offset, Numbers.add( start_offset, Sequences.length( subl_token_string ) ) ) : NIL;
      if( NIL != start_offset )
      {
        parsing_utilities.assert_parse_tree_info( ConsesLow.list( $const23$tokenStartCharacterOffset, token, start_offset ), UNPROVIDED );
      }
      if( NIL != cycl_penntag )
      {
        parsing_utilities.assert_parse_tree_info( ConsesLow.list( $const24$tokenPennTag, token, cycl_penntag ), UNPROVIDED );
      }
      parsing_utilities.assert_parse_tree_info( ConsesLow.list( $const25$tokenString, token, ( NIL != cycl_token_string ) ? cycl_token_string : subl_token_string ), UNPROVIDED );
    }
    finally
    {
      parsing_vars.$parse_tree_mt$.rebind( _prev_bind_3, thread );
      parsing_vars.$parse_tree_prefix$.rebind( _prev_bind_2, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return token;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 5561L)
  public static SubLObject token_string_from_link_word_string(final SubLObject word_string)
  {
    return word_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 5746L)
  public static SubLObject assert_link_parser_link(final SubLObject link, final SubLObject tokens, final SubLObject mt, final SubLObject linkage_naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject link_pred = link_predicate_from_name( linkage.link_name( link ) );
    final SubLObject left_word = list_utilities.alist_reverse_lookup( tokens, linkage.link_left_word( link ), UNPROVIDED, UNPROVIDED );
    final SubLObject right_word = list_utilities.alist_reverse_lookup( tokens, linkage.link_right_word( link ), UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == left_word || NIL == right_word ) )
    {
      Errors.error( $str26$Left_word___S__right_word___S, left_word, right_word );
    }
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( default_linkage_cyclist(), thread );
      ke.ke_assert_wff_now( ConsesLow.list( link_pred, left_word, right_word ), mt, UNPROVIDED, UNPROVIDED );
      ke.ke_assert_wff_now( ConsesLow.list( $const27$linkFromToInSystem, link_pred, left_word, right_word, linkage_naut ), mt, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 6772L)
  public static SubLObject link_predicate_from_name(final SubLObject link_name)
  {
    final SubLObject fn = $const28$LinkGrammarLinkFn;
    final SubLObject link_pred = czer_main.canonicalize_term( el_utilities.make_unary_formula( fn, link_name ), UNPROVIDED );
    if( NIL == nart_handles.nart_p( link_pred ) )
    {
      assert_link_type( link_pred );
    }
    return link_pred;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 7019L)
  public static SubLObject assert_link_type(final SubLObject link_pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject link_name = cycl_utilities.nat_arg1( link_pred, UNPROVIDED );
    final SubLObject first_lowercase = list_utilities.position_if_not( $sym29$UPPER_CASE_P, link_name, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject link_type_name = string_utilities.substring( link_name, ZERO_INTEGER, first_lowercase );
    final SubLObject link_type = ask_utilities.query_variable( $sym30$_LINK_TYPE, ConsesLow.list( $const31$linkGrammarLinkTypeBasicLink, $sym30$_LINK_TYPE, ConsesLow.list( $const28$LinkGrammarLinkFn, link_type_name ) ),
        $const32$LinkagesMt, UNPROVIDED ).first();
    if( NIL != link_type )
    {
      final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( default_linkage_cyclist(), thread );
        rkf_assertion_utilities.rkf_assert_with_implicature( ConsesLow.list( $const33$isa, link_pred, link_type ), $const32$LinkagesMt, $kw34$NOW );
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      Errors.warn( $str35$Couldn_t_find_link_type_for__S, link_pred );
    }
    return link_pred;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 7640L)
  public static SubLObject assert_link_parse_tree(final SubLObject v_linkage, final SubLObject tokenization, final SubLObject linkage_content_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name_prefix = $str11$Linkage;
    SubLObject v_parse_tree = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( default_linkage_cyclist(), thread );
      kb_control_vars.$forward_inference_allowed_rules$.bind( parsing_utilities.parse_tree_creation_rules(), thread );
      v_parse_tree = parsing_utilities.create_parse_tree( $const13$UniversalVocabularyMt, name_prefix );
      parsing_utilities.assert_parse_tree_info( ConsesLow.list( $const36$parseTreeOfTokenization, v_parse_tree, tokenization ), linkage_content_mt );
      final SubLObject _prev_bind_0_$7 = parsing_vars.$parse_tree_mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$8 = parsing_vars.$parse_tree_prefix$.currentBinding( thread );
      try
      {
        parsing_vars.$parse_tree_mt$.bind( parsing_utilities.content_mt_of_parse_tree( v_parse_tree ), thread );
        parsing_vars.$parse_tree_prefix$.bind( name_prefix, thread );
        v_parse_tree = populate_linkage_parse_tree( v_linkage, v_parse_tree, tokenization );
      }
      finally
      {
        parsing_vars.$parse_tree_prefix$.rebind( _prev_bind_1_$8, thread );
        parsing_vars.$parse_tree_mt$.rebind( _prev_bind_0_$7, thread );
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_allowed_rules$.rebind( _prev_bind_2, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return v_parse_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 8317L)
  public static SubLObject populate_linkage_parse_tree(final SubLObject v_linkage, final SubLObject v_parse_tree, final SubLObject tokenization)
  {
    final SubLObject root_node = create_linkage_parse_tree_nodes( v_linkage, tokenization );
    parsing_utilities.assert_parse_tree_root_node( v_parse_tree, root_node, UNPROVIDED );
    return v_parse_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 8551L)
  public static SubLObject create_linkage_parse_tree_nodes(final SubLObject v_linkage, final SubLObject tokenization)
  {
    final SubLObject tree = methods.funcall_instance_method_with_0_args( v_linkage, $sym37$GET_TREE_STRING );
    return create_linkage_tree_string_parse_tree_nodes( tree, tokenization );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 8747L)
  public static SubLObject create_linkage_tree_string_parse_tree_nodes(final SubLObject tree, final SubLObject tokenization)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tree_length = Sequences.length( tree );
    final SubLObject token_strings = get_tokenization_strings( tokenization );
    SubLObject char_num = ZERO_INTEGER;
    SubLObject next_token_number = ZERO_INTEGER;
    SubLObject constituent_stack = NIL;
    SubLObject char_stack = NIL;
    SubLObject reading_leafP = NIL;
    SubLObject reading_categoryP = NIL;
    SubLObject last_node_created = NIL;
    while ( tree_length.numG( char_num ))
    {
      final SubLObject v_char = Strings.sublisp_char( tree, char_num );
      final SubLObject pcase_var;
      final SubLObject state = pcase_var = linkage_parse_tree_asserter_state( v_char, tree, char_num );
      if( pcase_var.eql( $kw38$START_CONSTITUENT ) )
      {
        reading_categoryP = T;
        constituent_stack = ConsesLow.cons( NIL, constituent_stack );
      }
      else if( pcase_var.eql( $kw39$END_CONSTITUENT ) )
      {
        if( NIL != reading_leafP )
        {
          last_node_created = create_link_parse_node( next_token_number, tokenization );
          if( NIL != constituent_stack )
          {
            add_lexical_dtr_to_top_of_stack( constituent_stack, last_node_created, next_token_number );
          }
          next_token_number = Numbers.add( next_token_number, ONE_INTEGER );
          reading_leafP = NIL;
        }
        final SubLObject constituent = Sequences.nreverse( constituent_stack.first() );
        constituent_stack = constituent_stack.rest();
        last_node_created = create_link_parse_node( constituent, tokenization );
        if( NIL != constituent_stack )
        {
          ConsesLow.rplaca( constituent_stack, ConsesLow.cons( last_node_created, constituent_stack.first() ) );
        }
      }
      else if( pcase_var.eql( $kw40$WHITESPACE ) )
      {
        if( NIL != reading_leafP )
        {
          if( NIL != reading_categoryP )
          {
            final SubLObject category = unicode_strings.string_from_char_list( Sequences.nreverse( char_stack ), UNPROVIDED );
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == constituent_stack )
            {
              Errors.error( $str41$Can_t_set_category_of_null_stack );
            }
            char_stack = NIL;
            ConsesLow.rplaca( constituent_stack, ConsesLow.cons( category, constituent_stack.first() ) );
            reading_categoryP = NIL;
          }
          else
          {
            last_node_created = create_link_parse_node( next_token_number, tokenization );
            if( NIL != constituent_stack )
            {
              add_lexical_dtr_to_top_of_stack( constituent_stack, last_node_created, next_token_number );
            }
            next_token_number = Numbers.add( next_token_number, ONE_INTEGER );
          }
          reading_leafP = NIL;
        }
      }
      else
      {
        if( NIL != reading_categoryP )
        {
          char_stack = ConsesLow.cons( v_char, char_stack );
        }
        else
        {
          SubLObject token_string = ConsesLow.nth( next_token_number, token_strings );
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.lengthG( token_strings, next_token_number, UNPROVIDED ) )
          {
            Errors.error( $str42$Bad_next_token_number___S_, next_token_number );
          }
          if( NIL != linkage.null_link_token_string_p( token_string ) && ( !Characters.CHAR_lbracket.eql( Strings.sublisp_char( tree, char_num ) ) || !Characters.CHAR_rbracket.eql( Strings.sublisp_char( tree,
              number_utilities.f_1_( Numbers.add( char_num, Sequences.length( token_string ) ) ) ) ) ) )
          {
            token_string = strip_null_link_token_string_brackets( token_string );
          }
          PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str43$__Processing__S__, token_string );
          char_num = Numbers.add( char_num, number_utilities.f_1_( evaluation_defns.cyc_length( token_string ) ) );
        }
        reading_leafP = T;
      }
      char_num = Numbers.add( char_num, ONE_INTEGER );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != constituent_stack )
    {
      Errors.error( $str44$Remaining_stack__S, constituent_stack );
    }
    return last_node_created;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 11827L)
  public static SubLObject linkage_parse_tree_asserter_state(final SubLObject v_char, final SubLObject tree, final SubLObject char_num)
  {
    if( v_char.eql( Characters.CHAR_lparen ) && NIL != list_utilities.lengthG( tree, number_utilities.f_1X( char_num ), UNPROVIDED ) && NIL != Characters.alpha_char_p( Strings.sublisp_char( tree, number_utilities.f_1X(
        char_num ) ) ) )
    {
      return $kw38$START_CONSTITUENT;
    }
    if( v_char.eql( Characters.CHAR_rparen ) && char_num.isPositive() && NIL != string_utilities.non_whitespace_p( Strings.sublisp_char( tree, number_utilities.f_1_( char_num ) ) ) )
    {
      return $kw39$END_CONSTITUENT;
    }
    if( NIL != string_utilities.whitespacep( v_char ) )
    {
      return $kw40$WHITESPACE;
    }
    return $kw45$OTHER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 12232L)
  public static SubLObject strip_null_link_token_string_brackets(final SubLObject token_string)
  {
    return string_utilities.substring( string_utilities.strip_final( token_string, ONE_INTEGER ), ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 12356L)
  public static SubLObject get_tokenization_strings(final SubLObject tokenization)
  {
    final SubLObject alist = ask_utilities.query_template( $list46, ConsesLow.listS( $const47$and, ConsesLow.listS( $const48$nthTokenInTokenization, tokenization, $list49 ), $list50 ), $const6$EverythingPSC,
        UNPROVIDED );
    return list_utilities.alist_values( list_utilities.sort_alist_by_keys( alist, Symbols.symbol_function( $sym51$_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 12646L)
  public static SubLObject add_lexical_dtr_to_top_of_stack(final SubLObject constituent_stack, final SubLObject last_node_created, final SubLObject next_token_number)
  {
    ConsesLow.rplaca( constituent_stack, ConsesLow.cons( ConsesLow.cons( last_node_created, next_token_number ), constituent_stack.first() ) );
    return constituent_stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 12894L)
  public static SubLObject root_span_for_linkage_tokenization(final SubLObject tokenization)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject token_count = parsing_utilities.tokenization_token_count( tokenization );
    assert NIL != subl_promotions.positive_integer_p( token_count ) : token_count;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !token_count.numG( TWO_INTEGER ) )
    {
      Errors.error( $str53$_S_has__S_tokens__Need_at_least_2, token_count );
    }
    return interval_span.get_interval_span( ONE_INTEGER, number_utilities.f_1_( token_count ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 13208L)
  public static SubLObject create_link_parse_node(final SubLObject constituent, final SubLObject tokenization)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( constituent.isAtom() )
    {
      assert NIL != subl_promotions.non_negative_integer_p( constituent ) : constituent;
    }
    else
    {
      assert NIL != Types.listp( constituent ) : constituent;
    }
    assert NIL != constant_handles.constant_p( tokenization ) : tokenization;
    SubLObject node = NIL;
    if( constituent.isAtom() )
    {
      final SubLObject category = NIL;
      final SubLObject token = parsing_utilities.find_parse_token( tokenization, constituent );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == kb_indexing_datastructures.indexed_term_p( token ) )
      {
        Errors.error( $str57$Couldn_t_find_token__S_of__S, constituent, tokenization );
      }
      node = parsing_utilities.create_syntactic_node( tokenization, $const58$TheLinkParser, category, interval_span.get_interval_span( constituent, number_utilities.f_1X( constituent ) ), T, parsing_utilities
          .token_string( token ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      final SubLObject tag = parsing_utilities.penntag_to_cycl( constituent.first() );
      final SubLObject category2 = NIL;
      final SubLObject dtr_specs = constituent.rest();
      final SubLObject string = NIL;
      node = parsing_utilities.create_syntactic_node( tokenization, $const58$TheLinkParser, category2, get_interval_span_from_dtr_specs( dtr_specs, tokenization ), NIL, string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != tag )
      {
        parsing_utilities.assert_parse_tree_info( ConsesLow.list( $const59$syntacticNodePennTag, node, tag ), UNPROVIDED );
      }
      SubLObject list_var = NIL;
      SubLObject dtr_spec = NIL;
      SubLObject i = NIL;
      list_var = dtr_specs;
      dtr_spec = list_var.first();
      for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), dtr_spec = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
      {
        final SubLObject dtr_node = linkage_dtr_spec_node( dtr_spec );
        final SubLObject dtr_num = number_utilities.f_1X( i );
        parsing_utilities.syntactic_node_add_dtr( node, dtr_node, dtr_num, UNPROVIDED );
      }
    }
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 14529L)
  public static SubLObject get_interval_span_from_dtr_specs(final SubLObject dtr_specs, final SubLObject tokenization)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject end;
    final SubLObject start = end = linkage_dtr_spec_span_start( dtr_specs.first(), tokenization );
    SubLObject cdolist_list_var = dtr_specs;
    SubLObject dtr_spec = NIL;
    dtr_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !end.eql( linkage_dtr_spec_span_start( dtr_spec, tokenization ) ) )
      {
        Errors.error( $str60$Bad_dtr_specs___S, dtr_specs );
      }
      end = linkage_dtr_spec_span_end( dtr_spec, tokenization );
      cdolist_list_var = cdolist_list_var.rest();
      dtr_spec = cdolist_list_var.first();
    }
    return interval_span.get_interval_span( start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 15026L)
  public static SubLObject linkage_dtr_spec_span_start(final SubLObject dtr_spec, final SubLObject tokenization)
  {
    if( dtr_spec.isCons() )
    {
      return dtr_spec.rest();
    }
    if( NIL == kb_indexing_datastructures.indexed_term_p( dtr_spec ) )
    {
      Errors.error( $str62$Can_t_get_span_start_from__S, dtr_spec );
      return NIL;
    }
    final SubLObject span = parsing_utilities.syntactic_node_span( dtr_spec, tokenization );
    assert NIL != interval_span.interval_span_p( span ) : span;
    return interval_span.interval_span_start( span );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 15382L)
  public static SubLObject linkage_dtr_spec_span_end(final SubLObject dtr_spec, final SubLObject tokenization)
  {
    if( dtr_spec.isCons() )
    {
      return number_utilities.f_1X( dtr_spec.rest() );
    }
    if( NIL == kb_indexing_datastructures.indexed_term_p( dtr_spec ) )
    {
      Errors.error( $str63$Can_t_get_span_end_from__S, dtr_spec );
      return NIL;
    }
    final SubLObject span = parsing_utilities.syntactic_node_span( dtr_spec, tokenization );
    assert NIL != interval_span.interval_span_p( span ) : span;
    return interval_span.interval_span_end( span );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 15737L)
  public static SubLObject linkage_dtr_spec_node(final SubLObject dtr_spec)
  {
    if( dtr_spec.isCons() )
    {
      return dtr_spec.first();
    }
    if( NIL != kb_indexing_datastructures.indexed_term_p( dtr_spec ) )
    {
      return dtr_spec;
    }
    Errors.error( $str64$Can_t_get_node_from__S, dtr_spec );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 15944L)
  public static SubLObject assert_linkage(final SubLObject sent, SubLObject assert_parse_treeP, SubLObject lexicon, SubLObject tokenization_shell, SubLObject link_parse_options)
  {
    if( assert_parse_treeP == UNPROVIDED )
    {
      assert_parse_treeP = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = ( NIL != assert_parse_treeP ) ? NIL : object.new_class_instance( $sym66$CYCLIFIER_LEXICON );
    }
    if( tokenization_shell == UNPROVIDED )
    {
      tokenization_shell = NIL;
    }
    if( link_parse_options == UNPROVIDED )
    {
      link_parse_options = linkage.$link_parse_options$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != unicode_nauts.string_or_unicode_naut_p( sent ) : sent;
    if( NIL != assert_parse_treeP && NIL != lexicon )
    {
      Errors.error( $str68$Can_t_assert_a_Linkage_parse_tree );
    }
    final SubLObject v_properties = ConsesLow.listS( $kw69$LEXICON, lexicon, $list70 );
    final SubLObject subl_sent = ( NIL != unicode_nauts.unicode_naut_p( sent, UNPROVIDED ) ) ? unicode_strings.display_to_subl_string( cycl_utilities.nat_arg1( sent, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) : sent;
    SubLObject v_linkage = NIL;
    SubLObject tokenization = NIL;
    SubLObject content_mt = NIL;
    SubLObject _prev_bind_0 = linkage.$link_parse_options$.currentBinding( thread );
    try
    {
      linkage.$link_parse_options$.bind( link_parse_options, thread );
      SubLObject error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym71$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            v_linkage = linkage.new_linkage( subl_sent, v_properties );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0_$9, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error )
      {
        parser.ensure_link_server_running();
        v_linkage = linkage.new_linkage( subl_sent, v_properties );
      }
    }
    finally
    {
      linkage.$link_parse_options$.rebind( _prev_bind_0, thread );
    }
    if( NIL != v_linkage )
    {
      _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding( thread );
      try
      {
        kb_control_vars.$forward_inference_allowed_rules$.bind( ( NIL != parsing_vars.use_default_linkage_creation_rulesP() ) ? default_linkage_creation_rules() : parsing_vars.linkage_creation_rules(), thread );
        final SubLObject linkage_naut = new_linkage_naut_for_sentence( sent );
        final SubLObject word_count = methods.funcall_instance_method_with_0_args( v_linkage, $sym72$LENGTH );
        final SubLObject token_count = Numbers.add( word_count, TWO_INTEGER );
        SubLObject counter = ZERO_INTEGER;
        SubLObject alist_of_tokens = NIL;
        content_mt = content_mt_of_linkage( linkage_naut );
        tokenization = assert_link_tokenization( sent, token_count, linkage_naut, tokenization_shell );
        SubLObject linkage_word = NIL;
        SubLObject vector_var = instances.get_slot( v_linkage, $sym73$WORDS );
        SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        SubLObject token;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          w = ( linkage_word = Vectors.aref( vector_var, element_num ) );
          if( NIL == linkage.wall_link_word_p( linkage_word ) )
          {
            token = assert_link_token( linkage_word, tokenization, counter, content_mt );
            alist_of_tokens = list_utilities.alist_enter( alist_of_tokens, token, linkage_word, UNPROVIDED );
            counter = Numbers.add( counter, ONE_INTEGER );
          }
        }
        SubLObject link = NIL;
        vector_var = instances.get_slot( v_linkage, $sym74$LINKS );
        backwardP_var = NIL;
        SubLObject l;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          l = Vectors.aref( vector_var, element_num );
          if( NIL != l )
          {
            link = l;
            if( NIL == linkage.link_contains_wall_link_wordP( link ) )
            {
              assert_link_parser_link( link, alist_of_tokens, content_mt, linkage_naut );
            }
          }
        }
      }
      finally
      {
        kb_control_vars.$forward_inference_allowed_rules$.rebind( _prev_bind_0, thread );
      }
      if( NIL != assert_parse_treeP )
      {
        assert_link_parse_tree( v_linkage, tokenization, content_mt );
      }
    }
    return Values.values( v_linkage, content_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/linkage-assertion.lisp", position = 18489L)
  public static SubLObject default_linkage_creation_rules()
  {
    final SubLObject rules = forward.creation_template_allowable_rules( $const75$LinkageReificationTemplate );
    return rules;
  }

  public static SubLObject declare_linkage_assertion_file()
  {
    SubLFiles.declareFunction( me, "default_linkage_cyclist", "DEFAULT-LINKAGE-CYCLIST", 0, 0, false );
    SubLFiles.declareFunction( me, "content_mt_of_linkage", "CONTENT-MT-OF-LINKAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "next_linkage_number_for_sentence", "NEXT-LINKAGE-NUMBER-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_linkage_naut_for_sentence", "NEW-LINKAGE-NAUT-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_link_tokenization", "ASSERT-LINK-TOKENIZATION", 3, 1, false );
    SubLFiles.declareFunction( me, "assert_link_token", "ASSERT-LINK-TOKEN", 4, 0, false );
    SubLFiles.declareFunction( me, "token_string_from_link_word_string", "TOKEN-STRING-FROM-LINK-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_link_parser_link", "ASSERT-LINK-PARSER-LINK", 4, 0, false );
    SubLFiles.declareFunction( me, "link_predicate_from_name", "LINK-PREDICATE-FROM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_link_type", "ASSERT-LINK-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_link_parse_tree", "ASSERT-LINK-PARSE-TREE", 3, 0, false );
    SubLFiles.declareFunction( me, "populate_linkage_parse_tree", "POPULATE-LINKAGE-PARSE-TREE", 3, 0, false );
    SubLFiles.declareFunction( me, "create_linkage_parse_tree_nodes", "CREATE-LINKAGE-PARSE-TREE-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "create_linkage_tree_string_parse_tree_nodes", "CREATE-LINKAGE-TREE-STRING-PARSE-TREE-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "linkage_parse_tree_asserter_state", "LINKAGE-PARSE-TREE-ASSERTER-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "strip_null_link_token_string_brackets", "STRIP-NULL-LINK-TOKEN-STRING-BRACKETS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_tokenization_strings", "GET-TOKENIZATION-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_lexical_dtr_to_top_of_stack", "ADD-LEXICAL-DTR-TO-TOP-OF-STACK", 3, 0, false );
    SubLFiles.declareFunction( me, "root_span_for_linkage_tokenization", "ROOT-SPAN-FOR-LINKAGE-TOKENIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "create_link_parse_node", "CREATE-LINK-PARSE-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_interval_span_from_dtr_specs", "GET-INTERVAL-SPAN-FROM-DTR-SPECS", 2, 0, false );
    SubLFiles.declareFunction( me, "linkage_dtr_spec_span_start", "LINKAGE-DTR-SPEC-SPAN-START", 2, 0, false );
    SubLFiles.declareFunction( me, "linkage_dtr_spec_span_end", "LINKAGE-DTR-SPEC-SPAN-END", 2, 0, false );
    SubLFiles.declareFunction( me, "linkage_dtr_spec_node", "LINKAGE-DTR-SPEC-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_linkage", "ASSERT-LINKAGE", 1, 4, false );
    SubLFiles.declareFunction( me, "default_linkage_creation_rules", "DEFAULT-LINKAGE-CREATION-RULES", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_linkage_assertion_file()
  {
    $problematic_linkage_assertion_strings$ = SubLFiles.deflexical( "*PROBLEMATIC-LINKAGE-ASSERTION-STRINGS*", $list76 );
    return NIL;
  }

  public static SubLObject setup_linkage_assertion_file()
  {
    access_macros.register_external_symbol( $sym65$ASSERT_LINKAGE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_linkage_assertion_file();
  }

  @Override
  public void initializeVariables()
  {
    init_linkage_assertion_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_linkage_assertion_file();
  }
  static
  {
    me = new linkage_assertion();
    $problematic_linkage_assertion_strings$ = null;
    $const0$Cyc = constant_handles.reader_make_constant_shell( makeString( "Cyc" ) );
    $const1$ContentMtOfLinkageFn = constant_handles.reader_make_constant_shell( makeString( "ContentMtOfLinkageFn" ) );
    $const2$mtSpindleMember = constant_handles.reader_make_constant_shell( makeString( "mtSpindleMember" ) );
    $const3$LinkagesMtSpindle = constant_handles.reader_make_constant_shell( makeString( "LinkagesMtSpindle" ) );
    $const4$LinkagesSpindleHeadMt = constant_handles.reader_make_constant_shell( makeString( "LinkagesSpindleHeadMt" ) );
    $sym5$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const6$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const7$nthLinkParserLinkageOfInputString = constant_handles.reader_make_constant_shell( makeString( "nthLinkParserLinkageOfInputString" ) );
    $kw8$GAF = makeKeyword( "GAF" );
    $const9$NthLinkParserLinkageFn = constant_handles.reader_make_constant_shell( makeString( "NthLinkParserLinkageFn" ) );
    $str10$LinkTokenization = makeString( "LinkTokenization" );
    $str11$Linkage = makeString( "Linkage" );
    $const12$CycTokenization = constant_handles.reader_make_constant_shell( makeString( "CycTokenization" ) );
    $const13$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const14$numberOfTokensInTokenization = constant_handles.reader_make_constant_shell( makeString( "numberOfTokensInTokenization" ) );
    $const15$tokenizationInputString = constant_handles.reader_make_constant_shell( makeString( "tokenizationInputString" ) );
    $const16$linkageTokenization = constant_handles.reader_make_constant_shell( makeString( "linkageTokenization" ) );
    $const17$tokenizationTokenizer = constant_handles.reader_make_constant_shell( makeString( "tokenizationTokenizer" ) );
    $list18 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheLinkParser" ) ) );
    $str19$LinkToken = makeString( "LinkToken" );
    $sym20$GET_STRING = makeSymbol( "GET-STRING" );
    $str21$Link = makeString( "Link" );
    $sym22$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $const23$tokenStartCharacterOffset = constant_handles.reader_make_constant_shell( makeString( "tokenStartCharacterOffset" ) );
    $const24$tokenPennTag = constant_handles.reader_make_constant_shell( makeString( "tokenPennTag" ) );
    $const25$tokenString = constant_handles.reader_make_constant_shell( makeString( "tokenString" ) );
    $str26$Left_word___S__right_word___S = makeString( "Left word: ~S, right word: ~S" );
    $const27$linkFromToInSystem = constant_handles.reader_make_constant_shell( makeString( "linkFromToInSystem" ) );
    $const28$LinkGrammarLinkFn = constant_handles.reader_make_constant_shell( makeString( "LinkGrammarLinkFn" ) );
    $sym29$UPPER_CASE_P = makeSymbol( "UPPER-CASE-P" );
    $sym30$_LINK_TYPE = makeSymbol( "?LINK-TYPE" );
    $const31$linkGrammarLinkTypeBasicLink = constant_handles.reader_make_constant_shell( makeString( "linkGrammarLinkTypeBasicLink" ) );
    $const32$LinkagesMt = constant_handles.reader_make_constant_shell( makeString( "LinkagesMt" ) );
    $const33$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw34$NOW = makeKeyword( "NOW" );
    $str35$Couldn_t_find_link_type_for__S = makeString( "Couldn't find link type for ~S" );
    $const36$parseTreeOfTokenization = constant_handles.reader_make_constant_shell( makeString( "parseTreeOfTokenization" ) );
    $sym37$GET_TREE_STRING = makeSymbol( "GET-TREE-STRING" );
    $kw38$START_CONSTITUENT = makeKeyword( "START-CONSTITUENT" );
    $kw39$END_CONSTITUENT = makeKeyword( "END-CONSTITUENT" );
    $kw40$WHITESPACE = makeKeyword( "WHITESPACE" );
    $str41$Can_t_set_category_of_null_stack = makeString( "Can't set category of null stack" );
    $str42$Bad_next_token_number___S_ = makeString( "Bad next-token-number: ~S." );
    $str43$__Processing__S__ = makeString( "~&Processing ~S~%" );
    $str44$Remaining_stack__S = makeString( "Remaining stack ~S" );
    $kw45$OTHER = makeKeyword( "OTHER" );
    $list46 = ConsesLow.cons( makeSymbol( "?N" ), makeSymbol( "?STRING" ) );
    $const47$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const48$nthTokenInTokenization = constant_handles.reader_make_constant_shell( makeString( "nthTokenInTokenization" ) );
    $list49 = ConsesLow.list( makeSymbol( "?N" ), makeSymbol( "?TOKEN" ) );
    $list50 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "tokenString" ) ), makeSymbol( "?TOKEN" ), makeSymbol( "?STRING" ) ) );
    $sym51$_ = makeSymbol( "<" );
    $sym52$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $str53$_S_has__S_tokens__Need_at_least_2 = makeString( "~S has ~S tokens. Need at least 2." );
    $sym54$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym55$LISTP = makeSymbol( "LISTP" );
    $sym56$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $str57$Couldn_t_find_token__S_of__S = makeString( "Couldn't find token ~S of ~S" );
    $const58$TheLinkParser = constant_handles.reader_make_constant_shell( makeString( "TheLinkParser" ) );
    $const59$syntacticNodePennTag = constant_handles.reader_make_constant_shell( makeString( "syntacticNodePennTag" ) );
    $str60$Bad_dtr_specs___S = makeString( "Bad dtr-specs: ~S" );
    $sym61$INTERVAL_SPAN_P = makeSymbol( "INTERVAL-SPAN-P" );
    $str62$Can_t_get_span_start_from__S = makeString( "Can't get span start from ~S" );
    $str63$Can_t_get_span_end_from__S = makeString( "Can't get span end from ~S" );
    $str64$Can_t_get_node_from__S = makeString( "Can't get node from ~S" );
    $sym65$ASSERT_LINKAGE = makeSymbol( "ASSERT-LINKAGE" );
    $sym66$CYCLIFIER_LEXICON = makeSymbol( "CYCLIFIER-LEXICON" );
    $sym67$STRING_OR_UNICODE_NAUT_P = makeSymbol( "STRING-OR-UNICODE-NAUT-P" );
    $str68$Can_t_assert_a_Linkage_parse_tree = makeString( "Can't assert a Linkage parse tree with a lexicon that might retokenize." );
    $kw69$LEXICON = makeKeyword( "LEXICON" );
    $list70 = ConsesLow.list( makeKeyword( "USE-STANDARDIZED-WORD-STRINGS?" ), NIL );
    $sym71$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym72$LENGTH = makeSymbol( "LENGTH" );
    $sym73$WORDS = makeSymbol( "WORDS" );
    $sym74$LINKS = makeSymbol( "LINKS" );
    $const75$LinkageReificationTemplate = constant_handles.reader_make_constant_shell( makeString( "LinkageReificationTemplate" ) );
    $list76 = ConsesLow.list( makeString( "Main article: Culture of Angola." ), makeString(
        "The UN estimates of 1.8 million internally displaced persons (IDPs), while generally the accepted figure for war-affected people is 4 million." ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "UnicodeStringFn" ) ), makeString(
                "Afrikaans Aragon&ue9;s B&ue2;n-l&ue2;m-g&ufa; Bosanski Catal&ue0; Dansk Deutsch Eesti Espa&uf1;ol Esperanto Euskara Fran&ue7;ais G&ue0;idhlig Galego Kr&ue8;yol ayisyen Hrvatski Ido Bahasa Indonesia Interlingua Italiano Basa Jawa Latina Latvie&u161;u Lietuvi&u173; Magyar Bahasa Melayu Ekakair&u169; Naoero Nederlands Plattd&ufc;&ufc;tsch Norsk (bokm&ue5;l) Norsk (nynorsk) Occitan Polski Portugu&uea;s Rom&ue2;n&u103; Shqip Sicilianu Simple English Sloven&u10d;ina Sloven&u161;&u10d;ina Suomi Svenska Ti&u1ebf;ng Vi&u1ec7;t T&ufc;rk&ue7;e. . . ." ) ),
        makeString( "(Portuguese: Forward Angola!)" ), makeString( "Motto: Virtus Unita Fortior (Latin: Unity Provides Strength) Anthem: Angola Avante!" ), makeString(
            "This article is about the indigenous people; for the American corporation, see Cree Inc." ), makeString( "The exclave province Cabinda has a border with Congo-Brazzaville." ) );
  }
}
/*
 * 
 * Total time: 417 ms
 * 
 */