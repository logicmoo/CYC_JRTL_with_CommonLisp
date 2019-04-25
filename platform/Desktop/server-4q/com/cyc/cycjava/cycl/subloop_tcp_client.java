package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_tcp_client
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subloop_tcp_client";
  public static final String myFingerPrint = "f117bcbf7e004a3e4fe3079f7e1194ae7eb63bbea2922efc1e96f9cfe9493042";
  private static final SubLSymbol $sym0$TCP_CLIENT;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$PORT;
  private static final SubLSymbol $sym4$HOST;
  private static final SubLSymbol $sym5$INSTANCE_COUNT;
  private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_CLASS;
  private static final SubLSymbol $sym7$ISOLATED_P;
  private static final SubLSymbol $sym8$INSTANCE_NUMBER;
  private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_INSTANCE;
  private static final SubLSymbol $sym10$INITIALIZE;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$TCP_CLIENT_INITIALIZE_METHOD;
  private static final SubLSymbol $sym14$SET_HOST;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
  private static final SubLSymbol $sym19$STRINGP;
  private static final SubLSymbol $sym20$TCP_CLIENT_SET_HOST_METHOD;
  private static final SubLSymbol $sym21$SET_PORT;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
  private static final SubLSymbol $sym25$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym26$TCP_CLIENT_SET_PORT_METHOD;
  private static final SubLSymbol $sym27$PRINT;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
  private static final SubLString $str31$__TCP_CLIENT__;
  private static final SubLString $str32$Server__;
  private static final SubLString $str33$_Port__;
  private static final SubLString $str34$_;
  private static final SubLSymbol $sym35$TCP_CLIENT_PRINT_METHOD;
  private static final SubLSymbol $sym36$PERFORM_REQUEST;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
  private static final SubLSymbol $kw40$PRIVATE;
  private static final SubLSymbol $sym41$TCP_CLIENT_PERFORM_REQUEST_METHOD;
  private static final SubLSymbol $sym42$REQUEST_TOKENIZED_XML;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
  private static final SubLSymbol $sym45$TCP_CLIENT_REQUEST_TOKENIZED_XML_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
  public static SubLObject get_tcp_client_port(final SubLObject tcp_client)
  {
    return classes.subloop_get_access_protected_instance_slot( tcp_client, TWO_INTEGER, $sym3$PORT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
  public static SubLObject set_tcp_client_port(final SubLObject tcp_client, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( tcp_client, value, TWO_INTEGER, $sym3$PORT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
  public static SubLObject get_tcp_client_host(final SubLObject tcp_client)
  {
    return classes.subloop_get_access_protected_instance_slot( tcp_client, ONE_INTEGER, $sym4$HOST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
  public static SubLObject set_tcp_client_host(final SubLObject tcp_client, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( tcp_client, value, ONE_INTEGER, $sym4$HOST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
  public static SubLObject subloop_reserved_initialize_tcp_client_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
  public static SubLObject subloop_reserved_initialize_tcp_client_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$TCP_CLIENT, $sym4$HOST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$TCP_CLIENT, $sym3$PORT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
  public static SubLObject tcp_client_p(final SubLObject tcp_client)
  {
    return classes.subloop_instanceof_class( tcp_client, $sym0$TCP_CLIENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 1621L)
  public static SubLObject tcp_client_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 1716L)
  public static SubLObject tcp_client_set_host_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_tcp_client_method = NIL;
    SubLObject host = get_tcp_client_host( self );
    try
    {
      thread.throwStack.push( $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        host = string;
        Dynamic.sublisp_throw( $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_tcp_client_host( self, host );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_tcp_client_method = Errors.handleThrowable( ccatch_env_var, $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_tcp_client_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 1941L)
  public static SubLObject tcp_client_set_port_method(final SubLObject self, final SubLObject number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_tcp_client_method = NIL;
    SubLObject port = get_tcp_client_port( self );
    try
    {
      thread.throwStack.push( $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
      try
      {
        assert NIL != subl_promotions.non_negative_integer_p( number ) : number;
        port = number;
        Dynamic.sublisp_throw( $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_tcp_client_port( self, port );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_tcp_client_method = Errors.handleThrowable( ccatch_env_var, $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_tcp_client_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 2158L)
  public static SubLObject tcp_client_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_tcp_client_method = NIL;
    final SubLObject port = get_tcp_client_port( self );
    final SubLObject host = get_tcp_client_host( self );
    try
    {
      thread.throwStack.push( $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
      try
      {
        streams_high.write_string( $str31$__TCP_CLIENT__, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str32$Server__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( host, stream );
        streams_high.write_string( $str33$_Port__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( port, stream );
        streams_high.write_string( $str34$_, stream, UNPROVIDED, UNPROVIDED );
        streams_high.terpri( stream );
        Dynamic.sublisp_throw( $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_tcp_client_port( self, port );
          set_tcp_client_host( self, host );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_tcp_client_method = Errors.handleThrowable( ccatch_env_var, $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_tcp_client_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 2519L)
  public static SubLObject tcp_client_perform_request_method(final SubLObject self, final SubLObject request_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_tcp_client_method = NIL;
    final SubLObject port = get_tcp_client_port( self );
    final SubLObject host = get_tcp_client_host( self );
    try
    {
      thread.throwStack.push( $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
      try
      {
        SubLObject bi_stream = NIL;
        try
        {
          bi_stream = subl_promotions.open_tcp_stream_with_timeout( host, port, NIL, $kw40$PRIVATE );
          if( NIL != subl_macro_promotions.validate_tcp_connection( bi_stream, host, port ) )
          {
            streams_high.write_line( request_string, bi_stream, UNPROVIDED, UNPROVIDED );
            streams_high.force_output( bi_stream );
            Dynamic.sublisp_throw( $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, streams_high.read_line( bi_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL != bi_stream )
            {
              streams_high.close( bi_stream, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          set_tcp_client_port( self, port );
          set_tcp_client_host( self, host );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_tcp_client_method = Errors.handleThrowable( ccatch_env_var, $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_tcp_client_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 3063L)
  public static SubLObject tcp_client_request_tokenized_xml_method(final SubLObject self, final SubLObject request_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_tcp_client_method = NIL;
    final SubLObject port = get_tcp_client_port( self );
    final SubLObject host = get_tcp_client_host( self );
    try
    {
      thread.throwStack.push( $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
      try
      {
        SubLObject bi_stream = NIL;
        try
        {
          bi_stream = subl_promotions.open_tcp_stream_with_timeout( host, port, NIL, $kw40$PRIVATE );
          if( NIL != subl_macro_promotions.validate_tcp_connection( bi_stream, host, port ) )
          {
            streams_high.write_line( request_string, bi_stream, UNPROVIDED, UNPROVIDED );
            streams_high.force_output( bi_stream );
            Dynamic.sublisp_throw( $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, xml_parsing_utilities.xml_tokenize( bi_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL != bi_stream )
            {
              streams_high.close( bi_stream, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          set_tcp_client_port( self, port );
          set_tcp_client_host( self, host );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_tcp_client_method = Errors.handleThrowable( ccatch_env_var, $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_tcp_client_method;
  }

  public static SubLObject declare_subloop_tcp_client_file()
  {
    SubLFiles.declareFunction( me, "get_tcp_client_port", "GET-TCP-CLIENT-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tcp_client_port", "SET-TCP-CLIENT-PORT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_tcp_client_host", "GET-TCP-CLIENT-HOST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tcp_client_host", "SET-TCP-CLIENT-HOST", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_tcp_client_class", "SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_tcp_client_instance", "SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "tcp_client_p", "TCP-CLIENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tcp_client_initialize_method", "TCP-CLIENT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "tcp_client_set_host_method", "TCP-CLIENT-SET-HOST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "tcp_client_set_port_method", "TCP-CLIENT-SET-PORT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "tcp_client_print_method", "TCP-CLIENT-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "tcp_client_perform_request_method", "TCP-CLIENT-PERFORM-REQUEST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "tcp_client_request_tokenized_xml_method", "TCP-CLIENT-REQUEST-TOKENIZED-XML-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_subloop_tcp_client_file()
  {
    return NIL;
  }

  public static SubLObject setup_subloop_tcp_client_file()
  {
    classes.subloop_new_class( $sym0$TCP_CLIENT, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$TCP_CLIENT, NIL );
    classes.subloop_note_class_initialization_function( $sym0$TCP_CLIENT, $sym6$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$TCP_CLIENT, $sym9$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_INSTANCE );
    subloop_reserved_initialize_tcp_client_class( $sym0$TCP_CLIENT );
    methods.methods_incorporate_instance_method( $sym10$INITIALIZE, $sym0$TCP_CLIENT, $list11, NIL, $list12 );
    methods.subloop_register_instance_method( $sym0$TCP_CLIENT, $sym10$INITIALIZE, $sym13$TCP_CLIENT_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym14$SET_HOST, $sym0$TCP_CLIENT, $list15, $list16, $list17 );
    methods.subloop_register_instance_method( $sym0$TCP_CLIENT, $sym14$SET_HOST, $sym20$TCP_CLIENT_SET_HOST_METHOD );
    methods.methods_incorporate_instance_method( $sym21$SET_PORT, $sym0$TCP_CLIENT, $list15, $list22, $list23 );
    methods.subloop_register_instance_method( $sym0$TCP_CLIENT, $sym21$SET_PORT, $sym26$TCP_CLIENT_SET_PORT_METHOD );
    methods.methods_incorporate_instance_method( $sym27$PRINT, $sym0$TCP_CLIENT, $list11, $list28, $list29 );
    methods.subloop_register_instance_method( $sym0$TCP_CLIENT, $sym27$PRINT, $sym35$TCP_CLIENT_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym36$PERFORM_REQUEST, $sym0$TCP_CLIENT, $list15, $list37, $list38 );
    methods.subloop_register_instance_method( $sym0$TCP_CLIENT, $sym36$PERFORM_REQUEST, $sym41$TCP_CLIENT_PERFORM_REQUEST_METHOD );
    methods.methods_incorporate_instance_method( $sym42$REQUEST_TOKENIZED_XML, $sym0$TCP_CLIENT, $list15, $list37, $list43 );
    methods.subloop_register_instance_method( $sym0$TCP_CLIENT, $sym42$REQUEST_TOKENIZED_XML, $sym45$TCP_CLIENT_REQUEST_TOKENIZED_XML_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subloop_tcp_client_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subloop_tcp_client_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subloop_tcp_client_file();
  }
  static
  {
    me = new subloop_tcp_client();
    $sym0$TCP_CLIENT = makeSymbol( "TCP-CLIENT" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "HOST" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PORT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-HOST" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "SET-PORT" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PERFORM-REQUEST" ), ConsesLow.list( makeSymbol(
                "REQUEST-STRING" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym3$PORT = makeSymbol( "PORT" );
    $sym4$HOST = makeSymbol( "HOST" );
    $sym5$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym6$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-CLASS" );
    $sym7$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym8$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym9$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-INSTANCE" );
    $sym10$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list11 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym13$TCP_CLIENT_INITIALIZE_METHOD = makeSymbol( "TCP-CLIENT-INITIALIZE-METHOD" );
    $sym14$SET_HOST = makeSymbol( "SET-HOST" );
    $list15 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list16 = ConsesLow.list( makeSymbol( "STRING" ) );
    $list17 = ConsesLow.list( makeString( "@param STRING; the name of the machine that hosts the server\n  this client wishes to contact." ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ),
        makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "HOST" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TCP-CLIENT-METHOD" );
    $sym19$STRINGP = makeSymbol( "STRINGP" );
    $sym20$TCP_CLIENT_SET_HOST_METHOD = makeSymbol( "TCP-CLIENT-SET-HOST-METHOD" );
    $sym21$SET_PORT = makeSymbol( "SET-PORT" );
    $list22 = ConsesLow.list( makeSymbol( "NUMBER" ) );
    $list23 = ConsesLow.list( makeString( "@param NUMBER; the port of the server this client wishes to contact." ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NUMBER" ), makeSymbol(
        "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PORT" ), makeSymbol( "NUMBER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TCP-CLIENT-METHOD" );
    $sym25$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym26$TCP_CLIENT_SET_PORT_METHOD = makeSymbol( "TCP-CLIENT-SET-PORT-METHOD" );
    $sym27$PRINT = makeSymbol( "PRINT" );
    $list28 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list29 = ConsesLow.list( new SubLObject[] { makeString( "Pretty-prints this tcp-client to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol(
        "WRITE-STRING" ), makeString( "#<TCP-CLIENT: " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "Server: " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ),
            makeSymbol( "HOST" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( " Port: " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "PORT" ),
                makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list(
                    makeSymbol( "RET" ), makeSymbol( "SELF" ) )
    } );
    $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TCP-CLIENT-METHOD" );
    $str31$__TCP_CLIENT__ = makeString( "#<TCP-CLIENT: " );
    $str32$Server__ = makeString( "Server: " );
    $str33$_Port__ = makeString( " Port: " );
    $str34$_ = makeString( ">" );
    $sym35$TCP_CLIENT_PRINT_METHOD = makeSymbol( "TCP-CLIENT-PRINT-METHOD" );
    $sym36$PERFORM_REQUEST = makeSymbol( "PERFORM-REQUEST" );
    $list37 = ConsesLow.list( makeSymbol( "REQUEST-STRING" ) );
    $list38 = ConsesLow.list( makeString(
        "@param REQUEST-STRING; the content of the requests that this client\n  wants to submit to the server it is targeting. Each subclass of tcp-client\n  will be responsible for making sure that REQUEST-STRING conforms to the\n  required communication protocol.\n  @return stringp; the server's reply" ),
        ConsesLow.list( makeSymbol( "WITH-TCP-CONNECTION" ), ConsesLow.list( makeSymbol( "BI-STREAM" ), makeSymbol( "HOST" ), makeSymbol( "PORT" ), makeKeyword( "ACCESS-MODE" ), makeKeyword( "PRIVATE" ) ), ConsesLow
            .list( makeSymbol( "WRITE-LINE" ), makeSymbol( "REQUEST-STRING" ), makeSymbol( "BI-STREAM" ) ), ConsesLow.list( makeSymbol( "FORCE-OUTPUT" ), makeSymbol( "BI-STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ),
                ConsesLow.list( makeSymbol( "READ-LINE" ), makeSymbol( "BI-STREAM" ) ) ) ) );
    $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TCP-CLIENT-METHOD" );
    $kw40$PRIVATE = makeKeyword( "PRIVATE" );
    $sym41$TCP_CLIENT_PERFORM_REQUEST_METHOD = makeSymbol( "TCP-CLIENT-PERFORM-REQUEST-METHOD" );
    $sym42$REQUEST_TOKENIZED_XML = makeSymbol( "REQUEST-TOKENIZED-XML" );
    $list43 = ConsesLow.list( makeString(
        "@param REQUEST-STRING; the content of the requests that this client\n  wants to submit to the server it is targeting. Each subclass of tcp-client\n  will be responsible for making sure that REQUEST-STRING conforms to the\n  required XML communication protocol.\n  @return listp; the server's reply parsed as a list of XML tokens" ),
        ConsesLow.list( makeSymbol( "WITH-TCP-CONNECTION" ), ConsesLow.list( makeSymbol( "BI-STREAM" ), makeSymbol( "HOST" ), makeSymbol( "PORT" ), makeKeyword( "ACCESS-MODE" ), makeKeyword( "PRIVATE" ) ), ConsesLow
            .list( makeSymbol( "WRITE-LINE" ), makeSymbol( "REQUEST-STRING" ), makeSymbol( "BI-STREAM" ) ), ConsesLow.list( makeSymbol( "FORCE-OUTPUT" ), makeSymbol( "BI-STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ),
                ConsesLow.list( makeSymbol( "XML-TOKENIZE" ), makeSymbol( "BI-STREAM" ) ) ) ) );
    $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TCP-CLIENT-METHOD" );
    $sym45$TCP_CLIENT_REQUEST_TOKENIZED_XML_METHOD = makeSymbol( "TCP-CLIENT-REQUEST-TOKENIZED-XML-METHOD" );
  }
}
/*
 * 
 * Total time: 147 ms
 * 
 */