package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_csql_sparql_interpretation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation";
  public static final String myFingerPrint = "bea5f58e5ccfb6922e02c8a4e6bafa6f31f716e88debac39b54c5b693b85c8da";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 2492L)
  public static SubLSymbol $sparql_limit_override$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 2632L)
  public static SubLSymbol $sparql_offset_override$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 2763L)
  public static SubLSymbol $sksi_sparql_ist_graph_variable$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 2915L)
  public static SubLSymbol $sksi_sparql_ist_graph_result$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 6490L)
  private static SubLSymbol $sksi_sparql_graph_optimization_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 6982L)
  private static SubLSymbol $sksi_sparql_maximize_literal_conjunctionP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 18153L)
  private static SubLSymbol $sksi_sparql_force_date_comparisons_as_stringsP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 22758L)
  public static SubLSymbol $sparql_expand_identifier_stringsP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 28153L)
  private static SubLSymbol $test_access_path_alist$;
  private static final SubLSymbol $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw3$SELECT;
  private static final SubLString $str4$malformed_csql_expression__a__exp;
  private static final SubLSymbol $sym5$CSETQ;
  private static final SubLString $str6$_A;
  private static final SubLString $str7$BASE_;
  private static final SubLList $list8;
  private static final SubLString $str9$PREFIX__A__;
  private static final SubLSymbol $sym10$STRINGP;
  private static final SubLList $list11;
  private static final SubLString $str12$ASK;
  private static final SubLString $str13$_;
  private static final SubLString $str14$SELECT;
  private static final SubLString $str15$WHERE;
  private static final SubLString $str16$_;
  private static final SubLString $str17$GRAPH__CONTEXT;
  private static final SubLString $str18$___;
  private static final SubLString $str19$_;
  private static final SubLString $str20$LIMIT;
  private static final SubLString $str21$OFFSET;
  private static final SubLString $str22$__;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$VARIABLES;
  private static final SubLString $str25$malformed_csql_expression__a__exp;
  private static final SubLString $str26$__A;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$EL_VARIABLE_P;
  private static final SubLString $str29$subject;
  private static final SubLString $str30$_subj;
  private static final SubLString $str31$predicate;
  private static final SubLString $str32$_pred;
  private static final SubLString $str33$object;
  private static final SubLString $str34$_obj;
  private static final SubLString $str35$Unsupported_SPARQL_field_name__S;
  private static final SubLList $list36;
  private static final SubLSymbol $kw37$WHERE;
  private static final SubLString $str38$malformed_csql_expression__a__exp;
  private static final SubLString $str39$GRAPH__G____;
  private static final SubLSymbol $kw40$FIRST_REST;
  private static final SubLString $str41$___;
  private static final SubLString $str42$__;
  private static final SubLString $str43$__;
  private static final SubLObject $const44$CSQLDifferent;
  private static final SubLSymbol $sym45$CSQL_LITERAL_WHERE_EXPRESSION_P;
  private static final SubLSymbol $kw46$LITERAL;
  private static final SubLList $list47;
  private static final SubLSymbol $kw48$FIELD;
  private static final SubLList $list49;
  private static final SubLSymbol $kw50$UNKNOWN_SENTENCE;
  private static final SubLString $str51$Unexpected_where_clause____S;
  private static final SubLList $list52;
  private static final SubLObject $const53$Sparql_P_TheProgram;
  private static final SubLString $str54$CSQL_operator__A_missing___csqlOp;
  private static final SubLString $str55$__FILTER__;
  private static final SubLObject $const56$CSQLEqualsAny;
  private static final SubLString $str57$_A_;
  private static final SubLString $str58$____;
  private static final SubLString $str59$Set_arguments_only_supported_for_;
  private static final SubLString $str60$_;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLString $str63$OPTIONAL____;
  private static final SubLString $str64$FILTER__;
  private static final SubLString $str65$__bound__A__;
  private static final SubLString $str66$___;
  private static final SubLString $str67$___;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$CSQL_DISJUNCTION_P;
  private static final SubLString $str70$__;
  private static final SubLString $str71$___UNION;
  private static final SubLList $list72;
  private static final SubLString $str73$___;
  private static final SubLString $str74$_;
  private static final SubLObject $const75$CSQLLaterThan;
  private static final SubLSymbol $kw76$DATE;
  private static final SubLObject $const77$CSQLLaterThanOrCooriginatingWith;
  private static final SubLString $str78$STR_;
  private static final SubLString $str79$xsd_dateTime_;
  private static final SubLString $str80$xsd_dateTime__;
  private static final SubLString $str81$__;
  private static final SubLString $str82$xsd_string_;
  private static final SubLString $str83$xsd_float_;
  private static final SubLString $str84$xsd_float__F_;
  private static final SubLString $str85$Unexpected_where_clause_argument_;
  private static final SubLString $str86$Unexpected_equality_clause____S;
  private static final SubLList $list87;
  private static final SubLString $str88$Time_to_support_multiple___A_cons;
  private static final SubLString $str89$Time_to_handle_constraint____S;
  private static final SubLString $str90$_;
  private static final SubLString $str91$_;
  private static final SubLSymbol $sym92$SPARQL_UNESCAPED_IDENTIFIER_CHAR_P;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLSymbol $kw95$LIMIT;
  private static final SubLString $str96$malformed_csql_expression__a__exp;
  private static final SubLList $list97;
  private static final SubLSymbol $kw98$OFFSET;
  private static final SubLString $str99$malformed_csql_expression__a__exp;
  private static final SubLString $str100$__;
  private static final SubLString $str101$_;
  private static final SubLSymbol $sym102$STRING_;
  private static final SubLString $str103$Could_not_find_expanded_prefix_fo;
  private static final SubLString $str104$_F;
  private static final SubLList $list105;
  private static final SubLString $str106$__xsd_boolean;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$TEST_CSQL_TO_SPARQL;
  private static final SubLSymbol $kw109$TEST;
  private static final SubLSymbol $kw110$OWNER;
  private static final SubLSymbol $kw111$CLASSES;
  private static final SubLSymbol $kw112$KB;
  private static final SubLSymbol $kw113$FULL;
  private static final SubLSymbol $kw114$WORKING_;
  private static final SubLList $list115;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 988L)
  public static SubLObject csql_to_sparql(final SubLObject csql, final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sparql = NIL;
    SubLObject message_var = NIL;
    final SubLObject was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
    Eval.eval( $list1 );
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw3$SELECT != csql.first() )
            {
              Errors.error( $str4$malformed_csql_expression__a__exp, csql );
            }
            final SubLObject header_string = sparql_compute_header( access_path );
            final SubLObject select_string = csql_to_sparql_select( csql, access_path );
            if( header_string.isString() && select_string.isString() )
            {
              sparql = Sequences.cconcatenate( header_string, select_string );
            }
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
        message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        Eval.eval( ConsesLow.list( $sym5$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    if( message_var.isString() )
    {
      Errors.warn( $str6$_A, message_var );
    }
    return sparql;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 1648L)
  public static SubLObject sparql_compute_header(final SubLObject access_path)
  {
    SubLObject header_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject base_uri = sksi_access_path.access_path_rdf_base( access_path );
      if( NIL != base_uri )
      {
        print_high.princ( $str7$BASE_, stream );
        sparql_write_uri_tag( base_uri, stream );
        streams_high.terpri( stream );
      }
      SubLObject cdolist_list_var;
      final SubLObject prefix_map = cdolist_list_var = sksi_access_path.access_path_rdf_prefix_map( access_path );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject prefix = NIL;
        SubLObject prefix_uri = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
        prefix = current.first();
        current = ( prefix_uri = current.rest() );
        sparql_write_prefix_uri_pair( prefix, prefix_uri, stream );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      header_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return header_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 2140L)
  public static SubLObject sparql_write_prefix_uri_pair(final SubLObject prefix, final SubLObject prefix_uri, final SubLObject stream)
  {
    PrintLow.format( stream, $str9$PREFIX__A__, prefix );
    sparql_write_uri_tag( prefix_uri, stream );
    streams_high.terpri( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 2328L)
  public static SubLObject sparql_write_uri_tag(final SubLObject uri, final SubLObject stream)
  {
    assert NIL != Types.stringp( uri ) : uri;
    streams_high.write_char( Characters.CHAR_less, stream );
    print_high.princ( uri, stream );
    streams_high.write_char( Characters.CHAR_greater, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 3067L)
  public static SubLObject csql_to_sparql_select(final SubLObject csql, final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject select_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      SubLObject select_keyword = NIL;
      SubLObject fields = NIL;
      SubLObject from = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( csql, csql, $list11 );
      select_keyword = csql.first();
      SubLObject current = csql.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, csql, $list11 );
      fields = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, csql, $list11 );
      from = current.first();
      current = current.rest();
      final SubLObject where = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, csql, $list11 );
      current = current.rest();
      final SubLObject limit = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, csql, $list11 );
      current = current.rest();
      final SubLObject offset = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, csql, $list11 );
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw3$SELECT != select_keyword )
        {
          Errors.error( $str4$malformed_csql_expression__a__exp, csql );
        }
        if( NIL != csql_boolean_select_fields_p( fields ) )
        {
          print_high.princ( $str12$ASK, stream );
          print_high.princ( $str13$_, stream );
        }
        else
        {
          final SubLObject fields_string = csql_to_sparql_fields( fields );
          print_high.princ( $str14$SELECT, stream );
          print_high.princ( fields_string, stream );
          streams_high.terpri( stream );
          print_high.princ( $str15$WHERE, stream );
          print_high.princ( $str13$_, stream );
        }
        final SubLObject where_string = csql_to_sparql_where( where, access_path );
        print_high.princ( $str16$_, stream );
        streams_high.terpri( stream );
        if( NIL != $sksi_sparql_ist_graph_variable$.getDynamicValue( thread ) )
        {
          print_high.princ( $str17$GRAPH__CONTEXT, stream );
          print_high.princ( $str18$___, stream );
          streams_high.terpri( stream );
        }
        print_high.princ( where_string, stream );
        if( NIL != $sksi_sparql_ist_graph_variable$.getDynamicValue( thread ) )
        {
          print_high.princ( $str19$_, stream );
        }
        print_high.princ( $str19$_, stream );
        SubLObject limit_string = csql_to_sparql_limit( limit, access_path );
        if( NIL != $sparql_limit_override$.getDynamicValue( thread ) )
        {
          limit_string = print_high.princ_to_string( $sparql_limit_override$.getDynamicValue( thread ) );
        }
        if( NIL != limit_string )
        {
          streams_high.terpri( stream );
          print_high.princ( $str20$LIMIT, stream );
          print_high.princ( $str13$_, stream );
          print_high.princ( limit_string, stream );
        }
        SubLObject offset_string = csql_to_sparql_offset( offset, access_path );
        if( NIL != $sparql_offset_override$.getDynamicValue( thread ) )
        {
          offset_string = print_high.princ_to_string( $sparql_offset_override$.getDynamicValue( thread ) );
        }
        if( NIL != offset_string )
        {
          streams_high.terpri( stream );
          print_high.princ( $str21$OFFSET, stream );
          print_high.princ( $str13$_, stream );
          print_high.princ( offset_string, stream );
        }
        streams_high.terpri( stream );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( csql, $list11 );
      }
      select_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return select_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 4845L)
  public static SubLObject csql_to_sparql_fields(final SubLObject fields)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject fields_string = NIL;
    if( NIL != csql_boolean_select_fields_p( fields ) )
    {
      fields_string = $str22$__;
    }
    else if( NIL != csql_variables_fields_p( fields ) )
    {
      SubLObject variables_keyword = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( fields, fields, $list23 );
      variables_keyword = fields.first();
      final SubLObject v_variables;
      final SubLObject current = v_variables = fields.rest();
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw24$VARIABLES != variables_keyword )
      {
        Errors.error( $str25$malformed_csql_expression__a__exp, fields );
      }
      if( NIL == v_variables )
      {
        fields_string = $str22$__;
      }
      else
      {
        SubLObject stream = NIL;
        try
        {
          stream = streams_high.make_private_string_output_stream();
          SubLObject cdolist_list_var = v_variables;
          SubLObject variable = NIL;
          variable = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            PrintLow.format( stream, $str26$__A, variable );
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
          }
          fields_string = streams_high.get_output_stream_string( stream );
        }
        finally
        {
          final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            streams_high.close( stream, UNPROVIDED );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    else
    {
      SubLObject stream2 = NIL;
      try
      {
        stream2 = streams_high.make_private_string_output_stream();
        SubLObject cdolist_list_var2 = fields;
        SubLObject field = NIL;
        field = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          final SubLObject variable_name = sparql_field_variable_name( field );
          PrintLow.format( stream2, $str26$__A, variable_name );
          cdolist_list_var2 = cdolist_list_var2.rest();
          field = cdolist_list_var2.first();
        }
        fields_string = streams_high.get_output_stream_string( stream2 );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          streams_high.close( stream2, UNPROVIDED );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return fields_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 5696L)
  public static SubLObject csql_boolean_select_fields_p(final SubLObject fields)
  {
    return makeBoolean( NIL == fields || fields.equal( $list27 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 5840L)
  public static SubLObject csql_variables_fields_p(final SubLObject fields)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( fields ) && $kw24$VARIABLES == fields.first() && NIL != list_utilities.every_in_list( $sym28$EL_VARIABLE_P, fields.rest(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 6042L)
  public static SubLObject sparql_field_variable_name(final SubLObject field)
  {
    final SubLObject field_name = conses_high.second( field );
    return sparql_field_name_to_variable_name( field_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 6194L)
  public static SubLObject sparql_field_name_to_variable_name(final SubLObject field_name)
  {
    if( field_name.equal( $str29$subject ) )
    {
      return $str30$_subj;
    }
    if( field_name.equal( $str31$predicate ) )
    {
      return $str32$_pred;
    }
    if( field_name.equal( $str33$object ) )
    {
      return $str34$_obj;
    }
    return Errors.error( $str35$Unsupported_SPARQL_field_name__S, field_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 7248L)
  public static SubLObject csql_to_sparql_where(final SubLObject where, final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject where_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      SubLObject where_keyword = NIL;
      SubLObject where_expressions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( where, where, $list36 );
      where_keyword = where.first();
      SubLObject current = where.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, where, $list36 );
      where_expressions = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw37$WHERE != where_keyword )
        {
          Errors.error( $str38$malformed_csql_expression__a__exp, where );
        }
        where_expressions = csql_normalize_where_expressions_for_sparql( where_expressions );
        if( NIL != $sksi_sparql_maximize_literal_conjunctionP$.getDynamicValue( thread ) )
        {
          where_expressions = sparql_maximize_literal_conjunction( where_expressions );
        }
        if( NIL != csql_literal_where_espressions_p( where_expressions ) )
        {
          if( NIL != $sksi_sparql_graph_optimization_enabledP$.getDynamicValue( thread ) )
          {
            PrintLow.format( stream, $str39$GRAPH__G____ );
          }
          final SubLObject where_expression = where_expressions.first();
          final SubLObject where_expression_string = sparql_literal_where_expression_string( where_expression, access_path );
          print_high.princ( where_expression_string, stream );
          if( $sksi_sparql_graph_optimization_enabledP$.getDynamicValue( thread ) == $kw40$FIRST_REST )
          {
            PrintLow.format( stream, $str41$___ );
          }
          if( $sksi_sparql_graph_optimization_enabledP$.getDynamicValue( thread ) == $kw40$FIRST_REST )
          {
            PrintLow.format( stream, $str39$GRAPH__G____ );
          }
          SubLObject cdolist_list_var = where_expressions.rest();
          SubLObject where_expression2 = NIL;
          where_expression2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject where_expression_string2 = sparql_literal_where_expression_string( where_expression2, access_path );
            print_high.princ( where_expression_string2, stream );
            cdolist_list_var = cdolist_list_var.rest();
            where_expression2 = cdolist_list_var.first();
          }
          if( NIL != $sksi_sparql_graph_optimization_enabledP$.getDynamicValue( thread ) )
          {
            PrintLow.format( stream, $str41$___ );
          }
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject subject_constraints = sparql_categorize_where_expressions( where_expressions );
          final SubLObject predicate_constraints = thread.secondMultipleValue();
          final SubLObject object_constraints = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          print_high.princ( $str42$__, stream );
          sparql_write_constraints( $str29$subject, subject_constraints, access_path, stream );
          sparql_write_constraints( $str31$predicate, predicate_constraints, access_path, stream );
          sparql_write_constraints( $str33$object, object_constraints, access_path, stream );
          print_high.princ( $str43$__, stream );
          streams_high.terpri( stream );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( where, $list36 );
      }
      where_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return where_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 9185L)
  public static SubLObject csql_normalize_where_expressions_for_sparql(final SubLObject where_expressions)
  {
    final SubLObject csql_different_equality_map = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), Sequences.length( where_expressions ) );
    SubLObject new_where_expressions = NIL;
    SubLObject cdolist_list_var = where_expressions;
    SubLObject where_expression = NIL;
    where_expression = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( where_expression.first().eql( $const44$CSQLDifferent ) )
      {
        final SubLObject arg1 = conses_high.second( where_expression );
        final SubLObject arg2 = conses_high.third( where_expression );
        if( !arg1.equal( dictionary.dictionary_lookup( csql_different_equality_map, arg2, UNPROVIDED ) ) )
        {
          new_where_expressions = ConsesLow.cons( where_expression, new_where_expressions );
          dictionary.dictionary_enter( csql_different_equality_map, arg1, arg2 );
        }
      }
      else
      {
        new_where_expressions = ConsesLow.cons( where_expression, new_where_expressions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      where_expression = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_where_expressions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 9869L)
  public static SubLObject sparql_maximize_literal_conjunction(final SubLObject where_expressions)
  {
    return list_utilities.stable_sort_via_test( conses_high.copy_list( where_expressions ), $sym45$CSQL_LITERAL_WHERE_EXPRESSION_P, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 10039L)
  public static SubLObject csql_literal_where_espressions_p(final SubLObject where_expressions)
  {
    return list_utilities.simple_tree_findP( $kw46$LITERAL, where_expressions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 10165L)
  public static SubLObject csql_sparql_supported_where_expression_p(final SubLObject where_expression)
  {
    return makeBoolean( NIL != csql_literal_where_expression_p( where_expression ) || NIL != csql_sparql_filter_where_expression_p( where_expression ) || NIL != csql_sparql_unknown_sentence_where_expression_p(
        where_expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 10442L)
  public static SubLObject csql_literal_where_expression_p(final SubLObject where_expression)
  {
    if( NIL != list_utilities.proper_list_p( where_expression ) && NIL != list_utilities.lengthE( where_expression, TWO_INTEGER, UNPROVIDED ) )
    {
      SubLObject literal_keyword = NIL;
      SubLObject literal = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( where_expression, where_expression, $list47 );
      literal_keyword = where_expression.first();
      SubLObject current = where_expression.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, where_expression, $list47 );
      literal = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( literal_keyword == $kw46$LITERAL && NIL != list_utilities.proper_list_p( literal ) && NIL != list_utilities.lengthE( literal, THREE_INTEGER, UNPROVIDED )
            && NIL != csql_literal_where_expression_resolved_field_p( literal.first() ) && NIL != csql_literal_where_expression_resolved_field_p( conses_high.second( literal ) )
            && NIL != csql_literal_where_expression_resolved_field_p( conses_high.third( literal ) ) )
        {
          return T;
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( where_expression, $list47 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 10992L)
  public static SubLObject csql_literal_where_expression_resolved_field_p(final SubLObject literal_expression_field)
  {
    return makeBoolean( !literal_expression_field.isList() || $kw48$FIELD != literal_expression_field.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 11441L)
  public static SubLObject csql_sparql_unknown_sentence_where_expression_p(final SubLObject where_expression)
  {
    SubLObject expression_keyword = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( where_expression, where_expression, $list49 );
    expression_keyword = where_expression.first();
    final SubLObject rest;
    final SubLObject current = rest = where_expression.rest();
    if( expression_keyword == $kw50$UNKNOWN_SENTENCE )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 11685L)
  public static SubLObject csql_sparql_filter_where_expression_p(final SubLObject where_expression)
  {
    SubLObject expression_keyword = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( where_expression, where_expression, $list49 );
    expression_keyword = where_expression.first();
    final SubLObject rest;
    final SubLObject current = rest = where_expression.rest();
    if( NIL != forts.fort_p( expression_keyword ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 11931L)
  public static SubLObject sparql_literal_where_expression_string(final SubLObject where_expression, final SubLObject access_path)
  {
    SubLObject where_expression_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      if( NIL != csql_sparql_filter_where_expression_p( where_expression ) )
      {
        output_sparql_literal_where_expression_from_csql_filter_where_expression( where_expression, stream, access_path );
      }
      else if( NIL != csql_sparql_unknown_sentence_where_expression_p( where_expression ) )
      {
        output_sparql_literal_where_expression_from_csql_unknown_sentence_where_expression( where_expression, stream, access_path );
      }
      else if( NIL != csql_literal_where_expression_p( where_expression ) )
      {
        output_sparql_literal_where_expression_from_csql_literal_where_expression( where_expression, stream, access_path );
      }
      else
      {
        Errors.error( $str51$Unexpected_where_clause____S, where_expression );
      }
      where_expression_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return where_expression_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 12797L)
  public static SubLObject output_sparql_literal_where_expression_from_csql_filter_where_expression(final SubLObject where_expression, final SubLObject stream, final SubLObject access_path)
  {
    SubLObject csql_operator = NIL;
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( where_expression, where_expression, $list52 );
    csql_operator = where_expression.first();
    SubLObject current = where_expression.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, where_expression, $list52 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, where_expression, $list52 );
    arg2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject operator_string = sksi_kb_accessors.csql_operator_to_sql_operator( csql_operator, $const53$Sparql_P_TheProgram );
      if( !operator_string.isString() )
      {
        Errors.error( $str54$CSQL_operator__A_missing___csqlOp, csql_operator );
      }
      else
      {
        PrintLow.format( stream, $str55$__FILTER__ );
        if( csql_operator.eql( $const56$CSQLEqualsAny ) )
        {
          final SubLObject arg2_set_items = el_utilities.el_set_items( arg2 );
          final SubLObject arg2_set_size = Sequences.length( arg2_set_items );
          final SubLObject datatype = sparql_literal_where_expression_datatype( csql_operator, arg2_set_items );
          SubLObject list_var = NIL;
          SubLObject arg2_elem = NIL;
          SubLObject item_index = NIL;
          list_var = arg2_set_items;
          arg2_elem = list_var.first();
          for( item_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg2_elem = list_var.first(), item_index = Numbers.add( ONE_INTEGER, item_index ) )
          {
            PrintLow.format( stream, $str57$_A_, sparql_literal_where_expression_arg_string( arg1, access_path, datatype ) );
            print_high.princ( operator_string, stream );
            PrintLow.format( stream, $str26$__A, sparql_literal_where_expression_arg_string( arg2_elem, access_path, datatype ) );
            if( item_index.numL( Numbers.subtract( arg2_set_size, ONE_INTEGER ) ) )
            {
              PrintLow.format( stream, $str58$____ );
            }
          }
        }
        else if( NIL != el_utilities.el_set_p( arg2 ) )
        {
          Errors.error( $str59$Set_arguments_only_supported_for_ );
        }
        else
        {
          final SubLObject datatype2 = sparql_literal_where_expression_datatype( csql_operator, ConsesLow.list( arg1, arg2 ) );
          PrintLow.format( stream, $str57$_A_, sparql_literal_where_expression_arg_string( arg1, access_path, datatype2 ) );
          print_high.princ( operator_string, stream );
          PrintLow.format( stream, $str26$__A, sparql_literal_where_expression_arg_string( arg2, access_path, datatype2 ) );
        }
        PrintLow.format( stream, $str60$_ );
        streams_high.terpri( stream );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( where_expression, $list52 );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 14426L)
  public static SubLObject output_sparql_literal_where_expression_from_csql_unknown_sentence_where_expression(final SubLObject where_expression, final SubLObject stream, final SubLObject access_path)
  {
    SubLObject unknown_sentence_keyword = NIL;
    SubLObject existential_vars_list = NIL;
    SubLObject sub_where = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( where_expression, where_expression, $list61 );
    unknown_sentence_keyword = where_expression.first();
    SubLObject current = where_expression.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, where_expression, $list61 );
    existential_vars_list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, where_expression, $list61 );
    sub_where = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$2;
      final SubLObject datum_$1 = current_$2 = existential_vars_list;
      SubLObject existential_vars_keyword = NIL;
      SubLObject existential_vars = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list62 );
      existential_vars_keyword = current_$2.first();
      current_$2 = ( existential_vars = current_$2.rest() );
      existential_vars = list_utilities.fast_delete_duplicates( existential_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject sub_where_string = csql_to_sparql_where( sub_where, access_path );
      PrintLow.format( stream, $str63$OPTIONAL____ );
      print_high.princ( sub_where_string, stream );
      PrintLow.format( stream, $str41$___ );
      PrintLow.format( stream, $str64$FILTER__ );
      final SubLObject existential_vars_count = Sequences.length( existential_vars );
      SubLObject list_var = NIL;
      SubLObject existential_var = NIL;
      SubLObject num_var = NIL;
      list_var = existential_vars;
      existential_var = list_var.first();
      for( num_var = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), existential_var = list_var.first(), num_var = Numbers.add( ONE_INTEGER, num_var ) )
      {
        PrintLow.format( stream, $str65$__bound__A__, existential_var );
        if( num_var.numL( Numbers.subtract( existential_vars_count, ONE_INTEGER ) ) )
        {
          print_high.princ( $str66$___, stream );
        }
      }
      PrintLow.format( stream, $str67$___ );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( where_expression, $list61 );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 15479L)
  public static SubLObject output_sparql_literal_where_expression_from_csql_literal_where_expression(final SubLObject where_expression, final SubLObject stream, final SubLObject access_path)
  {
    SubLObject literal_keyword = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( where_expression, where_expression, $list68 );
    literal_keyword = where_expression.first();
    SubLObject current = where_expression.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, where_expression, $list68 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject predicate = NIL;
    SubLObject subject = NIL;
    SubLObject v_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, where_expression, $list68 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, where_expression, $list68 );
    subject = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, where_expression, $list68 );
    v_object = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      if( NIL == current )
      {
        output_sparql_literal_where_expression_from_spo( subject, predicate, v_object, stream, access_path, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( where_expression, $list68 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( where_expression, $list68 );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 15837L)
  public static SubLObject output_sparql_literal_where_expression_from_spo(final SubLObject subject, final SubLObject predicate, final SubLObject v_object, final SubLObject stream, final SubLObject access_path,
      SubLObject nestedP)
  {
    if( nestedP == UNPROVIDED )
    {
      nestedP = NIL;
    }
    if( NIL != list_utilities.tree_find_if( $sym69$CSQL_DISJUNCTION_P, subject, UNPROVIDED ) || NIL != list_utilities.tree_find_if( $sym69$CSQL_DISJUNCTION_P, predicate, UNPROVIDED ) || NIL != list_utilities
        .tree_find_if( $sym69$CSQL_DISJUNCTION_P, v_object, UNPROVIDED ) )
    {
      final SubLObject subjects = unpack_csql_disjunctions( subject );
      final SubLObject predicates = unpack_csql_disjunctions( predicate );
      final SubLObject objects = unpack_csql_disjunctions( v_object );
      final SubLObject combos = list_utilities.cartesian_product( ConsesLow.list( subjects, predicates, objects ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      print_high.princ( $str70$__, stream );
      SubLObject list_var = NIL;
      SubLObject combo = NIL;
      SubLObject n = NIL;
      list_var = combos;
      combo = list_var.first();
      for( n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), combo = list_var.first(), n = Numbers.add( ONE_INTEGER, n ) )
      {
        if( n.numG( ZERO_INTEGER ) )
        {
          streams_high.terpri( stream );
          print_high.princ( $str71$___UNION, stream );
        }
        print_high.princ( $str70$__, stream );
        SubLObject current;
        final SubLObject datum = current = combo;
        SubLObject one_subject = NIL;
        SubLObject one_predicate = NIL;
        SubLObject one_object = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
        one_subject = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
        one_predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
        one_object = current.first();
        current = current.rest();
        if( NIL == current )
        {
          output_sparql_literal_where_expression_from_spo( one_subject, one_predicate, one_object, stream, access_path, T );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list72 );
        }
        print_high.princ( $str73$___, stream );
      }
      print_high.princ( $str73$___, stream );
    }
    else
    {
      print_high.princ( $str42$__, stream );
      sparql_write_constraint( subject, access_path, stream );
      sparql_write_constraint( predicate, access_path, stream );
      sparql_write_constraint( v_object, access_path, stream );
      if( NIL == nestedP )
      {
        print_high.princ( $str74$_, stream );
      }
    }
    if( NIL == nestedP )
    {
      streams_high.terpri( stream );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 17050L)
  public static SubLObject unpack_csql_disjunctions(final SubLObject v_term)
  {
    return ( NIL != sksi_csql_utilities.csql_disjunction_p( v_term ) ) ? sksi_csql_utilities.csql_disjunction_disjuncts( v_term ) : ConsesLow.list( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 17196L)
  public static SubLObject sparql_literal_where_expression_datatype(final SubLObject csql_operator, final SubLObject where_expression_args)
  {
    if( csql_operator.eql( $const75$CSQLLaterThan ) )
    {
      return $kw76$DATE;
    }
    if( csql_operator.eql( $const77$CSQLLaterThanOrCooriginatingWith ) )
    {
      return $kw76$DATE;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 18228L)
  public static SubLObject sparql_literal_where_expression_arg_string(final SubLObject where_expression_arg, final SubLObject access_path, SubLObject datatype)
  {
    if( datatype == UNPROVIDED )
    {
      datatype = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( datatype == $kw76$DATE )
    {
      if( NIL != cycl_grammar.el_variable_p( where_expression_arg ) )
      {
        if( NIL != $sksi_sparql_force_date_comparisons_as_stringsP$.getDynamicValue( thread ) )
        {
          result = Sequences.cconcatenate( $str78$STR_, new SubLObject[] { format_nil.format_nil_a_no_copy( where_expression_arg ), $str60$_
          } );
        }
        else
        {
          result = Sequences.cconcatenate( $str79$xsd_dateTime_, new SubLObject[] { format_nil.format_nil_a_no_copy( where_expression_arg ), $str60$_
          } );
        }
      }
      else
      {
        final SubLObject stripped_date_string = string_utilities.get_substring_between_tags( where_expression_arg, $str80$xsd_dateTime__, $str81$__, UNPROVIDED, UNPROVIDED );
        if( NIL != $sksi_sparql_force_date_comparisons_as_stringsP$.getDynamicValue( thread ) && NIL != stripped_date_string )
        {
          result = format_nil.format_nil_s( stripped_date_string );
        }
        else
        {
          result = format_nil.format_nil_a( where_expression_arg );
        }
      }
    }
    else if( NIL != sparql_identifier_p( where_expression_arg ) )
    {
      result = sparql_possibly_expand_identifier_string( where_expression_arg, access_path );
    }
    else if( where_expression_arg.isString() && NIL != possible_rdf_literal_string_p( where_expression_arg ) )
    {
      result = format_nil.format_nil_a( where_expression_arg );
    }
    else if( where_expression_arg.isString() )
    {
      result = Sequences.cconcatenate( $str82$xsd_string_, new SubLObject[] { format_nil.format_nil_s_no_copy( where_expression_arg ), $str60$_
      } );
    }
    else if( where_expression_arg.isInteger() )
    {
      result = Sequences.cconcatenate( $str83$xsd_float_, new SubLObject[] { format_nil.format_nil_d_no_copy( where_expression_arg ), $str60$_
      } );
    }
    else if( where_expression_arg.isNumber() )
    {
      result = PrintLow.format( NIL, $str84$xsd_float__F_, where_expression_arg );
    }
    else if( NIL != cycl_grammar.el_variable_p( where_expression_arg ) )
    {
      result = format_nil.format_nil_a( where_expression_arg );
    }
    else
    {
      Errors.error( $str85$Unexpected_where_clause_argument_, where_expression_arg );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 19945L)
  public static SubLObject possible_rdf_literal_string_p(final SubLObject string)
  {
    if( string.isString() )
    {
      final SubLObject colon_pos = Sequences.position( Characters.CHAR_colon, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return makeBoolean( colon_pos.isInteger() && colon_pos.numG( ZERO_INTEGER ) && colon_pos.numL( Numbers.subtract( Sequences.length( string ), ONE_INTEGER ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 20186L)
  public static SubLObject sparql_categorize_where_expressions(final SubLObject where_expressions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject subject_constraints = NIL;
    SubLObject predicate_constraints = NIL;
    SubLObject object_constraints = NIL;
    SubLObject cdolist_list_var = where_expressions;
    SubLObject where_expression = NIL;
    where_expression = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != sksi_csql_utilities.csql_equal_clause_p( where_expression ) )
      {
        thread.resetMultipleValues();
        final SubLObject field_name = sparql_categorize_equality_clause( where_expression );
        final SubLObject constraint = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( field_name.equal( $str29$subject ) )
        {
          subject_constraints = ConsesLow.cons( constraint, subject_constraints );
        }
        else if( field_name.equal( $str31$predicate ) )
        {
          predicate_constraints = ConsesLow.cons( constraint, predicate_constraints );
        }
        else if( field_name.equal( $str33$object ) )
        {
          object_constraints = ConsesLow.cons( constraint, object_constraints );
        }
        else
        {
          Errors.error( $str86$Unexpected_equality_clause____S, where_expression );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      where_expression = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( subject_constraints ), Sequences.nreverse( predicate_constraints ), Sequences.nreverse( object_constraints ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 21007L)
  public static SubLObject sparql_categorize_equality_clause(final SubLObject equality_clause)
  {
    SubLObject equality = NIL;
    SubLObject expression1 = NIL;
    SubLObject expression2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( equality_clause, equality_clause, $list87 );
    equality = equality_clause.first();
    SubLObject current = equality_clause.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, equality_clause, $list87 );
    expression1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, equality_clause, $list87 );
    expression2 = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( equality_clause, $list87 );
      return NIL;
    }
    if( NIL != sksi_csql_utilities.csql_field_p( expression1 ) && NIL == sksi_csql_utilities.csql_field_p( expression2 ) )
    {
      final SubLObject field_name = sksi_csql_utilities.csql_field_name( expression1 );
      return Values.values( field_name, expression2 );
    }
    return Errors.error( $str86$Unexpected_equality_clause____S, equality_clause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 21455L)
  public static SubLObject sparql_write_constraints(final SubLObject field_name, final SubLObject constraints, final SubLObject access_path, final SubLObject stream)
  {
    if( NIL == constraints )
    {
      print_high.princ( sparql_field_name_to_variable_name( field_name ), stream );
      streams_high.write_string( $str13$_, stream, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != list_utilities.singletonP( constraints ) )
    {
      final SubLObject constraint = constraints.first();
      sparql_write_constraint( constraint, access_path, stream );
    }
    else
    {
      Errors.error( $str88$Time_to_support_multiple___A_cons, field_name, constraints );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 21913L)
  public static SubLObject sparql_write_constraint(final SubLObject constraint, final SubLObject access_path, final SubLObject stream)
  {
    SubLObject constraint_string = NIL;
    if( NIL != sksi_csql_utilities.csql_field_p( constraint ) )
    {
      final SubLObject field_name = sksi_csql_utilities.csql_field_name( constraint );
      final SubLObject variable_name = constraint_string = sparql_field_name_to_variable_name( field_name );
    }
    else if( NIL != sparql_identifier_p( constraint ) )
    {
      constraint_string = sparql_possibly_expand_identifier_string( constraint, access_path );
    }
    else if( NIL != sparql_literal_p( constraint ) )
    {
      constraint_string = sparql_literal_string( constraint );
    }
    else
    {
      if( NIL == sparql_variable_p( constraint ) )
      {
        return Errors.error( $str89$Time_to_handle_constraint____S, constraint );
      }
      constraint_string = sparql_variable_string( constraint );
    }
    PrintLow.format( stream, $str57$_A_, constraint_string );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 22968L)
  public static SubLObject sparql_possibly_expand_identifier_string(SubLObject string, final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == sparql_identifier_p( string ) )
    {
      return string;
    }
    if( NIL != sparql_bnode_identifier_p( string ) )
    {
      final SubLObject subprotocol = sksi_access_path.access_path_subprotocol( access_path );
      if( NIL != sksi_sks_interaction.sparql_oracle_subprotocolP( subprotocol ) )
      {
        string = Sequences.cconcatenate( $str90$_, new SubLObject[] { format_nil.format_nil_a_no_copy( string ), $str91$_
        } );
      }
      return string;
    }
    if( NIL != sparql_unescaped_identifier_string_p( string ) )
    {
      return sparql_identifier_string( string );
    }
    if( NIL != $sparql_expand_identifier_stringsP$.getDynamicValue( thread ) )
    {
      return sparql_expanded_identifier_string( string, access_path );
    }
    return sparql_identifier_string( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 23638L)
  public static SubLObject sparql_unescaped_identifier_string_p(final SubLObject string)
  {
    return makeBoolean( string.isString() && NIL == list_utilities.find_if_not( Symbols.symbol_function( $sym92$SPARQL_UNESCAPED_IDENTIFIER_CHAR_P ), string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 23805L)
  public static SubLObject sparql_unescaped_identifier_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.alphanumericp( v_char ) || NIL != list_utilities.member_eqP( v_char, $list93 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 23972L)
  public static SubLObject csql_to_sparql_limit(final SubLObject limit, final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != limit )
    {
      SubLObject limit_keyword = NIL;
      SubLObject limit_number = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( limit, limit, $list94 );
      limit_keyword = limit.first();
      SubLObject current = limit.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, limit, $list94 );
      limit_number = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw95$LIMIT != limit_keyword )
        {
          Errors.error( $str96$malformed_csql_expression__a__exp, limit );
        }
        return print_high.princ_to_string( limit_number );
      }
      cdestructuring_bind.cdestructuring_bind_error( limit, $list94 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 24279L)
  public static SubLObject csql_to_sparql_offset(final SubLObject offset, final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != offset )
    {
      SubLObject offset_keyword = NIL;
      SubLObject offset_number = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( offset, offset, $list97 );
      offset_keyword = offset.first();
      SubLObject current = offset.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, offset, $list97 );
      offset_number = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw98$OFFSET != offset_keyword )
        {
          Errors.error( $str99$malformed_csql_expression__a__exp, offset );
        }
        return print_high.princ_to_string( offset_number );
      }
      cdestructuring_bind.cdestructuring_bind_error( offset, $list97 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 24598L)
  public static SubLObject sparql_identifier_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sparql_bnode_identifier_p( v_object ) || NIL != sparql_abbreviated_uri_p( v_object ) || NIL != sparql_expanded_uri_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 24779L)
  public static SubLObject sparql_bnode_identifier_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL != string_utilities.starts_with( v_object, $str100$__ ) && NIL != sparql_valid_uri_identifier_string_p( v_object, TWO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 25033L)
  public static SubLObject sparql_abbreviated_uri_p(final SubLObject v_object)
  {
    if( v_object.isString() )
    {
      final SubLObject prefix_end = Sequences.position( Characters.CHAR_colon, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return makeBoolean( prefix_end.isInteger() && NIL != sparql_valid_uri_prefix_string_p( v_object, ZERO_INTEGER, prefix_end ) && NIL == string_utilities.starts_with( v_object, $str100$__ )
          && NIL != sparql_valid_uri_identifier_string_p( v_object, number_utilities.f_1X( prefix_end ), UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 25483L)
  public static SubLObject sparql_expanded_uri_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL != string_utilities.starts_with( v_object, $str90$_ ) && NIL != string_utilities.ends_with( v_object, $str91$_, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 25626L)
  public static SubLObject sparql_identifier_string(final SubLObject identifier)
  {
    assert NIL != Types.stringp( identifier ) : identifier;
    return identifier;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 25735L)
  public static SubLObject sparql_expanded_identifier_string(final SubLObject identifier, final SubLObject access_path)
  {
    assert NIL != Types.stringp( identifier ) : identifier;
    if( NIL != sparql_abbreviated_uri_p( identifier ) )
    {
      final SubLObject prefix_map = sksi_access_path.access_path_rdf_prefix_map( access_path );
      final SubLObject prefix_end_pos = Sequences.search( $str101$_, identifier, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != subl_promotions.positive_integer_p( prefix_end_pos ) )
      {
        final SubLObject prefix = string_utilities.substring( identifier, ZERO_INTEGER, prefix_end_pos );
        final SubLObject suffix = string_utilities.substring( identifier, Numbers.add( ONE_INTEGER, prefix_end_pos ), UNPROVIDED );
        final SubLObject expanded_prefix = list_utilities.alist_lookup( prefix_map, prefix, $sym102$STRING_, UNPROVIDED );
        if( !expanded_prefix.isString() )
        {
          Errors.warn( $str103$Could_not_find_expanded_prefix_fo, prefix, prefix_map );
          return identifier;
        }
        return Sequences.cconcatenate( $str90$_, new SubLObject[] { expanded_prefix, suffix, $str91$_
        } );
      }
    }
    return identifier;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 26532L)
  public static SubLObject sparql_valid_uri_prefix_string_p(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = Sequences.length( string );
    }
    if( start.numE( end ) )
    {
      return T;
    }
    if( ONE_INTEGER.numE( Numbers.subtract( end, start ) ) )
    {
      final SubLObject v_char = Strings.sublisp_char( string, start );
      return makeBoolean( NIL != Characters.charNE( Characters.CHAR_underbar, v_char ) && NIL != sparql_valid_uri_identifier_char_p( v_char ) );
    }
    return sparql_valid_uri_identifier_string_p( string, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 26891L)
  public static SubLObject sparql_valid_uri_identifier_string_p(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = Sequences.length( string );
    }
    if( string.isString() && end.numG( start ) )
    {
      SubLObject end_var_$3;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var = ( end_var_$3 = ( ( NIL != end ) ? end : Sequences.length( string ) ) ), char_num = NIL, char_num = start; !char_num.numGE( end_var_$3 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string, char_num );
        if( NIL == sparql_valid_uri_identifier_char_p( v_char ) )
        {
          return NIL;
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 27186L)
  public static SubLObject sparql_valid_uri_identifier_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.alphanumericp( v_char ) || NIL != Characters.charE( v_char, Characters.CHAR_hyphen ) || NIL != Characters.charE( v_char, Characters.CHAR_underbar ) || NIL != Characters.charE(
        v_char, Characters.CHAR_comma ) || NIL != Characters.charE( v_char, Characters.CHAR_percent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 27369L)
  public static SubLObject sparql_literal_p(final SubLObject constraint)
  {
    return makeBoolean( constraint.isNumber() || ( constraint.isString() && NIL == sparql_identifier_p( constraint ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 27529L)
  public static SubLObject sparql_literal_string(final SubLObject constraint)
  {
    if( constraint.isInteger() )
    {
      return format_nil.format_nil_d( constraint );
    }
    if( constraint.isDouble() )
    {
      return PrintLow.format( NIL, $str104$_F, constraint );
    }
    if( NIL != list_utilities.member_equalP( constraint, $list105 ) )
    {
      return Sequences.cconcatenate( format_nil.format_nil_s_no_copy( constraint ), $str106$__xsd_boolean );
    }
    return print_high.prin1_to_string( constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 27982L)
  public static SubLObject sparql_variable_p(final SubLObject constraint)
  {
    return cycl_grammar.el_variable_p( constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 28066L)
  public static SubLObject sparql_variable_string(final SubLObject constraint)
  {
    return Symbols.symbol_name( constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-sparql-interpretation.lisp", position = 28793L)
  public static SubLObject test_csql_to_sparql(final SubLObject csql, SubLObject access_path_alist)
  {
    if( access_path_alist == UNPROVIDED )
    {
      access_path_alist = $test_access_path_alist$.getDynamicValue();
    }
    final SubLObject access_path = dictionary_utilities.new_dictionary_from_alist( access_path_alist, UNPROVIDED );
    return csql_to_sparql( csql, access_path );
  }

  public static SubLObject declare_sksi_csql_sparql_interpretation_file()
  {
    SubLFiles.declareFunction( me, "csql_to_sparql", "CSQL-TO-SPARQL", 2, 0, false );
    SubLFiles.declareFunction( me, "sparql_compute_header", "SPARQL-COMPUTE-HEADER", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_write_prefix_uri_pair", "SPARQL-WRITE-PREFIX-URI-PAIR", 3, 0, false );
    SubLFiles.declareFunction( me, "sparql_write_uri_tag", "SPARQL-WRITE-URI-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_to_sparql_select", "CSQL-TO-SPARQL-SELECT", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_to_sparql_fields", "CSQL-TO-SPARQL-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_boolean_select_fields_p", "CSQL-BOOLEAN-SELECT-FIELDS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_variables_fields_p", "CSQL-VARIABLES-FIELDS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_field_variable_name", "SPARQL-FIELD-VARIABLE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_field_name_to_variable_name", "SPARQL-FIELD-NAME-TO-VARIABLE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_to_sparql_where", "CSQL-TO-SPARQL-WHERE", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_normalize_where_expressions_for_sparql", "CSQL-NORMALIZE-WHERE-EXPRESSIONS-FOR-SPARQL", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_maximize_literal_conjunction", "SPARQL-MAXIMIZE-LITERAL-CONJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_literal_where_espressions_p", "CSQL-LITERAL-WHERE-ESPRESSIONS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_sparql_supported_where_expression_p", "CSQL-SPARQL-SUPPORTED-WHERE-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_literal_where_expression_p", "CSQL-LITERAL-WHERE-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_literal_where_expression_resolved_field_p", "CSQL-LITERAL-WHERE-EXPRESSION-RESOLVED-FIELD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_sparql_unknown_sentence_where_expression_p", "CSQL-SPARQL-UNKNOWN-SENTENCE-WHERE-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_sparql_filter_where_expression_p", "CSQL-SPARQL-FILTER-WHERE-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_literal_where_expression_string", "SPARQL-LITERAL-WHERE-EXPRESSION-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "output_sparql_literal_where_expression_from_csql_filter_where_expression", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-CSQL-FILTER-WHERE-EXPRESSION", 3, 0, false );
    SubLFiles.declareFunction( me, "output_sparql_literal_where_expression_from_csql_unknown_sentence_where_expression", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-CSQL-UNKNOWN-SENTENCE-WHERE-EXPRESSION", 3, 0,
        false );
    SubLFiles.declareFunction( me, "output_sparql_literal_where_expression_from_csql_literal_where_expression", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-CSQL-LITERAL-WHERE-EXPRESSION", 3, 0, false );
    SubLFiles.declareFunction( me, "output_sparql_literal_where_expression_from_spo", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-SPO", 5, 1, false );
    SubLFiles.declareFunction( me, "unpack_csql_disjunctions", "UNPACK-CSQL-DISJUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_literal_where_expression_datatype", "SPARQL-LITERAL-WHERE-EXPRESSION-DATATYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "sparql_literal_where_expression_arg_string", "SPARQL-LITERAL-WHERE-EXPRESSION-ARG-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "possible_rdf_literal_string_p", "POSSIBLE-RDF-LITERAL-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_categorize_where_expressions", "SPARQL-CATEGORIZE-WHERE-EXPRESSIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_categorize_equality_clause", "SPARQL-CATEGORIZE-EQUALITY-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_write_constraints", "SPARQL-WRITE-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "sparql_write_constraint", "SPARQL-WRITE-CONSTRAINT", 3, 0, false );
    SubLFiles.declareFunction( me, "sparql_possibly_expand_identifier_string", "SPARQL-POSSIBLY-EXPAND-IDENTIFIER-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "sparql_unescaped_identifier_string_p", "SPARQL-UNESCAPED-IDENTIFIER-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_unescaped_identifier_char_p", "SPARQL-UNESCAPED-IDENTIFIER-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_to_sparql_limit", "CSQL-TO-SPARQL-LIMIT", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_to_sparql_offset", "CSQL-TO-SPARQL-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "sparql_identifier_p", "SPARQL-IDENTIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_bnode_identifier_p", "SPARQL-BNODE-IDENTIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_abbreviated_uri_p", "SPARQL-ABBREVIATED-URI-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_expanded_uri_p", "SPARQL-EXPANDED-URI-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_identifier_string", "SPARQL-IDENTIFIER-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_expanded_identifier_string", "SPARQL-EXPANDED-IDENTIFIER-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "sparql_valid_uri_prefix_string_p", "SPARQL-VALID-URI-PREFIX-STRING-P", 1, 2, false );
    SubLFiles.declareFunction( me, "sparql_valid_uri_identifier_string_p", "SPARQL-VALID-URI-IDENTIFIER-STRING-P", 1, 2, false );
    SubLFiles.declareFunction( me, "sparql_valid_uri_identifier_char_p", "SPARQL-VALID-URI-IDENTIFIER-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_literal_p", "SPARQL-LITERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_literal_string", "SPARQL-LITERAL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_variable_p", "SPARQL-VARIABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_variable_string", "SPARQL-VARIABLE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "test_csql_to_sparql", "TEST-CSQL-TO-SPARQL", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_sksi_csql_sparql_interpretation_file()
  {
    $sparql_limit_override$ = SubLFiles.defvar( "*SPARQL-LIMIT-OVERRIDE*", NIL );
    $sparql_offset_override$ = SubLFiles.defvar( "*SPARQL-OFFSET-OVERRIDE*", NIL );
    $sksi_sparql_ist_graph_variable$ = SubLFiles.defparameter( "*SKSI-SPARQL-IST-GRAPH-VARIABLE*", NIL );
    $sksi_sparql_ist_graph_result$ = SubLFiles.defparameter( "*SKSI-SPARQL-IST-GRAPH-RESULT*", NIL );
    $sksi_sparql_graph_optimization_enabledP$ = SubLFiles.defparameter( "*SKSI-SPARQL-GRAPH-OPTIMIZATION-ENABLED?*", NIL );
    $sksi_sparql_maximize_literal_conjunctionP$ = SubLFiles.defparameter( "*SKSI-SPARQL-MAXIMIZE-LITERAL-CONJUNCTION?*", NIL );
    $sksi_sparql_force_date_comparisons_as_stringsP$ = SubLFiles.defparameter( "*SKSI-SPARQL-FORCE-DATE-COMPARISONS-AS-STRINGS?*", T );
    $sparql_expand_identifier_stringsP$ = SubLFiles.defparameter( "*SPARQL-EXPAND-IDENTIFIER-STRINGS?*", T );
    $test_access_path_alist$ = SubLFiles.defparameter( "*TEST-ACCESS-PATH-ALIST*", $list107 );
    return NIL;
  }

  public static SubLObject setup_sksi_csql_sparql_interpretation_file()
  {
    generic_testing.define_test_case_table_int( $sym108$TEST_CSQL_TO_SPARQL, ConsesLow.list( new SubLObject[] { $kw109$TEST, Symbols.symbol_function( EQUAL ), $kw110$OWNER, NIL, $kw111$CLASSES, NIL, $kw112$KB,
      $kw113$FULL, $kw114$WORKING_, T
    } ), $list115 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_csql_sparql_interpretation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_csql_sparql_interpretation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_csql_sparql_interpretation_file();
  }
  static
  {
    me = new sksi_csql_sparql_interpretation();
    $sparql_limit_override$ = null;
    $sparql_offset_override$ = null;
    $sksi_sparql_ist_graph_variable$ = null;
    $sksi_sparql_ist_graph_result$ = null;
    $sksi_sparql_graph_optimization_enabledP$ = null;
    $sksi_sparql_maximize_literal_conjunctionP$ = null;
    $sksi_sparql_force_date_comparisons_as_stringsP$ = null;
    $sparql_expand_identifier_stringsP$ = null;
    $test_access_path_alist$ = null;
    $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list1 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $sym2$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw3$SELECT = makeKeyword( "SELECT" );
    $str4$malformed_csql_expression__a__exp = makeString( "malformed csql expression ~a, expected :select" );
    $sym5$CSETQ = makeSymbol( "CSETQ" );
    $str6$_A = makeString( "~A" );
    $str7$BASE_ = makeString( "BASE " );
    $list8 = ConsesLow.cons( makeSymbol( "PREFIX" ), makeSymbol( "PREFIX-URI" ) );
    $str9$PREFIX__A__ = makeString( "PREFIX ~A: " );
    $sym10$STRINGP = makeSymbol( "STRINGP" );
    $list11 = ConsesLow.list( makeSymbol( "SELECT-KEYWORD" ), makeSymbol( "FIELDS" ), makeSymbol( "FROM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "WHERE" ), makeSymbol( "LIMIT" ), makeSymbol( "OFFSET" ) );
    $str12$ASK = makeString( "ASK" );
    $str13$_ = makeString( " " );
    $str14$SELECT = makeString( "SELECT" );
    $str15$WHERE = makeString( "WHERE" );
    $str16$_ = makeString( "{" );
    $str17$GRAPH__CONTEXT = makeString( "GRAPH ?CONTEXT" );
    $str18$___ = makeString( " { " );
    $str19$_ = makeString( "}" );
    $str20$LIMIT = makeString( "LIMIT" );
    $str21$OFFSET = makeString( "OFFSET" );
    $str22$__ = makeString( " *" );
    $list23 = ConsesLow.list( makeSymbol( "VARIABLES-KEYWORD" ), makeSymbol( "&REST" ), makeSymbol( "VARIABLES" ) );
    $kw24$VARIABLES = makeKeyword( "VARIABLES" );
    $str25$malformed_csql_expression__a__exp = makeString( "malformed csql expression ~a, expected :variables" );
    $str26$__A = makeString( " ~A" );
    $list27 = ConsesLow.list( makeKeyword( "COUNT" ), makeKeyword( "ALL" ) );
    $sym28$EL_VARIABLE_P = makeSymbol( "EL-VARIABLE-P" );
    $str29$subject = makeString( "subject" );
    $str30$_subj = makeString( "?subj" );
    $str31$predicate = makeString( "predicate" );
    $str32$_pred = makeString( "?pred" );
    $str33$object = makeString( "object" );
    $str34$_obj = makeString( "?obj" );
    $str35$Unsupported_SPARQL_field_name__S = makeString( "Unsupported SPARQL field name ~S" );
    $list36 = ConsesLow.list( makeSymbol( "WHERE-KEYWORD" ), makeSymbol( "WHERE-EXPRESSIONS" ) );
    $kw37$WHERE = makeKeyword( "WHERE" );
    $str38$malformed_csql_expression__a__exp = makeString( "malformed csql expression ~a, expected :where" );
    $str39$GRAPH__G____ = makeString( "GRAPH ?G {~%" );
    $kw40$FIRST_REST = makeKeyword( "FIRST-REST" );
    $str41$___ = makeString( "}~%" );
    $str42$__ = makeString( "  " );
    $str43$__ = makeString( " ." );
    $const44$CSQLDifferent = constant_handles.reader_make_constant_shell( makeString( "CSQLDifferent" ) );
    $sym45$CSQL_LITERAL_WHERE_EXPRESSION_P = makeSymbol( "CSQL-LITERAL-WHERE-EXPRESSION-P" );
    $kw46$LITERAL = makeKeyword( "LITERAL" );
    $list47 = ConsesLow.list( makeSymbol( "LITERAL-KEYWORD" ), makeSymbol( "LITERAL" ) );
    $kw48$FIELD = makeKeyword( "FIELD" );
    $list49 = ConsesLow.list( makeSymbol( "EXPRESSION-KEYWORD" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $kw50$UNKNOWN_SENTENCE = makeKeyword( "UNKNOWN-SENTENCE" );
    $str51$Unexpected_where_clause____S = makeString( "Unexpected where-clause : ~S" );
    $list52 = ConsesLow.list( makeSymbol( "CSQL-OPERATOR" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) );
    $const53$Sparql_P_TheProgram = constant_handles.reader_make_constant_shell( makeString( "Sparql-P-TheProgram" ) );
    $str54$CSQL_operator__A_missing___csqlOp = makeString( "CSQL operator ~A missing #$csqlOperatorToSQLOperator for #$Sparql-P-TheProgram." );
    $str55$__FILTER__ = makeString( "  FILTER (" );
    $const56$CSQLEqualsAny = constant_handles.reader_make_constant_shell( makeString( "CSQLEqualsAny" ) );
    $str57$_A_ = makeString( "~A " );
    $str58$____ = makeString( " || " );
    $str59$Set_arguments_only_supported_for_ = makeString( "Set arguments only supported for #$CSQLEqualsAny" );
    $str60$_ = makeString( ")" );
    $list61 = ConsesLow.list( makeSymbol( "UNKNOWN-SENTENCE-KEYWORD" ), makeSymbol( "EXISTENTIAL-VARS-LIST" ), makeSymbol( "SUB-WHERE" ) );
    $list62 = ConsesLow.cons( makeSymbol( "EXISTENTIAL-VARS-KEYWORD" ), makeSymbol( "EXISTENTIAL-VARS" ) );
    $str63$OPTIONAL____ = makeString( "OPTIONAL {~%" );
    $str64$FILTER__ = makeString( "FILTER (" );
    $str65$__bound__A__ = makeString( " !bound(~A) " );
    $str66$___ = makeString( "|| " );
    $str67$___ = makeString( ")~%" );
    $list68 = ConsesLow.list( makeSymbol( "LITERAL-KEYWORD" ), ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "SUBJECT" ), makeSymbol( "OBJECT" ) ) );
    $sym69$CSQL_DISJUNCTION_P = makeSymbol( "CSQL-DISJUNCTION-P" );
    $str70$__ = makeString( " {" );
    $str71$___UNION = makeString( "   UNION" );
    $list72 = ConsesLow.list( makeSymbol( "ONE-SUBJECT" ), makeSymbol( "ONE-PREDICATE" ), makeSymbol( "ONE-OBJECT" ) );
    $str73$___ = makeString( " } " );
    $str74$_ = makeString( "." );
    $const75$CSQLLaterThan = constant_handles.reader_make_constant_shell( makeString( "CSQLLaterThan" ) );
    $kw76$DATE = makeKeyword( "DATE" );
    $const77$CSQLLaterThanOrCooriginatingWith = constant_handles.reader_make_constant_shell( makeString( "CSQLLaterThanOrCooriginatingWith" ) );
    $str78$STR_ = makeString( "STR(" );
    $str79$xsd_dateTime_ = makeString( "xsd:dateTime(" );
    $str80$xsd_dateTime__ = makeString( "xsd:dateTime(\"" );
    $str81$__ = makeString( "\")" );
    $str82$xsd_string_ = makeString( "xsd:string(" );
    $str83$xsd_float_ = makeString( "xsd:float(" );
    $str84$xsd_float__F_ = makeString( "xsd:float(~F)" );
    $str85$Unexpected_where_clause_argument_ = makeString( "Unexpected where-clause argument : ~A" );
    $str86$Unexpected_equality_clause____S = makeString( "Unexpected equality-clause : ~S" );
    $list87 = ConsesLow.list( makeSymbol( "EQUALITY" ), makeSymbol( "EXPRESSION1" ), makeSymbol( "EXPRESSION2" ) );
    $str88$Time_to_support_multiple___A_cons = makeString( "Time to support multiple ~~A constraints : ~S" );
    $str89$Time_to_handle_constraint____S = makeString( "Time to handle constraint : ~S" );
    $str90$_ = makeString( "<" );
    $str91$_ = makeString( ">" );
    $sym92$SPARQL_UNESCAPED_IDENTIFIER_CHAR_P = makeSymbol( "SPARQL-UNESCAPED-IDENTIFIER-CHAR-P" );
    $list93 = ConsesLow.list( Characters.CHAR_colon, Characters.CHAR_hyphen, Characters.CHAR_underbar );
    $list94 = ConsesLow.list( makeSymbol( "LIMIT-KEYWORD" ), makeSymbol( "LIMIT-NUMBER" ) );
    $kw95$LIMIT = makeKeyword( "LIMIT" );
    $str96$malformed_csql_expression__a__exp = makeString( "malformed csql expression ~a, expected :limit" );
    $list97 = ConsesLow.list( makeSymbol( "OFFSET-KEYWORD" ), makeSymbol( "OFFSET-NUMBER" ) );
    $kw98$OFFSET = makeKeyword( "OFFSET" );
    $str99$malformed_csql_expression__a__exp = makeString( "malformed csql expression ~a, expected :offset" );
    $str100$__ = makeString( "_:" );
    $str101$_ = makeString( ":" );
    $sym102$STRING_ = makeSymbol( "STRING=" );
    $str103$Could_not_find_expanded_prefix_fo = makeString( "Could not find expanded-prefix for ~A in map ~A~%" );
    $str104$_F = makeString( "~F" );
    $list105 = ConsesLow.list( makeString( "true" ), makeString( "false" ) );
    $str106$__xsd_boolean = makeString( "^^xsd:boolean" );
    $list107 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "baseNamespaceForSKS" ) ), makeString( "http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nameSpacePrefixForSKS" ) ), ConsesLow.cons( makeString( "owl" ), makeString( "http://www/w3.org/2000/07/owl#" ) ), ConsesLow.cons(
            makeString( "ptrec" ), makeString( "http://clevelandclinicfoundation.org/cidr/patientrecord#" ) ), ConsesLow.cons( makeString( "rdf" ), makeString( "http://www/w3.org/2000/02/22-rdf-syntax-ns#" ) ), ConsesLow
                .cons( makeString( "rdfs" ), makeString( "http://www/w3.org/2000/01/rdf-schema#" ) ), ConsesLow.cons( makeString( "xsd" ), makeString( "http://www.w3.org/2001/XMLSchema#" ) ) ) );
    $sym108$TEST_CSQL_TO_SPARQL = makeSymbol( "TEST-CSQL-TO-SPARQL" );
    $kw109$TEST = makeKeyword( "TEST" );
    $kw110$OWNER = makeKeyword( "OWNER" );
    $kw111$CLASSES = makeKeyword( "CLASSES" );
    $kw112$KB = makeKeyword( "KB" );
    $kw113$FULL = makeKeyword( "FULL" );
    $kw114$WORKING_ = makeKeyword( "WORKING?" );
    $list115 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "SELECT" ), ConsesLow.list( ConsesLow.list( makeKeyword( "FIELD" ), makeString( "object" ), makeString( "default" ) ) ),
        ConsesLow.list( makeKeyword( "FROM" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TABLE" ), makeString( "default" ) ) ) ), ConsesLow.list( makeKeyword( "WHERE" ), ConsesLow.list( ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "predicate" ), makeString( "default" ) ), makeString( "rdf:type" ) ), ConsesLow
                .list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "subject" ), makeString( "default" ) ), makeString( "foo" ) ) ) ) ) ),
        makeString(
            "BASE <http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#>\nPREFIX owl: <http://www/w3.org/2000/07/owl#>\nPREFIX ptrec: <http://clevelandclinicfoundation.org/cidr/patientrecord#>\nPREFIX rdf: <http://www/w3.org/2000/02/22-rdf-syntax-ns#>\nPREFIX rdfs: <http://www/w3.org/2000/01/rdf-schema#>\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\nSELECT ?obj\nWHERE {\n  \"foo\" rdf:type ?obj  .\n}\n" ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "SELECT" ), ConsesLow.list( ConsesLow.list( makeKeyword( "FIELD" ), makeString( "object" ), makeString( "default" ), NIL ) ), ConsesLow.list(
            makeKeyword( "FROM" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TABLE" ), makeString( "default" ), NIL ) ) ), ConsesLow.list( makeKeyword( "WHERE" ), ConsesLow.list( ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "predicate" ), makeString( "default" ), NIL ), makeString( "rdf:type" ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "subject" ), makeString( "default" ), NIL ), makeString(
                        "foo" ) ) ) ) ) ), makeString(
                            "BASE <http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#>\nPREFIX owl: <http://www/w3.org/2000/07/owl#>\nPREFIX ptrec: <http://clevelandclinicfoundation.org/cidr/patientrecord#>\nPREFIX rdf: <http://www/w3.org/2000/02/22-rdf-syntax-ns#>\nPREFIX rdfs: <http://www/w3.org/2000/01/rdf-schema#>\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\nSELECT ?obj\nWHERE {\n  \"foo\" rdf:type ?obj  .\n}\n" ) ) );
  }
}
/*
 * 
 * Total time: 402 ms
 * 
 */