package com.cyc.cycjava.cycl.nl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.http_kernel;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class scg_api
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl.scg_api";
  public static final String myFingerPrint = "162e5219676c4e27e5956e0eefb7f4078bb2722944e49b3b03f07e1da4f6010f";
  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 911L)
  public static SubLSymbol $scg_parser_host$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1090L)
  private static SubLSymbol $scg_parser_port$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1245L)
  private static SubLSymbol $scg_default_max_time$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1378L)
  private static SubLSymbol $scg_parser_callback_host$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1548L)
  private static SubLSymbol $scg_parser_callback_port$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1641L)
  private static SubLSymbol $scg_parser_callback_fallback_host$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1719L)
  private static SubLSymbol $scg_parser_callback_fallback_base_port$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1788L)
  public static SubLSymbol $default_scg_tag_string$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
  private static SubLSymbol $scg_lexical_mt_caching_state$;
  private static final SubLString $str0$localhost;
  private static final SubLSymbol $kw1$UNINITIALIZED;
  private static final SubLString $str2$Unable_to_initialize__A__;
  private static final SubLInteger $int3$60;
  private static final SubLString $str4$public1_cyc_com;
  private static final SubLInteger $int5$3600;
  private static final SubLString $str6$general;
  private static final SubLString $str7$true;
  private static final SubLString $str8$false;
  private static final SubLString $str9$;
  private static final SubLString $str10$http___;
  private static final SubLString $str11$_;
  private static final SubLString $str12$_scg_text_translate_clearCaches_;
  private static final SubLString $str13$_inputText_;
  private static final SubLString $str14$_templateTags_;
  private static final SubLString $str15$_cycHost_;
  private static final SubLString $str16$_cycPort_;
  private static final SubLString $str17$_lexicalMt_;
  private static final SubLString $str18$_timeoutMsec_;
  private static final SubLInteger $int19$1000;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$TAG_STRING_PARAMETER;
  private static final SubLSymbol $kw22$LEXICAL_MT;
  private static final SubLSymbol $kw23$CLEAR_CACHES_;
  private static final SubLSymbol $kw24$COMPLETE_MATCHES_ONLY_;
  private static final SubLSymbol $kw25$MAX_TIME;
  private static final SubLString $str26$source;
  private static final SubLString $str27$start;
  private static final SubLString $str28$_cycl;
  private static final SubLSymbol $sym29$SCG_LEXICAL_MT;
  private static final SubLSymbol $sym30$_LEX_MT;
  private static final SubLObject $const31$scgLexicalMts;
  private static final SubLList $list32;
  private static final SubLObject $const33$InferencePSC;
  private static final SubLObject $const34$MtUnionFn;
  private static final SubLSymbol $sym35$_SCG_LEXICAL_MT_CACHING_STATE_;
  private static final SubLInteger $int36$32;
  private static final SubLSymbol $sym37$CLEAR_SCG_LEXICAL_MT;
  private static final SubLSymbol $sym38$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const39$EverythingPSC;
  private static final SubLSymbol $sym40$GAF_ARG2;
  private static final SubLObject $const41$scgTags;
  private static final SubLSymbol $sym42$GAF_ARG1;
  private static final SubLObject $const43$scgTagRelevant;
  private static final SubLSymbol $kw44$TAG_STRING;
  private static final SubLObject $const45$equalSymbols;
  private static final SubLSymbol $sym46$SCG_PARSE_TEST;
  private static final SubLSymbol $kw47$TEST;
  private static final SubLSymbol $kw48$OWNER;
  private static final SubLSymbol $kw49$CLASSES;
  private static final SubLSymbol $kw50$KB;
  private static final SubLSymbol $kw51$FULL;
  private static final SubLSymbol $kw52$WORKING_;
  private static final SubLList $list53;

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1090L)
  public static SubLObject get_scg_parser_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $scg_parser_port$.getDynamicValue( thread ) == $kw1$UNINITIALIZED )
    {
      final SubLObject init_value = web_utilities.servlet_container_port();
      if( init_value == $kw1$UNINITIALIZED )
      {
        Errors.error( $str2$Unable_to_initialize__A__, $scg_parser_port$.getDynamicValue( thread ) );
      }
      $scg_parser_port$.setDynamicValue( init_value, thread );
    }
    return $scg_parser_port$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1378L)
  public static SubLObject get_scg_parser_callback_host()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $scg_parser_callback_host$.getDynamicValue( thread ) == $kw1$UNINITIALIZED )
    {
      final SubLObject init_value = misc_utilities.machine_name();
      if( init_value == $kw1$UNINITIALIZED )
      {
        Errors.error( $str2$Unable_to_initialize__A__, $scg_parser_callback_host$.getDynamicValue( thread ) );
      }
      $scg_parser_callback_host$.setDynamicValue( init_value, thread );
    }
    return $scg_parser_callback_host$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1548L)
  public static SubLObject get_scg_parser_callback_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $scg_parser_callback_port$.getDynamicValue( thread ) == $kw1$UNINITIALIZED )
    {
      final SubLObject init_value = http_kernel.http_port();
      if( init_value == $kw1$UNINITIALIZED )
      {
        Errors.error( $str2$Unable_to_initialize__A__, $scg_parser_callback_port$.getDynamicValue( thread ) );
      }
      $scg_parser_callback_port$.setDynamicValue( init_value, thread );
    }
    return $scg_parser_callback_port$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1993L)
  public static SubLObject set_scg_parse_host(final SubLObject parser_host, final SubLObject parser_base_port, SubLObject callback_host, SubLObject callback_base_port)
  {
    if( callback_host == UNPROVIDED )
    {
      callback_host = misc_utilities.machine_name();
    }
    if( callback_base_port == UNPROVIDED )
    {
      callback_base_port = system_parameters.$base_tcp_port$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $scg_parser_host$.setDynamicValue( parser_host, thread );
    $scg_parser_port$.setDynamicValue( Numbers.add( parser_base_port, system_parameters.$servlet_port_offset$.getDynamicValue( thread ) ), thread );
    $scg_parser_callback_host$.setDynamicValue( callback_host, thread );
    $scg_parser_callback_port$.setDynamicValue( Numbers.add( callback_base_port, system_parameters.$http_port_offset$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 2470L)
  public static SubLObject get_scg_parse_results_in_xml(final SubLObject string_to_parse, SubLObject max_time, SubLObject tag_string, SubLObject lexical_mt, SubLObject clear_cachesP)
  {
    if( max_time == UNPROVIDED )
    {
      max_time = $scg_default_max_time$.getDynamicValue();
    }
    if( tag_string == UNPROVIDED )
    {
      tag_string = $default_scg_tag_string$.getDynamicValue();
    }
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = NIL;
    }
    if( clear_cachesP == UNPROVIDED )
    {
      clear_cachesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject clear_caches_value = ( NIL != clear_cachesP ) ? $str7$true : $str8$false;
    final SubLObject lexical_mt_string = ( NIL != lexical_mt ) ? lexical_mt : $str9$;
    final SubLObject scg_parser_host = $scg_parser_host$.getDynamicValue( thread );
    final SubLObject scg_parser_port = get_scg_parser_port();
    final SubLObject scg_parser_callback_host = get_scg_parser_callback_host();
    final SubLObject scg_parser_callback_port = get_scg_parser_callback_port();
    final SubLObject url = Sequences.cconcatenate( $str10$http___, new SubLObject[] { format_nil.format_nil_a_no_copy( scg_parser_host ), $str11$_, format_nil.format_nil_a_no_copy( scg_parser_port ),
      $str12$_scg_text_translate_clearCaches_, format_nil.format_nil_a_no_copy( clear_caches_value ), $str13$_inputText_, format_nil.format_nil_a_no_copy( web_utilities.html_url_encode( string_to_parse, UNPROVIDED ) ),
      $str14$_templateTags_, format_nil.format_nil_a_no_copy( web_utilities.html_url_encode( tag_string, UNPROVIDED ) ), $str15$_cycHost_, format_nil.format_nil_a_no_copy( scg_parser_callback_host ), $str16$_cycPort_,
      format_nil.format_nil_a_no_copy( Numbers.subtract( scg_parser_callback_port, TWO_INTEGER ) ), $str17$_lexicalMt_, format_nil.format_nil_a_no_copy( lexical_mt_string ), $str18$_timeoutMsec_, format_nil
          .format_nil_a_no_copy( Numbers.multiply( $int19$1000, max_time ) )
    } );
    final SubLObject return_types = $list20;
    return Values.values( web_utilities.dereference_url( url, NIL, return_types, NIL, Numbers.add( TWO_INTEGER, $scg_default_max_time$.getDynamicValue( thread ) ) ), url );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 4418L)
  public static SubLObject scg_parse(final SubLObject string_to_parse, SubLObject params)
  {
    if( params == UNPROVIDED )
    {
      params = ConsesLow.list( new SubLObject[] { $kw21$TAG_STRING_PARAMETER, NIL, $kw22$LEXICAL_MT, NIL, $kw23$CLEAR_CACHES_, NIL, $kw24$COMPLETE_MATCHES_ONLY_, T, $kw25$MAX_TIME, $scg_default_max_time$
          .getDynamicValue()
      } );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    params = list_utilities.augment_plist_with_defaults( params, ConsesLow.list( $kw24$COMPLETE_MATCHES_ONLY_, T, $kw25$MAX_TIME, $scg_default_max_time$.getDynamicValue( thread ) ) );
    final SubLObject max_time = ( NIL == conses_high.getf( params, $kw25$MAX_TIME, UNPROVIDED ) ) ? ZERO_INTEGER : Numbers.max( ONE_INTEGER, conses_high.getf( params, $kw25$MAX_TIME, UNPROVIDED ) );
    final SubLObject tag_string = ( NIL != conses_high.getf( params, $kw21$TAG_STRING_PARAMETER, UNPROVIDED ) ) ? conses_high.getf( params, $kw21$TAG_STRING_PARAMETER, UNPROVIDED )
        : scg_construction_tag_string( UNPROVIDED );
    final SubLObject final_lexical_mt = ( NIL != conses_high.getf( params, $kw22$LEXICAL_MT, UNPROVIDED ) ) ? conses_high.getf( params, $kw22$LEXICAL_MT, UNPROVIDED ) : scg_lexical_mt( UNPROVIDED );
    final SubLObject lexical_mt_string = ( NIL != final_lexical_mt ) ? string_utilities.string_remove_constant_reader_prefixes( string_utilities.to_string( final_lexical_mt ) ) : $str9$;
    final SubLObject complete_matchesP = conses_high.getf( params, $kw24$COMPLETE_MATCHES_ONLY_, T );
    final SubLObject clear_caches = ( NIL != conses_high.getf( params, $kw23$CLEAR_CACHES_, UNPROVIDED ) ) ? conses_high.getf( params, $kw23$CLEAR_CACHES_, UNPROVIDED ) : NIL;
    thread.resetMultipleValues();
    final SubLObject xml_string = get_scg_parse_results_in_xml( string_to_parse, max_time, tag_string, lexical_mt_string, clear_caches );
    final SubLObject url = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject token_iterator = xml_parsing_utilities.new_xml_token_iterator( streams_high.make_private_string_input_stream( xml_string, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject working_on_correct_string = NIL;
    SubLObject current_string = NIL;
    SubLObject current_offset = NIL;
    SubLObject cycls = NIL;
    SubLObject strings = NIL;
    SubLObject offsets = NIL;
    while ( NIL == iteration.iteration_done( token_iterator ))
    {
      final SubLObject token = iteration.iteration_next( token_iterator );
      final SubLObject element_name = xml_parsing_utilities.xml_token_element_name( token );
      if( NIL != xml_parsing_utilities.xml_opening_tag_p( token ) && $str26$source.equal( element_name ) )
      {
        current_offset = reader.read_from_string_ignoring_errors( xml_parsing_utilities.xml_tag_attribute_value( token, $str27$start, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        current_string = xml_utilities.xml_unescape_string( iteration.iteration_next( token_iterator ) );
        working_on_correct_string = list_utilities.lengthE( string_to_parse, Sequences.length( current_string ), UNPROVIDED );
      }
      if( ( NIL != working_on_correct_string || NIL == complete_matchesP ) && NIL != xml_parsing_utilities.xml_opening_tag_p( token ) && NIL != string_utilities.ends_with( element_name, $str28$_cycl, UNPROVIDED ) )
      {
        cycls = ConsesLow.cons( reader.read_from_string_ignoring_errors( iteration.iteration_next( token_iterator ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), cycls );
        strings = ConsesLow.cons( current_string, strings );
        offsets = ConsesLow.cons( current_offset, offsets );
      }
    }
    return Values.values( cycls, url, strings, offsets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
  public static SubLObject clear_scg_lexical_mt()
  {
    final SubLObject cs = $scg_lexical_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
  public static SubLObject remove_scg_lexical_mt(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $scg_lexical_mt_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
  public static SubLObject scg_lexical_mt_internal(final SubLObject mt)
  {
    final SubLObject lexical_mts = ask_utilities.query_variable( $sym30$_LEX_MT, ConsesLow.listS( $const31$scgLexicalMts, mt, $list32 ), $const33$InferencePSC, UNPROVIDED );
    if( NIL != list_utilities.lengthG( lexical_mts, ONE_INTEGER, UNPROVIDED ) )
    {
      return el_utilities.make_formula( $const34$MtUnionFn, lexical_mts, UNPROVIDED );
    }
    if( NIL != list_utilities.lengthE( lexical_mts, ONE_INTEGER, UNPROVIDED ) )
    {
      return lexical_mts.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
  public static SubLObject scg_lexical_mt(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject caching_state = $scg_lexical_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym29$SCG_LEXICAL_MT, $sym35$_SCG_LEXICAL_MT_CACHING_STATE_, $int36$32, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym37$CLEAR_SCG_LEXICAL_MT );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( scg_lexical_mt_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 7104L)
  public static SubLObject scg_construction_tag_string(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tags = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym38$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const39$EverythingPSC, thread );
      tags = Mapping.mapcar( $sym40$GAF_ARG2, kb_mapping.gather_gaf_arg_index( mt, ONE_INTEGER, $const41$scgTags, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL == tags )
    {
      tags = Mapping.mapcar( $sym42$GAF_ARG1, kb_mapping.gather_predicate_extent_index( $const43$scgTagRelevant, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != tags )
    {
      return string_utilities.bunge( tags, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 7437L)
  public static SubLObject scg_parse_term(final SubLObject string_to_parse, SubLObject tag_string, SubLObject lexical_mt)
  {
    if( tag_string == UNPROVIDED )
    {
      tag_string = $default_scg_tag_string$.getDynamicValue();
    }
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = NIL;
    }
    SubLObject terms = NIL;
    SubLObject cdolist_list_var;
    final SubLObject parses = cdolist_list_var = scg_parse( string_to_parse, ConsesLow.list( $kw44$TAG_STRING, tag_string, $kw22$LEXICAL_MT, lexical_mt ) );
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( parse ).eql( $const45$equalSymbols ) && NIL != cycl_grammar.cycl_variable_p( cycl_utilities.formula_arg1( parse, UNPROVIDED ) ) )
      {
        terms = ConsesLow.cons( cycl_utilities.formula_arg2( parse, UNPROVIDED ), terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 7845L)
  public static SubLObject scg_parse_test(final SubLObject string_to_parse, final SubLObject params, final SubLObject test, final SubLObject v_answer)
  {
    if( NIL != params )
    {
      return Functions.funcall( test, scg_parse( string_to_parse, params ), v_answer );
    }
    return Functions.funcall( test, scg_parse( string_to_parse, UNPROVIDED ), v_answer );
  }

  public static SubLObject declare_scg_api_file()
  {
    SubLFiles.declareFunction( me, "get_scg_parser_port", "GET-SCG-PARSER-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "get_scg_parser_callback_host", "GET-SCG-PARSER-CALLBACK-HOST", 0, 0, false );
    SubLFiles.declareFunction( me, "get_scg_parser_callback_port", "GET-SCG-PARSER-CALLBACK-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_scg_parse_host", "SET-SCG-PARSE-HOST", 2, 2, false );
    SubLFiles.declareFunction( me, "get_scg_parse_results_in_xml", "GET-SCG-PARSE-RESULTS-IN-XML", 1, 4, false );
    SubLFiles.declareFunction( me, "scg_parse", "SCG-PARSE", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_scg_lexical_mt", "CLEAR-SCG-LEXICAL-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_scg_lexical_mt", "REMOVE-SCG-LEXICAL-MT", 0, 1, false );
    SubLFiles.declareFunction( me, "scg_lexical_mt_internal", "SCG-LEXICAL-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "scg_lexical_mt", "SCG-LEXICAL-MT", 0, 1, false );
    SubLFiles.declareFunction( me, "scg_construction_tag_string", "SCG-CONSTRUCTION-TAG-STRING", 0, 1, false );
    SubLFiles.declareFunction( me, "scg_parse_term", "SCG-PARSE-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "scg_parse_test", "SCG-PARSE-TEST", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_scg_api_file()
  {
    $scg_parser_host$ = SubLFiles.defparameter( "*SCG-PARSER-HOST*", $str0$localhost );
    $scg_parser_port$ = SubLFiles.defparameter( "*SCG-PARSER-PORT*", $kw1$UNINITIALIZED );
    $scg_default_max_time$ = SubLFiles.defparameter( "*SCG-DEFAULT-MAX-TIME*", Numbers.multiply( TEN_INTEGER, $int3$60 ) );
    $scg_parser_callback_host$ = SubLFiles.defparameter( "*SCG-PARSER-CALLBACK-HOST*", $kw1$UNINITIALIZED );
    $scg_parser_callback_port$ = SubLFiles.defparameter( "*SCG-PARSER-CALLBACK-PORT*", $kw1$UNINITIALIZED );
    $scg_parser_callback_fallback_host$ = SubLFiles.defparameter( "*SCG-PARSER-CALLBACK-FALLBACK-HOST*", $str4$public1_cyc_com );
    $scg_parser_callback_fallback_base_port$ = SubLFiles.defparameter( "*SCG-PARSER-CALLBACK-FALLBACK-BASE-PORT*", $int5$3600 );
    $default_scg_tag_string$ = SubLFiles.defparameter( "*DEFAULT-SCG-TAG-STRING*", $str6$general );
    $scg_lexical_mt_caching_state$ = SubLFiles.deflexical( "*SCG-LEXICAL-MT-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_scg_api_file()
  {
    memoization_state.note_globally_cached_function( $sym29$SCG_LEXICAL_MT );
    generic_testing.define_test_case_table_int( $sym46$SCG_PARSE_TEST, ConsesLow.list( new SubLObject[] { $kw47$TEST, EQUAL, $kw48$OWNER, NIL, $kw49$CLASSES, NIL, $kw50$KB, $kw51$FULL, $kw52$WORKING_, T
    } ), $list53 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_scg_api_file();
  }

  @Override
  public void initializeVariables()
  {
    init_scg_api_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_scg_api_file();
  }
  static
  {
    me = new scg_api();
    $scg_parser_host$ = null;
    $scg_parser_port$ = null;
    $scg_default_max_time$ = null;
    $scg_parser_callback_host$ = null;
    $scg_parser_callback_port$ = null;
    $scg_parser_callback_fallback_host$ = null;
    $scg_parser_callback_fallback_base_port$ = null;
    $default_scg_tag_string$ = null;
    $scg_lexical_mt_caching_state$ = null;
    $str0$localhost = makeString( "localhost" );
    $kw1$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str2$Unable_to_initialize__A__ = makeString( "Unable to initialize ~A~%" );
    $int3$60 = makeInteger( 60 );
    $str4$public1_cyc_com = makeString( "public1.cyc.com" );
    $int5$3600 = makeInteger( 3600 );
    $str6$general = makeString( "general" );
    $str7$true = makeString( "true" );
    $str8$false = makeString( "false" );
    $str9$ = makeString( "" );
    $str10$http___ = makeString( "http://" );
    $str11$_ = makeString( ":" );
    $str12$_scg_text_translate_clearCaches_ = makeString( "/scg/text/translate?clearCaches=" );
    $str13$_inputText_ = makeString( "&inputText=" );
    $str14$_templateTags_ = makeString( "&templateTags=" );
    $str15$_cycHost_ = makeString( "&cycHost=" );
    $str16$_cycPort_ = makeString( "&cycPort=" );
    $str17$_lexicalMt_ = makeString( "&lexicalMt=" );
    $str18$_timeoutMsec_ = makeString( "&timeoutMsec=" );
    $int19$1000 = makeInteger( 1000 );
    $list20 = ConsesLow.list( makeString( "text/xml" ) );
    $kw21$TAG_STRING_PARAMETER = makeKeyword( "TAG-STRING-PARAMETER" );
    $kw22$LEXICAL_MT = makeKeyword( "LEXICAL-MT" );
    $kw23$CLEAR_CACHES_ = makeKeyword( "CLEAR-CACHES?" );
    $kw24$COMPLETE_MATCHES_ONLY_ = makeKeyword( "COMPLETE-MATCHES-ONLY?" );
    $kw25$MAX_TIME = makeKeyword( "MAX-TIME" );
    $str26$source = makeString( "source" );
    $str27$start = makeString( "start" );
    $str28$_cycl = makeString( ":cycl" );
    $sym29$SCG_LEXICAL_MT = makeSymbol( "SCG-LEXICAL-MT" );
    $sym30$_LEX_MT = makeSymbol( "?LEX-MT" );
    $const31$scgLexicalMts = constant_handles.reader_make_constant_shell( makeString( "scgLexicalMts" ) );
    $list32 = ConsesLow.list( makeSymbol( "?LEX-MT" ) );
    $const33$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $const34$MtUnionFn = constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) );
    $sym35$_SCG_LEXICAL_MT_CACHING_STATE_ = makeSymbol( "*SCG-LEXICAL-MT-CACHING-STATE*" );
    $int36$32 = makeInteger( 32 );
    $sym37$CLEAR_SCG_LEXICAL_MT = makeSymbol( "CLEAR-SCG-LEXICAL-MT" );
    $sym38$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const39$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym40$GAF_ARG2 = makeSymbol( "GAF-ARG2" );
    $const41$scgTags = constant_handles.reader_make_constant_shell( makeString( "scgTags" ) );
    $sym42$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $const43$scgTagRelevant = constant_handles.reader_make_constant_shell( makeString( "scgTagRelevant" ) );
    $kw44$TAG_STRING = makeKeyword( "TAG-STRING" );
    $const45$equalSymbols = constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) );
    $sym46$SCG_PARSE_TEST = makeSymbol( "SCG-PARSE-TEST" );
    $kw47$TEST = makeKeyword( "TEST" );
    $kw48$OWNER = makeKeyword( "OWNER" );
    $kw49$CLASSES = makeKeyword( "CLASSES" );
    $kw50$KB = makeKeyword( "KB" );
    $kw51$FULL = makeKeyword( "FULL" );
    $kw52$WORKING_ = makeKeyword( "WORKING?" );
    $list53 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Barack Obama flick flork flack" ), NIL, EQUAL, NIL ), T ), ConsesLow.list( ConsesLow.list( makeString( "Barack Obama was born in 1961" ), NIL,
        makeSymbol( "HAS-MEMBER-EQUAL?" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), constant_handles.reader_make_constant_shell( makeString( "BarackObama" ) ), ConsesLow
            .list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1961 ) ) ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "Barack Obama was born blarg in 1961" ), ConsesLow
                .list( makeKeyword( "COMPLETE-MATCHES-ONLY?" ), NIL ), makeSymbol( "HAS-MEMBER-EQUAL?" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ),
                    constant_handles.reader_make_constant_shell( makeString( "BarackObama" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "Barack Obama was born in 1961" ), NIL, makeSymbol(
                        "NOT-HAS-MEMBER-EQUAL?" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeSymbol( "?X" ), constant_handles
                            .reader_make_constant_shell( makeString( "BarackObama" ) ) ) ) ), T ) );
  }
}
/*
 *
 * Total time: 79 ms
 *
 */