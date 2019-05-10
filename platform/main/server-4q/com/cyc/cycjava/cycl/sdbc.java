//
////
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sdbc
    extends
      SubLTranslatedFile
{
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16417L)
  public static SubLObject sql_proxy_server_runningP(SubLObject server, SubLObject port, SubLObject timeout)
  {
    if( server == UNPROVIDED )
    {
      server = $sdbc_proxy_server$.getGlobalValue();
    }
    if( port == UNPROVIDED )
    {
      port = $sql_port$.getGlobalValue();
    }
    if( timeout == UNPROVIDED )
    {
      timeout = FIVE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( server ) : server;
    assert NIL != subl_promotions.positive_integer_p( port ) : port;
    SubLObject downP = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym35$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject stream = NIL;
          try
          {
            stream = subl_promotions.open_tcp_stream_with_timeout( server, port, NIL, $kw36$PRIVATE );
            if( NIL != subl_macro_promotions.validate_tcp_connection( stream, server, port ) )
            {
              cfasl.cfasl_output( ConsesLow.cons( $quit$.getGlobalValue(), NIL ), stream );
              streams_high.finish_output( stream );
              final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
              try
              {
                thread.throwStack.push( tag );
                final SubLObject _prev_bind_0_$1 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                try
                {
                  subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                  SubLObject timer = NIL;
                  try
                  {
                    final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                    try
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                      timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
                      cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$2, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      subl_macro_promotions.with_timeout_stop_timer( timer );
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
                  subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$1, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                downP = Errors.handleThrowable( ccatch_env_var, tag );
              }
              finally
              {
                thread.throwStack.pop();
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL != stream )
              {
                streams_high.close( stream, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
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
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      downP = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return makeBoolean( NIL == downP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sql_connection_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    sqlc_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sql_connection_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sql_connection_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_db(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_user(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_dbms_server(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_port(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_channel(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_statements(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_lock(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_subprotocol(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_proxy_server(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_error_handling(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_tickets(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject sqlc_mailman(final SubLObject v_object)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_db(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_user(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_dbms_server(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_port(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_channel(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_statements(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_subprotocol(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_proxy_server(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_error_handling(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_tickets(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject _csetf_sqlc_mailman(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_connection_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject make_sql_connection(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sql_connection_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw70$DB ) )
      {
        _csetf_sqlc_db( v_new, current_value );
      }
      else if( pcase_var.eql( $kw71$USER ) )
      {
        _csetf_sqlc_user( v_new, current_value );
      }
      else if( pcase_var.eql( $kw72$DBMS_SERVER ) )
      {
        _csetf_sqlc_dbms_server( v_new, current_value );
      }
      else if( pcase_var.eql( $kw73$PORT ) )
      {
        _csetf_sqlc_port( v_new, current_value );
      }
      else if( pcase_var.eql( $kw74$CHANNEL ) )
      {
        _csetf_sqlc_channel( v_new, current_value );
      }
      else if( pcase_var.eql( $kw75$STATEMENTS ) )
      {
        _csetf_sqlc_statements( v_new, current_value );
      }
      else if( pcase_var.eql( $kw76$LOCK ) )
      {
        _csetf_sqlc_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw77$SUBPROTOCOL ) )
      {
        _csetf_sqlc_subprotocol( v_new, current_value );
      }
      else if( pcase_var.eql( $kw78$PROXY_SERVER ) )
      {
        _csetf_sqlc_proxy_server( v_new, current_value );
      }
      else if( pcase_var.eql( $kw79$ERROR_HANDLING ) )
      {
        _csetf_sqlc_error_handling( v_new, current_value );
      }
      else if( pcase_var.eql( $kw80$TICKETS ) )
      {
        _csetf_sqlc_tickets( v_new, current_value );
      }
      else if( pcase_var.eql( $kw81$MAILMAN ) )
      {
        _csetf_sqlc_mailman( v_new, current_value );
      }
      else
      {
        Errors.error( $str82$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject visit_defstruct_sql_connection(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw83$BEGIN, $sym84$MAKE_SQL_CONNECTION, TWELVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw70$DB, sqlc_db( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw71$USER, sqlc_user( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw72$DBMS_SERVER, sqlc_dbms_server( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw73$PORT, sqlc_port( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw74$CHANNEL, sqlc_channel( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw75$STATEMENTS, sqlc_statements( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw76$LOCK, sqlc_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw77$SUBPROTOCOL, sqlc_subprotocol( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw78$PROXY_SERVER, sqlc_proxy_server( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw79$ERROR_HANDLING, sqlc_error_handling( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw80$TICKETS, sqlc_tickets( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw81$MAILMAN, sqlc_mailman( obj ) );
    Functions.funcall( visitor_fn, obj, $kw86$END, $sym84$MAKE_SQL_CONNECTION, TWELVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17395L)
  public static SubLObject visit_defstruct_object_sql_connection_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sql_connection( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18284L)
  public static SubLObject sqlc_print(final SubLObject connection, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( sqlc_print_string( connection ), stream, UNPROVIDED, UNPROVIDED );
    return connection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18543L)
  public static SubLObject sqlc_print_string(final SubLObject connection)
  {
    SubLObject string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      streams_high.write_string( $str88$__SQL_CONNECTION_, stream, UNPROVIDED, UNPROVIDED );
      if( NIL == sqlc_open_p( connection ) )
      {
        streams_high.write_string( $str89$closed_, stream, UNPROVIDED, UNPROVIDED );
      }
      streams_high.write_string( $str90$to_, stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( sqlc_db( connection ), stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( $str91$__, stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( sqlc_dbms_server( connection ), stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( $str92$_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( sqlc_port( connection ), stream );
      streams_high.write_string( $str93$__, stream, UNPROVIDED, UNPROVIDED );
      string = streams_high.get_output_stream_string( stream );
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
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19173L)
  public static SubLObject new_sql_connection(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = v_properties;
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list94 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list94 );
      if( NIL == conses_high.member( current_$5, $list95, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw96$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list94 );
    }
    final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member( $kw72$DBMS_SERVER, current );
    final SubLObject dbms_server = ( NIL != dbms_server_tail ) ? conses_high.cadr( dbms_server_tail ) : $dbms_server$.getGlobalValue();
    final SubLObject dbms_port_tail = cdestructuring_bind.property_list_member( $kw97$DBMS_PORT, current );
    final SubLObject dbms_port = ( NIL != dbms_port_tail ) ? conses_high.cadr( dbms_port_tail ) : NIL;
    final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member( $kw77$SUBPROTOCOL, current );
    final SubLObject subprotocol = ( NIL != subprotocol_tail ) ? conses_high.cadr( subprotocol_tail ) : $sql_subprotocol$.getGlobalValue();
    final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member( $kw78$PROXY_SERVER, current );
    final SubLObject proxy_server = ( NIL != proxy_server_tail ) ? conses_high.cadr( proxy_server_tail ) : dbms_server;
    final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw73$PORT, current );
    final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $sql_port$.getGlobalValue();
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw98$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : $sql_connection_timeout$.getGlobalValue();
    assert NIL != Types.stringp( db ) : db;
    if( NIL != user && !assertionsDisabledInClass && NIL == Types.stringp( user ) )
    {
      throw new AssertionError( user );
    }
    if( NIL != password && !assertionsDisabledInClass && NIL == Types.stringp( password ) )
    {
      throw new AssertionError( password );
    }
    assert NIL != Types.stringp( dbms_server ) : dbms_server;
    if( NIL != dbms_port && !assertionsDisabledInClass && NIL == Types.integerp( dbms_port ) )
    {
      throw new AssertionError( dbms_port );
    }
    assert NIL != Types.integerp( port ) : port;
    assert NIL != Types.stringp( subprotocol ) : subprotocol;
    assert NIL != Types.stringp( proxy_server ) : proxy_server;
    assert NIL != number_utilities.non_negative_number_p( timeout ) : timeout;
    SubLObject connection = make_sql_connection( UNPROVIDED );
    SubLObject error_message = NIL;
    SubLObject timed_outP = NIL;
    _csetf_sqlc_db( connection, db );
    _csetf_sqlc_user( connection, user );
    _csetf_sqlc_dbms_server( connection, dbms_server );
    _csetf_sqlc_port( connection, port );
    _csetf_sqlc_subprotocol( connection, subprotocol );
    _csetf_sqlc_proxy_server( connection, proxy_server );
    _csetf_sqlc_lock( connection, Locks.make_lock( $str101$SQL_connection_lock ) );
    _csetf_sqlc_error_handling( connection, $kw102$RETURN );
    _csetf_sqlc_tickets( connection, queues.create_queue( UNPROVIDED ) );
    final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
    try
    {
      thread.throwStack.push( tag );
      final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
      try
      {
        subl_macro_promotions.$within_with_timeout$.bind( T, thread );
        SubLObject timer = NIL;
        try
        {
          final SubLObject _prev_bind_0_$6 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
            timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
            try
            {
              thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( $sym35$CATCH_ERROR_MESSAGE_HANDLER, thread );
                try
                {
                  if( NIL == proxy_server || NIL == port )
                  {
                    Errors.error( $str103$Trying_to_open_from_a_null_sqlc_c );
                  }
                  _csetf_sqlc_channel( connection, subl_promotions.open_tcp_stream_with_timeout( proxy_server, port, NIL, $kw36$PRIVATE ) );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$7, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            }
            finally
            {
              thread.throwStack.pop();
            }
            if( NIL != error_message )
            {
              connection = sqlc_handle_error( connection, new_sdbc_error( $client_error$.getGlobalValue(), error_message, UNPROVIDED ) );
            }
            else
            {
              _csetf_sqlc_mailman( connection, launch_sql_mailman( connection ) );
              final SubLObject result = sqlc_execute( connection, $new_connection$.getGlobalValue(), ConsesLow.list( new_db_url( dbms_server, db, user, password, subprotocol, dbms_port ) ) );
              if( NIL != sdbc_error_p( result ) )
              {
                sqlc_close( connection );
                connection = result;
              }
            }
          }
          finally
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$6, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            subl_macro_promotions.with_timeout_stop_timer( timer );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
          }
        }
      }
      finally
      {
        subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      timed_outP = Errors.handleThrowable( ccatch_env_var2, tag );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != timed_outP )
    {
      sqlc_close( connection );
      connection = sqlc_handle_error( connection, new_sdbc_error( $client_error$.getGlobalValue(), $str104$timeout, UNPROVIDED ) );
    }
    return connection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22306L)
  public static SubLObject sql_open_connection_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sql_connection_p( v_object ) && NIL != sqlc_open_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22472L)
  public static SubLObject sqlc_open_p(final SubLObject connection)
  {
    assert NIL != sql_connection_p( connection ) : connection;
    return makeBoolean( NIL != sqlc_channel( connection ) && NIL != streams_high.open_stream_p( sqlc_channel( connection ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22748L)
  public static SubLObject sqlc_close(final SubLObject connection)
  {
    assert NIL != sql_connection_p( connection ) : connection;
    final SubLObject lock = sqlc_lock( connection );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      if( NIL != sqlc_mailman( connection ) )
      {
        Threads.kill_process( sqlc_mailman( connection ) );
      }
      _csetf_sqlc_mailman( connection, NIL );
      if( NIL != sqlc_channel( connection ) )
      {
        streams_high.close( sqlc_channel( connection ), UNPROVIDED );
      }
      _csetf_sqlc_channel( connection, NIL );
      SubLObject cdolist_list_var = sqlc_statements( connection );
      SubLObject statement = NIL;
      statement = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sqls_local_close( statement );
        cdolist_list_var = cdolist_list_var.rest();
        statement = cdolist_list_var.first();
      }
      _csetf_sqlc_statements( connection, NIL );
      return connection;
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23715L)
  public static SubLObject sqlc_create_statement(final SubLObject connection)
  {
    assert NIL != sql_open_connection_p( connection ) : connection;
    final SubLObject statement = new_sql_statement( connection );
    if( NIL != sql_statement_p( statement ) )
    {
      _csetf_sqlc_statements( connection, ConsesLow.cons( statement, sqlc_statements( connection ) ) );
    }
    return statement;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24108L)
  public static SubLObject sqlc_prepare_statement(final SubLObject connection, final SubLObject sql)
  {
    assert NIL != sql_open_connection_p( connection ) : connection;
    assert NIL != Types.stringp( sql ) : sql;
    final SubLObject statement = new_sql_prepared_statement( connection, sql );
    if( NIL != sql_statement_p( statement ) )
    {
      _csetf_sqlc_statements( connection, ConsesLow.cons( statement, sqlc_statements( connection ) ) );
    }
    return statement;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24580L)
  public static SubLObject sqlc_set_auto_commit(final SubLObject connection, final SubLObject flag)
  {
    assert NIL != sql_open_connection_p( connection ) : connection;
    assert NIL != Types.booleanp( flag ) : flag;
    return sqlc_execute( connection, $set_auto_commit$.getGlobalValue(), ConsesLow.list( flag ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24928L)
  public static SubLObject sqlc_get_auto_commit(final SubLObject connection)
  {
    assert NIL != sql_open_connection_p( connection ) : connection;
    return sqlc_execute( connection, $get_auto_commit$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25237L)
  public static SubLObject sqlc_commit(final SubLObject connection)
  {
    assert NIL != sql_open_connection_p( connection ) : connection;
    return sqlc_execute( connection, $commit$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25621L)
  public static SubLObject sqlc_rollback(final SubLObject connection)
  {
    assert NIL != sql_open_connection_p( connection ) : connection;
    return sqlc_execute( connection, $rollback$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25992L)
  public static SubLObject sqlc_get_transaction_isolation(final SubLObject connection)
  {
    assert NIL != sql_open_connection_p( connection ) : connection;
    return sqlc_execute( connection, $get_transaction_isolation$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26438L)
  public static SubLObject sqlc_set_transaction_isolation(final SubLObject connection, final SubLObject transaction_level)
  {
    assert NIL != sql_open_connection_p( connection ) : connection;
    assert NIL != sql_transaction_level_p( transaction_level ) : transaction_level;
    return sqlc_execute( connection, $set_transaction_isolation$.getGlobalValue(), ConsesLow.list( transaction_level ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27348L)
  public static SubLObject sql_ticket_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27348L)
  public static SubLObject sql_ticket_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sql_ticket_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27348L)
  public static SubLObject sql_ticket_semaphore(final SubLObject v_object)
  {
    assert NIL != sql_ticket_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27348L)
  public static SubLObject sql_ticket_result(final SubLObject v_object)
  {
    assert NIL != sql_ticket_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27348L)
  public static SubLObject _csetf_sql_ticket_semaphore(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_ticket_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27348L)
  public static SubLObject _csetf_sql_ticket_result(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_ticket_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27348L)
  public static SubLObject make_sql_ticket(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sql_ticket_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw122$SEMAPHORE ) )
      {
        _csetf_sql_ticket_semaphore( v_new, current_value );
      }
      else if( pcase_var.eql( $kw123$RESULT ) )
      {
        _csetf_sql_ticket_result( v_new, current_value );
      }
      else
      {
        Errors.error( $str82$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27348L)
  public static SubLObject visit_defstruct_sql_ticket(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw83$BEGIN, $sym124$MAKE_SQL_TICKET, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw122$SEMAPHORE, sql_ticket_semaphore( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw123$RESULT, sql_ticket_result( obj ) );
    Functions.funcall( visitor_fn, obj, $kw86$END, $sym124$MAKE_SQL_TICKET, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27348L)
  public static SubLObject visit_defstruct_object_sql_ticket_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sql_ticket( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27528L)
  public static SubLObject new_sql_ticket()
  {
    final SubLObject ticket = make_sql_ticket( UNPROVIDED );
    _csetf_sql_ticket_semaphore( ticket, Semaphores.new_semaphore( $str126$SQL_Request, ZERO_INTEGER ) );
    return ticket;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27913L)
  public static SubLObject sql_ticket_retrieve(final SubLObject ticket)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    while ( NIL == result)
    {
      final SubLObject inference = inference_macros.current_controlling_inference();
      final SubLObject inference_remaining_time = ( NIL != inference ) ? inference_datastructures_inference.inference_remaining_time( inference, T ) : NIL;
      final SubLObject max_secs_to_wait = inference_remaining_time.isInteger() ? Numbers.add( FIVE_INTEGER, inference_remaining_time )
          : ( ( NIL != inference ) ? $sql_connection_timeout_seconds_within_inference$.getDynamicValue( thread ) : $sql_connection_timeout_seconds$.getDynamicValue( thread ) );
      if( NIL != Semaphores.semaphore_wait_with_timeout( sql_ticket_semaphore( ticket ), max_secs_to_wait ) )
      {
        result = sql_ticket_result( ticket );
      }
      else
      {
        result = new_sdbc_error( $io_error$.getGlobalValue(), Sequences.cconcatenate( $str128$Timed_out_after_, new SubLObject[] { format_nil.format_nil_d_no_copy( max_secs_to_wait ),
          $str129$_seconds_retrieving_SQL_ticket
        } ), UNPROVIDED );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29112L)
  public static SubLObject launch_sql_mailman(final SubLObject connection)
  {
    return subl_promotions.make_process_with_args( Sequences.cconcatenate( $str130$SQL_Mailman_for_, format_nil.format_nil_a_no_copy( sqlc_print_string( connection ) ) ), $sym131$SQLC_DELIVER, ConsesLow.list(
        connection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29413L)
  public static SubLObject sqlc_deliver(final SubLObject connection)
  {
    enforceType( connection, $sym38$SQL_CONNECTION_P );
    SubLObject result = NIL;
    SubLObject ticket = NIL;
    while ( true)
    {
      result = sqlc_receive( connection );
      final SubLObject lock = sqlc_lock( connection );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ticket = queues.dequeue( sqlc_tickets( connection ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
      if( NIL != ticket )
      {
        _csetf_sql_ticket_result( ticket, result );
        Semaphores.semaphore_signal( sql_ticket_semaphore( ticket ) );
      }
      else if( NIL != sdbc_client_error_p( result ) )
      {
        streams_high.close( sqlc_channel( connection ), UNPROVIDED );
        sqlc_close( connection );
      }
      else
      {
        Errors.error( $str132$Implementation_error__no_ticket_f, result );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30323L)
  public static SubLObject sqlc_execute(final SubLObject connection, final SubLObject function, final SubLObject args)
  {
    final SubLObject ticket = new_sql_ticket();
    SubLObject send_response = NIL;
    SubLObject receive_response = NIL;
    send_response = sqlc_send( connection, ticket, function, args );
    if( NIL != sdbc_client_error_p( send_response ) )
    {
      streams_high.close( sqlc_channel( connection ), UNPROVIDED );
      sqlc_close( connection );
      return sqlc_handle_error( connection, send_response );
    }
    receive_response = sql_ticket_retrieve( ticket );
    if( NIL != sdbc_error_p( receive_response ) )
    {
      if( NIL != sdbc_client_error_p( receive_response ) )
      {
        streams_high.close( sqlc_channel( connection ), UNPROVIDED );
        sqlc_close( connection );
      }
      return sqlc_handle_error( connection, receive_response );
    }
    return receive_response;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31513L)
  public static SubLObject sqlc_send(final SubLObject connection, final SubLObject ticket, final SubLObject function, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( connection, $sym38$SQL_CONNECTION_P );
    SubLObject error_message = NIL;
    SubLObject response = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym35$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL == sqlc_channel( connection ) )
          {
            Errors.error( $str133$Trying_to_read_from_a_null_sqlc_c );
          }
          final SubLObject lock = sqlc_lock( connection );
          SubLObject release = NIL;
          try
          {
            release = Locks.seize_lock( lock );
            queues.enqueue( ticket, sqlc_tickets( connection ) );
            cfasl.cfasl_output( ConsesLow.cons( function, args ), sqlc_channel( connection ) );
            streams_high.force_output( sqlc_channel( connection ) );
          }
          finally
          {
            if( NIL != release )
            {
              Locks.release_lock( lock );
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
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      response = new_sdbc_error( $client_error$.getGlobalValue(), error_message, UNPROVIDED );
    }
    return response;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32362L)
  public static SubLObject sqlc_receive(final SubLObject connection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( connection, $sym38$SQL_CONNECTION_P );
    SubLObject error_message = NIL;
    SubLObject response = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym35$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL == sqlc_channel( connection ) )
          {
            Errors.error( $str133$Trying_to_read_from_a_null_sqlc_c );
          }
          response = cfasl.cfasl_input( sqlc_channel( connection ), UNPROVIDED, UNPROVIDED );
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
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      response = ConsesLow.cons( $client_error$.getGlobalValue(), ConsesLow.list( error_message ) );
    }
    return sql_response_value( response );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33014L)
  public static SubLObject sqlc_handle_error(final SubLObject connection, final SubLObject error)
  {
    final SubLObject pcase_var = sqlc_error_handling( connection );
    if( pcase_var.eql( $kw102$RETURN ) )
    {
      return error;
    }
    if( pcase_var.eql( $kw134$THROW ) )
    {
      sdbc_error_throw( error );
      return error;
    }
    if( pcase_var.eql( $kw135$WARN ) )
    {
      sdbc_error_warn( error );
      return error;
    }
    assert NIL != sdbc_error_handling_tag_p( sqlc_error_handling( connection ) ) : sqlc_error_handling( connection );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33488L)
  public static SubLObject sql_transaction_level_p(final SubLObject v_object)
  {
    return conses_high.member( v_object, $list137, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34346L)
  public static SubLObject sqlc_set_error_handling(final SubLObject connection, final SubLObject error_handling)
  {
    _csetf_sqlc_error_handling( connection, error_handling );
    return connection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34650L)
  public static SubLObject new_sql_response(final SubLObject code, final SubLObject value)
  {
    return ConsesLow.cons( code, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34803L)
  public static SubLObject sql_response_code(final SubLObject response)
  {
    return response.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34906L)
  public static SubLObject sql_response_value(final SubLObject response)
  {
    final SubLObject code = sql_response_code( response );
    if( code.isNegative() )
    {
      final SubLObject args = response.rest();
      final SubLObject message = args.first();
      final SubLObject vendor_code = conses_high.second( args );
      return new_sdbc_error( code, message, vendor_code );
    }
    if( code.eql( $stop_response$.getGlobalValue() ) )
    {
      return $kw140$STOP;
    }
    return response.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35307L)
  public static SubLObject sql_null_p(final SubLObject v_object)
  {
    return Equality.eq( v_object, $kw141$NULL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35500L)
  public static SubLObject sql_true_p(final SubLObject v_object)
  {
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35626L)
  public static SubLObject sql_false_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject sdbc_error_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    sdbc_error_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject sdbc_error_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sdbc_error_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject sdbc_error_type(final SubLObject v_object)
  {
    assert NIL != sdbc_error_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject sdbc_error_message(final SubLObject v_object)
  {
    assert NIL != sdbc_error_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject sdbc_error_code(final SubLObject v_object)
  {
    assert NIL != sdbc_error_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject _csetf_sdbc_error_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sdbc_error_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject _csetf_sdbc_error_message(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sdbc_error_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject _csetf_sdbc_error_code(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sdbc_error_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject make_sdbc_error(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sdbc_error_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw157$TYPE ) )
      {
        _csetf_sdbc_error_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw158$MESSAGE ) )
      {
        _csetf_sdbc_error_message( v_new, current_value );
      }
      else if( pcase_var.eql( $kw159$CODE ) )
      {
        _csetf_sdbc_error_code( v_new, current_value );
      }
      else
      {
        Errors.error( $str82$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject visit_defstruct_sdbc_error(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw83$BEGIN, $sym160$MAKE_SDBC_ERROR, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw157$TYPE, sdbc_error_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw158$MESSAGE, sdbc_error_message( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw159$CODE, sdbc_error_code( obj ) );
    Functions.funcall( visitor_fn, obj, $kw86$END, $sym160$MAKE_SDBC_ERROR, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35966L)
  public static SubLObject visit_defstruct_object_sdbc_error_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sdbc_error( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36160L)
  public static SubLObject sdbc_error_throw(final SubLObject error)
  {
    assert NIL != sdbc_error_p( error ) : error;
    Errors.error( $str162$_a, sdbc_error_message( error ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36378L)
  public static SubLObject sdbc_error_warn(final SubLObject error)
  {
    assert NIL != sdbc_error_p( error ) : error;
    Errors.warn( $str163$SDBC__a___a, decode_sdbc_error_code( sdbc_error_type( error ) ), sdbc_error_message( error ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36600L)
  public static SubLObject sdbc_server_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sdbc_error_p( v_object ) && NIL == sdbc_client_error_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36801L)
  public static SubLObject sdbc_client_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sdbc_error_p( v_object ) && sdbc_error_type( v_object ).eql( $client_error$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37012L)
  public static SubLObject sdbc_sql_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sdbc_error_p( v_object ) && sdbc_error_type( v_object ).eql( $sql_error$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37196L)
  public static SubLObject sdbc_io_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sdbc_error_p( v_object ) && sdbc_error_type( v_object ).eql( $io_error$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37377L)
  public static SubLObject sdbc_transaction_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sdbc_error_p( v_object ) && sdbc_error_type( v_object ).eql( $transaction_error$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37585L)
  public static SubLObject sdbc_batch_update_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sdbc_error_p( v_object ) && sdbc_error_type( v_object ).eql( $batch_update_error$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37789L)
  public static SubLObject sdbc_other_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sdbc_error_p( v_object ) && sdbc_error_type( v_object ).eql( $unknown_error$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38005L)
  public static SubLObject new_sdbc_error(final SubLObject type, final SubLObject message, SubLObject code)
  {
    if( code == UNPROVIDED )
    {
      code = NIL;
    }
    final SubLObject error = make_sdbc_error( UNPROVIDED );
    _csetf_sdbc_error_type( error, type );
    _csetf_sdbc_error_message( error, message );
    _csetf_sdbc_error_code( error, code );
    return error;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38542L)
  public static SubLObject sdbc_error_print(final SubLObject error, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str164$__SDBC, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( decode_sdbc_error_code( sdbc_error_type( error ) ), stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str165$_ERROR__, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( sdbc_error_message( error ), stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str166$_, stream, UNPROVIDED, UNPROVIDED );
    return error;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39180L)
  public static SubLObject decode_sdbc_error_code(final SubLObject code)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.assoc( code, $sdbc_error_decoding$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject sql_result_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    sqlrs_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject sql_result_set_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sql_result_set_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject sqlrs_rows(final SubLObject v_object)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject sqlrs_current(final SubLObject v_object)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject sqlrs_last(final SubLObject v_object)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject sqlrs_start(final SubLObject v_object)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject sqlrs_connection(final SubLObject v_object)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject sqlrs_block_size(final SubLObject v_object)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject sqlrs_id(final SubLObject v_object)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject _csetf_sqlrs_rows(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject _csetf_sqlrs_current(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject _csetf_sqlrs_last(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject _csetf_sqlrs_start(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject _csetf_sqlrs_connection(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject _csetf_sqlrs_block_size(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject _csetf_sqlrs_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_result_set_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject make_sql_result_set(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sql_result_set_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw197$ROWS ) )
      {
        _csetf_sqlrs_rows( v_new, current_value );
      }
      else if( pcase_var.eql( $kw198$CURRENT ) )
      {
        _csetf_sqlrs_current( v_new, current_value );
      }
      else if( pcase_var.eql( $kw199$LAST ) )
      {
        _csetf_sqlrs_last( v_new, current_value );
      }
      else if( pcase_var.eql( $kw200$START ) )
      {
        _csetf_sqlrs_start( v_new, current_value );
      }
      else if( pcase_var.eql( $kw201$CONNECTION ) )
      {
        _csetf_sqlrs_connection( v_new, current_value );
      }
      else if( pcase_var.eql( $kw202$BLOCK_SIZE ) )
      {
        _csetf_sqlrs_block_size( v_new, current_value );
      }
      else if( pcase_var.eql( $kw203$ID ) )
      {
        _csetf_sqlrs_id( v_new, current_value );
      }
      else
      {
        Errors.error( $str82$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject visit_defstruct_sql_result_set(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw83$BEGIN, $sym204$MAKE_SQL_RESULT_SET, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw197$ROWS, sqlrs_rows( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw198$CURRENT, sqlrs_current( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw199$LAST, sqlrs_last( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw200$START, sqlrs_start( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw201$CONNECTION, sqlrs_connection( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw202$BLOCK_SIZE, sqlrs_block_size( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw203$ID, sqlrs_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw86$END, $sym204$MAKE_SQL_RESULT_SET, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39643L)
  public static SubLObject visit_defstruct_object_sql_result_set_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sql_result_set( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40155L)
  public static SubLObject sqlrs_print(final SubLObject rs, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( rs, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, rs, T, T );
      if( NIL != sqlrs_open_p( rs ) )
      {
        final SubLObject row_count = sqlrs_row_count( rs );
        final SubLObject column_count = sqlrs_column_count( rs );
        streams_high.write_string( $str206$_, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( row_count, stream );
        streams_high.write_string( row_count.numE( ONE_INTEGER ) ? $str207$_row__ : $str208$_rows__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( column_count, stream );
        streams_high.write_string( column_count.numE( ONE_INTEGER ) ? $str209$_column_ : $str210$_columns_, stream, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        streams_high.write_string( $str211$closed, stream, UNPROVIDED, UNPROVIDED );
      }
      print_macros.print_unreadable_object_postamble( stream, rs, T, T );
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40772L)
  public static SubLObject sql_open_result_set_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sql_result_set_p( v_object ) && NIL != sqlrs_open_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40953L)
  public static SubLObject sqlrs_close(final SubLObject rs)
  {
    assert NIL != sql_result_set_p( rs ) : rs;
    if( NIL != sqlrs_open_p( rs ) )
    {
      final SubLObject status = sqlc_execute( sqlrs_connection( rs ), $close_result_set$.getGlobalValue(), ConsesLow.list( sqlrs_id( rs ) ) );
      sqlrs_local_close( rs );
      return ( NIL != sdbc_error_p( status ) ) ? status : rs;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41553L)
  public static SubLObject sqlrs_emptyP(final SubLObject rs)
  {
    return Equality.eql( ZERO_INTEGER, sqlrs_row_count( rs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41673L)
  public static SubLObject sqlrs_absolute(final SubLObject rs, final SubLObject i)
  {
    assert NIL != sql_open_result_set_p( rs ) : rs;
    assert NIL != Types.integerp( i ) : i;
    if( NIL != subl_promotions.negative_integer_p( i ) )
    {
      _csetf_sqlrs_current( rs, Numbers.max( Numbers.add( sqlrs_last( rs ), ONE_INTEGER, i ), ZERO_INTEGER ) );
    }
    else
    {
      _csetf_sqlrs_current( rs, Numbers.min( i, number_utilities.f_1X( sqlrs_last( rs ) ) ) );
    }
    return sqlrs_valid_row_p( rs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42112L)
  public static SubLObject sqlrs_next(final SubLObject rs)
  {
    assert NIL != sql_open_result_set_p( rs ) : rs;
    if( sqlrs_current( rs ).numLE( sqlrs_last( rs ) ) )
    {
      _csetf_sqlrs_current( rs, Numbers.add( sqlrs_current( rs ), ONE_INTEGER ) );
    }
    return Numbers.numLE( sqlrs_current( rs ), sqlrs_last( rs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42414L)
  public static SubLObject sqlrs_previous(final SubLObject rs)
  {
    assert NIL != sql_open_result_set_p( rs ) : rs;
    if( sqlrs_current( rs ).numG( ZERO_INTEGER ) )
    {
      _csetf_sqlrs_current( rs, Numbers.subtract( sqlrs_current( rs ), ONE_INTEGER ) );
    }
    return Numbers.numG( sqlrs_current( rs ), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42632L)
  public static SubLObject sqlrs_is_last(final SubLObject rs)
  {
    assert NIL != sql_open_result_set_p( rs ) : rs;
    return Equality.eql( sqlrs_current( rs ), sqlrs_last( rs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42808L)
  public static SubLObject sqlrs_is_first(final SubLObject rs)
  {
    assert NIL != sql_open_result_set_p( rs ) : rs;
    return Equality.eql( sqlrs_current( rs ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42972L)
  public static SubLObject sqlrs_column_count(final SubLObject rs)
  {
    assert NIL != sql_open_result_set_p( rs ) : rs;
    return sqlrs_row_count( rs ).numG( ZERO_INTEGER ) ? Sequences.length( Vectors.aref( sqlrs_rows( rs ), ZERO_INTEGER ) ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43170L)
  public static SubLObject sqlrs_row_count(final SubLObject rs)
  {
    assert NIL != sql_open_result_set_p( rs ) : rs;
    return sqlrs_last( rs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43309L)
  public static SubLObject sqlrs_get_row(final SubLObject rs)
  {
    assert NIL != sql_open_result_set_p( rs ) : rs;
    return sqlrs_current( rs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43455L)
  public static SubLObject sqlrs_get_object(final SubLObject rs, final SubLObject i)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sql_open_result_set_p( rs ) : rs;
    assert NIL != subl_promotions.positive_integer_p( i ) : i;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == sqlrs_valid_row_p( rs ) )
    {
      Errors.error( $str213$cursor_not_on_valid_row );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == sqlrs_valid_column_p( rs, i ) )
    {
      Errors.error( $str214$invalid_column__a, i );
    }
    if( NIL == sqlrs_row_local_p( rs ) )
    {
      final SubLObject range = sqlrs_block( rs, sqlrs_current( rs ) );
      final SubLObject lo = range.first();
      final SubLObject hi = range.rest();
      final SubLObject rs2 = sqlc_execute( sqlrs_connection( rs ), $get_rows$.getGlobalValue(), ConsesLow.list( sqlrs_id( rs ), lo, hi ) );
      if( NIL != sdbc_error_p( rs2 ) )
      {
        return rs2;
      }
      _csetf_sqlrs_rows( rs, sqlrs_rows( rs2 ) );
      _csetf_sqlrs_start( rs, lo );
    }
    return Vectors.aref( Vectors.aref( sqlrs_rows( rs ), Numbers.subtract( sqlrs_current( rs ), sqlrs_start( rs ) ) ), number_utilities.f_1_( i ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44362L)
  public static SubLObject sqlrs_get_object_tuple(final SubLObject rs)
  {
    assert NIL != sql_open_result_set_p( rs ) : rs;
    final SubLObject columns = sqlrs_column_count( rs );
    final SubLObject tuple = ConsesLow.make_list( columns, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( columns ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      ConsesLow.set_nth( i, tuple, sqlrs_get_object( rs, number_utilities.f_1X( i ) ) );
    }
    return tuple;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44694L)
  public static SubLObject new_sql_result_set(final SubLObject first, final SubLObject rows, final SubLObject row_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( first ) : first;
    assert NIL != Types.vectorp( rows ) : rows;
    assert NIL != subl_promotions.non_negative_integer_p( row_count ) : row_count;
    final SubLObject rs = make_sql_result_set( UNPROVIDED );
    _csetf_sqlrs_start( rs, first );
    _csetf_sqlrs_rows( rs, rows );
    _csetf_sqlrs_current( rs, ZERO_INTEGER );
    _csetf_sqlrs_last( rs, row_count );
    _csetf_sqlrs_connection( rs, T );
    _csetf_sqlrs_block_size( rs, $result_set_block_size$.getDynamicValue( thread ) );
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45617L)
  public static SubLObject sqlrs_closed_p(final SubLObject rs)
  {
    return makeBoolean( NIL == sqlrs_open_p( rs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45753L)
  public static SubLObject sqlrs_open_p(final SubLObject rs)
  {
    return list_utilities.sublisp_boolean( sqlrs_connection( rs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45892L)
  public static SubLObject sqlrs_valid_row_p(final SubLObject rs)
  {
    return makeBoolean( sqlrs_current( rs ).numG( ZERO_INTEGER ) && sqlrs_current( rs ).numLE( sqlrs_last( rs ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46063L)
  public static SubLObject sqlrs_valid_column_p(final SubLObject rs, final SubLObject i)
  {
    return makeBoolean( i.numG( ZERO_INTEGER ) && i.numLE( sqlrs_column_count( rs ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46220L)
  public static SubLObject sqlrs_block(final SubLObject rs, final SubLObject row)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !row.numG( ZERO_INTEGER ) || !row.numLE( sqlrs_last( rs ) ) ) )
    {
      Errors.error( $str217$invalid_row__a, row );
    }
    final SubLObject lo = number_utilities.f_1X( Numbers.multiply( Numbers.floor( number_utilities.f_1_( row ), sqlrs_block_size( rs ) ), $result_set_block_size$.getDynamicValue( thread ) ) );
    final SubLObject hi = Numbers.min( sqlrs_last( rs ), Numbers.add( lo, sqlrs_block_size( rs ), MINUS_ONE_INTEGER ) );
    return ConsesLow.cons( lo, hi );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46618L)
  public static SubLObject sqlrs_row_local_p(final SubLObject rs)
  {
    return makeBoolean( sqlrs_current( rs ).numGE( sqlrs_start( rs ) ) && sqlrs_current( rs ).numL( Numbers.add( sqlrs_start( rs ), sqlrs_block_size( rs ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46870L)
  public static SubLObject sqlrs_row_remote_p(final SubLObject rs)
  {
    return makeBoolean( NIL == sqlrs_row_local_p( rs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47030L)
  public static SubLObject sqlrs_local_close(final SubLObject rs)
  {
    _csetf_sqlrs_rows( rs, NIL );
    _csetf_sqlrs_connection( rs, NIL );
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject sql_statement_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject sql_statement_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sql_statement_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject sqls_connection(final SubLObject v_object)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject sqls_id(final SubLObject v_object)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject sqls_sql(final SubLObject v_object)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject sqls_settings(final SubLObject v_object)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject sqls_batch(final SubLObject v_object)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject sqls_rs(final SubLObject v_object)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject _csetf_sqls_connection(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject _csetf_sqls_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject _csetf_sqls_sql(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject _csetf_sqls_settings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject _csetf_sqls_batch(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject _csetf_sqls_rs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sql_statement_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject make_sql_statement(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sql_statement_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw201$CONNECTION ) )
      {
        _csetf_sqls_connection( v_new, current_value );
      }
      else if( pcase_var.eql( $kw203$ID ) )
      {
        _csetf_sqls_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw238$SQL ) )
      {
        _csetf_sqls_sql( v_new, current_value );
      }
      else if( pcase_var.eql( $kw239$SETTINGS ) )
      {
        _csetf_sqls_settings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw240$BATCH ) )
      {
        _csetf_sqls_batch( v_new, current_value );
      }
      else if( pcase_var.eql( $kw241$RS ) )
      {
        _csetf_sqls_rs( v_new, current_value );
      }
      else
      {
        Errors.error( $str82$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject visit_defstruct_sql_statement(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw83$BEGIN, $sym242$MAKE_SQL_STATEMENT, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw201$CONNECTION, sqls_connection( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw203$ID, sqls_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw238$SQL, sqls_sql( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw239$SETTINGS, sqls_settings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw240$BATCH, sqls_batch( obj ) );
    Functions.funcall( visitor_fn, obj, $kw85$SLOT, $kw241$RS, sqls_rs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw86$END, $sym242$MAKE_SQL_STATEMENT, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47469L)
  public static SubLObject visit_defstruct_object_sql_statement_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sql_statement( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47909L)
  public static SubLObject sqls_open_p(final SubLObject statement)
  {
    assert NIL != sql_statement_p( statement ) : statement;
    return makeBoolean( NIL != sqls_connection( statement ) && NIL != sqlc_open_p( sqls_connection( statement ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48253L)
  public static SubLObject sql_open_statement_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sql_statement_p( v_object ) && NIL != sql_connection_p( sqls_connection( v_object ) ) && NIL != sqlc_open_p( sqls_connection( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48504L)
  public static SubLObject sqls_execute_query(final SubLObject statement, final SubLObject sql, SubLObject block_size)
  {
    if( block_size == UNPROVIDED )
    {
      block_size = $result_set_block_size$.getDynamicValue();
    }
    assert NIL != sql_open_statement_p( statement ) : statement;
    assert NIL != Types.stringp( sql ) : sql;
    assert NIL != subl_promotions.positive_integer_p( block_size ) : block_size;
    final SubLObject rs = sqlc_execute( sqls_connection( statement ), $execute_query$.getGlobalValue(), ConsesLow.list( sqls_id( statement ), sql, block_size ) );
    if( NIL != sql_result_set_p( rs ) )
    {
      _csetf_sqlrs_connection( rs, sqls_connection( statement ) );
      _csetf_sqlrs_id( rs, sqls_id( statement ) );
      _csetf_sqlrs_block_size( rs, block_size );
      if( NIL != sqls_rs( statement ) )
      {
        sqlrs_local_close( sqls_rs( statement ) );
      }
      _csetf_sqls_rs( statement, rs );
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49481L)
  public static SubLObject sqls_execute_update(final SubLObject statement, final SubLObject sql)
  {
    assert NIL != sql_open_statement_p( statement ) : statement;
    assert NIL != Types.stringp( sql ) : sql;
    return sqlc_execute( sqls_connection( statement ), $execute_update$.getGlobalValue(), ConsesLow.list( sqls_id( statement ), sql ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49880L)
  public static SubLObject sqls_cancel(final SubLObject statement)
  {
    assert NIL != sql_open_statement_p( statement ) : statement;
    return sqlc_execute( sqls_connection( statement ), $cancel$.getGlobalValue(), ConsesLow.list( sqls_id( statement ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50334L)
  public static SubLObject sqls_get_generated_keys(final SubLObject statement, SubLObject block_size)
  {
    if( block_size == UNPROVIDED )
    {
      block_size = $result_set_block_size$.getDynamicValue();
    }
    assert NIL != sql_open_statement_p( statement ) : statement;
    assert NIL != subl_promotions.positive_integer_p( block_size ) : block_size;
    final SubLObject rs = sqlc_execute( sqls_connection( statement ), $get_generated_keys$.getGlobalValue(), ConsesLow.list( sqls_id( statement ), block_size ) );
    if( NIL != sql_result_set_p( rs ) )
    {
      _csetf_sqlrs_connection( rs, sqls_connection( statement ) );
      _csetf_sqlrs_id( rs, sqls_id( statement ) );
      _csetf_sqlrs_block_size( rs, block_size );
      if( NIL != sqls_rs( statement ) )
      {
        sqlrs_local_close( sqls_rs( statement ) );
      }
      _csetf_sqls_rs( statement, rs );
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51209L)
  public static SubLObject sqls_close(final SubLObject statement)
  {
    assert NIL != sql_statement_p( statement ) : statement;
    SubLObject result = NIL;
    if( NIL != sqls_open_p( statement ) )
    {
      result = sqlc_execute( sqls_connection( statement ), $close_statement$.getGlobalValue(), ConsesLow.list( sqls_id( statement ) ) );
    }
    sqls_local_close( statement );
    return ( NIL != sdbc_error_p( result ) ) ? result : statement;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51724L)
  public static SubLObject sqls_add_batch(final SubLObject statement, final SubLObject sql)
  {
    assert NIL != sql_open_statement_p( statement ) : statement;
    assert NIL != Types.stringp( sql ) : sql;
    _csetf_sqls_batch( statement, ConsesLow.cons( sql, sqls_batch( statement ) ) );
    return sql;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52158L)
  public static SubLObject sqls_clear_batch(final SubLObject statement)
  {
    assert NIL != sql_open_statement_p( statement ) : statement;
    final SubLObject count = Sequences.length( sqls_batch( statement ) );
    _csetf_sqls_batch( statement, NIL );
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52413L)
  public static SubLObject sqls_execute_batch(final SubLObject statement)
  {
    assert NIL != sql_open_statement_p( statement ) : statement;
    final SubLObject batch = sqls_batch( statement );
    sqls_clear_batch( statement );
    return ( NIL != batch ) ? sqlc_execute( sqls_connection( statement ), $execute_batch$.getGlobalValue(), ConsesLow.list( sqls_id( statement ), Sequences.nreverse( batch ) ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52858L)
  public static SubLObject sql_prepared_statement_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sql_statement_p( v_object ) && NIL != sqls_sql( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53063L)
  public static SubLObject sql_prepared_open_statement_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sql_open_statement_p( v_object ) && NIL != sqls_sql( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53259L)
  public static SubLObject sqlps_execute_query(final SubLObject statement, SubLObject block_size)
  {
    if( block_size == UNPROVIDED )
    {
      block_size = $result_set_block_size$.getDynamicValue();
    }
    assert NIL != sql_prepared_open_statement_p( statement ) : statement;
    assert NIL != subl_promotions.positive_integer_p( block_size ) : block_size;
    if( NIL != sqls_rs( statement ) )
    {
      sqlrs_close( sqls_rs( statement ) );
    }
    final SubLObject settings = sqls_settings( statement );
    final SubLObject rs = sqlc_execute( sqls_connection( statement ), $ps_execute_query$.getGlobalValue(), ConsesLow.list( sqls_id( statement ), Sequences.nreverse( settings ), block_size ) );
    _csetf_sqls_settings( statement, NIL );
    _csetf_sqlrs_connection( rs, sqls_connection( statement ) );
    _csetf_sqlrs_id( rs, sqls_id( statement ) );
    _csetf_sqlrs_block_size( rs, block_size );
    if( NIL != sqls_rs( statement ) )
    {
      sqlrs_local_close( sqls_rs( statement ) );
    }
    _csetf_sqls_rs( statement, rs );
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54372L)
  public static SubLObject sqlps_execute_update(final SubLObject statement)
  {
    assert NIL != sql_prepared_open_statement_p( statement ) : statement;
    final SubLObject settings = sqls_settings( statement );
    _csetf_sqls_settings( statement, NIL );
    return sqlc_execute( sqls_connection( statement ), $ps_execute_update$.getGlobalValue(), ConsesLow.list( sqls_id( statement ), Sequences.nreverse( settings ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54805L)
  public static SubLObject sqlps_set_bytes(final SubLObject statement, final SubLObject parameter, final SubLObject bytes)
  {
    assert NIL != sql_prepared_open_statement_p( statement ) : statement;
    assert NIL != subl_promotions.non_negative_integer_p( parameter ) : parameter;
    assert NIL != vector_utilities.byte_vector_p( bytes ) : bytes;
    return sqlps_set( statement, $set_bytes$.getGlobalValue(), parameter, bytes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55207L)
  public static SubLObject sqlps_set_int(final SubLObject statement, final SubLObject parameter, final SubLObject v_int)
  {
    assert NIL != sql_prepared_open_statement_p( statement ) : statement;
    assert NIL != subl_promotions.non_negative_integer_p( parameter ) : parameter;
    assert NIL != java_integerp( v_int ) : v_int;
    return sqlps_set( statement, $set_int$.getGlobalValue(), parameter, v_int );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55590L)
  public static SubLObject sqlps_set_long(final SubLObject statement, final SubLObject parameter, final SubLObject v_long)
  {
    assert NIL != sql_prepared_open_statement_p( statement ) : statement;
    assert NIL != subl_promotions.non_negative_integer_p( parameter ) : parameter;
    assert NIL != java_longp( v_long ) : v_long;
    return sqlps_set( statement, $set_long$.getGlobalValue(), parameter, v_long );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55975L)
  public static SubLObject sqlps_set_float(final SubLObject statement, final SubLObject parameter, final SubLObject v_float)
  {
    assert NIL != sql_prepared_open_statement_p( statement ) : statement;
    assert NIL != subl_promotions.non_negative_integer_p( parameter ) : parameter;
    assert NIL != java_floatp( v_float ) : v_float;
    return sqlps_set( statement, $set_float$.getGlobalValue(), parameter, v_float );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56366L)
  public static SubLObject sqlps_set_double(final SubLObject statement, final SubLObject parameter, final SubLObject v_double)
  {
    assert NIL != sql_prepared_open_statement_p( statement ) : statement;
    assert NIL != subl_promotions.non_negative_integer_p( parameter ) : parameter;
    assert NIL != java_doublep( v_double ) : v_double;
    return sqlps_set( statement, $set_double$.getGlobalValue(), parameter, v_double );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56763L)
  public static SubLObject sqlps_set_string(final SubLObject statement, final SubLObject parameter, final SubLObject string)
  {
    assert NIL != sql_prepared_open_statement_p( statement ) : statement;
    assert NIL != subl_promotions.non_negative_integer_p( parameter ) : parameter;
    assert NIL != Types.stringp( string ) : string;
    return sqlps_set( statement, $set_string$.getGlobalValue(), parameter, string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57157L)
  public static SubLObject new_sql_statement(final SubLObject connection)
  {
    SubLObject statement = make_sql_statement( UNPROVIDED );
    SubLObject result = NIL;
    _csetf_sqls_connection( statement, connection );
    _csetf_sqls_id( statement, new_statement_id() );
    result = sqlc_execute( connection, $create_statement$.getGlobalValue(), ConsesLow.list( sqls_id( statement ) ) );
    if( NIL != sdbc_error_p( result ) )
    {
      statement = result;
    }
    return statement;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57714L)
  public static SubLObject sqls_get_connection(final SubLObject statement)
  {
    assert NIL != sql_statement_p( statement ) : statement;
    return sqls_connection( statement );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57969L)
  public static SubLObject sqls_local_close(final SubLObject statement)
  {
    if( NIL != sqls_rs( statement ) )
    {
      sqlrs_local_close( sqls_rs( statement ) );
      _csetf_sqls_rs( statement, NIL );
    }
    if( NIL != sqls_connection( statement ) )
    {
      _csetf_sqlc_statements( sqls_connection( statement ), Sequences.remove( statement, sqlc_statements( sqls_connection( statement ) ), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      _csetf_sqls_connection( statement, NIL );
    }
    return statement;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58583L)
  public static SubLObject sqlps_set(final SubLObject statement, final SubLObject command, final SubLObject parameter, final SubLObject data)
  {
    final SubLObject setting = ConsesLow.list( command, parameter, data );
    _csetf_sqls_settings( statement, ConsesLow.cons( setting, sqls_settings( statement ) ) );
    return setting;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58991L)
  public static SubLObject new_sql_prepared_statement(final SubLObject connection, final SubLObject sql)
  {
    SubLObject statement = make_sql_statement( UNPROVIDED );
    SubLObject result = NIL;
    _csetf_sqls_connection( statement, connection );
    _csetf_sqls_id( statement, new_statement_id() );
    _csetf_sqls_sql( statement, sql );
    result = sqlc_execute( sqls_connection( statement ), $prepare_statement$.getGlobalValue(), ConsesLow.list( sqls_id( statement ), sql ) );
    if( NIL != sdbc_error_p( result ) )
    {
      statement = result;
    }
    return statement;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59643L)
  public static SubLObject new_statement_id()
  {
    return print_high.princ_to_string( Symbols.gensym( $str252$STMT ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59764L)
  public static SubLObject new_result_set_id()
  {
    return print_high.princ_to_string( Symbols.gensym( $str253$RS ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59885L)
  public static SubLObject sqlc_get_tables(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject types)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sql_open_connection_p( connection ) : connection;
    assert NIL != Types.stringp( schema_pattern ) : schema_pattern;
    assert NIL != Types.stringp( table_name_pattern ) : table_name_pattern;
    assert NIL != Types.listp( types ) : types;
    final SubLObject rs = sqlc_execute( connection, $get_tables$.getGlobalValue(), ConsesLow.list( catalog, schema_pattern, table_name_pattern, types, $result_set_block_size$.getDynamicValue( thread ) ) );
    if( NIL != sql_result_set_p( rs ) )
    {
      _csetf_sqlrs_connection( rs, connection );
      _csetf_sqlrs_id( rs, $connection_id$.getGlobalValue() );
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61329L)
  public static SubLObject sqlc_get_tables_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject types)
  {
    final SubLObject result_set = Functions.apply( $sym255$SQLC_GET_TABLES, ConsesLow.list( connection, catalog, schema_pattern, table_name_pattern, types ) );
    if( NIL == sql_result_set_p( result_set ) )
    {
      Errors.warn( $str256$SQLC_error___A, result_set );
      return NIL;
    }
    final SubLObject column_count = sqlrs_column_count( result_set );
    SubLObject results = NIL;
    while ( NIL == sqlrs_is_last( result_set ))
    {
      sqlrs_next( result_set );
      SubLObject i = ZERO_INTEGER;
      SubLObject v_bindings = NIL;
      SubLObject cdolist_list_var = $list257;
      SubLObject key = NIL;
      key = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        i = Numbers.add( i, ONE_INTEGER );
        if( i.numLE( column_count ) )
        {
          v_bindings = ConsesLow.cons( key, v_bindings );
          v_bindings = ConsesLow.cons( sqlrs_get_object( result_set, i ), v_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        key = cdolist_list_var.first();
      }
      results = ConsesLow.cons( Sequences.nreverse( v_bindings ), results );
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61624L)
  public static SubLObject sqlc_get_columns(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject column_name_pattern)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sql_open_connection_p( connection ) : connection;
    assert NIL != Types.stringp( catalog ) : catalog;
    assert NIL != Types.stringp( schema_pattern ) : schema_pattern;
    assert NIL != Types.stringp( table_name_pattern ) : table_name_pattern;
    assert NIL != Types.stringp( column_name_pattern ) : column_name_pattern;
    final SubLObject rs = sqlc_execute( connection, $get_columns$.getGlobalValue(), ConsesLow.list( catalog, schema_pattern, table_name_pattern, column_name_pattern, $result_set_block_size$.getDynamicValue( thread ) ) );
    if( NIL != sql_result_set_p( rs ) )
    {
      _csetf_sqlrs_connection( rs, connection );
      _csetf_sqlrs_id( rs, $connection_id$.getGlobalValue() );
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63142L)
  public static SubLObject sqlc_get_columns_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject column_name_pattern)
  {
    final SubLObject result_set = Functions.apply( $sym258$SQLC_GET_COLUMNS, ConsesLow.list( connection, catalog, schema_pattern, table_name_pattern, column_name_pattern ) );
    if( NIL == sql_result_set_p( result_set ) )
    {
      Errors.warn( $str256$SQLC_error___A, result_set );
      return NIL;
    }
    final SubLObject column_count = sqlrs_column_count( result_set );
    SubLObject results = NIL;
    while ( NIL == sqlrs_is_last( result_set ))
    {
      sqlrs_next( result_set );
      SubLObject i = ZERO_INTEGER;
      SubLObject v_bindings = NIL;
      SubLObject cdolist_list_var = $list259;
      SubLObject key = NIL;
      key = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        i = Numbers.add( i, ONE_INTEGER );
        if( i.numLE( column_count ) )
        {
          v_bindings = ConsesLow.cons( key, v_bindings );
          v_bindings = ConsesLow.cons( sqlrs_get_object( result_set, i ), v_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        key = cdolist_list_var.first();
      }
      results = ConsesLow.cons( Sequences.nreverse( v_bindings ), results );
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63657L)
  public static SubLObject sqlc_get_primary_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( catalog ) : catalog;
    assert NIL != Types.stringp( schema ) : schema;
    assert NIL != Types.stringp( table ) : table;
    final SubLObject rs = sqlc_execute( connection, $get_primary_keys$.getGlobalValue(), ConsesLow.list( catalog, schema, table, $result_set_block_size$.getDynamicValue( thread ) ) );
    if( NIL != sql_result_set_p( rs ) )
    {
      _csetf_sqlrs_connection( rs, connection );
      _csetf_sqlrs_id( rs, $connection_id$.getGlobalValue() );
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64825L)
  public static SubLObject sqlc_get_primary_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table)
  {
    final SubLObject result_set = Functions.apply( $sym260$SQLC_GET_PRIMARY_KEYS, ConsesLow.list( connection, catalog, schema, table ) );
    if( NIL == sql_result_set_p( result_set ) )
    {
      Errors.warn( $str256$SQLC_error___A, result_set );
      return NIL;
    }
    final SubLObject column_count = sqlrs_column_count( result_set );
    SubLObject results = NIL;
    while ( NIL == sqlrs_is_last( result_set ))
    {
      sqlrs_next( result_set );
      SubLObject i = ZERO_INTEGER;
      SubLObject v_bindings = NIL;
      SubLObject cdolist_list_var = $list261;
      SubLObject key = NIL;
      key = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        i = Numbers.add( i, ONE_INTEGER );
        if( i.numLE( column_count ) )
        {
          v_bindings = ConsesLow.cons( key, v_bindings );
          v_bindings = ConsesLow.cons( sqlrs_get_object( result_set, i ), v_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        key = cdolist_list_var.first();
      }
      results = ConsesLow.cons( Sequences.nreverse( v_bindings ), results );
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65024L)
  public static SubLObject sqlc_get_imported_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( catalog ) : catalog;
    assert NIL != Types.stringp( schema ) : schema;
    assert NIL != Types.stringp( table ) : table;
    final SubLObject rs = sqlc_execute( connection, $get_imported_keys$.getGlobalValue(), ConsesLow.list( catalog, schema, table, $result_set_block_size$.getDynamicValue( thread ) ) );
    if( NIL != sql_result_set_p( rs ) )
    {
      _csetf_sqlrs_connection( rs, connection );
      _csetf_sqlrs_id( rs, $connection_id$.getGlobalValue() );
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66270L)
  public static SubLObject sqlc_get_imported_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table)
  {
    final SubLObject result_set = Functions.apply( $sym262$SQLC_GET_IMPORTED_KEYS, ConsesLow.list( connection, catalog, schema, table ) );
    if( NIL == sql_result_set_p( result_set ) )
    {
      Errors.warn( $str256$SQLC_error___A, result_set );
      return NIL;
    }
    final SubLObject column_count = sqlrs_column_count( result_set );
    SubLObject results = NIL;
    while ( NIL == sqlrs_is_last( result_set ))
    {
      sqlrs_next( result_set );
      SubLObject i = ZERO_INTEGER;
      SubLObject v_bindings = NIL;
      SubLObject cdolist_list_var = $list263;
      SubLObject key = NIL;
      key = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        i = Numbers.add( i, ONE_INTEGER );
        if( i.numLE( column_count ) )
        {
          v_bindings = ConsesLow.cons( key, v_bindings );
          v_bindings = ConsesLow.cons( sqlrs_get_object( result_set, i ), v_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        key = cdolist_list_var.first();
      }
      results = ConsesLow.cons( Sequences.nreverse( v_bindings ), results );
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66610L)
  public static SubLObject sqlc_get_exported_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sql_open_connection_p( connection ) : connection;
    assert NIL != Types.stringp( catalog ) : catalog;
    assert NIL != Types.stringp( schema ) : schema;
    assert NIL != Types.stringp( table ) : table;
    final SubLObject rs = sqlc_execute( connection, $get_exported_keys$.getGlobalValue(), ConsesLow.list( catalog, schema, table, $result_set_block_size$.getDynamicValue( thread ) ) );
    if( NIL != sql_result_set_p( rs ) )
    {
      _csetf_sqlrs_connection( rs, connection );
      _csetf_sqlrs_id( rs, $connection_id$.getGlobalValue() );
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68329L)
  public static SubLObject sqlc_get_exported_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table)
  {
    final SubLObject result_set = Functions.apply( $sym264$SQLC_GET_EXPORTED_KEYS, ConsesLow.list( connection, catalog, schema, table ) );
    if( NIL == sql_result_set_p( result_set ) )
    {
      Errors.warn( $str256$SQLC_error___A, result_set );
      return NIL;
    }
    final SubLObject column_count = sqlrs_column_count( result_set );
    SubLObject results = NIL;
    while ( NIL == sqlrs_is_last( result_set ))
    {
      sqlrs_next( result_set );
      SubLObject i = ZERO_INTEGER;
      SubLObject v_bindings = NIL;
      SubLObject cdolist_list_var = $list263;
      SubLObject key = NIL;
      key = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        i = Numbers.add( i, ONE_INTEGER );
        if( i.numLE( column_count ) )
        {
          v_bindings = ConsesLow.cons( key, v_bindings );
          v_bindings = ConsesLow.cons( sqlrs_get_object( result_set, i ), v_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        key = cdolist_list_var.first();
      }
      results = ConsesLow.cons( Sequences.nreverse( v_bindings ), results );
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68670L)
  public static SubLObject sqlc_get_index_info(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table, final SubLObject unique, final SubLObject approximate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sql_open_connection_p( connection ) : connection;
    assert NIL != Types.stringp( catalog ) : catalog;
    assert NIL != Types.stringp( schema ) : schema;
    assert NIL != Types.stringp( table ) : table;
    assert NIL != Types.booleanp( unique ) : unique;
    assert NIL != Types.booleanp( approximate ) : approximate;
    final SubLObject rs = sqlc_execute( connection, $get_index_info$.getGlobalValue(), ConsesLow.list( catalog, schema, table, unique, approximate, $result_set_block_size$.getDynamicValue( thread ) ) );
    if( NIL != sql_result_set_p( rs ) )
    {
      _csetf_sqlrs_connection( rs, connection );
      _csetf_sqlrs_id( rs, $connection_id$.getGlobalValue() );
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70282L)
  public static SubLObject sqlc_get_index_info_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table, final SubLObject unique, final SubLObject approximate)
  {
    final SubLObject result_set = Functions.apply( $sym265$SQLC_GET_INDEX_INFO, ConsesLow.list( connection, catalog, schema, table, unique, approximate ) );
    if( NIL == sql_result_set_p( result_set ) )
    {
      Errors.warn( $str256$SQLC_error___A, result_set );
      return NIL;
    }
    final SubLObject column_count = sqlrs_column_count( result_set );
    SubLObject results = NIL;
    while ( NIL == sqlrs_is_last( result_set ))
    {
      sqlrs_next( result_set );
      SubLObject i = ZERO_INTEGER;
      SubLObject v_bindings = NIL;
      SubLObject cdolist_list_var = $list266;
      SubLObject key = NIL;
      key = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        i = Numbers.add( i, ONE_INTEGER );
        if( i.numLE( column_count ) )
        {
          v_bindings = ConsesLow.cons( key, v_bindings );
          v_bindings = ConsesLow.cons( sqlrs_get_object( result_set, i ), v_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        key = cdolist_list_var.first();
      }
      results = ConsesLow.cons( Sequences.nreverse( v_bindings ), results );
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70615L)
  public static SubLObject sqlc_get_max_connections(final SubLObject connection)
  {
    assert NIL != sql_open_connection_p( connection ) : connection;
    return sqlc_execute( connection, $get_max_connections$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70948L)
  public static SubLObject sdbc_error_handling_tag_p(final SubLObject v_object)
  {
    return conses_high.member( v_object, $list267, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 71176L)
  public static SubLObject new_db_url(final SubLObject dbms_server, final SubLObject db, final SubLObject user, final SubLObject password, final SubLObject subprotocol, SubLObject port)
  {
    if( port == UNPROVIDED )
    {
      port = NIL;
    }
    if( NIL != Strings.string_equal( string_utilities.string_first_n( EIGHT_INTEGER, subprotocol ), $str268$com_cyc_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return PrintLow.format( NIL, $str269$_a__a__a, new SubLObject[] { $sql_protocol$.getGlobalValue(), subprotocol, db
      } );
    }
    SubLObject v_properties = ConsesLow.list( new SubLObject[] { $kw270$SUB_PROTOCOL, subprotocol, $kw72$DBMS_SERVER, dbms_server, $kw271$DATABASE, db, $kw71$USER, user, $kw272$PASSWORD, password
    } );
    if( NIL != subl_promotions.non_negative_integer_p( port ) )
    {
      v_properties = conses_high.putf( v_properties, $kw73$PORT, port );
    }
    return construct_new_database_connection_url( subprotocol, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74674L)
  public static SubLObject add_sdbc_database_connection_url_description(final SubLObject sub_protocol, final SubLObject pattern, final SubLObject option_names, final SubLObject option_punctuation,
      final SubLObject defaults)
  {
    assert NIL != Types.stringp( sub_protocol ) : sub_protocol;
    assert NIL != Types.consp( pattern ) : pattern;
    assert NIL != list_utilities.property_list_p( option_names ) : option_names;
    assert NIL != list_utilities.property_list_p( option_punctuation ) : option_punctuation;
    assert NIL != list_utilities.property_list_p( defaults ) : defaults;
    final SubLObject description = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    map_utilities.map_put( description, $kw285$DEFAULTS, defaults );
    map_utilities.map_put( description, $kw286$PATTERN, pattern );
    map_utilities.map_put( description, $kw287$OPTION_PUNCTUATION, compile_db_conn_url_punctuation_info( option_punctuation ) );
    map_utilities.map_put( description, $kw288$OPTION_NAMES, option_names );
    map_utilities.map_put( $sdbc_database_connection_url_descriptions$.getGlobalValue(), sub_protocol, description );
    return sub_protocol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75923L)
  public static SubLObject get_all_sdbc_database_sub_protocols()
  {
    return map_utilities.map_keys( $sdbc_database_connection_url_descriptions$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76093L)
  public static SubLObject compile_db_conn_url_punctuation_info(final SubLObject option_punctuation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == option_punctuation )
    {
      return NIL;
    }
    SubLObject final_punctuation = conses_high.copy_list( option_punctuation );
    if( $kw290$UNDEFINED == conses_high.getf( final_punctuation, $kw291$TERMINATOR, $kw290$UNDEFINED ) )
    {
      final_punctuation = conses_high.putf( final_punctuation, $kw291$TERMINATOR, $str169$ );
    }
    if( $kw292$SEPARATOR == conses_high.getf( final_punctuation, $kw200$START, $kw292$SEPARATOR ) )
    {
      final SubLObject separator = conses_high.getf( final_punctuation, $kw292$SEPARATOR, $kw290$UNDEFINED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !separator.isString() )
      {
        Errors.error( $str293$Separator_must_be_defined_as_stri, separator );
      }
      final_punctuation = conses_high.putf( final_punctuation, $kw200$START, separator );
    }
    final SubLObject value = conses_high.getf( final_punctuation, $kw294$VALUE, $kw290$UNDEFINED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !value.isString() )
    {
      Errors.error( $str295$Value_demarcator_must_be_specifie, value );
    }
    return final_punctuation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77143L)
  public static SubLObject register_sdbc_database_connection_url_description(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list296 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list296 );
      if( NIL == conses_high.member( current_$9, $list297, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw96$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list296 );
    }
    final SubLObject sub_protocol_tail = cdestructuring_bind.property_list_member( $kw270$SUB_PROTOCOL, current );
    final SubLObject sub_protocol = ( NIL != sub_protocol_tail ) ? conses_high.cadr( sub_protocol_tail ) : NIL;
    final SubLObject pattern_tail = cdestructuring_bind.property_list_member( $kw286$PATTERN, current );
    final SubLObject pattern = ( NIL != pattern_tail ) ? conses_high.cadr( pattern_tail ) : NIL;
    final SubLObject option_names_tail = cdestructuring_bind.property_list_member( $kw288$OPTION_NAMES, current );
    final SubLObject option_names = ( NIL != option_names_tail ) ? conses_high.cadr( option_names_tail ) : NIL;
    final SubLObject option_punctuation_tail = cdestructuring_bind.property_list_member( $kw287$OPTION_PUNCTUATION, current );
    final SubLObject option_punctuation = ( NIL != option_punctuation_tail ) ? conses_high.cadr( option_punctuation_tail ) : NIL;
    final SubLObject defaults_tail = cdestructuring_bind.property_list_member( $kw285$DEFAULTS, current );
    final SubLObject defaults = ( NIL != defaults_tail ) ? conses_high.cadr( defaults_tail ) : NIL;
    return ConsesLow.list( $sym298$ADD_SDBC_DATABASE_CONNECTION_URL_DESCRIPTION, sub_protocol, pattern, option_names, option_punctuation, defaults );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81592L)
  public static SubLObject set_sdbc_db2_port(final SubLObject port)
  {
    enforceType( port, $sym215$NON_NEGATIVE_INTEGER_P );
    $sdbc_db2_port$.setGlobalValue( port );
    return $sdbc_db2_port$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81736L)
  public static SubLObject sdbc_db2_port()
  {
    return $sdbc_db2_port$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82292L)
  public static SubLObject set_sdbc_sybase_iq_port(final SubLObject port)
  {
    enforceType( port, $sym215$NON_NEGATIVE_INTEGER_P );
    $sdbc_sybase_iq_port$.setGlobalValue( port );
    return $sdbc_sybase_iq_port$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82454L)
  public static SubLObject sdbc_sybase_iq_port()
  {
    return $sdbc_sybase_iq_port$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82875L)
  public static SubLObject construct_new_database_connection_url(final SubLObject sub_protocol, SubLObject v_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.property_list_p( v_properties ) : v_properties;
    final SubLObject description = map_utilities.map_get( $sdbc_database_connection_url_descriptions$.getGlobalValue(), sub_protocol, $kw290$UNDEFINED );
    SubLObject result = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == map_utilities.map_p( description ) )
    {
      Errors.error( $str345$unknown_jdbc_subprotocol___a, sub_protocol );
    }
    if( !sub_protocol.equal( conses_high.getf( v_properties, $kw270$SUB_PROTOCOL, UNPROVIDED ) ) )
    {
      v_properties = ConsesLow.cons( $kw270$SUB_PROTOCOL, ConsesLow.cons( sub_protocol, v_properties ) );
    }
    if( !conses_high.getf( v_properties, $kw346$PROTOCOL, $kw347$NOT_FOUND ).isString() )
    {
      v_properties = ConsesLow.cons( $kw346$PROTOCOL, ConsesLow.cons( $sql_protocol$.getGlobalValue(), v_properties ) );
    }
    final SubLObject pattern = map_utilities.map_get( description, $kw286$PATTERN, UNPROVIDED );
    final SubLObject defaults = map_utilities.map_get( description, $kw285$DEFAULTS, UNPROVIDED );
    final SubLObject option_names = map_utilities.map_get( description, $kw288$OPTION_NAMES, UNPROVIDED );
    final SubLObject option_punctuation = map_utilities.map_get( description, $kw287$OPTION_PUNCTUATION, UNPROVIDED );
    final SubLObject url_stream = streams_high.make_string_output_stream();
    construct_new_dbconn_url_required( url_stream, pattern, v_properties, defaults );
    append_dbconn_url_options( url_stream, option_names, option_punctuation, v_properties, defaults );
    result = streams_high.get_output_stream_string( url_stream );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 84342L)
  public static SubLObject construct_new_dbconn_url_required(final SubLObject url_stream, final SubLObject pattern, final SubLObject v_properties, final SubLObject defaults)
  {
    SubLObject cdolist_list_var = pattern;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( element.isString() )
      {
        streams_high.write_string( element, url_stream, UNPROVIDED, UNPROVIDED );
      }
      else if( element.isKeyword() )
      {
        print_high.princ( resolve_dbconn_url_reference( element, v_properties, defaults ), url_stream );
      }
      else if( element.isCons() )
      {
        SubLObject current;
        final SubLObject datum = current = element;
        SubLObject functor = NIL;
        SubLObject item = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list348 );
        functor = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list348 );
        item = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject value = resolve_dbconn_url_reference( item, v_properties, defaults );
          SubLObject result = NIL;
          final SubLObject pcase_var = functor;
          if( pcase_var.eql( $kw349$UPCASE ) )
          {
            result = Strings.string_upcase( string_utilities.to_string( value ), UNPROVIDED, UNPROVIDED );
          }
          else
          {
            Errors.error( $str350$Functor__A_not_implemented_yet_, functor );
          }
          streams_high.write_string( result, url_stream, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list348 );
        }
      }
      else
      {
        Errors.error( $str351$Pattern__S_contains__S__which_is_, pattern, element );
      }
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return url_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85220L)
  public static SubLObject resolve_dbconn_url_reference(final SubLObject element, final SubLObject v_properties, final SubLObject defaults)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( element.isString() )
    {
      return element;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !element.isKeyword() )
    {
      Errors.error( $str352$Element__A_is_neither_a_STRINGP_n, element );
    }
    final SubLObject default_value = conses_high.getf( defaults, element, $kw347$NOT_FOUND );
    SubLObject value = conses_high.getf( v_properties, element, default_value );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw347$NOT_FOUND == value )
    {
      Errors.error( $str353$No_value_provided_for__S_in_eithe, element, v_properties, defaults );
    }
    if( value.isSymbol() && !value.isKeyword() && NIL != Symbols.boundp( value ) )
    {
      value = Symbols.symbol_value( value );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85907L)
  public static SubLObject append_dbconn_url_options(final SubLObject url_stream, final SubLObject option_names, final SubLObject option_punctuation, final SubLObject v_properties, final SubLObject defaults)
  {
    SubLObject written = ZERO_INTEGER;
    SubLObject remainder;
    SubLObject option_keyword;
    SubLObject option_name;
    SubLObject default_value;
    SubLObject value;
    for( remainder = NIL, remainder = option_names; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      option_keyword = remainder.first();
      option_name = conses_high.cadr( remainder );
      default_value = conses_high.getf( defaults, option_keyword, $kw347$NOT_FOUND );
      value = conses_high.getf( v_properties, option_keyword, default_value );
      if( NIL != value && NIL == string_utilities.empty_string_p( value ) && $kw347$NOT_FOUND != value )
      {
        write_dbconn_url_punctuation( url_stream, option_punctuation, written.isZero() ? $kw200$START : $kw292$SEPARATOR );
        streams_high.write_string( option_name, url_stream, UNPROVIDED, UNPROVIDED );
        write_dbconn_url_punctuation( url_stream, option_punctuation, $kw294$VALUE );
        print_high.princ( value, url_stream );
        written = Numbers.add( written, ONE_INTEGER );
      }
    }
    if( !written.isZero() )
    {
      write_dbconn_url_punctuation( url_stream, option_punctuation, $kw291$TERMINATOR );
    }
    return url_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86889L)
  public static SubLObject write_dbconn_url_punctuation(final SubLObject url_stream, final SubLObject punctuation, final SubLObject key)
  {
    streams_high.write_string( conses_high.getf( punctuation, key, $str169$ ), url_stream, UNPROVIDED, UNPROVIDED );
    return url_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87038L)
  public static SubLObject java_integerp(final SubLObject number)
  {
    return makeBoolean( number.isInteger() && number.numG( $int354$_2147483649 ) && number.numL( $int355$2147483648 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87244L)
  public static SubLObject java_longp(final SubLObject number)
  {
    return makeBoolean( number.isInteger() && number.numG( $int356$_9223372036854775809 ) && number.numL( $int357$9223372036854775808 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87390L)
  public static SubLObject java_floatp(final SubLObject number)
  {
    return Types.floatp( number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87453L)
  public static SubLObject java_doublep(final SubLObject number)
  {
    return Types.floatp( number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87517L)
  public static SubLObject with_sql_connection(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject connection = NIL;
    SubLObject db = NIL;
    SubLObject user = NIL;
    SubLObject password = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    connection = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    db = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    user = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    password = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list358 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list358 );
      if( NIL == conses_high.member( current_$10, $list359, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw96$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list358 );
    }
    final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member( $kw72$DBMS_SERVER, current );
    final SubLObject dbms_server = ( NIL != dbms_server_tail ) ? conses_high.cadr( dbms_server_tail ) : $sym1$_DBMS_SERVER_;
    final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw73$PORT, current );
    final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $sym7$_SQL_PORT_;
    final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member( $kw77$SUBPROTOCOL, current );
    final SubLObject subprotocol = ( NIL != subprotocol_tail ) ? conses_high.cadr( subprotocol_tail ) : $sym360$_SQL_SUBPROTOCOL_;
    final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member( $kw78$PROXY_SERVER, current );
    final SubLObject proxy_server = ( NIL != proxy_server_tail ) ? conses_high.cadr( proxy_server_tail ) : dbms_server;
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw98$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : $sym361$_SQL_CONNECTION_TIMEOUT_;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym362$CLET, ConsesLow.list( connection ), ConsesLow.list( $sym363$CUNWIND_PROTECT, ConsesLow.listS( $sym364$PROGN, ConsesLow.list( $sym365$CSETQ, connection, ConsesLow.list(
        $sym366$NEW_SQL_CONNECTION, db, user, password, ConsesLow.list( new SubLObject[]
        { $sym367$LIST, $kw72$DBMS_SERVER, dbms_server, $kw73$PORT, port, $kw77$SUBPROTOCOL, subprotocol, $kw78$PROXY_SERVER, proxy_server, $kw98$TIMEOUT, timeout
        } ) ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym368$PWHEN, ConsesLow.list( $sym38$SQL_CONNECTION_P, connection ), ConsesLow.list( $sym369$SQLC_CLOSE, connection ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 88385L)
  public static SubLObject with_sql_statement(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list370 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject statement = NIL;
    SubLObject db = NIL;
    SubLObject user = NIL;
    SubLObject password = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list370 );
    statement = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list370 );
    db = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list370 );
    user = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list370 );
    password = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list370 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list370 );
      if( NIL == conses_high.member( current_$11, $list359, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw96$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list370 );
    }
    final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member( $kw72$DBMS_SERVER, current );
    final SubLObject dbms_server = ( NIL != dbms_server_tail ) ? conses_high.cadr( dbms_server_tail ) : $sym1$_DBMS_SERVER_;
    final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw73$PORT, current );
    final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $sym7$_SQL_PORT_;
    final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member( $kw77$SUBPROTOCOL, current );
    final SubLObject subprotocol = ( NIL != subprotocol_tail ) ? conses_high.cadr( subprotocol_tail ) : $sym360$_SQL_SUBPROTOCOL_;
    final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member( $kw78$PROXY_SERVER, current );
    final SubLObject proxy_server = ( NIL != proxy_server_tail ) ? conses_high.cadr( proxy_server_tail ) : dbms_server;
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw98$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : $sym361$_SQL_CONNECTION_TIMEOUT_;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject connection = $sym371$CONNECTION;
    return ConsesLow.list( $sym362$CLET, ConsesLow.list( statement ), ConsesLow.listS( $sym372$WITH_SQL_CONNECTION, ConsesLow.list( new SubLObject[] { connection, db, user, password, $kw72$DBMS_SERVER, dbms_server,
      $kw73$PORT, port, $kw77$SUBPROTOCOL, subprotocol, $kw78$PROXY_SERVER, proxy_server, $kw98$TIMEOUT, timeout
    } ), ConsesLow.list( $sym373$PIF, ConsesLow.list( $sym106$SQL_OPEN_CONNECTION_P, connection ), ConsesLow.list( $sym365$CSETQ, statement, ConsesLow.list( $sym374$SQLC_CREATE_STATEMENT, connection ) ), ConsesLow.list(
        $sym365$CSETQ, statement, connection ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 89253L)
  public static SubLObject with_prepared_sql_statement(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject statement = NIL;
    SubLObject sql = NIL;
    SubLObject db = NIL;
    SubLObject user = NIL;
    SubLObject password = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
    statement = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
    sql = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
    db = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
    user = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
    password = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list375 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list375 );
      if( NIL == conses_high.member( current_$12, $list359, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw96$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list375 );
    }
    final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member( $kw72$DBMS_SERVER, current );
    final SubLObject dbms_server = ( NIL != dbms_server_tail ) ? conses_high.cadr( dbms_server_tail ) : $sym1$_DBMS_SERVER_;
    final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw73$PORT, current );
    final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $sym7$_SQL_PORT_;
    final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member( $kw77$SUBPROTOCOL, current );
    final SubLObject subprotocol = ( NIL != subprotocol_tail ) ? conses_high.cadr( subprotocol_tail ) : $sym360$_SQL_SUBPROTOCOL_;
    final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member( $kw78$PROXY_SERVER, current );
    final SubLObject proxy_server = ( NIL != proxy_server_tail ) ? conses_high.cadr( proxy_server_tail ) : dbms_server;
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw98$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : $sym361$_SQL_CONNECTION_TIMEOUT_;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject connection = $sym376$CONNECTION;
    return ConsesLow.list( $sym362$CLET, ConsesLow.list( statement ), ConsesLow.listS( $sym372$WITH_SQL_CONNECTION, ConsesLow.list( new SubLObject[] { connection, db, user, password, $kw72$DBMS_SERVER, dbms_server,
      $kw73$PORT, port, $kw77$SUBPROTOCOL, subprotocol, $kw78$PROXY_SERVER, proxy_server, $kw98$TIMEOUT, timeout
    } ), ConsesLow.list( $sym373$PIF, ConsesLow.list( $sym106$SQL_OPEN_CONNECTION_P, connection ), ConsesLow.list( $sym365$CSETQ, statement, ConsesLow.list( $sym377$SQLC_PREPARE_STATEMENT, connection, sql ) ), ConsesLow
        .list( $sym365$CSETQ, statement, connection ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 90140L)
  public static SubLObject sqls_execute_transaction(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list378 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject statement = NIL;
    SubLObject error = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list378 );
    statement = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list378 );
    error = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject connection = $sym379$CONNECTION;
      final SubLObject auto_commit = $sym380$AUTO_COMMIT;
      final SubLObject commit_error = $sym381$COMMIT_ERROR;
      final SubLObject rollback_result = $sym382$ROLLBACK_RESULT;
      final SubLObject auto_commit_result = $sym383$AUTO_COMMIT_RESULT;
      final SubLObject errors = $sym384$ERRORS;
      return ConsesLow.list( $sym364$PROGN, ConsesLow.list( $sym362$CLET, ConsesLow.list( ConsesLow.list( connection, ConsesLow.list( $sym251$SQLS_GET_CONNECTION, statement ) ), ConsesLow.list( auto_commit, ConsesLow
          .list( $sym385$SQLC_GET_AUTO_COMMIT, connection ) ), commit_error, rollback_result, auto_commit_result, errors ), ConsesLow.list( $sym373$PIF, ConsesLow.list( $sym143$SDBC_ERROR_P, auto_commit ), ConsesLow
              .list( $sym386$CPUSH, auto_commit, errors ), ConsesLow.list( $sym364$PROGN, ConsesLow.listS( $sym138$SQLC_SET_ERROR_HANDLING, connection, $list387 ), ConsesLow.listS( $sym388$CATCH_ERROR_MESSAGE, ConsesLow
                  .list( commit_error ), ConsesLow.list( $sym368$PWHEN, auto_commit, ConsesLow.listS( $sym389$SQLC_SET_AUTO_COMMIT, connection, $list390 ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list(
                      $sym391$SQLC_COMMIT, connection ) ) ) ), ConsesLow.listS( $sym138$SQLC_SET_ERROR_HANDLING, connection, $list392 ), ConsesLow.list( $sym368$PWHEN, commit_error, ConsesLow.list( $sym386$CPUSH,
                          ConsesLow.list( $sym393$SQLS_HANDLE_COMMIT_ERROR, commit_error ), errors ), ConsesLow.list( $sym365$CSETQ, rollback_result, ConsesLow.list( $sym394$SQLS_HANDLE_ROLLBACK, connection ) ),
                          ConsesLow.list( $sym368$PWHEN, ConsesLow.list( $sym143$SDBC_ERROR_P, rollback_result ), ConsesLow.list( $sym386$CPUSH, rollback_result, errors ) ) ), ConsesLow.list( $sym368$PWHEN, auto_commit,
                              ConsesLow.list( $sym365$CSETQ, auto_commit_result, ConsesLow.listS( $sym389$SQLC_SET_AUTO_COMMIT, connection, $list395 ) ) ), ConsesLow.list( $sym368$PWHEN, ConsesLow.list(
                                  $sym143$SDBC_ERROR_P, auto_commit_result ), ConsesLow.list( $sym386$CPUSH, auto_commit_result, errors ) ) ) ), ConsesLow.list( $sym368$PWHEN, errors, ConsesLow.list( $sym365$CSETQ,
                                      error, ConsesLow.list( $sym396$SQLS_HANDLE_TRANSACTION_ERRORS, errors ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list378 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 92235L)
  public static SubLObject sqls_handle_commit_error(final SubLObject error)
  {
    if( NIL != sdbc_error_p( error ) )
    {
      return new_sdbc_error( $commit_error$.getGlobalValue(), sdbc_error_message( error ), UNPROVIDED );
    }
    if( error.isString() )
    {
      return new_sdbc_error( $transaction_error$.getGlobalValue(), error, UNPROVIDED );
    }
    return new_sdbc_error( $unknown_error$.getGlobalValue(), $str397$An_unknown_error_occurred_during_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 92593L)
  public static SubLObject sqls_handle_rollback(final SubLObject connection)
  {
    SubLObject rollback_result = NIL;
    rollback_result = sqlc_rollback( connection );
    if( NIL != sdbc_error_p( rollback_result ) )
    {
      rollback_result = new_sdbc_error( $rollback_error$.getGlobalValue(), sdbc_error_message( rollback_result ), UNPROVIDED );
    }
    return rollback_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 92938L)
  public static SubLObject sqls_handle_transaction_errors(final SubLObject errors)
  {
    final SubLObject error_message = string_utilities.bunge( Mapping.mapcar( $sym153$SDBC_ERROR_MESSAGE, errors ), Characters.CHAR_newline );
    return new_sdbc_error( $transaction_error$.getGlobalValue(), error_message, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 93179L)
  public static SubLObject with_sql_transaction(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list398 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject statement = NIL;
    SubLObject error = NIL;
    SubLObject db = NIL;
    SubLObject user = NIL;
    SubLObject password = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list398 );
    statement = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list398 );
    error = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list398 );
    db = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list398 );
    user = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list398 );
    password = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$13 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list398 );
      current_$13 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list398 );
      if( NIL == conses_high.member( current_$13, $list359, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$13 == $kw96$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list398 );
    }
    final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member( $kw72$DBMS_SERVER, current );
    final SubLObject dbms_server = ( NIL != dbms_server_tail ) ? conses_high.cadr( dbms_server_tail ) : $sym1$_DBMS_SERVER_;
    final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw73$PORT, current );
    final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $sym7$_SQL_PORT_;
    final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member( $kw77$SUBPROTOCOL, current );
    final SubLObject subprotocol = ( NIL != subprotocol_tail ) ? conses_high.cadr( subprotocol_tail ) : $sym360$_SQL_SUBPROTOCOL_;
    final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member( $kw78$PROXY_SERVER, current );
    final SubLObject proxy_server = ( NIL != proxy_server_tail ) ? conses_high.cadr( proxy_server_tail ) : dbms_server;
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw98$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : $sym361$_SQL_CONNECTION_TIMEOUT_;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym399$WITH_SQL_STATEMENT, ConsesLow.list( new SubLObject[] { statement, db, user, password, $kw72$DBMS_SERVER, dbms_server, $kw73$PORT, port, $kw77$SUBPROTOCOL, subprotocol,
      $kw78$PROXY_SERVER, proxy_server, $kw98$TIMEOUT, timeout
    } ), ConsesLow.list( $sym368$PWHEN, ConsesLow.list( $sym244$SQL_OPEN_STATEMENT_P, statement ), ConsesLow.listS( $sym139$SQLS_EXECUTE_TRANSACTION, ConsesLow.list( statement, error ), ConsesLow.append( body,
        NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 94441L)
  public static SubLObject with_sql_result_set(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rs = NIL;
    SubLObject query = NIL;
    SubLObject db = NIL;
    SubLObject user = NIL;
    SubLObject password = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    rs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    query = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    db = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    user = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    password = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$14 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list400 );
      current_$14 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list400 );
      if( NIL == conses_high.member( current_$14, $list359, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$14 == $kw96$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list400 );
    }
    final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member( $kw72$DBMS_SERVER, current );
    final SubLObject dbms_server = ( NIL != dbms_server_tail ) ? conses_high.cadr( dbms_server_tail ) : $sym1$_DBMS_SERVER_;
    final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw73$PORT, current );
    final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $sym7$_SQL_PORT_;
    final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member( $kw77$SUBPROTOCOL, current );
    final SubLObject subprotocol = ( NIL != subprotocol_tail ) ? conses_high.cadr( subprotocol_tail ) : $sym360$_SQL_SUBPROTOCOL_;
    final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member( $kw78$PROXY_SERVER, current );
    final SubLObject proxy_server = ( NIL != proxy_server_tail ) ? conses_high.cadr( proxy_server_tail ) : dbms_server;
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw98$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : $sym361$_SQL_CONNECTION_TIMEOUT_;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject statement = $sym401$STATEMENT;
    return ConsesLow.list( $sym362$CLET, ConsesLow.list( rs ), ConsesLow.listS( $sym399$WITH_SQL_STATEMENT, ConsesLow.list( new SubLObject[] { statement, db, user, password, $kw72$DBMS_SERVER, dbms_server, $kw73$PORT,
      port, $kw77$SUBPROTOCOL, subprotocol, $kw78$PROXY_SERVER, proxy_server, $kw98$TIMEOUT, timeout
    } ), ConsesLow.list( $sym373$PIF, ConsesLow.list( $sym244$SQL_OPEN_STATEMENT_P, statement ), ConsesLow.list( $sym365$CSETQ, $sym402$RS, ConsesLow.list( $sym403$SQLS_EXECUTE_QUERY, statement, query ) ), ConsesLow
        .list( $sym365$CSETQ, rs, statement ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 95279L)
  public static SubLObject do_sql_result_set(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rs = NIL;
    SubLObject query = NIL;
    SubLObject db = NIL;
    SubLObject user = NIL;
    SubLObject password = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    rs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    query = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    db = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    user = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list400 );
    password = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$15 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list400 );
      current_$15 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list400 );
      if( NIL == conses_high.member( current_$15, $list359, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$15 == $kw96$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list400 );
    }
    final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member( $kw72$DBMS_SERVER, current );
    final SubLObject dbms_server = ( NIL != dbms_server_tail ) ? conses_high.cadr( dbms_server_tail ) : $sym1$_DBMS_SERVER_;
    final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw73$PORT, current );
    final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $sym7$_SQL_PORT_;
    final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member( $kw77$SUBPROTOCOL, current );
    final SubLObject subprotocol = ( NIL != subprotocol_tail ) ? conses_high.cadr( subprotocol_tail ) : $sym360$_SQL_SUBPROTOCOL_;
    final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member( $kw78$PROXY_SERVER, current );
    final SubLObject proxy_server = ( NIL != proxy_server_tail ) ? conses_high.cadr( proxy_server_tail ) : dbms_server;
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw98$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : $sym361$_SQL_CONNECTION_TIMEOUT_;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym404$WITH_SQL_RESULT_SET, ConsesLow.list( new SubLObject[] { rs, query, db, user, password, $kw72$DBMS_SERVER, dbms_server, $kw73$PORT, port, $kw77$SUBPROTOCOL, subprotocol,
      $kw78$PROXY_SERVER, proxy_server, $kw98$TIMEOUT, timeout
    } ), ConsesLow.list( $sym368$PWHEN, ConsesLow.list( $sym175$SQL_RESULT_SET_P, rs ), ConsesLow.listS( $sym405$WHILE, ConsesLow.list( $sym406$SQLRS_NEXT, rs ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 96099L)
  public static SubLObject sql_export(final SubLObject table, final SubLObject db, final SubLObject user, final SubLObject password, SubLObject stream, SubLObject dbms_server, SubLObject port, SubLObject subprotocol,
      SubLObject proxy_server)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( dbms_server == UNPROVIDED )
    {
      dbms_server = $dbms_server$.getGlobalValue();
    }
    if( port == UNPROVIDED )
    {
      port = $sql_port$.getGlobalValue();
    }
    if( subprotocol == UNPROVIDED )
    {
      subprotocol = $sql_subprotocol$.getGlobalValue();
    }
    if( proxy_server == UNPROVIDED )
    {
      proxy_server = dbms_server;
    }
    assert NIL != Types.stringp( table ) : table;
    assert NIL != Types.stringp( db ) : db;
    assert NIL != Types.stringp( user ) : user;
    assert NIL != Types.stringp( password ) : password;
    assert NIL != streams_high.output_stream_p( stream ) : stream;
    assert NIL != Types.stringp( dbms_server ) : dbms_server;
    assert NIL != subl_promotions.positive_integer_p( port ) : port;
    assert NIL != Types.stringp( subprotocol ) : subprotocol;
    assert NIL != Types.stringp( proxy_server ) : proxy_server;
    final SubLObject rs = NIL;
    SubLObject col = NIL;
    SubLObject rs_$16 = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = new_sql_connection( db, user, password, ConsesLow.list( new SubLObject[] { $kw72$DBMS_SERVER, dbms_server, $kw73$PORT, port, $kw77$SUBPROTOCOL, subprotocol, $kw78$PROXY_SERVER, proxy_server,
        $kw98$TIMEOUT, $sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sql_open_connection_p( connection ) )
      {
        statement = sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sql_open_statement_p( statement ) )
      {
        rs_$16 = sqls_execute_query( statement, Sequences.cconcatenate( $str408$SELECT___FROM_, table ), UNPROVIDED );
      }
      else
      {
        rs_$16 = statement;
      }
      if( NIL != sql_result_set_p( rs_$16 ) )
      {
        while ( NIL != sqlrs_next( rs_$16 ))
        {
          col = ZERO_INTEGER;
          while ( !col.numE( number_utilities.f_1_( sqlrs_column_count( rs_$16 ) ) ))
          {
            col = Numbers.add( col, ONE_INTEGER );
            print_high.princ( sqlrs_get_object( rs_$16, col ), stream );
            print_high.princ( Characters.CHAR_tab, stream );
          }
          col = Numbers.add( col, ONE_INTEGER );
          print_high.princ( sqlrs_get_object( rs_$16, col ), stream );
          streams_high.terpri( stream );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sql_connection_p( connection ) )
        {
          sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 97894L)
  public static SubLObject sdbc_test(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table)
  {
    if( dbms_server == UNPROVIDED )
    {
      dbms_server = $dbms_server$.getGlobalValue();
    }
    if( port == UNPROVIDED )
    {
      port = $sql_port$.getGlobalValue();
    }
    if( subprotocol == UNPROVIDED )
    {
      subprotocol = $sql_subprotocol$.getGlobalValue();
    }
    if( proxy_server == UNPROVIDED )
    {
      proxy_server = dbms_server;
    }
    if( table == UNPROVIDED )
    {
      table = string_utilities.split_string( Environment.machine_instance(), $list409 ).first();
    }
    return makeBoolean( NIL != sdbc_test_created( db, user, password, dbms_server, port, subprotocol, proxy_server, table ) && NIL != sdbc_test_prepared( db, user, password, dbms_server, port, subprotocol, proxy_server,
        table ) && NIL != sdbc_test_batch( db, user, password, dbms_server, port, subprotocol, proxy_server, table ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 98469L)
  public static SubLObject sdbc_test_prepared(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server,
      SubLObject table)
  {
    if( dbms_server == UNPROVIDED )
    {
      dbms_server = $dbms_server$.getGlobalValue();
    }
    if( port == UNPROVIDED )
    {
      port = $sql_port$.getGlobalValue();
    }
    if( subprotocol == UNPROVIDED )
    {
      subprotocol = $sql_subprotocol$.getGlobalValue();
    }
    if( proxy_server == UNPROVIDED )
    {
      proxy_server = dbms_server;
    }
    if( table == UNPROVIDED )
    {
      table = string_utilities.split_string( Environment.machine_instance(), $list409 ).first();
    }
    SubLObject c = NIL;
    SubLObject s = NIL;
    SubLObject insert = NIL;
    SubLObject select = NIL;
    SubLObject passP = NIL;
    SubLObject rs = NIL;
    SubLObject result = NIL;
    try
    {
      c = new_sql_connection( db, user, password, ConsesLow.list( new SubLObject[] { $kw72$DBMS_SERVER, dbms_server, $kw73$PORT, port, $kw77$SUBPROTOCOL, subprotocol, $kw78$PROXY_SERVER, proxy_server, $kw98$TIMEOUT,
        $sql_connection_timeout$.getGlobalValue()
      } ) );
      s = sqlc_create_statement( c );
      insert = sqlc_prepare_statement( c, PrintLow.format( NIL, $str410$INSERT_INTO__a_VALUES______, table ) );
      select = sqlc_prepare_statement( c, PrintLow.format( NIL, $str411$SELECT_number2_FROM__a_WHERE_numb, table ) );
      passP = T;
      sqls_execute_update( s, Sequences.cconcatenate( $str412$CREATE_TABLE_, new SubLObject[] { table, $str413$__number1_INT_PRIMARY_KEY__number
      } ) );
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( $sdbc_test_row_cardinality$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        sqlps_set_int( insert, ONE_INTEGER, i );
        sqlps_set_int( insert, TWO_INTEGER, i );
        sqlps_execute_update( insert );
      }
      for( i = NIL, i = ZERO_INTEGER; i.numL( $sdbc_test_row_cardinality$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        sqlps_set_int( select, ONE_INTEGER, i );
        rs = sqlps_execute_query( select, UNPROVIDED );
        sqlrs_next( rs );
        result = sqlrs_get_object( rs, ONE_INTEGER );
        passP = makeBoolean( NIL != passP && result.eql( i ) );
        if( !result.eql( i ) )
        {
          Errors.warn( $str414$validation_failed_for__a__result_, i, result );
        }
      }
      sqls_execute_update( s, Sequences.cconcatenate( $str415$DROP_TABLE_, table ) );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sql_connection_p( c ) )
        {
          sqlc_close( c );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return passP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 100493L)
  public static SubLObject sdbc_test_created(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server,
      SubLObject table)
  {
    if( dbms_server == UNPROVIDED )
    {
      dbms_server = $dbms_server$.getGlobalValue();
    }
    if( port == UNPROVIDED )
    {
      port = $sql_port$.getGlobalValue();
    }
    if( subprotocol == UNPROVIDED )
    {
      subprotocol = $sql_subprotocol$.getGlobalValue();
    }
    if( proxy_server == UNPROVIDED )
    {
      proxy_server = dbms_server;
    }
    if( table == UNPROVIDED )
    {
      table = string_utilities.split_string( Environment.machine_instance(), $list409 ).first();
    }
    SubLObject passP = T;
    SubLObject num_string = NIL;
    SubLObject rs = NIL;
    SubLObject result = NIL;
    SubLObject s = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = new_sql_connection( db, user, password, ConsesLow.list( new SubLObject[] { $kw72$DBMS_SERVER, dbms_server, $kw73$PORT, port, $kw77$SUBPROTOCOL, subprotocol, $kw78$PROXY_SERVER, proxy_server,
        $kw98$TIMEOUT, $sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sql_open_connection_p( connection ) )
      {
        s = sqlc_create_statement( connection );
      }
      else
      {
        s = connection;
      }
      sqls_execute_update( s, Sequences.cconcatenate( $str412$CREATE_TABLE_, new SubLObject[] { table, $str413$__number1_INT_PRIMARY_KEY__number
      } ) );
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( $sdbc_test_row_cardinality$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        num_string = print_high.prin1_to_string( i );
        sqls_execute_update( s, Sequences.cconcatenate( $str416$INSERT_INTO_, new SubLObject[] { table, $str417$_VALUES_, num_string, $str418$__, num_string, $str419$_
        } ) );
      }
      for( i = NIL, i = ZERO_INTEGER; i.numL( $sdbc_test_row_cardinality$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        rs = sqls_execute_query( s, Sequences.cconcatenate( $str420$SELECT_number2_FROM_, new SubLObject[] { table, $str421$_WHERE_number1___, print_high.prin1_to_string( i )
        } ), UNPROVIDED );
        sqlrs_next( rs );
        result = sqlrs_get_object( rs, ONE_INTEGER );
        passP = makeBoolean( NIL != passP && result.eql( i ) );
        if( !result.eql( i ) )
        {
          Errors.warn( $str414$validation_failed_for__a__result_, i, result );
        }
      }
      sqls_execute_update( s, Sequences.cconcatenate( $str415$DROP_TABLE_, table ) );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sql_connection_p( connection ) )
        {
          sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return passP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 102217L)
  public static SubLObject sdbc_test_batch(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server,
      SubLObject table)
  {
    if( dbms_server == UNPROVIDED )
    {
      dbms_server = $dbms_server$.getGlobalValue();
    }
    if( port == UNPROVIDED )
    {
      port = $sql_port$.getGlobalValue();
    }
    if( subprotocol == UNPROVIDED )
    {
      subprotocol = $sql_subprotocol$.getGlobalValue();
    }
    if( proxy_server == UNPROVIDED )
    {
      proxy_server = dbms_server;
    }
    if( table == UNPROVIDED )
    {
      table = string_utilities.split_string( Environment.machine_instance(), $list409 ).first();
    }
    SubLObject passP = T;
    SubLObject num_string = NIL;
    SubLObject rs = NIL;
    SubLObject result = NIL;
    SubLObject s = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = new_sql_connection( db, user, password, ConsesLow.list( new SubLObject[] { $kw72$DBMS_SERVER, dbms_server, $kw73$PORT, port, $kw77$SUBPROTOCOL, subprotocol, $kw78$PROXY_SERVER, proxy_server,
        $kw98$TIMEOUT, $sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sql_open_connection_p( connection ) )
      {
        s = sqlc_create_statement( connection );
      }
      else
      {
        s = connection;
      }
      sqls_execute_update( s, Sequences.cconcatenate( $str412$CREATE_TABLE_, new SubLObject[] { table, $str413$__number1_INT_PRIMARY_KEY__number
      } ) );
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( $sdbc_test_row_cardinality$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        num_string = print_high.prin1_to_string( i );
        sqls_add_batch( s, Sequences.cconcatenate( $str416$INSERT_INTO_, new SubLObject[] { table, $str417$_VALUES_, num_string, $str418$__, num_string, $str419$_
        } ) );
      }
      sqls_execute_batch( s );
      for( i = NIL, i = ZERO_INTEGER; i.numL( $sdbc_test_row_cardinality$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        rs = sqls_execute_query( s, Sequences.cconcatenate( $str420$SELECT_number2_FROM_, new SubLObject[] { table, $str421$_WHERE_number1___, print_high.prin1_to_string( i )
        } ), UNPROVIDED );
        sqlrs_next( rs );
        result = sqlrs_get_object( rs, ONE_INTEGER );
        passP = makeBoolean( NIL != passP && result.eql( i ) );
        if( !result.eql( i ) )
        {
          Errors.warn( $str414$validation_failed_for__a__result_, i, result );
        }
      }
      sqls_execute_update( s, Sequences.cconcatenate( $str415$DROP_TABLE_, table ) );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sql_connection_p( connection ) )
        {
          sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return passP;
  }

  public static SubLObject declare_sdbc_file()
  {
    SubLFiles.declareFunction( me, "sql_proxy_server_runningP", "SQL-PROXY-SERVER-RUNNING?", 0, 3, false );
    SubLFiles.declareFunction( me, "sql_connection_print_function_trampoline", "SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sql_connection_p", "SQL-CONNECTION-P", 1, 0, false );
    new $sql_connection_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sqlc_db", "SQLC-DB", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_user", "SQLC-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_dbms_server", "SQLC-DBMS-SERVER", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_port", "SQLC-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_channel", "SQLC-CHANNEL", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_statements", "SQLC-STATEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_lock", "SQLC-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_subprotocol", "SQLC-SUBPROTOCOL", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_proxy_server", "SQLC-PROXY-SERVER", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_error_handling", "SQLC-ERROR-HANDLING", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_tickets", "SQLC-TICKETS", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_mailman", "SQLC-MAILMAN", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_db", "_CSETF-SQLC-DB", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_user", "_CSETF-SQLC-USER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_dbms_server", "_CSETF-SQLC-DBMS-SERVER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_port", "_CSETF-SQLC-PORT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_channel", "_CSETF-SQLC-CHANNEL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_statements", "_CSETF-SQLC-STATEMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_lock", "_CSETF-SQLC-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_subprotocol", "_CSETF-SQLC-SUBPROTOCOL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_proxy_server", "_CSETF-SQLC-PROXY-SERVER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_error_handling", "_CSETF-SQLC-ERROR-HANDLING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_tickets", "_CSETF-SQLC-TICKETS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlc_mailman", "_CSETF-SQLC-MAILMAN", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sql_connection", "MAKE-SQL-CONNECTION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sql_connection", "VISIT-DEFSTRUCT-SQL-CONNECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sql_connection_method", "VISIT-DEFSTRUCT-OBJECT-SQL-CONNECTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sqlc_print", "SQLC-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "sqlc_print_string", "SQLC-PRINT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sql_connection", "NEW-SQL-CONNECTION", 3, 1, false );
    SubLFiles.declareFunction( me, "sql_open_connection_p", "SQL-OPEN-CONNECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_open_p", "SQLC-OPEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_close", "SQLC-CLOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_create_statement", "SQLC-CREATE-STATEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_prepare_statement", "SQLC-PREPARE-STATEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "sqlc_set_auto_commit", "SQLC-SET-AUTO-COMMIT", 2, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_auto_commit", "SQLC-GET-AUTO-COMMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_commit", "SQLC-COMMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_rollback", "SQLC-ROLLBACK", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_transaction_isolation", "SQLC-GET-TRANSACTION-ISOLATION", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_set_transaction_isolation", "SQLC-SET-TRANSACTION-ISOLATION", 2, 0, false );
    SubLFiles.declareFunction( me, "sql_ticket_print_function_trampoline", "SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sql_ticket_p", "SQL-TICKET-P", 1, 0, false );
    new $sql_ticket_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sql_ticket_semaphore", "SQL-TICKET-SEMAPHORE", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_ticket_result", "SQL-TICKET-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sql_ticket_semaphore", "_CSETF-SQL-TICKET-SEMAPHORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sql_ticket_result", "_CSETF-SQL-TICKET-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sql_ticket", "MAKE-SQL-TICKET", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sql_ticket", "VISIT-DEFSTRUCT-SQL-TICKET", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sql_ticket_method", "VISIT-DEFSTRUCT-OBJECT-SQL-TICKET-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sql_ticket", "NEW-SQL-TICKET", 0, 0, false );
    SubLFiles.declareFunction( me, "sql_ticket_retrieve", "SQL-TICKET-RETRIEVE", 1, 0, false );
    SubLFiles.declareFunction( me, "launch_sql_mailman", "LAUNCH-SQL-MAILMAN", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_deliver", "SQLC-DELIVER", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_execute", "SQLC-EXECUTE", 3, 0, false );
    SubLFiles.declareFunction( me, "sqlc_send", "SQLC-SEND", 4, 0, false );
    SubLFiles.declareFunction( me, "sqlc_receive", "SQLC-RECEIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_handle_error", "SQLC-HANDLE-ERROR", 2, 0, false );
    SubLFiles.declareFunction( me, "sql_transaction_level_p", "SQL-TRANSACTION-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlc_set_error_handling", "SQLC-SET-ERROR-HANDLING", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sql_response", "NEW-SQL-RESPONSE", 2, 0, false );
    SubLFiles.declareFunction( me, "sql_response_code", "SQL-RESPONSE-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_response_value", "SQL-RESPONSE-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_null_p", "SQL-NULL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_true_p", "SQL-TRUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_false_p", "SQL-FALSE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_error_print_function_trampoline", "SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sdbc_error_p", "SDBC-ERROR-P", 1, 0, false );
    new $sdbc_error_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sdbc_error_type", "SDBC-ERROR-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_error_message", "SDBC-ERROR-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_error_code", "SDBC-ERROR-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sdbc_error_type", "_CSETF-SDBC-ERROR-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sdbc_error_message", "_CSETF-SDBC-ERROR-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sdbc_error_code", "_CSETF-SDBC-ERROR-CODE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sdbc_error", "MAKE-SDBC-ERROR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sdbc_error", "VISIT-DEFSTRUCT-SDBC-ERROR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sdbc_error_method", "VISIT-DEFSTRUCT-OBJECT-SDBC-ERROR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sdbc_error_throw", "SDBC-ERROR-THROW", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_error_warn", "SDBC-ERROR-WARN", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_server_error_p", "SDBC-SERVER-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_client_error_p", "SDBC-CLIENT-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_sql_error_p", "SDBC-SQL-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_io_error_p", "SDBC-IO-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_transaction_error_p", "SDBC-TRANSACTION-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_batch_update_error_p", "SDBC-BATCH-UPDATE-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_other_error_p", "SDBC-OTHER-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sdbc_error", "NEW-SDBC-ERROR", 2, 1, false );
    SubLFiles.declareFunction( me, "sdbc_error_print", "SDBC-ERROR-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "decode_sdbc_error_code", "DECODE-SDBC-ERROR-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_result_set_print_function_trampoline", "SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sql_result_set_p", "SQL-RESULT-SET-P", 1, 0, false );
    new $sql_result_set_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sqlrs_rows", "SQLRS-ROWS", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_current", "SQLRS-CURRENT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_last", "SQLRS-LAST", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_start", "SQLRS-START", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_connection", "SQLRS-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_block_size", "SQLRS-BLOCK-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_id", "SQLRS-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlrs_rows", "_CSETF-SQLRS-ROWS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlrs_current", "_CSETF-SQLRS-CURRENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlrs_last", "_CSETF-SQLRS-LAST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlrs_start", "_CSETF-SQLRS-START", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlrs_connection", "_CSETF-SQLRS-CONNECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlrs_block_size", "_CSETF-SQLRS-BLOCK-SIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqlrs_id", "_CSETF-SQLRS-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sql_result_set", "MAKE-SQL-RESULT-SET", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sql_result_set", "VISIT-DEFSTRUCT-SQL-RESULT-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sql_result_set_method", "VISIT-DEFSTRUCT-OBJECT-SQL-RESULT-SET-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_print", "SQLRS-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "sql_open_result_set_p", "SQL-OPEN-RESULT-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_close", "SQLRS-CLOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_emptyP", "SQLRS-EMPTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_absolute", "SQLRS-ABSOLUTE", 2, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_next", "SQLRS-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_previous", "SQLRS-PREVIOUS", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_is_last", "SQLRS-IS-LAST", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_is_first", "SQLRS-IS-FIRST", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_column_count", "SQLRS-COLUMN-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_row_count", "SQLRS-ROW-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_get_row", "SQLRS-GET-ROW", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_get_object", "SQLRS-GET-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_get_object_tuple", "SQLRS-GET-OBJECT-TUPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sql_result_set", "NEW-SQL-RESULT-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_closed_p", "SQLRS-CLOSED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_open_p", "SQLRS-OPEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_valid_row_p", "SQLRS-VALID-ROW-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_valid_column_p", "SQLRS-VALID-COLUMN-P", 2, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_block", "SQLRS-BLOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_row_local_p", "SQLRS-ROW-LOCAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_row_remote_p", "SQLRS-ROW-REMOTE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_local_close", "SQLRS-LOCAL-CLOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_statement_print_function_trampoline", "SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sql_statement_p", "SQL-STATEMENT-P", 1, 0, false );
    new $sql_statement_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sqls_connection", "SQLS-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_id", "SQLS-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_sql", "SQLS-SQL", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_settings", "SQLS-SETTINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_batch", "SQLS-BATCH", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_rs", "SQLS-RS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqls_connection", "_CSETF-SQLS-CONNECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqls_id", "_CSETF-SQLS-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqls_sql", "_CSETF-SQLS-SQL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqls_settings", "_CSETF-SQLS-SETTINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqls_batch", "_CSETF-SQLS-BATCH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sqls_rs", "_CSETF-SQLS-RS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sql_statement", "MAKE-SQL-STATEMENT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sql_statement", "VISIT-DEFSTRUCT-SQL-STATEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sql_statement_method", "VISIT-DEFSTRUCT-OBJECT-SQL-STATEMENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sqls_open_p", "SQLS-OPEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_open_statement_p", "SQL-OPEN-STATEMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_execute_query", "SQLS-EXECUTE-QUERY", 2, 1, false );
    SubLFiles.declareFunction( me, "sqls_execute_update", "SQLS-EXECUTE-UPDATE", 2, 0, false );
    SubLFiles.declareFunction( me, "sqls_cancel", "SQLS-CANCEL", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_get_generated_keys", "SQLS-GET-GENERATED-KEYS", 1, 1, false );
    SubLFiles.declareFunction( me, "sqls_close", "SQLS-CLOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_add_batch", "SQLS-ADD-BATCH", 2, 0, false );
    SubLFiles.declareFunction( me, "sqls_clear_batch", "SQLS-CLEAR-BATCH", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_execute_batch", "SQLS-EXECUTE-BATCH", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_prepared_statement_p", "SQL-PREPARED-STATEMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sql_prepared_open_statement_p", "SQL-PREPARED-OPEN-STATEMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlps_execute_query", "SQLPS-EXECUTE-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "sqlps_execute_update", "SQLPS-EXECUTE-UPDATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlps_set_bytes", "SQLPS-SET-BYTES", 3, 0, false );
    SubLFiles.declareFunction( me, "sqlps_set_int", "SQLPS-SET-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "sqlps_set_long", "SQLPS-SET-LONG", 3, 0, false );
    SubLFiles.declareFunction( me, "sqlps_set_float", "SQLPS-SET-FLOAT", 3, 0, false );
    SubLFiles.declareFunction( me, "sqlps_set_double", "SQLPS-SET-DOUBLE", 3, 0, false );
    SubLFiles.declareFunction( me, "sqlps_set_string", "SQLPS-SET-STRING", 3, 0, false );
    SubLFiles.declareFunction( me, "new_sql_statement", "NEW-SQL-STATEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_get_connection", "SQLS-GET-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_local_close", "SQLS-LOCAL-CLOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlps_set", "SQLPS-SET", 4, 0, false );
    SubLFiles.declareFunction( me, "new_sql_prepared_statement", "NEW-SQL-PREPARED-STATEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "new_statement_id", "NEW-STATEMENT-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "new_result_set_id", "NEW-RESULT-SET-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_tables", "SQLC-GET-TABLES", 5, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_tables_meta_data", "SQLC-GET-TABLES-META-DATA", 5, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_columns", "SQLC-GET-COLUMNS", 5, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_columns_meta_data", "SQLC-GET-COLUMNS-META-DATA", 5, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_primary_keys", "SQLC-GET-PRIMARY-KEYS", 4, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_primary_keys_meta_data", "SQLC-GET-PRIMARY-KEYS-META-DATA", 4, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_imported_keys", "SQLC-GET-IMPORTED-KEYS", 4, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_imported_keys_meta_data", "SQLC-GET-IMPORTED-KEYS-META-DATA", 4, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_exported_keys", "SQLC-GET-EXPORTED-KEYS", 4, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_exported_keys_meta_data", "SQLC-GET-EXPORTED-KEYS-META-DATA", 4, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_index_info", "SQLC-GET-INDEX-INFO", 6, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_index_info_meta_data", "SQLC-GET-INDEX-INFO-META-DATA", 6, 0, false );
    SubLFiles.declareFunction( me, "sqlc_get_max_connections", "SQLC-GET-MAX-CONNECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_error_handling_tag_p", "SDBC-ERROR-HANDLING-TAG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_db_url", "NEW-DB-URL", 5, 1, false );
    SubLFiles.declareFunction( me, "add_sdbc_database_connection_url_description", "ADD-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION", 5, 0, false );
    SubLFiles.declareFunction( me, "get_all_sdbc_database_sub_protocols", "GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "compile_db_conn_url_punctuation_info", "COMPILE-DB-CONN-URL-PUNCTUATION-INFO", 1, 0, false );
    SubLFiles.declareMacro( me, "register_sdbc_database_connection_url_description", "REGISTER-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION" );
    SubLFiles.declareFunction( me, "set_sdbc_db2_port", "SET-SDBC-DB2-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_db2_port", "SDBC-DB2-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_sdbc_sybase_iq_port", "SET-SDBC-SYBASE-IQ-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "sdbc_sybase_iq_port", "SDBC-SYBASE-IQ-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "construct_new_database_connection_url", "CONSTRUCT-NEW-DATABASE-CONNECTION-URL", 2, 0, false );
    SubLFiles.declareFunction( me, "construct_new_dbconn_url_required", "CONSTRUCT-NEW-DBCONN-URL-REQUIRED", 4, 0, false );
    SubLFiles.declareFunction( me, "resolve_dbconn_url_reference", "RESOLVE-DBCONN-URL-REFERENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "append_dbconn_url_options", "APPEND-DBCONN-URL-OPTIONS", 5, 0, false );
    SubLFiles.declareFunction( me, "write_dbconn_url_punctuation", "WRITE-DBCONN-URL-PUNCTUATION", 3, 0, false );
    SubLFiles.declareFunction( me, "java_integerp", "JAVA-INTEGERP", 1, 0, false );
    SubLFiles.declareFunction( me, "java_longp", "JAVA-LONGP", 1, 0, false );
    SubLFiles.declareFunction( me, "java_floatp", "JAVA-FLOATP", 1, 0, false );
    SubLFiles.declareFunction( me, "java_doublep", "JAVA-DOUBLEP", 1, 0, false );
    SubLFiles.declareMacro( me, "with_sql_connection", "WITH-SQL-CONNECTION" );
    SubLFiles.declareMacro( me, "with_sql_statement", "WITH-SQL-STATEMENT" );
    SubLFiles.declareMacro( me, "with_prepared_sql_statement", "WITH-PREPARED-SQL-STATEMENT" );
    SubLFiles.declareMacro( me, "sqls_execute_transaction", "SQLS-EXECUTE-TRANSACTION" );
    SubLFiles.declareFunction( me, "sqls_handle_commit_error", "SQLS-HANDLE-COMMIT-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_handle_rollback", "SQLS-HANDLE-ROLLBACK", 1, 0, false );
    SubLFiles.declareFunction( me, "sqls_handle_transaction_errors", "SQLS-HANDLE-TRANSACTION-ERRORS", 1, 0, false );
    SubLFiles.declareMacro( me, "with_sql_transaction", "WITH-SQL-TRANSACTION" );
    SubLFiles.declareMacro( me, "with_sql_result_set", "WITH-SQL-RESULT-SET" );
    SubLFiles.declareMacro( me, "do_sql_result_set", "DO-SQL-RESULT-SET" );
    SubLFiles.declareFunction( me, "sql_export", "SQL-EXPORT", 4, 5, false );
    SubLFiles.declareFunction( me, "sdbc_test", "SDBC-TEST", 3, 5, false );
    SubLFiles.declareFunction( me, "sdbc_test_prepared", "SDBC-TEST-PREPARED", 3, 5, false );
    SubLFiles.declareFunction( me, "sdbc_test_created", "SDBC-TEST-CREATED", 3, 5, false );
    SubLFiles.declareFunction( me, "sdbc_test_batch", "SDBC-TEST-BATCH", 3, 5, false );
    return NIL;
  }

  public static SubLObject init_sdbc_file()
  {
    $dbms_server$ = SubLFiles.deflexical( "*DBMS-SERVER*", red_infrastructure_macros.red_def_helper( $list0.isSymbol() ? Symbols.symbol_value( $list0 ) : $list0, $sym1$_DBMS_SERVER_, $str2$db_server_cyc_com.isSymbol()
        ? Symbols.symbol_value( $str2$db_server_cyc_com )
        : $str2$db_server_cyc_com, $kw3$LEXICAL, UNPROVIDED ) );
    $sdbc_proxy_server$ = SubLFiles.deflexical( "*SDBC-PROXY-SERVER*", red_infrastructure_macros.red_def_helper( $list4.isSymbol() ? Symbols.symbol_value( $list4 ) : $list4, $sym5$_SDBC_PROXY_SERVER_,
        $str2$db_server_cyc_com.isSymbol() ? Symbols.symbol_value( $str2$db_server_cyc_com ) : $str2$db_server_cyc_com, $kw3$LEXICAL, UNPROVIDED ) );
    $sql_port$ = SubLFiles.deflexical( "*SQL-PORT*", red_infrastructure_macros.red_def_helper( $list6.isSymbol() ? Symbols.symbol_value( $list6 ) : $list6, $sym7$_SQL_PORT_, $int8$9999.isSymbol() ? Symbols.symbol_value(
        $int8$9999 ) : $int8$9999, $kw3$LEXICAL, UNPROVIDED ) );
    $sql_protocol$ = SubLFiles.deflexical( "*SQL-PROTOCOL*", $str9$jdbc );
    $sql_subprotocol$ = SubLFiles.deflexical( "*SQL-SUBPROTOCOL*", $str10$postgresql );
    $sql_connection_timeout$ = SubLFiles.deflexical( "*SQL-CONNECTION-TIMEOUT*", FIVE_INTEGER );
    $connection_id$ = SubLFiles.deflexical( "*CONNECTION-ID*", $str11$CONNECTION );
    $result_set_block_size$ = SubLFiles.defparameter( "*RESULT-SET-BLOCK-SIZE*", $int12$1000 );
    $quit$ = SubLFiles.deflexical( "*QUIT*", ZERO_INTEGER );
    $execute_update$ = SubLFiles.deflexical( "*EXECUTE-UPDATE*", ONE_INTEGER );
    $execute_query$ = SubLFiles.deflexical( "*EXECUTE-QUERY*", TWO_INTEGER );
    $prepare_statement$ = SubLFiles.deflexical( "*PREPARE-STATEMENT*", THREE_INTEGER );
    $create_statement$ = SubLFiles.deflexical( "*CREATE-STATEMENT*", FOUR_INTEGER );
    $set_bytes$ = SubLFiles.deflexical( "*SET-BYTES*", FIVE_INTEGER );
    $ps_execute_update$ = SubLFiles.deflexical( "*PS-EXECUTE-UPDATE*", SIX_INTEGER );
    $ps_execute_query$ = SubLFiles.deflexical( "*PS-EXECUTE-QUERY*", SEVEN_INTEGER );
    $set_int$ = SubLFiles.deflexical( "*SET-INT*", EIGHT_INTEGER );
    $close_statement$ = SubLFiles.deflexical( "*CLOSE-STATEMENT*", NINE_INTEGER );
    $new_connection$ = SubLFiles.deflexical( "*NEW-CONNECTION*", TEN_INTEGER );
    $set_string$ = SubLFiles.deflexical( "*SET-STRING*", ELEVEN_INTEGER );
    $set_long$ = SubLFiles.deflexical( "*SET-LONG*", TWELVE_INTEGER );
    $set_double$ = SubLFiles.deflexical( "*SET-DOUBLE*", THIRTEEN_INTEGER );
    $set_float$ = SubLFiles.deflexical( "*SET-FLOAT*", FOURTEEN_INTEGER );
    $execute_batch$ = SubLFiles.deflexical( "*EXECUTE-BATCH*", FIFTEEN_INTEGER );
    $get_rows$ = SubLFiles.deflexical( "*GET-ROWS*", SIXTEEN_INTEGER );
    $close_result_set$ = SubLFiles.deflexical( "*CLOSE-RESULT-SET*", SEVENTEEN_INTEGER );
    $execute_update_auto_keys$ = SubLFiles.deflexical( "*EXECUTE-UPDATE-AUTO-KEYS*", EIGHTEEN_INTEGER );
    $get_generated_keys$ = SubLFiles.deflexical( "*GET-GENERATED-KEYS*", NINETEEN_INTEGER );
    $set_auto_commit$ = SubLFiles.deflexical( "*SET-AUTO-COMMIT*", TWENTY_INTEGER );
    $commit$ = SubLFiles.deflexical( "*COMMIT*", $int13$21 );
    $rollback$ = SubLFiles.deflexical( "*ROLLBACK*", $int14$22 );
    $get_transaction_isolation$ = SubLFiles.deflexical( "*GET-TRANSACTION-ISOLATION*", $int15$23 );
    $set_transaction_isolation$ = SubLFiles.deflexical( "*SET-TRANSACTION-ISOLATION*", $int16$24 );
    $get_auto_commit$ = SubLFiles.deflexical( "*GET-AUTO-COMMIT*", $int17$25 );
    $get_tables$ = SubLFiles.deflexical( "*GET-TABLES*", $int18$26 );
    $get_columns$ = SubLFiles.deflexical( "*GET-COLUMNS*", $int19$27 );
    $get_primary_keys$ = SubLFiles.deflexical( "*GET-PRIMARY-KEYS*", $int20$28 );
    $get_imported_keys$ = SubLFiles.deflexical( "*GET-IMPORTED-KEYS*", $int21$29 );
    $get_exported_keys$ = SubLFiles.deflexical( "*GET-EXPORTED-KEYS*", $int22$30 );
    $get_index_info$ = SubLFiles.deflexical( "*GET-INDEX-INFO*", $int23$31 );
    $cancel$ = SubLFiles.deflexical( "*CANCEL*", $int24$32 );
    $get_max_connections$ = SubLFiles.deflexical( "*GET-MAX-CONNECTIONS*", $int25$33 );
    $stop_response$ = SubLFiles.deflexical( "*STOP-RESPONSE*", ZERO_INTEGER );
    $integer_response$ = SubLFiles.deflexical( "*INTEGER-RESPONSE*", ONE_INTEGER );
    $result_set_response$ = SubLFiles.deflexical( "*RESULT-SET-RESPONSE*", TWO_INTEGER );
    $void_response$ = SubLFiles.deflexical( "*VOID-RESPONSE*", THREE_INTEGER );
    $connection$ = SubLFiles.deflexical( "*CONNECTION*", FOUR_INTEGER );
    $update_counts$ = SubLFiles.deflexical( "*UPDATE-COUNTS*", FIVE_INTEGER );
    $transaction_isolation_level$ = SubLFiles.deflexical( "*TRANSACTION-ISOLATION-LEVEL*", SIX_INTEGER );
    $boolean$ = SubLFiles.deflexical( "*BOOLEAN*", SEVEN_INTEGER );
    $io_error$ = SubLFiles.deflexical( "*IO-ERROR*", MINUS_ONE_INTEGER );
    $sql_error$ = SubLFiles.deflexical( "*SQL-ERROR*", $int26$_2 );
    $unknown_error$ = SubLFiles.deflexical( "*UNKNOWN-ERROR*", $int27$_3 );
    $client_error$ = SubLFiles.deflexical( "*CLIENT-ERROR*", $int28$_4 );
    $commit_error$ = SubLFiles.deflexical( "*COMMIT-ERROR*", $int29$_5 );
    $rollback_error$ = SubLFiles.deflexical( "*ROLLBACK-ERROR*", $int30$_6 );
    $transaction_error$ = SubLFiles.deflexical( "*TRANSACTION-ERROR*", $int31$_7 );
    $batch_update_error$ = SubLFiles.deflexical( "*BATCH-UPDATE-ERROR*", $int32$_8 );
    $dtp_sql_connection$ = SubLFiles.defconstant( "*DTP-SQL-CONNECTION*", $sym37$SQL_CONNECTION );
    $dtp_sql_ticket$ = SubLFiles.defconstant( "*DTP-SQL-TICKET*", $sym109$SQL_TICKET );
    $sql_connection_timeout_seconds$ = SubLFiles.defparameter( "*SQL-CONNECTION-TIMEOUT-SECONDS*", $int127$212 );
    $sql_connection_timeout_seconds_within_inference$ = SubLFiles.defparameter( "*SQL-CONNECTION-TIMEOUT-SECONDS-WITHIN-INFERENCE*", numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue() );
    $dtp_sdbc_error$ = SubLFiles.defconstant( "*DTP-SDBC-ERROR*", $sym142$SDBC_ERROR );
    $sdbc_error_decoding$ = SubLFiles.defparameter( "*SDBC-ERROR-DECODING*", ConsesLow.list( reader.bq_cons( $io_error$.getGlobalValue(), $str167$_IO ), reader.bq_cons( $sql_error$.getGlobalValue(), $str168$_SQL ),
        reader.bq_cons( $unknown_error$.getGlobalValue(), $str169$ ), reader.bq_cons( $client_error$.getGlobalValue(), $str170$_CLIENT ), reader.bq_cons( $transaction_error$.getGlobalValue(), $str171$_TRANSACTION ),
        reader.bq_cons( $rollback_error$.getGlobalValue(), $str172$_ROLLBACK ), reader.bq_cons( $batch_update_error$.getGlobalValue(), $str173$_BATCH_UPDATE ) ) );
    $dtp_sql_result_set$ = SubLFiles.defconstant( "*DTP-SQL-RESULT-SET*", $sym174$SQL_RESULT_SET );
    $dtp_sql_statement$ = SubLFiles.defconstant( "*DTP-SQL-STATEMENT*", $sym218$SQL_STATEMENT );
    $sdbc_database_connection_url_descriptions$ = SubLFiles.deflexical( "*SDBC-DATABASE-CONNECTION-URL-DESCRIPTIONS*", maybeDefault( $sym282$_SDBC_DATABASE_CONNECTION_URL_DESCRIPTIONS_,
        $sdbc_database_connection_url_descriptions$, () -> ( dictionary.new_dictionary( EQUAL, UNPROVIDED ) ) ) );
    $sdbc_db2_port$ = SubLFiles.deflexical( "*SDBC-DB2-PORT*", ( maybeDefault( $sym331$_SDBC_DB2_PORT_, $sdbc_db2_port$, $int332$50001 ) ) );
    $sdbc_sybase_iq_port$ = SubLFiles.deflexical( "*SDBC-SYBASE-IQ-PORT*", ( maybeDefault( $sym338$_SDBC_SYBASE_IQ_PORT_, $sdbc_sybase_iq_port$, $int339$2638 ) ) );
    $sdbc_test_row_cardinality$ = SubLFiles.deflexical( "*SDBC-TEST-ROW-CARDINALITY*", $int17$25 );
    return NIL;
  }

  public static SubLObject setup_sdbc_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sql_connection$.getGlobalValue(), Symbols.symbol_function( $sym44$SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list45 );
    Structures.def_csetf( $sym46$SQLC_DB, $sym47$_CSETF_SQLC_DB );
    Structures.def_csetf( $sym48$SQLC_USER, $sym49$_CSETF_SQLC_USER );
    Structures.def_csetf( $sym50$SQLC_DBMS_SERVER, $sym51$_CSETF_SQLC_DBMS_SERVER );
    Structures.def_csetf( $sym52$SQLC_PORT, $sym53$_CSETF_SQLC_PORT );
    Structures.def_csetf( $sym54$SQLC_CHANNEL, $sym55$_CSETF_SQLC_CHANNEL );
    Structures.def_csetf( $sym56$SQLC_STATEMENTS, $sym57$_CSETF_SQLC_STATEMENTS );
    Structures.def_csetf( $sym58$SQLC_LOCK, $sym59$_CSETF_SQLC_LOCK );
    Structures.def_csetf( $sym60$SQLC_SUBPROTOCOL, $sym61$_CSETF_SQLC_SUBPROTOCOL );
    Structures.def_csetf( $sym62$SQLC_PROXY_SERVER, $sym63$_CSETF_SQLC_PROXY_SERVER );
    Structures.def_csetf( $sym64$SQLC_ERROR_HANDLING, $sym65$_CSETF_SQLC_ERROR_HANDLING );
    Structures.def_csetf( $sym66$SQLC_TICKETS, $sym67$_CSETF_SQLC_TICKETS );
    Structures.def_csetf( $sym68$SQLC_MAILMAN, $sym69$_CSETF_SQLC_MAILMAN );
    Equality.identity( $sym37$SQL_CONNECTION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_connection$.getGlobalValue(), Symbols.symbol_function( $sym87$VISIT_DEFSTRUCT_OBJECT_SQL_CONNECTION_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sql_ticket$.getGlobalValue(), Symbols.symbol_function( $sym116$SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list117 );
    Structures.def_csetf( $sym118$SQL_TICKET_SEMAPHORE, $sym119$_CSETF_SQL_TICKET_SEMAPHORE );
    Structures.def_csetf( $sym120$SQL_TICKET_RESULT, $sym121$_CSETF_SQL_TICKET_RESULT );
    Equality.identity( $sym109$SQL_TICKET );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_ticket$.getGlobalValue(), Symbols.symbol_function( $sym125$VISIT_DEFSTRUCT_OBJECT_SQL_TICKET_METHOD ) );
    access_macros.register_macro_helper( $sym138$SQLC_SET_ERROR_HANDLING, $sym139$SQLS_EXECUTE_TRANSACTION );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sdbc_error$.getGlobalValue(), Symbols.symbol_function( $sym149$SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list150 );
    Structures.def_csetf( $sym151$SDBC_ERROR_TYPE, $sym152$_CSETF_SDBC_ERROR_TYPE );
    Structures.def_csetf( $sym153$SDBC_ERROR_MESSAGE, $sym154$_CSETF_SDBC_ERROR_MESSAGE );
    Structures.def_csetf( $sym155$SDBC_ERROR_CODE, $sym156$_CSETF_SDBC_ERROR_CODE );
    Equality.identity( $sym142$SDBC_ERROR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sdbc_error$.getGlobalValue(), Symbols.symbol_function( $sym161$VISIT_DEFSTRUCT_OBJECT_SDBC_ERROR_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sql_result_set$.getGlobalValue(), Symbols.symbol_function( $sym181$SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list182 );
    Structures.def_csetf( $sym183$SQLRS_ROWS, $sym184$_CSETF_SQLRS_ROWS );
    Structures.def_csetf( $sym185$SQLRS_CURRENT, $sym186$_CSETF_SQLRS_CURRENT );
    Structures.def_csetf( $sym187$SQLRS_LAST, $sym188$_CSETF_SQLRS_LAST );
    Structures.def_csetf( $sym189$SQLRS_START, $sym190$_CSETF_SQLRS_START );
    Structures.def_csetf( $sym191$SQLRS_CONNECTION, $sym192$_CSETF_SQLRS_CONNECTION );
    Structures.def_csetf( $sym193$SQLRS_BLOCK_SIZE, $sym194$_CSETF_SQLRS_BLOCK_SIZE );
    Structures.def_csetf( $sym195$SQLRS_ID, $sym196$_CSETF_SQLRS_ID );
    Equality.identity( $sym174$SQL_RESULT_SET );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_result_set$.getGlobalValue(), Symbols.symbol_function( $sym205$VISIT_DEFSTRUCT_OBJECT_SQL_RESULT_SET_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sql_statement$.getGlobalValue(), Symbols.symbol_function( $sym224$SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list225 );
    Structures.def_csetf( $sym226$SQLS_CONNECTION, $sym227$_CSETF_SQLS_CONNECTION );
    Structures.def_csetf( $sym228$SQLS_ID, $sym229$_CSETF_SQLS_ID );
    Structures.def_csetf( $sym230$SQLS_SQL, $sym231$_CSETF_SQLS_SQL );
    Structures.def_csetf( $sym232$SQLS_SETTINGS, $sym233$_CSETF_SQLS_SETTINGS );
    Structures.def_csetf( $sym234$SQLS_BATCH, $sym235$_CSETF_SQLS_BATCH );
    Structures.def_csetf( $sym236$SQLS_RS, $sym237$_CSETF_SQLS_RS );
    Equality.identity( $sym218$SQL_STATEMENT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_statement$.getGlobalValue(), Symbols.symbol_function( $sym243$VISIT_DEFSTRUCT_OBJECT_SQL_STATEMENT_METHOD ) );
    access_macros.register_macro_helper( $sym251$SQLS_GET_CONNECTION, $sym139$SQLS_EXECUTE_TRANSACTION );
    generic_testing.define_test_case_table_int( $sym273$NEW_DB_URL, ConsesLow.list( new SubLObject[] { $kw274$TEST, Symbols.symbol_function( $sym275$STRING_ ), $kw276$OWNER, NIL, $kw277$CLASSES, NIL, $kw278$KB,
      $kw279$TINY, $kw280$WORKING_, T
    } ), $list281 );
    subl_macro_promotions.declare_defglobal( $sym282$_SDBC_DATABASE_CONNECTION_URL_DESCRIPTIONS_ );
    access_macros.register_external_symbol( $sym289$GET_ALL_SDBC_DATABASE_SUB_PROTOCOLS );
    add_sdbc_database_connection_url_description( $str10$postgresql, $list299, $list300, $list301, $list302 );
    add_sdbc_database_connection_url_description( $str303$mysql, $list299, $list304, $list301, $list305 );
    add_sdbc_database_connection_url_description( $str306$oracle, $list307, NIL, NIL, $list308 );
    add_sdbc_database_connection_url_description( $str309$sqlserver, $list310, $list311, $list312, $list313 );
    add_sdbc_database_connection_url_description( $str314$microsoft_sqlserver, $list315, $list311, $list312, $list313 );
    add_sdbc_database_connection_url_description( $str316$odbc, $list317, $list318, $list312, NIL );
    add_sdbc_database_connection_url_description( $str319$sybase, $list320, $list321, $list312, $list322 );
    add_sdbc_database_connection_url_description( $str323$derby, $list299, $list304, $list312, $list324 );
    add_sdbc_database_connection_url_description( $str325$st, $list299, $list326, $list301, $list327 );
    add_sdbc_database_connection_url_description( $str328$poiseschema, $list329, NIL, $list301, NIL );
    add_sdbc_database_connection_url_description( $str330$poisedata, $list317, NIL, $list301, NIL );
    access_macros.register_external_symbol( $sym331$_SDBC_DB2_PORT_ );
    subl_macro_promotions.declare_defglobal( $sym331$_SDBC_DB2_PORT_ );
    access_macros.register_external_symbol( $sym333$SET_SDBC_DB2_PORT );
    add_sdbc_database_connection_url_description( $str334$db2, $list335, $list304, $list336, $list337 );
    access_macros.register_external_symbol( $sym338$_SDBC_SYBASE_IQ_PORT_ );
    subl_macro_promotions.declare_defglobal( $sym338$_SDBC_SYBASE_IQ_PORT_ );
    access_macros.register_external_symbol( $sym340$SET_SDBC_SYBASE_IQ_PORT );
    add_sdbc_database_connection_url_description( $str341$sybase_iq, $list342, $list321, $list343, $list344 );
    access_macros.register_macro_helper( $sym393$SQLS_HANDLE_COMMIT_ERROR, $sym139$SQLS_EXECUTE_TRANSACTION );
    access_macros.register_macro_helper( $sym394$SQLS_HANDLE_ROLLBACK, $sym139$SQLS_EXECUTE_TRANSACTION );
    access_macros.register_macro_helper( $sym396$SQLS_HANDLE_TRANSACTION_ERRORS, $sym139$SQLS_EXECUTE_TRANSACTION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sdbc_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sdbc_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sdbc_file();
  }

  public static final class $sql_connection_native
      extends
        SubLStructNative
  {
    public SubLObject $db;
    public SubLObject $user;
    public SubLObject $dbms_server;
    public SubLObject $port;
    public SubLObject $channel;
    public SubLObject $statements;
    public SubLObject $lock;
    public SubLObject $subprotocol;
    public SubLObject $proxy_server;
    public SubLObject $error_handling;
    public SubLObject $tickets;
    public SubLObject $mailman;
    private static final SubLStructDeclNative structDecl;

    public $sql_connection_native()
    {
      this.$db = CommonSymbols.NIL;
      this.$user = CommonSymbols.NIL;
      this.$dbms_server = CommonSymbols.NIL;
      this.$port = CommonSymbols.NIL;
      this.$channel = CommonSymbols.NIL;
      this.$statements = CommonSymbols.NIL;
      this.$lock = CommonSymbols.NIL;
      this.$subprotocol = CommonSymbols.NIL;
      this.$proxy_server = CommonSymbols.NIL;
      this.$error_handling = CommonSymbols.NIL;
      this.$tickets = CommonSymbols.NIL;
      this.$mailman = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sql_connection_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$db;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$user;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$dbms_server;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$port;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$channel;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$statements;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$subprotocol;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$proxy_server;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$error_handling;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$tickets;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$mailman;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$db = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$user = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$dbms_server = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$port = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$channel = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$statements = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$subprotocol = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$proxy_server = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$error_handling = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$tickets = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$mailman = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sql_connection_native.class, $sym37$SQL_CONNECTION, $sym38$SQL_CONNECTION_P, $list39, $list40, new String[] { "$db", "$user", "$dbms_server", "$port", "$channel",
        "$statements", "$lock", "$subprotocol", "$proxy_server", "$error_handling", "$tickets", "$mailman"
      }, $list41, $list42, $sym43$SQLC_PRINT );
    }
  }

  public static final class $sql_connection_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sql_connection_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SQL-CONNECTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sql_connection_p( arg1 );
    }
  }

  public static final class $sql_ticket_native
      extends
        SubLStructNative
  {
    public SubLObject $semaphore;
    public SubLObject $result;
    private static final SubLStructDeclNative structDecl;

    public $sql_ticket_native()
    {
      this.$semaphore = CommonSymbols.NIL;
      this.$result = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sql_ticket_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$semaphore;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$result;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$semaphore = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$result = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sql_ticket_native.class, $sym109$SQL_TICKET, $sym110$SQL_TICKET_P, $list111, $list112, new String[] { "$semaphore", "$result"
      }, $list113, $list114, $sym115$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sql_ticket_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sql_ticket_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SQL-TICKET-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sql_ticket_p( arg1 );
    }
  }

  public static final class $sdbc_error_native
      extends
        SubLStructNative
  {
    public SubLObject $type;
    public SubLObject $message;
    public SubLObject $code;
    private static final SubLStructDeclNative structDecl;

    public $sdbc_error_native()
    {
      this.$type = CommonSymbols.NIL;
      this.$message = CommonSymbols.NIL;
      this.$code = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sdbc_error_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$message;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$code;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$message = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$code = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sdbc_error_native.class, $sym142$SDBC_ERROR, $sym143$SDBC_ERROR_P, $list144, $list145, new String[] { "$type", "$message", "$code"
      }, $list146, $list147, $sym148$SDBC_ERROR_PRINT );
    }
  }

  public static final class $sdbc_error_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sdbc_error_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SDBC-ERROR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sdbc_error_p( arg1 );
    }
  }

  public static final class $sql_result_set_native
      extends
        SubLStructNative
  {
    public SubLObject $rows;
    public SubLObject $current;
    public SubLObject $last;
    public SubLObject $start;
    public SubLObject $connection;
    public SubLObject $block_size;
    public SubLObject $id;
    private static final SubLStructDeclNative structDecl;

    public $sql_result_set_native()
    {
      this.$rows = CommonSymbols.NIL;
      this.$current = CommonSymbols.NIL;
      this.$last = CommonSymbols.NIL;
      this.$start = CommonSymbols.NIL;
      this.$connection = CommonSymbols.NIL;
      this.$block_size = CommonSymbols.NIL;
      this.$id = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sql_result_set_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$rows;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$current;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$last;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$start;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$connection;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$block_size;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$id;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$rows = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$current = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$last = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$start = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$connection = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$block_size = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$id = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sql_result_set_native.class, $sym174$SQL_RESULT_SET, $sym175$SQL_RESULT_SET_P, $list176, $list177, new String[] { "$rows", "$current", "$last", "$start",
        "$connection", "$block_size", "$id"
      }, $list178, $list179, $sym180$SQLRS_PRINT );
    }
  }

  public static final class $sql_result_set_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sql_result_set_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SQL-RESULT-SET-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sql_result_set_p( arg1 );
    }
  }

  public static final class $sql_statement_native
      extends
        SubLStructNative
  {
    public SubLObject $connection;
    public SubLObject $id;
    public SubLObject $sql;
    public SubLObject $settings;
    public SubLObject $batch;
    public SubLObject $rs;
    private static final SubLStructDeclNative structDecl;

    public $sql_statement_native()
    {
      this.$connection = CommonSymbols.NIL;
      this.$id = CommonSymbols.NIL;
      this.$sql = CommonSymbols.NIL;
      this.$settings = CommonSymbols.NIL;
      this.$batch = CommonSymbols.NIL;
      this.$rs = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sql_statement_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$connection;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$sql;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$settings;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$batch;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$rs;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$connection = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$sql = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$settings = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$batch = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$rs = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sql_statement_native.class, $sym218$SQL_STATEMENT, $sym219$SQL_STATEMENT_P, $list220, $list221, new String[] { "$connection", "$id", "$sql", "$settings", "$batch",
        "$rs"
      }, $list222, $list223, $sym115$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sql_statement_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sql_statement_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SQL-STATEMENT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sql_statement_p( arg1 );
    }
  }
  public static final SubLFile me = new sdbc();
  public static final String myName = "com.cyc.cycjava.cycl.sdbc";
  public static final String myFingerPrint = "cb7d9e5569a0d044cd6308d983347b59702145cdcd41d83c1a952b9c3837b56a";
  public static SubLSymbol $dbms_server$ = null;
  public static SubLSymbol $sdbc_proxy_server$ = null;
  public static SubLSymbol $sql_port$ = null;
  public static SubLSymbol $sql_protocol$ = null;
  public static SubLSymbol $sql_subprotocol$ = null;
  public static SubLSymbol $sql_connection_timeout$ = null;
  public static SubLSymbol $connection_id$ = null;
  private static SubLSymbol $result_set_block_size$ = null;
  private static SubLSymbol $quit$ = null;
  private static SubLSymbol $execute_update$ = null;
  private static SubLSymbol $execute_query$ = null;
  private static SubLSymbol $prepare_statement$ = null;
  private static SubLSymbol $create_statement$ = null;
  private static SubLSymbol $set_bytes$ = null;
  private static SubLSymbol $ps_execute_update$ = null;
  private static SubLSymbol $ps_execute_query$ = null;
  private static SubLSymbol $set_int$ = null;
  private static SubLSymbol $close_statement$ = null;
  private static SubLSymbol $new_connection$ = null;
  private static SubLSymbol $set_string$ = null;
  private static SubLSymbol $set_long$ = null;
  private static SubLSymbol $set_double$ = null;
  private static SubLSymbol $set_float$ = null;
  private static SubLSymbol $execute_batch$ = null;
  private static SubLSymbol $get_rows$ = null;
  private static SubLSymbol $close_result_set$ = null;
  private static SubLSymbol $execute_update_auto_keys$ = null;
  private static SubLSymbol $get_generated_keys$ = null;
  private static SubLSymbol $set_auto_commit$ = null;
  private static SubLSymbol $commit$ = null;
  private static SubLSymbol $rollback$ = null;
  private static SubLSymbol $get_transaction_isolation$ = null;
  private static SubLSymbol $set_transaction_isolation$ = null;
  private static SubLSymbol $get_auto_commit$ = null;
  private static SubLSymbol $get_tables$ = null;
  private static SubLSymbol $get_columns$ = null;
  private static SubLSymbol $get_primary_keys$ = null;
  private static SubLSymbol $get_imported_keys$ = null;
  private static SubLSymbol $get_exported_keys$ = null;
  private static SubLSymbol $get_index_info$ = null;
  private static SubLSymbol $cancel$ = null;
  private static SubLSymbol $get_max_connections$ = null;
  private static SubLSymbol $stop_response$ = null;
  private static SubLSymbol $integer_response$ = null;
  private static SubLSymbol $result_set_response$ = null;
  private static SubLSymbol $void_response$ = null;
  private static SubLSymbol $connection$ = null;
  private static SubLSymbol $update_counts$ = null;
  private static SubLSymbol $transaction_isolation_level$ = null;
  private static SubLSymbol $boolean$ = null;
  private static SubLSymbol $io_error$ = null;
  private static SubLSymbol $sql_error$ = null;
  private static SubLSymbol $unknown_error$ = null;
  private static SubLSymbol $client_error$ = null;
  private static SubLSymbol $commit_error$ = null;
  private static SubLSymbol $rollback_error$ = null;
  private static SubLSymbol $transaction_error$ = null;
  private static SubLSymbol $batch_update_error$ = null;
  public static SubLSymbol $dtp_sql_connection$ = null;
  public static SubLSymbol $dtp_sql_ticket$ = null;
  public static SubLSymbol $sql_connection_timeout_seconds$ = null;
  public static SubLSymbol $sql_connection_timeout_seconds_within_inference$ = null;
  public static SubLSymbol $dtp_sdbc_error$ = null;
  private static SubLSymbol $sdbc_error_decoding$ = null;
  public static SubLSymbol $dtp_sql_result_set$ = null;
  public static SubLSymbol $dtp_sql_statement$ = null;
  public static SubLSymbol $sdbc_database_connection_url_descriptions$ = null;
  public static SubLSymbol $sdbc_db2_port$ = null;
  public static SubLSymbol $sdbc_sybase_iq_port$ = null;
  private static SubLSymbol $sdbc_test_row_cardinality$ = null;
  private static final SubLList $list0 = ConsesLow.list( makeString( "application.dbms-server" ) );
  private static final SubLSymbol $sym1$_DBMS_SERVER_ = makeSymbol( "*DBMS-SERVER*" );
  private static final SubLString $str2$db_server_cyc_com = makeString( "db-server.cyc.com" );
  private static final SubLSymbol $kw3$LEXICAL = makeKeyword( "LEXICAL" );
  private static final SubLList $list4 = ConsesLow.list( makeString( "application.proxy-server" ) );
  private static final SubLSymbol $sym5$_SDBC_PROXY_SERVER_ = makeSymbol( "*SDBC-PROXY-SERVER*" );
  private static final SubLList $list6 = ConsesLow.list( makeString( "application.sql-port" ) );
  private static final SubLSymbol $sym7$_SQL_PORT_ = makeSymbol( "*SQL-PORT*" );
  private static final SubLInteger $int8$9999 = makeInteger( 9999 );
  private static final SubLString $str9$jdbc = makeString( "jdbc" );
  private static final SubLString $str10$postgresql = makeString( "postgresql" );
  private static final SubLString $str11$CONNECTION = makeString( "CONNECTION" );
  private static final SubLInteger $int12$1000 = makeInteger( 1000 );
  private static final SubLInteger $int13$21 = makeInteger( 21 );
  private static final SubLInteger $int14$22 = makeInteger( 22 );
  private static final SubLInteger $int15$23 = makeInteger( 23 );
  private static final SubLInteger $int16$24 = makeInteger( 24 );
  private static final SubLInteger $int17$25 = makeInteger( 25 );
  private static final SubLInteger $int18$26 = makeInteger( 26 );
  private static final SubLInteger $int19$27 = makeInteger( 27 );
  private static final SubLInteger $int20$28 = makeInteger( 28 );
  private static final SubLInteger $int21$29 = makeInteger( 29 );
  private static final SubLInteger $int22$30 = makeInteger( 30 );
  private static final SubLInteger $int23$31 = makeInteger( 31 );
  private static final SubLInteger $int24$32 = makeInteger( 32 );
  private static final SubLInteger $int25$33 = makeInteger( 33 );
  private static final SubLInteger $int26$_2 = makeInteger( -2 );
  private static final SubLInteger $int27$_3 = makeInteger( -3 );
  private static final SubLInteger $int28$_4 = makeInteger( -4 );
  private static final SubLInteger $int29$_5 = makeInteger( -5 );
  private static final SubLInteger $int30$_6 = makeInteger( -6 );
  private static final SubLInteger $int31$_7 = makeInteger( -7 );
  private static final SubLInteger $int32$_8 = makeInteger( -8 );
  private static final SubLSymbol $sym33$STRINGP = makeSymbol( "STRINGP" );
  private static final SubLSymbol $sym34$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
  private static final SubLSymbol $sym35$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
  private static final SubLSymbol $kw36$PRIVATE = makeKeyword( "PRIVATE" );
  private static final SubLSymbol $sym37$SQL_CONNECTION = makeSymbol( "SQL-CONNECTION" );
  private static final SubLSymbol $sym38$SQL_CONNECTION_P = makeSymbol( "SQL-CONNECTION-P" );
  private static final SubLList $list39 = ConsesLow.list( new SubLObject[] { makeSymbol( "DB" ), makeSymbol( "USER" ), makeSymbol( "DBMS-SERVER" ), makeSymbol( "PORT" ), makeSymbol( "CHANNEL" ), makeSymbol(
      "STATEMENTS" ), makeSymbol( "LOCK" ), makeSymbol( "SUBPROTOCOL" ), makeSymbol( "PROXY-SERVER" ), makeSymbol( "ERROR-HANDLING" ), makeSymbol( "TICKETS" ), makeSymbol( "MAILMAN" )
  } );
  private static final SubLList $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "DB" ), makeKeyword( "USER" ), makeKeyword( "DBMS-SERVER" ), makeKeyword( "PORT" ), makeKeyword( "CHANNEL" ), makeKeyword(
      "STATEMENTS" ), makeKeyword( "LOCK" ), makeKeyword( "SUBPROTOCOL" ), makeKeyword( "PROXY-SERVER" ), makeKeyword( "ERROR-HANDLING" ), makeKeyword( "TICKETS" ), makeKeyword( "MAILMAN" )
  } );
  private static final SubLList $list41 = ConsesLow.list( new SubLObject[] { makeSymbol( "SQLC-DB" ), makeSymbol( "SQLC-USER" ), makeSymbol( "SQLC-DBMS-SERVER" ), makeSymbol( "SQLC-PORT" ), makeSymbol( "SQLC-CHANNEL" ),
    makeSymbol( "SQLC-STATEMENTS" ), makeSymbol( "SQLC-LOCK" ), makeSymbol( "SQLC-SUBPROTOCOL" ), makeSymbol( "SQLC-PROXY-SERVER" ), makeSymbol( "SQLC-ERROR-HANDLING" ), makeSymbol( "SQLC-TICKETS" ), makeSymbol(
        "SQLC-MAILMAN" )
  } );
  private static final SubLList $list42 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-SQLC-DB" ), makeSymbol( "_CSETF-SQLC-USER" ), makeSymbol( "_CSETF-SQLC-DBMS-SERVER" ), makeSymbol( "_CSETF-SQLC-PORT" ),
    makeSymbol( "_CSETF-SQLC-CHANNEL" ), makeSymbol( "_CSETF-SQLC-STATEMENTS" ), makeSymbol( "_CSETF-SQLC-LOCK" ), makeSymbol( "_CSETF-SQLC-SUBPROTOCOL" ), makeSymbol( "_CSETF-SQLC-PROXY-SERVER" ), makeSymbol(
        "_CSETF-SQLC-ERROR-HANDLING" ), makeSymbol( "_CSETF-SQLC-TICKETS" ), makeSymbol( "_CSETF-SQLC-MAILMAN" )
  } );
  private static final SubLSymbol $sym43$SQLC_PRINT = makeSymbol( "SQLC-PRINT" );
  private static final SubLSymbol $sym44$SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE" );
  private static final SubLList $list45 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SQL-CONNECTION-P" ) );
  private static final SubLSymbol $sym46$SQLC_DB = makeSymbol( "SQLC-DB" );
  private static final SubLSymbol $sym47$_CSETF_SQLC_DB = makeSymbol( "_CSETF-SQLC-DB" );
  private static final SubLSymbol $sym48$SQLC_USER = makeSymbol( "SQLC-USER" );
  private static final SubLSymbol $sym49$_CSETF_SQLC_USER = makeSymbol( "_CSETF-SQLC-USER" );
  private static final SubLSymbol $sym50$SQLC_DBMS_SERVER = makeSymbol( "SQLC-DBMS-SERVER" );
  private static final SubLSymbol $sym51$_CSETF_SQLC_DBMS_SERVER = makeSymbol( "_CSETF-SQLC-DBMS-SERVER" );
  private static final SubLSymbol $sym52$SQLC_PORT = makeSymbol( "SQLC-PORT" );
  private static final SubLSymbol $sym53$_CSETF_SQLC_PORT = makeSymbol( "_CSETF-SQLC-PORT" );
  private static final SubLSymbol $sym54$SQLC_CHANNEL = makeSymbol( "SQLC-CHANNEL" );
  private static final SubLSymbol $sym55$_CSETF_SQLC_CHANNEL = makeSymbol( "_CSETF-SQLC-CHANNEL" );
  private static final SubLSymbol $sym56$SQLC_STATEMENTS = makeSymbol( "SQLC-STATEMENTS" );
  private static final SubLSymbol $sym57$_CSETF_SQLC_STATEMENTS = makeSymbol( "_CSETF-SQLC-STATEMENTS" );
  private static final SubLSymbol $sym58$SQLC_LOCK = makeSymbol( "SQLC-LOCK" );
  private static final SubLSymbol $sym59$_CSETF_SQLC_LOCK = makeSymbol( "_CSETF-SQLC-LOCK" );
  private static final SubLSymbol $sym60$SQLC_SUBPROTOCOL = makeSymbol( "SQLC-SUBPROTOCOL" );
  private static final SubLSymbol $sym61$_CSETF_SQLC_SUBPROTOCOL = makeSymbol( "_CSETF-SQLC-SUBPROTOCOL" );
  private static final SubLSymbol $sym62$SQLC_PROXY_SERVER = makeSymbol( "SQLC-PROXY-SERVER" );
  private static final SubLSymbol $sym63$_CSETF_SQLC_PROXY_SERVER = makeSymbol( "_CSETF-SQLC-PROXY-SERVER" );
  private static final SubLSymbol $sym64$SQLC_ERROR_HANDLING = makeSymbol( "SQLC-ERROR-HANDLING" );
  private static final SubLSymbol $sym65$_CSETF_SQLC_ERROR_HANDLING = makeSymbol( "_CSETF-SQLC-ERROR-HANDLING" );
  private static final SubLSymbol $sym66$SQLC_TICKETS = makeSymbol( "SQLC-TICKETS" );
  private static final SubLSymbol $sym67$_CSETF_SQLC_TICKETS = makeSymbol( "_CSETF-SQLC-TICKETS" );
  private static final SubLSymbol $sym68$SQLC_MAILMAN = makeSymbol( "SQLC-MAILMAN" );
  private static final SubLSymbol $sym69$_CSETF_SQLC_MAILMAN = makeSymbol( "_CSETF-SQLC-MAILMAN" );
  private static final SubLSymbol $kw70$DB = makeKeyword( "DB" );
  private static final SubLSymbol $kw71$USER = makeKeyword( "USER" );
  private static final SubLSymbol $kw72$DBMS_SERVER = makeKeyword( "DBMS-SERVER" );
  private static final SubLSymbol $kw73$PORT = makeKeyword( "PORT" );
  private static final SubLSymbol $kw74$CHANNEL = makeKeyword( "CHANNEL" );
  private static final SubLSymbol $kw75$STATEMENTS = makeKeyword( "STATEMENTS" );
  private static final SubLSymbol $kw76$LOCK = makeKeyword( "LOCK" );
  private static final SubLSymbol $kw77$SUBPROTOCOL = makeKeyword( "SUBPROTOCOL" );
  private static final SubLSymbol $kw78$PROXY_SERVER = makeKeyword( "PROXY-SERVER" );
  private static final SubLSymbol $kw79$ERROR_HANDLING = makeKeyword( "ERROR-HANDLING" );
  private static final SubLSymbol $kw80$TICKETS = makeKeyword( "TICKETS" );
  private static final SubLSymbol $kw81$MAILMAN = makeKeyword( "MAILMAN" );
  private static final SubLString $str82$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
  private static final SubLSymbol $kw83$BEGIN = makeKeyword( "BEGIN" );
  private static final SubLSymbol $sym84$MAKE_SQL_CONNECTION = makeSymbol( "MAKE-SQL-CONNECTION" );
  private static final SubLSymbol $kw85$SLOT = makeKeyword( "SLOT" );
  private static final SubLSymbol $kw86$END = makeKeyword( "END" );
  private static final SubLSymbol $sym87$VISIT_DEFSTRUCT_OBJECT_SQL_CONNECTION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SQL-CONNECTION-METHOD" );
  private static final SubLString $str88$__SQL_CONNECTION_ = makeString( "#<SQL-CONNECTION " );
  private static final SubLString $str89$closed_ = makeString( "closed " );
  private static final SubLString $str90$to_ = makeString( "to " );
  private static final SubLString $str91$__ = makeString( " [" );
  private static final SubLString $str92$_ = makeString( "/" );
  private static final SubLString $str93$__ = makeString( "]>" );
  private static final SubLList $list94 = ConsesLow.list( makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "DBMS-SERVER" ), makeSymbol( "*DBMS-SERVER*" ) ), makeSymbol( "DBMS-PORT" ), ConsesLow.list( makeSymbol(
      "SUBPROTOCOL" ), makeSymbol( "*SQL-SUBPROTOCOL*" ) ), ConsesLow.list( makeSymbol( "PROXY-SERVER" ), makeSymbol( "DBMS-SERVER" ) ), ConsesLow.list( makeSymbol( "PORT" ), makeSymbol( "*SQL-PORT*" ) ), ConsesLow.list(
          makeSymbol( "TIMEOUT" ), makeSymbol( "*SQL-CONNECTION-TIMEOUT*" ) ) );
  private static final SubLList $list95 = ConsesLow.list( makeKeyword( "DBMS-SERVER" ), makeKeyword( "DBMS-PORT" ), makeKeyword( "SUBPROTOCOL" ), makeKeyword( "PROXY-SERVER" ), makeKeyword( "PORT" ), makeKeyword(
      "TIMEOUT" ) );
  private static final SubLSymbol $kw96$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
  private static final SubLSymbol $kw97$DBMS_PORT = makeKeyword( "DBMS-PORT" );
  private static final SubLSymbol $kw98$TIMEOUT = makeKeyword( "TIMEOUT" );
  private static final SubLSymbol $sym99$INTEGERP = makeSymbol( "INTEGERP" );
  private static final SubLSymbol $sym100$NON_NEGATIVE_NUMBER_P = makeSymbol( "NON-NEGATIVE-NUMBER-P" );
  private static final SubLString $str101$SQL_connection_lock = makeString( "SQL connection lock" );
  private static final SubLSymbol $kw102$RETURN = makeKeyword( "RETURN" );
  private static final SubLString $str103$Trying_to_open_from_a_null_sqlc_c = makeString( "Trying to open from a null sqlc channel." );
  private static final SubLString $str104$timeout = makeString( "timeout" );
  private static final SubLSymbol $sym105$_EXIT = makeSymbol( "%EXIT" );
  private static final SubLSymbol $sym106$SQL_OPEN_CONNECTION_P = makeSymbol( "SQL-OPEN-CONNECTION-P" );
  private static final SubLSymbol $sym107$BOOLEANP = makeSymbol( "BOOLEANP" );
  private static final SubLSymbol $sym108$SQL_TRANSACTION_LEVEL_P = makeSymbol( "SQL-TRANSACTION-LEVEL-P" );
  private static final SubLSymbol $sym109$SQL_TICKET = makeSymbol( "SQL-TICKET" );
  private static final SubLSymbol $sym110$SQL_TICKET_P = makeSymbol( "SQL-TICKET-P" );
  private static final SubLList $list111 = ConsesLow.list( makeSymbol( "SEMAPHORE" ), makeSymbol( "RESULT" ) );
  private static final SubLList $list112 = ConsesLow.list( makeKeyword( "SEMAPHORE" ), makeKeyword( "RESULT" ) );
  private static final SubLList $list113 = ConsesLow.list( makeSymbol( "SQL-TICKET-SEMAPHORE" ), makeSymbol( "SQL-TICKET-RESULT" ) );
  private static final SubLList $list114 = ConsesLow.list( makeSymbol( "_CSETF-SQL-TICKET-SEMAPHORE" ), makeSymbol( "_CSETF-SQL-TICKET-RESULT" ) );
  private static final SubLSymbol $sym115$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
  private static final SubLSymbol $sym116$SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE" );
  private static final SubLList $list117 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SQL-TICKET-P" ) );
  private static final SubLSymbol $sym118$SQL_TICKET_SEMAPHORE = makeSymbol( "SQL-TICKET-SEMAPHORE" );
  private static final SubLSymbol $sym119$_CSETF_SQL_TICKET_SEMAPHORE = makeSymbol( "_CSETF-SQL-TICKET-SEMAPHORE" );
  private static final SubLSymbol $sym120$SQL_TICKET_RESULT = makeSymbol( "SQL-TICKET-RESULT" );
  private static final SubLSymbol $sym121$_CSETF_SQL_TICKET_RESULT = makeSymbol( "_CSETF-SQL-TICKET-RESULT" );
  private static final SubLSymbol $kw122$SEMAPHORE = makeKeyword( "SEMAPHORE" );
  private static final SubLSymbol $kw123$RESULT = makeKeyword( "RESULT" );
  private static final SubLSymbol $sym124$MAKE_SQL_TICKET = makeSymbol( "MAKE-SQL-TICKET" );
  private static final SubLSymbol $sym125$VISIT_DEFSTRUCT_OBJECT_SQL_TICKET_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SQL-TICKET-METHOD" );
  private static final SubLString $str126$SQL_Request = makeString( "SQL Request" );
  private static final SubLInteger $int127$212 = makeInteger( 212 );
  private static final SubLString $str128$Timed_out_after_ = makeString( "Timed out after " );
  private static final SubLString $str129$_seconds_retrieving_SQL_ticket = makeString( " seconds retrieving SQL ticket" );
  private static final SubLString $str130$SQL_Mailman_for_ = makeString( "SQL Mailman for " );
  private static final SubLSymbol $sym131$SQLC_DELIVER = makeSymbol( "SQLC-DELIVER" );
  private static final SubLString $str132$Implementation_error__no_ticket_f = makeString( "Implementation error: no ticket for result ~a" );
  private static final SubLString $str133$Trying_to_read_from_a_null_sqlc_c = makeString( "Trying to read from a null sqlc channel." );
  private static final SubLSymbol $kw134$THROW = makeKeyword( "THROW" );
  private static final SubLSymbol $kw135$WARN = makeKeyword( "WARN" );
  private static final SubLSymbol $sym136$SDBC_ERROR_HANDLING_TAG_P = makeSymbol( "SDBC-ERROR-HANDLING-TAG-P" );
  private static final SubLList $list137 = ConsesLow.list( makeKeyword( "TRANSACTION-NONE" ), makeKeyword( "TRANSACTION-READ-COMMITTED" ), makeKeyword( "TRANSACTION-READ-UNCOMMITTED" ), makeKeyword(
      "TRANSACTION-REPEATABLE-READ" ), makeKeyword( "TRANSACTION-SERIALIZABLE" ) );
  private static final SubLSymbol $sym138$SQLC_SET_ERROR_HANDLING = makeSymbol( "SQLC-SET-ERROR-HANDLING" );
  private static final SubLSymbol $sym139$SQLS_EXECUTE_TRANSACTION = makeSymbol( "SQLS-EXECUTE-TRANSACTION" );
  private static final SubLSymbol $kw140$STOP = makeKeyword( "STOP" );
  private static final SubLSymbol $kw141$NULL = makeKeyword( "NULL" );
  private static final SubLSymbol $sym142$SDBC_ERROR = makeSymbol( "SDBC-ERROR" );
  private static final SubLSymbol $sym143$SDBC_ERROR_P = makeSymbol( "SDBC-ERROR-P" );
  private static final SubLList $list144 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "MESSAGE" ), makeSymbol( "CODE" ) );
  private static final SubLList $list145 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "MESSAGE" ), makeKeyword( "CODE" ) );
  private static final SubLList $list146 = ConsesLow.list( makeSymbol( "SDBC-ERROR-TYPE" ), makeSymbol( "SDBC-ERROR-MESSAGE" ), makeSymbol( "SDBC-ERROR-CODE" ) );
  private static final SubLList $list147 = ConsesLow.list( makeSymbol( "_CSETF-SDBC-ERROR-TYPE" ), makeSymbol( "_CSETF-SDBC-ERROR-MESSAGE" ), makeSymbol( "_CSETF-SDBC-ERROR-CODE" ) );
  private static final SubLSymbol $sym148$SDBC_ERROR_PRINT = makeSymbol( "SDBC-ERROR-PRINT" );
  private static final SubLSymbol $sym149$SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE" );
  private static final SubLList $list150 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SDBC-ERROR-P" ) );
  private static final SubLSymbol $sym151$SDBC_ERROR_TYPE = makeSymbol( "SDBC-ERROR-TYPE" );
  private static final SubLSymbol $sym152$_CSETF_SDBC_ERROR_TYPE = makeSymbol( "_CSETF-SDBC-ERROR-TYPE" );
  private static final SubLSymbol $sym153$SDBC_ERROR_MESSAGE = makeSymbol( "SDBC-ERROR-MESSAGE" );
  private static final SubLSymbol $sym154$_CSETF_SDBC_ERROR_MESSAGE = makeSymbol( "_CSETF-SDBC-ERROR-MESSAGE" );
  private static final SubLSymbol $sym155$SDBC_ERROR_CODE = makeSymbol( "SDBC-ERROR-CODE" );
  private static final SubLSymbol $sym156$_CSETF_SDBC_ERROR_CODE = makeSymbol( "_CSETF-SDBC-ERROR-CODE" );
  private static final SubLSymbol $kw157$TYPE = makeKeyword( "TYPE" );
  private static final SubLSymbol $kw158$MESSAGE = makeKeyword( "MESSAGE" );
  private static final SubLSymbol $kw159$CODE = makeKeyword( "CODE" );
  private static final SubLSymbol $sym160$MAKE_SDBC_ERROR = makeSymbol( "MAKE-SDBC-ERROR" );
  private static final SubLSymbol $sym161$VISIT_DEFSTRUCT_OBJECT_SDBC_ERROR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SDBC-ERROR-METHOD" );
  private static final SubLString $str162$_a = makeString( "~a" );
  private static final SubLString $str163$SDBC__a___a = makeString( "SDBC ~a: ~a" );
  private static final SubLString $str164$__SDBC = makeString( "#<SDBC" );
  private static final SubLString $str165$_ERROR__ = makeString( "-ERROR: " );
  private static final SubLString $str166$_ = makeString( ">" );
  private static final SubLString $str167$_IO = makeString( "-IO" );
  private static final SubLString $str168$_SQL = makeString( "-SQL" );
  private static final SubLString $str169$ = makeString( "" );
  private static final SubLString $str170$_CLIENT = makeString( "-CLIENT" );
  private static final SubLString $str171$_TRANSACTION = makeString( "-TRANSACTION" );
  private static final SubLString $str172$_ROLLBACK = makeString( "-ROLLBACK" );
  private static final SubLString $str173$_BATCH_UPDATE = makeString( "-BATCH-UPDATE" );
  private static final SubLSymbol $sym174$SQL_RESULT_SET = makeSymbol( "SQL-RESULT-SET" );
  private static final SubLSymbol $sym175$SQL_RESULT_SET_P = makeSymbol( "SQL-RESULT-SET-P" );
  private static final SubLList $list176 = ConsesLow.list( makeSymbol( "ROWS" ), makeSymbol( "CURRENT" ), makeSymbol( "LAST" ), makeSymbol( "START" ), makeSymbol( "CONNECTION" ), makeSymbol( "BLOCK-SIZE" ), makeSymbol(
      "ID" ) );
  private static final SubLList $list177 = ConsesLow.list( makeKeyword( "ROWS" ), makeKeyword( "CURRENT" ), makeKeyword( "LAST" ), makeKeyword( "START" ), makeKeyword( "CONNECTION" ), makeKeyword( "BLOCK-SIZE" ),
      makeKeyword( "ID" ) );
  private static final SubLList $list178 = ConsesLow.list( makeSymbol( "SQLRS-ROWS" ), makeSymbol( "SQLRS-CURRENT" ), makeSymbol( "SQLRS-LAST" ), makeSymbol( "SQLRS-START" ), makeSymbol( "SQLRS-CONNECTION" ), makeSymbol(
      "SQLRS-BLOCK-SIZE" ), makeSymbol( "SQLRS-ID" ) );
  private static final SubLList $list179 = ConsesLow.list( makeSymbol( "_CSETF-SQLRS-ROWS" ), makeSymbol( "_CSETF-SQLRS-CURRENT" ), makeSymbol( "_CSETF-SQLRS-LAST" ), makeSymbol( "_CSETF-SQLRS-START" ), makeSymbol(
      "_CSETF-SQLRS-CONNECTION" ), makeSymbol( "_CSETF-SQLRS-BLOCK-SIZE" ), makeSymbol( "_CSETF-SQLRS-ID" ) );
  private static final SubLSymbol $sym180$SQLRS_PRINT = makeSymbol( "SQLRS-PRINT" );
  private static final SubLSymbol $sym181$SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE" );
  private static final SubLList $list182 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SQL-RESULT-SET-P" ) );
  private static final SubLSymbol $sym183$SQLRS_ROWS = makeSymbol( "SQLRS-ROWS" );
  private static final SubLSymbol $sym184$_CSETF_SQLRS_ROWS = makeSymbol( "_CSETF-SQLRS-ROWS" );
  private static final SubLSymbol $sym185$SQLRS_CURRENT = makeSymbol( "SQLRS-CURRENT" );
  private static final SubLSymbol $sym186$_CSETF_SQLRS_CURRENT = makeSymbol( "_CSETF-SQLRS-CURRENT" );
  private static final SubLSymbol $sym187$SQLRS_LAST = makeSymbol( "SQLRS-LAST" );
  private static final SubLSymbol $sym188$_CSETF_SQLRS_LAST = makeSymbol( "_CSETF-SQLRS-LAST" );
  private static final SubLSymbol $sym189$SQLRS_START = makeSymbol( "SQLRS-START" );
  private static final SubLSymbol $sym190$_CSETF_SQLRS_START = makeSymbol( "_CSETF-SQLRS-START" );
  private static final SubLSymbol $sym191$SQLRS_CONNECTION = makeSymbol( "SQLRS-CONNECTION" );
  private static final SubLSymbol $sym192$_CSETF_SQLRS_CONNECTION = makeSymbol( "_CSETF-SQLRS-CONNECTION" );
  private static final SubLSymbol $sym193$SQLRS_BLOCK_SIZE = makeSymbol( "SQLRS-BLOCK-SIZE" );
  private static final SubLSymbol $sym194$_CSETF_SQLRS_BLOCK_SIZE = makeSymbol( "_CSETF-SQLRS-BLOCK-SIZE" );
  private static final SubLSymbol $sym195$SQLRS_ID = makeSymbol( "SQLRS-ID" );
  private static final SubLSymbol $sym196$_CSETF_SQLRS_ID = makeSymbol( "_CSETF-SQLRS-ID" );
  private static final SubLSymbol $kw197$ROWS = makeKeyword( "ROWS" );
  private static final SubLSymbol $kw198$CURRENT = makeKeyword( "CURRENT" );
  private static final SubLSymbol $kw199$LAST = makeKeyword( "LAST" );
  private static final SubLSymbol $kw200$START = makeKeyword( "START" );
  private static final SubLSymbol $kw201$CONNECTION = makeKeyword( "CONNECTION" );
  private static final SubLSymbol $kw202$BLOCK_SIZE = makeKeyword( "BLOCK-SIZE" );
  private static final SubLSymbol $kw203$ID = makeKeyword( "ID" );
  private static final SubLSymbol $sym204$MAKE_SQL_RESULT_SET = makeSymbol( "MAKE-SQL-RESULT-SET" );
  private static final SubLSymbol $sym205$VISIT_DEFSTRUCT_OBJECT_SQL_RESULT_SET_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SQL-RESULT-SET-METHOD" );
  private static final SubLString $str206$_ = makeString( "(" );
  private static final SubLString $str207$_row__ = makeString( " row, " );
  private static final SubLString $str208$_rows__ = makeString( " rows, " );
  private static final SubLString $str209$_column_ = makeString( " column)" );
  private static final SubLString $str210$_columns_ = makeString( " columns)" );
  private static final SubLString $str211$closed = makeString( "closed" );
  private static final SubLSymbol $sym212$SQL_OPEN_RESULT_SET_P = makeSymbol( "SQL-OPEN-RESULT-SET-P" );
  private static final SubLString $str213$cursor_not_on_valid_row = makeString( "cursor not on valid row" );
  private static final SubLString $str214$invalid_column__a = makeString( "invalid column ~a" );
  private static final SubLSymbol $sym215$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
  private static final SubLSymbol $sym216$VECTORP = makeSymbol( "VECTORP" );
  private static final SubLString $str217$invalid_row__a = makeString( "invalid row ~a" );
  private static final SubLSymbol $sym218$SQL_STATEMENT = makeSymbol( "SQL-STATEMENT" );
  private static final SubLSymbol $sym219$SQL_STATEMENT_P = makeSymbol( "SQL-STATEMENT-P" );
  private static final SubLList $list220 = ConsesLow.list( makeSymbol( "CONNECTION" ), makeSymbol( "ID" ), makeSymbol( "SQL" ), makeSymbol( "SETTINGS" ), makeSymbol( "BATCH" ), makeSymbol( "RS" ) );
  private static final SubLList $list221 = ConsesLow.list( makeKeyword( "CONNECTION" ), makeKeyword( "ID" ), makeKeyword( "SQL" ), makeKeyword( "SETTINGS" ), makeKeyword( "BATCH" ), makeKeyword( "RS" ) );
  private static final SubLList $list222 = ConsesLow.list( makeSymbol( "SQLS-CONNECTION" ), makeSymbol( "SQLS-ID" ), makeSymbol( "SQLS-SQL" ), makeSymbol( "SQLS-SETTINGS" ), makeSymbol( "SQLS-BATCH" ), makeSymbol(
      "SQLS-RS" ) );
  private static final SubLList $list223 = ConsesLow.list( makeSymbol( "_CSETF-SQLS-CONNECTION" ), makeSymbol( "_CSETF-SQLS-ID" ), makeSymbol( "_CSETF-SQLS-SQL" ), makeSymbol( "_CSETF-SQLS-SETTINGS" ), makeSymbol(
      "_CSETF-SQLS-BATCH" ), makeSymbol( "_CSETF-SQLS-RS" ) );
  private static final SubLSymbol $sym224$SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE" );
  private static final SubLList $list225 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SQL-STATEMENT-P" ) );
  private static final SubLSymbol $sym226$SQLS_CONNECTION = makeSymbol( "SQLS-CONNECTION" );
  private static final SubLSymbol $sym227$_CSETF_SQLS_CONNECTION = makeSymbol( "_CSETF-SQLS-CONNECTION" );
  private static final SubLSymbol $sym228$SQLS_ID = makeSymbol( "SQLS-ID" );
  private static final SubLSymbol $sym229$_CSETF_SQLS_ID = makeSymbol( "_CSETF-SQLS-ID" );
  private static final SubLSymbol $sym230$SQLS_SQL = makeSymbol( "SQLS-SQL" );
  private static final SubLSymbol $sym231$_CSETF_SQLS_SQL = makeSymbol( "_CSETF-SQLS-SQL" );
  private static final SubLSymbol $sym232$SQLS_SETTINGS = makeSymbol( "SQLS-SETTINGS" );
  private static final SubLSymbol $sym233$_CSETF_SQLS_SETTINGS = makeSymbol( "_CSETF-SQLS-SETTINGS" );
  private static final SubLSymbol $sym234$SQLS_BATCH = makeSymbol( "SQLS-BATCH" );
  private static final SubLSymbol $sym235$_CSETF_SQLS_BATCH = makeSymbol( "_CSETF-SQLS-BATCH" );
  private static final SubLSymbol $sym236$SQLS_RS = makeSymbol( "SQLS-RS" );
  private static final SubLSymbol $sym237$_CSETF_SQLS_RS = makeSymbol( "_CSETF-SQLS-RS" );
  private static final SubLSymbol $kw238$SQL = makeKeyword( "SQL" );
  private static final SubLSymbol $kw239$SETTINGS = makeKeyword( "SETTINGS" );
  private static final SubLSymbol $kw240$BATCH = makeKeyword( "BATCH" );
  private static final SubLSymbol $kw241$RS = makeKeyword( "RS" );
  private static final SubLSymbol $sym242$MAKE_SQL_STATEMENT = makeSymbol( "MAKE-SQL-STATEMENT" );
  private static final SubLSymbol $sym243$VISIT_DEFSTRUCT_OBJECT_SQL_STATEMENT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SQL-STATEMENT-METHOD" );
  private static final SubLSymbol $sym244$SQL_OPEN_STATEMENT_P = makeSymbol( "SQL-OPEN-STATEMENT-P" );
  private static final SubLSymbol $sym245$SQL_PREPARED_OPEN_STATEMENT_P = makeSymbol( "SQL-PREPARED-OPEN-STATEMENT-P" );
  private static final SubLSymbol $sym246$BYTE_VECTOR_P = makeSymbol( "BYTE-VECTOR-P" );
  private static final SubLSymbol $sym247$JAVA_INTEGERP = makeSymbol( "JAVA-INTEGERP" );
  private static final SubLSymbol $sym248$JAVA_LONGP = makeSymbol( "JAVA-LONGP" );
  private static final SubLSymbol $sym249$JAVA_FLOATP = makeSymbol( "JAVA-FLOATP" );
  private static final SubLSymbol $sym250$JAVA_DOUBLEP = makeSymbol( "JAVA-DOUBLEP" );
  private static final SubLSymbol $sym251$SQLS_GET_CONNECTION = makeSymbol( "SQLS-GET-CONNECTION" );
  private static final SubLString $str252$STMT = makeString( "STMT" );
  private static final SubLString $str253$RS = makeString( "RS" );
  private static final SubLSymbol $sym254$LISTP = makeSymbol( "LISTP" );
  private static final SubLSymbol $sym255$SQLC_GET_TABLES = makeSymbol( "SQLC-GET-TABLES" );
  private static final SubLString $str256$SQLC_error___A = makeString( "SQLC error: ~A" );
  private static final SubLList $list257 = ConsesLow.list( new SubLObject[] { makeKeyword( "TABLE-CAT" ), makeKeyword( "TABLE-SCHEM" ), makeKeyword( "TABLE-NAME" ), makeKeyword( "TABLE-TYPE" ), makeKeyword( "REMARKS" ),
    makeKeyword( "TYPE-CAT" ), makeKeyword( "TYPE-SCHEM" ), makeKeyword( "TYPE-NAME" ), makeKeyword( "SELF-REFERENCING-COL-NAME" ), makeKeyword( "REF-GENERATION" )
  } );
  private static final SubLSymbol $sym258$SQLC_GET_COLUMNS = makeSymbol( "SQLC-GET-COLUMNS" );
  private static final SubLList $list259 = ConsesLow.list( new SubLObject[] { makeKeyword( "TABLE-CAT" ), makeKeyword( "TABLE-SCHEM" ), makeKeyword( "TABLE-NAME" ), makeKeyword( "COLUMN-NAME" ), makeKeyword(
      "DATA-TYPE" ), makeKeyword( "TYPE-NAME" ), makeKeyword( "COLUMN-SIZE" ), makeKeyword( "BUFFER-LENGTH" ), makeKeyword( "DECIMAL-DIGITS" ), makeKeyword( "NUM-PREC-RADIX" ), makeKeyword( "NULLABLE" ), makeKeyword(
          "REMARKS" ), makeKeyword( "COLUMN-DEF" ), makeKeyword( "SQL-DATA-TYPE" ), makeKeyword( "SQL-DATETIME-SUB" ), makeKeyword( "CHAR-OCTET-LENGTH" ), makeKeyword( "ORDINAL-POSITION" ), makeKeyword( "IS-NULLABLE" ),
    makeKeyword( "SCOPE-CATLOG" ), makeKeyword( "SCOPE-SCHEMA" ), makeKeyword( "SCOPE-TABLE" ), makeKeyword( "SOURCE-DATA-TYPE" )
  } );
  private static final SubLSymbol $sym260$SQLC_GET_PRIMARY_KEYS = makeSymbol( "SQLC-GET-PRIMARY-KEYS" );
  private static final SubLList $list261 = ConsesLow.list( makeKeyword( "TABLE-CAT" ), makeKeyword( "TABLE-SCHEM" ), makeKeyword( "TABLE-NAME" ), makeKeyword( "COLUMN-NAME" ), makeKeyword( "KEY-SEQ" ), makeKeyword(
      "PK-NAME" ) );
  private static final SubLSymbol $sym262$SQLC_GET_IMPORTED_KEYS = makeSymbol( "SQLC-GET-IMPORTED-KEYS" );
  private static final SubLList $list263 = ConsesLow.list( new SubLObject[] { makeKeyword( "PKTABLE-CAT" ), makeKeyword( "PKTABLE-SCHEM" ), makeKeyword( "PKTABLE-NAME" ), makeKeyword( "PKCOLUMN-NAME" ), makeKeyword(
      "FKTABLE-CAT" ), makeKeyword( "FKTABLE-SCHEM" ), makeKeyword( "FKTABLE-NAME" ), makeKeyword( "FKCOLUMN-NAME" ), makeKeyword( "KEY-SEQ" ), makeKeyword( "UPDATE-RULE" ), makeKeyword( "DELETE-RULE" ), makeKeyword(
          "FK-NAME" ), makeKeyword( "PK-NAME" ), makeKeyword( "DEFERRABILITY" )
  } );
  private static final SubLSymbol $sym264$SQLC_GET_EXPORTED_KEYS = makeSymbol( "SQLC-GET-EXPORTED-KEYS" );
  private static final SubLSymbol $sym265$SQLC_GET_INDEX_INFO = makeSymbol( "SQLC-GET-INDEX-INFO" );
  private static final SubLList $list266 = ConsesLow.list( new SubLObject[] { makeKeyword( "TABLE-CAT" ), makeKeyword( "TABLE-SCHEM" ), makeKeyword( "TABLE-NAME" ), makeKeyword( "NON-UNIQUE" ), makeKeyword(
      "INDEX-QUALIFIER" ), makeKeyword( "INDEX-NAME" ), makeKeyword( "TYPE" ), makeKeyword( "ORDINAL-POSITION" ), makeKeyword( "COLUMN-NAME" ), makeKeyword( "ASC-OR-DESC" ), makeKeyword( "CARDINALITY" ), makeKeyword(
          "PAGES" ), makeKeyword( "FILTER-CONDITION" )
  } );
  private static final SubLList $list267 = ConsesLow.list( makeKeyword( "RETURN" ), makeKeyword( "THROW" ), makeKeyword( "WARN" ) );
  private static final SubLString $str268$com_cyc_ = makeString( "com.cyc." );
  private static final SubLString $str269$_a__a__a = makeString( "~a:~a:~a" );
  private static final SubLSymbol $kw270$SUB_PROTOCOL = makeKeyword( "SUB-PROTOCOL" );
  private static final SubLSymbol $kw271$DATABASE = makeKeyword( "DATABASE" );
  private static final SubLSymbol $kw272$PASSWORD = makeKeyword( "PASSWORD" );
  private static final SubLSymbol $sym273$NEW_DB_URL = makeSymbol( "NEW-DB-URL" );
  private static final SubLSymbol $kw274$TEST = makeKeyword( "TEST" );
  private static final SubLSymbol $sym275$STRING_ = makeSymbol( "STRING=" );
  private static final SubLSymbol $kw276$OWNER = makeKeyword( "OWNER" );
  private static final SubLSymbol $kw277$CLASSES = makeKeyword( "CLASSES" );
  private static final SubLSymbol $kw278$KB = makeKeyword( "KB" );
  private static final SubLSymbol $kw279$TINY = makeKeyword( "TINY" );
  private static final SubLSymbol $kw280$WORKING_ = makeKeyword( "WORKING?" );
  private static final SubLList $list281;
  private static final SubLSymbol $sym282$_SDBC_DATABASE_CONNECTION_URL_DESCRIPTIONS_ = makeSymbol( "*SDBC-DATABASE-CONNECTION-URL-DESCRIPTIONS*" );
  private static final SubLSymbol $sym283$CONSP = makeSymbol( "CONSP" );
  private static final SubLSymbol $sym284$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
  private static final SubLSymbol $kw285$DEFAULTS = makeKeyword( "DEFAULTS" );
  private static final SubLSymbol $kw286$PATTERN = makeKeyword( "PATTERN" );
  private static final SubLSymbol $kw287$OPTION_PUNCTUATION = makeKeyword( "OPTION-PUNCTUATION" );
  private static final SubLSymbol $kw288$OPTION_NAMES = makeKeyword( "OPTION-NAMES" );
  private static final SubLSymbol $sym289$GET_ALL_SDBC_DATABASE_SUB_PROTOCOLS = makeSymbol( "GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS" );
  private static final SubLSymbol $kw290$UNDEFINED = makeKeyword( "UNDEFINED" );
  private static final SubLSymbol $kw291$TERMINATOR = makeKeyword( "TERMINATOR" );
  private static final SubLSymbol $kw292$SEPARATOR = makeKeyword( "SEPARATOR" );
  private static final SubLString $str293$Separator_must_be_defined_as_stri = makeString( "Separator must be defined as string, not ~A." );
  private static final SubLSymbol $kw294$VALUE = makeKeyword( "VALUE" );
  private static final SubLString $str295$Value_demarcator_must_be_specifie = makeString( "Value demarcator must be specified as string, not ~A." );
  private static final SubLList $list296 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "SUB-PROTOCOL" ), makeSymbol( "PATTERN" ), ConsesLow.list( makeSymbol( "OPTION-NAMES" ) ), ConsesLow.list( makeSymbol(
      "OPTION-PUNCTUATION" ) ), makeSymbol( "DEFAULTS" ) );
  private static final SubLList $list297 = ConsesLow.list( makeKeyword( "SUB-PROTOCOL" ), makeKeyword( "PATTERN" ), makeKeyword( "OPTION-NAMES" ), makeKeyword( "OPTION-PUNCTUATION" ), makeKeyword( "DEFAULTS" ) );
  private static final SubLSymbol $sym298$ADD_SDBC_DATABASE_CONNECTION_URL_DESCRIPTION = makeSymbol( "ADD-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION" );
  private static final SubLList $list299 = ConsesLow.list( new SubLObject[] { makeKeyword( "PROTOCOL" ), makeString( ":" ), makeKeyword( "SUB-PROTOCOL" ), makeString( "://" ), makeKeyword( "DBMS-SERVER" ), makeString(
      ":" ), makeKeyword( "PORT" ), makeString( "/" ), makeKeyword( "DATABASE" )
  } );
  private static final SubLList $list300 = ConsesLow.list( makeKeyword( "USER" ), makeString( "user" ), makeKeyword( "PASSWORD" ), makeString( "password" ), makeKeyword( "CHAR-SET" ), makeString( "charSet" ) );
  private static final SubLList $list301 = ConsesLow.list( makeKeyword( "START" ), makeString( "?" ), makeKeyword( "SEPARATOR" ), makeString( "&" ), makeKeyword( "VALUE" ), makeString( "=" ) );
  private static final SubLList $list302 = ConsesLow.list( makeKeyword( "PORT" ), makeInteger( 5432 ), makeKeyword( "CHAR-SET" ), makeString( "ASCII" ) );
  private static final SubLString $str303$mysql = makeString( "mysql" );
  private static final SubLList $list304 = ConsesLow.list( makeKeyword( "USER" ), makeString( "user" ), makeKeyword( "PASSWORD" ), makeString( "password" ) );
  private static final SubLList $list305 = ConsesLow.list( makeKeyword( "PORT" ), makeInteger( 3306 ) );
  private static final SubLString $str306$oracle = makeString( "oracle" );
  private static final SubLList $list307 = ConsesLow.list( new SubLObject[] { makeKeyword( "PROTOCOL" ), makeString( ":" ), makeKeyword( "SUB-PROTOCOL" ), makeString( ":thin:" ), makeKeyword( "USER" ), makeString( "/" ),
    makeKeyword( "PASSWORD" ), makeString( "@//" ), makeKeyword( "DBMS-SERVER" ), makeString( ":" ), makeKeyword( "PORT" ), makeString( "/" ), makeKeyword( "DATABASE" )
  } );
  private static final SubLList $list308 = ConsesLow.list( makeKeyword( "PORT" ), makeInteger( 1521 ) );
  private static final SubLString $str309$sqlserver = makeString( "sqlserver" );
  private static final SubLList $list310 = ConsesLow.list( makeKeyword( "PROTOCOL" ), makeString( ":" ), makeKeyword( "SUB-PROTOCOL" ), makeString( "://" ), makeKeyword( "DBMS-SERVER" ), makeString( ":" ), makeKeyword(
      "PORT" ) );
  private static final SubLList $list311 = ConsesLow.list( makeKeyword( "DATABASE" ), makeString( "DatabaseName" ), makeKeyword( "SELECT-METHOD" ), makeString( "SelectMethod" ), makeKeyword( "USER" ), makeString(
      "USER" ), makeKeyword( "PASSWORD" ), makeString( "PASSWORD" ) );
  private static final SubLList $list312 = ConsesLow.list( makeKeyword( "START" ), makeKeyword( "SEPARATOR" ), makeKeyword( "SEPARATOR" ), makeString( ";" ), makeKeyword( "VALUE" ), makeString( "=" ) );
  private static final SubLList $list313 = ConsesLow.list( makeKeyword( "PORT" ), makeInteger( 1433 ), makeKeyword( "SELECT-METHOD" ), makeString( "cursor" ) );
  private static final SubLString $str314$microsoft_sqlserver = makeString( "microsoft-sqlserver" );
  private static final SubLList $list315 = ConsesLow.list( makeKeyword( "PROTOCOL" ), makeString( ":microsoft:" ), makeString( "sqlserver" ), makeString( "://" ), makeKeyword( "DBMS-SERVER" ), makeString( ":" ),
      makeKeyword( "PORT" ) );
  private static final SubLString $str316$odbc = makeString( "odbc" );
  private static final SubLList $list317 = ConsesLow.list( makeKeyword( "PROTOCOL" ), makeString( ":" ), makeKeyword( "SUB-PROTOCOL" ), makeString( ":" ), makeKeyword( "DATABASE" ) );
  private static final SubLList $list318 = ConsesLow.list( makeKeyword( "USER" ), makeString( "UID" ), makeKeyword( "PASSWORD" ), makeString( "PWD" ) );
  private static final SubLString $str319$sybase = makeString( "sybase" );
  private static final SubLList $list320 = ConsesLow.list( new SubLObject[] { makeKeyword( "PROTOCOL" ), makeString( ":jtds:" ), makeKeyword( "SUB-PROTOCOL" ), makeString( "://" ), makeKeyword( "DBMS-SERVER" ),
    makeString( ":" ), makeKeyword( "PORT" ), makeString( "/" ), makeKeyword( "DATABASE" )
  } );
  private static final SubLList $list321 = ConsesLow.list( makeKeyword( "USER" ), makeString( "USER" ), makeKeyword( "PASSWORD" ), makeString( "PASSWORD" ) );
  private static final SubLList $list322 = ConsesLow.list( makeKeyword( "PORT" ), makeInteger( 2048 ) );
  private static final SubLString $str323$derby = makeString( "derby" );
  private static final SubLList $list324 = ConsesLow.list( makeKeyword( "PORT" ), makeInteger( 1527 ) );
  private static final SubLString $str325$st = makeString( "st" );
  private static final SubLList $list326 = ConsesLow.list( makeKeyword( "USER" ), makeString( "userName" ), makeKeyword( "PASSWORD" ), makeString( "passWord" ), makeKeyword( "FORMAT" ), makeString( "format" ) );
  private static final SubLList $list327 = ConsesLow.list( makeKeyword( "PORT" ), makeInteger( 8084 ), makeKeyword( "FORMAT" ), makeString( "xhtml" ) );
  private static final SubLString $str328$poiseschema = makeString( "poiseschema" );
  private static final SubLList $list329 = ConsesLow.list( makeKeyword( "PROTOCOL" ), makeString( ":" ), makeKeyword( "SUB-PROTOCOL" ), makeString( ":" ) );
  private static final SubLString $str330$poisedata = makeString( "poisedata" );
  private static final SubLSymbol $sym331$_SDBC_DB2_PORT_ = makeSymbol( "*SDBC-DB2-PORT*" );
  private static final SubLInteger $int332$50001 = makeInteger( 50001 );
  private static final SubLSymbol $sym333$SET_SDBC_DB2_PORT = makeSymbol( "SET-SDBC-DB2-PORT" );
  private static final SubLString $str334$db2 = makeString( "db2" );
  private static final SubLList $list335 = ConsesLow.list( new SubLObject[] { makeKeyword( "PROTOCOL" ), makeString( ":" ), makeKeyword( "SUB-PROTOCOL" ), makeString( "://" ), makeKeyword( "DBMS-SERVER" ), makeString(
      ":" ), makeKeyword( "PORT" ), makeString( "/" ), ConsesLow.list( makeKeyword( "UPCASE" ), makeKeyword( "DATABASE" ) )
  } );
  private static final SubLList $list336 = ConsesLow.list( makeKeyword( "START" ), makeString( ":" ), makeKeyword( "SEPARATOR" ), makeString( ";" ), makeKeyword( "VALUE" ), makeString( "=" ), makeKeyword( "TERMINATOR" ),
      makeString( ";" ) );
  private static final SubLList $list337 = ConsesLow.list( makeKeyword( "PORT" ), makeSymbol( "*SDBC-DB2-PORT*" ) );
  private static final SubLSymbol $sym338$_SDBC_SYBASE_IQ_PORT_ = makeSymbol( "*SDBC-SYBASE-IQ-PORT*" );
  private static final SubLInteger $int339$2638 = makeInteger( 2638 );
  private static final SubLSymbol $sym340$SET_SDBC_SYBASE_IQ_PORT = makeSymbol( "SET-SDBC-SYBASE-IQ-PORT" );
  private static final SubLString $str341$sybase_iq = makeString( "sybase-iq" );
  private static final SubLList $list342 = ConsesLow.list( makeKeyword( "PROTOCOL" ), makeString( ":sybase:Tds:" ), makeKeyword( "DBMS-SERVER" ), makeString( ":" ), makeKeyword( "PORT" ), makeString( "?ServiceName=" ),
      makeKeyword( "DATABASE" ) );
  private static final SubLList $list343 = ConsesLow.list( makeKeyword( "START" ), makeKeyword( "SEPARATOR" ), makeKeyword( "SEPARATOR" ), makeString( "&" ), makeKeyword( "VALUE" ), makeString( "=" ) );
  private static final SubLList $list344 = ConsesLow.list( makeKeyword( "PORT" ), makeSymbol( "*SDBC-SYBASE-IQ-PORT*" ) );
  private static final SubLString $str345$unknown_jdbc_subprotocol___a = makeString( "unknown jdbc subprotocol: ~a" );
  private static final SubLSymbol $kw346$PROTOCOL = makeKeyword( "PROTOCOL" );
  private static final SubLSymbol $kw347$NOT_FOUND = makeKeyword( "NOT-FOUND" );
  private static final SubLList $list348 = ConsesLow.list( makeSymbol( "FUNCTOR" ), makeSymbol( "ITEM" ) );
  private static final SubLSymbol $kw349$UPCASE = makeKeyword( "UPCASE" );
  private static final SubLString $str350$Functor__A_not_implemented_yet_ = makeString( "Functor ~A not implemented yet." );
  private static final SubLString $str351$Pattern__S_contains__S__which_is_ = makeString( "Pattern ~S contains ~S, which is neither STRINGP nor KEYWORDP" );
  private static final SubLString $str352$Element__A_is_neither_a_STRINGP_n = makeString( "Element ~A is neither a STRINGP nor a KEYWORD." );
  private static final SubLString $str353$No_value_provided_for__S_in_eithe = makeString( "No value provided for ~S in either properties ~S or defaults ~S." );
  private static final SubLInteger $int354$_2147483649 = makeInteger( "-2147483649" );
  private static final SubLInteger $int355$2147483648 = makeInteger( "2147483648" );
  private static final SubLInteger $int356$_9223372036854775809 = makeInteger( "-9223372036854775809" );
  private static final SubLInteger $int357$9223372036854775808 = makeInteger( "9223372036854775808" );
  private static final SubLList $list358 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CONNECTION" ), makeSymbol( "DB" ), makeSymbol( "USER" ), makeSymbol( "PASSWORD" ), makeSymbol( "&KEY" ),
    ConsesLow.list( makeSymbol( "DBMS-SERVER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*DBMS-SERVER*" ) ) ), ConsesLow.list( makeSymbol( "PORT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "*SQL-PORT*" ) ) ), ConsesLow.list( makeSymbol( "SUBPROTOCOL" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-SUBPROTOCOL*" ) ) ), ConsesLow.list( makeSymbol( "PROXY-SERVER" ), makeSymbol(
            "DBMS-SERVER" ) ), ConsesLow.list( makeSymbol( "TIMEOUT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-CONNECTION-TIMEOUT*" ) ) )
  } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLList $list359 = ConsesLow.list( makeKeyword( "DBMS-SERVER" ), makeKeyword( "PORT" ), makeKeyword( "SUBPROTOCOL" ), makeKeyword( "PROXY-SERVER" ), makeKeyword( "TIMEOUT" ) );
  private static final SubLSymbol $sym360$_SQL_SUBPROTOCOL_ = makeSymbol( "*SQL-SUBPROTOCOL*" );
  private static final SubLSymbol $sym361$_SQL_CONNECTION_TIMEOUT_ = makeSymbol( "*SQL-CONNECTION-TIMEOUT*" );
  private static final SubLSymbol $sym362$CLET = makeSymbol( "CLET" );
  private static final SubLSymbol $sym363$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
  private static final SubLSymbol $sym364$PROGN = makeSymbol( "PROGN" );
  private static final SubLSymbol $sym365$CSETQ = makeSymbol( "CSETQ" );
  private static final SubLSymbol $sym366$NEW_SQL_CONNECTION = makeSymbol( "NEW-SQL-CONNECTION" );
  private static final SubLSymbol $sym367$LIST = makeSymbol( "LIST" );
  private static final SubLSymbol $sym368$PWHEN = makeSymbol( "PWHEN" );
  private static final SubLSymbol $sym369$SQLC_CLOSE = makeSymbol( "SQLC-CLOSE" );
  private static final SubLList $list370 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "STATEMENT" ), makeSymbol( "DB" ), makeSymbol( "USER" ), makeSymbol( "PASSWORD" ), makeSymbol( "&KEY" ), ConsesLow
      .list( makeSymbol( "DBMS-SERVER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*DBMS-SERVER*" ) ) ), ConsesLow.list( makeSymbol( "PORT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
          "*SQL-PORT*" ) ) ), ConsesLow.list( makeSymbol( "SUBPROTOCOL" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-SUBPROTOCOL*" ) ) ), ConsesLow.list( makeSymbol( "PROXY-SERVER" ), makeSymbol(
              "DBMS-SERVER" ) ), ConsesLow.list( makeSymbol( "TIMEOUT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-CONNECTION-TIMEOUT*" ) ) )
  } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym371$CONNECTION = makeUninternedSymbol( "CONNECTION" );
  private static final SubLSymbol $sym372$WITH_SQL_CONNECTION = makeSymbol( "WITH-SQL-CONNECTION" );
  private static final SubLSymbol $sym373$PIF = makeSymbol( "PIF" );
  private static final SubLSymbol $sym374$SQLC_CREATE_STATEMENT = makeSymbol( "SQLC-CREATE-STATEMENT" );
  private static final SubLList $list375 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "STATEMENT" ), makeSymbol( "SQL" ), makeSymbol( "DB" ), makeSymbol( "USER" ), makeSymbol( "PASSWORD" ),
    makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "DBMS-SERVER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*DBMS-SERVER*" ) ) ), ConsesLow.list( makeSymbol( "PORT" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "*SQL-PORT*" ) ) ), ConsesLow.list( makeSymbol( "SUBPROTOCOL" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-SUBPROTOCOL*" ) ) ), ConsesLow.list( makeSymbol( "PROXY-SERVER" ),
            makeSymbol( "DBMS-SERVER" ) ), ConsesLow.list( makeSymbol( "TIMEOUT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-CONNECTION-TIMEOUT*" ) ) )
  } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym376$CONNECTION = makeUninternedSymbol( "CONNECTION" );
  private static final SubLSymbol $sym377$SQLC_PREPARE_STATEMENT = makeSymbol( "SQLC-PREPARE-STATEMENT" );
  private static final SubLList $list378 = ConsesLow.list( ConsesLow.list( makeSymbol( "STATEMENT" ), makeSymbol( "ERROR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym379$CONNECTION = makeUninternedSymbol( "CONNECTION" );
  private static final SubLSymbol $sym380$AUTO_COMMIT = makeUninternedSymbol( "AUTO-COMMIT" );
  private static final SubLSymbol $sym381$COMMIT_ERROR = makeUninternedSymbol( "COMMIT-ERROR" );
  private static final SubLSymbol $sym382$ROLLBACK_RESULT = makeUninternedSymbol( "ROLLBACK-RESULT" );
  private static final SubLSymbol $sym383$AUTO_COMMIT_RESULT = makeUninternedSymbol( "AUTO-COMMIT-RESULT" );
  private static final SubLSymbol $sym384$ERRORS = makeUninternedSymbol( "ERRORS" );
  private static final SubLSymbol $sym385$SQLC_GET_AUTO_COMMIT = makeSymbol( "SQLC-GET-AUTO-COMMIT" );
  private static final SubLSymbol $sym386$CPUSH = makeSymbol( "CPUSH" );
  private static final SubLList $list387 = ConsesLow.list( makeKeyword( "THROW" ) );
  private static final SubLSymbol $sym388$CATCH_ERROR_MESSAGE = makeSymbol( "CATCH-ERROR-MESSAGE" );
  private static final SubLSymbol $sym389$SQLC_SET_AUTO_COMMIT = makeSymbol( "SQLC-SET-AUTO-COMMIT" );
  private static final SubLList $list390;
  private static final SubLSymbol $sym391$SQLC_COMMIT = makeSymbol( "SQLC-COMMIT" );
  private static final SubLList $list392 = ConsesLow.list( makeKeyword( "RETURN" ) );
  private static final SubLSymbol $sym393$SQLS_HANDLE_COMMIT_ERROR = makeSymbol( "SQLS-HANDLE-COMMIT-ERROR" );
  private static final SubLSymbol $sym394$SQLS_HANDLE_ROLLBACK = makeSymbol( "SQLS-HANDLE-ROLLBACK" );
  private static final SubLList $list395;
  private static final SubLSymbol $sym396$SQLS_HANDLE_TRANSACTION_ERRORS = makeSymbol( "SQLS-HANDLE-TRANSACTION-ERRORS" );
  private static final SubLString $str397$An_unknown_error_occurred_during_ = makeString( "An unknown error occurred during execution" );
  private static final SubLList $list398 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "STATEMENT" ), makeSymbol( "ERROR" ), makeSymbol( "DB" ), makeSymbol( "USER" ), makeSymbol( "PASSWORD" ),
    makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "DBMS-SERVER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*DBMS-SERVER*" ) ) ), ConsesLow.list( makeSymbol( "PORT" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "*SQL-PORT*" ) ) ), ConsesLow.list( makeSymbol( "SUBPROTOCOL" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-SUBPROTOCOL*" ) ) ), ConsesLow.list( makeSymbol( "PROXY-SERVER" ),
            makeSymbol( "DBMS-SERVER" ) ), ConsesLow.list( makeSymbol( "TIMEOUT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-CONNECTION-TIMEOUT*" ) ) )
  } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym399$WITH_SQL_STATEMENT = makeSymbol( "WITH-SQL-STATEMENT" );
  private static final SubLList $list400 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "RS" ), makeSymbol( "QUERY" ), makeSymbol( "DB" ), makeSymbol( "USER" ), makeSymbol( "PASSWORD" ), makeSymbol(
      "&KEY" ), ConsesLow.list( makeSymbol( "DBMS-SERVER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*DBMS-SERVER*" ) ) ), ConsesLow.list( makeSymbol( "PORT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
          makeSymbol( "*SQL-PORT*" ) ) ), ConsesLow.list( makeSymbol( "SUBPROTOCOL" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-SUBPROTOCOL*" ) ) ), ConsesLow.list( makeSymbol( "PROXY-SERVER" ),
              makeSymbol( "DBMS-SERVER" ) ), ConsesLow.list( makeSymbol( "TIMEOUT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*SQL-CONNECTION-TIMEOUT*" ) ) )
  } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym401$STATEMENT = makeUninternedSymbol( "STATEMENT" );
  private static final SubLSymbol $sym402$RS = makeSymbol( "RS" );
  private static final SubLSymbol $sym403$SQLS_EXECUTE_QUERY = makeSymbol( "SQLS-EXECUTE-QUERY" );
  private static final SubLSymbol $sym404$WITH_SQL_RESULT_SET = makeSymbol( "WITH-SQL-RESULT-SET" );
  private static final SubLSymbol $sym405$WHILE = makeSymbol( "WHILE" );
  private static final SubLSymbol $sym406$SQLRS_NEXT = makeSymbol( "SQLRS-NEXT" );
  private static final SubLSymbol $sym407$OUTPUT_STREAM_P = makeSymbol( "OUTPUT-STREAM-P" );
  private static final SubLString $str408$SELECT___FROM_ = makeString( "SELECT * FROM " );
  private static final SubLList $list409;
  private static final SubLString $str410$INSERT_INTO__a_VALUES______ = makeString( "INSERT INTO ~a VALUES(?, ?)" );
  private static final SubLString $str411$SELECT_number2_FROM__a_WHERE_numb = makeString( "SELECT number2 FROM ~a WHERE number1 = ?" );
  private static final SubLString $str412$CREATE_TABLE_ = makeString( "CREATE TABLE " );
  private static final SubLString $str413$__number1_INT_PRIMARY_KEY__number = makeString( " (number1 INT PRIMARY KEY, number2 INT)" );
  private static final SubLString $str414$validation_failed_for__a__result_ = makeString( "validation failed for ~a: result ~a" );
  private static final SubLString $str415$DROP_TABLE_ = makeString( "DROP TABLE " );
  private static final SubLString $str416$INSERT_INTO_ = makeString( "INSERT INTO " );
  private static final SubLString $str417$_VALUES_ = makeString( " VALUES(" );
  private static final SubLString $str418$__ = makeString( ", " );
  private static final SubLString $str419$_ = makeString( ")" );
  private static final SubLString $str420$SELECT_number2_FROM_ = makeString( "SELECT number2 FROM " );
  private static final SubLString $str421$_WHERE_number1___ = makeString( " WHERE number1 = " );
  static
  {
    $list281 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "dbms-server.cyc.com" ), makeString( "testdatabase" ), makeString( "theuser" ), makeString( "thepassword" ), makeString(
        "postgresql" ) ), makeString( "jdbc:postgresql://dbms-server.cyc.com:5432/testdatabase?user=theuser&password=thepassword&charSet=ASCII" ) ), ConsesLow.list( ConsesLow.list( makeString( "dbms-server.cyc.com" ),
            makeString( "testdatabase" ), makeString( "theuser" ), makeString( "thepassword" ), makeString( "mysql" ) ), makeString(
                "jdbc:mysql://dbms-server.cyc.com:3306/testdatabase?user=theuser&password=thepassword" ) ), ConsesLow.list( ConsesLow.list( makeString( "dbms-server.cyc.com" ), makeString( "testdatabase" ), makeString(
                    "theuser" ), makeString( "thepassword" ), makeString( "oracle" ) ), makeString( "jdbc:oracle:thin:theuser/thepassword@//dbms-server.cyc.com:1521/testdatabase" ) ), ConsesLow.list( ConsesLow.list(
                        makeString( "dbms-server.cyc.com" ), makeString( "testdatabase" ), makeString( "theuser" ), makeString( "thepassword" ), makeString( "microsoft-sqlserver" ) ), makeString(
                            "jdbc:microsoft:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                "dbms-server.cyc.com" ), makeString( "testdatabase" ), makeString( "theuser" ), makeString( "thepassword" ), makeString( "sqlserver" ) ), makeString(
                                    "jdbc:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                        "dbms-server.cyc.com" ), makeString( "testdatabase" ), makeString( "theuser" ), makeString( "thepassword" ), makeString( "odbc" ) ), makeString(
                                            "jdbc:odbc:testdatabase;UID=theuser;PWD=thepassword" ) ), ConsesLow.list( ConsesLow.list( makeString( "dbms-server.cyc.com" ), makeString( "testdatabase" ), makeString(
                                                "theuser" ), makeString( "thepassword" ), makeString( "sybase" ) ), makeString(
                                                    "jdbc:jtds:sybase://dbms-server.cyc.com:2048/testdatabase;USER=theuser;PASSWORD=thepassword" ) ), ConsesLow.list( ConsesLow.list( makeString( "dbms-server.cyc.com" ),
                                                        makeString( "testdatabase" ), makeString( "theuser" ), makeString( "thepassword" ), makeString( "db2" ) ), makeString(
                                                            "jdbc:db2://dbms-server.cyc.com:50001/TESTDATABASE:user=theuser;password=thepassword;" ) ), ConsesLow.list( ConsesLow.list( makeString( "dbms-server.cyc.com" ),
                                                                makeString( "testdatabase" ), NIL, NIL, makeString( "derby" ) ), makeString( "jdbc:derby://dbms-server.cyc.com:1527/testdatabase" ) ), ConsesLow.list(
                                                                    ConsesLow.list( makeString( "dbms-server.cyc.com" ), makeString( "testdatabase" ), NIL, NIL, makeString(
                                                                        "com.cyc.project.mysentient.query.webScraper.Ents24SKSI" ) ), makeString(
                                                                            "jdbc:com.cyc.project.mysentient.query.webScraper.Ents24SKSI:testdatabase" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                "dbms-server.cyc.com" ), makeString( "testdatabase" ), makeString( "theuser" ), makeString( "thepassword" ), makeString( "derby" ) ),
                                                                                makeString( "jdbc:derby://dbms-server.cyc.com:1527/testdatabase;user=theuser;password=thepassword" ) ), ConsesLow.list( ConsesLow.list(
                                                                                    makeString( "dbms-server.cyc.com" ), makeString( "testdatabase" ), makeString( "theuser" ), makeString( "thepassword" ), makeString(
                                                                                        "derby" ), makeInteger( 15270 ) ), makeString(
                                                                                            "jdbc:derby://dbms-server.cyc.com:15270/testdatabase;user=theuser;password=thepassword" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                makeString( "dbms-server.cyc.com" ), makeString( "testdatabase" ), makeString( "theuser" ), makeString( "thepassword" ),
                                                                                                makeString( "db2" ), makeInteger( 6501 ) ), makeString(
                                                                                                    "jdbc:db2://dbms-server.cyc.com:6501/TESTDATABASE:user=theuser;password=thepassword;" ) ), ConsesLow.list( ConsesLow
                                                                                                        .list( makeString( "dbms-server.cyc.com" ), makeString( "iq-demo" ), makeString( "theuser" ), makeString(
                                                                                                            "thepassword" ), makeString( "sybase-iq" ) ), makeString(
                                                                                                                "jdbc:sybase:Tds:dbms-server.cyc.com:2638?ServiceName=iq-demo&USER=theuser&PASSWORD=thepassword" ) )
    } );
    $list390 = ConsesLow.list( NIL );
    $list395 = ConsesLow.list( T );
    $list409 = ConsesLow.list( Characters.CHAR_period );
  }
}
