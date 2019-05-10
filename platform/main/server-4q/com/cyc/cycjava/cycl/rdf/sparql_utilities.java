package com.cyc.cycjava.cycl.rdf;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.tcp_server_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sparql_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rdf.sparql_utilities";
  public static final String myFingerPrint = "150a2e2b7c4d6927497fbf719e603bf7dbe3534e1dc9738d0933477b321563b6";
  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 835L)
  private static SubLSymbol $sparql_query_vars_cached_caching_state$;
  private static final SubLString $str0$_sparql;
  private static final SubLInteger $int1$80;
  private static final SubLSymbol $sym2$SPARQL_QUERY_VARS_CACHED;
  private static final SubLSymbol $sym3$_SPARQL_QUERY_VARS_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym4$STRINGP;
  private static final SubLSymbol $sym5$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym6$TCP_PORT_P;
  private static final SubLSymbol $sym7$ALIST_P;
  private static final SubLObject $const8$serverOfSKS;
  private static final SubLObject $const9$portNumberForSKS;
  private static final SubLObject $const10$relativePathForAPIAccessToSKS;
  private static final SubLObject $const11$nameSpacePrefixForSKS;
  private static final SubLObject $const12$subProtocolForSKS;
  private static final SubLSymbol $sym13$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym14$_EXIT;
  private static final SubLString $str15$_;
  private static final SubLString $str16$_;
  private static final SubLString $str17$DESCRIBE_;
  private static final SubLString $str18$_sparql;
  private static final SubLString $str19$results;
  private static final SubLString $str20$_result;
  private static final SubLString $str21$result;
  private static final SubLString $str22$_;
  private static final SubLSymbol $sym23$NULL;
  private static final SubLSymbol $sym24$SPARQL_EXTRACT_RESULT_SET;
  private static final SubLSymbol $kw25$TEST;
  private static final SubLSymbol $kw26$OWNER;
  private static final SubLSymbol $kw27$CLASSES;
  private static final SubLSymbol $kw28$KB;
  private static final SubLSymbol $kw29$TINY;
  private static final SubLSymbol $kw30$WORKING_;
  private static final SubLObject $list31;
  private static final SubLSymbol $kw32$DEFAULT;
  private static final SubLSymbol $kw33$PRIVATE;
  private static final SubLSymbol $kw34$MACHINE;
  private static final SubLSymbol $kw35$PORT;
  private static final SubLSymbol $kw36$METHOD;
  private static final SubLSymbol $kw37$GET;
  private static final SubLSymbol $kw38$URL;
  private static final SubLSymbol $kw39$QUERY;
  private static final SubLString $str40$query_;
  private static final SubLSymbol $kw41$KEEP_ALIVE_;
  private static final SubLSymbol $kw42$WIDE_NEWLINES_;
  private static final SubLSymbol $kw43$ACCEPT_TYPES;
  private static final SubLList $list44;
  private static final SubLSymbol $kw45$CONTENT_TYPE;
  private static final SubLSymbol $kw46$SOAP_ACTION_URI;
  private static final SubLString $str47$_binding;
  private static final SubLString $str48$binding;
  private static final SubLString $str49$_literal;
  private static final SubLString $str50$_bnode;
  private static final SubLString $str51$__;
  private static final SubLString $str52$_uri;
  private static final SubLString $str53$Time_to_support__S;
  private static final SubLList $list54;
  private static final SubLString $str55$_;

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 835L)
  public static SubLObject clear_sparql_query_vars_cached()
  {
    final SubLObject cs = $sparql_query_vars_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 835L)
  public static SubLObject remove_sparql_query_vars_cached(final SubLObject query, final SubLObject vars, final SubLObject machine, SubLObject url, SubLObject port)
  {
    if( url == UNPROVIDED )
    {
      url = $str0$_sparql;
    }
    if( port == UNPROVIDED )
    {
      port = $int1$80;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $sparql_query_vars_cached_caching_state$.getGlobalValue(), ConsesLow.list( query, vars, machine, url, port ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 835L)
  public static SubLObject sparql_query_vars_cached_internal(final SubLObject query, final SubLObject vars, final SubLObject machine, final SubLObject url, final SubLObject port)
  {
    return sparql_query_vars( query, vars, machine, url, port );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 835L)
  public static SubLObject sparql_query_vars_cached(final SubLObject query, final SubLObject vars, final SubLObject machine, SubLObject url, SubLObject port)
  {
    if( url == UNPROVIDED )
    {
      url = $str0$_sparql;
    }
    if( port == UNPROVIDED )
    {
      port = $int1$80;
    }
    SubLObject caching_state = $sparql_query_vars_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym2$SPARQL_QUERY_VARS_CACHED, $sym3$_SPARQL_QUERY_VARS_CACHED_CACHING_STATE_, NIL, EQUAL, FIVE_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( query, vars, machine, url, port );
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
        if( query.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( vars.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( machine.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( url.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && port.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sparql_query_vars_cached_internal( query, vars, machine, url, port ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( query, vars, machine, url, port ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 1028L)
  public static SubLObject sparql_query_vars(final SubLObject query, final SubLObject vars, final SubLObject machine, SubLObject url, SubLObject port)
  {
    if( url == UNPROVIDED )
    {
      url = $str0$_sparql;
    }
    if( port == UNPROVIDED )
    {
      port = $int1$80;
    }
    assert NIL != Types.stringp( query ) : query;
    assert NIL != list_utilities.non_dotted_list_p( vars ) : vars;
    SubLObject cdolist_list_var = vars;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject rdf = perform_sparql_rdf_query( query, machine, url, port );
    SubLObject result_set = NIL;
    SubLObject in_stream = NIL;
    try
    {
      in_stream = streams_high.make_private_string_input_stream( rdf, ZERO_INTEGER, NIL );
      result_set = sparql_xml_tokens_to_result_set( xml_parsing_utilities.xml_tokenize( in_stream, T, T, T ), vars, NIL );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( in_stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 1432L)
  public static SubLObject sparql_query_result_set(final SubLObject sparql, final SubLObject machine, SubLObject relative_path, SubLObject extract_rdf_literalsP, SubLObject port, SubLObject prefix_map,
      SubLObject subprotocol, SubLObject params)
  {
    if( relative_path == UNPROVIDED )
    {
      relative_path = $str0$_sparql;
    }
    if( extract_rdf_literalsP == UNPROVIDED )
    {
      extract_rdf_literalsP = NIL;
    }
    if( port == UNPROVIDED )
    {
      port = $int1$80;
    }
    if( prefix_map == UNPROVIDED )
    {
      prefix_map = NIL;
    }
    if( subprotocol == UNPROVIDED )
    {
      subprotocol = NIL;
    }
    if( params == UNPROVIDED )
    {
      params = NIL;
    }
    assert NIL != Types.stringp( sparql ) : sparql;
    assert NIL != Types.stringp( machine ) : machine;
    assert NIL != Types.stringp( relative_path ) : relative_path;
    assert NIL != tcp_server_utilities.tcp_port_p( port ) : port;
    if( NIL != subprotocol && !assertionsDisabledInClass && NIL == Types.stringp( subprotocol ) )
    {
      throw new AssertionError( subprotocol );
    }
    if( NIL != params && !assertionsDisabledInClass && NIL == list_utilities.alist_p( params ) )
    {
      throw new AssertionError( params );
    }
    final SubLObject access_path = dictionary_utilities.new_dictionary_from_alist( ConsesLow.list( reader.bq_cons( $const8$serverOfSKS, machine ), reader.bq_cons( $const9$portNumberForSKS, port ), reader.bq_cons(
        $const10$relativePathForAPIAccessToSKS, relative_path ), reader.bq_cons( $const11$nameSpacePrefixForSKS, prefix_map ), reader.bq_cons( $const12$subProtocolForSKS, subprotocol ) ), UNPROVIDED );
    return sksi_sks_interaction.get_result_set_from_sparql_source( sparql, access_path, params, extract_rdf_literalsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 2375L)
  public static SubLObject sparql_query_result_set_with_retries(final SubLObject sparql, final SubLObject machine, SubLObject extract_rdf_literalsP, SubLObject retries, SubLObject params, SubLObject relative_path,
      SubLObject port, SubLObject prefix_map, SubLObject subprotocol)
  {
    if( extract_rdf_literalsP == UNPROVIDED )
    {
      extract_rdf_literalsP = NIL;
    }
    if( retries == UNPROVIDED )
    {
      retries = THREE_INTEGER;
    }
    if( params == UNPROVIDED )
    {
      params = NIL;
    }
    if( relative_path == UNPROVIDED )
    {
      relative_path = $str0$_sparql;
    }
    if( port == UNPROVIDED )
    {
      port = $int1$80;
    }
    if( prefix_map == UNPROVIDED )
    {
      prefix_map = NIL;
    }
    if( subprotocol == UNPROVIDED )
    {
      subprotocol = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject n;
    SubLObject err;
    SubLObject _prev_bind_0;
    for( n = NIL, n = ZERO_INTEGER; n.numL( retries ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      err = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym13$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            return sparql_query_result_set( sparql, machine, relative_path, extract_rdf_literalsP, port, prefix_map, subprotocol, params );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        err = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != err )
      {
        Errors.error( err );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 3018L)
  public static SubLObject sparql_describe(SubLObject uri, final SubLObject machine, SubLObject url, SubLObject port)
  {
    if( url == UNPROVIDED )
    {
      url = $str0$_sparql;
    }
    if( port == UNPROVIDED )
    {
      port = $int1$80;
    }
    assert NIL != Types.stringp( uri ) : uri;
    if( !string_utilities.first_char( uri ).eql( Characters.CHAR_less ) || !string_utilities.last_char( uri ).eql( Characters.CHAR_greater ) )
    {
      uri = Sequences.cconcatenate( $str15$_, new SubLObject[] { format_nil.format_nil_a_no_copy( uri ), $str16$_
      } );
    }
    final SubLObject query = Sequences.cconcatenate( $str17$DESCRIBE_, format_nil.format_nil_a_no_copy( uri ) );
    return perform_sparql_rdf_query( query, machine, url, port );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 3424L)
  public static SubLObject sparql_xml_tokens_to_result_set(final SubLObject xml_tokens, final SubLObject variable_names, final SubLObject prefix_map)
  {
    final SubLObject sparql_start = xml_parsing_utilities.advance_xml_tokens_to( xml_tokens, $str18$_sparql, UNPROVIDED );
    final SubLObject results_tokens = xml_parsing_utilities.xml_extract_token_sequence( sparql_start, $str19$results );
    final SubLObject result_set = sparql_extract_result_set( variable_names, results_tokens, prefix_map );
    return result_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 4311L)
  public static SubLObject sparql_extract_result_set(final SubLObject variable_names, final SubLObject results_tokens, final SubLObject prefix_map)
  {
    if( NIL != list_utilities.singletonP( results_tokens ) )
    {
      return NIL;
    }
    SubLObject result_set = NIL;
    for( SubLObject result_start_tokens = xml_parsing_utilities.advance_xml_tokens_to( results_tokens.rest(), $str20$_result, UNPROVIDED ); NIL != result_start_tokens; result_start_tokens = xml_parsing_utilities
        .advance_xml_tokens_to( result_start_tokens.rest(), $str20$_result, UNPROVIDED ) )
    {
      final SubLObject result_tokens = xml_parsing_utilities.xml_extract_token_sequence( result_start_tokens, $str21$result );
      final SubLObject result = sparql_extract_result( variable_names, result_tokens, prefix_map );
      if( NIL != subl_promotions.memberP( $str22$_, variable_names, EQUAL, UNPROVIDED ) || NIL == list_utilities.list_of_type_p( $sym23$NULL, result ) )
      {
        result_set = ConsesLow.cons( result, result_set );
      }
    }
    return Sequences.nreverse( result_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 11833L)
  public static SubLObject perform_sparql_rdf_query(final SubLObject query, final SubLObject machine, final SubLObject url, final SubLObject port)
  {
    SubLObject rdf = NIL;
    final SubLObject real_port = port.eql( $kw32$DEFAULT ) ? $int1$80 : port;
    SubLObject in_stream = NIL;
    try
    {
      in_stream = subl_promotions.open_tcp_stream_with_timeout( machine, real_port, NIL, $kw33$PRIVATE );
      if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, machine, real_port ) )
      {
        web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw34$MACHINE, machine, $kw35$PORT, port, $kw36$METHOD, $kw37$GET, $kw38$URL, url, $kw39$QUERY, Sequences.cconcatenate(
            $str40$query_, web_utilities.html_url_encode( query, UNPROVIDED ) ), $kw41$KEEP_ALIVE_, T, $kw42$WIDE_NEWLINES_, T, $kw43$ACCEPT_TYPES, $list44, $kw45$CONTENT_TYPE, $kw32$DEFAULT, $kw46$SOAP_ACTION_URI, NIL
        } ) );
        rdf = web_utilities.http_response_body( web_utilities.slack_read_until_eof( in_stream, UNPROVIDED ) );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != in_stream )
        {
          streams_high.close( in_stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    if( !Characters.CHAR_less.eql( string_utilities.first_char( rdf ) ) )
    {
      final SubLObject start = Sequences.position( Characters.CHAR_less, rdf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != start )
      {
        rdf = string_utilities.substring( rdf, start, UNPROVIDED );
      }
    }
    return rdf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 12442L)
  public static SubLObject sparql_extract_result(final SubLObject variable_names, final SubLObject result_tokens, final SubLObject prefix_map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject result = ConsesLow.make_list( Sequences.length( variable_names ), NIL );
    for( SubLObject binding_start_tokens = xml_parsing_utilities.advance_xml_tokens_to( result_tokens, $str47$_binding, UNPROVIDED ); NIL != binding_start_tokens; binding_start_tokens = xml_parsing_utilities
        .advance_xml_tokens_to( binding_start_tokens.rest(), $str47$_binding, UNPROVIDED ) )
    {
      final SubLObject binding_tokens = xml_parsing_utilities.xml_extract_token_sequence( binding_start_tokens, $str48$binding );
      thread.resetMultipleValues();
      final SubLObject variable_name = sparql_extract_binding_value( binding_tokens, prefix_map );
      final SubLObject binding_value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject result_index = Sequences.position( variable_name, variable_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( result_index.isInteger() )
      {
        ConsesLow.set_nth( result_index, result, binding_value );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 13183L)
  public static SubLObject sparql_extract_binding_value(final SubLObject binding_tokens, final SubLObject prefix_map)
  {
    final SubLObject binding_token = binding_tokens.first();
    final SubLObject binding_end = conses_high.last( binding_tokens, UNPROVIDED );
    final SubLObject value_tokens = conses_high.ldiff( binding_tokens.rest(), binding_end );
    final SubLObject variable_name = reader.read_from_string_ignoring_errors( binding_token, NIL, NIL, FOURTEEN_INTEGER, UNPROVIDED );
    final SubLObject binding_value = sparql_extract_binding_value_int( value_tokens, prefix_map );
    return Values.values( variable_name, binding_value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 13610L)
  public static SubLObject sparql_extract_binding_value_int(final SubLObject value_tokens, final SubLObject prefix_map)
  {
    final SubLObject first_token = string_utilities.trim_whitespace( value_tokens.first() );
    if( NIL != string_utilities.empty_string_p( first_token ) )
    {
      return sparql_extract_binding_value_int( value_tokens.rest(), prefix_map );
    }
    if( NIL != string_utilities.starts_with( first_token, $str49$_literal ) )
    {
      return conses_high.second( value_tokens );
    }
    if( NIL != string_utilities.starts_with( first_token, $str50$_bnode ) )
    {
      return Sequences.cconcatenate( $str51$__, format_nil.format_nil_a_no_copy( conses_high.second( value_tokens ) ) );
    }
    if( NIL != string_utilities.starts_with( first_token, $str52$_uri ) )
    {
      return sparql_extract_uri_value( conses_high.second( value_tokens ), prefix_map );
    }
    return Errors.error( $str53$Time_to_support__S, first_token );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/sparql-utilities.lisp", position = 14313L)
  public static SubLObject sparql_extract_uri_value(final SubLObject uri_string, final SubLObject prefix_map)
  {
    final SubLObject uri_split = Sequences.position( Characters.CHAR_hash, uri_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != uri_split )
    {
      final SubLObject uri_context = string_utilities.substring( uri_string, ZERO_INTEGER, uri_split );
      final SubLObject uri_value = string_utilities.substring( uri_string, number_utilities.f_1X( uri_split ), UNPROVIDED );
      SubLObject cdolist_list_var = prefix_map;
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject prefix = NIL;
        SubLObject prefix_uri = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
        prefix = current.first();
        current = ( prefix_uri = current.rest() );
        if( NIL != string_utilities.starts_with( prefix_uri, uri_context ) )
        {
          return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( prefix ), new SubLObject[] { $str55$_, format_nil.format_nil_a_no_copy( uri_value )
          } );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    return Sequences.cconcatenate( $str15$_, new SubLObject[] { format_nil.format_nil_a_no_copy( uri_string ), $str16$_
    } );
  }

  public static SubLObject declare_sparql_utilities_file()
  {
    SubLFiles.declareFunction( me, "clear_sparql_query_vars_cached", "CLEAR-SPARQL-QUERY-VARS-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sparql_query_vars_cached", "REMOVE-SPARQL-QUERY-VARS-CACHED", 3, 2, false );
    SubLFiles.declareFunction( me, "sparql_query_vars_cached_internal", "SPARQL-QUERY-VARS-CACHED-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "sparql_query_vars_cached", "SPARQL-QUERY-VARS-CACHED", 3, 2, false );
    SubLFiles.declareFunction( me, "sparql_query_vars", "SPARQL-QUERY-VARS", 3, 2, false );
    SubLFiles.declareFunction( me, "sparql_query_result_set", "SPARQL-QUERY-RESULT-SET", 2, 6, false );
    SubLFiles.declareFunction( me, "sparql_query_result_set_with_retries", "SPARQL-QUERY-RESULT-SET-WITH-RETRIES", 2, 7, false );
    SubLFiles.declareFunction( me, "sparql_describe", "SPARQL-DESCRIBE", 2, 2, false );
    SubLFiles.declareFunction( me, "sparql_xml_tokens_to_result_set", "SPARQL-XML-TOKENS-TO-RESULT-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "sparql_extract_result_set", "SPARQL-EXTRACT-RESULT-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "perform_sparql_rdf_query", "PERFORM-SPARQL-RDF-QUERY", 4, 0, false );
    SubLFiles.declareFunction( me, "sparql_extract_result", "SPARQL-EXTRACT-RESULT", 3, 0, false );
    SubLFiles.declareFunction( me, "sparql_extract_binding_value", "SPARQL-EXTRACT-BINDING-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "sparql_extract_binding_value_int", "SPARQL-EXTRACT-BINDING-VALUE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "sparql_extract_uri_value", "SPARQL-EXTRACT-URI-VALUE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sparql_utilities_file()
  {
    $sparql_query_vars_cached_caching_state$ = SubLFiles.deflexical( "*SPARQL-QUERY-VARS-CACHED-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_sparql_utilities_file()
  {
    memoization_state.note_globally_cached_function( $sym2$SPARQL_QUERY_VARS_CACHED );
    generic_testing.define_test_case_table_int( $sym24$SPARQL_EXTRACT_RESULT_SET, ConsesLow.list( new SubLObject[] { $kw25$TEST, Symbols.symbol_function( EQUAL ), $kw26$OWNER, NIL, $kw27$CLASSES, NIL, $kw28$KB,
      $kw29$TINY, $kw30$WORKING_, T
    } ), $list31 );
    return NIL;
  }

  private static SubLObject _constant_31_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "obj" ) ), ConsesLow.list( new SubLObject[] { makeString( "<results distinct=\"false\" ordered=\"true\">" ),
      makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString( "<literal>" ), makeString( "1885" ), makeString( "</literal>" ), makeString(
          "</binding>" ), makeString( "\n  " ), makeString( "</result>" ), makeString( "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "1885" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "obj" ) ), ConsesLow.list( makeString(
                "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n " ), makeString( "</results>" ) ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString(
                    "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString( "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow
                        .list( makeString( "obj" ) ), ConsesLow.list( new SubLObject[]
                        { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString(
                            "<literal datatype=\"http://www.w3.org/2001/XMLSchema#float\">" ), makeString( "78.04222106933594" ), makeString( "</literal>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString(
                                "</result>" ), makeString( "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "78.04222106933594" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "obj" ) ), ConsesLow.list(
                new SubLObject[]
                { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString(
                    "<literal datatype=\"http://www.w3.org/2001/XMLSchema#float\">" ), makeString( "27.17416572570801" ), makeString( "</literal>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString(
                        "</result>" ), makeString( "\n " ), makeString( "</results>" )
                } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
                    "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "27.17416572570801" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "obj" ) ),
                        ConsesLow.list( new SubLObject[]
                        { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString(
                            "<literal datatype=\"http://www.w3.org/2001/XMLSchema#date\">" ), makeString( "1923-11-18" ), makeString( "</literal>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString(
                                "</result>" ), makeString( "\n " ), makeString( "</results>" )
                        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
                            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "1923-11-18" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "obj" ) ),
                                ConsesLow.list( new SubLObject[]
                                { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString(
                                    "<literal datatype=\"http://www.w3.org/2001/XMLSchema#date\">" ), makeString( "1998-07-21" ), makeString( "</literal>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString(
                                        "</result>" ), makeString( "\n " ), makeString( "</results>" )
                                } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
                                    "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "1998-07-21" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString(
                                        "obj" ) ), ConsesLow.list( new SubLObject[]
                                        { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ),
                                          makeString( "<uri>" ), makeString( "http://dbpedia.org/resource/Edinburgh" ), makeString( "</uri>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ),
                                          makeString( "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<http://dbpedia.org/resource/Edinburgh>" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString(
                "*" ) ), ConsesLow.list( new SubLObject[]
                { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"_star_fake\">" ), makeString(
                    "<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">" ), makeString( "1" ), makeString( "</literal>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ),
                  makeString( "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( NIL ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "*" ) ), ConsesLow.list( new SubLObject[]
            { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"_star_fake\">" ), makeString(
                "<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">" ), makeString( "1" ), makeString( "</literal>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ), makeString(
                    "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( NIL ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "obj" ) ), ConsesLow.list( new SubLObject[]
            { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString( "<uri>" ),
              makeString( "http://dbpedia.org/resource/Brooklyn" ), makeString( "</uri>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ), makeString( "\n  " ), makeString( "<result>" ),
              makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString( "<uri>" ), makeString( "http://dbpedia.org/resource/New_York" ), makeString( "</uri>" ), makeString( "</binding>" ), makeString(
                  "\n  " ), makeString( "</result>" ), makeString( "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<http://dbpedia.org/resource/Brooklyn>" ) ), ConsesLow.list( makeString(
                "<http://dbpedia.org/resource/New_York>" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "obj" ) ), ConsesLow.list( new SubLObject[]
                { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString( "<uri>" ),
                  makeString( "http://dbpedia.org/resource/England" ), makeString( "</uri>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ), makeString( "\n  " ), makeString( "<result>" ),
                  makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString( "<uri>" ), makeString( "http://dbpedia.org/resource/London" ), makeString( "</uri>" ), makeString( "</binding>" ), makeString(
                      "\n  " ), makeString( "</result>" ), makeString( "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<http://dbpedia.org/resource/England>" ) ), ConsesLow.list( makeString(
                "<http://dbpedia.org/resource/London>" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "obj" ) ), ConsesLow.list( new SubLObject[]
                { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString( "<uri>" ),
                  makeString( "http://dbpedia.org/resource/Acid_rock" ), makeString( "</uri>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ), makeString( "\n  " ), makeString(
                      "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString( "<uri>" ), makeString( "http://dbpedia.org/resource/Blues-rock" ), makeString( "</uri>" ), makeString(
                          "</binding>" ), makeString( "\n  " ), makeString( "</result>" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString(
                              "<uri>" ), makeString( "http://dbpedia.org/resource/Hard_rock" ), makeString( "</uri>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ), makeString( "\n  " ),
                  makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString( "<uri>" ), makeString( "http://dbpedia.org/resource/Psychedelic_rock" ), makeString( "</uri>" ),
                  makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ), makeString( "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<http://dbpedia.org/resource/Acid_rock>" ) ), ConsesLow.list( makeString(
                "<http://dbpedia.org/resource/Blues-rock>" ) ), ConsesLow.list( makeString( "<http://dbpedia.org/resource/Hard_rock>" ) ), ConsesLow.list( makeString(
                    "<http://dbpedia.org/resource/Psychedelic_rock>" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "*" ) ), ConsesLow.list( new SubLObject[]
                    { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"_star_fake\">" ), makeString(
                        "<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">" ), makeString( "1" ), makeString( "</literal>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ),
                      makeString( "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( NIL ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "obj" ) ), ConsesLow.list( new SubLObject[]
            { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"obj\">" ), makeString( "<uri>" ),
              makeString( "http://dbpedia.org/resource/Truman_Capote" ), makeString( "</uri>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ), makeString( "\n " ), makeString(
                  "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<http://dbpedia.org/resource/Truman_Capote>" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString(
                "*" ) ), ConsesLow.list( new SubLObject[]
                { makeString( "<results distinct=\"false\" ordered=\"true\">" ), makeString( "\n  " ), makeString( "<result>" ), makeString( "\n   " ), makeString( "<binding name=\"_star_fake\">" ), makeString(
                    "<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">" ), makeString( "1" ), makeString( "</literal>" ), makeString( "</binding>" ), makeString( "\n  " ), makeString( "</result>" ),
                  makeString( "\n " ), makeString( "</results>" )
        } ), ConsesLow.list( ConsesLow.cons( makeString( "rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons( makeString( "rdfs" ), makeString(
            "http://www.w3.org/2000/01/rdf-schema#" ) ) ) ), ConsesLow.list( ConsesLow.list( NIL ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_sparql_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sparql_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sparql_utilities_file();
  }
  static
  {
    me = new sparql_utilities();
    $sparql_query_vars_cached_caching_state$ = null;
    $str0$_sparql = makeString( "/sparql" );
    $int1$80 = makeInteger( 80 );
    $sym2$SPARQL_QUERY_VARS_CACHED = makeSymbol( "SPARQL-QUERY-VARS-CACHED" );
    $sym3$_SPARQL_QUERY_VARS_CACHED_CACHING_STATE_ = makeSymbol( "*SPARQL-QUERY-VARS-CACHED-CACHING-STATE*" );
    $sym4$STRINGP = makeSymbol( "STRINGP" );
    $sym5$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym6$TCP_PORT_P = makeSymbol( "TCP-PORT-P" );
    $sym7$ALIST_P = makeSymbol( "ALIST-P" );
    $const8$serverOfSKS = constant_handles.reader_make_constant_shell( makeString( "serverOfSKS" ) );
    $const9$portNumberForSKS = constant_handles.reader_make_constant_shell( makeString( "portNumberForSKS" ) );
    $const10$relativePathForAPIAccessToSKS = constant_handles.reader_make_constant_shell( makeString( "relativePathForAPIAccessToSKS" ) );
    $const11$nameSpacePrefixForSKS = constant_handles.reader_make_constant_shell( makeString( "nameSpacePrefixForSKS" ) );
    $const12$subProtocolForSKS = constant_handles.reader_make_constant_shell( makeString( "subProtocolForSKS" ) );
    $sym13$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym14$_EXIT = makeSymbol( "%EXIT" );
    $str15$_ = makeString( "<" );
    $str16$_ = makeString( ">" );
    $str17$DESCRIBE_ = makeString( "DESCRIBE " );
    $str18$_sparql = makeString( "<sparql" );
    $str19$results = makeString( "results" );
    $str20$_result = makeString( "<result" );
    $str21$result = makeString( "result" );
    $str22$_ = makeString( "*" );
    $sym23$NULL = makeSymbol( "NULL" );
    $sym24$SPARQL_EXTRACT_RESULT_SET = makeSymbol( "SPARQL-EXTRACT-RESULT-SET" );
    $kw25$TEST = makeKeyword( "TEST" );
    $kw26$OWNER = makeKeyword( "OWNER" );
    $kw27$CLASSES = makeKeyword( "CLASSES" );
    $kw28$KB = makeKeyword( "KB" );
    $kw29$TINY = makeKeyword( "TINY" );
    $kw30$WORKING_ = makeKeyword( "WORKING?" );
    $list31 = _constant_31_initializer();
    $kw32$DEFAULT = makeKeyword( "DEFAULT" );
    $kw33$PRIVATE = makeKeyword( "PRIVATE" );
    $kw34$MACHINE = makeKeyword( "MACHINE" );
    $kw35$PORT = makeKeyword( "PORT" );
    $kw36$METHOD = makeKeyword( "METHOD" );
    $kw37$GET = makeKeyword( "GET" );
    $kw38$URL = makeKeyword( "URL" );
    $kw39$QUERY = makeKeyword( "QUERY" );
    $str40$query_ = makeString( "query=" );
    $kw41$KEEP_ALIVE_ = makeKeyword( "KEEP-ALIVE?" );
    $kw42$WIDE_NEWLINES_ = makeKeyword( "WIDE-NEWLINES?" );
    $kw43$ACCEPT_TYPES = makeKeyword( "ACCEPT-TYPES" );
    $list44 = ConsesLow.list( makeString( "application/sparql-results+xml" ) );
    $kw45$CONTENT_TYPE = makeKeyword( "CONTENT-TYPE" );
    $kw46$SOAP_ACTION_URI = makeKeyword( "SOAP-ACTION-URI" );
    $str47$_binding = makeString( "<binding" );
    $str48$binding = makeString( "binding" );
    $str49$_literal = makeString( "<literal" );
    $str50$_bnode = makeString( "<bnode" );
    $str51$__ = makeString( "_:" );
    $str52$_uri = makeString( "<uri" );
    $str53$Time_to_support__S = makeString( "Time to support ~S" );
    $list54 = ConsesLow.cons( makeSymbol( "PREFIX" ), makeSymbol( "PREFIX-URI" ) );
    $str55$_ = makeString( ":" );
  }
}
/*
 * 
 * Total time: 199 ms synthetic
 */