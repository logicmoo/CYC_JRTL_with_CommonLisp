package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class remote_image
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.remote_image";
  public static final String myFingerPrint = "3b99baaccb04ce58edd77f109bcae429718537888879bb981455edc13b86958f";
  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLSymbol $dtp_remote_image$;
  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLSymbol $dtp_remote_image_connection$;
  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5891L)
  public static SubLSymbol $current_remote_image_connection$;
  private static final SubLSymbol $kw0$CFASL;
  private static final SubLSymbol $kw1$CYC_API;
  private static final SubLString $str2$Unknown_API_protocol__S;
  private static final SubLSymbol $sym3$REMOTE_IMAGE;
  private static final SubLSymbol $sym4$REMOTE_IMAGE_P;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PRINT_REMOTE_IMAGE;
  private static final SubLSymbol $sym10$REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$RMT_IMG_MACHINE;
  private static final SubLSymbol $sym13$_CSETF_RMT_IMG_MACHINE;
  private static final SubLSymbol $sym14$RMT_IMG_PORT;
  private static final SubLSymbol $sym15$_CSETF_RMT_IMG_PORT;
  private static final SubLSymbol $sym16$RMT_IMG_PROTOCOL;
  private static final SubLSymbol $sym17$_CSETF_RMT_IMG_PROTOCOL;
  private static final SubLSymbol $kw18$MACHINE;
  private static final SubLSymbol $kw19$PORT;
  private static final SubLSymbol $kw20$PROTOCOL;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_REMOTE_IMAGE;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_METHOD;
  private static final SubLString $str27$_REMOTE_IMAGE__A__A__A_;
  private static final SubLSymbol $sym28$REMOTE_IMAGE_CONNECTION;
  private static final SubLSymbol $sym29$REMOTE_IMAGE_CONNECTION_P;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$PRINT_REMOTE_IMAGE_CONNECTION;
  private static final SubLSymbol $sym35$REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$RMT_IMG_CONN_IMAGE;
  private static final SubLSymbol $sym38$_CSETF_RMT_IMG_CONN_IMAGE;
  private static final SubLSymbol $sym39$RMT_IMG_CONN_CHANNEL;
  private static final SubLSymbol $sym40$_CSETF_RMT_IMG_CONN_CHANNEL;
  private static final SubLSymbol $kw41$IMAGE;
  private static final SubLSymbol $kw42$CHANNEL;
  private static final SubLSymbol $sym43$MAKE_REMOTE_IMAGE_CONNECTION;
  private static final SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_CONNECTION_METHOD;
  private static final SubLString $str45$_CONNECTION_to__A___A__;
  private static final SubLString $str46$open;
  private static final SubLString $str47$closed;
  private static final SubLSymbol $kw48$PRIVATE;
  private static final SubLSymbol $kw49$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym50$IGNORE_ERRORS_HANDLER;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$CLET;
  private static final SubLSymbol $sym54$_CURRENT_REMOTE_IMAGE_CONNECTION_;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$CONNECTION;
  private static final SubLSymbol $sym57$NEW_REMOTE_IMAGE_CONNECTION;
  private static final SubLSymbol $sym58$CUNWIND_PROTECT;
  private static final SubLSymbol $sym59$PROGN;
  private static final SubLSymbol $sym60$OPEN_REMOTE_IMAGE_CONNECTION;
  private static final SubLSymbol $sym61$WITH_REMOTE_IMAGE_CONNECTION;
  private static final SubLSymbol $sym62$CLOSE_REMOTE_IMAGE_CONNECTION;

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 851L)
  public static SubLObject api_channel_remote_eval(final SubLObject api_request, final SubLObject channel, SubLObject protocol)
  {
    if( protocol == UNPROVIDED )
    {
      protocol = $kw0$CFASL;
    }
    final SubLObject pcase_var = protocol;
    if( pcase_var.eql( $kw0$CFASL ) )
    {
      return cfasl_kernel.cfasl_channel_eval( api_request, channel );
    }
    if( pcase_var.eql( $kw1$CYC_API ) )
    {
      return api_kernel.cyc_api_channel_eval( api_request, channel );
    }
    return Errors.error( $str2$Unknown_API_protocol__S, protocol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject remote_image_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_remote_image( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject remote_image_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $remote_image_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject rmt_img_machine(final SubLObject v_object)
  {
    assert NIL != remote_image_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject rmt_img_port(final SubLObject v_object)
  {
    assert NIL != remote_image_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject rmt_img_protocol(final SubLObject v_object)
  {
    assert NIL != remote_image_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject _csetf_rmt_img_machine(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != remote_image_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject _csetf_rmt_img_port(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != remote_image_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject _csetf_rmt_img_protocol(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != remote_image_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject make_remote_image(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $remote_image_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw18$MACHINE ) )
      {
        _csetf_rmt_img_machine( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$PORT ) )
      {
        _csetf_rmt_img_port( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$PROTOCOL ) )
      {
        _csetf_rmt_img_protocol( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject visit_defstruct_remote_image(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_REMOTE_IMAGE, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$MACHINE, rmt_img_machine( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$PORT, rmt_img_port( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$PROTOCOL, rmt_img_protocol( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_REMOTE_IMAGE, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
  public static SubLObject visit_defstruct_object_remote_image_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_remote_image( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1701L)
  public static SubLObject print_remote_image(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str27$_REMOTE_IMAGE__A__A__A_, new SubLObject[] { remote_image_machine( v_object ), remote_image_port( v_object ), remote_image_protocol( v_object )
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1932L)
  public static SubLObject new_remote_image(final SubLObject machine, final SubLObject port, SubLObject protocol)
  {
    if( protocol == UNPROVIDED )
    {
      protocol = $kw0$CFASL;
    }
    final SubLObject v_remote_image = make_remote_image( UNPROVIDED );
    _csetf_rmt_img_machine( v_remote_image, machine );
    _csetf_rmt_img_port( v_remote_image, port );
    _csetf_rmt_img_protocol( v_remote_image, protocol );
    return v_remote_image;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2248L)
  public static SubLObject remote_image_machine(final SubLObject v_remote_image)
  {
    return rmt_img_machine( v_remote_image );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2367L)
  public static SubLObject remote_image_port(final SubLObject v_remote_image)
  {
    return rmt_img_port( v_remote_image );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2453L)
  public static SubLObject remote_image_protocol(final SubLObject v_remote_image)
  {
    return rmt_img_protocol( v_remote_image );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLObject remote_image_connection_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_remote_image_connection( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLObject remote_image_connection_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $remote_image_connection_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLObject rmt_img_conn_image(final SubLObject v_object)
  {
    assert NIL != remote_image_connection_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLObject rmt_img_conn_channel(final SubLObject v_object)
  {
    assert NIL != remote_image_connection_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLObject _csetf_rmt_img_conn_image(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != remote_image_connection_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLObject _csetf_rmt_img_conn_channel(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != remote_image_connection_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLObject make_remote_image_connection(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $remote_image_connection_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw41$IMAGE ) )
      {
        _csetf_rmt_img_conn_image( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$CHANNEL ) )
      {
        _csetf_rmt_img_conn_channel( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLObject visit_defstruct_remote_image_connection(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym43$MAKE_REMOTE_IMAGE_CONNECTION, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw41$IMAGE, rmt_img_conn_image( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw42$CHANNEL, rmt_img_conn_channel( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym43$MAKE_REMOTE_IMAGE_CONNECTION, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
  public static SubLObject visit_defstruct_object_remote_image_connection_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_remote_image_connection( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3091L)
  public static SubLObject print_remote_image_connection(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str45$_CONNECTION_to__A___A__, remote_image_connection_image( v_object ), remote_image_connection_channel( v_object ).isStream() ? $str46$open : $str47$closed );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3360L)
  public static SubLObject new_remote_image_connection(final SubLObject v_remote_image)
  {
    final SubLObject connection = make_remote_image_connection( UNPROVIDED );
    _csetf_rmt_img_conn_image( connection, v_remote_image );
    _csetf_rmt_img_conn_channel( connection, NIL );
    return connection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3619L)
  public static SubLObject remote_image_connection_image(final SubLObject connection)
  {
    return rmt_img_conn_image( connection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3746L)
  public static SubLObject remote_image_connection_channel(final SubLObject connection)
  {
    return rmt_img_conn_channel( connection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3850L)
  public static SubLObject open_remote_image_connection(final SubLObject connection)
  {
    SubLObject channel = remote_image_connection_channel( connection );
    if( NIL != channel )
    {
      return NIL;
    }
    final SubLObject machine = remote_image_connection_machine( connection );
    final SubLObject port = remote_image_connection_port( connection );
    channel = subl_promotions.open_tcp_stream_with_timeout( machine, port, NIL, $kw48$PRIVATE );
    _csetf_rmt_img_conn_channel( connection, channel );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 4356L)
  public static SubLObject close_remote_image_connection(final SubLObject connection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject channel = remote_image_connection_channel( connection );
    if( NIL == channel )
    {
      return NIL;
    }
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw49$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym50$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          try
          {
            try
            {
              remote_image_connection_eval( connection, $list51 );
            }
            finally
            {
              final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close( channel, UNPROVIDED );
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
            final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              _csetf_rmt_img_conn_channel( connection, NIL );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw49$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 4720L)
  public static SubLObject remote_image_connection_openP(final SubLObject connection)
  {
    return Types.streamp( remote_image_connection_channel( connection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 4857L)
  public static SubLObject remote_image_connection_closedP(final SubLObject connection)
  {
    return makeBoolean( !remote_image_connection_channel( connection ).isStream() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 4989L)
  public static SubLObject remote_image_connection_machine(final SubLObject connection)
  {
    return remote_image_machine( remote_image_connection_image( connection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5125L)
  public static SubLObject remote_image_connection_port(final SubLObject connection)
  {
    return remote_image_port( remote_image_connection_image( connection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5255L)
  public static SubLObject remote_image_connection_protocol(final SubLObject connection)
  {
    return remote_image_protocol( remote_image_connection_image( connection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5393L)
  public static SubLObject reopen_remote_image_connection(final SubLObject connection)
  {
    assert NIL != remote_image_connection_p( connection ) : connection;
    close_remote_image_connection( connection );
    open_remote_image_connection( connection );
    return connection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5629L)
  public static SubLObject remote_image_connection_eval(final SubLObject connection, final SubLObject api_request)
  {
    final SubLObject channel = remote_image_connection_channel( connection );
    final SubLObject protocol = remote_image_connection_protocol( connection );
    return api_channel_remote_eval( api_request, channel, protocol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5955L)
  public static SubLObject with_remote_image_connection(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject connection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    connection = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym53$CLET, ConsesLow.list( ConsesLow.list( $sym54$_CURRENT_REMOTE_IMAGE_CONNECTION_, connection ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 6103L)
  public static SubLObject current_remote_image_connection()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $current_remote_image_connection$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 6200L)
  public static SubLObject current_remote_image_connection_eval(final SubLObject api_request)
  {
    return remote_image_connection_eval( current_remote_image_connection(), api_request );
  }

  @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 6353L)
  public static SubLObject with_new_remote_image_connection(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_remote_image = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    v_remote_image = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject connection = $sym56$CONNECTION;
    return ConsesLow.list( $sym53$CLET, ConsesLow.list( ConsesLow.list( connection, ConsesLow.list( $sym57$NEW_REMOTE_IMAGE_CONNECTION, v_remote_image ) ) ), ConsesLow.list( $sym58$CUNWIND_PROTECT, ConsesLow.list(
        $sym59$PROGN, ConsesLow.list( $sym60$OPEN_REMOTE_IMAGE_CONNECTION, connection ), ConsesLow.listS( $sym61$WITH_REMOTE_IMAGE_CONNECTION, connection, ConsesLow.append( body, NIL ) ) ), ConsesLow.list(
            $sym62$CLOSE_REMOTE_IMAGE_CONNECTION, connection ) ) );
  }

  public static SubLObject declare_remote_image_file()
  {
    SubLFiles.declareFunction( me, "api_channel_remote_eval", "API-CHANNEL-REMOTE-EVAL", 2, 1, false );
    SubLFiles.declareFunction( me, "remote_image_print_function_trampoline", "REMOTE-IMAGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "remote_image_p", "REMOTE-IMAGE-P", 1, 0, false );
    new $remote_image_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rmt_img_machine", "RMT-IMG-MACHINE", 1, 0, false );
    SubLFiles.declareFunction( me, "rmt_img_port", "RMT-IMG-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "rmt_img_protocol", "RMT-IMG-PROTOCOL", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rmt_img_machine", "_CSETF-RMT-IMG-MACHINE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rmt_img_port", "_CSETF-RMT-IMG-PORT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rmt_img_protocol", "_CSETF-RMT-IMG-PROTOCOL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_remote_image", "MAKE-REMOTE-IMAGE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_remote_image", "VISIT-DEFSTRUCT-REMOTE-IMAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_remote_image_method", "VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_remote_image", "PRINT-REMOTE-IMAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_remote_image", "NEW-REMOTE-IMAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "remote_image_machine", "REMOTE-IMAGE-MACHINE", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_port", "REMOTE-IMAGE-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_protocol", "REMOTE-IMAGE-PROTOCOL", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_print_function_trampoline", "REMOTE-IMAGE-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_p", "REMOTE-IMAGE-CONNECTION-P", 1, 0, false );
    new $remote_image_connection_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rmt_img_conn_image", "RMT-IMG-CONN-IMAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "rmt_img_conn_channel", "RMT-IMG-CONN-CHANNEL", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rmt_img_conn_image", "_CSETF-RMT-IMG-CONN-IMAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rmt_img_conn_channel", "_CSETF-RMT-IMG-CONN-CHANNEL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_remote_image_connection", "MAKE-REMOTE-IMAGE-CONNECTION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_remote_image_connection", "VISIT-DEFSTRUCT-REMOTE-IMAGE-CONNECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_remote_image_connection_method", "VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-CONNECTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_remote_image_connection", "PRINT-REMOTE-IMAGE-CONNECTION", 3, 0, false );
    SubLFiles.declareFunction( me, "new_remote_image_connection", "NEW-REMOTE-IMAGE-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_image", "REMOTE-IMAGE-CONNECTION-IMAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_channel", "REMOTE-IMAGE-CONNECTION-CHANNEL", 1, 0, false );
    SubLFiles.declareFunction( me, "open_remote_image_connection", "OPEN-REMOTE-IMAGE-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "close_remote_image_connection", "CLOSE-REMOTE-IMAGE-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_openP", "REMOTE-IMAGE-CONNECTION-OPEN?", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_closedP", "REMOTE-IMAGE-CONNECTION-CLOSED?", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_machine", "REMOTE-IMAGE-CONNECTION-MACHINE", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_port", "REMOTE-IMAGE-CONNECTION-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_protocol", "REMOTE-IMAGE-CONNECTION-PROTOCOL", 1, 0, false );
    SubLFiles.declareFunction( me, "reopen_remote_image_connection", "REOPEN-REMOTE-IMAGE-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_image_connection_eval", "REMOTE-IMAGE-CONNECTION-EVAL", 2, 0, false );
    SubLFiles.declareMacro( me, "with_remote_image_connection", "WITH-REMOTE-IMAGE-CONNECTION" );
    SubLFiles.declareFunction( me, "current_remote_image_connection", "CURRENT-REMOTE-IMAGE-CONNECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "current_remote_image_connection_eval", "CURRENT-REMOTE-IMAGE-CONNECTION-EVAL", 1, 0, false );
    SubLFiles.declareMacro( me, "with_new_remote_image_connection", "WITH-NEW-REMOTE-IMAGE-CONNECTION" );
    return NIL;
  }

  public static SubLObject init_remote_image_file()
  {
    $dtp_remote_image$ = SubLFiles.defconstant( "*DTP-REMOTE-IMAGE*", $sym3$REMOTE_IMAGE );
    $dtp_remote_image_connection$ = SubLFiles.defconstant( "*DTP-REMOTE-IMAGE-CONNECTION*", $sym28$REMOTE_IMAGE_CONNECTION );
    $current_remote_image_connection$ = SubLFiles.defparameter( "*CURRENT-REMOTE-IMAGE-CONNECTION*", NIL );
    return NIL;
  }

  public static SubLObject setup_remote_image_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_remote_image$.getGlobalValue(), Symbols.symbol_function( $sym10$REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list11 );
    Structures.def_csetf( $sym12$RMT_IMG_MACHINE, $sym13$_CSETF_RMT_IMG_MACHINE );
    Structures.def_csetf( $sym14$RMT_IMG_PORT, $sym15$_CSETF_RMT_IMG_PORT );
    Structures.def_csetf( $sym16$RMT_IMG_PROTOCOL, $sym17$_CSETF_RMT_IMG_PROTOCOL );
    Equality.identity( $sym3$REMOTE_IMAGE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_remote_image$.getGlobalValue(), Symbols.symbol_function( $sym26$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_remote_image_connection$.getGlobalValue(), Symbols.symbol_function(
        $sym35$REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list36 );
    Structures.def_csetf( $sym37$RMT_IMG_CONN_IMAGE, $sym38$_CSETF_RMT_IMG_CONN_IMAGE );
    Structures.def_csetf( $sym39$RMT_IMG_CONN_CHANNEL, $sym40$_CSETF_RMT_IMG_CONN_CHANNEL );
    Equality.identity( $sym28$REMOTE_IMAGE_CONNECTION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_remote_image_connection$.getGlobalValue(), Symbols.symbol_function(
        $sym44$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_CONNECTION_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_remote_image_file();
  }

  @Override
  public void initializeVariables()
  {
    init_remote_image_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_remote_image_file();
  }
  static
  {
    me = new remote_image();
    $dtp_remote_image$ = null;
    $dtp_remote_image_connection$ = null;
    $current_remote_image_connection$ = null;
    $kw0$CFASL = makeKeyword( "CFASL" );
    $kw1$CYC_API = makeKeyword( "CYC-API" );
    $str2$Unknown_API_protocol__S = makeString( "Unknown API protocol ~S" );
    $sym3$REMOTE_IMAGE = makeSymbol( "REMOTE-IMAGE" );
    $sym4$REMOTE_IMAGE_P = makeSymbol( "REMOTE-IMAGE-P" );
    $list5 = ConsesLow.list( makeSymbol( "MACHINE" ), makeSymbol( "PORT" ), makeSymbol( "PROTOCOL" ) );
    $list6 = ConsesLow.list( makeKeyword( "MACHINE" ), makeKeyword( "PORT" ), makeKeyword( "PROTOCOL" ) );
    $list7 = ConsesLow.list( makeSymbol( "RMT-IMG-MACHINE" ), makeSymbol( "RMT-IMG-PORT" ), makeSymbol( "RMT-IMG-PROTOCOL" ) );
    $list8 = ConsesLow.list( makeSymbol( "_CSETF-RMT-IMG-MACHINE" ), makeSymbol( "_CSETF-RMT-IMG-PORT" ), makeSymbol( "_CSETF-RMT-IMG-PROTOCOL" ) );
    $sym9$PRINT_REMOTE_IMAGE = makeSymbol( "PRINT-REMOTE-IMAGE" );
    $sym10$REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "REMOTE-IMAGE-PRINT-FUNCTION-TRAMPOLINE" );
    $list11 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "REMOTE-IMAGE-P" ) );
    $sym12$RMT_IMG_MACHINE = makeSymbol( "RMT-IMG-MACHINE" );
    $sym13$_CSETF_RMT_IMG_MACHINE = makeSymbol( "_CSETF-RMT-IMG-MACHINE" );
    $sym14$RMT_IMG_PORT = makeSymbol( "RMT-IMG-PORT" );
    $sym15$_CSETF_RMT_IMG_PORT = makeSymbol( "_CSETF-RMT-IMG-PORT" );
    $sym16$RMT_IMG_PROTOCOL = makeSymbol( "RMT-IMG-PROTOCOL" );
    $sym17$_CSETF_RMT_IMG_PROTOCOL = makeSymbol( "_CSETF-RMT-IMG-PROTOCOL" );
    $kw18$MACHINE = makeKeyword( "MACHINE" );
    $kw19$PORT = makeKeyword( "PORT" );
    $kw20$PROTOCOL = makeKeyword( "PROTOCOL" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_REMOTE_IMAGE = makeSymbol( "MAKE-REMOTE-IMAGE" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-METHOD" );
    $str27$_REMOTE_IMAGE__A__A__A_ = makeString( "<REMOTE IMAGE ~A ~A ~A>" );
    $sym28$REMOTE_IMAGE_CONNECTION = makeSymbol( "REMOTE-IMAGE-CONNECTION" );
    $sym29$REMOTE_IMAGE_CONNECTION_P = makeSymbol( "REMOTE-IMAGE-CONNECTION-P" );
    $list30 = ConsesLow.list( makeSymbol( "IMAGE" ), makeSymbol( "CHANNEL" ) );
    $list31 = ConsesLow.list( makeKeyword( "IMAGE" ), makeKeyword( "CHANNEL" ) );
    $list32 = ConsesLow.list( makeSymbol( "RMT-IMG-CONN-IMAGE" ), makeSymbol( "RMT-IMG-CONN-CHANNEL" ) );
    $list33 = ConsesLow.list( makeSymbol( "_CSETF-RMT-IMG-CONN-IMAGE" ), makeSymbol( "_CSETF-RMT-IMG-CONN-CHANNEL" ) );
    $sym34$PRINT_REMOTE_IMAGE_CONNECTION = makeSymbol( "PRINT-REMOTE-IMAGE-CONNECTION" );
    $sym35$REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "REMOTE-IMAGE-CONNECTION-PRINT-FUNCTION-TRAMPOLINE" );
    $list36 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "REMOTE-IMAGE-CONNECTION-P" ) );
    $sym37$RMT_IMG_CONN_IMAGE = makeSymbol( "RMT-IMG-CONN-IMAGE" );
    $sym38$_CSETF_RMT_IMG_CONN_IMAGE = makeSymbol( "_CSETF-RMT-IMG-CONN-IMAGE" );
    $sym39$RMT_IMG_CONN_CHANNEL = makeSymbol( "RMT-IMG-CONN-CHANNEL" );
    $sym40$_CSETF_RMT_IMG_CONN_CHANNEL = makeSymbol( "_CSETF-RMT-IMG-CONN-CHANNEL" );
    $kw41$IMAGE = makeKeyword( "IMAGE" );
    $kw42$CHANNEL = makeKeyword( "CHANNEL" );
    $sym43$MAKE_REMOTE_IMAGE_CONNECTION = makeSymbol( "MAKE-REMOTE-IMAGE-CONNECTION" );
    $sym44$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_CONNECTION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-CONNECTION-METHOD" );
    $str45$_CONNECTION_to__A___A__ = makeString( "<CONNECTION to ~A (~A)>" );
    $str46$open = makeString( "open" );
    $str47$closed = makeString( "closed" );
    $kw48$PRIVATE = makeKeyword( "PRIVATE" );
    $kw49$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym50$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $list51 = ConsesLow.list( makeSymbol( "API-QUIT" ) );
    $list52 = ConsesLow.list( makeSymbol( "CONNECTION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym53$CLET = makeSymbol( "CLET" );
    $sym54$_CURRENT_REMOTE_IMAGE_CONNECTION_ = makeSymbol( "*CURRENT-REMOTE-IMAGE-CONNECTION*" );
    $list55 = ConsesLow.list( makeSymbol( "REMOTE-IMAGE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym56$CONNECTION = makeUninternedSymbol( "CONNECTION" );
    $sym57$NEW_REMOTE_IMAGE_CONNECTION = makeSymbol( "NEW-REMOTE-IMAGE-CONNECTION" );
    $sym58$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym59$PROGN = makeSymbol( "PROGN" );
    $sym60$OPEN_REMOTE_IMAGE_CONNECTION = makeSymbol( "OPEN-REMOTE-IMAGE-CONNECTION" );
    $sym61$WITH_REMOTE_IMAGE_CONNECTION = makeSymbol( "WITH-REMOTE-IMAGE-CONNECTION" );
    $sym62$CLOSE_REMOTE_IMAGE_CONNECTION = makeSymbol( "CLOSE-REMOTE-IMAGE-CONNECTION" );
  }

  public static final class $remote_image_native
      extends
        SubLStructNative
  {
    public SubLObject $machine;
    public SubLObject $port;
    public SubLObject $protocol;
    private static final SubLStructDeclNative structDecl;

    public $remote_image_native()
    {
      this.$machine = CommonSymbols.NIL;
      this.$port = CommonSymbols.NIL;
      this.$protocol = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $remote_image_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$machine;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$port;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$protocol;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$machine = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$port = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$protocol = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $remote_image_native.class, $sym3$REMOTE_IMAGE, $sym4$REMOTE_IMAGE_P, $list5, $list6, new String[] { "$machine", "$port", "$protocol"
      }, $list7, $list8, $sym9$PRINT_REMOTE_IMAGE );
    }
  }

  public static final class $remote_image_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $remote_image_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOTE-IMAGE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return remote_image_p( arg1 );
    }
  }

  public static final class $remote_image_connection_native
      extends
        SubLStructNative
  {
    public SubLObject $image;
    public SubLObject $channel;
    private static final SubLStructDeclNative structDecl;

    public $remote_image_connection_native()
    {
      this.$image = CommonSymbols.NIL;
      this.$channel = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $remote_image_connection_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$image;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$channel;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$image = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$channel = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $remote_image_connection_native.class, $sym28$REMOTE_IMAGE_CONNECTION, $sym29$REMOTE_IMAGE_CONNECTION_P, $list30, $list31, new String[] { "$image", "$channel"
      }, $list32, $list33, $sym34$PRINT_REMOTE_IMAGE_CONNECTION );
    }
  }

  public static final class $remote_image_connection_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $remote_image_connection_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOTE-IMAGE-CONNECTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return remote_image_connection_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 180 ms
 * 
 */