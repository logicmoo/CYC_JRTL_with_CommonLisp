package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_interface_infrastructure
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.hl_interface_infrastructure";
  public static final String myFingerPrint = "24845c486a94e15dde43c94c9b125bf322142bfaa9e5292d1ade95dfcc360fe5";
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 996L)
  public static SubLSymbol $hl_store_modification_and_access$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 1524L)
  public static SubLSymbol $override_hl_store_remote_accessP$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3201L)
  private static SubLSymbol $remote_hl_store_image$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3668L)
  private static SubLSymbol $remote_hl_store_connection_pool$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3765L)
  private static SubLSymbol $remote_hl_store_connection_pool_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3880L)
  private static SubLSymbol $remote_hl_store_connection_pool_max_size$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 9806L)
  public static SubLSymbol $hl_store_error_handling_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10984L)
  private static SubLSymbol $hl_store_iterators$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11129L)
  private static SubLSymbol $next_hl_store_iterator_id$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11814L)
  private static SubLSymbol $hl_store_iterator_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16233L)
  public static SubLSymbol $hl_transcript_stream$;
  private static final SubLSymbol $kw0$LOCAL_LOCAL;
  private static final SubLSymbol $kw1$BOTH_LOCAL;
  private static final SubLSymbol $kw2$BOTH_REMOTE;
  private static final SubLSymbol $kw3$REMOTE_REMOTE;
  private static final SubLSymbol $kw4$NONE_LOCAL;
  private static final SubLSymbol $sym5$CLET;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_REMOTE_HL_STORE_IMAGE_;
  private static final SubLSymbol $sym9$_REMOTE_HL_STORE_CONNECTION_POOL_;
  private static final SubLString $str10$Remote_HL_Store_Connection_Pool_L;
  private static final SubLString $str11$Could_not_open_a_connection_to__s;
  private static final SubLSymbol $kw12$CFASL;
  private static final SubLSymbol $sym13$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$DEFINE_API;
  private static final SubLSymbol $sym16$PROGN;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$NOTE_HL_MODIFIER_INVOCATION;
  private static final SubLSymbol $sym19$QUOTE;
  private static final SubLSymbol $sym20$PIF;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$WITHIN_HL_MODIFICATION;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$LIST;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$RESULT;
  private static final SubLSymbol $sym27$PWHEN;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$CSETQ;
  private static final SubLSymbol $sym30$HL_STORE_REMOTE_EVAL;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$OVERRIDE_REMOTE_HL_STORE_ACCESS;
  private static final SubLSymbol $sym33$RET;
  private static final SubLSymbol $sym34$DEFINE_HL_MODIFIER_PREAMBLE;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$DEFINE_HL_MODIFIER_POSTAMBLE;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $kw39$BREAK;
  private static final SubLSymbol $sym40$STRINGP;
  private static final SubLSymbol $kw41$IGNORE;
  private static final SubLSymbol $kw42$WARN;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$CHECK_TYPE;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$_HL_STORE_ERROR_HANDLING_MODE_;
  private static final SubLSymbol $sym47$WITH_HL_STORE_ERROR_HANDLING_MODE;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$_HL_STORE_ITERATORS_;
  private static final SubLSymbol $sym50$_NEXT_HL_STORE_ITERATOR_ID_;
  private static final SubLString $str51$HL_Store_Iterator_Lock;
  private static final SubLSymbol $sym52$LISTP;
  private static final SubLSymbol $sym53$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym54$NEW_HL_STORE_ITERATOR_INT;
  private static final SubLSymbol $sym55$HL_STORE_ITERATOR_DONE_;
  private static final SubLSymbol $sym56$HL_STORE_ITERATOR_NEXT;
  private static final SubLSymbol $sym57$HL_STORE_ITERATOR_DESTROY;
  private static final SubLSymbol $sym58$HL_STORE_ITERATOR_DONE_INT;
  private static final SubLSymbol $sym59$HL_STORE_ITERATOR_NEXT_INT;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$HL_STORE_ITERATOR_DESTROY_INT;
  private static final SubLSymbol $sym62$HL_STORE_BUFFERED_ITERATOR_DONE_;
  private static final SubLSymbol $sym63$HL_STORE_BUFFERED_ITERATOR_NEXT;
  private static final SubLSymbol $sym64$HL_STORE_BUFFERED_ITERATOR_DESTROY;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$HL_STORE_ITERATOR_NEXT_N_INT;
  private static final SubLSymbol $sym67$_HL_TRANSCRIPT_STREAM_;
  private static final SubLSymbol $kw68$OUTPUT;
  private static final SubLSymbol $kw69$UNPROVIDED;
  private static final SubLSymbol $kw70$INPUT;
  private static final SubLString $str71$Unable_to_open__S;
  private static final SubLSymbol $kw72$EOF;

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 1708L)
  public static SubLObject hl_modify_localP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( $kw0$LOCAL_LOCAL == $hl_store_modification_and_access$.getDynamicValue( thread ) || $kw1$BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue( thread )
        || $kw2$BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 1930L)
  public static SubLObject hl_modify_remoteP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( $kw3$REMOTE_REMOTE == $hl_store_modification_and_access$.getDynamicValue( thread ) || $kw1$BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue( thread )
        || $kw2$BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2155L)
  public static SubLObject hl_modify_anywhereP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( $kw0$LOCAL_LOCAL == $hl_store_modification_and_access$.getDynamicValue( thread ) || $kw3$REMOTE_REMOTE == $hl_store_modification_and_access$.getDynamicValue( thread )
        || $kw1$BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue( thread ) || $kw2$BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2440L)
  public static SubLObject hl_access_localP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $override_hl_store_remote_accessP$.getDynamicValue( thread ) || $kw0$LOCAL_LOCAL == $hl_store_modification_and_access$.getDynamicValue( thread )
        || $kw1$BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue( thread ) || $kw4$NONE_LOCAL == $hl_store_modification_and_access$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2701L)
  public static SubLObject hl_access_remoteP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == $override_hl_store_remote_accessP$.getDynamicValue( thread ) && ( $kw3$REMOTE_REMOTE == $hl_store_modification_and_access$.getDynamicValue( thread )
        || $kw2$BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2923L)
  public static SubLObject override_remote_hl_store_access(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym5$CLET, $list6, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3058L)
  public static SubLObject do_not_override_remote_hl_store_access(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym5$CLET, $list7, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3379L)
  public static SubLObject set_remote_hl_store_image(final SubLObject machine, final SubLObject port, final SubLObject protocol)
  {
    $remote_hl_store_image$.setGlobalValue( remote_image.new_remote_image( machine, port, protocol ) );
    return remote_image.remote_image_p( $remote_hl_store_image$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3571L)
  public static SubLObject unset_remote_hl_store_image()
  {
    $remote_hl_store_image$.setGlobalValue( NIL );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3946L)
  public static SubLObject clear_remote_hl_store_connection_pool()
  {
    for( SubLObject q = $remote_hl_store_connection_pool$.getGlobalValue(), done_var = queues.queue_empty_p( q ); NIL == done_var; done_var = queues.queue_empty_p( q ) )
    {
      final SubLObject connection = queues.dequeue( q );
      remote_image.close_remote_image_connection( connection );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 4130L)
  public static SubLObject create_remote_hl_store_connection()
  {
    final SubLObject connection = remote_image.new_remote_image_connection( $remote_hl_store_image$.getGlobalValue() );
    if( NIL != remote_image.remote_image_connection_p( connection ) )
    {
      remote_image.open_remote_image_connection( connection );
      return connection;
    }
    return Errors.error( $str11$Could_not_open_a_connection_to__s, $remote_hl_store_image$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 4493L)
  public static SubLObject release_hl_store_connection(final SubLObject connection)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $remote_hl_store_connection_pool_lock$.getGlobalValue() );
      if( queues.queue_size( $remote_hl_store_connection_pool$.getGlobalValue() ).numGE( $remote_hl_store_connection_pool_max_size$.getGlobalValue() ) )
      {
        remote_image.close_remote_image_connection( connection );
      }
      else
      {
        queues.enqueue( connection, $remote_hl_store_connection_pool$.getGlobalValue() );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $remote_hl_store_connection_pool_lock$.getGlobalValue() );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 4900L)
  public static SubLObject open_remote_hl_store_connection_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != remote_image.remote_image_connection_p( v_object ) && NIL != remote_image.remote_image_connection_openP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 5056L)
  public static SubLObject get_free_hl_store_connection()
  {
    SubLObject connection = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $remote_hl_store_connection_pool_lock$.getGlobalValue() );
      for( SubLObject q = $remote_hl_store_connection_pool$.getGlobalValue(), done_var = makeBoolean( NIL != connection || NIL != queues.queue_empty_p( q ) ); NIL == done_var; done_var = makeBoolean( NIL != connection
          || NIL != queues.queue_empty_p( q ) ) )
      {
        final SubLObject candidate = queues.dequeue( q );
        if( NIL != open_remote_hl_store_connection_p( candidate ) )
        {
          connection = candidate;
        }
      }
      if( NIL == connection )
      {
        connection = create_remote_hl_store_connection();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $remote_hl_store_connection_pool_lock$.getGlobalValue() );
      }
    }
    return connection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 5612L)
  public static SubLObject initialize_remote_hl_store_connections()
  {
    return clear_remote_hl_store_connection_pool();
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 5792L)
  public static SubLObject declare_remote_hl_store_image(final SubLObject machine, final SubLObject port, SubLObject protocol)
  {
    if( protocol == UNPROVIDED )
    {
      protocol = $kw12$CFASL;
    }
    set_remote_hl_store_image( machine, port, protocol );
    clear_remote_hl_store_connection_pool();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 5989L)
  public static SubLObject undeclare_remote_hl_store_image()
  {
    unset_remote_hl_store_image();
    clear_remote_hl_store_connection_pool();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 6128L)
  public static SubLObject hl_store_remote_eval(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym13$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject connection = get_free_hl_store_connection();
          final SubLObject _prev_bind_0_$1 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols( NIL );
            final SubLObject _prev_bind_0_$2 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
            final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
            final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
            final SubLObject _prev_bind_4 = cfasl.$cfasl_channel_externalizedP$.currentBinding( thread );
            try
            {
              api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
              api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
              api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
              cfasl.$cfasl_channel_externalizedP$.bind( NIL, thread );
              SubLObject success_var = NIL;
              try
              {
                result = remote_image.remote_image_connection_eval( connection, form );
                release_hl_store_connection( connection );
                success_var = T;
              }
              finally
              {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL == success_var )
                  {
                    remote_image.close_remote_image_connection( connection );
                  }
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
              cfasl.$cfasl_channel_externalizedP$.rebind( _prev_bind_4, thread );
              api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
              api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
              api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0_$2, thread );
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0_$1, thread );
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
      hl_store_error( error_message );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 6865L)
  public static SubLObject define_hl_creator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    SubLObject documentation_string = NIL;
    SubLObject type_declarations = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    documentation_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    type_declarations = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject formal_args = memoization_state.define_formal_args( arglist );
    return ConsesLow.list( $sym15$DEFINE_API, name, arglist, documentation_string, type_declarations, ConsesLow.list( $sym16$PROGN, $list17, ConsesLow.listS( $sym18$NOTE_HL_MODIFIER_INVOCATION, ConsesLow.list(
        $sym19$QUOTE, name ), ConsesLow.append( formal_args, NIL ) ), ConsesLow.listS( $sym20$PIF, $list21, reader.bq_cons( $sym22$WITHIN_HL_MODIFICATION, ConsesLow.append( body, NIL ) ), $list23 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 7512L)
  public static SubLObject define_hl_modifier(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    SubLObject documentation_string = NIL;
    SubLObject type_declarations = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    documentation_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    type_declarations = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject formal_args = memoization_state.define_formal_args( arglist );
    SubLObject eval_args = NIL;
    SubLObject cdolist_list_var = formal_args;
    SubLObject formal_arg = NIL;
    formal_arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject eval_arg = ConsesLow.list( $sym24$LIST, $list25, formal_arg );
      eval_args = ConsesLow.cons( eval_arg, eval_args );
      cdolist_list_var = cdolist_list_var.rest();
      formal_arg = cdolist_list_var.first();
    }
    eval_args = Sequences.nreverse( eval_args );
    final SubLObject result = $sym26$RESULT;
    return ConsesLow.list( $sym15$DEFINE_API, name, arglist, documentation_string, type_declarations, ConsesLow.list( $sym5$CLET, ConsesLow.list( result ), $list17, ConsesLow.listS( $sym18$NOTE_HL_MODIFIER_INVOCATION,
        ConsesLow.list( $sym19$QUOTE, name ), ConsesLow.append( formal_args, NIL ) ), ConsesLow.list( $sym27$PWHEN, $list28, ConsesLow.list( $sym29$CSETQ, result, ConsesLow.list( $sym30$HL_STORE_REMOTE_EVAL, ConsesLow
            .listS( $sym24$LIST, ConsesLow.list( $sym19$QUOTE, name ), ConsesLow.append( eval_args, NIL ) ) ) ) ), ConsesLow.list( $sym20$PIF, $list31, ConsesLow.list( $sym32$OVERRIDE_REMOTE_HL_STORE_ACCESS, reader
                .bq_cons( $sym22$WITHIN_HL_MODIFICATION, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym33$RET, result ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 8594L)
  public static SubLObject define_hl_modifier_preamble()
  {
    memoization_state.clear_hl_store_dependent_caches();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 8823L)
  public static SubLObject define_hl_modifier_postamble()
  {
    memoization_state.clear_hl_store_dependent_caches();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 9053L)
  public static SubLObject define_hl_accessor(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    SubLObject documentation_string = NIL;
    SubLObject type_declarations = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    documentation_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    type_declarations = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject formal_args = memoization_state.define_formal_args( arglist );
    SubLObject eval_args = NIL;
    SubLObject cdolist_list_var = formal_args;
    SubLObject formal_arg = NIL;
    formal_arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject eval_arg = ConsesLow.list( $sym24$LIST, $list25, formal_arg );
      eval_args = ConsesLow.cons( eval_arg, eval_args );
      cdolist_list_var = cdolist_list_var.rest();
      formal_arg = cdolist_list_var.first();
    }
    eval_args = Sequences.nreverse( eval_args );
    return ConsesLow.list( $sym15$DEFINE_API, name, arglist, documentation_string, type_declarations, ConsesLow.list( $sym20$PIF, $list37, ConsesLow.list( $sym33$RET, ConsesLow.list( $sym30$HL_STORE_REMOTE_EVAL,
        ConsesLow.listS( $sym24$LIST, ConsesLow.list( $sym19$QUOTE, name ), ConsesLow.append( eval_args, NIL ) ) ) ), reader.bq_cons( $sym16$PROGN, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 9886L)
  public static SubLObject valid_hl_store_error_handling_mode_p(final SubLObject mode)
  {
    return subl_promotions.memberP( mode, $list38, Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10002L)
  public static SubLObject hl_store_error_handling_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $hl_store_error_handling_mode$.getDynamicValue( thread ) ) ? $hl_store_error_handling_mode$.getDynamicValue( thread ) : $kw39$BREAK;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10109L)
  public static SubLObject hl_store_error(final SubLObject error_message)
  {
    assert NIL != Types.stringp( error_message ) : error_message;
    final SubLObject pcase_var = hl_store_error_handling_mode();
    if( pcase_var.eql( $kw41$IGNORE ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw42$WARN ) )
    {
      return Errors.warn( error_message );
    }
    if( pcase_var.eql( $kw39$BREAK ) )
    {
      return Errors.error( error_message );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10355L)
  public static SubLObject with_hl_store_error_handling_mode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mode = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    mode = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym16$PROGN, ConsesLow.listS( $sym44$CHECK_TYPE, mode, $list45 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym46$_HL_STORE_ERROR_HANDLING_MODE_, mode ) ), ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10569L)
  public static SubLObject with_hl_store_ignore_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym47$WITH_HL_STORE_ERROR_HANDLING_MODE, $kw41$IGNORE, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10695L)
  public static SubLObject with_hl_store_warn_on_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym47$WITH_HL_STORE_ERROR_HANDLING_MODE, $kw42$WARN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10820L)
  public static SubLObject with_hl_store_break_on_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym5$CLET, $list48, ConsesLow.listS( $sym47$WITH_HL_STORE_ERROR_HANDLING_MODE, $kw39$BREAK, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11179L)
  public static SubLObject reset_next_hl_store_iterator_id()
  {
    $next_hl_store_iterator_id$.setGlobalValue( ZERO_INTEGER );
    return $next_hl_store_iterator_id$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11310L)
  public static SubLObject candidate_next_hl_store_iterator_id()
  {
    final SubLObject next_id = $next_hl_store_iterator_id$.getGlobalValue();
    $next_hl_store_iterator_id$.setGlobalValue( Numbers.add( $next_hl_store_iterator_id$.getGlobalValue(), ONE_INTEGER ) );
    if( $next_hl_store_iterator_id$.getGlobalValue().numE( Numbers.$most_positive_fixnum$.getGlobalValue() ) )
    {
      $next_hl_store_iterator_id$.setGlobalValue( ZERO_INTEGER );
    }
    return next_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11584L)
  public static SubLObject new_hl_store_iterator_id()
  {
    SubLObject next_id;
    for( next_id = candidate_next_hl_store_iterator_id(); NIL != lookup_hl_store_iterator( next_id ); next_id = candidate_next_hl_store_iterator_id() )
    {
    }
    return next_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11899L)
  public static SubLObject note_hl_store_iterator(final SubLObject iterator)
  {
    SubLObject id = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $hl_store_iterator_lock$.getGlobalValue() );
      id = new_hl_store_iterator_id();
      dictionary.dictionary_enter( $hl_store_iterators$.getGlobalValue(), id, iterator );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $hl_store_iterator_lock$.getGlobalValue() );
      }
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12128L)
  public static SubLObject lookup_hl_store_iterator(final SubLObject id)
  {
    return dictionary.dictionary_lookup_without_values( $hl_store_iterators$.getGlobalValue(), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12243L)
  public static SubLObject unnote_hl_store_iterator(final SubLObject id)
  {
    SubLObject result = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $hl_store_iterator_lock$.getGlobalValue() );
      result = dictionary.dictionary_remove( $hl_store_iterators$.getGlobalValue(), id );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $hl_store_iterator_lock$.getGlobalValue() );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12439L)
  public static SubLObject new_hl_store_iterator_int(final SubLObject form)
  {
    final SubLObject iterator = Eval.eval( form );
    return ( NIL != iteration.iterator_p( iterator ) ) ? note_hl_store_iterator( iterator ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12605L)
  public static SubLObject hl_store_iterator_next_int(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iterator = lookup_hl_store_iterator( id );
    if( NIL != iterator )
    {
      thread.resetMultipleValues();
      final SubLObject next = iteration.iteration_next( iterator );
      final SubLObject validP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return ConsesLow.list( next, validP );
    }
    return ConsesLow.list( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12851L)
  public static SubLObject hl_store_iterator_next_n_int(final SubLObject id, final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iterator = lookup_hl_store_iterator( id );
    SubLObject result = NIL;
    if( NIL != iterator )
    {
      SubLObject doneP;
      SubLObject count;
      SubLObject next;
      SubLObject validP;
      for( doneP = NIL, count = NIL, count = ZERO_INTEGER; !count.numG( n ) && NIL == doneP; count = Numbers.add( count, ONE_INTEGER ) )
      {
        thread.resetMultipleValues();
        next = iteration.iteration_next( iterator );
        validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != validP )
        {
          result = ConsesLow.cons( next, result );
        }
        else
        {
          doneP = T;
        }
      }
      result = Sequences.nreverse( result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 13256L)
  public static SubLObject hl_store_iterator_done_int(final SubLObject id)
  {
    final SubLObject iterator = lookup_hl_store_iterator( id );
    if( NIL != iterator )
    {
      return iteration.iteration_done( iterator );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 13423L)
  public static SubLObject hl_store_iterator_destroy_int(final SubLObject id)
  {
    final SubLObject iterator = lookup_hl_store_iterator( id );
    if( NIL != iterator )
    {
      unnote_hl_store_iterator( id );
      return iteration.iteration_finalize( iterator );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 13643L)
  public static SubLObject new_hl_store_iterator(final SubLObject form, SubLObject buffer_size)
  {
    if( buffer_size == UNPROVIDED )
    {
      buffer_size = ONE_INTEGER;
    }
    assert NIL != Types.listp( form ) : form;
    assert NIL != subl_promotions.positive_integer_p( buffer_size ) : buffer_size;
    final SubLObject id = ( NIL != hl_access_remoteP() ) ? hl_store_remote_eval( ConsesLow.list( $sym54$NEW_HL_STORE_ITERATOR_INT, ConsesLow.list( $sym19$QUOTE, form ) ) ) : new_hl_store_iterator_int( form );
    return buffer_size.numE( ONE_INTEGER ) ? create_hl_store_iterator( id ) : create_hl_store_buffered_iterator( id, buffer_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14081L)
  public static SubLObject destroy_hl_store_iterator(final SubLObject iterator)
  {
    return iteration.iteration_finalize( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14176L)
  public static SubLObject create_hl_store_iterator(final SubLObject id)
  {
    return iteration.new_iterator( id, $sym55$HL_STORE_ITERATOR_DONE_, $sym56$HL_STORE_ITERATOR_NEXT, $sym57$HL_STORE_ITERATOR_DESTROY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14369L)
  public static SubLObject hl_store_iterator_doneP(final SubLObject id)
  {
    return ( NIL != hl_access_remoteP() ) ? hl_store_remote_eval( ConsesLow.list( $sym58$HL_STORE_ITERATOR_DONE_INT, id ) ) : hl_store_iterator_done_int( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14551L)
  public static SubLObject hl_store_iterator_next(final SubLObject id)
  {
    SubLObject current;
    final SubLObject datum = current = ( ( NIL != hl_access_remoteP() ) ? hl_store_remote_eval( ConsesLow.list( $sym59$HL_STORE_ITERATOR_NEXT_INT, id ) ) : hl_store_iterator_next_int( id ) );
    SubLObject next = NIL;
    SubLObject validP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    next = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    validP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return subl_promotions.values3( next, id, Types.sublisp_null( validP ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14808L)
  public static SubLObject hl_store_iterator_destroy(final SubLObject id)
  {
    return ( NIL != hl_access_remoteP() ) ? hl_store_remote_eval( ConsesLow.list( $sym61$HL_STORE_ITERATOR_DESTROY_INT, id ) ) : hl_store_iterator_destroy_int( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14998L)
  public static SubLObject create_hl_store_buffered_iterator(final SubLObject id, final SubLObject buffer_size)
  {
    final SubLObject state = ConsesLow.list( NIL, id, buffer_size );
    return iteration.new_iterator( state, $sym62$HL_STORE_BUFFERED_ITERATOR_DONE_, $sym63$HL_STORE_BUFFERED_ITERATOR_NEXT, $sym64$HL_STORE_BUFFERED_ITERATOR_DESTROY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 15296L)
  public static SubLObject hl_store_buffered_iterator_doneP(final SubLObject state)
  {
    SubLObject buffer = NIL;
    SubLObject id = NIL;
    SubLObject n = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list65 );
    buffer = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list65 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list65 );
    n = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL == buffer && NIL != hl_store_iterator_doneP( id ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 15484L)
  public static SubLObject hl_store_buffered_iterator_next(final SubLObject state)
  {
    SubLObject next = NIL;
    SubLObject invalidP = NIL;
    SubLObject buffer = NIL;
    SubLObject id = NIL;
    SubLObject n = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list65 );
    buffer = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list65 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list65 );
    n = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == buffer )
      {
        final SubLObject new_buffer = ( NIL != hl_access_remoteP() ) ? hl_store_remote_eval( ConsesLow.list( $sym66$HL_STORE_ITERATOR_NEXT_N_INT, id, n ) ) : hl_store_iterator_next_n_int( id, n );
        if( NIL != new_buffer )
        {
          next = new_buffer.first();
          ConsesLow.set_nth( ZERO_INTEGER, state, new_buffer.rest() );
        }
        else
        {
          invalidP = T;
        }
      }
      else
      {
        next = buffer.first();
        ConsesLow.set_nth( ZERO_INTEGER, state, buffer.rest() );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list65 );
    }
    return subl_promotions.values3( next, state, invalidP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16063L)
  public static SubLObject hl_store_buffered_iterator_destroy(final SubLObject state)
  {
    SubLObject buffer = NIL;
    SubLObject id = NIL;
    SubLObject n = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list65 );
    buffer = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list65 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list65 );
    n = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return hl_store_iterator_destroy( id );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16441L)
  public static SubLObject open_hl_transcript(final SubLObject filename)
  {
    final SubLObject stream = compatibility.open_binary( filename, $kw68$OUTPUT );
    if( stream.isStream() )
    {
      $hl_transcript_stream$.setGlobalValue( stream );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16660L)
  public static SubLObject close_hl_transcript()
  {
    if( $hl_transcript_stream$.getGlobalValue().isStream() )
    {
      streams_high.close( $hl_transcript_stream$.getGlobalValue(), UNPROVIDED );
      $hl_transcript_stream$.setGlobalValue( NIL );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16863L)
  public static SubLObject new_hl_transcript_op(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6,
      final SubLObject arg7)
  {
    final SubLObject args = Sequences.remove( $kw69$UNPROVIDED, ConsesLow.list( arg1, arg2, arg3, arg4, arg5, arg6, arg7 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ConsesLow.listS( func, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 17075L)
  public static SubLObject note_hl_modifier_invocation(final SubLObject name, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = $kw69$UNPROVIDED;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = $kw69$UNPROVIDED;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = $kw69$UNPROVIDED;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = $kw69$UNPROVIDED;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = $kw69$UNPROVIDED;
    }
    if( arg6 == UNPROVIDED )
    {
      arg6 = $kw69$UNPROVIDED;
    }
    if( arg7 == UNPROVIDED )
    {
      arg7 = $kw69$UNPROVIDED;
    }
    if( $hl_transcript_stream$.getGlobalValue().isStream() )
    {
      final SubLObject hlop = new_hl_transcript_op( name, arg1, arg2, arg3, arg4, arg5, arg6, arg7 );
      cfasl.cfasl_output_externalized( hlop, $hl_transcript_stream$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 17473L)
  public static SubLObject load_hl_transcript(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw70$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str71$Unable_to_open__S, filename );
      }
      final SubLObject stream_$4 = stream;
      SubLObject result = NIL;
      while ( $kw72$EOF != result)
      {
        result = load_one_hl_transcript_op( stream_$4 );
        if( $kw72$EOF != result )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 17820L)
  public static SubLObject load_one_hl_transcript_op(final SubLObject stream)
  {
    final SubLObject hlop = cfasl.cfasl_input( stream, NIL, UNPROVIDED );
    if( $kw72$EOF == hlop )
    {
      return $kw72$EOF;
    }
    return eval_hl_transcript_op( hlop );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 17991L)
  public static SubLObject eval_hl_transcript_op(final SubLObject hlop)
  {
    final SubLObject func = hlop.first();
    final SubLObject arg1 = conses_high.second( hlop );
    final SubLObject rest_args = conses_high.nthcdr( TWO_INTEGER, hlop );
    return Functions.apply( func, arg1, rest_args );
  }

  public static SubLObject declare_hl_interface_infrastructure_file()
  {
    SubLFiles.declareFunction( me, "hl_modify_localP", "HL-MODIFY-LOCAL?", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_modify_remoteP", "HL-MODIFY-REMOTE?", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_modify_anywhereP", "HL-MODIFY-ANYWHERE?", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_access_localP", "HL-ACCESS-LOCAL?", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_access_remoteP", "HL-ACCESS-REMOTE?", 0, 0, false );
    SubLFiles.declareMacro( me, "override_remote_hl_store_access", "OVERRIDE-REMOTE-HL-STORE-ACCESS" );
    SubLFiles.declareMacro( me, "do_not_override_remote_hl_store_access", "DO-NOT-OVERRIDE-REMOTE-HL-STORE-ACCESS" );
    SubLFiles.declareFunction( me, "set_remote_hl_store_image", "SET-REMOTE-HL-STORE-IMAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "unset_remote_hl_store_image", "UNSET-REMOTE-HL-STORE-IMAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_remote_hl_store_connection_pool", "CLEAR-REMOTE-HL-STORE-CONNECTION-POOL", 0, 0, false );
    SubLFiles.declareFunction( me, "create_remote_hl_store_connection", "CREATE-REMOTE-HL-STORE-CONNECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "release_hl_store_connection", "RELEASE-HL-STORE-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "open_remote_hl_store_connection_p", "OPEN-REMOTE-HL-STORE-CONNECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_free_hl_store_connection", "GET-FREE-HL-STORE-CONNECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_remote_hl_store_connections", "INITIALIZE-REMOTE-HL-STORE-CONNECTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_remote_hl_store_image", "DECLARE-REMOTE-HL-STORE-IMAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "undeclare_remote_hl_store_image", "UNDECLARE-REMOTE-HL-STORE-IMAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_store_remote_eval", "HL-STORE-REMOTE-EVAL", 1, 0, false );
    SubLFiles.declareMacro( me, "define_hl_creator", "DEFINE-HL-CREATOR" );
    SubLFiles.declareMacro( me, "define_hl_modifier", "DEFINE-HL-MODIFIER" );
    SubLFiles.declareFunction( me, "define_hl_modifier_preamble", "DEFINE-HL-MODIFIER-PREAMBLE", 0, 0, false );
    SubLFiles.declareFunction( me, "define_hl_modifier_postamble", "DEFINE-HL-MODIFIER-POSTAMBLE", 0, 0, false );
    SubLFiles.declareMacro( me, "define_hl_accessor", "DEFINE-HL-ACCESSOR" );
    SubLFiles.declareFunction( me, "valid_hl_store_error_handling_mode_p", "VALID-HL-STORE-ERROR-HANDLING-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_store_error_handling_mode", "HL-STORE-ERROR-HANDLING-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_store_error", "HL-STORE-ERROR", 1, 0, false );
    SubLFiles.declareMacro( me, "with_hl_store_error_handling_mode", "WITH-HL-STORE-ERROR-HANDLING-MODE" );
    SubLFiles.declareMacro( me, "with_hl_store_ignore_errors", "WITH-HL-STORE-IGNORE-ERRORS" );
    SubLFiles.declareMacro( me, "with_hl_store_warn_on_errors", "WITH-HL-STORE-WARN-ON-ERRORS" );
    SubLFiles.declareMacro( me, "with_hl_store_break_on_errors", "WITH-HL-STORE-BREAK-ON-ERRORS" );
    SubLFiles.declareFunction( me, "reset_next_hl_store_iterator_id", "RESET-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "candidate_next_hl_store_iterator_id", "CANDIDATE-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "new_hl_store_iterator_id", "NEW-HL-STORE-ITERATOR-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "note_hl_store_iterator", "NOTE-HL-STORE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "lookup_hl_store_iterator", "LOOKUP-HL-STORE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "unnote_hl_store_iterator", "UNNOTE-HL-STORE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_hl_store_iterator_int", "NEW-HL-STORE-ITERATOR-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_store_iterator_next_int", "HL-STORE-ITERATOR-NEXT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_store_iterator_next_n_int", "HL-STORE-ITERATOR-NEXT-N-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_store_iterator_done_int", "HL-STORE-ITERATOR-DONE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_store_iterator_destroy_int", "HL-STORE-ITERATOR-DESTROY-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_hl_store_iterator", "NEW-HL-STORE-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "destroy_hl_store_iterator", "DESTROY-HL-STORE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "create_hl_store_iterator", "CREATE-HL-STORE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_store_iterator_doneP", "HL-STORE-ITERATOR-DONE?", 1, 0, false );
    new $hl_store_iterator_doneP$UnaryFunction();
    SubLFiles.declareFunction( me, "hl_store_iterator_next", "HL-STORE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_store_iterator_destroy", "HL-STORE-ITERATOR-DESTROY", 1, 0, false );
    new $hl_store_iterator_destroy$UnaryFunction();
    SubLFiles.declareFunction( me, "create_hl_store_buffered_iterator", "CREATE-HL-STORE-BUFFERED-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_store_buffered_iterator_doneP", "HL-STORE-BUFFERED-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_store_buffered_iterator_next", "HL-STORE-BUFFERED-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_store_buffered_iterator_destroy", "HL-STORE-BUFFERED-ITERATOR-DESTROY", 1, 0, false );
    SubLFiles.declareFunction( me, "open_hl_transcript", "OPEN-HL-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "close_hl_transcript", "CLOSE-HL-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "new_hl_transcript_op", "NEW-HL-TRANSCRIPT-OP", 8, 0, false );
    SubLFiles.declareFunction( me, "note_hl_modifier_invocation", "NOTE-HL-MODIFIER-INVOCATION", 1, 7, false );
    SubLFiles.declareFunction( me, "load_hl_transcript", "LOAD-HL-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "load_one_hl_transcript_op", "LOAD-ONE-HL-TRANSCRIPT-OP", 1, 0, false );
    SubLFiles.declareFunction( me, "eval_hl_transcript_op", "EVAL-HL-TRANSCRIPT-OP", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_hl_interface_infrastructure_file()
  {
    $hl_store_modification_and_access$ = SubLFiles.defvar( "*HL-STORE-MODIFICATION-AND-ACCESS*", $kw0$LOCAL_LOCAL );
    $override_hl_store_remote_accessP$ = SubLFiles.defvar( "*OVERRIDE-HL-STORE-REMOTE-ACCESS?*", NIL );
    $remote_hl_store_image$ = SubLFiles.deflexical( "*REMOTE-HL-STORE-IMAGE*", ( maybeDefault( $sym8$_REMOTE_HL_STORE_IMAGE_, $remote_hl_store_image$, NIL ) ) );
    $remote_hl_store_connection_pool$ = SubLFiles.deflexical( "*REMOTE-HL-STORE-CONNECTION-POOL*", maybeDefault( $sym9$_REMOTE_HL_STORE_CONNECTION_POOL_, $remote_hl_store_connection_pool$, () -> ( queues.create_queue(
        UNPROVIDED ) ) ) );
    $remote_hl_store_connection_pool_lock$ = SubLFiles.deflexical( "*REMOTE-HL-STORE-CONNECTION-POOL-LOCK*", Locks.make_lock( $str10$Remote_HL_Store_Connection_Pool_L ) );
    $remote_hl_store_connection_pool_max_size$ = SubLFiles.deflexical( "*REMOTE-HL-STORE-CONNECTION-POOL-MAX-SIZE*", NINE_INTEGER );
    $hl_store_error_handling_mode$ = SubLFiles.defparameter( "*HL-STORE-ERROR-HANDLING-MODE*", NIL );
    $hl_store_iterators$ = SubLFiles.deflexical( "*HL-STORE-ITERATORS*", maybeDefault( $sym49$_HL_STORE_ITERATORS_, $hl_store_iterators$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQL ),
        UNPROVIDED ) ) ) );
    $next_hl_store_iterator_id$ = SubLFiles.deflexical( "*NEXT-HL-STORE-ITERATOR-ID*", ( maybeDefault( $sym50$_NEXT_HL_STORE_ITERATOR_ID_, $next_hl_store_iterator_id$, ZERO_INTEGER ) ) );
    $hl_store_iterator_lock$ = SubLFiles.deflexical( "*HL-STORE-ITERATOR-LOCK*", Locks.make_lock( $str51$HL_Store_Iterator_Lock ) );
    $hl_transcript_stream$ = SubLFiles.deflexical( "*HL-TRANSCRIPT-STREAM*", ( maybeDefault( $sym67$_HL_TRANSCRIPT_STREAM_, $hl_transcript_stream$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_hl_interface_infrastructure_file()
  {
    subl_macro_promotions.declare_defglobal( $sym8$_REMOTE_HL_STORE_IMAGE_ );
    subl_macro_promotions.declare_defglobal( $sym9$_REMOTE_HL_STORE_CONNECTION_POOL_ );
    access_macros.register_macro_helper( $sym34$DEFINE_HL_MODIFIER_PREAMBLE, $list35 );
    access_macros.register_macro_helper( $sym36$DEFINE_HL_MODIFIER_POSTAMBLE, $list35 );
    subl_macro_promotions.declare_defglobal( $sym49$_HL_STORE_ITERATORS_ );
    subl_macro_promotions.declare_defglobal( $sym50$_NEXT_HL_STORE_ITERATOR_ID_ );
    subl_macro_promotions.declare_defglobal( $sym67$_HL_TRANSCRIPT_STREAM_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_hl_interface_infrastructure_file();
  }

  @Override
  public void initializeVariables()
  {
    init_hl_interface_infrastructure_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_hl_interface_infrastructure_file();
  }
  static
  {
    me = new hl_interface_infrastructure();
    $hl_store_modification_and_access$ = null;
    $override_hl_store_remote_accessP$ = null;
    $remote_hl_store_image$ = null;
    $remote_hl_store_connection_pool$ = null;
    $remote_hl_store_connection_pool_lock$ = null;
    $remote_hl_store_connection_pool_max_size$ = null;
    $hl_store_error_handling_mode$ = null;
    $hl_store_iterators$ = null;
    $next_hl_store_iterator_id$ = null;
    $hl_store_iterator_lock$ = null;
    $hl_transcript_stream$ = null;
    $kw0$LOCAL_LOCAL = makeKeyword( "LOCAL-LOCAL" );
    $kw1$BOTH_LOCAL = makeKeyword( "BOTH-LOCAL" );
    $kw2$BOTH_REMOTE = makeKeyword( "BOTH-REMOTE" );
    $kw3$REMOTE_REMOTE = makeKeyword( "REMOTE-REMOTE" );
    $kw4$NONE_LOCAL = makeKeyword( "NONE-LOCAL" );
    $sym5$CLET = makeSymbol( "CLET" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "*OVERRIDE-HL-STORE-REMOTE-ACCESS?*" ), T ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "*OVERRIDE-HL-STORE-REMOTE-ACCESS?*" ), NIL ) );
    $sym8$_REMOTE_HL_STORE_IMAGE_ = makeSymbol( "*REMOTE-HL-STORE-IMAGE*" );
    $sym9$_REMOTE_HL_STORE_CONNECTION_POOL_ = makeSymbol( "*REMOTE-HL-STORE-CONNECTION-POOL*" );
    $str10$Remote_HL_Store_Connection_Pool_L = makeString( "Remote HL Store Connection Pool Lock" );
    $str11$Could_not_open_a_connection_to__s = makeString( "Could not open a connection to ~s" );
    $kw12$CFASL = makeKeyword( "CFASL" );
    $sym13$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $list14 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "DOCUMENTATION-STRING" ), makeSymbol( "TYPE-DECLARATIONS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym15$DEFINE_API = makeSymbol( "DEFINE-API" );
    $sym16$PROGN = makeSymbol( "PROGN" );
    $list17 = ConsesLow.list( makeSymbol( "DEFINE-HL-MODIFIER-PREAMBLE" ) );
    $sym18$NOTE_HL_MODIFIER_INVOCATION = makeSymbol( "NOTE-HL-MODIFIER-INVOCATION" );
    $sym19$QUOTE = makeSymbol( "QUOTE" );
    $sym20$PIF = makeSymbol( "PIF" );
    $list21 = ConsesLow.list( makeSymbol( "HL-MODIFY-ANYWHERE?" ) );
    $sym22$WITHIN_HL_MODIFICATION = makeSymbol( "WITHIN-HL-MODIFICATION" );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym24$LIST = makeSymbol( "LIST" );
    $list25 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUOTE" ) );
    $sym26$RESULT = makeUninternedSymbol( "RESULT" );
    $sym27$PWHEN = makeSymbol( "PWHEN" );
    $list28 = ConsesLow.list( makeSymbol( "HL-MODIFY-REMOTE?" ) );
    $sym29$CSETQ = makeSymbol( "CSETQ" );
    $sym30$HL_STORE_REMOTE_EVAL = makeSymbol( "HL-STORE-REMOTE-EVAL" );
    $list31 = ConsesLow.list( makeSymbol( "HL-MODIFY-LOCAL?" ) );
    $sym32$OVERRIDE_REMOTE_HL_STORE_ACCESS = makeSymbol( "OVERRIDE-REMOTE-HL-STORE-ACCESS" );
    $sym33$RET = makeSymbol( "RET" );
    $sym34$DEFINE_HL_MODIFIER_PREAMBLE = makeSymbol( "DEFINE-HL-MODIFIER-PREAMBLE" );
    $list35 = ConsesLow.list( makeSymbol( "DEFINE-HL-MODIFIER" ), makeSymbol( "DEFINE-HL-CREATOR" ) );
    $sym36$DEFINE_HL_MODIFIER_POSTAMBLE = makeSymbol( "DEFINE-HL-MODIFIER-POSTAMBLE" );
    $list37 = ConsesLow.list( makeSymbol( "HL-ACCESS-REMOTE?" ) );
    $list38 = ConsesLow.list( makeKeyword( "IGNORE" ), makeKeyword( "WARN" ), makeKeyword( "BREAK" ) );
    $kw39$BREAK = makeKeyword( "BREAK" );
    $sym40$STRINGP = makeSymbol( "STRINGP" );
    $kw41$IGNORE = makeKeyword( "IGNORE" );
    $kw42$WARN = makeKeyword( "WARN" );
    $list43 = ConsesLow.list( makeSymbol( "MODE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym44$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list45 = ConsesLow.list( makeSymbol( "VALID-HL-STORE-ERROR-HANDLING-MODE-P" ) );
    $sym46$_HL_STORE_ERROR_HANDLING_MODE_ = makeSymbol( "*HL-STORE-ERROR-HANDLING-MODE*" );
    $sym47$WITH_HL_STORE_ERROR_HANDLING_MODE = makeSymbol( "WITH-HL-STORE-ERROR-HANDLING-MODE" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "*INFERENCE-DEBUG?*" ), T ) );
    $sym49$_HL_STORE_ITERATORS_ = makeSymbol( "*HL-STORE-ITERATORS*" );
    $sym50$_NEXT_HL_STORE_ITERATOR_ID_ = makeSymbol( "*NEXT-HL-STORE-ITERATOR-ID*" );
    $str51$HL_Store_Iterator_Lock = makeString( "HL Store Iterator Lock" );
    $sym52$LISTP = makeSymbol( "LISTP" );
    $sym53$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym54$NEW_HL_STORE_ITERATOR_INT = makeSymbol( "NEW-HL-STORE-ITERATOR-INT" );
    $sym55$HL_STORE_ITERATOR_DONE_ = makeSymbol( "HL-STORE-ITERATOR-DONE?" );
    $sym56$HL_STORE_ITERATOR_NEXT = makeSymbol( "HL-STORE-ITERATOR-NEXT" );
    $sym57$HL_STORE_ITERATOR_DESTROY = makeSymbol( "HL-STORE-ITERATOR-DESTROY" );
    $sym58$HL_STORE_ITERATOR_DONE_INT = makeSymbol( "HL-STORE-ITERATOR-DONE-INT" );
    $sym59$HL_STORE_ITERATOR_NEXT_INT = makeSymbol( "HL-STORE-ITERATOR-NEXT-INT" );
    $list60 = ConsesLow.list( makeSymbol( "NEXT" ), makeSymbol( "VALID?" ) );
    $sym61$HL_STORE_ITERATOR_DESTROY_INT = makeSymbol( "HL-STORE-ITERATOR-DESTROY-INT" );
    $sym62$HL_STORE_BUFFERED_ITERATOR_DONE_ = makeSymbol( "HL-STORE-BUFFERED-ITERATOR-DONE?" );
    $sym63$HL_STORE_BUFFERED_ITERATOR_NEXT = makeSymbol( "HL-STORE-BUFFERED-ITERATOR-NEXT" );
    $sym64$HL_STORE_BUFFERED_ITERATOR_DESTROY = makeSymbol( "HL-STORE-BUFFERED-ITERATOR-DESTROY" );
    $list65 = ConsesLow.list( makeSymbol( "BUFFER" ), makeSymbol( "ID" ), makeSymbol( "N" ) );
    $sym66$HL_STORE_ITERATOR_NEXT_N_INT = makeSymbol( "HL-STORE-ITERATOR-NEXT-N-INT" );
    $sym67$_HL_TRANSCRIPT_STREAM_ = makeSymbol( "*HL-TRANSCRIPT-STREAM*" );
    $kw68$OUTPUT = makeKeyword( "OUTPUT" );
    $kw69$UNPROVIDED = makeKeyword( "UNPROVIDED" );
    $kw70$INPUT = makeKeyword( "INPUT" );
    $str71$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw72$EOF = makeKeyword( "EOF" );
  }

  public static final class $hl_store_iterator_doneP$UnaryFunction
      extends
        UnaryFunction
  {
    public $hl_store_iterator_doneP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HL-STORE-ITERATOR-DONE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return hl_store_iterator_doneP( arg1 );
    }
  }

  public static final class $hl_store_iterator_destroy$UnaryFunction
      extends
        UnaryFunction
  {
    public $hl_store_iterator_destroy$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HL-STORE-ITERATOR-DESTROY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return hl_store_iterator_destroy( arg1 );
    }
  }
}
/*
 * 
 * Total time: 298 ms
 * 
 */